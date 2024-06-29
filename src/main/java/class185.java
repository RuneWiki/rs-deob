import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class185 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lck;")
    public static class119 field2925 = class298.method1987((byte) 76, "; Expires=");

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
    public static int[] field2929 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!di", name = "j", descriptor = "Lvh;")
    public static class212 field2933 = new class212(32);

    @OriginalMember(owner = "client!di", name = "k", descriptor = "Z")
    public static boolean field2934 = true;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[Lml;")
    public static class134[] field2926;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lck;Lck;BLck;I)V", line = 5)
    public static final void method1174(class119 arg0, class119 arg1, byte arg2, class119 arg3, int arg4) {
        if (arg2 < 8) {
            method1174((class119) null, (class119) null, (byte) -11, (class119) null, -110);
        }
        class24.method184(120, arg0, arg4, arg3, arg1, -1);
        field2932++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lml;ZIII)V", line = 16)
    public static final void method1175(class134 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2927++;
        int var5 = arg0.field2180;
        if (arg4 != 1) {
            field2925 = (class119) null;
        }
        int var6 = arg0.field2057;
        if (arg0.field2163 == 0) {
            arg0.field2180 = arg0.field2141;
        } else if (arg0.field2163 == 1) {
            arg0.field2180 = arg2 - arg0.field2141;
        } else if (arg0.field2163 == 2) {
            arg0.field2180 = arg0.field2141 * arg2 >> 14;
        } else if (arg0.field2163 == 3) {
            if (arg0.field2135 == 2) {
                arg0.field2180 = arg0.field2141 * 32 + ((arg0.field2141 - 1) * arg0.field2168);
            } else if (arg0.field2135 == 7) {
                arg0.field2180 = (arg0.field2141 - 1) * arg0.field2168 + arg0.field2141 * 115;
            }
        }
        if (arg0.field2079 == 0) {
            arg0.field2057 = arg0.field2089;
        } else if (arg0.field2079 == 1) {
            arg0.field2057 = arg3 - arg0.field2089;
        } else if (arg0.field2079 == 2) {
            arg0.field2057 = arg0.field2089 * arg3 >> 14;
        } else if (arg0.field2079 == 3) {
            if (arg0.field2135 == 2) {
                arg0.field2057 = arg0.field2089 * 32 + ((arg0.field2089 - 1) * arg0.field2149);
            } else if (arg0.field2135 == 7) {
                arg0.field2057 = (arg0.field2089 - 1) * arg0.field2149 + arg0.field2089 * 12;
            }
        }
        if (arg0.field2163 == 4) {
            arg0.field2180 = arg0.field2154 * arg0.field2057 / arg0.field2056;
        }
        if (arg0.field2079 == 4) {
            arg0.field2057 = arg0.field2180 * arg0.field2056 / arg0.field2154;
        }
        if (class106.field1626 && (client.method620(arg0) != 0 || arg0.field2135 == 0)) {
            if (arg0.field2057 < 5 && arg0.field2180 < 5) {
                arg0.field2057 = 5;
                arg0.field2180 = 5;
            } else {
                if (arg0.field2180 <= 0) {
                    arg0.field2180 = 5;
                }
                if (arg0.field2057 <= 0) {
                    arg0.field2057 = 5;
                }
            }
        }
        if (arg0.field2068 == 1337) {
            class202.field3208 = arg0;
        }
        if (arg1 && arg0.field2130 != null && (arg0.field2180 != var5 || arg0.field2057 != var6)) {
            class1 var7 = new class1();
            var7.field8 = arg0;
            var7.field14 = arg0.field2130;
            class120.field1893.method999(var7, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 134)
    public static void method1176(int arg0) {
        field2926 = null;
        if (arg0 > -116) {
            method1175((class134) null, false, -24, -96, -128);
        }
        field2933 = null;
        field2925 = null;
        field2929 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BILva;I)[Lbe;", line = 151)
    public static final class81[] method1177(byte arg0, int arg1, class36 arg2, int arg3) {
        field2930++;
        if (arg0 == 104) {
            return class56.method414(arg1, arg2, false, arg3) ? class174.method1113(-1) : null;
        } else {
            return (class81[]) null;
        }
    }
}
