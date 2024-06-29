import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class475 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[[I")
    private static int[][] field6926 = new int[5][5000];

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
    private static int[] field6947 = new int[5];

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lbe;")
    private static class29[] field6934 = new class29[50];

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
    private static int[] field6946 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    private static int field6944 = 0;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    private static int field6949 = 0;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    private static int field6933 = 0;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field6950 = new String[1000];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6930 = Calendar.getInstance();

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field6952 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "[I")
    private static int[] field6953 = new int[3];

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "Lff;")
    public static class9 field6951 = new class9(4);

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    private static int field6954 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lss;")
    private static class295 field6927;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lss;")
    private static class295 field6942;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lfj;")
    private static class466 field6938;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[I")
    private static int[] field6940;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[Ljava/lang/String;")
    private static String[] field6939;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
    public static final void method2786() {
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static final void method2787(int arg0) {
        if (arg0 == -1 || !class478.method2809(arg0, false)) {
            return;
        }
        class295[] var1 = class522.field7701[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class295 var3 = var1[var2];
            if (var3.field4012 != null) {
                class44 var4 = new class44();
                var4.field613 = var3;
                var4.field612 = var3.field4012;
                method2793(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "()V")
    public static void method2788() {
        field6940 = null;
        field6939 = null;
        field6947 = null;
        field6926 = null;
        field6946 = null;
        field6950 = null;
        field6934 = null;
        field6927 = null;
        field6942 = null;
        field6938 = null;
        field6930 = null;
        field6952 = null;
        field6953 = null;
        field6951 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lcl;I)V")
    private static final void method2789(class173 arg0, int arg1) {
        field6949 = 0;
        field6933 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2482;
        int[] var4 = arg0.field2478;
        byte var5 = -1;
        field6944 = 0;
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
                        method2794(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2797(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6946[field6949++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6946[field6949++] = class453.field6623.field4675[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class453.field6623.method1890((byte) 88, var8, field6946[--field6949]);
                } else if (var43 == 3) {
                    field6950[field6933++] = arg0.field2481[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6949 -= 2;
                    if (field6946[field6949 + 1] != field6946[field6949]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6949 -= 2;
                    if (field6946[field6949 + 1] == field6946[field6949]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6949 -= 2;
                    if (field6946[field6949] < field6946[field6949 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6949 -= 2;
                    if (field6946[field6949] > field6946[field6949 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6944 == 0) {
                        return;
                    }
                    class29 var9 = field6934[--field6944];
                    arg0 = var9.field434;
                    var3 = arg0.field2482;
                    var4 = arg0.field2478;
                    var2 = var9.field437;
                    field6940 = var9.field427;
                    field6939 = var9.field429;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6946[field6949++] = class453.field6623.method205(var10, 15503);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class453.field6623.method1884(field6946[--field6949], var11, false);
                } else if (var43 == 31) {
                    field6949 -= 2;
                    if (field6946[field6949] <= field6946[field6949 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6949 -= 2;
                    if (field6946[field6949] >= field6946[field6949 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6946[field6949++] = field6940[var4[var2]];
                } else if (var43 == 34) {
                    field6940[var4[var2]] = field6946[--field6949];
                } else if (var43 == 35) {
                    field6950[field6933++] = field6939[var4[var2]];
                } else if (var43 == 36) {
                    field6939[var4[var2]] = field6950[--field6933];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6933 -= var12;
                    String var13 = class464.method2728(field6950, var12, field6933, true);
                    field6950[field6933++] = var13;
                } else if (var43 == 38) {
                    field6949--;
                } else if (var43 == 39) {
                    field6933--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class173 var15 = class371.method2146(var14, -15);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2485];
                    String[] var17 = new String[var15.field2474];
                    for (int var18 = 0; var18 < var15.field2486; var18++) {
                        var16[var18] = field6946[field6949 + var18 - var15.field2486];
                    }
                    for (int var19 = 0; var19 < var15.field2479; var19++) {
                        var17[var19] = field6950[field6933 + var19 - var15.field2479];
                    }
                    field6949 -= var15.field2486;
                    field6933 -= var15.field2479;
                    class29 var20 = new class29();
                    var20.field434 = arg0;
                    var20.field437 = var2;
                    var20.field427 = field6940;
                    var20.field429 = field6939;
                    if (field6944 >= field6934.length) {
                        throw new RuntimeException();
                    }
                    field6934[field6944++] = var20;
                    arg0 = var15;
                    var3 = var15.field2482;
                    var4 = var15.field2478;
                    var2 = -1;
                    field6940 = var16;
                    field6939 = var17;
                } else if (var43 == 42) {
                    field6946[field6949++] = class505.field7432[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class505.field7432[var21] = field6946[--field6949];
                    class472.method2779(false, var21);
                    class354.field4824 |= class326.field4473[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6946[--field6949];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6947[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field6926[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6946[--field6949];
                    if (var28 < 0 || var28 >= field6947[var27]) {
                        throw new RuntimeException();
                    }
                    field6946[field6949++] = field6926[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6949 -= 2;
                    int var30 = field6946[field6949];
                    if (var30 < 0 || var30 >= field6947[var29]) {
                        throw new RuntimeException();
                    }
                    field6926[var29][var30] = field6946[field6949 + 1];
                } else if (var43 == 47) {
                    String var31 = class92.field1240[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6950[field6933++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class92.field1240[var32] = field6950[--field6933];
                    class498.method2937(var32, -8525);
                } else if (var43 == 51) {
                    class159 var33 = arg0.field2475[var4[var2]];
                    class330 var34 = (class330) var33.method979((byte) 28, (long) field6946[--field6949]);
                    if (var34 != null) {
                        var2 += var34.field4495;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field2477 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field7342).append(" ");
                for (int var41 = field6944 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6934[var41].field434.field7342).append(" ");
                }
                var40.append("op: ").append(var5);
                class162.method1000((byte) 111, var42, var40.toString());
            } else {
                class99.method662((byte) 41, "Clientscript error in: " + arg0.field2477);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field2477).append("\n");
                for (int var38 = field6944 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6934[var38].field434.field2477).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class162.method1000((byte) -117, var42, var37.toString());
                class58.method376((byte) -1, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lqo;II)V")
    public static final void method2790(class19 arg0, int arg1, int arg2) {
        class173 var3 = class415.method2482(arg0, arg1, (byte) -128, arg2);
        if (var3 == null) {
            return;
        }
        field6940 = new int[var3.field2485];
        field6939 = new String[var3.field2474];
        if (class411.field6021 == var3.field2476 || class243.field3391 == var3.field2476 || class3.field42 == var3.field2476) {
            int var4 = 0;
            int var5 = 0;
            if (class34.field488 != null) {
                var4 = class34.field488.field4063;
                var5 = class34.field488.field3982;
            }
            field6940[0] = class332.field4528.method54(94) - var4;
            field6940[1] = class332.field4528.method55((byte) -39) - var5;
        }
        method2789(var3, 200000);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    private static final void method2791(int arg0) {
        class295 var1 = class339.method1882((byte) 60, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class295[] var3 = class25.field396[var2];
        if (var3 == null) {
            class295[] var4 = class522.field7701[var2];
            int var5 = var4.length;
            var3 = class25.field396[var2] = new class295[var5];
            class416.method2485(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class416.method2485(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    private static final void method2792(int arg0) {
        class295 var1 = class339.method1882((byte) 60, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class295[] var3 = class25.field396[var2];
        if (var3 == null) {
            class295[] var4 = class522.field7701[var2];
            int var5 = var4.length;
            var3 = class25.field396[var2] = new class295[var5];
            class416.method2485(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class416.method2485(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ldl;I)V")
    private static final void method2793(class44 arg0, int arg1) {
        Object[] var2 = arg0.field612;
        int var3 = (Integer) var2[0];
        class173 var4 = class371.method2146(var3, -15);
        if (var4 == null) {
            return;
        }
        field6940 = new int[var4.field2485];
        int var5 = 0;
        field6939 = new String[var4.field2474];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field607;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field606;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field613 == null ? -1 : arg0.field613.field4073;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field609;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field613 == null ? -1 : arg0.field613.field3936;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field610 == null ? -1 : arg0.field610.field4073;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field610 == null ? -1 : arg0.field610.field3936;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field611;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field604;
                }
                field6940[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field605;
                }
                field6939[var6++] = var9;
            }
        }
        field6954 = arg0.field608;
        method2789(var4, arg1);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
    private static final void method2794(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6949 -= 3;
                int var2 = field6946[field6949];
                int var3 = field6946[field6949 + 1];
                int var4 = field6946[field6949 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class295 var5 = class339.method1882((byte) 81, var2);
                if (var5.field4050 == null) {
                    var5.field4050 = new class295[var4 + 1];
                }
                if (var5.field4050.length <= var4) {
                    class295[] var6 = new class295[var4 + 1];
                    for (int var7 = 0; var7 < var5.field4050.length; var7++) {
                        var6[var7] = var5.field4050[var7];
                    }
                    var5.field4050 = var6;
                }
                if (var4 > 0 && var5.field4050[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class295 var8 = new class295();
                var8.field3984 = var3;
                var8.field3988 = var8.field4073 = var5.field4073;
                var8.field3936 = var4;
                var5.field4050[var4] = var8;
                if (arg1) {
                    field6942 = var8;
                } else {
                    field6927 = var8;
                }
                class150.method952((byte) -78, var5);
                return;
            }
            if (arg0 == 101) {
                class295 var9 = arg1 ? field6942 : field6927;
                if (var9.field3936 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class295 var10 = class339.method1882((byte) 88, var9.field4073);
                var10.field4050[var9.field3936] = null;
                class150.method952((byte) 124, var10);
                return;
            }
            if (arg0 == 102) {
                class295 var11 = class339.method1882((byte) 110, field6946[--field6949]);
                var11.field4050 = null;
                class150.method952((byte) -75, var11);
                return;
            }
            if (arg0 == 200) {
                field6949 -= 2;
                int var12 = field6946[field6949];
                int var13 = field6946[field6949 + 1];
                class295 var14 = class12.method106(var12, (byte) -88, var13);
                if (var14 != null && var13 != -1) {
                    field6946[field6949++] = 1;
                    if (arg1) {
                        field6942 = var14;
                        return;
                    }
                    field6927 = var14;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6946[--field6949];
                class295 var16 = class339.method1882((byte) 81, var15);
                if (var16 != null) {
                    field6946[field6949++] = 1;
                    if (arg1) {
                        field6942 = var16;
                        return;
                    }
                    field6927 = var16;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6946[--field6949];
                method2791(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6946[--field6949];
                method2792(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6949 -= 2;
                int var19 = field6946[field6949];
                int var20 = field6946[field6949 + 1];
                for (int var21 = 0; var21 < class487.field7115.length; var21++) {
                    if (class487.field7115[var21] == var19) {
                        class75.field1089.field2741.method703((byte) 99, class201.field2873, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class444.field6452.length; var22++) {
                    if (class444.field6452[var22] == var19) {
                        class75.field1089.field2741.method703((byte) 93, class201.field2873, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6949 -= 2;
                int var23 = field6946[field6949];
                int var24 = field6946[field6949 + 1];
                class75.field1089.field2741.method707(var24, var23, -124);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6946[--field6949] != 0;
                class75.field1089.field2741.method706(var25, 128);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class295 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class339.method1882((byte) 69, field6946[--field6949]);
            } else {
                var26 = arg1 ? field6942 : field6927;
            }
            if (arg0 == 1000) {
                field6949 -= 4;
                var26.field3934 = field6946[field6949];
                var26.field3966 = field6946[field6949 + 1];
                int var27 = field6946[field6949 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field6946[field6949 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field4020 = (byte) var27;
                var26.field4003 = (byte) var28;
                class150.method952((byte) 108, var26);
                class170.method1050(var26, (byte) 77);
                if (var26.field3936 == -1) {
                    class501.method2955(var26.field4073, 7);
                }
                return;
            }
            if (arg0 == 1001) {
                field6949 -= 4;
                var26.field3964 = field6946[field6949];
                var26.field3926 = field6946[field6949 + 1];
                var26.field3945 = 0;
                var26.field3955 = 0;
                int var29 = field6946[field6949 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field6946[field6949 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field3933 = (byte) var29;
                var26.field4089 = (byte) var30;
                class150.method952((byte) -59, var26);
                class170.method1050(var26, (byte) 125);
                if (var26.field3984 == 0) {
                    class263.method1517((byte) -68, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field6946[--field6949] == 1;
                if (var26.field4031 != var31) {
                    var26.field4031 = var31;
                    class150.method952((byte) -40, var26);
                }
                if (var26.field3936 == -1) {
                    class168.method1040(var26.field4073, (byte) -103);
                }
                return;
            }
            if (arg0 == 1004) {
                field6949 -= 2;
                var26.field4015 = field6946[field6949];
                var26.field4046 = field6946[field6949 + 1];
                class150.method952((byte) 111, var26);
                class170.method1050(var26, (byte) 77);
                if (var26.field3984 == 0) {
                    class263.method1517((byte) -88, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field4042 = field6946[--field6949] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class295 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class339.method1882((byte) 109, field6946[--field6949]);
            } else {
                var32 = arg1 ? field6942 : field6927;
            }
            if (arg0 == 1100) {
                field6949 -= 2;
                var32.field3968 = field6946[field6949];
                if (var32.field3968 > var32.field4034 - var32.field4022) {
                    var32.field3968 = var32.field4034 - var32.field4022;
                }
                if (var32.field3968 < 0) {
                    var32.field3968 = 0;
                }
                var32.field3977 = field6946[field6949 + 1];
                if (var32.field3977 > var32.field4051 - var32.field3960) {
                    var32.field3977 = var32.field4051 - var32.field3960;
                }
                if (var32.field3977 < 0) {
                    var32.field3977 = 0;
                }
                class150.method952((byte) 115, var32);
                if (var32.field3936 == -1) {
                    class139.method904((byte) -116, var32.field4073);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field3925 = field6946[--field6949];
                class150.method952((byte) -114, var32);
                if (var32.field3936 == -1) {
                    class26.method190(var32.field4073, (byte) -40);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field4010 = field6946[--field6949] == 1;
                class150.method952((byte) -91, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field3940 = field6946[--field6949];
                class150.method952((byte) -54, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field3944 = field6946[--field6949];
                class150.method952((byte) 98, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field6946[--field6949];
                if (var32.field4026 != var33) {
                    var32.field4026 = var33;
                    class150.method952((byte) 106, var32);
                }
                if (var32.field3936 == -1) {
                    class164.method1021(14, var32.field4073);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field4013 = field6946[--field6949];
                class150.method952((byte) -99, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field3967 = field6946[--field6949] == 1;
                class150.method952((byte) -97, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field3965 = 1;
                var32.field3948 = field6946[--field6949];
                class150.method952((byte) -127, var32);
                if (var32.field3936 == -1) {
                    class26.method185(var32.field4073, 4);
                }
                return;
            }
            if (arg0 == 1109) {
                field6949 -= 6;
                var32.field3937 = field6946[field6949];
                var32.field3946 = field6946[field6949 + 1];
                var32.field4074 = field6946[field6949 + 2];
                var32.field4017 = field6946[field6949 + 3];
                var32.field4058 = field6946[field6949 + 4];
                var32.field4009 = field6946[field6949 + 5];
                class150.method952((byte) 109, var32);
                if (var32.field3936 == -1) {
                    class61.method388((byte) 100, var32.field4073);
                    class170.method1051(true, var32.field4073);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field6946[--field6949];
                if (var32.field4060 != var34) {
                    var32.field4060 = var34;
                    var32.field4078 = 0;
                    var32.field4070 = 1;
                    var32.field4018 = 0;
                    class150.method952((byte) -111, var32);
                }
                if (var32.field3936 == -1) {
                    class420.method2517(var32.field4073, 5);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field4088 = field6946[--field6949] == 1;
                class150.method952((byte) 103, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field6950[--field6933];
                if (!var35.equals(var32.field3961)) {
                    var32.field3961 = var35;
                    class150.method952((byte) 115, var32);
                }
                if (var32.field3936 == -1) {
                    class482.method2847((byte) 66, var32.field4073);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field3959 = field6946[--field6949];
                class150.method952((byte) 125, var32);
                if (var32.field3936 == -1) {
                    class153.method965(false, var32.field4073);
                }
                return;
            }
            if (arg0 == 1114) {
                field6949 -= 3;
                var32.field4024 = field6946[field6949];
                var32.field3963 = field6946[field6949 + 1];
                var32.field4014 = field6946[field6949 + 2];
                class150.method952((byte) 122, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field3987 = field6946[--field6949] == 1;
                class150.method952((byte) -58, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field4033 = field6946[--field6949];
                class150.method952((byte) 116, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field4035 = field6946[--field6949];
                class150.method952((byte) -21, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field3950 = field6946[--field6949] == 1;
                class150.method952((byte) -28, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field3974 = field6946[--field6949] == 1;
                class150.method952((byte) 123, var32);
                return;
            }
            if (arg0 == 1120) {
                field6949 -= 2;
                var32.field4034 = field6946[field6949];
                var32.field4051 = field6946[field6949 + 1];
                class150.method952((byte) -40, var32);
                if (var32.field3984 == 0) {
                    class263.method1517((byte) -59, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field6949 -= 2;
                var32.field4025 = (short) field6946[field6949];
                var32.field3999 = (short) field6946[field6949 + 1];
                class150.method952((byte) 117, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field4052 = field6946[--field6949] == 1;
                class150.method952((byte) -111, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field4009 = field6946[--field6949];
                class150.method952((byte) 110, var32);
                if (var32.field3936 == -1) {
                    class61.method388((byte) 110, var32.field4073);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field6946[--field6949];
                var32.field4056 = var36 == 1;
                class150.method952((byte) -62, var32);
                return;
            }
            if (arg0 == 1125) {
                field6949 -= 2;
                var32.field4007 = field6946[field6949];
                var32.field3996 = field6946[field6949 + 1];
                class150.method952((byte) 108, var32);
                return;
            }
            if (arg0 == 1126) {
                var32.field4076 = field6946[--field6949];
                class150.method952((byte) 112, var32);
                return;
            }
            if (arg0 == 1127) {
                field6949 -= 2;
                int var37 = field6946[field6949];
                int var38 = field6946[field6949 + 1];
                class89 var39 = class284.field3819.method1088(var37, (byte) -120);
                if (var39.field1220 != var38) {
                    var32.method1697(var38, var37, 16);
                    return;
                }
                var32.method1689(var37, 65535);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field6946[--field6949];
                String var41 = field6950[--field6933];
                class89 var42 = class284.field3819.method1088(var40, (byte) -120);
                if (!var42.field1217.equals(var41)) {
                    var32.method1698((byte) 47, var41, var40);
                    return;
                }
                var32.method1689(var40, 65535);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class295 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class339.method1882((byte) 120, field6946[--field6949]);
            } else {
                var43 = arg1 ? field6942 : field6927;
            }
            class150.method952((byte) -125, var43);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6949 -= 2;
                int var44 = field6946[field6949];
                int var45 = field6946[field6949 + 1];
                if (var43.field3936 == -1) {
                    class243.method1437(var43.field4073, 86);
                    class61.method388((byte) 97, var43.field4073);
                    class170.method1051(true, var43.field4073);
                }
                if (var44 == -1) {
                    var43.field3965 = 1;
                    var43.field3948 = -1;
                    var43.field4072 = -1;
                    return;
                }
                var43.field4072 = var44;
                var43.field3981 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field4075 = true;
                } else {
                    var43.field4075 = false;
                }
                class316 var46 = class75.field1097.method823(false, var44);
                var43.field4074 = var46.field4365;
                var43.field4017 = var46.field4341;
                var43.field4058 = var46.field4363;
                var43.field3937 = var46.field4316;
                var43.field3946 = var46.field4383;
                var43.field4009 = var46.field4360;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field4001 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field4001 = 1;
                } else {
                    var43.field4001 = 2;
                }
                if (var43.field3945 > 0) {
                    var43.field4009 = var43.field4009 * 32 / var43.field3945;
                    return;
                }
                if (var43.field3964 > 0) {
                    var43.field4009 = var43.field4009 * 32 / var43.field3964;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field3965 = 2;
                var43.field3948 = field6946[--field6949];
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field3965 = 3;
                var43.field3948 = -1;
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field3965 = 6;
                var43.field3948 = field6946[--field6949];
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field3965 = 5;
                var43.field3948 = field6946[--field6949];
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
            if (arg0 == 1206) {
                field6949 -= 4;
                var43.field3994 = field6946[field6949];
                var43.field3938 = field6946[field6949 + 1];
                var43.field4041 = field6946[field6949 + 2];
                var43.field3991 = field6946[field6949 + 3];
                class150.method952((byte) 113, var43);
                return;
            }
            if (arg0 == 1207) {
                field6949 -= 2;
                var43.field4083 = field6946[field6949];
                var43.field4019 = field6946[field6949 + 1];
                class150.method952((byte) 124, var43);
                return;
            }
            if (arg0 == 1210) {
                field6949 -= 4;
                var43.field3948 = field6946[field6949];
                var43.field4045 = field6946[field6949 + 1];
                if (field6946[field6949 + 2] == 1) {
                    var43.field3965 = 9;
                } else {
                    var43.field3965 = 8;
                }
                if (field6946[field6949 + 3] == 1) {
                    var43.field4075 = true;
                } else {
                    var43.field4075 = false;
                }
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field3965 = 5;
                var43.field3948 = class202.field2880;
                var43.field4045 = 0;
                if (var43.field3936 == -1) {
                    class26.method185(var43.field4073, 4);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class295 var58;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var58 = class339.method1882((byte) 88, field6946[--field6949]);
                } else {
                    var58 = arg1 ? field6942 : field6927;
                }
                String var59 = field6950[--field6933];
                int[] var60 = null;
                if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                    int var61 = field6946[--field6949];
                    if (var61 > 0) {
                        var60 = new int[var61];
                        while (var61-- > 0) {
                            var60[var61] = field6946[--field6949];
                        }
                    }
                    var59 = var59.substring(0, var59.length() - 1);
                }
                Object[] var62 = new Object[var59.length() + 1];
                for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                    if (var59.charAt(var63 - 1) == 's') {
                        var62[var63] = field6950[--field6933];
                    } else {
                        var62[var63] = Integer.valueOf(field6946[--field6949]);
                    }
                }
                int var64 = field6946[--field6949];
                if (var64 == -1) {
                    var62 = null;
                } else {
                    var62[0] = Integer.valueOf(var64);
                }
                if (arg0 == 1400) {
                    var58.field4065 = var62;
                } else if (arg0 == 1401) {
                    var58.field3929 = var62;
                } else if (arg0 == 1402) {
                    var58.field4087 = var62;
                } else if (arg0 == 1403) {
                    var58.field3942 = var62;
                } else if (arg0 == 1404) {
                    var58.field4021 = var62;
                } else if (arg0 == 1405) {
                    var58.field4077 = var62;
                } else if (arg0 == 1406) {
                    var58.field4048 = var62;
                } else if (arg0 == 1407) {
                    var58.field4000 = var62;
                    var58.field3989 = var60;
                } else if (arg0 == 1408) {
                    var58.field4040 = var62;
                } else if (arg0 == 1409) {
                    var58.field4029 = var62;
                } else if (arg0 == 1410) {
                    var58.field4038 = var62;
                } else if (arg0 == 1411) {
                    var58.field3980 = var62;
                } else if (arg0 == 1412) {
                    var58.field4053 = var62;
                } else if (arg0 == 1414) {
                    var58.field4061 = var62;
                    var58.field4069 = var60;
                } else if (arg0 == 1415) {
                    var58.field4071 = var62;
                    var58.field3969 = var60;
                } else if (arg0 == 1416) {
                    var58.field4059 = var62;
                } else if (arg0 == 1417) {
                    var58.field4006 = var62;
                } else if (arg0 == 1418) {
                    var58.field4055 = var62;
                } else if (arg0 == 1419) {
                    var58.field4043 = var62;
                } else if (arg0 == 1420) {
                    var58.field3928 = var62;
                } else if (arg0 == 1421) {
                    var58.field3993 = var62;
                } else if (arg0 == 1422) {
                    var58.field3975 = var62;
                } else if (arg0 == 1423) {
                    var58.field4011 = var62;
                } else if (arg0 == 1424) {
                    var58.field4067 = var62;
                } else if (arg0 == 1425) {
                    var58.field3970 = var62;
                } else if (arg0 == 1426) {
                    var58.field3973 = var62;
                } else if (arg0 == 1427) {
                    var58.field4002 = var62;
                } else if (arg0 == 1428) {
                    var58.field4005 = var62;
                    var58.field4044 = var60;
                } else if (arg0 == 1429) {
                    var58.field4085 = var62;
                    var58.field4086 = var60;
                } else if (arg0 == 1430) {
                    var58.field3962 = var62;
                }
                var58.field3952 = true;
                return;
            }
            if (arg0 < 1600) {
                class295 var65 = arg1 ? field6942 : field6927;
                if (arg0 == 1500) {
                    field6946[field6949++] = var65.field4063;
                    return;
                }
                if (arg0 == 1501) {
                    field6946[field6949++] = var65.field3982;
                    return;
                }
                if (arg0 == 1502) {
                    field6946[field6949++] = var65.field4022;
                    return;
                }
                if (arg0 == 1503) {
                    field6946[field6949++] = var65.field3960;
                    return;
                }
                if (arg0 == 1504) {
                    field6946[field6949++] = var65.field4031 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6946[field6949++] = var65.field3988;
                    return;
                }
                if (arg0 == 1506) {
                    class295 var66 = class282.method1617(false, var65);
                    field6946[field6949++] = var66 == null ? -1 : var66.field4073;
                    return;
                }
            } else if (arg0 < 1700) {
                class295 var67 = arg1 ? field6942 : field6927;
                if (arg0 == 1600) {
                    field6946[field6949++] = var67.field3968;
                    return;
                }
                if (arg0 == 1601) {
                    field6946[field6949++] = var67.field3977;
                    return;
                }
                if (arg0 == 1602) {
                    field6950[field6933++] = var67.field3961;
                    return;
                }
                if (arg0 == 1603) {
                    field6946[field6949++] = var67.field4034;
                    return;
                }
                if (arg0 == 1604) {
                    field6946[field6949++] = var67.field4051;
                    return;
                }
                if (arg0 == 1605) {
                    field6946[field6949++] = var67.field4009;
                    return;
                }
                if (arg0 == 1606) {
                    field6946[field6949++] = var67.field4074;
                    return;
                }
                if (arg0 == 1607) {
                    field6946[field6949++] = var67.field4058;
                    return;
                }
                if (arg0 == 1608) {
                    field6946[field6949++] = var67.field4017;
                    return;
                }
                if (arg0 == 1609) {
                    field6946[field6949++] = var67.field3940;
                    return;
                }
                if (arg0 == 1610) {
                    field6946[field6949++] = var67.field3937;
                    return;
                }
                if (arg0 == 1611) {
                    field6946[field6949++] = var67.field3946;
                    return;
                }
                if (arg0 == 1612) {
                    field6946[field6949++] = var67.field4026;
                    return;
                }
                if (arg0 == 1613) {
                    int var68 = field6946[--field6949];
                    class89 var69 = class284.field3819.method1088(var68, (byte) -121);
                    if (var69.method615(32)) {
                        field6950[field6933++] = var67.method1688(var68, var69.field1217, -84);
                    } else {
                        field6946[field6949++] = var67.method1684(var68, -1, var69.field1220);
                    }
                }
            } else if (arg0 < 1800) {
                class295 var70 = arg1 ? field6942 : field6927;
                if (arg0 == 1700) {
                    field6946[field6949++] = var70.field4072;
                    return;
                }
                if (arg0 == 1701) {
                    if (var70.field4072 != -1) {
                        field6946[field6949++] = var70.field3981;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6946[field6949++] = var70.field3936;
                    return;
                }
            } else if (arg0 < 1900) {
                class295 var71 = arg1 ? field6942 : field6927;
                if (arg0 == 1800) {
                    field6946[field6949++] = client.method1191(var71).method1222(24805);
                    return;
                }
                if (arg0 == 1801) {
                    int var72 = field6946[--field6949];
                    int var334 = var72 - 1;
                    if (var71.field4080 != null && var334 < var71.field4080.length && var71.field4080[var334] != null) {
                        field6950[field6933++] = var71.field4080[var334];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var71.field3943 == null) {
                        field6950[field6933++] = "";
                        return;
                    }
                    field6950[field6933++] = var71.field3943;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class295 var332;
                if (arg0 >= 2000) {
                    var332 = class339.method1882((byte) 100, field6946[--field6949]);
                    arg0 -= 1000;
                } else {
                    var332 = arg1 ? field6942 : field6927;
                }
                if (field6954 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var332.field4002 == null) {
                        return;
                    }
                    class44 var333 = new class44();
                    var333.field613 = var332;
                    var333.field612 = var332.field4002;
                    var333.field608 = field6954 + 1;
                    class225.field3171.method3070(var333, (byte) -127);
                    return;
                }
            } else if (arg0 < 2600) {
                class295 var73 = class339.method1882((byte) 102, field6946[--field6949]);
                if (arg0 == 2500) {
                    field6946[field6949++] = var73.field4063;
                    return;
                }
                if (arg0 == 2501) {
                    field6946[field6949++] = var73.field3982;
                    return;
                }
                if (arg0 == 2502) {
                    field6946[field6949++] = var73.field4022;
                    return;
                }
                if (arg0 == 2503) {
                    field6946[field6949++] = var73.field3960;
                    return;
                }
                if (arg0 == 2504) {
                    field6946[field6949++] = var73.field4031 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6946[field6949++] = var73.field3988;
                    return;
                }
                if (arg0 == 1506) {
                    class295 var74 = class282.method1617(false, var73);
                    field6946[field6949++] = var74 == null ? -1 : var74.field4073;
                    return;
                }
            } else if (arg0 < 2700) {
                class295 var75 = class339.method1882((byte) 69, field6946[--field6949]);
                if (arg0 == 2600) {
                    field6946[field6949++] = var75.field3968;
                    return;
                }
                if (arg0 == 2601) {
                    field6946[field6949++] = var75.field3977;
                    return;
                }
                if (arg0 == 2602) {
                    field6950[field6933++] = var75.field3961;
                    return;
                }
                if (arg0 == 2603) {
                    field6946[field6949++] = var75.field4034;
                    return;
                }
                if (arg0 == 2604) {
                    field6946[field6949++] = var75.field4051;
                    return;
                }
                if (arg0 == 2605) {
                    field6946[field6949++] = var75.field4009;
                    return;
                }
                if (arg0 == 2606) {
                    field6946[field6949++] = var75.field4074;
                    return;
                }
                if (arg0 == 2607) {
                    field6946[field6949++] = var75.field4058;
                    return;
                }
                if (arg0 == 2608) {
                    field6946[field6949++] = var75.field4017;
                    return;
                }
                if (arg0 == 2609) {
                    field6946[field6949++] = var75.field3940;
                    return;
                }
                if (arg0 == 2610) {
                    field6946[field6949++] = var75.field3937;
                    return;
                }
                if (arg0 == 2611) {
                    field6946[field6949++] = var75.field3946;
                    return;
                }
                if (arg0 == 2612) {
                    field6946[field6949++] = var75.field4026;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class295 var76 = class339.method1882((byte) 92, field6946[--field6949]);
                    field6946[field6949++] = var76.field4072;
                    return;
                }
                if (arg0 == 2701) {
                    class295 var77 = class339.method1882((byte) 104, field6946[--field6949]);
                    if (var77.field4072 == -1) {
                        field6946[field6949++] = 0;
                        return;
                    } else {
                        field6946[field6949++] = var77.field3981;
                        return;
                    }
                }
                if (arg0 == 2702) {
                    int var78 = field6946[--field6949];
                    class14 var79 = (class14) class269.field3690.method979((byte) 28, (long) var78);
                    if (var79 != null) {
                        field6946[field6949++] = 1;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class295 var80 = class339.method1882((byte) 86, field6946[--field6949]);
                    if (var80.field4050 == null) {
                        field6946[field6949++] = 0;
                        return;
                    }
                    int var81 = var80.field4050.length;
                    for (int var82 = 0; var82 < var80.field4050.length; var82++) {
                        if (var80.field4050[var82] == null) {
                            var81 = var82;
                            break;
                        }
                    }
                    field6946[field6949++] = var81;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6949 -= 2;
                    int var83 = field6946[field6949];
                    int var84 = field6946[field6949 + 1];
                    class14 var85 = (class14) class269.field3690.method979((byte) 28, (long) var83);
                    if (var85 != null && var85.field167 == var84) {
                        field6946[field6949++] = 1;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class295 var86 = class339.method1882((byte) 82, field6946[--field6949]);
                if (arg0 == 2800) {
                    field6946[field6949++] = client.method1191(var86).method1222(24805);
                    return;
                }
                if (arg0 == 2801) {
                    int var87 = field6946[--field6949];
                    int var335 = var87 - 1;
                    if (var86.field4080 != null && var335 < var86.field4080.length && var86.field4080[var335] != null) {
                        field6950[field6933++] = var86.field4080[var335];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var86.field3943 == null) {
                        field6950[field6933++] = "";
                        return;
                    }
                    field6950[field6933++] = var86.field3943;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var88 = field6950[--field6933];
                    class99.method662((byte) 41, var88);
                    return;
                }
                if (arg0 == 3101) {
                    field6949 -= 2;
                    class86.method604((byte) 112, class75.field1089, field6946[field6949 + 1], field6946[field6949]);
                    return;
                }
                if (arg0 == 3103) {
                    class361.method2004(true, -128);
                    return;
                }
                if (arg0 == 3104) {
                    String var89 = field6950[--field6933];
                    int var90 = 0;
                    if (class258.method1501(97, var89)) {
                        var90 = class47.method298(false, var89);
                    }
                    field6943++;
                    class356.method1978((byte) 94, class107.field1459);
                    class244.field3395.method2074(false, var90);
                    return;
                }
                if (arg0 == 3105) {
                    String var91 = field6950[--field6933];
                    field6948++;
                    class356.method1978((byte) 64, class145.field2075);
                    class244.field3395.method2084(var91.length() + 1, false);
                    class244.field3395.method2073(-112, var91);
                    return;
                }
                if (arg0 == 3106) {
                    String var92 = field6950[--field6933];
                    field6935++;
                    class356.method1978((byte) 60, class160.field2293);
                    class244.field3395.method2084(var92.length() + 1, false);
                    class244.field3395.method2073(-117, var92);
                    return;
                }
                if (arg0 == 3107) {
                    int var93 = field6946[--field6949];
                    String var94 = field6950[--field6933];
                    class501.method2952((byte) 71, var94, var93);
                    return;
                }
                if (arg0 == 3108) {
                    field6949 -= 3;
                    int var95 = field6946[field6949];
                    int var96 = field6946[field6949 + 1];
                    int var97 = field6946[field6949 + 2];
                    class295 var98 = class339.method1882((byte) 126, var97);
                    class85.method601(var98, false, var95, var96);
                    return;
                }
                if (arg0 == 3109) {
                    field6949 -= 2;
                    int var99 = field6946[field6949];
                    int var100 = field6946[field6949 + 1];
                    class295 var101 = arg1 ? field6942 : field6927;
                    class85.method601(var101, false, var99, var100);
                    return;
                }
                if (arg0 == 3110) {
                    int var102 = field6946[--field6949];
                    field6928++;
                    class356.method1978((byte) 102, class129.field1764);
                    class244.field3395.method2070(81954016, var102);
                    return;
                }
                if (arg0 == 3111) {
                    field6949 -= 2;
                    int var103 = field6946[field6949];
                    int var104 = field6946[field6949 + 1];
                    class14 var105 = (class14) class269.field3690.method979((byte) 28, (long) var103);
                    if (var105 != null) {
                        class114.method733((byte) -90, var105.field167 != var104, var105, true);
                    }
                    class319.method1806(true, (byte) 126, var103, var104, 3);
                    return;
                }
                if (arg0 == 3112) {
                    field6949--;
                    int var106 = field6946[field6949];
                    class14 var107 = (class14) class269.field3690.method979((byte) 28, (long) var106);
                    if (var107 != null && var107.field166 == 3) {
                        class114.method733((byte) -90, true, var107, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class356.method1977(true, field6950[--field6933]);
                    return;
                }
                if (arg0 == 3114) {
                    field6949 -= 2;
                    int var108 = field6946[field6949];
                    int var109 = field6946[field6949 + 1];
                    String var110 = field6950[--field6933];
                    class478.method2806("", var109, var108, 4339, var110, "");
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6949 -= 3;
                    class213.method1279(255, field6946[field6949 + 1], field6946[field6949], field6946[field6949 + 2], false);
                    return;
                }
                if (arg0 == 3201) {
                    class426.method2555(50, field6946[--field6949], 255, 0);
                    return;
                }
                if (arg0 == 3202) {
                    field6949 -= 2;
                    class3.method15(255, 0, field6946[field6949 + 1], field6946[field6949]);
                    return;
                }
                if (arg0 == 3203) {
                    field6949 -= 4;
                    class213.method1279(field6946[field6949 + 3], field6946[field6949 + 1], field6946[field6949], field6946[field6949 + 2], false);
                    return;
                }
                if (arg0 == 3204) {
                    field6949 -= 3;
                    class426.method2555(field6946[field6949 + 2], field6946[field6949], field6946[field6949 + 1], 0);
                    return;
                }
                if (arg0 == 3205) {
                    field6949 -= 3;
                    class3.method15(field6946[field6949 + 2], 0, field6946[field6949 + 1], field6946[field6949]);
                    return;
                }
                if (arg0 == 3206) {
                    field6949 -= 4;
                    class467.method2746(field6946[field6949 + 2], field6946[field6949 + 3], field6946[field6949 + 1], -112, field6946[field6949]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6946[field6949++] = class393.field5484;
                    return;
                }
                if (arg0 == 3301) {
                    field6949 -= 2;
                    int var111 = field6946[field6949];
                    int var112 = field6946[field6949 + 1];
                    field6946[field6949++] = class515.method3026(62, false, var111, var112);
                    return;
                }
                if (arg0 == 3302) {
                    field6949 -= 2;
                    int var113 = field6946[field6949];
                    int var114 = field6946[field6949 + 1];
                    field6946[field6949++] = class508.method2986(false, var113, var114, (byte) 115);
                    return;
                }
                if (arg0 == 3303) {
                    field6949 -= 2;
                    int var115 = field6946[field6949];
                    int var116 = field6946[field6949 + 1];
                    field6946[field6949++] = class258.method1503(var116, var115, false, (byte) -109);
                    return;
                }
                if (arg0 == 3304) {
                    int var117 = field6946[--field6949];
                    field6946[field6949++] = class309.field4237.method1288(var117, (byte) -23).field3213;
                    return;
                }
                if (arg0 == 3305) {
                    int var118 = field6946[--field6949];
                    field6946[field6949++] = class9.field90[var118];
                    return;
                }
                if (arg0 == 3306) {
                    int var119 = field6946[--field6949];
                    field6946[field6949++] = class35.field493[var119];
                    return;
                }
                if (arg0 == 3307) {
                    int var120 = field6946[--field6949];
                    field6946[field6949++] = class141.field2012[var120];
                    return;
                }
                if (arg0 == 3308) {
                    byte var121 = class75.field1089.field464;
                    int var122 = (class75.field1089.field466 >> 7) + class215.field3059;
                    int var123 = (class75.field1089.field461 >> 7) + class79.field1134;
                    field6946[field6949++] = (var121 << 28) + (var122 << 14) + var123;
                    return;
                }
                if (arg0 == 3309) {
                    int var124 = field6946[--field6949];
                    field6946[field6949++] = var124 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var125 = field6946[--field6949];
                    field6946[field6949++] = var125 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var126 = field6946[--field6949];
                    field6946[field6949++] = var126 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6946[field6949++] = class123.field1689 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6949 -= 2;
                    int var127 = field6946[field6949];
                    int var128 = field6946[field6949 + 1];
                    field6946[field6949++] = class515.method3026(-117, true, var127, var128);
                    return;
                }
                if (arg0 == 3314) {
                    field6949 -= 2;
                    int var129 = field6946[field6949];
                    int var130 = field6946[field6949 + 1];
                    field6946[field6949++] = class508.method2986(true, var129, var130, (byte) 115);
                    return;
                }
                if (arg0 == 3315) {
                    field6949 -= 2;
                    int var131 = field6946[field6949];
                    int var132 = field6946[field6949 + 1];
                    field6946[field6949++] = class258.method1503(var132, var131, true, (byte) -109);
                    return;
                }
                if (arg0 == 3316) {
                    if (class370.field5196 >= 2) {
                        field6946[field6949++] = class370.field5196;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6946[field6949++] = class158.field2250;
                    return;
                }
                if (arg0 == 3318) {
                    field6946[field6949++] = class223.field3140;
                    return;
                }
                if (arg0 == 3321) {
                    field6946[field6949++] = class379.field5329;
                    return;
                }
                if (arg0 == 3322) {
                    field6946[field6949++] = class193.field2750;
                    return;
                }
                if (arg0 == 3323) {
                    if (class39.field533 >= 5 && class39.field533 <= 9) {
                        field6946[field6949++] = 1;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class39.field533 >= 5 && class39.field533 <= 9) {
                        field6946[field6949++] = class39.field533;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6946[field6949++] = class220.field3082 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6946[field6949++] = class75.field1089.field2722;
                    return;
                }
                if (arg0 == 3327) {
                    field6946[field6949++] = class75.field1089.field2741.field1481 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field6946[field6949++] = class319.field4412 && !class374.field5223 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6946[field6949++] = class99.field1366 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var133 = field6946[--field6949];
                    field6946[field6949++] = class4.method32(var133, 0, false);
                    return;
                }
                if (arg0 == 3331) {
                    field6949 -= 2;
                    int var134 = field6946[field6949];
                    int var135 = field6946[field6949 + 1];
                    field6946[field6949++] = class2.method8(false, true, var135, var134, false);
                    return;
                }
                if (arg0 == 3332) {
                    field6949 -= 2;
                    int var136 = field6946[field6949];
                    int var137 = field6946[field6949 + 1];
                    field6946[field6949++] = class2.method8(false, true, var137, var136, true);
                    return;
                }
                if (arg0 == 3333) {
                    field6946[field6949++] = class140.field1995;
                    return;
                }
                if (arg0 == 3335) {
                    field6946[field6949++] = class105.field1434;
                    return;
                }
                if (arg0 == 3336) {
                    field6949 -= 4;
                    int var138 = field6946[field6949];
                    int var139 = field6946[field6949 + 1];
                    int var140 = field6946[field6949 + 2];
                    int var141 = field6946[field6949 + 3];
                    int var142 = (var139 << 14) + var138;
                    int var143 = (var140 << 28) + var142;
                    int var144 = var141 + var143;
                    field6946[field6949++] = var144;
                    return;
                }
                if (arg0 == 3337) {
                    field6946[field6949++] = class246.field3426;
                    return;
                }
                if (arg0 == 3338) {
                    field6946[field6949++] = class264.method1527(true);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6949 -= 2;
                    int var145 = field6946[field6949];
                    int var146 = field6946[field6949 + 1];
                    class42 var147 = class455.field6640.method1497(var145, 507131584);
                    field6950[field6933++] = var147.method266(var146, -5);
                    return;
                }
                if (arg0 == 3408) {
                    field6949 -= 4;
                    int var148 = field6946[field6949];
                    int var149 = field6946[field6949 + 1];
                    int var150 = field6946[field6949 + 2];
                    int var151 = field6946[field6949 + 3];
                    class42 var152 = class455.field6640.method1497(var150, 507131584);
                    if (var152.field581 == var148 && var152.field590 == var149) {
                        if (var149 == 115) {
                            field6950[field6933++] = var152.method266(var151, -5);
                            return;
                        }
                        field6946[field6949++] = var152.method267(true, var151);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field6949 -= 3;
                    int var153 = field6946[field6949];
                    int var154 = field6946[field6949 + 1];
                    int var155 = field6946[field6949 + 2];
                    if (var154 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class42 var156 = class455.field6640.method1497(var154, 507131584);
                    if (var156.field590 != var153) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6946[field6949++] = var156.method269(var155, (byte) 112) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var157 = field6946[--field6949];
                    String var158 = field6950[--field6933];
                    if (var157 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class42 var159 = class455.field6640.method1497(var157, 507131584);
                    if (var159.field590 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6946[field6949++] = var159.method268(-6, var158) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var160 = field6946[--field6949];
                    class42 var161 = class455.field6640.method1497(var160, 507131584);
                    field6946[field6949++] = var161.field580.method987(18791);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class516.field7575 == 0) {
                        field6946[field6949++] = -2;
                        return;
                    }
                    if (class516.field7575 == 1) {
                        field6946[field6949++] = -1;
                        return;
                    }
                    field6946[field6949++] = class223.field3106;
                    return;
                }
                if (arg0 == 3601) {
                    int var162 = field6946[--field6949];
                    if (class516.field7575 == 2 && var162 < class223.field3106) {
                        field6950[field6933++] = class52.field702[var162];
                        if (class133.field1926[var162] != null) {
                            field6950[field6933++] = class133.field1926[var162];
                            return;
                        }
                        field6950[field6933++] = "";
                        return;
                    }
                    field6950[field6933++] = "";
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var163 = field6946[--field6949];
                    if (class516.field7575 == 2 && var163 < class223.field3106) {
                        field6946[field6949++] = class405.field5628[var163];
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var164 = field6946[--field6949];
                    if (class516.field7575 == 2 && var164 < class223.field3106) {
                        field6946[field6949++] = class403.field5592[var164];
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var165 = field6950[--field6933];
                    int var166 = field6946[--field6949];
                    class183.method1112(var165, (byte) 5, var166);
                    return;
                }
                if (arg0 == 3605) {
                    String var167 = field6950[--field6933];
                    class116.method740((byte) 84, var167);
                    return;
                }
                if (arg0 == 3606) {
                    String var168 = field6950[--field6933];
                    class270.method1541(var168, 1);
                    return;
                }
                if (arg0 == 3607) {
                    String var169 = field6950[--field6933];
                    class244.method1442(false, var169, 0);
                    return;
                }
                if (arg0 == 3608) {
                    String var170 = field6950[--field6933];
                    class388.method2232(false, var170);
                    return;
                }
                if (arg0 == 3609) {
                    String var171 = field6950[--field6933];
                    if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                        var171 = var171.substring(7);
                    }
                    field6946[field6949++] = class314.method1775((byte) 121, var171) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var172 = field6946[--field6949];
                    if (class516.field7575 == 2 && var172 < class223.field3106) {
                        field6950[field6933++] = class467.field6831[var172];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class44.field617 != null) {
                        field6950[field6933++] = class411.method2441((byte) -108, class44.field617);
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class44.field617 != null) {
                        field6946[field6949++] = class520.field7653;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var173 = field6946[--field6949];
                    if (class44.field617 != null && var173 < class520.field7653) {
                        field6950[field6933++] = class80.field1136[var173].field2887;
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var174 = field6946[--field6949];
                    if (class44.field617 != null && var174 < class520.field7653) {
                        field6946[field6949++] = class80.field1136[var174].field2883;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var175 = field6946[--field6949];
                    if (class44.field617 != null && var175 < class520.field7653) {
                        field6946[field6949++] = class80.field1136[var175].field2885;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6946[field6949++] = class485.field7107;
                    return;
                }
                if (arg0 == 3617) {
                    String var176 = field6950[--field6933];
                    class438.method2613(89, var176);
                    return;
                }
                if (arg0 == 3618) {
                    field6946[field6949++] = class285.field3835;
                    return;
                }
                if (arg0 == 3619) {
                    String var177 = field6950[--field6933];
                    class13.method112(var177, 2048);
                    return;
                }
                if (arg0 == 3620) {
                    class453.method2676(0);
                    return;
                }
                if (arg0 == 3621) {
                    if (class516.field7575 == 0) {
                        field6946[field6949++] = -1;
                        return;
                    }
                    field6946[field6949++] = class336.field4605;
                    return;
                }
                if (arg0 == 3622) {
                    int var178 = field6946[--field6949];
                    if (class516.field7575 != 0 && var178 < class336.field4605) {
                        field6950[field6933++] = class159.field2284[var178];
                        if (class463.field6729[var178] != null) {
                            field6950[field6933++] = class463.field6729[var178];
                            return;
                        }
                        field6950[field6933++] = "";
                        return;
                    }
                    field6950[field6933++] = "";
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var179 = field6950[--field6933];
                    if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                        var179 = var179.substring(7);
                    }
                    field6946[field6949++] = class487.method2864(var179, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var180 = field6946[--field6949];
                    if (class80.field1136 != null && var180 < class520.field7653 && class80.field1136[var180].field2889.equalsIgnoreCase(class75.field1089.field2693)) {
                        field6946[field6949++] = 1;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class68.field982 != null) {
                        field6950[field6933++] = class68.field982;
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var181 = field6946[--field6949];
                    if (class44.field617 != null && var181 < class520.field7653) {
                        field6950[field6933++] = class80.field1136[var181].field2890;
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var182 = field6946[--field6949];
                    if (class516.field7575 == 2 && var182 >= 0 && var182 < class223.field3106) {
                        field6946[field6949++] = class348.field4775[var182] ? 1 : 0;
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var183 = field6950[--field6933];
                    if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                        var183 = var183.substring(7);
                    }
                    field6946[field6949++] = class505.method2967(var183, -1);
                    return;
                }
                if (arg0 == 3629) {
                    field6946[field6949++] = class336.field4635;
                    return;
                }
                if (arg0 == 3630) {
                    String var184 = field6950[--field6933];
                    class244.method1442(true, var184, 0);
                    return;
                }
                if (arg0 == 3631) {
                    int var185 = field6946[--field6949];
                    field6946[field6949++] = class294.field3921[var185] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var186 = field6946[--field6949];
                    if (class44.field617 != null && var186 < class520.field7653) {
                        field6950[field6933++] = class80.field1136[var186].field2889;
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var187 = field6946[--field6949];
                    if (class516.field7575 != 0 && var187 < class336.field4605) {
                        field6950[field6933++] = class174.field2491[var187];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var188 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var188].method184((byte) -101);
                    return;
                }
                if (arg0 == 3904) {
                    int var189 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var189].field394;
                    return;
                }
                if (arg0 == 3905) {
                    int var190 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var190].field395;
                    return;
                }
                if (arg0 == 3906) {
                    int var191 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var191].field390;
                    return;
                }
                if (arg0 == 3907) {
                    int var192 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var192].field391;
                    return;
                }
                if (arg0 == 3908) {
                    int var193 = field6946[--field6949];
                    field6946[field6949++] = class521.field7682[var193].field397;
                    return;
                }
                if (arg0 == 3910) {
                    int var194 = field6946[--field6949];
                    int var195 = class521.field7682[var194].method182(8);
                    field6946[field6949++] = var195 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var196 = field6946[--field6949];
                    int var197 = class521.field7682[var196].method182(8);
                    field6946[field6949++] = var197 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var198 = field6946[--field6949];
                    int var199 = class521.field7682[var198].method182(8);
                    field6946[field6949++] = var199 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var200 = field6946[--field6949];
                    int var201 = class521.field7682[var200].method182(8);
                    field6946[field6949++] = var201 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6949 -= 2;
                    int var202 = field6946[field6949];
                    int var203 = field6946[field6949 + 1];
                    field6946[field6949++] = var202 + var203;
                    return;
                }
                if (arg0 == 4001) {
                    field6949 -= 2;
                    int var204 = field6946[field6949];
                    int var205 = field6946[field6949 + 1];
                    field6946[field6949++] = var204 - var205;
                    return;
                }
                if (arg0 == 4002) {
                    field6949 -= 2;
                    int var206 = field6946[field6949];
                    int var207 = field6946[field6949 + 1];
                    field6946[field6949++] = var206 * var207;
                    return;
                }
                if (arg0 == 4003) {
                    field6949 -= 2;
                    int var208 = field6946[field6949];
                    int var209 = field6946[field6949 + 1];
                    field6946[field6949++] = var208 / var209;
                    return;
                }
                if (arg0 == 4004) {
                    int var210 = field6946[--field6949];
                    field6946[field6949++] = (int) (Math.random() * (double) var210);
                    return;
                }
                if (arg0 == 4005) {
                    int var211 = field6946[--field6949];
                    field6946[field6949++] = (int) (Math.random() * (double) (var211 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6949 -= 5;
                    int var212 = field6946[field6949];
                    int var213 = field6946[field6949 + 1];
                    int var214 = field6946[field6949 + 2];
                    int var215 = field6946[field6949 + 3];
                    int var216 = field6946[field6949 + 4];
                    field6946[field6949++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                    return;
                }
                if (arg0 == 4007) {
                    field6949 -= 2;
                    long var217 = (long) field6946[field6949];
                    long var219 = (long) field6946[field6949 + 1];
                    field6946[field6949++] = (int) (var217 * var219 / 100L + var217);
                    return;
                }
                if (arg0 == 4008) {
                    field6949 -= 2;
                    int var221 = field6946[field6949];
                    int var222 = field6946[field6949 + 1];
                    field6946[field6949++] = var221 | 0x1 << var222;
                    return;
                }
                if (arg0 == 4009) {
                    field6949 -= 2;
                    int var223 = field6946[field6949];
                    int var224 = field6946[field6949 + 1];
                    field6946[field6949++] = var223 & -(0x1 << var224) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6949 -= 2;
                    int var225 = field6946[field6949];
                    int var226 = field6946[field6949 + 1];
                    field6946[field6949++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6949 -= 2;
                    int var227 = field6946[field6949];
                    int var228 = field6946[field6949 + 1];
                    field6946[field6949++] = var227 % var228;
                    return;
                }
                if (arg0 == 4012) {
                    field6949 -= 2;
                    int var229 = field6946[field6949];
                    int var230 = field6946[field6949 + 1];
                    if (var229 == 0) {
                        field6946[field6949++] = 0;
                        return;
                    }
                    field6946[field6949++] = (int) Math.pow((double) var229, (double) var230);
                    return;
                }
                if (arg0 == 4013) {
                    field6949 -= 2;
                    int var231 = field6946[field6949];
                    int var232 = field6946[field6949 + 1];
                    if (var231 == 0) {
                        field6946[field6949++] = 0;
                        return;
                    }
                    if (var232 == 0) {
                        field6946[field6949++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6946[field6949++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                    return;
                }
                if (arg0 == 4014) {
                    field6949 -= 2;
                    int var233 = field6946[field6949];
                    int var234 = field6946[field6949 + 1];
                    field6946[field6949++] = var233 & var234;
                    return;
                }
                if (arg0 == 4015) {
                    field6949 -= 2;
                    int var235 = field6946[field6949];
                    int var236 = field6946[field6949 + 1];
                    field6946[field6949++] = var235 | var236;
                    return;
                }
                if (arg0 == 4016) {
                    field6949 -= 2;
                    int var237 = field6946[field6949];
                    int var238 = field6946[field6949 + 1];
                    field6946[field6949++] = var237 < var238 ? var237 : var238;
                    return;
                }
                if (arg0 == 4017) {
                    field6949 -= 2;
                    int var239 = field6946[field6949];
                    int var240 = field6946[field6949 + 1];
                    field6946[field6949++] = var239 > var240 ? var239 : var240;
                    return;
                }
                if (arg0 == 4018) {
                    field6949 -= 3;
                    long var241 = (long) field6946[field6949];
                    long var243 = (long) field6946[field6949 + 1];
                    long var245 = (long) field6946[field6949 + 2];
                    field6946[field6949++] = (int) (var241 * var245 / var243);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var247 = field6950[--field6933];
                    int var248 = field6946[--field6949];
                    field6950[field6933++] = var247 + var248;
                    return;
                }
                if (arg0 == 4101) {
                    field6933 -= 2;
                    String var249 = field6950[field6933];
                    String var250 = field6950[field6933 + 1];
                    field6950[field6933++] = var249 + var250;
                    return;
                }
                if (arg0 == 4102) {
                    String var251 = field6950[--field6933];
                    int var252 = field6946[--field6949];
                    field6950[field6933++] = var251 + class217.method1286(true, false, var252);
                    return;
                }
                if (arg0 == 4103) {
                    String var253 = field6950[--field6933];
                    field6950[field6933++] = var253.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6950[field6933++] = method2799(field6946[--field6949]);
                    return;
                }
                if (arg0 == 4105) {
                    field6933 -= 2;
                    String var254 = field6950[field6933];
                    String var255 = field6950[field6933 + 1];
                    if (class75.field1089.field2741 != null && class75.field1089.field2741.field1481) {
                        field6950[field6933++] = var255;
                        return;
                    }
                    field6950[field6933++] = var254;
                    return;
                }
                if (arg0 == 4106) {
                    int var256 = field6946[--field6949];
                    field6950[field6933++] = Integer.toString(var256);
                    return;
                }
                if (arg0 == 4107) {
                    field6933 -= 2;
                    field6946[field6949++] = class498.method2936(class105.field1434, field6950[field6933 + 1], field6950[field6933], -5123);
                    return;
                }
                if (arg0 == 4108) {
                    String var257 = field6950[--field6933];
                    field6949 -= 2;
                    int var258 = field6946[field6949];
                    int var259 = field6946[field6949 + 1];
                    class56 var260 = class456.method2689(0, (byte) -52, var259, class103.field1412);
                    field6946[field6949++] = var260.method363(var258, class354.field4830, var257, (byte) 86);
                    return;
                }
                if (arg0 == 4109) {
                    String var261 = field6950[--field6933];
                    field6949 -= 2;
                    int var262 = field6946[field6949];
                    int var263 = field6946[field6949 + 1];
                    class56 var264 = class456.method2689(0, (byte) -27, var263, class103.field1412);
                    field6946[field6949++] = var264.method372(1, class354.field4830, var262, var261);
                    return;
                }
                if (arg0 == 4110) {
                    field6933 -= 2;
                    String var265 = field6950[field6933];
                    String var266 = field6950[field6933 + 1];
                    if (field6946[--field6949] == 1) {
                        field6950[field6933++] = var265;
                        return;
                    }
                    field6950[field6933++] = var266;
                    return;
                }
                if (arg0 == 4111) {
                    String var267 = field6950[--field6933];
                    field6950[field6933++] = class134.method882(false, var267);
                    return;
                }
                if (arg0 == 4112) {
                    String var268 = field6950[--field6933];
                    int var269 = field6946[--field6949];
                    if (var269 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6950[field6933++] = var268 + (char) var269;
                    return;
                }
                if (arg0 == 4113) {
                    int var270 = field6946[--field6949];
                    field6946[field6949++] = class402.method2331(-31738, (char) var270) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var271 = field6946[--field6949];
                    field6946[field6949++] = class307.method1740((char) var271, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var272 = field6946[--field6949];
                    field6946[field6949++] = class154.method966(-73, (char) var272) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var273 = field6946[--field6949];
                    field6946[field6949++] = class373.method2157(-66, (char) var273) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var274 = field6950[--field6933];
                    if (var274 != null) {
                        field6946[field6949++] = var274.length();
                        return;
                    }
                    field6946[field6949++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var275 = field6950[--field6933];
                    field6949 -= 2;
                    int var276 = field6946[field6949];
                    int var277 = field6946[field6949 + 1];
                    field6950[field6933++] = var275.substring(var276, var277);
                    return;
                }
                if (arg0 == 4119) {
                    String var278 = field6950[--field6933];
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
                    field6950[field6933++] = var279.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var283 = field6950[--field6933];
                    field6949 -= 2;
                    int var284 = field6946[field6949];
                    int var285 = field6946[field6949 + 1];
                    field6946[field6949++] = var283.indexOf(var284, var285);
                    return;
                }
                if (arg0 == 4121) {
                    field6933 -= 2;
                    String var286 = field6950[field6933];
                    String var287 = field6950[field6933 + 1];
                    int var288 = field6946[--field6949];
                    field6946[field6949++] = var286.indexOf(var287, var288);
                    return;
                }
                if (arg0 == 4122) {
                    int var289 = field6946[--field6949];
                    field6946[field6949++] = Character.toLowerCase((char) var289);
                    return;
                }
                if (arg0 == 4123) {
                    int var290 = field6946[--field6949];
                    field6946[field6949++] = Character.toUpperCase((char) var290);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var291 = field6946[--field6949] != 0;
                    int var292 = field6946[--field6949];
                    field6950[field6933++] = class463.method2723(true, var291, (long) var292, class105.field1434, 0);
                    return;
                }
                if (arg0 == 4125) {
                    String var293 = field6950[--field6933];
                    int var294 = field6946[--field6949];
                    class56 var295 = class456.method2689(0, (byte) -100, var294, class103.field1412);
                    field6946[field6949++] = var295.method365(var293, 13299, class354.field4830);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var296 = field6946[--field6949];
                    field6950[field6933++] = class75.field1097.method823(false, var296).field4345;
                    return;
                }
                if (arg0 == 4201) {
                    field6949 -= 2;
                    int var297 = field6946[field6949];
                    int var298 = field6946[field6949 + 1];
                    class316 var299 = class75.field1097.method823(false, var297);
                    if (var298 >= 1 && var298 <= 5 && var299.field4334[var298 - 1] != null) {
                        field6950[field6933++] = var299.field4334[var298 - 1];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6949 -= 2;
                    int var300 = field6946[field6949];
                    int var301 = field6946[field6949 + 1];
                    class316 var302 = class75.field1097.method823(false, var300);
                    if (var301 >= 1 && var301 <= 5 && var302.field4339[var301 - 1] != null) {
                        field6950[field6933++] = var302.field4339[var301 - 1];
                        return;
                    }
                    field6950[field6933++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var303 = field6946[--field6949];
                    field6946[field6949++] = class75.field1097.method823(false, var303).field4394;
                    return;
                }
                if (arg0 == 4204) {
                    int var304 = field6946[--field6949];
                    field6946[field6949++] = class75.field1097.method823(false, var304).field4392 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var305 = field6946[--field6949];
                    class316 var306 = class75.field1097.method823(false, var305);
                    if (var306.field4370 == -1 && var306.field4358 >= 0) {
                        field6946[field6949++] = var306.field4358;
                        return;
                    }
                    field6946[field6949++] = var305;
                    return;
                }
                if (arg0 == 4206) {
                    int var307 = field6946[--field6949];
                    class316 var308 = class75.field1097.method823(false, var307);
                    if (var308.field4370 >= 0 && var308.field4358 >= 0) {
                        field6946[field6949++] = var308.field4358;
                        return;
                    }
                    field6946[field6949++] = var307;
                    return;
                }
                if (arg0 == 4207) {
                    int var309 = field6946[--field6949];
                    field6946[field6949++] = class75.field1097.method823(false, var309).field4323 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6949 -= 2;
                    int var310 = field6946[field6949];
                    int var311 = field6946[field6949 + 1];
                    class89 var312 = class284.field3819.method1088(var311, (byte) -122);
                    if (var312.method615(85)) {
                        field6950[field6933++] = class75.field1097.method823(false, var310).method1783(var312.field1217, var311, 1);
                        return;
                    }
                    field6946[field6949++] = class75.field1097.method823(false, var310).method1790(27911, var311, var312.field1220);
                    return;
                }
                if (arg0 == 4209) {
                    field6949 -= 2;
                    int var313 = field6946[field6949];
                    int var314 = field6946[field6949 + 1] - 1;
                    class316 var315 = class75.field1097.method823(false, var313);
                    if (var315.field4348 == var314) {
                        field6946[field6949++] = var315.field4385;
                        return;
                    }
                    if (var315.field4346 == var314) {
                        field6946[field6949++] = var315.field4313;
                        return;
                    }
                    field6946[field6949++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var316 = field6950[--field6933];
                    int var317 = field6946[--field6949];
                    class347.method1924(var317 == 1, var316, -62);
                    field6946[field6949++] = class141.field2014;
                    return;
                }
                if (arg0 == 4211) {
                    if (class344.field4740 != null && class133.field1925 < class141.field2014) {
                        field6946[field6949++] = class344.field4740[class133.field1925++] & 0xFFFF;
                        return;
                    }
                    field6946[field6949++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class133.field1925 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6949 -= 2;
                    int var318 = field6946[field6949];
                    int var319 = field6946[field6949 + 1];
                    class89 var320 = class284.field3819.method1088(var319, (byte) -123);
                    if (var320.method615(81)) {
                        field6950[field6933++] = class398.field5549.method2819(var318, 102).method1869(var319, 1587964528, var320.field1217);
                        return;
                    }
                    field6946[field6949++] = class398.field5549.method2819(var318, -122).method1857(var319, (byte) -17, var320.field1220);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6949 -= 2;
                    int var321 = field6946[field6949];
                    int var322 = field6946[field6949 + 1];
                    class89 var323 = class284.field3819.method1088(var322, (byte) -122);
                    if (var323.method615(75)) {
                        field6950[field6933++] = class82.field1154.method2121(var321, true).method865(var323.field1217, var322, 1);
                        return;
                    }
                    field6946[field6949++] = class82.field1154.method2121(var321, true).method864(-1, var322, var323.field1220);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6949 -= 2;
                    int var324 = field6946[field6949];
                    int var325 = field6946[field6949 + 1];
                    class89 var326 = class284.field3819.method1088(var325, (byte) -121);
                    if (var326.method615(68)) {
                        field6950[field6933++] = class94.field1258.method572((byte) -109, var324).method1845(90, var325, var326.field1217);
                        return;
                    }
                    field6946[field6949++] = class94.field1258.method572((byte) -121, var324).method1844(-105, var326.field1220, var325);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var327 = field6946[--field6949];
                class21 var328 = class20.field211.method2561(16300, var327);
                if (var328.field249 != null && var328.field249.length > 0) {
                    int var329 = 0;
                    int var330 = var328.field256[0];
                    for (int var331 = 1; var331 < var328.field249.length; var331++) {
                        if (var328.field256[var331] > var330) {
                            var329 = var331;
                            var330 = var328.field256[var331];
                        }
                    }
                    field6946[field6949++] = var328.field249[var329];
                    return;
                }
                field6946[field6949++] = var328.field255;
                return;
            }
        } else {
            class295 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class339.method1882((byte) 114, field6946[--field6949]);
            } else {
                var47 = arg1 ? field6942 : field6927;
            }
            if (arg0 == 1300) {
                int var48 = field6946[--field6949] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1685(var48, field6950[--field6933], false);
                    return;
                }
                field6933--;
                return;
            }
            if (arg0 == 1301) {
                field6949 -= 2;
                int var49 = field6946[field6949];
                int var50 = field6946[field6949 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field4027 = null;
                    return;
                }
                var47.field4027 = class12.method106(var49, (byte) 107, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field6946[--field6949];
                if (class500.field7353 != var51 && class325.field4459 != var51 && class78.field1123 != var51) {
                    return;
                }
                var47.field4079 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field3986 = field6946[--field6949];
                return;
            }
            if (arg0 == 1304) {
                var47.field3954 = field6946[--field6949];
                return;
            }
            if (arg0 == 1305) {
                var47.field3943 = field6950[--field6933];
                return;
            }
            if (arg0 == 1306) {
                var47.field4064 = field6950[--field6933];
                return;
            }
            if (arg0 == 1307) {
                var47.field4080 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field3983 = field6946[--field6949];
                var47.field3990 = field6946[--field6949];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field6946[--field6949];
                int var53 = field6946[--field6949];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1696(var53 - 1, var52, 9005);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field4004 = field6950[--field6933];
                return;
            }
            if (arg0 == 1311) {
                var47.field4057 = field6946[--field6949];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field6949 -= 3;
                    var54 = field6946[field6949] - 1;
                    var55 = field6946[field6949 + 1];
                    var56 = field6946[field6949 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6949 -= 2;
                    var54 = 10;
                    var55 = field6946[field6949];
                    var56 = field6946[field6949 + 1];
                }
                if (var47.field4068 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field4068 = new byte[11];
                    var47.field4008 = new byte[11];
                    var47.field4032 = new int[11];
                }
                var47.field4068[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field3939 = false;
                    for (int var57 = 0; var57 < var47.field4068.length; var57++) {
                        if (var47.field4068[var57] != 0) {
                            var47.field3939 = true;
                            break;
                        }
                    }
                } else {
                    var47.field3939 = true;
                }
                var47.field4008[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field4054 = field6946[--field6949];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IZ)V")
    public static final void method2795(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2796(String arg0, int arg1) {
        if (class370.field5196 == 0 && !(!class319.field4412 || class374.field5223) || class99.field1366) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class304.field4170.method590(0, -22602))) {
            var3 = 0;
            arg0 = arg0.substring(class304.field4170.method590(0, -22602).length());
        } else if (var2.startsWith(class99.field1367.method590(0, -22602))) {
            var3 = 1;
            arg0 = arg0.substring(class99.field1367.method590(0, -22602).length());
        } else if (var2.startsWith(class68.field992.method590(0, -22602))) {
            var3 = 2;
            arg0 = arg0.substring(class68.field992.method590(0, -22602).length());
        } else if (var2.startsWith(class79.field1133.method590(0, -22602))) {
            var3 = 3;
            arg0 = arg0.substring(class79.field1133.method590(0, -22602).length());
        } else if (var2.startsWith(class504.field7411.method590(0, -22602))) {
            var3 = 4;
            arg0 = arg0.substring(class504.field7411.method590(0, -22602).length());
        } else if (var2.startsWith(class430.field6265.method590(0, -22602))) {
            var3 = 5;
            arg0 = arg0.substring(class430.field6265.method590(0, -22602).length());
        } else if (var2.startsWith(class407.field5641.method590(0, -22602))) {
            var3 = 6;
            arg0 = arg0.substring(class407.field5641.method590(0, -22602).length());
        } else if (var2.startsWith(class40.field537.method590(0, -22602))) {
            var3 = 7;
            arg0 = arg0.substring(class40.field537.method590(0, -22602).length());
        } else if (var2.startsWith(class244.field3404.method590(0, -22602))) {
            var3 = 8;
            arg0 = arg0.substring(class244.field3404.method590(0, -22602).length());
        } else if (var2.startsWith(class464.field6748.method590(0, -22602))) {
            var3 = 9;
            arg0 = arg0.substring(class464.field6748.method590(0, -22602).length());
        } else if (var2.startsWith(class250.field3481.method590(0, -22602))) {
            var3 = 10;
            arg0 = arg0.substring(class250.field3481.method590(0, -22602).length());
        } else if (var2.startsWith(class51.field692.method590(0, -22602))) {
            var3 = 11;
            arg0 = arg0.substring(class51.field692.method590(0, -22602).length());
        } else if (class105.field1434 != 0) {
            if (var2.startsWith(class304.field4170.method590(class105.field1434, -22602))) {
                var3 = 0;
                arg0 = arg0.substring(class304.field4170.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class99.field1367.method590(class105.field1434, -22602))) {
                var3 = 1;
                arg0 = arg0.substring(class99.field1367.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class68.field992.method590(class105.field1434, -22602))) {
                var3 = 2;
                arg0 = arg0.substring(class68.field992.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class79.field1133.method590(class105.field1434, -22602))) {
                var3 = 3;
                arg0 = arg0.substring(class79.field1133.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class504.field7411.method590(class105.field1434, -22602))) {
                var3 = 4;
                arg0 = arg0.substring(class504.field7411.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class430.field6265.method590(class105.field1434, -22602))) {
                var3 = 5;
                arg0 = arg0.substring(class430.field6265.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class407.field5641.method590(class105.field1434, -22602))) {
                var3 = 6;
                arg0 = arg0.substring(class407.field5641.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class40.field537.method590(class105.field1434, -22602))) {
                var3 = 7;
                arg0 = arg0.substring(class40.field537.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class244.field3404.method590(class105.field1434, -22602))) {
                var3 = 8;
                arg0 = arg0.substring(class244.field3404.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class464.field6748.method590(class105.field1434, -22602))) {
                var3 = 9;
                arg0 = arg0.substring(class464.field6748.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class250.field3481.method590(class105.field1434, -22602))) {
                var3 = 10;
                arg0 = arg0.substring(class250.field3481.method590(class105.field1434, -22602).length());
            } else if (var2.startsWith(class51.field692.method590(class105.field1434, -22602))) {
                var3 = 11;
                arg0 = arg0.substring(class51.field692.method590(class105.field1434, -22602).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class149.field2107.method590(0, -22602))) {
            var5 = 1;
            arg0 = arg0.substring(class149.field2107.method590(0, -22602).length());
        } else if (var4.startsWith(class16.field173.method590(0, -22602))) {
            var5 = 2;
            arg0 = arg0.substring(class16.field173.method590(0, -22602).length());
        } else if (var4.startsWith(class506.field7437.method590(0, -22602))) {
            var5 = 3;
            arg0 = arg0.substring(class506.field7437.method590(0, -22602).length());
        } else if (var4.startsWith(class516.field7569.method590(0, -22602))) {
            var5 = 4;
            arg0 = arg0.substring(class516.field7569.method590(0, -22602).length());
        } else if (var4.startsWith(class253.field3512.method590(0, -22602))) {
            var5 = 5;
            arg0 = arg0.substring(class253.field3512.method590(0, -22602).length());
        } else if (class105.field1434 != 0) {
            if (var4.startsWith(class149.field2107.method590(class105.field1434, -22602))) {
                var5 = 1;
                arg0 = arg0.substring(class149.field2107.method590(class105.field1434, -22602).length());
            } else if (var4.startsWith(class16.field173.method590(class105.field1434, -22602))) {
                var5 = 2;
                arg0 = arg0.substring(class16.field173.method590(class105.field1434, -22602).length());
            } else if (var4.startsWith(class506.field7437.method590(class105.field1434, -22602))) {
                var5 = 3;
                arg0 = arg0.substring(class506.field7437.method590(class105.field1434, -22602).length());
            } else if (var4.startsWith(class516.field7569.method590(class105.field1434, -22602))) {
                var5 = 4;
                arg0 = arg0.substring(class516.field7569.method590(class105.field1434, -22602).length());
            } else if (var4.startsWith(class253.field3512.method590(class105.field1434, -22602))) {
                var5 = 5;
                arg0 = arg0.substring(class253.field3512.method590(class105.field1434, -22602).length());
            }
        }
        field6936++;
        class356.method1978((byte) 41, class258.field3562);
        class244.field3395.method2084(0, false);
        int var6 = class244.field3395.field5069;
        if (arg1 == 5021) {
            class244.field3395.method2084(1, false);
        } else if (arg1 == 5022) {
            class244.field3395.method2084(2, false);
        } else {
            class244.field3395.method2084(0, false);
        }
        class244.field3395.method2084(var3, false);
        class244.field3395.method2084(var5, false);
        class47.method291(arg0, 0, class244.field3395);
        class244.field3395.method2107(class244.field3395.field5069 - var6, -35);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(IZ)V")
    private static final void method2797(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6946[field6949++] = class134.field1943;
                return;
            }
            if (arg0 == 5001) {
                field6949 -= 3;
                class134.field1943 = field6946[field6949];
                class451.field6506 = class135.method885(4, field6946[field6949 + 1]);
                if (class451.field6506 == null) {
                    class451.field6506 = class140.field1994;
                }
                class185.field2581 = field6946[field6949 + 2];
                field6932++;
                class356.method1978((byte) 77, class220.field3081);
                class244.field3395.method2084(class134.field1943, false);
                class244.field3395.method2084(class451.field6506.field7563, false);
                class244.field3395.method2084(class185.field2581, false);
                return;
            }
            if (arg0 == 5002) {
                field6933 -= 2;
                String var2 = field6950[field6933];
                String var3 = field6950[field6933 + 1];
                field6949 -= 2;
                int var4 = field6946[field6949];
                int var5 = field6946[field6949 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field6941++;
                class356.method1978((byte) 43, class471.field6891);
                class244.field3395.method2084(class121.method780(var2, (byte) 75) + class121.method780(var3, (byte) 79) + 2, false);
                class244.field3395.method2073(62, var2);
                class244.field3395.method2084(var4 - 1, false);
                class244.field3395.method2084(var5, false);
                class244.field3395.method2073(115, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field6946[--field6949];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class477.field6984[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field6950[field6933++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field6946[--field6949];
                int var9 = -1;
                if (var8 < 100 && class477.field6984[var8] != null) {
                    var9 = class405.field5626[var8];
                }
                field6946[field6949++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class451.field6506 == null) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = class451.field6506.field7563;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
                String var10 = field6950[--field6933];
                method2796(var10, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6933 -= 2;
                String var11 = field6950[field6933];
                String var12 = field6950[field6933 + 1];
                if (class370.field5196 != 0 || (!class319.field4412 || class374.field5223) && !class99.field1366) {
                    field6931++;
                    class356.method1978((byte) 81, class35.field491);
                    class244.field3395.method2084(0, false);
                    int var13 = class244.field3395.field5069;
                    class244.field3395.method2073(110, var11);
                    class47.method291(var12, 0, class244.field3395);
                    class244.field3395.method2107(class244.field3395.field5069 - var13, 125);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var14 = field6946[--field6949];
                String var15 = null;
                if (var14 < 100) {
                    var15 = class188.field2606[var14];
                }
                if (var15 == null) {
                    var15 = "";
                }
                field6950[field6933++] = var15;
                return;
            }
            if (arg0 == 5011) {
                int var16 = field6946[--field6949];
                String var17 = null;
                if (var16 < 100) {
                    var17 = class457.field6680[var16];
                }
                if (var17 == null) {
                    var17 = "";
                }
                field6950[field6933++] = var17;
                return;
            }
            if (arg0 == 5012) {
                int var18 = field6946[--field6949];
                int var19 = -1;
                if (var18 < 100) {
                    var19 = class344.field4743[var18];
                }
                field6946[field6949++] = var19;
                return;
            }
            if (arg0 == 5015) {
                String var20;
                if (class75.field1089 == null || class75.field1089.field2692 == null) {
                    var20 = class247.field3445;
                } else {
                    var20 = class75.field1089.method1157(-1, true);
                }
                field6950[field6933++] = var20;
                return;
            }
            if (arg0 == 5016) {
                field6946[field6949++] = class185.field2581;
                return;
            }
            if (arg0 == 5017) {
                field6946[field6949++] = class322.field4445;
                return;
            }
            if (arg0 == 5018) {
                int var21 = field6946[--field6949];
                int var22 = 0;
                if (var21 < 100 && class477.field6984[var21] != null) {
                    var22 = class405.field5626[var21];
                }
                field6946[field6949++] = var22;
                return;
            }
            if (arg0 == 5019) {
                int var23 = field6946[--field6949];
                String var24 = null;
                if (var23 < 100) {
                    var24 = class35.field498[var23];
                }
                if (var24 == null) {
                    var24 = "";
                }
                field6950[field6933++] = var24;
                return;
            }
            if (arg0 == 5020) {
                String var25;
                if (class75.field1089 == null || class75.field1089.field2692 == null) {
                    var25 = class247.field3445;
                } else {
                    var25 = class75.field1089.method1164(240, false);
                }
                field6950[field6933++] = var25;
                return;
            }
            if (arg0 == 5050) {
                int var26 = field6946[--field6949];
                field6950[field6933++] = class118.field1585.method373(var26, 0).field5561;
                return;
            }
            if (arg0 == 5051) {
                int var27 = field6946[--field6949];
                class400 var28 = class118.field1585.method373(var27, 0);
                if (var28.field5559 == null) {
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = var28.field5559.length;
                return;
            }
            if (arg0 == 5052) {
                field6949 -= 2;
                int var29 = field6946[field6949];
                int var30 = field6946[field6949 + 1];
                class400 var31 = class118.field1585.method373(var29, 0);
                int var32 = var31.field5559[var30];
                field6946[field6949++] = var32;
                return;
            }
            if (arg0 == 5053) {
                int var33 = field6946[--field6949];
                class400 var34 = class118.field1585.method373(var33, 0);
                if (var34.field5564 == null) {
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = var34.field5564.length;
                return;
            }
            if (arg0 == 5054) {
                field6949 -= 2;
                int var35 = field6946[field6949];
                int var36 = field6946[field6949 + 1];
                field6946[field6949++] = class118.field1585.method373(var35, 0).field5564[var36];
                return;
            }
            if (arg0 == 5055) {
                int var37 = field6946[--field6949];
                field6950[field6933++] = class517.field7602.method2((byte) -47, var37).method2456(-82);
                return;
            }
            if (arg0 == 5056) {
                int var38 = field6946[--field6949];
                class412 var39 = class517.field7602.method2((byte) -47, var38);
                if (var39.field6040 == null) {
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = var39.field6040.length;
                return;
            }
            if (arg0 == 5057) {
                field6949 -= 2;
                int var40 = field6946[field6949];
                int var41 = field6946[field6949 + 1];
                field6946[field6949++] = class517.field7602.method2((byte) -47, var40).field6040[var41];
                return;
            }
            if (arg0 == 5058) {
                field6938 = new class466();
                field6938.field6801 = field6946[--field6949];
                field6938.field6798 = class517.field7602.method2((byte) -47, field6938.field6801);
                field6938.field6797 = new int[field6938.field6798.method2458((byte) -74)];
                return;
            }
            if (arg0 == 5059) {
                field6929++;
                class356.method1978((byte) 38, class167.field2355);
                class244.field3395.method2084(0, false);
                int var42 = class244.field3395.field5069;
                class244.field3395.method2084(0, false);
                class244.field3395.method2070(81954016, field6938.field6801);
                field6938.field6798.method2449(class244.field3395, (byte) -101, field6938.field6797);
                class244.field3395.method2107(class244.field3395.field5069 - var42, -65);
                return;
            }
            if (arg0 == 5060) {
                String var43 = field6950[--field6933];
                field6945++;
                class356.method1978((byte) 85, class403.field5594);
                class244.field3395.method2084(0, false);
                int var44 = class244.field3395.field5069;
                class244.field3395.method2073(61, var43);
                class244.field3395.method2070(81954016, field6938.field6801);
                field6938.field6798.method2449(class244.field3395, (byte) -117, field6938.field6797);
                class244.field3395.method2107(class244.field3395.field5069 - var44, -38);
                return;
            }
            if (arg0 == 5061) {
                field6929++;
                class356.method1978((byte) 126, class167.field2355);
                class244.field3395.method2084(0, false);
                int var45 = class244.field3395.field5069;
                class244.field3395.method2084(1, false);
                class244.field3395.method2070(81954016, field6938.field6801);
                field6938.field6798.method2449(class244.field3395, (byte) -87, field6938.field6797);
                class244.field3395.method2107(class244.field3395.field5069 - var45, 100);
                return;
            }
            if (arg0 == 5062) {
                field6949 -= 2;
                int var46 = field6946[field6949];
                int var47 = field6946[field6949 + 1];
                field6946[field6949++] = class118.field1585.method373(var46, 0).field5557[var47];
                return;
            }
            if (arg0 == 5063) {
                field6949 -= 2;
                int var48 = field6946[field6949];
                int var49 = field6946[field6949 + 1];
                field6946[field6949++] = class118.field1585.method373(var48, 0).field5565[var49];
                return;
            }
            if (arg0 == 5064) {
                field6949 -= 2;
                int var50 = field6946[field6949];
                int var51 = field6946[field6949 + 1];
                if (var51 == -1) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = class118.field1585.method373(var50, 0).method2316((char) var51, 0);
                return;
            }
            if (arg0 == 5065) {
                field6949 -= 2;
                int var52 = field6946[field6949];
                int var53 = field6946[field6949 + 1];
                if (var53 == -1) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = class118.field1585.method373(var52, 0).method2317(true, (char) var53);
                return;
            }
            if (arg0 == 5066) {
                int var54 = field6946[--field6949];
                field6946[field6949++] = class517.field7602.method2((byte) -47, var54).method2458((byte) 122);
                return;
            }
            if (arg0 == 5067) {
                field6949 -= 2;
                int var55 = field6946[field6949];
                int var56 = field6946[field6949 + 1];
                int var57 = class517.field7602.method2((byte) -47, var55).method2459(var56, (byte) 126).field3192;
                field6946[field6949++] = var57;
                return;
            }
            if (arg0 == 5068) {
                field6949 -= 2;
                int var58 = field6946[field6949];
                int var59 = field6946[field6949 + 1];
                field6938.field6797[var58] = var59;
                return;
            }
            if (arg0 == 5069) {
                field6949 -= 2;
                int var60 = field6946[field6949];
                int var61 = field6946[field6949 + 1];
                field6938.field6797[var60] = var61;
                return;
            }
            if (arg0 == 5070) {
                field6949 -= 3;
                int var62 = field6946[field6949];
                int var63 = field6946[field6949 + 1];
                int var64 = field6946[field6949 + 2];
                class412 var65 = class517.field7602.method2((byte) -47, var62);
                if (var65.method2459(var63, (byte) 112).field3192 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6946[field6949++] = var65.method2460(var64, var63, -64);
                return;
            }
            if (arg0 == 5071) {
                String var66 = field6950[--field6933];
                boolean var67 = field6946[--field6949] == 1;
                class441.method2633(var67, var66, (byte) 15);
                field6946[field6949++] = class141.field2014;
                return;
            }
            if (arg0 == 5072) {
                if (class344.field4740 != null && class133.field1925 < class141.field2014) {
                    field6946[field6949++] = class344.field4740[class133.field1925++] & 0xFFFF;
                    return;
                }
                field6946[field6949++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class133.field1925 = 0;
                return;
            }
            if (arg0 == 5074) {
                field6929++;
                class356.method1978((byte) 73, class167.field2355);
                class244.field3395.method2084(0, false);
                int var68 = class244.field3395.field5069;
                class244.field3395.method2084(2, false);
                class244.field3395.method2070(81954016, field6938.field6801);
                field6938.field6798.method2449(class244.field3395, (byte) -88, field6938.field6797);
                class244.field3395.method2107(class244.field3395.field5069 - var68, 105);
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class488.field7125.method1212(-1, 86)) {
                    field6946[field6949++] = 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class488.field7125.method1212(-1, 82)) {
                    field6946[field6949++] = 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class488.field7125.method1212(-1, 81)) {
                    field6946[field6949++] = 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class426.method2552(field6946[--field6949], (byte) -90);
                return;
            }
            if (arg0 == 5201) {
                field6946[field6949++] = class117.method742(75);
                return;
            }
            if (arg0 == 5205) {
                class151.method957(field6946[--field6949], -1, 98, -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var69 = field6946[--field6949];
                class433 var70 = class481.method2831(var69 >> 14 & 0x3FFF, var69 & 0x3FFF);
                if (var70 == null) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = var70.field6290;
                return;
            }
            if (arg0 == 5207) {
                class433 var71 = class481.method2825(field6946[--field6949]);
                if (var71 != null && var71.field6299 != null) {
                    field6950[field6933++] = var71.field6299;
                    return;
                }
                field6950[field6933++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6946[field6949++] = class61.field812;
                field6946[field6949++] = class59.field796;
                return;
            }
            if (arg0 == 5209) {
                field6946[field6949++] = class481.field7046 + class201.field2872;
                field6946[field6949++] = class481.field7066 + class137.field1956;
                return;
            }
            if (arg0 == 5210) {
                int var72 = field6946[--field6949];
                class433 var73 = class481.method2825(var72);
                if (var73 == null) {
                    field6946[field6949++] = 0;
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = var73.field6297 >> 14 & 0x3FFF;
                field6946[field6949++] = var73.field6297 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var74 = field6946[--field6949];
                class433 var75 = class481.method2825(var74);
                if (var75 == null) {
                    field6946[field6949++] = 0;
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = var75.field6295 - var75.field6312;
                field6946[field6949++] = var75.field6300 - var75.field6294;
                return;
            }
            if (arg0 == 5212) {
                class92 var76 = class151.method954(69);
                if (var76 == null) {
                    field6946[field6949++] = -1;
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = var76.field1236;
                int var77 = var76.field1234 << 28 | class481.field7046 + var76.field1241 << 14 | class481.field7066 + var76.field1237;
                field6946[field6949++] = var77;
                return;
            }
            if (arg0 == 5213) {
                class92 var78 = class60.method380(-21213);
                if (var78 == null) {
                    field6946[field6949++] = -1;
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = var78.field1236;
                int var79 = var78.field1234 << 28 | class481.field7046 + var78.field1241 << 14 | class481.field7066 + var78.field1237;
                field6946[field6949++] = var79;
                return;
            }
            if (arg0 == 5214) {
                int var80 = field6946[--field6949];
                class433 var81 = class257.method1499(false);
                if (var81 != null) {
                    boolean var82 = var81.method2588(var80 >> 28 & 0x3, var80 & 0x3FFF, var80 >> 14 & 0x3FFF, 0, field6953);
                    if (var82) {
                        class243.method1441(field6953[1], (byte) 123, field6953[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6949 -= 2;
                int var83 = field6946[field6949];
                int var84 = field6946[field6949 + 1];
                class225 var85 = class481.method2830(var83 >> 14 & 0x3FFF, var83 & 0x3FFF);
                boolean var86 = false;
                for (class433 var87 = (class433) var85.method1328((byte) -69); var87 != null; var87 = (class433) var85.method1330(192)) {
                    if (var87.field6290 == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var86) {
                    field6946[field6949++] = 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var88 = field6946[--field6949];
                class433 var89 = class481.method2825(var88);
                if (var89 == null) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = var89.field6305;
                return;
            }
            if (arg0 == 5220) {
                field6946[field6949++] = class374.field5277 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var90 = field6946[--field6949];
                class243.method1441(var90 >> 14 & 0x3FFF, (byte) 127, var90 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class433 var91 = class257.method1499(false);
                if (var91 != null) {
                    boolean var92 = var91.method2584(field6953, -127, class481.field7046 + class201.field2872, class481.field7066 + class137.field1956);
                    if (var92) {
                        field6946[field6949++] = field6953[1];
                        field6946[field6949++] = field6953[2];
                        return;
                    }
                    field6946[field6949++] = -1;
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = -1;
                field6946[field6949++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6949 -= 2;
                int var93 = field6946[field6949];
                int var94 = field6946[field6949 + 1];
                class151.method957(var93, var94 >> 14 & 0x3FFF, 98, var94 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var95 = field6946[--field6949];
                class433 var96 = class257.method1499(false);
                if (var96 != null) {
                    boolean var97 = var96.method2588(var95 >> 28 & 0x3, var95 & 0x3FFF, var95 >> 14 & 0x3FFF, 0, field6953);
                    if (var97) {
                        field6946[field6949++] = field6953[1];
                        field6946[field6949++] = field6953[2];
                        return;
                    }
                    field6946[field6949++] = -1;
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = -1;
                field6946[field6949++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var98 = field6946[--field6949];
                class433 var99 = class257.method1499(false);
                if (var99 != null) {
                    boolean var100 = var99.method2584(field6953, 57, var98 >> 14 & 0x3FFF, var98 & 0x3FFF);
                    if (var100) {
                        field6946[field6949++] = field6953[1];
                        field6946[field6949++] = field6953[2];
                        return;
                    }
                    field6946[field6949++] = -1;
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = -1;
                field6946[field6949++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class28.method196(field6946[--field6949], 8230);
                return;
            }
            if (arg0 == 5227) {
                field6949 -= 2;
                int var101 = field6946[field6949];
                int var102 = field6946[field6949 + 1];
                class151.method957(var101, var102 >> 14 & 0x3FFF, 98, var102 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class59.field797 = field6946[--field6949] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6946[field6949++] = class59.field797 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var103 = field6946[--field6949];
                class354.method1961(var103, (byte) 83);
                return;
            }
            if (arg0 == 5231) {
                field6949 -= 2;
                int var104 = field6946[field6949];
                boolean var105 = field6946[field6949 + 1] == 1;
                if (class292.field3907 != null) {
                    class499 var106 = class292.field3907.method979((byte) 28, (long) var104);
                    if (var106 != null && !var105) {
                        var106.method2946(-114);
                        return;
                    }
                    if (var106 == null && var105) {
                        class499 var107 = new class499();
                        class292.field3907.method990((long) var104, (byte) 47, var107);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var108 = field6946[--field6949];
                if (class292.field3907 != null) {
                    class499 var109 = class292.field3907.method979((byte) 28, (long) var108);
                    field6946[field6949++] = var109 == null ? 0 : 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6949 -= 2;
                int var110 = field6946[field6949];
                boolean var111 = field6946[field6949 + 1] == 1;
                if (class519.field7647 != null) {
                    class499 var112 = class519.field7647.method979((byte) 28, (long) var110);
                    if (var112 != null && !var111) {
                        var112.method2946(-122);
                        return;
                    }
                    if (var112 == null && var111) {
                        class499 var113 = new class499();
                        class519.field7647.method990((long) var110, (byte) 10, var113);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var114 = field6946[--field6949];
                if (class519.field7647 != null) {
                    class499 var115 = class519.field7647.method979((byte) 28, (long) var114);
                    field6946[field6949++] = var115 == null ? 0 : 1;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6946[field6949++] = class481.field7034 == null ? -1 : class481.field7034.field6290;
                return;
            }
            if (arg0 == 5236) {
                field6949 -= 2;
                int var116 = field6946[field6949];
                int var117 = field6946[field6949 + 1];
                int var118 = var117 >> 14 & 0x3FFF;
                int var119 = var117 & 0x3FFF;
                int var120 = class299.method1709(var119, var116, var118, true);
                if (var120 < 0) {
                    field6946[field6949++] = -1;
                    return;
                }
                field6946[field6949++] = var120;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6949 -= 2;
                int var121 = field6946[field6949];
                int var122 = field6946[field6949 + 1];
                class161.method997(var122, false, var121, 3, false);
                field6946[field6949++] = class38.field513 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class38.field513 != null) {
                    class161.method997(-1, false, -1, class437.field6374.field4263, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class319[] var123 = class240.method1395(0);
                field6946[field6949++] = var123.length;
                return;
            }
            if (arg0 == 5303) {
                int var124 = field6946[--field6949];
                class319[] var125 = class240.method1395(0);
                field6946[field6949++] = var125[var124].field4405;
                field6946[field6949++] = var125[var124].field4407;
                return;
            }
            if (arg0 == 5305) {
                int var126 = class437.field6374.field4269;
                int var127 = class437.field6374.field4253;
                int var128 = -1;
                class319[] var129 = class240.method1395(0);
                for (int var130 = 0; var130 < var129.length; var130++) {
                    class319 var131 = var129[var130];
                    if (var131.field4405 == var126 && var131.field4407 == var127) {
                        var128 = var130;
                        break;
                    }
                }
                field6946[field6949++] = var128;
                return;
            }
            if (arg0 == 5306) {
                field6946[field6949++] = class448.method2641((byte) 101);
                return;
            }
            if (arg0 == 5307) {
                int var132 = field6946[--field6949];
                if (var132 >= 1 && var132 <= 2) {
                    class161.method997(-1, false, -1, var132, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6946[field6949++] = class437.field6374.field4263;
                return;
            }
            if (arg0 == 5309) {
                int var133 = field6946[--field6949];
                if (var133 >= 1 && var133 <= 2) {
                    class437.field6374.field4263 = var133;
                    class437.field6374.method557(class282.field3804, (byte) -80);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6933 -= 2;
                String var134 = field6950[field6933];
                String var135 = field6950[field6933 + 1];
                int var136 = field6946[--field6949];
                field6937++;
                class356.method1978((byte) 78, class441.field6420);
                class244.field3395.method2084(class121.method780(var134, (byte) 53) + class121.method780(var135, (byte) 45) + 1, false);
                class244.field3395.method2073(27, var134);
                class244.field3395.method2073(47, var135);
                class244.field3395.method2084(var136, false);
                return;
            }
            if (arg0 == 5401) {
                field6949 -= 2;
                class446.field6467[field6946[field6949]] = (short) class343.method1913(field6946[field6949 + 1], -244);
                class75.field1097.method818((byte) -103);
                class75.field1097.method826(false);
                class398.field5549.method2812((byte) -31);
                class242.method1428((byte) 127);
                return;
            }
            if (arg0 == 5405) {
                field6949 -= 2;
                int var137 = field6946[field6949];
                int var138 = field6946[field6949 + 1];
                if (var137 >= 0 && var137 < 2) {
                    class418.field6119[var137] = new int[var138 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6949 -= 7;
                int var139 = field6946[field6949];
                int var140 = field6946[field6949 + 1] << 1;
                int var141 = field6946[field6949 + 2];
                int var142 = field6946[field6949 + 3];
                int var143 = field6946[field6949 + 4];
                int var144 = field6946[field6949 + 5];
                int var145 = field6946[field6949 + 6];
                if (var139 >= 0 && var139 < 2 && class418.field6119[var139] != null && var140 >= 0 && var140 < class418.field6119[var139].length) {
                    class418.field6119[var139][var140] = new int[] { (var141 >> 14 & 0x3FFF) << 7, var142, (var141 & 0x3FFF) << 7, var145 };
                    class418.field6119[var139][var140 + 1] = new int[] { (var143 >> 14 & 0x3FFF) << 7, var144, (var143 & 0x3FFF) << 7 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var146 = class418.field6119[field6946[--field6949]].length >> 1;
                field6946[field6949++] = var146;
                return;
            }
            if (arg0 == 5411) {
                if (class38.field513 != null) {
                    class161.method997(-1, false, -1, class437.field6374.field4263, false);
                }
                if (class140.field1993 != null) {
                    class477.method2805((byte) -122);
                    System.exit(0);
                    return;
                }
                String var147 = class153.field2206 == null ? class188.method1129((byte) 49) : class153.field2206;
                class499.method2943(false, class282.field3804, var147, class278.field3761 == 1, (byte) -112);
                return;
            }
            if (arg0 == 5419) {
                String var148 = "";
                if (class213.field3039 != null) {
                    if (class213.field3039.field5654 == null) {
                        var148 = class164.method1019(-97, class213.field3039.field5649);
                    } else {
                        var148 = (String) class213.field3039.field5654;
                    }
                }
                field6950[field6933++] = var148;
                return;
            }
            if (arg0 == 5420) {
                field6946[field6949++] = class397.field5519 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class38.field513 != null) {
                    class161.method997(-1, false, -1, class437.field6374.field4263, false);
                }
                String var149 = field6950[--field6933];
                boolean var150 = field6946[--field6949] == 1;
                String var151 = class188.method1129((byte) 45) + var149;
                class499.method2943(var150, class282.field3804, var151, class278.field3761 == 1, (byte) -112);
                return;
            }
            if (arg0 == 5422) {
                field6933 -= 2;
                String var152 = field6950[field6933];
                String var153 = field6950[field6933 + 1];
                int var154 = field6946[--field6949];
                if (var152.length() > 0) {
                    if (class190.field2643 == null) {
                        class190.field2643 = new String[class33.field460[class341.field4700.field2232]];
                    }
                    class190.field2643[var154] = var152;
                }
                if (var153.length() > 0) {
                    if (class246.field3434 == null) {
                        class246.field3434 = new String[class33.field460[class341.field4700.field2232]];
                    }
                    class246.field3434[var154] = var153;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6950[--field6933]);
                return;
            }
            if (arg0 == 5424) {
                field6949 -= 11;
                class474.field6925 = field6946[field6949];
                class362.field5019 = field6946[field6949 + 1];
                class251.field3484 = field6946[field6949 + 2];
                class300.field4117 = field6946[field6949 + 3];
                class141.field2004 = field6946[field6949 + 4];
                class466.field6799 = field6946[field6949 + 5];
                class131.field1801 = field6946[field6949 + 6];
                class337.field4651 = field6946[field6949 + 7];
                class241.field3330 = field6946[field6949 + 8];
                class85.field1174 = field6946[field6949 + 9];
                class127.field1738 = field6946[field6949 + 10];
                class192.field2735.method1412(class141.field2004, 1);
                class192.field2735.method1412(class466.field6799, 1);
                class192.field2735.method1412(class131.field1801, 1);
                class192.field2735.method1412(class337.field4651, 1);
                class192.field2735.method1412(class241.field3330, 1);
                class482.field7076 = null;
                class321.field4442 = null;
                class461.field6703 = null;
                class473.field6914 = null;
                class323.field4452 = null;
                class157.field2237 = null;
                class125.field1724 = null;
                class472.field6901 = null;
                class205.field2910 = true;
                return;
            }
            if (arg0 == 5425) {
                class386.method2222(false);
                class205.field2910 = false;
                return;
            }
            if (arg0 == 5426) {
                field6949 -= 2;
                class367.field5160 = field6946[field6949];
                class118.field1593 = field6946[field6949 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6949 -= 2;
                class247.field3442 = field6946[field6949 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6949 -= 2;
                int var155 = field6946[field6949];
                int var156 = field6946[field6949 + 1];
                field6946[field6949++] = class253.method1489(var156, (byte) -115, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class109.method701(-3, false, field6950[--field6933]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class484.method2855(class282.field3804.field5516, "accountcreated", -29222);
                    return;
                } catch (Throwable var266) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6949 -= 4;
                int var157 = field6946[field6949];
                int var158 = field6946[field6949 + 1];
                int var159 = field6946[field6949 + 2];
                int var160 = field6946[field6949 + 3];
                class385.method2214(var160, (var157 & 0x3FFF) - class79.field1134, -98, false, var158, (var157 >> 14 & 0x3FFF) - class215.field3059, var159);
                return;
            }
            if (arg0 == 5501) {
                field6949 -= 4;
                int var161 = field6946[field6949];
                int var162 = field6946[field6949 + 1];
                int var163 = field6946[field6949 + 2];
                int var164 = field6946[field6949 + 3];
                class351.method1940(6760, (var161 >> 14 & 0x3FFF) - class215.field3059, var164, var162, var163, (var161 & 0x3FFF) - class79.field1134);
                return;
            }
            if (arg0 == 5502) {
                field6949 -= 6;
                int var165 = field6946[field6949];
                if (var165 >= 2) {
                    throw new RuntimeException();
                }
                class210.field2983 = var165;
                int var166 = field6946[field6949 + 1];
                if (var166 + 1 >= class418.field6119[class210.field2983].length >> 1) {
                    throw new RuntimeException();
                }
                class168.field2387 = var166;
                class471.field6889 = 0;
                class398.field5540 = field6946[field6949 + 2];
                class170.field2406 = field6946[field6949 + 3];
                int var167 = field6946[field6949 + 4];
                if (var167 >= 2) {
                    throw new RuntimeException();
                }
                class128.field1745 = var167;
                int var168 = field6946[field6949 + 5];
                if (var168 + 1 >= class418.field6119[class128.field1745].length >> 1) {
                    throw new RuntimeException();
                }
                class236.field3262 = var168;
                class128.field1742 = 3;
                return;
            }
            if (arg0 == 5503) {
                class171.method1062(0);
                return;
            }
            if (arg0 == 5504) {
                field6949 -= 2;
                class393.method2251(0, (byte) -119, field6946[field6949], field6946[field6949 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field6946[field6949++] = (int) class510.field7495 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6946[field6949++] = (int) class40.field553 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class299.method1706(120);
                return;
            }
            if (arg0 == 5508) {
                class145.method929(-16);
                return;
            }
            if (arg0 == 5509) {
                class85.method598(false);
                return;
            }
            if (arg0 == 5510) {
                class430.method2570(28);
                return;
            }
            if (arg0 == 5511) {
                int var169 = field6946[--field6949];
                int var170 = var169 >> 14 & 0x3FFF;
                int var171 = var169 & 0x3FFF;
                int var172 = var170 - class215.field3059;
                if (var172 < 0) {
                    var172 = 0;
                } else if (var172 >= class442.field6435) {
                    var172 = class442.field6435;
                }
                int var173 = var171 - class79.field1134;
                if (var173 < 0) {
                    var173 = 0;
                } else if (var173 >= class232.field3217) {
                    var173 = class232.field3217;
                }
                class127.field1740 = (var172 << 7) + 64;
                class509.field7470 = (var173 << 7) + 64;
                class128.field1742 = 4;
                return;
            }
            if (arg0 == 5512) {
                class38.method247(-101);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6933 -= 2;
                String var174 = field6950[field6933];
                String var175 = field6950[field6933 + 1];
                int var176 = field6946[--field6949];
                if (class137.field1958 != 10) {
                    return;
                }
                if (class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0 && class527.field7736 == 0) {
                    class423.method2529(var176, var175, -3, var174);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class161.method995((byte) -128);
                return;
            }
            if (arg0 == 5602) {
                if (class305.field4186 == 0) {
                    class320.field4424 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field6949 -= 4;
                if (class137.field1958 != 10) {
                    return;
                }
                if (class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0 && class527.field7736 == 0) {
                    class244.method1443(field6946[field6949 + 1], (byte) 16, field6946[field6949 + 3], field6946[field6949 + 2], field6946[field6949]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field6933--;
                if (class137.field1958 != 10) {
                    return;
                }
                if (class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0 && class527.field7736 == 0) {
                    class167.method1030(false, class162.method998((byte) 109, field6950[field6933]));
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6933 -= 3;
                field6949 -= 7;
                if (class137.field1958 != 10) {
                    return;
                }
                if (class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0 && class527.field7736 == 0) {
                    class84.method595(class162.method998((byte) 109, field6950[field6933]), field6950[field6933 + 1], field6946[field6949 + 2], field6946[field6949 + 4] == 1, field6946[field6949], 63, field6946[field6949 + 5] == 1, field6950[field6933 + 2], field6946[field6949 + 1], field6946[field6949 + 6] == 1, field6946[field6949 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class310.field4243 == 0) {
                    class376.field5289 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6946[field6949++] = class320.field4424;
                return;
            }
            if (arg0 == 5608) {
                field6946[field6949++] = class329.field4489;
                return;
            }
            if (arg0 == 5609) {
                field6946[field6949++] = class376.field5289;
                return;
            }
            if (arg0 == 5610) {
                for (int var177 = 0; var177 < 5; var177++) {
                    field6950[field6933++] = class483.field7096.length > var177 ? class411.method2441((byte) -108, class483.field7096[var177]) : "";
                }
                class483.field7096 = null;
                return;
            }
            if (arg0 == 5611) {
                field6946[field6949++] = class362.field4979;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var178 = field6946[--field6949];
                if (var178 < 1) {
                    var178 = 1;
                }
                if (var178 > 4) {
                    var178 = 4;
                }
                class437.field6374.field4255 = var178;
                class430.method2571((byte) -84);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6002) {
                class437.field6374.method561(field6946[--field6949] == 1, (byte) -70);
                class430.method2571((byte) -76);
                class83.method591((byte) -109);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6003) {
                class437.field6374.field4274 = field6946[--field6949] == 1;
                class83.method591((byte) -109);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6005) {
                class437.field6374.field4279 = field6946[--field6949] == 1;
                class430.method2571((byte) -98);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6006) {
                class437.field6374.field4281 = field6946[--field6949] == 1;
                class418.field6109.method500(!class437.field6374.field4281);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6007) {
                class437.field6374.field4268 = field6946[--field6949];
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6008) {
                class437.field6374.field4260 = field6946[--field6949] == 1;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6009) {
                class437.field6374.field4283 = field6946[--field6949] == 1;
                class430.method2571((byte) -100);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6010) {
                class437.field6374.field4284 = field6946[--field6949] == 1;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6011) {
                int var179 = field6946[--field6949];
                if (var179 < 0 || var179 > 2) {
                    var179 = 0;
                }
                class437.field6374.method1762(var179, (byte) 35, class278.field3761);
                class430.method2571((byte) -36);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6012) {
                class437.field6374.method1761(field6946[--field6949] == 1, -682, class278.field3761);
                class350.method1937(2);
                class348.method1929((byte) -14);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6014) {
                class437.field6374.field4287 = field6946[--field6949] == 1;
                class430.method2571((byte) -49);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6015) {
                class437.field6374.field4250 = field6946[--field6949] == 1;
                class430.method2571((byte) -76);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6016) {
                int var180 = field6946[--field6949];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class437.field6374.field4280 = var180;
                class196.method1211(false, class278.field3761);
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6017) {
                class437.field6374.field4266 = field6946[--field6949] == 1;
                class101.method670(true);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6018) {
                int var181 = field6946[--field6949];
                if (var181 < 0) {
                    var181 = 0;
                }
                if (var181 > 127) {
                    var181 = 127;
                }
                class437.field6374.field4262 = var181;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6019) {
                int var182 = field6946[--field6949];
                if (var182 < 0) {
                    var182 = 0;
                }
                if (var182 > 255) {
                    var182 = 255;
                }
                if (class437.field6374.field4252 != var182) {
                    if (class437.field6374.field4252 == 0 && class444.field6455 != -1) {
                        class370.method2140(false, false, class252.field3511, 0, class444.field6455, var182);
                        class208.field2948 = false;
                    } else if (var182 == 0) {
                        class285.method1629(1);
                        class208.field2948 = false;
                    } else {
                        class368.method2135(false, var182);
                    }
                    class437.field6374.field4252 = var182;
                }
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6020) {
                int var183 = field6946[--field6949];
                if (var183 < 0) {
                    var183 = 0;
                }
                if (var183 > 127) {
                    var183 = 127;
                }
                class437.field6374.field4273 = var183;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6021) {
                class437.field6374.field1091 = field6946[--field6949] == 1;
                class83.method591((byte) -109);
                return;
            }
            if (arg0 == 6023) {
                int var184 = field6946[--field6949];
                boolean var185 = false;
                if (var184 < 0) {
                    var184 = 0;
                }
                if (var184 > 2) {
                    var184 = 2;
                }
                if (class463.field6730 < 96) {
                    var184 = 0;
                    var185 = true;
                }
                class295.method1699(var184, -10135);
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                field6946[field6949++] = var185 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var186 = field6946[--field6949];
                if (var186 < 0 || var186 > 2) {
                    var186 = 0;
                }
                class437.field6374.field4254 = var186;
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6025) {
                int var187 = field6946[--field6949];
                if (var187 < 0 || var187 > class129.method846(class463.field6730, (byte) 102)) {
                    var187 = 0;
                }
                class437.field6374.field4275 = var187;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6027) {
                int var188 = field6946[--field6949];
                if (var188 < 0 || var188 > 1) {
                    var188 = 0;
                }
                class96.method651((byte) 116, var188 == 1);
                return;
            }
            if (arg0 == 6028) {
                class437.field6374.field4264 = field6946[--field6949] != 0;
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6029) {
                class437.field6374.field4268 = field6946[--field6949];
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6030) {
                class437.field6374.field4251 = field6946[--field6949] != 0;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class430.method2571((byte) -46);
                return;
            }
            if (arg0 == 6031) {
                int var189 = field6946[--field6949];
                if (var189 < 0 || var189 > 3) {
                    var189 = 2;
                }
                class196.method1211(false, var189);
                return;
            }
            if (arg0 == 6032) {
                int var190 = field6946[--field6949];
                if (var190 < 0 || var190 > 3) {
                    var190 = 2;
                }
                class437.field6374.field4272 = var190;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6033) {
                int var191 = field6946[--field6949];
                if (var191 < 0 || var191 > 4) {
                    var191 = 2;
                }
                class437.field6374.field4256 = var191;
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6034) {
                class437.field6374.field4286 = field6946[--field6949] == 1;
                class437.field6374.method557(class282.field3804, (byte) -80);
                class350.method1937(2);
                class164.field2341 = false;
                return;
            }
            if (arg0 == 6035) {
                class437.field6374.field1092 = field6946[--field6949] == 1;
                class430.method2571((byte) -66);
                class83.method591((byte) -109);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6946[field6949++] = class437.field6374.field4255;
                return;
            }
            if (arg0 == 6102) {
                field6946[field6949++] = class437.field6374.method556(class278.field3761, true) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6946[field6949++] = class437.field6374.field4274 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6946[field6949++] = class437.field6374.field4279 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field6946[field6949++] = class437.field6374.field4281 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6946[field6949++] = class437.field6374.field4268;
                return;
            }
            if (arg0 == 6108) {
                field6946[field6949++] = class437.field6374.field4260 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field6946[field6949++] = class437.field6374.field4283 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6946[field6949++] = class437.field6374.field4284 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6946[field6949++] = class437.field6374.method1765(class278.field3761, (byte) -101);
                return;
            }
            if (arg0 == 6112) {
                field6946[field6949++] = class437.field6374.method1763(class278.field3761, (byte) 71) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6946[field6949++] = class437.field6374.field4287 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6946[field6949++] = class437.field6374.field4250 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6946[field6949++] = class437.field6374.field4280;
                return;
            }
            if (arg0 == 6117) {
                field6946[field6949++] = class437.field6374.field4266 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6946[field6949++] = class437.field6374.field4262;
                return;
            }
            if (arg0 == 6119) {
                field6946[field6949++] = class437.field6374.field4252;
                return;
            }
            if (arg0 == 6120) {
                field6946[field6949++] = class437.field6374.field4273;
                return;
            }
            if (arg0 == 6121) {
                field6946[field6949++] = class418.field6109.method515() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field6946[field6949++] = class20.method146(true);
                return;
            }
            if (arg0 == 6124) {
                field6946[field6949++] = class437.field6374.field4254;
                return;
            }
            if (arg0 == 6125) {
                field6946[field6949++] = class437.field6374.field4275;
                return;
            }
            if (arg0 == 6126) {
                field6946[field6949++] = class418.field6109.method471() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field6946[field6949++] = class437.field6374.field4278 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6946[field6949++] = class437.field6374.field4264 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6946[field6949++] = class437.field6374.field4268;
                return;
            }
            if (arg0 == 6130) {
                field6946[field6949++] = class437.field6374.field4251 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6946[field6949++] = class278.field3761;
                return;
            }
            if (arg0 == 6132) {
                field6946[field6949++] = class437.field6374.field4272;
                return;
            }
            if (arg0 == 6133) {
                field6946[field6949++] = class397.field5519 == 1 || class397.field5519 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field6946[field6949++] = class129.method846(class463.field6730, (byte) -115);
                return;
            }
            if (arg0 == 6135) {
                field6946[field6949++] = class437.field6374.field4256;
                return;
            }
            if (arg0 == 6136) {
                field6946[field6949++] = class437.field6374.field4286 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6949 -= 2;
                class353.field4820 = (short) field6946[field6949];
                if (class353.field4820 <= 0) {
                    class353.field4820 = 256;
                }
                class450.field6494 = (short) field6946[field6949 + 1];
                if (class450.field6494 <= 0) {
                    class450.field6494 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6949 -= 2;
                class438.field6393 = (short) field6946[field6949];
                if (class438.field6393 <= 0) {
                    class438.field6393 = 256;
                }
                class335.field4562 = (short) field6946[field6949 + 1];
                if (class335.field4562 <= 0) {
                    class335.field4562 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6949 -= 4;
                class56.field772 = (short) field6946[field6949];
                if (class56.field772 <= 0) {
                    class56.field772 = 1;
                }
                class135.field1952 = (short) field6946[field6949 + 1];
                if (class135.field1952 <= 0) {
                    class135.field1952 = 32767;
                } else if (class135.field1952 < class56.field772) {
                    class135.field1952 = class56.field772;
                }
                class244.field3405 = (short) field6946[field6949 + 2];
                if (class244.field3405 <= 0) {
                    class244.field3405 = 1;
                }
                class222.field3097 = (short) field6946[field6949 + 3];
                if (class222.field3097 <= 0) {
                    class222.field3097 = 32767;
                    return;
                }
                if (class222.field3097 < class244.field3405) {
                    class222.field3097 = class244.field3405;
                }
                return;
            }
            if (arg0 == 6203) {
                class336.method1864(2, 0, false, class515.field7561.field4022, class515.field7561.field3960, 0);
                field6946[field6949++] = class125.field1712;
                field6946[field6949++] = class476.field6964;
                return;
            }
            if (arg0 == 6204) {
                field6946[field6949++] = class438.field6393;
                field6946[field6949++] = class335.field4562;
                return;
            }
            if (arg0 == 6205) {
                field6946[field6949++] = class353.field4820;
                field6946[field6949++] = class450.field6494;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6946[field6949++] = (int) (class333.method1850(-3562) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6946[field6949++] = (int) (class333.method1850(-3562) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6949 -= 3;
                int var192 = field6946[field6949];
                int var193 = field6946[field6949 + 1];
                int var194 = field6946[field6949 + 2];
                field6930.clear();
                field6930.set(11, 12);
                field6930.set(var194, var193, var192);
                field6946[field6949++] = (int) (field6930.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field6930.clear();
                field6930.setTime(new Date(class333.method1850(-3562)));
                field6946[field6949++] = field6930.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var195 = field6946[--field6949];
                boolean var196 = true;
                if (var195 < 0) {
                    var196 = (var195 + 1) % 4 == 0;
                } else if (var195 < 1582) {
                    var196 = var195 % 4 == 0;
                } else if (var195 % 4 != 0) {
                    var196 = false;
                } else if (var195 % 100 != 0) {
                    var196 = true;
                } else if (var195 % 400 != 0) {
                    var196 = false;
                }
                field6946[field6949++] = var196 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6946[field6949++] = class177.method1085((byte) 112) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6946[field6949++] = class377.method2176(16) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class137.field1958 == 10 && class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0) {
                    field6946[field6949++] = class35.method220(2) == -1 ? 0 : 1;
                    return;
                }
                field6946[field6949++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class320 var197 = class16.method133(false);
                if (var197 != null) {
                    field6946[field6949++] = var197.field4428;
                    field6946[field6949++] = var197.field3244;
                    field6950[field6933++] = var197.field4431;
                    class65 var198 = var197.method1811((byte) 90);
                    field6946[field6949++] = var198.field886;
                    field6950[field6933++] = var198.field891;
                    field6946[field6949++] = var197.field3239;
                    field6946[field6949++] = var197.field4425;
                    return;
                }
                field6946[field6949++] = -1;
                field6946[field6949++] = 0;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class320 var199 = class300.method1716(0);
                if (var199 != null) {
                    field6946[field6949++] = var199.field4428;
                    field6946[field6949++] = var199.field3244;
                    field6950[field6933++] = var199.field4431;
                    class65 var200 = var199.method1811((byte) 95);
                    field6946[field6949++] = var200.field886;
                    field6950[field6933++] = var200.field891;
                    field6946[field6949++] = var199.field3239;
                    field6946[field6949++] = var199.field4425;
                    return;
                }
                field6946[field6949++] = -1;
                field6946[field6949++] = 0;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var201 = field6946[--field6949];
                if (class137.field1958 == 10 && class190.field2644 == 0 && class305.field4186 == 0 && class310.field4243 == 0) {
                    field6946[field6949++] = class170.method1049(16816, var201) ? 1 : 0;
                    return;
                }
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class437.field6374.field4249 = field6946[--field6949];
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6505) {
                field6946[field6949++] = class437.field6374.field4249;
                return;
            }
            if (arg0 == 6506) {
                int var202 = field6946[--field6949];
                class320 var203 = class210.method1272(var202, (byte) -26);
                if (var203 != null) {
                    field6946[field6949++] = var203.field3244;
                    field6950[field6933++] = var203.field4431;
                    class65 var204 = var203.method1811((byte) 121);
                    field6946[field6949++] = var204.field886;
                    field6950[field6933++] = var204.field891;
                    field6946[field6949++] = var203.field3239;
                    field6946[field6949++] = var203.field4425;
                    return;
                }
                field6946[field6949++] = -1;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6950[field6933++] = "";
                field6946[field6949++] = 0;
                field6946[field6949++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field6949 -= 4;
                int var205 = field6946[field6949];
                boolean var206 = field6946[field6949 + 1] == 1;
                int var207 = field6946[field6949 + 2];
                boolean var208 = field6946[field6949 + 3] == 1;
                class413.method2462(var205, var208, var207, 125, var206);
                return;
            }
            if (arg0 == 6508) {
                class154.method968(-95);
                return;
            }
            if (arg0 == 6509) {
                if (class137.field1958 != 10) {
                    return;
                }
                class479.field6994 = field6946[--field6949] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class437.field6374.field4261 = field6946[--field6949] == 1;
                class437.field6374.method557(class282.field3804, (byte) -80);
                return;
            }
            if (arg0 == 6601) {
                field6946[field6949++] = class437.field6374.field4261 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class463.field6722 == class376.field5285) {
            if (arg0 == 6700) {
                int var209 = class269.field3690.method987(18791);
                if (class319.field4419 != -1) {
                    var209++;
                }
                field6946[field6949++] = var209;
                return;
            }
            if (arg0 == 6701) {
                int var210 = field6946[--field6949];
                if (class319.field4419 != -1) {
                    if (var210 == 0) {
                        field6946[field6949++] = class319.field4419;
                        return;
                    }
                    var210--;
                }
                class14 var211 = (class14) class269.field3690.method981(0);
                while (var210-- > 0) {
                    var211 = (class14) class269.field3690.method989(0);
                }
                field6946[field6949++] = var211.field167;
                return;
            }
            if (arg0 == 6702) {
                int var212 = field6946[--field6949];
                if (class522.field7701[var212] == null) {
                    field6950[field6933++] = "";
                    return;
                }
                String var213 = class522.field7701[var212][0].field4049;
                if (var213 == null) {
                    field6950[field6933++] = "";
                    return;
                }
                field6950[field6933++] = var213.substring(0, var213.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var214 = field6946[--field6949];
                if (class522.field7701[var214] == null) {
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = class522.field7701[var214].length;
                return;
            }
            if (arg0 == 6704) {
                field6949 -= 2;
                int var215 = field6946[field6949];
                int var216 = field6946[field6949 + 1];
                if (class522.field7701[var215] == null) {
                    field6950[field6933++] = "";
                    return;
                }
                String var217 = class522.field7701[var215][var216].field4049;
                if (var217 == null) {
                    field6950[field6933++] = "";
                    return;
                }
                field6950[field6933++] = var217;
                return;
            }
            if (arg0 == 6705) {
                field6949 -= 2;
                int var218 = field6946[field6949];
                int var219 = field6946[field6949 + 1];
                if (class522.field7701[var218] == null) {
                    field6946[field6949++] = 0;
                    return;
                }
                field6946[field6949++] = class522.field7701[var218][var219].field3951;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field6949 -= 3;
                int var220 = field6946[field6949];
                int var221 = field6946[field6949 + 1];
                int var222 = field6946[field6949 + 2];
                class322.method1814(1, 7, "", var222, var220 << 16 | var221);
                return;
            }
            if (arg0 == 6708) {
                field6949 -= 3;
                int var223 = field6946[field6949];
                int var224 = field6946[field6949 + 1];
                int var225 = field6946[field6949 + 2];
                class322.method1814(2, 7, "", var225, var223 << 16 | var224);
                return;
            }
            if (arg0 == 6709) {
                field6949 -= 3;
                int var226 = field6946[field6949];
                int var227 = field6946[field6949 + 1];
                int var228 = field6946[field6949 + 2];
                class322.method1814(3, 7, "", var228, var226 << 16 | var227);
                return;
            }
            if (arg0 == 6710) {
                field6949 -= 3;
                int var229 = field6946[field6949];
                int var230 = field6946[field6949 + 1];
                int var231 = field6946[field6949 + 2];
                class322.method1814(4, 7, "", var231, var229 << 16 | var230);
                return;
            }
            if (arg0 == 6711) {
                field6949 -= 3;
                int var232 = field6946[field6949];
                int var233 = field6946[field6949 + 1];
                int var234 = field6946[field6949 + 2];
                class322.method1814(5, 7, "", var234, var232 << 16 | var233);
                return;
            }
            if (arg0 == 6712) {
                field6949 -= 3;
                int var235 = field6946[field6949];
                int var236 = field6946[field6949 + 1];
                int var237 = field6946[field6949 + 2];
                class322.method1814(6, 7, "", var237, var235 << 16 | var236);
                return;
            }
            if (arg0 == 6713) {
                field6949 -= 3;
                int var238 = field6946[field6949];
                int var239 = field6946[field6949 + 1];
                int var240 = field6946[field6949 + 2];
                class322.method1814(7, 7, "", var240, var238 << 16 | var239);
                return;
            }
            if (arg0 == 6714) {
                field6949 -= 3;
                int var241 = field6946[field6949];
                int var242 = field6946[field6949 + 1];
                int var243 = field6946[field6949 + 2];
                class322.method1814(8, 7, "", var243, var241 << 16 | var242);
                return;
            }
            if (arg0 == 6715) {
                field6949 -= 3;
                int var244 = field6946[field6949];
                int var245 = field6946[field6949 + 1];
                int var246 = field6946[field6949 + 2];
                class322.method1814(9, 7, "", var246, var244 << 16 | var245);
                return;
            }
            if (arg0 == 6716) {
                field6949 -= 3;
                int var247 = field6946[field6949];
                int var248 = field6946[field6949 + 1];
                int var249 = field6946[field6949 + 2];
                class322.method1814(10, 7, "", var249, var247 << 16 | var248);
                return;
            }
            if (arg0 == 6717) {
                field6949 -= 3;
                int var250 = field6946[field6949];
                int var251 = field6946[field6949 + 1];
                int var252 = field6946[field6949 + 2];
                class295 var253 = class12.method106(var250 << 16 | var251, (byte) 99, var252);
                class370.method2145(-1);
                class197 var254 = client.method1191(var253);
                class437.method2610(var254.method1222(24805), 19, var253, var254.field2835);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var255 = field6946[--field6949];
                class191 var256 = class436.field6349.method850((byte) 78, var255);
                if (var256.field2662 == null) {
                    field6950[field6933++] = "";
                    return;
                }
                field6950[field6933++] = var256.field2662;
                return;
            }
            if (arg0 == 6801) {
                int var257 = field6946[--field6949];
                class191 var258 = class436.field6349.method850((byte) 78, var257);
                field6946[field6949++] = var258.field2669;
                return;
            }
            if (arg0 == 6802) {
                int var259 = field6946[--field6949];
                class191 var260 = class436.field6349.method850((byte) 78, var259);
                field6946[field6949++] = var260.field2670;
                return;
            }
            if (arg0 == 6803) {
                int var261 = field6946[--field6949];
                class191 var262 = class436.field6349.method850((byte) 78, var261);
                field6946[field6949++] = var262.field2682;
                return;
            }
            if (arg0 == 6804) {
                field6949 -= 2;
                int var263 = field6946[field6949];
                int var264 = field6946[field6949 + 1];
                class89 var265 = class284.field3819.method1088(var264, (byte) -120);
                if (var265.method615(115)) {
                    field6950[field6933++] = class436.field6349.method850((byte) 78, var263).method1152(var265.field1217, true, var264);
                    return;
                }
                field6946[field6949++] = class436.field6349.method850((byte) 78, var263).method1148(1, var265.field1220, var264);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ldl;)V")
    public static final void method2798(class44 arg0) {
        method2793(arg0, 200000);
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Ljava/lang/String;")
    private static final String method2799(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6930.setTime(new Date(var1));
        int var3 = field6930.get(5);
        int var4 = field6930.get(2);
        int var5 = field6930.get(1);
        return var3 + "-" + field6952[var4] + "-" + var5;
    }
}
