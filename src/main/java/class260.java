import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class260 extends class233 {

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "Lrj;")
    private class12 field3785;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lch;")
    private class443 field3781;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field3786;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "[F")
    private static float[] field3783 = new float[4];

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "Lfd;")
    private class195 field3782;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lih;Lrj;)V", line = 12)
    public class260(class330 arg0, class12 arg1) {
        super(arg0);
        this.field3785 = arg1;
        if (this.field3283.field4840 && this.field3283.field4788 >= 2) {
            this.field3781 = class443.method2795(this.field3283, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field3781 == null) {
                return;
            }
            int[][] var3 = class144.method967(-11590, 8, 256, 0.4F, 3, false, 64, 0, 4);
            int[][] var4 = class144.method967(-11590, 8, 256, 0.4F, 3, false, 64, 8, 4);
            class362 var5 = new class362(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field3283.field4797) {
                        var5.method2376((float) var7[var9] / 4096.0F, (byte) 126);
                        var5.method2376((float) var8[var9] / 4096.0F, (byte) 126);
                        var5.method2376(1.0F, (byte) 126);
                        var5.method2376(1.0F, (byte) 126);
                    } else {
                        var5.method2375((float) var7[var9] / 4096.0F, (byte) -30);
                        var5.method2375((float) var8[var9] / 4096.0F, (byte) -30);
                        var5.method2375(1.0F, (byte) -30);
                        var5.method2375(1.0F, (byte) -30);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3915).order(ByteOrder.nativeOrder());
            var10.put(var5.field3879, 0, var5.field3915);
            var10.flip();
            this.field3786 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1630();
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)V", line = 71)
    public final void method829(boolean arg0) {
        if (this.field3782 == null) {
            return;
        }
        opengl var2 = this.field3283.field4741;
        this.field3782.method1225('\u0000');
        this.field3283.method2037(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field3283.field4810.method1914((byte) 107), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field3283.method2037(0);
        if (this.field3283.field4761 == this.field3784) {
            return;
        }
        int var3 = this.field3283.field4761 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field3786.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field3786);
            var4 += 4;
        }
        if (this.field3785.field144) {
            float var6 = (float) (this.field3283.field4761 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field3784 = this.field3283.field4761;
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "()Z", line = 118)
    public final boolean method830() {
        return true;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "()V", line = 121)
    public final void method826() {
        if (this.field3782 != null) {
            this.field3782.method1225('\u0001');
            this.field3283.method2037(1);
            this.field3283.method2186((class223) null);
            this.field3283.method2037(0);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ldg;)V", line = 131)
    public final void method825(class223 arg0) {
        this.field3283.method2186(arg0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 135)
    public final void method828(int arg0) {
        if (this.field3782 == null) {
            return;
        }
        this.field3283.method2037(1);
        if ((arg0 & 0x80) != 0) {
            this.field3283.method2186((class223) null);
        } else if (this.field3785.field144) {
            this.field3283.method2186(this.field3785.field139);
        } else {
            int var2 = this.field3283.field4761 % 4000 * 16 / 4000;
            this.field3283.method2186(this.field3785.field140[var2]);
        }
        this.field3283.method2037(0);
        opengl var3 = this.field3283.field4741;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field3783, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field3783, 0);
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

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)V", line = 179)
    public final void method827(boolean arg0) {
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "()V", line = 182)
    private final void method1630() {
        opengl var1 = this.field3283.field4741;
        this.field3782 = new class195(this.field3283, 2);
        this.field3782.method1223(0);
        this.field3283.method2037(1);
        this.field3283.method2109(260, 7681);
        this.field3283.method2029(0, 34168, 770);
        this.field3283.method2037(0);
        var1.glBindProgramARB(34336, this.field3781.field6465);
        var1.glEnable(34336);
        this.field3782.method1224();
        this.field3782.method1223(1);
        this.field3283.method2037(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field3283.method2171(1);
        this.field3283.method2029(0, 5890, 770);
        this.field3283.method2037(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field3782.method1224();
    }
}
