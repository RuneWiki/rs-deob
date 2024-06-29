import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class426 {

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field5944;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field5949;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field5943;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public int field5945;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field5947;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Loo;")
    public class12 field5946;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lmb;")
    public class426 field5948;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lmb;")
    public final class426 method2570(int arg0, int arg1) {
        field5942++;
        return arg0 == 19870 ? new class426(this.field5949, arg1) : null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Lfa;")
    public final class691 method2571(int arg0) {
        if (arg0 == -8706) {
            field5941++;
            return class47.method388(this.field5949, arg0 + 8707);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(II)V")
    public class426(int arg0, int arg1) {
        this.field5944 = arg1;
        this.field5949 = arg0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method2572(int arg0, String arg1) {
        field5951++;
        return arg0 == -18276 ? class722.field9959.containsKey(arg1) : true;
    }
}
