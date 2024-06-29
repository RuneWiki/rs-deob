import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class63 extends class627 {

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public int field847 = -1;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public int field855 = 0;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[I")
    public static int[] field850 = new int[3];

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "Ljt;")
    public static class635 field860 = new class635(1);

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Lqi;")
    public static class669 field861 = new class669(5, 1);

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public int field858;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lmb;)V")
    public static final void method484(class410 arg0) {
        class618.field8660.method162(arg0.field5790, arg0.field5791 + (arg0.method247(0) >> 1), arg0.field5784, class30.field490);
        arg0.field5781 = class30.field490[0];
        arg0.field5782 = class30.field490[1];
        arg0.field5783 = class30.field490[2];
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lcca;Lcca;B)V")
    public static final void method485(class696 arg0, class696 arg1, byte arg2) {
        if (arg0.field9862 != null) {
            arg0.method3869(true);
        }
        field852++;
        if (arg2 == -99) {
            arg0.field9862 = arg1.field9862;
            arg0.field9860 = arg1;
            arg0.field9862.field9860 = arg0;
            arg0.field9860.field9862 = arg0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static void method486(byte arg0) {
        if (arg0 == -124) {
            field850 = null;
            field861 = null;
            field860 = null;
        }
    }
}
