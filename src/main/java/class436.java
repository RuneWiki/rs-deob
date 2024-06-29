import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class436 extends class27 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Z")
    public static boolean field6055 = true;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "Llh;")
    public static class487 field6059 = new class487(56, 8);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "Lgo;")
    public static class581 field6064 = new class581(1, 2, 2, 0);

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field6066 = 1;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6054;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public static int field6060;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field6062;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z")
    public static final boolean method2494(int arg0) {
        if (arg0 <= 90) {
            return true;
        } else {
            ++field6060;
            try {
                return class453.method2572(-82);
            } catch (IOException var4) {
                class455.method2586(true);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + (class417.field5889 != null ? class417.field5889.method1337(true) : -1) + "," + (class108.field1503 == null ? -1 : class108.field1503.method1337(true)) + "," + (class687.field9800 == null ? -1 : class687.field9800.method1337(true)) + " - " + class95.field1338 + "," + (class143.field2063.field1807[0] + class498.field6774) + "," + (class143.field2063.field1801[0] + class613.field8555) + " - ";
                for (int var3 = 0; ~var3 > ~class95.field1338 && ~var3 > -51; ++var3) {
                    var2 = var2 + class660.field9184.field6855[var3] + ",";
                }
                class413.method2400(var2, var5, (byte) -62);
                class9.method35((byte) -127, false);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILvf;)V")
    public final void method257(int arg0, int arg1, class136 arg2) {
        super.field337.method3206(arg2, (byte) 26);
        ++field6056;
        super.field337.method3205(5123, arg0);
        if (arg1 != -10479) {
            field6064 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V")
    public final void method263(boolean arg0, int arg1) {
        ++field6065;
        if (arg1 != 8) {
            method2496(true);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static void method2495(byte arg0) {
        field6064 = null;
        field6059 = null;
        if (arg0 <= 88) {
            method2494(-64);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V")
    public static final void method2496(boolean arg0) {
        if (~class285.field3921 == -10) {
            class178.method1232(5, (byte) 50);
        } else if (~class285.field3921 != -6 && class285.field3921 != 6) {
            if (~class285.field3921 == -13) {
                class178.method1232(3, (byte) 105);
            }
        } else {
            class178.method1232(3, (byte) 47);
        }
        if (!arg0) {
            method2495((byte) -11);
        }
        ++field6061;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Llj;)V")
    public class436(class565 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            field6064 = null;
        }
        ++field6054;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        super.field337.method3202(false, 0);
        if (arg0 == 50) {
            ++field6058;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZ)V")
    public final void method258(byte arg0, boolean arg1) {
        ++field6062;
        super.field337.method3202(true, 0);
        if (arg0 >= -80) {
            field6064 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)I")
    public static final int method2497(int arg0, int arg1) {
        if (arg1 > -8) {
            return 93;
        } else {
            ++field6057;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z")
    public final boolean method260(boolean arg0) {
        ++field6063;
        if (arg0) {
            field6055 = false;
        }
        return true;
    }
}
