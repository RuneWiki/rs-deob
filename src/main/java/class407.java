import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class407 {

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "I")
    public int field5801;

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
    public static int field5799 = 0;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!mfa", name = "c", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!mfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5802++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(I)V")
    public class407(int arg0) {
        this.field5801 = arg0;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
    public static final void method2483(boolean arg0) {
        field5800++;
        if (!arg0) {
            field5799 = -113;
        }
        if (!class160.method1138(1)) {
            return;
        }
        if (class445.field6360 == null) {
            class674.method3832(-19663);
        }
        class94.field1354 = true;
        class348.field5140 = 0;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5798++;
        int var7 = arg2 + arg6;
        if (arg5 != 0) {
            return;
        }
        int var8 = arg0 - arg2;
        for (int var9 = arg6; var9 < var7; var9++) {
            class518.method3153(arg1, arg3, class193.field2839[var9], -7, arg4);
        }
        for (int var10 = arg0; var10 > var8; var10--) {
            class518.method3153(arg1, arg3, class193.field2839[var10], -7, arg4);
        }
        int var11 = arg3 + arg2;
        int var12 = arg1 - arg2;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class193.field2839[var13];
            class518.method3153(var11, arg3, var14, -7, arg4);
            class518.method3153(arg1, var12, var14, arg5 ^ 0xFFFFFFF9, arg4);
        }
    }
}
