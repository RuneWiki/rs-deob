import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class96 extends class114 {

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
    private int field1376 = 2048;

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
    private int field1380 = 2048;

    @OriginalMember(owner = "client!kc", name = "Y", descriptor = "I")
    private int field1383 = 8192;

    @OriginalMember(owner = "client!kc", name = "eb", descriptor = "I")
    private int field1389 = 0;

    @OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
    private int field1384 = 12288;

    @OriginalMember(owner = "client!kc", name = "bb", descriptor = "I")
    private int field1386 = 0;

    @OriginalMember(owner = "client!kc", name = "ib", descriptor = "I")
    private int field1393 = 4096;

    @OriginalMember(owner = "client!kc", name = "U", descriptor = "Lwi;")
    public static class245 field1379 = new class245();

    @OriginalMember(owner = "client!kc", name = "fb", descriptor = "[I")
    public static int[] field1390 = new int[256];

    @OriginalMember(owner = "client!kc", name = "gb", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!kc", name = "hb", descriptor = "Ljava/lang/String;")
    public static String field1392 = "green:";

    @OriginalMember(owner = "client!kc", name = "jb", descriptor = "[I")
    public static int[] field1394 = new int[1000];

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!kc", name = "cb", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "[I")
    public static int[] field1381;

    @OriginalMember(owner = "client!kc", name = "db", descriptor = "[Lbf;")
    public static class108[] field1388;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field1383 = arg0.method1379(arg2 + -13034);
                                }
                            } else {
                                this.field1393 = arg0.method1379(arg2 + -13054);
                            }
                        } else {
                            this.field1384 = arg0.method1379(-122);
                        }
                    } else {
                        this.field1376 = arg0.method1379(arg2 ^ -13011);
                    }
                } else {
                    this.field1389 = arg0.method1379(-104);
                }
            } else {
                this.field1386 = arg0.method1379(arg2 + -13047);
            }
        } else {
            this.field1380 = arg0.method1379(-75);
        }
        ++field1374;
        if (arg2 != 12953) {
            field1390 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field1373;
        int[] var3 = super.field1630.method302(arg0, -118);
        if (super.field1630.field710) {
            int var4 = class159.field2209[arg0] + -2048;
            for (int var5 = 0; ~class145.field2009 < ~var5; ++var5) {
                int var6 = class99.field1434[var5] + -2048;
                int var7 = this.field1380 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = var8 > 2048 ? var8 + -4096 : var8;
                int var10 = this.field1389 + var6;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = var4 - -this.field1386;
                int var13 = ~var12 > 2047 ? var12 + 4096 : var12;
                int var14 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var15 = this.field1376 + var4;
                int var16 = ~var15 > 2047 ? var15 + 4096 : var15;
                int var17 = ~var13 >= -2049 ? var13 : var13 - 4096;
                int var18 = var16 <= 2048 ? var16 : var16 + -4096;
                var3[var5] = !this.method614(var17, var9, true) && !this.method612(!arg1, var14, var18) ? 0 : 4096;
            }
        }
        if (arg1) {
            this.field1393 = -71;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZII)Z")
    private final boolean method612(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method16(-78, false);
        }
        int var4 = (arg1 + arg2) * this.field1384 >> 12;
        ++field1382;
        int var5 = class134.field1843[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1384;
        int var7 = (var6 << 12) / this.field1383;
        int var8 = this.field1393 * var7 >> 12;
        return ~var8 < ~(-arg1 + arg2) && ~(-arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
    public static void method613(int arg0) {
        field1381 = null;
        field1390 = null;
        field1392 = null;
        if (arg0 != 21536) {
            method613(-6);
        }
        field1379 = null;
        field1388 = null;
        field1394 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)Z")
    private final boolean method614(int arg0, int arg1, boolean arg2) {
        ++field1372;
        if (!arg2) {
            return true;
        } else {
            int var4 = (arg0 - arg1) * this.field1384 >> 12;
            int var5 = class134.field1843[255 & var4 * 255 >> 12];
            int var6 = (var5 << 12) / this.field1384;
            int var7 = (var6 << 12) / this.field1383;
            int var8 = this.field1393 * var7 >> 12;
            return arg0 + arg1 < var8 && ~(-var8) > ~(arg0 + arg1);
        }
    }

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
    public static final void method615(int arg0) {
        if (arg0 != 12288) {
            method615(9);
        }
        ++field1385;
        class106.field1520.method944(88);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        class288.method1923((byte) -56);
        if (arg0 >= 101) {
            ++field1387;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
    public static final void method616(byte arg0) {
        ++field1377;
        int var1 = class295.field4707;
        int var2 = class189.field2868;
        int var3 = class243.field3815;
        int var4 = class227.field3557 + -3;
        byte var5 = 20;
        if (class267.field4296 == null || class188.field2849 == null) {
            if (class311.field5009.method2056(true, class142.field1949) && class311.field5009.method2056(true, class249.field3898)) {
                class267.field4296 = class245.method1609(0, -104, class142.field1949, class311.field5009);
                class188.field2849 = class245.method1609(0, -111, class249.field3898, class311.field5009);
            } else {
                class266.method1748(var1, var2, var3, var5, class104.field1506, -class53.field757 + 256);
            }
        }
        if (class267.field4296 != null && class188.field2849 != null) {
            int var6 = (-(class188.field2849.field1540 * 2) + var3) / class267.field4296.field1540;
            for (int var7 = 0; var6 > var7; ++var7) {
                class267.field4296.method694(var1 - (-(class267.field4296.field1540 * var7) + -class188.field2849.field1540), var2);
            }
            class188.field2849.method694(var1, var2);
            class188.field2849.method681(var1 + var3 - class188.field2849.field1540, var2);
        }
        class261.field4201.method206(class24.field386, var1 + 3, var2 + 14, class190.field2882, -1);
        class266.method1748(var1, var2 + var5, var3, -var5 + var4, class104.field1506, 256 - class53.field757);
        if (arg0 < -64) {
            int var8 = class17.field304;
            int var9 = class249.field3891;
            for (int var10 = 0; ~class179.field2721 < ~var10; ++var10) {
                int var18 = (-var10 + -1 + class179.field2721) * 15 + 13 + var2 - -var5;
                if (~var8 < ~var1 && var1 + var3 > var8 && ~var9 < ~(var18 - 13) && var9 < var18 + 3) {
                    class266.method1748(var1, var18 + -12, var3, 15, class218.field3388, -class88.field1268 + 256);
                }
            }
            if ((class178.field2607 == null || class80.field1100 == null || class95.field1370 == null) && class311.field5009.method2056(true, class154.field2139) && class311.field5009.method2056(true, class108.field1544) && class311.field5009.method2056(true, class111.field1588)) {
                class178.field2607 = class245.method1609(0, -123, class154.field2139, class311.field5009);
                class80.field1100 = class245.method1609(0, -109, class108.field1544, class311.field5009);
                class95.field1370 = class245.method1609(0, -95, class111.field1588, class311.field5009);
            }
            if (class178.field2607 != null && class80.field1100 != null && class95.field1370 != null) {
                int var11 = (-(class95.field1370.field1540 * 2) + var3) / class178.field2607.field1540;
                for (int var12 = 0; var12 < var11; ++var12) {
                    class178.field2607.method694(class178.field2607.field1540 * var12 + var1 - -class95.field1370.field1540, -class178.field2607.field1543 + var4 + var2);
                }
                int var13 = (var4 - class95.field1370.field1543 + -var5) / class80.field1100.field1543;
                for (int var14 = 0; ~var13 < ~var14; ++var14) {
                    class80.field1100.method694(var1, class80.field1100.field1543 * var14 + var5 + var2);
                    class80.field1100.method681(var1 - -var3 + -class80.field1100.field1540, class80.field1100.field1543 * var14 + var2 + var5);
                }
                class95.field1370.method694(var1, var2 + var4 + -class95.field1370.field1543);
                class95.field1370.method681(-class95.field1370.field1540 + var3 + var1, -class95.field1370.field1543 + var4 + var2);
            }
            for (int var15 = 0; class179.field2721 > var15; ++var15) {
                int var16 = class190.field2882;
                int var17 = (-var15 + class179.field2721 + -1) * 15 + (var2 + var5 - -13);
                if (var1 < var8 && var1 + var3 > var8 && ~var9 < ~(var17 + -13) && ~(var17 - -3) < ~var9) {
                    var16 = class198.field3030;
                }
                class261.field4201.method206(class45.method291(50, var15), var1 - -3, var17, var16, 0);
            }
            class137.method860(class227.field3557, class243.field3815, class189.field2868, (byte) 114, class295.field4707);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lnh;Lnh;ILih;)V")
    public static final void method617(class305 arg0, class305 arg1, int arg2, class73 arg3) {
        class57.field790 = arg3;
        if (arg2 == 1) {
            class65.field861 = arg1;
            ++field1378;
            class295.field4718 = arg0;
            if (class295.field4718 != null) {
                class189.field2866 = class295.field4718.method2067(1, (byte) 51);
            }
            if (class65.field861 != null) {
                class71.field1029 = class65.field861.method2067(1, (byte) 51);
            }
        }
    }
}
