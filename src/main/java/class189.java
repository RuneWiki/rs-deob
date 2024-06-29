import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class189 {

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "Lmc;")
    public class58 field2933 = new class58();

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "[I")
    public static int[] field2926 = new int[100];

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "Lmc;")
    private class58 field2936;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BLmc;)V", line = 5)
    public final void method1303(byte arg0, class58 arg1) {
        if (arg1.field876 != null) {
            arg1.method433(arg0 ^ 0x7C);
        }
        if (arg0 != 121) {
            this.field2933 = (class58) null;
        }
        field2934++;
        arg1.field874 = this.field2933;
        arg1.field876 = this.field2933.field876;
        arg1.field876.field874 = arg1;
        arg1.field874.field876 = arg1;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 22)
    public static void method1304(int arg0) {
        field2926 = null;
        if (arg0 != -6526) {
            field2926 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 40)
    public static final void method1305(byte arg0) {
        field2929++;
        class199 var1 = class300.field4960;
        synchronized (class300.field4960) {
            class347.field5566 = class305.field4989;
            int var2 = -76 / ((-arg0 - 52) / 34);
            class230.field3639++;
            if (class198.field3040 >= 0) {
                while (class320.field5276 != class198.field3040) {
                    int var3 = class186.field2880[class320.field5276];
                    class320.field5276 = class320.field5276 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class294.field4896[var3] = true;
                    } else {
                        class294.field4896[~var3] = false;
                    }
                }
            } else {
                for (int var4 = 0; var4 < 112; var4++) {
                    class294.field4896[var4] = false;
                }
                class198.field3040 = class320.field5276;
            }
            class305.field4989 = class294.field4890;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIIII)V", line = 82)
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2932++;
        int var8 = 2048 - arg3 & 0x7FF;
        if (arg2 != -465145744) {
            return;
        }
        int var9 = arg7 - 334;
        int var10 = 0;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var11 = 0;
        int var12 = (class141.field2270 - class37.field555) * var9 / 100 + class37.field555;
        int var13 = 2048 - arg5 & 0x7FF;
        int var14 = arg0 * var12 >> 8;
        int var15 = var14;
        if (var13 != 0) {
            int var16 = class272.field4470[var13];
            var11 = -var14 * var16 >> 16;
            int var17 = class272.field4480[var13];
            var15 = var14 * var17 >> 16;
        }
        if (var8 != 0) {
            int var18 = class272.field4470[var8];
            int var19 = class272.field4480[var8];
            var10 = var15 * var18 >> 16;
            var15 = var15 * var19 >> 16;
        }
        class147.field2369 = arg3;
        class41.field625 = arg4 - var10;
        class74.field1117 = arg1 - var11;
        class54.field817 = arg5;
        class259.field4098 = arg6 - var15;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsi;IIIIIII)V", line = 142)
    public static final void method1307(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2930++;
        int var8 = arg5 * arg5 + arg6 * arg6;
        if (var8 > arg4) {
            return;
        }
        if (arg2 != 9865) {
            field2926 = (int[]) null;
        }
        int var9 = Math.min(arg0.field4223 / 2, arg0.field4236 / 2);
        if (var8 <= var9 * var9) {
            class206.method1401(class221.field3427[arg1], arg7, arg0, arg6, arg3, arg5, -122);
            return;
        }
        var9 -= 10;
        int var10 = (int) class355.field5628 + class322.field5284 & 0x7FF;
        int var11 = class272.field4470[var10];
        int var12 = var11 * 256 / (class196.field3008 + 256);
        int var13 = class272.field4480[var10];
        int var14 = var13 * 256 / (class196.field3008 + 256);
        int var15 = arg6 * var14 - (arg5 * var12) >> 16;
        int var16 = arg5 * var14 + arg6 * var12 >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) ((double) var9 * Math.sin(var17));
        int var20 = (int) ((double) var9 * Math.cos(var17));
        if (class245.field3886) {
            ((class232) class292.field4844[arg1]).method1606(240, 240, (arg0.field4223 / 2 + arg3 + var19) * 16, (arg0.field4236 / 2 + arg7 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class137) class292.field4844[arg1]).method957(arg3 + (arg0.field4223 / 2) + var19 - 10, arg0.field4236 / 2 + -10 + -var20 + arg7, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Lmc;", line = 189)
    public final class58 method1308(int arg0) {
        field2927++;
        class58 var2 = this.field2933.field874;
        if (arg0 > -10) {
            this.method1303((byte) 62, (class58) null);
        }
        if (this.field2933 == var2) {
            this.field2936 = null;
            return null;
        } else {
            this.field2936 = var2.field874;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V", line = 219)
    public final void method1309(int arg0) {
        while (true) {
            class58 var2 = this.field2933.field874;
            if (this.field2933 == var2) {
                field2928++;
                if (arg0 != 8380) {
                    return;
                }
                this.field2936 = null;
                return;
            }
            var2.method433(5);
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 249)
    public static final void method1310(int arg0) {
        if (arg0 != 0) {
            method1306(76, 92, -114, 112, 95, 2, 76, 39);
        }
        class126.field1885++;
        field2935++;
        class195.field2992.method250(arg0 + 21066, 58);
        class195.field2992.method2206(class92.field1356, (byte) -95);
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)Lmc;", line = 262)
    public final class58 method1311(int arg0) {
        field2931++;
        class58 var2 = this.field2936;
        if (this.field2933 == var2) {
            this.field2936 = null;
            return null;
        }
        this.field2936 = var2.field874;
        if (arg0 != -1436335792) {
            this.method1308(-60);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 289)
    public class189() {
        this.field2933.field876 = this.field2933;
        this.field2933.field874 = this.field2933;
    }
}
