import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class121 {

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
    public int field2113 = 0;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "[I")
    public static int[] field2107 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lhe;")
    private static class54 field2111 = class6.method58("Loading)3)3)3", false);

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lhe;")
    public static class54 field2109 = class6.method58("Bitte starten Sie eine Mitgliedschaft", false);

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lhe;")
    public static class54 field2105 = field2111;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "Lhe;")
    public static class54 field2112 = class6.method58("<br>(X", false);

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "[Z")
    public static boolean[] field2114 = new boolean[100];

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "Lse;")
    public static class130 field2106 = new class130();

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lhe;")
    private static class54 field2116 = class6.method58("Members object", false);

    @OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
    public static int field2119 = -1;

    @OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lhe;")
    private static class54 field2117 = class6.method58("glow1:", false);

    @OriginalMember(owner = "client!mb", name = "rb", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!mb", name = "tb", descriptor = "Lhe;")
    public static class54 field2126 = field2117;

    @OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
    public static int field2123 = 0;

    @OriginalMember(owner = "client!mb", name = "sb", descriptor = "Lhe;")
    public static class54 field2125 = field2117;

    @OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lhe;")
    private static class54 field2122 = class6.method58("Unexpected loginserver response)3", false);

    @OriginalMember(owner = "client!mb", name = "ob", descriptor = "Lhe;")
    public static class54 field2121 = class6.method58("titlebutton", false);

    @OriginalMember(owner = "client!mb", name = "nb", descriptor = "Lhe;")
    public static class54 field2120 = field2122;

    @OriginalMember(owner = "client!mb", name = "ub", descriptor = "Lhe;")
    public static class54 field2127 = field2116;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!mb", name = "lb", descriptor = "Ljava/awt/Font;")
    public static Font field2118;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLhe;III)V")
    public static final void method686(byte arg0, class54 arg1, int arg2, int arg3, int arg4) {
        field2115++;
        class93 var5 = class105.method811(arg3, -1, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field2246 != null) {
            class100 var6 = new class100();
            var6.field2537 = var5;
            var6.field2522 = var5.field2246;
            var6.field2531 = arg1;
            var6.field2524 = arg2;
            class32.method242(1, var6);
        }
        boolean var7 = true;
        if (var5.field2328 > 0) {
            var7 = class5.method49(-119, var5);
        }
        if (!var7 || !class86.method692(75, arg2 - 1, class105.method810(var5, -22389))) {
            return;
        }
        if (arg2 == 1) {
            class149.field3364++;
            class131.field2969.method454(113, -126);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 2) {
            class108.field2630++;
            class131.field2969.method454(37, -53);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 3) {
            class131.field2969.method454(134, -18);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
            class143.field3269++;
        }
        if (arg2 == 4) {
            class131.field2969.method454(137, 111);
            class65.field1558++;
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 5) {
            class68.field1687++;
            class131.field2969.method454(140, -12);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 6) {
            class131.field2969.method454(210, -91);
            class131.field2969.method658(181, arg3);
            class132.field2984++;
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 7) {
            class131.field2969.method454(148, -82);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
            class143.field3266++;
        }
        if (arg2 == 8) {
            class131.field2969.method454(104, -100);
            class70.field1738++;
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        if (arg2 == 9) {
            field2104++;
            class131.field2969.method454(9, -61);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
        int var8 = -127 % ((arg0 + 37) / 54);
        if (arg2 == 10) {
            class87.field2147++;
            class131.field2969.method454(28, 110);
            class131.field2969.method658(181, arg3);
            class131.field2969.method629(arg4, 2018779304);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lm;I)V")
    public final void method687(class83 arg0, int arg1) {
        field2108++;
        if (arg1 < 106) {
            field2122 = null;
        }
        while (true) {
            int var3 = arg0.method638(0);
            if (var3 == 0) {
                return;
            }
            this.method688(-126, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILm;I)V")
    private final void method688(int arg0, class83 arg1, int arg2) {
        field2110++;
        if (arg0 <= -40 && arg2 == 2) {
            this.field2113 = arg1.method631((byte) -123);
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)V")
    public static void method689(boolean arg0) {
        field2116 = null;
        field2105 = null;
        field2125 = null;
        field2122 = null;
        field2127 = null;
        field2118 = null;
        field2121 = null;
        field2109 = null;
        field2112 = null;
        field2107 = null;
        if (!arg0) {
            return;
        }
        field2114 = null;
        field2117 = null;
        field2120 = null;
        field2126 = null;
        field2111 = null;
        field2106 = null;
    }
}
