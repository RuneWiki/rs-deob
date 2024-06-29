import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class94 {

    @OriginalMember(owner = "client!km", name = "f", descriptor = "J")
    public long field1311 = 0L;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field1310 = 0;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lth;")
    public static class57 field1312 = new class57(32);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public int field1309;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field1315;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Lh;")
    public class111 field1313;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "Lh;")
    public class111 field1317;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lag;")
    public static class215 field1321;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V", line = 12)
    public static final void method732(byte arg0) {
        field1315++;
        class236.field3545.method462(arg0 ^ 0x27);
        if (arg0 == 63) {
            class248.field3688.method462(24);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lsb;I)V", line = 30)
    public static final void method733(class190 arg0, int arg1) {
        if (arg1 != 32) {
            method736(-76);
        }
        byte[] var2 = new byte[24];
        field1308++;
        if (class36.field534 != null) {
            try {
                class36.field534.method1167(0L, arg1 ^ 0x28);
                class36.field534.method1166(67, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1349(0, 3009, 24, var2);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIB)I", line = 79)
    public static final int method734(int arg0, int arg1, byte arg2) {
        int var3 = 1;
        int var4 = 28 % ((arg2 + 70) / 47);
        field1320++;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILqf;)I", line = 104)
    public static final int method735(int arg0, int arg1, class359 arg2) {
        field1306++;
        if (arg2.field5590 == null || arg2.field5590.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg2.field5590[arg0];
            if (arg1 != 13013) {
                return 101;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 1) {
                    var8 = class275.field4174[var3[var4++]];
                }
                if (var7 == 2) {
                    var8 = class259.field3859[var3[var4++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class9.field157[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class359 var12 = class231.method1719(var11, 97);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class175.method1228((byte) 54, var13).field1771 || class189.field2692)) {
                        for (int var14 = 0; var14 < var12.field5545.length; var14++) {
                            if (var13 + 1 == var12.field5545[var14]) {
                                var8 += var12.field5513[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class227.field3423[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class41.field589[class259.field3859[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class227.field3423[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class1.field55.field3459;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class27.field367[var15]) {
                            var8 += class259.field3859[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class359 var18 = class231.method1719(var17, arg1 ^ 0x3296);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class175.method1228((byte) 54, var19).field1771 || class189.field2692)) {
                        for (int var20 = 0; var20 < var18.field5545.length; var20++) {
                            if (var19 + 1 == var18.field5545[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class281.field4263;
                }
                if (var7 == 12) {
                    var8 = class359.field5610;
                }
                if (var7 == 13) {
                    int var21 = class227.field3423[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class144.method1033(1, var23);
                }
                if (var7 == 18) {
                    var8 = (class1.field55.field5137 >> 7) + class272.field4123;
                }
                if (var7 == 19) {
                    var8 = (class1.field55.field5165 >> 7) + class202.field2968;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 310)
    public static void method736(int arg0) {
        if (arg0 != 22387) {
            field1310 = -68;
        }
        field1321 = null;
        field1312 = null;
    }
}
