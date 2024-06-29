import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class59 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "J")
    public static long field762 = -1L;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Lmo;")
    public static class447 field760;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZ)Lnj;", line = 6)
    public static final class132 method387(int arg0, boolean arg1) {
        field763++;
        class132 var2 = (class132) class196.field3181.method331((byte) 69, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class441.field6454.method2771(29, arg0, 3);
        class132 var4 = new class132();
        if (var3 != null) {
            var4.method968(116, new class186(var3), arg0);
        }
        class196.field3181.method341(54, (long) arg0, var4);
        if (!arg1) {
            field760 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 44)
    public static void method388(int arg0) {
        field760 = null;
        if (arg0 != 0) {
            method388(22);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIB)V", line = 58)
    public static final void method389(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field759++;
        for (int var5 = 0; var5 < class125.field1929; var5++) {
            Rectangle var6 = class119.field1631[var5];
            if (var6.x + var6.width > arg2 && (arg2 + arg3) > var6.x && arg0 < var6.y + var6.height && arg0 + arg1 > var6.y) {
                class267.field4296[var5] = true;
            }
        }
        if (arg4 >= -55) {
            method389(-29, 44, 25, 17, (byte) -87);
        }
    }
}
