import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class298 {

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
    public static boolean field4847 = true;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field4848 = 0;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Lin;")
    public static class106 field4845;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "[Lic;")
    public static class180[] field4844;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I", line = 4)
    public static final int method2007(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIB)V", line = 21)
    public static final void method2008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 <= 98) {
            method2009(123);
        }
        field4846++;
        if (arg0 < 128 || arg6 < 128 || arg0 > 13056 || arg6 > 13056) {
            class191.field3105 = -1;
            class40.field652 = -1;
            return;
        }
        int var8 = class259.method1801(arg6, -20428, field4849, arg0) - arg5;
        int var9 = arg6 - class167.field2725;
        int var10 = var8 - class205.field3387;
        int var11 = arg0 - class192.field3177;
        int var12 = class310.field5199[class222.field3653];
        int var13 = class310.field5197[class222.field3653];
        int var14 = class310.field5199[class65.field1004];
        int var15 = class310.field5197[class65.field1004];
        int var16 = var9 * var14 + var11 * var15 >> 16;
        int var17 = var9 * var15 - (var11 * var14) >> 16;
        int var19 = var10 * var13 - (var12 * var17) >> 16;
        int var20 = var10 * var12 + var13 * var17 >> 16;
        if (var20 < 50) {
            class40.field652 = -1;
            class191.field3105 = -1;
        } else if (class99.field1675) {
            int var22 = arg3 * 512 >> 8;
            class191.field3105 = var19 * var22 / var20 + arg4;
            int var23 = arg1 * 512 >> 8;
            class40.field652 = var16 * var23 / var20 + arg2;
        } else {
            class191.field3105 = (var19 << 9) / var20 + arg4;
            class40.field652 = arg2 + ((var16 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 109)
    public static void method2009(int arg0) {
        field4844 = null;
        field4845 = null;
        if (arg0 != -66820688) {
            field4844 = (class180[]) null;
        }
    }
}
