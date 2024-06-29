import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class432 extends class263 {

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "Lcga;")
    public static class449 field5449 = new class449(15, 7);

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "Z")
    public static boolean field5453 = true;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[Lps;")
    public static class86[] field5456 = new class86[35];

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "F")
    public static float field5454;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field5445;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public int field5446;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[I")
    public int[] field5447;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[I")
    public int[] field5450;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "[I")
    public int[] field5452;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[Lue;")
    public class218[] field5444;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "[Lue;")
    public class218[] field5448;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "[[[B")
    public byte[][][] field5451;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method2372(byte arg0, int arg1, String arg2) {
        if (arg0 < -7) {
            field5457++;
            class243 var3 = class546.method2926(arg1, 3, true);
            var3.method1457(125);
            var3.field3139 = arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method2373(byte arg0) {
        if (arg0 > -46) {
            field5456 = null;
        }
        field5456 = null;
        field5449 = null;
    }
}
