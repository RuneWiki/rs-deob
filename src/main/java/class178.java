import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class178 extends class106 {

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field3208 = 3353893;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[[B")
    public static byte[][] field3210 = new byte[50][];

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field3213 = 0;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "Loc;")
    private static class151 field3217 = class137.method873(2, "slide:");

    @OriginalMember(owner = "client!r", name = "w", descriptor = "Loc;")
    public static class151 field3212 = field3217;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Loc;")
    public static class151 field3214 = field3217;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field3222 = 0;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "Loc;")
    public static class151 field3223 = class137.method873(2, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!r", name = "A", descriptor = "Loc;")
    public static class151 field3216 = class137.method873(2, "hint_mapmarkers");

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "Lnd;")
    public static class142 field3224;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lr;")
    public class178 field3206;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Lr;")
    public class178 field3220;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
    public static int[] field3221;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method1128(int arg0, int arg1) {
        if (arg0 != 21303) {
            field3224 = null;
        }
        field3225++;
        class106.field1877 = -1;
        if (arg1 == 37) {
            class138.field2517 = 3.0D;
        } else if (arg1 == 50) {
            class138.field2517 = 4.0D;
        } else if (arg1 == 75) {
            class138.field2517 = 6.0D;
        } else {
            class138.field2517 = 8.0D;
        }
        class106.field1877 = -1;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public final void method1129(byte arg0) {
        if (arg0 != -2) {
            method1130(-8);
        }
        field3207++;
        if (this.field3220 != null) {
            this.field3220.field3206 = this.field3206;
            this.field3206.field3220 = this.field3220;
            this.field3206 = null;
            this.field3220 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method1130(int arg0) {
        class202.field3594++;
        class48.field984.method650(-13721, 146);
        field3218++;
        if (arg0 > -99) {
            field3211 = 16;
        }
        for (class147 var1 = (class147) class227.field3961.method1534(20912); var1 != null; var1 = (class147) class227.field3961.method1535(0)) {
            if (var1.field2630 == 0) {
                class120.method729(var1, true, (byte) 53);
            }
        }
        if (class7.field113 != null) {
            class27.method208(true, class7.field113);
            class7.field113 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method1131(boolean arg0) {
        field3221 = null;
        field3212 = null;
        field3214 = null;
        field3216 = null;
        field3217 = null;
        field3210 = null;
        if (arg0) {
            field3223 = null;
            field3224 = null;
        }
    }
}
