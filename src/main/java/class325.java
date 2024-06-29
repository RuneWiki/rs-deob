import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class325 extends class436 {

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Lqg;")
    private class155 field4761;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Lqm;")
    private class287 field4763;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field4765;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "[F")
    private static float[] field4764 = new float[4];

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    private int field4762;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Lpa;")
    private class341 field4766;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "()V")
    public final void method157() {
        if (this.field4766 != null) {
            this.field4766.method2225('\u0001');
            this.field6402.method1777(1);
            this.field6402.method1669((class360) null);
            this.field6402.method1777(0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)V")
    public final void method161(boolean arg0) {
    }

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "()V")
    private final void method2180() {
        opengl var1 = this.field6402.field3634;
        this.field4766 = new class341(this.field6402, 2);
        this.field4766.method2224(0);
        this.field6402.method1777(1);
        this.field6402.method1627(260, 7681);
        this.field6402.method1763(0, 34168, 770);
        this.field6402.method1777(0);
        var1.glBindProgramARB(34336, this.field4763.field4154);
        var1.glEnable(34336);
        this.field4766.method2223();
        this.field4766.method2224(1);
        this.field6402.method1777(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field6402.method1745(1);
        this.field6402.method1763(0, 5890, 770);
        this.field6402.method1777(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field4766.method2223();
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lnf;Lqg;)V")
    public class325(class256 arg0, class155 arg1) {
        super(arg0);
        this.field4761 = arg1;
        if (this.field6402.field3711 && this.field6402.field3667 >= 2) {
            this.field4763 = class287.method1964(this.field6402, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field4763 == null) {
                return;
            }
            int[][] var3 = class398.method2559(64, false, 0, 8, 256, -12, 3, 0.4F, 4);
            int[][] var4 = class398.method2559(64, false, 8, 8, 256, -72, 3, 0.4F, 4);
            class160 var5 = new class160(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field6402.field3663) {
                        var5.method990(13302, (float) var7[var9] / 4096.0F);
                        var5.method990(13302, (float) var8[var9] / 4096.0F);
                        var5.method990(13302, 1.0F);
                        var5.method990(13302, 1.0F);
                    } else {
                        var5.method991((float) var7[var9] / 4096.0F, (byte) -57);
                        var5.method991((float) var8[var9] / 4096.0F, (byte) -57);
                        var5.method991(1.0F, (byte) -57);
                        var5.method991(1.0F, (byte) -57);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field3029).order(ByteOrder.nativeOrder());
            var10.put(var5.field3040, 0, var5.field3029);
            var10.flip();
            this.field4765 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method2180();
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
    public final void method162(int arg0) {
        if (this.field4766 == null) {
            return;
        }
        this.field6402.method1777(1);
        if ((arg0 & 0x80) != 0) {
            this.field6402.method1669((class360) null);
        } else if (this.field4761.field2097) {
            this.field6402.method1669(this.field4761.field2100);
        } else {
            int var2 = this.field6402.field3641 % 4000 * 16 / 4000;
            this.field6402.method1669(this.field4761.field2098[var2]);
        }
        this.field6402.method1777(0);
        opengl var3 = this.field6402.field3634;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field4764, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field4764, 0);
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

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        if (this.field4766 == null) {
            return;
        }
        opengl var2 = this.field6402.field3634;
        this.field4766.method2225('\u0000');
        this.field6402.method1777(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field6402.field3674.method1792(13), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field6402.method1777(0);
        if (this.field6402.field3641 == this.field4762) {
            return;
        }
        int var3 = this.field6402.field3641 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field4765.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field4765);
            var4 += 4;
        }
        if (this.field4761.field2097) {
            float var6 = (float) (this.field6402.field3641 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field4762 = this.field6402.field3641;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "()Z")
    public final boolean method159() {
        return true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lme;)V")
    public final void method160(class360 arg0) {
        this.field6402.method1669(arg0);
    }
}
