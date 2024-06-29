import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class466 extends class176 {

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Z")
    public boolean field6565;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[Lnd;")
    public class466[] field6567;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Ldea;")
    public static class205 field6563 = new class205(8);

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field6568 = 0;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public int field6566;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "Lcg;")
    public class117 field6569;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lkl;")
    public class68 field6557;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public void method1078(int arg0) {
        if (this.field6565) {
            this.field6557.method564(-1);
            this.field6557 = null;
        } else {
            this.field6569.method826(2);
            this.field6569 = null;
        }
        if (arg0 <= -89) {
            field6553++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)[[I")
    public final int[][] method2719(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.field6557 = null;
        }
        field6555++;
        if (this.field6567[arg0].field6565) {
            int[] var4 = this.field6567[arg0].method2(arg1, 0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field6567[arg0].method33(arg1, false);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)I")
    public int method1138(byte arg0) {
        if (arg0 <= 65) {
            method2720(false);
        }
        field6564++;
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method2720(boolean arg0) {
        if (!arg0) {
            method2720(false);
        }
        field6563 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
    public int[][] method33(int arg0, boolean arg1) {
        if (arg1) {
            this.field6566 = -80;
        }
        field6561++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ldaa;II)V")
    public void method6(class11 arg0, int arg1, int arg2) {
        field6562++;
        if (arg1 != -5062) {
            this.field6566 = 84;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)[I")
    public final int[] method2721(int arg0, int arg1, int arg2) {
        field6560++;
        if (arg2 != 2) {
            field6563 = null;
        }
        return this.field6567[arg0].field6565 ? this.field6567[arg0].method2(arg1, 0) : this.field6567[arg0].method33(arg1, false)[0];
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)I")
    public int method1082(int arg0) {
        field6558++;
        if (arg0 != 0) {
            this.method1078(117);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public void method7(int arg0) {
        if (arg0 != -806066388) {
            this.field6557 = null;
        }
        field6554++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public int[] method2(int arg0, int arg1) {
        if (arg1 == 0) {
            field6556++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(III)V")
    public void method1137(int arg0, int arg1, int arg2) {
        field6559++;
        int var4 = this.field6566 == arg0 ? arg2 : this.field6566;
        if (this.field6565) {
            this.field6557 = new class68(var4, arg2, arg1);
        } else {
            this.field6569 = new class117(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZILmc;Z)V")
    public static final void method2722(int arg0, boolean arg1, int arg2, class114 arg3, boolean arg4) {
        field6570++;
        int var5 = arg3.field1853;
        if (arg3.field1783 == 0) {
            arg3.field1853 = arg3.field1840;
        } else if (arg3.field1783 == 1) {
            arg3.field1853 = arg2 - arg3.field1840;
        } else if (arg3.field1783 == 2) {
            arg3.field1853 = arg3.field1840 * arg2 >> 14;
        }
        int var6 = arg3.field1769;
        if (arg3.field1895 == 0) {
            arg3.field1769 = arg3.field1805;
        } else if (arg3.field1895 == 1) {
            arg3.field1769 = arg0 - arg3.field1805;
        } else if (arg3.field1895 == 2) {
            arg3.field1769 = arg3.field1805 * arg0 >> 14;
        }
        if (arg3.field1783 == 4) {
            arg3.field1853 = arg3.field1873 * arg3.field1769 / arg3.field1896;
        }
        if (arg1) {
            method2722(-37, true, 89, null, false);
        }
        if (arg3.field1895 == 4) {
            arg3.field1769 = arg3.field1896 * arg3.field1853 / arg3.field1873;
        }
        if (class168.field2427 && (client.method1534(arg3).field6963 != 0 || arg3.field1880 == 0)) {
            if (arg3.field1769 < 5 && arg3.field1853 < 5) {
                arg3.field1853 = 5;
                arg3.field1769 = 5;
            } else {
                if (arg3.field1769 <= 0) {
                    arg3.field1769 = 5;
                }
                if (arg3.field1853 <= 0) {
                    arg3.field1853 = 5;
                }
            }
        }
        if (class13.field189 == arg3.field1901) {
            class253.field3513 = arg3;
        }
        if (arg4 && arg3.field1830 != null && arg3.field1853 != var5 || arg3.field1769 != var6) {
            class224 var7 = new class224();
            var7.field3207 = arg3.field1830;
            var7.field3210 = arg3;
            class596.field8616.method463(var7, -113);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IZ)V")
    public class466(int arg0, boolean arg1) {
        this.field6565 = arg1;
        this.field6567 = new class466[arg0];
    }
}
