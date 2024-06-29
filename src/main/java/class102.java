import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class102 implements class70 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    private int field1323 = -1;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    private int field1324 = -1;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    private int field1325;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field1326;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[F")
    private static float[] field1322 = new float[4];

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()V", line = 8)
    public static void method604() {
        field1322 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 167)
    public class102() {
        if (this.field1323 < 0 && class250.field3793 && class250.field3801 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class250.field3818;
            var2.glGenProgramsARB(1, var1, 0);
            this.field1325 = var1[0];
            int[][] var3 = class301.method2122(64, 8, 0, 3, 4, false, true, 0.4F, 256);
            int[][] var4 = class301.method2122(64, 8, 8, 3, 4, false, true, 0.4F, 256);
            class107 var5 = new class107(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class250.field3825) {
                        var5.method673(32166, (float) var7[var9] / 4096.0F);
                        var5.method673(32166, (float) var8[var9] / 4096.0F);
                        var5.method673(32166, 1.0F);
                        var5.method673(32166, 1.0F);
                    } else {
                        var5.method682(-104, (float) var7[var9] / 4096.0F);
                        var5.method682(-126, (float) var8[var9] / 4096.0F);
                        var5.method682(104, 1.0F);
                        var5.method682(-90, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field1400).order(ByteOrder.nativeOrder());
            var10.put(var5.field1388, 0, var5.field1400);
            var10.flip();
            this.field1326 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method605();
            this.method606();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 16)
    public final void method14(int arg0) {
        if (this.field1323 < 0) {
            return;
        }
        GL var2 = class250.field3818;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class246.field3723 ? 32879 : 3553);
        } else {
            var2.glDisable(class246.field3723 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field1322, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field1322, 0);
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

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()V", line = 53)
    private final void method605() {
        GL var1 = class250.field3818;
        this.field1323 = var1.glGenLists(2);
        var1.glNewList(this.field1323, 4864);
        var1.glActiveTexture(33985);
        if (class246.field3723) {
            var1.glBindTexture(32879, class246.field3724);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field1325);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field1323 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class246.field3723 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "()V", line = 83)
    private final void method606() {
        if (this.field1323 < 0) {
            return;
        }
        GL var1 = class250.field3818;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field1325);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()V", line = 103)
    public final void method15() {
        if (this.field1323 >= 0) {
            GL var1 = class250.field3818;
            var1.glCallList(this.field1323 + 1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()I", line = 112)
    public final int method16() {
        return 0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 118)
    public final void method17() {
        if (this.field1323 < 0) {
            return;
        }
        GL var1 = class250.field3818;
        var1.glCallList(this.field1323);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class329.field5020, (float) class261.field3955, (float) class166.field2296);
        var1.glRotatef(-((float) class230.field3362 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class319.field4906 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class246.field3723) {
            var1.glBindTexture(3553, class246.field3721[(int) ((float) (class250.field3796 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class250.field3796 == this.field1324) {
            return;
        }
        int var2 = (class250.field3796 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field1326.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field1326);
            var2 += 4;
        }
        if (class246.field3723) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class250.field3796 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field1324 = class250.field3796;
    }
}
