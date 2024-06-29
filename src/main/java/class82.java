import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class82 extends class8 {

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    private int field1281 = 1024;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    private int field1288 = 0;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    private int field1283 = 1024;

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    private int field1285 = 1024;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    private int field1291 = 1024;

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
    private int field1296 = 2048;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    private int field1294 = 409;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    private int field1297 = 0;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "I")
    private int field1298 = 819;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "[Z")
    public static boolean[] field1286 = new boolean[100];

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "[I")
    public static int[] field1289 = new int[2500];

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[[IIZILjava/util/Random;I)V")
    private final void method591(int arg0, int[][] arg1, int arg2, boolean arg3, int arg4, Random arg5, int arg6) {
        ++field1282;
        int var8 = ~this.field1291 >= -1 ? 4096 : -class142.method982(-396321952, this.field1291, arg5) + 4096;
        int var9 = this.field1284 * this.field1283 >> 12;
        if (arg3) {
            this.field1283 = -33;
        }
        int var10 = this.field1284 - (var9 > 0 ? class142.method982(-396321952, var9, arg5) : 0);
        if (~arg6 <= ~class231.field3798) {
            arg6 -= class231.field3798;
        }
        if (var10 > 0) {
            if (arg2 > 0 && arg4 > 0) {
                int var11 = arg2 / 2;
                int var12 = ~var11 > ~var10 ? var11 : var10;
                int var13 = arg4 / 2;
                int var14 = ~var10 < ~var13 ? var13 : var10;
                int var15 = arg6 + var14;
                int var16 = -(var14 * 2) + arg4;
                for (int var17 = 0; var17 < arg2; ++var17) {
                    int[] var18 = arg1[arg0 + var17];
                    if (var17 < var12) {
                        int var19 = var8 * var17 / var12;
                        if (~this.field1297 == -1) {
                            for (int var20 = 0; ~var20 > ~var14; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class202.method1393(arg6 + var20, class287.field4537)] = var18[class202.method1393(arg6 - (-arg4 - -var20 + 1), class287.field4537)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var22 < var14; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class202.method1393(class287.field4537, arg6 - -var22)] = var18[class202.method1393(class287.field4537, -var22 + arg6 + arg4 + -1)] = var19 <= var24 ? var19 : var24;
                            }
                        }
                        if (~(var15 + var16) < ~class231.field3798) {
                            int var23 = class231.field3798 - var15;
                            class140.method970(var18, var15, var23, var19);
                            class140.method970(var18, 0, -var23 + var16, var19);
                        } else {
                            class140.method970(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg2 - (var17 - -1);
                        if (~var12 < ~var25) {
                            int var26 = var8 * var25 / var12;
                            if (this.field1297 == 0) {
                                for (int var27 = 0; ~var14 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class202.method1393(arg6 + var27, class287.field4537)] = var18[class202.method1393(-var27 + arg6 + arg4 + -1, class287.field4537)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var14 > var29; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class202.method1393(arg6 - -var29, class287.field4537)] = var18[class202.method1393(arg4 + arg6 + -var29 + -1, class287.field4537)] = var26 > var31 ? var31 : var26;
                                }
                            }
                            if (class231.field3798 >= var15 + var16) {
                                class140.method970(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class231.field3798;
                                class140.method970(var18, var15, var30, var26);
                                class140.method970(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var14; ++var32) {
                                var18[class202.method1393(class287.field4537, arg6 + var32)] = var18[class202.method1393(class287.field4537, arg4 - var32 + arg6 - 1)] = var8 * var32 / var14;
                            }
                            if (class231.field3798 >= var15 + var16) {
                                class140.method970(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class231.field3798;
                                class140.method970(var18, var15, var33, var8);
                                class140.method970(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class231.field3798 > ~(arg4 + arg6)) {
            int var34 = -arg6 + class231.field3798;
            for (int var35 = 0; var35 < arg2; ++var35) {
                int[] var36 = arg1[arg0 + var35];
                class140.method970(var36, arg6, var34, var8);
                class140.method970(var36, 0, -var34 + arg4, var8);
            }
        } else {
            for (int var37 = 0; arg2 > var37; ++var37) {
                class140.method970(arg1[arg0 - -var37], arg6, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        int[] var3 = super.field110.method1585(0, arg1);
        ++field1287;
        if (super.field110.field3734) {
            int[][] var4 = super.field110.method1581((byte) 116);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class231.field3798 * this.field1285 >> 12;
            int var15 = class231.field3798 * this.field1296 >> 12;
            int var16 = class259.field4118 * this.field1294 >> 12;
            int var17 = class259.field4118 * this.field1298 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field1284 = class231.field3798 / 8 * this.field1281 >> 12;
            int var18 = class231.field3798 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1288);
            label124: while (true) {
                while (true) {
                    int var22 = var14 - -class142.method982(-396321952, -var14 + var15, var21);
                    int var23 = var7 + var22;
                    int var24 = class142.method982(-396321952, -var16 + var17, var21) + var16;
                    if (class231.field3798 < var23) {
                        var23 = class231.field3798;
                        var22 = class231.field3798 - var7;
                    }
                    int var30;
                    if (var10) {
                        var30 = 0;
                    } else {
                        int var25 = var8;
                        int var26 = 0;
                        int var27 = var5 + var23;
                        if (~var27 > -1) {
                            var27 += class231.field3798;
                        }
                        if (class231.field3798 < var27) {
                            var27 -= class231.field3798;
                        }
                        while (true) {
                            int[] var28 = var20[var25];
                            if (var27 >= var28[0] && var28[1] >= var27) {
                                int[] var29 = var20[var8];
                                var30 = var29[2];
                                if (~var8 != ~var25) {
                                    int var31 = var5 + var7;
                                    if (var31 < 0) {
                                        var31 += class231.field3798;
                                    }
                                    if (var31 > class231.field3798) {
                                        var31 -= class231.field3798;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var26; ++var32) {
                                        int[] var40 = var20[(var8 + var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; var33 <= var26; ++var33) {
                                        int[] var34 = var20[(var8 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var30 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var27 >= ~var31) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var27, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class231.field3798;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var27, var37);
                                            }
                                            this.method591(var35, var4, -var35 + var30, false, -var38 + var39, var21, var38 - -var9);
                                        }
                                    }
                                }
                                var8 = var25;
                                break;
                            }
                            ++var26;
                            ++var25;
                            if (var25 >= var12) {
                                var25 = 0;
                            }
                        }
                    }
                    if (var30 - -var24 > class259.field4118) {
                        var24 = class259.field4118 - var30;
                    } else {
                        var11 = false;
                    }
                    if (~class231.field3798 != ~var23) {
                        int[] var41 = var19[var13++];
                        var41[1] = var23;
                        var41[0] = var7;
                        var41[2] = var24 + var30;
                        this.method591(var30, var4, var24, false, var22, var21, var7 - -var6);
                        var7 = var23;
                    } else {
                        this.method591(var30, var4, var24, false, var22, var21, var7 - -var6);
                        if (var11) {
                            break label124;
                        }
                        var8 = 0;
                        var10 = false;
                        var9 = var6;
                        var11 = true;
                        int[] var42 = var19[var13++];
                        var42[0] = var7;
                        var7 = 0;
                        var42[2] = var24 + var30;
                        var42[1] = var23;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var13 = 0;
                        var6 = class142.method982(arg0 ^ -396321949, class231.field3798, var21);
                        var5 = -var9 + var6;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class231.field3798 + var5;
                        }
                        if (class231.field3798 < var44) {
                            var44 -= class231.field3798;
                        }
                        while (true) {
                            int[] var45 = var20[var8];
                            if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var8;
                            if (var12 <= var8) {
                                var8 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 3) {
            this.field1283 = 66;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)V")
    public final void method66(boolean arg0) {
        if (!arg0) {
            ++field1290;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLog;I)V")
    public final void method64(byte arg0, class221 arg1, int arg2) {
        if (arg0 <= 62) {
            this.method64((byte) -48, (class221) null, -117);
        }
        ++field1295;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field1291 = arg1.method1521((byte) 113);
                                        }
                                    } else {
                                        this.field1283 = arg1.method1521((byte) 113);
                                    }
                                } else {
                                    this.field1297 = arg1.method1517((byte) -96);
                                }
                            } else {
                                this.field1281 = arg1.method1521((byte) 113);
                            }
                        } else {
                            this.field1298 = arg1.method1521((byte) 113);
                        }
                    } else {
                        this.field1294 = arg1.method1521((byte) 113);
                    }
                } else {
                    this.field1296 = arg1.method1521((byte) 113);
                }
            } else {
                this.field1285 = arg1.method1521((byte) 113);
            }
        } else {
            this.field1288 = arg1.method1517((byte) -96);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BB)Z")
    public static final boolean method592(byte[] arg0, byte arg1) {
        class221 var2 = new class221(arg0);
        ++field1293;
        int var3 = var2.method1517((byte) -96);
        if (var3 != 1) {
            return false;
        } else {
            boolean var4 = ~var2.method1517((byte) -96) == -2;
            if (arg1 <= 72) {
                method592((byte[]) null, (byte) -98);
            }
            if (var4) {
                class132.method935(false, var2);
            }
            class156.method1096(-29, var2);
            return true;
        }
    }

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)V")
    public static void method593(byte arg0) {
        field1289 = null;
        field1286 = null;
        if (arg0 != -6) {
            method594(-67, 98, 110, -127, -114, 1);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIII)V")
    public static final void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 <= class51.field896 && arg1 >= class161.field2561) {
            boolean var6;
            if (arg5 >= class255.field4055) {
                if (~arg5 < ~class9.field128) {
                    arg5 = class9.field128;
                    var6 = false;
                } else {
                    var6 = true;
                }
            } else {
                arg5 = class255.field4055;
                var6 = false;
            }
            boolean var7;
            if (~class255.field4055 >= ~arg3) {
                if (arg3 <= class9.field128) {
                    var7 = true;
                } else {
                    arg3 = class9.field128;
                    var7 = false;
                }
            } else {
                var7 = false;
                arg3 = class255.field4055;
            }
            if (class161.field2561 > arg0) {
                arg0 = class161.field2561;
            } else {
                class56.method420(class29.field452[arg0++], arg4, -7, arg5, arg3);
            }
            if (arg1 > class51.field896) {
                arg1 = class51.field896;
            } else {
                class56.method420(class29.field452[arg1--], arg4, arg2 ^ 4495, arg5, arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg1; ++var8) {
                    int[] var9 = class29.field452[var8];
                    var9[arg5] = var9[arg3] = arg4;
                }
            } else if (!var6) {
                if (var7) {
                    for (int var10 = arg0; ~var10 >= ~arg1; ++var10) {
                        class29.field452[var10][arg3] = arg4;
                    }
                }
            } else {
                for (int var11 = arg0; var11 <= arg1; ++var11) {
                    class29.field452[var11][arg5] = arg4;
                }
            }
        }
        ++field1292;
        if (arg2 != -4490) {
            field1286 = null;
        }
    }
}
