import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class225 {

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    private int field3564 = -1;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    private int field3576 = 0;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lma;")
    private class5 field3572 = new class5();

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Z")
    public boolean field3583 = false;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[[I")
    private int[][] field3570;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[Lwj;")
    private class174[] field3562;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3580 = "flash2:";

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "J")
    public static long field3569 = 0L;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "[[B")
    public static byte[][] field3582 = new byte[50][];

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "[I")
    public static int[] field3567 = new int[] { 0, 3, 7, 0, 0, 11, 0, 0, 0, 0, 9, 0, 0, 0, 28, -2, 0, 0, 10, 0, 14, -2, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 4, -1, 0, 0, 0, 6, 0, -1, 7, 0, 0, 6, 0, 0, -2, 0, 0, 0, 12, -1, 0, 2, 8, -2, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 17, 5, 0, 0, 3, 0, 0, -1, 0, -2, -2, 0, 15, 6, 8, 0, 0, 3, 2, 8, 12, 0, 0, 0, 0, 6, 0, 0, 0, 15, 0, 12, 3, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 6, 0, 8, 0, 0, 0, -1, -2, 0, 0, -1, 0, -2, 8, 5, 0, 0, -1, 6, 0, 1, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 10, 14, 0, 0, 0, 0, 0, 2, 5, 0, 12, 0, 3, 0, 0, 8, -1, 0, 0, 2, 0, -1, 0, 7, 0, 0, -1, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 2, 0, 0, -2, 0, 0, 0, 3, 4, 7, 0, 0, 0, -1, 0, 0, -1, 8, 0, 0, 6, 6, 0, 0, 0, 0, 10, 20, 0, 0, 6, 6, 0, 4, 0, 4, 0, -2, 1, 0, 0, -1, 0, 0, 3, 0, 1, 0, 8, 2 };

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "[[[Lsm;")
    public static class124[][][] field3566;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I", line = 7)
    public final int[] method1648(int arg0, int arg1) {
        if (arg1 != -16687) {
            return (int[]) null;
        }
        field3579++;
        if (this.field3581 == this.field3565) {
            this.field3583 = this.field3562[arg0] == null;
            this.field3562[arg0] = class128.field1877;
            return this.field3570[arg0];
        } else if (this.field3581 == 1) {
            this.field3583 = this.field3564 != arg0;
            this.field3564 = arg0;
            return this.field3570[0];
        } else {
            class174 var3 = this.field3562[arg0];
            if (var3 == null) {
                this.field3583 = true;
                if (this.field3576 < this.field3581) {
                    var3 = new class174(arg0, this.field3576);
                    this.field3576++;
                } else {
                    class174 var4 = (class174) this.field3572.method21(true);
                    var3 = new class174(arg0, var4.field2851);
                    this.field3562[var4.field2853] = null;
                    var4.method2028(13329);
                }
                this.field3562[arg0] = var3;
            } else {
                this.field3583 = false;
            }
            this.field3572.method28(var3, 11759);
            return this.field3570[var3.field2851];
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IILug;)[Lci;", line = 74)
    public static final class201[] method1649(int arg0, int arg1, class253 arg2) {
        field3575++;
        if (class192.method1415(arg2, arg1, 17082)) {
            if (arg0 >= -96) {
                method1655((Component) null, (byte) -27);
            }
            return class221.method1616(113);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)[[I", line = 93)
    public final int[][] method1650(byte arg0) {
        field3577++;
        if (this.field3581 != this.field3565) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3581; var2++) {
            this.field3562[var2] = class128.field1877;
        }
        if (arg0 != -68) {
            method1651(true, -26);
        }
        return this.field3570;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZI)V", line = 121)
    public static final void method1651(boolean arg0, int arg1) {
        field3563++;
        if (arg1 != 16377) {
            method1653(6);
        }
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (class109.field1458 && arg0) {
            var3 = 1;
            var4 = class174.field2857;
        } else {
            var3 = 4;
            var4 = class293.field4540;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class50.method373((byte) 96);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class339.field5298[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = (var9 & 0x3233106) >> 24;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 14 & 0x3FF;
                            int var12 = var9 >> 1 & 0x3;
                            int var13 = (var9 & 0x3FF9) >> 3;
                            int var14 = (var11 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class232.field3616.length; var15++) {
                                if (class232.field3616[var15] == var14 && var4[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class334.method2326(var4[var15], 8, arg0, var13, var7 * 8, var10, var12, class134.field1970, var6 * 8, var5, var11);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class126.method916(13513, var7 * 8, var6 * 8, 8, var5, 8);
                    }
                }
            }
        }
        if (var2 == null) {
            class34.field507 = -1;
            return;
        }
        class184.field2981 = var2[1];
        class318.field5037 = var2[4];
        class34.field507 = var2[0];
        class216.field3404 = var2[3];
        class84.field1150 = var2[2];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IJ)V", line = 234)
    public static final void method1652(int arg0, long arg1) {
        if (arg0 != 2698) {
            return;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
        field3568++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(III)V", line = 354)
    public class225(int arg0, int arg1, int arg2) {
        this.field3565 = arg1;
        this.field3581 = arg0;
        this.field3570 = new int[this.field3581][arg2];
        this.field3562 = new class174[this.field3565];
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 251)
    public static void method1653(int arg0) {
        field3582 = (byte[][]) null;
        field3567 = null;
        field3566 = (class124[][][]) null;
        field3580 = null;
        if (arg0 < 91) {
            field3569 = 115L;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I", line = 281)
    public static final int method1654(int arg0, int arg1) {
        field3573++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        if (arg0 == -2) {
            int var7 = var6 | var6 >>> 16;
            return arg1 & ~var7;
        } else {
            return -30;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 300)
    public static final void method1655(Component arg0, byte arg1) {
        arg0.removeKeyListener(class81.field1099);
        field3578++;
        arg0.removeFocusListener(class81.field1099);
        class279.field4301 = -1;
        if (arg1 != 3) {
            method1651(false, 13);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 333)
    public final void method1656(int arg0) {
        for (int var2 = 0; var2 < this.field3581; var2++) {
            this.field3570[var2] = null;
        }
        if (arg0 != -11962) {
            return;
        }
        this.field3570 = (int[][]) null;
        field3574++;
        this.field3562 = null;
        this.field3572.method27((byte) 91);
        this.field3572 = null;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I", line = 366)
    public static final int method1657(int arg0) {
        field3571++;
        try {
            if (class14.field221 == 0) {
                if (class68.field961 > (class219.method1609(-898) - 5000L)) {
                    return 0;
                }
                class1.field7 = class42.field581.method1011(class179.field2907, class64.field928, (byte) -8);
                class194.field3087 = class219.method1609(-898);
                class14.field221 = 1;
            }
            if ((class194.field3087 + 30000L) < class219.method1609(-898)) {
                return class72.method560(1000, arg0 - 125);
            }
            if (class14.field221 == 1) {
                if (class1.field7.field1595 == 2) {
                    return class72.method560(1001, -128);
                }
                if (class1.field7.field1595 != 1) {
                    return -1;
                }
                class275.field4247 = new class22((Socket) class1.field7.field1591, class42.field581);
                class183.field2965.field111 = 0;
                class1.field7 = null;
                int var1 = 0;
                if (class123.field1766) {
                    var1 = class244.field3812;
                }
                class183.field2965.method81((byte) -125, 23);
                class183.field2965.method34(var1, 294335144);
                class275.field4247.method221(arg0 + 102, class183.field2965.field115, 0, class183.field2965.field111);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(-92);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(74);
                }
                int var2 = class275.field4247.method214((byte) 83);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(88);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(arg0 + 92);
                }
                if (var2 != 0) {
                    return class72.method560(var2, -128);
                }
                class14.field221 = 2;
            }
            if (class14.field221 == 2) {
                if (class275.field4247.method217(arg0 ^ 0x7530) < 2) {
                    return -1;
                }
                class272.field4222 = class275.field4247.method214((byte) 83);
                class272.field4222 <<= 0x8;
                class272.field4222 += class275.field4247.method214((byte) 83);
                class210.field3317 = new byte[class272.field4222];
                class193.field3077 = 0;
                class14.field221 = 3;
            }
            if (class14.field221 != 3) {
                if (arg0 != 0) {
                    method1655((Component) null, (byte) 44);
                }
                return -1;
            }
            int var3 = class275.field4247.method217(30000);
            if (var3 < 1) {
                return -1;
            }
            if (class272.field4222 - class193.field3077 < var3) {
                var3 = class272.field4222 - class193.field3077;
            }
            class275.field4247.method219(var3, class193.field3077, class210.field3317, (byte) 24);
            class193.field3077 += var3;
            if (class272.field4222 > class193.field3077) {
                return -1;
            } else if (class101.method706(arg0, class210.field3317)) {
                class318.field5036 = new class187[class42.field575];
                int var4 = 0;
                for (int var5 = class136.field2065; var5 <= class96.field1267; var5++) {
                    class187 var6 = class291.method2036(var5, 30725);
                    if (var6 != null) {
                        class318.field5036[var4++] = var6;
                    }
                }
                class275.field4247.method218(true);
                class14.field221 = 0;
                class210.field3317 = null;
                class275.field4247 = null;
                class29.field415 = 0;
                class68.field961 = class219.method1609(-898);
                return 0;
            } else {
                return class72.method560(1002, -125);
            }
        } catch (IOException var8) {
            return class72.method560(1003, -125);
        }
    }
}
