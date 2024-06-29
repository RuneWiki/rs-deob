import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class75 implements class173 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    private int field1013 = -1;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    private int field1015 = -1;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    private int field1016;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field1012;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "[F")
    private static float[] field1014 = new float[4];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()I", line = 11)
    public final int method352() {
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 167)
    public class75() {
        if (this.field1015 < 0 && class109.field1486 && class109.field1489 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class109.field1456;
            var2.glGenProgramsARB(1, var1, 0);
            this.field1016 = var1[0];
            int[][] var3 = class135.method987(256, 8, 64, 3, 0.4F, 18324, false, 0, 4);
            int[][] var4 = class135.method987(256, 8, 64, 3, 0.4F, 18324, false, 8, 4);
            class6 var5 = new class6(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class109.field1464) {
                        var5.method36((float) var7[var9] / 4096.0F, (byte) 119);
                        var5.method36((float) var8[var9] / 4096.0F, (byte) 126);
                        var5.method36(1.0F, (byte) 123);
                        var5.method36(1.0F, (byte) 121);
                    } else {
                        var5.method91((float) var7[var9] / 4096.0F, -211870840);
                        var5.method91((float) var8[var9] / 4096.0F, -211870840);
                        var5.method91(1.0F, -211870840);
                        var5.method91(1.0F, -211870840);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field111).order(ByteOrder.nativeOrder());
            var10.put(var5.field115, 0, var5.field111);
            var10.flip();
            this.field1012 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method567();
            this.method565();
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()V", line = 19)
    private final void method565() {
        if (this.field1015 < 0) {
            return;
        }
        GL var1 = class109.field1456;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field1016);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()V", line = 39)
    public final void method354() {
        if (this.field1015 < 0) {
            return;
        }
        GL var1 = class109.field1456;
        var1.glCallList(this.field1015);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class327.field5129, (float) class15.field258, (float) class235.field3668);
        var1.glRotatef(-((float) class179.field2918 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class339.field5296 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class148.field2325) {
            var1.glBindTexture(3553, class148.field2327[(int) ((float) (class109.field1472 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class109.field1472 == this.field1013) {
            return;
        }
        int var2 = (class109.field1472 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1012.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field1012);
            var2 += 4;
        }
        if (class148.field2325) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class109.field1472 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field1013 = class109.field1472;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 83)
    public final void method353(int arg0) {
        if (this.field1015 < 0) {
            return;
        }
        GL var2 = class109.field1456;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class148.field2325 ? 32879 : 3553);
        } else {
            var2.glDisable(class148.field2325 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field1014, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field1014, 0);
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

    @OriginalMember(owner = "client!c", name = "e", descriptor = "()V", line = 118)
    public static void method566() {
        field1014 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()V", line = 125)
    public final void method355() {
        if (this.field1015 >= 0) {
            GL var1 = class109.field1456;
            var1.glCallList(this.field1015 + 1);
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "()V", line = 134)
    private final void method567() {
        GL var1 = class109.field1456;
        this.field1015 = var1.glGenLists(2);
        var1.glNewList(this.field1015, 4864);
        var1.glActiveTexture(33985);
        if (class148.field2325) {
            var1.glBindTexture(32879, class148.field2330);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field1016);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field1015 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class148.field2325 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }
}
