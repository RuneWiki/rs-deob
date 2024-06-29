import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class39 {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lcj;")
    public class69 field681 = new class69();

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "Lha;")
    public static class46 field686 = class271.method1828("<col=ffffff>", -46);

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field688 = -1;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "[[I")
    public static int[][] field692 = new int[5][5000];

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lcj;")
    private class69 field685;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Lcj;")
    public final class69 method260(byte arg0) {
        field690++;
        class69 var2 = this.field681.field1200;
        if (arg0 != 57) {
            this.method262((byte) 30);
        }
        if (this.field681 == var2) {
            return null;
        } else {
            var2.method501(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static final void method261(int arg0) {
        class231.field4012.method84(-32377);
        field691++;
        class89.field1692.method84(-32377);
        class2.field19.method84(-32377);
        if (arg0 > -10) {
            field688 = -2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Lcj;")
    public final class69 method262(byte arg0) {
        if (arg0 < 117) {
            return null;
        }
        class69 var2 = this.field681.field1197;
        field693++;
        if (this.field681 == var2) {
            this.field685 = null;
            return null;
        } else {
            this.field685 = var2.field1197;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 > -90) {
            field686 = null;
        }
        field686 = null;
        field692 = null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)Lcj;")
    public final class69 method264(int arg0) {
        field682++;
        if (arg0 >= -29) {
            method261(-10);
        }
        class69 var2 = this.field681.field1200;
        if (this.field681 == var2) {
            this.field685 = null;
            return null;
        } else {
            this.field685 = var2.field1200;
            return var2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lcj;I)V")
    public final void method265(class69 arg0, int arg1) {
        field694++;
        if (arg0.field1197 != null) {
            arg0.method501(arg1 + 501);
        }
        arg0.field1197 = this.field681.field1197;
        arg0.field1200 = this.field681;
        if (arg1 != -501) {
            this.method264(-61);
        }
        arg0.field1197.field1200 = arg0;
        arg0.field1200.field1197 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class39() {
        this.field681.field1200 = this.field681;
        this.field681.field1197 = this.field681;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public final void method266(int arg0) {
        while (true) {
            class69 var2 = this.field681.field1200;
            if (this.field681 == var2) {
                if (arg0 != 5) {
                    return;
                }
                field683++;
                this.field685 = null;
                return;
            }
            var2.method501(0);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(SLha;ILha;IJI)V")
    public static final void method267(short arg0, class46 arg1, int arg2, class46 arg3, int arg4, long arg5, int arg6) {
        field680++;
        if (class222.field3910) {
            return;
        }
        if (arg6 != -1) {
            method261(-65);
        }
        if (class242.field4290 >= 500) {
            return;
        }
        class275.field4795[class242.field4290] = arg1;
        class162.field2855[class242.field4290] = arg3;
        class215.field3807[class242.field4290] = arg0;
        class31.field590[class242.field4290] = arg5;
        class270.field4706[class242.field4290] = arg4;
        class4.field69[class242.field4290] = arg2;
        class242.field4290++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLcj;)V")
    public final void method268(byte arg0, class69 arg1) {
        if (arg1.field1197 != null) {
            arg1.method501(0);
        }
        field679++;
        arg1.field1197 = this.field681;
        arg1.field1200 = this.field681.field1200;
        if (arg0 != -68) {
            this.field681 = null;
        }
        arg1.field1197.field1200 = arg1;
        arg1.field1200.field1197 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)Lcj;")
    public final class69 method269(byte arg0) {
        class69 var2 = this.field685;
        field689++;
        if (this.field681 == var2) {
            this.field685 = null;
            return null;
        }
        this.field685 = var2.field1200;
        if (arg0 != 7) {
            field688 = -66;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Lcj;")
    public final class69 method270(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field687++;
        class69 var2 = this.field685;
        if (this.field681 == var2) {
            this.field685 = null;
            return null;
        } else {
            this.field685 = var2.field1197;
            return var2;
        }
    }
}
