import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class294 extends class184 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field4990 = 0;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    public static boolean field4989 = false;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "Lok;")
    public static class146 field4993 = class235.method1724(-12908, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field4992 = 0;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Lok;")
    public static class146 field4986 = class235.method1724(-12908, "www");

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "Lok;")
    public static class146 field4995 = class235.method1724(-12908, "cyan:");

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[[B")
    public static byte[][] field4994;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILoj;)V", line = 12)
    public static final void method2094(int arg0, class318 arg1) {
        field4991++;
        arg1.field5378 = false;
        if (arg1.field5429 != -1) {
            class287 var2 = class306.method2156(120, arg1.field5429);
            if (var2 == null || var2.field4904 == null) {
                arg1.field5429 = -1;
            } else {
                arg1.field5374++;
                if (var2.field4904.length > arg1.field5422 && arg1.field5374 > var2.field4898[arg1.field5422]) {
                    arg1.field5374 = 1;
                    arg1.field5422++;
                    class11.method70(false, class102.field1639 == arg1, var2, arg1.field5409, arg1.field5422, arg1.field5380);
                }
                if (arg1.field5422 >= var2.field4904.length) {
                    arg1.field5374 = 0;
                    arg1.field5422 = 0;
                    class11.method70(false, class102.field1639 == arg1, var2, arg1.field5409, arg1.field5422, arg1.field5380);
                }
            }
        }
        if (arg0 <= 94) {
            field4993 = (class146) null;
        }
        if (arg1.field5441 != -1 && class203.field3385 >= arg1.field5423) {
            int var3 = class73.method540((byte) 30, arg1.field5441).field2329;
            if (var3 == -1) {
                arg1.field5441 = -1;
            } else {
                class287 var4 = class306.method2156(126, var3);
                if (var4 == null || var4.field4904 == null) {
                    arg1.field5441 = -1;
                } else {
                    if (arg1.field5387 < 0) {
                        arg1.field5387 = 0;
                        class11.method70(false, class102.field1639 == arg1, var4, arg1.field5409, 0, arg1.field5380);
                    }
                    arg1.field5399++;
                    if (arg1.field5387 < var4.field4904.length && var4.field4898[arg1.field5387] < arg1.field5399) {
                        arg1.field5399 = 1;
                        arg1.field5387++;
                        class11.method70(false, class102.field1639 == arg1, var4, arg1.field5409, arg1.field5387, arg1.field5380);
                    }
                    if (arg1.field5387 >= var4.field4904.length) {
                        arg1.field5441 = -1;
                    }
                }
            }
        }
        if (arg1.field5408 != -1 && arg1.field5438 <= 1) {
            class287 var5 = class306.method2156(124, arg1.field5408);
            if (var5.field4913 == 1 && arg1.field5431 > 0 && arg1.field5414 <= class203.field3385 && arg1.field5437 < class203.field3385) {
                arg1.field5438 = 1;
                return;
            }
        }
        if (arg1.field5408 != -1 && arg1.field5438 == 0) {
            class287 var6 = class306.method2156(124, arg1.field5408);
            if (var6 == null || var6.field4904 == null) {
                arg1.field5408 = -1;
            } else {
                arg1.field5391++;
                if (var6.field4904.length > arg1.field5443 && var6.field4898[arg1.field5443] < arg1.field5391) {
                    arg1.field5443++;
                    arg1.field5391 = 1;
                    class11.method70(false, class102.field1639 == arg1, var6, arg1.field5409, arg1.field5443, arg1.field5380);
                }
                if (arg1.field5443 >= var6.field4904.length) {
                    arg1.field5443 -= var6.field4893;
                    arg1.field5427++;
                    if (var6.field4902 <= arg1.field5427) {
                        arg1.field5408 = -1;
                    } else if (arg1.field5443 >= 0 && arg1.field5443 < var6.field4904.length) {
                        class11.method70(false, class102.field1639 == arg1, var6, arg1.field5409, arg1.field5443, arg1.field5380);
                    } else {
                        arg1.field5408 = -1;
                    }
                }
                arg1.field5378 = var6.field4919;
            }
        }
        if (arg1.field5438 > 0) {
            arg1.field5438--;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V", line = 145)
    public static final void method2095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4988++;
        if (arg0 == arg5) {
            class287.method2066(-128, arg4, arg0, arg3, arg1);
            return;
        }
        if (class151.field2564 <= arg3 - arg0 && class126.field2058 >= (arg3 + arg0) && (arg1 - arg5) >= class123.field2008 && (arg1 + arg5) <= class318.field5394) {
            class229.method1684(arg0, arg4, arg3, 11624, arg1, arg5);
        } else {
            class266.method1931(arg1, arg4, arg5, arg0, arg3, (byte) 103);
        }
        if (arg2 != 0) {
            field4993 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I", line = 173)
    public static final int method2096(int arg0, int arg1, int arg2) {
        field4996++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = -69 / ((arg1 + 14) / 58);
            int var4 = (arg0 & 0x7F) * arg2 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 209)
    public static void method2097(int arg0) {
        field4993 = null;
        field4986 = null;
        field4994 = (byte[][]) null;
        field4995 = null;
        if (arg0 != -3) {
            method2098((class15) null, -128);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Loh;I)V", line = 233)
    public static final void method2098(class15 arg0, int arg1) {
        field4987++;
        class207.field3464 = arg0;
        class124.field2019 = class207.field3464.method95(64, 4);
        if (arg1 > -62) {
            method2098((class15) null, 26);
        }
    }
}
