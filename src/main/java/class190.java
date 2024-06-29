import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class190 extends class1 {

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "Loc;")
    private static class151 field3360 = class137.method873(2, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Z")
    public static boolean field3358 = false;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "Loc;")
    private static class151 field3367 = class137.method873(2, "level)2");

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Loc;")
    public static class151 field3364 = field3367;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "Loc;")
    public static class151 field3365 = field3360;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "[Lrc;")
    private class181[] field3363;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
    public static void method1178(byte arg0) {
        if (arg0 >= -17) {
            field3358 = true;
        }
        field3367 = null;
        field3360 = null;
        field3365 = null;
        field3364 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field3359;
        if (arg1 != -81) {
            method1181(-16, (byte) -68);
        }
        int[][] var3 = super.field13.method578(arg0, -1);
        if (super.field13.field1658) {
            int var4 = class202.field3603;
            int var5 = class129.field2354;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field13.method573(arg1 ^ -82);
            this.method1179(var6, arg1 ^ 18387);
            for (int var8 = 0; var8 < class129.field2354; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; ~var14 > ~class202.field3603; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class26.method206(var15 << 4, 4080);
                    var13[var14] = class26.method206(var15 >> 4, 4080);
                    var11[var14] = class26.method206(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (arg0 != arg1) {
            if (~arg1 == -2) {
                super.field27 = ~arg2.method1475(arg0 + 255) == -2;
            }
        } else {
            this.field3363 = new class181[arg2.method1475(arg0 ^ 255)];
            for (int var4 = 0; var4 < this.field3363.length; ++var4) {
                int var5 = arg2.method1475(255);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field3363[var4] = class94.method601(class112.method675(arg0, 128), arg2);
                            }
                        } else {
                            this.field3363[var4] = class124.method749(arg2, 1);
                        }
                    } else {
                        this.field3363[var4] = class23.method192(class112.method675(arg0, 8470), arg2);
                    }
                } else {
                    this.field3363[var4] = class133.method821(true, arg2);
                }
            }
        }
        ++field3362;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class190() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([[II)V")
    private final void method1179(int[][] arg0, int arg1) {
        int var3 = class202.field3603;
        ++field3366;
        if (arg1 != -18308) {
            field3365 = null;
        }
        int var4 = class129.field2354;
        class2.method23((byte) -76, arg0);
        class219.method1366(class155.field2804, 0, class78.field1510, 0, (byte) 108);
        if (this.field3363 != null) {
            for (int var5 = 0; ~var5 > ~this.field3363.length; ++var5) {
                class181 var6 = this.field3363[var5];
                int var7 = var6.field3275;
                int var8 = var6.field3279;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method48((byte) 125, var4, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method47((byte) -101, var4, var3);
                } else {
                    var6.method50(var3, 0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
    public final int[] method11(byte arg0, int arg1) {
        int[] var3 = super.field21.method1182(arg1, -31709);
        if (super.field21.field3388) {
            this.method1179(super.field21.method1183(arg0 ^ 107), arg0 ^ -18409);
        }
        ++field3368;
        if (arg0 != 107) {
            this.field3363 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static final void method1180() {
        for (int var0 = 0; var0 < class44.field919; ++var0) {
            class124 var1 = class219.field3817[var0];
            class106.method639(var1);
            class219.field3817[var0] = null;
        }
        class44.field919 = 0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
    public static final boolean method1181(int arg0, byte arg1) {
        if (arg1 >= -104) {
            return true;
        } else {
            ++field3361;
            return ~(arg0 >> 30 & 1) != -1;
        }
    }
}
