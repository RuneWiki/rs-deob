import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class230 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Le;")
    public static class191 field4127 = class54.method368(")3", 2047);

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[I")
    public static int[] field4134 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Z")
    public static boolean field4129 = true;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "Le;")
    public static class191 field4131 = class54.method368("(U", 2047);

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[[B")
    public static byte[][] field4135 = new byte[50][];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lwe;")
    public static class147 field4125 = new class147(64);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lcg;")
    public static class44 field4128;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)I")
    public static final int method1635(boolean arg0, int arg1, int arg2) {
        field4124++;
        if (!arg0) {
            method1636((byte) 2, -82, -85, 59, (class184) null);
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BIIILdk;)V")
    public static final void method1636(byte arg0, int arg1, int arg2, int arg3, class184 arg4) {
        field4126++;
        if (class167.field2824 >= 400) {
            return;
        }
        if (arg4.field3225 != null) {
            arg4 = arg4.method1245((byte) -118);
        }
        if (arg4 == null || !arg4.field3228) {
            return;
        }
        class191 var5 = arg4.field3197;
        if (arg4.field3204 != 0) {
            var5 = class228.method1629(new class191[] { var5, class26.method189(arg4.field3204, false, class175.field2946.field1330), class43.field753, class239.field4245, class92.method563(-122, arg4.field3204), class190.field3335 }, (byte) -30);
        }
        if (arg0 < 114) {
            return;
        }
        if (class192.field3446 == 1) {
            class223.method1549(class266.field4708, (long) arg1, 500, arg3, (short) 30, arg2, class228.method1629(new class191[] { class69.field1216, class178.field3061, var5 }, (byte) -42));
            class243.field4338++;
        } else if (!class197.field3523) {
            class267.field4725++;
            class191[] var6 = arg4.field3218;
            if (class271.field4784) {
                var6 = class236.method1669(var6, false);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class83.field1394 != 0 || !var6[var7].method1351(-23098, class175.field2932))) {
                        class126.field2085++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 17;
                        }
                        if (var7 == 1) {
                            var8 = 12;
                        }
                        if (var7 == 2) {
                            var8 = 42;
                        }
                        if (var7 == 3) {
                            var8 = 25;
                        }
                        if (var7 == 4) {
                            var8 = 5;
                        }
                        class223.method1549(var6[var7], (long) arg1, 500, arg3, var8, arg2, class228.method1629(new class191[] { class107.field1775, var5 }, (byte) -3));
                    }
                }
            }
            if (class83.field1394 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1351(-23098, class175.field2932)) {
                        class9.field90++;
                        short var10 = 0;
                        short var11 = 0;
                        if (arg4.field3204 > class175.field2946.field1330) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 17;
                        }
                        if (var9 == 1) {
                            var11 = 12;
                        }
                        if (var9 == 2) {
                            var11 = 42;
                        }
                        if (var9 == 3) {
                            var11 = 25;
                        }
                        if (var9 == 4) {
                            var11 = 5;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class223.method1549(var6[var9], (long) arg1, 500, arg3, var11, arg2, class228.method1629(new class191[] { class107.field1775, var5 }, (byte) -92));
                    }
                }
            }
            class223.method1549(class149.field2563, (long) arg1, 500, arg3, (short) 1006, arg2, class228.method1629(new class191[] { class107.field1775, var5 }, (byte) -113));
        } else if ((class147.field2482 & 0x2) == 2) {
            class223.method1549(class14.field171, (long) arg1, 500, arg3, (short) 4, arg2, class228.method1629(new class191[] { class45.field806, class178.field3061, var5 }, (byte) -28));
            class61.field1085++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
    public static final boolean method1637(int arg0, int arg1) {
        if (arg0 != -1) {
            field4131 = null;
        }
        field4130++;
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field4135 = null;
        field4134 = null;
        field4128 = null;
        field4125 = null;
        field4127 = null;
        field4131 = null;
        if (arg0 != 0) {
            method1636((byte) -63, -29, 4, -46, (class184) null);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)V")
    public static final void method1639(int arg0, int arg1) {
        class241 var2 = class14.method97(arg1, arg0, arg1 ^ 0xFFFFFF8F);
        field4132++;
        var2.method1691(arg1 - 11);
    }
}
