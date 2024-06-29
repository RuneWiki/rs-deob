import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class369 {

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Lmj;")
    public class344 field5047;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Lpa;")
    public static class648 field5051 = new class648();

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "[C")
    public static char[] field5052 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Lkf;")
    public static class287 field5054;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lnv;")
    public static class63 field5055;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
    public abstract void method5(int arg0, boolean arg1);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V")
    public void method56(byte arg0) {
        field5045++;
        if (arg0 < 36) {
            field5055 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public abstract void method3(byte arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
    public void method1(int arg0) {
        if (arg0 != 8220) {
            field5053 = 120;
        }
        field5050++;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
    public void method2(int arg0) {
        if (arg0 != 17789) {
            field5055 = null;
        }
        field5046++;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)Z")
    public abstract boolean method8(int arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
    public abstract void method7(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V")
    public static void method2157(boolean arg0) {
        field5055 = null;
        field5054 = null;
        field5051 = null;
        field5052 = null;
        if (!arg0) {
            field5052 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public void method6(byte arg0) {
        field5044++;
        if (arg0 != 76) {
            this.method6((byte) 28);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lmj;)V")
    public class369(class344 arg0) {
        this.field5047 = arg0;
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)V")
    public void method4(byte arg0) {
        field5049++;
        if (arg0 < 75) {
            field5051 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V")
    public void method11(int arg0) {
        if (arg0 < 52) {
            field5051 = null;
        }
        field5048++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
    public abstract void method10(boolean arg0, int arg1);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILlc;)V")
    public abstract void method9(byte arg0, int arg1, class686 arg2);
}
