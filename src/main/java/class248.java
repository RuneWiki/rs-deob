import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class248 implements class38 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    private int field4007 = -1;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    private int field4010 = -1;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    private int field4006;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[F")
    private float[] field4008;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[F")
    private static float[] field4009 = new float[4];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V", line = 7)
    private final void method1610() {
        if (this.field4010 < 0) {
            return;
        }
        GL var1 = class264.field4313;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field4006);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V", line = 27)
    public static void method1611() {
        field4009 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I", line = 30)
    public final int method296() {
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V", line = 38)
    private final void method1612() {
        GL var1 = class264.field4313;
        this.field4010 = var1.glGenLists(2);
        var1.glNewList(this.field4010, 4864);
        var1.glActiveTexture(33985);
        if (class136.field2197) {
            var1.glBindTexture(32879, class136.field2203);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field4006);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field4010 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class136.field2197 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 162)
    public class248() {
        if (this.field4010 < 0 && class264.field4300 && class264.field4308 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class264.field4313;
            var2.glGenProgramsARB(1, var1, 0);
            this.field4006 = var1[0];
            int[][] var3 = class295.method1968(4, 64, 8, 3, 0, 256, 0.4F, true, false);
            int[][] var4 = class295.method1968(4, 64, 8, 3, 8, 256, 0.4F, true, false);
            this.field4008 = new float[32768];
            int var5 = 0;
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    this.field4008[var5++] = (float) var7[var9] / 4096.0F;
                    this.field4008[var5++] = (float) var8[var9] / 4096.0F;
                }
            }
            this.method1612();
            this.method1610();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 78)
    public final void method294(int arg0) {
        if (this.field4010 < 0) {
            return;
        }
        GL var2 = class264.field4313;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class136.field2197 ? 32879 : 3553);
        } else {
            var2.glDisable(class136.field2197 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field4009, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field4009, 0);
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

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V", line = 113)
    public final void method293() {
        if (this.field4010 >= 0) {
            GL var1 = class264.field4313;
            var1.glCallList(this.field4010 + 1);
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()V", line = 121)
    public final void method295() {
        if (this.field4010 < 0) {
            return;
        }
        GL var1 = class264.field4313;
        var1.glCallList(this.field4010);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class254.field4089, (float) class81.field1233, (float) class164.field2589);
        var1.glRotatef(-((float) class297.field5008 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class270.field4458 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class136.field2197) {
            var1.glBindTexture(3553, class136.field2198[(int) ((float) (class264.field4319 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class264.field4319 == this.field4007) {
            return;
        }
        int var2 = (class264.field4319 & 0xFF) * 128;
        for (int var3 = 0; var3 < 64; var3++) {
            var1.glProgramLocalParameter4fARB(34336, var3, this.field4008[var2++], this.field4008[var2++], 1.0F, 1.0F);
        }
        if (class136.field2197) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class264.field4319 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4007 = class264.field4319;
    }
}
