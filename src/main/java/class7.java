import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "[[I")
    public static int[][] field57 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljs;ILhb;Lqh;IIII)V", line = 13)
    public static final void method22(class301 arg0, int arg1, class677 arg2, class61 arg3, int arg4, int arg5, int arg6, int arg7) {
        field55++;
        class389 var8 = new class389();
        var8.field5513 = arg1 << 9;
        var8.field5487 = arg4 << 9;
        var8.field5501 = arg7;
        if (arg0 != null) {
            var8.field5504 = arg0;
            int var9 = arg0.field4109;
            int var10 = arg0.field4119;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg0.field4119;
                var10 = arg0.field4109;
            }
            var8.field5517 = arg0.field4160;
            var8.field5485 = arg4 + var10 << 9;
            var8.field5505 = arg0.field4106 << 9;
            var8.field5515 = arg0.field4174;
            var8.field5496 = arg0.field4148;
            var8.field5494 = arg0.field4172;
            var8.field5514 = arg0.field4183;
            var8.field5483 = arg0.field4146;
            var8.field5495 = arg1 + var9 << 9;
            var8.field5493 = arg0.field4111;
            var8.field5506 = arg0.field4126;
            var8.field5509 = arg0.field4116;
            if (arg0.field4113 != null) {
                var8.field5507 = true;
                var8.method2287(-1536);
            }
            if (var8.field5506 != null) {
                var8.field5511 = (int) (Math.random() * (double) (var8.field5517 - var8.field5509)) + var8.field5509;
            }
            class327.field4437.method1441(var8, 0);
        } else if (arg3 != null) {
            var8.field5484 = arg3;
            class568 var11 = arg3.field674;
            if (var11.field8079 != null) {
                var8.field5507 = true;
                var11 = var11.method3259((byte) 82, class578.field8156);
            }
            if (var11 != null) {
                var8.field5485 = var11.field8041 + arg4 << 9;
                var8.field5495 = var11.field8041 + arg1 << 9;
                var8.field5496 = class402.method2345(arg3, (byte) 112);
                var8.field5483 = var11.field8030;
                var8.field5493 = var11.field8057;
                var8.field5505 = var11.field8037 << 9;
                var8.field5514 = var11.field8029;
                var8.field5515 = var11.field8012;
            }
            class552.field7451.method1441(var8, 0);
        } else if (arg2 != null) {
            var8.field5516 = arg2;
            var8.field5495 = arg1 + arg2.method881(-128) << 9;
            var8.field5485 = arg2.method881(-127) + arg4 << 9;
            var8.field5496 = class92.method669(arg2, 124);
            var8.field5483 = arg2.field9664;
            var8.field5505 = arg2.field9683 << 9;
            var8.field5515 = 256;
            var8.field5493 = arg2.field9676;
            var8.field5514 = 256;
            class122.field1683.method968((long) arg2.field1697, var8, -1);
        }
        if (arg6 < 38) {
            method23(86);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 126)
    public static void method23(int arg0) {
        if (arg0 == 1) {
            field57 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)Z", line = 141)
    public static final boolean method24(byte arg0, int arg1) {
        if (arg0 != 98) {
            method23(-55);
        }
        field56++;
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }
}
