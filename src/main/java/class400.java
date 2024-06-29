import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class400 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public int field5498 = -1;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public int field5505 = -1;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field5504 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lld;")
    public static class105 field5500 = new class105();

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lgd;")
    public static class206 field5507 = new class206("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "[I")
    public int[] field5506;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lbt;II)V")
    private final void method2423(class32 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field5498 = arg0.method215((byte) 90);
        } else if (arg1 == 2) {
            this.field5506 = new int[arg0.method201((byte) -113)];
            for (int var4 = 0; var4 < this.field5506.length; var4++) {
                this.field5506[var4] = arg0.method215((byte) 99);
            }
        } else if (arg1 == 3) {
            this.field5505 = arg0.method201((byte) -126);
        }
        field5499++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lvj;")
    public static final class281 method2424(int arg0) {
        field5503++;
        if (arg0 > -31) {
            method2425(-35);
        }
        return class55.field727;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public static void method2425(int arg0) {
        if (arg0 != -4) {
            field5500 = null;
        }
        field5500 = null;
        field5507 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BI)Z")
    public static final boolean method2426(byte arg0, int arg1) {
        field5501++;
        class402.field5525 = true;
        if (arg0 <= 101) {
            method2425(19);
        }
        class45.field618 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lbt;B)V")
    public final void method2427(class32 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -114);
            if (var3 == 0) {
                if (arg1 != -52) {
                    method2425(-86);
                }
                field5502++;
                return;
            }
            this.method2423(arg0, var3, -2);
        }
    }
}
