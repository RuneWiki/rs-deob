import java.awt.Image;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class261 extends class201 {

    @OriginalMember(owner = "client!dk", name = "W", descriptor = "I")
    public int field4624 = 0;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "S")
    public static short field4609 = 320;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "I")
    public static int field4611 = 0;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "I")
    public static int field4620 = 0;

    @OriginalMember(owner = "client!dk", name = "T", descriptor = "Ljd;")
    public static class85 field4621 = class221.method1499("Zugewiesener Speicher)3", (byte) 126);

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "[S")
    public static short[] field4619 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!dk", name = "U", descriptor = "Ljd;")
    public static class85 field4622 = class221.method1499("overlay", (byte) 92);

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "Ljd;")
    public static class85 field4616 = class221.method1499("blaugr-Un:", (byte) -54);

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "[I")
    public static int[] field4610 = new int[100];

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!dk", name = "M", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!dk", name = "V", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!dk", name = "X", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Ljf;")
    public static class62 field4618;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljava/awt/Image;")
    public static Image field4615;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "[Lqf;")
    public static class232[] field4613;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public static void method1786(byte arg0) {
        field4619 = null;
        field4621 = null;
        if (arg0 != 20) {
            field4615 = null;
        }
        field4618 = null;
        field4622 = null;
        field4616 = null;
        field4615 = null;
        field4613 = null;
        field4610 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1787(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class122.field2140 * 128) {
            arg0 = class122.field2140 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class202.field3521 * 128) {
            arg2 = class202.field3521 * 128 - 1;
        }
        class190.field3268 = class173.field2984[arg3];
        class214.field3752 = class173.field2995[arg3];
        class171.field2962 = class173.field2984[arg4];
        class3.field29 = class173.field2995[arg4];
        class221.field3877 = arg0;
        class34.field528 = arg1;
        class237.field4097 = arg2;
        class19.field275 = arg0 / 128;
        class152.field2602 = arg2 / 128;
        class54.field952 = class19.field275 - class271.field4800;
        if (class54.field952 < 0) {
            class54.field952 = 0;
        }
        class114.field2048 = class152.field2602 - class271.field4800;
        if (class114.field2048 < 0) {
            class114.field2048 = 0;
        }
        class169.field2909 = class271.field4800 + class19.field275;
        if (class169.field2909 > class122.field2140) {
            class169.field2909 = class122.field2140;
        }
        class108.field1914 = class271.field4800 + class152.field2602;
        if (class108.field1914 > class202.field3521) {
            class108.field1914 = class202.field3521;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class271.field4800 + class271.field4800 + 2; var16++) {
            for (int var19 = 0; var19 < class271.field4800 + class271.field4800 + 2; var19++) {
                int var20 = (var16 - class271.field4800 << 7) - (class221.field3877 & 0x7F);
                int var21 = (var19 - class271.field4800 << 7) - (class237.field4097 & 0x7F);
                int var22 = class19.field275 + var16 - class271.field4800;
                int var23 = class152.field2602 + var19 - class271.field4800;
                if (var22 >= 0 && var23 >= 0 && var22 < class122.field2140 && var23 < class202.field3521) {
                    int var24;
                    if (class135.field2348 == null) {
                        var24 = class225.field3920[0][var22][var23] + 128 - class34.field528;
                    } else {
                        var24 = class135.field2348[0][var22][var23] + 128 - class34.field528;
                    }
                    int var25 = class225.field3920[3][var22][var23] - class34.field528 - 1000;
                    class104.field1832[var16][var19] = class175.method1185(var20, var25, var24, var21, var15);
                } else {
                    class104.field1832[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class271.field4800 + class271.field4800 + 1; var17++) {
            for (int var18 = 0; var18 < class271.field4800 + class271.field4800 + 1; var18++) {
                class210.field3683[var17][var18] = class104.field1832[var17][var18] || class104.field1832[var17 + 1][var18] || class104.field1832[var17][var18 + 1] || class104.field1832[var17 + 1][var18 + 1];
            }
        }
        class8.field106 = arg6;
        class70.field1304 = arg7;
        class34.field511 = arg8;
        class167.field2876 = arg9;
        class221.field3880 = arg10;
        class56.method374();
        class37.method246(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLik;)V")
    public final void method1788(byte arg0, class247 arg1) {
        int var3 = 106 / ((arg0 + 14) / 43);
        field4617++;
        while (true) {
            int var4 = arg1.method1711((byte) -67);
            if (var4 == 0) {
                return;
            }
            this.method1789(126, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILik;)V")
    private final void method1789(int arg0, int arg1, class247 arg2) {
        if (arg1 == 2) {
            this.field4624 = arg2.method1694((byte) -100);
        }
        int var4 = -49 % ((arg0 - 9) / 55);
        field4626++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public static final void method1790(byte arg0) {
        if (arg0 >= -47) {
            method1787(-102, -118, -56, 83, -42, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, 89, (byte) -16, -38, 127);
        }
        field4614++;
        if (class115.field2056 == 0) {
            return;
        }
        try {
            if (++class177.field3032 > 2000) {
                if (class198.field3390 != null) {
                    class198.field3390.method218(127);
                    class198.field3390 = null;
                }
                if (class86.field1616 >= 1) {
                    class115.field2056 = 0;
                    class112.field1965 = -5;
                    return;
                }
                class115.field2056 = 1;
                class177.field3032 = 0;
                class86.field1616++;
                if (class43.field751 == class239.field4128) {
                    class239.field4128 = class58.field1058;
                } else {
                    class239.field4128 = class43.field751;
                }
            }
            if (class115.field2056 == 1) {
                class161.field2780 = class107.field1882.method559((byte) 60, class239.field4128, class6.field70);
                class115.field2056 = 2;
            }
            if (class115.field2056 == 2) {
                if (class161.field2780.field1296 == 2) {
                    throw new IOException();
                }
                if (class161.field2780.field1296 != 1) {
                    return;
                }
                class198.field3390 = new class31((Socket) class161.field2780.field1292, class107.field1882);
                class161.field2780 = null;
                class198.field3390.method214(class207.field3618.field4238, class207.field3618.field4224, 0, (byte) 15);
                if (class247.field4223 != null) {
                    class247.field4223.method269(-21792);
                }
                if (class24.field346 != null) {
                    class24.field346.method269(-21792);
                }
                int var1 = class198.field3390.method213(-1588);
                if (class247.field4223 != null) {
                    class247.field4223.method269(-21792);
                }
                if (class24.field346 != null) {
                    class24.field346.method269(-21792);
                }
                if (var1 != 21) {
                    class115.field2056 = 0;
                    class112.field1965 = var1;
                    class198.field3390.method218(127);
                    class198.field3390 = null;
                    return;
                }
                class115.field2056 = 3;
            }
            if (class115.field2056 == 3) {
                if (class198.field3390.method212((byte) -126) < 1) {
                    return;
                }
                class88.field1650 = new class85[class198.field3390.method213(-1588)];
                class115.field2056 = 4;
            }
            if (class115.field2056 == 4 && class198.field3390.method212((byte) -128) >= (class88.field1650.length * 8)) {
                class189.field3249.field4224 = 0;
                class198.field3390.method216(class189.field3249.field4238, class88.field1650.length * 8, 0, 0);
                for (int var2 = 0; var2 < class88.field1650.length; var2++) {
                    class88.field1650[var2] = class116.method814(class189.field3249.method1720((byte) -3), -102);
                }
                class112.field1965 = 21;
                class115.field2056 = 0;
                class198.field3390.method218(127);
                class198.field3390 = null;
            }
        } catch (IOException var3) {
            if (class198.field3390 != null) {
                class198.field3390.method218(123);
                class198.field3390 = null;
            }
            if (class86.field1616 < 1) {
                class86.field1616++;
                if (class43.field751 == class239.field4128) {
                    class239.field4128 = class58.field1058;
                } else {
                    class239.field4128 = class43.field751;
                }
                class115.field2056 = 1;
                class177.field3032 = 0;
            } else {
                class112.field1965 = -4;
                class115.field2056 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
    public static final void method1791(int arg0, int arg1, int arg2) {
        class171 var3 = class85.method579(13, arg0, arg2);
        field4612++;
        var3.method1140(-28981);
        var3.field2951 = arg1;
    }
}
