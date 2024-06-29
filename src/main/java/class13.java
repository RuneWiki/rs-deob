import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 {

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field158 = new Hashtable();

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method69(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field155++;
        if (!class186.field2665 || !class491.field6993) {
            return false;
        } else if (class671.field9405 < 100) {
            return false;
        } else if (arg1 != arg5 || arg0 != arg3) {
            for (int var9 = arg1; var9 <= arg5; var9++) {
                for (int var12 = arg3; var12 <= arg0; var12++) {
                    if (class159.field2370[arg2][var9][var12] == -class335.field4737) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << class440.field6142) + 1;
            int var11 = (arg3 << class440.field6142) + 2;
            if (class151.method1164((arg0 + 1 - arg3) * class546.field7701, var10, -29, class138.field2153[arg2].method1825(arg3, -128, arg1), (arg5 + arg4 - arg1) * class546.field7701, var11, arg6)) {
                class503.field7188++;
                return true;
            } else {
                return false;
            }
        } else if (class675.method3817(arg2, 1, arg3, arg1)) {
            int var7 = arg1 << class440.field6142;
            int var8 = arg3 << class440.field6142;
            if (class151.method1164(class546.field7701, var7, 112, class138.field2153[arg2].method1825(arg3, -128, arg1), class546.field7701, var8, arg6)) {
                class503.field7188++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method70(int arg0) {
        if (arg0 != 13) {
            method70(-24);
        }
        field158 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIILha;IIILbj;IIB)V")
    public static final void method71(int arg0, int arg1, int arg2, int arg3, class58 arg4, int arg5, int arg6, int arg7, class241 arg8, int arg9, int arg10, byte arg11) {
        field157++;
        if (arg3 > arg2 && (arg0 + arg2) > arg3 && arg1 - 13 < arg5 && (arg1 + 3) > arg5) {
            arg9 = arg10;
        }
        int var12 = 115 % ((arg11 - 43) / 45);
        String var13 = class181.method1299(80, arg8);
        class537.field7568.method664(arg9, 0, arg2 + 3, arg1, var13, class698.field9810, class610.field8827, 127);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IZZIIILoea;)Lm;")
    public static final class189 method72(int arg0, int[] arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, class594 arg7) {
        if (arg2) {
            field158 = null;
        }
        field156++;
        if (!arg7.field8644 && (!class278.method1826((byte) 127, arg5) || !class278.method1826((byte) 121, arg0))) {
            return arg7.field8587 ? new class189(arg7, 34037, arg5, arg0, arg3, arg1, arg6, arg4) : new class189(arg7, arg5, arg0, class613.method3530(false, arg5), class613.method3530(arg2, arg0), arg1);
        } else {
            return new class189(arg7, 3553, arg5, arg0, arg3, arg1, arg6, arg4);
        }
    }
}
