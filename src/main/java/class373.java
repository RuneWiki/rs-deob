import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class373 {

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field4707 = 0;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field4709 = 0;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "Lae;")
    public static class40 field4705;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "Lvm;")
    public static class426 field4703;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field4704;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4708;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 10)
    public static void method2031(int arg0) {
        field4704 = null;
        field4703 = null;
        field4708 = null;
        if (arg0 > -27) {
            field4705 = null;
        }
        field4705 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 27)
    public static final void method2032(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class66.method393(var3.field1030);
        class66.method393(var3.field1026);
        if (var3.field1030 != null) {
            var3.field1030 = null;
        }
        if (var3.field1026 != null) {
            var3.field1026 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([IBLac;I)V", line = 42)
    public static final void method2033(int[] arg0, byte arg1, class307 arg2, int arg3) {
        if (arg2.field9691 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field9691.length; var5++) {
                if (arg2.field9691[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field9689 != -1) {
                class395 var6 = class583.field8149.method1844(64, arg2.field9689);
                int var7 = var6.field4970;
                if (var7 == 1) {
                    arg2.field9661 = 1;
                    arg2.field9698 = 0;
                    arg2.field9725 = 0;
                    arg2.field9731 = arg3;
                    arg2.field9741 = 0;
                    class192.method1159(arg2.field6470, var6, arg2.field6461, arg2.field6464, 69, arg2.field9741, false);
                }
                if (var7 == 2) {
                    arg2.field9698 = 0;
                }
            }
        }
        field4706++;
        if (arg1 > -119) {
            return;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg2.field9691 == null || arg2.field9691[var9] == -1 || class583.field8149.method1844(64, arg0[var9]).field4983 >= class583.field8149.method1844(64, arg2.field9691[var9]).field4983) {
                arg2.field9753 = arg2.field9756;
                arg2.field9691 = arg0;
                arg2.field9731 = arg3;
            }
        }
        if (var8) {
            arg2.field9731 = arg3;
            arg2.field9691 = arg0;
            arg2.field9753 = arg2.field9756;
        }
    }
}
