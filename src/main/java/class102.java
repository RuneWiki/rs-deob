import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class102 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Z")
    public static boolean field1669 = false;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lrk;")
    public static class270 field1670 = new class270(128);

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[[[B")
    public static byte[][][] field1672;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLmg;Lqh;Lqh;)V")
    public static final void method749(byte arg0, class265 arg1, class201 arg2, class201 arg3) {
        class203.field3254 = arg3;
        if (arg0 != -108) {
            return;
        }
        class143.field2310 = arg2;
        field1671++;
        class212.field3467 = arg1;
        if (class143.field2310 != null) {
            class75.field1212 = class143.field2310.method1361(1, -30);
        }
        if (class203.field3254 != null) {
            class270.field4260 = class203.field3254.method1361(1, arg0 + 40);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method750(int arg0) {
        if (arg0 == -29865) {
            field1672 = null;
            field1670 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILik;JLik;Lik;)V")
    public static final void method751(int arg0, int arg1, int arg2, int arg3, class260 arg4, long arg5, class260 arg6, class260 arg7) {
        class235 var9 = new class235();
        var9.field3828 = arg4;
        var9.field3824 = arg1 * 128 + 64;
        var9.field3832 = arg2 * 128 + 64;
        var9.field3840 = arg3;
        var9.field3839 = arg5;
        var9.field3823 = arg6;
        var9.field3827 = arg7;
        int var10 = 0;
        class134 var11 = class288.field4563[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field2151; var12++) {
                class289 var13 = var11.field2153[var12];
                if ((var13.field4574 & 0x400000L) == 4194304L) {
                    int var14 = var13.field4581.method119();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3833 = -var10;
        if (class288.field4563[arg0][arg1][arg2] == null) {
            class288.field4563[arg0][arg1][arg2] = new class134(arg0, arg1, arg2);
        }
        class288.field4563[arg0][arg1][arg2].field2149 = var9;
    }
}
