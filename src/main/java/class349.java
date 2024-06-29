import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class349 extends class139 {

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lc;")
    private class448 field5199;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lhr;")
    private class400 field5200;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field5196;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[F")
    private static float[] field5198 = new float[4];

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    private int field5197;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "Lcq;")
    private class73 field5195;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
    private final void method2109() {
        opengl var1 = this.field1876.field5783;
        this.field5195 = new class73(this.field1876, 2);
        this.field5195.method482(0);
        this.field1876.method2452(1);
        this.field1876.method2428(260, 7681);
        this.field1876.method2462(0, 34168, 770);
        this.field1876.method2452(0);
        var1.glBindProgramARB(34336, this.field5200.field5963);
        var1.glEnable(34336);
        this.field5195.method484();
        this.field5195.method482(1);
        this.field1876.method2452(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field1876.method2467(1);
        this.field1876.method2462(0, 5890, 770);
        this.field1876.method2452(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field5195.method484();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method61(boolean arg0) {
        if (this.field5195 == null) {
            return;
        }
        opengl var2 = this.field1876.field5783;
        this.field5195.method483('\u0000');
        this.field1876.method2452(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field1876.field5896.method616((byte) 64), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field1876.method2452(0);
        if (this.field1876.field5794 == this.field5197) {
            return;
        }
        int var3 = this.field1876.field5794 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field5196.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field5196);
            var4 += 4;
        }
        if (this.field5199.field6596) {
            float var6 = (float) (this.field1876.field5794 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field5197 = this.field1876.field5794;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (this.field5195 == null) {
            return;
        }
        this.field1876.method2452(1);
        if ((arg0 & 0x80) != 0) {
            this.field1876.method2460((class325) null);
        } else if (this.field5199.field6596) {
            this.field1876.method2460(this.field5199.field6597);
        } else {
            int var2 = this.field1876.field5794 % 4000 * 16 / 4000;
            this.field1876.method2460(this.field5199.field6594[var2]);
        }
        this.field1876.method2452(0);
        opengl var3 = this.field1876.field5783;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field5198, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field5198, 0);
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

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "()Z")
    public final boolean method60() {
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
    public final void method58() {
        if (this.field5195 != null) {
            this.field5195.method483('\u0001');
            this.field1876.method2452(1);
            this.field1876.method2460((class325) null);
            this.field1876.method2452(0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lq;)V")
    public final void method56(class325 arg0) {
        this.field1876.method2460(arg0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lcg;Lc;)V")
    public class349(class393 arg0, class448 arg1) {
        super(arg0);
        this.field5199 = arg1;
        if (this.field1876.field5863 && this.field1876.field5808 >= 2) {
            this.field5200 = class400.method2520(this.field1876, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field5200 == null) {
                return;
            }
            int[][] var3 = class459.method2848(8, 64, 0, false, 4, 256, 31128, 3, 0.4F);
            int[][] var4 = class459.method2848(8, 64, 8, false, 4, 256, 31128, 3, 0.4F);
            class41 var5 = new class41(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field1876.field5879) {
                        var5.method229((float) var7[var9] / 4096.0F, -117);
                        var5.method229((float) var8[var9] / 4096.0F, -18);
                        var5.method229(1.0F, -117);
                        var5.method229(1.0F, 124);
                    } else {
                        var5.method228(-1839018424, (float) var7[var9] / 4096.0F);
                        var5.method228(-1839018424, (float) var8[var9] / 4096.0F);
                        var5.method228(-1839018424, 1.0F);
                        var5.method228(-1839018424, 1.0F);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field5666).order(ByteOrder.nativeOrder());
            var10.put(var5.field5685, 0, var5.field5666);
            var10.flip();
            this.field5196 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2109();
        }
    }
}
