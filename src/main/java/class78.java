import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Z")
    public boolean field1261 = false;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public int field1278 = -1;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Z")
    private boolean field1259 = false;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public int field1285 = -1;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public int field1280 = 99;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public int field1276 = -1;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    public int field1290 = 2;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public int field1288 = 5;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public int field1291 = -1;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public int field1294 = -1;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lp;")
    public static class280 field1258 = class18.method140((byte) -122, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1263 = 0;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lp;")
    public static class280 field1266 = class18.method140((byte) -122, "tremblement:");

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "Lp;")
    public static class280 field1264 = class18.method140((byte) -123, "Atteindre");

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Lp;")
    public static class280 field1271 = class18.method140((byte) -126, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lp;")
    public static class280 field1283 = class18.method140((byte) -128, "http:)4)4");

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "[I")
    public static int[] field1295 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "[I")
    public int[] field1268;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "[I")
    private int[] field1274;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "[I")
    public int[] field1275;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "[I")
    private int[] field1293;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "[[I")
    public int[][] field1267;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)I")
    public static final int method570(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method577(-65);
        }
        field1265++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lrf;I)V")
    public static final void method571(class277 arg0, int arg1) {
        field1282++;
        if (arg1 != -24808) {
            return;
        }
        if (class117.field2104 == arg0.field4852 || arg0.field4853 == -1 || arg0.field4821 != 0 || (arg0.field4861 + 1) > class207.method1401((byte) -22, arg0.field4853).field1268[arg0.field4830]) {
            int var2 = class117.field2104 - arg0.field4826;
            int var3 = arg0.field4852 - arg0.field4826;
            int var4 = arg0.field4856 * 128 + arg0.method984((byte) -34) * 64;
            int var5 = arg0.field4838 * 128 + arg0.method984((byte) -34) * 64;
            int var6 = arg0.field4828 * 128 + arg0.method984((byte) -34) * 64;
            int var7 = arg0.field4845 * 128 + (arg0.method984((byte) -34) * 64);
            arg0.field4793 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg0.field4791 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        arg0.field4833 = 0;
        if (arg0.field4806 == 0) {
            arg0.field4863 = 1024;
        }
        if (arg0.field4806 == 1) {
            arg0.field4863 = 1536;
        }
        if (arg0.field4806 == 2) {
            arg0.field4863 = 0;
        }
        if (arg0.field4806 == 3) {
            arg0.field4863 = 512;
        }
        arg0.field4809 = arg0.field4863;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BILik;)Lik;")
    public final class256 method572(byte arg0, int arg1, class256 arg2) {
        field1260++;
        int var4 = this.field1275[arg1];
        class149 var5 = class157.method1113(-93, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method1608(true, true);
        }
        class149 var7 = null;
        int var8 = 0;
        if (this.field1274 != null && this.field1274.length > arg1) {
            int var9 = this.field1274[arg1];
            var7 = class157.method1113(-73, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class256 var11 = arg2.method1608(!var5.method1032(var6, (byte) 1), !this.field1259);
            var11.method1617(var5, var6, this.field1259);
            return var11;
        }
        if (arg0 >= -63) {
            field1258 = null;
        }
        class256 var10 = arg2.method1608(!var5.method1032(var6, (byte) 1) & !var7.method1032(var8, (byte) 1), !this.field1259);
        var10.method1617(var5, var6, this.field1259);
        var10.method1617(var7, var8, this.field1259);
        return var10;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILik;Lph;IZ)Lik;")
    public final class256 method573(int arg0, class256 arg1, class78 arg2, int arg3, boolean arg4) {
        field1284++;
        if (!arg4) {
            method576(82);
        }
        int var6 = this.field1275[arg3];
        class149 var7 = class157.method1113(-57, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg2.method582((byte) 70, arg1, arg0);
        }
        int var9 = arg2.field1275[arg0];
        class149 var10 = class157.method1113(-89, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class256 var12 = arg1.method1608(!var7.method1032(var8, (byte) 1), !this.field1259);
            var12.method1617(var7, var8, this.field1259);
            return var12;
        } else {
            class256 var13 = arg1.method1608(!var7.method1032(var8, (byte) 1) & !var10.method1032(var11, (byte) 1), !arg2.field1259 & !this.field1259);
            var13.method1627(var7, var8, var10, var11, this.field1293, arg2.field1259 | this.field1259);
            return var13;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lik;BII)Lik;")
    public final class256 method574(class256 arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field1275[arg2];
        class149 var6 = class157.method1113(-79, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        field1289++;
        if (var6 == null) {
            return arg0.method1608(true, true);
        }
        int var8 = arg3 & 0x3;
        int var9 = -3 % ((arg1 - 45) / 61);
        class256 var10 = arg0.method1608(!var6.method1032(var7, (byte) 1), !this.field1259);
        if (var8 == 1) {
            var10.method1615();
        } else if (var8 == 2) {
            var10.method1607();
        } else if (var8 == 3) {
            var10.method1621();
        }
        var10.method1617(var6, var7, this.field1259);
        if (var8 == 1) {
            var10.method1621();
        } else if (var8 == 2) {
            var10.method1607();
        } else if (var8 == 3) {
            var10.method1615();
        }
        return var10;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1264 = null;
        if (arg0 != 9) {
            return;
        }
        field1266 = null;
        field1295 = null;
        field1258 = null;
        field1283 = null;
        field1271 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static final void method576(int arg0) {
        field1262++;
        class67 var1 = (class67) class230.field4009.method651(12916);
        if (arg0 != 626388240) {
            field1263 = 97;
        }
        while (var1 != null) {
            class192 var2 = var1.field1120;
            if (class231.field4013 != var2.field3361 || class117.field2104 > var2.field3390) {
                var1.method1146(arg0 - 626362081);
            } else if (var2.field3366 <= class117.field2104) {
                if (var2.field3382 > 0) {
                    class61 var3 = class46.field756[var2.field3382 - 1];
                    if (var3 != null && var3.field4791 >= 0 && var3.field4791 < 13312 && var3.field4793 >= 0 && var3.field4793 < 13312) {
                        var2.method1327(var3.field4791, var3.field4793, 117, class117.field2104, class158.method1123(var2.field3361, var3.field4791, -6230, var3.field4793) - var2.field3389);
                    }
                }
                if (var2.field3382 < 0) {
                    int var4 = -var2.field3382 - 1;
                    class142 var5;
                    if (class11.field240 == var4) {
                        var5 = class262.field4631;
                    } else {
                        var5 = class280.field4940[var4];
                    }
                    if (var5 != null && var5.field4791 >= 0 && var5.field4791 < 13312 && var5.field4793 >= 0 && var5.field4793 < 13312) {
                        var2.method1327(var5.field4791, var5.field4793, 113, class117.field2104, class158.method1123(var2.field3361, var5.field4791, -6230, var5.field4793) - var2.field3389);
                    }
                }
                var2.method1332(-19519, class165.field2889);
                class74.method559(class231.field4013, (int) var2.field3376, (int) var2.field3372, (int) var2.field3379, 60, var2, var2.field3364, -1L, false);
            }
            var1 = (class67) class230.field4009.method643(arg0 - 626377174);
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static final void method577(int arg0) {
        field1277++;
        for (class204 var1 = (class204) class211.field3636.method651(arg0 + 31231); var1 != null; var1 = (class204) class211.field3636.method643(11066)) {
            class224 var2 = var1.field3542;
            if (class231.field4013 != var2.field3862 || var2.field3859) {
                var1.method1146(26159);
            } else if (class117.field2104 >= var2.field3874) {
                var2.method1510(arg0 ^ 0x47AE, class165.field2889);
                if (var2.field3859) {
                    var1.method1146(26159);
                } else {
                    class74.method559(var2.field3862, var2.field3870, var2.field3881, var2.field3860, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != -18315) {
            method577(12);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILlj;I)V")
    private final void method578(int arg0, class25 arg1, int arg2) {
        if (arg2 != 0) {
            method571((class277) null, -100);
        }
        field1286++;
        if (arg0 == 1) {
            int var13 = arg1.method193((byte) 77);
            this.field1268 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1268[var14] = arg1.method193((byte) 77);
            }
            this.field1275 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1275[var15] = arg1.method193((byte) 77);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1275[var16] += arg1.method193((byte) 77) << 16;
            }
        } else if (arg0 == 2) {
            this.field1285 = arg1.method193((byte) 77);
        } else if (arg0 == 3) {
            int var4 = arg1.method189((byte) -103);
            this.field1293 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1293[var5] = arg1.method189((byte) -103);
            }
            this.field1293[var4] = 9999999;
        } else if (arg0 == 4) {
            this.field1261 = true;
        } else if (arg0 == 5) {
            this.field1288 = arg1.method189((byte) -103);
        } else if (arg0 == 6) {
            this.field1294 = arg1.method193((byte) 77);
        } else if (arg0 == 7) {
            this.field1278 = arg1.method193((byte) 77);
        } else if (arg0 == 8) {
            this.field1280 = arg1.method189((byte) -103);
        } else if (arg0 == 9) {
            this.field1291 = arg1.method189((byte) -103);
        } else if (arg0 == 10) {
            this.field1276 = arg1.method189((byte) -103);
        } else if (arg0 == 11) {
            this.field1290 = arg1.method189((byte) -103);
        } else if (arg0 == 12) {
            int var10 = arg1.method189((byte) -103);
            this.field1274 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1274[var11] = arg1.method193((byte) 77);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field1274[var12] = (arg1.method193((byte) 77) << 16) + this.field1274[var12];
            }
        } else if (arg0 == 13) {
            int var6 = arg1.method193((byte) 77);
            this.field1267 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method189((byte) -103);
                if (var8 > 0) {
                    this.field1267[var7] = new int[var8];
                    this.field1267[var7][0] = arg1.method230(15046);
                    for (int var9 = 1; var9 < var8; var9++) {
                        this.field1267[var7][var9] = arg1.method193((byte) 77);
                    }
                }
            }
            return;
        } else if (arg0 == 14) {
            this.field1259 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public final void method579(int arg0) {
        field1292++;
        if (this.field1276 == -1) {
            if (this.field1293 == null) {
                this.field1276 = 0;
            } else {
                this.field1276 = 2;
            }
        }
        if (~this.field1291 != arg0) {
            return;
        }
        if (this.field1293 == null) {
            this.field1291 = 0;
        } else {
            this.field1291 = 2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLlj;)V")
    public final void method580(byte arg0, class25 arg1) {
        while (true) {
            int var3 = arg1.method189((byte) -103);
            if (var3 == 0) {
                field1287++;
                if (arg0 != 92) {
                    field1273 = 49;
                    return;
                }
                return;
            }
            this.method578(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lik;ZI)Lik;")
    public final class256 method581(class256 arg0, boolean arg1, int arg2) {
        int var4 = this.field1275[arg2];
        field1279++;
        class149 var5 = class157.method1113(-122, var4 >> 16);
        if (!arg1) {
            return null;
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1623(true, true);
        } else {
            class256 var7 = arg0.method1623(!var5.method1032(var6, (byte) 1), !this.field1259);
            var7.method1617(var5, var6, this.field1259);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLik;I)Lik;")
    public final class256 method582(byte arg0, class256 arg1, int arg2) {
        field1269++;
        if (arg0 < 16) {
            return null;
        }
        int var4 = this.field1275[arg2];
        class149 var5 = class157.method1113(-81, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1608(true, true);
        } else {
            class256 var7 = arg1.method1608(!var5.method1032(var6, (byte) 1), !this.field1259);
            var7.method1617(var5, var6, this.field1259);
            return var7;
        }
    }
}
