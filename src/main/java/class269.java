import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class269 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method1645(boolean arg0) {
        class207.method1319(64, arg0);
        field3422++;
        if (class514.field7145 >= 0 && class514.field7145 != 0) {
            class293.method1796(class514.field7145, (byte) 59);
            class514.field7145 = -1;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class406.field5575[arg0][var8][var14] == -class642.field9327) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class400.field5480) + 1;
            int var10 = (arg3 << class400.field5480) + 2;
            int var11 = class501.field6947[arg0].method1031(arg1, arg3) + arg5;
            if (!class155.method836(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class400.field5480) - 1;
            if (!class155.method836(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class400.field5480) - 1;
            if (!class155.method836(var9, var11, var13)) {
                return false;
            } else if (class155.method836(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class250.method1528(arg0, arg1, arg3)) {
            int var6 = arg1 << class400.field5480;
            int var7 = arg3 << class400.field5480;
            return class155.method836(var6 + 1, class501.field6947[arg0].method1031(arg1, arg3) + arg5, var7 + 1) && class155.method836(class456.field6523 + var6 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg3) + arg5, var7 + 1) && class155.method836(class456.field6523 + var6 - 1, class501.field6947[arg0].method1031(arg1 + 1, arg3 + 1) + arg5, class456.field6523 + var7 - 1) && class155.method836(var6 + 1, class501.field6947[arg0].method1031(arg1, arg3 + 1) + arg5, class456.field6523 + var7 - 1);
        } else {
            return false;
        }
    }
}
