import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class266 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "Llq;")
    public class577 field3876 = new class577();

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public static int field3873 = 0;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lat;")
    public static class397 field3875 = new class397(true);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Llq;")
    private class577 field3887;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "[Lru;")
    public static class204[] field3888;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Llq;", line = 4)
    public final class577 method1724(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field3884++;
        class577 var2 = this.field3887;
        if (this.field3876 == var2) {
            this.field3887 = null;
            return null;
        } else {
            this.field3887 = var2.field8131;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lfha;", line = 25)
    public static final class399 method1725(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        return var3 == null || var3.field587 == null ? null : var3.field587;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Llq;ILok;)V", line = 32)
    private final void method1726(class577 arg0, int arg1, class266 arg2) {
        if (arg1 != 6608) {
            this.method1732(false);
        }
        field3880++;
        class577 var4 = this.field3876.field8128;
        this.field3876.field8128 = arg0.field8128;
        arg0.field8128.field8131 = this.field3876;
        if (this.field3876 != arg0) {
            arg0.field8128 = arg2.field3876.field8128;
            arg0.field8128.field8131 = arg0;
            var4.field8131 = arg2.field3876;
            arg2.field3876.field8128 = var4;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Llq;B)V", line = 58)
    public final void method1727(class577 arg0, byte arg1) {
        if (arg0.field8128 != null) {
            arg0.method3387((byte) -45);
        }
        field3874++;
        arg0.field8128 = this.field3876.field8128;
        arg0.field8131 = this.field3876;
        if (arg1 <= 58) {
            this.field3887 = null;
        }
        arg0.field8128.field8131 = arg0;
        arg0.field8131.field8128 = arg0;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILlq;)V", line = 87)
    public final void method1728(int arg0, class577 arg1) {
        field3872++;
        if (arg1.field8128 != null) {
            arg1.method3387((byte) 118);
        }
        arg1.field8131 = this.field3876.field8131;
        arg1.field8128 = this.field3876;
        arg1.field8128.field8131 = arg1;
        arg1.field8131.field8128 = arg1;
        if (arg0 >= -106) {
            this.method1732(false);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V", line = 104)
    public final void method1729(byte arg0) {
        int var2 = -91 % ((arg0 + 33) / 46);
        while (true) {
            class577 var3 = this.field3876.field8131;
            if (this.field3876 == var3) {
                field3881++;
                this.field3887 = null;
                return;
            }
            var3.method3387((byte) 107);
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 284)
    public class266() {
        this.field3876.field8128 = this.field3876;
        this.field3876.field8131 = this.field3876;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lok;B)V", line = 133)
    public final void method1730(class266 arg0, byte arg1) {
        field3877++;
        this.method1726(this.field3876.field8131, 6608, arg0);
        int var3 = 74 / ((arg1 - 32) / 59);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Llq;", line = 147)
    public final class577 method1731(byte arg0) {
        field3885++;
        class577 var2 = this.field3876.field8131;
        if (this.field3876 == var2) {
            this.field3887 = null;
            return null;
        }
        this.field3887 = var2.field8131;
        if (arg0 >= -104) {
            field3873 = -36;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Llq;", line = 168)
    public final class577 method1732(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3886++;
        class577 var2 = this.field3887;
        if (this.field3876 == var2) {
            this.field3887 = null;
            return null;
        } else {
            this.field3887 = var2.field8128;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Llq;", line = 190)
    public final class577 method1733(byte arg0) {
        field3878++;
        class577 var2 = this.field3876.field8128;
        if (this.field3876 == var2) {
            this.field3887 = null;
            return null;
        }
        this.field3887 = var2.field8128;
        if (arg0 != 87) {
            this.field3876 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(Z)V", line = 212)
    public static void method1734(boolean arg0) {
        if (arg0) {
            method1734(false);
        }
        field3875 = null;
        field3888 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I", line = 233)
    public final int method1735(int arg0) {
        field3879++;
        if (arg0 > -115) {
            this.field3876 = null;
        }
        int var2 = 0;
        class577 var3 = this.field3876.field8131;
        while (this.field3876 != var3) {
            var3 = var3.field8131;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Llq;", line = 254)
    public final class577 method1736(int arg0) {
        field3882++;
        class577 var2 = this.field3876.field8131;
        if (this.field3876 == var2) {
            return null;
        } else {
            var2.method3387((byte) -64);
            return arg0 == 0 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Z", line = 274)
    public final boolean method1737(int arg0) {
        if (arg0 != -17429) {
            field3875 = null;
        }
        field3883++;
        return this.field3876.field8131 == this.field3876;
    }
}
