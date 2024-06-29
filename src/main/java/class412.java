import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public abstract class class412 extends class544 {

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public int field5657 = -1;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "Ljba;")
    public class647 field5656;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "[[I")
    public int[][] field5677;

    @OriginalMember(owner = "client!wp", name = "C", descriptor = "[[B")
    private byte[][] field5675;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "[[B")
    private byte[][] field5662;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public int field5663;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "I")
    public int field5665;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "I")
    public int field5666;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "I")
    public int field5667;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "I")
    public int field5669;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!wp", name = "B", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!wp", name = "z", descriptor = "[[Lvca;")
    public class13[][] field5673;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "[[Lcw;")
    public class472[][] field5658;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "[[Lgs;")
    public class531[][] field5668;

    @OriginalMember(owner = "client!wp", name = "x", descriptor = "[[Lhf;")
    public class574[][] field5671;

    @OriginalMember(owner = "client!wp", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1043(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5671 == null) {
            this.field5671 = new class574[super.field7581][super.field7585];
            this.field5658 = new class472[super.field7581][super.field7585];
        } else if (this.field5668 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class351.field4940[class433.method2528(arg6[var15], 15048) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class351.field4940[class433.method2528(arg7[var16], 15048) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field7582 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field7582 && arg4[var22] == super.field7582) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field7582) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field7582 != arg2[var24] && arg2[0] - super.field7582 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field7582 != arg4[var24] && arg4[0] - super.field7582 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class574 var25 = new class574();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field8011 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field8020 = (byte) (var25.field8020 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field5677[arg0 + 1][arg1] == this.field5677[arg0][arg1] && this.field5677[arg0 + 1][arg1 + 1] == this.field5677[arg0][arg1] && this.field5677[arg0][arg1 + 1] == this.field5677[arg0][arg1]) {
                    var25.field8020 = (byte) (var25.field8020 | 1);
                }
                if (var27 != -1 && (var25.field8020 & 2) == 0 && !this.field5656.field2114.method2151(true, var27).field604) {
                    var25.field8018 = this.field5675[arg0][arg1] - this.field5662[arg0][arg1];
                    var25.field8012 = this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1];
                    var25.field8019 = this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1];
                    var25.field8016 = this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1];
                    var25.field8014 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field8018 = class480.method2717(var28, (byte) 127, method2459(arg6[var18] >> 8, this.field5675[arg0][arg1] - this.field5662[arg0][arg1]), arg10);
                    if (var25.field8011 != 0) {
                        var25.field8018 |= 255 - (this.field5675[arg0][arg1] - this.field5662[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field8012 = class480.method2717(var29, (byte) -122, method2459(arg6[var19] >> 8, this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]), arg10);
                    if (var25.field8011 != 0) {
                        var25.field8012 |= 255 - (this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field8019 = class480.method2717(var30, (byte) 81, method2459(arg6[var20] >> 8, this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]), arg10);
                    if (var25.field8011 != 0) {
                        var25.field8019 |= 255 - (this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field8016 = class480.method2717(var31, (byte) 115, method2459(arg6[var21] >> 8, this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]), arg10);
                    if (var25.field8011 != 0) {
                        var25.field8016 |= 255 - (this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]) << 25;
                    }
                    var25.field8014 = -1;
                }
                if (arg5 != null) {
                    var25.field8021 = (short) arg5[var20];
                    var25.field8017 = (short) arg5[var21];
                    var25.field8013 = (short) arg5[var19];
                    var25.field8015 = (short) arg5[var18];
                }
                this.field5671[arg0][arg1] = var25;
            } else {
                class472 var32 = new class472();
                var32.field6690 = (short) arg2.length;
                var32.field6686 = (short) (arg2.length / 3);
                var32.field6688 = new short[var32.field6690];
                var32.field6682 = new short[var32.field6690];
                var32.field6683 = new short[var32.field6690];
                var32.field6684 = new int[var32.field6690];
                if (arg5 != null) {
                    var32.field6685 = new short[var32.field6690];
                }
                for (int var33 = 0; var33 < var32.field6690; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5675[arg0][arg1] - this.field5662[arg0][arg1];
                    } else if (var48 == 0 && super.field7582 == var49) {
                        var51 = this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1];
                    } else if (super.field7582 == var48 && super.field7582 == var49) {
                        var51 = this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1];
                    } else if (super.field7582 == var48 && var49 == 0) {
                        var51 = this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]) * var48 + (this.field5675[arg0][arg1] - this.field5662[arg0][arg1]) * (super.field7582 - var48);
                        int var53 = (this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]) * var48 + (this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]) * (super.field7582 - var48);
                        var51 = (super.field7582 - var49) * var52 + var49 * var53 >> super.field7583 * 2;
                    }
                    int var54 = (arg0 << super.field7583) + var48;
                    int var55 = (arg1 << super.field7583) + var49;
                    var32.field6688[var33] = (short) var48;
                    var32.field6683[var33] = (short) var49;
                    var32.field6682[var33] = (short) (this.method1040(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5656.field2114.method2151(true, arg8[var33]).field604) {
                        var32.field6684[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6684[var33] = var51 << 25;
                        } else {
                            var32.field6684[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6685[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6684[var33] = class480.method2717(var56, (byte) -96, method2459(arg6[var33] >> 8, var51), arg10);
                        if (arg7 != null) {
                            var32.field6684[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6686; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5656.field2114.method2151(true, arg8[var35 * 3]).field604) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6681 = new int[var32.field6686];
                }
                if (var34) {
                    var32.field6687 = new short[var32.field6686];
                    var32.field6689 = new short[var32.field6686];
                }
                for (int var36 = 0; var36 < var32.field6686; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6681[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5656.field2114.method2151(true, var42).field604) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5656.field2114.method2151(true, var43).field604) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5656.field2114.method2151(true, var44).field604) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6687[var36] = (short) var44;
                            var32.field6689[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5656.field2114.method2151(true, var45).field604) {
                                    var32.field6684[var37] = class351.field4940[class433.method2528(this.field5656.field2114.method2151(true, var45).field612 & 65535, 15048) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5656.field2114.method2151(true, var46).field604) {
                                    var32.field6684[var38] = class351.field4940[class433.method2528(this.field5656.field2114.method2151(true, var46).field612 & 65535, 15048) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5656.field2114.method2151(true, var47).field604) {
                                    var32.field6684[var39] = class351.field4940[class433.method2528(this.field5656.field2114.method2151(true, var47).field612 & 65535, 15048) & 65535];
                                }
                            }
                            var32.field6687[var36] = -1;
                        }
                    }
                }
                this.field5658[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wp", name = "X", descriptor = "(IILk;)Lk;")
    public final class88 method1035(int arg0, int arg1, class88 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)I")
    private static final int method2459(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!wp", name = "Q", descriptor = "(III)V")
    public final void method1044(int arg0, int arg1, int arg2) {
        if (this.field5662[arg0][arg1] < arg2) {
            this.field5662[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "aa", descriptor = "(II)I")
    public final int method1040(int arg0, int arg1) {
        int var3 = arg0 >> super.field7583;
        int var4 = arg1 >> super.field7583;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field7581 - 1 && var4 <= super.field7585 - 1) {
            int var5 = arg0 & super.field7582 - 1;
            int var6 = arg1 & super.field7582 - 1;
            int var7 = (super.field7582 - var5) * this.field5677[var3][var4] + this.field5677[var3 + 1][var4] * var5 >> super.field7583;
            int var8 = (super.field7582 - var5) * this.field5677[var3][var4 + 1] + this.field5677[var3 + 1][var4 + 1] * var5 >> super.field7583;
            return (super.field7582 - var6) * var7 + var6 * var8 >> super.field7583;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!wp", name = "N", descriptor = "()V")
    public final void method1046() {
        this.field5675 = null;
        this.field5662 = null;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
    public abstract void method883(int arg0, int arg1);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lww;[I)V")
    public final void method1032(class592 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lk;IIIIZ)Z")
    public final boolean method1034(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "(Lk;IIIIZ)V")
    public final void method1041(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
    public final boolean method2460(int arg0) {
        if ((this.field5664 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!wp", name = "ba", descriptor = "(II)I")
    public final int method1031(int arg0, int arg1) {
        return this.field5677[arg0][arg1];
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1045(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class62 var6 = this.field5656.field9369;
        this.field5657 = -1;
        this.field5669 = var6.field856;
        this.field5667 = var6.field855;
        this.field5666 = var6.field851;
        this.field5665 = var6.field849;
        this.field5676 = var6.field853;
        this.field5670 = var6.field852;
        this.field5659 = var6.field857;
        this.field5674 = var6.field858;
        this.field5660 = var6.field854;
        this.field5663 = var6.field859;
        this.field5672 = var6.field848;
        this.field5661 = var6.field850;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Ljba;IIII[[I[[II)V")
    public class412(class647 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field5656 = arg0;
        this.field5664 = arg2;
        this.field5677 = arg5;
        this.field5675 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5656.field9390 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5656.field9392 * var18 + this.field5656.field9371 * var17 + this.field5656.field9366 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5675[var11][var10] = (byte) var20;
            }
        }
        this.field5662 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wp", name = "ya", descriptor = "(Lk;IIIIZ)V")
    public final void method1037(class88 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1047(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5668 == null) {
            this.field5668 = new class531[super.field7581][super.field7585];
            this.field5673 = new class13[super.field7581][super.field7585];
        } else if (this.field5671 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field7582 != var20 || var21 != 0 && super.field7582 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class13 var22 = new class13();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field134 = var23;
            var22.field127 = new short[var23];
            var22.field130 = new short[var23];
            var22.field124 = new short[var23];
            var22.field132 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field127[var25] = (short) (this.field5675[arg0][arg1] - this.field5662[arg0][arg1]);
                } else if (var30 == 0 && super.field7582 == var31) {
                    var22.field127[var25] = (short) (this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]);
                } else if (super.field7582 == var30 && super.field7582 == var31) {
                    var22.field127[var25] = (short) (this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]);
                } else if (super.field7582 == var30 && var31 == 0) {
                    var22.field127[var25] = (short) (this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]) * var30 + (this.field5675[arg0][arg1] - this.field5662[arg0][arg1]) * (super.field7582 - var30);
                    int var33 = (this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]) * var30 + (this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]) * (super.field7582 - var30);
                    var22.field127[var25] = (short) ((super.field7582 - var31) * var32 + var31 * var33 >> super.field7583 * 2);
                }
                int var34 = (arg0 << super.field7583) + var30;
                int var35 = (arg1 << super.field7583) + var31;
                var22.field130[var25] = (short) var30;
                var22.field132[var25] = (short) var31;
                var22.field124[var25] = (short) (this.method1040(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field127[var25] < 2) {
                    var22.field127[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5656.field2114.method2151(true, arg11[var28]).field604) {
                    var26 = true;
                }
            }
            var22.field129 = new int[var27];
            if (arg10 != null) {
                var22.field125 = new int[var27];
            }
            var22.field133 = new short[var27];
            var22.field135 = new short[var27];
            var22.field126 = new short[var27];
            if (var26) {
                var22.field131 = new short[var27];
                var22.field123 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field129[var22.field128] = class433.method2528(arg9[var29], 15048);
                    } else {
                        var22.field129[var22.field128] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field125[var22.field128] = class433.method2528(arg10[var29], 15048);
                        } else {
                            var22.field125[var22.field128] = -1;
                        }
                    }
                    var22.field133[var22.field128] = (short) arg6[var29];
                    var22.field135[var22.field128] = (short) arg7[var29];
                    var22.field126[var22.field128] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5656.field2114.method2151(true, arg11[var29]).field604) {
                            var22.field131[var22.field128] = (short) arg11[var29];
                            var22.field123[var22.field128] = (short) arg12[var29];
                        } else {
                            var22.field131[var22.field128] = -1;
                        }
                    }
                    ++var22.field128;
                }
            }
            this.field5673[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class531 var36 = new class531();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7414 = class494.method2775(class433.method2528(arg10[0], 15048), 31745, this.field5675[arg0][arg1] - this.field5662[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7417 = (byte) (var36.field7417 | 2);
                    }
                }
                if (this.field5677[arg0 + 1][arg1] == this.field5677[arg0][arg1] && this.field5677[arg0 + 1][arg1 + 1] == this.field5677[arg0][arg1] && this.field5677[arg0][arg1 + 1] == this.field5677[arg0][arg1]) {
                    var36.field7417 = (byte) (var36.field7417 | 1);
                }
                if (var38 != -1 && (var36.field7417 & 2) == 0 && !this.field5656.field2114.method2151(true, var38).field604) {
                    var36.field7415 = (short) (this.field5675[arg0][arg1] - this.field5662[arg0][arg1]);
                    var36.field7418 = (short) (this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]);
                    var36.field7419 = (short) (this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]);
                    var36.field7416 = (short) (this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]);
                    var36.field7413 = (short) var38;
                } else {
                    short var39 = class433.method2528(var37, 15048);
                    var36.field7415 = (short) class494.method2775(var39, 31745, this.field5675[arg0][arg1] - this.field5662[arg0][arg1]);
                    var36.field7418 = (short) class494.method2775(var39, 31745, this.field5675[arg0 + 1][arg1] - this.field5662[arg0 + 1][arg1]);
                    var36.field7419 = (short) class494.method2775(var39, 31745, this.field5675[arg0 + 1][arg1 + 1] - this.field5662[arg0 + 1][arg1 + 1]);
                    var36.field7416 = (short) class494.method2775(var39, 31745, this.field5675[arg0][arg1 + 1] - this.field5662[arg0][arg1 + 1]);
                    var36.field7413 = -1;
                }
                this.field5668[arg0][arg1] = var36;
            }
        }
    }
}
