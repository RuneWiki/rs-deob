import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class203 {

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lda;")
    public static class275 field3454 = class255.method1672(124, "headicons_prayer");

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lda;")
    public static class275 field3451 = class255.method1672(117, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "S")
    public static short field3453 = 256;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lda;")
    public static class275 field3450 = class255.method1672(124, "<col=ffff00>");

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "Lda;")
    public static class275 field3458 = class255.method1672(94, ": ");

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Lda;")
    public static class275 field3459 = class255.method1672(126, "Untersuchen");

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        if (arg0 != -24671) {
            method1328(-44, true);
        }
        field3450 = null;
        field3451 = null;
        field3459 = null;
        field3454 = null;
        field3458 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            return;
        }
        field3457++;
        if (arg3 < 1 || arg7 < 1 || arg3 > 102 || arg7 > 102) {
            return;
        }
        if (!class262.method1714(-1) && (class72.field1168[0][arg3][arg7] & 0x2) == 0) {
            int var8 = arg6;
            if ((class72.field1168[arg6][arg3][arg7] & 0x8) != 0) {
                var8 = 0;
            }
            if (class122.field2185 != var8) {
                return;
            }
        }
        int var9 = arg6;
        if (arg6 < 3 && (class72.field1168[1][arg3][arg7] & 0x2) == 2) {
            var9 = arg6 + 1;
        }
        class143.method1025(arg6, arg3, var9, class173.field3003[arg6], arg7, arg5, (byte) -85);
        if (arg2 < 0) {
            return;
        }
        boolean var10 = class77.field1284;
        class77.field1284 = true;
        class46.method275(var9, arg2, arg6, arg3, false, arg4, arg7, false, arg0, class173.field3003[arg6], arg1 - 235390930);
        class77.field1284 = var10;
        return;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1325(int arg0, int[] arg1) {
        field3449++;
        if (arg1 == null) {
            return null;
        }
        int[] var2 = new int[arg1.length];
        if (arg0 != -30182) {
            method1328(-38, true);
        }
        class154.method1086(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static final void method1326(byte arg0) {
        field3452++;
        int var1 = -114 % ((arg0 - 72) / 50);
        if (class200.field3427 == 30) {
            class265.method1746((byte) -52, 25);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)[Lrj;")
    public static final class13[] method1327(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field3448++;
        class13[] var1 = new class13[class151.field2633];
        for (int var2 = 0; var2 < class151.field2633; var2++) {
            var1[var2] = new class20(class267.field4646, class250.field4419, class114.field2010[var2], class246.field4357[var2], class152.field2662[var2], class32.field480[var2], class67.field1101[var2], class270.field4695);
        }
        class134.method978(arg0 ^ 0x63);
        return var1;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZ)V")
    public static final void method1328(int arg0, boolean arg1) {
        field3456++;
        int var2 = class248.field4369.length;
        if (arg0 >= -47) {
            field3450 = null;
        }
        byte[][] var3 = class115.field2045;
        for (int var4 = 0; var4 < var2; var4++) {
            byte[] var5 = var3[var4];
            if (var5 != null) {
                int var6 = (class61.field1031[var4] >> 8) * 64 - class16.field237;
                int var7 = (class61.field1031[var4] & 0xFF) * 64 - class234.field4083;
                class160.method1116(true);
                class3.method14(class173.field3003, var7, 2, arg1, var5, var6);
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IJ)Lda;")
    public static final class275 method1329(int arg0, long arg1) {
        field3455++;
        if (arg0 != 1) {
            method1326((byte) 50);
        }
        return class170.method1164(arg1, false, 10, -2);
    }
}
