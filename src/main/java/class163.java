import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class163 {

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Lcc;")
    public static class24 field3266 = new class24(0, 0);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Led;")
    public static class43 field3267 = class191.method1219(" )2>", false);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Led;")
    public static class43 field3268 = class191.method1219("mod_icons", false);

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[[B")
    public static byte[][] field3272 = new byte[50][];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Led;")
    public static class43 field3271 = class191.method1219("Lade Eingabe)2Steuerungsprogramm)3)3)3", false);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBILgb;)V")
    public static final void method1018(int arg0, int arg1, byte arg2, int arg3, class59 arg4) {
        field3269++;
        if (class41.field799 >= 400) {
            return;
        }
        if (arg4.field1209 != null) {
            arg4 = arg4.method372((byte) -82);
        }
        if (arg4 == null || !arg4.field1190) {
            return;
        }
        class43 var5 = arg4.field1208;
        if (arg4.field1177 != 0) {
            var5 = class167.method1036(new class43[] { var5, class67.method421(class67.field1348.field21, arg4.field1177, (byte) -5), class101.field1928, class1.field37, class30.method161(arg4.field1177, 10), class44.field877 }, true);
        }
        if (class161.field3259 == 1) {
            class149.method926(class167.method1036(new class43[] { class193.field3740, class172.field3437, var5 }, true), class200.field3930, 116, arg3, 13, arg0, arg1);
            class139.field2890++;
        } else if (!class174.field3464) {
            class52.field1052++;
            class43[] var6 = arg4.field1216;
            if (class54.field1092) {
                var6 = class124.method803(var6, 5);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method250(63, class65.field1327)) {
                        class36.field647++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 38;
                        }
                        if (var7 == 1) {
                            var8 = 36;
                        }
                        if (var7 == 2) {
                            var8 = 17;
                        }
                        if (var7 == 3) {
                            var8 = 11;
                        }
                        if (var7 == 4) {
                            var8 = 46;
                        }
                        class149.method926(class167.method1036(new class43[] { class18.field306, var5 }, true), var6[var7], -128, arg3, var8, arg0, arg1);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method250(63, class65.field1327)) {
                        class30.field567++;
                        int var10 = 0;
                        short var11 = 0;
                        if (arg4.field1177 > class67.field1348.field21) {
                            var11 = 2000;
                        }
                        if (var9 == 0) {
                            var10 = var11 + 38;
                        }
                        if (var9 == 1) {
                            var10 = var11 + 36;
                        }
                        if (var9 == 2) {
                            var10 = var11 + 17;
                        }
                        if (var9 == 3) {
                            var10 = var11 + 11;
                        }
                        if (var9 == 4) {
                            var10 = var11 + 46;
                        }
                        class149.method926(class167.method1036(new class43[] { class18.field306, var5 }, true), var6[var9], -124, arg3, var10, arg0, arg1);
                    }
                }
            }
            class149.method926(class167.method1036(new class43[] { class18.field306, var5 }, true), class124.field2455, 21, arg3, 1002, arg0, arg1);
        } else if ((class27.field486 & 0x2) == 2) {
            class149.method926(class167.method1036(new class43[] { class29.field534, class172.field3437, var5 }, true), class137.field2852, 53, arg3, 57, arg0, arg1);
            class51.field1041++;
        }
        if (arg2 >= -127) {
            method1020(null, -54);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        if (arg0 != 76) {
            field3271 = null;
        }
        field3266 = null;
        field3268 = null;
        field3267 = null;
        field3272 = null;
        field3271 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lob;I)Z")
    public static final boolean method1020(class129 arg0, int arg1) {
        if (arg1 != -1) {
            field3272 = null;
        }
        field3270++;
        if (class121.field2415) {
            if (class193.method1231((byte) 126, arg0) != 0) {
                return false;
            }
            if (arg0.field2690 == 0) {
                return false;
            }
        }
        return arg0.field2686;
    }
}
