import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class535 {

    @OriginalMember(owner = "client!am", name = "a", descriptor = "Lfr;")
    private class497 field7862;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Luv;")
    public static class2 field7867 = new class2(106, 3);

    @OriginalMember(owner = "client!am", name = "g", descriptor = "[I")
    public static int[] field7868 = new int[1000];

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Laa;")
    public static class76 field7869 = new class76(78, 8);

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Lec;")
    public static class109 field7866;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "Lea;")
    private class115 field7870;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)Lea;")
    public final class115 method3162(byte arg0) {
        if (arg0 > -74) {
            method3165(-78);
        }
        field7864++;
        class115 var2 = this.field7870;
        if (this.field7862.field7365 == var2) {
            this.field7870 = null;
            return null;
        } else {
            this.field7870 = var2.field1741;
            return var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lfr;B)V")
    public final void method3163(class497 arg0, byte arg1) {
        this.field7862 = arg0;
        field7865++;
        if (arg1 != -66) {
            this.method3163(null, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lea;")
    public final class115 method3164(byte arg0) {
        field7863++;
        class115 var2 = this.field7862.field7365.field1741;
        if (this.field7862.field7365 == var2) {
            this.field7870 = null;
            return null;
        } else {
            this.field7870 = var2.field1741;
            return arg0 >= -34 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
    public static void method3165(int arg0) {
        if (arg0 > -41) {
            method3165(-97);
        }
        field7869 = null;
        field7867 = null;
        field7866 = null;
        field7868 = null;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class535() {
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lfr;)V")
    public class535(class497 arg0) {
        this.field7862 = arg0;
    }
}
