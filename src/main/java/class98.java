import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class98 {

    @OriginalMember(owner = "client!mr", name = "p", descriptor = "Ljava/lang/String;")
    private String field1410 = "null";

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
    public static int[] field1395 = new int[14];

    @OriginalMember(owner = "client!mr", name = "r", descriptor = "[I")
    public static int[] field1412;

    @OriginalMember(owner = "client!mr", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1414;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "C")
    public char field1400;

    @OriginalMember(owner = "client!mr", name = "h", descriptor = "C")
    public char field1402;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!mr", name = "i", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!mr", name = "k", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!mr", name = "n", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!mr", name = "o", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!mr", name = "q", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!mr", name = "s", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Ljd;")
    public static class156 field1401;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "Lgu;")
    private class412 field1399;

    @OriginalMember(owner = "client!mr", name = "j", descriptor = "Lgu;")
    public class412 field1404;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mr", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field1415;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lba;III[Z)Z")
    public static final boolean method792(class265 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class491.field7059 != class290.field4367) {
            int var6 = class289.field4358[arg1].method412(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class145 var8 = class289.field4358[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method412(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method399(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method410(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lhp;B)V")
    public final void method793(class217 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1515((byte) 122);
            if (var3 == 0) {
                if (arg1 != 21) {
                    return;
                }
                field1409++;
                return;
            }
            this.method801(var3, arg0, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
    private final void method794(int arg0) {
        field1408++;
        this.field1399 = new class412(this.field1404.method2583(false));
        class308 var2 = (class308) this.field1404.method2592(119);
        if (arg0 != 14) {
            this.method800(92, 14);
        }
        while (var2 != null) {
            class308 var3 = new class308((int) var2.field6388);
            this.field1399.method2591((long) var2.field4638, var3, (byte) -124);
            var2 = (class308) this.field1404.method2589(arg0 ^ 0xFFFFFFF1);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)I")
    public final int method795(int arg0, int arg1) {
        field1397++;
        if (this.field1404 == null) {
            return this.field1398;
        }
        class308 var3 = (class308) this.field1404.method2585((byte) 114, (long) arg0);
        if (var3 == null) {
            return this.field1398;
        } else {
            int var4 = 103 / ((arg1 + 27) / 42);
            return var3.field4638;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Z")
    public final boolean method796(int arg0, byte arg1) {
        field1407++;
        if (this.field1404 == null) {
            return false;
        }
        if (this.field1399 == null) {
            this.method794(14);
        }
        class308 var3 = (class308) this.field1399.method2585((byte) 114, (long) arg0);
        if (var3 == null) {
            return false;
        } else if (arg1 == -14) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
    public static void method797(int arg0) {
        field1401 = null;
        field1412 = null;
        field1414 = null;
        if (arg0 == -27777) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method798(String arg0, int arg1) {
        field1403++;
        int var2 = -48 / ((16 - arg1) / 49);
        if (!arg0.equals("")) {
            class42.field553++;
            class74.method640(-29627, class422.field6281);
            class71.field1020.method1545(class4.method10(arg0, 73), -123);
            class71.field1020.method1534(arg0, false);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method799(byte arg0, String arg1) {
        field1411++;
        if (this.field1404 == null) {
            return false;
        }
        if (this.field1399 == null) {
            this.method803(-10616);
        }
        int var3 = -19 % ((arg0 + 12) / 33);
        for (class364 var4 = (class364) this.field1399.method2585((byte) 114, class58.method523(arg1, 0)); var4 != null; var4 = (class364) this.field1399.method2590((byte) 90)) {
            if (var4.field5381.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method800(int arg0, int arg1) {
        if (arg0 < 27) {
            this.method801(-49, null, (byte) 81);
        }
        field1405++;
        if (this.field1404 == null) {
            return this.field1410;
        } else {
            class46 var3 = (class46) this.field1404.method2585((byte) 114, (long) arg1);
            return var3 == null ? this.field1410 : var3.field593;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(ILhp;B)V")
    private final void method801(int arg0, class217 arg1, byte arg2) {
        field1396++;
        if (arg0 == 1) {
            this.field1400 = class467.method2818(arg1.method1565(true), (byte) 104);
        } else if (arg0 == 2) {
            this.field1402 = class467.method2818(arg1.method1565(true), (byte) -104);
        } else if (arg0 == 3) {
            this.field1410 = arg1.method1550((byte) 28);
        } else if (arg0 == 4) {
            this.field1398 = arg1.method1556(107);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1511(-117);
            this.field1404 = new class412(class396.method2493((byte) 66, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1556(103);
                class431 var7;
                if (arg0 == 5) {
                    var7 = new class46(arg1.method1550((byte) 28));
                } else {
                    var7 = new class308(arg1.method1556(118));
                }
                this.field1404.method2591((long) var6, var7, (byte) 123);
            }
        }
        if (arg2 <= 31) {
            method798(null, -65);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILya;BIIIII)V")
    public static final void method802(int arg0, int arg1, class38 arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1406++;
        class164 var9 = (class164) class85.method713(arg6, arg8, arg7);
        if (var9 != null) {
            class69 var10 = class510.field7458.method2973(-125, var9.method624((byte) -124));
            int var11 = var9.method621(3021) & 0x3;
            int var12 = var9.method627(23326);
            if (var10.field900 == -1) {
                int var13 = arg5;
                if (var10.field922 > 0) {
                    var13 = arg1;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg2.method277(arg4, 4, 106, arg0, var13);
                    } else if (var11 == 1) {
                        arg2.method278(arg0, 4, var13, arg4, true);
                    } else if (var11 == 2) {
                        arg2.method277(arg4, 4, 68, arg0 + 3, var13);
                    } else if (var11 == 3) {
                        arg2.method278(arg0, 4, var13, arg4 + 3, true);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg2.method364(arg4, 1, var13, 1, arg0, 1);
                    } else if (var11 == 1) {
                        arg2.method364(arg4, 1, var13, 1, arg0 + 3, 1);
                    } else if (var11 == 2) {
                        arg2.method364(arg4 + 3, 1, var13, 1, arg0 + 3, 1);
                    } else if (var11 == 3) {
                        arg2.method364(arg4 + 3, 1, var13, 1, arg0, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg2.method278(arg0, 4, var13, arg4, true);
                    } else if (var11 == 1) {
                        arg2.method277(arg4, 4, 19, arg0 + 3, var13);
                    } else if (var11 == 2) {
                        arg2.method278(arg0, 4, var13, arg4 + 3, true);
                    } else if (var11 == 3) {
                        arg2.method277(arg4, 4, 71, arg0, var13);
                    }
                }
            } else {
                class88.method726(arg2, 119, arg0, var10, var11, arg4);
            }
        }
        class164 var14 = (class164) class154.method1057(arg6, arg8, arg7, field1415 == null ? (field1415 = method804("ig")) : field1415);
        if (arg3 < 23) {
            field1412 = null;
        }
        if (var14 != null) {
            class69 var15 = class510.field7458.method2973(-122, var14.method624((byte) -127));
            int var16 = var14.method621(3021) & 0x3;
            int var17 = var14.method627(23326);
            if (var15.field900 != -1) {
                class88.method726(arg2, 93, arg0, var15, var16, arg4);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field922 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg2.method316(10823, arg4 + 3, arg0, arg4, var18, arg0 + 3);
                } else {
                    arg2.method316(10823, arg4, arg0, arg4 + 3, var18, arg0 + 3);
                }
            }
        }
        class164 var19 = (class164) class446.method2736(arg6, arg8, arg7);
        if (var19 == null) {
            return;
        }
        class69 var20 = class510.field7458.method2973(-121, var19.method624((byte) -127));
        int var21 = var19.method621(3021) & 0x3;
        if (var20.field900 != -1) {
            class88.method726(arg2, 96, arg0, var20, var21, arg4);
            return;
        }
    }

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
    private final void method803(int arg0) {
        field1413++;
        if (arg0 != -10616) {
            this.method795(2, -10);
        }
        this.field1399 = new class412(this.field1404.method2583(false));
        for (class46 var2 = (class46) this.field1404.method2592(124); var2 != null; var2 = (class46) this.field1404.method2589(arg0 ^ 0x2977)) {
            class364 var3 = new class364(var2.field593, (int) var2.field6388);
            this.field1399.method2591(class58.method523(var2.field593, 0), var3, (byte) -125);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method804(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class234("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field1412 = new int[14];
        field1414 = new String[] { "en", "de", "fr", "pt", "nl" };
    }
}
