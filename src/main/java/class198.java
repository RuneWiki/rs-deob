import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class198 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2973;

    static {
        new class487("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V", line = 10)
    public static final void method1274(int arg0) {
        field2973++;
        int var1 = 0;
        if (arg0 != -5992) {
            method1275(-88, 19, 75);
        }
        for (int var2 = 0; var2 < class35.field399; var2++) {
            for (int var3 = 0; var3 < class382.field5586; var3++) {
                if (class527.method3118(var2, var1, class526.field7777, true, var3, 114)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z", line = 54)
    public static final boolean method1275(int arg0, int arg1, int arg2) {
        if (arg1 <= 64) {
            return false;
        } else {
            field2972++;
            return class490.method2968(arg0, arg2, 24431) | (arg2 & 0x800) != 0 || class133.method812(arg2, 5, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V", line = 67)
    public static final void method1276(byte arg0) {
        field2971++;
        int var1 = 12 % ((arg0 - 45) / 51);
        class24.method108();
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)Z")
    public abstract boolean method167(boolean arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public abstract void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;IB)Z")
    public abstract boolean method164(int arg0, class167 arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    public abstract void method165(byte arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLqa;)Led;")
    public abstract class115 method157(byte arg0, class167 arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqa;Z)V")
    public abstract void method166(class167 arg0, boolean arg1);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILqa;)Llb;")
    public abstract class239 method169(int arg0, class167 arg1);
}
