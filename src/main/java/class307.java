import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class307 extends class60 {

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "[I")
    public int[] field4867 = new int[] { 0 };

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
    public int[] field4871 = new int[] { -1 };

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field4869 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field4865 = 0;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4872 = "Choose Option";

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Lgd;")
    public static class325 field4873 = new class325(64);

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[I")
    public static int[] field4870;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 7)
    public static final void method2174(byte arg0) {
        class170.field2731.method2282((byte) -122);
        field4868++;
        if (arg0 != -86) {
            method2176(-61, (class150) null, 98);
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V", line = 19)
    public static void method2175(byte arg0) {
        field4870 = null;
        field4872 = null;
        int var1 = -120 / ((arg0 - 56) / 59);
        field4873 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjd;I)V", line = 33)
    public static final void method2176(int arg0, class150 arg1, int arg2) {
        field4864++;
        Object[] var3 = arg1.field2450;
        int var4 = (Integer) var3[0];
        class77 var5 = class304.method2159((byte) -95, var4);
        if (var5 == null) {
            return;
        }
        class190.field2983 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var10 = var5.field1199;
        int[] var11 = var5.field1203;
        try {
            int var12 = 0;
            class22.field394 = new int[var5.field1198];
            class237.field3578 = new String[var5.field1200];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg1.field2449;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg1.field2457;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg1.field2458 == null ? -1 : arg1.field2458.field4088;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg1.field2459;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg1.field2458 == null ? -1 : arg1.field2458.field3958;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg1.field2445 == null ? -1 : arg1.field2445.field4088;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg1.field2445 == null ? -1 : arg1.field2445.field3958;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg1.field2444;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg1.field2456;
                    }
                    class22.field394[var12++] = var15;
                } else if (var3[var14] instanceof String) {
                    String var16 = (String) var3[var14];
                    if (var16.equals("event_opbase")) {
                        var16 = arg1.field2442;
                    }
                    class237.field3578[var13++] = var16;
                }
            }
            int var17 = 0;
            label4442: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var9 = var10[var8];
                if (var9 < 100) {
                    if (var9 == 0) {
                        class274.field4294[var7++] = var11[var8];
                        continue;
                    }
                    if (var9 == 1) {
                        int var18 = var11[var8];
                        class274.field4294[var7++] = class123.field1998[var18];
                        continue;
                    }
                    if (var9 == 2) {
                        int var19 = var11[var8];
                        var7--;
                        class8.method143((byte) 124, var19, class274.field4294[var7]);
                        continue;
                    }
                    if (var9 == 3) {
                        class344.field5334[var6++] = var5.field1207[var8];
                        continue;
                    }
                    if (var9 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var9 == 7) {
                        var7 -= 2;
                        if (class274.field4294[var7 + 1] != class274.field4294[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 8) {
                        var7 -= 2;
                        if (class274.field4294[var7 + 1] == class274.field4294[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 9) {
                        var7 -= 2;
                        if (class274.field4294[var7 + 1] > class274.field4294[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 10) {
                        var7 -= 2;
                        if (class274.field4294[var7 + 1] < class274.field4294[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 21) {
                        if (class190.field2983 == 0) {
                            return;
                        }
                        class55 var20 = class244.field3652[--class190.field2983];
                        var5 = var20.field851;
                        class237.field3578 = var20.field847;
                        var11 = var5.field1203;
                        var10 = var5.field1199;
                        class22.field394 = var20.field840;
                        var8 = var20.field850;
                        continue;
                    }
                    if (var9 == 25) {
                        int var21 = var11[var8];
                        class274.field4294[var7++] = class228.method1663(var21, 1);
                        continue;
                    }
                    if (var9 == 27) {
                        int var22 = var11[var8];
                        var7--;
                        class156.method1162(var22, class274.field4294[var7], -31129);
                        continue;
                    }
                    if (var9 == 31) {
                        var7 -= 2;
                        if (class274.field4294[var7 + 1] >= class274.field4294[var7]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 32) {
                        var7 -= 2;
                        if (class274.field4294[var7] >= class274.field4294[var7 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var9 == 33) {
                        class274.field4294[var7++] = class22.field394[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var9 == 34) {
                        var10001 = var11[var8];
                        var7--;
                        class22.field394[var10001] = class274.field4294[var7];
                        continue;
                    }
                    if (var9 == 35) {
                        class344.field5334[var6++] = class237.field3578[var11[var8]];
                        continue;
                    }
                    if (var9 == 36) {
                        var10001 = var11[var8];
                        var6--;
                        class237.field3578[var10001] = class344.field5334[var6];
                        continue;
                    }
                    if (var9 == 37) {
                        int var23 = var11[var8];
                        var6 -= var23;
                        String var24 = class285.method1993((byte) 127, class344.field5334, var6, var23);
                        class344.field5334[var6++] = var24;
                        continue;
                    }
                    if (var9 == 38) {
                        var7--;
                        continue;
                    }
                    if (var9 == 39) {
                        var6--;
                        continue;
                    }
                    if (var9 == 40) {
                        int var25 = var11[var8];
                        class77 var26 = class304.method2159((byte) -95, var25);
                        int[] var27 = new int[var26.field1198];
                        String[] var28 = new String[var26.field1200];
                        for (int var29 = 0; var29 < var26.field1202; var29++) {
                            var27[var29] = class274.field4294[var7 + var29 - var26.field1202];
                        }
                        for (int var30 = 0; var30 < var26.field1201; var30++) {
                            var28[var30] = class344.field5334[var6 + var30 - var26.field1201];
                        }
                        var7 -= var26.field1202;
                        var6 -= var26.field1201;
                        class55 var31 = new class55();
                        var31.field847 = class237.field3578;
                        var31.field850 = var8;
                        var31.field840 = class22.field394;
                        var31.field851 = var5;
                        if (class190.field2983 >= class244.field3652.length) {
                            throw new RuntimeException();
                        }
                        class244.field3652[class190.field2983++] = var31;
                        var5 = var26;
                        class22.field394 = var27;
                        var11 = var26.field1203;
                        var8 = -1;
                        var10 = var26.field1199;
                        class237.field3578 = var28;
                        continue;
                    }
                    if (var9 == 42) {
                        class274.field4294[var7++] = class92.field1487[var11[var8]];
                        continue;
                    }
                    if (var9 == 43) {
                        int var32 = var11[var8];
                        var7--;
                        class92.field1487[var32] = class274.field4294[var7];
                        class6.method98(false, var32);
                        continue;
                    }
                    if (var9 == 44) {
                        int var33 = var11[var8] >> 16;
                        int var34 = var11[var8] & 0xFFFF;
                        var7--;
                        int var35 = class274.field4294[var7];
                        if (var35 >= 0 && var35 <= 5000) {
                            class93.field1523[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4442;
                                }
                                class342.field5291[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var9 == 45) {
                        int var38 = var11[var8];
                        var7--;
                        int var39 = class274.field4294[var7];
                        if (var39 >= 0 && var39 < class93.field1523[var38]) {
                            class274.field4294[var7++] = class342.field5291[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var9 == 46) {
                        var7 -= 2;
                        int var40 = var11[var8];
                        int var41 = class274.field4294[var7];
                        if (var41 >= 0 && class93.field1523[var40] > var41) {
                            class342.field5291[var40][var41] = class274.field4294[var7 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var9 == 47) {
                        String var42 = class151.field2463[var11[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class344.field5334[var6++] = var42;
                        continue;
                    }
                    if (var9 == 48) {
                        int var43 = var11[var8];
                        var6--;
                        class151.field2463[var43] = class344.field5334[var6];
                        class55.method466(var43, (byte) 57);
                        continue;
                    }
                    if (var9 == 51) {
                        class3 var44 = var5.field1206[var11[var8]];
                        var7--;
                        class304 var45 = (class304) var44.method79((long) class274.field4294[var7], (byte) 0);
                        if (var45 != null) {
                            var8 += var45.field4844;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var9 < 300) {
                    if (var9 == 100) {
                        var7 -= 3;
                        int var508 = class274.field4294[var7 + 2];
                        int var509 = class274.field4294[var7 + 1];
                        int var510 = class274.field4294[var7];
                        if (var509 != 0) {
                            class266 var511 = class171.method1276(var510, (byte) 117);
                            if (var511.field3994 == null) {
                                var511.field3994 = new class266[var508 + 1];
                            }
                            if (var508 >= var511.field3994.length) {
                                class266[] var512 = new class266[var508 + 1];
                                for (int var513 = 0; var513 < var511.field3994.length; var513++) {
                                    var512[var513] = var511.field3994[var513];
                                }
                                var511.field3994 = var512;
                            }
                            if (var508 > 0 && var511.field3994[var508 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var508 - 1));
                            }
                            class266 var514 = new class266();
                            var514.field4043 = true;
                            var514.field3926 = var514.field4088 = var511.field4088;
                            var514.field3958 = var508;
                            var514.field4084 = var509;
                            var511.field3994[var508] = var514;
                            if (var46) {
                                class136.field2208 = var514;
                            } else {
                                class217.field3381 = var514;
                            }
                            class280.method1971((byte) 101, var511);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var9 == 101) {
                        class266 var515 = var46 ? class136.field2208 : class217.field3381;
                        if (var515.field3958 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class266 var516 = class171.method1276(var515.field4088, (byte) -116);
                        var516.field3994[var515.field3958] = null;
                        class280.method1971((byte) 101, var516);
                        continue;
                    }
                    if (var9 == 102) {
                        var7--;
                        class266 var517 = class171.method1276(class274.field4294[var7], (byte) -127);
                        var517.field3994 = null;
                        class280.method1971((byte) 101, var517);
                        continue;
                    }
                    if (var9 == 200) {
                        var7 -= 2;
                        int var518 = class274.field4294[var7];
                        int var519 = class274.field4294[var7 + 1];
                        class266 var520 = class77.method604(var519, var518, -10316);
                        if (var520 != null && var519 != -1) {
                            class274.field4294[var7++] = 1;
                            if (var46) {
                                class136.field2208 = var520;
                            } else {
                                class217.field3381 = var520;
                            }
                            continue;
                        }
                        class274.field4294[var7++] = 0;
                        continue;
                    }
                    if (var9 == 201) {
                        var7--;
                        int var521 = class274.field4294[var7];
                        class266 var522 = class171.method1276(var521, (byte) 48);
                        if (var522 == null) {
                            class274.field4294[var7++] = 0;
                        } else {
                            class274.field4294[var7++] = 1;
                            if (var46) {
                                class136.field2208 = var522;
                            } else {
                                class217.field3381 = var522;
                            }
                        }
                        continue;
                    }
                } else if (var9 < 500) {
                    if (var9 == 403) {
                        var7 -= 2;
                        int var501 = class274.field4294[var7];
                        int var502 = class274.field4294[var7 + 1];
                        for (int var503 = 0; var503 < class264.field3904.length; var503++) {
                            if (class264.field3904[var503] == var501) {
                                class345.field5363.field1485.method1918(var502, 0, var503);
                                continue label4442;
                            }
                        }
                        int var504 = 0;
                        while (true) {
                            if (var504 >= class108.field1763.length) {
                                continue label4442;
                            }
                            if (class108.field1763[var504] == var501) {
                                class345.field5363.field1485.method1918(var502, ~arg2, var504);
                                continue label4442;
                            }
                            var504++;
                        }
                    }
                    if (var9 == 404) {
                        var7 -= 2;
                        int var505 = class274.field4294[var7];
                        int var506 = class274.field4294[var7 + 1];
                        class345.field5363.field1485.method1915(var505, var506, 614742895);
                        continue;
                    }
                    if (var9 == 410) {
                        var7--;
                        boolean var507 = class274.field4294[var7] != 0;
                        class345.field5363.field1485.method1914((byte) -82, var507);
                        continue;
                    }
                } else if (var9 >= 1000 && var9 < 1100 || var9 >= 2000 && var9 < 2100) {
                    class266 var47;
                    if (var9 < 2000) {
                        var47 = var46 ? class136.field2208 : class217.field3381;
                    } else {
                        var9 -= 1000;
                        var7--;
                        var47 = class171.method1276(class274.field4294[var7], (byte) -127);
                    }
                    if (var9 == 1000) {
                        var7 -= 4;
                        var47.field4012 = class274.field4294[var7];
                        var47.field4036 = class274.field4294[var7 + 1];
                        int var48 = class274.field4294[var7 + 2];
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        int var49 = class274.field4294[var7 + 3];
                        var47.field4011 = (byte) var48;
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var47.field4103 = (byte) var49;
                        class280.method1971((byte) 101, var47);
                        class291.method2042((byte) -119, var47);
                        if (var47.field3958 == -1) {
                            class141.method1084((byte) -120, var47.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1001) {
                        var7 -= 4;
                        var47.field3987 = class274.field4294[var7];
                        var47.field4009 = class274.field4294[var7 + 1];
                        var47.field4079 = 0;
                        var47.field4090 = 0;
                        int var50 = class274.field4294[var7 + 3];
                        int var51 = class274.field4294[var7 + 2];
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        var47.field4057 = (byte) var51;
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        var47.field3990 = (byte) var50;
                        class280.method1971((byte) 101, var47);
                        class291.method2042((byte) 75, var47);
                        if (var47.field4084 == 0) {
                            class76.method602(false, arg2 + 1, var47);
                        }
                        continue;
                    }
                    if (var9 == 1003) {
                        var7--;
                        boolean var52 = class274.field4294[var7] == 1;
                        if (var47.field4046 != var52) {
                            var47.field4046 = var52;
                            class280.method1971((byte) 101, var47);
                        }
                        if (var47.field3958 == -1) {
                            class135.method1048(var47.field4088, -124);
                        }
                        continue;
                    }
                    if (var9 == 1004) {
                        var7 -= 2;
                        var47.field4040 = class274.field4294[var7];
                        var47.field4018 = class274.field4294[var7 + 1];
                        class280.method1971((byte) 101, var47);
                        class291.method2042((byte) -124, var47);
                        if (var47.field4084 == 0) {
                            class76.method602(false, 0, var47);
                        }
                        continue;
                    }
                    if (var9 == 1005) {
                        var7--;
                        var47.field4058 = class274.field4294[var7] == 1;
                        continue;
                    }
                } else if (var9 >= 1100 && var9 < 1200 || var9 >= 2100 && var9 < 2200) {
                    class266 var497;
                    if (var9 < 2000) {
                        var497 = var46 ? class136.field2208 : class217.field3381;
                    } else {
                        var9 -= 1000;
                        var7--;
                        var497 = class171.method1276(class274.field4294[var7], (byte) 95);
                    }
                    if (var9 == 1100) {
                        var7 -= 2;
                        var497.field3951 = class274.field4294[var7];
                        if ((var497.field4019 - var497.field3941) < var497.field3951) {
                            var497.field3951 = var497.field4019 - var497.field3941;
                        }
                        if (var497.field3951 < 0) {
                            var497.field3951 = 0;
                        }
                        var497.field4045 = class274.field4294[var7 + 1];
                        if (var497.field4045 > (var497.field4097 - var497.field3939)) {
                            var497.field4045 = var497.field4097 - var497.field3939;
                        }
                        if (var497.field4045 < 0) {
                            var497.field4045 = 0;
                        }
                        class280.method1971((byte) 101, var497);
                        if (var497.field3958 == -1) {
                            class323.method2276(arg2 ^ 0x7D, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1101) {
                        var7--;
                        var497.field4076 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        if (var497.field3958 == -1) {
                            class67.method536((byte) -93, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1102) {
                        var7--;
                        var497.field4031 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1103) {
                        var7--;
                        var497.field4048 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1104) {
                        var7--;
                        var497.field4093 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1105) {
                        var7--;
                        var497.field3982 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1106) {
                        var7--;
                        var497.field3931 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1107) {
                        var7--;
                        var497.field4067 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1108) {
                        var497.field4003 = 1;
                        var7--;
                        var497.field4005 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        if (var497.field3958 == -1) {
                            class305.method2164((byte) 76, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1109) {
                        var7 -= 6;
                        var497.field4055 = class274.field4294[var7];
                        var497.field3960 = class274.field4294[var7 + 1];
                        var497.field4020 = class274.field4294[var7 + 2];
                        var497.field3968 = class274.field4294[var7 + 3];
                        var497.field3937 = class274.field4294[var7 + 4];
                        var497.field4105 = class274.field4294[var7 + 5];
                        class280.method1971((byte) 101, var497);
                        if (var497.field3958 == -1) {
                            class260.method1803(false, var497.field4088);
                            class272.method1941(31103, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1110) {
                        var7--;
                        int var498 = class274.field4294[var7];
                        if (var497.field3975 != var498) {
                            var497.field4041 = 0;
                            var497.field3966 = 1;
                            var497.field4077 = 0;
                            var497.field3975 = var498;
                            class280.method1971((byte) 101, var497);
                        }
                        if (var497.field3958 == -1) {
                            class91.method727((byte) -83, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1111) {
                        var7--;
                        var497.field3945 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1112) {
                        var6--;
                        String var499 = class344.field5334[var6];
                        if (!var499.equals(var497.field3927)) {
                            var497.field3927 = var499;
                            class280.method1971((byte) 101, var497);
                        }
                        if (var497.field3958 == -1) {
                            class149.method1128(-31323, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1113) {
                        var7--;
                        var497.field4029 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1114) {
                        var7 -= 3;
                        var497.field3921 = class274.field4294[var7];
                        var497.field3949 = class274.field4294[var7 + 1];
                        var497.field4027 = class274.field4294[var7 + 2];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1115) {
                        var7--;
                        var497.field4086 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1116) {
                        var7--;
                        var497.field4089 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1117) {
                        var7--;
                        var497.field3923 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1118) {
                        var7--;
                        var497.field3933 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1119) {
                        var7--;
                        var497.field4074 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1120) {
                        var7 -= 2;
                        var497.field4019 = class274.field4294[var7];
                        var497.field4097 = class274.field4294[var7 + 1];
                        class280.method1971((byte) 101, var497);
                        if (var497.field4084 == 0) {
                            class76.method602(false, 0, var497);
                        }
                        continue;
                    }
                    if (var9 == 1121) {
                        var7 -= 2;
                        var497.field3971 = (short) class274.field4294[var7];
                        var497.field4035 = (short) class274.field4294[var7 + 1];
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1122) {
                        var7--;
                        var497.field3973 = class274.field4294[var7] == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                    if (var9 == 1123) {
                        var7--;
                        var497.field4105 = class274.field4294[var7];
                        class280.method1971((byte) 101, var497);
                        if (var497.field3958 == -1) {
                            class260.method1803(false, var497.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1124) {
                        var7--;
                        int var500 = class274.field4294[var7];
                        var497.field4042 = var500 == 1;
                        class280.method1971((byte) 101, var497);
                        continue;
                    }
                } else if (var9 >= 1200 && var9 < 1300 || var9 >= 2200 && var9 < 2300) {
                    class266 var493;
                    if (var9 < 2000) {
                        var493 = var46 ? class136.field2208 : class217.field3381;
                    } else {
                        var9 -= 1000;
                        var7--;
                        var493 = class171.method1276(class274.field4294[var7], (byte) -124);
                    }
                    class280.method1971((byte) 101, var493);
                    if (var9 == 1200 || var9 == 1205 || var9 == 1208 || var9 == 1209) {
                        var7 -= 2;
                        int var494 = class274.field4294[var7];
                        int var495 = class274.field4294[var7 + 1];
                        if (var493.field3958 == -1) {
                            class61.method495(var493.field4088, (byte) -125);
                            class260.method1803(false, var493.field4088);
                            class272.method1941(arg2 ^ 0xFFFF8680, var493.field4088);
                        }
                        if (var494 == -1) {
                            var493.field4005 = -1;
                            var493.field4003 = 1;
                            var493.field3947 = -1;
                            continue;
                        }
                        if (var9 == 1208 || var9 == 1209) {
                            var493.field3969 = true;
                        } else {
                            var493.field3969 = false;
                        }
                        var493.field4016 = var495;
                        var493.field3947 = var494;
                        class135 var496 = class188.method1361(true, var494);
                        var493.field3968 = var496.field2167;
                        var493.field3937 = var496.field2169;
                        var493.field3960 = var496.field2132;
                        var493.field4105 = var496.field2204;
                        var493.field4055 = var496.field2205;
                        if (var493.field4090 > 0) {
                            var493.field4105 = var493.field4105 * 32 / var493.field4090;
                        } else if (var493.field3987 > 0) {
                            var493.field4105 = var493.field4105 * 32 / var493.field3987;
                        }
                        if (var9 == 1205) {
                            var493.field4039 = false;
                        } else {
                            var493.field4039 = true;
                        }
                        var493.field4020 = var496.field2157;
                        continue;
                    }
                    if (var9 == 1201) {
                        var493.field4003 = 2;
                        var7--;
                        var493.field4005 = class274.field4294[var7];
                        if (var493.field3958 == -1) {
                            class305.method2164((byte) -115, var493.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1202) {
                        var493.field4003 = 3;
                        var493.field4005 = class345.field5363.field1485.method1916((byte) 21);
                        if (var493.field3958 == -1) {
                            class305.method2164((byte) 89, var493.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1203) {
                        var493.field4003 = 6;
                        var7--;
                        var493.field4005 = class274.field4294[var7];
                        if (var493.field3958 == -1) {
                            class305.method2164((byte) 114, var493.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1204) {
                        var493.field4003 = 5;
                        var7--;
                        var493.field4005 = class274.field4294[var7];
                        if (var493.field3958 == -1) {
                            class305.method2164((byte) 60, var493.field4088);
                        }
                        continue;
                    }
                    if (var9 == 1206) {
                        var7 -= 4;
                        var493.field3934 = class274.field4294[var7];
                        var493.field3932 = class274.field4294[var7 + 1];
                        var493.field3922 = class274.field4294[var7 + 2];
                        var493.field4069 = class274.field4294[var7 + 3];
                        class280.method1971((byte) 101, var493);
                        continue;
                    }
                    if (var9 == 1207) {
                        var7 -= 2;
                        var493.field4032 = class274.field4294[var7];
                        var493.field4007 = class274.field4294[var7 + 1];
                        class280.method1971((byte) 101, var493);
                        continue;
                    }
                } else if ((var9 < 1300 || var9 >= 1400) && (var9 < 2300 || var9 >= 2400)) {
                    if (var9 >= 1400 && var9 < 1500 || var9 >= 2400 && var9 < 2500) {
                        class266 var480;
                        if (var9 < 2000) {
                            var480 = var46 ? class136.field2208 : class217.field3381;
                        } else {
                            var9 -= 1000;
                            var7--;
                            var480 = class171.method1276(class274.field4294[var7], (byte) 29);
                        }
                        var6--;
                        String var481 = class344.field5334[var6];
                        int[] var482 = null;
                        if (var481.length() > 0 && var481.charAt(var481.length() - 1) == 'Y') {
                            var7--;
                            int var483 = class274.field4294[var7];
                            if (var483 > 0) {
                                var482 = new int[var483];
                                while (var483-- > 0) {
                                    var7--;
                                    var482[var483] = class274.field4294[var7];
                                }
                            }
                            var481 = var481.substring(0, var481.length() - 1);
                        }
                        Object[] var484 = new Object[var481.length() + 1];
                        for (int var485 = var484.length - 1; var485 >= 1; var485--) {
                            if (var481.charAt(var485 - 1) == 's') {
                                var6--;
                                var484[var485] = class344.field5334[var6];
                            } else {
                                var7--;
                                var484[var485] = Integer.valueOf(class274.field4294[var7]);
                            }
                        }
                        var7--;
                        int var486 = class274.field4294[var7];
                        if (var486 == -1) {
                            var484 = null;
                        } else {
                            var484[0] = Integer.valueOf(var486);
                        }
                        var480.field4017 = true;
                        if (var9 == 1400) {
                            var480.field4071 = var484;
                        } else if (var9 == 1401) {
                            var480.field3959 = var484;
                        } else if (var9 == 1402) {
                            var480.field4056 = var484;
                        } else if (var9 == 1403) {
                            var480.field3985 = var484;
                        } else if (var9 == 1404) {
                            var480.field3944 = var484;
                        } else if (var9 == 1405) {
                            var480.field3989 = var484;
                        } else if (var9 == 1406) {
                            var480.field4013 = var484;
                        } else if (var9 == 1407) {
                            var480.field3924 = var484;
                            var480.field4083 = var482;
                        } else if (var9 == 1408) {
                            var480.field3946 = var484;
                        } else if (var9 == 1409) {
                            var480.field4037 = var484;
                        } else if (var9 == 1410) {
                            var480.field4070 = var484;
                        } else if (var9 == 1411) {
                            var480.field4101 = var484;
                        } else if (var9 == 1412) {
                            var480.field3995 = var484;
                        } else if (var9 == 1414) {
                            var480.field3986 = var484;
                            var480.field4065 = var482;
                        } else if (var9 == 1415) {
                            var480.field3981 = var484;
                            var480.field3984 = var482;
                        } else if (var9 == 1416) {
                            var480.field3964 = var484;
                        } else if (var9 == 1417) {
                            var480.field4100 = var484;
                        } else if (var9 == 1418) {
                            var480.field4066 = var484;
                        } else if (var9 == 1419) {
                            var480.field3988 = var484;
                        } else if (var9 == 1420) {
                            var480.field4026 = var484;
                        } else if (var9 == 1421) {
                            var480.field3977 = var484;
                        } else if (var9 == 1422) {
                            var480.field3983 = var484;
                        } else if (var9 == 1423) {
                            var480.field3942 = var484;
                        } else if (var9 == 1424) {
                            var480.field4002 = var484;
                        } else if (var9 == 1425) {
                            var480.field4054 = var484;
                        } else if (var9 == 1426) {
                            var480.field3967 = var484;
                        } else if (var9 == 1427) {
                            var480.field4023 = var484;
                        } else if (var9 == 1428) {
                            var480.field4092 = var484;
                            var480.field3965 = var482;
                        } else if (var9 == 1429) {
                            var480.field3963 = var484;
                            var480.field4030 = var482;
                        }
                        continue;
                    }
                    if (var9 < 1600) {
                        class266 var479 = var46 ? class136.field2208 : class217.field3381;
                        if (var9 == 1500) {
                            class274.field4294[var7++] = var479.field4099;
                            continue;
                        }
                        if (var9 == 1501) {
                            class274.field4294[var7++] = var479.field4087;
                            continue;
                        }
                        if (var9 == 1502) {
                            class274.field4294[var7++] = var479.field3941;
                            continue;
                        }
                        if (var9 == 1503) {
                            class274.field4294[var7++] = var479.field3939;
                            continue;
                        }
                        if (var9 == 1504) {
                            class274.field4294[var7++] = var479.field4046 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 1505) {
                            class274.field4294[var7++] = var479.field3926;
                            continue;
                        }
                    } else if (var9 < 1700) {
                        class266 var478 = var46 ? class136.field2208 : class217.field3381;
                        if (var9 == 1600) {
                            class274.field4294[var7++] = var478.field3951;
                            continue;
                        }
                        if (var9 == 1601) {
                            class274.field4294[var7++] = var478.field4045;
                            continue;
                        }
                        if (var9 == 1602) {
                            class344.field5334[var6++] = var478.field3927;
                            continue;
                        }
                        if (var9 == 1603) {
                            class274.field4294[var7++] = var478.field4019;
                            continue;
                        }
                        if (var9 == 1604) {
                            class274.field4294[var7++] = var478.field4097;
                            continue;
                        }
                        if (var9 == 1605) {
                            class274.field4294[var7++] = var478.field4105;
                            continue;
                        }
                        if (var9 == 1606) {
                            class274.field4294[var7++] = var478.field4020;
                            continue;
                        }
                        if (var9 == 1607) {
                            class274.field4294[var7++] = var478.field3937;
                            continue;
                        }
                        if (var9 == 1608) {
                            class274.field4294[var7++] = var478.field3968;
                            continue;
                        }
                        if (var9 == 1609) {
                            class274.field4294[var7++] = var478.field4048;
                            continue;
                        }
                        if (var9 == 1610) {
                            class274.field4294[var7++] = var478.field4055;
                            continue;
                        }
                        if (var9 == 1611) {
                            class274.field4294[var7++] = var478.field3960;
                            continue;
                        }
                        if (var9 == 1612) {
                            class274.field4294[var7++] = var478.field3982;
                            continue;
                        }
                    } else if (var9 < 1800) {
                        class266 var53 = var46 ? class136.field2208 : class217.field3381;
                        if (var9 == 1700) {
                            class274.field4294[var7++] = var53.field3947;
                            continue;
                        }
                        if (var9 == 1701) {
                            if (var53.field3947 == -1) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = var53.field4016;
                            }
                            continue;
                        }
                        if (var9 == 1702) {
                            class274.field4294[var7++] = var53.field3958;
                            continue;
                        }
                    } else if (var9 < 1900) {
                        class266 var476 = var46 ? class136.field2208 : class217.field3381;
                        if (var9 == 1800) {
                            class274.field4294[var7++] = client.method1867(var476).method1777(-2171);
                            continue;
                        }
                        if (var9 == 1801) {
                            var7--;
                            int var477 = class274.field4294[var7];
                            int var529 = var477 - 1;
                            if (var476.field3950 != null && var476.field3950.length > var529 && var476.field3950[var529] != null) {
                                class344.field5334[var6++] = var476.field3950[var529];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 1802) {
                            if (var476.field3935 == null) {
                                class344.field5334[var6++] = "";
                            } else {
                                class344.field5334[var6++] = var476.field3935;
                            }
                            continue;
                        }
                    } else if (var9 < 2600) {
                        var7--;
                        class266 var54 = class171.method1276(class274.field4294[var7], (byte) 47);
                        if (var9 == 2500) {
                            class274.field4294[var7++] = var54.field4099;
                            continue;
                        }
                        if (var9 == 2501) {
                            class274.field4294[var7++] = var54.field4087;
                            continue;
                        }
                        if (var9 == 2502) {
                            class274.field4294[var7++] = var54.field3941;
                            continue;
                        }
                        if (var9 == 2503) {
                            class274.field4294[var7++] = var54.field3939;
                            continue;
                        }
                        if (var9 == 2504) {
                            class274.field4294[var7++] = var54.field4046 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 2505) {
                            class274.field4294[var7++] = var54.field3926;
                            continue;
                        }
                    } else if (var9 < 2700) {
                        var7--;
                        class266 var475 = class171.method1276(class274.field4294[var7], (byte) -125);
                        if (var9 == 2600) {
                            class274.field4294[var7++] = var475.field3951;
                            continue;
                        }
                        if (var9 == 2601) {
                            class274.field4294[var7++] = var475.field4045;
                            continue;
                        }
                        if (var9 == 2602) {
                            class344.field5334[var6++] = var475.field3927;
                            continue;
                        }
                        if (var9 == 2603) {
                            class274.field4294[var7++] = var475.field4019;
                            continue;
                        }
                        if (var9 == 2604) {
                            class274.field4294[var7++] = var475.field4097;
                            continue;
                        }
                        if (var9 == 2605) {
                            class274.field4294[var7++] = var475.field4105;
                            continue;
                        }
                        if (var9 == 2606) {
                            class274.field4294[var7++] = var475.field4020;
                            continue;
                        }
                        if (var9 == 2607) {
                            class274.field4294[var7++] = var475.field3937;
                            continue;
                        }
                        if (var9 == 2608) {
                            class274.field4294[var7++] = var475.field3968;
                            continue;
                        }
                        if (var9 == 2609) {
                            class274.field4294[var7++] = var475.field4048;
                            continue;
                        }
                        if (var9 == 2610) {
                            class274.field4294[var7++] = var475.field4055;
                            continue;
                        }
                        if (var9 == 2611) {
                            class274.field4294[var7++] = var475.field3960;
                            continue;
                        }
                        if (var9 == 2612) {
                            class274.field4294[var7++] = var475.field3982;
                            continue;
                        }
                    } else if (var9 < 2800) {
                        if (var9 == 2700) {
                            var7--;
                            class266 var55 = class171.method1276(class274.field4294[var7], (byte) -115);
                            class274.field4294[var7++] = var55.field3947;
                            continue;
                        }
                        if (var9 == 2701) {
                            var7--;
                            class266 var56 = class171.method1276(class274.field4294[var7], (byte) 74);
                            if (var56.field3947 == -1) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = var56.field4016;
                            }
                            continue;
                        }
                        if (var9 == 2702) {
                            var7--;
                            int var57 = class274.field4294[var7];
                            class24 var58 = (class24) class158.field2584.method79((long) var57, (byte) 0);
                            if (var58 == null) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = 1;
                            }
                            continue;
                        }
                        if (var9 == 2703) {
                            var7--;
                            class266 var59 = class171.method1276(class274.field4294[var7], (byte) 12);
                            if (var59.field3994 == null) {
                                class274.field4294[var7++] = 0;
                                continue;
                            }
                            int var60 = var59.field3994.length;
                            for (int var61 = 0; var61 < var59.field3994.length; var61++) {
                                if (var59.field3994[var61] == null) {
                                    var60 = var61;
                                    break;
                                }
                            }
                            class274.field4294[var7++] = var60;
                            continue;
                        }
                        if (var9 == 2704 || var9 == 2705) {
                            var7 -= 2;
                            int var62 = class274.field4294[var7 + 1];
                            int var63 = class274.field4294[var7];
                            class24 var64 = (class24) class158.field2584.method79((long) var63, (byte) 0);
                            if (var64 != null && var64.field417 == var62) {
                                class274.field4294[var7++] = 1;
                            } else {
                                class274.field4294[var7++] = 0;
                            }
                            continue;
                        }
                    } else if (var9 < 2900) {
                        var7--;
                        class266 var473 = class171.method1276(class274.field4294[var7], (byte) 74);
                        if (var9 == 2800) {
                            class274.field4294[var7++] = client.method1867(var473).method1777(-2171);
                            continue;
                        }
                        if (var9 == 2801) {
                            var7--;
                            int var474 = class274.field4294[var7];
                            int var528 = var474 - 1;
                            if (var473.field3950 != null && var528 < var473.field3950.length && var473.field3950[var528] != null) {
                                class344.field5334[var6++] = var473.field3950[var528];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 2802) {
                            if (var473.field3935 == null) {
                                class344.field5334[var6++] = "";
                            } else {
                                class344.field5334[var6++] = var473.field3935;
                            }
                            continue;
                        }
                    } else if (var9 < 3200) {
                        if (var9 == 3100) {
                            var6--;
                            String var65 = class344.field5334[var6];
                            class129.method1003(0, var65, "", -127);
                            continue;
                        }
                        if (var9 == 3101) {
                            var7 -= 2;
                            class3.method78(class345.field5363, class274.field4294[var7 + 1], class274.field4294[var7], true);
                            continue;
                        }
                        if (var9 == 3103) {
                            class86.method683(9049);
                            continue;
                        }
                        if (var9 == 3104) {
                            class328.field5130++;
                            int var66 = 0;
                            var6--;
                            String var67 = class344.field5334[var6];
                            if (class157.method1165(var67, true)) {
                                var66 = class299.method2119(var67, (byte) -127);
                            }
                            class209.field3305.method1808((byte) -74, 75);
                            class209.field3305.method11(var66, 31932);
                            continue;
                        }
                        if (var9 == 3105) {
                            class242.field3625++;
                            var6--;
                            String var68 = class344.field5334[var6];
                            class209.field3305.method1808((byte) -74, 112);
                            class209.field3305.method59(class106.method851(var68, -56), false);
                            continue;
                        }
                        if (var9 == 3106) {
                            class150.field2454++;
                            var6--;
                            String var69 = class344.field5334[var6];
                            class209.field3305.method1808((byte) -74, 1);
                            class209.field3305.method21(-112, var69.length() + 1);
                            class209.field3305.method12(var69, (byte) -47);
                            continue;
                        }
                        if (var9 == 3107) {
                            var7--;
                            int var70 = class274.field4294[var7];
                            var6--;
                            String var71 = class344.field5334[var6];
                            class264.method1824(var70, var71, (byte) -62);
                            continue;
                        }
                        if (var9 == 3108) {
                            var7 -= 3;
                            int var72 = class274.field4294[var7 + 1];
                            int var73 = class274.field4294[var7];
                            int var74 = class274.field4294[var7 + 2];
                            class266 var75 = class171.method1276(var74, (byte) -121);
                            class281.method1977((byte) 23, var73, var75, var72);
                            continue;
                        }
                        if (var9 == 3109) {
                            var7 -= 2;
                            int var76 = class274.field4294[var7 + 1];
                            int var77 = class274.field4294[var7];
                            class266 var78 = var46 ? class136.field2208 : class217.field3381;
                            class281.method1977((byte) 105, var77, var78, var76);
                            continue;
                        }
                        if (var9 == 3110) {
                            class338.field5216++;
                            var7--;
                            int var79 = class274.field4294[var7];
                            class209.field3305.method1808((byte) -74, 28);
                            class209.field3305.method14(-246866616, var79);
                            continue;
                        }
                    } else if (var9 < 3300) {
                        if (var9 == 3200) {
                            var7 -= 3;
                            class188.method1360(class274.field4294[var7 + 1], class274.field4294[var7 + 2], 255, class274.field4294[var7], -1);
                            continue;
                        }
                        if (var9 == 3201) {
                            var7--;
                            class83.method656((byte) -94, 255, class274.field4294[var7]);
                            continue;
                        }
                        if (var9 == 3202) {
                            var7 -= 2;
                            class120.method954(class274.field4294[var7 + 1], 106, class274.field4294[var7], 255);
                            continue;
                        }
                    } else if (var9 < 3400) {
                        if (var9 == 3300) {
                            class274.field4294[var7++] = field4869;
                            continue;
                        }
                        if (var9 == 3301) {
                            var7 -= 2;
                            int var439 = class274.field4294[var7];
                            int var440 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class315.method2229(var440, var439, (byte) 35);
                            continue;
                        }
                        if (var9 == 3302) {
                            var7 -= 2;
                            int var441 = class274.field4294[var7];
                            int var442 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = method2177((byte) 26, var441, var442);
                            continue;
                        }
                        if (var9 == 3303) {
                            var7 -= 2;
                            int var443 = class274.field4294[var7];
                            int var444 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class106.method852(var443, 0, var444);
                            continue;
                        }
                        if (var9 == 3304) {
                            var7--;
                            int var445 = class274.field4294[var7];
                            class274.field4294[var7++] = class117.method922(-91, var445).field354;
                            continue;
                        }
                        if (var9 == 3305) {
                            var7--;
                            int var446 = class274.field4294[var7];
                            class274.field4294[var7++] = class213.field3331[var446];
                            continue;
                        }
                        if (var9 == 3306) {
                            var7--;
                            int var447 = class274.field4294[var7];
                            class274.field4294[var7++] = class339.field5240[var447];
                            continue;
                        }
                        if (var9 == 3307) {
                            var7--;
                            int var448 = class274.field4294[var7];
                            class274.field4294[var7++] = class284.field4437[var448];
                            continue;
                        }
                        if (var9 == 3308) {
                            int var449 = class75.field1153;
                            int var450 = (class345.field5363.field4672 >> 7) + class133.field2118;
                            int var451 = (class345.field5363.field4671 >> 7) + class117.field1902;
                            class274.field4294[var7++] = (var449 << 28) + (var451 << 14) + var450;
                            continue;
                        }
                        if (var9 == 3309) {
                            var7--;
                            int var452 = class274.field4294[var7];
                            class274.field4294[var7++] = class164.method1234(var452 >> 14, 16383);
                            continue;
                        }
                        if (var9 == 3310) {
                            var7--;
                            int var453 = class274.field4294[var7];
                            class274.field4294[var7++] = var453 >> 28;
                            continue;
                        }
                        if (var9 == 3311) {
                            var7--;
                            int var454 = class274.field4294[var7];
                            class274.field4294[var7++] = class164.method1234(var454, 16383);
                            continue;
                        }
                        if (var9 == 3312) {
                            class274.field4294[var7++] = class179.field2854 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3313) {
                            var7 -= 2;
                            int var455 = class274.field4294[var7] + 32768;
                            int var456 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class315.method2229(var456, var455, (byte) 35);
                            continue;
                        }
                        if (var9 == 3314) {
                            var7 -= 2;
                            int var457 = class274.field4294[var7] + 32768;
                            int var458 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = method2177((byte) 26, var457, var458);
                            continue;
                        }
                        if (var9 == 3315) {
                            var7 -= 2;
                            int var459 = class274.field4294[var7] + 32768;
                            int var460 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class106.method852(var459, 0, var460);
                            continue;
                        }
                        if (var9 == 3316) {
                            if (class233.field3543 < 2) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = class233.field3543;
                            }
                            continue;
                        }
                        if (var9 == 3317) {
                            class274.field4294[var7++] = class260.field3870;
                            continue;
                        }
                        if (var9 == 3318) {
                            class274.field4294[var7++] = class1.field72;
                            continue;
                        }
                        if (var9 == 3321) {
                            class274.field4294[var7++] = class89.field1428;
                            continue;
                        }
                        if (var9 == 3322) {
                            class274.field4294[var7++] = class155.field2532;
                            continue;
                        }
                        if (var9 == 3323) {
                            if (class63.field929 >= 5 && class63.field929 <= 9) {
                                class274.field4294[var7++] = 1;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3324) {
                            if (class63.field929 >= 5 && class63.field929 <= 9) {
                                class274.field4294[var7++] = class63.field929;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3325) {
                            class274.field4294[var7++] = class89.field1427 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3326) {
                            class274.field4294[var7++] = class345.field5363.field1475;
                            continue;
                        }
                        if (var9 == 3327) {
                            class274.field4294[var7++] = class345.field5363.field1485.field4164 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3328) {
                            class274.field4294[var7++] = class241.field3614 && !class173.field2768 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3329) {
                            class274.field4294[var7++] = class241.field3615 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3330) {
                            var7--;
                            int var461 = class274.field4294[var7];
                            class274.field4294[var7++] = class213.method1549(var461, 0);
                            continue;
                        }
                        if (var9 == 3331) {
                            var7 -= 2;
                            int var462 = class274.field4294[var7];
                            int var463 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class63.method506(var462, false, -1, var463);
                            continue;
                        }
                        if (var9 == 3332) {
                            var7 -= 2;
                            int var464 = class274.field4294[var7];
                            int var465 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class63.method506(var464, true, arg2, var465);
                            continue;
                        }
                        if (var9 == 3333) {
                            class274.field4294[var7++] = class3.field99;
                            continue;
                        }
                        if (var9 == 3335) {
                            class274.field4294[var7++] = class28.field453;
                            continue;
                        }
                        if (var9 == 3336) {
                            var7 -= 4;
                            int var466 = class274.field4294[var7];
                            int var467 = class274.field4294[var7 + 1];
                            int var468 = class274.field4294[var7 + 2];
                            int var469 = class274.field4294[var7 + 3];
                            int var470 = (var467 << 14) + var466;
                            int var471 = (var468 << 28) + var470;
                            int var472 = var469 + var471;
                            class274.field4294[var7++] = var472;
                            continue;
                        }
                        if (var9 == 3337) {
                            class274.field4294[var7++] = class151.field2464;
                            continue;
                        }
                    } else if (var9 < 3500) {
                        if (var9 == 3400) {
                            var7 -= 2;
                            int var422 = class274.field4294[var7];
                            int var423 = class274.field4294[var7 + 1];
                            class168 var424 = class188.method1359(var422, 0);
                            if (var424.field2710 == 's') {
                            }
                            class344.field5334[var6++] = var424.method1259(var423, true);
                            continue;
                        }
                        if (var9 == 3408) {
                            var7 -= 4;
                            int var425 = class274.field4294[var7 + 2];
                            int var426 = class274.field4294[var7 + 1];
                            int var427 = class274.field4294[var7];
                            int var428 = class274.field4294[var7 + 3];
                            class168 var429 = class188.method1359(var425, 0);
                            if (var429.field2715 == var427 && var429.field2710 == var426) {
                                if (var426 == 115) {
                                    class344.field5334[var6++] = var429.method1259(var428, true);
                                } else {
                                    class274.field4294[var7++] = var429.method1257(var428, 45);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var9 == 3409) {
                            var7 -= 3;
                            int var430 = class274.field4294[var7 + 1];
                            int var431 = class274.field4294[var7 + 2];
                            int var432 = class274.field4294[var7];
                            if (var430 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class168 var433 = class188.method1359(var430, 0);
                            if (var433.field2710 != var432) {
                                throw new RuntimeException("C3409-1");
                            }
                            class274.field4294[var7++] = var433.method1258(var431, (byte) 104) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3410) {
                            var7--;
                            int var434 = class274.field4294[var7];
                            var6--;
                            String var435 = class344.field5334[var6];
                            if (var434 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class168 var436 = class188.method1359(var434, 0);
                            if (var436.field2710 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class274.field4294[var7++] = var436.method1250((byte) -73, var435) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3411) {
                            var7--;
                            int var437 = class274.field4294[var7];
                            class168 var438 = class188.method1359(var437, 0);
                            class274.field4294[var7++] = var438.field2706.method76((byte) -121);
                            continue;
                        }
                    } else if (var9 < 3700) {
                        if (var9 == 3600) {
                            if (class1.field44 == 0) {
                                class274.field4294[var7++] = -2;
                            } else if (class1.field44 == 1) {
                                class274.field4294[var7++] = -1;
                            } else {
                                class274.field4294[var7++] = class172.field2763;
                            }
                            continue;
                        }
                        if (var9 == 3601) {
                            var7--;
                            int var80 = class274.field4294[var7];
                            if (class1.field44 == 2 && var80 < class172.field2763) {
                                class344.field5334[var6++] = class129.field2066[var80];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 3602) {
                            var7--;
                            int var81 = class274.field4294[var7];
                            if (class1.field44 == 2 && class172.field2763 > var81) {
                                class274.field4294[var7++] = class296.field4725[var81];
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3603) {
                            var7--;
                            int var82 = class274.field4294[var7];
                            if (class1.field44 == 2 && var82 < class172.field2763) {
                                class274.field4294[var7++] = class227.field3506[var82];
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3604) {
                            var6--;
                            String var83 = class344.field5334[var6];
                            var7--;
                            int var84 = class274.field4294[var7];
                            class293.method2058(92, var84, var83);
                            continue;
                        }
                        if (var9 == 3605) {
                            var6--;
                            String var85 = class344.field5334[var6];
                            class272.method1940(class106.method851(var85, -75), true);
                            continue;
                        }
                        if (var9 == 3606) {
                            var6--;
                            String var86 = class344.field5334[var6];
                            class291.method2044(class106.method851(var86, -110), (byte) -29);
                            continue;
                        }
                        if (var9 == 3607) {
                            var6--;
                            String var87 = class344.field5334[var6];
                            class209.method1533(0, class106.method851(var87, -18), false);
                            continue;
                        }
                        if (var9 == 3608) {
                            var6--;
                            String var88 = class344.field5334[var6];
                            class282.method1984(-60, class106.method851(var88, -75));
                            continue;
                        }
                        if (var9 == 3609) {
                            var6--;
                            String var89 = class344.field5334[var6];
                            if (var89.startsWith("<img=0>") || var89.startsWith("<img=1>")) {
                                var89 = var89.substring(7);
                            }
                            class274.field4294[var7++] = class168.method1255(var89, -35) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3610) {
                            var7--;
                            int var90 = class274.field4294[var7];
                            if (class1.field44 == 2 && var90 < class172.field2763) {
                                class344.field5334[var6++] = class172.field2759[var90];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 3611) {
                            if (class174.field2780 == null) {
                                class344.field5334[var6++] = "";
                            } else {
                                class344.field5334[var6++] = class323.method2274(arg2 + 6, class174.field2780);
                            }
                            continue;
                        }
                        if (var9 == 3612) {
                            if (class174.field2780 == null) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = class131.field2105;
                            }
                            continue;
                        }
                        if (var9 == 3613) {
                            var7--;
                            int var91 = class274.field4294[var7];
                            if (class174.field2780 != null && var91 < class131.field2105) {
                                class344.field5334[var6++] = class323.method2274(5, class160.field2597[var91].field4976);
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 3614) {
                            var7--;
                            int var92 = class274.field4294[var7];
                            if (class174.field2780 != null && class131.field2105 > var92) {
                                class274.field4294[var7++] = class160.field2597[var92].field4978;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3615) {
                            var7--;
                            int var93 = class274.field4294[var7];
                            if (class174.field2780 != null && var93 < class131.field2105) {
                                class274.field4294[var7++] = class160.field2597[var93].field4972;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3616) {
                            class274.field4294[var7++] = class309.field4892;
                            continue;
                        }
                        if (var9 == 3617) {
                            var6--;
                            String var94 = class344.field5334[var6];
                            class337.method2347(var94, true);
                            continue;
                        }
                        if (var9 == 3618) {
                            class274.field4294[var7++] = class76.field1168;
                            continue;
                        }
                        if (var9 == 3619) {
                            var6--;
                            String var95 = class344.field5334[var6];
                            class179.method1317((byte) 123, class106.method851(var95, -52));
                            continue;
                        }
                        if (var9 == 3620) {
                            class288.method2030((byte) 58);
                            continue;
                        }
                        if (var9 == 3621) {
                            if (class1.field44 == 0) {
                                class274.field4294[var7++] = -1;
                            } else {
                                class274.field4294[var7++] = class321.field5024;
                            }
                            continue;
                        }
                        if (var9 == 3622) {
                            var7--;
                            int var96 = class274.field4294[var7];
                            if (class1.field44 != 0 && class321.field5024 > var96) {
                                class344.field5334[var6++] = class150.method1134(arg2 + 49, class158.field2587[var96]);
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 3623) {
                            var6--;
                            String var97 = class344.field5334[var6];
                            if (var97.startsWith("<img=0>") || var97.startsWith("<img=1>")) {
                                var97 = var97.substring(7);
                            }
                            class274.field4294[var7++] = class286.method2012(var97, false) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3624) {
                            var7--;
                            int var98 = class274.field4294[var7];
                            if (class160.field2597 != null && class131.field2105 > var98 && class160.field2597[var98].field4976.equalsIgnoreCase(class345.field5363.field1486)) {
                                class274.field4294[var7++] = 1;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3625) {
                            if (class32.field495 == null) {
                                class344.field5334[var6++] = "";
                            } else {
                                class344.field5334[var6++] = class323.method2274(5, class32.field495);
                            }
                            continue;
                        }
                        if (var9 == 3626) {
                            var7--;
                            int var99 = class274.field4294[var7];
                            if (class174.field2780 != null && class131.field2105 > var99) {
                                class344.field5334[var6++] = class160.field2597[var99].field4979;
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 3627) {
                            var7--;
                            int var100 = class274.field4294[var7];
                            if (class1.field44 == 2 && var100 >= 0 && class172.field2763 > var100) {
                                class274.field4294[var7++] = class301.field4799[var100] ? 1 : 0;
                                continue;
                            }
                            class274.field4294[var7++] = 0;
                            continue;
                        }
                        if (var9 == 3628) {
                            var6--;
                            String var101 = class344.field5334[var6];
                            if (var101.startsWith("<img=0>") || var101.startsWith("<img=1>")) {
                                var101 = var101.substring(7);
                            }
                            class274.field4294[var7++] = class36.method325(var101, 104);
                            continue;
                        }
                        if (var9 == 3629) {
                            class274.field4294[var7++] = class77.field1212;
                            continue;
                        }
                        if (var9 == 3630) {
                            var6--;
                            String var102 = class344.field5334[var6];
                            class209.method1533(0, class106.method851(var102, -36), true);
                            continue;
                        }
                        if (var9 == 3631) {
                            var7--;
                            int var103 = class274.field4294[var7];
                            class274.field4294[var7++] = class176.field2817[var103] ? 1 : 0;
                            continue;
                        }
                    } else if (var9 < 4000) {
                        if (var9 == 3903) {
                            var7--;
                            int var104 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var104].method194((byte) 114);
                            continue;
                        }
                        if (var9 == 3904) {
                            var7--;
                            int var105 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var105].field320;
                            continue;
                        }
                        if (var9 == 3905) {
                            var7--;
                            int var106 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var106].field327;
                            continue;
                        }
                        if (var9 == 3906) {
                            var7--;
                            int var107 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var107].field330;
                            continue;
                        }
                        if (var9 == 3907) {
                            var7--;
                            int var108 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var108].field325;
                            continue;
                        }
                        if (var9 == 3908) {
                            var7--;
                            int var109 = class274.field4294[var7];
                            class274.field4294[var7++] = class34.field515[var109].field323;
                            continue;
                        }
                        if (var9 == 3910) {
                            var7--;
                            int var110 = class274.field4294[var7];
                            int var111 = class34.field515[var110].method191(true);
                            class274.field4294[var7++] = var111 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3911) {
                            var7--;
                            int var112 = class274.field4294[var7];
                            int var113 = class34.field515[var112].method191(true);
                            class274.field4294[var7++] = var113 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3912) {
                            var7--;
                            int var114 = class274.field4294[var7];
                            int var115 = class34.field515[var114].method191(true);
                            class274.field4294[var7++] = var115 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 3913) {
                            var7--;
                            int var116 = class274.field4294[var7];
                            int var117 = class34.field515[var116].method191(true);
                            class274.field4294[var7++] = var117 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var9 < 4100) {
                        if (var9 == 4000) {
                            var7 -= 2;
                            int var118 = class274.field4294[var7];
                            int var119 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var118 + var119;
                            continue;
                        }
                        if (var9 == 4001) {
                            var7 -= 2;
                            int var120 = class274.field4294[var7 + 1];
                            int var121 = class274.field4294[var7];
                            class274.field4294[var7++] = var121 - var120;
                            continue;
                        }
                        if (var9 == 4002) {
                            var7 -= 2;
                            int var122 = class274.field4294[var7];
                            int var123 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var122 * var123;
                            continue;
                        }
                        if (var9 == 4003) {
                            var7 -= 2;
                            int var124 = class274.field4294[var7];
                            int var125 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var124 / var125;
                            continue;
                        }
                        if (var9 == 4004) {
                            var7--;
                            int var126 = class274.field4294[var7];
                            class274.field4294[var7++] = (int) ((double) var126 * Math.random());
                            continue;
                        }
                        if (var9 == 4005) {
                            var7--;
                            int var127 = class274.field4294[var7];
                            class274.field4294[var7++] = (int) ((double) (var127 + 1) * Math.random());
                            continue;
                        }
                        if (var9 == 4006) {
                            var7 -= 5;
                            int var128 = class274.field4294[var7 + 1];
                            int var129 = class274.field4294[var7 + 3];
                            int var130 = class274.field4294[var7 + 2];
                            int var131 = class274.field4294[var7 + 4];
                            int var132 = class274.field4294[var7];
                            class274.field4294[var7++] = (var131 - var130) * (var128 - var132) / (var129 - var130) + var132;
                            continue;
                        }
                        if (var9 == 4007) {
                            var7 -= 2;
                            long var133 = (long) class274.field4294[var7 + 1];
                            long var135 = (long) class274.field4294[var7];
                            class274.field4294[var7++] = (int) (var133 * var135 / 100L + var135);
                            continue;
                        }
                        if (var9 == 4008) {
                            var7 -= 2;
                            int var137 = class274.field4294[var7 + 1];
                            int var138 = class274.field4294[var7];
                            class274.field4294[var7++] = class251.method1740(0x1 << var137, var138);
                            continue;
                        }
                        if (var9 == 4009) {
                            var7 -= 2;
                            int var139 = class274.field4294[var7];
                            int var140 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class164.method1234(var139, -(0x1 << var140) - 1);
                            continue;
                        }
                        if (var9 == 4010) {
                            var7 -= 2;
                            int var141 = class274.field4294[var7 + 1];
                            int var142 = class274.field4294[var7];
                            class274.field4294[var7++] = class164.method1234(0x1 << var141, var142) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var9 == 4011) {
                            var7 -= 2;
                            int var143 = class274.field4294[var7];
                            int var144 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var143 % var144;
                            continue;
                        }
                        if (var9 == 4012) {
                            var7 -= 2;
                            int var145 = class274.field4294[var7];
                            int var146 = class274.field4294[var7 + 1];
                            if (var145 == 0) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = (int) Math.pow((double) var145, (double) var146);
                            }
                            continue;
                        }
                        if (var9 == 4013) {
                            var7 -= 2;
                            int var147 = class274.field4294[var7 + 1];
                            int var148 = class274.field4294[var7];
                            if (var148 == 0) {
                                class274.field4294[var7++] = 0;
                            } else if (var147 == 0) {
                                class274.field4294[var7++] = Integer.MAX_VALUE;
                            } else {
                                class274.field4294[var7++] = (int) Math.pow((double) var148, 1.0D / (double) var147);
                            }
                            continue;
                        }
                        if (var9 == 4014) {
                            var7 -= 2;
                            int var149 = class274.field4294[var7 + 1];
                            int var150 = class274.field4294[var7];
                            class274.field4294[var7++] = class164.method1234(var150, var149);
                            continue;
                        }
                        if (var9 == 4015) {
                            var7 -= 2;
                            int var151 = class274.field4294[var7];
                            int var152 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class251.method1740(var152, var151);
                            continue;
                        }
                        if (var9 == 4016) {
                            var7 -= 2;
                            int var153 = class274.field4294[var7];
                            int var154 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var153 >= var154 ? var154 : var153;
                            continue;
                        }
                        if (var9 == 4017) {
                            var7 -= 2;
                            int var155 = class274.field4294[var7 + 1];
                            int var156 = class274.field4294[var7];
                            class274.field4294[var7++] = var155 >= var156 ? var155 : var156;
                            continue;
                        }
                        if (var9 == 4018) {
                            var7 -= 3;
                            long var157 = (long) class274.field4294[var7];
                            long var159 = (long) class274.field4294[var7 + 1];
                            long var161 = (long) class274.field4294[var7 + 2];
                            class274.field4294[var7++] = (int) (var157 * var161 / var159);
                            continue;
                        }
                    } else if (var9 < 4200) {
                        if (var9 == 4100) {
                            var7--;
                            int var163 = class274.field4294[var7];
                            var6--;
                            String var164 = class344.field5334[var6];
                            class344.field5334[var6++] = var164 + var163;
                            continue;
                        }
                        if (var9 == 4101) {
                            var6 -= 2;
                            String var165 = class344.field5334[var6];
                            String var166 = class344.field5334[var6 + 1];
                            class344.field5334[var6++] = var165 + var166;
                            continue;
                        }
                        if (var9 == 4102) {
                            var6--;
                            String var167 = class344.field5334[var6];
                            var7--;
                            int var168 = class274.field4294[var7];
                            class344.field5334[var6++] = var167 + class81.method633((byte) -17, true, var168);
                            continue;
                        }
                        if (var9 == 4103) {
                            var6--;
                            String var169 = class344.field5334[var6];
                            class344.field5334[var6++] = var169.toLowerCase();
                            continue;
                        }
                        if (var9 == 4104) {
                            var7--;
                            int var170 = class274.field4294[var7];
                            long var171 = ((long) var170 + 11745L) * 86400000L;
                            class207.field3270.setTime(new Date(var171));
                            int var173 = class207.field3270.get(5);
                            int var174 = class207.field3270.get(2);
                            int var175 = class207.field3270.get(1);
                            class344.field5334[var6++] = var173 + "-" + class284.field4433[var174] + "-" + var175;
                            continue;
                        }
                        if (var9 == 4105) {
                            var6 -= 2;
                            String var176 = class344.field5334[var6 + 1];
                            String var177 = class344.field5334[var6];
                            if (class345.field5363.field1485 != null && class345.field5363.field1485.field4164) {
                                class344.field5334[var6++] = var176;
                                continue;
                            }
                            class344.field5334[var6++] = var177;
                            continue;
                        }
                        if (var9 == 4106) {
                            var7--;
                            int var178 = class274.field4294[var7];
                            class344.field5334[var6++] = Integer.toString(var178);
                            continue;
                        }
                        if (var9 == 4107) {
                            var6 -= 2;
                            class274.field4294[var7++] = class149.method1126(class160.method1184(class344.field5334[var6 + 1], class344.field5334[var6], class28.field453, -29324), (byte) 18);
                            continue;
                        }
                        if (var9 == 4108) {
                            var6--;
                            String var179 = class344.field5334[var6];
                            var7 -= 2;
                            int var180 = class274.field4294[var7];
                            int var181 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class211.method1539(var181, 0).method1470(var179, var180);
                            continue;
                        }
                        if (var9 == 4109) {
                            var7 -= 2;
                            var6--;
                            String var182 = class344.field5334[var6];
                            int var183 = class274.field4294[var7];
                            int var184 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = class211.method1539(var184, 0).method1489(var182, var183);
                            continue;
                        }
                        if (var9 == 4110) {
                            var6 -= 2;
                            String var185 = class344.field5334[var6 + 1];
                            String var186 = class344.field5334[var6];
                            var7--;
                            if (class274.field4294[var7] == 1) {
                                class344.field5334[var6++] = var186;
                            } else {
                                class344.field5334[var6++] = var185;
                            }
                            continue;
                        }
                        if (var9 == 4111) {
                            var6--;
                            String var187 = class344.field5334[var6];
                            class344.field5334[var6++] = class205.method1478(var187);
                            continue;
                        }
                        if (var9 == 4112) {
                            var6--;
                            String var188 = class344.field5334[var6];
                            var7--;
                            int var189 = class274.field4294[var7];
                            if (var189 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class344.field5334[var6++] = var188 + (char) var189;
                            continue;
                        }
                        if (var9 == 4113) {
                            var7--;
                            int var190 = class274.field4294[var7];
                            class274.field4294[var7++] = class106.method850((char) var190, class85.method677(arg2, 102)) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4114) {
                            var7--;
                            int var191 = class274.field4294[var7];
                            class274.field4294[var7++] = class60.method490(false, (char) var191) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4115) {
                            var7--;
                            int var192 = class274.field4294[var7];
                            class274.field4294[var7++] = class31.method284((char) var192, arg2 + 127) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4116) {
                            var7--;
                            int var193 = class274.field4294[var7];
                            class274.field4294[var7++] = class342.method2374((char) var193, 57) ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4117) {
                            var6--;
                            String var194 = class344.field5334[var6];
                            if (var194 == null) {
                                class274.field4294[var7++] = 0;
                            } else {
                                class274.field4294[var7++] = var194.length();
                            }
                            continue;
                        }
                        if (var9 == 4118) {
                            var7 -= 2;
                            var6--;
                            String var195 = class344.field5334[var6];
                            int var196 = class274.field4294[var7];
                            int var197 = class274.field4294[var7 + 1];
                            class344.field5334[var6++] = var195.substring(var196, var197);
                            continue;
                        }
                        if (var9 == 4119) {
                            var6--;
                            String var198 = class344.field5334[var6];
                            StringBuffer var199 = new StringBuffer(var198.length());
                            boolean var200 = false;
                            for (int var201 = 0; var198.length() > var201; var201++) {
                                char var202 = var198.charAt(var201);
                                if (var202 == '<') {
                                    var200 = true;
                                } else if (var202 == '>') {
                                    var200 = false;
                                } else if (!var200) {
                                    var199.append(var202);
                                }
                            }
                            class344.field5334[var6++] = var199.toString();
                            continue;
                        }
                        if (var9 == 4120) {
                            var7 -= 2;
                            var6--;
                            String var203 = class344.field5334[var6];
                            int var204 = class274.field4294[var7];
                            int var205 = class274.field4294[var7 + 1];
                            class274.field4294[var7++] = var203.indexOf(var204, var205);
                            continue;
                        }
                        if (var9 == 4121) {
                            var7--;
                            int var206 = class274.field4294[var7];
                            var6 -= 2;
                            String var207 = class344.field5334[var6];
                            String var208 = class344.field5334[var6 + 1];
                            class274.field4294[var7++] = var207.indexOf(var208, var206);
                            continue;
                        }
                        if (var9 == 4122) {
                            var7--;
                            int var209 = class274.field4294[var7];
                            class274.field4294[var7++] = Character.toLowerCase((char) var209);
                            continue;
                        }
                        if (var9 == 4123) {
                            var7--;
                            int var210 = class274.field4294[var7];
                            class274.field4294[var7++] = Character.toUpperCase((char) var210);
                            continue;
                        }
                        if (var9 == 4124) {
                            var7--;
                            boolean var211 = class274.field4294[var7] != 0;
                            var7--;
                            int var212 = class274.field4294[var7];
                            class344.field5334[var6++] = class39.method344(var211, 0, class85.method677(arg2, -23486), class28.field453, (long) var212);
                            continue;
                        }
                    } else if (var9 < 4300) {
                        if (var9 == 4200) {
                            var7--;
                            int var403 = class274.field4294[var7];
                            class344.field5334[var6++] = class188.method1361(true, var403).field2200;
                            continue;
                        }
                        if (var9 == 4201) {
                            var7 -= 2;
                            int var404 = class274.field4294[var7 + 1];
                            int var405 = class274.field4294[var7];
                            class135 var406 = class188.method1361(true, var405);
                            if (var404 >= 1 && var404 <= 5 && var406.field2186[var404 - 1] != null) {
                                class344.field5334[var6++] = var406.field2186[var404 - 1];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 4202) {
                            var7 -= 2;
                            int var407 = class274.field4294[var7 + 1];
                            int var408 = class274.field4294[var7];
                            class135 var409 = class188.method1361(true, var408);
                            if (var407 >= 1 && var407 <= 5 && var409.field2188[var407 - 1] != null) {
                                class344.field5334[var6++] = var409.field2188[var407 - 1];
                                continue;
                            }
                            class344.field5334[var6++] = "";
                            continue;
                        }
                        if (var9 == 4203) {
                            var7--;
                            int var410 = class274.field4294[var7];
                            class274.field4294[var7++] = class188.method1361(true, var410).field2159;
                            continue;
                        }
                        if (var9 == 4204) {
                            var7--;
                            int var411 = class274.field4294[var7];
                            class274.field4294[var7++] = class188.method1361(true, var411).field2198 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4205) {
                            var7--;
                            int var412 = class274.field4294[var7];
                            class135 var413 = class188.method1361(true, var412);
                            if (var413.field2185 == -1 && var413.field2178 >= 0) {
                                class274.field4294[var7++] = var413.field2178;
                                continue;
                            }
                            class274.field4294[var7++] = var412;
                            continue;
                        }
                        if (var9 == 4206) {
                            var7--;
                            int var414 = class274.field4294[var7];
                            class135 var415 = class188.method1361(true, var414);
                            if (var415.field2185 >= 0 && var415.field2178 >= 0) {
                                class274.field4294[var7++] = var415.field2178;
                                continue;
                            }
                            class274.field4294[var7++] = var414;
                            continue;
                        }
                        if (var9 == 4207) {
                            var7--;
                            int var416 = class274.field4294[var7];
                            class274.field4294[var7++] = class188.method1361(true, var416).field2191 ? 1 : 0;
                            continue;
                        }
                        if (var9 == 4208) {
                            var7 -= 2;
                            int var417 = class274.field4294[var7];
                            int var418 = class274.field4294[var7 + 1];
                            class139 var419 = class331.method2317((byte) -30, var418);
                            if (var419.method1067(86)) {
                                class344.field5334[var6++] = class188.method1361(true, var417).method1031(var418, var419.field2245, 28723);
                            } else {
                                class274.field4294[var7++] = class188.method1361(true, var417).method1032(var418, (byte) -48, var419.field2255);
                            }
                            continue;
                        }
                        if (var9 == 4210) {
                            var6--;
                            String var420 = class344.field5334[var6];
                            var7--;
                            int var421 = class274.field4294[var7];
                            class57.method475(var421 == 1, var420, 30576);
                            class274.field4294[var7++] = class36.field531;
                            continue;
                        }
                        if (var9 == 4211) {
                            if (class332.field5183 != null && class105.field1732 < class36.field531) {
                                class274.field4294[var7++] = class164.method1234(65535, class332.field5183[class105.field1732++]);
                                continue;
                            }
                            class274.field4294[var7++] = -1;
                            continue;
                        }
                        if (var9 == 4212) {
                            class105.field1732 = 0;
                            continue;
                        }
                    } else if (var9 >= 4400) {
                        if (var9 < 4500) {
                            if (var9 == 4400) {
                                var7 -= 2;
                                int var213 = class274.field4294[var7];
                                int var214 = class274.field4294[var7 + 1];
                                class139 var215 = class331.method2317((byte) -30, var214);
                                if (var215.method1067(arg2 + 86)) {
                                    class344.field5334[var6++] = class288.method2025(var213, -1).method818((byte) -124, var215.field2245, var214);
                                } else {
                                    class274.field4294[var7++] = class288.method2025(var213, -1).method821(-85, var214, var215.field2255);
                                }
                                continue;
                            }
                        } else if (var9 < 4600) {
                            if (var9 == 4500) {
                                var7 -= 2;
                                int var216 = class274.field4294[var7];
                                int var217 = class274.field4294[var7 + 1];
                                class139 var218 = class331.method2317((byte) -30, var217);
                                if (var218.method1067(arg2 ^ 0xFFFFFFB1)) {
                                    class344.field5334[var6++] = class181.method1324(var216, class85.method677(arg2, -93)).method2354(0, var218.field2245, var217);
                                } else {
                                    class274.field4294[var7++] = class181.method1324(var216, arg2 + 85).method2361(-102, var218.field2255, var217);
                                }
                                continue;
                            }
                        } else if (var9 < 5100) {
                            if (var9 == 5000) {
                                class274.field4294[var7++] = class41.field623;
                                continue;
                            }
                            if (var9 == 5001) {
                                class244.field3654++;
                                var7 -= 3;
                                class41.field623 = class274.field4294[var7];
                                class32.field498 = class274.field4294[var7 + 1];
                                class270.field4154 = class274.field4294[var7 + 2];
                                class209.field3305.method1808((byte) -74, 204);
                                class209.field3305.method21(-103, class41.field623);
                                class209.field3305.method21(48, class32.field498);
                                class209.field3305.method21(arg2 - 104, class270.field4154);
                                continue;
                            }
                            if (var9 == 5002) {
                                var7 -= 2;
                                var6--;
                                String var335 = class344.field5334[var6];
                                class20.field360++;
                                int var336 = class274.field4294[var7 + 1];
                                int var337 = class274.field4294[var7];
                                class209.field3305.method1808((byte) -74, 88);
                                class209.field3305.method59(class106.method851(var335, -91), false);
                                class209.field3305.method21(36, var337 - 1);
                                class209.field3305.method21(35, var336);
                                continue;
                            }
                            if (var9 == 5003) {
                                var7--;
                                int var338 = class274.field4294[var7];
                                String var339 = null;
                                if (var338 < 100) {
                                    var339 = class82.field1270[var338];
                                }
                                if (var339 == null) {
                                    var339 = "";
                                }
                                class344.field5334[var6++] = var339;
                                continue;
                            }
                            if (var9 == 5004) {
                                var7--;
                                int var340 = class274.field4294[var7];
                                int var341 = -1;
                                if (var340 < 100 && class82.field1270[var340] != null) {
                                    var341 = class118.field1916[var340];
                                }
                                class274.field4294[var7++] = var341;
                                continue;
                            }
                            if (var9 == 5005) {
                                class274.field4294[var7++] = class32.field498;
                                continue;
                            }
                            if (var9 == 5008) {
                                var6--;
                                String var342 = class344.field5334[var6];
                                if (var342.startsWith("::")) {
                                    class126.method993((byte) 99, var342);
                                    continue;
                                }
                                if (class233.field3543 == 0 && (class241.field3614 && !class173.field2768 || class241.field3615)) {
                                    continue;
                                }
                                class294.field4670++;
                                byte var343 = 0;
                                String var344 = var342.toLowerCase();
                                if (var344.startsWith(class116.field1891)) {
                                    var342 = var342.substring(class116.field1891.length());
                                    var343 = 0;
                                } else if (var344.startsWith(class209.field3304)) {
                                    var342 = var342.substring(class209.field3304.length());
                                    var343 = 1;
                                } else if (var344.startsWith(class76.field1189)) {
                                    var343 = 2;
                                    var342 = var342.substring(class76.field1189.length());
                                } else if (var344.startsWith(class200.field3058)) {
                                    var342 = var342.substring(class200.field3058.length());
                                    var343 = 3;
                                } else if (var344.startsWith(class259.field3848)) {
                                    var343 = 4;
                                    var342 = var342.substring(class259.field3848.length());
                                } else if (var344.startsWith(class214.field3338)) {
                                    var343 = 5;
                                    var342 = var342.substring(class214.field3338.length());
                                } else if (var344.startsWith(class174.field2779)) {
                                    var342 = var342.substring(class174.field2779.length());
                                    var343 = 6;
                                } else if (var344.startsWith(class217.field3382)) {
                                    var342 = var342.substring(class217.field3382.length());
                                    var343 = 7;
                                } else if (var344.startsWith(class14.field308)) {
                                    var342 = var342.substring(class14.field308.length());
                                    var343 = 8;
                                } else if (var344.startsWith(class245.field3661)) {
                                    var342 = var342.substring(class245.field3661.length());
                                    var343 = 9;
                                } else if (var344.startsWith(class181.field2879)) {
                                    var342 = var342.substring(class181.field2879.length());
                                    var343 = 10;
                                } else if (var344.startsWith(class286.field4456)) {
                                    var343 = 11;
                                    var342 = var342.substring(class286.field4456.length());
                                } else if (class28.field453 != 0) {
                                    if (var344.startsWith(class173.field2774)) {
                                        var342 = var342.substring(class173.field2774.length());
                                        var343 = 0;
                                    } else if (var344.startsWith(class4.field111)) {
                                        var343 = 1;
                                        var342 = var342.substring(class4.field111.length());
                                    } else if (var344.startsWith(class86.field1382)) {
                                        var342 = var342.substring(class86.field1382.length());
                                        var343 = 2;
                                    } else if (var344.startsWith(class135.field2165)) {
                                        var343 = 3;
                                        var342 = var342.substring(class135.field2165.length());
                                    } else if (var344.startsWith(class24.field418)) {
                                        var343 = 4;
                                        var342 = var342.substring(class24.field418.length());
                                    } else if (var344.startsWith(class154.field2508)) {
                                        var343 = 5;
                                        var342 = var342.substring(class154.field2508.length());
                                    } else if (var344.startsWith(class220.field3436)) {
                                        var343 = 6;
                                        var342 = var342.substring(class220.field3436.length());
                                    } else if (var344.startsWith(class34.field513)) {
                                        var342 = var342.substring(class34.field513.length());
                                        var343 = 7;
                                    } else if (var344.startsWith(class116.field1886)) {
                                        var342 = var342.substring(class116.field1886.length());
                                        var343 = 8;
                                    } else if (var344.startsWith(class179.field2857)) {
                                        var342 = var342.substring(class179.field2857.length());
                                        var343 = 9;
                                    } else if (var344.startsWith(class337.field5210)) {
                                        var343 = 10;
                                        var342 = var342.substring(class337.field5210.length());
                                    } else if (var344.startsWith(class121.field1979)) {
                                        var342 = var342.substring(class121.field1979.length());
                                        var343 = 11;
                                    }
                                }
                                byte var345 = 0;
                                String var346 = var342.toLowerCase();
                                if (var346.startsWith(class12.field278)) {
                                    var345 = 1;
                                    var342 = var342.substring(class12.field278.length());
                                } else if (var346.startsWith(class157.field2576)) {
                                    var345 = 2;
                                    var342 = var342.substring(class157.field2576.length());
                                } else if (var346.startsWith(class64.field947)) {
                                    var342 = var342.substring(class64.field947.length());
                                    var345 = 3;
                                } else if (var346.startsWith(class26.field439)) {
                                    var342 = var342.substring(class26.field439.length());
                                    var345 = 4;
                                } else if (var346.startsWith(class100.field1594)) {
                                    var345 = 5;
                                    var342 = var342.substring(class100.field1594.length());
                                } else if (class28.field453 != 0) {
                                    if (var346.startsWith(class160.field2602)) {
                                        var345 = 1;
                                        var342 = var342.substring(class160.field2602.length());
                                    } else if (var346.startsWith(class338.field5223)) {
                                        var345 = 2;
                                        var342 = var342.substring(class338.field5223.length());
                                    } else if (var346.startsWith(class338.field5221)) {
                                        var345 = 3;
                                        var342 = var342.substring(class338.field5221.length());
                                    } else if (var346.startsWith(class185.field2934)) {
                                        var342 = var342.substring(class185.field2934.length());
                                        var345 = 4;
                                    } else if (var346.startsWith(class318.field4995)) {
                                        var342 = var342.substring(class318.field4995.length());
                                        var345 = 5;
                                    }
                                }
                                class209.field3305.method1808((byte) -74, 178);
                                class209.field3305.method21(arg2 ^ 0xFFFFFFD0, 0);
                                int var347 = class209.field3305.field48;
                                class209.field3305.method21(71, var343);
                                class209.field3305.method21(-106, var345);
                                class58.method481((byte) 19, var342, class209.field3305);
                                class209.field3305.method2(84, class209.field3305.field48 - var347);
                                continue;
                            }
                            if (var9 == 5009) {
                                var6 -= 2;
                                String var348 = class344.field5334[var6];
                                String var349 = class344.field5334[var6 + 1];
                                if (class233.field3543 != 0 || (!class241.field3614 || class173.field2768) && !class241.field3615) {
                                    class289.field4556++;
                                    class209.field3305.method1808((byte) -74, 84);
                                    class209.field3305.method21(103, 0);
                                    int var350 = class209.field3305.field48;
                                    class209.field3305.method59(class106.method851(var348, -82), false);
                                    class58.method481((byte) 19, var349, class209.field3305);
                                    class209.field3305.method2(arg2 ^ 0xFFFFFFBD, class209.field3305.field48 - var350);
                                }
                                continue;
                            }
                            if (var9 == 5010) {
                                var7--;
                                int var351 = class274.field4294[var7];
                                String var352 = null;
                                if (var351 < 100) {
                                    var352 = class195.field3016[var351];
                                }
                                if (var352 == null) {
                                    var352 = "";
                                }
                                class344.field5334[var6++] = var352;
                                continue;
                            }
                            if (var9 == 5011) {
                                var7--;
                                int var353 = class274.field4294[var7];
                                String var354 = null;
                                if (var353 < 100) {
                                    var354 = class297.field4777[var353];
                                }
                                if (var354 == null) {
                                    var354 = "";
                                }
                                class344.field5334[var6++] = var354;
                                continue;
                            }
                            if (var9 == 5012) {
                                int var355 = -1;
                                var7--;
                                int var356 = class274.field4294[var7];
                                if (var356 < 100) {
                                    var355 = class274.field4291[var356];
                                }
                                class274.field4294[var7++] = var355;
                                continue;
                            }
                            if (var9 == 5015) {
                                String var357;
                                if (class345.field5363 == null || class345.field5363.field1486 == null) {
                                    var357 = class314.field4949;
                                } else {
                                    var357 = class345.field5363.method735((byte) 117);
                                }
                                class344.field5334[var6++] = var357;
                                continue;
                            }
                            if (var9 == 5016) {
                                class274.field4294[var7++] = class270.field4154;
                                continue;
                            }
                            if (var9 == 5017) {
                                class274.field4294[var7++] = class89.field1423;
                                continue;
                            }
                            if (var9 == 5050) {
                                var7--;
                                int var358 = class274.field4294[var7];
                                class344.field5334[var6++] = class198.method1401(0, var358).field3486;
                                continue;
                            }
                            if (var9 == 5051) {
                                var7--;
                                int var359 = class274.field4294[var7];
                                class225 var360 = class198.method1401(arg2 + 1, var359);
                                if (var360.field3477 == null) {
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var360.field3477.length;
                                }
                                continue;
                            }
                            if (var9 == 5052) {
                                var7 -= 2;
                                int var361 = class274.field4294[var7];
                                int var362 = class274.field4294[var7 + 1];
                                class225 var363 = class198.method1401(~arg2, var361);
                                int var364 = var363.field3477[var362];
                                class274.field4294[var7++] = var364;
                                continue;
                            }
                            if (var9 == 5053) {
                                var7--;
                                int var365 = class274.field4294[var7];
                                class225 var366 = class198.method1401(0, var365);
                                if (var366.field3493 == null) {
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var366.field3493.length;
                                }
                                continue;
                            }
                            if (var9 == 5054) {
                                var7 -= 2;
                                int var367 = class274.field4294[var7];
                                int var368 = class274.field4294[var7 + 1];
                                class274.field4294[var7++] = class198.method1401(0, var367).field3493[var368];
                                continue;
                            }
                            if (var9 == 5055) {
                                var7--;
                                int var369 = class274.field4294[var7];
                                class344.field5334[var6++] = class63.method502(-32769, var369).method2290(true);
                                continue;
                            }
                            if (var9 == 5056) {
                                var7--;
                                int var370 = class274.field4294[var7];
                                class326 var371 = class63.method502(arg2 - 32768, var370);
                                if (var371.field5087 == null) {
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var371.field5087.length;
                                }
                                continue;
                            }
                            if (var9 == 5057) {
                                var7 -= 2;
                                int var372 = class274.field4294[var7];
                                int var373 = class274.field4294[var7 + 1];
                                class274.field4294[var7++] = class63.method502(-32769, var372).field5087[var373];
                                continue;
                            }
                            if (var9 == 5058) {
                                class171.field2754 = new class190();
                                var7--;
                                class171.field2754.field2981 = class274.field4294[var7];
                                class171.field2754.field2980 = class63.method502(-32769, class171.field2754.field2981);
                                class171.field2754.field2976 = new int[class171.field2754.field2980.method2292(~arg2)];
                                continue;
                            }
                            if (var9 == 5059) {
                                class209.field3305.method1808((byte) -74, 200);
                                class209.field3305.method21(89, 0);
                                class182.field2881++;
                                int var374 = class209.field3305.field48;
                                class209.field3305.method21(-114, 0);
                                class209.field3305.method14(-246866616, class171.field2754.field2981);
                                class171.field2754.field2980.method2298(class171.field2754.field2976, true, class209.field3305);
                                class209.field3305.method2(59, class209.field3305.field48 - var374);
                                continue;
                            }
                            if (var9 == 5060) {
                                var6--;
                                String var375 = class344.field5334[var6];
                                class209.field3305.method1808((byte) -74, 86);
                                class145.field2349++;
                                class209.field3305.method21(-94, 0);
                                int var376 = class209.field3305.field48;
                                class209.field3305.method59(class106.method851(var375, -63), false);
                                class209.field3305.method14(-246866616, class171.field2754.field2981);
                                class171.field2754.field2980.method2298(class171.field2754.field2976, true, class209.field3305);
                                class209.field3305.method2(30, class209.field3305.field48 - var376);
                                continue;
                            }
                            if (var9 == 5061) {
                                class209.field3305.method1808((byte) -74, 200);
                                class182.field2881++;
                                class209.field3305.method21(arg2 - 119, 0);
                                int var377 = class209.field3305.field48;
                                class209.field3305.method21(56, 1);
                                class209.field3305.method14(-246866616, class171.field2754.field2981);
                                class171.field2754.field2980.method2298(class171.field2754.field2976, true, class209.field3305);
                                class209.field3305.method2(32, class209.field3305.field48 - var377);
                                continue;
                            }
                            if (var9 == 5062) {
                                var7 -= 2;
                                int var378 = class274.field4294[var7 + 1];
                                int var379 = class274.field4294[var7];
                                class274.field4294[var7++] = class198.method1401(0, var379).field3491[var378];
                                continue;
                            }
                            if (var9 == 5063) {
                                var7 -= 2;
                                int var380 = class274.field4294[var7];
                                int var381 = class274.field4294[var7 + 1];
                                class274.field4294[var7++] = class198.method1401(0, var380).field3485[var381];
                                continue;
                            }
                            if (var9 == 5064) {
                                var7 -= 2;
                                int var382 = class274.field4294[var7];
                                int var383 = class274.field4294[var7 + 1];
                                if (var383 == -1) {
                                    class274.field4294[var7++] = -1;
                                } else {
                                    class274.field4294[var7++] = class198.method1401(class85.method677(arg2, -1), var382).method1649((byte) 103, (char) var383);
                                }
                                continue;
                            }
                            if (var9 == 5065) {
                                var7 -= 2;
                                int var384 = class274.field4294[var7];
                                int var385 = class274.field4294[var7 + 1];
                                if (var385 == -1) {
                                    class274.field4294[var7++] = -1;
                                } else {
                                    class274.field4294[var7++] = class198.method1401(0, var384).method1648((char) var385, (byte) 69);
                                }
                                continue;
                            }
                            if (var9 == 5066) {
                                var7--;
                                int var386 = class274.field4294[var7];
                                class274.field4294[var7++] = class63.method502(-32769, var386).method2292(0);
                                continue;
                            }
                            if (var9 == 5067) {
                                var7 -= 2;
                                int var387 = class274.field4294[var7];
                                int var388 = class274.field4294[var7 + 1];
                                int var389 = class63.method502(-32769, var387).method2293(13986, var388);
                                class274.field4294[var7++] = var389;
                                continue;
                            }
                            if (var9 == 5068) {
                                var7 -= 2;
                                int var390 = class274.field4294[var7];
                                int var391 = class274.field4294[var7 + 1];
                                class171.field2754.field2976[var390] = var391;
                                continue;
                            }
                            if (var9 == 5069) {
                                var7 -= 2;
                                int var392 = class274.field4294[var7 + 1];
                                int var393 = class274.field4294[var7];
                                class171.field2754.field2976[var393] = var392;
                                continue;
                            }
                            if (var9 == 5070) {
                                var7 -= 3;
                                int var394 = class274.field4294[var7];
                                int var395 = class274.field4294[var7 + 1];
                                int var396 = class274.field4294[var7 + 2];
                                class326 var397 = class63.method502(arg2 - 32768, var394);
                                if (var397.method2293(arg2 + 13987, var395) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class274.field4294[var7++] = var397.method2297(var395, var396, (byte) -100);
                                continue;
                            }
                            if (var9 == 5071) {
                                var6--;
                                String var398 = class344.field5334[var6];
                                var7--;
                                boolean var399 = class274.field4294[var7] == 1;
                                class216.method1563(var398, (byte) 41, var399);
                                class274.field4294[var7++] = class36.field531;
                                continue;
                            }
                            if (var9 == 5072) {
                                if (class332.field5183 != null && class105.field1732 < class36.field531) {
                                    class274.field4294[var7++] = class164.method1234(65535, class332.field5183[class105.field1732++]);
                                    continue;
                                }
                                class274.field4294[var7++] = -1;
                                continue;
                            }
                            if (var9 == 5073) {
                                class105.field1732 = 0;
                                continue;
                            }
                        } else if (var9 < 5200) {
                            if (var9 == 5100) {
                                if (class48.field737[86]) {
                                    class274.field4294[var7++] = 1;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 5101) {
                                if (class48.field737[82]) {
                                    class274.field4294[var7++] = 1;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 5102) {
                                if (class48.field737[81]) {
                                    class274.field4294[var7++] = 1;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                        } else if (var9 < 5300) {
                            if (var9 == 5200) {
                                var7--;
                                class16.method192(class274.field4294[var7], (byte) 102);
                                continue;
                            }
                            if (var9 == 5201) {
                                class274.field4294[var7++] = class93.method740(false);
                                continue;
                            }
                            if (var9 == 5202) {
                                var7--;
                                class66.method526((byte) 41, class274.field4294[var7]);
                                continue;
                            }
                            if (var9 == 5203) {
                                var6--;
                                class237.method1692(class344.field5334[var6], (byte) -1);
                                continue;
                            }
                            if (var9 == 5204) {
                                class344.field5334[var6 - 1] = class225.method1652(-128, class344.field5334[var6 - 1]);
                                continue;
                            }
                            if (var9 == 5205) {
                                var7--;
                                class5.method92(false, -1, -1, class274.field4294[var7]);
                                continue;
                            }
                            if (var9 == 5206) {
                                var7--;
                                int var219 = class274.field4294[var7];
                                class91 var220 = class255.method1767((var219 & 0xFFFF393) >> 14, -1, var219 & 0x3FFF);
                                if (var220 == null) {
                                    class274.field4294[var7++] = -1;
                                } else {
                                    class274.field4294[var7++] = var220.field1456;
                                }
                                continue;
                            }
                            if (var9 == 5207) {
                                var7--;
                                class91 var221 = class305.method2167(class274.field4294[var7], (byte) -124);
                                if (var221 != null && var221.field1459 != null) {
                                    class344.field5334[var6++] = var221.field1459;
                                    continue;
                                }
                                class344.field5334[var6++] = "";
                                continue;
                            }
                            if (var9 == 5208) {
                                class274.field4294[var7++] = class245.field3662;
                                class274.field4294[var7++] = class84.field1303;
                                continue;
                            }
                            if (var9 == 5209) {
                                class274.field4294[var7++] = class227.field3512 + class180.field2863;
                                class274.field4294[var7++] = class286.field4473 + class188.field2953 - class67.field1013 - 1;
                                continue;
                            }
                            if (var9 == 5210) {
                                var7--;
                                int var222 = class274.field4294[var7];
                                class91 var223 = class305.method2167(var222, (byte) -124);
                                if (var223 == null) {
                                    class274.field4294[var7++] = 0;
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = class164.method1234(var223.field1458, 268431761) >> 14;
                                    class274.field4294[var7++] = class164.method1234(16383, var223.field1458);
                                }
                                continue;
                            }
                            if (var9 == 5211) {
                                var7--;
                                int var224 = class274.field4294[var7];
                                class91 var225 = class305.method2167(var224, (byte) -124);
                                if (var225 == null) {
                                    class274.field4294[var7++] = 0;
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var225.field1461 - var225.field1454;
                                    class274.field4294[var7++] = var225.field1452 - var225.field1462;
                                }
                                continue;
                            }
                            if (var9 == 5212) {
                                int var226 = class304.method2161((byte) -94);
                                int var227 = 0;
                                String var228;
                                if (var226 == -1) {
                                    var228 = "";
                                } else {
                                    var228 = class62.field903.field1775[var226];
                                    var227 = class62.field903.method860(var226, (byte) -77);
                                }
                                String var229 = class220.method1603(" ", (byte) 5, "<br>", var228);
                                class344.field5334[var6++] = var229;
                                class274.field4294[var7++] = var227;
                                continue;
                            }
                            if (var9 == 5213) {
                                int var230 = class64.method513(100);
                                int var231 = 0;
                                String var232;
                                if (var230 == -1) {
                                    var232 = "";
                                } else {
                                    var232 = class62.field903.field1775[var230];
                                    var231 = class62.field903.method860(var230, (byte) -77);
                                }
                                String var233 = class220.method1603(" ", (byte) 5, "<br>", var232);
                                class344.field5334[var6++] = var233;
                                class274.field4294[var7++] = var231;
                                continue;
                            }
                            if (var9 == 5214) {
                                var7--;
                                int var234 = class274.field4294[var7];
                                class91 var235 = class274.method1947(112);
                                if (var235 != null) {
                                    int[] var236 = var235.method720((byte) 95, (var234 & 0x319B3879) >> 28, var234 & 0x3FFF, (var234 & 0xFFFCA16) >> 14);
                                    if (var236 != null) {
                                        class147.method1113(-91, var236[2], var236[1]);
                                    }
                                }
                                continue;
                            }
                            if (var9 == 5215) {
                                var7 -= 2;
                                int var237 = class274.field4294[var7];
                                int var238 = class274.field4294[var7 + 1];
                                class202 var239 = class56.method471(var237 & 0x3FFF, true, (var237 & 0xFFFE9A9) >> 14);
                                boolean var240 = false;
                                for (class91 var241 = (class91) var239.method1449(arg2 ^ 0xFFFFFF83); var241 != null; var241 = (class91) var239.method1448(23)) {
                                    if (var241.field1456 == var238) {
                                        var240 = true;
                                        break;
                                    }
                                }
                                if (var240) {
                                    class274.field4294[var7++] = 1;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 5216) {
                                var7--;
                                int var242 = class274.field4294[var7];
                                class143.method1100(arg2 ^ 0xFFFFEE66, var242);
                                continue;
                            }
                            if (var9 == 5217) {
                                var7--;
                                int var243 = class274.field4294[var7];
                                if (class138.method1062(arg2 + 1, var243)) {
                                    class274.field4294[var7++] = 1;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 5218) {
                                var7--;
                                int var244 = class274.field4294[var7];
                                class91 var245 = class305.method2167(var244, (byte) -126);
                                if (var245 == null) {
                                    class274.field4294[var7++] = -1;
                                } else {
                                    class274.field4294[var7++] = var245.field1450;
                                }
                                continue;
                            }
                            if (var9 == 5219) {
                                var6--;
                                class124.method986(0, class344.field5334[var6]);
                                continue;
                            }
                            if (var9 == 5220) {
                                class274.field4294[var7++] = class344.field5333 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 5221) {
                                var7--;
                                int var246 = class274.field4294[var7];
                                class147.method1113(-80, var246 & 0x3FFF, var246 >> 14 & 0x3FFF);
                                continue;
                            }
                            if (var9 == 5222) {
                                class91 var247 = class274.method1947(112);
                                if (var247 == null) {
                                    class274.field4294[var7++] = -1;
                                    class274.field4294[var7++] = -1;
                                } else {
                                    int[] var248 = var247.method719(-23306, class286.field4473 + class188.field2953 - class67.field1013 - 1, class227.field3512 + class180.field2863);
                                    if (var248 == null) {
                                        class274.field4294[var7++] = -1;
                                        class274.field4294[var7++] = -1;
                                    } else {
                                        class274.field4294[var7++] = var248[1];
                                        class274.field4294[var7++] = var248[2];
                                    }
                                }
                                continue;
                            }
                            if (var9 == 5223) {
                                var7 -= 2;
                                int var249 = class274.field4294[var7];
                                int var250 = class274.field4294[var7 + 1];
                                class5.method92(false, var250 >> 14 & 0x3FFF, var250 & 0x3FFF, var249);
                                continue;
                            }
                            if (var9 == 5224) {
                                var7--;
                                int var251 = class274.field4294[var7];
                                class91 var252 = class274.method1947(121);
                                if (var252 == null) {
                                    class274.field4294[var7++] = -1;
                                    class274.field4294[var7++] = -1;
                                } else {
                                    int[] var253 = var252.method720((byte) 63, var251 >> 28 & 0x3, var251 & 0x3FFF, (var251 & 0xFFFFC1B) >> 14);
                                    if (var253 == null) {
                                        class274.field4294[var7++] = -1;
                                        class274.field4294[var7++] = -1;
                                    } else {
                                        class274.field4294[var7++] = var253[1];
                                        class274.field4294[var7++] = var253[2];
                                    }
                                }
                                continue;
                            }
                            if (var9 == 5225) {
                                var7--;
                                int var254 = class274.field4294[var7];
                                class91 var255 = class274.method1947(arg2 ^ 0xFFFFFF92);
                                if (var255 == null) {
                                    class274.field4294[var7++] = -1;
                                    class274.field4294[var7++] = -1;
                                } else {
                                    int[] var256 = var255.method719(-23306, var254 & 0x3FFF, (var254 & 0xFFFD8EF) >> 14);
                                    if (var256 == null) {
                                        class274.field4294[var7++] = -1;
                                        class274.field4294[var7++] = -1;
                                    } else {
                                        class274.field4294[var7++] = var256[1];
                                        class274.field4294[var7++] = var256[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var9 < 5400) {
                            if (var9 == 5300) {
                                var7 -= 2;
                                int var322 = class274.field4294[var7 + 1];
                                int var323 = class274.field4294[var7];
                                class184.method1342(-1, var323, var322, false, 3);
                                class274.field4294[var7++] = class244.field3646 == null ? 0 : 1;
                                continue;
                            }
                            if (var9 == 5301) {
                                if (class244.field3646 != null) {
                                    class184.method1342(-1, -1, -1, false, class101.field1636);
                                }
                                continue;
                            }
                            if (var9 == 5302) {
                                class108[] var324 = class180.method1320(15135);
                                class274.field4294[var7++] = var324.length;
                                continue;
                            }
                            if (var9 == 5303) {
                                var7--;
                                int var325 = class274.field4294[var7];
                                class108[] var326 = class180.method1320(15135);
                                class274.field4294[var7++] = var326[var325].field1765;
                                class274.field4294[var7++] = var326[var325].field1768;
                                continue;
                            }
                            if (var9 == 5305) {
                                int var327 = class146.field2393;
                                int var328 = class73.field1105;
                                int var329 = -1;
                                class108[] var330 = class180.method1320(15135);
                                for (int var331 = 0; var331 < var330.length; var331++) {
                                    class108 var332 = var330[var331];
                                    if (var332.field1765 == var327 && var332.field1768 == var328) {
                                        var329 = var331;
                                        break;
                                    }
                                }
                                class274.field4294[var7++] = var329;
                                continue;
                            }
                            if (var9 == 5306) {
                                class274.field4294[var7++] = class101.method823(-47);
                                continue;
                            }
                            if (var9 == 5307) {
                                var7--;
                                int var333 = class274.field4294[var7];
                                if (var333 < 0 || var333 > 2) {
                                    var333 = 0;
                                }
                                class184.method1342(-1, -1, -1, false, var333);
                                continue;
                            }
                            if (var9 == 5308) {
                                class274.field4294[var7++] = class101.field1636;
                                continue;
                            }
                            if (var9 == 5309) {
                                var7--;
                                int var334 = class274.field4294[var7];
                                if (var334 < 0 || var334 > 2) {
                                    var334 = 0;
                                }
                                class101.field1636 = var334;
                                class281.method1976(class92.field1484, arg2 ^ 0x1BDF);
                                continue;
                            }
                        } else if (var9 < 5500) {
                            if (var9 == 5400) {
                                class209.field3292++;
                                var6 -= 2;
                                String var257 = class344.field5334[var6];
                                String var258 = class344.field5334[var6 + 1];
                                var7--;
                                int var259 = class274.field4294[var7];
                                class209.field3305.method1808((byte) -74, 217);
                                class209.field3305.method21(-97, class274.method1951(-1, var257) + (class274.method1951(-1, var258) + 1));
                                class209.field3305.method12(var257, (byte) -47);
                                class209.field3305.method12(var258, (byte) -47);
                                class209.field3305.method21(44, var259);
                                continue;
                            }
                            if (var9 == 5401) {
                                var7 -= 2;
                                class56.field858[class274.field4294[var7]] = (short) class135.method1038(true, class274.field4294[var7 + 1]);
                                class280.method1973(false);
                                class106.method849(arg2 ^ 0xFFFFFFBD);
                                class301.method2131(-122);
                                class25.method230((byte) -99);
                                class141.method1082(-14735);
                                continue;
                            }
                            if (var9 == 5405) {
                                var7 -= 2;
                                int var260 = class274.field4294[var7];
                                int var261 = class274.field4294[var7 + 1];
                                if (var260 >= 0 && var260 < 2) {
                                    class74.field1131[var260] = new int[var261 << 1][4];
                                }
                                continue;
                            }
                            if (var9 == 5406) {
                                var7 -= 7;
                                int var262 = class274.field4294[var7 + 1] << 1;
                                int var263 = class274.field4294[var7];
                                int var264 = class274.field4294[var7 + 3];
                                int var265 = class274.field4294[var7 + 2];
                                int var266 = class274.field4294[var7 + 4];
                                int var267 = class274.field4294[var7 + 5];
                                int var268 = class274.field4294[var7 + 6];
                                if (var263 >= 0 && var263 < 2 && class74.field1131[var263] != null && var262 >= 0 && var262 < class74.field1131[var263].length) {
                                    class74.field1131[var263][var262] = new int[] { class164.method1234(16383, var265 >> 14) * 128, var264, class164.method1234(16383, var265) * 128, var268 };
                                    class74.field1131[var263][var262 + 1] = new int[] { class164.method1234(16383, var266 >> 14) * 128, var267, class164.method1234(var266, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var9 == 5407) {
                                var7--;
                                int var269 = class74.field1131[class274.field4294[var7]].length >> 1;
                                class274.field4294[var7++] = var269;
                                continue;
                            }
                            if (var9 == 5411) {
                                if (class244.field3646 != null) {
                                    class184.method1342(-1, -1, -1, false, class101.field1636);
                                }
                                if (class139.field2247 == null) {
                                    class149.method1129(class220.method1601(4), false, (byte) 86);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var9 == 5419) {
                                String var270 = "";
                                if (class38.field570 != null) {
                                    if (class38.field570.field409 == null) {
                                        var270 = class2.method69(class38.field570.field406, false);
                                    } else {
                                        var270 = (String) class38.field570.field409;
                                    }
                                }
                                class344.field5334[var6++] = var270;
                                continue;
                            }
                            if (var9 == 5420) {
                                class274.field4294[var7++] = class69.field1039 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 5421) {
                                if (class244.field3646 != null) {
                                    class184.method1342(-1, -1, -1, false, class101.field1636);
                                }
                                var7--;
                                boolean var271 = class274.field4294[var7] == 1;
                                var6--;
                                String var272 = class344.field5334[var6];
                                String var273 = class220.method1601(4) + var272;
                                if (class139.field2247 != null || var271 && class69.field1039 != 3 && class69.field1047.startsWith("win") && !class144.field2342) {
                                    class255.field3753 = var273;
                                    class308.field4882 = var271;
                                    class157.field2575 = class92.field1484.method560(var273, false);
                                    continue;
                                }
                                class149.method1129(var273, var271, (byte) 127);
                                continue;
                            }
                            if (var9 == 5422) {
                                var6 -= 2;
                                String var274 = class344.field5334[var6];
                                var7--;
                                int var275 = class274.field4294[var7];
                                String var276 = class344.field5334[var6 + 1];
                                if (var274.length() > 0) {
                                    if (class183.field2904 == null) {
                                        class183.field2904 = new String[class129.field2070[class109.field1773]];
                                    }
                                    class183.field2904[var275] = var274;
                                }
                                if (var276.length() > 0) {
                                    if (class331.field5146 == null) {
                                        class331.field5146 = new String[class129.field2070[class109.field1773]];
                                    }
                                    class331.field5146[var275] = var276;
                                }
                                continue;
                            }
                            if (var9 == 5423) {
                                var6--;
                                System.out.println(class344.field5334[var6]);
                                continue;
                            }
                            if (var9 == 5424) {
                                var7 -= 11;
                                class184.field2921 = class274.field4294[var7];
                                class30.field461 = class274.field4294[var7 + 1];
                                class288.field4531 = class274.field4294[var7 + 2];
                                class61.field897 = class274.field4294[var7 + 3];
                                class185.field2935 = class274.field4294[var7 + 4];
                                class68.field1034 = class274.field4294[var7 + 5];
                                class214.field3341 = class274.field4294[var7 + 6];
                                class313.field4932 = class274.field4294[var7 + 7];
                                class291.field4570 = class274.field4294[var7 + 8];
                                class216.field3359 = class274.field4294[var7 + 9];
                                class30.field477 = class274.field4294[var7 + 10];
                                class176.field2815.method939((byte) 95, class185.field2935);
                                class176.field2815.method939((byte) 124, class68.field1034);
                                class176.field2815.method939((byte) 77, class214.field3341);
                                class176.field2815.method939((byte) 74, class313.field4932);
                                class176.field2815.method939((byte) 96, class291.field4570);
                                class183.field2908 = true;
                                continue;
                            }
                            if (var9 == 5425) {
                                class316.method2234(true);
                                class183.field2908 = false;
                                continue;
                            }
                            if (var9 == 5426) {
                                var7--;
                                class178.field2832 = class274.field4294[var7];
                                continue;
                            }
                            if (var9 == 5427) {
                                var7 -= 2;
                                class116.field1880 = class274.field4294[var7];
                                class217.field3372 = class274.field4294[var7 + 1];
                                continue;
                            }
                            if (var9 == 5428) {
                                var7 -= 2;
                                int var277 = class274.field4294[var7];
                                int var278 = class274.field4294[var7 + 1];
                                class274.field4294[var7++] = class111.method870(var277, -80, var278) ? 1 : 0;
                                continue;
                            }
                        } else if (var9 < 5600) {
                            if (var9 == 5500) {
                                var7 -= 4;
                                int var279 = class274.field4294[var7];
                                int var280 = class274.field4294[var7 + 1];
                                int var281 = class274.field4294[var7 + 2];
                                int var282 = class274.field4294[var7 + 3];
                                class61.method497(false, var281, var282, ((var279 & 0xFFFC68B) >> 14) - class117.field1902, (var279 & 0x3FFF) - class133.field2118, arg2 + 95, var280);
                                continue;
                            }
                            if (var9 == 5501) {
                                var7 -= 4;
                                int var283 = class274.field4294[var7 + 1];
                                int var284 = class274.field4294[var7];
                                int var285 = class274.field4294[var7 + 2];
                                int var286 = class274.field4294[var7 + 3];
                                class303.method2153(var283, arg2 + 2, ((var284 & 0xFFFE385) >> 14) + -class117.field1902, var285, var286, (var284 & 0x3FFF) - class133.field2118);
                                continue;
                            }
                            if (var9 == 5502) {
                                var7 -= 6;
                                int var287 = class274.field4294[var7];
                                if (var287 >= 2) {
                                    throw new RuntimeException();
                                }
                                class321.field5021 = var287;
                                int var288 = class274.field4294[var7 + 1];
                                if (class74.field1131[class321.field5021].length >> 1 <= var288 + 1) {
                                    throw new RuntimeException();
                                }
                                class257.field3808 = var288;
                                class55.field836 = 0;
                                class111.field1804 = class274.field4294[var7 + 2];
                                class57.field861 = class274.field4294[var7 + 3];
                                int var289 = class274.field4294[var7 + 4];
                                if (var289 >= 2) {
                                    throw new RuntimeException();
                                }
                                class63.field918 = var289;
                                int var290 = class274.field4294[var7 + 5];
                                if (class74.field1131[class63.field918].length >> 1 <= var290 + 1) {
                                    throw new RuntimeException();
                                }
                                class50.field759 = var290;
                                class73.field1112 = 3;
                                continue;
                            }
                            if (var9 == 5503) {
                                class245.method1727(arg2 ^ 0xFFFFFF8F);
                                continue;
                            }
                            if (var9 == 5504) {
                                var7 -= 2;
                                class296.method2098(class274.field4294[var7 + 1], class274.field4294[var7], -127);
                                continue;
                            }
                            if (var9 == 5505) {
                                class274.field4294[var7++] = (int) class86.field1388;
                                continue;
                            }
                            if (var9 == 5506) {
                                class274.field4294[var7++] = (int) class171.field2747;
                                continue;
                            }
                            if (var9 == 5507) {
                                class80.method630((byte) -62);
                                continue;
                            }
                            if (var9 == 5508) {
                                class169.method1261(-1);
                                continue;
                            }
                            if (var9 == 5509) {
                                class322.method2270(arg2 - 73);
                                continue;
                            }
                            if (var9 == 5510) {
                                class183.method1335(-128);
                                continue;
                            }
                            if (var9 == 5512) {
                                class321.method2263(arg2 ^ 0x0);
                                continue;
                            }
                        } else if (var9 < 5700) {
                            if (var9 == 5600) {
                                var6 -= 2;
                                String var318 = class344.field5334[var6];
                                var7--;
                                int var319 = class274.field4294[var7];
                                String var320 = class344.field5334[var6 + 1];
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0 && class152.field2495 == 0) {
                                    class321.method2264(var319, var320, var318, (byte) -127);
                                }
                                continue;
                            }
                            if (var9 == 5601) {
                                class99.method800(arg2 + 27452);
                                continue;
                            }
                            if (var9 == 5602) {
                                if (class107.field1758 == 0) {
                                    class133.field2117 = -2;
                                }
                                continue;
                            }
                            if (var9 == 5603) {
                                var7 -= 4;
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0 && class152.field2495 == 0) {
                                    class214.method1553(class274.field4294[var7], class274.field4294[var7 + 2], class274.field4294[var7 + 3], class274.field4294[var7 + 1], -104);
                                }
                                continue;
                            }
                            if (var9 == 5604) {
                                var6--;
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0 && class152.field2495 == 0) {
                                    class77.method609(~arg2, class106.method851(class344.field5334[var6], -105));
                                }
                                continue;
                            }
                            if (var9 == 5605) {
                                var6 -= 3;
                                var7 -= 7;
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0 && class152.field2495 == 0) {
                                    class306.method2169(class274.field4294[var7], class274.field4294[var7 + 4] == 1, (byte) -54, class274.field4294[var7 + 2], class344.field5334[var6 + 2], class274.field4294[var7 + 6] == 1, class274.field4294[var7 + 3], class274.field4294[var7 + 1], class274.field4294[var7 + 5] == 1, class106.method851(class344.field5334[var6], arg2 ^ 0x4B), class344.field5334[var6 + 1]);
                                }
                                continue;
                            }
                            if (var9 == 5606) {
                                if (class74.field1118 == 0) {
                                    class42.field663 = -2;
                                }
                                continue;
                            }
                            if (var9 == 5607) {
                                class274.field4294[var7++] = class133.field2117;
                                continue;
                            }
                            if (var9 == 5608) {
                                class274.field4294[var7++] = class284.field4424;
                                continue;
                            }
                            if (var9 == 5609) {
                                class274.field4294[var7++] = class42.field663;
                                continue;
                            }
                            if (var9 == 5610) {
                                for (int var321 = 0; var321 < 5; var321++) {
                                    class344.field5334[var6++] = var321 < class319.field5000.length ? class323.method2274(arg2 + 6, class319.field5000[var321]) : "";
                                }
                                class319.field5000 = null;
                                continue;
                            }
                            if (var9 == 5611) {
                                class274.field4294[var7++] = class157.field2572;
                                continue;
                            }
                        } else if (var9 < 6100) {
                            if (var9 == 6001) {
                                var7--;
                                int var308 = class274.field4294[var7];
                                if (var308 < 1) {
                                    var308 = 1;
                                }
                                if (var308 > 4) {
                                    var308 = 4;
                                }
                                class343.field5310 = var308;
                                if (!class162.field2623 || !class229.field3531) {
                                    if (class343.field5310 == 1) {
                                        class40.method352(0.9F);
                                    }
                                    if (class343.field5310 == 2) {
                                        class40.method352(0.8F);
                                    }
                                    if (class343.field5310 == 3) {
                                        class40.method352(0.7F);
                                    }
                                    if (class343.field5310 == 4) {
                                        class40.method352(0.6F);
                                    }
                                }
                                if (class162.field2623) {
                                    class64.method511(false);
                                    if (!class229.field3531) {
                                        class183.method1333((byte) 123);
                                    }
                                }
                                class106.method849(89);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6002) {
                                var7--;
                                class154.method1148(class274.field4294[var7] == 1, arg2 ^ 0x5C);
                                class20.method210(-1);
                                class183.method1333((byte) 87);
                                class99.method799(arg2 ^ 0xFFFFFF97);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6003) {
                                var7--;
                                class1.field70 = class274.field4294[var7] == 1;
                                class99.method799(arg2 ^ 0xFFFFFF80);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6005) {
                                var7--;
                                class90.field1436 = class274.field4294[var7] == 1;
                                class183.method1333((byte) 116);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6006) {
                                var7--;
                                class257.field3810 = class274.field4294[var7] == 1;
                                ((class277) class40.field614).method1961(-108, !class257.field3810);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6007) {
                                var7--;
                                class55.field846 = class274.field4294[var7] == 1;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6008) {
                                var7--;
                                class149.field2435 = class274.field4294[var7] == 1;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6009) {
                                var7--;
                                class109.field1777 = class274.field4294[var7] == 1;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6010) {
                                var7--;
                                class56.field853 = class274.field4294[var7] == 1;
                                class281.method1976(class92.field1484, arg2 ^ 0x1BDF);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6011) {
                                var7--;
                                int var309 = class274.field4294[var7];
                                if (var309 < 0 || var309 > 2) {
                                    var309 = 0;
                                }
                                class151.field2474 = var309;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6012) {
                                if (class162.field2623) {
                                    class102.method830(0, 14804, 0);
                                }
                                var7--;
                                class229.field3531 = class274.field4294[var7] == 1;
                                if (class162.field2623 && class229.field3531) {
                                    class40.method352(0.7F);
                                } else {
                                    if (class343.field5310 == 1) {
                                        class40.method352(0.9F);
                                    }
                                    if (class343.field5310 == 2) {
                                        class40.method352(0.8F);
                                    }
                                    if (class343.field5310 == 3) {
                                        class40.method352(0.7F);
                                    }
                                    if (class343.field5310 == 4) {
                                        class40.method352(0.6F);
                                    }
                                }
                                class183.method1333((byte) 97);
                                class281.method1976(class92.field1484, arg2 ^ 0x1BDF);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6014) {
                                var7--;
                                class154.field2511 = class274.field4294[var7] == 1;
                                if (class162.field2623) {
                                    class183.method1333((byte) 116);
                                }
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6015) {
                                var7--;
                                class140.field2267 = class274.field4294[var7] == 1;
                                if (class162.field2623) {
                                    class64.method511(false);
                                }
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6016) {
                                var7--;
                                int var310 = class274.field4294[var7];
                                if (class162.field2623) {
                                    class313.field4930 = true;
                                }
                                if (var310 < 0 || var310 > 2) {
                                    var310 = 0;
                                }
                                class315.field4973 = var310;
                                continue;
                            }
                            if (var9 == 6017) {
                                var7--;
                                class60.field881 = class274.field4294[var7] == 1;
                                class76.method601(arg2 ^ 0x7D);
                                class281.method1976(class92.field1484, arg2 ^ 0x1BDF);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6018) {
                                var7--;
                                int var311 = class274.field4294[var7];
                                if (var311 < 0) {
                                    var311 = 0;
                                }
                                if (var311 > 127) {
                                    var311 = 127;
                                }
                                class73.field1106 = var311;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6019) {
                                var7--;
                                int var312 = class274.field4294[var7];
                                if (var312 < 0) {
                                    var312 = 0;
                                }
                                if (var312 > 255) {
                                    var312 = 255;
                                }
                                if (class80.field1253 != var312) {
                                    if (class80.field1253 == 0 && class118.field1906 != -1) {
                                        class66.method527(class79.field1232, var312, 0, class118.field1906, false, 10000);
                                        class188.field2957 = false;
                                    } else if (var312 == 0) {
                                        class340.method2355((byte) -53);
                                        class188.field2957 = false;
                                    } else {
                                        class121.method970(var312, true);
                                    }
                                    class80.field1253 = var312;
                                }
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6020) {
                                var7--;
                                int var313 = class274.field4294[var7];
                                if (var313 < 0) {
                                    var313 = 0;
                                }
                                if (var313 > 127) {
                                    var313 = 127;
                                }
                                class22.field398 = var313;
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                continue;
                            }
                            if (var9 == 6021) {
                                var7--;
                                class179.field2849 = class274.field4294[var7] == 1;
                                class99.method799(117);
                                continue;
                            }
                            if (var9 == 6023) {
                                boolean var314 = false;
                                var7--;
                                int var315 = class274.field4294[var7];
                                if (var315 < 0) {
                                    var315 = 0;
                                }
                                if (var315 > 2) {
                                    var315 = 2;
                                }
                                if (class178.field2841 < 96) {
                                    var314 = true;
                                    var315 = 0;
                                }
                                class236.method1688(var315);
                                class281.method1976(class92.field1484, -7136);
                                class117.field1905 = false;
                                class274.field4294[var7++] = var314 ? 0 : 1;
                                continue;
                            }
                            if (var9 == 6024) {
                                var7--;
                                int var316 = class274.field4294[var7];
                                if (var316 < 0 || var316 > 2) {
                                    var316 = 0;
                                }
                                class124.field2007 = var316;
                                class281.method1976(class92.field1484, -7136);
                                continue;
                            }
                            if (var9 == 6027) {
                                var7--;
                                int var317 = class274.field4294[var7];
                                if (!class162.field2623) {
                                    continue;
                                }
                                if (var317 < 0 || var317 > 1) {
                                    var317 = 0;
                                }
                                class237.method1691(var317 == 1, 504172684);
                                continue;
                            }
                            if (var9 == 6028) {
                                var7--;
                                class52.field772 = class274.field4294[var7] != 0;
                                class281.method1976(class92.field1484, -7136);
                                continue;
                            }
                        } else if (var9 < 6200) {
                            if (var9 == 6101) {
                                class274.field4294[var7++] = class343.field5310;
                                continue;
                            }
                            if (var9 == 6102) {
                                class274.field4294[var7++] = class53.method450(2) ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6103) {
                                class274.field4294[var7++] = class1.field70 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6105) {
                                class274.field4294[var7++] = class90.field1436 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6106) {
                                class274.field4294[var7++] = class257.field3810 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6107) {
                                class274.field4294[var7++] = class55.field846 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6108) {
                                class274.field4294[var7++] = class149.field2435 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6109) {
                                class274.field4294[var7++] = class109.field1777 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6110) {
                                class274.field4294[var7++] = class56.field853 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6111) {
                                class274.field4294[var7++] = class151.field2474;
                                continue;
                            }
                            if (var9 == 6112) {
                                class274.field4294[var7++] = class229.field3531 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6114) {
                                class274.field4294[var7++] = class154.field2511 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6115) {
                                class274.field4294[var7++] = class140.field2267 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6116) {
                                class274.field4294[var7++] = class315.field4973;
                                continue;
                            }
                            if (var9 == 6117) {
                                class274.field4294[var7++] = class60.field881 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6118) {
                                class274.field4294[var7++] = class73.field1106;
                                continue;
                            }
                            if (var9 == 6119) {
                                class274.field4294[var7++] = class80.field1253;
                                continue;
                            }
                            if (var9 == 6120) {
                                class274.field4294[var7++] = class22.field398;
                                continue;
                            }
                            if (var9 == 6121) {
                                if (class162.field2623) {
                                    class274.field4294[var7++] = class162.field2635 ? 1 : 0;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 6123) {
                                class274.field4294[var7++] = class236.method1686();
                                continue;
                            }
                            if (var9 == 6124) {
                                class274.field4294[var7++] = class124.field2007;
                                continue;
                            }
                            if (var9 == 6126) {
                                if (class162.field2623) {
                                    class274.field4294[var7++] = class54.method457() ? 1 : 0;
                                } else {
                                    class274.field4294[var7++] = 0;
                                }
                                continue;
                            }
                            if (var9 == 6127) {
                                class274.field4294[var7++] = class151.field2467 ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6128) {
                                class274.field4294[var7++] = class52.field772 ? 1 : 0;
                                continue;
                            }
                        } else if (var9 < 6300) {
                            if (var9 == 6200) {
                                var7 -= 2;
                                class21.field382 = (short) class274.field4294[var7];
                                if (class21.field382 <= 0) {
                                    class21.field382 = 256;
                                }
                                class10.field229 = (short) class274.field4294[var7 + 1];
                                if (class10.field229 <= 0) {
                                    class10.field229 = 205;
                                }
                                continue;
                            }
                            if (var9 == 6201) {
                                var7 -= 2;
                                class260.field3872 = (short) class274.field4294[var7];
                                if (class260.field3872 <= 0) {
                                    class260.field3872 = 256;
                                }
                                class106.field1737 = (short) class274.field4294[var7 + 1];
                                if (class106.field1737 <= 0) {
                                    class106.field1737 = 320;
                                }
                                continue;
                            }
                            if (var9 == 6202) {
                                var7 -= 4;
                                class75.field1155 = (short) class274.field4294[var7];
                                if (class75.field1155 <= 0) {
                                    class75.field1155 = 1;
                                }
                                class258.field3835 = (short) class274.field4294[var7 + 1];
                                if (class258.field3835 <= 0) {
                                    class258.field3835 = 32767;
                                } else if (class258.field3835 < class75.field1155) {
                                    class258.field3835 = class75.field1155;
                                }
                                class308.field4881 = (short) class274.field4294[var7 + 2];
                                if (class308.field4881 <= 0) {
                                    class308.field4881 = 1;
                                }
                                class184.field2913 = (short) class274.field4294[var7 + 3];
                                if (class184.field2913 <= 0) {
                                    class184.field2913 = 32767;
                                } else if (class184.field2913 < class308.field4881) {
                                    class184.field2913 = class308.field4881;
                                }
                                continue;
                            }
                            if (var9 == 6203) {
                                class31.method282(0, class342.field5302.field3941, class342.field5302.field3939, false, 0, 0);
                                class274.field4294[var7++] = class175.field2803;
                                class274.field4294[var7++] = class66.field984;
                                continue;
                            }
                            if (var9 == 6204) {
                                class274.field4294[var7++] = class260.field3872;
                                class274.field4294[var7++] = class106.field1737;
                                continue;
                            }
                            if (var9 == 6205) {
                                class274.field4294[var7++] = class21.field382;
                                class274.field4294[var7++] = class10.field229;
                                continue;
                            }
                        } else if (var9 < 6400) {
                            if (var9 == 6300) {
                                class274.field4294[var7++] = (int) (class212.method1543(22326) / 60000L);
                                continue;
                            }
                            if (var9 == 6301) {
                                class274.field4294[var7++] = (int) (class212.method1543(22326) / 86400000L) - 11745;
                                continue;
                            }
                            if (var9 == 6302) {
                                var7 -= 3;
                                int var291 = class274.field4294[var7];
                                int var292 = class274.field4294[var7 + 2];
                                int var293 = class274.field4294[var7 + 1];
                                class207.field3270.clear();
                                class207.field3270.set(11, 12);
                                class207.field3270.set(var292, var293, var291);
                                class274.field4294[var7++] = (int) (class207.field3270.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var9 == 6303) {
                                class207.field3270.clear();
                                class207.field3270.setTime(new Date(class212.method1543(arg2 + 22327)));
                                class274.field4294[var7++] = class207.field3270.get(1);
                                continue;
                            }
                            if (var9 == 6304) {
                                var7--;
                                int var294 = class274.field4294[var7];
                                boolean var295 = true;
                                if (var294 < 0) {
                                    var295 = (var294 + 1) % 4 == 0;
                                } else if (var294 < 1582) {
                                    var295 = var294 % 4 == 0;
                                } else if ((var294 % 4) != 0) {
                                    var295 = false;
                                } else if ((var294 % 100) != 0) {
                                    var295 = true;
                                } else if (var294 % 400 != 0) {
                                    var295 = false;
                                }
                                class274.field4294[var7++] = var295 ? 1 : 0;
                                continue;
                            }
                        } else if (var9 < 6500) {
                            if (var9 == 6405) {
                                class274.field4294[var7++] = class138.method1063(120) ? 1 : 0;
                                continue;
                            }
                            if (var9 == 6406) {
                                class274.field4294[var7++] = class1.method36((byte) 30) ? 1 : 0;
                                continue;
                            }
                        } else if (var9 < 6600) {
                            if (var9 == 6500) {
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0) {
                                    class274.field4294[var7++] = class99.method798((byte) -53) == -1 ? 0 : 1;
                                    continue;
                                }
                                class274.field4294[var7++] = 1;
                                continue;
                            }
                            if (var9 == 6501) {
                                class44 var296 = class174.method1283(0);
                                if (var296 == null) {
                                    class274.field4294[var7++] = -1;
                                    class274.field4294[var7++] = 0;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var296.field691;
                                    class274.field4294[var7++] = var296.field2830;
                                    class344.field5334[var6++] = var296.field695;
                                    class161 var297 = var296.method386((byte) -91);
                                    class274.field4294[var7++] = var297.field2610;
                                    class344.field5334[var6++] = var297.field2613;
                                    class274.field4294[var7++] = var296.field2833;
                                }
                                continue;
                            }
                            if (var9 == 6502) {
                                class44 var298 = class140.method1076(26);
                                if (var298 == null) {
                                    class274.field4294[var7++] = -1;
                                    class274.field4294[var7++] = 0;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var298.field691;
                                    class274.field4294[var7++] = var298.field2830;
                                    class344.field5334[var6++] = var298.field695;
                                    class161 var299 = var298.method386((byte) -117);
                                    class274.field4294[var7++] = var299.field2610;
                                    class344.field5334[var6++] = var299.field2613;
                                    class274.field4294[var7++] = var298.field2833;
                                }
                                continue;
                            }
                            if (var9 == 6503) {
                                var7--;
                                int var300 = class274.field4294[var7];
                                if (class289.field4548 == 10 && class64.field931 == 0 && class107.field1758 == 0 && class74.field1118 == 0) {
                                    class274.field4294[var7++] = class36.method323(var300, arg2 + 3) ? 1 : 0;
                                    continue;
                                }
                                class274.field4294[var7++] = 0;
                                continue;
                            }
                            if (var9 == 6504) {
                                var7--;
                                class137.field2240 = class274.field4294[var7];
                                class281.method1976(class92.field1484, -7136);
                                continue;
                            }
                            if (var9 == 6505) {
                                class274.field4294[var7++] = class137.field2240;
                                continue;
                            }
                            if (var9 == 6506) {
                                var7--;
                                int var301 = class274.field4294[var7];
                                class44 var302 = class334.method2337(false, var301);
                                if (var302 == null) {
                                    class274.field4294[var7++] = -1;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                    class344.field5334[var6++] = "";
                                    class274.field4294[var7++] = 0;
                                } else {
                                    class274.field4294[var7++] = var302.field2830;
                                    class344.field5334[var6++] = var302.field695;
                                    class161 var303 = var302.method386((byte) -73);
                                    class274.field4294[var7++] = var303.field2610;
                                    class344.field5334[var6++] = var303.field2613;
                                    class274.field4294[var7++] = var302.field2833;
                                }
                                continue;
                            }
                            if (var9 == 6507) {
                                var7 -= 4;
                                boolean var304 = class274.field4294[var7 + 1] == 1;
                                int var305 = class274.field4294[var7];
                                boolean var306 = class274.field4294[var7 + 3] == 1;
                                int var307 = class274.field4294[var7 + 2];
                                class4.method86((byte) -78, var307, var305, var306, var304);
                                continue;
                            }
                        } else if (var9 < 6700) {
                            if (var9 == 6600) {
                                var7--;
                                class126.field2018 = class274.field4294[var7] == 1;
                                class281.method1976(class92.field1484, -7136);
                                continue;
                            }
                            if (var9 == 6601) {
                                class274.field4294[var7++] = class126.field2018 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var9 == 4300) {
                        var7 -= 2;
                        int var400 = class274.field4294[var7];
                        int var401 = class274.field4294[var7 + 1];
                        class139 var402 = class331.method2317((byte) -30, var401);
                        if (var402.method1067(arg2 ^ 0xFFFFFFA6)) {
                            class344.field5334[var6++] = class310.method2191(var400, arg2 + 85).method670(var401, var402.field2245, -82);
                        } else {
                            class274.field4294[var7++] = class310.method2191(var400, 111).method661(true, var402.field2255, var401);
                        }
                        continue;
                    }
                } else {
                    class266 var487;
                    if (var9 < 2000) {
                        var487 = var46 ? class136.field2208 : class217.field3381;
                    } else {
                        var9 -= 1000;
                        var7--;
                        var487 = class171.method1276(class274.field4294[var7], (byte) 18);
                    }
                    if (var9 == 1300) {
                        var7--;
                        int var488 = class274.field4294[var7] - 1;
                        if (var488 >= 0 && var488 <= 9) {
                            var6--;
                            var487.method1835(class344.field5334[var6], var488, (byte) 57);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var9 == 1301) {
                        var7 -= 2;
                        int var489 = class274.field4294[var7];
                        int var490 = class274.field4294[var7 + 1];
                        var487.field4104 = class77.method604(var490, var489, -10316);
                        continue;
                    }
                    if (var9 == 1302) {
                        var7--;
                        var487.field3996 = class274.field4294[var7] == 1;
                        continue;
                    }
                    if (var9 == 1303) {
                        var7--;
                        var487.field4060 = class274.field4294[var7];
                        continue;
                    }
                    if (var9 == 1304) {
                        var7--;
                        var487.field3979 = class274.field4294[var7];
                        continue;
                    }
                    if (var9 == 1305) {
                        var6--;
                        var487.field3935 = class344.field5334[var6];
                        continue;
                    }
                    if (var9 == 1306) {
                        var6--;
                        var487.field4072 = class344.field5334[var6];
                        continue;
                    }
                    if (var9 == 1307) {
                        var487.field3950 = null;
                        continue;
                    }
                    if (var9 == 1308) {
                        var7--;
                        var487.field3998 = class274.field4294[var7];
                        var7--;
                        var487.field4001 = class274.field4294[var7];
                        continue;
                    }
                    if (var9 == 1309) {
                        var7--;
                        int var491 = class274.field4294[var7];
                        var7--;
                        int var492 = class274.field4294[var7];
                        if (var492 >= 1 && var492 <= 10) {
                            var487.method1847(var491, 0, var492 - 1);
                        }
                        continue;
                    }
                    if (var9 == 1310) {
                        var6--;
                        var487.field4085 = class344.field5334[var6];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field1195 == null) {
                if (class260.field3874 != 0) {
                    class129.method1003(0, "Clientscript error - check log for details", "", arg2 + 48);
                }
                class79.method622("CS2 - scr:" + var5.field879 + " op:" + arg2, var527, -652852820);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field1195);
                for (int var525 = class190.field2983 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class244.field3652[var525].field851.field1195);
                }
                if (arg2 == 40) {
                    int var526 = var11[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class260.field3874 != 0) {
                    class129.method1003(0, "Clientscript error in: " + var5.field1195, "", 125);
                }
                class79.method622("CS2 - scr:" + var5.field879 + " op:" + arg2 + var524.toString(), var527, -652852820);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I", line = 6550)
    private static final int method2177(byte arg0, int arg1, int arg2) {
        if (arg0 != 26) {
            method2175((byte) 28);
        }
        field4866++;
        class307 var3 = (class307) class340.field5253.method79((long) arg1, (byte) 0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field4867.length > arg2) {
            return var3.field4867[arg2];
        } else {
            return 0;
        }
    }
}
