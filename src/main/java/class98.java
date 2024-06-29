import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class98 extends class284 {

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lqf;")
    private class404 field1511;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "Lii;")
    private class328 field1507;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field1509;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "[F")
    private static float[] field1510 = new float[4];

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Lwm;")
    private class334 field1506;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lnj;)V", line = 7)
    public final void method693(class133 arg0) {
        this.field3917.method2165(arg0);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "()Z", line = 10)
    public final boolean method694() {
        return true;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(Z)V", line = 14)
    public final void method695(boolean arg0) {
        if (this.field1506 == null) {
            return;
        }
        opengl var2 = this.field3917.field4607;
        this.field1506.method2075('\u0000');
        this.field3917.method2162(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field3917.field4636.method895(0), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field3917.method2162(0);
        if (this.field3917.field4615 == this.field1508) {
            return;
        }
        int var3 = this.field3917.field4615 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1509.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field1509);
            var4 += 4;
        }
        if (this.field1511.field5883) {
            float var6 = (float) (this.field3917.field4615 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field1508 = this.field3917.field4615;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V", line = 58)
    public final void method696(boolean arg0) {
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lhj;Lqf;)V", line = 60)
    public class98(class338 arg0, class404 arg1) {
        super(arg0);
        this.field1511 = arg1;
        if (this.field3917.field4643 && this.field3917.field4697 >= 2) {
            this.field1507 = class328.method2058(this.field3917, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field1507 == null) {
                return;
            }
            int[][] var3 = class225.method1426(false, 4, 3, 103, 0.4F, 64, 0, 256, 8);
            int[][] var4 = class225.method1426(false, 4, 3, 107, 0.4F, 64, 8, 256, 8);
            class148 var5 = new class148(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field3917.field4640) {
                        var5.method1018(-12641, (float) var7[var9] / 4096.0F);
                        var5.method1018(-12641, (float) var8[var9] / 4096.0F);
                        var5.method1018(-12641, 1.0F);
                        var5.method1018(-12641, 1.0F);
                    } else {
                        var5.method1017((float) var7[var9] / 4096.0F, -14822);
                        var5.method1017((float) var8[var9] / 4096.0F, -14822);
                        var5.method1017(1.0F, -14822);
                        var5.method1017(1.0F, -14822);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field5273).order(ByteOrder.nativeOrder());
            var10.put(var5.field5258, 0, var5.field5273);
            var10.flip();
            this.field1509 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method698();
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)V", line = 122)
    public final void method697(int arg0) {
        if (this.field1506 == null) {
            return;
        }
        this.field3917.method2162(1);
        if ((arg0 & 0x80) != 0) {
            this.field3917.method2165((class133) null);
        } else if (this.field1511.field5883) {
            this.field3917.method2165(this.field1511.field5880);
        } else {
            int var2 = this.field3917.field4615 % 4000 * 16 / 4000;
            this.field3917.method2165(this.field1511.field5879[var2]);
        }
        this.field3917.method2162(0);
        opengl var3 = this.field3917.field4607;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field1510, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field1510, 0);
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

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "()V", line = 166)
    private final void method698() {
        opengl var1 = this.field3917.field4607;
        this.field1506 = new class334(this.field3917, 2);
        this.field1506.method2073(0);
        this.field3917.method2162(1);
        this.field3917.method2140(260, 7681);
        this.field3917.method2135(0, 34168, 770);
        this.field3917.method2162(0);
        var1.glBindProgramARB(34336, this.field1507.field4476);
        var1.glEnable(34336);
        this.field1506.method2074();
        this.field1506.method2073(1);
        this.field3917.method2162(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field3917.method2129(1);
        this.field3917.method2135(0, 5890, 770);
        this.field3917.method2162(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field1506.method2074();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "()V", line = 195)
    public final void method699() {
        if (this.field1506 != null) {
            this.field1506.method2075('\u0001');
            this.field3917.method2162(1);
            this.field3917.method2165((class133) null);
            this.field3917.method2162(0);
        }
    }
}
