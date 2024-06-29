import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class194 extends class309 {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lja;")
    private class97 field2658;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lvc;")
    private class332 field2659;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2661;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[F")
    private static float[] field2656 = new float[4];

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    private int field2657;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Lfa;")
    private class433 field2660;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "()V", line = 6)
    public final void method54() {
        if (this.field2660 != null) {
            this.field2660.method2588('\u0001');
            this.field4530.method1365(1);
            this.field4530.method1379((class5) null);
            this.field4530.method1365(0);
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lic;Lja;)V", line = 15)
    public class194(class246 arg0, class97 arg1) {
        super(arg0);
        this.field2658 = arg1;
        if (this.field4530.field3407 && this.field4530.field3445 >= 2) {
            this.field2659 = class332.method2018(this.field4530, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field2659 == null) {
                return;
            }
            int[][] var3 = class147.method701(3, 4, 64, 8, false, false, 0, 0.4F, 256);
            int[][] var4 = class147.method701(3, 4, 64, 8, false, false, 8, 0.4F, 256);
            class472 var5 = new class472(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field4530.field3370) {
                        var5.method2788((float) var7[var9] / 4096.0F, -1327473512);
                        var5.method2788((float) var8[var9] / 4096.0F, -1327473512);
                        var5.method2788(1.0F, -1327473512);
                        var5.method2788(1.0F, -1327473512);
                    } else {
                        var5.method2787(true, (float) var7[var9] / 4096.0F);
                        var5.method2787(true, (float) var8[var9] / 4096.0F);
                        var5.method2787(true, 1.0F);
                        var5.method2787(true, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field2206).order(ByteOrder.nativeOrder());
            var10.put(var5.field2159, 0, var5.field2206);
            var10.flip();
            this.field2661 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1056();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "()Z", line = 75)
    public final boolean method56() {
        return true;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lvd;)V", line = 81)
    public final void method51(class5 arg0) {
        this.field4530.method1379(arg0);
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "()V", line = 85)
    private final void method1056() {
        opengl var1 = this.field4530.field3342;
        this.field2660 = new class433(this.field4530, 2);
        this.field2660.method2589(0);
        this.field4530.method1365(1);
        this.field4530.method1360(260, 7681);
        this.field4530.method1384(0, 34168, 770);
        this.field4530.method1365(0);
        var1.glBindProgramARB(34336, this.field2659.field4775);
        var1.glEnable(34336);
        this.field2660.method2590();
        this.field2660.method2589(1);
        this.field4530.method1365(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field4530.method1455(1);
        this.field4530.method1384(0, 5890, 770);
        this.field4530.method1365(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field2660.method2590();
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V", line = 110)
    public final void method55(boolean arg0) {
        if (this.field2660 == null) {
            return;
        }
        opengl var2 = this.field4530.field3342;
        this.field2660.method2588('\u0000');
        this.field4530.method1365(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field4530.field3415.method2050((byte) 70), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field4530.method1365(0);
        if (this.field4530.field3359 == this.field2657) {
            return;
        }
        int var3 = this.field4530.field3359 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field2661.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field2661);
            var4 += 4;
        }
        if (this.field2658.field1195) {
            float var6 = (float) (this.field4530.field3359 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2657 = this.field4530.field3359;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 157)
    public final void method53(int arg0) {
        if (this.field2660 == null) {
            return;
        }
        this.field4530.method1365(1);
        if ((arg0 & 0x80) != 0) {
            this.field4530.method1379((class5) null);
        } else if (this.field2658.field1195) {
            this.field4530.method1379(this.field2658.field1197);
        } else {
            int var2 = this.field4530.field3359 % 4000 * 16 / 4000;
            this.field4530.method1379(this.field2658.field1196[var2]);
        }
        this.field4530.method1365(0);
        opengl var3 = this.field4530.field3342;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field2656, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field2656, 0);
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

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V", line = 200)
    public final void method57(boolean arg0) {
    }
}
