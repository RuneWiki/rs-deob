import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 implements Runnable {

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "Z")
    public boolean field31 = true;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field25 = new Object();

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field34 = 0;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
    public int[] field36 = new int[500];

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "[I")
    public int[] field35 = new int[500];

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field21 = 0;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lrd;")
    public static class173 field22 = class133.method843("", -99);

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field30 = -1;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lpf;")
    public static class155 field28 = new class155(5000);

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lrd;")
    public static class173 field33 = class133.method843("Null", -100);

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V")
    public static final void method19(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field24++;
        int var6 = class68.method421(arg5, class37.field790, -44, class20.field445);
        int var7 = class68.method421(arg1, class37.field790, 62, class20.field445);
        int var8 = class68.method421(arg4, class194.field3778, 67, class96.field1766);
        int var9 = class68.method421(arg2, class194.field3778, -105, class96.field1766);
        if (arg0 >= -118) {
            field33 = null;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class51.method350(var8, arg3, (byte) -126, class107.field1998[var10], var9);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILoh;)V")
    public static final void method20(int arg0, class147 arg1) {
        field32++;
        arg1.field2762 = arg1.field2815;
        if (arg1.field2780 == 0) {
            arg1.field2775 = 0;
            return;
        }
        if (arg1.field2809 != -1 && arg1.field2763 == 0) {
            class178 var2 = class167.method1080(11098, arg1.field2809);
            if (arg1.field2771 > 0 && var2.field3492 == 0) {
                arg1.field2775++;
                return;
            }
            if (arg1.field2771 <= 0 && var2.field3500 == 0) {
                arg1.field2775++;
                return;
            }
        }
        int var3 = arg1.field2801;
        int var4 = arg1.field2764[arg1.field2780 - 1] * 128 + arg1.field2754 * 64;
        int var5 = arg1.field2820;
        if (arg0 <= 20) {
            return;
        }
        int var6 = arg1.field2814[arg1.field2780 - 1] * 128 + arg1.field2754 * 64;
        if (var4 - var5 > 256 || var4 - var5 < -256 || var6 - var3 > 256 || var6 - var3 < -256) {
            arg1.field2820 = var4;
            arg1.field2801 = var6;
            return;
        }
        if (var4 <= var5) {
            if (var5 > var4) {
                if (var6 > var3) {
                    arg1.field2794 = 768;
                } else if (var3 > var6) {
                    arg1.field2794 = 256;
                } else {
                    arg1.field2794 = 512;
                }
            } else if (var3 < var6) {
                arg1.field2794 = 1024;
            } else if (var3 > var6) {
                arg1.field2794 = 0;
            }
        } else if (var3 < var6) {
            arg1.field2794 = 1280;
        } else if (var6 < var3) {
            arg1.field2794 = 1792;
        } else {
            arg1.field2794 = 1536;
        }
        int var7 = arg1.field2794 - arg1.field2786 & 0x7FF;
        int var8 = arg1.field2766;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = 4;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field2811;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field2755;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field2760;
        }
        if (var8 == -1) {
            var8 = arg1.field2811;
        }
        boolean var10 = true;
        arg1.field2762 = var8;
        if (arg1 instanceof class120) {
            var10 = ((class120) arg1).field2215.field926;
        }
        if (var10) {
            if (arg1.field2794 != arg1.field2786 && arg1.field2818 == -1 && arg1.field2787 != 0) {
                var9 = 2;
            }
            if (arg1.field2780 > 2) {
                var9 = 6;
            }
            if (arg1.field2780 > 3) {
                var9 = 8;
            }
            if (arg1.field2775 > 0 && arg1.field2780 > 1) {
                arg1.field2775--;
                var9 = 8;
            }
        } else {
            if (arg1.field2780 > 1) {
                var9 = 6;
            }
            if (arg1.field2780 > 2) {
                var9 = 8;
            }
            if (arg1.field2775 > 0 && arg1.field2780 > 1) {
                arg1.field2775--;
                var9 = 8;
            }
        }
        if (arg1.field2797[arg1.field2780 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg1.field2811 == arg1.field2762 && arg1.field2768 != -1) {
            arg1.field2762 = arg1.field2768;
        }
        if (var5 < var4) {
            arg1.field2820 += var9;
            if (var4 < arg1.field2820) {
                arg1.field2820 = var4;
            }
        } else if (var4 < var5) {
            arg1.field2820 -= var9;
            if (var4 > arg1.field2820) {
                arg1.field2820 = var4;
            }
        }
        if (var6 > var3) {
            arg1.field2801 += var9;
            if (var6 < arg1.field2801) {
                arg1.field2801 = var6;
            }
        } else if (var6 < var3) {
            arg1.field2801 -= var9;
            if (var6 > arg1.field2801) {
                arg1.field2801 = var6;
            }
        }
        if (arg1.field2820 == var4 && arg1.field2801 == var6) {
            if (arg1.field2771 > 0) {
                arg1.field2771--;
            }
            arg1.field2780--;
        }
    }

    @OriginalMember(owner = "client!ab", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field31) {
            Object var1 = this.field25;
            synchronized (this.field25) {
                if (this.field34 < 500) {
                    this.field36[this.field34] = class214.field4154;
                    this.field35[this.field34] = class4.field72;
                    this.field34++;
                }
            }
            class151.method996(12121, 50L);
        }
        field27++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static void method21(boolean arg0) {
        field33 = null;
        if (!arg0) {
            field28 = null;
            field22 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
    public static final int method22(int arg0, int arg1) {
        if (arg0 != 1023) {
            method22(-88, 123);
        }
        field29++;
        return arg1 & 0x3FF;
    }
}
