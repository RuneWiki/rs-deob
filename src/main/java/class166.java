import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class166 extends RuntimeException {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2418;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Ljava/lang/String;")
    public String field2413;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lui;")
    public static class375 field2416 = new class375("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ler;")
    public static class157 field2417 = new class157(5);

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Z")
    public static boolean field2420 = true;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2414++;
        for (class119 var5 = (class119) class73.field987.method1970(64); var5 != null; var5 = (class119) class73.field987.method1960(24)) {
            class145.method967(arg1, 0, arg3, arg0, var5, arg4);
        }
        for (class119 var6 = (class119) class55.field747.method1970(64); var6 != null; var6 = (class119) class55.field747.method1960(24)) {
            byte var12 = 1;
            class219 var13 = var6.field1670.method2181(0);
            if (var6.field1670.field5294) {
                var12 = 0;
            } else if (var6.field1670.field5253 == var13.field3054 || var6.field1670.field5253 == var13.field3036 || var6.field1670.field5253 == var13.field3056 || var6.field1670.field5253 == var13.field3063) {
                var12 = 2;
            } else if (var6.field1670.field5253 == var13.field3052 || var6.field1670.field5253 == var13.field3042 || var6.field1670.field5253 == var13.field3037 || var6.field1670.field5253 == var13.field3044) {
                var12 = 3;
            }
            if (var6.field1667 != var12) {
                int var14 = class317.method2053(true, var6.field1670);
                if (var6.field1682 != var14) {
                    if (var6.field1681 != null) {
                        class325.field4996.method1274(var6.field1681);
                        var6.field1681 = null;
                    }
                    var6.field1682 = var14;
                }
                var6.field1667 = var12;
            }
            var6.field1669 = var6.field1670.field2217;
            var6.field1668 = var6.field1670.field2217 + (var6.field1670.method2091(-15245) << 6);
            var6.field1680 = var6.field1670.field2215;
            var6.field1666 = var6.field1670.field2215 + (var6.field1670.method2091(-15245) << 6);
            class145.method967(arg1, 0, arg3, arg0, var6, arg4);
        }
        int var7 = 75 % ((arg2 - 13) / 38);
        for (class119 var8 = (class119) class266.field3707.method948(42); var8 != null; var8 = (class119) class266.field3707.method938(63)) {
            byte var9 = 1;
            class219 var10 = var8.field1679.method2181(0);
            if (var8.field1679.field5294) {
                var9 = 0;
            } else if (var8.field1679.field5253 == var10.field3054 || var8.field1679.field5253 == var10.field3036 || var8.field1679.field5253 == var10.field3056 || var8.field1679.field5253 == var10.field3063) {
                var9 = 2;
            } else if (var8.field1679.field5253 == var10.field3052 || var8.field1679.field5253 == var10.field3042 || var8.field1679.field5253 == var10.field3037 || var8.field1679.field5253 == var10.field3044) {
                var9 = 3;
            }
            if (var8.field1667 != var9) {
                int var11 = class328.method2116(var8.field1679, (byte) -29);
                if (var8.field1682 != var11) {
                    if (var8.field1681 != null) {
                        class325.field4996.method1274(var8.field1681);
                        var8.field1681 = null;
                    }
                    var8.field1682 = var11;
                }
                var8.field1667 = var9;
            }
            var8.field1669 = var8.field1679.field2217;
            var8.field1668 = var8.field1679.field2217 + (var8.field1679.method2091(-15245) << 6);
            var8.field1680 = var8.field1679.field2215;
            var8.field1666 = var8.field1679.field2215 + (var8.field1679.method2091(-15245) << 6);
            class145.method967(arg1, 0, arg3, arg0, var8, arg4);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)[Lmg;", line = 121)
    public static final class168[] method1167(int arg0) {
        if (class423.field6311 == null) {
            class168[] var1 = class65.method436(class419.field6254, 118);
            class168[] var2 = new class168[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class168 var8 = var1[var4];
                if ((var8.field2439 <= 0 || var8.field2439 >= 24) && var8.field2441 >= 800 && var8.field2437 >= 600 && (class455.field6684 >= 96 || class441.field6563 != 0 || var8.field2441 <= 1024 && var8.field2437 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class168 var10 = var2[var9];
                        if (var8.field2441 == var10.field2441 && var8.field2437 == var10.field2437) {
                            if (var8.field2439 > var10.field2439) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class423.field6311 = new class168[var3];
            class361.method2280(var2, 0, class423.field6311, 0, var3);
            int[] var5 = new int[class423.field6311.length];
            for (int var6 = 0; var6 < class423.field6311.length; var6++) {
                class168 var7 = class423.field6311[var6];
                var5[var6] = var7.field2441 * var7.field2437;
            }
            class471.method2828(113, class423.field6311, var5);
        }
        field2419++;
        return arg0 == 0 ? class423.field6311 : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I", line = 208)
    public static final int method1168(int arg0, int arg1) {
        field2415++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg0 != 1) {
            return -70;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 256)
    public static void method1169(byte arg0) {
        field2416 = null;
        if (arg0 > -120) {
            field2417 = null;
        }
        field2417 = null;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 268)
    public class166(Throwable arg0, String arg1) {
        this.field2418 = arg0;
        this.field2413 = arg1;
    }
}
