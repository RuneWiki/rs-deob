import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class386 extends class44 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lim;")
    private class342 field5442;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lrf;")
    private class47 field5443;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field5447;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "[F")
    private static float[] field5444 = new float[4];

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    private int field5446;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Leq;")
    private class115 field5445;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()V", line = 6)
    public final void method229() {
        if (this.field5445 != null) {
            this.field5445.method714('\u0001');
            this.field540.method1001(1);
            this.field540.method1003((class220) null);
            this.field540.method1001(0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V", line = 17)
    public final void method230(boolean arg0) {
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llp;)V", line = 21)
    public final void method231(class220 arg0) {
        this.field540.method1003(arg0);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 25)
    public final void method228(int arg0) {
        if (this.field5445 == null) {
            return;
        }
        this.field540.method1001(1);
        if ((arg0 & 0x80) != 0) {
            this.field540.method1003((class220) null);
        } else if (this.field5442.field4850) {
            this.field540.method1003(this.field5442.field4852);
        } else {
            int var2 = this.field540.field1941 % 4000 * 16 / 4000;
            this.field540.method1003(this.field5442.field4851[var2]);
        }
        this.field540.method1001(0);
        opengl var3 = this.field540.field1927;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field5444, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field5444, 0);
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

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 70)
    public final void method227(boolean arg0) {
        if (this.field5445 == null) {
            return;
        }
        opengl var2 = this.field540.field1927;
        this.field5445.method714('\u0000');
        this.field540.method1001(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field540.field2051.method2234(-80), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field540.method1001(0);
        if (this.field540.field1941 == this.field5446) {
            return;
        }
        int var3 = this.field540.field1941 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field5447.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field5447);
            var4 += 4;
        }
        if (this.field5442.field4850) {
            float var6 = (float) (this.field540.field1941 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field5446 = this.field540.field1941;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()Z", line = 115)
    public final boolean method232() {
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lao;Lim;)V", line = 122)
    public class386(class157 arg0, class342 arg1) {
        super(arg0);
        this.field5442 = arg1;
        if (this.field540.field2048 && this.field540.field1960 >= 2) {
            this.field5443 = class47.method275(this.field540, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field5443 == null) {
                return;
            }
            int[][] var3 = class135.method842((byte) -124, 4, 3, 256, 0, 64, 8, 0.4F, false);
            int[][] var4 = class135.method842((byte) -117, 4, 3, 256, 8, 64, 8, 0.4F, false);
            class104 var5 = new class104(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field540.field1976) {
                        var5.method576(239332760, (float) var7[var9] / 4096.0F);
                        var5.method576(239332760, (float) var8[var9] / 4096.0F);
                        var5.method576(239332760, 1.0F);
                        var5.method576(239332760, 1.0F);
                    } else {
                        var5.method575(false, (float) var7[var9] / 4096.0F);
                        var5.method575(false, (float) var8[var9] / 4096.0F);
                        var5.method575(false, 1.0F);
                        var5.method575(false, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3320).order(ByteOrder.nativeOrder());
            var10.put(var5.field3364, 0, var5.field3320);
            var10.flip();
            this.field5447 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2474();
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()V", line = 182)
    private final void method2474() {
        opengl var1 = this.field540.field1927;
        this.field5445 = new class115(this.field540, 2);
        this.field5445.method716(0);
        this.field540.method1001(1);
        this.field540.method981(260, 7681);
        this.field540.method989(0, 34168, 770);
        this.field540.method1001(0);
        var1.glBindProgramARB(34336, this.field5443.field564);
        var1.glEnable(34336);
        this.field5445.method715();
        this.field5445.method716(1);
        this.field540.method1001(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field540.method975(1);
        this.field540.method989(0, 5890, 770);
        this.field540.method1001(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field5445.method715();
    }
}
