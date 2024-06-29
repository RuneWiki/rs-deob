import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class167 extends class136 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field3053 = -32768;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    private int field3035;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    private int field3050;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    private int field3038;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lwb;")
    private class236 field3048;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    private int field3042;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    private int field3045;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "Lmb;")
    public static class132 field3040 = class166.method1092("welle:", 118);

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field3047 = 0;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field3046 = 0;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lkg;")
    public static class115 field3049 = new class115(64);

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "Lmb;")
    public static class132 field3056 = class166.method1092("Ladevorgang )2 bitte warten Sie)3", 122);

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Lmb;")
    public static class132 field3057 = class166.method1092("Einloggen", 115);

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "Lmb;")
    public static class132 field3058 = class166.method1092("oberen Rand der Webseite ausw-=hlen)3", 113);

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)Lmf;")
    private final class136 method1094(byte arg0) {
        class84 var2 = class66.method414(0, this.field3041);
        field3043++;
        if (var2.field1413 != null) {
            var2 = var2.method515(-45);
        }
        if (var2 == null) {
            return null;
        }
        if (this.field3048 != null) {
            int var3 = class30.field460 - this.field3045;
            if (var3 > 100 && this.field3048.field4265 > 0) {
                int var4 = this.field3048.field4274.length - this.field3048.field4265;
                while (this.field3042 < var4 && var3 > this.field3048.field4253[this.field3042]) {
                    var3 -= this.field3048.field4253[this.field3042];
                    this.field3042++;
                }
                if (this.field3042 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field3048.field4274.length; var6++) {
                        var5 += this.field3048.field4253[var6];
                    }
                    var3 %= var5;
                }
            }
            label85: {
                do {
                    do {
                        if (var3 <= this.field3048.field4253[this.field3042]) {
                            break label85;
                        }
                        var3 -= this.field3048.field4253[this.field3042];
                        this.field3042++;
                    } while (this.field3042 < this.field3048.field4274.length);
                    this.field3042 -= this.field3048.field4265;
                } while (this.field3042 >= 0 && this.field3048.field4274.length > this.field3042);
                this.field3048 = null;
            }
            this.field3045 = class30.field460 - var3;
        }
        int var7;
        int var8;
        if (this.field3050 == 1 || this.field3050 == 3) {
            var7 = var2.field1440;
            var8 = var2.field1434;
        } else {
            var7 = var2.field1434;
            var8 = var2.field1440;
        }
        int var9 = this.field3035 + (var7 >> 1);
        int var10 = (var7 + 1 >> 1) + this.field3035;
        int var11 = (var8 >> 1) + this.field3038;
        int[][] var12 = class190.field3531[this.field3052];
        int var13 = (this.field3035 << 7) + (var7 << 6);
        int var14 = (this.field3038 << 7) + (var8 << 6);
        int var15 = (var8 + 1 >> 1) + this.field3038;
        int var16 = var12[var9][var11] + var12[var9][var15] + var12[var10][var15] + var12[var10][var11] >> 2;
        class81 var17;
        if (this.field3048 == null) {
            var17 = var2.method523(var14, this.field3050, this.field3039, var13, false, var16, var12, false);
        } else {
            var17 = var2.method514(this.field3048, var14, this.field3042, -1210803990, var16, this.field3050, var13, var12, this.field3039);
        }
        if (var17 == null) {
            return null;
        } else if (arg0 >= -10) {
            return null;
        } else {
            return var17.field1369;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static void method1095(boolean arg0) {
        if (!arg0) {
            method1097(-83, -7, 13, -32);
        }
        field3057 = null;
        field3049 = null;
        field3040 = null;
        field3058 = null;
        field3056 = null;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V")
    public static final void method1096(byte arg0) {
        class182.field3352 = false;
        int var1 = 29 / ((-arg0 - 38) / 61);
        field3055++;
        class66.field1096 = false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class136 var11 = this.method1094((byte) -52);
        field3037++;
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3053 = var11.method55();
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
    public static final void method1097(int arg0, int arg1, int arg2, int arg3) {
        field3034++;
        if (class137.method933(256, arg2) && arg1 >= 37) {
            class164.method1058(-1, 853933806, arg3, arg0, class97.field1866[arg2]);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
    public final int method55() {
        field3044++;
        return this.field3053;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIZLmf;)V")
    public class167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class136 arg8) {
        this.field3035 = arg4;
        this.field3041 = arg0;
        this.field3039 = arg1;
        this.field3050 = arg2;
        this.field3038 = arg5;
        this.field3052 = arg3;
        if (arg6 != -1) {
            this.field3048 = class99.method619(arg6, 4);
            this.field3042 = 0;
            this.field3045 = class30.field460 - 1;
            if (this.field3048.field4273 == 0 && arg8 != null && arg8 instanceof class167) {
                class167 var10 = (class167) arg8;
                if (this.field3048 == var10.field3048) {
                    this.field3045 = var10.field3045;
                    this.field3042 = var10.field3042;
                    return;
                }
            }
            if (arg7 && this.field3048.field4265 != -1) {
                this.field3042 = (int) (Math.random() * (double) this.field3048.field4274.length);
                this.field3045 -= (int) (Math.random() * (double) this.field3048.field4253[this.field3042]);
                return;
            }
        }
    }
}
