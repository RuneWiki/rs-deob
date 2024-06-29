import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class33 extends class114 {

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Lgk;")
    private class256 field454;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "Ll;")
    private class262 field451;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field456;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "[F")
    private static float[] field453 = new float[4];

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Lhi;")
    private class355 field455;

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lmm;Lgk;)V")
    public class33(class357 arg0, class256 arg1) {
        super(arg0);
        this.field454 = arg1;
        if (this.field1748.field4921 && this.field1748.field4845 >= 2) {
            this.field451 = class262.method1685(this.field1748, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field451 == null) {
                return;
            }
            int[][] var3 = class62.method503(0, 28482, 0.4F, 64, 8, 3, false, 4, 256);
            int[][] var4 = class62.method503(8, 28482, 0.4F, 64, 8, 3, false, 4, 256);
            class299 var5 = new class299(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field1748.field4829) {
                        var5.method1823((byte) -118, (float) var7[var9] / 4096.0F);
                        var5.method1823((byte) -118, (float) var8[var9] / 4096.0F);
                        var5.method1823((byte) -89, 1.0F);
                        var5.method1823((byte) -72, 1.0F);
                    } else {
                        var5.method1824((float) var7[var9] / 4096.0F, 10330);
                        var5.method1824((float) var8[var9] / 4096.0F, 10330);
                        var5.method1824(1.0F, 10330);
                        var5.method1824(1.0F, 10330);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field5048).order(ByteOrder.nativeOrder());
            var10.put(var5.field5076, 0, var5.field5048);
            var10.flip();
            this.field456 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method305();
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(Z)V")
    public final void method303(boolean arg0) {
        if (this.field455 == null) {
            return;
        }
        opengl var2 = this.field1748.field4794;
        this.field455.method2132('\u0000');
        this.field1748.method2196(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field1748.field4916.method2674((byte) -27), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field1748.method2196(0);
        if (this.field1748.field4817 == this.field452) {
            return;
        }
        int var3 = this.field1748.field4817 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field456.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field456);
            var4 += 4;
        }
        if (this.field454.field3564) {
            float var6 = (float) (this.field1748.field4817 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field452 = this.field1748.field4817;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
    public final void method304(boolean arg0) {
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "()V")
    private final void method305() {
        opengl var1 = this.field1748.field4794;
        this.field455 = new class355(this.field1748, 2);
        this.field455.method2130(0);
        this.field1748.method2196(1);
        this.field1748.method2212(260, 7681);
        this.field1748.method2192(0, 34168, 770);
        this.field1748.method2196(0);
        var1.glBindProgramARB(34336, this.field451.field3607);
        var1.glEnable(34336);
        this.field455.method2131();
        this.field455.method2130(1);
        this.field1748.method2196(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field1748.method2158(1);
        this.field1748.method2192(0, 5890, 770);
        this.field1748.method2196(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field455.method2131();
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "()V")
    public final void method306() {
        if (this.field455 != null) {
            this.field455.method2132('\u0001');
            this.field1748.method2196(1);
            this.field1748.method2180((class321) null);
            this.field1748.method2196(0);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lt;)V")
    public final void method307(class321 arg0) {
        this.field1748.method2180(arg0);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
    public final void method308(int arg0) {
        if (this.field455 == null) {
            return;
        }
        this.field1748.method2196(1);
        if ((arg0 & 0x80) != 0) {
            this.field1748.method2180((class321) null);
        } else if (this.field454.field3564) {
            this.field1748.method2180(this.field454.field3562);
        } else {
            int var2 = this.field1748.field4817 % 4000 * 16 / 4000;
            this.field1748.method2180(this.field454.field3565[var2]);
        }
        this.field1748.method2196(0);
        opengl var3 = this.field1748.field4794;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field453, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field453, 0);
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

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "()Z")
    public final boolean method309() {
        return true;
    }
}
