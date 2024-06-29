import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class553 {

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7775 = 1400;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field7778;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lhda;")
    public static class748 field7777;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[[[Lwq;")
    public static class165[][][] field7776;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public static void method3201(int arg0) {
        if (arg0 > 69) {
            field7776 = null;
            field7777 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static final void method3202(boolean arg0) {
        class343.field4791 = -1;
        class549.field7670 = 1;
        field7778++;
        if (arg0) {
            return;
        }
        long var1 = 0L;
        if (class448.field6360 == null) {
            class496.method2962(35, false);
        } else {
            class675 var3 = new class675(class362.method2314(class458.method2724(class448.field6360, arg0), -109));
            long var4 = var3.method3714(8919);
            class290.field4097 = var3.method3714(8919);
            class579.method3301(class456.method2711(var4, -2787), true, 0, "");
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIIIII)Z")
    public static final boolean method3203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7774++;
        if (!class578.method3298(arg0, arg7, arg5, 3713)) {
            return false;
        }
        int var10 = class32.field424[1];
        int var11 = class32.field424[2];
        int var12 = class32.field424[0];
        if (!class578.method3298(arg6, arg9, arg1, 3713)) {
            return false;
        }
        int var13 = class32.field424[2];
        int var14 = class32.field424[1];
        int var15 = class32.field424[arg3];
        if (class578.method3298(arg4, arg2, arg8, arg3 + 3713)) {
            int var16 = class32.field424[0];
            int var17 = class32.field424[2];
            int var18 = class32.field424[1];
            return class61.method526(var14, var11, var13, var18, var15, var17, var16, var12, (byte) -126, var10);
        } else {
            return false;
        }
    }
}
