import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class22 {

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "[C")
    public static char[] field392 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Ljava/lang/String;")
    public static String field409 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "Laj;")
    public static class151 field388;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Lnc;")
    public class268 field407;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
    public int[] field390;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    public static int[] field391;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[I")
    public int[] field393;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    public int[] field394;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "[I")
    public int[] field396;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "[I")
    public int[] field398;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "[I")
    public int[] field410;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "[Lnc;")
    public class268[] field402;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "[[I")
    public int[][] field399;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "[[I")
    public int[][] field412;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZJ)V")
    public static final void method141(boolean arg0, long arg1) {
        class236.field3980.field4160 = 0;
        field397++;
        class236.field3980.method1780(21, 81);
        class236.field3980.method1795(arg1, (byte) -59);
        class273.field4566 = 0;
        class10.field184 = -3;
        class70.field1165 = 1;
        if (arg0) {
            method145((byte) -73, -116);
        }
        class299.field4879 = 0;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method142(int arg0) {
        field392 = null;
        field409 = null;
        if (arg0 != 195) {
            method145((byte) -35, -26);
        }
        field391 = null;
        field388 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIB)I")
    public static final int method143(int arg0, int arg1, int arg2, byte arg3) {
        field406++;
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        return arg3 == -78 ? (arg0 >> 1) + ((arg1 >> 2 << 10) + (arg2 >> 5 << 7)) : -87;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method144(int arg0) {
        if (arg0 < 101) {
            method145((byte) -109, 127);
        }
        field404++;
        try {
            if (class101.field1608 == 1) {
                int var1 = class313.field5050.method749(-16840);
                if (var1 > 0 && class313.field5050.method750(-1)) {
                    int var2 = var1 - class3.field106;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class313.field5050.method781(var2, true);
                } else {
                    class313.field5050.method771(-27);
                    class313.field5050.method776((byte) 127);
                    class124.field2097 = null;
                    if (class23.field418 == null) {
                        class101.field1608 = 0;
                    } else {
                        class101.field1608 = 2;
                    }
                    class210.field3541 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class313.field5050.method771(-98);
            class210.field3541 = null;
            class124.field2097 = null;
            class101.field1608 = 0;
            class23.field418 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
    public static final void method145(byte arg0, int arg1) {
        class110.field1823.method98(1, arg1);
        field389++;
        class31.field518.method98(1, arg1);
        int var2 = 66 % ((16 - arg0) / 61);
        class228.field3853.method98(1, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(BI)Lei;")
    public static final class195 method146(byte arg0, int arg1) {
        field408++;
        class195 var2 = (class195) class9.field171.method99((long) arg1, true);
        if (var2 != null) {
            return var2;
        } else if (arg0 >= -38) {
            return null;
        } else {
            byte[] var3 = class108.field1768.method1149(36, (byte) 115, arg1);
            class195 var4 = new class195();
            var4.field3136 = arg1;
            if (var3 != null) {
                var4.method1394(new class249(var3), (byte) -60);
            }
            class9.field171.method100((long) arg1, var4, 58);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([BI)V")
    private final void method147(byte[] arg0, int arg1) {
        field401++;
        class249 var3 = new class249(class287.method2000((byte) 105, arg0));
        int var4 = var3.method1802((byte) 35);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field395 = var3.method1800(-96);
        } else {
            this.field395 = 0;
        }
        int var5 = var3.method1802((byte) -91);
        int var6 = -1;
        int var7 = arg1;
        this.field411 = var3.method1821((byte) 51);
        this.field393 = new int[this.field411];
        for (int var8 = 0; var8 < this.field411; var8++) {
            this.field393[var8] = var7 += var3.method1821((byte) 51);
            if (this.field393[var8] > var6) {
                var6 = this.field393[var8];
            }
        }
        this.field405 = var6 + 1;
        this.field398 = new int[this.field405];
        this.field412 = new int[this.field405][];
        this.field410 = new int[this.field405];
        this.field396 = new int[this.field405];
        this.field394 = new int[this.field405];
        if (var5 != 0) {
            this.field390 = new int[this.field405];
            for (int var9 = 0; var9 < this.field405; var9++) {
                this.field390[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field411; var10++) {
                this.field390[this.field393[var10]] = var3.method1800(-106);
            }
            this.field407 = new class268(this.field390);
        }
        for (int var11 = 0; var11 < this.field411; var11++) {
            this.field410[this.field393[var11]] = var3.method1800(97);
        }
        for (int var12 = 0; var12 < this.field411; var12++) {
            this.field394[this.field393[var12]] = var3.method1800(class284.method1990(arg1, 107));
        }
        for (int var13 = 0; var13 < this.field411; var13++) {
            this.field398[this.field393[var13]] = var3.method1821((byte) 51);
        }
        for (int var14 = 0; var14 < this.field411; var14++) {
            int var21 = 0;
            int var22 = this.field393[var14];
            int var23 = this.field398[var22];
            this.field412[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field412[var22][var25] = var21 += var3.method1821((byte) 51);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field396[var22] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field412[var22] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field402 = new class268[var6 + 1];
        this.field399 = new int[var6 + 1][];
        for (int var15 = 0; var15 < this.field411; var15++) {
            int var16 = this.field393[var15];
            int var17 = this.field398[var16];
            this.field399[var16] = new int[this.field396[var16]];
            for (int var18 = 0; var18 < this.field396[var16]; var18++) {
                this.field399[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field412[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field412[var16][var19];
                }
                this.field399[var16][var20] = var3.method1800(-46);
            }
            this.field402[var16] = new class268(this.field399[var16]);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "([BI)V")
    public class22(byte[] arg0, int arg1) {
        this.field400 = class168.method1252(arg0.length, arg0, (byte) 117);
        if (this.field400 != arg1) {
            throw new RuntimeException();
        }
        this.method147(arg0, 0);
    }
}
