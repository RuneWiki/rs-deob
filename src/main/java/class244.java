import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class244 extends class128 {

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    private int field3672 = 1024;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    private int field3679 = 819;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    private int field3671 = 1024;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    private int field3680 = 1024;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    private int field3683 = 409;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    private int field3681 = 2048;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    private int field3668 = 0;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    private int field3688 = 1024;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    private int field3686 = 0;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
    public static int field3669 = 0;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field3674;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field3675;

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "Laf;")
    public static class189 field3682;

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 3)
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([[IIILjava/util/Random;III)V", line = 7)
    private final void method1754(int[][] arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 2) {
            method1755(100, 8, 30, -46, -37, -87, (byte) 48, 51, -51);
        }
        int var8 = this.field3672 > 0 ? 4096 - class31.method189(this.field3672, arg6 ^ 0x7E, arg3) : 4096;
        int var9 = this.field3680 * this.field3674 >> 12;
        int var10 = this.field3674 - (var9 > 0 ? class31.method189(var9, 109, arg3) : 0);
        if (class10.field141 <= arg4) {
            arg4 -= class10.field141;
        }
        field3670++;
        if (var10 > 0) {
            if (arg5 <= 0 || arg2 <= 0) {
                return;
            }
            int var11 = arg2 / 2;
            int var12 = arg5 / 2;
            int var13 = var10 > var11 ? var11 : var10;
            int var14 = var12 >= var10 ? var10 : var12;
            int var15 = arg4 + var13;
            int var16 = arg2 - (var13 * 2);
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var18 = arg0[var17 + arg1];
                if (var17 >= var14) {
                    int var19 = arg5 - var17 - 1;
                    if (var19 >= var14) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class229.method1613(arg4 + var20, field3664)] = var18[class229.method1613(field3664, arg2 + arg4 - var20 - 1)] = var8 * var20 / var13;
                        }
                        if ((var15 + var16) > class10.field141) {
                            int var21 = class10.field141 - var15;
                            class86.method514(var18, var15, var21, var8);
                            class86.method514(var18, 0, var16 - var21, var8);
                        } else {
                            class86.method514(var18, var15, var16, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field3686 == 0) {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class229.method1613(arg4 + var23, field3664)] = var18[class229.method1613(arg2 + arg4 - var23 - 1, field3664)] = var22 * var24 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class229.method1613(field3664, arg4 + var25)] = var18[class229.method1613(arg4 + arg2 - var25 - 1, field3664)] = var22 > var26 ? var26 : var22;
                            }
                        }
                        if (class10.field141 < (var15 + var16)) {
                            int var27 = class10.field141 - var15;
                            class86.method514(var18, var15, var27, var22);
                            class86.method514(var18, 0, var16 - var27, var22);
                        } else {
                            class86.method514(var18, var15, var16, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field3686 == 0) {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class229.method1613(arg4 + var29, field3664)] = var18[class229.method1613(field3664, arg2 + arg4 - var29 - 1)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class229.method1613(arg4 + var31, field3664)] = var18[class229.method1613(arg4 + arg2 - var31 - 1, field3664)] = var28 > var32 ? var32 : var28;
                        }
                    }
                    if ((var15 + var16) > class10.field141) {
                        int var33 = class10.field141 - var15;
                        class86.method514(var18, var15, var33, var28);
                        class86.method514(var18, 0, var16 - var33, var28);
                    } else {
                        class86.method514(var18, var15, var16, var28);
                    }
                }
            }
        } else if ((arg2 + arg4) > class10.field141) {
            int var34 = class10.field141 - arg4;
            for (int var35 = 0; var35 < arg5; var35++) {
                int[] var36 = arg0[arg1 + var35];
                class86.method514(var36, arg4, var34, var8);
                class86.method514(var36, 0, arg2 - var34, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg5; var37++) {
                class86.method514(arg0[arg1 + var37], arg4, arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V", line = 205)
    public final void method130(boolean arg0) {
        field3673++;
        if (arg0) {
            this.field3679 = 28;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(BI)[I", line = 216)
    public final int[] method126(byte arg0, int arg1) {
        field3666++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 < 100) {
            this.method130(true);
        }
        if (!this.field1748.field1878) {
            return var3;
        }
        int[][] var4 = this.field1748.method894(false);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = 0;
        boolean var12 = true;
        int var13 = class10.field141 * this.field3671 >> 12;
        int var14 = 0;
        int var15 = class10.field141 * this.field3681 >> 12;
        int var16 = class322.field4940 * this.field3683 >> 12;
        int var17 = class322.field4940 * this.field3679 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field3674 = class10.field141 / 8 * this.field3688 >> 12;
        int var18 = class10.field141 / var13 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field3668);
        while (true) {
            while (true) {
                int var22 = var13 + class31.method189(var15 - var13, -74, var21);
                int var23 = var16 + class31.method189(var17 - var16, -78, var21);
                int var24 = var7 + var22;
                if (class10.field141 < var24) {
                    var22 = class10.field141 - var7;
                    var24 = class10.field141;
                }
                int var25;
                if (var12) {
                    var25 = 0;
                } else {
                    int var26 = var9;
                    int[] var27 = var20[var9];
                    var25 = var27[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class10.field141;
                    }
                    if (var29 > class10.field141) {
                        var29 -= class10.field141;
                    }
                    while (true) {
                        int[] var30 = var20[var26];
                        if (var30[0] <= var29 && var30[1] >= var29) {
                            if (var9 != var26) {
                                int var31 = var5 + var7;
                                if (var31 < 0) {
                                    var31 += class10.field141;
                                }
                                if (class10.field141 < var31) {
                                    var31 -= class10.field141;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var9 + var32) % var14];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var9 + var34) % var14];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class10.field141;
                                        }
                                        this.method1754(var4, var36, var40 - var39, var21, var39 + var8, var25 - var36, 2);
                                    }
                                }
                            }
                            var9 = var26;
                            break;
                        }
                        var28++;
                        int var10000 = ~var14;
                        var26++;
                        if (var10000 >= ~var26) {
                            var26 = 0;
                        }
                    }
                }
                if (var25 + var23 > class322.field4940) {
                    var23 = class322.field4940 - var25;
                } else {
                    var10 = false;
                }
                if (class10.field141 == var24) {
                    this.method1754(var4, var25, var22, var21, var6 + var7, var23, 2);
                    if (var10) {
                        return var3;
                    }
                    var10 = true;
                    var8 = var6;
                    var9 = 0;
                    int[] var42 = var19[var11++];
                    var14 = var11;
                    var12 = false;
                    var42[1] = var24;
                    var42[0] = var7;
                    var7 = 0;
                    var11 = 0;
                    int[][] var43 = var20;
                    var20 = var19;
                    var19 = var43;
                    var42[2] = var23 + var25;
                    var6 = class31.method189(class10.field141, 121, var21);
                    var5 = var6 - var8;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class10.field141 + var5;
                    }
                    if (class10.field141 < var44) {
                        var44 -= class10.field141;
                    }
                    while (true) {
                        int[] var45 = var20[var9];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var9++;
                        if (var14 <= var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var11++];
                    var41[1] = var24;
                    var41[0] = var7;
                    var41[2] = var25 + var23;
                    this.method1754(var4, var25, var22, var21, var7 + var6, var23, 2);
                    var7 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIIBII)V", line = 469)
    public static final void method1755(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        int var9 = arg3 - arg2;
        int var10 = arg5 - arg0;
        int var11 = -71 / ((88 - arg6) / 32);
        field3685++;
        int var12 = (arg8 - arg7 << 16) / var10;
        int var13 = (arg4 - arg1 << 16) / var9;
        class148.method995(arg5, 0, arg3, -127, arg7, arg1, arg0, var12, var13, 0, arg2);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lp;II)V", line = 505)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3668 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field3671 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field3681 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field3683 = arg0.method624(14612);
        } else if (arg1 == 4) {
            this.field3679 = arg0.method624(14612);
        } else if (arg1 == 5) {
            this.field3688 = arg0.method624(14612);
        } else if (arg1 == 6) {
            this.field3686 = arg0.method661(-1);
        } else if (arg1 == 7) {
            this.field3680 = arg0.method624(14612);
        } else if (arg1 == 8) {
            this.field3672 = arg0.method624(14612);
        }
        field3665++;
        if (arg2 > -85) {
            this.field3688 = 74;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ltk;ILjava/awt/Frame;)V", line = 589)
    public static final void method1756(class265 arg0, int arg1, Frame arg2) {
        field3675++;
        while (true) {
            class18 var3 = arg0.method1918(arg2, 10661);
            while (var3.field238 == 0) {
                class81.method485(10L, 1);
            }
            if (var3.field238 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                if (arg1 != -27740) {
                    method1758((String) null, 25);
                }
                return;
            }
            class81.method485(100L, 1);
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(III)V", line = 617)
    public static final void method1757(int arg0, int arg1, int arg2) {
        field3676++;
        class161 var3 = class37.method221((byte) -120, arg0);
        int var4 = var3.field2223;
        int var5 = var3.field2211;
        int var6 = var3.field2218;
        int var7 = class42.field492[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class232.method1640(var4, ~var8 & class121.field1698[var4] | var8 & arg2 << var5, arg1);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 644)
    public static final int method1758(String arg0, int arg1) {
        field3684++;
        if (arg1 > -43) {
            return -53;
        } else if (class334.field5162 == null || arg0.length() == 0) {
            return -1;
        } else {
            for (int var2 = 0; var2 < class334.field5162.field4249; var2++) {
                if (class170.method1106(class334.field5162.field4251[var2], 1, "<br>", " ").equals(arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V", line = 684)
    public static void method1759(byte arg0) {
        if (arg0 <= 45) {
            field3678 = -27;
        }
        field3682 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 711)
    public static final String method1760(int arg0, String arg1) {
        int var2 = arg1.length();
        field3687++;
        byte var3 = 2;
        char[] var4 = new char[var2];
        if (arg0 >= -45) {
            method1759((byte) 43);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class160.method1060((byte) -48, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }
}
