import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class257 implements class236 {

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "Lbr;")
    public static class192 field3362 = new class192("", 12);

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "[C")
    public static char[] field3367 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wea", name = "h", descriptor = "Z")
    public static boolean field3368 = false;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!wea", name = "i", descriptor = "Lsca;")
    public static class235 field3369;

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "[[[J")
    public static long[][][] field3366;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method1551(int arg0, int arg1) {
        int var2 = 80 % ((arg0 - 10) / 41);
        field3363++;
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V", line = 19)
    public static void method1552(int arg0) {
        field3369 = null;
        field3362 = null;
        if (arg0 != 108) {
            method1553(-48, 92);
        }
        field3366 = null;
        field3367 = null;
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(II)I", line = 33)
    public static final int method1553(int arg0, int arg1) {
        return class190.field2637 == null ? 0 : class190.field2637[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Ltca;", line = 36)
    public final class141 method421(int arg0) {
        if (arg0 != 4) {
            method1553(125, 58);
        }
        field3361++;
        return class300.field3976;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIIII)V", line = 47)
    public static final void method1554(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3364++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        int var9 = class496.method2826(arg0 + arg2, (byte) 36, class281.field3703, class255.field3350);
        int var10 = class496.method2826(arg2 - arg0, (byte) 36, class281.field3703, class255.field3350);
        class285.method1691(var9, class315.field4224[arg3], -7, var10, arg4);
        if (arg1 != 1084629345) {
            method1553(11, 127);
        }
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class6.field66 && class151.field2071 >= var11) {
                    int var13 = class496.method2826(arg2 + var5, (byte) 36, class281.field3703, class255.field3350);
                    int var14 = class496.method2826(arg2 - var5, (byte) 36, class281.field3703, class255.field3350);
                    if (var12 <= class151.field2071) {
                        class285.method1691(var13, class315.field4224[var12], -7, var14, arg4);
                    }
                    if (class6.field66 <= var11) {
                        class285.method1691(var13, class315.field4224[var11], arg1 ^ 0xBF59DE98, var14, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class6.field66 <= var16 && class151.field2071 >= var15) {
                int var17 = class496.method2826(arg2 + var6, (byte) 36, class281.field3703, class255.field3350);
                int var18 = class496.method2826(arg2 - var6, (byte) 36, class281.field3703, class255.field3350);
                if (class151.field2071 >= var16) {
                    class285.method1691(var17, class315.field4224[var16], -7, var18, arg4);
                }
                if (var15 >= class6.field66) {
                    class285.method1691(var17, class315.field4224[var15], -7, var18, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(I)V", line = 130)
    public class257(int arg0) {
        this.field3365 = arg0;
    }
}
