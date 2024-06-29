import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class487 extends class152 {

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "Ldj;")
    private class362 field6811;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)I", line = 3)
    public final int method2890(int arg0, int arg1, int arg2) {
        field6805++;
        if (arg2 != -13) {
            this.field6811 = null;
        }
        if (this.field6811 == null) {
            return arg1;
        } else {
            class365 var4 = (class365) this.field6811.method2121(arg2 + 82, (long) arg0);
            return var4 == null ? arg1 : var4.field4537;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Les;B)V", line = 27)
    public final void method2891(class403 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2396((byte) 59);
            if (var3 == 0) {
                if (arg1 != 83) {
                    field6807 = 57;
                }
                field6809++;
                return;
            }
            this.method2893(18, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 50)
    public final String method2892(int arg0, int arg1, String arg2) {
        field6808++;
        if (arg0 != -3) {
            this.field6811 = null;
        }
        if (this.field6811 == null) {
            return arg2;
        } else {
            class562 var4 = (class562) this.field6811.method2121(93, (long) arg1);
            return var4 == null ? arg2 : var4.field7772;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILes;I)V", line = 71)
    private final void method2893(int arg0, class403 arg1, int arg2) {
        field6806++;
        if (arg2 == 249) {
            int var4 = arg1.method2396((byte) 83);
            if (this.field6811 == null) {
                int var5 = class783.method4337(var4, (byte) 20);
                this.field6811 = new class362(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2396((byte) 38) == 1;
                int var8 = arg1.method2358(105);
                class379 var9;
                if (var7) {
                    var9 = new class562(arg1.method2384(-6435));
                } else {
                    var9 = new class365(arg1.method2381((byte) 79));
                }
                this.field6811.method2112(var9, (byte) 6, (long) var8);
            }
        }
        if (arg0 < 12) {
            field6807 = -128;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 116)
    public static final void method2894(byte arg0) {
        if (!class672.field9218) {
            class304.field3626 = class498.field6968 != -1 && class498.field6968 <= class245.field2894 || class245.field2894 * 16 + (class35.field536 ? 26 : 22) > class705.field9921;
        }
        field6810++;
        if (arg0 < 81) {
            method2894((byte) 92);
        }
        class282.field3277.method2729(-48);
        class580.field7913.method2729(-48);
        for (class75 var1 = (class75) class5.field52.method2725(37); var1 != null; var1 = (class75) class5.field52.method2726(-115)) {
            int var38 = var1.field1029;
            if (var38 < 1000) {
                var1.method2219(13630);
                if (var38 == 8 || var38 == 51 || var38 == 48 || var38 == 30 || var38 == 44 || var38 == 58 || var38 == 5) {
                    class580.field7913.method2732(var1, 21939);
                } else {
                    class282.field3277.method2732(var1, 21939);
                }
            }
        }
        class282.field3277.method2733(class5.field52, 30896);
        class580.field7913.method2733(class5.field52, 30896);
        if (class245.field2894 <= 1) {
            class427.field5651 = null;
            class748.field10391 = null;
        } else {
            if (class45.field603 && class348.field4350.method216(-54, 81) && class245.field2894 > 2) {
                class748.field10391 = (class75) class5.field52.field6367.field4808.field4808;
            } else {
                class748.field10391 = (class75) class5.field52.field6367.field4808;
            }
            class427.field5651 = (class75) class5.field52.field6367.field4808;
        }
        int var2 = -1;
        class730 var3 = (class730) class155.field1929.method2725(37);
        if (var3 != null) {
            var2 = var3.method1941(65280);
        }
        if (!class672.field9218) {
            if (var2 == 0 && (class25.field373 == 1 && class245.field2894 > 2 || class20.method232(false))) {
                var2 = 2;
            }
            if (var2 == 2 && class245.field2894 > 0 && var3 != null) {
                if (class634.field8654 == null && class473.field6590 == 0) {
                    class763.method4230(var3.method1936(-564899352), var3.method1937(93), true);
                } else {
                    class301.field3602 = 2;
                }
            }
            if (var2 == 0) {
                if (class748.field10391 != null) {
                    class389.method2278(650);
                } else if (class104.field1336) {
                    class118.method926(-125);
                }
            }
            if (class634.field8654 != null || class473.field6590 != 0) {
                return;
            }
            class677.field9289 = null;
            class301.field3602 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class738.field10291.method109(125);
            int var5 = class738.field10291.method117(true);
            boolean var6 = false;
            if (class288.field3466 != null) {
                if (var4 >= class743.field10352 - 10 && var4 <= class743.field10352 + class189.field2275 + 10 && var5 >= class656.field9045 - 10 && var5 <= (class656.field9045 - (-class711.field9978 - 10))) {
                    var6 = true;
                } else {
                    class260.method1560(true);
                }
            }
            if (!var6) {
                if (class705.field9916 - 10 > var4 || (class705.field9916 + class119.field1505 + 10) < var4 || var5 < class676.field9279 - 10 || var5 > (class553.field7697 + class676.field9279 + 10)) {
                    class149.method1076((byte) 116);
                } else if (class304.field3626) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class282.field3279; var9++) {
                        if (class35.field536) {
                            int var10 = var9 * 16 + class676.field9279 + 33;
                            if (var5 > var10 - 13 && var5 < var10 + 4) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class676.field9279 + 31;
                            if ((var11 - 13) < var5 && (var11 + 3) > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class723 var13 = new class723(class365.field4542);
                        for (class581 var14 = (class581) var13.method4089(-1); var14 != null; var14 = (class581) var13.method4090(-1)) {
                            if (var7 == var12) {
                                if (var14.field7927 > 1) {
                                    class172.method1169(-104, var5, var14, var8);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method1936(-564899352);
        int var16 = var3.method1937(-61);
        if (class288.field3466 != null && var15 >= class743.field10352 && var15 <= (class743.field10352 + class189.field2275) && var16 >= class656.field9045 && (class711.field9978 + class656.field9045) >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class288.field3466.field7927; var18++) {
                if (class35.field536) {
                    int var23 = var18 * 16 + class656.field9045 + 33;
                    if (var16 > var23 - 13 && (var23 + 4) > var16) {
                        var17 = var18;
                    }
                } else {
                    int var22 = (var18 * 16) + class656.field9045 + 31;
                    if ((var22 - 13) < var16 && (var22 + 3) > var16) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class723 var20 = new class723(class288.field3466.field7925);
                for (class75 var21 = (class75) var20.method4089(-1); var21 != null; var21 = (class75) var20.method4090(-1)) {
                    if (var17 == var19) {
                        class752.method4200(var21, (byte) 101, var16, var15);
                        break;
                    }
                    var19++;
                }
            }
            class149.method1076((byte) 116);
            return;
        }
        if (class705.field9916 > var15 || var15 > (class705.field9916 + class119.field1505) || class676.field9279 > var16 || var16 > (class676.field9279 + class553.field7697)) {
            return;
        }
        if (class304.field3626) {
            int var24 = -1;
            for (int var25 = 0; var25 < class282.field3279; var25++) {
                if (class35.field536) {
                    int var26 = var25 * 16 + class676.field9279 + 33;
                    if (var16 > var26 - 13 && var26 + 4 > var16) {
                        var24 = var25;
                        break;
                    }
                } else {
                    int var27 = var25 * 16 + class676.field9279 + 31;
                    if (var27 - 13 < var16 && var27 + 3 > var16) {
                        var24 = var25;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var28 = 0;
                class723 var29 = new class723(class365.field4542);
                for (class581 var30 = (class581) var29.method4089(-1); var30 != null; var30 = (class581) var29.method4090(-1)) {
                    if (var24 == var28) {
                        class752.method4200((class75) var30.field7925.field1703.field1903, (byte) 19, var16, var15);
                        class149.method1076((byte) 116);
                        return;
                    }
                    var28++;
                }
                return;
            }
        } else {
            int var31 = -1;
            for (int var32 = 0; var32 < class245.field2894; var32++) {
                if (class35.field536) {
                    int var37 = (class245.field2894 - var32 - 1) * 16 + class676.field9279 + 33;
                    if ((var37 - 13) < var16 && var37 + 4 > var16) {
                        var31 = var32;
                    }
                } else {
                    int var36 = class676.field9279 - (-(class245.field2894 - (var32 + 1)) * 16 - 31);
                    if (var16 > var36 - 13 && var16 < (var36 + 3)) {
                        var31 = var32;
                    }
                }
            }
            if (var31 != -1) {
                int var33 = 0;
                class522 var34 = new class522(class5.field52);
                for (class75 var35 = (class75) var34.method3136((byte) -47); var35 != null; var35 = (class75) var34.method3135((byte) 98)) {
                    if (var31 == var33) {
                        class752.method4200(var35, (byte) 25, var16, var15);
                        break;
                    }
                    var33++;
                }
            }
            class149.method1076((byte) 116);
        }
        return;
    }
}
