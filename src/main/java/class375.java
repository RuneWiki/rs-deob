import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class375 extends class179 {

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "Llg;")
    public class20 field5312;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Ls;")
    public static class380 field5313 = new class380();

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field5317 = new String[100];

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "[[[B")
    public static byte[][][] field5316;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 5)
    public static void method2382(int arg0) {
        field5317 = null;
        field5313 = null;
        if (arg0 == 0) {
            field5316 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ldp;B)V", line = 17)
    public static final void method2383(class174 arg0, byte arg1) {
        class281.field4218 = arg0;
        field5315++;
        int var2 = 124 / ((arg1 - 6) / 51);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lbn;IZIILpi;Lja;ILja;ZBI)Lof;", line = 27)
    public static final class421 method2384(class153 arg0, int arg1, boolean arg2, int arg3, int arg4, class220 arg5, class90 arg6, int arg7, class90 arg8, boolean arg9, byte arg10, int arg11) {
        field5310++;
        class421 var12 = class119.method1005(arg3, arg11, arg4, arg8, arg7, true, arg0, arg1);
        if (var12 != null) {
            return var12;
        }
        class124 var13 = class206.method1561(111, arg4);
        if (arg7 > 1 && var13.field1970 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field2025[var15] <= arg7 && var13.field2025[var15] != 0) {
                    var14 = var13.field1970[var15];
                }
            }
            if (var14 != -1) {
                var13 = class206.method1561(81, var14);
            }
        }
        class382 var16 = class265.method1893(var13.field1985, class137.field2200, 0, (byte) -127);
        if (var16 == null) {
            return null;
        }
        if (var13.field1959 != null) {
            for (int var17 = 0; var17 < var13.field1959.length; var17++) {
                if (var13.field1977 == null || var13.field1977.length <= var17) {
                    var16.method2425(var13.field1959[var17], 74, var13.field2026[var17]);
                } else {
                    var16.method2425(var13.field1959[var17], 62, class73.field1214[var13.field1977[var17] & 0xFF]);
                }
            }
        }
        if (var13.field1988 != null) {
            for (int var18 = 0; var18 < var13.field1988.length; var18++) {
                var16.method2426(var13.field1962[var18], 0, var13.field1988[var18]);
            }
        }
        if (arg0 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (arg0.field2339[var19] < class196.field2874[var19].length) {
                    var16.method2425(class365.field5199[var19], 55, class196.field2874[var19][arg0.field2339[var19]]);
                }
                if (arg0.field2339[var19] < class416.field6026[var19].length) {
                    var16.method2425(class383.field5473[var19], 10, class416.field6026[var19][arg0.field2339[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field1995 != 128 || var13.field1989 != 128 || var13.field1969 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class100 var22 = arg6.method735(var16, var20, 0, var13.field1984 + 64, 768 - -var13.field2015);
        if (var21) {
            var22.method539(var13.field1995, var13.field1989, var13.field1969);
        }
        class421 var23 = null;
        if (var13.field1957 != -1) {
            var23 = method2384(arg0, 0, true, 0, var13.field1973, arg5, arg6, 10, arg8, true, (byte) 100, 1);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field2034 != -1) {
            var23 = method2384(arg0, arg1, false, 0, var13.field1998, arg5, arg6, arg7, arg8, true, (byte) -61, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field1971;
        arg6.method704(16, 16, 512, 512);
        if (arg2) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg11 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class202 var25 = arg6.method748();
        var25.method1531();
        arg6.method673(var25);
        arg6.method699(1.0F);
        arg6.method712(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class202 var26 = arg6.method709();
        var26.method1532(-var13.field1979 << 3);
        var26.method1534(var13.field1958 << 3);
        var26.method1528(var13.field1963, (class56.field897[var13.field1982 << 3] * var24 >> 15) + var13.field2035 - (var22.method541() / 2), (class56.field898[var13.field1982 << 3] * var24 >> 15) + var13.field2035);
        var26.method1542(var13.field1982 << 3);
        int var27 = arg6.method744();
        int var28 = arg6.method702();
        arg6.method738(50, Integer.MAX_VALUE);
        arg6.method742();
        arg6.method751();
        arg6.method681(0, 0, 36, 32, 0, 0);
        if (!var22.method549()) {
            return null;
        }
        var22.method530(var26, (class290) null, 1);
        arg6.method738(var27, var28);
        int[] var29 = arg6.method695(0, 0, 36, 32);
        if (arg11 >= 1) {
            var29 = class264.method1888(0, -16777215, var29);
            if (arg11 >= 2) {
                var29 = class264.method1888(0, -1, var29);
            }
        }
        if (arg1 != 0) {
            class350.method2245((byte) 36, var29, arg1);
        }
        arg6.method715(var29, 0, 36, 36, 32).method2645(0, 0);
        if (var13.field1957 != -1) {
            var23.method2645(0, 0);
        } else if (var13.field2034 != -1) {
            var23.method2645(0, 0);
        }
        if (arg3 == 1 || arg3 == 2 && (var13.field2032 == 1 || arg7 != 1) && arg7 != -1) {
            arg5.method1677(9, -256, (byte) 20, -16777215, class9.method59(arg7, true), 0);
        }
        int[] var30 = arg6.method695(0, 0, 36, 32);
        int var31 = -8 / ((arg10 - 39) / 55);
        for (int var32 = 0; var32 < var30.length; var32++) {
            if ((var30[var32] & 0xFFFFFF) == 0) {
                var30[var32] = 0;
            } else {
                var30[var32] = class439.method2744(var30[var32], -16777216);
            }
        }
        class421 var33;
        if (arg9) {
            var33 = arg6.method715(var30, 0, 36, 36, 32);
        } else {
            var33 = arg8.method715(var30, 0, 36, 36, 32);
        }
        if (!arg9) {
            class317 var34 = new class317();
            var34.field4601 = arg8.field1431;
            var34.field4603 = arg3;
            var34.field4593 = arg4;
            var34.field4598 = arg1;
            var34.field4599 = arg7;
            var34.field4592 = arg11;
            var34.field4600 = arg0 != null;
            class417.field6046.method614(var34, true, var33);
        }
        return var33;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Llg;)V", line = 268)
    public class375(class20 arg0) {
        this.field5312 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V", line = 283)
    public static final void method2385(int arg0) {
        field5311++;
        class270.field4054.method106((byte) -105);
        if (arg0 < 20) {
            field5318 = -58;
        }
    }
}
