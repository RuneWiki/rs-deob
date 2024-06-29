import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class232 extends class43 {

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    private int field4175 = 819;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    private int field4178 = 409;

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    private int field4180 = 1024;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    private int field4181 = 1024;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    private int field4184 = 2048;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    private int field4176 = 1024;

    @OriginalMember(owner = "client!vh", name = "ib", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    private int field4182 = 1024;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "I")
    private int field4186 = 0;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "Lmb;")
    private static class132 field4179 = class166.method1092("Too many connections from your address)3", 115);

    @OriginalMember(owner = "client!vh", name = "kb", descriptor = "Lmb;")
    public static class132 field4192 = field4179;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "I")
    private int field4188;

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!vh", name = "jb", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[[[II)V")
    public static final void method1470(int arg0, int arg1, int arg2, int[][][] arg3, int arg4) {
        class231.field4167 = arg0;
        class225.field4079 = arg1;
        class14.field193 = arg2;
        class101.field1900 = new class169[arg0][arg1][arg2];
        class24.field348 = new int[arg0][arg1 + 1][arg2 + 1];
        class78.field1364 = arg3;
        class23.method154();
        class205.field3756 = arg4;
        class9.field100 = new boolean[class205.field3756 + class205.field3756 + 1][class205.field3756 + class205.field3756 + 1];
        class97.field1859 = new boolean[class205.field3756 + class205.field3756 + 2][class205.field3756 + class205.field3756 + 2];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[[IZIILjava/util/Random;I)V")
    private final void method1471(int arg0, int[][] arg1, boolean arg2, int arg3, int arg4, Random arg5, int arg6) {
        if (arg2) {
            ++field4177;
            int var8 = this.field4176 > 0 ? 4096 + -class133.method914((byte) 53, arg5, this.field4176) : 4096;
            int var9 = this.field4188 * this.field4181 >> 12;
            int var10 = this.field4188 - (~var9 < -1 ? class133.method914((byte) 53, arg5, var9) : 0);
            if (arg4 >= class131.field2427) {
                arg4 -= class131.field2427;
            }
            if (~var10 >= -1) {
                if (~(arg4 + arg6) >= ~class131.field2427) {
                    for (int var11 = 0; arg3 > var11; ++var11) {
                        class80.method493(arg1[arg0 + var11], arg4, arg6, var8);
                    }
                } else {
                    int var12 = class131.field2427 - arg4;
                    for (int var13 = 0; ~var13 > ~arg3; ++var13) {
                        int[] var14 = arg1[arg0 + var13];
                        class80.method493(var14, arg4, var12, var8);
                        class80.method493(var14, 0, -var12 + arg6, var8);
                    }
                }
            } else if (arg3 > 0 && ~arg6 < -1) {
                int var15 = arg6 / 2;
                int var16 = arg3 / 2;
                int var17 = ~var15 <= ~var10 ? var10 : var15;
                int var18 = ~var10 >= ~var16 ? var10 : var16;
                int var19 = arg4 - -var17;
                int var20 = -(var17 * 2) + arg6;
                for (int var21 = 0; arg3 > var21; ++var21) {
                    int[] var22 = arg1[var21 - -arg0];
                    if (~var18 < ~var21) {
                        int var23 = var8 * var21 / var18;
                        if (this.field4186 != 0) {
                            for (int var24 = 0; ~var24 > ~var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class75.method450(arg4 + var24, class90.field1593)] = var22[class75.method450(-var24 + arg6 + arg4 + -1, class90.field1593)] = var25 >= var23 ? var23 : var25;
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~var17; ++var26) {
                                int var28 = var8 * var26 / var17;
                                var22[class75.method450(arg4 + var26, class90.field1593)] = var22[class75.method450(class90.field1593, -var26 + arg6 + arg4 + -1)] = var23 * var28 >> 12;
                            }
                        }
                        if (~class131.field2427 > ~(var19 - -var20)) {
                            int var27 = -var19 + class131.field2427;
                            class80.method493(var22, var19, var27, var23);
                            class80.method493(var22, 0, -var27 + var20, var23);
                        } else {
                            class80.method493(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = arg3 + -1 + -var21;
                        if (~var18 < ~var29) {
                            int var30 = var8 * var29 / var18;
                            if (this.field4186 != 0) {
                                for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class75.method450(arg4 + var31, class90.field1593)] = var22[class75.method450(-var31 + arg4 + arg6 + -1, class90.field1593)] = var32 < var30 ? var32 : var30;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                    int var35 = var8 * var33 / var17;
                                    var22[class75.method450(arg4 + var33, class90.field1593)] = var22[class75.method450(arg4 + arg6 + -var33 + -1, class90.field1593)] = var30 * var35 >> 12;
                                }
                            }
                            if (~(var19 + var20) >= ~class131.field2427) {
                                class80.method493(var22, var19, var20, var30);
                            } else {
                                int var34 = -var19 + class131.field2427;
                                class80.method493(var22, var19, var34, var30);
                                class80.method493(var22, 0, var20 - var34, var30);
                            }
                        } else {
                            for (int var36 = 0; var17 > var36; ++var36) {
                                var22[class75.method450(class90.field1593, arg4 + var36)] = var22[class75.method450(class90.field1593, arg4 + arg6 - var36 + -1)] = var8 * var36 / var17;
                            }
                            if (~(var19 + var20) >= ~class131.field2427) {
                                class80.method493(var22, var19, var20, var8);
                            } else {
                                int var37 = -var19 + class131.field2427;
                                class80.method493(var22, var19, var37, var8);
                                class80.method493(var22, 0, -var37 + var20, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
    public static void method1472(byte arg0) {
        field4179 = null;
        field4192 = null;
        int var1 = -4 % ((arg0 - -42) / 48);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIZ)I")
    public static final int method1473(int arg0, int arg1, boolean arg2) {
        ++field4185;
        if (arg0 == -1) {
            return 12345678;
        } else {
            int var3 = (arg0 & 127) * arg1 >> 7;
            if (~var3 <= -3) {
                if (~var3 < -127) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            if (!arg2) {
                field4179 = null;
            }
            return (arg0 & 65408) - -var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field4176 = arg2.method739(78);
                                        }
                                    } else {
                                        this.field4181 = arg2.method739(-123);
                                    }
                                } else {
                                    this.field4186 = arg2.method716(arg1 + -1235);
                                }
                            } else {
                                this.field4182 = arg2.method739(arg1 + -53);
                            }
                        } else {
                            this.field4175 = arg2.method739(-27);
                        }
                    } else {
                        this.field4178 = arg2.method739(-124);
                    }
                } else {
                    this.field4184 = arg2.method739(arg1 + 76);
                }
            } else {
                this.field4180 = arg2.method739(25);
            }
        } else {
            this.field4190 = arg2.method716(-1308);
        }
        if (arg1 != -73) {
            this.field4190 = 54;
        }
        ++field4191;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(III)V")
    public static final void method1474(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field3105 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lrg;I)V")
    public static final void method1475(class191 arg0, int arg1) {
        ++field4187;
        if (class49.field827 == 1) {
            short var2 = 280;
            if (class48.field826 >= var2 && ~(var2 - -14) <= ~class48.field826 && ~class189.field3501 <= -5 && ~class189.field3501 >= -19) {
                class99.method620(4, 0, 0);
                return;
            }
            if (~(var2 - -15) >= ~class48.field826 && ~class48.field826 >= ~(var2 + 80) && ~class189.field3501 <= -5 && class189.field3501 <= 18) {
                class99.method620(4, 1, 0);
                return;
            }
            short var3 = 390;
            if (~var3 >= ~class48.field826 && class48.field826 <= var3 + 14 && ~class189.field3501 <= -5 && class189.field3501 <= 18) {
                class99.method620(4, 0, 1);
                return;
            }
            if (var3 + 15 <= class48.field826 && class48.field826 <= var3 + 80 && class189.field3501 >= 4 && ~class189.field3501 >= -19) {
                class99.method620(4, 1, 1);
                return;
            }
            short var4 = 500;
            if (var4 <= class48.field826 && var4 + 14 >= class48.field826 && class189.field3501 >= 4 && ~class189.field3501 >= -19) {
                class99.method620(4, 0, 2);
                return;
            }
            if (var4 - -15 <= class48.field826 && class48.field826 <= var4 + 80 && class189.field3501 >= 4 && class189.field3501 <= 18) {
                class99.method620(4, 1, 2);
                return;
            }
            short var5 = 610;
            if (~var5 >= ~class48.field826 && class48.field826 <= var5 - -14 && class189.field3501 >= 4 && class189.field3501 <= 18) {
                class99.method620(4, 0, 3);
                return;
            }
            if (~class48.field826 <= ~(var5 + 15) && ~class48.field826 >= ~(var5 + 80) && ~class189.field3501 <= -5 && ~class189.field3501 >= -19) {
                class99.method620(4, 1, 3);
                return;
            }
            if (class48.field826 >= 700 && ~class189.field3501 <= -5 && ~class48.field826 >= -759 && class189.field3501 <= 20) {
                class62.field1040 = false;
                class129.method850((byte) 89);
                return;
            }
            if (class88.field1532 != -1) {
                class75 var6 = class211.field3870[class88.field1532];
                if (var6.field1257 != !class40.field648) {
                    byte[] var7 = class187.method1197(new class132[] { var6.field1249, class181.field3333 }, -95).method869(-22828);
                    class236.field4261 = new String(var7, 0, var7.length);
                    class62.field1040 = false;
                    class82.field1377 = var6.field1251;
                    if (~class211.field3871 != -1) {
                        class211.field3871 = 0;
                        class235.field4236 = 43594;
                        class6.field61 = 43594;
                        class113.field2191 = 443;
                    }
                    class129.method850((byte) 38);
                    return;
                }
                class132 var8 = class187.method1197(new class132[] { class133.field2504, var6.field1249, class13.field173, class132.method889(class149.field2736, (byte) 93), class132.field2456, class132.method889(!class66.field1096 ? 0 : 1, (byte) 113), class194.field3600, class132.method889(class152.field2777, (byte) 109), class31.field479, class132.method889(class220.field4008, (byte) 108) }, -84);
                try {
                    arg0.getAppletContext().showDocument(var8.method899(0), "_self");
                } catch (Exception var9) {
                }
            }
        }
        if (arg1 <= 97) {
            method1475((class191) null, -58);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field4183;
        int[] var3 = super.field768.method1123(arg1, arg0);
        if (super.field768.field3219) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            boolean var7 = true;
            int[][] var8 = super.field768.method1120(arg1);
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = class131.field2427 * this.field4184 >> 12;
            int var14 = 0;
            int var15 = class131.field2427 * this.field4180 >> 12;
            int var16 = class42.field689 * this.field4175 >> 12;
            int var17 = class42.field689 * this.field4178 >> 12;
            if (~var16 >= -2) {
                return var8[arg0];
            } else {
                this.field4188 = class131.field2427 / 8 * this.field4182 >> 12;
                int var18 = class131.field2427 / var15 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4190);
                while (true) {
                    while (true) {
                        int var22 = var15 - -class133.method914((byte) 53, var21, var13 - var15);
                        int var23 = class133.method914((byte) 53, var21, var16 - var17) + var17;
                        int var24 = var5 + var22;
                        if (~var24 < ~class131.field2427) {
                            var24 = class131.field2427;
                            var22 = -var5 + class131.field2427;
                        }
                        int var25;
                        if (var7) {
                            var25 = 0;
                        } else {
                            int var26 = var12;
                            int var27 = var6 + var24;
                            if (~var27 > -1) {
                                var27 += class131.field2427;
                            }
                            int[] var28 = var20[var12];
                            int var29 = 0;
                            var25 = var28[2];
                            if (~class131.field2427 > ~var27) {
                                var27 -= class131.field2427;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var30[0] >= ~var27 && ~var27 >= ~var30[1]) {
                                    if (~var12 != ~var26) {
                                        int var31 = var5 - -var6;
                                        if (var31 < 0) {
                                            var31 += class131.field2427;
                                        }
                                        if (~class131.field2427 > ~var31) {
                                            var31 -= class131.field2427;
                                        }
                                        for (int var32 = 1; var29 >= var32; ++var32) {
                                            int[] var40 = var20[(var12 + var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var29; ++var33) {
                                            int[] var34 = var20[(var12 + var33) % var11];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var27 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var27, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class131.field2427;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var27, var37);
                                                }
                                                this.method1471(var35, var8, true, -var35 + var25, var10 + var38, var21, -var38 + var39);
                                            }
                                        }
                                    }
                                    var12 = var26;
                                    break;
                                }
                                ++var29;
                                ++var26;
                                if (var26 >= var11) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (var23 + var25 <= class42.field689) {
                            var9 = false;
                        } else {
                            var23 = -var25 + class42.field689;
                        }
                        if (class131.field2427 == var24) {
                            this.method1471(var25, var8, true, var23, var4 + var5, var21, var22);
                            if (var9) {
                                return var3;
                            }
                            var7 = false;
                            var10 = var4;
                            var9 = true;
                            var12 = 0;
                            int[][] var41 = var20;
                            var20 = var19;
                            int[] var42 = var19[var14++];
                            var19 = var41;
                            var42[0] = var5;
                            var11 = var14;
                            var42[1] = var24;
                            var42[2] = var23 + var25;
                            var14 = 0;
                            var5 = 0;
                            var4 = class133.method914((byte) 53, var21, class131.field2427);
                            var6 = -var10 + var4;
                            int var43 = var6;
                            if (var6 < 0) {
                                var43 = class131.field2427 + var6;
                            }
                            if (class131.field2427 < var43) {
                                var43 -= class131.field2427;
                            }
                            while (true) {
                                int[] var44 = var20[var12];
                                if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var12;
                                if (var10000 >= ~var12) {
                                    var12 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var14++];
                            var45[2] = var23 + var25;
                            var45[1] = var24;
                            var45[0] = var5;
                            this.method1471(var25, var8, true, var23, var4 + var5, var21, var22);
                            var5 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field4189;
        if (arg0 < 21) {
            method1473(74, -108, false);
        }
    }
}
