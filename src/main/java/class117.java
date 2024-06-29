import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class117 {

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Lea;")
    public static class38 field2559 = class9.method46((byte) 118, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
    public static int[] field2562 = new int[50];

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lfa;")
    public static class47 field2561;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lef;I)V")
    public static final void method902(class43 arg0, int arg1) {
        if (arg1 != 10) {
            method908(-26, (byte) -88);
        }
        field2553++;
        int var2 = arg0.field987;
        if (var2 == 324) {
            if (class70.field1749 == -1) {
                class37.field776 = arg0.field1011;
                class70.field1749 = arg0.field996;
            }
            if (class138.field2883.field1774) {
                arg0.field996 = class70.field1749;
            } else {
                arg0.field996 = class37.field776;
            }
        } else if (var2 == 325) {
            if (class70.field1749 == -1) {
                class70.field1749 = arg0.field996;
                class37.field776 = arg0.field1011;
            }
            if (class138.field2883.field1774) {
                arg0.field996 = class37.field776;
            } else {
                arg0.field996 = class70.field1749;
            }
        } else if (var2 == 327) {
            arg0.field930 = 150;
            arg0.field1016 = (int) (Math.sin((double) class45.field1098 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1019 = 5;
            arg0.field980 = 0;
        } else if (var2 == 328) {
            arg0.field930 = 150;
            arg0.field1016 = (int) (Math.sin((double) class45.field1098 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1019 = 5;
            arg0.field980 = 1;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method903(boolean arg0) {
        field2561 = null;
        field2559 = null;
        field2562 = null;
        if (arg0) {
            field2561 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ldd;Lea;ILea;)[Lfa;")
    public static final class47[] method904(class32 arg0, class38 arg1, int arg2, class38 arg3) {
        int var4 = arg0.method207((byte) 32, arg3);
        field2556++;
        if (arg2 == 999999999) {
            int var5 = arg0.method212(arg1, -123, var4);
            return class127.method945(var4, var5, (byte) 0, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)Lea;")
    public static final class38 method905(int arg0, byte arg1) {
        field2558++;
        if (arg1 > -114) {
            method908(70, (byte) -14);
        }
        return arg0 < 999999999 ? class151.method1059(arg0, (byte) -114) : class94.field2116;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Z")
    public static final boolean method906(int arg0) {
        field2560++;
        class57 var1 = class94.field2113;
        synchronized (class94.field2113) {
            if (class97.field2174 == class136.field2858) {
                return false;
            } else if (arg0 == 0) {
                class7.field181 = class199.field3929[class136.field2858];
                class202.field3986 = class178.field3601[class136.field2858];
                class136.field2858 = class136.field2858 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BBI)I")
    public static final int method907(byte[] arg0, byte arg1, int arg2) {
        int var3 = -75 % ((arg1 + 40) / 53);
        field2557++;
        return class197.method1298(arg0, 0, arg2, 448779536);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(IB)Laa;")
    public static final class2 method908(int arg0, byte arg1) {
        class2 var2 = (class2) class17.field344.method1078((byte) 16, (long) arg0);
        field2555++;
        if (arg1 <= 76) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class90.field2057.method215(arg0, 10, 1);
            class2 var4 = new class2();
            var4.field48 = arg0;
            if (var3 != null) {
                var4.method1(2000, new class66(var3));
            }
            var4.method12((byte) 118);
            if (var4.field42 != -1) {
                var4.method3(method908(var4.field42, (byte) 127), method908(var4.field4, (byte) 101), (byte) 117);
            }
            if (!class83.field1972 && var4.field89) {
                var4.field1 = false;
                var4.field84 = 0;
                var4.field39 = null;
                var4.field15 = null;
                var4.field38 = class135.field2838;
            }
            class17.field344.method1076((long) arg0, -4, var4);
            return var4;
        } else {
            return var2;
        }
    }
}
