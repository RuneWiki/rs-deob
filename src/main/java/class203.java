import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class203 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lpq;")
    public class194 field2843;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lul;")
    public static class486 field2846 = new class486("", 14);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lria;")
    public static class23 field2847;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)Z", line = 8)
    public static final boolean method1303(int arg0, boolean arg1) {
        field2844++;
        if (!arg1) {
            field2847 = null;
        }
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Z", line = 19)
    public static final boolean method1304(int arg0, byte arg1) {
        field2842++;
        if (arg1 > -24) {
            return true;
        } else {
            return arg0 == 7 || arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I", line = 32)
    public static final int method1305(int arg0, int arg1, int arg2) {
        field2845++;
        if (arg1 == 1 || arg1 == 3) {
            return class23.field215[arg2 & 0x3];
        } else if (arg0 == -4) {
            return class358.field5147[arg2 & 0x3];
        } else {
            return -94;
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lpq;)V", line = 46)
    public class203(class194 arg0) {
        this.field2843 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 56)
    public static void method1306(boolean arg0) {
        field2847 = null;
        if (arg0) {
            method1303(-70, true);
        }
        field2846 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public abstract void method686(int arg0);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLwha;)V")
    public abstract void method683(int arg0, boolean arg1, class539 arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BZ)V")
    public abstract void method688(byte arg0, boolean arg1);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZ)V")
    public abstract void method682(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZB)V")
    public abstract void method681(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Z")
    public abstract boolean method687(int arg0);
}
