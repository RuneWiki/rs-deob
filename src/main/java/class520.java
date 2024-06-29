import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class520 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7652 = "";

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7656 = 0;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field7651;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "I")
    public int field7655;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "Ljava/lang/String;")
    public String field7649;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "[[[I")
    public static int[][][] field7650;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static final void method3075(int arg0) {
        class154.field2220.method1096((byte) -128);
        field7653++;
        if (arg0 != 0) {
            field7652 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLtj;IILtj;)I")
    public static final int method3076(boolean arg0, class135 arg1, int arg2, int arg3, class135 arg4) {
        field7657++;
        if (arg3 == 1) {
            int var5 = arg4.field3417;
            int var6 = arg1.field3417;
            if (!arg0) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 == 2) {
            return class48.method280(-16282, class149.field1979, arg1.method854(8).field7649, arg4.method854(arg2 ^ 0xFFFFEAA8).field7649);
        } else if (arg3 == 3) {
            if (arg4.field1765.equals("-")) {
                if (arg1.field1765.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field1765.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class48.method280(-16282, class149.field1979, arg1.field1765, arg4.field1765);
            }
        } else if (arg3 != 4) {
            if (arg2 != -5472) {
                field7652 = null;
            }
            if (arg3 == 5) {
                if (arg4.method1438(false)) {
                    return arg1.method1438(false) ? 0 : 1;
                } else if (arg1.method1438(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 6) {
                if (arg4.method1445(111)) {
                    return arg1.method1445(116) ? 0 : 1;
                } else if (arg1.method1445(96)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 7) {
                if (arg4.method1442(arg2 ^ 0xFFFFEA90)) {
                    return arg1.method1442(99) ? 0 : 1;
                } else if (arg1.method1442(127)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg3 == 8) {
                int var7 = arg4.field1767;
                int var8 = arg1.field1767;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg4.field1770 - arg1.field1770;
            }
        } else if (arg4.method1444((byte) 120)) {
            return arg1.method1444((byte) 124) ? 0 : 1;
        } else if (arg1.method1444((byte) 84)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3077(String arg0, byte arg1) {
        field7658++;
        if (arg0 == null) {
            return false;
        } else if (arg1 == 83) {
            for (int var2 = 0; var2 < field7656; var2++) {
                if (arg0.equalsIgnoreCase(class540.field7902[var2])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class246.field3587.field256);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method3078(String arg0, String arg1, byte arg2) {
        class170.field2476 = -1;
        if (arg2 != 38) {
            field7650 = null;
        }
        class32.field370 = 1;
        field7651++;
        class146.method914(arg0, 0, arg1);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3079(int arg0, int arg1, byte arg2) {
        field7654++;
        if (arg2 <= 104) {
            field7650 = null;
        }
        return (arg1 & 0x70000) != 0 | class476.method2743(arg0, (byte) 90, arg1) || class508.method3031(arg0, arg1, (byte) -2);
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
    public static void method3080(int arg0) {
        field7652 = null;
        if (arg0 == 29422) {
            field7650 = null;
        }
    }

    static {
        new class530("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
