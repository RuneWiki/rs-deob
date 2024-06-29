import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class31 extends class48 {

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Lbo;")
    private class354 field302;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Lqn;")
    private class196 field301;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field304;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "[F")
    private static float[] field300 = new float[4];

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "Lgi;")
    private class253 field305;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (this.field305 == null) {
            return;
        }
        opengl var2 = this.field480.field4697;
        this.field305.method1427('\u0000');
        this.field480.method2052(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field480.field4760.method737((byte) 73), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field480.method2052(0);
        if (this.field480.field4720 == this.field303) {
            return;
        }
        int var3 = this.field480.field4720 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field304.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field304);
            var4 += 4;
        }
        if (this.field302.field5006) {
            float var6 = (float) (this.field480.field4720 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field303 = this.field480.field4720;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method69(int arg0) {
        if (this.field305 == null) {
            return;
        }
        this.field480.method2052(1);
        if ((arg0 & 0x80) != 0) {
            this.field480.method2032((class50) null);
        } else if (this.field302.field5006) {
            this.field480.method2032(this.field302.field5008);
        } else {
            int var2 = this.field480.field4720 % 4000 * 16 / 4000;
            this.field480.method2032(this.field302.field5005[var2]);
        }
        this.field480.method2052(0);
        opengl var3 = this.field480.field4697;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field300, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field300, 0);
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

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lql;Lbo;)V")
    public class31(class346 arg0, class354 arg1) {
        super(arg0);
        this.field302 = arg1;
        if (this.field480.field4830 && this.field480.field4796 >= 2) {
            this.field301 = class196.method1057(this.field480, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field301 == null) {
                return;
            }
            int[][] var3 = class452.method2810(8, 4, 256, 0.4F, 0, 3, 350, 64, false);
            int[][] var4 = class452.method2810(8, 4, 256, 0.4F, 8, 3, 350, 64, false);
            class255 var5 = new class255(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field480.field4736) {
                        var5.method1442(-128, (float) var7[var9] / 4096.0F);
                        var5.method1442(-127, (float) var8[var9] / 4096.0F);
                        var5.method1442(-128, 1.0F);
                        var5.method1442(-128, 1.0F);
                    } else {
                        var5.method1441((float) var7[var9] / 4096.0F, false);
                        var5.method1441((float) var8[var9] / 4096.0F, false);
                        var5.method1441(1.0F, false);
                        var5.method1441(1.0F, false);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3389).order(ByteOrder.nativeOrder());
            var10.put(var5.field3406, 0, var5.field3389);
            var10.flip();
            this.field304 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method147();
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "()V")
    private final void method147() {
        opengl var1 = this.field480.field4697;
        this.field305 = new class253(this.field480, 2);
        this.field305.method1429(0);
        this.field480.method2052(1);
        this.field480.method2053(260, 7681);
        this.field480.method2040(0, 34168, 770);
        this.field480.method2052(0);
        var1.glBindProgramARB(34336, this.field301.field2639);
        var1.glEnable(34336);
        this.field305.method1428();
        this.field305.method1429(1);
        this.field480.method2052(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field480.method2054(1);
        this.field480.method2040(0, 5890, 770);
        this.field480.method2052(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field305.method1428();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public final void method70(boolean arg0) {
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "()Z")
    public final boolean method74() {
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lna;)V")
    public final void method71(class50 arg0) {
        this.field480.method2032(arg0);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "()V")
    public final void method72() {
        if (this.field305 != null) {
            this.field305.method1427('\u0001');
            this.field480.method2052(1);
            this.field480.method2032((class50) null);
            this.field480.method2052(0);
        }
    }
}
