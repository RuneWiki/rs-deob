import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class283 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lbm;")
    private class98 field4518 = new class98();

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[C")
    public static char[] field4519 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4523 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lbm;")
    private class98 field4531;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lbm;", line = 5)
    public final class98 method2006(byte arg0) {
        field4526++;
        class98 var2 = this.field4518.field1591;
        if (this.field4518 == var2) {
            return null;
        }
        if (arg0 != -52) {
            this.field4518 = null;
        }
        var2.method958((byte) 69);
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)Z", line = 23)
    public static final boolean method2007(byte arg0, int arg1, int arg2) {
        if (arg0 >= -85) {
            method2007((byte) 93, 42, -26);
        }
        field4524++;
        return class98.method955(arg1, arg2, -9646) || class215.method1618(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lbm;", line = 34)
    public final class98 method2008(int arg0) {
        if (arg0 != -3717) {
            method2014(-12);
        }
        field4522++;
        class98 var2 = this.field4518.field1588;
        if (this.field4518 == var2) {
            this.field4531 = null;
            return null;
        } else {
            this.field4531 = var2.field1588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 65)
    public final int method2009(int arg0) {
        field4520++;
        int var2 = 0;
        class98 var3 = this.field4518.field1588;
        while (this.field4518 != var3) {
            var3 = var3.field1588;
            var2++;
        }
        return arg0 == 25373 ? var2 : 119;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 87)
    public final void method2010(int arg0) {
        field4530++;
        int var2 = 18 / ((21 - arg0) / 55);
        while (true) {
            class98 var3 = this.field4518.field1588;
            if (this.field4518 == var3) {
                this.field4531 = null;
                return;
            }
            var3.method958((byte) 69);
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lbm;", line = 109)
    public final class98 method2011(int arg0) {
        field4525++;
        if (arg0 != 35) {
            return null;
        }
        class98 var2 = this.field4531;
        if (this.field4518 == var2) {
            this.field4531 = null;
            return null;
        } else {
            this.field4531 = var2.field1588;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Lbm;", line = 130)
    public final class98 method2012(boolean arg0) {
        field4529++;
        class98 var2 = this.field4518.field1588;
        if (arg0) {
            field4523 = 110;
        }
        if (this.field4518 == var2) {
            return null;
        } else {
            var2.method958((byte) 69);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILbm;)V", line = 153)
    public final void method2013(int arg0, class98 arg1) {
        if (arg1.field1591 != null) {
            arg1.method958((byte) 69);
        }
        field4521++;
        arg1.field1591 = this.field4518;
        if (arg0 == 0) {
            arg1.field1588 = this.field4518.field1588;
            arg1.field1591.field1588 = arg1;
            arg1.field1588.field1591 = arg1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(I)V", line = 175)
    public static void method2014(int arg0) {
        if (arg0 == 0) {
            field4519 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lbm;I)V", line = 186)
    public final void method2015(class98 arg0, int arg1) {
        field4528++;
        if (arg0.field1591 != null) {
            arg0.method958((byte) 69);
        }
        arg0.field1588 = this.field4518;
        if (arg1 < -18) {
            arg0.field1591 = this.field4518.field1591;
            arg0.field1591.field1588 = arg0;
            arg0.field1588.field1591 = arg0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V", line = 210)
    public class283() {
        this.field4518.field1588 = this.field4518;
        this.field4518.field1591 = this.field4518;
    }
}
