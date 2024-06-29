import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class36 {

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lib;")
    public class89 field792 = new class89();

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[Lqe;")
    public static class179[] field795 = new class179[100];

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lai;")
    public static class10 field789 = new class10(5000);

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "Lqe;")
    public static class179 field800 = class206.method1380(":trade:", (byte) -126);

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lnc;")
    public static class144 field797 = new class144(8);

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lqe;")
    public static class179 field803 = class206.method1380("oder ung-Ultiges Passwort)3", (byte) -127);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Lib;")
    private class89 field796;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)Lib;")
    public final class89 method230(int arg0) {
        field782++;
        if (arg0 >= -108) {
            this.method235(-120, null);
        }
        class89 var2 = this.field792.field1687;
        if (this.field792 == var2) {
            return null;
        } else {
            var2.method592((byte) -128);
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBILqa;II)V")
    public static final void method231(int arg0, int arg1, byte arg2, int arg3, class175 arg4, int arg5, int arg6) {
        if (arg2 < -121) {
            field787++;
            class143.method901(arg4.field3198, arg5, arg6, arg1, arg3, 1220876233, arg4.field3159, arg0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method232(byte arg0) {
        class198.field3699.method794(0, 0);
        class108.field2013.method794(382, 0);
        if (arg0 > 65) {
            class209.field3925.method395(382 - class209.field3925.field1249 / 2, 18);
            field793++;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lib;Z)V")
    public final void method233(class89 arg0, boolean arg1) {
        if (arg0.field1691 != null) {
            arg0.method592((byte) -128);
        }
        arg0.field1691 = this.field792;
        arg0.field1687 = this.field792.field1687;
        field783++;
        arg0.field1691.field1687 = arg0;
        if (!arg1) {
            arg0.field1687.field1691 = arg0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Lib;")
    public final class89 method234(byte arg0) {
        field801++;
        class89 var2 = this.field792.field1691;
        if (this.field792 == var2) {
            this.field796 = null;
            return null;
        }
        if (arg0 <= 116) {
            field803 = null;
        }
        this.field796 = var2.field1691;
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILib;)V")
    public final void method235(int arg0, class89 arg1) {
        if (arg1.field1691 != null) {
            arg1.method592((byte) -128);
        }
        field784++;
        arg1.field1687 = this.field792;
        if (arg0 < -57) {
            arg1.field1691 = this.field792.field1691;
            arg1.field1691.field1687 = arg1;
            arg1.field1687.field1691 = arg1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
    public final void method236(byte arg0) {
        int var2 = -3 / ((-arg0 - 17) / 47);
        field786++;
        while (true) {
            class89 var3 = this.field792.field1687;
            if (this.field792 == var3) {
                return;
            }
            var3.method592((byte) -128);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lib;")
    public final class89 method237(int arg0) {
        field794++;
        class89 var2 = this.field796;
        if (this.field792 == var2) {
            this.field796 = null;
            return null;
        }
        this.field796 = var2.field1687;
        if (arg0 != 10) {
            field802 = 4;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field791++;
        class145.method918(arg2, arg1, arg0 + arg2, arg1 + arg4);
        class27.method169();
        class145.method937(arg2, arg1, arg0, arg4, arg3);
        if (class96.field1817 < 100) {
            return;
        }
        if (class30.field663 == null) {
            class126 var5 = new class126(arg0, arg4);
            class145.method930(var5.field2315, arg0, arg4);
            class128.method824(arg4, 0, class202.field3736, arg3 + 126, 0, 0, arg0, 0, class146.field2655);
            class30.field663 = var5;
            class217.field4010.method462(38);
        }
        class30.field663.method794(arg2, arg1);
        int var6 = arg2 + class189.field3505 * arg0 / class146.field2655;
        int var7 = class71.field1426 * arg0 / class146.field2655;
        int var8 = class52.field1132 * arg4 / class202.field3736;
        int var9 = class33.field716 * arg4 / class202.field3736 + arg1;
        class145.method923(var6, var9, var7, var8, 16711680, 128);
        class145.method919(var6, var9, var7, var8, 16711680);
        if (class232.field4282 <= 0 || class232.field4282 % 10 >= 5) {
            return;
        }
        for (class66 var10 = (class66) class106.field1983.method242(16711680); var10 != null; var10 = (class66) class106.field1983.method237(arg3 + 10)) {
            if (class146.field2649 == var10.field1338) {
                int var11 = var10.field1336 * arg4 / class202.field3736 + arg1;
                int var12 = var10.field1351 * arg0 / class146.field2655 + arg2;
                class145.method937(var12 - 2, var11 + -2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Lib;")
    public final class89 method239(byte arg0) {
        if (arg0 != 85) {
            return null;
        }
        class89 var2 = this.field796;
        field785++;
        if (this.field792 == var2) {
            this.field796 = null;
            return null;
        } else {
            this.field796 = var2.field1691;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lib;Lib;I)V")
    public final void method240(class89 arg0, class89 arg1, int arg2) {
        if (arg0.field1691 != null) {
            arg0.method592((byte) -128);
        }
        arg0.field1687 = arg1;
        arg0.field1691 = arg1.field1691;
        arg0.field1691.field1687 = arg0;
        field790++;
        if (arg2 == 10) {
            arg0.field1687.field1691 = arg0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static void method241(boolean arg0) {
        if (!arg0) {
            return;
        }
        field789 = null;
        field800 = null;
        field797 = null;
        field795 = null;
        field803 = null;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)Lib;")
    public final class89 method242(int arg0) {
        field788++;
        if (arg0 != 16711680) {
            method241(false);
        }
        class89 var2 = this.field792.field1687;
        if (this.field792 == var2) {
            this.field796 = null;
            return null;
        } else {
            this.field796 = var2.field1687;
            return var2;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class36() {
        this.field792.field1691 = this.field792;
        this.field792.field1687 = this.field792;
    }
}
