import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class85 extends class36 {

    @OriginalMember(owner = "client!qfa", name = "gb", descriptor = "Lbd;")
    public class56 field1175;

    @OriginalMember(owner = "client!qfa", name = "db", descriptor = "Luc;")
    public static class27 field1172 = new class27(40, 8);

    @OriginalMember(owner = "client!qfa", name = "fb", descriptor = "Liv;")
    public static class84 field1174 = new class84();

    @OriginalMember(owner = "client!qfa", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field1176 = null;

    @OriginalMember(owner = "client!qfa", name = "Y", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!qfa", name = "Z", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!qfa", name = "ab", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qfa", name = "bb", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!qfa", name = "cb", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!qfa", name = "eb", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!qfa", name = "ib", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
    public static final boolean method652(int arg0, int arg1, int arg2) {
        if (arg2 != 5545) {
            return true;
        } else {
            ++field1173;
            return class612.method3377(arg0, arg1, arg2 + -5445) | ~(458752 & arg0) != -1 || class513.method2846(arg0, arg1, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(JI)V")
    public static final void method653(long arg0, int arg1) {
        ++field1171;
        if (class658.field9266 != null) {
            if (class670.field9445 != 1 && ~class670.field9445 != -6) {
                if (class670.field9445 == 4) {
                    class122.method866(arg0, 118);
                }
            } else {
                class536.method2963(arg0, true);
            }
        }
        class499.method2792(class630.field8790, -128, (long) class239.field3440);
        if (~class677.field9551 != 0) {
            class514.method2853(class677.field9551, -1);
        }
        for (int var3 = 0; ~class150.field2245 < ~var3; ++var3) {
            if (class287.field3996[var3]) {
                class183.field2696[var3] = true;
            }
            class291.field4388[var3] = class287.field3996[var3];
            class287.field3996[var3] = false;
        }
        class19.field280 = class239.field3440;
        if (class630.field8790.method385()) {
            class318.field4711 = true;
        }
        if (class677.field9551 != -1) {
            class150.field2245 = 0;
            class9.method44(false);
        }
        class630.field8790.method449();
        class53.method377(class630.field8790, -6136);
        if (arg1 <= -81) {
            int var4 = class13.method61(6227);
            if (~var4 == 0) {
                var4 = class130.field1787;
            }
            if (var4 == -1) {
                var4 = class651.field9213;
            }
            class68.method557((byte) -128, var4);
            class590.method3283((byte) -94, class253.field3576.field509, class253.field3576.field520, class253.field3576.field514, class371.field5290);
            class371.field5290 = 0;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lsp;)V")
    public class85(class581 arg0) {
        super(arg0);
        this.field1175 = new class56(arg0);
        super.field486 = new class544(super.field458);
        super.field493 = new class544(super.field458);
        super.field475 = new class544(super.field458);
        super.field468 = new class544(super.field458);
        super.field490 = new class544(super.field458);
        super.field479 = new class544(super.field458);
        super.field488 = new class544(super.field458);
        super.field463 = new class544(super.field458);
        super.field481 = new class544(super.field458);
        super.field492 = new class544(super.field458);
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(I)V")
    public final void method171(int arg0) {
        ++field1167;
        this.field1175 = new class56((class581) super.field458);
        if (arg0 != 896) {
            method652(105, 76, 87);
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
    public static void method654(byte arg0) {
        field1174 = null;
        if (arg0 != 32) {
            method653(108L, 64);
        }
        field1172 = null;
        field1176 = null;
    }

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "(III)Z")
    public static final boolean method655(int arg0, int arg1, int arg2) {
        if (arg1 != 28238) {
            return true;
        } else {
            ++field1177;
            return (2048 & arg2) != 0;
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lpj;Z)V")
    public static final void method656(class132 arg0, boolean arg1) {
        class132.field1859 = arg0;
        ++field1169;
        if (!arg1) {
            method654((byte) 67);
        }
    }
}
