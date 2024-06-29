import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class197 extends class86 {

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "Z")
    private boolean field3076 = true;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "Z")
    private boolean field3083 = true;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "Z")
    public static boolean field3081 = false;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "Lfk;")
    public static class317 field3073 = new class317();

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "F")
    public static float field3087;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "[[[B")
    public static byte[][][] field3082;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "(I)V", line = 5)
    public static final void method1493(int arg0) {
        if (class188.field2950 != null) {
            class188.field2950.method2429(false);
            class188.field2950 = null;
        }
        class190.method1451((byte) -121);
        field3084++;
        class83.method749();
        for (int var1 = 0; var1 < 4; var1++) {
            class57.field905[var1].method2097(2097152);
        }
        class62.method623(25821, false);
        System.gc();
        class217.method1626(2, 115);
        class327.field5039 = -1;
        class212.field3331 = false;
        class71.method676((byte) -124, true);
        class311.field4843 = 0;
        class49.field755 = 0;
        class297.field4602 = 0;
        class293.field4555 = false;
        class358.field5696 = 0;
        for (int var2 = 0; var2 < class301.field4677.length; var2++) {
            class301.field4677[var2] = null;
        }
        class66.field995 = 0;
        class6.field80 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class177.field2795[var3] = null;
            class22.field337[var3] = null;
        }
        if (arg0 <= 40) {
            method1493(18);
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class110.field1683[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class349.field5540[var5][var6][var7] = null;
                }
            }
        }
        class72.method682(-1);
        class296.field4597 = 0;
        class223.method1677(-10890);
        class48.method470(true, -1);
        try {
            class141.method1176(class340.field5234.field4975, true, "loggedout");
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V", line = 100)
    public static final void method1494(int arg0, int arg1) {
        field3075++;
        if (arg0 != -105) {
            method1493(70);
        }
        class4.field47.method649((byte) 75, arg1);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BLsd;)V", line = 119)
    public static final void method1495(byte arg0, class244 arg1) {
        field3086++;
        int var2 = -59 / ((arg0 + 76) / 43);
        for (class160 var3 = (class160) class210.field3232.method2244((byte) -127); var3 != null; var3 = (class160) class210.field3232.method2241(-1)) {
            if (var3.field2549 == arg1) {
                if (var3.field2563 != null) {
                    class19.field316.method109(var3.field2563);
                    var3.field2563 = null;
                }
                var3.method1357(947647010);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V", line = 155)
    public static final void method1496(boolean arg0) {
        field3085++;
        int var1 = class252.field3884.length;
        if (arg0) {
            method1496(false);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class252.field3884[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class31.field480; var4++) {
                    if (class292.field4540[var2] == class111.field1701[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class111.field1701[class31.field480] = class292.field4540[var2];
                    var3 = class31.field480++;
                }
                int var5 = 0;
                class25 var6 = new class25(class252.field3884[var2]);
                while (var6.field397 < class252.field3884[var2].length && var5 < 511 && class6.field80 < 1023) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method314((byte) 41);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class292.field4540[var2] >> 8) * 64 + var10 - class358.field5696;
                    int var13 = (class292.field4540[var2] & 0xFF) * 64 + var11 - class49.field755;
                    class130 var14 = class343.method2417(var6.method314((byte) 54), (byte) -48);
                    if (class110.field1683[var7] == null && (var14.field2159 & 0x1) > 0 && class68.field1046 == var9 && var12 >= 0 && (var14.field2192 + var12) < 104 && var13 >= 0 && (var14.field2192 + var13) < 104) {
                        class110.field1683[var7] = new class244();
                        class244 var15 = class110.field1683[var7];
                        class126.field2114[class6.field80++] = var7;
                        var15.field1385 = class360.field5718;
                        var15.method1840(var14, 256);
                        var15.method821(59, var15.field3802.field2192);
                        var15.field1289 = var15.field1320 = class131.field2219[var15.field3802.field2207];
                        var15.field1288 = var15.field3802.field2189;
                        if (var15.field1288 == 0) {
                            var15.field1320 = 0;
                        }
                        var15.field1379 = var15.field3802.field2151;
                        var15.method819(var15.method808(-57), true, -1, var13, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V", line = 403)
    public class197() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)[I", line = 251)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            return (int[]) null;
        }
        field3078++;
        int[] var3 = this.field1225.method1914(arg0, -55);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, this.field3083 ? class280.field4324 - arg0 : arg0, 0);
            if (this.field3076) {
                for (int var5 = 0; var5 < class93.field1424; var5++) {
                    var3[var5] = var4[class313.field4848 - var5];
                }
            } else {
                class65.method641(var4, 0, var3, 0, class93.field1424);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(IB)[[I", line = 290)
    public final int[][] method156(int arg0, byte arg1) {
        field3079++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (arg1 > -126) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(this.field3083 ? class280.field4324 - arg0 : arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            if (this.field3076) {
                for (int var12 = 0; var12 < class93.field1424; var12++) {
                    var8[var12] = var5[class313.field4848 - var12];
                    var10[var12] = var7[class313.field4848 - var12];
                    var9[var12] = var6[class313.field4848 - var12];
                }
            } else {
                for (int var11 = 0; var11 < class93.field1424; var11++) {
                    var8[var11] = var5[var11];
                    var10[var11] = var7[var11];
                    var9[var11] = var6[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZLug;)V", line = 358)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3080++;
        if (arg1) {
            this.field3076 = false;
        }
        if (arg0 == 0) {
            this.field3076 = arg2.method281(-127) == 1;
        } else if (arg0 == 1) {
            this.field3083 = arg2.method281(70) == 1;
        } else if (arg0 == 2) {
            this.field1228 = arg2.method281(105) == 1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIZI)V", line = 409)
    public static final void method1497(int arg0, int arg1, boolean arg2, int arg3) {
        class72 var4 = class104.method911(arg3, arg0, 1, arg1);
        field3074++;
        if (var4 == null) {
            return;
        }
        class245.field3821 = new int[var4.field1071];
        if (arg2) {
            field3073 = (class317) null;
        }
        class245.field3822 = new String[var4.field1078];
        if (var4.field1082 == 15 || var4.field1082 == 17 || var4.field1082 == 16) {
            int var5 = 0;
            int var6 = 0;
            if (class122.field1950 != null) {
                var6 = class122.field1950.field5300;
                var5 = class122.field1950.field5350;
            }
            class245.field3821[0] = class268.field4137 - var5;
            class245.field3821[1] = class78.field1129 - var6;
        }
        class358.method2519(-12, 200000, var4);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(B)V", line = 443)
    public static void method1498(byte arg0) {
        field3082 = (byte[][][]) null;
        if (arg0 <= 115) {
            field3082 = (byte[][][]) ((byte[][][]) null);
        }
        field3073 = null;
    }
}
