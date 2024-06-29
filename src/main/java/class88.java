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

@OriginalClass("client!ib")
public class class88 extends class104 implements ImageProducer, ImageObserver {

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "Lcd;")
    public static class64 field1585 = class44.method335((byte) 71, "Lade)3)3)3");

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "Laj;")
    public static class1 field1592 = new class1();

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
    public static int[] field1601 = new int[2000];

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[I")
    public static int[] field1602 = new int[4096];

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Lqm;")
    public static class222 field1594;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Ljava/awt/image/ColorModel;")
    private ColorModel field1588;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/awt/image/ImageConsumer;")
    private ImageConsumer field1589;

    @OriginalMember(owner = "client!ib", name = "isConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)Z", line = 9)
    public final synchronized boolean isConsumer(ImageConsumer arg0) {
        field1598++;
        return this.field1589 == arg0;
    }

    @OriginalMember(owner = "client!ib", name = "removeConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 19)
    public final synchronized void removeConsumer(ImageConsumer arg0) {
        field1590++;
        if (this.field1589 == arg0) {
            this.field1589 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "requestTopDownLeftRightResend", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 32)
    public final void requestTopDownLeftRightResend(ImageConsumer arg0) {
        field1583++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 48)
    public final void method671(byte arg0, Component arg1, int arg2, int arg3) {
        this.field1930 = arg3;
        this.field1919 = arg2;
        this.field1920 = new int[arg2 * arg3 + 1];
        this.field1588 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field1931 = arg1.createImage(this);
        this.method677(0);
        arg1.prepareImage(this.field1931, this);
        this.method677(0);
        arg1.prepareImage(this.field1931, this);
        this.method677(0);
        field1595++;
        if (arg0 >= -79) {
            this.method679(0, 38, true, (Graphics) null, -42, 29);
        }
        arg1.prepareImage(this.field1931, this);
        this.method765(0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIILa;IZJ)Z", line = 70)
    public static final boolean method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class262 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class96.field1764 == class184.field3155;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class146.field2588 || var16 >= class314.field5327) {
                    return false;
                }
                class295 var17 = class304.field5203[arg0][var15][var16];
                if (var17 != null && var17.field5075 >= 5) {
                    return false;
                }
            }
        }
        class195 var18 = new class195();
        var18.field3324 = arg11;
        var18.field3331 = arg0;
        var18.field3329 = arg5;
        var18.field3320 = arg6;
        var18.field3311 = arg7;
        var18.field3330 = arg8;
        var18.field3326 = arg9;
        var18.field3313 = arg1;
        var18.field3322 = arg2;
        var18.field3328 = arg1 + arg3 - 1;
        var18.field3323 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class304.field5203[var22][var19][var20] == null) {
                        class304.field5203[var22][var19][var20] = new class295(var22, var19, var20);
                    }
                }
                class295 var23 = class304.field5203[arg0][var19][var20];
                var23.field5090[var23.field5075] = var18;
                var23.field5076[var23.field5075] = var21;
                var23.field5082 |= var21;
                var23.field5075++;
                if (var13 && class187.field3205[var19][var20] != 0) {
                    var14 = class187.field3205[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class187.field3205[var24][var25] == 0) {
                        class187.field3205[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class181.field3107[class132.field2354++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 188)
    public final void method673(int arg0, Graphics arg1, int arg2, int arg3) {
        field1599++;
        this.method677(0);
        int var5 = 65 / ((-arg0 - 31) / 39);
        arg1.drawImage(this.field1931, arg3, arg2, this);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIZIIIII)Z", line = 201)
    public static final boolean method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1584++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class121.field2178[var12][var13] = 0;
                class315.field5330[var12][var13] = 99999999;
            }
        }
        class121.field2178[arg1][arg10] = 99;
        int var14 = arg1;
        class315.field5330[arg1][arg10] = 0;
        int var15 = arg10;
        int var16 = 0;
        byte var17 = 0;
        boolean var18 = false;
        class228.field3873[var17] = arg1;
        int var32 = var17 + 1;
        field1602[var17] = arg10;
        int[][] var19 = class91.field1637[class20.field364].field905;
        while (var16 != var32) {
            var14 = class228.field3873[var16];
            var15 = field1602[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg7 == var14 && arg11 == var15) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class91.field1637[class20.field364].method409(arg2, var14, (byte) -29, arg11, arg3 - 1, 2, var15, arg7)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class91.field1637[class20.field364].method422(8, arg11, var14, 2, var15, arg7, arg2, arg3 - 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg9 != 0 && class91.field1637[class20.field364].method421(2, arg5, var15, arg9, arg8, arg7, -1, arg11, var14)) {
                var18 = true;
                break;
            }
            int var20 = class315.field5330[var14][var15] + 1;
            if (var14 > 0 && class121.field2178[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class228.field3873[var32] = var14 - 1;
                field1602[var32] = var15;
                class121.field2178[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class121.field2178[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class228.field3873[var32] = var14 + 1;
                field1602[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 + 1][var15] = 8;
                class315.field5330[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class121.field2178[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class228.field3873[var32] = var14;
                field1602[var32] = var15 - 1;
                class121.field2178[var14][var15 - 1] = 1;
                class315.field5330[var14][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class121.field2178[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class228.field3873[var32] = var14;
                field1602[var32] = var15 + 1;
                class121.field2178[var14][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class121.field2178[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class228.field3873[var32] = var14 - 1;
                field1602[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 - 1][var15 - 1] = 3;
                class315.field5330[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class121.field2178[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class228.field3873[var32] = var14 + 1;
                field1602[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class121.field2178[var14 + 1][var15 - 1] = 9;
                class315.field5330[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class121.field2178[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class228.field3873[var32] = var14 - 1;
                field1602[var32] = var15 + 1;
                class121.field2178[var14 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class121.field2178[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class228.field3873[var32] = var14 + 1;
                field1602[var32] = var15 + 1;
                class121.field2178[var14 + 1][var15 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class315.field5330[var14 + 1][var15 + 1] = var20;
            }
        }
        class223.field3804 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= (arg7 + var23); var24++) {
                for (int var25 = arg11 - var23; var25 <= arg11 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class315.field5330[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg11 > var25) {
                            var27 = arg11 - var25;
                        } else if (var25 > arg11 + arg9 - 1) {
                            var27 = var25 - (arg11 - 1) - arg9;
                        }
                        if (var24 < arg7) {
                            var26 = arg7 - var24;
                        } else if ((arg7 + arg8 - 1) < var24) {
                            var26 = -arg7 - (arg8 - var24 - 1);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class315.field5330[var24][var25]) {
                            var22 = class315.field5330[var24][var25];
                            var21 = var28;
                            var15 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var14 && arg10 == var15) {
                return false;
            }
            class223.field3804 = 1;
        }
        byte var29 = 0;
        class228.field3873[var29] = var14;
        int var33 = var29 + 1;
        field1602[var29] = var15;
        int var30;
        int var31 = var30 = class121.field2178[var14][var15];
        while (arg1 != var14 || arg10 != var15) {
            if (var30 != var31) {
                class228.field3873[var33] = var14;
                field1602[var33++] = var15;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class121.field2178[var14][var15];
        }
        if (var33 > 0) {
            class195.method1371(arg4, var33, arg0 - 4138);
            return true;
        } else if (arg0 != 4095) {
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "imageUpdate", descriptor = "(Ljava/awt/Image;IIIII)Z", line = 601)
    public final boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1600++;
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "addConsumer", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 609)
    public final synchronized void addConsumer(ImageConsumer arg0) {
        field1591++;
        this.field1589 = arg0;
        arg0.setDimensions(this.field1919, this.field1930);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1588);
        arg0.setHints(14);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V", line = 623)
    private final synchronized void method675(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = -53 / ((arg4 + 2) / 46);
        field1587++;
        if (this.field1589 != null) {
            this.field1589.setPixels(arg1, arg2, arg0, arg3, this.field1588, this.field1920, this.field1919 * arg2 + arg1, this.field1919);
            this.field1589.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLsa;)V", line = 645)
    public static final void method676(byte arg0, class103 arg1) {
        arg1.field1849 = false;
        field1596++;
        if (arg1.field1896 != -1) {
            class199 var2 = class281.method1944(arg1.field1896, 0);
            if (var2 == null || var2.field3393 == null) {
                arg1.field1896 = -1;
            } else {
                arg1.field1894++;
                if (var2.field3393.length > arg1.field1904 && arg1.field1894 > var2.field3419[arg1.field1904]) {
                    arg1.field1894 = 1;
                    arg1.field1904++;
                    class10.method89(arg1.field1865, arg1.field1859, arg1.field1904, var2, true, class139.field2472 == arg1);
                }
                if (var2.field3393.length <= arg1.field1904) {
                    arg1.field1894 = 0;
                    arg1.field1904 = 0;
                    class10.method89(arg1.field1865, arg1.field1859, arg1.field1904, var2, true, class139.field2472 == arg1);
                }
            }
        }
        if (arg1.field1903 != -1 && class29.field482 >= arg1.field1851) {
            int var3 = class275.method1908(arg1.field1903, 59).field1647;
            if (var3 == -1) {
                arg1.field1903 = -1;
            } else {
                class199 var4 = class281.method1944(var3, 0);
                if (var4 == null || var4.field3393 == null) {
                    arg1.field1903 = -1;
                } else {
                    if (arg1.field1916 < 0) {
                        arg1.field1916 = 0;
                        class10.method89(arg1.field1865, arg1.field1859, 0, var4, true, class139.field2472 == arg1);
                    }
                    arg1.field1872++;
                    if (var4.field3393.length > arg1.field1916 && arg1.field1872 > var4.field3419[arg1.field1916]) {
                        arg1.field1916++;
                        arg1.field1872 = 1;
                        class10.method89(arg1.field1865, arg1.field1859, arg1.field1916, var4, true, class139.field2472 == arg1);
                    }
                    if (var4.field3393.length <= arg1.field1916) {
                        arg1.field1903 = -1;
                    }
                }
            }
        }
        if (arg1.field1902 != -1 && arg1.field1874 <= 1) {
            class199 var5 = class281.method1944(arg1.field1902, 0);
            if (var5.field3397 == 1 && arg1.field1858 > 0 && class29.field482 >= arg1.field1888 && class29.field482 > arg1.field1877) {
                arg1.field1874 = 1;
                return;
            }
        }
        if (arg1.field1902 != -1 && arg1.field1874 == 0) {
            class199 var6 = class281.method1944(arg1.field1902, 0);
            if (var6 == null || var6.field3393 == null) {
                arg1.field1902 = -1;
            } else {
                arg1.field1892++;
                if (var6.field3393.length > arg1.field1885 && arg1.field1892 > var6.field3419[arg1.field1885]) {
                    arg1.field1892 = 1;
                    arg1.field1885++;
                    class10.method89(arg1.field1865, arg1.field1859, arg1.field1885, var6, true, class139.field2472 == arg1);
                }
                if (var6.field3393.length <= arg1.field1885) {
                    arg1.field1897++;
                    arg1.field1885 -= var6.field3395;
                    if (arg1.field1897 >= var6.field3409) {
                        arg1.field1902 = -1;
                    } else if (arg1.field1885 >= 0 && var6.field3393.length > arg1.field1885) {
                        class10.method89(arg1.field1865, arg1.field1859, arg1.field1885, var6, true, class139.field2472 == arg1);
                    } else {
                        arg1.field1902 = -1;
                    }
                }
                arg1.field1849 = var6.field3398;
            }
        }
        if (arg0 > -6) {
            field1601 = (int[]) null;
        }
        if (arg1.field1874 > 0) {
            arg1.field1874--;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 782)
    private final synchronized void method677(int arg0) {
        field1597++;
        if (this.field1589 != null) {
            this.field1589.setPixels(arg0, 0, this.field1919, this.field1930, this.field1588, this.field1920, 0, this.field1919);
            this.field1589.imageComplete(2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 795)
    public static void method678(int arg0) {
        field1594 = null;
        field1592 = null;
        field1602 = null;
        field1601 = null;
        field1585 = null;
        if (arg0 != 0) {
            method674(61, 55, -94, 111, 60, 82, false, 32, 29, -103, 67, 5);
        }
    }

    @OriginalMember(owner = "client!ib", name = "startProduction", descriptor = "(Ljava/awt/image/ImageConsumer;)V", line = 816)
    public final void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
        field1586++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V", line = 832)
    public final void method679(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        field1593++;
        if (!arg2) {
            return;
        }
        this.method675(arg5, arg1, arg0, arg4, (byte) 117);
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg1, arg0, arg5, arg4);
        arg3.drawImage(this.field1931, 0, 0, this);
        arg3.setClip(var7);
    }
}
