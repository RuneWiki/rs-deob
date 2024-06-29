import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class141 {

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    private int field2055 = 0;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "[Lvg;")
    public class467[] field2048;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "Lpg;")
    public static class492 field2042 = new class492(74, 2);

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "[I")
    public static int[] field2044 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "[C")
    public static char[] field2049 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Lcm;")
    public static class449 field2046 = new class449(67, 7);

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Lui;")
    public static class375 field2054 = new class375(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "J")
    private long field2052;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "Lvg;")
    private class467 field2045;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "Lvg;")
    private class467 field2056;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public final void method937(int arg0) {
        for (int var2 = arg0; var2 < this.field2050; var2++) {
            class467 var3 = this.field2048[var2];
            while (true) {
                class467 var4 = var3.field6797;
                if (var3 == var4) {
                    break;
                }
                var4.method2785((byte) -120);
            }
        }
        field2043++;
        this.field2045 = null;
        this.field2056 = null;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)Lvg;")
    public final class467 method938(int arg0) {
        field2047++;
        int var2 = -7 / ((-arg0 - 16) / 43);
        if (this.field2055 > 0 && this.field2048[this.field2055 - 1] != this.field2056) {
            class467 var3 = this.field2056;
            this.field2056 = var3.field6797;
            return var3;
        }
        while (this.field2050 > this.field2055) {
            class467 var4 = this.field2048[this.field2055++].field6797;
            if (this.field2048[this.field2055 - 1] != var4) {
                this.field2056 = var4.field6797;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
    public final int method939(byte arg0) {
        field2037++;
        if (arg0 != 103) {
            return -115;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2050; var3++) {
            class467 var4 = this.field2048[var3];
            for (class467 var5 = var4.field6797; var5 != var4; var5 = var5.field6797) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(JILvg;)V")
    public final void method940(long arg0, int arg1, class467 arg2) {
        if (arg2.field6803 != null) {
            arg2.method2785((byte) -120);
        }
        field2041++;
        class467 var5 = this.field2048[(int) ((long) (this.field2050 - 1) & arg0)];
        arg2.field6797 = var5;
        if (arg1 <= -31) {
            arg2.field6803 = var5.field6803;
            arg2.field6803.field6797 = arg2;
            arg2.field6799 = arg0;
            arg2.field6797.field6803 = arg2;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public static void method941(int arg0) {
        field2044 = null;
        field2042 = null;
        field2049 = null;
        field2054 = null;
        field2046 = null;
        if (arg0 != 822) {
            field2046 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
    public final int method942(boolean arg0) {
        field2036++;
        if (!arg0) {
            this.method938(-20);
        }
        return this.field2050;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(JI)Lvg;")
    public final class467 method943(long arg0, int arg1) {
        field2039++;
        this.field2052 = arg0;
        class467 var4 = this.field2048[(int) (arg0 & (long) (this.field2050 + arg1))];
        for (this.field2045 = var4.field6797; this.field2045 != var4; this.field2045 = this.field2045.field6797) {
            if (this.field2045.field6799 == arg0) {
                class467 var5 = this.field2045;
                this.field2045 = this.field2045.field6797;
                return var5;
            }
        }
        this.field2045 = null;
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B[Lvg;)I")
    public final int method944(byte arg0, class467[] arg1) {
        field2038++;
        int var3 = 0;
        if (arg0 != 50) {
            method941(-115);
        }
        for (int var4 = 0; var4 < this.field2050; var4++) {
            class467 var5 = this.field2048[var4];
            for (class467 var6 = var5.field6797; var6 != var5; var6 = var6.field6797) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Lvg;")
    public final class467 method945(byte arg0) {
        if (arg0 > -121) {
            this.method945((byte) -58);
        }
        field2053++;
        if (this.field2045 == null) {
            return null;
        }
        class467 var2 = this.field2048[(int) ((long) (this.field2050 - 1) & this.field2052)];
        while (this.field2045 != var2) {
            if (this.field2045.field6799 == this.field2052) {
                class467 var3 = this.field2045;
                this.field2045 = this.field2045.field6797;
                return var3;
            }
            this.field2045 = this.field2045.field6797;
        }
        this.field2045 = null;
        return null;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method946(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class168.field2444++;
        class66.field913 = 0;
        for (int var6 = class143.field2065; var6 < class222.field3107; var6++) {
            class420[][] var17 = class380.field5802[var6];
            for (int var18 = class350.field5446; var18 < class180.field2570; var18++) {
                for (int var19 = class425.field6327; var19 < class95.field1379; var19++) {
                    class420 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class11.field171[var18 + class75.field1021 - class10.field149][var19 + class75.field1021 - class29.field458] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field6270 = true;
                            var20.field6266 = true;
                            if (var20.field6273 == null) {
                                var20.field6265 = false;
                            } else {
                                var20.field6265 = true;
                            }
                            class66.field913++;
                        } else {
                            var20.field6270 = false;
                            var20.field6266 = false;
                            var20.field6281 = 0;
                            if (var18 >= class10.field149 - 16 && var18 <= class10.field149 + 16 && var19 >= class29.field458 - 16 && var19 <= class29.field458 + 16 && (var20.field6261 != null || var20.field6271 != null || var20.field6277 != null || var20.field6283 != null || var20.field6260 != null || var20.field6273 != null)) {
                                class307.field4503.method545(var20, (byte) -13);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class455.field6683 == class187.field2632;
        for (int var8 = class143.field2065; var8 < class222.field3107; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class351.field5447.method1132() && var8 >= arg2 && arg1 != null) {
                int var10 = class11.field171.length;
                if (class11.field171.length + class350.field5446 > class492.field7186) {
                    var10 -= class11.field171.length + class350.field5446 - class492.field7186;
                }
                int var11 = class11.field171[0].length;
                if (class11.field171[0].length + class425.field6327 > class285.field4248) {
                    var11 -= class11.field171[0].length + class425.field6327 - class285.field4248;
                }
                int var12 = class338.field5356;
                while (true) {
                    if (var12 >= var10) {
                        class307.field4503.method542(class455.field6683[var8], true, var9, var8, true);
                        break;
                    }
                    int var13 = class350.field5446 + var12 - class338.field5356;
                    for (int var14 = class5.field73; var14 < var11; var14++) {
                        class25.field408[var12][var14] = false;
                        if (class11.field171[var12][var14]) {
                            int var15 = class425.field6327 + var14 - class5.field73;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class380.field5802[var16][var13][var15] != null && class380.field5802[var16][var13][var15].field6274 == var8) {
                                    class25.field408[var12][var14] = class380.field5802[var16][var13][var15].field6270;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class307.field4503.method542(class455.field6683[var8], true, var9, var8, false);
            }
            class307.field4503.method546(0);
        }
        if (!class491.method2916(true)) {
            class491.method2916(false);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FIIIBIIII[F)V")
    public static final void method947(float arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, float[] arg9) {
        int var10 = arg3 - arg6;
        int var11 = arg2 - arg5;
        int var12 = arg7 - arg8;
        field2040++;
        float var13 = arg9[2] * (float) var12 + arg9[0] * (float) var10 + arg9[1] * (float) var11;
        float var14 = arg9[5] * (float) var12 + arg9[4] * (float) var11 + arg9[3] * (float) var10;
        float var15 = arg9[8] * (float) var12 + arg9[6] * (float) var10 + arg9[7] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        if (arg4 != -87) {
            field2054 = null;
        }
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg0 + 0.5F;
        if (arg1 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class349.field5439 = var17;
        class470.field6874 = var18;
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Lvg;")
    public final class467 method948(int arg0) {
        field2051++;
        this.field2055 = 0;
        if (arg0 <= 15) {
            method947(0.39080688F, -34, -49, -82, (byte) 110, 59, 34, 60, 118, null);
        }
        return this.method938(-114);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(I)V")
    public class141(int arg0) {
        this.field2048 = new class467[arg0];
        this.field2050 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class467 var3 = this.field2048[var2] = new class467();
            var3.field6803 = var3;
            var3.field6797 = var3;
        }
    }
}
