import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class452 implements class196 {

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "Lor;")
    public class594 field6227;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "Lma;")
    public class12 field6226;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "Z")
    public boolean field6229;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public int field6231;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    public int field6234;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public int field6225;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lhw;")
    public static class115 field6221 = new class115();

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field6235 = 0;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public static void method2568(byte arg0) {
        int var1 = 68 % ((-arg0 - 37) / 55);
        field6221 = null;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(ILor;Lma;IIIIIIIZ)V")
    public class452(int arg0, class594 arg1, class12 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field6228 = arg9;
        this.field6227 = arg1;
        this.field6224 = arg0;
        this.field6223 = arg5;
        this.field6226 = arg2;
        this.field6229 = arg10;
        this.field6231 = arg8;
        this.field6234 = arg6;
        this.field6230 = arg4;
        this.field6232 = arg3;
        this.field6225 = arg7;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)Loh;")
    public final class370 method640(int arg0) {
        if (arg0 == 58) {
            field6237++;
            return class364.field4801;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(I)V")
    public static final void method2569(int arg0) {
        field6222++;
        if (class631.field8758 == -1) {
            return;
        }
        int var1 = class214.field2991.method1499(8);
        int var2 = class214.field2991.method1491((byte) 105);
        class639 var3 = (class639) class508.field6960.method1436(28964);
        if (var3 != null) {
            var1 = var3.method1014(false);
            var2 = var3.method1010(arg0 - 119);
        }
        class485.method2759(arg0, class631.field8758, 0, 0, 0, 119, class222.field3096, var2, var1, class340.field4553);
        if (class289.field3960 != null) {
            class489.method2775(var1, 2, var2);
        }
    }
}
