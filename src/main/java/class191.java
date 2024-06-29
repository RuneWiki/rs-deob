import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class191 implements class255 {

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field2688 = -1;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field2668;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    private int field2674;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    private int field2687;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    private int field2692;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    private int field2693;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "J")
    public static long field2695;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Ljava/awt/Color;")
    private Color field2683;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Ljava/awt/Font;")
    private Font field2672;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field2686;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Ljava/awt/Image;")
    private Image field2663;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/awt/Image;")
    private Image field2665;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/awt/Image;")
    private Image field2666;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field2669;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field2671;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field2676;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field2680;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field2689;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "Ljava/awt/Image;")
    private Image field2691;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Ljava/awt/Image;")
    private Image field2697;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
    private boolean field2667;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
    private boolean field2678;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Z")
    private boolean field2690;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 5)
    private final void method1335(byte arg0) {
        if (arg0 == 71) {
            class286.method1822(class181.field2501[class266.field3801], class703.field9912.method1428(16777215), (byte) -50, class280.field3927[class266.field3801], class597.field8487[class266.field3801], class703.field9912.method1432(125));
            field2682++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)Z", line = 18)
    public final boolean method1336(byte arg0, long arg1) {
        if (arg0 > -10) {
            this.field2668 = 127;
        }
        field2685++;
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 32)
    public final void method1337(byte arg0) {
        field2696++;
        if (arg0 != -45) {
            this.field2671 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;", line = 54)
    private final Object method1338(String arg0, int arg1, Class arg2) throws IllegalAccessException, NoSuchFieldException {
        field2694++;
        if (arg1 == 16) {
            Field var4 = arg2.getDeclaredField(arg0);
            Object var5 = var4.get(class486.field6999);
            var4.set(class486.field6999, null);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjc;IILl;)V", line = 75)
    public static final void method1339(int arg0, class168 arg1, int arg2, int arg3, class639 arg4) {
        field2699++;
        if ((arg2 & 0x1) != 0) {
            int var5 = arg1.method2920(-27357);
            byte[] var6 = new byte[var5];
            class479 var7 = new class479(var6);
            arg1.method2866(0, var6, 1681012576, var5);
            class481.field6874[arg3] = var7;
            arg4.method3680(var7, (byte) -67);
        }
        byte var8 = -1;
        if ((arg2 & 0x4) != 0) {
            arg4.field9075 = arg1.method2897(65280);
            if (arg4.field4637 == 0) {
                arg4.method2059(arg4.field9075, false);
                arg4.field9075 = -1;
            }
        }
        if ((arg2 & 0x1000) != 0) {
            int var9 = arg1.method2886(true);
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            for (int var13 = 0; var13 < var9; var13++) {
                int var14 = arg1.method2883(-2);
                if (var14 == 65535) {
                    var14 = -1;
                }
                var10[var13] = var14;
                var11[var13] = arg1.method2924((byte) -87);
                var12[var13] = arg1.method2883(-2);
            }
            class54.method482(var12, var10, arg4, -1, var11);
        }
        if ((arg2 & 0x20) != 0) {
            class710.field10011[arg3] = arg1.method2906(128);
        }
        if ((arg2 & 0x4000) != 0) {
            var8 = arg1.method2915(-114);
        }
        if ((arg2 & 0x20000) != 0) {
            arg4.field4549 = arg1.method2915(-115);
            arg4.field4619 = arg1.method2900(-58);
            arg4.field4614 = arg1.method2906(128);
            arg4.field4633 = (byte) arg1.method2904(111);
            arg4.field4581 = class703.field9918 + arg1.method2897(65280);
            arg4.field4618 = class703.field9918 + arg1.method2882(-1);
        }
        if ((arg2 & 0x10) != 0) {
            int var15 = arg1.method2897(65280);
            if (var15 == 65535) {
                var15 = -1;
            }
            arg4.field4576 = var15;
        }
        if ((arg2 & 0x2000) != 0) {
            int var16 = arg1.method2892((byte) 51);
            int var17 = arg1.method2871(-2);
            if (var16 == 65535) {
                var16 = -1;
            }
            int var18 = arg1.method2886(true);
            int var19 = var18 & 0x7;
            int var20 = (var18 & 0x78) >> 3;
            if (var20 == 15) {
                var20 = -1;
            }
            arg4.method2056(var17, true, var19, var16, var20, (byte) -72);
        }
        if (arg0 >= -35) {
            method1339(93, null, 107, 40, null);
        }
        if ((arg2 & 0x40000) != 0) {
            int var21 = class703.field9918;
            int var22 = arg1.method2889(-18098);
            int var23 = arg1.method2924((byte) -99);
            arg4.method2054(var22, var23, 73, var21);
        }
        if ((arg2 & 0x200) != 0) {
            arg4.field9050 = arg1.method2886(true) == 1;
        }
        if ((arg2 & 0x80) != 0) {
            int[] var24 = new int[4];
            for (int var25 = 0; var25 < 4; var25++) {
                var24[var25] = arg1.method2883(-2);
                if (var24[var25] == 65535) {
                    var24[var25] = -1;
                }
            }
            int var26 = arg1.method2886(true);
            class265.method1748(arg4, var26, (byte) -80, var24);
        }
        if ((arg2 & 0x800) != 0) {
            arg4.field4582 = arg1.method2900(-58);
            arg4.field4559 = arg1.method2911((byte) 41);
            arg4.field4580 = arg1.method2911((byte) -126);
            arg4.field4626 = arg1.method2906(128);
            arg4.field4628 = arg1.method2892((byte) 51) + class703.field9918;
            arg4.field4586 = arg1.method2882(-1) + class703.field9918;
            arg4.field4590 = arg1.method2904(47);
            arg4.field4641 = 0;
            if (arg4.field9065) {
                arg4.field4582 += arg4.field9094;
                arg4.field4580 += arg4.field9094;
                arg4.field4637 = 0;
                arg4.field4626 += arg4.field9071;
                arg4.field4559 += arg4.field9071;
            } else {
                arg4.field4637 = 1;
                arg4.field4580 += arg4.field4646[0];
                arg4.field4559 += arg4.field4645[0];
                arg4.field4626 += arg4.field4645[0];
                arg4.field4582 += arg4.field4646[0];
            }
        }
        if ((arg2 & 0x10000) != 0) {
            int var27 = arg1.method2904(115);
            int[] var28 = new int[var27];
            int[] var29 = new int[var27];
            for (int var30 = 0; var30 < var27; var30++) {
                int var31 = arg1.method2892((byte) 51);
                if ((var31 & 0xC000) == 49152) {
                    int var32 = arg1.method2892((byte) 51);
                    var28[var30] = class430.method2658(var31 << 16, var32);
                } else {
                    var28[var30] = var31;
                }
                var29[var30] = arg1.method2882(-1);
            }
            arg4.method2065(var29, var28, -1);
        }
        if ((arg2 & 0x40) != 0) {
            int var33 = arg1.method2889(-18098);
            int var34 = arg1.method2920(-27357);
            arg4.method2054(var33, var34, 97, class703.field9918);
            arg4.field4589 = class703.field9918 + 300;
            arg4.field4550 = arg1.method2904(103);
        }
        if ((arg2 & 0x8000) != 0) {
            int var35 = arg1.method2882(-1);
            arg4.field4537 = arg1.method2886(true);
            arg4.field4572 = arg1.method2886(true);
            arg4.field4556 = (var35 & 0x8000) != 0;
            arg4.field4573 = var35 & 0x7FFF;
            arg4.field4578 = class703.field9918 + arg4.field4537 + arg4.field4573;
        }
        if ((arg2 & 0x8) != 0) {
            int var36 = arg1.method2897(65280);
            if (var36 == 65535) {
                var36 = -1;
            }
            int var37 = arg1.method2871(-2);
            int var38 = arg1.method2924((byte) -110);
            int var39 = var38 & 0x7;
            int var40 = var38 >> 3 & 0xF;
            if (var40 == 15) {
                var40 = -1;
            }
            arg4.method2056(var37, false, var39, var36, var40, (byte) -104);
        }
        if ((arg2 & 0x100) != 0) {
            arg4.field4632 = arg1.method2894(-13192);
            if (arg4.field4632.charAt(0) == '~') {
                arg4.field4632 = arg4.field4632.substring(1);
                class145.method1013(arg4.field4632, (byte) 23, arg4.method3694((byte) -127, true), 2, 0, arg4.method3691(false, 0), arg4.field9096);
            } else if (class108.field1536 == arg4) {
                class145.method1013(arg4.field4632, (byte) -85, arg4.method3694((byte) -98, true), 2, 0, arg4.method3691(false, 0), arg4.field9096);
            }
            arg4.field4625 = 0;
            arg4.field4579 = 150;
            arg4.field4594 = 0;
        }
        if (!arg4.field9065) {
            return;
        }
        if (var8 == 127) {
            arg4.method3687(arg4.field9071, -125, arg4.field9094);
            return;
        }
        byte var41;
        if (var8 == -1) {
            var41 = class710.field10011[arg3];
        } else {
            var41 = var8;
        }
        class530.method3216(var41, -3587, arg4);
        arg4.method3693(arg4.field9094, arg4.field9071, (byte) 61, var41);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V", line = 388)
    public final void method1340(boolean arg0, boolean arg1) {
        field2670++;
        if (!this.field2678) {
            if (class486.field6999 == null) {
                this.field2678 = true;
            } else if (this.field2672 == null) {
                try {
                    this.method1346((byte) -54);
                } catch (Exception var43) {
                    this.field2678 = true;
                }
            }
        }
        if (this.field2678) {
            this.method1335((byte) 71);
        } else if (arg0) {
            Graphics var3 = class95.field1383.getGraphics();
            if (var3 == null) {
                class95.field1383.repaint();
            } else {
                try {
                    int var4 = class703.field9912.method1428(16777215);
                    String var5 = class703.field9912.method1432(123);
                    if (class390.field5621 == null) {
                        class390.field5621 = class95.field1383.createImage(class68.field1042, class565.field8187);
                    }
                    Graphics var6 = class390.field5621.getGraphics();
                    int var7 = this.field2680.getWidth(null);
                    int var8 = this.field2663.getWidth(null);
                    int var9 = this.field2691.getWidth(null);
                    int var10 = this.field2680.getHeight(null);
                    int var11 = this.field2663.getHeight(null);
                    int var12 = this.field2691.getHeight(null);
                    var6.drawImage(this.field2680, this.method1344(var7, 27071) + this.field2677 - this.field2674 / 2, this.method1348(2, var10) + this.field2692, null);
                    int var13 = this.field2677 + var7 - (this.field2674 / 2);
                    int var14 = this.field2674 / 2 + this.field2677;
                    for (int var15 = var13; var15 <= var14; var15 += var9) {
                        var6.drawImage(this.field2691, var15 + (this.method1344(var7, 27071) + this.field2677), this.method1348(2, var12) - -this.field2692, null);
                    }
                    var6.drawImage(this.field2663, this.method1344(var8, 27071) - (-(this.field2674 / 2) - this.field2677), this.method1348(2, var11) - -this.field2692, null);
                    int var16 = this.field2666.getWidth(null);
                    int var17 = this.field2666.getHeight(null);
                    int var18 = this.field2669.getWidth(null);
                    int var19 = this.field2669.getHeight(null);
                    int var20 = this.field2689.getHeight(null);
                    int var21 = this.field2671.getWidth(null);
                    int var22 = this.field2671.getHeight(null);
                    int var23 = this.field2689.getWidth(null);
                    int var24 = this.field2697.getWidth(null);
                    int var25 = this.field2676.getWidth(null);
                    int var26 = this.method1344(this.field2668, 27071) + this.field2675;
                    int var27 = this.method1348(2, this.field2693) + this.field2687;
                    var6.drawImage(this.field2666, var26, (this.field2693 - var17) / 2 + var27, null);
                    var6.drawImage(this.field2669, this.field2668 + var26 - var18, (-var19 + this.field2693) / 2 + var27, null);
                    if (this.field2665 == null) {
                        this.field2665 = class95.field1383.createImage(this.field2668 - var16 - var18, this.field2693);
                    }
                    Graphics var28 = this.field2665.getGraphics();
                    for (int var29 = 0; var29 < this.field2668 - var16 - var18; var29 += var21) {
                        var28.drawImage(this.field2671, var29, 0, null);
                    }
                    for (int var30 = 0; var30 < this.field2668 - var16 - var18; var30 += var23) {
                        var28.drawImage(this.field2689, var30, this.field2693 - var20, null);
                    }
                    int var31 = (this.field2668 - var16 - var18) * var4 / 100;
                    if (var31 > 0) {
                        Image var32 = class95.field1383.createImage(var31, this.field2693 - var22 - var20);
                        int var33 = var32.getWidth(null);
                        Graphics var34 = var32.getGraphics();
                        int var35 = this.field2661 * class115.method817(127) / 10 % var24;
                        for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                            var34.drawImage(this.field2697, var36, 0, null);
                        }
                        var28.drawImage(var32, 0, var22, null);
                    }
                    int var38 = this.field2668 - var31 - (var16 + var18);
                    if (var38 > 0) {
                        Image var39 = class95.field1383.createImage(var38, this.field2693 - var20 - var22);
                        int var40 = var39.getWidth(null);
                        Graphics var41 = var39.getGraphics();
                        for (int var42 = 0; var42 < var40; var42 += var25) {
                            var41.drawImage(this.field2676, var42, 0, null);
                        }
                        var28.drawImage(var39, var31, var22, null);
                    }
                    var6.drawImage(this.field2665, var16 + var26, var27, null);
                    var6.setFont(this.field2672);
                    var6.setColor(this.field2683);
                    var6.drawString(var5, var26 + (this.field2668 - this.field2686.stringWidth(var5)) / 2, this.field2693 / 2 + var27 + 4 + this.field2662);
                    var3.drawImage(class390.field5621, 0, 0, null);
                } catch (Exception var44) {
                    this.field2678 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I", line = 580)
    public final int method1341(byte arg0) {
        if (arg0 < 124) {
            this.method1340(true, true);
        }
        field2684++;
        return 100;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I", line = 594)
    public final int method1342(byte arg0) {
        field2659++;
        if (arg0 <= 40) {
            this.field2674 = -18;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 605)
    public final void method1343(int arg0) {
        if (arg0 <= 42) {
            this.field2668 = -61;
        }
        class264.method1743((byte) 45);
        field2658++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I", line = 618)
    private final int method1344(int arg0, int arg1) {
        field2660++;
        if (arg1 != 27071) {
            this.method1342((byte) -104);
        }
        return this.field2690 ? (class68.field1042 - arg0) / 2 : 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)I", line = 636)
    private final int method1345(String arg0, Class arg1, int arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 != 512) {
            this.field2693 = 75;
        }
        field2681++;
        Field var5 = arg1.getDeclaredField(arg0);
        return var5.getInt(arg3);
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V", line = 650)
    private final void method1346(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field2679++;
        Class var2 = class486.field6999.getClass();
        this.field2697 = (Image) this.method1338("bar", 16, var2);
        this.field2676 = (Image) this.method1338("background", 16, var2);
        this.field2666 = (Image) this.method1338("left", 16, var2);
        this.field2669 = (Image) this.method1338("right", 16, var2);
        this.field2671 = (Image) this.method1338("top", 16, var2);
        this.field2689 = (Image) this.method1338("bottom", 16, var2);
        this.field2680 = (Image) this.method1338("bodyLeft", 16, var2);
        this.field2663 = (Image) this.method1338("bodyRight", 16, var2);
        this.field2691 = (Image) this.method1338("bodyFill", 16, var2);
        this.field2672 = (Font) this.method1338("bf", 16, var2);
        if (arg0 >= -44) {
            field2688 = -66;
        }
        this.field2686 = (FontMetrics) this.method1338("bfm", 16, var2);
        this.field2683 = (Color) this.method1338("colourtext", 16, var2);
        Object var3 = this.method1338("lb", 16, var2);
        Class var4 = var3.getClass();
        this.field2690 = this.method1347(-300, "xMiddle", var4, var3);
        this.field2667 = this.method1347(-300, "yMiddle", var4, var3);
        this.field2675 = this.method1345("xOffset", var4, 512, var3);
        this.field2687 = this.method1345("yOffset", var4, 512, var3);
        this.field2668 = this.method1345("width", var4, 512, var3);
        this.field2693 = this.method1345("height", var4, 512, var3);
        this.field2677 = this.method1345("boxXOffset", var4, 512, var3);
        this.field2692 = this.method1345("boxYOffset", var4, 512, var3);
        this.field2674 = this.method1345("boxWidth", var4, 512, var3);
        this.field2662 = this.method1345("textYOffset", var4, 512, var3);
        this.field2661 = this.method1345("offsetPerTenCycles", var4, 512, var3);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z", line = 690)
    private final boolean method1347(int arg0, String arg1, Class arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg0 != -300) {
            this.field2689 = null;
        }
        field2698++;
        Field var5 = arg2.getDeclaredField(arg1);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I", line = 709)
    private final int method1348(int arg0, int arg1) {
        field2664++;
        if (this.field2667) {
            return (class565.field8187 - arg1) / 2;
        } else {
            if (arg0 != 2) {
                method1339(29, null, -127, -24, null);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lha;Z)V", line = 727)
    public static final void method1349(class543 arg0, boolean arg1) {
        if (!arg1) {
            method1339(-63, null, -57, 83, null);
        }
        field2673++;
        class461.field6565 = new class297[class346.field4952.length];
        for (int var2 = 0; var2 < class346.field4952.length; var2++) {
            int var3 = class346.field4952[var2];
            class502 var4 = class534.method3234(class714.field10077, -128, var3);
            class400 var5 = arg0.method322(var4, class676.method3847(class595.field8457, var3), true);
            class461.field6565[var2] = new class297(var5, var4);
        }
    }
}
