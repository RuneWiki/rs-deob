import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class317 {

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "[[I")
    private static int[][] field4611 = new int[5][5000];

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "[I")
    private static int[] field4616 = new int[5];

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "[I")
    private static int[] field4619 = new int[1000];

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field4625 = new String[1000];

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
    private static int field4618 = 0;

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    private static int field4628 = 0;

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
    private static int field4626 = 0;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Ltda;")
    private static class582[] field4609 = new class582[50];

    @OriginalMember(owner = "client!eaa", name = "p", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4621 = Calendar.getInstance();

    @OriginalMember(owner = "client!eaa", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field4632 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!eaa", name = "B", descriptor = "[I")
    private static int[] field4633 = new int[3];

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "Lvi;")
    public static class560 field4631 = new class560(4);

    @OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
    private static int field4634 = 0;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "Lfca;")
    private static class188 field4608;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lfca;")
    private static class188 field4610;

    @OriginalMember(owner = "client!eaa", name = "q", descriptor = "Llw;")
    private static class672 field4622;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "[I")
    private static int[] field4607;

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field4630;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2041(int arg0) {
        if (arg0 == -1 || !class42.method251(arg0, 0)) {
            return;
        }
        class188[] var1 = class328.field4799[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class188 var3 = var1[var2];
            if (var3.field2328 != null) {
                class425 var4 = new class425();
                var4.field5911 = var3;
                var4.field5913 = var3.field2328;
                method2048(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "()V", line = 35)
    public static void method2042() {
        field4607 = null;
        field4630 = null;
        field4616 = null;
        field4611 = null;
        field4619 = null;
        field4625 = null;
        field4609 = null;
        field4610 = null;
        field4608 = null;
        field4622 = null;
        field4621 = null;
        field4632 = null;
        field4633 = null;
        field4631 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lej;II)V", line = 53)
    public static final void method2043(class229 arg0, int arg1, int arg2) {
        class175 var3 = class258.method1623(arg1, arg0, arg2, -1861);
        if (var3 == null) {
            return;
        }
        field4607 = new int[var3.field2205];
        field4630 = new String[var3.field2208];
        if (class275.field3733 == var3.field2207 || class275.field3719 == var3.field2207 || class527.field7279 == var3.field2207) {
            int var4 = 0;
            int var5 = 0;
            if (class29.field285 != null) {
                var4 = class29.field285.field2305;
                var5 = class29.field285.field2428;
            }
            field4607[0] = class592.field8107.method268((byte) -96) - var4;
            field4607[1] = class592.field8107.method269((byte) -25) - var5;
        }
        method2045(var3, 200000);
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V", line = 81)
    public static final void method2044(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Luw;I)V", line = 90)
    private static final void method2045(class175 arg0, int arg1) {
        field4628 = 0;
        field4626 = 0;
        int var2 = -1;
        int[] var3 = arg0.field2196;
        int[] var4 = arg0.field2198;
        byte var5 = -1;
        field4618 = 0;
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
                        method2047(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2053(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4619[field4628++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4619[field4628++] = class327.field4771.field4959[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class327.field4771.method2152(field4619[--field4628], var8, 113);
                } else if (var43 == 3) {
                    field4625[field4626++] = arg0.field2200[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4628 -= 2;
                    if (field4619[field4628 + 1] != field4619[field4628]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4628 -= 2;
                    if (field4619[field4628 + 1] == field4619[field4628]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4628 -= 2;
                    if (field4619[field4628] < field4619[field4628 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4628 -= 2;
                    if (field4619[field4628] > field4619[field4628 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4618 == 0) {
                        return;
                    }
                    class582 var9 = field4609[--field4618];
                    arg0 = var9.field8020;
                    var3 = arg0.field2196;
                    var4 = arg0.field2198;
                    var2 = var9.field8019;
                    field4607 = var9.field8021;
                    field4630 = var9.field8024;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4619[field4628++] = class327.field4771.method1324(var10, -86);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class327.field4771.method2153(10587, var11, field4619[--field4628]);
                } else if (var43 == 31) {
                    field4628 -= 2;
                    if (field4619[field4628] <= field4619[field4628 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4628 -= 2;
                    if (field4619[field4628] >= field4619[field4628 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4619[field4628++] = field4607[var4[var2]];
                } else if (var43 == 34) {
                    field4607[var4[var2]] = field4619[--field4628];
                } else if (var43 == 35) {
                    field4625[field4626++] = field4630[var4[var2]];
                } else if (var43 == 36) {
                    field4630[var4[var2]] = field4625[--field4626];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4626 -= var12;
                    String var13 = class258.method1620(0, var12, field4626, field4625);
                    field4625[field4626++] = var13;
                } else if (var43 == 38) {
                    field4628--;
                } else if (var43 == 39) {
                    field4626--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class175 var15 = class274.method1672(-121, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field2205];
                    String[] var17 = new String[var15.field2208];
                    for (int var18 = 0; var18 < var15.field2206; var18++) {
                        var16[var18] = field4619[field4628 + var18 - var15.field2206];
                    }
                    for (int var19 = 0; var19 < var15.field2201; var19++) {
                        var17[var19] = field4625[field4626 + var19 - var15.field2201];
                    }
                    field4628 -= var15.field2206;
                    field4626 -= var15.field2201;
                    class582 var20 = new class582();
                    var20.field8020 = arg0;
                    var20.field8019 = var2;
                    var20.field8021 = field4607;
                    var20.field8024 = field4630;
                    if (field4618 >= field4609.length) {
                        throw new RuntimeException();
                    }
                    field4609[field4618++] = var20;
                    arg0 = var15;
                    var3 = var15.field2196;
                    var4 = var15.field2198;
                    var2 = -1;
                    field4607 = var16;
                    field4630 = var17;
                } else if (var43 == 42) {
                    field4619[field4628++] = class85.field1042[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class85.field1042[var21] = field4619[--field4628];
                    class447.method2562(var21, 1);
                    class674.field9548 |= class521.field7223[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4619[--field4628];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4616[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4611[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4619[--field4628];
                    if (var28 < 0 || var28 >= field4616[var27]) {
                        throw new RuntimeException();
                    }
                    field4619[field4628++] = field4611[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4628 -= 2;
                    int var30 = field4619[field4628];
                    if (var30 < 0 || var30 >= field4616[var29]) {
                        throw new RuntimeException();
                    }
                    field4611[var29][var30] = field4619[field4628 + 1];
                } else if (var43 == 47) {
                    String var31 = class24.field229[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4625[field4626++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class24.field229[var32] = field4625[--field4626];
                    class95.method528(85, var32);
                } else if (var43 == 51) {
                    class436 var33 = arg0.field2209[var4[var2]];
                    class360 var34 = (class360) var33.method2506(24, (long) field4619[--field4628]);
                    if (var34 != null) {
                        var2 += var34.field5197;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field2197 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field272).append(" ");
                for (int var41 = field4618 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4609[var41].field8020.field272).append(" ");
                }
                var40.append("op: ").append(var5);
                class282.method1694(var40.toString(), (byte) 47, var42);
            } else {
                class365.method2239(4, 19074, "Clientscript error in: " + arg0.field2197);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field2197).append("\n");
                for (int var38 = field4618 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4609[var38].field8020.field2197).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class282.method1694(var37.toString(), (byte) 47, var42);
                class451.method2571(var37.toString(), 92);
            }
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 520)
    private static final void method2046(String arg0, int arg1) {
        if (class485.field6560 == 0 && !(!class276.field3741 || class205.field2682) || class283.field3832) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class243.field3258.method1491(0, (byte) 125))) {
            var3 = 0;
            arg0 = arg0.substring(class243.field3258.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3259.method1491(0, (byte) 126))) {
            var3 = 1;
            arg0 = arg0.substring(class243.field3259.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3260.method1491(0, (byte) 126))) {
            var3 = 2;
            arg0 = arg0.substring(class243.field3260.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3261.method1491(0, (byte) 125))) {
            var3 = 3;
            arg0 = arg0.substring(class243.field3261.method1491(0, (byte) 127).length());
        } else if (var2.startsWith(class243.field3262.method1491(0, (byte) 126))) {
            var3 = 4;
            arg0 = arg0.substring(class243.field3262.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3263.method1491(0, (byte) 126))) {
            var3 = 5;
            arg0 = arg0.substring(class243.field3263.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3264.method1491(0, (byte) 125))) {
            var3 = 6;
            arg0 = arg0.substring(class243.field3264.method1491(0, (byte) 127).length());
        } else if (var2.startsWith(class243.field3265.method1491(0, (byte) 127))) {
            var3 = 7;
            arg0 = arg0.substring(class243.field3265.method1491(0, (byte) 126).length());
        } else if (var2.startsWith(class243.field3266.method1491(0, (byte) 125))) {
            var3 = 8;
            arg0 = arg0.substring(class243.field3266.method1491(0, (byte) 125).length());
        } else if (var2.startsWith(class243.field3267.method1491(0, (byte) 127))) {
            var3 = 9;
            arg0 = arg0.substring(class243.field3267.method1491(0, (byte) 126).length());
        } else if (var2.startsWith(class243.field3268.method1491(0, (byte) 126))) {
            var3 = 10;
            arg0 = arg0.substring(class243.field3268.method1491(0, (byte) 126).length());
        } else if (var2.startsWith(class243.field3269.method1491(0, (byte) 125))) {
            var3 = 11;
            arg0 = arg0.substring(class243.field3269.method1491(0, (byte) 126).length());
        } else if (class350.field5121 != 0) {
            if (var2.startsWith(class243.field3258.method1491(class350.field5121, (byte) 125))) {
                var3 = 0;
                arg0 = arg0.substring(class243.field3258.method1491(class350.field5121, (byte) 125).length());
            } else if (var2.startsWith(class243.field3259.method1491(class350.field5121, (byte) 125))) {
                var3 = 1;
                arg0 = arg0.substring(class243.field3259.method1491(class350.field5121, (byte) 125).length());
            } else if (var2.startsWith(class243.field3260.method1491(class350.field5121, (byte) 127))) {
                var3 = 2;
                arg0 = arg0.substring(class243.field3260.method1491(class350.field5121, (byte) 126).length());
            } else if (var2.startsWith(class243.field3261.method1491(class350.field5121, (byte) 127))) {
                var3 = 3;
                arg0 = arg0.substring(class243.field3261.method1491(class350.field5121, (byte) 125).length());
            } else if (var2.startsWith(class243.field3262.method1491(class350.field5121, (byte) 125))) {
                var3 = 4;
                arg0 = arg0.substring(class243.field3262.method1491(class350.field5121, (byte) 126).length());
            } else if (var2.startsWith(class243.field3263.method1491(class350.field5121, (byte) 126))) {
                var3 = 5;
                arg0 = arg0.substring(class243.field3263.method1491(class350.field5121, (byte) 125).length());
            } else if (var2.startsWith(class243.field3264.method1491(class350.field5121, (byte) 127))) {
                var3 = 6;
                arg0 = arg0.substring(class243.field3264.method1491(class350.field5121, (byte) 125).length());
            } else if (var2.startsWith(class243.field3265.method1491(class350.field5121, (byte) 127))) {
                var3 = 7;
                arg0 = arg0.substring(class243.field3265.method1491(class350.field5121, (byte) 127).length());
            } else if (var2.startsWith(class243.field3266.method1491(class350.field5121, (byte) 127))) {
                var3 = 8;
                arg0 = arg0.substring(class243.field3266.method1491(class350.field5121, (byte) 126).length());
            } else if (var2.startsWith(class243.field3267.method1491(class350.field5121, (byte) 126))) {
                var3 = 9;
                arg0 = arg0.substring(class243.field3267.method1491(class350.field5121, (byte) 127).length());
            } else if (var2.startsWith(class243.field3268.method1491(class350.field5121, (byte) 125))) {
                var3 = 10;
                arg0 = arg0.substring(class243.field3268.method1491(class350.field5121, (byte) 127).length());
            } else if (var2.startsWith(class243.field3269.method1491(class350.field5121, (byte) 126))) {
                var3 = 11;
                arg0 = arg0.substring(class243.field3269.method1491(class350.field5121, (byte) 127).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class243.field3270.method1491(0, (byte) 126))) {
            var5 = 1;
            arg0 = arg0.substring(class243.field3270.method1491(0, (byte) 127).length());
        } else if (var4.startsWith(class243.field3271.method1491(0, (byte) 126))) {
            var5 = 2;
            arg0 = arg0.substring(class243.field3271.method1491(0, (byte) 127).length());
        } else if (var4.startsWith(class243.field3272.method1491(0, (byte) 125))) {
            var5 = 3;
            arg0 = arg0.substring(class243.field3272.method1491(0, (byte) 127).length());
        } else if (var4.startsWith(class243.field3273.method1491(0, (byte) 125))) {
            var5 = 4;
            arg0 = arg0.substring(class243.field3273.method1491(0, (byte) 125).length());
        } else if (var4.startsWith(class243.field3274.method1491(0, (byte) 127))) {
            var5 = 5;
            arg0 = arg0.substring(class243.field3274.method1491(0, (byte) 127).length());
        } else if (class350.field5121 != 0) {
            if (var4.startsWith(class243.field3270.method1491(class350.field5121, (byte) 125))) {
                var5 = 1;
                arg0 = arg0.substring(class243.field3270.method1491(class350.field5121, (byte) 125).length());
            } else if (var4.startsWith(class243.field3271.method1491(class350.field5121, (byte) 126))) {
                var5 = 2;
                arg0 = arg0.substring(class243.field3271.method1491(class350.field5121, (byte) 126).length());
            } else if (var4.startsWith(class243.field3272.method1491(class350.field5121, (byte) 126))) {
                var5 = 3;
                arg0 = arg0.substring(class243.field3272.method1491(class350.field5121, (byte) 126).length());
            } else if (var4.startsWith(class243.field3273.method1491(class350.field5121, (byte) 125))) {
                var5 = 4;
                arg0 = arg0.substring(class243.field3273.method1491(class350.field5121, (byte) 125).length());
            } else if (var4.startsWith(class243.field3274.method1491(class350.field5121, (byte) 127))) {
                var5 = 5;
                arg0 = arg0.substring(class243.field3274.method1491(class350.field5121, (byte) 126).length());
            }
        }
        field4613++;
        class389.method2326((byte) 118, class142.field1806);
        class253.field3491.method951((byte) -82, 0);
        int var6 = class253.field3491.field1745;
        class253.field3491.method951((byte) -82, var3);
        class253.field3491.method951((byte) -82, var5);
        class66.method395(class253.field3491, arg0, true);
        class253.field3491.method901(-12951, class253.field3491.field1745 - var6);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IZ)V", line = 788)
    private static final void method2047(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4628 -= 3;
                int var2 = field4619[field4628];
                int var3 = field4619[field4628 + 1];
                int var4 = field4619[field4628 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class188 var5 = class557.method3117(var2, (byte) 71);
                if (var5.field2352 == null) {
                    var5.field2352 = new class188[var4 + 1];
                }
                if (var5.field2352.length <= var4) {
                    class188[] var6 = new class188[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2352.length; var7++) {
                        var6[var7] = var5.field2352[var7];
                    }
                    var5.field2352 = var6;
                }
                if (var4 > 0 && var5.field2352[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class188 var8 = new class188();
                var8.field2304 = var3;
                var8.field2414 = var8.field2387 = var5.field2387;
                var8.field2361 = var4;
                var5.field2352[var4] = var8;
                if (arg1) {
                    field4608 = var8;
                } else {
                    field4610 = var8;
                }
                class553.method3100(var5, 0);
                return;
            }
            if (arg0 == 101) {
                class188 var9 = arg1 ? field4608 : field4610;
                if (var9.field2361 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class188 var10 = class557.method3117(var9.field2387, (byte) 71);
                var10.field2352[var9.field2361] = null;
                class553.method3100(var10, 0);
                return;
            }
            if (arg0 == 102) {
                class188 var11 = class557.method3117(field4619[--field4628], (byte) 71);
                var11.field2352 = null;
                class553.method3100(var11, 0);
                return;
            }
            if (arg0 == 200) {
                field4628 -= 2;
                int var12 = field4619[field4628];
                int var13 = field4619[field4628 + 1];
                class188 var14 = class630.method3443(var12, -1, var13);
                if (var14 != null && var13 != -1) {
                    field4619[field4628++] = 1;
                    if (arg1) {
                        field4608 = var14;
                        return;
                    }
                    field4610 = var14;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4619[--field4628];
                class188 var16 = class557.method3117(var15, (byte) 71);
                if (var16 != null) {
                    field4619[field4628++] = 1;
                    if (arg1) {
                        field4608 = var16;
                        return;
                    }
                    field4610 = var16;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4619[--field4628];
                method2054(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4619[--field4628];
                method2049(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4628 -= 2;
                int var19 = field4619[field4628];
                int var20 = field4619[field4628 + 1];
                for (int var21 = 0; var21 < class248.field3342.length; var21++) {
                    if (class248.field3342[var21] == var19) {
                        class596.field8164.field7193.method2192(98, var20, var21, class34.field336);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class589.field8085.length; var22++) {
                    if (class589.field8085[var22] == var19) {
                        class596.field8164.field7193.method2192(116, var20, var22, class34.field336);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4628 -= 2;
                int var23 = field4619[field4628];
                int var24 = field4619[field4628 + 1];
                class596.field8164.field7193.method2195((byte) 96, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4619[--field4628] != 0;
                class596.field8164.field7193.method2199((byte) 88, var25);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class188 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class557.method3117(field4619[--field4628], (byte) 71);
            } else {
                var26 = arg1 ? field4608 : field4610;
            }
            if (arg0 == 1000) {
                field4628 -= 4;
                var26.field2404 = field4619[field4628];
                var26.field2299 = field4619[field4628 + 1];
                int var27 = field4619[field4628 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4619[field4628 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2373 = (byte) var27;
                var26.field2418 = (byte) var28;
                class553.method3100(var26, 0);
                class255.method1598(var26, (byte) -126);
                if (var26.field2361 == -1) {
                    class68.method405(11, var26.field2387);
                }
                return;
            }
            if (arg0 == 1001) {
                field4628 -= 4;
                var26.field2323 = field4619[field4628];
                var26.field2455 = field4619[field4628 + 1];
                var26.field2401 = 0;
                var26.field2350 = 0;
                int var29 = field4619[field4628 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4619[field4628 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2374 = (byte) var29;
                var26.field2411 = (byte) var30;
                class553.method3100(var26, 0);
                class255.method1598(var26, (byte) 62);
                if (var26.field2304 == 0) {
                    class59.method370(87, false, var26);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4619[--field4628] == 1;
                if (var26.field2351 != var31) {
                    var26.field2351 = var31;
                    class553.method3100(var26, 0);
                }
                if (var26.field2361 == -1) {
                    class133.method868(-22839, var26.field2387);
                }
                return;
            }
            if (arg0 == 1004) {
                field4628 -= 2;
                var26.field2347 = field4619[field4628];
                var26.field2336 = field4619[field4628 + 1];
                class553.method3100(var26, 0);
                class255.method1598(var26, (byte) 108);
                if (var26.field2304 == 0) {
                    class59.method370(91, false, var26);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2382 = field4619[--field4628] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class188 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class557.method3117(field4619[--field4628], (byte) 71);
            } else {
                var32 = arg1 ? field4608 : field4610;
            }
            if (arg0 == 1100) {
                field4628 -= 2;
                var32.field2315 = field4619[field4628];
                if (var32.field2315 > var32.field2379 - var32.field2438) {
                    var32.field2315 = var32.field2379 - var32.field2438;
                }
                if (var32.field2315 < 0) {
                    var32.field2315 = 0;
                }
                var32.field2431 = field4619[field4628 + 1];
                if (var32.field2431 > var32.field2406 - var32.field2371) {
                    var32.field2431 = var32.field2406 - var32.field2371;
                }
                if (var32.field2431 < 0) {
                    var32.field2431 = 0;
                }
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class589.method3289((byte) -101, var32.field2387);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2464 = field4619[--field4628];
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class237.method1463(var32.field2387, -125);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field2375 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1103) {
                var32.field2396 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1104) {
                var32.field2456 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4619[--field4628];
                if (var32.field2447 != var33) {
                    var32.field2447 = var33;
                    class553.method3100(var32, 0);
                }
                if (var32.field2361 == -1) {
                    class204.method1280(118, var32.field2387);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field2357 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1107) {
                var32.field2461 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1108) {
                var32.field2301 = 1;
                var32.field2302 = field4619[--field4628];
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class556.method3116(80, var32.field2387);
                }
                return;
            }
            if (arg0 == 1109) {
                field4628 -= 6;
                var32.field2309 = field4619[field4628];
                var32.field2429 = field4619[field4628 + 1];
                var32.field2408 = field4619[field4628 + 2];
                var32.field2329 = field4619[field4628 + 3];
                var32.field2463 = field4619[field4628 + 4];
                var32.field2389 = field4619[field4628 + 5];
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class356.method2210(2, var32.field2387);
                    class195.method1240(10, var32.field2387);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4619[--field4628];
                if (var32.field2386 != var34) {
                    var32.field2386 = var34;
                    var32.field2368 = 0;
                    var32.field2343 = 1;
                    var32.field2316 = 0;
                    class553.method3100(var32, 0);
                }
                if (var32.field2361 == -1) {
                    class4.method27(var32.field2387, 55);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2370 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4625[--field4626];
                if (!var35.equals(var32.field2399)) {
                    var32.field2399 = var35;
                    class553.method3100(var32, 0);
                }
                if (var32.field2361 == -1) {
                    class628.method3427(var32.field2387, false);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field2454 = field4619[--field4628];
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class201.method1271(var32.field2387, 16);
                }
                return;
            }
            if (arg0 == 1114) {
                field4628 -= 3;
                var32.field2355 = field4619[field4628];
                var32.field2349 = field4619[field4628 + 1];
                var32.field2338 = field4619[field4628 + 2];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1115) {
                var32.field2353 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1116) {
                var32.field2383 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1117) {
                var32.field2362 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1118) {
                var32.field2420 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1119) {
                var32.field2380 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1120) {
                field4628 -= 2;
                var32.field2379 = field4619[field4628];
                var32.field2406 = field4619[field4628 + 1];
                class553.method3100(var32, 0);
                if (var32.field2304 == 0) {
                    class59.method370(56, false, var32);
                }
                return;
            }
            if (arg0 == 1121) {
                field4628 -= 2;
                var32.field2421 = (short) field4619[field4628];
                var32.field2334 = (short) field4619[field4628 + 1];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1122) {
                var32.field2319 = field4619[--field4628] == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1123) {
                var32.field2389 = field4619[--field4628];
                class553.method3100(var32, 0);
                if (var32.field2361 == -1) {
                    class356.method2210(2, var32.field2387);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4619[--field4628];
                var32.field2453 = var36 == 1;
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1125) {
                field4628 -= 2;
                var32.field2330 = field4619[field4628];
                var32.field2462 = field4619[field4628 + 1];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1126) {
                var32.field2318 = field4619[--field4628];
                class553.method3100(var32, 0);
                return;
            }
            if (arg0 == 1127) {
                field4628 -= 2;
                int var37 = field4619[field4628];
                int var38 = field4619[field4628 + 1];
                class579 var39 = class191.field2486.method1256(var37, -3934);
                if (var39.field7999 != var38) {
                    var32.method1211(var38, var37, true);
                    return;
                }
                var32.method1200(var37, (byte) -122);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field4619[--field4628];
                String var41 = field4625[--field4626];
                class579 var42 = class191.field2486.method1256(var40, -3934);
                if (!var42.field7997.equals(var41)) {
                    var32.method1214(-106, var40, var41);
                    return;
                }
                var32.method1200(var40, (byte) -62);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class188 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class557.method3117(field4619[--field4628], (byte) 71);
            } else {
                var43 = arg1 ? field4608 : field4610;
            }
            class553.method3100(var43, 0);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4628 -= 2;
                int var44 = field4619[field4628];
                int var45 = field4619[field4628 + 1];
                if (var43.field2361 == -1) {
                    class521.method2979(var43.field2387, 9);
                    class356.method2210(2, var43.field2387);
                    class195.method1240(10, var43.field2387);
                }
                if (var44 == -1) {
                    var43.field2301 = 1;
                    var43.field2302 = -1;
                    var43.field2324 = -1;
                    return;
                }
                var43.field2324 = var44;
                var43.field2424 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field2298 = true;
                } else {
                    var43.field2298 = false;
                }
                class660 var46 = class237.field3088.method1349(-1, var44);
                var43.field2408 = var46.field9319;
                var43.field2329 = var46.field9352;
                var43.field2463 = var46.field9369;
                var43.field2309 = var46.field9300;
                var43.field2429 = var46.field9366;
                var43.field2389 = var46.field9311;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field2430 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field2430 = 1;
                } else {
                    var43.field2430 = 2;
                }
                if (var43.field2401 > 0) {
                    var43.field2389 = var43.field2389 * 32 / var43.field2401;
                    return;
                }
                if (var43.field2323 > 0) {
                    var43.field2389 = var43.field2389 * 32 / var43.field2323;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field2301 = 2;
                var43.field2302 = field4619[--field4628];
                if (var43.field2361 == -1) {
                    class556.method3116(48, var43.field2387);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field2301 = 3;
                var43.field2302 = -1;
                if (var43.field2361 == -1) {
                    class556.method3116(46, var43.field2387);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field2301 = 6;
                var43.field2302 = field4619[--field4628];
                if (var43.field2361 == -1) {
                    class556.method3116(65, var43.field2387);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field2301 = 5;
                var43.field2302 = field4619[--field4628];
                if (var43.field2361 == -1) {
                    class556.method3116(25, var43.field2387);
                }
                return;
            }
            if (arg0 == 1206) {
                field4628 -= 4;
                var43.field2310 = field4619[field4628];
                var43.field2392 = field4619[field4628 + 1];
                var43.field2313 = field4619[field4628 + 2];
                var43.field2427 = field4619[field4628 + 3];
                class553.method3100(var43, 0);
                return;
            }
            if (arg0 == 1207) {
                field4628 -= 2;
                var43.field2391 = field4619[field4628];
                var43.field2359 = field4619[field4628 + 1];
                class553.method3100(var43, 0);
                return;
            }
            if (arg0 == 1210) {
                field4628 -= 4;
                var43.field2302 = field4619[field4628];
                var43.field2317 = field4619[field4628 + 1];
                if (field4619[field4628 + 2] == 1) {
                    var43.field2301 = 9;
                } else {
                    var43.field2301 = 8;
                }
                if (field4619[field4628 + 3] == 1) {
                    var43.field2298 = true;
                } else {
                    var43.field2298 = false;
                }
                if (var43.field2361 == -1) {
                    class556.method3116(28, var43.field2387);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field2301 = 5;
                var43.field2302 = class224.field2907;
                var43.field2317 = 0;
                if (var43.field2361 == -1) {
                    class556.method3116(118, var43.field2387);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class188 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class557.method3117(field4619[--field4628], (byte) 71);
            } else {
                var47 = arg1 ? field4608 : field4610;
            }
            if (arg0 == 1300) {
                int var48 = field4619[--field4628] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method1212((byte) -117, var48, field4625[--field4626]);
                    return;
                }
                field4626--;
                return;
            }
            if (arg0 == 1301) {
                field4628 -= 2;
                int var49 = field4619[field4628];
                int var50 = field4619[field4628 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field2346 = null;
                    return;
                }
                var47.field2346 = class630.method3443(var49, -1, var50);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field4619[--field4628];
                if (class241.field3155 != var51 && class208.field2733 != var51 && class80.field1017 != var51) {
                    return;
                }
                var47.field2402 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field2358 = field4619[--field4628];
                return;
            }
            if (arg0 == 1304) {
                var47.field2311 = field4619[--field4628];
                return;
            }
            if (arg0 == 1305) {
                var47.field2307 = field4625[--field4626];
                return;
            }
            if (arg0 == 1306) {
                var47.field2417 = field4625[--field4626];
                return;
            }
            if (arg0 == 1307) {
                var47.field2446 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field2394 = field4619[--field4628];
                var47.field2434 = field4619[--field4628];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field4619[--field4628];
                int var53 = field4619[--field4628];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method1209(var53 - 1, var52, 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field2367 = field4625[--field4626];
                return;
            }
            if (arg0 == 1311) {
                var47.field2335 = field4619[--field4628];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field4628 -= 3;
                    var54 = field4619[field4628] - 1;
                    var55 = field4619[field4628 + 1];
                    var56 = field4619[field4628 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field4628 -= 2;
                    var54 = 10;
                    var55 = field4619[field4628];
                    var56 = field4619[field4628 + 1];
                }
                if (var47.field2419 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field2419 = new byte[11];
                    var47.field2378 = new byte[11];
                    var47.field2325 = new int[11];
                }
                var47.field2419[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field2426 = false;
                    for (int var57 = 0; var57 < var47.field2419.length; var57++) {
                        if (var47.field2419[var57] != 0) {
                            var47.field2426 = true;
                            break;
                        }
                    }
                } else {
                    var47.field2426 = true;
                }
                var47.field2378[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field2398 = field4619[--field4628];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class188 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class557.method3117(field4619[--field4628], (byte) 71);
            } else {
                var58 = arg1 ? field4608 : field4610;
            }
            if (arg0 == 1499) {
                var58.method1202(true);
                return;
            }
            String var59 = field4625[--field4626];
            int[] var60 = null;
            if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                int var61 = field4619[--field4628];
                if (var61 > 0) {
                    var60 = new int[var61];
                    while (var61-- > 0) {
                        var60[var61] = field4619[--field4628];
                    }
                }
                var59 = var59.substring(0, var59.length() - 1);
            }
            Object[] var62 = new Object[var59.length() + 1];
            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                if (var59.charAt(var63 - 1) == 's') {
                    var62[var63] = field4625[--field4626];
                } else {
                    var62[var63] = Integer.valueOf(field4619[--field4628]);
                }
            }
            int var64 = field4619[--field4628];
            if (var64 == -1) {
                var62 = null;
            } else {
                var62[0] = Integer.valueOf(var64);
            }
            if (arg0 == 1400) {
                var58.field2303 = var62;
            } else if (arg0 == 1401) {
                var58.field2388 = var62;
            } else if (arg0 == 1402) {
                var58.field2435 = var62;
            } else if (arg0 == 1403) {
                var58.field2384 = var62;
            } else if (arg0 == 1404) {
                var58.field2397 = var62;
            } else if (arg0 == 1405) {
                var58.field2444 = var62;
            } else if (arg0 == 1406) {
                var58.field2459 = var62;
            } else if (arg0 == 1407) {
                var58.field2354 = var62;
                var58.field2448 = var60;
            } else if (arg0 == 1408) {
                var58.field2395 = var62;
            } else if (arg0 == 1409) {
                var58.field2410 = var62;
            } else if (arg0 == 1410) {
                var58.field2331 = var62;
            } else if (arg0 == 1411) {
                var58.field2377 = var62;
            } else if (arg0 == 1412) {
                var58.field2450 = var62;
            } else if (arg0 == 1414) {
                var58.field2451 = var62;
                var58.field2337 = var60;
            } else if (arg0 == 1415) {
                var58.field2460 = var62;
                var58.field2369 = var60;
            } else if (arg0 == 1416) {
                var58.field2441 = var62;
            } else if (arg0 == 1417) {
                var58.field2405 = var62;
            } else if (arg0 == 1418) {
                var58.field2321 = var62;
            } else if (arg0 == 1419) {
                var58.field2425 = var62;
            } else if (arg0 == 1420) {
                var58.field2465 = var62;
            } else if (arg0 == 1421) {
                var58.field2320 = var62;
            } else if (arg0 == 1422) {
                var58.field2342 = var62;
            } else if (arg0 == 1423) {
                var58.field2333 = var62;
            } else if (arg0 == 1424) {
                var58.field2364 = var62;
            } else if (arg0 == 1425) {
                var58.field2466 = var62;
            } else if (arg0 == 1426) {
                var58.field2416 = var62;
            } else if (arg0 == 1427) {
                var58.field2403 = var62;
            } else if (arg0 == 1428) {
                var58.field2341 = var62;
                var58.field2442 = var60;
            } else if (arg0 == 1429) {
                var58.field2339 = var62;
                var58.field2407 = var60;
            } else if (arg0 == 1430) {
                var58.field2312 = var62;
            }
            var58.field2440 = true;
            return;
        } else if (arg0 < 1600) {
            class188 var65 = arg1 ? field4608 : field4610;
            if (arg0 == 1500) {
                field4619[field4628++] = var65.field2305;
                return;
            }
            if (arg0 == 1501) {
                field4619[field4628++] = var65.field2428;
                return;
            }
            if (arg0 == 1502) {
                field4619[field4628++] = var65.field2438;
                return;
            }
            if (arg0 == 1503) {
                field4619[field4628++] = var65.field2371;
                return;
            }
            if (arg0 == 1504) {
                field4619[field4628++] = var65.field2351 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field4619[field4628++] = var65.field2414;
                return;
            }
            if (arg0 == 1506) {
                class188 var66 = class672.method3719(0, var65);
                field4619[field4628++] = var66 == null ? -1 : var66.field2387;
                return;
            }
        } else if (arg0 < 1700) {
            class188 var67 = arg1 ? field4608 : field4610;
            if (arg0 == 1600) {
                field4619[field4628++] = var67.field2315;
                return;
            }
            if (arg0 == 1601) {
                field4619[field4628++] = var67.field2431;
                return;
            }
            if (arg0 == 1602) {
                field4625[field4626++] = var67.field2399;
                return;
            }
            if (arg0 == 1603) {
                field4619[field4628++] = var67.field2379;
                return;
            }
            if (arg0 == 1604) {
                field4619[field4628++] = var67.field2406;
                return;
            }
            if (arg0 == 1605) {
                field4619[field4628++] = var67.field2389;
                return;
            }
            if (arg0 == 1606) {
                field4619[field4628++] = var67.field2408;
                return;
            }
            if (arg0 == 1607) {
                field4619[field4628++] = var67.field2463;
                return;
            }
            if (arg0 == 1608) {
                field4619[field4628++] = var67.field2329;
                return;
            }
            if (arg0 == 1609) {
                field4619[field4628++] = var67.field2396;
                return;
            }
            if (arg0 == 1610) {
                field4619[field4628++] = var67.field2309;
                return;
            }
            if (arg0 == 1611) {
                field4619[field4628++] = var67.field2429;
                return;
            }
            if (arg0 == 1612) {
                field4619[field4628++] = var67.field2447;
                return;
            }
            if (arg0 == 1613) {
                int var68 = field4619[--field4628];
                class579 var69 = class191.field2486.method1256(var68, -3934);
                if (var69.method3259(-123)) {
                    field4625[field4626++] = var67.method1210(var69.field7997, var68, 10827);
                    return;
                }
                field4619[field4628++] = var67.method1201((byte) -48, var68, var69.field7999);
                return;
            }
            if (arg0 == 1614) {
                field4619[field4628++] = var67.field2357;
                return;
            }
        } else if (arg0 < 1800) {
            class188 var70 = arg1 ? field4608 : field4610;
            if (arg0 == 1700) {
                field4619[field4628++] = var70.field2324;
                return;
            }
            if (arg0 == 1701) {
                if (var70.field2324 != -1) {
                    field4619[field4628++] = var70.field2424;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field4619[field4628++] = var70.field2361;
                return;
            }
        } else if (arg0 < 1900) {
            class188 var71 = arg1 ? field4608 : field4610;
            if (arg0 == 1800) {
                field4619[field4628++] = client.method1411(var71).method1645(false);
                return;
            }
            if (arg0 == 1801) {
                int var72 = field4619[--field4628];
                int var342 = var72 - 1;
                if (var71.field2446 != null && var342 < var71.field2446.length && var71.field2446[var342] != null) {
                    field4625[field4626++] = var71.field2446[var342];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var71.field2307 == null) {
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = var71.field2307;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class188 var340;
            if (arg0 >= 2000) {
                var340 = class557.method3117(field4619[--field4628], (byte) 71);
                arg0 -= 1000;
            } else {
                var340 = arg1 ? field4608 : field4610;
            }
            if (field4634 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var340.field2403 == null) {
                    return;
                }
                class425 var341 = new class425();
                var341.field5911 = var340;
                var341.field5913 = var340.field2403;
                var341.field5915 = field4634 + 1;
                class380.field5450.method378(var341, 31316);
                return;
            }
        } else if (arg0 < 2600) {
            class188 var73 = class557.method3117(field4619[--field4628], (byte) 71);
            if (arg0 == 2500) {
                field4619[field4628++] = var73.field2305;
                return;
            }
            if (arg0 == 2501) {
                field4619[field4628++] = var73.field2428;
                return;
            }
            if (arg0 == 2502) {
                field4619[field4628++] = var73.field2438;
                return;
            }
            if (arg0 == 2503) {
                field4619[field4628++] = var73.field2371;
                return;
            }
            if (arg0 == 2504) {
                field4619[field4628++] = var73.field2351 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field4619[field4628++] = var73.field2414;
                return;
            }
            if (arg0 == 1506) {
                class188 var74 = class672.method3719(0, var73);
                field4619[field4628++] = var74 == null ? -1 : var74.field2387;
                return;
            }
        } else if (arg0 < 2700) {
            class188 var75 = class557.method3117(field4619[--field4628], (byte) 71);
            if (arg0 == 2600) {
                field4619[field4628++] = var75.field2315;
                return;
            }
            if (arg0 == 2601) {
                field4619[field4628++] = var75.field2431;
                return;
            }
            if (arg0 == 2602) {
                field4625[field4626++] = var75.field2399;
                return;
            }
            if (arg0 == 2603) {
                field4619[field4628++] = var75.field2379;
                return;
            }
            if (arg0 == 2604) {
                field4619[field4628++] = var75.field2406;
                return;
            }
            if (arg0 == 2605) {
                field4619[field4628++] = var75.field2389;
                return;
            }
            if (arg0 == 2606) {
                field4619[field4628++] = var75.field2408;
                return;
            }
            if (arg0 == 2607) {
                field4619[field4628++] = var75.field2463;
                return;
            }
            if (arg0 == 2608) {
                field4619[field4628++] = var75.field2329;
                return;
            }
            if (arg0 == 2609) {
                field4619[field4628++] = var75.field2396;
                return;
            }
            if (arg0 == 2610) {
                field4619[field4628++] = var75.field2309;
                return;
            }
            if (arg0 == 2611) {
                field4619[field4628++] = var75.field2429;
                return;
            }
            if (arg0 == 2612) {
                field4619[field4628++] = var75.field2447;
                return;
            }
            if (arg0 == 2613) {
                field4619[field4628++] = var75.field2357;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class188 var76 = class557.method3117(field4619[--field4628], (byte) 71);
                field4619[field4628++] = var76.field2324;
                return;
            }
            if (arg0 == 2701) {
                class188 var77 = class557.method3117(field4619[--field4628], (byte) 71);
                if (var77.field2324 != -1) {
                    field4619[field4628++] = var77.field2424;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var78 = field4619[--field4628];
                class524 var79 = (class524) class54.field742.method2506(18, (long) var78);
                if (var79 != null) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class188 var80 = class557.method3117(field4619[--field4628], (byte) 71);
                if (var80.field2352 == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                int var81 = var80.field2352.length;
                for (int var82 = 0; var82 < var80.field2352.length; var82++) {
                    if (var80.field2352[var82] == null) {
                        var81 = var82;
                        break;
                    }
                }
                field4619[field4628++] = var81;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field4628 -= 2;
                int var83 = field4619[field4628];
                int var84 = field4619[field4628 + 1];
                class524 var85 = (class524) class54.field742.method2506(57, (long) var83);
                if (var85 != null && var85.field7256 == var84) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class188 var86 = class557.method3117(field4619[--field4628], (byte) 71);
            if (arg0 == 2800) {
                field4619[field4628++] = client.method1411(var86).method1645(false);
                return;
            }
            if (arg0 == 2801) {
                int var87 = field4619[--field4628];
                int var343 = var87 - 1;
                if (var86.field2446 != null && var343 < var86.field2446.length && var86.field2446[var343] != null) {
                    field4625[field4626++] = var86.field2446[var343];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var86.field2307 == null) {
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = var86.field2307;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var88 = field4625[--field4626];
                class645.method3587(var88, (byte) -44);
                return;
            }
            if (arg0 == 3101) {
                field4628 -= 2;
                class483.method2691(class596.field8164, field4619[field4628 + 1], field4619[field4628], 0);
                return;
            }
            if (arg0 == 3103) {
                class419.method2433(-1, true);
                return;
            }
            if (arg0 == 3104) {
                String var89 = field4625[--field4626];
                int var90 = 0;
                if (class224.method1371(var89, (byte) -20)) {
                    var90 = class433.method2495(var89, 0);
                }
                field4612++;
                class389.method2326((byte) 118, class92.field1135);
                class253.field3491.method906(-1, var90);
                return;
            }
            if (arg0 == 3105) {
                String var91 = field4625[--field4626];
                field4627++;
                class389.method2326((byte) 118, class550.field7523);
                class253.field3491.method951((byte) -82, var91.length() + 1);
                class253.field3491.method905(var91, -128);
                return;
            }
            if (arg0 == 3106) {
                String var92 = field4625[--field4626];
                field4624++;
                class389.method2326((byte) 118, class575.field7955);
                class253.field3491.method951((byte) -82, var92.length() + 1);
                class253.field3491.method905(var92, 40);
                return;
            }
            if (arg0 == 3107) {
                int var93 = field4619[--field4628];
                String var94 = field4625[--field4626];
                class72.method428(var94, (byte) -128, var93);
                return;
            }
            if (arg0 == 3108) {
                field4628 -= 3;
                int var95 = field4619[field4628];
                int var96 = field4619[field4628 + 1];
                int var97 = field4619[field4628 + 2];
                class188 var98 = class557.method3117(var97, (byte) 71);
                class614.method3377(var98, var95, var96, 128);
                return;
            }
            if (arg0 == 3109) {
                field4628 -= 2;
                int var99 = field4619[field4628];
                int var100 = field4619[field4628 + 1];
                class188 var101 = arg1 ? field4608 : field4610;
                class614.method3377(var101, var99, var100, 128);
                return;
            }
            if (arg0 == 3110) {
                int var102 = field4619[--field4628];
                field4623++;
                class389.method2326((byte) 118, class644.field9123);
                class253.field3491.method915(var102, 1502242504);
                return;
            }
            if (arg0 == 3111) {
                field4628 -= 2;
                int var103 = field4619[field4628];
                int var104 = field4619[field4628 + 1];
                class524 var105 = (class524) class54.field742.method2506(57, (long) var103);
                if (var105 != null) {
                    class63.method389(var105.field7256 != var104, true, var105, -86);
                }
                class384.method2321(3, (byte) 123, var103, var104, true);
                return;
            }
            if (arg0 == 3112) {
                field4628--;
                int var106 = field4619[field4628];
                class524 var107 = (class524) class54.field742.method2506(53, (long) var106);
                if (var107 != null && var107.field7255 == 3) {
                    class63.method389(true, true, var107, 74);
                }
                return;
            }
            if (arg0 == 3113) {
                class570.method3218(0, field4625[--field4626]);
                return;
            }
            if (arg0 == 3114) {
                field4628 -= 2;
                int var108 = field4619[field4628];
                int var109 = field4619[field4628 + 1];
                String var110 = field4625[--field4626];
                class334.method2133("", var108, "", var110, var109, -122, "");
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field4628 -= 3;
                class411.method2410(true, 255, field4619[field4628], field4619[field4628 + 1], field4619[field4628 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class503.method2849(0, field4619[--field4628], 50, 255);
                return;
            }
            if (arg0 == 3202) {
                field4628 -= 2;
                class672.method3718(-24, field4619[field4628], 255, field4619[field4628 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field4628 -= 4;
                class411.method2410(true, field4619[field4628 + 3], field4619[field4628], field4619[field4628 + 1], field4619[field4628 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field4628 -= 3;
                class503.method2849(0, field4619[field4628], field4619[field4628 + 2], field4619[field4628 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field4628 -= 3;
                class672.method3718(115, field4619[field4628], field4619[field4628 + 2], field4619[field4628 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field4628 -= 4;
                class683.method3780(field4619[field4628], false, field4619[field4628 + 2], false, field4619[field4628 + 3], field4619[field4628 + 1]);
                return;
            }
            if (arg0 == 3207) {
                field4628 -= 4;
                class683.method3780(field4619[field4628], true, field4619[field4628 + 2], false, field4619[field4628 + 3], field4619[field4628 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field4619[field4628++] = class430.field5984;
                return;
            }
            if (arg0 == 3301) {
                field4628 -= 2;
                int var111 = field4619[field4628];
                int var112 = field4619[field4628 + 1];
                field4619[field4628++] = class449.method2569(var112, var111, -1, false);
                return;
            }
            if (arg0 == 3302) {
                field4628 -= 2;
                int var113 = field4619[field4628];
                int var114 = field4619[field4628 + 1];
                field4619[field4628++] = class68.method406(var114, 0, var113, false);
                return;
            }
            if (arg0 == 3303) {
                field4628 -= 2;
                int var115 = field4619[field4628];
                int var116 = field4619[field4628 + 1];
                field4619[field4628++] = class485.method2705(var115, (byte) 105, var116, false);
                return;
            }
            if (arg0 == 3304) {
                int var117 = field4619[--field4628];
                field4619[field4628++] = class255.field3521.method3381(25192, var117).field6341;
                return;
            }
            if (arg0 == 3305) {
                int var118 = field4619[--field4628];
                field4619[field4628++] = class545.field7476[var118];
                return;
            }
            if (arg0 == 3306) {
                int var119 = field4619[--field4628];
                field4619[field4628++] = class518.field7146[var119];
                return;
            }
            if (arg0 == 3307) {
                int var120 = field4619[--field4628];
                field4619[field4628++] = class177.field2216[var120];
                return;
            }
            if (arg0 == 3308) {
                byte var121 = class596.field8164.field3925;
                int var122 = (class596.field8164.field3929 >> 9) + class253.field3490;
                int var123 = (class596.field8164.field3917 >> 9) + class186.field2280;
                field4619[field4628++] = (var121 << 28) + (var122 << 14) + var123;
                return;
            }
            if (arg0 == 3309) {
                int var124 = field4619[--field4628];
                field4619[field4628++] = var124 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var125 = field4619[--field4628];
                field4619[field4628++] = var125 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var126 = field4619[--field4628];
                field4619[field4628++] = var126 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field4619[field4628++] = class624.field8492 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field4628 -= 2;
                int var127 = field4619[field4628];
                int var128 = field4619[field4628 + 1];
                field4619[field4628++] = class449.method2569(var128, var127, -1, true);
                return;
            }
            if (arg0 == 3314) {
                field4628 -= 2;
                int var129 = field4619[field4628];
                int var130 = field4619[field4628 + 1];
                field4619[field4628++] = class68.method406(var130, 0, var129, true);
                return;
            }
            if (arg0 == 3315) {
                field4628 -= 2;
                int var131 = field4619[field4628];
                int var132 = field4619[field4628 + 1];
                field4619[field4628++] = class485.method2705(var131, (byte) 100, var132, true);
                return;
            }
            if (arg0 == 3316) {
                if (class485.field6560 >= 2) {
                    field4619[field4628++] = class485.field6560;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field4619[field4628++] = class412.field5780;
                return;
            }
            if (arg0 == 3318) {
                field4619[field4628++] = class79.field1002.field9558;
                return;
            }
            if (arg0 == 3321) {
                field4619[field4628++] = class652.field9246;
                return;
            }
            if (arg0 == 3322) {
                field4619[field4628++] = class217.field2795;
                return;
            }
            if (arg0 == 3323) {
                if (class49.field657 >= 5 && class49.field657 <= 9) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class49.field657 >= 5 && class49.field657 <= 9) {
                    field4619[field4628++] = class49.field657;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field4619[field4628++] = class575.field7963 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field4619[field4628++] = class596.field8164.field7197;
                return;
            }
            if (arg0 == 3327) {
                field4619[field4628++] = class596.field8164.field7193.field5124 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field4619[field4628++] = class283.field3832 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var133 = field4619[--field4628];
                field4619[field4628++] = class235.method1455(var133, false, 0);
                return;
            }
            if (arg0 == 3331) {
                field4628 -= 2;
                int var134 = field4619[field4628];
                int var135 = field4619[field4628 + 1];
                field4619[field4628++] = class187.method1198(0, false, var135, var134, false);
                return;
            }
            if (arg0 == 3332) {
                field4628 -= 2;
                int var136 = field4619[field4628];
                int var137 = field4619[field4628 + 1];
                field4619[field4628++] = class187.method1198(0, false, var137, var136, true);
                return;
            }
            if (arg0 == 3333) {
                field4619[field4628++] = class644.field9129;
                return;
            }
            if (arg0 == 3335) {
                field4619[field4628++] = class350.field5121;
                return;
            }
            if (arg0 == 3336) {
                field4628 -= 4;
                int var138 = field4619[field4628];
                int var139 = field4619[field4628 + 1];
                int var140 = field4619[field4628 + 2];
                int var141 = field4619[field4628 + 3];
                int var142 = (var139 << 14) + var138;
                int var143 = (var140 << 28) + var142;
                int var144 = var141 + var143;
                field4619[field4628++] = var144;
                return;
            }
            if (arg0 == 3337) {
                field4619[field4628++] = class625.field8511;
                return;
            }
            if (arg0 == 3338) {
                field4619[field4628++] = class474.method2661(-65536);
                return;
            }
            if (arg0 == 3339) {
                field4619[field4628++] = class679.field9655 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field4619[field4628++] = class594.field8144 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field4619[field4628++] = class365.field5242 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field4619[field4628++] = class592.field8107.method268((byte) -124);
                return;
            }
            if (arg0 == 3343) {
                field4619[field4628++] = class592.field8107.method269((byte) -25);
                return;
            }
            if (arg0 == 3344) {
                field4625[field4626++] = class8.method52(true);
                return;
            }
            if (arg0 == 3345) {
                field4625[field4626++] = class204.method1284(-21195);
                return;
            }
            if (arg0 == 3346) {
                field4619[field4628++] = class377.method2289(2);
                return;
            }
            if (arg0 == 3347) {
                field4619[field4628++] = class228.field2982;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field4628 -= 2;
                int var145 = field4619[field4628];
                int var146 = field4619[field4628 + 1];
                class79 var147 = class39.field469.method3419(32764, var145);
                field4625[field4626++] = var147.method448(62, var146);
                return;
            }
            if (arg0 == 3408) {
                field4628 -= 4;
                int var148 = field4619[field4628];
                int var149 = field4619[field4628 + 1];
                int var150 = field4619[field4628 + 2];
                int var151 = field4619[field4628 + 3];
                class79 var152 = class39.field469.method3419(32764, var150);
                if (var152.field987 == var148 && var152.field1005 == var149) {
                    if (var149 == 115) {
                        field4625[field4626++] = var152.method448(62, var151);
                        return;
                    }
                    field4619[field4628++] = var152.method446(var151, true);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field4628 -= 3;
                int var153 = field4619[field4628];
                int var154 = field4619[field4628 + 1];
                int var155 = field4619[field4628 + 2];
                if (var154 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class79 var156 = class39.field469.method3419(32764, var154);
                if (var156.field1005 != var153) {
                    throw new RuntimeException("C3409-1");
                }
                field4619[field4628++] = var156.method454(var155, (byte) 28) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var157 = field4619[--field4628];
                String var158 = field4625[--field4626];
                if (var157 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class79 var159 = class39.field469.method3419(32764, var157);
                if (var159.field1005 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field4619[field4628++] = var159.method449(-4628, var158) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var160 = field4619[--field4628];
                class79 var161 = class39.field469.method3419(32764, var160);
                field4619[field4628++] = var161.field993.method2505(-5643);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class99.field1209 == 0) {
                    field4619[field4628++] = -2;
                    return;
                }
                if (class99.field1209 == 1) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = class110.field1323;
                return;
            }
            if (arg0 == 3601) {
                int var162 = field4619[--field4628];
                if (class99.field1209 == 2 && var162 < class110.field1323) {
                    field4625[field4626++] = class320.field4711[var162];
                    if (class248.field3335[var162] != null) {
                        field4625[field4626++] = class248.field3335[var162];
                        return;
                    }
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = "";
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var163 = field4619[--field4628];
                if (class99.field1209 == 2 && var163 < class110.field1323) {
                    field4619[field4628++] = class314.field4515[var163];
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var164 = field4619[--field4628];
                if (class99.field1209 == 2 && var164 < class110.field1323) {
                    field4619[field4628++] = class47.field647[var164];
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var165 = field4625[--field4626];
                int var166 = field4619[--field4628];
                class160.method1092(360, var165, var166);
                return;
            }
            if (arg0 == 3605) {
                String var167 = field4625[--field4626];
                class477.method2672((byte) -33, var167);
                return;
            }
            if (arg0 == 3606) {
                String var168 = field4625[--field4626];
                class597.method3307(-30, var168);
                return;
            }
            if (arg0 == 3607) {
                String var169 = field4625[--field4626];
                class569.method3212(4, false, var169);
                return;
            }
            if (arg0 == 3608) {
                String var170 = field4625[--field4626];
                class495.method2795((byte) -126, var170);
                return;
            }
            if (arg0 == 3609) {
                String var171 = field4625[--field4626];
                if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                    var171 = var171.substring(7);
                }
                field4619[field4628++] = class297.method1772(var171, 50) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var172 = field4619[--field4628];
                if (class99.field1209 == 2 && var172 < class110.field1323) {
                    field4625[field4626++] = class383.field5573[var172];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class21.field192 != null) {
                    field4625[field4626++] = class626.method3420(21, class21.field192);
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class21.field192 != null) {
                    field4619[field4628++] = class35.field341;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var173 = field4619[--field4628];
                if (class21.field192 != null && var173 < class35.field341) {
                    field4625[field4626++] = class624.field8496[var173].field1016;
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var174 = field4619[--field4628];
                if (class21.field192 != null && var174 < class35.field341) {
                    field4619[field4628++] = class624.field8496[var174].field1009;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var175 = field4619[--field4628];
                if (class21.field192 != null && var175 < class35.field341) {
                    field4619[field4628++] = class624.field8496[var175].field1007;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field4619[field4628++] = class383.field5572;
                return;
            }
            if (arg0 == 3617) {
                String var176 = field4625[--field4626];
                class121.method739(-28482, var176);
                return;
            }
            if (arg0 == 3618) {
                field4619[field4628++] = class554.field7579;
                return;
            }
            if (arg0 == 3619) {
                String var177 = field4625[--field4626];
                class341.method2161(var177, 126);
                return;
            }
            if (arg0 == 3620) {
                class336.method2146((byte) 68);
                return;
            }
            if (arg0 == 3621) {
                if (class99.field1209 == 0) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = class641.field8818;
                return;
            }
            if (arg0 == 3622) {
                int var178 = field4619[--field4628];
                if (class99.field1209 != 0 && var178 < class641.field8818) {
                    field4625[field4626++] = class353.field5147[var178];
                    if (class291.field3892[var178] != null) {
                        field4625[field4626++] = class291.field3892[var178];
                        return;
                    }
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = "";
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var179 = field4625[--field4626];
                if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                    var179 = var179.substring(7);
                }
                field4619[field4628++] = class559.method3124(-113, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var180 = field4619[--field4628];
                if (class624.field8496 != null && var180 < class35.field341 && class624.field8496[var180].field1008.equalsIgnoreCase(class596.field8164.field7191)) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class34.field328 != null) {
                    field4625[field4626++] = class34.field328;
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var181 = field4619[--field4628];
                if (class21.field192 != null && var181 < class35.field341) {
                    field4625[field4626++] = class624.field8496[var181].field1015;
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var182 = field4619[--field4628];
                if (class99.field1209 == 2 && var182 >= 0 && var182 < class110.field1323) {
                    field4619[field4628++] = class598.field8189[var182] ? 1 : 0;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var183 = field4625[--field4626];
                if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                    var183 = var183.substring(7);
                }
                field4619[field4628++] = class107.method569(0, var183);
                return;
            }
            if (arg0 == 3629) {
                field4619[field4628++] = class624.field8479;
                return;
            }
            if (arg0 == 3630) {
                String var184 = field4625[--field4626];
                class569.method3212(4, true, var184);
                return;
            }
            if (arg0 == 3631) {
                int var185 = field4619[--field4628];
                field4619[field4628++] = class42.field550[var185] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var186 = field4619[--field4628];
                if (class21.field192 != null && var186 < class35.field341) {
                    field4625[field4626++] = class624.field8496[var186].field1008;
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var187 = field4619[--field4628];
                if (class99.field1209 != 0 && var187 < class641.field8818) {
                    field4625[field4626++] = class207.field2698[var187];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var188 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var188].method202((byte) -61);
                return;
            }
            if (arg0 == 3904) {
                int var189 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var189].field312;
                return;
            }
            if (arg0 == 3905) {
                int var190 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var190].field321;
                return;
            }
            if (arg0 == 3906) {
                int var191 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var191].field326;
                return;
            }
            if (arg0 == 3907) {
                int var192 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var192].field311;
                return;
            }
            if (arg0 == 3908) {
                int var193 = field4619[--field4628];
                field4619[field4628++] = class466.field6352[var193].field317;
                return;
            }
            if (arg0 == 3910) {
                int var194 = field4619[--field4628];
                int var195 = class466.field6352[var194].method204(true);
                field4619[field4628++] = var195 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var196 = field4619[--field4628];
                int var197 = class466.field6352[var196].method204(true);
                field4619[field4628++] = var197 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var198 = field4619[--field4628];
                int var199 = class466.field6352[var198].method204(true);
                field4619[field4628++] = var199 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var200 = field4619[--field4628];
                int var201 = class466.field6352[var200].method204(true);
                field4619[field4628++] = var201 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field4628 -= 2;
                int var202 = field4619[field4628];
                int var203 = field4619[field4628 + 1];
                field4619[field4628++] = var202 + var203;
                return;
            }
            if (arg0 == 4001) {
                field4628 -= 2;
                int var204 = field4619[field4628];
                int var205 = field4619[field4628 + 1];
                field4619[field4628++] = var204 - var205;
                return;
            }
            if (arg0 == 4002) {
                field4628 -= 2;
                int var206 = field4619[field4628];
                int var207 = field4619[field4628 + 1];
                field4619[field4628++] = var206 * var207;
                return;
            }
            if (arg0 == 4003) {
                field4628 -= 2;
                int var208 = field4619[field4628];
                int var209 = field4619[field4628 + 1];
                field4619[field4628++] = var208 / var209;
                return;
            }
            if (arg0 == 4004) {
                int var210 = field4619[--field4628];
                field4619[field4628++] = (int) (Math.random() * (double) var210);
                return;
            }
            if (arg0 == 4005) {
                int var211 = field4619[--field4628];
                field4619[field4628++] = (int) (Math.random() * (double) (var211 + 1));
                return;
            }
            if (arg0 == 4006) {
                field4628 -= 5;
                int var212 = field4619[field4628];
                int var213 = field4619[field4628 + 1];
                int var214 = field4619[field4628 + 2];
                int var215 = field4619[field4628 + 3];
                int var216 = field4619[field4628 + 4];
                field4619[field4628++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                return;
            }
            if (arg0 == 4007) {
                field4628 -= 2;
                long var217 = (long) field4619[field4628];
                long var219 = (long) field4619[field4628 + 1];
                field4619[field4628++] = (int) (var217 * var219 / 100L + var217);
                return;
            }
            if (arg0 == 4008) {
                field4628 -= 2;
                int var221 = field4619[field4628];
                int var222 = field4619[field4628 + 1];
                field4619[field4628++] = var221 | 0x1 << var222;
                return;
            }
            if (arg0 == 4009) {
                field4628 -= 2;
                int var223 = field4619[field4628];
                int var224 = field4619[field4628 + 1];
                field4619[field4628++] = var223 & -(0x1 << var224) - 1;
                return;
            }
            if (arg0 == 4010) {
                field4628 -= 2;
                int var225 = field4619[field4628];
                int var226 = field4619[field4628 + 1];
                field4619[field4628++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field4628 -= 2;
                int var227 = field4619[field4628];
                int var228 = field4619[field4628 + 1];
                field4619[field4628++] = var227 % var228;
                return;
            }
            if (arg0 == 4012) {
                field4628 -= 2;
                int var229 = field4619[field4628];
                int var230 = field4619[field4628 + 1];
                if (var229 == 0) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = (int) Math.pow((double) var229, (double) var230);
                return;
            }
            if (arg0 == 4013) {
                field4628 -= 2;
                int var231 = field4619[field4628];
                int var232 = field4619[field4628 + 1];
                if (var231 == 0) {
                    field4619[field4628++] = 0;
                    return;
                }
                if (var232 == 0) {
                    field4619[field4628++] = Integer.MAX_VALUE;
                    return;
                }
                field4619[field4628++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                return;
            }
            if (arg0 == 4014) {
                field4628 -= 2;
                int var233 = field4619[field4628];
                int var234 = field4619[field4628 + 1];
                field4619[field4628++] = var233 & var234;
                return;
            }
            if (arg0 == 4015) {
                field4628 -= 2;
                int var235 = field4619[field4628];
                int var236 = field4619[field4628 + 1];
                field4619[field4628++] = var235 | var236;
                return;
            }
            if (arg0 == 4016) {
                field4628 -= 2;
                int var237 = field4619[field4628];
                int var238 = field4619[field4628 + 1];
                field4619[field4628++] = var237 < var238 ? var237 : var238;
                return;
            }
            if (arg0 == 4017) {
                field4628 -= 2;
                int var239 = field4619[field4628];
                int var240 = field4619[field4628 + 1];
                field4619[field4628++] = var239 > var240 ? var239 : var240;
                return;
            }
            if (arg0 == 4018) {
                field4628 -= 3;
                long var241 = (long) field4619[field4628];
                long var243 = (long) field4619[field4628 + 1];
                long var245 = (long) field4619[field4628 + 2];
                field4619[field4628++] = (int) (var241 * var245 / var243);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var247 = field4625[--field4626];
                int var248 = field4619[--field4628];
                field4625[field4626++] = var247 + var248;
                return;
            }
            if (arg0 == 4101) {
                field4626 -= 2;
                String var249 = field4625[field4626];
                String var250 = field4625[field4626 + 1];
                field4625[field4626++] = var249 + var250;
                return;
            }
            if (arg0 == 4102) {
                String var251 = field4625[--field4626];
                int var252 = field4619[--field4628];
                field4625[field4626++] = var251 + class403.method2371(1829835024, true, var252);
                return;
            }
            if (arg0 == 4103) {
                String var253 = field4625[--field4626];
                field4625[field4626++] = var253.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field4625[field4626++] = method2052(field4619[--field4628]);
                return;
            }
            if (arg0 == 4105) {
                field4626 -= 2;
                String var254 = field4625[field4626];
                String var255 = field4625[field4626 + 1];
                if (class596.field8164.field7193 != null && class596.field8164.field7193.field5124) {
                    field4625[field4626++] = var255;
                    return;
                }
                field4625[field4626++] = var254;
                return;
            }
            if (arg0 == 4106) {
                int var256 = field4619[--field4628];
                field4625[field4626++] = Integer.toString(var256);
                return;
            }
            if (arg0 == 4107) {
                field4626 -= 2;
                field4619[field4628++] = class313.method2027(field4625[field4626], class350.field5121, 0, field4625[field4626 + 1]);
                return;
            }
            if (arg0 == 4108) {
                String var257 = field4625[--field4626];
                field4628 -= 2;
                int var258 = field4619[field4628];
                int var259 = field4619[field4628 + 1];
                class598 var260 = class43.method256(var259, 0, -29213, class613.field8373);
                field4619[field4628++] = var260.method3314(var257, class615.field8391, false, var258);
                return;
            }
            if (arg0 == 4109) {
                String var261 = field4625[--field4626];
                field4628 -= 2;
                int var262 = field4619[field4628];
                int var263 = field4619[field4628 + 1];
                class598 var264 = class43.method256(var263, 0, -29213, class613.field8373);
                field4619[field4628++] = var264.method3308(var262, var261, class615.field8391, 0);
                return;
            }
            if (arg0 == 4110) {
                field4626 -= 2;
                String var265 = field4625[field4626];
                String var266 = field4625[field4626 + 1];
                if (field4619[--field4628] == 1) {
                    field4625[field4626++] = var265;
                    return;
                }
                field4625[field4626++] = var266;
                return;
            }
            if (arg0 == 4111) {
                String var267 = field4625[--field4626];
                field4625[field4626++] = class549.method3089(var267, true);
                return;
            }
            if (arg0 == 4112) {
                String var268 = field4625[--field4626];
                int var269 = field4619[--field4628];
                if (var269 == -1) {
                    throw new RuntimeException("null char");
                }
                field4625[field4626++] = var268 + (char) var269;
                return;
            }
            if (arg0 == 4113) {
                int var270 = field4619[--field4628];
                field4619[field4628++] = class639.method3479((byte) -96, (char) var270) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var271 = field4619[--field4628];
                field4619[field4628++] = class544.method3064(-91, (char) var271) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var272 = field4619[--field4628];
                field4619[field4628++] = class139.method959(-123, (char) var272) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var273 = field4619[--field4628];
                field4619[field4628++] = class11.method71(57, (char) var273) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var274 = field4625[--field4626];
                if (var274 != null) {
                    field4619[field4628++] = var274.length();
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var275 = field4625[--field4626];
                field4628 -= 2;
                int var276 = field4619[field4628];
                int var277 = field4619[field4628 + 1];
                field4625[field4626++] = var275.substring(var276, var277);
                return;
            }
            if (arg0 == 4119) {
                String var278 = field4625[--field4626];
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
                field4625[field4626++] = var279.toString();
                return;
            }
            if (arg0 == 4120) {
                String var283 = field4625[--field4626];
                field4628 -= 2;
                int var284 = field4619[field4628];
                int var285 = field4619[field4628 + 1];
                field4619[field4628++] = var283.indexOf(var284, var285);
                return;
            }
            if (arg0 == 4121) {
                field4626 -= 2;
                String var286 = field4625[field4626];
                String var287 = field4625[field4626 + 1];
                int var288 = field4619[--field4628];
                field4619[field4628++] = var286.indexOf(var287, var288);
                return;
            }
            if (arg0 == 4122) {
                int var289 = field4619[--field4628];
                field4619[field4628++] = Character.toLowerCase((char) var289);
                return;
            }
            if (arg0 == 4123) {
                int var290 = field4619[--field4628];
                field4619[field4628++] = Character.toUpperCase((char) var290);
                return;
            }
            if (arg0 == 4124) {
                boolean var291 = field4619[--field4628] != 0;
                int var292 = field4619[--field4628];
                field4625[field4626++] = class436.method2512((long) var292, -8426, class350.field5121, 0, var291);
                return;
            }
            if (arg0 == 4125) {
                String var293 = field4625[--field4626];
                int var294 = field4619[--field4628];
                class598 var295 = class43.method256(var294, 0, -29213, class613.field8373);
                field4619[field4628++] = var295.method3313(class615.field8391, (byte) -85, var293);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var296 = field4619[--field4628];
                field4625[field4626++] = class237.field3088.method1349(-1, var296).field9309;
                return;
            }
            if (arg0 == 4201) {
                field4628 -= 2;
                int var297 = field4619[field4628];
                int var298 = field4619[field4628 + 1];
                class660 var299 = class237.field3088.method1349(-1, var297);
                if (var298 >= 1 && var298 <= 5 && var299.field9360[var298 - 1] != null) {
                    field4625[field4626++] = var299.field9360[var298 - 1];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 4202) {
                field4628 -= 2;
                int var300 = field4619[field4628];
                int var301 = field4619[field4628 + 1];
                class660 var302 = class237.field3088.method1349(-1, var300);
                if (var301 >= 1 && var301 <= 5 && var302.field9350[var301 - 1] != null) {
                    field4625[field4626++] = var302.field9350[var301 - 1];
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var303 = field4619[--field4628];
                field4619[field4628++] = class237.field3088.method1349(-1, var303).field9348;
                return;
            }
            if (arg0 == 4204) {
                int var304 = field4619[--field4628];
                field4619[field4628++] = class237.field3088.method1349(-1, var304).field9331 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var305 = field4619[--field4628];
                class660 var306 = class237.field3088.method1349(-1, var305);
                if (var306.field9375 == -1 && var306.field9349 >= 0) {
                    field4619[field4628++] = var306.field9349;
                    return;
                }
                field4619[field4628++] = var305;
                return;
            }
            if (arg0 == 4206) {
                int var307 = field4619[--field4628];
                class660 var308 = class237.field3088.method1349(-1, var307);
                if (var308.field9375 >= 0 && var308.field9349 >= 0) {
                    field4619[field4628++] = var308.field9349;
                    return;
                }
                field4619[field4628++] = var307;
                return;
            }
            if (arg0 == 4207) {
                int var309 = field4619[--field4628];
                field4619[field4628++] = class237.field3088.method1349(-1, var309).field9377 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field4628 -= 2;
                int var310 = field4619[field4628];
                int var311 = field4619[field4628 + 1];
                class579 var312 = class191.field2486.method1256(var311, -3934);
                if (var312.method3259(-117)) {
                    field4625[field4626++] = class237.field3088.method1349(-1, var310).method3655(-41, var311, var312.field7997);
                    return;
                }
                field4619[field4628++] = class237.field3088.method1349(-1, var310).method3658(var311, -100, var312.field7999);
                return;
            }
            if (arg0 == 4209) {
                field4628 -= 2;
                int var313 = field4619[field4628];
                int var314 = field4619[field4628 + 1] - 1;
                class660 var315 = class237.field3088.method1349(-1, var313);
                if (var315.field9308 == var314) {
                    field4619[field4628++] = var315.field9343;
                    return;
                }
                if (var315.field9315 == var314) {
                    field4619[field4628++] = var315.field9358;
                    return;
                }
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var316 = field4625[--field4626];
                int var317 = field4619[--field4628];
                class66.method398(var316, var317 == 1, false);
                field4619[field4628++] = class651.field9216;
                return;
            }
            if (arg0 == 4211) {
                if (class168.field2103 != null && class589.field8084 < class651.field9216) {
                    field4619[field4628++] = class168.field2103[class589.field8084++] & 0xFFFF;
                    return;
                }
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class589.field8084 = 0;
                return;
            }
            if (arg0 == 4214) {
                String var318 = field4625[--field4626];
                field4628 -= 3;
                int var319 = field4619[field4628];
                int var320 = field4619[field4628 + 1];
                int var321 = field4619[field4628 + 2];
                class691.method3828(var321, (byte) -11, var320, var319 == 1, var318);
                field4619[field4628++] = class651.field9216;
                return;
            }
            if (arg0 == 4215) {
                field4626 -= 2;
                field4628 -= 2;
                String var322 = field4625[field4626];
                int var323 = field4619[field4628];
                int var324 = field4619[field4628 + 1];
                String var325 = field4625[field4626 + 1];
                class500.method2810(var322, var323 == 1, -13817, var325, var324);
                field4619[field4628++] = class651.field9216;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field4628 -= 2;
                int var326 = field4619[field4628];
                int var327 = field4619[field4628 + 1];
                class579 var328 = class191.field2486.method1256(var327, -3934);
                if (var328.method3259(-110)) {
                    field4625[field4626++] = class318.field4640.method3384((byte) 112, var326).method1246(var327, var328.field7997, true);
                    return;
                }
                field4619[field4628++] = class318.field4640.method3384((byte) 91, var326).method1249(var327, var328.field7999, (byte) 119);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field4628 -= 2;
                int var329 = field4619[field4628];
                int var330 = field4619[field4628 + 1];
                class579 var331 = class191.field2486.method1256(var330, -3934);
                if (var331.method3259(-115)) {
                    field4625[field4626++] = class578.field7980.method1746(var329, (byte) 73).method1581(var330, var331.field7997, -27);
                    return;
                }
                field4619[field4628++] = class578.field7980.method1746(var329, (byte) 66).method1567(false, var331.field7999, var330);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field4628 -= 2;
                int var332 = field4619[field4628];
                int var333 = field4619[field4628 + 1];
                class579 var334 = class191.field2486.method1256(var333, -3934);
                if (var334.method3259(-128)) {
                    field4625[field4626++] = class67.field876.method3217(-79, var332).method145((byte) -125, var334.field7997, var333);
                    return;
                }
                field4619[field4628++] = class67.field876.method3217(-114, var332).method141(var334.field7999, -21439, var333);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var335 = field4619[--field4628];
            class334 var336 = class613.field8364.method1868(15624, var335);
            if (var336.field4916 != null && var336.field4916.length > 0) {
                int var337 = 0;
                int var338 = var336.field4874[0];
                for (int var339 = 1; var339 < var336.field4916.length; var339++) {
                    if (var336.field4874[var339] > var338) {
                        var337 = var339;
                        var338 = var336.field4874[var339];
                    }
                }
                field4619[field4628++] = var336.field4916[var337];
                return;
            }
            field4619[field4628++] = var336.field4892;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lmr;I)V", line = 4489)
    private static final void method2048(class425 arg0, int arg1) {
        Object[] var2 = arg0.field5913;
        int var3 = (Integer) var2[0];
        class175 var4 = class274.method1672(-122, var3);
        if (var4 == null) {
            return;
        }
        field4607 = new int[var4.field2205];
        int var5 = 0;
        field4630 = new String[var4.field2208];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5904;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5903;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5911 == null ? -1 : arg0.field5911.field2387;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5912;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5911 == null ? -1 : arg0.field5911.field2361;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5916 == null ? -1 : arg0.field5916.field2387;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5916 == null ? -1 : arg0.field5916.field2361;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5905;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5909;
                }
                field4607[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5910;
                }
                field4630[var6++] = var9;
            }
        }
        field4634 = arg0.field5915;
        method2045(var4, arg1);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 4578)
    private static final void method2049(int arg0) {
        class188 var1 = class557.method3117(arg0, (byte) 71);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class188[] var3 = class421.field5864[var2];
        if (var3 == null) {
            class188[] var4 = class328.field4799[var2];
            int var5 = var4.length;
            var3 = class421.field5864[var2] = new class188[var5];
            class657.method3640(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class657.method3640(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "()V", line = 4614)
    public static final void method2050() {
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lmr;)V", line = 4619)
    public static final void method2051(class425 arg0) {
        method2048(arg0, 200000);
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Ljava/lang/String;", line = 4629)
    private static final String method2052(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4621.setTime(new Date(var1));
        int var3 = field4621.get(5);
        int var4 = field4621.get(2);
        int var5 = field4621.get(1);
        return var3 + "-" + field4632[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "(IZ)V", line = 4647)
    private static final void method2053(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4619[field4628++] = class127.field1619;
                return;
            }
            if (arg0 == 5001) {
                field4628 -= 3;
                class127.field1619 = field4619[field4628];
                class96.field1179 = class500.method2813(0, field4619[field4628 + 1]);
                if (class96.field1179 == null) {
                    class96.field1179 = class380.field5454;
                }
                class140.field1791 = field4619[field4628 + 2];
                field4617++;
                class389.method2326((byte) 118, class420.field5863);
                class253.field3491.method951((byte) -82, class127.field1619);
                class253.field3491.method951((byte) -82, class96.field1179.field8283);
                class253.field3491.method951((byte) -82, class140.field1791);
                return;
            }
            if (arg0 == 5002) {
                field4626 -= 2;
                String var2 = field4625[field4626];
                String var3 = field4625[field4626 + 1];
                field4628 -= 2;
                int var4 = field4619[field4628];
                int var5 = field4619[field4628 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4606++;
                class389.method2326((byte) 118, class236.field3077);
                class253.field3491.method951((byte) -82, class500.method2820(1, var2) + class500.method2820(1, var3) + 2);
                class253.field3491.method905(var2, -121);
                class253.field3491.method951((byte) -82, var4 - 1);
                class253.field3491.method951((byte) -82, var5);
                class253.field3491.method905(var3, -119);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4619[--field4628];
                class497 var7 = class44.method270(var6, 0);
                String var8 = "";
                if (var7 != null && var7.field6711 != null) {
                    var8 = var7.field6711;
                }
                field4625[field4626++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field4619[--field4628];
                class497 var10 = class44.method270(var9, 0);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field6721;
                }
                field4619[field4628++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class96.field1179 == null) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = class96.field1179.field8283;
                return;
            }
            if (arg0 == 5006) {
                int var12 = field4619[--field4628];
                class389.method2326((byte) 118, class4.field33);
                class253.field3491.method951((byte) -82, var12);
                return;
            }
            if (arg0 == 5008) {
                String var13 = field4625[--field4626];
                method2046(var13, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4626 -= 2;
                String var14 = field4625[field4626];
                String var15 = field4625[field4626 + 1];
                if (class485.field6560 != 0 || (!class276.field3741 || class205.field2682) && !class283.field3832) {
                    field4629++;
                    class389.method2326((byte) 118, class373.field5379);
                    class253.field3491.method951((byte) -82, 0);
                    int var16 = class253.field3491.field1745;
                    class253.field3491.method905(var14, -124);
                    class66.method395(class253.field3491, var15, true);
                    class253.field3491.method901(-12951, class253.field3491.field1745 - var16);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var17 = field4619[--field4628];
                class497 var18 = class44.method270(var17, 0);
                String var19 = "";
                if (var18 != null && var18.field6726 != null) {
                    var19 = var18.field6726;
                }
                field4625[field4626++] = var19;
                return;
            }
            if (arg0 == 5011) {
                int var20 = field4619[--field4628];
                class497 var21 = class44.method270(var20, 0);
                String var22 = "";
                if (var21 != null && var21.field6714 != null) {
                    var22 = var21.field6714;
                }
                field4625[field4626++] = var22;
                return;
            }
            if (arg0 == 5012) {
                int var23 = field4619[--field4628];
                class497 var24 = class44.method270(var23, 0);
                int var25 = -1;
                if (var24 != null) {
                    var25 = var24.field6720;
                }
                field4619[field4628++] = var25;
                return;
            }
            if (arg0 == 5015) {
                String var26;
                if (class596.field8164 == null || class596.field8164.field7157 == null) {
                    var26 = class82.field1022;
                } else {
                    var26 = class596.field8164.method2957(true, true);
                }
                field4625[field4626++] = var26;
                return;
            }
            if (arg0 == 5016) {
                field4619[field4628++] = class140.field1791;
                return;
            }
            if (arg0 == 5017) {
                field4619[field4628++] = class485.method2706(0);
                return;
            }
            if (arg0 == 5018) {
                int var27 = field4619[--field4628];
                class497 var28 = class44.method270(var27, 0);
                int var29 = 0;
                if (var28 != null) {
                    var29 = var28.field6719;
                }
                field4619[field4628++] = var29;
                return;
            }
            if (arg0 == 5019) {
                int var30 = field4619[--field4628];
                class497 var31 = class44.method270(var30, 0);
                String var32 = "";
                if (var31 != null && var31.field6724 != null) {
                    var32 = var31.field6724;
                }
                field4625[field4626++] = var32;
                return;
            }
            if (arg0 == 5020) {
                String var33;
                if (class596.field8164 == null || class596.field8164.field7157 == null) {
                    var33 = class82.field1022;
                } else {
                    var33 = class596.field8164.method2956(-1, false);
                }
                field4625[field4626++] = var33;
                return;
            }
            if (arg0 == 5023) {
                int var34 = field4619[--field4628];
                class497 var35 = class44.method270(var34, 0);
                int var36 = -1;
                if (var35 != null) {
                    var36 = var35.field6718;
                }
                field4619[field4628++] = var36;
                return;
            }
            if (arg0 == 5024) {
                int var37 = field4619[--field4628];
                class497 var38 = class44.method270(var37, 0);
                int var39 = -1;
                if (var38 != null) {
                    var39 = var38.field6712;
                }
                field4619[field4628++] = var39;
                return;
            }
            if (arg0 == 5025) {
                int var40 = field4619[--field4628];
                class497 var41 = class44.method270(var40, 0);
                String var42 = "";
                if (var41 != null && var41.field6717 != null) {
                    var42 = var41.field6717;
                }
                field4625[field4626++] = var42;
                return;
            }
            if (arg0 == 5050) {
                int var43 = field4619[--field4628];
                field4625[field4626++] = class527.field7297.method1018(32767, var43).field2798;
                return;
            }
            if (arg0 == 5051) {
                int var44 = field4619[--field4628];
                class217 var45 = class527.field7297.method1018(32767, var44);
                if (var45.field2800 == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = var45.field2800.length;
                return;
            }
            if (arg0 == 5052) {
                field4628 -= 2;
                int var46 = field4619[field4628];
                int var47 = field4619[field4628 + 1];
                class217 var48 = class527.field7297.method1018(32767, var46);
                int var49 = var48.field2800[var47];
                field4619[field4628++] = var49;
                return;
            }
            if (arg0 == 5053) {
                int var50 = field4619[--field4628];
                class217 var51 = class527.field7297.method1018(32767, var50);
                if (var51.field2794 == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = var51.field2794.length;
                return;
            }
            if (arg0 == 5054) {
                field4628 -= 2;
                int var52 = field4619[field4628];
                int var53 = field4619[field4628 + 1];
                field4619[field4628++] = class527.field7297.method1018(32767, var52).field2794[var53];
                return;
            }
            if (arg0 == 5055) {
                int var54 = field4619[--field4628];
                field4625[field4626++] = class673.field9539.method2804(27993, var54).method3230(80);
                return;
            }
            if (arg0 == 5056) {
                int var55 = field4619[--field4628];
                class572 var56 = class673.field9539.method2804(27993, var55);
                if (var56.field7917 == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = var56.field7917.length;
                return;
            }
            if (arg0 == 5057) {
                field4628 -= 2;
                int var57 = field4619[field4628];
                int var58 = field4619[field4628 + 1];
                field4619[field4628++] = class673.field9539.method2804(27993, var57).field7917[var58];
                return;
            }
            if (arg0 == 5058) {
                field4622 = new class672();
                field4622.field9533 = field4619[--field4628];
                field4622.field9531 = class673.field9539.method2804(27993, field4622.field9533);
                field4622.field9532 = new int[field4622.field9531.method3236(0)];
                return;
            }
            if (arg0 == 5059) {
                field4615++;
                class389.method2326((byte) 118, class34.field335);
                class253.field3491.method951((byte) -82, 0);
                int var59 = class253.field3491.field1745;
                class253.field3491.method951((byte) -82, 0);
                class253.field3491.method915(field4622.field9533, 1502242504);
                field4622.field9531.method3237(class253.field3491, (byte) -61, field4622.field9532);
                class253.field3491.method901(-12951, class253.field3491.field1745 - var59);
                return;
            }
            if (arg0 == 5060) {
                String var60 = field4625[--field4626];
                field4620++;
                class389.method2326((byte) 118, class164.field2069);
                class253.field3491.method951((byte) -82, 0);
                int var61 = class253.field3491.field1745;
                class253.field3491.method905(var60, 71);
                class253.field3491.method915(field4622.field9533, 1502242504);
                field4622.field9531.method3237(class253.field3491, (byte) -61, field4622.field9532);
                class253.field3491.method901(-12951, class253.field3491.field1745 - var61);
                return;
            }
            if (arg0 == 5061) {
                field4615++;
                class389.method2326((byte) 118, class34.field335);
                class253.field3491.method951((byte) -82, 0);
                int var62 = class253.field3491.field1745;
                class253.field3491.method951((byte) -82, 1);
                class253.field3491.method915(field4622.field9533, 1502242504);
                field4622.field9531.method3237(class253.field3491, (byte) -61, field4622.field9532);
                class253.field3491.method901(-12951, class253.field3491.field1745 - var62);
                return;
            }
            if (arg0 == 5062) {
                field4628 -= 2;
                int var63 = field4619[field4628];
                int var64 = field4619[field4628 + 1];
                field4619[field4628++] = class527.field7297.method1018(32767, var63).field2796[var64];
                return;
            }
            if (arg0 == 5063) {
                field4628 -= 2;
                int var65 = field4619[field4628];
                int var66 = field4619[field4628 + 1];
                field4619[field4628++] = class527.field7297.method1018(32767, var65).field2804[var66];
                return;
            }
            if (arg0 == 5064) {
                field4628 -= 2;
                int var67 = field4619[field4628];
                int var68 = field4619[field4628 + 1];
                if (var68 == -1) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = class527.field7297.method1018(32767, var67).method1338((char) var68, 32);
                return;
            }
            if (arg0 == 5065) {
                field4628 -= 2;
                int var69 = field4619[field4628];
                int var70 = field4619[field4628 + 1];
                if (var70 == -1) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = class527.field7297.method1018(32767, var69).method1341((char) var70, 117);
                return;
            }
            if (arg0 == 5066) {
                int var71 = field4619[--field4628];
                field4619[field4628++] = class673.field9539.method2804(27993, var71).method3236(0);
                return;
            }
            if (arg0 == 5067) {
                field4628 -= 2;
                int var72 = field4619[field4628];
                int var73 = field4619[field4628 + 1];
                int var74 = class673.field9539.method2804(27993, var72).method3235(var73, (byte) -107).field3685;
                field4619[field4628++] = var74;
                return;
            }
            if (arg0 == 5068) {
                field4628 -= 2;
                int var75 = field4619[field4628];
                int var76 = field4619[field4628 + 1];
                field4622.field9532[var75] = var76;
                return;
            }
            if (arg0 == 5069) {
                field4628 -= 2;
                int var77 = field4619[field4628];
                int var78 = field4619[field4628 + 1];
                field4622.field9532[var77] = var78;
                return;
            }
            if (arg0 == 5070) {
                field4628 -= 3;
                int var79 = field4619[field4628];
                int var80 = field4619[field4628 + 1];
                int var81 = field4619[field4628 + 2];
                class572 var82 = class673.field9539.method2804(27993, var79);
                if (var82.method3235(var80, (byte) -93).field3685 != 0) {
                    throw new RuntimeException("bad command");
                }
                field4619[field4628++] = var82.method3232(-59, var81, var80);
                return;
            }
            if (arg0 == 5071) {
                String var83 = field4625[--field4626];
                boolean var84 = field4619[--field4628] == 1;
                class226.method1384(var83, 16711935, var84);
                field4619[field4628++] = class651.field9216;
                return;
            }
            if (arg0 == 5072) {
                if (class168.field2103 != null && class589.field8084 < class651.field9216) {
                    field4619[field4628++] = class168.field2103[class589.field8084++] & 0xFFFF;
                    return;
                }
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class589.field8084 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class348.field5096.method32(86, -117)) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class348.field5096.method32(82, -119)) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class348.field5096.method32(81, -114)) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class326.method2091(true, field4619[--field4628]);
                return;
            }
            if (arg0 == 5201) {
                field4619[field4628++] = class220.method1358(-83);
                return;
            }
            if (arg0 == 5205) {
                class426.method2457(121, field4619[--field4628], -1, false, -1);
                return;
            }
            if (arg0 == 5206) {
                int var85 = field4619[--field4628];
                class250 var86 = class561.method3146(var85 >> 14 & 0x3FFF, var85 & 0x3FFF);
                if (var86 == null) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = var86.field3377;
                return;
            }
            if (arg0 == 5207) {
                class250 var87 = class561.method3161(field4619[--field4628]);
                if (var87 != null && var87.field3368 != null) {
                    field4625[field4626++] = var87.field3368;
                    return;
                }
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4619[field4628++] = class327.field4754;
                field4619[field4628++] = class564.field7725;
                return;
            }
            if (arg0 == 5209) {
                field4619[field4628++] = class561.field7661 + class52.field677;
                field4619[field4628++] = class561.field7675 + class351.field5122;
                return;
            }
            if (arg0 == 5210) {
                int var88 = field4619[--field4628];
                class250 var89 = class561.method3161(var88);
                if (var89 == null) {
                    field4619[field4628++] = 0;
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = var89.field3367 >> 14 & 0x3FFF;
                field4619[field4628++] = var89.field3367 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var90 = field4619[--field4628];
                class250 var91 = class561.method3161(var90);
                if (var91 == null) {
                    field4619[field4628++] = 0;
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = var91.field3374 - var91.field3373;
                field4619[field4628++] = var91.field3361 - var91.field3370;
                return;
            }
            if (arg0 == 5212) {
                class588 var92 = class244.method1492(0);
                if (var92 == null) {
                    field4619[field4628++] = -1;
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = var92.field8076;
                int var93 = var92.field8078 << 28 | class561.field7661 + var92.field8075 << 14 | class561.field7675 + var92.field8074;
                field4619[field4628++] = var93;
                return;
            }
            if (arg0 == 5213) {
                class588 var94 = class273.method1669(0);
                if (var94 == null) {
                    field4619[field4628++] = -1;
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = var94.field8076;
                int var95 = var94.field8078 << 28 | class561.field7661 + var94.field8075 << 14 | class561.field7675 + var94.field8074;
                field4619[field4628++] = var95;
                return;
            }
            if (arg0 == 5214) {
                int var96 = field4619[--field4628];
                class250 var97 = class198.method1262((byte) 98);
                if (var97 != null) {
                    boolean var98 = var97.method1559(var96 >> 14 & 0x3FFF, 0, var96 >> 28 & 0x3, var96 & 0x3FFF, field4633);
                    if (var98) {
                        class20.method111(field4633[1], -1914918544, field4633[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4628 -= 2;
                int var99 = field4619[field4628];
                int var100 = field4619[field4628 + 1];
                class487 var101 = class561.method3149(var99 >> 14 & 0x3FFF, var99 & 0x3FFF);
                boolean var102 = false;
                for (class250 var103 = (class250) var101.method2715((byte) 120); var103 != null; var103 = (class250) var101.method2712(0)) {
                    if (var103.field3377 == var100) {
                        var102 = true;
                        break;
                    }
                }
                if (var102) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var104 = field4619[--field4628];
                class250 var105 = class561.method3161(var104);
                if (var105 == null) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = var105.field3372;
                return;
            }
            if (arg0 == 5220) {
                field4619[field4628++] = class143.field1820 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var106 = field4619[--field4628];
                class20.method111(var106 >> 14 & 0x3FFF, -1914918544, var106 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class250 var107 = class198.method1262((byte) 93);
                if (var107 != null) {
                    boolean var108 = var107.method1556(class561.field7675 + class351.field5122, field4633, 0, class561.field7661 + class52.field677);
                    if (var108) {
                        field4619[field4628++] = field4633[1];
                        field4619[field4628++] = field4633[2];
                        return;
                    }
                    field4619[field4628++] = -1;
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = -1;
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4628 -= 2;
                int var109 = field4619[field4628];
                int var110 = field4619[field4628 + 1];
                class426.method2457(124, var109, var110 & 0x3FFF, false, var110 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var111 = field4619[--field4628];
                class250 var112 = class198.method1262((byte) 100);
                if (var112 != null) {
                    boolean var113 = var112.method1559(var111 >> 14 & 0x3FFF, 0, var111 >> 28 & 0x3, var111 & 0x3FFF, field4633);
                    if (var113) {
                        field4619[field4628++] = field4633[1];
                        field4619[field4628++] = field4633[2];
                        return;
                    }
                    field4619[field4628++] = -1;
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = -1;
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var114 = field4619[--field4628];
                class250 var115 = class198.method1262((byte) 123);
                if (var115 != null) {
                    boolean var116 = var115.method1556(var114 & 0x3FFF, field4633, 0, var114 >> 14 & 0x3FFF);
                    if (var116) {
                        field4619[field4628++] = field4633[1];
                        field4619[field4628++] = field4633[2];
                        return;
                    }
                    field4619[field4628++] = -1;
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = -1;
                field4619[field4628++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class121.method742(122, field4619[--field4628]);
                return;
            }
            if (arg0 == 5227) {
                field4628 -= 2;
                int var117 = field4619[field4628];
                int var118 = field4619[field4628 + 1];
                class426.method2457(104, var117, var118 & 0x3FFF, true, var118 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class456.field6219 = field4619[--field4628] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4619[field4628++] = class456.field6219 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var119 = field4619[--field4628];
                class141.method973(155, var119);
                return;
            }
            if (arg0 == 5231) {
                field4628 -= 2;
                int var120 = field4619[field4628];
                boolean var121 = field4619[field4628 + 1] == 1;
                if (class45.field608 != null) {
                    class28 var122 = class45.field608.method2506(24, (long) var120);
                    if (var122 != null && !var121) {
                        var122.method175(30604);
                        return;
                    }
                    if (var122 == null && var121) {
                        class28 var123 = new class28();
                        class45.field608.method2504((long) var120, -41, var123);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var124 = field4619[--field4628];
                if (class45.field608 != null) {
                    class28 var125 = class45.field608.method2506(85, (long) var124);
                    field4619[field4628++] = var125 == null ? 0 : 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4628 -= 2;
                int var126 = field4619[field4628];
                boolean var127 = field4619[field4628 + 1] == 1;
                if (class147.field1855 != null) {
                    class28 var128 = class147.field1855.method2506(114, (long) var126);
                    if (var128 != null && !var127) {
                        var128.method175(30604);
                        return;
                    }
                    if (var128 == null && var127) {
                        class28 var129 = new class28();
                        class147.field1855.method2504((long) var126, -37, var129);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var130 = field4619[--field4628];
                if (class147.field1855 != null) {
                    class28 var131 = class147.field1855.method2506(117, (long) var130);
                    field4619[field4628++] = var131 == null ? 0 : 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4619[field4628++] = class561.field7647 == null ? -1 : class561.field7647.field3377;
                return;
            }
            if (arg0 == 5236) {
                field4628 -= 2;
                int var132 = field4619[field4628];
                int var133 = field4619[field4628 + 1];
                int var134 = var133 >> 14 & 0x3FFF;
                int var135 = var133 & 0x3FFF;
                int var136 = class193.method1233(var132, 985, var135, var134);
                if (var136 < 0) {
                    field4619[field4628++] = -1;
                    return;
                }
                field4619[field4628++] = var136;
                return;
            }
            if (arg0 == 5237) {
                class429.method2473(false);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4628 -= 2;
                int var137 = field4619[field4628];
                int var138 = field4619[field4628 + 1];
                class587.method3284(var138, 3954, var137, 3, false);
                field4619[field4628++] = class463.field6333 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class463.field6333 != null) {
                    class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
                }
                return;
            }
            if (arg0 == 5302) {
                class556[] var139 = class410.method2406((byte) -122);
                field4619[field4628++] = var139.length;
                return;
            }
            if (arg0 == 5303) {
                int var140 = field4619[--field4628];
                class556[] var141 = class410.method2406((byte) -76);
                field4619[field4628++] = var141[var140].field7596;
                field4619[field4628++] = var141[var140].field7592;
                return;
            }
            if (arg0 == 5305) {
                int var142 = class72.field935.field6524;
                int var143 = class72.field935.field6539;
                int var144 = -1;
                class556[] var145 = class410.method2406((byte) -89);
                for (int var146 = 0; var146 < var145.length; var146++) {
                    class556 var147 = var145[var146];
                    if (var147.field7596 == var142 && var147.field7592 == var143) {
                        var144 = var146;
                        break;
                    }
                }
                field4619[field4628++] = var144;
                return;
            }
            if (arg0 == 5306) {
                field4619[field4628++] = class42.method252(-128);
                return;
            }
            if (arg0 == 5307) {
                int var148 = field4619[--field4628];
                if (var148 >= 1 && var148 <= 2) {
                    class587.method3284(-1, 3954, -1, var148, false);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4619[field4628++] = class72.field935.field6507;
                return;
            }
            if (arg0 == 5309) {
                int var149 = field4619[--field4628];
                if (var149 >= 1 && var149 <= 2) {
                    class72.field935.field6507 = var149;
                    class72.field935.method1856(0, class495.field6687);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4626 -= 2;
                String var150 = field4625[field4626];
                String var151 = field4625[field4626 + 1];
                int var152 = field4619[--field4628];
                field4614++;
                class389.method2326((byte) 118, class350.field5120);
                class253.field3491.method951((byte) -82, class500.method2820(1, var150) + class500.method2820(1, var151) + 1);
                class253.field3491.method905(var150, 94);
                class253.field3491.method905(var151, 16);
                class253.field3491.method951((byte) -82, var152);
                return;
            }
            if (arg0 == 5401) {
                field4628 -= 2;
                class490.field6605[field4619[field4628]] = (short) class349.method2183((byte) 125, field4619[field4628 + 1]);
                class237.field3088.method1355((byte) -12);
                class237.field3088.method1351(0);
                class318.field4640.method3390((byte) -98);
                class578.method3251((byte) 109);
                return;
            }
            if (arg0 == 5405) {
                field4628 -= 2;
                int var153 = field4619[field4628];
                int var154 = field4619[field4628 + 1];
                if (var153 >= 0 && var153 < 2) {
                    class598.field8178[var153] = new int[var154 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4628 -= 7;
                int var155 = field4619[field4628];
                int var156 = field4619[field4628 + 1] << 1;
                int var157 = field4619[field4628 + 2];
                int var158 = field4619[field4628 + 3];
                int var159 = field4619[field4628 + 4];
                int var160 = field4619[field4628 + 5];
                int var161 = field4619[field4628 + 6];
                if (var155 >= 0 && var155 < 2 && class598.field8178[var155] != null && var156 >= 0 && var156 < class598.field8178[var155].length) {
                    class598.field8178[var155][var156] = new int[] { (var157 >> 14 & 0x3FFF) << 9, var158 << 2, (var157 & 0x3FFF) << 9, var161 };
                    class598.field8178[var155][var156 + 1] = new int[] { (var159 >> 14 & 0x3FFF) << 9, var160 << 2, (var159 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var162 = class598.field8178[field4619[--field4628]].length >> 1;
                field4619[field4628++] = var162;
                return;
            }
            if (arg0 == 5411) {
                if (class463.field6333 != null) {
                    class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
                }
                if (class250.field3376 != null) {
                    class72.method426(60);
                    System.exit(0);
                    return;
                }
                String var163 = class50.field667 == null ? class210.method1315(0) : class50.field667;
                class509.method2880(class495.field6687, class161.field2038 == 1, var163, false, 55);
                return;
            }
            if (arg0 == 5419) {
                String var164 = "";
                if (class150.field1893 != null) {
                    if (class150.field1893.field3772 == null) {
                        var164 = class103.method553(class150.field1893.field3775, (byte) 7);
                    } else {
                        var164 = (String) class150.field1893.field3772;
                    }
                }
                field4625[field4626++] = var164;
                return;
            }
            if (arg0 == 5420) {
                field4619[field4628++] = class495.field6687.field1356 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class463.field6333 != null) {
                    class587.method3284(-1, 3954, -1, class72.field935.field6507, false);
                }
                String var165 = field4625[--field4626];
                boolean var166 = field4619[--field4628] == 1;
                String var167 = class210.method1315(0) + var165;
                class509.method2880(class495.field6687, class161.field2038 == 1, var167, var166, 86);
                return;
            }
            if (arg0 == 5422) {
                field4626 -= 2;
                String var168 = field4625[field4626];
                String var169 = field4625[field4626 + 1];
                int var170 = field4619[--field4628];
                if (var168.length() > 0) {
                    if (class676.field9595 == null) {
                        class676.field9595 = new String[class129.field1642[class33.field322.field6547]];
                    }
                    class676.field9595[var170] = var168;
                }
                if (var169.length() > 0) {
                    if (class125.field1606 == null) {
                        class125.field1606 = new String[class129.field1642[class33.field322.field6547]];
                    }
                    class125.field1606[var170] = var169;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4625[--field4626]);
                return;
            }
            if (arg0 == 5424) {
                field4628 -= 11;
                class180.field2246 = field4619[field4628];
                class125.field1605 = field4619[field4628 + 1];
                class658.field9282 = field4619[field4628 + 2];
                class552.field7548 = field4619[field4628 + 3];
                class689.field9735 = field4619[field4628 + 4];
                class620.field8424 = field4619[field4628 + 5];
                class525.field7269 = field4619[field4628 + 6];
                class461.field6286 = field4619[field4628 + 7];
                class59.field834 = field4619[field4628 + 8];
                class580.field8006 = field4619[field4628 + 9];
                class132.field1682 = field4619[field4628 + 10];
                class39.field510.method1086((byte) 113, class689.field9735);
                class39.field510.method1086((byte) 127, class620.field8424);
                class39.field510.method1086((byte) 125, class525.field7269);
                class39.field510.method1086((byte) 118, class461.field6286);
                class39.field510.method1086((byte) 122, class59.field834);
                class485.field6564 = null;
                class548.field7494 = null;
                class46.field629 = null;
                class56.field785 = null;
                class486.field6568 = null;
                class211.field2758 = null;
                class581.field8013 = null;
                class539.field7388 = null;
                class565.field7842 = true;
                return;
            }
            if (arg0 == 5425) {
                class270.method1656((byte) 89);
                class565.field7842 = false;
                return;
            }
            if (arg0 == 5426) {
                field4628 -= 2;
                class141.field1802 = field4619[field4628];
                class30.field300 = field4619[field4628 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4628 -= 2;
                class192.field2490 = field4619[field4628 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4628 -= 2;
                int var171 = field4619[field4628];
                int var172 = field4619[field4628 + 1];
                field4619[field4628++] = class88.method492(var172, true, var171) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class401.method2363(false, field4625[--field4626], -70, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class302.method1821(class372.field5359, 10049, "accountcreated");
                    return;
                } catch (Throwable var300) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class302.method1821(class372.field5359, 10049, "accountcreatestarted");
                    return;
                } catch (Throwable var301) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4628 -= 4;
                int var173 = field4619[field4628];
                int var174 = field4619[field4628 + 1];
                int var175 = field4619[field4628 + 2];
                int var176 = field4619[field4628 + 3];
                class442.method2533(var176, var175, var174 << 2, (var173 & 0x3FFF) - class186.field2280, (var173 >> 14 & 0x3FFF) - class253.field3490, false, -53);
                return;
            }
            if (arg0 == 5501) {
                field4628 -= 4;
                int var177 = field4619[field4628];
                int var178 = field4619[field4628 + 1];
                int var179 = field4619[field4628 + 2];
                int var180 = field4619[field4628 + 3];
                class363.method2231(var180, (var177 >> 14 & 0x3FFF) - class253.field3490, (var177 & 0x3FFF) - class186.field2280, var179, var178 << 2, -128);
                return;
            }
            if (arg0 == 5502) {
                field4628 -= 6;
                int var181 = field4619[field4628];
                if (var181 >= 2) {
                    throw new RuntimeException();
                }
                class243.field3278 = var181;
                int var182 = field4619[field4628 + 1];
                if (var182 + 1 >= class598.field8178[class243.field3278].length >> 1) {
                    throw new RuntimeException();
                }
                class571.field7911 = var182;
                class190.field2481 = 0;
                class549.field7512 = field4619[field4628 + 2];
                class109.field1319 = field4619[field4628 + 3];
                int var183 = field4619[field4628 + 4];
                if (var183 >= 2) {
                    throw new RuntimeException();
                }
                class227.field2966 = var183;
                int var184 = field4619[field4628 + 5];
                if (var184 + 1 >= class598.field8178[class227.field2966].length >> 1) {
                    throw new RuntimeException();
                }
                class606.field8279 = var184;
                class42.field546 = 3;
                return;
            }
            if (arg0 == 5503) {
                class401.method2364(26061);
                return;
            }
            if (arg0 == 5504) {
                field4628 -= 2;
                class417.method2423(126, field4619[field4628], field4619[field4628 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field4619[field4628++] = (int) class283.field3826 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4619[field4628++] = (int) class620.field8432 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class102.method552((byte) 18);
                return;
            }
            if (arg0 == 5508) {
                class533.method3020(1);
                return;
            }
            if (arg0 == 5509) {
                class442.method2538((byte) 60);
                return;
            }
            if (arg0 == 5510) {
                class223.method1365(-86);
                return;
            }
            if (arg0 == 5511) {
                int var185 = field4619[--field4628];
                int var186 = var185 >> 14 & 0x3FFF;
                int var187 = var185 & 0x3FFF;
                int var188 = var186 - class253.field3490;
                if (var188 < 0) {
                    var188 = 0;
                } else if (var188 >= class588.field8082) {
                    var188 = class588.field8082;
                }
                int var189 = var187 - class186.field2280;
                if (var189 < 0) {
                    var189 = 0;
                } else if (var189 >= class12.field113) {
                    var189 = class12.field113;
                }
                class294.field3939 = (var188 << 9) + 256;
                class86.field1068 = (var189 << 9) + 256;
                class42.field546 = 4;
                return;
            }
            if (arg0 == 5512) {
                class177.method1166(0);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4626 -= 2;
                String var190 = field4625[field4626];
                String var191 = field4625[field4626 + 1];
                int var192 = field4619[--field4628];
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    class82.field1022 = var190;
                    class67.field885 = var191;
                    class644.field9129 = var192;
                    class676.method3739(-22149, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class184.method1186(-73);
                return;
            }
            if (arg0 == 5602) {
                if (class243.field3275 == 0) {
                    class309.field4145 = -2;
                    class309.field4139 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4628 -= 4;
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    class218.method1343(-125, field4619[field4628 + 1], field4619[field4628 + 2], field4619[field4628 + 3], field4619[field4628]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4626--;
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    class623.method3407(class522.method2981(field4625[field4626], 28484), 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4626 -= 2;
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    class21.method121((byte) 104, class522.method2981(field4625[field4626], 28484), field4625[field4626 + 1], false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class335.field4936 == 0) {
                    class235.field3071 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4619[field4628++] = class309.field4139;
                return;
            }
            if (arg0 == 5608) {
                field4619[field4628++] = class222.field2874;
                return;
            }
            if (arg0 == 5609) {
                field4619[field4628++] = class235.field3071;
                return;
            }
            if (arg0 == 5610) {
                for (int var193 = 0; var193 < 5; var193++) {
                    field4625[field4626++] = class168.field2102.length > var193 ? class626.method3420(21, class168.field2102[var193]) : "";
                }
                class168.field2102 = null;
                return;
            }
            if (arg0 == 5611) {
                field4619[field4628++] = class477.field6444;
                return;
            }
            if (arg0 == 5612) {
                int var194 = field4619[--field4628];
                if (class476.field6436 != 7) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    if (class80.field1014 != null) {
                        class80.field1014.method971(3289650);
                        class80.field1014 = null;
                    }
                    class644.field9129 = var194;
                    class676.method3739(-22149, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field4619[field4628++] = class309.field4139;
                return;
            }
            if (arg0 == 5615) {
                field4626 -= 2;
                String var195 = field4625[field4626];
                String var196 = field4625[field4626 + 1];
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    if (class80.field1014 != null) {
                        class80.field1014.method971(3289650);
                        class80.field1014 = null;
                    }
                    class82.field1022 = var195;
                    class67.field885 = var196;
                    class676.method3739(-22149, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class511.method2893(1000000, false);
                return;
            }
            if (arg0 == 5617) {
                field4619[field4628++] = class309.field4145;
                return;
            }
            if (arg0 == 5618) {
                int var197 = field4619[--field4628];
                class199.method1263(false, true, var197);
                return;
            }
            if (arg0 == 5619) {
                int var198 = field4619[--field4628];
                class199.method1263(true, true, var198);
                return;
            }
            if (arg0 == 5620) {
                class367.method2262(false);
                if (class438.field6042 != "" && class438.field6042 != "") {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field4626 -= 2;
                if (class476.field6436 != 3) {
                    return;
                }
                if (class243.field3275 == 0 && class335.field4936 == 0) {
                    class21.method121((byte) 104, class522.method2981(field4625[field4626], 28484), field4625[field4626 + 1], true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class280 var199 = class495.field6687.method625(false, -25857, "3");
                while (var199.field3773 == 0) {
                    class660.method3668(-1, 1L);
                }
                if (var199.field3773 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class428 var200 = (class428) var199.field3772;
                if (var200.method2469((byte) 26).exists()) {
                    class138 var201 = new class138(50);
                    try {
                        var200.method2465(var201.field1712, 0, -20626, 50);
                    } catch (IOException var303) {
                    }
                }
                try {
                    var200.method2467((byte) 106);
                    return;
                } catch (Exception var302) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class267.field3667 != null) {
                    field4619[field4628++] = 1;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field4619[field4628++] = (int) (class636.field8670 >> 32);
                field4619[field4628++] = (int) (class636.field8670 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var202 = field4619[--field4628];
                if (var202 < 1) {
                    var202 = 1;
                }
                if (var202 > 4) {
                    var202 = 4;
                }
                class72.field935.field6533 = var202;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6002) {
                class72.field935.method1865(field4619[--field4628] == 1, (byte) 89);
                class70.method413(11);
                class430.method2478((byte) -124);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6003) {
                class72.field935.field6498 = field4619[--field4628] == 1;
                class430.method2478((byte) -124);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6005) {
                class72.field935.field6500 = field4619[--field4628] == 1;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6006) {
                class72.field935.field6509 = field4619[--field4628] == 1;
                class9.field103.method1897(!class72.field935.field6509);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6007) {
                class72.field935.field6503 = field4619[--field4628];
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6008) {
                class72.field935.field6531 = field4619[--field4628] == 1;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6009) {
                class72.field935.field6522 = field4619[--field4628] == 1;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6010) {
                class72.field935.field6536 = field4619[--field4628] == 1;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6011) {
                int var203 = field4619[--field4628];
                if (var203 < 0 || var203 > 2) {
                    var203 = 0;
                }
                class72.field935.method2692(class161.field2038, (byte) -100, var203);
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6012) {
                class72.field935.method2689((byte) -88, field4619[--field4628] == 1, class161.field2038);
                class107.method572(123);
                class399.method2358((byte) 88);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6014) {
                class72.field935.field6491 = field4619[--field4628] == 1;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6015) {
                class72.field935.field6510 = field4619[--field4628] == 1;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6016) {
                int var204 = field4619[--field4628];
                if (var204 < 0 || var204 > 2) {
                    var204 = 0;
                }
                class72.field935.field6517 = var204;
                class564.method3180(class161.field2038, (byte) 38);
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6017) {
                class72.field935.field6494 = field4619[--field4628] == 1;
                class225.method1378((byte) -127);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6018) {
                int var205 = field4619[--field4628];
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 127) {
                    var205 = 127;
                }
                class72.field935.field6512 = var205;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6019) {
                int var206 = field4619[--field4628];
                if (var206 < 0) {
                    var206 = 0;
                }
                if (var206 > 255) {
                    var206 = 255;
                }
                if (class72.field935.field6528 != var206) {
                    if (class72.field935.field6528 == 0 && class133.field1688 != -1) {
                        class21.method116(class328.field4812, var206, 0, class133.field1688, false, 8956);
                        class677.field9606 = false;
                    } else if (var206 == 0) {
                        class201.method1270(-115);
                        class677.field9606 = false;
                    } else {
                        class350.method2190(var206, -1);
                    }
                    class72.field935.field6528 = var206;
                }
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6020) {
                int var207 = field4619[--field4628];
                if (var207 < 0) {
                    var207 = 0;
                }
                if (var207 > 127) {
                    var207 = 127;
                }
                class72.field935.field6526 = var207;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6021) {
                class72.field935.field4154 = field4619[--field4628] == 1;
                class430.method2478((byte) -124);
                return;
            }
            if (arg0 == 6023) {
                int var208 = field4619[--field4628];
                boolean var209 = false;
                if (var208 < 0) {
                    var208 = 0;
                }
                if (var208 > 2) {
                    var208 = 2;
                }
                if (class77.field969 < 96) {
                    var208 = 0;
                    var209 = true;
                }
                class635.method3462(var208, true);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                field4619[field4628++] = var209 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var210 = field4619[--field4628];
                if (var210 < 0 || var210 > 2) {
                    var210 = 0;
                }
                class72.field935.field6513 = var210;
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6025) {
                int var211 = field4619[--field4628];
                if (var211 < 0 || var211 > class86.method479(class77.field969, -32769)) {
                    var211 = 0;
                }
                class72.field935.field6529 = var211;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6027) {
                int var212 = field4619[--field4628];
                if (var212 < 0 || var212 > 1) {
                    var212 = 0;
                }
                class614.method3376(var212 == 1, (byte) -92);
                return;
            }
            if (arg0 == 6028) {
                class72.field935.field6495 = field4619[--field4628] != 0;
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6029) {
                class72.field935.field6503 = field4619[--field4628];
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6030) {
                class72.field935.field6525 = field4619[--field4628] != 0;
                class72.field935.method1856(0, class495.field6687);
                class70.method413(11);
                return;
            }
            if (arg0 == 6031) {
                int var213 = field4619[--field4628];
                if (var213 < 0 || var213 > 5) {
                    var213 = 2;
                }
                class564.method3180(var213, (byte) 29);
                return;
            }
            if (arg0 == 6032) {
                int var214 = field4619[--field4628];
                if (var214 < 0 || var214 > 5) {
                    var214 = 2;
                }
                class72.field935.field6511 = var214;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6033) {
                int var215 = field4619[--field4628];
                if (var215 < 0 || var215 > 4) {
                    var215 = 2;
                }
                class72.field935.field6518 = var215;
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6034) {
                class72.field935.field6499 = field4619[--field4628] == 1;
                class72.field935.method1856(0, class495.field6687);
                class107.method572(126);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6035) {
                class72.field935.field4157 = field4619[--field4628] == 1;
                class70.method413(11);
                class430.method2478((byte) -124);
                return;
            }
            if (arg0 == 6036) {
                int var216 = field4619[--field4628];
                if (var216 < 0 || var216 > 2) {
                    var216 = 0;
                }
                class72.field935.method1858(false, var216);
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6037) {
                int var217 = field4619[--field4628];
                if (var217 < 0) {
                    var217 = 0;
                }
                if (var217 > 127) {
                    var217 = 127;
                }
                class72.field935.field6514 = var217;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6038) {
                int var218 = field4619[--field4628];
                if (var218 < 0) {
                    var218 = 0;
                }
                if (var218 > 255) {
                    var218 = 255;
                }
                if (class72.field935.field6523 != var218 && class425.field5918 == class133.field1688) {
                    if (class72.field935.field6523 == 0) {
                        class21.method116(class328.field4812, var218, 0, class133.field1688, false, 8956);
                        class677.field9606 = false;
                    } else if (var218 == 0) {
                        class201.method1270(-103);
                        class677.field9606 = false;
                    } else {
                        class350.method2190(var218, -1);
                    }
                }
                class72.field935.field6523 = var218;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 6039) {
                int var219 = field4619[--field4628];
                if (var219 > 255 || var219 < 0) {
                    var219 = 0;
                }
                if (class72.field935.field6530 != var219) {
                    class72.field935.field6530 = var219;
                    class72.field935.method1856(0, class495.field6687);
                    class665.field9426 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4619[field4628++] = class72.field935.field6533;
                return;
            }
            if (arg0 == 6102) {
                field4619[field4628++] = class72.field935.method1857(class161.field2038, true) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4619[field4628++] = class72.field935.field6498 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4619[field4628++] = class72.field935.field6500 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4619[field4628++] = class72.field935.field6509 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4619[field4628++] = class72.field935.field6503;
                return;
            }
            if (arg0 == 6108) {
                field4619[field4628++] = class72.field935.field6531 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4619[field4628++] = class72.field935.field6522 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4619[field4628++] = class72.field935.field6536 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4619[field4628++] = class72.field935.method2693(class161.field2038, (byte) 91);
                return;
            }
            if (arg0 == 6112) {
                field4619[field4628++] = class72.field935.method2695(false, class161.field2038) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4619[field4628++] = class72.field935.field6491 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4619[field4628++] = class72.field935.field6510 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4619[field4628++] = class72.field935.field6517;
                return;
            }
            if (arg0 == 6117) {
                field4619[field4628++] = class72.field935.field6494 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4619[field4628++] = class72.field935.field6512;
                return;
            }
            if (arg0 == 6119) {
                field4619[field4628++] = class72.field935.field6528;
                return;
            }
            if (arg0 == 6120) {
                field4619[field4628++] = class72.field935.field6526;
                return;
            }
            if (arg0 == 6121) {
                field4619[field4628++] = class9.field103.method1933() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4619[field4628++] = class330.method2116(-1);
                return;
            }
            if (arg0 == 6124) {
                field4619[field4628++] = class72.field935.field6513;
                return;
            }
            if (arg0 == 6125) {
                field4619[field4628++] = class72.field935.field6529;
                return;
            }
            if (arg0 == 6126) {
                field4619[field4628++] = class9.field103.method1973() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4619[field4628++] = class72.field935.field6534 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4619[field4628++] = class72.field935.field6495 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4619[field4628++] = class72.field935.field6503;
                return;
            }
            if (arg0 == 6130) {
                field4619[field4628++] = class72.field935.field6525 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4619[field4628++] = class161.field2038;
                return;
            }
            if (arg0 == 6132) {
                field4619[field4628++] = class72.field935.field6511;
                return;
            }
            if (arg0 == 6133) {
                field4619[field4628++] = class495.field6687.field1356 && !class495.field6687.field1357 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4619[field4628++] = class86.method479(class77.field969, -32769);
                return;
            }
            if (arg0 == 6135) {
                field4619[field4628++] = class72.field935.field6518;
                return;
            }
            if (arg0 == 6136) {
                field4619[field4628++] = class72.field935.field6499 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var220 = true;
                try {
                    var220 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var304) {
                }
                field4619[field4628++] = var220 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field4619[field4628++] = class669.method3709(class161.field2038, -21664, 200);
                return;
            }
            if (arg0 == 6139) {
                field4619[field4628++] = class72.field935.method1852(class161.field2038, true);
                return;
            }
            if (arg0 == 6140) {
                byte var221 = 0;
                if (class662.method3675(class161.field2038, -5) && class77.field969 < 96) {
                    var221 = 1;
                }
                field4619[field4628++] = var221;
                return;
            }
            if (arg0 == 6141) {
                if (class77.field969 < 96) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field4619[field4628++] = class72.field935.field6514;
                return;
            }
            if (arg0 == 6143) {
                field4619[field4628++] = class72.field935.field6523;
                return;
            }
            if (arg0 == 6144) {
                field4619[field4628++] = class73.field944 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field4619[field4628++] = class72.field935.field6530;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4628 -= 2;
                class230.field3012 = (short) field4619[field4628];
                if (class230.field3012 <= 0) {
                    class230.field3012 = 256;
                }
                class240.field3150 = (short) field4619[field4628 + 1];
                if (class240.field3150 <= 0) {
                    class240.field3150 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4628 -= 2;
                class643.field9115 = (short) field4619[field4628];
                if (class643.field9115 <= 0) {
                    class643.field9115 = 256;
                }
                class530.field7330 = (short) field4619[field4628 + 1];
                if (class530.field7330 <= 0) {
                    class530.field7330 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4628 -= 4;
                class641.field8862 = (short) field4619[field4628];
                if (class641.field8862 <= 0) {
                    class641.field8862 = 1;
                }
                class316.field4601 = (short) field4619[field4628 + 1];
                if (class316.field4601 <= 0) {
                    class316.field4601 = 32767;
                } else if (class316.field4601 < class641.field8862) {
                    class316.field4601 = class641.field8862;
                }
                class207.field2705 = (short) field4619[field4628 + 2];
                if (class207.field2705 <= 0) {
                    class207.field2705 = 1;
                }
                class502.field6773 = (short) field4619[field4628 + 3];
                if (class502.field6773 <= 0) {
                    class502.field6773 = 32767;
                    return;
                }
                if (class502.field6773 < class207.field2705) {
                    class502.field6773 = class207.field2705;
                }
                return;
            }
            if (arg0 == 6203) {
                class169.method1128(false, 0, 0, class166.field2077.field2438, (byte) -112, class166.field2077.field2371);
                field4619[field4628++] = class313.field4507;
                field4619[field4628++] = class360.field5195;
                return;
            }
            if (arg0 == 6204) {
                field4619[field4628++] = class643.field9115;
                field4619[field4628++] = class530.field7330;
                return;
            }
            if (arg0 == 6205) {
                field4619[field4628++] = class230.field3012;
                field4619[field4628++] = class240.field3150;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4619[field4628++] = (int) (class669.method3713(0) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4619[field4628++] = (int) (class669.method3713(0) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4628 -= 3;
                int var222 = field4619[field4628];
                int var223 = field4619[field4628 + 1];
                int var224 = field4619[field4628 + 2];
                field4621.clear();
                field4621.set(11, 12);
                field4621.set(var224, var223, var222);
                int var225 = (int) (field4621.getTime().getTime() / 86400000L) - 11745;
                if (var224 < 1970) {
                    var225--;
                }
                field4619[field4628++] = var225;
                return;
            }
            if (arg0 == 6303) {
                field4621.clear();
                field4621.setTime(new Date(class669.method3713(0)));
                field4619[field4628++] = field4621.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var226 = field4619[--field4628];
                boolean var227 = true;
                if (var226 < 0) {
                    var227 = (var226 + 1) % 4 == 0;
                } else if (var226 < 1582) {
                    var227 = var226 % 4 == 0;
                } else if (var226 % 4 != 0) {
                    var227 = false;
                } else if (var226 % 100 != 0) {
                    var227 = true;
                } else if (var226 % 400 != 0) {
                    var227 = false;
                }
                field4619[field4628++] = var227 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4619[field4628++] = class571.method3225((byte) 41) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4619[field4628++] = class225.method1375(-1707434588) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class476.field6436 == 7 && class243.field3275 == 0 && class335.field4936 == 0) {
                    if (class562.field7692) {
                        field4619[field4628++] = 0;
                        return;
                    }
                    if (class103.field1256 > class669.method3713(0) - 1000L) {
                        field4619[field4628++] = 1;
                        return;
                    }
                    class562.field7692 = true;
                    class389.method2326((byte) 118, class669.field9510);
                    class253.field3491.method906(-1, class373.field5380);
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class40 var228 = class570.method3219(65536);
                if (var228 != null) {
                    field4619[field4628++] = var228.field528;
                    field4619[field4628++] = var228.field7581;
                    field4625[field4626++] = var228.field527;
                    class566 var229 = var228.method246(1);
                    field4619[field4628++] = var229.field7845;
                    field4625[field4626++] = var229.field7846;
                    field4619[field4628++] = var228.field7583;
                    field4619[field4628++] = var228.field532;
                    field4625[field4626++] = var228.field533;
                    return;
                }
                field4619[field4628++] = -1;
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 6502) {
                class40 var230 = class224.method1369(10);
                if (var230 != null) {
                    field4619[field4628++] = var230.field528;
                    field4619[field4628++] = var230.field7581;
                    field4625[field4626++] = var230.field527;
                    class566 var231 = var230.method246(1);
                    field4619[field4628++] = var231.field7845;
                    field4625[field4626++] = var231.field7846;
                    field4619[field4628++] = var230.field7583;
                    field4619[field4628++] = var230.field532;
                    field4625[field4626++] = var230.field533;
                    return;
                }
                field4619[field4628++] = -1;
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var232 = field4619[--field4628];
                String var233 = field4625[--field4626];
                if (class476.field6436 == 7 && class243.field3275 == 0 && class335.field4936 == 0) {
                    field4619[field4628++] = class78.method442(40000, var232, var233) ? 1 : 0;
                    return;
                }
                field4619[field4628++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class72.field935.field6519 = field4619[--field4628];
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6505) {
                field4619[field4628++] = class72.field935.field6519;
                return;
            }
            if (arg0 == 6506) {
                int var234 = field4619[--field4628];
                class40 var235 = class140.method967(var234, (byte) 67);
                if (var235 != null) {
                    field4619[field4628++] = var235.field7581;
                    field4625[field4626++] = var235.field527;
                    class566 var236 = var235.method246(1);
                    field4619[field4628++] = var236.field7845;
                    field4625[field4626++] = var236.field7846;
                    field4619[field4628++] = var235.field7583;
                    field4619[field4628++] = var235.field532;
                    field4625[field4626++] = var235.field533;
                    return;
                }
                field4619[field4628++] = -1;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                field4619[field4628++] = 0;
                field4619[field4628++] = 0;
                field4625[field4626++] = "";
                return;
            }
            if (arg0 == 6507) {
                field4628 -= 4;
                int var237 = field4619[field4628];
                boolean var238 = field4619[field4628 + 1] == 1;
                int var239 = field4619[field4628 + 2];
                boolean var240 = field4619[field4628 + 3] == 1;
                class235.method1458(var239, var237, var240, var238, -116);
                return;
            }
            if (arg0 == 6508) {
                class245.method1510(-108);
                return;
            }
            if (arg0 == 6509) {
                if (class476.field6436 != 7) {
                    return;
                }
                class494.field6686 = field4619[--field4628] == 1;
                return;
            }
            if (arg0 == 6510) {
                field4619[field4628++] = class201.field2642;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class72.field935.field6535 = field4619[--field4628] == 1;
                class72.field935.method1856(0, class495.field6687);
                return;
            }
            if (arg0 == 6601) {
                field4619[field4628++] = class72.field935.field6535 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class343.field5048 == class149.field1880) {
            if (arg0 == 6700) {
                int var241 = class54.field742.method2505(-5643);
                if (class316.field4599 != -1) {
                    var241++;
                }
                field4619[field4628++] = var241;
                return;
            }
            if (arg0 == 6701) {
                int var242 = field4619[--field4628];
                if (class316.field4599 != -1) {
                    if (var242 == 0) {
                        field4619[field4628++] = class316.field4599;
                        return;
                    }
                    var242--;
                }
                class524 var243 = (class524) class54.field742.method2499(-44);
                while (var242-- > 0) {
                    var243 = (class524) class54.field742.method2503(0);
                }
                field4619[field4628++] = var243.field7256;
                return;
            }
            if (arg0 == 6702) {
                int var244 = field4619[--field4628];
                if (class328.field4799[var244] == null) {
                    field4625[field4626++] = "";
                    return;
                }
                String var245 = class328.field4799[var244][0].field2306;
                if (var245 == null) {
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = var245.substring(0, var245.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var246 = field4619[--field4628];
                if (class328.field4799[var246] == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = class328.field4799[var246].length;
                return;
            }
            if (arg0 == 6704) {
                field4628 -= 2;
                int var247 = field4619[field4628];
                int var248 = field4619[field4628 + 1];
                if (class328.field4799[var247] == null) {
                    field4625[field4626++] = "";
                    return;
                }
                String var249 = class328.field4799[var247][var248].field2306;
                if (var249 == null) {
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = var249;
                return;
            }
            if (arg0 == 6705) {
                field4628 -= 2;
                int var250 = field4619[field4628];
                int var251 = field4619[field4628 + 1];
                if (class328.field4799[var250] == null) {
                    field4619[field4628++] = 0;
                    return;
                }
                field4619[field4628++] = class328.field4799[var250][var251].field2365;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4628 -= 3;
                int var252 = field4619[field4628];
                int var253 = field4619[field4628 + 1];
                int var254 = field4619[field4628 + 2];
                class296.method1771(1, 2, var254, "", var252 << 16 | var253);
                return;
            }
            if (arg0 == 6708) {
                field4628 -= 3;
                int var255 = field4619[field4628];
                int var256 = field4619[field4628 + 1];
                int var257 = field4619[field4628 + 2];
                class296.method1771(2, 2, var257, "", var255 << 16 | var256);
                return;
            }
            if (arg0 == 6709) {
                field4628 -= 3;
                int var258 = field4619[field4628];
                int var259 = field4619[field4628 + 1];
                int var260 = field4619[field4628 + 2];
                class296.method1771(3, 2, var260, "", var258 << 16 | var259);
                return;
            }
            if (arg0 == 6710) {
                field4628 -= 3;
                int var261 = field4619[field4628];
                int var262 = field4619[field4628 + 1];
                int var263 = field4619[field4628 + 2];
                class296.method1771(4, 2, var263, "", var261 << 16 | var262);
                return;
            }
            if (arg0 == 6711) {
                field4628 -= 3;
                int var264 = field4619[field4628];
                int var265 = field4619[field4628 + 1];
                int var266 = field4619[field4628 + 2];
                class296.method1771(5, 2, var266, "", var264 << 16 | var265);
                return;
            }
            if (arg0 == 6712) {
                field4628 -= 3;
                int var267 = field4619[field4628];
                int var268 = field4619[field4628 + 1];
                int var269 = field4619[field4628 + 2];
                class296.method1771(6, 2, var269, "", var267 << 16 | var268);
                return;
            }
            if (arg0 == 6713) {
                field4628 -= 3;
                int var270 = field4619[field4628];
                int var271 = field4619[field4628 + 1];
                int var272 = field4619[field4628 + 2];
                class296.method1771(7, 2, var272, "", var270 << 16 | var271);
                return;
            }
            if (arg0 == 6714) {
                field4628 -= 3;
                int var273 = field4619[field4628];
                int var274 = field4619[field4628 + 1];
                int var275 = field4619[field4628 + 2];
                class296.method1771(8, 2, var275, "", var273 << 16 | var274);
                return;
            }
            if (arg0 == 6715) {
                field4628 -= 3;
                int var276 = field4619[field4628];
                int var277 = field4619[field4628 + 1];
                int var278 = field4619[field4628 + 2];
                class296.method1771(9, 2, var278, "", var276 << 16 | var277);
                return;
            }
            if (arg0 == 6716) {
                field4628 -= 3;
                int var279 = field4619[field4628];
                int var280 = field4619[field4628 + 1];
                int var281 = field4619[field4628 + 2];
                class296.method1771(10, 2, var281, "", var279 << 16 | var280);
                return;
            }
            if (arg0 == 6717) {
                field4628 -= 3;
                int var282 = field4619[field4628];
                int var283 = field4619[field4628 + 1];
                int var284 = field4619[field4628 + 2];
                class188 var285 = class630.method3443(var282 << 16 | var283, -1, var284);
                class497.method2800((byte) -62);
                class266 var286 = client.method1411(var285);
                class208.method1301(var285, var286.field3647, (byte) 94, var286.method1645(false));
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var287 = field4619[--field4628];
                class679 var288 = class665.field9460.method218(var287, (byte) 13);
                if (var288.field9633 == null) {
                    field4625[field4626++] = "";
                    return;
                }
                field4625[field4626++] = var288.field9633;
                return;
            }
            if (arg0 == 6801) {
                int var289 = field4619[--field4628];
                class679 var290 = class665.field9460.method218(var289, (byte) 13);
                field4619[field4628++] = var290.field9626;
                return;
            }
            if (arg0 == 6802) {
                int var291 = field4619[--field4628];
                class679 var292 = class665.field9460.method218(var291, (byte) 13);
                field4619[field4628++] = var292.field9643;
                return;
            }
            if (arg0 == 6803) {
                int var293 = field4619[--field4628];
                class679 var294 = class665.field9460.method218(var293, (byte) 13);
                field4619[field4628++] = var294.field9630;
                return;
            }
            if (arg0 == 6804) {
                field4628 -= 2;
                int var295 = field4619[field4628];
                int var296 = field4619[field4628 + 1];
                class579 var297 = class191.field2486.method1256(var296, -3934);
                if (var297.method3259(-120)) {
                    field4625[field4626++] = class665.field9460.method218(var295, (byte) 13).method3753(var297.field7997, (byte) 125, var296);
                    return;
                }
                field4619[field4628++] = class665.field9460.method218(var295, (byte) 13).method3755(var297.field7999, var296, (byte) 72);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field4619[field4628++] = class276.field3741 && !class205.field2682 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field4619[field4628++] = class612.field8349;
                return;
            }
            if (arg0 == 6902) {
                field4619[field4628++] = class268.field3672;
                return;
            }
            if (arg0 == 6903) {
                field4619[field4628++] = class488.field6585;
                return;
            }
            if (arg0 == 6904) {
                field4619[field4628++] = class470.field6370;
                return;
            }
            if (arg0 == 6905) {
                String var298 = "";
                if (class150.field1893 != null) {
                    if (class150.field1893.field3772 == null) {
                        var298 = class103.method553(class150.field1893.field3775, (byte) 7);
                    } else {
                        var298 = (String) class150.field1893.field3772;
                    }
                }
                field4625[field4626++] = var298;
                return;
            }
            if (arg0 == 6906) {
                field4619[field4628++] = class164.field2070;
                return;
            }
            if (arg0 == 6907) {
                field4619[field4628++] = class620.field8435;
                return;
            }
            if (arg0 == 6908) {
                field4619[field4628++] = class544.field7458;
                return;
            }
            if (arg0 == 6909) {
                field4619[field4628++] = class85.field1041 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field4619[field4628++] = class428.field5950;
                return;
            }
            if (arg0 == 6911) {
                field4619[field4628++] = class436.field6012;
                return;
            }
            if (arg0 == 6912) {
                field4619[field4628++] = class533.field7350;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var299 = class72.field935.method1850(2);
                field4619[field4628++] = class72.field935.field4156 = class161.field2038;
                field4619[field4628++] = var299;
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7001) {
                class72.field935.method1851(18493);
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7002) {
                class72.field935.method1860(false);
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7003) {
                class72.field935.method1854(-12451);
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7004) {
                class72.field935.method1866(1);
                class70.method413(11);
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7005) {
                class72.field935.field6532 = 0;
                class72.field935.method1856(0, class495.field6687);
                class665.field9426 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class72.field935.field4156 == 2) {
                    class72.field935.field4167 = true;
                    return;
                }
                if (class72.field935.field4156 == 1) {
                    class72.field935.field4158 = true;
                    return;
                }
                if (class72.field935.field4156 == 3) {
                    class72.field935.field4163 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field4619[field4628++] = class72.field935.field6532;
                return;
            }
            if (arg0 == 7008) {
                if (class161.field2038 == 0 && class77.field969 < 96) {
                    field4619[field4628++] = 2;
                    return;
                }
                field4619[field4628++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
    private static final void method2054(int arg0) {
        class188 var1 = class557.method3117(arg0, (byte) 71);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class188[] var3 = class421.field5864[var2];
        if (var3 == null) {
            class188[] var4 = class328.field4799[var2];
            int var5 = var4.length;
            var3 = class421.field5864[var2] = new class188[var5];
            class657.method3640(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class657.method3640(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
