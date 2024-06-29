import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class377 {

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Lus;")
    private class1 field5596;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "J")
    public long field5600;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "Z")
    public static boolean field5601 = false;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZZI)V")
    public static final void method2364(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            class110.field1984++;
            class660.method3753(true);
        }
        if (arg2 != -40) {
            field5601 = true;
        }
        field5602++;
        if (arg1) {
            class29.field935++;
            class607.method3494(false);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Lmfa;")
    public static final class573 method2365(int arg0, int arg1) {
        field5597++;
        if (arg1 != -28) {
            field5601 = true;
        }
        if (arg0 == 0) {
            return new class417();
        } else if (arg0 == 1) {
            return new class238();
        } else if (arg0 == 2) {
            return new class662();
        } else if (arg0 == 3) {
            return new class574();
        } else if (arg0 == 4) {
            return new class649();
        } else if (arg0 == 5) {
            return new class405();
        } else if (arg0 == 6) {
            return new class88();
        } else if (arg0 == 7) {
            return new class614();
        } else if (arg0 == 8) {
            return new class127();
        } else if (arg0 == 9) {
            return new class69();
        } else if (arg0 == 10) {
            return new class660();
        } else if (arg0 == 11) {
            return new class376();
        } else if (arg0 == 12) {
            return new class568();
        } else if (arg0 == 13) {
            return new class164();
        } else if (arg0 == 14) {
            return new class231();
        } else if (arg0 == 15) {
            return new class435();
        } else if (arg0 == 16) {
            return new class492();
        } else if (arg0 == 17) {
            return new class119();
        } else if (arg0 == 18) {
            return new class307();
        } else if (arg0 == 19) {
            return new class566();
        } else if (arg0 == 20) {
            return new class654();
        } else if (arg0 == 21) {
            return new class253();
        } else if (arg0 == 22) {
            return new class381();
        } else if (arg0 == 23) {
            return new class586();
        } else if (arg0 == 24) {
            return new class134();
        } else if (arg0 == 25) {
            return new class20();
        } else if (arg0 == 26) {
            return new class79();
        } else if (arg0 == 27) {
            return new class50();
        } else if (arg0 == 28) {
            return new class270();
        } else if (arg0 == 29) {
            return new class489();
        } else if (arg0 == 30) {
            return new class656();
        } else if (arg0 == 31) {
            return new class611();
        } else if (arg0 == 32) {
            return new class499();
        } else if (arg0 == 33) {
            return new class44();
        } else if (arg0 == 34) {
            return new class255();
        } else if (arg0 == 35) {
            return new class178();
        } else if (arg0 == 36) {
            return new class72();
        } else if (arg0 == 37) {
            return new class453();
        } else if (arg0 == 38) {
            return new class115();
        } else if (arg0 == 39) {
            return new class57();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5596.method38(65280, this.field5600);
        field5598++;
        super.finalize();
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lus;J[Ljfa;)V")
    public class377(class1 arg0, long arg1, class264[] arg2) {
        this.field5596 = arg0;
        this.field5600 = arg1;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Lom;B)V")
    public static final void method2366(class344 arg0, byte arg1) {
        class517.field7302 = arg0;
        if (arg1 <= -66) {
            field5599++;
        }
    }
}
