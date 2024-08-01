import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ed")
public class class45 {

    @OriginalMember(owner = "ed", name = "w", descriptor = "J")
    public long field949 = 0L;

    @OriginalMember(owner = "ed", name = "l", descriptor = "Llf;")
    public static class109 field938 = class35.method275("(Udns", 2);

    @OriginalMember(owner = "ed", name = "v", descriptor = "I")
    public static volatile int field948 = 0;

    @OriginalMember(owner = "ed", name = "t", descriptor = "Lrc;")
    public static class160 field946 = new class160(100);

    @OriginalMember(owner = "ed", name = "x", descriptor = "Llf;")
    public static class109 field950 = class35.method275("mod_icons", 2);

    @OriginalMember(owner = "ed", name = "B", descriptor = "Llf;")
    private static class109 field954 = class35.method275("Create a free account", 2);

    @OriginalMember(owner = "ed", name = "y", descriptor = "Llf;")
    public static class109 field951 = field954;

    @OriginalMember(owner = "ed", name = "A", descriptor = "Llf;")
    public static class109 field953 = class35.method275("Benutzen Sie bitte eine andere Welt)3", 2);

    @OriginalMember(owner = "ed", name = "a", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "ed", name = "b", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "ed", name = "c", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "ed", name = "d", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "ed", name = "e", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "ed", name = "f", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "ed", name = "g", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "ed", name = "h", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "ed", name = "i", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "ed", name = "j", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "ed", name = "k", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "ed", name = "m", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "ed", name = "n", descriptor = "I")
    public int field940;

    @OriginalMember(owner = "ed", name = "o", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "ed", name = "p", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "ed", name = "q", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "ed", name = "r", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "ed", name = "u", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "ed", name = "z", descriptor = "Lnd;")
    public static class125 field952;

    @OriginalMember(owner = "ed", name = "s", descriptor = "Lka;")
    public class95 field945;

    @OriginalMember(owner = "ed", name = "a", descriptor = "(Loe;IIIII)V")
    public static final void method312(class135 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class44.field920 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class103.field2036) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class65.field1245 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class3 var14 = class78.field1550[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class29.field623[var11][var12 + 1][var13] + class29.field623[var11][var12][var13] + class29.field623[var11][var12][var13 + 1] + class29.field623[var11][var12 + 1][var13 + 1]) / 4 - (class29.field623[arg1][arg2 + 1][arg3] + class29.field623[arg1][arg2][arg3] + class29.field623[arg1][arg2][arg3 + 1] + class29.field623[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class12 var16 = var14.field31;
                                    if (var16 != null) {
                                        if (var16.field188 instanceof class135) {
                                            class135 var17 = (class135) var16.field188;
                                            class135.method959(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field190 instanceof class135) {
                                            class135 var18 = (class135) var16.field190;
                                            class135.method959(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field13; var19++) {
                                        class45 var20 = var14.field17[var19];
                                        if (var20 != null && var20.field945 instanceof class135) {
                                            class135 var21 = (class135) var20.field945;
                                            int var22 = var20.field927 + 1 - var20.field947;
                                            int var23 = var20.field944 + 1 - var20.field932;
                                            class135.method959(arg0, var21, (var20.field947 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field932 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "ed", name = "a", descriptor = "(B)V")
    public static final void method313(byte arg0) {
        field933++;
        class78.field1504.method1088(arg0 ^ 0xFFFFFFD4);
        if (arg0 != 25) {
            field938 = null;
        }
        class83.field1664.method1088(-51);
    }

    @OriginalMember(owner = "ed", name = "a", descriptor = "(Lbg;II)Z")
    public static final boolean method314(class18 arg0, int arg1, int arg2) {
        field942++;
        int var3 = -17 / ((arg1 - 39) / 41);
        byte[] var4 = arg0.method173(0, arg2);
        if (var4 == null) {
            return false;
        } else {
            class6.method28((byte) -55, var4);
            return true;
        }
    }

    @OriginalMember(owner = "ed", name = "b", descriptor = "(B)V")
    public static void method315(byte arg0) {
        field951 = null;
        field952 = null;
        field938 = null;
        if (arg0 >= -62) {
            field946 = null;
        }
        field950 = null;
        field953 = null;
        field946 = null;
        field954 = null;
    }

    @OriginalMember(owner = "ed", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field934++;
        if (class185.method1253(false, arg3)) {
            class145.field2792 = null;
            if (arg5 != 16) {
                method312(null, 29, -74, -66, 19, -42);
            }
            class172.method1154(arg6, -1, arg8, arg2, arg0, -92, arg7, arg1, class169.field3146[arg3], arg4);
            if (class145.field2792 != null) {
                class172.method1154(arg6, -1412584499, arg8, arg2, class115.field2271, -46, class21.field472, arg1, class145.field2792, arg4);
                class145.field2792 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class194.field3721[var9] = true;
            }
        } else {
            class194.field3721[arg2] = true;
        }
    }

    @OriginalMember(owner = "ed", name = "a", descriptor = "(IIIIIII)I")
    public static final int method317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        field928++;
        int var8 = arg3 & arg4;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return 7 + 1 - arg6 - arg5;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg0;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "ed", name = "a", descriptor = "(I)V")
    public static final void method318(int arg0) {
        field935++;
        class206.field4048 = new class181();
        if (arg0 != 64) {
            field953 = null;
        }
    }
}
