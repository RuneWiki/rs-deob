import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class531 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field7809;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public int field7804;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lhd;")
    public class531 field7806;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ln;")
    public class14 field7807;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lof;")
    public static class446 field7808 = new class446(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    public static int[] field7816 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lof;")
    public static class446 field7812 = new class446(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field7802;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field7803;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7805;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field7810;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field7814;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field7815;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Lqa;")
    public static class165 field7811;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lff;", line = 11)
    public final class8 method3140(byte arg0) {
        field7805++;
        int var2 = -63 % ((2 - arg0) / 33);
        return class77.method535(this.field7804, -102);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lhd;", line = 21)
    public final class531 method3141(int arg0, int arg1) {
        if (arg1 > -116) {
            return null;
        } else {
            field7813++;
            return new class531(this.field7804, arg0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 34)
    public static void method3142(byte arg0) {
        field7812 = null;
        if (arg0 == 17) {
            field7808 = null;
            field7816 = null;
            field7811 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V", line = 46)
    public class531(int arg0, int arg1) {
        this.field7809 = arg1;
        this.field7804 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lhd;I)V", line = 60)
    public class531(class531 arg0, int arg1) {
        this.field7806 = arg0;
        this.field7807 = this.field7806.field7807;
        this.field7809 = this.field7806.field7809 + arg1;
        this.field7804 = this.field7806.field7804;
    }
}
