import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class160 extends class270 {

    @OriginalMember(owner = "client!se", name = "E", descriptor = "[I")
    public static int[] field2083 = new int[1000];

    @OriginalMember(owner = "client!se", name = "u", descriptor = "[[I")
    public static int[][] field2073 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2077;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "J")
    public long field2081;

    static {
        new class194("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field2084 = 503;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(B)J", line = 3)
    public final long method1014(byte arg0) {
        field2074++;
        if (arg0 != -99) {
            this.method1019((byte) 69);
        }
        return this.field2081;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)I", line = 15)
    public final int method1015(int arg0) {
        if (arg0 != 0) {
            this.method1014((byte) -36);
        }
        field2080++;
        return this.field2076;
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I", line = 27)
    public static final int method1016(int arg0) {
        int var1 = 29 / ((arg0 + 7) / 42);
        field2082++;
        class5 var2 = class151.field1951;
        synchronized (class151.field1951) {
            return class151.field1951.method33(0);
        }
    }

    @OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V", line = 39)
    public static void method1017(int arg0) {
        int var1 = 93 / ((3 - arg0) / 44);
        field2073 = null;
        field2083 = null;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I", line = 53)
    public final int method1018(int arg0) {
        if (arg0 != -30361) {
            method1016(-36);
        }
        field2077++;
        return this.field2079;
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(B)I", line = 75)
    public final int method1019(byte arg0) {
        if (arg0 > -56) {
            this.method1015(117);
        }
        field2078++;
        return this.field2075;
    }
}
