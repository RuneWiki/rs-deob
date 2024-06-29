import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class64 extends class33 {

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "Lrd;")
    public static class173 field1250 = class133.method843("Ung-Ultiger Benutzername", -101);

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1256 = 0;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "Lrd;")
    private static class173 field1253 = class133.method843("Hidden", -120);

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lrd;")
    private static class173 field1259 = class133.method843("Unable to connect)3", 39);

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lrd;")
    public static class173 field1265 = class133.method843("Abbrechen", -91);

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lrd;")
    public static class173 field1268 = field1253;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "Lrd;")
    public static class173 field1252 = field1259;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lrd;")
    public static class173 field1263 = field1259;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lna;")
    public static class130 field1264;

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI)V")
    private final void method403(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field1252 = null;
        }
        ++field1260;
        int var4 = class105.field1937[arg2];
        int var5 = class138.field2585[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class110.field2047 = arg2;
            class121.field2259 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class121.field2259 = arg2;
            class110.field2047 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class121.field2259 = class117.field2173 - arg2;
            class110.field2047 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class121.field2259 = arg0;
            class110.field2047 = class99.field1802 - arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class121.field2259 = -arg0 + class117.field2173;
            class110.field2047 = -arg2 + class99.field1802;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class121.field2259 = -arg2 + class117.field2173;
            class110.field2047 = class99.field1802 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class110.field2047 = -arg0 + class99.field1802;
            class121.field2259 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class121.field2259 = class117.field2173 - arg0;
            class110.field2047 = arg2;
        }
        class110.field2047 &= class26.field545;
        class121.field2259 &= class125.field2347;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method404(int arg0) {
        field1268 = null;
        field1263 = null;
        field1253 = null;
        if (arg0 != 0) {
            field1265 = null;
        }
        field1259 = null;
        field1250 = null;
        field1252 = null;
        field1265 = null;
        field1264 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static final void method405(byte arg0) {
        for (int var1 = -1; ~var1 > ~class18.field378; ++var1) {
            int var6;
            if (var1 != -1) {
                var6 = class189.field3703[var1];
            } else {
                var6 = 2047;
            }
            class212 var7 = class183.field3600[var6];
            if (var7 != null && var7.field2817 > 0) {
                --var7.field2817;
                if (~var7.field2817 == -1) {
                    var7.field2774 = null;
                }
            }
        }
        int var2 = 21 % ((arg0 - -2) / 60);
        for (int var3 = 0; ~var3 > ~class66.field1291; ++var3) {
            int var4 = class139.field2597[var3];
            class120 var5 = client.field632[var4];
            if (var5 != null && var5.field2817 > 0) {
                --var5.field2817;
                if (~var5.field2817 == -1) {
                    var5.field2774 = null;
                }
            }
        }
        ++field1255;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field1251;
        if (arg0 == 0) {
            super.field729 = ~arg2.method751((byte) -94) == -2;
        }
        if (arg1 > -99) {
            field1270 = 127;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IB)I")
    public static final int method406(int arg0, byte arg1) {
        if (arg1 != -28) {
            return -5;
        } else {
            ++field1257;
            return arg0 >>> 10;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[[I")
    public final int[][] method178(int arg0, int arg1) {
        ++field1261;
        if (arg0 < 112) {
            field1270 = 6;
        }
        int[][] var3 = super.field731.method1340(-101, arg1);
        int[] var4 = var3[0];
        int[] var5 = var3[1];
        int[] var6 = var3[2];
        if (super.field731.field3925) {
            for (int var7 = 0; ~var7 > ~class117.field2173; ++var7) {
                this.method403(var7, true, arg1);
                int[][] var8 = this.method259(0, -9, class110.field2047);
                var4[var7] = var8[0][class121.field2259];
                var5[var7] = var8[1][class121.field2259];
                var6[var7] = var8[2][class121.field2259];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    public static final void method407(int arg0) {
        if (arg0 == 0) {
            ++field1258;
            class139.field2592.method53(arg0 ^ -51);
            class73.field1429.method53(-51);
        }
    }

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "(I)V")
    public static final void method408(int arg0) {
        ++field1269;
        if (class7.field134) {
            class15.field345 = null;
            class98.field1790 = null;
            class24.field521 = null;
            class173.field3368 = null;
            class191.field3736 = null;
            class112.field2085 = null;
            class57.field1144 = null;
            class207.field4036 = null;
            class163.field3009 = null;
            class145.field2722 = null;
            class92.field1742 = null;
            class152.field2875 = null;
            class166.field3208 = null;
            class140.field2621 = null;
            class163.field3013 = null;
            class66.field1290 = null;
            class214.field4156 = null;
            class191.field3738 = null;
            class101.field1855 = null;
            class170.field3303 = null;
            class109.field2036 = null;
            class34.field751 = null;
            class143.method904(arg0 ^ 1, 2);
            class108.method664(true, arg0);
            class7.field134 = false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1266;
        int[] var3 = super.field718.method514(arg0, -46);
        int var4 = 24 % ((-65 - arg1) / 60);
        if (super.field718.field1615) {
            for (int var5 = 0; ~var5 > ~class117.field2173; ++var5) {
                this.method403(var5, true, arg0);
                int[] var6 = this.method262(class110.field2047, -116, 0);
                var3[var5] = var6[class121.field2259];
            }
        }
        return var3;
    }
}
