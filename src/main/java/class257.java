import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class257 {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lce;")
    public class207 field4556 = new class207();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4551 = 0;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4558 = 0;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4552 = -1;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljd;")
    public static class86 field4559 = class122.method868("scape main", true);

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "Ljd;")
    public static class86 field4568 = class122.method868("; Expires=", true);

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field4565 = 0;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "Ljd;")
    public static class86 field4567 = class122.method868("Hierhin gehen", true);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "Lce;")
    private class207 field4571;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "[B")
    public static byte[] field4560;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "[[B")
    public static byte[][] field4569;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)Lce;")
    public final class207 method1730(byte arg0) {
        if (arg0 != 94) {
            this.method1739(true);
        }
        field4563++;
        class207 var2 = this.field4556.field3762;
        if (this.field4556 == var2) {
            this.field4571 = null;
            return null;
        } else {
            this.field4571 = var2.field3762;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILce;)V")
    public final void method1731(int arg0, class207 arg1) {
        if (arg1.field3762 != null) {
            arg1.method1477(1);
        }
        int var3 = 103 / ((arg0 - 15) / 36);
        arg1.field3762 = this.field4556.field3762;
        field4554++;
        arg1.field3765 = this.field4556;
        arg1.field3762.field3765 = arg1;
        arg1.field3765.field3762 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
    public static final int method1732(int arg0, int arg1) {
        field4555++;
        if (arg1 >= -57) {
            field4558 = 16;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILbj;II)[Lqc;")
    public static final class62[] method1733(int arg0, class151 arg1, int arg2, int arg3) {
        field4561++;
        if (arg0 != 11280) {
            method1732(31, -14);
        }
        return class163.method1181(arg1, arg3, arg0 ^ 0x4FB, arg2) ? class107.method762(0) : null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lce;")
    public final class207 method1734(int arg0) {
        field4566++;
        class207 var2 = this.field4571;
        if (this.field4556 == var2) {
            this.field4571 = null;
            return null;
        }
        this.field4571 = var2.field3762;
        if (arg0 != -1) {
            this.method1739(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)Lce;")
    public final class207 method1735(byte arg0) {
        field4557++;
        class207 var2 = this.field4556.field3765;
        if (this.field4556 == var2) {
            return null;
        }
        var2.method1477(1);
        if (arg0 != 62) {
            this.method1739(true);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1736(boolean arg0) {
        field4560 = null;
        field4567 = null;
        if (arg0) {
            field4565 = 92;
        }
        field4568 = null;
        field4559 = null;
        field4569 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)Lce;")
    public final class207 method1737(byte arg0) {
        field4570++;
        if (arg0 != 74) {
            return null;
        }
        class207 var2 = this.field4556.field3765;
        if (this.field4556 == var2) {
            this.field4571 = null;
            return null;
        } else {
            this.field4571 = var2.field3765;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lce;B)V")
    public final void method1738(class207 arg0, byte arg1) {
        field4553++;
        if (arg0.field3762 != null) {
            arg0.method1477(1);
        }
        arg0.field3762 = this.field4556;
        if (arg1 <= -55) {
            arg0.field3765 = this.field4556.field3765;
            arg0.field3762.field3765 = arg0;
            arg0.field3765.field3762 = arg0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(Z)V")
    public final void method1739(boolean arg0) {
        while (true) {
            class207 var2 = this.field4556.field3765;
            if (this.field4556 == var2) {
                this.field4571 = null;
                field4564++;
                if (!arg0) {
                    field4551 = 33;
                    return;
                }
                return;
            }
            var2.method1477(1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)Lce;")
    public final class207 method1740(int arg0) {
        class207 var2 = this.field4571;
        if (arg0 != -8843) {
            field4551 = -105;
        }
        field4562++;
        if (this.field4556 == var2) {
            this.field4571 = null;
            return null;
        } else {
            this.field4571 = var2.field3765;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
    public class257() {
        this.field4556.field3762 = this.field4556;
        this.field4556.field3765 = this.field4556;
    }
}
