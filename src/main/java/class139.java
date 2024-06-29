import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class139 implements class2 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    private int field2107 = -1;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    private int field2109 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    private int field2110;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2108;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "[F")
    private static float[] field2111 = new float[4];

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 7)
    public static void method1004() {
        field2111 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()I", line = 10)
    public final int method2() {
        return 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 13)
    public final void method3(int arg0) {
        if (this.field2109 < 0) {
            return;
        }
        GL var2 = class117.field1801;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class133.field2039 ? 32879 : 3553);
        } else {
            var2.glDisable(class133.field2039 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field2111, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field2111, 0);
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

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V", line = 48)
    public final void method4() {
        if (this.field2109 < 0) {
            return;
        }
        GL var1 = class117.field1801;
        var1.glCallList(this.field2109);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class287.field4340, (float) class124.field1932, (float) class107.field1671);
        var1.glRotatef(-((float) class200.field2993 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class250.field3732 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class133.field2039) {
            var1.glBindTexture(3553, class133.field2041[(int) ((float) (class117.field1818 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class117.field1818 == this.field2107) {
            return;
        }
        int var2 = (class117.field1818 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field2108.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field2108);
            var2 += 4;
        }
        if (class133.field2039) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class117.field1818 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2107 = class117.field1818;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "()V", line = 97)
    private final void method1005() {
        GL var1 = class117.field1801;
        this.field2109 = var1.glGenLists(2);
        var1.glNewList(this.field2109, 4864);
        var1.glActiveTexture(33985);
        if (class133.field2039) {
            var1.glBindTexture(32879, class133.field2040);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field2110);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field2109 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class133.field2039 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 127)
    public final void method1() {
        if (this.field2109 >= 0) {
            GL var1 = class117.field1801;
            var1.glCallList(this.field2109 + 1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "()V", line = 138)
    private final void method1006() {
        if (this.field2109 < 0) {
            return;
        }
        GL var1 = class117.field1801;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field2110);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 164)
    public class139() {
        if (this.field2109 < 0 && class117.field1790 && class117.field1799 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class117.field1801;
            var2.glGenProgramsARB(1, var1, 0);
            this.field2110 = var1[0];
            int[][] var3 = class9.method42(4, 0, 0.4F, 256, 64, 8, false, 3, 0);
            int[][] var4 = class9.method42(4, 8, 0.4F, 256, 64, 8, false, 3, 0);
            class263 var5 = new class263(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class117.field1811) {
                        var5.method1811((float) var7[var9] / 4096.0F, false);
                        var5.method1811((float) var8[var9] / 4096.0F, false);
                        var5.method1811(1.0F, false);
                        var5.method1811(1.0F, false);
                    } else {
                        var5.method1821((float) var7[var9] / 4096.0F, -109);
                        var5.method1821((float) var8[var9] / 4096.0F, -125);
                        var5.method1821(1.0F, -118);
                        var5.method1821(1.0F, -121);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field4025).order(ByteOrder.nativeOrder());
            var10.put(var5.field3986, 0, var5.field4025);
            var10.flip();
            this.field2108 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1005();
            this.method1006();
        }
    }
}
