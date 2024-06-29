import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class403 {

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public int field6016 = 0;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)I")
    public static final int method2458(int arg0, int arg1, int arg2, int arg3) {
        field6018++;
        if (arg2 > -8) {
            method2458(-101, -126, -114, -9);
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILco;)V")
    public final void method2459(int arg0, class268 arg1) {
        field6017++;
        if (arg0 != 1) {
            this.method2459(93, null);
        }
        while (true) {
            int var3 = arg1.method1738(255);
            if (var3 == 0) {
                return;
            }
            this.method2461(1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class310.field4552[arg0][var8][var14] == -class115.field1893) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class162.field2401) + 1;
            int var10 = (arg3 << class162.field2401) + 2;
            int var11 = class88.field1594[arg0].method694(arg1, arg3) + arg5;
            if (!class599.method3409(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class162.field2401) - 1;
            if (!class599.method3409(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class162.field2401) - 1;
            if (!class599.method3409(var9, var11, var13)) {
                return false;
            } else if (class599.method3409(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class343.method2091(arg0, arg1, arg3)) {
            int var6 = arg1 << class162.field2401;
            int var7 = arg3 << class162.field2401;
            return class599.method3409(var6 + 1, class88.field1594[arg0].method694(arg1, arg3) + arg5, var7 + 1) && class599.method3409(class390.field5828 + var6 - 1, class88.field1594[arg0].method694(arg1 + 1, arg3) + arg5, var7 + 1) && class599.method3409(class390.field5828 + var6 - 1, class88.field1594[arg0].method694(arg1 + 1, arg3 + 1) + arg5, class390.field5828 + var7 - 1) && class599.method3409(var6 + 1, class88.field1594[arg0].method694(arg1, arg3 + 1) + arg5, class390.field5828 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILco;I)V")
    private final void method2461(int arg0, class268 arg1, int arg2) {
        if (arg2 == 5) {
            this.field6016 = arg1.method1745(32132);
        }
        if (arg0 != 1) {
            this.method2459(-58, null);
        }
        field6015++;
    }
}
