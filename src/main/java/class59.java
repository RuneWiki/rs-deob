import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class59 {

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "Z")
    private boolean field810 = false;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "Z")
    private boolean field816 = true;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public int field815 = 443;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public int field820 = 43594;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field811 = 1338;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Ljava/lang/String;")
    public String field813;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V", line = 11)
    public final void method388(byte arg0) {
        field809++;
        if (!this.field816) {
            this.field816 = true;
            this.field810 = true;
        } else if (this.field810) {
            this.field810 = false;
        } else {
            this.field816 = false;
        }
        if (arg0 <= 1) {
            this.method391(true, null);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lsv;B)Z", line = 37)
    public final boolean method389(class59 arg0, byte arg1) {
        if (arg1 > -109) {
            return false;
        }
        field819++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field812 == arg0.field812 && this.field813.equals(arg0.field813);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(CB)Z", line = 56)
    public static final boolean method390(char arg0, byte arg1) {
        field818++;
        int var2 = 48 % ((13 - arg1) / 37);
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ZLmr;)Lfg;", line = 68)
    public final class436 method391(boolean arg0, class613 arg1) {
        field817++;
        if (arg0) {
            this.field815 = 91;
        }
        return arg1.method3579(this.field813, true, this.field816 ? this.field815 : this.field820, this.field810);
    }
}
