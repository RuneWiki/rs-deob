import java.awt.Font;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class50 extends class27 {

    @OriginalMember(owner = "client!so", name = "N", descriptor = "I")
    private int field739 = 0;

    @OriginalMember(owner = "client!so", name = "W", descriptor = "I")
    private int field748 = 1024;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
    private int field742 = 1024;

    @OriginalMember(owner = "client!so", name = "cb", descriptor = "I")
    private int field754 = 2048;

    @OriginalMember(owner = "client!so", name = "Y", descriptor = "I")
    private int field750 = 819;

    @OriginalMember(owner = "client!so", name = "bb", descriptor = "I")
    private int field753 = 1024;

    @OriginalMember(owner = "client!so", name = "ab", descriptor = "I")
    private int field752 = 409;

    @OriginalMember(owner = "client!so", name = "X", descriptor = "I")
    private int field749 = 0;

    @OriginalMember(owner = "client!so", name = "db", descriptor = "I")
    private int field755 = 1024;

    @OriginalMember(owner = "client!so", name = "V", descriptor = "I")
    public static int field747 = 0;

    @OriginalMember(owner = "client!so", name = "U", descriptor = "Ls;")
    public static class196 field746 = new class196(16);

    @OriginalMember(owner = "client!so", name = "fb", descriptor = "Z")
    public static boolean field757 = true;

    @OriginalMember(owner = "client!so", name = "gb", descriptor = "[I")
    public static int[] field758 = new int[14];

    @OriginalMember(owner = "client!so", name = "jb", descriptor = "[Ljava/lang/String;")
    public static String[] field761 = new String[200];

    @OriginalMember(owner = "client!so", name = "ib", descriptor = "Lbo;")
    public static class16 field760 = new class16();

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!so", name = "eb", descriptor = "Lin;")
    public static class177 field756;

    @OriginalMember(owner = "client!so", name = "Z", descriptor = "Lsg;")
    public static class225 field751;

    @OriginalMember(owner = "client!so", name = "hb", descriptor = "Lp;")
    public static class25 field759;

    @OriginalMember(owner = "client!so", name = "kb", descriptor = "Lp;")
    public static class25 field762;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "Ljava/awt/Font;")
    public static Font field741;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 7)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILh;JZ)V", line = 11)
    public static final void method418(int arg0, int arg1, int arg2, int arg3, class111 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class85 var8 = new class85();
        var8.field1202 = arg4;
        var8.field1207 = arg1 * 128 + 64;
        var8.field1200 = arg2 * 128 + 64;
        var8.field1196 = arg3;
        var8.field1195 = arg5;
        var8.field1206 = arg6;
        if (class302.field4502[arg0][arg1][arg2] == null) {
            class302.field4502[arg0][arg1][arg2] = new class167(arg0, arg1, arg2);
        }
        class302.field4502[arg0][arg1][arg2].field2390 = var8;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[I", line = 34)
    public final int[] method18(int arg0, byte arg1) {
        int[] var3 = this.field375.method2087(-66, arg0);
        field738++;
        if (this.field375.field4382) {
            int[][] var4 = this.field375.method2084(-27062);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class209.field3053 * this.field753 >> 12;
            int var15 = class209.field3053 * this.field754 >> 12;
            int var16 = class184.field2642 * this.field752 >> 12;
            int var17 = class184.field2642 * this.field750 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field736 = class209.field3053 / 8 * this.field748 >> 12;
            int var18 = class209.field3053 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field739);
            label130: while (true) {
                while (true) {
                    int var22 = var14 + class127.method943((byte) -89, var21, var15 - var14);
                    int var23 = var8 + var22;
                    int var24 = class127.method943((byte) -98, var21, var17 - var16) + var16;
                    if (class209.field3053 < var23) {
                        var23 = class209.field3053;
                        var22 = class209.field3053 - var8;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var10;
                        int[] var27 = var20[var10];
                        int var28 = 0;
                        var25 = var27[2];
                        int var29 = var6 + var23;
                        if (var29 < 0) {
                            var29 += class209.field3053;
                        }
                        if (class209.field3053 < var29) {
                            var29 -= class209.field3053;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && var30[1] >= var29) {
                                if (var10 != var26) {
                                    int var31 = var6 + var8;
                                    if (var31 < 0) {
                                        var31 += class209.field3053;
                                    }
                                    if (var31 > class209.field3053) {
                                        var31 -= class209.field3053;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var10 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var10 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[1];
                                            int var38 = var35[0];
                                            int var39;
                                            int var40;
                                            if (var31 < var29) {
                                                var40 = Math.max(var31, var38);
                                                var39 = Math.min(var29, var37);
                                            } else if (var38 == 0) {
                                                var39 = Math.min(var29, var37);
                                                var40 = 0;
                                            } else {
                                                var40 = Math.max(var31, var38);
                                                var39 = class209.field3053;
                                            }
                                            this.method420(var36, var39 - var40, -var36 + var25, var4, 29905, var21, var40 + var7);
                                        }
                                    }
                                }
                                var10 = var26;
                                break;
                            }
                            var28++;
                            var26++;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class184.field2642 >= var24 + var25) {
                        var9 = false;
                    } else {
                        var24 = class184.field2642 - var25;
                    }
                    if (class209.field3053 == var23) {
                        this.method420(var25, var22, var24, var4, arg1 ^ 0xFFFF8B13, var21, var5 + var8);
                        if (var9) {
                            break label130;
                        }
                        var7 = var5;
                        var11 = false;
                        var10 = 0;
                        int[][] var41 = var20;
                        int[] var42 = var19[var13++];
                        var12 = var13;
                        var42[0] = var8;
                        var9 = true;
                        var8 = 0;
                        var13 = 0;
                        var42[1] = var23;
                        var20 = var19;
                        var19 = var41;
                        var42[2] = var24 + var25;
                        var5 = class127.method943((byte) -118, var21, class209.field3053);
                        var6 = var5 - var7;
                        int var43 = var6;
                        if (var6 < 0) {
                            var43 = class209.field3053 + var6;
                        }
                        if (class209.field3053 < var43) {
                            var43 -= class209.field3053;
                        }
                        while (true) {
                            int[] var44 = var20[var10];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            int var10000 = ~var12;
                            var10++;
                            if (var10000 >= ~var10) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var23;
                        var45[0] = var8;
                        var45[2] = var25 + var24;
                        this.method420(var25, var22, var24, var4, 29905, var21, var5 + var8);
                        var8 = var23;
                    }
                }
            }
        }
        if (arg1 != -62) {
            this.method22(43);
        }
        return var3;
    }

    @OriginalMember(owner = "client!so", name = "f", descriptor = "(I)V", line = 278)
    public final void method22(int arg0) {
        field745++;
        if (arg0 >= -63) {
            method421((char) 65482, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ILsb;I)V", line = 318)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field739 = arg1.method1319(255);
        } else if (arg2 == 1) {
            this.field753 = arg1.method1317((byte) 112);
        } else if (arg2 == 2) {
            this.field754 = arg1.method1317((byte) 52);
        } else if (arg2 == 3) {
            this.field752 = arg1.method1317((byte) 34);
        } else if (arg2 == 4) {
            this.field750 = arg1.method1317((byte) 113);
        } else if (arg2 == 5) {
            this.field748 = arg1.method1317((byte) 26);
        } else if (arg2 == 6) {
            this.field749 = arg1.method1319(255);
        } else if (arg2 == 7) {
            this.field742 = arg1.method1317((byte) 86);
        } else if (arg2 == 8) {
            this.field755 = arg1.method1317((byte) 48);
        }
        if (arg0 != -5836) {
            this.method420(-109, 46, -125, (int[][]) ((int[][]) null), 90, (Random) null, -108);
        }
        field740++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIBI)V", line = 388)
    public static final void method419(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class59.field872 = arg5;
        class303.field4530 = arg2;
        class126.field1829 = arg3;
        if (arg4 > -41) {
            field746 = (class196) null;
        }
        class112.field1630 = arg0;
        field743++;
        class145.field2094 = arg1;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III[[IILjava/util/Random;I)V", line = 405)
    private final void method420(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        field737++;
        int var8 = this.field755 <= 0 ? 4096 : 4096 - class127.method943((byte) -118, arg5, this.field755);
        int var9 = this.field742 * this.field736 >> 12;
        int var10 = this.field736 - (var9 <= 0 ? 0 : class127.method943((byte) -114, arg5, var9));
        if (class209.field3053 <= arg6) {
            arg6 -= class209.field3053;
        }
        if (arg4 != 29905) {
            this.field755 = 64;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg1 <= 0) {
                return;
            }
            int var15 = arg2 / 2;
            int var16 = arg1 / 2;
            int var17 = var10 <= var16 ? var10 : var16;
            int var18 = arg1 - (var17 * 2);
            int var19 = arg6 + var17;
            int var20 = var10 > var15 ? var15 : var10;
            for (int var21 = 0; var21 < arg2; var21++) {
                int[] var22 = arg3[arg0 + var21];
                if (var20 <= var21) {
                    int var23 = arg2 - var21 - 1;
                    if (var23 < var20) {
                        int var24 = var8 * var23 / var20;
                        if (this.field749 == 0) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class287.method2076(arg6 + var27, class150.field2180)] = var22[class287.method2076(class150.field2180, arg1 + arg6 - var27 - 1)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var17; var25++) {
                                int var26 = var8 * var25 / var17;
                                var22[class287.method2076(class150.field2180, arg6 + var25)] = var22[class287.method2076(class150.field2180, arg1 + arg6 - var25 - 1)] = var26 >= var24 ? var24 : var26;
                            }
                        }
                        if (class209.field3053 >= (var18 + var19)) {
                            class84.method690(var22, var19, var18, var24);
                        } else {
                            int var29 = class209.field3053 - var19;
                            class84.method690(var22, var19, var29, var24);
                            class84.method690(var22, 0, var18 - var29, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class287.method2076(class150.field2180, arg6 + var30)] = var22[class287.method2076(arg1 + arg6 - var30 - 1, class150.field2180)] = var8 * var30 / var17;
                        }
                        if (class209.field3053 < var18 + var19) {
                            int var31 = class209.field3053 - var19;
                            class84.method690(var22, var19, var31, var8);
                            class84.method690(var22, 0, var18 - var31, var8);
                        } else {
                            class84.method690(var22, var19, var18, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var20;
                    if (this.field749 == 0) {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class287.method2076(class150.field2180, arg6 + var35)] = var22[class287.method2076(arg1 + arg6 - var35 - 1, class150.field2180)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class287.method2076(arg6 + var33, class150.field2180)] = var22[class287.method2076(class150.field2180, arg1 + arg6 - var33 - 1)] = var34 < var32 ? var34 : var32;
                        }
                    }
                    if (class209.field3053 >= (var18 + var19)) {
                        class84.method690(var22, var19, var18, var32);
                    } else {
                        int var37 = class209.field3053 - var19;
                        class84.method690(var22, var19, var37, var32);
                        class84.method690(var22, 0, var18 - var37, var32);
                    }
                }
            }
        } else if (arg1 + arg6 <= class209.field3053) {
            for (int var11 = 0; var11 < arg2; var11++) {
                class84.method690(arg3[arg0 + var11], arg6, arg1, var8);
            }
        } else {
            int var12 = class209.field3053 - arg6;
            for (int var13 = 0; var13 < arg2; var13++) {
                int[] var14 = arg3[arg0 + var13];
                class84.method690(var14, arg6, var12, var8);
                class84.method690(var14, 0, arg1 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(CB)Z", line = 615)
    public static final boolean method421(char arg0, byte arg1) {
        if (arg1 != -119) {
            field751 = (class225) null;
        }
        field744++;
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_';
    }

    @OriginalMember(owner = "client!so", name = "g", descriptor = "(I)V", line = 641)
    public static void method422(int arg0) {
        field759 = null;
        field751 = null;
        field746 = null;
        field760 = null;
        field761 = null;
        field756 = null;
        field762 = null;
        field741 = null;
        if (arg0 != -1) {
            field759 = (class25) null;
        }
        field758 = null;
    }
}
