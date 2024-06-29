import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class161 {

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    private int field2387 = -1;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    private int field2381 = 0;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lkr;")
    private class486 field2378 = new class486();

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "Z")
    public boolean field2395 = false;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    private int field2392;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[Lgm;")
    private class70[] field2384;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "[[[I")
    private int[][][] field2386;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2380 = -1;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Ldk;")
    public static class326 field2379 = new class326("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field2391 = 0;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I")
    public final int[][] method999(byte arg0, int arg1) {
        field2393++;
        if (arg0 != 104) {
            this.field2378 = null;
        }
        if (this.field2392 == this.field2383) {
            this.field2395 = this.field2384[arg1] == null;
            this.field2384[arg1] = class34.field446;
            return this.field2386[arg1];
        } else if (this.field2383 == 1) {
            this.field2395 = this.field2387 != arg1;
            this.field2387 = arg1;
            return this.field2386[0];
        } else {
            class70 var3 = this.field2384[arg1];
            if (var3 == null) {
                this.field2395 = true;
                if (this.field2383 > this.field2381) {
                    var3 = new class70(arg1, this.field2381);
                    this.field2381++;
                } else {
                    class70 var4 = (class70) this.field2378.method2847((byte) 86);
                    var3 = new class70(arg1, var4.field882);
                    this.field2384[var4.field877] = null;
                    var4.method1510((byte) -13);
                }
                this.field2384[arg1] = var3;
            } else {
                this.field2395 = false;
            }
            this.field2378.method2846(var3, arg0 + 1944);
            return this.field2386[var3.field882];
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static final void method1000(boolean arg0) {
        class277.field4082.method1478((byte) -118);
        if (!arg0) {
            field2389++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1001(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class141[] var7 = class273.field3974;
        int var8 = 0;
        if (arg2 != -12) {
            method1003(true, 91, 120, 19, (byte) -112);
        }
        while (var8 < var7.length) {
            class141 var9 = var7[var8];
            if (var9 != null && var9.field1877 == 2) {
                class38.method253((byte) -103, (var9.field1866 - class360.field5180 << 7) + var9.field1863, arg1 >> 1, arg4 >> 1, arg6, arg0, var9.field1864, (var9.field1871 - class240.field3602 << 7) + var9.field1865, var9.field1868 * 2);
                if (class421.field5882[0] > -1 && (class353.field5090 % 20) < 10) {
                    class375.field5397[var9.field1876].method1079(class421.field5882[0] + arg5 - 12, class421.field5882[1] + arg3 + -28);
                }
            }
            var8++;
        }
        field2377++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method1002(byte arg0) {
        field2390++;
        if (this.field2392 != this.field2383) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 65 / ((arg0 + 41) / 62);
        for (int var3 = 0; var3 < this.field2383; var3++) {
            this.field2384[var3] = class34.field446;
        }
        return this.field2386;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIIIB)V")
    public static final void method1003(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2388++;
        if (class78.method452(arg3, -3192) && arg4 >= 56) {
            class325.method2060(-1, arg2, arg1, class112.field1421[arg3], true, arg0);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method1004(int arg0) {
        if (arg0 > -32) {
            method1001(-21, 28, 33, -101, -18, 77, -58);
        }
        field2379 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIZIIII)V")
    public static final void method1005(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg5) {
            field2379 = null;
        }
        field2382++;
        if (arg8 < 128 || arg7 < 128 || arg8 > class58.field758 * 128 - 256 || arg7 > (class287.field4181 * 128 - 256)) {
            class421.field5882[0] = class421.field5882[1] = -1;
            return;
        }
        int var10 = class132.method835(arg7, arg6, arg8, 2002) - arg4;
        class478.field6711.method1012(arg1, 0, 0);
        class141.field1878.method609(class478.field6711);
        class141.field1878.method633(arg8, var10, arg7, class421.field5882);
        class478.field6711.method1012(-arg1, 0, 0);
        class141.field1878.method609(class478.field6711);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1006(int arg0, String arg1) {
        field2394++;
        if (arg1 == null) {
            return;
        }
        if (!(class237.field3564 < 100 || class241.field3612) || class237.field3564 >= 200) {
            class139.method884(class281.field4146.method2065(89, class326.field4711), 0);
            return;
        }
        String var2 = class191.method1180((byte) -123, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class237.field3564; var3++) {
            String var7 = class191.method1180((byte) -116, class24.field310[var3]);
            if (var7 != null && var7.equals(var2)) {
                class139.method884(arg1 + class211.field3206.method2065(-113, class326.field4711), 0);
                return;
            }
            if (class116.field1477[var3] != null) {
                String var8 = class191.method1180((byte) -112, class116.field1477[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class139.method884(arg1 + class211.field3206.method2065(124, class326.field4711), 0);
                    return;
                }
            }
        }
        for (int var4 = arg0; var4 < class350.field5065; var4++) {
            String var5 = class191.method1180((byte) -112, class7.field70[var4]);
            if (var5 != null && var5.equals(var2)) {
                class139.method884(class374.field5390.method2065(-102, class326.field4711) + arg1 + class450.field6226.method2065(37, class326.field4711), 0);
                return;
            }
            if (class204.field3025[var4] != null) {
                String var6 = class191.method1180((byte) -95, class204.field3025[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class139.method884(class374.field5390.method2065(-120, class326.field4711) + arg1 + class450.field6226.method2065(-108, class326.field4711), 0);
                    return;
                }
            }
        }
        if (class191.method1180((byte) -117, class492.field6935.field6277).equals(var2)) {
            class139.method884(class303.field4308.method2065(117, class326.field4711), 0);
        } else {
            class317.field4592++;
            class15.method110(class256.field3755, -125);
            class225.field3415.method1753(true, class89.method501(arg1, true));
            class225.field3415.method1730(arg0 ^ 0xFFFFD30C, arg1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public final void method1007(int arg0) {
        for (int var2 = 0; var2 < this.field2383; var2++) {
            this.field2386[var2][0] = null;
            this.field2386[var2][1] = null;
            this.field2386[var2][2] = null;
            this.field2386[var2] = null;
        }
        field2385++;
        this.field2386 = null;
        int var3 = -60 / ((-arg0 - 45) / 35);
        this.field2384 = null;
        this.field2378.method2838((byte) 16);
        this.field2378 = null;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(III)V")
    public class161(int arg0, int arg1, int arg2) {
        this.field2392 = arg1;
        this.field2383 = arg0;
        this.field2384 = new class70[this.field2392];
        this.field2386 = new int[this.field2383][3][arg2];
    }
}
