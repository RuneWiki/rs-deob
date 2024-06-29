import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class423 extends class53 {

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field6246;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Z")
    public static boolean field6247 = false;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lun;")
    public static class291 field6245;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lfs;")
    public static class387 field6244;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIII)Z", line = 3)
    public static final boolean method2589(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class6.field80[arg0][var8][var14] == -class250.field3685) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class527.field7754) + 1;
            int var10 = (arg3 << class527.field7754) + 2;
            int var11 = class131.field1899[arg0].method430(arg1, arg3) + arg5;
            if (!class473.method2861(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class527.field7754) - 1;
            if (!class473.method2861(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class527.field7754) - 1;
            if (!class473.method2861(var9, var11, var13)) {
                return false;
            } else if (class473.method2861(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class518.method3077(arg0, arg1, arg3)) {
            int var6 = arg1 << class527.field7754;
            int var7 = arg3 << class527.field7754;
            return class473.method2861(var6 + 1, class131.field1899[arg0].method430(arg1, arg3) + arg5, var7 + 1) && class473.method2861(class376.field5566 + var6 - 1, class131.field1899[arg0].method430(arg1 + 1, arg3) + arg5, var7 + 1) && class473.method2861(class376.field5566 + var6 - 1, class131.field1899[arg0].method430(arg1 + 1, arg3 + 1) + arg5, class376.field5566 + var7 - 1) && class473.method2861(var6 + 1, class131.field1899[arg0].method430(arg1, arg3 + 1) + arg5, class376.field5566 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 65)
    public static void method2590(int arg0) {
        int var1 = 56 / ((52 - arg0) / 42);
        field6244 = null;
        field6245 = null;
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V", line = 75)
    public final void method2591(int arg0) {
        this.field6246.method2683();
        field6243++;
        if (arg0 != 1) {
            this.method2591(114);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V", line = 90)
    public class423(int arg0) {
        this.field6246 = new NativeHeap(arg0);
    }
}
