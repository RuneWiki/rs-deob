import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class271 {

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public int field3703;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public int field3702;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "B")
    public byte field3713;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "[I")
    public static int[] field3711 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public int field3696;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public int field3701;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public int field3706;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public int field3707;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public int field3716;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "Lnba;")
    public class271 field3699;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "[I")
    public static int[] field3715;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "[Lgu;")
    public static class536[] field3698;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIII)Lnba;", line = 10)
    public final class271 method1628(int arg0, int arg1, int arg2, int arg3) {
        field3697++;
        if (arg2 != -9198) {
            this.field3696 = -108;
        }
        return new class271(this.field3714, arg1, arg0, arg3, this.field3713);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Z)V", line = 27)
    public static void method1629(boolean arg0) {
        if (!arg0) {
            field3711 = null;
            field3698 = null;
            field3715 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Lkea;", line = 40)
    public final class216 method1630(int arg0) {
        field3700++;
        int var2 = 95 / ((arg0 - 59) / 55);
        return class203.method1234(this.field3714, -103);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(IIIIB)V", line = 70)
    public class271(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field3703 = arg1;
        this.field3714 = arg0;
        this.field3708 = arg3;
        this.field3702 = arg2;
        this.field3713 = arg4;
    }
}
