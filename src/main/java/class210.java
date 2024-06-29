import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class210 extends class199 {

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field2970 = -2;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public static int field2975 = 0;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "Lcc;")
    public static class327 field2973 = new class327(64);

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field2980 = -1;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "[[S")
    public static short[][] field2981 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -118);
        if (this.field2802.field5637) {
            int[][] var4 = this.method1459(0, arg1, (byte) -51);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var4[0];
            for (int var8 = 0; var8 < class95.field1235; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        if (arg0 != -1735) {
            method1543((class140) null, (byte) 10);
        }
        field2976++;
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lfh;B)V", line = 45)
    public static final void method1543(class140 arg0, byte arg1) {
        class291.field4210 = arg0;
        if (arg1 != -94) {
            field2980 = 34;
        }
        field2978++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lwf;B)Z", line = 57)
    public static final boolean method1544(class333 arg0, byte arg1) {
        field2974++;
        if (arg0.field5151 == null) {
            return false;
        }
        if (arg1 > -89) {
            field2970 = -79;
        }
        for (int var2 = 0; var2 < arg0.field5151.length; var2++) {
            int var3 = class219.method1600(var2, (byte) -81, arg0);
            int var4 = arg0.field5185[var2];
            if (arg0.field5151[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field5151[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field5151[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 114)
    public static final void method1545(int arg0) {
        field2977++;
        if (arg0 != 725) {
            method1545(34);
        }
        class217.field3062.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(II)Ldc;", line = 128)
    public static final class245 method1546(int arg0, int arg1) {
        class245 var2 = (class245) class133.field1806.method2265((long) arg0, (byte) 70);
        field2971++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class353.field5507.method1089(1, (byte) 119, arg0);
        class245 var4 = new class245();
        var4.field3572 = arg0;
        if (var3 != null) {
            var4.method1730(new class299(var3), (byte) 88);
        }
        var4.method1727((byte) 43);
        if (var4.field3580 == arg1 && class119.field1570.method2279((long) arg0, arg1 - 28) == null) {
            class119.field1570.method2275(new class7(class360.field5632), 118, (long) arg0);
            class318.field4683[class360.field5632++] = var4;
        }
        class133.field1806.method2257(-126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(B)V", line = 161)
    public static final void method1547(byte arg0) {
        field2979++;
        if (!class138.method1038(true) && class56.field724 != class226.field3256) {
            class208.method1534(false, 121, class253.field3699, false, class359.field5616.field4936[0], class359.field5616.field4842[0], class289.field4179, class56.field724);
            return;
        }
        if (arg0 >= -70) {
            method1547((byte) -86);
        }
        class192.method1393((byte) -111);
        if (class56.field724 != class346.field5387) {
            class44.method312(108);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 181)
    public class210() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(B)V", line = 192)
    public static void method1548(byte arg0) {
        field2981 = (short[][]) null;
        field2973 = null;
        if (arg0 != -39) {
            field2973 = (class327) null;
        }
    }
}
