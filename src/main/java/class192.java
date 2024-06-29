import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class192 extends class117 {

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Lqc;")
    public static class258 field3510 = new class258(16);

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "Loj;")
    public static class17 field3512 = new class17(64);

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    public static int field3513 = -1;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "Lqc;")
    public static class258 field3514 = new class258(512);

    @OriginalMember(owner = "client!nh", name = "bb", descriptor = "I")
    public static int field3516 = 0;

    @OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lqc;")
    public static class258 field3517 = new class258(4096);

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!nh", name = "db", descriptor = "[I")
    public static int[] field3518;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "[Lrh;")
    public static class242[] field3511;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "[Lvf;")
    public static class71[] field3515;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "(I)V")
    public static final void method1405(int arg0) {
        ++field3507;
        class115.field2191.method730(true);
        class13.field212 = null;
        class157.field2919 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lwb;B)V")
    public static final void method1406(class225 arg0, byte arg1) {
        class49.method352(arg0, 200000, false);
        ++field3509;
        int var2 = 107 / ((arg1 - -34) / 32);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
    public class192() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field3508;
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (arg0 != -21393) {
            method1407(113);
        }
        if (super.field2218.field2587) {
            int[][] var4 = this.method931(arg1, -87, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            for (int var8 = 0; ~class143.field2702 < ~var8; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
    public static void method1407(int arg0) {
        field3510 = null;
        if (arg0 != 24771) {
            field3514 = null;
        }
        field3518 = null;
        field3512 = null;
        field3517 = null;
        field3511 = null;
        field3515 = null;
        field3514 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[Lsf;I)V")
    public static final void method1408(int arg0, int arg1, class223[] arg2, int arg3) {
        ++field3506;
        if (arg0 != -1) {
            field3515 = null;
        }
        if (arg1 > arg3) {
            int var4 = (arg1 + arg3) / 2;
            int var5 = arg1 + 1;
            class223 var6 = arg2[var4];
            int var7 = arg3 + -1;
            arg2[var4] = arg2[arg3];
            arg2[arg3] = var6;
            while (~var5 < ~var7) {
                boolean var8 = true;
                do {
                    --var5;
                    for (int var9 = 0; var9 < 4; ++var9) {
                        int var10;
                        int var11;
                        if (~class30.field473[var9] == -3) {
                            var10 = var6.field4054;
                            var11 = arg2[var5].field4054;
                        } else if (~class30.field473[var9] != -2) {
                            if (class30.field473[var9] != 3) {
                                var11 = arg2[var5].field4065;
                                var10 = var6.field4065;
                            } else {
                                var10 = var6.field4056 ? 1 : 0;
                                var11 = !arg2[var5].field4056 ? 0 : 1;
                            }
                        } else {
                            var10 = var6.field4061;
                            if (~var10 == 0 && ~class69.field1300[var9] == -2) {
                                var10 = 2001;
                            }
                            var11 = arg2[var5].field4061;
                            if (var11 == -1 && class69.field1300[var9] == 1) {
                                var11 = 2001;
                            }
                        }
                        if (var10 != var11) {
                            if ((~class69.field1300[var9] != -2 || var11 <= var10) && (~class69.field1300[var9] != -1 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (~var9 == -4) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    ++var7;
                    for (int var13 = 0; var13 < 4; ++var13) {
                        int var14;
                        int var15;
                        if (~class30.field473[var13] != -3) {
                            if (class30.field473[var13] != 1) {
                                if (~class30.field473[var13] == -4) {
                                    var14 = var6.field4056 ? 1 : 0;
                                    var15 = !arg2[var7].field4056 ? 0 : 1;
                                } else {
                                    var15 = arg2[var7].field4065;
                                    var14 = var6.field4065;
                                }
                            } else {
                                var15 = arg2[var7].field4061;
                                var14 = var6.field4061;
                                if (var14 == -1 && ~class69.field1300[var13] == -2) {
                                    var14 = 2001;
                                }
                                if (var15 == -1 && class69.field1300[var13] == 1) {
                                    var15 = 2001;
                                }
                            }
                        } else {
                            var14 = var6.field4054;
                            var15 = arg2[var7].field4054;
                        }
                        if (~var14 != ~var15) {
                            if ((~class69.field1300[var13] != -2 || ~var15 <= ~var14) && (class69.field1300[var13] != 0 || var15 <= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (~var5 < ~var7) {
                    class223 var16 = arg2[var7];
                    arg2[var7] = arg2[var5];
                    arg2[var5] = var16;
                }
            }
            method1408(arg0, var5, arg2, arg3);
            method1408(-1, arg1, arg2, var5 + 1);
        }
    }
}
