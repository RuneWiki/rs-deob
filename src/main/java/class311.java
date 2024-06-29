import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class311 extends class89 {

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lac;")
    public class712 field3978;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lac;")
    private class712 field3980;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "Lac;")
    private class712 field3982;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lac;")
    private class712 field3983;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Lac;")
    private class712 field3984;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lac;")
    private class712 field3985;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method616(byte arg0) {
        ++field3976;
        if (!super.method616(arg0)) {
            return false;
        } else {
            class569 var2 = (class569) super.field1128;
            if (!super.field1132.method3827(var2.field7939, (byte) 110)) {
                return false;
            } else if (!super.field1132.method3827(var2.field7935, (byte) 127)) {
                return false;
            } else if (!super.field1132.method3827(var2.field7934, (byte) 109)) {
                return false;
            } else if (!super.field1132.method3827(var2.field7940, (byte) 63)) {
                return false;
            } else if (!super.field1132.method3827(var2.field7936, (byte) 81)) {
                return false;
            } else {
                return super.field1132.method3827(var2.field7938, (byte) 57);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZ)Lie;", line = 40)
    public static final class607 method1814(int arg0, int arg1, boolean arg2) {
        int var3 = 27 % ((arg0 - -84) / 39);
        ++field3974;
        class314[] var4 = class162.field2075;
        synchronized (class162.field2075) {
            class607 var5;
            if (class162.field2075.length > arg1 && !class162.field2075[arg1].method1835(-90)) {
                var5 = (class607) class162.field2075[arg1].method1841(-10244);
                var5.method3869(true);
                int var10002 = class217.field2738[arg1]--;
            } else {
                var5 = new class607();
                var5.field8425 = new class678[arg1];
                for (int var6 = 0; var6 < arg1; ++var6) {
                    var5.field8425[var6] = new class678();
                }
            }
            var5.field8418 = arg2;
            return var5;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZ)V", line = 77)
    public final void method619(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3975;
        int var5 = arg0 - -this.field3980.method1892();
        int var6 = super.field1128.field8673 + arg0 + -this.field3982.method1892();
        int var7 = this.field3983.method1882() + arg1;
        int var8 = super.field1128.field8665 + arg1 + -this.field3985.method1882();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method618(10000) / 10000;
        int[] var12 = new int[4];
        class458.field6407.method76(var12);
        class458.field6407.method131(var5, var7, var5 + var11, var8);
        this.method1240(var5, var10, var9, -1011320762, var7);
        class458.field6407.method131(var5 + var11, var7, var6, var8);
        this.field3984.method3938(var5, var7, var9, var10);
        class458.field6407.method131(var12[0], var12[1], var12[2], var12[3]);
        int var13 = -82 / ((arg2 - 12) / 43);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIZ)V", line = 112)
    public final void method622(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 == 2) {
            if (arg3) {
                int[] var5 = new int[4];
                class458.field6407.method76(var5);
                class458.field6407.method131(arg1, arg0, super.field1128.field8673 + arg1, arg0 - -super.field1128.field8665);
                int var6 = this.field3980.method1892();
                int var7 = this.field3980.method1882();
                int var8 = this.field3982.method1892();
                int var9 = this.field3982.method1882();
                this.field3980.method3929(arg1, arg0 - -((-var7 + super.field1128.field8665) / 2));
                this.field3982.method3929(-var8 + super.field1128.field8673 + arg1, arg0 - -((super.field1128.field8665 - var9) / 2));
                class458.field6407.method131(arg1, arg0, super.field1128.field8673 + arg1, arg0 + this.field3983.method1882());
                this.field3983.method3938(arg1 + var6, arg0, -var6 + super.field1128.field8673 + -var8, super.field1128.field8665);
                int var10 = this.field3985.method1882();
                class458.field6407.method131(arg1, super.field1128.field8665 + arg0 + -var10, super.field1128.field8673 + arg1, super.field1128.field8665 + arg0);
                this.field3985.method3938(arg1 + var6, super.field1128.field8665 - var10 + arg0, -var6 + super.field1128.field8673 + -var8, super.field1128.field8665);
                class458.field6407.method131(var5[0], var5[1], var5[2], var5[3]);
            }
            ++field3973;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V", line = 148)
    public void method1240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1011320762) {
            this.method1240(-67, -127, -125, 77, 22);
        }
        ++field3977;
        this.field3978.method3938(arg0, arg4, arg2, arg1);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lkha;Lkha;Lcda;)V", line = 167)
    public class311(class687 arg0, class687 arg1, class569 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 173)
    public final void method621(int arg0) {
        super.method621(arg0);
        ++field3981;
        class569 var2 = (class569) super.field1128;
        this.field3978 = class339.method1984(super.field1132, var2.field7939, 107);
        this.field3984 = class339.method1984(super.field1132, var2.field7935, arg0 + -27690);
        this.field3980 = class339.method1984(super.field1132, var2.field7934, 50);
        this.field3982 = class339.method1984(super.field1132, var2.field7940, 125);
        this.field3983 = class339.method1984(super.field1132, var2.field7936, 105);
        this.field3985 = class339.method1984(super.field1132, var2.field7938, 59);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V", line = 189)
    public static final void method1815(int arg0, int arg1, int arg2, int arg3) {
        ++field3979;
        String var4 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg3 >> 6) + "," + (63 & arg0) + "," + (arg3 & arg1);
        System.out.println(var4);
        class417.method2482(false, var4, true, (byte) 77);
    }
}
