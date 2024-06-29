import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class601 {

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    private int field8690;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public int field8695;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public int field8688;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public int field8687;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "B")
    public byte field8684;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "Lkca;")
    public class601 field8692;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "Lvt;")
    public static class344 field8693 = new class344("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "[Lge;")
    public static class551[] field8697 = new class551[2048];

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public int field8683;

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    public int field8685;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
    public int field8686;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public int field8689;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
    public int field8691;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public int field8694;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public int field8696;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public int field8698;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
    public int field8699;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BIII)Lkca;")
    public final class601 method3456(byte arg0, int arg1, int arg2, int arg3) {
        field8681++;
        return arg0 <= 72 ? null : new class601(this.field8690, arg3, arg2, arg1, this.field8684);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
    public static void method3457(byte arg0) {
        if (arg0 != 36) {
            field8693 = null;
        }
        field8693 = null;
        field8697 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3458(int arg0, byte arg1, int arg2) {
        field8680++;
        if (arg1 <= 117) {
            field8693 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class137 var3 = class626.field9084.method1093(0, arg2);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method721(arg0, false);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)Ldp;")
    public final class426 method3459(boolean arg0) {
        field8682++;
        if (!arg0) {
            this.field8686 = 113;
        }
        return class247.method1517(41, this.field8690);
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(IIIIB)V")
    public class601(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field8690 = arg0;
        this.field8695 = arg3;
        this.field8688 = arg1;
        this.field8687 = arg2;
        this.field8684 = arg4;
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lkca;I)V")
    public class601(class601 arg0, int arg1) {
        this.field8692 = arg0;
        this.field8687 = this.field8692.field8687 + arg1;
        this.field8684 = this.field8692.field8684;
        this.field8695 = this.field8692.field8695 + arg1;
        this.field8688 = this.field8692.field8688 + arg1;
        this.field8690 = this.field8692.field8690;
    }
}
