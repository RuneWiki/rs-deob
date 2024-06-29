import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class203 extends class246 {

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lrk;")
    private class339 field2942;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "Lud;")
    private class94 field2941;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "[F")
    private float[] field2939;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "F")
    private float field2936;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    private int field2935;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "Lo;")
    public static class359 field2934;

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Llo;")
    private class365 field2947;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field2938;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "[I")
    public static int[] field2946;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        ++field2945;
        if (arg0 <= 99) {
            field2934 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
    public static void method1310(byte arg0) {
        int var1 = 94 / ((-50 - arg0) / 45);
        field2938 = null;
        field2934 = null;
        field2946 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZI)V")
    public final void method740(boolean arg0, int arg1) {
        ++field2948;
        if (arg1 != 26715) {
            method1310((byte) -24);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILfg;I)V")
    public final void method742(int arg0, class128 arg1, int arg2) {
        super.field3361.method1977(arg1, true);
        ++field2949;
        super.field3361.method1966(arg0 + -5, arg2);
        if (arg0 != 4) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    private final void method1311(int arg0) {
        ++field2944;
        this.field2947 = new class365(super.field3361, 2);
        this.field2947.method2185(-64, 0);
        super.field3361.method1990(false, 1);
        super.field3361.method1988((byte) 109, -16777216);
        super.field3361.method2023(260, 7681, 2929);
        super.field3361.method1994(0, 770, 34166, 8960);
        super.field3361.method1990(false, 0);
        OpenGL.glBindProgramARB(34336, this.field2941.field1532);
        OpenGL.glEnable(34336);
        this.field2947.method2186((byte) -103);
        this.field2947.method2185(arg0 ^ -22989, 1);
        super.field3361.method1990(false, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field3361.method1966(arg0 ^ -22944, 0);
        super.field3361.method1994(0, 770, 5890, arg0 ^ 31391);
        if (arg0 == 22943) {
            super.field3361.method1990(false, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34336);
            OpenGL.glDisable(34820);
            this.field2947.method2186((byte) -89);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BII)V")
    public final void method744(byte arg0, int arg1, int arg2) {
        ++field2943;
        if (this.field2947 != null) {
            super.field3361.method1990(false, 1);
            if ((arg1 & 128) != 0) {
                super.field3361.method1977((class128) null, true);
            } else if ((arg2 & 1) != 1) {
                if (!this.field2942.field4912) {
                    super.field3361.method1977(this.field2942.field4920[0], true);
                } else {
                    super.field3361.method1977(this.field2942.field4919, true);
                }
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else if (!this.field2942.field4912) {
                int var4 = super.field3361.field4724 % 4000 * 16 / 4000;
                super.field3361.method1977(this.field2942.field4920[var4], true);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                super.field3361.method1977(this.field2942.field4919, true);
                OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2936, 0.0F, 0.0F, 1.0F);
            }
            super.field3361.method1990(false, 0);
            if (~(64 & arg1) != -1) {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glGetFloatv(2899, class488.field7075, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class488.field7075, 0);
            }
            int var5 = 3 & arg1;
            if (arg0 != 53) {
                this.method742(33, (class128) null, 118);
            }
            if (var5 == 2) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (var5 != 3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZB)V")
    public final void method743(boolean arg0, byte arg1) {
        ++field2950;
        if (this.field2947 != null) {
            this.field2947.method2183((byte) -41, '\u0000');
            super.field3361.method1990(false, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3361.field4801.method3030(false), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            if (arg1 >= 83) {
                OpenGL.glMatrixMode(5888);
                super.field3361.method1990(false, 0);
                if (super.field3361.field4724 != this.field2935) {
                    int var3 = super.field3361.field4724 % 5120 * 128 / 5120;
                    int var4 = var3 * 128;
                    for (int var5 = 0; ~var5 > -65; ++var5) {
                        OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field2939, var4);
                        var4 += 2;
                    }
                    if (this.field2942.field4912) {
                        this.field2936 = (float) (super.field3361.field4724 % 4000) / 4000.0F;
                    } else {
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    }
                    this.field2935 = super.field3361.field4724;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lpg;Lrk;)V")
    public class203(class333 arg0, class339 arg1) {
        super(arg0);
        this.field2942 = arg1;
        if (super.field3361.field4771 && ~super.field3361.field4826 <= -3) {
            this.field2941 = class147.method1057(34336, 34933, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", super.field3361);
            if (this.field2941 != null) {
                int[][] var3 = class233.method1423(0, 4, 64, 0.4F, 3, false, 256, 256, 8);
                int[][] var4 = class233.method1423(8, 4, 64, 0.4F, 3, false, 256, 256, 8);
                int var5 = 0;
                this.field2939 = new float[32768];
                for (int var6 = 0; var6 < 256; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; var9 < 64; ++var9) {
                        this.field2939[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2939[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1311(22943);
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final void method739(int arg0) {
        ++field2933;
        if (this.field2947 != null) {
            int var2 = -32 / ((arg0 - -80) / 32);
            this.field2947.method2183((byte) -41, '\u0001');
            super.field3361.method1990(false, 1);
            super.field3361.method1977((class128) null, true);
            super.field3361.method1990(false, 0);
        }
    }
}
