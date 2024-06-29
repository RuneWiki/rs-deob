import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class202 {

    @OriginalMember(owner = "client!td", name = "e", descriptor = "Lue;")
    private class213 field3693 = new class213();

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Lvd;")
    public static class222 field3694 = class212.method1357("Verbinde mit Server)3)3)3", 10731);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lvd;")
    private static class222 field3689 = class212.method1357("No response from server)3", 10731);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3690 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Lvd;")
    public static class222 field3701 = class212.method1357("Die Adresse dieses Computers wurde gesperrt)1", 10731);

    @OriginalMember(owner = "client!td", name = "h", descriptor = "[Lse;")
    public static class193[] field3696 = new class193[32768];

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Lvd;")
    public static class222 field3704 = field3689;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "B")
    public static byte field3692;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lab;")
    public static class3 field3700;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZI)V")
    public static final void method1286(boolean arg0, int arg1) {
        class11 var2 = class176.field3301;
        synchronized (class176.field3301) {
            class186.field3433 = arg1;
        }
        if (!arg0) {
            field3698++;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLue;)V")
    public final void method1287(boolean arg0, class213 arg1) {
        field3697++;
        if (arg1.field3958 != null) {
            arg1.method1362(-2);
        }
        arg1.field3949 = this.field3693;
        if (arg0) {
            this.method1290(-127, null);
        }
        arg1.field3958 = this.field3693.field3958;
        arg1.field3958.field3949 = arg1;
        arg1.field3949.field3958 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(ZI)Lhf;")
    public static final class82 method1288(boolean arg0, int arg1) {
        field3705++;
        class82 var2 = (class82) class234.field4369.method601((long) arg1, 50);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1511.method33(-29616, 1, arg1);
        class82 var4 = new class82();
        if (var3 != null) {
            var4.method536(-3, new class109(var3), arg1);
        }
        class234.field4369.method593((long) arg1, var4, (byte) -12);
        if (arg0) {
            field3694 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lue;")
    public final class213 method1289(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field3699++;
        class213 var2 = this.field3693.field3949;
        if (this.field3693 == var2) {
            return null;
        } else {
            var2.method1362(-2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class202() {
        this.field3693.field3958 = this.field3693;
        this.field3693.field3949 = this.field3693;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILue;)V")
    public final void method1290(int arg0, class213 arg1) {
        if (arg0 != 1) {
            return;
        }
        field3691++;
        if (arg1.field3958 != null) {
            arg1.method1362(arg0 - 3);
        }
        arg1.field3949 = this.field3693.field3949;
        arg1.field3958 = this.field3693;
        arg1.field3958.field3949 = arg1;
        arg1.field3949.field3958 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Lue;")
    public final class213 method1291(int arg0) {
        field3695++;
        class213 var2 = this.field3693.field3949;
        if (this.field3693 == var2) {
            return null;
        } else {
            if (arg0 != 470) {
                method1288(false, 33);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1292(byte arg0) {
        field3704 = null;
        field3689 = null;
        field3700 = null;
        field3701 = null;
        field3696 = null;
        int var1 = 94 % ((arg0 - 74) / 39);
        field3694 = null;
    }
}
