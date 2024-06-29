import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class287 {

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field4137 = 0;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public int field4143;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "Lwd;")
    public static class179 field4139;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method1822(int arg0) {
        if (arg0 != 7559) {
            field4145 = 0;
        }
        field4139 = null;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Let;Ljava/lang/String;ZZI)V")
    public static final void method1823(class419 arg0, String arg1, boolean arg2, boolean arg3, int arg4) {
        field4147++;
        int var5 = -104 / ((-arg4 - 16) / 33);
        if (!arg3) {
            class82.method739(arg0, 3, arg1, 120);
            return;
        }
        if (class419.field6189.startsWith("win") && class419.field6188 != 3) {
            String var6 = null;
            if (arg0.field6180 != null) {
                var6 = arg0.field6180.getParameter("haveie6");
            }
            if (var6 == null || !var6.equals("1")) {
                class449 var7 = class82.method739(arg0, 0, arg1, 122);
                class47.field518 = arg1;
                class520.field7647 = var7;
                class183.field2584 = arg0;
                return;
            }
        }
        if (class419.field6189.startsWith("mac")) {
            String var8 = null;
            if (arg0.field6180 != null) {
                var8 = arg0.field6180.getParameter("havefirefox");
            }
            if (var8 != null && var8.equals("1") && arg2) {
                class82.method739(arg0, 1, arg1, 118);
                return;
            }
        }
        class82.method739(arg0, 2, arg1, 127);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILjava/lang/String;IIILla;ILuu;IILgt;Lma;)V")
    public static final void method1824(int arg0, String arg1, int arg2, int arg3, int arg4, class314 arg5, int arg6, class188 arg7, int arg8, int arg9, class316 arg10, class10 arg11) {
        field4146++;
        int var12;
        if (class462.field6802 == 4) {
            var12 = (int) class328.field4588 & 0x3FFF;
        } else {
            var12 = (int) class328.field4588 + class455.field6702 & 0x3FFF;
        }
        int var13 = Math.max(arg7.field2711 / 2, arg7.field2672 / 2) + 10;
        int var14 = arg3 * arg3 + arg8 * arg8;
        if (arg2 != 3 || var14 > var13 * var13) {
            return;
        }
        int var15 = class340.field4724[var12];
        int var16 = class340.field4715[var12];
        if (class462.field6802 != 4) {
            var16 = var16 * 256 / (class465.field6839 + 256);
            var15 = var15 * 256 / (class465.field6839 + 256);
        }
        int var17 = arg8 * var15 + (arg3 * var16) >> 15;
        int var18 = arg8 * var16 - arg3 * var15 >> 15;
        int var19 = arg10.method1978((byte) 73, arg1, 100, null);
        int var20 = arg10.method1974(arg1, 100, -1, null, 0);
        int var21 = var17 - var19 / 2;
        if ((-arg7.field2711) <= var21 && var21 <= arg7.field2711 && var18 >= -arg7.field2672 && var18 <= arg7.field2672) {
            arg5.method1963(0, arg6, null, arg0, 1, arg11, arg7.field2672 / 2 + arg6 - var18 - arg4 - var20, var21 - -arg0 - -(arg7.field2711 / 2), 0, 0, 50, var19, arg9, 0, arg1, null);
        }
    }

    static {
        new class331(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        field4145 = 0;
    }
}
