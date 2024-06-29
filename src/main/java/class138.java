import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class138 implements class21 {

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    private int field2320 = -1;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field2323 = -1;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2324;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "[F")
    private static float[] field2321 = new float[4];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "()V", line = 7)
    public final void method118() {
        if (this.field2323 < 0) {
            return;
        }
        GL var1 = class281.field4839;
        var1.glCallList(this.field2323);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glTranslatef((float) class258.field4388, (float) class224.field3751, (float) class276.field4738);
        var1.glRotatef(-((float) class213.field3641 * 360.0F) / 2048.0F, 0.0F, 1.0F, 0.0F);
        var1.glRotatef(-((float) class13.field180 * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
        var1.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var1.glMatrixMode(5888);
        if (!class86.field1391) {
            var1.glBindTexture(3553, class86.field1390[(int) ((float) (class281.field4810 * 64) * 0.005F) % 64]);
        }
        var1.glActiveTexture(33984);
        if (class281.field4810 == this.field2320) {
            return;
        }
        int var2 = (class281.field4810 & 0xFF) * 256;
        for (int var3 = 0; var3 < 64; var3++) {
            this.field2324.position(var2);
            var1.glProgramLocalParameter4fvARB(34336, var3, this.field2324);
            var2 += 4;
        }
        if (class86.field1391) {
            var1.glProgramLocalParameter4fARB(34336, 65, (float) class281.field4810 * 0.005F, 0.0F, 0.0F, 1.0F);
        } else {
            var1.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2320 = class281.field4810;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 51)
    public final void method119(int arg0) {
        if (this.field2323 < 0) {
            return;
        }
        GL var2 = class281.field4839;
        var2.glActiveTexture(33985);
        if ((arg0 & 0x80) == 0) {
            var2.glEnable(class86.field1391 ? 32879 : 3553);
        } else {
            var2.glDisable(class86.field1391 ? 32879 : 3553);
        }
        var2.glActiveTexture(33984);
        if ((arg0 & 0x40) == 0) {
            var2.glGetFloatv(2899, field2321, 0);
            var2.glProgramLocalParameter4fvARB(34336, 66, field2321, 0);
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

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "()V", line = 87)
    public static void method1035() {
        field2321 = null;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "()V", line = 91)
    private final void method1036() {
        GL var1 = class281.field4839;
        this.field2323 = var1.glGenLists(2);
        var1.glNewList(this.field2323, 4864);
        var1.glActiveTexture(33985);
        if (class86.field1391) {
            var1.glBindTexture(32879, class86.field1393);
        }
        var1.glTexEnvi(8960, 34161, 260);
        var1.glTexEnvi(8960, 34162, 7681);
        var1.glTexEnvi(8960, 34184, 34168);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, this.field2322);
        var1.glEnable(34336);
        var1.glEndList();
        var1.glNewList(this.field2323 + 1, 4864);
        var1.glActiveTexture(33985);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        var1.glTexEnvi(8960, 34161, 8448);
        var1.glTexEnvi(8960, 34162, 8448);
        var1.glTexEnvi(8960, 34184, 5890);
        var1.glDisable(class86.field1391 ? 32879 : 3553);
        var1.glActiveTexture(33984);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        var1.glEndList();
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "()V", line = 121)
    private final void method1037() {
        if (this.field2323 < 0) {
            return;
        }
        GL var1 = class281.field4839;
        int[] var2 = new int[1];
        var1.glBindProgramARB(34336, this.field2322);
        var1.glProgramStringARB(34336, 34933, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND".length(), "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
        var1.glGetIntegerv(34379, var2, 0);
        if (var2[0] != -1) {
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 167)
    public class138() {
        if (this.field2323 < 0 && class281.field4830 && class281.field4817 >= 2) {
            int[] var1 = new int[1];
            GL var2 = class281.field4839;
            var2.glGenProgramsARB(1, var1, 0);
            this.field2322 = var1[0];
            int[][] var3 = class120.method889(64, 3, 582, 0, 0.4F, 4, 8, 256, false);
            int[][] var4 = class120.method889(64, 3, 582, 8, 0.4F, 4, 8, 256, false);
            class70 var5 = new class70(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (class281.field4816) {
                        var5.method428((float) var7[var9] / 4096.0F, (byte) -123);
                        var5.method428((float) var8[var9] / 4096.0F, (byte) -125);
                        var5.method428(1.0F, (byte) -125);
                        var5.method428(1.0F, (byte) -121);
                    } else {
                        var5.method475((byte) -61, (float) var7[var9] / 4096.0F);
                        var5.method475((byte) -61, (float) var8[var9] / 4096.0F);
                        var5.method475((byte) -61, 1.0F);
                        var5.method475((byte) -61, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field1068).order(ByteOrder.nativeOrder());
            var10.put(var5.field1066, 0, var5.field1068);
            var10.flip();
            this.field2324 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1036();
            this.method1037();
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "()I", line = 148)
    public final int method117() {
        return 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "()V", line = 151)
    public final void method116() {
        if (this.field2323 >= 0) {
            GL var1 = class281.field4839;
            var1.glCallList(this.field2323 + 1);
        }
    }
}
