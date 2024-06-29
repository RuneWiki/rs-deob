import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class495 {

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field7252 = new String[1000];

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "[[I")
    private static int[][] field7243 = new int[5][5000];

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[Leh;")
    private static class244[] field7247 = new class244[50];

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "[I")
    private static int[] field7257 = new int[1000];

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    private static int field7259 = 0;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private static int field7260 = 0;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "[I")
    private static int[] field7262 = new int[5];

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "I")
    private static int field7256 = 0;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7248 = Calendar.getInstance();

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field7267 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "[I")
    private static int[] field7268 = new int[3];

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "Lwm;")
    public static class399 field7269 = new class399(4);

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    private static int field7270 = 0;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field7246;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field7254;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field7255;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Lgh;")
    private static class388 field7242;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "Lgh;")
    private static class388 field7265;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "Ldw;")
    private static class507 field7261;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "[I")
    private static int[] field7266;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "[Ljava/lang/String;")
    private static String[] field7253;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    private static final void method2981(String arg0, int arg1) {
        if (class239.field3706 == 0 && !(!class453.field6733 || class85.field1747) || class410.field6203) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class376.field5499.method1977(0, 127))) {
            var3 = 0;
            arg0 = arg0.substring(class376.field5499.method1977(0, -95).length());
        } else if (var2.startsWith(class138.field2310.method1977(0, -103))) {
            var3 = 1;
            arg0 = arg0.substring(class138.field2310.method1977(0, 83).length());
        } else if (var2.startsWith(class179.field2907.method1977(0, -43))) {
            var3 = 2;
            arg0 = arg0.substring(class179.field2907.method1977(0, -41).length());
        } else if (var2.startsWith(class196.field3152.method1977(0, -44))) {
            var3 = 3;
            arg0 = arg0.substring(class196.field3152.method1977(0, -123).length());
        } else if (var2.startsWith(class177.field2867.method1977(0, -74))) {
            var3 = 4;
            arg0 = arg0.substring(class177.field2867.method1977(0, 108).length());
        } else if (var2.startsWith(class77.field1552.method1977(0, 96))) {
            var3 = 5;
            arg0 = arg0.substring(class77.field1552.method1977(0, -35).length());
        } else if (var2.startsWith(class293.field4483.method1977(0, 125))) {
            var3 = 6;
            arg0 = arg0.substring(class293.field4483.method1977(0, -92).length());
        } else if (var2.startsWith(class290.field4441.method1977(0, -107))) {
            var3 = 7;
            arg0 = arg0.substring(class290.field4441.method1977(0, -126).length());
        } else if (var2.startsWith(class306.field4604.method1977(0, 95))) {
            var3 = 8;
            arg0 = arg0.substring(class306.field4604.method1977(0, -66).length());
        } else if (var2.startsWith(class283.field4261.method1977(0, -108))) {
            var3 = 9;
            arg0 = arg0.substring(class283.field4261.method1977(0, -120).length());
        } else if (var2.startsWith(class499.field7328.method1977(0, -90))) {
            var3 = 10;
            arg0 = arg0.substring(class499.field7328.method1977(0, 74).length());
        } else if (var2.startsWith(class534.field7762.method1977(0, 113))) {
            var3 = 11;
            arg0 = arg0.substring(class534.field7762.method1977(0, 111).length());
        } else if (class146.field2452 != 0) {
            if (var2.startsWith(class376.field5499.method1977(class146.field2452, -56))) {
                var3 = 0;
                arg0 = arg0.substring(class376.field5499.method1977(class146.field2452, -78).length());
            } else if (var2.startsWith(class138.field2310.method1977(class146.field2452, -111))) {
                var3 = 1;
                arg0 = arg0.substring(class138.field2310.method1977(class146.field2452, -81).length());
            } else if (var2.startsWith(class179.field2907.method1977(class146.field2452, -43))) {
                var3 = 2;
                arg0 = arg0.substring(class179.field2907.method1977(class146.field2452, -117).length());
            } else if (var2.startsWith(class196.field3152.method1977(class146.field2452, -42))) {
                var3 = 3;
                arg0 = arg0.substring(class196.field3152.method1977(class146.field2452, 83).length());
            } else if (var2.startsWith(class177.field2867.method1977(class146.field2452, -125))) {
                var3 = 4;
                arg0 = arg0.substring(class177.field2867.method1977(class146.field2452, 101).length());
            } else if (var2.startsWith(class77.field1552.method1977(class146.field2452, 125))) {
                var3 = 5;
                arg0 = arg0.substring(class77.field1552.method1977(class146.field2452, 77).length());
            } else if (var2.startsWith(class293.field4483.method1977(class146.field2452, -120))) {
                var3 = 6;
                arg0 = arg0.substring(class293.field4483.method1977(class146.field2452, -112).length());
            } else if (var2.startsWith(class290.field4441.method1977(class146.field2452, 116))) {
                var3 = 7;
                arg0 = arg0.substring(class290.field4441.method1977(class146.field2452, -33).length());
            } else if (var2.startsWith(class306.field4604.method1977(class146.field2452, 81))) {
                var3 = 8;
                arg0 = arg0.substring(class306.field4604.method1977(class146.field2452, -55).length());
            } else if (var2.startsWith(class283.field4261.method1977(class146.field2452, -112))) {
                var3 = 9;
                arg0 = arg0.substring(class283.field4261.method1977(class146.field2452, -109).length());
            } else if (var2.startsWith(class499.field7328.method1977(class146.field2452, -77))) {
                var3 = 10;
                arg0 = arg0.substring(class499.field7328.method1977(class146.field2452, -96).length());
            } else if (var2.startsWith(class534.field7762.method1977(class146.field2452, -91))) {
                var3 = 11;
                arg0 = arg0.substring(class534.field7762.method1977(class146.field2452, -43).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class127.field2173.method1977(0, 90))) {
            var5 = 1;
            arg0 = arg0.substring(class127.field2173.method1977(0, -108).length());
        } else if (var4.startsWith(class215.field3403.method1977(0, -98))) {
            var5 = 2;
            arg0 = arg0.substring(class215.field3403.method1977(0, -102).length());
        } else if (var4.startsWith(class230.field3565.method1977(0, -102))) {
            var5 = 3;
            arg0 = arg0.substring(class230.field3565.method1977(0, 79).length());
        } else if (var4.startsWith(class166.field2689.method1977(0, -41))) {
            var5 = 4;
            arg0 = arg0.substring(class166.field2689.method1977(0, -117).length());
        } else if (var4.startsWith(class79.field1581.method1977(0, 74))) {
            var5 = 5;
            arg0 = arg0.substring(class79.field1581.method1977(0, 71).length());
        } else if (class146.field2452 != 0) {
            if (var4.startsWith(class127.field2173.method1977(class146.field2452, -90))) {
                var5 = 1;
                arg0 = arg0.substring(class127.field2173.method1977(class146.field2452, -95).length());
            } else if (var4.startsWith(class215.field3403.method1977(class146.field2452, 122))) {
                var5 = 2;
                arg0 = arg0.substring(class215.field3403.method1977(class146.field2452, -54).length());
            } else if (var4.startsWith(class230.field3565.method1977(class146.field2452, 126))) {
                var5 = 3;
                arg0 = arg0.substring(class230.field3565.method1977(class146.field2452, -107).length());
            } else if (var4.startsWith(class166.field2689.method1977(class146.field2452, 95))) {
                var5 = 4;
                arg0 = arg0.substring(class166.field2689.method1977(class146.field2452, -121).length());
            } else if (var4.startsWith(class79.field1581.method1977(class146.field2452, 76))) {
                var5 = 5;
                arg0 = arg0.substring(class79.field1581.method1977(class146.field2452, 122).length());
            }
        }
        field7250++;
        class459.method2765(class76.field1542, (byte) 87);
        class335.field5062.method1814(0, true);
        int var6 = class335.field5062.field4399;
        if (arg1 == 5021) {
            class335.field5062.method1814(1, true);
        } else if (arg1 == 5022) {
            class335.field5062.method1814(2, true);
        } else {
            class335.field5062.method1814(0, true);
        }
        class335.field5062.method1814(var3, true);
        class335.field5062.method1814(var5, true);
        class396.method2460(false, class335.field5062, arg0);
        class335.field5062.method1828(false, class335.field5062.field4399 - var6);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lsj;)V", line = 281)
    public static final void method2982(class322 arg0) {
        method2985(arg0, 200000);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/lang/String;", line = 286)
    private static final String method2983(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7248.setTime(new Date(var1));
        int var3 = field7248.get(5);
        int var4 = field7248.get(2);
        int var5 = field7248.get(1);
        return var3 + "-" + field7267[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 297)
    public static final void method2984(int arg0) {
        if (arg0 == -1 || !class1.method16(arg0, 1465669104)) {
            return;
        }
        class388[] var1 = class419.field6326[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class388 var3 = var1[var2];
            if (var3.field5802 != null) {
                class322 var4 = new class322();
                var4.field4918 = var3;
                var4.field4911 = var3.field5802;
                method2985(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lsj;I)V", line = 328)
    private static final void method2985(class322 arg0, int arg1) {
        Object[] var2 = arg0.field4911;
        int var3 = (Integer) var2[0];
        class384 var4 = class239.method1560(122, var3);
        if (var4 == null) {
            return;
        }
        field7266 = new int[var4.field5616];
        int var5 = 0;
        field7253 = new String[var4.field5612];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4922;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4914;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4918 == null ? -1 : arg0.field4918.field5700;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4908;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4918 == null ? -1 : arg0.field4918.field5777;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4913 == null ? -1 : arg0.field4913.field5700;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4913 == null ? -1 : arg0.field4913.field5777;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4909;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4915;
                }
                field7266[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4921;
                }
                field7253[var6++] = var9;
            }
        }
        field7270 = arg0.field4920;
        method2986(var4, arg1);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lmd;I)V", line = 411)
    private static final void method2986(class384 arg0, int arg1) {
        field7260 = 0;
        field7256 = 0;
        int var2 = -1;
        int[] var3 = arg0.field5606;
        int[] var4 = arg0.field5615;
        byte var5 = -1;
        field7259 = 0;
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
                        method2990(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2989(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7257[field7260++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7257[field7260++] = class402.field6080.field258[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class402.field6080.method96((byte) -53, field7257[--field7260], var8);
                } else if (var43 == 3) {
                    field7252[field7256++] = arg0.field5614[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7260 -= 2;
                    if (field7257[field7260 + 1] != field7257[field7260]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7260 -= 2;
                    if (field7257[field7260 + 1] == field7257[field7260]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7260 -= 2;
                    if (field7257[field7260] < field7257[field7260 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7260 -= 2;
                    if (field7257[field7260] > field7257[field7260 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7259 == 0) {
                        return;
                    }
                    class244 var9 = field7247[--field7259];
                    arg0 = var9.field3776;
                    var3 = arg0.field5606;
                    var4 = arg0.field5615;
                    var2 = var9.field3773;
                    field7266 = var9.field3779;
                    field7253 = var9.field3777;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7257[field7260++] = class402.field6080.method90(var10, (byte) 124);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class402.field6080.method97(0, field7257[--field7260], var11);
                } else if (var43 == 31) {
                    field7260 -= 2;
                    if (field7257[field7260] <= field7257[field7260 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7260 -= 2;
                    if (field7257[field7260] >= field7257[field7260 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7257[field7260++] = field7266[var4[var2]];
                } else if (var43 == 34) {
                    field7266[var4[var2]] = field7257[--field7260];
                } else if (var43 == 35) {
                    field7252[field7256++] = field7253[var4[var2]];
                } else if (var43 == 36) {
                    field7253[var4[var2]] = field7252[--field7256];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7256 -= var12;
                    String var13 = class15.method102(531, field7256, var12, field7252);
                    field7252[field7256++] = var13;
                } else if (var43 == 38) {
                    field7260--;
                } else if (var43 == 39) {
                    field7256--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class384 var15 = class239.method1560(127, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field5616];
                    String[] var17 = new String[var15.field5612];
                    for (int var18 = 0; var18 < var15.field5611; var18++) {
                        var16[var18] = field7257[field7260 + var18 - var15.field5611];
                    }
                    for (int var19 = 0; var19 < var15.field5609; var19++) {
                        var17[var19] = field7252[field7256 + var19 - var15.field5609];
                    }
                    field7260 -= var15.field5611;
                    field7256 -= var15.field5609;
                    class244 var20 = new class244();
                    var20.field3776 = arg0;
                    var20.field3773 = var2;
                    var20.field3779 = field7266;
                    var20.field3777 = field7253;
                    if (field7259 >= field7247.length) {
                        throw new RuntimeException();
                    }
                    field7247[field7259++] = var20;
                    arg0 = var15;
                    var3 = var15.field5606;
                    var4 = var15.field5615;
                    var2 = -1;
                    field7266 = var16;
                    field7253 = var17;
                } else if (var43 == 42) {
                    field7257[field7260++] = class81.field1675[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class81.field1675[var21] = field7257[--field7260];
                    class69.method600(var21, 1);
                    class166.field2690 |= class68.field1377[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7257[--field7260];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7262[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7243[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7257[--field7260];
                    if (var28 < 0 || var28 >= field7262[var27]) {
                        throw new RuntimeException();
                    }
                    field7257[field7260++] = field7243[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7260 -= 2;
                    int var30 = field7257[field7260];
                    if (var30 < 0 || var30 >= field7262[var29]) {
                        throw new RuntimeException();
                    }
                    field7243[var29][var30] = field7257[field7260 + 1];
                } else if (var43 == 47) {
                    String var31 = class77.field1555[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7252[field7256++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class77.field1555[var32] = field7252[--field7256];
                    class222.method1480(2, var32);
                } else if (var43 == 51) {
                    class249 var33 = arg0.field5607[var4[var2]];
                    class100 var34 = (class100) var33.method1622((long) field7257[--field7260], -107);
                    if (var34 != null) {
                        var2 += var34.field1923;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field5613 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3977).append(" ");
                for (int var41 = field7259 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7247[var41].field3776.field3977).append(" ");
                }
                var40.append("op: ").append(var5);
                class486.method2913(var40.toString(), var42, (byte) -121);
            } else {
                class475.method2843((byte) -98, "Clientscript error in: " + arg0.field5613);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field5613).append("\n");
                for (int var38 = field7259 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7247[var38].field3776.field5613).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class486.method2913(var37.toString(), var42, (byte) -124);
                class113.method944((byte) -64, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "()V", line = 845)
    public static void method2987() {
        field7266 = null;
        field7253 = null;
        field7262 = null;
        field7243 = null;
        field7257 = null;
        field7252 = null;
        field7247 = null;
        field7265 = null;
        field7242 = null;
        field7261 = null;
        field7248 = null;
        field7267 = null;
        field7268 = null;
        field7269 = null;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "()V", line = 860)
    public static final void method2988() {
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZ)V", line = 876)
    private static final void method2989(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7257[field7260++] = class76.field1544;
                return;
            }
            if (arg0 == 5001) {
                field7260 -= 3;
                class76.field1544 = field7257[field7260];
                class3.field68 = class355.method2190(field7257[field7260 + 1], 120);
                if (class3.field68 == null) {
                    class3.field68 = class5.field92;
                }
                class395.field6019 = field7257[field7260 + 2];
                field7258++;
                class459.method2765(class248.field3827, (byte) 87);
                class335.field5062.method1814(class76.field1544, true);
                class335.field5062.method1814(class3.field68.field2585, true);
                class335.field5062.method1814(class395.field6019, true);
                return;
            }
            if (arg0 == 5002) {
                field7256 -= 2;
                String var2 = field7252[field7256];
                String var3 = field7252[field7256 + 1];
                field7260 -= 2;
                int var4 = field7257[field7260];
                int var5 = field7257[field7260 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field7245++;
                class459.method2765(class119.field2088, (byte) 87);
                class335.field5062.method1814(class362.method2220(var2, (byte) -80) + class362.method2220(var3, (byte) -80) + 2, true);
                class335.field5062.method1821(var2, 95);
                class335.field5062.method1814(var4 - 1, true);
                class335.field5062.method1814(var5, true);
                class335.field5062.method1821(var3, 79);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field7257[--field7260];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class163.field2618[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field7252[field7256++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field7257[--field7260];
                int var9 = -1;
                if (var8 < 100 && class163.field2618[var8] != null) {
                    var9 = class393.field6008[var8];
                }
                field7257[field7260++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class3.field68 == null) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = class3.field68.field2585;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field7252[--field7256];
                method2981(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7256 -= 2;
                String var11 = field7252[field7256];
                String var12 = field7252[field7256 + 1];
                if (class239.field3706 != 0 || (!class453.field6733 || class85.field1747) && !class410.field6203) {
                    field7254++;
                    class459.method2765(class352.field5196, (byte) 87);
                    class335.field5062.method1814(0, true);
                    int var13 = class335.field5062.field4399;
                    class335.field5062.method1821(var11, 66);
                    class396.method2460(false, class335.field5062, var12);
                    class335.field5062.method1828(false, class335.field5062.field4399 - var13);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field7257[--field7260];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class258.field3951[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field7252[field7256++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field7257[--field7260];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class276.field4176[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field7252[field7256++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field7257[--field7260];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class220.field3463[var18];
                }
                field7257[field7260++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class15.field266 == null || class15.field266.field5348 == null) {
                    var20 = class339.field5106;
                } else {
                    var20 = class15.field266.method2246(true, true);
                }
                field7252[field7256++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field7257[field7260++] = class395.field6019;
                return;
            }
            if (arg0 == 5017) {
                field7257[field7260++] = class438.field6511;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field7257[--field7260];
                int var22 = 0;
                if (var21 < 100 && class163.field2618[var21] != null) {
                    var22 = class328.field4975[var21];
                }
                field7257[field7260++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field7257[--field7260];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class127.field2175[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field7252[field7256++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class15.field266 == null || class15.field266.field5348 == null) {
                    var25 = class339.field5106;
                } else {
                    var25 = class15.field266.method2239(false, true);
                }
                field7252[field7256++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field7257[--field7260];
                field7252[field7256++] = class175.field2845.method697(var26, -3).field2517;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field7257[--field7260];
                class155 var28 = class175.field2845.method697(var27, -3);
                if (var28.field2514 == null) {
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = var28.field2514.length;
                return;
            }
            if (arg0 == 5052) {
                field7260 -= 2;
                int var29 = field7257[field7260];
                int var30 = field7257[field7260 + 1];
                class155 var31 = class175.field2845.method697(var29, -3);
                int var32 = var31.field2514[var30];
                field7257[field7260++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field7257[--field7260];
                class155 var34 = class175.field2845.method697(var33, -3);
                if (var34.field2511 == null) {
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = var34.field2511.length;
                return;
            }
            if (arg0 == 5054) {
                field7260 -= 2;
                int var35 = field7257[field7260];
                int var36 = field7257[field7260 + 1];
                field7257[field7260++] = class175.field2845.method697(var35, -3).field2511[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field7257[--field7260];
                field7252[field7256++] = class17.field280.method195(var37, -32769).method2396(-1);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field7257[--field7260];
                class389 var39 = class17.field280.method195(var38, -32769);
                if (var39.field5835 == null) {
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = var39.field5835.length;
                return;
            }
            if (arg0 == 5057) {
                field7260 -= 2;
                int var40 = field7257[field7260];
                int var41 = field7257[field7260 + 1];
                field7257[field7260++] = class17.field280.method195(var40, -32769).field5835[var41];
                return;
            }
            if (arg0 == 5058) {
                field7261 = new class507();
                field7261.field7388 = field7257[--field7260];
                field7261.field7390 = class17.field280.method195(field7261.field7388, -32769);
                field7261.field7395 = new int[field7261.field7390.method2404(-25109)];
                return;
            }
            if (arg0 == 5059) {
                field7264++;
                class459.method2765(class374.field5475, (byte) 87);
                class335.field5062.method1814(0, true);
                int var42 = class335.field5062.field4399;
                class335.field5062.method1814(0, true);
                class335.field5062.method1865(field7261.field7388, 812856296);
                field7261.field7390.method2395(class335.field5062, field7261.field7395, -5);
                class335.field5062.method1828(false, class335.field5062.field4399 - var42);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field7252[--field7256];
                field7249++;
                class459.method2765(class238.field3672, (byte) 87);
                class335.field5062.method1814(0, true);
                int var44 = class335.field5062.field4399;
                class335.field5062.method1821(var43, 99);
                class335.field5062.method1865(field7261.field7388, 812856296);
                field7261.field7390.method2395(class335.field5062, field7261.field7395, -5);
                class335.field5062.method1828(false, class335.field5062.field4399 - var44);
                return;
            }
            if (arg0 == 5061) {
                field7264++;
                class459.method2765(class374.field5475, (byte) 87);
                class335.field5062.method1814(0, true);
                int var45 = class335.field5062.field4399;
                class335.field5062.method1814(1, true);
                class335.field5062.method1865(field7261.field7388, 812856296);
                field7261.field7390.method2395(class335.field5062, field7261.field7395, -5);
                class335.field5062.method1828(false, class335.field5062.field4399 - var45);
                return;
            }
            if (arg0 == 5062) {
                field7260 -= 2;
                int var46 = field7257[field7260];
                int var47 = field7257[field7260 + 1];
                field7257[field7260++] = class175.field2845.method697(var46, -3).field2518[var47];
                return;
            }
            if (arg0 == 5063) {
                field7260 -= 2;
                int var48 = field7257[field7260];
                int var49 = field7257[field7260 + 1];
                field7257[field7260++] = class175.field2845.method697(var48, -3).field2519[var49];
                return;
            }
            if (arg0 == 5064) {
                field7260 -= 2;
                int var50 = field7257[field7260];
                int var51 = field7257[field7260 + 1];
                if (var51 == -1) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = class175.field2845.method697(var50, -3).method1125((char) var51, 109);
                return;
            }
            if (arg0 == 5065) {
                field7260 -= 2;
                int var52 = field7257[field7260];
                int var53 = field7257[field7260 + 1];
                if (var53 == -1) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = class175.field2845.method697(var52, -3).method1123((char) var53, 14072);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field7257[--field7260];
                field7257[field7260++] = class17.field280.method195(var54, -32769).method2404(-25109);
                return;
            }
            if (arg0 == 5067) {
                field7260 -= 2;
                int var55 = field7257[field7260];
                int var56 = field7257[field7260 + 1];
                int var57 = class17.field280.method195(var55, -32769).method2398(-13037, var56).field4193;
                field7257[field7260++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field7260 -= 2;
                int var58 = field7257[field7260];
                int var59 = field7257[field7260 + 1];
                field7261.field7395[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field7260 -= 2;
                int var60 = field7257[field7260];
                int var61 = field7257[field7260 + 1];
                field7261.field7395[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field7260 -= 3;
                int var62 = field7257[field7260];
                int var63 = field7257[field7260 + 1];
                int var64 = field7257[field7260 + 2];
                class389 var65 = class17.field280.method195(var62, -32769);
                if (var65.method2398(-13037, var63).field4193 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7257[field7260++] = var65.method2393(var64, -99, var63);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field7252[--field7256];
                boolean var67 = field7257[--field7260] == 1;
                class309.method1974(var66, -85, var67);
                field7257[field7260++] = class207.field3324;
                return;
            }
            if (arg0 == 5072) {
                if (class274.field4165 != null && class283.field4266 < class207.field3324) {
                    field7257[field7260++] = class274.field4165[class283.field4266++] & 0xFFFF;
                    return;
                }
                field7257[field7260++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class283.field4266 = 0;
                return;
            }
            if (arg0 == 5074) {
                field7264++;
                class459.method2765(class374.field5475, (byte) 87);
                class335.field5062.method1814(0, true);
                int var68 = class335.field5062.field4399;
                class335.field5062.method1814(2, true);
                class335.field5062.method1865(field7261.field7388, 812856296);
                field7261.field7390.method2395(class335.field5062, field7261.field7395, -5);
                class335.field5062.method1828(false, class335.field5062.field4399 - var68);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class179.field2912.method1458(100, 86)) {
                    field7257[field7260++] = 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class179.field2912.method1458(100, 82)) {
                    field7257[field7260++] = 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class179.field2912.method1458(100, 81)) {
                    field7257[field7260++] = 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class535.method3157(field7257[--field7260], -76);
                return;
            }
            if (arg0 == 5201) {
                field7257[field7260++] = class354.method2188((byte) -127);
                return;
            }
            if (arg0 == 5205) {
                class68.method591(false, field7257[--field7260], -1, 7390, -1);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field7257[--field7260];
                class191 var70 = class319.method2033(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = var70.field3086;
                return;
            }
            if (arg0 == 5207) {
                class191 var71 = class319.method2048(field7257[--field7260]);
                if (var71 != null && var71.field3081 != null) {
                    field7252[field7256++] = var71.field3081;
                    return;
                }
                field7252[field7256++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7257[field7260++] = class528.field7697;
                field7257[field7260++] = class366.field5382;
                return;
            }
            if (arg0 == 5209) {
                field7257[field7260++] = class71.field1437 + class319.field4876;
                field7257[field7260++] = class457.field6775 + class319.field4869;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field7257[--field7260];
                class191 var73 = class319.method2048(var72);
                if (var73 == null) {
                    field7257[field7260++] = 0;
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = var73.field3091 >> 14 & 0x3FFF;
                field7257[field7260++] = var73.field3091 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field7257[--field7260];
                class191 var75 = class319.method2048(var74);
                if (var75 == null) {
                    field7257[field7260++] = 0;
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = var75.field3071 - var75.field3090;
                field7257[field7260++] = var75.field3085 - var75.field3078;
                return;
            }
            if (arg0 == 5212) {
                class97 var76 = class249.method1612(-11366);
                if (var76 == null) {
                    field7257[field7260++] = -1;
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = var76.field1890;
                int var77 = var76.field1888 << 28 | class319.field4876 + var76.field1897 << 14 | class319.field4869 + var76.field1893;
                field7257[field7260++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class97 var78 = class216.method1447(true);
                if (var78 == null) {
                    field7257[field7260++] = -1;
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = var78.field1890;
                int var79 = var78.field1888 << 28 | class319.field4876 + var78.field1897 << 14 | class319.field4869 + var78.field1893;
                field7257[field7260++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field7257[--field7260];
                class191 var81 = class193.method1305(-23338);
                if (var81 != null) {
                    boolean var82 = var81.method1298((byte) -72, var80 >> 28 & 0x3, field7268, var80 & 0x3FFF, var80 >> 14 & 0x3FFF);
                    if (var82) {
                        class236.method1547(field7268[2], false, field7268[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7260 -= 2;
                int var83 = field7257[field7260];
                int var84 = field7257[field7260 + 1];
                class83 var85 = class319.method2050(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class191 var87 = (class191) var85.method779(1); var87 != null; var87 = (class191) var85.method780((byte) 103)) {
                    if (var87.field3086 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field7257[field7260++] = 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field7257[--field7260];
                class191 var89 = class319.method2048(var88);
                if (var89 == null) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = var89.field3074;
                return;
            }
            if (arg0 == 5220) {
                field7257[field7260++] = class35.field537 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field7257[--field7260];
                class236.method1547(var90 & 0x3FFF, false, var90 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class191 var91 = class193.method1305(-23338);
                if (var91 != null) {
                    boolean var92 = var91.method1294(class457.field6775 + class319.field4869, class71.field1437 + class319.field4876, 12800, field7268);
                    if (var92) {
                        field7257[field7260++] = field7268[1];
                        field7257[field7260++] = field7268[2];
                        return;
                    }
                    field7257[field7260++] = -1;
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = -1;
                field7257[field7260++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7260 -= 2;
                int var93 = field7257[field7260];
                int var94 = field7257[field7260 + 1];
                class68.method591(false, var93, var94 & 0x3FFF, 7390, var94 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field7257[--field7260];
                class191 var96 = class193.method1305(-23338);
                if (var96 != null) {
                    boolean var97 = var96.method1298((byte) -115, var95 >> 28 & 0x3, field7268, var95 & 0x3FFF, var95 >> 14 & 0x3FFF);
                    if (var97) {
                        field7257[field7260++] = field7268[1];
                        field7257[field7260++] = field7268[2];
                        return;
                    }
                    field7257[field7260++] = -1;
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = -1;
                field7257[field7260++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field7257[--field7260];
                class191 var99 = class193.method1305(-23338);
                if (var99 != null) {
                    boolean var100 = var99.method1294(var98 & 0x3FFF, var98 >> 14 & 0x3FFF, 12800, field7268);
                    if (var100) {
                        field7257[field7260++] = field7268[1];
                        field7257[field7260++] = field7268[2];
                        return;
                    }
                    field7257[field7260++] = -1;
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = -1;
                field7257[field7260++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class311.method1981(field7257[--field7260], 3746);
                return;
            }
            if (arg0 == 5227) {
                field7260 -= 2;
                int var101 = field7257[field7260];
                int var102 = field7257[field7260 + 1];
                class68.method591(true, var101, var102 & 0x3FFF, 7390, var102 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class177.field2869 = field7257[--field7260] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7257[field7260++] = class177.field2869 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field7257[--field7260];
                class14.method91(var103, 127);
                return;
            }
            if (arg0 == 5231) {
                field7260 -= 2;
                int var104 = field7257[field7260];
                boolean var105 = field7257[field7260 + 1] == 1;
                if (class370.field5431 != null) {
                    class261 var106 = class370.field5431.method1622((long) var104, 76);
                    if (var106 != null && !var105) {
                        var106.method1676(true);
                        return;
                    }
                    if (var106 == null && var105) {
                        class261 var107 = new class261();
                        class370.field5431.method1618(var107, (long) var104, -1);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field7257[--field7260];
                if (class370.field5431 != null) {
                    class261 var109 = class370.field5431.method1622((long) var108, -105);
                    field7257[field7260++] = var109 == null ? 0 : 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7260 -= 2;
                int var110 = field7257[field7260];
                boolean var111 = field7257[field7260 + 1] == 1;
                if (class427.field6393 != null) {
                    class261 var112 = class427.field6393.method1622((long) var110, -106);
                    if (var112 != null && !var111) {
                        var112.method1676(true);
                        return;
                    }
                    if (var112 == null && var111) {
                        class261 var113 = new class261();
                        class427.field6393.method1618(var113, (long) var110, -1);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field7257[--field7260];
                if (class427.field6393 != null) {
                    class261 var115 = class427.field6393.method1622((long) var114, -116);
                    field7257[field7260++] = var115 == null ? 0 : 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7257[field7260++] = class319.field4850 == null ? -1 : class319.field4850.field3086;
                return;
            }
            if (arg0 == 5236) {
                field7260 -= 2;
                int var116 = field7257[field7260];
                int var117 = field7257[field7260 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class256.method1651(var119, var116, (byte) -125, var118);
                if (var120 < 0) {
                    field7257[field7260++] = -1;
                    return;
                }
                field7257[field7260++] = var120;
                return;
            }
            if (arg0 == 5237) {
                class70.method602((byte) 108);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7260 -= 2;
                int var121 = field7257[field7260];
                int var122 = field7257[field7260 + 1];
                class56.method509(var121, true, 3, var122, false);
                field7257[field7260++] = class387.field5662 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class387.field5662 != null) {
                    class56.method509(-1, true, class186.field2990.field2536, -1, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class39[] var123 = class481.method2889((byte) 80);
                field7257[field7260++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field7257[--field7260];
                class39[] var125 = class481.method2889((byte) 98);
                field7257[field7260++] = var125[var124].field563;
                field7257[field7260++] = var125[var124].field562;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class186.field2990.field2565;
                int var127 = class186.field2990.field2528;
                int var128 = -1;
                class39[] var129 = class481.method2889((byte) 104);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class39 var131 = var129[var130];
                    if (var131.field563 == var126 && var131.field562 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field7257[field7260++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field7257[field7260++] = class13.method86(3);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field7257[--field7260];
                if (var132 >= 1 && var132 <= 2) {
                    class56.method509(-1, true, var132, -1, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7257[field7260++] = class186.field2990.field2536;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field7257[--field7260];
                if (var133 >= 1 && var133 <= 2) {
                    class186.field2990.field2536 = var133;
                    class186.field2990.method1787((byte) 96, class497.field7305);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7256 -= 2;
                String var134 = field7252[field7256];
                String var135 = field7252[field7256 + 1];
                int var136 = field7257[--field7260];
                field7263++;
                class459.method2765(class510.field7437, (byte) 87);
                class335.field5062.method1814(class362.method2220(var134, (byte) -80) + class362.method2220(var135, (byte) -80) + 1, true);
                class335.field5062.method1821(var134, 112);
                class335.field5062.method1821(var135, 116);
                class335.field5062.method1814(var136, true);
                return;
            }
            if (arg0 == 5401) {
                field7260 -= 2;
                class97.field1886[field7257[field7260]] = (short) class226.method1506(field7257[field7260 + 1], -9388);
                class135.field2271.method1637(102);
                class135.field2271.method1630(-6769);
                class102.field1942.method849(-97);
                class102.method895(0);
                return;
            }
            if (arg0 == 5405) {
                field7260 -= 2;
                int var137 = field7257[field7260];
                int var138 = field7257[field7260 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class141.field2343[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7260 -= 7;
                int var139 = field7257[field7260];
                int var140 = field7257[field7260 + 1] << 1;
                int var141 = field7257[field7260 + 2];
                int var142 = field7257[field7260 + 3];
                int var143 = field7257[field7260 + 4];
                int var144 = field7257[field7260 + 5];
                int var145 = field7257[field7260 + 6];
                if (var139 >= 0 && var139 < 2 && class141.field2343[var139] != null && var140 >= 0 && var140 < class141.field2343[var139].length) {
                    class141.field2343[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class141.field2343[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class141.field2343[field7257[--field7260]].length >> 1;
                field7257[field7260++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class387.field5662 != null) {
                    class56.method509(-1, true, class186.field2990.field2536, -1, false);
                }
                if (class97.field1889 != null) {
                    class177.method1213(1);
                    System.exit(0);
                    return;
                }
                String var147 = class524.field7619 == null ? class385.method2360(957) : class524.field7619;
                class188.method1282((byte) -83, class133.field2236 == 1, false, class497.field7305, var147);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class127.field2171 != null) {
                    if (class127.field2171.field2115 == null) {
                        var148 = class508.method3043(class127.field2171.field2114, true);
                    } else {
                        var148 = (String) class127.field2171.field2115;
                    }
                }
                field7252[field7256++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field7257[field7260++] = class480.field7076 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class387.field5662 != null) {
                    class56.method509(-1, true, class186.field2990.field2536, -1, false);
                }
                String var149 = field7252[--field7256];
                boolean var150 = field7257[--field7260] == 1;
                String var151 = class385.method2360(957) + var149;
                class188.method1282((byte) 95, class133.field2236 == 1, var150, class497.field7305, var151);
                return;
            }
            if (arg0 == 5422) {
                field7256 -= 2;
                String var152 = field7252[field7256];
                String var153 = field7252[field7256 + 1];
                int var154 = field7257[--field7260];
                if (var152.length() > 0) {
                    if (class39.field561 == null) {
                        class39.field561 = new String[class479.field7066[class424.field6366.field5121]];
                    }
                    class39.field561[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class289.field4436 == null) {
                        class289.field4436 = new String[class479.field7066[class424.field6366.field5121]];
                    }
                    class289.field4436[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7252[--field7256]);
                return;
            }
            if (arg0 == 5424) {
                field7260 -= 11;
                class362.field5297 = field7257[field7260];
                class177.field2872 = field7257[field7260 + 1];
                class274.field4158 = field7257[field7260 + 2];
                class460.field6848 = field7257[field7260 + 3];
                class204.field3267 = field7257[field7260 + 4];
                class3.field70 = field7257[field7260 + 5];
                class190.field3062 = field7257[field7260 + 6];
                class175.field2851 = field7257[field7260 + 7];
                class498.field7313 = field7257[field7260 + 8];
                class276.field4171 = field7257[field7260 + 9];
                class383.field5599 = field7257[field7260 + 10];
                class455.field6758.method2739(class204.field3267, 93);
                class455.field6758.method2739(class3.field70, -109);
                class455.field6758.method2739(class190.field3062, 77);
                class455.field6758.method2739(class175.field2851, 115);
                class455.field6758.method2739(class498.field7313, 115);
                class347.field5168 = null;
                class171.field2773 = null;
                class198.field3195 = null;
                class45.field956 = null;
                class129.field2198 = null;
                class87.field1783 = null;
                class51.field1073 = null;
                class265.field4035 = null;
                class192.field3105 = true;
                return;
            }
            if (arg0 == 5425) {
                class348.method2171((byte) -24);
                class192.field3105 = false;
                return;
            }
            if (arg0 == 5426) {
                field7260 -= 2;
                class3.field67 = field7257[field7260];
                class10.field139 = field7257[field7260 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7260 -= 2;
                class18.field297 = field7257[field7260 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7260 -= 2;
                int var155 = field7257[field7260];
                int var156 = field7257[field7260 + 1];
                field7257[field7260++] = class510.method3058(var155, var156, -126) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class230.method1518(field7252[--field7256], false, false, -30805);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class227.method1509(class497.field7305.field7072, "accountcreated", 29436);
                    return;
                } catch (Throwable var278) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7260 -= 4;
                int var157 = field7257[field7260];
                int var158 = field7257[field7260 + 1];
                int var159 = field7257[field7260 + 2];
                int var160 = field7257[field7260 + 3];
                class485.method2907(var160, (var157 >> 14 & 0x3FFF) - class496.field7292, var159, false, (byte) 53, var158, (var157 & 0x3FFF) - class212.field3378);
                return;
            }
            if (arg0 == 5501) {
                field7260 -= 4;
                int var161 = field7257[field7260];
                int var162 = field7257[field7260 + 1];
                int var163 = field7257[field7260 + 2];
                int var164 = field7257[field7260 + 3];
                class218.method1456(var162, var163, (var161 & 0x3FFF) - class212.field3378, var164, (var161 >> 14 & 0x3FFF) - class496.field7292, 85);
                return;
            }
            if (arg0 == 5502) {
                field7260 -= 6;
                int var165 = field7257[field7260];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class507.field7396 = var165;
                int var166 = field7257[field7260 + 1];
                if (var166 + 1 >= class141.field2343[class507.field7396].length >> 1) {
                    throw new RuntimeException();
                }
                class466.field6928 = var166;
                class170.field2763 = 0;
                class110.field2009 = field7257[field7260 + 2];
                class320.field4888 = field7257[field7260 + 3];
                int var167 = field7257[field7260 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class449.field6677 = var167;
                int var168 = field7257[field7260 + 5];
                if (var168 + 1 >= class141.field2343[class449.field6677].length >> 1) {
                    throw new RuntimeException();
                }
                class75.field1532 = var168;
                class510.field7435 = 3;
                return;
            }
            if (arg0 == 5503) {
                class211.method1434(true);
                return;
            }
            if (arg0 == 5504) {
                field7260 -= 2;
                class225.method1503(field7257[field7260 + 1], 3, field7257[field7260], 0);
                return;
            }
            if (arg0 == 5505) {
                field7257[field7260++] = (int) class113.field2041 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7257[field7260++] = (int) class525.field7631 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class77.method690((byte) -125);
                return;
            }
            if (arg0 == 5508) {
                class514.method3067(120);
                return;
            }
            if (arg0 == 5509) {
                class14.method95(-22894);
                return;
            }
            if (arg0 == 5510) {
                class378.method2326(5000);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field7257[--field7260];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class496.field7292;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class339.field5099) {
                    var172 = class339.field5099;
                }
                int var173 = var171 - class212.field3378;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class484.field7129) {
                    var173 = class484.field7129;
                }
                class344.field5142 = (var172 << 7) + 64;
                class388.field5798 = (var173 << 7) + 64;
                class510.field7435 = 4;
                return;
            }
            if (arg0 == 5512) {
                class472.method2820((byte) -127);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7256 -= 2;
                String var174 = field7252[field7256];
                String var175 = field7252[field7256 + 1];
                int var176 = field7257[--field7260];
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    class339.field5106 = var174;
                    class256.field3934 = var175;
                    class405.field6102 = var176;
                    class253.method1639(5, -16646);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class420.method2566((byte) -120);
                return;
            }
            if (arg0 == 5602) {
                if (class179.field2910 == 0) {
                    class462.field6867 = -2;
                    class524.field7623 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field7260 -= 4;
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    class459.method2740(field7257[field7260 + 2], field7257[field7260], field7257[field7260 + 1], (byte) 119, field7257[field7260 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field7256--;
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    class481.method2890(0, class410.method2539((byte) 12, field7252[field7256]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7256 -= 2;
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    class10.method58(class410.method2539((byte) 12, field7252[field7256]), false, 39, field7252[field7256 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class210.field3355 == 0) {
                    class393.field6007 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7257[field7260++] = class524.field7623;
                return;
            }
            if (arg0 == 5608) {
                field7257[field7260++] = class209.field3342;
                return;
            }
            if (arg0 == 5609) {
                field7257[field7260++] = class393.field6007;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field7252[field7256++] = class278.field4188.length > var177 ? class122.method981(-107, class278.field4188[var177]) : "";
                }
                class278.field4188 = null;
                return;
            }
            if (arg0 == 5611) {
                field7257[field7260++] = class85.field1753;
                return;
            }
            if (arg0 == 5612) {
                int var178 = field7257[--field7260];
                if (class466.field6932 != 6) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    if (class216.field3417 != null) {
                        class216.field3417.method2319((byte) 115);
                        class216.field3417 = null;
                    }
                    class405.field6102 = var178;
                    class253.method1639(8, -16646);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7257[field7260++] = class524.field7623;
                return;
            }
            if (arg0 == 5615) {
                field7256 -= 2;
                String var179 = field7252[field7256];
                String var180 = field7252[field7256 + 1];
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    if (class216.field3417 != null) {
                        class216.field3417.method2319((byte) 109);
                        class216.field3417 = null;
                    }
                    class339.field5106 = var179;
                    class256.field3934 = var180;
                    class253.method1639(4, -16646);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class391.method2414(false, 5424);
                return;
            }
            if (arg0 == 5617) {
                field7257[field7260++] = class462.field6867;
                return;
            }
            if (arg0 == 5618) {
                int var181 = field7257[--field7260];
                class95.method856(var181, false, 94);
                return;
            }
            if (arg0 == 5619) {
                int var182 = field7257[--field7260];
                class95.method856(var182, true, 24);
                return;
            }
            if (arg0 == 5620) {
                class439.method2618(11);
                if (class236.field3643 != "" && class236.field3643 != "") {
                    field7257[field7260++] = 1;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7256 -= 2;
                if (class466.field6932 != 2) {
                    return;
                }
                if (class179.field2910 == 0 && class210.field3355 == 0) {
                    class10.method58(class410.method2539((byte) 12, field7252[field7256]), true, 39, field7252[field7256 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class121 var183 = class497.field7305.method2878("3", false, 0);
                while (var183.field2119 == 0) {
                    class50.method470(1L, -5);
                }
                if (var183.field2119 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class371 var184 = (class371) var183.field2115;
                if (var184.method2280((byte) 13).exists()) {
                    class289 var185 = new class289(50);
                    try {
                        var184.method2281(var185.field4408, 0, 50, 0);
                    } catch (IOException var280) {
                    }
                }
                try {
                    var184.method2276(-2771);
                    return;
                } catch (Exception var279) {
                    return;
                }
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var186 = field7257[--field7260];
                if (var186 < 1) {
                    var186 = 1;
                }
                if (var186 > 4) {
                    var186 = 4;
                }
                class186.field2990.field2550 = var186;
                class488.method2957((byte) 119);
                class186.field2990.method1787((byte) 97, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6002) {
                class186.field2990.method1780(-3, field7257[--field7260] == 1);
                class488.method2957((byte) 122);
                class4.method32((byte) -83);
                class186.field2990.method1787((byte) 97, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6003) {
                class186.field2990.field2548 = field7257[--field7260] == 1;
                class4.method32((byte) -68);
                class186.field2990.method1787((byte) 98, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6005) {
                class186.field2990.field2529 = field7257[--field7260] == 1;
                class488.method2957((byte) 112);
                class186.field2990.method1787((byte) 101, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6006) {
                class186.field2990.field2558 = field7257[--field7260] == 1;
                class262.field4006.method287(!class186.field2990.field2558);
                class186.field2990.method1787((byte) 63, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6007) {
                class186.field2990.field2546 = field7257[--field7260];
                class186.field2990.method1787((byte) 51, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6008) {
                class186.field2990.field2543 = field7257[--field7260] == 1;
                class186.field2990.method1787((byte) 91, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6009) {
                class186.field2990.field2541 = field7257[--field7260] == 1;
                class488.method2957((byte) 86);
                class186.field2990.method1787((byte) 88, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6010) {
                class186.field2990.field2540 = field7257[--field7260] == 1;
                class186.field2990.method1787((byte) 127, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6011) {
                int var187 = field7257[--field7260];
                if (var187 < 0 || var187 > 2) {
                    var187 = 0;
                }
                class186.field2990.method1131(class133.field2236, false, var187);
                class488.method2957((byte) 92);
                class186.field2990.method1787((byte) 99, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6012) {
                class186.field2990.method1132(field7257[--field7260] == 1, -19147, class133.field2236);
                class256.method1648(77);
                class237.method1550((byte) 77);
                class186.field2990.method1787((byte) 87, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6014) {
                class186.field2990.field2538 = field7257[--field7260] == 1;
                class488.method2957((byte) 111);
                class186.field2990.method1787((byte) 100, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6015) {
                class186.field2990.field2533 = field7257[--field7260] == 1;
                class488.method2957((byte) 122);
                class186.field2990.method1787((byte) 69, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6016) {
                int var188 = field7257[--field7260];
                if (var188 < 0 || var188 > 2) {
                    var188 = 0;
                }
                class186.field2990.field2542 = var188;
                class304.method1944(false, class133.field2236);
                class186.field2990.method1787((byte) 95, class497.field7305);
                return;
            }
            if (arg0 == 6017) {
                class186.field2990.field2559 = field7257[--field7260] == 1;
                class260.method1668(false);
                class186.field2990.method1787((byte) 67, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6018) {
                int var189 = field7257[--field7260];
                if (var189 < 0) {
                    var189 = 0;
                }
                if (var189 > 127) {
                    var189 = 127;
                }
                class186.field2990.field2532 = var189;
                class186.field2990.method1787((byte) 108, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6019) {
                int var190 = field7257[--field7260];
                if (var190 < 0) {
                    var190 = 0;
                }
                if (var190 > 255) {
                    var190 = 255;
                }
                if (class186.field2990.field2560 != var190) {
                    if (class186.field2990.field2560 == 0 && class273.field4131 != -1) {
                        class363.method2222((byte) 24, class273.field4131, var190, class202.field3263, false, 0);
                        class281.field4250 = false;
                    } else if (var190 == 0) {
                        class112.method931((byte) 100);
                        class281.field4250 = false;
                    } else {
                        class261.method1674(-1, var190);
                    }
                    class186.field2990.field2560 = var190;
                }
                class186.field2990.method1787((byte) 63, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6020) {
                int var191 = field7257[--field7260];
                if (var191 < 0) {
                    var191 = 0;
                }
                if (var191 > 127) {
                    var191 = 127;
                }
                class186.field2990.field2544 = var191;
                class186.field2990.method1787((byte) 53, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6021) {
                class186.field2990.field4284 = field7257[--field7260] == 1;
                class4.method32((byte) -48);
                return;
            }
            if (arg0 == 6023) {
                int var192 = field7257[--field7260];
                boolean var193 = false;
                if (var192 < 0) {
                    var192 = 0;
                }
                if (var192 > 2) {
                    var192 = 2;
                }
                if (class370.field5418 < 96) {
                    var192 = 0;
                    var193 = true;
                }
                class79.method706(var192, 1);
                class186.field2990.method1787((byte) 115, class497.field7305);
                class1.field46 = false;
                field7257[field7260++] = var193 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var194 = field7257[--field7260];
                if (var194 < 0 || var194 > 2) {
                    var194 = 0;
                }
                class186.field2990.field2552 = var194;
                class186.field2990.method1787((byte) 86, class497.field7305);
                return;
            }
            if (arg0 == 6025) {
                int var195 = field7257[--field7260];
                if (var195 < 0 || var195 > class469.method2803(32, class370.field5418)) {
                    var195 = 0;
                }
                class186.field2990.field2545 = var195;
                class186.field2990.method1787((byte) 70, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6027) {
                int var196 = field7257[--field7260];
                if (var196 < 0 || var196 > 1) {
                    var196 = 0;
                }
                class27.method193(0, var196 == 1);
                return;
            }
            if (arg0 == 6028) {
                class186.field2990.field2553 = field7257[--field7260] != 0;
                class186.field2990.method1787((byte) 78, class497.field7305);
                return;
            }
            if (arg0 == 6029) {
                class186.field2990.field2546 = field7257[--field7260];
                class186.field2990.method1787((byte) 83, class497.field7305);
                return;
            }
            if (arg0 == 6030) {
                class186.field2990.field2557 = field7257[--field7260] != 0;
                class186.field2990.method1787((byte) 124, class497.field7305);
                class488.method2957((byte) 88);
                return;
            }
            if (arg0 == 6031) {
                int var197 = field7257[--field7260];
                if (var197 < 0 || var197 > 3) {
                    var197 = 2;
                }
                class304.method1944(false, var197);
                return;
            }
            if (arg0 == 6032) {
                int var198 = field7257[--field7260];
                if (var198 < 0 || var198 > 3) {
                    var198 = 2;
                }
                class186.field2990.field2537 = var198;
                class186.field2990.method1787((byte) 88, class497.field7305);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6033) {
                int var199 = field7257[--field7260];
                if (var199 < 0 || var199 > 4) {
                    var199 = 2;
                }
                class186.field2990.field2554 = var199;
                class186.field2990.method1787((byte) 83, class497.field7305);
                return;
            }
            if (arg0 == 6034) {
                class186.field2990.field2531 = field7257[--field7260] == 1;
                class186.field2990.method1787((byte) 94, class497.field7305);
                class256.method1648(76);
                class1.field46 = false;
                return;
            }
            if (arg0 == 6035) {
                class186.field2990.field4295 = field7257[--field7260] == 1;
                class488.method2957((byte) 88);
                class4.method32((byte) -55);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7257[field7260++] = class186.field2990.field2550;
                return;
            }
            if (arg0 == 6102) {
                field7257[field7260++] = class186.field2990.method1784(2002, class133.field2236) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7257[field7260++] = class186.field2990.field2548 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7257[field7260++] = class186.field2990.field2529 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field7257[field7260++] = class186.field2990.field2558 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7257[field7260++] = class186.field2990.field2546;
                return;
            }
            if (arg0 == 6108) {
                field7257[field7260++] = class186.field2990.field2543 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field7257[field7260++] = class186.field2990.field2541 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7257[field7260++] = class186.field2990.field2540 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7257[field7260++] = class186.field2990.method1130(class133.field2236, 99);
                return;
            }
            if (arg0 == 6112) {
                field7257[field7260++] = class186.field2990.method1129(0, class133.field2236) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7257[field7260++] = class186.field2990.field2538 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7257[field7260++] = class186.field2990.field2533 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7257[field7260++] = class186.field2990.field2542;
                return;
            }
            if (arg0 == 6117) {
                field7257[field7260++] = class186.field2990.field2559 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7257[field7260++] = class186.field2990.field2532;
                return;
            }
            if (arg0 == 6119) {
                field7257[field7260++] = class186.field2990.field2560;
                return;
            }
            if (arg0 == 6120) {
                field7257[field7260++] = class186.field2990.field2544;
                return;
            }
            if (arg0 == 6121) {
                field7257[field7260++] = class262.field4006.method408() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field7257[field7260++] = class358.method2207(0);
                return;
            }
            if (arg0 == 6124) {
                field7257[field7260++] = class186.field2990.field2552;
                return;
            }
            if (arg0 == 6125) {
                field7257[field7260++] = class186.field2990.field2545;
                return;
            }
            if (arg0 == 6126) {
                field7257[field7260++] = class262.field4006.method338() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field7257[field7260++] = class186.field2990.field2530 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7257[field7260++] = class186.field2990.field2553 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7257[field7260++] = class186.field2990.field2546;
                return;
            }
            if (arg0 == 6130) {
                field7257[field7260++] = class186.field2990.field2557 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7257[field7260++] = class133.field2236;
                return;
            }
            if (arg0 == 6132) {
                field7257[field7260++] = class186.field2990.field2537;
                return;
            }
            if (arg0 == 6133) {
                field7257[field7260++] = class480.field7076 == 1 || class480.field7076 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field7257[field7260++] = class469.method2803(32, class370.field5418);
                return;
            }
            if (arg0 == 6135) {
                field7257[field7260++] = class186.field2990.field2554;
                return;
            }
            if (arg0 == 6136) {
                field7257[field7260++] = class186.field2990.field2531 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var200 = true;
                try {
                    var200 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var281) {
                }
                field7257[field7260++] = var200 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7260 -= 2;
                class434.field6469 = (short) field7257[field7260];
                if (class434.field6469 <= 0) {
                    class434.field6469 = 256;
                }
                class224.field3511 = (short) field7257[field7260 + 1];
                if (class224.field3511 <= 0) {
                    class224.field3511 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7260 -= 2;
                class222.field3470 = (short) field7257[field7260];
                if (class222.field3470 <= 0) {
                    class222.field3470 = 256;
                }
                class179.field2897 = (short) field7257[field7260 + 1];
                if (class179.field2897 <= 0) {
                    class179.field2897 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7260 -= 4;
                class86.field1766 = (short) field7257[field7260];
                if (class86.field1766 <= 0) {
                    class86.field1766 = 1;
                }
                class52.field1121 = (short) field7257[field7260 + 1];
                if (class52.field1121 <= 0) {
                    class52.field1121 = 32767;
                } else if (class52.field1121 < class86.field1766) {
                    class52.field1121 = class86.field1766;
                }
                class375.field5493 = (short) field7257[field7260 + 2];
                if (class375.field5493 <= 0) {
                    class375.field5493 = 1;
                }
                class482.field7113 = (short) field7257[field7260 + 3];
                if (class482.field7113 <= 0) {
                    class482.field7113 = 32767;
                    return;
                }
                if (class482.field7113 < class375.field5493) {
                    class482.field7113 = class375.field5493;
                }
                return;
            }
            if (arg0 == 6203) {
                class103.method898(122, false, class46.field968.field5745, 0, 0, class46.field968.field5712);
                field7257[field7260++] = class107.field1975;
                field7257[field7260++] = class410.field6199;
                return;
            }
            if (arg0 == 6204) {
                field7257[field7260++] = class222.field3470;
                field7257[field7260++] = class179.field2897;
                return;
            }
            if (arg0 == 6205) {
                field7257[field7260++] = class434.field6469;
                field7257[field7260++] = class224.field3511;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7257[field7260++] = (int) (class423.method2578(-19698) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7257[field7260++] = (int) (class423.method2578(-19698) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7260 -= 3;
                int var201 = field7257[field7260];
                int var202 = field7257[field7260 + 1];
                int var203 = field7257[field7260 + 2];
                field7248.clear();
                field7248.set(11, 12);
                field7248.set(var203, var202, var201);
                int var204 = (int) (field7248.getTime().getTime() / 86400000L) - 11745;
                if (var203 < 1970) {
                    var204--;
                }
                field7257[field7260++] = var204;
                return;
            }
            if (arg0 == 6303) {
                field7248.clear();
                field7248.setTime(new Date(class423.method2578(-19698)));
                field7257[field7260++] = field7248.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var205 = field7257[--field7260];
                boolean var206 = true;
                if (var205 < 0) {
                    var206 = (var205 + 1) % 4 == 0;
                } else if (var205 < 1582) {
                    var206 = var205 % 4 == 0;
                } else if (var205 % 4 != 0) {
                    var206 = false;
                } else if (var205 % 100 != 0) {
                    var206 = true;
                } else if (var205 % 400 != 0) {
                    var206 = false;
                }
                field7257[field7260++] = var206 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7257[field7260++] = class383.method2357((byte) -63) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7257[field7260++] = class368.method2254(-1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class466.field6932 == 6 && class179.field2910 == 0 && class210.field3355 == 0) {
                    if (class186.field2988) {
                        field7257[field7260++] = 0;
                        return;
                    }
                    if (class515.field7479 > class423.method2578(-19698) - 1000L) {
                        field7257[field7260++] = 1;
                        return;
                    }
                    class186.field2988 = true;
                    class459.method2765(class206.field3299, (byte) 87);
                    class335.field5062.method1862((byte) -115, class26.field394);
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class255 var207 = class56.method511(80);
                if (var207 != null) {
                    field7257[field7260++] = var207.field3910;
                    field7257[field7260++] = var207.field5243;
                    field7252[field7256++] = var207.field3914;
                    class376 var208 = var207.method1644(-1);
                    field7257[field7260++] = var208.field5497;
                    field7252[field7256++] = var208.field5505;
                    field7257[field7260++] = var207.field5237;
                    field7257[field7260++] = var207.field3907;
                    field7252[field7256++] = var207.field3912;
                    return;
                }
                field7257[field7260++] = -1;
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                return;
            }
            if (arg0 == 6502) {
                class255 var209 = class387.method2373(-62);
                if (var209 != null) {
                    field7257[field7260++] = var209.field3910;
                    field7257[field7260++] = var209.field5243;
                    field7252[field7256++] = var209.field3914;
                    class376 var210 = var209.method1644(-1);
                    field7257[field7260++] = var210.field5497;
                    field7252[field7256++] = var210.field5505;
                    field7257[field7260++] = var209.field5237;
                    field7257[field7260++] = var209.field3907;
                    field7252[field7256++] = var209.field3912;
                    return;
                }
                field7257[field7260++] = -1;
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var211 = field7257[--field7260];
                String var212 = field7252[--field7256];
                if (class466.field6932 == 6 && class179.field2910 == 0 && class210.field3355 == 0) {
                    field7257[field7260++] = class320.method2053(var212, -8983, var211) ? 1 : 0;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class186.field2990.field2535 = field7257[--field7260];
                class186.field2990.method1787((byte) 65, class497.field7305);
                return;
            }
            if (arg0 == 6505) {
                field7257[field7260++] = class186.field2990.field2535;
                return;
            }
            if (arg0 == 6506) {
                int var213 = field7257[--field7260];
                class255 var214 = class327.method2073(var213, (byte) 18);
                if (var214 != null) {
                    field7257[field7260++] = var214.field5243;
                    field7252[field7256++] = var214.field3914;
                    class376 var215 = var214.method1644(-1);
                    field7257[field7260++] = var215.field5497;
                    field7252[field7256++] = var215.field5505;
                    field7257[field7260++] = var214.field5237;
                    field7257[field7260++] = var214.field3907;
                    field7252[field7256++] = var214.field3912;
                    return;
                }
                field7257[field7260++] = -1;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                field7257[field7260++] = 0;
                field7257[field7260++] = 0;
                field7252[field7256++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7260 -= 4;
                int var216 = field7257[field7260];
                boolean var217 = field7257[field7260 + 1] == 1;
                int var218 = field7257[field7260 + 2];
                boolean var219 = field7257[field7260 + 3] == 1;
                class174.method1203(var219, var218, 33, var216, var217);
                return;
            }
            if (arg0 == 6508) {
                class71.method612(734);
                return;
            }
            if (arg0 == 6509) {
                if (class466.field6932 != 6) {
                    return;
                }
                class341.field5122 = field7257[--field7260] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class186.field2990.field2527 = field7257[--field7260] == 1;
                class186.field2990.method1787((byte) 98, class497.field7305);
                return;
            }
            if (arg0 == 6601) {
                field7257[field7260++] = class186.field2990.field2527 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class471.field6990 == class281.field4249) {
            if (arg0 == 6700) {
                int var220 = class470.field6975.method1611((byte) -21);
                if (class155.field2523 != -1) {
                    var220++;
                }
                field7257[field7260++] = var220;
                return;
            }
            if (arg0 == 6701) {
                int var221 = field7257[--field7260];
                if (class155.field2523 != -1) {
                    if (var221 == 0) {
                        field7257[field7260++] = class155.field2523;
                        return;
                    }
                    var221--;
                }
                class141 var222 = (class141) class470.field6975.method1615(0);
                while (var221-- > 0) {
                    var222 = (class141) class470.field6975.method1621((byte) -39);
                }
                field7257[field7260++] = var222.field2342;
                return;
            }
            if (arg0 == 6702) {
                int var223 = field7257[--field7260];
                if (class419.field6326[var223] == null) {
                    field7252[field7256++] = "";
                    return;
                }
                String var224 = class419.field6326[var223][0].field5693;
                if (var224 == null) {
                    field7252[field7256++] = "";
                    return;
                }
                field7252[field7256++] = var224.substring(0, var224.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var225 = field7257[--field7260];
                if (class419.field6326[var225] == null) {
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = class419.field6326[var225].length;
                return;
            }
            if (arg0 == 6704) {
                field7260 -= 2;
                int var226 = field7257[field7260];
                int var227 = field7257[field7260 + 1];
                if (class419.field6326[var226] == null) {
                    field7252[field7256++] = "";
                    return;
                }
                String var228 = class419.field6326[var226][var227].field5693;
                if (var228 == null) {
                    field7252[field7256++] = "";
                    return;
                }
                field7252[field7256++] = var228;
                return;
            }
            if (arg0 == 6705) {
                field7260 -= 2;
                int var229 = field7257[field7260];
                int var230 = field7257[field7260 + 1];
                if (class419.field6326[var229] == null) {
                    field7257[field7260++] = 0;
                    return;
                }
                field7257[field7260++] = class419.field6326[var229][var230].field5806;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field7260 -= 3;
                int var231 = field7257[field7260];
                int var232 = field7257[field7260 + 1];
                int var233 = field7257[field7260 + 2];
                class379.method2334(1, var231 << 16 | var232, "", -12689, var233);
                return;
            }
            if (arg0 == 6708) {
                field7260 -= 3;
                int var234 = field7257[field7260];
                int var235 = field7257[field7260 + 1];
                int var236 = field7257[field7260 + 2];
                class379.method2334(2, var234 << 16 | var235, "", -12689, var236);
                return;
            }
            if (arg0 == 6709) {
                field7260 -= 3;
                int var237 = field7257[field7260];
                int var238 = field7257[field7260 + 1];
                int var239 = field7257[field7260 + 2];
                class379.method2334(3, var237 << 16 | var238, "", -12689, var239);
                return;
            }
            if (arg0 == 6710) {
                field7260 -= 3;
                int var240 = field7257[field7260];
                int var241 = field7257[field7260 + 1];
                int var242 = field7257[field7260 + 2];
                class379.method2334(4, var240 << 16 | var241, "", -12689, var242);
                return;
            }
            if (arg0 == 6711) {
                field7260 -= 3;
                int var243 = field7257[field7260];
                int var244 = field7257[field7260 + 1];
                int var245 = field7257[field7260 + 2];
                class379.method2334(5, var243 << 16 | var244, "", -12689, var245);
                return;
            }
            if (arg0 == 6712) {
                field7260 -= 3;
                int var246 = field7257[field7260];
                int var247 = field7257[field7260 + 1];
                int var248 = field7257[field7260 + 2];
                class379.method2334(6, var246 << 16 | var247, "", -12689, var248);
                return;
            }
            if (arg0 == 6713) {
                field7260 -= 3;
                int var249 = field7257[field7260];
                int var250 = field7257[field7260 + 1];
                int var251 = field7257[field7260 + 2];
                class379.method2334(7, var249 << 16 | var250, "", -12689, var251);
                return;
            }
            if (arg0 == 6714) {
                field7260 -= 3;
                int var252 = field7257[field7260];
                int var253 = field7257[field7260 + 1];
                int var254 = field7257[field7260 + 2];
                class379.method2334(8, var252 << 16 | var253, "", -12689, var254);
                return;
            }
            if (arg0 == 6715) {
                field7260 -= 3;
                int var255 = field7257[field7260];
                int var256 = field7257[field7260 + 1];
                int var257 = field7257[field7260 + 2];
                class379.method2334(9, var255 << 16 | var256, "", -12689, var257);
                return;
            }
            if (arg0 == 6716) {
                field7260 -= 3;
                int var258 = field7257[field7260];
                int var259 = field7257[field7260 + 1];
                int var260 = field7257[field7260 + 2];
                class379.method2334(10, var258 << 16 | var259, "", -12689, var260);
                return;
            }
            if (arg0 == 6717) {
                field7260 -= 3;
                int var261 = field7257[field7260];
                int var262 = field7257[field7260 + 1];
                int var263 = field7257[field7260 + 2];
                class388 var264 = class447.method2677(var263, 0, var261 << 16 | var262);
                class320.method2056(-63);
                class99 var265 = client.method1371(var264);
                class144.method1072(var265.field1918, var265.method881(20740), var264, false);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var266 = field7257[--field7260];
                class25 var267 = class309.field4682.method1247(false, var266);
                if (var267.field370 == null) {
                    field7252[field7256++] = "";
                    return;
                }
                field7252[field7256++] = var267.field370;
                return;
            }
            if (arg0 == 6801) {
                int var268 = field7257[--field7260];
                class25 var269 = class309.field4682.method1247(false, var268);
                field7257[field7260++] = var269.field356;
                return;
            }
            if (arg0 == 6802) {
                int var270 = field7257[--field7260];
                class25 var271 = class309.field4682.method1247(false, var270);
                field7257[field7260++] = var271.field347;
                return;
            }
            if (arg0 == 6803) {
                int var272 = field7257[--field7260];
                class25 var273 = class309.field4682.method1247(false, var272);
                field7257[field7260++] = var273.field359;
                return;
            }
            if (arg0 == 6804) {
                field7260 -= 2;
                int var274 = field7257[field7260];
                int var275 = field7257[field7260 + 1];
                class247 var276 = class453.field6727.method460(var275, -18297);
                if (var276.method1602(115)) {
                    field7252[field7256++] = class309.field4682.method1247(false, var274).method169(var276.field3810, var275, (byte) -93);
                    return;
                }
                field7257[field7260++] = class309.field4682.method1247(false, var274).method174(-124, var275, var276.field3809);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field7257[field7260++] = class453.field6733 && !class85.field1747 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field7257[field7260++] = class230.field3566;
                return;
            }
            if (arg0 == 6902) {
                field7257[field7260++] = class46.field964;
                return;
            }
            if (arg0 == 6903) {
                field7257[field7260++] = class308.field4671;
                return;
            }
            if (arg0 == 6904) {
                field7257[field7260++] = class454.field6752;
                return;
            }
            if (arg0 == 6905) {
                String var277 = "";
                if (class127.field2171 != null) {
                    if (class127.field2171.field2115 == null) {
                        var277 = class508.method3043(class127.field2171.field2114, true);
                    } else {
                        var277 = (String) class127.field2171.field2115;
                    }
                }
                field7252[field7256++] = var277;
                return;
            }
            if (arg0 == 6906) {
                field7257[field7260++] = class80.field1605;
                return;
            }
            if (arg0 == 6907) {
                field7257[field7260++] = class193.field3110;
                return;
            }
            if (arg0 == 6908) {
                field7257[field7260++] = class133.field2228;
                return;
            }
            if (arg0 == 6909) {
                field7257[field7260++] = class191.field3072 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field7257[field7260++] = class320.field4899;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(IZ)V", line = 4107)
    private static final void method2990(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7260 -= 3;
                int var2 = field7257[field7260];
                int var3 = field7257[field7260 + 1];
                int var4 = field7257[field7260 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class388 var5 = class271.method1716(27411, var2);
                if (var5.field5819 == null) {
                    var5.field5819 = new class388[var4 + 1];
                }
                if (var5.field5819.length <= var4) {
                    class388[] var6 = new class388[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5819.length; var7++) {
                        var6[var7] = var5.field5819[var7];
                    }
                    var5.field5819 = var6;
                }
                if (var4 > 0 && var5.field5819[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class388 var8 = new class388();
                var8.field5784 = var3;
                var8.field5728 = var8.field5700 = var5.field5700;
                var8.field5777 = var4;
                var5.field5819[var4] = var8;
                if (arg1) {
                    field7242 = var8;
                } else {
                    field7265 = var8;
                }
                class429.method2587(var5, (byte) -63);
                return;
            }
            if (arg0 == 101) {
                class388 var9 = arg1 ? field7242 : field7265;
                if (var9.field5777 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class388 var10 = class271.method1716(27411, var9.field5700);
                var10.field5819[var9.field5777] = null;
                class429.method2587(var10, (byte) -63);
                return;
            }
            if (arg0 == 102) {
                class388 var11 = class271.method1716(27411, field7257[--field7260]);
                var11.field5819 = null;
                class429.method2587(var11, (byte) -63);
                return;
            }
            if (arg0 == 200) {
                field7260 -= 2;
                int var12 = field7257[field7260];
                int var13 = field7257[field7260 + 1];
                class388 var14 = class447.method2677(var13, 0, var12);
                if (var14 != null && var13 != -1) {
                    field7257[field7260++] = 1;
                    if (arg1) {
                        field7242 = var14;
                        return;
                    }
                    field7265 = var14;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7257[--field7260];
                class388 var16 = class271.method1716(27411, var15);
                if (var16 != null) {
                    field7257[field7260++] = 1;
                    if (arg1) {
                        field7242 = var16;
                        return;
                    }
                    field7265 = var16;
                    return;
                }
                field7257[field7260++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7257[--field7260];
                method2994(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7257[--field7260];
                method2991(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7260 -= 2;
                int var19 = field7257[field7260];
                int var20 = field7257[field7260 + 1];
                for (int var21 = 0; var21 < class258.field3958.length; var21++) {
                    if (class258.field3958[var21] == var19) {
                        class15.field266.field5343.method2270(class428.field6404, var20, Integer.MIN_VALUE, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class397.field6033.length; var22++) {
                    if (class397.field6033[var22] == var19) {
                        class15.field266.field5343.method2270(class428.field6404, var20, Integer.MIN_VALUE, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7260 -= 2;
                int var23 = field7257[field7260];
                int var24 = field7257[field7260 + 1];
                class15.field266.field5343.method2268(var24, var23, 16384);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7257[--field7260] != 0;
                class15.field266.field5343.method2267(var25, (byte) 73);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class388 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class271.method1716(27411, field7257[--field7260]);
            } else {
                var26 = arg1 ? field7242 : field7265;
            }
            if (arg0 == 1000) {
                field7260 -= 4;
                var26.field5757 = field7257[field7260];
                var26.field5726 = field7257[field7260 + 1];
                int var27 = field7257[field7260 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field7257[field7260 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field5789 = (byte) var27;
                var26.field5710 = (byte) var28;
                class429.method2587(var26, (byte) -63);
                class173.method1198(var26, (byte) -63);
                if (var26.field5777 == -1) {
                    class390.method2408(var26.field5700, false);
                }
                return;
            }
            if (arg0 == 1001) {
                field7260 -= 4;
                var26.field5820 = field7257[field7260];
                var26.field5741 = field7257[field7260 + 1];
                var26.field5751 = 0;
                var26.field5709 = 0;
                int var29 = field7257[field7260 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field7257[field7260 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field5823 = (byte) var29;
                var26.field5771 = (byte) var30;
                class429.method2587(var26, (byte) -63);
                class173.method1198(var26, (byte) -63);
                if (var26.field5784 == 0) {
                    class379.method2331(false, -89, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field7257[--field7260] == 1;
                if (var26.field5736 != var31) {
                    var26.field5736 = var31;
                    class429.method2587(var26, (byte) -63);
                }
                if (var26.field5777 == -1) {
                    class324.method2065(var26.field5700, 4061);
                }
                return;
            }
            if (arg0 == 1004) {
                field7260 -= 2;
                var26.field5826 = field7257[field7260];
                var26.field5734 = field7257[field7260 + 1];
                class429.method2587(var26, (byte) -63);
                class173.method1198(var26, (byte) -63);
                if (var26.field5784 == 0) {
                    class379.method2331(false, -79, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field5669 = field7257[--field7260] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class388 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class271.method1716(27411, field7257[--field7260]);
            } else {
                var32 = arg1 ? field7242 : field7265;
            }
            if (arg0 == 1100) {
                field7260 -= 2;
                var32.field5782 = field7257[field7260];
                if (var32.field5782 > var32.field5721 - var32.field5745) {
                    var32.field5782 = var32.field5721 - var32.field5745;
                }
                if (var32.field5782 < 0) {
                    var32.field5782 = 0;
                }
                var32.field5740 = field7257[field7260 + 1];
                if (var32.field5740 > var32.field5758 - var32.field5712) {
                    var32.field5740 = var32.field5758 - var32.field5712;
                }
                if (var32.field5740 < 0) {
                    var32.field5740 = 0;
                }
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class467.method2797(var32.field5700, 383851490);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field5674 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class200.method1383((byte) 127, var32.field5700);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field5822 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1103) {
                var32.field5722 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1104) {
                var32.field5787 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field7257[--field7260];
                if (var32.field5795 != var33) {
                    var32.field5795 = var33;
                    class429.method2587(var32, (byte) -63);
                }
                if (var32.field5777 == -1) {
                    class211.method1433(var32.field5700, (byte) 41);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field5742 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1107) {
                var32.field5804 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1108) {
                var32.field5785 = 1;
                var32.field5794 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class248.method1608(-101, var32.field5700);
                }
                return;
            }
            if (arg0 == 1109) {
                field7260 -= 6;
                var32.field5684 = field7257[field7260];
                var32.field5708 = field7257[field7260 + 1];
                var32.field5675 = field7257[field7260 + 2];
                var32.field5716 = field7257[field7260 + 3];
                var32.field5696 = field7257[field7260 + 4];
                var32.field5719 = field7257[field7260 + 5];
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class335.method2107(var32.field5700, -19653);
                    class440.method2624(var32.field5700, (byte) 41);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field7257[--field7260];
                if (var32.field5737 != var34) {
                    var32.field5737 = var34;
                    var32.field5747 = 0;
                    var32.field5678 = 1;
                    var32.field5672 = 0;
                    class429.method2587(var32, (byte) -63);
                }
                if (var32.field5777 == -1) {
                    class457.method2724(var32.field5700, 95);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field5803 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field7252[--field7256];
                if (!var35.equals(var32.field5725)) {
                    var32.field5725 = var35;
                    class429.method2587(var32, (byte) -63);
                }
                if (var32.field5777 == -1) {
                    class29.method208(3, var32.field5700);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field5689 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class513.method3065(var32.field5700, true);
                }
                return;
            }
            if (arg0 == 1114) {
                field7260 -= 3;
                var32.field5717 = field7257[field7260];
                var32.field5809 = field7257[field7260 + 1];
                var32.field5824 = field7257[field7260 + 2];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1115) {
                var32.field5707 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1116) {
                var32.field5764 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1117) {
                var32.field5811 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1118) {
                var32.field5752 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1119) {
                var32.field5677 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1120) {
                field7260 -= 2;
                var32.field5721 = field7257[field7260];
                var32.field5758 = field7257[field7260 + 1];
                class429.method2587(var32, (byte) -63);
                if (var32.field5784 == 0) {
                    class379.method2331(false, 110, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field7260 -= 2;
                var32.field5781 = (short) field7257[field7260];
                var32.field5727 = (short) field7257[field7260 + 1];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1122) {
                var32.field5704 = field7257[--field7260] == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1123) {
                var32.field5719 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                if (var32.field5777 == -1) {
                    class335.method2107(var32.field5700, -19653);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field7257[--field7260];
                var32.field5767 = var36 == 1;
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1125) {
                field7260 -= 2;
                var32.field5698 = field7257[field7260];
                var32.field5763 = field7257[field7260 + 1];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1126) {
                var32.field5801 = field7257[--field7260];
                class429.method2587(var32, (byte) -63);
                return;
            }
            if (arg0 == 1127) {
                field7260 -= 2;
                int var37 = field7257[field7260];
                int var38 = field7257[field7260 + 1];
                class247 var39 = class453.field6727.method460(var37, -18297);
                if (var39.field3809 != var38) {
                    var32.method2385(var38, 11993, var37);
                    return;
                }
                var32.method2383(var37, 1131372964);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field7257[--field7260];
                String var41 = field7252[--field7256];
                class247 var42 = class453.field6727.method460(var40, -18297);
                if (!var42.field3810.equals(var41)) {
                    var32.method2382(false, var41, var40);
                    return;
                }
                var32.method2383(var40, 1131372964);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class388 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class271.method1716(27411, field7257[--field7260]);
            } else {
                var43 = arg1 ? field7242 : field7265;
            }
            class429.method2587(var43, (byte) -63);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7260 -= 2;
                int var44 = field7257[field7260];
                int var45 = field7257[field7260 + 1];
                if (var43.field5777 == -1) {
                    class85.method794((byte) 92, var43.field5700);
                    class335.method2107(var43.field5700, -19653);
                    class440.method2624(var43.field5700, (byte) 41);
                }
                if (var44 == -1) {
                    var43.field5785 = 1;
                    var43.field5794 = -1;
                    var43.field5688 = -1;
                    return;
                }
                var43.field5688 = var44;
                var43.field5776 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field5739 = true;
                } else {
                    var43.field5739 = false;
                }
                class12 var46 = class135.field2271.method1636(var44, -107);
                var43.field5675 = var46.field168;
                var43.field5716 = var46.field172;
                var43.field5696 = var46.field203;
                var43.field5684 = var46.field185;
                var43.field5708 = var46.field218;
                var43.field5719 = var46.field152;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field5805 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field5805 = 1;
                } else {
                    var43.field5805 = 2;
                }
                if (var43.field5751 > 0) {
                    var43.field5719 = var43.field5719 * 32 / var43.field5751;
                    return;
                }
                if (var43.field5820 > 0) {
                    var43.field5719 = var43.field5719 * 32 / var43.field5820;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field5785 = 2;
                var43.field5794 = field7257[--field7260];
                if (var43.field5777 == -1) {
                    class248.method1608(-125, var43.field5700);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field5785 = 3;
                var43.field5794 = -1;
                if (var43.field5777 == -1) {
                    class248.method1608(-121, var43.field5700);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field5785 = 6;
                var43.field5794 = field7257[--field7260];
                if (var43.field5777 == -1) {
                    class248.method1608(-103, var43.field5700);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field5785 = 5;
                var43.field5794 = field7257[--field7260];
                if (var43.field5777 == -1) {
                    class248.method1608(54, var43.field5700);
                }
                return;
            }
            if (arg0 == 1206) {
                field7260 -= 4;
                var43.field5813 = field7257[field7260];
                var43.field5810 = field7257[field7260 + 1];
                var43.field5768 = field7257[field7260 + 2];
                var43.field5760 = field7257[field7260 + 3];
                class429.method2587(var43, (byte) -63);
                return;
            }
            if (arg0 == 1207) {
                field7260 -= 2;
                var43.field5792 = field7257[field7260];
                var43.field5821 = field7257[field7260 + 1];
                class429.method2587(var43, (byte) -63);
                return;
            }
            if (arg0 == 1210) {
                field7260 -= 4;
                var43.field5794 = field7257[field7260];
                var43.field5779 = field7257[field7260 + 1];
                if (field7257[field7260 + 2] == 1) {
                    var43.field5785 = 9;
                } else {
                    var43.field5785 = 8;
                }
                if (field7257[field7260 + 3] == 1) {
                    var43.field5739 = true;
                } else {
                    var43.field5739 = false;
                }
                if (var43.field5777 == -1) {
                    class248.method1608(-109, var43.field5700);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field5785 = 5;
                var43.field5794 = class174.field2806;
                var43.field5779 = 0;
                if (var43.field5777 == -1) {
                    class248.method1608(-116, var43.field5700);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class388 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class271.method1716(27411, field7257[--field7260]);
                } else {
                    var58 = arg1 ? field7242 : field7265;
                }
                String var59 = field7252[--field7256];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field7257[--field7260];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field7257[--field7260];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field7252[--field7256];
                    } else {
                        var62[var63] = Integer.valueOf(field7257[--field7260]);
                    }
                }
                int var64 = field7257[--field7260];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field5832 = var62;
                } else if (arg0 == 1401) {
                    var58.field5670 = var62;
                } else if (arg0 == 1402) {
                    var58.field5680 = var62;
                } else if (arg0 == 1403) {
                    var58.field5790 = var62;
                } else if (arg0 == 1404) {
                    var58.field5812 = var62;
                } else if (arg0 == 1405) {
                    var58.field5773 = var62;
                } else if (arg0 == 1406) {
                    var58.field5753 = var62;
                } else if (arg0 == 1407) {
                    var58.field5829 = var62;
                    var58.field5687 = var60;
                } else if (arg0 == 1408) {
                    var58.field5828 = var62;
                } else if (arg0 == 1409) {
                    var58.field5686 = var62;
                } else if (arg0 == 1410) {
                    var58.field5683 = var62;
                } else if (arg0 == 1411) {
                    var58.field5692 = var62;
                } else if (arg0 == 1412) {
                    var58.field5756 = var62;
                } else if (arg0 == 1414) {
                    var58.field5682 = var62;
                    var58.field5695 = var60;
                } else if (arg0 == 1415) {
                    var58.field5711 = var62;
                    var58.field5748 = var60;
                } else if (arg0 == 1416) {
                    var58.field5754 = var62;
                } else if (arg0 == 1417) {
                    var58.field5774 = var62;
                } else if (arg0 == 1418) {
                    var58.field5746 = var62;
                } else if (arg0 == 1419) {
                    var58.field5713 = var62;
                } else if (arg0 == 1420) {
                    var58.field5815 = var62;
                } else if (arg0 == 1421) {
                    var58.field5705 = var62;
                } else if (arg0 == 1422) {
                    var58.field5673 = var62;
                } else if (arg0 == 1423) {
                    var58.field5703 = var62;
                } else if (arg0 == 1424) {
                    var58.field5772 = var62;
                } else if (arg0 == 1425) {
                    var58.field5735 = var62;
                } else if (arg0 == 1426) {
                    var58.field5830 = var62;
                } else if (arg0 == 1427) {
                    var58.field5799 = var62;
                } else if (arg0 == 1428) {
                    var58.field5808 = var62;
                    var58.field5743 = var60;
                } else if (arg0 == 1429) {
                    var58.field5671 = var62;
                    var58.field5831 = var60;
                } else if (arg0 == 1430) {
                    var58.field5667 = var62;
                }
                var58.field5732 = true;
                return;
            }
            if (arg0 < 1600) {
                class388 var65 = arg1 ? field7242 : field7265;
                if (arg0 == 1500) {
                    field7257[field7260++] = var65.field5701;
                    return;
                }
                if (arg0 == 1501) {
                    field7257[field7260++] = var65.field5778;
                    return;
                }
                if (arg0 == 1502) {
                    field7257[field7260++] = var65.field5745;
                    return;
                }
                if (arg0 == 1503) {
                    field7257[field7260++] = var65.field5712;
                    return;
                }
                if (arg0 == 1504) {
                    field7257[field7260++] = var65.field5736 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7257[field7260++] = var65.field5728;
                    return;
                }
                if (arg0 == 1506) {
                    class388 var66 = class368.method2257(-75, var65);
                    field7257[field7260++] = var66 == null ? -1 : var66.field5700;
                    return;
                }
            } else if (arg0 < 1700) {
                class388 var67 = arg1 ? field7242 : field7265;
                if (arg0 == 1600) {
                    field7257[field7260++] = var67.field5782;
                    return;
                }
                if (arg0 == 1601) {
                    field7257[field7260++] = var67.field5740;
                    return;
                }
                if (arg0 == 1602) {
                    field7252[field7256++] = var67.field5725;
                    return;
                }
                if (arg0 == 1603) {
                    field7257[field7260++] = var67.field5721;
                    return;
                }
                if (arg0 == 1604) {
                    field7257[field7260++] = var67.field5758;
                    return;
                }
                if (arg0 == 1605) {
                    field7257[field7260++] = var67.field5719;
                    return;
                }
                if (arg0 == 1606) {
                    field7257[field7260++] = var67.field5675;
                    return;
                }
                if (arg0 == 1607) {
                    field7257[field7260++] = var67.field5696;
                    return;
                }
                if (arg0 == 1608) {
                    field7257[field7260++] = var67.field5716;
                    return;
                }
                if (arg0 == 1609) {
                    field7257[field7260++] = var67.field5722;
                    return;
                }
                if (arg0 == 1610) {
                    field7257[field7260++] = var67.field5684;
                    return;
                }
                if (arg0 == 1611) {
                    field7257[field7260++] = var67.field5708;
                    return;
                }
                if (arg0 == 1612) {
                    field7257[field7260++] = var67.field5795;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field7257[--field7260];
                    class247 var69 = class453.field6727.method460(var68, -18297);
                    if (var69.method1602(115)) {
                        field7252[field7256++] = var67.method2384(var68, var69.field3810, 0);
                        return;
                    }
                    field7257[field7260++] = var67.method2392(var69.field3809, (byte) 48, var68);
                    return;
                }
            } else if (arg0 < 1800) {
                class388 var70 = arg1 ? field7242 : field7265;
                if (arg0 == 1700) {
                    field7257[field7260++] = var70.field5688;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field5688 != -1) {
                        field7257[field7260++] = var70.field5776;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7257[field7260++] = var70.field5777;
                    return;
                }
            } else if (arg0 < 1900) {
                class388 var71 = arg1 ? field7242 : field7265;
                if (arg0 == 1800) {
                    field7257[field7260++] = client.method1371(var71).method881(20740);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field7257[--field7260];
                    int var334 = var72 - 1;
                    if (var71.field5731 != null && var334 < var71.field5731.length && var71.field5731[var334] != null) {
                        field7252[field7256++] = var71.field5731[var334];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field5729 == null) {
                        field7252[field7256++] = "";
                        return;
                    }
                    field7252[field7256++] = var71.field5729;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class388 var332;
                if (arg0 >= 2000) {
                    var332 = class271.method1716(27411, field7257[--field7260]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field7242 : field7265;
                }
                if (field7270 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field5799 == null) {
                        return;
                    }
                    class322 var333 = new class322();
                    var333.field4918 = var332;
                    var333.field4911 = var332.field5799;
                    var333.field4920 = field7270 + 1;
                    class212.field3376.method1885(false, var333);
                    return;
                }
            } else if (arg0 < 2600) {
                class388 var73 = class271.method1716(27411, field7257[--field7260]);
                if (arg0 == 2500) {
                    field7257[field7260++] = var73.field5701;
                    return;
                }
                if (arg0 == 2501) {
                    field7257[field7260++] = var73.field5778;
                    return;
                }
                if (arg0 == 2502) {
                    field7257[field7260++] = var73.field5745;
                    return;
                }
                if (arg0 == 2503) {
                    field7257[field7260++] = var73.field5712;
                    return;
                }
                if (arg0 == 2504) {
                    field7257[field7260++] = var73.field5736 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7257[field7260++] = var73.field5728;
                    return;
                }
                if (arg0 == 1506) {
                    class388 var74 = class368.method2257(-104, var73);
                    field7257[field7260++] = var74 == null ? -1 : var74.field5700;
                    return;
                }
            } else if (arg0 < 2700) {
                class388 var75 = class271.method1716(27411, field7257[--field7260]);
                if (arg0 == 2600) {
                    field7257[field7260++] = var75.field5782;
                    return;
                }
                if (arg0 == 2601) {
                    field7257[field7260++] = var75.field5740;
                    return;
                }
                if (arg0 == 2602) {
                    field7252[field7256++] = var75.field5725;
                    return;
                }
                if (arg0 == 2603) {
                    field7257[field7260++] = var75.field5721;
                    return;
                }
                if (arg0 == 2604) {
                    field7257[field7260++] = var75.field5758;
                    return;
                }
                if (arg0 == 2605) {
                    field7257[field7260++] = var75.field5719;
                    return;
                }
                if (arg0 == 2606) {
                    field7257[field7260++] = var75.field5675;
                    return;
                }
                if (arg0 == 2607) {
                    field7257[field7260++] = var75.field5696;
                    return;
                }
                if (arg0 == 2608) {
                    field7257[field7260++] = var75.field5716;
                    return;
                }
                if (arg0 == 2609) {
                    field7257[field7260++] = var75.field5722;
                    return;
                }
                if (arg0 == 2610) {
                    field7257[field7260++] = var75.field5684;
                    return;
                }
                if (arg0 == 2611) {
                    field7257[field7260++] = var75.field5708;
                    return;
                }
                if (arg0 == 2612) {
                    field7257[field7260++] = var75.field5795;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class388 var76 = class271.method1716(27411, field7257[--field7260]);
                    field7257[field7260++] = var76.field5688;
                    return;
                }
                if (arg0 == 2701) {
                    class388 var77 = class271.method1716(27411, field7257[--field7260]);
                    if (var77.field5688 != -1) {
                        field7257[field7260++] = var77.field5776;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var78 = field7257[--field7260];
                    class141 var79 = (class141) class470.field6975.method1622((long) var78, 88);
                    if (var79 != null) {
                        field7257[field7260++] = 1;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class388 var80 = class271.method1716(27411, field7257[--field7260]);
                    if (var80.field5819 == null) {
                        field7257[field7260++] = 0;
                        return;
                    }
                    int var81 = var80.field5819.length;
                    for (int var82 = 0; var82 < var80.field5819.length; var82++) {
                        if (var80.field5819[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field7257[field7260++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field7260 -= 2;
                    int var83 = field7257[field7260];
                    int var84 = field7257[field7260 + 1];
                    class141 var85 = (class141) class470.field6975.method1622((long) var83, -103);
                    if (var85 != null && var85.field2342 == var84) {
                        field7257[field7260++] = 1;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class388 var86 = class271.method1716(27411, field7257[--field7260]);
                if (arg0 == 2800) {
                    field7257[field7260++] = client.method1371(var86).method881(20740);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field7257[--field7260];
                    int var335 = var87 - 1;
                    if (var86.field5731 != null && var335 < var86.field5731.length && var86.field5731[var335] != null) {
                        field7252[field7256++] = var86.field5731[var335];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field5729 == null) {
                        field7252[field7256++] = "";
                        return;
                    }
                    field7252[field7256++] = var86.field5729;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field7252[--field7256];
                    class475.method2843((byte) -98, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field7260 -= 2;
                    class430.method2591(field7257[field7260 + 1], field7257[field7260], class15.field266, false);
                    return;
                }
                if (arg0 == 3103) {
                    class65.method572(true, 82);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field7252[--field7256];
                    int var90 = 0;
                    if (class257.method1657(var89, true)) {
                        var90 = class19.method129(-108, var89);
                    }
                    field7255++;
                    class459.method2765(class202.field3259, (byte) 87);
                    class335.field5062.method1862((byte) -115, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field7252[--field7256];
                    field7244++;
                    class459.method2765(class198.field3194, (byte) 87);
                    class335.field5062.method1814(var91.length() + 1, true);
                    class335.field5062.method1821(var91, 127);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field7252[--field7256];
                    field7251++;
                    class459.method2765(class316.field4799, (byte) 87);
                    class335.field5062.method1814(var92.length() + 1, true);
                    class335.field5062.method1821(var92, 123);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field7257[--field7260];
                    String var94 = field7252[--field7256];
                    class99.method886(-8, var93, var94);
                    return;
                }
                if (arg0 == 3108) {
                    field7260 -= 3;
                    int var95 = field7257[field7260];
                    int var96 = field7257[field7260 + 1];
                    int var97 = field7257[field7260 + 2];
                    class388 var98 = class271.method1716(27411, var97);
                    class515.method3070(false, var96, var98, var95);
                    return;
                }
                if (arg0 == 3109) {
                    field7260 -= 2;
                    int var99 = field7257[field7260];
                    int var100 = field7257[field7260 + 1];
                    class388 var101 = arg1 ? field7242 : field7265;
                    class515.method3070(false, var100, var101, var99);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field7257[--field7260];
                    field7246++;
                    class459.method2765(class509.field7424, (byte) 87);
                    class335.field5062.method1865(var102, 812856296);
                    return;
                }
                if (arg0 == 3111) {
                    field7260 -= 2;
                    int var103 = field7257[field7260];
                    int var104 = field7257[field7260 + 1];
                    class141 var105 = (class141) class470.field6975.method1622((long) var103, -112);
                    if (var105 != null) {
                        class86.method797(true, (byte) 92, var105, var105.field2342 != var104);
                    }
                    class377.method2316(3, var103, var104, true, (byte) -4);
                    return;
                }
                if (arg0 == 3112) {
                    field7260--;
                    int var106 = field7257[field7260];
                    class141 var107 = (class141) class470.field6975.method1622((long) var106, 80);
                    if (var107 != null && var107.field2338 == 3) {
                        class86.method797(true, (byte) -32, var107, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class64.method568(0, field7252[--field7256]);
                    return;
                }
                if (arg0 == 3114) {
                    field7260 -= 2;
                    int var108 = field7257[field7260];
                    int var109 = field7257[field7260 + 1];
                    String var110 = field7252[--field7256];
                    class492.method2969("", var109, var110, "", 0, var108);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field7260 -= 3;
                    class175.method1209(field7257[field7260 + 1], 255, field7257[field7260], 8, field7257[field7260 + 2]);
                    return;
                }
                if (arg0 == 3201) {
                    class170.method1190(50, false, 255, field7257[--field7260]);
                    return;
                }
                if (arg0 == 3202) {
                    field7260 -= 2;
                    class154.method1119(field7257[field7260 + 1], 255, 0, field7257[field7260]);
                    return;
                }
                if (arg0 == 3203) {
                    field7260 -= 4;
                    class175.method1209(field7257[field7260 + 1], field7257[field7260 + 3], field7257[field7260], 8, field7257[field7260 + 2]);
                    return;
                }
                if (arg0 == 3204) {
                    field7260 -= 3;
                    class170.method1190(field7257[field7260 + 2], false, field7257[field7260 + 1], field7257[field7260]);
                    return;
                }
                if (arg0 == 3205) {
                    field7260 -= 3;
                    class154.method1119(field7257[field7260 + 1], field7257[field7260 + 2], 0, field7257[field7260]);
                    return;
                }
                if (arg0 == 3206) {
                    field7260 -= 4;
                    class253.method1641(field7257[field7260 + 3], 1, field7257[field7260], field7257[field7260 + 1], field7257[field7260 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7257[field7260++] = class62.field1268;
                    return;
                }
                if (arg0 == 3301) {
                    field7260 -= 2;
                    int var111 = field7257[field7260];
                    int var112 = field7257[field7260 + 1];
                    field7257[field7260++] = class519.method3081(var111, false, var112, -1);
                    return;
                }
                if (arg0 == 3302) {
                    field7260 -= 2;
                    int var113 = field7257[field7260];
                    int var114 = field7257[field7260 + 1];
                    field7257[field7260++] = class455.method2717(false, false, var114, var113);
                    return;
                }
                if (arg0 == 3303) {
                    field7260 -= 2;
                    int var115 = field7257[field7260];
                    int var116 = field7257[field7260 + 1];
                    field7257[field7260++] = class142.method1054(var115, false, var116, true);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field7257[--field7260];
                    field7257[field7260++] = class169.field2755.method2680(5, var117).field2960;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field7257[--field7260];
                    field7257[field7260++] = class499.field7330[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field7257[--field7260];
                    field7257[field7260++] = class327.field4969[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field7257[--field7260];
                    field7257[field7260++] = class519.field7543[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class15.field266.field6084;
                    int var122 = (class15.field266.field6073 >> 7) + class496.field7292;
                    int var123 = (class15.field266.field6078 >> 7) + class212.field3378;
                    field7257[field7260++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field7257[--field7260];
                    field7257[field7260++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field7257[--field7260];
                    field7257[field7260++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field7257[--field7260];
                    field7257[field7260++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7257[field7260++] = class7.field110 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field7260 -= 2;
                    int var127 = field7257[field7260];
                    int var128 = field7257[field7260 + 1];
                    field7257[field7260++] = class519.method3081(var127, true, var128, -1);
                    return;
                }
                if (arg0 == 3314) {
                    field7260 -= 2;
                    int var129 = field7257[field7260];
                    int var130 = field7257[field7260 + 1];
                    field7257[field7260++] = class455.method2717(false, true, var130, var129);
                    return;
                }
                if (arg0 == 3315) {
                    field7260 -= 2;
                    int var131 = field7257[field7260];
                    int var132 = field7257[field7260 + 1];
                    field7257[field7260++] = class142.method1054(var131, true, var132, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class239.field3706 >= 2) {
                        field7257[field7260++] = class239.field3706;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7257[field7260++] = class483.field7115;
                    return;
                }
                if (arg0 == 3318) {
                    field7257[field7260++] = class444.field6606.field3818;
                    return;
                }
                if (arg0 == 3321) {
                    field7257[field7260++] = class373.field5468;
                    return;
                }
                if (arg0 == 3322) {
                    field7257[field7260++] = class353.field5217;
                    return;
                }
                if (arg0 == 3323) {
                    if (class253.field3882 >= 5 && class253.field3882 <= 9) {
                        field7257[field7260++] = 1;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class253.field3882 >= 5 && class253.field3882 <= 9) {
                        field7257[field7260++] = class253.field3882;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7257[field7260++] = class464.field6887 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7257[field7260++] = class15.field266.field5362;
                    return;
                }
                if (arg0 == 3327) {
                    field7257[field7260++] = class15.field266.field5343.field5419 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7257[field7260++] = class410.field6203 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field7257[--field7260];
                    field7257[field7260++] = class499.method3009(var133, -81, false);
                    return;
                }
                if (arg0 == 3331) {
                    field7260 -= 2;
                    int var134 = field7257[field7260];
                    int var135 = field7257[field7260 + 1];
                    field7257[field7260++] = class169.method1185(false, var134, var135, 0, false);
                    return;
                }
                if (arg0 == 3332) {
                    field7260 -= 2;
                    int var136 = field7257[field7260];
                    int var137 = field7257[field7260 + 1];
                    field7257[field7260++] = class169.method1185(false, var136, var137, 0, true);
                    return;
                }
                if (arg0 == 3333) {
                    field7257[field7260++] = class405.field6102;
                    return;
                }
                if (arg0 == 3335) {
                    field7257[field7260++] = class146.field2452;
                    return;
                }
                if (arg0 == 3336) {
                    field7260 -= 4;
                    int var138 = field7257[field7260];
                    int var139 = field7257[field7260 + 1];
                    int var140 = field7257[field7260 + 2];
                    int var141 = field7257[field7260 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field7257[field7260++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field7257[field7260++] = class242.field3745;
                    return;
                }
                if (arg0 == 3338) {
                    field7257[field7260++] = class233.method1535(58);
                    return;
                }
                if (arg0 == 3339) {
                    field7257[field7260++] = class368.field5390 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field7257[field7260++] = class97.field1896 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field7257[field7260++] = class406.field6107 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field7260 -= 2;
                    int var145 = field7257[field7260];
                    int var146 = field7257[field7260 + 1];
                    class450 var147 = class370.field5440.method1386(var145, 102);
                    field7252[field7256++] = var147.method2690((byte) -35, var146);
                    return;
                }
                if (arg0 == 3408) {
                    field7260 -= 4;
                    int var148 = field7257[field7260];
                    int var149 = field7257[field7260 + 1];
                    int var150 = field7257[field7260 + 2];
                    int var151 = field7257[field7260 + 3];
                    class450 var152 = class370.field5440.method1386(var150, 123);
                    if (var152.field6689 == var148 && var152.field6683 == var149) {
                        if (var149 == 115) {
                            field7252[field7256++] = var152.method2690((byte) -35, var151);
                            return;
                        }
                        field7257[field7260++] = var152.method2687((byte) -82, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field7260 -= 3;
                    int var153 = field7257[field7260];
                    int var154 = field7257[field7260 + 1];
                    int var155 = field7257[field7260 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class450 var156 = class370.field5440.method1386(var154, 127);
                    if (var156.field6683 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7257[field7260++] = var156.method2692((byte) 76, var155) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field7257[--field7260];
                    String var158 = field7252[--field7256];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class450 var159 = class370.field5440.method1386(var157, 109);
                    if (var159.field6683 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7257[field7260++] = var159.method2689(123, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field7257[--field7260];
                    class450 var161 = class370.field5440.method1386(var160, 113);
                    field7257[field7260++] = var161.field6695.method1611((byte) -21);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class199.field3234 == 0) {
                        field7257[field7260++] = -2;
                        return;
                    }
                    if (class199.field3234 == 1) {
                        field7257[field7260++] = -1;
                        return;
                    }
                    field7257[field7260++] = class513.field7453;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field7257[--field7260];
                    if (class199.field3234 == 2 && var162 < class513.field7453) {
                        field7252[field7256++] = class330.field5008[var162];
                        if (class59.field1232[var162] != null) {
                            field7252[field7256++] = class59.field1232[var162];
                            return;
                        }
                        field7252[field7256++] = "";
                        return;
                    }
                    field7252[field7256++] = "";
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field7257[--field7260];
                    if (class199.field3234 == 2 && var163 < class513.field7453) {
                        field7257[field7260++] = class207.field3317[var163];
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field7257[--field7260];
                    if (class199.field3234 == 2 && var164 < class513.field7453) {
                        field7257[field7260++] = class498.field7315[var164];
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field7252[--field7256];
                    int var166 = field7257[--field7260];
                    class529.method3137(var166, var165, 125);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field7252[--field7256];
                    class370.method2269(var167, (byte) 112);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field7252[--field7256];
                    class389.method2400((byte) 78, var168);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field7252[--field7256];
                    class136.method1031(-1, false, var169);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field7252[--field7256];
                    class207.method1421(var170, true);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field7252[--field7256];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field7257[field7260++] = class214.method1445(var171, -18) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field7257[--field7260];
                    if (class199.field3234 == 2 && var172 < class513.field7453) {
                        field7252[field7256++] = class296.field4497[var172];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class110.field2021 != null) {
                        field7252[field7256++] = class122.method981(-114, class110.field2021);
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class110.field2021 != null) {
                        field7257[field7260++] = class332.field5047;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field7257[--field7260];
                    if (class110.field2021 != null && var173 < class332.field5047) {
                        field7252[field7256++] = class384.field5610[var173].field6259;
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field7257[--field7260];
                    if (class110.field2021 != null && var174 < class332.field5047) {
                        field7257[field7260++] = class384.field5610[var174].field6260;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field7257[--field7260];
                    if (class110.field2021 != null && var175 < class332.field5047) {
                        field7257[field7260++] = class384.field5610[var175].field6265;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7257[field7260++] = class404.field6099;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field7252[--field7256];
                    class391.method2416(127, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field7257[field7260++] = class433.field6454;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field7252[--field7256];
                    class80.method711(3, var177);
                    return;
                }
                if (arg0 == 3620) {
                    class77.method687((byte) 41);
                    return;
                }
                if (arg0 == 3621) {
                    if (class199.field3234 == 0) {
                        field7257[field7260++] = -1;
                        return;
                    }
                    field7257[field7260++] = class172.field2777;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field7257[--field7260];
                    if (class199.field3234 != 0 && var178 < class172.field2777) {
                        field7252[field7256++] = class395.field6015[var178];
                        if (class143.field2380[var178] != null) {
                            field7252[field7256++] = class143.field2380[var178];
                            return;
                        }
                        field7252[field7256++] = "";
                        return;
                    }
                    field7252[field7256++] = "";
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field7252[--field7256];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field7257[field7260++] = class517.method3073(true, var179) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field7257[--field7260];
                    if (class384.field5610 != null && var180 < class332.field5047 && class384.field5610[var180].field6261.equalsIgnoreCase(class15.field266.field5381)) {
                        field7257[field7260++] = 1;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class291.field4446 != null) {
                        field7252[field7256++] = class291.field4446;
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field7257[--field7260];
                    if (class110.field2021 != null && var181 < class332.field5047) {
                        field7252[field7256++] = class384.field5610[var181].field6263;
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field7257[--field7260];
                    if (class199.field3234 == 2 && var182 >= 0 && var182 < class513.field7453) {
                        field7257[field7260++] = class114.field2064[var182] ? 1 : 0;
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field7252[--field7256];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field7257[field7260++] = class341.method2151(var183, -29887);
                    return;
                }
                if (arg0 == 3629) {
                    field7257[field7260++] = class439.field6524;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field7252[--field7256];
                    class136.method1031(-1, true, var184);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field7257[--field7260];
                    field7257[field7260++] = class407.field6170[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field7257[--field7260];
                    if (class110.field2021 != null && var186 < class332.field5047) {
                        field7252[field7256++] = class384.field5610[var186].field6261;
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field7257[--field7260];
                    if (class199.field3234 != 0 && var187 < class172.field2777) {
                        field7252[field7256++] = class52.field1118[var187];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var188].method2620(-14661);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var189].field6512;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var190].field6522;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var191].field6514;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var192].field6518;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field7257[--field7260];
                    field7257[field7260++] = class140.field2337[var193].field6515;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field7257[--field7260];
                    int var195 = class140.field2337[var194].method2621(25569);
                    field7257[field7260++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field7257[--field7260];
                    int var197 = class140.field2337[var196].method2621(25569);
                    field7257[field7260++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field7257[--field7260];
                    int var199 = class140.field2337[var198].method2621(25569);
                    field7257[field7260++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field7257[--field7260];
                    int var201 = class140.field2337[var200].method2621(25569);
                    field7257[field7260++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field7260 -= 2;
                    int var202 = field7257[field7260];
                    int var203 = field7257[field7260 + 1];
                    field7257[field7260++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field7260 -= 2;
                    int var204 = field7257[field7260];
                    int var205 = field7257[field7260 + 1];
                    field7257[field7260++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field7260 -= 2;
                    int var206 = field7257[field7260];
                    int var207 = field7257[field7260 + 1];
                    field7257[field7260++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field7260 -= 2;
                    int var208 = field7257[field7260];
                    int var209 = field7257[field7260 + 1];
                    field7257[field7260++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field7257[--field7260];
                    field7257[field7260++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field7257[--field7260];
                    field7257[field7260++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field7260 -= 5;
                    int var212 = field7257[field7260];
                    int var213 = field7257[field7260 + 1];
                    int var214 = field7257[field7260 + 2];
                    int var215 = field7257[field7260 + 3];
                    int var216 = field7257[field7260 + 4];
                    field7257[field7260++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field7260 -= 2;
                    long var217 = (long) field7257[field7260];
                    long var219 = (long) field7257[field7260 + 1];
                    field7257[field7260++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field7260 -= 2;
                    int var221 = field7257[field7260];
                    int var222 = field7257[field7260 + 1];
                    field7257[field7260++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field7260 -= 2;
                    int var223 = field7257[field7260];
                    int var224 = field7257[field7260 + 1];
                    field7257[field7260++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field7260 -= 2;
                    int var225 = field7257[field7260];
                    int var226 = field7257[field7260 + 1];
                    field7257[field7260++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field7260 -= 2;
                    int var227 = field7257[field7260];
                    int var228 = field7257[field7260 + 1];
                    field7257[field7260++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field7260 -= 2;
                    int var229 = field7257[field7260];
                    int var230 = field7257[field7260 + 1];
                    if (var229 == 0) {
                        field7257[field7260++] = 0;
                        return;
                    }
                    field7257[field7260++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field7260 -= 2;
                    int var231 = field7257[field7260];
                    int var232 = field7257[field7260 + 1];
                    if (var231 == 0) {
                        field7257[field7260++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field7257[field7260++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7257[field7260++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field7260 -= 2;
                    int var233 = field7257[field7260];
                    int var234 = field7257[field7260 + 1];
                    field7257[field7260++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field7260 -= 2;
                    int var235 = field7257[field7260];
                    int var236 = field7257[field7260 + 1];
                    field7257[field7260++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field7260 -= 2;
                    int var237 = field7257[field7260];
                    int var238 = field7257[field7260 + 1];
                    field7257[field7260++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field7260 -= 2;
                    int var239 = field7257[field7260];
                    int var240 = field7257[field7260 + 1];
                    field7257[field7260++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field7260 -= 3;
                    long var241 = (long) field7257[field7260];
                    long var243 = (long) field7257[field7260 + 1];
                    long var245 = (long) field7257[field7260 + 2];
                    field7257[field7260++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field7252[--field7256];
                    int var248 = field7257[--field7260];
                    field7252[field7256++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field7256 -= 2;
                    String var249 = field7252[field7256];
                    String var250 = field7252[field7256 + 1];
                    field7252[field7256++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field7252[--field7256];
                    int var252 = field7257[--field7260];
                    field7252[field7256++] = var251 + class377.method2315(var252, true, 116);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field7252[--field7256];
                    field7252[field7256++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7252[field7256++] = method2983(field7257[--field7260]);
                    return;
                }
                if (arg0 == 4105) {
                    field7256 -= 2;
                    String var254 = field7252[field7256];
                    String var255 = field7252[field7256 + 1];
                    if (class15.field266.field5343 != null && class15.field266.field5343.field5419) {
                        field7252[field7256++] = var255;
                        return;
                    }
                    field7252[field7256++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field7257[--field7260];
                    field7252[field7256++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field7256 -= 2;
                    field7257[field7260++] = class490.method2959(field7252[field7256], class146.field2452, (byte) 62, field7252[field7256 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field7252[--field7256];
                    field7260 -= 2;
                    int var258 = field7257[field7260];
                    int var259 = field7257[field7260 + 1];
                    class470 var260 = class299.method1929(0, var259, 71, class483.field7117);
                    field7257[field7260++] = var260.method2815(var257, 84, class420.field6340, var258);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field7252[--field7256];
                    field7260 -= 2;
                    int var262 = field7257[field7260];
                    int var263 = field7257[field7260 + 1];
                    class470 var264 = class299.method1929(0, var263, 94, class483.field7117);
                    field7257[field7260++] = var264.method2813(class420.field6340, var262, true, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field7256 -= 2;
                    String var265 = field7252[field7256];
                    String var266 = field7252[field7256 + 1];
                    if (field7257[--field7260] == 1) {
                        field7252[field7256++] = var265;
                        return;
                    }
                    field7252[field7256++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field7252[--field7256];
                    field7252[field7256++] = class231.method1524(var267, (byte) -84);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field7252[--field7256];
                    int var269 = field7257[--field7260];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7252[field7256++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field7257[--field7260];
                    field7257[field7260++] = class19.method130(-26128, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field7257[--field7260];
                    field7257[field7260++] = class373.method2289(48, (char) var271) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field7257[--field7260];
                    field7257[field7260++] = class100.method889((char) var272, -123) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field7257[--field7260];
                    field7257[field7260++] = class372.method2284((char) var273, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field7252[--field7256];
                    if (var274 != null) {
                        field7257[field7260++] = var274.length();
                        return;
                    }
                    field7257[field7260++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field7252[--field7256];
                    field7260 -= 2;
                    int var276 = field7257[field7260];
                    int var277 = field7257[field7260 + 1];
                    field7252[field7256++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field7252[--field7256];
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
                    field7252[field7256++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field7252[--field7256];
                    field7260 -= 2;
                    int var284 = field7257[field7260];
                    int var285 = field7257[field7260 + 1];
                    field7257[field7260++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field7256 -= 2;
                    String var286 = field7252[field7256];
                    String var287 = field7252[field7256 + 1];
                    int var288 = field7257[--field7260];
                    field7257[field7260++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field7257[--field7260];
                    field7257[field7260++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field7257[--field7260];
                    field7257[field7260++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field7257[--field7260] != 0;
                    int var292 = field7257[--field7260];
                    field7252[field7256++] = class519.method3080((long) var292, var291, 3, class146.field2452, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field7252[--field7256];
                    int var294 = field7257[--field7260];
                    class470 var295 = class299.method1929(0, var294, 102, class483.field7117);
                    field7257[field7260++] = var295.method2811(class420.field6340, var293, true);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field7257[--field7260];
                    field7252[field7256++] = class135.field2271.method1636(var296, -108).field192;
                    return;
                }
                if (arg0 == 4201) {
                    field7260 -= 2;
                    int var297 = field7257[field7260];
                    int var298 = field7257[field7260 + 1];
                    class12 var299 = class135.field2271.method1636(var297, -107);
                    if (var298 >= 1 && var298 <= 5 && var299.field164[var298 - 1] != null) {
                        field7252[field7256++] = var299.field164[var298 - 1];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field7260 -= 2;
                    int var300 = field7257[field7260];
                    int var301 = field7257[field7260 + 1];
                    class12 var302 = class135.field2271.method1636(var300, -111);
                    if (var301 >= 1 && var301 <= 5 && var302.field199[var301 - 1] != null) {
                        field7252[field7256++] = var302.field199[var301 - 1];
                        return;
                    }
                    field7252[field7256++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field7257[--field7260];
                    field7257[field7260++] = class135.field2271.method1636(var303, -108).field193;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field7257[--field7260];
                    field7257[field7260++] = class135.field2271.method1636(var304, -104).field200 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field7257[--field7260];
                    class12 var306 = class135.field2271.method1636(var305, -113);
                    if (var306.field163 == -1 && var306.field197 >= 0) {
                        field7257[field7260++] = var306.field197;
                        return;
                    }
                    field7257[field7260++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field7257[--field7260];
                    class12 var308 = class135.field2271.method1636(var307, -106);
                    if (var308.field163 >= 0 && var308.field197 >= 0) {
                        field7257[field7260++] = var308.field197;
                        return;
                    }
                    field7257[field7260++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field7257[--field7260];
                    field7257[field7260++] = class135.field2271.method1636(var309, -106).field183 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field7260 -= 2;
                    int var310 = field7257[field7260];
                    int var311 = field7257[field7260 + 1];
                    class247 var312 = class453.field6727.method460(var311, -18297);
                    if (var312.method1602(115)) {
                        field7252[field7256++] = class135.field2271.method1636(var310, -123).method65(0, var311, var312.field3810);
                        return;
                    }
                    field7257[field7260++] = class135.field2271.method1636(var310, -106).method78(true, var312.field3809, var311);
                    return;
                }
                if (arg0 == 4209) {
                    field7260 -= 2;
                    int var313 = field7257[field7260];
                    int var314 = field7257[field7260 + 1] - 1;
                    class12 var315 = class135.field2271.method1636(var313, -124);
                    if (var315.field190 == var314) {
                        field7257[field7260++] = var315.field207;
                        return;
                    }
                    if (var315.field187 == var314) {
                        field7257[field7260++] = var315.field231;
                        return;
                    }
                    field7257[field7260++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field7252[--field7256];
                    int var317 = field7257[--field7260];
                    class276.method1742((byte) -75, var316, var317 == 1);
                    field7257[field7260++] = class207.field3324;
                    return;
                }
                if (arg0 == 4211) {
                    if (class274.field4165 != null && class283.field4266 < class207.field3324) {
                        field7257[field7260++] = class274.field4165[class283.field4266++] & 0xFFFF;
                        return;
                    }
                    field7257[field7260++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class283.field4266 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field7260 -= 2;
                    int var318 = field7257[field7260];
                    int var319 = field7257[field7260 + 1];
                    class247 var320 = class453.field6727.method460(var319, -18297);
                    if (var320.method1602(115)) {
                        field7252[field7256++] = class102.field1942.method847(var318, 0).method477(true, var320.field3810, var319);
                        return;
                    }
                    field7257[field7260++] = class102.field1942.method847(var318, 0).method478(var320.field3809, -10957, var319);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field7260 -= 2;
                    int var321 = field7257[field7260];
                    int var322 = field7257[field7260 + 1];
                    class247 var323 = class453.field6727.method460(var322, -18297);
                    if (var323.method1602(115)) {
                        field7252[field7256++] = class123.field2142.method1530((byte) -94, var321).method1958((byte) -106, var322, var323.field3810);
                        return;
                    }
                    field7257[field7260++] = class123.field2142.method1530((byte) -37, var321).method1954(var323.field3809, -3687, var322);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field7260 -= 2;
                    int var324 = field7257[field7260];
                    int var325 = field7257[field7260 + 1];
                    class247 var326 = class453.field6727.method460(var325, -18297);
                    if (var326.method1602(115)) {
                        field7252[field7256++] = class60.field1255.method975((byte) -75, var324).method2639(var326.field3810, var325, 8);
                        return;
                    }
                    field7257[field7260++] = class60.field1255.method975((byte) -75, var324).method2636(var326.field3809, var325, (byte) 82);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field7257[--field7260];
                class166 var328 = class452.field6708.method2457(var327, -56);
                if (var328.field2656 != null && var328.field2656.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field2675[0];
                    for (int var331 = 1; var331 < var328.field2656.length; var331++) {
                        if (var328.field2675[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field2675[var331];
                        }
                    }
                    field7257[field7260++] = var328.field2656[var329];
                    return;
                }
                field7257[field7260++] = var328.field2668;
                return;
            }
        } else {
            class388 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class271.method1716(27411, field7257[--field7260]);
            } else {
                var47 = arg1 ? field7242 : field7265;
            }
            if (arg0 == 1300) {
                int var48 = field7257[--field7260] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2391(var48, field7252[--field7256], 0);
                    return;
                } else {
                    field7256--;
                    return;
                }
            }
            if (arg0 == 1301) {
                field7260 -= 2;
                int var49 = field7257[field7260];
                int var50 = field7257[field7260 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field5825 = null;
                    return;
                }
                var47.field5825 = class447.method2677(var50, 0, var49);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field7257[--field7260];
                if (class479.field7067 != var51 && class210.field3348 != var51 && class94.field1858 != var51) {
                    return;
                }
                var47.field5750 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field5714 = field7257[--field7260];
                return;
            }
            if (arg0 == 1304) {
                var47.field5797 = field7257[--field7260];
                return;
            }
            if (arg0 == 1305) {
                var47.field5729 = field7252[--field7256];
                return;
            }
            if (arg0 == 1306) {
                var47.field5807 = field7252[--field7256];
                return;
            }
            if (arg0 == 1307) {
                var47.field5731 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field5681 = field7257[--field7260];
                var47.field5738 = field7257[--field7260];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field7257[--field7260];
                int var53 = field7257[--field7260];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2379((byte) -124, var52, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field5749 = field7252[--field7256];
                return;
            }
            if (arg0 == 1311) {
                var47.field5816 = field7257[--field7260];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field7260 -= 3;
                    var54 = field7257[field7260] - 1;
                    var55 = field7257[field7260 + 1];
                    var56 = field7257[field7260 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7260 -= 2;
                    var54 = 10;
                    var55 = field7257[field7260];
                    var56 = field7257[field7260 + 1];
                }
                if (var47.field5720 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field5720 = new byte[11];
                    var47.field5668 = new byte[11];
                    var47.field5788 = new int[11];
                }
                var47.field5720[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field5766 = false;
                    for (int var57 = 0; var57 < var47.field5720.length; var57++) {
                        if (var47.field5720[var57] != 0) {
                            var47.field5766 = true;
                            break;
                        }
                    }
                } else {
                    var47.field5766 = true;
                }
                var47.field5668[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field5775 = field7257[--field7260];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V", line = 7730)
    private static final void method2991(int arg0) {
        class388 var1 = class271.method1716(27411, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class388[] var3 = class329.field4994[var2];
        if (var3 == null) {
            class388[] var4 = class419.field6326[var2];
            int var5 = var4.length;
            var3 = class329.field4994[var2] = new class388[var5];
            class394.method2453(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class394.method2453(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lcd;II)V", line = 7770)
    public static final void method2992(class208 arg0, int arg1, int arg2) {
        class384 var3 = class108.method920(arg0, arg1, arg2, true);
        if (var3 == null) {
            return;
        }
        field7266 = new int[var3.field5616];
        field7253 = new String[var3.field5612];
        if (class417.field6287 == var3.field5604 || class460.field6859 == var3.field5604 || class102.field1945 == var3.field5604) {
            int var4 = 0;
            int var5 = 0;
            if (class67.field1371 != null) {
                var4 = class67.field1371.field5701;
                var5 = class67.field1371.field5778;
            }
            field7266[0] = class393.field5991.method132(82) - var4;
            field7266[1] = class393.field5991.method139(-84) - var5;
        }
        method2986(var3, 200000);
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(IZ)V", line = 7795)
    public static final void method2993(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V", line = 7801)
    private static final void method2994(int arg0) {
        class388 var1 = class271.method1716(27411, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class388[] var3 = class329.field4994[var2];
        if (var3 == null) {
            class388[] var4 = class419.field6326[var2];
            int var5 = var4.length;
            var3 = class329.field4994[var2] = new class388[var5];
            class394.method2453(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class394.method2453(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
