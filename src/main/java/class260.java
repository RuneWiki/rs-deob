import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class260 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Lmf;")
    public static class291 field3968 = new class291();

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "Lpb;")
    public static class469 field3970;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1668(boolean arg0) {
        field3965++;
        if (arg0) {
            method1672(-43);
        }
        class523.method3093(true);
        class336.method2112(22050, true, 2, class186.field2990.field2559);
        class99.field1922 = class318.method2023(class497.field7305, (byte) -96, class262.field4007, 22050, 0);
        class99.field1922.method1491(4423, class215.field3400);
        class52.field1122 = class318.method2023(class497.field7305, (byte) -96, class262.field4007, 2048, 1);
        class52.field1122.method1491(4423, class288.field4357);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1669(int arg0) {
        field3966++;
        if (arg0 > -65) {
            method1672(-81);
        }
        int var1 = class229.field3560;
        int[] var2 = class316.field4782;
        for (int var3 = 0; var3 < var1; var3++) {
            class366 var9 = class73.field1444[var2[var3]];
            if (var9 != null && var9.field7766 > 0) {
                var9.field7766--;
                if (var9.field7766 == 0) {
                    var9.field7777 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class341.field5128; var4++) {
            long var5 = (long) class515.field7477[var4];
            class435 var7 = (class435) class209.field3337.method1622(var5, 120);
            if (var7 != null) {
                class163 var8 = var7.field6471;
                if (var8.field7766 > 0) {
                    var8.field7766--;
                    if (var8.field7766 == 0) {
                        var8.field7777 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILnk;II)V", line = 83)
    public static final void method1670(int arg0, int arg1, class506 arg2, int arg3, int arg4) {
        field3967++;
        long var5 = (long) (arg3 | arg0 << 14 | arg1 << 28);
        class354 var7 = (class354) class169.field2757.method1622(var5, -112);
        if (var7 == null) {
            class354 var8 = new class354();
            class169.field2757.method1618(var8, var5, -1);
            var8.field5220.method1885(false, arg2);
            return;
        }
        class12 var9 = class135.field2271.method1636(arg2.field7376, -113);
        if (arg4 != 0) {
            field3970 = null;
        }
        int var10 = var9.field193;
        if (var9.field200 == 1) {
            var10 = (arg2.field7375 + 1) * var10;
        }
        for (class506 var11 = (class506) var7.field5220.method1892(126); var11 != null; var11 = (class506) var7.field5220.method1893((byte) -2)) {
            class12 var12 = class135.field2271.method1636(var11.field7376, arg4 ^ 0xFFFFFF98);
            int var13 = var12.field193;
            if (var12.field200 == 1) {
                var13 = (var11.field7375 + 1) * var13;
            }
            if (var10 > var13) {
                class520.method3082(arg2, var11, (byte) 108);
                return;
            }
        }
        var7.field5220.method1885(false, arg2);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IC)B", line = 138)
    public static final byte method1671(int arg0, char arg1) {
        field3969++;
        if (arg0 != 7763) {
            return 110;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 270)
    public static void method1672(int arg0) {
        field3970 = null;
        field3968 = null;
        if (arg0 != -8227) {
            field3970 = null;
        }
    }
}
