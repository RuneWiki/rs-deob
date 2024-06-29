import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class533 implements class161 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "[Ljv;")
    private class520[] field7805 = new class520[9];

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    private int field7825 = -1;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    private int field7807 = 0;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Lih;")
    private class214 field7832;

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
    private int field7836;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Llo;")
    public static class306 field7818 = new class306("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!jk", name = "G", descriptor = "Ljava/lang/String;")
    public static String field7837 = "";

    @OriginalMember(owner = "client!jk", name = "H", descriptor = "[Z")
    public static boolean[] field7838 = new boolean[5];

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7840 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field7809;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field7820;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    private int field7821;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field7822;

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
    private int field7824;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field7826;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
    private int field7827;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
    public static int field7828;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field7829;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field7830;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!jk", name = "I", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "Lza;")
    public static class491 field7842;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V", line = 3)
    public final void method3150(int arg0, int arg1) {
        field7819++;
        if (this.field7825 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class536.field7874[arg1]);
        if (arg0 <= 7) {
            this.method3151(72);
        }
    }

    @OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        this.field7832.method1478(this.field7836, 124);
        field7829++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lih;)V", line = 489)
    public class533(class214 arg0) {
        if (!arg0.field3724) {
            throw new IllegalStateException("");
        }
        this.field7832 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class499.field7316, 0);
        this.field7836 = class499.field7316[0];
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)I", line = 32)
    private final int method3151(int arg0) {
        field7834++;
        if (arg0 < 76) {
            this.field7805 = null;
        }
        if ((this.field7807 & 0x4) != 0) {
            return 36160;
        } else if ((this.field7807 & 0x2) == 0) {
            return (this.field7807 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILah;I)V", line = 53)
    private final void method3152(byte arg0, int arg1, class187 arg2, int arg3) {
        if (arg0 < 25) {
            this.method1117(94);
        }
        field7812++;
        if (this.field7825 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field7821) == 0) {
            this.field7824 = arg2.field2914;
            this.field7827 = arg2.field2920;
        } else if (this.field7827 != arg2.field2920 || this.field7824 != arg2.field2914) {
            throw new RuntimeException();
        }
        arg2.method1263(-1, this.field7825, class536.field7874[arg1], arg3);
        this.field7805[arg1] = arg2;
        this.field7821 |= var5;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V", line = 84)
    public final void method1118(int arg0) {
        field7835++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field7807 &= 0xFFFFFFFB;
        if (arg0 > -12) {
            method3164(33, -69);
        }
        this.field7825 = this.method3151(79);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 99)
    public final void method1117(int arg0) {
        OpenGL.glBindFramebufferEXT(36009, this.field7836);
        field7808++;
        this.field7807 |= 0x2;
        if (arg0 != 31988) {
            method3164(-39, -47);
        }
        this.field7825 = this.method3151(arg0 ^ 0x7CAB);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIZLhg;)V", line = 113)
    private final void method3153(int arg0, int arg1, int arg2, boolean arg3, class358 arg4) {
        field7814++;
        if (this.field7825 == -1) {
            throw new RuntimeException();
        }
        if (arg3) {
            method3158(47);
        }
        int var6 = 0x1 << arg0;
        if ((this.field7821 & ~var6) == 0) {
            this.field7824 = arg4.field5571;
            this.field7827 = arg4.field5571;
        } else if (this.field7827 != arg4.field5571 || this.field7824 != arg4.field5571) {
            throw new RuntimeException();
        }
        arg4.method2296(class536.field7874[arg0], -106, arg1, arg2, this.field7825);
        this.field7805[arg0] = arg4;
        this.field7821 |= var6;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lcj;BI)V", line = 147)
    public final void method3154(class213 arg0, byte arg1, int arg2) {
        field7822++;
        if (this.field7825 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg2;
        if ((~var4 & this.field7821) == 0) {
            this.field7824 = arg0.field3381;
            this.field7827 = arg0.field3387;
        } else if (this.field7827 != arg0.field3387 || this.field7824 != arg0.field3381) {
            throw new RuntimeException();
        }
        arg0.method1400(-18754, this.field7825, class536.field7874[arg2]);
        this.field7805[arg2] = arg0;
        this.field7821 |= var4;
        if (arg1 <= 1) {
            this.field7827 = -55;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I", line = 180)
    public static final int method3155(int arg0, int arg1, int arg2) {
        if (arg1 <= 77) {
            method3162(-63);
        }
        field7811++;
        return arg2 == 1 || arg2 == 3 ? class421.field6362[arg0 & 0x3] : class418.field6330[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLah;)V", line = 198)
    public final void method3156(int arg0, byte arg1, class187 arg2) {
        field7826++;
        this.method3152((byte) 93, arg0, arg2, 0);
        int var4 = -99 / ((arg1 - 52) / 51);
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V", line = 209)
    public final void method1119(int arg0) {
        if (arg0 == -28104) {
            field7833++;
            OpenGL.glBindFramebufferEXT(36160, this.field7836);
            this.field7807 |= 0x4;
            this.field7825 = this.method3151(arg0 + 28183);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)V", line = 231)
    public final void method3157(int arg0, int arg1) {
        field7816++;
        if (this.field7805[arg1] != null) {
            this.field7805[arg1].method1213(0);
        }
        this.field7821 &= ~(0x1 << arg1);
        int var3 = -10 / ((arg0 - 61) / 55);
        this.field7805[arg1] = null;
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V", line = 246)
    public static final void method3158(int arg0) {
        for (class162 var1 = (class162) class108.field1934.method2538(-3); var1 != null; var1 = (class162) class108.field1934.method2535((byte) -103)) {
            if (class331.method2081(var1.field2576, (byte) 113)) {
                class510.method3001(var1, -13);
            }
        }
        field7815++;
        if (class480.field7080 == 1) {
            class212.method1396((byte) -37);
        } else {
            class358.method2298(class265.field4428, class134.field2262, (byte) -127, class128.field2195, class508.field7390);
            int var2 = class84.field1467.method2085((byte) -82, class467.field6930.method1954(class300.field4813, -30366));
            for (class162 var3 = (class162) class108.field1934.method2538(-3); var3 != null; var3 = (class162) class108.field1934.method2535((byte) -90)) {
                int var4 = class238.method1634((byte) -92, var3);
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            class134.field2262 = var2 + 8;
            class128.field2195 = (class331.field5216 ? 26 : 22) + class480.field7080 * 16;
        }
        if (arg0 != 16) {
            field7841 = 22;
        }
    }

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)I", line = 293)
    public final int method3159(int arg0) {
        if (arg0 != 12833) {
            this.field7807 = 78;
        }
        field7809++;
        return this.field7824;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 307)
    public final void method1114(int arg0) {
        OpenGL.glBindFramebufferEXT(36008, this.field7836);
        if (arg0 != -5376) {
            this.method3151(-64);
        }
        field7820++;
        this.field7807 |= 0x1;
        this.field7825 = this.method3151(arg0 ^ 0xFFFFEB58);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIB)V", line = 321)
    public static final void method3160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != 7) {
            method3163(116, -3, null);
        }
        field7823++;
        for (class459 var7 = (class459) class194.field3020.method573(24037); var7 != null; var7 = (class459) class194.field3020.method576(arg6 + 7)) {
            if (var7.field6812 <= class504.field7348) {
                var7.method695(-113);
            } else {
                class235.method1616(arg2 >> 1, var7.field6808, arg3, arg4, (var7.field6811 << 7) + 64, arg0 >> 1, (byte) -5, var7.field6813 * 2, (var7.field6810 << 7) + 64);
                class127.field2188.method1897(class244.field4188[0] + arg5, class244.field4188[1] + arg1, var7.field6815 | 0xFF000000, var7.field6814, 24244, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 350)
    public final void method1115(byte arg0) {
        OpenGL.glBindFramebufferEXT(36008, 0);
        field7810++;
        this.field7807 &= 0xFFFFFFFE;
        if (arg0 != 105) {
            this.method1116(-65);
        }
        this.field7825 = this.method3151(117);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)V", line = 365)
    public final void method3161(int arg0, int arg1) {
        field7806++;
        if (arg1 <= 15) {
            field7841 = -83;
        }
        if (this.field7825 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class536.field7874[arg0]);
    }

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "(I)V", line = 380)
    public static void method3162(int arg0) {
        field7837 = null;
        field7840 = null;
        if (arg0 < 87) {
            method3163(25, -11, null);
        }
        field7818 = null;
        field7842 = null;
        field7838 = null;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V", line = 394)
    public final void method1116(int arg0) {
        field7828++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        if (arg0 != -10395) {
            this.field7805 = null;
        }
        this.field7807 &= 0xFFFFFFFD;
        this.field7825 = this.method3151(125);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IILjava/lang/String;)V", line = 409)
    public static final void method3163(int arg0, int arg1, String arg2) {
        field7813++;
        class265.method1775(-2, class103.field1695);
        class296.field4761++;
        class261.field4357.method163(class323.method2037(arg2, -1) + 1, (byte) 49);
        class261.field4357.method119(arg1, -4729);
        int var3 = 46 % ((-arg0 - 66) / 44);
        class261.field4357.method145(arg2, (byte) 0);
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(II)Lvp;", line = 424)
    public static final class462 method3164(int arg0, int arg1) {
        field7831++;
        class462 var2 = (class462) class506.field7372.method1593((byte) -4, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 19) {
            field7837 = null;
        }
        byte[] var3 = class21.field227.method2926(arg1, -116, 0);
        class462 var4 = new class462();
        if (var3 != null) {
            var4.method2755(new class23(var3), 0, arg1);
        }
        class506.field7372.method1595(var4, (long) arg1, (byte) 44);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Z", line = 449)
    public final boolean method3165(byte arg0) {
        field7839++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field7825);
        if (arg0 == 81) {
            return var2 == 36053;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILhg;)V", line = 476)
    public final void method3166(int arg0, int arg1, int arg2, class358 arg3) {
        this.method3153(arg0, arg2, arg1, false, arg3);
        field7817++;
    }
}
