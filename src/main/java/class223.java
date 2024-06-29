import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class223 extends class102 {

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    private int field4109 = 3072;

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "I")
    private int field4116 = 1024;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    private int field4118 = 2048;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Lqe;")
    private static class179 field4105 = class206.method1380("level)2", (byte) -128);

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Lqe;")
    public static class179 field4103 = class206.method1380("; Expires=", (byte) -25);

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "Lqe;")
    public static class179 field4117 = field4105;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lq;")
    public static class174 field4114 = new class174(0, 0);

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "I")
    public static int field4120 = 0;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "Lee;")
    public static class49 field4108;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "[I")
    public static int[] field4121;

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field1950.method598((byte) -40, arg0);
        ++field4110;
        if (super.field1950.field1724) {
            int[][] var4 = this.method677(126, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class155.field2796; ++var11) {
                var8[var11] = (var5[var11] * this.field4118 >> 12) + this.field4116;
                var9[var11] = this.field4116 - -(var6[var11] * this.field4118 >> 12);
                var10[var11] = (var7[var11] * this.field4118 >> 12) + this.field4116;
            }
        }
        return arg1 != 64 ? null : var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIB)I")
    public static final int method1444(int arg0, int arg1, int arg2, byte arg3) {
        ++field4106;
        int var4 = arg0 & 3;
        if (arg3 < 80) {
            method1446(-74, 69, (byte[]) null);
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return -arg2 + 7;
        } else {
            return ~var4 == -3 ? -arg1 + 7 : arg2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method191(int arg0) {
        this.field4118 = -this.field4116 + this.field4109;
        if (arg0 != 14005) {
            method1444(-11, 106, 16, (byte) 82);
        }
        ++field4107;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V")
    public static void method1445(boolean arg0) {
        if (!arg0) {
            method1445(true);
        }
        field4105 = null;
        field4121 = null;
        field4114 = null;
        field4108 = null;
        field4117 = null;
        field4103 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[B)I")
    public static final int method1446(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 0) {
            field4114 = null;
        }
        ++field4102;
        return class234.method1525(arg2, arg1, (byte) -10, 0);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III[Lqe;)Lqe;")
    public static final class179 method1447(int arg0, int arg1, int arg2, class179[] arg3) {
        ++field4115;
        int var4 = 0;
        for (int var5 = 0; arg0 > var5; ++var5) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class240.field4414;
            }
            var4 += arg3[arg2 + var5].field3277;
        }
        byte[] var6 = new byte[var4];
        if (arg1 != 16736) {
            return null;
        } else {
            int var7 = 0;
            for (int var8 = 0; ~var8 > ~arg0; ++var8) {
                class179 var10 = arg3[arg2 + var8];
                class154.method989(var10.field3256, 0, var6, var7, var10.field3277);
                var7 += var10.field3277;
            }
            class179 var9 = new class179();
            var9.field3256 = var6;
            var9.field3277 = var4;
            return var9;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        ++field4111;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int[] var4 = this.method679(arg1, 0, (byte) -109);
            for (int var5 = 0; ~class155.field2796 < ~var5; ++var5) {
                var3[var5] = this.field4116 - -(var4[var5] * this.field4118 >> 12);
            }
        }
        if (!arg0) {
            this.method11(false, 47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLeh;)V")
    public static final void method1448(boolean arg0, class52 arg1) {
        class74.field1445 = arg1;
        if (arg0) {
            ++field4104;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
    public static final void method1449(byte arg0, int arg1) {
        if (arg0 == 106) {
            ++field4112;
            if (~class80.field1545 != ~arg1) {
                if (class80.field1545 == 0) {
                    class47.method314((byte) 120);
                }
                if (~arg1 == -21 || ~arg1 == -41) {
                    class201.field3732 = 0;
                    class239.field4406 = 0;
                    class167.field3016 = 0;
                }
                if (~arg1 != -21 && ~arg1 != -41 && class40.field870 != null) {
                    class40.field870.method303(arg0 ^ 107);
                    class40.field870 = null;
                }
                if (class80.field1545 == 25) {
                    class6.field191 = 1;
                    class47.field1021 = 0;
                    class121.field2263 = 1;
                    class60.field1290 = 0;
                    class95.field1799 = 0;
                }
                if (arg1 != 5 && arg1 != 10 && ~arg1 != -21) {
                    class149.method951(2);
                } else {
                    class3.method17(class131.field2384, (byte) 113, class81.field1571, field4108);
                }
                class80.field1545 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field4113;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field1957 = ~arg0.method1243(3) == -2;
                }
            } else {
                this.field4109 = arg0.method1252(2);
            }
        } else {
            this.field4116 = arg0.method1252(2);
        }
        if (arg2) {
            method1445(false);
        }
    }
}
