import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class27 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "J")
    public long field381 = 0L;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "Leg;")
    public static class37 field389 = class174.method1167("<col=ff0000>", -35);

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "Leg;")
    public static class37 field388 = class174.method1167("Versteckt", -103);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field396 = 2;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field391 = 0;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "S")
    public static short field384 = 1;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Leg;")
    public static class37 field385 = class174.method1167("Module texte charg-B", -59);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lpe;")
    public static class237 field379;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lff;")
    public static class4 field393;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lme;")
    public class67 field400;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[[[B")
    public static byte[][][] field390;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjl;Ljl;)V")
    public static final void method155(boolean arg0, class101 arg1, class101 arg2) {
        class75.field1172 = arg1;
        if (!arg0) {
            class169.field2825 = arg2;
            class269.field4707 = class169.field2825.method672(3, (byte) 122);
            field382++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
    public static void method156(boolean arg0) {
        field388 = null;
        if (!arg0) {
            method156(true);
        }
        field393 = null;
        field379 = null;
        field385 = null;
        field390 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
    public static final void method157(int arg0, byte arg1) {
        field401++;
        class159.field2661--;
        if (class159.field2661 == arg0) {
            return;
        }
        class54.method351(class40.field645, arg0 + 1, class40.field645, arg0, class159.field2661 - arg0);
        class54.method351(class160.field2663, arg0 + 1, class160.field2663, arg0, class159.field2661 - arg0);
        class54.method349(class264.field4642, arg0 + 1, class264.field4642, arg0, class159.field2661 - arg0);
        class54.method353(class129.field2141, arg0 + 1, class129.field2141, arg0, class159.field2661 - arg0);
        if (arg1 == -30) {
            class54.method352(class26.field368, arg0 + 1, class26.field368, arg0, class159.field2661 - arg0);
            class54.method352(class217.field3726, arg0 + 1, class217.field3726, arg0, class159.field2661 - arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLjl;)V")
    public static final void method158(boolean arg0, class101 arg1) {
        class120.field2033 = arg1.method652(class113.field1940, 112);
        if (!arg0) {
            field384 = 100;
        }
        field403++;
    }
}
