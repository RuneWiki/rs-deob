import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class66 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field1576;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    private int field1588;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[[I")
    private int[][] field1575;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lva;")
    private static class121 field1579 = class107.method797("Account locked as we suspect it has been stolen)3", -10983);

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lva;")
    public static class121 field1586 = field1579;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lpa;")
    public static class91 field1578 = new class91(5000);

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Lva;")
    private static class121 field1595 = class107.method797("Enter your username (V password)3", -10983);

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static volatile int field1590 = 0;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lva;")
    public static class121 field1593 = field1595;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public static int field1597 = 2301979;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field1594 = -1;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lm;")
    public static class72 field1589;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Z")
    public static boolean field1591;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)I", line = 4)
    public final int method462(int arg0, byte arg1) {
        field1574++;
        if (arg1 == -13) {
            if (this.field1575 != null) {
                arg0 = this.field1588 * arg0 / this.field1576;
            }
            return arg0;
        } else {
            return -24;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 26)
    public static final void method463(int arg0, Component arg1) {
        field1596++;
        arg1.addMouseListener(class23.field596);
        if (arg0 >= 85) {
            arg1.addMouseMotionListener(class23.field596);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 42)
    public static final void method464(Component arg0, boolean arg1) {
        if (!arg1) {
            method467(null, -1, 10);
        }
        field1581++;
        arg0.removeMouseListener(class23.field596);
        arg0.removeMouseMotionListener(class23.field596);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BB)[B", line = 55)
    public final byte[] method465(byte[] arg0, byte arg1) {
        if (this.field1575 != null) {
            int var3 = arg0.length * this.field1588 / this.field1576 + 14;
            int var4 = 0;
            int[] var5 = new int[var3];
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1575[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var5[var4 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1588 + var6;
                int var14 = var13 / this.field1576;
                var6 = var13 - this.field1576 * var14;
                var4 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var5[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        field1585++;
        if (arg1 >= -8) {
            method467(null, -111, 33);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)Z", line = 126)
    public static final boolean method466(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method471(false, 69, -47, (byte) -9);
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        class59 var3 = class20.method179(6, arg0);
        field1582++;
        return var3.method434(arg1, (byte) -78);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Led;II)V", line = 149)
    public static final void method467(class29 arg0, int arg1, int arg2) {
        if (arg0.field750 < 128 || arg0.field742 < 128 || arg0.field750 >= 13184 || arg0.field742 >= 13184) {
            arg0.field726 = 0;
            arg0.field793 = -1;
            arg0.field780 = 0;
            arg0.field751 = -1;
            arg0.field750 = arg0.field767[0] * 128 + arg0.field786 * 64;
            arg0.field742 = arg0.field730[0] * 128 + arg0.field786 * 64;
            arg0.method226(arg2 - 118);
        }
        field1577++;
        if (class62.field1494 == arg0 && (arg0.field750 < 1536 || arg0.field742 < 1536 || arg0.field750 >= 11776 || arg0.field742 >= 11776)) {
            arg0.field793 = -1;
            arg0.field780 = 0;
            arg0.field751 = -1;
            arg0.field726 = 0;
            arg0.field750 = arg0.field767[0] * 128 + arg0.field786 * 64;
            arg0.field742 = arg0.field730[0] * 128 + arg0.field786 * 64;
            arg0.method226(-103);
        }
        if (arg0.field726 > class115.field2614) {
            class62.method450(arg2 ^ 0x40, arg0);
        } else if (arg0.field780 >= class115.field2614) {
            class40.method268(arg0, -46);
        } else {
            class119.method912(-21303, arg0);
        }
        class118.method906(36, arg0);
        if (arg2 != 0) {
            method464(null, false);
        }
        class91.method624((byte) -106, arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 205)
    public static final void method468(int arg0) {
        if (arg0 != -5) {
            return;
        }
        field1587++;
        int var1 = class60.field1426.method898(class46.field1081);
        for (int var2 = 0; var2 < class26.field654; var2++) {
            int var10 = class60.field1426.method890(class21.field564[var2]);
            if (var1 < var10) {
                var1 = var10;
            }
        }
        int var3 = class26.field654 * 15 + 21;
        var1 += 8;
        if (class15.field280 > 4 && class82.field1909 > 4 && class15.field280 < 516 && class82.field1909 < 338) {
            class100.field2245 = true;
            class82.field1901 = class26.field654 * 15 + 22;
            class97.field2165 = var1;
            class13.field240 = 0;
            int var4 = class15.field280 - var1 / 2 - 4;
            if (var4 + var1 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            int var5 = class82.field1909 - 4;
            class91.field2064 = var4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class40.field904 = var5;
        }
        if (class15.field280 > 553 && class82.field1909 > 205 && class15.field280 < 743 && class82.field1909 < 466) {
            class100.field2245 = true;
            class82.field1901 = class26.field654 * 15 + 22;
            int var6 = class15.field280 - var1 / 2 - 553;
            class13.field240 = 1;
            class97.field2165 = var1;
            if (var6 < 0) {
                var6 = 0;
            } else if (var1 + var6 > 190) {
                var6 = 190 - var1;
            }
            int var7 = class82.field1909 - 205;
            class91.field2064 = var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 + var3 > 261) {
                var7 = 261 - var3;
            }
            class40.field904 = var7;
        }
        if (class15.field280 <= 17 || class82.field1909 <= 357 || class15.field280 >= 496 || class82.field1909 >= 453) {
            return;
        }
        class100.field2245 = true;
        int var8 = class15.field280 - var1 / 2 - 17;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class97.field2165 = var1;
        class13.field240 = 2;
        class82.field1901 = class26.field654 * 15 + 22;
        class91.field2064 = var8;
        int var9 = class82.field1909 - 357;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class40.field904 = var9;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 340)
    public final int method469(int arg0, int arg1) {
        if (arg1 != 7) {
            this.field1588 = 66;
        }
        if (this.field1575 != null) {
            arg0 = this.field1588 * arg0 / this.field1576 + 7;
        }
        field1584++;
        return arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 355)
    public static void method470(byte arg0) {
        field1589 = null;
        field1579 = null;
        field1586 = null;
        field1595 = null;
        field1578 = null;
        if (arg0 >= 55) {
            field1593 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIIB)Lva;", line = 370)
    public static final class121 method471(boolean arg0, int arg1, int arg2, byte arg3) {
        field1573++;
        int var4 = 1;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        if (arg3 != 37) {
            return null;
        }
        for (int var5 = arg2 / arg1; var5 != 0; var5 /= arg1) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg2 % arg1;
            arg2 /= arg1;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class121 var9 = new class121();
        var9.field2817 = var7;
        var9.field2783 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V", line = 436)
    public class66(int arg0, int arg1) {
        int var3 = class75.method517(arg1, arg0, 18963);
        int var4 = arg1 / var3;
        int var5 = arg0 / var3;
        this.field1576 = var5;
        this.field1588 = var4;
        if (var4 != var5) {
            this.field1575 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1575[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                double var11 = (double) var4 / (double) var5;
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var13 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
