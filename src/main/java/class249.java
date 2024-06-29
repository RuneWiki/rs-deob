import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class249 extends class581 {

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Lnea;")
    public static class664 field3863 = new class664(108, 3);

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lf;")
    private class702 field3864;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZII)V", line = 4)
    public final void method1673(int arg0, boolean arg1, int arg2, int arg3) {
        ++field3867;
        int var5 = this.method3312(43) * super.field8179.field487 / 10000;
        int[] var6 = new int[4];
        if (arg3 > 107) {
            class282.field4228.method204(var6);
            class282.field4228.method168(arg2, arg0 + 2, arg2 + var5, super.field8179.field480 + arg0);
            this.field3864.method3911(arg2, arg0 + 2, super.field8179.field487, super.field8179.field480);
            class282.field4228.method168(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 25)
    public static final boolean method1674(String arg0, byte arg1) {
        ++field3868;
        if (arg1 != -64) {
            return false;
        } else if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~class142.field2091; ++var2) {
                if (arg0.equalsIgnoreCase(class124.field1865[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class648.field9106.field6981);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(Lpu;Lpu;Lci;)V", line = 56)
    public class249(class522 arg0, class522 arg1, class413 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZ)V", line = 60)
    public final void method1675(int arg0, int arg1, int arg2, boolean arg3) {
        class282.field4228.method219(arg1 + -2, arg2, super.field8179.field487 - -4, super.field8179.field480 + 2, ((class413) super.field8179).field6008, 0);
        ++field3865;
        class282.field4228.method219(arg1 + -1, arg2 + 1, super.field8179.field487 + 2, super.field8179.field480, arg0, 0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)Z", line = 72)
    public final boolean method419(byte arg0) {
        if (arg0 < 56) {
            return true;
        } else {
            ++field3870;
            return !super.method419((byte) 100) ? false : super.field8186.method2997((byte) -95, ((class413) super.field8179).field6006);
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V", line = 87)
    public static void method1676(byte arg0) {
        int var1 = -112 % ((arg0 - 7) / 56);
        field3863 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 98)
    public final void method420(byte arg0) {
        ++field3869;
        super.method420(arg0);
        this.field3864 = class195.method1321((byte) -73, ((class413) super.field8179).field6006, super.field8186);
    }
}
