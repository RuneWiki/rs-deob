import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class115 extends class376 {

    @OriginalMember(owner = "client!ik", name = "u", descriptor = "F")
    public static float field1674;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public int field1673;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public int field1677;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "[I")
    public int[] field1669;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "[I")
    public int[] field1670;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "[Lmq;")
    public class295[] field1671;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "[Lmq;")
    public class295[] field1676;

    @OriginalMember(owner = "client!ik", name = "v", descriptor = "[Lrg;")
    public static class383[] field1675;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[[[B")
    public byte[][][] field1668;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IC)Z", line = 5)
    public static final boolean method756(int arg0, char arg1) {
        field1666++;
        if (arg0 == -1) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lvk;I)Ljava/lang/String;", line = 18)
    public static final String method757(class207 arg0, int arg1) {
        if (arg1 != -18357) {
            method756(99, '\u0001');
        }
        field1678++;
        return arg0.field2798 == null || arg0.field2798.length() <= 0 ? arg0.field2805 : arg0.field2805 + class154.field2182 + arg0.field2798;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)V", line = 38)
    public static void method758(int arg0) {
        field1675 = null;
        if (arg0 != -3) {
            method758(16);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIIII)I", line = 53)
    public static final int method759(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg1;
            arg1 = var7;
        }
        field1667++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg0;
        } else if (~var8 == arg5) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return 1 - (arg1 - (7 - arg0));
        }
    }
}
