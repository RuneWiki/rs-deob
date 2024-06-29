import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class275 extends class369 {

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Z")
    private boolean field3437 = false;

    @OriginalMember(owner = "client!lt", name = "w", descriptor = "F")
    public static float field3445 = 1.0F;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "Lcq;")
    public static class110 field3436 = new class110(45, 0);

    @OriginalMember(owner = "client!lt", name = "x", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field3446 = new Rectangle[100];

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!lt", name = "v", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BILlc;)V")
    public final void method9(byte arg0, int arg1, class686 arg2) {
        ++field3444;
        if (arg0 != -94) {
            field3446 = null;
        }
        super.field5047.method1997(127, arg2);
        super.field5047.method2004(arg1, 2);
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(B)V")
    public final void method3(byte arg0) {
        if (this.field3437) {
            super.field5047.method2015(1, -2);
            super.field5047.method1335(class158.field1768, (byte) -61);
            super.field5047.method1994(-30, class250.field3133, class250.field3133);
            super.field5047.method2012((byte) -72, 2, class107.field1154);
            super.field5047.method1979(0, class304.field3769, (byte) -88);
            super.field5047.method2010(119);
            super.field5047.method1997(126, (class686) null);
            super.field5047.method2015(0, -2);
            this.field3437 = false;
        } else {
            super.field5047.method1979(0, class304.field3769, (byte) -58);
        }
        ++field3442;
        int var2 = 76 % ((arg0 - 54) / 47);
        super.field5047.method1994(-30, class250.field3133, class250.field3133);
    }

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "(B)V")
    public static void method1612(byte arg0) {
        field3436 = null;
        field3446 = null;
        if (arg0 != 78) {
            field3445 = 0.013887016F;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)V")
    public final void method5(int arg0, boolean arg1) {
        ++field3441;
        if (arg0 == 382) {
            super.field5047.method1994(-30, class428.field6081, class250.field3133);
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lmj;)V")
    public class275(class344 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
    public final void method7(int arg0, int arg1, int arg2) {
        ++field3443;
        if (arg1 != 8250) {
            field3436 = null;
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZI)V")
    public final void method10(boolean arg0, int arg1) {
        if (arg1 != -14330) {
            field3445 = -0.8918861F;
        }
        ++field3435;
        class219 var3 = super.field5047.method2031(arg1 + 14242);
        if (var3 != null && arg0) {
            super.field5047.method2015(1, -2);
            super.field5047.method1997(126, var3);
            super.field5047.method1335(class102.field1107, (byte) -64);
            super.field5047.method2015(1, -2);
            super.field5047.method1994(-30, class428.field6081, class239.field2967);
            super.field5047.method1328(2, false, true, true, class692.field9717);
            super.field5047.method1979(0, class590.field8337, (byte) -79);
            class537 var4 = super.field5047.method2044(120);
            var4.method3010(super.field5047.method2047(1), arg1 + 14383);
            super.field5047.method1999(class36.field355, false);
            super.field5047.method2015(0, arg1 + 14328);
            this.field3437 = true;
        } else {
            super.field5047.method1979(0, class590.field8337, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(III)Z")
    public static final boolean method1613(int arg0, int arg1, int arg2) {
        ++field3440;
        if (arg2 != 0) {
            return false;
        } else {
            return (32 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(ZI)V")
    public static final void method1614(boolean arg0, int arg1) {
        ++field3438;
        if (arg0 && class482.field6929 != null) {
            class405.field5420 = class482.field6929.field6178;
        } else {
            class405.field5420 = -1;
        }
        class482.field6929 = null;
        class258.field3240 = null;
        class677.field9478 = null;
        if (arg1 == -31157) {
            class96.field1028 = 0;
            class482.method2781();
            class482.field6939.method3438(16);
            class696.field9774 = null;
            class313.field3888 = null;
            class442.field6249 = null;
            class268.field3334 = null;
            class482.field6934 = null;
            class409.field5465 = null;
            class320.field3944 = null;
            class634.field8930 = -1;
            class611.field8613 = null;
            class453.field6485 = -1;
            class681.field9605 = null;
            class519.field7381 = null;
            if (class482.field6927 != null) {
                class482.field6927.method703(6);
                class482.field6927.method704(128, 64, true);
            }
            if (class482.field6932 != null) {
                class482.field6932.method1119(64, (byte) -75, 64);
            }
            if (class482.field6925 != null) {
                class482.field6925.method2139(500, 64);
            }
            class259.field3254.method3828(64, -16285);
        }
    }

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        ++field3439;
        int var2 = 118 / ((arg0 - 37) / 36);
        return true;
    }

    static {
        for (int var0 = 0; ~var0 > -101; ++var0) {
            field3446[var0] = new Rectangle();
        }
    }
}
