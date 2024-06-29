import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class216 implements class52 {

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[Lsf;")
    public static class115[] field3033 = new class115[14];

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "Lim;")
    public static class191 field3031 = new class191();

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[C")
    public static char[] field3039 = new char[128];

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLlc;)V", line = 5)
    public static final void method1488(byte arg0, class175 arg1) {
        class80.field1018 = arg1;
        if (arg0 != -52) {
            method1491((class263) null, (byte) -15);
        }
        field3036++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIILcc;I)V", line = 16)
    public static final void method1489(boolean arg0, int arg1, int arg2, class263 arg3, int arg4) {
        field3034++;
        int var5 = arg3.field3989;
        if (arg3.field4062 == 0) {
            arg3.field3989 = arg3.field4092;
        } else if (arg3.field4062 == 1) {
            arg3.field3989 = arg1 - arg3.field4092;
        } else if (arg3.field4062 == 2) {
            arg3.field3989 = arg3.field4092 * arg1 >> 14;
        } else if (arg3.field4062 == 3) {
            if (arg3.field3981 == 2) {
                arg3.field3989 = arg3.field4092 * 32 + ((arg3.field4092 - 1) * arg3.field4112);
            } else if (arg3.field3981 == 7) {
                arg3.field3989 = (arg3.field4092 - 1) * arg3.field4112 + arg3.field4092 * 115;
            }
        }
        int var6 = arg3.field4096;
        if (arg3.field4122 == 0) {
            arg3.field4096 = arg3.field4155;
        } else if (arg3.field4122 == 1) {
            arg3.field4096 = arg2 - arg3.field4155;
        } else if (arg3.field4122 == 2) {
            arg3.field4096 = arg3.field4155 * arg2 >> 14;
        } else if (arg3.field4122 == 3) {
            if (arg3.field3981 == 2) {
                arg3.field4096 = arg3.field4155 * 32 + ((arg3.field4155 - 1) * arg3.field4099);
            } else if (arg3.field3981 == 7) {
                arg3.field4096 = (arg3.field4155 - 1) * arg3.field4099 + arg3.field4155 * 12;
            }
        }
        if (arg4 != 250) {
            field3031 = (class191) null;
        }
        if (arg3.field4062 == 4) {
            arg3.field3989 = arg3.field4096 * arg3.field3991 / arg3.field4008;
        }
        if (arg3.field4122 == 4) {
            arg3.field4096 = arg3.field4008 * arg3.field3989 / arg3.field3991;
        }
        if (class309.field4772 && (client.method1952(arg3).field2467 != 0 || arg3.field3981 == 0)) {
            if (arg3.field4096 < 5 && arg3.field3989 < 5) {
                arg3.field3989 = 5;
                arg3.field4096 = 5;
            } else {
                if (arg3.field3989 <= 0) {
                    arg3.field3989 = 5;
                }
                if (arg3.field4096 <= 0) {
                    arg3.field4096 = 5;
                }
            }
        }
        if (arg3.field4113 == 1337) {
            class226.field3230 = arg3;
        }
        if (arg0 && arg3.field4127 != null && (arg3.field3989 != var5 || arg3.field4096 != var6)) {
            class176 var7 = new class176();
            var7.field2551 = arg3.field4127;
            var7.field2552 = arg3;
            class115.field1627.method2325(var7, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 121)
    public static void method1490(byte arg0) {
        field3031 = null;
        field3033 = null;
        field3039 = null;
        if (arg0 != 75) {
            field3031 = (class191) null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lcc;B)Z", line = 134)
    public static final boolean method1491(class263 arg0, byte arg1) {
        field3037++;
        if (arg1 >= -112) {
            return true;
        } else if (arg0.field4113 == 205) {
            class161.field2221 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 155)
    public static final void method1492(int arg0, int arg1) {
        field3032++;
        short var2 = 256;
        if (arg1 > var2) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class60.field742 += arg1 * 128;
        if (class60.field742 > class318.field4889.length) {
            class60.field742 -= class318.field4889.length;
            int var3 = (int) (Math.random() * 12.0D);
            class27.method170((byte) -59, class127.field1747[var3]);
        }
        int var4 = arg1 * 128;
        int var5 = (var2 - arg1) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = class165.field2285[var4 + var6] - (class318.field4889[class318.field4889.length - 1 & var6 - -class60.field742] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class165.field2285[var6++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class165.field2285[var11 + var10] = 255;
                } else {
                    class165.field2285[var10 + var11] = 0;
                }
            }
        }
        for (int var13 = arg0; var13 < var2 - arg1; var13++) {
            class50.field626[var13] = class50.field626[var13 + arg1];
        }
        for (int var14 = var2 - arg1; var14 < var2; var14++) {
            class50.field626[var14] = (int) (Math.sin((double) class345.field5355 / 14.0D) * 16.0D + Math.sin((double) class345.field5355 / 15.0D) * 14.0D + Math.sin((double) class345.field5355 / 16.0D) * 12.0D);
            class345.field5355++;
        }
        int var15 = (arg1 + (class38.field463 & 0x1)) / 2;
        class81.field1038 += arg1;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class81.field1038; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class165.field2285[(var18 << 7) + var17] = 192;
        }
        class81.field1038 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if ((var15 + var22) < 128) {
                    var20 += class165.field2285[var21 + var22 + var15];
                }
                if (var22 - var15 - 1 >= 0) {
                    var20 -= class165.field2285[var22 + var21 - var15 - 1];
                }
                if (var22 >= 0) {
                    class152.field2101[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > (var15 + var25)) {
                    var24 += class152.field2101[var15 * 128 + (var23 + var26)];
                }
                if ((var25 - var15 - 1) >= 0) {
                    var24 -= class152.field2101[var23 + var26 - var15 * 128 - 128];
                }
                if (var25 >= 0) {
                    class165.field2285[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ[II)Ljava/lang/String;", line = 335)
    public final String method318(int arg0, long arg1, int[] arg2, int arg3) {
        field3026++;
        if (arg0 != 26040) {
            return (String) null;
        } else if (arg3 == 0) {
            class230 var7 = class323.method2250(6243, arg2[0]);
            return var7.method1626((byte) 119, (int) arg1);
        } else if (arg3 == 1 || arg3 == 10) {
            class93 var6 = class60.method353((int) arg1, (byte) -89);
            return var6.field1167;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class323.method2250(arg0 - 19797, arg2[0]).method1626((byte) 119, (int) arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 370)
    public static final void method1493(byte arg0) {
        if (arg0 < -43) {
            field3029++;
            class208.field2951.method1241(113);
            class291.field4573.method1241(125);
            class319.field4897.method1241(120);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Lsf;", line = 392)
    public static final class115 method1494(int arg0, int arg1) {
        field3035++;
        class115 var2 = (class115) class231.field3368.method1239((byte) -82, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        class115 var3 = class63.method365(false, -31, arg1, class150.field2084, class13.field174);
        if (var3 != null) {
            class231.field3368.method1243(var3, (long) arg1, -29282);
        }
        int var4 = -3 / ((-arg0 - 59) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIILjava/lang/String;I)V", line = 418)
    public static final void method1495(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field3027++;
        class263 var5 = class176.method1211(arg0 ^ 0x1, arg4, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field4043 != null) {
            class176 var6 = new class176();
            var6.field2564 = arg2;
            var6.field2552 = var5;
            var6.field2553 = arg3;
            var6.field2551 = var5.field4043;
            class283.method2027(200000, var6);
        }
        boolean var7 = true;
        if (arg0 < var5.field4113) {
            var7 = method1491(var5, (byte) -120);
        }
        if (!var7 || !client.method1952(var5).method1122(arg2 - 1, arg0 ^ 0x1)) {
            return;
        }
        if (arg2 == 1) {
            class226.field3225++;
            class140.field1954.method573(116, 170);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 2) {
            class76.field967++;
            class140.field1954.method573(127, 43);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 3) {
            class140.field1954.method573(120, 68);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
            class74.field953++;
        }
        if (arg2 == 4) {
            class9.field115++;
            class140.field1954.method573(124, 155);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 5) {
            class136.field1886++;
            class140.field1954.method573(121, 191);
            class140.field1954.method641(arg0 + 1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 6) {
            class181.field2618++;
            class140.field1954.method573(119, 60);
            class140.field1954.method641(arg0 + 1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 7) {
            class329.field5019++;
            class140.field1954.method573(127, 34);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 8) {
            class260.field3939++;
            class140.field1954.method573(arg0 ^ 0x74, 194);
            class140.field1954.method641(arg0 + 1773202520, arg4);
            class140.field1954.method662(true, arg1);
        }
        if (arg2 == 9) {
            class140.field1954.method573(arg0 ^ 0x7A, 253);
            class140.field1954.method641(1773202520, arg4);
            class140.field1954.method662(true, arg1);
            class296.field4622++;
        }
        if (arg2 == 10) {
            class140.field1954.method573(121, 30);
            class140.field1954.method641(1773202520, arg4);
            class98.field1284++;
            class140.field1954.method662(true, arg1);
        }
    }
}
