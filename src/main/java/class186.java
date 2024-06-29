import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class186 extends class531 {

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lgo;")
    private class653 field2846;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lnk;")
    private class747 field2843;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[F")
    private float[] field2855;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lbu;")
    public static class21 field2841 = new class21(31, 5);

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "F")
    private float field2857;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lhv;")
    public static class543 field2845;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Loi;")
    private class78 field2848;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZLdca;)V", line = 4)
    public final void method307(int arg0, boolean arg1, class188 arg2) {
        super.field7676.method808((byte) 34, arg2);
        if (!arg1) {
            ++field2851;
            super.field7676.method795(arg0, 34023);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 16)
    public static final void method1305(long[] arg0, Object[] arg1, int arg2) {
        class30.method254(arg1, 0, arg0, 1, arg0.length + -1);
        if (arg2 < -70) {
            ++field2853;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 27)
    private final void method1306(boolean arg0) {
        ++field2842;
        this.field2848 = new class78(super.field7676, 2);
        this.field2848.method607(0, !arg0);
        super.field7676.method813((byte) 103, 1);
        super.field7676.method788(74, -16777216);
        super.field7676.method802(7681, 11762, 260);
        super.field7676.method745(34166, 12, 770, 0);
        super.field7676.method813((byte) 103, 0);
        OpenGL.glBindProgramARB(34336, this.field2843.field10348);
        OpenGL.glEnable(34336);
        this.field2848.method608(false);
        this.field2848.method607(1, false);
        super.field7676.method813((byte) 103, 1);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        super.field7676.method795(0, 34023);
        super.field7676.method745(5890, -112, 770, 0);
        super.field7676.method813((byte) 103, 0);
        OpenGL.glBindProgramARB(34336, 0);
        if (!arg0) {
            this.method304(88);
        }
        OpenGL.glDisable(34336);
        OpenGL.glDisable(34820);
        this.field2848.method608(false);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(ZI)V", line = 62)
    public final void method301(boolean arg0, int arg1) {
        ++field2856;
        if (this.field2848 != null) {
            this.field2848.method606(true, '\u0000');
            super.field7676.method813((byte) 103, 1);
            if (arg1 >= -9) {
                this.field2857 = 0.32347092F;
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field7676.field1472.method3607((byte) -128), 0);
            OpenGL.glMatrixMode(5888);
            super.field7676.method813((byte) 103, 0);
            if (super.field7676.field1437 != this.field2840) {
                int var3 = super.field7676.field1437 % 5000 * 128 / 5000;
                for (int var4 = 0; var4 < 64; ++var4) {
                    OpenGL.glProgramLocalParameter4fvARB(34336, var4, this.field2855, var3);
                    var3 += 2;
                }
                if (this.field2846.field9123) {
                    this.field2857 = (float) (super.field7676.field1437 % 4000) / 4000.0F;
                } else {
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
                this.field2840 = super.field7676.field1437;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lha;IJ)V", line = 109)
    public static final void method1307(class65 arg0, int arg1, long arg2) {
        class602.field8437 = 0;
        class767.field10555 = 0;
        class470.field6592 = class96.field1097;
        ++field2850;
        class96.field1097 = 0;
        long var4 = class459.method2731(110);
        for (class593 var6 = (class593) class20.field339.method2170(false); var6 != null; var6 = (class593) class20.field339.method2176(-17754)) {
            if (var6.method3448(arg0, arg2)) {
                ++class767.field10555;
            }
        }
        if (arg1 > -59) {
            field2841 = null;
        }
        if (class779.field10699 && ~(arg2 % 100L) == -1L) {
            System.out.println("Particle system count: " + class20.field339.method2174(-11265) + ", running: " + class767.field10555);
            System.out.println("Emitters: " + class602.field8437 + " Particles: " + class96.field1097 + ". Time taken: " + (-var4 + class459.method2731(100)) + "ms");
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 144)
    public static void method1308(byte arg0) {
        field2841 = null;
        field2845 = null;
        if (arg0 != -91) {
            method1305((long[]) null, (Object[]) null, -113);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V", line = 161)
    public final void method300(int arg0) {
        ++field2854;
        if (this.field2848 != null) {
            this.field2848.method606(true, '\u0001');
            super.field7676.method813((byte) 103, arg0);
            super.field7676.method808((byte) 34, (class188) null);
            super.field7676.method813((byte) 103, 0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)V", line = 177)
    public final void method311(byte arg0, int arg1, int arg2) {
        ++field2844;
        if (this.field2848 != null) {
            super.field7676.method813((byte) 103, 1);
            if ((128 & arg1) == 0) {
                if ((arg2 & 1) == 1) {
                    if (!this.field2846.field9123) {
                        int var4 = super.field7676.field1437 % 4000 * 16 / 4000;
                        super.field7676.method808((byte) 34, this.field2846.field9122[var4]);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                    } else {
                        super.field7676.method808((byte) 34, this.field2846.field9119);
                        OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field2857, 0.0F, 0.0F, 1.0F);
                    }
                } else {
                    if (!this.field2846.field9123) {
                        super.field7676.method808((byte) 34, this.field2846.field9122[0]);
                    } else {
                        super.field7676.method808((byte) 34, this.field2846.field9119);
                    }
                    OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
                }
            } else {
                super.field7676.method808((byte) 34, (class188) null);
            }
            if (arg0 > -55) {
                this.method304(-21);
            }
            super.field7676.method813((byte) 103, 0);
            if ((arg1 & 64) == 0) {
                class606.field8478[0] = super.field7676.field1543 * super.field7676.field1536;
                class606.field8478[2] = super.field7676.field1543 * super.field7676.field1482;
                class606.field8478[1] = super.field7676.field1573 * super.field7676.field1543;
                OpenGL.glProgramLocalParameter4fvARB(34336, 66, class606.field8478, 0);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            int var5 = arg1 & 3;
            if (~var5 == -3) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
            } else if (~var5 != -4) {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
            } else {
                OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lqfa;Lgo;)V", line = 254)
    public class186(class106 arg0, class653 arg1) {
        super(arg0);
        this.field2846 = arg1;
        if (super.field7676.field1565 && super.field7676.field1544 >= 2) {
            this.field2843 = class121.method920(false, 34336, super.field7676, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, -viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
            if (this.field2843 != null) {
                int[][] var3 = class640.method3655(3, false, 64, 256, 0, 4096, 4, 4, 0.4F);
                int[][] var4 = class640.method3655(3, false, 64, 256, 8, 4096, 4, 4, 0.4F);
                this.field2855 = new float[32768];
                int var5 = 0;
                for (int var6 = 0; ~var6 > -257; ++var6) {
                    int[] var7 = var3[var6];
                    int[] var8 = var4[var6];
                    for (int var9 = 0; ~var9 > -65; ++var9) {
                        this.field2855[var5++] = (float) var7[var9] / 4096.0F;
                        this.field2855[var5++] = (float) var8[var9] / 4096.0F;
                    }
                }
                this.method1306(true);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Z", line = 302)
    public final boolean method304(int arg0) {
        if (arg0 <= 125) {
            return true;
        } else {
            ++field2847;
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V", line = 314)
    public final void method309(boolean arg0, int arg1) {
        if (arg1 >= -67) {
            this.method304(-81);
        }
        ++field2849;
    }
}
