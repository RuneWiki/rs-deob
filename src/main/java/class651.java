import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class651 implements class316 {

    @OriginalMember(owner = "client!paa", name = "k", descriptor = "I")
    public int field9034;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "Lcf;")
    public class631 field9024;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
    public int field9028;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "Lur;")
    public class564 field9027;

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public int field9031;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public int field9029;

    @OriginalMember(owner = "client!paa", name = "j", descriptor = "I")
    public int field9033;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public int field9025;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "I")
    public int field9032;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "Lml;")
    public static class410 field9030 = new class410("", 16);

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field9036 = -1;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field9026;

    @OriginalMember(owner = "client!paa", name = "l", descriptor = "Laj;")
    public static class333 field9035;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method3625(int arg0) {
        if (arg0 == 32370) {
            field9035 = null;
            field9030 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)Lhv;")
    public class546 method1557(byte arg0) {
        field9026++;
        return arg0 > -35 ? null : null;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lur;Lcf;IIIIIII)V")
    public class651(class564 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9034 = arg7;
        this.field9024 = arg1;
        this.field9028 = arg3;
        this.field9027 = arg0;
        this.field9031 = arg2;
        this.field9029 = arg6;
        this.field9033 = arg4;
        this.field9025 = arg5;
        this.field9032 = arg8;
    }
}
