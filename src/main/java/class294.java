import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class294 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "Lat;")
    public static class444 field3967 = null;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field3971 = 1338;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "Lln;")
    public static class71 field3973;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 3)
    public static void method1699(int arg0) {
        if (arg0 != -17422) {
            field3973 = null;
        }
        field3967 = null;
        field3973 = null;
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1700(int arg0) {
        class40.field602 = 0;
        class320.field4411 = new class441[50];
        int var1 = 39 % ((-arg0 - 58) / 40);
        field3970++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1701(byte arg0) {
        field3972++;
        class453 var1 = null;
        try {
            class464 var2 = class346.field4985.method1199(-14340, "2", true);
            while (var2.field6699 == 0) {
                class334.method2047(1L, 0);
            }
            if (var2.field6699 == 1) {
                var1 = (class453) var2.field6695;
                class319 var3 = new class319(class146.field2213 * 6 + 3);
                var3.method1891(false, 1);
                var3.method1857(561746448, class146.field2213);
                for (int var4 = 0; var4 < class451.field6614.length; var4++) {
                    if (class308.field4189[var4]) {
                        var3.method1857(561746448, var4);
                        var3.method1858(class451.field6614[var4], (byte) -95);
                    }
                }
                var1.method2662(var3.field4360, (byte) 97, var3.field4336, 0);
            }
        } catch (Exception var7) {
        }
        try {
            int var5 = -16 / ((arg0 - 13) / 38);
            if (var1 != null) {
                var1.method2659(-1);
            }
        } catch (Exception var6) {
        }
        class420.field6080 = class254.method1522((byte) -51);
        class267.field3590 = false;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lza;Z)V", line = 83)
    public static final void method1702(class295 arg0, boolean arg1) {
        field3974++;
        int var2 = class110.field1797;
        int var3 = class27.field371;
        int var4 = class72.field1031;
        int var5 = class334.field4880;
        int var6 = -10660793;
        arg0.method1712(var5, 0, var6, var4, var3, var2);
        arg0.method1712(16, 0, -16777216, var4 - 2, var3 - -1, var2 + 1);
        arg0.method1707((byte) 55, -16777216, var4 - 2, var3 + 18, var5 - 19, var2 + 1);
        class108.field1751.method1769(var3 + 14, var2 + 3, class41.field608.method1126(class486.field6998, (byte) -19), var6, 0, -1);
        int var7 = class113.field1820.method55((byte) -37);
        int var8 = class113.field1820.method62((byte) 59);
        int var9 = 0;
        if (!arg1) {
            field3971 = -23;
        }
        for (class440 var10 = (class440) class391.field5638.method3137(0); var10 != null; var10 = (class440) class391.field5638.method3132(0)) {
            int var11 = var3 + ((-var9 + -1 + class527.field7690) * 16) + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < (var2 + var4) && var11 - 13 < var8 && (var11 + 3) > var8 && var10.field6339) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class302.method1752(86, var10.field6337)) {
                var13 = class534.field7872.method3089((int) var10.field6334, -122).field4072;
            } else if (var10.field6336 != -1) {
                var13 = class534.field7872.method3089(var10.field6336, 119).field4072;
            } else if (class339.method2062((byte) 73, var10.field6337)) {
                class326 var14 = (class326) class281.field3826.method1592((byte) -25, (long) ((int) var10.field6334));
                if (var14 != null) {
                    class209 var15 = var14.field4455;
                    class83 var16 = var15.field2976;
                    if (var16.field1272 != null) {
                        var16 = var16.method655(class309.field4200, (byte) 119);
                    }
                    if (var16 != null) {
                        var13 = var16.field1278;
                    }
                }
            } else if (class288.method1653(var10.field6337, (byte) -61)) {
                Object var17 = null;
                class103 var18;
                if (var10.field6337 == 1009) {
                    var18 = class452.field6629.method603((byte) 115, (int) var10.field6334);
                } else {
                    var18 = class452.field6629.method603((byte) 104, (int) (var10.field6334 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field1613 != null) {
                    var18 = var18.method795(-31036, class309.field4200);
                }
                if (var18 != null) {
                    var13 = var18.field1650;
                }
            }
            String var19 = class219.method1368(var10, (byte) 111);
            if (var13 != null) {
                var19 = var19 + class413.method2430(0, var13);
            }
            class108.field1751.method1760(class288.field3907, var2 + 3, class271.field3684, var12, var19, -4713, var11, 0);
            if (var10.field6340) {
                class108.field1749.method2142((var2 + class80.field1127.method416(8364, var19)) + 5, var11 + -12);
            }
            var9++;
        }
        class346.method2084(!arg1, class72.field1031, class110.field1797, class334.field4880, class27.field371);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BI)C", line = 193)
    public static final char method1703(byte arg0, int arg1) {
        field3969++;
        if (arg1 != -833419040) {
            method1699(-62);
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class224.field3172[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
