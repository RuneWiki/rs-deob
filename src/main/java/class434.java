import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class434 {

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Lbd;")
    private class334 field6548 = new class334();

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lcg;")
    public static class10 field6544 = new class10(6, 0, 4, 2);

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lbi;")
    public static class104 field6550 = new class104(101, 12);

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6551 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Lof;")
    public static class328 field6553 = new class328(4);

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lss;")
    public static class213 field6554 = new class213("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Lbi;")
    public static class104 field6555 = new class104(71, 0);

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field6556 = 0;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field6545;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field6546;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field6547;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field6549;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lbd;")
    private class334 field6552;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)Z")
    public static final boolean method2728(int arg0, int arg1, int arg2) {
        if (arg2 <= 35) {
            field6553 = null;
        }
        field6541++;
        return (arg0 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lbd;")
    public final class334 method2729(int arg0) {
        field6549++;
        if (arg0 <= 57) {
            field6554 = null;
        }
        class334 var2 = this.field6552;
        if (this.field6548 == var2) {
            this.field6552 = null;
            return null;
        } else {
            this.field6552 = var2.field5224;
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public final void method2730(int arg0) {
        while (true) {
            class334 var2 = this.field6548.field5224;
            if (this.field6548 == var2) {
                if (arg0 != 0) {
                    this.method2730(-47);
                }
                field6546++;
                this.field6552 = null;
                return;
            }
            var2.method2219(0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lbd;B)V")
    public final void method2731(class334 arg0, byte arg1) {
        field6542++;
        if (arg1 != 49) {
            field6550 = null;
        }
        if (arg0.field5228 != null) {
            arg0.method2219(0);
        }
        arg0.field5228 = this.field6548.field5228;
        arg0.field5224 = this.field6548;
        arg0.field5228.field5224 = arg0;
        arg0.field5224.field5228 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Lbd;")
    public final class334 method2732(int arg0) {
        field6545++;
        class334 var2 = this.field6548.field5224;
        if (this.field6548 == var2) {
            this.field6552 = null;
            return null;
        }
        if (arg0 != 34) {
            this.field6548 = null;
        }
        this.field6552 = var2.field5224;
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method2733(boolean arg0) {
        field6550 = null;
        field6554 = null;
        field6544 = null;
        field6553 = null;
        if (!arg0) {
            field6555 = null;
            field6551 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)I")
    public final int method2734(int arg0) {
        field6547++;
        int var2 = 0;
        class334 var3 = this.field6548.field5224;
        if (arg0 != 223) {
            method2728(-44, 33, 6);
        }
        while (this.field6548 != var3) {
            var3 = var3.field5224;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lbd;")
    public final class334 method2735(byte arg0) {
        field6543++;
        if (arg0 != -114) {
            field6556 = 98;
        }
        class334 var2 = this.field6548.field5224;
        if (this.field6548 == var2) {
            return null;
        } else {
            var2.method2219(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
    public class434() {
        this.field6548.field5228 = this.field6548;
        this.field6548.field5224 = this.field6548;
    }
}
