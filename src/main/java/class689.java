import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class689 {

    @OriginalMember(owner = "client!jka", name = "b", descriptor = "I")
    public int field9557 = -1;

    @OriginalMember(owner = "client!jka", name = "h", descriptor = "I")
    public int field9563 = -1;

    @OriginalMember(owner = "client!jka", name = "e", descriptor = "Lfja;")
    public static class783 field9560 = new class783(79, -1);

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!jka", name = "c", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!jka", name = "f", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!jka", name = "g", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!jka", name = "d", descriptor = "[I")
    public int[] field9559;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILha;IIIIII)V")
    public static final void method3865(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class369.field5000 = arg1;
        field9561++;
        class282.field3918 = class369.field5000.method565();
        class434.field5905 = class369.field5000.method565();
        class240.field3416 = class369.field5000.method565();
        if (arg3 <= 31) {
            field9560 = null;
        }
        class567.field8014 = 0;
        class278.field3847 = 1;
        class658.field9108 = arg0;
        class290.field4002 = null;
        class765.field10553 = arg4;
        class746.field10303 = arg5;
        class615.field8571 = 0;
        class471.field6394 = arg7;
        class544.method3067(1, arg6, arg2);
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(ILfca;)V")
    public final void method3866(int arg0, class93 arg1) {
        while (true) {
            int var3 = arg1.method793((byte) 77);
            if (var3 == 0) {
                field9558++;
                if (arg0 != -1) {
                    this.field9559 = null;
                    return;
                }
                return;
            }
            this.method3868((byte) 31, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(B)V")
    public static void method3867(byte arg0) {
        field9560 = null;
        if (arg0 != 78) {
            method3869(-119, -47, -99, true);
        }
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(BILfca;)V")
    private final void method3868(byte arg0, int arg1, class93 arg2) {
        if (arg0 != 31) {
            return;
        }
        if (arg1 == 1) {
            this.field9563 = arg2.method763(-122);
        } else if (arg1 == 2) {
            this.field9559 = new int[arg2.method793((byte) 23)];
            for (int var4 = 0; var4 < this.field9559.length; var4++) {
                this.field9559[var4] = arg2.method763(-17);
            }
        } else if (arg1 == 3) {
            this.field9557 = arg2.method793((byte) 116);
        }
        field9562++;
    }

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIIZ)V")
    public static final void method3869(int arg0, int arg1, int arg2, boolean arg3) {
        field9556++;
        class281 var4 = class54.method395((byte) -53, (long) arg1, 9);
        if (!arg3) {
            field9560 = null;
        }
        var4.method1821((byte) -126);
        var4.field3910 = arg0;
        var4.field3901 = arg2;
    }
}
