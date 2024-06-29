import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class36 extends class43 {

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field580 = 0;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    private int field585 = 4;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "[B")
    private byte[] field599 = new byte[512];

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    private int field581 = 4;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    private int field592 = 4;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "Z")
    private boolean field577 = true;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
    private int field600 = 1638;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public static int field584 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lmb;")
    private static class132 field576 = class166.method1092("scroll:", 124);

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "Lmb;")
    public static class132 field588 = field576;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "Lmb;")
    private static class132 field598 = class166.method1092("Too many incorrect logins from your address)3", 121);

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "Lmb;")
    public static class132 field591 = class166.method1092("RuneScape wird geladen )2 bitte warten)3)3)3", 119);

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "Lmb;")
    public static class132 field587 = field598;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "Lmb;")
    public static class132 field602 = field576;

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "[Z")
    public static boolean[] field603 = new boolean[100];

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "Lq;")
    public static class174 field590 = new class174(260);

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "Lsg;")
    public static class201 field586;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "Ljava/awt/Image;")
    public static Image field593;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "[S")
    private short[] field582;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[S")
    private short[] field583;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Lhh;")
    public static final class85 method254(byte arg0) {
        ++field601;
        if (arg0 != 120) {
            return null;
        } else {
            class188 var1 = new class188(class153.field2792, class140.field2619, class23.field321[0], class30.field462[0], class94.field1657[0], class153.field2793[0], class10.field109[0], class118.field2244);
            class187.method1193(arg0 ^ 121);
            return var1;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)V")
    public static void method255(byte arg0) {
        int var1 = 7 % ((arg0 - 47) / 56);
        field586 = null;
        field603 = null;
        field591 = null;
        field588 = null;
        field576 = null;
        field590 = null;
        field593 = null;
        field598 = null;
        field587 = null;
        field602 = null;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field579;
        this.field599 = class231.method1467(this.field580, (byte) 117);
        this.method259((byte) 32);
        for (int var2 = this.field585 + -1; var2 >= 1; --var2) {
            short var3 = this.field583[var2];
            if (var3 > 8 || ~var3 > 7) {
                break;
            }
            --this.field585;
        }
        if (arg0 < 21) {
            this.field583 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I[IB)V")
    private final void method256(int arg0, int[] arg1, byte arg2) {
        int var4 = class2.field35[arg0] * this.field592;
        ++field597;
        if (arg2 <= -32) {
            if (this.field585 == 1) {
                short var5 = this.field583[0];
                int var6 = this.field582[0] << 12;
                int var7 = this.field592 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = var8 >> 12;
                int var10 = 255 & this.field599[255 & var9];
                int var11 = var8 & 4095;
                int var12 = class192.field3580[var11];
                int var13 = this.field581 * var6 >> 12;
                int var14 = var9 + 1;
                if (var7 <= var14) {
                    var14 = 0;
                }
                int var15 = 255 & this.field599[var14 & 255];
                if (this.field577) {
                    for (int var16 = 0; ~var16 > ~class131.field2427; ++var16) {
                        int var17 = class156.field2849[var16] * this.field581;
                        int var18 = this.method261(var12, var10, var15, var11, 0, var6 * var17 >> 12, var13);
                        int var19 = var5 * var18 >> 12;
                        arg1[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; ~class131.field2427 < ~var20; ++var20) {
                        int var21 = class156.field2849[var20] * this.field581;
                        int var22 = this.method261(var12, var10, var15, var11, 0, var6 * var21 >> 12, var13);
                        arg1[var20] = var5 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field583[0];
                if (var23 > 8 || ~var23 > 7) {
                    int var24 = this.field582[0] << 12;
                    int var25 = this.field592 * var24 >> 12;
                    int var26 = this.field581 * var24 >> 12;
                    int var27 = var4 * var24 >> 12;
                    int var28 = var27 >> 12;
                    int var29 = var28 - -1;
                    if (~var29 <= ~var25) {
                        var29 = 0;
                    }
                    int var30 = this.field599[255 & var28] & 255;
                    int var31 = var27 & 4095;
                    int var32 = 255 & this.field599[255 & var29];
                    int var33 = class192.field3580[var31];
                    for (int var34 = 0; var34 < class131.field2427; ++var34) {
                        int var54 = class156.field2849[var34] * this.field581;
                        int var55 = this.method261(var33, var30, var32, var31, 0, var24 * var54 >> 12, var26);
                        arg1[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; this.field585 > var35; ++var35) {
                    short var36 = this.field583[var35];
                    if (var36 > 8 || ~var36 > 7) {
                        int var37 = this.field582[var35] << 12;
                        int var38 = this.field592 * var37 >> 12;
                        int var39 = this.field581 * var37 >> 12;
                        int var40 = var4 * var37 >> 12;
                        int var41 = var40 >> 12;
                        int var42 = this.field599[255 & var41] & 255;
                        int var43 = var41 + 1;
                        int var44 = var40 & 4095;
                        int var45 = class192.field3580[var44];
                        if (~var43 <= ~var38) {
                            var43 = 0;
                        }
                        int var46 = 255 & this.field599[var43 & 255];
                        if (this.field577 && this.field585 + -1 == var35) {
                            for (int var47 = 0; class131.field2427 > var47; ++var47) {
                                int var48 = class156.field2849[var47] * this.field581;
                                int var49 = this.method261(var45, var42, var46, var44, 0, var37 * var48 >> 12, var39);
                                int var50 = (var36 * var49 >> 12) + arg1[var47];
                                arg1[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; class131.field2427 > var51; ++var51) {
                                int var52 = class156.field2849[var51] * this.field581;
                                int var53 = this.method261(var45, var42, var46, var44, 0, var37 * var52 >> 12, var39);
                                arg1[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(B)V")
    public static final void method257(byte arg0) {
        ++field605;
        if (class11.field147 != null) {
            if (~class70.field1171 > -11) {
                if (!class230.field4152.method1071(class11.field147, false)) {
                    class70.field1171 = class230.field4152.method1085(class11.field147, 103) / 10;
                    return;
                }
                class70.field1171 = 10;
            }
            if (~class70.field1171 != -11) {
                if (~class70.field1171 == -21) {
                    class136.method929(class230.field4152.method1087(class11.field147, -18228, class217.field3965), -1);
                    class70.field1171 = 30;
                    class133.method912(0);
                } else if (class70.field1171 == 30) {
                    class190.method1214(4096, class230.field4152.method1087(class11.field147, -18228, class172.field3217));
                    class70.field1171 = 50;
                    class133.method912(0);
                } else if (~class70.field1171 == -51) {
                    class123.method816(4421, class230.field4152.method1087(class11.field147, -18228, class82.field1381));
                    class70.field1171 = 70;
                    class133.method912(0);
                } else if (~class70.field1171 == -71) {
                    class189.method1210(class230.field4152.method1087(class11.field147, -18228, class55.field935), 1463726246);
                    class70.field1171 = 90;
                    class133.method912(0);
                } else {
                    class68.method422(class230.field4152.method1087(class11.field147, -18228, class222.field4031), (byte) 52);
                    if (arg0 < 45) {
                        method255((byte) 127);
                    }
                    if (class70.field1171 == 90) {
                        class159.field2898 = new class143(11, true, class154.field2814);
                        class137.field2574 = new class143(12, true, class154.field2814);
                        class153.field2796 = new class143(14, true, class154.field2814);
                        class82.field1383 = new class143(17, true, class154.field2814);
                        class32.field500 = new class143(19, true, class154.field2814);
                        class217.field3973 = new class143(22, true, class154.field2814);
                        class24.field344 = new class143(26, true, class154.field2814);
                        class73.field1221 = new class143(30, true, class154.field2814);
                        class70.field1171 = 100;
                    }
                    class70.field1171 = 100;
                    class196.field3641 = -1;
                    class210.field3862 = -1;
                    class133.method912(0);
                    System.gc();
                }
            } else {
                class112 var1 = new class112(class230.field4152.method1087(class11.field147, -18228, class236.field4272));
                int var2 = var1.method739(-123);
                int var3 = var1.method739(101);
                int var4 = var1.method739(-19);
                int var5 = var1.method739(-123);
                int var6 = var1.method739(-126);
                int var7 = var1.method739(-126);
                class215.field3917 = new int[class72.field1207 + 1];
                class141.field2632 = var3 * 64;
                class192.field3586 = (var4 - var2 - -1) * 64;
                int var8 = (class210.field3854.field723 >> 7) + class168.field3082 + -class141.field2632;
                int var9 = class192.field3586 >> 6;
                int var10 = var8 + (int) (Math.random() * 10.0D) + -5;
                class28.field451 = var2 * 64;
                class113.field2188 = (var5 - var3) * 64 - -64;
                int var11 = class113.field2188 >> 6;
                class198.field3681 = new byte[var9][var11][];
                class154.field2813 = new byte[var9][var11][];
                class24.field369 = new byte[var9][var11][];
                class222.field4044 = new int[var9][var11][];
                client.field543 = new byte[var9][var11][];
                class74.field1222 = new byte[var9][var11][];
                class52.field886 = new int[var9][var11][];
                class47.field816 = new byte[var9][var11][];
                class151.field2765 = 8.0D;
                class53.field902 = 8.0D;
                int var12 = -class28.field451 + class129.field2389 - -(class210.field3854.field673 >> 7);
                int var13 = var12 + -5 + (int) (10.0D * Math.random());
                int var14 = class46.field789 >> 1;
                if (var13 >= 0 && var13 < class192.field3586 && var10 >= 0 && var10 < class113.field2188) {
                    class157.field2858 = var13;
                    class56.field953 = -var10 + class113.field2188;
                } else {
                    class157.field2858 = var6 * 64 + -class28.field451;
                    class56.field953 = class141.field2632 + class113.field2188 + -(var7 * 64);
                }
                int var15 = class122.field2281 >> 2 << 10;
                for (int var16 = 0; class72.field1207 > var16; ++var16) {
                    class40 var17 = class67.method417(4, var16);
                    if (var17 != null) {
                        int var18 = var17.field650;
                        if (~var18 <= -1 && !class50.field859.method491(true, var18)) {
                            var18 = -1;
                        }
                        int var19;
                        if (var17.field659 < 0) {
                            if (var18 < 0) {
                                if (var17.field647 == -1) {
                                    var19 = -1;
                                } else {
                                    int var20 = var17.field647;
                                    int var21 = (127 & var20) + var14;
                                    if (var21 < 0) {
                                        var21 = 0;
                                    } else if (~var21 < -128) {
                                        var21 = 127;
                                    }
                                    int var22 = (64512 & var15 + var20) + (896 & var20) + var21;
                                    var19 = class50.field857[class161.method1044(var22, 96, 2)];
                                }
                            } else {
                                var19 = class50.field857[class161.method1044(class50.field859.method489(var18, (byte) -91), 96, 2)];
                            }
                        } else {
                            int var23 = var17.field659;
                            int var24 = (var23 & 127) + var14;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (64512 & var15 + var23) + (var23 & 896) + var24;
                            var19 = class50.field857[class161.method1044(var25, 96, 2)];
                        }
                        class215.field3917[var16 + 1] = var19;
                    }
                }
                class70.field1171 = 20;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field578;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            this.method256(arg0, var3, (byte) -107);
        }
        return var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIIII)I")
    public static final int method258(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 3;
        ++field594;
        if ((arg2 & 1) == 1) {
            int var8 = arg5;
            arg5 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (~var7 == -2) {
            return arg0;
        } else {
            if (!arg1) {
                field576 = null;
            }
            return ~var7 == -3 ? -arg6 + 7 - (arg5 + -1) : -arg0 + 7 + -arg3 + 1;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (arg1 == -73) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 == -7) {
                                        this.field592 = arg2.method716(-1308);
                                    }
                                } else {
                                    this.field581 = arg2.method716(-1308);
                                }
                            } else {
                                this.field580 = arg2.method716(-1308);
                            }
                        } else {
                            this.field581 = this.field592 = arg2.method716(-1308);
                        }
                    } else {
                        this.field600 = arg2.method750(65280);
                        if (this.field600 < 0) {
                            this.field583 = new short[this.field585];
                            for (int var5 = 0; this.field585 > var5; ++var5) {
                                this.field583[var5] = (short) arg2.method750(65280);
                            }
                        }
                    }
                } else {
                    this.field585 = arg2.method716(-1308);
                }
            } else {
                this.field577 = ~arg2.method716(-1308) == -2;
            }
            ++field589;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class36() {
        super(0, true);
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(B)V")
    private final void method259(byte arg0) {
        if (arg0 <= 20) {
            method255((byte) 4);
        }
        if (this.field600 > 0) {
            this.field583 = new short[this.field585];
            this.field582 = new short[this.field585];
            for (int var2 = 0; this.field585 > var2; ++var2) {
                this.field583[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field600 / 4096.0F), (double) var2)));
                this.field582[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field583 != null && ~this.field583.length == ~this.field585) {
            this.field582 = new short[this.field585];
            for (int var3 = 0; ~this.field585 < ~var3; ++var3) {
                this.field582[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field595;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLmb;Z)V")
    public static final void method260(boolean arg0, class132 arg1, boolean arg2) {
        ++field604;
        class132 var3 = arg1.method896((byte) 125);
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class85.field1479; ++var6) {
            class243 var9 = class58.method389(0, var6);
            if ((!arg0 || var9.field4405) && var9.field4423 == -1 && var9.field4428 == -1 && ~var9.field4430 == -1 && var9.field4399.method896((byte) 125).method893((byte) 45, var3) != -1) {
                if (~var5 <= -251) {
                    class77.field1333 = -1;
                    class211.field3876 = null;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; ~var5 < ~var11; ++var11) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class173.field3229 = 0;
        class77.field1333 = var5;
        class211.field3876 = var4;
        class132[] var7 = new class132[class77.field1333];
        if (arg2) {
            for (int var8 = 0; ~class77.field1333 < ~var8; ++var8) {
                var7[var8] = class58.method389(0, var4[var8]).field4399;
            }
            class230.method1464(var7, 1365, class211.field3876);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIII)I")
    private final int method261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 0) {
            method254((byte) -31);
        }
        ++field596;
        int var8 = arg3 + -4096;
        int var9 = arg5 >> 12;
        int var10 = arg5 & 4095;
        int var11 = var9 - -1;
        if (var11 >= arg6) {
            var11 = 0;
        }
        int var12 = var11 & 255;
        int var13 = var10 - 4096;
        int var14 = class192.field3580[var10];
        int var15 = var9 & 255;
        int var16 = this.field599[arg1 + var15] & 3;
        int var17;
        if (~var16 < -2) {
            var17 = ~var16 == -3 ? -arg3 + var10 : -var10 - arg3;
        } else {
            var17 = ~var16 != -1 ? arg3 - var10 : arg3 + var10;
        }
        int var18 = this.field599[var12 - -arg1] & 3;
        int var19;
        if (~var18 < -2) {
            var19 = var18 == 2 ? -arg3 + var13 : -arg3 + -var13;
        } else {
            var19 = ~var18 != -1 ? arg3 - var13 : arg3 + var13;
        }
        int var20 = this.field599[arg2 + var15] & 3;
        int var21 = ((-var17 + var19) * var14 >> 12) + var17;
        int var22;
        if (~var20 < -2) {
            var22 = var20 != 2 ? -var8 + -var10 : -var8 + var10;
        } else {
            var22 = var20 != 0 ? -var10 + var8 : var8 + var10;
        }
        int var23 = this.field599[arg2 + var12] & 3;
        int var24;
        if (var23 > 1) {
            var24 = var23 != 2 ? -var13 - var8 : var13 - var8;
        } else {
            var24 = var23 != 0 ? -var13 + var8 : var13 - -var8;
        }
        int var25 = ((-var22 + var24) * var14 >> 12) + var22;
        return var21 - -((-var21 + var25) * arg0 >> 12);
    }
}
