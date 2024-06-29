import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class517 extends class42 implements class454 {

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "[Llr;")
    public static class539[] field7490 = new class539[16];

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lhl;")
    public static class375 field7488 = new class375(8);

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "C")
    public char field7496;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field7483;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
    public int field7493;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "I")
    public int field7494;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "J")
    public long field7485;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I")
    public final int method2701(int arg0) {
        if (arg0 > -24) {
            return 54;
        } else {
            field7486++;
            return this.field7494;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
    public final int method2703(byte arg0) {
        field7492++;
        if (arg0 > -94) {
            this.method2701(4);
        }
        return this.field7483;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)C")
    public final char method2704(boolean arg0) {
        field7495++;
        if (!arg0) {
            this.field7493 = -34;
        }
        return this.field7496;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lci;I)V")
    public static final void method3007(class320 arg0, int arg1) {
        field7491++;
        class102.field1585 = arg0.method2043((byte) 42, "p11_full");
        class470.field6816 = arg0.method2043((byte) 104, "p12_full");
        class17.field188 = arg0.method2043((byte) -71, "b12_full");
        class320.field4761 = arg0.method2043((byte) -104, "hitmarks");
        class172.field2557 = arg0.method2043((byte) 126, "hitbar_default");
        class313.field4673 = arg0.method2043((byte) -76, "timerbar_default");
        class246.field3678 = arg0.method2043((byte) 99, "headicons_pk");
        class175.field2610 = arg0.method2043((byte) 61, "headicons_prayer");
        class134.field2089 = arg0.method2043((byte) -121, "hint_headicons");
        class69.field1146 = arg0.method2043((byte) -91, "hint_mapmarkers");
        class189.field2775 = arg0.method2043((byte) 79, "mapflag");
        class58.field1048 = arg0.method2043((byte) 63, "cross");
        class276.field4121 = arg0.method2043((byte) -52, "mapdots");
        class154.field2348 = arg0.method2043((byte) -86, "scrollbar");
        class107.field1613 = arg0.method2043((byte) -126, "name_icons");
        class393.field5593 = arg0.method2043((byte) 85, "floorshadows");
        class51.field934 = arg0.method2043((byte) 110, "compass");
        if (arg1 >= -35) {
            method3008((byte) 121);
        }
        class374.field5382 = arg0.method2043((byte) 106, "otherlevel");
        class42.field865 = arg0.method2043((byte) 43, "hint_mapedge");
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I")
    public final int method2705(int arg0) {
        field7489++;
        if (arg0 != 4533) {
            this.method2702(72);
        }
        return this.field7493;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J")
    public final long method2702(int arg0) {
        if (arg0 != 30636) {
            this.field7483 = 84;
        }
        field7484++;
        return this.field7485;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(B)V")
    public static void method3008(byte arg0) {
        field7488 = null;
        field7490 = null;
        if (arg0 != 15) {
            method3007(null, 108);
        }
    }
}
