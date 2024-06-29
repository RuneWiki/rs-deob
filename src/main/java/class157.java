import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class157 {

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public int field2444;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    private int field2433;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "B")
    public byte field2441;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Lou;")
    public class157 field2428;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIII)Lou;", line = 11)
    public final class157 method1174(int arg0, int arg1, int arg2, int arg3) {
        field2434++;
        if (arg0 != 1) {
            this.field2429 = 81;
        }
        return new class157(this.field2433, arg1, arg3, arg2, this.field2441);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILha;IILjl;I)V", line = 36)
    public static final void method1175(int arg0, class544 arg1, int arg2, int arg3, class595 arg4, int arg5) {
        field2440++;
        class308 var6 = class629.field8840.method3852(arg4.field8444, true);
        if (var6.field4653 == -1) {
            return;
        }
        int var8;
        if (arg4.field8412) {
            int var7 = arg4.field8373 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class34 var9 = var6.method2038(var8, arg4.field8410, (byte) 59, arg1);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field8384;
        int var11 = arg4.field8429;
        if ((var8 & arg5) == 1) {
            var10 = arg4.field8429;
            var11 = arg4.field8384;
        }
        int var12 = var9.method177();
        int var13 = var9.method184();
        if (var6.field4662) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field4655 == 0) {
            var9.method187(arg3, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method191(arg3, arg2 - (var11 - 1) * 4, var12, var13, 0, var6.field4655 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)Lvfa;", line = 91)
    public final class88 method1176(int arg0) {
        if (arg0 == 1) {
            field2442++;
            return class31.method160(arg0 + 100, this.field2433);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 102)
    public static final void method1177(String arg0, int arg1, String arg2, String arg3, String arg4, int arg5, int arg6) {
        field2426++;
        class487.method2961(arg4, arg6, -1, null, -100, arg1, arg2, arg0, arg3);
        if (arg5 != 1) {
            field2437 = 54;
        }
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIB)V", line = 116)
    public class157(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field2429 = arg3;
        this.field2432 = arg2;
        this.field2444 = arg1;
        this.field2433 = arg0;
        this.field2441 = arg4;
    }
}
