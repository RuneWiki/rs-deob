import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class343 extends class264 {

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    private int field4724 = 0;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    private int field4727 = 819;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    private int field4733 = 2048;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field4734 = 1024;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    private int field4736 = 0;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field4729 = 409;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    private int field4728 = 1024;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    private int field4738 = 1024;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    private int field4737 = 1024;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Lrc;")
    public static class108 field4739 = new class108(48, 2);

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "Leo;")
    public static class443 field4741 = new class443(5, 7);

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    private int field4726;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "[S")
    public static short[] field4740;

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V", line = 392)
    public class343() {
        super(0, true);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIIII)V", line = 14)
    public static final void method2135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field4725;
        if (class369.method2261(0, arg7)) {
            client.method545(class263.field3787[arg7], -1, arg8, arg6, arg9, arg0, arg4, arg3, arg5, arg2);
            if (arg1 != 19112) {
                method2135(-25, -70, 37, 13, 50, -7, 115, 2, -13, -100);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V", line = 29)
    public final void method95(int arg0) {
        if (arg0 == -8) {
            ++field4730;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[I", line = 43)
    public final int[] method90(int arg0, int arg1) {
        ++field4723;
        int[] var3 = super.field3808.method958((byte) 40, arg0);
        if (super.field3808.field1732) {
            int[][] var4 = super.field3808.method957(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class478.field6792 * this.field4734 >> 12;
            int var15 = class478.field6792 * this.field4733 >> 12;
            int var16 = class129.field1772 * this.field4729 >> 12;
            int var17 = class129.field1772 * this.field4727 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field4726 = class478.field6792 / 8 * this.field4738 >> 12;
            int var18 = class478.field6792 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4724);
            label129: while (true) {
                while (true) {
                    int var22 = class424.method2524(var21, -var14 + var15, (byte) -123) + var14;
                    int var23 = class424.method2524(var21, var17 - var16, (byte) -107) + var16;
                    int var24 = var8 + var22;
                    if (~class478.field6792 > ~var24) {
                        var22 = class478.field6792 - var8;
                        var24 = class478.field6792;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (var29 < 0) {
                            var29 += class478.field6792;
                        }
                        if (class478.field6792 < var29) {
                            var29 -= class478.field6792;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class478.field6792;
                                    }
                                    if (class478.field6792 < var31) {
                                        var31 -= class478.field6792;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var25 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 < var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 != 0) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class478.field6792;
                                            } else {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method2137(var7 + var38, var25 - var35, var35, -var38 + var39, true, var21, var4);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class129.field1772 < var23 + var25) {
                        var23 = -var25 + class129.field1772;
                    } else {
                        var10 = false;
                    }
                    if (class478.field6792 == var24) {
                        this.method2137(var6 + var8, var23, var25, var22, true, var21, var4);
                        if (var10) {
                            break label129;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var8;
                        int[][] var42 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var42;
                        var13 = 0;
                        var7 = var6;
                        var6 = class424.method2524(var21, class478.field6792, (byte) -112);
                        var5 = var6 - var7;
                        var8 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class478.field6792 + var5;
                        }
                        var9 = 0;
                        if (class478.field6792 < var43) {
                            var43 -= class478.field6792;
                        }
                        var11 = false;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var25 - -var23;
                        var45[0] = var8;
                        var45[1] = var24;
                        this.method2137(var6 + var8, var23, var25, var22, true, var21, var4);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 != 21034) {
            this.method90(-14, 25);
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLkk;I)V", line = 298)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field4731;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field4728 = arg1.method1134(-16848);
                                        }
                                    } else {
                                        this.field4737 = arg1.method1134(-16848);
                                    }
                                } else {
                                    this.field4736 = arg1.method1172((byte) -118);
                                }
                            } else {
                                this.field4738 = arg1.method1134(-16848);
                            }
                        } else {
                            this.field4727 = arg1.method1134(-16848);
                        }
                    } else {
                        this.field4729 = arg1.method1134(-16848);
                    }
                } else {
                    this.field4733 = arg1.method1134(-16848);
                }
            } else {
                this.field4734 = arg1.method1134(-16848);
            }
        } else {
            this.field4724 = arg1.method1172((byte) -127);
        }
        if (arg0 <= 31) {
            this.field4737 = 95;
        }
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(I)V", line = 412)
    public static void method2136(int arg0) {
        field4741 = null;
        field4740 = null;
        field4739 = null;
        if (arg0 != 3) {
            method2135(-52, -13, -70, 13, 89, -72, 28, 54, -58, 42);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIZLjava/util/Random;[[I)V", line = 440)
    private final void method2137(int arg0, int arg1, int arg2, int arg3, boolean arg4, Random arg5, int[][] arg6) {
        ++field4732;
        int var8 = this.field4728 > 0 ? -class424.method2524(arg5, this.field4728, (byte) -89) + 4096 : 4096;
        if (arg4) {
            int var9 = this.field4737 * this.field4726 >> 12;
            int var10 = this.field4726 + -(var9 <= 0 ? 0 : class424.method2524(arg5, var9, (byte) -111));
            if (~class478.field6792 >= ~arg0) {
                arg0 -= class478.field6792;
            }
            if (var10 > 0) {
                if (arg1 > 0 && ~arg3 < -1) {
                    int var11 = arg3 / 2;
                    int var12 = arg1 / 2;
                    int var13 = ~var10 < ~var11 ? var11 : var10;
                    int var14 = var10 > var12 ? var12 : var10;
                    int var15 = arg0 - -var13;
                    int var16 = -(var13 * 2) + arg3;
                    for (int var17 = 0; ~var17 > ~arg1; ++var17) {
                        int[] var18 = arg6[arg2 + var17];
                        if (var14 > var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field4736 != 0) {
                                for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class88.method739(class205.field3007, arg0 + var20)] = var18[class88.method739(class205.field3007, -var20 + arg0 - (-arg3 + 1))] = var21 < var19 ? var21 : var19;
                                }
                            } else {
                                for (int var22 = 0; var13 > var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class88.method739(class205.field3007, arg0 - -var22)] = var18[class88.method739(class205.field3007, -var22 + -1 + arg3 + arg0)] = var19 * var24 >> 12;
                                }
                            }
                            if (~(var15 + var16) >= ~class478.field6792) {
                                class214.method1452(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class478.field6792;
                                class214.method1452(var18, var15, var23, var19);
                                class214.method1452(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg1 + -1 + -var17;
                            if (~var25 > ~var14) {
                                int var26 = var8 * var25 / var14;
                                if (this.field4736 != 0) {
                                    for (int var27 = 0; var13 > var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class88.method739(arg0 + var27, class205.field3007)] = var18[class88.method739(arg3 - var27 + arg0 + -1, class205.field3007)] = var26 > var28 ? var28 : var26;
                                    }
                                } else {
                                    for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class88.method739(class205.field3007, arg0 + var29)] = var18[class88.method739(class205.field3007, arg0 + arg3 - var29 + -1)] = var26 * var31 >> 12;
                                    }
                                }
                                if (var15 + var16 <= class478.field6792) {
                                    class214.method1452(var18, var15, var16, var26);
                                } else {
                                    int var30 = -var15 + class478.field6792;
                                    class214.method1452(var18, var15, var30, var26);
                                    class214.method1452(var18, 0, var16 - var30, var26);
                                }
                            } else {
                                for (int var32 = 0; var13 > var32; ++var32) {
                                    var18[class88.method739(class205.field3007, arg0 + var32)] = var18[class88.method739(class205.field3007, arg0 + arg3 + -1 - var32)] = var8 * var32 / var13;
                                }
                                if (~(var15 + var16) >= ~class478.field6792) {
                                    class214.method1452(var18, var15, var16, var8);
                                } else {
                                    int var33 = class478.field6792 - var15;
                                    class214.method1452(var18, var15, var33, var8);
                                    class214.method1452(var18, 0, var16 - var33, var8);
                                }
                            }
                        }
                    }
                }
            } else if (~class478.field6792 <= ~(arg0 + arg3)) {
                for (int var34 = 0; var34 < arg1; ++var34) {
                    class214.method1452(arg6[arg2 + var34], arg0, arg3, var8);
                }
            } else {
                int var35 = -arg0 + class478.field6792;
                for (int var36 = 0; var36 < arg1; ++var36) {
                    int[] var37 = arg6[arg2 + var36];
                    class214.method1452(var37, arg0, var35, var8);
                    class214.method1452(var37, 0, arg3 - var35, var8);
                }
            }
        }
    }
}
