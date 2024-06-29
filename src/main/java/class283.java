import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class283 extends class182 {

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field4676 = 409;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    private int field4680 = 1024;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    private int field4683 = 1024;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    private int field4686 = 1024;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
    private int field4691 = 0;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    private int field4693 = 819;

    @OriginalMember(owner = "client!sc", name = "ob", descriptor = "I")
    private int field4699 = 2048;

    @OriginalMember(owner = "client!sc", name = "nb", descriptor = "I")
    private int field4698 = 0;

    @OriginalMember(owner = "client!sc", name = "kb", descriptor = "I")
    private int field4695 = 1024;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4674 = "Discard";

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "[Z")
    public static boolean[] field4675 = new boolean[200];

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field4682 = 127;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field4689 = 1;

    @OriginalMember(owner = "client!sc", name = "lb", descriptor = "I")
    public static int field4696 = 0;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field4678;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!sc", name = "mb", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            this.method1971((byte) -74, (Random) null, -15, 5, (int[][]) null, 31, 39);
        }
        ++field4690;
        int[] var3 = super.field2911.method77(arg1, -83);
        if (super.field2911.field287) {
            int[][] var4 = super.field2911.method73(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class4.field116 * this.field4683 >> 12;
            int var14 = 0;
            int var15 = class16.field318 * this.field4693 >> 12;
            int var16 = class4.field116 * this.field4699 >> 12;
            int var17 = class16.field318 * this.field4676 >> 12;
            if (~var15 >= -2) {
                return var4[arg1];
            } else {
                this.field4678 = class4.field116 / 8 * this.field4680 >> 12;
                int var18 = class4.field116 / var13 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4698);
                while (true) {
                    while (true) {
                        int var22 = var13 + class32.method205(var16 - var13, (byte) 90, var21);
                        int var23 = var7 + var22;
                        int var24 = var17 + class32.method205(var15 - var17, (byte) 90, var21);
                        if (var23 > class4.field116) {
                            var22 = -var7 + class4.field116;
                            var23 = class4.field116;
                        }
                        int var26;
                        if (var11) {
                            var26 = 0;
                        } else {
                            int[] var25 = var20[var10];
                            var26 = var25[2];
                            int var27 = 0;
                            int var28 = var23 - -var8;
                            int var29 = var10;
                            if (var28 < 0) {
                                var28 += class4.field116;
                            }
                            if (~var28 < ~class4.field116) {
                                var28 -= class4.field116;
                            }
                            while (true) {
                                int[] var30 = var20[var29];
                                if (~var28 <= ~var30[0] && ~var30[1] <= ~var28) {
                                    if (var10 != var29) {
                                        int var31 = var7 - -var8;
                                        if (var31 < 0) {
                                            var31 += class4.field116;
                                        }
                                        if (~class4.field116 > ~var31) {
                                            var31 -= class4.field116;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var10 + var32) % var14];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                            int[] var34 = var20[(var10 + var33) % var14];
                                            int var35 = var34[2];
                                            if (var26 != var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var28) {
                                                    if (var37 != 0) {
                                                        var38 = Math.max(var31, var37);
                                                        var39 = class4.field116;
                                                    } else {
                                                        var39 = Math.min(var28, var36);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var28, var36);
                                                }
                                                this.method1971((byte) -98, var21, var6 + var38, var35, var4, var39 - var38, -var35 + var26);
                                            }
                                        }
                                    }
                                    var10 = var29;
                                    break;
                                }
                                int var10000 = ~var14;
                                ++var29;
                                if (var10000 >= ~var29) {
                                    var29 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (~(var24 + var26) < ~class16.field318) {
                            var24 = class16.field318 - var26;
                        } else {
                            var9 = false;
                        }
                        if (~class4.field116 != ~var23) {
                            int[] var41 = var19[var12++];
                            var41[2] = var26 - -var24;
                            var41[0] = var7;
                            var41[1] = var23;
                            this.method1971((byte) -95, var21, var5 + var7, var26, var4, var22, var24);
                            var7 = var23;
                        } else {
                            this.method1971((byte) -93, var21, var5 + var7, var26, var4, var22, var24);
                            if (var9) {
                                return var3;
                            }
                            var6 = var5;
                            var9 = true;
                            int[] var42 = var19[var12++];
                            var42[1] = var23;
                            var42[0] = var7;
                            var10 = 0;
                            int[][] var43 = var20;
                            var11 = false;
                            var7 = 0;
                            var20 = var19;
                            var19 = var43;
                            var14 = var12;
                            var42[2] = var24 + var26;
                            var12 = 0;
                            var5 = class32.method205(class4.field116, (byte) 90, var21);
                            var8 = var5 - var6;
                            int var44 = var8;
                            if (var8 < 0) {
                                var44 = class4.field116 + var8;
                            }
                            if (~class4.field116 > ~var44) {
                                var44 -= class4.field116;
                            }
                            while (true) {
                                int[] var45 = var20[var10];
                                if (var45[0] <= var44 && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var10;
                                if (var10 >= var14) {
                                    var10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field4695 = arg1.method1821((byte) 51);
                                        }
                                    } else {
                                        this.field4686 = arg1.method1821((byte) 51);
                                    }
                                } else {
                                    this.field4691 = arg1.method1802((byte) 62);
                                }
                            } else {
                                this.field4680 = arg1.method1821((byte) 51);
                            }
                        } else {
                            this.field4693 = arg1.method1821((byte) 51);
                        }
                    } else {
                        this.field4676 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field4699 = arg1.method1821((byte) 51);
                }
            } else {
                this.field4683 = arg1.method1821((byte) 51);
            }
        } else {
            this.field4698 = arg1.method1802((byte) 109);
        }
        ++field4681;
        if (arg0) {
            field4674 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
    public static final boolean method1968(boolean arg0) {
        ++field4684;
        try {
            if (!arg0) {
                method1970((byte) 62, 98);
            }
            if (class101.field1608 == 2) {
                if (class124.field2097 == null) {
                    class124.field2097 = class156.method1179(class23.field418, class16.field320, class254.field4315);
                    if (class124.field2097 == null) {
                        return false;
                    }
                }
                if (class210.field3541 == null) {
                    class210.field3541 = new class181(class237.field3990, class58.field1006);
                }
                if (class313.field5050.method763(22050, class210.field3541, class124.field2097, (byte) 52, class181.field2887)) {
                    class313.field5050.method754(true);
                    class313.field5050.method781(class220.field3704, true);
                    class313.field5050.method759(115, class134.field2201, class124.field2097);
                    class23.field418 = null;
                    class124.field2097 = null;
                    class101.field1608 = 0;
                    class210.field3541 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class313.field5050.method771(-128);
            class23.field418 = null;
            class124.field2097 = null;
            class210.field3541 = null;
            class101.field1608 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILhg;)Z")
    public static final boolean method1969(int arg0, class207 arg1) {
        ++field4679;
        if (arg1.field3495 == arg0) {
            class298.field4864 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(BI)Z")
    public static final boolean method1970(byte arg0, int arg1) {
        ++field4677;
        if (arg0 <= 77) {
            method1970((byte) -29, 52);
        }
        return ~(arg1 & -arg1) == ~arg1;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++field4687;
        if (arg0 != -1) {
            this.method153(false, 71);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class283() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLjava/util/Random;II[[III)V")
    private final void method1971(byte arg0, Random arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        ++field4694;
        int var8 = ~this.field4695 < -1 ? -class32.method205(this.field4695, (byte) 90, arg1) + 4096 : 4096;
        int var9 = this.field4686 * this.field4678 >> 12;
        if (arg0 < -86) {
            int var10 = this.field4678 - (~var9 >= -1 ? 0 : class32.method205(var9, (byte) 90, arg1));
            if (~class4.field116 >= ~arg2) {
                arg2 -= class4.field116;
            }
            if (var10 > 0) {
                if (~arg6 < -1 && arg5 > 0) {
                    int var11 = arg5 / 2;
                    int var12 = arg6 / 2;
                    int var13 = var11 >= var10 ? var10 : var11;
                    int var14 = ~var10 < ~var12 ? var12 : var10;
                    int var15 = arg2 + var13;
                    int var16 = arg5 - var13 * 2;
                    for (int var17 = 0; ~arg6 < ~var17; ++var17) {
                        int[] var18 = arg4[arg3 + var17];
                        if (~var14 < ~var17) {
                            int var19 = var8 * var17 / var14;
                            if (~this.field4691 == -1) {
                                for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class15.method84(arg2 + var20, class103.field1644)] = var18[class15.method84(class103.field1644, -var20 + arg2 + arg5 - 1)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; var22 < var13; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class15.method84(arg2 + var22, class103.field1644)] = var18[class15.method84(class103.field1644, arg2 + arg5 + -1 - var22)] = ~var19 < ~var24 ? var24 : var19;
                                }
                            }
                            if (class4.field116 >= var15 + var16) {
                                class75.method535(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class4.field116;
                                class75.method535(var18, var15, var23, var19);
                                class75.method535(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg6 - 1 + -var17;
                            if (~var14 < ~var25) {
                                int var26 = var8 * var25 / var14;
                                if (this.field4691 == 0) {
                                    for (int var27 = 0; var13 > var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class15.method84(class103.field1644, arg2 + var27)] = var18[class15.method84(arg2 + arg5 + -1 + -var27, class103.field1644)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; var29 < var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class15.method84(class103.field1644, arg2 - -var29)] = var18[class15.method84(arg2 + arg5 + -1 + -var29, class103.field1644)] = ~var26 < ~var31 ? var31 : var26;
                                    }
                                }
                                if (~(var15 - -var16) < ~class4.field116) {
                                    int var30 = -var15 + class4.field116;
                                    class75.method535(var18, var15, var30, var26);
                                    class75.method535(var18, 0, var16 - var30, var26);
                                } else {
                                    class75.method535(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; var32 < var13; ++var32) {
                                    var18[class15.method84(arg2 + var32, class103.field1644)] = var18[class15.method84(arg2 + arg5 + -var32 + -1, class103.field1644)] = var8 * var32 / var13;
                                }
                                if (~(var15 + var16) < ~class4.field116) {
                                    int var33 = -var15 + class4.field116;
                                    class75.method535(var18, var15, var33, var8);
                                    class75.method535(var18, 0, -var33 + var16, var8);
                                } else {
                                    class75.method535(var18, var15, var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (class4.field116 < arg2 + arg5) {
                int var34 = class4.field116 - arg2;
                for (int var35 = 0; ~var35 > ~arg6; ++var35) {
                    int[] var36 = arg4[arg3 + var35];
                    class75.method535(var36, arg2, var34, var8);
                    class75.method535(var36, 0, -var34 + arg5, var8);
                }
            } else {
                for (int var37 = 0; arg6 > var37; ++var37) {
                    class75.method535(arg4[arg3 + var37], arg2, arg5, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "(I)V")
    public static void method1972(int arg0) {
        int var1 = 34 % ((-19 - arg0) / 60);
        field4674 = null;
        field4675 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(ZI)V")
    public static final void method1973(boolean arg0, int arg1) {
        if (!class245.field4117) {
            arg1 = -1;
        }
        ++field4685;
        if (class245.field4108 != arg1) {
            if (arg0) {
                field4689 = -124;
            }
            if (arg1 != -1) {
                class217 var2 = class225.method1593((byte) -58, arg1);
                class92 var3 = var2.method1547((byte) -41);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class142.field2344.method582(class5.field125, -22925, var3.field4565, var3.field4567, var3.method643(), new Point(var2.field3662, var2.field3675));
                    class245.field4108 = arg1;
                }
            }
            if (arg1 == -1 && class245.field4108 != -1) {
                class142.field2344.method582(class5.field125, -22925, -1, -1, (int[]) null, new Point());
                class245.field4108 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)V")
    public static final void method1974(int arg0, int arg1) {
        if (arg1 >= -64) {
            field4674 = null;
        }
        class260.field4375.method98(1, arg0);
        class65.field1091.method98(1, arg0);
        ++field4688;
    }
}
