import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class256 extends class222 {

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "I")
    private int field4531 = 0;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "I")
    private int field4532 = 2000;

    @OriginalMember(owner = "client!ge", name = "kb", descriptor = "I")
    private int field4545 = 0;

    @OriginalMember(owner = "client!ge", name = "lb", descriptor = "I")
    private int field4546 = 4096;

    @OriginalMember(owner = "client!ge", name = "gb", descriptor = "I")
    private int field4541 = 16;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "I")
    public static int field4536 = 1;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ge", name = "eb", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!ge", name = "hb", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!ge", name = "ib", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ge", name = "jb", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "[I")
    public static int[] field4534;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLq;II)V")
    public static final void method1770(byte arg0, class148 arg1, int arg2, int arg3) {
        ++field4537;
        if (class124.field2250 == 0 || ~class124.field2250 == -4) {
            if (arg1.method1093(1)) {
                if (arg0 != 67) {
                    field4536 = 29;
                }
                int var4 = arg1.field2638[arg3];
                if (arg2 >= var4 && ~(var4 - -arg1.field2713[arg3]) <= ~arg2) {
                    int var5 = arg2 - arg1.field2694 / 2;
                    int var6 = 2047 & class243.field4219 + class135.field2396;
                    int var7 = arg3 - arg1.field2647 / 2;
                    int var8 = class160.field2890[var6];
                    int var9 = class160.field2893[var6];
                    int var10 = (class146.field2557 + 256) * var9 >> 8;
                    int var11 = (class146.field2557 - -256) * var8 >> 8;
                    int var12 = var5 * var11 + var7 * var10 >> 11;
                    int var13 = var7 * var11 + -(var5 * var10) >> 11;
                    int var14 = -var13 + class163.field2943.field4466 >> 7;
                    int var15 = class163.field2943.field4492 - -var12 >> 7;
                    if (~class130.field2312 < -1 && class107.field1915[82] && class107.field1915[81]) {
                        class115.method857(arg0 ^ 50, class265.field4640, class182.field3143 + var14, class189.field3277 + var15);
                    } else {
                        boolean var16 = class87.method643(0, class163.field2943.field4491[0], 0, -2103675568, 0, 1, 0, class163.field2943.field4501[0], true, 0, var15, var14);
                        if (var16) {
                            class237.field4084.method1477(var5, -26755);
                            class237.field4084.method1477(var7, -26755);
                            class237.field4084.method1470((byte) -122, class243.field4219);
                            class237.field4084.method1477(57, -26755);
                            class237.field4084.method1477(class135.field2396, -26755);
                            class237.field4084.method1477(class146.field2557, -26755);
                            class237.field4084.method1477(89, -26755);
                            class237.field4084.method1470((byte) -122, class163.field2943.field4492);
                            class237.field4084.method1470((byte) -122, class163.field2943.field4466);
                            class237.field4084.method1477(class76.field1334, arg0 ^ -26818);
                            class237.field4084.method1477(63, -26755);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field4540;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field4546 = arg0.method1487(27);
                        }
                    } else {
                        this.field4545 = arg0.method1487(104);
                    }
                } else {
                    this.field4541 = arg0.method1446(5350);
                }
            } else {
                this.field4532 = arg0.method1487(17);
            }
        } else {
            this.field4531 = arg0.method1446(5350);
        }
        if (arg1) {
            this.field4545 = 40;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = 93 / ((arg0 - 57) / 51);
        ++field4533;
        class133.method1002(0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)[B")
    public static final byte[] method1771(int arg0, int arg1) {
        ++field4539;
        if (arg0 != 12371) {
            return null;
        } else {
            class163 var2 = (class163) class116.field2087.method1307((byte) -69, (long) arg1);
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; var6 < 255; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = class124.method926(arg0 ^ -12350, var7, var4);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class163(var3);
                class116.field2087.method1312(true, var2, (long) arg1);
            }
            return var2.field2937;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field4543;
        int[] var3 = super.field3844.method22(0, arg1);
        if (arg0 < 35) {
            this.method288(26);
        }
        if (super.field3844.field61) {
            int var4 = this.field4546 >> 1;
            int[][] var5 = super.field3844.method17(-12433);
            Random var6 = new Random((long) this.field4531);
            for (int var7 = 0; ~var7 > ~this.field4532; ++var7) {
                int var8 = this.field4546 > 0 ? -var4 + this.field4545 + class124.method926(94, this.field4546, var6) : this.field4545;
                int var9 = (var8 & 4087) >> 4;
                int var10 = class124.method926(-92, class13.field253, var6);
                int var11 = class124.method926(-42, class20.field373, var6);
                int var12 = (class132.field2351[var9] * this.field4541 >> 12) + var10;
                int var13 = var12 - var10;
                int var14 = (class33.field573[var9] * this.field4541 >> 12) + var11;
                int var15 = -var11 + var14;
                if (~var13 != -1 || var15 != 0) {
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 < ~var13;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var12 = var14;
                        var14 = var18;
                        var10 = var11;
                        var11 = var17;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var11;
                        int var20 = var10;
                        var11 = var14;
                        var10 = var12;
                        var12 = var20;
                        var14 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var11 + var14;
                    if (~var22 > -1) {
                        var22 = -var22;
                    }
                    int var23 = var12 - var10;
                    int var24 = 2048 / var23;
                    int var25 = 1024 - (class124.method926(105, 4096, var6) >> 2);
                    int var26 = -var23 / 2;
                    int var27 = var14 <= var11 ? -1 : 1;
                    for (int var28 = var10; var28 < var12; ++var28) {
                        var26 += var22;
                        int var29 = class191.field3299 & var21;
                        int var30 = class162.field2924 & var28;
                        if (~var26 < -1) {
                            var26 += -var23;
                            var21 += var27;
                        }
                        int var31 = (-var10 + var28) * var24 + var25 + 1024;
                        if (var16) {
                            var5[var29][var30] = var31;
                        } else {
                            var5[var30][var29] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class256() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)V")
    public static void method1772(byte arg0) {
        if (arg0 <= 58) {
            field4534 = null;
        }
        field4534 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIIIII)V")
    public static final void method1773(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -9 / ((arg0 - -41) / 35);
        ++field4538;
        if (class215.field3666 >= arg1 && ~class116.field2077 >= ~arg2) {
            boolean var7;
            if (arg4 < class229.field3933) {
                var7 = false;
                arg4 = class229.field3933;
            } else if (~class106.field1899 > ~arg4) {
                arg4 = class106.field1899;
                var7 = false;
            } else {
                var7 = true;
            }
            boolean var8;
            if (~arg3 > ~class229.field3933) {
                var8 = false;
                arg3 = class229.field3933;
            } else if (class106.field1899 >= arg3) {
                var8 = true;
            } else {
                var8 = false;
                arg3 = class106.field1899;
            }
            if (~class116.field2077 < ~arg1) {
                arg1 = class116.field2077;
            } else {
                class37.method305(-7, class43.field721[arg1++], arg4, arg5, arg3);
            }
            if (~arg2 >= ~class215.field3666) {
                class37.method305(-7, class43.field721[arg2--], arg4, arg5, arg3);
            } else {
                arg2 = class215.field3666;
            }
            if (var8 && var7) {
                for (int var9 = arg1; ~arg2 <= ~var9; ++var9) {
                    int[] var10 = class43.field721[var9];
                    var10[arg3] = var10[arg4] = arg5;
                }
            } else {
                if (!var8) {
                    if (var7) {
                        for (int var11 = arg1; var11 <= arg2; ++var11) {
                            class43.field721[var11][arg4] = arg5;
                        }
                        return;
                    }
                } else {
                    for (int var12 = arg1; ~var12 >= ~arg2; ++var12) {
                        class43.field721[var12][arg3] = arg5;
                    }
                }
            }
        }
    }
}
