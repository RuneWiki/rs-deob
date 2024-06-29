import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class196 extends class144 {

    @OriginalMember(owner = "client!tr", name = "F", descriptor = "I")
    private int field2777 = 0;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
    private int field2791 = -32768;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "I")
    private int field2782 = 0;

    @OriginalMember(owner = "client!tr", name = "I", descriptor = "Z")
    public boolean field2780 = false;

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
    private int field2789 = 0;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    private int field2786 = -1;

    @OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
    private int field2773;

    @OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
    private int field2769;

    @OriginalMember(owner = "client!tr", name = "D", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!tr", name = "w", descriptor = "Leb;")
    private class449 field2768;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "Lkn;")
    public static class530 field2792 = new class530("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "I")
    public static int field2793 = 765;

    @OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!tr", name = "z", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!tr", name = "H", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!tr", name = "J", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tr", name = "S", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tr", name = "N", descriptor = "Llm;")
    private class351 field2785;

    @OriginalMember(owner = "client!tr", name = "G", descriptor = "[[B")
    public static byte[][] field2778;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)I", line = 6)
    public final int method127(byte arg0) {
        ++field2784;
        return arg0 != 86 ? 118 : this.field2791;
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)V", line = 17)
    public final void method120(int arg0) {
        if (arg0 == 0) {
            ++field2772;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lza;I)V", line = 34)
    public final void method130(class290 arg0, int arg1) {
        ++field2788;
        class377 var3 = this.method1237(arg0, this.field2769, arg1, 104);
        if (var3 != null) {
            this.method1235(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)V", line = 47)
    public final void method1233(boolean arg0, int arg1) {
        ++field2783;
        if (!this.field2780) {
            this.field2782 += arg1;
            while (this.field2782 > this.field2768.field6258[this.field2777]) {
                this.field2782 -= this.field2768.field6258[this.field2777];
                ++this.field2777;
                if (this.field2768.field6276.length <= this.field2777) {
                    this.field2780 = true;
                    break;
                }
            }
            if (!this.field2780) {
                class190.method1213(this.field2777, super.field1896, (byte) -102, this.field2768, super.field1904, false, super.field1899);
            }
            if (arg0) {
                this.method126((class290) null, (byte) -33);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIIIIII)V", line = 85)
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2776;
        if (class120.method807(arg0 + 7467, arg9)) {
            if (arg0 != -16277) {
                method1238(87, (String) null);
            }
            if (class88.field1105[arg9] == null) {
                client.method1275(class494.field6988[arg9], -1, arg4, arg7, arg3, arg2, arg6, arg8, arg1, arg5);
            } else {
                client.method1275(class88.field1105[arg9], -1, arg4, arg7, arg3, arg2, arg6, arg8, arg1, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 104)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field2773 = arg4;
        this.field2769 = arg0;
        this.field2775 = arg1 + arg2;
        this.field2789 = arg12;
        class508 var14 = class125.field1688.method2457(this.field2769, (byte) 87);
        int var15 = var14.field7504;
        if (var15 != -1) {
            this.field2768 = class62.field784.method2566(var15, -19);
            this.field2780 = false;
        } else {
            this.field2780 = true;
        }
        if (this.field2775 == arg2) {
            class190.method1213(this.field2777, super.field1896, (byte) 56, this.field2768, super.field1904, false, super.field1899);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILza;I)Z", line = 132)
    public final boolean method129(int arg0, int arg1, class290 arg2, int arg3) {
        if (arg0 != 3) {
            this.field2791 = 122;
        }
        ++field2771;
        return false;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Z", line = 144)
    public final boolean method118(byte arg0) {
        if (arg0 != 102) {
            return false;
        } else {
            ++field2767;
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILza;ILge;IZI)V", line = 166)
    public final void method128(int arg0, class290 arg1, int arg2, class510 arg3, int arg4, boolean arg5, int arg6) {
        if (arg0 <= -71) {
            ++field2787;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Le;ZLza;)V", line = 184)
    private final void method1235(class377 arg0, boolean arg1, class290 arg2) {
        ++field2779;
        class462[] var4 = arg0.method1593();
        class63[] var5 = arg0.method1579();
        if (!arg1) {
            if ((this.field2785 == null || this.field2785.field5038) && (var4 != null || var5 != null)) {
                this.field2785 = new class351(class390.field5481);
            }
            if (this.field2785 != null) {
                this.field2785.method2076(arg2, (long) class390.field5481, var4, var5, false);
                this.field2785.method2081(super.field1904, super.field1911, super.field1898, super.field1902, super.field1907);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 209)
    public static void method1236(int arg0) {
        field2792 = null;
        field2778 = null;
        if (arg0 != -10332) {
            field2778 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "finalize", descriptor = "()V", line = 223)
    protected final void finalize() {
        if (this.field2785 != null) {
            this.field2785.method2085();
        }
        ++field2790;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lza;III)Le;", line = 233)
    private final class377 method1237(class290 arg0, int arg1, int arg2, int arg3) {
        ++field2774;
        class508 var5 = class125.field1688.method2457(arg1, (byte) 87);
        if (arg3 < 26) {
            return null;
        } else {
            class38 var6 = class68.field858[super.field1904];
            class38 var7 = ~this.field2773 <= -4 ? null : class68.field858[this.field2773 + 1];
            return !this.field2780 ? var5.method3030(arg2, class62.field784, var6, var7, true, this.field2777, super.field1896, -2255, arg0, super.field1912, this.field2782, this.field2786, super.field1899) : var5.method3030(arg2, class62.field784, var6, var7, true, -1, super.field1896, -2255, arg0, super.field1912, 0, -1, super.field1899);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lza;B)Lkf;", line = 251)
    public final class170 method126(class290 arg0, byte arg1) {
        ++field2795;
        class377 var3 = this.method1237(arg0, this.field2769, 2048 | (~this.field2789 != -1 ? 5 : 0), 96);
        if (var3 == null) {
            return null;
        } else {
            if (this.field2789 != 0) {
                var3.method1612(this.field2789 * 2048);
            }
            if (arg1 > -86) {
                return null;
            } else {
                class125 var4 = arg0.method368();
                var4.method825(super.field1896, super.field1912, super.field1899);
                if (this.field2785 != null) {
                    class324 var5 = this.field2785.method2084();
                    arg0.method345(var3, var5, var4, (class122) null, 0);
                } else {
                    var3.method1566(var4, (class122) null, 0);
                }
                this.field2791 = var3.method1568();
                this.method1235(var3, false, arg0);
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILjava/lang/String;)V", line = 289)
    public static final void method1238(int arg0, String arg1) {
        ++field2794;
        int var2 = 29 % ((arg0 - -20) / 51);
        System.out.println("Error: " + class449.method2625(arg1, "\n", "%0a", -8));
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 309)
    public final void method1239(byte arg0) {
        if (this.field2785 != null) {
            this.field2785.method2085();
        }
        ++field2770;
        if (arg0 < 38) {
            this.method1237((class290) null, 119, -126, 88);
        }
    }
}
