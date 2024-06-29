import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class10 implements class147 {

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    private int field356 = -1;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    private int field360 = -1;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field358;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "[F")
    private static float[] field359 = new float[4];

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "()V", line = 7)
    private final void method70() {
        if (this.field356 < 0) {
            return;
        }
        GL var1 = class97.field1801;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field357);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "()V", line = 30)
    private final void method71() {
        GL var1 = class97.field1801;
        this.field356 = var1.glGenLists(2);
        var1.glNewList(this.field356, 4864);
        var1.glActiveTexture(33985);
        if (class129.field2358) {
            var1.glBindTexture(32879, class129.field2357);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field357);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field356 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class129.field2358 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V", line = 167)
    public class10() {
        if (this.field356 < 0 && class97.field1813 && class97.field1821 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class97.field1801;
            var2.glGenProgramsARB(1, var1, 0);
            this.field357 = var1[0];
            int[][] var3 = class254.method1819(256, 4, 3, 0.4F, 0, 8, 120, false, 64);
            int[][] var4 = class254.method1819(256, 4, 3, 0.4F, 8, 8, 107, false, 64);
            class53 var5 = new class53(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class97.field1808) {
                        var5.method451((byte) 108, (float) var7[var9] / 4096.0F);
                        var5.method451((byte) -128, (float) var8[var9] / 4096.0F);
                        var5.method451((byte) -128, 1.0F);
                        var5.method451((byte) -109, 1.0F);
                    } else {
                        var5.method459(false, (float) var7[var9] / 4096.0F);
                        var5.method459(false, (float) var8[var9] / 4096.0F);
                        var5.method459(false, 1.0F);
                        var5.method459(false, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field1142).order(ByteOrder.nativeOrder());
            var10.put(var5.field1168, 0, var5.field1142);
            var10.flip();
            this.field358 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method71();
            this.method70();
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()I", line = 63)
    public final int method72() {
        return 0;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "()V", line = 66)
    public final void method73() {
        if (this.field356 >= 0) {
            GL var1 = class97.field1801;
            var1.glCallList(this.field356 + 1);
        }
    }

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "()V", line = 74)
    public static void method74() {
        field359 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 78)
    public final void method75(int arg0) {
        if (this.field356 < 0) {
            return;
        }
        GL var2 = class97.field1801;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class129.field2358 ? 32879 : 3553);
        } else {
            var2.glDisable(class129.field2358 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field359, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field359, 0);
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

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V", line = 114)
    public final void method76() {
        if (this.field356 < 0) {
            return;
        }
        GL var1 = class97.field1801;
        var1.glCallList(this.field356);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class143.field2601, (float) class101.field1891, (float) class170.field3077);
        var1.glRotatef(-((float) class268.field4810 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class260.field4627 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class129.field2358) {
            var1.glBindTexture(3553, class129.field2356[(int) ((float) (class97.field1816 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class97.field1816 == this.field360) {
            return;
        }
        int var2 = (class97.field1816 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field358.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field358);
            var2 += 4;
        }
        if (class129.field2358) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class97.field1816 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field360 = class97.field1816;
    }
}
