import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class241 implements class696 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lrga;")
    public static class280 field3006 = new class280(73, -1);

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field3008 = new int[1];

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field3010 = new String[200];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lwp;")
    public static class453 field3009 = new class453(72, 3);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 3)
    public static void method1440(byte arg0) {
        if (arg0 < -43) {
            field3010 = null;
            field3008 = null;
            field3009 = null;
            field3006 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI[B)[B", line = 19)
    public static final byte[] method1441(byte arg0, int arg1, byte[] arg2) {
        if (arg0 >= -72) {
            return null;
        } else {
            field3005++;
            byte[] var3 = new byte[arg1];
            class293.method1645(arg2, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(J[IILbaa;)Ljava/lang/String;", line = 34)
    public final String method1442(long arg0, int[] arg1, int arg2, class593 arg3) {
        int var6 = -21 / ((arg2 + 33) / 37);
        field3007++;
        if (class497.field6553 == arg3) {
            class440 var7 = class397.field5005.method1623(arg1[0], -8727);
            return var7.method2349(-24908, (int) arg0);
        } else if (client.field9533 == arg3 || class380.field4798 == arg3) {
            class3 var8 = class633.field8881.method434(12388, (int) arg0);
            return var8.field34;
        } else if (class462.field5886 == arg3 || class538.field7225 == arg3 || class205.field2610 == arg3) {
            return class397.field5005.method1623(arg1[0], -8727).method2349(-24908, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIILlca;Llca;)V", line = 71)
    public static final void method1443(int arg0, int arg1, int arg2, class137 arg3, class137 arg4) {
        class75 var5 = class128.method683(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field1022 = arg3;
        var5.field1034 = arg4;
        int var6 = class699.field9887 == class491.field6485 ? 1 : 0;
        if (!arg3.method68((byte) 117)) {
            class252.field3090[var6][class469.field5960[var6]++] = arg3;
        } else if (arg3.method83((byte) 23)) {
            class337.field4341[var6][class173.field2256[var6]++] = arg3;
        } else {
            class102.field1375[var6][class593.field8335[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method68((byte) 122)) {
            if (arg4.method83((byte) 23)) {
                class337.field4341[var6][class173.field2256[var6]++] = arg4;
                return;
            }
            class102.field1375[var6][class593.field8335[var6]++] = arg4;
            return;
        }
        class252.field3090[var6][class469.field5960[var6]++] = arg4;
    }
}
