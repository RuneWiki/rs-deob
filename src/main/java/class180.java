import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class180 {

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lsd;")
    private static class166 field3399 = class135.method935("Take", 0);

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lsd;")
    private static class166 field3400 = class135.method935("Please wait)3)3)3", 0);

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Lsd;")
    public static class166 field3396 = class135.method935(" <col=ffff00>", 0);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "Lsd;")
    public static class166 field3398 = class135.method935("Diese Betatest)2Welt ist nur f-Ur eingeladene", 0);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Lsd;")
    public static class166 field3401 = class135.method935("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 0);

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lsd;")
    public static class166 field3404 = field3399;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "Lsd;")
    public static class166 field3397 = field3400;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field3411 = 0;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Lf;")
    public static class47 field3407;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "[Lkf;")
    public static class96[] field3403;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)Z")
    public static final boolean method1214(int arg0, byte arg1) {
        if (arg1 != 78) {
            field3397 = null;
        }
        field3409++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IB)Lvf;")
    public static final class195 method1215(int arg0, byte arg1) {
        field3408++;
        class195 var2 = (class195) class179.field3382.method64((byte) 28, (long) arg0);
        if (arg1 <= 69) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class27.field467.method353(14, arg0, -72);
            class195 var4 = new class195();
            if (var3 != null) {
                var4.method1300(-128, new class53(var3));
            }
            class179.field3382.method67(var4, 15266, (long) arg0);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lf;Lf;I)V")
    public static final void method1216(class47 arg0, class47 arg1, int arg2) {
        class4.field72 = arg0;
        class134.field2605 = arg1;
        if (arg2 <= 37) {
            method1217(true);
        }
        field3402++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
    public static void method1217(boolean arg0) {
        if (!arg0) {
            method1217(true);
        }
        field3403 = null;
        field3399 = null;
        field3398 = null;
        field3397 = null;
        field3400 = null;
        field3396 = null;
        field3407 = null;
        field3401 = null;
        field3404 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(III)I")
    public static final int method1218(int arg0, int arg1, int arg2) {
        field3405++;
        if (arg1 != 14) {
            field3398 = null;
        }
        class134 var3 = (class134) class79.field1606.method224(arg1 ^ 0xFFFFFFF1, (long) arg0);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field2595.length > arg2) {
            return var3.field2595[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static final void method1219(int arg0) {
        field3412++;
        class97.field1858 = true;
        if (arg0 < -114) {
            class73.field1475 = true;
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(IB)[B")
    public static final synchronized byte[] method1220(int arg0, byte arg1) {
        field3406++;
        if (arg0 == 100 && class70.field1420 > 0) {
            byte[] var2 = class169.field3265[--class70.field1420];
            class169.field3265[class70.field1420] = null;
            return var2;
        } else if (arg0 == 5000 && class25.field441 > 0) {
            byte[] var3 = class122.field2389[--class25.field441];
            class122.field2389[class25.field441] = null;
            return var3;
        } else {
            if (arg1 <= 78) {
                field3403 = null;
            }
            if (arg0 == 30000 && class153.field2945 > 0) {
                byte[] var4 = class6.field130[--class153.field2945];
                class6.field130[class153.field2945] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BII)I")
    public static final int method1221(byte arg0, int arg1, int arg2) {
        field3410++;
        if (arg0 >= -98) {
            field3403 = null;
        }
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg1 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }
}
