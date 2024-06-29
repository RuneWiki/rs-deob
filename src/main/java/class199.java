import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class199 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lqe;")
    public static class179 field3705 = class206.method1380("Abbrechen", (byte) -126);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "J")
    public static volatile long field3703 = 0L;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ls;")
    public static class194 field3709 = new class194(64);

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lqe;")
    private static class179 field3712 = class206.method1380("Loaded interfaces", (byte) 112);

    @OriginalMember(owner = "client!se", name = "m", descriptor = "Lqe;")
    public static class179 field3713 = field3712;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "B")
    public static byte field3711;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Leb;")
    public static class46 field3714;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Leh;")
    public static class52 field3707;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lig;")
    public static class93 field3702;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[Lnb;")
    public static class143[] field3708;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "[[Lae;")
    public static class6[][] field3710;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)J")
    public static final long method1324(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3662; var4++) {
            class167 var5 = var3.field3672[var4];
            if ((var5.field3014 >> 29 & 0x3L) == 2L && var5.field3006 == arg1 && var5.field3018 == arg2) {
                return var5.field3014;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1325(int arg0) {
        field3706++;
        if (arg0 <= 55) {
            field3709 = null;
        }
        class18.field469.method1297((byte) 89);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lqe;Z)Lqe;")
    public static final class179 method1326(class179 arg0, boolean arg1) {
        field3701++;
        class25 var2 = class61.method411(arg0, 108);
        if (arg1) {
            return var2 == null ? class187.field3465 : var2.field589;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static void method1327(int arg0) {
        field3707 = null;
        field3702 = null;
        field3713 = null;
        field3708 = null;
        field3705 = null;
        field3712 = null;
        field3714 = null;
        field3710 = null;
        if (arg0 != 0) {
            field3705 = null;
        }
        field3709 = null;
    }
}
