import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class265 {

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public int field4296;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4303 = new String[] { method2302(method2301("Zs\u000eSS")), method2302(method2301("Zs\u000ePS")), method2302(method2301("N6\u000e?\u0006")), method2302(method2301("[mL}")), method2302(method2301("Zs\u000eRS")), method2302(method2301("Zs\u000e-\u0012[qT/S")), method2302(method2301("Zs\u000eUS")) };

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
    public static boolean field4288 = false;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Z")
    public static boolean field4293 = false;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Lko;")
    public static class532 field4295 = new class532("", 14);

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Llt;")
    public static class706 field4301 = new class706(0, 2);

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Lwh;")
    public static class155 field4302 = new class155(8, 1);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field4299;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lok;")
    public class265 field4291;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lsj;")
    public class486 field4297;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lok;", line = 11)
    public final class265 method2297(int arg0, int arg1) {
        try {
            field4289++;
            if (arg1 != 14) {
                this.field4296 = 99;
            }
            return new class265(this.field4294, arg0);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4303[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLmp;)Z", line = 24)
    public static final boolean method2298(byte arg0, class796 arg1) {
        try {
            if (arg0 < 94) {
                field4302 = null;
            }
            field4300++;
            return class763.field11195 == arg1 || class545.field8024 == arg1 || class206.field3218 == arg1 || class106.field1528 == arg1 || class685.field9909 == arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4303[1] + arg0 + ',' + (arg1 == null ? field4303[3] : field4303[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lot;", line = 36)
    public final class617 method2299(int arg0) {
        try {
            field4298++;
            return arg0 <= 28 ? null : class642.method4651(this.field4294, -127);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4303[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 51)
    public static void method2300(byte arg0) {
        try {
            field4301 = null;
            if (arg0 != -95) {
                field4301 = null;
            }
            field4302 = null;
            field4295 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4303[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(II)V", line = 69)
    public class265(int arg0, int arg1) {
        try {
            this.field4296 = arg1;
            this.field4294 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4303[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2301(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2302(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
