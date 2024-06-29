import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class23 extends class28 {

    @OriginalMember(owner = "client!db", name = "fb", descriptor = "I")
    private int field544 = -1;

    @OriginalMember(owner = "client!db", name = "cb", descriptor = "I")
    public int field541 = 0;

    @OriginalMember(owner = "client!db", name = "vb", descriptor = "I")
    private int field560 = 128;

    @OriginalMember(owner = "client!db", name = "ib", descriptor = "I")
    public int field547 = 0;

    @OriginalMember(owner = "client!db", name = "bb", descriptor = "I")
    public int field540 = 0;

    @OriginalMember(owner = "client!db", name = "yb", descriptor = "I")
    public int field563 = 0;

    @OriginalMember(owner = "client!db", name = "kb", descriptor = "I")
    private int field549 = -1;

    @OriginalMember(owner = "client!db", name = "gb", descriptor = "I")
    public int field545 = 0;

    @OriginalMember(owner = "client!db", name = "xb", descriptor = "I")
    private int field562 = 128;

    @OriginalMember(owner = "client!db", name = "wb", descriptor = "I")
    private int field561 = -1;

    @OriginalMember(owner = "client!db", name = "mb", descriptor = "Z")
    public boolean field551 = false;

    @OriginalMember(owner = "client!db", name = "nb", descriptor = "[Lja;")
    public class62[] field552 = new class62[] { null, null, class35.field849, null, null };

    @OriginalMember(owner = "client!db", name = "ub", descriptor = "I")
    private int field559 = 0;

    @OriginalMember(owner = "client!db", name = "eb", descriptor = "I")
    public int field543 = 0;

    @OriginalMember(owner = "client!db", name = "Fb", descriptor = "I")
    private int field570 = -1;

    @OriginalMember(owner = "client!db", name = "tb", descriptor = "I")
    private int field558 = -1;

    @OriginalMember(owner = "client!db", name = "db", descriptor = "I")
    private int field542 = -1;

    @OriginalMember(owner = "client!db", name = "Eb", descriptor = "I")
    private int field569 = -1;

    @OriginalMember(owner = "client!db", name = "W", descriptor = "I")
    public int field535 = -1;

    @OriginalMember(owner = "client!db", name = "rb", descriptor = "I")
    public int field556 = 0;

    @OriginalMember(owner = "client!db", name = "Rb", descriptor = "I")
    private int field582 = -1;

    @OriginalMember(owner = "client!db", name = "Gb", descriptor = "Lja;")
    public class62 field571 = class142.field3321;

    @OriginalMember(owner = "client!db", name = "pb", descriptor = "I")
    public int field554 = 0;

    @OriginalMember(owner = "client!db", name = "Ub", descriptor = "I")
    private int field585 = -1;

    @OriginalMember(owner = "client!db", name = "Ab", descriptor = "I")
    public int field565 = -1;

    @OriginalMember(owner = "client!db", name = "Ob", descriptor = "I")
    public int field579 = 2000;

    @OriginalMember(owner = "client!db", name = "Nb", descriptor = "I")
    public int field578 = 1;

    @OriginalMember(owner = "client!db", name = "Pb", descriptor = "I")
    private int field580 = 0;

    @OriginalMember(owner = "client!db", name = "Mb", descriptor = "I")
    public int field577 = 0;

    @OriginalMember(owner = "client!db", name = "Lb", descriptor = "I")
    private int field576 = -1;

    @OriginalMember(owner = "client!db", name = "Qb", descriptor = "[Lja;")
    public class62[] field581 = new class62[] { null, null, null, null, class50.field1160 };

    @OriginalMember(owner = "client!db", name = "X", descriptor = "I")
    private int field536 = 128;

    @OriginalMember(owner = "client!db", name = "Bb", descriptor = "Lja;")
    public static class62 field566 = class30.method243(43, "welle2:");

    @OriginalMember(owner = "client!db", name = "Sb", descriptor = "Lja;")
    public static class62 field583 = class30.method243(43, ": ");

    @OriginalMember(owner = "client!db", name = "Y", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!db", name = "Z", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!db", name = "hb", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!db", name = "jb", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!db", name = "lb", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!db", name = "qb", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!db", name = "sb", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!db", name = "zb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!db", name = "Cb", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!db", name = "Hb", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!db", name = "Ib", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!db", name = "Jb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!db", name = "Kb", descriptor = "I")
    public int field575;

    @OriginalMember(owner = "client!db", name = "Vb", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!db", name = "Wb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!db", name = "ab", descriptor = "[I")
    public static int[] field539;

    @OriginalMember(owner = "client!db", name = "ob", descriptor = "[I")
    public int[] field553;

    @OriginalMember(owner = "client!db", name = "Db", descriptor = "[I")
    public int[] field568;

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[S")
    private short[] field534;

    @OriginalMember(owner = "client!db", name = "Tb", descriptor = "[S")
    private short[] field584;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method178(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (arg1 instanceof class71) {
            class71 var3 = (class71) arg1;
            arg1 = var3.field1807;
            var2 = var3.field1802 + " | ";
        } else {
            var2 = "";
        }
        field538++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 < 70) {
            return null;
        }
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Z")
    public final boolean method179(boolean arg0, int arg1) {
        field572++;
        if (arg1 < 15) {
            return false;
        }
        int var3 = this.field549;
        int var4 = this.field558;
        int var5 = this.field585;
        if (arg0) {
            var5 = this.field570;
            var3 = this.field561;
            var4 = this.field569;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class96.field2242.method883(var3, -1, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !class96.field2242.method883(var5, -1, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !class96.field2242.method883(var4, -1, 0)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)Z")
    public final boolean method180(boolean arg0, byte arg1) {
        field548++;
        int var3 = this.field542;
        int var4 = -5 / ((22 - arg1) / 50);
        int var5 = this.field544;
        if (arg0) {
            var3 = this.field582;
            var5 = this.field576;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class96.field2242.method883(var3, -1, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !class96.field2242.method883(var5, -1, 0)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)Lqb;")
    public final class112 method181(int arg0, boolean arg1) {
        field574++;
        int var3 = this.field549;
        int var4 = this.field585;
        int var5 = this.field558;
        if (arg1) {
            var4 = this.field570;
            var5 = this.field569;
            var3 = this.field561;
        }
        if (arg0 == var3) {
            return null;
        }
        class112 var6 = class112.method925(class96.field2242, var3, 0);
        if (var4 != -1) {
            class112 var7 = class112.method925(class96.field2242, var4, 0);
            if (var5 == -1) {
                class112[] var10 = new class112[] { var6, var7 };
                var6 = new class112(var10, 2);
            } else {
                class112 var8 = class112.method925(class96.field2242, var5, 0);
                class112[] var9 = new class112[] { var6, var7, var8 };
                var6 = new class112(var9, 3);
            }
        }
        if (!arg1 && this.field580 != 0) {
            var6.method918(0, this.field580, 0);
        }
        if (arg1 && this.field559 != 0) {
            var6.method918(0, this.field559, 0);
        }
        if (this.field584 != null) {
            for (int var11 = 0; var11 < this.field584.length; var11++) {
                var6.method909(this.field584[var11], this.field534[var11]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public final void method182(boolean arg0) {
        field586++;
        if (arg0) {
            field539 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(ZI)Lqb;")
    public final class112 method183(boolean arg0, int arg1) {
        field550++;
        int var3 = this.field542;
        int var4 = this.field544;
        if (arg0) {
            var3 = this.field582;
            var4 = this.field576;
        }
        if (arg1 < 111) {
            this.field541 = 106;
        }
        if (var3 == -1) {
            return null;
        }
        class112 var5 = class112.method925(class96.field2242, var3, 0);
        if (var4 != -1) {
            class112 var6 = class112.method925(class96.field2242, var4, 0);
            class112[] var7 = new class112[] { var5, var6 };
            var5 = new class112(var7, 2);
        }
        if (this.field584 != null) {
            for (int var8 = 0; var8 < this.field584.length; var8++) {
                var5.method909(this.field584[var8], this.field534[var8]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILdb;Ldb;)V")
    public final void method184(int arg0, class23 arg1, class23 arg2) {
        this.field578 = arg1.field578;
        this.field547 = 1;
        this.field584 = arg2.field584;
        field573++;
        this.field534 = arg2.field534;
        this.field554 = arg2.field554;
        this.field577 = arg2.field577;
        this.field537 = arg2.field537;
        this.field571 = arg1.field571;
        this.field545 = arg2.field545;
        this.field540 = arg2.field540;
        this.field551 = arg1.field551;
        this.field556 = arg2.field556;
        this.field579 = arg2.field579;
        if (arg0 <= 120) {
            this.field545 = 69;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method185(int arg0) {
        if (arg0 != 93) {
            method185(72);
        }
        field583 = null;
        field539 = null;
        field566 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ls;B)V")
    public final void method186(class128 arg0, byte arg1) {
        if (arg1 > -96) {
            this.method187(-118, (byte) 11);
        }
        field587++;
        while (true) {
            int var3 = arg0.method1025(255);
            if (var3 == 0) {
                return;
            }
            this.method188(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IB)Lvb;")
    public final class145 method187(int arg0, byte arg1) {
        field557++;
        if (this.field568 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field553[var4] && this.field553[var4] != 0) {
                    var3 = this.field568[var4];
                }
            }
            if (var3 != -1) {
                return class140.method1114(var3, false).method187(1, (byte) -5);
            }
        }
        class145 var5 = (class145) class130.field2969.method129((long) this.field575, 24838);
        if (var5 != null) {
            return var5;
        }
        class112 var6 = class112.method925(class96.field2242, this.field537, 0);
        if (var6 == null) {
            return null;
        }
        if (this.field536 != 128 || this.field560 != 128 || this.field562 != 128) {
            var6.method916(this.field536, this.field560, this.field562);
        }
        if (arg1 != -5) {
            return null;
        }
        if (this.field584 != null) {
            for (int var7 = 0; var7 < this.field584.length; var7++) {
                var6.method909(this.field584[var7], this.field534[var7]);
            }
        }
        class145 var8 = var6.method921(this.field563 + 64, this.field543 + 768, -50, -10, -50);
        var8.field3373 = true;
        class130.field2969.method128((byte) -86, var8, (long) this.field575);
        return var8;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILs;I)V")
    private final void method188(int arg0, class128 arg1, int arg2) {
        if (arg0 != 0) {
            this.field579 = 76;
        }
        field564++;
        if (arg2 == 1) {
            this.field537 = arg1.method1041(212464720);
        } else if (arg2 == 2) {
            this.field571 = arg1.method1015((byte) -113);
            return;
        } else if (arg2 == 4) {
            this.field579 = arg1.method1041(212464720);
            return;
        } else if (arg2 == 5) {
            this.field554 = arg1.method1041(212464720);
            return;
        } else if (arg2 == 6) {
            this.field545 = arg1.method1041(212464720);
            return;
        } else if (arg2 == 7) {
            this.field540 = arg1.method1041(arg0 ^ 0xCA9F450);
            if (this.field540 > 32767) {
                this.field540 -= 65536;
                return;
            }
        } else if (arg2 == 8) {
            this.field577 = arg1.method1041(212464720);
            if (this.field577 > 32767) {
                this.field577 -= 65536;
                return;
            }
            return;
        } else if (arg2 == 11) {
            this.field547 = 1;
            return;
        } else if (arg2 == 12) {
            this.field578 = arg1.method1037(arg0 ^ 0x4992);
            return;
        } else if (arg2 == 16) {
            this.field551 = true;
            return;
        } else if (arg2 == 23) {
            this.field549 = arg1.method1041(212464720);
            this.field580 = arg1.method1025(255);
            return;
        } else if (arg2 == 24) {
            this.field585 = arg1.method1041(212464720);
            return;
        } else {
            if (arg2 == 25) {
                this.field561 = arg1.method1041(212464720);
                this.field559 = arg1.method1025(255);
            } else if (arg2 == 26) {
                this.field570 = arg1.method1041(arg0 ^ 0xCA9F450);
                return;
            } else if (arg2 >= 30 && arg2 < 35) {
                this.field552[arg2 - 30] = arg1.method1015((byte) -118);
                if (this.field552[arg2 - 30].method461(25064, class136.field3142)) {
                    this.field552[arg2 - 30] = null;
                    return;
                }
            } else if (arg2 < 35 || arg2 >= 40) {
                if (arg2 != 40) {
                    if (arg2 != 78) {
                        if (arg2 == 79) {
                            this.field569 = arg1.method1041(212464720);
                            return;
                        }
                        if (arg2 != 90) {
                            if (arg2 != 91) {
                                if (arg2 != 92) {
                                    if (arg2 == 93) {
                                        this.field576 = arg1.method1041(212464720);
                                        return;
                                    }
                                    if (arg2 != 95) {
                                        if (arg2 != 97) {
                                            if (arg2 == 98) {
                                                this.field565 = arg1.method1041(212464720);
                                                return;
                                            }
                                            if (arg2 >= 100 && arg2 < 110) {
                                                if (this.field568 == null) {
                                                    this.field568 = new int[10];
                                                    this.field553 = new int[10];
                                                }
                                                this.field568[arg2 - 100] = arg1.method1041(212464720);
                                                this.field553[arg2 - 100] = arg1.method1041(212464720);
                                                return;
                                            }
                                            if (arg2 != 110) {
                                                if (arg2 != 111) {
                                                    if (arg2 != 112) {
                                                        if (arg2 != 113) {
                                                            if (arg2 == 114) {
                                                                this.field543 = arg1.method1028(-115487256) * 5;
                                                            } else if (arg2 == 115) {
                                                                this.field541 = arg1.method1025(255);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        this.field563 = arg1.method1028(-115487256);
                                                        return;
                                                    }
                                                    this.field562 = arg1.method1041(212464720);
                                                    return;
                                                }
                                                this.field560 = arg1.method1041(212464720);
                                                return;
                                            }
                                            this.field536 = arg1.method1041(212464720);
                                            return;
                                        }
                                        this.field535 = arg1.method1041(212464720);
                                        return;
                                    }
                                    this.field556 = arg1.method1041(arg0 ^ 0xCA9F450);
                                    return;
                                }
                                this.field544 = arg1.method1041(212464720);
                                return;
                            }
                            this.field582 = arg1.method1041(arg0 ^ 0xCA9F450);
                            return;
                        }
                        this.field542 = arg1.method1041(arg0 + 212464720);
                        return;
                    }
                    this.field558 = arg1.method1041(212464720);
                    return;
                }
                int var4 = arg1.method1025(255);
                this.field534 = new short[var4];
                this.field584 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field584[var5] = (short) arg1.method1041(212464720);
                    this.field534[var5] = (short) arg1.method1041(212464720);
                }
                return;
            } else {
                this.field581[arg2 - 35] = arg1.method1015((byte) -88);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(II)Lqb;")
    public final class112 method189(int arg0, int arg1) {
        field555++;
        if (this.field568 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field553[var4] <= arg0 && this.field553[var4] != 0) {
                    var3 = this.field568[var4];
                }
            }
            if (var3 != -1) {
                return class140.method1114(var3, false).method189(1, -116);
            }
        }
        class112 var5 = class112.method925(class96.field2242, this.field537, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field536 != 128 || this.field560 != 128 || this.field562 != 128) {
            var5.method916(this.field536, this.field560, this.field562);
        }
        if (this.field584 != null) {
            for (int var6 = 0; var6 < this.field584.length; var6++) {
                var5.method909(this.field584[var6], this.field534[var6]);
            }
        }
        if (arg1 >= -111) {
            this.field551 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(II)Ldb;")
    public final class23 method190(int arg0, int arg1) {
        field546++;
        if (this.field568 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg1 >= this.field553[var4] && this.field553[var4] != 0) {
                    var3 = this.field568[var4];
                }
            }
            if (var3 != -1) {
                return class140.method1114(var3, false);
            }
        }
        return arg0 >= -31 ? null : this;
    }
}
