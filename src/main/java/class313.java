import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class313 extends class134 {

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "J")
    public long field5041;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "J")
    public static long field5038 = 0L;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    public static int[] field5047 = new int[32];

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field5040 = 0;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field5043 = 0;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "[I")
    public static int[] field5049;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "[I")
    public static int[] field5050;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "J")
    public static long field5039;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public static void method2117(int arg0) {
        if (arg0 <= 17) {
            field5040 = 44;
        }
        field5049 = null;
        field5050 = null;
        field5047 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)V")
    public static final void method2118(int arg0, int arg1, int arg2) {
        class270 var3 = class49.method304(104, arg0);
        int var4 = var3.field4425;
        field5048++;
        int var5 = var3.field4427;
        int var6 = var3.field4424;
        int var7 = field5047[var6 - var5];
        int var8 = 76 % ((arg1 + 21) / 52);
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var9 = var7 << var5;
        class189.method1282((byte) 123, arg2 << var5 & var9 | ~var9 & class209.field3356[var4], var4);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method2119(String arg0, byte arg1) {
        if (arg1 != -14) {
            method2117(23);
        }
        field5037++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)Lti;")
    public static final class5 method2120(int arg0) {
        field5044++;
        if (arg0 <= 96) {
            method2121((class74) null, -28, -44, 63, 36);
        }
        class5 var1 = new class5(class196.field3118, class268.field4396, class239.field3781[0], class272.field4457[0], class184.field2854[0], class263.field4341[0], class56.field758[0], class12.field157);
        class270.method1856(98);
        return var1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ltd;IIII)V")
    public static final void method2121(class74 arg0, int arg1, int arg2, int arg3, int arg4) {
        field5036++;
        class145 var5 = (class145) class226.field3589.method1959(205);
        if (arg1 != 8) {
            field5049 = null;
        }
        while (var5 != null) {
            if (var5.field2282 == arg3 && (arg4 * 128) == var5.field2285 && arg2 * 128 == var5.field2277 && var5.field2283.field1166 == arg0.field1166) {
                if (var5.field2290 != null) {
                    class71.field1024.method597(var5.field2290);
                    var5.field2290 = null;
                }
                if (var5.field2286 != null) {
                    class71.field1024.method597(var5.field2286);
                    var5.field2286 = null;
                }
                var5.method900(94);
                return;
            }
            var5 = (class145) class226.field3589.method1956(79);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[B)V")
    public static final void method2122(int arg0, byte[] arg1) {
        field5046++;
        class202 var2 = new class202(arg1);
        var2.field3272 = arg1.length - 2;
        class230.field3697 = var2.method1419(111);
        class239.field3781 = new int[class230.field3697];
        class272.field4457 = new int[class230.field3697];
        class117.field1771 = new boolean[class230.field3697];
        class56.field758 = new byte[class230.field3697][];
        class184.field2854 = new int[class230.field3697];
        class263.field4341 = new int[class230.field3697];
        class224.field3568 = new byte[class230.field3697][];
        var2.field3272 = arg1.length - (class230.field3697 * 8) - 7;
        class196.field3118 = var2.method1419(126);
        class268.field4396 = var2.method1419(96);
        int var3 = arg0 + (var2.method1420((byte) 0) & 0xFF);
        for (int var4 = 0; var4 < class230.field3697; var4++) {
            class239.field3781[var4] = var2.method1419(115);
        }
        for (int var5 = 0; var5 < class230.field3697; var5++) {
            class272.field4457[var5] = var2.method1419(71);
        }
        for (int var6 = 0; var6 < class230.field3697; var6++) {
            class184.field2854[var6] = var2.method1419(120);
        }
        for (int var7 = 0; var7 < class230.field3697; var7++) {
            class263.field4341[var7] = var2.method1419(88);
        }
        var2.field3272 = arg1.length - ((class230.field3697 * 8) + 7) - ((var3 - 1) * 3);
        class12.field157 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class12.field157[var8] = var2.method1401((byte) -85);
            if (class12.field157[var8] == 0) {
                class12.field157[var8] = 1;
            }
        }
        var2.field3272 = 0;
        for (int var9 = 0; var9 < class230.field3697; var9++) {
            int var10 = class184.field2854[var9];
            int var11 = class263.field4341[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class56.field758[var9] = var13;
            boolean var15 = false;
            class224.field3568[var9] = var14;
            int var16 = var2.method1420((byte) 0);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method1457((byte) -107);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var14[var18] = var2.method1457((byte) -59);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var10 <= var21) {
                                break label97;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var14[var10 * var22 + var21] = var2.method1457((byte) -126);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var13[var10 * var24 + var20] = var2.method1457((byte) -75);
                    }
                    var20++;
                }
            }
            class117.field1771[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class313() {
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(J)V")
    public class313(long arg0) {
        this.field5041 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLfa;I)Lh;")
    public static final class294 method2123(byte arg0, class273 arg1, int arg2) {
        if (arg0 >= -51) {
            field5049 = null;
        }
        field5045++;
        return class124.method823(2, arg1, arg2) ? class184.method1220(-116) : null;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field5047[var1] = var0 - 1;
            var0 += var0;
        }
        field5049 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
        field5050 = new int[32];
    }
}
