import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class137 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lmu;")
    public static class303 field2296 = new class303(44, 6);

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Z")
    public static boolean field2298 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
    public static final int method1114(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 36) {
            field2298 = true;
        }
        field2297++;
        int var4 = 255 - arg2;
        int var5 = ((arg3 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg3 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        if (arg0 != 16711680) {
            field2296 = null;
        }
        field2296 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZIIBIIIII)Z")
    public static final boolean method1116(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2295++;
        int var9 = class58.field1147.field5746[0];
        int var10 = class58.field1147.field5743[0];
        if (var9 < 0 || class376.field5325 <= var9 || var10 < 0 || var10 >= class175.field2711) {
            return false;
        } else if (arg1 >= 0 && arg1 < class376.field5325 && arg2 >= 0 && arg2 < class175.field2711) {
            int var11 = class275.method1816(arg1, class58.field1147.method2457((byte) 70), arg4, class265.field3765, arg0, (byte) 120, arg7, var9, var10, class167.field2611, arg2, class19.field295[class58.field1147.field5926], arg6, arg5, arg8);
            if (var11 < 1) {
                return false;
            }
            class295.field4138 = class167.field2611[var11 - 1];
            class136.field2279 = class265.field3765[var11 - 1];
            class6.field46 = false;
            if (arg3 > -83) {
                field2298 = true;
            }
            class105.method957(false);
            return true;
        } else {
            return false;
        }
    }
}
