import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class152 {

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "Z")
    public static boolean field2833 = true;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lhj;")
    public static class69 field2834 = class181.method1318(" loggt sich ein)3", (byte) -105);

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "Lhj;")
    public static class69 field2835 = null;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public int field2829;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Lhj;")
    public class69 field2836;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Z")
    public boolean field2838;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Z")
    public static final boolean method1153(int arg0, byte arg1) {
        field2837++;
        if (arg1 > -7) {
            field2835 = null;
        }
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III)Z")
    public static final boolean method1154(int arg0, int arg1, int arg2) {
        int var3 = class139.field2593[arg0][arg1][arg2];
        if (-class163.field3021 == var3) {
            return false;
        } else if (class163.field3021 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class64.method419(var4 + 1, class271.field4793[arg0][arg1][arg2], var5 + 1) && class64.method419(var4 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg2], var5 + 1) && class64.method419(var4 + 128 - 1, class271.field4793[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class64.method419(var4 + 1, class271.field4793[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class139.field2593[arg0][arg1][arg2] = class163.field3021;
                return true;
            } else {
                class139.field2593[arg0][arg1][arg2] = -class163.field3021;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1155(int arg0) {
        field2835 = null;
        if (arg0 != 10) {
            method1155(-8);
        }
        field2834 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILtk;III)V")
    public static final void method1156(int arg0, int arg1, int arg2, class50 arg3, int arg4, int arg5, int arg6) {
        field2828++;
        int var7 = arg0 * arg0 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        if (arg1 != 27910) {
            field2833 = false;
        }
        int var8 = Math.min(arg3.field798 / 2, arg3.field727 / 2);
        if ((var8 * var8) >= var7) {
            class31.method171(arg6, arg4, arg0, arg2, arg3, class54.field970[arg5], 74);
            return;
        }
        var8 -= 10;
        int var9 = client.field2812 + class179.field3257 & 0x7FF;
        int var10 = class178.field3247[var9];
        int var11 = var10 * 256 / (class59.field1080 + 256);
        int var12 = class178.field3232[var9];
        int var13 = var12 * 256 / (class59.field1080 + 256);
        int var14 = arg0 * var13 - arg4 * var11 >> 16;
        int var15 = arg0 * var11 + arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class264) class144.field2677[arg5]).method556(arg6 + var18 + arg3.field798 / 2 - 10, -var19 + arg2 + -10 - -(arg3.field727 / 2), 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLth;II)V")
    public static final void method1157(int arg0, byte arg1, class108 arg2, int arg3, int arg4) {
        field2831++;
        if (class156.field2904 == arg2 || class177.field3218 >= 400) {
            return;
        }
        class69 var5;
        if (arg2.field2067 == 0) {
            var5 = class9.method42(122, new class69[] { arg2.method816(1), class223.method1583(class156.field2904.field2076, -24055, arg2.field2076), class229.field4198, class182.field3316, class98.method727(-229, arg2.field2076), class82.field1571 });
        } else {
            var5 = class9.method42(99, new class69[] { arg2.method816(1), class229.field4198, class130.field2416, class98.method727(-229, arg2.field2067), class82.field1571 });
        }
        if (class144.field2680 == 1) {
            class35.field492++;
            class69.method492(114, arg0, (long) arg3, class9.method42(-94, new class69[] { class223.field4072, class165.field3047, var5 }), class228.field4165, arg4, (short) 48);
        } else if (!class65.field1254) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class268.field4764[var6] != null) {
                    class111.field2113++;
                    short var8 = 0;
                    if (class47.field688 == 0 && class268.field4764[var6].method446(class140.field2621, 101)) {
                        if (arg2.field2076 > class156.field2904.field2076) {
                            var8 = 2000;
                        }
                        if (class156.field2904.field2054 != 0 && arg2.field2054 != 0) {
                            if (class156.field2904.field2054 == arg2.field2054) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class215.field3903[var6]) {
                        var8 = 2000;
                    }
                    boolean var9 = false;
                    short var10 = class75.field1476[var6];
                    short var11 = (short) (var8 + var10);
                    class69.method492(121, arg0, (long) arg3, class9.method42(-121, new class69[] { class62.field1126, var5 }), class268.field4764[var6], arg4, var11);
                }
            }
        } else if ((class149.field2769 & 0x8) == 8) {
            class69.method492(113, arg0, (long) arg3, class9.method42(-77, new class69[] { class66.field1279, class165.field3047, var5 }), class200.field3624, arg4, (short) 36);
            class197.field3584++;
        }
        for (int var7 = 0; var7 < class177.field3218; var7++) {
            if (class208.field3782[var7] == 19) {
                class216.field3917[var7] = class9.method42(121, new class69[] { class62.field1126, var5 });
                break;
            }
        }
        if (arg1 <= 30) {
            method1156(88, 111, 108, (class50) null, 7, 94, 60);
        }
    }
}
