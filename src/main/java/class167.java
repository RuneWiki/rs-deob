import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class167 extends class48 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lbk;")
    private class210 field2655;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lnh;")
    private class446 field2652;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field2656;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[F")
    private static float[] field2657 = new float[4];

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Lkm;")
    private class197 field2653;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 9)
    public final void method305() {
        if (this.field2653 != null) {
            this.field2653.method1380('\u0001');
            this.field591.method628(1);
            this.field591.method688((class293) null);
            this.field591.method628(0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()V", line = 20)
    private final void method1172() {
        opengl var1 = this.field591.field1156;
        this.field2653 = new class197(this.field591, 2);
        this.field2653.method1382(0);
        this.field591.method628(1);
        this.field591.method680(260, 7681);
        this.field591.method658(0, 34168, 770);
        this.field591.method628(0);
        var1.glBindProgramARB(34336, this.field2652.field6487);
        var1.glEnable(34336);
        this.field2653.method1381();
        this.field2653.method1382(1);
        this.field591.method628(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field591.method691(1);
        this.field591.method658(0, 5890, 770);
        this.field591.method628(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field2653.method1381();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 46)
    public final void method303(boolean arg0) {
        if (this.field2653 == null) {
            return;
        }
        opengl var2 = this.field591.field1156;
        this.field2653.method1380('\u0000');
        this.field591.method628(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field591.field1245.method2173(-110), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field591.method628(0);
        if (this.field591.field1173 == this.field2654) {
            return;
        }
        int var3 = this.field591.field1173 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field2656.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field2656);
            var4 += 4;
        }
        if (this.field2655.field3372) {
            float var6 = (float) (this.field591.field1173 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field2654 = this.field591.field1173;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lsq;Lbk;)V", line = 93)
    public class167(class96 arg0, class210 arg1) {
        super(arg0);
        this.field2655 = arg1;
        if (this.field591.field1203 && this.field591.field1200 >= 2) {
            this.field2652 = class446.method2756(this.field591, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field2652 == null) {
                return;
            }
            int[][] var3 = class71.method443(4, 3, 256, 1, 0.4F, false, 8, 0, 64);
            int[][] var4 = class71.method443(4, 3, 256, 1, 0.4F, false, 8, 8, 64);
            class24 var5 = new class24(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field591.field1280) {
                        var5.method160((byte) -12, (float) var7[var9] / 4096.0F);
                        var5.method160((byte) 126, (float) var8[var9] / 4096.0F);
                        var5.method160((byte) 127, 1.0F);
                        var5.method160((byte) -69, 1.0F);
                    } else {
                        var5.method161((float) var7[var9] / 4096.0F, (byte) -111);
                        var5.method161((float) var8[var9] / 4096.0F, (byte) -128);
                        var5.method161(1.0F, (byte) 33);
                        var5.method161(1.0F, (byte) 67);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3044).order(ByteOrder.nativeOrder());
            var10.put(var5.field3066, 0, var5.field3044);
            var10.flip();
            this.field2656 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1172();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 152)
    public final void method306(int arg0) {
        if (this.field2653 == null) {
            return;
        }
        this.field591.method628(1);
        if ((arg0 & 0x80) != 0) {
            this.field591.method688((class293) null);
        } else if (this.field2655.field3372) {
            this.field591.method688(this.field2655.field3369);
        } else {
            int var2 = this.field591.field1173 % 4000 * 16 / 4000;
            this.field591.method688(this.field2655.field3371[var2]);
        }
        this.field591.method628(0);
        opengl var3 = this.field591.field1156;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field2657, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field2657, 0);
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

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V", line = 195)
    public final void method307(boolean arg0) {
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lod;)V", line = 197)
    public final void method308(class293 arg0) {
        this.field591.method688(arg0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()Z", line = 200)
    public final boolean method304() {
        return true;
    }
}
