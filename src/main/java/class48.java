import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 extends class292 {

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "Z")
    private boolean field1151 = false;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            this.method599(true, (byte) -96);
        }
        ++field1152;
        class524 var3 = super.field4393.method3269(false);
        if (var3 != null && arg0) {
            super.field4393.method3223(arg1 ^ -125, 1);
            super.field4393.method3266(-2, var3);
            super.field4393.method2858((byte) 61, class172.field2837);
            super.field4393.method3223(arg1 ^ -125, 1);
            super.field4393.method3232(class42.field1079, class525.field7399, (byte) -118);
            super.field4393.method2845(class661.field9521, 21, true, false, 2);
            super.field4393.method3224(0, (byte) -80, class20.field843);
            class391 var4 = super.field4393.method3240(true);
            var4.method2404(super.field4393.method3252((byte) -57), 120);
            super.field4393.method3265((byte) -88, class537.field7515);
            super.field4393.method3223(15, 0);
            this.field1151 = true;
        } else {
            super.field4393.method3224(0, (byte) -80, class20.field843);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        int var4 = -92 / ((arg1 - -45) / 59);
        ++field1144;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 <= 27) {
            this.method604(-73);
        }
        ++field1148;
        if (!this.field1151) {
            super.field4393.method3224(0, (byte) -80, class435.field6296);
        } else {
            super.field4393.method3223(15, 1);
            super.field4393.method2858((byte) 61, class277.field4153);
            super.field4393.method3232(class509.field7205, class509.field7205, (byte) -116);
            super.field4393.method3231(2, class370.field5487, (byte) -92);
            super.field4393.method3224(0, (byte) -80, class435.field6296);
            super.field4393.method3220((byte) -51);
            super.field4393.method3266(-2, (class116) null);
            super.field4393.method3223(15, 0);
            this.field1151 = false;
        }
        super.field4393.method3232(class509.field7205, class509.field7205, (byte) -108);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            this.field1151 = true;
        }
        ++field1149;
        super.field4393.method3232(class509.field7205, class525.field7399, (byte) -121);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        super.field4393.method3266(-2, arg2);
        if (arg0 >= 28) {
            ++field1150;
            super.field4393.method3195(-12, arg1);
        }
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        ++field1147;
        if (arg0 != 24561) {
            this.field1151 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lcf;)V")
    public class48(class562 arg0) {
        super(arg0);
    }
}
