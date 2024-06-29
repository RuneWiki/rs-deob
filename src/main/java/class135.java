import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class135 extends class170 {

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    private int field2329 = 0;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "I")
    private int field2335 = 1365;

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    private int field2337 = 0;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    private int field2339 = 20;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "Z")
    public static boolean field2336 = false;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field2330 = 0;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIBIIILri;IIIILba;Z)Lba;")
    public static final class166 method942(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class65 arg7, int arg8, int arg9, int arg10, int arg11, class166 arg12, boolean arg13) {
        long var14 = ((long) arg2 << 32) + ((long) arg4 << 48) + (long) ((arg11 << 24) + (arg6 << 16) + arg5);
        class166 var16 = (class166) class223.field4080.method1387(var14, 121);
        if (arg3 != -7) {
            return null;
        } else {
            ++field2332;
            if (var16 == null) {
                byte var17 = 3;
                int[] var18 = new int[] { 64, 96, 128 };
                byte var19;
                if (~arg5 != -2) {
                    if (arg5 != 2) {
                        if (arg5 != 3) {
                            if (~arg5 == -5) {
                                var19 = 18;
                            } else {
                                var19 = 21;
                            }
                        } else {
                            var19 = 15;
                        }
                    } else {
                        var19 = 12;
                    }
                } else {
                    var19 = 9;
                }
                class210 var20 = new class210(var17 * var19 + 1, var17 * var19 * 2 + -var19, 0);
                int[][] var21 = new int[var17][var19];
                int var22 = var20.method1486(0, 0, 0);
                for (int var23 = 0; var17 > var23; ++var23) {
                    int var30 = var18[var23];
                    int var31 = var18[var23];
                    for (int var32 = 0; var32 < var19; ++var32) {
                        int var33 = (var32 << 11) / var19;
                        int var34 = class257.field4598[var33] * var30 + arg8 >> 16;
                        int var35 = arg1 - -(class257.field4597[var33] * var31) >> 16;
                        var21[var23][var32] = var20.method1486(var34, 0, var35);
                    }
                }
                for (int var24 = 0; var24 < var17; ++var24) {
                    int var25 = (var24 * 256 + 128) / var17;
                    int var26 = -var25 + 256;
                    byte var27 = (byte) (arg6 * var26 + arg11 * var25 >> 8);
                    short var28 = (short) (((127 & arg2) * var26 + (arg4 & 127) * var25 & 32512) + (16515072 & (arg2 & 64512) * var26 + (64512 & arg4) * var25) + (229376 & (arg2 & 896) * var26 + (896 & arg4) * var25) >> 8);
                    for (int var29 = 0; var19 > var29; ++var29) {
                        if (var24 != 0) {
                            var20.method1481(var21[var24 + -1][var29], var21[var24 - 1][(var29 + 1) % var19], var21[var24][(var29 + 1) % var19], (byte) 1, var28, var27);
                            var20.method1481(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var19], var21[var24][var29], (byte) 1, var28, var27);
                        } else {
                            var20.method1481(var22, var21[0][(var29 + 1) % var19], var21[0][var29], (byte) 1, var28, var27);
                        }
                    }
                }
                var16 = var20.method1498(64, 768, -50, -10, -50);
                class223.field4080.method1385(var14, var16, (byte) -114);
            }
            int var36 = arg5 * 64 + -1;
            int var37 = -var36;
            int var38 = -var36;
            int var39 = var36;
            int var40 = var36;
            if (arg13) {
                if (arg0 > 1152 && arg0 < 1920) {
                    var39 = var36 + 128;
                }
                if (~arg0 < -129 && arg0 < 896) {
                    var37 -= 128;
                }
                if (~arg0 < -1665 || arg0 < 384) {
                    var38 -= 128;
                }
                if (arg0 > 640 && arg0 < 1408) {
                    var40 = var36 + 128;
                }
            }
            int var41 = arg12.method283();
            if (var41 < var37) {
                var41 = var37;
            }
            int var42 = arg12.method279();
            class287 var43 = null;
            int var44 = arg12.method272();
            if (var38 > var44) {
                var44 = var38;
            }
            int var45 = arg12.method284();
            if (arg7 != null) {
                int var46 = arg7.field1180[arg10];
                var43 = class83.method620((byte) -84, var46 >> 16);
                arg10 = var46 & 65535;
            }
            if (var39 < var42) {
                var42 = var39;
            }
            if (~var40 > ~var45) {
                var45 = var40;
            }
            class166 var47;
            if (var43 == null) {
                var47 = var16.method286(true, true, true);
                var47.method294((-var41 + var42) / 2, 128, (-var44 + var45) / 2);
                var47.method274((var41 + var42) / 2, 0, (var44 + var45) / 2);
            } else {
                var47 = var16.method286(!var43.method1959((byte) -48, arg10), !var43.method1956(arg10, -103), true);
                var47.method294((-var41 + var42) / 2, 128, (var45 - var44) / 2);
                var47.method274((var41 + var42) / 2, 0, (var44 - -var45) / 2);
                var47.method1198(var43, arg10);
            }
            if (arg0 != 0) {
                var47.method289(arg0);
            }
            class37 var48 = (class37) var47;
            if (~arg9 != ~class22.method139(arg8 + var41, arg1 + var44, arg3 ^ -23982, class93.field1645) || class22.method139(arg8 - -var42, arg1 + var45, 23979, class93.field1645) != arg9) {
                for (int var49 = 0; ~var49 > ~var48.field717; ++var49) {
                    var48.field719[var49] += -arg9 + class22.method139(var48.field714[var49] + arg8, var48.field709[var49] + arg1, class280.method1901(arg3, -23982), class93.field1645);
                }
                var48.field732 = false;
            }
            return var47;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5877) {
            ++field2331;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 == -4) {
                            this.field2337 = arg0.method1050(arg1 + 1272000691);
                        }
                    } else {
                        this.field2329 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field2339 = arg0.method1050(1272006568);
                }
            } else {
                this.field2335 = arg0.method1050(1272006568);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field2334;
        int[] var3 = super.field3001.method1538(arg0 ^ -92, arg1);
        if (super.field3001.field3835) {
            for (int var4 = 0; ~class88.field1595 < ~var4; ++var4) {
                int var5 = (class282.field4964[arg1] << 12) / this.field2335 + this.field2337;
                int var6 = var5;
                int var7 = (class68.field1211[var4] << 12) / this.field2335 - -this.field2329;
                int var8 = var7;
                int var9 = var7 * var7 >> 12;
                int var10 = var5;
                int var11 = var5 * var5 >> 12;
                int var12 = var7;
                int var13 = 0;
                while (~(var9 + var11) > -16385 && var13 < this.field2339) {
                    ++var13;
                    var10 = (var10 * var12 >> 12) * 2 - -var6;
                    var12 = -var11 + var9 + var8;
                    var11 = var10 * var10 >> 12;
                    var9 = var12 * var12 >> 12;
                }
                var3[var4] = ~(this.field2339 - 1) < ~var13 ? (var13 << 12) / this.field2339 : 0;
            }
        }
        if (arg0 != -30) {
            this.field2335 = 73;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILpk;I)Z")
    public static final boolean method943(int arg0, class99 arg1, int arg2) {
        ++field2338;
        if (arg2 != 2) {
            field2336 = false;
        }
        byte[] var3 = arg1.method701(-1, arg0);
        if (var3 == null) {
            return false;
        } else {
            class82.method616(false, var3);
            return true;
        }
    }
}
