import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class656 {

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "[Lsd;")
    private static class358[] field9328 = new class358[50];

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
    private static int[] field9329 = new int[1000];

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    private static int field9331 = 0;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field9327 = new String[1000];

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    private static int field9345 = 0;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    private static int field9334 = 0;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "[[I")
    private static int[][] field9347 = new int[5][5000];

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "[I")
    private static int[] field9349 = new int[5];

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field9343 = Calendar.getInstance();

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "[I")
    private static int[] field9350 = new int[3];

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field9351 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "Luf;")
    public static class380 field9352 = new class380(4);

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    private static int field9353 = 0;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field9346;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "Lwv;")
    private static class423 field9330;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lwv;")
    private static class423 field9338;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lcaa;")
    private static class52 field9341;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "[I")
    private static int[] field9339;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "[Ljava/lang/String;")
    private static String[] field9337;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method3738(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field9343.setTime(new Date(var1));
        int var3 = field9343.get(5);
        int var4 = field9343.get(2);
        int var5 = field9343.get(1);
        return var3 + "-" + field9351[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3739(String arg0, int arg1) {
        if (class121.field1585 == 0 && !(!class227.field2946 || class187.field2601) || class26.field344) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class371.field4926.method2141(0, true))) {
            var3 = 0;
            arg0 = arg0.substring(class371.field4926.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4927.method2141(0, true))) {
            var3 = 1;
            arg0 = arg0.substring(class371.field4927.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4928.method2141(0, true))) {
            var3 = 2;
            arg0 = arg0.substring(class371.field4928.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4929.method2141(0, true))) {
            var3 = 3;
            arg0 = arg0.substring(class371.field4929.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4930.method2141(0, true))) {
            var3 = 4;
            arg0 = arg0.substring(class371.field4930.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4931.method2141(0, true))) {
            var3 = 5;
            arg0 = arg0.substring(class371.field4931.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4932.method2141(0, true))) {
            var3 = 6;
            arg0 = arg0.substring(class371.field4932.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4933.method2141(0, true))) {
            var3 = 7;
            arg0 = arg0.substring(class371.field4933.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4934.method2141(0, true))) {
            var3 = 8;
            arg0 = arg0.substring(class371.field4934.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4935.method2141(0, true))) {
            var3 = 9;
            arg0 = arg0.substring(class371.field4935.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4936.method2141(0, true))) {
            var3 = 10;
            arg0 = arg0.substring(class371.field4936.method2141(0, true).length());
        } else if (var2.startsWith(class371.field4937.method2141(0, true))) {
            var3 = 11;
            arg0 = arg0.substring(class371.field4937.method2141(0, true).length());
        } else if (class422.field5539 != 0) {
            if (var2.startsWith(class371.field4926.method2141(class422.field5539, true))) {
                var3 = 0;
                arg0 = arg0.substring(class371.field4926.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4927.method2141(class422.field5539, true))) {
                var3 = 1;
                arg0 = arg0.substring(class371.field4927.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4928.method2141(class422.field5539, true))) {
                var3 = 2;
                arg0 = arg0.substring(class371.field4928.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4929.method2141(class422.field5539, true))) {
                var3 = 3;
                arg0 = arg0.substring(class371.field4929.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4930.method2141(class422.field5539, true))) {
                var3 = 4;
                arg0 = arg0.substring(class371.field4930.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4931.method2141(class422.field5539, true))) {
                var3 = 5;
                arg0 = arg0.substring(class371.field4931.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4932.method2141(class422.field5539, true))) {
                var3 = 6;
                arg0 = arg0.substring(class371.field4932.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4933.method2141(class422.field5539, true))) {
                var3 = 7;
                arg0 = arg0.substring(class371.field4933.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4934.method2141(class422.field5539, true))) {
                var3 = 8;
                arg0 = arg0.substring(class371.field4934.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4935.method2141(class422.field5539, true))) {
                var3 = 9;
                arg0 = arg0.substring(class371.field4935.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4936.method2141(class422.field5539, true))) {
                var3 = 10;
                arg0 = arg0.substring(class371.field4936.method2141(class422.field5539, true).length());
            } else if (var2.startsWith(class371.field4937.method2141(class422.field5539, true))) {
                var3 = 11;
                arg0 = arg0.substring(class371.field4937.method2141(class422.field5539, true).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class371.field4938.method2141(0, true))) {
            var5 = 1;
            arg0 = arg0.substring(class371.field4938.method2141(0, true).length());
        } else if (var4.startsWith(class371.field4939.method2141(0, true))) {
            var5 = 2;
            arg0 = arg0.substring(class371.field4939.method2141(0, true).length());
        } else if (var4.startsWith(class371.field4940.method2141(0, true))) {
            var5 = 3;
            arg0 = arg0.substring(class371.field4940.method2141(0, true).length());
        } else if (var4.startsWith(class371.field4941.method2141(0, true))) {
            var5 = 4;
            arg0 = arg0.substring(class371.field4941.method2141(0, true).length());
        } else if (var4.startsWith(class371.field4942.method2141(0, true))) {
            var5 = 5;
            arg0 = arg0.substring(class371.field4942.method2141(0, true).length());
        } else if (class422.field5539 != 0) {
            if (var4.startsWith(class371.field4938.method2141(class422.field5539, true))) {
                var5 = 1;
                arg0 = arg0.substring(class371.field4938.method2141(class422.field5539, true).length());
            } else if (var4.startsWith(class371.field4939.method2141(class422.field5539, true))) {
                var5 = 2;
                arg0 = arg0.substring(class371.field4939.method2141(class422.field5539, true).length());
            } else if (var4.startsWith(class371.field4940.method2141(class422.field5539, true))) {
                var5 = 3;
                arg0 = arg0.substring(class371.field4940.method2141(class422.field5539, true).length());
            } else if (var4.startsWith(class371.field4941.method2141(class422.field5539, true))) {
                var5 = 4;
                arg0 = arg0.substring(class371.field4941.method2141(class422.field5539, true).length());
            } else if (var4.startsWith(class371.field4942.method2141(class422.field5539, true))) {
                var5 = 5;
                arg0 = arg0.substring(class371.field4942.method2141(class422.field5539, true).length());
            }
        }
        field9348++;
        class229 var6 = class97.method550(class71.field841, false, class91.field1118);
        var6.field2971.method915(-31914, 0);
        int var7 = var6.field2971.field2219;
        var6.field2971.method915(-31914, var3);
        var6.field2971.method915(-31914, var5);
        class699.method3935(arg0, true, var6.field2971);
        var6.field2971.method948(-9911, var6.field2971.field2219 - var7);
        class307.method1805(var6, -14704);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
    public static final void method3740() {
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
    public static final void method3741(int arg0) {
        if (arg0 == -1 || !class60.method341(arg0, 0)) {
            return;
        }
        class423[] var1 = class124.field1729[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class423 var3 = var1[var2];
            if (var3.field5628 != null) {
                class274 var4 = new class274();
                var4.field3644 = var3;
                var4.field3639 = var3.field5628;
                method3748(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
    private static final void method3742(int arg0) {
        class423 var1 = class592.method3271(arg0, (byte) -95);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class423[] var3 = class651.field9139[var2];
        if (var3 == null) {
            class423[] var4 = class124.field1729[var2];
            int var5 = var4.length;
            var3 = class651.field9139[var2] = new class423[var5];
            class2.method7(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class2.method7(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lada;)V")
    public static final void method3743(class274 arg0) {
        method3748(arg0, 200000);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
    public static final void method3744(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbm;I)V")
    private static final void method3745(class295 arg0, int arg1) {
        field9331 = 0;
        field9345 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3916;
        int[] var4 = arg0.field3908;
        byte var5 = -1;
        field9334 = 0;
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
                        method3747(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3746(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field9329[field9331++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field9329[field9331++] = class564.field7696.field180[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class564.field7696.method87(23222, var8, field9329[--field9331]);
                } else if (var43 == 3) {
                    field9327[field9345++] = arg0.field3909[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field9331 -= 2;
                    if (field9329[field9331 + 1] != field9329[field9331]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field9331 -= 2;
                    if (field9329[field9331 + 1] == field9329[field9331]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field9331 -= 2;
                    if (field9329[field9331] < field9329[field9331 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field9331 -= 2;
                    if (field9329[field9331] > field9329[field9331 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field9334 == 0) {
                        return;
                    }
                    class358 var9 = field9328[--field9334];
                    arg0 = var9.field4765;
                    var3 = arg0.field3916;
                    var4 = arg0.field3908;
                    var2 = var9.field4766;
                    field9339 = var9.field4761;
                    field9337 = var9.field4763;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field9329[field9331++] = class564.field7696.method90(var10, 27158);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class564.field7696.method92(field9329[--field9331], (byte) -35, var11);
                } else if (var43 == 31) {
                    field9331 -= 2;
                    if (field9329[field9331] <= field9329[field9331 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field9331 -= 2;
                    if (field9329[field9331] >= field9329[field9331 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field9329[field9331++] = field9339[var4[var2]];
                } else if (var43 == 34) {
                    field9339[var4[var2]] = field9329[--field9331];
                } else if (var43 == 35) {
                    field9327[field9345++] = field9337[var4[var2]];
                } else if (var43 == 36) {
                    field9337[var4[var2]] = field9327[--field9345];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field9345 -= var12;
                    String var13 = class387.method2213(var12, field9327, field9345, 13061);
                    field9327[field9345++] = var13;
                } else if (var43 == 38) {
                    field9331--;
                } else if (var43 == 39) {
                    field9345--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class295 var15 = class600.method3327(false, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3912];
                    String[] var17 = new String[var15.field3911];
                    for (int var18 = 0; var18 < var15.field3913; var18++) {
                        var16[var18] = field9329[field9331 + var18 - var15.field3913];
                    }
                    for (int var19 = 0; var19 < var15.field3915; var19++) {
                        var17[var19] = field9327[field9345 + var19 - var15.field3915];
                    }
                    field9331 -= var15.field3913;
                    field9345 -= var15.field3915;
                    class358 var20 = new class358();
                    var20.field4765 = arg0;
                    var20.field4766 = var2;
                    var20.field4761 = field9339;
                    var20.field4763 = field9337;
                    if (field9334 >= field9328.length) {
                        throw new RuntimeException();
                    }
                    field9328[field9334++] = var20;
                    arg0 = var15;
                    var3 = var15.field3916;
                    var4 = var15.field3908;
                    var2 = -1;
                    field9339 = var16;
                    field9337 = var17;
                } else if (var43 == 42) {
                    field9329[field9331++] = class235.field3125[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class235.field3125[var21] = field9329[--field9331];
                    class502.method2852(10475, var21);
                    class122.field1599 |= class516.field7179[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field9329[--field9331];
                    if (var24 >= 0 && var24 <= 5000) {
                        field9349[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field9347[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field9329[--field9331];
                    if (var28 < 0 || var28 >= field9349[var27]) {
                        throw new RuntimeException();
                    }
                    field9329[field9331++] = field9347[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field9331 -= 2;
                    int var30 = field9329[field9331];
                    if (var30 < 0 || var30 >= field9349[var29]) {
                        throw new RuntimeException();
                    }
                    field9347[var29][var30] = field9329[field9331 + 1];
                } else if (var43 == 47) {
                    String var31 = class550.field7516[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field9327[field9345++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class550.field7516[var32] = field9327[--field9345];
                    class572.method3161(var32, 5519);
                } else if (var43 == 51) {
                    class546 var33 = arg0.field3917[var4[var2]];
                    class37 var34 = (class37) var33.method3057(1, (long) field9329[--field9331]);
                    if (var34 != null) {
                        var2 += var34.field505;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field3905 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field545).append(" ");
                for (int var41 = field9334 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field9328[var41].field4765.field545).append(" ");
                }
                var40.append("op: ").append(var5);
                class91.method499(var40.toString(), var42, (byte) 123);
            } else {
                class642.method3555((byte) -101, "Clientscript error in: " + arg0.field3905, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3905).append("\n");
                for (int var38 = field9334 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field9328[var38].field4765.field3905).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class91.method499(var37.toString(), var42, (byte) -53);
                class592.method3278((byte) -59, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)V")
    private static final void method3746(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field9329[field9331++] = class141.field1916;
                return;
            }
            if (arg0 == 5001) {
                field9331 -= 3;
                class141.field1916 = field9329[field9331];
                class421.field5527 = class144.method824(field9329[field9331 + 1], -53);
                if (class421.field5527 == null) {
                    class421.field5527 = class68.field828;
                }
                class338.field4555 = field9329[field9331 + 2];
                field9336++;
                class229 var2 = class97.method550(class71.field841, false, class465.field6087);
                var2.field2971.method915(-31914, class141.field1916);
                var2.field2971.method915(-31914, class421.field5527.field5366);
                var2.field2971.method915(-31914, class338.field4555);
                class307.method1805(var2, -14704);
                return;
            }
            if (arg0 == 5002) {
                field9345 -= 2;
                String var3 = field9327[field9345];
                String var4 = field9327[field9345 + 1];
                field9331 -= 2;
                int var5 = field9329[field9331];
                int var6 = field9329[field9331 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field9333++;
                class229 var7 = class97.method550(class71.field841, false, class362.field4791);
                var7.field2971.method915(-31914, class206.method1313((byte) -81, var3) + class206.method1313((byte) 105, var4) + 2);
                var7.field2971.method936(var3, -95);
                var7.field2971.method915(-31914, var5 - 1);
                var7.field2971.method915(-31914, var6);
                var7.field2971.method936(var4, 89);
                class307.method1805(var7, -14704);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field9329[--field9331];
                class279 var9 = class364.method2123(var8, -14709);
                String var10 = "";
                if (var9 != null && var9.field3682 != null) {
                    var10 = var9.field3682;
                }
                field9327[field9345++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field9329[--field9331];
                class279 var12 = class364.method2123(var11, -14709);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field3680;
                }
                field9329[field9331++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class421.field5527 == null) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = class421.field5527.field5366;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field9329[--field9331];
                class229 var15 = class97.method550(class71.field841, false, class76.field899);
                var15.field2971.method915(-31914, var14);
                class307.method1805(var15, -14704);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field9327[--field9345];
                method3739(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field9345 -= 2;
                String var17 = field9327[field9345];
                String var18 = field9327[field9345 + 1];
                if (class121.field1585 != 0 || (!class227.field2946 || class187.field2601) && !class26.field344) {
                    field9326++;
                    class229 var19 = class97.method550(class71.field841, false, class158.field2266);
                    var19.field2971.method915(-31914, 0);
                    int var20 = var19.field2971.field2219;
                    var19.field2971.method936(var17, -70);
                    class699.method3935(var18, true, var19.field2971);
                    var19.field2971.method948(-9911, var19.field2971.field2219 - var20);
                    class307.method1805(var19, -14704);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field9329[--field9331];
                class279 var22 = class364.method2123(var21, -14709);
                String var23 = "";
                if (var22 != null && var22.field3692 != null) {
                    var23 = var22.field3692;
                }
                field9327[field9345++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field9329[--field9331];
                class279 var25 = class364.method2123(var24, -14709);
                String var26 = "";
                if (var25 != null && var25.field3683 != null) {
                    var26 = var25.field3683;
                }
                field9327[field9345++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field9329[--field9331];
                class279 var28 = class364.method2123(var27, -14709);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field3689;
                }
                field9329[field9331++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class408.field5369 == null || class408.field5369.field7811 == null) {
                    var30 = class213.field2815;
                } else {
                    var30 = class408.field5369.method3173(true, (byte) 0);
                }
                field9327[field9345++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field9329[field9331++] = class338.field4555;
                return;
            }
            if (arg0 == 5017) {
                field9329[field9331++] = class457.method2569(0);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field9329[--field9331];
                class279 var32 = class364.method2123(var31, -14709);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field3679;
                }
                field9329[field9331++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field9329[--field9331];
                class279 var35 = class364.method2123(var34, -14709);
                String var36 = "";
                if (var35 != null && var35.field3691 != null) {
                    var36 = var35.field3691;
                }
                field9327[field9345++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class408.field5369 == null || class408.field5369.field7811 == null) {
                    var37 = class213.field2815;
                } else {
                    var37 = class408.field5369.method3171(false, (byte) -43);
                }
                field9327[field9345++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field9329[--field9331];
                class279 var39 = class364.method2123(var38, -14709);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field3693;
                }
                field9329[field9331++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field9329[--field9331];
                class279 var42 = class364.method2123(var41, -14709);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field3686;
                }
                field9329[field9331++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field9329[--field9331];
                class279 var45 = class364.method2123(var44, -14709);
                String var46 = "";
                if (var45 != null && var45.field3684 != null) {
                    var46 = var45.field3684;
                }
                field9327[field9345++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field9329[--field9331];
                field9327[field9345++] = class273.field3635.method1374(var47, 55).field3843;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field9329[--field9331];
                class291 var49 = class273.field3635.method1374(var48, 38);
                if (var49.field3842 == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = var49.field3842.length;
                return;
            }
            if (arg0 == 5052) {
                field9331 -= 2;
                int var50 = field9329[field9331];
                int var51 = field9329[field9331 + 1];
                class291 var52 = class273.field3635.method1374(var50, 55);
                int var53 = var52.field3842[var51];
                field9329[field9331++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field9329[--field9331];
                class291 var55 = class273.field3635.method1374(var54, 57);
                if (var55.field3849 == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = var55.field3849.length;
                return;
            }
            if (arg0 == 5054) {
                field9331 -= 2;
                int var56 = field9329[field9331];
                int var57 = field9329[field9331 + 1];
                field9329[field9331++] = class273.field3635.method1374(var56, 34).field3849[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field9329[--field9331];
                field9327[field9345++] = class32.field447.method2162((byte) 102, var58).method1808(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field9329[--field9331];
                class307 var60 = class32.field447.method2162((byte) 102, var59);
                if (var60.field4120 == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = var60.field4120.length;
                return;
            }
            if (arg0 == 5057) {
                field9331 -= 2;
                int var61 = field9329[field9331];
                int var62 = field9329[field9331 + 1];
                field9329[field9331++] = class32.field447.method2162((byte) 102, var61).field4120[var62];
                return;
            }
            if (arg0 == 5058) {
                field9341 = new class52();
                field9341.field663 = field9329[--field9331];
                field9341.field664 = class32.field447.method2162((byte) 102, field9341.field663);
                field9341.field669 = new int[field9341.field664.method1797(-107)];
                return;
            }
            if (arg0 == 5059) {
                field9344++;
                class229 var63 = class97.method550(class71.field841, false, class225.field2931);
                var63.field2971.method915(-31914, 0);
                int var64 = var63.field2971.field2219;
                var63.field2971.method915(-31914, 0);
                var63.field2971.method918(24551, field9341.field663);
                field9341.field664.method1801(field9341.field669, 4039, var63.field2971);
                var63.field2971.method948(-9911, var63.field2971.field2219 - var64);
                class307.method1805(var63, -14704);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field9327[--field9345];
                field9325++;
                class229 var66 = class97.method550(class71.field841, false, class471.field6582);
                var66.field2971.method915(-31914, 0);
                int var67 = var66.field2971.field2219;
                var66.field2971.method936(var65, 97);
                var66.field2971.method918(24551, field9341.field663);
                field9341.field664.method1801(field9341.field669, 4039, var66.field2971);
                var66.field2971.method948(-9911, var66.field2971.field2219 - var67);
                class307.method1805(var66, -14704);
                return;
            }
            if (arg0 == 5061) {
                field9344++;
                class229 var68 = class97.method550(class71.field841, false, class225.field2931);
                var68.field2971.method915(-31914, 0);
                int var69 = var68.field2971.field2219;
                var68.field2971.method915(-31914, 1);
                var68.field2971.method918(24551, field9341.field663);
                field9341.field664.method1801(field9341.field669, 4039, var68.field2971);
                var68.field2971.method948(-9911, var68.field2971.field2219 - var69);
                class307.method1805(var68, -14704);
                return;
            }
            if (arg0 == 5062) {
                field9331 -= 2;
                int var70 = field9329[field9331];
                int var71 = field9329[field9331 + 1];
                field9329[field9331++] = class273.field3635.method1374(var70, 76).field3841[var71];
                return;
            }
            if (arg0 == 5063) {
                field9331 -= 2;
                int var72 = field9329[field9331];
                int var73 = field9329[field9331 + 1];
                field9329[field9331++] = class273.field3635.method1374(var72, 103).field3844[var73];
                return;
            }
            if (arg0 == 5064) {
                field9331 -= 2;
                int var74 = field9329[field9331];
                int var75 = field9329[field9331 + 1];
                if (var75 == -1) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = class273.field3635.method1374(var74, 99).method1726((char) var75, 0);
                return;
            }
            if (arg0 == 5065) {
                field9331 -= 2;
                int var76 = field9329[field9331];
                int var77 = field9329[field9331 + 1];
                if (var77 == -1) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = class273.field3635.method1374(var76, 50).method1721((char) var77, (byte) -101);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field9329[--field9331];
                field9329[field9331++] = class32.field447.method2162((byte) 102, var78).method1797(-98);
                return;
            }
            if (arg0 == 5067) {
                field9331 -= 2;
                int var79 = field9329[field9331];
                int var80 = field9329[field9331 + 1];
                int var81 = class32.field447.method2162((byte) 102, var79).method1798((byte) -76, var80).field445;
                field9329[field9331++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field9331 -= 2;
                int var82 = field9329[field9331];
                int var83 = field9329[field9331 + 1];
                field9341.field669[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field9331 -= 2;
                int var84 = field9329[field9331];
                int var85 = field9329[field9331 + 1];
                field9341.field669[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field9331 -= 3;
                int var86 = field9329[field9331];
                int var87 = field9329[field9331 + 1];
                int var88 = field9329[field9331 + 2];
                class307 var89 = class32.field447.method2162((byte) 102, var86);
                if (var89.method1798((byte) -76, var87).field445 != 0) {
                    throw new RuntimeException("bad command");
                }
                field9329[field9331++] = var89.method1799(var87, 82, var88);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field9327[--field9345];
                boolean var91 = field9329[--field9331] == 1;
                class149.method853(var91, false, var90);
                field9329[field9331++] = class45.field546;
                return;
            }
            if (arg0 == 5072) {
                if (class608.field8456 != null && class551.field7523 < class45.field546) {
                    field9329[field9331++] = class608.field8456[class551.field7523++] & 0xFFFF;
                    return;
                }
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class551.field7523 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class643.field8914.method2106((byte) -127, 86)) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class643.field8914.method2106((byte) -121, 82)) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class643.field8914.method2106((byte) -123, 81)) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class121.method718(field9329[--field9331], true);
                return;
            }
            if (arg0 == 5201) {
                field9329[field9331++] = class428.method2421(-17318);
                return;
            }
            if (arg0 == 5205) {
                class479.method2754(false, field9329[--field9331], 27, -1, -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field9329[--field9331];
                class289 var93 = class672.method3836(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = var93.field3812;
                return;
            }
            if (arg0 == 5207) {
                class289 var94 = class672.method3819(field9329[--field9331]);
                if (var94 != null && var94.field3819 != null) {
                    field9327[field9345++] = var94.field3819;
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 5208) {
                field9329[field9331++] = class9.field87;
                field9329[field9331++] = class410.field5394;
                return;
            }
            if (arg0 == 5209) {
                field9329[field9331++] = class698.field9854 + class672.field9567;
                field9329[field9331++] = class672.field9587 + class424.field5722;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field9329[--field9331];
                class289 var96 = class672.method3819(var95);
                if (var96 == null) {
                    field9329[field9331++] = 0;
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = var96.field3811 >> 14 & 0x3FFF;
                field9329[field9331++] = var96.field3811 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field9329[--field9331];
                class289 var98 = class672.method3819(var97);
                if (var98 == null) {
                    field9329[field9331++] = 0;
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = var98.field3824 - var98.field3818;
                field9329[field9331++] = var98.field3817 - var98.field3809;
                return;
            }
            if (arg0 == 5212) {
                class694 var99 = class200.method1286(true);
                if (var99 == null) {
                    field9329[field9331++] = -1;
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = var99.field9786;
                int var100 = var99.field9793 << 28 | class672.field9567 + var99.field9789 << 14 | class672.field9587 + var99.field9784;
                field9329[field9331++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class694 var101 = class300.method1772(17956);
                if (var101 == null) {
                    field9329[field9331++] = -1;
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = var101.field9786;
                int var102 = var101.field9793 << 28 | class672.field9567 + var101.field9789 << 14 | class672.field9587 + var101.field9784;
                field9329[field9331++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field9329[--field9331];
                class289 var104 = class112.method665(-109);
                if (var104 != null) {
                    boolean var105 = var104.method1713(var103 & 0x3FFF, field9350, var103 >> 14 & 0x3FFF, var103 >> 28 & 0x3, (byte) 35);
                    if (var105) {
                        class557.method3097(2, field9350[2], field9350[1]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field9331 -= 2;
                int var106 = field9329[field9331];
                int var107 = field9329[field9331 + 1];
                class150 var108 = class672.method3825(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class289 var110 = (class289) var108.method878(false); var110 != null; var110 = (class289) var108.method880(-11278)) {
                    if (var110.field3812 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field9329[--field9331];
                class289 var112 = class672.method3819(var111);
                if (var112 == null) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = var112.field3815;
                return;
            }
            if (arg0 == 5220) {
                field9329[field9331++] = class630.field8726 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field9329[--field9331];
                class557.method3097(2, var113 & 0x3FFF, var113 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class289 var114 = class112.method665(-99);
                if (var114 != null) {
                    boolean var115 = var114.method1711(class698.field9854 + class672.field9567, -32400, field9350, class672.field9587 + class424.field5722);
                    if (var115) {
                        field9329[field9331++] = field9350[1];
                        field9329[field9331++] = field9350[2];
                        return;
                    }
                    field9329[field9331++] = -1;
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = -1;
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field9331 -= 2;
                int var116 = field9329[field9331];
                int var117 = field9329[field9331 + 1];
                class479.method2754(false, var116, 104, var117 >> 14 & 0x3FFF, var117 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field9329[--field9331];
                class289 var119 = class112.method665(-100);
                if (var119 != null) {
                    boolean var120 = var119.method1713(var118 & 0x3FFF, field9350, var118 >> 14 & 0x3FFF, var118 >> 28 & 0x3, (byte) 94);
                    if (var120) {
                        field9329[field9331++] = field9350[1];
                        field9329[field9331++] = field9350[2];
                        return;
                    }
                    field9329[field9331++] = -1;
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = -1;
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field9329[--field9331];
                class289 var122 = class112.method665(-105);
                if (var122 != null) {
                    boolean var123 = var122.method1711(var121 >> 14 & 0x3FFF, -32400, field9350, var121 & 0x3FFF);
                    if (var123) {
                        field9329[field9331++] = field9350[1];
                        field9329[field9331++] = field9350[2];
                        return;
                    }
                    field9329[field9331++] = -1;
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = -1;
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class425.method2412((byte) -74, field9329[--field9331]);
                return;
            }
            if (arg0 == 5227) {
                field9331 -= 2;
                int var124 = field9329[field9331];
                int var125 = field9329[field9331 + 1];
                class479.method2754(true, var124, 77, var125 >> 14 & 0x3FFF, var125 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class584.field8010 = field9329[--field9331] == 1;
                return;
            }
            if (arg0 == 5229) {
                field9329[field9331++] = class584.field8010 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field9329[--field9331];
                class29.method185((byte) 88, var126);
                return;
            }
            if (arg0 == 5231) {
                field9331 -= 2;
                int var127 = field9329[field9331];
                boolean var128 = field9329[field9331 + 1] == 1;
                if (class218.field2863 != null) {
                    class45 var129 = class218.field2863.method3057(1, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method242(true);
                        return;
                    }
                    if (var129 == null && var128) {
                        class45 var130 = new class45();
                        class218.field2863.method3061(125, (long) var127, var130);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field9329[--field9331];
                if (class218.field2863 != null) {
                    class45 var132 = class218.field2863.method3057(1, (long) var131);
                    field9329[field9331++] = var132 == null ? 0 : 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field9331 -= 2;
                int var133 = field9329[field9331];
                boolean var134 = field9329[field9331 + 1] == 1;
                if (class662.field9434 != null) {
                    class45 var135 = class662.field9434.method3057(1, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method242(true);
                        return;
                    }
                    if (var135 == null && var134) {
                        class45 var136 = new class45();
                        class662.field9434.method3061(124, (long) var133, var136);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field9329[--field9331];
                if (class662.field9434 != null) {
                    class45 var138 = class662.field9434.method3057(1, (long) var137);
                    field9329[field9331++] = var138 == null ? 0 : 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field9329[field9331++] = class672.field9548 == null ? -1 : class672.field9548.field3812;
                return;
            }
            if (arg0 == 5236) {
                field9331 -= 2;
                int var139 = field9329[field9331];
                int var140 = field9329[field9331 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class657.method3753(var141, (byte) 60, var139, var142);
                if (var143 < 0) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class385.method2207(false);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field9331 -= 2;
                int var144 = field9329[field9331];
                int var145 = field9329[field9331 + 1];
                class152.method892(3, false, var145, var144, 3);
                field9329[field9331++] = class529.field7314 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class529.field7314 != null) {
                    class152.method892(class602.field8408.field4313, false, -1, -1, 3);
                }
                return;
            }
            if (arg0 == 5302) {
                class232[] var146 = class13.method78(0);
                field9329[field9331++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field9329[--field9331];
                class232[] var148 = class13.method78(0);
                field9329[field9331++] = var148[var147].field3101;
                field9329[field9331++] = var148[var147].field3099;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class602.field8408.field4346;
                int var150 = class602.field8408.field4299;
                int var151 = -1;
                class232[] var152 = class13.method78(0);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class232 var154 = var152[var153];
                    if (var154.field3101 == var149 && var154.field3099 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field9329[field9331++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field9329[field9331++] = class702.method3945((byte) -104);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field9329[--field9331];
                if (var155 >= 1 && var155 <= 2) {
                    class152.method892(var155, false, -1, -1, 3);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field9329[field9331++] = class602.field8408.field4313;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field9329[--field9331];
                if (var156 >= 1 && var156 <= 2) {
                    class602.field8408.field4313 = var156;
                    class602.field8408.method3557(class312.field4206, -2);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field9345 -= 2;
                String var157 = field9327[field9345];
                String var158 = field9327[field9345 + 1];
                int var159 = field9329[--field9331];
                field9335++;
                class229 var160 = class97.method550(class71.field841, false, class679.field9645);
                var160.field2971.method915(-31914, class206.method1313((byte) -106, var157) + class206.method1313((byte) 112, var158) + 1);
                var160.field2971.method936(var157, 59);
                var160.field2971.method936(var158, 115);
                var160.field2971.method915(-31914, var159);
                class307.method1805(var160, -14704);
                return;
            }
            if (arg0 == 5401) {
                field9331 -= 2;
                class549.field7509[field9329[field9331]] = (short) class353.method2085(243, field9329[field9331 + 1]);
                class87.field1058.method1397(9713);
                class87.field1058.method1403(-65);
                class440.field5847.method501(-67);
                class398.method2275(-1);
                return;
            }
            if (arg0 == 5405) {
                field9331 -= 2;
                int var161 = field9329[field9331];
                int var162 = field9329[field9331 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class490.field6780[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field9331 -= 7;
                int var163 = field9329[field9331];
                int var164 = field9329[field9331 + 1] << 1;
                int var165 = field9329[field9331 + 2];
                int var166 = field9329[field9331 + 3];
                int var167 = field9329[field9331 + 4];
                int var168 = field9329[field9331 + 5];
                int var169 = field9329[field9331 + 6];
                if (var163 >= 0 && var163 < 2 && class490.field6780[var163] != null && var164 >= 0 && var164 < class490.field6780[var163].length) {
                    class490.field6780[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class490.field6780[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class490.field6780[field9329[--field9331]].length >> 1;
                field9329[field9331++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class529.field7314 != null) {
                    class152.method892(class602.field8408.field4313, false, -1, -1, 3);
                }
                if (class190.field2630 != null) {
                    class326.method1900(false);
                    System.exit(0);
                    return;
                }
                String var171 = class516.field7171 == null ? class588.method3256((byte) -102) : class516.field7171;
                class309.method1824(false, class312.field4206, var171, (byte) -112, class618.field8566 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class582.field7965 != null) {
                    if (class582.field7965.field9421 == null) {
                        var172 = class104.method575(class582.field7965.field9424, 7455);
                    } else {
                        var172 = (String) class582.field7965.field9421;
                    }
                }
                field9327[field9345++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field9329[field9331++] = class312.field4206.field5176 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class529.field7314 != null) {
                    class152.method892(class602.field8408.field4313, false, -1, -1, 3);
                }
                String var173 = field9327[--field9345];
                boolean var174 = field9329[--field9331] == 1;
                String var175 = class588.method3256((byte) -102) + var173;
                class309.method1824(var174, class312.field4206, var175, (byte) -125, class618.field8566 == 1);
                return;
            }
            if (arg0 == 5422) {
                field9345 -= 2;
                String var176 = field9327[field9345];
                String var177 = field9327[field9345 + 1];
                int var178 = field9329[--field9331];
                if (var176.length() > 0) {
                    if (class371.field4944 == null) {
                        class371.field4944 = new String[class165.field2370[class508.field7015.field8976]];
                    }
                    class371.field4944[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class202.field2718 == null) {
                        class202.field2718 = new String[class165.field2370[class508.field7015.field8976]];
                    }
                    class202.field2718[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field9327[--field9345]);
                return;
            }
            if (arg0 == 5424) {
                field9331 -= 11;
                class234.field3108 = field9329[field9331];
                class121.field1587 = field9329[field9331 + 1];
                class317.field4240 = field9329[field9331 + 2];
                class156.field2192 = field9329[field9331 + 3];
                class156.field2190 = field9329[field9331 + 4];
                class623.field8636 = field9329[field9331 + 5];
                class624.field8642 = field9329[field9331 + 6];
                class401.field5321 = field9329[field9331 + 7];
                class288.field3799 = field9329[field9331 + 8];
                class442.field5863 = field9329[field9331 + 9];
                class124.field1732 = field9329[field9331 + 10];
                class390.field5228.method1931(1, class156.field2190);
                class390.field5228.method1931(1, class623.field8636);
                class390.field5228.method1931(1, class624.field8642);
                class390.field5228.method1931(1, class401.field5321);
                class390.field5228.method1931(1, class288.field3799);
                class421.field5522 = null;
                class450.field5946 = null;
                class306.field4086 = null;
                class411.field5409 = null;
                class374.field4965 = null;
                class392.field5243 = null;
                class226.field2942 = null;
                class637.field8801 = null;
                class218.field2857 = true;
                return;
            }
            if (arg0 == 5425) {
                class237.method1466(2048);
                class218.field2857 = false;
                return;
            }
            if (arg0 == 5426) {
                field9331 -= 2;
                class420.field5510 = field9329[field9331];
                class440.field5831 = field9329[field9331 + 1];
                return;
            }
            if (arg0 == 5427) {
                field9331 -= 2;
                class149.field2038 = field9329[field9331 + 1];
                return;
            }
            if (arg0 == 5428) {
                field9331 -= 2;
                int var179 = field9329[field9331];
                int var180 = field9329[field9331 + 1];
                field9329[field9331++] = class193.method1262(var179, (byte) 109, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class567.method3144(field9327[--field9345], 100, false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class507.method2883(class516.field7178, -4200, "accountcreated");
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class507.method2883(class516.field7178, -4200, "accountcreatestarted");
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class157.field2205 != null) {
                    Transferable var182 = class157.field2205.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var318) {
                        }
                    }
                }
                field9327[field9345++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field9331 -= 4;
                int var183 = field9329[field9331];
                int var184 = field9329[field9331 + 1];
                int var185 = field9329[field9331 + 2];
                int var186 = field9329[field9331 + 3];
                class550.method3080((byte) 127, var185, var184 << 2, (var183 >> 14 & 0x3FFF) - class125.field1745, var186, false, (var183 & 0x3FFF) - class4.field23);
                return;
            }
            if (arg0 == 5501) {
                field9331 -= 4;
                int var187 = field9329[field9331];
                int var188 = field9329[field9331 + 1];
                int var189 = field9329[field9331 + 2];
                int var190 = field9329[field9331 + 3];
                class643.method3581(var189, 3072, (var187 >> 14 & 0x3FFF) - class125.field1745, var188 << 2, var190, (var187 & 0x3FFF) - class4.field23);
                return;
            }
            if (arg0 == 5502) {
                field9331 -= 6;
                int var191 = field9329[field9331];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class669.field9514 = var191;
                int var192 = field9329[field9331 + 1];
                if (var192 + 1 >= class490.field6780[class669.field9514].length >> 1) {
                    throw new RuntimeException();
                }
                class571.field7768 = var192;
                class390.field5229 = 0;
                class501.field6889 = field9329[field9331 + 2];
                class426.field5745 = field9329[field9331 + 3];
                int var193 = field9329[field9331 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class68.field831 = var193;
                int var194 = field9329[field9331 + 5];
                if (var194 + 1 >= class490.field6780[class68.field831].length >> 1) {
                    throw new RuntimeException();
                }
                class524.field7283 = var194;
                class311.field4200 = 3;
                class83.field1004 = -1;
                class342.field4585 = -1;
                return;
            }
            if (arg0 == 5503) {
                class649.method3602((byte) -127);
                return;
            }
            if (arg0 == 5504) {
                field9331 -= 2;
                class543.method3044((byte) -78, 0, field9329[field9331], field9329[field9331 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field9329[field9331++] = (int) class475.field6610 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field9329[field9331++] = (int) class565.field7707 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class43.method229(47);
                return;
            }
            if (arg0 == 5508) {
                class94.method533(-41);
                return;
            }
            if (arg0 == 5509) {
                class97.method551((byte) 63);
                return;
            }
            if (arg0 == 5510) {
                class648.method3599((byte) -89);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field9329[--field9331];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class125.field1745;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class703.field9886) {
                    var198 = class703.field9886;
                }
                int var199 = var197 - class4.field23;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class431.field5789) {
                    var199 = class431.field5789;
                }
                class165.field2369 = (var198 << 9) + 256;
                class622.field8621 = (var199 << 9) + 256;
                class311.field4200 = 4;
                class83.field1004 = -1;
                class342.field4585 = -1;
                return;
            }
            if (arg0 == 5512) {
                class259.method1565(0);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field9329[--field9331];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class125.field1745;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class703.field9886) {
                        var203 = class703.field9886;
                    }
                    int var204 = var202 - class4.field23;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class431.field5789) {
                        var204 = class431.field5789;
                    }
                    class342.field4585 = (var203 << 9) + 256;
                    class83.field1004 = (var204 << 9) + 256;
                    return;
                }
                class342.field4585 = -1;
                class83.field1004 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field9345 -= 2;
                String var205 = field9327[field9345];
                String var206 = field9327[field9345 + 1];
                int var207 = field9329[--field9331];
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    class213.field2815 = var205;
                    class299.field3960 = var206;
                    class149.field2037 = var207;
                    class28.method182(6, 29697);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class28.method180(-108);
                return;
            }
            if (arg0 == 5602) {
                if (class420.field5513 == 0) {
                    class181.field2533 = -2;
                    class567.field7721 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field9331 -= 4;
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    class292.method1731(field9329[field9331 + 3], field9329[field9331], field9329[field9331 + 1], (byte) 108, field9329[field9331 + 2]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field9345--;
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    class28.method183(class633.method3510(120, field9327[field9345]), true);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field9345 -= 2;
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    class157.method943(false, field9327[field9345 + 1], class633.method3510(109, field9327[field9345]), (byte) -27);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class589.field8123 == 0) {
                    class279.field3685 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field9329[field9331++] = class567.field7721;
                return;
            }
            if (arg0 == 5608) {
                field9329[field9331++] = class72.field861;
                return;
            }
            if (arg0 == 5609) {
                field9329[field9331++] = class279.field3685;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field9327[field9345++] = class389.field5223 == null || class389.field5223.length <= var208 ? "" : class121.method717(class389.field5223[var208], 9240);
                }
                class389.field5223 = null;
                return;
            }
            if (arg0 == 5611) {
                field9329[field9331++] = class504.field6939;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field9329[--field9331];
                if (class576.field7861 != 7) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    if (class163.field2346 != null) {
                        class163.field2346.method1164(118);
                        class163.field2346 = null;
                    }
                    class149.field2037 = var209;
                    class28.method182(9, 29697);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field9329[field9331++] = class567.field7721;
                return;
            }
            if (arg0 == 5615) {
                field9345 -= 2;
                String var210 = field9327[field9345];
                String var211 = field9327[field9345 + 1];
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    if (class163.field2346 != null) {
                        class163.field2346.method1164(55);
                        class163.field2346 = null;
                    }
                    class213.field2815 = var210;
                    class299.field3960 = var211;
                    class28.method182(5, 29697);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class669.method3801((byte) 97, false);
                return;
            }
            if (arg0 == 5617) {
                field9329[field9331++] = class181.field2533;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field9329[--field9331];
                class509.method2888(var212, -72, false);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field9329[--field9331];
                class509.method2888(var213, -116, true);
                return;
            }
            if (arg0 == 5620) {
                class513.method2902((byte) 111);
                if (class618.field8577 != "" && class618.field8577 != "") {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field9345 -= 2;
                if (class576.field7861 != 3) {
                    return;
                }
                if (class420.field5513 == 0 && class589.field8123 == 0) {
                    class157.method943(true, field9327[field9345 + 1], class633.method3510(-15, field9327[field9345]), (byte) -27);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class661 var214 = class312.field4206.method2236("3", (byte) -106, false);
                while (var214.field9420 == 0) {
                    class588.method3253(0, 1L);
                }
                if (var214.field9420 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class611 var215 = (class611) var214.field9421;
                if (var215.method3388(0).exists()) {
                    class157 var216 = new class157(50);
                    try {
                        var215.method3389(-115, 0, var216.field2199, 50);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method3390(0);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class14.field183 != null) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field9329[field9331++] = (int) (class478.field6658 >> 32);
                field9329[field9331++] = (int) (class478.field6658 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field9329[--field9331];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class602.field8408.field4303 = var217;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6002) {
                class602.field8408.method3559(field9329[--field9331] == 1, -123);
                class446.method2514(false);
                class254.method1537((byte) -121);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6003) {
                class602.field8408.field4321 = field9329[--field9331] == 1;
                class254.method1537((byte) 124);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6005) {
                class602.field8408.field4300 = field9329[--field9331] == 1;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6006) {
                class602.field8408.field4298 = field9329[--field9331] == 1;
                class146.field1963.method1058(!class602.field8408.field4298);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6007) {
                class602.field8408.field4333 = field9329[--field9331];
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6008) {
                class602.field8408.field4312 = field9329[--field9331] == 1;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6009) {
                class602.field8408.field4340 = field9329[--field9331] == 1;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6010) {
                class602.field8408.field4314 = field9329[--field9331] == 1;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field9329[--field9331];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class602.field8408.method1864((byte) 104, var218, class618.field8566);
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6012) {
                class602.field8408.method1866(-24426, field9329[--field9331] == 1, class618.field8566);
                class595.method3305((byte) 91);
                class382.method2189(true);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6014) {
                class602.field8408.field4322 = field9329[--field9331] == 1;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6015) {
                class602.field8408.field4328 = field9329[--field9331] == 1;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field9329[--field9331];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class602.field8408.field4325 = var219;
                class174.method1190(0, class618.field8566);
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6017) {
                class602.field8408.field4339 = field9329[--field9331] == 1;
                class598.method3319((byte) -78);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field9329[--field9331];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class602.field8408.field4310 = var220;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field9329[--field9331];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class602.field8408.field4323 != var221) {
                    if (class602.field8408.field4323 == 0 && class275.field3659 != -1) {
                        class571.method3154(class654.field9309, var221, false, (byte) -117, class275.field3659, 0);
                        class33.field460 = false;
                    } else if (var221 == 0) {
                        class166.method1017((byte) -24);
                        class33.field460 = false;
                    } else {
                        class524.method2973((byte) 103, var221);
                    }
                    class602.field8408.field4323 = var221;
                }
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field9329[--field9331];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class602.field8408.field4329 = var222;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6021) {
                class602.field8408.field8871 = field9329[--field9331] == 1;
                class254.method1537((byte) 104);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field9329[--field9331];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (client.field9616 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class171.method1162(var223, 77);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                field9329[field9331++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field9329[--field9331];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class602.field8408.field4306 = var225;
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field9329[--field9331];
                if (var226 < 0 || var226 > class299.method1759(client.field9616, (byte) 73)) {
                    var226 = 0;
                }
                class602.field8408.field4317 = var226;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field9329[--field9331];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class516.method2928(var227 == 1, 0);
                return;
            }
            if (arg0 == 6028) {
                class602.field8408.field4343 = field9329[--field9331] != 0;
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6029) {
                class602.field8408.field4333 = field9329[--field9331];
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6030) {
                class602.field8408.field4319 = field9329[--field9331] != 0;
                class602.field8408.method3557(class312.field4206, -2);
                class446.method2514(false);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field9329[--field9331];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class174.method1190(0, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field9329[--field9331];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class602.field8408.field4344 = var229;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field9329[--field9331];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class602.field8408.field4338 = var230;
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6034) {
                class602.field8408.field4311 = field9329[--field9331] == 1;
                class602.field8408.method3557(class312.field4206, -2);
                class595.method3305((byte) 91);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6035) {
                class602.field8408.field8865 = field9329[--field9331] == 1;
                class446.method2514(false);
                class254.method1537((byte) -75);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field9329[--field9331];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class602.field8408.method3558(var231, (byte) 105);
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field9329[--field9331];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class602.field8408.field4320 = var232;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field9329[--field9331];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class602.field8408.field4334 != var233 && class436.field5812 == class275.field3659) {
                    if (class602.field8408.field4334 == 0) {
                        class571.method3154(class654.field9309, var233, false, (byte) -104, class275.field3659, 0);
                        class33.field460 = false;
                    } else if (var233 == 0) {
                        class166.method1017((byte) -120);
                        class33.field460 = false;
                    } else {
                        class524.method2973((byte) 103, var233);
                    }
                }
                class602.field8408.field4334 = var233;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field9329[--field9331];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class602.field8408.field4342 != var234) {
                    class602.field8408.field4342 = var234;
                    class602.field8408.method3557(class312.field4206, -2);
                    class375.field4974 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field9329[field9331++] = class602.field8408.field4303;
                return;
            }
            if (arg0 == 6102) {
                field9329[field9331++] = class602.field8408.method3566(class618.field8566, true) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field9329[field9331++] = class602.field8408.field4321 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field9329[field9331++] = class602.field8408.field4300 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field9329[field9331++] = class602.field8408.field4298 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field9329[field9331++] = class602.field8408.field4333;
                return;
            }
            if (arg0 == 6108) {
                field9329[field9331++] = class602.field8408.field4312 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field9329[field9331++] = class602.field8408.field4340 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field9329[field9331++] = class602.field8408.field4314 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field9329[field9331++] = class602.field8408.method1870((byte) -106, class618.field8566);
                return;
            }
            if (arg0 == 6112) {
                field9329[field9331++] = class602.field8408.method1868(class618.field8566, 1) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field9329[field9331++] = class602.field8408.field4322 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field9329[field9331++] = class602.field8408.field4328 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field9329[field9331++] = class602.field8408.field4325;
                return;
            }
            if (arg0 == 6117) {
                field9329[field9331++] = class602.field8408.field4339 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field9329[field9331++] = class602.field8408.field4310;
                return;
            }
            if (arg0 == 6119) {
                field9329[field9331++] = class602.field8408.field4323;
                return;
            }
            if (arg0 == 6120) {
                field9329[field9331++] = class602.field8408.field4329;
                return;
            }
            if (arg0 == 6121) {
                field9329[field9331++] = class146.field1963.method1106() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field9329[field9331++] = class452.method2542((byte) -78);
                return;
            }
            if (arg0 == 6124) {
                field9329[field9331++] = class602.field8408.field4306;
                return;
            }
            if (arg0 == 6125) {
                field9329[field9331++] = class602.field8408.field4317;
                return;
            }
            if (arg0 == 6126) {
                field9329[field9331++] = class146.field1963.method1100() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field9329[field9331++] = class602.field8408.field4335 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field9329[field9331++] = class602.field8408.field4343 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field9329[field9331++] = class602.field8408.field4333;
                return;
            }
            if (arg0 == 6130) {
                field9329[field9331++] = class602.field8408.field4319 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field9329[field9331++] = class618.field8566;
                return;
            }
            if (arg0 == 6132) {
                field9329[field9331++] = class602.field8408.field4344;
                return;
            }
            if (arg0 == 6133) {
                field9329[field9331++] = class312.field4206.field5176 && !class312.field4206.field5192 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field9329[field9331++] = class299.method1759(client.field9616, (byte) 104);
                return;
            }
            if (arg0 == 6135) {
                field9329[field9331++] = class602.field8408.field4338;
                return;
            }
            if (arg0 == 6136) {
                field9329[field9331++] = class602.field8408.field4311 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field9329[field9331++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field9329[field9331++] = class87.method479(class618.field8566, 0, 200);
                return;
            }
            if (arg0 == 6139) {
                field9329[field9331++] = class602.field8408.method3561(false, class618.field8566);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class17.method107(class618.field8566, -2358) && client.field9616 < 96) {
                    var236 = 1;
                }
                field9329[field9331++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (client.field9616 < 96) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field9329[field9331++] = class602.field8408.field4320;
                return;
            }
            if (arg0 == 6143) {
                field9329[field9331++] = class602.field8408.field4334;
                return;
            }
            if (arg0 == 6144) {
                field9329[field9331++] = class9.field76 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field9329[field9331++] = class602.field8408.field4342;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field9331 -= 2;
                class627.field8684 = (short) field9329[field9331];
                if (class627.field8684 <= 0) {
                    class627.field8684 = 256;
                }
                class598.field8226 = (short) field9329[field9331 + 1];
                if (class598.field8226 <= 0) {
                    class598.field8226 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field9331 -= 2;
                class535.field7354 = (short) field9329[field9331];
                if (class535.field7354 <= 0) {
                    class535.field7354 = 256;
                }
                class17.field219 = (short) field9329[field9331 + 1];
                if (class17.field219 <= 0) {
                    class17.field219 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field9331 -= 4;
                class618.field8582 = (short) field9329[field9331];
                if (class618.field8582 <= 0) {
                    class618.field8582 = 1;
                }
                class516.field7169 = (short) field9329[field9331 + 1];
                if (class516.field7169 <= 0) {
                    class516.field7169 = 32767;
                } else if (class516.field7169 < class618.field8582) {
                    class516.field7169 = class618.field8582;
                }
                class425.field5730 = (short) field9329[field9331 + 2];
                if (class425.field5730 <= 0) {
                    class425.field5730 = 1;
                }
                class385.field5147 = (short) field9329[field9331 + 3];
                if (class385.field5147 <= 0) {
                    class385.field5147 = 32767;
                    return;
                }
                if (class385.field5147 < class425.field5730) {
                    class385.field5147 = class425.field5730;
                }
                return;
            }
            if (arg0 == 6203) {
                class669.method3802(0, 0, class302.field3995.field5672, class302.field3995.field5561, 67, false);
                field9329[field9331++] = class96.field1161;
                field9329[field9331++] = class520.field7209;
                return;
            }
            if (arg0 == 6204) {
                field9329[field9331++] = class535.field7354;
                field9329[field9331++] = class17.field219;
                return;
            }
            if (arg0 == 6205) {
                field9329[field9331++] = class627.field8684;
                field9329[field9331++] = class598.field8226;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field9329[field9331++] = (int) (class529.method2982((byte) -69) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field9329[field9331++] = (int) (class529.method2982((byte) -69) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field9331 -= 3;
                int var237 = field9329[field9331];
                int var238 = field9329[field9331 + 1];
                int var239 = field9329[field9331 + 2];
                field9343.clear();
                field9343.set(11, 12);
                field9343.set(var239, var238, var237);
                int var240 = (int) (field9343.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field9329[field9331++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field9343.clear();
                field9343.setTime(new Date(class529.method2982((byte) -69)));
                field9329[field9331++] = field9343.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field9329[--field9331];
                boolean var242 = true;
                if (var241 < 0) {
                    var242 = (var241 + 1) % 4 == 0;
                } else if (var241 < 1582) {
                    var242 = var241 % 4 == 0;
                } else if (var241 % 4 != 0) {
                    var242 = false;
                } else if (var241 % 100 != 0) {
                    var242 = true;
                } else if (var241 % 400 != 0) {
                    var242 = false;
                }
                field9329[field9331++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field9329[field9331++] = class576.method3177(false) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field9329[field9331++] = class465.method2592((byte) -128) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class576.field7861 == 7 && class420.field5513 == 0 && class589.field8123 == 0) {
                    if (class30.field427) {
                        field9329[field9331++] = 0;
                        return;
                    }
                    if (class4.field36 > class529.method2982((byte) -69) - 1000L) {
                        field9329[field9331++] = 1;
                        return;
                    }
                    class30.field427 = true;
                    class229 var243 = class97.method550(class71.field841, false, class137.field1874);
                    var243.field2971.method958(0, class235.field3124);
                    class307.method1805(var243, -14704);
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class277 var244 = class305.method1788((byte) 123);
                if (var244 != null) {
                    field9329[field9331++] = var244.field3675;
                    field9329[field9331++] = var244.field5256;
                    field9327[field9345++] = var244.field3677;
                    class665 var245 = var244.method1658((byte) -114);
                    field9329[field9331++] = var245.field9461;
                    field9327[field9345++] = var245.field9460;
                    field9329[field9331++] = var244.field5262;
                    field9329[field9331++] = var244.field3671;
                    field9327[field9345++] = var244.field3678;
                    return;
                }
                field9329[field9331++] = -1;
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 6502) {
                class277 var246 = class637.method3525(true);
                if (var246 != null) {
                    field9329[field9331++] = var246.field3675;
                    field9329[field9331++] = var246.field5256;
                    field9327[field9345++] = var246.field3677;
                    class665 var247 = var246.method1658((byte) -114);
                    field9329[field9331++] = var247.field9461;
                    field9327[field9345++] = var247.field9460;
                    field9329[field9331++] = var246.field5262;
                    field9329[field9331++] = var246.field3671;
                    field9327[field9345++] = var246.field3678;
                    return;
                }
                field9329[field9331++] = -1;
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field9329[--field9331];
                String var249 = field9327[--field9345];
                if (class576.field7861 == 7 && class420.field5513 == 0 && class589.field8123 == 0) {
                    field9329[field9331++] = class647.method3594(var249, var248, 40000) ? 1 : 0;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class602.field8408.field4301 = field9329[--field9331];
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6505) {
                field9329[field9331++] = class602.field8408.field4301;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field9329[--field9331];
                class277 var251 = class393.method2264(var250, -110);
                if (var251 != null) {
                    field9329[field9331++] = var251.field5256;
                    field9327[field9345++] = var251.field3677;
                    class665 var252 = var251.method1658((byte) -114);
                    field9329[field9331++] = var252.field9461;
                    field9327[field9345++] = var252.field9460;
                    field9329[field9331++] = var251.field5262;
                    field9329[field9331++] = var251.field3671;
                    field9327[field9345++] = var251.field3678;
                    return;
                }
                field9329[field9331++] = -1;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                field9329[field9331++] = 0;
                field9329[field9331++] = 0;
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 6507) {
                field9331 -= 4;
                int var253 = field9329[field9331];
                boolean var254 = field9329[field9331 + 1] == 1;
                int var255 = field9329[field9331 + 2];
                boolean var256 = field9329[field9331 + 3] == 1;
                class651.method3656(var256, -38, var255, var254, var253);
                return;
            }
            if (arg0 == 6508) {
                class361.method2115(-5);
                return;
            }
            if (arg0 == 6509) {
                if (class576.field7861 != 7) {
                    return;
                }
                class132.field1835 = field9329[--field9331] == 1;
                return;
            }
            if (arg0 == 6510) {
                field9329[field9331++] = class693.field9779;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class602.field8408.field4332 = field9329[--field9331] == 1;
                class602.field8408.method3557(class312.field4206, -2);
                return;
            }
            if (arg0 == 6601) {
                field9329[field9331++] = class602.field8408.field4332 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class386.field5152 == class234.field3113) {
            if (arg0 == 6700) {
                int var257 = class152.field2079.method3060(0);
                if (class164.field2349 != -1) {
                    var257++;
                }
                field9329[field9331++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field9329[--field9331];
                if (class164.field2349 != -1) {
                    if (var258 == 0) {
                        field9329[field9331++] = class164.field2349;
                        return;
                    }
                    var258--;
                }
                class137 var259 = (class137) class152.field2079.method3053((byte) 101);
                while (var258-- > 0) {
                    var259 = (class137) class152.field2079.method3056(18113);
                }
                field9329[field9331++] = var259.field1870;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field9329[--field9331];
                if (class124.field1729[var260] == null) {
                    field9327[field9345++] = "";
                    return;
                }
                String var261 = class124.field1729[var260][0].field5607;
                if (var261 == null) {
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field9329[--field9331];
                if (class124.field1729[var262] == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = class124.field1729[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field9331 -= 2;
                int var263 = field9329[field9331];
                int var264 = field9329[field9331 + 1];
                if (class124.field1729[var263] == null) {
                    field9327[field9345++] = "";
                    return;
                }
                String var265 = class124.field1729[var263][var264].field5607;
                if (var265 == null) {
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field9331 -= 2;
                int var266 = field9329[field9331];
                int var267 = field9329[field9331 + 1];
                if (class124.field1729[var266] == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = class124.field1729[var266][var267].field5674;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field9331 -= 3;
                int var268 = field9329[field9331];
                int var269 = field9329[field9331 + 1];
                int var270 = field9329[field9331 + 2];
                class495.method2822(var268 << 16 | var269, var270, "", 1, 31868);
                return;
            }
            if (arg0 == 6708) {
                field9331 -= 3;
                int var271 = field9329[field9331];
                int var272 = field9329[field9331 + 1];
                int var273 = field9329[field9331 + 2];
                class495.method2822(var271 << 16 | var272, var273, "", 2, 31868);
                return;
            }
            if (arg0 == 6709) {
                field9331 -= 3;
                int var274 = field9329[field9331];
                int var275 = field9329[field9331 + 1];
                int var276 = field9329[field9331 + 2];
                class495.method2822(var274 << 16 | var275, var276, "", 3, 31868);
                return;
            }
            if (arg0 == 6710) {
                field9331 -= 3;
                int var277 = field9329[field9331];
                int var278 = field9329[field9331 + 1];
                int var279 = field9329[field9331 + 2];
                class495.method2822(var277 << 16 | var278, var279, "", 4, 31868);
                return;
            }
            if (arg0 == 6711) {
                field9331 -= 3;
                int var280 = field9329[field9331];
                int var281 = field9329[field9331 + 1];
                int var282 = field9329[field9331 + 2];
                class495.method2822(var280 << 16 | var281, var282, "", 5, 31868);
                return;
            }
            if (arg0 == 6712) {
                field9331 -= 3;
                int var283 = field9329[field9331];
                int var284 = field9329[field9331 + 1];
                int var285 = field9329[field9331 + 2];
                class495.method2822(var283 << 16 | var284, var285, "", 6, 31868);
                return;
            }
            if (arg0 == 6713) {
                field9331 -= 3;
                int var286 = field9329[field9331];
                int var287 = field9329[field9331 + 1];
                int var288 = field9329[field9331 + 2];
                class495.method2822(var286 << 16 | var287, var288, "", 7, 31868);
                return;
            }
            if (arg0 == 6714) {
                field9331 -= 3;
                int var289 = field9329[field9331];
                int var290 = field9329[field9331 + 1];
                int var291 = field9329[field9331 + 2];
                class495.method2822(var289 << 16 | var290, var291, "", 8, 31868);
                return;
            }
            if (arg0 == 6715) {
                field9331 -= 3;
                int var292 = field9329[field9331];
                int var293 = field9329[field9331 + 1];
                int var294 = field9329[field9331 + 2];
                class495.method2822(var292 << 16 | var293, var294, "", 9, 31868);
                return;
            }
            if (arg0 == 6716) {
                field9331 -= 3;
                int var295 = field9329[field9331];
                int var296 = field9329[field9331 + 1];
                int var297 = field9329[field9331 + 2];
                class495.method2822(var295 << 16 | var296, var297, "", 10, 31868);
                return;
            }
            if (arg0 == 6717) {
                field9331 -= 3;
                int var298 = field9329[field9331];
                int var299 = field9329[field9331 + 1];
                int var300 = field9329[field9331 + 2];
                class423 var301 = class546.method3064(-64, var298 << 16 | var299, var300);
                class364.method2122((byte) 3);
                class5 var302 = client.method3858(var301);
                class315.method1840(var302.method37((byte) 83), 0, var301, var302.field52);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field9329[--field9331];
                class83 var304 = class506.field6989.method2158(var303, (byte) -120);
                if (var304.field1003 == null) {
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = var304.field1003;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field9329[--field9331];
                class83 var306 = class506.field6989.method2158(var305, (byte) -128);
                field9329[field9331++] = var306.field999;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field9329[--field9331];
                class83 var308 = class506.field6989.method2158(var307, (byte) -128);
                field9329[field9331++] = var308.field989;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field9329[--field9331];
                class83 var310 = class506.field6989.method2158(var309, (byte) -117);
                field9329[field9331++] = var310.field991;
                return;
            }
            if (arg0 == 6804) {
                field9331 -= 2;
                int var311 = field9329[field9331];
                int var312 = field9329[field9331 + 1];
                class119 var313 = class15.field198.method3462((byte) -79, var312);
                if (var313.method695((byte) 89)) {
                    field9327[field9345++] = class506.field6989.method2158(var311, (byte) -122).method440((byte) 90, var312, var313.field1522);
                    return;
                }
                field9329[field9331++] = class506.field6989.method2158(var311, (byte) -126).method446(5, var313.field1521, var312);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field9329[field9331++] = class227.field2946 && !class187.field2601 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field9329[field9331++] = class322.field4308;
                return;
            }
            if (arg0 == 6902) {
                field9329[field9331++] = class378.field5013;
                return;
            }
            if (arg0 == 6903) {
                field9329[field9331++] = class597.field8220;
                return;
            }
            if (arg0 == 6904) {
                field9329[field9331++] = class22.field275;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class582.field7965 != null) {
                    if (class582.field7965.field9421 == null) {
                        var314 = class104.method575(class582.field7965.field9424, 7455);
                    } else {
                        var314 = (String) class582.field7965.field9421;
                    }
                }
                field9327[field9345++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field9329[field9331++] = class83.field1006;
                return;
            }
            if (arg0 == 6907) {
                field9329[field9331++] = class446.field5902;
                return;
            }
            if (arg0 == 6908) {
                field9329[field9331++] = class524.field7279;
                return;
            }
            if (arg0 == 6909) {
                field9329[field9331++] = class603.field8422 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field9329[field9331++] = class699.field9860;
                return;
            }
            if (arg0 == 6911) {
                field9329[field9331++] = class701.field9872;
                return;
            }
            if (arg0 == 6912) {
                field9329[field9331++] = class660.field9417;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class602.field8408.method3564(-24027);
                field9329[field9331++] = class602.field8408.field8874 = class618.field8566;
                field9329[field9331++] = var315;
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7001) {
                class602.field8408.method3570((byte) -128);
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7002) {
                class602.field8408.method3560((byte) 84);
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7003) {
                class602.field8408.method3562(-94);
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7004) {
                class602.field8408.method3571(true, 0);
                class446.method2514(false);
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7005) {
                class602.field8408.field4318 = 0;
                class602.field8408.method3557(class312.field4206, -2);
                class375.field4974 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class602.field8408.field8874 == 2) {
                    class602.field8408.field8862 = true;
                    return;
                }
                if (class602.field8408.field8874 == 1) {
                    class602.field8408.field8857 = true;
                    return;
                }
                if (class602.field8408.field8874 == 3) {
                    class602.field8408.field8868 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field9329[field9331++] = class602.field8408.field4318;
                return;
            }
            if (arg0 == 7008) {
                if (class618.field8566 == 0 && client.field9616 < 96) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(IZ)V")
    private static final void method3747(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field9331 -= 3;
                int var2 = field9329[field9331];
                int var3 = field9329[field9331 + 1];
                int var4 = field9329[field9331 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class423 var5 = class592.method3271(var2, (byte) -123);
                if (var5.field5647 == null) {
                    var5.field5647 = new class423[var4 + 1];
                }
                if (var5.field5647.length <= var4) {
                    class423[] var6 = new class423[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5647.length; var7++) {
                        var6[var7] = var5.field5647[var7];
                    }
                    var5.field5647 = var6;
                }
                if (var4 > 0 && var5.field5647[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class423 var8 = new class423();
                var8.field5598 = var3;
                var8.field5585 = var8.field5685 = var5.field5685;
                var8.field5610 = var4;
                var5.field5647[var4] = var8;
                if (arg1) {
                    field9330 = var8;
                } else {
                    field9338 = var8;
                }
                class552.method3091(var5, 12618);
                return;
            }
            if (arg0 == 101) {
                class423 var9 = arg1 ? field9330 : field9338;
                if (var9.field5610 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class423 var10 = class592.method3271(var9.field5685, (byte) -80);
                var10.field5647[var9.field5610] = null;
                class552.method3091(var10, 12618);
                return;
            }
            if (arg0 == 102) {
                class423 var11 = class592.method3271(field9329[--field9331], (byte) -125);
                var11.field5647 = null;
                class552.method3091(var11, 12618);
                return;
            }
            if (arg0 == 200) {
                field9331 -= 2;
                int var12 = field9329[field9331];
                int var13 = field9329[field9331 + 1];
                class423 var14 = class546.method3064(103, var12, var13);
                if (var14 != null && var13 != -1) {
                    field9329[field9331++] = 1;
                    if (arg1) {
                        field9330 = var14;
                        return;
                    }
                    field9338 = var14;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field9329[--field9331];
                class423 var16 = class592.method3271(var15, (byte) -95);
                if (var16 != null) {
                    field9329[field9331++] = 1;
                    if (arg1) {
                        field9330 = var16;
                        return;
                    }
                    field9338 = var16;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field9329[--field9331];
                method3749(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field9329[--field9331];
                method3742(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field9331 -= 2;
                int var19 = field9329[field9331];
                int var20 = field9329[field9331 + 1];
                for (int var21 = 0; var21 < class431.field5803.length; var21++) {
                    if (class431.field5803[var21] == var19) {
                        class408.field5369.field7810.method1859(5, class516.field7170, var21, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class394.field5266.length; var22++) {
                    if (class394.field5266[var22] == var19) {
                        class408.field5369.field7810.method1859(5, class516.field7170, var22, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field9331 -= 2;
                int var23 = field9329[field9331];
                int var24 = field9329[field9331 + 1];
                class408.field5369.field7810.method1858(var24, 125, var23);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field9329[--field9331] != 0;
                class408.field5369.field7810.method1855(var25, -125);
                return;
            }
            if (arg0 == 411) {
                field9331 -= 2;
                int var26 = field9329[field9331];
                int var27 = field9329[field9331 + 1];
                class408.field5369.field7810.method1857(var26, 103, var27, class87.field1058);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class423 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class592.method3271(field9329[--field9331], (byte) -91);
            } else {
                var28 = arg1 ? field9330 : field9338;
            }
            if (arg0 == 1000) {
                field9331 -= 4;
                var28.field5682 = field9329[field9331];
                var28.field5614 = field9329[field9331 + 1];
                int var29 = field9329[field9331 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field9329[field9331 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field5589 = (byte) var29;
                var28.field5629 = (byte) var30;
                class552.method3091(var28, 12618);
                class150.method881(var28, (byte) -120);
                if (var28.field5610 == -1) {
                    class470.method2710(var28.field5685, (byte) 100);
                }
                return;
            }
            if (arg0 == 1001) {
                field9331 -= 4;
                var28.field5656 = field9329[field9331];
                var28.field5571 = field9329[field9331 + 1];
                var28.field5638 = 0;
                var28.field5709 = 0;
                int var31 = field9329[field9331 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field9329[field9331 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field5591 = (byte) var31;
                var28.field5546 = (byte) var32;
                class552.method3091(var28, 12618);
                class150.method881(var28, (byte) -125);
                if (var28.field5598 == 0) {
                    class583.method3218(var28, (byte) 79, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field9329[--field9331] == 1;
                if (var28.field5681 != var33) {
                    var28.field5681 = var33;
                    class552.method3091(var28, 12618);
                }
                if (var28.field5610 == -1) {
                    class362.method2117(var28.field5685, (byte) 126);
                }
                return;
            }
            if (arg0 == 1004) {
                field9331 -= 2;
                var28.field5584 = field9329[field9331];
                var28.field5583 = field9329[field9331 + 1];
                class552.method3091(var28, 12618);
                class150.method881(var28, (byte) -114);
                if (var28.field5598 == 0) {
                    class583.method3218(var28, (byte) 114, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field5587 = field9329[--field9331] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class423 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class592.method3271(field9329[--field9331], (byte) -92);
            } else {
                var34 = arg1 ? field9330 : field9338;
            }
            if (arg0 == 1100) {
                field9331 -= 2;
                var34.field5550 = field9329[field9331];
                if (var34.field5550 > var34.field5595 - var34.field5561) {
                    var34.field5550 = var34.field5595 - var34.field5561;
                }
                if (var34.field5550 < 0) {
                    var34.field5550 = 0;
                }
                var34.field5640 = field9329[field9331 + 1];
                if (var34.field5640 > var34.field5603 - var34.field5672) {
                    var34.field5640 = var34.field5603 - var34.field5672;
                }
                if (var34.field5640 < 0) {
                    var34.field5640 = 0;
                }
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class67.method377((byte) -78, var34.field5685);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field5664 = field9329[--field9331];
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class549.method3076(var34.field5685, false);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field5556 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1103) {
                var34.field5608 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1104) {
                var34.field5677 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field9329[--field9331];
                if (var34.field5609 != var35) {
                    var34.field5609 = var35;
                    class552.method3091(var34, 12618);
                }
                if (var34.field5610 == -1) {
                    class13.method80(var34.field5685, 16163);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field5617 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1107) {
                var34.field5661 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1108) {
                var34.field5558 = 1;
                var34.field5643 = field9329[--field9331];
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class75.method410(var34.field5685, 1);
                }
                return;
            }
            if (arg0 == 1109) {
                field9331 -= 6;
                var34.field5649 = field9329[field9331];
                var34.field5699 = field9329[field9331 + 1];
                var34.field5711 = field9329[field9331 + 2];
                var34.field5630 = field9329[field9331 + 3];
                var34.field5648 = field9329[field9331 + 4];
                var34.field5623 = field9329[field9331 + 5];
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class355.method2092((byte) -28, var34.field5685);
                    class451.method2536(true, var34.field5685);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field9329[--field9331];
                if (var34.field5627 != var36) {
                    var34.field5627 = var36;
                    var34.field5572 = 0;
                    var34.field5555 = 1;
                    var34.field5680 = 0;
                    class186 var37 = var34.field5627 == -1 ? null : class423.field5620.method1707(var34.field5627, -86);
                    if (var37 != null) {
                        class407.method2313(var34.field5572, var37, 255);
                    }
                    class552.method3091(var34, 12618);
                }
                if (var34.field5610 == -1) {
                    class285.method1690(var34.field5685, 99);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field5714 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field9327[--field9345];
                if (!var38.equals(var34.field5704)) {
                    var34.field5704 = var38;
                    class552.method3091(var34, 12618);
                }
                if (var34.field5610 == -1) {
                    class679.method3869(-42, var34.field5685);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field5545 = field9329[--field9331];
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class631.method3501(var34.field5685, (byte) -123);
                }
                return;
            }
            if (arg0 == 1114) {
                field9331 -= 3;
                var34.field5670 = field9329[field9331];
                var34.field5580 = field9329[field9331 + 1];
                var34.field5667 = field9329[field9331 + 2];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1115) {
                var34.field5567 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1116) {
                var34.field5642 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1117) {
                var34.field5671 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1118) {
                var34.field5618 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1119) {
                var34.field5625 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1120) {
                field9331 -= 2;
                var34.field5595 = field9329[field9331];
                var34.field5603 = field9329[field9331 + 1];
                class552.method3091(var34, 12618);
                if (var34.field5598 == 0) {
                    class583.method3218(var34, (byte) -69, false);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field5573 = field9329[--field9331] == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1123) {
                var34.field5623 = field9329[--field9331];
                class552.method3091(var34, 12618);
                if (var34.field5610 == -1) {
                    class355.method2092((byte) -97, var34.field5685);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field9329[--field9331];
                var34.field5669 = var39 == 1;
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1125) {
                field9331 -= 2;
                var34.field5548 = field9329[field9331];
                var34.field5633 = field9329[field9331 + 1];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1126) {
                var34.field5701 = field9329[--field9331];
                class552.method3091(var34, 12618);
                return;
            }
            if (arg0 == 1127) {
                field9331 -= 2;
                int var40 = field9329[field9331];
                int var41 = field9329[field9331 + 1];
                class119 var42 = class15.field198.method3462((byte) -79, var40);
                if (var42.field1521 != var41) {
                    var34.method2395(false, var40, var41);
                    return;
                }
                var34.method2394(var40, (byte) 68);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field9329[--field9331];
                String var44 = field9327[--field9345];
                class119 var45 = class15.field198.method3462((byte) -79, var43);
                if (!var45.field1522.equals(var44)) {
                    var34.method2384((byte) 28, var44, var43);
                    return;
                }
                var34.method2394(var43, (byte) 32);
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class423 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class592.method3271(field9329[--field9331], (byte) -122);
            } else {
                var46 = arg1 ? field9330 : field9338;
            }
            class552.method3091(var46, 12618);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field9331 -= 2;
                int var47 = field9329[field9331];
                int var48 = field9329[field9331 + 1];
                if (var46.field5610 == -1) {
                    class348.method2067(7, var46.field5685);
                    class355.method2092((byte) -115, var46.field5685);
                    class451.method2536(true, var46.field5685);
                }
                if (var47 == -1) {
                    var46.field5558 = 1;
                    var46.field5643 = -1;
                    var46.field5552 = -1;
                    return;
                }
                var46.field5552 = var47;
                var46.field5557 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field5651 = true;
                } else {
                    var46.field5651 = false;
                }
                class584 var49 = class87.field1058.method1394(-69, var47);
                var46.field5711 = var49.field7997;
                var46.field5630 = var49.field8044;
                var46.field5648 = var49.field8012;
                var46.field5649 = var49.field8076;
                var46.field5699 = var49.field8055;
                var46.field5623 = var49.field8002;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field5663 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field5663 = 1;
                } else {
                    var46.field5663 = 2;
                }
                if (var46.field5638 > 0) {
                    var46.field5623 = var46.field5623 * 32 / var46.field5638;
                    return;
                }
                if (var46.field5656 > 0) {
                    var46.field5623 = var46.field5623 * 32 / var46.field5656;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field5558 = 2;
                var46.field5643 = field9329[--field9331];
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field5558 = 3;
                var46.field5643 = -1;
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field5558 = 6;
                var46.field5643 = field9329[--field9331];
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field5558 = 5;
                var46.field5643 = field9329[--field9331];
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
            if (arg0 == 1206) {
                field9331 -= 4;
                var46.field5689 = field9329[field9331];
                var46.field5703 = field9329[field9331 + 1];
                var46.field5639 = field9329[field9331 + 2];
                var46.field5577 = field9329[field9331 + 3];
                class552.method3091(var46, 12618);
                return;
            }
            if (arg0 == 1207) {
                field9331 -= 2;
                var46.field5678 = field9329[field9331];
                var46.field5641 = field9329[field9331 + 1];
                class552.method3091(var46, 12618);
                return;
            }
            if (arg0 == 1210) {
                field9331 -= 4;
                var46.field5643 = field9329[field9331];
                var46.field5551 = field9329[field9331 + 1];
                if (field9329[field9331 + 2] == 1) {
                    var46.field5558 = 9;
                } else {
                    var46.field5558 = 8;
                }
                if (field9329[field9331 + 3] == 1) {
                    var46.field5651 = true;
                } else {
                    var46.field5651 = false;
                }
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field5558 = 5;
                var46.field5643 = class423.field5702;
                var46.field5551 = 0;
                if (var46.field5610 == -1) {
                    class75.method410(var46.field5685, 1);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class423 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class592.method3271(field9329[--field9331], (byte) -112);
            } else {
                var50 = arg1 ? field9330 : field9338;
            }
            if (arg0 == 1300) {
                int var51 = field9329[--field9331] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method2397(-410, field9327[--field9345], var51);
                    return;
                }
                field9345--;
                return;
            }
            if (arg0 == 1301) {
                field9331 -= 2;
                int var52 = field9329[field9331];
                int var53 = field9329[field9331 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field5660 = null;
                    return;
                }
                var50.field5660 = class546.method3064(-32, var52, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field9329[--field9331];
                if (class242.field3189 != var54 && class520.field7207 != var54 && class590.field8142 != var54) {
                    return;
                }
                var50.field5691 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field5626 = field9329[--field9331];
                return;
            }
            if (arg0 == 1304) {
                var50.field5662 = field9329[--field9331];
                return;
            }
            if (arg0 == 1305) {
                var50.field5653 = field9327[--field9345];
                return;
            }
            if (arg0 == 1306) {
                var50.field5632 = field9327[--field9345];
                return;
            }
            if (arg0 == 1307) {
                var50.field5564 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field5650 = field9329[--field9331];
                var50.field5615 = field9329[--field9331];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field9329[--field9331];
                int var56 = field9329[--field9331];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method2401(var56 - 1, 126, var55);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field5605 = field9327[--field9345];
                return;
            }
            if (arg0 == 1311) {
                var50.field5588 = field9329[--field9331];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field9331 -= 3;
                    var57 = field9329[field9331] - 1;
                    var58 = field9329[field9331 + 1];
                    var59 = field9329[field9331 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field9331 -= 2;
                    var57 = 10;
                    var58 = field9329[field9331];
                    var59 = field9329[field9331 + 1];
                }
                if (var50.field5568 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field5568 = new byte[11];
                    var50.field5668 = new byte[11];
                    var50.field5606 = new int[11];
                }
                var50.field5568[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field5621 = false;
                    for (int var60 = 0; var60 < var50.field5568.length; var60++) {
                        if (var50.field5568[var60] != 0) {
                            var50.field5621 = true;
                            break;
                        }
                    }
                } else {
                    var50.field5621 = true;
                }
                var50.field5668[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field5562 = field9329[--field9331];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class423 var61;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var61 = class592.method3271(field9329[--field9331], (byte) -76);
            } else {
                var61 = arg1 ? field9330 : field9338;
            }
            if (arg0 == 1499) {
                var61.method2398(106);
                return;
            }
            String var62 = field9327[--field9345];
            int[] var63 = null;
            if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                int var64 = field9329[--field9331];
                if (var64 > 0) {
                    var63 = new int[var64];
                    while (var64-- > 0) {
                        var63[var64] = field9329[--field9331];
                    }
                }
                var62 = var62.substring(0, var62.length() - 1);
            }
            Object[] var65 = new Object[var62.length() + 1];
            for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                if (var62.charAt(var66 - 1) == 's') {
                    var65[var66] = field9327[--field9345];
                } else {
                    var65[var66] = Integer.valueOf(field9329[--field9331]);
                }
            }
            int var67 = field9329[--field9331];
            if (var67 == -1) {
                var65 = null;
            } else {
                var65[0] = Integer.valueOf(var67);
            }
            if (arg0 == 1400) {
                var61.field5679 = var65;
            } else if (arg0 == 1401) {
                var61.field5645 = var65;
            } else if (arg0 == 1402) {
                var61.field5554 = var65;
            } else if (arg0 == 1403) {
                var61.field5574 = var65;
            } else if (arg0 == 1404) {
                var61.field5637 = var65;
            } else if (arg0 == 1405) {
                var61.field5687 = var65;
            } else if (arg0 == 1406) {
                var61.field5635 = var65;
            } else if (arg0 == 1407) {
                var61.field5586 = var65;
                var61.field5559 = var63;
            } else if (arg0 == 1408) {
                var61.field5576 = var65;
            } else if (arg0 == 1409) {
                var61.field5613 = var65;
            } else if (arg0 == 1410) {
                var61.field5547 = var65;
            } else if (arg0 == 1411) {
                var61.field5688 = var65;
            } else if (arg0 == 1412) {
                var61.field5698 = var65;
            } else if (arg0 == 1414) {
                var61.field5707 = var65;
                var61.field5602 = var63;
            } else if (arg0 == 1415) {
                var61.field5652 = var65;
                var61.field5700 = var63;
            } else if (arg0 == 1416) {
                var61.field5544 = var65;
            } else if (arg0 == 1417) {
                var61.field5593 = var65;
            } else if (arg0 == 1418) {
                var61.field5690 = var65;
            } else if (arg0 == 1419) {
                var61.field5616 = var65;
            } else if (arg0 == 1420) {
                var61.field5673 = var65;
            } else if (arg0 == 1421) {
                var61.field5611 = var65;
            } else if (arg0 == 1422) {
                var61.field5686 = var65;
            } else if (arg0 == 1423) {
                var61.field5713 = var65;
            } else if (arg0 == 1424) {
                var61.field5579 = var65;
            } else if (arg0 == 1425) {
                var61.field5693 = var65;
            } else if (arg0 == 1426) {
                var61.field5566 = var65;
            } else if (arg0 == 1427) {
                var61.field5575 = var65;
            } else if (arg0 == 1428) {
                var61.field5578 = var65;
                var61.field5596 = var63;
            } else if (arg0 == 1429) {
                var61.field5666 = var65;
                var61.field5694 = var63;
            } else if (arg0 == 1430) {
                var61.field5634 = var65;
            }
            var61.field5646 = true;
            return;
        } else if (arg0 < 1600) {
            class423 var68 = arg1 ? field9330 : field9338;
            if (arg0 == 1500) {
                field9329[field9331++] = var68.field5570;
                return;
            }
            if (arg0 == 1501) {
                field9329[field9331++] = var68.field5654;
                return;
            }
            if (arg0 == 1502) {
                field9329[field9331++] = var68.field5561;
                return;
            }
            if (arg0 == 1503) {
                field9329[field9331++] = var68.field5672;
                return;
            }
            if (arg0 == 1504) {
                field9329[field9331++] = var68.field5681 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field9329[field9331++] = var68.field5585;
                return;
            }
            if (arg0 == 1506) {
                class423 var69 = class292.method1730(var68, (byte) -122);
                field9329[field9331++] = var69 == null ? -1 : var69.field5685;
                return;
            }
        } else if (arg0 < 1700) {
            class423 var70 = arg1 ? field9330 : field9338;
            if (arg0 == 1600) {
                field9329[field9331++] = var70.field5550;
                return;
            }
            if (arg0 == 1601) {
                field9329[field9331++] = var70.field5640;
                return;
            }
            if (arg0 == 1602) {
                field9327[field9345++] = var70.field5704;
                return;
            }
            if (arg0 == 1603) {
                field9329[field9331++] = var70.field5595;
                return;
            }
            if (arg0 == 1604) {
                field9329[field9331++] = var70.field5603;
                return;
            }
            if (arg0 == 1605) {
                field9329[field9331++] = var70.field5623;
                return;
            }
            if (arg0 == 1606) {
                field9329[field9331++] = var70.field5711;
                return;
            }
            if (arg0 == 1607) {
                field9329[field9331++] = var70.field5648;
                return;
            }
            if (arg0 == 1608) {
                field9329[field9331++] = var70.field5630;
                return;
            }
            if (arg0 == 1609) {
                field9329[field9331++] = var70.field5608;
                return;
            }
            if (arg0 == 1610) {
                field9329[field9331++] = var70.field5649;
                return;
            }
            if (arg0 == 1611) {
                field9329[field9331++] = var70.field5699;
                return;
            }
            if (arg0 == 1612) {
                field9329[field9331++] = var70.field5609;
                return;
            }
            if (arg0 == 1613) {
                int var71 = field9329[--field9331];
                class119 var72 = class15.field198.method3462((byte) -79, var71);
                if (var72.method695((byte) -77)) {
                    field9327[field9345++] = var70.method2388(true, var71, var72.field1522);
                    return;
                }
                field9329[field9331++] = var70.method2386(var71, var72.field1521, 0);
                return;
            }
            if (arg0 == 1614) {
                field9329[field9331++] = var70.field5617;
                return;
            }
        } else if (arg0 < 1800) {
            class423 var73 = arg1 ? field9330 : field9338;
            if (arg0 == 1700) {
                field9329[field9331++] = var73.field5552;
                return;
            }
            if (arg0 == 1701) {
                if (var73.field5552 != -1) {
                    field9329[field9331++] = var73.field5557;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field9329[field9331++] = var73.field5610;
                return;
            }
        } else if (arg0 < 1900) {
            class423 var74 = arg1 ? field9330 : field9338;
            if (arg0 == 1800) {
                field9329[field9331++] = client.method3858(var74).method37((byte) 87);
                return;
            }
            if (arg0 == 1801) {
                int var75 = field9329[--field9331];
                int var352 = var75 - 1;
                if (var74.field5564 != null && var352 < var74.field5564.length && var74.field5564[var352] != null) {
                    field9327[field9345++] = var74.field5564[var352];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var74.field5653 == null) {
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = var74.field5653;
                return;
            }
        } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
            class423 var350;
            if (arg0 >= 2000) {
                var350 = class592.method3271(field9329[--field9331], (byte) -101);
                arg0 -= 1000;
            } else {
                var350 = arg1 ? field9330 : field9338;
            }
            if (field9353 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var350.field5575 == null) {
                    return;
                }
                class274 var351 = new class274();
                var351.field3644 = var350;
                var351.field3639 = var350.field5575;
                var351.field3645 = field9353 + 1;
                class114.field1466.method2507(var351, (byte) -123);
                return;
            }
        } else if (arg0 < 2600) {
            class423 var76 = class592.method3271(field9329[--field9331], (byte) -74);
            if (arg0 == 2500) {
                field9329[field9331++] = var76.field5570;
                return;
            }
            if (arg0 == 2501) {
                field9329[field9331++] = var76.field5654;
                return;
            }
            if (arg0 == 2502) {
                field9329[field9331++] = var76.field5561;
                return;
            }
            if (arg0 == 2503) {
                field9329[field9331++] = var76.field5672;
                return;
            }
            if (arg0 == 2504) {
                field9329[field9331++] = var76.field5681 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field9329[field9331++] = var76.field5585;
                return;
            }
            if (arg0 == 1506) {
                class423 var77 = class292.method1730(var76, (byte) -122);
                field9329[field9331++] = var77 == null ? -1 : var77.field5685;
                return;
            }
        } else if (arg0 < 2700) {
            class423 var78 = class592.method3271(field9329[--field9331], (byte) -83);
            if (arg0 == 2600) {
                field9329[field9331++] = var78.field5550;
                return;
            }
            if (arg0 == 2601) {
                field9329[field9331++] = var78.field5640;
                return;
            }
            if (arg0 == 2602) {
                field9327[field9345++] = var78.field5704;
                return;
            }
            if (arg0 == 2603) {
                field9329[field9331++] = var78.field5595;
                return;
            }
            if (arg0 == 2604) {
                field9329[field9331++] = var78.field5603;
                return;
            }
            if (arg0 == 2605) {
                field9329[field9331++] = var78.field5623;
                return;
            }
            if (arg0 == 2606) {
                field9329[field9331++] = var78.field5711;
                return;
            }
            if (arg0 == 2607) {
                field9329[field9331++] = var78.field5648;
                return;
            }
            if (arg0 == 2608) {
                field9329[field9331++] = var78.field5630;
                return;
            }
            if (arg0 == 2609) {
                field9329[field9331++] = var78.field5608;
                return;
            }
            if (arg0 == 2610) {
                field9329[field9331++] = var78.field5649;
                return;
            }
            if (arg0 == 2611) {
                field9329[field9331++] = var78.field5699;
                return;
            }
            if (arg0 == 2612) {
                field9329[field9331++] = var78.field5609;
                return;
            }
            if (arg0 == 2613) {
                field9329[field9331++] = var78.field5617;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class423 var79 = class592.method3271(field9329[--field9331], (byte) -115);
                field9329[field9331++] = var79.field5552;
                return;
            }
            if (arg0 == 2701) {
                class423 var80 = class592.method3271(field9329[--field9331], (byte) -114);
                if (var80.field5552 != -1) {
                    field9329[field9331++] = var80.field5557;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var81 = field9329[--field9331];
                class137 var82 = (class137) class152.field2079.method3057(1, (long) var81);
                if (var82 != null) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class423 var83 = class592.method3271(field9329[--field9331], (byte) -76);
                if (var83.field5647 == null) {
                    field9329[field9331++] = 0;
                    return;
                }
                int var84 = var83.field5647.length;
                for (int var85 = 0; var85 < var83.field5647.length; var85++) {
                    if (var83.field5647[var85] == null) {
                        var84 = var85;
                        break;
                    }
                }
                field9329[field9331++] = var84;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field9331 -= 2;
                int var86 = field9329[field9331];
                int var87 = field9329[field9331 + 1];
                class137 var88 = (class137) class152.field2079.method3057(1, (long) var86);
                if (var88 != null && var88.field1870 == var87) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class423 var89 = class592.method3271(field9329[--field9331], (byte) -73);
            if (arg0 == 2800) {
                field9329[field9331++] = client.method3858(var89).method37((byte) 106);
                return;
            }
            if (arg0 == 2801) {
                int var90 = field9329[--field9331];
                int var353 = var90 - 1;
                if (var89.field5564 != null && var353 < var89.field5564.length && var89.field5564[var353] != null) {
                    field9327[field9345++] = var89.field5564[var353];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var89.field5653 == null) {
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = var89.field5653;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var91 = field9327[--field9345];
                class582.method3212((byte) -126, var91);
                return;
            }
            if (arg0 == 3101) {
                field9331 -= 2;
                class277.method1661(field9329[field9331 + 1], field9329[field9331], class408.field5369, (byte) -119);
                return;
            }
            if (arg0 == 3103) {
                class368.method2134(true, 0);
                return;
            }
            if (arg0 == 3104) {
                String var92 = field9327[--field9345];
                int var93 = 0;
                if (class15.method100(var92, (byte) -122)) {
                    var93 = class289.method1717(var92, -94);
                }
                field9340++;
                class229 var94 = class97.method550(class71.field841, false, class631.field8738);
                var94.field2971.method958(0, var93);
                class307.method1805(var94, -14704);
                return;
            }
            if (arg0 == 3105) {
                String var95 = field9327[--field9345];
                field9342++;
                class229 var96 = class97.method550(class71.field841, false, class463.field6069);
                var96.field2971.method915(-31914, var95.length() + 1);
                var96.field2971.method936(var95, 73);
                class307.method1805(var96, -14704);
                return;
            }
            if (arg0 == 3106) {
                String var97 = field9327[--field9345];
                field9346++;
                class229 var98 = class97.method550(class71.field841, false, class147.field1977);
                var98.field2971.method915(-31914, var97.length() + 1);
                var98.field2971.method936(var97, -95);
                class307.method1805(var98, -14704);
                return;
            }
            if (arg0 == 3107) {
                int var99 = field9329[--field9331];
                String var100 = field9327[--field9345];
                class138.method781(var99, 4, var100);
                return;
            }
            if (arg0 == 3108) {
                field9331 -= 3;
                int var101 = field9329[field9331];
                int var102 = field9329[field9331 + 1];
                int var103 = field9329[field9331 + 2];
                class423 var104 = class592.method3271(var103, (byte) -88);
                class250.method1512(var102, (byte) 20, var104, var101);
                return;
            }
            if (arg0 == 3109) {
                field9331 -= 2;
                int var105 = field9329[field9331];
                int var106 = field9329[field9331 + 1];
                class423 var107 = arg1 ? field9330 : field9338;
                class250.method1512(var106, (byte) 93, var107, var105);
                return;
            }
            if (arg0 == 3110) {
                int var108 = field9329[--field9331];
                field9332++;
                class229 var109 = class97.method550(class71.field841, false, class701.field9870);
                var109.field2971.method918(24551, var108);
                class307.method1805(var109, -14704);
                return;
            }
            if (arg0 == 3111) {
                field9331 -= 2;
                int var110 = field9329[field9331];
                int var111 = field9329[field9331 + 1];
                class137 var112 = (class137) class152.field2079.method3057(1, (long) var110);
                if (var112 != null) {
                    class3.method17(-1718294864, var112, var112.field1870 != var111, true);
                }
                class188.method1243(true, 3, var110, 125, var111);
                return;
            }
            if (arg0 == 3112) {
                field9331--;
                int var113 = field9329[field9331];
                class137 var114 = (class137) class152.field2079.method3057(1, (long) var113);
                if (var114 != null && var114.field1872 == 3) {
                    class3.method17(-1718294864, var114, true, true);
                }
                return;
            }
            if (arg0 == 3113) {
                class695.method3922((byte) 12, field9327[--field9345]);
                return;
            }
            if (arg0 == 3114) {
                field9331 -= 2;
                int var115 = field9329[field9331];
                int var116 = field9329[field9331 + 1];
                String var117 = field9327[--field9345];
                class116.method681("", "", "", 82, var116, var117, var115);
                return;
            }
            if (arg0 == 3115) {
                field9331 -= 11;
                class566[] var118 = class335.method1971(2);
                class286[] var119 = class190.method1252((byte) 119);
                class209.method1330(field9329[field9331 + 2], field9329[field9331 + 9], 6284, field9329[field9331 + 8], var118[field9329[field9331]], field9329[field9331 + 7], field9329[field9331 + 10], field9329[field9331 + 3], field9329[field9331 + 4], field9329[field9331 + 5], field9329[field9331 + 6], var119[field9329[field9331 + 1]]);
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field9331 -= 3;
                class493.method2816(field9329[field9331 + 1], field9329[field9331], 3, 255, field9329[field9331 + 2]);
                return;
            }
            if (arg0 == 3201) {
                class85.method462(50, 15629, field9329[--field9331], 255);
                return;
            }
            if (arg0 == 3202) {
                field9331 -= 2;
                class57.method334(0, field9329[field9331], field9329[field9331 + 1], 255);
                return;
            }
            if (arg0 == 3203) {
                field9331 -= 4;
                class493.method2816(field9329[field9331 + 1], field9329[field9331], 3, field9329[field9331 + 3], field9329[field9331 + 2]);
                return;
            }
            if (arg0 == 3204) {
                field9331 -= 3;
                class85.method462(field9329[field9331 + 2], 15629, field9329[field9331], field9329[field9331 + 1]);
                return;
            }
            if (arg0 == 3205) {
                field9331 -= 3;
                class57.method334(0, field9329[field9331], field9329[field9331 + 1], field9329[field9331 + 2]);
                return;
            }
            if (arg0 == 3206) {
                field9331 -= 4;
                class609.method3379(field9329[field9331], field9329[field9331 + 2], field9329[field9331 + 1], field9329[field9331 + 3], -98, false);
                return;
            }
            if (arg0 == 3207) {
                field9331 -= 4;
                class609.method3379(field9329[field9331], field9329[field9331 + 2], field9329[field9331 + 1], field9329[field9331 + 3], -91, true);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field9329[field9331++] = class327.field4404;
                return;
            }
            if (arg0 == 3301) {
                field9331 -= 2;
                int var120 = field9329[field9331];
                int var121 = field9329[field9331 + 1];
                field9329[field9331++] = class140.method791(var121, var120, -62, false);
                return;
            }
            if (arg0 == 3302) {
                field9331 -= 2;
                int var122 = field9329[field9331];
                int var123 = field9329[field9331 + 1];
                field9329[field9331++] = class658.method3766(false, var123, (byte) 86, var122);
                return;
            }
            if (arg0 == 3303) {
                field9331 -= 2;
                int var124 = field9329[field9331];
                int var125 = field9329[field9331 + 1];
                field9329[field9331++] = class584.method3233((byte) -124, var124, false, var125);
                return;
            }
            if (arg0 == 3304) {
                int var126 = field9329[--field9331];
                field9329[field9331++] = class504.field6946.method2255((byte) -88, var126).field6118;
                return;
            }
            if (arg0 == 3305) {
                int var127 = field9329[--field9331];
                field9329[field9331++] = class692.field9756[var127];
                return;
            }
            if (arg0 == 3306) {
                int var128 = field9329[--field9331];
                field9329[field9331++] = class592.field8160[var128];
                return;
            }
            if (arg0 == 3307) {
                int var129 = field9329[--field9331];
                field9329[field9331++] = class153.field2167[var129];
                return;
            }
            if (arg0 == 3308) {
                byte var130 = class408.field5369.field385;
                int var131 = (class408.field5369.field398 >> 9) + class125.field1745;
                int var132 = (class408.field5369.field397 >> 9) + class4.field23;
                field9329[field9331++] = (var130 << 28) + (var131 << 14) + var132;
                return;
            }
            if (arg0 == 3309) {
                int var133 = field9329[--field9331];
                field9329[field9331++] = var133 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var134 = field9329[--field9331];
                field9329[field9331++] = var134 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var135 = field9329[--field9331];
                field9329[field9331++] = var135 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field9329[field9331++] = class414.field5431 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field9331 -= 2;
                int var136 = field9329[field9331];
                int var137 = field9329[field9331 + 1];
                field9329[field9331++] = class140.method791(var137, var136, 29, true);
                return;
            }
            if (arg0 == 3314) {
                field9331 -= 2;
                int var138 = field9329[field9331];
                int var139 = field9329[field9331 + 1];
                field9329[field9331++] = class658.method3766(true, var139, (byte) 121, var138);
                return;
            }
            if (arg0 == 3315) {
                field9331 -= 2;
                int var140 = field9329[field9331];
                int var141 = field9329[field9331 + 1];
                field9329[field9331++] = class584.method3233((byte) -55, var140, true, var141);
                return;
            }
            if (arg0 == 3316) {
                if (class121.field1585 >= 2) {
                    field9329[field9331++] = class121.field1585;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field9329[field9331++] = class422.field5543;
                return;
            }
            if (arg0 == 3318) {
                field9329[field9331++] = class540.field7409.field3769;
                return;
            }
            if (arg0 == 3321) {
                field9329[field9331++] = class429.field5775;
                return;
            }
            if (arg0 == 3322) {
                field9329[field9331++] = class32.field453;
                return;
            }
            if (arg0 == 3323) {
                if (class572.field7776 >= 5 && class572.field7776 <= 9) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class572.field7776 >= 5 && class572.field7776 <= 9) {
                    field9329[field9331++] = class572.field7776;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field9329[field9331++] = class545.field7450 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field9329[field9331++] = class408.field5369.field7795;
                return;
            }
            if (arg0 == 3327) {
                field9329[field9331++] = class408.field5369.field7810.field4292 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field9329[field9331++] = class26.field344 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var142 = field9329[--field9331];
                field9329[field9331++] = class31.method193((byte) 6, false, var142);
                return;
            }
            if (arg0 == 3331) {
                field9331 -= 2;
                int var143 = field9329[field9331];
                int var144 = field9329[field9331 + 1];
                field9329[field9331++] = class273.method1646(false, (byte) -100, false, var144, var143);
                return;
            }
            if (arg0 == 3332) {
                field9331 -= 2;
                int var145 = field9329[field9331];
                int var146 = field9329[field9331 + 1];
                field9329[field9331++] = class273.method1646(true, (byte) -12, false, var146, var145);
                return;
            }
            if (arg0 == 3333) {
                field9329[field9331++] = class149.field2037;
                return;
            }
            if (arg0 == 3335) {
                field9329[field9331++] = class422.field5539;
                return;
            }
            if (arg0 == 3336) {
                field9331 -= 4;
                int var147 = field9329[field9331];
                int var148 = field9329[field9331 + 1];
                int var149 = field9329[field9331 + 2];
                int var150 = field9329[field9331 + 3];
                int var151 = (var148 << 14) + var147;
                int var152 = (var149 << 28) + var151;
                int var153 = var150 + var152;
                field9329[field9331++] = var153;
                return;
            }
            if (arg0 == 3337) {
                field9329[field9331++] = class190.field2640;
                return;
            }
            if (arg0 == 3338) {
                field9329[field9331++] = class485.method2785((byte) 104);
                return;
            }
            if (arg0 == 3339) {
                field9329[field9331++] = class257.field3368 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field9329[field9331++] = class327.field4400 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field9329[field9331++] = class523.field7236 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field9329[field9331++] = class409.field5387.method1890(16777215);
                return;
            }
            if (arg0 == 3343) {
                field9329[field9331++] = class409.field5387.method1893((byte) 106);
                return;
            }
            if (arg0 == 3344) {
                field9327[field9345++] = class5.method38((byte) 117);
                return;
            }
            if (arg0 == 3345) {
                field9327[field9345++] = class445.method2510(-120);
                return;
            }
            if (arg0 == 3346) {
                field9329[field9331++] = class448.method2528(true);
                return;
            }
            if (arg0 == 3347) {
                field9329[field9331++] = class431.field5790;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field9331 -= 2;
                int var154 = field9329[field9331];
                int var155 = field9329[field9331 + 1];
                class440 var156 = class340.field4573.method2135(var154, (byte) -84);
                field9327[field9345++] = var156.method2488((byte) -73, var155);
                return;
            }
            if (arg0 == 3408) {
                field9331 -= 4;
                int var157 = field9329[field9331];
                int var158 = field9329[field9331 + 1];
                int var159 = field9329[field9331 + 2];
                int var160 = field9329[field9331 + 3];
                class440 var161 = class340.field4573.method2135(var159, (byte) -87);
                if (var161.field5841 == var157 && var161.field5828 == var158) {
                    if (var158 == 115) {
                        field9327[field9345++] = var161.method2488((byte) -61, var160);
                        return;
                    }
                    field9329[field9331++] = var161.method2480((byte) 123, var160);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field9331 -= 3;
                int var162 = field9329[field9331];
                int var163 = field9329[field9331 + 1];
                int var164 = field9329[field9331 + 2];
                if (var163 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class440 var165 = class340.field4573.method2135(var163, (byte) -121);
                if (var165.field5828 != var162) {
                    throw new RuntimeException("C3409-1");
                }
                field9329[field9331++] = var165.method2482(5, var164) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var166 = field9329[--field9331];
                String var167 = field9327[--field9345];
                if (var166 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class440 var168 = class340.field4573.method2135(var166, (byte) -78);
                if (var168.field5828 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field9329[field9331++] = var168.method2481((byte) 92, var167) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var169 = field9329[--field9331];
                class440 var170 = class340.field4573.method2135(var169, (byte) -105);
                field9329[field9331++] = var170.field5844.method3060(0);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class94.field1142 == 0) {
                    field9329[field9331++] = -2;
                    return;
                }
                if (class94.field1142 == 1) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = class427.field5757;
                return;
            }
            if (arg0 == 3601) {
                int var171 = field9329[--field9331];
                if (class94.field1142 == 2 && var171 < class427.field5757) {
                    field9327[field9345++] = class82.field948[var171];
                    if (class292.field3854[var171] != null) {
                        field9327[field9345++] = class292.field3854[var171];
                        return;
                    }
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = "";
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var172 = field9329[--field9331];
                if (class94.field1142 == 2 && var172 < class427.field5757) {
                    field9329[field9331++] = class358.field4767[var172];
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var173 = field9329[--field9331];
                if (class94.field1142 == 2 && var173 < class427.field5757) {
                    field9329[field9331++] = class126.field1762[var173];
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var174 = field9327[--field9345];
                int var175 = field9329[--field9331];
                class32.method197(var175, var174, 1);
                return;
            }
            if (arg0 == 3605) {
                String var176 = field9327[--field9345];
                class83.method441(var176, (byte) 82);
                return;
            }
            if (arg0 == 3606) {
                String var177 = field9327[--field9345];
                class546.method3051(-69, var177);
                return;
            }
            if (arg0 == 3607) {
                String var178 = field9327[--field9345];
                class689.method3896(var178, -99, false);
                return;
            }
            if (arg0 == 3608) {
                String var179 = field9327[--field9345];
                class442.method2498(-128, var179);
                return;
            }
            if (arg0 == 3609) {
                String var180 = field9327[--field9345];
                if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                    var180 = var180.substring(7);
                }
                field9329[field9331++] = class473.method2730((byte) 92, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var181 = field9329[--field9331];
                if (class94.field1142 == 2 && var181 < class427.field5757) {
                    field9327[field9345++] = class143.field1936[var181];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class226.field2935 != null) {
                    field9327[field9345++] = class121.method717(class226.field2935, 9240);
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class226.field2935 != null) {
                    field9329[field9331++] = class354.field4728;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var182 = field9329[--field9331];
                if (class226.field2935 != null && var182 < class354.field4728) {
                    field9327[field9345++] = class267.field3491[var182].field4617;
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var183 = field9329[--field9331];
                if (class226.field2935 != null && var183 < class354.field4728) {
                    field9329[field9331++] = class267.field3491[var183].field4627;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var184 = field9329[--field9331];
                if (class226.field2935 != null && var184 < class354.field4728) {
                    field9329[field9331++] = class267.field3491[var184].field4616;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field9329[field9331++] = class565.field7708;
                return;
            }
            if (arg0 == 3617) {
                String var185 = field9327[--field9345];
                class666.method3795(var185, 327680);
                return;
            }
            if (arg0 == 3618) {
                field9329[field9331++] = class571.field7770;
                return;
            }
            if (arg0 == 3619) {
                String var186 = field9327[--field9345];
                class496.method2824(34336, var186);
                return;
            }
            if (arg0 == 3620) {
                class15.method99(false);
                return;
            }
            if (arg0 == 3621) {
                if (class94.field1142 == 0) {
                    field9329[field9331++] = -1;
                    return;
                }
                field9329[field9331++] = class52.field662;
                return;
            }
            if (arg0 == 3622) {
                int var187 = field9329[--field9331];
                if (class94.field1142 != 0 && var187 < class52.field662) {
                    field9327[field9345++] = class204.field2746[var187];
                    if (class104.field1242[var187] != null) {
                        field9327[field9345++] = class104.field1242[var187];
                        return;
                    }
                    field9327[field9345++] = "";
                    return;
                }
                field9327[field9345++] = "";
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var188 = field9327[--field9345];
                if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                    var188 = var188.substring(7);
                }
                field9329[field9331++] = class451.method2537(var188, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var189 = field9329[--field9331];
                if (class267.field3491 != null && var189 < class354.field4728 && class267.field3491[var189].field4620.equalsIgnoreCase(class408.field5369.field7791)) {
                    field9329[field9331++] = 1;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class144.field1945 != null) {
                    field9327[field9345++] = class144.field1945;
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var190 = field9329[--field9331];
                if (class226.field2935 != null && var190 < class354.field4728) {
                    field9327[field9345++] = class267.field3491[var190].field4626;
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var191 = field9329[--field9331];
                if (class94.field1142 == 2 && var191 >= 0 && var191 < class427.field5757) {
                    field9329[field9331++] = class199.field2701[var191] ? 1 : 0;
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var192 = field9327[--field9345];
                if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                    var192 = var192.substring(7);
                }
                field9329[field9331++] = class205.method1312((byte) 120, var192);
                return;
            }
            if (arg0 == 3629) {
                field9329[field9331++] = class671.field9545;
                return;
            }
            if (arg0 == 3630) {
                String var193 = field9327[--field9345];
                class689.method3896(var193, -106, true);
                return;
            }
            if (arg0 == 3631) {
                int var194 = field9329[--field9331];
                field9329[field9331++] = class85.field1029[var194] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var195 = field9329[--field9331];
                if (class226.field2935 != null && var195 < class354.field4728) {
                    field9327[field9345++] = class267.field3491[var195].field4620;
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var196 = field9329[--field9331];
                if (class94.field1142 != 0 && var196 < class52.field662) {
                    field9327[field9345++] = class420.field5517[var196];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var197 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var197].method1191(true);
                return;
            }
            if (arg0 == 3904) {
                int var198 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var198].field2460;
                return;
            }
            if (arg0 == 3905) {
                int var199 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var199].field2465;
                return;
            }
            if (arg0 == 3906) {
                int var200 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var200].field2459;
                return;
            }
            if (arg0 == 3907) {
                int var201 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var201].field2464;
                return;
            }
            if (arg0 == 3908) {
                int var202 = field9329[--field9331];
                field9329[field9331++] = class171.field2433[var202].field2472;
                return;
            }
            if (arg0 == 3910) {
                int var203 = field9329[--field9331];
                int var204 = class171.field2433[var203].method1189(-1);
                field9329[field9331++] = var204 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var205 = field9329[--field9331];
                int var206 = class171.field2433[var205].method1189(-1);
                field9329[field9331++] = var206 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var207 = field9329[--field9331];
                int var208 = class171.field2433[var207].method1189(-1);
                field9329[field9331++] = var208 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var209 = field9329[--field9331];
                int var210 = class171.field2433[var209].method1189(-1);
                field9329[field9331++] = var210 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field9331 -= 2;
                int var211 = field9329[field9331];
                int var212 = field9329[field9331 + 1];
                field9329[field9331++] = var211 + var212;
                return;
            }
            if (arg0 == 4001) {
                field9331 -= 2;
                int var213 = field9329[field9331];
                int var214 = field9329[field9331 + 1];
                field9329[field9331++] = var213 - var214;
                return;
            }
            if (arg0 == 4002) {
                field9331 -= 2;
                int var215 = field9329[field9331];
                int var216 = field9329[field9331 + 1];
                field9329[field9331++] = var215 * var216;
                return;
            }
            if (arg0 == 4003) {
                field9331 -= 2;
                int var217 = field9329[field9331];
                int var218 = field9329[field9331 + 1];
                field9329[field9331++] = var217 / var218;
                return;
            }
            if (arg0 == 4004) {
                int var219 = field9329[--field9331];
                field9329[field9331++] = (int) (Math.random() * (double) var219);
                return;
            }
            if (arg0 == 4005) {
                int var220 = field9329[--field9331];
                field9329[field9331++] = (int) (Math.random() * (double) (var220 + 1));
                return;
            }
            if (arg0 == 4006) {
                field9331 -= 5;
                int var221 = field9329[field9331];
                int var222 = field9329[field9331 + 1];
                int var223 = field9329[field9331 + 2];
                int var224 = field9329[field9331 + 3];
                int var225 = field9329[field9331 + 4];
                field9329[field9331++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                return;
            }
            if (arg0 == 4007) {
                field9331 -= 2;
                long var226 = (long) field9329[field9331];
                long var228 = (long) field9329[field9331 + 1];
                field9329[field9331++] = (int) (var226 * var228 / 100L + var226);
                return;
            }
            if (arg0 == 4008) {
                field9331 -= 2;
                int var230 = field9329[field9331];
                int var231 = field9329[field9331 + 1];
                field9329[field9331++] = var230 | 0x1 << var231;
                return;
            }
            if (arg0 == 4009) {
                field9331 -= 2;
                int var232 = field9329[field9331];
                int var233 = field9329[field9331 + 1];
                field9329[field9331++] = var232 & -(0x1 << var233) - 1;
                return;
            }
            if (arg0 == 4010) {
                field9331 -= 2;
                int var234 = field9329[field9331];
                int var235 = field9329[field9331 + 1];
                field9329[field9331++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field9331 -= 2;
                int var236 = field9329[field9331];
                int var237 = field9329[field9331 + 1];
                field9329[field9331++] = var236 % var237;
                return;
            }
            if (arg0 == 4012) {
                field9331 -= 2;
                int var238 = field9329[field9331];
                int var239 = field9329[field9331 + 1];
                if (var238 == 0) {
                    field9329[field9331++] = 0;
                    return;
                }
                field9329[field9331++] = (int) Math.pow((double) var238, (double) var239);
                return;
            }
            if (arg0 == 4013) {
                field9331 -= 2;
                int var240 = field9329[field9331];
                int var241 = field9329[field9331 + 1];
                if (var240 == 0) {
                    field9329[field9331++] = 0;
                    return;
                }
                if (var241 == 0) {
                    field9329[field9331++] = Integer.MAX_VALUE;
                    return;
                }
                field9329[field9331++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                return;
            }
            if (arg0 == 4014) {
                field9331 -= 2;
                int var242 = field9329[field9331];
                int var243 = field9329[field9331 + 1];
                field9329[field9331++] = var242 & var243;
                return;
            }
            if (arg0 == 4015) {
                field9331 -= 2;
                int var244 = field9329[field9331];
                int var245 = field9329[field9331 + 1];
                field9329[field9331++] = var244 | var245;
                return;
            }
            if (arg0 == 4016) {
                field9331 -= 2;
                int var246 = field9329[field9331];
                int var247 = field9329[field9331 + 1];
                field9329[field9331++] = var246 < var247 ? var246 : var247;
                return;
            }
            if (arg0 == 4017) {
                field9331 -= 2;
                int var248 = field9329[field9331];
                int var249 = field9329[field9331 + 1];
                field9329[field9331++] = var248 > var249 ? var248 : var249;
                return;
            }
            if (arg0 == 4018) {
                field9331 -= 3;
                long var250 = (long) field9329[field9331];
                long var252 = (long) field9329[field9331 + 1];
                long var254 = (long) field9329[field9331 + 2];
                field9329[field9331++] = (int) (var250 * var254 / var252);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var256 = field9327[--field9345];
                int var257 = field9329[--field9331];
                field9327[field9345++] = var256 + var257;
                return;
            }
            if (arg0 == 4101) {
                field9345 -= 2;
                String var258 = field9327[field9345];
                String var259 = field9327[field9345 + 1];
                field9327[field9345++] = var258 + var259;
                return;
            }
            if (arg0 == 4102) {
                String var260 = field9327[--field9345];
                int var261 = field9329[--field9331];
                field9327[field9345++] = var260 + class695.method3919(true, var261, -1);
                return;
            }
            if (arg0 == 4103) {
                String var262 = field9327[--field9345];
                field9327[field9345++] = var262.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field9327[field9345++] = method3738(field9329[--field9331]);
                return;
            }
            if (arg0 == 4105) {
                field9345 -= 2;
                String var263 = field9327[field9345];
                String var264 = field9327[field9345 + 1];
                if (class408.field5369.field7810 != null && class408.field5369.field7810.field4292) {
                    field9327[field9345++] = var264;
                    return;
                }
                field9327[field9345++] = var263;
                return;
            }
            if (arg0 == 4106) {
                int var265 = field9329[--field9331];
                field9327[field9345++] = Integer.toString(var265);
                return;
            }
            if (arg0 == 4107) {
                field9345 -= 2;
                field9329[field9331++] = class121.method712(class422.field5539, -6599, field9327[field9345 + 1], field9327[field9345]);
                return;
            }
            if (arg0 == 4108) {
                String var266 = field9327[--field9345];
                field9331 -= 2;
                int var267 = field9329[field9331];
                int var268 = field9329[field9331 + 1];
                class658 var269 = class538.method3027(var268, 0, class208.field2785, 0);
                field9329[field9331++] = var269.method3758(169, class369.field4849, var266, var267);
                return;
            }
            if (arg0 == 4109) {
                String var270 = field9327[--field9345];
                field9331 -= 2;
                int var271 = field9329[field9331];
                int var272 = field9329[field9331 + 1];
                class658 var273 = class538.method3027(var272, 0, class208.field2785, 0);
                field9329[field9331++] = var273.method3768(30061, class369.field4849, var271, var270);
                return;
            }
            if (arg0 == 4110) {
                field9345 -= 2;
                String var274 = field9327[field9345];
                String var275 = field9327[field9345 + 1];
                if (field9329[--field9331] == 1) {
                    field9327[field9345++] = var274;
                    return;
                }
                field9327[field9345++] = var275;
                return;
            }
            if (arg0 == 4111) {
                String var276 = field9327[--field9345];
                field9327[field9345++] = class663.method3784((byte) 104, var276);
                return;
            }
            if (arg0 == 4112) {
                String var277 = field9327[--field9345];
                int var278 = field9329[--field9331];
                if (var278 == -1) {
                    throw new RuntimeException("null char");
                }
                field9327[field9345++] = var277 + (char) var278;
                return;
            }
            if (arg0 == 4113) {
                int var279 = field9329[--field9331];
                field9329[field9331++] = class379.method2166(true, (char) var279) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var280 = field9329[--field9331];
                field9329[field9331++] = class114.method672((char) var280, true) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var281 = field9329[--field9331];
                field9329[field9331++] = class579.method3194((char) var281, (byte) 8) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var282 = field9329[--field9331];
                field9329[field9331++] = class696.method3929(-23838, (char) var282) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var283 = field9327[--field9345];
                if (var283 != null) {
                    field9329[field9331++] = var283.length();
                    return;
                }
                field9329[field9331++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var284 = field9327[--field9345];
                field9331 -= 2;
                int var285 = field9329[field9331];
                int var286 = field9329[field9331 + 1];
                field9327[field9345++] = var284.substring(var285, var286);
                return;
            }
            if (arg0 == 4119) {
                String var287 = field9327[--field9345];
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
                field9327[field9345++] = var288.toString();
                return;
            }
            if (arg0 == 4120) {
                String var292 = field9327[--field9345];
                field9331 -= 2;
                int var293 = field9329[field9331];
                int var294 = field9329[field9331 + 1];
                field9329[field9331++] = var292.indexOf(var293, var294);
                return;
            }
            if (arg0 == 4121) {
                field9345 -= 2;
                String var295 = field9327[field9345];
                String var296 = field9327[field9345 + 1];
                int var297 = field9329[--field9331];
                field9329[field9331++] = var295.indexOf(var296, var297);
                return;
            }
            if (arg0 == 4122) {
                int var298 = field9329[--field9331];
                field9329[field9331++] = Character.toLowerCase((char) var298);
                return;
            }
            if (arg0 == 4123) {
                int var299 = field9329[--field9331];
                field9329[field9331++] = Character.toUpperCase((char) var299);
                return;
            }
            if (arg0 == 4124) {
                boolean var300 = field9329[--field9331] != 0;
                int var301 = field9329[--field9331];
                field9327[field9345++] = class191.method1255((long) var301, 111, class422.field5539, var300, 0);
                return;
            }
            if (arg0 == 4125) {
                String var302 = field9327[--field9345];
                int var303 = field9329[--field9331];
                class658 var304 = class538.method3027(var303, 0, class208.field2785, 0);
                field9329[field9331++] = var304.method3767(class369.field4849, var302, 17674);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var305 = field9329[--field9331];
                field9327[field9345++] = class87.field1058.method1394(-55, var305).field8032;
                return;
            }
            if (arg0 == 4201) {
                field9331 -= 2;
                int var306 = field9329[field9331];
                int var307 = field9329[field9331 + 1];
                class584 var308 = class87.field1058.method1394(-45, var306);
                if (var307 >= 1 && var307 <= 5 && var308.field8007[var307 - 1] != null) {
                    field9327[field9345++] = var308.field8007[var307 - 1];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 4202) {
                field9331 -= 2;
                int var309 = field9329[field9331];
                int var310 = field9329[field9331 + 1];
                class584 var311 = class87.field1058.method1394(-59, var309);
                if (var310 >= 1 && var310 <= 5 && var311.field8008[var310 - 1] != null) {
                    field9327[field9345++] = var311.field8008[var310 - 1];
                    return;
                }
                field9327[field9345++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var312 = field9329[--field9331];
                field9329[field9331++] = class87.field1058.method1394(-123, var312).field8043;
                return;
            }
            if (arg0 == 4204) {
                int var313 = field9329[--field9331];
                field9329[field9331++] = class87.field1058.method1394(-99, var313).field8034 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var314 = field9329[--field9331];
                class584 var315 = class87.field1058.method1394(-62, var314);
                if (var315.field8006 == -1 && var315.field8068 >= 0) {
                    field9329[field9331++] = var315.field8068;
                    return;
                }
                field9329[field9331++] = var314;
                return;
            }
            if (arg0 == 4206) {
                int var316 = field9329[--field9331];
                class584 var317 = class87.field1058.method1394(-46, var316);
                if (var317.field8006 >= 0 && var317.field8068 >= 0) {
                    field9329[field9331++] = var317.field8068;
                    return;
                }
                field9329[field9331++] = var316;
                return;
            }
            if (arg0 == 4207) {
                int var318 = field9329[--field9331];
                field9329[field9331++] = class87.field1058.method1394(-100, var318).field8022 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field9331 -= 2;
                int var319 = field9329[field9331];
                int var320 = field9329[field9331 + 1];
                class119 var321 = class15.field198.method3462((byte) -79, var320);
                if (var321.method695((byte) -55)) {
                    field9327[field9345++] = class87.field1058.method1394(-88, var319).method3236(var320, 1248012962, var321.field1522);
                    return;
                }
                field9329[field9331++] = class87.field1058.method1394(-118, var319).method3223(var320, var321.field1521, (byte) -104);
                return;
            }
            if (arg0 == 4209) {
                field9331 -= 2;
                int var322 = field9329[field9331];
                int var323 = field9329[field9331 + 1] - 1;
                class584 var324 = class87.field1058.method1394(-91, var322);
                if (var324.field8003 == var323) {
                    field9329[field9331++] = var324.field8014;
                    return;
                }
                if (var324.field8031 == var323) {
                    field9329[field9331++] = var324.field8011;
                    return;
                }
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var325 = field9327[--field9345];
                int var326 = field9329[--field9331];
                class699.method3934(var325, var326 == 1, 71);
                field9329[field9331++] = class45.field546;
                return;
            }
            if (arg0 == 4211) {
                if (class608.field8456 != null && class551.field7523 < class45.field546) {
                    field9329[field9331++] = class608.field8456[class551.field7523++] & 0xFFFF;
                    return;
                }
                field9329[field9331++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class551.field7523 = 0;
                return;
            }
            if (arg0 == 4213) {
                int var327 = field9329[--field9331];
                field9329[field9331++] = class87.field1058.method1394(-97, var327).field8047;
                return;
            }
            if (arg0 == 4214) {
                String var328 = field9327[--field9345];
                field9331 -= 3;
                int var329 = field9329[field9331];
                int var330 = field9329[field9331 + 1];
                int var331 = field9329[field9331 + 2];
                class277.method1660(115, var330, var328, var329 == 1, var331);
                field9329[field9331++] = class45.field546;
                return;
            }
            if (arg0 == 4215) {
                field9345 -= 2;
                field9331 -= 2;
                String var332 = field9327[field9345];
                int var333 = field9329[field9331];
                int var334 = field9329[field9331 + 1];
                String var335 = field9327[field9345 + 1];
                class431.method2433(var335, -128, var333 == 1, var332, var334);
                field9329[field9331++] = class45.field546;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field9331 -= 2;
                int var336 = field9329[field9331];
                int var337 = field9329[field9331 + 1];
                class119 var338 = class15.field198.method3462((byte) -79, var337);
                if (var338.method695((byte) -100)) {
                    field9327[field9345++] = class440.field5847.method502(var336, -15704).method2202(var337, (byte) 26, var338.field1522);
                    return;
                }
                field9329[field9331++] = class440.field5847.method502(var336, -15704).method2200((byte) -102, var337, var338.field1521);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field9331 -= 2;
                int var339 = field9329[field9331];
                int var340 = field9329[field9331 + 1];
                class119 var341 = class15.field198.method3462((byte) -79, var340);
                if (var341.method695((byte) 96)) {
                    field9327[field9345++] = class118.field1510.method3921(var339, -86).method3325(true, var341.field1522, var340);
                    return;
                }
                field9329[field9331++] = class118.field1510.method3921(var339, -64).method3335(-59, var341.field1521, var340);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field9331 -= 2;
                int var342 = field9329[field9331];
                int var343 = field9329[field9331 + 1];
                class119 var344 = class15.field198.method3462((byte) -79, var343);
                if (var344.method695((byte) 52)) {
                    field9327[field9345++] = class554.field7565.method577(var342, 26).method3466(249, var343, var344.field1522);
                    return;
                }
                field9329[field9331++] = class554.field7565.method577(var342, 26).method3465(true, var344.field1521, var343);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var345 = field9329[--field9331];
            class266 var346 = class159.field2282.method3595(var345, 101);
            if (var346.field3455 != null && var346.field3455.length > 0) {
                int var347 = 0;
                int var348 = var346.field3464[0];
                for (int var349 = 1; var349 < var346.field3455.length; var349++) {
                    if (var346.field3464[var349] > var348) {
                        var347 = var349;
                        var348 = var346.field3464[var349];
                    }
                }
                field9329[field9331++] = var346.field3455[var347];
                return;
            }
            field9329[field9331++] = var346.field3476;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lada;I)V")
    private static final void method3748(class274 arg0, int arg1) {
        Object[] var2 = arg0.field3639;
        int var3 = (Integer) var2[0];
        class295 var4 = class600.method3327(false, var3);
        if (var4 == null) {
            return;
        }
        field9339 = new int[var4.field3912];
        int var5 = 0;
        field9337 = new String[var4.field3911];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field3652;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field3651;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field3644 == null ? -1 : arg0.field3644.field5685;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field3648;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field3644 == null ? -1 : arg0.field3644.field5610;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field3650 == null ? -1 : arg0.field3650.field5685;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field3650 == null ? -1 : arg0.field3650.field5610;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field3653;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field3640;
                }
                field9339[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field3646;
                }
                field9337[var6++] = var9;
            }
        }
        field9353 = arg0.field3645;
        method3745(var4, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    private static final void method3749(int arg0) {
        class423 var1 = class592.method3271(arg0, (byte) -118);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class423[] var3 = class651.field9139[var2];
        if (var3 == null) {
            class423[] var4 = class124.field1729[var2];
            int var5 = var4.length;
            var3 = class651.field9139[var2] = new class423[var5];
            class2.method7(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class2.method7(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lbr;II)V")
    public static final void method3750(class192 arg0, int arg1, int arg2) {
        class295 var3 = class581.method3210(arg1, arg2, arg0, -102);
        if (var3 == null) {
            return;
        }
        field9339 = new int[var3.field3912];
        field9337 = new String[var3.field3911];
        if (class284.field3756 == var3.field3907 || class309.field4187 == var3.field3907 || class226.field2936 == var3.field3907) {
            int var4 = 0;
            int var5 = 0;
            if (class418.field5502 != null) {
                var4 = class418.field5502.field5570;
                var5 = class418.field5502.field5654;
            }
            field9339[0] = class409.field5387.method1890(16777215) - var4;
            field9339[1] = class409.field5387.method1893((byte) 109) - var5;
        }
        method3745(var3, 200000);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "()V")
    public static void method3751() {
        field9339 = null;
        field9337 = null;
        field9349 = null;
        field9347 = null;
        field9329 = null;
        field9327 = null;
        field9328 = null;
        field9338 = null;
        field9330 = null;
        field9341 = null;
        field9343 = null;
        field9351 = null;
        field9350 = null;
        field9352 = null;
    }
}
