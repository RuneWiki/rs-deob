import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class112 {

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    private int field2688 = 0;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[Lqc;")
    private class107[] field2666;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lvc;")
    private static class137 field2668 = class45.method325("Classic", -46);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lvc;")
    private static class137 field2669 = class45.method325("On", -46);

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lvc;")
    public static class137 field2662 = class45.method325("Spiel)2Engine wird gestartet)3)3)3", -46);

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2673 = -1;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "Lvc;")
    public static class137 field2676 = class45.method325("weiss:", -46);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Lvc;")
    public static class137 field2663 = field2668;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "Lvc;")
    public static class137 field2677 = class45.method325("Ihr Charakter)2Profil wird in:", -46);

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lvc;")
    private static class137 field2683 = class45.method325(" has logged out)3", -46);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lvc;")
    public static class137 field2672 = field2683;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "Lvc;")
    public static class137 field2679 = class45.method325("Privater Chat", -46);

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lvc;")
    public static class137 field2678 = field2669;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field2667 = 0;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Lvc;")
    public static class137 field2671 = class45.method325(",Zffentlicher Chat", -46);

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2670 = -1;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[[B")
    public static byte[][] field2681 = new byte[250][];

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static volatile int field2686 = 0;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
    private long field2664;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Lqc;")
    private class107 field2684;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lqc;")
    private class107 field2689;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JZ)Lqc;")
    public final class107 method867(long arg0, boolean arg1) {
        this.field2664 = arg0;
        if (arg1) {
            field2669 = null;
        }
        field2661++;
        class107 var4 = this.field2666[(int) ((long) (this.field2680 - 1) & arg0)];
        for (this.field2684 = var4.field2500; this.field2684 != var4; this.field2684 = this.field2684.field2500) {
            if (this.field2684.field2490 == arg0) {
                class107 var5 = this.field2684;
                this.field2684 = this.field2684.field2500;
                return var5;
            }
        }
        this.field2684 = null;
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILf;)V")
    public static final void method868(int arg0, class36 arg1) {
        class42.field921 = arg1;
        field2675++;
        if (arg0 != 0) {
            method868(-10, null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Lqc;")
    public final class107 method869(int arg0) {
        field2660++;
        if (this.field2684 == null) {
            return null;
        }
        if (arg0 != -29726) {
            field2678 = null;
        }
        class107 var2 = this.field2666[(int) ((long) (this.field2680 - 1) & this.field2664)];
        while (this.field2684 != var2) {
            if (this.field2684.field2490 == this.field2664) {
                class107 var3 = this.field2684;
                this.field2684 = this.field2684.field2500;
                return var3;
            }
            this.field2684 = this.field2684.field2500;
        }
        this.field2684 = null;
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lme;IIIIIBII)V")
    public static final void method870(class85 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field2682++;
        if (class67.field1383) {
            class2.field39 = 32;
        } else {
            class2.field39 = 0;
        }
        class67.field1383 = false;
        if (arg7 >= arg3 && arg7 < arg3 + 16 && arg5 >= arg8 && arg5 < arg8 + 16) {
            if (arg4 == 1) {
                class34.field737 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class80.field1825 = true;
            }
            arg0.field1927 -= class95.field2245 * 4;
        } else if (arg3 <= arg7 && arg3 + 16 > arg7 && arg8 + arg1 - 16 <= arg5 && arg5 < arg8 + arg1) {
            if (arg4 == 2 || arg4 == 3) {
                class80.field1825 = true;
            }
            if (arg4 == 1) {
                class34.field737 = true;
            }
            arg0.field1927 += class95.field2245 * 4;
        } else if (arg7 >= arg3 - class2.field39 && arg3 + class2.field39 + 16 > arg7 && arg5 >= arg8 + 16 && arg5 < arg1 + arg8 - 16 && class95.field2245 > 0) {
            class67.field1383 = true;
            if (arg4 == 1) {
                class34.field737 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                class80.field1825 = true;
            }
            int var9 = (arg1 - 32) * arg1 / arg2;
            if (var9 < 8) {
                var9 = 8;
            }
            int var10 = arg1 - var9 - 32;
            int var11 = arg5 - arg8 - var9 / 2 - 16;
            arg0.field1927 = (arg2 - arg1) * var11 / var10;
        }
        if (class105.field2444 != 0) {
            int var12 = arg0.field1929;
            if (arg4 == -1) {
                var12 = 479;
            }
            if (arg7 >= arg3 - var12 && arg8 <= arg5 && arg3 + 16 > arg7 && arg1 + arg8 >= arg5) {
                if (arg4 == 1) {
                    class34.field737 = true;
                }
                arg0.field1927 += class105.field2444 * 45;
                if (arg4 == 2 || arg4 == 3) {
                    class80.field1825 = true;
                }
            }
        }
        if (arg6 != -83) {
            field2681 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Lqc;")
    public final class107 method871(int arg0) {
        if (arg0 != -16) {
            field2663 = null;
        }
        this.field2688 = 0;
        field2665++;
        return this.method874(false);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method872(int arg0) {
        field2676 = null;
        field2662 = null;
        field2679 = null;
        field2663 = null;
        if (arg0 >= -72) {
            method872(124);
        }
        field2672 = null;
        field2668 = null;
        field2681 = null;
        field2677 = null;
        field2683 = null;
        field2671 = null;
        field2669 = null;
        field2678 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JILqc;)V")
    public final void method873(long arg0, int arg1, class107 arg2) {
        if (arg1 < 116) {
            this.field2664 = 85L;
        }
        field2685++;
        if (arg2.field2499 != null) {
            arg2.method776(0);
        }
        class107 var5 = this.field2666[(int) ((long) (this.field2680 - 1) & arg0)];
        arg2.field2499 = var5.field2499;
        arg2.field2490 = arg0;
        arg2.field2500 = var5;
        arg2.field2499.field2500 = arg2;
        arg2.field2500.field2499 = arg2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Lqc;")
    public final class107 method874(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2674++;
        if (this.field2688 > 0 && this.field2666[this.field2688 - 1] != this.field2689) {
            class107 var2 = this.field2689;
            this.field2689 = var2.field2500;
            return var2;
        }
        while (this.field2688 < this.field2680) {
            class107 var3 = this.field2666[this.field2688++].field2500;
            if (this.field2666[this.field2688 - 1] != var3) {
                this.field2689 = var3.field2500;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public static final void method875(byte arg0) {
        if (arg0 > -48) {
            field2663 = null;
        }
        class36.field791.method763((byte) -2);
        field2687++;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    public class112(int arg0) {
        this.field2666 = new class107[arg0];
        this.field2680 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class107 var3 = this.field2666[var2] = new class107();
            var3.field2500 = var3;
            var3.field2499 = var3;
        }
    }
}
