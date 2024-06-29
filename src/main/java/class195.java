import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class195 {

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field3106 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lik;")
    public static class259 field3099 = new class259(200);

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field3108 = 100;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[[[I")
    public static int[][][] field3109 = new int[2][][];

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
    public static int field3111 = 0;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "[Lai;")
    public static class126[] field3107;

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "[[[B")
    public static byte[][][] field3110;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BIZI)Ljava/lang/String;", line = 4)
    public static final String method1424(byte arg0, int arg1, boolean arg2, int arg3) {
        field3102++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg2 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg1;
                int var9 = var8 - arg1 * arg3;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg0 != -90) {
                method1427(95);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg1);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIIIII)I", line = 52)
    public static final int method1425(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg5;
            arg5 = var7;
        }
        int var8 = arg6 & 0x3;
        field3101++;
        if (arg1 != -80) {
            method1425(-71, (byte) 15, 52, 90, -86, -27, -38);
        }
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return 7 + 1 - arg2 - arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg5 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 86)
    public static void method1426(int arg0) {
        field3109 = (int[][][]) null;
        field3110 = (byte[][][]) null;
        field3107 = null;
        if (arg0 < -45) {
            field3099 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I", line = 108)
    public static final int method1427(int arg0) {
        field3103++;
        if (class179.field2792) {
            return 0;
        } else if (class34.method248(-110)) {
            int var1 = 115 % ((53 - arg0) / 61);
            return class128.field2040 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 126)
    public static final void method1428(int arg0, byte arg1) {
        field3105++;
        class152.field2447.method1828(arg0, (byte) 118);
        if (arg1 != -28) {
            field3106 = 80;
        }
        class13.field242.method1828(arg0, (byte) 99);
    }
}
