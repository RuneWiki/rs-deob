import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class287 extends class232 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lrl;")
    private class430 field4041;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lsq;")
    private class97 field4038;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field4039;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[F")
    private static float[] field4042 = new float[4];

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lbb;")
    private class182 field4043;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V", line = 8)
    public final void method354(boolean arg0) {
        if (this.field4043 == null) {
            return;
        }
        opengl var2 = this.field3348.field3184;
        this.field4043.method1193('\u0000');
        this.field3348.method1566(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field3348.field3213.method2082(-4061), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field3348.method1566(0);
        if (this.field3348.field3204 == this.field4040) {
            return;
        }
        int var3 = this.field3348.field3204 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field4039.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field4039);
            var4 += 4;
        }
        if (this.field4041.field6082) {
            float var6 = (float) (this.field3348.field3204 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4040 = this.field3348.field3204;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "()V", line = 54)
    public final void method352() {
        if (this.field4043 != null) {
            this.field4043.method1193('\u0001');
            this.field3348.method1566(1);
            this.field3348.method1559((class127) null);
            this.field3348.method1566(0);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lue;)V", line = 63)
    public final void method356(class127 arg0) {
        this.field3348.method1559(arg0);
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Ltb;Lrl;)V", line = 66)
    public class287(class227 arg0, class430 arg1) {
        super(arg0);
        this.field4041 = arg1;
        if (this.field3348.field3237 && this.field3348.field3261 >= 2) {
            this.field4038 = class97.method705(this.field3348, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field4038 == null) {
                return;
            }
            int[][] var3 = class94.method669(3, 8, (byte) 78, 64, 0.4F, 0, 256, false, 4);
            int[][] var4 = class94.method669(3, 8, (byte) 78, 64, 0.4F, 8, 256, false, 4);
            class6 var5 = new class6(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field3348.field3229) {
                        var5.method36(true, (float) var7[var9] / 4096.0F);
                        var5.method36(true, (float) var8[var9] / 4096.0F);
                        var5.method36(true, 1.0F);
                        var5.method36(true, 1.0F);
                    } else {
                        var5.method37(-1923362568, (float) var7[var9] / 4096.0F);
                        var5.method37(-1923362568, (float) var8[var9] / 4096.0F);
                        var5.method37(-1923362568, 1.0F);
                        var5.method37(-1923362568, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field191).order(ByteOrder.nativeOrder());
            var10.put(var5.field230, 0, var5.field191);
            var10.flip();
            this.field4039 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1873();
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 126)
    public final void method355(int arg0) {
        if (this.field4043 == null) {
            return;
        }
        this.field3348.method1566(1);
        if ((arg0 & 0x80) != 0) {
            this.field3348.method1559((class127) null);
        } else if (this.field4041.field6082) {
            this.field3348.method1559(this.field4041.field6079);
        } else {
            int var2 = this.field3348.field3204 % 4000 * 16 / 4000;
            this.field3348.method1559(this.field4041.field6080[var2]);
        }
        this.field3348.method1566(0);
        opengl var3 = this.field3348.field3184;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field4042, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field4042, 0);
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()Z", line = 169)
    public final boolean method358() {
        return true;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 174)
    public final void method357(boolean arg0) {
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "()V", line = 178)
    private final void method1873() {
        opengl var1 = this.field3348.field3184;
        this.field4043 = new class182(this.field3348, 2);
        this.field4043.method1192(0);
        this.field3348.method1566(1);
        this.field3348.method1542(260, 7681);
        this.field3348.method1572(0, 34168, 770);
        this.field3348.method1566(0);
        var1.glBindProgramARB(34336, this.field4038.field1350);
        var1.glEnable(34336);
        this.field4043.method1191();
        this.field4043.method1192(1);
        this.field3348.method1566(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field3348.method1569(1);
        this.field3348.method1572(0, 5890, 770);
        this.field3348.method1566(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field4043.method1191();
    }
}
