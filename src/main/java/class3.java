import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class273 {

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "Lic;")
    public static class160 field31 = new class160(16);

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "Lkj;")
    public static class114 field40 = null;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field41 = "Loaded defaults";

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "Lic;")
    public static class160 field37 = new class160(4);

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "Lic;")
    public static class160 field42 = new class160(4);

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "[Lti;")
    public static class139[] field45 = new class139[32768];

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field43 = -1;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "Lsb;")
    public static class124 field33;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[Lbf;")
    public static class102[] field39;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "[Lk;")
    private class36[] field36;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([[II)V")
    private final void method13(int[][] arg0, int arg1) {
        ++field29;
        int var3 = class26.field458;
        int var4 = class67.field1129;
        class192.method1319(arg0, 0);
        class45.method394(class145.field2392, 0, client.field4573, arg1, 0);
        if (this.field36 != null) {
            for (int var5 = 0; this.field36.length > var5; ++var5) {
                class36 var6 = this.field36[var5];
                int var7 = var6.field611;
                int var8 = var6.field608;
                if (var8 < 0) {
                    if (~var7 <= -1) {
                        var6.method310(var4, var3, (byte) -115);
                    }
                } else if (~var7 <= -1) {
                    var6.method309(var4, var3, (byte) -17);
                } else {
                    var6.method307(0, var3, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        if (arg0) {
            field43 = 49;
        }
        int[] var3 = super.field4359.method387((byte) -61, arg1);
        ++field32;
        if (super.field4359.field833) {
            this.method13(super.field4359.method385((byte) 70), -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(ZLsb;)V")
    public static final void method14(boolean arg0, class124 arg1) {
        ++field30;
        class163.field2663 = arg1;
        if (!arg0) {
            method18((class114) null, 92, -1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            return null;
        } else {
            ++field26;
            int[][] var3 = super.field4357.method1949(true, arg1);
            if (super.field4357.field4631) {
                int var4 = class26.field458;
                int var5 = class67.field1129;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field4357.method1945((byte) -55);
                this.method13(var6, -1);
                for (int var8 = 0; ~var8 > ~class67.field1129; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class26.field458; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class64.method498(4080, var15 << 4);
                        var12[var14] = class64.method498(4080, var15 >> 4);
                        var11[var14] = class64.method498(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public static void method15(int arg0) {
        if (arg0 != -27577) {
            field39 = null;
        }
        field37 = null;
        field39 = null;
        field42 = null;
        field41 = null;
        field40 = null;
        field45 = null;
        field33 = null;
        field31 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field27;
        if (~arg1 == -1) {
            this.field36 = new class36[arg0.method1012(4)];
            for (int var4 = 0; ~var4 > ~this.field36.length; ++var4) {
                int var5 = arg0.method1012(4);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field36[var4] = class297.method1988(arg0, class172.method1232(arg2, -28309));
                            }
                        } else {
                            this.field36[var4] = class186.method1294(0, arg0);
                        }
                    } else {
                        this.field36[var4] = class170.method1219(arg0, 107);
                    }
                } else {
                    this.field36[var4] = class245.method1631((byte) -49, arg0);
                }
            }
        } else if (arg1 == 1) {
            super.field4358 = arg0.method1012(arg2 ^ 1) == 1;
        }
        if (arg2 != 5) {
            method16(-63, -99, -101, 42, 107, 1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)V")
    public static final void method16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field28;
        int var6 = class32.method278(class108.field1650, arg1 + 1, class154.field2509, arg4);
        int var7 = class32.method278(class108.field1650, arg1 + 1, class154.field2509, arg2);
        if (arg1 != 0) {
            field41 = null;
        }
        int var8 = class32.method278(class32.field540, 1, class61.field1034, arg3);
        int var9 = class32.method278(class32.field540, 1, class61.field1034, arg0);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class224.method1504(arg5, var9, var8, class114.field1841[var10], 7);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lmi;I)V")
    public static final void method17(class88 arg0, int arg1) {
        if (arg0.field1413 != null) {
            arg0.field1413.field2641 = 0;
        }
        ++field34;
        arg0.field1414 = false;
        for (class88 var2 = arg0.method193(); var2 != null; var2 = arg0.method215()) {
            method17(var2, -110);
        }
        if (arg1 > -102) {
            field33 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lkj;II)Ljava/lang/String;")
    public static final String method18(class114 arg0, int arg1, int arg2) {
        ++field38;
        if (!client.method1916(arg0).method1680(arg1, true) && arg0.field1921 == null) {
            return null;
        } else if (arg0.field1775 != null && arg0.field1775.length > arg1 && arg0.field1775[arg1] != null && ~arg0.field1775[arg1].trim().length() != -1) {
            if (arg2 != -5978) {
                method19((byte) -35, -60, 22, -58, -22);
            }
            return arg0.field1775[arg1];
        } else {
            return class199.field3247 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIIII)V")
    public static final void method19(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 84) {
            field33 = null;
        }
        for (int var5 = 0; ~class258.field4114 < ~var5; ++var5) {
            if (arg4 < class220.field3522[var5] - -class164.field2670[var5] && arg1 + arg4 > class220.field3522[var5] && arg2 < class287.field4594[var5] + class252.field4009[var5] && arg2 + arg3 > class252.field4009[var5]) {
                class118.field1991[var5] = true;
            }
        }
        ++field35;
    }
}
