import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class624 extends class644 {

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[B")
    public byte[] field8575;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field8574;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method3502(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Liv;", line = 13)
    public static final class100 method3503(int arg0, int arg1) {
        field8574++;
        class100[] var2 = class453.method2541(2);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class100 var4 = var2[var3];
            if (var4.field1386 == arg0) {
                return var4;
            }
        }
        if (arg1 > -27) {
            field8577 = -105;
        }
        return null;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V", line = 40)
    public class624(byte[] arg0) {
        this.field8575 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZILwf;Lwf;)I", line = 49)
    public static final int method3504(int arg0, boolean arg1, int arg2, class138 arg3, class138 arg4) {
        field8576++;
        if (arg2 == 1) {
            int var5 = arg3.field2101;
            int var6 = arg4.field2101;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 != -10105) {
            return -77;
        } else if (arg2 == 2) {
            return class459.method2560(arg4.method1012(-2).field10617, (byte) 0, class243.field3143, arg3.method1012(-2).field10617);
        } else if (arg2 == 3) {
            if (arg3.field1975.equals("-")) {
                if (arg4.field1975.equals("-")) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1975.equals("-")) {
                return arg1 ? 1 : -1;
            } else {
                return class459.method2560(arg4.field1975, (byte) 0, class243.field3143, arg3.field1975);
            }
        } else if (arg2 == 4) {
            if (arg3.method1075(arg0 ^ 0xFFFFD8F3)) {
                return arg4.method1075(114) ? 0 : 1;
            } else if (arg4.method1075(125)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg3.method1078(-1)) {
                return arg4.method1078(-1) ? 0 : 1;
            } else if (arg4.method1078(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg3.method1077(arg0 + 10121)) {
                return arg4.method1077(16) ? 0 : 1;
            } else if (arg4.method1077(arg0 + 10121)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg3.method1076((byte) 115)) {
                return arg4.method1076((byte) 51) ? 0 : 1;
            } else if (arg4.method1076((byte) 67)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg3.field1978;
            int var8 = arg4.field1978;
            if (arg1) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg3.field1979 - arg4.field1979;
        }
    }
}
