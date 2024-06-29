import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class779 {

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "Z")
    public boolean field10700;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "I")
    public static int field10695 = -1;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "Z")
    public static boolean field10699 = false;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "Lok;")
    public static class266 field10697 = new class266();

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field10701;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "Ljd;")
    public static class241 field10693;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "Lhl;")
    public class553 field10690;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "Lhl;")
    public class553 field10696;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "Z")
    public boolean field10691;

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "[I")
    public static int[] field10694;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "[[I")
    public static int[][] field10692;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IB)Ltv;", line = 4)
    public static final class585 method4283(int arg0, byte arg1) {
        if (arg1 < 77) {
            method4283(-58, (byte) -9);
        }
        field10701++;
        if (arg0 == 0) {
            return new class610();
        } else if (arg0 == 1) {
            return new class646();
        } else if (arg0 == 2) {
            return new class15();
        } else if (arg0 == 3) {
            return new class24();
        } else if (arg0 == 4) {
            return new class479();
        } else if (arg0 == 5) {
            return new class473();
        } else if (arg0 == 6) {
            return new class289();
        } else if (arg0 == 7) {
            return new class732();
        } else if (arg0 == 8) {
            return new class138();
        } else if (arg0 == 9) {
            return new class437();
        } else if (arg0 == 10) {
            return new class404();
        } else if (arg0 == 11) {
            return new class42();
        } else if (arg0 == 12) {
            return new class362();
        } else if (arg0 == 13) {
            return new class679();
        } else if (arg0 == 14) {
            return new class690();
        } else if (arg0 == 15) {
            return new class111();
        } else if (arg0 == 16) {
            return new class153();
        } else if (arg0 == 17) {
            return new class258();
        } else if (arg0 == 18) {
            return new class298();
        } else if (arg0 == 19) {
            return new class8();
        } else if (arg0 == 20) {
            return new class341();
        } else if (arg0 == 21) {
            return new class103();
        } else if (arg0 == 22) {
            return new class31();
        } else if (arg0 == 23) {
            return new class619();
        } else if (arg0 == 24) {
            return new class237();
        } else if (arg0 == 25) {
            return new class703();
        } else if (arg0 == 26) {
            return new class558();
        } else if (arg0 == 27) {
            return new class215();
        } else if (arg0 == 28) {
            return new class454();
        } else if (arg0 == 29) {
            return new class9();
        } else if (arg0 == 30) {
            return new class772();
        } else if (arg0 == 31) {
            return new class742();
        } else if (arg0 == 32) {
            return new class431();
        } else if (arg0 == 33) {
            return new class225();
        } else if (arg0 == 34) {
            return new class198();
        } else if (arg0 == 35) {
            return new class640();
        } else if (arg0 == 36) {
            return new class197();
        } else if (arg0 == 37) {
            return new class433();
        } else if (arg0 == 38) {
            return new class723();
        } else if (arg0 == 39) {
            return new class123();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)V", line = 318)
    public static void method4284(byte arg0) {
        if (arg0 <= 9) {
            method4284((byte) 112);
        }
        field10697 = null;
        field10693 = null;
        field10694 = null;
        field10692 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)Z", line = 340)
    public final boolean method4285(int arg0) {
        if (arg0 != -4) {
            field10699 = false;
        }
        field10702++;
        return this.field10691 && !this.field10700;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V", line = 359)
    public final void method4286(int arg0) {
        if (this.field10696 != null) {
            this.field10696.method602((byte) 41);
        }
        if (arg0 < -107) {
            field10698++;
            this.field10691 = false;
        }
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(Z)V", line = 378)
    public class779(boolean arg0) {
        this.field10700 = arg0;
    }
}
