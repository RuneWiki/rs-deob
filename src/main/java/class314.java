import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class314 extends class83 {

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
    public static int[] field4208 = new int[128];

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "Ls;")
    public static class380 field4205;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V", line = 3)
    public static final void method1819(int arg0, int arg1) {
        if (!class274.field3689) {
            arg0 = -1;
        }
        ++field4212;
        if (class376.field5282 != arg0) {
            if (arg1 > -93) {
                field4208 = null;
            }
            if (~arg0 != 0) {
                class24 var2 = class402.method2530(arg0, 33);
                class241 var3 = var2.method126(0);
                if (var3 == null) {
                    arg0 = -1;
                } else {
                    class159.field2055.method2799(var3.method1284(), -120, var3.method1297(), var3.method1292(), class38.field391, new Point(var2.field228, var2.field230));
                    class376.field5282 = arg0;
                }
            }
            if (arg0 == -1 && ~class376.field5282 != 0) {
                class159.field2055.method2799(-1, -125, (int[]) null, -1, class38.field391, new Point());
                class376.field5282 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lam;B)V", line = 45)
    public static final void method1820(class286 arg0, byte arg1) {
        class383.field5460 = arg0;
        ++field4207;
        if (arg1 < 28) {
            field4205 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 56)
    public static final void method1821(int arg0, boolean arg1) {
        ++field4209;
        class114 var2 = class330.field4399;
        synchronized (class330.field4399) {
            class330.field4399.method614(-124, arg0);
        }
        if (!arg1) {
            class114 var3 = class376.field5277;
            synchronized (class376.field5277) {
                class376.field5277.method614(-128, arg0);
            }
            class131 var4 = class119.field1482;
            synchronized (class119.field1482) {
                class119.field1482.method710(-10304, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 75)
    public class314() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Z)V", line = 79)
    public static final void method1822(boolean arg0) {
        ++field4210;
        class386.field5504.method606((byte) 113);
        if (arg0) {
            field4208 = null;
        }
        class249.field3353.method606((byte) 91);
        class350.field4869.method606((byte) 110);
        class155.field1961.method606((byte) 77);
        class208.field2807.method606((byte) 111);
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)Lae;", line = 95)
    public static final class275 method1823(int arg0, int arg1) {
        ++field4206;
        if (arg1 <= 111) {
            return null;
        } else {
            class275 var2 = (class275) class212.field2873.method616(-106, (long) arg0);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class189.field2395.method1687(arg0, 1, 255);
                class275 var4 = new class275();
                var4.field3721 = arg0;
                if (var3 != null) {
                    var4.method1516(new class250(var3), 31);
                }
                var4.method1517(true);
                if (var4.field3715 == 2 && class300.field4090.method308((long) arg0, (byte) -128) == null) {
                    class300.field4090.method314((long) arg0, new class310(class315.field4215), 7079);
                    class106.field1318[class315.field4215++] = var4;
                }
                class212.field2873.method615((byte) -111, (long) arg0, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V", line = 130)
    public static void method1824(byte arg0) {
        if (arg0 == 46) {
            field4205 = null;
            field4208 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)[I", line = 157)
    public final int[] method37(int arg0, int arg1) {
        ++field4211;
        if (arg0 != 2) {
            return null;
        } else {
            int[] var3 = super.field916.method1813(arg1, (byte) 10);
            if (super.field916.field4174) {
                class358.method2180(var3, 0, class420.field6139, class225.field3036[arg1]);
            }
            return var3;
        }
    }
}
