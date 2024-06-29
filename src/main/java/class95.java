import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class95 extends class300 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Lmk;")
    private class154 field1489;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lad;")
    private class400 field1490;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field1488;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[F")
    private static float[] field1491 = new float[4];

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    private int field1493;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Lfr;")
    private class101 field1492;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lmo;)V")
    public final void method9(class195 arg0) {
        this.field4409.method929(arg0);
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "()V")
    public final void method5() {
        if (this.field1492 != null) {
            this.field1492.method836('\u0001');
            this.field4409.method857(1);
            this.field4409.method929((class195) null);
            this.field4409.method857(0);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public final void method6(boolean arg0) {
        if (this.field1492 == null) {
            return;
        }
        opengl var2 = this.field4409.field1604;
        this.field1492.method836('\u0000');
        this.field4409.method857(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field4409.field1688.method2442((byte) -128), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field4409.method857(0);
        if (this.field4409.field1614 == this.field1493) {
            return;
        }
        int var3 = this.field4409.field1614 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1488.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field1488);
            var4 += 4;
        }
        if (this.field1489.field2351) {
            float var6 = (float) (this.field4409.field1614 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field1493 = this.field4409.field1614;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lge;Lmk;)V")
    public class95(class104 arg0, class154 arg1) {
        super(arg0);
        this.field1489 = arg1;
        if (this.field4409.field1677 && this.field4409.field1733 >= 2) {
            this.field1490 = class400.method2547(this.field4409, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field1490 == null) {
                return;
            }
            int[][] var3 = class161.method1256(4, (byte) -11, 3, 8, 0, 256, false, 0.4F, 64);
            int[][] var4 = class161.method1256(4, (byte) -11, 3, 8, 8, 256, false, 0.4F, 64);
            class118 var5 = new class118(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field4409.field1727) {
                        var5.method997((byte) -75, (float) var7[var9] / 4096.0F);
                        var5.method997((byte) -75, (float) var8[var9] / 4096.0F);
                        var5.method997((byte) -75, 1.0F);
                        var5.method997((byte) -75, 1.0F);
                    } else {
                        var5.method998((byte) -118, (float) var7[var9] / 4096.0F);
                        var5.method998((byte) 87, (float) var8[var9] / 4096.0F);
                        var5.method998((byte) -99, 1.0F);
                        var5.method998((byte) -65, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field565).order(ByteOrder.nativeOrder());
            var10.put(var5.field578, 0, var5.field565);
            var10.flip();
            this.field1488 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method792();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (this.field1492 == null) {
            return;
        }
        this.field4409.method857(1);
        if ((arg0 & 0x80) != 0) {
            this.field4409.method929((class195) null);
        } else if (this.field1489.field2351) {
            this.field4409.method929(this.field1489.field2355);
        } else {
            int var2 = this.field4409.field1614 % 4000 * 16 / 4000;
            this.field4409.method929(this.field1489.field2349[var2]);
        }
        this.field4409.method857(0);
        opengl var3 = this.field4409.field1604;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field1491, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field1491, 0);
        } else {
            var3.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        int var4 = arg0 & 0x3;
        if (var4 == 2) {
            var3.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
        } else if (var4 == 3) {
            var3.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
        } else {
            var3.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
    private final void method792() {
        opengl var1 = this.field4409.field1604;
        this.field1492 = new class101(this.field4409, 2);
        this.field1492.method835(0);
        this.field4409.method857(1);
        this.field4409.method870(260, 7681);
        this.field4409.method889(0, 34168, 770);
        this.field4409.method857(0);
        var1.glBindProgramARB(34336, this.field1490.field5874);
        var1.glEnable(34336);
        this.field1492.method834();
        this.field1492.method835(1);
        this.field4409.method857(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field4409.method884(1);
        this.field4409.method889(0, 5890, 770);
        this.field4409.method857(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field1492.method834();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
    public final void method7(boolean arg0) {
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()Z")
    public final boolean method4() {
        return true;
    }
}
