import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class492 {

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[F")
    public static float[] field7166 = new float[4];

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field7167;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lqn;")
    public static class47 field7163;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 5)
    public static final void method2983(int arg0, int arg1, int arg2) {
        if (arg2 != -4007) {
            method2988(null, 36);
        }
        field7165++;
        class153 var3 = class75.method656(6, 255, arg0);
        var3.method1003((byte) 116);
        var3.field1933 = arg1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 19)
    public static final void method2984(byte arg0) {
        class367.method2104(98);
        if (arg0 != -72) {
            field7163 = null;
        }
        field7168++;
        class166.method1076(class407.field5817.field3620, 22050, 2, 2);
        class347.field4463 = class516.method3084(22050, class219.field2794, class8.field71, (byte) -99, 0);
        class347.field4463.method76(class293.field3757, arg0 ^ 0x2AB3);
        class407.field5820 = class516.method3084(2048, class219.field2794, class8.field71, (byte) -70, 1);
        class407.field5820.method76(class113.field1506, -10997);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)I", line = 37)
    public static final int method2985(boolean arg0, int arg1, int arg2) {
        field7164++;
        if (arg0) {
            method2987(32);
        }
        return arg1 == 4 || arg1 == 5 ? class264.field3331[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 51)
    public static final void method2986(int arg0) {
        int var1 = 0;
        if (arg0 > -98) {
            return;
        }
        while (var1 < class371.field4797.length) {
            for (int var2 = 0; var2 < class371.field4797[var1].length; var2++) {
                class371.field4797[var1][var2] = class105.field1334;
            }
            var1++;
        }
        field7169++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V", line = 78)
    public static void method2987(int arg0) {
        field7163 = null;
        field7166 = null;
        if (arg0 != 22239) {
            method2984((byte) 127);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lwg;I)V", line = 97)
    public static final void method2988(class295 arg0, int arg1) {
        field7167++;
        for (class433 var2 = (class433) class149.field1884.method153(arg1); var2 != null; var2 = (class433) class149.field1884.method161(-121)) {
            if (var2.field6139 == arg0) {
                if (var2.field6148 != null) {
                    class113.field1506.method2532(var2.field6148);
                    var2.field6148 = null;
                }
                var2.method2165(16225);
                return;
            }
        }
    }
}
