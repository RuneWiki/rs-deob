import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class195 {

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "Lcg;")
    public static class168 field3072 = null;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "[I")
    public static int[] field3075 = new int[14];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "Luf;")
    public static class176 field3078;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
    public static boolean field3070;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lva;")
    public static final class35 method1306(int arg0, int arg1) {
        field3071++;
        class35 var2 = (class35) class250.field3850.method1701(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class171.field2547.method1163(0, arg1, 48);
        } else {
            var3 = class235.field3650.method1163(0, arg1 & 0x7FFF, 48);
        }
        class35 var4 = new class35();
        if (arg0 != 28489) {
            method1311(49, -115, 21);
        }
        if (var3 != null) {
            var4.method272(new class37(var3), (byte) -105);
        }
        if (arg1 >= 32768) {
            var4.method276(arg0 + 4279);
        }
        class250.field3850.method1704((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V")
    public static final void method1307(int arg0, int arg1, int arg2) {
        field3077++;
        if (arg0 >= -125) {
            method1311(-48, -56, -79);
        }
        class149 var3 = class293.field4613[class274.field4318][arg2][arg1];
        if (var3 == null) {
            class231.method1523(class274.field4318, arg2, arg1);
            return;
        }
        int var4 = -99999999;
        class50 var5 = null;
        for (class50 var6 = (class50) var3.method1010(112); var6 != null; var6 = (class50) var3.method1008((byte) 88)) {
            class123 var13 = class32.method260(var6.field803.field3477, true);
            int var14 = var13.field1909;
            if (var13.field1906 == 1) {
                var14 = (var6.field803.field3464 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class231.method1523(class274.field4318, arg2, arg1);
            return;
        }
        var3.method1007((byte) 89, var5);
        class50 var7 = (class50) var3.method1010(117);
        class222 var8 = null;
        class222 var9 = null;
        while (var7 != null) {
            class222 var12 = var7.field803;
            if (var5.field803.field3477 != var12.field3477) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field3477 != var12.field3477 && var8 == null) {
                    var8 = var12;
                }
            }
            var7 = (class50) var3.method1008((byte) 88);
        }
        long var10 = (long) ((arg1 << 7) + arg2 + 1610612736);
        class11.method120(class274.field4318, arg2, arg1, class224.method1502((byte) -126, class274.field4318, arg1 * 128 + 64, arg2 * 128 + 64), var5.field803, var10, var9, var8);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static void method1308(byte arg0) {
        field3072 = null;
        field3078 = null;
        if (arg0 <= 102) {
            method1309(-54, (char) 65489);
        }
        field3075 = null;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IC)Z")
    public static final boolean method1309(int arg0, char arg1) {
        if (arg0 != 65) {
            method1307(-66, -123, 61);
        }
        field3073++;
        return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static final void method1310(byte arg0) {
        field3068++;
        int var1 = -96 / ((arg0 + 17) / 41);
        for (int var2 = -1; var2 < class5.field78; var2++) {
            int var3;
            if (var2 == -1) {
                var3 = 2047;
            } else {
                var3 = class166.field2510[var2];
            }
            class28 var4 = class41.field675[var3];
            if (var4 != null) {
                class74.method585(var4, var4.method226((byte) -97), 111);
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)Leb;")
    public static final class247 method1311(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        return var3 == null ? null : var3.field356;
    }
}
