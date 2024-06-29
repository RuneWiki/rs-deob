import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class176 extends class59 {

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    private int field2888 = 1024;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    private int field2889 = 1024;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field2892 = 0;

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "I")
    private int field2899 = 1024;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    private int field2886 = 1024;

    @OriginalMember(owner = "client!sc", name = "db", descriptor = "I")
    private int field2903 = 0;

    @OriginalMember(owner = "client!sc", name = "fb", descriptor = "I")
    private int field2905 = 409;

    @OriginalMember(owner = "client!sc", name = "gb", descriptor = "I")
    private int field2906 = 819;

    @OriginalMember(owner = "client!sc", name = "bb", descriptor = "I")
    private int field2901 = 2048;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "Lph;")
    public static class229 field2893 = class266.method1858("::mm", 0);

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!sc", name = "ab", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!sc", name = "eb", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!sc", name = "hb", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!sc", name = "ib", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!sc", name = "jb", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "Z")
    public static boolean field2887;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IBLsi;I)Z", line = 7)
    public static final boolean method1264(int arg0, byte arg1, class66 arg2, int arg3) {
        field2902++;
        if (arg1 <= 57) {
            method1267(-33, -42, 57, 99);
        }
        byte[] var4 = arg2.method523(-79, arg3, arg0);
        if (var4 == null) {
            return false;
        } else {
            class300.method2015(var4, 7612);
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V", line = 92)
    public class176() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZIILwa;I)V", line = 32)
    public static final void method1265(int arg0, boolean arg1, int arg2, int arg3, class312 arg4, int arg5) {
        field2896++;
        if (class189.field3063 >= 50 || arg4.field5234 == null || arg2 >= arg4.field5234.length || arg4.field5234[arg2] == null) {
            return;
        }
        int var6 = arg4.field5234[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0xF;
        int var9 = (var6 & 0x79) >> 4;
        if (arg4.field5234[arg2].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field5234[arg2].length);
            if (var10 > 0) {
                var7 = arg4.field5234[arg2][var10];
            }
        }
        if (var8 == 0) {
            if (arg1) {
                class228.method1586(var9, 0, var7, false);
            }
        } else if (class184.field2996 != 0) {
            class262.field4376[class189.field3063] = var7;
            int var11 = 98 % ((-arg0 - 41) / 47);
            class219.field3597[class189.field3063] = var9;
            int var12 = (arg3 - 64) / 128;
            class153.field2484[class189.field3063] = 0;
            class275.field4597[class189.field3063] = null;
            int var13 = (arg5 - 64) / 128;
            class165.field2700[class189.field3063] = (var13 << 16) + ((var12 << 8) + var8);
            class189.field3063++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)V", line = 97)
    public static void method1266(int arg0) {
        field2893 = null;
        if (arg0 != 4) {
            method1266(98);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIII)I", line = 107)
    public static final int method1267(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2909++;
        if (arg1 == var4) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)[I", line = 126)
    public final int[] method63(boolean arg0, int arg1) {
        field2897++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int[][] var4 = this.field846.method386((byte) -28);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class293.field4789 * this.field2901 >> 12;
            int var15 = class241.field3993 * this.field2905 >> 12;
            int var16 = class241.field3993 * this.field2906 >> 12;
            int var17 = class293.field4789 * this.field2899 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            }
            this.field2894 = class293.field4789 / 8 * this.field2888 >> 12;
            int var18 = class293.field4789 / var17 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2892);
            label128: while (true) {
                while (true) {
                    int var22 = var17 + class113.method861(var14 - var17, (byte) -24, var21);
                    int var23 = var8 + var22;
                    int var24 = var15 + class113.method861(var16 - var15, (byte) -24, var21);
                    if (class293.field4789 < var23) {
                        var23 = class293.field4789;
                        var22 = class293.field4789 - var8;
                    }
                    int var25;
                    if (var10) {
                        var25 = 0;
                    } else {
                        int[] var26 = var20[var7];
                        int var27 = var7;
                        var25 = var26[2];
                        int var28 = 0;
                        int var29 = var23 + var5;
                        if (var29 < 0) {
                            var29 += class293.field4789;
                        }
                        if (var29 > class293.field4789) {
                            var29 -= class293.field4789;
                        }
                        while (true) {
                            int[] var30 = var20[var27];
                            if (var29 >= var30[0] && var29 <= var30[1]) {
                                if (var7 != var27) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class293.field4789;
                                    }
                                    if (class293.field4789 < var31) {
                                        var31 -= class293.field4789;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var7 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var7 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[1];
                                            int var38 = var35[0];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var38);
                                                var40 = Math.min(var29, var37);
                                            } else if (var38 == 0) {
                                                var40 = Math.min(var29, var37);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var38);
                                                var40 = class293.field4789;
                                            }
                                            this.method1270(var40 - var39, -var36 + var25, var4, var36, (byte) -118, var21, var11 + var39);
                                        }
                                    }
                                }
                                var7 = var27;
                                break;
                            }
                            var28++;
                            var27++;
                            if (var27 >= var12) {
                                var27 = 0;
                            }
                        }
                    }
                    if (var25 + var24 <= class241.field3993) {
                        var9 = false;
                    } else {
                        var24 = class241.field3993 - var25;
                    }
                    if (class293.field4789 == var23) {
                        this.method1270(var22, var24, var4, var25, (byte) 86, var21, var8 + var6);
                        if (var9) {
                            break label128;
                        }
                        var10 = false;
                        var11 = var6;
                        int[][] var42 = var20;
                        int[] var43 = var19[var13++];
                        var43[2] = var24 + var25;
                        var12 = var13;
                        var43[0] = var8;
                        var43[1] = var23;
                        var9 = true;
                        var20 = var19;
                        var7 = 0;
                        var6 = class113.method861(class293.field4789, (byte) -24, var21);
                        var13 = 0;
                        var8 = 0;
                        var19 = var42;
                        var5 = var6 - var11;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class293.field4789 + var5;
                        }
                        if (class293.field4789 < var44) {
                            var44 -= class293.field4789;
                        }
                        while (true) {
                            int[] var45 = var20[var7];
                            if (var45[0] <= var44 && var45[1] >= var44) {
                                break;
                            }
                            var7++;
                            if (var7 >= var12) {
                                var7 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var19[var13++];
                        var41[1] = var23;
                        var41[0] = var8;
                        var41[2] = var24 + var25;
                        this.method1270(var22, var24, var4, var25, (byte) 83, var21, var6 + var8);
                        var8 = var23;
                    }
                }
            }
        }
        if (!arg0) {
            method1268(-61, false, 99);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZI)V", line = 376)
    public static final void method1268(int arg0, boolean arg1, int arg2) {
        if (class293.field4789 != arg2) {
            class219.field3608 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class219.field3608[var3] = (var3 << 12) / arg2;
            }
            class118.field1981 = arg2 == 64 ? 2048 : 4096;
            class293.field4789 = arg2;
            class4.field51 = arg2 - 1;
        }
        if (class241.field3993 != arg0) {
            if (class293.field4789 == arg0) {
                class269.field4504 = class219.field3608;
            } else {
                class269.field4504 = new int[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    class269.field4504[var4] = (var4 << 12) / arg0;
                }
            }
            class33.field544 = arg0 - 1;
            class241.field3993 = arg0;
        }
        if (!arg1) {
            field2895++;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILgi;)V", line = 422)
    public static final void method1269(int arg0, class306 arg1) {
        arg1.field5115 = arg1.field5153;
        field2908++;
        if (arg1.field5171 == 0) {
            arg1.field5145 = 0;
            return;
        }
        if (arg1.field5136 != -1 && arg1.field5135 == 0) {
            class312 var2 = class53.method362((byte) -110, arg1.field5136);
            if (arg1.field5156 > 0 && var2.field5250 == 0) {
                arg1.field5145++;
                return;
            }
            if (arg1.field5156 <= 0 && var2.field5247 == 0) {
                arg1.field5145++;
                return;
            }
        }
        int var3 = arg1.field5147;
        int var4 = arg1.field5168;
        int var5 = arg1.field5104[arg1.field5171 - 1] * 128 + (arg1.method1457(arg0 - 2047) * 64);
        int var6 = arg1.field5159[arg1.field5171 - 1] * 128 + arg1.method1457(0) * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field5168 = var6;
            arg1.field5147 = var5;
            return;
        }
        if (var5 > var3) {
            if (var6 > var4) {
                arg1.field5163 = 1280;
            } else if (var4 > var6) {
                arg1.field5163 = 1792;
            } else {
                arg1.field5163 = 1536;
            }
        } else if (var3 > var5) {
            if (var4 < var6) {
                arg1.field5163 = 768;
            } else if (var4 > var6) {
                arg1.field5163 = 256;
            } else {
                arg1.field5163 = 512;
            }
        } else if (var6 > var4) {
            arg1.field5163 = 1024;
        } else if (var6 < var4) {
            arg1.field5163 = 0;
        }
        int var7 = arg1.field5163 - arg1.field5122 & arg0;
        int var8 = 4;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var9 = arg1.field5146;
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var9 = arg1.field5142;
        } else if (var7 >= 256 && var7 < 768) {
            var9 = arg1.field5160;
        } else if (var7 >= -768 && var7 <= -256) {
            var9 = arg1.field5161;
        }
        if (var9 == -1) {
            var9 = arg1.field5142;
        }
        arg1.field5115 = var9;
        if (arg1 instanceof class217) {
            var10 = ((class217) arg1).field3559.field5325;
        }
        if (var10) {
            if (arg1.field5163 != arg1.field5122 && arg1.field5118 == -1 && arg1.field5108 != 0) {
                var8 = 2;
            }
            if (arg1.field5171 > 2) {
                var8 = 6;
            }
            if (arg1.field5171 > 3) {
                var8 = 8;
            }
            if (arg1.field5145 > 0 && arg1.field5171 > 1) {
                arg1.field5145--;
                var8 = 8;
            }
        } else {
            if (arg1.field5171 > 1) {
                var8 = 6;
            }
            if (arg1.field5171 > 2) {
                var8 = 8;
            }
            if (arg1.field5145 > 0 && arg1.field5171 > 1) {
                var8 = 8;
                arg1.field5145--;
            }
        }
        if (arg1.field5095[arg1.field5171 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg1.field5142 == arg1.field5115 && arg1.field5101 != -1) {
            arg1.field5115 = arg1.field5101;
        }
        if (var6 > var4) {
            arg1.field5168 += var8;
            if (var6 < arg1.field5168) {
                arg1.field5168 = var6;
            }
        } else if (var4 > var6) {
            arg1.field5168 -= var8;
            if (arg1.field5168 < var6) {
                arg1.field5168 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field5147 += var8;
            if (arg1.field5147 > var5) {
                arg1.field5147 = var5;
            }
        } else if (var5 < var3) {
            arg1.field5147 -= var8;
            if (arg1.field5147 < var5) {
                arg1.field5147 = var5;
            }
        }
        if (arg1.field5147 == var5 && arg1.field5168 == var6) {
            arg1.field5171--;
            if (arg1.field5156 > 0) {
                arg1.field5156--;
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BILhb;)V", line = 627)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field2890++;
        if (arg1 == 0) {
            this.field2892 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field2899 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field2901 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field2905 = arg2.method1161(true);
        } else if (arg1 == 4) {
            this.field2906 = arg2.method1161(true);
        } else if (arg1 == 5) {
            this.field2888 = arg2.method1161(true);
        } else if (arg1 == 6) {
            this.field2903 = arg2.method1178(8);
        } else if (arg1 == 7) {
            this.field2889 = arg2.method1161(true);
        } else if (arg1 == 8) {
            this.field2886 = arg2.method1161(true);
        }
        if (arg0 != 115) {
            this.method67((byte) -46, -79, (class164) null);
        }
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V", line = 734)
    public final void method65(int arg0) {
        if (arg0 < 110) {
            this.field2892 = 73;
        }
        field2904++;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[[IIBLjava/util/Random;I)V", line = 751)
    private final void method1270(int arg0, int arg1, int[][] arg2, int arg3, byte arg4, Random arg5, int arg6) {
        field2898++;
        int var8 = this.field2886 > 0 ? 4096 - class113.method861(this.field2886, (byte) -24, arg5) : 4096;
        int var9 = this.field2894 * this.field2889 >> 12;
        int var10 = this.field2894 - (var9 > 0 ? class113.method861(var9, (byte) -24, arg5) : 0);
        int var11 = 110 / ((48 - arg4) / 32);
        if (arg6 >= class293.field4789) {
            arg6 -= class293.field4789;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg0 <= 0) {
                return;
            }
            int var16 = arg0 / 2;
            int var17 = var10 <= var16 ? var10 : var16;
            int var18 = arg1 / 2;
            int var19 = arg6 + var17;
            int var20 = var18 < var10 ? var18 : var10;
            int var21 = arg0 - var17 * 2;
            for (int var22 = 0; var22 < arg1; var22++) {
                int[] var23 = arg2[arg3 + var22];
                if (var22 >= var20) {
                    int var24 = arg1 - var22 - 1;
                    if (var24 < var20) {
                        int var25 = var8 * var24 / var20;
                        if (this.field2903 == 0) {
                            for (int var28 = 0; var28 < var17; var28++) {
                                int var29 = var8 * var28 / var17;
                                var23[class243.method1696(class4.field51, arg6 + var28)] = var23[class243.method1696(arg0 + arg6 - var28 - 1, class4.field51)] = var25 * var29 >> 12;
                            }
                        } else {
                            for (int var26 = 0; var26 < var17; var26++) {
                                int var27 = var8 * var26 / var17;
                                var23[class243.method1696(arg6 + var26, class4.field51)] = var23[class243.method1696(class4.field51, arg6 + arg0 - var26 - 1)] = var25 > var27 ? var27 : var25;
                            }
                        }
                        if ((var19 + var21) <= class293.field4789) {
                            class42.method315(var23, var19, var21, var25);
                        } else {
                            int var30 = class293.field4789 - var19;
                            class42.method315(var23, var19, var30, var25);
                            class42.method315(var23, 0, var21 - var30, var25);
                        }
                    } else {
                        for (int var31 = 0; var31 < var17; var31++) {
                            var23[class243.method1696(class4.field51, arg6 + var31)] = var23[class243.method1696(arg0 + arg6 - var31 - 1, class4.field51)] = var8 * var31 / var17;
                        }
                        if ((var19 + var21) > class293.field4789) {
                            int var32 = class293.field4789 - var19;
                            class42.method315(var23, var19, var32, var8);
                            class42.method315(var23, 0, var21 - var32, var8);
                        } else {
                            class42.method315(var23, var19, var21, var8);
                        }
                    }
                } else {
                    int var33 = var8 * var22 / var20;
                    if (this.field2903 == 0) {
                        for (int var36 = 0; var36 < var17; var36++) {
                            int var37 = var8 * var36 / var17;
                            var23[class243.method1696(class4.field51, arg6 + var36)] = var23[class243.method1696(arg0 + arg6 - var36 - 1, class4.field51)] = var33 * var37 >> 12;
                        }
                    } else {
                        for (int var34 = 0; var34 < var17; var34++) {
                            int var35 = var8 * var34 / var17;
                            var23[class243.method1696(arg6 + var34, class4.field51)] = var23[class243.method1696(class4.field51, arg6 + arg0 - var34 - 1)] = var33 <= var35 ? var33 : var35;
                        }
                    }
                    if (var19 + var21 <= class293.field4789) {
                        class42.method315(var23, var19, var21, var33);
                    } else {
                        int var38 = class293.field4789 - var19;
                        class42.method315(var23, var19, var38, var33);
                        class42.method315(var23, 0, var21 - var38, var33);
                    }
                }
            }
        } else if (arg0 + arg6 > class293.field4789) {
            int var12 = class293.field4789 - arg6;
            for (int var13 = 0; var13 < arg1; var13++) {
                int[] var14 = arg2[arg3 + var13];
                class42.method315(var14, arg6, var12, var8);
                class42.method315(var14, 0, arg0 - var12, var8);
            }
        } else {
            for (int var15 = 0; var15 < arg1; var15++) {
                class42.method315(arg2[arg3 + var15], arg6, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V", line = 955)
    public static final void method1271(int arg0, int arg1) {
        class170.field2802 = 1;
        field2907++;
        class133.field2154 = null;
        class219.field3596 = 0;
        class124.field2076 = arg1;
        int var2 = 90 % ((arg0 + 19) / 51);
        field2887 = false;
        class245.field4051 = -1;
        class155.field2525 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V", line = 982)
    public static final void method1272(byte arg0) {
        field2884++;
        class321.method2177();
        class238.field3941 = null;
        class262.field4380 = -1;
        class252.method1769((byte) -8);
        class46.field694.method1023(false);
        class255.field4250 = new class58();
        if (arg0 <= 2) {
            field2887 = false;
        }
        ((class17) class310.field5207).method107(false);
        class62.field891 = 0;
        class62.field889 = new class195[255];
        class322.method2200();
        class137.method979();
        class100.method773((byte) 114);
        class154.method1116(-1, false);
        class180.method1283(29379);
        for (int var1 = 0; var1 < 2048; var1++) {
            class209 var2 = class114.field1931[var1];
            if (var2 != null) {
                var2.field3449 = null;
            }
        }
        if (class99.field1675) {
            class137.method988(104, 104);
            class194.method1363();
        }
        class188.method1317(class209.field3442, 32, class48.field704);
        class111.method849(123, class209.field3442);
        if (class169.field2786 == 5) {
            class98.method725(true, class209.field3442);
        }
        if (class169.field2786 == 10) {
            class129.method933(-3, false);
        }
        if (class169.field2786 == 30) {
            class80.method595(25, (byte) -127);
        }
    }
}
