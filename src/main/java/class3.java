import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public int field18 = -1;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "[Z")
    public static boolean[] field26 = new boolean[112];

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lfa;")
    public static class273 field22;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lbe;")
    public static class30 field15;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method9(byte arg0) {
        field26 = null;
        if (arg0 == -110) {
            field15 = null;
            field22 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpd;II)V")
    public static final void method10(class58 arg0, int arg1, int arg2) {
        if (class4.field32 < arg0.field812) {
            class125.method830((byte) -57, arg0);
        } else if (class4.field32 <= arg0.field845) {
            class237.method1641(true, arg0);
        } else {
            class161.method1071(arg0, (byte) -116);
        }
        if (arg0.field836 < 128 || arg0.field850 < 128 || arg0.field836 >= 13184 || arg0.field850 >= 13184) {
            arg0.field812 = 0;
            arg0.field845 = 0;
            arg0.field870 = -1;
            arg0.field853 = -1;
            arg0.field836 = arg0.field849[0] * 128 + (arg0.method362(25892) * 64);
            arg0.field850 = arg0.field804[0] * 128 + arg0.method362(25892) * 64;
            arg0.method364(23746);
        }
        if (class309.field5006 == arg0 && (arg0.field836 < 1536 || arg0.field850 < 1536 || arg0.field836 >= 11776 || arg0.field850 >= 11776)) {
            arg0.field870 = -1;
            arg0.field853 = -1;
            arg0.field812 = 0;
            arg0.field845 = 0;
            arg0.field836 = arg0.field849[0] * 128 + arg0.method362(arg1 ^ 0x3239) * 64;
            arg0.field850 = arg0.field804[0] * 128 + arg0.method362(arg1 + 3591) * 64;
            arg0.method364(23746);
        }
        field23++;
        if (arg1 != 22301) {
            field26 = null;
        }
        class44.method283(arg0, -1);
        class15.method98(arg0, (byte) 126);
    }
}
