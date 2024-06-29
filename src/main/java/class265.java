import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class265 extends class306 {

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    private int field4184 = 585;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4185 = "wishes to trade with you.";

    @OriginalMember(owner = "client!of", name = "K", descriptor = "[S")
    public static short[] field4187 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[B")
    public static byte[] field4188;

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 3)
    public class265() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        int[] var3 = this.field4757.method903(arg0, -47);
        field4186++;
        if (this.field4757.field1898) {
            int var4 = class111.field1553[arg0];
            for (int var5 = 0; var5 < class31.field367; var5++) {
                int var6 = class25.field288[var5];
                if (this.field4184 < var6 && var6 < (4096 - this.field4184) && (2048 - this.field4184) < var4 && var4 < this.field4184 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field4184);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field4184) && (this.field4184 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4184;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4184);
                } else if (this.field4184 > var4 || var4 > (4096 - this.field4184)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field4184;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field4184);
                } else if (this.field4184 <= var6 && (4096 - this.field4184) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field4184);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lnk;B)V", line = 93)
    public static final void method1870(class16 arg0, byte arg1) {
        int var2 = -16 % ((-arg1 - 8) / 59);
        class271.field4265 = arg0.method93(-47, "titlebg");
        class156.field2441 = arg0.method93(-60, "logo");
        field4189++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Loo;IIIIIIZ)V", line = 103)
    public static final void method1871(class51 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field596.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field596[var9] - class245.field3859;
            int var11 = arg0.field594[var9] - class36.field415;
            int var12 = arg0.field591[var9] - class42.field457;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field579 != null) {
                class51.field592[var9] = var13;
                class51.field598[var9] = var16;
                class51.field590[var9] = var17;
            }
            class51.field581[var9] = (var13 << 9) / var17 + class104.field1427;
            class51.field578[var9] = (var16 << 9) / var17 + class104.field1431;
        }
        class104.field1433 = 0;
        int var19 = arg0.field593.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field593[var20];
            int var22 = arg0.field586[var20];
            int var23 = arg0.field595[var20];
            int var24 = class51.field581[var21];
            int var25 = class51.field581[var22];
            int var26 = class51.field581[var23];
            int var27 = class51.field578[var21];
            int var28 = class51.field578[var22];
            int var29 = class51.field578[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class226.field3412 && class32.method224(class6.field70 + class104.field1427, class250.field3969 + class104.field1431, var27, var28, var29, var24, var25, var26)) {
                    class179.field2690 = arg5;
                    class347.field5511 = arg6;
                }
                if (!class272.field4317 && !arg7) {
                    class104.field1436 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class104.field1441 || var25 > class104.field1441 || var26 > class104.field1441) {
                        class104.field1436 = true;
                    }
                    if (arg0.field579 == null || arg0.field579[var20] == -1) {
                        if (arg0.field583[var20] != 12345678) {
                            class104.method662(var27, var28, var29, var24, var25, var26, arg0.field583[var20], arg0.field597[var20], arg0.field580[var20]);
                        }
                    } else if (!class139.field2087) {
                        int var30 = class104.field1438.method878(-86, arg0.field579[var20]);
                        class104.method662(var27, var28, var29, var24, var25, var26, class110.method711(var30, arg0.field583[var20]), class110.method711(var30, arg0.field597[var20]), class110.method711(var30, arg0.field580[var20]));
                    } else if (arg0.field588) {
                        class104.method672(var27, var28, var29, var24, var25, var26, arg0.field583[var20], arg0.field597[var20], arg0.field580[var20], class51.field592[0], class51.field592[1], class51.field592[3], class51.field598[0], class51.field598[1], class51.field598[3], class51.field590[0], class51.field590[1], class51.field590[3], arg0.field579[var20]);
                    } else {
                        class104.method672(var27, var28, var29, var24, var25, var26, arg0.field583[var20], arg0.field597[var20], arg0.field580[var20], class51.field592[var21], class51.field592[var22], class51.field592[var23], class51.field598[var21], class51.field598[var22], class51.field598[var23], class51.field590[var21], class51.field590[var22], class51.field590[var23], arg0.field579[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V", line = 217)
    public static void method1872(int arg0) {
        if (arg0 == 12345678) {
            field4185 = null;
            field4187 = null;
            field4188 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILlf;I)V", line = 237)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field4183++;
        if (arg2 == 0) {
            this.field4184 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            field4185 = (String) null;
        }
    }
}
