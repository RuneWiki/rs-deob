import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class263 extends Canvas {

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field3530;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "Lik;")
    public static class410 field3531 = new class410(256);

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3534 = new String[100];

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3538 = "Allocating memory";

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Lac;")
    public static class216 field3537;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "[[B")
    public static byte[][] field3536;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIILpe;I[BZ[Loa;I)[I")
    public static final int[] method1691(int arg0, int arg1, int arg2, int arg3, class391 arg4, int arg5, byte[] arg6, boolean arg7, class151[] arg8, int arg9) {
        field3535++;
        if (!arg7) {
            for (int var10 = 0; var10 < 4; var10++) {
                class151 var11 = arg8[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg0 + var12;
                        int var15 = arg5 + var13;
                        if (var14 >= 0 && var14 < class116.field1621 && var15 >= 0 && class385.field5425 > var15) {
                            var11.method1158(var15, true, var14);
                        }
                    }
                }
            }
        }
        class289 var16 = new class289(arg6);
        int var17 = arg9 + arg0;
        int var18 = arg3 + arg5;
        for (int var19 = 0; var19 < arg2; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class180.method1327(var55 + arg0, 0, arg5 + var56, 0, var18 + var56, var16, 0, arg7, false, var17 + var55, false, var19);
                }
            }
        }
        if (arg1 != -12618) {
            field3537 = null;
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3938 < var16.field3882.length) {
            int var22 = var16.method1861((byte) -72);
            if (var22 == 128) {
                class334.field4534[0] = var16.method1853(-80);
                class334.field4534[1] = var16.method1833(arg1 + 12739);
                class334.field4534[2] = var16.method1833(class331.method2109(arg1, -12665));
                class334.field4534[3] = var16.method1833(87);
                var20 = true;
                class334.field4534[4] = var16.method1853(106);
            } else {
                if (var22 != 129) {
                    var16.field3938--;
                    break;
                }
                if (class438.field6281 == null) {
                    class438.field6281 = new byte[4][][];
                }
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method1868((byte) -122);
                    if (var41 == 0 && class438.field6281[var40] != null) {
                        int var42 = arg0;
                        int var43 = arg0 + 64;
                        int var44 = arg5;
                        if (arg5 < 0) {
                            var44 = 0;
                        } else if (arg5 >= class385.field5425) {
                            var44 = class385.field5425;
                        }
                        int var45 = arg5 + 64;
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 >= class116.field1621) {
                            var43 = class116.field1621;
                        }
                        if (arg0 < 0) {
                            var42 = 0;
                        } else if (arg0 >= class116.field1621) {
                            var42 = class116.field1621;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (class385.field5425 <= var45) {
                            var45 = class385.field5425;
                        }
                        while (var43 > var42) {
                            while (var45 > var44) {
                                class438.field6281[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class438.field6281[var40] == null) {
                            class438.field6281[var40] = new byte[class116.field1621 + 1][class385.field5425 + 1];
                        }
                        for (int var46 = 0; var46 < 64; var46 += 4) {
                            for (int var47 = 0; var47 < 64; var47 += 4) {
                                byte var48 = var16.method1868((byte) -127);
                                for (int var49 = var46 + arg0; var49 < (var46 - (-arg0 - 4)); var49++) {
                                    for (int var50 = arg5 + var47; var50 < var47 + arg5 + 4; var50++) {
                                        if (var49 >= 0 && class116.field1621 > var49 && var50 >= 0 && class385.field5425 > var50) {
                                            class438.field6281[var40][var49][var50] = var48;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class438.field6281[var40] == null) {
                            class438.field6281[var40] = new byte[class116.field1621 + 1][class385.field5425 + 1];
                        }
                        if (var40 > 0) {
                            int var51 = arg0;
                            int var52 = arg0 + 64;
                            int var53 = arg5;
                            int var54 = arg5 + 64;
                            if (arg0 < 0) {
                                var51 = 0;
                            } else if (arg0 >= class116.field1621) {
                                var51 = class116.field1621;
                            }
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (class116.field1621 <= var52) {
                                var52 = class116.field1621;
                            }
                            if (arg5 < 0) {
                                var53 = 0;
                            } else if (arg5 >= class385.field5425) {
                                var53 = class385.field5425;
                            }
                            if (var54 < 0) {
                                var54 = 0;
                            } else if (var54 >= class385.field5425) {
                                var54 = class385.field5425;
                            }
                            while (var51 < var52) {
                                while (var54 > var53) {
                                    class438.field6281[var40][var51][var53] = class438.field6281[var40 - 1][var51][var53];
                                    var53++;
                                }
                                var51++;
                            }
                        }
                    }
                }
                var21 = true;
            }
        }
        if (!arg7) {
            class116 var23 = null;
            while (true) {
                while (var16.field3938 < var16.field3882.length) {
                    int var28 = var16.method1861((byte) -72);
                    if (var28 == 0) {
                        var23 = new class116(var16);
                    } else if (var28 == 1) {
                        int var29 = var16.method1861((byte) -72);
                        if (var29 > 0) {
                            for (int var30 = 0; var30 < var29; var30++) {
                                class21 var31 = new class21(var16);
                                if (var31.field391 == 31) {
                                    class414 var32 = class73.method636(var16.method1853(116), (byte) -75);
                                    var31.method275(var32.field5794, var32.field5785, var32.field5797, var32.field5784, -28022);
                                }
                                var31.field3618 += arg0 << 7;
                                var31.field3620 += arg5 << 7;
                                int var33 = var31.field3618 >> 7;
                                int var34 = var31.field3620 >> 7;
                                if (var33 >= 0 && var34 >= 0 && var33 < class116.field1621 && var34 < class385.field5425) {
                                    var31.field3622 = class44.field703[var31.field389][var33][var34] - var31.field3622;
                                    if (arg4.method199() > 0) {
                                        class118.method941(var31);
                                    }
                                }
                            }
                        }
                    } else if (var28 == 2) {
                        if (var23 == null) {
                            var23 = new class116();
                        }
                        var23.method932(var16, false);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        for (int var25 = 0; var25 < 8; var25++) {
                            int var26 = (arg0 >> 3) + var24;
                            int var27 = (arg5 >> 3) + var25;
                            if (var26 >= 0 && var26 < class116.field1621 >> 3 && var27 >= 0 && var27 < (class385.field5425 >> 3)) {
                                class344.method2181(var23, var27, (byte) 97, var26);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class438.field6281 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class438.field6281[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg0 >> 2) + var36;
                            int var39 = (arg5 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class438.field6281[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class334.field4534;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3529++;
        this.field3530.update(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3533++;
        this.field3530.paint(arg0);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public static void method1692(boolean arg0) {
        if (arg0) {
            field3538 = null;
        }
        field3534 = null;
        field3537 = null;
        field3531 = null;
        field3538 = null;
        field3536 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)Lbn;")
    public static final class155 method1693(int arg0, int arg1) {
        field3527++;
        class155 var2 = (class155) field3531.method2537(-90, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3252.method2633(arg0, arg1 ^ 0xFFFFFFE5, arg1);
        class155 var4 = new class155();
        if (var3 != null) {
            var4.method1189(new class289(var3), (byte) -126);
        }
        field3531.method2542(var4, (byte) 120, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static final void method1694(int arg0) {
        field3528++;
        if (class193.field2775 != null) {
            return;
        }
        class193.field2775 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        if (arg0 != 26) {
            method1693(22, 40);
        }
        while (var3 < 65536) {
            double var4 = (double) ((var3 & 0xFEB7) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + var34 + (var33 << 8);
            class193.field2775[var3] = var35;
            var3++;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(III)V")
    public static final void method1695(int arg0, int arg1, int arg2) {
        for (int var3 = arg0; var3 >= 0; var3--) {
            if (class118.field1653[var3][arg1][arg2] == null) {
                class118.field1653[var3][arg1][arg2] = new class224(var3, arg1, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)I")
    public static final int method1696(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 68) {
            method1691(34, 17, 0, -106, (class391) null, 115, (byte[]) null, false, (class151[]) null, 74);
        }
        if (arg3 > 243) {
            arg0 >>= 0x4;
        } else if (arg3 > 217) {
            arg0 >>= 0x3;
        } else if (arg3 > 192) {
            arg0 >>= 0x2;
        } else if (arg3 > 179) {
            arg0 >>= 0x1;
        }
        field3532++;
        return (arg2 >> 2 << 10) - (-(arg0 >> 5 << 7) - (arg3 >> 1));
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class263(Component arg0) {
        this.field3530 = arg0;
    }
}
