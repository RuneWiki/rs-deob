import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class374 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "B")
    public byte field5068;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "S")
    public short field5071;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Lse;")
    public class170 field5070;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "B")
    public byte field5069;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field5072 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Lhn;")
    public static class509 field5067 = new class509(32);

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field5074 = -1;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
    public static int[] field5077 = new int[1000];

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "Lfo;")
    public static class361 field5075;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[S")
    public static short[] field5076;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILpj;Lpj;)V")
    public static final void method2211(int arg0, int arg1, int arg2, class100 arg3, class100 arg4) {
        class498 var5 = class61.method369(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7259 = arg3;
            var5.field7271 = arg4;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2212(int arg0) {
        field5077 = null;
        if (arg0 >= 113) {
            field5076 = null;
            field5075 = null;
            field5067 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lse;III)V")
    public class374(class170 arg0, int arg1, int arg2, int arg3) {
        this.field5068 = (byte) arg3;
        this.field5071 = (short) arg1;
        this.field5070 = arg0;
        this.field5069 = (byte) arg2;
    }
}
