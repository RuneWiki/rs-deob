import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class456 extends class118 {

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    public static int field6764 = -1;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Lwl;")
    public static class452 field6769 = new class452(84, 8);

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "Lcm;")
    public static class382 field6773 = new class382(128);

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "Lpf;")
    public static class425 field6775 = new class425(56, -1);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field6770;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            field6773 = null;
        }
        ++field6766;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class440.field6474 < ~var7; ++var7) {
                this.method2836(var7, (byte) -120, arg1);
                int[][] var8 = this.method708(class25.field322, (byte) -127, 0);
                var4[var7] = var8[0][class114.field1514];
                var5[var7] = var8[1][class114.field1514];
                var6[var7] = var8[2][class114.field1514];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg0 != 1) {
            field6769 = null;
        }
        ++field6767;
        int[] var3 = super.field1537.method2395(30963, arg1);
        if (super.field1537.field5756) {
            for (int var4 = 0; var4 < class440.field6474; ++var4) {
                this.method2836(var4, (byte) -104, arg1);
                int[] var5 = this.method703(0, class25.field322, -2);
                var3[var4] = var5[class114.field1514];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLmr;)I")
    public static final int method2832(byte arg0, class145 arg1) {
        ++field6770;
        if (arg1.field1959 == 0) {
            return 0;
        } else {
            if (arg1.field1956 != -1) {
                class145 var2 = null;
                if (~arg1.field1956 <= -32769) {
                    if (arg1.field1956 >= 32768) {
                        var2 = class140.field1883[arg1.field1956 + -32768];
                    }
                } else {
                    var2 = class170.field2626[arg1.field1956];
                }
                if (var2 != null) {
                    int var3 = -var2.field1900 + arg1.field1900;
                    int var4 = arg1.field1892 - var2.field1892;
                    if (~var3 != -1 || var4 != 0) {
                        arg1.method897((int) (2607.5945876176133D * Math.atan2((double) var3, (double) var4)) & 16383, 16384);
                    }
                }
            }
            if (!(arg1 instanceof class169)) {
                if (arg1 instanceof class155) {
                    class155 var5 = (class155) arg1;
                    if (var5.field2153 != -1 && (~var5.field2013 == -1 || ~var5.field2015 < -1)) {
                        int var6 = -((var5.field2153 - class17.field250 - class17.field250) * 64) + var5.field1900;
                        int var7 = var5.field1892 - (-class112.field1487 + -class112.field1487 + var5.field2149) * 64;
                        if (var6 != 0 || ~var7 != -1) {
                            var5.method897(16383 & (int) (Math.atan2((double) var6, (double) var7) * 2607.5945876176133D), 16384);
                        }
                        var5.field2153 = -1;
                    }
                }
            } else {
                class169 var8 = (class169) arg1;
                if (~var8.field2444 != 0 && (~var8.field2013 == -1 || var8.field2015 > 0)) {
                    var8.method897(var8.field2444, 16384);
                    var8.field2444 = -1;
                }
            }
            if (arg0 != 33) {
                field6773 = null;
            }
            return arg1.method896((byte) -124);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class456() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field6765;
        if (~arg0 == -1) {
            super.field1552 = ~arg2.method2343(arg1 + 254) == -2;
        }
        if (arg1 != 1) {
            field6764 = -73;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;ZIZJIZI)V")
    public static final void method2833(String arg0, int arg1, byte arg2, String arg3, boolean arg4, int arg5, boolean arg6, long arg7, int arg8, boolean arg9, int arg10) {
        ++field6771;
        int[] var12 = new int[4];
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (9.9999999E7D * Math.random());
        }
        class385 var14 = new class385(128);
        var14.method2366(10, true);
        var14.method2377((arg6 ? 1 : 0) | (arg4 ? 2 : 0) | (arg9 ? 4 : 0), -60);
        var14.method2349(arg7, (byte) -36);
        var14.method2381(var12[0], 0);
        var14.method2375(112, arg0);
        if (arg2 > 34) {
            var14.method2381(var12[1], 0);
            var14.method2377(class240.field3600, -90);
            var14.method2366(arg8, true);
            var14.method2366(arg1, true);
            var14.method2381(var12[2], 0);
            var14.method2377(arg10, -107);
            var14.method2377(arg5, -99);
            var14.method2381(var12[3], 0);
            var14.method2358(class358.field5279, 109, class230.field3518);
            class385 var15 = new class385(350);
            var15.method2375(-78, arg3);
            int var16 = -(class386.method2384(-4580, arg3) % 8) + 8;
            for (int var17 = 0; var16 > var17; ++var17) {
                var15.method2366((int) (Math.random() * 255.0D), true);
            }
            var15.method2319(var12, (byte) 78);
            class189.field2840.field5666 = 0;
            class189.field2840.method2366(class386.field5697.field6435, true);
            class189.field2840.method2377(2 - -var15.field5666 + var14.field5666, -1);
            class189.field2840.method2377(570, -70);
            class189.field2840.method2325((byte) 83, 0, var14.field5685, var14.field5666);
            class189.field2840.method2325((byte) 96, 0, var15.field5685, var15.field5666);
            class426.field6269 = 1;
            class121.field1595 = 0;
            class98.field1353 = -3;
            class350.field5201 = 0;
        }
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public static void method2834(int arg0) {
        field6769 = null;
        field6775 = null;
        field6773 = null;
        int var1 = -38 % ((arg0 - 48) / 55);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2835(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(IBI)V")
    private final void method2836(int arg0, byte arg1, int arg2) {
        ++field6772;
        int var4 = class6.field73[arg0];
        if (arg1 >= -62) {
            field6769 = null;
        }
        int var5 = class160.field2210[arg2];
        float var6 = (float) Math.atan2((double) (var4 - 2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class25.field322 = arg2;
            class114.field1514 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class114.field1514 = arg2;
            class25.field322 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class114.field1514 = class440.field6474 - arg2;
            class25.field322 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class25.field322 = -arg2 + class289.field4403;
            class114.field1514 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class114.field1514 = -arg0 + class440.field6474;
            class25.field322 = -arg2 + class289.field4403;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class25.field322 = -arg0 + class289.field4403;
            class114.field1514 = -arg2 + class440.field6474;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class25.field322 = -arg0 + class289.field4403;
            class114.field1514 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class25.field322 = arg2;
            class114.field1514 = -arg0 + class440.field6474;
        }
        class25.field322 &= class438.field6441;
        class114.field1514 &= class87.field1230;
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V")
    public static final void method2837(int arg0) {
        ++field6774;
        int var1 = class236.field3544.length;
        for (int var2 = arg0; ~var2 > ~var1; ++var2) {
            if (class236.field3544[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class26.field333; ++var4) {
                    if (class49.field614[var4] == class161.field2243[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (~var3 == 0) {
                    class49.field614[class26.field333] = class161.field2243[var2];
                    var3 = class26.field333++;
                }
                class385 var5 = new class385(class236.field3544[var2]);
                int var6 = 0;
                while (class236.field3544[var2].length > var5.field5666 && var6 < 511 && ~class38.field458 > -1024) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method2323(-26);
                    int var9 = var8 >> 14;
                    int var10 = 63 & var8 >> 7;
                    int var11 = var8 & 63;
                    int var12 = (class161.field2243[var2] >> 8) * 64 - class17.field250 + var10;
                    int var13 = (255 & class161.field2243[var2]) * 64 - class112.field1487 - -var11;
                    class271 var14 = class228.method1385(var5.method2323(-1), (byte) 61);
                    if (class170.field2626[var7] == null && ~(var14.field4095 & 1) < -1 && ~class88.field1263 == ~var9 && ~var12 <= -1 && ~class115.field1522 < ~(var12 - -var14.field4110) && ~var13 <= -1 && ~(var13 - -var14.field4110) > ~class198.field3004) {
                        class170.field2626[var7] = new class155();
                        class170.field2626[var7].field1929 = var7;
                        class155 var15 = class170.field2626[var7];
                        class87.field1235[class38.field458++] = var7;
                        var15.field1977 = class26.field332;
                        var15.method956(var14, arg0);
                        var15.method906(-27630, var15.field2137.field4110);
                        var15.field1959 = var15.field2137.field4158 << 3;
                        if (var15.field1959 == 0) {
                            var15.method909(0, 16383);
                        } else {
                            var15.method909((var15.field2137.field4140 + 4 & 1231028231) << 11, 16383);
                        }
                        var15.method957((byte) 111, true, var12, var13, var15.method911(arg0), var9);
                    }
                }
            }
        }
    }

    static {
        new class151((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
    }
}
