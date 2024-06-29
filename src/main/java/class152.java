import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class152 extends class144 {

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field2199 = 0;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2204 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "Z")
    public static boolean field2205 = false;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    public static int field2210 = 0;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "[I")
    public static int[] field2212 = new int[4096];

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "Z")
    public static boolean field2211;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)Z")
    public static final boolean method996(int arg0, int arg1, int arg2) {
        int var3 = class272.field3985[arg0][arg1][arg2];
        if (-class158.field2285 == var3) {
            return false;
        } else if (class158.field2285 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class241.method1570(var4 + 1, class290.field4536[arg0][arg1][arg2], var5 + 1) && class241.method1570(var4 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg2], var5 + 1) && class241.method1570(var4 + 128 - 1, class290.field4536[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class241.method1570(var4 + 1, class290.field4536[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class272.field3985[arg0][arg1][arg2] = class158.field2285;
                return true;
            } else {
                class272.field3985[arg0][arg1][arg2] = -class158.field2285;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILjava/lang/String;)I")
    public static final int method997(int arg0, int arg1, String arg2) {
        field2207++;
        if (arg0 != 0) {
            method996(-85, 19, -68);
        }
        return class154.method1008(arg1, (byte) 122, true, arg2);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        field2208++;
        return arg1 == 255 ? class87.field1178 : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZLwe;)V")
    public static final void method998(int arg0, int arg1, int arg2, boolean arg3, class82 arg4) {
        field2201++;
        if (arg2 != -15809) {
            method997(57, -4, (String) null);
        }
        int var5 = arg4.field1131;
        if (arg4.field1020 == 0) {
            arg4.field1131 = arg4.field997;
        } else if (arg4.field1020 == 1) {
            arg4.field1131 = arg1 - arg4.field997;
        } else if (arg4.field1020 == 2) {
            arg4.field1131 = arg4.field997 * arg1 >> 14;
        } else if (arg4.field1020 == 3) {
            if (arg4.field1026 == 2) {
                arg4.field1131 = (arg4.field997 - 1) * arg4.field1035 + arg4.field997 * 32;
            } else if (arg4.field1026 == 7) {
                arg4.field1131 = (arg4.field997 - 1) * arg4.field1035 + arg4.field997 * 115;
            }
        }
        int var6 = arg4.field1048;
        if (arg4.field1049 == 0) {
            arg4.field1048 = arg4.field1060;
        } else if (arg4.field1049 == 1) {
            arg4.field1048 = arg0 - arg4.field1060;
        } else if (arg4.field1049 == 2) {
            arg4.field1048 = arg4.field1060 * arg0 >> 14;
        } else if (arg4.field1049 == 3) {
            if (arg4.field1026 == 2) {
                arg4.field1048 = (arg4.field1060 - 1) * arg4.field1011 + arg4.field1060 * 32;
            } else if (arg4.field1026 == 7) {
                arg4.field1048 = arg4.field1060 * 12 + ((arg4.field1060 - 1) * arg4.field1011);
            }
        }
        if (arg4.field1020 == 4) {
            arg4.field1131 = arg4.field1105 * arg4.field1048 / arg4.field1006;
        }
        if (arg4.field1049 == 4) {
            arg4.field1048 = arg4.field1131 * arg4.field1006 / arg4.field1105;
        }
        if (class296.field4679 && (client.method1920(arg4).field2525 != 0 || arg4.field1026 == 0)) {
            if (arg4.field1048 < 5 && arg4.field1131 < 5) {
                arg4.field1048 = 5;
                arg4.field1131 = 5;
            } else {
                if (arg4.field1048 <= 0) {
                    arg4.field1048 = 5;
                }
                if (arg4.field1131 <= 0) {
                    arg4.field1131 = 5;
                }
            }
        }
        if (arg4.field1136 == 1337) {
            class173.field2476 = arg4;
        }
        if (arg3 && arg4.field1064 != null && arg4.field1131 != var5 || arg4.field1048 != var6) {
            class11 var7 = new class11();
            var7.field143 = arg4.field1064;
            var7.field145 = arg4;
            class41.field496.method1522(var7, -65);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lwj;IIIBILwe;)V")
    public static final void method999(class130 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class82 arg6) {
        field2202++;
        if (arg0 == null || arg4 != 116) {
            return;
        }
        int var7 = (int) class274.field4085 + class139.field2016 & 0x7FF;
        int var8 = arg1 * arg1 + arg2 * arg2;
        int var9 = Math.max(arg6.field1131 / 2, arg6.field1048 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class297.field4698[var7];
        int var11 = var10 * 256 / (class15.field187 + 256);
        int var12 = class297.field4697[var7];
        int var13 = var12 * 256 / (class15.field187 + 256);
        int var14 = arg1 * var13 + arg2 * var11 >> 16;
        int var15 = arg1 * var11 - (arg2 * var13) >> 16;
        ((class187) arg0).method1217(arg6.field1131 / 2 + var14 + arg3 - (arg0.field1881 / 2), arg6.field1048 / 2 + -(arg0.field1870 / 2) + arg5 + -var15, arg6.field977, arg6.field1017);
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2204 = null;
        field2212 = null;
        if (arg0 != 5272) {
            method997(-113, 63, (String) null);
        }
    }
}
