import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class85 extends class372 implements class41 {

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Le;")
    public class372 field1060;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Ldq;")
    public static class493 field1068;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "[I")
    public static int[] field1069;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Z")
    public static boolean field1070;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Z")
    public static boolean field1074;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
    public static final void method684(int arg0) {
        class513.field7443.method1204(true);
        field1057++;
        int var1 = class513.field7443.method1199(30304, 8);
        if (var1 < class489.field7114) {
            for (int var2 = var1; var2 < class489.field7114; var2++) {
                class426.field6044[class534.field7851++] = class403.field5735[var2];
            }
        }
        if (class489.field7114 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class489.field7114 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class403.field5735[var3];
            class295 var5 = class187.field2446[var4];
            int var6 = class513.field7443.method1199(30304, 1);
            if (var6 == 0) {
                class403.field5735[class489.field7114++] = var4;
                var5.field4848 = class163.field2065;
            } else {
                int var7 = class513.field7443.method1199(30304, 2);
                if (var7 == 0) {
                    class403.field5735[class489.field7114++] = var4;
                    var5.field4848 = class163.field2065;
                    class2.field11[class284.field3612++] = var4;
                } else if (var7 == 1) {
                    class403.field5735[class489.field7114++] = var4;
                    var5.field4848 = class163.field2065;
                    int var8 = class513.field7443.method1199(30304, 3);
                    var5.method1732(var8, 0, 1);
                    int var9 = class513.field7443.method1199(30304, 1);
                    if (var9 == 1) {
                        class2.field11[class284.field3612++] = var4;
                    }
                } else if (var7 == 2) {
                    class403.field5735[class489.field7114++] = var4;
                    var5.field4848 = class163.field2065;
                    if (class513.field7443.method1199(30304, 1) == 1) {
                        int var10 = class513.field7443.method1199(30304, 3);
                        var5.method1732(var10, 0, 2);
                        int var11 = class513.field7443.method1199(30304, 3);
                        var5.method1732(var11, 0, 2);
                    } else {
                        int var12 = class513.field7443.method1199(30304, 3);
                        var5.method1732(var12, 0, 0);
                    }
                    int var13 = class513.field7443.method1199(30304, 1);
                    if (var13 == 1) {
                        class2.field11[class284.field3612++] = var4;
                    }
                } else if (var7 == 3) {
                    class426.field6044[class534.field7851++] = var4;
                }
            }
        }
        if (arg0 >= -65) {
            method685(-117);
        }
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
    public static void method685(int arg0) {
        field1068 = null;
        field1069 = null;
        if (arg0 != -15137) {
            field1074 = false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        if (arg0 != -2286) {
            field1068 = null;
        }
        field1058++;
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILya;)V")
    public final void method184(int arg0, class38 arg1) {
        field1065++;
        if (arg0 != -5534) {
            method685(-22);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        if (!arg0) {
            field1068 = null;
        }
        field1073++;
        return 0;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        field1064++;
        if (!arg0) {
            field1068 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ[B)V")
    public static final void method686(byte arg0, boolean arg1, byte[] arg2) {
        field1076++;
        if (class457.field6575 == null) {
            class457.field6575 = new class463(20000);
        }
        class457.field6575.method2782(arg2.length, arg2, false, 0);
        if (arg1) {
            class163.method1045(class457.field6575.field6618, (byte) -4);
            class62.field808 = new class254[class289.field3685];
            int var3 = 0;
            for (int var4 = class357.field4597; var4 <= class64.field832; var4++) {
                class254 var5 = class534.method3161(var4, 16);
                if (var5 != null) {
                    class62.field808[var3++] = var5;
                }
            }
            class422.field5983 = false;
            class133.field1733 = class504.method3034((byte) -122);
            class457.field6575 = null;
        }
        if (arg0 >= -125) {
            method686((byte) -11, false, null);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (arg0 == 21067) {
            field1059++;
            return 0;
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILya;)Lt;")
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        if (arg1 <= 72) {
            return null;
        } else {
            field1066++;
            return null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIILe;)V")
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, class372 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class492.method2985(false, arg0, arg1));
        this.field1060 = arg5;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        if (arg0 == 32725) {
            field1063++;
            return 0;
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public static final void method687(byte arg0) {
        if (arg0 >= -12) {
            return;
        }
        class436.field6234 = 0;
        field1061++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class424.field5991[var1] = null;
            class191.field2482[var1] = 1;
            class434.field6167[var1] = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        field1067++;
        if (arg0 != 27223) {
            this.field1060 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        field1071++;
        if (arg0 < 66) {
            field1069 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)I")
    public final int method516(boolean arg0) {
        if (arg0) {
            field1072++;
            return 0;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        field1075++;
        if (arg1 != 1) {
            method687((byte) -3);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(ILya;)V")
    public final void method185(int arg0, class38 arg1) {
        if (arg0 != 15397) {
            this.method179(105, -31, null);
        }
        field1062++;
    }

    static {
        new class335("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field1068 = null;
        field1069 = new int[4096];
        field1070 = false;
        field1074 = false;
    }
}
