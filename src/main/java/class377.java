import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class377 extends class200 {

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lf;")
    public static class529 field5711;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static void method2345(int arg0) {
        field5711 = null;
        if (arg0 != 0) {
            field5711 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public static final void method2346() {
        class492.field7279 = 0;
        label212: for (int var0 = 0; var0 < class441.field6585; var0++) {
            class531 var1 = class85.field1468[var0];
            if (class482.field7166 != null) {
                for (int var2 = 0; var2 < class482.field7166.length; var2++) {
                    if (class482.field7166[var2] != -1000000 && (var1.field7815 <= class482.field7166[var2] || var1.field7820 <= class482.field7166[var2]) && (var1.field7810 <= class521.field7737[var2] || var1.field7822 <= class521.field7737[var2]) && (var1.field7810 >= class502.field7409[var2] || var1.field7822 >= class502.field7409[var2]) && (var1.field7807 <= class500.field7379[var2] || var1.field7818 <= class500.field7379[var2]) && (var1.field7807 >= class286.field4071[var2] || var1.field7818 >= class286.field4071[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field7817 == 1) {
                int var3 = var1.field7814 + class369.field5579 - class267.field3846;
                if (var3 >= 0 && var3 <= class369.field5579 + class369.field5579) {
                    int var4 = var1.field7813 + class369.field5579 - class388.field5834;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class369.field5579 + class369.field5579) {
                        continue;
                    }
                    int var5 = var1.field7812 + class369.field5579 - class388.field5834;
                    if (var5 > class369.field5579 + class369.field5579) {
                        var5 = class369.field5579 + class369.field5579;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class62.field1078[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class472.field7077 - var1.field7810;
                        if (var7 > class350.field5379) {
                            var1.field7806 = 1;
                        } else {
                            if (var7 >= -class350.field5379) {
                                continue;
                            }
                            var1.field7806 = 2;
                            var7 = -var7;
                        }
                        var1.field7808 = (var1.field7807 - class350.field5363 << 8) / var7;
                        var1.field7809 = (var1.field7818 - class350.field5363 << 8) / var7;
                        var1.field7823 = (var1.field7815 - class455.field6800 << 8) / var7;
                        var1.field7811 = (var1.field7820 - class455.field6800 << 8) / var7;
                        class501.field7390[class492.field7279++] = var1;
                    }
                }
            } else if (var1.field7817 == 2) {
                int var8 = var1.field7813 + class369.field5579 - class388.field5834;
                if (var8 >= 0 && var8 <= class369.field5579 + class369.field5579) {
                    int var9 = var1.field7814 + class369.field5579 - class267.field3846;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class369.field5579 + class369.field5579) {
                        continue;
                    }
                    int var10 = var1.field7819 + class369.field5579 - class267.field3846;
                    if (var10 > class369.field5579 + class369.field5579) {
                        var10 = class369.field5579 + class369.field5579;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class62.field1078[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class350.field5363 - var1.field7807;
                        if (var12 > class350.field5379) {
                            var1.field7806 = 3;
                        } else {
                            if (var12 >= -class350.field5379) {
                                continue;
                            }
                            var1.field7806 = 4;
                            var12 = -var12;
                        }
                        var1.field7804 = (var1.field7810 - class472.field7077 << 8) / var12;
                        var1.field7816 = (var1.field7822 - class472.field7077 << 8) / var12;
                        var1.field7823 = (var1.field7815 - class455.field6800 << 8) / var12;
                        var1.field7811 = (var1.field7820 - class455.field6800 << 8) / var12;
                        class501.field7390[class492.field7279++] = var1;
                    }
                }
            } else if (var1.field7817 == 4) {
                int var13 = var1.field7815 - class455.field6800;
                if (var13 > class3.field104) {
                    int var14 = var1.field7813 + class369.field5579 - class388.field5834;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class369.field5579 + class369.field5579) {
                        continue;
                    }
                    int var15 = var1.field7812 + class369.field5579 - class388.field5834;
                    if (var15 > class369.field5579 + class369.field5579) {
                        var15 = class369.field5579 + class369.field5579;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field7814 + class369.field5579 - class267.field3846;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class369.field5579 + class369.field5579) {
                        continue;
                    }
                    int var17 = var1.field7819 + class369.field5579 - class267.field3846;
                    if (var17 > class369.field5579 + class369.field5579) {
                        var17 = class369.field5579 + class369.field5579;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class62.field1078[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field7806 = 5;
                        var1.field7804 = (var1.field7810 - class472.field7077 << 8) / var13;
                        var1.field7816 = (var1.field7822 - class472.field7077 << 8) / var13;
                        var1.field7808 = (var1.field7807 - class350.field5363 << 8) / var13;
                        var1.field7809 = (var1.field7818 - class350.field5363 << 8) / var13;
                        class501.field7390[class492.field7279++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lle;Lle;I)V")
    public static final void method2347(class200 arg0, class200 arg1, int arg2) {
        field5709++;
        if (arg1.field2923 != null) {
            arg1.method1382(7218);
        }
        arg1.field2923 = arg0;
        arg1.field2928 = arg0.field2928;
        arg1.field2923.field2928 = arg1;
        arg1.field2928.field2923 = arg1;
        if (arg2 < 59) {
            field5710 = -76;
        }
    }

    static {
        new class342(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field5710 = 0;
    }
}
