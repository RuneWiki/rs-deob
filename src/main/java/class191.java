import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class191 extends class29 {

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3093 = "scroll:";

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "C")
    private char field3088;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "F")
    public static float field3095;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "Ljava/lang/String;")
    public String field3094;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZLim;)V", line = 4)
    private final void method1338(int arg0, boolean arg1, class192 arg2) {
        if (arg0 == 1) {
            this.field3088 = class327.method2268(arg2.method1377(true), 70);
        } else if (arg0 == 2) {
            this.field3096 = arg2.method1354((byte) -115);
        } else if (arg0 == 5) {
            this.field3094 = arg2.method1355((byte) 116);
        }
        field3092++;
        if (!arg1) {
            field3095 = 0.47233582F;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(B)V", line = 29)
    public static void method1339(byte arg0) {
        if (arg0 != -44) {
            method1343(58, -111, -125, 57);
        }
        field3093 = null;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z", line = 43)
    public final boolean method1340(int arg0) {
        int var2 = -20 / ((arg0 - 47) / 49);
        field3087++;
        return this.field3088 == 's';
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 70)
    public static final void method1341(int arg0) {
        class283.field4467.method1615(108);
        if (arg0 == 6255) {
            field3091++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lim;I)V", line = 84)
    public final void method1342(class192 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                field3090++;
                if (arg1 < 79) {
                    method1341(95);
                }
                return;
            }
            this.method1338(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V", line = 102)
    public static final void method1343(int arg0, int arg1, int arg2, int arg3) {
        class230 var4 = class251.field3996[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class145 var5 = var4.field3678;
        if (var5 != null) {
            var5.field2169 = var5.field2169 * arg3 / 16;
            var5.field2176 = var5.field2176 * arg3 / 16;
        }
    }
}
