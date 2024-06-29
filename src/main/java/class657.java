import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class class657 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lwga;")
    public class745 field9010;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field9009;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field9011;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field9012;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field9013;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field9014;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 9)
    public void method1312(int arg0) {
        field9015++;
        if (arg0 != -16252) {
            this.method1315(false);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V", line = 19)
    public void method1313(byte arg0) {
        if (arg0 != 12) {
            this.method3636(5);
        }
        field9013++;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lwga;)V", line = 29)
    public class657(class745 arg0) {
        this.field9010 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V", line = 37)
    public void method1314(int arg0) {
        field9014++;
        if (arg0 != -14775) {
            this.field9010 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V", line = 56)
    public void method3636(int arg0) {
        if (arg0 < 45) {
            this.field9010 = null;
        }
        field9012++;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)Lql;", line = 66)
    public static final class733 method3705(int arg0) {
        field9009++;
        class733 var1 = (class733) class554.field7660.method1304(60);
        if (arg0 != 32564) {
            method3705(-38);
        }
        if (var1 == null) {
            return new class733();
        } else {
            class575.field7893--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V", line = 87)
    public void method1315(boolean arg0) {
        field9011++;
        if (arg0) {
            this.field9010 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "(I)V", line = 97)
    public void method733(int arg0) {
        if (arg0 == 10425) {
            field9016++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
    public abstract void method728(byte arg0);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZB)V")
    public abstract void method734(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
    public abstract void method735(int arg0, boolean arg1);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public abstract void method730(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILdu;I)V")
    public abstract void method736(int arg0, class357 arg1, int arg2);

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)Z")
    public abstract boolean method731(int arg0);
}
