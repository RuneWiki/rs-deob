import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public abstract class class182 extends class70 {

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
    public boolean field3154;

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "[Lng;")
    public class182[] field3161;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[Lth;")
    public static class98[] field3151 = new class98[2048];

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "S")
    public static short field3155 = 320;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "[I")
    public static int[] field3162 = new int[32];

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public int field3164;

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ng", name = "E", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ng", name = "G", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Lua;")
    public class103 field3166;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Lce;")
    public class275 field3152;

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[I")
    public static int[] field3159;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[[I", line = 6)
    public int[][] method122(int arg0, int arg1) {
        if (arg1 != 4944) {
            this.field3152 = (class275) null;
        }
        field3169++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I", line = 19)
    public int[] method125(int arg0, int arg1) {
        if (arg0 != 2) {
            field3159 = (int[]) null;
        }
        field3172++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BJ)V", line = 31)
    public static final void method1283(byte arg0, long arg1) {
        field3173++;
        if (class69.field1280 == 1 || class69.field1280 == 5) {
            class72.method551(arg1, -49);
        } else if (class69.field1280 == 2) {
            class217.method1519(-44);
        } else if (class69.field1280 == 4) {
            class97.method741((byte) -92, arg1);
        } else {
            class314.method2272(23549);
        }
        if (arg0 > -12) {
            return;
        }
        if (!class5.field87) {
            class107.field1938[0] = 1004;
            class137.field2343 = 1;
            class73.field1327[0] = class229.field3756;
            class317.field5173[0] = class137.field2342;
            class300.field4889[0] = "";
            if (class200.field3356 != 0) {
                class250.field4111 = class34.field754;
                class57.field1135 = class201.field3373;
            } else if (class325.field5246 == 0) {
                class250.field4111 = class26.field662;
                class57.field1135 = class73.field1339;
            } else {
                class57.field1135 = class37.field807;
                class250.field4111 = class303.field4931;
            }
        }
        class214.method1492((long) class267.field4371);
        if (class88.field1566 != -1) {
            class344.method2418(class88.field1566, (byte) -45);
        }
        for (int var3 = 0; var3 < class87.field1522; var3++) {
            if (class213.field3524[var3]) {
                class117.field2084[var3] = true;
            }
            class237.field3877[var3] = class213.field3524[var3];
            class213.field3524[var3] = false;
        }
        class275.field4488 = null;
        class353.field5640 = -1;
        client.field4594 = class267.field4371;
        class284.field4633 = -1;
        if (class241.field4016) {
            class44.field911 = true;
        }
        class216.field3609 = null;
        if (class88.field1566 != -1) {
            class87.field1522 = 0;
            class72.method549(2);
        }
        if (class241.field4016) {
            class337.method2374();
        } else {
            class270.method1910();
        }
        class112.method837((byte) -99);
        if (class5.field87) {
            if (class170.field2807) {
                class233.method1621(-88);
            } else {
                class161.method1157(false);
            }
        } else if (class216.field3609 != null) {
            class342.method2416(class317.field5170, class216.field3609, class309.field5045, -1);
        } else if (class284.field4633 != -1) {
            class342.method2416(class353.field5640, (class181) null, class284.field4633, -1);
        }
        int var4 = class5.field87 ? -1 : class37.method270(-3);
        if (var4 == -1) {
            var4 = class151.field2568;
        }
        class202.method1384((byte) -14, var4);
        if (class231.field3795 == 1) {
            class231.field3795 = 2;
        }
        if (class148.field2527 == 1) {
            class148.field2527 = 2;
        }
        if (class346.field5524 == 3) {
            for (int var5 = 0; var5 < class87.field1522; var5++) {
                if (class237.field3877[var5]) {
                    if (class241.field4016) {
                        class337.method2380(class260.field4257[var5], class54.field1074[var5], class220.field3657[var5], class83.field1438[var5], 16711935, 128);
                    } else {
                        class270.method1890(class260.field4257[var5], class54.field1074[var5], class220.field3657[var5], class83.field1438[var5], 16711935, 128);
                    }
                } else if (class117.field2084[var5]) {
                    if (class241.field4016) {
                        class337.method2380(class260.field4257[var5], class54.field1074[var5], class220.field3657[var5], class83.field1438[var5], 16711680, 128);
                    } else {
                        class270.method1890(class260.field4257[var5], class54.field1074[var5], class220.field3657[var5], class83.field1438[var5], 16711680, 128);
                    }
                }
            }
        }
        class7.method80((byte) 107, class96.field1750.field199, class276.field4506, class197.field3303, class96.field1750.field213);
        class197.field3303 = 0;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZI)V", line = 195)
    public final void method1284(int arg0, boolean arg1, int arg2) {
        field3153++;
        int var4 = this.field3164 == 255 ? arg2 : this.field3164;
        if (this.field3154) {
            this.field3166 = new class103(var4, arg2, arg0);
        } else {
            this.field3152 = new class275(var4, arg2, arg0);
        }
        if (arg1) {
            field3162 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIBI)V", line = 228)
    public static final void method1285(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3163++;
        if (arg3 != -49) {
            field3155 = 19;
        }
        class289.field4704 = arg4;
        class190.field3224 = arg1;
        class87.field1520 = arg0;
        class177.field2930 = arg2;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V", line = 244)
    public void method470(int arg0) {
        if (this.field3154) {
            this.field3166.method780(0);
            this.field3166 = null;
        } else {
            this.field3152.method1957(-11647);
            this.field3152 = null;
        }
        field3165++;
        if (arg0 != 2) {
            this.method122(20, 3);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BII)V", line = 270)
    public static final void method1286(byte arg0, int arg1, int arg2) {
        field3171++;
        class199 var3 = class173.method1231(false, 6, arg2);
        var3.method1367((byte) -15);
        if (arg0 != -50) {
            method1288(19);
        }
        var3.field3338 = arg1;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)I", line = 300)
    public int method469(int arg0) {
        if (arg0 <= 69) {
            this.method163(-25);
        }
        field3157++;
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Loe;IB)V", line = 312)
    public void method126(class146 arg0, int arg1, byte arg2) {
        field3158++;
        if (arg2 != 60) {
            this.method163(49);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(I)V", line = 322)
    public void method163(int arg0) {
        if (arg0 != 100) {
            field3159 = (int[]) null;
        }
        field3160++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I", line = 332)
    public int method1287(boolean arg0) {
        if (arg0) {
            this.method470(-119);
        }
        field3174++;
        return -1;
    }

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "(I)V", line = 343)
    public static void method1288(int arg0) {
        if (arg0 == 128) {
            field3151 = null;
            field3162 = null;
            field3159 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILaj;Lsb;I)V", line = 355)
    public static final void method1289(int arg0, int arg1, class1 arg2, class127 arg3, int arg4) {
        field3170++;
        if (arg2.field2 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg2.field2.length];
            for (int var7 = 0; var7 < var6.length / 2; var7++) {
                int var8 = arg2.field2[var7 * 2] + arg3.field2216;
                int var9 = arg3.field2217 - arg2.field2[var7 * 2 + 1];
                int var10 = var6[var7 * 2] = (var8 - class38.field844) * (class38.field845 - class38.field831) / (class38.field842 - class38.field844) + class38.field831;
                int var11 = var6[var7 * 2 + 1] = (var9 - class38.field839) * (class38.field830 - class38.field838) / (class38.field835 - class38.field839) + class38.field838;
                if (var10 > class38.field831 && var10 < class38.field845 && var11 > class38.field838 && class38.field830 > var11) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class43.method358(var6, arg2.field27, arg2.field27 >>> 24);
            for (int var12 = 0; var12 < (var6.length / 2 - 1); var12++) {
                class270.method1903(var6[var12 * 2], var6[var12 * 2 + 1], var6[(var12 + 1) * 2], var6[(var12 + 1) * 2 + 1], arg2.field18, arg2.field18 >>> 24);
            }
            class270.method1903(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg2.field18, arg2.field18 >>> 24);
        } else if (arg3.field2215) {
            return;
        }
        class280 var13 = new class280(arg3);
        class211 var14 = null;
        if (arg2.field16 != -1) {
            if (arg3.field2210 && arg2.field39 != -1) {
                var14 = (class211) arg2.method4(0, true, true);
            } else {
                var14 = (class211) arg2.method4(0, false, true);
            }
            if (var14 != null) {
                if (class1.field37 > 0 && (class199.field3349 != -1 && class199.field3349 == arg3.field2219 || class177.field2933 != -1 && class177.field2933 == arg2.field13)) {
                    int var15;
                    if (class6.field169 <= 50) {
                        var15 = class6.field169 * 3;
                    } else {
                        var15 = 300 - (class6.field169 * 3);
                    }
                    class270.method1908(arg3.field2223, arg3.field2227, var14.field5229 / 2 + 7, 16776960, var15);
                    class270.method1908(arg3.field2223, arg3.field2227, var14.field5229 / 2 + 5, 16776960, var15);
                    class270.method1908(arg3.field2223, arg3.field2227, var14.field5229 / 2 + 3, 16776960, var15);
                    class270.method1908(arg3.field2223, arg3.field2227, var14.field5229 / 2 + 1, 16776960, var15);
                    class270.method1908(arg3.field2223, arg3.field2227, var14.field5229 / 2, 16776960, var15);
                }
                var14.method34(arg3.field2223 - (var14.field5229 >> 1), -(var14.field5236 >> 1) + arg3.field2227);
                var13.field4576 = (var14.field5229 >> 1) + (arg0 + arg3.field2223);
                var13.field4567 = arg3.field2227 + arg1 - (var14.field5236 >> 1);
                var13.field4566 = arg3.field2223 + arg0 - (var14.field5229 >> 1);
                var13.field4572 = (var14.field5236 >> 1) + arg3.field2227 + arg1;
            }
        }
        if (arg2.field15 != null) {
            if (var14 == null) {
                class198.method1353(arg3, 0, true, arg2, arg0, -108, arg1, var13);
            } else {
                class198.method1353(arg3, (var14.field5236 >> 1) + 5, false, arg2, arg0, 119, arg1, var13);
            }
        }
        if (var13.method1979(Integer.MAX_VALUE, class73.field1339, class26.field662) && arg2.field31 != null) {
            if (arg2.field31[4] != null) {
                class358.method2530(arg2.field22, (long) arg3.field2219, 0, (short) 1009, false, arg2.field31[4], arg2.field13, -1);
            }
            if (arg2.field31[3] != null) {
                class358.method2530(arg2.field22, (long) arg3.field2219, 0, (short) 1003, false, arg2.field31[3], arg2.field13, -1);
            }
            if (arg2.field31[2] != null) {
                class358.method2530(arg2.field22, (long) arg3.field2219, 0, (short) 1005, false, arg2.field31[2], arg2.field13, -1);
            }
            if (arg2.field31[1] != null) {
                class358.method2530(arg2.field22, (long) arg3.field2219, 0, (short) 1006, false, arg2.field31[1], arg2.field13, -1);
            }
            if (arg2.field31[0] != null) {
                class358.method2530(arg2.field22, (long) arg3.field2219, 0, (short) 1008, false, arg2.field31[0], arg2.field13, -1);
            }
        }
        class82.field1425.method437(var13, (byte) 51);
        if (arg4 <= 58) {
            method1286((byte) 28, -127, -120);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 484)
    public static final void method1290(String arg0, int arg1) {
        if (arg1 <= 6) {
            field3159 = (int[]) null;
        }
        field3168++;
        if (!arg0.equals("")) {
            class51.field1038.method291((byte) -128, 28);
            class285.field4658++;
            class51.field1038.method1027(class148.method1066(arg0, (byte) 57), -20374);
            class51.field1038.method1012(arg0, (byte) 77);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IBI)[[I", line = 508)
    public final int[][] method1291(int arg0, byte arg1, int arg2) {
        if (arg1 < 11) {
            return (int[][]) ((int[][]) null);
        }
        field3167++;
        if (this.field3161[arg2].field3154) {
            int[] var4 = this.field3161[arg2].method125(2, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3161[arg2].method122(arg0, 4944);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IZ)V", line = 541)
    public class182(int arg0, boolean arg1) {
        this.field3154 = arg1;
        this.field3161 = new class182[arg0];
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)[I", line = 560)
    public final int[] method1292(int arg0, int arg1, int arg2) {
        field3156++;
        if (arg2 > -71) {
            this.field3166 = (class103) null;
        }
        return this.field3161[arg1].field3154 ? this.field3161[arg1].method125(2, arg0) : this.field3161[arg1].method122(arg0, 4944)[0];
    }
}
