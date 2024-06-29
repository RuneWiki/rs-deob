import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class188 extends class150 {

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lco;")
    private class149 field2703;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Lut;")
    private class296 field2702;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2704;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "[F")
    private static float[] field2700 = new float[4];

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    private int field2701;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Lt;")
    private class391 field2705;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 10)
    public final void method1(int arg0) {
        if (this.field2705 == null) {
            return;
        }
        this.field2107.method2660(1);
        if ((arg0 & 0x80) != 0) {
            this.field2107.method2692((class179) null);
        } else if (this.field2703.field2106) {
            this.field2107.method2692(this.field2703.field2100);
        } else {
            int var2 = this.field2107.field6342 % 4000 * 16 / 4000;
            this.field2107.method2692(this.field2703.field2105[var2]);
        }
        this.field2107.method2660(0);
        opengl var3 = this.field2107.field6330;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field2700, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field2700, 0);
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

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lqi;Lco;)V", line = 55)
    public class188(class458 arg0, class149 arg1) {
        super(arg0);
        this.field2703 = arg1;
        if (this.field2107.field6414 && this.field2107.field6457 >= 2) {
            this.field2702 = class296.method1829(this.field2107, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field2702 == null) {
                return;
            }
            int[][] var3 = class448.method2602((byte) 102, 3, 64, 256, 8, false, 0.4F, 4, 0);
            int[][] var4 = class448.method2602((byte) 41, 3, 64, 256, 8, false, 0.4F, 4, 8);
            class402 var5 = new class402(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field2107.field6400) {
                        var5.method2377((float) var7[var9] / 4096.0F, (byte) 70);
                        var5.method2377((float) var8[var9] / 4096.0F, (byte) 70);
                        var5.method2377(1.0F, (byte) 70);
                        var5.method2377(1.0F, (byte) 70);
                    } else {
                        var5.method2376((float) var7[var9] / 4096.0F, -127);
                        var5.method2376((float) var8[var9] / 4096.0F, -126);
                        var5.method2376(1.0F, -126);
                        var5.method2376(1.0F, -127);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field5830).order(ByteOrder.nativeOrder());
            var10.put(var5.field5886, 0, var5.field5830);
            var10.flip();
            this.field2704 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1220();
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)V", line = 114)
    public final void method3(boolean arg0) {
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "()V", line = 116)
    public final void method2() {
        if (this.field2705 != null) {
            this.field2705.method2339('\u0001');
            this.field2107.method2660(1);
            this.field2107.method2692((class179) null);
            this.field2107.method2660(0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "()Z", line = 125)
    public final boolean method7() {
        return true;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Let;)V", line = 130)
    public final void method6(class179 arg0) {
        this.field2107.method2692(arg0);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V", line = 133)
    public final void method5(boolean arg0) {
        if (this.field2705 == null) {
            return;
        }
        opengl var2 = this.field2107.field6330;
        this.field2705.method2339('\u0000');
        this.field2107.method2660(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field2107.field6365.method1387((byte) -36), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field2107.method2660(0);
        if (this.field2107.field6342 == this.field2701) {
            return;
        }
        int var3 = this.field2107.field6342 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field2704.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field2704);
            var4 += 4;
        }
        if (this.field2703.field2106) {
            float var6 = (float) (this.field2107.field6342 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2701 = this.field2107.field6342;
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "()V", line = 181)
    private final void method1220() {
        opengl var1 = this.field2107.field6330;
        this.field2705 = new class391(this.field2107, 2);
        this.field2705.method2338(0);
        this.field2107.method2660(1);
        this.field2107.method2702(260, 7681);
        this.field2107.method2709(0, 34168, 770);
        this.field2107.method2660(0);
        var1.glBindProgramARB(34336, this.field2702.field4092);
        var1.glEnable(34336);
        this.field2705.method2340();
        this.field2705.method2338(1);
        this.field2107.method2660(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field2107.method2696(1);
        this.field2107.method2709(0, 5890, 770);
        this.field2107.method2660(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field2705.method2340();
    }
}
