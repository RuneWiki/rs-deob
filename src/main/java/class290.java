import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class290 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqf;")
    public static class632 field3934 = new class632();

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[I")
    public static int[] field3941 = new int[200];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lwba;")
    public class46[] field3935;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lun;Lsq;I)Lwba;")
    private final class46 method1724(class389 arg0, class161 arg1, int arg2) {
        if (arg2 <= 84) {
            return null;
        }
        field3932++;
        if (class9.field91 == arg1) {
            return class128.method875(arg0, false);
        } else if (class331.field4404 == arg1) {
            return class101.method748(arg0, 13703);
        } else if (class335.field4449 == arg1) {
            return class522.method3094(arg0, 0);
        } else if (class518.field7575 == arg1) {
            return class275.method1669(8, arg0);
        } else if (class299.field4031 == arg1) {
            return class183.method1141(arg0, -23687);
        } else if (class659.field9371 == arg1) {
            return class498.method2900(arg0, (byte) 123);
        } else if (class141.field1770 == arg1) {
            return class143.method935(-2, arg0);
        } else if (class557.field8055 == arg1) {
            return class679.method3855(arg0, false);
        } else if (class564.field8148 == arg1) {
            return class189.method1171(arg0, (byte) -54);
        } else if (class531.field7748 == arg1) {
            return class411.method2481((byte) 39, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLun;)V")
    public final void method1725(byte arg0, class389 arg1) {
        this.field3940 = arg1.method2258(-3);
        field3936++;
        this.field3937 = arg1.method2260(-94);
        if (arg0 != 72) {
            field3939 = 31;
        }
        this.field3935 = new class46[arg1.method2229(255)];
        class161[] var3 = class676.method3840(114);
        for (int var4 = 0; var4 < this.field3935.length; var4++) {
            this.field3935[var4] = this.method1724(arg1, var3[arg1.method2229(255)], 122);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lun;I)Lqda;")
    public static final class87 method1726(class389 arg0, int arg1) {
        if (arg1 == 200) {
            field3938++;
            return new class87(arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2270((byte) 71), arg0.method2258(-3), arg0.method2229(255));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field3941 = null;
        int var1 = -50 % ((arg0 - 58) / 57);
        field3934 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static final void method1728(int arg0) {
        field3933++;
        for (int var1 = arg0; var1 < class99.field1332; var1++) {
            int var2 = class600.field8658[var1];
            class633 var3 = (class633) class522.field7662.method3678((long) var2, -126);
            if (var3 != null) {
                class557 var4 = var3.field9097;
                class529.method3112(var4, var4.field8052.field4318, (byte) 112);
            }
        }
    }
}
