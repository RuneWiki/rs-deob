import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class395 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public int field4965 = 99;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field4974 = -1;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "Z")
    public boolean field4977 = false;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public int field4970 = 2;

    @OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
    public int field4983 = 5;

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
    public int field4988 = -1;

    @OriginalMember(owner = "client!dr", name = "u", descriptor = "Z")
    public boolean field4984 = false;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public int field4971 = -1;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "Z")
    public boolean field4989 = false;

    @OriginalMember(owner = "client!dr", name = "C", descriptor = "Z")
    public boolean field4992 = false;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public int field4972 = -1;

    @OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
    public int field4993 = -1;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field4966;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "Lhl;")
    public class322 field4981;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Ljt;")
    public static class533 field4968;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[I")
    public int[] field4979;

    @OriginalMember(owner = "client!dr", name = "x", descriptor = "[I")
    public static int[] field4987;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "[I")
    public int[] field4991;

    @OriginalMember(owner = "client!dr", name = "E", descriptor = "[I")
    private int[] field4994;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[Z")
    public boolean[] field4964;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "[[I")
    public int[][] field4973;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([IIIIIZILwd;IIZI[III)I")
    public static final int method2116(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class356 arg7, int arg8, int arg9, boolean arg10, int arg11, int[] arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class517.field7067[var15][var35] = 0;
                class470.field5973[var15][var35] = 99999999;
            }
        }
        if (!arg10) {
            method2123(75, 39, (byte) 19);
        }
        field4967++;
        boolean var16;
        if (arg11 == 1) {
            var16 = class308.method1783(arg1, arg7, arg6, arg3, arg14, arg2, arg9, arg13, arg4, (byte) -117, arg8);
        } else if (arg11 == 2) {
            var16 = class531.method2886(arg9, arg3, arg1, arg2, arg6, arg7, arg8, arg13, 4095, arg4, arg14);
        } else {
            var16 = class605.method3314(-28, arg6, arg13, arg11, arg4, arg3, arg2, arg8, arg14, arg9, arg1, arg7);
        }
        int var17 = arg2 - 64;
        int var18 = arg8 - 64;
        int var19 = class190.field2379;
        int var20 = class265.field3372;
        if (!var16) {
            if (!arg5) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg9 - var23; var24 <= (arg9 + var23); var24++) {
                for (int var25 = arg4 - var23; var25 <= (arg4 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class470.field5973[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg9 > var24) {
                            var28 = arg9 - var24;
                        } else if (arg9 + arg6 - 1 < var24) {
                            var28 = var24 + 1 - arg6 - arg9;
                        }
                        int var29 = 0;
                        if (arg4 > var25) {
                            var29 = arg4 - var25;
                        } else if (arg4 + arg1 - 1 < var25) {
                            var29 = var25 + 1 - (arg4 + arg1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class470.field5973[var26][var27] < var22) {
                            var19 = var24;
                            var21 = var30;
                            var22 = class470.field5973[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg2 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        class19.field291[var31] = var19;
        int var37 = var31 + 1;
        class534.field7204[var31] = var20;
        int var32;
        int var33 = var32 = class517.field7067[var19 - var17][var20 - var18];
        while (arg2 != var19 || arg8 != var20) {
            if (var32 != var33) {
                class19.field291[var37] = var19;
                var32 = var33;
                class534.field7204[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class517.field7067[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg12[var34] = class19.field291[var37];
            arg0[var34++] = class534.field7204[var37];
            if (arg12.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
    public static void method2117(byte arg0) {
        field4968 = null;
        int var1 = 82 / ((18 - arg0) / 55);
        field4987 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILes;)V")
    public final void method2118(int arg0, class630 arg1) {
        if (arg0 <= 44) {
            this.field4993 = 70;
        }
        while (true) {
            int var3 = arg1.method3501(-9268);
            if (var3 == 0) {
                field4980++;
                return;
            }
            this.method2121(256, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public final void method2119(int arg0) {
        field4982++;
        if (this.field4974 == -1) {
            if (this.field4964 == null) {
                this.field4974 = 0;
            } else {
                this.field4974 = 2;
            }
        }
        if (arg0 != 2 || this.field4972 != -1) {
            return;
        }
        if (this.field4964 == null) {
            this.field4972 = 0;
        } else {
            this.field4972 = 2;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZI)I")
    public final int method2120(int arg0, int arg1, boolean arg2, int arg3) {
        field4975++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field4979[arg3];
        class662 var8 = null;
        class662 var9 = this.field4981.method1843(var7 >> 16, -127);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field4989 || class426.field5349) && arg1 != -1 && this.field4979.length > arg1) {
            int var11 = this.field4979[arg1];
            var8 = this.field4981.method1843(var11 >> 16, 57);
            var6 = var11 & 0xFFFF;
        }
        if (arg0 != 1024) {
            method2123(-62, 72, (byte) -27);
        }
        if (this.field4977) {
            var5 |= 0x200;
        }
        if (var9.method3731(var10, 0)) {
            var5 |= 0x80;
        }
        if (var9.method3729(var10, (byte) -36)) {
            var5 |= 0x100;
        }
        if (var9.method3732((byte) -101, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3731(var6, 0)) {
                var5 |= 0x80;
            }
            if (var8.method3729(var6, (byte) -92)) {
                var5 |= 0x100;
            }
            if (var8.method3732((byte) -101, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field4994 != null && arg2) {
            if (arg3 < this.field4994.length) {
                int var12 = this.field4994[arg3];
                if (var12 != 65535) {
                    class662 var13 = this.field4981.method1843(var12 >> 16, 91);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3731(var14, 0)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3729(var14, (byte) -118)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3732((byte) -101, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field4989 || class426.field5349) && arg1 != -1 && arg1 < this.field4994.length) {
                int var15 = this.field4994[arg1];
                if (var15 != 65535) {
                    class662 var16 = this.field4981.method1843(var15 >> 16, arg0 ^ 0xFFFFFBA4);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3731(var17, arg0 ^ 0x400)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3729(var17, (byte) -6)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3732((byte) -101, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILes;I)V")
    private final void method2121(int arg0, class630 arg1, int arg2) {
        if (arg2 == 1) {
            int var13 = arg1.method3470(arg0 + 12855);
            this.field4991 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field4991[var14] = arg1.method3470(13111);
            }
            this.field4979 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field4979[var15] = arg1.method3470(13111);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field4979[var16] = (arg1.method3470(13111) << 16) + this.field4979[var16];
            }
        } else if (arg2 == 2) {
            this.field4988 = arg1.method3470(arg0 ^ 0x3237);
        } else if (arg2 == 3) {
            this.field4964 = new boolean[256];
            int var4 = arg1.method3501(-9268);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4964[arg1.method3501(-9268)] = true;
            }
        } else if (arg2 == 5) {
            this.field4983 = arg1.method3501(-9268);
        } else if (arg2 == 6) {
            this.field4971 = arg1.method3470(13111);
        } else if (arg2 == 7) {
            this.field4993 = arg1.method3470(arg0 + 12855);
        } else if (arg2 == 8) {
            this.field4965 = arg1.method3501(-9268);
        } else if (arg2 == 9) {
            this.field4972 = arg1.method3501(-9268);
        } else if (arg2 == 10) {
            this.field4974 = arg1.method3501(-9268);
        } else if (arg2 == 11) {
            this.field4970 = arg1.method3501(arg0 - 9524);
        } else if (arg2 == 12) {
            int var6 = arg1.method3501(-9268);
            this.field4994 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4994[var7] = arg1.method3470(13111);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field4994[var8] += arg1.method3470(13111) << 16;
            }
        } else if (arg2 == 13) {
            int var9 = arg1.method3470(arg0 + 12855);
            this.field4973 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg1.method3501(-9268);
                if (var11 > 0) {
                    this.field4973[var10] = new int[var11];
                    this.field4973[var10][0] = arg1.method3517(-1);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field4973[var10][var12] = arg1.method3470(13111);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field4977 = true;
        } else if (arg2 == 15) {
            this.field4989 = true;
        } else if (arg2 == 16) {
            this.field4992 = true;
        } else if (arg2 == 18) {
            this.field4984 = true;
        }
        if (arg0 != 256) {
            method2123(82, -23, (byte) 49);
        }
        field4986++;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIBIILda;)Lda;")
    public final class474 method2122(int arg0, int arg1, byte arg2, int arg3, int arg4, class474 arg5) {
        field4995++;
        int var7 = this.field4991[arg0];
        int var8 = this.field4979[arg0];
        class662 var9 = this.field4981.method1843(var8 >> 16, -95);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method711((byte) 1, arg1, true);
        }
        class662 var11 = null;
        if (arg2 <= 91) {
            return null;
        }
        if ((this.field4989 || class426.field5349) && arg4 != -1 && arg4 < this.field4979.length) {
            int var12 = this.field4979[arg4];
            var11 = this.field4981.method1843(var12 >> 16, -123);
            arg4 = var12 & 0xFFFF;
        }
        class662 var13 = null;
        class662 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field4994 != null) {
            if (this.field4994.length > arg0) {
                var15 = this.field4994[arg0];
                if (var15 != 65535) {
                    var13 = this.field4981.method1843(var15 >> 16, 84);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field4989 || class426.field5349) && arg4 != -1 && arg4 < this.field4994.length) {
                var16 = this.field4994[arg4];
                if (var16 != 65535) {
                    var14 = this.field4981.method1843(var16 >> 16, 58);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field4977) {
            arg1 |= 0x200;
        }
        if (var9.method3731(var10, 0)) {
            arg1 |= 0x80;
        }
        if (var9.method3729(var10, (byte) -85)) {
            arg1 |= 0x100;
        }
        if (var9.method3732((byte) -101, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3731(var15, 0)) {
                arg1 |= 0x80;
            }
            if (var13.method3729(var15, (byte) -25)) {
                arg1 |= 0x100;
            }
            if (var13.method3732((byte) -101, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3731(arg4, 0)) {
                arg1 |= 0x80;
            }
            if (var11.method3729(arg4, (byte) -79)) {
                arg1 |= 0x100;
            }
            if (var11.method3732((byte) -101, arg4)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3731(var16, 0)) {
                arg1 |= 0x80;
            }
            if (var14.method3729(var16, (byte) -87)) {
                arg1 |= 0x100;
            }
            if (var14.method3732((byte) -101, var16)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class474 var18 = arg5.method711((byte) 1, var17, true);
        var18.method2506(this.field4977, (byte) -11, var9, arg4, var10, var11, arg3 - 1, 0, var7);
        if (var13 != null) {
            var18.method2506(this.field4977, (byte) -11, var13, var16, var15, var14, arg3 - 1, 0, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2123(int arg0, int arg1, byte arg2) {
        field4978++;
        if (arg2 <= 91) {
            method2116(null, 38, 124, 85, 33, false, -38, null, 114, -97, true, 117, null, -17, -74);
        }
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BLda;IIIIII)Lda;")
    public final class474 method2124(byte arg0, class474 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4976++;
        int var9 = this.field4991[arg6];
        int var10 = this.field4979[arg6];
        class662 var11 = this.field4981.method1843(var10 >> 16, arg3 ^ 0x20);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method711(arg0, arg2, true);
        }
        class662 var13 = null;
        if ((this.field4989 || class426.field5349) && arg7 != -1 && arg7 < this.field4979.length) {
            int var14 = this.field4979[arg7];
            var13 = this.field4981.method1843(var14 >> 16, -101);
            arg7 = var14 & 0xFFFF;
        }
        if (this.field4977) {
            arg2 |= 0x200;
        }
        if (var11.method3731(var12, arg3 - 7)) {
            arg2 |= 0x80;
        }
        if (var11.method3729(var12, (byte) -65)) {
            arg2 |= 0x100;
        }
        if (var11.method3732((byte) -101, var12)) {
            arg2 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3731(arg7, 0)) {
                arg2 |= 0x80;
            }
            if (var13.method3729(arg7, (byte) -74)) {
                arg2 |= 0x100;
            }
            if (var13.method3732((byte) -101, arg7)) {
                arg2 |= 0x400;
            }
        }
        int var15 = arg2 | 0x20;
        if (arg3 != 7) {
            this.field4971 = -88;
        }
        class474 var16 = arg1.method711(arg0, var15, true);
        var16.method2506(this.field4977, (byte) -11, var11, arg7, var12, var13, arg5 - 1, arg4, var9);
        return var16;
    }
}
