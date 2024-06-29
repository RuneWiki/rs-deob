import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class458 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field6615 = 0;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBIII[B)V", line = 4)
    public static final void method2677(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field6614++;
        if (arg3 >= arg0) {
            return;
        }
        int var6 = arg0 - arg3 >> 2;
        int var7 = arg2 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg0 - arg3 & 0x3;
                if (arg1 <= 118) {
                    field6615 = 48;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var7++] = 1;
                }
            }
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
            arg5[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method2678(byte arg0, int arg1) {
        field6616++;
        class489 var2 = class704.method3942(arg1, 6, 0);
        var2.method2799(-70);
        if (arg0 != 1) {
            field6615 = 76;
        }
    }
}
