import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 {

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "Lwo;")
    public static class690 field627 = new class690(67, 8);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Luq;")
    public class145 field628;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method388(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 7) {
            method388(-111, 92, -31, -105);
        }
        field629++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lha;III[Z)Z", line = 26)
    public static final boolean method389(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class340.field4500 != class155.field1899) {
            int var6 = class399.field5631[arg1].method428(true, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class37 var8 = class399.field5631[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method428(true, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method427(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method429(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 65)
    public static void method390(int arg0) {
        if (arg0 != 0) {
            field627 = null;
        }
        field627 = null;
    }
}
