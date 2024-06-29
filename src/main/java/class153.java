import java.awt.Frame;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class153 {

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    private int[] field2644;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    private int[] field2652;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[B")
    private byte[] field2648;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2653 = 99;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    public static int[] field2645 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field2651 = 0;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
    public static int[] field2658 = new int[50];

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "Lde;")
    public static class108 field2657;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Ljava/awt/Frame;")
    public static Frame field2656;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIIII[B)I")
    public final int method1079(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = -28 % ((arg1 + 11) / 57);
        int var8 = arg2 + arg3;
        field2647++;
        int var9 = 0;
        int var10 = arg4 << 3;
        while (arg2 < var8) {
            int var11 = arg5[arg2] & 0xFF;
            int var12 = this.field2652[var11];
            byte var13 = this.field2648[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            var10 += var13;
            int var16 = var14 + (var13 + var15 - 1 >> 3);
            int var17 = var9 & -var15 >> 31;
            int var18 = var15 + 24;
            arg0[var14] = (byte) (var9 = class160.method1143(var17, var12 >>> var18));
            if (var16 > var14) {
                var14++;
                var15 = var18 - 8;
                arg0[var14] = (byte) (var9 = var12 >>> var15);
                if (var14 < var16) {
                    var14++;
                    var15 -= 8;
                    arg0[var14] = (byte) (var9 = var12 >>> var15);
                    if (var16 > var14) {
                        var15 -= 8;
                        var14++;
                        arg0[var14] = (byte) (var9 = var12 >>> var15);
                        if (var16 > var14) {
                            var15 -= 8;
                            var14++;
                            arg0[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var10 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([BI[BIII)I")
    public final int method1080(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field2655++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var11;
            if ((var11 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var12;
            if ((var12 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var13;
            if ((var13 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var14;
            if ((var14 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var15;
            if ((var15 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var16;
            if ((var16 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var17;
            if ((var17 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2644[var8];
            }
            int var18;
            if ((var18 = this.field2644[var8]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg5 != -3) {
            this.field2652 = null;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2657 = null;
        field2656 = null;
        field2645 = null;
        field2658 = null;
        if (arg0 != 24) {
            method1087((class280) null, -28, -81, 125, 37);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method1082(int arg0) {
        field2642++;
        int var1 = class59.field951;
        int var2 = class222.field3857;
        int var3 = class78.field1270;
        int var4 = class246.field4322;
        if (field2657 == null || class12.field251 == null) {
            if (class220.field3778.method1262(class118.field2115, (byte) 93) && class220.field3778.method1262(class231.field4020, (byte) 93)) {
                field2657 = class16.method129(0, class118.field2115, (byte) -98, class220.field3778);
                class12.field251 = class16.method129(0, class231.field4020, (byte) -98, class220.field3778);
            } else {
                class151.method1049(var1, var2, var3, 20, class128.field2230, 256 - class134.field2376);
            }
        }
        if (field2657 != null && class12.field251 != null) {
            int var5 = var3 / field2657.field1785;
            for (int var6 = 0; var6 < var5; var6++) {
                field2657.method758(field2657.field1785 * var6 + var1, var2);
            }
            class12.field251.method758(var1, var2);
            class12.field251.method756(var1 + var3 - class12.field251.field1785, var2);
        }
        class54.field890.method515(class99.field1619, var1 + 3, var2 + 14, class222.field3851, -1);
        class151.method1049(var1, var2 + 20, var3, var4 - 20, class128.field2230, 256 - class134.field2376);
        int var7 = class229.field3957;
        int var8 = class154.field2673;
        for (int var9 = 0; var9 < class157.field2745; var9++) {
            int var17 = (class157.field2745 - var9 - 1) * 15 + (var2 + 35);
            if (var1 < var7 && var7 < var1 + var3 && var17 - 13 < var8 && (var17 + 3) > var8) {
                class151.method1049(var1, var17 - 13, var3, 16, class62.field1015, 256 - class199.field3483);
            }
        }
        if ((class205.field3561 == null || class25.field465 == null || class159.field2786 == null) && class220.field3778.method1262(class3.field96, (byte) 93) && class220.field3778.method1262(class235.field4095, (byte) 93) && class220.field3778.method1262(class231.field4021, (byte) 93)) {
            class205.field3561 = class16.method129(0, class3.field96, (byte) -98, class220.field3778);
            class25.field465 = class16.method129(0, class235.field4095, (byte) -98, class220.field3778);
            class159.field2786 = class16.method129(0, class231.field4021, (byte) -98, class220.field3778);
        }
        if (class205.field3561 != null && class25.field465 != null && class159.field2786 != null) {
            int var10 = var3 / class205.field3561.field1785;
            for (int var11 = 0; var11 < var10; var11++) {
                class205.field3561.method758(class205.field3561.field1785 * var11 + var1, var2 - class205.field3561.field1791 + var4);
            }
            int var12 = (var4 - 20) / class25.field465.field1791;
            for (int var13 = 0; var13 < var12; var13++) {
                class25.field465.method758(var1, class25.field465.field1791 * var13 + (var2 + 20));
                class25.field465.method756(var3 + var1 - class25.field465.field1785, class25.field465.field1791 * var13 + var2 + 20);
            }
            class159.field2786.method758(var1, var4 + var2 - class159.field2786.field1791);
            class159.field2786.method756(var1 + var3 - class159.field2786.field1785, -class159.field2786.field1791 + var4 + var2);
        }
        for (int var14 = arg0; var14 < class157.field2745; var14++) {
            int var15 = var2 + ((-var14 + class157.field2745 - 1) * 15) + 35;
            int var16 = class222.field3851;
            if (var7 > var1 && var1 + var3 > var7 && var8 > var15 - 13 && var15 + 3 > var8) {
                var16 = class214.field3668;
            }
            class54.field890.method515(class199.method1366(var14, -1), var1 + 3, var15, var16, 0);
        }
        class30.method264(class222.field3857, -73, class59.field951, class78.field1270, class246.field4322);
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public static final void method1083(int arg0) {
        field2649++;
        if (class182.field3192 != null) {
            class57 var1 = class182.field3192;
            synchronized (class182.field3192) {
                class182.field3192 = null;
            }
        }
        if (arg0 >= -42) {
            method1085(-26, 72);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
    public class153(byte[] arg0) {
        int var2 = arg0.length;
        this.field2644 = new int[8];
        this.field2652 = new int[var2];
        this.field2648 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2652[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class160.method1143(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2644[var14] == 0) {
                            this.field2644[var14] = var3;
                        }
                        var14 = this.field2644[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field2644.length) {
                        int[] var18 = new int[this.field2644.length * 2];
                        for (int var19 = 0; var19 < this.field2644.length; var19++) {
                            var18[var19] = this.field2644[var19];
                        }
                        this.field2644 = var18;
                    }
                }
                this.field2644[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BII)Lp;")
    public static final class280 method1084(int arg0, byte[] arg1, int arg2, int arg3) {
        field2640++;
        class280 var4 = new class280();
        var4.field4907 = new byte[arg3];
        var4.field4908 = arg2;
        for (int var5 = arg0; var5 < arg0 + arg3; var5++) {
            if (arg1[var5] != 0) {
                var4.field4907[var4.field4908++] = arg1[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
    public static final void method1085(int arg0, int arg1) {
        if (!class190.field3332) {
            arg1 = -1;
        }
        field2650++;
        if (class144.field2515 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class41 var2 = class116.method840(arg1, arg0 ^ 0x1E70);
            class223 var3 = var2.method321((byte) 13);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class118.field2117.method1354(var3.method1504(), new Point(var2.field704, var2.field701), var3.field1780, 0, class41.field707, var3.field1788);
                class144.field2515 = arg1;
            }
        }
        if (arg0 == arg1 && class144.field2515 != -1) {
            class118.field2117.method1354((int[]) null, new Point(), -1, 0, class41.field707, -1);
            class144.field2515 = -1;
        }
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static final void method1086(int arg0) {
        field2641++;
        int[] var1 = new int[class231.field4015];
        int var2 = 0;
        for (int var3 = 0; var3 < class231.field4015; var3++) {
            class220 var5 = class23.method177((byte) -74, var3);
            if (var5.field3788 >= 0 || var5.field3822 >= 0) {
                var1[var2++] = var3;
            }
        }
        if (arg0 != 1) {
            field2653 = 1;
        }
        class67.field1116 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class67.field1116[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lp;IIII)V")
    public static final void method1087(class280 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2646++;
        class113 var5 = class224.method1509(arg4, arg1, (byte) 124);
        if (var5 == null) {
            return;
        }
        if (var5.field1861 != null) {
            class178 var6 = new class178();
            var6.field3107 = var5.field1861;
            var6.field3090 = arg3;
            var6.field3106 = var5;
            var6.field3110 = arg0;
            class199.method1371(arg2 + 211714, var6);
        }
        boolean var7 = true;
        if (var5.field1899 > 0) {
            var7 = class262.method1775(true, var5);
        }
        if (!var7 || !class254.method1710(client.method1099(var5), (byte) 100, arg3 - 1)) {
            return;
        }
        if (arg3 == 1) {
            class34.field627.method551(27, true);
            class230.field3990++;
            class34.field627.method231(arg2 ^ 0xFFFFFEC8, arg4);
            class34.field627.method214(-3, arg1);
        }
        if (arg3 == 2) {
            class34.field627.method551(164, true);
            class34.field627.method231(11510, arg4);
            class53.field863++;
            class34.field627.method214(arg2 ^ 0x2DC3, arg1);
        }
        if (arg3 == 3) {
            class248.field4336++;
            class34.field627.method551(57, true);
            class34.field627.method231(11510, arg4);
            class34.field627.method214(arg2 + 11711, arg1);
        }
        if (arg3 == 4) {
            class34.field627.method551(155, true);
            class81.field1330++;
            class34.field627.method231(11510, arg4);
            class34.field627.method214(-3, arg1);
        }
        if (arg3 == 5) {
            class34.field627.method551(2, true);
            class34.field627.method231(11510, arg4);
            class147.field2564++;
            class34.field627.method214(-3, arg1);
        }
        if (arg3 == 6) {
            class34.field627.method551(184, true);
            class149.field2576++;
            class34.field627.method231(11510, arg4);
            class34.field627.method214(-3, arg1);
        }
        if (arg2 != -11714) {
            method1083(95);
        }
        if (arg3 == 7) {
            class34.field627.method551(144, true);
            class74.field1215++;
            class34.field627.method231(11510, arg4);
            class34.field627.method214(arg2 ^ 0x2DC3, arg1);
        }
        if (arg3 == 8) {
            class34.field627.method551(154, true);
            class83.field1371++;
            class34.field627.method231(11510, arg4);
            class34.field627.method214(arg2 ^ 0x2DC3, arg1);
        }
        if (arg3 == 9) {
            class32.field601++;
            class34.field627.method551(134, true);
            class34.field627.method231(11510, arg4);
            class34.field627.method214(arg2 ^ 0x2DC3, arg1);
        }
        if (arg3 == 10) {
            class131.field2326++;
            class34.field627.method551(129, true);
            class34.field627.method231(arg2 ^ 0xFFFFFEC8, arg4);
            class34.field627.method214(-3, arg1);
        }
    }
}
