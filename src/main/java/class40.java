import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class40 extends class424 implements class409 {

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "[I")
    public static int[] field558 = new int[1024];

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field568 = 0;

    @OriginalMember(owner = "client!lm", name = "B", descriptor = "S")
    public static short field572 = 256;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lnj;")
    public static class415 field559 = new class415(63, 4);

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "C")
    public char field562;

    @OriginalMember(owner = "client!lm", name = "C", descriptor = "F")
    public static float field573;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "J")
    public long field564;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
    public final int method311(int arg0) {
        field569++;
        if (arg0 != -8523) {
            this.field564 = -43L;
        }
        return this.field566;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)J")
    public final long method312(int arg0) {
        field571++;
        if (arg0 != -10133) {
            this.method316((byte) -117);
        }
        return this.field564;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)I")
    public final int method313(boolean arg0) {
        if (arg0) {
            method314(62);
        }
        field563++;
        return this.field570;
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V")
    public static void method314(int arg0) {
        if (arg0 != 63) {
            field568 = -78;
        }
        field559 = null;
        field558 = null;
    }

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "(I)V")
    public static final void method315(int arg0) {
        if (arg0 >= -37) {
            field558 = null;
        }
        class291.field3758 = 0;
        field565++;
        class658.field9176.method2085((byte) 9);
        class594.field8025 = false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)C")
    public final char method316(byte arg0) {
        field560++;
        return arg0 == -83 ? this.field562 : '-';
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
    public final int method317(int arg0) {
        field561++;
        if (arg0 != -5929) {
            method314(23);
        }
        return this.field567;
    }
}
