import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class311 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "J")
    public long field5289 = 0L;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "Lok;")
    public static class146 field5297 = class235.method1724(-12908, "underlay");

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Lvb;")
    public static class50 field5298 = new class50();

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Lhd;")
    public static class117 field5304 = new class117(64);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field5287;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public int field5290;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public int field5291;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field5292;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public int field5293;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field5294;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public int field5296;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    public int field5301;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public int field5302;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Lbf;")
    public class322 field5300;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "[I")
    public static int[] field5305;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILbf;IJIIII)Z", line = 25)
    public static final boolean method2184(int arg0, int arg1, int arg2, int arg3, class322 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class148.method1138(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILoh;I)[Lje;", line = 32)
    public static final class70[] method2185(int arg0, int arg1, class15 arg2, int arg3) {
        field5295++;
        if (arg3 != 0) {
            field5303 = -22;
        }
        return class230.method1688(arg1, arg0, 1221, arg2) ? class197.method1520(93) : null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)J", line = 73)
    public static final long method2186(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null || var3.field223 == null ? 0L : var3.field223.field364;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 82)
    public static void method2187(boolean arg0) {
        field5298 = null;
        field5305 = null;
        field5304 = null;
        field5297 = null;
        if (arg0) {
            field5303 = -93;
        }
    }
}
