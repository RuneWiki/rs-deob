import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class252 extends class337 {

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Lpda;")
    private class535 field3257;

    @OriginalMember(owner = "client!vt", name = "i", descriptor = "Lnb;")
    private class250 field3245;

    @OriginalMember(owner = "client!vt", name = "k", descriptor = "[F")
    private float[] field3247;

    @OriginalMember(owner = "client!vt", name = "q", descriptor = "Lrg;")
    public static class548 field3253 = new class548(18, 18);

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "I")
    public static int field3258 = 64;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "Z")
    public static boolean field3260 = false;

    @OriginalMember(owner = "client!vt", name = "z", descriptor = "[F")
    public static float[] field3262 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!vt", name = "t", descriptor = "F")
    private float field3256;

    @OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
    private int field3246;

    @OriginalMember(owner = "client!vt", name = "l", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!vt", name = "m", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!vt", name = "n", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!vt", name = "o", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vt", name = "p", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!vt", name = "r", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!vt", name = "s", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!vt", name = "A", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!vt", name = "h", descriptor = "Lam;")
    private class538 field3244;

    @OriginalMember(owner = "client!vt", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3243;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZI)V")
    public final void method256(boolean arg0, int arg1) {
        ++field3250;
        if (arg1 != 28300) {
            this.method251((byte) -119);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1428(int arg0, byte[] arg1) {
        if (arg0 != 28726) {
            return null;
        } else {
            ++field3252;
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class345.method1932(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ZII)V")
    public final void method258(boolean arg0, int arg1, int arg2) {
        ++field3261;
        if (this.field3244 != null) {
            super.field4382.method3078(33984, 1);
            if (~(128 & arg1) == -1) {
                if ((1 & arg2) != 1) {
                    if (!this.field3257.field7507) {
                        super.field4382.method3083((byte) 89, this.field3257.field7512[0]);
                    } else {
                        super.field4382.method3083((byte) 83, this.field3257.field7502);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else if (this.field3257.field7507) {
                    super.field4382.method3083((byte) 94, this.field3257.field7502);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field3256, 0.0F, 0.0F, 1.0F);
                } else {
                    int var4 = super.field4382.field7730 % 4000 * 16 / 4000;
                    super.field4382.method3083((byte) 83, this.field3257.field7512[var4]);
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field4382.method3083((byte) 69, (class238) null);
            }
            super.field4382.method3078(33984, 0);
            if (arg0) {
                field3243 = null;
            }
            if (~(arg1 & 64) == -1) {
                OpenGL.glGetFloatv(2899, class638.field9192, 0);
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class638.field9192, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = 3 & arg1;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 == -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method1429(String arg0, boolean arg1) {
        ++field3249;
        if (arg1) {
            method1428(124, (byte[]) null);
        }
        String var2 = class310.method1722((byte) 113, class348.method1943(97, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(Lmh;Lpda;)V")
    public class252(class537 arg0, class535 arg1) {
        super(arg0);
        this.field3257 = arg1;
        if (super.field4382.field7780 && super.field4382.field7759 >= 2) {
            this.field3245 = class401.method2297(super.field4382, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND", 0);
            if (this.field3245 != null) {
                int[][] var3 = class458.method2667(-110, 256, 4, 3, 0.4F, 8, false, 0, 64);
                int[][] var4 = class458.method2667(78, 256, 4, 3, 0.4F, 8, false, 8, 64);
                this.field3247 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field3247[var5++] = (float) var7[var9] / 4096.0F;
                        this.field3247[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1430(-5311);
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)V")
    private final void method1430(int arg0) {
        ++field3254;
        this.field3244 = new class538(super.field4382, 2);
        this.field3244.method3139(0, 0);
        super.field4382.method3078(33984, 1);
        super.field4382.method3059(65280, -16777216);
        super.field4382.method3099(7681, 260, arg0 + 5319);
        super.field4382.method3098(770, 0, (byte) 14, 34166);
        super.field4382.method3078(arg0 ^ -36991, 0);
        OpenGL.glBindProgramARB(34336, this.field3245.field3226);
        OpenGL.glEnable(34336);
        this.field3244.method3144(-97);
        this.field3244.method3139(1, arg0 ^ arg0);
        super.field4382.method3078(33984, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field4382.method3063(0, (byte) -107);
        super.field4382.method3098(770, 0, (byte) 14, 5890);
        super.field4382.method3078(33984, 0);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field3244.method3144(-72);
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BZ)V")
    public final void method252(byte arg0, boolean arg1) {
        ++field3263;
        if (this.field3244 != null) {
            this.field3244.method3141(93, '\u0000');
            super.field4382.method3078(33984, 1);
            OpenGL.glMatrixMode(5890);
            if (arg0 <= 10) {
                method1431(-93L, (byte) -64);
            }
            OpenGL.glLoadMatrixf(super.field4382.field7783.method673(-19660), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field4382.method3078(33984, 0);
            if (~super.field4382.field7730 != ~this.field3246) {
                int var3 = super.field4382.field7730 % 5120 * 128 / 5120;
                int var4 = var3 * 128;
                for (int var5 = 0; var5 < 64; ++var5) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var5, this.field3247, var4);
                    var4 += 2;
                }
                if (!this.field3257.field7507) {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                } else {
                    this.field3256 = (float) (super.field4382.field7730 % 4000) / 4000.0F;
                }
                this.field3246 = super.field4382.field7730;
            }
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        ++field3251;
        if (this.field3244 != null) {
            this.field3244.method3141(119, '\u0001');
            super.field4382.method3078(33984, 1);
            super.field4382.method3083((byte) 105, (class238) null);
            if (arg0 >= -21) {
                this.field3246 = -75;
            }
            super.field4382.method3078(33984, 0);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(JB)V")
    public static final void method1431(long arg0, byte arg1) {
        ++field3259;
        try {
            if (arg1 != 6) {
                method1428(7, (byte[]) null);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public static void method1432(boolean arg0) {
        field3253 = null;
        field3262 = null;
        if (!arg0) {
            method1429((String) null, false);
        }
        field3243 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IBLuu;)V")
    public final void method253(int arg0, byte arg1, class238 arg2) {
        super.field4382.method3083((byte) 112, arg2);
        ++field3248;
        super.field4382.method3063(arg0, (byte) -107);
        if (arg1 != 93) {
            this.method251((byte) -105);
        }
    }

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Z")
    public final boolean method257(byte arg0) {
        if (arg0 < 115) {
            this.method253(-114, (byte) 75, (class238) null);
        }
        ++field3255;
        return true;
    }
}
