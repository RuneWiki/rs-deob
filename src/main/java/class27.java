import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class27 implements class177 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private int field336 = -1;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field334;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "[F")
    private static float[] field337 = new float[4];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()V", line = 7)
    public final void method26() {
        if (this.field333 < 0) {
            return;
        }
        GL var1 = class67.field899;
        var1.glCallList(this.field333);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class271.field4059, (float) class189.field2610, (float) class236.field3351);
        var1.glRotatef(-((float) class259.field3820 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class150.field2069 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class69.field943) {
            var1.glBindTexture(3553, class69.field944[(int) ((float) (class67.field900 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class67.field900 == this.field336) {
            return;
        }
        int var2 = (class67.field900 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field334.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field334);
            var2 += 4;
        }
        if (class69.field943) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class67.field900 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field336 = class67.field900;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I", line = 51)
    public final int method25() {
        return 0;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V", line = 163)
    public class27() {
        if (this.field333 < 0 && class67.field909 && class67.field881 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class67.field899;
            var2.glGenProgramsARB(1, var1, 0);
            this.field335 = var1[0];
            int[][] var3 = class113.method830(0, 8, 0, false, 3, 256, 4, 64, 0.4F);
            int[][] var4 = class113.method830(8, 8, 0, false, 3, 256, 4, 64, 0.4F);
            class316 var5 = new class316(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class67.field916) {
                        var5.method2213(-1, (float) var7[var9] / 4096.0F);
                        var5.method2213(-1, (float) var8[var9] / 4096.0F);
                        var5.method2213(-1, 1.0F);
                        var5.method2213(-1, 1.0F);
                    } else {
                        var5.method2171(-1365938680, (float) var7[var9] / 4096.0F);
                        var5.method2171(-1365938680, (float) var8[var9] / 4096.0F);
                        var5.method2171(-1365938680, 1.0F);
                        var5.method2171(-1365938680, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field4777).order(ByteOrder.nativeOrder());
            var10.put(var5.field4798, 0, var5.field4777);
            var10.flip();
            this.field334 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method157();
            this.method156();
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V", line = 60)
    private final void method156() {
        if (this.field333 < 0) {
            return;
        }
        GL var1 = class67.field899;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field335);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V", line = 81)
    private final void method157() {
        GL var1 = class67.field899;
        this.field333 = var1.glGenLists(2);
        var1.glNewList(this.field333, 4864);
        var1.glActiveTexture(33985);
        if (class69.field943) {
            var1.glBindTexture(32879, class69.field948);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field335);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field333 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class69.field943 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 113)
    public final void method29(int arg0) {
        if (this.field333 < 0) {
            return;
        }
        GL var2 = class67.field899;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class69.field943 ? 32879 : 3553);
        } else {
            var2.glDisable(class69.field943 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field337, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field337, 0);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        int var3 = arg0 & 0x3;
        if (var3 == 2) {
            var2.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
        } else if (var3 == 3) {
            var2.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "()V", line = 148)
    public static void method158() {
        field337 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "()V", line = 155)
    public final void method30() {
        if (this.field333 >= 0) {
            GL var1 = class67.field899;
            var1.glCallList(this.field333 + 1);
        }
    }
}
