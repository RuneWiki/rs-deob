import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class46 {

    @OriginalMember(owner = "client!wba", name = "h", descriptor = "Lpca;")
    public class665 field716 = new class665();

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lnea;")
    public static class664 field711 = new class664(34, 6);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!wba", name = "g", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lpu;")
    public static class522 field721;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Lpca;")
    private class665 field723;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "[I")
    public static int[] field720;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Lpca;")
    public final class665 method471(int arg0) {
        if (arg0 != 0) {
            this.field716 = null;
        }
        field714++;
        class665 var2 = this.field716.field9384;
        if (this.field716 == var2) {
            this.field723 = null;
            return null;
        } else {
            this.field723 = var2.field9384;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Lpca;")
    public final class665 method472(byte arg0) {
        if (arg0 >= -19) {
            this.method475(-12);
        }
        field713++;
        class665 var2 = this.field716.field9382;
        if (this.field716 == var2) {
            this.field723 = null;
            return null;
        } else {
            this.field723 = var2.field9382;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method473(int arg0) {
        field721 = null;
        if (arg0 == 6) {
            field711 = null;
            field720 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lpca;I)V")
    public final void method474(class665 arg0, int arg1) {
        if (arg1 != 6) {
            method473(5);
        }
        field717++;
        if (arg0.field9384 != null) {
            arg0.method3678(-1);
        }
        arg0.field9384 = this.field716.field9384;
        arg0.field9382 = this.field716;
        arg0.field9384.field9382 = arg0;
        arg0.field9382.field9384 = arg0;
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)V")
    public final void method475(int arg0) {
        while (true) {
            class665 var2 = this.field716.field9382;
            if (this.field716 == var2) {
                if (arg0 != 6) {
                    this.method474(null, 20);
                }
                field725++;
                this.field723 = null;
                return;
            }
            var2.method3678(-1);
        }
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)Lpca;")
    public final class665 method476(int arg0) {
        field719++;
        class665 var2 = this.field723;
        if (this.field716 == var2) {
            this.field723 = null;
            return null;
        } else if (arg0 == 9397) {
            this.field723 = var2.field9384;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)I")
    public final int method477(int arg0) {
        if (arg0 != 15650) {
            return -18;
        }
        field715++;
        int var2 = 0;
        for (class665 var3 = this.field716.field9382; var3 != this.field716; var3 = var3.field9382) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lwba;I)V")
    public final void method478(class46 arg0, int arg1) {
        field710++;
        if (arg1 < -50) {
            this.method480(this.field716.field9382, 6, arg0);
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(BLpca;)V")
    public final void method479(byte arg0, class665 arg1) {
        field712++;
        if (arg1.field9384 != null) {
            arg1.method3678(-1);
        }
        arg1.field9382 = this.field716.field9382;
        if (arg0 != -127) {
            this.method472((byte) -57);
        }
        arg1.field9384 = this.field716;
        arg1.field9384.field9382 = arg1;
        arg1.field9382.field9384 = arg1;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(Lpca;ILwba;)V")
    private final void method480(class665 arg0, int arg1, class46 arg2) {
        if (arg1 != 6) {
            return;
        }
        field718++;
        class665 var4 = this.field716.field9384;
        this.field716.field9384 = arg0.field9384;
        arg0.field9384.field9382 = this.field716;
        if (this.field716 != arg0) {
            arg0.field9384 = arg2.field716.field9384;
            arg0.field9384.field9382 = arg0;
            arg2.field716.field9384 = var4;
            var4.field9382 = arg2.field716;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)Z")
    public final boolean method481(byte arg0) {
        field709++;
        if (arg0 == -57) {
            return this.field716.field9382 == this.field716;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
    public class46() {
        this.field716.field9382 = this.field716;
        this.field716.field9384 = this.field716;
    }

    @OriginalMember(owner = "client!wba", name = "f", descriptor = "(I)Lpca;")
    public final class665 method482(int arg0) {
        field724++;
        class665 var2 = this.field723;
        if (this.field716 == var2) {
            this.field723 = null;
            return null;
        } else {
            this.field723 = var2.field9382;
            int var3 = -54 / ((73 - arg0) / 41);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)Lpca;")
    public final class665 method483(byte arg0) {
        field726++;
        if (arg0 > -111) {
            return null;
        }
        class665 var2 = this.field716.field9382;
        if (this.field716 == var2) {
            return null;
        } else {
            var2.method3678(-1);
            return var2;
        }
    }
}
