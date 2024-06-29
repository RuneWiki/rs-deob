import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class70 extends class200 {

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    private int field1225 = 2048;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    private int field1234 = 1024;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
    private int field1231 = 3072;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field1228 = 0;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
    public static int[] field1229 = new int[14];

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "Lid;")
    public static class149 field1237 = null;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method24(boolean arg0, int arg1) {
        int[][] var3 = super.field3632.method965(arg1, 127);
        if (!arg0) {
            this.method24(false, -28);
        }
        if (super.field3632.field2550) {
            int[][] var4 = this.method1366(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class137.field2515; ++var11) {
                var8[var11] = (var5[var11] * this.field1225 >> 12) + this.field1234;
                var9[var11] = (var6[var11] * this.field1225 >> 12) + this.field1234;
                var10[var11] = (var7[var11] * this.field1225 >> 12) + this.field1234;
            }
        }
        ++field1227;
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
    public static final void method440(int arg0) {
        ++field1235;
        if (arg0 >= -64) {
            method440(99);
        }
        class118.field2004.method1290((byte) 47);
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V")
    public static void method441(int arg0) {
        field1229 = null;
        if (arg0 <= 124) {
            method441(-11);
        }
        field1237 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
    public static final void method442(boolean arg0) {
        ++field1232;
        if (class23.field322 == null) {
            if (class244.field4296 == null) {
                int var1 = class80.field1487;
                if (arg0) {
                    method441(-87);
                }
                if (class32.field481) {
                    if (~var1 != -2) {
                        int var2 = class49.field883;
                        int var3 = class285.field5068;
                        if (~var2 > ~(class240.field4194 + -10) || class82.field1499 + class240.field4194 + 10 < var2 || class228.field3996 + -10 > var3 || ~(client.field2845 + class228.field3996 + 10) > ~var3) {
                            class32.field481 = false;
                            class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
                        }
                    }
                    if (~var1 == -2) {
                        int var4 = class240.field4194;
                        int var5 = class228.field3996;
                        int var6 = class82.field1499;
                        int var7 = class260.field4582;
                        int var8 = class159.field2921;
                        int var9 = -1;
                        for (int var10 = 0; ~var10 > ~class60.field1092; ++var10) {
                            int var11;
                            if (!class23.field324) {
                                var11 = (-var10 + -1 + class60.field1092) * 15 + var5 + 31;
                            } else {
                                var11 = (-var10 + class60.field1092 - 1) * 15 + var5 - -35;
                            }
                            if (~var4 > ~var7 && var7 < var4 + var6 && ~var8 < ~(var11 + -13) && ~var8 > ~(var11 + 3)) {
                                var9 = var10;
                            }
                        }
                        if (~var9 != 0) {
                            class186.method1281(2, var9);
                        }
                        class32.field481 = false;
                        class279.method1925(client.field2845, class240.field4194, class82.field1499, 0, class228.field3996);
                        return;
                    }
                } else {
                    if (~var1 == -2 && class60.field1092 > 0) {
                        short var12 = class284.field5032[class60.field1092 + -1];
                        if (~var12 == -43 || var12 == 50 || var12 == 37 || ~var12 == -2 || ~var12 == -3 || ~var12 == -31 || ~var12 == -19 || ~var12 == -45 || ~var12 == -27 || ~var12 == -24 || var12 == 12 || var12 == 1005) {
                            int var13 = class287.field5097[class60.field1092 + -1];
                            int var14 = class152.field2767[class60.field1092 + -1];
                            class47 var15 = class251.method1741((byte) 110, var13);
                            class161 var16 = client.method1104(var15);
                            if (var16.method1180(-23) || var16.method1187((byte) -88)) {
                                class50.field900 = 0;
                                class77.field1445 = false;
                                if (class23.field322 != null) {
                                    class182.method1267(class23.field322, 96);
                                }
                                class23.field322 = class251.method1741((byte) 110, var13);
                                class115.field1970 = var14;
                                class210.field3747 = class260.field4582;
                                class186.field3349 = class159.field2921;
                                class182.method1267(class23.field322, 127);
                                return;
                            }
                        }
                    }
                    if (~var1 == -2 && (class236.field4146 == 1 && ~class60.field1092 < -3 || class221.method1488(class60.field1092 - 1, (byte) -53))) {
                        var1 = 2;
                    }
                    if (var1 == 2 && ~class60.field1092 < -1 || class100.field1771 == 1) {
                        class36.method212(-116);
                    }
                    if ((var1 != 1 || ~class60.field1092 >= -1) && class100.field1771 != 2) {
                        return;
                    }
                    class147.method1013(117);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        this.field1225 = this.field1231 - this.field1234;
        ++field1236;
        int var2 = -88 % ((-60 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        ++field1233;
        if (arg1) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        super.field3641 = arg0.method489((byte) 105) == 1;
                    }
                } else {
                    this.field1231 = arg0.method485(-2386);
                }
            } else {
                this.field1234 = arg0.method485(-2386);
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            this.field1225 = 104;
        }
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            for (int var5 = 0; class137.field2515 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field1225 >> 12) + this.field1234;
            }
        }
        ++field1230;
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class70() {
        super(1, false);
    }
}
