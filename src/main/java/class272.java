import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class272 implements class87 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    private int field4723 = -1;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    private int field4727 = -1;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    private int field4725;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field4726;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[F")
    private static float[] field4724 = new float[4];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 7)
    public final void method503(int arg0) {
        if (this.field4727 < 0) {
            return;
        }
        GL var2 = class247.field4253;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class179.field3142 ? 32879 : 3553);
        } else {
            var2.glDisable(class179.field3142 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field4724, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field4724, 0);
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

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 42)
    public final void method502() {
        if (this.field4727 >= 0) {
            GL var1 = class247.field4253;
            var1.glCallList(this.field4727 + 1);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "()V", line = 52)
    public static void method1912() {
        field4724 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 167)
    public class272() {
        if (this.field4727 < 0 && class247.field4252 && class247.field4239 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class247.field4253;
            var2.glGenProgramsARB(1, var1, 0);
            this.field4725 = var1[0];
            int[][] var3 = class228.method1563(0.4F, 256, -28807, 8, 64, 0, 3, false, 4);
            int[][] var4 = class228.method1563(0.4F, 256, -28807, 8, 64, 8, 3, false, 4);
            class194 var5 = new class194(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class247.field4235) {
                        var5.method1328(24180, (float) var7[var9] / 4096.0F);
                        var5.method1328(24180, (float) var8[var9] / 4096.0F);
                        var5.method1328(24180, 1.0F);
                        var5.method1328(24180, 1.0F);
                    } else {
                        var5.method1302((float) var7[var9] / 4096.0F, -550459832);
                        var5.method1302((float) var8[var9] / 4096.0F, -550459832);
                        var5.method1302(1.0F, -550459832);
                        var5.method1302(1.0F, -550459832);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3380).order(ByteOrder.nativeOrder());
            var10.put(var5.field3417, 0, var5.field3380);
            var10.flip();
            this.field4726 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1913();
            this.method1914();
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "()V", line = 61)
    private final void method1913() {
        GL var1 = class247.field4253;
        this.field4727 = var1.glGenLists(2);
        var1.glNewList(this.field4727, 4864);
        var1.glActiveTexture(33985);
        if (class179.field3142) {
            var1.glBindTexture(32879, class179.field3143);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field4725);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field4727 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class179.field3142 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()V", line = 92)
    public final void method501() {
        if (this.field4727 < 0) {
            return;
        }
        GL var1 = class247.field4253;
        var1.glCallList(this.field4727);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class57.field1099, (float) class146.field2508, (float) class245.field4176);
        var1.glRotatef(-((float) class254.field4380 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class6.field130 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class179.field3142) {
            var1.glBindTexture(3553, class179.field3139[(int) ((float) (class247.field4243 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class247.field4243 == this.field4723) {
            return;
        }
        int var2 = (class247.field4243 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field4726.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field4726);
            var2 += 4;
        }
        if (class179.field3142) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class247.field4243 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4723 = class247.field4243;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()I", line = 136)
    public final int method499() {
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "()V", line = 142)
    private final void method1914() {
        if (this.field4727 < 0) {
            return;
        }
        GL var1 = class247.field4253;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field4725);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }
}
