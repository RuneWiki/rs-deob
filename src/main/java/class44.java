import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 extends class86 {

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lof;")
    public static class446 field636 = new class446("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Lni;")
    public static class367 field637 = new class367(6, 4);

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field639 = 0;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "Z")
    public static boolean field641;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "[I")
    public static int[] field640;

    static {
        new class446("Ok", "Okay", "OK", "Ok");
        field641 = false;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lnq;)V", line = 3)
    public class44(class325 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IBI)V", line = 7)
    public final void method239(int arg0, byte arg1, int arg2) {
        int var4 = 73 % ((arg1 - -50) / 53);
        ++field629;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 18)
    public static void method350(int arg0) {
        field640 = null;
        field636 = null;
        int var1 = -45 % ((arg0 - 64) / 51);
        field637 = null;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Z", line = 32)
    public final boolean method238(byte arg0) {
        if (arg0 > -2) {
            field639 = 24;
        }
        ++field634;
        return true;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 48)
    public final void method241(int arg0, boolean arg1) {
        super.field1248.method2024(21690, true);
        if (arg0 == 0) {
            ++field633;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V", line = 67)
    public final void method235(boolean arg0, byte arg1) {
        ++field632;
        if (arg1 != 112) {
            field640 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLlr;I)V", line = 77)
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        super.field1248.method2075(arg1, 0);
        ++field635;
        if (!arg0) {
            method351(98, (byte) -103);
        }
        super.field1248.method2045(34023, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V", line = 92)
    public static final void method351(int arg0, byte arg1) {
        ++field630;
        if (arg1 > -63) {
            method350(109);
        }
        class177 var2 = class344.method2229(12, arg0, (byte) 125);
        var2.method1194(-128);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 108)
    public final void method237(int arg0) {
        super.field1248.method2024(21690, false);
        if (arg0 != 27670) {
            field636 = null;
        }
        ++field631;
    }
}
