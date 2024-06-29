import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class121 {

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public int field1862;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[I")
    public int[] field1868;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[B")
    public byte[] field1860;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "[I")
    public int[] field1874;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "[Ljava/lang/String;")
    public String[] field1857;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field1869 = -1;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "[J")
    public static long[] field1864 = new long[100];

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field1871 = 0;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lwe;")
    public static class224 field1867;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lwf;")
    public static class306 field1859;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lwf;")
    public static class306 field1861;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "[I")
    public static int[] field1865;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z", line = 7)
    public final boolean method821(int arg0, int arg1) {
        field1873++;
        if (arg1 > -101) {
            field1870 = 20;
        }
        return (this.field1860[arg0] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BLnb;I)V", line = 19)
    public static final void method822(byte arg0, class120 arg1, int arg2) {
        field1863++;
        int var3 = -100 / ((-arg0 - 73) / 44);
        Object[] var4 = arg1.field1837;
        int var5 = (Integer) var4[0];
        class98 var6 = class339.method2346(var5, -60);
        if (var6 == null) {
            return;
        }
        class97.field1488 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = -1;
        int[] var10 = var6.field1528;
        int[] var11 = var6.field1523;
        byte var12 = -1;
        try {
            class18.field251 = new int[var6.field1525];
            int var13 = 0;
            int var14 = 0;
            class330.field5101 = new String[var6.field1530];
            for (int var15 = 1; var15 < var4.length; var15++) {
                if (var4[var15] instanceof Integer) {
                    int var16 = (Integer) var4[var15];
                    if (var16 == -2147483647) {
                        var16 = arg1.field1843;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field1846;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field1845 == null ? -1 : arg1.field1845.field3250;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field1838;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field1845 == null ? -1 : arg1.field1845.field3283;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field1852 == null ? -1 : arg1.field1852.field3250;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field1852 == null ? -1 : arg1.field1852.field3283;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field1836;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field1842;
                    }
                    class18.field251[var13++] = var16;
                } else if (var4[var15] instanceof String) {
                    String var17 = (String) var4[var15];
                    if (var17.equals("event_opbase")) {
                        var17 = arg1.field1854;
                    }
                    class330.field5101[var14++] = var17;
                }
            }
            int var18 = 0;
            label4441: while (true) {
                var18++;
                if (arg2 < var18) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var529 = var10[var9];
                if (var529 < 100) {
                    if (var529 == 0) {
                        class335.field5214[var7++] = var11[var9];
                        continue;
                    }
                    if (var529 == 1) {
                        int var19 = var11[var9];
                        class335.field5214[var7++] = class156.field2442[var19];
                        continue;
                    }
                    if (var529 == 2) {
                        int var20 = var11[var9];
                        var7--;
                        class42.method304(-27661, class335.field5214[var7], var20);
                        continue;
                    }
                    if (var529 == 3) {
                        class63.field923[var8++] = var6.field1520[var9];
                        continue;
                    }
                    if (var529 == 6) {
                        var9 += var11[var9];
                        continue;
                    }
                    if (var529 == 7) {
                        var7 -= 2;
                        if (class335.field5214[var7 + 1] != class335.field5214[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 8) {
                        var7 -= 2;
                        if (class335.field5214[var7 + 1] == class335.field5214[var7]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 9) {
                        var7 -= 2;
                        if (class335.field5214[var7] < class335.field5214[var7 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 10) {
                        var7 -= 2;
                        if (class335.field5214[var7] > class335.field5214[var7 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 21) {
                        if (class97.field1488 == 0) {
                            return;
                        }
                        class234 var21 = class304.field4745[--class97.field1488];
                        class18.field251 = var21.field3759;
                        var9 = var21.field3758;
                        var6 = var21.field3762;
                        var10 = var6.field1528;
                        var11 = var6.field1523;
                        class330.field5101 = var21.field3760;
                        continue;
                    }
                    if (var529 == 25) {
                        int var22 = var11[var9];
                        class335.field5214[var7++] = class165.method1129(-19650, var22);
                        continue;
                    }
                    if (var529 == 27) {
                        int var23 = var11[var9];
                        var7--;
                        class229.method1573(8, var23, class335.field5214[var7]);
                        continue;
                    }
                    if (var529 == 31) {
                        var7 -= 2;
                        if (class335.field5214[var7] <= class335.field5214[var7 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 32) {
                        var7 -= 2;
                        if (class335.field5214[var7] >= class335.field5214[var7 + 1]) {
                            var9 += var11[var9];
                        }
                        continue;
                    }
                    if (var529 == 33) {
                        class335.field5214[var7++] = class18.field251[var11[var9]];
                        continue;
                    }
                    int var10001;
                    if (var529 == 34) {
                        var10001 = var11[var9];
                        var7--;
                        class18.field251[var10001] = class335.field5214[var7];
                        continue;
                    }
                    if (var529 == 35) {
                        class63.field923[var8++] = class330.field5101[var11[var9]];
                        continue;
                    }
                    if (var529 == 36) {
                        var10001 = var11[var9];
                        var8--;
                        class330.field5101[var10001] = class63.field923[var8];
                        continue;
                    }
                    if (var529 == 37) {
                        int var24 = var11[var9];
                        var8 -= var24;
                        String var25 = class183.method1264(var8, class63.field923, var24, (byte) -124);
                        class63.field923[var8++] = var25;
                        continue;
                    }
                    if (var529 == 38) {
                        var7--;
                        continue;
                    }
                    if (var529 == 39) {
                        var8--;
                        continue;
                    }
                    if (var529 == 40) {
                        int var26 = var11[var9];
                        class98 var27 = class339.method2346(var26, -29);
                        String[] var28 = new String[var27.field1530];
                        int[] var29 = new int[var27.field1525];
                        for (int var30 = 0; var30 < var27.field1522; var30++) {
                            var29[var30] = class335.field5214[var7 + var30 - var27.field1522];
                        }
                        for (int var31 = 0; var31 < var27.field1519; var31++) {
                            var28[var31] = class63.field923[var8 + var31 - var27.field1519];
                        }
                        var8 -= var27.field1519;
                        var7 -= var27.field1522;
                        class234 var32 = new class234();
                        var32.field3759 = class18.field251;
                        var32.field3762 = var6;
                        var32.field3760 = class330.field5101;
                        var32.field3758 = var9;
                        if (class97.field1488 >= class304.field4745.length) {
                            throw new RuntimeException();
                        }
                        var6 = var27;
                        var9 = -1;
                        class304.field4745[class97.field1488++] = var32;
                        class18.field251 = var29;
                        var10 = var27.field1528;
                        class330.field5101 = var28;
                        var11 = var27.field1523;
                        continue;
                    }
                    if (var529 == 42) {
                        class335.field5214[var7++] = class286.field4382[var11[var9]];
                        continue;
                    }
                    if (var529 == 43) {
                        int var33 = var11[var9];
                        var7--;
                        class286.field4382[var33] = class335.field5214[var7];
                        class113.method759(false, var33);
                        continue;
                    }
                    if (var529 == 44) {
                        int var34 = var11[var9] >> 16;
                        int var35 = var11[var9] & 0xFFFF;
                        var7--;
                        int var36 = class335.field5214[var7];
                        if (var36 >= 0 && var36 <= 5000) {
                            class183.field2807[var34] = var36;
                            byte var37 = -1;
                            if (var35 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var36) {
                                    continue label4441;
                                }
                                class104.field1607[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var529 == 45) {
                        int var39 = var11[var9];
                        var7--;
                        int var40 = class335.field5214[var7];
                        if (var40 >= 0 && var40 < class183.field2807[var39]) {
                            class335.field5214[var7++] = class104.field1607[var39][var40];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var529 == 46) {
                        var7 -= 2;
                        int var41 = var11[var9];
                        int var42 = class335.field5214[var7];
                        if (var42 >= 0 && var42 < class183.field2807[var41]) {
                            class104.field1607[var41][var42] = class335.field5214[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var529 == 47) {
                        String var43 = class204.field3090[var11[var9]];
                        if (var43 == null) {
                            var43 = "null";
                        }
                        class63.field923[var8++] = var43;
                        continue;
                    }
                    if (var529 == 48) {
                        int var44 = var11[var9];
                        var8--;
                        class204.field3090[var44] = class63.field923[var8];
                        class171.method1158(var44, 6658);
                        continue;
                    }
                    if (var529 == 51) {
                        class227 var45 = var6.field1524[var11[var9]];
                        var7--;
                        class27 var46 = (class27) var45.method1558((long) class335.field5214[var7], false);
                        if (var46 != null) {
                            var9 += var46.field344;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var11[var9] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var529 < 300) {
                    if (var529 == 100) {
                        var7 -= 3;
                        int var509 = class335.field5214[var7];
                        int var510 = class335.field5214[var7 + 2];
                        int var511 = class335.field5214[var7 + 1];
                        if (var511 != 0) {
                            class207 var512 = class78.method547(var509, 122);
                            if (var512.field3253 == null) {
                                var512.field3253 = new class207[var510 + 1];
                            }
                            if (var510 >= var512.field3253.length) {
                                class207[] var513 = new class207[var510 + 1];
                                for (int var514 = 0; var514 < var512.field3253.length; var514++) {
                                    var513[var514] = var512.field3253[var514];
                                }
                                var512.field3253 = var513;
                            }
                            if (var510 > 0 && var512.field3253[var510 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var510 - 1));
                            }
                            class207 var515 = new class207();
                            var515.field3283 = var510;
                            var515.field3267 = true;
                            var515.field3232 = var515.field3250 = var512.field3250;
                            var515.field3273 = var511;
                            var512.field3253[var510] = var515;
                            if (var47) {
                                class253.field3950 = var515;
                            } else {
                                class273.field4203 = var515;
                            }
                            class277.method1822(4096, var512);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var529 == 101) {
                        class207 var516 = var47 ? class253.field3950 : class273.field4203;
                        if (var516.field3283 == -1) {
                            if (var47) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class207 var517 = class78.method547(var516.field3250, 123);
                        var517.field3253[var516.field3283] = null;
                        class277.method1822(4096, var517);
                        continue;
                    }
                    if (var529 == 102) {
                        var7--;
                        class207 var518 = class78.method547(class335.field5214[var7], 116);
                        var518.field3253 = null;
                        class277.method1822(4096, var518);
                        continue;
                    }
                    if (var529 == 200) {
                        var7 -= 2;
                        int var519 = class335.field5214[var7];
                        int var520 = class335.field5214[var7 + 1];
                        class207 var521 = class276.method1812(true, var519, var520);
                        if (var521 != null && var520 != -1) {
                            class335.field5214[var7++] = 1;
                            if (var47) {
                                class253.field3950 = var521;
                            } else {
                                class273.field4203 = var521;
                            }
                            continue;
                        }
                        class335.field5214[var7++] = 0;
                        continue;
                    }
                    if (var529 == 201) {
                        var7--;
                        int var522 = class335.field5214[var7];
                        class207 var523 = class78.method547(var522, 100);
                        if (var523 == null) {
                            class335.field5214[var7++] = 0;
                        } else {
                            class335.field5214[var7++] = 1;
                            if (var47) {
                                class253.field3950 = var523;
                            } else {
                                class273.field4203 = var523;
                            }
                        }
                        continue;
                    }
                } else if (var529 < 500) {
                    if (var529 == 403) {
                        var7 -= 2;
                        int var502 = class335.field5214[var7];
                        int var503 = class335.field5214[var7 + 1];
                        for (int var504 = 0; var504 < class139.field2153.length; var504++) {
                            if (class139.field2153[var504] == var502) {
                                class79.field1173.field1247.method1167(var503, -10, var504);
                                continue label4441;
                            }
                        }
                        int var505 = 0;
                        while (true) {
                            if (var505 >= class123.field1925.length) {
                                continue label4441;
                            }
                            if (class123.field1925[var505] == var502) {
                                class79.field1173.field1247.method1167(var503, -10, var505);
                                continue label4441;
                            }
                            var505++;
                        }
                    }
                    if (var529 == 404) {
                        var7 -= 2;
                        int var506 = class335.field5214[var7];
                        int var507 = class335.field5214[var7 + 1];
                        class79.field1173.field1247.method1169(1073741823, var507, var506);
                        continue;
                    }
                    if (var529 == 410) {
                        var7--;
                        boolean var508 = class335.field5214[var7] != 0;
                        class79.field1173.field1247.method1168(-80, var508);
                        continue;
                    }
                } else if (var529 >= 1000 && var529 < 1100 || var529 >= 2000 && var529 < 2100) {
                    class207 var48;
                    if (var529 < 2000) {
                        var48 = var47 ? class253.field3950 : class273.field4203;
                    } else {
                        var7--;
                        var48 = class78.method547(class335.field5214[var7], 117);
                        var529 -= 1000;
                    }
                    if (var529 == 1000) {
                        var7 -= 4;
                        var48.field3208 = class335.field5214[var7];
                        var48.field3143 = class335.field5214[var7 + 1];
                        int var49 = class335.field5214[var7 + 3];
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        int var50 = class335.field5214[var7 + 2];
                        var48.field3229 = (byte) var49;
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 5) {
                            var50 = 5;
                        }
                        var48.field3135 = (byte) var50;
                        class277.method1822(4096, var48);
                        class203.method1365(var48, 98);
                        if (var48.field3283 == -1) {
                            class313.method2145((byte) -104, var48.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1001) {
                        var7 -= 4;
                        var48.field3264 = class335.field5214[var7];
                        var48.field3132 = class335.field5214[var7 + 1];
                        var48.field3213 = 0;
                        var48.field3193 = 0;
                        int var51 = class335.field5214[var7 + 3];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        int var52 = class335.field5214[var7 + 2];
                        var48.field3161 = (byte) var51;
                        if (var52 < 0) {
                            var52 = 0;
                        } else if (var52 > 4) {
                            var52 = 4;
                        }
                        var48.field3158 = (byte) var52;
                        class277.method1822(4096, var48);
                        class203.method1365(var48, 122);
                        if (var48.field3273 == 0) {
                            class342.method2386(false, var48, 122);
                        }
                        continue;
                    }
                    if (var529 == 1003) {
                        var7--;
                        boolean var53 = class335.field5214[var7] == 1;
                        if (var48.field3197 != var53) {
                            var48.field3197 = var53;
                            class277.method1822(4096, var48);
                        }
                        if (var48.field3283 == -1) {
                            class313.method2146(var48.field3250, 5);
                        }
                        continue;
                    }
                    if (var529 == 1004) {
                        var7 -= 2;
                        var48.field3214 = class335.field5214[var7];
                        var48.field3277 = class335.field5214[var7 + 1];
                        class277.method1822(4096, var48);
                        class203.method1365(var48, 108);
                        if (var48.field3273 == 0) {
                            class342.method2386(false, var48, 125);
                        }
                        continue;
                    }
                    if (var529 == 1005) {
                        var7--;
                        var48.field3295 = class335.field5214[var7] == 1;
                        continue;
                    }
                } else if (var529 >= 1100 && var529 < 1200 || var529 >= 2100 && var529 < 2200) {
                    class207 var498;
                    if (var529 < 2000) {
                        var498 = var47 ? class253.field3950 : class273.field4203;
                    } else {
                        var529 -= 1000;
                        var7--;
                        var498 = class78.method547(class335.field5214[var7], 112);
                    }
                    if (var529 == 1100) {
                        var7 -= 2;
                        var498.field3245 = class335.field5214[var7];
                        if (var498.field3245 > (var498.field3153 - var498.field3169)) {
                            var498.field3245 = var498.field3153 - var498.field3169;
                        }
                        if (var498.field3245 < 0) {
                            var498.field3245 = 0;
                        }
                        var498.field3270 = class335.field5214[var7 + 1];
                        if (var498.field3270 > (var498.field3187 - var498.field3239)) {
                            var498.field3270 = var498.field3187 - var498.field3239;
                        }
                        if (var498.field3270 < 0) {
                            var498.field3270 = 0;
                        }
                        class277.method1822(4096, var498);
                        if (var498.field3283 == -1) {
                            class38.method274(12, var498.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1101) {
                        var7--;
                        var498.field3139 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        if (var498.field3283 == -1) {
                            class298.method1961(var498.field3250, 6);
                        }
                        continue;
                    }
                    if (var529 == 1102) {
                        var7--;
                        var498.field3216 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1103) {
                        var7--;
                        var498.field3269 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1104) {
                        var7--;
                        var498.field3171 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1105) {
                        var7--;
                        var498.field3211 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1106) {
                        var7--;
                        var498.field3246 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1107) {
                        var7--;
                        var498.field3199 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1108) {
                        var498.field3204 = 1;
                        var7--;
                        var498.field3207 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        if (var498.field3283 == -1) {
                            class90.method625(111, var498.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1109) {
                        var7 -= 6;
                        var498.field3296 = class335.field5214[var7];
                        var498.field3167 = class335.field5214[var7 + 1];
                        var498.field3247 = class335.field5214[var7 + 2];
                        var498.field3215 = class335.field5214[var7 + 3];
                        var498.field3249 = class335.field5214[var7 + 4];
                        var498.field3183 = class335.field5214[var7 + 5];
                        class277.method1822(4096, var498);
                        if (var498.field3283 == -1) {
                            class77.method542(var498.field3250, 127);
                            class120.method815(var498.field3250, (byte) -43);
                        }
                        continue;
                    }
                    if (var529 == 1110) {
                        var7--;
                        int var499 = class335.field5214[var7];
                        if (var498.field3243 != var499) {
                            var498.field3275 = 0;
                            var498.field3243 = var499;
                            var498.field3289 = 0;
                            var498.field3210 = 1;
                            class277.method1822(4096, var498);
                        }
                        if (var498.field3283 == -1) {
                            class305.method2075(var498.field3250, (byte) 117);
                        }
                        continue;
                    }
                    if (var529 == 1111) {
                        var7--;
                        var498.field3200 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1112) {
                        var8--;
                        String var500 = class63.field923[var8];
                        if (!var500.equals(var498.field3291)) {
                            var498.field3291 = var500;
                            class277.method1822(4096, var498);
                        }
                        if (var498.field3283 == -1) {
                            class133.method909(var498.field3250, (byte) -76);
                        }
                        continue;
                    }
                    if (var529 == 1113) {
                        var7--;
                        var498.field3172 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1114) {
                        var7 -= 3;
                        var498.field3192 = class335.field5214[var7];
                        var498.field3174 = class335.field5214[var7 + 1];
                        var498.field3154 = class335.field5214[var7 + 2];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1115) {
                        var7--;
                        var498.field3189 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1116) {
                        var7--;
                        var498.field3265 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1117) {
                        var7--;
                        var498.field3287 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1118) {
                        var7--;
                        var498.field3131 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1119) {
                        var7--;
                        var498.field3128 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1120) {
                        var7 -= 2;
                        var498.field3153 = class335.field5214[var7];
                        var498.field3187 = class335.field5214[var7 + 1];
                        class277.method1822(4096, var498);
                        if (var498.field3273 == 0) {
                            class342.method2386(false, var498, 125);
                        }
                        continue;
                    }
                    if (var529 == 1121) {
                        var7 -= 2;
                        var498.field3292 = (short) class335.field5214[var7];
                        var498.field3176 = (short) class335.field5214[var7 + 1];
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1122) {
                        var7--;
                        var498.field3196 = class335.field5214[var7] == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                    if (var529 == 1123) {
                        var7--;
                        var498.field3183 = class335.field5214[var7];
                        class277.method1822(4096, var498);
                        if (var498.field3283 == -1) {
                            class77.method542(var498.field3250, 127);
                        }
                        continue;
                    }
                    if (var529 == 1124) {
                        var7--;
                        int var501 = class335.field5214[var7];
                        var498.field3221 = var501 == 1;
                        class277.method1822(4096, var498);
                        continue;
                    }
                } else if (var529 >= 1200 && var529 < 1300 || var529 >= 2200 && var529 < 2300) {
                    class207 var494;
                    if (var529 < 2000) {
                        var494 = var47 ? class253.field3950 : class273.field4203;
                    } else {
                        var7--;
                        var494 = class78.method547(class335.field5214[var7], 109);
                        var529 -= 1000;
                    }
                    class277.method1822(4096, var494);
                    if (var529 == 1200 || var529 == 1205 || var529 == 1208 || var529 == 1209) {
                        var7 -= 2;
                        int var495 = class335.field5214[var7 + 1];
                        int var496 = class335.field5214[var7];
                        if (var494.field3283 == -1) {
                            class75.method531(-73, var494.field3250);
                            class77.method542(var494.field3250, 127);
                            class120.method815(var494.field3250, (byte) -43);
                        }
                        if (var496 == -1) {
                            var494.field3207 = -1;
                            var494.field3204 = 1;
                            var494.field3142 = -1;
                            continue;
                        }
                        var494.field3231 = var495;
                        var494.field3142 = var496;
                        if (var529 == 1208 || var529 == 1209) {
                            var494.field3190 = true;
                        } else {
                            var494.field3190 = false;
                        }
                        class291 var497 = class160.method1106(var496, -76);
                        var494.field3296 = var497.field4496;
                        var494.field3215 = var497.field4452;
                        var494.field3249 = var497.field4478;
                        if (var529 == 1205) {
                            var494.field3162 = false;
                        } else {
                            var494.field3162 = true;
                        }
                        var494.field3167 = var497.field4473;
                        var494.field3183 = var497.field4484;
                        if (var494.field3213 > 0) {
                            var494.field3183 = var494.field3183 * 32 / var494.field3213;
                        } else if (var494.field3264 > 0) {
                            var494.field3183 = var494.field3183 * 32 / var494.field3264;
                        }
                        var494.field3247 = var497.field4459;
                        continue;
                    }
                    if (var529 == 1201) {
                        var494.field3204 = 2;
                        var7--;
                        var494.field3207 = class335.field5214[var7];
                        if (var494.field3283 == -1) {
                            class90.method625(105, var494.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1202) {
                        var494.field3204 = 3;
                        var494.field3207 = class79.field1173.field1247.method1170(16537);
                        if (var494.field3283 == -1) {
                            class90.method625(121, var494.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1203) {
                        var494.field3204 = 6;
                        var7--;
                        var494.field3207 = class335.field5214[var7];
                        if (var494.field3283 == -1) {
                            class90.method625(117, var494.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1204) {
                        var494.field3204 = 5;
                        var7--;
                        var494.field3207 = class335.field5214[var7];
                        if (var494.field3283 == -1) {
                            class90.method625(106, var494.field3250);
                        }
                        continue;
                    }
                    if (var529 == 1206) {
                        var7 -= 4;
                        var494.field3195 = class335.field5214[var7];
                        var494.field3282 = class335.field5214[var7 + 1];
                        var494.field3156 = class335.field5214[var7 + 2];
                        var494.field3233 = class335.field5214[var7 + 3];
                        class277.method1822(4096, var494);
                        continue;
                    }
                    if (var529 == 1207) {
                        var7 -= 2;
                        var494.field3184 = class335.field5214[var7];
                        var494.field3165 = class335.field5214[var7 + 1];
                        class277.method1822(4096, var494);
                        continue;
                    }
                } else if ((var529 < 1300 || var529 >= 1400) && (var529 < 2300 || var529 >= 2400)) {
                    if (var529 >= 1400 && var529 < 1500 || var529 >= 2400 && var529 < 2500) {
                        class207 var487;
                        if (var529 < 2000) {
                            var487 = var47 ? class253.field3950 : class273.field4203;
                        } else {
                            var529 -= 1000;
                            var7--;
                            var487 = class78.method547(class335.field5214[var7], 101);
                        }
                        var8--;
                        String var488 = class63.field923[var8];
                        int[] var489 = null;
                        if (var488.length() > 0 && var488.charAt(var488.length() - 1) == 'Y') {
                            var7--;
                            int var490 = class335.field5214[var7];
                            if (var490 > 0) {
                                var489 = new int[var490];
                                while ((var490--) > 0) {
                                    var7--;
                                    var489[var490] = class335.field5214[var7];
                                }
                            }
                            var488 = var488.substring(0, var488.length() - 1);
                        }
                        Object[] var491 = new Object[var488.length() + 1];
                        for (int var492 = var491.length - 1; var492 >= 1; var492--) {
                            if (var488.charAt(var492 - 1) == 's') {
                                var8--;
                                var491[var492] = class63.field923[var8];
                            } else {
                                var7--;
                                var491[var492] = Integer.valueOf(class335.field5214[var7]);
                            }
                        }
                        var7--;
                        int var493 = class335.field5214[var7];
                        if (var493 == -1) {
                            var491 = null;
                        } else {
                            var491[0] = Integer.valueOf(var493);
                        }
                        var487.field3173 = true;
                        if (var529 == 1400) {
                            var487.field3228 = var491;
                        } else if (var529 == 1401) {
                            var487.field3141 = var491;
                        } else if (var529 == 1402) {
                            var487.field3123 = var491;
                        } else if (var529 == 1403) {
                            var487.field3303 = var491;
                        } else if (var529 == 1404) {
                            var487.field3144 = var491;
                        } else if (var529 == 1405) {
                            var487.field3126 = var491;
                        } else if (var529 == 1406) {
                            var487.field3194 = var491;
                        } else if (var529 == 1407) {
                            var487.field3294 = var491;
                            var487.field3257 = var489;
                        } else if (var529 == 1408) {
                            var487.field3225 = var491;
                        } else if (var529 == 1409) {
                            var487.field3238 = var491;
                        } else if (var529 == 1410) {
                            var487.field3198 = var491;
                        } else if (var529 == 1411) {
                            var487.field3285 = var491;
                        } else if (var529 == 1412) {
                            var487.field3206 = var491;
                        } else if (var529 == 1414) {
                            var487.field3266 = var491;
                            var487.field3280 = var489;
                        } else if (var529 == 1415) {
                            var487.field3262 = var489;
                            var487.field3168 = var491;
                        } else if (var529 == 1416) {
                            var487.field3278 = var491;
                        } else if (var529 == 1417) {
                            var487.field3152 = var491;
                        } else if (var529 == 1418) {
                            var487.field3258 = var491;
                        } else if (var529 == 1419) {
                            var487.field3263 = var491;
                        } else if (var529 == 1420) {
                            var487.field3218 = var491;
                        } else if (var529 == 1421) {
                            var487.field3298 = var491;
                        } else if (var529 == 1422) {
                            var487.field3147 = var491;
                        } else if (var529 == 1423) {
                            var487.field3219 = var491;
                        } else if (var529 == 1424) {
                            var487.field3127 = var491;
                        } else if (var529 == 1425) {
                            var487.field3151 = var491;
                        } else if (var529 == 1426) {
                            var487.field3248 = var491;
                        } else if (var529 == 1427) {
                            var487.field3130 = var491;
                        } else if (var529 == 1428) {
                            var487.field3181 = var489;
                            var487.field3220 = var491;
                        } else if (var529 == 1429) {
                            var487.field3224 = var489;
                            var487.field3155 = var491;
                        }
                        continue;
                    }
                    if (var529 < 1600) {
                        class207 var60 = var47 ? class253.field3950 : class273.field4203;
                        if (var529 == 1500) {
                            class335.field5214[var7++] = var60.field3177;
                            continue;
                        }
                        if (var529 == 1501) {
                            class335.field5214[var7++] = var60.field3212;
                            continue;
                        }
                        if (var529 == 1502) {
                            class335.field5214[var7++] = var60.field3169;
                            continue;
                        }
                        if (var529 == 1503) {
                            class335.field5214[var7++] = var60.field3239;
                            continue;
                        }
                        if (var529 == 1504) {
                            class335.field5214[var7++] = var60.field3197 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 1505) {
                            class335.field5214[var7++] = var60.field3232;
                            continue;
                        }
                    } else if (var529 < 1700) {
                        class207 var61 = var47 ? class253.field3950 : class273.field4203;
                        if (var529 == 1600) {
                            class335.field5214[var7++] = var61.field3245;
                            continue;
                        }
                        if (var529 == 1601) {
                            class335.field5214[var7++] = var61.field3270;
                            continue;
                        }
                        if (var529 == 1602) {
                            class63.field923[var8++] = var61.field3291;
                            continue;
                        }
                        if (var529 == 1603) {
                            class335.field5214[var7++] = var61.field3153;
                            continue;
                        }
                        if (var529 == 1604) {
                            class335.field5214[var7++] = var61.field3187;
                            continue;
                        }
                        if (var529 == 1605) {
                            class335.field5214[var7++] = var61.field3183;
                            continue;
                        }
                        if (var529 == 1606) {
                            class335.field5214[var7++] = var61.field3247;
                            continue;
                        }
                        if (var529 == 1607) {
                            class335.field5214[var7++] = var61.field3249;
                            continue;
                        }
                        if (var529 == 1608) {
                            class335.field5214[var7++] = var61.field3215;
                            continue;
                        }
                        if (var529 == 1609) {
                            class335.field5214[var7++] = var61.field3269;
                            continue;
                        }
                        if (var529 == 1610) {
                            class335.field5214[var7++] = var61.field3296;
                            continue;
                        }
                        if (var529 == 1611) {
                            class335.field5214[var7++] = var61.field3167;
                            continue;
                        }
                        if (var529 == 1612) {
                            class335.field5214[var7++] = var61.field3211;
                            continue;
                        }
                    } else if (var529 < 1800) {
                        class207 var62 = var47 ? class253.field3950 : class273.field4203;
                        if (var529 == 1700) {
                            class335.field5214[var7++] = var62.field3142;
                            continue;
                        }
                        if (var529 == 1701) {
                            if (var62.field3142 == -1) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = var62.field3231;
                            }
                            continue;
                        }
                        if (var529 == 1702) {
                            class335.field5214[var7++] = var62.field3283;
                            continue;
                        }
                    } else if (var529 < 1900) {
                        class207 var485 = var47 ? class253.field3950 : class273.field4203;
                        if (var529 == 1800) {
                            class335.field5214[var7++] = client.method888(var485).method733(-162680420);
                            continue;
                        }
                        if (var529 == 1801) {
                            var7--;
                            int var486 = class335.field5214[var7];
                            int var531 = var486 - 1;
                            if (var485.field3157 != null && var485.field3157.length > var531 && var485.field3157[var531] != null) {
                                class63.field923[var8++] = var485.field3157[var531];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 1802) {
                            if (var485.field3124 == null) {
                                class63.field923[var8++] = "";
                            } else {
                                class63.field923[var8++] = var485.field3124;
                            }
                            continue;
                        }
                    } else if (var529 < 2600) {
                        var7--;
                        class207 var63 = class78.method547(class335.field5214[var7], 108);
                        if (var529 == 2500) {
                            class335.field5214[var7++] = var63.field3177;
                            continue;
                        }
                        if (var529 == 2501) {
                            class335.field5214[var7++] = var63.field3212;
                            continue;
                        }
                        if (var529 == 2502) {
                            class335.field5214[var7++] = var63.field3169;
                            continue;
                        }
                        if (var529 == 2503) {
                            class335.field5214[var7++] = var63.field3239;
                            continue;
                        }
                        if (var529 == 2504) {
                            class335.field5214[var7++] = var63.field3197 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 2505) {
                            class335.field5214[var7++] = var63.field3232;
                            continue;
                        }
                    } else if (var529 < 2700) {
                        var7--;
                        class207 var64 = class78.method547(class335.field5214[var7], 94);
                        if (var529 == 2600) {
                            class335.field5214[var7++] = var64.field3245;
                            continue;
                        }
                        if (var529 == 2601) {
                            class335.field5214[var7++] = var64.field3270;
                            continue;
                        }
                        if (var529 == 2602) {
                            class63.field923[var8++] = var64.field3291;
                            continue;
                        }
                        if (var529 == 2603) {
                            class335.field5214[var7++] = var64.field3153;
                            continue;
                        }
                        if (var529 == 2604) {
                            class335.field5214[var7++] = var64.field3187;
                            continue;
                        }
                        if (var529 == 2605) {
                            class335.field5214[var7++] = var64.field3183;
                            continue;
                        }
                        if (var529 == 2606) {
                            class335.field5214[var7++] = var64.field3247;
                            continue;
                        }
                        if (var529 == 2607) {
                            class335.field5214[var7++] = var64.field3249;
                            continue;
                        }
                        if (var529 == 2608) {
                            class335.field5214[var7++] = var64.field3215;
                            continue;
                        }
                        if (var529 == 2609) {
                            class335.field5214[var7++] = var64.field3269;
                            continue;
                        }
                        if (var529 == 2610) {
                            class335.field5214[var7++] = var64.field3296;
                            continue;
                        }
                        if (var529 == 2611) {
                            class335.field5214[var7++] = var64.field3167;
                            continue;
                        }
                        if (var529 == 2612) {
                            class335.field5214[var7++] = var64.field3211;
                            continue;
                        }
                    } else if (var529 < 2800) {
                        if (var529 == 2700) {
                            var7--;
                            class207 var65 = class78.method547(class335.field5214[var7], 101);
                            class335.field5214[var7++] = var65.field3142;
                            continue;
                        }
                        if (var529 == 2701) {
                            var7--;
                            class207 var66 = class78.method547(class335.field5214[var7], 109);
                            if (var66.field3142 == -1) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = var66.field3231;
                            }
                            continue;
                        }
                        if (var529 == 2702) {
                            var7--;
                            int var67 = class335.field5214[var7];
                            class45 var68 = (class45) class166.field2557.method1558((long) var67, false);
                            if (var68 == null) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = 1;
                            }
                            continue;
                        }
                        if (var529 == 2703) {
                            var7--;
                            class207 var69 = class78.method547(class335.field5214[var7], 96);
                            if (var69.field3253 == null) {
                                class335.field5214[var7++] = 0;
                                continue;
                            }
                            int var70 = var69.field3253.length;
                            for (int var71 = 0; var71 < var69.field3253.length; var71++) {
                                if (var69.field3253[var71] == null) {
                                    var70 = var71;
                                    break;
                                }
                            }
                            class335.field5214[var7++] = var70;
                            continue;
                        }
                        if (var529 == 2704 || var529 == 2705) {
                            var7 -= 2;
                            int var72 = class335.field5214[var7];
                            int var73 = class335.field5214[var7 + 1];
                            class45 var74 = (class45) class166.field2557.method1558((long) var72, false);
                            if (var74 != null && var74.field640 == var73) {
                                class335.field5214[var7++] = 1;
                            } else {
                                class335.field5214[var7++] = 0;
                            }
                            continue;
                        }
                    } else if (var529 < 2900) {
                        var7--;
                        class207 var75 = class78.method547(class335.field5214[var7], 120);
                        if (var529 == 2800) {
                            class335.field5214[var7++] = client.method888(var75).method733(-162680420);
                            continue;
                        }
                        if (var529 == 2801) {
                            var7--;
                            int var76 = class335.field5214[var7];
                            int var530 = var76 - 1;
                            if (var75.field3157 != null && var75.field3157.length > var530 && var75.field3157[var530] != null) {
                                class63.field923[var8++] = var75.field3157[var530];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 2802) {
                            if (var75.field3124 == null) {
                                class63.field923[var8++] = "";
                            } else {
                                class63.field923[var8++] = var75.field3124;
                            }
                            continue;
                        }
                    } else if (var529 < 3200) {
                        if (var529 == 3100) {
                            var8--;
                            String var77 = class63.field923[var8];
                            class343.method2390(var77, 0, false, "");
                            continue;
                        }
                        if (var529 == 3101) {
                            var7 -= 2;
                            class17.method126(-1, class335.field5214[var7 + 1], class79.field1173, class335.field5214[var7]);
                            continue;
                        }
                        if (var529 == 3103) {
                            class115.method791(128);
                            continue;
                        }
                        if (var529 == 3104) {
                            class205.field3094++;
                            var8--;
                            String var78 = class63.field923[var8];
                            int var79 = 0;
                            if (class139.method944(var78, 103)) {
                                var79 = class154.method1073(-122, var78);
                            }
                            class265.field4095.method2064(255, 101);
                            class265.field4095.method2013(var79, -86);
                            continue;
                        }
                        if (var529 == 3105) {
                            class278.field4289++;
                            var8--;
                            String var80 = class63.field923[var8];
                            class265.field4095.method2064(255, 188);
                            class265.field4095.method2023(class108.method723(var80, -11), 108);
                            continue;
                        }
                        if (var529 == 3106) {
                            var8--;
                            String var81 = class63.field923[var8];
                            class265.field4095.method2064(255, 144);
                            class265.field4095.method2034(-109, var81.length() + 1);
                            class265.field4095.method2057(65, var81);
                            class13.field137++;
                            continue;
                        }
                        if (var529 == 3107) {
                            var7--;
                            int var82 = class335.field5214[var7];
                            var8--;
                            String var83 = class63.field923[var8];
                            class174.method1181(var83, var82, 108);
                            continue;
                        }
                        if (var529 == 3108) {
                            var7 -= 3;
                            int var84 = class335.field5214[var7];
                            int var85 = class335.field5214[var7 + 1];
                            int var86 = class335.field5214[var7 + 2];
                            class207 var87 = class78.method547(var86, 119);
                            class68.method487(var84, true, var85, var87);
                            continue;
                        }
                        if (var529 == 3109) {
                            var7 -= 2;
                            int var88 = class335.field5214[var7];
                            int var89 = class335.field5214[var7 + 1];
                            class207 var90 = var47 ? class253.field3950 : class273.field4203;
                            class68.method487(var88, true, var89, var90);
                            continue;
                        }
                        if (var529 == 3110) {
                            class151.field2378++;
                            var7--;
                            int var91 = class335.field5214[var7];
                            class265.field4095.method2064(255, 148);
                            class265.field4095.method2044(1247686728, var91);
                            continue;
                        }
                    } else if (var529 < 3300) {
                        if (var529 == 3200) {
                            var7 -= 3;
                            class118.method810(class335.field5214[var7], true, class335.field5214[var7 + 1], 255, class335.field5214[var7 + 2]);
                            continue;
                        }
                        if (var529 == 3201) {
                            var7--;
                            class17.method131(class335.field5214[var7], 255, 1000);
                            continue;
                        }
                        if (var529 == 3202) {
                            var7 -= 2;
                            class144.method1008(class335.field5214[var7], 255, class335.field5214[var7 + 1], -1448946488);
                            continue;
                        }
                    } else if (var529 < 3400) {
                        if (var529 == 3300) {
                            class335.field5214[var7++] = class343.field5341;
                            continue;
                        }
                        if (var529 == 3301) {
                            var7 -= 2;
                            int var451 = class335.field5214[var7];
                            int var452 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class64.method457(false, var452, var451);
                            continue;
                        }
                        if (var529 == 3302) {
                            var7 -= 2;
                            int var453 = class335.field5214[var7];
                            int var454 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class253.method1707(24567, var453, var454);
                            continue;
                        }
                        if (var529 == 3303) {
                            var7 -= 2;
                            int var455 = class335.field5214[var7 + 1];
                            int var456 = class335.field5214[var7];
                            class335.field5214[var7++] = class158.method1099(var456, (byte) -115, var455);
                            continue;
                        }
                        if (var529 == 3304) {
                            var7--;
                            int var457 = class335.field5214[var7];
                            class335.field5214[var7++] = class61.method412(-55, var457).field967;
                            continue;
                        }
                        if (var529 == 3305) {
                            var7--;
                            int var458 = class335.field5214[var7];
                            class335.field5214[var7++] = class314.field4951[var458];
                            continue;
                        }
                        if (var529 == 3306) {
                            var7--;
                            int var459 = class335.field5214[var7];
                            class335.field5214[var7++] = class139.field2156[var459];
                            continue;
                        }
                        if (var529 == 3307) {
                            var7--;
                            int var460 = class335.field5214[var7];
                            class335.field5214[var7++] = class205.field3106[var460];
                            continue;
                        }
                        if (var529 == 3308) {
                            int var461 = class77.field1154;
                            int var462 = (class79.field1173.field537 >> 7) + class30.field374;
                            int var463 = (class79.field1173.field519 >> 7) + class294.field4535;
                            class335.field5214[var7++] = (var461 << 28) + (var462 << 14) + var463;
                            continue;
                        }
                        if (var529 == 3309) {
                            var7--;
                            int var464 = class335.field5214[var7];
                            class335.field5214[var7++] = class311.method2135(268424769, var464) >> 14;
                            continue;
                        }
                        if (var529 == 3310) {
                            var7--;
                            int var465 = class335.field5214[var7];
                            class335.field5214[var7++] = var465 >> 28;
                            continue;
                        }
                        if (var529 == 3311) {
                            var7--;
                            int var466 = class335.field5214[var7];
                            class335.field5214[var7++] = class311.method2135(var466, 16383);
                            continue;
                        }
                        if (var529 == 3312) {
                            class335.field5214[var7++] = class219.field3484 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3313) {
                            var7 -= 2;
                            int var467 = class335.field5214[var7] + 32768;
                            int var468 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class64.method457(false, var468, var467);
                            continue;
                        }
                        if (var529 == 3314) {
                            var7 -= 2;
                            int var469 = class335.field5214[var7] + 32768;
                            int var470 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class253.method1707(24567, var469, var470);
                            continue;
                        }
                        if (var529 == 3315) {
                            var7 -= 2;
                            int var471 = class335.field5214[var7] + 32768;
                            int var472 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class158.method1099(var471, (byte) -77, var472);
                            continue;
                        }
                        if (var529 == 3316) {
                            if (class215.field3399 >= 2) {
                                class335.field5214[var7++] = class215.field3399;
                            } else {
                                class335.field5214[var7++] = 0;
                            }
                            continue;
                        }
                        if (var529 == 3317) {
                            class335.field5214[var7++] = class181.field2782;
                            continue;
                        }
                        if (var529 == 3318) {
                            class335.field5214[var7++] = class19.field259;
                            continue;
                        }
                        if (var529 == 3321) {
                            class335.field5214[var7++] = class158.field2469;
                            continue;
                        }
                        if (var529 == 3322) {
                            class335.field5214[var7++] = class271.field4167;
                            continue;
                        }
                        if (var529 == 3323) {
                            if (class307.field4839 >= 5 && class307.field4839 <= 9) {
                                class335.field5214[var7++] = 1;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3324) {
                            if (class307.field4839 >= 5 && class307.field4839 <= 9) {
                                class335.field5214[var7++] = class307.field4839;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3325) {
                            class335.field5214[var7++] = class84.field1275 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3326) {
                            class335.field5214[var7++] = class79.field1173.field1236;
                            continue;
                        }
                        if (var529 == 3327) {
                            class335.field5214[var7++] = class79.field1173.field1247.field2608 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3328) {
                            class335.field5214[var7++] = class50.field707 && !class83.field1258 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3329) {
                            class335.field5214[var7++] = class207.field3288 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3330) {
                            var7--;
                            int var473 = class335.field5214[var7];
                            class335.field5214[var7++] = class86.method589(var473, 2656);
                            continue;
                        }
                        if (var529 == 3331) {
                            var7 -= 2;
                            int var474 = class335.field5214[var7];
                            int var475 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class272.method1789(var475, 0, var474, false);
                            continue;
                        }
                        if (var529 == 3332) {
                            var7 -= 2;
                            int var476 = class335.field5214[var7 + 1];
                            int var477 = class335.field5214[var7];
                            class335.field5214[var7++] = class272.method1789(var476, 0, var477, true);
                            continue;
                        }
                        if (var529 == 3333) {
                            class335.field5214[var7++] = class249.field3912;
                            continue;
                        }
                        if (var529 == 3335) {
                            class335.field5214[var7++] = class157.field2462;
                            continue;
                        }
                        if (var529 == 3336) {
                            var7 -= 4;
                            int var478 = class335.field5214[var7];
                            int var479 = class335.field5214[var7 + 2];
                            int var480 = class335.field5214[var7 + 3];
                            int var481 = class335.field5214[var7 + 1];
                            int var482 = (var481 << 14) + var478;
                            int var483 = (var479 << 28) + var482;
                            int var484 = var480 + var483;
                            class335.field5214[var7++] = var484;
                            continue;
                        }
                        if (var529 == 3337) {
                            class335.field5214[var7++] = class123.field1928;
                            continue;
                        }
                    } else if (var529 < 3500) {
                        if (var529 == 3400) {
                            var7 -= 2;
                            int var434 = class335.field5214[var7];
                            int var435 = class335.field5214[var7 + 1];
                            class225 var436 = class303.method2029(var434, -91);
                            if (var436.field3594 != 's') {
                            }
                            class63.field923[var8++] = var436.method1536((byte) -110, var435);
                            continue;
                        }
                        if (var529 == 3408) {
                            var7 -= 4;
                            int var437 = class335.field5214[var7 + 1];
                            int var438 = class335.field5214[var7 + 2];
                            int var439 = class335.field5214[var7];
                            int var440 = class335.field5214[var7 + 3];
                            class225 var441 = class303.method2029(var438, -42);
                            if (var441.field3599 == var439 && var441.field3594 == var437) {
                                if (var437 == 115) {
                                    class63.field923[var8++] = var441.method1536((byte) -110, var440);
                                } else {
                                    class335.field5214[var7++] = var441.method1529(10, var440);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var529 == 3409) {
                            var7 -= 3;
                            int var442 = class335.field5214[var7];
                            int var443 = class335.field5214[var7 + 2];
                            int var444 = class335.field5214[var7 + 1];
                            if (var444 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class225 var445 = class303.method2029(var444, -116);
                            if (var445.field3594 != var442) {
                                throw new RuntimeException("C3409-1");
                            }
                            class335.field5214[var7++] = var445.method1531(22292, var443) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3410) {
                            var7--;
                            int var446 = class335.field5214[var7];
                            var8--;
                            String var447 = class63.field923[var8];
                            if (var446 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class225 var448 = class303.method2029(var446, -54);
                            if (var448.field3594 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class335.field5214[var7++] = var448.method1534(var447, 64) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3411) {
                            var7--;
                            int var449 = class335.field5214[var7];
                            class225 var450 = class303.method2029(var449, -121);
                            class335.field5214[var7++] = var450.field3602.method1559(-29512);
                            continue;
                        }
                    } else if (var529 < 3700) {
                        if (var529 == 3600) {
                            if (class144.field2289 == 0) {
                                class335.field5214[var7++] = -2;
                            } else if (class144.field2289 == 1) {
                                class335.field5214[var7++] = -1;
                            } else {
                                class335.field5214[var7++] = class116.field1795;
                            }
                            continue;
                        }
                        if (var529 == 3601) {
                            var7--;
                            int var92 = class335.field5214[var7];
                            if (class144.field2289 == 2 && class116.field1795 > var92) {
                                class63.field923[var8++] = class120.field1851[var92];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 3602) {
                            var7--;
                            int var93 = class335.field5214[var7];
                            if (class144.field2289 == 2 && class116.field1795 > var93) {
                                class335.field5214[var7++] = class95.field1455[var93];
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3603) {
                            var7--;
                            int var94 = class335.field5214[var7];
                            if (class144.field2289 == 2 && var94 < class116.field1795) {
                                class335.field5214[var7++] = class229.field3673[var94];
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3604) {
                            var8--;
                            String var95 = class63.field923[var8];
                            var7--;
                            int var96 = class335.field5214[var7];
                            class27.method206(var96, (byte) 84, var95);
                            continue;
                        }
                        if (var529 == 3605) {
                            var8--;
                            String var97 = class63.field923[var8];
                            class18.method145(class108.method723(var97, -100), (byte) -127);
                            continue;
                        }
                        if (var529 == 3606) {
                            var8--;
                            String var98 = class63.field923[var8];
                            class220.method1466(0, class108.method723(var98, -79));
                            continue;
                        }
                        if (var529 == 3607) {
                            var8--;
                            String var99 = class63.field923[var8];
                            class212.method1420(0, false, class108.method723(var99, -89));
                            continue;
                        }
                        if (var529 == 3608) {
                            var8--;
                            String var100 = class63.field923[var8];
                            class38.method270((byte) 75, class108.method723(var100, -118));
                            continue;
                        }
                        if (var529 == 3609) {
                            var8--;
                            String var101 = class63.field923[var8];
                            if (var101.startsWith("<img=0>") || var101.startsWith("<img=1>")) {
                                var101 = var101.substring(7);
                            }
                            class335.field5214[var7++] = class240.method1639(var101, 0) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3610) {
                            var7--;
                            int var102 = class335.field5214[var7];
                            if (class144.field2289 == 2 && var102 < class116.field1795) {
                                class63.field923[var8++] = class30.field373[var102];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 3611) {
                            if (class124.field1940 == null) {
                                class63.field923[var8++] = "";
                            } else {
                                class63.field923[var8++] = class193.method1314(class124.field1940, (byte) 120);
                            }
                            continue;
                        }
                        if (var529 == 3612) {
                            if (class124.field1940 == null) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = class172.field2628;
                            }
                            continue;
                        }
                        if (var529 == 3613) {
                            var7--;
                            int var103 = class335.field5214[var7];
                            if (class124.field1940 != null && var103 < class172.field2628) {
                                class63.field923[var8++] = class193.method1314(class146.field2297[var103].field3408, (byte) 121);
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 3614) {
                            var7--;
                            int var104 = class335.field5214[var7];
                            if (class124.field1940 != null && var104 < class172.field2628) {
                                class335.field5214[var7++] = class146.field2297[var104].field3401;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3615) {
                            var7--;
                            int var105 = class335.field5214[var7];
                            if (class124.field1940 != null && class172.field2628 > var105) {
                                class335.field5214[var7++] = class146.field2297[var105].field3405;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3616) {
                            class335.field5214[var7++] = class139.field2157;
                            continue;
                        }
                        if (var529 == 3617) {
                            var8--;
                            String var106 = class63.field923[var8];
                            class317.method2156(0, var106);
                            continue;
                        }
                        if (var529 == 3618) {
                            class335.field5214[var7++] = class294.field4523;
                            continue;
                        }
                        if (var529 == 3619) {
                            var8--;
                            String var107 = class63.field923[var8];
                            class211.method1411(class108.method723(var107, -89), 111);
                            continue;
                        }
                        if (var529 == 3620) {
                            class175.method1182((byte) 64);
                            continue;
                        }
                        if (var529 == 3621) {
                            if (class144.field2289 == 0) {
                                class335.field5214[var7++] = -1;
                            } else {
                                class335.field5214[var7++] = class190.field2891;
                            }
                            continue;
                        }
                        if (var529 == 3622) {
                            var7--;
                            int var108 = class335.field5214[var7];
                            if (class144.field2289 != 0 && class190.field2891 > var108) {
                                class63.field923[var8++] = class305.method2073(false, class115.field1792[var108]);
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 3623) {
                            var8--;
                            String var109 = class63.field923[var8];
                            if (var109.startsWith("<img=0>") || var109.startsWith("<img=1>")) {
                                var109 = var109.substring(7);
                            }
                            class335.field5214[var7++] = class329.method2226(var109, 32) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3624) {
                            var7--;
                            int var110 = class335.field5214[var7];
                            if (class146.field2297 != null && class172.field2628 > var110 && class146.field2297[var110].field3408.equalsIgnoreCase(class79.field1173.field1218)) {
                                class335.field5214[var7++] = 1;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3625) {
                            if (class168.field2573 == null) {
                                class63.field923[var8++] = "";
                            } else {
                                class63.field923[var8++] = class193.method1314(class168.field2573, (byte) 121);
                            }
                            continue;
                        }
                        if (var529 == 3626) {
                            var7--;
                            int var111 = class335.field5214[var7];
                            if (class124.field1940 != null && var111 < class172.field2628) {
                                class63.field923[var8++] = class146.field2297[var111].field3406;
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 3627) {
                            var7--;
                            int var112 = class335.field5214[var7];
                            if (class144.field2289 == 2 && var112 >= 0 && var112 < class116.field1795) {
                                class335.field5214[var7++] = class291.field4454[var112] ? 1 : 0;
                                continue;
                            }
                            class335.field5214[var7++] = 0;
                            continue;
                        }
                        if (var529 == 3628) {
                            var8--;
                            String var113 = class63.field923[var8];
                            if (var113.startsWith("<img=0>") || var113.startsWith("<img=1>")) {
                                var113 = var113.substring(7);
                            }
                            class335.field5214[var7++] = class6.method38(var113, (byte) 125);
                            continue;
                        }
                        if (var529 == 3629) {
                            class335.field5214[var7++] = class79.field1177;
                            continue;
                        }
                        if (var529 == 3630) {
                            var8--;
                            String var114 = class63.field923[var8];
                            class212.method1420(0, true, class108.method723(var114, -46));
                            continue;
                        }
                        if (var529 == 3631) {
                            var7--;
                            int var115 = class335.field5214[var7];
                            class335.field5214[var7++] = class240.field3819[var115] ? 1 : 0;
                            continue;
                        }
                    } else if (var529 < 4000) {
                        if (var529 == 3903) {
                            var7--;
                            int var420 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var420].method1323(false);
                            continue;
                        }
                        if (var529 == 3904) {
                            var7--;
                            int var421 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var421].field2947;
                            continue;
                        }
                        if (var529 == 3905) {
                            var7--;
                            int var422 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var422].field2949;
                            continue;
                        }
                        if (var529 == 3906) {
                            var7--;
                            int var423 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var423].field2938;
                            continue;
                        }
                        if (var529 == 3907) {
                            var7--;
                            int var424 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var424].field2942;
                            continue;
                        }
                        if (var529 == 3908) {
                            var7--;
                            int var425 = class335.field5214[var7];
                            class335.field5214[var7++] = class106.field1623[var425].field2937;
                            continue;
                        }
                        if (var529 == 3910) {
                            var7--;
                            int var426 = class335.field5214[var7];
                            int var427 = class106.field1623[var426].method1324(116);
                            class335.field5214[var7++] = var427 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3911) {
                            var7--;
                            int var428 = class335.field5214[var7];
                            int var429 = class106.field1623[var428].method1324(118);
                            class335.field5214[var7++] = var429 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3912) {
                            var7--;
                            int var430 = class335.field5214[var7];
                            int var431 = class106.field1623[var430].method1324(96);
                            class335.field5214[var7++] = var431 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 3913) {
                            var7--;
                            int var432 = class335.field5214[var7];
                            int var433 = class106.field1623[var432].method1324(106);
                            class335.field5214[var7++] = var433 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var529 < 4100) {
                        if (var529 == 4000) {
                            var7 -= 2;
                            int var116 = class335.field5214[var7];
                            int var117 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var116 + var117;
                            continue;
                        }
                        if (var529 == 4001) {
                            var7 -= 2;
                            int var118 = class335.field5214[var7];
                            int var119 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var118 - var119;
                            continue;
                        }
                        if (var529 == 4002) {
                            var7 -= 2;
                            int var120 = class335.field5214[var7];
                            int var121 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var120 * var121;
                            continue;
                        }
                        if (var529 == 4003) {
                            var7 -= 2;
                            int var122 = class335.field5214[var7];
                            int var123 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var122 / var123;
                            continue;
                        }
                        if (var529 == 4004) {
                            var7--;
                            int var124 = class335.field5214[var7];
                            class335.field5214[var7++] = (int) ((double) var124 * Math.random());
                            continue;
                        }
                        if (var529 == 4005) {
                            var7--;
                            int var125 = class335.field5214[var7];
                            class335.field5214[var7++] = (int) (Math.random() * (double) (var125 + 1));
                            continue;
                        }
                        if (var529 == 4006) {
                            var7 -= 5;
                            int var126 = class335.field5214[var7 + 1];
                            int var127 = class335.field5214[var7];
                            int var128 = class335.field5214[var7 + 2];
                            int var129 = class335.field5214[var7 + 4];
                            int var130 = class335.field5214[var7 + 3];
                            class335.field5214[var7++] = var127 + ((var126 - var127) * (var129 - var128) / (var130 - var128));
                            continue;
                        }
                        if (var529 == 4007) {
                            var7 -= 2;
                            long var131 = (long) class335.field5214[var7 + 1];
                            long var133 = (long) class335.field5214[var7];
                            class335.field5214[var7++] = (int) (var131 * var133 / 100L + var133);
                            continue;
                        }
                        if (var529 == 4008) {
                            var7 -= 2;
                            int var135 = class335.field5214[var7];
                            int var136 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class276.method1810(0x1 << var136, var135);
                            continue;
                        }
                        if (var529 == 4009) {
                            var7 -= 2;
                            int var137 = class335.field5214[var7 + 1];
                            int var138 = class335.field5214[var7];
                            class335.field5214[var7++] = class311.method2135(var138, -(0x1 << var137) - 1);
                            continue;
                        }
                        if (var529 == 4010) {
                            var7 -= 2;
                            int var139 = class335.field5214[var7];
                            int var140 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class311.method2135(0x1 << var140, var139) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var529 == 4011) {
                            var7 -= 2;
                            int var141 = class335.field5214[var7];
                            int var142 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var141 % var142;
                            continue;
                        }
                        if (var529 == 4012) {
                            var7 -= 2;
                            int var143 = class335.field5214[var7 + 1];
                            int var144 = class335.field5214[var7];
                            if (var144 == 0) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = (int) Math.pow((double) var144, (double) var143);
                            }
                            continue;
                        }
                        if (var529 == 4013) {
                            var7 -= 2;
                            int var145 = class335.field5214[var7];
                            int var146 = class335.field5214[var7 + 1];
                            if (var145 == 0) {
                                class335.field5214[var7++] = 0;
                            } else if (var146 == 0) {
                                class335.field5214[var7++] = Integer.MAX_VALUE;
                            } else {
                                class335.field5214[var7++] = (int) Math.pow((double) var145, 1.0D / (double) var146);
                            }
                            continue;
                        }
                        if (var529 == 4014) {
                            var7 -= 2;
                            int var147 = class335.field5214[var7];
                            int var148 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class311.method2135(var148, var147);
                            continue;
                        }
                        if (var529 == 4015) {
                            var7 -= 2;
                            int var149 = class335.field5214[var7];
                            int var150 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class276.method1810(var149, var150);
                            continue;
                        }
                        if (var529 == 4016) {
                            var7 -= 2;
                            int var151 = class335.field5214[var7];
                            int var152 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var151 < var152 ? var151 : var152;
                            continue;
                        }
                        if (var529 == 4017) {
                            var7 -= 2;
                            int var153 = class335.field5214[var7];
                            int var154 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var154 < var153 ? var153 : var154;
                            continue;
                        }
                        if (var529 == 4018) {
                            var7 -= 3;
                            long var155 = (long) class335.field5214[var7];
                            long var157 = (long) class335.field5214[var7 + 2];
                            long var159 = (long) class335.field5214[var7 + 1];
                            class335.field5214[var7++] = (int) (var155 * var157 / var159);
                            continue;
                        }
                    } else if (var529 < 4200) {
                        if (var529 == 4100) {
                            var8--;
                            String var161 = class63.field923[var8];
                            var7--;
                            int var162 = class335.field5214[var7];
                            class63.field923[var8++] = var161 + var162;
                            continue;
                        }
                        if (var529 == 4101) {
                            var8 -= 2;
                            String var163 = class63.field923[var8];
                            String var164 = class63.field923[var8 + 1];
                            class63.field923[var8++] = var163 + var164;
                            continue;
                        }
                        if (var529 == 4102) {
                            var8--;
                            String var165 = class63.field923[var8];
                            var7--;
                            int var166 = class335.field5214[var7];
                            class63.field923[var8++] = var165 + class307.method2114(true, (byte) -17, var166);
                            continue;
                        }
                        if (var529 == 4103) {
                            var8--;
                            String var167 = class63.field923[var8];
                            class63.field923[var8++] = var167.toLowerCase();
                            continue;
                        }
                        if (var529 == 4104) {
                            var7--;
                            int var168 = class335.field5214[var7];
                            long var169 = (long) var168 * 86400000L + 1014768000000L;
                            class7.field73.setTime(new Date(var169));
                            int var171 = class7.field73.get(5);
                            int var172 = class7.field73.get(2);
                            int var173 = class7.field73.get(1);
                            class63.field923[var8++] = var171 + "-" + class71.field1076[var172] + "-" + var173;
                            continue;
                        }
                        if (var529 == 4105) {
                            var8 -= 2;
                            String var174 = class63.field923[var8];
                            String var175 = class63.field923[var8 + 1];
                            if (class79.field1173.field1247 != null && class79.field1173.field1247.field2608) {
                                class63.field923[var8++] = var175;
                                continue;
                            }
                            class63.field923[var8++] = var174;
                            continue;
                        }
                        if (var529 == 4106) {
                            var7--;
                            int var176 = class335.field5214[var7];
                            class63.field923[var8++] = Integer.toString(var176);
                            continue;
                        }
                        if (var529 == 4107) {
                            var8 -= 2;
                            class335.field5214[var7++] = class63.method447(false, class63.method442(121, class63.field923[var8 + 1], class63.field923[var8], class157.field2462));
                            continue;
                        }
                        if (var529 == 4108) {
                            var7 -= 2;
                            var8--;
                            String var177 = class63.field923[var8];
                            int var178 = class335.field5214[var7];
                            int var179 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = class81.method557(var179, (byte) 107).method1229(var177, var178);
                            continue;
                        }
                        if (var529 == 4109) {
                            var7 -= 2;
                            var8--;
                            String var180 = class63.field923[var8];
                            int var181 = class335.field5214[var7 + 1];
                            int var182 = class335.field5214[var7];
                            class335.field5214[var7++] = class81.method557(var181, (byte) 107).method1249(var180, var182);
                            continue;
                        }
                        if (var529 == 4110) {
                            var8 -= 2;
                            String var183 = class63.field923[var8];
                            String var184 = class63.field923[var8 + 1];
                            var7--;
                            if (class335.field5214[var7] == 1) {
                                class63.field923[var8++] = var183;
                            } else {
                                class63.field923[var8++] = var184;
                            }
                            continue;
                        }
                        if (var529 == 4111) {
                            var8--;
                            String var185 = class63.field923[var8];
                            class63.field923[var8++] = class180.method1238(var185);
                            continue;
                        }
                        if (var529 == 4112) {
                            var7--;
                            int var186 = class335.field5214[var7];
                            var8--;
                            String var187 = class63.field923[var8];
                            if (var186 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class63.field923[var8++] = var187 + (char) var186;
                            continue;
                        }
                        if (var529 == 4113) {
                            var7--;
                            int var188 = class335.field5214[var7];
                            class335.field5214[var7++] = class204.method1367((char) var188, 1) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4114) {
                            var7--;
                            int var189 = class335.field5214[var7];
                            class335.field5214[var7++] = class271.method1786((byte) -106, (char) var189) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4115) {
                            var7--;
                            int var190 = class335.field5214[var7];
                            class335.field5214[var7++] = class116.method801((char) var190, (byte) 125) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4116) {
                            var7--;
                            int var191 = class335.field5214[var7];
                            class335.field5214[var7++] = class138.method940(-49, (char) var191) ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4117) {
                            var8--;
                            String var192 = class63.field923[var8];
                            if (var192 == null) {
                                class335.field5214[var7++] = 0;
                            } else {
                                class335.field5214[var7++] = var192.length();
                            }
                            continue;
                        }
                        if (var529 == 4118) {
                            var7 -= 2;
                            var8--;
                            String var193 = class63.field923[var8];
                            int var194 = class335.field5214[var7];
                            int var195 = class335.field5214[var7 + 1];
                            class63.field923[var8++] = var193.substring(var194, var195);
                            continue;
                        }
                        if (var529 == 4119) {
                            var8--;
                            String var196 = class63.field923[var8];
                            StringBuffer var197 = new StringBuffer(var196.length());
                            boolean var198 = false;
                            for (int var199 = 0; var199 < var196.length(); var199++) {
                                char var200 = var196.charAt(var199);
                                if (var200 == '<') {
                                    var198 = true;
                                } else if (var200 == '>') {
                                    var198 = false;
                                } else if (!var198) {
                                    var197.append(var200);
                                }
                            }
                            class63.field923[var8++] = var197.toString();
                            continue;
                        }
                        if (var529 == 4120) {
                            var7 -= 2;
                            var8--;
                            String var201 = class63.field923[var8];
                            int var202 = class335.field5214[var7];
                            int var203 = class335.field5214[var7 + 1];
                            class335.field5214[var7++] = var201.indexOf(var202, var203);
                            continue;
                        }
                        if (var529 == 4121) {
                            var8 -= 2;
                            String var204 = class63.field923[var8];
                            String var205 = class63.field923[var8 + 1];
                            var7--;
                            int var206 = class335.field5214[var7];
                            class335.field5214[var7++] = var204.indexOf(var205, var206);
                            continue;
                        }
                        if (var529 == 4122) {
                            var7--;
                            int var207 = class335.field5214[var7];
                            class335.field5214[var7++] = Character.toLowerCase((char) var207);
                            continue;
                        }
                        if (var529 == 4123) {
                            var7--;
                            int var208 = class335.field5214[var7];
                            class335.field5214[var7++] = Character.toUpperCase((char) var208);
                            continue;
                        }
                        if (var529 == 4124) {
                            var7--;
                            boolean var209 = class335.field5214[var7] != 0;
                            var7--;
                            int var210 = class335.field5214[var7];
                            class63.field923[var8++] = class261.method1740(var209, 0, (byte) 18, (long) var210, class157.field2462);
                            continue;
                        }
                    } else if (var529 < 4300) {
                        if (var529 == 4200) {
                            var7--;
                            int var211 = class335.field5214[var7];
                            class63.field923[var8++] = class160.method1106(var211, -91).field4468;
                            continue;
                        }
                        if (var529 == 4201) {
                            var7 -= 2;
                            int var212 = class335.field5214[var7];
                            int var213 = class335.field5214[var7 + 1];
                            class291 var214 = class160.method1106(var212, 41);
                            if (var213 >= 1 && var213 <= 5 && var214.field4441[var213 - 1] != null) {
                                class63.field923[var8++] = var214.field4441[var213 - 1];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 4202) {
                            var7 -= 2;
                            int var215 = class335.field5214[var7];
                            int var216 = class335.field5214[var7 + 1];
                            class291 var217 = class160.method1106(var215, 68);
                            if (var216 >= 1 && var216 <= 5 && var217.field4431[var216 - 1] != null) {
                                class63.field923[var8++] = var217.field4431[var216 - 1];
                                continue;
                            }
                            class63.field923[var8++] = "";
                            continue;
                        }
                        if (var529 == 4203) {
                            var7--;
                            int var218 = class335.field5214[var7];
                            class335.field5214[var7++] = class160.method1106(var218, -93).field4492;
                            continue;
                        }
                        if (var529 == 4204) {
                            var7--;
                            int var219 = class335.field5214[var7];
                            class335.field5214[var7++] = class160.method1106(var219, 47).field4440 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4205) {
                            var7--;
                            int var220 = class335.field5214[var7];
                            class291 var221 = class160.method1106(var220, -101);
                            if (var221.field4432 == -1 && var221.field4466 >= 0) {
                                class335.field5214[var7++] = var221.field4466;
                                continue;
                            }
                            class335.field5214[var7++] = var220;
                            continue;
                        }
                        if (var529 == 4206) {
                            var7--;
                            int var222 = class335.field5214[var7];
                            class291 var223 = class160.method1106(var222, 54);
                            if (var223.field4432 >= 0 && var223.field4466 >= 0) {
                                class335.field5214[var7++] = var223.field4466;
                                continue;
                            }
                            class335.field5214[var7++] = var222;
                            continue;
                        }
                        if (var529 == 4207) {
                            var7--;
                            int var224 = class335.field5214[var7];
                            class335.field5214[var7++] = class160.method1106(var224, 86).field4467 ? 1 : 0;
                            continue;
                        }
                        if (var529 == 4208) {
                            var7 -= 2;
                            int var225 = class335.field5214[var7];
                            int var226 = class335.field5214[var7 + 1];
                            class280 var227 = class27.method209(11, var226);
                            if (var227.method1851(115)) {
                                class63.field923[var8++] = class160.method1106(var225, -125).method1905(var227.field4317, var226, -123);
                            } else {
                                class335.field5214[var7++] = class160.method1106(var225, 103).method1893(var227.field4315, (byte) -94, var226);
                            }
                            continue;
                        }
                        if (var529 == 4210) {
                            var8--;
                            String var228 = class63.field923[var8];
                            var7--;
                            int var229 = class335.field5214[var7];
                            class302.method1988((byte) 95, var228, var229 == 1);
                            class335.field5214[var7++] = class26.field336;
                            continue;
                        }
                        if (var529 == 4211) {
                            if (class27.field347 != null && class26.field336 > class125.field1960) {
                                class335.field5214[var7++] = class311.method2135(class27.field347[class125.field1960++], 65535);
                                continue;
                            }
                            class335.field5214[var7++] = -1;
                            continue;
                        }
                        if (var529 == 4212) {
                            class125.field1960 = 0;
                            continue;
                        }
                    } else if (var529 >= 4400) {
                        if (var529 >= 4500) {
                            if (var529 < 4600) {
                                if (var529 == 4500) {
                                    var7 -= 2;
                                    int var230 = class335.field5214[var7];
                                    int var231 = class335.field5214[var7 + 1];
                                    class280 var232 = class27.method209(11, var231);
                                    if (var232.method1851(115)) {
                                        class63.field923[var8++] = class269.method1780(var230, (byte) 93).method58(-98, var232.field4317, var231);
                                    } else {
                                        class335.field5214[var7++] = class269.method1780(var230, (byte) 92).method62(var231, 0, var232.field4315);
                                    }
                                    continue;
                                }
                            } else if (var529 < 5100) {
                                if (var529 == 5000) {
                                    class335.field5214[var7++] = class314.field4954;
                                    continue;
                                }
                                if (var529 == 5001) {
                                    class109.field1687++;
                                    var7 -= 3;
                                    class314.field4954 = class335.field5214[var7];
                                    class74.field1100 = class335.field5214[var7 + 1];
                                    class106.field1632 = class335.field5214[var7 + 2];
                                    class265.field4095.method2064(255, 48);
                                    class265.field4095.method2034(-10, class314.field4954);
                                    class265.field4095.method2034(-6, class74.field1100);
                                    class265.field4095.method2034(-92, class106.field1632);
                                    continue;
                                }
                                if (var529 == 5002) {
                                    var7 -= 2;
                                    class170.field2585++;
                                    var8--;
                                    String var349 = class63.field923[var8];
                                    int var350 = class335.field5214[var7];
                                    int var351 = class335.field5214[var7 + 1];
                                    class265.field4095.method2064(255, 198);
                                    class265.field4095.method2023(class108.method723(var349, -74), 121);
                                    class265.field4095.method2034(-53, var350 - 1);
                                    class265.field4095.method2034(-18, var351);
                                    continue;
                                }
                                if (var529 == 5003) {
                                    var7--;
                                    int var352 = class335.field5214[var7];
                                    String var353 = null;
                                    if (var352 < 100) {
                                        var353 = class226.field3615[var352];
                                    }
                                    if (var353 == null) {
                                        var353 = "";
                                    }
                                    class63.field923[var8++] = var353;
                                    continue;
                                }
                                if (var529 == 5004) {
                                    var7--;
                                    int var354 = class335.field5214[var7];
                                    int var355 = -1;
                                    if (var354 < 100 && class226.field3615[var354] != null) {
                                        var355 = class163.field2520[var354];
                                    }
                                    class335.field5214[var7++] = var355;
                                    continue;
                                }
                                if (var529 == 5005) {
                                    class335.field5214[var7++] = class74.field1100;
                                    continue;
                                }
                                if (var529 == 5008) {
                                    var8--;
                                    String var356 = class63.field923[var8];
                                    if (!var356.startsWith("::")) {
                                        if (class215.field3399 == 0 && (class50.field707 && !class83.field1258 || class207.field3288)) {
                                            continue;
                                        }
                                        class187.field2844++;
                                        String var357 = var356.toLowerCase();
                                        byte var358 = 0;
                                        if (var357.startsWith(class210.field3332)) {
                                            var356 = var356.substring(class210.field3332.length());
                                            var358 = 0;
                                        } else if (var357.startsWith(class231.field3725)) {
                                            var358 = 1;
                                            var356 = var356.substring(class231.field3725.length());
                                        } else if (var357.startsWith(class72.field1085)) {
                                            var358 = 2;
                                            var356 = var356.substring(class72.field1085.length());
                                        } else if (var357.startsWith(class308.field4848)) {
                                            var356 = var356.substring(class308.field4848.length());
                                            var358 = 3;
                                        } else if (var357.startsWith(class177.field2718)) {
                                            var356 = var356.substring(class177.field2718.length());
                                            var358 = 4;
                                        } else if (var357.startsWith(class280.field4321)) {
                                            var356 = var356.substring(class280.field4321.length());
                                            var358 = 5;
                                        } else if (var357.startsWith(class131.field2055)) {
                                            var358 = 6;
                                            var356 = var356.substring(class131.field2055.length());
                                        } else if (var357.startsWith(class120.field1848)) {
                                            var356 = var356.substring(class120.field1848.length());
                                            var358 = 7;
                                        } else if (var357.startsWith(class245.field3848)) {
                                            var358 = 8;
                                            var356 = var356.substring(class245.field3848.length());
                                        } else if (var357.startsWith(class14.field146)) {
                                            var356 = var356.substring(class14.field146.length());
                                            var358 = 9;
                                        } else if (var357.startsWith(class285.field4369)) {
                                            var356 = var356.substring(class285.field4369.length());
                                            var358 = 10;
                                        } else if (var357.startsWith(class17.field226)) {
                                            var358 = 11;
                                            var356 = var356.substring(class17.field226.length());
                                        } else if (class157.field2462 != 0) {
                                            if (var357.startsWith(class40.field572)) {
                                                var356 = var356.substring(class40.field572.length());
                                                var358 = 0;
                                            } else if (var357.startsWith(class190.field2899)) {
                                                var356 = var356.substring(class190.field2899.length());
                                                var358 = 1;
                                            } else if (var357.startsWith(class124.field1936)) {
                                                var358 = 2;
                                                var356 = var356.substring(class124.field1936.length());
                                            } else if (var357.startsWith(class89.field1357)) {
                                                var356 = var356.substring(class89.field1357.length());
                                                var358 = 3;
                                            } else if (var357.startsWith(class23.field287)) {
                                                var358 = 4;
                                                var356 = var356.substring(class23.field287.length());
                                            } else if (var357.startsWith(class155.field2438)) {
                                                var358 = 5;
                                                var356 = var356.substring(class155.field2438.length());
                                            } else if (var357.startsWith(class136.field2110)) {
                                                var356 = var356.substring(class136.field2110.length());
                                                var358 = 6;
                                            } else if (var357.startsWith(class161.field2498)) {
                                                var356 = var356.substring(class161.field2498.length());
                                                var358 = 7;
                                            } else if (var357.startsWith(class174.field2642)) {
                                                var356 = var356.substring(class174.field2642.length());
                                                var358 = 8;
                                            } else if (var357.startsWith(class107.field1644)) {
                                                var358 = 9;
                                                var356 = var356.substring(class107.field1644.length());
                                            } else if (var357.startsWith(class305.field4768)) {
                                                var358 = 10;
                                                var356 = var356.substring(class305.field4768.length());
                                            } else if (var357.startsWith(class51.field730)) {
                                                var358 = 11;
                                                var356 = var356.substring(class51.field730.length());
                                            }
                                        }
                                        String var359 = var356.toLowerCase();
                                        byte var360 = 0;
                                        if (var359.startsWith(class109.field1679)) {
                                            var356 = var356.substring(class109.field1679.length());
                                            var360 = 1;
                                        } else if (var359.startsWith(class298.field4610)) {
                                            var360 = 2;
                                            var356 = var356.substring(class298.field4610.length());
                                        } else if (var359.startsWith(class172.field2627)) {
                                            var356 = var356.substring(class172.field2627.length());
                                            var360 = 3;
                                        } else if (var359.startsWith(class248.field3900)) {
                                            var356 = var356.substring(class248.field3900.length());
                                            var360 = 4;
                                        } else if (var359.startsWith(class38.field528)) {
                                            var356 = var356.substring(class38.field528.length());
                                            var360 = 5;
                                        } else if (class157.field2462 != 0) {
                                            if (var359.startsWith(class133.field2101)) {
                                                var356 = var356.substring(class133.field2101.length());
                                                var360 = 1;
                                            } else if (var359.startsWith(class170.field2589)) {
                                                var356 = var356.substring(class170.field2589.length());
                                                var360 = 2;
                                            } else if (var359.startsWith(class233.field3749)) {
                                                var356 = var356.substring(class233.field3749.length());
                                                var360 = 3;
                                            } else if (var359.startsWith(class105.field1613)) {
                                                var360 = 4;
                                                var356 = var356.substring(class105.field1613.length());
                                            } else if (var359.startsWith(class264.field4066)) {
                                                var356 = var356.substring(class264.field4066.length());
                                                var360 = 5;
                                            }
                                        }
                                        class265.field4095.method2064(255, 85);
                                        class265.field4095.method2034(-103, 0);
                                        int var361 = class265.field4095.field4679;
                                        class265.field4095.method2034(-45, var358);
                                        class265.field4095.method2034(-112, var360);
                                        class163.method1113((byte) -5, class265.field4095, var356);
                                        class265.field4095.method2019(class265.field4095.field4679 - var361, -16870);
                                        continue;
                                    }
                                    class113.method756(var356, (byte) 126);
                                    continue;
                                }
                                if (var529 == 5009) {
                                    var8 -= 2;
                                    String var362 = class63.field923[var8 + 1];
                                    String var363 = class63.field923[var8];
                                    if (class215.field3399 != 0 || (!class50.field707 || class83.field1258) && !class207.field3288) {
                                        class221.field3517++;
                                        class265.field4095.method2064(255, 34);
                                        class265.field4095.method2034(-106, 0);
                                        int var364 = class265.field4095.field4679;
                                        class265.field4095.method2023(class108.method723(var363, -60), 113);
                                        class163.method1113((byte) -5, class265.field4095, var362);
                                        class265.field4095.method2019(class265.field4095.field4679 - var364, -16870);
                                    }
                                    continue;
                                }
                                if (var529 == 5010) {
                                    String var365 = null;
                                    var7--;
                                    int var366 = class335.field5214[var7];
                                    if (var366 < 100) {
                                        var365 = class192.field2905[var366];
                                    }
                                    if (var365 == null) {
                                        var365 = "";
                                    }
                                    class63.field923[var8++] = var365;
                                    continue;
                                }
                                if (var529 == 5011) {
                                    var7--;
                                    int var367 = class335.field5214[var7];
                                    String var368 = null;
                                    if (var367 < 100) {
                                        var368 = class343.field5336[var367];
                                    }
                                    if (var368 == null) {
                                        var368 = "";
                                    }
                                    class63.field923[var8++] = var368;
                                    continue;
                                }
                                if (var529 == 5012) {
                                    var7--;
                                    int var369 = class335.field5214[var7];
                                    int var370 = -1;
                                    if (var369 < 100) {
                                        var370 = class247.field3884[var369];
                                    }
                                    class335.field5214[var7++] = var370;
                                    continue;
                                }
                                if (var529 == 5015) {
                                    String var371;
                                    if (class79.field1173 == null || class79.field1173.field1218 == null) {
                                        var371 = class170.field2584;
                                    } else {
                                        var371 = class79.field1173.method565(18548);
                                    }
                                    class63.field923[var8++] = var371;
                                    continue;
                                }
                                if (var529 == 5016) {
                                    class335.field5214[var7++] = class106.field1632;
                                    continue;
                                }
                                if (var529 == 5017) {
                                    class335.field5214[var7++] = class228.field3669;
                                    continue;
                                }
                                if (var529 == 5050) {
                                    var7--;
                                    int var372 = class335.field5214[var7];
                                    class63.field923[var8++] = class247.method1681(var372, (byte) -50).field3372;
                                    continue;
                                }
                                if (var529 == 5051) {
                                    var7--;
                                    int var373 = class335.field5214[var7];
                                    class213 var374 = class247.method1681(var373, (byte) -50);
                                    if (var374.field3373 == null) {
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var374.field3373.length;
                                    }
                                    continue;
                                }
                                if (var529 == 5052) {
                                    var7 -= 2;
                                    int var375 = class335.field5214[var7];
                                    int var376 = class335.field5214[var7 + 1];
                                    class213 var377 = class247.method1681(var375, (byte) -50);
                                    int var378 = var377.field3373[var376];
                                    class335.field5214[var7++] = var378;
                                    continue;
                                }
                                if (var529 == 5053) {
                                    var7--;
                                    int var379 = class335.field5214[var7];
                                    class213 var380 = class247.method1681(var379, (byte) -50);
                                    if (var380.field3377 == null) {
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var380.field3377.length;
                                    }
                                    continue;
                                }
                                if (var529 == 5054) {
                                    var7 -= 2;
                                    int var381 = class335.field5214[var7];
                                    int var382 = class335.field5214[var7 + 1];
                                    class335.field5214[var7++] = class247.method1681(var381, (byte) -50).field3377[var382];
                                    continue;
                                }
                                if (var529 == 5055) {
                                    var7--;
                                    int var383 = class335.field5214[var7];
                                    class63.field923[var8++] = class188.method1288(var383, (byte) 82).method1021((byte) 120);
                                    continue;
                                }
                                if (var529 == 5056) {
                                    var7--;
                                    int var384 = class335.field5214[var7];
                                    class146 var385 = class188.method1288(var384, (byte) 100);
                                    if (var385.field2303 == null) {
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var385.field2303.length;
                                    }
                                    continue;
                                }
                                if (var529 == 5057) {
                                    var7 -= 2;
                                    int var386 = class335.field5214[var7];
                                    int var387 = class335.field5214[var7 + 1];
                                    class335.field5214[var7++] = class188.method1288(var386, (byte) 104).field2303[var387];
                                    continue;
                                }
                                if (var529 == 5058) {
                                    class98.field1531 = new class264();
                                    var7--;
                                    class98.field1531.field4070 = class335.field5214[var7];
                                    class98.field1531.field4072 = class188.method1288(class98.field1531.field4070, (byte) 124);
                                    class98.field1531.field4074 = new int[class98.field1531.field4072.method1016(-19798)];
                                    continue;
                                }
                                if (var529 == 5059) {
                                    field1858++;
                                    class265.field4095.method2064(255, 67);
                                    class265.field4095.method2034(-13, 0);
                                    int var388 = class265.field4095.field4679;
                                    class265.field4095.method2034(-8, 0);
                                    class265.field4095.method2044(1247686728, class98.field1531.field4070);
                                    class98.field1531.field4072.method1013(20631, class265.field4095, class98.field1531.field4074);
                                    class265.field4095.method2019(class265.field4095.field4679 - var388, -16870);
                                    continue;
                                }
                                if (var529 == 5060) {
                                    var8--;
                                    String var389 = class63.field923[var8];
                                    class151.field2372++;
                                    class265.field4095.method2064(255, 104);
                                    class265.field4095.method2034(-35, 0);
                                    int var390 = class265.field4095.field4679;
                                    class265.field4095.method2023(class108.method723(var389, -20), 120);
                                    class265.field4095.method2044(1247686728, class98.field1531.field4070);
                                    class98.field1531.field4072.method1013(20631, class265.field4095, class98.field1531.field4074);
                                    class265.field4095.method2019(class265.field4095.field4679 - var390, -16870);
                                    continue;
                                }
                                if (var529 == 5061) {
                                    class265.field4095.method2064(255, 67);
                                    field1858++;
                                    class265.field4095.method2034(-60, 0);
                                    int var391 = class265.field4095.field4679;
                                    class265.field4095.method2034(-86, 1);
                                    class265.field4095.method2044(1247686728, class98.field1531.field4070);
                                    class98.field1531.field4072.method1013(20631, class265.field4095, class98.field1531.field4074);
                                    class265.field4095.method2019(class265.field4095.field4679 - var391, -16870);
                                    continue;
                                }
                                if (var529 == 5062) {
                                    var7 -= 2;
                                    int var392 = class335.field5214[var7];
                                    int var393 = class335.field5214[var7 + 1];
                                    class335.field5214[var7++] = class247.method1681(var392, (byte) -50).field3374[var393];
                                    continue;
                                }
                                if (var529 == 5063) {
                                    var7 -= 2;
                                    int var394 = class335.field5214[var7 + 1];
                                    int var395 = class335.field5214[var7];
                                    class335.field5214[var7++] = class247.method1681(var395, (byte) -50).field3368[var394];
                                    continue;
                                }
                                if (var529 == 5064) {
                                    var7 -= 2;
                                    int var396 = class335.field5214[var7 + 1];
                                    int var397 = class335.field5214[var7];
                                    if (var396 == -1) {
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        class335.field5214[var7++] = class247.method1681(var397, (byte) -50).method1424((char) var396, false);
                                    }
                                    continue;
                                }
                                if (var529 == 5065) {
                                    var7 -= 2;
                                    int var398 = class335.field5214[var7];
                                    int var399 = class335.field5214[var7 + 1];
                                    if (var399 == -1) {
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        class335.field5214[var7++] = class247.method1681(var398, (byte) -50).method1423((char) var399, 16);
                                    }
                                    continue;
                                }
                                if (var529 == 5066) {
                                    var7--;
                                    int var400 = class335.field5214[var7];
                                    class335.field5214[var7++] = class188.method1288(var400, (byte) 122).method1016(-19798);
                                    continue;
                                }
                                if (var529 == 5067) {
                                    var7 -= 2;
                                    int var401 = class335.field5214[var7];
                                    int var402 = class335.field5214[var7 + 1];
                                    int var403 = class188.method1288(var401, (byte) 104).method1018(var402, false);
                                    class335.field5214[var7++] = var403;
                                    continue;
                                }
                                if (var529 == 5068) {
                                    var7 -= 2;
                                    int var404 = class335.field5214[var7];
                                    int var405 = class335.field5214[var7 + 1];
                                    class98.field1531.field4074[var404] = var405;
                                    continue;
                                }
                                if (var529 == 5069) {
                                    var7 -= 2;
                                    int var406 = class335.field5214[var7 + 1];
                                    int var407 = class335.field5214[var7];
                                    class98.field1531.field4074[var407] = var406;
                                    continue;
                                }
                                if (var529 == 5070) {
                                    var7 -= 3;
                                    int var408 = class335.field5214[var7];
                                    int var409 = class335.field5214[var7 + 2];
                                    int var410 = class335.field5214[var7 + 1];
                                    class146 var411 = class188.method1288(var408, (byte) 107);
                                    if (var411.method1018(var410, false) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class335.field5214[var7++] = var411.method1020(var410, var409, -1);
                                    continue;
                                }
                                if (var529 == 5071) {
                                    var7--;
                                    boolean var412 = class335.field5214[var7] == 1;
                                    var8--;
                                    String var413 = class63.field923[var8];
                                    class80.method552(var412, var413, -111);
                                    class335.field5214[var7++] = class26.field336;
                                    continue;
                                }
                                if (var529 == 5072) {
                                    if (class27.field347 != null && class26.field336 > class125.field1960) {
                                        class335.field5214[var7++] = class311.method2135(65535, class27.field347[class125.field1960++]);
                                        continue;
                                    }
                                    class335.field5214[var7++] = -1;
                                    continue;
                                }
                                if (var529 == 5073) {
                                    class125.field1960 = 0;
                                    continue;
                                }
                            } else if (var529 < 5200) {
                                if (var529 == 5100) {
                                    if (class294.field4534[86]) {
                                        class335.field5214[var7++] = 1;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 5101) {
                                    if (class294.field4534[82]) {
                                        class335.field5214[var7++] = 1;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 5102) {
                                    if (class294.field4534[81]) {
                                        class335.field5214[var7++] = 1;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var529 < 5300) {
                                if (var529 == 5200) {
                                    var7--;
                                    class306.method2098(class335.field5214[var7], 46);
                                    continue;
                                }
                                if (var529 == 5201) {
                                    class335.field5214[var7++] = class18.method143((byte) -58);
                                    continue;
                                }
                                if (var529 == 5202) {
                                    var7--;
                                    class193.method1316(class335.field5214[var7], (byte) 12);
                                    continue;
                                }
                                if (var529 == 5203) {
                                    var8--;
                                    class82.method569(true, class63.field923[var8]);
                                    continue;
                                }
                                if (var529 == 5204) {
                                    class63.field923[var8 - 1] = class259.method1731(-120, class63.field923[var8 - 1]);
                                    continue;
                                }
                                if (var529 == 5205) {
                                    var7--;
                                    class188.method1295(class335.field5214[var7], -81, -1, -1);
                                    continue;
                                }
                                if (var529 == 5206) {
                                    var7--;
                                    int var233 = class335.field5214[var7];
                                    class200 var234 = class286.method1871(var233 >> 14 & 0x3FFF, (byte) -73, var233 & 0x3FFF);
                                    if (var234 == null) {
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        class335.field5214[var7++] = var234.field3010;
                                    }
                                    continue;
                                }
                                if (var529 == 5207) {
                                    var7--;
                                    class200 var235 = class257.method1726(-5, class335.field5214[var7]);
                                    if (var235 != null && var235.field3022 != null) {
                                        class63.field923[var8++] = var235.field3022;
                                        continue;
                                    }
                                    class63.field923[var8++] = "";
                                    continue;
                                }
                                if (var529 == 5208) {
                                    class335.field5214[var7++] = class329.field5083;
                                    class335.field5214[var7++] = class47.field664;
                                    continue;
                                }
                                if (var529 == 5209) {
                                    class335.field5214[var7++] = class78.field1161 + class129.field2023;
                                    class335.field5214[var7++] = class129.field2021 + class338.field5233 - class342.field5334 - 1;
                                    continue;
                                }
                                if (var529 == 5210) {
                                    var7--;
                                    int var236 = class335.field5214[var7];
                                    class200 var237 = class257.method1726(-5, var236);
                                    if (var237 == null) {
                                        class335.field5214[var7++] = 0;
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = class311.method2135(var237.field3003, 268432027) >> 14;
                                        class335.field5214[var7++] = class311.method2135(var237.field3003, 16383);
                                    }
                                    continue;
                                }
                                if (var529 == 5211) {
                                    var7--;
                                    int var238 = class335.field5214[var7];
                                    class200 var239 = class257.method1726(-5, var238);
                                    if (var239 == null) {
                                        class335.field5214[var7++] = 0;
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var239.field3007 - var239.field3023;
                                        class335.field5214[var7++] = var239.field3008 - var239.field3012;
                                    }
                                    continue;
                                }
                                if (var529 == 5212) {
                                    int var240 = class277.method1827(0);
                                    int var241 = 0;
                                    String var242;
                                    if (var240 == -1) {
                                        var242 = "";
                                    } else {
                                        var242 = class23.field293.field1857[var240];
                                        var241 = class23.field293.method825(var240, 122);
                                    }
                                    String var243 = class88.method599(var242, "<br>", -2895, " ");
                                    class63.field923[var8++] = var243;
                                    class335.field5214[var7++] = var241;
                                    continue;
                                }
                                if (var529 == 5213) {
                                    int var244 = class307.method2116(32);
                                    int var245 = 0;
                                    String var246;
                                    if (var244 == -1) {
                                        var246 = "";
                                    } else {
                                        var246 = class23.field293.field1857[var244];
                                        var245 = class23.field293.method825(var244, 124);
                                    }
                                    String var247 = class88.method599(var246, "<br>", -2895, " ");
                                    class63.field923[var8++] = var247;
                                    class335.field5214[var7++] = var245;
                                    continue;
                                }
                                if (var529 == 5214) {
                                    var7--;
                                    int var248 = class335.field5214[var7];
                                    class200 var249 = class200.method1347(89);
                                    if (var249 != null) {
                                        int[] var250 = var249.method1352((byte) 84, (var248 & 0xFFFF1C2) >> 14, var248 >> 28 & 0x3, var248 & 0x3FFF);
                                        if (var250 != null) {
                                            class310.method2126(var250[2], (byte) -125, var250[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var529 == 5215) {
                                    var7 -= 2;
                                    int var251 = class335.field5214[var7 + 1];
                                    boolean var252 = false;
                                    int var253 = class335.field5214[var7];
                                    class277 var254 = class240.method1640(67, var253 >> 14 & 0x3FFF, var253 & 0x3FFF);
                                    for (class200 var255 = (class200) var254.method1826(-124); var255 != null; var255 = (class200) var254.method1823((byte) -128)) {
                                        if (var255.field3010 == var251) {
                                            var252 = true;
                                            break;
                                        }
                                    }
                                    if (var252) {
                                        class335.field5214[var7++] = 1;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 5216) {
                                    var7--;
                                    int var256 = class335.field5214[var7];
                                    class50.method344(var256, 1);
                                    continue;
                                }
                                if (var529 == 5217) {
                                    var7--;
                                    int var257 = class335.field5214[var7];
                                    if (class318.method2161(var257, 97)) {
                                        class335.field5214[var7++] = 1;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 5218) {
                                    var7--;
                                    int var258 = class335.field5214[var7];
                                    class200 var259 = class257.method1726(-5, var258);
                                    if (var259 == null) {
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        class335.field5214[var7++] = var259.field3024;
                                    }
                                    continue;
                                }
                                if (var529 == 5219) {
                                    var8--;
                                    class132.method906(class63.field923[var8], -119);
                                    continue;
                                }
                                if (var529 == 5220) {
                                    class335.field5214[var7++] = class74.field1109 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 5221) {
                                    var7--;
                                    int var260 = class335.field5214[var7];
                                    class310.method2126(var260 & 0x3FFF, (byte) -123, var260 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var529 == 5222) {
                                    class200 var261 = class200.method1347(116);
                                    if (var261 == null) {
                                        class335.field5214[var7++] = -1;
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        int[] var262 = var261.method1349(class338.field5233 + class129.field2021 - class342.field5334 - 1, class78.field1161 + class129.field2023, 101);
                                        if (var262 == null) {
                                            class335.field5214[var7++] = -1;
                                            class335.field5214[var7++] = -1;
                                        } else {
                                            class335.field5214[var7++] = var262[1];
                                            class335.field5214[var7++] = var262[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var529 == 5223) {
                                    var7 -= 2;
                                    int var263 = class335.field5214[var7];
                                    int var264 = class335.field5214[var7 + 1];
                                    class188.method1295(var263, -119, var264 & 0x3FFF, var264 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var529 == 5224) {
                                    var7--;
                                    int var265 = class335.field5214[var7];
                                    class200 var266 = class200.method1347(87);
                                    if (var266 == null) {
                                        class335.field5214[var7++] = -1;
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        int[] var267 = var266.method1352((byte) 110, var265 >> 14 & 0x3FFF, (var265 & 0x3BD32D8A) >> 28, var265 & 0x3FFF);
                                        if (var267 == null) {
                                            class335.field5214[var7++] = -1;
                                            class335.field5214[var7++] = -1;
                                        } else {
                                            class335.field5214[var7++] = var267[1];
                                            class335.field5214[var7++] = var267[2];
                                        }
                                    }
                                    continue;
                                }
                                if (var529 == 5225) {
                                    var7--;
                                    int var268 = class335.field5214[var7];
                                    class200 var269 = class200.method1347(119);
                                    if (var269 == null) {
                                        class335.field5214[var7++] = -1;
                                        class335.field5214[var7++] = -1;
                                    } else {
                                        int[] var270 = var269.method1349(var268 & 0x3FFF, var268 >> 14 & 0x3FFF, 85);
                                        if (var270 == null) {
                                            class335.field5214[var7++] = -1;
                                            class335.field5214[var7++] = -1;
                                        } else {
                                            class335.field5214[var7++] = var270[1];
                                            class335.field5214[var7++] = var270[2];
                                        }
                                    }
                                    continue;
                                }
                            } else if (var529 < 5400) {
                                if (var529 == 5300) {
                                    var7 -= 2;
                                    int var271 = class335.field5214[var7];
                                    int var272 = class335.field5214[var7 + 1];
                                    class120.method818(2, 3, false, var272, var271);
                                    class335.field5214[var7++] = class63.field919 == null ? 0 : 1;
                                    continue;
                                }
                                if (var529 == 5301) {
                                    if (class63.field919 != null) {
                                        class120.method818(2, class175.field2682, false, -1, -1);
                                    }
                                    continue;
                                }
                                if (var529 == 5302) {
                                    class288[] var273 = class278.method1831(-16);
                                    class335.field5214[var7++] = var273.length;
                                    continue;
                                }
                                if (var529 == 5303) {
                                    var7--;
                                    int var274 = class335.field5214[var7];
                                    class288[] var275 = class278.method1831(-16);
                                    class335.field5214[var7++] = var275[var274].field4414;
                                    class335.field5214[var7++] = var275[var274].field4406;
                                    continue;
                                }
                                if (var529 == 5305) {
                                    int var276 = class226.field3605;
                                    int var277 = class10.field99;
                                    int var278 = -1;
                                    class288[] var279 = class278.method1831(-16);
                                    for (int var280 = 0; var280 < var279.length; var280++) {
                                        class288 var281 = var279[var280];
                                        if (var281.field4414 == var276 && var281.field4406 == var277) {
                                            var278 = var280;
                                            break;
                                        }
                                    }
                                    class335.field5214[var7++] = var278;
                                    continue;
                                }
                                if (var529 == 5306) {
                                    class335.field5214[var7++] = class166.method1132(false);
                                    continue;
                                }
                                if (var529 == 5307) {
                                    var7--;
                                    int var282 = class335.field5214[var7];
                                    if (var282 < 0 || var282 > 2) {
                                        var282 = 0;
                                    }
                                    class120.method818(2, var282, false, -1, -1);
                                    continue;
                                }
                                if (var529 == 5308) {
                                    class335.field5214[var7++] = class175.field2682;
                                    continue;
                                }
                                if (var529 == 5309) {
                                    var7--;
                                    int var283 = class335.field5214[var7];
                                    if (var283 < 0 || var283 > 2) {
                                        var283 = 0;
                                    }
                                    class175.field2682 = var283;
                                    class268.method1777(-27637, class89.field1359);
                                    continue;
                                }
                            } else if (var529 < 5500) {
                                if (var529 == 5400) {
                                    class305.field4772++;
                                    var8 -= 2;
                                    String var284 = class63.field923[var8];
                                    String var285 = class63.field923[var8 + 1];
                                    var7--;
                                    int var286 = class335.field5214[var7];
                                    class265.field4095.method2064(255, 214);
                                    class265.field4095.method2034(-96, (class332.method2279(54, var284) + class332.method2279(12, var285)) + 1);
                                    class265.field4095.method2057(-119, var284);
                                    class265.field4095.method2057(-113, var285);
                                    class265.field4095.method2034(-89, var286);
                                    continue;
                                }
                                if (var529 == 5401) {
                                    var7 -= 2;
                                    class117.field1804[class335.field5214[var7]] = (short) class104.method710(class335.field5214[var7 + 1], (byte) 13);
                                    class269.method1784(-49);
                                    class85.method586(true);
                                    class161.method1108(0);
                                    class303.method2039(true);
                                    class13.method110(72);
                                    continue;
                                }
                                if (var529 == 5405) {
                                    var7 -= 2;
                                    int var287 = class335.field5214[var7];
                                    int var288 = class335.field5214[var7 + 1];
                                    if (var287 >= 0 && var287 < 2) {
                                        class303.field4672[var287] = new int[var288 << 1][4];
                                    }
                                    continue;
                                }
                                if (var529 == 5406) {
                                    var7 -= 7;
                                    int var289 = class335.field5214[var7 + 1] << 1;
                                    int var290 = class335.field5214[var7];
                                    int var291 = class335.field5214[var7 + 2];
                                    int var292 = class335.field5214[var7 + 4];
                                    int var293 = class335.field5214[var7 + 3];
                                    int var294 = class335.field5214[var7 + 5];
                                    int var295 = class335.field5214[var7 + 6];
                                    if (var290 >= 0 && var290 < 2 && class303.field4672[var290] != null && var289 >= 0 && class303.field4672[var290].length > var289) {
                                        class303.field4672[var290][var289] = new int[] { class311.method2135(var291 >> 14, 16383) * 128, var293, class311.method2135(var291, 16383) * 128, var295 };
                                        class303.field4672[var290][var289 + 1] = new int[] { (class311.method2135(var292, 268425035) >> 14) * 128, var294, class311.method2135(16383, var292) * 128 };
                                    }
                                    continue;
                                }
                                if (var529 == 5407) {
                                    var7--;
                                    int var296 = class303.field4672[class335.field5214[var7]].length >> 1;
                                    class335.field5214[var7++] = var296;
                                    continue;
                                }
                                if (var529 == 5411) {
                                    if (class63.field919 != null) {
                                        class120.method818(2, class175.field2682, false, -1, -1);
                                    }
                                    if (class261.field4045 == null) {
                                        class158.method1097(-1, false, class43.method308(0));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var529 == 5419) {
                                    String var297 = "";
                                    if (class266.field4106 != null) {
                                        if (class266.field4106.field3929 == null) {
                                            var297 = class345.method2396(class266.field4106.field3928, -69);
                                        } else {
                                            var297 = (String) class266.field4106.field3929;
                                        }
                                    }
                                    class63.field923[var8++] = var297;
                                    continue;
                                }
                                if (var529 == 5420) {
                                    class335.field5214[var7++] = class224.field3576 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 5421) {
                                    if (class63.field919 != null) {
                                        class120.method818(2, class175.field2682, false, -1, -1);
                                    }
                                    var8--;
                                    String var298 = class63.field923[var8];
                                    var7--;
                                    boolean var299 = class335.field5214[var7] == 1;
                                    String var300 = class43.method308(0) + var298;
                                    if (class261.field4045 == null && (!var299 || class224.field3576 == 3 || !class224.field3567.startsWith("win") || class179.field2741)) {
                                        class158.method1097(-1, var299, var300);
                                        continue;
                                    }
                                    class19.field261 = var300;
                                    class83.field1256 = var299;
                                    class14.field145 = class89.field1359.method1513(var300, 16);
                                    continue;
                                }
                                if (var529 == 5422) {
                                    var7--;
                                    int var301 = class335.field5214[var7];
                                    var8 -= 2;
                                    String var302 = class63.field923[var8 + 1];
                                    String var303 = class63.field923[var8];
                                    if (var303.length() > 0) {
                                        if (class132.field2086 == null) {
                                            class132.field2086 = new String[class260.field4038[class2.field25]];
                                        }
                                        class132.field2086[var301] = var303;
                                    }
                                    if (var302.length() > 0) {
                                        if (class27.field343 == null) {
                                            class27.field343 = new String[class260.field4038[class2.field25]];
                                        }
                                        class27.field343[var301] = var302;
                                    }
                                    continue;
                                }
                                if (var529 == 5423) {
                                    var8--;
                                    System.out.println(class63.field923[var8]);
                                    continue;
                                }
                                if (var529 == 5424) {
                                    var7 -= 11;
                                    class179.field2737 = class335.field5214[var7];
                                    class130.field2026 = class335.field5214[var7 + 1];
                                    class306.field4820 = class335.field5214[var7 + 2];
                                    class308.field4846 = class335.field5214[var7 + 3];
                                    class229.field3691 = class335.field5214[var7 + 4];
                                    class188.field2871 = class335.field5214[var7 + 5];
                                    class203.field3070 = class335.field5214[var7 + 6];
                                    class148.field2332 = class335.field5214[var7 + 7];
                                    class51.field729 = class335.field5214[var7 + 8];
                                    class184.field2826 = class335.field5214[var7 + 9];
                                    class215.field3398 = class335.field5214[var7 + 10];
                                    field1859.method2093(32, class229.field3691);
                                    field1859.method2093(-55, class188.field2871);
                                    field1859.method2093(-55, class203.field3070);
                                    field1859.method2093(-57, class148.field2332);
                                    field1859.method2093(63, class51.field729);
                                    class151.field2373 = true;
                                    continue;
                                }
                                if (var529 == 5425) {
                                    class315.method2150((byte) 100);
                                    class151.field2373 = false;
                                    continue;
                                }
                                if (var529 == 5426) {
                                    var7--;
                                    class226.field3613 = class335.field5214[var7];
                                    continue;
                                }
                                if (var529 == 5427) {
                                    var7 -= 2;
                                    class165.field2545 = class335.field5214[var7];
                                    class261.field4044 = class335.field5214[var7 + 1];
                                    continue;
                                }
                                if (var529 == 5428) {
                                    var7 -= 2;
                                    int var304 = class335.field5214[var7];
                                    int var305 = class335.field5214[var7 + 1];
                                    class335.field5214[var7++] = class276.method1813(var305, var304, 0) ? 1 : 0;
                                    continue;
                                }
                            } else if (var529 < 5600) {
                                if (var529 == 5500) {
                                    var7 -= 4;
                                    int var306 = class335.field5214[var7];
                                    int var307 = class335.field5214[var7 + 1];
                                    int var308 = class335.field5214[var7 + 2];
                                    int var309 = class335.field5214[var7 + 3];
                                    class310.method2133(var307, var309, false, var308, ((var306 & 0xFFFF20D) >> 14) - class30.field374, -1, (var306 & 0x3FFF) - class294.field4535);
                                    continue;
                                }
                                if (var529 == 5501) {
                                    var7 -= 4;
                                    int var310 = class335.field5214[var7];
                                    int var311 = class335.field5214[var7 + 3];
                                    int var312 = class335.field5214[var7 + 2];
                                    int var313 = class335.field5214[var7 + 1];
                                    class131.method899(var312, var313, false, (var310 & 0x3FFF) - class294.field4535, var311, ((var310 & 0xFFFC2CE) >> 14) - class30.field374);
                                    continue;
                                }
                                if (var529 == 5502) {
                                    var7 -= 6;
                                    int var314 = class335.field5214[var7];
                                    if (var314 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class88.field1349 = var314;
                                    int var315 = class335.field5214[var7 + 1];
                                    if ((var315 + 1) >= (class303.field4672[class88.field1349].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class187.field2847 = 0;
                                    class80.field1191 = var315;
                                    class260.field4040 = class335.field5214[var7 + 2];
                                    class144.field2284 = class335.field5214[var7 + 3];
                                    int var316 = class335.field5214[var7 + 4];
                                    if (var316 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class253.field3939 = var316;
                                    int var317 = class335.field5214[var7 + 5];
                                    if ((class303.field4672[class253.field3939].length >> 1) <= (var317 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class219.field3489 = 3;
                                    class131.field2064 = var317;
                                    continue;
                                }
                                if (var529 == 5503) {
                                    class311.method2137(85);
                                    continue;
                                }
                                if (var529 == 5504) {
                                    var7 -= 2;
                                    class179.method1225(class335.field5214[var7 + 1], class335.field5214[var7], 18);
                                    continue;
                                }
                                if (var529 == 5505) {
                                    class335.field5214[var7++] = (int) class309.field4866;
                                    continue;
                                }
                                if (var529 == 5506) {
                                    class335.field5214[var7++] = (int) class123.field1922;
                                    continue;
                                }
                                if (var529 == 5507) {
                                    class40.method296(-16);
                                    continue;
                                }
                                if (var529 == 5508) {
                                    class208.method1398((byte) -87);
                                    continue;
                                }
                                if (var529 == 5509) {
                                    class93.method638(127);
                                    continue;
                                }
                                if (var529 == 5510) {
                                    class94.method640(-128);
                                    continue;
                                }
                                if (var529 == 5512) {
                                    class166.method1130(0);
                                    continue;
                                }
                            } else if (var529 < 5700) {
                                if (var529 == 5600) {
                                    var8 -= 2;
                                    String var345 = class63.field923[var8 + 1];
                                    String var346 = class63.field923[var8];
                                    var7--;
                                    int var347 = class335.field5214[var7];
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0 && class293.field4507 == 0) {
                                        class138.method941(0, var345, var347, var346);
                                    }
                                    continue;
                                }
                                if (var529 == 5601) {
                                    class34.method252(false);
                                    continue;
                                }
                                if (var529 == 5602) {
                                    if (class146.field2290 == 0) {
                                        class51.field728 = -2;
                                    }
                                    continue;
                                }
                                if (var529 == 5603) {
                                    var7 -= 4;
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0 && class293.field4507 == 0) {
                                        class214.method1431(class335.field5214[var7], (byte) 48, class335.field5214[var7 + 2], class335.field5214[var7 + 1], class335.field5214[var7 + 3]);
                                    }
                                    continue;
                                }
                                if (var529 == 5604) {
                                    var8--;
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0 && class293.field4507 == 0) {
                                        class74.method521(-95, class108.method723(class63.field923[var8], -21));
                                    }
                                    continue;
                                }
                                if (var529 == 5605) {
                                    var7 -= 7;
                                    var8 -= 3;
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0 && class293.field4507 == 0) {
                                        class324.method2191(class335.field5214[var7 + 2], class335.field5214[var7 + 1], class335.field5214[var7 + 3], -122, class63.field923[var8 + 2], class335.field5214[var7 + 4] == 1, class335.field5214[var7 + 6] == 1, class335.field5214[var7 + 5] == 1, class108.method723(class63.field923[var8], -106), class335.field5214[var7], class63.field923[var8 + 1]);
                                    }
                                    continue;
                                }
                                if (var529 == 5606) {
                                    if (class19.field265 == 0) {
                                        class285.field4375 = -2;
                                    }
                                    continue;
                                }
                                if (var529 == 5607) {
                                    class335.field5214[var7++] = class51.field728;
                                    continue;
                                }
                                if (var529 == 5608) {
                                    class335.field5214[var7++] = class15.field153;
                                    continue;
                                }
                                if (var529 == 5609) {
                                    class335.field5214[var7++] = class285.field4375;
                                    continue;
                                }
                                if (var529 == 5610) {
                                    for (int var348 = 0; var348 < 5; var348++) {
                                        class63.field923[var8++] = class172.field2626.length > var348 ? class193.method1314(class172.field2626[var348], (byte) 116) : "";
                                    }
                                    class172.field2626 = null;
                                    continue;
                                }
                                if (var529 == 5611) {
                                    class335.field5214[var7++] = class123.field1933;
                                    continue;
                                }
                            } else if (var529 < 6100) {
                                if (var529 == 6001) {
                                    var7--;
                                    int var318 = class335.field5214[var7];
                                    if (var318 < 1) {
                                        var318 = 1;
                                    }
                                    if (var318 > 4) {
                                        var318 = 4;
                                    }
                                    class88.field1322 = var318;
                                    if (!class333.field5166 || !class192.field2903) {
                                        if (class88.field1322 == 1) {
                                            class12.method89(0.9F);
                                        }
                                        if (class88.field1322 == 2) {
                                            class12.method89(0.8F);
                                        }
                                        if (class88.field1322 == 3) {
                                            class12.method89(0.7F);
                                        }
                                        if (class88.field1322 == 4) {
                                            class12.method89(0.6F);
                                        }
                                    }
                                    if (class333.field5166) {
                                        class323.method2186(-100);
                                        if (!class192.field2903) {
                                            class320.method2171((byte) 17);
                                        }
                                    }
                                    class85.method586(true);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6002) {
                                    var7--;
                                    class175.method1187(class335.field5214[var7] == 1, (byte) 120);
                                    class242.method1647(1082299393);
                                    class320.method2171((byte) 17);
                                    class143.method1004(-68);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6003) {
                                    var7--;
                                    class233.field3752 = class335.field5214[var7] == 1;
                                    class143.method1004(-46);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6005) {
                                    var7--;
                                    class317.field4985 = class335.field5214[var7] == 1;
                                    class320.method2171((byte) 17);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6006) {
                                    var7--;
                                    class275.field4239 = class335.field5214[var7] == 1;
                                    ((class97) class12.field126).method671(112, !class275.field4239);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6007) {
                                    var7--;
                                    class188.field2856 = class335.field5214[var7] == 1;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6008) {
                                    var7--;
                                    class318.field4986 = class335.field5214[var7] == 1;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6009) {
                                    var7--;
                                    class124.field1935 = class335.field5214[var7] == 1;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6010) {
                                    var7--;
                                    class155.field2434 = class335.field5214[var7] == 1;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6011) {
                                    var7--;
                                    int var319 = class335.field5214[var7];
                                    if (var319 < 0 || var319 > 2) {
                                        var319 = 0;
                                    }
                                    class90.field1382 = var319;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6012) {
                                    if (class333.field5166) {
                                        class174.method1179(0, 0, (byte) 76);
                                    }
                                    var7--;
                                    class192.field2903 = class335.field5214[var7] == 1;
                                    if (class333.field5166 && class192.field2903) {
                                        class12.method89(0.7F);
                                    } else {
                                        if (class88.field1322 == 1) {
                                            class12.method89(0.9F);
                                        }
                                        if (class88.field1322 == 2) {
                                            class12.method89(0.8F);
                                        }
                                        if (class88.field1322 == 3) {
                                            class12.method89(0.7F);
                                        }
                                        if (class88.field1322 == 4) {
                                            class12.method89(0.6F);
                                        }
                                    }
                                    class320.method2171((byte) 17);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6014) {
                                    var7--;
                                    class297.field4556 = class335.field5214[var7] == 1;
                                    if (class333.field5166) {
                                        class320.method2171((byte) 17);
                                    }
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6015) {
                                    var7--;
                                    class187.field2843 = class335.field5214[var7] == 1;
                                    if (class333.field5166) {
                                        class323.method2186(-115);
                                    }
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6016) {
                                    var7--;
                                    int var320 = class335.field5214[var7];
                                    if (var320 < 0 || var320 > 2) {
                                        var320 = 0;
                                    }
                                    if (class333.field5166) {
                                        class280.field4325 = true;
                                    }
                                    class10.field95 = var320;
                                    continue;
                                }
                                if (var529 == 6017) {
                                    var7--;
                                    class269.field4148 = class335.field5214[var7] == 1;
                                    class197.method1333((byte) -124);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6018) {
                                    var7--;
                                    int var321 = class335.field5214[var7];
                                    if (var321 < 0) {
                                        var321 = 0;
                                    }
                                    if (var321 > 127) {
                                        var321 = 127;
                                    }
                                    class34.field441 = var321;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6019) {
                                    var7--;
                                    int var322 = class335.field5214[var7];
                                    if (var322 < 0) {
                                        var322 = 0;
                                    }
                                    if (var322 > 255) {
                                        var322 = 255;
                                    }
                                    if (class334.field5199 != var322) {
                                        if (class334.field5199 == 0 && class146.field2306 != -1) {
                                            class101.method686(0, false, class146.field2306, class211.field3353, var322, 0);
                                            class58.field826 = false;
                                        } else if (var322 == 0) {
                                            class262.method1743((byte) -60);
                                            class58.field826 = false;
                                        } else {
                                            class222.method1483(var322, (byte) 101);
                                        }
                                        class334.field5199 = var322;
                                    }
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6020) {
                                    var7--;
                                    int var323 = class335.field5214[var7];
                                    if (var323 < 0) {
                                        var323 = 0;
                                    }
                                    if (var323 > 127) {
                                        var323 = 127;
                                    }
                                    class274.field4219 = var323;
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    continue;
                                }
                                if (var529 == 6021) {
                                    var7--;
                                    class319.field5002 = class335.field5214[var7] == 1;
                                    class143.method1004(-126);
                                    continue;
                                }
                                if (var529 == 6023) {
                                    var7--;
                                    int var324 = class335.field5214[var7];
                                    boolean var325 = false;
                                    if (var324 < 0) {
                                        var324 = 0;
                                    }
                                    if (var324 > 2) {
                                        var324 = 2;
                                    }
                                    if (class109.field1676 < 96) {
                                        var325 = true;
                                        var324 = 0;
                                    }
                                    class243.method1652(var324);
                                    class268.method1777(-27637, class89.field1359);
                                    class342.field5335 = false;
                                    class335.field5214[var7++] = var325 ? 0 : 1;
                                    continue;
                                }
                                if (var529 == 6024) {
                                    var7--;
                                    int var326 = class335.field5214[var7];
                                    if (var326 < 0 || var326 > 2) {
                                        var326 = 0;
                                    }
                                    class160.field2490 = var326;
                                    class268.method1777(-27637, class89.field1359);
                                    continue;
                                }
                                if (var529 == 6027) {
                                    var7--;
                                    int var327 = class335.field5214[var7];
                                    if (!class333.field5166) {
                                        continue;
                                    }
                                    if (var327 < 0 || var327 > 1) {
                                        var327 = 0;
                                    }
                                    class128.method870(0, var327 == 1);
                                    continue;
                                }
                                if (var529 == 6028) {
                                    var7--;
                                    class104.field1609 = class335.field5214[var7] != 0;
                                    class268.method1777(-27637, class89.field1359);
                                    continue;
                                }
                            } else if (var529 < 6200) {
                                if (var529 == 6101) {
                                    class335.field5214[var7++] = class88.field1322;
                                    continue;
                                }
                                if (var529 == 6102) {
                                    class335.field5214[var7++] = class148.method1042((byte) 54) ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6103) {
                                    class335.field5214[var7++] = class233.field3752 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6105) {
                                    class335.field5214[var7++] = class317.field4985 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6106) {
                                    class335.field5214[var7++] = class275.field4239 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6107) {
                                    class335.field5214[var7++] = class188.field2856 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6108) {
                                    class335.field5214[var7++] = class318.field4986 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6109) {
                                    class335.field5214[var7++] = class124.field1935 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6110) {
                                    class335.field5214[var7++] = class155.field2434 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6111) {
                                    class335.field5214[var7++] = class90.field1382;
                                    continue;
                                }
                                if (var529 == 6112) {
                                    class335.field5214[var7++] = class192.field2903 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6114) {
                                    class335.field5214[var7++] = class297.field4556 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6115) {
                                    class335.field5214[var7++] = class187.field2843 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6116) {
                                    class335.field5214[var7++] = class10.field95;
                                    continue;
                                }
                                if (var529 == 6117) {
                                    class335.field5214[var7++] = class269.field4148 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6118) {
                                    class335.field5214[var7++] = class34.field441;
                                    continue;
                                }
                                if (var529 == 6119) {
                                    class335.field5214[var7++] = class334.field5199;
                                    continue;
                                }
                                if (var529 == 6120) {
                                    class335.field5214[var7++] = class274.field4219;
                                    continue;
                                }
                                if (var529 == 6121) {
                                    if (class333.field5166) {
                                        class335.field5214[var7++] = class333.field5144 ? 1 : 0;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 6123) {
                                    class335.field5214[var7++] = class243.method1654();
                                    continue;
                                }
                                if (var529 == 6124) {
                                    class335.field5214[var7++] = class160.field2490;
                                    continue;
                                }
                                if (var529 == 6126) {
                                    if (class333.field5166) {
                                        class335.field5214[var7++] = class279.method1841() ? 1 : 0;
                                    } else {
                                        class335.field5214[var7++] = 0;
                                    }
                                    continue;
                                }
                                if (var529 == 6127) {
                                    class335.field5214[var7++] = class268.field4135 ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6128) {
                                    class335.field5214[var7++] = class104.field1609 ? 1 : 0;
                                    continue;
                                }
                            } else if (var529 < 6300) {
                                if (var529 == 6200) {
                                    var7 -= 2;
                                    class334.field5200 = (short) class335.field5214[var7];
                                    if (class334.field5200 <= 0) {
                                        class334.field5200 = 256;
                                    }
                                    class203.field3063 = (short) class335.field5214[var7 + 1];
                                    if (class203.field3063 <= 0) {
                                        class203.field3063 = 205;
                                    }
                                    continue;
                                }
                                if (var529 == 6201) {
                                    var7 -= 2;
                                    class310.field4922 = (short) class335.field5214[var7];
                                    if (class310.field4922 <= 0) {
                                        class310.field4922 = 256;
                                    }
                                    class280.field4320 = (short) class335.field5214[var7 + 1];
                                    if (class280.field4320 <= 0) {
                                        class280.field4320 = 320;
                                    }
                                    continue;
                                }
                                if (var529 == 6202) {
                                    var7 -= 4;
                                    class274.field4224 = (short) class335.field5214[var7];
                                    if (class274.field4224 <= 0) {
                                        class274.field4224 = 1;
                                    }
                                    class162.field2511 = (short) class335.field5214[var7 + 1];
                                    if (class162.field2511 <= 0) {
                                        class162.field2511 = 32767;
                                    } else if (class162.field2511 < class274.field4224) {
                                        class162.field2511 = class274.field4224;
                                    }
                                    class205.field3109 = (short) class335.field5214[var7 + 2];
                                    if (class205.field3109 <= 0) {
                                        class205.field3109 = 1;
                                    }
                                    class265.field4094 = (short) class335.field5214[var7 + 3];
                                    if (class265.field4094 <= 0) {
                                        class265.field4094 = 32767;
                                    } else if (class265.field4094 < class205.field3109) {
                                        class265.field4094 = class205.field3109;
                                    }
                                    continue;
                                }
                                if (var529 == 6203) {
                                    class323.method2182(0, -645014238, 0, class162.field2509.field3169, class162.field2509.field3239, false);
                                    class335.field5214[var7++] = class218.field3476;
                                    class335.field5214[var7++] = class179.field2743;
                                    continue;
                                }
                                if (var529 == 6204) {
                                    class335.field5214[var7++] = class310.field4922;
                                    class335.field5214[var7++] = class280.field4320;
                                    continue;
                                }
                                if (var529 == 6205) {
                                    class335.field5214[var7++] = class334.field5200;
                                    class335.field5214[var7++] = class203.field3063;
                                    continue;
                                }
                            } else if (var529 < 6400) {
                                if (var529 == 6300) {
                                    class335.field5214[var7++] = (int) (class195.method1322(124) / 60000L);
                                    continue;
                                }
                                if (var529 == 6301) {
                                    class335.field5214[var7++] = (int) (class195.method1322(120) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var529 == 6302) {
                                    var7 -= 3;
                                    int var340 = class335.field5214[var7 + 1];
                                    int var341 = class335.field5214[var7];
                                    int var342 = class335.field5214[var7 + 2];
                                    class7.field73.clear();
                                    class7.field73.set(11, 12);
                                    class7.field73.set(var342, var340, var341);
                                    class335.field5214[var7++] = (int) (class7.field73.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var529 == 6303) {
                                    class7.field73.clear();
                                    class7.field73.setTime(new Date(class195.method1322(126)));
                                    class335.field5214[var7++] = class7.field73.get(1);
                                    continue;
                                }
                                if (var529 == 6304) {
                                    var7--;
                                    int var343 = class335.field5214[var7];
                                    boolean var344 = true;
                                    if (var343 < 0) {
                                        var344 = ((var343 + 1) % 4) == 0;
                                    } else if (var343 < 1582) {
                                        var344 = var343 % 4 == 0;
                                    } else if ((var343 % 4) != 0) {
                                        var344 = false;
                                    } else if ((var343 % 100) != 0) {
                                        var344 = true;
                                    } else if (var343 % 400 != 0) {
                                        var344 = false;
                                    }
                                    class335.field5214[var7++] = var344 ? 1 : 0;
                                    continue;
                                }
                            } else if (var529 < 6500) {
                                if (var529 == 6405) {
                                    class335.field5214[var7++] = class245.method1661(9066) ? 1 : 0;
                                    continue;
                                }
                                if (var529 == 6406) {
                                    class335.field5214[var7++] = class22.method171(true) ? 1 : 0;
                                    continue;
                                }
                            } else if (var529 < 6600) {
                                if (var529 == 6500) {
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0) {
                                        class335.field5214[var7++] = class80.method553(-128) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class335.field5214[var7++] = 1;
                                    continue;
                                }
                                if (var529 == 6501) {
                                    class130 var328 = class110.method742((byte) 33);
                                    if (var328 == null) {
                                        class335.field5214[var7++] = -1;
                                        class335.field5214[var7++] = 0;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var328.field2029;
                                        class335.field5214[var7++] = var328.field4236;
                                        class63.field923[var8++] = var328.field2032;
                                        class271 var329 = var328.method880(-62);
                                        class335.field5214[var7++] = var329.field4166;
                                        class63.field923[var8++] = var329.field4160;
                                        class335.field5214[var7++] = var328.field4228;
                                    }
                                    continue;
                                }
                                if (var529 == 6502) {
                                    class130 var330 = class14.method115(-60);
                                    if (var330 == null) {
                                        class335.field5214[var7++] = -1;
                                        class335.field5214[var7++] = 0;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var330.field2029;
                                        class335.field5214[var7++] = var330.field4236;
                                        class63.field923[var8++] = var330.field2032;
                                        class271 var331 = var330.method880(-8);
                                        class335.field5214[var7++] = var331.field4166;
                                        class63.field923[var8++] = var331.field4160;
                                        class335.field5214[var7++] = var330.field4228;
                                    }
                                    continue;
                                }
                                if (var529 == 6503) {
                                    var7--;
                                    int var332 = class335.field5214[var7];
                                    if (class304.field4758 == 10 && class220.field3502 == 0 && class146.field2290 == 0 && class19.field265 == 0) {
                                        class335.field5214[var7++] = class47.method328(-8451, var332) ? 1 : 0;
                                        continue;
                                    }
                                    class335.field5214[var7++] = 0;
                                    continue;
                                }
                                if (var529 == 6504) {
                                    var7--;
                                    class99.field1539 = class335.field5214[var7];
                                    class268.method1777(-27637, class89.field1359);
                                    continue;
                                }
                                if (var529 == 6505) {
                                    class335.field5214[var7++] = class99.field1539;
                                    continue;
                                }
                                if (var529 == 6506) {
                                    var7--;
                                    int var333 = class335.field5214[var7];
                                    class130 var334 = class17.method136((byte) -106, var333);
                                    if (var334 == null) {
                                        class335.field5214[var7++] = -1;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                        class63.field923[var8++] = "";
                                        class335.field5214[var7++] = 0;
                                    } else {
                                        class335.field5214[var7++] = var334.field4236;
                                        class63.field923[var8++] = var334.field2032;
                                        class271 var335 = var334.method880(-95);
                                        class335.field5214[var7++] = var335.field4166;
                                        class63.field923[var8++] = var335.field4160;
                                        class335.field5214[var7++] = var334.field4228;
                                    }
                                    continue;
                                }
                                if (var529 == 6507) {
                                    var7 -= 4;
                                    boolean var336 = class335.field5214[var7 + 1] == 1;
                                    int var337 = class335.field5214[var7];
                                    int var338 = class335.field5214[var7 + 2];
                                    boolean var339 = class335.field5214[var7 + 3] == 1;
                                    class307.method2111(false, var338, var337, var336, var339);
                                    continue;
                                }
                            } else if (var529 < 6700) {
                                if (var529 == 6600) {
                                    var7--;
                                    class298.field4569 = class335.field5214[var7] == 1;
                                    class268.method1777(-27637, class89.field1359);
                                    continue;
                                }
                                if (var529 == 6601) {
                                    class335.field5214[var7++] = class298.field4569 ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var529 == 4400) {
                            var7 -= 2;
                            int var414 = class335.field5214[var7 + 1];
                            int var415 = class335.field5214[var7];
                            class280 var416 = class27.method209(11, var414);
                            if (var416.method1851(115)) {
                                class63.field923[var8++] = class277.method1819((byte) -85, var415).method125(var416.field4317, var414, 45);
                            } else {
                                class335.field5214[var7++] = class277.method1819((byte) 126, var415).method127(var414, var416.field4315, (byte) 113);
                            }
                            continue;
                        }
                    } else if (var529 == 4300) {
                        var7 -= 2;
                        int var417 = class335.field5214[var7];
                        int var418 = class335.field5214[var7 + 1];
                        class280 var419 = class27.method209(11, var418);
                        if (var419.method1851(115)) {
                            class63.field923[var8++] = class71.method511(var417, 10).method1962(var419.field4317, -46, var418);
                        } else {
                            class335.field5214[var7++] = class71.method511(var417, 10).method1960(var419.field4315, 12, var418);
                        }
                        continue;
                    }
                } else {
                    class207 var54;
                    if (var529 < 2000) {
                        var54 = var47 ? class253.field3950 : class273.field4203;
                    } else {
                        var529 -= 1000;
                        var7--;
                        var54 = class78.method547(class335.field5214[var7], 119);
                    }
                    if (var529 == 1300) {
                        var7--;
                        int var55 = class335.field5214[var7] - 1;
                        if (var55 >= 0 && var55 <= 9) {
                            var8--;
                            var54.method1388(-31782, var55, class63.field923[var8]);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var529 == 1301) {
                        var7 -= 2;
                        int var56 = class335.field5214[var7];
                        int var57 = class335.field5214[var7 + 1];
                        var54.field3236 = class276.method1812(true, var56, var57);
                        continue;
                    }
                    if (var529 == 1302) {
                        var7--;
                        var54.field3175 = class335.field5214[var7] == 1;
                        continue;
                    }
                    if (var529 == 1303) {
                        var7--;
                        var54.field3242 = class335.field5214[var7];
                        continue;
                    }
                    if (var529 == 1304) {
                        var7--;
                        var54.field3166 = class335.field5214[var7];
                        continue;
                    }
                    if (var529 == 1305) {
                        var8--;
                        var54.field3124 = class63.field923[var8];
                        continue;
                    }
                    if (var529 == 1306) {
                        var8--;
                        var54.field3146 = class63.field923[var8];
                        continue;
                    }
                    if (var529 == 1307) {
                        var54.field3157 = null;
                        continue;
                    }
                    if (var529 == 1308) {
                        var7--;
                        var54.field3148 = class335.field5214[var7];
                        var7--;
                        var54.field3140 = class335.field5214[var7];
                        continue;
                    }
                    if (var529 == 1309) {
                        var7--;
                        int var58 = class335.field5214[var7];
                        var7--;
                        int var59 = class335.field5214[var7];
                        if (var59 >= 1 && var59 <= 10) {
                            var54.method1395(-86, var59 - 1, var58);
                        }
                        continue;
                    }
                    if (var529 == 1310) {
                        var8--;
                        var54.field3205 = class63.field923[var8];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var528) {
            if (var6.field1526 == null) {
                if (class208.field3307 != 0) {
                    class343.method2390("Clientscript error - check log for details", 0, false, "");
                }
                class291.method1892("CS2 - scr:" + var6.field2852 + " op:" + var12, var528, -2);
            } else {
                StringBuffer var525 = new StringBuffer(30);
                var525.append("%0a - in: ").append(var6.field1526);
                for (int var526 = class97.field1488 - 1; var526 >= 0; var526--) {
                    var525.append("%0a - via: ").append(class304.field4745[var526].field3762.field1526);
                }
                if (var12 == 40) {
                    int var527 = var11[var9];
                    var525.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var527));
                }
                if (class208.field3307 != 0) {
                    class343.method2390("Clientscript error in: " + var6.field1526, 0, false, "");
                }
                class291.method1892("CS2 - scr:" + var6.field2852 + " op:" + var12 + var525.toString(), var528, -2);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Z", line = 6536)
    public final boolean method823(int arg0, int arg1) {
        if (arg0 >= -124) {
            return true;
        } else {
            field1872++;
            return (this.field1860[arg1] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(II)Z", line = 6551)
    public final boolean method824(int arg0, int arg1) {
        field1856++;
        if (arg1 != 127) {
            this.field1862 = -86;
        }
        return (this.field1860[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(II)I", line = 6572)
    public final int method825(int arg0, int arg1) {
        if (arg1 <= 118) {
            this.field1874 = (int[]) null;
        }
        field1866++;
        return this.field1860[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V", line = 6593)
    public static void method826(byte arg0) {
        field1864 = null;
        field1867 = null;
        field1861 = null;
        field1865 = null;
        if (arg0 != 91) {
            field1867 = (class224) null;
        }
        field1859 = null;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V", line = 6614)
    public class121(int arg0) {
        this.field1862 = arg0;
        this.field1868 = new int[this.field1862];
        this.field1860 = new byte[this.field1862];
        this.field1874 = new int[this.field1862];
        this.field1857 = new String[this.field1862];
    }
}
