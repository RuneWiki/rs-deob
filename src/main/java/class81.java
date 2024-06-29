import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class81 implements class505 {

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lwa;")
    public static class433 field1223 = new class433(32);

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lki;")
    public static class498 field1224 = new class498(26, 7);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "Lkf;")
    public static class165 field1222;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(JILgo;[I)Ljava/lang/String;")
    public final String method480(long arg0, int arg1, class441 arg2, int[] arg3) {
        if (arg1 >= -127) {
            return null;
        }
        field1221++;
        if (class449.field6695 == arg2) {
            class116 var6 = class463.field6858.method995(16383, arg3[0]);
            return var6.method780((int) arg0, -116);
        } else if (class393.field5934 == arg2 || class478.field7026 == arg2) {
            class339 var7 = class294.field4196.method453(0, (int) arg0);
            return var7.field4796;
        } else if (class405.field6111 == arg2 || class176.field2599 == arg2 || class73.field1084 == arg2) {
            return class463.field6858.method995(16383, arg3[0]).method780((int) arg0, -108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method481(int arg0) {
        if (arg0 != 32) {
            field1222 = null;
        }
        field1223 = null;
        field1222 = null;
        field1224 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "([II[IBLod;I)Leb;")
    public static final class439 method482(int[] arg0, int arg1, int[] arg2, byte arg3, class349 arg4, int arg5) {
        field1225++;
        byte[] var6 = new byte[arg1 * arg5];
        for (int var7 = 0; var7 < arg5; var7++) {
            int var9 = arg1 * var7 + arg0[var7];
            for (int var10 = 0; var10 < arg2[var7]; var10++) {
                var6[var9++] = -1;
            }
        }
        int var8 = -84 / ((arg3 + 72) / 54);
        return new class439(arg4, arg1, arg5, var6);
    }
}
