import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class362 {

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    private static int field5018 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    private static int field5019 = 0;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "[Lkv;")
    private static class16[] field5021 = new class16[50];

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "[I")
    private static int[] field5032 = new int[1000];

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[[I")
    private static int[][] field5020 = new int[5][5000];

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    private static int[] field5035 = new int[5];

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    private static int field5037 = 0;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "[Ljava/lang/String;")
    private static String[] field5039 = new String[1000];

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ljava/util/Calendar;")
    private static Calendar field5022 = Calendar.getInstance();

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[Ljava/lang/String;")
    private static String[] field5040 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[I")
    private static int[] field5041 = new int[3];

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Ljn;")
    public static class117 field5042 = new class117(4);

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    private static int field5043 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field5015;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field5031;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lis;")
    private static class101 field5029;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lis;")
    private static class101 field5033;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lom;")
    private static class353 field5026;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[I")
    private static int[] field5023;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field5034;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method2164(String arg0, int arg1) {
        if (class447.field6459 == 0 && !(!class296.field4187 || class375.field5202) || class289.field4065) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class343.field4796.method2059(0, true))) {
            var3 = 0;
            arg0 = arg0.substring(class343.field4796.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4797.method2059(0, true))) {
            var3 = 1;
            arg0 = arg0.substring(class343.field4797.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4798.method2059(0, true))) {
            var3 = 2;
            arg0 = arg0.substring(class343.field4798.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4799.method2059(0, true))) {
            var3 = 3;
            arg0 = arg0.substring(class343.field4799.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4800.method2059(0, true))) {
            var3 = 4;
            arg0 = arg0.substring(class343.field4800.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4801.method2059(0, true))) {
            var3 = 5;
            arg0 = arg0.substring(class343.field4801.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4802.method2059(0, true))) {
            var3 = 6;
            arg0 = arg0.substring(class343.field4802.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4803.method2059(0, true))) {
            var3 = 7;
            arg0 = arg0.substring(class343.field4803.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4804.method2059(0, true))) {
            var3 = 8;
            arg0 = arg0.substring(class343.field4804.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4805.method2059(0, true))) {
            var3 = 9;
            arg0 = arg0.substring(class343.field4805.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4806.method2059(0, true))) {
            var3 = 10;
            arg0 = arg0.substring(class343.field4806.method2059(0, true).length());
        } else if (var2.startsWith(class343.field4807.method2059(0, true))) {
            var3 = 11;
            arg0 = arg0.substring(class343.field4807.method2059(0, true).length());
        } else if (class238.field3511 != 0) {
            if (var2.startsWith(class343.field4796.method2059(class238.field3511, true))) {
                var3 = 0;
                arg0 = arg0.substring(class343.field4796.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4797.method2059(class238.field3511, true))) {
                var3 = 1;
                arg0 = arg0.substring(class343.field4797.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4798.method2059(class238.field3511, true))) {
                var3 = 2;
                arg0 = arg0.substring(class343.field4798.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4799.method2059(class238.field3511, true))) {
                var3 = 3;
                arg0 = arg0.substring(class343.field4799.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4800.method2059(class238.field3511, true))) {
                var3 = 4;
                arg0 = arg0.substring(class343.field4800.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4801.method2059(class238.field3511, true))) {
                var3 = 5;
                arg0 = arg0.substring(class343.field4801.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4802.method2059(class238.field3511, true))) {
                var3 = 6;
                arg0 = arg0.substring(class343.field4802.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4803.method2059(class238.field3511, true))) {
                var3 = 7;
                arg0 = arg0.substring(class343.field4803.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4804.method2059(class238.field3511, true))) {
                var3 = 8;
                arg0 = arg0.substring(class343.field4804.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4805.method2059(class238.field3511, true))) {
                var3 = 9;
                arg0 = arg0.substring(class343.field4805.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4806.method2059(class238.field3511, true))) {
                var3 = 10;
                arg0 = arg0.substring(class343.field4806.method2059(class238.field3511, true).length());
            } else if (var2.startsWith(class343.field4807.method2059(class238.field3511, true))) {
                var3 = 11;
                arg0 = arg0.substring(class343.field4807.method2059(class238.field3511, true).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class343.field4808.method2059(0, true))) {
            var5 = 1;
            arg0 = arg0.substring(class343.field4808.method2059(0, true).length());
        } else if (var4.startsWith(class343.field4809.method2059(0, true))) {
            var5 = 2;
            arg0 = arg0.substring(class343.field4809.method2059(0, true).length());
        } else if (var4.startsWith(class343.field4810.method2059(0, true))) {
            var5 = 3;
            arg0 = arg0.substring(class343.field4810.method2059(0, true).length());
        } else if (var4.startsWith(class343.field4811.method2059(0, true))) {
            var5 = 4;
            arg0 = arg0.substring(class343.field4811.method2059(0, true).length());
        } else if (var4.startsWith(class343.field4812.method2059(0, true))) {
            var5 = 5;
            arg0 = arg0.substring(class343.field4812.method2059(0, true).length());
        } else if (class238.field3511 != 0) {
            if (var4.startsWith(class343.field4808.method2059(class238.field3511, true))) {
                var5 = 1;
                arg0 = arg0.substring(class343.field4808.method2059(class238.field3511, true).length());
            } else if (var4.startsWith(class343.field4809.method2059(class238.field3511, true))) {
                var5 = 2;
                arg0 = arg0.substring(class343.field4809.method2059(class238.field3511, true).length());
            } else if (var4.startsWith(class343.field4810.method2059(class238.field3511, true))) {
                var5 = 3;
                arg0 = arg0.substring(class343.field4810.method2059(class238.field3511, true).length());
            } else if (var4.startsWith(class343.field4811.method2059(class238.field3511, true))) {
                var5 = 4;
                arg0 = arg0.substring(class343.field4811.method2059(class238.field3511, true).length());
            } else if (var4.startsWith(class343.field4812.method2059(class238.field3511, true))) {
                var5 = 5;
                arg0 = arg0.substring(class343.field4812.method2059(class238.field3511, true).length());
            }
        }
        field5024++;
        class699 var6 = class452.method2630(class699.field9897, class597.field8636, (byte) 126);
        var6.field9908.method2753((byte) 107, 0);
        int var7 = var6.field9908.field6710;
        var6.field9908.method2753((byte) 88, var3);
        var6.field9908.method2753((byte) 63, var5);
        class421.method2490(arg0, var6.field9908, 0);
        var6.field9908.method2692((byte) -118, var6.field9908.field6710 - var7);
        class149.method1134(var6, true);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lor;I)V")
    private static final void method2165(class400 arg0, int arg1) {
        Object[] var2 = arg0.field5790;
        int var3 = (Integer) var2[0];
        class438 var4 = class137.method1046(-73, var3);
        if (var4 == null) {
            return;
        }
        field5023 = new int[var4.field6309];
        int var5 = 0;
        field5034 = new String[var4.field6296];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5785;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5791;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5783 == null ? -1 : arg0.field5783.field1577;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5787;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5783 == null ? -1 : arg0.field5783.field1528;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5776 == null ? -1 : arg0.field5776.field1577;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5776 == null ? -1 : arg0.field5776.field1528;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5792;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5780;
                }
                field5023[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5775;
                }
                field5034[var6++] = var9;
            }
        }
        field5043 = arg0.field5789;
        method2166(var4, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lvfa;I)V")
    private static final void method2166(class438 arg0, int arg1) {
        field5037 = 0;
        field5018 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6300;
        int[] var4 = arg0.field6301;
        byte var5 = -1;
        field5019 = 0;
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
                        method2177(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2168(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field5032[field5037++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field5032[field5037++] = class230.field3404.field3180[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class230.field3404.method1427(128, field5032[--field5037], var8);
                } else if (var43 == 3) {
                    field5039[field5018++] = arg0.field6299[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field5037 -= 2;
                    if (field5032[field5037 + 1] != field5032[field5037]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field5037 -= 2;
                    if (field5032[field5037 + 1] == field5032[field5037]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field5037 -= 2;
                    if (field5032[field5037] < field5032[field5037 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field5037 -= 2;
                    if (field5032[field5037] > field5032[field5037 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field5019 == 0) {
                        return;
                    }
                    class16 var9 = field5021[--field5019];
                    arg0 = var9.field258;
                    var3 = arg0.field6300;
                    var4 = arg0.field6301;
                    var2 = var9.field250;
                    field5023 = var9.field252;
                    field5034 = var9.field256;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field5032[field5037++] = class230.field3404.method1426(65, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class230.field3404.method1423(field5032[--field5037], var11, (byte) 74);
                } else if (var43 == 31) {
                    field5037 -= 2;
                    if (field5032[field5037] <= field5032[field5037 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field5037 -= 2;
                    if (field5032[field5037] >= field5032[field5037 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field5032[field5037++] = field5023[var4[var2]];
                } else if (var43 == 34) {
                    field5023[var4[var2]] = field5032[--field5037];
                } else if (var43 == 35) {
                    field5039[field5018++] = field5034[var4[var2]];
                } else if (var43 == 36) {
                    field5034[var4[var2]] = field5039[--field5018];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field5018 -= var12;
                    String var13 = class427.method2514(field5039, (byte) -22, var12, field5018);
                    field5039[field5018++] = var13;
                } else if (var43 == 38) {
                    field5037--;
                } else if (var43 == 39) {
                    field5018--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class438 var15 = class137.method1046(-77, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6309];
                    String[] var17 = new String[var15.field6296];
                    for (int var18 = 0; var18 < var15.field6307; var18++) {
                        var16[var18] = field5032[field5037 + var18 - var15.field6307];
                    }
                    for (int var19 = 0; var19 < var15.field6304; var19++) {
                        var17[var19] = field5039[field5018 + var19 - var15.field6304];
                    }
                    field5037 -= var15.field6307;
                    field5018 -= var15.field6304;
                    class16 var20 = new class16();
                    var20.field258 = arg0;
                    var20.field250 = var2;
                    var20.field252 = field5023;
                    var20.field256 = field5034;
                    if (field5019 >= field5021.length) {
                        throw new RuntimeException();
                    }
                    field5021[field5019++] = var20;
                    arg0 = var15;
                    var3 = var15.field6300;
                    var4 = var15.field6301;
                    var2 = -1;
                    field5023 = var16;
                    field5034 = var17;
                } else if (var43 == 42) {
                    field5032[field5037++] = class384.field5620[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class384.field5620[var21] = field5032[--field5037];
                    class172.method1272((byte) -92, var21);
                    class609.field8751 |= class331.field4580[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field5032[--field5037];
                    if (var24 >= 0 && var24 <= 5000) {
                        field5035[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field5020[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field5032[--field5037];
                    if (var28 < 0 || var28 >= field5035[var27]) {
                        throw new RuntimeException();
                    }
                    field5032[field5037++] = field5020[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field5037 -= 2;
                    int var30 = field5032[field5037];
                    if (var30 < 0 || var30 >= field5035[var29]) {
                        throw new RuntimeException();
                    }
                    field5020[var29][var30] = field5032[field5037 + 1];
                } else if (var43 == 47) {
                    String var31 = class39.field532[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field5039[field5018++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class39.field532[var32] = field5039[--field5018];
                    class141.method1110(var32, -81);
                } else if (var43 == 51) {
                    class482 var33 = arg0.field6303[var4[var2]];
                    class83 var34 = (class83) var33.method2818(-22803, (long) field5032[--field5037]);
                    if (var34 != null) {
                        var2 += var34.field1264;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6310 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6265).append(" ");
                for (int var41 = field5019 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field5021[var41].field258.field6265).append(" ");
                }
                var40.append("op: ").append(var5);
                class18.method200(var40.toString(), var42, 10296);
            } else {
                class300.method1846(4, "Clientscript error in: " + arg0.field6310, 0);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6310).append("\n");
                for (int var38 = field5019 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field5021[var38].field258.field6310).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class18.method200(var37.toString(), var42, 10296);
                class28.method269(32316, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method2167(int arg0) {
        if (arg0 == -1 || !class56.method437((byte) 61, arg0)) {
            return;
        }
        class101[] var1 = class265.field3806[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class101 var3 = var1[var2];
            if (var3.field1650 != null) {
                class400 var4 = new class400();
                var4.field5783 = var3;
                var4.field5790 = var3.field1650;
                method2165(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
    private static final void method2168(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field5032[field5037++] = class334.field4666;
                return;
            }
            if (arg0 == 5001) {
                field5037 -= 3;
                class334.field4666 = field5032[field5037];
                class284.field3974 = class231.method1514(field5032[field5037 + 1], (byte) -105);
                if (class284.field3974 == null) {
                    class284.field3974 = class84.field1270;
                }
                class413.field5890 = field5032[field5037 + 2];
                field5016++;
                class699 var2 = class452.method2630(class699.field9897, class125.field2057, (byte) 124);
                var2.field9908.method2753((byte) 76, class334.field4666);
                var2.field9908.method2753((byte) 120, class284.field3974.field9920);
                var2.field9908.method2753((byte) 72, class413.field5890);
                class149.method1134(var2, true);
                return;
            }
            if (arg0 == 5002) {
                field5018 -= 2;
                String var3 = field5039[field5018];
                String var4 = field5039[field5018 + 1];
                field5037 -= 2;
                int var5 = field5032[field5037];
                int var6 = field5032[field5037 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field5027++;
                class699 var7 = class452.method2630(class699.field9897, class530.field7815, (byte) 127);
                var7.field9908.method2753((byte) 82, class252.method1609(0, var3) + class252.method1609(0, var4) + 2);
                var7.field9908.method2703(false, var3);
                var7.field9908.method2753((byte) 69, var5 - 1);
                var7.field9908.method2753((byte) 78, var6);
                var7.field9908.method2703(false, var4);
                class149.method1134(var7, true);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field5032[--field5037];
                class284 var9 = class700.method3937(var8, 2048);
                String var10 = "";
                if (var9 != null && var9.field3977 != null) {
                    var10 = var9.field3977;
                }
                field5039[field5018++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field5032[--field5037];
                class284 var12 = class700.method3937(var11, 2048);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field3973;
                }
                field5032[field5037++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class284.field3974 == null) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = class284.field3974.field9920;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field5032[--field5037];
                class699 var15 = class452.method2630(class699.field9897, class482.field6898, (byte) 125);
                var15.field9908.method2753((byte) 68, var14);
                class149.method1134(var15, true);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field5039[--field5018];
                method2164(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field5018 -= 2;
                String var17 = field5039[field5018];
                String var18 = field5039[field5018 + 1];
                if (class447.field6459 != 0 || (!class296.field4187 || class375.field5202) && !class289.field4065) {
                    field5015++;
                    class699 var19 = class452.method2630(class699.field9897, class117.field1860, (byte) 127);
                    var19.field9908.method2753((byte) 63, 0);
                    int var20 = var19.field9908.field6710;
                    var19.field9908.method2703(false, var17);
                    class421.method2490(var18, var19.field9908, 0);
                    var19.field9908.method2692((byte) -126, var19.field9908.field6710 - var20);
                    class149.method1134(var19, true);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field5032[--field5037];
                class284 var22 = class700.method3937(var21, 2048);
                String var23 = "";
                if (var22 != null && var22.field3984 != null) {
                    var23 = var22.field3984;
                }
                field5039[field5018++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field5032[--field5037];
                class284 var25 = class700.method3937(var24, 2048);
                String var26 = "";
                if (var25 != null && var25.field3980 != null) {
                    var26 = var25.field3980;
                }
                field5039[field5018++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field5032[--field5037];
                class284 var28 = class700.method3937(var27, 2048);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field3983;
                }
                field5032[field5037++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class103.field1708 == null || class103.field1708.field3849 == null) {
                    var30 = class616.field8808;
                } else {
                    var30 = class103.field1708.method1698(true, 9878);
                }
                field5039[field5018++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field5032[field5037++] = class413.field5890;
                return;
            }
            if (arg0 == 5017) {
                field5032[field5037++] = class227.method1492(1);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field5032[--field5037];
                class284 var32 = class700.method3937(var31, 2048);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field3976;
                }
                field5032[field5037++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field5032[--field5037];
                class284 var35 = class700.method3937(var34, 2048);
                String var36 = "";
                if (var35 != null && var35.field3975 != null) {
                    var36 = var35.field3975;
                }
                field5039[field5018++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class103.field1708 == null || class103.field1708.field3849 == null) {
                    var37 = class616.field8808;
                } else {
                    var37 = class103.field1708.method1701(false, -1);
                }
                field5039[field5018++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field5032[--field5037];
                class284 var39 = class700.method3937(var38, 2048);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field3982;
                }
                field5032[field5037++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field5032[--field5037];
                class284 var42 = class700.method3937(var41, 2048);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field3972;
                }
                field5032[field5037++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field5032[--field5037];
                class284 var45 = class700.method3937(var44, 2048);
                String var46 = "";
                if (var45 != null && var45.field3978 != null) {
                    var46 = var45.field3978;
                }
                field5039[field5018++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field5032[--field5037];
                field5039[field5018++] = class304.field4254.method1455(107, var47).field3198;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field5032[--field5037];
                class208 var49 = class304.field4254.method1455(100, var48);
                if (var49.field3207 == null) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = var49.field3207.length;
                return;
            }
            if (arg0 == 5052) {
                field5037 -= 2;
                int var50 = field5032[field5037];
                int var51 = field5032[field5037 + 1];
                class208 var52 = class304.field4254.method1455(120, var50);
                int var53 = var52.field3207[var51];
                field5032[field5037++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field5032[--field5037];
                class208 var55 = class304.field4254.method1455(123, var54);
                if (var55.field3201 == null) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = var55.field3201.length;
                return;
            }
            if (arg0 == 5054) {
                field5037 -= 2;
                int var56 = field5032[field5037];
                int var57 = field5032[field5037 + 1];
                field5032[field5037++] = class304.field4254.method1455(123, var56).field3201[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field5032[--field5037];
                field5039[field5018++] = class116.field1840.method2157(var58, (byte) -89).method3207((byte) 93);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field5032[--field5037];
                class546 var60 = class116.field1840.method2157(var59, (byte) -98);
                if (var60.field8014 == null) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = var60.field8014.length;
                return;
            }
            if (arg0 == 5057) {
                field5037 -= 2;
                int var61 = field5032[field5037];
                int var62 = field5032[field5037 + 1];
                field5032[field5037++] = class116.field1840.method2157(var61, (byte) -64).field8014[var62];
                return;
            }
            if (arg0 == 5058) {
                field5026 = new class353();
                field5026.field4950 = field5032[--field5037];
                field5026.field4953 = class116.field1840.method2157(field5026.field4950, (byte) -80);
                field5026.field4949 = new int[field5026.field4953.method3201(false)];
                return;
            }
            if (arg0 == 5059) {
                field5036++;
                class699 var63 = class452.method2630(class699.field9897, class514.field7626, (byte) 127);
                var63.field9908.method2753((byte) 108, 0);
                int var64 = var63.field9908.field6710;
                var63.field9908.method2753((byte) 125, 0);
                var63.field9908.method2739((byte) -86, field5026.field4950);
                field5026.field4953.method3206(3264, var63.field9908, field5026.field4949);
                var63.field9908.method2692((byte) -112, var63.field9908.field6710 - var64);
                class149.method1134(var63, true);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field5039[--field5018];
                field5025++;
                class699 var66 = class452.method2630(class699.field9897, class309.field4301, (byte) 126);
                var66.field9908.method2753((byte) 83, 0);
                int var67 = var66.field9908.field6710;
                var66.field9908.method2703(false, var65);
                var66.field9908.method2739((byte) -86, field5026.field4950);
                field5026.field4953.method3206(3264, var66.field9908, field5026.field4949);
                var66.field9908.method2692((byte) -106, var66.field9908.field6710 - var67);
                class149.method1134(var66, true);
                return;
            }
            if (arg0 == 5061) {
                field5036++;
                class699 var68 = class452.method2630(class699.field9897, class514.field7626, (byte) 123);
                var68.field9908.method2753((byte) 115, 0);
                int var69 = var68.field9908.field6710;
                var68.field9908.method2753((byte) 81, 1);
                var68.field9908.method2739((byte) -86, field5026.field4950);
                field5026.field4953.method3206(3264, var68.field9908, field5026.field4949);
                var68.field9908.method2692((byte) -116, var68.field9908.field6710 - var69);
                class149.method1134(var68, true);
                return;
            }
            if (arg0 == 5062) {
                field5037 -= 2;
                int var70 = field5032[field5037];
                int var71 = field5032[field5037 + 1];
                field5032[field5037++] = class304.field4254.method1455(103, var70).field3209[var71];
                return;
            }
            if (arg0 == 5063) {
                field5037 -= 2;
                int var72 = field5032[field5037];
                int var73 = field5032[field5037 + 1];
                field5032[field5037++] = class304.field4254.method1455(122, var72).field3206[var73];
                return;
            }
            if (arg0 == 5064) {
                field5037 -= 2;
                int var74 = field5032[field5037];
                int var75 = field5032[field5037 + 1];
                if (var75 == -1) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = class304.field4254.method1455(126, var74).method1440((char) var75, true);
                return;
            }
            if (arg0 == 5065) {
                field5037 -= 2;
                int var76 = field5032[field5037];
                int var77 = field5032[field5037 + 1];
                if (var77 == -1) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = class304.field4254.method1455(126, var76).method1436((char) var77, -5807);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field5032[--field5037];
                field5032[field5037++] = class116.field1840.method2157(var78, (byte) -119).method3201(false);
                return;
            }
            if (arg0 == 5067) {
                field5037 -= 2;
                int var79 = field5032[field5037];
                int var80 = field5032[field5037 + 1];
                int var81 = class116.field1840.method2157(var79, (byte) -40).method3204(var80, 80).field4247;
                field5032[field5037++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field5037 -= 2;
                int var82 = field5032[field5037];
                int var83 = field5032[field5037 + 1];
                field5026.field4949[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field5037 -= 2;
                int var84 = field5032[field5037];
                int var85 = field5032[field5037 + 1];
                field5026.field4949[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field5037 -= 3;
                int var86 = field5032[field5037];
                int var87 = field5032[field5037 + 1];
                int var88 = field5032[field5037 + 2];
                class546 var89 = class116.field1840.method2157(var86, (byte) -99);
                if (var89.method3204(var87, 113).field4247 != 0) {
                    throw new RuntimeException("bad command");
                }
                field5032[field5037++] = var89.method3199(var88, (byte) 115, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field5039[--field5018];
                boolean var91 = field5032[--field5037] == 1;
                class186.method1328(var91, var90, 107);
                field5032[field5037++] = class252.field3647;
                return;
            }
            if (arg0 == 5072) {
                if (class53.field685 != null && class168.field2747 < class252.field3647) {
                    field5032[field5037++] = class53.field685[class168.field2747++] & 0xFFFF;
                    return;
                }
                field5032[field5037++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class168.field2747 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class236.field3494.method668(-105, 86)) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class236.field3494.method668(-66, 82)) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class236.field3494.method668(-99, 81)) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class14.method179(field5032[--field5037], (byte) 123);
                return;
            }
            if (arg0 == 5201) {
                field5032[field5037++] = class423.method2496(-4);
                return;
            }
            if (arg0 == 5205) {
                class595.method3404(-1, false, field5032[--field5037], -1, (byte) -6);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field5032[--field5037];
                class369 var93 = class161.method1221(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = var93.field5109;
                return;
            }
            if (arg0 == 5207) {
                class369 var94 = class161.method1209(field5032[--field5037]);
                if (var94 != null && var94.field5110 != null) {
                    field5039[field5018++] = var94.field5110;
                    return;
                }
                field5039[field5018++] = "";
                return;
            }
            if (arg0 == 5208) {
                field5032[field5037++] = class500.field7430;
                field5032[field5037++] = class259.field3710;
                return;
            }
            if (arg0 == 5209) {
                field5032[field5037++] = class404.field5808 + class161.field2628;
                field5032[field5037++] = class438.field6298 + class161.field2636;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field5032[--field5037];
                class369 var96 = class161.method1209(var95);
                if (var96 == null) {
                    field5032[field5037++] = 0;
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = var96.field5107 >> 14 & 0x3FFF;
                field5032[field5037++] = var96.field5107 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field5032[--field5037];
                class369 var98 = class161.method1209(var97);
                if (var98 == null) {
                    field5032[field5037++] = 0;
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = var98.field5105 - var98.field5106;
                field5032[field5037++] = var98.field5119 - var98.field5116;
                return;
            }
            if (arg0 == 5212) {
                class66 var99 = class68.method563((byte) -64);
                if (var99 == null) {
                    field5032[field5037++] = -1;
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = var99.field954;
                int var100 = var99.field953 << 28 | class161.field2628 + var99.field951 << 14 | class161.field2636 + var99.field952;
                field5032[field5037++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class66 var101 = class641.method3604(5621);
                if (var101 == null) {
                    field5032[field5037++] = -1;
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = var101.field954;
                int var102 = var101.field953 << 28 | class161.field2628 + var101.field951 << 14 | class161.field2636 + var101.field952;
                field5032[field5037++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field5032[--field5037];
                class369 var104 = class325.method1943(-1);
                if (var104 != null) {
                    boolean var105 = var104.method2208(var103 & 0x3FFF, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, true, field5041);
                    if (var105) {
                        class35.method301(field5041[1], field5041[2], 84);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field5037 -= 2;
                int var106 = field5032[field5037];
                int var107 = field5032[field5037 + 1];
                class346 var108 = class161.method1223(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class369 var110 = (class369) var108.method2112((byte) 11); var110 != null; var110 = (class369) var108.method2109(-111)) {
                    if (var110.field5109 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field5032[--field5037];
                class369 var112 = class161.method1209(var111);
                if (var112 == null) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = var112.field5103;
                return;
            }
            if (arg0 == 5220) {
                field5032[field5037++] = class238.field3515 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field5032[--field5037];
                class35.method301(var113 >> 14 & 0x3FFF, var113 & 0x3FFF, 57);
                return;
            }
            if (arg0 == 5222) {
                class369 var114 = class325.method1943(-1);
                if (var114 != null) {
                    boolean var115 = var114.method2212(field5041, 0, class404.field5808 + class161.field2628, class438.field6298 + class161.field2636);
                    if (var115) {
                        field5032[field5037++] = field5041[1];
                        field5032[field5037++] = field5041[2];
                        return;
                    }
                    field5032[field5037++] = -1;
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = -1;
                field5032[field5037++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field5037 -= 2;
                int var116 = field5032[field5037];
                int var117 = field5032[field5037 + 1];
                class595.method3404(var117 >> 14 & 0x3FFF, false, var116, var117 & 0x3FFF, (byte) -6);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field5032[--field5037];
                class369 var119 = class325.method1943(-1);
                if (var119 != null) {
                    boolean var120 = var119.method2208(var118 & 0x3FFF, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, true, field5041);
                    if (var120) {
                        field5032[field5037++] = field5041[1];
                        field5032[field5037++] = field5041[2];
                        return;
                    }
                    field5032[field5037++] = -1;
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = -1;
                field5032[field5037++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field5032[--field5037];
                class369 var122 = class325.method1943(-1);
                if (var122 != null) {
                    boolean var123 = var122.method2212(field5041, 0, var121 >> 14 & 0x3FFF, var121 & 0x3FFF);
                    if (var123) {
                        field5032[field5037++] = field5041[1];
                        field5032[field5037++] = field5041[2];
                        return;
                    }
                    field5032[field5037++] = -1;
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = -1;
                field5032[field5037++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class144.method1117(-1, field5032[--field5037]);
                return;
            }
            if (arg0 == 5227) {
                field5037 -= 2;
                int var124 = field5032[field5037];
                int var125 = field5032[field5037 + 1];
                class595.method3404(var125 >> 14 & 0x3FFF, true, var124, var125 & 0x3FFF, (byte) -6);
                return;
            }
            if (arg0 == 5228) {
                class310.field4303 = field5032[--field5037] == 1;
                return;
            }
            if (arg0 == 5229) {
                field5032[field5037++] = class310.field4303 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field5032[--field5037];
                class497.method2978(var126, 3);
                return;
            }
            if (arg0 == 5231) {
                field5037 -= 2;
                int var127 = field5032[field5037];
                boolean var128 = field5032[field5037 + 1] == 1;
                if (class187.field2933 != null) {
                    class435 var129 = class187.field2933.method2818(-22803, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method2549((byte) -41);
                        return;
                    }
                    if (var129 == null && var128) {
                        class435 var130 = new class435();
                        class187.field2933.method2816(var130, (long) var127, false);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field5032[--field5037];
                if (class187.field2933 != null) {
                    class435 var132 = class187.field2933.method2818(-22803, (long) var131);
                    field5032[field5037++] = var132 == null ? 0 : 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field5037 -= 2;
                int var133 = field5032[field5037];
                boolean var134 = field5032[field5037 + 1] == 1;
                if (class318.field4387 != null) {
                    class435 var135 = class318.field4387.method2818(-22803, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method2549((byte) 127);
                        return;
                    }
                    if (var135 == null && var134) {
                        class435 var136 = new class435();
                        class318.field4387.method2816(var136, (long) var133, false);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field5032[--field5037];
                if (class318.field4387 != null) {
                    class435 var138 = class318.field4387.method2818(-22803, (long) var137);
                    field5032[field5037++] = var138 == null ? 0 : 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field5032[field5037++] = class161.field2607 == null ? -1 : class161.field2607.field5109;
                return;
            }
            if (arg0 == 5236) {
                field5037 -= 2;
                int var139 = field5032[field5037];
                int var140 = field5032[field5037 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class540.method3178(var139, -125, var142, var141);
                if (var143 < 0) {
                    field5032[field5037++] = -1;
                    return;
                }
                field5032[field5037++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class277.method1725(11);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field5037 -= 2;
                int var144 = field5032[field5037];
                int var145 = field5032[field5037 + 1];
                class246.method1584((byte) 37, var145, 3, false, var144);
                field5032[field5037++] = class35.field490 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class35.field490 != null) {
                    class246.method1584((byte) -84, -1, class525.field7713.field5974, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class680[] var146 = class155.method1166(-110);
                field5032[field5037++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field5032[--field5037];
                class680[] var148 = class155.method1166(-126);
                field5032[field5037++] = var148[var147].field9677;
                field5032[field5037++] = var148[var147].field9674;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class525.field7713.field5976;
                int var150 = class525.field7713.field5965;
                int var151 = -1;
                class680[] var152 = class155.method1166(-105);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class680 var154 = var152[var153];
                    if (var154.field9677 == var149 && var154.field9674 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field5032[field5037++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field5032[field5037++] = class154.method1160(-17);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field5032[--field5037];
                if (var155 >= 1 && var155 <= 2) {
                    class246.method1584((byte) 87, -1, var155, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field5032[field5037++] = class525.field7713.field5974;
                return;
            }
            if (arg0 == 5309) {
                int var156 = field5032[--field5037];
                if (var156 >= 1 && var156 <= 2) {
                    class525.field7713.field5974 = var156;
                    class525.field7713.method3481(true, class653.field9220);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field5018 -= 2;
                String var157 = field5039[field5018];
                String var158 = field5039[field5018 + 1];
                int var159 = field5032[--field5037];
                field5017++;
                class699 var160 = class452.method2630(class699.field9897, class160.field2595, (byte) 127);
                var160.field9908.method2753((byte) 108, class252.method1609(0, var157) + class252.method1609(0, var158) + 1);
                var160.field9908.method2703(false, var157);
                var160.field9908.method2703(false, var158);
                var160.field9908.method2753((byte) 123, var159);
                class149.method1134(var160, true);
                return;
            }
            if (arg0 == 5401) {
                field5037 -= 2;
                class432.field6208[field5032[field5037]] = (short) class70.method575((byte) 111, field5032[field5037 + 1]);
                class430.field6132.method45(-15311);
                class430.field6132.method54(2);
                class564.field8259.method3738(-1118);
                class498.method2983(-124);
                return;
            }
            if (arg0 == 5405) {
                field5037 -= 2;
                int var161 = field5032[field5037];
                int var162 = field5032[field5037 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class115.field1833[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field5037 -= 7;
                int var163 = field5032[field5037];
                int var164 = field5032[field5037 + 1] << 1;
                int var165 = field5032[field5037 + 2];
                int var166 = field5032[field5037 + 3];
                int var167 = field5032[field5037 + 4];
                int var168 = field5032[field5037 + 5];
                int var169 = field5032[field5037 + 6];
                if (var163 >= 0 && var163 < 2 && class115.field1833[var163] != null && var164 >= 0 && var164 < class115.field1833[var163].length) {
                    class115.field1833[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class115.field1833[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class115.field1833[field5032[--field5037]].length >> 1;
                field5032[field5037++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class35.field490 != null) {
                    class246.method1584((byte) -91, -1, class525.field7713.field5974, false, -1);
                }
                if (class699.field9906 != null) {
                    class539.method3174((byte) -103);
                    System.exit(0);
                    return;
                }
                String var171 = class522.field7689 == null ? class198.method1389((byte) -55) : class522.field7689;
                class105.method884(false, class653.field9220, -1, var171, class76.field1182 == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class300.field4214 != null) {
                    if (class300.field4214.field8785 == null) {
                        var172 = class151.method1150(class300.field4214.field8786, -1469107176);
                    } else {
                        var172 = (String) class300.field4214.field8785;
                    }
                }
                field5039[field5018++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field5032[field5037++] = class653.field9220.field9983 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class35.field490 != null) {
                    class246.method1584((byte) -126, -1, class525.field7713.field5974, false, -1);
                }
                String var173 = field5039[--field5018];
                boolean var174 = field5032[--field5037] == 1;
                String var175 = class198.method1389((byte) -55) + var173;
                class105.method884(var174, class653.field9220, -1, var175, class76.field1182 == 1);
                return;
            }
            if (arg0 == 5422) {
                field5018 -= 2;
                String var176 = field5039[field5018];
                String var177 = field5039[field5018 + 1];
                int var178 = field5032[--field5037];
                if (var176.length() > 0) {
                    if (class700.field9919 == null) {
                        class700.field9919 = new String[class256.field3688[class486.field6942.field7806]];
                    }
                    class700.field9919[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class11.field137 == null) {
                        class11.field137 = new String[class256.field3688[class486.field6942.field7806]];
                    }
                    class11.field137[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field5039[--field5018]);
                return;
            }
            if (arg0 == 5424) {
                field5037 -= 11;
                class359.field5009 = field5032[field5037];
                class518.field7649 = field5032[field5037 + 1];
                class92.field1347 = field5032[field5037 + 2];
                class107.field1759 = field5032[field5037 + 3];
                class217.field3261 = field5032[field5037 + 4];
                class66.field949 = field5032[field5037 + 5];
                class180.field2851 = field5032[field5037 + 6];
                class196.field3067 = field5032[field5037 + 7];
                class346.field4887 = field5032[field5037 + 8];
                class437.field6295 = field5032[field5037 + 9];
                class366.field5088 = field5032[field5037 + 10];
                class468.field6754.method2077(0, class217.field3261);
                class468.field6754.method2077(0, class66.field949);
                class468.field6754.method2077(0, class180.field2851);
                class468.field6754.method2077(0, class196.field3067);
                class468.field6754.method2077(0, class346.field4887);
                class564.field8257 = null;
                class314.field4360 = null;
                class288.field4049 = null;
                class296.field4184 = null;
                class473.field6795 = null;
                class221.field3304 = null;
                class618.field8822 = null;
                class608.field8738 = null;
                client.field1383 = true;
                return;
            }
            if (arg0 == 5425) {
                class521.method3073((byte) -108);
                client.field1383 = false;
                return;
            }
            if (arg0 == 5426) {
                field5037 -= 2;
                class266.field3822 = field5032[field5037];
                class333.field4640 = field5032[field5037 + 1];
                return;
            }
            if (arg0 == 5427) {
                field5037 -= 2;
                class254.field3673 = field5032[field5037 + 1];
                return;
            }
            if (arg0 == 5428) {
                field5037 -= 2;
                int var179 = field5032[field5037];
                int var180 = field5032[field5037 + 1];
                field5032[field5037++] = class666.method3754(var180, 1009, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class490.method2863(false, false, (byte) 56, field5039[--field5018]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class157.method1180((byte) 125, class492.field7063, "accountcreated");
                    return;
                } catch (Throwable var316) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class157.method1180((byte) 85, class492.field7063, "accountcreatestarted");
                    return;
                } catch (Throwable var317) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class477.field6830 != null) {
                    Transferable var182 = class477.field6830.getContents(null);
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
                field5039[field5018++] = var181;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field5037 -= 4;
                int var183 = field5032[field5037];
                int var184 = field5032[field5037 + 1];
                int var185 = field5032[field5037 + 2];
                int var186 = field5032[field5037 + 3];
                class549.method3222(var184 << 2, false, (var183 >> 14 & 0x3FFF) - class143.field2474, 256, var185, var186, (var183 & 0x3FFF) - class63.field917);
                return;
            }
            if (arg0 == 5501) {
                field5037 -= 4;
                int var187 = field5032[field5037];
                int var188 = field5032[field5037 + 1];
                int var189 = field5032[field5037 + 2];
                int var190 = field5032[field5037 + 3];
                class397.method2415(var189, var188 << 2, (var187 >> 14 & 0x3FFF) - class143.field2474, var190, 5277, (var187 & 0x3FFF) - class63.field917);
                return;
            }
            if (arg0 == 5502) {
                field5037 -= 6;
                int var191 = field5032[field5037];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class656.field9268 = var191;
                int var192 = field5032[field5037 + 1];
                if (var192 + 1 >= class115.field1833[class656.field9268].length >> 1) {
                    throw new RuntimeException();
                }
                class83.field1266 = var192;
                class256.field3693 = 0;
                class487.field6959 = field5032[field5037 + 2];
                class37.field492 = field5032[field5037 + 3];
                int var193 = field5032[field5037 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class638.field9054 = var193;
                int var194 = field5032[field5037 + 5];
                if (var194 + 1 >= class115.field1833[class638.field9054].length >> 1) {
                    throw new RuntimeException();
                }
                class173.field2788 = var194;
                class40.field544 = 3;
                class76.field1181 = -1;
                class294.field4104 = -1;
                return;
            }
            if (arg0 == 5503) {
                class25.method242(0);
                return;
            }
            if (arg0 == 5504) {
                field5037 -= 2;
                class199.method1398(field5032[field5037], field5032[field5037 + 1], 0, (byte) 116);
                return;
            }
            if (arg0 == 5505) {
                field5032[field5037++] = (int) class636.field9031 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field5032[field5037++] = (int) class473.field6790 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class14.method189((byte) -73);
                return;
            }
            if (arg0 == 5508) {
                class374.method2236((byte) -50);
                return;
            }
            if (arg0 == 5509) {
                class665.method3747((byte) 110);
                return;
            }
            if (arg0 == 5510) {
                class358.method2159(-128);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field5032[--field5037];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class143.field2474;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class430.field6136) {
                    var198 = class430.field6136;
                }
                int var199 = var197 - class63.field917;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class580.field8504) {
                    var199 = class580.field8504;
                }
                class386.field5659 = (var198 << 9) + 256;
                class108.field1761 = (var199 << 9) + 256;
                class40.field544 = 4;
                class76.field1181 = -1;
                class294.field4104 = -1;
                return;
            }
            if (arg0 == 5512) {
                class537.method3147(false);
                return;
            }
            if (arg0 == 5517) {
                int var200 = field5032[--field5037];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class143.field2474;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class430.field6136) {
                        var203 = class430.field6136;
                    }
                    int var204 = var202 - class63.field917;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class580.field8504) {
                        var204 = class580.field8504;
                    }
                    class294.field4104 = (var203 << 9) + 256;
                    class76.field1181 = (var204 << 9) + 256;
                    return;
                }
                class294.field4104 = -1;
                class76.field1181 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field5018 -= 2;
                String var205 = field5039[field5018];
                String var206 = field5039[field5018 + 1];
                int var207 = field5032[--field5037];
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    class616.field8808 = var205;
                    class330.field4563 = var206;
                    class70.field1107 = var207;
                    class595.method3408((byte) 109, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class382.method2281((byte) -123);
                return;
            }
            if (arg0 == 5602) {
                if (class160.field2597 == 0) {
                    class51.field676 = -2;
                    class565.field8267 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field5037 -= 4;
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    class260.method1644(field5032[field5037 + 3], field5032[field5037 + 1], (byte) -70, field5032[field5037 + 2], field5032[field5037]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field5018--;
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    class232.method1527(class294.method1798(true, field5039[field5018]), 6);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field5018 -= 2;
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    class550.method3229((byte) -84, false, field5039[field5018 + 1], class294.method1798(true, field5039[field5018]));
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class250.field3623 == 0) {
                    class693.field9848 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field5032[field5037++] = class565.field8267;
                return;
            }
            if (arg0 == 5608) {
                field5032[field5037++] = class461.field6628;
                return;
            }
            if (arg0 == 5609) {
                field5032[field5037++] = class693.field9848;
                return;
            }
            if (arg0 == 5610) {
                for (int var208 = 0; var208 < 5; var208++) {
                    field5039[field5018++] = class130.field2125 == null || class130.field2125.length <= var208 ? "" : class216.method1461(-7256, class130.field2125[var208]);
                }
                class130.field2125 = null;
                return;
            }
            if (arg0 == 5611) {
                field5032[field5037++] = class38.field510;
                return;
            }
            if (arg0 == 5612) {
                int var209 = field5032[--field5037];
                if (class515.field7636 != 7) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    if (class256.field3696 != null) {
                        class256.field3696.method913(-10406);
                        class256.field3696 = null;
                    }
                    class70.field1107 = var209;
                    class595.method3408((byte) 42, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field5032[field5037++] = class565.field8267;
                return;
            }
            if (arg0 == 5615) {
                field5018 -= 2;
                String var210 = field5039[field5018];
                String var211 = field5039[field5018 + 1];
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    if (class256.field3696 != null) {
                        class256.field3696.method913(-10406);
                        class256.field3696 = null;
                    }
                    class616.field8808 = var210;
                    class330.field4563 = var211;
                    class595.method3408((byte) 81, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class352.method2133(32074, false);
                return;
            }
            if (arg0 == 5617) {
                field5032[field5037++] = class51.field676;
                return;
            }
            if (arg0 == 5618) {
                int var212 = field5032[--field5037];
                class537.method3150(false, var212, 3);
                return;
            }
            if (arg0 == 5619) {
                int var213 = field5032[--field5037];
                class537.method3150(true, var213, 3);
                return;
            }
            if (arg0 == 5620) {
                class262.method1671(-18);
                if (class308.field4283 != "" && class308.field4283 != "") {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field5018 -= 2;
                if (class515.field7636 != 3) {
                    return;
                }
                if (class160.field2597 == 0 && class250.field3623 == 0) {
                    class550.method3229((byte) -105, true, field5039[field5018 + 1], class294.method1798(true, field5039[field5018]));
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class614 var214 = class653.field9220.method3949("3", 0, false);
                while (var214.field8787 == 0) {
                    class564.method3300((byte) -7, 1L);
                }
                if (var214.field8787 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class355 var215 = (class355) var214.field8785;
                if (var215.method2150(16384).exists()) {
                    class465 var216 = new class465(50);
                    try {
                        var215.method2149(var216.field6719, 50, 0, 1);
                    } catch (IOException var320) {
                    }
                }
                try {
                    var215.method2152(false);
                    return;
                } catch (Exception var319) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class640.field9072 != null) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field5032[field5037++] = (int) (class461.field6627 >> 32);
                field5032[field5037++] = (int) (class461.field6627 & 0xFFFFL);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var217 = field5032[--field5037];
                if (var217 < 1) {
                    var217 = 1;
                }
                if (var217 > 4) {
                    var217 = 4;
                }
                class525.field7713.field5966 = var217;
                class387.method2368((byte) 114);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6002) {
                class525.field7713.method3474(field5032[--field5037] == 1, 3);
                class387.method2368((byte) 42);
                class247.method1588(-98);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6003) {
                class525.field7713.field5968 = field5032[--field5037] == 1;
                class247.method1588(-104);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6005) {
                class525.field7713.field5962 = field5032[--field5037] == 1;
                class387.method2368((byte) 40);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6006) {
                class525.field7713.field5980 = field5032[--field5037] == 1;
                class637.field9048.method793(!class525.field7713.field5980);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6007) {
                class525.field7713.field5998 = field5032[--field5037];
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6008) {
                class525.field7713.field5996 = field5032[--field5037] == 1;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6009) {
                class525.field7713.field5986 = field5032[--field5037] == 1;
                class387.method2368((byte) 69);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6010) {
                class525.field7713.field6001 = field5032[--field5037] == 1;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6011) {
                int var218 = field5032[--field5037];
                if (var218 < 0 || var218 > 2) {
                    var218 = 0;
                }
                class525.field7713.method2488(class76.field1182, var218, -109);
                class387.method2368((byte) 80);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6012) {
                class525.field7713.method2481(26475, field5032[--field5037] == 1, class76.field1182);
                class69.method566((byte) -103);
                class403.method2433(-128);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6014) {
                class525.field7713.field5981 = field5032[--field5037] == 1;
                class387.method2368((byte) 41);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6015) {
                class525.field7713.field5972 = field5032[--field5037] == 1;
                class387.method2368((byte) 81);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6016) {
                int var219 = field5032[--field5037];
                if (var219 < 0 || var219 > 2) {
                    var219 = 0;
                }
                class525.field7713.field5969 = var219;
                class251.method1604(75, class76.field1182);
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6017) {
                class525.field7713.field5963 = field5032[--field5037] == 1;
                class702.method3945((byte) 85);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6018) {
                int var220 = field5032[--field5037];
                if (var220 < 0) {
                    var220 = 0;
                }
                if (var220 > 127) {
                    var220 = 127;
                }
                class525.field7713.field5973 = var220;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6019) {
                int var221 = field5032[--field5037];
                if (var221 < 0) {
                    var221 = 0;
                }
                if (var221 > 255) {
                    var221 = 255;
                }
                if (class525.field7713.field5991 != var221) {
                    if (class525.field7713.field5991 == 0 && class283.field3963 != -1) {
                        class513.method3050(class283.field3963, class97.field1451, var221, 0, 0, false);
                        class468.method2768((byte) -110);
                        class369.field5120 = false;
                    } else if (var221 == 0) {
                        class679.method3845((byte) -103);
                        class369.field5120 = false;
                    } else {
                        class39.method327(2, var221);
                    }
                    class525.field7713.field5991 = var221;
                }
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6020) {
                int var222 = field5032[--field5037];
                if (var222 < 0) {
                    var222 = 0;
                }
                if (var222 > 127) {
                    var222 = 127;
                }
                class525.field7713.field5995 = var222;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6021) {
                class525.field7713.field8796 = field5032[--field5037] == 1;
                class247.method1588(-106);
                return;
            }
            if (arg0 == 6023) {
                int var223 = field5032[--field5037];
                boolean var224 = false;
                if (var223 < 0) {
                    var223 = 0;
                }
                if (var223 > 2) {
                    var223 = 2;
                }
                if (class246.field3583 < 96) {
                    var223 = 0;
                    var224 = true;
                }
                class557.method3262(12816, var223);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                field5032[field5037++] = var224 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var225 = field5032[--field5037];
                if (var225 < 0 || var225 > 2) {
                    var225 = 0;
                }
                class525.field7713.field5994 = var225;
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6025) {
                int var226 = field5032[--field5037];
                if (var226 < 0 || var226 > class99.method827(class246.field3583, false)) {
                    var226 = 0;
                }
                class525.field7713.field5988 = var226;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6027) {
                int var227 = field5032[--field5037];
                if (var227 < 0 || var227 > 1) {
                    var227 = 0;
                }
                class677.method3829((byte) -128, var227 == 1);
                return;
            }
            if (arg0 == 6028) {
                class525.field7713.field5983 = field5032[--field5037] != 0;
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6029) {
                class525.field7713.field5998 = field5032[--field5037];
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6030) {
                class525.field7713.field5967 = field5032[--field5037] != 0;
                class525.field7713.method3481(true, class653.field9220);
                class387.method2368((byte) 88);
                return;
            }
            if (arg0 == 6031) {
                int var228 = field5032[--field5037];
                if (var228 < 0 || var228 > 5) {
                    var228 = 2;
                }
                class251.method1604(26, var228);
                return;
            }
            if (arg0 == 6032) {
                int var229 = field5032[--field5037];
                if (var229 < 0 || var229 > 5) {
                    var229 = 2;
                }
                class525.field7713.field6000 = var229;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6033) {
                int var230 = field5032[--field5037];
                if (var230 < 0 || var230 > 4) {
                    var230 = 2;
                }
                class525.field7713.field6006 = var230;
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6034) {
                class525.field7713.field5979 = field5032[--field5037] == 1;
                class525.field7713.method3481(true, class653.field9220);
                class69.method566((byte) -126);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6035) {
                class525.field7713.field8809 = field5032[--field5037] == 1;
                class387.method2368((byte) 123);
                class247.method1588(-98);
                return;
            }
            if (arg0 == 6036) {
                int var231 = field5032[--field5037];
                if (var231 < 0 || var231 > 2) {
                    var231 = 0;
                }
                class525.field7713.method3480((byte) -47, var231);
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6037) {
                int var232 = field5032[--field5037];
                if (var232 < 0) {
                    var232 = 0;
                }
                if (var232 > 127) {
                    var232 = 127;
                }
                class525.field7713.field5997 = var232;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6038) {
                int var233 = field5032[--field5037];
                if (var233 < 0) {
                    var233 = 0;
                }
                if (var233 > 255) {
                    var233 = 255;
                }
                if (class525.field7713.field5993 != var233 && class333.field4635 == class283.field3963) {
                    if (class525.field7713.field5993 == 0) {
                        class513.method3050(class283.field3963, class97.field1451, var233, 0, 0, false);
                        class468.method2768((byte) -110);
                        class369.field5120 = false;
                    } else if (var233 == 0) {
                        class679.method3845((byte) -82);
                        class369.field5120 = false;
                    } else {
                        class39.method327(103, var233);
                    }
                }
                class525.field7713.field5993 = var233;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 6039) {
                int var234 = field5032[--field5037];
                if (var234 > 255 || var234 < 0) {
                    var234 = 0;
                }
                if (class525.field7713.field5975 != var234) {
                    class525.field7713.field5975 = var234;
                    class525.field7713.method3481(true, class653.field9220);
                    class622.field8855 = false;
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field5032[field5037++] = class525.field7713.field5966;
                return;
            }
            if (arg0 == 6102) {
                field5032[field5037++] = class525.field7713.method3479(class76.field1182, 3691) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field5032[field5037++] = class525.field7713.field5968 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field5032[field5037++] = class525.field7713.field5962 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field5032[field5037++] = class525.field7713.field5980 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field5032[field5037++] = class525.field7713.field5998;
                return;
            }
            if (arg0 == 6108) {
                field5032[field5037++] = class525.field7713.field5996 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field5032[field5037++] = class525.field7713.field5986 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field5032[field5037++] = class525.field7713.field6001 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field5032[field5037++] = class525.field7713.method2484(class76.field1182, false);
                return;
            }
            if (arg0 == 6112) {
                field5032[field5037++] = class525.field7713.method2485((byte) 104, class76.field1182) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field5032[field5037++] = class525.field7713.field5981 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field5032[field5037++] = class525.field7713.field5972 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field5032[field5037++] = class525.field7713.field5969;
                return;
            }
            if (arg0 == 6117) {
                field5032[field5037++] = class525.field7713.field5963 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field5032[field5037++] = class525.field7713.field5973;
                return;
            }
            if (arg0 == 6119) {
                field5032[field5037++] = class525.field7713.field5991;
                return;
            }
            if (arg0 == 6120) {
                field5032[field5037++] = class525.field7713.field5995;
                return;
            }
            if (arg0 == 6121) {
                field5032[field5037++] = class637.field9048.method801() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field5032[field5037++] = class99.method831((byte) 73);
                return;
            }
            if (arg0 == 6124) {
                field5032[field5037++] = class525.field7713.field5994;
                return;
            }
            if (arg0 == 6125) {
                field5032[field5037++] = class525.field7713.field5988;
                return;
            }
            if (arg0 == 6126) {
                field5032[field5037++] = class637.field9048.method739() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field5032[field5037++] = class525.field7713.field5964 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field5032[field5037++] = class525.field7713.field5983 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field5032[field5037++] = class525.field7713.field5998;
                return;
            }
            if (arg0 == 6130) {
                field5032[field5037++] = class525.field7713.field5967 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field5032[field5037++] = class76.field1182;
                return;
            }
            if (arg0 == 6132) {
                field5032[field5037++] = class525.field7713.field6000;
                return;
            }
            if (arg0 == 6133) {
                field5032[field5037++] = class653.field9220.field9983 && !class653.field9220.field9985 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field5032[field5037++] = class99.method827(class246.field3583, false);
                return;
            }
            if (arg0 == 6135) {
                field5032[field5037++] = class525.field7713.field6006;
                return;
            }
            if (arg0 == 6136) {
                field5032[field5037++] = class525.field7713.field5979 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var235 = true;
                try {
                    var235 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var321) {
                }
                field5032[field5037++] = var235 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field5032[field5037++] = class673.method3808(true, 200, class76.field1182);
                return;
            }
            if (arg0 == 6139) {
                field5032[field5037++] = class525.field7713.method3482(0, class76.field1182);
                return;
            }
            if (arg0 == 6140) {
                byte var236 = 0;
                if (class65.method539((byte) 120, class76.field1182) && class246.field3583 < 96) {
                    var236 = 1;
                }
                field5032[field5037++] = var236;
                return;
            }
            if (arg0 == 6141) {
                if (class246.field3583 < 96) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = 2;
                return;
            }
            if (arg0 == 6142) {
                field5032[field5037++] = class525.field7713.field5997;
                return;
            }
            if (arg0 == 6143) {
                field5032[field5037++] = class525.field7713.field5993;
                return;
            }
            if (arg0 == 6144) {
                field5032[field5037++] = class383.field5613 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field5032[field5037++] = class525.field7713.field5975;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field5037 -= 2;
                class374.field5193 = (short) field5032[field5037];
                if (class374.field5193 <= 0) {
                    class374.field5193 = 256;
                }
                class694.field9864 = (short) field5032[field5037 + 1];
                if (class694.field9864 <= 0) {
                    class694.field9864 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field5037 -= 2;
                class344.field4815 = (short) field5032[field5037];
                if (class344.field4815 <= 0) {
                    class344.field4815 = 256;
                }
                class55.field716 = (short) field5032[field5037 + 1];
                if (class55.field716 <= 0) {
                    class55.field716 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field5037 -= 4;
                class286.field4036 = (short) field5032[field5037];
                if (class286.field4036 <= 0) {
                    class286.field4036 = 1;
                }
                class216.field3252 = (short) field5032[field5037 + 1];
                if (class216.field3252 <= 0) {
                    class216.field3252 = 32767;
                } else if (class216.field3252 < class286.field4036) {
                    class216.field3252 = class286.field4036;
                }
                class376.field5214 = (short) field5032[field5037 + 2];
                if (class376.field5214 <= 0) {
                    class376.field5214 = 1;
                }
                class174.field2803 = (short) field5032[field5037 + 3];
                if (class174.field2803 <= 0) {
                    class174.field2803 = 32767;
                    return;
                }
                if (class174.field2803 < class376.field5214) {
                    class174.field2803 = class376.field5214;
                }
                return;
            }
            if (arg0 == 6203) {
                class301.method1851(0, class128.field2090.field1604, class128.field2090.field1651, 0, -5282, false);
                field5032[field5037++] = class419.field5956;
                field5032[field5037++] = class327.field4551;
                return;
            }
            if (arg0 == 6204) {
                field5032[field5037++] = class344.field4815;
                field5032[field5037++] = class55.field716;
                return;
            }
            if (arg0 == 6205) {
                field5032[field5037++] = class374.field5193;
                field5032[field5037++] = class694.field9864;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field5032[field5037++] = (int) (class254.method1619(true) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field5032[field5037++] = (int) (class254.method1619(true) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field5037 -= 3;
                int var237 = field5032[field5037];
                int var238 = field5032[field5037 + 1];
                int var239 = field5032[field5037 + 2];
                field5022.clear();
                field5022.set(11, 12);
                field5022.set(var239, var238, var237);
                int var240 = (int) (field5022.getTime().getTime() / 86400000L) - 11745;
                if (var239 < 1970) {
                    var240--;
                }
                field5032[field5037++] = var240;
                return;
            }
            if (arg0 == 6303) {
                field5022.clear();
                field5022.setTime(new Date(class254.method1619(true)));
                field5032[field5037++] = field5022.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var241 = field5032[--field5037];
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
                field5032[field5037++] = var242 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field5032[field5037++] = class278.method1728((byte) 22) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field5032[field5037++] = class549.method3225(121) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class515.field7636 == 7 && class160.field2597 == 0 && class250.field3623 == 0) {
                    if (class383.field5611) {
                        field5032[field5037++] = 0;
                        return;
                    }
                    if (class142.field2464 > class254.method1619(true) - 1000L) {
                        field5032[field5037++] = 1;
                        return;
                    }
                    class383.field5611 = true;
                    class699 var243 = class452.method2630(class699.field9897, class24.field335, (byte) 122);
                    var243.field9908.method2733(false, class187.field2931);
                    class149.method1134(var243, true);
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class613 var244 = class233.method1530(-126);
                if (var244 != null) {
                    field5032[field5037++] = var244.field8776;
                    field5032[field5037++] = var244.field7509;
                    field5039[field5018++] = var244.field8777;
                    class221 var245 = var244.method3467(true);
                    field5032[field5037++] = var245.field3298;
                    field5039[field5018++] = var245.field3300;
                    field5032[field5037++] = var244.field7512;
                    field5032[field5037++] = var244.field8779;
                    field5039[field5018++] = var244.field8780;
                    return;
                }
                field5032[field5037++] = -1;
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                return;
            }
            if (arg0 == 6502) {
                class613 var246 = class225.method1489(true);
                if (var246 != null) {
                    field5032[field5037++] = var246.field8776;
                    field5032[field5037++] = var246.field7509;
                    field5039[field5018++] = var246.field8777;
                    class221 var247 = var246.method3467(true);
                    field5032[field5037++] = var247.field3298;
                    field5039[field5018++] = var247.field3300;
                    field5032[field5037++] = var246.field7512;
                    field5032[field5037++] = var246.field8779;
                    field5039[field5018++] = var246.field8780;
                    return;
                }
                field5032[field5037++] = -1;
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var248 = field5032[--field5037];
                String var249 = field5039[--field5018];
                if (class515.field7636 == 7 && class160.field2597 == 0 && class250.field3623 == 0) {
                    field5032[field5037++] = class173.method1275(var248, var249, 654776389) ? 1 : 0;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class525.field7713.field5971 = field5032[--field5037];
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6505) {
                field5032[field5037++] = class525.field7713.field5971;
                return;
            }
            if (arg0 == 6506) {
                int var250 = field5032[--field5037];
                class613 var251 = class657.method3705((byte) -63, var250);
                if (var251 != null) {
                    field5032[field5037++] = var251.field7509;
                    field5039[field5018++] = var251.field8777;
                    class221 var252 = var251.method3467(true);
                    field5032[field5037++] = var252.field3298;
                    field5039[field5018++] = var252.field3300;
                    field5032[field5037++] = var251.field7512;
                    field5032[field5037++] = var251.field8779;
                    field5039[field5018++] = var251.field8780;
                    return;
                }
                field5032[field5037++] = -1;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                field5032[field5037++] = 0;
                field5032[field5037++] = 0;
                field5039[field5018++] = "";
                return;
            }
            if (arg0 == 6507) {
                field5037 -= 4;
                int var253 = field5032[field5037];
                boolean var254 = field5032[field5037 + 1] == 1;
                int var255 = field5032[field5037 + 2];
                boolean var256 = field5032[field5037 + 3] == 1;
                class391.method2378(var255, var254, var253, var256, (byte) -82);
                return;
            }
            if (arg0 == 6508) {
                class197.method1387(0);
                return;
            }
            if (arg0 == 6509) {
                if (class515.field7636 != 7) {
                    return;
                }
                class213.field3233 = field5032[--field5037] == 1;
                return;
            }
            if (arg0 == 6510) {
                field5032[field5037++] = class548.field8044;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class525.field7713.field5977 = field5032[--field5037] == 1;
                class525.field7713.method3481(true, class653.field9220);
                return;
            }
            if (arg0 == 6601) {
                field5032[field5037++] = class525.field7713.field5977 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class440.field6367 == class358.field4999) {
            if (arg0 == 6700) {
                int var257 = class199.field3098.method2813((byte) -119);
                if (class557.field8146 != -1) {
                    var257++;
                }
                field5032[field5037++] = var257;
                return;
            }
            if (arg0 == 6701) {
                int var258 = field5032[--field5037];
                if (class557.field8146 != -1) {
                    if (var258 == 0) {
                        field5032[field5037++] = class557.field8146;
                        return;
                    }
                    var258--;
                }
                class259 var259 = (class259) class199.field3098.method2815(0);
                while (var258-- > 0) {
                    var259 = (class259) class199.field3098.method2814(4);
                }
                field5032[field5037++] = var259.field3716;
                return;
            }
            if (arg0 == 6702) {
                int var260 = field5032[--field5037];
                if (class265.field3806[var260] == null) {
                    field5039[field5018++] = "";
                    return;
                }
                String var261 = class265.field3806[var260][0].field1495;
                if (var261 == null) {
                    field5039[field5018++] = "";
                    return;
                }
                field5039[field5018++] = var261.substring(0, var261.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var262 = field5032[--field5037];
                if (class265.field3806[var262] == null) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = class265.field3806[var262].length;
                return;
            }
            if (arg0 == 6704) {
                field5037 -= 2;
                int var263 = field5032[field5037];
                int var264 = field5032[field5037 + 1];
                if (class265.field3806[var263] == null) {
                    field5039[field5018++] = "";
                    return;
                }
                String var265 = class265.field3806[var263][var264].field1495;
                if (var265 == null) {
                    field5039[field5018++] = "";
                    return;
                }
                field5039[field5018++] = var265;
                return;
            }
            if (arg0 == 6705) {
                field5037 -= 2;
                int var266 = field5032[field5037];
                int var267 = field5032[field5037 + 1];
                if (class265.field3806[var266] == null) {
                    field5032[field5037++] = 0;
                    return;
                }
                field5032[field5037++] = class265.field3806[var266][var267].field1521;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field5037 -= 3;
                int var268 = field5032[field5037];
                int var269 = field5032[field5037 + 1];
                int var270 = field5032[field5037 + 2];
                class516.method3058("", var270, var268 << 16 | var269, -28456, 1);
                return;
            }
            if (arg0 == 6708) {
                field5037 -= 3;
                int var271 = field5032[field5037];
                int var272 = field5032[field5037 + 1];
                int var273 = field5032[field5037 + 2];
                class516.method3058("", var273, var271 << 16 | var272, -28456, 2);
                return;
            }
            if (arg0 == 6709) {
                field5037 -= 3;
                int var274 = field5032[field5037];
                int var275 = field5032[field5037 + 1];
                int var276 = field5032[field5037 + 2];
                class516.method3058("", var276, var274 << 16 | var275, -28456, 3);
                return;
            }
            if (arg0 == 6710) {
                field5037 -= 3;
                int var277 = field5032[field5037];
                int var278 = field5032[field5037 + 1];
                int var279 = field5032[field5037 + 2];
                class516.method3058("", var279, var277 << 16 | var278, -28456, 4);
                return;
            }
            if (arg0 == 6711) {
                field5037 -= 3;
                int var280 = field5032[field5037];
                int var281 = field5032[field5037 + 1];
                int var282 = field5032[field5037 + 2];
                class516.method3058("", var282, var280 << 16 | var281, -28456, 5);
                return;
            }
            if (arg0 == 6712) {
                field5037 -= 3;
                int var283 = field5032[field5037];
                int var284 = field5032[field5037 + 1];
                int var285 = field5032[field5037 + 2];
                class516.method3058("", var285, var283 << 16 | var284, -28456, 6);
                return;
            }
            if (arg0 == 6713) {
                field5037 -= 3;
                int var286 = field5032[field5037];
                int var287 = field5032[field5037 + 1];
                int var288 = field5032[field5037 + 2];
                class516.method3058("", var288, var286 << 16 | var287, -28456, 7);
                return;
            }
            if (arg0 == 6714) {
                field5037 -= 3;
                int var289 = field5032[field5037];
                int var290 = field5032[field5037 + 1];
                int var291 = field5032[field5037 + 2];
                class516.method3058("", var291, var289 << 16 | var290, -28456, 8);
                return;
            }
            if (arg0 == 6715) {
                field5037 -= 3;
                int var292 = field5032[field5037];
                int var293 = field5032[field5037 + 1];
                int var294 = field5032[field5037 + 2];
                class516.method3058("", var294, var292 << 16 | var293, -28456, 9);
                return;
            }
            if (arg0 == 6716) {
                field5037 -= 3;
                int var295 = field5032[field5037];
                int var296 = field5032[field5037 + 1];
                int var297 = field5032[field5037 + 2];
                class516.method3058("", var297, var295 << 16 | var296, -28456, 10);
                return;
            }
            if (arg0 == 6717) {
                field5037 -= 3;
                int var298 = field5032[field5037];
                int var299 = field5032[field5037 + 1];
                int var300 = field5032[field5037 + 2];
                class101 var301 = class620.method3501(var298 << 16 | var299, false, var300);
                class372.method2220(-20585);
                class330 var302 = client.method707(var301);
                class505.method3012(var302.field4567, (byte) -91, var302.method1958((byte) 31), var301);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var303 = field5032[--field5037];
                class30 var304 = class304.field4255.method2837(var303, -84);
                if (var304.field432 == null) {
                    field5039[field5018++] = "";
                    return;
                }
                field5039[field5018++] = var304.field432;
                return;
            }
            if (arg0 == 6801) {
                int var305 = field5032[--field5037];
                class30 var306 = class304.field4255.method2837(var305, -124);
                field5032[field5037++] = var306.field415;
                return;
            }
            if (arg0 == 6802) {
                int var307 = field5032[--field5037];
                class30 var308 = class304.field4255.method2837(var307, -71);
                field5032[field5037++] = var308.field447;
                return;
            }
            if (arg0 == 6803) {
                int var309 = field5032[--field5037];
                class30 var310 = class304.field4255.method2837(var309, -62);
                field5032[field5037++] = var310.field444;
                return;
            }
            if (arg0 == 6804) {
                field5037 -= 2;
                int var311 = field5032[field5037];
                int var312 = field5032[field5037 + 1];
                class349 var313 = class237.field3504.method1554(false, var312);
                if (var313.method2122((byte) 120)) {
                    field5039[field5018++] = class304.field4255.method2837(var311, -89).method277(var313.field4931, (byte) 35, var312);
                    return;
                }
                field5032[field5037++] = class304.field4255.method2837(var311, -67).method284(97, var313.field4922, var312);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field5032[field5037++] = class296.field4187 && !class375.field5202 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field5032[field5037++] = class342.field4740;
                return;
            }
            if (arg0 == 6902) {
                field5032[field5037++] = class75.field1176;
                return;
            }
            if (arg0 == 6903) {
                field5032[field5037++] = class598.field8641;
                return;
            }
            if (arg0 == 6904) {
                field5032[field5037++] = class415.field5893;
                return;
            }
            if (arg0 == 6905) {
                String var314 = "";
                if (class300.field4214 != null) {
                    if (class300.field4214.field8785 == null) {
                        var314 = class151.method1150(class300.field4214.field8786, -1469107176);
                    } else {
                        var314 = (String) class300.field4214.field8785;
                    }
                }
                field5039[field5018++] = var314;
                return;
            }
            if (arg0 == 6906) {
                field5032[field5037++] = class703.field9952;
                return;
            }
            if (arg0 == 6907) {
                field5032[field5037++] = class538.field7895;
                return;
            }
            if (arg0 == 6908) {
                field5032[field5037++] = class674.field9584;
                return;
            }
            if (arg0 == 6909) {
                field5032[field5037++] = class123.field2006 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field5032[field5037++] = class457.field6575;
                return;
            }
            if (arg0 == 6911) {
                field5032[field5037++] = class683.field9718;
                return;
            }
            if (arg0 == 6912) {
                field5032[field5037++] = class479.field6864;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var315 = class525.field7713.method3488((byte) -96);
                field5032[field5037++] = class525.field7713.field8801 = class76.field1182;
                field5032[field5037++] = var315;
                class387.method2368((byte) 111);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7001) {
                class525.field7713.method3470((byte) -102);
                class387.method2368((byte) 90);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7002) {
                class525.field7713.method3487(-98);
                class387.method2368((byte) 84);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7003) {
                class525.field7713.method3483(true);
                class387.method2368((byte) 101);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7004) {
                class525.field7713.method3486(1, true);
                class387.method2368((byte) 77);
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7005) {
                class525.field7713.field6002 = 0;
                class525.field7713.method3481(true, class653.field9220);
                class622.field8855 = false;
                return;
            }
            if (arg0 == 7006) {
                if (class525.field7713.field8801 == 2) {
                    class525.field7713.field8798 = true;
                    return;
                }
                if (class525.field7713.field8801 == 1) {
                    class525.field7713.field8802 = true;
                    return;
                }
                if (class525.field7713.field8801 == 3) {
                    class525.field7713.field8813 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field5032[field5037++] = class525.field7713.field6002;
                return;
            }
            if (arg0 == 7008) {
                if (class76.field1182 == 0 && class246.field3583 < 96) {
                    field5032[field5037++] = 1;
                    return;
                }
                field5032[field5037++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljda;II)V")
    public static final void method2169(class77 arg0, int arg1, int arg2) {
        class438 var3 = class250.method1600(arg1, arg0, arg2, -6559);
        if (var3 == null) {
            return;
        }
        field5023 = new int[var3.field6309];
        field5034 = new String[var3.field6296];
        if (class564.field8234 == var3.field6305 || class264.field3792 == var3.field6305 || class425.field6055 == var3.field6305) {
            int var4 = 0;
            int var5 = 0;
            if (class541.field7950 != null) {
                var4 = class541.field7950.field1583;
                var5 = class541.field7950.field1589;
            }
            field5023[0] = class313.field4336.method310(false) - var4;
            field5023[1] = class313.field4336.method321(107) - var5;
        }
        method2166(var3, 200000);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    private static final void method2170(int arg0) {
        class101 var1 = class271.method1711(arg0, 23727);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class101[] var3 = class700.field9917[var2];
        if (var3 == null) {
            class101[] var4 = class265.field3806[var2];
            int var5 = var4.length;
            var3 = class700.field9917[var2] = new class101[var5];
            class553.method3243(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class553.method3243(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lor;)V")
    public static final void method2171(class400 arg0) {
        method2165(arg0, 200000);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Ljava/lang/String;")
    private static final String method2172(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field5022.setTime(new Date(var1));
        int var3 = field5022.get(5);
        int var4 = field5022.get(2);
        int var5 = field5022.get(1);
        return var3 + "-" + field5040[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "()V")
    public static final void method2173() {
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
    private static final void method2174(int arg0) {
        class101 var1 = class271.method1711(arg0, 23727);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class101[] var3 = class700.field9917[var2];
        if (var3 == null) {
            class101[] var4 = class265.field3806[var2];
            int var5 = var4.length;
            var3 = class700.field9917[var2] = new class101[var5];
            class553.method3243(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class553.method3243(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "()V")
    public static void method2175() {
        field5023 = null;
        field5034 = null;
        field5035 = null;
        field5020 = null;
        field5032 = null;
        field5039 = null;
        field5021 = null;
        field5033 = null;
        field5029 = null;
        field5026 = null;
        field5022 = null;
        field5040 = null;
        field5041 = null;
        field5042 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IZ)V")
    public static final void method2176(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(IZ)V")
    private static final void method2177(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field5037 -= 3;
                int var2 = field5032[field5037];
                int var3 = field5032[field5037 + 1];
                int var4 = field5032[field5037 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class101 var5 = class271.method1711(var2, 23727);
                if (var5.field1578 == null) {
                    var5.field1578 = new class101[var4 + 1];
                }
                if (var5.field1578.length <= var4) {
                    class101[] var6 = new class101[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1578.length; var7++) {
                        var6[var7] = var5.field1578[var7];
                    }
                    var5.field1578 = var6;
                }
                if (var4 > 0 && var5.field1578[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class101 var8 = new class101();
                var8.field1584 = var3;
                var8.field1539 = var8.field1577 = var5.field1577;
                var8.field1528 = var4;
                var5.field1578[var4] = var8;
                if (arg1) {
                    field5029 = var8;
                } else {
                    field5033 = var8;
                }
                class326.method1948(1, var5);
                return;
            }
            if (arg0 == 101) {
                class101 var9 = arg1 ? field5029 : field5033;
                if (var9.field1528 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class101 var10 = class271.method1711(var9.field1577, 23727);
                var10.field1578[var9.field1528] = null;
                class326.method1948(1, var10);
                return;
            }
            if (arg0 == 102) {
                class101 var11 = class271.method1711(field5032[--field5037], 23727);
                var11.field1578 = null;
                class326.method1948(1, var11);
                return;
            }
            if (arg0 == 200) {
                field5037 -= 2;
                int var12 = field5032[field5037];
                int var13 = field5032[field5037 + 1];
                class101 var14 = class620.method3501(var12, false, var13);
                if (var14 != null && var13 != -1) {
                    field5032[field5037++] = 1;
                    if (arg1) {
                        field5029 = var14;
                        return;
                    }
                    field5033 = var14;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field5032[--field5037];
                class101 var16 = class271.method1711(var15, 23727);
                if (var16 != null) {
                    field5032[field5037++] = 1;
                    if (arg1) {
                        field5029 = var16;
                        return;
                    }
                    field5033 = var16;
                    return;
                }
                field5032[field5037++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field5032[--field5037];
                method2174(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field5032[--field5037];
                method2170(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field5037 -= 2;
                int var19 = field5032[field5037];
                int var20 = field5032[field5037 + 1];
                for (int var21 = 0; var21 < class188.field2951.length; var21++) {
                    if (class188.field2951[var21] == var19) {
                        class103.field1708.field3841.method1338((byte) -124, var21, var20, class235.field3484);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class479.field6866.length; var22++) {
                    if (class479.field6866[var22] == var19) {
                        class103.field1708.field3841.method1338((byte) -128, var22, var20, class235.field3484);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field5037 -= 2;
                int var23 = field5032[field5037];
                int var24 = field5032[field5037 + 1];
                class103.field1708.field3841.method1340(var23, -76, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field5032[--field5037] != 0;
                class103.field1708.field3841.method1341(var25, 3211);
                return;
            }
            if (arg0 == 411) {
                field5037 -= 2;
                int var26 = field5032[field5037];
                int var27 = field5032[field5037 + 1];
                class103.field1708.field3841.method1336((byte) 7, class430.field6132, var26, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class101 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class271.method1711(field5032[--field5037], 23727);
            } else {
                var28 = arg1 ? field5029 : field5033;
            }
            if (arg0 == 1000) {
                field5037 -= 4;
                var28.field1627 = field5032[field5037];
                var28.field1541 = field5032[field5037 + 1];
                int var29 = field5032[field5037 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field5032[field5037 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field1536 = (byte) var29;
                var28.field1531 = (byte) var30;
                class326.method1948(1, var28);
                class413.method2463(0, var28);
                if (var28.field1528 == -1) {
                    class231.method1523(64, var28.field1577);
                }
                return;
            }
            if (arg0 == 1001) {
                field5037 -= 4;
                var28.field1560 = field5032[field5037];
                var28.field1549 = field5032[field5037 + 1];
                var28.field1645 = 0;
                var28.field1605 = 0;
                int var31 = field5032[field5037 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field5032[field5037 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field1542 = (byte) var31;
                var28.field1613 = (byte) var32;
                class326.method1948(1, var28);
                class413.method2463(0, var28);
                if (var28.field1584 == 0) {
                    class486.method2843(111, false, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field5032[--field5037] == 1;
                if (var28.field1537 != var33) {
                    var28.field1537 = var33;
                    class326.method1948(1, var28);
                }
                if (var28.field1528 == -1) {
                    class499.method2986(var28.field1577, (byte) 69);
                }
                return;
            }
            if (arg0 == 1004) {
                field5037 -= 2;
                var28.field1519 = field5032[field5037];
                var28.field1538 = field5032[field5037 + 1];
                class326.method1948(1, var28);
                class413.method2463(0, var28);
                if (var28.field1584 == 0) {
                    class486.method2843(-92, false, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field1498 = field5032[--field5037] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class101 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class271.method1711(field5032[--field5037], 23727);
            } else {
                var34 = arg1 ? field5029 : field5033;
            }
            if (arg0 == 1100) {
                field5037 -= 2;
                var34.field1518 = field5032[field5037];
                if (var34.field1518 > var34.field1557 - var34.field1604) {
                    var34.field1518 = var34.field1557 - var34.field1604;
                }
                if (var34.field1518 < 0) {
                    var34.field1518 = 0;
                }
                var34.field1523 = field5032[field5037 + 1];
                if (var34.field1523 > var34.field1592 - var34.field1651) {
                    var34.field1523 = var34.field1592 - var34.field1651;
                }
                if (var34.field1523 < 0) {
                    var34.field1523 = 0;
                }
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class174.method1280(var34.field1577, -54);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field1582 = field5032[--field5037];
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class333.method1981((byte) -60, var34.field1577);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field1516 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field1544 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field1503 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field5032[--field5037];
                if (var34.field1628 != var35) {
                    var34.field1628 = var35;
                    class326.method1948(1, var34);
                }
                if (var34.field1528 == -1) {
                    class164.method1251(var34.field1577, (byte) -12);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field1644 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field1615 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field1527 = 1;
                var34.field1598 = field5032[--field5037];
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class561.method3281((byte) -108, var34.field1577);
                }
                return;
            }
            if (arg0 == 1109) {
                field5037 -= 6;
                var34.field1552 = field5032[field5037];
                var34.field1612 = field5032[field5037 + 1];
                var34.field1570 = field5032[field5037 + 2];
                var34.field1609 = field5032[field5037 + 3];
                var34.field1619 = field5032[field5037 + 4];
                var34.field1587 = field5032[field5037 + 5];
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class548.method3216(5124, var34.field1577);
                    class94.method721(false, var34.field1577);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field5032[--field5037];
                if (var34.field1603 != var36) {
                    var34.field1603 = var36;
                    var34.field1551 = 0;
                    var34.field1499 = 1;
                    var34.field1545 = 0;
                    class606 var37 = var34.field1603 == -1 ? null : class480.field6871.method1417(-3585, var34.field1603);
                    if (var37 != null) {
                        class173.method1274(var34.field1551, var37, false);
                    }
                    class326.method1948(1, var34);
                }
                if (var34.field1528 == -1) {
                    class655.method3693(0, var34.field1577);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field1511 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field5039[--field5018];
                if (!var38.equals(var34.field1639)) {
                    var34.field1639 = var38;
                    class326.method1948(1, var34);
                }
                if (var34.field1528 == -1) {
                    class349.method2123((byte) 100, var34.field1577);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field1637 = field5032[--field5037];
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class518.method3066((byte) -26, var34.field1577);
                }
                return;
            }
            if (arg0 == 1114) {
                field5037 -= 3;
                var34.field1625 = field5032[field5037];
                var34.field1554 = field5032[field5037 + 1];
                var34.field1646 = field5032[field5037 + 2];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field1629 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field1502 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field1635 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field1555 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field1526 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1120) {
                field5037 -= 2;
                var34.field1557 = field5032[field5037];
                var34.field1592 = field5032[field5037 + 1];
                class326.method1948(1, var34);
                if (var34.field1584 == 0) {
                    class486.method2843(-117, false, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field1507 = field5032[--field5037] == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field1587 = field5032[--field5037];
                class326.method1948(1, var34);
                if (var34.field1528 == -1) {
                    class548.method3216(5124, var34.field1577);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field5032[--field5037];
                var34.field1529 = var39 == 1;
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1125) {
                field5037 -= 2;
                var34.field1617 = field5032[field5037];
                var34.field1493 = field5032[field5037 + 1];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field1562 = field5032[--field5037];
                class326.method1948(1, var34);
                return;
            }
            if (arg0 == 1127) {
                field5037 -= 2;
                int var40 = field5032[field5037];
                int var41 = field5032[field5037 + 1];
                class349 var42 = class237.field3504.method1554(false, var40);
                if (var42.field4922 != var41) {
                    var34.method835(var40, var41, true);
                    return;
                }
                var34.method840(var40, -1);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field5032[--field5037];
                String var44 = field5039[--field5018];
                class349 var45 = class237.field3504.method1554(false, var43);
                if (!var45.field4931.equals(var44)) {
                    var34.method834(-1144, var43, var44);
                    return;
                }
                var34.method840(var43, -1);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class101 var46;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var46 = class271.method1711(field5032[--field5037], 23727);
            } else {
                var46 = arg1 ? field5029 : field5033;
            }
            class326.method1948(1, var46);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field5037 -= 2;
                int var47 = field5032[field5037];
                int var48 = field5032[field5037 + 1];
                if (var46.field1528 == -1) {
                    class341.method2048(var46.field1577, (byte) 59);
                    class548.method3216(5124, var46.field1577);
                    class94.method721(false, var46.field1577);
                }
                if (var47 == -1) {
                    var46.field1527 = 1;
                    var46.field1598 = -1;
                    var46.field1565 = -1;
                    return;
                }
                var46.field1565 = var47;
                var46.field1489 = var48;
                if (arg0 == 1208 || arg0 == 1209) {
                    var46.field1601 = true;
                } else {
                    var46.field1601 = false;
                }
                class432 var49 = class430.field6132.method42(var47, false);
                var46.field1570 = var49.field6172;
                var46.field1609 = var49.field6187;
                var46.field1619 = var49.field6140;
                var46.field1552 = var49.field6221;
                var46.field1612 = var49.field6191;
                var46.field1587 = var49.field6199;
                if (arg0 == 1205 || arg0 == 1209) {
                    var46.field1494 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var46.field1494 = 1;
                } else {
                    var46.field1494 = 2;
                }
                if (var46.field1645 > 0) {
                    var46.field1587 = var46.field1587 * 32 / var46.field1645;
                    return;
                }
                if (var46.field1560 > 0) {
                    var46.field1587 = var46.field1587 * 32 / var46.field1560;
                }
                return;
            }
            if (arg0 == 1201) {
                var46.field1527 = 2;
                var46.field1598 = field5032[--field5037];
                if (var46.field1528 == -1) {
                    class561.method3281((byte) -122, var46.field1577);
                }
                return;
            }
            if (arg0 == 1202) {
                var46.field1527 = 3;
                var46.field1598 = -1;
                if (var46.field1528 == -1) {
                    class561.method3281((byte) 106, var46.field1577);
                }
                return;
            }
            if (arg0 == 1203) {
                var46.field1527 = 6;
                var46.field1598 = field5032[--field5037];
                if (var46.field1528 == -1) {
                    class561.method3281((byte) -95, var46.field1577);
                }
                return;
            }
            if (arg0 == 1204) {
                var46.field1527 = 5;
                var46.field1598 = field5032[--field5037];
                if (var46.field1528 == -1) {
                    class561.method3281((byte) 117, var46.field1577);
                }
                return;
            }
            if (arg0 == 1206) {
                field5037 -= 4;
                var46.field1569 = field5032[field5037];
                var46.field1631 = field5032[field5037 + 1];
                var46.field1512 = field5032[field5037 + 2];
                var46.field1532 = field5032[field5037 + 3];
                class326.method1948(1, var46);
                return;
            }
            if (arg0 == 1207) {
                field5037 -= 2;
                var46.field1624 = field5032[field5037];
                var46.field1649 = field5032[field5037 + 1];
                class326.method1948(1, var46);
                return;
            }
            if (arg0 == 1210) {
                field5037 -= 4;
                var46.field1598 = field5032[field5037];
                var46.field1621 = field5032[field5037 + 1];
                if (field5032[field5037 + 2] == 1) {
                    var46.field1527 = 9;
                } else {
                    var46.field1527 = 8;
                }
                if (field5032[field5037 + 3] == 1) {
                    var46.field1601 = true;
                } else {
                    var46.field1601 = false;
                }
                if (var46.field1528 == -1) {
                    class561.method3281((byte) -118, var46.field1577);
                }
                return;
            }
            if (arg0 == 1211) {
                var46.field1527 = 5;
                var46.field1598 = class609.field8749;
                var46.field1621 = 0;
                if (var46.field1528 == -1) {
                    class561.method3281((byte) -118, var46.field1577);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class101 var61;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var61 = class271.method1711(field5032[--field5037], 23727);
                } else {
                    var61 = arg1 ? field5029 : field5033;
                }
                if (arg0 == 1499) {
                    var61.method833((byte) 85);
                    return;
                }
                String var62 = field5039[--field5018];
                int[] var63 = null;
                if (var62.length() > 0 && var62.charAt(var62.length() - 1) == 'Y') {
                    int var64 = field5032[--field5037];
                    if (var64 > 0) {
                        var63 = new int[var64];
                        while (var64-- > 0) {
                            var63[var64] = field5032[--field5037];
                        }
                    }
                    var62 = var62.substring(0, var62.length() - 1);
                }
                Object[] var65 = new Object[var62.length() + 1];
                for (int var66 = var65.length - 1; var66 >= 1; var66--) {
                    if (var62.charAt(var66 - 1) == 's') {
                        var65[var66] = field5039[--field5018];
                    } else {
                        var65[var66] = Integer.valueOf(field5032[--field5037]);
                    }
                }
                int var67 = field5032[--field5037];
                if (var67 == -1) {
                    var65 = null;
                } else {
                    var65[0] = Integer.valueOf(var67);
                }
                if (arg0 == 1400) {
                    var61.field1594 = var65;
                } else if (arg0 == 1401) {
                    var61.field1571 = var65;
                } else if (arg0 == 1402) {
                    var61.field1572 = var65;
                } else if (arg0 == 1403) {
                    var61.field1596 = var65;
                } else if (arg0 == 1404) {
                    var61.field1610 = var65;
                } else if (arg0 == 1405) {
                    var61.field1550 = var65;
                } else if (arg0 == 1406) {
                    var61.field1506 = var65;
                } else if (arg0 == 1407) {
                    var61.field1641 = var65;
                    var61.field1520 = var63;
                } else if (arg0 == 1408) {
                    var61.field1576 = var65;
                } else if (arg0 == 1409) {
                    var61.field1648 = var65;
                } else if (arg0 == 1410) {
                    var61.field1611 = var65;
                } else if (arg0 == 1411) {
                    var61.field1599 = var65;
                } else if (arg0 == 1412) {
                    var61.field1614 = var65;
                } else if (arg0 == 1414) {
                    var61.field1636 = var65;
                    var61.field1510 = var63;
                } else if (arg0 == 1415) {
                    var61.field1634 = var65;
                    var61.field1593 = var63;
                } else if (arg0 == 1416) {
                    var61.field1633 = var65;
                } else if (arg0 == 1417) {
                    var61.field1606 = var65;
                } else if (arg0 == 1418) {
                    var61.field1488 = var65;
                } else if (arg0 == 1419) {
                    var61.field1548 = var65;
                } else if (arg0 == 1420) {
                    var61.field1514 = var65;
                } else if (arg0 == 1421) {
                    var61.field1491 = var65;
                } else if (arg0 == 1422) {
                    var61.field1643 = var65;
                } else if (arg0 == 1423) {
                    var61.field1553 = var65;
                } else if (arg0 == 1424) {
                    var61.field1533 = var65;
                } else if (arg0 == 1425) {
                    var61.field1653 = var65;
                } else if (arg0 == 1426) {
                    var61.field1530 = var65;
                } else if (arg0 == 1427) {
                    var61.field1626 = var65;
                } else if (arg0 == 1428) {
                    var61.field1585 = var65;
                    var61.field1640 = var63;
                } else if (arg0 == 1429) {
                    var61.field1597 = var65;
                    var61.field1496 = var63;
                } else if (arg0 == 1430) {
                    var61.field1586 = var65;
                }
                var61.field1618 = true;
                return;
            }
            if (arg0 < 1600) {
                class101 var68 = arg1 ? field5029 : field5033;
                if (arg0 == 1500) {
                    field5032[field5037++] = var68.field1583;
                    return;
                }
                if (arg0 == 1501) {
                    field5032[field5037++] = var68.field1589;
                    return;
                }
                if (arg0 == 1502) {
                    field5032[field5037++] = var68.field1604;
                    return;
                }
                if (arg0 == 1503) {
                    field5032[field5037++] = var68.field1651;
                    return;
                }
                if (arg0 == 1504) {
                    field5032[field5037++] = var68.field1537 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field5032[field5037++] = var68.field1539;
                    return;
                }
                if (arg0 == 1506) {
                    class101 var69 = class210.method1444(0, var68);
                    field5032[field5037++] = var69 == null ? -1 : var69.field1577;
                    return;
                }
            } else if (arg0 < 1700) {
                class101 var70 = arg1 ? field5029 : field5033;
                if (arg0 == 1600) {
                    field5032[field5037++] = var70.field1518;
                    return;
                }
                if (arg0 == 1601) {
                    field5032[field5037++] = var70.field1523;
                    return;
                }
                if (arg0 == 1602) {
                    field5039[field5018++] = var70.field1639;
                    return;
                }
                if (arg0 == 1603) {
                    field5032[field5037++] = var70.field1557;
                    return;
                }
                if (arg0 == 1604) {
                    field5032[field5037++] = var70.field1592;
                    return;
                }
                if (arg0 == 1605) {
                    field5032[field5037++] = var70.field1587;
                    return;
                }
                if (arg0 == 1606) {
                    field5032[field5037++] = var70.field1570;
                    return;
                }
                if (arg0 == 1607) {
                    field5032[field5037++] = var70.field1619;
                    return;
                }
                if (arg0 == 1608) {
                    field5032[field5037++] = var70.field1609;
                    return;
                }
                if (arg0 == 1609) {
                    field5032[field5037++] = var70.field1544;
                    return;
                }
                if (arg0 == 1610) {
                    field5032[field5037++] = var70.field1552;
                    return;
                }
                if (arg0 == 1611) {
                    field5032[field5037++] = var70.field1612;
                    return;
                }
                if (arg0 == 1612) {
                    field5032[field5037++] = var70.field1628;
                    return;
                }
                if (arg0 == 1613) {
                    int var71 = field5032[--field5037];
                    class349 var72 = class237.field3504.method1554(false, var71);
                    if (var72.method2122((byte) 118)) {
                        field5039[field5018++] = var70.method844(104, var71, var72.field4931);
                        return;
                    }
                    field5032[field5037++] = var70.method845(var72.field4922, var71, -115);
                    return;
                }
                if (arg0 == 1614) {
                    field5032[field5037++] = var70.field1644;
                    return;
                }
                if (arg0 == 2614) {
                    field5032[field5037++] = var70.field1527 == 1 ? var70.field1598 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class101 var73 = arg1 ? field5029 : field5033;
                if (arg0 == 1700) {
                    field5032[field5037++] = var73.field1565;
                    return;
                }
                if (arg0 == 1701) {
                    if (var73.field1565 != -1) {
                        field5032[field5037++] = var73.field1489;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field5032[field5037++] = var73.field1528;
                    return;
                }
            } else if (arg0 < 1900) {
                class101 var74 = arg1 ? field5029 : field5033;
                if (arg0 == 1800) {
                    field5032[field5037++] = client.method707(var74).method1958((byte) -117);
                    return;
                }
                if (arg0 == 1801) {
                    int var75 = field5032[--field5037];
                    int var356 = var75 - 1;
                    if (var74.field1642 != null && var356 < var74.field1642.length && var74.field1642[var356] != null) {
                        field5039[field5018++] = var74.field1642[var356];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var74.field1546 == null) {
                        field5039[field5018++] = "";
                        return;
                    }
                    field5039[field5018++] = var74.field1546;
                    return;
                }
            } else if (arg0 < 2000 || !(arg0 < 2900 || arg0 >= 3000)) {
                class101 var354;
                if (arg0 >= 2000) {
                    var354 = class271.method1711(field5032[--field5037], 23727);
                    arg0 -= 1000;
                } else {
                    var354 = arg1 ? field5029 : field5033;
                }
                if (field5043 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var354.field1626 == null) {
                        return;
                    }
                    class400 var355 = new class400();
                    var355.field5783 = var354;
                    var355.field5790 = var354.field1626;
                    var355.field5789 = field5043 + 1;
                    class286.field4012.method3904(var355, 0);
                    return;
                }
            } else if (arg0 < 2600) {
                class101 var76 = class271.method1711(field5032[--field5037], 23727);
                if (arg0 == 2500) {
                    field5032[field5037++] = var76.field1583;
                    return;
                }
                if (arg0 == 2501) {
                    field5032[field5037++] = var76.field1589;
                    return;
                }
                if (arg0 == 2502) {
                    field5032[field5037++] = var76.field1604;
                    return;
                }
                if (arg0 == 2503) {
                    field5032[field5037++] = var76.field1651;
                    return;
                }
                if (arg0 == 2504) {
                    field5032[field5037++] = var76.field1537 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field5032[field5037++] = var76.field1539;
                    return;
                }
                if (arg0 == 1506) {
                    class101 var77 = class210.method1444(0, var76);
                    field5032[field5037++] = var77 == null ? -1 : var77.field1577;
                    return;
                }
            } else if (arg0 < 2700) {
                class101 var78 = class271.method1711(field5032[--field5037], 23727);
                if (arg0 == 2600) {
                    field5032[field5037++] = var78.field1518;
                    return;
                }
                if (arg0 == 2601) {
                    field5032[field5037++] = var78.field1523;
                    return;
                }
                if (arg0 == 2602) {
                    field5039[field5018++] = var78.field1639;
                    return;
                }
                if (arg0 == 2603) {
                    field5032[field5037++] = var78.field1557;
                    return;
                }
                if (arg0 == 2604) {
                    field5032[field5037++] = var78.field1592;
                    return;
                }
                if (arg0 == 2605) {
                    field5032[field5037++] = var78.field1587;
                    return;
                }
                if (arg0 == 2606) {
                    field5032[field5037++] = var78.field1570;
                    return;
                }
                if (arg0 == 2607) {
                    field5032[field5037++] = var78.field1619;
                    return;
                }
                if (arg0 == 2608) {
                    field5032[field5037++] = var78.field1609;
                    return;
                }
                if (arg0 == 2609) {
                    field5032[field5037++] = var78.field1544;
                    return;
                }
                if (arg0 == 2610) {
                    field5032[field5037++] = var78.field1552;
                    return;
                }
                if (arg0 == 2611) {
                    field5032[field5037++] = var78.field1612;
                    return;
                }
                if (arg0 == 2612) {
                    field5032[field5037++] = var78.field1628;
                    return;
                }
                if (arg0 == 2613) {
                    field5032[field5037++] = var78.field1644;
                    return;
                }
                if (arg0 == 2614) {
                    field5032[field5037++] = var78.field1527 == 1 ? var78.field1598 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class101 var79 = class271.method1711(field5032[--field5037], 23727);
                    field5032[field5037++] = var79.field1565;
                    return;
                }
                if (arg0 == 2701) {
                    class101 var80 = class271.method1711(field5032[--field5037], 23727);
                    if (var80.field1565 != -1) {
                        field5032[field5037++] = var80.field1489;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var81 = field5032[--field5037];
                    class259 var82 = (class259) class199.field3098.method2818(-22803, (long) var81);
                    if (var82 != null) {
                        field5032[field5037++] = 1;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class101 var83 = class271.method1711(field5032[--field5037], 23727);
                    if (var83.field1578 == null) {
                        field5032[field5037++] = 0;
                        return;
                    }
                    int var84 = var83.field1578.length;
                    for (int var85 = 0; var85 < var83.field1578.length; var85++) {
                        if (var83.field1578[var85] == null) {
                            var84 = var85;
                            break;
                        }
                    }
                    field5032[field5037++] = var84;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field5037 -= 2;
                    int var86 = field5032[field5037];
                    int var87 = field5032[field5037 + 1];
                    class259 var88 = (class259) class199.field3098.method2818(-22803, (long) var86);
                    if (var88 != null && var88.field3716 == var87) {
                        field5032[field5037++] = 1;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class101 var89 = class271.method1711(field5032[--field5037], 23727);
                if (arg0 == 2800) {
                    field5032[field5037++] = client.method707(var89).method1958((byte) -123);
                    return;
                }
                if (arg0 == 2801) {
                    int var90 = field5032[--field5037];
                    int var357 = var90 - 1;
                    if (var89.field1642 != null && var357 < var89.field1642.length && var89.field1642[var357] != null) {
                        field5039[field5018++] = var89.field1642[var357];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var89.field1546 == null) {
                        field5039[field5018++] = "";
                        return;
                    }
                    field5039[field5018++] = var89.field1546;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var91 = field5039[--field5018];
                    class598.method3415(12067, var91);
                    return;
                }
                if (arg0 == 3101) {
                    field5037 -= 2;
                    class385.method2354(field5032[field5037 + 1], (byte) -14, field5032[field5037], class103.field1708);
                    return;
                }
                if (arg0 == 3103) {
                    class31.method288(-22995, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var92 = field5039[--field5018];
                    int var93 = 0;
                    if (class428.method2518((byte) -30, var92)) {
                        var93 = class252.method1611(var92, (byte) 24);
                    }
                    field5028++;
                    class699 var94 = class452.method2630(class699.field9897, class507.field7531, (byte) 122);
                    var94.field9908.method2733(false, var93);
                    class149.method1134(var94, true);
                    return;
                }
                if (arg0 == 3105) {
                    String var95 = field5039[--field5018];
                    field5030++;
                    class699 var96 = class452.method2630(class699.field9897, class286.field4018, (byte) 124);
                    var96.field9908.method2753((byte) 71, var95.length() + 1);
                    var96.field9908.method2703(false, var95);
                    class149.method1134(var96, true);
                    return;
                }
                if (arg0 == 3106) {
                    String var97 = field5039[--field5018];
                    field5031++;
                    class699 var98 = class452.method2630(class699.field9897, class57.field846, (byte) 122);
                    var98.field9908.method2753((byte) 68, var97.length() + 1);
                    var98.field9908.method2703(false, var97);
                    class149.method1134(var98, true);
                    return;
                }
                if (arg0 == 3107) {
                    int var99 = field5032[--field5037];
                    String var100 = field5039[--field5018];
                    class664.method3739(var99, var100, 0);
                    return;
                }
                if (arg0 == 3108) {
                    field5037 -= 3;
                    int var101 = field5032[field5037];
                    int var102 = field5032[field5037 + 1];
                    int var103 = field5032[field5037 + 2];
                    class101 var104 = class271.method1711(var103, 23727);
                    class473.method2781(var101, var104, var102, (byte) -28);
                    return;
                }
                if (arg0 == 3109) {
                    field5037 -= 2;
                    int var105 = field5032[field5037];
                    int var106 = field5032[field5037 + 1];
                    class101 var107 = arg1 ? field5029 : field5033;
                    class473.method2781(var105, var107, var106, (byte) -21);
                    return;
                }
                if (arg0 == 3110) {
                    int var108 = field5032[--field5037];
                    field5038++;
                    class699 var109 = class452.method2630(class699.field9897, class340.field4727, (byte) 122);
                    var109.field9908.method2739((byte) -86, var108);
                    class149.method1134(var109, true);
                    return;
                }
                if (arg0 == 3111) {
                    field5037 -= 2;
                    int var110 = field5032[field5037];
                    int var111 = field5032[field5037 + 1];
                    class259 var112 = (class259) class199.field3098.method2818(-22803, (long) var110);
                    if (var112 != null) {
                        class270.method1705(var112.field3716 != var111, -41, var112, true);
                    }
                    class536.method3142(3, var110, true, var111, -70);
                    return;
                }
                if (arg0 == 3112) {
                    field5037--;
                    int var113 = field5032[field5037];
                    class259 var114 = (class259) class199.field3098.method2818(-22803, (long) var113);
                    if (var114 != null && var114.field3711 == 3) {
                        class270.method1705(true, -42, var114, true);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class554.method3248(-11648, field5039[--field5018]);
                    return;
                }
                if (arg0 == 3114) {
                    field5037 -= 2;
                    int var115 = field5032[field5037];
                    int var116 = field5032[field5037 + 1];
                    String var117 = field5039[--field5018];
                    class418.method2478(var115, "", "", var117, var116, "", 0);
                    return;
                }
                if (arg0 == 3115) {
                    field5037 -= 11;
                    class186[] var118 = class405.method2437((byte) -125);
                    class409[] var119 = class113.method919(false);
                    class631.method3562(field5032[field5037 + 3], field5032[field5037 + 2], field5032[field5037 + 9], field5032[field5037 + 6], field5032[field5037 + 5], var119[field5032[field5037 + 1]], var118[field5032[field5037]], field5032[field5037 + 8], field5032[field5037 + 7], field5032[field5037 + 4], field5032[field5037 + 10], (byte) 126);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field5037 -= 3;
                    class542.method3190(256, 255, field5032[field5037 + 2], true, field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
                if (arg0 == 3201) {
                    class69.method567(50, 255, -1536601784, field5032[--field5037]);
                    return;
                }
                if (arg0 == 3202) {
                    field5037 -= 2;
                    class258.method1641(field5032[field5037], 255, (byte) 32, field5032[field5037 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field5037 -= 4;
                    class542.method3190(256, field5032[field5037 + 3], field5032[field5037 + 2], true, field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
                if (arg0 == 3204) {
                    field5037 -= 3;
                    class69.method567(field5032[field5037 + 2], field5032[field5037 + 1], -1536601784, field5032[field5037]);
                    return;
                }
                if (arg0 == 3205) {
                    field5037 -= 3;
                    class258.method1641(field5032[field5037], field5032[field5037 + 2], (byte) 71, field5032[field5037 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field5037 -= 4;
                    class522.method3076((byte) 126, false, field5032[field5037 + 3], field5032[field5037 + 2], 256, field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
                if (arg0 == 3207) {
                    field5037 -= 4;
                    class522.method3076((byte) -111, true, field5032[field5037 + 3], field5032[field5037 + 2], 256, field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
                if (arg0 == 3208) {
                    field5037 -= 5;
                    class542.method3190(field5032[field5037 + 4], field5032[field5037 + 3], field5032[field5037 + 2], true, field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
                if (arg0 == 3209) {
                    field5037 -= 5;
                    class522.method3076((byte) 127, false, field5032[field5037 + 3], field5032[field5037 + 2], field5032[field5037 + 4], field5032[field5037 + 1], field5032[field5037]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field5032[field5037++] = class148.field2508;
                    return;
                }
                if (arg0 == 3301) {
                    field5037 -= 2;
                    int var120 = field5032[field5037];
                    int var121 = field5032[field5037 + 1];
                    field5032[field5037++] = class355.method2145(var121, var120, false, (byte) 17);
                    return;
                }
                if (arg0 == 3302) {
                    field5037 -= 2;
                    int var122 = field5032[field5037];
                    int var123 = field5032[field5037 + 1];
                    field5032[field5037++] = class590.method3387(var122, var123, false, -1);
                    return;
                }
                if (arg0 == 3303) {
                    field5037 -= 2;
                    int var124 = field5032[field5037];
                    int var125 = field5032[field5037 + 1];
                    field5032[field5037++] = class522.method3077(false, true, var124, var125);
                    return;
                }
                if (arg0 == 3304) {
                    int var126 = field5032[--field5037];
                    field5032[field5037++] = class63.field914.method3409((byte) 52, var126).field4918;
                    return;
                }
                if (arg0 == 3305) {
                    int var127 = field5032[--field5037];
                    field5032[field5037++] = class207.field3193[var127];
                    return;
                }
                if (arg0 == 3306) {
                    int var128 = field5032[--field5037];
                    field5032[field5037++] = class243.field3565[var128];
                    return;
                }
                if (arg0 == 3307) {
                    int var129 = field5032[--field5037];
                    field5032[field5037++] = class696.field9877[var129];
                    return;
                }
                if (arg0 == 3308) {
                    byte var130 = class103.field1708.field3158;
                    int var131 = (class103.field1708.field3155 >> 9) + class143.field2474;
                    int var132 = (class103.field1708.field3154 >> 9) + class63.field917;
                    field5032[field5037++] = (var130 << 28) + (var131 << 14) + var132;
                    return;
                }
                if (arg0 == 3309) {
                    int var133 = field5032[--field5037];
                    field5032[field5037++] = var133 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var134 = field5032[--field5037];
                    field5032[field5037++] = var134 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var135 = field5032[--field5037];
                    field5032[field5037++] = var135 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field5032[field5037++] = class206.field3186 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field5037 -= 2;
                    int var136 = field5032[field5037];
                    int var137 = field5032[field5037 + 1];
                    field5032[field5037++] = class355.method2145(var137, var136, true, (byte) -31);
                    return;
                }
                if (arg0 == 3314) {
                    field5037 -= 2;
                    int var138 = field5032[field5037];
                    int var139 = field5032[field5037 + 1];
                    field5032[field5037++] = class590.method3387(var138, var139, true, -1);
                    return;
                }
                if (arg0 == 3315) {
                    field5037 -= 2;
                    int var140 = field5032[field5037];
                    int var141 = field5032[field5037 + 1];
                    field5032[field5037++] = class522.method3077(true, true, var140, var141);
                    return;
                }
                if (arg0 == 3316) {
                    if (class447.field6459 >= 2) {
                        field5032[field5037++] = class447.field6459;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field5032[field5037++] = class26.field363;
                    return;
                }
                if (arg0 == 3318) {
                    field5032[field5037++] = class97.field1450.field4294;
                    return;
                }
                if (arg0 == 3321) {
                    field5032[field5037++] = class72.field1155;
                    return;
                }
                if (arg0 == 3322) {
                    field5032[field5037++] = class627.field8930;
                    return;
                }
                if (arg0 == 3323) {
                    if (class385.field5643 >= 5 && class385.field5643 <= 9) {
                        field5032[field5037++] = 1;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class385.field5643 >= 5 && class385.field5643 <= 9) {
                        field5032[field5037++] = class385.field5643;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field5032[field5037++] = class165.field2721 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field5032[field5037++] = class103.field1708.field3838;
                    return;
                }
                if (arg0 == 3327) {
                    field5032[field5037++] = class103.field1708.field3841.field2953 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field5032[field5037++] = class289.field4065 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var142 = field5032[--field5037];
                    field5032[field5037++] = class340.method2045(false, true, var142);
                    return;
                }
                if (arg0 == 3331) {
                    field5037 -= 2;
                    int var143 = field5032[field5037];
                    int var144 = field5032[field5037 + 1];
                    field5032[field5037++] = class131.method1022(false, var143, var144, false, -119);
                    return;
                }
                if (arg0 == 3332) {
                    field5037 -= 2;
                    int var145 = field5032[field5037];
                    int var146 = field5032[field5037 + 1];
                    field5032[field5037++] = class131.method1022(false, var145, var146, true, -124);
                    return;
                }
                if (arg0 == 3333) {
                    field5032[field5037++] = class70.field1107;
                    return;
                }
                if (arg0 == 3335) {
                    field5032[field5037++] = class238.field3511;
                    return;
                }
                if (arg0 == 3336) {
                    field5037 -= 4;
                    int var147 = field5032[field5037];
                    int var148 = field5032[field5037 + 1];
                    int var149 = field5032[field5037 + 2];
                    int var150 = field5032[field5037 + 3];
                    int var151 = (var148 << 14) + var147;
                    int var152 = (var149 << 28) + var151;
                    int var153 = var150 + var152;
                    field5032[field5037++] = var153;
                    return;
                }
                if (arg0 == 3337) {
                    field5032[field5037++] = class557.field8151;
                    return;
                }
                if (arg0 == 3338) {
                    field5032[field5037++] = class547.method3210((byte) -47);
                    return;
                }
                if (arg0 == 3339) {
                    field5032[field5037++] = class210.field3212 ? 1 : 0;
                    return;
                }
                if (arg0 == 3340) {
                    field5032[field5037++] = class54.field710 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field5032[field5037++] = class508.field7568 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field5032[field5037++] = class313.field4336.method310(false);
                    return;
                }
                if (arg0 == 3343) {
                    field5032[field5037++] = class313.field4336.method321(126);
                    return;
                }
                if (arg0 == 3344) {
                    field5039[field5018++] = class201.method1401(60);
                    return;
                }
                if (arg0 == 3345) {
                    field5039[field5018++] = class482.method2812((byte) 4);
                    return;
                }
                if (arg0 == 3346) {
                    field5032[field5037++] = class341.method2049(8496);
                    return;
                }
                if (arg0 == 3347) {
                    field5032[field5037++] = class651.field9196;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field5037 -= 2;
                    int var154 = field5032[field5037];
                    int var155 = field5032[field5037 + 1];
                    class363 var156 = class103.field1706.method3096(var154, (byte) 127);
                    field5039[field5018++] = var156.method2184(var155, (byte) 31);
                    return;
                }
                if (arg0 == 3408) {
                    field5037 -= 4;
                    int var157 = field5032[field5037];
                    int var158 = field5032[field5037 + 1];
                    int var159 = field5032[field5037 + 2];
                    int var160 = field5032[field5037 + 3];
                    class363 var161 = class103.field1706.method3096(var159, (byte) 106);
                    if (var161.field5060 == var157 && var161.field5050 == var158) {
                        if (var158 == 115) {
                            field5039[field5018++] = var161.method2184(var160, (byte) 78);
                            return;
                        }
                        field5032[field5037++] = var161.method2181(true, var160);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field5037 -= 3;
                    int var162 = field5032[field5037];
                    int var163 = field5032[field5037 + 1];
                    int var164 = field5032[field5037 + 2];
                    if (var163 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class363 var165 = class103.field1706.method3096(var163, (byte) 102);
                    if (var165.field5050 != var162) {
                        throw new RuntimeException("C3409-1");
                    }
                    field5032[field5037++] = var165.method2187(var164, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var166 = field5032[--field5037];
                    String var167 = field5039[--field5018];
                    if (var166 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class363 var168 = class103.field1706.method3096(var166, (byte) 116);
                    if (var168.field5050 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field5032[field5037++] = var168.method2183(1005, var167) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var169 = field5032[--field5037];
                    class363 var170 = class103.field1706.method3096(var169, (byte) 114);
                    field5032[field5037++] = var170.field5057.method2813((byte) -104);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class219.field3281 == 0) {
                        field5032[field5037++] = -2;
                        return;
                    }
                    if (class219.field3281 == 1) {
                        field5032[field5037++] = -1;
                        return;
                    }
                    field5032[field5037++] = class520.field7677;
                    return;
                }
                if (arg0 == 3601) {
                    int var171 = field5032[--field5037];
                    if (class219.field3281 == 2 && var171 < class520.field7677) {
                        field5039[field5018++] = class437.field6290[var171];
                        if (class661.field9302[var171] != null) {
                            field5039[field5018++] = class661.field9302[var171];
                            return;
                        }
                        field5039[field5018++] = "";
                        return;
                    }
                    field5039[field5018++] = "";
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var172 = field5032[--field5037];
                    if (class219.field3281 == 2 && var172 < class520.field7677) {
                        field5032[field5037++] = class311.field4318[var172];
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var173 = field5032[--field5037];
                    if (class219.field3281 == 2 && var173 < class520.field7677) {
                        field5032[field5037++] = class351.field4937[var173];
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var174 = field5039[--field5018];
                    int var175 = field5032[--field5037];
                    class533.method3129(var175, var174, 1);
                    return;
                }
                if (arg0 == 3605) {
                    String var176 = field5039[--field5018];
                    class452.method2632(-79, var176);
                    return;
                }
                if (arg0 == 3606) {
                    String var177 = field5039[--field5018];
                    class398.method2420(1, var177);
                    return;
                }
                if (arg0 == 3607) {
                    String var178 = field5039[--field5018];
                    class561.method3280(false, true, var178);
                    return;
                }
                if (arg0 == 3608) {
                    String var179 = field5039[--field5018];
                    class486.method2838((byte) 4, var179);
                    return;
                }
                if (arg0 == 3609) {
                    String var180 = field5039[--field5018];
                    if (var180.startsWith("<img=0>") || var180.startsWith("<img=1>")) {
                        var180 = var180.substring(7);
                    }
                    field5032[field5037++] = class70.method576(var180, -1963318678) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var181 = field5032[--field5037];
                    if (class219.field3281 == 2 && var181 < class520.field7677) {
                        field5039[field5018++] = class418.field5954[var181];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class57.field857 != null) {
                        field5039[field5018++] = class216.method1461(-7256, class57.field857);
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class57.field857 != null) {
                        field5032[field5037++] = class320.field4407;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var182 = field5032[--field5037];
                    if (class57.field857 != null && var182 < class320.field4407) {
                        field5039[field5018++] = class230.field3409[var182].field485;
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var183 = field5032[--field5037];
                    if (class57.field857 != null && var183 < class320.field4407) {
                        field5032[field5037++] = class230.field3409[var183].field481;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var184 = field5032[--field5037];
                    if (class57.field857 != null && var184 < class320.field4407) {
                        field5032[field5037++] = class230.field3409[var184].field483;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field5032[field5037++] = class329.field4560;
                    return;
                }
                if (arg0 == 3617) {
                    String var185 = field5039[--field5018];
                    class156.method1171(98, var185);
                    return;
                }
                if (arg0 == 3618) {
                    field5032[field5037++] = class466.field6730;
                    return;
                }
                if (arg0 == 3619) {
                    String var186 = field5039[--field5018];
                    class186.method1326(true, var186);
                    return;
                }
                if (arg0 == 3620) {
                    class499.method2984((byte) -126);
                    return;
                }
                if (arg0 == 3621) {
                    if (class219.field3281 == 0) {
                        field5032[field5037++] = -1;
                        return;
                    }
                    field5032[field5037++] = class90.field1333;
                    return;
                }
                if (arg0 == 3622) {
                    int var187 = field5032[--field5037];
                    if (class219.field3281 != 0 && var187 < class90.field1333) {
                        field5039[field5018++] = class623.field8878[var187];
                        if (class409.field5848[var187] != null) {
                            field5039[field5018++] = class409.field5848[var187];
                            return;
                        }
                        field5039[field5018++] = "";
                        return;
                    }
                    field5039[field5018++] = "";
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var188 = field5039[--field5018];
                    if (var188.startsWith("<img=0>") || var188.startsWith("<img=1>")) {
                        var188 = var188.substring(7);
                    }
                    field5032[field5037++] = class536.method3143((byte) 43, var188) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var189 = field5032[--field5037];
                    if (class230.field3409 != null && var189 < class320.field4407 && class230.field3409[var189].field482.equalsIgnoreCase(class103.field1708.field3848)) {
                        field5032[field5037++] = 1;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class122.field1989 != null) {
                        field5039[field5018++] = class122.field1989;
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var190 = field5032[--field5037];
                    if (class57.field857 != null && var190 < class320.field4407) {
                        field5039[field5018++] = class230.field3409[var190].field486;
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var191 = field5032[--field5037];
                    if (class219.field3281 == 2 && var191 >= 0 && var191 < class520.field7677) {
                        field5032[field5037++] = class412.field5874[var191] ? 1 : 0;
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var192 = field5039[--field5018];
                    if (var192.startsWith("<img=0>") || var192.startsWith("<img=1>")) {
                        var192 = var192.substring(7);
                    }
                    field5032[field5037++] = class476.method2788(var192, (byte) -103);
                    return;
                }
                if (arg0 == 3629) {
                    field5032[field5037++] = class434.field6245;
                    return;
                }
                if (arg0 == 3630) {
                    String var193 = field5039[--field5018];
                    class561.method3280(true, true, var193);
                    return;
                }
                if (arg0 == 3631) {
                    int var194 = field5032[--field5037];
                    field5032[field5037++] = class373.field5181[var194] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var195 = field5032[--field5037];
                    if (class57.field857 != null && var195 < class320.field4407) {
                        field5039[field5018++] = class230.field3409[var195].field482;
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var196 = field5032[--field5037];
                    if (class219.field3281 != 0 && var196 < class90.field1333) {
                        field5039[field5018++] = class57.field854[var196];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var197 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var197].method3340((byte) -103);
                    return;
                }
                if (arg0 == 3904) {
                    int var198 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var198].field8436;
                    return;
                }
                if (arg0 == 3905) {
                    int var199 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var199].field8435;
                    return;
                }
                if (arg0 == 3906) {
                    int var200 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var200].field8445;
                    return;
                }
                if (arg0 == 3907) {
                    int var201 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var201].field8434;
                    return;
                }
                if (arg0 == 3908) {
                    int var202 = field5032[--field5037];
                    field5032[field5037++] = class490.field7031[var202].field8444;
                    return;
                }
                if (arg0 == 3910) {
                    int var203 = field5032[--field5037];
                    int var204 = class490.field7031[var203].method3336((byte) -69);
                    field5032[field5037++] = var204 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var205 = field5032[--field5037];
                    int var206 = class490.field7031[var205].method3336((byte) -69);
                    field5032[field5037++] = var206 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var207 = field5032[--field5037];
                    int var208 = class490.field7031[var207].method3336((byte) -69);
                    field5032[field5037++] = var208 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var209 = field5032[--field5037];
                    int var210 = class490.field7031[var209].method3336((byte) -69);
                    field5032[field5037++] = var210 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field5037 -= 2;
                    int var211 = field5032[field5037];
                    int var212 = field5032[field5037 + 1];
                    field5032[field5037++] = var211 + var212;
                    return;
                }
                if (arg0 == 4001) {
                    field5037 -= 2;
                    int var213 = field5032[field5037];
                    int var214 = field5032[field5037 + 1];
                    field5032[field5037++] = var213 - var214;
                    return;
                }
                if (arg0 == 4002) {
                    field5037 -= 2;
                    int var215 = field5032[field5037];
                    int var216 = field5032[field5037 + 1];
                    field5032[field5037++] = var215 * var216;
                    return;
                }
                if (arg0 == 4003) {
                    field5037 -= 2;
                    int var217 = field5032[field5037];
                    int var218 = field5032[field5037 + 1];
                    field5032[field5037++] = var217 / var218;
                    return;
                }
                if (arg0 == 4004) {
                    int var219 = field5032[--field5037];
                    field5032[field5037++] = (int) (Math.random() * (double) var219);
                    return;
                }
                if (arg0 == 4005) {
                    int var220 = field5032[--field5037];
                    field5032[field5037++] = (int) (Math.random() * (double) (var220 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field5037 -= 5;
                    int var221 = field5032[field5037];
                    int var222 = field5032[field5037 + 1];
                    int var223 = field5032[field5037 + 2];
                    int var224 = field5032[field5037 + 3];
                    int var225 = field5032[field5037 + 4];
                    field5032[field5037++] = (var222 - var221) * (var225 - var223) / (var224 - var223) + var221;
                    return;
                }
                if (arg0 == 4007) {
                    field5037 -= 2;
                    long var226 = (long) field5032[field5037];
                    long var228 = (long) field5032[field5037 + 1];
                    field5032[field5037++] = (int) (var226 * var228 / 100L + var226);
                    return;
                }
                if (arg0 == 4008) {
                    field5037 -= 2;
                    int var230 = field5032[field5037];
                    int var231 = field5032[field5037 + 1];
                    field5032[field5037++] = var230 | 0x1 << var231;
                    return;
                }
                if (arg0 == 4009) {
                    field5037 -= 2;
                    int var232 = field5032[field5037];
                    int var233 = field5032[field5037 + 1];
                    field5032[field5037++] = var232 & -(0x1 << var233) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field5037 -= 2;
                    int var234 = field5032[field5037];
                    int var235 = field5032[field5037 + 1];
                    field5032[field5037++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field5037 -= 2;
                    int var236 = field5032[field5037];
                    int var237 = field5032[field5037 + 1];
                    field5032[field5037++] = var236 % var237;
                    return;
                }
                if (arg0 == 4012) {
                    field5037 -= 2;
                    int var238 = field5032[field5037];
                    int var239 = field5032[field5037 + 1];
                    if (var238 == 0) {
                        field5032[field5037++] = 0;
                        return;
                    }
                    field5032[field5037++] = (int) Math.pow((double) var238, (double) var239);
                    return;
                }
                if (arg0 == 4013) {
                    field5037 -= 2;
                    int var240 = field5032[field5037];
                    int var241 = field5032[field5037 + 1];
                    if (var240 == 0) {
                        field5032[field5037++] = 0;
                        return;
                    }
                    if (var241 == 0) {
                        field5032[field5037++] = Integer.MAX_VALUE;
                        return;
                    }
                    field5032[field5037++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                    return;
                }
                if (arg0 == 4014) {
                    field5037 -= 2;
                    int var242 = field5032[field5037];
                    int var243 = field5032[field5037 + 1];
                    field5032[field5037++] = var242 & var243;
                    return;
                }
                if (arg0 == 4015) {
                    field5037 -= 2;
                    int var244 = field5032[field5037];
                    int var245 = field5032[field5037 + 1];
                    field5032[field5037++] = var244 | var245;
                    return;
                }
                if (arg0 == 4016) {
                    field5037 -= 2;
                    int var246 = field5032[field5037];
                    int var247 = field5032[field5037 + 1];
                    field5032[field5037++] = var246 < var247 ? var246 : var247;
                    return;
                }
                if (arg0 == 4017) {
                    field5037 -= 2;
                    int var248 = field5032[field5037];
                    int var249 = field5032[field5037 + 1];
                    field5032[field5037++] = var248 > var249 ? var248 : var249;
                    return;
                }
                if (arg0 == 4018) {
                    field5037 -= 3;
                    long var250 = (long) field5032[field5037];
                    long var252 = (long) field5032[field5037 + 1];
                    long var254 = (long) field5032[field5037 + 2];
                    field5032[field5037++] = (int) (var250 * var254 / var252);
                    return;
                }
                if (arg0 == 4019) {
                    field5037 -= 2;
                    int var256 = field5032[field5037];
                    int var257 = field5032[field5037 + 1];
                    if (var256 > 700 || var257 > 700) {
                        field5032[field5037++] = 256;
                    }
                    double var258 = (Math.random() * (double) (var256 + var257) + 800.0D - (double) var256) / 100.0D;
                    field5032[field5037++] = (int) (Math.pow(2.0D, var258) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var260 = field5039[--field5018];
                    int var261 = field5032[--field5037];
                    field5039[field5018++] = var260 + var261;
                    return;
                }
                if (arg0 == 4101) {
                    field5018 -= 2;
                    String var262 = field5039[field5018];
                    String var263 = field5039[field5018 + 1];
                    field5039[field5018++] = var262 + var263;
                    return;
                }
                if (arg0 == 4102) {
                    String var264 = field5039[--field5018];
                    int var265 = field5032[--field5037];
                    field5039[field5018++] = var264 + class234.method1537(true, var265, 18698);
                    return;
                }
                if (arg0 == 4103) {
                    String var266 = field5039[--field5018];
                    field5039[field5018++] = var266.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field5039[field5018++] = method2172(field5032[--field5037]);
                    return;
                }
                if (arg0 == 4105) {
                    field5018 -= 2;
                    String var267 = field5039[field5018];
                    String var268 = field5039[field5018 + 1];
                    if (class103.field1708.field3841 != null && class103.field1708.field3841.field2953) {
                        field5039[field5018++] = var268;
                        return;
                    }
                    field5039[field5018++] = var267;
                    return;
                }
                if (arg0 == 4106) {
                    int var269 = field5032[--field5037];
                    field5039[field5018++] = Integer.toString(var269);
                    return;
                }
                if (arg0 == 4107) {
                    field5018 -= 2;
                    field5032[field5037++] = class242.method1563(1, field5039[field5018], field5039[field5018 + 1], class238.field3511);
                    return;
                }
                if (arg0 == 4108) {
                    String var270 = field5039[--field5018];
                    field5037 -= 2;
                    int var271 = field5032[field5037];
                    int var272 = field5032[field5037 + 1];
                    class490 var273 = class128.method1014(class399.field5771, -1, 0, var272);
                    field5032[field5037++] = var273.method2867(var270, var271, 173, class541.field7948);
                    return;
                }
                if (arg0 == 4109) {
                    String var274 = field5039[--field5018];
                    field5037 -= 2;
                    int var275 = field5032[field5037];
                    int var276 = field5032[field5037 + 1];
                    class490 var277 = class128.method1014(class399.field5771, -1, 0, var276);
                    field5032[field5037++] = var277.method2862(var275, class541.field7948, 76, var274);
                    return;
                }
                if (arg0 == 4110) {
                    field5018 -= 2;
                    String var278 = field5039[field5018];
                    String var279 = field5039[field5018 + 1];
                    if (field5032[--field5037] == 1) {
                        field5039[field5018++] = var278;
                        return;
                    }
                    field5039[field5018++] = var279;
                    return;
                }
                if (arg0 == 4111) {
                    String var280 = field5039[--field5018];
                    field5039[field5018++] = class563.method3294(1375731712, var280);
                    return;
                }
                if (arg0 == 4112) {
                    String var281 = field5039[--field5018];
                    int var282 = field5032[--field5037];
                    if (var282 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field5039[field5018++] = var281 + (char) var282;
                    return;
                }
                if (arg0 == 4113) {
                    int var283 = field5032[--field5037];
                    field5032[field5037++] = class603.method3431((char) var283, -121) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var284 = field5032[--field5037];
                    field5032[field5037++] = class242.method1564((char) var284, 1) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var285 = field5032[--field5037];
                    field5032[field5037++] = class260.method1649((char) var285, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var286 = field5032[--field5037];
                    field5032[field5037++] = class44.method351((byte) -108, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var287 = field5039[--field5018];
                    if (var287 != null) {
                        field5032[field5037++] = var287.length();
                        return;
                    }
                    field5032[field5037++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var288 = field5039[--field5018];
                    field5037 -= 2;
                    int var289 = field5032[field5037];
                    int var290 = field5032[field5037 + 1];
                    field5039[field5018++] = var288.substring(var289, var290);
                    return;
                }
                if (arg0 == 4119) {
                    String var291 = field5039[--field5018];
                    StringBuffer var292 = new StringBuffer(var291.length());
                    boolean var293 = false;
                    for (int var294 = 0; var294 < var291.length(); var294++) {
                        char var295 = var291.charAt(var294);
                        if (var295 == '<') {
                            var293 = true;
                        } else if (var295 == '>') {
                            var293 = false;
                        } else if (!var293) {
                            var292.append(var295);
                        }
                    }
                    field5039[field5018++] = var292.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var296 = field5039[--field5018];
                    field5037 -= 2;
                    int var297 = field5032[field5037];
                    int var298 = field5032[field5037 + 1];
                    field5032[field5037++] = var296.indexOf(var297, var298);
                    return;
                }
                if (arg0 == 4121) {
                    field5018 -= 2;
                    String var299 = field5039[field5018];
                    String var300 = field5039[field5018 + 1];
                    int var301 = field5032[--field5037];
                    field5032[field5037++] = var299.indexOf(var300, var301);
                    return;
                }
                if (arg0 == 4122) {
                    int var302 = field5032[--field5037];
                    field5032[field5037++] = Character.toLowerCase((char) var302);
                    return;
                }
                if (arg0 == 4123) {
                    int var303 = field5032[--field5037];
                    field5032[field5037++] = Character.toUpperCase((char) var303);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var304 = field5032[--field5037] != 0;
                    int var305 = field5032[--field5037];
                    field5039[field5018++] = class332.method1975(0, class238.field3511, var304, (long) var305, -115);
                    return;
                }
                if (arg0 == 4125) {
                    String var306 = field5039[--field5018];
                    int var307 = field5032[--field5037];
                    class490 var308 = class128.method1014(class399.field5771, -1, 0, var307);
                    field5032[field5037++] = var308.method2873(123, var306, class541.field7948);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var309 = field5032[--field5037];
                    field5039[field5018++] = class430.field6132.method42(var309, false).field6194;
                    return;
                }
                if (arg0 == 4201) {
                    field5037 -= 2;
                    int var310 = field5032[field5037];
                    int var311 = field5032[field5037 + 1];
                    class432 var312 = class430.field6132.method42(var310, false);
                    if (var311 >= 1 && var311 <= 5 && var312.field6151[var311 - 1] != null) {
                        field5039[field5018++] = var312.field6151[var311 - 1];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field5037 -= 2;
                    int var313 = field5032[field5037];
                    int var314 = field5032[field5037 + 1];
                    class432 var315 = class430.field6132.method42(var313, false);
                    if (var314 >= 1 && var314 <= 5 && var315.field6153[var314 - 1] != null) {
                        field5039[field5018++] = var315.field6153[var314 - 1];
                        return;
                    }
                    field5039[field5018++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var316 = field5032[--field5037];
                    field5032[field5037++] = class430.field6132.method42(var316, false).field6198;
                    return;
                }
                if (arg0 == 4204) {
                    int var317 = field5032[--field5037];
                    field5032[field5037++] = class430.field6132.method42(var317, false).field6211 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var318 = field5032[--field5037];
                    class432 var319 = class430.field6132.method42(var318, false);
                    if (var319.field6146 == -1 && var319.field6201 >= 0) {
                        field5032[field5037++] = var319.field6201;
                        return;
                    }
                    field5032[field5037++] = var318;
                    return;
                }
                if (arg0 == 4206) {
                    int var320 = field5032[--field5037];
                    class432 var321 = class430.field6132.method42(var320, false);
                    if (var321.field6146 >= 0 && var321.field6201 >= 0) {
                        field5032[field5037++] = var321.field6201;
                        return;
                    }
                    field5032[field5037++] = var320;
                    return;
                }
                if (arg0 == 4207) {
                    int var322 = field5032[--field5037];
                    field5032[field5037++] = class430.field6132.method42(var322, false).field6218 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field5037 -= 2;
                    int var323 = field5032[field5037];
                    int var324 = field5032[field5037 + 1];
                    class349 var325 = class237.field3504.method1554(false, var324);
                    if (var325.method2122((byte) -67)) {
                        field5039[field5018++] = class430.field6132.method42(var323, false).method2538(var325.field4931, 10000000, var324);
                        return;
                    }
                    field5032[field5037++] = class430.field6132.method42(var323, false).method2531(false, var324, var325.field4922);
                    return;
                }
                if (arg0 == 4209) {
                    field5037 -= 2;
                    int var326 = field5032[field5037];
                    int var327 = field5032[field5037 + 1] - 1;
                    class432 var328 = class430.field6132.method42(var326, false);
                    if (var328.field6216 == var327) {
                        field5032[field5037++] = var328.field6164;
                        return;
                    }
                    if (var328.field6178 == var327) {
                        field5032[field5037++] = var328.field6150;
                        return;
                    }
                    field5032[field5037++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var329 = field5039[--field5018];
                    int var330 = field5032[--field5037];
                    class319.method1913(var330 == 1, var329, 13238);
                    field5032[field5037++] = class252.field3647;
                    return;
                }
                if (arg0 == 4211) {
                    if (class53.field685 != null && class168.field2747 < class252.field3647) {
                        field5032[field5037++] = class53.field685[class168.field2747++] & 0xFFFF;
                        return;
                    }
                    field5032[field5037++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class168.field2747 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var331 = field5032[--field5037];
                    field5032[field5037++] = class430.field6132.method42(var331, false).field6214;
                    return;
                }
                if (arg0 == 4214) {
                    String var332 = field5039[--field5018];
                    field5037 -= 3;
                    int var333 = field5032[field5037];
                    int var334 = field5032[field5037 + 1];
                    int var335 = field5032[field5037 + 2];
                    class586.method3383(var335, var334, (byte) 30, var333 == 1, var332);
                    field5032[field5037++] = class252.field3647;
                    return;
                }
                if (arg0 == 4215) {
                    field5018 -= 2;
                    field5037 -= 2;
                    String var336 = field5039[field5018];
                    int var337 = field5032[field5037];
                    int var338 = field5032[field5037 + 1];
                    String var339 = field5039[field5018 + 1];
                    class556.method3259(var338, var336, var337 == 1, false, var339);
                    field5032[field5037++] = class252.field3647;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field5037 -= 2;
                    int var340 = field5032[field5037];
                    int var341 = field5032[field5037 + 1];
                    class349 var342 = class237.field3504.method1554(false, var341);
                    if (var342.method2122((byte) -1)) {
                        field5039[field5018++] = class564.field8259.method3743(var340, true).method3108(var341, var342.field4931, (byte) 7);
                        return;
                    }
                    field5032[field5037++] = class564.field8259.method3743(var340, true).method3102(var341, (byte) 0, var342.field4922);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field5037 -= 2;
                    int var343 = field5032[field5037];
                    int var344 = field5032[field5037 + 1];
                    class349 var345 = class237.field3504.method1554(false, var344);
                    if (var345.method2122((byte) 126)) {
                        field5039[field5018++] = class14.field224.method2834(0, var343).method962(var345.field4931, -172, var344);
                        return;
                    }
                    field5032[field5037++] = class14.field224.method2834(0, var343).method958(var344, var345.field4922, 7112);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field5037 -= 2;
                    int var346 = field5032[field5037];
                    int var347 = field5032[field5037 + 1];
                    class349 var348 = class237.field3504.method1554(false, var347);
                    if (var348.method2122((byte) 126)) {
                        field5039[field5018++] = class667.field9380.method3181(var346, (byte) -3).method2993(var348.field4931, var347, 15825);
                        return;
                    }
                    field5032[field5037++] = class667.field9380.method3181(var346, (byte) -3).method2989(var348.field4922, (byte) 1, var347);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var349 = field5032[--field5037];
                class674 var350 = class625.field8919.method975(32, var349);
                if (var350.field9592 != null && var350.field9592.length > 0) {
                    int var351 = 0;
                    int var352 = var350.field9612[0];
                    for (int var353 = 1; var353 < var350.field9592.length; var353++) {
                        if (var350.field9612[var353] > var352) {
                            var351 = var353;
                            var352 = var350.field9612[var353];
                        }
                    }
                    field5032[field5037++] = var350.field9592[var351];
                    return;
                }
                field5032[field5037++] = var350.field9585;
                return;
            }
        } else {
            class101 var50;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var50 = class271.method1711(field5032[--field5037], 23727);
            } else {
                var50 = arg1 ? field5029 : field5033;
            }
            if (arg0 == 1300) {
                int var51 = field5032[--field5037] - 1;
                if (var51 >= 0 && var51 <= 9) {
                    var50.method847(var51, field5039[--field5018], -98);
                    return;
                }
                field5018--;
                return;
            }
            if (arg0 == 1301) {
                field5037 -= 2;
                int var52 = field5032[field5037];
                int var53 = field5032[field5037 + 1];
                if (var52 == -1 && var53 == -1) {
                    var50.field1556 = null;
                    return;
                }
                var50.field1556 = class620.method3501(var52, false, var53);
                return;
            }
            if (arg0 == 1302) {
                int var54 = field5032[--field5037];
                if (class201.field3105 != var54 && class312.field4321 != var54 && class313.field4342 != var54) {
                    return;
                }
                var50.field1508 = var54;
                return;
            }
            if (arg0 == 1303) {
                var50.field1500 = field5032[--field5037];
                return;
            }
            if (arg0 == 1304) {
                var50.field1504 = field5032[--field5037];
                return;
            }
            if (arg0 == 1305) {
                var50.field1546 = field5039[--field5018];
                return;
            }
            if (arg0 == 1306) {
                var50.field1513 = field5039[--field5018];
                return;
            }
            if (arg0 == 1307) {
                var50.field1642 = null;
                return;
            }
            if (arg0 == 1308) {
                var50.field1505 = field5032[--field5037];
                var50.field1497 = field5032[--field5037];
                return;
            }
            if (arg0 == 1309) {
                int var55 = field5032[--field5037];
                int var56 = field5032[--field5037];
                if (var56 >= 1 && var56 <= 10) {
                    var50.method843(var56 - 1, var55, true);
                }
                return;
            }
            if (arg0 == 1310) {
                var50.field1579 = field5039[--field5018];
                return;
            }
            if (arg0 == 1311) {
                var50.field1588 = field5032[--field5037];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var57;
                int var58;
                int var59;
                if (arg0 == 1312) {
                    field5037 -= 3;
                    var57 = field5032[field5037] - 1;
                    var58 = field5032[field5037 + 1];
                    var59 = field5032[field5037 + 2];
                    if (var57 < 0 || var57 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field5037 -= 2;
                    var57 = 10;
                    var58 = field5032[field5037];
                    var59 = field5032[field5037 + 1];
                }
                if (var50.field1490 == null) {
                    if (var58 == 0) {
                        return;
                    }
                    var50.field1490 = new byte[11];
                    var50.field1547 = new byte[11];
                    var50.field1620 = new int[11];
                }
                var50.field1490[var57] = (byte) var58;
                if (var58 == 0) {
                    var50.field1524 = false;
                    for (int var60 = 0; var60 < var50.field1490.length; var60++) {
                        if (var50.field1490[var60] != 0) {
                            var50.field1524 = true;
                            break;
                        }
                    }
                } else {
                    var50.field1524 = true;
                }
                var50.field1547[var57] = (byte) var59;
                return;
            }
            if (arg0 == 1314) {
                var50.field1573 = field5032[--field5037];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }
}
