import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class748 extends class204 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Lrh;")
    public static class718 field10326 = new class718();

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ltq;")
    public static class397 field10335 = new class397();

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field10323;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field10327;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field10328;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field10332;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field10334;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Lee;")
    public static class506 field10329;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)I", line = 3)
    public final int method490(byte arg0) {
        ++field10332;
        if (arg0 < 83) {
            field10335 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Z", line = 19)
    public final boolean method4142(int arg0) {
        int var2 = 48 / ((arg0 - -13) / 44);
        ++field10333;
        return true;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I", line = 29)
    public final int method487(int arg0, int arg1) {
        ++field10323;
        if (class514.method3066(arg0, -4)) {
            if (super.field2853.field8517.method2602((byte) -99) && !class99.method707(super.field2853.field8517.method2604((byte) -98), -118)) {
                return 3;
            }
            if (~super.field2853.field8498.method3732((byte) -98) == -2) {
                return 3;
            }
        }
        if (~arg0 == -4) {
            return 3;
        } else if (class514.method3066(arg0, -4)) {
            return 2;
        } else {
            int var3 = 105 % ((-57 - arg1) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)I", line = 59)
    public final int method4143(byte arg0) {
        if (arg0 != -98) {
            method4146(true);
        }
        ++field10327;
        return super.field2852;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z", line = 73)
    public final boolean method4144(byte arg0) {
        int var2 = -5 / ((-46 - arg0) / 33);
        ++field10328;
        return class514.method3066(super.field2852, -4);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(ILfs;)V", line = 85)
    public class748(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V", line = 88)
    public static final void method4145(int arg0, int arg1, int arg2) {
        ++field10324;
        if (class718.method4015(arg1, arg2 ^ 71)) {
            if (arg2 == 1) {
                class772.method4265((byte) -113, arg0, class609.field8594[arg1]);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(II)V", line = 104)
    public final void method488(int arg0, int arg1) {
        ++field10325;
        super.field2852 = arg0;
        if (arg1 > -105) {
            this.method488(94, -61);
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lfs;)V", line = 116)
    public class748(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V", line = 119)
    public static void method4146(boolean arg0) {
        field10335 = null;
        field10329 = null;
        field10326 = null;
        if (arg0) {
            method4145(69, -73, -98);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z", line = 133)
    public static final boolean method4147(int arg0) {
        ++field10334;
        try {
            if (arg0 != 50) {
                field10330 = -107;
            }
            return class658.method3771(false);
        } catch (IOException var4) {
            class380.method2371((byte) 123);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class350.field5090 != null ? class350.field5090.method902(66) : -1) + "," + (class434.field6026 != null ? class434.field6026.method902(66) : -1) + "," + (class499.field6844 == null ? -1 : class499.field6844.method902(66)) + " - " + class179.field2258 + "," + (class444.field6151 - -class724.field10031.field9219[0]) + "," + (class724.field10031.field9214[0] + class236.field3535) + " - ";
            for (int var3 = 0; ~class179.field2258 < ~var3 && var3 < 50; ++var3) {
                var2 = var2 + class315.field4517.field6979[var3] + ",";
            }
            class502.method2937(var5, (byte) 110, var2);
            class570.method3355((byte) -36, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V", line = 168)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            field10329 = null;
        }
        ++field10331;
        if (this.method4144((byte) 85)) {
            if (super.field2853.field8517.method2602((byte) 68) && !class99.method707(super.field2853.field8517.method2604((byte) -98), -122)) {
                super.field2852 = 1;
            }
            if (super.field2853.field8498.method3732((byte) -98) == 1) {
                super.field2852 = 1;
            }
        }
        if (~super.field2852 == -4) {
            super.field2852 = 2;
        }
        if (~super.field2852 > -1 || ~super.field2852 < -4) {
            super.field2852 = this.method490((byte) 119);
        }
    }
}
