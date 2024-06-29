import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class249 extends class64 {

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    private final int field4321;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    private final int field4324;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    private final int field4325;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    private final int field4317;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lij;")
    public static class50 field4318 = class78.method578(121, " GMT");

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "[I")
    public static int[] field4322 = new int[2048];

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Lij;")
    public static class50 field4326 = class78.method578(126, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
    public final void method275(int arg0, int arg1, int arg2) {
        if (arg1 < 52) {
            this.method275(12, 36, -57);
        }
        ++field4320;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    public static void method1694(int arg0) {
        field4318 = null;
        if (arg0 != 626024748) {
            method1694(70);
        }
        field4322 = null;
        field4326 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)V")
    public final void method276(int arg0, byte arg1, int arg2) {
        ++field4327;
        int var4 = 17 / ((-70 - arg1) / 37);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V")
    public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4321 = arg1;
        this.field4324 = arg0;
        this.field4325 = arg2;
        this.field4317 = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V")
    public final void method277(int arg0, int arg1, int arg2) {
        ++field4323;
        int var4 = 20 % ((arg2 - -5) / 54);
        int var5 = this.field4325 * arg1 >> 12;
        int var6 = this.field4324 * arg1 >> 12;
        int var7 = this.field4321 * arg0 >> 12;
        int var8 = this.field4317 * arg0 >> 12;
        class245.method1670(var6, var8, super.field1219, var7, var5, -124);
    }
}
