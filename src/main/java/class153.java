import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class153 {

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field2347 = 0;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2345 = -1;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2348 = -2;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1027(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class75.field1257 * arg0 + class224.field3526 * arg3 >> 16;
        int var6 = class75.field1257 * arg3 - class224.field3526 * arg0 >> 16;
        int var7 = class84.field1385 * arg1 + class127.field1993 * var6 >> 16;
        int var8 = class127.field1993 * arg1 - class84.field1385 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class84.field1385 * arg2 + class127.field1993 * var6 >> 16;
        int var12 = class127.field1993 * arg2 - class84.field1385 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class160.field2452 && var13 < class160.field2452) {
            return false;
        } else if (var9 > class285.field4486 && var13 > class285.field4486) {
            return false;
        } else if (var10 < class254.field3901 && var14 < class254.field3901) {
            return false;
        } else {
            return var10 <= class124.field1960 || var14 <= class124.field1960;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
    public static final void method1028(int arg0) {
        field2343++;
        class61.field988.method1764(1407621134);
        class219.field3420 = null;
        class295.field4641 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)I")
    public static final int method1029(int arg0, int arg1) {
        if (arg0 != 255) {
            method1030(false, 112, 2, 39);
        }
        field2346++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIII)V")
    public static final void method1030(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1729) {
            return;
        }
        field2349++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class230.field3589 = arg0;
        class292.field4598 = arg2;
        class234.field3622 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Luf;B)V")
    public static final void method1031(class176 arg0, byte arg1) {
        field2344++;
        class127.field1992 = arg0;
        if (arg1 != 5) {
            method1029(70, 80);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lag;IIB)V")
    public static final void method1032(class188 arg0, int arg1, int arg2, byte arg3) {
        field2342++;
        if (class220.field3450 < 2 && class90.field1458 == 0 && !class179.field2678) {
            return;
        }
        if (arg3 > -109) {
            method1029(52, 100);
        }
        String var4 = class66.method524(-3);
        if (arg0 == null) {
            int var6 = class123.field1925.method36(var4, arg2 + 4, arg1 - -15, 16777215, 0, class71.field1133, class222.field3469);
            class178.method1187(0, arg1, arg2 + 4, class123.field1925.method10(var4) - -var6, 15);
            return;
        }
        class2 var5 = arg0.method1272((byte) -70, class111.field1746);
        if (var5 == null) {
            var5 = class123.field1925;
        }
        var5.method29(var4, arg2, arg1, arg0.field2922, arg0.field2928, arg0.field2934, arg0.field2879, arg0.field2914, arg0.field2844, class71.field1133, class222.field3469, class74.field1240);
        class178.method1187(0, class74.field1240[1], class74.field1240[0], class74.field1240[2], class74.field1240[3]);
    }
}
