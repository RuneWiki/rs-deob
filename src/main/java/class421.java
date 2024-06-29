import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class421 {

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljava/lang/String;")
    public String field6077;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lsd;")
    public static class74 field6078 = new class74(36, -1);

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "F")
    public static float field6075;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 5)
    public static void method2509(byte arg0) {
        if (arg0 > -103) {
            field6075 = 3.111659F;
        }
        field6078 = null;
    }

    @OriginalMember(owner = "client!ci", name = "toString", descriptor = "()Ljava/lang/String;", line = 17)
    public final String toString() {
        field6074++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;IB)I", line = 25)
    public static final int method2510(String arg0, int arg1, byte arg2) {
        field6071++;
        return arg2 < 34 ? 62 : class134.method633(57, arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V", line = 37)
    public static final void method2511(byte arg0, int arg1) {
        field6069++;
        if (arg0 >= -113) {
            field6075 = 0.6544778F;
        }
        class89 var2 = class146.method695(10, arg1, (byte) -39);
        var2.method448(13);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)I", line = 51)
    public static final int method2512(int arg0, int arg1) {
        field6072++;
        return arg0 == 8131 ? arg1 >>> 7 : 95;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)V", line = 70)
    public static final void method2513(int arg0, int arg1) {
        class52.field682 = new int[arg1];
        if (arg0 != 26110) {
            field6078 = null;
        }
        field6076++;
        class173.field2087 = new int[arg1];
        class188.field2548 = new int[arg1];
        class181.field2330 = new int[arg1];
        class208.field2885 = new int[arg1];
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 91)
    public class421(String arg0, int arg1) {
        this.field6077 = arg0;
        this.field6073 = arg1;
    }
}
