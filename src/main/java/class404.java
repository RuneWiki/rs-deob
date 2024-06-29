import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class404 {

    @OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
    public static int field5370 = 0;

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "I")
    public static int field5372 = 0;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
    public static int field5368 = -50;

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "I")
    public static int field5371 = 0;

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIIIBII)V", line = 4)
    public static final void method2358(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field5369++;
        for (class38 var7 = (class38) class21.field195.method857(-76); var7 != null; var7 = (class38) class21.field195.method864(true)) {
            if (var7.field425 <= class693.field8900) {
                var7.method3306(false);
            } else {
                class122.method726(false, (var7.field421 << 9) + 256, (var7.field424 << 9) + 256, var7.field432 * 2, arg5, arg0, arg2 >> 1, var7.field429, arg3 >> 1);
                class595.field7562.method2427(var7.field427, arg6 + class128.field1716[1], 122, class128.field1716[0] + arg1, 0, var7.field428 | 0xFF000000);
            }
        }
        int var8 = 107 % ((arg4 - 59) / 54);
    }
}
