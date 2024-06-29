import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class499 extends class260 {

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Ljw;")
    public static class581 field6879 = new class581(50, 20);

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "Ljw;")
    public static class581 field6887 = new class581(62, 7);

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
    public static int field6889 = 0;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "I")
    public static int field6885;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "J")
    public static long field6884;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "Lnga;")
    public static class541 field6888;

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V")
    public static final void method2879(byte arg0) {
        ++field6880;
        if (class379.field5542 != null) {
            if (class130.field1934) {
                class26.method200(8);
            }
            class201.field2670.method91(0);
            class259.method1718();
            class322.method2039(-91);
            class45.method347((byte) 95);
            class560.method3148(-85);
            class523.method3018((byte) 83);
            if (class296.field4302 != null) {
                class296.field4302.method3947((byte) -94);
            }
            class258.method1715(96);
            class772.method4279((byte) 37);
            class166.method1199(-98);
            class6.method42(0);
            class103.method796(false, (byte) -106);
            for (int var1 = 0; ~var1 > -2049; ++var1) {
                class73 var5 = class599.field8149[var1];
                if (var5 != null) {
                    for (int var6 = 0; ~var6 > ~var5.field1886.length; ++var6) {
                        var5.field1886[var6] = null;
                    }
                }
            }
            for (int var2 = 0; class184.field2457 > var2; ++var2) {
                class192 var3 = class495.field6850[var2].field2336;
                if (var3 != null) {
                    for (int var4 = 0; ~var3.field1886.length < ~var4; ++var4) {
                        var3.field1886[var4] = null;
                    }
                }
            }
            class334.field4865 = null;
            class176.field2342 = null;
            class379.field5542.method470((byte) -128);
            class379.field5542 = null;
        }
        if (arg0 >= -115) {
            method2881((byte) 70);
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        if (arg0 != 4) {
            return -78;
        } else {
            ++field6883;
            return 0;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        ++field6882;
        if (!class526.method3031(super.field3867.field1270.method4293(61), (byte) 105)) {
            return 3;
        } else {
            int var3 = 90 / ((arg1 - -53) / 50);
            return 1;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)I")
    public final int method2880(int arg0) {
        if (arg0 < 3) {
            this.method4(28, (byte) -39);
        }
        ++field6881;
        return super.field3868;
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)V")
    public static void method2881(byte arg0) {
        field6879 = null;
        field6887 = null;
        field6888 = null;
        if (arg0 != -117) {
            field6888 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(ILfca;)V")
    public class499(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (super.field3867.field1270.method4291(8192) && !class526.method3031(super.field3867.field1270.method4293(29), (byte) 56)) {
            super.field3868 = 0;
        }
        if (!arg0) {
            ++field6886;
            if (super.field3868 < 0 || super.field3868 > 2) {
                super.field3868 = this.method8((byte) 4);
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        ++field6885;
        if (arg1 == -107) {
            super.field3868 = arg0;
        }
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lfca;)V")
    public class499(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)Z")
    public final boolean method2882(int arg0) {
        ++field6878;
        int var2 = 120 / ((56 - arg0) / 53);
        return class526.method3031(super.field3867.field1270.method4293(72), (byte) 50);
    }
}
