import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class451 {

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "Z")
    public static boolean field6576 = true;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6573 = "Allocated memory";

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field6581 = 0;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "[[[B")
    public static byte[][][] field6578;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILw;Lw;)V")
    public static final void method2819(int arg0, class235 arg1, class235 arg2) {
        if (arg2.field3311 != null) {
            arg2.method1439(-29183);
        }
        if (arg0 < 53) {
            return;
        }
        field6579++;
        arg2.field3302 = arg1.field3302;
        arg2.field3311 = arg1;
        arg2.field3311.field3302 = arg2;
        arg2.field3302.field3311 = arg2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLnr;Ltc;)I")
    public static final int method2820(byte arg0, class437 arg1, class291 arg2) {
        field6574++;
        if (arg2.field4219 != -1) {
            return arg2.field4219;
        }
        if (arg2.field4203 != -1) {
            class175 var3 = class364.field5327.method1760(arg0 ^ 0xFFFFB20F, arg1.method2112() ? arg2.field4203 : arg2.field4208);
            if (!var3.field2273) {
                return var3.field2295;
            }
        }
        if (arg0 != 50) {
            method2823(38);
        }
        return arg2.field4209;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2821(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class203.field2942 = arg3;
        class180.field2375 = arg2;
        if (arg4) {
            field6573 = null;
        }
        class297.field4268 = arg0;
        class50.field695 = arg1;
        field6577++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
    public static final void method2822(byte arg0, int arg1) {
        field6572++;
        if (!class126.method864((byte) -92, arg1) || arg0 >= -65) {
            return;
        }
        class249[] var2 = class119.field1607[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class249 var4 = var2[var3];
            if (var4 != null) {
                var4.field3505 = 0;
                var4.field3651 = 0;
                var4.field3648 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2823(int arg0) {
        if (arg0 == 21521) {
            field6573 = null;
            field6578 = null;
        }
    }
}
