import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class552 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "[I")
    public static int[] field8227 = new int[4096];

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "[I")
    public static int[] field8228 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 10)
    public static void method3339(int arg0) {
        field8227 = null;
        if (arg0 != 12148) {
            method3341(true, 111, 25);
        }
        field8228 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lqa;Lco;III)V", line = 25)
    public static final void method3340(class208 arg0, class102 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class145.field2083) {
            class205 var5 = class420.field5697[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3045 != null && var5.field3045.method180((byte) 58)) {
                arg1.method182(arg0, 0, true, class96.field1409, 0, var5.field3045, 21130);
            }
        }
        if (arg4 < class145.field2083) {
            class205 var6 = class420.field5697[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3045 != null && var6.field3045.method180((byte) 58)) {
                arg1.method182(arg0, 0, true, 0, class96.field1409, var6.field3045, 21130);
            }
        }
        if (arg3 < class145.field2083 && arg4 < class384.field5282) {
            class205 var7 = class420.field5697[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3045 != null && var7.field3045.method180((byte) 58)) {
                arg1.method182(arg0, 0, true, class96.field1409, class96.field1409, var7.field3045, 21130);
            }
        }
        if (arg3 < class145.field2083 && arg4 > 0) {
            class205 var8 = class420.field5697[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3045 != null && var8.field3045.method180((byte) 58)) {
                arg1.method182(arg0, 0, true, class96.field1409, -class96.field1409, var8.field3045, 21130);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZII)Z", line = 71)
    public static final boolean method3341(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field8228 = null;
        }
        field8229++;
        return (arg2 & 0x400) != 0;
    }
}
