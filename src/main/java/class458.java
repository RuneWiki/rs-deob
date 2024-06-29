import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class458 {

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "Z")
    public static boolean field6716 = false;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIILfs;IZ)V")
    public static final void method2755(int arg0, int arg1, int arg2, class387 arg3, int arg4, boolean arg5) {
        if (arg4 != -15727) {
            field6716 = true;
        }
        class479.field7048 = arg5;
        field6715++;
        class372.field5534 = 1;
        class498.field7403 = arg0;
        class206.field2999 = 10000;
        class470.field6941 = arg2;
        class445.field6586 = arg1;
        class127.field1852 = arg3;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIII)V")
    public static final void method2756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 8 % ((arg2 - 1) / 63);
        field6717++;
        int var7 = class332.method2034(class401.field5947, -24309, arg0, class471.field6963);
        int var8 = class332.method2034(class401.field5947, -24309, arg5, class471.field6963);
        int var9 = class332.method2034(class126.field1842, -24309, arg4, class72.field992);
        int var10 = class332.method2034(class126.field1842, -24309, arg3, class72.field992);
        for (int var11 = var7; var11 <= var8; var11++) {
            class531.method3136(var9, -8, arg1, var10, class141.field1996[var11]);
        }
    }
}
