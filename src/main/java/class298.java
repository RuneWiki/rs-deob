import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class298 {

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "Lsf;")
    public static class522 field3697 = new class522();

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "[Z")
    public static boolean[] field3713 = new boolean[8];

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "B")
    public byte field3695;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "B")
    public byte field3696;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "B")
    public byte field3699;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "B")
    public byte field3701;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "B")
    public byte field3702;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "B")
    public byte field3704;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "B")
    public byte field3709;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public int field3698;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public int field3705;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "Lrc;")
    public static class536 field3715;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "S")
    public short field3706;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "Z")
    public boolean field3694;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Z")
    public boolean field3700;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "Z")
    public boolean field3703;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "Z")
    public boolean field3707;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "Z")
    public boolean field3710;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "Z")
    public boolean field3711;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "Z")
    public boolean field3714;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "Z")
    public boolean field3716;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1766(int arg0, byte arg1) {
        field3693++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class486.field6937.method2936(class489.field6978, 63) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class486.field6939.method2936(class489.field6978, 104) + " (" + var2 + ")</col>";
        } else {
            if (arg1 >= -75) {
                field3697 = null;
            }
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method1767(int arg0) {
        field3697 = null;
        field3713 = null;
        if (arg0 != 8) {
            method1766(59, (byte) -125);
        }
        field3715 = null;
    }
}
