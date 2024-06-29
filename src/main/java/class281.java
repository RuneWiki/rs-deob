import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class281 extends class42 {

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Lfg;")
    private class66 field4023;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Llc;")
    private class387 field4022;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field4025;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[F")
    private static float[] field4024 = new float[4];

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Loc;")
    private class112 field4027;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(Z)V")
    public final void method289(boolean arg0) {
        if (this.field4027 == null) {
            return;
        }
        opengl var2 = this.field582.field1918;
        this.field4027.method677('\u0000');
        this.field582.method1002(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field582.field1964.method1780(5), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field582.method1002(0);
        if (this.field582.field1930 == this.field4026) {
            return;
        }
        int var3 = this.field582.field1930 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field4025.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field4025);
            var4 += 4;
        }
        if (this.field4023.field895) {
            float var6 = (float) (this.field582.field1930 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4026 = this.field582.field1930;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lee;)V")
    public final void method286(class404 arg0) {
        this.field582.method888(arg0);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public final void method288(boolean arg0) {
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "()Z")
    public final boolean method287() {
        return true;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "()V")
    public final void method291() {
        if (this.field4027 != null) {
            this.field4027.method677('\u0001');
            this.field582.method1002(1);
            this.field582.method888((class404) null);
            this.field582.method1002(0);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
    public final void method290(int arg0) {
        if (this.field4027 == null) {
            return;
        }
        this.field582.method1002(1);
        if ((arg0 & 0x80) != 0) {
            this.field582.method888((class404) null);
        } else if (this.field4023.field895) {
            this.field582.method888(this.field4023.field893);
        } else {
            int var2 = this.field582.field1930 % 4000 * 16 / 4000;
            this.field582.method888(this.field4023.field892[var2]);
        }
        this.field582.method1002(0);
        opengl var3 = this.field582.field1918;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field4024, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field4024, 0);
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

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "()V")
    private final void method1929() {
        opengl var1 = this.field582.field1918;
        this.field4027 = new class112(this.field582, 2);
        this.field4027.method678(0);
        this.field582.method1002(1);
        this.field582.method926(260, 7681);
        this.field582.method958(0, 34168, 770);
        this.field582.method1002(0);
        var1.glBindProgramARB(34336, this.field4022.field5470);
        var1.glEnable(34336);
        this.field4027.method679();
        this.field4027.method678(1);
        this.field582.method1002(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field582.method913(1);
        this.field582.method958(0, 5890, 770);
        this.field582.method1002(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field4027.method679();
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lig;Lfg;)V")
    public class281(class132 arg0, class66 arg1) {
        super(arg0);
        this.field4023 = arg1;
        if (this.field582.field2028 && this.field582.field1975 >= 2) {
            this.field4022 = class387.method2456(this.field582, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field4022 == null) {
                return;
            }
            int[][] var3 = class222.method1560(64, 4, 3, 8, (byte) 126, 0.4F, false, 256, 0);
            int[][] var4 = class222.method1560(64, 4, 3, 8, (byte) 118, 0.4F, false, 256, 8);
            class322 var5 = new class322(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field582.field1998) {
                        var5.method2135((byte) 122, (float) var7[var9] / 4096.0F);
                        var5.method2135((byte) 122, (float) var8[var9] / 4096.0F);
                        var5.method2135((byte) 122, 1.0F);
                        var5.method2135((byte) 122, 1.0F);
                    } else {
                        var5.method2134(-95, (float) var7[var9] / 4096.0F);
                        var5.method2134(-108, (float) var8[var9] / 4096.0F);
                        var5.method2134(-71, 1.0F);
                        var5.method2134(-117, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field1880).order(ByteOrder.nativeOrder());
            var10.put(var5.field1851, 0, var5.field1880);
            var10.flip();
            this.field4025 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method1929();
        }
    }
}
