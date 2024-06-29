import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class163 {

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lai;")
    private static class10 field3124 = class44.method278("skill)2", 103);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lai;")
    private static class10 field3117 = class44.method278(" seconds)3", 127);

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lai;")
    public static class10 field3125 = class44.method278("sl_button", -31);

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lai;")
    public static class10 field3126 = class44.method278("nav", -6);

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lai;")
    public static class10 field3121 = field3124;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lai;")
    public static class10 field3119 = field3117;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3131 = -1;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3116;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Ljava/awt/Image;")
    public Image field3127;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    public int[] field3122;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method1075(byte arg0) {
        field3121 = null;
        field3119 = null;
        field3125 = null;
        field3124 = null;
        field3117 = null;
        if (arg0 < -7) {
            field3126 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method969(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)V")
    public static final void method1076(int arg0, int arg1, int arg2) {
        class46.field758++;
        field3128++;
        class76.field1323.method635((byte) -118, 216);
        class76.field1323.method793(92, arg0);
        class76.field1323.method791(arg1, true);
        if (arg2 == 254) {
            ;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/awt/Component;II)Ls;")
    public static final class163 method1077(byte arg0, Component arg1, int arg2, int arg3) {
        field3123++;
        try {
            if (arg0 > -3) {
                method1076(-17, -58, -53);
            }
            Class var4 = Class.forName("pg");
            class163 var5 = (class163) var4.getDeclaredConstructor().newInstance();
            var5.method967(1, arg1, arg3, arg2);
            return var5;
        } catch (Throwable var7) {
            class193 var6 = new class193();
            var6.method967(1, arg1, arg3, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method967(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static final void method1078(int arg0) {
        field3118++;
        boolean var1 = true;
        class137.method930(false, -101);
        class61.field1037 = 0;
        for (int var2 = 0; var2 < class24.field371.length; var2++) {
            if (class203.field3961[var2] != -1 && class24.field371[var2] == null) {
                class24.field371[var2] = class186.field3538.method159((byte) -127, 0, class203.field3961[var2]);
                if (class24.field371[var2] == null) {
                    var1 = false;
                    class61.field1037++;
                }
            }
            if (class30.field472[var2] != -1 && class67.field1169[var2] == null) {
                class67.field1169[var2] = class186.field3538.method158(0, class142.field2682[var2], 0, class30.field472[var2]);
                if (class67.field1169[var2] == null) {
                    var1 = false;
                    class61.field1037++;
                }
            }
        }
        if (!var1) {
            class136.field2553 = 1;
            return;
        }
        class83.field1455 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class24.field371.length; var4++) {
            byte[] var57 = class67.field1169[var4];
            if (var57 != null) {
                int var58 = (class140.field2638[var4] >> 8) * 64 - class2.field16;
                int var59 = (class140.field2638[var4] & 0xFF) * 64 - class200.field3767;
                if (class35.field554) {
                    var58 = 10;
                    var59 = 10;
                }
                var3 &= class145.method1005(var59, var58, var57, 118);
            }
        }
        if (!var3) {
            class136.field2553 = 2;
            return;
        }
        if (class136.field2553 != 0) {
            class68.method444(-103, true, class67.method440(0, new class10[] { class130.field2460, class152.field2920 }));
        }
        class67.method441(-1);
        class149.method1023(-31984);
        class67.method441(-1);
        class36.field560.method562();
        class67.method441(-1);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class58.field1022[var5].method660((byte) -45);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var55 = 0; var55 < 104; var55++) {
                for (int var56 = 0; var56 < 104; var56++) {
                    class185.field3527[var6][var55][var56] = 0;
                }
            }
        }
        class67.method441(-1);
        class129.method897((byte) 98);
        int var7 = class24.field371.length;
        int var8 = 6 % ((arg0 + 49) / 39);
        class5.method13(-8);
        class137.method930(true, -107);
        if (!class35.field554) {
            for (int var9 = 0; var9 < var7; var9++) {
                int var18 = (class140.field2638[var9] & 0xFF) * 64 - class200.field3767;
                int var19 = (class140.field2638[var9] >> 8) * 64 - class2.field16;
                byte[] var20 = class24.field371[var9];
                if (var20 != null) {
                    class67.method441(-1);
                    class191.method1217(class58.field1022, (class117.field2265 - 6) * 8, (class159.field3054 - 6) * 8, var18, 64, var19, var20);
                }
            }
            for (int var10 = 0; var10 < var7; var10++) {
                int var15 = (class140.field2638[var10] >> 8) * 64 - class2.field16;
                byte[] var16 = class24.field371[var10];
                int var17 = (class140.field2638[var10] & 0xFF) * 64 - class200.field3767;
                if (var16 == null && class117.field2265 < 800) {
                    class67.method441(-1);
                    class97.method639(64, 121, var15, 64, var17);
                }
            }
            class137.method930(true, -122);
            for (int var11 = 0; var11 < var7; var11++) {
                byte[] var12 = class67.field1169[var11];
                if (var12 != null) {
                    int var13 = (class140.field2638[var11] >> 8) * 64 - class2.field16;
                    int var14 = (class140.field2638[var11] & 0xFF) * 64 - class200.field3767;
                    class67.method441(-1);
                    class165.method1098(class36.field560, var14, var13, 102, var12, class58.field1022);
                }
            }
        }
        if (class35.field554) {
            for (int var21 = 0; var21 < 4; var21++) {
                class67.method441(-1);
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = class49.field853[var21][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < class140.field2638.length; var44++) {
                                if (class140.field2638[var44] == var43 && class24.field371[var44] != null) {
                                    class203.method1319((var41 & 0x7) * 8, class24.field371[var44], 0, var40, var35 * 8, var21, class58.field1022, var36 * 8, (var42 & 0x7) * 8, var39);
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class50.method356(var35 * 8, -39, var36 * 8, var21);
                        }
                    }
                }
            }
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var33 = 0; var33 < 13; var33++) {
                    int var34 = class49.field853[0][var22][var33];
                    if (var34 == -1) {
                        class97.method639(8, -94, var22 * 8, 8, var33 * 8);
                    }
                }
            }
            class137.method930(true, -101);
            for (int var23 = 0; var23 < 4; var23++) {
                class67.method441(-1);
                for (int var24 = 0; var24 < 13; var24++) {
                    for (int var25 = 0; var25 < 13; var25++) {
                        int var26 = class49.field853[var23][var24][var25];
                        if (var26 != -1) {
                            int var27 = var26 >> 24 & 0x3;
                            int var28 = var26 >> 1 & 0x3;
                            int var29 = var26 >> 14 & 0x3FF;
                            int var30 = var26 >> 3 & 0x7FF;
                            int var31 = (var29 / 8 << 8) + var30 / 8;
                            for (int var32 = 0; var32 < class140.field2638.length; var32++) {
                                if (class140.field2638[var32] == var31 && class67.field1169[var32] != null) {
                                    class29.method182(class36.field560, (byte) -98, class58.field1022, var28, var24 * 8, (var29 & 0x7) * 8, (var30 & 0x7) * 8, class67.field1169[var32], var27, var25 * 8, var23);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class137.method930(true, -114);
        class149.method1023(-31984);
        class67.method441(-1);
        class27.method172(127, class36.field560, class58.field1022);
        class137.method930(true, -118);
        int var45 = class165.field3171;
        if (var45 > class42.field687) {
            var45 = class42.field687;
        }
        if (class42.field687 - 1 > var45) {
            int var46 = class42.field687 - 1;
        }
        if (class126.field2406) {
            class36.field560.method560(class165.field3171);
        } else {
            class36.field560.method560(0);
        }
        for (int var47 = 0; var47 < 104; var47++) {
            for (int var54 = 0; var54 < 104; var54++) {
                class130.method906(var54, var47, -24639);
            }
        }
        class67.method441(-1);
        class83.method509(124);
        class149.method1023(-31984);
        if (client.field448 != null) {
            class78.field1373++;
            class76.field1323.method635((byte) -98, 113);
            class76.field1323.method786(1057001181, (byte) -106);
        }
        if (!class35.field554) {
            int var48 = (class159.field3054 + 6) / 8;
            int var49 = (class159.field3054 - 6) / 8;
            int var50 = (class117.field2265 - 6) / 8;
            int var51 = (class117.field2265 + 6) / 8;
            for (int var52 = var49 - 1; var52 <= var48 + 1; var52++) {
                for (int var53 = var50 - 1; var53 <= var51 + 1; var53++) {
                    if (var52 < var49 || var52 > var48 || var53 < var50 || var53 > var51) {
                        class186.field3538.method139((byte) 111, class67.method440(0, new class10[] { class47.field820, class119.method846(0, var52), class121.field2336, class119.method846(0, var53) }));
                        class186.field3538.method139((byte) 89, class67.method440(0, new class10[] { class73.field1248, class119.method846(0, var52), class121.field2336, class119.method846(0, var53) }));
                    }
                }
            }
        }
        class111.method710(106, 30);
        class67.method441(-1);
        class195.method1242(86);
        class76.field1323.method635((byte) -97, 254);
        class40.method259(32);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public final void method1079(int arg0) {
        field3130++;
        int var2 = 112 % ((-arg0 - 38) / 51);
        class62.method408(this.field3122, this.field3116, this.field3120);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    protected class163() {
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method968(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
