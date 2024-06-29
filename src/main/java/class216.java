import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class216 extends class304 {

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "I")
    private int field3316 = -1;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "La;")
    public static class281 field3312 = new class281();

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field3321 = 0;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "F")
    public static float field3313;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Lmg;")
    public static class64 field3310;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
    public int[] field3317;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(B)V", line = 5)
    public static final void method1544(byte arg0) {
        class192.field2992 = class168.method1273(0.4F, 8, 2048, true, 4, 8, 35, 1);
        if (arg0 < -86) {
            field3307++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 18)
    public final void method1250(int arg0) {
        field3311++;
        super.method1250(-121);
        if (arg0 < -99) {
            this.field3317 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I", line = 33)
    public final int method1545(int arg0) {
        int var2 = 74 % ((-arg0 - 24) / 62);
        field3314++;
        return this.field3316;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)V", line = 49)
    public static final void method1546(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class139.field2088; var3++) {
            for (int var4 = 0; var4 < class75.field1091; var4++) {
                for (int var5 = 0; var5 < class115.field1818; var5++) {
                    class79 var6 = class213.field3262[var3][var4][var5];
                    if (var6 != null) {
                        class35 var7 = var6.field1161;
                        if (var7 != null && var7.field511.method846()) {
                            class112.method856(var7.field511, var3, var4, var5, 1, 1);
                            if (var7.field508 != null && var7.field508.method846()) {
                                class112.method856(var7.field508, var3, var4, var5, 1, 1);
                                var7.field511.method835(var7.field508, 0, 0, 0, false);
                                var7.field508 = var7.field508.method844(arg0, arg1, arg2);
                            }
                            var7.field511 = var7.field511.method844(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1169; var8++) {
                            class228 var9 = var6.field1157[var8];
                            if (var9 != null && var9.field3480.method846()) {
                                class112.method856(var9.field3480, var3, var4, var5, var9.field3474 + 1 - var9.field3472, var9.field3484 - var9.field3475 + 1);
                                var9.field3480 = var9.field3480.method844(arg0, arg1, arg2);
                            }
                        }
                        class341 var10 = var6.field1179;
                        if (var10 != null && var10.field5305.method846()) {
                            class250.method1709(var10.field5305, var3, var4, var5);
                            var10.field5305 = var10.field5305.method844(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Z", line = 122)
    public final boolean method1547(int arg0) {
        field3315++;
        if (this.field3317 != null) {
            return true;
        } else if (this.field3316 >= 0) {
            class195 var2 = class276.field4285 < 0 ? class151.method1140(this.field3316, (byte) 119, class38.field571) : class2.method11(class276.field4285, this.field3316, class38.field571, 114);
            var2.method1423();
            this.field3305 = var2.field4184;
            this.field3317 = var2.field3017;
            this.field3319 = var2.field4175;
            return true;
        } else if (arg0 > -10) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 149)
    public class216() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "(I)V", line = 153)
    public static void method1548(int arg0) {
        field3312 = null;
        field3310 = null;
        if (arg0 != 0) {
            method1544((byte) 13);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lwm;II)V", line = 176)
    public final void method69(class254 arg0, int arg1, int arg2) {
        field3309++;
        if (arg1 == 0) {
            this.field3316 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            field3318 = -13;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lbc;B)V", line = 191)
    public static final void method1549(class160 arg0, byte arg1) {
        long var2 = 0L;
        field3308++;
        int var4 = 71 / ((-arg1 - 68) / 37);
        int var5 = -1;
        if (arg0.field2431 == 0) {
            var2 = class205.method1478(arg0.field2419, arg0.field2437, arg0.field2418);
        }
        if (arg0.field2431 == 1) {
            var2 = class319.method2217(arg0.field2419, arg0.field2437, arg0.field2418);
        }
        int var6 = 0;
        if (arg0.field2431 == 2) {
            var2 = class99.method745(arg0.field2419, arg0.field2437, arg0.field2418);
        }
        int var7 = 0;
        if (arg0.field2431 == 3) {
            var2 = class8.method77(arg0.field2419, arg0.field2437, arg0.field2418);
        }
        if (var2 != 0L) {
            var7 = ((int) var2 & 0x7F5A2) >> 14;
            var5 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = ((int) var2 & 0x3CCD90) >> 20;
        }
        arg0.field2423 = var7;
        arg0.field2422 = var5;
        arg0.field2429 = var6;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)[[I", line = 235)
    public int[][] method75(int arg0, int arg1) {
        int[][] var3 = this.field4663.method886(arg0, arg1 ^ 0x3);
        if (arg1 != 0) {
            field3310 = (class64) null;
        }
        if (this.field4663.field1820 && this.method1547(-61)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class109.field1648 == this.field3305 ? arg0 : this.field3305 * arg0 / class109.field1648) * this.field3319;
            if (class218.field3333 == this.field3319) {
                for (int var8 = 0; var8 < class218.field3333; var8++) {
                    int var9 = this.field3317[var7++];
                    var6[var8] = class149.method1117(var9 << 4, 4080);
                    var5[var8] = class149.method1117(var9, 65280) >> 4;
                    var4[var8] = class149.method1117(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class218.field3333; var10++) {
                    int var11 = this.field3319 * var10 / class218.field3333;
                    int var12 = this.field3317[var7 + var11];
                    var6[var10] = class149.method1117(4080, var12 << 4);
                    var5[var10] = class149.method1117(var12 >> 4, 4080);
                    var4[var10] = class149.method1117(4080, var12 >> 12);
                }
            }
        }
        field3320++;
        return var3;
    }
}
