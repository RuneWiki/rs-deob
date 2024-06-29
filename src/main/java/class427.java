import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class427 extends class189 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "Lfs;")
    private class359 field5779;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lkd;")
    private class170 field5780;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field5784;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[F")
    private static float[] field5781 = new float[4];

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    private int field5782;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lrj;")
    private class388 field5783;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public final void method490(int arg0) {
        if (this.field5783 == null) {
            return;
        }
        this.field2580.method2067(1);
        if ((arg0 & 0x80) != 0) {
            this.field2580.method2106((class386) null);
        } else if (this.field5779.field4965) {
            this.field2580.method2106(this.field5779.field4964);
        } else {
            int var2 = this.field2580.field4625 % 4000 * 16 / 4000;
            this.field2580.method2106(this.field5779.field4962[var2]);
        }
        this.field2580.method2067(0);
        opengl var3 = this.field2580.field4604;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field5781, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field5781, 0);
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

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "()V")
    public final void method491() {
        if (this.field5783 != null) {
            this.field5783.method2381('\u0001');
            this.field2580.method2067(1);
            this.field2580.method2106((class386) null);
            this.field2580.method2067(0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "()Z")
    public final boolean method487() {
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "()V")
    private final void method2518() {
        opengl var1 = this.field2580.field4604;
        this.field5783 = new class388(this.field2580, 2);
        this.field5783.method2383(0);
        this.field2580.method2067(1);
        this.field2580.method1994(260, 7681);
        this.field2580.method2068(0, 34168, 770);
        this.field2580.method2067(0);
        var1.glBindProgramARB(34336, this.field5780.field2340);
        var1.glEnable(34336);
        this.field5783.method2382();
        this.field5783.method2383(1);
        this.field2580.method2067(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field2580.method1984(1);
        this.field2580.method2068(0, 5890, 770);
        this.field2580.method2067(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field5783.method2382();
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lbf;Lfs;)V")
    public class427(class344 arg0, class359 arg1) {
        super(arg0);
        this.field5779 = arg1;
        if (this.field2580.field4682 && this.field2580.field4665 >= 2) {
            this.field5780 = class170.method996(this.field2580, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field5780 == null) {
                return;
            }
            int[][] var3 = class15.method99(4, 3, false, 8, 0, 256, 0.4F, 64, 0);
            int[][] var4 = class15.method99(4, 3, false, 8, 8, 256, 0.4F, 64, 0);
            class399 var5 = new class399(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field2580.field4721) {
                        var5.method2422((float) var7[var9] / 4096.0F, 22553);
                        var5.method2422((float) var8[var9] / 4096.0F, 22553);
                        var5.method2422(1.0F, 22553);
                        var5.method2422(1.0F, 22553);
                    } else {
                        var5.method2421((float) var7[var9] / 4096.0F, -2062917296);
                        var5.method2421((float) var8[var9] / 4096.0F, -2062917296);
                        var5.method2421(1.0F, -2062917296);
                        var5.method2421(1.0F, -2062917296);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field456).order(ByteOrder.nativeOrder());
            var10.put(var5.field472, 0, var5.field456);
            var10.flip();
            this.field5784 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2518();
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
    public final void method486(boolean arg0) {
        if (this.field5783 == null) {
            return;
        }
        opengl var2 = this.field2580.field4604;
        this.field5783.method2381('\u0000');
        this.field2580.method2067(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field2580.field4645.method1033((byte) -39), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field2580.method2067(0);
        if (this.field2580.field4625 == this.field5782) {
            return;
        }
        int var3 = this.field2580.field4625 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field5784.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field5784);
            var4 += 4;
        }
        if (this.field5779.field4965) {
            float var6 = (float) (this.field2580.field4625 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field5782 = this.field2580.field4625;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lkq;)V")
    public final void method492(class386 arg0) {
        this.field2580.method2106(arg0);
    }
}
