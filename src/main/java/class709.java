import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class709 {

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field9848 = 0;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Z")
    public static boolean field9849;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "[I")
    public static int[] field9851;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V", line = 7)
    public static void method3968(byte arg0) {
        field9851 = null;
        int var1 = -72 / ((arg0 + 68) / 50);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V", line = 22)
    public static final void method3969(byte arg0) {
        field9850++;
        int var1 = class416.field5303;
        int[] var2 = class657.field9155;
        int var3 = 0;
        if (arg0 > -121) {
            field9851 = null;
        }
        while (var1 > var3) {
            class724 var9 = class5.field49[var2[var3]];
            if (var9 != null && var9.field247 > 0) {
                var9.field247--;
                if (var9.field247 == 0) {
                    var9.field214 = null;
                }
            }
            var3++;
        }
        for (int var4 = 0; var4 < class646.field8947; var4++) {
            long var5 = (long) class751.field10483[var4];
            class592 var7 = (class592) class207.field2745.method1160(var5, 121);
            if (var7 != null) {
                class733 var8 = var7.field8280;
                if (var8.field247 > 0) {
                    var8.field247--;
                    if (var8.field247 == 0) {
                        var8.field214 = null;
                    }
                }
            }
        }
    }
}
