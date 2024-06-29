import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class104 extends class183 {

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Z")
    public boolean field1898 = false;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Ldj;")
    public static class44 field1900 = class89.method650(255, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lri;")
    public static class189 field1894 = new class189(64);

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "Lle;")
    public static class125 field1895;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)V")
    public static final void method762(int arg0, int arg1, int arg2) {
        class68 var3 = class32.field567[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1302 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public static void method763(int arg0) {
        field1895 = null;
        field1900 = null;
        field1894 = null;
        if (arg0 > -60) {
            method762(9, -36, -58);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static final void method764(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field1899++;
        if (class33.field583 && class88.field1671 != class194.field3403) {
            class234.method1530(false, class129.field2298, class96.field1774.field2235[0], class134.field2403, class96.field1774.field2240[0], class194.field3403);
        } else if (class203.field3636 != class194.field3403) {
            class203.field3636 = class194.field3403;
            class184.method1153(class194.field3403, (byte) -42);
        }
    }
}
