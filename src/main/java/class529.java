import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class529 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[I")
    public static int[] field7721 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "F")
    public static float field7722;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 6)
    public static final void method3137(int arg0, String arg1, int arg2) {
        class459.method2765(class434.field6467, (byte) 87);
        class40.field568++;
        field7719++;
        class335.field5062.method1814(class362.method2220(arg1, (byte) -80) + 1, true);
        if (arg2 < 120) {
            method3139(78);
        }
        class335.field5062.method1874(arg0, 128);
        class335.field5062.method1821(arg1, 58);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIB)V", line = 28)
    public static final void method3138(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -128) {
            field7721 = null;
        }
        if (arg3 <= class216.field3415 && class372.field5455 <= arg2) {
            boolean var6;
            if (class467.field6940 > arg4) {
                arg4 = class467.field6940;
                var6 = false;
            } else if (arg4 > class43.field600) {
                var6 = false;
                arg4 = class43.field600;
            } else {
                var6 = true;
            }
            boolean var7;
            if (arg1 < class467.field6940) {
                var7 = false;
                arg1 = class467.field6940;
            } else if (arg1 <= class43.field600) {
                var7 = true;
            } else {
                var7 = false;
                arg1 = class43.field600;
            }
            if (class372.field5455 > arg3) {
                arg3 = class372.field5455;
            } else {
                class503.method3027(arg4, (byte) 127, arg1, arg0, class316.field4797[arg3++]);
            }
            if (arg2 > class216.field3415) {
                arg2 = class216.field3415;
            } else {
                class503.method3027(arg4, (byte) 127, arg1, arg0, class316.field4797[arg2--]);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg2; var8++) {
                    int[] var9 = class316.field4797[var8];
                    var9[arg4] = var9[arg1] = arg0;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg2; var11++) {
                    class316.field4797[var11][arg4] = arg0;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg2; var10++) {
                    class316.field4797[var10][arg1] = arg0;
                }
            }
        }
        field7720++;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 137)
    public static void method3139(int arg0) {
        if (arg0 >= -124) {
            field7721 = null;
        }
        field7721 = null;
    }
}
