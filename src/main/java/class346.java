import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class346 {

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method2171(int arg0, int arg1) {
        field5076++;
        for (class69 var2 = (class69) class37.field371.method374((byte) 99); var2 != null; var2 = (class69) class37.field371.method372(-20740)) {
            if (class668.method3705(var2.field902, false) && (long) arg0 == var2.field900) {
                return true;
            }
        }
        if (arg1 == -5) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Z", line = 30)
    public static final boolean method2172(byte arg0, int arg1) {
        field5075++;
        int var2 = 25 / ((arg0 + 8) / 61);
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)Z", line = 50)
    public final boolean method2173(byte arg0) {
        if (arg0 <= 76) {
            return false;
        } else {
            field5074++;
            return this.method258(-7) || this.method266(-73) || this.method273(-74);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)Z")
    public abstract boolean method266(int arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public abstract void method262(int arg0);

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public abstract void method274(int arg0);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)I")
    public abstract int method269(byte arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)I")
    public abstract int method268(byte arg0);

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
    public abstract boolean method258(int arg0);

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)Lbv;")
    public abstract class8 method271(int arg0);

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)Z")
    public abstract boolean method273(int arg0);
}
