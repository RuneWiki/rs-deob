import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 extends class170 {

    @OriginalMember(owner = "client!he", name = "W", descriptor = "I")
    public static int field313 = -1;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "[I")
    public static int[] field315 = new int[4096];

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    public static int field316 = 0;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "[I")
    public static int[] field320 = new int[2];

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class19() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Lsi;")
    public static final class197 method112(int arg0, int arg1) {
        field318++;
        int var2 = 3 % ((-arg0 - 83) / 36);
        class197 var3 = (class197) class266.field4717.method758(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class41.field827.method705(26, arg1, -1);
        class197 var5 = new class197();
        if (var4 != null) {
            var5.method1367(false, new class149(var4));
        }
        class266.field4717.method759((long) arg1, 2, var5);
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method113(byte arg0) {
        field315 = null;
        if (arg0 != -126) {
            field314 = -54;
        }
        field320 = null;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(B)V")
    public static final void method114(byte arg0) {
        field317++;
        if (arg0 <= 68) {
            field314 = -37;
        }
        class177.field3194 = new class275(32);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 == -30) {
            field319++;
            return class68.field1211;
        } else {
            return null;
        }
    }
}
