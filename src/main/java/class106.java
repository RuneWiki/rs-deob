import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 {

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lr;")
    public static class118 field2469 = class153.method1136(119, "<col=ff0000>");

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lr;")
    private static class118 field2466 = class153.method1136(108, "Loading sprites )2 ");

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lr;")
    public static class118 field2477 = class153.method1136(92, "Fallen lassen");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lr;")
    public static class118 field2467 = field2466;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Ls;")
    public static class125 field2474;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lff;")
    public static class42 field2475;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public static boolean field2463;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[[I")
    public static int[][] field2473;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method848(int arg0) {
        field2474 = null;
        field2467 = null;
        field2477 = null;
        field2475 = null;
        if (arg0 != 7) {
            method849(null, null, (byte) 85);
        }
        field2469 = null;
        field2466 = null;
        field2473 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lpa;Lr;B)I")
    public static final int method849(class105 arg0, class118 arg1, byte arg2) {
        if (arg2 != -86) {
            field2475 = null;
        }
        int var3 = arg0.field2404;
        field2470++;
        arg0.method794(arg1.field2743, 255);
        arg0.field2404 += class103.field2370.method479(0, arg0.field2405, arg1.field2743, arg0.field2404, arg1.field2746, 24);
        return arg0.field2404 - var3;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Ln;")
    public static final class90 method850(int arg0) {
        field2462++;
        class90 var1 = new class90();
        var1.field2156 = class105.field2458;
        var1.field2159 = class65.field1488[arg0];
        var1.field2153 = field2476;
        var1.field2160 = class127.field2904;
        var1.field2157 = class153.field3467[0];
        var1.field2155 = class74.field1830[0];
        var1.field2154 = class54.field1293[0];
        var1.field2158 = class56.field1313[0];
        class97.method755((byte) -9);
        return var1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIBIIII)I")
    public static final int method851(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg1;
            arg1 = var7;
        }
        field2471++;
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg6;
        } else if (var8 == 1) {
            return 7 + 1 - arg0 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg6 - arg1;
        } else {
            if (arg2 != -3) {
                method848(90);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)I")
    public static final int method852(byte arg0) {
        int var1 = 16 % ((arg0 + 43) / 45);
        field2472++;
        return class103.field2360++;
    }
}
