import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class79 extends class23 {

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "I")
    private int field1432 = 4096;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    private int field1429 = 0;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    private int field1433 = 16;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "I")
    private int field1437 = 2000;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "I")
    private int field1430 = 0;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Li;")
    public static class88 field1426 = class208.method1425(105, "null");

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Lea;")
    public static class46 field1427;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            this.field1432 = arg0.method301(71);
                        }
                    } else {
                        this.field1429 = arg0.method301(127);
                    }
                } else {
                    this.field1433 = arg0.method347(26119);
                }
            } else {
                this.field1437 = arg0.method301(34);
            }
        } else {
            this.field1430 = arg0.method347(26119);
        }
        if (arg1 == -3) {
            ++field1431;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(Z)V")
    public static void method526(boolean arg0) {
        field1427 = null;
        if (!arg0) {
            field1426 = null;
        }
        field1426 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[BIII[III)V")
    public static final void method527(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
        int var10 = -(arg4 >> 2);
        int var11 = -(3 & arg4);
        if (arg8 != -1) {
            field1435 = 100;
        }
        for (int var12 = -arg5; ~var12 > -1; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                if (arg3[arg9++] == 0) {
                    ++arg2;
                } else {
                    arg7[arg2++] = arg0;
                }
                if (arg3[arg9++] != 0) {
                    arg7[arg2++] = arg0;
                } else {
                    ++arg2;
                }
                if (arg3[arg9++] != 0) {
                    arg7[arg2++] = arg0;
                } else {
                    ++arg2;
                }
                if (~arg3[arg9++] != -1) {
                    arg7[arg2++] = arg0;
                } else {
                    ++arg2;
                }
            }
            for (int var14 = var11; ~var14 > -1; ++var14) {
                if (arg3[arg9++] == 0) {
                    ++arg2;
                } else {
                    arg7[arg2++] = arg0;
                }
            }
            arg2 += arg6;
            arg9 += arg1;
        }
        ++field1424;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method123(byte arg0) {
        if (arg0 != -69) {
            this.method11((class46) null, -66, 66);
        }
        class108.method742(-10798);
        ++field1436;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            method528(-117, 106);
        }
        ++field1434;
        int[] var3 = super.field379.method1080(false, arg0);
        if (super.field379.field3100) {
            int var4 = this.field1432 >> 1;
            int[][] var5 = super.field379.method1077(105);
            Random var6 = new Random((long) this.field1430);
            for (int var7 = 0; ~this.field1437 < ~var7; ++var7) {
                int var8 = ~this.field1432 < -1 ? this.field1429 - var4 - -class119.method814(this.field1432, var6, 54210528) : this.field1429;
                int var9 = (4085 & var8) >> 4;
                int var10 = class119.method814(class70.field1276, var6, 54210528);
                int var11 = class119.method814(class27.field460, var6, 54210528);
                int var12 = (class92.field1735[var9] * this.field1433 >> 12) + var11;
                int var13 = (class150.field2922[var9] * this.field1433 >> 12) + var10;
                int var14 = -var10 + var13;
                int var15 = -var11 + var12;
                if (~var14 != -1 || var15 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var13;
                        int var18 = var10;
                        var13 = var12;
                        var10 = var11;
                        var12 = var17;
                        var11 = var18;
                    }
                    if (~var13 > ~var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var13;
                        var11 = var12;
                        var12 = var20;
                        var13 = var19;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var13;
                    int var23 = -var11 + var12;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = ~var12 >= ~var11 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = -(class119.method814(4096, var6, 54210528) >> 2) + 1024;
                    for (int var28 = var10; var13 > var28; ++var28) {
                        int var29 = class45.field789 & var28;
                        var25 += var23;
                        int var30 = var27 - (-1024 - (-var10 + var28) * var24);
                        int var31 = var21 & class220.field4160;
                        if (var25 > 0) {
                            var25 += -var22;
                            var21 += var26;
                        }
                        if (var16) {
                            var5[var31][var29] = var30;
                        } else {
                            var5[var29][var31] = var30;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)I")
    public static final int method528(int arg0, int arg1) {
        ++field1425;
        if (arg1 != 16335) {
            return 14;
        } else if (~class126.field2350 == -2) {
            return 7;
        } else if (arg0 != 77) {
            if (arg0 != 38) {
                if (~arg0 != -17) {
                    if (arg0 != 161) {
                        if (~arg0 != -192) {
                            return ~arg0 == -70 ? 6 : 0;
                        } else {
                            return 5;
                        }
                    } else {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }
}
