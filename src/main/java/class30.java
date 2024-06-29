import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class30 {

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "[[I")
    private static int[][] field401 = new int[5][5000];

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    private static int field406 = 0;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "[I")
    private static int[] field402 = new int[5];

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "[Lst;")
    private static class132[] field405 = new class132[50];

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    private static int field409 = 0;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field410 = new String[1000];

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    private static int field413 = 0;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "[I")
    private static int[] field415 = new int[1000];

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "Ljava/util/Calendar;")
    private static Calendar field393 = Calendar.getInstance();

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field416 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "[I")
    private static int[] field418 = new int[3];

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "Luaa;")
    public static class395 field417 = new class395(4);

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    private static int field419 = 0;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Lbd;")
    private static class180 field392;

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Loh;")
    private static class549 field394;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Loh;")
    private static class549 field398;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "[I")
    private static int[] field412;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field414;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lah;I)V")
    private static final void method272(class240 arg0, int arg1) {
        field409 = 0;
        field406 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3493;
        int[] var4 = arg0.field3495;
        byte var5 = -1;
        field413 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method282(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method273(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field415[field409++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field415[field409++] = class401.field6001.field8833[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class401.field6001.method3557(var8, (byte) -54, field415[--field409]);
                } else if (var43 == 3) {
                    field410[field406++] = arg0.field3492[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field409 -= 2;
                    if (field415[field409 + 1] != field415[field409]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field409 -= 2;
                    if (field415[field409 + 1] == field415[field409]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field409 -= 2;
                    if (field415[field409] < field415[field409 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field409 -= 2;
                    if (field415[field409] > field415[field409 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field413 == 0) {
                        return;
                    }
                    class132 var9 = field405[--field413];
                    arg0 = var9.field2128;
                    var3 = arg0.field3493;
                    var4 = arg0.field3495;
                    var2 = var9.field2125;
                    field412 = var9.field2131;
                    field414 = var9.field2132;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field415[field409++] = class401.field6001.method910(62, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class401.field6001.method3552(var11, -1, field415[--field409]);
                } else if (var43 == 31) {
                    field409 -= 2;
                    if (field415[field409] <= field415[field409 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field409 -= 2;
                    if (field415[field409] >= field415[field409 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field415[field409++] = field412[var4[var2]];
                } else if (var43 == 34) {
                    field412[var4[var2]] = field415[--field409];
                } else if (var43 == 35) {
                    field410[field406++] = field414[var4[var2]];
                } else if (var43 == 36) {
                    field414[var4[var2]] = field410[--field406];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field406 -= var12;
                    String var13 = class103.method864(field410, field406, var12, (byte) -113);
                    field410[field406++] = var13;
                } else if (var43 == 38) {
                    field409--;
                } else if (var43 == 39) {
                    field406--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class240 var15 = class214.method1453(-8091, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3496];
                    String[] var17 = new String[var15.field3484];
                    for (int var18 = 0; var18 < var15.field3488; var18++) {
                        var16[var18] = field415[field409 + var18 - var15.field3488];
                    }
                    for (int var19 = 0; var19 < var15.field3485; var19++) {
                        var17[var19] = field410[field406 + var19 - var15.field3485];
                    }
                    field409 -= var15.field3488;
                    field406 -= var15.field3485;
                    class132 var20 = new class132();
                    var20.field2128 = arg0;
                    var20.field2125 = var2;
                    var20.field2131 = field412;
                    var20.field2132 = field414;
                    if (field413 >= field405.length) {
                        throw new RuntimeException();
                    }
                    field405[field413++] = var20;
                    arg0 = var15;
                    var3 = var15.field3493;
                    var4 = var15.field3495;
                    var2 = -1;
                    field412 = var16;
                    field414 = var17;
                } else if (var43 == 42) {
                    field415[field409++] = class310.field4551[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class310.field4551[var21] = field415[--field409];
                    class82.method753(var21, (byte) -111);
                    class2.field14 |= class459.field6618[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field415[--field409];
                    if (var24 >= 0 && var24 <= 5000) {
                        field402[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field401[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field415[--field409];
                    if (var28 < 0 || var28 >= field402[var27]) {
                        throw new RuntimeException();
                    }
                    field415[field409++] = field401[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field409 -= 2;
                    int var30 = field415[field409];
                    if (var30 < 0 || var30 >= field402[var29]) {
                        throw new RuntimeException();
                    }
                    field401[var29][var30] = field415[field409 + 1];
                } else if (var43 == 47) {
                    String var31 = class340.field4893[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field410[field406++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class340.field4893[var32] = field410[--field406];
                    class490.method2799(var32, (byte) 83);
                } else if (var43 == 51) {
                    class78 var33 = arg0.field3490[var4[var2]];
                    class264 var34 = (class264) var33.method740(0, (long) field415[--field409]);
                    if (var34 != null) {
                        var2 += var34.field3841;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3483 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1798).append(" ");
                for (int var41 = field413 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field405[var41].field2128.field1798).append(" ");
                }
                var40.append("op: ").append(var5);
                class593.method3390(var40.toString(), var42, 0);
            } else {
                class83.method758((byte) 125, "Clientscript error in: " + arg0.field3483);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3483).append("\n");
                for (int var38 = field413 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field405[var38].field2128.field3483).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class593.method3390(var37.toString(), var42, 0);
                class595.method3397((byte) 124, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
    private static final void method273(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field415[field409++] = class390.field5815;
                return;
            }
            if (arg0 == 5001) {
                field409 -= 3;
                class390.field5815 = field415[field409];
                class542.field7543 = class36.method317(field415[field409 + 1], (byte) -11);
                if (class542.field7543 == null) {
                    class542.field7543 = class118.field1908;
                }
                class136.field2176 = field415[field409 + 2];
                field397++;
                class624.method3537(-111, class354.field5061);
                class127.field2088.method1710(class390.field5815, 18);
                class127.field2088.method1710(class542.field7543.field8162, 73);
                class127.field2088.method1710(class136.field2176, 112);
                return;
            }
            if (arg0 == 5002) {
                field406 -= 2;
                String var2 = field410[field406];
                String var3 = field410[field406 + 1];
                field409 -= 2;
                int var4 = field415[field409];
                int var5 = field415[field409 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field396++;
                class624.method3537(-108, class425.field6213);
                class127.field2088.method1710(class51.method441((byte) 66, var2) + class51.method441((byte) -78, var3) + 2, 29);
                class127.field2088.method1726((byte) -52, var2);
                class127.field2088.method1710(var4 - 1, 94);
                class127.field2088.method1710(var5, 50);
                class127.field2088.method1726((byte) -52, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field415[--field409];
                class50 var7 = class611.method3467(var6, (byte) -6);
                String var8 = "";
                if (var7 != null && var7.field754 != null) {
                    var8 = var7.field754;
                }
                field410[field406++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field415[--field409];
                class50 var10 = class611.method3467(var9, (byte) -6);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field748;
                }
                field415[field409++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class542.field7543 == null) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = class542.field7543.field8162;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var12 = field410[--field406];
                method275(var12, arg0);
                return;
            }
            if (arg0 == 5009) {
                field406 -= 2;
                String var13 = field410[field406];
                String var14 = field410[field406 + 1];
                if (class602.field8571 != 0 || (!class149.field2261 || class118.field1910) && !class361.field5140) {
                    field403++;
                    class624.method3537(-104, class136.field2173);
                    class127.field2088.method1710(0, 124);
                    int var15 = class127.field2088.field3913;
                    class127.field2088.method1726((byte) -52, var13);
                    class177.method1209(0, class127.field2088, var14);
                    class127.field2088.method1688(class127.field2088.field3913 - var15, 109);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var16 = field415[--field409];
                class50 var17 = class611.method3467(var16, (byte) -6);
                String var18 = "";
                if (var17 != null && var17.field745 != null) {
                    var18 = var17.field745;
                }
                field410[field406++] = var18;
                return;
            }
            if (arg0 == 5011) {
                int var19 = field415[--field409];
                class50 var20 = class611.method3467(var19, (byte) -6);
                String var21 = "";
                if (var20 != null && var20.field753 != null) {
                    var21 = var20.field753;
                }
                field410[field406++] = var21;
                return;
            }
            if (arg0 == 5012) {
                int var22 = field415[--field409];
                class50 var23 = class611.method3467(var22, (byte) -6);
                int var24 = -1;
                if (var23 != null) {
                    var24 = var23.field750;
                }
                field415[field409++] = var24;
                return;
            }
            if (arg0 == 5015) {
                String var25;
                if (class644.field9367 == null || class644.field9367.field5961 == null) {
                    var25 = class646.field9387;
                } else {
                    var25 = class644.field9367.method2451(true, -13212);
                }
                field410[field406++] = var25;
                return;
            }
            if (arg0 == 5016) {
                field415[field409++] = class136.field2176;
                return;
            }
            if (arg0 == 5017) {
                field415[field409++] = class562.method3200(-70);
                return;
            }
            if (arg0 == 5018) {
                int var26 = field415[--field409];
                class50 var27 = class611.method3467(var26, (byte) -6);
                int var28 = 0;
                if (var27 != null) {
                    var28 = var27.field747;
                }
                field415[field409++] = var28;
                return;
            }
            if (arg0 == 5019) {
                int var29 = field415[--field409];
                class50 var30 = class611.method3467(var29, (byte) -6);
                String var31 = "";
                if (var30 != null && var30.field744 != null) {
                    var31 = var30.field744;
                }
                field410[field406++] = var31;
                return;
            }
            if (arg0 == 5020) {
                String var32;
                if (class644.field9367 == null || class644.field9367.field5961 == null) {
                    var32 = class646.field9387;
                } else {
                    var32 = class644.field9367.method2447(false, 0);
                }
                field410[field406++] = var32;
                return;
            }
            if (arg0 == 5023) {
                int var33 = field415[--field409];
                class50 var34 = class611.method3467(var33, (byte) -6);
                int var35 = -1;
                if (var34 != null) {
                    var35 = var34.field746;
                }
                field415[field409++] = var35;
                return;
            }
            if (arg0 == 5024) {
                int var36 = field415[--field409];
                class50 var37 = class611.method3467(var36, (byte) -6);
                int var38 = -1;
                if (var37 != null) {
                    var38 = var37.field751;
                }
                field415[field409++] = var38;
                return;
            }
            if (arg0 == 5050) {
                int var39 = field415[--field409];
                field410[field406++] = class159.field2377.method3302((byte) 31, var39).field2691;
                return;
            }
            if (arg0 == 5051) {
                int var40 = field415[--field409];
                class185 var41 = class159.field2377.method3302((byte) 31, var40);
                if (var41.field2679 == null) {
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = var41.field2679.length;
                return;
            }
            if (arg0 == 5052) {
                field409 -= 2;
                int var42 = field415[field409];
                int var43 = field415[field409 + 1];
                class185 var44 = class159.field2377.method3302((byte) 31, var42);
                int var45 = var44.field2679[var43];
                field415[field409++] = var45;
                return;
            }
            if (arg0 == 5053) {
                int var46 = field415[--field409];
                class185 var47 = class159.field2377.method3302((byte) 31, var46);
                if (var47.field2682 == null) {
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = var47.field2682.length;
                return;
            }
            if (arg0 == 5054) {
                field409 -= 2;
                int var48 = field415[field409];
                int var49 = field415[field409 + 1];
                field415[field409++] = class159.field2377.method3302((byte) 31, var48).field2682[var49];
                return;
            }
            if (arg0 == 5055) {
                int var50 = field415[--field409];
                field410[field406++] = class377.field5545.method2475(-11743, var50).method2228(false);
                return;
            }
            if (arg0 == 5056) {
                int var51 = field415[--field409];
                class368 var52 = class377.field5545.method2475(-11743, var51);
                if (var52.field5214 == null) {
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = var52.field5214.length;
                return;
            }
            if (arg0 == 5057) {
                field409 -= 2;
                int var53 = field415[field409];
                int var54 = field415[field409 + 1];
                field415[field409++] = class377.field5545.method2475(-11743, var53).field5214[var54];
                return;
            }
            if (arg0 == 5058) {
                field392 = new class180();
                field392.field2617 = field415[--field409];
                field392.field2616 = class377.field5545.method2475(-11743, field392.field2617);
                field392.field2615 = new int[field392.field2616.method2222((byte) -117)];
                return;
            }
            if (arg0 == 5059) {
                field391++;
                class624.method3537(-86, class128.field2095);
                class127.field2088.method1710(0, 96);
                int var55 = class127.field2088.field3913;
                class127.field2088.method1710(0, 85);
                class127.field2088.method1699(true, field392.field2617);
                field392.field2616.method2220(field392.field2615, class127.field2088, false);
                class127.field2088.method1688(class127.field2088.field3913 - var55, 101);
                return;
            }
            if (arg0 == 5060) {
                String var56 = field410[--field406];
                field408++;
                class624.method3537(-109, class69.field1300);
                class127.field2088.method1710(0, 40);
                int var57 = class127.field2088.field3913;
                class127.field2088.method1726((byte) -52, var56);
                class127.field2088.method1699(true, field392.field2617);
                field392.field2616.method2220(field392.field2615, class127.field2088, false);
                class127.field2088.method1688(class127.field2088.field3913 - var57, 90);
                return;
            }
            if (arg0 == 5061) {
                field391++;
                class624.method3537(-120, class128.field2095);
                class127.field2088.method1710(0, 62);
                int var58 = class127.field2088.field3913;
                class127.field2088.method1710(1, 86);
                class127.field2088.method1699(true, field392.field2617);
                field392.field2616.method2220(field392.field2615, class127.field2088, false);
                class127.field2088.method1688(class127.field2088.field3913 - var58, 125);
                return;
            }
            if (arg0 == 5062) {
                field409 -= 2;
                int var59 = field415[field409];
                int var60 = field415[field409 + 1];
                field415[field409++] = class159.field2377.method3302((byte) 31, var59).field2689[var60];
                return;
            }
            if (arg0 == 5063) {
                field409 -= 2;
                int var61 = field415[field409];
                int var62 = field415[field409 + 1];
                field415[field409++] = class159.field2377.method3302((byte) 31, var61).field2685[var62];
                return;
            }
            if (arg0 == 5064) {
                field409 -= 2;
                int var63 = field415[field409];
                int var64 = field415[field409 + 1];
                if (var64 == -1) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = class159.field2377.method3302((byte) 31, var63).method1242((char) var64, 106);
                return;
            }
            if (arg0 == 5065) {
                field409 -= 2;
                int var65 = field415[field409];
                int var66 = field415[field409 + 1];
                if (var66 == -1) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = class159.field2377.method3302((byte) 31, var65).method1247((char) var66, (byte) 65);
                return;
            }
            if (arg0 == 5066) {
                int var67 = field415[--field409];
                field415[field409++] = class377.field5545.method2475(-11743, var67).method2222((byte) -117);
                return;
            }
            if (arg0 == 5067) {
                field409 -= 2;
                int var68 = field415[field409];
                int var69 = field415[field409 + 1];
                int var70 = class377.field5545.method2475(-11743, var68).method2219(var69, 0).field2281;
                field415[field409++] = var70;
                return;
            }
            if (arg0 == 5068) {
                field409 -= 2;
                int var71 = field415[field409];
                int var72 = field415[field409 + 1];
                field392.field2615[var71] = var72;
                return;
            }
            if (arg0 == 5069) {
                field409 -= 2;
                int var73 = field415[field409];
                int var74 = field415[field409 + 1];
                field392.field2615[var73] = var74;
                return;
            }
            if (arg0 == 5070) {
                field409 -= 3;
                int var75 = field415[field409];
                int var76 = field415[field409 + 1];
                int var77 = field415[field409 + 2];
                class368 var78 = class377.field5545.method2475(-11743, var75);
                if (var78.method2219(var76, 0).field2281 != 0) {
                    throw new RuntimeException("bad command");
                }
                field415[field409++] = var78.method2226(-14577, var77, var76);
                return;
            }
            if (arg0 == 5071) {
                String var79 = field410[--field406];
                boolean var80 = field415[--field409] == 1;
                class386.method2341(var79, -98, var80);
                field415[field409++] = class237.field3481;
                return;
            }
            if (arg0 == 5072) {
                if (class66.field1114 != null && class327.field4717 < class237.field3481) {
                    field415[field409++] = class66.field1114[class327.field4717++] & 0xFFFF;
                    return;
                }
                field415[field409++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class327.field4717 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class404.field6022.method2183(86, false)) {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class404.field6022.method2183(82, false)) {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class404.field6022.method2183(81, false)) {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class412.method2496(120, field415[--field409]);
                return;
            }
            if (arg0 == 5201) {
                field415[field409++] = class467.method2715((byte) 40);
                return;
            }
            if (arg0 == 5205) {
                class577.method3297(-1, -1, false, field415[--field409], false);
                return;
            }
            if (arg0 == 5206) {
                int var81 = field415[--field409];
                class644 var82 = class212.method1408(var81 >> 14 & 0x3FFF, var81 & 0x3FFF);
                if (var82 == null) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = var82.field9376;
                return;
            }
            if (arg0 == 5207) {
                class644 var83 = class212.method1410(field415[--field409]);
                if (var83 != null && var83.field9369 != null) {
                    field410[field406++] = var83.field9369;
                    return;
                }
                field410[field406++] = "";
                return;
            }
            if (arg0 == 5208) {
                field415[field409++] = class621.field8756;
                field415[field409++] = class151.field2280;
                return;
            }
            if (arg0 == 5209) {
                field415[field409++] = class274.field4008 + class212.field3118;
                field415[field409++] = class212.field3120 + class119.field1915;
                return;
            }
            if (arg0 == 5210) {
                int var84 = field415[--field409];
                class644 var85 = class212.method1410(var84);
                if (var85 == null) {
                    field415[field409++] = 0;
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = var85.field9356 >> 14 & 0x3FFF;
                field415[field409++] = var85.field9356 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var86 = field415[--field409];
                class644 var87 = class212.method1410(var86);
                if (var87 == null) {
                    field415[field409++] = 0;
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = var87.field9372 - var87.field9361;
                field415[field409++] = var87.field9364 - var87.field9359;
                return;
            }
            if (arg0 == 5212) {
                class153 var88 = class303.method1893(126);
                if (var88 == null) {
                    field415[field409++] = -1;
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = var88.field2298;
                int var89 = var88.field2294 << 28 | class212.field3118 + var88.field2295 << 14 | class212.field3120 + var88.field2305;
                field415[field409++] = var89;
                return;
            }
            if (arg0 == 5213) {
                class153 var90 = class42.method376(107);
                if (var90 == null) {
                    field415[field409++] = -1;
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = var90.field2298;
                int var91 = var90.field2294 << 28 | class212.field3118 + var90.field2295 << 14 | class212.field3120 + var90.field2305;
                field415[field409++] = var91;
                return;
            }
            if (arg0 == 5214) {
                int var92 = field415[--field409];
                class644 var93 = class184.method1236(true);
                if (var93 != null) {
                    boolean var94 = var93.method3710(var92 & 0x3FFF, var92 >> 14 & 0x3FFF, var92 >> 28 & 0x3, (byte) 96, field418);
                    if (var94) {
                        class353.method2143(1, field418[2], field418[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field409 -= 2;
                int var95 = field415[field409];
                int var96 = field415[field409 + 1];
                class59 var97 = class212.method1424(var95 >> 14 & 0x3FFF, var95 & 0x3FFF);
                boolean var98 = false;
                for (class644 var99 = (class644) var97.method475(28); var99 != null; var99 = (class644) var97.method480(-116)) {
                    if (var99.field9376 == var96) {
                        var98 = true;
                        break;
                    }
                }
                if (var98) {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var100 = field415[--field409];
                class644 var101 = class212.method1410(var100);
                if (var101 == null) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = var101.field9377;
                return;
            }
            if (arg0 == 5220) {
                field415[field409++] = class210.field2970 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var102 = field415[--field409];
                class353.method2143(1, var102 & 0x3FFF, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class644 var103 = class184.method1236(true);
                if (var103 != null) {
                    boolean var104 = var103.method3714(-2, class274.field4008 + class212.field3118, class212.field3120 + class119.field1915, field418);
                    if (var104) {
                        field415[field409++] = field418[1];
                        field415[field409++] = field418[2];
                        return;
                    }
                    field415[field409++] = -1;
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = -1;
                field415[field409++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field409 -= 2;
                int var105 = field415[field409];
                int var106 = field415[field409 + 1];
                class577.method3297(var106 & 0x3FFF, var106 >> 14 & 0x3FFF, false, var105, false);
                return;
            }
            if (arg0 == 5224) {
                int var107 = field415[--field409];
                class644 var108 = class184.method1236(true);
                if (var108 != null) {
                    boolean var109 = var108.method3710(var107 & 0x3FFF, var107 >> 14 & 0x3FFF, var107 >> 28 & 0x3, (byte) 96, field418);
                    if (var109) {
                        field415[field409++] = field418[1];
                        field415[field409++] = field418[2];
                        return;
                    }
                    field415[field409++] = -1;
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = -1;
                field415[field409++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var110 = field415[--field409];
                class644 var111 = class184.method1236(true);
                if (var111 != null) {
                    boolean var112 = var111.method3714(-2, var110 >> 14 & 0x3FFF, var110 & 0x3FFF, field418);
                    if (var112) {
                        field415[field409++] = field418[1];
                        field415[field409++] = field418[2];
                        return;
                    }
                    field415[field409++] = -1;
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = -1;
                field415[field409++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class639.method3687(field415[--field409], 28625);
                return;
            }
            if (arg0 == 5227) {
                field409 -= 2;
                int var113 = field415[field409];
                int var114 = field415[field409 + 1];
                class577.method3297(var114 & 0x3FFF, var114 >> 14 & 0x3FFF, true, var113, false);
                return;
            }
            if (arg0 == 5228) {
                class54.field778 = field415[--field409] == 1;
                return;
            }
            if (arg0 == 5229) {
                field415[field409++] = class54.field778 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var115 = field415[--field409];
                class389.method2355(var115, (byte) 113);
                return;
            }
            if (arg0 == 5231) {
                field409 -= 2;
                int var116 = field415[field409];
                boolean var117 = field415[field409 + 1] == 1;
                if (class330.field4742 != null) {
                    class108 var118 = class330.field4742.method740(0, (long) var116);
                    if (var118 != null && !var117) {
                        var118.method911(-52);
                        return;
                    }
                    if (var118 == null && var117) {
                        class108 var119 = new class108();
                        class330.field4742.method737((long) var116, (byte) 92, var119);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var120 = field415[--field409];
                if (class330.field4742 != null) {
                    class108 var121 = class330.field4742.method740(0, (long) var120);
                    field415[field409++] = var121 == null ? 0 : 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field409 -= 2;
                int var122 = field415[field409];
                boolean var123 = field415[field409 + 1] == 1;
                if (class526.field7325 != null) {
                    class108 var124 = class526.field7325.method740(0, (long) var122);
                    if (var124 != null && !var123) {
                        var124.method911(-52);
                        return;
                    }
                    if (var124 == null && var123) {
                        class108 var125 = new class108();
                        class526.field7325.method737((long) var122, (byte) 92, var125);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var126 = field415[--field409];
                if (class526.field7325 != null) {
                    class108 var127 = class526.field7325.method740(0, (long) var126);
                    field415[field409++] = var127 == null ? 0 : 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field415[field409++] = class212.field3093 == null ? -1 : class212.field3093.field9376;
                return;
            }
            if (arg0 == 5236) {
                field409 -= 2;
                int var128 = field415[field409];
                int var129 = field415[field409 + 1];
                int var130 = var129 >> 14 & 0x3FFF;
                int var131 = var129 & 0x3FFF;
                int var132 = class552.method3100(var128, (byte) 58, var130, var131);
                if (var132 < 0) {
                    field415[field409++] = -1;
                    return;
                }
                field415[field409++] = var132;
                return;
            }
            if (arg0 == 5237) {
                class565.method3215((byte) -76);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field409 -= 2;
                int var133 = field415[field409];
                int var134 = field415[field409 + 1];
                class5.method14(var133, -69, var134, false, 3);
                field415[field409++] = class443.field6474 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class443.field6474 != null) {
                    class5.method14(-1, 78, -1, false, class202.field2854.field7925);
                }
                return;
            }
            if (arg0 == 5302) {
                class145[] var135 = class268.method1731(82);
                field415[field409++] = var135.length;
                return;
            }
            if (arg0 == 5303) {
                int var136 = field415[--field409];
                class145[] var137 = class268.method1731(68);
                field415[field409++] = var137[var136].field2236;
                field415[field409++] = var137[var136].field2237;
                return;
            }
            if (arg0 == 5305) {
                int var138 = class202.field2854.field7920;
                int var139 = class202.field2854.field7924;
                int var140 = -1;
                class145[] var141 = class268.method1731(33);
                for (int var142 = 0; var142 < var141.length; var142++) {
                    class145 var143 = var141[var142];
                    if (var143.field2236 == var138 && var143.field2237 == var139) {
                        var140 = var142;
                        break;
                    }
                }
                field415[field409++] = var140;
                return;
            }
            if (arg0 == 5306) {
                field415[field409++] = class512.method2868(2);
                return;
            }
            if (arg0 == 5307) {
                int var144 = field415[--field409];
                if (var144 >= 1 && var144 <= 2) {
                    class5.method14(-1, 93, -1, false, var144);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field415[field409++] = class202.field2854.field7925;
                return;
            }
            if (arg0 == 5309) {
                int var145 = field415[--field409];
                if (var145 >= 1 && var145 <= 2) {
                    class202.field2854.field7925 = var145;
                    class202.field2854.method2642((byte) -120, class270.field3976);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field406 -= 2;
                String var146 = field410[field406];
                String var147 = field410[field406 + 1];
                int var148 = field415[--field409];
                field411++;
                class624.method3537(-82, class219.field3295);
                class127.field2088.method1710(class51.method441((byte) 97, var146) + class51.method441((byte) 96, var147) + 1, 44);
                class127.field2088.method1726((byte) -52, var146);
                class127.field2088.method1726((byte) -52, var147);
                class127.field2088.method1710(var148, 69);
                return;
            }
            if (arg0 == 5401) {
                field409 -= 2;
                class129.field2101[field415[field409]] = (short) class278.method1789(field415[field409 + 1], (byte) 82);
                class611.field8684.method1619((byte) 127);
                class611.field8684.method1623(-124);
                class204.field2882.method290(50);
                class530.method2980(-6891);
                return;
            }
            if (arg0 == 5405) {
                field409 -= 2;
                int var149 = field415[field409];
                int var150 = field415[field409 + 1];
                if (var149 >= 0 && var149 < 2) {
                    class128.field2097[var149] = new int[var150 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field409 -= 7;
                int var151 = field415[field409];
                int var152 = field415[field409 + 1] << 1;
                int var153 = field415[field409 + 2];
                int var154 = field415[field409 + 3];
                int var155 = field415[field409 + 4];
                int var156 = field415[field409 + 5];
                int var157 = field415[field409 + 6];
                if (var151 >= 0 && var151 < 2 && class128.field2097[var151] != null && var152 >= 0 && var152 < class128.field2097[var151].length) {
                    class128.field2097[var151][var152] = new int[] { (var153 >> 14 & 0x3FFF) << 7, var154, (var153 & 0x3FFF) << 7, var157 };
                    class128.field2097[var151][var152 + 1] = new int[] { (var155 >> 14 & 0x3FFF) << 7, var156, (var155 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var158 = class128.field2097[field415[--field409]].length >> 1;
                field415[field409++] = var158;
                return;
            }
            if (arg0 == 5411) {
                if (class443.field6474 != null) {
                    class5.method14(-1, -104, -1, false, class202.field2854.field7925);
                }
                if (class327.field4718 != null) {
                    class433.method2583(6428);
                    System.exit(0);
                    return;
                }
                String var159 = class43.field594 == null ? class246.method1564((byte) -100) : class43.field594;
                class132.method1023(class270.field3976, false, class646.field9388 == 1, var159, -6116);
                return;
            }
            if (arg0 == 5419) {
                String var160 = "";
                if (class39.field542 != null) {
                    if (class39.field542.field4737 == null) {
                        var160 = class646.method3718(255, class39.field542.field4738);
                    } else {
                        var160 = (String) class39.field542.field4737;
                    }
                }
                field410[field406++] = var160;
                return;
            }
            if (arg0 == 5420) {
                field415[field409++] = class40.field554 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class443.field6474 != null) {
                    class5.method14(-1, 59, -1, false, class202.field2854.field7925);
                }
                String var161 = field410[--field406];
                boolean var162 = field415[--field409] == 1;
                String var163 = class246.method1564((byte) -97) + var161;
                class132.method1023(class270.field3976, var162, class646.field9388 == 1, var163, -6116);
                return;
            }
            if (arg0 == 5422) {
                field406 -= 2;
                String var164 = field410[field406];
                String var165 = field410[field406 + 1];
                int var166 = field415[--field409];
                if (var164.length() > 0) {
                    if (class276.field4035 == null) {
                        class276.field4035 = new String[class222.field3349[class640.field9282.field8321]];
                    }
                    class276.field4035[var166] = var164;
                }
                if (var165.length() > 0) {
                    if (class247.field3595 == null) {
                        class247.field3595 = new String[class222.field3349[class640.field9282.field8321]];
                    }
                    class247.field3595[var166] = var165;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field410[--field406]);
                return;
            }
            if (arg0 == 5424) {
                field409 -= 11;
                class304.field4389 = field415[field409];
                class519.field7204 = field415[field409 + 1];
                class399.field5942 = field415[field409 + 2];
                class35.field474 = field415[field409 + 3];
                class242.field3515 = field415[field409 + 4];
                class146.field2248 = field415[field409 + 5];
                class141.field2209 = field415[field409 + 6];
                class392.field5856 = field415[field409 + 7];
                class112.field1865 = field415[field409 + 8];
                class629.field8847 = field415[field409 + 9];
                class168.field2452 = field415[field409 + 10];
                class325.field4675.method3186((byte) 57, class242.field3515);
                class325.field4675.method3186((byte) 57, class146.field2248);
                class325.field4675.method3186((byte) 57, class141.field2209);
                class325.field4675.method3186((byte) 57, class392.field5856);
                class325.field4675.method3186((byte) 57, class112.field1865);
                class631.field8866 = null;
                class544.field7579 = null;
                class98.field1706 = null;
                class66.field1011 = null;
                class524.field7283 = null;
                class430.field6278 = null;
                class574.field8177 = null;
                class78.field1416 = null;
                class255.field3709 = true;
                return;
            }
            if (arg0 == 5425) {
                class539.method3030((byte) -95);
                class255.field3709 = false;
                return;
            }
            if (arg0 == 5426) {
                field409 -= 2;
                class354.field5063 = field415[field409];
                class340.field4894 = field415[field409 + 1];
                return;
            }
            if (arg0 == 5427) {
                field409 -= 2;
                class187.field2701 = field415[field409 + 1];
                return;
            }
            if (arg0 == 5428) {
                field409 -= 2;
                int var167 = field415[field409];
                int var168 = field415[field409 + 1];
                field415[field409++] = class202.method1304((byte) 112, var168, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class170.method1174(field410[--field406], false, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class630.method3564(class270.field3976.field549, "accountcreated", (byte) -90);
                    return;
                } catch (Throwable var291) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class630.method3564(class270.field3976.field549, "accountcreatestarted", (byte) 53);
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field409 -= 4;
                int var169 = field415[field409];
                int var170 = field415[field409 + 1];
                int var171 = field415[field409 + 2];
                int var172 = field415[field409 + 3];
                class254.method1600((byte) 105, (var169 & 0x3FFF) - class597.field8500, (var169 >> 14 & 0x3FFF) - class382.field5687, var171, var172, false, var170);
                return;
            }
            if (arg0 == 5501) {
                field409 -= 4;
                int var173 = field415[field409];
                int var174 = field415[field409 + 1];
                int var175 = field415[field409 + 2];
                int var176 = field415[field409 + 3];
                class365.method2206(352, (var173 & 0x3FFF) - class597.field8500, var175, var176, (var173 >> 14 & 0x3FFF) - class382.field5687, var174);
                return;
            }
            if (arg0 == 5502) {
                field409 -= 6;
                int var177 = field415[field409];
                if (var177 >= 2) {
                    throw new RuntimeException();
                }
                class112.field1866 = var177;
                int var178 = field415[field409 + 1];
                if (var178 + 1 >= class128.field2097[class112.field1866].length >> 1) {
                    throw new RuntimeException();
                }
                class557.field7877 = var178;
                class39.field522 = 0;
                class606.field8625 = field415[field409 + 2];
                class143.field2221 = field415[field409 + 3];
                int var179 = field415[field409 + 4];
                if (var179 >= 2) {
                    throw new RuntimeException();
                }
                class459.field6615 = var179;
                int var180 = field415[field409 + 5];
                if (var180 + 1 >= class128.field2097[class459.field6615].length >> 1) {
                    throw new RuntimeException();
                }
                class45.field635 = var180;
                class377.field5547 = 3;
                return;
            }
            if (arg0 == 5503) {
                class393.method2379((byte) 102);
                return;
            }
            if (arg0 == 5504) {
                field409 -= 2;
                class205.method1314(field415[field409], 0, (byte) 102, field415[field409 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field415[field409++] = (int) class181.field2622 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field415[field409++] = (int) class523.field7256 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class83.method759(47);
                return;
            }
            if (arg0 == 5508) {
                class380.method2307(1);
                return;
            }
            if (arg0 == 5509) {
                class13.method75(0);
                return;
            }
            if (arg0 == 5510) {
                class461.method2700((byte) 2);
                return;
            }
            if (arg0 == 5511) {
                int var181 = field415[--field409];
                int var182 = var181 >> 14 & 0x3FFF;
                int var183 = var181 & 0x3FFF;
                int var184 = var182 - class382.field5687;
                if (var184 < 0) {
                    var184 = 0;
                } else if (var184 >= class146.field2247) {
                    var184 = class146.field2247;
                }
                int var185 = var183 - class597.field8500;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class66.field990) {
                    var185 = class66.field990;
                }
                class69.field1304 = (var184 << 7) + 64;
                class56.field807 = (var185 << 7) + 64;
                class377.field5547 = 4;
                return;
            }
            if (arg0 == 5512) {
                class183.method1229((byte) -20);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field406 -= 2;
                String var186 = field410[field406];
                String var187 = field410[field406 + 1];
                int var188 = field415[--field409];
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    class646.field9387 = var186;
                    class621.field8755 = var187;
                    class343.field4929 = var188;
                    class307.method1904(true, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class365.method2207((byte) -114);
                return;
            }
            if (arg0 == 5602) {
                if (class599.field8510 == 0) {
                    class624.field8795 = -2;
                    class544.field7580 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field409 -= 4;
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    class229.method1507(field415[field409], (byte) -47, field415[field409 + 1], field415[field409 + 3], field415[field409 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field406--;
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    class453.method2669(class640.method3691(-10880, field410[field406]), 112);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field406 -= 2;
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    class122.method981((byte) 124, class640.method3691(-10880, field410[field406]), field410[field406 + 1], false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class23.field324 == 0) {
                    class551.field7801 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field415[field409++] = class544.field7580;
                return;
            }
            if (arg0 == 5608) {
                field415[field409++] = class634.field9222;
                return;
            }
            if (arg0 == 5609) {
                field415[field409++] = class551.field7801;
                return;
            }
            if (arg0 == 5610) {
                for (int var189 = 0; var189 < 5; var189++) {
                    field410[field406++] = class574.field8180.length > var189 ? class251.method1586((byte) -123, class574.field8180[var189]) : "";
                }
                class574.field8180 = null;
                return;
            }
            if (arg0 == 5611) {
                field415[field409++] = class340.field4886;
                return;
            }
            if (arg0 == 5612) {
                int var190 = field415[--field409];
                if (class64.field893 != 6) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    if (client.field8770 != null) {
                        client.field8770.method2743((byte) 100);
                        client.field8770 = null;
                    }
                    class343.field4929 = var190;
                    class307.method1904(true, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field415[field409++] = class544.field7580;
                return;
            }
            if (arg0 == 5615) {
                field406 -= 2;
                String var191 = field410[field406];
                String var192 = field410[field406 + 1];
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    if (client.field8770 != null) {
                        client.field8770.method2743((byte) -14);
                        client.field8770 = null;
                    }
                    class646.field9387 = var191;
                    class621.field8755 = var192;
                    class307.method1904(true, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class271.method1759(false, 4);
                return;
            }
            if (arg0 == 5617) {
                field415[field409++] = class624.field8795;
                return;
            }
            if (arg0 == 5618) {
                int var193 = field415[--field409];
                class323.method2008(3, var193, false);
                return;
            }
            if (arg0 == 5619) {
                int var194 = field415[--field409];
                class323.method2008(3, var194, true);
                return;
            }
            if (arg0 == 5620) {
                class408.method2479((byte) -52);
                if (class636.field9236 != "" && class636.field9236 != "") {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field406 -= 2;
                if (class64.field893 != 2) {
                    return;
                }
                if (class599.field8510 == 0 && class23.field324 == 0) {
                    class122.method981((byte) 124, class640.method3691(-10880, field410[field406]), field410[field406 + 1], true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class329 var195 = class270.field3976.method364(false, "3", (byte) 68);
                while (var195.field4739 == 0) {
                    class210.method1342(-54, 1L);
                }
                if (var195.field4739 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class135 var196 = (class135) var195.field4737;
                if (var196.method1035(-7763).exists()) {
                    class268 var197 = new class268(50);
                    try {
                        var196.method1034(var197.field3952, 0, 127, 50);
                    } catch (IOException var294) {
                    }
                }
                try {
                    var196.method1036(67);
                    return;
                } catch (Exception var293) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class258.field3752 != null) {
                    field415[field409++] = 1;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var198 = field415[--field409];
                if (var198 < 1) {
                    var198 = 1;
                }
                if (var198 > 4) {
                    var198 = 4;
                }
                class202.field2854.field7904 = var198;
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6002) {
                class202.field2854.method2645(8364, field415[--field409] == 1);
                class540.method3036(3273);
                class531.method2994(-124);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6003) {
                class202.field2854.field7908 = field415[--field409] == 1;
                class531.method2994(-58);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6005) {
                class202.field2854.field7902 = field415[--field409] == 1;
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6006) {
                class202.field2854.field7912 = field415[--field409] == 1;
                class159.field2378.method525(!class202.field2854.field7912);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6007) {
                class202.field2854.field7899 = field415[--field409];
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6008) {
                class202.field2854.field7884 = field415[--field409] == 1;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6009) {
                class202.field2854.field7891 = field415[--field409] == 1;
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6010) {
                class202.field2854.field7922 = field415[--field409] == 1;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6011) {
                int var199 = field415[--field409];
                if (var199 < 0 || var199 > 2) {
                    var199 = 0;
                }
                class202.field2854.method3139(0, class646.field9388, var199);
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6012) {
                class202.field2854.method3138(field415[--field409] == 1, (byte) -34, class646.field9388);
                class229.method1508(0);
                class150.method1077(127);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6014) {
                class202.field2854.field7898 = field415[--field409] == 1;
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6015) {
                class202.field2854.field7919 = field415[--field409] == 1;
                class540.method3036(3273);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6016) {
                int var200 = field415[--field409];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class202.field2854.field7889 = var200;
                class471.method2738(127, class646.field9388);
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6017) {
                class202.field2854.field7916 = field415[--field409] == 1;
                class222.method1488((byte) 119);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6018) {
                int var201 = field415[--field409];
                if (var201 < 0) {
                    var201 = 0;
                }
                if (var201 > 127) {
                    var201 = 127;
                }
                class202.field2854.field7888 = var201;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6019) {
                int var202 = field415[--field409];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 255) {
                    var202 = 255;
                }
                if (class202.field2854.field7921 != var202) {
                    if (class202.field2854.field7921 == 0 && class93.field1643 != -1) {
                        class367.method2214(class93.field1643, 0, class115.field1890, var202, 72, false);
                        class331.field4757 = false;
                    } else if (var202 == 0) {
                        class89.method801(124);
                        class331.field4757 = false;
                    } else {
                        class63.method498(1, var202);
                    }
                    class202.field2854.field7921 = var202;
                }
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6020) {
                int var203 = field415[--field409];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 127) {
                    var203 = 127;
                }
                class202.field2854.field7886 = var203;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6021) {
                class202.field2854.field6505 = field415[--field409] == 1;
                class531.method2994(-89);
                return;
            }
            if (arg0 == 6023) {
                int var204 = field415[--field409];
                boolean var205 = false;
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 2) {
                    var204 = 2;
                }
                if (class555.field7861 < 96) {
                    var204 = 0;
                    var205 = true;
                }
                class617.method3495(950562888, var204);
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                field415[field409++] = var205 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var206 = field415[--field409];
                if (var206 < 0 || var206 > 2) {
                    var206 = 0;
                }
                class202.field2854.field7890 = var206;
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6025) {
                int var207 = field415[--field409];
                if (var207 < 0 || var207 > class13.method73(class555.field7861, (byte) -83)) {
                    var207 = 0;
                }
                class202.field2854.field7885 = var207;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6027) {
                int var208 = field415[--field409];
                if (var208 < 0 || var208 > 1) {
                    var208 = 0;
                }
                class538.method3026(var208 == 1, (byte) -93);
                return;
            }
            if (arg0 == 6028) {
                class202.field2854.field7901 = field415[--field409] != 0;
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6029) {
                class202.field2854.field7899 = field415[--field409];
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6030) {
                class202.field2854.field7895 = field415[--field409] != 0;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class540.method3036(3273);
                return;
            }
            if (arg0 == 6031) {
                int var209 = field415[--field409];
                if (var209 < 0 || var209 > 5) {
                    var209 = 2;
                }
                class471.method2738(127, var209);
                return;
            }
            if (arg0 == 6032) {
                int var210 = field415[--field409];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class202.field2854.field7918 = var210;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6033) {
                int var211 = field415[--field409];
                if (var211 < 0 || var211 > 4) {
                    var211 = 2;
                }
                class202.field2854.field7883 = var211;
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6034) {
                class202.field2854.field7893 = field415[--field409] == 1;
                class202.field2854.method2642((byte) -120, class270.field3976);
                class229.method1508(0);
                class434.field6378 = false;
                return;
            }
            if (arg0 == 6035) {
                class202.field2854.field6512 = field415[--field409] == 1;
                class540.method3036(3273);
                class531.method2994(-39);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field415[field409++] = class202.field2854.field7904;
                return;
            }
            if (arg0 == 6102) {
                field415[field409++] = class202.field2854.method2630((byte) -116, class646.field9388) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field415[field409++] = class202.field2854.field7908 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field415[field409++] = class202.field2854.field7902 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field415[field409++] = class202.field2854.field7912 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field415[field409++] = class202.field2854.field7899;
                return;
            }
            if (arg0 == 6108) {
                field415[field409++] = class202.field2854.field7884 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field415[field409++] = class202.field2854.field7891 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field415[field409++] = class202.field2854.field7922 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field415[field409++] = class202.field2854.method3143(class646.field9388, 0);
                return;
            }
            if (arg0 == 6112) {
                field415[field409++] = class202.field2854.method3140(class646.field9388, 2) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field415[field409++] = class202.field2854.field7898 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field415[field409++] = class202.field2854.field7919 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field415[field409++] = class202.field2854.field7889;
                return;
            }
            if (arg0 == 6117) {
                field415[field409++] = class202.field2854.field7916 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field415[field409++] = class202.field2854.field7888;
                return;
            }
            if (arg0 == 6119) {
                field415[field409++] = class202.field2854.field7921;
                return;
            }
            if (arg0 == 6120) {
                field415[field409++] = class202.field2854.field7886;
                return;
            }
            if (arg0 == 6121) {
                field415[field409++] = class159.field2378.method645() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field415[field409++] = class111.method924(-104);
                return;
            }
            if (arg0 == 6124) {
                field415[field409++] = class202.field2854.field7890;
                return;
            }
            if (arg0 == 6125) {
                field415[field409++] = class202.field2854.field7885;
                return;
            }
            if (arg0 == 6126) {
                field415[field409++] = class159.field2378.method595() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field415[field409++] = class202.field2854.field7905 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field415[field409++] = class202.field2854.field7901 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field415[field409++] = class202.field2854.field7899;
                return;
            }
            if (arg0 == 6130) {
                field415[field409++] = class202.field2854.field7895 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field415[field409++] = class646.field9388;
                return;
            }
            if (arg0 == 6132) {
                field415[field409++] = class202.field2854.field7918;
                return;
            }
            if (arg0 == 6133) {
                field415[field409++] = class40.field554 == 1 || class40.field554 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field415[field409++] = class13.method73(class555.field7861, (byte) -83);
                return;
            }
            if (arg0 == 6135) {
                field415[field409++] = class202.field2854.field7883;
                return;
            }
            if (arg0 == 6136) {
                field415[field409++] = class202.field2854.field7893 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var212 = true;
                try {
                    var212 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var295) {
                }
                field415[field409++] = var212 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field409 -= 2;
                class468.field6746 = (short) field415[field409];
                if (class468.field6746 <= 0) {
                    class468.field6746 = 256;
                }
                class132.field2133 = (short) field415[field409 + 1];
                if (class132.field2133 <= 0) {
                    class132.field2133 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field409 -= 2;
                class58.field824 = (short) field415[field409];
                if (class58.field824 <= 0) {
                    class58.field824 = 256;
                }
                class371.field5368 = (short) field415[field409 + 1];
                if (class371.field5368 <= 0) {
                    class371.field5368 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field409 -= 4;
                class606.field8628 = (short) field415[field409];
                if (class606.field8628 <= 0) {
                    class606.field8628 = 1;
                }
                class559.field7928 = (short) field415[field409 + 1];
                if (class559.field7928 <= 0) {
                    class559.field7928 = 32767;
                } else if (class559.field7928 < class606.field8628) {
                    class559.field7928 = class606.field8628;
                }
                class274.field4012 = (short) field415[field409 + 2];
                if (class274.field4012 <= 0) {
                    class274.field4012 = 1;
                }
                class602.field8570 = (short) field415[field409 + 3];
                if (class602.field8570 <= 0) {
                    class602.field8570 = 32767;
                    return;
                }
                if (class602.field8570 < class274.field4012) {
                    class602.field8570 = class274.field4012;
                }
                return;
            }
            if (arg0 == 6203) {
                class49.method435(class477.field6818.field7678, 0, 0, false, 5674, class477.field6818.field7776);
                field415[field409++] = class10.field113;
                field415[field409++] = class401.field6002;
                return;
            }
            if (arg0 == 6204) {
                field415[field409++] = class58.field824;
                field415[field409++] = class371.field5368;
                return;
            }
            if (arg0 == 6205) {
                field415[field409++] = class468.field6746;
                field415[field409++] = class132.field2133;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field415[field409++] = (int) (class508.method2860(false) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field415[field409++] = (int) (class508.method2860(false) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field409 -= 3;
                int var213 = field415[field409];
                int var214 = field415[field409 + 1];
                int var215 = field415[field409 + 2];
                field393.clear();
                field393.set(11, 12);
                field393.set(var215, var214, var213);
                int var216 = (int) (field393.getTime().getTime() / 86400000L) - 11745;
                if (var215 < 1970) {
                    var216--;
                }
                field415[field409++] = var216;
                return;
            }
            if (arg0 == 6303) {
                field393.clear();
                field393.setTime(new Date(class508.method2860(false)));
                field415[field409++] = field393.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var217 = field415[--field409];
                boolean var218 = true;
                if (var217 < 0) {
                    var218 = (var217 + 1) % 4 == 0;
                } else if (var217 < 1582) {
                    var218 = var217 % 4 == 0;
                } else if (var217 % 4 != 0) {
                    var218 = false;
                } else if (var217 % 100 != 0) {
                    var218 = true;
                } else if (var217 % 400 != 0) {
                    var218 = false;
                }
                field415[field409++] = var218 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field415[field409++] = class643.method3705(-110) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field415[field409++] = class270.method1756(125) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class64.field893 == 6 && class599.field8510 == 0 && class23.field324 == 0) {
                    if (class88.field1595) {
                        field415[field409++] = 0;
                        return;
                    }
                    if (class41.field576 > class508.method2860(false) - 1000L) {
                        field415[field409++] = 1;
                        return;
                    }
                    class88.field1595 = true;
                    class624.method3537(-122, class623.field8788);
                    class127.field2088.method1702(class285.field4158, false);
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class225 var219 = class548.method3068((byte) 115);
                if (var219 != null) {
                    field415[field409++] = var219.field3364;
                    field415[field409++] = var219.field596;
                    field410[field406++] = var219.field3362;
                    class266 var220 = var219.method1497(0);
                    field415[field409++] = var220.field3881;
                    field410[field406++] = var220.field3884;
                    field415[field409++] = var219.field583;
                    field415[field409++] = var219.field3358;
                    field410[field406++] = var219.field3366;
                    return;
                }
                field415[field409++] = -1;
                field415[field409++] = 0;
                field410[field406++] = "";
                field415[field409++] = 0;
                field410[field406++] = "";
                field415[field409++] = 0;
                field415[field409++] = 0;
                field410[field406++] = "";
                return;
            }
            if (arg0 == 6502) {
                class225 var221 = class531.method2984((byte) -96);
                if (var221 != null) {
                    field415[field409++] = var221.field3364;
                    field415[field409++] = var221.field596;
                    field410[field406++] = var221.field3362;
                    class266 var222 = var221.method1497(0);
                    field415[field409++] = var222.field3881;
                    field410[field406++] = var222.field3884;
                    field415[field409++] = var221.field583;
                    field415[field409++] = var221.field3358;
                    field410[field406++] = var221.field3366;
                    return;
                }
                field415[field409++] = -1;
                field415[field409++] = 0;
                field410[field406++] = "";
                field415[field409++] = 0;
                field410[field406++] = "";
                field415[field409++] = 0;
                field415[field409++] = 0;
                field410[field406++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var223 = field415[--field409];
                String var224 = field410[--field406];
                if (class64.field893 == 6 && class599.field8510 == 0 && class23.field324 == 0) {
                    field415[field409++] = class177.method1207(40000, var224, var223) ? 1 : 0;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class202.field2854.field7894 = field415[--field409];
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6505) {
                field415[field409++] = class202.field2854.field7894;
                return;
            }
            if (arg0 == 6506) {
                int var225 = field415[--field409];
                class225 var226 = class290.method1836((byte) 35, var225);
                if (var226 != null) {
                    field415[field409++] = var226.field596;
                    field410[field406++] = var226.field3362;
                    class266 var227 = var226.method1497(0);
                    field415[field409++] = var227.field3881;
                    field410[field406++] = var227.field3884;
                    field415[field409++] = var226.field583;
                    field415[field409++] = var226.field3358;
                    field410[field406++] = var226.field3366;
                    return;
                }
                field415[field409++] = -1;
                field410[field406++] = "";
                field415[field409++] = 0;
                field410[field406++] = "";
                field415[field409++] = 0;
                field415[field409++] = 0;
                field410[field406++] = "";
                return;
            }
            if (arg0 == 6507) {
                field409 -= 4;
                int var228 = field415[field409];
                boolean var229 = field415[field409 + 1] == 1;
                int var230 = field415[field409 + 2];
                boolean var231 = field415[field409 + 3] == 1;
                class433.method2585(var230, var229, var231, (byte) 105, var228);
                return;
            }
            if (arg0 == 6508) {
                class251.method1588(-21618);
                return;
            }
            if (arg0 == 6509) {
                if (class64.field893 != 6) {
                    return;
                }
                class102.field1742 = field415[--field409] == 1;
                return;
            }
            if (arg0 == 6510) {
                field415[field409++] = class600.field8520;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class202.field2854.field7903 = field415[--field409] == 1;
                class202.field2854.method2642((byte) -120, class270.field3976);
                return;
            }
            if (arg0 == 6601) {
                field415[field409++] = class202.field2854.field7903 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class616.field8722 == class115.field1889) {
            if (arg0 == 6700) {
                int var232 = class639.field9274.method742(115);
                if (class609.field8659 != -1) {
                    var232++;
                }
                field415[field409++] = var232;
                return;
            }
            if (arg0 == 6701) {
                int var233 = field415[--field409];
                if (class609.field8659 != -1) {
                    if (var233 == 0) {
                        field415[field409++] = class609.field8659;
                        return;
                    }
                    var233--;
                }
                class553 var234 = (class553) class639.field9274.method734(0);
                while (var233-- > 0) {
                    var234 = (class553) class639.field9274.method736(-1);
                }
                field415[field409++] = var234.field7827;
                return;
            }
            if (arg0 == 6702) {
                int var235 = field415[--field409];
                if (class177.field2593[var235] == null) {
                    field410[field406++] = "";
                    return;
                }
                String var236 = class177.field2593[var235][0].field7657;
                if (var236 == null) {
                    field410[field406++] = "";
                    return;
                }
                field410[field406++] = var236.substring(0, var236.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var237 = field415[--field409];
                if (class177.field2593[var237] == null) {
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = class177.field2593[var237].length;
                return;
            }
            if (arg0 == 6704) {
                field409 -= 2;
                int var238 = field415[field409];
                int var239 = field415[field409 + 1];
                if (class177.field2593[var238] == null) {
                    field410[field406++] = "";
                    return;
                }
                String var240 = class177.field2593[var238][var239].field7657;
                if (var240 == null) {
                    field410[field406++] = "";
                    return;
                }
                field410[field406++] = var240;
                return;
            }
            if (arg0 == 6705) {
                field409 -= 2;
                int var241 = field415[field409];
                int var242 = field415[field409 + 1];
                if (class177.field2593[var241] == null) {
                    field415[field409++] = 0;
                    return;
                }
                field415[field409++] = class177.field2593[var241][var242].field7710;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field409 -= 3;
                int var243 = field415[field409];
                int var244 = field415[field409 + 1];
                int var245 = field415[field409 + 2];
                class639.method3688(var243 << 16 | var244, -1791, var245, "", 1);
                return;
            }
            if (arg0 == 6708) {
                field409 -= 3;
                int var246 = field415[field409];
                int var247 = field415[field409 + 1];
                int var248 = field415[field409 + 2];
                class639.method3688(var246 << 16 | var247, -1791, var248, "", 2);
                return;
            }
            if (arg0 == 6709) {
                field409 -= 3;
                int var249 = field415[field409];
                int var250 = field415[field409 + 1];
                int var251 = field415[field409 + 2];
                class639.method3688(var249 << 16 | var250, -1791, var251, "", 3);
                return;
            }
            if (arg0 == 6710) {
                field409 -= 3;
                int var252 = field415[field409];
                int var253 = field415[field409 + 1];
                int var254 = field415[field409 + 2];
                class639.method3688(var252 << 16 | var253, -1791, var254, "", 4);
                return;
            }
            if (arg0 == 6711) {
                field409 -= 3;
                int var255 = field415[field409];
                int var256 = field415[field409 + 1];
                int var257 = field415[field409 + 2];
                class639.method3688(var255 << 16 | var256, -1791, var257, "", 5);
                return;
            }
            if (arg0 == 6712) {
                field409 -= 3;
                int var258 = field415[field409];
                int var259 = field415[field409 + 1];
                int var260 = field415[field409 + 2];
                class639.method3688(var258 << 16 | var259, -1791, var260, "", 6);
                return;
            }
            if (arg0 == 6713) {
                field409 -= 3;
                int var261 = field415[field409];
                int var262 = field415[field409 + 1];
                int var263 = field415[field409 + 2];
                class639.method3688(var261 << 16 | var262, -1791, var263, "", 7);
                return;
            }
            if (arg0 == 6714) {
                field409 -= 3;
                int var264 = field415[field409];
                int var265 = field415[field409 + 1];
                int var266 = field415[field409 + 2];
                class639.method3688(var264 << 16 | var265, -1791, var266, "", 8);
                return;
            }
            if (arg0 == 6715) {
                field409 -= 3;
                int var267 = field415[field409];
                int var268 = field415[field409 + 1];
                int var269 = field415[field409 + 2];
                class639.method3688(var267 << 16 | var268, -1791, var269, "", 9);
                return;
            }
            if (arg0 == 6716) {
                field409 -= 3;
                int var270 = field415[field409];
                int var271 = field415[field409 + 1];
                int var272 = field415[field409 + 2];
                class639.method3688(var270 << 16 | var271, -1791, var272, "", 10);
                return;
            }
            if (arg0 == 6717) {
                field409 -= 3;
                int var273 = field415[field409];
                int var274 = field415[field409 + 1];
                int var275 = field415[field409 + 2];
                class549 var276 = class547.method3061(4096, var275, var273 << 16 | var274);
                class294.method1853(49);
                class546 var277 = client.method3530(var276);
                class380.method2304(var276, false, var277.method3051((byte) -70), var277.field7587);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var278 = field415[--field409];
                class192 var279 = class249.field3634.method70(var278, 83);
                if (var279.field2753 == null) {
                    field410[field406++] = "";
                    return;
                }
                field410[field406++] = var279.field2753;
                return;
            }
            if (arg0 == 6801) {
                int var280 = field415[--field409];
                class192 var281 = class249.field3634.method70(var280, 113);
                field415[field409++] = var281.field2747;
                return;
            }
            if (arg0 == 6802) {
                int var282 = field415[--field409];
                class192 var283 = class249.field3634.method70(var282, 92);
                field415[field409++] = var283.field2759;
                return;
            }
            if (arg0 == 6803) {
                int var284 = field415[--field409];
                class192 var285 = class249.field3634.method70(var284, 102);
                field415[field409++] = var285.field2769;
                return;
            }
            if (arg0 == 6804) {
                field409 -= 2;
                int var286 = field415[field409];
                int var287 = field415[field409 + 1];
                class188 var288 = class190.field2724.method1831(-28, var287);
                if (var288.method1254(-10634)) {
                    field410[field406++] = class249.field3634.method70(var286, 100).method1270((byte) -8, var288.field2707, var287);
                    return;
                }
                field415[field409++] = class249.field3634.method70(var286, 98).method1274(var288.field2710, var287, 5);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field415[field409++] = class149.field2261 && !class118.field1910 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field415[field409++] = class51.field758;
                return;
            }
            if (arg0 == 6902) {
                field415[field409++] = class538.field7503;
                return;
            }
            if (arg0 == 6903) {
                field415[field409++] = class237.field3480;
                return;
            }
            if (arg0 == 6904) {
                field415[field409++] = class510.field7074;
                return;
            }
            if (arg0 == 6905) {
                String var289 = "";
                if (class39.field542 != null) {
                    if (class39.field542.field4737 == null) {
                        var289 = class646.method3718(255, class39.field542.field4738);
                    } else {
                        var289 = (String) class39.field542.field4737;
                    }
                }
                field410[field406++] = var289;
                return;
            }
            if (arg0 == 6906) {
                field415[field409++] = class258.field3755;
                return;
            }
            if (arg0 == 6907) {
                field415[field409++] = class19.field290;
                return;
            }
            if (arg0 == 6908) {
                field415[field409++] = class629.field8846;
                return;
            }
            if (arg0 == 6909) {
                field415[field409++] = class335.field4802 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field415[field409++] = class216.field3266;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var290 = class202.field2854.method2644(true);
                field415[field409++] = class202.field2854.field6496 = class646.field9388;
                field415[field409++] = var290;
                class540.method3036(3273);
                return;
            }
            if (arg0 == 7001) {
                class202.field2854.method2632(8211);
                class540.method3036(3273);
                return;
            }
            if (arg0 == 7002) {
                class202.field2854.method2629(-1);
                class540.method3036(3273);
                return;
            }
            if (arg0 == 7003) {
                class202.field2854.method2637(73);
                class540.method3036(3273);
                return;
            }
            if (arg0 == 7004) {
                class202.field2854.method2634((byte) -75);
                class540.method3036(3273);
                return;
            }
            if (arg0 == 7005) {
                class202.field2854.field7892 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class202.field2854.field6496 == 2) {
                    class202.field2854.field6514 = true;
                    return;
                }
                if (class202.field2854.field6496 == 1) {
                    class202.field2854.field6508 = true;
                    return;
                }
                if (class202.field2854.field6496 == 3) {
                    class202.field2854.field6518 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field415[field409++] = class202.field2854.field7892;
                return;
            }
            if (arg0 == 7008) {
                if (class646.field9388 == 0 && class555.field7861 < 96) {
                    field415[field409++] = 2;
                    return;
                }
                field415[field409++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "()V")
    public static final void method274() {
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method275(String arg0, int arg1) {
        if (class602.field8571 == 0 && !(!class149.field2261 || class118.field1910) || class361.field5140) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class48.field729.method3220(false, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class48.field729.method3220(false, 0).length());
        } else if (var2.startsWith(class192.field2778.method3220(false, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class192.field2778.method3220(false, 0).length());
        } else if (var2.startsWith(class616.field8717.method3220(false, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class616.field8717.method3220(false, 0).length());
        } else if (var2.startsWith(class473.field6779.method3220(false, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class473.field6779.method3220(false, 0).length());
        } else if (var2.startsWith(class145.field2235.method3220(false, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class145.field2235.method3220(false, 0).length());
        } else if (var2.startsWith(class13.field139.method3220(false, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class13.field139.method3220(false, 0).length());
        } else if (var2.startsWith(class54.field771.method3220(false, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class54.field771.method3220(false, 0).length());
        } else if (var2.startsWith(class546.field7591.method3220(false, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class546.field7591.method3220(false, 0).length());
        } else if (var2.startsWith(class54.field779.method3220(false, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class54.field779.method3220(false, 0).length());
        } else if (var2.startsWith(class262.field3827.method3220(false, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class262.field3827.method3220(false, 0).length());
        } else if (var2.startsWith(class511.field7079.method3220(false, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class511.field7079.method3220(false, 0).length());
        } else if (var2.startsWith(class596.field8489.method3220(false, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class596.field8489.method3220(false, 0).length());
        } else if (class538.field7500 != 0) {
            if (var2.startsWith(class48.field729.method3220(false, class538.field7500))) {
                var3 = 0;
                arg0 = arg0.substring(class48.field729.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class192.field2778.method3220(false, class538.field7500))) {
                var3 = 1;
                arg0 = arg0.substring(class192.field2778.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class616.field8717.method3220(false, class538.field7500))) {
                var3 = 2;
                arg0 = arg0.substring(class616.field8717.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class473.field6779.method3220(false, class538.field7500))) {
                var3 = 3;
                arg0 = arg0.substring(class473.field6779.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class145.field2235.method3220(false, class538.field7500))) {
                var3 = 4;
                arg0 = arg0.substring(class145.field2235.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class13.field139.method3220(false, class538.field7500))) {
                var3 = 5;
                arg0 = arg0.substring(class13.field139.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class54.field771.method3220(false, class538.field7500))) {
                var3 = 6;
                arg0 = arg0.substring(class54.field771.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class546.field7591.method3220(false, class538.field7500))) {
                var3 = 7;
                arg0 = arg0.substring(class546.field7591.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class54.field779.method3220(false, class538.field7500))) {
                var3 = 8;
                arg0 = arg0.substring(class54.field779.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class262.field3827.method3220(false, class538.field7500))) {
                var3 = 9;
                arg0 = arg0.substring(class262.field3827.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class511.field7079.method3220(false, class538.field7500))) {
                var3 = 10;
                arg0 = arg0.substring(class511.field7079.method3220(false, class538.field7500).length());
            } else if (var2.startsWith(class596.field8489.method3220(false, class538.field7500))) {
                var3 = 11;
                arg0 = arg0.substring(class596.field8489.method3220(false, class538.field7500).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class460.field6630.method3220(false, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class460.field6630.method3220(false, 0).length());
        } else if (var4.startsWith(class498.field6983.method3220(false, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class498.field6983.method3220(false, 0).length());
        } else if (var4.startsWith(class501.field7023.method3220(false, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class501.field7023.method3220(false, 0).length());
        } else if (var4.startsWith(class214.field3243.method3220(false, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class214.field3243.method3220(false, 0).length());
        } else if (var4.startsWith(class493.field6920.method3220(false, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class493.field6920.method3220(false, 0).length());
        } else if (class538.field7500 != 0) {
            if (var4.startsWith(class460.field6630.method3220(false, class538.field7500))) {
                var5 = 1;
                arg0 = arg0.substring(class460.field6630.method3220(false, class538.field7500).length());
            } else if (var4.startsWith(class498.field6983.method3220(false, class538.field7500))) {
                var5 = 2;
                arg0 = arg0.substring(class498.field6983.method3220(false, class538.field7500).length());
            } else if (var4.startsWith(class501.field7023.method3220(false, class538.field7500))) {
                var5 = 3;
                arg0 = arg0.substring(class501.field7023.method3220(false, class538.field7500).length());
            } else if (var4.startsWith(class214.field3243.method3220(false, class538.field7500))) {
                var5 = 4;
                arg0 = arg0.substring(class214.field3243.method3220(false, class538.field7500).length());
            } else if (var4.startsWith(class493.field6920.method3220(false, class538.field7500))) {
                var5 = 5;
                arg0 = arg0.substring(class493.field6920.method3220(false, class538.field7500).length());
            }
        }
        field399++;
        class624.method3537(-115, class299.field4326);
        class127.field2088.method1710(0, 94);
        int var6 = class127.field2088.field3913;
        if (arg1 == 5021) {
            class127.field2088.method1710(1, 52);
        } else {
            class127.field2088.method1710(0, 67);
        }
        class127.field2088.method1710(var3, 112);
        class127.field2088.method1710(var5, 21);
        class177.method1209(0, class127.field2088, arg0);
        class127.field2088.method1688(class127.field2088.field3913 - var6, 95);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static final void method276(int arg0) {
        if (arg0 == -1 || !class543.method3045(arg0, -29039)) {
            return;
        }
        class549[] var1 = class177.field2593[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class549 var3 = var1[var2];
            if (var3.field7654 != null) {
                class526 var4 = new class526();
                var4.field7315 = var3;
                var4.field7314 = var3.field7654;
                method279(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfp;)V")
    public static final void method277(class526 arg0) {
        method279(arg0, 200000);
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    private static final void method278(int arg0) {
        class549 var1 = class495.method2822((byte) -102, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class549[] var3 = class44.field610[var2];
        if (var3 == null) {
            class549[] var4 = class177.field2593[var2];
            int var5 = var4.length;
            var3 = class44.field610[var2] = new class549[var5];
            class164.method1148(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class164.method1148(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lfp;I)V")
    private static final void method279(class526 arg0, int arg1) {
        Object[] var2 = arg0.field7314;
        int var3 = (Integer) var2[0];
        class240 var4 = class214.method1453(-8091, var3);
        if (var4 == null) {
            return;
        }
        field412 = new int[var4.field3496];
        int var5 = 0;
        field414 = new String[var4.field3484];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field7323;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field7326;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field7315 == null ? -1 : arg0.field7315.field7734;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field7318;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field7315 == null ? -1 : arg0.field7315.field7761;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field7320 == null ? -1 : arg0.field7320.field7734;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field7320 == null ? -1 : arg0.field7320.field7761;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field7310;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field7316;
                }
                field412[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field7312;
                }
                field414[var6++] = var9;
            }
        }
        field419 = arg0.field7319;
        method272(var4, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)Ljava/lang/String;")
    private static final String method280(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field393.setTime(new Date(var1));
        int var3 = field393.get(5);
        int var4 = field393.get(2);
        int var5 = field393.get(1);
        return var3 + "-" + field416[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "()V")
    public static void method281() {
        field412 = null;
        field414 = null;
        field402 = null;
        field401 = null;
        field415 = null;
        field410 = null;
        field405 = null;
        field398 = null;
        field394 = null;
        field392 = null;
        field393 = null;
        field416 = null;
        field418 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(IZ)V")
    private static final void method282(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field409 -= 3;
                int var2 = field415[field409];
                int var3 = field415[field409 + 1];
                int var4 = field415[field409 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class549 var5 = class495.method2822((byte) -115, var2);
                if (var5.field7684 == null) {
                    var5.field7684 = new class549[var4 + 1];
                }
                if (var5.field7684.length <= var4) {
                    class549[] var6 = new class549[var4 + 1];
                    for (int var7 = 0; var7 < var5.field7684.length; var7++) {
                        var6[var7] = var5.field7684[var7];
                    }
                    var5.field7684 = var6;
                }
                if (var4 > 0 && var5.field7684[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class549 var8 = new class549();
                var8.field7749 = var3;
                var8.field7637 = var8.field7734 = var5.field7734;
                var8.field7761 = var4;
                var5.field7684[var4] = var8;
                if (arg1) {
                    field394 = var8;
                } else {
                    field398 = var8;
                }
                class412.method2497(var5, 124);
                return;
            }
            if (arg0 == 101) {
                class549 var9 = arg1 ? field394 : field398;
                if (var9.field7761 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class549 var10 = class495.method2822((byte) -126, var9.field7734);
                var10.field7684[var9.field7761] = null;
                class412.method2497(var10, 99);
                return;
            }
            if (arg0 == 102) {
                class549 var11 = class495.method2822((byte) -120, field415[--field409]);
                var11.field7684 = null;
                class412.method2497(var11, 118);
                return;
            }
            if (arg0 == 200) {
                field409 -= 2;
                int var12 = field415[field409];
                int var13 = field415[field409 + 1];
                class549 var14 = class547.method3061(4096, var13, var12);
                if (var14 != null && var13 != -1) {
                    field415[field409++] = 1;
                    if (arg1) {
                        field394 = var14;
                        return;
                    }
                    field398 = var14;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field415[--field409];
                class549 var16 = class495.method2822((byte) -114, var15);
                if (var16 != null) {
                    field415[field409++] = 1;
                    if (arg1) {
                        field394 = var16;
                        return;
                    }
                    field398 = var16;
                    return;
                }
                field415[field409++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field415[--field409];
                method284(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field415[--field409];
                method278(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field409 -= 2;
                int var19 = field415[field409];
                int var20 = field415[field409 + 1];
                for (int var21 = 0; var21 < class90.field1622.length; var21++) {
                    if (class90.field1622[var21] == var19) {
                        class644.field9367.field5984.method2959(var20, var21, class468.field6744, (byte) -104);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class540.field7516.length; var22++) {
                    if (class540.field7516[var22] == var19) {
                        class644.field9367.field5984.method2959(var20, var22, class468.field6744, (byte) 107);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field409 -= 2;
                int var23 = field415[field409];
                int var24 = field415[field409 + 1];
                class644.field9367.field5984.method2966(var23, (byte) 127, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field415[--field409] != 0;
                class644.field9367.field5984.method2960(var25, true);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class549 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class495.method2822((byte) -120, field415[--field409]);
            } else {
                var26 = arg1 ? field394 : field398;
            }
            if (arg0 == 1000) {
                field409 -= 4;
                var26.field7765 = field415[field409];
                var26.field7670 = field415[field409 + 1];
                int var27 = field415[field409 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field415[field409 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field7628 = (byte) var27;
                var26.field7720 = (byte) var28;
                class412.method2497(var26, 95);
                class88.method795(var26, true);
                if (var26.field7761 == -1) {
                    class34.method303(var26.field7734, 17011);
                }
                return;
            }
            if (arg0 == 1001) {
                field409 -= 4;
                var26.field7683 = field415[field409];
                var26.field7690 = field415[field409 + 1];
                var26.field7669 = 0;
                var26.field7655 = 0;
                int var29 = field415[field409 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field415[field409 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field7764 = (byte) var29;
                var26.field7715 = (byte) var30;
                class412.method2497(var26, 101);
                class88.method795(var26, true);
                if (var26.field7749 == 0) {
                    class633.method3657(var26, false, (byte) 71);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field415[--field409] == 1;
                if (var26.field7677 != var31) {
                    var26.field7677 = var31;
                    class412.method2497(var26, 81);
                }
                if (var26.field7761 == -1) {
                    class495.method2820(var26.field7734, (byte) 21);
                }
                return;
            }
            if (arg0 == 1004) {
                field409 -= 2;
                var26.field7708 = field415[field409];
                var26.field7759 = field415[field409 + 1];
                class412.method2497(var26, 90);
                class88.method795(var26, true);
                if (var26.field7749 == 0) {
                    class633.method3657(var26, false, (byte) 115);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field7757 = field415[--field409] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class549 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class495.method2822((byte) -116, field415[--field409]);
            } else {
                var32 = arg1 ? field394 : field398;
            }
            if (arg0 == 1100) {
                field409 -= 2;
                var32.field7676 = field415[field409];
                if (var32.field7676 > var32.field7694 - var32.field7678) {
                    var32.field7676 = var32.field7694 - var32.field7678;
                }
                if (var32.field7676 < 0) {
                    var32.field7676 = 0;
                }
                var32.field7643 = field415[field409 + 1];
                if (var32.field7643 > var32.field7750 - var32.field7776) {
                    var32.field7643 = var32.field7750 - var32.field7776;
                }
                if (var32.field7643 < 0) {
                    var32.field7643 = 0;
                }
                class412.method2497(var32, 114);
                if (var32.field7761 == -1) {
                    class475.method2750(-25446, var32.field7734);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field7775 = field415[--field409];
                class412.method2497(var32, 107);
                if (var32.field7761 == -1) {
                    class95.method829(var32.field7734, -13125);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field7641 = field415[--field409] == 1;
                class412.method2497(var32, 85);
                return;
            }
            if (arg0 == 1103) {
                var32.field7704 = field415[--field409];
                class412.method2497(var32, 88);
                return;
            }
            if (arg0 == 1104) {
                var32.field7722 = field415[--field409];
                class412.method2497(var32, 121);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field415[--field409];
                if (var32.field7689 != var33) {
                    var32.field7689 = var33;
                    class412.method2497(var32, 126);
                }
                if (var32.field7761 == -1) {
                    class498.method2838(var32.field7734, -1);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field7785 = field415[--field409];
                class412.method2497(var32, 107);
                return;
            }
            if (arg0 == 1107) {
                var32.field7686 = field415[--field409] == 1;
                class412.method2497(var32, 100);
                return;
            }
            if (arg0 == 1108) {
                var32.field7763 = 1;
                var32.field7649 = field415[--field409];
                class412.method2497(var32, 92);
                if (var32.field7761 == -1) {
                    class552.method3102(4, var32.field7734);
                }
                return;
            }
            if (arg0 == 1109) {
                field409 -= 6;
                var32.field7792 = field415[field409];
                var32.field7758 = field415[field409 + 1];
                var32.field7781 = field415[field409 + 2];
                var32.field7660 = field415[field409 + 3];
                var32.field7744 = field415[field409 + 4];
                var32.field7716 = field415[field409 + 5];
                class412.method2497(var32, 83);
                if (var32.field7761 == -1) {
                    class271.method1760((byte) -78, var32.field7734);
                    class457.method2677(var32.field7734, -74);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field415[--field409];
                if (var32.field7705 != var34) {
                    var32.field7705 = var34;
                    var32.field7712 = 0;
                    var32.field7632 = 1;
                    var32.field7664 = 0;
                    class412.method2497(var32, 126);
                }
                if (var32.field7761 == -1) {
                    class491.method2810(false, var32.field7734);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field7656 = field415[--field409] == 1;
                class412.method2497(var32, 123);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field410[--field406];
                if (!var35.equals(var32.field7718)) {
                    var32.field7718 = var35;
                    class412.method2497(var32, 104);
                }
                if (var32.field7761 == -1) {
                    class408.method2478(3, var32.field7734);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field7727 = field415[--field409];
                class412.method2497(var32, 84);
                if (var32.field7761 == -1) {
                    class419.method2518((byte) -96, var32.field7734);
                }
                return;
            }
            if (arg0 == 1114) {
                field409 -= 3;
                var32.field7644 = field415[field409];
                var32.field7681 = field415[field409 + 1];
                var32.field7650 = field415[field409 + 2];
                class412.method2497(var32, 116);
                return;
            }
            if (arg0 == 1115) {
                var32.field7698 = field415[--field409] == 1;
                class412.method2497(var32, 106);
                return;
            }
            if (arg0 == 1116) {
                var32.field7642 = field415[--field409];
                class412.method2497(var32, 111);
                return;
            }
            if (arg0 == 1117) {
                var32.field7699 = field415[--field409];
                class412.method2497(var32, 125);
                return;
            }
            if (arg0 == 1118) {
                var32.field7742 = field415[--field409] == 1;
                class412.method2497(var32, 126);
                return;
            }
            if (arg0 == 1119) {
                var32.field7731 = field415[--field409] == 1;
                class412.method2497(var32, 122);
                return;
            }
            if (arg0 == 1120) {
                field409 -= 2;
                var32.field7694 = field415[field409];
                var32.field7750 = field415[field409 + 1];
                class412.method2497(var32, 120);
                if (var32.field7749 == 0) {
                    class633.method3657(var32, false, (byte) 80);
                }
                return;
            }
            if (arg0 == 1121) {
                field409 -= 2;
                var32.field7719 = (short) field415[field409];
                var32.field7711 = (short) field415[field409 + 1];
                class412.method2497(var32, 85);
                return;
            }
            if (arg0 == 1122) {
                var32.field7773 = field415[--field409] == 1;
                class412.method2497(var32, 113);
                return;
            }
            if (arg0 == 1123) {
                var32.field7716 = field415[--field409];
                class412.method2497(var32, 98);
                if (var32.field7761 == -1) {
                    class271.method1760((byte) -78, var32.field7734);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field415[--field409];
                var32.field7680 = var36 == 1;
                class412.method2497(var32, 108);
                return;
            }
            if (arg0 == 1125) {
                field409 -= 2;
                var32.field7701 = field415[field409];
                var32.field7638 = field415[field409 + 1];
                class412.method2497(var32, 98);
                return;
            }
            if (arg0 == 1126) {
                var32.field7653 = field415[--field409];
                class412.method2497(var32, 115);
                return;
            }
            if (arg0 == 1127) {
                field409 -= 2;
                int var37 = field415[field409];
                int var38 = field415[field409 + 1];
                class188 var39 = class190.field2724.method1831(-59, var37);
                if (var39.field2710 != var38) {
                    var32.method3076((byte) -68, var37, var38);
                    return;
                }
                var32.method3080(var37, true);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field415[--field409];
                String var41 = field410[--field406];
                class188 var42 = class190.field2724.method1831(-97, var40);
                if (!var42.field2707.equals(var41)) {
                    var32.method3088(var41, 0, var40);
                    return;
                }
                var32.method3080(var40, true);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class549 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class495.method2822((byte) -109, field415[--field409]);
            } else {
                var43 = arg1 ? field394 : field398;
            }
            class412.method2497(var43, 126);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field409 -= 2;
                int var44 = field415[field409];
                int var45 = field415[field409 + 1];
                if (var43.field7761 == -1) {
                    class481.method2768((byte) 124, var43.field7734);
                    class271.method1760((byte) -78, var43.field7734);
                    class457.method2677(var43.field7734, -108);
                }
                if (var44 == -1) {
                    var43.field7763 = 1;
                    var43.field7649 = -1;
                    var43.field7703 = -1;
                    return;
                }
                var43.field7703 = var44;
                var43.field7740 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field7651 = true;
                } else {
                    var43.field7651 = false;
                }
                class381 var46 = class611.field8684.method1621((byte) -24, var44);
                var43.field7781 = var46.field5674;
                var43.field7660 = var46.field5628;
                var43.field7744 = var46.field5664;
                var43.field7792 = var46.field5604;
                var43.field7758 = var46.field5657;
                var43.field7716 = var46.field5641;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field7787 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field7787 = 1;
                } else {
                    var43.field7787 = 2;
                }
                if (var43.field7669 > 0) {
                    var43.field7716 = var43.field7716 * 32 / var43.field7669;
                    return;
                }
                if (var43.field7683 > 0) {
                    var43.field7716 = var43.field7716 * 32 / var43.field7683;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field7763 = 2;
                var43.field7649 = field415[--field409];
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field7763 = 3;
                var43.field7649 = -1;
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field7763 = 6;
                var43.field7649 = field415[--field409];
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field7763 = 5;
                var43.field7649 = field415[--field409];
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
            if (arg0 == 1206) {
                field409 -= 4;
                var43.field7771 = field415[field409];
                var43.field7668 = field415[field409 + 1];
                var43.field7695 = field415[field409 + 2];
                var43.field7700 = field415[field409 + 3];
                class412.method2497(var43, 116);
                return;
            }
            if (arg0 == 1207) {
                field409 -= 2;
                var43.field7766 = field415[field409];
                var43.field7630 = field415[field409 + 1];
                class412.method2497(var43, 112);
                return;
            }
            if (arg0 == 1210) {
                field409 -= 4;
                var43.field7649 = field415[field409];
                var43.field7696 = field415[field409 + 1];
                if (field415[field409 + 2] == 1) {
                    var43.field7763 = 9;
                } else {
                    var43.field7763 = 8;
                }
                if (field415[field409 + 3] == 1) {
                    var43.field7651 = true;
                } else {
                    var43.field7651 = false;
                }
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field7763 = 5;
                var43.field7649 = class323.field4670;
                var43.field7696 = 0;
                if (var43.field7761 == -1) {
                    class552.method3102(4, var43.field7734);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class549 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class495.method2822((byte) -107, field415[--field409]);
                } else {
                    var58 = arg1 ? field394 : field398;
                }
                String var59 = field410[--field406];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field415[--field409];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field415[--field409];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field410[--field406];
                    } else {
                        var62[var63] = Integer.valueOf(field415[--field409]);
                    }
                }
                int var64 = field415[--field409];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field7739 = var62;
                } else if (arg0 == 1401) {
                    var58.field7645 = var62;
                } else if (arg0 == 1402) {
                    var58.field7635 = var62;
                } else if (arg0 == 1403) {
                    var58.field7667 = var62;
                } else if (arg0 == 1404) {
                    var58.field7762 = var62;
                } else if (arg0 == 1405) {
                    var58.field7728 = var62;
                } else if (arg0 == 1406) {
                    var58.field7697 = var62;
                } else if (arg0 == 1407) {
                    var58.field7693 = var62;
                    var58.field7779 = var60;
                } else if (arg0 == 1408) {
                    var58.field7752 = var62;
                } else if (arg0 == 1409) {
                    var58.field7754 = var62;
                } else if (arg0 == 1410) {
                    var58.field7769 = var62;
                } else if (arg0 == 1411) {
                    var58.field7756 = var62;
                } else if (arg0 == 1412) {
                    var58.field7692 = var62;
                } else if (arg0 == 1414) {
                    var58.field7751 = var62;
                    var58.field7663 = var60;
                } else if (arg0 == 1415) {
                    var58.field7743 = var62;
                    var58.field7679 = var60;
                } else if (arg0 == 1416) {
                    var58.field7626 = var62;
                } else if (arg0 == 1417) {
                    var58.field7774 = var62;
                } else if (arg0 == 1418) {
                    var58.field7782 = var62;
                } else if (arg0 == 1419) {
                    var58.field7666 = var62;
                } else if (arg0 == 1420) {
                    var58.field7675 = var62;
                } else if (arg0 == 1421) {
                    var58.field7737 = var62;
                } else if (arg0 == 1422) {
                    var58.field7725 = var62;
                } else if (arg0 == 1423) {
                    var58.field7702 = var62;
                } else if (arg0 == 1424) {
                    var58.field7713 = var62;
                } else if (arg0 == 1425) {
                    var58.field7661 = var62;
                } else if (arg0 == 1426) {
                    var58.field7636 = var62;
                } else if (arg0 == 1427) {
                    var58.field7623 = var62;
                } else if (arg0 == 1428) {
                    var58.field7714 = var62;
                    var58.field7665 = var60;
                } else if (arg0 == 1429) {
                    var58.field7767 = var62;
                    var58.field7629 = var60;
                } else if (arg0 == 1430) {
                    var58.field7735 = var62;
                }
                var58.field7780 = true;
                return;
            }
            if (arg0 < 1600) {
                class549 var65 = arg1 ? field394 : field398;
                if (arg0 == 1500) {
                    field415[field409++] = var65.field7631;
                    return;
                }
                if (arg0 == 1501) {
                    field415[field409++] = var65.field7687;
                    return;
                }
                if (arg0 == 1502) {
                    field415[field409++] = var65.field7678;
                    return;
                }
                if (arg0 == 1503) {
                    field415[field409++] = var65.field7776;
                    return;
                }
                if (arg0 == 1504) {
                    field415[field409++] = var65.field7677 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field415[field409++] = var65.field7637;
                    return;
                }
                if (arg0 == 1506) {
                    class549 var66 = class106.method907((byte) 64, var65);
                    field415[field409++] = var66 == null ? -1 : var66.field7734;
                    return;
                }
            } else if (arg0 < 1700) {
                class549 var67 = arg1 ? field394 : field398;
                if (arg0 == 1600) {
                    field415[field409++] = var67.field7676;
                    return;
                }
                if (arg0 == 1601) {
                    field415[field409++] = var67.field7643;
                    return;
                }
                if (arg0 == 1602) {
                    field410[field406++] = var67.field7718;
                    return;
                }
                if (arg0 == 1603) {
                    field415[field409++] = var67.field7694;
                    return;
                }
                if (arg0 == 1604) {
                    field415[field409++] = var67.field7750;
                    return;
                }
                if (arg0 == 1605) {
                    field415[field409++] = var67.field7716;
                    return;
                }
                if (arg0 == 1606) {
                    field415[field409++] = var67.field7781;
                    return;
                }
                if (arg0 == 1607) {
                    field415[field409++] = var67.field7744;
                    return;
                }
                if (arg0 == 1608) {
                    field415[field409++] = var67.field7660;
                    return;
                }
                if (arg0 == 1609) {
                    field415[field409++] = var67.field7704;
                    return;
                }
                if (arg0 == 1610) {
                    field415[field409++] = var67.field7792;
                    return;
                }
                if (arg0 == 1611) {
                    field415[field409++] = var67.field7758;
                    return;
                }
                if (arg0 == 1612) {
                    field415[field409++] = var67.field7689;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field415[--field409];
                    class188 var69 = class190.field2724.method1831(-100, var68);
                    if (var69.method1254(-10634)) {
                        field410[field406++] = var67.method3081(var69.field2707, (byte) 110, var68);
                        return;
                    }
                    field415[field409++] = var67.method3079((byte) 84, var68, var69.field2710);
                    return;
                }
            } else if (arg0 < 1800) {
                class549 var70 = arg1 ? field394 : field398;
                if (arg0 == 1700) {
                    field415[field409++] = var70.field7703;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field7703 != -1) {
                        field415[field409++] = var70.field7740;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field415[field409++] = var70.field7761;
                    return;
                }
            } else if (arg0 < 1900) {
                class549 var71 = arg1 ? field394 : field398;
                if (arg0 == 1800) {
                    field415[field409++] = client.method3530(var71).method3051((byte) -70);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field415[--field409];
                    int var334 = var72 - 1;
                    if (var71.field7685 != null && var334 < var71.field7685.length && var71.field7685[var334] != null) {
                        field410[field406++] = var71.field7685[var334];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field7652 == null) {
                        field410[field406++] = "";
                        return;
                    }
                    field410[field406++] = var71.field7652;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class549 var332;
                if (arg0 >= 2000) {
                    var332 = class495.method2822((byte) -104, field415[--field409]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field394 : field398;
                }
                if (field419 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field7623 == null) {
                        return;
                    }
                    class526 var333 = new class526();
                    var333.field7315 = var332;
                    var333.field7314 = var332.field7623;
                    var333.field7319 = field419 + 1;
                    class307.field4417.method414(var333, (byte) 21);
                    return;
                }
            } else if (arg0 < 2600) {
                class549 var73 = class495.method2822((byte) -125, field415[--field409]);
                if (arg0 == 2500) {
                    field415[field409++] = var73.field7631;
                    return;
                }
                if (arg0 == 2501) {
                    field415[field409++] = var73.field7687;
                    return;
                }
                if (arg0 == 2502) {
                    field415[field409++] = var73.field7678;
                    return;
                }
                if (arg0 == 2503) {
                    field415[field409++] = var73.field7776;
                    return;
                }
                if (arg0 == 2504) {
                    field415[field409++] = var73.field7677 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field415[field409++] = var73.field7637;
                    return;
                }
                if (arg0 == 1506) {
                    class549 var74 = class106.method907((byte) 113, var73);
                    field415[field409++] = var74 == null ? -1 : var74.field7734;
                    return;
                }
            } else if (arg0 < 2700) {
                class549 var75 = class495.method2822((byte) -112, field415[--field409]);
                if (arg0 == 2600) {
                    field415[field409++] = var75.field7676;
                    return;
                }
                if (arg0 == 2601) {
                    field415[field409++] = var75.field7643;
                    return;
                }
                if (arg0 == 2602) {
                    field410[field406++] = var75.field7718;
                    return;
                }
                if (arg0 == 2603) {
                    field415[field409++] = var75.field7694;
                    return;
                }
                if (arg0 == 2604) {
                    field415[field409++] = var75.field7750;
                    return;
                }
                if (arg0 == 2605) {
                    field415[field409++] = var75.field7716;
                    return;
                }
                if (arg0 == 2606) {
                    field415[field409++] = var75.field7781;
                    return;
                }
                if (arg0 == 2607) {
                    field415[field409++] = var75.field7744;
                    return;
                }
                if (arg0 == 2608) {
                    field415[field409++] = var75.field7660;
                    return;
                }
                if (arg0 == 2609) {
                    field415[field409++] = var75.field7704;
                    return;
                }
                if (arg0 == 2610) {
                    field415[field409++] = var75.field7792;
                    return;
                }
                if (arg0 == 2611) {
                    field415[field409++] = var75.field7758;
                    return;
                }
                if (arg0 == 2612) {
                    field415[field409++] = var75.field7689;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class549 var76 = class495.method2822((byte) -109, field415[--field409]);
                    field415[field409++] = var76.field7703;
                    return;
                }
                if (arg0 == 2701) {
                    class549 var77 = class495.method2822((byte) -109, field415[--field409]);
                    if (var77.field7703 != -1) {
                        field415[field409++] = var77.field7740;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field415[--field409];
                    class553 var79 = (class553) class639.field9274.method740(0, (long) var78);
                    if (var79 != null) {
                        field415[field409++] = 1;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class549 var80 = class495.method2822((byte) -104, field415[--field409]);
                    if (var80.field7684 == null) {
                        field415[field409++] = 0;
                        return;
                    }
                    int var81 = var80.field7684.length;
                    for (int var82 = 0; var82 < var80.field7684.length; var82++) {
                        if (var80.field7684[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field415[field409++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field409 -= 2;
                    int var83 = field415[field409];
                    int var84 = field415[field409 + 1];
                    class553 var85 = (class553) class639.field9274.method740(0, (long) var83);
                    if (var85 != null && var85.field7827 == var84) {
                        field415[field409++] = 1;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class549 var86 = class495.method2822((byte) -100, field415[--field409]);
                if (arg0 == 2800) {
                    field415[field409++] = client.method3530(var86).method3051((byte) -70);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field415[--field409];
                    int var335 = var87 - 1;
                    if (var86.field7685 != null && var335 < var86.field7685.length && var86.field7685[var335] != null) {
                        field410[field406++] = var86.field7685[var335];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field7652 == null) {
                        field410[field406++] = "";
                        return;
                    }
                    field410[field406++] = var86.field7652;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field410[--field406];
                    class83.method758((byte) 125, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field409 -= 2;
                    class92.method813(class644.field9367, field415[field409], field415[field409 + 1], -115);
                    return;
                }
                if (arg0 == 3103) {
                    class533.method3013((byte) 109, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field410[--field406];
                    int var90 = 0;
                    if (class331.method2052(var89, false)) {
                        var90 = class302.method1889(var89, false);
                    }
                    field404++;
                    class624.method3537(-119, class265.field3866);
                    class127.field2088.method1702(var90, false);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field410[--field406];
                    field395++;
                    class624.method3537(-103, class600.field8517);
                    class127.field2088.method1710(var91.length() + 1, 52);
                    class127.field2088.method1726((byte) -52, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field410[--field406];
                    field407++;
                    class624.method3537(-110, class229.field3396);
                    class127.field2088.method1710(var92.length() + 1, 91);
                    class127.field2088.method1726((byte) -52, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field415[--field409];
                    String var94 = field410[--field406];
                    class376.method2286(true, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field409 -= 3;
                    int var95 = field415[field409];
                    int var96 = field415[field409 + 1];
                    int var97 = field415[field409 + 2];
                    class549 var98 = class495.method2822((byte) -104, var97);
                    class606.method3455(var98, var96, 3553, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field409 -= 2;
                    int var99 = field415[field409];
                    int var100 = field415[field409 + 1];
                    class549 var101 = arg1 ? field394 : field398;
                    class606.method3455(var101, var100, 3553, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field415[--field409];
                    field400++;
                    class624.method3537(-101, class420.field6177);
                    class127.field2088.method1699(true, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field409 -= 2;
                    int var103 = field415[field409];
                    int var104 = field415[field409 + 1];
                    class553 var105 = (class553) class639.field9274.method740(0, (long) var103);
                    if (var105 != null) {
                        class61.method489(-27920, var105.field7827 != var104, true, var105);
                    }
                    class538.method3028(3, var103, var104, true, 3791);
                    return;
                }
                if (arg0 == 3112) {
                    field409--;
                    int var106 = field415[field409];
                    class553 var107 = (class553) class639.field9274.method740(0, (long) var106);
                    if (var107 != null && var107.field7831 == 3) {
                        class61.method489(-27920, true, true, var107);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class248.method1573((byte) 21, field410[--field406]);
                    return;
                }
                if (arg0 == 3114) {
                    field409 -= 2;
                    int var108 = field415[field409];
                    int var109 = field415[field409 + 1];
                    String var110 = field410[--field406];
                    class175.method1205("", var109, var108, var110, -1, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field409 -= 3;
                    class308.method1915(true, field415[field409], 255, field415[field409 + 1], field415[field409 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class183.method1228(-8, 255, 50, field415[--field409]);
                    return;
                }
                if (arg0 == 3202) {
                    field409 -= 2;
                    class439.method2596(field415[field409], field415[field409 + 1], false, 255);
                    return;
                }
                if (arg0 == 3203) {
                    field409 -= 4;
                    class308.method1915(true, field415[field409], field415[field409 + 3], field415[field409 + 1], field415[field409 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field409 -= 3;
                    class183.method1228(93, field415[field409 + 1], field415[field409 + 2], field415[field409]);
                    return;
                }
                if (arg0 == 3205) {
                    field409 -= 3;
                    class439.method2596(field415[field409], field415[field409 + 1], false, field415[field409 + 2]);
                    return;
                }
                if (arg0 == 3206) {
                    field409 -= 4;
                    class245.method1554(field415[field409], 0, field415[field409 + 2], field415[field409 + 3], field415[field409 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field415[field409++] = class310.field4553;
                    return;
                }
                if (arg0 == 3301) {
                    field409 -= 2;
                    int var111 = field415[field409];
                    int var112 = field415[field409 + 1];
                    field415[field409++] = class262.method1669(var112, false, 19, var111);
                    return;
                }
                if (arg0 == 3302) {
                    field409 -= 2;
                    int var113 = field415[field409];
                    int var114 = field415[field409 + 1];
                    field415[field409++] = class485.method2787(false, var113, 0, var114);
                    return;
                }
                if (arg0 == 3303) {
                    field409 -= 2;
                    int var115 = field415[field409];
                    int var116 = field415[field409 + 1];
                    field415[field409++] = class596.method3402(var116, var115, 24625, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field415[--field409];
                    field415[field409++] = class12.field130.method2784(var117, 121).field3986;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field415[--field409];
                    field415[field409++] = class208.field2934[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field415[--field409];
                    field415[field409++] = class146.field2239[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field415[--field409];
                    field415[field409++] = class355.field5072[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class644.field9367.field5116;
                    int var122 = (class644.field9367.field5108 >> 7) + class382.field5687;
                    int var123 = (class644.field9367.field5109 >> 7) + class597.field8500;
                    field415[field409++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field415[--field409];
                    field415[field409++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field415[--field409];
                    field415[field409++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field415[--field409];
                    field415[field409++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field415[field409++] = class56.field800 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field409 -= 2;
                    int var127 = field415[field409];
                    int var128 = field415[field409 + 1];
                    field415[field409++] = class262.method1669(var128, true, -112, var127);
                    return;
                }
                if (arg0 == 3314) {
                    field409 -= 2;
                    int var129 = field415[field409];
                    int var130 = field415[field409 + 1];
                    field415[field409++] = class485.method2787(true, var129, 0, var130);
                    return;
                }
                if (arg0 == 3315) {
                    field409 -= 2;
                    int var131 = field415[field409];
                    int var132 = field415[field409 + 1];
                    field415[field409++] = class596.method3402(var132, var131, 24625, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class602.field8571 >= 2) {
                        field415[field409++] = class602.field8571;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field415[field409++] = class189.field2717;
                    return;
                }
                if (arg0 == 3318) {
                    field415[field409++] = class352.field5017.field3409;
                    return;
                }
                if (arg0 == 3321) {
                    field415[field409++] = class304.field4385;
                    return;
                }
                if (arg0 == 3322) {
                    field415[field409++] = class280.field4093;
                    return;
                }
                if (arg0 == 3323) {
                    if (class336.field4816 >= 5 && class336.field4816 <= 9) {
                        field415[field409++] = 1;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class336.field4816 >= 5 && class336.field4816 <= 9) {
                        field415[field409++] = class336.field4816;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field415[field409++] = class153.field2297 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field415[field409++] = class644.field9367.field5981;
                    return;
                }
                if (arg0 == 3327) {
                    field415[field409++] = class644.field9367.field5984.field7290 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field415[field409++] = class361.field5140 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field415[--field409];
                    field415[field409++] = class211.method1360((byte) -62, var133, false);
                    return;
                }
                if (arg0 == 3331) {
                    field409 -= 2;
                    int var134 = field415[field409];
                    int var135 = field415[field409 + 1];
                    field415[field409++] = class481.method2767(false, (byte) -112, false, var135, var134);
                    return;
                }
                if (arg0 == 3332) {
                    field409 -= 2;
                    int var136 = field415[field409];
                    int var137 = field415[field409 + 1];
                    field415[field409++] = class481.method2767(true, (byte) 47, false, var137, var136);
                    return;
                }
                if (arg0 == 3333) {
                    field415[field409++] = class343.field4929;
                    return;
                }
                if (arg0 == 3335) {
                    field415[field409++] = class538.field7500;
                    return;
                }
                if (arg0 == 3336) {
                    field409 -= 4;
                    int var138 = field415[field409];
                    int var139 = field415[field409 + 1];
                    int var140 = field415[field409 + 2];
                    int var141 = field415[field409 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field415[field409++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field415[field409++] = class56.field803;
                    return;
                }
                if (arg0 == 3338) {
                    field415[field409++] = class145.method1064(-20);
                    return;
                }
                if (arg0 == 3339) {
                    field415[field409++] = class218.field3290 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field415[field409++] = class497.field6973 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field415[field409++] = class92.field1634 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field415[field409++] = class619.field8735.method1614((byte) -46);
                    return;
                }
                if (arg0 == 3343) {
                    field415[field409++] = class619.field8735.method1607((byte) -78);
                    return;
                }
                if (arg0 == 3344) {
                    field410[field406++] = class604.method3446(true);
                    return;
                }
                if (arg0 == 3345) {
                    field410[field406++] = class265.method1680(-1);
                    return;
                }
                if (arg0 == 3346) {
                    field415[field409++] = class144.method1060((byte) -21);
                    return;
                }
                if (arg0 == 3347) {
                    field415[field409++] = class109.field1825;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field409 -= 2;
                    int var145 = field415[field409];
                    int var146 = field415[field409 + 1];
                    class44 var147 = class386.field5742.method1019(var145, true);
                    field410[field406++] = var147.method385((byte) 109, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field409 -= 4;
                    int var148 = field415[field409];
                    int var149 = field415[field409 + 1];
                    int var150 = field415[field409 + 2];
                    int var151 = field415[field409 + 3];
                    class44 var152 = class386.field5742.method1019(var150, true);
                    if (var152.field615 == var148 && var152.field609 == var149) {
                        if (var149 == 115) {
                            field410[field406++] = var152.method385((byte) 82, var151);
                            return;
                        }
                        field415[field409++] = var152.method383(var151, (byte) 79);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field409 -= 3;
                    int var153 = field415[field409];
                    int var154 = field415[field409 + 1];
                    int var155 = field415[field409 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class44 var156 = class386.field5742.method1019(var154, true);
                    if (var156.field609 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field415[field409++] = var156.method392(true, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field415[--field409];
                    String var158 = field410[--field406];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class44 var159 = class386.field5742.method1019(var157, true);
                    if (var159.field609 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field415[field409++] = var159.method388((byte) -100, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field415[--field409];
                    class44 var161 = class386.field5742.method1019(var160, true);
                    field415[field409++] = var161.field606.method742(108);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class492.field6912 == 0) {
                        field415[field409++] = -2;
                        return;
                    }
                    if (class492.field6912 == 1) {
                        field415[field409++] = -1;
                        return;
                    }
                    field415[field409++] = class404.field6020;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field415[--field409];
                    if (class492.field6912 == 2 && var162 < class404.field6020) {
                        field410[field406++] = class534.field7454[var162];
                        if (class301.field4344[var162] != null) {
                            field410[field406++] = class301.field4344[var162];
                            return;
                        }
                        field410[field406++] = "";
                        return;
                    }
                    field410[field406++] = "";
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field415[--field409];
                    if (class492.field6912 == 2 && var163 < class404.field6020) {
                        field415[field409++] = class41.field572[var163];
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field415[--field409];
                    if (class492.field6912 == 2 && var164 < class404.field6020) {
                        field415[field409++] = class233.field3424[var164];
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field410[--field406];
                    int var166 = field415[--field409];
                    class335.method2060(var165, 124, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field410[--field406];
                    class280.method1799(false, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field410[--field406];
                    class258.method1630(1, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field410[--field406];
                    class458.method2685(false, (byte) -65, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field410[--field406];
                    class175.method1203(126, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field410[--field406];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field415[field409++] = class220.method1474((byte) -119, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field415[--field409];
                    if (class492.field6912 == 2 && var172 < class404.field6020) {
                        field410[field406++] = class289.field4189[var172];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class102.field1740 != null) {
                        field410[field406++] = class251.method1586((byte) -128, class102.field1740);
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class102.field1740 != null) {
                        field415[field409++] = class619.field8734;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field415[--field409];
                    if (class102.field1740 != null && var173 < class619.field8734) {
                        field410[field406++] = class10.field115[var173].field1385;
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field415[--field409];
                    if (class102.field1740 != null && var174 < class619.field8734) {
                        field415[field409++] = class10.field115[var174].field1386;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field415[--field409];
                    if (class102.field1740 != null && var175 < class619.field8734) {
                        field415[field409++] = class10.field115[var175].field1387;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field415[field409++] = class133.field2151;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field410[--field406];
                    class531.method2995(0, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field415[field409++] = class117.field1900;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field410[--field406];
                    class370.method2250(var177, (byte) -119);
                    return;
                }
                if (arg0 == 3620) {
                    class469.method2721((byte) 73);
                    return;
                }
                if (arg0 == 3621) {
                    if (class492.field6912 == 0) {
                        field415[field409++] = -1;
                        return;
                    }
                    field415[field409++] = class511.field7081;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field415[--field409];
                    if (class492.field6912 != 0 && var178 < class511.field7081) {
                        field410[field406++] = class290.field4198[var178];
                        if (class293.field4223[var178] != null) {
                            field410[field406++] = class293.field4223[var178];
                            return;
                        }
                        field410[field406++] = "";
                        return;
                    }
                    field410[field406++] = "";
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field410[--field406];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field415[field409++] = class331.method2050(true, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field415[--field409];
                    if (class10.field115 != null && var180 < class619.field8734 && class10.field115[var180].field1382.equalsIgnoreCase(class644.field9367.field5958)) {
                        field415[field409++] = 1;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class295.field4258 != null) {
                        field410[field406++] = class295.field4258;
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field415[--field409];
                    if (class102.field1740 != null && var181 < class619.field8734) {
                        field410[field406++] = class10.field115[var181].field1384;
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field415[--field409];
                    if (class492.field6912 == 2 && var182 >= 0 && var182 < class404.field6020) {
                        field415[field409++] = class289.field4193[var182] ? 1 : 0;
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field410[--field406];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field415[field409++] = class70.method681(false, var183);
                    return;
                }
                if (arg0 == 3629) {
                    field415[field409++] = class98.field1707;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field410[--field406];
                    class458.method2685(true, (byte) -65, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field415[--field409];
                    field415[field409++] = class536.field7484[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field415[--field409];
                    if (class102.field1740 != null && var186 < class619.field8734) {
                        field410[field406++] = class10.field115[var186].field1382;
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field415[--field409];
                    if (class492.field6912 != 0 && var187 < class511.field7081) {
                        field410[field406++] = class97.field1699[var187];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field415[--field409];
                    field415[field409++] = class175.field2574[var188].method2471(-4221);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field415[--field409];
                    field415[field409++] = class175.field2574[var189].field6043;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field415[--field409];
                    field415[field409++] = class175.field2574[var190].field6036;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field415[--field409];
                    field415[field409++] = class175.field2574[var191].field6047;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field415[--field409];
                    field415[field409++] = class175.field2574[var192].field6037;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field415[--field409];
                    field415[field409++] = class175.field2574[var193].field6046;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field415[--field409];
                    int var195 = class175.field2574[var194].method2469((byte) -88);
                    field415[field409++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field415[--field409];
                    int var197 = class175.field2574[var196].method2469((byte) -88);
                    field415[field409++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field415[--field409];
                    int var199 = class175.field2574[var198].method2469((byte) -88);
                    field415[field409++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field415[--field409];
                    int var201 = class175.field2574[var200].method2469((byte) -88);
                    field415[field409++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field409 -= 2;
                    int var202 = field415[field409];
                    int var203 = field415[field409 + 1];
                    field415[field409++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field409 -= 2;
                    int var204 = field415[field409];
                    int var205 = field415[field409 + 1];
                    field415[field409++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field409 -= 2;
                    int var206 = field415[field409];
                    int var207 = field415[field409 + 1];
                    field415[field409++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field409 -= 2;
                    int var208 = field415[field409];
                    int var209 = field415[field409 + 1];
                    field415[field409++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field415[--field409];
                    field415[field409++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field415[--field409];
                    field415[field409++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field409 -= 5;
                    int var212 = field415[field409];
                    int var213 = field415[field409 + 1];
                    int var214 = field415[field409 + 2];
                    int var215 = field415[field409 + 3];
                    int var216 = field415[field409 + 4];
                    field415[field409++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field409 -= 2;
                    long var217 = (long) field415[field409];
                    long var219 = (long) field415[field409 + 1];
                    field415[field409++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field409 -= 2;
                    int var221 = field415[field409];
                    int var222 = field415[field409 + 1];
                    field415[field409++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field409 -= 2;
                    int var223 = field415[field409];
                    int var224 = field415[field409 + 1];
                    field415[field409++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field409 -= 2;
                    int var225 = field415[field409];
                    int var226 = field415[field409 + 1];
                    field415[field409++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field409 -= 2;
                    int var227 = field415[field409];
                    int var228 = field415[field409 + 1];
                    field415[field409++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field409 -= 2;
                    int var229 = field415[field409];
                    int var230 = field415[field409 + 1];
                    if (var229 == 0) {
                        field415[field409++] = 0;
                        return;
                    }
                    field415[field409++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field409 -= 2;
                    int var231 = field415[field409];
                    int var232 = field415[field409 + 1];
                    if (var231 == 0) {
                        field415[field409++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field415[field409++] = Integer.MAX_VALUE;
                        return;
                    }
                    field415[field409++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field409 -= 2;
                    int var233 = field415[field409];
                    int var234 = field415[field409 + 1];
                    field415[field409++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field409 -= 2;
                    int var235 = field415[field409];
                    int var236 = field415[field409 + 1];
                    field415[field409++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field409 -= 2;
                    int var237 = field415[field409];
                    int var238 = field415[field409 + 1];
                    field415[field409++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field409 -= 2;
                    int var239 = field415[field409];
                    int var240 = field415[field409 + 1];
                    field415[field409++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field409 -= 3;
                    long var241 = (long) field415[field409];
                    long var243 = (long) field415[field409 + 1];
                    long var245 = (long) field415[field409 + 2];
                    field415[field409++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field410[--field406];
                    int var248 = field415[--field409];
                    field410[field406++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field406 -= 2;
                    String var249 = field410[field406];
                    String var250 = field410[field406 + 1];
                    field410[field406++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field410[--field406];
                    int var252 = field415[--field409];
                    field410[field406++] = var251 + class129.method1008(var252, false, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field410[--field406];
                    field410[field406++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field410[field406++] = method280(field415[--field409]);
                    return;
                }
                if (arg0 == 4105) {
                    field406 -= 2;
                    String var254 = field410[field406];
                    String var255 = field410[field406 + 1];
                    if (class644.field9367.field5984 != null && class644.field9367.field5984.field7290) {
                        field410[field406++] = var255;
                        return;
                    }
                    field410[field406++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field415[--field409];
                    field410[field406++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field406 -= 2;
                    field415[field409++] = class268.method1743(field410[field406 + 1], 0, class538.field7500, field410[field406]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field410[--field406];
                    field409 -= 2;
                    int var258 = field415[field409];
                    int var259 = field415[field409 + 1];
                    class633 var260 = class446.method2633(var259, (byte) -46, class353.field5059, 0);
                    field415[field409++] = var260.method3648(var257, -65, class25.field351, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field410[--field406];
                    field409 -= 2;
                    int var262 = field415[field409];
                    int var263 = field415[field409 + 1];
                    class633 var264 = class446.method2633(var263, (byte) 108, class353.field5059, 0);
                    field415[field409++] = var264.method3650(class25.field351, var261, 3, var262);
                    return;
                }
                if (arg0 == 4110) {
                    field406 -= 2;
                    String var265 = field410[field406];
                    String var266 = field410[field406 + 1];
                    if (field415[--field409] == 1) {
                        field410[field406++] = var265;
                        return;
                    }
                    field410[field406++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field410[--field406];
                    field410[field406++] = class601.method3415(true, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field410[--field406];
                    int var269 = field415[--field409];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field410[field406++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field415[--field409];
                    field415[field409++] = class594.method3395(-39, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field415[--field409];
                    field415[field409++] = class173.method1190((char) var271, 28202) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field415[--field409];
                    field415[field409++] = class401.method2454(-88, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field415[--field409];
                    field415[field409++] = class380.method2306(94, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field410[--field406];
                    if (var274 != null) {
                        field415[field409++] = var274.length();
                        return;
                    }
                    field415[field409++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field410[--field406];
                    field409 -= 2;
                    int var276 = field415[field409];
                    int var277 = field415[field409 + 1];
                    field410[field406++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field410[--field406];
                    StringBuffer var279 = new StringBuffer(var278.length());
                    boolean var280 = false;
                    for (int var281 = 0; var281 < var278.length(); var281++) {
                        char var282 = var278.charAt(var281);
                        if (var282 == '<') {
                            var280 = true;
                        } else if (var282 == '>') {
                            var280 = false;
                        } else if (!var280) {
                            var279.append(var282);
                        }
                    }
                    field410[field406++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field410[--field406];
                    field409 -= 2;
                    int var284 = field415[field409];
                    int var285 = field415[field409 + 1];
                    field415[field409++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field406 -= 2;
                    String var286 = field410[field406];
                    String var287 = field410[field406 + 1];
                    int var288 = field415[--field409];
                    field415[field409++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field415[--field409];
                    field415[field409++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field415[--field409];
                    field415[field409++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field415[--field409] != 0;
                    int var292 = field415[--field409];
                    field410[field406++] = class261.method1657(var291, (long) var292, 0, 10, class538.field7500);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field410[--field406];
                    int var294 = field415[--field409];
                    class633 var295 = class446.method2633(var294, (byte) 113, class353.field5059, 0);
                    field415[field409++] = var295.method3654(class25.field351, var293, 126);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field415[--field409];
                    field410[field406++] = class611.field8684.method1621((byte) -82, var296).field5658;
                    return;
                }
                if (arg0 == 4201) {
                    field409 -= 2;
                    int var297 = field415[field409];
                    int var298 = field415[field409 + 1];
                    class381 var299 = class611.field8684.method1621((byte) 58, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field5599[var298 - 1] != null) {
                        field410[field406++] = var299.field5599[var298 - 1];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field409 -= 2;
                    int var300 = field415[field409];
                    int var301 = field415[field409 + 1];
                    class381 var302 = class611.field8684.method1621((byte) -70, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field5606[var301 - 1] != null) {
                        field410[field406++] = var302.field5606[var301 - 1];
                        return;
                    }
                    field410[field406++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field415[--field409];
                    field415[field409++] = class611.field8684.method1621((byte) -82, var303).field5644;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field415[--field409];
                    field415[field409++] = class611.field8684.method1621((byte) -84, var304).field5662 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field415[--field409];
                    class381 var306 = class611.field8684.method1621((byte) -87, var305);
                    if (var306.field5596 == -1 && var306.field5632 >= 0) {
                        field415[field409++] = var306.field5632;
                        return;
                    }
                    field415[field409++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field415[--field409];
                    class381 var308 = class611.field8684.method1621((byte) 60, var307);
                    if (var308.field5596 >= 0 && var308.field5632 >= 0) {
                        field415[field409++] = var308.field5632;
                        return;
                    }
                    field415[field409++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field415[--field409];
                    field415[field409++] = class611.field8684.method1621((byte) 88, var309).field5646 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field409 -= 2;
                    int var310 = field415[field409];
                    int var311 = field415[field409 + 1];
                    class188 var312 = class190.field2724.method1831(-88, var311);
                    if (var312.method1254(-10634)) {
                        field410[field406++] = class611.field8684.method1621((byte) -128, var310).method2314(-96, var311, var312.field2707);
                        return;
                    }
                    field415[field409++] = class611.field8684.method1621((byte) 61, var310).method2310(var311, var312.field2710, 13);
                    return;
                }
                if (arg0 == 4209) {
                    field409 -= 2;
                    int var313 = field415[field409];
                    int var314 = field415[field409 + 1] - 1;
                    class381 var315 = class611.field8684.method1621((byte) -77, var313);
                    if (var315.field5618 == var314) {
                        field415[field409++] = var315.field5615;
                        return;
                    }
                    if (var315.field5614 == var314) {
                        field415[field409++] = var315.field5667;
                        return;
                    }
                    field415[field409++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field410[--field406];
                    int var317 = field415[--field409];
                    class512.method2869(-38, var316, var317 == 1);
                    field415[field409++] = class237.field3481;
                    return;
                }
                if (arg0 == 4211) {
                    if (class66.field1114 != null && class327.field4717 < class237.field3481) {
                        field415[field409++] = class66.field1114[class327.field4717++] & 0xFFFF;
                        return;
                    }
                    field415[field409++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class327.field4717 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field409 -= 2;
                    int var318 = field415[field409];
                    int var319 = field415[field409 + 1];
                    class188 var320 = class190.field2724.method1831(-61, var319);
                    if (var320.method1254(-10634)) {
                        field410[field406++] = class204.field2882.method287(var318, 8).method2576(var320.field2707, var319, 745337711);
                        return;
                    }
                    field415[field409++] = class204.field2882.method287(var318, 8).method2578(var319, var320.field2710, -127);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field409 -= 2;
                    int var321 = field415[field409];
                    int var322 = field415[field409 + 1];
                    class188 var323 = class190.field2724.method1831(-23, var322);
                    if (var323.method1254(-10634)) {
                        field410[field406++] = class552.field7819.method2890(0, var321).method2251(var322, -74, var323.field2707);
                        return;
                    }
                    field415[field409++] = class552.field7819.method2890(0, var321).method2252(var322, (byte) 3, var323.field2710);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field409 -= 2;
                    int var324 = field415[field409];
                    int var325 = field415[field409 + 1];
                    class188 var326 = class190.field2724.method1831(-92, var325);
                    if (var326.method1254(-10634)) {
                        field410[field406++] = class632.field9046.method3380(var324, (byte) -25).method1822(0, var325, var326.field2707);
                        return;
                    }
                    field415[field409++] = class632.field9046.method3380(var324, (byte) -25).method1824(8, var325, var326.field2710);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field415[--field409];
                class298 var328 = class469.field6760.method1193(76, var327);
                if (var328.field4307 != null && var328.field4307.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field4308[0];
                    for (int var331 = 1; var331 < var328.field4307.length; var331++) {
                        if (var328.field4308[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field4308[var331];
                        }
                    }
                    field415[field409++] = var328.field4307[var329];
                    return;
                }
                field415[field409++] = var328.field4296;
                return;
            }
        } else {
            class549 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class495.method2822((byte) -112, field415[--field409]);
            } else {
                var47 = arg1 ? field394 : field398;
            }
            if (arg0 == 1300) {
                int var48 = field415[--field409] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method3093(field410[--field406], true, var48);
                    return;
                }
                field406--;
                return;
            }
            if (arg0 == 1301) {
                field409 -= 2;
                int var49 = field415[field409];
                int var50 = field415[field409 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field7733 = null;
                    return;
                }
                var47.field7733 = class547.method3061(4096, var50, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field415[--field409];
                if (class167.field2442 != var51 && class469.field6761 != var51 && class365.field5176 != var51) {
                    return;
                }
                var47.field7627 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field7747 = field415[--field409];
                return;
            }
            if (arg0 == 1304) {
                var47.field7723 = field415[--field409];
                return;
            }
            if (arg0 == 1305) {
                var47.field7652 = field410[--field406];
                return;
            }
            if (arg0 == 1306) {
                var47.field7639 = field410[--field406];
                return;
            }
            if (arg0 == 1307) {
                var47.field7685 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field7784 = field415[--field409];
                var47.field7790 = field415[--field409];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field415[--field409];
                int var53 = field415[--field409];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method3087((byte) 116, var53 - 1, var52);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field7772 = field410[--field406];
                return;
            }
            if (arg0 == 1311) {
                var47.field7658 = field415[--field409];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field409 -= 3;
                    var54 = field415[field409] - 1;
                    var55 = field415[field409 + 1];
                    var56 = field415[field409 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field409 -= 2;
                    var54 = 10;
                    var55 = field415[field409];
                    var56 = field415[field409 + 1];
                }
                if (var47.field7691 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field7691 = new byte[11];
                    var47.field7745 = new byte[11];
                    var47.field7634 = new int[11];
                }
                var47.field7691[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field7647 = false;
                    for (int var57 = 0; var57 < var47.field7691.length; var57++) {
                        if (var47.field7691[var57] != 0) {
                            var47.field7647 = true;
                            break;
                        }
                    }
                } else {
                    var47.field7647 = true;
                }
                var47.field7745[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field7646 = field415[--field409];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lid;II)V")
    public static final void method283(class224 arg0, int arg1, int arg2) {
        class240 var3 = class373.method2265((byte) -109, arg2, arg1, arg0);
        if (var3 == null) {
            return;
        }
        field412 = new int[var3.field3496];
        field414 = new String[var3.field3484];
        if (class275.field4023 == var3.field3486 || class445.field6492 == var3.field3486 || class515.field7120 == var3.field3486) {
            int var4 = 0;
            int var5 = 0;
            if (class276.field4034 != null) {
                var4 = class276.field4034.field7631;
                var5 = class276.field4034.field7687;
            }
            field412[0] = class619.field8735.method1614((byte) -46) - var4;
            field412[1] = class619.field8735.method1607((byte) -78) - var5;
        }
        method272(var3, 200000);
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
    private static final void method284(int arg0) {
        class549 var1 = class495.method2822((byte) -124, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class549[] var3 = class44.field610[var2];
        if (var3 == null) {
            class549[] var4 = class177.field2593[var2];
            int var5 = var4.length;
            var3 = class44.field610[var2] = new class549[var5];
            class164.method1148(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class164.method1148(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(IZ)V")
    public static final void method285(int arg0, boolean arg1) {
    }
}
