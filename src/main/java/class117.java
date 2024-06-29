import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class117 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Ljd;")
    public static class92 field2360 = class202.method1325((byte) 90, "hitmarks");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljd;")
    private static class92 field2362 = class202.method1325((byte) 90, "Malformed login packet)3");

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljd;")
    private static class92 field2361 = class202.method1325((byte) 90, "Players");

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Ljd;")
    public static class92 field2358 = class202.method1325((byte) 90, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Ljd;")
    public static class92 field2366 = field2361;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Ljd;")
    public static class92 field2363 = field2362;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 1536) {
            field2362 = null;
        }
        field2362 = null;
        field2361 = null;
        field2363 = null;
        field2366 = null;
        field2360 = null;
        field2358 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Lji;")
    public static final class97 method786(byte arg0, int arg1) {
        field2359++;
        class97 var2 = (class97) class49.field1070.method930(81, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 87) {
            return null;
        } else {
            byte[] var3 = class73.field1538.method899((byte) 87, class138.method920(-75, arg1), class158.method1023(2, arg1));
            class97 var4 = new class97();
            var4.field1959 = arg1;
            if (var3 != null) {
                var4.method677(-1, new class70(var3));
            }
            var4.method678(0);
            class49.field1070.method927(24744, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILac;)V")
    public static final void method787(int arg0, class4 arg1) {
        arg1.field252 = 0;
        if (arg1.field222 == 0) {
            arg1.field243 = 1024;
        }
        field2364++;
        int var2 = arg1.field211 * 64 + arg1.field207 * 128;
        if (arg1.field222 == 1) {
            arg1.field243 = 1536;
        }
        int var3 = arg1.field212 * 128 + arg1.field211 * 64;
        if (arg1.field222 == 2) {
            arg1.field243 = 0;
        }
        if (arg0 != 512) {
            method786((byte) -66, -28);
        }
        int var4 = arg1.field249 - class158.field3150;
        if (arg1.field222 == 3) {
            arg1.field243 = 512;
        }
        arg1.field246 += (var2 - arg1.field246) / var4;
        arg1.field208 += (var3 - arg1.field208) / var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljd;IILjd;)V")
    public static final void method788(class92 arg0, int arg1, int arg2, class92 arg3) {
        field2365++;
        if (arg1 == -19001) {
            class2.method20(arg3, 0, arg2, arg0, null);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
    public static final void method789(int arg0, int arg1) {
        field2367++;
        if (arg1 >= -12) {
            field2362 = null;
        }
        class101.field2074 = arg0;
    }
}
