import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class418 {

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "Z")
    public static boolean field6258 = false;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "F")
    public static float field6261 = 1024.0F;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public static final void method2637(int arg0) {
        class188.field2861 = -1;
        class564.field8028 = null;
        class502.field7152 = null;
        class22.field234 = -1;
        class234.field3411 = null;
        if (arg0 >= -107) {
            method2638(106, null);
        }
        class111.field1551 = null;
        class209.field3067 = -1;
        class679.field9433 = -1;
        class753.field10520 = null;
        class302.field4293 = null;
        class421.field6280 = null;
        field6263++;
        class547.field7814.method893((byte) -51);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILrg;)Lms;")
    public static final class762 method2638(int arg0, class645 arg1) {
        if (arg0 != 1024) {
            method2638(113, null);
        }
        field6262++;
        return new class762(arg1.method3756(arg0 + 64512), arg1.method3756(65536), arg1.method3756(65536), arg1.method3756(65536), arg1.method3747((byte) -74), arg1.method3747((byte) -74), arg1.method3745(-6314));
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
    public static final void method2639(int arg0) {
        field6260++;
        int var1 = -88 / ((arg0 - 26) / 35);
        for (class19 var2 = (class19) class153.field2445.method1195(0); var2 != null; var2 = (class19) class153.field2445.method1201(2)) {
            if (var2.field205) {
                var2.method1304((byte) 7);
            } else {
                var2.field213 = true;
                if (var2.field208 >= 0 && var2.field211 >= 0 && class194.field2946 > var2.field208 && class255.field3656 > var2.field211) {
                    class422.method2649(var2, (byte) 88);
                }
            }
        }
        for (class19 var3 = (class19) class606.field8555.method1195(0); var3 != null; var3 = (class19) class606.field8555.method1201(2)) {
            if (var3.field205) {
                var3.method1304((byte) 7);
            } else {
                var3.field213 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)I")
    public static final int method2640(byte arg0) {
        field6259++;
        int var1 = -47 % ((arg0 - 14) / 34);
        class106 var2 = class671.field9364;
        synchronized (class671.field9364) {
            return class671.field9364.method802(65471);
        }
    }
}
