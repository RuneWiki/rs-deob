import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1709 = 0;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lne;")
    public static class235 field1708 = new class235(32);

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "S")
    public static short field1715 = 205;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "B")
    public static byte field1711;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIILse;)V", line = 8)
    public static final void method782(int arg0, int arg1, int arg2, class12 arg3) {
        if (arg1 != 1644) {
            return;
        }
        field1707++;
        if (arg3.field4240 == arg2 && arg2 != -1) {
            class141 var4 = class133.method851(arg2, 106);
            int var5 = var4.field2167;
            if (var5 == 1) {
                arg3.field4226 = 0;
                arg3.field4216 = arg0;
                arg3.field4174 = 1;
                arg3.field4258 = 0;
                arg3.field4257 = 0;
                class18.method114(arg3.field4162, arg3.field4258, arg3.field4231, var4, class85.field1176 == arg3, 28972);
            }
            if (var5 == 2) {
                arg3.field4226 = 0;
            }
        } else if (arg2 == -1 || arg3.field4240 == -1 || class133.method851(arg2, arg1 - 1534).field2152 >= class133.method851(arg3.field4240, arg1 - 1537).field2152) {
            arg3.field4174 = 1;
            arg3.field4262 = arg3.field4180;
            arg3.field4257 = 0;
            arg3.field4226 = 0;
            arg3.field4258 = 0;
            arg3.field4240 = arg2;
            arg3.field4216 = arg0;
            if (arg3.field4240 != -1) {
                class18.method114(arg3.field4162, arg3.field4258, arg3.field4231, class133.method851(arg3.field4240, 105), class85.field1176 == arg3, 28972);
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 62)
    public static final void method783(int arg0) {
        field1706++;
        if (arg0 != 159) {
            field1712 = 77;
        }
        class268.field4518 = true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 97)
    public static void method784(boolean arg0) {
        field1708 = null;
        if (arg0) {
            field1715 = -20;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 108)
    public static final String method785(String arg0, String arg1, int arg2, String arg3) {
        if (arg2 > -83) {
            field1712 = 19;
        }
        field1705++;
        for (int var4 = arg0.indexOf(arg3); var4 != -1; var4 = arg0.indexOf(arg3, arg1.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(arg3.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I", line = 126)
    public static final int method786(int arg0, int arg1) {
        if (arg1 != 255) {
            return 27;
        }
        field1710++;
        if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }
}
