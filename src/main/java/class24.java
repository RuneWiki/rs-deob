import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Ljava/lang/String;")
    public static String field384 = "";

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIII)I", line = 3)
    public static final int method178(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1866846296) {
            method180(false, -45, -42);
        }
        field386++;
        int var4 = 255 - arg1;
        int var5 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg0 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 20)
    public static void method179(byte arg0) {
        if (arg0 != 74) {
            method180(true, -59, 103);
        }
        field384 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZII)Z", line = 35)
    public static final boolean method180(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        }
        field385++;
        class132 var3 = class82.field1154.method2121(arg1, true);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method866(arg2, (byte) 115);
    }
}
