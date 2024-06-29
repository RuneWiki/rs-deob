import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class49 extends class81 {

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public int field1119 = 0;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "J")
    public static long field1112 = 0L;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Lsg;")
    private static class30 field1113 = class167.method1221((byte) 33, " has logged out)3");

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "Z")
    public static boolean field1114 = false;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "Lsg;")
    public static class30 field1116 = class167.method1221((byte) 33, "Loading world list data");

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "Lsg;")
    public static class30 field1120 = class167.method1221((byte) 33, ")3");

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Lsg;")
    public static class30 field1109 = field1113;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "Llk;")
    public static class232 field1111 = new class232(100);

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1117++;
        class202 var10 = null;
        for (class202 var11 = (class202) class41.field1024.method478(arg6 ^ arg6); var11 != null; var11 = (class202) class41.field1024.method476((byte) 13)) {
            if (var11.field3605 == arg5 && var11.field3616 == arg3 && var11.field3596 == arg9 && var11.field3609 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class202();
            var10.field3616 = arg3;
            var10.field3605 = arg5;
            var10.field3596 = arg9;
            var10.field3609 = arg7;
            class81.method700(var10, (byte) -118);
            class41.field1024.method477(var10, (byte) 6);
        }
        var10.field3612 = arg4;
        var10.field3614 = arg1;
        var10.field3604 = arg2;
        var10.field3618 = arg8;
        var10.field3617 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Laa;I)V")
    public final void method484(class8 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method63((byte) 77);
            if (var3 == 0) {
                if (arg1 <= 78) {
                    return;
                }
                field1108++;
                return;
            }
            this.method487(arg0, 14367, var3);
        }
    }

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "(I)V")
    public static void method485(int arg0) {
        field1116 = null;
        field1120 = null;
        field1113 = null;
        if (arg0 == 0) {
            field1111 = null;
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != -28637) {
            method485(-3);
        }
        field1115++;
        int var9 = arg4 - arg2;
        int var10 = arg1 - arg7;
        int var11 = (arg5 - arg3 << 16) / var9;
        int var12 = (arg0 - arg6 << 16) / var10;
        class99.method806(arg7, var11, arg6, arg2, 0, arg1, arg3, 0, arg4, var12, 112);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Laa;II)V")
    private final void method487(class8 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field1119 = arg0.method65((byte) 122);
        }
        field1110++;
        if (arg1 != 14367) {
            this.field1119 = 110;
        }
    }
}
