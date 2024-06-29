import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class255 extends class124 {

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    private int field4510 = 1024;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    private int field4512 = 0;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    private int field4515 = 2048;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    private int field4509 = 1024;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    private int field4523 = 1024;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    private int field4520 = 409;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    private int field4508 = 819;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    private int field4522 = 0;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    private int field4513 = 1024;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Le;")
    public static class191 field4511 = class54.method368(")4a=", 2047);

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lci;")
    public static class162 field4527 = new class162(5000);

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "Le;")
    public static class191 field4529 = class54.method368("scrollbar", 2047);

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "S")
    public static short field4531 = 32767;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "I")
    public static int field4532 = 255;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    private int field4514;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "Lng;")
    public static class121 field4525;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "[Lli;")
    public static class155[] field4530;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 != -1) {
            method1762((class121) null, true, (class121) null);
        }
        ++field4517;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/util/Random;III[[II)V")
    private final void method1761(int arg0, Random arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field4519;
        if (arg0 < 69) {
            method1764(-119, -22);
        }
        int var8 = this.field4509 <= 0 ? 4096 : 4096 - class172.method1156(arg1, Integer.MIN_VALUE, this.field4509);
        int var9 = this.field4523 * this.field4514 >> 12;
        int var10 = this.field4514 - (var9 > 0 ? class172.method1156(arg1, Integer.MIN_VALUE, var9) : 0);
        if (~arg2 <= ~class64.field1132) {
            arg2 -= class64.field1132;
        }
        if (var10 <= 0) {
            if (arg2 - -arg4 > class64.field1132) {
                int var11 = -arg2 + class64.field1132;
                for (int var12 = 0; ~arg3 < ~var12; ++var12) {
                    int[] var13 = arg5[arg6 + var12];
                    class58.method389(var13, arg2, var11, var8);
                    class58.method389(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    class58.method389(arg5[arg6 + var14], arg2, arg4, var8);
                }
            }
        } else if (arg3 > 0 && arg4 > 0) {
            int var15 = arg3 / 2;
            int var16 = arg4 / 2;
            int var17 = var10 > var16 ? var16 : var10;
            int var18 = ~var10 < ~var15 ? var15 : var10;
            int var19 = arg2 - -var17;
            int var20 = arg4 - var17 * 2;
            for (int var21 = 0; ~arg3 < ~var21; ++var21) {
                int[] var22 = arg5[arg6 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4512 != 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class167.method1128(class8.field82, arg2 + var24)] = var22[class167.method1128(arg4 - 1 + -var24 + arg2, class8.field82)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class167.method1128(class8.field82, arg2 + var26)] = var22[class167.method1128(-var26 + arg4 + arg2 + -1, class8.field82)] = var23 * var28 >> 12;
                        }
                    }
                    if (class64.field1132 < var19 + var20) {
                        int var27 = -var19 + class64.field1132;
                        class58.method389(var22, var19, var27, var23);
                        class58.method389(var22, 0, -var27 + var20, var23);
                    } else {
                        class58.method389(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg3 + -1 + -var21;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field4512 != 0) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class167.method1128(arg2 - -var31, class8.field82)] = var22[class167.method1128(class8.field82, arg2 - -arg4 - 1 + -var31)] = var32 < var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class167.method1128(arg2 + var33, class8.field82)] = var22[class167.method1128(class8.field82, arg2 - (-arg4 - (-var33 - 1)))] = var30 * var35 >> 12;
                            }
                        }
                        if (class64.field1132 < var19 + var20) {
                            int var34 = -var19 + class64.field1132;
                            class58.method389(var22, var19, var34, var30);
                            class58.method389(var22, 0, var20 - var34, var30);
                        } else {
                            class58.method389(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class167.method1128(class8.field82, arg2 - -var36)] = var22[class167.method1128(-var36 - 1 + arg2 + arg4, class8.field82)] = var8 * var36 / var17;
                        }
                        if (class64.field1132 < var19 - -var20) {
                            int var37 = -var19 + class64.field1132;
                            class58.method389(var22, var19, var37, var8);
                            class58.method389(var22, 0, -var37 + var20, var8);
                        } else {
                            class58.method389(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            this.method131((byte) 20, -85);
        }
        ++field4516;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field4509 = arg1.method1593(arg2);
                                        }
                                    } else {
                                        this.field4523 = arg1.method1593(true);
                                    }
                                } else {
                                    this.field4512 = arg1.method1580(-88);
                                }
                            } else {
                                this.field4510 = arg1.method1593(true);
                            }
                        } else {
                            this.field4508 = arg1.method1593(true);
                        }
                    } else {
                        this.field4520 = arg1.method1593(true);
                    }
                } else {
                    this.field4515 = arg1.method1593(true);
                }
            } else {
                this.field4513 = arg1.method1593(true);
            }
        } else {
            this.field4522 = arg1.method1580(-96);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lng;ZLng;)V")
    public static final void method1762(class121 arg0, boolean arg1, class121 arg2) {
        class83.field1393 = class83.method522((byte) -67, arg0, class200.field3574, 0, arg2);
        ++field4524;
        if (!arg1) {
            class1.field5 = (class195) class83.field1393;
            class138.field2325 = class83.method522((byte) -89, arg0, class45.field804, 0, arg2);
            class230.field4128 = class83.method522((byte) -93, arg0, class263.field4667, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
    public static void method1763(int arg0) {
        field4527 = null;
        field4525 = null;
        field4529 = null;
        if (arg0 != -2) {
            field4527 = null;
        }
        field4511 = null;
        field4530 = null;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class255() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field4518;
        if (super.field2064.field1035) {
            int[][] var4 = super.field2064.method376((byte) 124);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class64.field1132 * this.field4515 >> 12;
            int var15 = class64.field1132 * this.field4513 >> 12;
            int var16 = class87.field1423 * this.field4520 >> 12;
            int var17 = class87.field1423 * this.field4508 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field4514 = class64.field1132 / 8 * this.field4510 >> 12;
                int var18 = class64.field1132 / var15 + 1;
                Random var19 = new Random((long) this.field4522);
                int[][] var20 = new int[var18][3];
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var15 + class172.method1156(var19, Integer.MIN_VALUE, -var15 + var14);
                        int var23 = var8 - -var22;
                        int var24 = class172.method1156(var19, Integer.MIN_VALUE, -var16 + var17) + var16;
                        if (~var23 < ~class64.field1132) {
                            var23 = class64.field1132;
                            var22 = -var8 + class64.field1132;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int var27 = 0;
                            int var28 = var5 + var23;
                            int[] var29 = var20[var9];
                            if (var28 < 0) {
                                var28 += class64.field1132;
                            }
                            if (~var28 < ~class64.field1132) {
                                var28 -= class64.field1132;
                            }
                            var25 = var29[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var28 >= var30[0] && var30[1] >= var28) {
                                    if (~var9 != ~var26) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class64.field1132;
                                        }
                                        if (var31 > class64.field1132) {
                                            var31 -= class64.field1132;
                                        }
                                        for (int var32 = 1; var27 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 >= ~var31) {
                                                    if (var36 != 0) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class64.field1132;
                                                    } else {
                                                        var39 = Math.min(var28, var37);
                                                        var38 = 0;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1761(89, var19, var7 + var38, var25 - var35, -var38 + var39, var4, var35);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var25 - -var24 <= class87.field1423) {
                            var12 = false;
                        } else {
                            var24 = -var25 + class87.field1423;
                        }
                        if (~class64.field1132 == ~var23) {
                            this.method1761(113, var19, var6 + var8, var24, var22, var4, var25);
                            if (var12) {
                                return arg0 <= 68 ? null : var3;
                            }
                            var10 = false;
                            var7 = var6;
                            var12 = true;
                            int[] var41 = var21[var13++];
                            var41[0] = var8;
                            var11 = var13;
                            var41[1] = var23;
                            var9 = 0;
                            var8 = 0;
                            var13 = 0;
                            int[][] var42 = var20;
                            var20 = var21;
                            var41[2] = var24 + var25;
                            var21 = var42;
                            var6 = class172.method1156(var19, Integer.MIN_VALUE, class64.field1132);
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class64.field1132 + var5;
                            }
                            if (~class64.field1132 > ~var43) {
                                var43 -= class64.field1132;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var44[1] >= var43) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var11) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var21[var13++];
                            var45[0] = var8;
                            var45[2] = var25 - -var24;
                            var45[1] = var23;
                            this.method1761(104, var19, var6 + var8, var24, var22, var4, var25);
                            var8 = var23;
                        }
                    }
                }
            }
        } else {
            return arg0 <= 68 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method1764(int arg0, int arg1) {
        if (arg0 < 29) {
            field4529 = null;
        }
        class241 var2 = class14.method97(2, arg1, -100);
        var2.method1691(0);
        ++field4528;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILe;Lng;)Lwk;")
    public static final class46 method1765(int arg0, class191 arg1, class121 arg2) {
        ++field4526;
        int var3 = arg2.method824(true, arg1);
        if (~var3 == 0) {
            return new class46(0);
        } else {
            int[] var4 = arg2.method811(var3, 0);
            class46 var5 = new class46(var4.length);
            int var6 = 0;
            int var7 = -16 % ((arg0 - -43) / 61);
            while (~var5.field816 < ~var6) {
                class225 var8 = new class225(arg2.method826((byte) 35, var3, var4[var6]));
                var5.field825[var6] = var8.method1596((byte) 118);
                var5.field815[var6] = var8.method1575(false);
                var5.field823[var6] = (short) var8.method1593(true);
                var5.field826[var6] = (short) var8.method1593(true);
                var5.field817[var6] = var8.method1562(21705);
                ++var6;
            }
            return var5;
        }
    }
}
