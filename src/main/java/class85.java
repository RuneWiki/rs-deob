import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class85 extends class404 {

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lsh;")
    private class435 field991;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lme;")
    private class64 field990;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field989;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[F")
    private static float[] field987 = new float[4];

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    private int field986;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Ltp;")
    private class124 field988;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lsd;)V")
    public final void method353(class233 arg0) {
        this.field5606.method2088(arg0);
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lh;Lsh;)V")
    public class85(class327 arg0, class435 arg1) {
        super(arg0);
        this.field991 = arg1;
        if (this.field5606.field4443 && this.field5606.field4400 >= 2) {
            this.field990 = class64.method370(this.field5606, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field990 == null) {
                return;
            }
            int[][] var3 = class330.method2125(-1, 64, 8, 0.4F, 256, 4, 3, false, 0);
            int[][] var4 = class330.method2125(-1, 64, 8, 0.4F, 256, 4, 3, false, 8);
            class245 var5 = new class245(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field5606.field4448) {
                        var5.method1607((float) var7[var9] / 4096.0F, -11107);
                        var5.method1607((float) var8[var9] / 4096.0F, -11107);
                        var5.method1607(1.0F, -11107);
                        var5.method1607(1.0F, -11107);
                    } else {
                        var5.method1608((float) var7[var9] / 4096.0F, 922092592);
                        var5.method1608((float) var8[var9] / 4096.0F, 922092592);
                        var5.method1608(1.0F, 922092592);
                        var5.method1608(1.0F, 922092592);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3211).order(ByteOrder.nativeOrder());
            var10.put(var5.field3188, 0, var5.field3211);
            var10.flip();
            this.field989 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method521();
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public final void method351(int arg0) {
        if (this.field988 == null) {
            return;
        }
        this.field5606.method2115(1);
        if ((arg0 & 0x80) != 0) {
            this.field5606.method2088((class233) null);
        } else if (this.field991.field5947) {
            this.field5606.method2088(this.field991.field5950);
        } else {
            int var2 = this.field5606.field4373 % 4000 * 16 / 4000;
            this.field5606.method2088(this.field991.field5946[var2]);
        }
        this.field5606.method2115(0);
        opengl var3 = this.field5606.field4363;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field987, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field987, 0);
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

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
    public final boolean method350() {
        return true;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "()V")
    private final void method521() {
        opengl var1 = this.field5606.field4363;
        this.field988 = new class124(this.field5606, 2);
        this.field988.method808(0);
        this.field5606.method2115(1);
        this.field5606.method2056(260, 7681);
        this.field5606.method2066(0, 34168, 770);
        this.field5606.method2115(0);
        var1.glBindProgramARB(34336, this.field990.field780);
        var1.glEnable(34336);
        this.field988.method807();
        this.field988.method808(1);
        this.field5606.method2115(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field5606.method2083(1);
        this.field5606.method2066(0, 5890, 770);
        this.field5606.method2115(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field988.method807();
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        if (this.field988 == null) {
            return;
        }
        opengl var2 = this.field5606.field4363;
        this.field988.method809('\u0000');
        this.field5606.method2115(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field5606.field4461.method925(82), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field5606.method2115(0);
        if (this.field5606.field4373 == this.field986) {
            return;
        }
        int var3 = this.field5606.field4373 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field989.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field989);
            var4 += 4;
        }
        if (this.field991.field5947) {
            float var6 = (float) (this.field5606.field4373 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field986 = this.field5606.field4373;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
    public final void method352() {
        if (this.field988 != null) {
            this.field988.method809('\u0001');
            this.field5606.method2115(1);
            this.field5606.method2088((class233) null);
            this.field5606.method2115(0);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public final void method349(boolean arg0) {
    }
}
