import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class734 extends class41 {

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    private int field10267 = -1;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
    public static int[] field10264 = new int[500];

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[S")
    public static short[] field10262;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Loga;I)V")
    public final void method331(class500 arg0, int arg1) {
        arg0.method2956(this.field10267, 0);
        field10265++;
        if (arg1 != 55) {
            this.method329(-51, null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILes;)V")
    public final void method329(int arg0, class403 arg1) {
        if (arg0 != -3999) {
            field10263 = -41;
        }
        field10261++;
        this.field10267 = arg1.method2390((byte) 1);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lcf;ZIIZLcf;I)I")
    public static final int method4143(class631 arg0, boolean arg1, int arg2, int arg3, boolean arg4, class631 arg5, int arg6) {
        field10266++;
        int var7 = class191.method1251(6488, arg1, arg5, arg0, arg3);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else if (arg2 > -107) {
            return -90;
        } else {
            int var8 = class191.method1251(6488, arg4, arg5, arg0, arg6);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static void method4144(int arg0) {
        field10262 = null;
        if (arg0 <= 81) {
            field10264 = null;
        }
        field10264 = null;
    }
}
