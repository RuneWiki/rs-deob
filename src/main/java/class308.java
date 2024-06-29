import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class308 {

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Ljava/lang/String;")
    public String field4702;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
    public static int[] field4703 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Ljp;")
    public static class55 field4699 = new class55(67, 4);

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field4707 = 4;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field4708 = 0;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "Lfc;")
    public static class258 field4706;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lli;")
    public static class389 field4705;

    @OriginalMember(owner = "client!pt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4700++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBIII)V")
    public static final void method2029(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 19) {
            field4708 = 118;
        }
        if (class40.field667.field4199 != 0 && arg4 != 0 && class510.field7414 < 50 && arg1 != -1) {
            class258.field4135[class510.field7414++] = new class128((byte) 1, arg1, arg4, arg5, arg0, arg3);
        }
        field4701++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    public static void method2030(byte arg0) {
        if (arg0 > -61) {
            field4699 = null;
        }
        field4705 = null;
        field4699 = null;
        field4703 = null;
        field4706 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class308(String arg0, int arg1) {
        this.field4702 = arg0;
        this.field4704 = arg1;
    }
}
