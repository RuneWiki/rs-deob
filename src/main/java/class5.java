import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class5 {

    @OriginalMember(owner = "client!no", name = "d", descriptor = "Ljava/lang/String;")
    public static String field51 = "Loading sprites - ";

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!no", name = "n", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!no", name = "o", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "Lrj;")
    public static class22 field54;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "Lqm;")
    private class259 field49;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Ltg;")
    private class345 field50;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient;")
    public static client field59;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLtg;)V", line = 8)
    public final void method30(boolean arg0, class345 arg1) {
        if (arg0) {
            method34((class16) null, 7);
        }
        field53++;
        this.field50 = arg1;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)Lqm;", line = 27)
    public final class259 method31(int arg0) {
        class259 var2 = this.field50.field5476.field4098;
        field55++;
        if (arg0 != 0) {
            method33((byte) 39, (short[]) null, (String[]) null);
        }
        if (this.field50.field5476 == var2) {
            this.field49 = null;
            return null;
        } else {
            this.field49 = var2.field4098;
            return var2;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)Lqm;", line = 46)
    public final class259 method32(int arg0) {
        field52++;
        class259 var2 = this.field49;
        if (arg0 != -29107) {
            return (class259) null;
        } else if (this.field50.field5476 == var2) {
            this.field49 = null;
            return null;
        } else {
            this.field49 = var2.field4098;
            return var2;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 70)
    public static final void method33(byte arg0, short[] arg1, String[] arg2) {
        field61++;
        int var3 = -6 / ((-arg0 - 62) / 50);
        class349.method2415(arg1, arg2.length - 1, arg2, true, 0);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lnk;I)V", line = 82)
    public static final void method34(class16 arg0, int arg1) {
        if (arg1 == -30767) {
            field58++;
            class119.field1651 = arg0;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V", line = 112)
    public static void method35(int arg0) {
        field54 = null;
        if (arg0 == 0) {
            field59 = null;
            field51 = null;
        }
    }
}
