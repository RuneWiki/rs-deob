import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class543 {

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public int field7767;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Lig;")
    public static class206 field7768 = new class206(108, 8);

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "Lua;")
    public static class581 field7773 = new class581();

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Lea;")
    public static class474 field7774 = new class474("K", "T", "K", "K");

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field7772;

    static {
        new class474("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)I", line = 5)
    public final int method3153(int arg0) {
        field7769++;
        if (arg0 != 4) {
            method3156(true, true, 18);
        }
        return this.field7767;
    }

    @OriginalMember(owner = "client!oo", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field7772++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lqb;IIILqb;BIIII)V", line = 28)
    public static final void method3154(class191 arg0, int arg1, int arg2, int arg3, class191 arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field7770++;
        int var10 = arg0.method510((byte) 75);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class433 var12 = (class433) class126.field1555.method1801(0, (long) var10);
        if (var12 == null) {
            class372[] var13 = class372.method2393(class319.field4621, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class413.field6264.method388(var13[0], true);
            class126.field1555.method1808((long) var10, var12, (byte) -63);
        }
        class128.method789(arg4.field1768, arg4.field1764, arg9 >> 1, (byte) -106, arg2 >> 1, 0, arg6, arg8, arg4.method1153(true) * 256, arg4.field1757);
        int var14 = arg3 - (18 - class547.field7831[0]);
        int var15 = arg1 + class547.field7831[1] - 16 - 54;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = arg7 % 4 * 18 + var15;
        var12.method2706(var16, var17);
        if (arg0 == arg4) {
            class413.field6264.method3523(true, 18, var17 - 1, 18, -256, var16 - 1);
        }
        class171 var18 = class109.method680((byte) 108);
        var18.field2104 = var17 + 16;
        var18.field2109 = arg0;
        var18.field2112 = var16 + 16;
        if (arg5 == 102) {
            var18.field2110 = var16;
            var18.field2108 = var17;
            class1.field1.method3293(var18, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V", line = 84)
    public static void method3155(int arg0) {
        field7768 = null;
        if (arg0 != -21188) {
            field7768 = null;
        }
        field7773 = null;
        field7774 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZZI)V", line = 98)
    public static final void method3156(boolean arg0, boolean arg1, int arg2) {
        field7771++;
        class594 var3 = class581.method3372(arg0, arg2, -105);
        if (var3 == null) {
            return;
        }
        if (arg1) {
            field7774 = null;
        }
        for (int var4 = 0; var4 < var3.field8680.length; var4++) {
            var3.field8680[var4] = -1;
            var3.field8676[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 127)
    public class543(String arg0, int arg1) {
        this.field7767 = arg1;
    }
}
