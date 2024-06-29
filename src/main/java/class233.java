import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class233 extends class154 {

    @OriginalMember(owner = "client!gl", name = "hb", descriptor = "Z")
    private boolean field4027 = true;

    @OriginalMember(owner = "client!gl", name = "jb", descriptor = "Z")
    private boolean field4029 = true;

    @OriginalMember(owner = "client!gl", name = "db", descriptor = "Leg;")
    public static class37 field4023 = class174.method1167(")2", 58);

    @OriginalMember(owner = "client!gl", name = "fb", descriptor = "Leg;")
    private static class37 field4025 = class174.method1167("Loaded sprites", 123);

    @OriginalMember(owner = "client!gl", name = "kb", descriptor = "I")
    public static int field4030 = 0;

    @OriginalMember(owner = "client!gl", name = "bb", descriptor = "Leg;")
    public static class37 field4021 = class174.method1167("null", -77);

    @OriginalMember(owner = "client!gl", name = "mb", descriptor = "Leg;")
    public static class37 field4032 = field4025;

    @OriginalMember(owner = "client!gl", name = "Y", descriptor = "Z")
    public static boolean field4018 = false;

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "Lrd;")
    public static class125 field4017 = new class125();

    @OriginalMember(owner = "client!gl", name = "ab", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!gl", name = "cb", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!gl", name = "gb", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!gl", name = "ib", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!gl", name = "Z", descriptor = "Lja;")
    public static class105 field4019;

    @OriginalMember(owner = "client!gl", name = "lb", descriptor = "[[[Lw;")
    public static class111[][][] field4031;

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    public class233() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLf;Lf;)V")
    public static final void method1604(boolean arg0, class291 arg1, class291 arg2) {
        if (arg2.field5124 != null) {
            arg2.method1953(91923);
        }
        arg2.field5124 = arg1;
        ++field4026;
        arg2.field5129 = arg1.field5129;
        if (!arg0) {
            arg2.field5124.field5129 = arg2;
            arg2.field5129.field5124 = arg2;
        }
    }

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "(I)V")
    public static void method1605(int arg0) {
        field4017 = null;
        field4023 = null;
        field4031 = null;
        field4021 = null;
        if (arg0 != 0) {
            field4030 = -114;
        }
        field4032 = null;
        field4019 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        ++field4024;
        if (arg1 == -14015) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field2579 = arg0.method1268(255) == 1;
                    }
                } else {
                    this.field4029 = arg0.method1268(arg1 + 14270) == 1;
                }
            } else {
                this.field4027 = arg0.method1268(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        int[][] var3 = super.field2585.method1532(arg1, -121);
        if (super.field2585.field3761) {
            int[][] var4 = this.method1054(arg0 + -115, 0, this.field4029 ? class239.field4260 - arg1 : arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field4027) {
                for (int var11 = 0; var11 < class227.field3898; ++var11) {
                    var8[var11] = var5[class109.field1786 - var11];
                    var9[var11] = var6[-var11 + class109.field1786];
                    var10[var11] = var7[-var11 + class109.field1786];
                }
            } else {
                for (int var12 = 0; class227.field3898 > var12; ++var12) {
                    var8[var12] = var5[var12];
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        ++field4022;
        if (arg0 != 115) {
            field4032 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        if (arg1 != 1075962732) {
            this.method142((class187) null, 126, -68);
        }
        int[] var3 = super.field2574.method206(arg0, 10232);
        if (super.field2574.field536) {
            int[] var4 = this.method1052(0, !this.field4029 ? arg0 : -arg0 + class239.field4260, (byte) -59);
            if (this.field4027) {
                for (int var5 = 0; var5 < class227.field3898; ++var5) {
                    var3[var5] = var4[-var5 + class109.field1786];
                }
            } else {
                class54.method352(var4, 0, var3, 0, class227.field3898);
            }
        }
        ++field4028;
        return var3;
    }
}
