import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class26 extends class115 {

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "Lqe;")
    public static class168 field314 = class66.method448(":trade:", 52);

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "Lwc;")
    public static class232 field316 = new class232(64);

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field320 = 1;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "Loe;")
    public static class256 field319;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "[Lgd;")
    public static class65[] field311;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V")
    public static void method171(int arg0) {
        field319 = null;
        field311 = null;
        if (arg0 == 0) {
            field316 = null;
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILnh;)Lha;")
    public static final class89 method172(int arg0, class112 arg1) {
        if (arg0 != -20325) {
            field319 = null;
        }
        field313++;
        return new class89(arg1.method740(16711680), arg1.method740(16711680), arg1.method740(arg0 + 16732005), arg1.method740(arg0 ^ 0xFF00B09B), arg1.method727(arg0 ^ 0x2486), arg1.method758(true));
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)V")
    public static final void method173(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field312++;
        for (int var5 = arg2; var5 < class149.field2586; var5++) {
            if (class169.field2952[var5] + class133.field2335[var5] > arg4 && arg3 + arg4 > class133.field2335[var5] && arg1 < class157.field2717[var5] + class124.field2049[var5] && class157.field2717[var5] < arg0 + arg1) {
                class255.field4409[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(III)Lqe;")
    public static final class168 method174(int arg0, int arg1, int arg2) {
        field310++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class155.field2713;
        } else if (var3 < -6) {
            return class207.field3589;
        } else {
            int var4 = -13 % ((arg1 + 54) / 60);
            if (var3 < -3) {
                return class173.field3030;
            } else if (var3 < 0) {
                return class4.field42;
            } else if (var3 > 9) {
                return class167.field2850;
            } else if (var3 > 6) {
                return class38.field525;
            } else if (var3 > 3) {
                return class143.field2509;
            } else if (var3 > 0) {
                return class233.field3970;
            } else {
                return class78.field1179;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method175(boolean arg0, byte[] arg1) {
        field309++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0) {
            method177();
        }
        class22.method114(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lqe;Z)I")
    public static final int method176(class168 arg0, boolean arg1) {
        field318++;
        if (arg0 == null) {
            return -1;
        }
        if (!arg1) {
            field314 = null;
        }
        for (int var2 = 0; var2 < class103.field1662; var2++) {
            if (arg0.method1106(-32, class32.field382[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class26() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "()V")
    public static final void method177() {
        for (int var0 = 0; var0 < class185.field3261; var0++) {
            class169 var1 = class252.field4369[var0];
            class9.method36(var1);
            class252.field4369[var0] = null;
        }
        class185.field3261 = 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        field315++;
        if (arg1 < 37) {
            method175(true, null);
        }
        return class193.field3367;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method178(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0) {
            for (int var6 = arg3; var6 <= arg5; var6++) {
                class232.method1501(arg2, arg1, (byte) -108, class241.field4117[var6], arg4);
            }
            field317++;
        }
    }
}
