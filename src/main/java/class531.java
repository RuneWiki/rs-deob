import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class531 implements class653 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public int field7445;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field7446;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field7447;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field7448;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field7449;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field7450;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field7451;

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(I)V")
    public class531(int arg0) {
        this.field7445 = arg0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILsw;)V")
    public static final void method3028(int arg0, int arg1, int arg2, class701 arg3) {
        class40 var4 = class151.method1065(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field663 = arg3;
        int var5 = class499.field7071 == class296.field4340 ? 1 : 0;
        if (arg3.method1181(-1)) {
            if (arg3.method1184(-116)) {
                class232.field3618[var5][class59.field1130[var5]++] = arg3;
                return;
            }
            class496.field7034[var5][class313.field4626[var5]++] = arg3;
            return;
        }
        class471.field6741[var5][class127.field1896[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Lcp;")
    public static final class674 method3029(int arg0, int arg1, int arg2) {
        if (arg0 <= 80) {
            field7449 = 51;
        }
        field7450++;
        class674 var3 = new class674();
        var3.field9543 = arg2 + 6;
        var3.field9539 = arg1 + 6;
        var3.field9538 = -1;
        var3.field9541 = -1;
        var3.field9532 = new int[var3.field9543][var3.field9539];
        var3.method3749(false);
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Lrw;")
    public final class703 method351(byte arg0) {
        field7448++;
        if (arg0 < 73) {
            this.method351((byte) 49);
        }
        return class701.field9907;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIII)I")
    public static final int method3030(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        field7447++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (~var7 == arg0) {
            return arg3;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg3 - arg5;
        } else {
            return (1 - arg6) + 7 - arg4;
        }
    }
}
