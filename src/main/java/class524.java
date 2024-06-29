import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class524 {

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
    public int field7339 = 0;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public int field7338 = 2048;

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
    public int field7343 = 2048;

    @OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
    public int field7345 = 0;

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "I")
    public static int field7340 = 1400;

    @OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lcea;")
    public static class180 field7342 = new class180("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
    public static int field7346;

    @OriginalMember(owner = "client!jaa", name = "j", descriptor = "Ldn;")
    public static class438 field7347;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILos;)V")
    private final void method2977(int arg0, int arg1, class374 arg2) {
        field7346++;
        if (arg1 == 1) {
            this.field7339 = arg2.method2129(-81);
        } else if (arg1 == 2) {
            this.field7338 = arg2.method2136(false);
        } else if (arg1 == 3) {
            this.field7343 = arg2.method2136(false);
        } else if (arg1 == 4) {
            this.field7345 = arg2.method2089(true);
        }
        if (arg0 != 30748) {
            method2979((byte) -25);
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Z")
    public static final boolean method2978(int arg0, int arg1) {
        int var2 = 118 % ((arg1 - 75) / 39);
        field7344++;
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public static void method2979(byte arg0) {
        field7342 = null;
        field7347 = null;
        int var1 = 59 % ((arg0 + 59) / 46);
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILos;)V")
    public final void method2980(int arg0, class374 arg1) {
        field7341++;
        if (arg0 != -1) {
            field7342 = null;
        }
        while (true) {
            int var3 = arg1.method2129(-115);
            if (var3 == 0) {
                return;
            }
            this.method2977(arg0 ^ 0xFFFF87E3, var3, arg1);
        }
    }
}
