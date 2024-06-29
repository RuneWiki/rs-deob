import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class227 extends class435 {

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "[Lgd;")
    public class227[] field3069;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Z")
    public boolean field3066;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Ljc;")
    public static class305 field3062 = new class305("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public int field3055;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Laa;")
    public class338 field3068;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Ldc;")
    public class5 field3059;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
    public int[] method62(int arg0, int arg1) {
        if (arg0 != 15811) {
            this.field3055 = 59;
        }
        field3054++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static final void method1451(int arg0) {
        field3056++;
        if (!class323.field4302) {
            return;
        }
        if (arg0 != 4226) {
            field3062 = null;
        }
        class450 var1 = class19.method108(true, class519.field7656, class235.field3143);
        if (var1 != null && var1.field6681 != null) {
            class293 var2 = new class293();
            var2.field3877 = var1;
            var2.field3866 = var1.field6681;
            class432.method2657(var2);
        }
        class273.field3644 = -1;
        class323.field4302 = false;
        class256.field3403 = -1;
        if (var1 != null) {
            class413.method2521(var1, false);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Z")
    public static final boolean method1452(int arg0) {
        if (arg0 != 50) {
            return true;
        }
        field3051++;
        try {
            return class390.method2361(-1);
        } catch (IOException var4) {
            class462.method2835((byte) 74);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class188.field2437 == null ? -1 : class188.field2437.method1090(arg0 ^ 0x30)) + "," + (class93.field1117 == null ? -1 : class93.field1117.method1090(2)) + "," + (class272.field3626 == null ? -1 : class272.field3626.method1090(2)) + " - " + class132.field1742 + "," + (class357.field4867 + class96.field1170.field1249[0]) + "," + (class418.field6074 + class96.field1170.field1251[0]) + " - ";
            for (int var3 = 0; var3 < class132.field1742 && var3 < 50; var3++) {
                var2 = var2 + class334.field4414.field5761[var3] + ",";
            }
            client.method1256(var5, -2020, var2);
            class321.method1900(false, -20147);
            return true;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public void method877(int arg0) {
        if (arg0 == 1) {
            field3063++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)I")
    public int method1453(int arg0) {
        if (arg0 == 2045302183) {
            field3060++;
            return -1;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    public void method1454(int arg0) {
        if (arg0 > -33) {
            method1461(-84, true, null);
        }
        if (this.field3066) {
            this.field3068.method1971(111);
            this.field3068 = null;
        } else {
            this.field3059.method31(22531);
            this.field3059 = null;
        }
        field3058++;
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
    public static void method1455(int arg0) {
        field3062 = null;
        if (arg0 < 29) {
            method1457(114, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lug;II)V")
    public void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 != 487215116) {
            this.field3069 = null;
        }
        field3065++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
    public int[][] method112(int arg0, boolean arg1) {
        field3057++;
        if (!arg1) {
            method1451(-94);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
    public static final int method1456(int arg0, int arg1) {
        field3052++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        int var4 = 7 % ((arg1 + 62) / 36);
        double var5 = (double) ((arg0 & 0xFF47) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var2;
        if (var2 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var2;
        if (var5 > var2) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var2 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var2) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var2 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        int var23 = (int) (var17 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var22 >> 5 << 7) + ((var21 & 0xFF) >> 2 << 10) + (var23 >> 1);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
    public static final void method1457(int arg0, byte arg1) {
        field3067++;
        class184 var2 = class277.method1682(arg0, 1, -55);
        if (arg1 >= -24) {
            method1461(99, true, null);
        }
        var2.method1075((byte) -68);
    }

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "(I)I")
    public int method1458(int arg0) {
        field3053++;
        if (arg0 != -1) {
            this.field3059 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)[I")
    public final int[] method1459(int arg0, int arg1, int arg2) {
        field3050++;
        int var4 = -90 % ((54 - arg1) / 53);
        return this.field3069[arg2].field3066 ? this.field3069[arg2].method62(15811, arg0) : this.field3069[arg2].method112(arg0, true)[0];
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)[[I")
    public final int[][] method1460(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1451(-123);
        }
        field3070++;
        if (this.field3069[arg1].field3066) {
            int[] var4 = this.field3069[arg1].method62(15811, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3069[arg1].method112(arg0, true);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1461(int arg0, boolean arg1, String arg2) {
        field3064++;
        class533.field7851.field4921 = 1;
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class237.field3158.field416; var6++) {
            class199 var9 = class237.field3158.method236(-18315, var6);
            if ((!arg1 || var9.field2586) && var9.field2601 == -1 && var9.field2591 == -1 && var9.field2602 == 0 && var9.field2623.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class530.field7780 = -1;
                    class374.field5076 = null;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class530.field7780 = var5;
        class474.field7029 = 0;
        class374.field5076 = var4;
        String[] var7 = new String[class530.field7780];
        if (arg0 < 65) {
            field3062 = null;
        }
        for (int var8 = 0; var8 < class530.field7780; var8++) {
            var7[var8] = class237.field3158.method236(-18315, var4[var8]).field2623;
        }
        class402.method2485(class374.field5076, (byte) -96, var7);
        class533.field7851.method2150(-45);
        class533.field7851.field4921 = 2;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)V")
    public void method1462(int arg0, int arg1, byte arg2) {
        field3061++;
        if (arg2 <= 43) {
            return;
        }
        int var4 = this.field3055 == 255 ? arg0 : this.field3055;
        if (this.field3066) {
            this.field3068 = new class338(var4, arg0, arg1);
        } else {
            this.field3059 = new class5(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IZ)V")
    public class227(int arg0, boolean arg1) {
        this.field3069 = new class227[arg0];
        this.field3066 = arg1;
    }
}
