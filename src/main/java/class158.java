import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class158 {

    @OriginalMember(owner = "client!hga", name = "l", descriptor = "Liga;")
    public class425 field2700 = new class425();

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "Lsc;")
    public static class320 field2691 = new class320();

    @OriginalMember(owner = "client!hga", name = "k", descriptor = "Lqfa;")
    public static class85 field2699 = new class85(103, -2);

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!hga", name = "m", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!hga", name = "n", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!hga", name = "q", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!hga", name = "p", descriptor = "Liga;")
    private class425 field2704;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "Lqfa;")
    public static class85 field2698;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
    public static void method1220(byte arg0) {
        field2691 = null;
        field2698 = null;
        field2699 = null;
        int var1 = -27 / ((20 - arg0) / 47);
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(B)Liga;")
    public final class425 method1221(byte arg0) {
        field2696++;
        class425 var2 = this.field2700.field6139;
        if (this.field2700 == var2) {
            this.field2704 = null;
            return null;
        }
        this.field2704 = var2.field6139;
        if (arg0 > -20) {
            this.method1224(-42);
        }
        return var2;
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(B)V")
    public final void method1222(byte arg0) {
        while (true) {
            class425 var2 = this.field2700.field6134;
            if (this.field2700 == var2) {
                field2692++;
                this.field2704 = null;
                if (arg0 >= -79) {
                    field2699 = null;
                    return;
                }
                return;
            }
            var2.method2588(300);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)Z")
    public final boolean method1223(int arg0) {
        field2690++;
        if (arg0 == -2) {
            return this.field2700.field6134 == this.field2700;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)Liga;")
    public final class425 method1224(int arg0) {
        if (arg0 != -2) {
            return null;
        }
        field2694++;
        class425 var2 = this.field2700.field6134;
        if (this.field2700 == var2) {
            this.field2704 = null;
            return null;
        } else {
            this.field2704 = var2.field6134;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)I")
    public final int method1225(int arg0) {
        field2703++;
        int var2 = 0;
        for (class425 var3 = this.field2700.field6134; var3 != this.field2700; var3 = var3.field6134) {
            var2++;
        }
        return arg0 == -2 ? var2 : -104;
    }

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "(I)Liga;")
    public final class425 method1226(int arg0) {
        field2689++;
        class425 var2 = this.field2700.field6134;
        if (this.field2700 == var2) {
            return null;
        }
        if (arg0 != 0) {
            field2699 = null;
        }
        var2.method2588(300);
        return var2;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lhga;Liga;B)V")
    private final void method1227(class158 arg0, class425 arg1, byte arg2) {
        field2693++;
        class425 var4 = this.field2700.field6139;
        this.field2700.field6139 = arg1.field6139;
        if (arg2 <= 68) {
            return;
        }
        arg1.field6139.field6134 = this.field2700;
        if (this.field2700 != arg1) {
            arg1.field6139 = arg0.field2700.field6139;
            arg1.field6139.field6134 = arg1;
            arg0.field2700.field6139 = var4;
            var4.field6134 = arg0.field2700;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Liga;B)V")
    public final void method1228(class425 arg0, byte arg1) {
        field2702++;
        if (arg0.field6139 != null) {
            arg0.method2588(300);
        }
        arg0.field6134 = this.field2700.field6134;
        if (arg1 != 59) {
            field2691 = null;
        }
        arg0.field6139 = this.field2700;
        arg0.field6139.field6134 = arg0;
        arg0.field6134.field6139 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(Liga;B)V")
    public final void method1229(class425 arg0, byte arg1) {
        if (arg0.field6139 != null) {
            arg0.method2588(arg1 + 180);
        }
        field2701++;
        arg0.field6139 = this.field2700.field6139;
        arg0.field6134 = this.field2700;
        if (arg1 != 120) {
            this.method1232(-95);
        }
        arg0.field6139.field6134 = arg0;
        arg0.field6134.field6139 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lhga;Z)V")
    public final void method1230(class158 arg0, boolean arg1) {
        if (!arg1) {
            this.method1227(arg0, this.field2700.field6134, (byte) 121);
            field2697++;
        }
    }

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "(I)Liga;")
    public final class425 method1231(int arg0) {
        field2705++;
        if (arg0 != 103) {
            this.field2700 = null;
        }
        class425 var2 = this.field2704;
        if (this.field2700 == var2) {
            this.field2704 = null;
            return null;
        } else {
            this.field2704 = var2.field6139;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "(I)Liga;")
    public final class425 method1232(int arg0) {
        field2695++;
        class425 var2 = this.field2704;
        if (this.field2700 == var2) {
            this.field2704 = null;
            return null;
        } else {
            this.field2704 = var2.field6134;
            return arg0 == -2 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "<init>", descriptor = "()V")
    public class158() {
        this.field2700.field6134 = this.field2700;
        this.field2700.field6139 = this.field2700;
    }
}
