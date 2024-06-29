import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class168 extends class30 {

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lvq;")
    private class326 field2398;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lsb;")
    private class207 field2400;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2403;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[F")
    private static float[] field2402 = new float[4];

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    private int field2401;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lp;")
    private class173 field2399;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
    public final void method261() {
        if (this.field2399 != null) {
            this.field2399.method1192('\u0001');
            this.field405.method1634(1);
            this.field405.method1653((class26) null);
            this.field405.method1634(0);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lap;)V")
    public final void method266(class26 arg0) {
        this.field405.method1653(arg0);
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public final void method264(int arg0) {
        if (this.field2399 == null) {
            return;
        }
        this.field405.method1634(1);
        if ((arg0 & 0x80) != 0) {
            this.field405.method1653((class26) null);
        } else if (this.field2398.field4880) {
            this.field405.method1653(this.field2398.field4883);
        } else {
            int var2 = this.field405.field3658 % 4000 * 16 / 4000;
            this.field405.method1653(this.field2398.field4879[var2]);
        }
        this.field405.method1634(0);
        opengl var3 = this.field405.field3648;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field2402, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field2402, 0);
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

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        if (this.field2399 == null) {
            return;
        }
        opengl var2 = this.field405.field3648;
        this.field2399.method1192('\u0000');
        this.field405.method1634(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field405.field3700.method660(-104), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field405.method1634(0);
        if (this.field405.field3658 == this.field2401) {
            return;
        }
        int var3 = this.field405.field3658 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field2403.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field2403);
            var4 += 4;
        }
        if (this.field2398.field4880) {
            float var6 = (float) (this.field405.field3658 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2401 = this.field405.field3658;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "()Z")
    public final boolean method262() {
        return true;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "()V")
    private final void method1170() {
        opengl var1 = this.field405.field3648;
        this.field2399 = new class173(this.field405, 2);
        this.field2399.method1191(0);
        this.field405.method1634(1);
        this.field405.method1679(260, 7681);
        this.field405.method1662(0, 34168, 770);
        this.field405.method1634(0);
        var1.glBindProgramARB(34336, this.field2400.field3126);
        var1.glEnable(34336);
        this.field2399.method1193();
        this.field2399.method1191(1);
        this.field405.method1634(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field405.method1636(1);
        this.field405.method1662(0, 5890, 770);
        this.field405.method1634(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field2399.method1193();
    }

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lnm;Lvq;)V")
    public class168(class254 arg0, class326 arg1) {
        super(arg0);
        this.field2398 = arg1;
        if (this.field405.field3712 && this.field405.field3763 >= 2) {
            this.field2400 = class207.method1404(this.field405, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field2400 == null) {
                return;
            }
            int[][] var3 = class347.method2141(64, (byte) -101, 3, false, 4, 256, 0, 0.4F, 8);
            int[][] var4 = class347.method2141(64, (byte) -84, 3, false, 4, 256, 8, 0.4F, 8);
            class292 var5 = new class292(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field405.field3742) {
                        var5.method1842((byte) -64, (float) var7[var9] / 4096.0F);
                        var5.method1842((byte) -64, (float) var8[var9] / 4096.0F);
                        var5.method1842((byte) -64, 1.0F);
                        var5.method1842((byte) -64, 1.0F);
                    } else {
                        var5.method1841((float) var7[var9] / 4096.0F, (byte) 65);
                        var5.method1841((float) var8[var9] / 4096.0F, (byte) 74);
                        var5.method1841(1.0F, (byte) 112);
                        var5.method1841(1.0F, (byte) -55);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field6315).order(ByteOrder.nativeOrder());
            var10.put(var5.field6316, 0, var5.field6315);
            var10.flip();
            this.field2403 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1170();
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V")
    public final void method263(boolean arg0) {
    }
}
