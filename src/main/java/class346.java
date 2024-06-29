import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class346 extends class13 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    private int field4712 = 1024;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    private int field4713 = 409;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    private int field4719 = 819;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    private int field4718 = 1024;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    private int field4708 = 2048;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    private int field4723 = 0;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    private int field4722 = 0;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    private int field4716 = 1024;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    private int field4725 = 1024;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Lkn;")
    public static class442 field4721 = new class442("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "[B")
    public static byte[] field4724 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4726;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    private int field4707;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field4728;

    static {
        new class442("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field4726 = new Rectangle[100];
        field4727 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V", line = 5)
    public static void method2192(int arg0) {
        if (arg0 == 1) {
            field4724 = null;
            field4721 = null;
            field4726 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V", line = 21)
    public static final void method2193(int arg0) {
        ++field4717;
        if (arg0 != -11904) {
            field4721 = null;
        }
        class285.field4015.method905((byte) 28);
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(B)V", line = 32)
    public static final void method2194(byte arg0) {
        if (arg0 <= 79) {
            method2196(-26, (Object) null, (class294) null);
        }
        class107.field1482.method905((byte) 105);
        ++field4720;
        class46.field650.method905((byte) 94);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III[[IILjava/util/Random;I)V", line = 50)
    private final void method2195(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        ++field4715;
        int var8 = ~this.field4716 >= -1 ? 4096 : -class26.method299(this.field4716, (byte) 105, arg5) + 4096;
        int var9 = this.field4718 * this.field4707 >> 12;
        int var10 = this.field4707 - (~var9 < -1 ? class26.method299(var9, (byte) -66, arg5) : 0);
        if (arg2 != 1024) {
            method2194((byte) 64);
        }
        if (arg1 >= class269.field3751) {
            arg1 -= class269.field3751;
        }
        if (~var10 < -1) {
            if (arg0 > 0 && ~arg4 < -1) {
                int var11 = arg4 / 2;
                int var12 = arg0 / 2;
                int var13 = ~var11 > ~var10 ? var11 : var10;
                int var14 = ~var12 > ~var10 ? var12 : var10;
                int var15 = arg1 + var13;
                int var16 = arg4 - var13 * 2;
                for (int var17 = 0; ~var17 > ~arg0; ++var17) {
                    int[] var18 = arg3[arg6 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field4723 == 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class387.method2454(arg1 - -var20, class343.field4677)] = var18[class387.method2454(class343.field4677, -var20 + -1 + arg1 + arg4)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class387.method2454(arg1 + var22, class343.field4677)] = var18[class387.method2454(-var22 + arg4 + arg1 + -1, class343.field4677)] = ~var24 > ~var19 ? var24 : var19;
                            }
                        }
                        if (~class269.field3751 > ~(var15 - -var16)) {
                            int var23 = -var15 + class269.field3751;
                            class36.method346(var18, var15, var23, var19);
                            class36.method346(var18, 0, -var23 + var16, var19);
                        } else {
                            class36.method346(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg0 - 1;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field4723 != -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class387.method2454(arg1 + var27, class343.field4677)] = var18[class387.method2454(class343.field4677, -var27 + -1 + arg1 - -arg4)] = var26 > var28 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class387.method2454(arg1 + var29, class343.field4677)] = var18[class387.method2454(class343.field4677, arg4 - var29 + arg1 + -1)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 + var16 <= class269.field3751) {
                                class36.method346(var18, var15, var16, var26);
                            } else {
                                int var30 = class269.field3751 - var15;
                                class36.method346(var18, var15, var30, var26);
                                class36.method346(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class387.method2454(arg1 - -var32, class343.field4677)] = var18[class387.method2454(-var32 + arg1 - (-arg4 - -1), class343.field4677)] = var8 * var32 / var13;
                            }
                            if (~class269.field3751 <= ~(var15 + var16)) {
                                class36.method346(var18, var15, var16, var8);
                            } else {
                                int var33 = class269.field3751 - var15;
                                class36.method346(var18, var15, var33, var8);
                                class36.method346(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg1 + arg4) < ~class269.field3751) {
            int var34 = -arg1 + class269.field3751;
            for (int var35 = 0; ~arg0 < ~var35; ++var35) {
                int[] var36 = arg3[arg6 + var35];
                class36.method346(var36, arg1, var34, var8);
                class36.method346(var36, 0, -var34 + arg4, var8);
            }
        } else {
            for (int var37 = 0; ~var37 > ~arg0; ++var37) {
                class36.method346(arg3[arg6 + var37], arg1, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 254)
    public class346() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V", line = 257)
    public final void method33(int arg0) {
        ++field4709;
        int var2 = -122 % ((arg0 - 2) / 51);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[I", line = 282)
    public final int[] method29(boolean arg0, int arg1) {
        ++field4711;
        if (!arg0) {
            field4721 = null;
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int[][] var4 = super.field263.method896(95);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class269.field3751 * this.field4725 >> 12;
            int var15 = class269.field3751 * this.field4708 >> 12;
            int var16 = class413.field5862 * this.field4713 >> 12;
            int var17 = class413.field5862 * this.field4719 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field4707 = class269.field3751 / 8 * this.field4712 >> 12;
                int var18 = 1 - -(class269.field3751 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4722);
                while (true) {
                    while (true) {
                        int var22 = class26.method299(-var14 + var15, (byte) -69, var21) + var14;
                        int var23 = class26.method299(var17 - var16, (byte) 121, var21) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class269.field3751) {
                            var22 = -var8 + class269.field3751;
                            var24 = class269.field3751;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (~var28 > -1) {
                                var28 += class269.field3751;
                            }
                            if (class269.field3751 < var28) {
                                var28 -= class269.field3751;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && var30[1] >= var28) {
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class269.field3751;
                                        }
                                        if (class269.field3751 < var31) {
                                            var31 -= class269.field3751;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var27; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 >= ~var31) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class269.field3751;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var28, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method2195(-var35 + var29, var38 - -var7, 1024, var4, -var38 + var39, var21, var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var12 <= var25) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var29 <= class413.field5862) {
                            var10 = false;
                        } else {
                            var23 = -var29 + class413.field5862;
                        }
                        if (class269.field3751 == var24) {
                            this.method2195(var23, var8 - -var6, 1024, var4, var22, var21, var29);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var29;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class26.method299(class269.field3751, (byte) -124, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class269.field3751 + var5;
                            }
                            if (var43 > class269.field3751) {
                                var43 -= class269.field3751;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var43 <= var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[2] = var23 + var29;
                            var45[0] = var8;
                            this.method2195(var23, var6 + var8, 1024, var4, var22, var21, var29);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lkh;BI)V", line = 535)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field4714;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field4716 = arg0.method174(255);
                                        }
                                    } else {
                                        this.field4718 = arg0.method174(255);
                                    }
                                } else {
                                    this.field4723 = arg0.method172((byte) 52);
                                }
                            } else {
                                this.field4712 = arg0.method174(255);
                            }
                        } else {
                            this.field4719 = arg0.method174(255);
                        }
                    } else {
                        this.field4713 = arg0.method174(255);
                    }
                } else {
                    this.field4708 = arg0.method174(255);
                }
            } else {
                this.field4725 = arg0.method174(255);
            }
        } else {
            this.field4722 = arg0.method172((byte) 52);
        }
        if (arg1 <= 50) {
            this.field4716 = 31;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/lang/Object;Lko;)V", line = 662)
    public static final void method2196(int arg0, Object arg1, class294 arg2) {
        ++field4710;
        if (arg2.field4111 != null) {
            for (int var3 = 0; ~var3 > -51 && arg2.field4111.peekEvent() != null; ++var3) {
                class349.method2219(1L, -25);
            }
            int var4 = 37 % ((-34 - arg0) / 39);
            if (arg1 != null) {
                arg2.field4111.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        }
    }
}
