import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class317 {

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lwc;")
    public static class49 field4240 = new class49();

    @OriginalMember(owner = "client!td", name = "j", descriptor = "[I")
    public static int[] field4243 = new int[100];

    @OriginalMember(owner = "client!td", name = "i", descriptor = "B")
    public static byte field4242;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1887(int arg0, int arg1, int arg2) {
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        field4235++;
        if (arg0 != 4) {
            return -50;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I", line = 26)
    public final int method1888(byte arg0) {
        if (arg0 >= -11) {
            method1887(24, -44, -11);
        }
        field4236++;
        return this.field4239;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBIII)V", line = 43)
    public static final void method1889(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 10 / ((arg1 - 58) / 36);
        for (int var6 = 0; var6 < class266.field3569; var6++) {
            Rectangle var7 = class331.field4393[var6];
            if (var7.x + var7.width > arg4 && (arg4 + arg3) > var7.x && (var7.y + var7.height) > arg0 && var7.y < (arg0 + arg2)) {
                class442.field6427[var6] = true;
            }
        }
        field4237++;
    }

    @OriginalMember(owner = "client!td", name = "toString", descriptor = "()Ljava/lang/String;", line = 69)
    public final String toString() {
        field4241++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lgb;ILza;Lqr;Lql;III)V", line = 77)
    public static final void method1890(class145 arg0, int arg1, class287 arg2, class48 arg3, class519 arg4, int arg5, int arg6, int arg7) {
        field4234++;
        if (arg5 != -20037) {
            field4243 = null;
        }
        int var8 = arg4.field7645 - arg6 / 2 - 5;
        int var9 = arg1 + 2;
        if (arg3.field528 != 0) {
            arg2.method1717(arg6 + 10, var8, arg1 + (arg7 * arg0.method889() - -1) - var9, arg3.field528, -22794, var9);
        }
        if (arg3.field534 != 0) {
            arg2.method1721(var8, arg0.method889() * arg7 + arg1 + 1 - var9, true, var9, arg3.field534, arg6 + 10);
        }
        int var10 = arg3.field519;
        if (arg4.field7652 && arg3.field497 != -1) {
            var10 = arg3.field497;
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            String var12 = class376.field5103[var11];
            if (var11 < arg7 - 1) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method887(arg2, var12, arg4.field7645, arg1, var10, true);
            arg1 += arg0.method889();
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 120)
    public class317(String arg0, int arg1) {
        this.field4239 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBI)Z", line = 130)
    public static final boolean method1891(int arg0, byte arg1, int arg2) {
        field4238++;
        return arg1 == 68 ? (class93.method520(-120, arg2, arg0) | class207.method1311((byte) -84, arg0, arg2) | class335.method1954(arg0, arg2, arg1 ^ 0x27)) & class302.method1801((byte) 22, arg2, arg0) : true;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 143)
    public static void method1892(int arg0) {
        if (arg0 < 51) {
            method1892(-36);
        }
        field4240 = null;
        field4243 = null;
    }
}
