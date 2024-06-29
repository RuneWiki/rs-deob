import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class416 implements class64 {

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "[Lmo;")
    private class694[] field5893 = new class694[9];

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    private int field5884 = 0;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    private int field5889 = -1;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lkga;")
    private class506 field5900;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "I")
    private int field5894;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    private int field5878;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    private int field5879;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    private int field5880;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5882;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field5890;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "J")
    public static long field5875;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "Ljn;")
    public static class668 field5897;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lsaa;III)V", line = 8)
    private final void method2494(class298 arg0, int arg1, int arg2, int arg3) {
        field5888++;
        if (this.field5889 == -1) {
            throw new RuntimeException();
        }
        int var5 = -46 % ((arg2 + 46) / 46);
        int var6 = 0x1 << arg3;
        if ((~var6 & this.field5880) == 0) {
            this.field5878 = arg0.field4006;
            this.field5879 = arg0.field4009;
        } else if (this.field5878 != arg0.field4006 || this.field5879 != arg0.field4009) {
            throw new RuntimeException();
        }
        arg0.method1766(2216, class6.field63[arg3], arg1, this.field5889);
        this.field5893[arg3] = arg0;
        this.field5880 |= var6;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLsaa;I)V", line = 38)
    public final void method2495(boolean arg0, class298 arg1, int arg2) {
        if (arg0) {
            this.field5879 = -110;
        }
        field5876++;
        this.method2494(arg1, 0, -92, arg2);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 49)
    public final void method609(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field5894);
        field5882++;
        this.field5884 |= 0x4;
        this.field5889 = this.method2503((byte) -68);
        if (arg0 != -18710) {
            field5897 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 63)
    public final void method612(int arg0) {
        field5883++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field5884 &= 0xFFFFFFFB;
        this.field5889 = this.method2503((byte) -40);
        if (arg0 != -20842) {
            this.method614(9);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILsa;III)V", line = 77)
    private final void method2496(int arg0, class187 arg1, int arg2, int arg3, int arg4) {
        field5895++;
        if (this.field5889 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg0;
        if ((this.field5880 & ~var6) == 0) {
            this.field5878 = arg1.field2289;
            this.field5879 = arg1.field2289;
        } else if (this.field5878 != arg1.field2289 || this.field5879 != arg1.field2289) {
            throw new RuntimeException();
        }
        arg1.method1161(this.field5889, 6, class6.field63[arg0], arg2, arg4);
        this.field5893[arg0] = arg1;
        this.field5880 |= var6;
        if (arg3 >= -124) {
            this.method2498(-52, null, -51);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 109)
    public final void method613(byte arg0) {
        int var2 = 65 % ((51 - arg0) / 54);
        OpenGL.glBindFramebufferEXT(36008, 0);
        field5877++;
        this.field5884 &= 0xFFFFFFFE;
        this.field5889 = this.method2503((byte) -43);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 123)
    public static final String method2497(int arg0, int[] arg1) {
        field5891++;
        StringBuffer var2 = new StringBuffer();
        int var3 = class502.field7013;
        int var4 = 0;
        if (arg0 != -17581) {
            method2497(-5, null);
        }
        while (var4 < arg1.length) {
            class401 var5 = class496.field6935.method1778(arg1[var4], 35);
            if (var5.field5674 != -1) {
                class701 var6 = (class701) class514.field7541.method2766(-127, (long) var5.field5674);
                if (var6 == null) {
                    class495 var7 = class495.method2874(class692.field9847, var5.field5674, 0);
                    if (var7 != null) {
                        var6 = class68.field1045.method216(var7, true);
                        class514.field7541.method2772(var6, true, (long) var5.field5674);
                    }
                }
                if (var6 != null) {
                    class420.field5955[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILoaa;I)V", line = 176)
    public final void method2498(int arg0, class261 arg1, int arg2) {
        field5899++;
        if (this.field5889 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((this.field5880 & ~var4) == arg0) {
            this.field5879 = arg1.field3596;
            this.field5878 = arg1.field3587;
        } else if (this.field5878 != arg1.field3587 || this.field5879 != arg1.field3596) {
            throw new RuntimeException();
        }
        arg1.method1590(class6.field63[arg2], this.field5889, (byte) -89);
        this.field5893[arg2] = arg1;
        this.field5880 |= var4;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)V", line = 206)
    public static void method2499(int arg0) {
        field5897 = null;
        int var1 = -119 % ((-arg0 - 11) / 50);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V", line = 215)
    public final void method610(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field5894);
        field5902++;
        this.field5884 |= 0x2;
        this.field5889 = this.method2503((byte) -78);
        if (arg0 != 10583) {
            this.method2504(-107);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 235)
    public final void method611(byte arg0) {
        field5890++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field5884 &= 0xFFFFFFFD;
        this.field5889 = this.method2503((byte) -50);
        if (arg0 != -45) {
            this.method2500(-81, null, 118, -63);
        }
    }

    @OriginalMember(owner = "client!ci", name = "finalize", descriptor = "()V", line = 251)
    protected final void finalize() throws Throwable {
        this.field5900.method2989(this.field5894, (byte) 97);
        field5887++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V", line = 261)
    public final void method614(int arg0) {
        if (arg0 < -16) {
            field5885++;
            OpenGL.glBindFramebufferEXT(36008, this.field5894);
            this.field5884 |= 0x1;
            this.field5889 = this.method2503((byte) -109);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILsa;II)V", line = 277)
    public final void method2500(int arg0, class187 arg1, int arg2, int arg3) {
        this.method2496(arg0, arg1, 0, -125, arg3);
        field5886++;
        if (arg2 != 36160) {
            field5897 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V", line = 290)
    public final void method2501(int arg0, int arg1) {
        field5896++;
        if (this.field5889 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class6.field63[arg0]);
        if (arg1 <= 76) {
            this.method2496(-14, null, -40, 110, 124);
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lkga;)V", line = 380)
    public class416(class506 arg0) {
        if (!arg0.field7397) {
            throw new IllegalStateException("");
        }
        this.field5900 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class430.field6180, 0);
        this.field5894 = class430.field6180[0];
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V", line = 309)
    public final void method2502(int arg0, int arg1) {
        field5901++;
        if (this.field5893[arg0] != null) {
            this.field5893[arg0].method1160((byte) -124);
        }
        this.field5880 &= ~(0x1 << arg0);
        this.field5893[arg0] = null;
        if (arg1 != 9136) {
            this.field5893 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)I", line = 325)
    private final int method2503(byte arg0) {
        if (arg0 >= -22) {
            return 24;
        }
        field5892++;
        if ((this.field5884 & 0x4) != 0) {
            return 36160;
        } else if ((this.field5884 & 0x2) == 0) {
            return (this.field5884 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)Z", line = 347)
    public final boolean method2504(int arg0) {
        if (arg0 <= 12) {
            return false;
        } else {
            field5898++;
            int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field5889);
            return var2 == 36053;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V", line = 393)
    public final void method2505(int arg0, boolean arg1) {
        field5881++;
        if (arg1) {
            this.field5893 = null;
        }
        if (this.field5889 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class6.field63[arg0]);
    }
}
