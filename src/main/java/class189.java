import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class189 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lwm;")
    public static class152 field2988 = class157.method1048("(U(Y", 101);

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[I")
    public static int[] field2989 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Lwm;")
    public static class152 field2987 = class157.method1048("leuchten1:", 101);

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lwm;")
    public static class152 field2994 = class157.method1048("hitbar_default", 127);

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Leg;")
    public class300 field2992;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lv;")
    public class73 field2985;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1251(int arg0) {
        field2986++;
        if (class151.field2349.toLowerCase().indexOf("microsoft") == -1) {
            class294.field5032[47] = 73;
            class294.field5032[91] = 42;
            class294.field5032[44] = 71;
            class294.field5032[93] = 43;
            if (class151.field2366 == null) {
                class294.field5032[222] = 59;
                class294.field5032[192] = 58;
            } else {
                class294.field5032[520] = 59;
                class294.field5032[192] = 28;
                class294.field5032[222] = 58;
            }
            class294.field5032[45] = 26;
            class294.field5032[61] = 27;
            class294.field5032[46] = 72;
            class294.field5032[59] = 57;
            class294.field5032[92] = 74;
        } else {
            class294.field5032[190] = 72;
            class294.field5032[223] = 28;
            class294.field5032[221] = 43;
            class294.field5032[189] = 26;
            class294.field5032[219] = 42;
            class294.field5032[222] = 59;
            class294.field5032[187] = 27;
            class294.field5032[186] = 57;
            class294.field5032[188] = 71;
            class294.field5032[191] = 73;
            class294.field5032[192] = 58;
            class294.field5032[220] = 74;
        }
        if (arg0 <= 81) {
            field2994 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 62)
    public static void method1252(byte arg0) {
        if (arg0 != -19) {
            field2988 = (class152) null;
        }
        field2987 = null;
        field2994 = null;
        field2989 = null;
        field2988 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Ltg;", line = 75)
    public static final class312 method1253(byte arg0, int arg1) {
        field2995++;
        class312 var2 = (class312) class227.field3678.method1620(true, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field3976.method1381(class104.method703(arg1, -128), class17.method107(arg1, 116), 0);
        class312 var4 = new class312();
        var4.field5346 = arg1;
        if (var3 != null) {
            var4.method2168((byte) -74, new class291(var3));
        }
        var4.method2171(true);
        if (var4.field5349 != -1) {
            var4.method2174(false, method1253((byte) 96, var4.field5348), method1253((byte) 88, var4.field5349));
        }
        if (var4.field5407 != -1) {
            var4.method2172((byte) -40, method1253((byte) 108, var4.field5407), method1253((byte) 97, var4.field5345));
        }
        if (arg0 < 29) {
            field2987 = (class152) null;
        }
        if (!class104.field1494 && var4.field5351) {
            var4.field5400 = class299.field5184;
            var4.field5350 = false;
            var4.field5372 = 0;
            var4.field5385 = class232.field3811;
            var4.field5393 = class55.field860;
        }
        class227.field3678.method1614(var4, (long) arg1, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 119)
    public static final void method1254(byte arg0) {
        field2984++;
        if (arg0 != -64) {
            method1256((class127) null, 38);
        }
        if (!class296.method2044(96) && class267.field4501 != class23.field400) {
            class229.method1575(class23.field400, class85.field1176.field4245[0], class85.field1176.field4188[0], arg0 ^ 0xFFFFA20F, class110.field1555, false, class121.field1713);
        } else if (class23.field400 != class185.field2947 && class48.method331(class23.field400, arg0 + 19661152)) {
            class185.field2947 = class23.field400;
            class159.method1069(16560);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)Ljg;", line = 149)
    public static final class299 method1255(int arg0, byte arg1) {
        field2993++;
        class299 var2 = (class299) class59.field900.method1620(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class62.field941.method1381(class247.method1696(false, arg0), class50.method348(arg0, 255), 0);
        class299 var4 = new class299();
        var4.field5186 = arg0;
        if (var3 != null) {
            var4.method2091(new class291(var3), (byte) -30);
        }
        int var5 = -37 / ((-arg1 - 63) / 63);
        class59.field900.method1614(var4, (long) arg0, (byte) 78);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Loe;I)V", line = 179)
    public static final void method1256(class127 arg0, int arg1) {
        int var2 = arg0.field1887;
        if (arg1 != -27061) {
            field2994 = (class152) null;
        }
        field2991++;
        if (var2 == 324) {
            if (class290.field4929 == -1) {
                class204.field3292 = arg0.field1847;
                class290.field4929 = arg0.field1944;
            }
            if (class10.field127.field3679) {
                arg0.field1944 = class290.field4929;
            } else {
                arg0.field1944 = class204.field3292;
            }
        } else if (var2 == 325) {
            if (class290.field4929 == -1) {
                class204.field3292 = arg0.field1847;
                class290.field4929 = arg0.field1944;
            }
            if (class10.field127.field3679) {
                arg0.field1944 = class204.field3292;
            } else {
                arg0.field1944 = class290.field4929;
            }
        } else if (var2 == 327) {
            arg0.field1820 = 150;
            arg0.field1813 = (int) (Math.sin((double) class142.field2187 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field1900 = -1;
            arg0.field1899 = 5;
        } else if (var2 == 328) {
            if (class85.field1176.field146 == null) {
                arg0.field1900 = 0;
            } else {
                arg0.field1820 = 150;
                arg0.field1813 = (int) (Math.sin((double) class142.field2187 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1899 = 5;
                arg0.field1900 = ((int) class85.field1176.field146.method1013(-18674) << 11) + 2047;
                arg0.field1800 = 0;
                arg0.field1874 = class85.field1176.field4218;
                arg0.field1943 = class85.field1176.field4224;
                arg0.field1795 = class85.field1176.field4183;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)V", line = 264)
    public static final void method1257(byte arg0, int arg1) {
        field2990++;
        class303 var2 = class90.method589(false, arg1, 5);
        if (arg0 != 106) {
            method1257((byte) -63, -65);
        }
        var2.method2114((byte) 100);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V", line = 277)
    public static final void method1258(int arg0, int arg1, int arg2) {
        class313.field5427 = class131.field1994[arg0][arg1].field2781;
        class108.field1546 = class131.field1994[arg0][arg1].field2782;
        field2983++;
        class279.field4769 = class131.field1994[arg0][arg1].field2783;
        if (arg2 != 19323) {
            method1258(-71, -9, -89);
        }
        class14.method88((float) class313.field5427, (float) class108.field1546, (float) class279.field4769);
    }
}
