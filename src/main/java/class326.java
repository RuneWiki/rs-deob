import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class326 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5081 = "Loaded title screen";

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
    public static int[] field5086 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "[[Lkd;")
    public static class83[][] field5088;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILok;IIII)V", line = 12)
    public static final void method2262(int arg0, int arg1, int arg2, class160 arg3, int arg4, int arg5, int arg6, int arg7) {
        field5082++;
        if (arg0 < 115) {
            return;
        }
        int var8 = arg1 * arg1 + arg5 * arg5;
        if (arg2 < var8) {
            return;
        }
        int var9 = Math.min(arg3.field2458 / 2, arg3.field2590 / 2);
        if (var9 * var9 >= var8) {
            class305.method2131(arg5, arg6, 127, arg4, arg1, arg3, class149.field2266[arg7]);
            return;
        }
        var9 -= 10;
        int var10 = (int) class312.field4862 + class339.field5253 & 0x7FF;
        int var11 = class25.field359[var10];
        int var12 = var11 * 256 / (class313.field4882 + 256);
        int var13 = class25.field355[var10];
        int var14 = var13 * 256 / (class313.field4882 + 256);
        int var15 = arg1 * var12 - (arg5 * var14) >> 16;
        int var16 = arg1 * var14 + arg5 * var12 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class186.field2991) {
            ((class14) class152.field2336[arg7]).method87(240, 240, (arg3.field2458 / 2 + arg4 + var19) * 16, (arg3.field2590 / 2 + arg6 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class298) class152.field2336[arg7]).method608(arg3.field2458 / 2 + arg4 + var19 - 10, arg3.field2590 / 2 + arg6 + -var20 + -10, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lkb;I)V", line = 69)
    public static final void method2263(class39 arg0, int arg1) {
        field5083++;
        if (class151.field2321) {
            return;
        }
        if (class186.field2991) {
            class344.method2377();
        } else {
            class216.method1583();
        }
        class74.field976 = class13.method73(16, class335.field5203, arg0);
        int var2 = class210.field3432;
        int var3 = var2 * 956 / 503;
        class74.field976.method88((class160.field2601 - var3) / 2, 0, var3, var2);
        class8.field95 = class16.method108(class151.field2311, arg0, (byte) -95);
        class8.field95.method854(class160.field2601 / 2 - (class8.field95.field4037 / 2), 18);
        class151.field2321 = true;
        if (arg1 > -115) {
            field5086 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 100)
    public static void method2264(int arg0) {
        field5086 = null;
        field5088 = (class83[][]) null;
        int var1 = -47 % ((-arg0 - 35) / 47);
        field5081 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lkb;II)Ljc;", line = 116)
    public static final class312 method2265(class39 arg0, int arg1, int arg2) {
        field5085++;
        int var3 = -42 % ((arg1 - 55) / 62);
        byte[] var4 = arg0.method274((byte) -88, arg2);
        return var4 == null ? null : new class312(var4);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 131)
    public static final void method2266(boolean arg0) {
        class312.field4849.method1623(1);
        class302.field4719.method1623(1);
        if (!arg0) {
            field5086 = (int[]) null;
        }
        field5090++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLok;I)V", line = 144)
    public static final void method2267(boolean arg0, class160 arg1, int arg2) {
        int var3 = arg1.field2496 == arg2 ? arg1.field2458 : arg1.field2496;
        int var4 = arg1.field2495 == 0 ? arg1.field2590 : arg1.field2495;
        class20.method130(25, arg1.field2446, var3, class21.field309[arg1.field2446 >> 16], arg0, var4);
        field5087++;
        if (arg1.field2459 != null) {
            class20.method130(-123, arg1.field2446, var3, arg1.field2459, arg0, var4);
        }
        class224 var5 = (class224) class176.field2870.method1743((long) arg1.field2446, (byte) -124);
        if (var5 != null) {
            class116.method805(arg0, var4, var3, -1, var5.field3564);
        }
    }
}
