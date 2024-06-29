import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class252 extends class139 {

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    private int field3710 = 6;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Lus;")
    public static class1 field3713 = new class1(27, -1);

    @OriginalMember(owner = "client!df", name = "P", descriptor = "Ldk;")
    public static class326 field3714 = new class326("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[[I")
    public static int[][] field3715 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!df", name = "R", descriptor = "Loi;")
    public static class49 field3716 = null;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "Lus;")
    public static class1 field3719;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "Lqb;")
    public static class135 field3717;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "Lmj;")
    public static class430 field3718;

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class252() {
        super(2, false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1841 = arg0.method1701(-23121) == 1;
            }
        } else {
            this.field3710 = arg0.method1701(-23121);
        }
        if (arg1 != -45) {
            field3716 = null;
        }
        ++field3709;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1572(String arg0, byte arg1) {
        ++field3708;
        int var2 = 0;
        if (arg1 != -31) {
            field3715 = null;
        }
        while (~var2 > ~class208.field3178.length) {
            if (class208.field3178[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            ++var2;
        }
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3) {
        class88 var4 = class330.field4786[arg0][arg1][arg2];
        if (var4 != null) {
            class364 var5 = var4.field1087;
            class364 var6 = var4.field1066;
            if (var5 != null) {
                var5.field5240 = var5.field5240 * arg3 / 16;
                var5.field5235 = var5.field5235 * arg3 / 16;
            }
            if (var6 != null) {
                var6.field5240 = var6.field5240 * arg3 / 16;
                var6.field5235 = var6.field5235 * arg3 / 16;
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
    public static final void method1574(boolean arg0) {
        ++field3711;
        if (class401.field5680 != 0) {
            try {
                if (++class339.field4945 > 1500) {
                    if (class58.field761 != null) {
                        class58.field761.method2118(1);
                        class58.field761 = null;
                    }
                    if (~class452.field6303 <= -2) {
                        class401.field5680 = 0;
                        class22.field287 = -5;
                        return;
                    }
                    if (~class230.field3470 == ~class226.field3425) {
                        class230.field3470 = class310.field4389;
                    } else {
                        class230.field3470 = class226.field3425;
                    }
                    class401.field5680 = 1;
                    ++class452.field6303;
                    class339.field4945 = 0;
                }
                if (!arg0) {
                    method1573(-124, 73, 42, 47);
                }
                if (class401.field5680 == 1) {
                    class178.field2553 = field3718.method2527(class279.field4115, (byte) -128, class230.field3470);
                    class401.field5680 = 2;
                }
                if (~class401.field5680 == -3) {
                    if (~class178.field2553.field5253 == -3) {
                        throw new IOException();
                    }
                    if (class178.field2553.field5253 != 1) {
                        return;
                    }
                    class58.field761 = new class337((Socket) class178.field2553.field5255, field3718);
                    class178.field2553 = null;
                    class58.field761.method2125(class225.field3415.field4021, class225.field3415.field4064, (byte) -36, 0);
                    if (class28.field381 != null) {
                        class28.field381.method2477(-125);
                    }
                    if (class116.field1481 != null) {
                        class116.field1481.method2477(-84);
                    }
                    int var1 = class58.field761.method2119(true);
                    if (class28.field381 != null) {
                        class28.field381.method2477(-113);
                    }
                    if (class116.field1481 != null) {
                        class116.field1481.method2477(-114);
                    }
                    if (~var1 != -102) {
                        class401.field5680 = 0;
                        class22.field287 = var1;
                        class58.field761.method2118(1);
                        class58.field761 = null;
                        return;
                    }
                    class401.field5680 = 3;
                }
                if (class401.field5680 == 3) {
                    if (~class58.field761.method2121(true) <= -3) {
                        int var2 = class58.field761.method2119(true) << 8 | class58.field761.method2119(true);
                        class488.method2859(var2, 32767);
                        if (class185.field2746 == -1) {
                            class401.field5680 = 0;
                            class22.field287 = 6;
                            class58.field761.method2118(1);
                            class58.field761 = null;
                        } else {
                            class401.field5680 = 0;
                            class58.field761.method2118(1);
                            class58.field761 = null;
                            class462.method2704(-122);
                        }
                    }
                }
            } catch (IOException var3) {
                if (class58.field761 != null) {
                    class58.field761.method2118(1);
                    class58.field761 = null;
                }
                if (class452.field6303 >= 1) {
                    class401.field5680 = 0;
                    class22.field287 = -4;
                } else {
                    ++class452.field6303;
                    if (class230.field3470 != class226.field3425) {
                        class230.field3470 = class226.field3425;
                    } else {
                        class230.field3470 = class310.field4389;
                    }
                    class401.field5680 = 1;
                    class339.field4945 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field3707;
        if (arg0 >= -67) {
            this.field3710 = 12;
        }
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int[][] var4 = this.method882(0, arg1, 1);
            int[][] var5 = this.method882(1, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3710;
            if (~var15 != -2) {
                if (~var15 != -3) {
                    if (~var15 != -4) {
                        if (var15 != 4) {
                            if (~var15 != -6) {
                                if (~var15 != -7) {
                                    if (~var15 != -8) {
                                        if (~var15 != -9) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (var15 == 12) {
                                                            for (int var16 = 0; ~var16 > ~class356.field5147; ++var16) {
                                                                int var17 = var11[var16];
                                                                int var18 = var14[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var9[var16];
                                                                int var21 = var13[var16];
                                                                int var22 = var10[var16];
                                                                var6[var16] = -(var19 * var20 >> 11) + var20 - -var19;
                                                                var7[var16] = var21 + var22 + -(var21 * var22 >> 11);
                                                                var8[var16] = var18 - (var17 * var18 >> 11) + var17;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class356.field5147; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var11[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var9[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = ~var27 > ~var28 ? var28 - var27 : -var28 + var27;
                                                            var7[var23] = var25 > var24 ? -var24 + var25 : -var25 + var24;
                                                            var8[var23] = ~var26 < ~var29 ? -var29 + var26 : -var26 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; var30 < class356.field5147; ++var30) {
                                                        int var31 = var13[var30];
                                                        int var32 = var14[var30];
                                                        int var33 = var12[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var9[var30];
                                                        int var36 = var11[var30];
                                                        var6[var30] = var35 <= var33 ? var33 : var35;
                                                        var7[var30] = ~var31 <= ~var34 ? var31 : var34;
                                                        var8[var30] = ~var36 >= ~var32 ? var32 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; var37 < class356.field5147; ++var37) {
                                                    int var38 = var12[var37];
                                                    int var39 = var14[var37];
                                                    int var40 = var9[var37];
                                                    int var41 = var13[var37];
                                                    int var42 = var10[var37];
                                                    int var43 = var11[var37];
                                                    var6[var37] = ~var38 < ~var40 ? var40 : var38;
                                                    var7[var37] = ~var41 < ~var42 ? var42 : var41;
                                                    var8[var37] = var43 >= var39 ? var39 : var43;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class356.field5147; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 != 0 ? -((-var12[var44] + 4096 << 12) / var45) + 4096 : 0;
                                                var7[var44] = ~var47 != -1 ? -((-var13[var44] + 4096 << 12) / var47) + 4096 : 0;
                                                var8[var44] = ~var46 != -1 ? -((-var14[var44] + 4096 << 12) / var46) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; ~var48 > ~class356.field5147; ++var48) {
                                            int var49 = var10[var48];
                                            int var50 = var9[var48];
                                            int var51 = var11[var48];
                                            var6[var48] = var50 == 4096 ? 4096 : (var12[var48] << 12) / (-var50 + 4096);
                                            var7[var48] = ~var49 == -4097 ? 4096 : (var13[var48] << 12) / (4096 - var49);
                                            var8[var48] = ~var51 != -4097 ? (var14[var48] << 12) / (-var51 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; var52 < class356.field5147; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var14[var52];
                                        int var55 = var12[var52];
                                        var6[var52] = ~var55 <= -2049 ? -((4096 - var9[var52]) * (-var55 + 4096) >> 11) + 4096 : var9[var52] * var55 >> 11;
                                        var7[var52] = var53 < 2048 ? var10[var52] * var53 >> 11 : -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096;
                                        var8[var52] = ~var54 > -2049 ? var11[var52] * var54 >> 11 : -((-var11[var52] + 4096) * (-var54 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~var56 > ~class356.field5147; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = 4096 - ((-var10[var56] + 4096) * (-var13[var56] + 4096) >> 12);
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; ~var57 > ~class356.field5147; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = ~var59 == -1 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = var60 != 0 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; ~var61 > ~class356.field5147; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; ~var62 > ~class356.field5147; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; class356.field5147 > var63; ++var63) {
                    var6[var63] = var9[var63] + var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] - -var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(Z)[Lef;")
    public static final class311[] method1575(boolean arg0) {
        if (arg0) {
            field3716 = null;
        }
        ++field3706;
        return new class311[] { class460.field6442, class359.field5168, class311.field4398, class247.field3655, class94.field1216, class469.field6604, class113.field1429, client.field2608, class138.field1821, class353.field5099, class185.field2743, class111.field1408, class394.field5587, class361.field5196, class329.field4764 };
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(B)V")
    public static void method1576(byte arg0) {
        if (arg0 != -8) {
            method1574(false);
        }
        field3715 = null;
        field3714 = null;
        field3713 = null;
        field3717 = null;
        field3719 = null;
        field3716 = null;
        field3718 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field3712;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 0);
            int[] var5 = this.method879((byte) -29, arg0, 1);
            int var6 = this.field3710;
            if (var6 != 1) {
                if (~var6 != -3) {
                    if (~var6 != -4) {
                        if (~var6 != -5) {
                            if (~var6 != -6) {
                                if (~var6 != -7) {
                                    if (var6 != 7) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (var6 != 11) {
                                                        if (~var6 == -13) {
                                                            for (int var7 = 0; var7 < class356.field5147; ++var7) {
                                                                int var8 = var4[var7];
                                                                int var9 = var5[var7];
                                                                var3[var7] = var9 - (var8 * var9 >> 11) + var8;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; ~var10 > ~class356.field5147; ++var10) {
                                                            int var11 = var4[var10];
                                                            int var12 = var5[var10];
                                                            var3[var10] = ~var11 < ~var12 ? -var12 + var11 : -var11 + var12;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; var13 < class356.field5147; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 < var14 ? var14 : var15;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class356.field5147 > var16; ++var16) {
                                                    int var17 = var4[var16];
                                                    int var18 = var5[var16];
                                                    var3[var16] = var17 >= var18 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; class356.field5147 > var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = var20 != 0 ? -((-var5[var19] + 4096 << 12) / var20) + 4096 : 0;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; ~var21 > ~class356.field5147; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = ~var22 != -4097 ? (var5[var21] << 12) / (-var22 + 4096) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; ~class356.field5147 < ~var23; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = ~var24 <= -2049 ? 4096 - ((-var4[var23] + 4096) * (-var24 + 4096) >> 11) : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; class356.field5147 > var25; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; ~var26 > ~class356.field5147; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = ~var27 != -1 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; class356.field5147 > var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; ~var29 > ~class356.field5147; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; ~class356.field5147 < ~var30; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg1 != 27782) {
            this.method22(-100, 63);
        }
        return var3;
    }

    static {
        new class112("", 76);
        field3719 = new class1(26, 14);
    }
}
