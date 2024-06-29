import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class227 {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lgd;")
    private class112 field3610 = new class112();

    @OriginalMember(owner = "client!f", name = "i", descriptor = "Ltj;")
    private class10 field3611 = new class10();

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    private int field3614;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private int field3616;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Lmj;")
    private class144 field3615;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "Z")
    public static boolean field3603 = false;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field3613 = 50;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field3612 = 0;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLgd;J)V")
    public final void method1514(boolean arg0, class112 arg1, long arg2) {
        field3605++;
        if (arg0) {
            return;
        }
        if (this.field3616 == 0) {
            class112 var5 = this.field3611.method67(10136);
            var5.method1074((byte) 15);
            var5.method827((byte) -98);
            if (this.field3610 == var5) {
                class112 var6 = this.field3611.method67(10136);
                var6.method1074((byte) 91);
                var6.method827((byte) -98);
            }
        } else {
            this.field3616--;
        }
        this.field3615.method1064(arg1, arg2, (byte) -128);
        this.field3611.method70(3, arg1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Lhb;")
    public final class146 method1515(int arg0) {
        field3607++;
        if (arg0 != 0) {
            this.method1515(43);
        }
        return this.field3615.method1062(-89);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method1516(int arg0) {
        if (arg0 > -100) {
            field3603 = true;
        }
        field3606++;
        class248.field3962.method1156(-101);
        class44.field805.method1156(-86);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lhb;")
    public final class146 method1517(int arg0) {
        field3604++;
        if (arg0 != -51) {
            this.method1514(true, (class112) null, 21L);
        }
        return this.field3615.method1059(-14608);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(JI)Lgd;")
    public final class112 method1518(long arg0, int arg1) {
        field3608++;
        class112 var4 = (class112) this.field3615.method1063((byte) -77, arg0);
        int var5 = 95 % ((arg1 - 32) / 59);
        if (var4 != null) {
            this.field3611.method70(3, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public final void method1519(boolean arg0) {
        this.field3611.method58((byte) -106);
        if (!arg0) {
            this.method1515(54);
        }
        field3609++;
        this.field3615.method1060(-107);
        this.field3610 = new class112();
        this.field3616 = this.field3614;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
    public class227(int arg0) {
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field3614 = arg0;
        this.field3616 = arg0;
        this.field3615 = new class144(var2);
    }
}
