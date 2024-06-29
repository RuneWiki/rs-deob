import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class314 extends class304 {

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Ltk;")
    private class180 field4618;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Lud;")
    private class168 field4613;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field4617;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "[F")
    private static float[] field4615 = new float[4];

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    private int field4614;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Lns;")
    private class426 field4616;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "()V")
    private final void method2064() {
        opengl var1 = this.field4557.field4140;
        this.field4616 = new class426(this.field4557, 2);
        this.field4616.method2670(0);
        this.field4557.method1862(1);
        this.field4557.method1911(260, 7681);
        this.field4557.method1867(0, 34168, 770);
        this.field4557.method1862(0);
        var1.glBindProgramARB(34336, this.field4613.field2274);
        var1.glEnable(34336);
        this.field4616.method2671();
        this.field4616.method2670(1);
        this.field4557.method1862(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field4557.method1910(1);
        this.field4557.method1867(0, 5890, 770);
        this.field4557.method1862(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field4616.method2671();
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "()Z")
    public final boolean method628() {
        return true;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "()V")
    public final void method627() {
        if (this.field4616 != null) {
            this.field4616.method2672('\u0001');
            this.field4557.method1862(1);
            this.field4557.method1915((class344) null);
            this.field4557.method1862(0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public final void method624(boolean arg0) {
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Z)V")
    public final void method630(boolean arg0) {
        if (this.field4616 == null) {
            return;
        }
        opengl var2 = this.field4557.field4140;
        this.field4616.method2672('\u0000');
        this.field4557.method1862(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field4557.field4219.method263((byte) 77), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field4557.method1862(0);
        if (this.field4557.field4153 == this.field4614) {
            return;
        }
        int var3 = this.field4557.field4153 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field4617.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field4617);
            var4 += 4;
        }
        if (this.field4618.field2413) {
            float var6 = (float) (this.field4557.field4153 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4614 = this.field4557.field4153;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lse;Ltk;)V")
    public class314(class282 arg0, class180 arg1) {
        super(arg0);
        this.field4618 = arg1;
        if (this.field4557.field4280 && this.field4557.field4185 >= 2) {
            this.field4613 = class168.method1126(this.field4557, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field4613 == null) {
                return;
            }
            int[][] var3 = class215.method1413(256, 64, 3, 0.4F, 8, false, 0, -102, 4);
            int[][] var4 = class215.method1413(256, 64, 3, 0.4F, 8, false, 8, -85, 4);
            class111 var5 = new class111(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field4557.field4232) {
                        var5.method826((float) var7[var9] / 4096.0F, 2107956560);
                        var5.method826((float) var8[var9] / 4096.0F, 2107956560);
                        var5.method826(1.0F, 2107956560);
                        var5.method826(1.0F, 2107956560);
                    } else {
                        var5.method827(1300078504, (float) var7[var9] / 4096.0F);
                        var5.method827(1300078504, (float) var8[var9] / 4096.0F);
                        var5.method827(1300078504, 1.0F);
                        var5.method827(1300078504, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field5049).order(ByteOrder.nativeOrder());
            var10.put(var5.field5042, 0, var5.field5049);
            var10.flip();
            this.field4617 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2064();
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    public final void method625(int arg0) {
        if (this.field4616 == null) {
            return;
        }
        this.field4557.method1862(1);
        if ((arg0 & 0x80) != 0) {
            this.field4557.method1915((class344) null);
        } else if (this.field4618.field2413) {
            this.field4557.method1915(this.field4618.field2414);
        } else {
            int var2 = this.field4557.field4153 % 4000 * 16 / 4000;
            this.field4557.method1915(this.field4618.field2416[var2]);
        }
        this.field4557.method1862(0);
        opengl var3 = this.field4557.field4140;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field4615, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field4615, 0);
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

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lgd;)V")
    public final void method629(class344 arg0) {
        this.field4557.method1915(arg0);
    }
}
