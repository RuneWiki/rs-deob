import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class136 {

    @OriginalMember(owner = "client!em", name = "a", descriptor = "Lh;")
    public static class434 field1975 = new class434(56, -1);

    @OriginalMember(owner = "client!em", name = "f", descriptor = "Lh;")
    public static class434 field1980 = new class434(35, -2);

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field1981 = 0;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Lmc;")
    public static class78 field1982 = new class78(25, 2);

    @OriginalMember(owner = "client!em", name = "j", descriptor = "[I")
    public static int[] field1984;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "[[B")
    public static byte[][] field1976;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "[[I")
    public static int[][] field1977;

    static {
        new class206("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field1984 = new int[13];
        field1985 = 100;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIZ)V", line = 6)
    public static final void method823(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != -1) {
            field1985 = -107;
        }
        field1978++;
        if (arg2) {
            class365.field5024--;
            if (class365.field5024 == 0) {
                class461.field6250 = null;
            }
        }
        if (!arg0) {
            return;
        }
        class354.field4903--;
        if (class354.field4903 == 0) {
            class193.field2616 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 34)
    public static void method824(int arg0) {
        if (arg0 != 100) {
            method825(-116, true);
        }
        field1984 = null;
        field1976 = null;
        field1977 = null;
        field1982 = null;
        field1980 = null;
        field1975 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V", line = 53)
    public static final void method825(int arg0, boolean arg1) {
        class491.method2861(class312.field4108, 1);
        field1979++;
        class93.field1362++;
        if (arg0 != -1) {
            return;
        }
        for (class132 var2 = (class132) class214.field2883.method1518((byte) -83); var2 != null; var2 = (class132) class214.field2883.method1517(-30942)) {
            if (!var2.method2608(25657)) {
                var2 = (class132) class214.field2883.method1518((byte) -43);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field1942 == 0) {
                class284.method1603(arg1, true, var2, true);
            }
        }
        if (class16.field231 != null) {
            class490.method2854(class16.field231, (byte) 57);
            class16.field231 = null;
        }
    }
}
