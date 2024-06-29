import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class183 extends class202 {

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    private int field2652 = 409;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    private int field2650 = 819;

    @OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
    private int field2660 = 1024;

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    private int field2651 = 0;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    private int field2653 = 1024;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    private int field2654 = 2048;

    @OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
    private int field2659 = 1024;

    @OriginalMember(owner = "client!cp", name = "T", descriptor = "I")
    private int field2657 = 1024;

    @OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
    private int field2661 = 0;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "[[I")
    public static int[][] field2647 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "Lem;")
    public static class434 field2656 = new class434();

    @OriginalMember(owner = "client!cp", name = "ab", descriptor = "Lqu;")
    public static class219 field2664;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!cp", name = "Y", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!cp", name = "Z", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!cp", name = "bb", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!cp", name = "cb", descriptor = "I")
    private int field2666;

    @OriginalMember(owner = "client!cp", name = "U", descriptor = "[Lbq;")
    public static class493[] field2658;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "[[Lsk;")
    public static class341[][] field2649;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        ++field2662;
        int var2 = 1 / ((arg0 - 80) / 46);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field2657 = arg0.method1455(-3387);
                                        }
                                    } else {
                                        this.field2653 = arg0.method1455(-3387);
                                    }
                                } else {
                                    this.field2661 = arg0.method1445(50);
                                }
                            } else {
                                this.field2659 = arg0.method1455(-3387);
                            }
                        } else {
                            this.field2650 = arg0.method1455(-3387);
                        }
                    } else {
                        this.field2652 = arg0.method1455(-3387);
                    }
                } else {
                    this.field2654 = arg0.method1455(-3387);
                }
            } else {
                this.field2660 = arg0.method1455(-3387);
            }
        } else {
            this.field2651 = arg0.method1445(65);
        }
        int var5 = -2 % ((arg1 - -46) / 50);
        ++field2665;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIILjava/util/Random;[[III)V")
    private final void method1149(int arg0, int arg1, int arg2, Random arg3, int[][] arg4, int arg5, int arg6) {
        ++field2663;
        if (arg2 >= 47) {
            int var8 = ~this.field2657 >= -1 ? 4096 : 4096 + -class167.method1057(-3481, arg3, this.field2657);
            int var9 = this.field2666 * this.field2653 >> 12;
            int var10 = this.field2666 + -(~var9 < -1 ? class167.method1057(-3481, arg3, var9) : 0);
            if (arg6 >= class276.field4375) {
                arg6 -= class276.field4375;
            }
            if (~var10 >= -1) {
                if (class276.field4375 < arg6 - -arg5) {
                    int var11 = -arg6 + class276.field4375;
                    for (int var12 = 0; arg0 > var12; ++var12) {
                        int[] var13 = arg4[arg1 - -var12];
                        class324.method2167(var13, arg6, var11, var8);
                        class324.method2167(var13, 0, -var11 + arg5, var8);
                    }
                } else {
                    for (int var14 = 0; arg0 > var14; ++var14) {
                        class324.method2167(arg4[arg1 + var14], arg6, arg5, var8);
                    }
                }
            } else if (arg0 > 0 && ~arg5 < -1) {
                int var15 = arg5 / 2;
                int var16 = arg0 / 2;
                int var17 = ~var10 < ~var15 ? var15 : var10;
                int var18 = var16 < var10 ? var16 : var10;
                int var19 = arg6 + var17;
                int var20 = -(var17 * 2) + arg5;
                for (int var21 = 0; arg0 > var21; ++var21) {
                    int[] var22 = arg4[arg1 + var21];
                    if (var21 < var18) {
                        int var23 = var8 * var21 / var18;
                        if (~this.field2661 != -1) {
                            for (int var24 = 0; ~var17 < ~var24; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class272.method1842(class538.field7882, arg6 + var24)] = var22[class272.method1842(class538.field7882, arg6 - -arg5 + -var24 + -1)] = ~var25 > ~var23 ? var25 : var23;
                            }
                        } else {
                            for (int var26 = 0; var26 < var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class272.method1842(arg6 + var26, class538.field7882)] = var22[class272.method1842(-var26 + arg5 + arg6 + -1, class538.field7882)] = var23 * var28 >> 12;
                            }
                        }
                        if (var19 + var20 <= class276.field4375) {
                            class324.method2167(var22, var19, var20, var23);
                        } else {
                            int var27 = -var19 + class276.field4375;
                            class324.method2167(var22, var19, var27, var23);
                            class324.method2167(var22, 0, -var27 + var20, var23);
                        }
                    } else {
                        int var29 = arg0 - var21 - 1;
                        if (var29 < var18) {
                            int var30 = var8 * var29 / var18;
                            if (~this.field2661 != -1) {
                                for (int var31 = 0; var31 < var17; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class272.method1842(class538.field7882, arg6 + var31)] = var22[class272.method1842(class538.field7882, arg6 - (-arg5 + var31 - -1))] = var30 > var32 ? var32 : var30;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class272.method1842(arg6 + var33, class538.field7882)] = var22[class272.method1842(-var33 + arg5 + arg6 + -1, class538.field7882)] = var30 * var35 >> 12;
                                }
                            }
                            if (~class276.field4375 > ~(var19 + var20)) {
                                int var34 = -var19 + class276.field4375;
                                class324.method2167(var22, var19, var34, var30);
                                class324.method2167(var22, 0, var20 - var34, var30);
                            } else {
                                class324.method2167(var22, var19, var20, var30);
                            }
                        } else {
                            for (int var36 = 0; ~var17 < ~var36; ++var36) {
                                var22[class272.method1842(class538.field7882, arg6 - -var36)] = var22[class272.method1842(class538.field7882, arg5 + arg6 + -var36 + -1)] = var8 * var36 / var17;
                            }
                            if (~(var19 - -var20) >= ~class276.field4375) {
                                class324.method2167(var22, var19, var20, var8);
                            } else {
                                int var37 = -var19 + class276.field4375;
                                class324.method2167(var22, var19, var37, var8);
                                class324.method2167(var22, 0, var20 - var37, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
    public static final void method1150(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            field2647 = null;
        }
        class170.field2488.method1477(65280, arg2);
        ++field2646;
        class170.field2488.method1424(false, arg1);
        class170.field2488.method1424(false, arg3);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V")
    public static void method1151(byte arg0) {
        field2664 = null;
        field2647 = null;
        field2649 = null;
        if (arg0 == -124) {
            field2656 = null;
            field2658 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field2648;
        if (!arg1) {
            this.method41(-44, true);
        }
        int[] var3 = super.field3064.method2452((byte) 124, arg0);
        if (super.field3064.field5837) {
            int[][] var4 = super.field3064.method2450(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class276.field4375 * this.field2660 >> 12;
            int var15 = class276.field4375 * this.field2654 >> 12;
            int var16 = class249.field4051 * this.field2652 >> 12;
            int var17 = class249.field4051 * this.field2650 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2666 = class276.field4375 / 8 * this.field2659 >> 12;
                int var18 = class276.field4375 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2651);
                while (true) {
                    while (true) {
                        int var22 = var14 + class167.method1057(-3481, var21, -var14 + var15);
                        int var23 = class167.method1057(-3481, var21, var17 - var16) + var16;
                        int var24 = var8 + var22;
                        if (class276.field4375 < var24) {
                            var24 = class276.field4375;
                            var22 = class276.field4375 - var8;
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
                                var29 += class276.field4375;
                            }
                            if (~var29 < ~class276.field4375) {
                                var29 -= class276.field4375;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var29 && ~var29 >= ~var30[1]) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class276.field4375;
                                        }
                                        if (~var31 < ~class276.field4375) {
                                            var31 -= class276.field4375;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 != -1) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class276.field4375;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method1149(var25 - var35, var35, 89, var21, var4, var39 - var38, var7 + var38);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class249.field4051 > ~(var23 + var25)) {
                            var23 = -var25 + class249.field4051;
                        } else {
                            var10 = false;
                        }
                        if (class276.field4375 != var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            this.method1149(var23, var25, 87, var21, var4, var22, var8 - -var6);
                            var8 = var24;
                        } else {
                            this.method1149(var23, var25, 68, var21, var4, var22, var8 - -var6);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class167.method1057(-3481, var21, class276.field4375);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class276.field4375 + var5;
                            }
                            if (class276.field4375 < var44) {
                                var44 -= class276.field4375;
                            }
                            var9 = 0;
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && var45[1] >= var44) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
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

    static {
        new class213("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field2664 = new class219(66, 2);
    }
}
