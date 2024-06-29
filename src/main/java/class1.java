import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class1 extends class79 {

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[B")
    public static byte[] field5 = new byte[32896];

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Lck;")
    public static class119 field16;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "[I")
    public static int[] field18;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "Lck;")
    public static class119 field17;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "I")
    public int field10;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lck;")
    public class119 field1;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "Lml;")
    public class134 field6;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lml;")
    public class134 field8;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "Lwi;")
    public static class23 field21;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "Lbe;")
    public static class81 field19;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Z")
    public boolean field13;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "[I")
    public static int[] field22;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "[Ljava/lang/Object;")
    public Object[] field14;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I", line = 5)
    public static final int method1(byte arg0, int arg1) {
        field2++;
        if (arg0 != 54) {
            field22 = (int[]) null;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLlh;)[Lea;", line = 23)
    public static final class72[] method2(byte arg0, class282 arg1) {
        field9++;
        if (!arg1.method1865(true)) {
            return new class72[0];
        }
        class275 var2 = arg1.method1875((byte) 124);
        while (var2.field4496 == 0) {
            class232.method1493(10L, (byte) -51);
        }
        if (var2.field4496 == 2) {
            return new class72[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field4499);
        class72[] var4 = new class72[var3.length >> 2];
        if (arg0 > -120) {
            field15 = -117;
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class72 var6 = new class72();
            var4[var5] = var6;
            var6.field1119 = var3[var5 << 2];
            var6.field1117 = var3[(var5 << 2) + 1];
            var6.field1122 = var3[(var5 << 2) + 2];
            var6.field1120 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 68)
    public static void method3(byte arg0) {
        field21 = null;
        field17 = null;
        field18 = null;
        field5 = null;
        field22 = null;
        if (arg0 != -10) {
            field21 = (class23) null;
        }
        field16 = null;
        field19 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZBIZIIZ)Lmd;", line = 101)
    public static final class88 method4(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field4++;
        class262 var8 = class205.method1296((byte) -84, arg5);
        if (arg3 > 1 && var8.field4211 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg3 >= var8.field4269[var10] && var8.field4269[var10] != 0) {
                    var9 = var8.field4211[var10];
                }
            }
            if (var9 != -1) {
                var8 = class205.method1296((byte) -86, var9);
            }
        }
        if (arg2 >= -7) {
            return (class88) null;
        }
        class48 var11 = var8.method1693(1);
        if (var11 == null) {
            return null;
        }
        class43 var12 = null;
        if (var8.field4199 != -1) {
            var12 = (class43) method4(1, false, (byte) -95, 10, true, var8.field4238, 0, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4265 != -1) {
            var12 = (class43) method4(arg0, false, (byte) -80, arg3, false, var8.field4245, arg6, true);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class286.field4721;
        int var14 = class286.field4719;
        int[] var15 = new int[4];
        int[] var16 = class286.field4718;
        class286.method1914(var15);
        class43 var17 = new class43(36, 32);
        class286.method1920(var17.field652, 36, 32);
        class284.method1895();
        class284.method1899(16, 16);
        class284.field4702 = false;
        int var18 = var8.field4240;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class284.field4698[var8.field4268] * var18 >> 16;
        int var20 = class284.field4699[var8.field4268] * var18 >> 16;
        var11.method212(0, var8.field4218, var8.field4208, var8.field4268, var8.field4235, var8.field4254 + var19 - (var11.method214() / 2), var8.field4254 + var20);
        if (arg0 >= 1) {
            var17.method334(1);
            if (arg0 >= 2) {
                var17.method334(16777215);
            }
            class286.method1920(var17.field652, 36, 32);
        }
        if (arg6 != 0) {
            var17.method337(arg6);
        }
        if (var8.field4199 != -1) {
            var12.method139(0, 0);
        } else if (var8.field4265 != -1) {
            class286.method1920(var12.field652, 36, 32);
            var17.method139(0, 0);
            var17 = var12;
        }
        if (arg1 && (var8.field4201 == 1 || arg3 != 1) && arg3 != -1) {
            class49.field765.method1827(class22.method169((byte) 6, arg3), 0, 9, 16776960, 1);
        }
        class286.method1920(var16, var14, var13);
        class286.method1918(var15);
        class284.method1895();
        class284.field4702 = true;
        return arg7 ? var17 : new class160(var17);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V", line = 236)
    public static final void method5(byte arg0) {
        field7++;
        int var1 = class22.field333.method961(124, 8);
        if (var1 < class233.field3757) {
            for (int var2 = var1; var2 < class233.field3757; var2++) {
                class157.field2502[class193.field3089++] = class226.field3609[var2];
            }
        }
        if (class233.field3757 < var1) {
            throw new RuntimeException("gppov1");
        }
        class233.field3757 = 0;
        int var3 = 0;
        if (arg0 >= -127) {
            return;
        }
        while (var3 < var1) {
            int var4 = class226.field3609[var3];
            class292 var5 = class23.field346[var4];
            int var6 = class22.field333.method961(-113, 1);
            if (var6 == 0) {
                class226.field3609[class233.field3757++] = var4;
                var5.field4984 = field15;
            } else {
                int var7 = class22.field333.method961(-127, 2);
                if (var7 == 0) {
                    class226.field3609[class233.field3757++] = var4;
                    var5.field4984 = field15;
                    class113.field1723[class81.field1238++] = var4;
                } else if (var7 == 1) {
                    class226.field3609[class233.field3757++] = var4;
                    var5.field4984 = field15;
                    int var8 = class22.field333.method961(-121, 3);
                    var5.method1985(var8, false, (byte) -41);
                    int var9 = class22.field333.method961(8, 1);
                    if (var9 == 1) {
                        class113.field1723[class81.field1238++] = var4;
                    }
                } else if (var7 == 2) {
                    class226.field3609[class233.field3757++] = var4;
                    var5.field4984 = field15;
                    int var10 = class22.field333.method961(82, 3);
                    var5.method1985(var10, true, (byte) -41);
                    int var11 = class22.field333.method961(-104, 3);
                    var5.method1985(var11, true, (byte) -41);
                    int var12 = class22.field333.method961(-107, 1);
                    if (var12 == 1) {
                        class113.field1723[class81.field1238++] = var4;
                    }
                } else if (var7 == 3) {
                    class157.field2502[class193.field3089++] = var4;
                }
            }
            var3++;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field5[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field16 = class298.method1987((byte) 18, "Lade Konfiguration )2 ");
        field18 = new int[32];
        field15 = 0;
        field17 = class298.method1987((byte) 125, "<)4col> x");
    }
}
