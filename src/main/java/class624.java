import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class624 extends class697 {

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "S")
    public short field9020;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "Lph;")
    public static class598 field9022 = new class598(6, 1);

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Z")
    public static boolean field9024 = true;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field9019;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)Z")
    public final boolean method836(boolean arg0) {
        ++field9021;
        return !arg0 ? false : class224.field3361[(super.field9806 >> class30.field940) + -class547.field7768 - -class643.field9239][(super.field9815 >> class30.field940) + class643.field9239 + -class318.field4685];
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(B)V")
    public static void method3556(byte arg0) {
        field9022 = null;
        if (arg0 >= -31) {
            field9024 = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(B)Z")
    public final boolean method838(byte arg0) {
        if (arg0 <= 4) {
            this.method835((class9[]) null, (byte) -35);
        }
        ++field9019;
        return class266.method1737(this, super.field9815 >> class30.field940, super.field9804, super.field9806 >> class30.field940, false);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIII)V")
    public class624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9814 = (byte) arg3;
        this.field9020 = (short) arg5;
        super.field9809 = arg1;
        super.field9806 = arg0;
        super.field9804 = (byte) arg4;
        super.field9815 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lff;B)I")
    public final int method835(class9[] arg0, byte arg1) {
        ++field9023;
        int var3 = super.field9806 >> class30.field940;
        int var4 = super.field9815 >> class30.field940;
        if (arg1 <= 102) {
            this.method835((class9[]) null, (byte) 61);
        }
        int var5 = 0;
        if (class547.field7768 != var3) {
            if (var3 > class547.field7768) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class318.field4685 == var4) {
            var5 += 3;
        } else if (var4 < class318.field4685) {
            var5 += 6;
        }
        int var6 = class268.field3981[var5];
        if (~(this.field9020 & var6) != -1) {
            return this.method3896(var4, arg0, 48, var3);
        } else if (~this.field9020 == -2 && var3 > 0) {
            return this.method3896(var4, arg0, 48, var3 + -1);
        } else if (~this.field9020 == -5 && class520.field7369 >= var3) {
            return this.method3896(var4, arg0, 48, var3 + 1);
        } else if (~this.field9020 == -9 && var4 > 0) {
            return this.method3896(var4 - 1, arg0, 48, var3);
        } else if (~this.field9020 == -3 && ~class107.field1852 <= ~var4) {
            return this.method3896(var4 + 1, arg0, 48, var3);
        } else if (~this.field9020 == -17 && var3 > 0 && var4 <= class107.field1852) {
            return this.method3896(var4 + 1, arg0, 48, var3 - 1);
        } else if (this.field9020 == 32 && class520.field7369 >= var3 && class107.field1852 >= var4) {
            return this.method3896(var4 + 1, arg0, 48, var3 + 1);
        } else if (~this.field9020 == -129 && ~var3 < -1 && var4 > 0) {
            return this.method3896(var4 - 1, arg0, 48, var3 + -1);
        } else if (~this.field9020 == -65 && ~var3 >= ~class520.field7369 && ~var4 < -1) {
            return this.method3896(var4 + -1, arg0, 48, var3 + 1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILog;IZ)V")
    public static final void method3557(int arg0, class602 arg1, int arg2, boolean arg3) {
        ++field9018;
        if (arg3) {
            int[] var4 = new int[4];
            class692.method3878(var4, 0, var4.length, arg0);
            class4.method234(0, arg1, var4, arg2);
        }
    }
}
