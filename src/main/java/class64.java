import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Laf;")
    public static class7 field1420 = class48.method406(40, "mapfunction");

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "[I")
    public static int[] field1424 = new int[5];

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Laf;")
    private static class7 field1423 = class48.method406(40, "Please try using a different world)3");

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Laf;")
    public static class7 field1413 = field1423;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "Laf;")
    public static class7 field1412 = field1423;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Laf;")
    public static class7 field1422 = field1423;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Laf;")
    public static class7 field1421 = field1423;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Laf;")
    public static class7 field1417 = field1423;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Laf;")
    public static class7 field1410 = field1423;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lfd;")
    public static class40 field1416;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    public static int[] field1411;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)Lba;")
    public static final class9 method523(int arg0, boolean arg1) {
        field1425++;
        class9 var2 = (class9) class51.field1235.method395(125, (long) arg0);
        if (!arg1) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class115.field2747.method572(1, false, arg0);
            class9 var4 = new class9();
            if (var3 != null) {
                var4.method111(new class122(var3), arg0, (byte) 124);
            }
            var4.method109(false);
            class51.field1235.method388(var4, (long) arg0, 2047);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method524(int arg0) {
        field1420 = null;
        field1424 = null;
        field1413 = null;
        field1410 = null;
        field1421 = null;
        field1423 = null;
        field1422 = null;
        field1416 = null;
        field1412 = null;
        field1411 = null;
        field1417 = null;
        if (arg0 > -2) {
            method523(121, false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB)I")
    public static final int method525(int arg0, int arg1, int arg2, byte arg3) {
        field1419++;
        if (arg3 != 56) {
            method526(true, 41);
        }
        if ((class25.field670[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class25.field670[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)Ltc;")
    public static final class135 method526(boolean arg0, int arg1) {
        field1414++;
        class135 var2 = (class135) class58.field1381.method395(124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field3126.method572(10, arg0, arg1);
        class135 var4 = new class135();
        var4.field3190 = arg1;
        if (var3 != null) {
            var4.method1107(0, new class122(var3));
        }
        var4.method1103((byte) 61);
        if (var4.field3220 != -1) {
            var4.method1100(method526(false, var4.field3220), false, method526(false, var4.field3200));
        }
        if (!class28.field727 && var4.field3191) {
            var4.field3192 = 0;
            var4.field3199 = class27.field704;
            var4.field3179 = null;
            var4.field3188 = null;
        }
        class58.field1381.method388(var4, (long) arg1, 2047);
        return var4;
    }
}
