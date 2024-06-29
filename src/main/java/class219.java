import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class219 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3771 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Leb;")
    private static class230 field3770 = class68.method589(0, "Loaded config");

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Leb;")
    public static class230 field3768 = field3770;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public static final void method1504(int arg0, int arg1) {
        int var2 = -22 % (-arg1 / 55);
        field3773++;
        if (arg0 == -1 || !class202.method1422(arg0, true)) {
            return;
        }
        class245[] var3 = class99.field1839[arg0];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class245 var5 = var3[var4];
            if (var5.field4291 != null) {
                class75 var6 = new class75();
                var6.field1354 = var5;
                var6.field1364 = var5.field4291;
                class212.method1473((byte) -82, var6, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIILhh;II)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, class116 arg4, int arg5, int arg6) {
        field3769++;
        long var7 = 0L;
        if (arg3 == 0) {
            var7 = class176.method1283(arg5, arg1, arg6);
        } else if (arg3 == 1) {
            var7 = class44.method380(arg5, arg1, arg6);
        } else if (arg3 == 2) {
            var7 = class178.method1297(arg5, arg1, arg6);
        } else if (arg3 == 3) {
            var7 = class191.method1359(arg5, arg1, arg6);
        }
        if (arg0 != 30) {
            return;
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = ((int) var7 & 0x7D04E) >> 14;
        boolean var13 = false;
        int var14 = ((int) var7 & 0x33241E) >> 20;
        class194 var15 = class251.method1776(var11, 65280);
        if (var15.method1376((byte) 48)) {
            class127.method995(arg1, var15, arg6, (byte) 34, arg5);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg3 == 0) {
            class226.method1564(arg5, arg1, arg6);
            if (var15.field3461 != 0) {
                arg4.method927(var12, var15.field3435, arg0 ^ 0xFFFFFFE3, var14, arg1, arg6);
                return;
            }
            return;
        }
        if (arg3 == 1) {
            class271.method1855(arg5, arg1, arg6);
            return;
        }
        if (arg3 == 2) {
            class258.method1803(arg5, arg1, arg6);
            if (var15.field3461 != 0 && arg1 + var15.field3500 < 104 && arg6 + var15.field3500 < 104 && (var15.field3476 + arg1) < 104 && (var15.field3476 + arg6) < 104) {
                arg4.method937(var15.field3435, true, var14, var15.field3476, var15.field3500, arg6, arg1);
                return;
            }
            return;
        }
        if (arg3 != 3) {
            return;
        }
        class88.method716(arg5, arg1, arg6);
        if (var15.field3461 == 1) {
            arg4.method923(arg1, arg6, (byte) -8);
            return;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static final void method1506(int arg0) {
        field3777++;
        class15.field350 = -1;
        class23.field440 = -1;
        class227.field3918 = 0;
        class265.field4717 = 0;
        class153.field2747.field318 = 0;
        class259.field4572 = -1;
        class243.field4188 = false;
        class66.field1239 = 0;
        class34.field639 = 0;
        class186.field3266 = 0;
        class183.field3182.field318 = 0;
        class16.field368 = 0;
        class170.field3013 = -1;
        for (int var1 = 0; var1 < class230.field4011.length; var1++) {
            if (class230.field4011[var1] != null) {
                class230.field4011[var1].field2280 = -1;
            }
        }
        for (int var2 = 0; var2 < class168.field2963.length; var2++) {
            if (class168.field2963[var2] != null) {
                class168.field2963[var2].field2280 = -1;
            }
        }
        class230.method1583((byte) -93);
        class229.field3948 = 1;
        class26.method260(-11, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class71.field1300[var3] = true;
        }
        if (arg0 != -14720) {
            field3770 = null;
        }
        class271.method1853(true);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method1507(byte arg0) {
        field3775++;
        class80.field1454.method1557(115);
        for (int var1 = 0; var1 < 32; var1++) {
            class194.field3440[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class217.field3750[var2] = 0L;
        }
        class275.field4833 = 0;
        if (arg0 != 28) {
            field3774 = -75;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1508(byte arg0) {
        int var1 = -98 % ((50 - arg0) / 39);
        field3768 = null;
        field3770 = null;
    }
}
