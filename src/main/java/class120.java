import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class120 extends class399 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lde;")
    private class312 field1607;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lm;")
    private class104 field1609;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Ljava/nio/FloatBuffer;")
    private FloatBuffer field1608;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[F")
    private static float[] field1604 = new float[4];

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    private int field1606;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lel;")
    private class325 field1605;

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lpo;Lde;)V", line = 11)
    public class120(class332 arg0, class312 arg1) {
        super(arg0);
        this.field1607 = arg1;
        if (this.field5798.field4784 && this.field5798.field4842 >= 2) {
            this.field1609 = class104.method561(this.field5798, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nMOV   oPos, clipPos;\nEND");
            if (this.field1609 == null) {
                return;
            }
            int[][] var3 = class417.method2598(false, 256, 4, 0, 64, 139672664, 8, 3, 0.4F);
            int[][] var4 = class417.method2598(false, 256, 4, 8, 64, 139672664, 8, 3, 0.4F);
            class340 var5 = new class340(262144);
            for (int var6 = 0; var6 < 256; var6++) {
                int[] var7 = var3[var6];
                int[] var8 = var4[var6];
                for (int var9 = 0; var9 < 64; var9++) {
                    if (this.field5798.field4779) {
                        var5.method2186((float) var7[var9] / 4096.0F, 21090);
                        var5.method2186((float) var8[var9] / 4096.0F, 21090);
                        var5.method2186(1.0F, 21090);
                        var5.method2186(1.0F, 21090);
                    } else {
                        var5.method2187((float) var7[var9] / 4096.0F, -16092);
                        var5.method2187((float) var8[var9] / 4096.0F, -16092);
                        var5.method2187(1.0F, -16092);
                        var5.method2187(1.0F, -16092);
                    }
                }
            }
            ByteBuffer var10 = ByteBuffer.allocateDirect(var5.field2888).order(ByteOrder.nativeOrder());
            var10.put(var5.field2867, 0, var5.field2888);
            var10.flip();
            this.field1608 = var10.asFloatBuffer().asReadOnlyBuffer();
            this.method685();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V", line = 70)
    public final void method379() {
        if (this.field1605 != null) {
            this.field1605.method2003('\u0001');
            this.field5798.method2062(1);
            this.field5798.method2085((class439) null);
            this.field5798.method2062(0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 82)
    public final void method377(int arg0) {
        if (this.field1605 == null) {
            return;
        }
        this.field5798.method2062(1);
        if ((arg0 & 0x80) != 0) {
            this.field5798.method2085((class439) null);
        } else if (this.field1607.field4459) {
            this.field5798.method2085(this.field1607.field4458);
        } else {
            int var2 = this.field5798.field4758 % 4000 * 16 / 4000;
            this.field5798.method2085(this.field1607.field4455[var2]);
        }
        this.field5798.method2062(0);
        opengl var3 = this.field5798.field4752;
        if ((arg0 & 0x40) == 0) {
            var3.glGetFloatv(2899, field1604, 0);
            var3.glProgramLocalParameter4fvARB(34336, 66, field1604, 0);
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

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()Z", line = 125)
    public final boolean method375() {
        return true;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V", line = 129)
    public final void method374(boolean arg0) {
        if (this.field1605 == null) {
            return;
        }
        opengl var2 = this.field5798.field4752;
        this.field1605.method2003('\u0000');
        this.field5798.method2062(1);
        var2.glMatrixMode(5890);
        var2.glLoadMatrixf(this.field5798.field4865.method122((byte) 10), 0);
        var2.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
        var2.glMatrixMode(5888);
        this.field5798.method2062(0);
        if (this.field5798.field4758 == this.field1606) {
            return;
        }
        int var3 = this.field5798.field4758 % 5120 * 256 / 5120;
        int var4 = var3 * 256;
        for (int var5 = 0; var5 < 64; var5++) {
            this.field1608.position(var4);
            var2.glProgramLocalParameter4fvARB(34336, var5, this.field1608);
            var4 += 4;
        }
        if (this.field1607.field4459) {
            float var6 = (float) (this.field5798.field4758 % 4000) / 4000.0F;
            var2.glProgramLocalParameter4fARB(34336, 65, var6, 0.0F, 0.0F, 1.0F);
        } else {
            var2.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        this.field1606 = this.field5798.field4758;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()V", line = 175)
    private final void method685() {
        opengl var1 = this.field5798.field4752;
        this.field1605 = new class325(this.field5798, 2);
        this.field1605.method2005(0);
        this.field5798.method2062(1);
        this.field5798.method2100(260, 7681);
        this.field5798.method2087(0, 34168, 770);
        this.field5798.method2062(0);
        var1.glBindProgramARB(34336, this.field1609.field1181);
        var1.glEnable(34336);
        this.field1605.method2004();
        this.field1605.method2005(1);
        this.field5798.method2062(1);
        var1.glMatrixMode(5890);
        var1.glLoadIdentity();
        var1.glMatrixMode(5888);
        this.field5798.method2116(1);
        this.field5798.method2087(0, 5890, 770);
        this.field5798.method2062(0);
        var1.glBindProgramARB(34336, 0);
        var1.glDisable(34336);
        var1.glDisable(34820);
        this.field1605.method2004();
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 199)
    public final void method378(boolean arg0) {
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lfl;)V", line = 203)
    public final void method376(class439 arg0) {
        this.field5798.method2085(arg0);
    }
}
