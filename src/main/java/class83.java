import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class83 extends class5 {

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1215 = 2;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field1216 = "Created gameworld";

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static volatile int field1221 = 0;

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "J")
    public static long field1224 = 0L;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public int field1218;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "[Lmn;")
    public static class161[] field1219;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V", line = 4)
    public static void method634(int arg0) {
        field1219 = null;
        if (arg0 != 1027) {
            field1224 = -30L;
        }
        field1216 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lkk;ILth;IIILqh;I)V", line = 35)
    public static final void method635(class76 arg0, int arg1, class270 arg2, int arg3, int arg4, int arg5, class32 arg6, int arg7) {
        field1217++;
        class239 var8 = new class239();
        var8.field3637 = arg1 * 128;
        int var9 = -122 / ((arg3 - 40) / 56);
        var8.field3638 = arg7 * 128;
        var8.field3640 = arg5;
        if (arg6 != null) {
            var8.field3649 = arg6.field471;
            var8.field3643 = arg6.field481;
            var8.field3634 = arg6;
            var8.field3631 = arg6.field447;
            var8.field3648 = arg6.field414;
            int var11 = arg6.field413;
            var8.field3644 = arg6.field445;
            int var12 = arg6.field416;
            var8.field3645 = arg6.field460 * 128;
            if (arg4 == 1 || arg4 == 3) {
                var12 = arg6.field413;
                var11 = arg6.field416;
            }
            var8.field3651 = (arg1 + var12) * 128;
            var8.field3650 = (arg7 + var11) * 128;
            if (arg6.field450 != null) {
                var8.field3652 = true;
                var8.method1665(-90);
            }
            if (var8.field3631 != null) {
                var8.field3647 = (int) (Math.random() * (double) (var8.field3648 - var8.field3643)) + var8.field3643;
            }
            class108.field1590.method1952(var8, 126);
        } else if (arg0 != null) {
            var8.field3630 = arg0;
            class332 var10 = arg0.field1104;
            if (var10.field5162 != null) {
                var8.field3652 = true;
                var10 = var10.method2324((byte) -127);
            }
            if (var10 != null) {
                var8.field3651 = (var10.field5181 + arg1) * 128;
                var8.field3650 = (var10.field5181 + arg7) * 128;
                var8.field3644 = class114.method876(-111, arg0);
                var8.field3649 = var10.field5161;
                var8.field3645 = var10.field5135 * 128;
            }
            class294.field4534.method1952(var8, -82);
        } else if (arg2 != null) {
            var8.field3636 = arg2;
            var8.field3651 = (arg2.method1897(8) + arg1) * 128;
            var8.field3650 = (arg7 + arg2.method1897(8)) * 128;
            var8.field3644 = class87.method647(1, arg2);
            var8.field3645 = arg2.field4190 * 128;
            var8.field3649 = arg2.field4225;
            class173.field2788.method1708(class49.method374(arg2.field4218, -1), (byte) -79, var8);
        }
    }
}
