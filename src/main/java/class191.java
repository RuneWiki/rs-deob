import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class191 extends class109 {

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field3839 = 0;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "[I")
    public static int[] field3837 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Ldd;")
    public static class35 field3843 = class180.method1196((byte) 127, "::");

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Ldd;")
    private static class35 field3847 = class180.method1196((byte) 127, "Existing User");

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Ldd;")
    private static class35 field3842 = class180.method1196((byte) 127, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[Z")
    public static boolean[] field3849 = new boolean[100];

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Ldd;")
    public static class35 field3840 = field3842;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Ldd;")
    public static class35 field3850 = class180.method1196((byte) -24, "<br>");

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Ldd;")
    public static class35 field3851 = field3847;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lo;")
    public static class134 field3848;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Luc;")
    public class191 field3838;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Luc;")
    public class191 field3841;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lag;")
    public static class8 field3845;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lag;")
    public static class8 field3852;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[[[B")
    public static byte[][][] field3836;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "[[[Lfc;")
    public static class54[][][] field3853;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
    public static void method1255(byte arg0) {
        field3845 = null;
        field3842 = null;
        if (arg0 > -27) {
            return;
        }
        field3843 = null;
        field3850 = null;
        field3836 = null;
        field3847 = null;
        field3852 = null;
        field3853 = null;
        field3849 = null;
        field3851 = null;
        field3837 = null;
        field3840 = null;
        field3848 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
    public final void method1256(byte arg0) {
        field3846++;
        int var2 = 48 / ((arg0 - 44) / 60);
        if (this.field3838 != null) {
            this.field3838.field3841 = this.field3841;
            this.field3841.field3838 = this.field3838;
            this.field3838 = null;
            this.field3841 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method1257(int arg0, int arg1, int arg2) {
        class54 var3 = field3853[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1210 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static final void method1258(int arg0) {
        field3844++;
        class40.field891.method813(-114);
        class114.field2551.method813(arg0 - 13294);
        class45.field971.method813(-116);
        if (arg0 != 13171) {
            field3842 = null;
        }
    }
}
