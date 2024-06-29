import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class422 {

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Z")
    public static boolean field5962 = false;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "D")
    public static double field5966;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field5960;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "J")
    public static long field5968;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)[Lep;", line = 16)
    public static final class440[] method2519(int arg0) {
        if (arg0 == -6411) {
            field5961++;
            return new class440[] { class21.field311, class567.field8017, class624.field8798 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 27)
    public static final void method2520(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        field5956++;
        class224.method1554(arg2, arg6, arg4, arg3, arg0, -1, 99, arg1, null);
        if (arg5 >= -78) {
            method2522(4, 113, 52, -3, -86, 17);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 38)
    public static final void method2521(byte arg0) {
        class424.method2528(true);
        field5958++;
        int var1 = -46 % ((arg0 + 85) / 38);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIII)V", line = 50)
    public static final void method2522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 18 / ((-arg0 - 5) / 59);
        if (class414.field5846 >= arg5 && arg3 >= class738.field10297) {
            boolean var7;
            if (arg2 < class450.field6463) {
                var7 = false;
                arg2 = class450.field6463;
            } else if (class285.field4372 < arg2) {
                var7 = false;
                arg2 = class285.field4372;
            } else {
                var7 = true;
            }
            boolean var8;
            if (arg4 < class450.field6463) {
                var8 = false;
                arg4 = class450.field6463;
            } else if (arg4 <= class285.field4372) {
                var8 = true;
            } else {
                arg4 = class285.field4372;
                var8 = false;
            }
            if (arg5 < class738.field10297) {
                arg5 = class738.field10297;
            } else {
                class382.method2347(arg2, class347.field5087[arg5++], arg1, 7, arg4);
            }
            if (class414.field5846 >= arg3) {
                class382.method2347(arg2, class347.field5087[arg3--], arg1, 7, arg4);
            } else {
                arg3 = class414.field5846;
            }
            if (var7 && var8) {
                for (int var9 = arg5; var9 <= arg3; var9++) {
                    int[] var10 = class347.field5087[var9];
                    var10[arg2] = var10[arg4] = arg1;
                }
            } else if (var7) {
                for (int var12 = arg5; var12 <= arg3; var12++) {
                    class347.field5087[var12][arg2] = arg1;
                }
            } else if (var8) {
                for (int var11 = arg5; var11 <= arg3; var11++) {
                    class347.field5087[var11][arg4] = arg1;
                }
            }
        }
        field5959++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)I", line = 158)
    public static final int method2523(int arg0, int arg1) {
        field5964++;
        if (arg1 <= 117) {
            return -58;
        } else if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
