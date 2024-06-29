import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class200 extends class240 {

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "Lcd;")
    public static class64 field3430 = class44.method335((byte) 71, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field3422 = 0;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "Lfa;")
    public static class188 field3436 = null;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "[Lnm;")
    public static class176[] field3432;

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "[Lwl;")
    private class82[] field3429;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 8)
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)[[I", line = 14)
    public final int[][] method286(byte arg0, int arg1) {
        field3423++;
        if (arg0 < 34) {
            field3425 = 99;
        }
        int[][] var3 = this.field4095.method1797(arg1, -42);
        if (this.field4095.field4355) {
            int var4 = class169.field2936;
            int var5 = class131.field2320;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field4095.method1798(0);
            this.method1405(var6, (byte) 126);
            for (int var8 = 0; var8 < class131.field2320; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class169.field2936; var14++) {
                    int var15 = var9[var14];
                    var13[var14] = class224.method1614(4080, var15 << 4);
                    var12[var14] = class224.method1614(4080, var15 >> 4);
                    var11[var14] = class224.method1614(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 76)
    public static final void method1402(boolean arg0) {
        class278.field4796 = null;
        class80.field1478 = null;
        class211.field3546 = null;
        class29.field496 = null;
        field3420++;
        class184.field3150 = null;
        class180.field3091 = null;
        class111.field2066 = null;
        class99.field1796 = null;
        class131.field2332 = null;
        class145.field2565 = null;
        class164.field2886 = null;
        class53.field856 = null;
        class69.field1322 = null;
        field3432 = null;
        class185.field3182 = null;
        if (arg0) {
            method1408((byte) -97);
        }
        class14.field315 = null;
        class11.field217 = null;
        class108.field2005 = null;
        class27.field436 = null;
        class137.field2437 = null;
        class273.field4682 = null;
        class75.field1419 = null;
        class189.field3254 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILkh;)V", line = 109)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field3429 = new class82[arg2.method152((byte) -104)];
            for (int var4 = 0; var4 < this.field3429.length; var4++) {
                int var5 = arg2.method152((byte) -70);
                if (var5 == 0) {
                    this.field3429[var4] = class304.method2126(122, arg2);
                } else if (var5 == 1) {
                    this.field3429[var4] = class34.method285(arg2, class74.method597(arg0, 88));
                } else if (var5 == 2) {
                    this.field3429[var4] = class264.method1850(arg2, 49);
                } else if (var5 == 3) {
                    this.field3429[var4] = class84.method647(true, arg2);
                }
            }
        } else if (arg1 == 1) {
            this.field4113 = arg2.method152((byte) -92) == 1;
        }
        field3431++;
        if (arg0 != 2) {
            this.method16(-40, 29, (class13) null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZII)V", line = 185)
    public static final void method1403(boolean arg0, int arg1, int arg2) {
        class134.field2390++;
        class17.field353.method1214(-60, 33);
        if (!arg0) {
            method1402(true);
        }
        class17.field353.method145(104, arg2);
        field3428++;
        class17.field353.method122((byte) 106, arg1);
    }

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V", line = 201)
    public static void method1404(int arg0) {
        if (arg0 != -1) {
            method1402(true);
        }
        field3432 = null;
        field3430 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([[IB)V", line = 215)
    private final void method1405(int[][] arg0, byte arg1) {
        field3424++;
        int var3 = class169.field2936;
        int var4 = 119 % ((arg1 - 63) / 60);
        int var5 = class131.field2320;
        class12.method99(arg0, 17);
        class232.method1665(class74.field1407, 0, class132.field2356, (byte) 123, 0);
        if (this.field3429 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field3429.length; var6++) {
            class82 var7 = this.field3429[var6];
            int var8 = var7.field1521;
            int var9 = var7.field1510;
            if (var8 < 0) {
                if (var9 >= 0) {
                    var7.method435(var3, var5, (byte) 111);
                }
            } else if (var9 < 0) {
                var7.method433(true, var3, var5);
            } else {
                var7.method434((byte) -104, var5, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)Lcd;", line = 280)
    public static final class64 method1406(byte arg0, String arg1) {
        field3421++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class64 var4 = new class64();
        var4.field1274 = 0;
        var4.field1252 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field1274++] = var2[var5];
            }
        }
        if (arg0 != 85) {
            method1408((byte) -54);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqi;IIIIIIII)V", line = 316)
    public static final void method1407(class290 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 != 2095812161) {
            method1407((class290) null, -50, -108, -109, -75, -28, -89, -52, 0);
        }
        int var9 = arg1 & 0x3;
        field3426++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg0.field4957;
            var11 = arg0.field5017;
        } else {
            var10 = arg0.field5017;
            var11 = arg0.field4957;
        }
        int var12;
        int var13;
        if (arg5 + var10 > 104) {
            var12 = arg5 + 1;
            var13 = arg5;
        } else {
            var12 = (var10 + 1 >> 1) + arg5;
            var13 = arg5 + (var10 >> 1);
        }
        int var14;
        int var15;
        if ((arg2 + var11) <= 104) {
            var14 = (var11 + 1 >> 1) + arg2;
            var15 = (var11 >> 1) + arg2;
        } else {
            var15 = arg2;
            var14 = arg2 + 1;
        }
        int var16 = (arg5 << 7) + (var10 << 6);
        int var17 = (arg2 << 7) + (var11 << 6);
        int[][] var18 = class96.field1764[arg7];
        int var19 = var18[var12][var14] + var18[var12][var15] + var18[var13][var14] + var18[var13][var15] >> 2;
        int var20 = 0;
        if (arg7 != 0) {
            int[][] var21 = class96.field1764[0];
            var20 = var19 - (var21[var12][var15] + var21[var13][var15] + var21[var13][var14] + var21[var12][var14] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg7 < 3) {
            var22 = class96.field1764[arg7 + 1];
        }
        class1 var23 = arg0.method2000(var17, var18, -1, (class176) null, var16, true, false, var22, arg4, var19, arg1);
        class302.method2120(var23.field1, var16 - arg8, var20, var17 - arg6);
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(B)[Leg;", line = 399)
    public static final class289[] method1408(byte arg0) {
        field3435++;
        if (class35.field571 == null) {
            class289[] var1 = class275.method1905(class228.field3876, -1);
            class289[] var2 = new class289[var1.length];
            int var3 = 0;
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class289 var5 = var1[var4];
                if ((var5.field4938 <= 0 || var5.field4938 >= 24) && var5.field4943 >= 800 && var5.field4944 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class289 var7 = var2[var6];
                        if (var5.field4943 == var7.field4943 && var5.field4944 == var7.field4944) {
                            if (var7.field4938 < var5.field4938) {
                                var2[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class35.field571 = new class289[var3];
            class95.method717(var2, 0, class35.field571, 0, var3);
            int[] var8 = new int[class35.field571.length];
            for (int var9 = 0; var9 < class35.field571.length; var9++) {
                class289 var10 = class35.field571[var9];
                var8[var9] = var10.field4944 * var10.field4943;
            }
            class267.method1872(var8, class35.field571, (byte) -91);
        }
        if (arg0 <= 117) {
            field3436 = (class188) null;
        }
        return class35.field571;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I", line = 485)
    public final int[] method12(int arg0, int arg1) {
        if (arg0 != 64) {
            field3432 = (class176[]) null;
        }
        field3433++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            this.method1405(this.field4094.method175(true), (byte) -127);
        }
        return var3;
    }
}
