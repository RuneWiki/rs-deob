import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class252 extends class157 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Lcf;")
    private class142 field3418;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Lbh;")
    private class11 field3423;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field3421;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "[F")
    private static float[] field3419 = new float[4];

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    private int field3420;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lq;")
    private class205 field3422;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lvd;)V")
    public final void method557(class4 arg0) {
        this.field2366.method207(arg0);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
    public final void method554(boolean arg0) {
        if (this.field3422 == null) {
            return;
        }
        opengl var2 = this.field2366.field198;
        this.field3422.method1427('\u0000');
        this.field2366.method176(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field2366.field256.method314((byte) -117), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field2366.method176(0);
        if (this.field2366.field210 == this.field3420) {
            return;
        }
        int var3 = this.field2366.field210 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field3421.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field3421);
            var4 += 4;
        }
        if (this.field3418.field2144) {
            float var6 = (float) (this.field2366.field210 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field3420 = this.field2366.field210;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    public final void method556(boolean arg0) {
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()V")
    private final void method1631() {
        opengl var1 = this.field2366.field198;
        this.field3422 = new class205(this.field2366, 2);
        this.field3422.method1426(0);
        this.field2366.method176(1);
        this.field2366.method145(260, 7681);
        this.field2366.method223(0, 34168, 770);
        this.field2366.method176(0);
        var1.glBindProgramARB(34336, this.field3423.field85);
        var1.glEnable(34336);
        this.field3422.method1425();
        this.field3422.method1426(1);
        this.field2366.method176(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field2366.method159(1);
        this.field2366.method223(0, 5890, 770);
        this.field2366.method176(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field3422.method1425();
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()V")
    public final void method552() {
        if (this.field3422 != null) {
            this.field3422.method1427('\u0001');
            this.field2366.method176(1);
            this.field2366.method207((class4) null);
            this.field2366.method176(0);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()Z")
    public final boolean method555() {
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lhd;Lcf;)V")
    public class252(class17 arg0, class142 arg1) {
        super(arg0);
        this.field3418 = arg1;
        if (this.field2366.field251 && this.field2366.field261 >= 2) {
            this.field3423 = class11.method58(this.field2366, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field3423 == null) {
                return;
            }
            int[][] var3 = class101.method862(8, 0.4F, (byte) 127, 4, 3, 0, 256, 64, false);
            int[][] var4 = class101.method862(8, 0.4F, (byte) 127, 4, 3, 8, 256, 64, false);
            class45 var5 = new class45(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field2366.field292) {
                        var5.method414((float) var7[var9] / 4096.0F, 51);
                        var5.method414((float) var8[var9] / 4096.0F, -19);
                        var5.method414(1.0F, -111);
                        var5.method414(1.0F, 56);
                    } else {
                        var5.method415((float) var7[var9] / 4096.0F, false);
                        var5.method415((float) var8[var9] / 4096.0F, false);
                        var5.method415(1.0F, false);
                        var5.method415(1.0F, false);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3938).order(ByteOrder.nativeOrder());
            var10.put(var5.field3882, 0, var5.field3938);
            var10.flip();
            this.field3421 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1631();
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public final void method553(int arg0) {
        if (this.field3422 == null) {
            return;
        }
        this.field2366.method176(1);
        if ((arg0 & 0x80) != 0) {
            this.field2366.method207((class4) null);
        } else if (this.field3418.field2144) {
            this.field2366.method207(this.field3418.field2147);
        } else {
            int var2 = this.field2366.field210 % 4000 * 16 / 4000;
            this.field2366.method207(this.field3418.field2150[var2]);
        }
        this.field2366.method176(0);
        opengl var3 = this.field2366.field198;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field3419, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field3419, 0);
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
}
