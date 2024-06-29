import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class145 extends class266 {

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Llf;")
    public class92 field2100;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIZF)[[I", line = 6)
    public static final int[][] method918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, float arg8) {
        field2099++;
        int[][] var9 = new int[arg0][arg6];
        class156 var10 = new class156();
        var10.field2321 = arg1;
        var10.field2330 = arg2;
        var10.field2319 = arg3;
        var10.field2326 = (int) (arg8 * 4096.0F);
        var10.field2312 = arg7;
        var10.method111(-55);
        class138.method898(16828, arg0, arg6);
        for (int var11 = arg4; var11 < arg0; var11++) {
            var10.method1003(var9[var11], (byte) 122, var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V", line = 38)
    public static final void method919(byte arg0) {
        field2098++;
        if (arg0 > 121) {
            class264.method1814(0, 0, (byte) 51);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Llf;)V", line = 52)
    public class145(class92 arg0) {
        this.field2100 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZIIII)V", line = 72)
    public static final void method920(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field2101++;
        int var6 = arg3;
        if (!arg1) {
            field2104 = -17;
        }
        while (var6 <= (arg3 + arg2)) {
            for (int var7 = arg0; var7 <= arg0 + arg4; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class37.field583[arg5][var7][var6] = 127;
                }
            }
            var6++;
        }
        for (int var8 = arg3; var8 < (arg3 + arg2); var8++) {
            for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class208.field3304[arg5][var9][var8] = arg5 > 0 ? class208.field3304[arg5 - 1][var9][var8] : 0;
                }
            }
        }
        if (arg0 > 0 && arg0 < 104) {
            for (int var10 = arg3 + 1; var10 < arg2 + arg3; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class208.field3304[arg5][arg0][var10] = class208.field3304[arg5][arg0 - 1][var10];
                }
            }
        }
        if (arg3 > 0 && arg3 < 104) {
            for (int var11 = arg0 + 1; var11 < arg0 + arg4; var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class208.field3304[arg5][var11][arg3] = class208.field3304[arg5][var11][arg3 - 1];
                }
            }
        }
        if (arg0 < 0 || arg3 < 0 || arg0 >= 104 || arg3 >= 104) {
            return;
        }
        if (arg5 == 0) {
            if (arg0 > 0 && class208.field3304[arg5][arg0 - 1][arg3] != 0) {
                class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0 - 1][arg3];
            } else if (arg3 > 0 && class208.field3304[arg5][arg0][arg3 - 1] != 0) {
                class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0][arg3 - 1];
            } else if (arg0 > 0 && arg3 > 0 && class208.field3304[arg5][arg0 - 1][arg3 - 1] != 0) {
                class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0 - 1][arg3 - 1];
            }
        } else if (arg0 > 0 && class208.field3304[arg5][arg0 - 1][arg3] != class208.field3304[arg5 - 1][arg0 - 1][arg3]) {
            class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0 - 1][arg3];
        } else if (arg3 > 0 && class208.field3304[arg5][arg0][arg3 - 1] != class208.field3304[arg5 - 1][arg0][arg3 - 1]) {
            class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && class208.field3304[arg5][arg0 - 1][arg3 - 1] != class208.field3304[arg5 - 1][arg0 - 1][arg3 - 1]) {
            class208.field3304[arg5][arg0][arg3] = class208.field3304[arg5][arg0 - 1][arg3 - 1];
        }
    }
}
