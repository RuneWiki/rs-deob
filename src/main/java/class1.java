import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 {

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "[I")
    private int[] field66 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "[I")
    private int[] field67 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "[I")
    public int[] field74 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "I")
    private int field71 = 0;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "[I")
    public int[] field77 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "[I")
    public int[] field76 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "[I")
    private int[] field78 = new int[1500];

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "I")
    public static int field63 = 50;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "Ln;")
    public static class26 field68 = class9.method82(255, "Mini)2Game");

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Ln;")
    public static class26 field69 = class9.method82(255, "Switch to ");

    @OriginalMember(owner = "mapview!a", name = "c", descriptor = "Z")
    public static boolean field65 = false;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "Ln;")
    public static class26 field72 = class9.method82(255, "Makeover Mage");

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "[I")
    public static int[] field73;

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "[I")
    public static int[] field75;

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "[Ln;")
    public static class26[] field64;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(B[B)[B", line = 4)
    public static final byte[] method24(byte arg0, byte[] arg1) {
        if (arg0 >= -5) {
            method34(-93);
        }
        class17 var2 = new class17(arg1);
        int var3 = var2.method130(false);
        int var4 = var2.method127(255);
        if (var4 < 0 || class10.field195 != 0 && var4 > class10.field195) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method128(var5, var4, 0, -2);
            return var5;
        } else {
            int var6 = var2.method127(255);
            if (var6 < 0 || class10.field195 != 0 && class10.field195 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class24.method174(var7, var6, arg1, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg1, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIIIII[IZI)V", line = 66)
    private final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, boolean arg8, int arg9) {
        if (arg9 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg9 = 1;
        }
        if (arg9 == 10) {
            arg9 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        int var11 = class12.field213 - arg3;
        if (arg9 == 11) {
            arg9 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg9 == 1) {
            if (arg1 == 0) {
                for (int var18 = 0; var18 < arg6; var18++) {
                    for (int var19 = 0; var19 < arg3; var19++) {
                        if (var19 <= var18) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var16 = arg6 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg3; var17++) {
                        if (var17 <= var16) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var14 = 0; var14 < arg6; var14++) {
                    for (int var15 = 0; var15 < arg3; var15++) {
                        if (var15 >= var14) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var12 = arg6 - 1; var12 >= 0; var12--) {
                    for (int var13 = 0; var13 < arg3; var13++) {
                        if (var13 >= var12) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 2) {
            if (arg1 == 0) {
                for (int var74 = arg6 - 1; var74 >= 0; var74--) {
                    for (int var75 = 0; var75 < arg3; var75++) {
                        if (var74 >> 1 >= var75) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var68 = 0; var68 < arg6; var68++) {
                    for (int var69 = 0; var69 < arg3; var69++) {
                        if (var69 >= var68 << 1) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var70 = 0; var70 < arg6; var70++) {
                    for (int var71 = arg3 - 1; var71 >= 0; var71--) {
                        if (var70 >> 1 >= var71) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var72 = arg6 - 1; var72 >= 0; var72--) {
                    for (int var73 = arg3 - 1; var73 >= 0; var73--) {
                        if (var72 << 1 <= var73) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 3) {
            if (arg1 == 0) {
                for (int var66 = arg6 - 1; var66 >= 0; var66--) {
                    for (int var67 = arg3 - 1; var67 >= 0; var67--) {
                        if (var66 >> 1 >= var67) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var64 = arg6 - 1; var64 >= 0; var64--) {
                    for (int var65 = 0; var65 < arg3; var65++) {
                        if (var65 >= var64 << 1) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var62 = 0; var62 < arg6; var62++) {
                    for (int var63 = 0; var63 < arg3; var63++) {
                        if (var62 >> 1 >= var63) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var60 = 0; var60 < arg6; var60++) {
                    for (int var61 = arg3 - 1; var61 >= 0; var61--) {
                        if (var61 >= var60 << 1) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 == 4) {
            if (arg1 == 0) {
                for (int var52 = arg6 - 1; var52 >= 0; var52--) {
                    for (int var53 = 0; var53 < arg3; var53++) {
                        if (var52 >> 1 <= var53) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 1) {
                for (int var58 = 0; var58 < arg6; var58++) {
                    for (int var59 = 0; var59 < arg3; var59++) {
                        if (var59 <= var58 << 1) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 2) {
                for (int var56 = 0; var56 < arg6; var56++) {
                    for (int var57 = arg3 - 1; var57 >= 0; var57--) {
                        if (var57 >= var56 >> 1) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            } else if (arg1 == 3) {
                for (int var54 = arg6 - 1; var54 >= 0; var54--) {
                    for (int var55 = arg3 - 1; var55 >= 0; var55--) {
                        if (var54 << 1 >= var55) {
                            arg7[arg0] = arg4;
                        } else if (arg8) {
                            arg7[arg0] = arg2;
                        }
                        arg0++;
                    }
                    arg0 += var11;
                }
            }
        } else if (arg9 != 5) {
            if (arg9 == 6) {
                if (arg1 == 0) {
                    for (int var26 = 0; var26 < arg6; var26++) {
                        for (int var27 = 0; var27 < arg3; var27++) {
                            if (arg3 / 2 >= var27) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var24 = 0; var24 < arg6; var24++) {
                        for (int var25 = 0; var25 < arg3; var25++) {
                            if (var24 <= arg6 / 2) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var20 = 0; var20 < arg6; var20++) {
                        for (int var21 = 0; var21 < arg3; var21++) {
                            if (arg3 / 2 <= var21) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var22 = 0; var22 < arg6; var22++) {
                        for (int var23 = 0; var23 < arg3; var23++) {
                            if (arg6 / 2 <= var22) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg9 == 7) {
                if (arg1 == 0) {
                    for (int var42 = 0; var42 < arg6; var42++) {
                        for (int var43 = 0; var43 < arg3; var43++) {
                            if (var43 <= var42 - arg6 / 2) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var28 = arg6 - 1; var28 >= 0; var28--) {
                        for (int var29 = 0; var29 < arg3; var29++) {
                            if (var29 <= var28 - arg6 / 2) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var30 = arg6 - 1; var30 >= 0; var30--) {
                        for (int var31 = arg3 - 1; var31 >= 0; var31--) {
                            if (var30 - arg6 / 2 >= var31) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var32 = 0; var32 < arg6; var32++) {
                        for (int var33 = arg3 - 1; var33 >= 0; var33--) {
                            if (var33 <= var32 - arg6 / 2) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg9 == 8) {
                if (arg1 == 0) {
                    for (int var34 = 0; var34 < arg6; var34++) {
                        for (int var35 = 0; var35 < arg3; var35++) {
                            if (var34 - arg6 / 2 <= var35) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 1) {
                    for (int var36 = arg6 - 1; var36 >= 0; var36--) {
                        for (int var37 = 0; var37 < arg3; var37++) {
                            if (var36 - arg6 / 2 <= var37) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 2) {
                    for (int var38 = arg6 - 1; var38 >= 0; var38--) {
                        for (int var39 = arg3 - 1; var39 >= 0; var39--) {
                            if (var39 >= var38 - arg6 / 2) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
                if (arg1 == 3) {
                    for (int var40 = 0; var40 < arg6; var40++) {
                        for (int var41 = arg3 - 1; var41 >= 0; var41--) {
                            if (var40 - arg6 / 2 <= var41) {
                                arg7[arg0] = arg4;
                            } else if (arg8) {
                                arg7[arg0] = arg2;
                            }
                            arg0++;
                        }
                        arg0 += var11;
                    }
                    return;
                }
            }
            if (arg5 <= 39) {
                this.method38(120, 99, 116, 28, -85, -96, -17, 85, -1.4196061484763571D, -71);
            }
        } else if (arg1 == 0) {
            for (int var50 = arg6 - 1; var50 >= 0; var50--) {
                for (int var51 = arg3 - 1; var51 >= 0; var51--) {
                    if (var51 >= var50 >> 1) {
                        arg7[arg0] = arg4;
                    } else if (arg8) {
                        arg7[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 1) {
            for (int var44 = arg6 - 1; var44 >= 0; var44--) {
                for (int var45 = 0; var45 < arg3; var45++) {
                    if (var44 << 1 >= var45) {
                        arg7[arg0] = arg4;
                    } else if (arg8) {
                        arg7[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 2) {
            for (int var46 = 0; var46 < arg6; var46++) {
                for (int var47 = 0; var47 < arg3; var47++) {
                    if (var46 >> 1 <= var47) {
                        arg7[arg0] = arg4;
                    } else if (arg8) {
                        arg7[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        } else if (arg1 == 3) {
            for (int var48 = 0; var48 < arg6; var48++) {
                for (int var49 = arg3 - 1; var49 >= 0; var49--) {
                    if (var48 << 1 >= var49) {
                        arg7[arg0] = arg4;
                    } else if (arg8) {
                        arg7[arg0] = arg2;
                    }
                    arg0++;
                }
                arg0 += var11;
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ld;I)V", line = 1203)
    public final void method26(class7 arg0, int arg1) {
        class17 var3 = new class17(arg0.method167(class11.field200, class15.field244, -124));
        int var4 = var3.method134((byte) 74);
        int var5 = var3.method134((byte) 35);
        int var6 = var3.method134((byte) 97);
        int var7 = var3.method134((byte) 118);
        int var8 = var3.method134((byte) 81);
        int var9 = var3.method134((byte) 121);
        var3.method133(false);
        class21.field302 = var4 * 64;
        class16.field246 = (var6 - var4) * 64 + 64;
        class11.field207 = var8 * 64 - class21.field302;
        class34.field408 = (var7 + 1 - var5) * 64;
        class7.field164 = var5 * 64;
        class34.field411 = class34.field408 + class7.field164 - var9 * 64;
        this.method28(class16.field246, class34.field408, (byte) -58);
        class17 var10 = new class17(arg0.method167(class35.field423, class15.field244, -126));
        int var11 = var10.method134((byte) 66);
        class28.field368 = new int[var11 - arg1];
        for (int var12 = 0; var12 < var11; var12++) {
            class28.field368[var12 + 1] = var10.method127(255);
        }
        int var13 = var10.method134((byte) 119);
        class6.field146 = new int[var13 + 1];
        for (int var14 = 0; var14 < var13; var14++) {
            class6.field146[var14 + 1] = var10.method127(class9.method83(arg1, -256));
        }
        byte[] var15 = arg0.method167(class8.field167, class15.field244, -128);
        byte[][] var16 = new byte[class16.field246][class34.field408];
        this.method39(var16, var15, arg1 ^ 0xFFFFFFC1);
        byte[] var17 = arg0.method167(class23.field328, class15.field244, -127);
        this.method31(23278, var17);
        byte[] var18 = arg0.method167(class33.field403, class15.field244, -125);
        this.method30(var18, 15358);
        byte[] var19 = arg0.method167(class15.field243, class15.field244, -128);
        mapview.field47 = 0;
        this.method37(false, var19);
        this.method32(true, var16);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IDDD)I", line = 1274)
    private final int method27(int arg0, double arg1, double arg2, double arg3) {
        double var8 = arg3;
        double var10 = arg3;
        double var12 = arg3;
        if (arg1 != 0.0D) {
            double var14;
            if (arg3 < 0.5D) {
                var14 = (arg1 + 1.0D) * arg3;
            } else {
                var14 = arg1 + arg3 - arg1 * arg3;
            }
            double var16 = arg3 * 2.0D - var14;
            double var18 = arg2 + 0.3333333333333333D;
            double var20 = arg2 - 0.3333333333333333D;
            if (var18 > 1.0D) {
                var18--;
            }
            if (var20 < 0.0D) {
                var20++;
            }
            if (var20 * 6.0D < 1.0D) {
                var12 = (var14 - var16) * 6.0D * var20 + var16;
            } else if (var20 * 2.0D < 1.0D) {
                var12 = var14;
            } else if (var20 * 3.0D < 2.0D) {
                var12 = (0.6666666666666666D - var20) * (-var16 + var14) * 6.0D + var16;
            } else {
                var12 = var16;
            }
            if (arg2 * 6.0D < 1.0D) {
                var10 = (var14 - var16) * 6.0D * arg2 + var16;
            } else if (arg2 * 2.0D < 1.0D) {
                var10 = var14;
            } else if (arg2 * 3.0D < 2.0D) {
                var10 = (var14 - var16) * (0.6666666666666666D - arg2) * 6.0D + var16;
            } else {
                var10 = var16;
            }
            if (var18 * 6.0D < 1.0D) {
                var8 = (var14 - var16) * 6.0D * var18 + var16;
            } else if (var18 * 2.0D < 1.0D) {
                var8 = var14;
            } else if (var18 * 3.0D < 2.0D) {
                var8 = (0.6666666666666666D - var18) * (-var16 + var14) * 6.0D + var16;
            } else {
                var8 = var16;
            }
        }
        int var24 = (int) (var10 * 256.0D);
        int var25 = (int) (var8 * 256.0D);
        if (arg0 == -1107) {
            int var26 = (int) (var12 * 256.0D);
            return (var24 << 8) + (var25 << 16) + var26;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIB)V", line = 1373)
    private final void method28(int arg0, int arg1, byte arg2) {
        int var4 = arg0 >> 6;
        int var5 = arg1 >> 6;
        class15.field236[0] = new byte[var5][var4][];
        class15.field236[1] = new byte[var5][var4][];
        class15.field236[2] = new byte[var5][var4][];
        class15.field236[3] = new byte[var5][var4][];
        class15.field236[4] = new byte[var5][var4][];
        class29.field376 = new class9[var5][var4];
        class9.field183 = new class9[var5][var4];
        class4.field105 = new int[var5][var4][];
        int var6 = -92 / ((50 - arg2) / 63);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lda;", line = 1396)
    public static final class8 method29(Throwable arg0, String arg1) {
        class8 var2;
        if (arg0 instanceof class8) {
            var2 = (class8) arg0;
            var2.field173 = var2.field173 + ' ' + arg1;
        } else {
            var2 = new class8(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([BI)V", line = 1411)
    private final void method30(byte[] arg0, int arg1) {
        if (arg1 != 15358) {
            field69 = null;
        }
        int var3 = 0;
        while (true) {
            while (arg0.length > var3) {
                int var4 = (arg0[var3++] & 0xFF) * 64 - class21.field302;
                int var5 = (arg0[var3++] & 0xFF) * 64 - class7.field164;
                if (var4 > 0 && var5 > 0 && class16.field246 > var4 + 64 && var5 + 64 < class34.field408) {
                    class11.field203 = class34.field408 - var5 - 1 >> 6;
                    class8.field174 = var4 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg0[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg0[var3++];
                                class21.method153(class34.field408 - var7 - var5 - 1 - 64, var4 - -var6, 4, 63, var9);
                                if (class9.field183[class11.field203][class8.field174] == null) {
                                    class9.field183[class11.field203][class8.field174] = new class9();
                                    class9.field183[class11.field203][class8.field174].field187 = new byte[4096];
                                }
                                class9.field183[class11.field203][class8.field174].field187[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class9.field183[class11.field203][class8.field174] != null) {
                        class9.field183[class11.field203][class8.field174].method79(127);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg0[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I[B)V", line = 1493)
    private final void method31(int arg0, byte[] arg1) {
        if (arg0 != 23278) {
            field73 = null;
        }
        int var3 = 0;
        while (true) {
            while (var3 < arg1.length) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class21.field302;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class7.field164;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class16.field246 && class34.field408 > var5 + 64) {
                    class8.field174 = var4 >> 6;
                    class11.field203 = class34.field408 - var5 - 1 >> 6;
                    for (int var6 = 0; var6 < 64; var6++) {
                        for (int var7 = -64; var7 < 0; var7++) {
                            int var8 = arg1[var3++] & 0xFF;
                            if (var8 != 0) {
                                byte var9 = arg1[var3++];
                                class21.method153(class34.field408 - var5 - var7 - 64 - 1, var4 + var6, 3, 63, var9);
                                if (class29.field376[class11.field203][class8.field174] == null) {
                                    class29.field376[class11.field203][class8.field174] = new class9();
                                    class29.field376[class11.field203][class8.field174].field187 = new byte[4096];
                                }
                                class29.field376[class11.field203][class8.field174].field187[(-(var7 + 1) << 6) + var6] = (byte) var8;
                            }
                        }
                    }
                    if (class29.field376[class11.field203][class8.field174] != null) {
                        class29.field376[class11.field203][class8.field174].method79(102);
                    }
                } else {
                    for (int var10 = -4096; var10 < 0; var10++) {
                        byte var11 = arg1[var3++];
                        if (var11 != 0) {
                            var3++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z[[B)V", line = 1576)
    private final void method32(boolean arg0, byte[][] arg1) {
        int var3 = class34.field408;
        int var4 = class16.field246;
        int[] var5 = new int[var3];
        for (int var6 = 0; var6 < var3; var6++) {
            var5[var6] = 0;
        }
        if (!arg0) {
            this.method25(-115, -24, -33, -2, -52, 17, -35, null, true, -41);
        }
        for (int var7 = 5; var7 < var4 - 5; var7++) {
            byte[] var8 = arg1[var7 + 5];
            byte[] var9 = arg1[var7 - 5];
            for (int var10 = 0; var10 < var3; var10++) {
                int var11 = class28.field368[var8[var10] & 0xFF];
                int var12 = class28.field368[var9[var10] & 0xFF];
                if (var11 <= 0 && class34.method233(var10, var7 + 5, true) > 0) {
                    var11 = 64;
                }
                if (var12 <= 0 && class34.method233(var10, var7 - 5, arg0) > 0) {
                    var12 = 64;
                }
                var5[var10] += var11 - var12;
            }
            if (var7 > 10 && var7 < var4 - 10) {
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                for (int var16 = 5; var16 < var3 - 5; var16++) {
                    int var17 = var5[var16 - 5];
                    int var18 = var5[var16 + 5];
                    var13 += (var18 >> 20) - (var17 >> 20);
                    var15 += (var18 & 0x3FF) - (var17 & 0x3FF);
                    var14 += (var18 >> 10 & 0x3FF) - ((var17 & 0xFFD10) >> 10);
                    if (var15 > 0) {
                        int var19 = var7 >> 6;
                        int var20 = var16 >> 6;
                        if (class4.field105[var20][var19] == null) {
                            class4.field105[var20][var19] = new int[4096];
                        }
                        if ((arg1[var7][var16] & 0xFF) > 0) {
                            class4.field105[var20][var19][(mapview.method15(var16, 63) << 6) + mapview.method15(63, var7)] = this.method27(-1107, (double) var14 / 8533.0D, (double) var13 / 8533.0D, (double) var15 / 8533.0D);
                        } else {
                            class4.field105[var20][var19][mapview.method15(var7, 63) + mapview.method15(var16 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIIIIIIIII)V", line = 1694)
    public final void method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (this.field71 == 0) {
            int var12 = arg4 - arg2;
            int var13 = arg8 - arg9;
            int var14 = (arg6 - arg1 << 16) / var13;
            int var15 = (arg7 - arg5 << 16) / var12;
            for (int var16 = 0; var16 < var12; var16++) {
                int var17 = var15 * var16 >> 16;
                int var18 = (var16 + 1) * var15 >> 16;
                int var19 = var18 - var17;
                if (var19 > 0) {
                    class36.method241(arg2 + var16, (byte) -115, arg9);
                    for (int var20 = 0; var20 < var13; var20++) {
                        int var21 = var14 * var20 >> 16;
                        int var22 = (var20 + 1) * var14 >> 16;
                        int var23 = var22 - var21;
                        if (var23 > 0) {
                            int var24 = class7.method74(0) & 0xFF;
                            if (var24 != 0) {
                                this.field66[this.field71] = var24 - 1;
                                this.field78[this.field71] = var19 / 2 + var17;
                                this.field67[this.field71] = var21 + var23 / 2;
                                this.field71++;
                            }
                        }
                        class17.method126((byte) -127);
                    }
                }
            }
        }
        if (arg10 != -19) {
            field68 = null;
        }
        for (int var25 = 0; var25 < this.field71; var25++) {
            if (class17.field256[this.field66[var25]] != null) {
                class17.field256[this.field66[var25]].method108(this.field78[var25] - 7, this.field67[var25] + -7);
            }
        }
        if (arg0 > 0) {
            for (int var26 = 0; var26 < this.field71; var26++) {
                if (this.field66[var26] == arg3) {
                    class17.field256[this.field66[var26]].method108(this.field78[var26] - 7, this.field67[var26] + -7);
                    if (arg0 % 10 < 5) {
                        class12.method96(this.field78[var26], this.field67[var26], 15, 16776960, 128);
                        class12.method96(this.field78[var26], this.field67[var26], 7, 16777215, 256);
                    }
                }
            }
        }
        this.field71 = 0;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I)V", line = 1806)
    public static void method34(int arg0) {
        if (arg0 != 64) {
            method29(null, null);
        }
        field64 = null;
        field73 = null;
        field75 = null;
        field68 = null;
        field72 = null;
        field69 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIBIIIIII)V", line = 1827)
    public final void method35(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field71 = 0;
        int var10 = arg3 - arg4;
        int var11 = (arg7 - arg5 << 16) / var10;
        int var12 = arg8 - arg6;
        if (arg2 != 12) {
            field69 = null;
        }
        int var13 = (arg1 - arg0 << 16) / var12;
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                class36.method241(var14 + arg4, (byte) -115, arg6);
                for (int var18 = 0; var18 < var12; var18++) {
                    int var19 = var13 * var18 >> 16;
                    int var20 = (var18 + 1) * var13 >> 16;
                    int var21 = var20 - var19;
                    if (var21 > 0) {
                        int var22 = mapview.method22(false) & 0xFF;
                        if (var22 != 0) {
                            int var23;
                            if (var17 == 1) {
                                var23 = var16;
                            } else {
                                var23 = var15 - 1;
                            }
                            int var24;
                            if (var21 == 1) {
                                var24 = var19;
                            } else {
                                var24 = var20 - 1;
                            }
                            int var25 = 13421772;
                            if (var22 >= 5 && var22 <= 8 || var22 >= 13 && var22 <= 16 || var22 >= 21 && var22 <= 24 || var22 == 27 || var22 == 28) {
                                var25 = 13369344;
                                var22 -= 4;
                            }
                            if (var22 == 1) {
                                class12.method92(var16, var19, var21, var25);
                            } else if (var22 == 2) {
                                class12.method98(var16, var19, var17, var25);
                            } else if (var22 == 3) {
                                class12.method92(var23, var19, var21, var25);
                            } else if (var22 == 4) {
                                class12.method98(var16, var24, var17, var25);
                            } else if (var22 == 9) {
                                class12.method92(var16, var19, var21, 16777215);
                                class12.method98(var16, var19, var17, var25);
                            } else if (var22 == 10) {
                                class12.method92(var23, var19, var21, 16777215);
                                class12.method98(var16, var19, var17, var25);
                            } else if (var22 == 11) {
                                class12.method92(var23, var19, var21, 16777215);
                                class12.method98(var16, var24, var17, var25);
                            } else if (var22 == 12) {
                                class12.method92(var16, var19, var21, 16777215);
                                class12.method98(var16, var24, var17, var25);
                            } else if (var22 == 17) {
                                class12.method98(var16, var19, 1, var25);
                            } else if (var22 == 18) {
                                class12.method98(var23, var19, 1, var25);
                            } else if (var22 == 19) {
                                class12.method98(var23, var24, 1, var25);
                            } else if (var22 == 20) {
                                class12.method98(var16, var24, 1, var25);
                            } else if (var22 == 25) {
                                for (int var27 = 0; var27 < var21; var27++) {
                                    class12.method98(var16 + var27, var24 - var27, 1, var25);
                                }
                            } else if (var22 == 26) {
                                for (int var26 = 0; var26 < var21; var26++) {
                                    class12.method98(var16 + var26, var19 + var26, 1, var25);
                                }
                            }
                        }
                        int var28 = class7.method74(arg2 ^ 0xC) & 0xFF;
                        if (var28 != 0) {
                            this.field66[this.field71] = var28 - 1;
                            this.field78[this.field71] = var16 + var17 / 2;
                            this.field67[this.field71] = var21 / 2 + var19;
                            this.field71++;
                        }
                    }
                    class17.method126((byte) 81);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIIIBIII)V", line = 2007)
    public final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        int var10 = -104 / ((arg5 - 4) / 46);
        int var11 = arg1 - arg8;
        int var12 = (arg0 - arg2 << 16) / var11;
        int var13 = arg3 - arg6;
        int var14 = (arg7 - arg4 << 16) / var13;
        for (int var15 = 0; var15 < var13; var15++) {
            int var16 = var14 * var15 >> 16;
            int var17 = (var15 + 1) * var14 >> 16;
            int var18 = var17 - var16;
            if (var18 > 0) {
                int var19 = arg4 + var17;
                class36.method241(arg6 + var15, (byte) -115, arg8);
                int var20 = arg4 + var16;
                for (int var21 = 0; var21 < var11; var21++) {
                    int var22 = var12 * var21 >> 16;
                    int var23 = (var21 + 1) * var12 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = arg2 + var22;
                        int var26 = arg2 + var23;
                        int var27 = class28.method205(-111);
                        int var28 = class16.method119(255);
                        if (var27 == 0 && var28 == 0) {
                            class12.method95(var20, var25, var19 - var20, -var25 + var26, class19.method140((byte) 17));
                        } else {
                            byte var29 = class5.method60((byte) -94);
                            int var30 = var29 & 0xFC;
                            if (var30 == 0 || var18 <= 1 || var24 <= 1) {
                                class12.method95(var20, var25, var18, var24, var27);
                            } else {
                                this.method25(class12.field213 * var25 + var20, var29 & 0x3, class19.method140((byte) 17), var18, var27, 70, var24, class12.field212, true, var30 >> 2);
                            }
                            if (var28 > 0) {
                                byte var31 = class33.method227((byte) -107);
                                int var32 = var31 & 0xFC;
                                if (var32 == 0 || var18 <= 1 || var24 <= 1) {
                                    class12.method95(var20, var25, var18, var24, var28);
                                }
                                this.method25(class12.field213 * var25 + var20, var31 & 0x3, class19.method140((byte) 17), var18, var28, 84, var24, class12.field212, var27 == 0, var32 >> 2);
                            }
                        }
                    }
                    class17.method126((byte) 125);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z[B)V", line = 2101)
    private final void method37(boolean arg0, byte[] arg1) {
        if (arg0) {
            this.method26(null, -23);
        }
        int var3 = 0;
        while (true) {
            while (arg1.length > var3) {
                int var4 = (arg1[var3++] & 0xFF) * 64 - class21.field302;
                int var5 = (arg1[var3++] & 0xFF) * 64 - class7.field164;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class16.field246 && var5 + 64 < class34.field408) {
                    for (int var6 = 0; var6 < 64; var6++) {
                        int var7 = class34.field408 - var5 - 1;
                        for (int var8 = -64; var8 < 0; var8++) {
                            while (true) {
                                int var9 = arg1[var3++] & 0xFF;
                                if (var9 == 0) {
                                    break;
                                }
                                if (var9 < 29) {
                                    class21.method153(class34.field408 - var5 - var8 - 64 - 1, var4 + var6, 0, 63, (byte) var9);
                                } else if (var9 >= 160) {
                                    class21.method153(class34.field408 - var8 - var5 - 1 - 64, var4 + var6, 2, 63, (byte) (var9 - 159));
                                    if (mapview.field47 >= 1500) {
                                        break;
                                    }
                                    this.field74[mapview.field47] = var4 + var6;
                                    this.field77[mapview.field47] = var7;
                                    this.field76[mapview.field47] = var9 - 160;
                                    mapview.field47++;
                                } else {
                                    class21.method153(class34.field408 - var5 - var8 - 64 - 1, var4 + var6, 1, 63, (byte) (var9 - 28));
                                }
                            }
                            var7--;
                        }
                    }
                } else {
                    for (int var10 = 0; var10 < 64; var10++) {
                        byte var12;
                        for (int var11 = -64; var11 < 0; var11++) {
                            do {
                                var12 = arg1[var3++];
                            } while (var12 != 0);
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IIIIIIIIDI)V", line = 2210)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8, int arg9) {
        if (arg4 != 50) {
            this.method27(102, -0.7246015157496312D, -0.9235962647837218D, 0.598263574981185D);
        }
        int var12 = arg0 - arg9;
        int var13 = arg7 - arg5;
        int var14 = (arg2 - arg3 << 16) / var13;
        int var15 = (arg6 - arg1 << 16) / var12;
        if (arg0 - arg9 > -arg1 + arg6) {
            return;
        }
        this.field71 = 0;
        for (int var16 = 0; var16 < var12; var16++) {
            int var17 = var15 * var16 >> 16;
            int var18 = (var16 + 1) * var15 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                class36.method241(arg9 + var16, (byte) -115, arg5);
                for (int var20 = 0; var20 < var13; var20++) {
                    int var21 = var14 * var20 >> 16;
                    int var22 = (var20 + 1) * var14 >> 16;
                    int var23 = var22 - var21;
                    if (var23 > 0) {
                        int var24 = class23.method169((byte) -99) & 0xFF;
                        if (var24 != 0) {
                            if (var24 == 47 || var24 == 53) {
                                if (!(arg8 < 4.0D) && arg8 > 4.2D && arg8 > 6.2D) {
                                }
                                class6.field153[var24 - 1].method224(var17, var21, var19 * 2 + 1, var23 * 2 + 1);
                            } else {
                                class6.field153[var24 - 1].method224(var17 - var19 / 2, -(var23 / 2) + var21, var19 * 2, var23 * 2);
                            }
                        }
                    }
                    class17.method126((byte) 122);
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([[B[BI)V", line = 2348)
    private final void method39(byte[][] arg0, byte[] arg1, int arg2) {
        int var4 = 0;
        int var5 = 89 / ((-arg2 - 28) / 54);
        while (true) {
            while (arg1.length > var4) {
                int var6 = (arg1[var4++] & 0xFF) * 64 - class21.field302;
                int var7 = (arg1[var4++] & 0xFF) * 64 - class7.field164;
                if (var6 > 0 && var7 > 0 && var6 + 64 < class16.field246 && var7 + 64 < class34.field408) {
                    for (int var8 = 0; var8 < 64; var8++) {
                        byte[] var9 = arg0[var8 + var6];
                        int var10 = class34.field408 - var7 - 1;
                        for (int var11 = -64; var11 < 0; var11++) {
                            var9[var10--] = arg1[var4++];
                        }
                    }
                } else {
                    var4 += 4096;
                }
            }
            return;
        }
    }
}
