import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 extends class472 {

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "B")
    public byte field309 = 5;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
    public static int field314 = 0;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "Lgk;")
    public static class331 field315 = new class331("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "I")
    public int field305;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public int field306;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "Z")
    public boolean field308;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIBII)I", line = 3)
    public static final int method220(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field307++;
        if (class131.field1899 == null) {
            return 0;
        } else if (arg3 == 80) {
            if (arg5 < 3) {
                int var6 = arg1 >> 7;
                int var7 = arg4 >> 7;
                if (arg0 < 0 || arg2 < 0 || (class397.field5828 - 1) < arg0 || (class457.field6713 - 1) < arg2) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || var6 > (class397.field5828 - 1) || (class457.field6713 - 1) < var7) {
                    return 0;
                }
                boolean var8 = (class238.field3497[1][arg1 >> 7][arg4 >> 7] & 0x2) != 0;
                if ((arg1 & 0x7F) == 0) {
                    boolean var9 = (class238.field3497[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                    boolean var10 = (class238.field3497[1][var6][arg4 >> 7] & 0x2) != 0;
                    if (var10 != var9) {
                        var8 = (class238.field3497[1][arg0][arg2] & 0x2) != 0;
                    }
                }
                if ((arg4 & 0x7F) == 0) {
                    boolean var11 = (class238.field3497[1][arg1 >> 7][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class238.field3497[1][arg1 >> 7][var7] & 0x2) != 0;
                    if (var11 != var12) {
                        var8 = (class238.field3497[1][arg0][arg2] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg5++;
                }
            }
            return class131.field1899[arg5].method426(arg1, arg4);
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)V", line = 75)
    public static void method221(int arg0) {
        int var1 = -87 / ((38 - arg0) / 43);
        field315 = null;
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "(I)I", line = 86)
    public static final int method222(int arg0) {
        field310++;
        return arg0 <= 31 ? 68 : 6;
    }
}
