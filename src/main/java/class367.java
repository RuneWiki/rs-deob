import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class367 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "Z")
    public static boolean field4833 = false;

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)Z")
    public static final boolean method2128(int arg0, int arg1) {
        field4836++;
        if (arg0 != 65280) {
            field4833 = false;
        }
        return arg1 == 7 || arg1 == 8 || arg1 == 9;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Z[BIBIILag;I)Lck;")
    public static final class8 method2129(boolean arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5, class469 arg6, int arg7) {
        field4834++;
        if (arg3 < 81) {
            method2131(118, -22, -21);
        }
        if (!arg6.field6462 && (!class355.method2093(arg2, 1) || !class355.method2093(arg4, 1))) {
            return arg6.field6459 ? new class8(arg6, 34037, arg7, arg2, arg4, arg0, arg1, arg5) : new class8(arg6, arg7, arg2, arg4, class385.method2206(0, arg2), class385.method2206(0, arg4), arg1, arg5);
        } else {
            return new class8(arg6, 3553, arg7, arg2, arg4, arg0, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(III)I")
    public static final int method2130(int arg0, int arg1, int arg2) {
        field4838++;
        if (arg1 == 34037) {
            int var3 = arg2 >>> 24;
            int var4 = ((arg2 & 0xFF00) * var3 & 0xFF0000 | (arg2 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            int var5 = 255 - var3;
            return (((arg0 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg0 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(III)V")
    public static final void method2131(int arg0, int arg1, int arg2) {
        field4835++;
        if (class60.method341(arg0, 0) && arg2 == -1156546040) {
            class211.method1336((byte) 80, class124.field1729[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!rp", name = "b", descriptor = "(II)Z")
    public static final boolean method2132(int arg0, int arg1) {
        field4837++;
        for (class354 var2 = (class354) class101.field1211.method2506(68); var2 != null; var2 = (class354) class101.field1211.method2505(-115)) {
            if (class258.method1561(var2.field4729, arg0 ^ 0xFFFF0092) && ((long) arg1) == var2.field4723) {
                return true;
            }
        }
        if (arg0 != 65280) {
            field4833 = true;
        }
        return false;
    }
}
