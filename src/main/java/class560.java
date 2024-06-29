import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class560 {

    @OriginalMember(owner = "client!bka", name = "d", descriptor = "Lbt;")
    private class519 field7883 = new class519();

    @OriginalMember(owner = "client!bka", name = "f", descriptor = "Ljava/lang/String;")
    public String field7885;

    @OriginalMember(owner = "client!bka", name = "i", descriptor = "I")
    public static int field7888 = 500;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "I")
    public static int field7881;

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!bka", name = "e", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!bka", name = "g", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!bka", name = "h", descriptor = "I")
    private volatile int field7887;

    @OriginalMember(owner = "client!bka", name = "j", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!bka", name = "k", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!bka", name = "l", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!bka", name = "m", descriptor = "I")
    public static int field7892;

    @OriginalMember(owner = "client!bka", name = "n", descriptor = "I")
    public static int field7893;

    @OriginalMember(owner = "client!bka", name = "o", descriptor = "Lsw;")
    private class437 field7894;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ZLsw;)V", line = 3)
    public final void method3300(boolean arg0, class437 arg1) {
        field7893++;
        this.field7894 = arg1;
        if (!arg0) {
            this.method3302(-116, null);
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(BLoq;)V", line = 19)
    public final void method3301(byte arg0, class230 arg1) {
        arg1.field3459 = true;
        field7884++;
        class519 var3 = this.field7883;
        synchronized (this.field7883) {
            this.field7883.method3100(arg1, true);
            this.field7887++;
        }
        if (this.field7894 != null) {
            class437 var4 = this.field7894;
            synchronized (this.field7894) {
                this.field7894.notify();
            }
        }
        if (arg0 != 108) {
            this.method3306(null, -21);
        }
    }

    @OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 244)
    public class560(String arg0) {
        this.field7885 = arg0;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(ILoq;)V", line = 47)
    public final void method3302(int arg0, class230 arg1) {
        arg1.field3459 = false;
        field7891++;
        class519 var3 = this.field7883;
        synchronized (this.field7883) {
            this.field7883.method3100(arg1, true);
            this.field7887++;
        }
        if (arg0 != 29319) {
            this.field7894 = null;
        }
        if (this.field7894 != null) {
            class437 var4 = this.field7894;
            synchronized (this.field7894) {
                this.field7894.notify();
            }
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(IILnd;ZLnd;)I", line = 69)
    public static final int method3303(int arg0, int arg1, class138 arg2, boolean arg3, class138 arg4) {
        field7886++;
        if (arg0 == 1) {
            int var5 = arg2.field2280;
            int var6 = arg4.field2280;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg0 == 2) {
            return class368.method2295(115, class553.field7667, arg4.method925(105).field5756, arg2.method925(-63).field5756);
        } else if (arg0 == 3) {
            if (arg2.field1765.equals("-")) {
                if (arg4.field1765.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field1765.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class368.method2295(109, class553.field7667, arg4.field1765, arg2.field1765);
            }
        } else if (arg0 != 4) {
            if (arg1 != 25430) {
                field7888 = 84;
            }
            if (arg0 == 5) {
                if (arg2.method1150(arg1 ^ 0xFFFF9CA9)) {
                    return arg4.method1150(-1) ? 0 : 1;
                } else if (arg4.method1150(arg1 - 25431)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 6) {
                if (arg2.method1145((byte) 124)) {
                    return arg4.method1145((byte) 126) ? 0 : 1;
                } else if (arg4.method1145((byte) 125)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 7) {
                if (arg2.method1148(-8909)) {
                    return arg4.method1148(-8909) ? 0 : 1;
                } else if (arg4.method1148(-8909)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg0 == 8) {
                int var7 = arg2.field1763;
                int var8 = arg4.field1763;
                if (arg3) {
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
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
                return arg2.field1767 - arg4.field1767;
            }
        } else if (arg2.method1146(true)) {
            return arg4.method1146(true) ? 0 : 1;
        } else if (arg4.method1146(true)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)Z", line = 169)
    public final boolean method3304(byte arg0) {
        if (arg0 > -126) {
            this.field7883 = null;
        }
        field7890++;
        return this.field7887 == 0;
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)Lri;", line = 185)
    public final class461 method3305(int arg0) {
        field7880++;
        Object var2 = null;
        class519 var3 = this.field7883;
        synchronized (this.field7883) {
            class461 var4 = this.field7883.method3103((byte) 72);
            if (arg0 <= 28) {
                this.field7883 = null;
            }
            var4.method2773(62);
            this.field7887--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lth;I)V", line = 206)
    public final void method3306(class129 arg0, int arg1) {
        class519 var3 = this.field7883;
        synchronized (this.field7883) {
            int var4 = -63 % ((48 - arg1) / 38);
            this.field7883.method3100(arg0, true);
            this.field7887++;
        }
        field7881++;
        if (this.field7894 != null) {
            class437 var5 = this.field7894;
            synchronized (this.field7894) {
                this.field7894.notify();
            }
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(B[Ljava/awt/Rectangle;I)V", line = 227)
    public static final void method3307(byte arg0, Rectangle[] arg1, int arg2) throws class357 {
        if (class166.field2118 == 1) {
            class377.field5424.method254(arg1, arg2, class517.field7135, class783.field10753);
        } else {
            class377.field5424.method254(arg1, arg2, 0, 0);
        }
        field7892++;
        if (arg0 >= -35) {
            field7888 = 20;
        }
    }
}
