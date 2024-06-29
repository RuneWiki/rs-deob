import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class24 extends class264 {

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    private int field316 = -32768;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Z")
    private boolean field314 = false;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    private int field326 = -1;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "Lwj;")
    private class149 field313 = null;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    private int field340 = -1;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "Lq;")
    private class165 field341;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lj;")
    public static class209 field325 = new class209(64);

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "Lab;")
    public static class269 field339 = new class269();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Lt;")
    private class268 field318;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "Lra;")
    public static class38 field343;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method135(int arg0) {
        class172.field2726 = null;
        class129.field2072 = null;
        class40.field493 = null;
        field333++;
        if (arg0 > -86) {
            field339 = null;
        }
        class293.field4645 = null;
        class172.field2729 = null;
        class103.field1387 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)I")
    public static final int method136(int arg0, int arg1, int arg2) {
        field332++;
        int var3 = class280.method1872(arg0 - 1, arg2 - 1, (byte) -112) + (class280.method1872(arg0 - 1, arg2 + 1, (byte) -64) + class280.method1872(arg0 + 1, arg2 + -1, (byte) -108) + class280.method1872(arg0 + 1, arg2 + 1, (byte) -120));
        if (arg1 == 991) {
            int var4 = class280.method1872(arg0, arg2 - 1, (byte) -75) + class280.method1872(arg0, arg2 + 1, (byte) -77) - (-class280.method1872(arg0 + -1, arg2, (byte) -76) + -class280.method1872(arg0 + 1, arg2, (byte) -94));
            int var5 = class280.method1872(arg0, arg2, (byte) -68);
            return var4 / 8 + var3 / 16 + var5 / 4;
        } else {
            return -40;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method137(Component arg0, byte arg1) {
        field335++;
        arg0.removeMouseListener(class187.field2974);
        arg0.removeMouseMotionListener(class187.field2974);
        arg0.removeFocusListener(class187.field2974);
        class75.field947 = 0;
        if (arg1 != 29) {
            method135(-91);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)V")
    private final void method138(byte arg0, int arg1, int arg2) {
        if (this.field341 != null) {
            int var4 = class73.field924 - this.field334;
            if (var4 > 100 && this.field341.field2642 > 0) {
                int var5 = this.field341.field2624.length - this.field341.field2642;
                while (this.field317 < var5 && this.field341.field2634[this.field317] < var4) {
                    var4 -= this.field341.field2634[this.field317];
                    this.field317++;
                }
                if (this.field317 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field341.field2624.length; var7++) {
                        var6 += this.field341.field2634[var7];
                    }
                    var4 %= var6;
                }
                this.field337 = this.field317 + 1;
                if (this.field341.field2624.length <= this.field337) {
                    this.field337 -= this.field341.field2642;
                    if (this.field337 < 0 || this.field341.field2624.length <= this.field337) {
                        this.field337 = -1;
                    }
                }
            }
            while (this.field341.field2634[this.field317] < var4) {
                class221.method1562(this.field317, arg2, arg1, this.field341, (byte) 47, false);
                var4 -= this.field341.field2634[this.field317];
                this.field317++;
                if (this.field341.field2624.length <= this.field317) {
                    this.field317 -= this.field341.field2642;
                    if (this.field317 < 0 || this.field317 >= this.field341.field2624.length) {
                        this.field341 = null;
                        break;
                    }
                }
                this.field337 = this.field317 + 1;
                if (this.field341.field2624.length <= this.field337) {
                    this.field337 -= this.field341.field2642;
                    if (this.field337 < 0 || this.field341.field2624.length <= this.field337) {
                        this.field337 = -1;
                    }
                }
            }
            this.field334 = class73.field924 - var4;
            this.field342 = var4;
        }
        field328++;
        if (arg0 >= -58) {
            method135(-25);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BZ)Lpb;")
    private final class264 method139(byte arg0, boolean arg1) {
        field336++;
        boolean var3 = class25.field348 != class17.field209;
        class228 var4 = class256.method1749(this.field312, 0);
        int var5 = var4.field3663;
        if (var4.field3641 != null) {
            var4 = var4.method1629(-120);
        }
        if (var4 == null) {
            return null;
        }
        if (class297.field4695 != 0 && this.field314 && (this.field341 == null || this.field341 != null && this.field341.field2628 != var4.field3663)) {
            int var6 = var4.field3663;
            if (var4.field3663 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field341 = null;
            } else {
                this.field341 = class208.method1458((byte) -46, var6);
            }
            if (this.field341 != null) {
                if (var4.field3643 && this.field341.field2642 != -1) {
                    this.field317 = (int) (Math.random() * (double) this.field341.field2624.length);
                    this.field334 -= (int) ((double) this.field341.field2634[this.field317] * Math.random());
                } else {
                    this.field317 = 0;
                    this.field334 = class73.field924 - 1;
                }
            }
        }
        int var7 = this.field320 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field3714;
            var8 = var4.field3655;
        } else {
            var8 = var4.field3714;
            var9 = var4.field3655;
        }
        int var10 = (var9 >> 1) + this.field329;
        int var11 = (var9 + 1 >> 1) + this.field329;
        int var12 = this.field323 + (var8 + 1 >> 1);
        int var13 = (var8 >> 1) + this.field323;
        this.method138((byte) -106, var10 * 128, var13 * 128);
        boolean var14 = !var3 && var4.field3678 && (this.field340 != var4.field3697 || (this.field326 != this.field317 || this.field341 != null && (this.field341.field2641 || class204.field3211) && this.field337 != this.field317) && class160.field2549 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class17.field209[this.field319];
        int var16 = (this.field329 << 7) + (var9 << 6);
        int var17 = var15[var10][var12] + var15[var11][var12] + var15[var10][var13] + var15[var11][var13] >> 2;
        if (arg0 < 0) {
            this.field317 = -8;
        }
        int var18 = (this.field323 << 7) + (var8 << 6);
        int[][] var19 = null;
        boolean var20 = this.field313 == null;
        if (var3) {
            var19 = class25.field348[0];
        } else if (this.field319 < 3) {
            var19 = class17.field209[this.field319 + 1];
        }
        class293 var21;
        if (this.field341 == null) {
            var21 = var4.method1621(this.field321, this.field320, var14, 127, var16, false, var18, var17, var19, var20 ? class138.field2214 : this.field313, var15);
        } else {
            var21 = var4.method1620(10, var15, var16, this.field337, this.field321, var19, var20 ? class138.field2214 : this.field313, this.field317, this.field341, var17, this.field342, var14, var18, this.field320);
        }
        return var21 == null ? null : var21.field4650;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)V")
    public static final void method140(int arg0, int arg1, int arg2) {
        field324++;
        class233 var3 = class114.method746(arg1, 1228126432, arg2);
        var3.method1651((byte) 121);
        var3.field3855 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field331++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method138((byte) -119, arg3, arg4);
        field338++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method141(byte arg0) {
        field325 = null;
        if (arg0 != -15) {
            method135(70);
        }
        field343 = null;
        field339 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
    public final int method102() {
        field327++;
        return this.field316;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        class264 var13 = this.method142(false);
        field322++;
        if (var13 != null) {
            var13.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field318);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Lpb;")
    public final class264 method142(boolean arg0) {
        field315++;
        if (arg0) {
            method141((byte) -98);
        }
        return this.method139((byte) 87, false);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIIIIZLpb;)V")
    public class24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class264 arg8) {
        this.field320 = arg2;
        this.field319 = arg3;
        this.field321 = arg1;
        this.field323 = arg5;
        this.field312 = arg0;
        this.field329 = arg4;
        if (arg6 != -1) {
            this.field341 = class208.method1458((byte) -52, arg6);
            this.field317 = 0;
            if (this.field341.field2624.length <= 1) {
                this.field337 = 0;
            } else {
                this.field337 = 1;
            }
            this.field334 = class73.field924 - 1;
            this.field342 = 1;
            if (this.field341.field2647 == 0 && arg8 != null && arg8 instanceof class24) {
                class24 var10 = (class24) arg8;
                if (this.field341 == var10.field341) {
                    this.field337 = var10.field337;
                    this.field317 = var10.field317;
                    this.field334 = var10.field334;
                    this.field342 = var10.field342;
                    return;
                }
            }
            if (arg7 && this.field341.field2642 != -1) {
                this.field317 = (int) (Math.random() * (double) this.field341.field2624.length);
                this.field337 = this.field317 + 1;
                if (this.field337 >= this.field341.field2624.length) {
                    this.field337 -= this.field341.field2642;
                    if (this.field337 < 0 || this.field337 >= this.field341.field2624.length) {
                        this.field337 = -1;
                    }
                }
                this.field342 = (int) (Math.random() * (double) this.field341.field2634[this.field317]) + 1;
                this.field334 = class73.field924 - this.field342;
            }
        }
        if (arg8 == null) {
            class228 var11 = class256.method1749(this.field312, 0);
            if (var11.field3641 != null) {
                this.field314 = true;
                return;
            }
        }
    }
}
