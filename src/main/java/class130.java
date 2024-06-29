import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class130 {

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "J")
    public long field2230 = 0L;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lce;")
    public static class126 field2231 = class206.method1445(-7923, "overlay");

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lca;")
    public static class124 field2229 = class266.method1800(57);

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Lce;")
    private static class126 field2241 = class206.method1445(-7923, "Loading world list data");

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "Lce;")
    public static class126 field2242 = field2241;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field2228;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field2233;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public int field2240;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lja;")
    public class114 field2234;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lja;")
    public class114 field2239;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Lan;", line = 4)
    public static final class12 method906(int arg0, int arg1) {
        field2235++;
        class12 var2 = (class12) class75.field1208.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class288.field4786.method2173(16, arg0, (byte) -51);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method68(new class134(var3), 3);
        }
        if (arg1 >= -124) {
            method912((class313) null, -19, false);
        }
        class75.field1208.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 31)
    public static void method907(int arg0) {
        field2242 = null;
        field2241 = null;
        if (arg0 != 1) {
            field2242 = (class126) null;
        }
        field2231 = null;
        field2229 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILcc;Z)[Lie;", line = 47)
    public static final class2[] method908(int arg0, int arg1, class313 arg2, boolean arg3) {
        field2225++;
        if (!arg3) {
            method909((class112) null, -2, 127);
        }
        return class298.method2012(arg0, (byte) -110, arg2, arg1) ? class214.method1488(3121) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lwd;II)Lce;", line = 71)
    public static final class126 method909(class112 arg0, int arg1, int arg2) {
        field2232++;
        if (!class294.method1951(client.method804(arg0), arg1, -18617) && arg0.field1782 == null) {
            return null;
        } else if (arg0.field1922 == null || arg0.field1922.length <= arg1 || arg0.field1922[arg1] == null || arg0.field1922[arg1].method877(-111).method878((byte) 105) == 0) {
            return class241.field4091 ? class12.method69(new class126[] { class29.field410, class195.method1386((byte) 20, arg1) }, (byte) 124) : null;
        } else {
            if (arg2 != 128) {
                method909((class112) null, 58, -27);
            }
            return arg0.field1922[arg1];
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)I", line = 95)
    public static int method910(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)Z", line = 118)
    public static final boolean method911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class26.field369[arg0][var8][var9] == -class128.field2199) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class264.field4396[arg0][arg1][arg3] + arg5;
            if (!class8.method43(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class8.method43(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class8.method43(var10, var12, var14)) {
                return false;
            } else if (class8.method43(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class29.method138(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class8.method43(var6 + 1, class264.field4396[arg0][arg1][arg3] + arg5, var7 + 1) && class8.method43(var6 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class8.method43(var6 + 128 - 1, class264.field4396[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class8.method43(var6 + 1, class264.field4396[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lcc;IZ)Ljk;", line = 178)
    public static final class273 method912(class313 arg0, int arg1, boolean arg2) {
        field2237++;
        if (class189.method1354(arg1, 90, arg0)) {
            if (arg2) {
                method909((class112) null, 62, 4);
            }
            return class10.method62((byte) -59);
        } else {
            return null;
        }
    }
}
