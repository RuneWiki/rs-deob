import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class296 extends class265 {

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    private int field5062;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    private int field5066;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    private int field5058;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    private int field5068;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field5055 = 0;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "[Luk;")
    public static class93[] field5065 = new class93[14];

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lwm;")
    private static class152 field5063 = class157.method1048("Loading world list data", 113);

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "Z")
    public static boolean field5061 = false;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "Lwm;")
    public static class152 field5070 = null;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lwm;")
    public static class152 field5054 = field5063;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIII)V", line = 4)
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field5062 = arg1;
        this.field5066 = arg2;
        this.field5058 = arg3;
        this.field5068 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)V", line = 18)
    public final void method248(byte arg0, int arg1, int arg2) {
        int var4 = -8 / ((arg0 - 22) / 52);
        field5064++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILbh;Lbh;)V", line = 47)
    public static final void method2042(int arg0, class273 arg1, class273 arg2) {
        field5057++;
        if (arg1.field4685 != null) {
            arg1.method1880(-25368);
        }
        arg1.field4685 = arg2.field4685;
        arg1.field4687 = arg2;
        arg1.field4685.field4687 = arg1;
        if (arg0 <= 114) {
            method2044(126);
        }
        arg1.field4687.field4685 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBI)V", line = 68)
    public static final void method2043(int arg0, byte arg1, int arg2) {
        field5067++;
        if (arg1 != -74) {
            field5070 = (class152) null;
        }
        class303 var3 = class90.method589(false, arg2, 6);
        var3.method2117((byte) 45);
        var3.field5219 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 93)
    public final void method243(int arg0, int arg1, int arg2) {
        field5056++;
        if (arg2 >= -113) {
            field5070 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Z", line = 103)
    public static final boolean method2044(int arg0) {
        field5069++;
        if (class217.field3516) {
            return true;
        } else {
            int var1 = -66 / ((19 - arg0) / 49);
            return class272.field4679;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III[[III)I", line = 123)
    public static final int method2045(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        field5060++;
        int var6 = (128 - arg0) * arg3[arg5][arg1] + (arg3[arg5 - arg2][arg1] * arg0) >> 7;
        int var7 = (128 - arg0) * arg3[arg5][arg1 + 1] + arg3[arg5 + 1][arg1 + 1] * arg0 >> 7;
        return (128 - arg4) * var6 + (arg4 * var7) >> 7;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 148)
    public static void method2046(int arg0) {
        field5070 = null;
        field5054 = null;
        field5065 = null;
        if (arg0 == 8792) {
            field5063 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V", line = 165)
    public final void method247(int arg0, int arg1, int arg2) {
        field5059++;
        int var4 = this.field5066 * arg1 >> 12;
        int var5 = this.field5068 * arg1 >> 12;
        if (arg2 <= 86) {
            method2046(75);
        }
        int var6 = this.field5062 * arg0 >> 12;
        int var7 = this.field5058 * arg0 >> 12;
        class256.method1793(var6, var7, -740560532, this.field4472, var5, var4);
    }
}
