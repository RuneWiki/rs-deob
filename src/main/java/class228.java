import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class228 extends class279 {

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    private int field3677 = 0;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    private int field3682 = 1024;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field3675 = 1024;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    private int field3685 = 0;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    private int field3680 = 409;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field3674 = 1024;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    private int field3689 = 819;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    private int field3693 = 2048;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    private int field3691 = 1024;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    public static int field3676 = 0;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "Z")
    public static boolean field3683 = true;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "I")
    public static int field3686 = 127;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    private int field3671;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Loj;")
    public static class260 field3679;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "Z")
    public static boolean field3687;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILsf;IIZIII)V", line = 4)
    public static final void method1564(int arg0, int arg1, class180 arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field3681++;
        int var9 = arg0 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg2.field2976;
            var11 = arg2.field3006;
        } else {
            var10 = arg2.field3006;
            var11 = arg2.field2976;
        }
        int var12;
        int var13;
        if ((arg3 + var11) > 104) {
            var12 = arg3 + 1;
            var13 = arg3;
        } else {
            var12 = (var11 + 1 >> 1) + arg3;
            var13 = (var11 >> 1) + arg3;
        }
        int var14;
        int var15;
        if (arg1 + var10 <= 104) {
            var14 = (var10 >> 1) + arg1;
            var15 = (var10 + 1 >> 1) + arg1;
        } else {
            var15 = arg1 + 1;
            var14 = arg1;
        }
        int var16 = (arg1 << 7) + (var10 << 6);
        int[][] var17 = class97.field1558[arg8];
        int var18 = (arg3 << 7) + (var11 << 6);
        int var19 = var17[var14][var12] + var17[var15][var13] + var17[var15][var12] + var17[var14][var13] >> 2;
        int var20 = 0;
        if (arg8 != 0) {
            int[][] var21 = class97.field1558[0];
            var20 = var19 - (var21[var14][var13] + var21[var15][var12] + var21[var15][var13] + var21[var14][var12] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg8 < 3) {
            var22 = class97.field1558[arg8 + 1];
        }
        class78 var23 = arg2.method1326(var22, arg5, (class5) null, var18, arg4, false, arg0, var16, 2978, var17, var19);
        class158.method1120(var23.field1241, var16 - arg6, var20, var18 - arg7);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)I", line = 78)
    public static final int method1565(byte arg0) {
        field3684++;
        return arg0 > -102 ? -27 : class26.field344;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILs;)V", line = 119)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field3685 = arg2.method1221(76);
        } else if (arg1 == 1) {
            this.field3682 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field3693 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field3680 = arg2.method1214(-18254);
        } else if (arg1 == 4) {
            this.field3689 = arg2.method1214(-18254);
        } else if (arg1 == 5) {
            this.field3674 = arg2.method1214(-18254);
        } else if (arg1 == 6) {
            this.field3677 = arg2.method1221(125);
        } else if (arg1 == 7) {
            this.field3675 = arg2.method1214(-18254);
        } else if (arg1 == 8) {
            this.field3691 = arg2.method1214(-18254);
        }
        if (arg0 > -125) {
            this.method51(-41, -67, (class170) null);
        }
        field3690++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 198)
    public final void method319(byte arg0) {
        field3678++;
        if (arg0 > -9) {
            this.field3675 = 1;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 209)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)[I", line = 220)
    public final int[] method44(boolean arg0, int arg1) {
        field3692++;
        if (arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (!this.field4781.field354) {
            return var3;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = this.field4781.method172(-4532);
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class56.field835 * this.field3682 >> 12;
        int var15 = class284.field4887 * this.field3680 >> 12;
        int var16 = class284.field4887 * this.field3689 >> 12;
        int var17 = class56.field835 * this.field3693 >> 12;
        if (var16 <= 1) {
            return var7[arg1];
        }
        int var18 = class56.field835 / var14 + 1;
        this.field3671 = class56.field835 / 8 * this.field3674 >> 12;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field3685);
        while (true) {
            while (true) {
                int var22 = class215.method1496(var21, 89, var17 - var14) + var14;
                int var23 = var8 + var22;
                int var24 = var15 + class215.method1496(var21, 85, var16 - var15);
                if (class56.field835 < var23) {
                    var23 = class56.field835;
                    var22 = class56.field835 - var8;
                }
                int var25;
                if (var10) {
                    var25 = 0;
                } else {
                    int[] var26 = var20[var9];
                    int var27 = var9;
                    var25 = var26[2];
                    int var28 = 0;
                    int var29 = var4 + var23;
                    if (var29 < 0) {
                        var29 += class56.field835;
                    }
                    if (var29 > class56.field835) {
                        var29 -= class56.field835;
                    }
                    while (true) {
                        int[] var30 = var20[var27];
                        if (var30[0] <= var29 && var29 <= var30[1]) {
                            if (var9 != var27) {
                                int var31 = var8 + var4;
                                if (var31 < 0) {
                                    var31 += class56.field835;
                                }
                                if (class56.field835 < var31) {
                                    var31 -= class56.field835;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var9 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var9 + var34) % var12];
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
                                            var40 = Math.min(var29, var38);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class56.field835;
                                        }
                                        this.method1567((byte) -56, var25 - var36, var21, var36, var7, var40 - var39, var6 + var39);
                                    }
                                }
                            }
                            var9 = var27;
                            break;
                        }
                        var28++;
                        var27++;
                        if (var12 <= var27) {
                            var27 = 0;
                        }
                    }
                }
                if ((var24 + var25) <= class284.field4887) {
                    var11 = false;
                } else {
                    var24 = class284.field4887 - var25;
                }
                if (class56.field835 == var23) {
                    this.method1567((byte) -56, var24, var21, var25, var7, var22, var5 + var8);
                    if (var11) {
                        return var3;
                    }
                    var10 = false;
                    var11 = true;
                    int[][] var42 = var20;
                    int[] var43 = var19[var13++];
                    var6 = var5;
                    var12 = var13;
                    var20 = var19;
                    var19 = var42;
                    var43[0] = var8;
                    var13 = 0;
                    var8 = 0;
                    var43[2] = var24 + var25;
                    var43[1] = var23;
                    var9 = 0;
                    var5 = class215.method1496(var21, 52, class56.field835);
                    var4 = var5 - var6;
                    int var44 = var4;
                    if (var4 < 0) {
                        var44 = class56.field835 + var4;
                    }
                    if (class56.field835 < var44) {
                        var44 -= class56.field835;
                    }
                    while (true) {
                        int[] var45 = var20[var9];
                        if (var45[0] <= var44 && var44 <= var45[1]) {
                            break;
                        }
                        var9++;
                        if (var9 >= var12) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var13++];
                    var41[1] = var23;
                    var41[0] = var8;
                    var41[2] = var25 + var24;
                    this.method1567((byte) -56, var24, var21, var25, var7, var22, var5 + var8);
                    var8 = var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V", line = 474)
    public static void method1566(int arg0) {
        if (arg0 == -10760) {
            field3679 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BILjava/util/Random;I[[III)V", line = 503)
    private final void method1567(byte arg0, int arg1, Random arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        field3688++;
        int var8 = this.field3691 <= 0 ? 4096 : 4096 - class215.method1496(arg2, 63, this.field3691);
        int var9 = this.field3675 * this.field3671 >> 12;
        int var10 = this.field3671 - (var9 > 0 ? class215.method1496(arg2, 44, var9) : 0);
        if (arg0 != -56) {
            this.method44(true, -69);
        }
        if (class56.field835 <= arg6) {
            arg6 -= class56.field835;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg5 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = arg1 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = arg6 + var17;
            int var19 = arg5 - (var17 * 2);
            int var20 = var16 < var10 ? var16 : var10;
            for (int var21 = 0; var21 < arg1; var21++) {
                int[] var22 = arg4[arg3 + var21];
                if (var21 >= var20) {
                    int var23 = arg1 - (var21 + 1);
                    if (var20 > var23) {
                        int var24 = var8 * var23 / var20;
                        if (this.field3677 == 0) {
                            for (int var25 = 0; var25 < var17; var25++) {
                                int var26 = var8 * var25 / var17;
                                var22[class93.method680(class310.field5270, arg6 + var25)] = var22[class93.method680(class310.field5270, arg5 + arg6 - var25 - 1)] = var24 * var26 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class93.method680(arg6 + var27, class310.field5270)] = var22[class93.method680(class310.field5270, arg5 + arg6 - var27 - 1)] = var28 >= var24 ? var24 : var28;
                            }
                        }
                        if ((var18 + var19) > class56.field835) {
                            int var29 = class56.field835 - var18;
                            class63.method522(var22, var18, var29, var24);
                            class63.method522(var22, 0, var19 - var29, var24);
                        } else {
                            class63.method522(var22, var18, var19, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class93.method680(arg6 + var30, class310.field5270)] = var22[class93.method680(class310.field5270, arg5 + arg6 - var30 - 1)] = var8 * var30 / var17;
                        }
                        if (class56.field835 < (var18 + var19)) {
                            int var31 = class56.field835 - var18;
                            class63.method522(var22, var18, var31, var8);
                            class63.method522(var22, 0, var19 - var31, var8);
                        } else {
                            class63.method522(var22, var18, var19, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var20;
                    if (this.field3677 == 0) {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class93.method680(class310.field5270, arg6 + var33)] = var22[class93.method680(arg5 + arg6 - var33 - 1, class310.field5270)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class93.method680(arg6 + var35, class310.field5270)] = var22[class93.method680(arg5 + arg6 - var35 - 1, class310.field5270)] = var32 <= var36 ? var32 : var36;
                        }
                    }
                    if ((var18 + var19) > class56.field835) {
                        int var37 = class56.field835 - var18;
                        class63.method522(var22, var18, var37, var32);
                        class63.method522(var22, 0, var19 - var37, var32);
                    } else {
                        class63.method522(var22, var18, var19, var32);
                    }
                }
            }
        } else if (class56.field835 >= (arg5 + arg6)) {
            for (int var11 = 0; var11 < arg1; var11++) {
                class63.method522(arg4[arg3 + var11], arg6, arg5, var8);
            }
        } else {
            int var12 = class56.field835 - arg6;
            for (int var13 = 0; var13 < arg1; var13++) {
                int[] var14 = arg4[arg3 + var13];
                class63.method522(var14, arg6, var12, var8);
                class63.method522(var14, 0, arg5 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(Z)I", line = 709)
    public static final int method1568(boolean arg0) {
        field3672++;
        if (!arg0) {
            field3686 = 63;
        }
        if (class123.field2039) {
            return 0;
        } else if (class125.method922((byte) 76)) {
            return field3683 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
