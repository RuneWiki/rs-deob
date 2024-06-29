import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class142 extends class77 {

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Ldc;")
    private class37 field2737 = class164.field3112;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Ldc;")
    private static class37 field2742 = class185.method1233((byte) 86, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Ldc;")
    public static class37 field2738 = field2742;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public int field2734;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Loa;")
    private class153 field2732;

    @OriginalMember(owner = "client!na", name = "Q", descriptor = "[I")
    public static int[] field2745;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[Ljc;")
    public static class100[] field2736;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
    public static final void method987(int arg0, int arg1, boolean arg2) {
        field2740++;
        if (class39.method352(-10924, arg0)) {
            if (arg2) {
                field2742 = null;
            }
            class63.method472(0, class177.field3344[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lce;II)V")
    private final void method988(class28 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2748 = arg0.method215(-1797813752);
        } else if (arg2 == 2) {
            this.field2734 = arg0.method215(arg1 - 1797813757);
        } else if (arg2 == 3) {
            this.field2737 = arg0.method180(2);
        } else if (arg2 == 4) {
            this.field2743 = arg0.method226(arg1 - 30);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method230((byte) -125);
            this.field2732 = new class153(class241.method1576((byte) -26, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method226(arg1 ^ 0x67);
                class54 var7;
                if (arg2 == 5) {
                    var7 = new class222(arg0.method180(arg1 ^ 0x7));
                } else {
                    var7 = new class140(arg0.method226(104));
                }
                this.field2732.method1044(var7, (byte) -14, (long) var6);
            }
        }
        field2749++;
        if (arg1 != 5) {
            method987(-120, 16, false);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lkh;IIIIIIZ)V")
    public static final void method989(class116 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2086.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2086[var9] - class39.field818;
            int var23 = arg0.field2087[var9] - class133.field2466;
            int var24 = arg0.field2082[var9] - class151.field2861;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2084 != null) {
                class116.field2083[var9] = var25;
                class116.field2074[var9] = var28;
                class116.field2076[var9] = var29;
            }
            class116.field2092[var9] = (var25 << 9) / var29 + class169.field3208;
            class116.field2080[var9] = (var28 << 9) / var29 + class169.field3217;
        }
        class169.field3215 = 0;
        int var10 = arg0.field2073.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2073[var11];
            int var13 = arg0.field2081[var11];
            int var14 = arg0.field2072[var11];
            int var15 = class116.field2092[var12];
            int var16 = class116.field2092[var13];
            int var17 = class116.field2092[var14];
            int var18 = class116.field2080[var12];
            int var19 = class116.field2080[var13];
            int var20 = class116.field2080[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class97.field1696 && class12.method81(class76.field1346 + class169.field3208, class73.field1303 + class169.field3217, var18, var19, var20, var15, var16, var17)) {
                    class110.field1920 = arg5;
                    class112.field1969 = arg6;
                }
                if (!arg7) {
                    class169.field3223 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class169.field3209 || var16 > class169.field3209 || var17 > class169.field3209) {
                        class169.field3223 = true;
                    }
                    if (arg0.field2084 == null || arg0.field2084[var11] == -1) {
                        if (arg0.field2075[var11] != 12345678) {
                            class169.method1143(var18, var19, var20, var15, var16, var17, arg0.field2075[var11], arg0.field2090[var11], arg0.field2078[var11]);
                        }
                    } else if (class180.field3358) {
                        int var21 = class169.field3224.method270(arg0.field2084[var11], (byte) 50);
                        class169.method1143(var18, var19, var20, var15, var16, var17, class167.method1122(var21, arg0.field2075[var11]), class167.method1122(var21, arg0.field2090[var11]), class167.method1122(var21, arg0.field2078[var11]));
                    } else if (arg0.field2079) {
                        class169.method1137(var18, var19, var20, var15, var16, var17, arg0.field2075[var11], arg0.field2090[var11], arg0.field2078[var11], class116.field2083[0], class116.field2083[1], class116.field2083[3], class116.field2074[0], class116.field2074[1], class116.field2074[3], class116.field2076[0], class116.field2076[1], class116.field2076[3], arg0.field2084[var11]);
                    } else {
                        class169.method1137(var18, var19, var20, var15, var16, var17, arg0.field2075[var11], arg0.field2090[var11], arg0.field2078[var11], class116.field2083[var12], class116.field2083[var13], class116.field2083[var14], class116.field2074[var12], class116.field2074[var13], class116.field2074[var14], class116.field2076[var12], class116.field2076[var13], class116.field2076[var14], arg0.field2084[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)I")
    public final int method990(byte arg0, int arg1) {
        field2746++;
        if (this.field2732 == null) {
            return this.field2743;
        }
        if (arg0 >= -40) {
            this.method990((byte) -74, -1);
        }
        class140 var3 = (class140) this.field2732.method1047((byte) -114, (long) arg1);
        return var3 == null ? this.field2743 : var3.field2710;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BLce;)V")
    public final void method991(byte arg0, class28 arg1) {
        if (arg0 <= 39) {
            field2742 = null;
        }
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                field2744++;
                return;
            }
            this.method988(arg1, 5, var3);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIII)I")
    public static final int method992(byte arg0, int arg1, int arg2, int arg3) {
        if (arg1 > 243) {
            arg3 >>= 0x4;
        } else if (arg1 > 217) {
            arg3 >>= 0x3;
        } else if (arg1 > 192) {
            arg3 >>= 0x2;
        } else if (arg1 > 179) {
            arg3 >>= 0x1;
        }
        if (arg0 == 69) {
            field2733++;
            return (arg1 >> 1) + (arg2 >> 2 << 10) + (arg3 >> 5 << 7);
        } else {
            return -53;
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2736 = null;
        if (arg0 != 0) {
            field2736 = null;
        }
        field2745 = null;
        field2738 = null;
        field2742 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Ldc;")
    public final class37 method994(int arg0, int arg1) {
        field2747++;
        if (this.field2732 == null) {
            return this.field2737;
        }
        class222 var3 = (class222) this.field2732.method1047((byte) 122, (long) arg0);
        if (arg1 > -81) {
            return null;
        } else if (var3 == null) {
            return this.field2737;
        } else {
            return var3.field4122;
        }
    }
}
