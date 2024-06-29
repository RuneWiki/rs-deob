import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class80 extends class297 {

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "Lma;")
    public class5 field1248;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[I")
    public static int[] field1235 = new int[5];

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "Z")
    public static boolean field1239 = true;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "[I")
    public static int[] field1240 = new int[99];

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[Lfm;")
    public static class296[] field1243 = new class296[6];

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lma;")
    public static class5 field1238 = class12.method119("logo", (byte) 119);

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILni;)V", line = 4)
    public static final void method546(int arg0, class202 arg1) {
        field1246++;
        class202.field3224 = arg1.method1346((byte) 101, class98.field1468);
        field1244 = arg1.method1346((byte) 100, class46.field717);
        class226.field3712 = arg1.method1346((byte) 102, class275.field4683);
        class239.field3976 = arg1.method1346((byte) -105, class103.field1542);
        class137.field2029 = arg1.method1346((byte) 69, class289.field4916);
        class210.field3341 = arg1.method1346((byte) -87, class122.field1839);
        class208.field3302 = arg1.method1346((byte) 71, class152.field2233);
        class24.field423 = arg1.method1346((byte) -126, class77.field1206);
        class50.field780 = arg1.method1346((byte) 115, class265.field4537);
        class228.field3780 = arg1.method1346((byte) -95, class126.field1893);
        class5.field50 = arg1.method1346((byte) -112, class79.field1233);
        class37.field592 = arg1.method1346((byte) -80, class131.field1966);
        class244.field4054 = arg1.method1346((byte) 104, class238.field3935);
        class284.field4807 = arg1.method1346((byte) -78, class139.field2053);
        class126.field1888 = arg1.method1346((byte) -124, class100.field1497);
        class247.field4093 = arg1.method1346((byte) 42, class245.field4070);
        class231.field3839 = arg1.method1346((byte) 42, class167.field2550);
        class251.field4158 = arg1.method1346((byte) -119, class164.field2514);
        class259.field4419 = arg1.method1346((byte) 41, class72.field1135);
        int var2 = 49 % ((arg0 + 15) / 49);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1240[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLjk;)V", line = 44)
    public static final void method547(int arg0, boolean arg1, class256 arg2) {
        field1247++;
        Object[] var3 = arg2.field4372;
        int var4 = (Integer) var3[0];
        class290 var5 = class39.method282(-101, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (!arg1) {
            return;
        }
        class72.field1129 = 0;
        int[] var9 = var5.field4930;
        int[] var10 = var5.field4936;
        byte var11 = -1;
        try {
            class176.field2684 = new int[var5.field4926];
            class136.field2012 = new class5[var5.field4923];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field4367;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field4381;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field4382 == null ? -1 : arg2.field4382.field4206;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field4383;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field4382 == null ? -1 : arg2.field4382.field4210;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field4377 == null ? -1 : arg2.field4377.field4206;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field4377 == null ? -1 : arg2.field4377.field4210;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field4375;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field4384;
                    }
                    class176.field2684[var12++] = var16;
                } else if (var3[var14] instanceof class5) {
                    class5 var15 = (class5) var3[var14];
                    if (var15.method62(class231.field3841, -23269)) {
                        var15 = arg2.field4373;
                    }
                    class136.field2012[var13++] = var15;
                }
            }
            int var17 = 0;
            label3767: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var464 = var9[var8];
                if (var464 < 100) {
                    if (var464 == 0) {
                        class165.field2519[var6++] = var10[var8];
                        continue;
                    }
                    if (var464 == 1) {
                        int var18 = var10[var8];
                        class165.field2519[var6++] = class149.field2149[var18];
                        continue;
                    }
                    if (var464 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class235.method1666(class165.field2519[var6], var19, true);
                        continue;
                    }
                    if (var464 == 3) {
                        class226.field3718[var7++] = var5.field4927[var8];
                        continue;
                    }
                    if (var464 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var464 == 7) {
                        var6 -= 2;
                        if (class165.field2519[var6 + 1] != class165.field2519[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 8) {
                        var6 -= 2;
                        if (class165.field2519[var6 + 1] == class165.field2519[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 9) {
                        var6 -= 2;
                        if (class165.field2519[var6] < class165.field2519[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 10) {
                        var6 -= 2;
                        if (class165.field2519[var6 + 1] < class165.field2519[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 21) {
                        if (class72.field1129 == 0) {
                            return;
                        }
                        class240 var20 = class237.field3911[--class72.field1129];
                        class136.field2012 = var20.field3983;
                        class176.field2684 = var20.field3980;
                        var5 = var20.field3991;
                        var9 = var5.field4930;
                        var8 = var20.field3985;
                        var10 = var5.field4936;
                        continue;
                    }
                    if (var464 == 25) {
                        int var21 = var10[var8];
                        class165.field2519[var6++] = class247.method1731(-29267, var21);
                        continue;
                    }
                    if (var464 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class146.method922(class165.field2519[var6], var22, 1);
                        continue;
                    }
                    if (var464 == 31) {
                        var6 -= 2;
                        if (class165.field2519[var6] <= class165.field2519[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 32) {
                        var6 -= 2;
                        if (class165.field2519[var6 + 1] <= class165.field2519[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var464 == 33) {
                        class165.field2519[var6++] = class176.field2684[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var464 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class176.field2684[var10001] = class165.field2519[var6];
                        continue;
                    }
                    if (var464 == 35) {
                        class226.field3718[var7++] = class136.field2012[var10[var8]];
                        continue;
                    }
                    if (var464 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class136.field2012[var10001] = class226.field3718[var7];
                        continue;
                    }
                    if (var464 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class5 var24 = class280.method1896(var7, (byte) 120, var23, class226.field3718);
                        class226.field3718[var7++] = var24;
                        continue;
                    }
                    if (var464 == 38) {
                        var6--;
                        continue;
                    }
                    if (var464 == 39) {
                        var7--;
                        continue;
                    }
                    if (var464 == 40) {
                        int var25 = var10[var8];
                        class290 var26 = class39.method282(-101, var25);
                        int[] var27 = new int[var26.field4926];
                        class5[] var28 = new class5[var26.field4923];
                        for (int var29 = 0; var29 < var26.field4928; var29++) {
                            var27[var29] = class165.field2519[var6 + var29 - var26.field4928];
                        }
                        for (int var30 = 0; var30 < var26.field4935; var30++) {
                            var28[var30] = class226.field3718[var30 + var7 - var26.field4935];
                        }
                        var6 -= var26.field4928;
                        var7 -= var26.field4935;
                        class240 var31 = new class240();
                        var31.field3980 = class176.field2684;
                        var31.field3983 = class136.field2012;
                        var31.field3991 = var5;
                        var31.field3985 = var8;
                        if (class72.field1129 >= class237.field3911.length) {
                            throw new RuntimeException();
                        }
                        class237.field3911[class72.field1129++] = var31;
                        class176.field2684 = var27;
                        var5 = var26;
                        var9 = var26.field4930;
                        var10 = var26.field4936;
                        var8 = -1;
                        class136.field2012 = var28;
                        continue;
                    }
                    if (var464 == 42) {
                        class165.field2519[var6++] = class10.field149[var10[var8]];
                        continue;
                    }
                    if (var464 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class10.field149[var32] = class165.field2519[var6];
                        class184.method1208(var32, (byte) -4);
                        continue;
                    }
                    if (var464 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class165.field2519[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class200.field3185[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3767;
                                }
                                class129.field1931[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 45) {
                        var6--;
                        int var38 = class165.field2519[var6];
                        int var39 = var10[var8];
                        if (var38 >= 0 && var38 < class200.field3185[var39]) {
                            class165.field2519[var6++] = class129.field1931[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 46) {
                        var6 -= 2;
                        int var40 = class165.field2519[var6];
                        int var41 = var10[var8];
                        if (var40 >= 0 && var40 < class200.field3185[var41]) {
                            class129.field1931[var41][var40] = class165.field2519[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var464 == 47) {
                        class5 var42 = class137.field2040[var10[var8]];
                        if (var42 == null) {
                            var42 = class61.field958;
                        }
                        class226.field3718[var7++] = var42;
                        continue;
                    }
                    if (var464 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class137.field2040[var43] = class226.field3718[var7];
                        class1.method7(var43, 2047);
                        continue;
                    }
                    if (var464 == 51) {
                        class209 var44 = var5.field4929[var10[var8]];
                        var6--;
                        class276 var45 = (class276) var44.method1372(false, (long) class165.field2519[var6]);
                        if (var45 != null) {
                            var8 += var45.field4703;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var464 < 300) {
                    if (var464 == 100) {
                        var6 -= 3;
                        int var47 = class165.field2519[var6];
                        int var48 = class165.field2519[var6 + 1];
                        int var49 = class165.field2519[var6 + 2];
                        if (var48 == 0) {
                            throw new RuntimeException();
                        }
                        class253 var50 = class172.method1140(var47, -125);
                        if (var50.field4275 == null) {
                            var50.field4275 = new class253[var49 + 1];
                        }
                        if (var50.field4275.length <= var49) {
                            class253[] var51 = new class253[var49 + 1];
                            for (int var52 = 0; var52 < var50.field4275.length; var52++) {
                                var51[var52] = var50.field4275[var52];
                            }
                            var50.field4275 = var51;
                        }
                        if (var49 > 0 && var50.field4275[var49 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var49 - 1));
                        }
                        class253 var53 = new class253();
                        var53.field4196 = var53.field4206 = var50.field4206;
                        var53.field4216 = var48;
                        var53.field4210 = var49;
                        var53.field4265 = true;
                        var50.field4275[var49] = var53;
                        if (var46) {
                            class301.field5077 = var53;
                        } else {
                            class166.field2536 = var53;
                        }
                        class29.method205(var50, (byte) 108);
                        continue;
                    }
                    if (var464 == 101) {
                        class253 var54 = var46 ? class301.field5077 : class166.field2536;
                        if (var54.field4210 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class253 var55 = class172.method1140(var54.field4206, 110);
                        var55.field4275[var54.field4210] = null;
                        class29.method205(var55, (byte) 117);
                        continue;
                    }
                    if (var464 == 102) {
                        var6--;
                        class253 var56 = class172.method1140(class165.field2519[var6], 30);
                        var56.field4275 = null;
                        class29.method205(var56, (byte) 110);
                        continue;
                    }
                    if (var464 == 200) {
                        var6 -= 2;
                        int var57 = class165.field2519[var6 + 1];
                        int var58 = class165.field2519[var6];
                        class253 var59 = class282.method1911(var58, var57, -16037);
                        if (var59 != null && var57 != -1) {
                            class165.field2519[var6++] = 1;
                            if (var46) {
                                class301.field5077 = var59;
                            } else {
                                class166.field2536 = var59;
                            }
                            continue;
                        }
                        class165.field2519[var6++] = 0;
                        continue;
                    }
                    if (var464 == 201) {
                        var6--;
                        int var60 = class165.field2519[var6];
                        class253 var61 = class172.method1140(var60, 71);
                        if (var61 == null) {
                            class165.field2519[var6++] = 0;
                        } else {
                            class165.field2519[var6++] = 1;
                            if (var46) {
                                class301.field5077 = var61;
                            } else {
                                class166.field2536 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var464 < 500) {
                    if (var464 == 403) {
                        var6 -= 2;
                        int var452 = class165.field2519[var6];
                        int var453 = class165.field2519[var6 + 1];
                        if (var452 >= 7) {
                            var452 -= 7;
                        }
                        class151.field2183.field1369.method836(Integer.MIN_VALUE, var452, var453);
                        continue;
                    }
                    if (var464 == 404) {
                        var6 -= 2;
                        int var454 = class165.field2519[var6];
                        int var455 = class165.field2519[var6 + 1];
                        class151.field2183.field1369.method843(-127, var455, var454);
                        continue;
                    }
                    if (var464 == 410) {
                        var6--;
                        boolean var456 = class165.field2519[var6] != 0;
                        class151.field2183.field1369.method840(7, var456);
                        continue;
                    }
                } else if (var464 >= 1000 && var464 < 1100 || var464 >= 2000 && var464 < 2100) {
                    class253 var446;
                    if (var464 < 2000) {
                        var446 = var46 ? class301.field5077 : class166.field2536;
                    } else {
                        var464 -= 1000;
                        var6--;
                        var446 = class172.method1140(class165.field2519[var6], -121);
                    }
                    if (var464 == 1000) {
                        var6 -= 4;
                        var446.field4280 = class165.field2519[var6];
                        var446.field4268 = class165.field2519[var6 + 1];
                        int var447 = class165.field2519[var6 + 3];
                        if (var447 < 0) {
                            var447 = 0;
                        } else if (var447 > 5) {
                            var447 = 5;
                        }
                        int var448 = class165.field2519[var6 + 2];
                        if (var448 < 0) {
                            var448 = 0;
                        } else if (var448 > 5) {
                            var448 = 5;
                        }
                        var446.field4218 = (byte) var448;
                        var446.field4229 = (byte) var447;
                        class29.method205(var446, (byte) 87);
                        class267.method1836(var446, 0);
                        continue;
                    }
                    if (var464 == 1001) {
                        var6 -= 4;
                        var446.field4283 = class165.field2519[var6];
                        var446.field4248 = class165.field2519[var6 + 1];
                        var446.field4306 = 0;
                        var446.field4220 = 0;
                        int var449 = class165.field2519[var6 + 3];
                        if (var449 < 0) {
                            var449 = 0;
                        } else if (var449 > 4) {
                            var449 = 4;
                        }
                        int var450 = class165.field2519[var6 + 2];
                        var446.field4323 = (byte) var449;
                        if (var450 < 0) {
                            var450 = 0;
                        } else if (var450 > 4) {
                            var450 = 4;
                        }
                        var446.field4332 = (byte) var450;
                        class29.method205(var446, (byte) 97);
                        class267.method1836(var446, 0);
                        if (var446.field4216 == 0) {
                            class171.method1134(false, -25, var446);
                        }
                        continue;
                    }
                    if (var464 == 1003) {
                        var6--;
                        boolean var451 = class165.field2519[var6] == 1;
                        if (var446.field4269 != var451) {
                            var446.field4269 = var451;
                            class29.method205(var446, (byte) 100);
                        }
                        continue;
                    }
                    if (var464 == 1004) {
                        var6 -= 2;
                        var446.field4231 = class165.field2519[var6];
                        var446.field4193 = class165.field2519[var6 + 1];
                        class29.method205(var446, (byte) 116);
                        class267.method1836(var446, 0);
                        if (var446.field4216 == 0) {
                            class171.method1134(false, -63, var446);
                        }
                        continue;
                    }
                } else if (var464 >= 1100 && var464 < 1200 || var464 >= 2100 && var464 < 2200) {
                    class253 var443;
                    if (var464 >= 2000) {
                        var464 -= 1000;
                        var6--;
                        var443 = class172.method1140(class165.field2519[var6], 55);
                    } else {
                        var443 = var46 ? class301.field5077 : class166.field2536;
                    }
                    if (var464 == 1100) {
                        var6 -= 2;
                        var443.field4233 = class165.field2519[var6];
                        if (var443.field4233 > var443.field4307 - var443.field4228) {
                            var443.field4233 = var443.field4307 - var443.field4228;
                        }
                        if (var443.field4233 < 0) {
                            var443.field4233 = 0;
                        }
                        var443.field4243 = class165.field2519[var6 + 1];
                        if (var443.field4243 > var443.field4334 - var443.field4190) {
                            var443.field4243 = var443.field4334 - var443.field4190;
                        }
                        if (var443.field4243 < 0) {
                            var443.field4243 = 0;
                        }
                        class29.method205(var443, (byte) 109);
                        continue;
                    }
                    if (var464 == 1101) {
                        var6--;
                        var443.field4310 = class165.field2519[var6];
                        class29.method205(var443, (byte) 116);
                        continue;
                    }
                    if (var464 == 1102) {
                        var6--;
                        var443.field4272 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 102);
                        continue;
                    }
                    if (var464 == 1103) {
                        var6--;
                        var443.field4308 = class165.field2519[var6];
                        class29.method205(var443, (byte) 86);
                        continue;
                    }
                    if (var464 == 1104) {
                        var6--;
                        var443.field4226 = class165.field2519[var6];
                        class29.method205(var443, (byte) 109);
                        continue;
                    }
                    if (var464 == 1105) {
                        var6--;
                        var443.field4230 = class165.field2519[var6];
                        class29.method205(var443, (byte) 86);
                        continue;
                    }
                    if (var464 == 1106) {
                        var6--;
                        var443.field4292 = class165.field2519[var6];
                        class29.method205(var443, (byte) 118);
                        continue;
                    }
                    if (var464 == 1107) {
                        var6--;
                        var443.field4202 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 106);
                        continue;
                    }
                    if (var464 == 1108) {
                        var443.field4262 = 1;
                        var6--;
                        var443.field4183 = class165.field2519[var6];
                        class29.method205(var443, (byte) 96);
                        continue;
                    }
                    if (var464 == 1109) {
                        var6 -= 6;
                        var443.field4205 = class165.field2519[var6];
                        var443.field4255 = class165.field2519[var6 + 1];
                        var443.field4302 = class165.field2519[var6 + 2];
                        var443.field4319 = class165.field2519[var6 + 3];
                        var443.field4249 = class165.field2519[var6 + 4];
                        var443.field4325 = class165.field2519[var6 + 5];
                        class29.method205(var443, (byte) 111);
                        continue;
                    }
                    if (var464 == 1110) {
                        var6--;
                        int var444 = class165.field2519[var6];
                        if (var443.field4300 != var444) {
                            var443.field4300 = var444;
                            var443.field4191 = 0;
                            var443.field4336 = 0;
                            class29.method205(var443, (byte) 116);
                        }
                        continue;
                    }
                    if (var464 == 1111) {
                        var6--;
                        var443.field4256 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 92);
                        continue;
                    }
                    if (var464 == 1112) {
                        var7--;
                        class5 var445 = class226.field3718[var7];
                        if (!var445.method62(var443.field4327, -23269)) {
                            var443.field4327 = var445;
                            class29.method205(var443, (byte) 87);
                        }
                        continue;
                    }
                    if (var464 == 1113) {
                        var6--;
                        var443.field4315 = class165.field2519[var6];
                        class29.method205(var443, (byte) 100);
                        continue;
                    }
                    if (var464 == 1114) {
                        var6 -= 3;
                        var443.field4284 = class165.field2519[var6];
                        var443.field4338 = class165.field2519[var6 + 1];
                        var443.field4309 = class165.field2519[var6 + 2];
                        class29.method205(var443, (byte) 119);
                        continue;
                    }
                    if (var464 == 1115) {
                        var6--;
                        var443.field4316 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 109);
                        continue;
                    }
                    if (var464 == 1116) {
                        var6--;
                        var443.field4311 = class165.field2519[var6];
                        class29.method205(var443, (byte) 88);
                        continue;
                    }
                    if (var464 == 1117) {
                        var6--;
                        var443.field4287 = class165.field2519[var6];
                        class29.method205(var443, (byte) 119);
                        continue;
                    }
                    if (var464 == 1118) {
                        var6--;
                        var443.field4304 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 107);
                        continue;
                    }
                    if (var464 == 1119) {
                        var6--;
                        var443.field4208 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 104);
                        continue;
                    }
                    if (var464 == 1120) {
                        var6 -= 2;
                        var443.field4307 = class165.field2519[var6];
                        var443.field4334 = class165.field2519[var6 + 1];
                        class29.method205(var443, (byte) 125);
                        if (var443.field4216 == 0) {
                            class171.method1134(false, -41, var443);
                        }
                        continue;
                    }
                    if (var464 == 1121) {
                        var6 -= 2;
                        var443.field4237 = (short) class165.field2519[var6];
                        var443.field4240 = (short) class165.field2519[var6 + 1];
                        class29.method205(var443, (byte) 117);
                        continue;
                    }
                    if (var464 == 1122) {
                        var6--;
                        var443.field4212 = class165.field2519[var6] == 1;
                        class29.method205(var443, (byte) 124);
                        continue;
                    }
                } else if (var464 >= 1200 && var464 < 1300 || var464 >= 2200 && var464 < 2300) {
                    class253 var439;
                    if (var464 >= 2000) {
                        var6--;
                        var439 = class172.method1140(class165.field2519[var6], -121);
                        var464 -= 1000;
                    } else {
                        var439 = var46 ? class301.field5077 : class166.field2536;
                    }
                    class29.method205(var439, (byte) 94);
                    if (var464 == 1200 || var464 == 1205) {
                        var6 -= 2;
                        int var440 = class165.field2519[var6];
                        int var441 = class165.field2519[var6 + 1];
                        if (var440 == -1) {
                            var439.field4183 = -1;
                            var439.field4262 = 1;
                            var439.field4198 = -1;
                        } else {
                            var439.field4281 = var441;
                            var439.field4198 = var440;
                            class196 var442 = class235.method1664(97, var440);
                            if (var464 == 1205) {
                                var439.field4330 = false;
                            } else {
                                var439.field4330 = true;
                            }
                            var439.field4249 = var442.field3092;
                            var439.field4319 = var442.field3106;
                            var439.field4205 = var442.field3059;
                            var439.field4302 = var442.field3068;
                            var439.field4255 = var442.field3063;
                            var439.field4325 = var442.field3101;
                            if (var439.field4220 > 0) {
                                var439.field4325 = var439.field4325 * 32 / var439.field4220;
                            } else if (var439.field4283 > 0) {
                                var439.field4325 = var439.field4325 * 32 / var439.field4283;
                            }
                        }
                        continue;
                    }
                    if (var464 == 1201) {
                        var439.field4262 = 2;
                        var6--;
                        var439.field4183 = class165.field2519[var6];
                        continue;
                    }
                    if (var464 == 1202) {
                        var439.field4262 = 3;
                        var439.field4183 = class151.field2183.field1369.method838(61);
                        continue;
                    }
                    if (var464 == 1203) {
                        var439.field4262 = 6;
                        var6--;
                        var439.field4183 = class165.field2519[var6];
                        continue;
                    }
                    if (var464 == 1204) {
                        var439.field4262 = 5;
                        var6--;
                        var439.field4183 = class165.field2519[var6];
                        continue;
                    }
                } else if (var464 >= 1300 && var464 < 1400 || var464 >= 2300 && var464 < 2400) {
                    class253 var62;
                    if (var464 >= 2000) {
                        var6--;
                        var62 = class172.method1140(class165.field2519[var6], 7);
                        var464 -= 1000;
                    } else {
                        var62 = var46 ? class301.field5077 : class166.field2536;
                    }
                    if (var464 == 1300) {
                        var6--;
                        int var63 = class165.field2519[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var7--;
                            var62.method1773(1, var63, class226.field3718[var7]);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var464 == 1301) {
                        var6 -= 2;
                        int var64 = class165.field2519[var6];
                        int var65 = class165.field2519[var6 + 1];
                        var62.field4288 = class282.method1911(var64, var65, -16037);
                        continue;
                    }
                    if (var464 == 1302) {
                        var6--;
                        var62.field4201 = class165.field2519[var6] == 1;
                        continue;
                    }
                    if (var464 == 1303) {
                        var6--;
                        var62.field4343 = class165.field2519[var6];
                        continue;
                    }
                    if (var464 == 1304) {
                        var6--;
                        var62.field4318 = class165.field2519[var6];
                        continue;
                    }
                    if (var464 == 1305) {
                        var7--;
                        var62.field4225 = class226.field3718[var7];
                        continue;
                    }
                    if (var464 == 1306) {
                        var7--;
                        var62.field4242 = class226.field3718[var7];
                        continue;
                    }
                    if (var464 == 1307) {
                        var62.field4199 = null;
                        continue;
                    }
                } else {
                    if (var464 >= 1400 && var464 < 1500 || var464 >= 2400 && var464 < 2500) {
                        class253 var66;
                        if (var464 < 2000) {
                            var66 = var46 ? class301.field5077 : class166.field2536;
                        } else {
                            var464 -= 1000;
                            var6--;
                            var66 = class172.method1140(class165.field2519[var6], 45);
                        }
                        int[] var67 = null;
                        var7--;
                        class5 var68 = class226.field3718[var7];
                        if (var68.method36(30673) > 0 && var68.method65((byte) 109, var68.method36(30673) - 1) == 89) {
                            var6--;
                            int var69 = class165.field2519[var6];
                            if (var69 > 0) {
                                var67 = new int[var69];
                                while ((var69--) > 0) {
                                    var6--;
                                    var67[var69] = class165.field2519[var6];
                                }
                            }
                            var68 = var68.method76(0, 0, var68.method36(30673) - 1);
                        }
                        Object[] var70 = new Object[var68.method36(30673) + 1];
                        for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                            if (var68.method65((byte) 73, var71 - 1) == 115) {
                                var7--;
                                var70[var71] = class226.field3718[var7];
                            } else {
                                var6--;
                                var70[var71] = Integer.valueOf(class165.field2519[var6]);
                            }
                        }
                        var6--;
                        int var72 = class165.field2519[var6];
                        if (var72 == -1) {
                            var70 = null;
                        } else {
                            var70[0] = Integer.valueOf(var72);
                        }
                        var66.field4267 = true;
                        if (var464 == 1400) {
                            var66.field4297 = var70;
                        } else if (var464 == 1401) {
                            var66.field4250 = var70;
                        } else if (var464 == 1402) {
                            var66.field4271 = var70;
                        } else if (var464 == 1403) {
                            var66.field4251 = var70;
                        } else if (var464 == 1404) {
                            var66.field4258 = var70;
                        } else if (var464 == 1405) {
                            var66.field4285 = var70;
                        } else if (var464 == 1406) {
                            var66.field4239 = var70;
                        } else if (var464 == 1407) {
                            var66.field4312 = var70;
                            var66.field4259 = var67;
                        } else if (var464 == 1408) {
                            var66.field4194 = var70;
                        } else if (var464 == 1409) {
                            var66.field4329 = var70;
                        } else if (var464 == 1410) {
                            var66.field4320 = var70;
                        } else if (var464 == 1411) {
                            var66.field4344 = var70;
                        } else if (var464 == 1412) {
                            var66.field4273 = var70;
                        } else if (var464 == 1414) {
                            var66.field4186 = var70;
                            var66.field4223 = var67;
                        } else if (var464 == 1415) {
                            var66.field4245 = var70;
                            var66.field4293 = var67;
                        } else if (var464 == 1416) {
                            var66.field4274 = var70;
                        } else if (var464 == 1417) {
                            var66.field4221 = var70;
                        } else if (var464 == 1418) {
                            var66.field4298 = var70;
                        } else if (var464 == 1419) {
                            var66.field4222 = var70;
                        } else if (var464 == 1420) {
                            var66.field4324 = var70;
                        } else if (var464 == 1421) {
                            var66.field4224 = var70;
                        } else if (var464 == 1422) {
                            var66.field4247 = var70;
                        } else if (var464 == 1423) {
                            var66.field4326 = var70;
                        } else if (var464 == 1424) {
                            var66.field4314 = var70;
                        } else if (var464 == 1425) {
                            var66.field4279 = var70;
                        } else if (var464 == 1426) {
                            var66.field4313 = var70;
                        } else if (var464 == 1427) {
                            var66.field4253 = var70;
                        } else if (var464 == 1428) {
                            var66.field4227 = var70;
                            var66.field4321 = var67;
                        } else if (var464 == 1429) {
                            var66.field4286 = var70;
                            var66.field4341 = var67;
                        }
                        continue;
                    }
                    if (var464 < 1600) {
                        class253 var438 = var46 ? class301.field5077 : class166.field2536;
                        if (var464 == 1500) {
                            class165.field2519[var6++] = var438.field4235;
                            continue;
                        }
                        if (var464 == 1501) {
                            class165.field2519[var6++] = var438.field4322;
                            continue;
                        }
                        if (var464 == 1502) {
                            class165.field2519[var6++] = var438.field4228;
                            continue;
                        }
                        if (var464 == 1503) {
                            class165.field2519[var6++] = var438.field4190;
                            continue;
                        }
                        if (var464 == 1504) {
                            class165.field2519[var6++] = var438.field4269 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 1505) {
                            class165.field2519[var6++] = var438.field4196;
                            continue;
                        }
                    } else if (var464 < 1700) {
                        class253 var437 = var46 ? class301.field5077 : class166.field2536;
                        if (var464 == 1600) {
                            class165.field2519[var6++] = var437.field4233;
                            continue;
                        }
                        if (var464 == 1601) {
                            class165.field2519[var6++] = var437.field4243;
                            continue;
                        }
                        if (var464 == 1602) {
                            class226.field3718[var7++] = var437.field4327;
                            continue;
                        }
                        if (var464 == 1603) {
                            class165.field2519[var6++] = var437.field4307;
                            continue;
                        }
                        if (var464 == 1604) {
                            class165.field2519[var6++] = var437.field4334;
                            continue;
                        }
                        if (var464 == 1605) {
                            class165.field2519[var6++] = var437.field4325;
                            continue;
                        }
                        if (var464 == 1606) {
                            class165.field2519[var6++] = var437.field4302;
                            continue;
                        }
                        if (var464 == 1607) {
                            class165.field2519[var6++] = var437.field4249;
                            continue;
                        }
                        if (var464 == 1608) {
                            class165.field2519[var6++] = var437.field4319;
                            continue;
                        }
                        if (var464 == 1609) {
                            class165.field2519[var6++] = var437.field4308;
                            continue;
                        }
                    } else if (var464 < 1800) {
                        class253 var436 = var46 ? class301.field5077 : class166.field2536;
                        if (var464 == 1700) {
                            class165.field2519[var6++] = var436.field4198;
                            continue;
                        }
                        if (var464 == 1701) {
                            if (var436.field4198 == -1) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = var436.field4281;
                            }
                            continue;
                        }
                        if (var464 == 1702) {
                            class165.field2519[var6++] = var436.field4210;
                            continue;
                        }
                    } else if (var464 < 1900) {
                        class253 var434 = var46 ? class301.field5077 : class166.field2536;
                        if (var464 == 1800) {
                            class165.field2519[var6++] = class8.method89(120, client.method767(var434));
                            continue;
                        }
                        if (var464 == 1801) {
                            var6--;
                            int var435 = class165.field2519[var6];
                            int var466 = var435 - 1;
                            if (var434.field4199 != null && var434.field4199.length > var466 && var434.field4199[var466] != null) {
                                class226.field3718[var7++] = var434.field4199[var466];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 1802) {
                            if (var434.field4225 == null) {
                                class226.field3718[var7++] = class301.field5079;
                            } else {
                                class226.field3718[var7++] = var434.field4225;
                            }
                            continue;
                        }
                    } else if (var464 < 2600) {
                        var6--;
                        class253 var433 = class172.method1140(class165.field2519[var6], -111);
                        if (var464 == 2500) {
                            class165.field2519[var6++] = var433.field4235;
                            continue;
                        }
                        if (var464 == 2501) {
                            class165.field2519[var6++] = var433.field4322;
                            continue;
                        }
                        if (var464 == 2502) {
                            class165.field2519[var6++] = var433.field4228;
                            continue;
                        }
                        if (var464 == 2503) {
                            class165.field2519[var6++] = var433.field4190;
                            continue;
                        }
                        if (var464 == 2504) {
                            class165.field2519[var6++] = var433.field4269 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 2505) {
                            class165.field2519[var6++] = var433.field4196;
                            continue;
                        }
                    } else if (var464 < 2700) {
                        var6--;
                        class253 var73 = class172.method1140(class165.field2519[var6], -110);
                        if (var464 == 2600) {
                            class165.field2519[var6++] = var73.field4233;
                            continue;
                        }
                        if (var464 == 2601) {
                            class165.field2519[var6++] = var73.field4243;
                            continue;
                        }
                        if (var464 == 2602) {
                            class226.field3718[var7++] = var73.field4327;
                            continue;
                        }
                        if (var464 == 2603) {
                            class165.field2519[var6++] = var73.field4307;
                            continue;
                        }
                        if (var464 == 2604) {
                            class165.field2519[var6++] = var73.field4334;
                            continue;
                        }
                        if (var464 == 2605) {
                            class165.field2519[var6++] = var73.field4325;
                            continue;
                        }
                        if (var464 == 2606) {
                            class165.field2519[var6++] = var73.field4302;
                            continue;
                        }
                        if (var464 == 2607) {
                            class165.field2519[var6++] = var73.field4249;
                            continue;
                        }
                        if (var464 == 2608) {
                            class165.field2519[var6++] = var73.field4319;
                            continue;
                        }
                        if (var464 == 2609) {
                            class165.field2519[var6++] = var73.field4308;
                            continue;
                        }
                    } else if (var464 < 2800) {
                        if (var464 == 2700) {
                            var6--;
                            class253 var423 = class172.method1140(class165.field2519[var6], 116);
                            class165.field2519[var6++] = var423.field4198;
                            continue;
                        }
                        if (var464 == 2701) {
                            var6--;
                            class253 var424 = class172.method1140(class165.field2519[var6], -122);
                            if (var424.field4198 == -1) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = var424.field4281;
                            }
                            continue;
                        }
                        if (var464 == 2702) {
                            var6--;
                            int var425 = class165.field2519[var6];
                            class174 var426 = (class174) class81.field1253.method1372(!arg1, (long) var425);
                            if (var426 == null) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = 1;
                            }
                            continue;
                        }
                        if (var464 == 2703) {
                            var6--;
                            class253 var427 = class172.method1140(class165.field2519[var6], 101);
                            if (var427.field4275 == null) {
                                class165.field2519[var6++] = 0;
                                continue;
                            }
                            int var428 = var427.field4275.length;
                            for (int var429 = 0; var429 < var427.field4275.length; var429++) {
                                if (var427.field4275[var429] == null) {
                                    var428 = var429;
                                    break;
                                }
                            }
                            class165.field2519[var6++] = var428;
                            continue;
                        }
                        if (var464 == 2704 || var464 == 2705) {
                            var6 -= 2;
                            int var430 = class165.field2519[var6];
                            int var431 = class165.field2519[var6 + 1];
                            class174 var432 = (class174) class81.field1253.method1372(false, (long) var430);
                            if (var432 != null && var432.field2660 == var431) {
                                class165.field2519[var6++] = 1;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                    } else if (var464 < 2900) {
                        var6--;
                        class253 var74 = class172.method1140(class165.field2519[var6], -127);
                        if (var464 == 2800) {
                            class165.field2519[var6++] = class8.method89(82, client.method767(var74));
                            continue;
                        }
                        if (var464 == 2801) {
                            var6--;
                            int var75 = class165.field2519[var6];
                            int var465 = var75 - 1;
                            if (var74.field4199 != null && var74.field4199.length > var465 && var74.field4199[var465] != null) {
                                class226.field3718[var7++] = var74.field4199[var465];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 2802) {
                            if (var74.field4225 == null) {
                                class226.field3718[var7++] = class301.field5079;
                            } else {
                                class226.field3718[var7++] = var74.field4225;
                            }
                            continue;
                        }
                    } else if (var464 < 3200) {
                        if (var464 == 3100) {
                            var7--;
                            class5 var76 = class226.field3718[var7];
                            class69.method497(24077, class301.field5079, 0, var76);
                            continue;
                        }
                        if (var464 == 3101) {
                            var6 -= 2;
                            class13.method129(class165.field2519[var6], class151.field2183, class165.field2519[var6 + 1], 80);
                            continue;
                        }
                        if (var464 == 3103) {
                            class281.method1905(-77);
                            continue;
                        }
                        if (var464 == 3104) {
                            int var77 = 0;
                            class55.field856++;
                            var7--;
                            class5 var78 = class226.field3718[var7];
                            if (var78.method57(-101)) {
                                var77 = var78.method54((byte) -83);
                            }
                            class147.field2127.method1389((byte) 112, 76);
                            class147.field2127.method1513(var77, false);
                            continue;
                        }
                        if (var464 == 3105) {
                            class302.field5098++;
                            var7--;
                            class5 var79 = class226.field3718[var7];
                            class147.field2127.method1389((byte) -24, 132);
                            class147.field2127.method1548(false, var79.method69(-49));
                            continue;
                        }
                        if (var464 == 3106) {
                            class27.field455++;
                            var7--;
                            class5 var80 = class226.field3718[var7];
                            class147.field2127.method1389((byte) -95, 23);
                            class147.field2127.method1542(-73, var80.method36(30673) + 1);
                            class147.field2127.method1522(var80, (byte) 90);
                            continue;
                        }
                        if (var464 == 3107) {
                            var6--;
                            int var81 = class165.field2519[var6];
                            var7--;
                            class5 var82 = class226.field3718[var7];
                            class97.method625(var82, var81, (byte) -49);
                            continue;
                        }
                        if (var464 == 3108) {
                            var6 -= 3;
                            int var83 = class165.field2519[var6 + 1];
                            int var84 = class165.field2519[var6];
                            int var85 = class165.field2519[var6 + 2];
                            class253 var86 = class172.method1140(var85, 30);
                            class210.method1388(-29, var86, var84, var83);
                            continue;
                        }
                        if (var464 == 3109) {
                            var6 -= 2;
                            int var87 = class165.field2519[var6];
                            int var88 = class165.field2519[var6 + 1];
                            class253 var89 = var46 ? class301.field5077 : class166.field2536;
                            class210.method1388(-29, var89, var87, var88);
                            continue;
                        }
                        if (var464 == 3110) {
                            class31.field490++;
                            var6--;
                            int var90 = class165.field2519[var6];
                            class147.field2127.method1389((byte) 115, 91);
                            class147.field2127.method1539(var90, !arg1);
                            continue;
                        }
                    } else if (var464 < 3300) {
                        if (var464 == 3200) {
                            var6 -= 3;
                            class188.method1236(class165.field2519[var6], class165.field2519[var6 + 1], 0, class165.field2519[var6 + 2]);
                            continue;
                        }
                        if (var464 == 3201) {
                            var6--;
                            class78.method539(class165.field2519[var6], -81);
                            continue;
                        }
                        if (var464 == 3202) {
                            var6 -= 2;
                            class193.method1264(class165.field2519[var6 + 1], 4, class165.field2519[var6]);
                            continue;
                        }
                    } else if (var464 < 3400) {
                        if (var464 == 3300) {
                            class165.field2519[var6++] = class50.field784;
                            continue;
                        }
                        if (var464 == 3301) {
                            var6 -= 2;
                            int var91 = class165.field2519[var6];
                            int var92 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class239.method1689(var92, (byte) -89, var91);
                            continue;
                        }
                        if (var464 == 3302) {
                            var6 -= 2;
                            int var93 = class165.field2519[var6];
                            int var94 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class207.method1366(9, var93, var94);
                            continue;
                        }
                        if (var464 == 3303) {
                            var6 -= 2;
                            int var95 = class165.field2519[var6];
                            int var96 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class59.method445(var95, 82, var96);
                            continue;
                        }
                        if (var464 == 3304) {
                            var6--;
                            int var97 = class165.field2519[var6];
                            class165.field2519[var6++] = class210.method1383(true, var97).field4175;
                            continue;
                        }
                        if (var464 == 3305) {
                            var6--;
                            int var98 = class165.field2519[var6];
                            class165.field2519[var6++] = class1.field9[var98];
                            continue;
                        }
                        if (var464 == 3306) {
                            var6--;
                            int var99 = class165.field2519[var6];
                            class165.field2519[var6++] = class264.field4519[var99];
                            continue;
                        }
                        if (var464 == 3307) {
                            var6--;
                            int var100 = class165.field2519[var6];
                            class165.field2519[var6++] = class219.field3551[var100];
                            continue;
                        }
                        if (var464 == 3308) {
                            int var101 = (class151.field2183.field178 >> 7) + class193.field3017;
                            int var102 = (class151.field2183.field211 >> 7) + class74.field1158;
                            int var103 = class276.field4701;
                            class165.field2519[var6++] = (var101 << 14) + (var103 << 28) + var102;
                            continue;
                        }
                        if (var464 == 3309) {
                            var6--;
                            int var104 = class165.field2519[var6];
                            class165.field2519[var6++] = class204.method1354(var104, 268424491) >> 14;
                            continue;
                        }
                        if (var464 == 3310) {
                            var6--;
                            int var105 = class165.field2519[var6];
                            class165.field2519[var6++] = var105 >> 28;
                            continue;
                        }
                        if (var464 == 3311) {
                            var6--;
                            int var106 = class165.field2519[var6];
                            class165.field2519[var6++] = class204.method1354(var106, 16383);
                            continue;
                        }
                        if (var464 == 3312) {
                            class165.field2519[var6++] = class90.field1349 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3313) {
                            var6 -= 2;
                            int var107 = class165.field2519[var6] + 32768;
                            int var108 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class239.method1689(var108, (byte) -89, var107);
                            continue;
                        }
                        if (var464 == 3314) {
                            var6 -= 2;
                            int var109 = class165.field2519[var6] + 32768;
                            int var110 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class207.method1366(9, var109, var110);
                            continue;
                        }
                        if (var464 == 3315) {
                            var6 -= 2;
                            int var111 = class165.field2519[var6 + 1];
                            int var112 = class165.field2519[var6] + 32768;
                            class165.field2519[var6++] = class59.method445(var112, 97, var111);
                            continue;
                        }
                        if (var464 == 3316) {
                            if (class1.field3 >= 2) {
                                class165.field2519[var6++] = class1.field3;
                            } else {
                                class165.field2519[var6++] = 0;
                            }
                            continue;
                        }
                        if (var464 == 3317) {
                            class165.field2519[var6++] = class88.field1317;
                            continue;
                        }
                        if (var464 == 3318) {
                            class165.field2519[var6++] = class239.field3967;
                            continue;
                        }
                        if (var464 == 3321) {
                            class165.field2519[var6++] = class210.field3353;
                            continue;
                        }
                        if (var464 == 3322) {
                            class165.field2519[var6++] = class195.field3035;
                            continue;
                        }
                        if (var464 == 3323) {
                            if (class137.field2038 >= 5 && class137.field2038 <= 9) {
                                class165.field2519[var6++] = 1;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3324) {
                            if (class137.field2038 >= 5 && class137.field2038 <= 9) {
                                class165.field2519[var6++] = class137.field2038;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3325) {
                            if (class84.field1287 <= 0) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = 1;
                            }
                            continue;
                        }
                        if (var464 == 3326) {
                            class165.field2519[var6++] = class151.field2183.field1380;
                            continue;
                        }
                        if (var464 == 3327) {
                            class165.field2519[var6++] = class151.field2183.field1369.field1891 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3328) {
                            class165.field2519[var6++] = class57.field902;
                            continue;
                        }
                        if (var464 == 3329) {
                            class165.field2519[var6++] = class123.field1865;
                            continue;
                        }
                        if (var464 == 3330) {
                            var6--;
                            int var113 = class165.field2519[var6];
                            class165.field2519[var6++] = class117.method783(107, var113);
                            continue;
                        }
                        if (var464 == 3331) {
                            var6 -= 2;
                            int var114 = class165.field2519[var6 + 1];
                            int var115 = class165.field2519[var6];
                            class165.field2519[var6++] = class107.method673(var115, false, false, var114);
                            continue;
                        }
                        if (var464 == 3332) {
                            var6 -= 2;
                            int var116 = class165.field2519[var6];
                            int var117 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class107.method673(var116, false, true, var117);
                            continue;
                        }
                        if (var464 == 3333) {
                            class165.field2519[var6++] = class65.field1023;
                            continue;
                        }
                    } else if (var464 < 3500) {
                        if (var464 == 3400) {
                            var6 -= 2;
                            int var408 = class165.field2519[var6];
                            int var409 = class165.field2519[var6 + 1];
                            class146 var410 = class127.method848(var408, (byte) 18);
                            if (var410.field2113 != 115) {
                            }
                            class226.field3718[var7++] = var410.method929(var409, (byte) -102);
                            continue;
                        }
                        if (var464 == 3408) {
                            var6 -= 4;
                            int var411 = class165.field2519[var6];
                            int var412 = class165.field2519[var6 + 1];
                            int var413 = class165.field2519[var6 + 2];
                            int var414 = class165.field2519[var6 + 3];
                            class146 var415 = class127.method848(var413, (byte) -106);
                            if (var415.field2121 == var411 && var415.field2113 == var412) {
                                if (var412 == 115) {
                                    class226.field3718[var7++] = var415.method929(var414, (byte) -95);
                                } else {
                                    class165.field2519[var6++] = var415.method924(var414, 3);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var464 == 3409) {
                            var6 -= 3;
                            int var416 = class165.field2519[var6];
                            int var417 = class165.field2519[var6 + 1];
                            int var418 = class165.field2519[var6 + 2];
                            class146 var419 = class127.method848(var417, (byte) 34);
                            if (var419.field2113 != var416) {
                                throw new RuntimeException("C3409-1");
                            }
                            class165.field2519[var6++] = var419.method923(0, var418) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3410) {
                            var6--;
                            int var420 = class165.field2519[var6];
                            var7--;
                            class5 var421 = class226.field3718[var7];
                            class146 var422 = class127.method848(var420, (byte) 126);
                            if (var422.field2113 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class165.field2519[var6++] = var422.method926(var421, 50) ? 1 : 0;
                            continue;
                        }
                    } else if (var464 < 3700) {
                        if (var464 == 3600) {
                            if (class303.field5106 == 0) {
                                class165.field2519[var6++] = -2;
                            } else if (class303.field5106 == 1) {
                                class165.field2519[var6++] = -1;
                            } else {
                                class165.field2519[var6++] = class275.field4698;
                            }
                            continue;
                        }
                        if (var464 == 3601) {
                            var6--;
                            int var118 = class165.field2519[var6];
                            if (class303.field5106 == 2 && class275.field4698 > var118) {
                                class226.field3718[var7++] = class244.field4048[var118];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 3602) {
                            var6--;
                            int var119 = class165.field2519[var6];
                            if (class303.field5106 == 2 && var119 < class275.field4698) {
                                class165.field2519[var6++] = class49.field771[var119];
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3603) {
                            var6--;
                            int var120 = class165.field2519[var6];
                            if (class303.field5106 == 2 && class275.field4698 > var120) {
                                class165.field2519[var6++] = class91.field1376[var120];
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3604) {
                            var7--;
                            class5 var121 = class226.field3718[var7];
                            var6--;
                            int var122 = class165.field2519[var6];
                            class77.method537(var122, var121, 57);
                            continue;
                        }
                        if (var464 == 3605) {
                            var7--;
                            class5 var123 = class226.field3718[var7];
                            class235.method1665(var123.method69(-49), 24246);
                            continue;
                        }
                        if (var464 == 3606) {
                            var7--;
                            class5 var124 = class226.field3718[var7];
                            class296.method1993(var124.method69(-49), 23297);
                            continue;
                        }
                        if (var464 == 3607) {
                            var7--;
                            class5 var125 = class226.field3718[var7];
                            class136.method886(var125.method69(-49), false);
                            continue;
                        }
                        if (var464 == 3608) {
                            var7--;
                            class5 var126 = class226.field3718[var7];
                            class67.method481(var126.method69(-49), (byte) 33);
                            continue;
                        }
                        if (var464 == 3609) {
                            var7--;
                            class5 var127 = class226.field3718[var7];
                            if (var127.method75((byte) 73, class256.field4371) || var127.method75((byte) 60, class198.field3152)) {
                                var127 = var127.method78(-24938, 7);
                            }
                            class165.field2519[var6++] = class61.method450(var127, 0) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3610) {
                            var6--;
                            int var128 = class165.field2519[var6];
                            if (class303.field5106 == 2 && var128 < class275.field4698) {
                                class226.field3718[var7++] = class127.field1912[var128];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 3611) {
                            if (class110.field1631 == null) {
                                class226.field3718[var7++] = class301.field5079;
                            } else {
                                class226.field3718[var7++] = class110.field1631.method30(-68);
                            }
                            continue;
                        }
                        if (var464 == 3612) {
                            if (class110.field1631 == null) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = class223.field3669;
                            }
                            continue;
                        }
                        if (var464 == 3613) {
                            var6--;
                            int var129 = class165.field2519[var6];
                            if (class110.field1631 != null && class223.field3669 > var129) {
                                class226.field3718[var7++] = class231.field3844[var129].field5078.method30(-121);
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 3614) {
                            var6--;
                            int var130 = class165.field2519[var6];
                            if (class110.field1631 != null && var130 < class223.field3669) {
                                class165.field2519[var6++] = class231.field3844[var130].field5071;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3615) {
                            var6--;
                            int var131 = class165.field2519[var6];
                            if (class110.field1631 != null && var131 < class223.field3669) {
                                class165.field2519[var6++] = class231.field3844[var131].field5068;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3616) {
                            class165.field2519[var6++] = class185.field2905;
                            continue;
                        }
                        if (var464 == 3617) {
                            var7--;
                            class5 var132 = class226.field3718[var7];
                            class10.method107(-13280, var132);
                            continue;
                        }
                        if (var464 == 3618) {
                            class165.field2519[var6++] = class86.field1297;
                            continue;
                        }
                        if (var464 == 3619) {
                            var7--;
                            class5 var133 = class226.field3718[var7];
                            class241.method1700(6, var133.method69(-49));
                            continue;
                        }
                        if (var464 == 3620) {
                            class33.method223(10);
                            continue;
                        }
                        if (var464 == 3621) {
                            if (class303.field5106 == 0) {
                                class165.field2519[var6++] = -1;
                            } else {
                                class165.field2519[var6++] = class100.field1484;
                            }
                            continue;
                        }
                        if (var464 == 3622) {
                            var6--;
                            int var134 = class165.field2519[var6];
                            if (class303.field5106 != 0 && class100.field1484 > var134) {
                                class226.field3718[var7++] = class245.method1719(class202.field3226[var134], (byte) -45).method30(-122);
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 3623) {
                            var7--;
                            class5 var135 = class226.field3718[var7];
                            if (var135.method75((byte) 50, class256.field4371) || var135.method75((byte) 125, class198.field3152)) {
                                var135 = var135.method78(-24938, 7);
                            }
                            class165.field2519[var6++] = class103.method656(var135, 32767) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3624) {
                            var6--;
                            int var136 = class165.field2519[var6];
                            if (class231.field3844 != null && var136 < class223.field3669 && class231.field3844[var136].field5078.method29(61, class151.field2183.field1367)) {
                                class165.field2519[var6++] = 1;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3625) {
                            if (class66.field1033 == null) {
                                class226.field3718[var7++] = class301.field5079;
                            } else {
                                class226.field3718[var7++] = class66.field1033.method30(-83);
                            }
                            continue;
                        }
                        if (var464 == 3626) {
                            var6--;
                            int var137 = class165.field2519[var6];
                            if (class110.field1631 != null && class223.field3669 > var137) {
                                class226.field3718[var7++] = class231.field3844[var137].field5087;
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 3627) {
                            var6--;
                            int var138 = class165.field2519[var6];
                            if (class303.field5106 == 2 && var138 >= 0 && class275.field4698 > var138) {
                                class165.field2519[var6++] = class33.field516[var138] ? 1 : 0;
                                continue;
                            }
                            class165.field2519[var6++] = 0;
                            continue;
                        }
                        if (var464 == 3628) {
                            var7--;
                            class5 var139 = class226.field3718[var7];
                            if (var139.method75((byte) 65, class256.field4371) || var139.method75((byte) 60, class198.field3152)) {
                                var139 = var139.method78(-24938, 7);
                            }
                            class165.field2519[var6++] = class280.method1898(var139, -112);
                            continue;
                        }
                    } else if (var464 < 4000) {
                        if (var464 == 3903) {
                            var6--;
                            int var394 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var394].method1994(2);
                            continue;
                        }
                        if (var464 == 3904) {
                            var6--;
                            int var395 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var395].field4980;
                            continue;
                        }
                        if (var464 == 3905) {
                            var6--;
                            int var396 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var396].field4978;
                            continue;
                        }
                        if (var464 == 3906) {
                            var6--;
                            int var397 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var397].field4974;
                            continue;
                        }
                        if (var464 == 3907) {
                            var6--;
                            int var398 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var398].field4985;
                            continue;
                        }
                        if (var464 == 3908) {
                            var6--;
                            int var399 = class165.field2519[var6];
                            class165.field2519[var6++] = field1243[var399].field4977;
                            continue;
                        }
                        if (var464 == 3910) {
                            var6--;
                            int var400 = class165.field2519[var6];
                            int var401 = field1243[var400].method1992(-19);
                            class165.field2519[var6++] = var401 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3911) {
                            var6--;
                            int var402 = class165.field2519[var6];
                            int var403 = field1243[var402].method1992(-28);
                            class165.field2519[var6++] = var403 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3912) {
                            var6--;
                            int var404 = class165.field2519[var6];
                            int var405 = field1243[var404].method1992(120);
                            class165.field2519[var6++] = var405 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 3913) {
                            var6--;
                            int var406 = class165.field2519[var6];
                            int var407 = field1243[var406].method1992(-92);
                            class165.field2519[var6++] = var407 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var464 < 4100) {
                        if (var464 == 4000) {
                            var6 -= 2;
                            int var349 = class165.field2519[var6 + 1];
                            int var350 = class165.field2519[var6];
                            class165.field2519[var6++] = var349 + var350;
                            continue;
                        }
                        if (var464 == 4001) {
                            var6 -= 2;
                            int var351 = class165.field2519[var6];
                            int var352 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var351 - var352;
                            continue;
                        }
                        if (var464 == 4002) {
                            var6 -= 2;
                            int var353 = class165.field2519[var6 + 1];
                            int var354 = class165.field2519[var6];
                            class165.field2519[var6++] = var353 * var354;
                            continue;
                        }
                        if (var464 == 4003) {
                            var6 -= 2;
                            int var355 = class165.field2519[var6];
                            int var356 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var355 / var356;
                            continue;
                        }
                        if (var464 == 4004) {
                            var6--;
                            int var357 = class165.field2519[var6];
                            class165.field2519[var6++] = (int) ((double) var357 * Math.random());
                            continue;
                        }
                        if (var464 == 4005) {
                            var6--;
                            int var358 = class165.field2519[var6];
                            class165.field2519[var6++] = (int) (Math.random() * (double) (var358 + 1));
                            continue;
                        }
                        if (var464 == 4006) {
                            var6 -= 5;
                            int var359 = class165.field2519[var6];
                            int var360 = class165.field2519[var6 + 1];
                            int var361 = class165.field2519[var6 + 2];
                            int var362 = class165.field2519[var6 + 4];
                            int var363 = class165.field2519[var6 + 3];
                            class165.field2519[var6++] = (var360 - var359) * (var362 - var361) / (var363 - var361) + var359;
                            continue;
                        }
                        if (var464 == 4007) {
                            var6 -= 2;
                            long var364 = (long) class165.field2519[var6];
                            long var366 = (long) class165.field2519[var6 + 1];
                            class165.field2519[var6++] = (int) (var364 * var366 / 100L + var364);
                            continue;
                        }
                        if (var464 == 4008) {
                            var6 -= 2;
                            int var368 = class165.field2519[var6];
                            int var369 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class264.method1820(0x1 << var369, var368);
                            continue;
                        }
                        if (var464 == 4009) {
                            var6 -= 2;
                            int var370 = class165.field2519[var6 + 1];
                            int var371 = class165.field2519[var6];
                            class165.field2519[var6++] = class204.method1354(-(0x1 << var370) - 1, var371);
                            continue;
                        }
                        if (var464 == 4010) {
                            var6 -= 2;
                            int var372 = class165.field2519[var6 + 1];
                            int var373 = class165.field2519[var6];
                            class165.field2519[var6++] = class204.method1354(var373, 0x1 << var372) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var464 == 4011) {
                            var6 -= 2;
                            int var374 = class165.field2519[var6];
                            int var375 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var374 % var375;
                            continue;
                        }
                        if (var464 == 4012) {
                            var6 -= 2;
                            int var376 = class165.field2519[var6];
                            int var377 = class165.field2519[var6 + 1];
                            if (var376 == 0) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = (int) Math.pow((double) var376, (double) var377);
                            }
                            continue;
                        }
                        if (var464 == 4013) {
                            var6 -= 2;
                            int var378 = class165.field2519[var6 + 1];
                            int var379 = class165.field2519[var6];
                            if (var379 == 0) {
                                class165.field2519[var6++] = 0;
                            } else if (var378 == 0) {
                                class165.field2519[var6++] = Integer.MAX_VALUE;
                            } else {
                                class165.field2519[var6++] = (int) Math.pow((double) var379, 1.0D / (double) var378);
                            }
                            continue;
                        }
                        if (var464 == 4014) {
                            var6 -= 2;
                            int var380 = class165.field2519[var6];
                            int var381 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = class204.method1354(var380, var381);
                            continue;
                        }
                        if (var464 == 4015) {
                            var6 -= 2;
                            int var382 = class165.field2519[var6 + 1];
                            int var383 = class165.field2519[var6];
                            class165.field2519[var6++] = class264.method1820(var382, var383);
                            continue;
                        }
                        if (var464 == 4016) {
                            var6 -= 2;
                            int var384 = class165.field2519[var6];
                            int var385 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var384 < var385 ? var384 : var385;
                            continue;
                        }
                        if (var464 == 4017) {
                            var6 -= 2;
                            int var386 = class165.field2519[var6];
                            int var387 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var386 > var387 ? var386 : var387;
                            continue;
                        }
                        if (var464 == 4018) {
                            var6 -= 3;
                            long var388 = (long) class165.field2519[var6];
                            long var390 = (long) class165.field2519[var6 + 2];
                            long var392 = (long) class165.field2519[var6 + 1];
                            class165.field2519[var6++] = (int) (var388 * var390 / var392);
                            continue;
                        }
                    } else if (var464 < 4200) {
                        if (var464 == 4100) {
                            var7--;
                            class5 var140 = class226.field3718[var7];
                            var6--;
                            int var141 = class165.field2519[var6];
                            class226.field3718[var7++] = class288.method1940((byte) 113, new class5[] { var140, class175.method1148(var141, !arg1) });
                            continue;
                        }
                        if (var464 == 4101) {
                            var7 -= 2;
                            class5 var142 = class226.field3718[var7];
                            class5 var143 = class226.field3718[var7 + 1];
                            class226.field3718[var7++] = class288.method1940((byte) 98, new class5[] { var142, var143 });
                            continue;
                        }
                        if (var464 == 4102) {
                            var7--;
                            class5 var144 = class226.field3718[var7];
                            var6--;
                            int var145 = class165.field2519[var6];
                            class226.field3718[var7++] = class288.method1940((byte) 108, new class5[] { var144, class288.method1948(var145, true, 10) });
                            continue;
                        }
                        if (var464 == 4103) {
                            var7--;
                            class5 var146 = class226.field3718[var7];
                            class226.field3718[var7++] = var146.method37(-105);
                            continue;
                        }
                        if (var464 == 4104) {
                            var6--;
                            int var147 = class165.field2519[var6];
                            long var148 = (long) var147 * 86400000L + 1014768000000L;
                            class236.field3901.setTime(new Date(var148));
                            int var150 = class236.field3901.get(5);
                            int var151 = class236.field3901.get(2);
                            int var152 = class236.field3901.get(1);
                            class226.field3718[var7++] = class288.method1940((byte) 86, new class5[] { class175.method1148(var150, false), class246.field4076, class262.field4468[var151], class246.field4076, class175.method1148(var152, false) });
                            continue;
                        }
                        if (var464 == 4105) {
                            var7 -= 2;
                            class5 var153 = class226.field3718[var7];
                            class5 var154 = class226.field3718[var7 + 1];
                            if (class151.field2183.field1369 != null && class151.field2183.field1369.field1891) {
                                class226.field3718[var7++] = var154;
                                continue;
                            }
                            class226.field3718[var7++] = var153;
                            continue;
                        }
                        if (var464 == 4106) {
                            var6--;
                            int var155 = class165.field2519[var6];
                            class226.field3718[var7++] = class175.method1148(var155, false);
                            continue;
                        }
                        if (var464 == 4107) {
                            var7 -= 2;
                            class165.field2519[var6++] = class226.field3718[var7].method70(31, class226.field3718[var7 + 1]);
                            continue;
                        }
                        if (var464 == 4108) {
                            var6 -= 2;
                            var7--;
                            class5 var156 = class226.field3718[var7];
                            int var157 = class165.field2519[var6 + 1];
                            int var158 = class165.field2519[var6];
                            byte[] var159 = class286.field4830.method1342(94, var157, 0);
                            class82 var160 = new class82(var159);
                            var160.method2034(class20.field343, (int[]) null);
                            class165.field2519[var6++] = var160.method2024(var156, var158);
                            continue;
                        }
                        if (var464 == 4109) {
                            var6 -= 2;
                            int var161 = class165.field2519[var6];
                            int var162 = class165.field2519[var6 + 1];
                            var7--;
                            class5 var163 = class226.field3718[var7];
                            byte[] var164 = class286.field4830.method1342(-81, var162, 0);
                            class82 var165 = new class82(var164);
                            var165.method2034(class20.field343, (int[]) null);
                            class165.field2519[var6++] = var165.method2016(var163, var161);
                            continue;
                        }
                        if (var464 == 4110) {
                            var7 -= 2;
                            class5 var166 = class226.field3718[var7];
                            class5 var167 = class226.field3718[var7 + 1];
                            var6--;
                            if (class165.field2519[var6] == 1) {
                                class226.field3718[var7++] = var166;
                            } else {
                                class226.field3718[var7++] = var167;
                            }
                            continue;
                        }
                        if (var464 == 4111) {
                            var7--;
                            class5 var168 = class226.field3718[var7];
                            class226.field3718[var7++] = class299.method2030(var168);
                            continue;
                        }
                        if (var464 == 4112) {
                            var7--;
                            class5 var169 = class226.field3718[var7];
                            var6--;
                            int var170 = class165.field2519[var6];
                            if (var170 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class226.field3718[var7++] = var169.method77(64, var170);
                            continue;
                        }
                        if (var464 == 4113) {
                            var6--;
                            int var171 = class165.field2519[var6];
                            class165.field2519[var6++] = client.method772(var171, 2) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4114) {
                            var6--;
                            int var172 = class165.field2519[var6];
                            class165.field2519[var6++] = class93.method610(var172, -82) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4115) {
                            var6--;
                            int var173 = class165.field2519[var6];
                            class165.field2519[var6++] = class252.method1760(var173, (byte) 125) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4116) {
                            var6--;
                            int var174 = class165.field2519[var6];
                            class165.field2519[var6++] = class289.method1953(var174, -49) ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4117) {
                            var7--;
                            class5 var175 = class226.field3718[var7];
                            if (var175 == null) {
                                class165.field2519[var6++] = 0;
                            } else {
                                class165.field2519[var6++] = var175.method36(30673);
                            }
                            continue;
                        }
                        if (var464 == 4118) {
                            var7--;
                            class5 var176 = class226.field3718[var7];
                            var6 -= 2;
                            int var177 = class165.field2519[var6 + 1];
                            int var178 = class165.field2519[var6];
                            class226.field3718[var7++] = var176.method76(0, var178, var177);
                            continue;
                        }
                        if (var464 == 4119) {
                            var7--;
                            class5 var179 = class226.field3718[var7];
                            class5 var180 = class230.method1637(-9, var179.method36(30673));
                            boolean var181 = false;
                            for (int var182 = 0; var179.method36(30673) > var182; var182++) {
                                int var183 = var179.method65((byte) 97, var182);
                                if (var183 == 60) {
                                    var181 = true;
                                } else if (var183 == 62) {
                                    var181 = false;
                                } else if (!var181) {
                                    var180.method35(var183, 92);
                                }
                            }
                            var180.method45(-11069);
                            class226.field3718[var7++] = var180;
                            continue;
                        }
                        if (var464 == 4120) {
                            var7--;
                            class5 var184 = class226.field3718[var7];
                            var6 -= 2;
                            int var185 = class165.field2519[var6];
                            int var186 = class165.field2519[var6 + 1];
                            class165.field2519[var6++] = var184.method41(32494, var185, var186);
                            continue;
                        }
                        if (var464 == 4121) {
                            var7 -= 2;
                            class5 var187 = class226.field3718[var7];
                            class5 var188 = class226.field3718[var7 + 1];
                            var6--;
                            int var189 = class165.field2519[var6];
                            class165.field2519[var6++] = var187.method32(var188, (byte) -127, var189);
                            continue;
                        }
                        if (var464 == 4122) {
                            var6--;
                            int var190 = class165.field2519[var6];
                            class165.field2519[var6++] = class168.method1116(var190, 0);
                            continue;
                        }
                        if (var464 == 4123) {
                            var6--;
                            int var191 = class165.field2519[var6];
                            class165.field2519[var6++] = class251.method1751(-15117, var191);
                            continue;
                        }
                    } else if (var464 < 4300) {
                        if (var464 == 4200) {
                            var6--;
                            int var192 = class165.field2519[var6];
                            class226.field3718[var7++] = class235.method1664(79, var192).field3062;
                            continue;
                        }
                        if (var464 == 4201) {
                            var6 -= 2;
                            int var193 = class165.field2519[var6];
                            int var194 = class165.field2519[var6 + 1];
                            class196 var195 = class235.method1664(82, var193);
                            if (var194 >= 1 && var194 <= 5 && var195.field3118[var194 - 1] != null) {
                                class226.field3718[var7++] = var195.field3118[var194 - 1];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 4202) {
                            var6 -= 2;
                            int var196 = class165.field2519[var6 + 1];
                            int var197 = class165.field2519[var6];
                            class196 var198 = class235.method1664(125, var197);
                            if (var196 >= 1 && var196 <= 5 && var198.field3072[var196 - 1] != null) {
                                class226.field3718[var7++] = var198.field3072[var196 - 1];
                                continue;
                            }
                            class226.field3718[var7++] = class301.field5079;
                            continue;
                        }
                        if (var464 == 4203) {
                            var6--;
                            int var199 = class165.field2519[var6];
                            class165.field2519[var6++] = class235.method1664(123, var199).field3102;
                            continue;
                        }
                        if (var464 == 4204) {
                            var6--;
                            int var200 = class165.field2519[var6];
                            class165.field2519[var6++] = class235.method1664(110, var200).field3109 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4205) {
                            var6--;
                            int var201 = class165.field2519[var6];
                            class196 var202 = class235.method1664(115, var201);
                            if (var202.field3080 == -1 && var202.field3078 >= 0) {
                                class165.field2519[var6++] = var202.field3078;
                                continue;
                            }
                            class165.field2519[var6++] = var201;
                            continue;
                        }
                        if (var464 == 4206) {
                            var6--;
                            int var203 = class165.field2519[var6];
                            class196 var204 = class235.method1664(100, var203);
                            if (var204.field3080 >= 0 && var204.field3078 >= 0) {
                                class165.field2519[var6++] = var204.field3078;
                                continue;
                            }
                            class165.field2519[var6++] = var203;
                            continue;
                        }
                        if (var464 == 4207) {
                            var6--;
                            int var205 = class165.field2519[var6];
                            class165.field2519[var6++] = class235.method1664(81, var205).field3098 ? 1 : 0;
                            continue;
                        }
                        if (var464 == 4208) {
                            var6 -= 2;
                            int var206 = class165.field2519[var6];
                            int var207 = class165.field2519[var6 + 1];
                            class18 var208 = class39.method281(83, var207);
                            if (var208.method152(123)) {
                                class226.field3718[var7++] = class235.method1664(127, var206).method1300(-111, var208.field305, var207);
                            } else {
                                class165.field2519[var6++] = class235.method1664(97, var206).method1296((byte) 40, var208.field318, var207);
                            }
                            continue;
                        }
                        if (var464 == 4210) {
                            var6--;
                            int var209 = class165.field2519[var6];
                            var7--;
                            class5 var210 = class226.field3718[var7];
                            class70.method502(var210, var209 == 1, -108);
                            class165.field2519[var6++] = class55.field864;
                            continue;
                        }
                        if (var464 == 4211) {
                            if (class284.field4814 != null && class55.field864 > class46.field693) {
                                class165.field2519[var6++] = class204.method1354(65535, class284.field4814[class46.field693++]);
                                continue;
                            }
                            class165.field2519[var6++] = -1;
                            continue;
                        }
                        if (var464 == 4212) {
                            class46.field693 = 0;
                            continue;
                        }
                    } else if (var464 >= 4400) {
                        if (var464 < 4500) {
                            if (var464 == 4400) {
                                var6 -= 2;
                                int var211 = class165.field2519[var6 + 1];
                                int var212 = class165.field2519[var6];
                                class18 var213 = class39.method281(121, var211);
                                if (var213.method152(123)) {
                                    class226.field3718[var7++] = class77.method536(var212, 122).method1211((byte) -24, var211, var213.field305);
                                } else {
                                    class165.field2519[var6++] = class77.method536(var212, 122).method1225(72, var211, var213.field318);
                                }
                                continue;
                            }
                        } else if (var464 >= 4600) {
                            if (var464 < 5100) {
                                if (var464 == 5000) {
                                    class165.field2519[var6++] = class107.field1594;
                                    continue;
                                }
                                if (var464 == 5001) {
                                    class236.field3903++;
                                    var6 -= 3;
                                    class107.field1594 = class165.field2519[var6];
                                    class156.field2317 = class165.field2519[var6 + 1];
                                    class171.field2627 = class165.field2519[var6 + 2];
                                    class147.field2127.method1389((byte) -119, 60);
                                    class147.field2127.method1542(-80, class107.field1594);
                                    class147.field2127.method1542(-83, class156.field2317);
                                    class147.field2127.method1542(-75, class171.field2627);
                                    continue;
                                }
                                if (var464 == 5002) {
                                    var6 -= 2;
                                    class158.field2375++;
                                    int var280 = class165.field2519[var6];
                                    var7--;
                                    class5 var281 = class226.field3718[var7];
                                    int var282 = class165.field2519[var6 + 1];
                                    class147.field2127.method1389((byte) 116, 108);
                                    class147.field2127.method1548(false, var281.method69(-49));
                                    class147.field2127.method1542(-83, var280 - 1);
                                    class147.field2127.method1542(-83, var282);
                                    continue;
                                }
                                if (var464 == 5003) {
                                    var6--;
                                    int var283 = class165.field2519[var6];
                                    class5 var284 = null;
                                    if (var283 < 100) {
                                        var284 = class212.field3378[var283];
                                    }
                                    if (var284 == null) {
                                        var284 = class301.field5079;
                                    }
                                    class226.field3718[var7++] = var284;
                                    continue;
                                }
                                if (var464 == 5004) {
                                    var6--;
                                    int var285 = class165.field2519[var6];
                                    int var286 = -1;
                                    if (var285 < 100 && class212.field3378[var285] != null) {
                                        var286 = class198.field3170[var285];
                                    }
                                    class165.field2519[var6++] = var286;
                                    continue;
                                }
                                if (var464 == 5005) {
                                    class165.field2519[var6++] = class156.field2317;
                                    continue;
                                }
                                if (var464 == 5008) {
                                    var7--;
                                    class5 var287 = class226.field3718[var7];
                                    if (!var287.method75((byte) 126, class226.field3717)) {
                                        if (class1.field3 == 0 && (class57.field902 == 1 || class123.field1865 == 1)) {
                                            continue;
                                        }
                                        class118.field1793++;
                                        class5 var288 = var287.method37(-65);
                                        byte var289 = 0;
                                        byte var290 = 0;
                                        if (var288.method75((byte) 8, class166.field2533)) {
                                            var290 = 0;
                                            var287 = var287.method78(-24938, class166.field2533.method36(30673));
                                        } else if (var288.method75((byte) 125, class20.field339)) {
                                            var290 = 1;
                                            var287 = var287.method78(-24938, class20.field339.method36(30673));
                                        } else if (var288.method75((byte) 100, class119.field1809)) {
                                            var287 = var287.method78(-24938, class119.field1809.method36(30673));
                                            var290 = 2;
                                        } else if (var288.method75((byte) 103, class115.field1718)) {
                                            var290 = 3;
                                            var287 = var287.method78(-24938, class115.field1718.method36(30673));
                                        } else if (var288.method75((byte) 125, class214.field3399)) {
                                            var290 = 4;
                                            var287 = var287.method78(-24938, class214.field3399.method36(30673));
                                        } else if (var288.method75((byte) 106, class176.field2692)) {
                                            var290 = 5;
                                            var287 = var287.method78(-24938, class176.field2692.method36(30673));
                                        } else if (var288.method75((byte) 36, class264.field4509)) {
                                            var290 = 6;
                                            var287 = var287.method78(-24938, class264.field4509.method36(30673));
                                        } else if (var288.method75((byte) 16, class190.field2968)) {
                                            var287 = var287.method78(-24938, class190.field2968.method36(30673));
                                            var290 = 7;
                                        } else if (var288.method75((byte) 24, class47.field730)) {
                                            var287 = var287.method78(-24938, class47.field730.method36(30673));
                                            var290 = 8;
                                        } else if (var288.method75((byte) 117, class175.field2676)) {
                                            var290 = 9;
                                            var287 = var287.method78(-24938, class175.field2676.method36(30673));
                                        } else if (var288.method75((byte) 19, class152.field2214)) {
                                            var287 = var287.method78(-24938, class152.field2214.method36(30673));
                                            var290 = 10;
                                        } else if (var288.method75((byte) 116, class105.field1557)) {
                                            var290 = 11;
                                            var287 = var287.method78(-24938, class105.field1557.method36(30673));
                                        } else if (class211.field3361 != 0) {
                                            if (var288.method75((byte) 109, class166.field2534)) {
                                                var290 = 0;
                                                var287 = var287.method78(-24938, class166.field2534.method36(30673));
                                            } else if (var288.method75((byte) 126, class20.field337)) {
                                                var287 = var287.method78(-24938, class20.field337.method36(30673));
                                                var290 = 1;
                                            } else if (var288.method75((byte) 77, class119.field1805)) {
                                                var290 = 2;
                                                var287 = var287.method78(-24938, class119.field1805.method36(30673));
                                            } else if (var288.method75((byte) 25, class115.field1720)) {
                                                var287 = var287.method78(-24938, class115.field1720.method36(30673));
                                                var290 = 3;
                                            } else if (var288.method75((byte) 78, class214.field3397)) {
                                                var287 = var287.method78(-24938, class214.field3397.method36(30673));
                                                var290 = 4;
                                            } else if (var288.method75((byte) 43, class176.field2688)) {
                                                var290 = 5;
                                                var287 = var287.method78(-24938, class176.field2688.method36(30673));
                                            } else if (var288.method75((byte) 33, class264.field4490)) {
                                                var290 = 6;
                                                var287 = var287.method78(-24938, class264.field4490.method36(30673));
                                            } else if (var288.method75((byte) 22, class190.field2967)) {
                                                var290 = 7;
                                                var287 = var287.method78(-24938, class190.field2967.method36(30673));
                                            } else if (var288.method75((byte) 93, class47.field718)) {
                                                var290 = 8;
                                                var287 = var287.method78(-24938, class47.field718.method36(30673));
                                            } else if (var288.method75((byte) 127, class175.field2672)) {
                                                var290 = 9;
                                                var287 = var287.method78(-24938, class175.field2672.method36(30673));
                                            } else if (var288.method75((byte) 106, class152.field2217)) {
                                                var290 = 10;
                                                var287 = var287.method78(-24938, class152.field2217.method36(30673));
                                            } else if (var288.method75((byte) 125, class105.field1565)) {
                                                var287 = var287.method78(-24938, class105.field1565.method36(30673));
                                                var290 = 11;
                                            }
                                        }
                                        class5 var291 = var287.method37(-107);
                                        if (var291.method75((byte) 89, class24.field419)) {
                                            var287 = var287.method78(-24938, class24.field419.method36(30673));
                                            var289 = 1;
                                        } else if (var291.method75((byte) 124, class60.field929)) {
                                            var289 = 2;
                                            var287 = var287.method78(-24938, class60.field929.method36(30673));
                                        } else if (var291.method75((byte) 72, class116.field1727)) {
                                            var289 = 3;
                                            var287 = var287.method78(-24938, class116.field1727.method36(30673));
                                        } else if (var291.method75((byte) 45, class219.field3547)) {
                                            var287 = var287.method78(-24938, class219.field3547.method36(30673));
                                            var289 = 4;
                                        } else if (var291.method75((byte) 37, class301.field5085)) {
                                            var289 = 5;
                                            var287 = var287.method78(-24938, class301.field5085.method36(30673));
                                        } else if (class211.field3361 != 0) {
                                            if (var291.method75((byte) 10, class24.field418)) {
                                                var289 = 1;
                                                var287 = var287.method78(-24938, class24.field418.method36(30673));
                                            } else if (var291.method75((byte) 23, class60.field927)) {
                                                var287 = var287.method78(-24938, class60.field927.method36(30673));
                                                var289 = 2;
                                            } else if (var291.method75((byte) 104, class116.field1723)) {
                                                var287 = var287.method78(-24938, class116.field1723.method36(30673));
                                                var289 = 3;
                                            } else if (var291.method75((byte) 45, class219.field3544)) {
                                                var287 = var287.method78(-24938, class219.field3544.method36(30673));
                                                var289 = 4;
                                            } else if (var291.method75((byte) 122, class301.field5080)) {
                                                var289 = 5;
                                                var287 = var287.method78(-24938, class301.field5080.method36(30673));
                                            }
                                        }
                                        class147.field2127.method1389((byte) 103, 142);
                                        class147.field2127.method1542(-91, 0);
                                        int var292 = class147.field2127.field3610;
                                        class147.field2127.method1542(-114, var290);
                                        class147.field2127.method1542(-101, var289);
                                        class89.method586(57, class147.field2127, var287);
                                        class147.field2127.method1546(class147.field2127.field3610 - var292, -13204);
                                        continue;
                                    }
                                    class52.method396((byte) -96, var287);
                                    continue;
                                }
                                if (var464 == 5009) {
                                    var7 -= 2;
                                    class5 var293 = class226.field3718[var7];
                                    class5 var294 = class226.field3718[var7 + 1];
                                    if (class1.field3 != 0 || class57.field902 != 1 && class123.field1865 != 1) {
                                        class142.field2090++;
                                        class147.field2127.method1389((byte) 95, 134);
                                        class147.field2127.method1542(-109, 0);
                                        int var295 = class147.field2127.field3610;
                                        class147.field2127.method1548(!arg1, var293.method69(-49));
                                        class89.method586(-122, class147.field2127, var294);
                                        class147.field2127.method1546(class147.field2127.field3610 - var295, -13204);
                                    }
                                    continue;
                                }
                                if (var464 == 5010) {
                                    var6--;
                                    int var296 = class165.field2519[var6];
                                    class5 var297 = null;
                                    if (var296 < 100) {
                                        var297 = class131.field1967[var296];
                                    }
                                    if (var297 == null) {
                                        var297 = class301.field5079;
                                    }
                                    class226.field3718[var7++] = var297;
                                    continue;
                                }
                                if (var464 == 5011) {
                                    var6--;
                                    int var298 = class165.field2519[var6];
                                    class5 var299 = null;
                                    if (var298 < 100) {
                                        var299 = class41.field616[var298];
                                    }
                                    if (var299 == null) {
                                        var299 = class301.field5079;
                                    }
                                    class226.field3718[var7++] = var299;
                                    continue;
                                }
                                if (var464 == 5012) {
                                    var6--;
                                    int var300 = class165.field2519[var6];
                                    int var301 = -1;
                                    if (var300 < 100) {
                                        var301 = class112.field1664[var300];
                                    }
                                    class165.field2519[var6++] = var301;
                                    continue;
                                }
                                if (var464 == 5015) {
                                    class5 var302;
                                    if (class151.field2183 == null || class151.field2183.field1367 == null) {
                                        var302 = class250.field4144;
                                    } else {
                                        var302 = class151.field2183.method596((byte) -126);
                                    }
                                    class226.field3718[var7++] = var302;
                                    continue;
                                }
                                if (var464 == 5016) {
                                    class165.field2519[var6++] = class171.field2627;
                                    continue;
                                }
                                if (var464 == 5017) {
                                    class165.field2519[var6++] = class210.field3354;
                                    continue;
                                }
                                if (var464 == 5050) {
                                    var6--;
                                    int var303 = class165.field2519[var6];
                                    class226.field3718[var7++] = class272.method1862(var303, 0).field132;
                                    continue;
                                }
                                if (var464 == 5051) {
                                    var6--;
                                    int var304 = class165.field2519[var6];
                                    class8 var305 = class272.method1862(var304, 0);
                                    if (var305.field119 == null) {
                                        class165.field2519[var6++] = 0;
                                    } else {
                                        class165.field2519[var6++] = var305.field119.length;
                                    }
                                    continue;
                                }
                                if (var464 == 5052) {
                                    var6 -= 2;
                                    int var306 = class165.field2519[var6];
                                    int var307 = class165.field2519[var6 + 1];
                                    class8 var308 = class272.method1862(var306, 0);
                                    int var309 = var308.field119[var307];
                                    class165.field2519[var6++] = var309;
                                    continue;
                                }
                                if (var464 == 5053) {
                                    var6--;
                                    int var310 = class165.field2519[var6];
                                    class8 var311 = class272.method1862(var310, 0);
                                    if (var311.field125 == null) {
                                        class165.field2519[var6++] = 0;
                                    } else {
                                        class165.field2519[var6++] = var311.field125.length;
                                    }
                                    continue;
                                }
                                if (var464 == 5054) {
                                    var6 -= 2;
                                    int var312 = class165.field2519[var6 + 1];
                                    int var313 = class165.field2519[var6];
                                    class165.field2519[var6++] = class272.method1862(var313, 0).field125[var312];
                                    continue;
                                }
                                if (var464 == 5055) {
                                    var6--;
                                    int var314 = class165.field2519[var6];
                                    class226.field3718[var7++] = class91.method600(-56, var314).method1648(-70);
                                    continue;
                                }
                                if (var464 == 5056) {
                                    var6--;
                                    int var315 = class165.field2519[var6];
                                    class232 var316 = class91.method600(-94, var315);
                                    if (var316.field3850 == null) {
                                        class165.field2519[var6++] = 0;
                                    } else {
                                        class165.field2519[var6++] = var316.field3850.length;
                                    }
                                    continue;
                                }
                                if (var464 == 5057) {
                                    var6 -= 2;
                                    int var317 = class165.field2519[var6 + 1];
                                    int var318 = class165.field2519[var6];
                                    class165.field2519[var6++] = class91.method600(122, var318).field3850[var317];
                                    continue;
                                }
                                if (var464 == 5058) {
                                    class35.field551 = new class175();
                                    var6--;
                                    class35.field551.field2681 = class165.field2519[var6];
                                    class35.field551.field2667 = class91.method600(50, class35.field551.field2681);
                                    class35.field551.field2679 = new int[class35.field551.field2667.method1647((byte) 112)];
                                    continue;
                                }
                                if (var464 == 5059) {
                                    class271.field4640++;
                                    class147.field2127.method1389((byte) -59, 13);
                                    class147.field2127.method1542(-122, 0);
                                    int var319 = class147.field2127.field3610;
                                    class147.field2127.method1542(-124, 0);
                                    class147.field2127.method1539(class35.field551.field2681, false);
                                    class35.field551.field2667.method1659(0, class35.field551.field2679, class147.field2127);
                                    class147.field2127.method1546(class147.field2127.field3610 - var319, -13204);
                                    continue;
                                }
                                if (var464 == 5060) {
                                    class52.field829++;
                                    var7--;
                                    class5 var320 = class226.field3718[var7];
                                    class147.field2127.method1389((byte) -11, 242);
                                    class147.field2127.method1542(-109, 0);
                                    int var321 = class147.field2127.field3610;
                                    class147.field2127.method1548(false, var320.method69(-49));
                                    class147.field2127.method1539(class35.field551.field2681, false);
                                    class35.field551.field2667.method1659(0, class35.field551.field2679, class147.field2127);
                                    class147.field2127.method1546(class147.field2127.field3610 - var321, -13204);
                                    continue;
                                }
                                if (var464 == 5061) {
                                    class271.field4640++;
                                    class147.field2127.method1389((byte) 111, 13);
                                    class147.field2127.method1542(-96, 0);
                                    int var322 = class147.field2127.field3610;
                                    class147.field2127.method1542(-84, 1);
                                    class147.field2127.method1539(class35.field551.field2681, !arg1);
                                    class35.field551.field2667.method1659(0, class35.field551.field2679, class147.field2127);
                                    class147.field2127.method1546(class147.field2127.field3610 - var322, -13204);
                                    continue;
                                }
                                if (var464 == 5062) {
                                    var6 -= 2;
                                    int var323 = class165.field2519[var6];
                                    int var324 = class165.field2519[var6 + 1];
                                    class165.field2519[var6++] = class272.method1862(var323, 0).field131[var324];
                                    continue;
                                }
                                if (var464 == 5063) {
                                    var6 -= 2;
                                    int var325 = class165.field2519[var6];
                                    int var326 = class165.field2519[var6 + 1];
                                    class165.field2519[var6++] = class272.method1862(var325, 0).field126[var326];
                                    continue;
                                }
                                if (var464 == 5064) {
                                    var6 -= 2;
                                    int var327 = class165.field2519[var6 + 1];
                                    int var328 = class165.field2519[var6];
                                    if (var327 == -1) {
                                        class165.field2519[var6++] = -1;
                                    } else {
                                        class165.field2519[var6++] = class272.method1862(var328, 0).method96(var327, (byte) 124);
                                    }
                                    continue;
                                }
                                if (var464 == 5065) {
                                    var6 -= 2;
                                    int var329 = class165.field2519[var6];
                                    int var330 = class165.field2519[var6 + 1];
                                    if (var330 == -1) {
                                        class165.field2519[var6++] = -1;
                                    } else {
                                        class165.field2519[var6++] = class272.method1862(var329, 0).method91(var330, true);
                                    }
                                    continue;
                                }
                                if (var464 == 5066) {
                                    var6--;
                                    int var331 = class165.field2519[var6];
                                    class165.field2519[var6++] = class91.method600(57, var331).method1647((byte) 126);
                                    continue;
                                }
                                if (var464 == 5067) {
                                    var6 -= 2;
                                    int var332 = class165.field2519[var6];
                                    int var333 = class165.field2519[var6 + 1];
                                    int var334 = class91.method600(-33, var332).method1658(var333, !arg1);
                                    class165.field2519[var6++] = var334;
                                    continue;
                                }
                                if (var464 == 5068) {
                                    var6 -= 2;
                                    int var335 = class165.field2519[var6];
                                    int var336 = class165.field2519[var6 + 1];
                                    class35.field551.field2679[var335] = var336;
                                    continue;
                                }
                                if (var464 == 5069) {
                                    var6 -= 2;
                                    int var337 = class165.field2519[var6 + 1];
                                    int var338 = class165.field2519[var6];
                                    class35.field551.field2679[var338] = var337;
                                    continue;
                                }
                                if (var464 == 5070) {
                                    var6 -= 3;
                                    int var339 = class165.field2519[var6];
                                    int var340 = class165.field2519[var6 + 1];
                                    int var341 = class165.field2519[var6 + 2];
                                    class232 var342 = class91.method600(-64, var339);
                                    if (var342.method1658(var340, !arg1) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class165.field2519[var6++] = var342.method1652(var341, (byte) -14, var340);
                                    continue;
                                }
                            } else if (var464 < 5200) {
                                if (var464 == 5100) {
                                    if (class234.field3872[86]) {
                                        class165.field2519[var6++] = 1;
                                    } else {
                                        class165.field2519[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var464 == 5101) {
                                    if (class234.field3872[82]) {
                                        class165.field2519[var6++] = 1;
                                    } else {
                                        class165.field2519[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var464 == 5102) {
                                    if (class234.field3872[81]) {
                                        class165.field2519[var6++] = 1;
                                    } else {
                                        class165.field2519[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var464 < 5300) {
                                if (var464 == 5200) {
                                    var6--;
                                    class23.method182(-94, class165.field2519[var6]);
                                    continue;
                                }
                                if (var464 == 5201) {
                                    class165.field2519[var6++] = class231.method1645((byte) -33);
                                    continue;
                                }
                                if (var464 == 5202) {
                                    var6--;
                                    class118.method795(0, class165.field2519[var6]);
                                    continue;
                                }
                                if (var464 == 5203) {
                                    var7--;
                                    class107.method674(arg1, class226.field3718[var7]);
                                    continue;
                                }
                                if (var464 == 5204) {
                                    class226.field3718[var7 - 1] = class16.method144(-1, class226.field3718[var7 - 1]);
                                    continue;
                                }
                                if (var464 == 5205) {
                                    var7--;
                                    class180.method1170(class226.field3718[var7], 1387280673);
                                    continue;
                                }
                                if (var464 == 5206) {
                                    var6--;
                                    int var214 = class165.field2519[var6];
                                    class100 var215 = class297.method1999(15316, var214 & 0x3FFF, var214 >> 14 & 0x3FFF);
                                    if (var215 == null) {
                                        class226.field3718[var7++] = class301.field5079;
                                    } else {
                                        class226.field3718[var7++] = var215.field1486;
                                    }
                                    continue;
                                }
                                if (var464 == 5207) {
                                    var7--;
                                    class100 var216 = class234.method1663(-7643, class226.field3718[var7]);
                                    if (var216 != null && var216.field1500 != null) {
                                        class226.field3718[var7++] = var216.field1500;
                                        continue;
                                    }
                                    class226.field3718[var7++] = class301.field5079;
                                    continue;
                                }
                            } else if (var464 < 5400) {
                                if (var464 == 5300) {
                                    var6 -= 2;
                                    int var217 = class165.field2519[var6];
                                    int var218 = class165.field2519[var6 + 1];
                                    if (class207.field3291 != null) {
                                        class278.method1890(68);
                                    }
                                    class70.method506(var217, var218, -67);
                                    class165.field2519[var6++] = class207.field3291 == null ? 0 : 1;
                                    continue;
                                }
                                if (var464 == 5301) {
                                    if (class207.field3291 != null) {
                                        class278.method1890(101);
                                    }
                                    continue;
                                }
                                if (var464 == 5302) {
                                    class129[] var219 = class74.method528(90);
                                    class165.field2519[var6++] = var219.length;
                                    continue;
                                }
                                if (var464 == 5303) {
                                    var6--;
                                    int var220 = class165.field2519[var6];
                                    class129[] var221 = class74.method528(80);
                                    class165.field2519[var6++] = var221[var220].field1935;
                                    class165.field2519[var6++] = var221[var220].field1939;
                                    continue;
                                }
                                if (var464 == 5305) {
                                    int var222 = class73.field1151;
                                    int var223 = -1;
                                    int var224 = class21.field346;
                                    class129[] var225 = class74.method528(119);
                                    for (int var226 = 0; var226 < var225.length; var226++) {
                                        class129 var227 = var225[var226];
                                        if (var227.field1935 == var222 && var227.field1939 == var224) {
                                            var223 = var226;
                                            break;
                                        }
                                    }
                                    class165.field2519[var6++] = var223;
                                    continue;
                                }
                                if (var464 == 5306) {
                                    class165.field2519[var6++] = class262.method1812(-126);
                                    continue;
                                }
                            } else if (var464 < 5500) {
                                if (var464 == 5400) {
                                    class265.field4534++;
                                    var6--;
                                    int var228 = class165.field2519[var6];
                                    var7 -= 2;
                                    class5 var229 = class226.field3718[var7];
                                    class5 var230 = class226.field3718[var7 + 1];
                                    class147.field2127.method1389((byte) -113, 215);
                                    class147.field2127.method1542(-120, class190.method1246(false, var229) + class190.method1246(!arg1, var230) + 1);
                                    class147.field2127.method1522(var229, (byte) -105);
                                    class147.field2127.method1522(var230, (byte) 127);
                                    class147.field2127.method1542(-114, var228);
                                    continue;
                                }
                                if (var464 == 5401) {
                                    var6 -= 2;
                                    class115.field1714[class165.field2519[var6]] = (short) class72.method513((byte) -8, class165.field2519[var6 + 1]);
                                    class260.method1805(-10000001);
                                    class260.method1804(-69);
                                    class281.method1900(-1);
                                    class117.method787((byte) 119);
                                    class193.method1267((byte) -66);
                                    continue;
                                }
                                if (var464 == 5405) {
                                    var6 -= 2;
                                    int var231 = class165.field2519[var6 + 1];
                                    int var232 = class165.field2519[var6];
                                    if (var232 >= 0 && var232 < 2) {
                                        class249.field4124[var232] = new int[var231 << 1][4];
                                    }
                                    continue;
                                }
                                if (var464 == 5406) {
                                    var6 -= 7;
                                    int var233 = class165.field2519[var6];
                                    int var234 = class165.field2519[var6 + 2];
                                    int var235 = class165.field2519[var6 + 1] << 1;
                                    int var236 = class165.field2519[var6 + 3];
                                    int var237 = class165.field2519[var6 + 4];
                                    int var238 = class165.field2519[var6 + 5];
                                    int var239 = class165.field2519[var6 + 6];
                                    if (var233 >= 0 && var233 < 2 && class249.field4124[var233] != null && var235 >= 0 && class249.field4124[var233].length > var235) {
                                        class249.field4124[var233][var235] = new int[] { (class204.method1354(268434144, var234) >> 14) * 128, var236, class204.method1354(var234, 16383) * 128, var239 };
                                        class249.field4124[var233][var235 + 1] = new int[] { (class204.method1354(var237, 268427856) >> 14) * 128, var238, class204.method1354(16383, var237) * 128 };
                                    }
                                    continue;
                                }
                                if (var464 == 5407) {
                                    var6--;
                                    int var240 = class249.field4124[class165.field2519[var6]].length >> 1;
                                    class165.field2519[var6++] = var240;
                                    continue;
                                }
                                if (var464 == 5408) {
                                    class165.field2519[var6++] = 1;
                                    continue;
                                }
                                if (var464 == 5409) {
                                    class193.method1266(true);
                                    continue;
                                }
                                if (var464 == 5411) {
                                    if (class207.field3291 != null) {
                                        class278.method1890(97);
                                    }
                                    if (class81.field1263 == null) {
                                        class31.method215(class240.method1698((byte) 96), (byte) 76, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var464 == 5419) {
                                    class5 var241 = class301.field5079;
                                    if (class197.field3137 != null) {
                                        var241 = class153.method967(-119, class197.field3137.field498);
                                        try {
                                            if (class197.field3137.field496 != null) {
                                                byte[] var242 = ((String) class197.field3137.field496).getBytes("ISO-8859-1");
                                                var241 = class101.method645(var242, true, 0, var242.length);
                                            }
                                        } catch (UnsupportedEncodingException var462) {
                                        }
                                    }
                                    class226.field3718[var7++] = var241;
                                    continue;
                                }
                                if (var464 == 5420) {
                                    class165.field2519[var6++] = class21.field366 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 5421) {
                                    if (class207.field3291 != null) {
                                        class278.method1890(92);
                                    }
                                    var6--;
                                    boolean var244 = class165.field2519[var6] == 1;
                                    var7--;
                                    class5 var245 = class226.field3718[var7];
                                    class31.method215(class288.method1940((byte) 64, new class5[] { class240.method1698((byte) 30), var245 }), (byte) 103, var244);
                                    continue;
                                }
                                if (var464 == 5422) {
                                    var7 -= 2;
                                    class5 var246 = class226.field3718[var7];
                                    var6--;
                                    int var247 = class165.field2519[var6];
                                    class5 var248 = class226.field3718[var7 + 1];
                                    if (var246.method36(30673) > 0) {
                                        if (class89.field1328 == null) {
                                            class89.field1328 = new class5[class106.field1583[class275.field4690]];
                                        }
                                        class89.field1328[var247] = var246;
                                    }
                                    if (var248.method36(30673) > 0) {
                                        if (class186.field2933 == null) {
                                            class186.field2933 = new class5[class106.field1583[class275.field4690]];
                                        }
                                        class186.field2933[var247] = var248;
                                    }
                                    continue;
                                }
                            } else if (var464 < 5600) {
                                if (var464 == 5500) {
                                    var6 -= 4;
                                    int var249 = class165.field2519[var6];
                                    int var250 = class165.field2519[var6 + 1];
                                    int var251 = class165.field2519[var6 + 2];
                                    int var252 = class165.field2519[var6 + 3];
                                    class9.method102(-13303, false, (var249 >> 14 & 0x3FFF) - class193.field3017, var251, (var249 & 0x3FFF) - class74.field1158, var250, var252);
                                    continue;
                                }
                                if (var464 == 5501) {
                                    var6 -= 4;
                                    int var253 = class165.field2519[var6];
                                    int var254 = class165.field2519[var6 + 2];
                                    int var255 = class165.field2519[var6 + 3];
                                    int var256 = class165.field2519[var6 + 1];
                                    class236.method1673(var255, 2, (var253 & 0x3FFF) - class74.field1158, var256, var254, ((var253 & 0xFFFF029) >> 14) - class193.field3017);
                                    continue;
                                }
                                if (var464 == 5502) {
                                    var6 -= 6;
                                    int var257 = class165.field2519[var6];
                                    if (var257 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class237.field3908 = var257;
                                    int var258 = class165.field2519[var6 + 1];
                                    if (class249.field4124[class237.field3908].length >> 1 <= var258 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class251.field4163 = 0;
                                    class194.field3032 = var258;
                                    class99.field1480 = class165.field2519[var6 + 2];
                                    class179.field2719 = class165.field2519[var6 + 3];
                                    int var259 = class165.field2519[var6 + 4];
                                    if (var259 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class175.field2674 = var259;
                                    int var260 = class165.field2519[var6 + 5];
                                    if ((class249.field4124[class175.field2674].length >> 1) <= (var260 + 1)) {
                                        throw new RuntimeException();
                                    }
                                    class270.field4631 = 3;
                                    class129.field1937 = var260;
                                    continue;
                                }
                                if (var464 == 5503) {
                                    class264.method1819((byte) 127);
                                    continue;
                                }
                                if (var464 == 5504) {
                                    var6 -= 2;
                                    class46.field707 = class165.field2519[var6];
                                    class24.field416 = class165.field2519[var6 + 1];
                                    class46.method345(-113);
                                    continue;
                                }
                                if (var464 == 5505) {
                                    class165.field2519[var6++] = class46.field707;
                                    continue;
                                }
                                if (var464 == 5506) {
                                    class165.field2519[var6++] = class24.field416;
                                    continue;
                                }
                            } else if (var464 < 5700) {
                                if (var464 == 5600) {
                                    var7 -= 2;
                                    class5 var276 = class226.field3718[var7];
                                    class5 var277 = class226.field3718[var7 + 1];
                                    var6--;
                                    int var278 = class165.field2519[var6];
                                    if (class5.field58 == 10 && class236.field3896 == 0 && class208.field3303 == 0) {
                                        class27.method192(true, var277, var278, var276);
                                    }
                                    continue;
                                }
                                if (var464 == 5601) {
                                    class5.method68(24782);
                                    continue;
                                }
                                if (var464 == 5602) {
                                    if (class236.field3896 == 0) {
                                        class85.field1291 = -2;
                                    }
                                    continue;
                                }
                                if (var464 == 5603) {
                                    var6 -= 4;
                                    if (class5.field58 == 10 && class236.field3896 == 0 && class208.field3303 == 0) {
                                        class221.method1506(class165.field2519[var6 + 3], class165.field2519[var6], class165.field2519[var6 + 1], class165.field2519[var6 + 2], (byte) -114);
                                    }
                                    continue;
                                }
                                if (var464 == 5604) {
                                    var7--;
                                    if (class5.field58 == 10 && class236.field3896 == 0 && class208.field3303 == 0) {
                                        class297.method2002(class226.field3718[var7].method69(-49), !arg1);
                                    }
                                    continue;
                                }
                                if (var464 == 5605) {
                                    var7 -= 2;
                                    var6 -= 4;
                                    if (class5.field58 == 10 && class236.field3896 == 0 && class208.field3303 == 0) {
                                        class97.method626(class165.field2519[var6], class165.field2519[var6 + 1], class165.field2519[var6 + 3], (byte) 8, class165.field2519[var6 + 2], class226.field3718[var7 + 1], class226.field3718[var7].method69(-49));
                                    }
                                    continue;
                                }
                                if (var464 == 5606) {
                                    if (class208.field3303 == 0) {
                                        class142.field2084 = -2;
                                    }
                                    continue;
                                }
                                if (var464 == 5607) {
                                    class165.field2519[var6++] = class85.field1291;
                                    continue;
                                }
                                if (var464 == 5608) {
                                    class165.field2519[var6++] = class141.field2075;
                                    continue;
                                }
                                if (var464 == 5609) {
                                    class165.field2519[var6++] = class142.field2084;
                                    continue;
                                }
                                if (var464 == 5610) {
                                    for (int var279 = 0; var279 < 5; var279++) {
                                        class226.field3718[var7++] = var279 < class73.field1152.length ? class73.field1152[var279].method30(-119) : class301.field5079;
                                    }
                                    class73.field1152 = null;
                                    continue;
                                }
                            } else if (var464 < 6100) {
                                if (var464 == 6001) {
                                    var6--;
                                    int var261 = class165.field2519[var6];
                                    if (var261 < 1) {
                                        var261 = 1;
                                    }
                                    if (var261 > 4) {
                                        var261 = 4;
                                    }
                                    class66.field1037 = var261;
                                    if (!class8.field114) {
                                        if (class66.field1037 == 1) {
                                            class229.method1634(0.9F);
                                        }
                                        if (class66.field1037 == 2) {
                                            class229.method1634(0.8F);
                                        }
                                        if (class66.field1037 == 3) {
                                            class229.method1634(0.7F);
                                        }
                                        if (class66.field1037 == 4) {
                                            class229.method1634(0.6F);
                                        }
                                    }
                                    class209.method1377((byte) -66);
                                    if (!class8.field114) {
                                        class267.method1838((byte) 87);
                                    }
                                    class260.method1804(-64);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6002) {
                                    var6--;
                                    class79.method542((byte) 105, class165.field2519[var6] == 1);
                                    class84.method564(124);
                                    class267.method1838((byte) -98);
                                    class181.method1182((byte) -95);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6003) {
                                    var6--;
                                    class264.field4522 = class165.field2519[var6] == 1;
                                    class181.method1182((byte) -59);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6005) {
                                    var6--;
                                    class112.field1663 = class165.field2519[var6] == 1;
                                    class267.method1838((byte) -122);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6006) {
                                    var6--;
                                    class181.field2765 = class165.field2519[var6] == 1;
                                    ((class164) class229.field3802).method1085((byte) 121, !class181.field2765);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6007) {
                                    var6--;
                                    class234.field3870 = class165.field2519[var6] == 1;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6008) {
                                    var6--;
                                    class117.field1781 = class165.field2519[var6] == 1;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6009) {
                                    var6--;
                                    class190.field2973 = class165.field2519[var6] == 1;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6010) {
                                    var6--;
                                    class77.field1208 = class165.field2519[var6] == 1;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6011) {
                                    var6--;
                                    int var262 = class165.field2519[var6];
                                    if (var262 < 0 || var262 > 2) {
                                        var262 = 0;
                                    }
                                    class236.field3895 = var262;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6012) {
                                    class264.method1814(0, 0, (byte) 81);
                                    var6--;
                                    class8.field114 = class165.field2519[var6] == 1;
                                    if (class8.field114) {
                                        class229.method1634(0.7F);
                                    } else {
                                        if (class66.field1037 == 1) {
                                            class229.method1634(0.9F);
                                        }
                                        if (class66.field1037 == 2) {
                                            class229.method1634(0.8F);
                                        }
                                        if (class66.field1037 == 3) {
                                            class229.method1634(0.7F);
                                        }
                                        if (class66.field1037 == 4) {
                                            class229.method1634(0.6F);
                                        }
                                    }
                                    class267.method1838((byte) 106);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6014) {
                                    var6--;
                                    class265.field4531 = class165.field2519[var6] == 1;
                                    class267.method1838((byte) -71);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6015) {
                                    var6--;
                                    class275.field4685 = class165.field2519[var6] == 1;
                                    class209.method1377((byte) -66);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6016) {
                                    var6--;
                                    int var263 = class165.field2519[var6];
                                    if (var263 < 0 || var263 > 2) {
                                        var263 = 0;
                                    }
                                    class170.field2613 = true;
                                    class86.field1300 = var263;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6017) {
                                    var6--;
                                    field1239 = class165.field2519[var6] == 1;
                                    class204.method1355((byte) -108);
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6018) {
                                    var6--;
                                    int var264 = class165.field2519[var6];
                                    if (var264 < 0) {
                                        var264 = 0;
                                    }
                                    if (var264 > 127) {
                                        var264 = 127;
                                    }
                                    class264.field4492 = var264;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6019) {
                                    var6--;
                                    int var265 = class165.field2519[var6];
                                    if (var265 < 0) {
                                        var265 = 0;
                                    }
                                    if (var265 > 255) {
                                        var265 = 255;
                                    }
                                    if (class247.field4092 != var265) {
                                        if (class247.field4092 == 0 && class272.field4649 != -1) {
                                            class217.method1468(var265, false, true, class272.field4649, 0, class182.field2775);
                                            class278.field4726 = false;
                                        } else if (var265 == 0) {
                                            class133.method864(1);
                                            class278.field4726 = false;
                                        } else {
                                            class270.method1852(true, var265);
                                        }
                                        class247.field4092 = var265;
                                    }
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6020) {
                                    var6--;
                                    int var266 = class165.field2519[var6];
                                    if (var266 < 0) {
                                        var266 = 0;
                                    }
                                    if (var266 > 127) {
                                        var266 = 127;
                                    }
                                    class130.field1955 = var266;
                                    class130.method860(class267.field4597, 0);
                                    class37.field587 = false;
                                    continue;
                                }
                                if (var464 == 6021) {
                                    var6--;
                                    client.field1747 = class165.field2519[var6] == 1;
                                    class181.method1182((byte) 92);
                                    continue;
                                }
                                if (var464 == 6022) {
                                    var6--;
                                    class116.field1731 = class165.field2519[var6] == 1;
                                    class130.method860(class267.field4597, 0);
                                    class282.method1906(-68, 0);
                                    continue;
                                }
                            } else if (var464 < 6200) {
                                if (var464 == 6101) {
                                    class165.field2519[var6++] = class66.field1037;
                                    continue;
                                }
                                if (var464 == 6102) {
                                    class165.field2519[var6++] = class152.method956((byte) -100) ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6103) {
                                    class165.field2519[var6++] = class264.field4522 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6105) {
                                    class165.field2519[var6++] = class112.field1663 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6106) {
                                    class165.field2519[var6++] = class181.field2765 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6107) {
                                    class165.field2519[var6++] = class234.field3870 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6108) {
                                    class165.field2519[var6++] = class117.field1781 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6109) {
                                    class165.field2519[var6++] = class190.field2973 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6110) {
                                    class165.field2519[var6++] = class77.field1208 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6111) {
                                    class165.field2519[var6++] = class236.field3895;
                                    continue;
                                }
                                if (var464 == 6112) {
                                    class165.field2519[var6++] = class8.field114 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6114) {
                                    class165.field2519[var6++] = class265.field4531 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6115) {
                                    class165.field2519[var6++] = class275.field4685 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6116) {
                                    class165.field2519[var6++] = class86.field1300;
                                    continue;
                                }
                                if (var464 == 6117) {
                                    class165.field2519[var6++] = field1239 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6118) {
                                    class165.field2519[var6++] = class264.field4492;
                                    continue;
                                }
                                if (var464 == 6119) {
                                    class165.field2519[var6++] = class247.field4092;
                                    continue;
                                }
                                if (var464 == 6120) {
                                    class165.field2519[var6++] = class130.field1955;
                                    continue;
                                }
                                if (var464 == 6121) {
                                    class165.field2519[var6++] = class45.field689 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6122) {
                                    class165.field2519[var6++] = class116.field1731 ? 1 : 0;
                                    continue;
                                }
                            } else if (var464 < 6300) {
                                if (var464 == 6200) {
                                    var6 -= 2;
                                    class16.field287 = (short) class165.field2519[var6];
                                    if (class16.field287 <= 0) {
                                        class16.field287 = 256;
                                    }
                                    class86.field1301 = (short) class165.field2519[var6 + 1];
                                    if (class86.field1301 <= 0) {
                                        class86.field1301 = 205;
                                    }
                                    continue;
                                }
                                if (var464 == 6201) {
                                    var6 -= 2;
                                    class2.field16 = (short) class165.field2519[var6];
                                    if (class2.field16 <= 0) {
                                        class2.field16 = 256;
                                    }
                                    class139.field2063 = (short) class165.field2519[var6 + 1];
                                    if (class139.field2063 <= 0) {
                                        class139.field2063 = 320;
                                    }
                                    continue;
                                }
                                if (var464 == 6202) {
                                    var6 -= 4;
                                    class237.field3923 = (short) class165.field2519[var6];
                                    if (class237.field3923 <= 0) {
                                        class237.field3923 = 1;
                                    }
                                    class282.field4784 = (short) class165.field2519[var6 + 1];
                                    if (class282.field4784 <= 0) {
                                        class282.field4784 = 32767;
                                    } else if (class237.field3923 > class282.field4784) {
                                        class282.field4784 = class237.field3923;
                                    }
                                    class166.field2530 = (short) class165.field2519[var6 + 2];
                                    if (class166.field2530 <= 0) {
                                        class166.field2530 = 1;
                                    }
                                    class107.field1599 = (short) class165.field2519[var6 + 3];
                                    if (class107.field1599 <= 0) {
                                        class107.field1599 = 32767;
                                    } else if (class166.field2530 > class107.field1599) {
                                        class107.field1599 = class166.field2530;
                                    }
                                    continue;
                                }
                                if (var464 == 6203) {
                                    class29.method206(0, (byte) -100, class208.field3306.field4190, class208.field3306.field4228, 0, false);
                                    class165.field2519[var6++] = class255.field4361;
                                    class165.field2519[var6++] = class244.field4052;
                                    continue;
                                }
                                if (var464 == 6204) {
                                    class165.field2519[var6++] = class2.field16;
                                    class165.field2519[var6++] = class139.field2063;
                                    continue;
                                }
                                if (var464 == 6205) {
                                    class165.field2519[var6++] = class16.field287;
                                    class165.field2519[var6++] = class86.field1301;
                                    continue;
                                }
                            } else if (var464 < 6400) {
                                if (var464 == 6300) {
                                    class165.field2519[var6++] = (int) (class212.method1404((byte) -107) / 60000L);
                                    continue;
                                }
                                if (var464 == 6301) {
                                    class165.field2519[var6++] = (int) (class212.method1404((byte) -98) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var464 == 6302) {
                                    var6 -= 3;
                                    int var271 = class165.field2519[var6 + 2];
                                    int var272 = class165.field2519[var6];
                                    int var273 = class165.field2519[var6 + 1];
                                    class236.field3901.clear();
                                    class236.field3901.set(11, 12);
                                    class236.field3901.set(var271, var273, var272);
                                    class165.field2519[var6++] = (int) (class236.field3901.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var464 == 6303) {
                                    class236.field3901.clear();
                                    class236.field3901.setTime(new Date(class212.method1404((byte) -93)));
                                    class165.field2519[var6++] = class236.field3901.get(1);
                                    continue;
                                }
                                if (var464 == 6304) {
                                    var6--;
                                    int var274 = class165.field2519[var6];
                                    boolean var275 = true;
                                    if (var274 < 0) {
                                        var275 = (var274 + 1) % 4 == 0;
                                    } else if (var274 < 1582) {
                                        var275 = (var274 % 4) == 0;
                                    } else if ((var274 % 4) != 0) {
                                        var275 = false;
                                    } else if ((var274 % 100) != 0) {
                                        var275 = true;
                                    } else if (var274 % 400 != 0) {
                                        var275 = false;
                                    }
                                    class165.field2519[var6++] = var275 ? 1 : 0;
                                    continue;
                                }
                            } else if (var464 < 6500) {
                                if (var464 == 6400) {
                                    class165.field2519[var6++] = class123.field1861 ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6401) {
                                    var7--;
                                    class5 var267 = class226.field3718[var7];
                                    var6--;
                                    int var268 = class165.field2519[var6];
                                    String var269;
                                    try {
                                        var269 = new String(var267.method67(125), "ISO-8859-1");
                                    } catch (UnsupportedEncodingException var461) {
                                        var269 = new String(var267.method67(113));
                                    }
                                    if (class123.field1861) {
                                        if (!browsercontrol.iscreated()) {
                                            browsercontrol.create("about:blank");
                                        }
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate(var269);
                                            class10.field157 = var268;
                                            class282.method1906(-79, 0);
                                        }
                                    }
                                    continue;
                                }
                                if (var464 == 6402) {
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate("about:blank");
                                        browsercontrol.hide();
                                        class10.field157 = 0;
                                        class282.method1906(-72, 0);
                                    }
                                    continue;
                                }
                                if (var464 == 6403) {
                                    class226.field3718[var7++] = class282.field4793;
                                    continue;
                                }
                                if (var464 == 6404) {
                                    class226.field3718[var7++] = class20.field331;
                                    continue;
                                }
                                if (var464 == 6405) {
                                    class165.field2519[var6++] = class31.method217(5212) ? 1 : 0;
                                    continue;
                                }
                                if (var464 == 6406) {
                                    class165.field2519[var6++] = class300.method2038(false) ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var464 == 4500) {
                            var6 -= 2;
                            int var343 = class165.field2519[var6 + 1];
                            int var344 = class165.field2519[var6];
                            class18 var345 = class39.method281(99, var343);
                            if (var345.method152(123)) {
                                class226.field3718[var7++] = class238.method1680((byte) 101, var344).method1614(var343, var345.field305, -125);
                            } else {
                                class165.field2519[var6++] = class238.method1680((byte) 85, var344).method1617(var343, 5, var345.field318);
                            }
                            continue;
                        }
                    } else if (var464 == 4300) {
                        var6 -= 2;
                        int var346 = class165.field2519[var6];
                        int var347 = class165.field2519[var6 + 1];
                        class18 var348 = class39.method281(67, var347);
                        if (var348.method152(123)) {
                            class226.field3718[var7++] = class186.method1230(29, var346).method1943(113, var348.field305, var347);
                        } else {
                            class165.field2519[var6++] = class186.method1230(29, var346).method1944(var347, 31219, var348.field318);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var463) {
            if (var5.field4924 == null) {
                if (class90.field1350 != 0) {
                    class69.method497(24077, class301.field5079, 0, class13.field250);
                }
                class98.method630("CS2 - scr:" + var5.field5004 + " op:" + var11, -76, var463);
            } else {
                class5 var458 = class230.method1637(-9, 30);
                var458.method64(11469, class13.field251).method64(11469, var5.field4924);
                for (int var459 = class72.field1129 - 1; var459 >= 0; var459--) {
                    var458.method64(11469, class74.field1166).method64(11469, class237.field3911[var459].field3991.field4924);
                }
                if (var11 == 40) {
                    int var460 = var10[var8];
                    var458.method64(11469, class13.field245).method64(11469, class175.method1148(var460, false));
                }
                if (class90.field1350 != 0) {
                    class69.method497(24077, class301.field5079, 0, class288.method1940((byte) 77, new class5[] { class290.field4921, var5.field4924 }));
                }
                class98.method630("CS2 - scr:" + var5.field5004 + " op:" + var11 + new String(var458.method67(98)), -93, var463);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(BI)V", line = 5597)
    public static final void method548(byte arg0, int arg1) {
        field1236++;
        if (class141.field2081 == null) {
            class141.field2081 = new byte[4][104][104];
        }
        if (arg1 != -4) {
            method551(92);
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class141.field2081[var2][var3][var4] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V", line = 5639)
    public static void method549(int arg0) {
        field1238 = null;
        field1240 = null;
        field1243 = null;
        field1235 = null;
        int var1 = -40 % ((-arg0 - 23) / 39);
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V", line = 5663)
    public static final void method550(int arg0) {
        field1241++;
        if (arg0 != -1) {
            field1239 = true;
        }
        class131.field1963.method522(50);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V", line = 5691)
    public static final void method551(int arg0) {
        class147.field2127.method1389((byte) 122, 98);
        class279.field4732++;
        class147.field2127.method1542(-99, class262.method1812(-124));
        class147.field2127.method1539(class255.field4362, false);
        class147.field2127.method1539(class156.field2314, false);
        field1237++;
        if (arg0 != -6) {
            method550(14);
        }
        class279.field4731 = 0L;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V", line = 5725)
    public class80() {
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lma;I)V", line = 5727)
    public class80(class5 arg0, int arg1) {
        this.field1248 = arg0;
    }
}
