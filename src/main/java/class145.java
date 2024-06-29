import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class145 extends class196 {

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public int field2772 = -1;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "Z")
    public boolean field2774 = true;

    @OriginalMember(owner = "client!q", name = "L", descriptor = "I")
    public int field2776 = -1;

    @OriginalMember(owner = "client!q", name = "K", descriptor = "I")
    public int field2775 = 0;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "Lai;")
    private static class10 field2770 = class44.method278("Loading wordpack )2 ", -114);

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "Lai;")
    public static class10 field2766 = field2770;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Lvb;")
    public static class192 field2777 = new class192();

    @OriginalMember(owner = "client!q", name = "R", descriptor = "J")
    public static long field2782 = 0L;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Lwa;")
    public static class200 field2778;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "Ldh;")
    public static class38 field2767;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "[I")
    public static int[] field2781;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIII)I")
    public static final int method1003(byte arg0, int arg1, int arg2, int arg3) {
        field2771++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg0 >= -72) {
            method1003((byte) -21, 108, 89, 1);
        }
        if (arg3 < 3 && (class185.field3527[1][var5][var4] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var7) * class186.field3556[var6][var5][var4 - -1] + class186.field3556[var6][var5 + 1][var4 + 1] * var7 >> 7;
        int var9 = arg2 & 0x7F;
        int var10 = (128 - var7) * class186.field3556[var6][var5][var4] + class186.field3556[var6][var5 + 1][var4] * var7 >> 7;
        return (128 - var9) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILme;I)V")
    public final void method1004(int arg0, class114 arg1, int arg2) {
        field2780++;
        while (true) {
            int var4 = arg1.method767(true);
            if (var4 == 0) {
                if (arg0 > -87) {
                    field2770 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1008(arg2, arg1, true, var4);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1005(int arg0, int arg1, byte[] arg2, int arg3) {
        field2779++;
        int var4 = -1;
        boolean var5 = true;
        class114 var6 = new class114(arg2);
        if (arg3 < 115) {
            return false;
        }
        label58: while (true) {
            int var7 = var6.method804((byte) -45);
            if (var7 == 0) {
                return var5;
            }
            int var8 = 0;
            var4 += var7;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method804((byte) -61);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var13 + arg1;
                    int var15 = arg0 + var12;
                    int var16 = var6.method767(true) >> 2;
                    if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                        class47 var17 = class184.method1189(var4, 6);
                        if (var16 != 22 || !class126.field2406 || var17.field833 != 0 || var17.field789 == 1 || var17.field824) {
                            if (!var17.method289(-126)) {
                                class83.field1455++;
                                var5 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method804((byte) -67);
                if (var10 == 0) {
                    break;
                }
                var6.method767(true);
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)I")
    private final int method1006(byte arg0, int arg1) {
        field2768++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        if (var3 > var5) {
            var7 = var5;
        }
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        if (arg0 > -98) {
            return -1;
        }
        if (var9 < var7) {
            var7 = var9;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var9 > var11) {
            var11 = var9;
        }
        double var17 = (var7 + var11) / 2.0D;
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (-var7 + var11);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (-var7 + var11) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        int var19 = (int) (var15 * 256.0D);
        int var20 = (int) (var17 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        double var21 = var13 / 6.0D;
        if (var20 > 243) {
            var19 >>= 0x4;
        } else if (var20 > 217) {
            var19 >>= 0x3;
        } else if (var20 > 192) {
            var19 >>= 0x2;
        } else if (var20 > 179) {
            var19 >>= 0x1;
        }
        int var23 = (int) (var21 * 256.0D);
        return (var20 >> 1) + (var19 >> 5 << 7) + (var23 >> 2 << 10);
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
    public static void method1007(int arg0) {
        field2767 = null;
        if (arg0 != -6) {
            return;
        }
        field2766 = null;
        field2778 = null;
        field2770 = null;
        field2777 = null;
        field2781 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILme;ZI)V")
    private final void method1008(int arg0, class114 arg1, boolean arg2, int arg3) {
        field2765++;
        if (arg3 == 1) {
            this.field2775 = this.method1006((byte) -100, arg1.method771(119));
        } else if (arg3 == 2) {
            this.field2776 = arg1.method767(true);
        } else if (arg3 == 3) {
            this.field2776 = arg1.method762((byte) 74);
            if (this.field2776 == 65535) {
                this.field2776 = -1;
            }
        } else if (arg3 == 5) {
            this.field2774 = false;
        } else if (arg3 == 7) {
            this.field2772 = this.method1006((byte) -112, arg1.method771(108));
        } else if (arg3 != 8 && arg3 == 9) {
            arg1.method762((byte) 78);
        }
        if (!arg2) {
            field2781 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILc;Lc;I)Lte;")
    public static final class177 method1009(int arg0, int arg1, class21 arg2, class21 arg3, int arg4) {
        field2773++;
        if (arg0 != -3) {
            method1009(-21, -9, null, null, 14);
        }
        return class169.method1123(arg4, (byte) 104, arg1, arg2) ? class57.method388(arg0 ^ 0x2, arg3.method159((byte) 119, arg1, arg4)) : null;
    }
}
