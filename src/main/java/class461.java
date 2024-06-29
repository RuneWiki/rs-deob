import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class461 extends class331 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lmb;")
    private class158 field6463;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Laj;")
    private class188 field6462;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field6460;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "[F")
    private static float[] field6461 = new float[4];

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private int field6464;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lma;")
    private class10 field6465;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lbl;)V")
    public final void method817(class425 arg0) {
        this.field4787.method1967(arg0);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "()V")
    public final void method816() {
        if (this.field6465 != null) {
            this.field6465.method37('\u0001');
            this.field4787.method1972(1);
            this.field4787.method1967((class425) null);
            this.field4787.method1972(0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lmi;Lmb;)V")
    public class461(class315 arg0, class158 arg1) {
        super(arg0);
        this.field6463 = arg1;
        if (this.field4787.field4563 && this.field4787.field4480 >= 2) {
            this.field6462 = class188.method1169(this.field4787, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field6462 == null) {
                return;
            }
            int[][] var3 = class1.method2(3, 8, 4, 64, (byte) -102, false, 256, 0, 0.4F);
            int[][] var4 = class1.method2(3, 8, 4, 64, (byte) -102, false, 256, 8, 0.4F);
            class60 var5 = new class60(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field4787.field4514) {
                        var5.method374((float) var7[var9] / 4096.0F, (byte) -76);
                        var5.method374((float) var8[var9] / 4096.0F, (byte) -64);
                        var5.method374(1.0F, (byte) -68);
                        var5.method374(1.0F, (byte) -126);
                    } else {
                        var5.method373(-117, (float) var7[var9] / 4096.0F);
                        var5.method373(-114, (float) var8[var9] / 4096.0F);
                        var5.method373(-120, 1.0F);
                        var5.method373(-112, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field4021).order(ByteOrder.nativeOrder());
            var10.put(var5.field4064, 0, var5.field4021);
            var10.flip();
            this.field6460 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2701();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()Z")
    public final boolean method812() {
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "()V")
    private final void method2701() {
        opengl var1 = this.field4787.field4445;
        this.field6465 = new class10(this.field4787, 2);
        this.field6465.method39(0);
        this.field4787.method1972(1);
        this.field4787.method1992(260, 7681);
        this.field4787.method2017(0, 34168, 770);
        this.field4787.method1972(0);
        var1.glBindProgramARB(34336, this.field6462.field2809);
        var1.glEnable(34336);
        this.field6465.method38();
        this.field6465.method39(1);
        this.field4787.method1972(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field4787.method1962(1);
        this.field4787.method2017(0, 5890, 770);
        this.field4787.method1972(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field6465.method38();
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public final void method813(boolean arg0) {
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public final void method811(boolean arg0) {
        if (this.field6465 == null) {
            return;
        }
        opengl var2 = this.field4787.field4445;
        this.field6465.method37('\u0000');
        this.field4787.method1972(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field4787.field4523.method2044(1), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field4787.method1972(0);
        if (this.field4787.field4458 == this.field6464) {
            return;
        }
        int var3 = this.field4787.field4458 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field6460.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field6460);
            var4 += 4;
        }
        if (this.field6463.field2356) {
            float var6 = (float) (this.field4787.field4458 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field6464 = this.field4787.field4458;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method815(int arg0) {
        if (this.field6465 == null) {
            return;
        }
        this.field4787.method1972(1);
        if ((arg0 & 0x80) != 0) {
            this.field4787.method1967((class425) null);
        } else if (this.field6463.field2356) {
            this.field4787.method1967(this.field6463.field2351);
        } else {
            int var2 = this.field4787.field4458 % 4000 * 16 / 4000;
            this.field4787.method1967(this.field6463.field2354[var2]);
        }
        this.field4787.method1972(0);
        opengl var3 = this.field4787.field4445;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field6461, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field6461, 0);
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
}
