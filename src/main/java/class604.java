import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public abstract class class604 extends class189 {

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Leea;")
    public class131 field8483;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field8488;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ou", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field8489;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Z")
    public boolean field8487;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "[[B")
    public static byte[][] field8481;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3395(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)Z", line = 7)
    public final boolean method3390(int arg0) {
        if (arg0 != 2) {
            this.field8483 = null;
        }
        field8484++;
        return false;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)Z", line = 21)
    public final boolean method3391(int arg0) {
        field8482++;
        return arg0 == -3 ? this.field8487 : true;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)I", line = 35)
    public final int method3392(int arg0) {
        if (arg0 != -4867) {
            this.method3390(-63);
        }
        field8488++;
        return 1;
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(B)I", line = 49)
    public int method813(byte arg0) {
        if (arg0 == 48) {
            field8486++;
            return 0;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "(I)V", line = 61)
    public static void method3393(int arg0) {
        field8481 = null;
        int var1 = 22 / ((arg0 + 58) / 53);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIZIIIII)V", line = 73)
    public static final void method3394(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            return;
        }
        field8485++;
        if (arg6 < 0 || arg1 < 0 || (class336.field4683 - 1) <= arg6 || arg1 >= class700.field9768 - 1) {
            return;
        }
        if (class553.field7776 == null) {
            return;
        }
        if (arg0 == 0) {
            class706 var8 = (class706) class252.method1672(arg5, arg6, arg1);
            class706 var9 = (class706) class445.method2671(arg5, arg6, arg1);
            if (var8 != null && arg3 != 2) {
                if ((var8 instanceof class586)) {
                    ((class586) var8).field8257.method3761(arg7, (byte) 79);
                } else {
                    class280.method1836(arg4, arg6, arg7, arg3, arg1, arg0, var8.method861((byte) -17), 1, arg5);
                }
            }
            if (var9 != null) {
                if (var9 instanceof class586) {
                    ((class586) var9).field8257.method3761(arg7, (byte) -121);
                    return;
                }
                class280.method1836(arg4, arg6, arg7, arg3, arg1, arg0, var9.method861((byte) -17), 1, arg5);
                return;
            }
            return;
        }
        if (arg0 != 1) {
            if (arg0 == 2) {
                class706 var11 = (class706) class243.method1557(arg5, arg6, arg1, field8489 == null ? (field8489 = method3395("ip")) : field8489);
                if (var11 == null) {
                    return;
                }
                if (arg3 == 11) {
                    arg3 = 10;
                }
                if (!(var11 instanceof class746)) {
                    class280.method1836(arg4, arg6, arg7, arg3, arg1, arg0, var11.method861((byte) -17), 1, arg5);
                    return;
                }
                ((class746) var11).field10381.method3761(arg7, (byte) 3);
            } else if (arg0 == 3) {
                class706 var10 = (class706) class434.method2639(arg5, arg6, arg1);
                if (var10 != null) {
                    if (!(var10 instanceof class440)) {
                        class280.method1836(arg4, arg6, arg7, arg3, arg1, arg0, var10.method861((byte) -17), 1, arg5);
                        return;
                    }
                    ((class440) var10).field6256.method3761(arg7, (byte) -114);
                    return;
                }
            }
            return;
        }
        class706 var12 = (class706) class258.method1696(arg5, arg6, arg1);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class129) {
            ((class129) var12).field1561.method3761(arg7, (byte) -126);
            return;
        }
        int var13 = var12.method861((byte) -17);
        if (arg3 != 4 && arg3 != 5) {
            if (arg3 == 6) {
                class280.method1836(arg4 + 4, arg6, arg7, 4, arg1, arg0, var13, 1, arg5);
                return;
            }
            if (arg3 == 7) {
                class280.method1836((arg4 + 2 & 0x3) + 4, arg6, arg7, 4, arg1, arg0, var13, 1, arg5);
            } else if (arg3 == 8) {
                class280.method1836(arg4 + 4, arg6, arg7, 4, arg1, arg0, var13, 1, arg5);
                class280.method1836((arg4 + 2 & 0x3) + 4, arg6, arg7, 4, arg1, arg0, var13, 1, arg5);
                return;
            }
            return;
        }
        class280.method1836(arg4, arg6, arg7, 4, arg1, arg0, var13, 1, arg5);
        return;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Leea;)V", line = 190)
    public class604(class131 arg0) {
        this.field8483 = arg0;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
    public abstract void method816(int arg0, int arg1);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Z")
    public abstract boolean method811(int arg0);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(B)Z")
    public abstract boolean method818(byte arg0);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(III)V")
    public abstract void method817(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
    public abstract void method815(int arg0);

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lmfa;Lmfa;IB)V")
    public abstract void method807(class615 arg0, class615 arg1, int arg2, byte arg3);
}
