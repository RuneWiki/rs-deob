import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class274 extends class260 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IB)I", line = 4)
    public final int method4(int arg0, byte arg1) {
        ++field4063;
        int var3 = 68 / ((-53 - arg1) / 50);
        return 1;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)I", line = 14)
    public final int method1780(int arg0) {
        ++field4066;
        if (arg0 < 3) {
            field4062 = 56;
        }
        return super.field3868;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IB)V", line = 28)
    public final void method9(int arg0, byte arg1) {
        ++field4071;
        super.field3868 = arg0;
        if (arg1 != -107) {
            method1784(52);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)I", line = 41)
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            return 86;
        } else {
            ++field4067;
            return 0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ldba;ILdba;)V", line = 53)
    public static final void method1781(class101 arg0, int arg1, class101 arg2) {
        ++field4072;
        if (arg0.field1416 != null) {
            arg0.method792((byte) -88);
        }
        arg0.field1412 = arg2;
        arg0.field1416 = arg2.field1416;
        if (arg1 != 9476) {
            field4068 = 72;
        }
        arg0.field1416.field1412 = arg0;
        arg0.field1412.field1416 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lfca;)V", line = 72)
    public class274(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)V", line = 76)
    public static final void method1782(byte arg0, int arg1, int arg2) {
        if (arg0 == -47) {
            ++field4069;
            if (class768.method4253(-3, arg2)) {
                class329.method2074(-10943, arg1, class111.field1528[arg2]);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V", line = 90)
    public final void method2(boolean arg0) {
        if (~super.field3868 > -1 || super.field3868 > 4) {
            super.field3868 = this.method8((byte) 4);
        }
        ++field4064;
        if (arg0) {
            field4062 = 113;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZZI)I", line = 109)
    public static final int method1783(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field4070;
        class166 var5 = class389.method2461((byte) 21, arg1, arg2);
        if (var5 == null) {
            return 0;
        } else {
            int var6 = arg4;
            for (int var7 = 0; ~var5.field2240.length < ~var7; ++var7) {
                if (var5.field2240[var7] >= 0 && ~class770.field10602.field5656 < ~var5.field2240[var7]) {
                    class322 var8 = class770.field10602.method2467(arg4 + -4, var5.field2240[var7]);
                    int var9 = var8.method2045(class206.field2703.method3905(true, arg0).field6728, arg0, arg4 + -1);
                    if (arg3) {
                        var6 += var5.field2237[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILfca;)V", line = 146)
    public class274(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)Z", line = 149)
    public static final boolean method1784(int arg0) {
        int var1 = 10 % ((arg0 - -28) / 51);
        ++field4065;
        return class99.field1374 != 0 ? true : class207.field2705.method4165((byte) 122);
    }
}
