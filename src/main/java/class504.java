import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class504 {

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lpl;")
    private class612 field6669;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lpl;")
    private class612 field6668;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "S")
    public static short field6671 = 32767;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "I")
    public static int field6675 = 0;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "Lrga;")
    public static class280 field6676 = new class280(75, 0);

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public static int field6672;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Lis;")
    private class2 field6670;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLoc;)Lica;")
    public final class217 method2710(byte arg0, class547 arg1) {
        field6674++;
        if (arg1 == null) {
            return null;
        }
        class259 var3 = arg1.method235(93);
        if (class419.field5270 == var3) {
            return new class301((class570) arg1);
        } else if (class484.field6425 == var3) {
            return new class70(this.method2713(0), (class269) arg1);
        } else if (class349.field4462 == var3) {
            return new class66(this.field6669, (class192) arg1);
        } else if (class1.field8 == var3) {
            return new class305(this.field6669, (class490) arg1);
        } else if (class551.field7693 == var3) {
            return new class296(this.field6669, this.field6668, (class158) arg1);
        } else if (class161.field2130 == var3) {
            return new class494(this.field6669, this.field6668, (class452) arg1);
        } else if (class531.field7170 == var3) {
            return new class620(this.field6669, this.field6668, (class529) arg1);
        } else if (class162.field2133 == var3) {
            return new class279(this.field6669, this.field6668, (class230) arg1);
        } else if (class78.field1069 == var3) {
            return new class121(this.field6669, (class506) arg1);
        } else {
            int var4 = -93 / ((39 - arg0) / 46);
            return class119.field1525 == var3 ? new class671(this.field6669, this.field6668, (class39) arg1) : null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
    public static final void method2711(boolean arg0) {
        field6677++;
        class112.method625(-46);
        class465.method2468(2, class301.field3698.field6612, 22050, 36);
        class260.field3213 = class312.method1811(12869, class590.field8289, 22050, class500.field6585, 0);
        class260.field3213.method1503(class419.field5255, (byte) 88);
        class411.field5140 = class312.method1811(12869, class590.field8289, 2048, class500.field6585, 1);
        if (!arg0) {
            field6676 = null;
        }
        class411.field5140.method1503(class480.field6387, (byte) 88);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lpl;Lpl;)V")
    public class504(class612 arg0, class612 arg1) {
        this.field6669 = arg0;
        this.field6668 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BII)V")
    public static final void method2712(byte arg0, int arg1, int arg2) {
        field6673++;
        if (arg0 == 2) {
            class592 var3 = class61.method371(13, arg1, (byte) 116);
            var3.method3256((byte) 11);
            var3.field8314 = arg2;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Lis;")
    private final class2 method2713(int arg0) {
        if (this.field6670 == null) {
            this.field6670 = new class2();
        }
        field6672++;
        return arg0 == 0 ? this.field6670 : null;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
    public static void method2714(int arg0) {
        if (arg0 != 22050) {
            method2714(-49);
        }
        field6676 = null;
    }
}
