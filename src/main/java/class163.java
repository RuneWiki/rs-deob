import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class163 extends class127 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!gl", name = "v", descriptor = "Lvf;")
    public static class265 field2963 = null;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Ldg;")
    public static class276 field2958 = new class276(64);

    @OriginalMember(owner = "client!gl", name = "A", descriptor = "Lvf;")
    public static class265 field2968 = class87.method582(-46, "Fps:");

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "Lvf;")
    public static class265 field2974 = class87.method582(-46, " (X");

    @OriginalMember(owner = "client!gl", name = "D", descriptor = "[Lvf;")
    public static class265[] field2971 = new class265[5];

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!gl", name = "y", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!gl", name = "E", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!gl", name = "C", descriptor = "Lgk;")
    public static class6 field2970;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field2960;

    @OriginalMember(owner = "client!gl", name = "x", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field2965;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIIIIBZIII)Z")
    public static final boolean method1075(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, boolean arg9, int arg10, int arg11, int arg12) {
        if (arg8 != 125) {
            return false;
        } else {
            for (int var13 = 0; ~var13 > -105; ++var13) {
                for (int var40 = 0; var40 < 104; ++var40) {
                    class93.field1657[var13][var40] = 0;
                    class258.field4444[var13][var40] = 99999999;
                }
            }
            int var14 = arg3;
            ++field2964;
            int var15 = arg2;
            byte var16 = 0;
            int var17 = 0;
            class93.field1657[arg3][arg2] = 99;
            class258.field4444[arg3][arg2] = 0;
            boolean var18 = false;
            class8.field268[var16] = arg3;
            int var41 = var16 + 1;
            class80.field1513[var16] = arg2;
            int[][] var19 = class130.field2279[class216.field3902].field4422;
            label372: while (~var41 != ~var17) {
                var14 = class8.field268[var17];
                var15 = class80.field1513[var17];
                var17 = var17 - -1 & 4095;
                if (~arg5 == ~var14 && arg12 == var15) {
                    var18 = true;
                    break;
                }
                if (~arg11 != -1) {
                    if ((~arg11 > -6 || arg11 == 10) && class130.field2279[class216.field3902].method1684(arg11 - 1, var14, arg12, (byte) 5, var15, arg4, arg5, arg10)) {
                        var18 = true;
                        break;
                    }
                    if (arg11 < 10 && class130.field2279[class216.field3902].method1688(var15, var14, arg10, arg12, arg11 - 1, (byte) -121, arg4, arg5)) {
                        var18 = true;
                        break;
                    }
                }
                if (arg6 != 0 && ~arg1 != -1 && class130.field2279[class216.field3902].method1698((byte) -124, arg6, arg0, arg12, var14, arg4, var15, arg1, arg5)) {
                    var18 = true;
                    break;
                }
                int var31 = class258.field4444[var14][var15] + 1;
                if (var14 > 0 && ~class93.field1657[var14 + -1][var15] == -1 && ~(var19[var14 - 1][var15] & 19661070) == -1 && (19661112 & var19[var14 + -1][arg4 + -1 + var15]) == 0) {
                    int var32 = 1;
                    while (true) {
                        if (~var32 <= ~(arg4 + -1)) {
                            class8.field268[var41] = var14 + -1;
                            class80.field1513[var41] = var15;
                            class93.field1657[var14 + -1][var15] = 2;
                            class258.field4444[var14 + -1][var15] = var31;
                            var41 = var41 + 1 & 4095;
                            break;
                        }
                        if (~(var19[var14 + -1][var15 + var32] & 19661118) != -1) {
                            break;
                        }
                        ++var32;
                    }
                }
                if (~var14 > -103 && class93.field1657[var14 + 1][var15] == 0 && ~(19661187 & var19[arg4 + var14][var15]) == -1 && (19661280 & var19[arg4 + var14][arg4 + var15 - 1]) == 0) {
                    int var33 = 1;
                    while (true) {
                        if (~(arg4 + -1) >= ~var33) {
                            class8.field268[var41] = var14 + 1;
                            class80.field1513[var41] = var15;
                            class93.field1657[var14 + 1][var15] = 8;
                            var41 = var41 + 1 & 4095;
                            class258.field4444[var14 + 1][var15] = var31;
                            break;
                        }
                        if ((19661283 & var19[arg4 + var14][var15 + var33]) != 0) {
                            break;
                        }
                        ++var33;
                    }
                }
                if (var15 > 0 && class93.field1657[var14][var15 + -1] == 0 && (var19[var14][var15 + -1] & 19661070) == 0 && (var19[arg4 + var14 - 1][var15 + -1] & 19661187) == 0) {
                    int var34 = 1;
                    while (true) {
                        if (arg4 - 1 <= var34) {
                            class8.field268[var41] = var14;
                            class80.field1513[var41] = var15 + -1;
                            class93.field1657[var14][var15 + -1] = 1;
                            class258.field4444[var14][var15 + -1] = var31;
                            var41 = var41 + 1 & 4095;
                            break;
                        }
                        if (~(var19[var14 + var34][var15 + -1] & 19661199) != -1) {
                            break;
                        }
                        ++var34;
                    }
                }
                if (var15 < 102 && class93.field1657[var14][var15 + 1] == 0 && (19661112 & var19[var14][arg4 + var15]) == 0 && ~(var19[arg4 + var14 + -1][arg4 + var15] & 19661280) == -1) {
                    int var35 = 1;
                    while (true) {
                        if (~var35 <= ~(arg4 + -1)) {
                            class8.field268[var41] = var14;
                            class80.field1513[var41] = var15 + 1;
                            var41 = 4095 & var41 + 1;
                            class93.field1657[var14][var15 - -1] = 4;
                            class258.field4444[var14][var15 + 1] = var31;
                            break;
                        }
                        if ((var19[var14 - -var35][arg4 + var15] & 19661304) != 0) {
                            break;
                        }
                        ++var35;
                    }
                }
                if (var14 > 0 && var15 > 0 && class93.field1657[var14 + -1][var15 - 1] == 0 && (var19[var14 - 1][var15 + -1 + arg4 + -1] & 19661112) == 0 && (var19[var14 + -1][var15 - 1] & 19661070) == 0 && (19661187 & var19[arg4 + -1 + -1 + var14][var15 + -1]) == 0) {
                    int var36 = 1;
                    while (true) {
                        if (~var36 <= ~(arg4 + -1)) {
                            class8.field268[var41] = var14 - 1;
                            class80.field1513[var41] = var15 - 1;
                            class93.field1657[var14 + -1][var15 + -1] = 3;
                            class258.field4444[var14 + -1][var15 + -1] = var31;
                            var41 = var41 + 1 & 4095;
                            break;
                        }
                        if ((var19[var14 + -1][var15 + -1 + var36] & 19661118) != 0 || ~(19661199 & var19[var14 - (1 - var36)][var15 + -1]) != -1) {
                            break;
                        }
                        ++var36;
                    }
                }
                if (var14 < 102 && ~var15 < -1 && ~class93.field1657[var14 + 1][var15 + -1] == -1 && (19661070 & var19[var14 + 1][var15 - 1]) == 0 && ~(var19[arg4 + var14][var15 + -1] & 19661187) == -1 && (var19[var14 - -arg4][var15 + -1 + arg4 - 1] & 19661280) == 0) {
                    int var37 = 1;
                    while (true) {
                        if (arg4 + -1 <= var37) {
                            class8.field268[var41] = var14 - -1;
                            class80.field1513[var41] = var15 + -1;
                            var41 = 4095 & var41 + 1;
                            class93.field1657[var14 + 1][var15 - 1] = 9;
                            class258.field4444[var14 + 1][var15 + -1] = var31;
                            break;
                        }
                        if (~(var19[var14 - -arg4][var15 + var37 - 1] & 19661283) != -1 || (var19[var37 + 1 + var14][var15 - 1] & 19661199) != 0) {
                            break;
                        }
                        ++var37;
                    }
                }
                if (var14 > 0 && var15 < 102 && ~class93.field1657[var14 + -1][var15 + 1] == -1 && ~(19661070 & var19[var14 - 1][var15 + 1]) == -1 && (var19[var14 + -1][arg4 + var15] & 19661112) == 0 && ~(var19[var14][arg4 + var15] & 19661280) == -1) {
                    int var38 = 1;
                    while (true) {
                        if (var38 >= arg4 - 1) {
                            class8.field268[var41] = var14 + -1;
                            class80.field1513[var41] = var15 - -1;
                            var41 = var41 - -1 & 4095;
                            class93.field1657[var14 + -1][var15 + 1] = 6;
                            class258.field4444[var14 - 1][var15 + 1] = var31;
                            break;
                        }
                        if (~(var19[var14 + -1][var15 + var38 - -1] & 19661118) != -1 || ~(19661304 & var19[var14 + -1 - -var38][arg4 + var15]) != -1) {
                            break;
                        }
                        ++var38;
                    }
                }
                if (var14 < 102 && ~var15 > -103 && ~class93.field1657[var14 + 1][var15 + 1] == -1 && ~(19661112 & var19[var14 + 1][arg4 + var15]) == -1 && ~(19661280 & var19[arg4 + var14][arg4 + var15]) == -1 && (var19[var14 - -arg4][var15 + 1] & 19661187) == 0) {
                    for (int var39 = 1; ~(arg4 + -1) < ~var39; ++var39) {
                        if (~(19661304 & var19[var39 + 1 + var14][var15 - -arg4]) != -1 || (19661283 & var19[arg4 + var14][var39 + 1 + var15]) != 0) {
                            continue label372;
                        }
                    }
                    class8.field268[var41] = var14 + 1;
                    class80.field1513[var41] = var15 + 1;
                    class93.field1657[var14 + 1][var15 + 1] = 12;
                    var41 = 4095 & var41 - -1;
                    class258.field4444[var14 + 1][var15 + 1] = var31;
                }
            }
            class242.field4210 = 0;
            if (!var18) {
                if (!arg9) {
                    return false;
                }
                int var20 = 1000;
                int var21 = 100;
                byte var22 = 10;
                for (int var23 = -var22 + arg5; arg5 + var22 >= var23; ++var23) {
                    for (int var24 = arg12 - var22; arg12 + var22 >= var24; ++var24) {
                        if (var23 >= 0 && var24 >= 0 && ~var23 > -105 && var24 < 104 && ~class258.field4444[var23][var24] > -101) {
                            int var25 = 0;
                            if (var23 < arg5) {
                                var25 = -var23 + arg5;
                            } else if (arg5 - 1 + arg6 < var23) {
                                var25 = var23 - (arg5 - 1 + arg6);
                            }
                            int var26 = 0;
                            if (~arg12 < ~var24) {
                                var26 = -var24 + arg12;
                            } else if (~(arg12 - -arg1 + -1) > ~var24) {
                                var26 = var24 - -1 - (arg12 - -arg1);
                            }
                            int var27 = var25 * var25 + var26 * var26;
                            if (~var20 < ~var27 || var20 == var27 && var21 > class258.field4444[var23][var24]) {
                                var14 = var23;
                                var21 = class258.field4444[var23][var24];
                                var20 = var27;
                                var15 = var24;
                            }
                        }
                    }
                }
                if (var20 == 1000) {
                    return false;
                }
                if (~arg3 == ~var14 && ~arg2 == ~var15) {
                    return false;
                }
                class242.field4210 = 1;
            }
            byte var28 = 0;
            class8.field268[var28] = var14;
            int var42 = var28 + 1;
            class80.field1513[var28] = var15;
            int var29;
            int var30 = var29 = class93.field1657[var14][var15];
            while (arg3 != var14 || ~arg2 != ~var15) {
                if (var29 != var30) {
                    var29 = var30;
                    class8.field268[var42] = var14;
                    class80.field1513[var42++] = var15;
                }
                if ((1 & var30) == 0) {
                    if ((var30 & 4) != 0) {
                        --var15;
                    }
                } else {
                    ++var15;
                }
                if ((2 & var30) != 0) {
                    ++var14;
                } else if (~(var30 & 8) != -1) {
                    --var14;
                }
                var30 = class93.field1657[var14][var15];
            }
            if (~var42 < -1) {
                class48.method390(var42, arg7, (byte) -78);
                return true;
            } else if (arg7 == 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void startProduction(ImageConsumer arg0) {
        ++field2966;
        this.addConsumer(arg0);
    }

    @OriginalMember(owner = "client!gl", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z")
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2957;
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        ++field2961;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIII)V")
    private final synchronized void method1076(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2969;
        if (arg0 != -3797) {
            this.addConsumer((ImageConsumer) null);
        }
        if (this.field2965 != null) {
            this.field2965.setPixels(arg4, arg2, arg3, arg1, this.field2960, super.field2274, super.field2266 * arg2 + arg4, super.field2266);
            this.field2965.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method579(int arg0, int arg1, byte arg2, Component arg3) {
        if (arg2 == -70) {
            super.field2271 = arg1;
            super.field2274 = new int[arg0 * arg1 + 1];
            super.field2266 = arg0;
            this.field2960 = new DirectColorModel(32, 16711680, 65280, 255);
            ++field2959;
            super.field2264 = arg3.createImage(this);
            this.method1079(0);
            arg3.prepareImage(super.field2264, this);
            this.method1079(0);
            arg3.prepareImage(super.field2264, this);
            this.method1079(arg2 ^ -70);
            arg3.prepareImage(super.field2264, this);
            this.method846((byte) 2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void addConsumer(ImageConsumer arg0) {
        ++field2962;
        this.field2965 = arg0;
        arg0.setDimensions(super.field2266, super.field2271);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field2960);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public static final void method1077(boolean arg0) {
        ++field2955;
        if (arg0) {
            field2971 = null;
        }
        class164.field2981.method1888((byte) 98);
    }

    @OriginalMember(owner = "client!gl", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z")
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        ++field2975;
        return this.field2965 == arg0;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static void method1078(int arg0) {
        field2971 = null;
        field2970 = null;
        field2963 = null;
        if (arg0 != 21533) {
            method1080((byte) -58);
        }
        field2958 = null;
        field2968 = null;
        field2974 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method578(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1076(-3797, arg0, arg5, arg3, arg4);
        ++field2956;
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg3, arg0);
        if (arg2 > -87) {
            this.requestTopDownLeftRightResend((ImageConsumer) null);
        }
        arg1.drawImage(super.field2264, 0, 0, this);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    private final synchronized void method1079(int arg0) {
        ++field2967;
        if (this.field2965 != null) {
            this.field2965.setPixels(arg0, 0, super.field2266, super.field2271, this.field2960, super.field2274, 0, super.field2266);
            this.field2965.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
    public static final void method1080(byte arg0) {
        ++field2973;
        int var1 = class205.field3692.method754(class103.field1833);
        if (arg0 != 90) {
            field2971 = null;
        }
        for (int var2 = 0; class120.field2129 > var2; ++var2) {
            int var6 = class205.field3692.method754(class118.method798(var2, 1927674668));
            if (~var1 > ~var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class120.field2129 * 15 - -21;
        int var4 = class38.field862;
        int var5 = -(var1 / 2) + class77.field1475;
        if (~class26.field706 > ~(var1 + var5)) {
            var5 = -var1 + class26.field706;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        if (~(var3 + var4) < ~class50.field1053) {
            var4 = class50.field1053 - var3;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (~class183.field3286 == -2) {
            if (~class97.field1719 == ~class77.field1475 && ~class38.field862 == ~class135.field2440) {
                class50.field1049 = true;
                class279.field4926 = var1;
                class183.field3286 = 0;
                class172.field3103 = class120.field2129 * 15 + (class97.field1711 ? 26 : 22);
                class130.field2335 = var5;
                class182.field3227 = var4;
                return;
            }
        } else {
            if (class77.field1475 == class122.field2193 && ~class38.field862 == ~class192.field3427) {
                class130.field2335 = var5;
                class182.field3227 = var4;
                class172.field3103 = (class97.field1711 ? 26 : 22) + class120.field2129 * 15;
                class279.field4926 = var1;
                class50.field1049 = true;
                class183.field3286 = 0;
                return;
            }
            class97.field1719 = class122.field2193;
            class135.field2440 = class192.field3427;
            class183.field3286 = 1;
        }
    }

    @OriginalMember(owner = "client!gl", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V")
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        ++field2972;
        if (this.field2965 == arg0) {
            this.field2965 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method580(int arg0, int arg1, Graphics arg2, boolean arg3) {
        ++field2976;
        this.method1079(0);
        if (!arg3) {
            this.startProduction((ImageConsumer) null);
        }
        arg2.drawImage(super.field2264, arg0, arg1, this);
    }
}
