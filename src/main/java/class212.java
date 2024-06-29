import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class212 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[Lfa;")
    public static class396[] field2718 = new class396[30];

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lad;")
    public static class11 field2721 = new class11(10);

    @OriginalMember(owner = "client!co", name = "e", descriptor = "Ltu;")
    public static class7 field2722;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lhb;")
    public static class250 field2723;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Lqg;")
    public static class159 field2724;

    static {
        new class169("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field2722 = new class7();
        field2723 = new class250(39, 3);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)Z", line = 4)
    public static final boolean method1356(int arg0, int arg1, int arg2, int arg3) {
        if (!class60.method340(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class169.field2206;
        int var5 = arg2 << class169.field2206;
        int var6 = class92.field1285[arg0].method1187(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class169.field2206 - 7);
        int var8 = var6 - (0xE6 << class169.field2206 - 7);
        int var9 = var6 - (0xEE << class169.field2206 - 7);
        if (arg3 == 1) {
            if (var4 > class273.field3472) {
                if (!class300.method1801(var4, var6, var5)) {
                    return false;
                }
                if (!class300.method1801(var4, var6, class477.field6971 + var5)) {
                    return false;
                }
                if (!class300.method1801(var4, var6, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class300.method1801(var4, var7, var5)) {
                    return false;
                }
                if (!class300.method1801(var4, var7, class477.field6971 + var5)) {
                    return false;
                }
                if (!class300.method1801(var4, var7, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (!class300.method1801(var4, var8, var5)) {
                return false;
            } else if (class300.method1801(var4, var8, class477.field6971 + var5)) {
                return class300.method1801(var4, var8, class286.field3658 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class436.field5986) {
                if (!class300.method1801(var4, var6, class286.field3658 + var5)) {
                    return false;
                }
                if (!class300.method1801(class477.field6971 + var4, var6, class286.field3658 + var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var6, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class300.method1801(var4, var7, class286.field3658 + var5)) {
                    return false;
                }
                if (!class300.method1801(class477.field6971 + var4, var7, class286.field3658 + var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var7, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (!class300.method1801(var4, var8, class286.field3658 + var5)) {
                return false;
            } else if (class300.method1801(class477.field6971 + var4, var8, class286.field3658 + var5)) {
                return class300.method1801(class286.field3658 + var4, var8, class286.field3658 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class273.field3472) {
                if (!class300.method1801(class286.field3658 + var4, var6, var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var6, class477.field6971 + var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var6, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class300.method1801(class286.field3658 + var4, var7, var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var7, class477.field6971 + var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var7, class286.field3658 + var5)) {
                    return false;
                }
            }
            if (!class300.method1801(class286.field3658 + var4, var8, var5)) {
                return false;
            } else if (class300.method1801(class286.field3658 + var4, var8, class477.field6971 + var5)) {
                return class300.method1801(class286.field3658 + var4, var8, class286.field3658 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class436.field5986) {
                if (!class300.method1801(var4, var6, var5)) {
                    return false;
                }
                if (!class300.method1801(class477.field6971 + var4, var6, var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class300.method1801(var4, var7, var5)) {
                    return false;
                }
                if (!class300.method1801(class477.field6971 + var4, var7, var5)) {
                    return false;
                }
                if (!class300.method1801(class286.field3658 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class300.method1801(var4, var8, var5)) {
                return false;
            } else if (class300.method1801(class477.field6971 + var4, var8, var5)) {
                return class300.method1801(class286.field3658 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class300.method1801(class477.field6971 + var4, var9, class477.field6971 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class300.method1801(var4, var8, class286.field3658 + var5);
        } else if (arg3 == 32) {
            return class300.method1801(class286.field3658 + var4, var8, class286.field3658 + var5);
        } else if (arg3 == 64) {
            return class300.method1801(class286.field3658 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class300.method1801(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ZIZ)V", line = 221)
    public static final void method1357(boolean arg0, int arg1, boolean arg2) {
        field2720++;
        if (arg1 != -11116) {
            method1359(7);
        }
        if (arg2) {
            class428.field5866++;
            class39.method249(arg1 ^ 0xFFFFABBF);
        }
        if (arg0) {
            class478.field6976++;
            class25.method171(21991);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 247)
    public static final boolean method1358(String arg0, int arg1) {
        field2719++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class364.field4692; var2++) {
            if (arg0.equalsIgnoreCase(class231.field2996[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class37.field573.field7630);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 275)
    public static void method1359(int arg0) {
        field2724 = null;
        field2723 = null;
        field2722 = null;
        field2718 = null;
        if (arg0 == -24409) {
            field2721 = null;
        }
    }
}
