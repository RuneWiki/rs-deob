import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class302 extends class656 {

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "Z")
    public boolean field4279 = true;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "Z")
    public boolean field4288 = false;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "[Leea;")
    public static class134[] field4281 = new class134[1024];

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "Lcga;")
    public static class485 field4290 = new class485();

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "Z")
    public static boolean field4291 = true;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "[I")
    public static int[] field4292 = new int[1];

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "I")
    public int field4275;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public int field4276;

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public int field4278;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public int field4286;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public int field4287;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "Lbk;")
    public class379 field4282;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
    public static void method1847(int arg0) {
        if (arg0 != 0) {
            method1847(91);
        }
        field4292 = null;
        field4290 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Lkg;")
    public static final class275 method1848(int arg0, int arg1) {
        field4277++;
        class275[] var2 = class141.method1079(-25801);
        int var3 = -21 % ((arg0 + 43) / 39);
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].field3831 == arg1) {
                return var2[var4];
            }
        }
        return null;
    }
}
