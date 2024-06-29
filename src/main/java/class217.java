import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class217 extends Canvas {

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field4028;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lvd;")
    private static class222 field4024 = class212.method1357("Loading textures )2 ", 10731);

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lvd;")
    public static class222 field4023 = field4024;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lwd;")
    public static class232 field4032 = new class232(512);

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lvd;")
    public static class222 field4037 = class212.method1357(" ", 10731);

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lvd;")
    public static class222 field4035 = class212.method1357("T", 10731);

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[Z")
    public static boolean[] field4039 = new boolean[8];

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Z")
    public static boolean field4040 = false;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Lvd;")
    public static class222 field4041 = class212.method1357("Verbindung mit Update)2Server)3)3)3", 10731);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method1377(int arg0, int arg1) {
        field4022++;
        return arg0 == 104 ? arg1 & 0xFF : -101;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIII)V")
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg0; var6 <= arg3; var6++) {
            class81.method532(arg5, arg2, class156.field2981[var6], arg4, -7);
        }
        if (arg1 != -1) {
            method1382((byte) -83, -86);
        }
        field4033++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method1379(byte arg0) {
        class21.field505.method1343(true);
        if (arg0 != 112) {
            method1377(85, 35);
        }
        int var1 = class21.field505.method1350(8, arg0 ^ 0x77);
        if (var1 < class173.field3263) {
            for (int var2 = var1; var2 < class173.field3263; var2++) {
                class42.field900[class179.field3327++] = class113.field2123[var2];
            }
        }
        field4031++;
        if (var1 > class173.field3263) {
            throw new RuntimeException("gnpov1");
        }
        class173.field3263 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class113.field2123[var3];
            class193 var5 = class202.field3696[var4];
            int var6 = class21.field505.method1350(1, 7);
            if (var6 == 0) {
                class113.field2123[class173.field3263++] = var4;
                var5.field1348 = class175.field3280;
            } else {
                int var7 = class21.field505.method1350(2, 7);
                if (var7 == 0) {
                    class113.field2123[class173.field3263++] = var4;
                    var5.field1348 = class175.field3280;
                    class122.field2341[class162.field3088++] = var4;
                } else if (var7 == 1) {
                    class113.field2123[class173.field3263++] = var4;
                    var5.field1348 = class175.field3280;
                    int var8 = class21.field505.method1350(3, 7);
                    var5.method476(false, var8, false);
                    int var9 = class21.field505.method1350(1, 7);
                    if (var9 == 1) {
                        class122.field2341[class162.field3088++] = var4;
                    }
                } else if (var7 == 2) {
                    class113.field2123[class173.field3263++] = var4;
                    var5.field1348 = class175.field3280;
                    int var10 = class21.field505.method1350(3, arg0 ^ 0x77);
                    var5.method476(true, var10, false);
                    int var11 = class21.field505.method1350(3, 7);
                    var5.method476(true, var11, false);
                    int var12 = class21.field505.method1350(1, 7);
                    if (var12 == 1) {
                        class122.field2341[class162.field3088++] = var4;
                    }
                } else if (var7 == 3) {
                    class42.field900[class179.field3327++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field4028.update(arg0);
        field4027++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)I")
    public static final int method1380(byte arg0, int arg1) {
        field4026++;
        if (arg0 > -92) {
            field4039 = null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4030++;
        int var7 = 2048 - arg0 & 0x7FF;
        if (arg6 >= -54) {
            field4035 = null;
        }
        int var8 = 0;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = arg3;
        if (var9 != 0) {
            int var12 = class199.field3640[var9];
            int var13 = class199.field3624[var9];
            int var14 = var10 * var13 - arg3 * var12 >> 16;
            var11 = var10 * var12 + arg3 * var13 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class199.field3624[var7];
            int var16 = class199.field3640[var7];
            int var17 = var8 * var15 + var11 * var16 >> 16;
            var11 = var11 * var15 - var8 * var16 >> 16;
            var8 = var17;
        }
        class110.field2059 = arg2 - var11;
        class211.field3923 = arg5 - var8;
        class11.field213 = arg4;
        class118.field2243 = arg1 - var10;
        class54.field1021 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field4028.paint(arg0);
        field4025++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(BI)V")
    public static final void method1382(byte arg0, int arg1) {
        field4021++;
        int[] var2 = class155.field2958.field445;
        int var3 = var2.length;
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 1;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var21 = (52736 - var5 * 512) * 4 + 24628;
            for (int var22 = 1; var22 < 103; var22++) {
                if ((class161.field3074[arg1][var22][var5] & 0x18) == 0) {
                    class162.method1018(var2, var21, 512, arg1, var22, var5);
                }
                if (arg1 < 3 && (class161.field3074[arg1 + 1][var22][var5] & 0x8) != 0) {
                    class162.method1018(var2, var21, 512, arg1 + 1, var22, var5);
                }
                var21 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (int) (Math.random() * 20.0D) + 228;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        class155.field2958.method173();
        if (arg0 != -125) {
            return;
        }
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var20 = 1; var20 < 103; var20++) {
                if ((class161.field3074[arg1][var20][var8] & 0x18) == 0) {
                    class37.method305(var8, arg1, var20, (byte) 78, var6, var7);
                }
                if (arg1 < 3 && (class161.field3074[arg1 + 1][var20][var8] & 0x8) != 0) {
                    class37.method305(var8, arg1 + 1, var20, (byte) 92, var6, var7);
                }
            }
        }
        class81.field1567 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                long var11 = class94.method603(field4036, var9, var10);
                if (var11 != 0L) {
                    class65 var13 = class174.method1102((int) (var11 >>> 32) & Integer.MAX_VALUE, 0);
                    int var14 = var13.field1214;
                    if (var14 >= 0) {
                        int var15 = var9;
                        int var16 = var10;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            int[][] var17 = class108.field1993[field4036].field132;
                            for (int var18 = 0; var18 < 10; var18++) {
                                int var19 = (int) (Math.random() * 4.0D);
                                if (var19 == 0 && var15 > 0 && var9 - 3 < var15 && (var17[var15 - 1][var16] & 0x12C0108) == 0) {
                                    var15--;
                                }
                                if (var19 == 1 && var15 < 103 && var15 < var9 + 3 && (var17[var15 + 1][var16] & 0x12C0180) == 0) {
                                    var15++;
                                }
                                if (var19 == 2 && var16 > 0 && var10 - 3 < var16 && (var17[var15][var16 - 1] & 0x12C0102) == 0) {
                                    var16--;
                                }
                                if (var19 == 3 && var16 < 103 && var10 + 3 > var16 && (var17[var15][var16 + 1] & 0x12C0120) == 0) {
                                    var16++;
                                }
                            }
                        }
                        class229.field4315[class81.field1567] = var13.field1179;
                        class11.field212[class81.field1567] = var15;
                        class59.field1105[class81.field1567] = var16;
                        class81.field1567++;
                    }
                }
            }
        }
        class93.field1750.method1511(false);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4029++;
        if (arg6 >= 1 && arg4 >= 1 && arg6 <= 102 && arg4 <= 102) {
            if (class122.field2331 && field4036 != arg3) {
                return;
            }
            int var8 = arg3;
            if (arg3 < 3 && (class161.field3074[1][arg6][arg4] & 0x2) == 2) {
                var8 = arg3 + 1;
            }
            class173.method1094(arg4, var8, arg2, class108.field1993[arg3], arg3, arg5 - 3489, arg6);
            if (arg0 >= 0) {
                class108.method658(arg4, arg7, -1, arg1, arg6, false, arg0, var8, class108.field1993[arg3], arg3, false);
            }
        }
        if (arg5 != 3605) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method1384(int arg0, int arg1, Random arg2) {
        field4020++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class151.method974(arg1, (byte) 95)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = arg0 - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class79.method523(172275167, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static void method1385(boolean arg0) {
        field4041 = null;
        field4024 = null;
        if (!arg0) {
            return;
        }
        field4037 = null;
        field4035 = null;
        field4032 = null;
        field4039 = null;
        field4023 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class217(Component arg0) {
        this.field4028 = arg0;
    }
}
