import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class200 {

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3428 = 0;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lsb;")
    private static class98 field3434 = class47.method368("green:", 0);

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3435 = -1;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Lsb;")
    public static class98 field3429 = field3434;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "Lsb;")
    public static class98 field3433 = field3434;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIILsc;IJIIII)Z")
    public static final boolean method1361(int arg0, int arg1, int arg2, int arg3, class119 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class150.method1111(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(JI)Lsb;")
    public static final class98 method1362(long arg0, int arg1) {
        class173.field3035.setTime(new Date(arg0));
        int var3 = class173.field3035.get(7);
        field3431++;
        int var4 = class173.field3035.get(5);
        int var5 = class173.field3035.get(2);
        if (arg1 <= 97) {
            method1362(57L, 5);
        }
        int var6 = class173.field3035.get(1);
        int var7 = class173.field3035.get(11);
        int var8 = class173.field3035.get(12);
        int var9 = class173.field3035.get(13);
        return class186.method1288(new class98[] { class107.field1917[var3 - 1], class178.field3093, class125.method930(25904, var4 / 10), class125.method930(25904, var4 % 10), class56.field891, class59.field963[var5], class56.field891, class125.method930(25904, var6), class118.field2118, class125.method930(25904, var7 / 10), class125.method930(25904, var7 % 10), class120.field2178, class125.method930(25904, var8 / 10), class125.method930(25904, var8 % 10), class120.field2178, class125.method930(25904, var9 / 10), class125.method930(25904, var9 % 10), class122.field2236 }, 31618);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public static void method1363(byte arg0) {
        field3433 = null;
        field3429 = null;
        field3434 = null;
        if (arg0 < 3) {
            method1362(-98L, 46);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
    public static final int method1364(int arg0, int arg1, int arg2) {
        field3432++;
        class56 var3 = (class56) class211.field3609.method1511((byte) -123, (long) arg2);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 != -6546) {
                method1363((byte) -46);
            }
            return arg0 >= 0 && var3.field893.length > arg0 ? var3.field893[arg0] : -1;
        }
    }
}
