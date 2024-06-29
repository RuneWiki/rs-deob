import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class201 extends class260 {

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "Lsja;")
    public static class11 field2666;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "Lsja;")
    public static class11 field2670 = field2666 = new class11(false);

    @OriginalMember(owner = "client!vp", name = "h", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IB)I")
    public final int method4(int arg0, byte arg1) {
        int var3 = -49 / ((-53 - arg1) / 50);
        ++field2664;
        if (super.field3867.method740((byte) -126)) {
            return 3;
        } else {
            return ~arg0 != -1 && super.field3867.field1301.method2583(105) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIZ)I")
    public static final int method1362(int arg0, int arg1, int arg2, boolean arg3) {
        ++field2671;
        if (arg2 >= -38) {
            return -101;
        } else {
            class166 var4 = class389.method2461((byte) 95, arg1, arg3);
            if (var4 == null) {
                return 0;
            } else if (arg0 == -1) {
                return 0;
            } else {
                int var5 = 0;
                for (int var6 = 0; var6 < var4.field2237.length; ++var6) {
                    if (var4.field2240[var6] == arg0) {
                        var5 += var4.field2237[var6];
                    }
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(ILfca;)V")
    public class201(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)I")
    public final int method8(byte arg0) {
        ++field2669;
        if (arg0 != 4) {
            this.method8((byte) 21);
        }
        return 1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
    public final int method1363(int arg0) {
        if (arg0 <= 3) {
            field2666 = null;
        }
        ++field2667;
        return super.field3868;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(BI)V")
    public static final void method1364(byte arg0, int arg1) {
        class276.field4092 = arg1;
        ++field2665;
        class587.field7831 = -1;
        class232.field3167 = -1;
        if (arg0 != 73) {
            method1367((byte) -65);
        }
        class155.method1131((byte) 116);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(IB)V")
    public final void method9(int arg0, byte arg1) {
        ++field2668;
        if (arg1 != -107) {
            field2666 = null;
        }
        super.field3868 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lfca;)V")
    public class201(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public final void method2(boolean arg0) {
        if (!arg0) {
            ++field2661;
            if (super.field3867.method740((byte) -107)) {
                super.field3868 = 0;
            }
            if (~super.field3868 > -1 && super.field3868 > 2) {
                super.field3868 = this.method8((byte) 4);
            }
        }
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
    public final boolean method1365(int arg0) {
        ++field2662;
        int var2 = 45 / ((56 - arg0) / 53);
        return !super.field3867.method740((byte) -105);
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
    public static final boolean method1366(int arg0) {
        ++field2663;
        if (arg0 > -116) {
            return true;
        } else if (class454.field6306 == null) {
            return false;
        } else {
            if (~class454.field6306.field4080 <= -2001) {
                class454.field6306.field4080 -= 2000;
            }
            return class454.field6306.field4080 == 1001;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static void method1367(byte arg0) {
        field2666 = null;
        int var1 = 88 / ((arg0 - -32) / 41);
        field2670 = null;
    }
}
