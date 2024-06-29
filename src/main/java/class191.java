import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class191 {

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Llja;")
    public static class744 field2288 = new class744(62, 4);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "J")
    public static long field2287;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZLcf;Lcf;I)I")
    public static final int method1251(int arg0, boolean arg1, class631 arg2, class631 arg3, int arg4) {
        field2285++;
        if (arg4 == 1) {
            int var5 = arg2.field1122;
            int var6 = arg3.field1122;
            if (!arg1) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class547.method3220(class770.field10592, true, arg2.method3567(3).field7794, arg3.method3567(arg0 - 6485).field7794);
        } else if (arg4 == 3) {
            if (arg2.field8620.equals("-")) {
                if (arg3.field8620.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field8620.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class547.method3220(class770.field10592, true, arg2.field8620, arg3.field8620);
            }
        } else if (arg4 == 4) {
            if (arg2.method782(99)) {
                return arg3.method782(99) ? 0 : 1;
            } else if (arg3.method782(99)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method780(-25551)) {
                return arg3.method780(arg0 ^ 0xFFFF8569) ? 0 : 1;
            } else if (arg3.method780(-25551)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method779(3791)) {
                return arg3.method779(arg0 ^ 0x1797) ? 0 : 1;
            } else if (arg3.method779(3791)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg2.method783(95)) {
                return arg3.method783(arg0 - 6465) ? 0 : 1;
            } else if (arg3.method783(arg0 ^ 0x1944)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg2.field8618;
            int var8 = arg3.field8618;
            if (arg1) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            if (arg0 != 6488) {
                field2289 = -90;
            }
            return arg2.field8622 - arg3.field8622;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1252(int arg0) {
        if (arg0 == -16731) {
            field2288 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1253(byte arg0, int arg1) {
        field2286++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class637.field8708.method3584(class770.field10592, true) + " (" + var2 + ")</col>";
        } else {
            int var4 = 53 / ((arg0 + 12) / 37);
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class637.field8710.method3584(class770.field10592, true) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }
}
