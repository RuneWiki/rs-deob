import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class123 {

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1968 = 0;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Z")
    public static boolean field1972 = false;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1969 = -1;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1971 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public static int field1966 = 0;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
    public static boolean field1973 = false;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "Ljava/lang/String;")
    public static String field1979 = "Cancel";

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    public static int[] field1975;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "[S")
    public static short[] field1970;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V", line = 5)
    public static void method1062(byte arg0) {
        field1970 = null;
        field1971 = null;
        field1975 = null;
        field1979 = null;
        if (arg0 < 31) {
            method1065(-119, -67, (class171) null, 112);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Lcd;", line = 21)
    public static final class75 method1063(int arg0, int arg1) {
        field1977++;
        class75 var2 = (class75) class340.field5226.method654(58, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class329.field5074.method187(arg0, arg1, -1);
        class75 var4 = new class75();
        if (var3 != null) {
            var4.method697((byte) 43, new class25(var3));
        }
        class340.field5226.method652(-83, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V", line = 50)
    public static final void method1064(int arg0, int arg1) {
        field1976++;
        class263.field4079.method649((byte) 75, arg0);
        if (arg1 != 7000) {
            field1975 = (int[]) null;
        }
        class9.field125.method649((byte) 75, arg0);
        class187.field2935.method649((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILnc;I)V", line = 70)
    public static final void method1065(int arg0, int arg1, class171 arg2, int arg3) {
        if (arg1 != -13289) {
            method1063(46, -107);
        }
        field1967++;
        if ((arg0 & 0x2) != 0) {
            int var4 = class244.field3803.method274((byte) -11);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class244.field3803.method305(-32769);
            class102.method884(arg2, (byte) -107, var4, var5);
        }
        if ((arg0 & 0x4) != 0) {
            arg2.field1314 = class244.field3803.method297((byte) -81);
            if (arg2.field1314.charAt(0) == '~') {
                arg2.field1314 = arg2.field1314.substring(1);
                class72.method683(arg2.method1344(false, (byte) 2), arg2.method1344(true, (byte) 2), (byte) -119, arg2.field1314, 0, 2);
            } else if (class173.field2746 == arg2) {
                class72.method683(arg2.method1344(false, (byte) 2), arg2.method1344(true, (byte) 2), (byte) -121, arg2.field1314, 0, 2);
            }
            arg2.field1327 = 0;
            arg2.field1382 = 150;
            arg2.field1381 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            int var6 = class244.field3803.method274((byte) -11);
            int var7 = class244.field3803.method287(arg1 ^ 0xFFFFCC97);
            int var8 = class244.field3803.method307((byte) -106);
            int var9 = class244.field3803.field397;
            boolean var10 = (var6 & 0x8000) != 0;
            if (arg2.field2706 != null && arg2.field2730 != null) {
                boolean var11 = false;
                if (var7 <= 1) {
                    if (!var10 && !(!class175.field2772 || class285.field4421) || class256.field3935) {
                        var11 = true;
                    } else if (class178.method1393((byte) 79, arg2.field2706)) {
                        var11 = true;
                    }
                }
                if (!var11 && class305.field4743 == 0) {
                    class276.field4261.field397 = 0;
                    class244.field3803.method289(128, 0, class276.field4261.field448, var8);
                    class276.field4261.field397 = 0;
                    int var12 = -1;
                    String var13;
                    if (var10) {
                        var6 &= 0x7FFF;
                        class204 var14 = class297.method2139(53, class276.field4261);
                        var12 = var14.field3152;
                        var13 = var14.field3151.method1017(class276.field4261, (byte) 50);
                    } else {
                        var13 = class145.method1207(class72.method685(class66.method648((byte) 120, class276.field4261), (byte) -103));
                    }
                    int var15;
                    if (var7 == 1 || var7 == 2) {
                        var15 = var10 ? 17 : 1;
                    } else {
                        var15 = var10 ? 17 : 2;
                    }
                    arg2.field1314 = var13.trim();
                    arg2.field1382 = 150;
                    arg2.field1381 = var6 >> 8;
                    arg2.field1327 = var6 & 0xFF;
                    if (var7 == 2) {
                        class139.method1158("<img=1>" + arg2.method1344(false, (byte) 2), (byte) -120, var13, "<img=1>" + arg2.method1344(true, (byte) 2), 0, (String) null, var15, var12);
                    } else if (var7 == 1) {
                        class139.method1158("<img=0>" + arg2.method1344(false, (byte) 2), (byte) -111, var13, "<img=0>" + arg2.method1344(true, (byte) 2), 0, (String) null, var15, var12);
                    } else {
                        class139.method1158(arg2.method1344(false, (byte) 2), (byte) -109, var13, arg2.method1344(true, (byte) 2), 0, (String) null, var15, var12);
                    }
                }
            }
            class244.field3803.field397 = var8 + var9;
        }
        if ((arg0 & 0x80) != 0) {
            int var16 = class244.field3803.method270(false);
            int var17 = class244.field3803.method305(-32769);
            arg2.method807(var17, class360.field5718, -116, var16);
            arg2.field1348 = class360.field5718 + 300;
            arg2.field1301 = class244.field3803.method307((byte) -114);
        }
        if ((arg0 & 0x400) != 0) {
            int var18 = class244.field3803.method305(-32769);
            int[] var19 = new int[var18];
            int[] var20 = new int[var18];
            int[] var21 = new int[var18];
            for (int var22 = 0; var22 < var18; var22++) {
                int var23 = class244.field3803.method274((byte) -11);
                if (var23 == 65535) {
                    var23 = -1;
                }
                var19[var22] = var23;
                var20[var22] = class244.field3803.method307((byte) -58);
                var21[var22] = class244.field3803.method261((byte) -107);
            }
            class326.method2304(arg2, var21, var20, (byte) 97, var19);
        }
        if ((arg0 & 0x800) != 0) {
            int var24 = class244.field3803.method270(false);
            int var25 = class244.field3803.method287(128);
            arg2.method807(var25, class360.field5718, arg1 + 13178, var24);
        }
        if ((arg0 & 0x8) != 0) {
            arg2.field1371 = class244.field3803.method261((byte) 63);
            arg2.field1333 = class244.field3803.method261((byte) 74);
        }
        if ((arg0 & 0x200) != 0) {
            arg2.field1317 = class244.field3803.method287(128);
            arg2.field1282 = class244.field3803.method287(128);
            arg2.field1307 = class244.field3803.method281(-128);
            arg2.field1386 = class244.field3803.method307((byte) -56);
            arg2.field1384 = class244.field3803.method275(2) + class360.field5718;
            arg2.field1377 = class244.field3803.method274((byte) -11) + class360.field5718;
            arg2.field1356 = class244.field3803.method281(54);
            arg2.field1294 = 0;
            arg2.field1321 = 1;
        }
        if ((arg0 & 0x10) != 0) {
            arg2.field1364 = class244.field3803.method274((byte) -11);
            if (arg2.field1364 == 65535) {
                arg2.field1364 = -1;
            }
        }
        if ((arg0 & 0x100) != 0) {
            int var26 = class244.field3803.method261((byte) 62);
            if (var26 == 65535) {
                var26 = -1;
            }
            int var27 = class244.field3803.method257((byte) -87);
            boolean var28 = true;
            if (var26 != -1 && arg2.field1297 != -1 && class126.method1091((byte) 105, class292.method2110(var26, (byte) 57).field4343).field1423 < class126.method1091((byte) 60, class292.method2110(arg2.field1297, (byte) 91).field4343).field1423) {
                var28 = false;
            }
            if (var28) {
                arg2.field1355 = 1;
                arg2.field1297 = var26;
                arg2.field1330 = class360.field5718 + (var27 & 0xFFFF);
                arg2.field1392 = 0;
                arg2.field1326 = 0;
                arg2.field1308 = var27 >> 16;
                if (class360.field5718 < arg2.field1330) {
                    arg2.field1326 = -1;
                }
                if (arg2.field1297 != -1 && class360.field5718 == arg2.field1330) {
                    int var29 = class292.method2110(arg2.field1297, (byte) 82).field4343;
                    if (var29 != -1) {
                        class93 var30 = class126.method1091((byte) 68, var29);
                        if (var30 != null && var30.field1428 != null) {
                            class335.method2358(arg2.field1359, 0, var30, class173.field2746 == arg2, arg2.field1286, true);
                        }
                    }
                }
            }
        }
        if ((arg0 & 0x20) == 0) {
            return;
        }
        int var31 = class244.field3803.method281(77);
        byte[] var32 = new byte[var31];
        class25 var33 = new class25(var32);
        class244.field3803.method289(128, 0, var32, var31);
        class22.field337[arg3] = var33;
        arg2.method1352(var33, arg3, (byte) 115);
    }
}
