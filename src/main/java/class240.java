import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class240 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3757 = "glow3:";

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lbm;")
    public static class307 field3754;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lbi;")
    public static class71 field3751;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZBLvj;ILvj;ZI)I", line = 9)
    public static final int method1589(boolean arg0, byte arg1, class103 arg2, int arg3, class103 arg4, boolean arg5, int arg6) {
        field3752++;
        int var7 = class268.method1791(arg2, arg3, arg4, arg0, arg1 ^ 0x1E78);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else if (arg1 == -82) {
            int var8 = class268.method1791(arg2, arg6, arg4, arg5, -7722);
            return arg5 ? -var8 : var8;
        } else {
            return 121;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 46)
    public static void method1590(int arg0) {
        field3757 = null;
        field3751 = null;
        if (arg0 != 0) {
            method1592(55, -91, -47);
        }
        field3754 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZIIJ)Ljava/lang/String;", line = 59)
    public static final String method1591(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
        field3755++;
        if (arg3 >= 0) {
            method1589(false, (byte) 13, (class103) null, -69, (class103) null, false, 34);
        }
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var6 = '.';
            var7 = ',';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V", line = 155)
    public static final void method1592(int arg0, int arg1, int arg2) {
        field3753++;
        class55 var3 = class62.field1186[class289.field4438][arg0][arg2];
        if (var3 == null) {
            class326.method2257(class289.field4438, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class173 var5 = null;
        for (class173 var6 = (class173) var3.method424(-90); var6 != null; var6 = (class173) var3.method425(-32547)) {
            class337 var7 = class95.method636(22111, var6.field2779.field2313);
            int var8 = var7.field5191;
            if (var7.field5200 == 1) {
                var8 = (var6.field2779.field2323 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class326.method2257(class289.field4438, arg0, arg2);
            return;
        }
        class140 var9 = null;
        class140 var10 = null;
        int var11 = -8 % ((-arg1 - 73) / 43);
        var3.method429(var5, (byte) 127);
        for (class173 var12 = (class173) var3.method424(-79); var12 != null; var12 = (class173) var3.method425(-32547)) {
            class140 var13 = var12.field2779;
            if (var5.field2779.field2313 != var13.field2313) {
                if (var10 == null) {
                    var10 = var13;
                }
                if (var10.field2313 != var13.field2313 && var9 == null) {
                    var9 = var13;
                }
            }
        }
        long var14 = (long) (arg0 + (arg2 << 7) + 1610612736);
        class281.method1892(class289.field4438, arg0, arg2, class325.method2250(arg2 * 128 + 64, 22771, class289.field4438, arg0 * 128 + 64), var5.field2779, var14, var10, var9);
    }
}
