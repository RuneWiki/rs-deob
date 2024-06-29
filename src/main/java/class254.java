import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class254 extends class86 {

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    private int field3915 = 1;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    private int field3912 = 1;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field3914 = 204;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field3913 = 0;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V", line = 3)
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BIIII)V", line = 8)
    public static final void method1885(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class294.field4577 < 100) {
            class311.method2213(false);
        }
        field3918++;
        if (class240.field3737) {
            class213.method1595(arg3, arg4, arg1 + arg3, arg2 + arg4);
        } else {
            class60.method598(arg3, arg4, arg1 + arg3, arg2 + arg4);
        }
        if (class294.field4577 < 100) {
            byte var5 = 20;
            int var6 = arg4 + (arg2 / 2) - var5 - 18;
            int var7 = arg3 + (arg1 / 2);
            if (class240.field3737) {
                class213.method1593(arg3, arg4, arg1, arg2, 0);
                class213.method1599(var7 - 152, var6, 304, 34, 9179409);
                class213.method1593(var7 - 150, var6 + 2, class294.field4577 * 3, 30, 9179409);
            } else {
                class60.method611(arg3, arg4, arg1, arg2, 0);
                class60.method604(var7 - 152, var6, 304, 34, 9179409);
                class60.method611(var7 - 150, var6 - -2, class294.field4577 * 3, 30, 9179409);
            }
            class64.field988.method1189(class199.field3098, var7, var5 + var6, 16777215, -1);
            return;
        }
        class305.field4747 = class335.field5120 - ((int) ((float) arg1 / class351.field5597));
        class199.field3096 = (int) ((float) (arg1 * 2) / class351.field5597);
        class36.field547 = class348.field5530 - ((int) ((float) arg2 / class351.field5597));
        class207.field3192 = (int) ((float) (arg2 * 2) / class351.field5597);
        int var8 = class335.field5120 + ((int) ((float) arg1 / class351.field5597));
        int var9 = (int) ((float) arg2 / class351.field5597) + class348.field5530;
        int var10 = class348.field5530 - ((int) ((float) arg2 / class351.field5597));
        int var11 = class335.field5120 - ((int) ((float) arg1 / class351.field5597));
        int var12 = -110 / ((22 - arg0) / 60);
        if (class240.field3737) {
            if (class76.field1117 == null || class76.field1117.field3366 != arg1 || class76.field1117.field3367 != arg2) {
                class76.field1117 = null;
                class76.field1117 = new class361(arg1, arg2);
            }
            class60.method595(class76.field1117.field5720, arg1, arg2);
            class351.method2472(var11, var10, var8, var9, 0, 0, arg1, arg2 + 1);
            class351.method2480();
            class317 var14 = class351.method2468();
            class324.method2298(var14, arg3, (byte) 104, arg4);
            class76.field1117.method2538();
            class213.method1589(class76.field1117.field5720, arg3, arg4, arg1, arg2);
            class60.field928 = null;
        } else {
            class351.method2472(var11, var10, var8, var9, arg3, arg4, arg1 + arg3, arg4 + 1 + arg2);
            class351.method2480();
            class317 var13 = class351.method2468();
            class324.method2298(var13, 0, (byte) 93, 0);
        }
        if (class300.field4664 > 0) {
            class332.field5098--;
            if (class332.field5098 == 0) {
                class332.field5098 = 20;
                class300.field4664--;
            }
        }
        if (!class116.field1783) {
            return;
        }
        int var15 = arg4 + arg2 - 8;
        int var16 = arg1 + arg3 - 5;
        int var17 = 16776960;
        class346.field5506.method1203("Fps:" + class101.field1522, var16, var15, 16776960, -1);
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = var15 - 15;
        if (var19 > 65536) {
            var17 = 16711680;
        }
        class346.field5506.method1203("Mem:" + var19 + "k", var16, var20, var17, -1);
        var15 = var20 - 15;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V", line = 134)
    public static final void method1886(boolean arg0, int arg1) {
        field3917++;
        if (!arg0) {
            field3916 = -4;
        }
        if (class14.field233 == arg1 && arg1 != 0) {
            class182 var2 = class138.field2284[arg1];
            var2.method229(class262.field4020);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLug;)V", line = 162)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3910++;
        if (arg0 == 0) {
            this.field3915 = arg2.method281(-126);
        } else if (arg0 == 1) {
            this.field3912 = arg2.method281(-127);
        } else if (arg0 == 2) {
            this.field3914 = arg2.method314((byte) 104);
        }
        if (arg1) {
            method1885((byte) -69, 4, 28, -2, -61);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            method1885((byte) -8, 58, 54, -69, -126);
        }
        int[] var3 = this.field1225.method1914(arg0, 113);
        field3911++;
        if (this.field1225.field3995) {
            for (int var4 = 0; var4 < class93.field1424; var4++) {
                int var5 = class347.field5515[var4];
                int var6 = class135.field2257[arg0];
                int var7 = this.field3915 * var5 >> 12;
                int var8 = this.field3912 * var6 >> 12;
                int var9 = var5 % (4096 / this.field3915) * this.field3915;
                int var10 = var6 % (4096 / this.field3912) * this.field3912;
                if (var10 < this.field3914) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field3914 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field3914) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }
}
