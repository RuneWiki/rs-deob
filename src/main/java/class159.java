import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class159 extends class70 {

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lge;")
    private class69 field2837 = null;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    private int field2843 = -1;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    private int field2847 = -1;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    private int field2830 = -32768;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "I")
    private int field2855;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    private int field2846;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    private int field2848;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    private int field2841;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lsa;")
    private class249 field2835;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    private int field2845;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field2831 = -2;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field2829 = -1;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public static int field2849 = 0;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field2834 = 0;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "Z")
    public static boolean field2850 = false;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)V")
    private final void method1203(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field2844 = -28;
        }
        field2836++;
        if (this.field2835 == null) {
            return;
        }
        int var4 = class259.field4584 - this.field2845;
        if (var4 > 100 && this.field2835.field4441 > 0) {
            int var5 = this.field2835.field4408.length - this.field2835.field4441;
            while (this.field2840 < var5 && var4 > this.field2835.field4433[this.field2840]) {
                var4 -= this.field2835.field4433[this.field2840];
                this.field2840++;
            }
            if (var5 <= this.field2840) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field2835.field4408.length; var7++) {
                    var6 += this.field2835.field4433[var7];
                }
                var4 %= var6;
            }
        }
        while (this.field2835.field4433[this.field2840] < var4) {
            class27.method263(this.field2835, arg2, true, arg1, false, this.field2840);
            var4 -= this.field2835.field4433[this.field2840];
            this.field2840++;
            if (this.field2840 >= this.field2835.field4408.length) {
                this.field2840 -= this.field2835.field4441;
                if (this.field2840 < 0 || this.field2835.field4408.length <= this.field2840) {
                    this.field2835 = null;
                    break;
                }
            }
        }
        this.field2845 = class259.field4584 - var4;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)Lhj;")
    private final class70 method1204(boolean arg0, int arg1) {
        field2842++;
        boolean var3 = class237.field4098 != class106.field1912;
        class194 var4 = class251.method1776(this.field2846, 65280);
        if (var4.field3437 != null) {
            var4 = var4.method1385((byte) 39);
        }
        if (var4 == null) {
            return null;
        }
        int var5 = this.field2839 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3500;
            var7 = var4.field3476;
        } else {
            var6 = var4.field3476;
            var7 = var4.field3500;
        }
        int var8 = this.field2841 + (var7 >> 1);
        int var9 = (var6 + 1 >> 1) + this.field2848;
        int var10 = this.field2841 + (var7 + 1 >> 1);
        int var11 = (var6 >> 1) + this.field2848;
        this.method1203(0, var8 * 128, var11 * 128);
        boolean var12 = !var3 && var4.field3438 && (this.field2843 != var4.field3480 || this.field2847 != this.field2840 && class206.field3633 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class106.field1912[this.field2844];
        int var14 = var13[var10][var9] + var13[var10][var11] + var13[var8][var11] + var13[var8][var9] >> 2;
        int var15 = (this.field2848 << 7) + (var6 << 6);
        int var16 = (this.field2841 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class237.field4098[0];
        } else if (this.field2844 < 3) {
            var17 = class106.field1912[this.field2844 + 1];
        }
        if (arg1 <= 61) {
            this.field2843 = -74;
        }
        boolean var18 = this.field2837 == null;
        class248 var19;
        if (this.field2835 == null) {
            var19 = var4.method1380(var12, false, false, this.field2839, var18 ? class25.field477 : this.field2837, var17, var14, var13, var15, this.field2855, var16);
        } else {
            var19 = var4.method1382(var17, (byte) -125, var13, var16, this.field2855, var15, this.field2840, this.field2839, var12, var14, this.field2835, var18 ? class25.field477 : this.field2837);
        }
        return var19 == null ? null : var19.field4401;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBII)V")
    public final void method602(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2833++;
        this.method1203(0, ((arg3 - arg4 >> 1) + arg4) * 128 + 64, ((-arg0 + arg1 >> 1) + arg0) * 128 + 64);
        int var6 = -55 / ((arg2 + 32) / 58);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lfk;BLfh;I)V")
    public static final void method1205(class14 arg0, byte arg1, class129 arg2, int arg3) {
        if (arg1 != -3) {
            field2852 = 123;
        }
        field2854++;
        class44 var4 = new class44();
        var4.field775 = arg0.method200(255);
        var4.field789 = arg0.method187((byte) 61);
        var4.field790 = new int[var4.field775];
        var4.field784 = new class193[var4.field775];
        var4.field786 = new byte[var4.field775][][];
        var4.field780 = new class193[var4.field775];
        var4.field777 = new int[var4.field775];
        var4.field783 = new int[var4.field775];
        for (int var5 = 0; var5 < var4.field775; var5++) {
            try {
                int var6 = arg0.method200(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method171((byte) 79).method1622(-6274));
                    int var18 = 0;
                    String var19 = new String(arg0.method171((byte) 79).method1622(-6274));
                    if (var6 == 1) {
                        var18 = arg0.method187((byte) 61);
                    }
                    var4.field790[var5] = var6;
                    var4.field783[var5] = var18;
                    var4.field780[var5] = arg2.method1015((byte) -72, var19, class112.method905(var17, (byte) 125));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method171((byte) 79).method1622(-6274));
                    String var8 = new String(arg0.method171((byte) 79).method1622(-6274));
                    int var9 = arg0.method200(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method171((byte) 79).method1622(-6274));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method187((byte) 61);
                            var12[var13] = new byte[var14];
                            arg0.method157(var12[var13], ~arg1, 0, var14);
                        }
                    }
                    var4.field790[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class112.method905(var10[var16], (byte) -100);
                    }
                    var4.field784[var5] = arg2.method1014(var8, 117, class112.method905(var7, (byte) 125), var15);
                    var4.field786[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field777[var5] = -1;
            } catch (SecurityException var21) {
                var4.field777[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field777[var5] = -3;
            } catch (Exception var23) {
                var4.field777[var5] = -4;
            } catch (Throwable var24) {
                var4.field777[var5] = -5;
            }
        }
        class113.field2026.method843(-5, var4);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2838++;
        class70 var11 = this.method1207(true);
        if (var11 != null) {
            var11.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2830 = var11.method496();
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
    public final int method496() {
        field2851++;
        return this.field2830;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lkk;III)[Lej;")
    public static final class49[] method1206(class223 arg0, int arg1, int arg2, int arg3) {
        field2832++;
        if (class205.method1440(arg1, arg2, 2, arg0)) {
            return arg3 == -1526922815 ? class95.method808(-9052) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lhj;")
    private final class70 method1207(boolean arg0) {
        field2853++;
        return arg0 ? this.method1204(false, 102) : null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIIIIZLhj;)V")
    public class159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class70 arg8) {
        this.field2855 = arg1;
        this.field2846 = arg0;
        this.field2848 = arg5;
        this.field2841 = arg4;
        this.field2844 = arg3;
        this.field2839 = arg2;
        if (arg6 != -1) {
            this.field2835 = class237.method1667(arg6, 97);
            this.field2840 = 0;
            this.field2845 = class259.field4584 - 1;
            if (this.field2835.field4428 == 0 && arg8 != null && arg8 instanceof class159) {
                class159 var10 = (class159) arg8;
                if (this.field2835 == var10.field2835) {
                    this.field2845 = var10.field2845;
                    this.field2840 = var10.field2840;
                    return;
                }
            }
            if (arg7 && this.field2835.field4441 != -1) {
                this.field2840 = (int) ((double) this.field2835.field4408.length * Math.random());
                this.field2845 -= (int) (Math.random() * (double) this.field2835.field4433[this.field2840]);
                return;
            }
        }
    }
}
