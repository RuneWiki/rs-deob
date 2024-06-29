import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class147 extends class325 {

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "Lwj;")
    public class174 field2243;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2241 = "green:";

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "[[[B")
    public static byte[][][] field2234;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIILmn;III)V", line = 5)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, class161 arg4, int arg5, int arg6, int arg7) {
        field2235++;
        if (class312.field4839) {
            class115.field1817 = 32;
        } else {
            class115.field1817 = 0;
        }
        if (arg5 != 16) {
            method1111(-46, -13, 26);
        }
        class312.field4839 = false;
        if (class240.field3670 != 0) {
            if (arg0 >= arg2 && arg2 + 16 > arg0 && arg6 >= arg3 && arg6 < arg3 + 16) {
                arg4.field2546 -= 4;
                class254.method1776(4, arg4);
            } else if (arg2 <= arg0 && arg0 < arg2 + 16 && (arg3 + arg1 - 16) <= arg6 && arg6 < arg3 + arg1) {
                arg4.field2546 += 4;
                class254.method1776(4, arg4);
            } else if (arg0 >= (arg2 - class115.field1817) && arg0 < (arg2 + class115.field1817 + 16) && arg6 >= arg3 + 16 && arg6 < (arg3 + arg1 - 16)) {
                int var8 = (arg1 - 32) * arg1 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (var8 / 2) - arg3 - 16;
                int var10 = arg1 - var8 - 32;
                arg4.field2546 = (arg7 - arg1) * var9 / var10;
                class254.method1776(4, arg4);
                class312.field4839 = true;
            }
        }
        if (class62.field826 == 0) {
            return;
        }
        int var11 = arg4.field2619;
        if (arg0 >= (arg2 - var11) && arg3 <= arg6 && arg2 + 16 > arg0 && arg6 <= arg3 + arg1) {
            arg4.field2546 += class62.field826 * 45;
            class254.method1776(4, arg4);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lwm;BI)V", line = 71)
    public static final void method1108(class254 arg0, byte arg1, int arg2) {
        if (class27.field301 != null) {
            try {
                class27.field301.method1921((byte) -102, 0L);
                class27.field301.method1923(arg2, arg0.field3840, -1, 24);
            } catch (Exception var4) {
            }
        }
        if (arg1 != -23) {
            field2234 = (byte[][][]) ((byte[][][]) null);
        }
        field2233++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lj;ZB)V", line = 93)
    public static final void method1109(class242 arg0, boolean arg1, byte arg2) {
        field2242++;
        int var3 = arg0.field3689;
        if (arg2 < 53) {
            field2234 = (byte[][][]) ((byte[][][]) null);
        }
        int var4 = (int) arg0.field69;
        arg0.method39(10717);
        if (arg1) {
            class330.method2302(17556, var3);
        }
        class132.method1020(var3, 127);
        class161 var5 = class331.method2308((byte) 55, var4);
        if (var5 != null) {
            class254.method1776(4, var5);
        }
        int var6 = class32.field393;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class63.method429(class118.field1843[var7], (byte) -52)) {
                class165.method1256((byte) 94, var7);
            }
        }
        if (class32.field393 == 1) {
            class330.field5089 = false;
            class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
        } else {
            class278.method1927(class139.field2095, class61.field821, (byte) -90, class205.field3145, class183.field2901);
            int var8 = class167.field2703.method2281(class130.field2002);
            for (int var9 = 0; var9 < class32.field393; var9++) {
                int var10 = class167.field2703.method2281(class90.method656(3, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class183.field2901 = var8 + 8;
            class139.field2095 = class32.field393 * 15 + (class264.field4093 ? 26 : 22);
        }
        if (class28.field334 != -1) {
            class153.method1155(1, -1, class28.field334);
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V", line = 164)
    public static void method1110(int arg0) {
        int var1 = 90 / ((-arg0 - 50) / 32);
        field2241 = null;
        field2234 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(III)Lmf;", line = 176)
    public static final class188 method1111(int arg0, int arg1, int arg2) {
        field2238++;
        class188 var3 = (class188) class309.field4810.method1716(-1, (long) arg2 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class188(arg2, arg1);
            class309.field4810.method1708(var3.field69, (byte) -79, var3);
        }
        if (arg0 > -4) {
            field2234 = (byte[][][]) ((byte[][][]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(Z)V", line = 197)
    public static final void method1112(boolean arg0) {
        field2239++;
        int var1 = class167.field2703.method2281(class130.field2002);
        for (int var2 = 0; var2 < class32.field393; var2++) {
            int var3 = class167.field2703.method2281(class90.method656(3, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        if (arg0) {
            return;
        }
        var1 += 8;
        int var4 = class32.field393 * 15 + 21;
        int var5 = class234.field3562;
        if ((var4 + var5) > class215.field3300) {
            var5 = class215.field3300 - var4;
        }
        int var6 = class272.field4253 - (var1 / 2);
        if (class151.field2281 < (var1 + var6)) {
            var6 = class151.field2281 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class5.field65 == 1) {
            if (class272.field4253 == class2.field32 && class89.field1266 == class234.field3562) {
                class139.field2095 = (class264.field4093 ? 26 : 22) + class32.field393 * 15;
                class183.field2901 = var1;
                class205.field3145 = var5;
                class61.field821 = var6;
                class330.field5089 = true;
                class5.field65 = 0;
            }
        } else if (class272.field4253 == class109.field1643 && class47.field640 == class234.field3562) {
            class205.field3145 = var5;
            class61.field821 = var6;
            class5.field65 = 0;
            class183.field2901 = var1;
            class139.field2095 = (class264.field4093 ? 26 : 22) + class32.field393 * 15;
            class330.field5089 = true;
        } else {
            class5.field65 = 1;
            class2.field32 = class109.field1643;
            class89.field1266 = class47.field640;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lwj;)V", line = 295)
    public class147(class174 arg0) {
        this.field2243 = arg0;
    }
}
