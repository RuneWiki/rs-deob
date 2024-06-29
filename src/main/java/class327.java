import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class327 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5091 = "K";

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lwj;")
    public static class270 field5088;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 9)
    public static void method2216(byte arg0) {
        field5088 = null;
        if (arg0 < -43) {
            field5091 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 21)
    public static final int method2217(int arg0, int arg1) {
        field5086++;
        return arg0 < 65 ? -83 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V", line = 40)
    public static final void method2218(int arg0, int arg1) {
        field5089++;
        class338 var2 = class195.method1391(1, (byte) -92, arg1);
        var2.method2347(true);
        int var3 = 46 % ((arg0 - 72) / 53);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 67)
    public static final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5092++;
        class338 var5 = class195.method1391(4, (byte) -92, arg1);
        var5.method2352((byte) 127);
        var5.field5279 = arg4;
        var5.field5290 = arg2;
        if (arg0 != 3) {
            field5094 = 86;
        }
        var5.field5288 = arg3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)Lbn;", line = 84)
    public static final class228 method2220(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2194;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILkh;I)Lpb;", line = 93)
    public static final class2 method2221(int arg0, class166 arg1, int arg2) {
        field5087++;
        class2 var3 = new class2(arg2, arg1.method1179((byte) -121), arg1.method1179((byte) 120), arg1.method1137(-70), arg1.method1137(66), arg1.method1178(0) == 1, arg1.method1178(0));
        int var4 = arg1.method1178(0);
        if (arg0 < 39) {
            return (class2) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field30.method632(-43, new class256(arg1.method1178(0), arg1.method1178(0), arg1.method1151(-75), arg1.method1151(-77), arg1.method1151(-50), arg1.method1151(-81), arg1.method1151(-84), arg1.method1151(-56), arg1.method1151(-60), arg1.method1151(-64)));
        }
        var3.method11((byte) 92);
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBI)I", line = 123)
    public static final int method2222(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field5095++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg2 >= -66) {
                method2218(13, -97);
            }
            return var4 == 2 ? 7 - arg1 : -arg3 + 7;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BIII)I", line = 147)
    public static final int method2223(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 42) {
            field5090 = 93;
        }
        int var4 = arg1 & 0x3;
        field5093++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg3;
        }
    }
}
