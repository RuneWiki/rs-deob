import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class410 extends class134 implements class426 {

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "[I")
    public static int[] field5597 = new int[32];

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "Lpia;")
    public static class94 field5599 = new class94(2, 3);

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "C")
    public char field5602;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public int field5603;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public int field5605;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "J")
    public long field5604;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
    public final int method2513(int arg0) {
        field5608++;
        if (arg0 <= 44) {
            method2515((byte) -127);
        }
        return this.field5605;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)C")
    public final char method2514(byte arg0) {
        field5600++;
        int var2 = -2 % ((-arg0 - 36) / 40);
        return this.field5602;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)V")
    public static void method2515(byte arg0) {
        field5597 = null;
        if (arg0 < -97) {
            field5599 = null;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)J")
    public final long method2516(byte arg0) {
        if (arg0 == 47) {
            field5598++;
            return this.field5604;
        } else {
            return 49L;
        }
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)I")
    public final int method2517(int arg0) {
        field5601++;
        return arg0 <= 82 ? 41 : this.field5603;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)I")
    public final int method2518(boolean arg0) {
        if (arg0) {
            return 35;
        } else {
            field5606++;
            return this.field5596;
        }
    }
}
