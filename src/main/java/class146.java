import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class146 extends class264 {

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "Z")
    private boolean field2572 = true;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "Z")
    private boolean field2573 = true;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "Lcf;")
    public static class93 field2578 = class147.method1066(" ", -48);

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "Lcf;")
    public static class93 field2580 = class147.method1066("Wordpack geladen)3", -48);

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "J")
    public static volatile long field2579 = 0L;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Llb;")
    public static class130 field2576;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lhg;")
    public static class177 field2582;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static final void method1060(int arg0) {
        ++field2570;
        if (~class69.field1262 != 0) {
            class125.method919(86, class69.field1262);
        }
        for (int var1 = 0; class161.field2845 > var1; ++var1) {
            if (class25.field314[var1]) {
                class252.field4541[var1] = true;
            }
            class108.field1856[var1] = class25.field314[var1];
            class25.field314[var1] = false;
        }
        class130.field2287 = -1;
        class44.field705 = class275.field4921;
        class121.field2141 = null;
        class174.field3029 = -1;
        if (arg0 > -1) {
            method1060(42);
        }
        if (~class69.field1262 != 0) {
            class161.field2845 = 0;
            class275.method1840(true);
        }
        class75.method522();
        class203.field3670 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class146() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field2581;
        if (arg1 > -83) {
            method1061(-119, false, -123, 35, 70, 44, false);
        }
        int[] var3 = super.field4716.method532((byte) 88, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, this.field2572 ? -arg0 + class53.field881 : arg0, 21654);
            if (!this.field2573) {
                class107.method768(var4, 0, var3, 0, class176.field3060);
            } else {
                for (int var5 = 0; class176.field3060 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class55.field910];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method1061(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class13.field167 = arg0;
        class188.field3458 = arg5;
        ++field2569;
        if (!arg6) {
            field2577 = 115;
        }
        class139.field2422 = arg4;
        class127.field2248 = arg3;
        class42.field658 = arg2;
        if (arg1 && class139.field2422 >= 100) {
            class166.field2925 = class188.field3458 * 128 - -64;
            class165.field2919 = class127.field2248 * 128 + 64;
            class77.field1442 = class13.method56(class165.field2919, class166.field2925, (byte) 23, class138.field2405) + -class13.field167;
        }
        class18.field234 = 2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Z")
    public static final boolean method1062(byte arg0, int arg1) {
        ++field2575;
        if (class205.field3690[arg1]) {
            return true;
        } else if (!class264.field4714.method1273(23100, arg1)) {
            return false;
        } else {
            int var2 = class264.field4714.method1283(arg1, -5357);
            if (var2 == 0) {
                class205.field3690[arg1] = true;
                return true;
            } else {
                if (class6.field82[arg1] == null) {
                    class6.field82[arg1] = new class181[var2];
                }
                if (arg0 != -103) {
                    return false;
                } else {
                    for (int var3 = 0; ~var2 < ~var3; ++var3) {
                        if (class6.field82[arg1][var3] == null) {
                            byte[] var4 = class264.field4714.method1271(arg1, arg0 + -2051, var3);
                            if (var4 != null) {
                                class181 var5 = class6.field82[arg1][var3] = new class181();
                                var5.field3219 = (arg1 << 16) + var3;
                                if (~var4[0] == 0) {
                                    var5.method1326(1, new class280(var4));
                                } else {
                                    var5.method1332((byte) 67, new class280(var4));
                                }
                            }
                        }
                    }
                    class205.field3690[arg1] = true;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static void method1063(int arg0) {
        if (arg0 != 0) {
            method1063(48);
        }
        field2582 = null;
        field2578 = null;
        field2576 = null;
        field2580 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.method17(14, false);
        }
        int[][] var3 = super.field4705.method1089(arg0, 91);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-115, 0, this.field2572 ? class53.field881 - arg0 : arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field2573) {
                for (int var11 = 0; var11 < class176.field3060; ++var11) {
                    var6[var11] = var5[-var11 + class55.field910];
                    var9[var11] = var7[-var11 + class55.field910];
                    var10[var11] = var8[-var11 + class55.field910];
                }
            } else {
                for (int var12 = 0; var12 < class176.field3060; ++var12) {
                    var6[var12] = var5[var12];
                    var9[var12] = var7[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        ++field2574;
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 <= 11) {
            this.field2573 = false;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4698 = arg2.method1907(16832) == 1;
                }
            } else {
                this.field2572 = ~arg2.method1907(16832) == -2;
            }
        } else {
            this.field2573 = ~arg2.method1907(16832) == -2;
        }
        ++field2571;
    }
}
