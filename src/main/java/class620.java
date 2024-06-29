import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class620 {

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field8391 = new String[1000];

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "[[I")
    private static int[][] field8394 = new int[5][5000];

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "[I")
    private static int[] field8402 = new int[1000];

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    private static int field8406 = 0;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
    private static int field8395 = 0;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    private static int field8407 = 0;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "[Lwfa;")
    private static class187[] field8409 = new class187[50];

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "[I")
    private static int[] field8403 = new int[5];

    @OriginalMember(owner = "client!rda", name = "y", descriptor = "Ljava/util/Calendar;")
    private static Calendar field8412 = Calendar.getInstance();

    @OriginalMember(owner = "client!rda", name = "z", descriptor = "[I")
    private static int[] field8413 = new int[3];

    @OriginalMember(owner = "client!rda", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field8414 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rda", name = "B", descriptor = "Lhm;")
    public static class208 field8415 = new class208(4);

    @OriginalMember(owner = "client!rda", name = "C", descriptor = "I")
    private static int field8416 = 0;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!rda", name = "x", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "Lrr;")
    private static class337 field8396;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Lrr;")
    private static class337 field8399;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "Lqi;")
    private static class532 field8400;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "[I")
    private static int[] field8408;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "[Ljava/lang/String;")
    private static String[] field8393;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3449(int arg0) {
        if (arg0 == -1 || !class409.method2299((byte) -40, arg0)) {
            return;
        }
        class337[] var1 = class325.field4062[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class337 var3 = var1[var2];
            if (var3.field4236 != null) {
                class402 var4 = new class402();
                var4.field5154 = var3;
                var4.field5153 = var3.field4236;
                method3456(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lst;)V", line = 34)
    public static final void method3450(class402 arg0) {
        method3456(arg0, 200000);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "()V", line = 38)
    public static void method3451() {
        field8408 = null;
        field8393 = null;
        field8403 = null;
        field8394 = null;
        field8402 = null;
        field8391 = null;
        field8409 = null;
        field8399 = null;
        field8396 = null;
        field8400 = null;
        field8412 = null;
        field8414 = null;
        field8413 = null;
        field8415 = null;
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V", line = 66)
    private static final void method3452(int arg0) {
        class337 var1 = class442.method2421(arg0, 118);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class337[] var3 = class79.field1035[var2];
        if (var3 == null) {
            class337[] var4 = class325.field4062[var2];
            int var5 = var4.length;
            var3 = class79.field1035[var2] = new class337[var5];
            class70.method553(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class70.method553(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)V", line = 106)
    public static final void method3453(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V", line = 114)
    private static final void method3454(int arg0) {
        class337 var1 = class442.method2421(arg0, 61);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class337[] var3 = class79.field1035[var2];
        if (var3 == null) {
            class337[] var4 = class325.field4062[var2];
            int var5 = var4.length;
            var3 = class79.field1035[var2] = new class337[var5];
            class70.method553(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class70.method553(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)Ljava/lang/String;", line = 156)
    private static final String method3455(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field8412.setTime(new Date(var1));
        int var3 = field8412.get(5);
        int var4 = field8412.get(2);
        int var5 = field8412.get(1);
        return var3 + "-" + field8414[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lst;I)V", line = 168)
    private static final void method3456(class402 arg0, int arg1) {
        Object[] var2 = arg0.field5153;
        int var3 = (Integer) var2[0];
        class317 var4 = class294.method1776(true, var3);
        if (var4 == null) {
            return;
        }
        field8408 = new int[var4.field3973];
        int var5 = 0;
        field8393 = new String[var4.field3969];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5158;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5159;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5154 == null ? -1 : arg0.field5154.field4172;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5162;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5154 == null ? -1 : arg0.field5154.field4310;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5152 == null ? -1 : arg0.field5152.field4172;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5152 == null ? -1 : arg0.field5152.field4310;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5155;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5157;
                }
                field8408[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5160;
                }
                field8393[var6++] = var9;
            }
        }
        field8416 = arg0.field5151;
        method3457(var4, arg1);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljg;I)V", line = 248)
    private static final void method3457(class317 arg0, int arg1) {
        field8395 = 0;
        field8407 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3963;
        int[] var4 = arg0.field3971;
        byte var5 = -1;
        field8406 = 0;
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
                        method3462(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3458(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field8402[field8395++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field8402[field8395++] = class327.field4084.field666[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class327.field4084.method308(var8, field8402[--field8395], 127);
                } else if (var43 == 3) {
                    field8391[field8407++] = arg0.field3968[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field8395 -= 2;
                    if (field8402[field8395 + 1] != field8402[field8395]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field8395 -= 2;
                    if (field8402[field8395 + 1] == field8402[field8395]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field8395 -= 2;
                    if (field8402[field8395] < field8402[field8395 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field8395 -= 2;
                    if (field8402[field8395] > field8402[field8395 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field8406 == 0) {
                        return;
                    }
                    class187 var9 = field8409[--field8406];
                    arg0 = var9.field2209;
                    var3 = arg0.field3963;
                    var4 = arg0.field3971;
                    var2 = var9.field2211;
                    field8408 = var9.field2207;
                    field8393 = var9.field2210;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field8402[field8395++] = class327.field4084.method303((byte) 94, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class327.field4084.method306(var11, field8402[--field8395], -23796);
                } else if (var43 == 31) {
                    field8395 -= 2;
                    if (field8402[field8395] <= field8402[field8395 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field8395 -= 2;
                    if (field8402[field8395] >= field8402[field8395 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field8402[field8395++] = field8408[var4[var2]];
                } else if (var43 == 34) {
                    field8408[var4[var2]] = field8402[--field8395];
                } else if (var43 == 35) {
                    field8391[field8407++] = field8393[var4[var2]];
                } else if (var43 == 36) {
                    field8393[var4[var2]] = field8391[--field8407];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field8407 -= var12;
                    String var13 = class362.method2102(var12, field8407, field8391, (byte) -110);
                    field8391[field8407++] = var13;
                } else if (var43 == 38) {
                    field8395--;
                } else if (var43 == 39) {
                    field8407--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class317 var15 = class294.method1776(true, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3973];
                    String[] var17 = new String[var15.field3969];
                    for (int var18 = 0; var18 < var15.field3962; var18++) {
                        var16[var18] = field8402[field8395 + var18 - var15.field3962];
                    }
                    for (int var19 = 0; var19 < var15.field3964; var19++) {
                        var17[var19] = field8391[field8407 + var19 - var15.field3964];
                    }
                    field8395 -= var15.field3962;
                    field8407 -= var15.field3964;
                    class187 var20 = new class187();
                    var20.field2209 = arg0;
                    var20.field2211 = var2;
                    var20.field2207 = field8408;
                    var20.field2210 = field8393;
                    if (field8406 >= field8409.length) {
                        throw new RuntimeException();
                    }
                    field8409[field8406++] = var20;
                    arg0 = var15;
                    var3 = var15.field3963;
                    var4 = var15.field3971;
                    var2 = -1;
                    field8408 = var16;
                    field8393 = var17;
                } else if (var43 == 42) {
                    field8402[field8395++] = class500.field6238[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class500.field6238[var21] = field8402[--field8395];
                    class26.method162(var21, (byte) 45);
                    class290.field3668 |= class656.field8925[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field8402[--field8395];
                    if (var24 >= 0 && var24 <= 5000) {
                        field8403[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field8394[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field8402[--field8395];
                    if (var28 < 0 || var28 >= field8403[var27]) {
                        throw new RuntimeException();
                    }
                    field8402[field8395++] = field8394[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field8395 -= 2;
                    int var30 = field8402[field8395];
                    if (var30 < 0 || var30 >= field8403[var29]) {
                        throw new RuntimeException();
                    }
                    field8394[var29][var30] = field8402[field8395 + 1];
                } else if (var43 == 47) {
                    String var31 = class523.field6615[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field8391[field8407++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class523.field6615[var32] = field8391[--field8407];
                    class646.method3611(2, var32);
                } else if (var43 == 51) {
                    class694 var33 = arg0.field3970[var4[var2]];
                    class319 var34 = (class319) var33.method3828((long) field8402[--field8395], (byte) -91);
                    if (var34 != null) {
                        var2 += var34.field3990;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3966 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3321).append(" ");
                for (int var41 = field8406 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field8409[var41].field2209.field3321).append(" ");
                }
                var40.append("op: ").append(var5);
                class564.method2994((byte) 34, var40.toString(), var42);
            } else {
                class252.method1521(4, "Clientscript error in: " + arg0.field3966, true);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3966).append("\n");
                for (int var38 = field8406 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field8409[var38].field2209.field3966).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class564.method2994((byte) 34, var37.toString(), var42);
                class8.method28(-1, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)V", line = 683)
    private static final void method3458(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field8402[field8395++] = class646.field8749;
                return;
            }
            if (arg0 == 5001) {
                field8395 -= 3;
                class646.field8749 = field8402[field8395];
                class589.field7907 = class526.method2842(true, field8402[field8395 + 1]);
                if (class589.field7907 == null) {
                    class589.field7907 = class194.field2289;
                }
                class340.field4345 = field8402[field8395 + 2];
                field8389++;
                class124 var2 = class336.method1924(class208.field2472, class636.field8620, (byte) -41);
                var2.field1516.method3090(class646.field8749, 3);
                var2.field1516.method3090(class589.field7907.field8751, 3);
                var2.field1516.method3090(class340.field4345, 3);
                class197.method1156((byte) 102, var2);
                return;
            }
            if (arg0 == 5002) {
                field8407 -= 2;
                String var3 = field8391[field8407];
                String var4 = field8391[field8407 + 1];
                field8395 -= 2;
                int var5 = field8402[field8395];
                int var6 = field8402[field8395 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field8405++;
                class124 var7 = class336.method1924(class74.field976, class636.field8620, (byte) -43);
                var7.field1516.method3090(class680.method3757((byte) 60, var3) + class680.method3757((byte) 60, var4) + 2, 3);
                var7.field1516.method3050(false, var3);
                var7.field1516.method3090(var5 - 1, 3);
                var7.field1516.method3090(var6, 3);
                var7.field1516.method3050(false, var4);
                class197.method1156((byte) 96, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field8402[--field8395];
                class247 var9 = class502.method2727(-1, var8);
                String var10 = "";
                if (var9 != null && var9.field3185 != null) {
                    var10 = var9.field3185;
                }
                field8391[field8407++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field8402[--field8395];
                class247 var12 = class502.method2727(-1, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field3188;
                }
                field8402[field8395++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class589.field7907 == null) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = class589.field7907.field8751;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field8402[--field8395];
                class124 var15 = class336.method1924(class254.field3273, class636.field8620, (byte) -28);
                var15.field1516.method3090(var14, 3);
                class197.method1156((byte) 124, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field8391[--field8407];
                method3460(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field8407 -= 2;
                String var17 = field8391[field8407];
                String var18 = field8391[field8407 + 1];
                if (class146.field1745 != 0 || (!class701.field9811 || class493.field6149) && !class165.field1938) {
                    field8392++;
                    class124 var19 = class336.method1924(class269.field3415, class636.field8620, (byte) 87);
                    var19.field1516.method3090(0, 3);
                    int var20 = var19.field1516.field7313;
                    var19.field1516.method3050(false, var17);
                    class561.method2980((byte) -7, var18, var19.field1516);
                    var19.field1516.method3036((byte) -118, var19.field1516.field7313 - var20);
                    class197.method1156((byte) 84, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field8402[--field8395];
                class247 var22 = class502.method2727(-1, var21);
                String var23 = "";
                if (var22 != null && var22.field3184 != null) {
                    var23 = var22.field3184;
                }
                field8391[field8407++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field8402[--field8395];
                class247 var25 = class502.method2727(-1, var24);
                String var26 = "";
                if (var25 != null && var25.field3182 != null) {
                    var26 = var25.field3182;
                }
                field8391[field8407++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field8402[--field8395];
                class247 var28 = class502.method2727(-1, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field3189;
                }
                field8402[field8395++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class67.field815 == null || class67.field815.field4710 == null) {
                    var30 = class469.field5798;
                } else {
                    var30 = class67.field815.method2129(89, true);
                }
                field8391[field8407++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field8402[field8395++] = class340.field4345;
                return;
            }
            if (arg0 == 5017) {
                field8402[field8395++] = class242.method1449((byte) 95);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field8402[--field8395];
                class247 var32 = class502.method2727(-1, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field3178;
                }
                field8402[field8395++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field8402[--field8395];
                class247 var35 = class502.method2727(-1, var34);
                String var36 = "";
                if (var35 != null && var35.field3179 != null) {
                    var36 = var35.field3179;
                }
                field8391[field8407++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class67.field815 == null || class67.field815.field4710 == null) {
                    var37 = class469.field5798;
                } else {
                    var37 = class67.field815.method2123((byte) 103, false);
                }
                field8391[field8407++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field8402[--field8395];
                class247 var39 = class502.method2727(-1, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field3181;
                }
                field8402[field8395++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field8402[--field8395];
                class247 var42 = class502.method2727(-1, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field3186;
                }
                field8402[field8395++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field8402[--field8395];
                class247 var45 = class502.method2727(-1, var44);
                String var46 = "";
                if (var45 != null && var45.field3183 != null) {
                    var46 = var45.field3183;
                }
                field8391[field8407++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field8402[--field8395];
                field8391[field8407++] = class206.field2392.method3562(25703, var47).field3239;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field8402[--field8395];
                class252 var49 = class206.field2392.method3562(25703, var48);
                if (var49.field3243 == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = var49.field3243.length;
                return;
            }
            if (arg0 == 5052) {
                field8395 -= 2;
                int var50 = field8402[field8395];
                int var51 = field8402[field8395 + 1];
                class252 var52 = class206.field2392.method3562(25703, var50);
                int var53 = var52.field3243[var51];
                field8402[field8395++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field8402[--field8395];
                class252 var55 = class206.field2392.method3562(25703, var54);
                if (var55.field3246 == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = var55.field3246.length;
                return;
            }
            if (arg0 == 5054) {
                field8395 -= 2;
                int var56 = field8402[field8395];
                int var57 = field8402[field8395 + 1];
                field8402[field8395++] = class206.field2392.method3562(25703, var56).field3246[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field8402[--field8395];
                field8391[field8407++] = class471.field5810.method3267(var58, 82).method3736((byte) -119);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field8402[--field8395];
                class673 var60 = class471.field5810.method3267(var59, 70);
                if (var60.field9187 == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = var60.field9187.length;
                return;
            }
            if (arg0 == 5057) {
                field8395 -= 2;
                int var61 = field8402[field8395];
                int var62 = field8402[field8395 + 1];
                field8402[field8395++] = class471.field5810.method3267(var61, 90).field9187[var62];
                return;
            }
            if (arg0 == 5058) {
                field8400 = new class532();
                field8400.field6720 = field8402[--field8395];
                field8400.field6730 = class471.field5810.method3267(field8400.field6720, -110);
                field8400.field6726 = new int[field8400.field6730.method3729(0)];
                return;
            }
            if (arg0 == 5059) {
                field8410++;
                class124 var63 = class336.method1924(class81.field1050, class636.field8620, (byte) 109);
                var63.field1516.method3090(0, 3);
                int var64 = var63.field1516.field7313;
                var63.field1516.method3090(0, 3);
                var63.field1516.method3080((byte) -124, field8400.field6720);
                field8400.field6730.method3734(var63.field1516, false, field8400.field6726);
                var63.field1516.method3036((byte) -118, var63.field1516.field7313 - var64);
                class197.method1156((byte) 102, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field8391[--field8407];
                field8411++;
                class124 var66 = class336.method1924(class69.field901, class636.field8620, (byte) 90);
                var66.field1516.method3090(0, 3);
                int var67 = var66.field1516.field7313;
                var66.field1516.method3050(false, var65);
                var66.field1516.method3080((byte) -88, field8400.field6720);
                field8400.field6730.method3734(var66.field1516, false, field8400.field6726);
                var66.field1516.method3036((byte) -118, var66.field1516.field7313 - var67);
                class197.method1156((byte) 86, var66);
                return;
            }
            if (arg0 == 5061) {
                field8410++;
                class124 var68 = class336.method1924(class81.field1050, class636.field8620, (byte) -128);
                var68.field1516.method3090(0, 3);
                int var69 = var68.field1516.field7313;
                var68.field1516.method3090(1, 3);
                var68.field1516.method3080((byte) -54, field8400.field6720);
                field8400.field6730.method3734(var68.field1516, false, field8400.field6726);
                var68.field1516.method3036((byte) -118, var68.field1516.field7313 - var69);
                class197.method1156((byte) 111, var68);
                return;
            }
            if (arg0 == 5062) {
                field8395 -= 2;
                int var70 = field8402[field8395];
                int var71 = field8402[field8395 + 1];
                field8402[field8395++] = class206.field2392.method3562(25703, var70).field3240[var71];
                return;
            }
            if (arg0 == 5063) {
                field8395 -= 2;
                int var72 = field8402[field8395];
                int var73 = field8402[field8395 + 1];
                field8402[field8395++] = class206.field2392.method3562(25703, var72).field3248[var73];
                return;
            }
            if (arg0 == 5064) {
                field8395 -= 2;
                int var74 = field8402[field8395];
                int var75 = field8402[field8395 + 1];
                if (var75 == -1) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = class206.field2392.method3562(25703, var74).method1514(false, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field8395 -= 2;
                int var76 = field8402[field8395];
                int var77 = field8402[field8395 + 1];
                if (var77 == -1) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = class206.field2392.method3562(25703, var76).method1520((char) var77, 2);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field8402[--field8395];
                field8402[field8395++] = class471.field5810.method3267(var78, 122).method3729(0);
                return;
            }
            if (arg0 == 5067) {
                field8395 -= 2;
                int var79 = field8402[field8395];
                int var80 = field8402[field8395 + 1];
                int var81 = class471.field5810.method3267(var79, -122).method3737(var80, 1024).field1688;
                field8402[field8395++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field8395 -= 2;
                int var82 = field8402[field8395];
                int var83 = field8402[field8395 + 1];
                field8400.field6726[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field8395 -= 2;
                int var84 = field8402[field8395];
                int var85 = field8402[field8395 + 1];
                field8400.field6726[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field8395 -= 3;
                int var86 = field8402[field8395];
                int var87 = field8402[field8395 + 1];
                int var88 = field8402[field8395 + 2];
                class673 var89 = class471.field5810.method3267(var86, -71);
                if (var89.method3737(var87, 1024).field1688 != 0) {
                    throw new RuntimeException("bad command");
                }
                field8402[field8395++] = var89.method3731(var88, -1, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field8391[--field8407];
                boolean var91 = field8402[--field8395] == 1;
                class29.method179((byte) -128, var91, var90);
                field8402[field8395++] = class111.field1382;
                return;
            }
            if (arg0 == 5072) {
                if (class666.field9042 != null && class253.field3268 < class111.field1382) {
                    field8402[field8395++] = class666.field9042[class253.field3268++] & 0xFFFF;
                    return;
                }
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class253.field3268 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class307.field3884.method1592((byte) -120, 86)) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class307.field3884.method1592((byte) -120, 82)) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class307.field3884.method1592((byte) -120, 81)) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class159.method983(-8, field8402[--field8395]);
                return;
            }
            if (arg0 == 5201) {
                field8402[field8395++] = class587.method3259(false);
                return;
            }
            if (arg0 == 5205) {
                class299.method1783(false, field8402[--field8395], -1, (byte) 88, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field8402[--field8395];
                class474 var93 = class604.method3338(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = var93.field5865;
                return;
            }
            if (arg0 == 5207) {
                class474 var94 = class604.method3348(field8402[--field8395]);
                if (var94 != null && var94.field5859 != null) {
                    field8391[field8407++] = var94.field5859;
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 5208) {
                field8402[field8395++] = class116.field1447;
                field8402[field8395++] = class250.field3231;
                return;
            }
            if (arg0 == 5209) {
                field8402[field8395++] = class604.field8128 + class227.field2939;
                field8402[field8395++] = class604.field8140 + class537.field6759;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field8402[--field8395];
                class474 var96 = class604.method3348(var95);
                if (var96 == null) {
                    field8402[field8395++] = 0;
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = var96.field5864 >> 14 & 0x3FFF;
                field8402[field8395++] = var96.field5864 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field8402[--field8395];
                class474 var98 = class604.method3348(var97);
                if (var98 == null) {
                    field8402[field8395++] = 0;
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = var98.field5854 - var98.field5861;
                field8402[field8395++] = var98.field5867 - var98.field5856;
                return;
            }
            if (arg0 == 5212) {
                class79 var99 = class342.method1955(-98);
                if (var99 == null) {
                    field8402[field8395++] = -1;
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = var99.field1034;
                int var100 = var99.field1021 << 28 | class604.field8128 + var99.field1025 << 14 | class604.field8140 + var99.field1031;
                field8402[field8395++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class79 var101 = class581.method3214(false);
                if (var101 == null) {
                    field8402[field8395++] = -1;
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = var101.field1034;
                int var102 = var101.field1021 << 28 | class604.field8128 + var101.field1025 << 14 | class604.field8140 + var101.field1031;
                field8402[field8395++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field8402[--field8395];
                class474 var104 = class303.method1799(false);
                if (var104 != null) {
                    boolean var105 = var104.method2573(-115, var103 >> 28 & 0x3, var103 & 0x3FFF, var103 >> 14 & 0x3FFF, field8413);
                    if (var105) {
                        class99.method727(field8413[2], field8413[1], -10761);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field8395 -= 2;
                int var106 = field8402[field8395];
                int var107 = field8402[field8395 + 1];
                class456 var108 = class604.method3334(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class474 var110 = (class474) var108.method2502(false); var110 != null; var110 = (class474) var108.method2509((byte) -122)) {
                    if (var110.field5865 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field8402[--field8395];
                class474 var112 = class604.method3348(var111);
                if (var112 == null) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = var112.field5860;
                return;
            }
            if (arg0 == 5220) {
                field8402[field8395++] = class394.field5023 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field8402[--field8395];
                class99.method727(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, -10761);
                return;
            }
            if (arg0 == 5222) {
                class474 var114 = class303.method1799(false);
                if (var114 != null) {
                    boolean var115 = var114.method2570((byte) -35, class604.field8128 + class227.field2939, class604.field8140 + class537.field6759, field8413);
                    if (var115) {
                        field8402[field8395++] = field8413[1];
                        field8402[field8395++] = field8413[2];
                        return;
                    }
                    field8402[field8395++] = -1;
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = -1;
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field8395 -= 2;
                int var116 = field8402[field8395];
                int var117 = field8402[field8395 + 1];
                class299.method1783(false, var116, var117 & 0x3FFF, (byte) 61, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field8402[--field8395];
                class474 var119 = class303.method1799(false);
                if (var119 != null) {
                    boolean var120 = var119.method2573(-118, var118 >> 28 & 0x3, var118 & 0x3FFF, var118 >> 14 & 0x3FFF, field8413);
                    if (var120) {
                        field8402[field8395++] = field8413[1];
                        field8402[field8395++] = field8413[2];
                        return;
                    }
                    field8402[field8395++] = -1;
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = -1;
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field8402[--field8395];
                class474 var122 = class303.method1799(false);
                if (var122 != null) {
                    boolean var123 = var122.method2570((byte) -35, var121 >> 14 & 0x3FFF, var121 & 0x3FFF, field8413);
                    if (var123) {
                        field8402[field8395++] = field8413[1];
                        field8402[field8395++] = field8413[2];
                        return;
                    }
                    field8402[field8395++] = -1;
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = -1;
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class32.method224(-245, field8402[--field8395]);
                return;
            }
            if (arg0 == 5227) {
                field8395 -= 2;
                int var124 = field8402[field8395];
                int var125 = field8402[field8395 + 1];
                class299.method1783(true, var124, var125 & 0x3FFF, (byte) 91, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class52.field659 = field8402[--field8395] == 1;
                return;
            }
            if (arg0 == 5229) {
                field8402[field8395++] = class52.field659 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field8402[--field8395];
                class286.method1722(4080, var126);
                return;
            }
            if (arg0 == 5231) {
                field8395 -= 2;
                int var127 = field8402[field8395];
                boolean var128 = field8402[field8395 + 1] == 1;
                if (class512.field6430 != null) {
                    class263 var129 = class512.field6430.method3828((long) var127, (byte) -91);
                    if (var129 != null && !var128) {
                        var129.method1566(-69);
                        return;
                    }
                    if (var129 == null && var128) {
                        class263 var130 = new class263();
                        class512.field6430.method3832(var130, (long) var127, 38);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field8402[--field8395];
                if (class512.field6430 != null) {
                    class263 var132 = class512.field6430.method3828((long) var131, (byte) -91);
                    field8402[field8395++] = var132 == null ? 0 : 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field8395 -= 2;
                int var133 = field8402[field8395];
                boolean var134 = field8402[field8395 + 1] == 1;
                if (class599.field8034 != null) {
                    class263 var135 = class599.field8034.method3828((long) var133, (byte) -91);
                    if (var135 != null && !var134) {
                        var135.method1566(-77);
                        return;
                    }
                    if (var135 == null && var134) {
                        class263 var136 = new class263();
                        class599.field8034.method3832(var136, (long) var133, 18);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field8402[--field8395];
                if (class599.field8034 != null) {
                    class263 var138 = class599.field8034.method3828((long) var137, (byte) -91);
                    field8402[field8395++] = var138 == null ? 0 : 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field8402[field8395++] = class604.field8107 == null ? -1 : class604.field8107.field5865;
                return;
            }
            if (arg0 == 5236) {
                field8395 -= 2;
                int var139 = field8402[field8395];
                int var140 = field8402[field8395 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class406.method2280(var139, var141, -8306, var142);
                if (var143 < 0) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class618.method3446(11);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field8395 -= 2;
                int var144 = field8402[field8395];
                int var145 = field8402[field8395 + 1];
                class645.method3607(false, 3, var144, var145, (byte) -124);
                field8402[field8395++] = class90.field1174 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class90.field1174 != null) {
                    class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -128);
                }
                return;
            }
            if (arg0 == 5302) {
                class48[] var146 = class48.method289((byte) -37);
                field8402[field8395++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field8402[--field8395];
                class48[] var148 = class48.method289((byte) -37);
                field8402[field8395++] = var148[var147].field637;
                field8402[field8395++] = var148[var147].field636;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class611.field8310.field8706;
                int var150 = class611.field8310.field8690;
                int var151 = -1;
                class48[] var152 = class48.method289((byte) -37);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class48 var154 = var152[var153];
                    if (var154.field637 == var149 && var154.field636 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field8402[field8395++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field8402[field8395++] = class207.method1211(3);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field8402[--field8395];
                if (var155 >= 1 && var155 <= 2) {
                    class645.method3607(false, var155, -1, -1, (byte) -124);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field8402[field8395++] = class611.field8310.field8697;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field8402[--field8395];
                if (var156 >= 1 && var156 <= 2) {
                    class611.field8310.field8697 = var156;
                    class611.field8310.method2749(class386.field4955, -63);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field8407 -= 2;
                String var157 = field8391[field8407];
                String var158 = field8391[field8407 + 1];
                int var159 = field8402[--field8395];
                field8398++;
                class124 var160 = class336.method1924(class356.field4585, class636.field8620, (byte) -5);
                var160.field1516.method3090(class680.method3757((byte) 60, var157) + class680.method3757((byte) 60, var158) + 1, 3);
                var160.field1516.method3050(false, var157);
                var160.field1516.method3050(false, var158);
                var160.field1516.method3090(var159, 3);
                class197.method1156((byte) 113, var160);
                return;
            }
            if (arg0 == 5401) {
                field8395 -= 2;
                class694.field9629[field8402[field8395]] = (short) class211.method1238(false, field8402[field8395 + 1]);
                class504.field6287.method1627(6);
                class504.field6287.method1622((byte) 68);
                class46.field620.method3765(-2001);
                class377.method2172(100);
                return;
            }
            if (arg0 == 5405) {
                field8395 -= 2;
                int var161 = field8402[field8395];
                int var162 = field8402[field8395 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class187.field2208[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field8395 -= 7;
                int var163 = field8402[field8395];
                int var164 = field8402[field8395 + 1] << 1;
                int var165 = field8402[field8395 + 2];
                int var166 = field8402[field8395 + 3];
                int var167 = field8402[field8395 + 4];
                int var168 = field8402[field8395 + 5];
                int var169 = field8402[field8395 + 6];
                if (var163 >= 0 && var163 < 2 && class187.field2208[var163] != null && var164 >= 0 && var164 < class187.field2208[var163].length) {
                    class187.field2208[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class187.field2208[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class187.field2208[field8402[--field8395]].length >> 1;
                field8402[field8395++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class90.field1174 != null) {
                    class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -126);
                }
                if (class338.field4326 != null) {
                    class81.method616(10522);
                    System.exit(0);
                    return;
                }
                String var171 = class99.field1281 == null ? class130.method842((byte) 83) : class99.field1281;
                class222.method1271(var171, class628.field8526 == 1, false, 100, class386.field4955);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class354.field4577 != null) {
                    if (class354.field4577.field2547 == null) {
                        var172 = class122.method804(class354.field4577.field2545, (byte) -90);
                    } else {
                        var172 = (String) class354.field4577.field2547;
                    }
                }
                field8391[field8407++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field8402[field8395++] = class386.field4955.field5919 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class90.field1174 != null) {
                    class645.method3607(false, class611.field8310.field8697, -1, -1, (byte) -126);
                }
                String var173 = field8391[--field8407];
                boolean var174 = field8402[--field8395] == 1;
                String var175 = class130.method842((byte) 83) + var173;
                class222.method1271(var175, class628.field8526 == 1, var174, 103, class386.field4955);
                return;
            }
            if (arg0 == 5422) {
                field8407 -= 2;
                String var176 = field8391[field8407];
                String var177 = field8391[field8407 + 1];
                int var178 = field8402[--field8395];
                if (var176.length() > 0) {
                    if (class287.field3636 == null) {
                        class287.field3636 = new String[class674.field9211[class341.field4353.field8728]];
                    }
                    class287.field3636[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class190.field2261 == null) {
                        class190.field2261 = new String[class674.field9211[class341.field4353.field8728]];
                    }
                    class190.field2261[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field8391[--field8407]);
                return;
            }
            if (arg0 == 5424) {
                field8395 -= 11;
                class413.field5286 = field8402[field8395];
                class467.field5793 = field8402[field8395 + 1];
                class136.field1652 = field8402[field8395 + 2];
                class441.field5544 = field8402[field8395 + 3];
                class634.field8595 = field8402[field8395 + 4];
                class459.field5712 = field8402[field8395 + 5];
                class160.field1885 = field8402[field8395 + 6];
                class617.field8374 = field8402[field8395 + 7];
                class321.field3998 = field8402[field8395 + 8];
                class162.field1915 = field8402[field8395 + 9];
                class686.field9363 = field8402[field8395 + 10];
                class136.field1656.method1669((byte) -82, class634.field8595);
                class136.field1656.method1669((byte) 123, class459.field5712);
                class136.field1656.method1669((byte) -45, class160.field1885);
                class136.field1656.method1669((byte) 111, class617.field8374);
                class136.field1656.method1669((byte) 118, class321.field3998);
                class386.field4953 = null;
                class180.field2122 = null;
                class392.field5014 = null;
                class395.field5029 = null;
                class345.field4442 = null;
                class381.field4886 = null;
                class227.field2934 = null;
                class324.field4031 = null;
                class353.field4564 = true;
                return;
            }
            if (arg0 == 5425) {
                class416.method2314(false);
                class353.field4564 = false;
                return;
            }
            if (arg0 == 5426) {
                field8395 -= 2;
                class585.field7863 = field8402[field8395];
                class428.field5404 = field8402[field8395 + 1];
                return;
            }
            if (arg0 == 5427) {
                field8395 -= 2;
                class268.field3390 = field8402[field8395 + 1];
                return;
            }
            if (arg0 == 5428) {
                field8395 -= 2;
                int var179 = field8402[field8395];
                int var180 = field8402[field8395 + 1];
                field8402[field8395++] = class211.method1241(22, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class288.method1730(false, false, field8391[--field8407], false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class104.method744(class95.field1241, "accountcreated", 120);
                    return;
                } catch (Throwable var309) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class104.method744(class95.field1241, "accountcreatestarted", 122);
                    return;
                } catch (Throwable var310) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field8395 -= 4;
                int var181 = field8402[field8395];
                int var182 = field8402[field8395 + 1];
                int var183 = field8402[field8395 + 2];
                int var184 = field8402[field8395 + 3];
                class388.method2219(var182 << 2, var184, (var181 >> 14 & 0x3FFF) - class227.field2938, (var181 & 0x3FFF) - class522.field6612, false, var183, (byte) -108);
                return;
            }
            if (arg0 == 5501) {
                field8395 -= 4;
                int var185 = field8402[field8395];
                int var186 = field8402[field8395 + 1];
                int var187 = field8402[field8395 + 2];
                int var188 = field8402[field8395 + 3];
                class171.method1027(var187, (var185 >> 14 & 0x3FFF) - class227.field2938, (var185 & 0x3FFF) - class522.field6612, var186 << 2, var188, (byte) 63);
                return;
            }
            if (arg0 == 5502) {
                field8395 -= 6;
                int var189 = field8402[field8395];
                if (var189 >= 2) {
                    throw new RuntimeException();
                }
                class116.field1446 = var189;
                int var190 = field8402[field8395 + 1];
                if (var190 + 1 >= class187.field2208[class116.field1446].length >> 1) {
                    throw new RuntimeException();
                }
                class152.field1824 = var190;
                class350.field4525 = 0;
                class356.field4590 = field8402[field8395 + 2];
                class662.field8970 = field8402[field8395 + 3];
                int var191 = field8402[field8395 + 4];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class702.field9814 = var191;
                int var192 = field8402[field8395 + 5];
                if (var192 + 1 >= class187.field2208[class702.field9814].length >> 1) {
                    throw new RuntimeException();
                }
                class23.field260 = var192;
                class385.field4946 = 3;
                return;
            }
            if (arg0 == 5503) {
                class376.method2170(false);
                return;
            }
            if (arg0 == 5504) {
                field8395 -= 2;
                class431.method2368(0, (byte) 124, field8402[field8395], field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field8402[field8395++] = (int) class23.field266 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field8402[field8395++] = (int) class689.field9561 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class247.method1478((byte) -110);
                return;
            }
            if (arg0 == 5508) {
                class443.method2434(false);
                return;
            }
            if (arg0 == 5509) {
                class22.method146(-128);
                return;
            }
            if (arg0 == 5510) {
                class331.method1900(true);
                return;
            }
            if (arg0 == 5511) {
                int var193 = field8402[--field8395];
                int var194 = var193 >> 14 & 0x3FFF;
                int var195 = var193 & 0x3FFF;
                int var196 = var194 - class227.field2938;
                if (var196 < 0) {
                    var196 = 0;
                } else if (var196 >= class85.field1090) {
                    var196 = class85.field1090;
                }
                int var197 = var195 - class522.field6612;
                if (var197 < 0) {
                    var197 = 0;
                } else if (var197 >= class656.field8932) {
                    var197 = class656.field8932;
                }
                class702.field9824 = (var196 << 9) + 256;
                class576.field7580 = (var197 << 9) + 256;
                class385.field4946 = 4;
                return;
            }
            if (arg0 == 5512) {
                class457.method2516((byte) 5);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field8407 -= 2;
                String var198 = field8391[field8407];
                String var199 = field8391[field8407 + 1];
                int var200 = field8402[--field8395];
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    class469.field5798 = var198;
                    class33.field515 = var199;
                    class139.field1674 = var200;
                    class78.method609(10503, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class304.method1810((byte) 121);
                return;
            }
            if (arg0 == 5602) {
                if (class583.field7833 == 0) {
                    class424.field5372 = -2;
                    class55.field708 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field8395 -= 4;
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    class418.method2326(field8402[field8395], field8402[field8395 + 3], field8402[field8395 + 2], field8402[field8395 + 1], 2);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field8407--;
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    class624.method3475(91, class291.method1746(field8391[field8407], (byte) -124));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field8407 -= 2;
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    class660.method3682(field8391[field8407 + 1], false, class291.method1746(field8391[field8407], (byte) -124), false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class303.field3848 == 0) {
                    class389.field4992 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field8402[field8395++] = class55.field708;
                return;
            }
            if (arg0 == 5608) {
                field8402[field8395++] = class307.field3880;
                return;
            }
            if (arg0 == 5609) {
                field8402[field8395++] = class389.field4992;
                return;
            }
            if (arg0 == 5610) {
                for (int var201 = 0; var201 < 5; var201++) {
                    field8391[field8407++] = class416.field5330.length > var201 ? class418.method2327((byte) 103, class416.field5330[var201]) : "";
                }
                class416.field5330 = null;
                return;
            }
            if (arg0 == 5611) {
                field8402[field8395++] = class164.field1930;
                return;
            }
            if (arg0 == 5612) {
                int var202 = field8402[--field8395];
                if (class470.field5804 != 7) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    if (class335.field4139 != null) {
                        class335.field4139.method2511((byte) -122);
                        class335.field4139 = null;
                    }
                    class139.field1674 = var202;
                    class78.method609(10503, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field8402[field8395++] = class55.field708;
                return;
            }
            if (arg0 == 5615) {
                field8407 -= 2;
                String var203 = field8391[field8407];
                String var204 = field8391[field8407 + 1];
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    if (class335.field4139 != null) {
                        class335.field4139.method2511((byte) -64);
                        class335.field4139 = null;
                    }
                    class469.field5798 = var203;
                    class33.field515 = var204;
                    class78.method609(10503, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class349.method2010(false, true);
                return;
            }
            if (arg0 == 5617) {
                field8402[field8395++] = class424.field5372;
                return;
            }
            if (arg0 == 5618) {
                int var205 = field8402[--field8395];
                class32.method219(27599, var205, false);
                return;
            }
            if (arg0 == 5619) {
                int var206 = field8402[--field8395];
                class32.method219(27599, var206, true);
                return;
            }
            if (arg0 == 5620) {
                class578.method3199(-30606);
                if (class682.field9294 != "" && class682.field9294 != "") {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field8407 -= 2;
                if (class470.field5804 != 3) {
                    return;
                }
                if (class583.field7833 == 0 && class303.field3848 == 0) {
                    class660.method3682(field8391[field8407 + 1], true, class291.method1746(field8391[field8407], (byte) -124), false);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class218 var207 = class386.field4955.method2596((byte) 117, false, "3");
                while (var207.field2546 == 0) {
                    class700.method3867(29279, 1L);
                }
                if (var207.field2546 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class448 var208 = (class448) var207.field2547;
                if (var208.method2452(17).exists()) {
                    class572 var209 = new class572(50);
                    try {
                        var208.method2449(var209.field7318, 50, (byte) 77, 0);
                    } catch (IOException var312) {
                    }
                }
                try {
                    var208.method2451(true);
                    return;
                } catch (Exception var311) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class109.field1356 != null) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field8402[field8395++] = (int) (class192.field2274 >> 32);
                field8402[field8395++] = (int) (class192.field2274 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var210 = field8402[--field8395];
                if (var210 < 1) {
                    var210 = 1;
                }
                if (var210 > 4) {
                    var210 = 4;
                }
                class611.field8310.field8711 = var210;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -118);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6002) {
                class611.field8310.method2735(field8402[--field8395] == 1, 118);
                class303.method1800(-28818);
                class89.method669((byte) -38);
                class611.field8310.method2749(class386.field4955, -86);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6003) {
                class611.field8310.field8716 = field8402[--field8395] == 1;
                class89.method669((byte) -38);
                class611.field8310.method2749(class386.field4955, -90);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6005) {
                class611.field8310.field8679 = field8402[--field8395] == 1;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -64);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6006) {
                class611.field8310.field8722 = field8402[--field8395] == 1;
                class309.field3898.method482(!class611.field8310.field8722);
                class611.field8310.method2749(class386.field4955, -124);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6007) {
                class611.field8310.field8718 = field8402[--field8395];
                class611.field8310.method2749(class386.field4955, -84);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6008) {
                class611.field8310.field8699 = field8402[--field8395] == 1;
                class611.field8310.method2749(class386.field4955, -79);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6009) {
                class611.field8310.field8709 = field8402[--field8395] == 1;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -53);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6010) {
                class611.field8310.field8712 = field8402[--field8395] == 1;
                class611.field8310.method2749(class386.field4955, -101);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6011) {
                int var211 = field8402[--field8395];
                if (var211 < 0 || var211 > 2) {
                    var211 = 0;
                }
                class611.field8310.method3594(74, var211, class628.field8526);
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -57);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6012) {
                class611.field8310.method3597(class628.field8526, field8402[--field8395] == 1, false);
                class305.method1816((byte) 2);
                class532.method2871(true);
                class611.field8310.method2749(class386.field4955, -79);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6014) {
                class611.field8310.field8698 = field8402[--field8395] == 1;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -108);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6015) {
                class611.field8310.field8700 = field8402[--field8395] == 1;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -102);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6016) {
                int var212 = field8402[--field8395];
                if (var212 < 0 || var212 > 2) {
                    var212 = 0;
                }
                class611.field8310.field8721 = var212;
                class364.method2114(class628.field8526, 112);
                class611.field8310.method2749(class386.field4955, -82);
                return;
            }
            if (arg0 == 6017) {
                class611.field8310.field8714 = field8402[--field8395] == 1;
                class331.method1899(1);
                class611.field8310.method2749(class386.field4955, -62);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6018) {
                int var213 = field8402[--field8395];
                if (var213 < 0) {
                    var213 = 0;
                }
                if (var213 > 127) {
                    var213 = 127;
                }
                class611.field8310.field8689 = var213;
                class611.field8310.method2749(class386.field4955, -107);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field8402[--field8395];
                if (var214 < 0) {
                    var214 = 0;
                }
                if (var214 > 255) {
                    var214 = 255;
                }
                if (class611.field8310.field8684 != var214) {
                    if (class611.field8310.field8684 == 0 && class640.field8675 != -1) {
                        class571.method3024(class640.field8675, 0, false, var214, class353.field4567, -144);
                        class89.field1160 = false;
                    } else if (var214 == 0) {
                        class213.method1244((byte) 94);
                        class89.field1160 = false;
                    } else {
                        class204.method1185(var214, -48);
                    }
                    class611.field8310.field8684 = var214;
                }
                class611.field8310.method2749(class386.field4955, -81);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6020) {
                int var215 = field8402[--field8395];
                if (var215 < 0) {
                    var215 = 0;
                }
                if (var215 > 127) {
                    var215 = 127;
                }
                class611.field8310.field8701 = var215;
                class611.field8310.method2749(class386.field4955, -76);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6021) {
                class611.field8310.field6268 = field8402[--field8395] == 1;
                class89.method669((byte) -38);
                return;
            }
            if (arg0 == 6023) {
                int var216 = field8402[--field8395];
                boolean var217 = false;
                if (var216 < 0) {
                    var216 = 0;
                }
                if (var216 > 2) {
                    var216 = 2;
                }
                if (class357.field4610 < 96) {
                    var216 = 0;
                    var217 = true;
                }
                class242.method1451(var216, true);
                class611.field8310.method2749(class386.field4955, -97);
                class528.field6662 = false;
                field8402[field8395++] = var217 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var218 = field8402[--field8395];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class611.field8310.field8678 = var218;
                class611.field8310.method2749(class386.field4955, -105);
                return;
            }
            if (arg0 == 6025) {
                int var219 = field8402[--field8395];
                if (var219 < 0 || var219 > class530.method2860(class357.field4610, 5890)) {
                    var219 = 0;
                }
                class611.field8310.field8696 = var219;
                class611.field8310.method2749(class386.field4955, -70);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6027) {
                int var220 = field8402[--field8395];
                if (var220 < 0 || var220 > 1) {
                    var220 = 0;
                }
                class27.method164(var220 == 1, 0);
                return;
            }
            if (arg0 == 6028) {
                class611.field8310.field8692 = field8402[--field8395] != 0;
                class611.field8310.method2749(class386.field4955, -59);
                return;
            }
            if (arg0 == 6029) {
                class611.field8310.field8718 = field8402[--field8395];
                class611.field8310.method2749(class386.field4955, -116);
                return;
            }
            if (arg0 == 6030) {
                class611.field8310.field8717 = field8402[--field8395] != 0;
                class611.field8310.method2749(class386.field4955, -113);
                class303.method1800(-28818);
                return;
            }
            if (arg0 == 6031) {
                int var221 = field8402[--field8395];
                if (var221 < 0 || var221 > 5) {
                    var221 = 2;
                }
                class364.method2114(var221, 127);
                return;
            }
            if (arg0 == 6032) {
                int var222 = field8402[--field8395];
                if (var222 < 0 || var222 > 5) {
                    var222 = 2;
                }
                class611.field8310.field8688 = var222;
                class611.field8310.method2749(class386.field4955, -121);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6033) {
                int var223 = field8402[--field8395];
                if (var223 < 0 || var223 > 4) {
                    var223 = 2;
                }
                class611.field8310.field8677 = var223;
                class611.field8310.method2749(class386.field4955, -125);
                return;
            }
            if (arg0 == 6034) {
                class611.field8310.field8685 = field8402[--field8395] == 1;
                class611.field8310.method2749(class386.field4955, -104);
                class305.method1816((byte) 2);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6035) {
                class611.field8310.field6276 = field8402[--field8395] == 1;
                class303.method1800(-28818);
                class89.method669((byte) -38);
                return;
            }
            if (arg0 == 6036) {
                int var224 = field8402[--field8395];
                if (var224 < 0 || var224 > 2) {
                    var224 = 0;
                }
                class611.field8310.method2745(var224, (byte) 55);
                class611.field8310.method2749(class386.field4955, -99);
                return;
            }
            if (arg0 == 6037) {
                int var225 = field8402[--field8395];
                if (var225 < 0) {
                    var225 = 0;
                }
                if (var225 > 127) {
                    var225 = 127;
                }
                class611.field8310.field8681 = var225;
                class611.field8310.method2749(class386.field4955, -95);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6038) {
                int var226 = field8402[--field8395];
                if (var226 < 0) {
                    var226 = 0;
                }
                if (var226 > 255) {
                    var226 = 255;
                }
                if (class611.field8310.field8702 != var226 && class640.field8675 == class583.field7837) {
                    if (class611.field8310.field8702 == 0) {
                        class571.method3024(class640.field8675, 0, false, var226, class353.field4567, -144);
                        class89.field1160 = false;
                    } else if (var226 == 0) {
                        class213.method1244((byte) 94);
                        class89.field1160 = false;
                    } else {
                        class204.method1185(var226, 102);
                    }
                }
                class611.field8310.field8702 = var226;
                class611.field8310.method2749(class386.field4955, -115);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 6039) {
                int var227 = field8402[--field8395];
                if (var227 > 255 || var227 < 0) {
                    var227 = 0;
                }
                if (class611.field8310.field8694 != var227) {
                    class611.field8310.field8694 = var227;
                    class611.field8310.method2749(class386.field4955, -59);
                    class528.field6662 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field8402[field8395++] = class611.field8310.field8711;
                return;
            }
            if (arg0 == 6102) {
                field8402[field8395++] = class611.field8310.method2732((byte) -6, class628.field8526) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field8402[field8395++] = class611.field8310.field8716 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field8402[field8395++] = class611.field8310.field8679 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field8402[field8395++] = class611.field8310.field8722 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field8402[field8395++] = class611.field8310.field8718;
                return;
            }
            if (arg0 == 6108) {
                field8402[field8395++] = class611.field8310.field8699 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field8402[field8395++] = class611.field8310.field8709 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field8402[field8395++] = class611.field8310.field8712 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field8402[field8395++] = class611.field8310.method3598(-15929, class628.field8526);
                return;
            }
            if (arg0 == 6112) {
                field8402[field8395++] = class611.field8310.method3593(class628.field8526, (byte) -80) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field8402[field8395++] = class611.field8310.field8698 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field8402[field8395++] = class611.field8310.field8700 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field8402[field8395++] = class611.field8310.field8721;
                return;
            }
            if (arg0 == 6117) {
                field8402[field8395++] = class611.field8310.field8714 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field8402[field8395++] = class611.field8310.field8689;
                return;
            }
            if (arg0 == 6119) {
                field8402[field8395++] = class611.field8310.field8684;
                return;
            }
            if (arg0 == 6120) {
                field8402[field8395++] = class611.field8310.field8701;
                return;
            }
            if (arg0 == 6121) {
                field8402[field8395++] = class309.field3898.method422() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field8402[field8395++] = class595.method3289(-24064);
                return;
            }
            if (arg0 == 6124) {
                field8402[field8395++] = class611.field8310.field8678;
                return;
            }
            if (arg0 == 6125) {
                field8402[field8395++] = class611.field8310.field8696;
                return;
            }
            if (arg0 == 6126) {
                field8402[field8395++] = class309.field3898.method471() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field8402[field8395++] = class611.field8310.field8703 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field8402[field8395++] = class611.field8310.field8692 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field8402[field8395++] = class611.field8310.field8718;
                return;
            }
            if (arg0 == 6130) {
                field8402[field8395++] = class611.field8310.field8717 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field8402[field8395++] = class628.field8526;
                return;
            }
            if (arg0 == 6132) {
                field8402[field8395++] = class611.field8310.field8688;
                return;
            }
            if (arg0 == 6133) {
                field8402[field8395++] = class386.field4955.field5919 && !class386.field4955.field5925 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field8402[field8395++] = class530.method2860(class357.field4610, 5890);
                return;
            }
            if (arg0 == 6135) {
                field8402[field8395++] = class611.field8310.field8677;
                return;
            }
            if (arg0 == 6136) {
                field8402[field8395++] = class611.field8310.field8685 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var228 = true;
                try {
                    var228 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var313) {
                }
                field8402[field8395++] = var228 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field8402[field8395++] = class179.method1064(200, class628.field8526, (byte) -71);
                return;
            }
            if (arg0 == 6139) {
                field8402[field8395++] = class611.field8310.method2736(-122, class628.field8526);
                return;
            }
            if (arg0 == 6140) {
                byte var229 = 0;
                if (class213.method1242(class628.field8526, -5) && class357.field4610 < 96) {
                    var229 = 1;
                }
                field8402[field8395++] = var229;
                return;
            }
            if (arg0 == 6141) {
                if (class357.field4610 < 96) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field8402[field8395++] = class611.field8310.field8681;
                return;
            }
            if (arg0 == 6143) {
                field8402[field8395++] = class611.field8310.field8702;
                return;
            }
            if (arg0 == 6144) {
                field8402[field8395++] = class277.field3528 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field8402[field8395++] = class611.field8310.field8694;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field8395 -= 2;
                class466.field5783 = (short) field8402[field8395];
                if (class466.field5783 <= 0) {
                    class466.field5783 = 256;
                }
                class581.field7823 = (short) field8402[field8395 + 1];
                if (class581.field7823 <= 0) {
                    class581.field7823 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field8395 -= 2;
                class687.field9428 = (short) field8402[field8395];
                if (class687.field9428 <= 0) {
                    class687.field9428 = 256;
                }
                class558.field6982 = (short) field8402[field8395 + 1];
                if (class558.field6982 <= 0) {
                    class558.field6982 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field8395 -= 4;
                class89.field1153 = (short) field8402[field8395];
                if (class89.field1153 <= 0) {
                    class89.field1153 = 1;
                }
                class161.field1899 = (short) field8402[field8395 + 1];
                if (class161.field1899 <= 0) {
                    class161.field1899 = 32767;
                } else if (class161.field1899 < class89.field1153) {
                    class161.field1899 = class89.field1153;
                }
                class68.field880 = (short) field8402[field8395 + 2];
                if (class68.field880 <= 0) {
                    class68.field880 = 1;
                }
                class657.field8939 = (short) field8402[field8395 + 3];
                if (class657.field8939 <= 0) {
                    class657.field8939 = 32767;
                    return;
                }
                if (class657.field8939 < class68.field880) {
                    class657.field8939 = class68.field880;
                }
                return;
            }
            if (arg0 == 6203) {
                class131.method849(class228.field2952.field4309, 0, class228.field2952.field4211, 29967, false, 0);
                field8402[field8395++] = class469.field5799;
                field8402[field8395++] = class356.field4595;
                return;
            }
            if (arg0 == 6204) {
                field8402[field8395++] = class687.field9428;
                field8402[field8395++] = class558.field6982;
                return;
            }
            if (arg0 == 6205) {
                field8402[field8395++] = class466.field5783;
                field8402[field8395++] = class581.field7823;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field8402[field8395++] = (int) (class321.method1854(-24) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field8402[field8395++] = (int) (class321.method1854(-81) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field8395 -= 3;
                int var230 = field8402[field8395];
                int var231 = field8402[field8395 + 1];
                int var232 = field8402[field8395 + 2];
                field8412.clear();
                field8412.set(11, 12);
                field8412.set(var232, var231, var230);
                int var233 = (int) (field8412.getTime().getTime() / 86400000L) - 11745;
                if (var232 < 1970) {
                    var233--;
                }
                field8402[field8395++] = var233;
                return;
            }
            if (arg0 == 6303) {
                field8412.clear();
                field8412.setTime(new Date(class321.method1854(-121)));
                field8402[field8395++] = field8412.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var234 = field8402[--field8395];
                boolean var235 = true;
                if (var234 < 0) {
                    var235 = (var234 + 1) % 4 == 0;
                } else if (var234 < 1582) {
                    var235 = var234 % 4 == 0;
                } else if (var234 % 4 != 0) {
                    var235 = false;
                } else if (var234 % 100 != 0) {
                    var235 = true;
                } else if (var234 % 400 != 0) {
                    var235 = false;
                }
                field8402[field8395++] = var235 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field8402[field8395++] = class449.method2457(-37) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field8402[field8395++] = class27.method165(1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class470.field5804 == 7 && class583.field7833 == 0 && class303.field3848 == 0) {
                    if (class262.field3315) {
                        field8402[field8395++] = 0;
                        return;
                    }
                    if (class440.field5534 > class321.method1854(-34) - 1000L) {
                        field8402[field8395++] = 1;
                        return;
                    }
                    class262.field3315 = true;
                    class124 var236 = class336.method1924(class103.field1314, class636.field8620, (byte) 125);
                    var236.field1516.method3061(class530.field6694, (byte) 115);
                    class197.method1156((byte) 101, var236);
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class305 var237 = class457.method2512((byte) -105);
                if (var237 != null) {
                    field8402[field8395++] = var237.field3865;
                    field8402[field8395++] = var237.field6643;
                    field8391[field8407++] = var237.field3860;
                    class256 var238 = var237.method1818(8);
                    field8402[field8395++] = var238.field3282;
                    field8391[field8407++] = var238.field3283;
                    field8402[field8395++] = var237.field6646;
                    field8402[field8395++] = var237.field3864;
                    field8391[field8407++] = var237.field3869;
                    return;
                }
                field8402[field8395++] = -1;
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 6502) {
                class305 var239 = class210.method1234(81);
                if (var239 != null) {
                    field8402[field8395++] = var239.field3865;
                    field8402[field8395++] = var239.field6643;
                    field8391[field8407++] = var239.field3860;
                    class256 var240 = var239.method1818(8);
                    field8402[field8395++] = var240.field3282;
                    field8391[field8407++] = var240.field3283;
                    field8402[field8395++] = var239.field6646;
                    field8402[field8395++] = var239.field3864;
                    field8391[field8407++] = var239.field3869;
                    return;
                }
                field8402[field8395++] = -1;
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var241 = field8402[--field8395];
                String var242 = field8391[--field8407];
                if (class470.field5804 == 7 && class583.field7833 == 0 && class303.field3848 == 0) {
                    field8402[field8395++] = class645.method3609(var241, var242, 125) ? 1 : 0;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class611.field8310.field8708 = field8402[--field8395];
                class611.field8310.method2749(class386.field4955, -58);
                return;
            }
            if (arg0 == 6505) {
                field8402[field8395++] = class611.field8310.field8708;
                return;
            }
            if (arg0 == 6506) {
                int var243 = field8402[--field8395];
                class305 var244 = class276.method1672(true, var243);
                if (var244 != null) {
                    field8402[field8395++] = var244.field6643;
                    field8391[field8407++] = var244.field3860;
                    class256 var245 = var244.method1818(8);
                    field8402[field8395++] = var245.field3282;
                    field8391[field8407++] = var245.field3283;
                    field8402[field8395++] = var244.field6646;
                    field8402[field8395++] = var244.field3864;
                    field8391[field8407++] = var244.field3869;
                    return;
                }
                field8402[field8395++] = -1;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                field8402[field8395++] = 0;
                field8402[field8395++] = 0;
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 6507) {
                field8395 -= 4;
                int var246 = field8402[field8395];
                boolean var247 = field8402[field8395 + 1] == 1;
                int var248 = field8402[field8395 + 2];
                boolean var249 = field8402[field8395 + 3] == 1;
                class110.method768(var246, var247, var248, 0, var249);
                return;
            }
            if (arg0 == 6508) {
                class234.method1415((byte) -69);
                return;
            }
            if (arg0 == 6509) {
                if (class470.field5804 != 7) {
                    return;
                }
                class69.field904 = field8402[--field8395] == 1;
                return;
            }
            if (arg0 == 6510) {
                field8402[field8395++] = class74.field988;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class611.field8310.field8695 = field8402[--field8395] == 1;
                class611.field8310.method2749(class386.field4955, -90);
                return;
            }
            if (arg0 == 6601) {
                field8402[field8395++] = class611.field8310.field8695 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class689.field9558 == class663.field9010) {
            if (arg0 == 6700) {
                int var250 = class216.field2530.method3833(0);
                if (class305.field3866 != -1) {
                    var250++;
                }
                field8402[field8395++] = var250;
                return;
            }
            if (arg0 == 6701) {
                int var251 = field8402[--field8395];
                if (class305.field3866 != -1) {
                    if (var251 == 0) {
                        field8402[field8395++] = class305.field3866;
                        return;
                    }
                    var251--;
                }
                class293 var252 = (class293) class216.field2530.method3830((byte) -38);
                while (var251-- > 0) {
                    var252 = (class293) class216.field2530.method3838((byte) -92);
                }
                field8402[field8395++] = var252.field3727;
                return;
            }
            if (arg0 == 6702) {
                int var253 = field8402[--field8395];
                if (class325.field4062[var253] == null) {
                    field8391[field8407++] = "";
                    return;
                }
                String var254 = class325.field4062[var253][0].field4167;
                if (var254 == null) {
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = var254.substring(0, var254.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var255 = field8402[--field8395];
                if (class325.field4062[var255] == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = class325.field4062[var255].length;
                return;
            }
            if (arg0 == 6704) {
                field8395 -= 2;
                int var256 = field8402[field8395];
                int var257 = field8402[field8395 + 1];
                if (class325.field4062[var256] == null) {
                    field8391[field8407++] = "";
                    return;
                }
                String var258 = class325.field4062[var256][var257].field4167;
                if (var258 == null) {
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = var258;
                return;
            }
            if (arg0 == 6705) {
                field8395 -= 2;
                int var259 = field8402[field8395];
                int var260 = field8402[field8395 + 1];
                if (class325.field4062[var259] == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = class325.field4062[var259][var260].field4314;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field8395 -= 3;
                int var261 = field8402[field8395];
                int var262 = field8402[field8395 + 1];
                int var263 = field8402[field8395 + 2];
                class345.method1991(var263, "", 31281, 1, var261 << 16 | var262);
                return;
            }
            if (arg0 == 6708) {
                field8395 -= 3;
                int var264 = field8402[field8395];
                int var265 = field8402[field8395 + 1];
                int var266 = field8402[field8395 + 2];
                class345.method1991(var266, "", 31281, 2, var264 << 16 | var265);
                return;
            }
            if (arg0 == 6709) {
                field8395 -= 3;
                int var267 = field8402[field8395];
                int var268 = field8402[field8395 + 1];
                int var269 = field8402[field8395 + 2];
                class345.method1991(var269, "", 31281, 3, var267 << 16 | var268);
                return;
            }
            if (arg0 == 6710) {
                field8395 -= 3;
                int var270 = field8402[field8395];
                int var271 = field8402[field8395 + 1];
                int var272 = field8402[field8395 + 2];
                class345.method1991(var272, "", 31281, 4, var270 << 16 | var271);
                return;
            }
            if (arg0 == 6711) {
                field8395 -= 3;
                int var273 = field8402[field8395];
                int var274 = field8402[field8395 + 1];
                int var275 = field8402[field8395 + 2];
                class345.method1991(var275, "", 31281, 5, var273 << 16 | var274);
                return;
            }
            if (arg0 == 6712) {
                field8395 -= 3;
                int var276 = field8402[field8395];
                int var277 = field8402[field8395 + 1];
                int var278 = field8402[field8395 + 2];
                class345.method1991(var278, "", 31281, 6, var276 << 16 | var277);
                return;
            }
            if (arg0 == 6713) {
                field8395 -= 3;
                int var279 = field8402[field8395];
                int var280 = field8402[field8395 + 1];
                int var281 = field8402[field8395 + 2];
                class345.method1991(var281, "", 31281, 7, var279 << 16 | var280);
                return;
            }
            if (arg0 == 6714) {
                field8395 -= 3;
                int var282 = field8402[field8395];
                int var283 = field8402[field8395 + 1];
                int var284 = field8402[field8395 + 2];
                class345.method1991(var284, "", 31281, 8, var282 << 16 | var283);
                return;
            }
            if (arg0 == 6715) {
                field8395 -= 3;
                int var285 = field8402[field8395];
                int var286 = field8402[field8395 + 1];
                int var287 = field8402[field8395 + 2];
                class345.method1991(var287, "", 31281, 9, var285 << 16 | var286);
                return;
            }
            if (arg0 == 6716) {
                field8395 -= 3;
                int var288 = field8402[field8395];
                int var289 = field8402[field8395 + 1];
                int var290 = field8402[field8395 + 2];
                class345.method1991(var290, "", 31281, 10, var288 << 16 | var289);
                return;
            }
            if (arg0 == 6717) {
                field8395 -= 3;
                int var291 = field8402[field8395];
                int var292 = field8402[field8395 + 1];
                int var293 = field8402[field8395 + 2];
                class337 var294 = class680.method3758(true, var291 << 16 | var292, var293);
                class167.method1012(111);
                class357 var295 = client.method1693(var294);
                class136.method872(var294, 0, var295.method2042(-128), var295.field4602);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var296 = field8402[--field8395];
                class663 var297 = class530.field6699.method93(var296, (byte) 83);
                if (var297.field8993 == null) {
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = var297.field8993;
                return;
            }
            if (arg0 == 6801) {
                int var298 = field8402[--field8395];
                class663 var299 = class530.field6699.method93(var298, (byte) 71);
                field8402[field8395++] = var299.field8978;
                return;
            }
            if (arg0 == 6802) {
                int var300 = field8402[--field8395];
                class663 var301 = class530.field6699.method93(var300, (byte) 121);
                field8402[field8395++] = var301.field8982;
                return;
            }
            if (arg0 == 6803) {
                int var302 = field8402[--field8395];
                class663 var303 = class530.field6699.method93(var302, (byte) 73);
                field8402[field8395++] = var303.field8986;
                return;
            }
            if (arg0 == 6804) {
                field8395 -= 2;
                int var304 = field8402[field8395];
                int var305 = field8402[field8395 + 1];
                class362 var306 = class46.field617.method1403(var305, 64);
                if (var306.method2100((byte) 112)) {
                    field8391[field8407++] = class530.field6699.method93(var304, (byte) 107).method3694(var306.field4639, (byte) 25, var305);
                    return;
                }
                field8402[field8395++] = class530.field6699.method93(var304, (byte) 96).method3691(var305, var306.field4635, 117);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field8402[field8395++] = class701.field9811 && !class493.field6149 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field8402[field8395++] = class471.field5827;
                return;
            }
            if (arg0 == 6902) {
                field8402[field8395++] = class366.field4724;
                return;
            }
            if (arg0 == 6903) {
                field8402[field8395++] = class286.field3630;
                return;
            }
            if (arg0 == 6904) {
                field8402[field8395++] = class110.field1373;
                return;
            }
            if (arg0 == 6905) {
                String var307 = "";
                if (class354.field4577 != null) {
                    if (class354.field4577.field2547 == null) {
                        var307 = class122.method804(class354.field4577.field2545, (byte) -90);
                    } else {
                        var307 = (String) class354.field4577.field2547;
                    }
                }
                field8391[field8407++] = var307;
                return;
            }
            if (arg0 == 6906) {
                field8402[field8395++] = class255.field3279;
                return;
            }
            if (arg0 == 6907) {
                field8402[field8395++] = class237.field3063;
                return;
            }
            if (arg0 == 6908) {
                field8402[field8395++] = class671.field9180;
                return;
            }
            if (arg0 == 6909) {
                field8402[field8395++] = class488.field6100 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field8402[field8395++] = class173.field2033;
                return;
            }
            if (arg0 == 6911) {
                field8402[field8395++] = class285.field3610;
                return;
            }
            if (arg0 == 6912) {
                field8402[field8395++] = class217.field2538;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var308 = class611.field8310.method2733((byte) 125);
                field8402[field8395++] = class611.field8310.field6279 = class628.field8526;
                field8402[field8395++] = var308;
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -109);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7001) {
                class611.field8310.method2738(1);
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -109);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7002) {
                class611.field8310.method2747(123);
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -121);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7003) {
                class611.field8310.method2741(-24);
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -125);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7004) {
                class611.field8310.method2737((byte) 56);
                class303.method1800(-28818);
                class611.field8310.method2749(class386.field4955, -109);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7005) {
                class611.field8310.field8687 = 0;
                class611.field8310.method2749(class386.field4955, -80);
                class528.field6662 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class611.field8310.field6279 == 2) {
                    class611.field8310.field6277 = true;
                    return;
                }
                if (class611.field8310.field6279 == 1) {
                    class611.field8310.field6278 = true;
                    return;
                }
                if (class611.field8310.field6279 == 3) {
                    class611.field8310.field6267 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field8402[field8395++] = class611.field8310.field8687;
                return;
            }
            if (arg0 == 7008) {
                if (class628.field8526 == 0 && class357.field4610 < 96) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "()V", line = 4248)
    public static final void method3459() {
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4257)
    private static final void method3460(String arg0, int arg1) {
        if (class146.field1745 == 0 && !(!class701.field9811 || class493.field6149) || class165.field1938) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class671.field9161.method3726((byte) 88, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class671.field9161.method3726((byte) 73, 0).length());
        } else if (var2.startsWith(class671.field9162.method3726((byte) 121, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class671.field9162.method3726((byte) 114, 0).length());
        } else if (var2.startsWith(class671.field9163.method3726((byte) 121, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class671.field9163.method3726((byte) 45, 0).length());
        } else if (var2.startsWith(class671.field9164.method3726((byte) 85, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class671.field9164.method3726((byte) 39, 0).length());
        } else if (var2.startsWith(class671.field9165.method3726((byte) 61, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class671.field9165.method3726((byte) 98, 0).length());
        } else if (var2.startsWith(class671.field9166.method3726((byte) 86, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class671.field9166.method3726((byte) 118, 0).length());
        } else if (var2.startsWith(class671.field9167.method3726((byte) 78, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class671.field9167.method3726((byte) 41, 0).length());
        } else if (var2.startsWith(class671.field9168.method3726((byte) 50, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class671.field9168.method3726((byte) 114, 0).length());
        } else if (var2.startsWith(class671.field9169.method3726((byte) 121, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class671.field9169.method3726((byte) 34, 0).length());
        } else if (var2.startsWith(class671.field9170.method3726((byte) 83, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class671.field9170.method3726((byte) 69, 0).length());
        } else if (var2.startsWith(class671.field9171.method3726((byte) 110, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class671.field9171.method3726((byte) 33, 0).length());
        } else if (var2.startsWith(class671.field9172.method3726((byte) 54, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class671.field9172.method3726((byte) 112, 0).length());
        } else if (class71.field912 != 0) {
            if (var2.startsWith(class671.field9161.method3726((byte) 38, class71.field912))) {
                var3 = 0;
                arg0 = arg0.substring(class671.field9161.method3726((byte) 73, class71.field912).length());
            } else if (var2.startsWith(class671.field9162.method3726((byte) 82, class71.field912))) {
                var3 = 1;
                arg0 = arg0.substring(class671.field9162.method3726((byte) 86, class71.field912).length());
            } else if (var2.startsWith(class671.field9163.method3726((byte) 57, class71.field912))) {
                var3 = 2;
                arg0 = arg0.substring(class671.field9163.method3726((byte) 44, class71.field912).length());
            } else if (var2.startsWith(class671.field9164.method3726((byte) 88, class71.field912))) {
                var3 = 3;
                arg0 = arg0.substring(class671.field9164.method3726((byte) 72, class71.field912).length());
            } else if (var2.startsWith(class671.field9165.method3726((byte) 64, class71.field912))) {
                var3 = 4;
                arg0 = arg0.substring(class671.field9165.method3726((byte) 64, class71.field912).length());
            } else if (var2.startsWith(class671.field9166.method3726((byte) 88, class71.field912))) {
                var3 = 5;
                arg0 = arg0.substring(class671.field9166.method3726((byte) 42, class71.field912).length());
            } else if (var2.startsWith(class671.field9167.method3726((byte) 127, class71.field912))) {
                var3 = 6;
                arg0 = arg0.substring(class671.field9167.method3726((byte) 35, class71.field912).length());
            } else if (var2.startsWith(class671.field9168.method3726((byte) 108, class71.field912))) {
                var3 = 7;
                arg0 = arg0.substring(class671.field9168.method3726((byte) 98, class71.field912).length());
            } else if (var2.startsWith(class671.field9169.method3726((byte) 126, class71.field912))) {
                var3 = 8;
                arg0 = arg0.substring(class671.field9169.method3726((byte) 40, class71.field912).length());
            } else if (var2.startsWith(class671.field9170.method3726((byte) 35, class71.field912))) {
                var3 = 9;
                arg0 = arg0.substring(class671.field9170.method3726((byte) 57, class71.field912).length());
            } else if (var2.startsWith(class671.field9171.method3726((byte) 124, class71.field912))) {
                var3 = 10;
                arg0 = arg0.substring(class671.field9171.method3726((byte) 38, class71.field912).length());
            } else if (var2.startsWith(class671.field9172.method3726((byte) 116, class71.field912))) {
                var3 = 11;
                arg0 = arg0.substring(class671.field9172.method3726((byte) 84, class71.field912).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class671.field9173.method3726((byte) 59, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class671.field9173.method3726((byte) 61, 0).length());
        } else if (var4.startsWith(class671.field9174.method3726((byte) 61, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class671.field9174.method3726((byte) 50, 0).length());
        } else if (var4.startsWith(class671.field9175.method3726((byte) 127, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class671.field9175.method3726((byte) 57, 0).length());
        } else if (var4.startsWith(class671.field9176.method3726((byte) 35, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class671.field9176.method3726((byte) 30, 0).length());
        } else if (var4.startsWith(class671.field9177.method3726((byte) 88, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class671.field9177.method3726((byte) 88, 0).length());
        } else if (class71.field912 != 0) {
            if (var4.startsWith(class671.field9173.method3726((byte) 29, class71.field912))) {
                var5 = 1;
                arg0 = arg0.substring(class671.field9173.method3726((byte) 42, class71.field912).length());
            } else if (var4.startsWith(class671.field9174.method3726((byte) 29, class71.field912))) {
                var5 = 2;
                arg0 = arg0.substring(class671.field9174.method3726((byte) 81, class71.field912).length());
            } else if (var4.startsWith(class671.field9175.method3726((byte) 102, class71.field912))) {
                var5 = 3;
                arg0 = arg0.substring(class671.field9175.method3726((byte) 84, class71.field912).length());
            } else if (var4.startsWith(class671.field9176.method3726((byte) 116, class71.field912))) {
                var5 = 4;
                arg0 = arg0.substring(class671.field9176.method3726((byte) 69, class71.field912).length());
            } else if (var4.startsWith(class671.field9177.method3726((byte) 38, class71.field912))) {
                var5 = 5;
                arg0 = arg0.substring(class671.field9177.method3726((byte) 122, class71.field912).length());
            }
        }
        field8404++;
        class124 var6 = class336.method1924(class6.field62, class636.field8620, (byte) 127);
        var6.field1516.method3090(0, 3);
        int var7 = var6.field1516.field7313;
        var6.field1516.method3090(var3, 3);
        var6.field1516.method3090(var5, 3);
        class561.method2980((byte) -7, arg0, var6.field1516);
        var6.field1516.method3036((byte) -118, var6.field1516.field7313 - var7);
        class197.method1156((byte) 113, var6);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lpw;II)V", line = 4544)
    public static final void method3461(class661 arg0, int arg1, int arg2) {
        class317 var3 = class72.method563(arg0, 6646, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field8408 = new int[var3.field3973];
        field8393 = new String[var3.field3969];
        if (class659.field8943 == var3.field3972 || class382.field4907 == var3.field3972 || class27.field317 == var3.field3972) {
            int var4 = 0;
            int var5 = 0;
            if (class578.field7767 != null) {
                var4 = class578.field7767.field4153;
                var5 = class578.field7767.field4227;
            }
            field8408[0] = class113.field1423.method1074((byte) 124) - var4;
            field8408[1] = class113.field1423.method1078((byte) 116) - var5;
        }
        method3457(var3, 200000);
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(IZ)V", line = 4580)
    private static final void method3462(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field8395 -= 3;
                int var2 = field8402[field8395];
                int var3 = field8402[field8395 + 1];
                int var4 = field8402[field8395 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class337 var5 = class442.method2421(var2, 102);
                if (var5.field4179 == null) {
                    var5.field4179 = new class337[var4 + 1];
                }
                if (var5.field4179.length <= var4) {
                    class337[] var6 = new class337[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4179.length; var7++) {
                        var6[var7] = var5.field4179[var7];
                    }
                    var5.field4179 = var6;
                }
                if (var4 > 0 && var5.field4179[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class337 var8 = new class337();
                var8.field4212 = var3;
                var8.field4190 = var8.field4172 = var5.field4172;
                var8.field4310 = var4;
                var5.field4179[var4] = var8;
                if (arg1) {
                    field8396 = var8;
                } else {
                    field8399 = var8;
                }
                class99.method721((byte) -112, var5);
                return;
            }
            if (arg0 == 101) {
                class337 var9 = arg1 ? field8396 : field8399;
                if (var9.field4310 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class337 var10 = class442.method2421(var9.field4172, 75);
                var10.field4179[var9.field4310] = null;
                class99.method721((byte) -115, var10);
                return;
            }
            if (arg0 == 102) {
                class337 var11 = class442.method2421(field8402[--field8395], 84);
                var11.field4179 = null;
                class99.method721((byte) -35, var11);
                return;
            }
            if (arg0 == 200) {
                field8395 -= 2;
                int var12 = field8402[field8395];
                int var13 = field8402[field8395 + 1];
                class337 var14 = class680.method3758(true, var12, var13);
                if (var14 != null && var13 != -1) {
                    field8402[field8395++] = 1;
                    if (arg1) {
                        field8396 = var14;
                        return;
                    }
                    field8399 = var14;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field8402[--field8395];
                class337 var16 = class442.method2421(var15, 98);
                if (var16 != null) {
                    field8402[field8395++] = 1;
                    if (arg1) {
                        field8396 = var16;
                        return;
                    }
                    field8399 = var16;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field8402[--field8395];
                method3452(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field8402[--field8395];
                method3454(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field8395 -= 2;
                int var19 = field8402[field8395];
                int var20 = field8402[field8395 + 1];
                for (int var21 = 0; var21 < class349.field4480.length; var21++) {
                    if (class349.field4480[var21] == var19) {
                        class67.field815.field4684.method3464((byte) 75, var20, var21, class124.field1510);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class634.field8600.length; var22++) {
                    if (class634.field8600[var22] == var19) {
                        class67.field815.field4684.method3464((byte) 49, var20, var22, class124.field1510);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field8395 -= 2;
                int var23 = field8402[field8395];
                int var24 = field8402[field8395 + 1];
                class67.field815.field4684.method3465((byte) -120, var24, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field8402[--field8395] != 0;
                class67.field815.field4684.method3469(var25, 110);
                return;
            }
            if (arg0 == 411) {
                field8395 -= 2;
                int var26 = field8402[field8395];
                int var27 = field8402[field8395 + 1];
                class67.field815.field4684.method3471(-1, var27, class504.field6287, var26);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class337 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class442.method2421(field8402[--field8395], 104);
            } else {
                var28 = arg1 ? field8396 : field8399;
            }
            if (arg0 == 1000) {
                field8395 -= 4;
                var28.field4222 = field8402[field8395];
                var28.field4303 = field8402[field8395 + 1];
                int var29 = field8402[field8395 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field8402[field8395 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field4273 = (byte) var29;
                var28.field4281 = (byte) var30;
                class99.method721((byte) -48, var28);
                class623.method3473((byte) 73, var28);
                if (var28.field4310 == -1) {
                    class348.method2009(var28.field4172, (byte) 49);
                }
                return;
            }
            if (arg0 == 1001) {
                field8395 -= 4;
                var28.field4306 = field8402[field8395];
                var28.field4239 = field8402[field8395 + 1];
                var28.field4214 = 0;
                var28.field4277 = 0;
                int var31 = field8402[field8395 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field8402[field8395 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field4202 = (byte) var31;
                var28.field4274 = (byte) var32;
                class99.method721((byte) 115, var28);
                class623.method3473((byte) 121, var28);
                if (var28.field4212 == 0) {
                    class480.method2620(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field8402[--field8395] == 1;
                if (var28.field4185 != var33) {
                    var28.field4185 = var33;
                    class99.method721((byte) 127, var28);
                }
                if (var28.field4310 == -1) {
                    class563.method2989(var28.field4172, (byte) 9);
                }
                return;
            }
            if (arg0 == 1004) {
                field8395 -= 2;
                var28.field4215 = field8402[field8395];
                var28.field4163 = field8402[field8395 + 1];
                class99.method721((byte) -20, var28);
                class623.method3473((byte) 73, var28);
                if (var28.field4212 == 0) {
                    class480.method2620(false, var28, -1);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field4157 = field8402[--field8395] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class337 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class442.method2421(field8402[--field8395], 72);
            } else {
                var34 = arg1 ? field8396 : field8399;
            }
            if (arg0 == 1100) {
                field8395 -= 2;
                var34.field4300 = field8402[field8395];
                if (var34.field4300 > var34.field4181 - var34.field4309) {
                    var34.field4300 = var34.field4181 - var34.field4309;
                }
                if (var34.field4300 < 0) {
                    var34.field4300 = 0;
                }
                var34.field4208 = field8402[field8395 + 1];
                if (var34.field4208 > var34.field4280 - var34.field4211) {
                    var34.field4208 = var34.field4280 - var34.field4211;
                }
                if (var34.field4208 < 0) {
                    var34.field4208 = 0;
                }
                class99.method721((byte) 105, var34);
                if (var34.field4310 == -1) {
                    class675.method3741(var34.field4172, false);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field4184 = field8402[--field8395];
                class99.method721((byte) 110, var34);
                if (var34.field4310 == -1) {
                    class404.method2274(var34.field4172, 81);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field4246 = field8402[--field8395] == 1;
                class99.method721((byte) 117, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field4192 = field8402[--field8395];
                class99.method721((byte) 125, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field4196 = field8402[--field8395];
                class99.method721((byte) 115, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field8402[--field8395];
                if (var34.field4275 != var35) {
                    var34.field4275 = var35;
                    class99.method721((byte) -124, var34);
                }
                if (var34.field4310 == -1) {
                    class132.method857((byte) 126, var34.field4172);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field4248 = field8402[--field8395];
                class99.method721((byte) 111, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field4217 = field8402[--field8395] == 1;
                class99.method721((byte) -77, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field4158 = 1;
                var34.field4266 = field8402[--field8395];
                class99.method721((byte) -19, var34);
                if (var34.field4310 == -1) {
                    class266.method1585(var34.field4172, (byte) 111);
                }
                return;
            }
            if (arg0 == 1109) {
                field8395 -= 6;
                var34.field4262 = field8402[field8395];
                var34.field4175 = field8402[field8395 + 1];
                var34.field4284 = field8402[field8395 + 2];
                var34.field4182 = field8402[field8395 + 3];
                var34.field4238 = field8402[field8395 + 4];
                var34.field4194 = field8402[field8395 + 5];
                class99.method721((byte) 107, var34);
                if (var34.field4310 == -1) {
                    class489.method2657(var34.field4172, -121);
                    class290.method1744(var34.field4172, (byte) 123);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field8402[--field8395];
                if (var34.field4256 != var36) {
                    var34.field4256 = var36;
                    var34.field4315 = 0;
                    var34.field4159 = 1;
                    var34.field4264 = 0;
                    class207 var37 = var34.field4256 == -1 ? null : class11.field110.method1141(var34.field4256, (byte) 115);
                    if (var37 != null) {
                        class309.method1829(true, var34.field4315, var37);
                    }
                    class99.method721((byte) 114, var34);
                }
                if (var34.field4310 == -1) {
                    class334.method1919(-14732, var34.field4172);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field4177 = field8402[--field8395] == 1;
                class99.method721((byte) 126, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field8391[--field8407];
                if (!var38.equals(var34.field4200)) {
                    var34.field4200 = var38;
                    class99.method721((byte) 117, var34);
                }
                if (var34.field4310 == -1) {
                    class38.method249(var34.field4172, -10304);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field4294 = field8402[--field8395];
                class99.method721((byte) -114, var34);
                if (var34.field4310 == -1) {
                    class67.method528(var34.field4172, 93);
                }
                return;
            }
            if (arg0 == 1114) {
                field8395 -= 3;
                var34.field4317 = field8402[field8395];
                var34.field4218 = field8402[field8395 + 1];
                var34.field4319 = field8402[field8395 + 2];
                class99.method721((byte) -127, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field4160 = field8402[--field8395] == 1;
                class99.method721((byte) 117, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field4150 = field8402[--field8395];
                class99.method721((byte) -38, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field4259 = field8402[--field8395];
                class99.method721((byte) -88, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field4161 = field8402[--field8395] == 1;
                class99.method721((byte) 124, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field4154 = field8402[--field8395] == 1;
                class99.method721((byte) 108, var34);
                return;
            }
            if (arg0 == 1120) {
                field8395 -= 2;
                var34.field4181 = field8402[field8395];
                var34.field4280 = field8402[field8395 + 1];
                class99.method721((byte) 106, var34);
                if (var34.field4212 == 0) {
                    class480.method2620(false, var34, -1);
                }
                return;
            }
            if (arg0 == 1121) {
                field8395 -= 2;
                var34.field4174 = (short) field8402[field8395];
                var34.field4223 = (short) field8402[field8395 + 1];
                class99.method721((byte) -111, var34);
                return;
            }
            if (arg0 == 1122) {
                var34.field4201 = field8402[--field8395] == 1;
                class99.method721((byte) 120, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field4194 = field8402[--field8395];
                class99.method721((byte) 105, var34);
                if (var34.field4310 == -1) {
                    class489.method2657(var34.field4172, -56);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field8402[--field8395];
                var34.field4237 = var39 == 1;
                class99.method721((byte) 117, var34);
                return;
            }
            if (arg0 == 1125) {
                field8395 -= 2;
                var34.field4269 = field8402[field8395];
                var34.field4253 = field8402[field8395 + 1];
                class99.method721((byte) 106, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field4245 = field8402[--field8395];
                class99.method721((byte) -106, var34);
                return;
            }
            if (arg0 == 1127) {
                field8395 -= 2;
                int var40 = field8402[field8395];
                int var41 = field8402[field8395 + 1];
                class362 var42 = class46.field617.method1403(var40, 64);
                if (var42.field4635 != var41) {
                    var34.method1931((byte) -101, var40, var41);
                    return;
                }
                var34.method1934(98, var40);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field8402[--field8395];
                String var44 = field8391[--field8407];
                class362 var45 = class46.field617.method1403(var43, 64);
                if (!var45.field4639.equals(var44)) {
                    var34.method1933(-103, var43, var44);
                    return;
                }
                var34.method1934(123, var43);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class337 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class442.method2421(field8402[--field8395], 82);
            } else {
                var46 = arg1 ? field8396 : field8399;
            }
            class99.method721((byte) -56, var46);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field8395 -= 2;
                int var47 = field8402[field8395];
                int var48 = field8402[field8395 + 1];
                if (var46.field4310 == -1) {
                    class456.method2510(var46.field4172, -18684);
                    class489.method2657(var46.field4172, -34);
                    class290.method1744(var46.field4172, (byte) 123);
                }
                if (var47 == -1) {
                    var46.field4158 = 1;
                    var46.field4266 = -1;
                    var46.field4252 = -1;
                    return;
                }
                var46.field4252 = var47;
                var46.field4229 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field4297 = true;
                } else {
                    var46.field4297 = false;
                }
                class68 var49 = class504.field6287.method1628(var47, (byte) -85);
                var46.field4284 = var49.field863;
                var46.field4182 = var49.field883;
                var46.field4238 = var49.field894;
                var46.field4262 = var49.field876;
                var46.field4175 = var49.field819;
                var46.field4194 = var49.field835;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field4219 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field4219 = 1;
                } else {
                    var46.field4219 = 2;
                }
                if (var46.field4214 > 0) {
                    var46.field4194 = var46.field4194 * 32 / var46.field4214;
                    return;
                }
                if (var46.field4306 > 0) {
                    var46.field4194 = var46.field4194 * 32 / var46.field4306;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field4158 = 2;
                var46.field4266 = field8402[--field8395];
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 108);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field4158 = 3;
                var46.field4266 = -1;
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 81);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field4158 = 6;
                var46.field4266 = field8402[--field8395];
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 61);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field4158 = 5;
                var46.field4266 = field8402[--field8395];
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 55);
                }
                return;
            }
            if (arg0 == 1206) {
                field8395 -= 4;
                var46.field4267 = field8402[field8395];
                var46.field4288 = field8402[field8395 + 1];
                var46.field4299 = field8402[field8395 + 2];
                var46.field4282 = field8402[field8395 + 3];
                class99.method721((byte) -65, var46);
                return;
            }
            if (arg0 == 1207) {
                field8395 -= 2;
                var46.field4176 = field8402[field8395];
                var46.field4233 = field8402[field8395 + 1];
                class99.method721((byte) -85, var46);
                return;
            }
            if (arg0 == 1210) {
                field8395 -= 4;
                var46.field4266 = field8402[field8395];
                var46.field4313 = field8402[field8395 + 1];
                if (field8402[field8395 + 2] == 1) {
                    var46.field4158 = 9;
                } else {
                    var46.field4158 = 8;
                }
                if (field8402[field8395 + 3] == 1) {
                    var46.field4297 = true;
                } else {
                    var46.field4297 = false;
                }
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 61);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field4158 = 5;
                var46.field4266 = class350.field4523;
                var46.field4313 = 0;
                if (var46.field4310 == -1) {
                    class266.method1585(var46.field4172, (byte) 86);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class337 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class442.method2421(field8402[--field8395], 54);
            } else {
                var50 = arg1 ? field8396 : field8399;
            }
            if (arg0 == 1300) {
                int var51 = field8402[--field8395] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method1935(-108, field8391[--field8407], var51);
                    return;
                }
                field8407--;
                return;
            }
            if (arg0 == 1301) {
                field8395 -= 2;
                int var52 = field8402[field8395];
                int var53 = field8402[field8395 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field4198 = null;
                    return;
                }
                var50.field4198 = class680.method3758(true, var52, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field8402[--field8395];
                if (class381.field4890 != var54 && class512.field6420 != var54 && class586.field7873 != var54) {
                    return;
                }
                var50.field4305 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field4155 = field8402[--field8395];
                return;
            }
            if (arg0 == 1304) {
                var50.field4178 = field8402[--field8395];
                return;
            }
            if (arg0 == 1305) {
                var50.field4272 = field8391[--field8407];
                return;
            }
            if (arg0 == 1306) {
                var50.field4231 = field8391[--field8407];
                return;
            }
            if (arg0 == 1307) {
                var50.field4242 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field4287 = field8402[--field8395];
                var50.field4213 = field8402[--field8395];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field8402[--field8395];
                int var56 = field8402[--field8395];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method1936(var55, var56 - 1, 65535);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field4166 = field8391[--field8407];
                return;
            }
            if (arg0 == 1311) {
                var50.field4263 = field8402[--field8395];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field8395 -= 3;
                    var57 = field8402[field8395] - 1;
                    var58 = field8402[field8395 + 1];
                    var59 = field8402[field8395 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field8395 -= 2;
                    var57 = 10;
                    var58 = field8402[field8395];
                    var59 = field8402[field8395 + 1];
                }
                if (var50.field4257 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field4257 = new byte[11];
                    var50.field4285 = new byte[11];
                    var50.field4251 = new int[11];
                }
                var50.field4257[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field4268 = false;
                    for (int var60 = 0; var60 < var50.field4257.length; var60++) {
                        if (var50.field4257[var60] != 0) {
                            var50.field4268 = true;
                            break;
                        }
                    }
                } else {
                    var50.field4268 = true;
                }
                var50.field4285[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field4203 = field8402[--field8395];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class337 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class442.method2421(field8402[--field8395], 99);
            } else {
                var61 = arg1 ? field8396 : field8399;
            }
            if (arg0 == 1499) {
                var61.method1926((byte) 105);
                return;
            }
            String var62 = field8391[--field8407];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field8402[--field8395];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field8402[--field8395];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field8391[--field8407];
                } else {
                    var65[var66] = Integer.valueOf(field8402[--field8395]);
                }
            }
            int var67 = field8402[--field8395];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field4254 = var65;
            } else if (arg0 == 1401) {
                var61.field4228 = var65;
            } else if (arg0 == 1402) {
                var61.field4151 = var65;
            } else if (arg0 == 1403) {
                var61.field4189 = var65;
            } else if (arg0 == 1404) {
                var61.field4234 = var65;
            } else if (arg0 == 1405) {
                var61.field4260 = var65;
            } else if (arg0 == 1406) {
                var61.field4193 = var65;
            } else if (arg0 == 1407) {
                var61.field4205 = var65;
                var61.field4304 = var63;
            } else if (arg0 == 1408) {
                var61.field4240 = var65;
            } else if (arg0 == 1409) {
                var61.field4164 = var65;
            } else if (arg0 == 1410) {
                var61.field4162 = var65;
            } else if (arg0 == 1411) {
                var61.field4290 = var65;
            } else if (arg0 == 1412) {
                var61.field4204 = var65;
            } else if (arg0 == 1414) {
                var61.field4206 = var65;
                var61.field4278 = var63;
            } else if (arg0 == 1415) {
                var61.field4170 = var65;
                var61.field4292 = var63;
            } else if (arg0 == 1416) {
                var61.field4156 = var65;
            } else if (arg0 == 1417) {
                var61.field4187 = var65;
            } else if (arg0 == 1418) {
                var61.field4209 = var65;
            } else if (arg0 == 1419) {
                var61.field4180 = var65;
            } else if (arg0 == 1420) {
                var61.field4296 = var65;
            } else if (arg0 == 1421) {
                var61.field4183 = var65;
            } else if (arg0 == 1422) {
                var61.field4247 = var65;
            } else if (arg0 == 1423) {
                var61.field4210 = var65;
            } else if (arg0 == 1424) {
                var61.field4243 = var65;
            } else if (arg0 == 1425) {
                var61.field4307 = var65;
            } else if (arg0 == 1426) {
                var61.field4216 = var65;
            } else if (arg0 == 1427) {
                var61.field4232 = var65;
            } else if (arg0 == 1428) {
                var61.field4230 = var65;
                var61.field4295 = var63;
            } else if (arg0 == 1429) {
                var61.field4169 = var65;
                var61.field4291 = var63;
            } else if (arg0 == 1430) {
                var61.field4225 = var65;
            }
            var61.field4276 = true;
            return;
        } else if (arg0 < 1600) {
            class337 var68 = arg1 ? field8396 : field8399;
            if (arg0 == 1500) {
                field8402[field8395++] = var68.field4153;
                return;
            }
            if (arg0 == 1501) {
                field8402[field8395++] = var68.field4227;
                return;
            }
            if (arg0 == 1502) {
                field8402[field8395++] = var68.field4309;
                return;
            }
            if (arg0 == 1503) {
                field8402[field8395++] = var68.field4211;
                return;
            }
            if (arg0 == 1504) {
                field8402[field8395++] = var68.field4185 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field8402[field8395++] = var68.field4190;
                return;
            }
            if (arg0 == 1506) {
                class337 var69 = class329.method1887(var68, true);
                field8402[field8395++] = var69 == null ? -1 : var69.field4172;
                return;
            }
        } else if (arg0 < 1700) {
            class337 var70 = arg1 ? field8396 : field8399;
            if (arg0 == 1600) {
                field8402[field8395++] = var70.field4300;
                return;
            }
            if (arg0 == 1601) {
                field8402[field8395++] = var70.field4208;
                return;
            }
            if (arg0 == 1602) {
                field8391[field8407++] = var70.field4200;
                return;
            }
            if (arg0 == 1603) {
                field8402[field8395++] = var70.field4181;
                return;
            }
            if (arg0 == 1604) {
                field8402[field8395++] = var70.field4280;
                return;
            }
            if (arg0 == 1605) {
                field8402[field8395++] = var70.field4194;
                return;
            }
            if (arg0 == 1606) {
                field8402[field8395++] = var70.field4284;
                return;
            }
            if (arg0 == 1607) {
                field8402[field8395++] = var70.field4238;
                return;
            }
            if (arg0 == 1608) {
                field8402[field8395++] = var70.field4182;
                return;
            }
            if (arg0 == 1609) {
                field8402[field8395++] = var70.field4192;
                return;
            }
            if (arg0 == 1610) {
                field8402[field8395++] = var70.field4262;
                return;
            }
            if (arg0 == 1611) {
                field8402[field8395++] = var70.field4175;
                return;
            }
            if (arg0 == 1612) {
                field8402[field8395++] = var70.field4275;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field8402[--field8395];
                class362 var72 = class46.field617.method1403(var71, 64);
                if (var72.method2100((byte) 125)) {
                    field8391[field8407++] = var70.method1939(1, var71, var72.field4639);
                    return;
                }
                field8402[field8395++] = var70.method1928(-29535, var71, var72.field4635);
                return;
            }
            if (arg0 == 1614) {
                field8402[field8395++] = var70.field4248;
                return;
            }
        } else if (arg0 < 1800) {
            class337 var73 = arg1 ? field8396 : field8399;
            if (arg0 == 1700) {
                field8402[field8395++] = var73.field4252;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field4252 != -1) {
                    field8402[field8395++] = var73.field4229;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field8402[field8395++] = var73.field4310;
                return;
            }
        } else if (arg0 < 1900) {
            class337 var74 = arg1 ? field8396 : field8399;
            if (arg0 == 1800) {
                field8402[field8395++] = client.method1693(var74).method2042(-122);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field8402[--field8395];
                int var352 = var75 - 1;
                if (var74.field4242 != null && var352 < var74.field4242.length && var74.field4242[var352] != null) {
                    field8391[field8407++] = var74.field4242[var352];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field4272 == null) {
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = var74.field4272;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class337 var350;
            if (arg0 >= 2000) {
                var350 = class442.method2421(field8402[--field8395], 81);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field8396 : field8399;
            }
            if (field8416 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field4232 == null) {
                    return;
                }
                class402 var351 = new class402();
                var351.field5154 = var350;
                var351.field5153 = var350.field4232;
                var351.field5151 = field8416 + 1;
                class144.field1743.method1904(var351, -81);
                return;
            }
        } else if (arg0 < 2600) {
            class337 var76 = class442.method2421(field8402[--field8395], 68);
            if (arg0 == 2500) {
                field8402[field8395++] = var76.field4153;
                return;
            }
            if (arg0 == 2501) {
                field8402[field8395++] = var76.field4227;
                return;
            }
            if (arg0 == 2502) {
                field8402[field8395++] = var76.field4309;
                return;
            }
            if (arg0 == 2503) {
                field8402[field8395++] = var76.field4211;
                return;
            }
            if (arg0 == 2504) {
                field8402[field8395++] = var76.field4185 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field8402[field8395++] = var76.field4190;
                return;
            }
            if (arg0 == 1506) {
                class337 var77 = class329.method1887(var76, true);
                field8402[field8395++] = var77 == null ? -1 : var77.field4172;
                return;
            }
        } else if (arg0 < 2700) {
            class337 var78 = class442.method2421(field8402[--field8395], 117);
            if (arg0 == 2600) {
                field8402[field8395++] = var78.field4300;
                return;
            }
            if (arg0 == 2601) {
                field8402[field8395++] = var78.field4208;
                return;
            }
            if (arg0 == 2602) {
                field8391[field8407++] = var78.field4200;
                return;
            }
            if (arg0 == 2603) {
                field8402[field8395++] = var78.field4181;
                return;
            }
            if (arg0 == 2604) {
                field8402[field8395++] = var78.field4280;
                return;
            }
            if (arg0 == 2605) {
                field8402[field8395++] = var78.field4194;
                return;
            }
            if (arg0 == 2606) {
                field8402[field8395++] = var78.field4284;
                return;
            }
            if (arg0 == 2607) {
                field8402[field8395++] = var78.field4238;
                return;
            }
            if (arg0 == 2608) {
                field8402[field8395++] = var78.field4182;
                return;
            }
            if (arg0 == 2609) {
                field8402[field8395++] = var78.field4192;
                return;
            }
            if (arg0 == 2610) {
                field8402[field8395++] = var78.field4262;
                return;
            }
            if (arg0 == 2611) {
                field8402[field8395++] = var78.field4175;
                return;
            }
            if (arg0 == 2612) {
                field8402[field8395++] = var78.field4275;
                return;
            }
            if (arg0 == 2613) {
                field8402[field8395++] = var78.field4248;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class337 var79 = class442.method2421(field8402[--field8395], 100);
                field8402[field8395++] = var79.field4252;
                return;
            }
            if (arg0 == 2701) {
                class337 var80 = class442.method2421(field8402[--field8395], 77);
                if (var80.field4252 != -1) {
                    field8402[field8395++] = var80.field4229;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field8402[--field8395];
                class293 var82 = (class293) class216.field2530.method3828((long) var81, (byte) -91);
                if (var82 != null) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class337 var83 = class442.method2421(field8402[--field8395], 61);
                if (var83.field4179 == null) {
                    field8402[field8395++] = 0;
                    return;
                }
                int var84 = var83.field4179.length;
                for (int var85 = 0; var85 < var83.field4179.length; var85++) {
                    if (var83.field4179[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field8402[field8395++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field8395 -= 2;
                int var86 = field8402[field8395];
                int var87 = field8402[field8395 + 1];
                class293 var88 = (class293) class216.field2530.method3828((long) var86, (byte) -91);
                if (var88 != null && var88.field3727 == var87) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class337 var89 = class442.method2421(field8402[--field8395], 110);
            if (arg0 == 2800) {
                field8402[field8395++] = client.method1693(var89).method2042(-120);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field8402[--field8395];
                int var353 = var90 - 1;
                if (var89.field4242 != null && var353 < var89.field4242.length && var89.field4242[var353] != null) {
                    field8391[field8407++] = var89.field4242[var353];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field4272 == null) {
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = var89.field4272;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field8391[--field8407];
                class705.method3890(var91, (byte) -110);
                return;
            }
            if (arg0 == 3101) {
                field8395 -= 2;
                class502.method2730(field8402[field8395], class67.field815, (byte) 127, field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 3103) {
                class29.method176(0, true);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field8391[--field8407];
                int var93 = 0;
                if (class485.method2639(var92, true)) {
                    var93 = class504.method2750(var92, 10);
                }
                field8401++;
                class124 var94 = class336.method1924(class546.field6868, class636.field8620, (byte) -81);
                var94.field1516.method3061(var93, (byte) 115);
                class197.method1156((byte) 119, var94);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field8391[--field8407];
                field8388++;
                class124 var96 = class336.method1924(class688.field9485, class636.field8620, (byte) 89);
                var96.field1516.method3090(var95.length() + 1, 3);
                var96.field1516.method3050(false, var95);
                class197.method1156((byte) 117, var96);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field8391[--field8407];
                field8390++;
                class124 var98 = class336.method1924(class613.field8331, class636.field8620, (byte) 120);
                var98.field1516.method3090(var97.length() + 1, 3);
                var98.field1516.method3050(false, var97);
                class197.method1156((byte) 104, var98);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field8402[--field8395];
                String var100 = field8391[--field8407];
                class67.method529(var99, -123, var100);
                return;
            }
            if (arg0 == 3108) {
                field8395 -= 3;
                int var101 = field8402[field8395];
                int var102 = field8402[field8395 + 1];
                int var103 = field8402[field8395 + 2];
                class337 var104 = class442.method2421(var103, 110);
                class522.method2822(var104, var102, 65535, var101);
                return;
            }
            if (arg0 == 3109) {
                field8395 -= 2;
                int var105 = field8402[field8395];
                int var106 = field8402[field8395 + 1];
                class337 var107 = arg1 ? field8396 : field8399;
                class522.method2822(var107, var106, 65535, var105);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field8402[--field8395];
                field8397++;
                class124 var109 = class336.method1924(class268.field3387, class636.field8620, (byte) -71);
                var109.field1516.method3080((byte) -64, var108);
                class197.method1156((byte) 87, var109);
                return;
            }
            if (arg0 == 3111) {
                field8395 -= 2;
                int var110 = field8402[field8395];
                int var111 = field8402[field8395 + 1];
                class293 var112 = (class293) class216.field2530.method3828((long) var110, (byte) -91);
                if (var112 != null) {
                    class190.method1128(true, -116, var112.field3727 != var111, var112);
                }
                class99.method723(3, var110, (byte) 29, var111, true);
                return;
            }
            if (arg0 == 3112) {
                field8395--;
                int var113 = field8402[field8395];
                class293 var114 = (class293) class216.field2530.method3828((long) var113, (byte) -91);
                if (var114 != null && var114.field3729 == 3) {
                    class190.method1128(true, -90, true, var114);
                }
                return;
            }
            if (arg0 == 3113) {
                class289.method1736(0, field8391[--field8407]);
                return;
            }
            if (arg0 == 3114) {
                field8395 -= 2;
                int var115 = field8402[field8395];
                int var116 = field8402[field8395 + 1];
                String var117 = field8391[--field8407];
                class417.method2324("", "", "", var117, var116, (byte) -95, var115);
                return;
            }
            if (arg0 == 3115) {
                field8395 -= 11;
                class580[] var118 = class682.method3772((byte) -80);
                class241[] var119 = class457.method2517(false);
                class11.method52(field8402[field8395 + 9], field8402[field8395 + 5], field8402[field8395 + 2], var119[field8402[field8395 + 1]], field8402[field8395 + 10], field8402[field8395 + 8], field8402[field8395 + 6], field8402[field8395 + 7], (byte) 48, field8402[field8395 + 4], field8402[field8395 + 3], var118[field8402[field8395]]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field8395 -= 3;
                class132.method852(255, (byte) -47, field8402[field8395], field8402[field8395 + 2], field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 3201) {
                class571.method3029(field8402[--field8395], 50, 61, 255);
                return;
            }
            if (arg0 == 3202) {
                field8395 -= 2;
                class269.method1595(255, field8402[field8395 + 1], field8402[field8395], 1588775720);
                return;
            }
            if (arg0 == 3203) {
                field8395 -= 4;
                class132.method852(field8402[field8395 + 3], (byte) -47, field8402[field8395], field8402[field8395 + 2], field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 3204) {
                field8395 -= 3;
                class571.method3029(field8402[field8395], field8402[field8395 + 2], 107, field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field8395 -= 3;
                class269.method1595(field8402[field8395 + 2], field8402[field8395 + 1], field8402[field8395], 1588775720);
                return;
            }
            if (arg0 == 3206) {
                field8395 -= 4;
                class606.method3374(field8402[field8395], (byte) 103, field8402[field8395 + 2], field8402[field8395 + 3], false, field8402[field8395 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field8395 -= 4;
                class606.method3374(field8402[field8395], (byte) 127, field8402[field8395 + 2], field8402[field8395 + 3], true, field8402[field8395 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field8402[field8395++] = class665.field9027;
                return;
            }
            if (arg0 == 3301) {
                field8395 -= 2;
                int var120 = field8402[field8395];
                int var121 = field8402[field8395 + 1];
                field8402[field8395++] = class30.method193(var120, var121, false, (byte) 103);
                return;
            }
            if (arg0 == 3302) {
                field8395 -= 2;
                int var122 = field8402[field8395];
                int var123 = field8402[field8395 + 1];
                field8402[field8395++] = class404.method2272(var122, var123, (byte) 86, false);
                return;
            }
            if (arg0 == 3303) {
                field8395 -= 2;
                int var124 = field8402[field8395];
                int var125 = field8402[field8395 + 1];
                field8402[field8395++] = class154.method945(-509, var125, false, var124);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field8402[--field8395];
                field8402[field8395++] = class131.field1587.method706(var126, 19147).field9875;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field8402[--field8395];
                field8402[field8395++] = class607.field8280[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field8402[--field8395];
                field8402[field8395++] = class608.field8282[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field8402[--field8395];
                field8402[field8395++] = class356.field4587[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class67.field815.field8010;
                int var131 = (class67.field815.field8018 >> 9) + class227.field2938;
                int var132 = (class67.field815.field8011 >> 9) + class522.field6612;
                field8402[field8395++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field8402[--field8395];
                field8402[field8395++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field8402[--field8395];
                field8402[field8395++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field8402[--field8395];
                field8402[field8395++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field8402[field8395++] = class196.field2308 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field8395 -= 2;
                int var136 = field8402[field8395];
                int var137 = field8402[field8395 + 1];
                field8402[field8395++] = class30.method193(var136, var137, true, (byte) 102);
                return;
            }
            if (arg0 == 3314) {
                field8395 -= 2;
                int var138 = field8402[field8395];
                int var139 = field8402[field8395 + 1];
                field8402[field8395++] = class404.method2272(var138, var139, (byte) 86, true);
                return;
            }
            if (arg0 == 3315) {
                field8395 -= 2;
                int var140 = field8402[field8395];
                int var141 = field8402[field8395 + 1];
                field8402[field8395++] = class154.method945(-509, var141, true, var140);
                return;
            }
            if (arg0 == 3316) {
                if (class146.field1745 >= 2) {
                    field8402[field8395++] = class146.field1745;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field8402[field8395++] = class675.field9221;
                return;
            }
            if (arg0 == 3318) {
                field8402[field8395++] = class360.field4628.field3030;
                return;
            }
            if (arg0 == 3321) {
                field8402[field8395++] = class55.field702;
                return;
            }
            if (arg0 == 3322) {
                field8402[field8395++] = class536.field6753;
                return;
            }
            if (arg0 == 3323) {
                if (class185.field2187 >= 5 && class185.field2187 <= 9) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class185.field2187 >= 5 && class185.field2187 <= 9) {
                    field8402[field8395++] = class185.field2187;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field8402[field8395++] = class700.field9795 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field8402[field8395++] = class67.field815.field4674;
                return;
            }
            if (arg0 == 3327) {
                field8402[field8395++] = class67.field815.field4684.field8429 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field8402[field8395++] = class165.field1938 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field8402[--field8395];
                field8402[field8395++] = class220.method1262(var142, 4096, false);
                return;
            }
            if (arg0 == 3331) {
                field8395 -= 2;
                int var143 = field8402[field8395];
                int var144 = field8402[field8395 + 1];
                field8402[field8395++] = class83.method634(var144, false, false, 7, var143);
                return;
            }
            if (arg0 == 3332) {
                field8395 -= 2;
                int var145 = field8402[field8395];
                int var146 = field8402[field8395 + 1];
                field8402[field8395++] = class83.method634(var146, true, false, 7, var145);
                return;
            }
            if (arg0 == 3333) {
                field8402[field8395++] = class139.field1674;
                return;
            }
            if (arg0 == 3335) {
                field8402[field8395++] = class71.field912;
                return;
            }
            if (arg0 == 3336) {
                field8395 -= 4;
                int var147 = field8402[field8395];
                int var148 = field8402[field8395 + 1];
                int var149 = field8402[field8395 + 2];
                int var150 = field8402[field8395 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field8402[field8395++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field8402[field8395++] = class594.field7969;
                return;
            }
            if (arg0 == 3338) {
                field8402[field8395++] = class141.method889(-80);
                return;
            }
            if (arg0 == 3339) {
                field8402[field8395++] = class614.field8343 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field8402[field8395++] = class205.field2372 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field8402[field8395++] = class26.field310 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field8402[field8395++] = class113.field1423.method1074((byte) -83);
                return;
            }
            if (arg0 == 3343) {
                field8402[field8395++] = class113.field1423.method1078((byte) 117);
                return;
            }
            if (arg0 == 3344) {
                field8391[field8407++] = class396.method2244(1);
                return;
            }
            if (arg0 == 3345) {
                field8391[field8407++] = class77.method605(1);
                return;
            }
            if (arg0 == 3346) {
                field8402[field8395++] = class64.method519(31043);
                return;
            }
            if (arg0 == 3347) {
                field8402[field8395++] = class211.field2496;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field8395 -= 2;
                int var154 = field8402[field8395];
                int var155 = field8402[field8395 + 1];
                class250 var156 = class156.field1837.method3592(false, var154);
                field8391[field8407++] = var156.method1502(18932, var155);
                return;
            }
            if (arg0 == 3408) {
                field8395 -= 4;
                int var157 = field8402[field8395];
                int var158 = field8402[field8395 + 1];
                int var159 = field8402[field8395 + 2];
                int var160 = field8402[field8395 + 3];
                class250 var161 = class156.field1837.method3592(false, var159);
                if (var161.field3213 == var157 && var161.field3225 == var158) {
                    if (var158 == 115) {
                        field8391[field8407++] = var161.method1502(18932, var160);
                        return;
                    }
                    field8402[field8395++] = var161.method1499(var160, true);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field8395 -= 3;
                int var162 = field8402[field8395];
                int var163 = field8402[field8395 + 1];
                int var164 = field8402[field8395 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class250 var165 = class156.field1837.method3592(false, var163);
                if (var165.field3225 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field8402[field8395++] = var165.method1505(false, var164) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field8402[--field8395];
                String var167 = field8391[--field8407];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class250 var168 = class156.field1837.method3592(false, var166);
                if (var168.field3225 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field8402[field8395++] = var168.method1501(var167, (byte) -25) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field8402[--field8395];
                class250 var170 = class156.field1837.method3592(false, var169);
                field8402[field8395++] = var170.field3211.method3833(0);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class254.field3274 == 0) {
                    field8402[field8395++] = -2;
                    return;
                }
                if (class254.field3274 == 1) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = class284.field3600;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field8402[--field8395];
                if (class254.field3274 == 2 && var171 < class284.field3600) {
                    field8391[field8407++] = class136.field1659[var171];
                    if (class392.field5015[var171] != null) {
                        field8391[field8407++] = class392.field5015[var171];
                        return;
                    }
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = "";
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field8402[--field8395];
                if (class254.field3274 == 2 && var172 < class284.field3600) {
                    field8402[field8395++] = class618.field8380[var172];
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field8402[--field8395];
                if (class254.field3274 == 2 && var173 < class284.field3600) {
                    field8402[field8395++] = class65.field790[var173];
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field8391[--field8407];
                int var175 = field8402[--field8395];
                class387.method2213(var174, 1, var175);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field8391[--field8407];
                class365.method2128((byte) -108, var176);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field8391[--field8407];
                class79.method614(var177, 1);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field8391[--field8407];
                class496.method2701((byte) -49, var178, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field8391[--field8407];
                class126.method828(var179, -128);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field8391[--field8407];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field8402[field8395++] = class347.method2003(var180, (byte) 22) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field8402[--field8395];
                if (class254.field3274 == 2 && var181 < class284.field3600) {
                    field8391[field8407++] = class413.field5289[var181];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class136.field1664 != null) {
                    field8391[field8407++] = class418.method2327((byte) 103, class136.field1664);
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class136.field1664 != null) {
                    field8402[field8395++] = class348.field4476;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field8402[--field8395];
                if (class136.field1664 != null && var182 < class348.field4476) {
                    field8391[field8407++] = class485.field6032[var182].field2252;
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field8402[--field8395];
                if (class136.field1664 != null && var183 < class348.field4476) {
                    field8402[field8395++] = class485.field6032[var183].field2249;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field8402[--field8395];
                if (class136.field1664 != null && var184 < class348.field4476) {
                    field8402[field8395++] = class485.field6032[var184].field2251;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field8402[field8395++] = class534.field6736;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field8391[--field8407];
                class72.method571((byte) -33, var185);
                return;
            }
            if (arg0 == 3618) {
                field8402[field8395++] = class92.field1181;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field8391[--field8407];
                class324.method1868(-5, var186);
                return;
            }
            if (arg0 == 3620) {
                class83.method632(-68);
                return;
            }
            if (arg0 == 3621) {
                if (class254.field3274 == 0) {
                    field8402[field8395++] = -1;
                    return;
                }
                field8402[field8395++] = class189.field2253;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field8402[--field8395];
                if (class254.field3274 != 0 && var187 < class189.field2253) {
                    field8391[field8407++] = class594.field7963[var187];
                    if (class599.field8033[var187] != null) {
                        field8391[field8407++] = class599.field8033[var187];
                        return;
                    }
                    field8391[field8407++] = "";
                    return;
                }
                field8391[field8407++] = "";
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field8391[--field8407];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field8402[field8395++] = class366.method2133((byte) 87, var188) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field8402[--field8395];
                if (class485.field6032 != null && var189 < class348.field4476 && class485.field6032[var189].field2254.equalsIgnoreCase(class67.field815.field4673)) {
                    field8402[field8395++] = 1;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class26.field311 != null) {
                    field8391[field8407++] = class26.field311;
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field8402[--field8395];
                if (class136.field1664 != null && var190 < class348.field4476) {
                    field8391[field8407++] = class485.field6032[var190].field2248;
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field8402[--field8395];
                if (class254.field3274 == 2 && var191 >= 0 && var191 < class284.field3600) {
                    field8402[field8395++] = class267.field3373[var191] ? 1 : 0;
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field8391[--field8407];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field8402[field8395++] = class508.method2773((byte) 126, var192);
                return;
            }
            if (arg0 == 3629) {
                field8402[field8395++] = class583.field7832;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field8391[--field8407];
                class496.method2701((byte) -49, var193, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field8402[--field8395];
                field8402[field8395++] = class165.field1940[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field8402[--field8395];
                if (class136.field1664 != null && var195 < class348.field4476) {
                    field8391[field8407++] = class485.field6032[var195].field2254;
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field8402[--field8395];
                if (class254.field3274 != 0 && var196 < class189.field2253) {
                    field8391[field8407++] = class204.field2368[var196];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var197].method1880(223);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var198].field4080;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var199].field4078;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var200].field4083;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var201].field4077;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field8402[--field8395];
                field8402[field8395++] = class317.field3965[var202].field4072;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field8402[--field8395];
                int var204 = class317.field3965[var203].method1878(-114);
                field8402[field8395++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field8402[--field8395];
                int var206 = class317.field3965[var205].method1878(-110);
                field8402[field8395++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field8402[--field8395];
                int var208 = class317.field3965[var207].method1878(-109);
                field8402[field8395++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field8402[--field8395];
                int var210 = class317.field3965[var209].method1878(-123);
                field8402[field8395++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field8395 -= 2;
                int var211 = field8402[field8395];
                int var212 = field8402[field8395 + 1];
                field8402[field8395++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field8395 -= 2;
                int var213 = field8402[field8395];
                int var214 = field8402[field8395 + 1];
                field8402[field8395++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field8395 -= 2;
                int var215 = field8402[field8395];
                int var216 = field8402[field8395 + 1];
                field8402[field8395++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field8395 -= 2;
                int var217 = field8402[field8395];
                int var218 = field8402[field8395 + 1];
                field8402[field8395++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field8402[--field8395];
                field8402[field8395++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field8402[--field8395];
                field8402[field8395++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field8395 -= 5;
                int var221 = field8402[field8395];
                int var222 = field8402[field8395 + 1];
                int var223 = field8402[field8395 + 2];
                int var224 = field8402[field8395 + 3];
                int var225 = field8402[field8395 + 4];
                field8402[field8395++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field8395 -= 2;
                long var226 = (long) field8402[field8395];
                long var228 = (long) field8402[field8395 + 1];
                field8402[field8395++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field8395 -= 2;
                int var230 = field8402[field8395];
                int var231 = field8402[field8395 + 1];
                field8402[field8395++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field8395 -= 2;
                int var232 = field8402[field8395];
                int var233 = field8402[field8395 + 1];
                field8402[field8395++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field8395 -= 2;
                int var234 = field8402[field8395];
                int var235 = field8402[field8395 + 1];
                field8402[field8395++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field8395 -= 2;
                int var236 = field8402[field8395];
                int var237 = field8402[field8395 + 1];
                field8402[field8395++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field8395 -= 2;
                int var238 = field8402[field8395];
                int var239 = field8402[field8395 + 1];
                if (var238 == 0) {
                    field8402[field8395++] = 0;
                    return;
                }
                field8402[field8395++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field8395 -= 2;
                int var240 = field8402[field8395];
                int var241 = field8402[field8395 + 1];
                if (var240 == 0) {
                    field8402[field8395++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field8402[field8395++] = Integer.MAX_VALUE;
                    return;
                }
                field8402[field8395++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field8395 -= 2;
                int var242 = field8402[field8395];
                int var243 = field8402[field8395 + 1];
                field8402[field8395++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field8395 -= 2;
                int var244 = field8402[field8395];
                int var245 = field8402[field8395 + 1];
                field8402[field8395++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field8395 -= 2;
                int var246 = field8402[field8395];
                int var247 = field8402[field8395 + 1];
                field8402[field8395++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field8395 -= 2;
                int var248 = field8402[field8395];
                int var249 = field8402[field8395 + 1];
                field8402[field8395++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field8395 -= 3;
                long var250 = (long) field8402[field8395];
                long var252 = (long) field8402[field8395 + 1];
                long var254 = (long) field8402[field8395 + 2];
                field8402[field8395++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field8391[--field8407];
                int var257 = field8402[--field8395];
                field8391[field8407++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field8407 -= 2;
                String var258 = field8391[field8407];
                String var259 = field8391[field8407 + 1];
                field8391[field8407++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field8391[--field8407];
                int var261 = field8402[--field8395];
                field8391[field8407++] = var260 + class700.method3862(true, var261, (byte) 84);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field8391[--field8407];
                field8391[field8407++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field8391[field8407++] = method3455(field8402[--field8395]);
                return;
            }
            if (arg0 == 4105) {
                field8407 -= 2;
                String var263 = field8391[field8407];
                String var264 = field8391[field8407 + 1];
                if (class67.field815.field4684 != null && class67.field815.field4684.field8429) {
                    field8391[field8407++] = var264;
                    return;
                }
                field8391[field8407++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field8402[--field8395];
                field8391[field8407++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field8407 -= 2;
                field8402[field8395++] = class7.method24(field8391[field8407], field8391[field8407 + 1], class71.field912, 0);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field8391[--field8407];
                field8395 -= 2;
                int var267 = field8402[field8395];
                int var268 = field8402[field8395 + 1];
                class20 var269 = class692.method3823(var268, -31445, 0, class329.field4095);
                field8402[field8395++] = var269.method123(var267, var266, class94.field1201, -63);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field8391[--field8407];
                field8395 -= 2;
                int var271 = field8402[field8395];
                int var272 = field8402[field8395 + 1];
                class20 var273 = class692.method3823(var272, -31445, 0, class329.field4095);
                field8402[field8395++] = var273.method120((byte) 109, var271, var270, class94.field1201);
                return;
            }
            if (arg0 == 4110) {
                field8407 -= 2;
                String var274 = field8391[field8407];
                String var275 = field8391[field8407 + 1];
                if (field8402[--field8395] == 1) {
                    field8391[field8407++] = var274;
                    return;
                }
                field8391[field8407++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field8391[--field8407];
                field8391[field8407++] = class424.method2340(0, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field8391[--field8407];
                int var278 = field8402[--field8395];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field8391[field8407++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field8402[--field8395];
                field8402[field8395++] = class614.method3433((char) var279, (byte) -90) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field8402[--field8395];
                field8402[field8395++] = class274.method1634((char) var280, -30677) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field8402[--field8395];
                field8402[field8395++] = class496.method2705(-1, (char) var281) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field8402[--field8395];
                field8402[field8395++] = class550.method2942((char) var282, 57) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field8391[--field8407];
                if (var283 != null) {
                    field8402[field8395++] = var283.length();
                    return;
                }
                field8402[field8395++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field8391[--field8407];
                field8395 -= 2;
                int var285 = field8402[field8395];
                int var286 = field8402[field8395 + 1];
                field8391[field8407++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field8391[--field8407];
                StringBuffer var288 = new StringBuffer(var287.length());
                boolean var289 = false;
                for (int var290 = 0; var290 < var287.length(); var290++) {
                    char var291 = var287.charAt(var290);
                    if (var291 == '<') {
                        var289 = true;
                    } else if (var291 == '>') {
                        var289 = false;
                    } else if (!var289) {
                        var288.append(var291);
                    }
                }
                field8391[field8407++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field8391[--field8407];
                field8395 -= 2;
                int var293 = field8402[field8395];
                int var294 = field8402[field8395 + 1];
                field8402[field8395++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field8407 -= 2;
                String var295 = field8391[field8407];
                String var296 = field8391[field8407 + 1];
                int var297 = field8402[--field8395];
                field8402[field8395++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field8402[--field8395];
                field8402[field8395++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field8402[--field8395];
                field8402[field8395++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field8402[--field8395] != 0;
                int var301 = field8402[--field8395];
                field8391[field8407++] = class202.method1182((byte) -86, 0, (long) var301, var300, class71.field912);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field8391[--field8407];
                int var303 = field8402[--field8395];
                class20 var304 = class692.method3823(var303, -31445, 0, class329.field4095);
                field8402[field8395++] = var304.method129(var302, class94.field1201, (byte) -97);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field8402[--field8395];
                field8391[field8407++] = class504.field6287.method1628(var305, (byte) -112).field879;
                return;
            }
            if (arg0 == 4201) {
                field8395 -= 2;
                int var306 = field8402[field8395];
                int var307 = field8402[field8395 + 1];
                class68 var308 = class504.field6287.method1628(var306, (byte) -107);
                if (var307 >= 1 && var307 <= 5 && var308.field885[var307 - 1] != null) {
                    field8391[field8407++] = var308.field885[var307 - 1];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 4202) {
                field8395 -= 2;
                int var309 = field8402[field8395];
                int var310 = field8402[field8395 + 1];
                class68 var311 = class504.field6287.method1628(var309, (byte) -121);
                if (var310 >= 1 && var310 <= 5 && var311.field825[var310 - 1] != null) {
                    field8391[field8407++] = var311.field825[var310 - 1];
                    return;
                }
                field8391[field8407++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field8402[--field8395];
                field8402[field8395++] = class504.field6287.method1628(var312, (byte) -125).field864;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field8402[--field8395];
                field8402[field8395++] = class504.field6287.method1628(var313, (byte) -86).field843 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field8402[--field8395];
                class68 var315 = class504.field6287.method1628(var314, (byte) -93);
                if (var315.field861 == -1 && var315.field838 >= 0) {
                    field8402[field8395++] = var315.field838;
                    return;
                }
                field8402[field8395++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field8402[--field8395];
                class68 var317 = class504.field6287.method1628(var316, (byte) -116);
                if (var317.field861 >= 0 && var317.field838 >= 0) {
                    field8402[field8395++] = var317.field838;
                    return;
                }
                field8402[field8395++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field8402[--field8395];
                field8402[field8395++] = class504.field6287.method1628(var318, (byte) -97).field833 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field8395 -= 2;
                int var319 = field8402[field8395];
                int var320 = field8402[field8395 + 1];
                class362 var321 = class46.field617.method1403(var320, 64);
                if (var321.method2100((byte) 121)) {
                    field8391[field8407++] = class504.field6287.method1628(var319, (byte) -122).method546(var321.field4639, 127, var320);
                    return;
                }
                field8402[field8395++] = class504.field6287.method1628(var319, (byte) -104).method534(var321.field4635, 12645, var320);
                return;
            }
            if (arg0 == 4209) {
                field8395 -= 2;
                int var322 = field8402[field8395];
                int var323 = field8402[field8395 + 1] - 1;
                class68 var324 = class504.field6287.method1628(var322, (byte) -101);
                if (var324.field855 == var323) {
                    field8402[field8395++] = var324.field866;
                    return;
                }
                if (var324.field820 == var323) {
                    field8402[field8395++] = var324.field858;
                    return;
                }
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field8391[--field8407];
                int var326 = field8402[--field8395];
                class74.method597(var326 == 1, 0, var325);
                field8402[field8395++] = class111.field1382;
                return;
            }
            if (arg0 == 4211) {
                if (class666.field9042 != null && class253.field3268 < class111.field1382) {
                    field8402[field8395++] = class666.field9042[class253.field3268++] & 0xFFFF;
                    return;
                }
                field8402[field8395++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class253.field3268 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field8402[--field8395];
                field8402[field8395++] = class504.field6287.method1628(var327, (byte) -85).field881;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field8391[--field8407];
                field8395 -= 3;
                int var329 = field8402[field8395];
                int var330 = field8402[field8395 + 1];
                int var331 = field8402[field8395 + 2];
                class502.method2728(var328, var331, (byte) 112, var330, var329 == 1);
                field8402[field8395++] = class111.field1382;
                return;
            }
            if (arg0 == 4215) {
                field8407 -= 2;
                field8395 -= 2;
                String var332 = field8391[field8407];
                int var333 = field8402[field8395];
                int var334 = field8402[field8395 + 1];
                String var335 = field8391[field8407 + 1];
                class329.method1886(var332, var335, 9710, var334, var333 == 1);
                field8402[field8395++] = class111.field1382;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field8395 -= 2;
                int var336 = field8402[field8395];
                int var337 = field8402[field8395 + 1];
                class362 var338 = class46.field617.method1403(var337, 64);
                if (var338.method2100((byte) 113)) {
                    field8391[field8407++] = class46.field620.method3763(var336, -2).method3817(var337, var338.field4639, true);
                    return;
                }
                field8402[field8395++] = class46.field620.method3763(var336, -2).method3807((byte) -65, var337, var338.field4635);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field8395 -= 2;
                int var339 = field8402[field8395];
                int var340 = field8402[field8395 + 1];
                class362 var341 = class46.field617.method1403(var340, 64);
                if (var341.method2100((byte) 117)) {
                    field8391[field8407++] = class232.field3017.method2358(0, var339).method3788(var340, var341.field4639, (byte) -7);
                    return;
                }
                field8402[field8395++] = class232.field3017.method2358(0, var339).method3799(var341.field4635, -1, var340);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field8395 -= 2;
                int var342 = field8402[field8395];
                int var343 = field8402[field8395 + 1];
                class362 var344 = class46.field617.method1403(var343, 64);
                if (var344.method2100((byte) 118)) {
                    field8391[field8407++] = class96.field1247.method833((byte) -68, var342).method2974(var343, var344.field4639, (byte) 101);
                    return;
                }
                field8402[field8395++] = class96.field1247.method833((byte) -68, var342).method2973(320, var343, var344.field4635);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field8402[--field8395];
            class403 var346 = class510.field6389.method2907(var345, 63);
            if (var346.field5170 != null && var346.field5170.length > 0) {
                int var347 = 0;
                int var348 = var346.field5208[0];
                for (int var349 = 1; var349 < var346.field5170.length; var349++) {
                    if (var346.field5208[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field5208[var349];
                    }
                }
                field8402[field8395++] = var346.field5170[var347];
                return;
            }
            field8402[field8395++] = var346.field5213;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
