import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class189 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lih;")
    public class503 field2702;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "S")
    public static short field2703;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2709;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "Loi;")
    public static class53 field2710;

    static {
        new class530("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2703 = 32767;
        field2705 = 0;
        field2708 = 0;
        field2709 = new String[100];
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I", line = 11)
    public static final int method1203(int arg0, int arg1, int arg2) {
        field2707++;
        if (arg0 == arg1) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lih;)V", line = 42)
    public class189(class503 arg0) {
        this.field2702 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLhm;)Ljava/lang/String;", line = 54)
    public static final String method1204(boolean arg0, class150 arg1) {
        field2706++;
        if (client.method1291(arg1).method2886((byte) 107) == 0) {
            return null;
        } else if (arg0) {
            return null;
        } else if (arg1.field2142 == null || arg1.field2142.trim().length() == 0) {
            return class126.field1700 ? "Hidden-use" : null;
        } else {
            return arg1.field2142;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BIII)V", line = 81)
    public static final void method1205(byte arg0, int arg1, int arg2, int arg3) {
        field2704++;
        class45 var4 = class354.method2094(arg2, (byte) -67, 9);
        var4.method260(9188);
        var4.field516 = arg1;
        int var5 = 44 / ((arg0 - 58) / 32);
        var4.field504 = arg3;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "()V", line = 97)
    public static final void method1206() {
        if (class288.field4208 != null) {
            for (int var0 = 0; var0 < class288.field4208.length; var0++) {
                for (int var1 = 0; var1 < class6.field109; var1++) {
                    for (int var2 = 0; var2 < class272.field4032; var2++) {
                        if (class288.field4208[var0][var1][var2] != null) {
                            class288.field4208[var0][var1][var2].method1505(-3254);
                        }
                        class288.field4208[var0][var1][var2] = null;
                    }
                }
            }
        }
        class288.field4208 = null;
        class68.field858 = null;
        if (class418.field5879 != null) {
            for (int var3 = 0; var3 < class418.field5879.length; var3++) {
                for (int var4 = 0; var4 < class6.field109; var4++) {
                    for (int var5 = 0; var5 < class272.field4032; var5++) {
                        if (class418.field5879[var3][var4][var5] != null) {
                            class418.field5879[var3][var4][var5].method1505(-3254);
                        }
                        class418.field5879[var3][var4][var5] = null;
                    }
                }
            }
        }
        class418.field5879 = null;
        class60.field743 = null;
        class268.field3910 = null;
        class330.field4818 = null;
        class345.field5010 = 0;
        if (class382.field5383 != null) {
            for (int var6 = 0; var6 < class345.field5010; var6++) {
                class382.field5383[var6] = null;
            }
        }
        if (class521.field7661 != null) {
            for (int var7 = 0; var7 < class222.field3184; var7++) {
                class521.field7661[var7] = null;
            }
            class222.field3184 = 0;
        }
        if (class74.field899 != null) {
            for (int var8 = 0; var8 < class446.field6233; var8++) {
                class74.field899[var8] = null;
            }
            for (int var9 = 0; var9 < class409.field5785; var9++) {
                for (int var10 = 0; var10 < class6.field109; var10++) {
                    for (int var11 = 0; var11 < class272.field4032; var11++) {
                        class400.field5635[var9][var10][var11] = 0L;
                    }
                }
            }
            class446.field6233 = 0;
        }
        class520.field7650 = null;
        class332.method1989((byte) 120);
        class22.field286.method2754((byte) 63);
        class261.field3858 = null;
        class429.field6048 = null;
        class211.field3059 = null;
        class435.field6118 = null;
        class323.field4723 = null;
        class489.field6839 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V", line = 239)
    public static void method1207(boolean arg0) {
        if (arg0) {
            field2710 = null;
            field2709 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZLet;)V", line = 250)
    public static final void method1208(boolean arg0, boolean arg1, class429 arg2) {
        field2711++;
        if (class37.field408 >= 400) {
            return;
        }
        class322 var3 = arg2.field6055;
        if (var3.field4693 != null) {
            var3 = var3.method1939(15964, class163.field2413);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field4701) {
            return;
        }
        if (arg0) {
            field2705 = -27;
        }
        String var4 = var3.field4668;
        if (var3.field4664 != 0) {
            String var5 = class71.field886 == class246.field3594 ? class325.field4739.method3116(class149.field1979, (byte) 123) : class256.field3785.method3116(class149.field1979, (byte) 100);
            var4 = var4 + class460.method2681(var3.field4664, false, class246.field3587.field268) + " (" + var5 + var3.field4664 + ")";
        }
        if (!class427.field6024) {
            if (!arg1) {
                String[] var7 = var3.field4694;
                if (class516.field7601) {
                    var7 = class413.method2452((byte) 100, var7);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field4686 == 0 || !var7[var8].equalsIgnoreCase(class257.field3829.method3116(class149.field1979, (byte) 110)))) {
                            byte var9 = 0;
                            int var10 = class71.field885;
                            if (var8 == 0) {
                                var9 = 30;
                            }
                            if (var8 == 1) {
                                var9 = 16;
                            }
                            if (var8 == 2) {
                                var9 = 48;
                            }
                            if (var8 == 3) {
                                var9 = 3;
                            }
                            if (var8 == 4) {
                                var9 = 22;
                            }
                            if (var3.field4700 == var8) {
                                var10 = var3.field4652;
                            }
                            if (var3.field4662 == var8) {
                                var10 = var3.field4674;
                            }
                            class509.method3042((long) arg2.field3289, var7[var8], 6, "<col=ffff00>" + var4, 0, var7[var8].equalsIgnoreCase(class257.field3829.method3116(class149.field1979, (byte) 104)) ? var3.field4661 : var10, false, 0, var9, true, -1);
                            class446.field6230++;
                        }
                    }
                }
                if (var3.field4686 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class257.field3829.method3116(class149.field1979, (byte) 102))) {
                            short var12 = 0;
                            if (var3.field4664 > class246.field3587.field268) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 30;
                            }
                            if (var11 == 1) {
                                var13 = 16;
                            }
                            if (var11 == 2) {
                                var13 = 48;
                            }
                            if (var11 == 3) {
                                var13 = 3;
                            }
                            if (var11 == 4) {
                                var13 = 22;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class141.field1847++;
                            class509.method3042((long) arg2.field3289, var7[var11], 6, "<col=ffff00>" + var4, 0, var3.field4661, false, 0, var13, true, -1);
                        }
                    }
                }
            }
            class509.method3042((long) arg2.field3289, class75.field980.method3116(class149.field1979, (byte) 106), 6, "<col=ffff00>" + var4, 0, class318.field4601, arg1, 0, 1009, true, -1);
            class291.field4252++;
        } else if (!arg1) {
            class412 var6 = class319.field4621 == -1 ? null : class454.field6365.method1995(12, class319.field4621);
            if ((class180.field2579 & 0x2) != 0) {
                if (var6 == null || var3.method1946(class319.field4621, -28819, var6.field5823) != var6.field5823) {
                    class509.method3042((long) arg2.field3289, class380.field5366, 6, class431.field6089 + " -> <col=ffff00>" + var4, 0, class474.field6601, false, 0, 46, true, -1);
                    class174.field2509++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
    public abstract boolean method53(byte arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
    public abstract void method48(boolean arg0);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
    public abstract void method52(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
    public abstract void method47(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
    public abstract void method55(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsv;IB)V")
    public abstract void method51(class478 arg0, int arg1, byte arg2);
}
