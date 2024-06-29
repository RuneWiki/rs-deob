import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class2 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Ltl;")
    public class259 field22 = new class259();

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
    public static int[] field31 = new int[32];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ltl;")
    private class259 field29;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[Lah;")
    public static class156[] field28;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method5(int arg0) {
        while (true) {
            class259 var2 = this.field22.field4013;
            if (this.field22 == var2) {
                this.field29 = null;
                field24++;
                if (arg0 != 32) {
                    this.method6(43);
                    return;
                }
                return;
            }
            var2.method1781(5250);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Ltl;")
    public final class259 method6(int arg0) {
        class259 var2 = this.field22.field4014;
        if (arg0 != 32) {
            this.method5(89);
        }
        field23++;
        if (this.field22 == var2) {
            this.field29 = null;
            return null;
        } else {
            this.field29 = var2.field4014;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)Ltl;")
    public final class259 method7(byte arg0) {
        field33++;
        class259 var2 = this.field29;
        if (arg0 >= -26) {
            return null;
        } else if (this.field22 == var2) {
            this.field29 = null;
            return null;
        } else {
            this.field29 = var2.field4014;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Ltl;")
    public final class259 method8(int arg0) {
        field32++;
        class259 var2 = this.field22.field4013;
        if (this.field22 == var2) {
            this.field29 = null;
            return null;
        } else if (arg0 > -61) {
            return null;
        } else {
            this.field29 = var2.field4013;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLtl;)V")
    public final void method9(byte arg0, class259 arg1) {
        if (arg1.field4014 != null) {
            arg1.method1781(5250);
        }
        field26++;
        arg1.field4014 = this.field22;
        arg1.field4013 = this.field22.field4013;
        arg1.field4014.field4013 = arg1;
        int var3 = -116 / ((-arg0 - 5) / 61);
        arg1.field4013.field4014 = arg1;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class2() {
        this.field22.field4014 = this.field22;
        this.field22.field4013 = this.field22;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method10(byte arg0) {
        field31 = null;
        field28 = null;
        if (arg0 <= 121) {
            field28 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)Ltl;")
    public final class259 method11(int arg0) {
        int var2 = 113 / ((arg0 + 62) / 60);
        field30++;
        class259 var3 = this.field22.field4013;
        if (this.field22 == var3) {
            return null;
        } else {
            var3.method1781(5250);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)Ltl;")
    public final class259 method12(byte arg0) {
        if (arg0 != 69) {
            this.method6(-104);
        }
        field25++;
        class259 var2 = this.field29;
        if (this.field22 == var2) {
            this.field29 = null;
            return null;
        } else {
            this.field29 = var2.field4013;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILtl;)V")
    public final void method13(int arg0, class259 arg1) {
        field27++;
        if (arg1.field4014 != null) {
            arg1.method1781(arg0 ^ 0x14A2);
        }
        arg1.field4013 = this.field22;
        arg1.field4014 = this.field22.field4014;
        if (arg0 != 32) {
            this.method13(-54, (class259) null);
        }
        arg1.field4014.field4013 = arg1;
        arg1.field4013.field4014 = arg1;
    }
}
