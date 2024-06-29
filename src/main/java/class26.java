import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class26 extends class219 {

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    private int field365 = -1;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "Lvd;")
    private class117 field375 = null;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    private int field377 = -32768;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field382;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "Lfc;")
    private class196 field357;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "[I")
    public static int[] field361 = new int[] { 0, 0, 0, 5, 3, -2, 0, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0, 0, 0, -1, 0, 0, 0, 0, 6, 15, 0, 2, 0, 7, 0, 0, 0, 0, 0, 7, 4, 3, 0, 0, 0, 10, 0, 20, -1, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, -1, 0, 3, 6, 0, 0, 0, -2, 0, 0, 0, 5, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 3, 7, 0, 12, 0, 0, 2, 0, 0, 0, 0, 0, 8, 0, 14, 15, 0, -2, 12, 2, 9, 6, 0, -1, 3, 0, 0, 0, 8, 0, 0, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 6, -1, -2, 0, -1, 8, 2, 0, 0, -2, 0, 0, 1, 2, 1, 9, 0, 0, -2, 0, -1, -2, 0, 8, 0, 0, -1, 8, 0, -1, 0, 0, 10, 0, 8, 0, 0, 0, 0, 12, 0, 1, -2, 0, 0, 10, 0, 0, 0, 0, 0, 0, 5, 12, 0, 0, 10, 0, 0, 0, 0, 0, 2, 0, 14, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 3, 8, 0, 0, 0, 0, 0, -1, -1, 5, 0, 0, 2, 0, -2, 0, 8, 0, 0, 0, 5, 0, -1, 5, 8, 0, 3, 6, 0, 0, 0, 6, 0, 1, 28, -2, 0, 0, -1, 7, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Ljava/lang/String;")
    public static String field358 = " has logged in.";

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "[I")
    public static int[] field367 = new int[1000];

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "[I")
    public static int[] field373 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "Lqa;")
    private class112 field376;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "Lve;")
    public static class233 field378;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "[[Z")
    public static boolean[][] field355;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "[[[B")
    public static byte[][][] field372;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Ltk;")
    public final class219 method191(int arg0) {
        field374++;
        if (arg0 != 1) {
            this.field360 = -106;
        }
        return this.method193((byte) -126, false);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;ZIILjava/awt/Color;)V")
    public static final void method192(String arg0, boolean arg1, int arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class80.field1247.getGraphics();
            if (class251.field3831 == null) {
                class251.field3831 = new Font("Helvetica", 1, 13);
                class247.field3694 = class80.field1247.getFontMetrics(class251.field3831);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class214.field3080, class250.field3813);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class274.field4403 == null) {
                    class274.field4403 = class80.field1247.createImage(304, 34);
                }
                Graphics var6 = class274.field4403.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                if (arg2 != 1941262274) {
                    return;
                }
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class251.field3831);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class247.field3694.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class274.field4403, class214.field3080 / 2 - 152, class250.field3813 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class214.field3080 / 2 - 152;
                int var8 = class250.field3813 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class251.field3831);
                var5.setColor(Color.white);
                var5.drawString(arg0, (304 - class247.field3694.stringWidth(arg0)) / 2 + var7, var8 + 22);
            }
            if (class288.field4564 != null) {
                var5.setFont(class251.field3831);
                var5.setColor(Color.white);
                var5.drawString(class288.field4564, class214.field3080 / 2 - class247.field3694.stringWidth(class288.field4564) / 2, class250.field3813 / 2 + -26);
            }
        } catch (Exception var10) {
            class80.field1247.repaint();
        }
        field351++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BZ)Ltk;")
    private final class219 method193(byte arg0, boolean arg1) {
        boolean var3 = class176.field2502 != class107.field1556;
        field353++;
        class250 var4 = class91.method618(106, this.field362);
        int var5 = var4.field3761;
        if (var4.field3817 != null) {
            var4 = var4.method1639(-1);
        }
        if (var4 == null) {
            return null;
        }
        if (class69.field1076 != 0 && this.field368 && (this.field357 == null || this.field357 != null && this.field357.field2831 != var4.field3761)) {
            int var6 = var4.field3761;
            if (var4.field3761 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field357 = null;
            } else {
                this.field357 = class70.method478(var6, false);
            }
            if (this.field357 != null) {
                if (var4.field3810 && this.field357.field2815 != -1) {
                    this.field371 = (int) ((double) this.field357.field2818.length * Math.random());
                    this.field381 -= (int) ((double) this.field357.field2825[this.field371] * Math.random());
                } else {
                    this.field381 = class82.field1267 - 1;
                    this.field371 = 0;
                }
            }
        }
        int var7 = this.field360 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field3821;
            var9 = var4.field3808;
        } else {
            var8 = var4.field3808;
            var9 = var4.field3821;
        }
        int var10 = this.field370 + (var9 >> 1);
        int var11 = this.field370 + (var9 + 1 >> 1);
        if (arg0 >= -110) {
            this.method36();
        }
        int var12 = (var8 >> 1) + this.field382;
        int var13 = this.field382 + (var8 + 1 >> 1);
        this.method196(1, var10 * 128, var12 * 128);
        boolean var14 = !var3 && var4.field3758 && (this.field365 != var4.field3783 || (this.field371 != this.field350 || this.field357 != null && (this.field357.field2836 || class5.field80) && this.field371 != this.field356) && class264.field3967 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class107.field1556[this.field364];
        int var16 = var15[var10][var13] + var15[var11][var12] + var15[var10][var12] + var15[var11][var13] >> 2;
        int var17 = (this.field382 << 7) + (var8 << 6);
        int var18 = (this.field370 << 7) + (var9 << 6);
        int[][] var19 = null;
        if (var3) {
            var19 = class176.field2502[0];
        } else if (this.field364 < 3) {
            var19 = class107.field1556[this.field364 + 1];
        }
        boolean var20 = this.field375 == null;
        class110 var21;
        if (this.field357 == null) {
            var21 = var4.method1642(var15, this.field360, var18, var20 ? class79.field1214 : this.field375, this.field366, var17, false, -127, var19, var16, var14);
        } else {
            var21 = var4.method1647(var18, var15, var14, this.field360, this.field356, var17, this.field371, this.field366, var20 ? class79.field1214 : this.field375, var19, this.field357, (byte) 43, this.field349, var16);
        }
        return var21 == null ? null : var21.field1586;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static final void method194(int arg0, int arg1) {
        field352++;
        class203.field2943.method258(arg1, (byte) 105);
        if (arg0 != 23952) {
            field372 = null;
        }
        class259.field3917.method258(arg1, (byte) 82);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
    public static final void method195(int arg0) {
        field354++;
        if (class104.field1541 == 2) {
            if (class261.field3942 == class218.field3226 && class222.field3311 == class149.field2144) {
                class104.field1541 = 0;
                if (class268.field4204 && class19.field267[81] && class283.field4508 > 2) {
                    class256.method1716(52, class283.field4508 - 2);
                } else {
                    class256.method1716(98, class283.field4508 - 1);
                }
            }
        } else if (class279.field4465 == class261.field3942 && class42.field602 == class222.field3311) {
            class104.field1541 = 0;
            if (class268.field4204 && class19.field267[81] && class283.field4508 > 2) {
                class256.method1716(89, class283.field4508 - 2);
            } else {
                class256.method1716(104, class283.field4508 - 1);
            }
        } else {
            class218.field3226 = class279.field4465;
            class149.field2144 = class42.field602;
            class104.field1541 = 2;
        }
        if (arg0 <= 125) {
            field373 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIJILqa;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class112 arg10) {
        class219 var13 = this.method191(1);
        field380++;
        if (var13 != null) {
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field376);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(III)V")
    private final void method196(int arg0, int arg1, int arg2) {
        field359++;
        if (arg0 != 1) {
            this.method10(-69, -124, -84, -77, 87, -120, -127, 93, -49L, 32, (class112) null);
        }
        if (this.field357 == null) {
            return;
        }
        int var4 = class82.field1267 - this.field381;
        if (var4 > 100 && this.field357.field2815 > 0) {
            int var5 = this.field357.field2818.length - this.field357.field2815;
            while (this.field371 < var5 && this.field357.field2825[this.field371] < var4) {
                var4 -= this.field357.field2825[this.field371];
                this.field371++;
            }
            if (this.field371 >= var5) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field357.field2818.length; var7++) {
                    var6 += this.field357.field2825[var7];
                }
                var4 %= var6;
            }
            this.field356 = this.field371 + 1;
            if (this.field357.field2818.length <= this.field356) {
                this.field356 -= this.field357.field2815;
                if (this.field356 < 0 || this.field356 >= this.field357.field2818.length) {
                    this.field356 = -1;
                }
            }
        }
        while (var4 > this.field357.field2825[this.field371]) {
            class206.method1327(this.field371, arg0 + 65, this.field357, false, arg2, arg1);
            var4 -= this.field357.field2825[this.field371];
            this.field371++;
            if (this.field371 >= this.field357.field2818.length) {
                this.field371 -= this.field357.field2815;
                if (this.field371 < 0 || this.field371 >= this.field357.field2818.length) {
                    this.field357 = null;
                    break;
                }
            }
            this.field356 = this.field371 + 1;
            if (this.field357.field2818.length <= this.field356) {
                this.field356 -= this.field357.field2815;
                if (this.field356 < 0 || this.field357.field2818.length <= this.field356) {
                    this.field356 = -1;
                }
            }
        }
        this.field381 = class82.field1267 - var4;
        this.field349 = var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static void method197(byte arg0) {
        field358 = null;
        field361 = null;
        field355 = null;
        field372 = null;
        field378 = null;
        field373 = null;
        field367 = null;
        if (arg0 != -80) {
            field355 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
    public final void method23(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field369++;
        this.method196(1, arg3, arg4);
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static final void method198(int arg0) {
        field363++;
        for (class290 var1 = (class290) class86.field1323.method656(97); var1 != null; var1 = (class290) class86.field1323.method650(124)) {
            class73 var2 = var1.field4578;
            if (class163.field2364 != var2.field1143 || var2.field1129) {
                var1.method1706(-126);
            } else if (class82.field1267 >= var2.field1142) {
                var2.method492(class38.field566, true);
                if (var2.field1129) {
                    var1.method1706(-58);
                } else {
                    class43.method294(var2.field1143, var2.field1138, var2.field1128, var2.field1125, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != -1) {
            field361 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field383++;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()I")
    public final int method36() {
        field379++;
        return this.field377;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(IIIIIIIZLtk;)V")
    public class26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class219 arg8) {
        this.field360 = arg2;
        this.field382 = arg5;
        this.field370 = arg4;
        this.field366 = arg1;
        this.field364 = arg3;
        this.field362 = arg0;
        if (arg6 != -1) {
            this.field357 = class70.method478(arg6, false);
            this.field371 = 0;
            if (this.field357.field2818.length > 1) {
                this.field356 = 1;
            } else {
                this.field356 = 0;
            }
            this.field381 = class82.field1267 - 1;
            this.field349 = 1;
            if (this.field357.field2820 == 0 && arg8 != null && arg8 instanceof class26) {
                class26 var10 = (class26) arg8;
                if (this.field357 == var10.field357) {
                    this.field371 = var10.field371;
                    this.field381 = var10.field381;
                    this.field356 = var10.field356;
                    this.field349 = var10.field349;
                    return;
                }
            }
            if (arg7 && this.field357.field2815 != -1) {
                this.field371 = (int) (Math.random() * (double) this.field357.field2818.length);
                this.field356 = this.field371 + 1;
                if (this.field357.field2818.length <= this.field356) {
                    this.field356 -= this.field357.field2815;
                    if (this.field356 < 0 || this.field356 >= this.field357.field2818.length) {
                        this.field356 = -1;
                    }
                }
                this.field349 = (int) (Math.random() * (double) this.field357.field2825[this.field371]) + 1;
                this.field381 = class82.field1267 - this.field349;
            }
        }
        if (arg8 == null) {
            class250 var11 = class91.method618(108, this.field362);
            if (var11.field3817 != null) {
                this.field368 = true;
                return;
            }
        }
    }
}
