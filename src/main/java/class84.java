import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 extends class23 {

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "B")
    public static byte field1492;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        if (arg1 != 9) {
            field1484 = 96;
        }
        ++field1483;
        int[][] var3 = super.field398.method1522(-29659, arg0);
        if (super.field398.field4303) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class199.field3705; ++var7) {
                this.method576(arg1 ^ -48, var7, arg0);
                int[][] var8 = this.method159(0, (byte) -99, class68.field1242);
                var4[var7] = var8[0][class135.field2495];
                var5[var7] = var8[1][class135.field2495];
                var6[var7] = var8[2][class135.field2495];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIBI[B[Lp;IIII)V")
    public static final void method573(int arg0, boolean arg1, int arg2, byte arg3, int arg4, byte[] arg5, class163[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg3 == 11) {
            ++field1489;
            if (!arg1) {
                for (int var11 = 0; var11 < 8; ++var11) {
                    for (int var12 = 0; ~var12 > -9; ++var12) {
                        if (~(arg7 + var11) < -1 && arg7 - -var11 < 103 && arg8 - -var12 > 0 && ~(arg8 + var12) > -104) {
                            arg6[arg2].field3080[arg7 - -var11][arg8 + var12] = class58.method449(arg6[arg2].field3080[arg7 - -var11][arg8 + var12], -16777217);
                        }
                    }
                }
            }
            byte var13;
            if (arg1) {
                var13 = 1;
            } else {
                var13 = 4;
            }
            class28 var14 = new class28(arg5);
            for (int var15 = 0; var15 < var13; ++var15) {
                for (int var16 = 0; var16 < 64; ++var16) {
                    for (int var17 = 0; var17 < 64; ++var17) {
                        if (~arg9 == ~var15 && ~var16 <= ~arg0 && arg0 + 8 > var16 && ~var17 <= ~arg10 && var17 < arg10 + 8) {
                            class163.method1099(class230.method1491(arg4, (byte) 83, var17 & 7, 7 & var16) + arg8, var14, arg2, arg7 + class120.method825((byte) 96, 7 & var16, 7 & var17, arg4), arg1, 0, (byte) -122, arg4, 0);
                        } else {
                            class163.method1099(-1, var14, 0, -1, arg1, 0, (byte) -122, 0, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public static final void method574(boolean arg0) {
        if (!arg0) {
            method574(false);
        }
        ++field1490;
        if (class180.field3352 != null) {
            class180.field3352.method557(false);
            class180.field3352 = null;
        }
        class112.method769(117);
        class6.method45();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class11.field143[var1].method1096(113);
        }
        class145.method1004((byte) -94);
        System.gc();
        class91.method602(-257, 2);
        class238.field4376 = false;
        class184.field3396 = -1;
        class95.method635(-11211);
        class236.method1525(10, 27172);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class43.method380(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << 7;
                int var7 = arg3 << 7;
                return class217.method1439(var6 + 1, class39.field808[arg0][arg1][arg3] + arg5, var7 + 1) && class217.method1439(var6 + 128 - 1, class39.field808[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class217.method1439(var6 + 128 - 1, class39.field808[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class217.method1439(var6 + 1, class39.field808[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class212.field3970[arg0][var8][var14] == -class164.field3111) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class39.field808[arg0][arg1][arg3] + arg5;
            if (!class217.method1439(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << 7) - 1;
                if (!class217.method1439(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << 7) - 1;
                    if (!class217.method1439(var9, var11, var13)) {
                        return false;
                    } else if (!class217.method1439(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(III)V")
    private final void method576(int arg0, int arg1, int arg2) {
        ++field1488;
        int var4 = class133.field2477[arg1];
        int var5 = class167.field3196[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class68.field1242 = arg2;
            class135.field2495 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class68.field1242 = arg1;
            class135.field2495 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class68.field1242 = arg1;
            class135.field2495 = -arg2 + class199.field3705;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class68.field1242 = -arg2 + class235.field4276;
            class135.field2495 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class68.field1242 = -arg2 + class235.field4276;
            class135.field2495 = -arg1 + class199.field3705;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class135.field2495 = class199.field3705 - arg2;
            class68.field1242 = -arg1 + class235.field4276;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class68.field1242 = -arg1 + class235.field4276;
            class135.field2495 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class68.field1242 = arg2;
            class135.field2495 = -arg1 + class199.field3705;
        }
        class135.field2495 &= class215.field4008;
        class68.field1242 &= class5.field44;
        if (arg0 > -19) {
            method575(72, -62, -93, -37, -13, -119);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field1493;
            int[] var3 = super.field405.method1461(arg1, (byte) -125);
            if (super.field405.field4114) {
                for (int var4 = 0; ~var4 > ~class199.field3705; ++var4) {
                    this.method576(-127, var4, arg1);
                    int[] var5 = this.method162(class68.field1242, 0, (byte) 18);
                    var3[var4] = var5[class135.field2495];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field1486;
        if (~arg1 == -1) {
            super.field407 = ~arg0.method215(-1797813752) == -2;
        }
        if (arg2 != 1000) {
            this.method57(100, -76);
        }
    }
}
