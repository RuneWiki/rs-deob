import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class118 {

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Z")
    public boolean field2087 = false;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public int field2091 = 0;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field2085 = 0;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Loh;")
    public static class258 field2095 = class153.method1046("0", 116);

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Loh;")
    public static class258 field2094 = null;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Loh;")
    private static class258 field2093 = class153.method1046("wishes to trade with you)3", 92);

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Loh;")
    public static class258 field2097 = field2093;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "Lhk;")
    public class66 field2098;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2092;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIZIIII)V", line = 30)
    public static final void method871(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg5 - arg8;
        field2096++;
        if (!arg4) {
            field2090 = -80;
        }
        int var10 = (arg6 - arg0 << 16) / var9;
        int var11 = arg2 - arg7;
        int var12 = (arg1 - arg3 << 16) / var11;
        class27.method211(arg7, arg8, 0, arg2, 0, var10, arg5, var12, arg3, arg0, -32639);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 67)
    public static void method872(byte arg0) {
        field2097 = null;
        int var1 = 51 / ((arg0 - 35) / 35);
        field2094 = null;
        field2095 = null;
        field2093 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 92)
    public static final void method873(int arg0) {
        int var1 = 72 % ((-arg0 - 37) / 34);
        class166.field2816.method1161(86);
        field2086++;
    }
}
