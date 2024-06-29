import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class8 extends class457 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "Lle;")
    private class68 field106;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Ldr;")
    private class220 field110;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field108;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[F")
    private static float[] field111 = new float[4];

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lhd;")
    private class19 field109;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
        if (this.field109 == null) {
            return;
        }
        this.field6752.method1150(1);
        if ((arg0 & 0x80) != 0) {
            this.field6752.method1160((class205) null);
        } else if (this.field106.field904) {
            this.field6752.method1160(this.field106.field900);
        } else {
            int var2 = this.field6752.field2276 % 4000 * 16 / 4000;
            this.field6752.method1160(this.field106.field901[var2]);
        }
        this.field6752.method1150(0);
        opengl var3 = this.field6752.field2253;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field111, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field111, 0);
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

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field109 == null) {
            return;
        }
        opengl var2 = this.field6752.field2253;
        this.field109.method235('\u0000');
        this.field6752.method1150(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field6752.field2358.method2639(false), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field6752.method1150(0);
        if (this.field6752.field2276 == this.field107) {
            return;
        }
        int var3 = this.field6752.field2276 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field108.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field108);
            var4 += 4;
        }
        if (this.field106.field904) {
            float var6 = (float) (this.field6752.field2276 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field107 = this.field6752.field2276;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lks;Lle;)V")
    public class8(class173 arg0, class68 arg1) {
        super(arg0);
        this.field106 = arg1;
        if (this.field6752.field2315 && this.field6752.field2291 >= 2) {
            this.field110 = class220.method1521(this.field6752, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field110 == null) {
                return;
            }
            int[][] var3 = class326.method2130(0.4F, false, 256, 3, 8, 0, 4, 64, 3072);
            int[][] var4 = class326.method2130(0.4F, false, 256, 3, 8, 8, 4, 64, 3072);
            class49 var5 = new class49(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field6752.field2296) {
                        var5.method389(-87, (float) var7[var9] / 4096.0F);
                        var5.method389(-107, (float) var8[var9] / 4096.0F);
                        var5.method389(-109, 1.0F);
                        var5.method389(56, 1.0F);
                    } else {
                        var5.method388((byte) 56, (float) var7[var9] / 4096.0F);
                        var5.method388((byte) 56, (float) var8[var9] / 4096.0F);
                        var5.method388((byte) 56, 1.0F);
                        var5.method388((byte) 56, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3762).order(ByteOrder.nativeOrder());
            var10.put(var5.field3764, 0, var5.field3762);
            var10.flip();
            this.field108 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method66();
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V")
    public final void method62(boolean arg0) {
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lvo;)V")
    public final void method63(class205 arg0) {
        this.field6752.method1160(arg0);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()V")
    public final void method64() {
        if (this.field109 != null) {
            this.field109.method235('\u0001');
            this.field6752.method1150(1);
            this.field6752.method1160((class205) null);
            this.field6752.method1150(0);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()Z")
    public final boolean method65() {
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
    private final void method66() {
        opengl var1 = this.field6752.field2253;
        this.field109 = new class19(this.field6752, 2);
        this.field109.method233(0);
        this.field6752.method1150(1);
        this.field6752.method1161(260, 7681);
        this.field6752.method1176(0, 34168, 770);
        this.field6752.method1150(0);
        var1.glBindProgramARB(34336, this.field110.field3192);
        var1.glEnable(34336);
        this.field109.method234();
        this.field109.method233(1);
        this.field6752.method1150(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field6752.method1143(1);
        this.field6752.method1176(0, 5890, 770);
        this.field6752.method1150(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field109.method234();
    }
}
