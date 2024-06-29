import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class68 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field744 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Lwr;")
    public static class459 field745 = new class459(8);

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[[B")
    public static byte[][] field752 = new byte[250][];

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
    public static float field753;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field749;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public int field751;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Ljga;")
    public static class716 field755;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lji;I)V")
    public final void method513(class611 arg0, int arg1) {
        if (arg1 != -6364) {
            this.method514(true, -13, null);
        }
        field746++;
        while (true) {
            int var3 = arg0.method3428((byte) 125);
            if (var3 == 0) {
                return;
            }
            this.method514(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZILji;)V")
    private final void method514(boolean arg0, int arg1, class611 arg2) {
        if (arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field748 = arg2.method3402((byte) 127);
            this.field749 = arg2.method3428((byte) 125);
            this.field751 = arg2.method3428((byte) -121);
        }
        field747++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method515(int arg0) {
        field752 = null;
        field755 = null;
        field745 = null;
        if (arg0 != -15598) {
            method515(-67);
        }
        field744 = null;
    }
}
