import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[[I")
    public static int[][] field1729 = new int[5][5000];

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Z")
    public static volatile boolean field1737 = true;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lmh;")
    public static class151 field1730 = new class151(0, 0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public int field1721;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public int field1726;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "J")
    public long field1720;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lnk;")
    public static class127 field1738;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ldc;")
    public class235 field1722;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "Ldc;")
    public class235 field1731;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Ldc;")
    public class235 field1736;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "Lle;")
    public static class42 field1740;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Lpk;")
    public static class99 field1725;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[S")
    public static short[] field1739;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static final void method691(int arg0) {
        if (arg0 >= 1) {
            field1724++;
            class133.field2315.method1390((byte) 110);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static final void method692(boolean arg0) {
        class100.field1797 = null;
        class111.field1931 = null;
        class186.field3292 = null;
        class31.field632 = null;
        if (!arg0) {
            field1725 = null;
        }
        class47.field943 = null;
        field1728++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III[Lqk;[S)V")
    public static final void method693(int arg0, int arg1, int arg2, class207[] arg3, short[] arg4) {
        if (arg0 != 2047) {
            field1739 = null;
        }
        if (arg2 > arg1) {
            int var5 = (arg1 + arg2) / 2;
            class207 var6 = arg3[var5];
            int var7 = arg1;
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var6;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var6 == null || arg3[var9] != null && arg3[var9].method1424(124, var6) < (var9 & 0x1)) {
                    class207 var10 = arg3[var9];
                    arg3[var9] = arg3[var7];
                    arg3[var7] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7++] = var11;
                }
            }
            arg3[arg2] = arg3[var7];
            arg3[var7] = var6;
            arg4[arg2] = arg4[var7];
            arg4[var7] = var8;
            method693(2047, arg1, var7 - 1, arg3, arg4);
            method693(arg0, var7 + 1, arg2, arg3, arg4);
        }
        field1732++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILmd;IIIIB)V")
    public static final void method694(int arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1733++;
        if (arg6 > -40) {
            method691(91);
        }
        int var7 = arg2 * arg2 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg1.field4037 / 2, arg1.field3948 / 2);
        if (var7 <= var8 * var8) {
            class212.method1515(arg1, class261.field4653[arg3], arg0, arg2, 125, arg5, arg4);
            return;
        }
        var8 -= 10;
        int var9 = class70.field1254 + class266.field4711 & 0x7FF;
        int var10 = class257.field4597[var9];
        int var11 = var10 * 256 / (class225.field4098 + 256);
        int var12 = class257.field4598[var9];
        int var13 = var12 * 256 / (class225.field4098 + 256);
        int var14 = arg2 * var13 + arg4 * var11 >> 16;
        int var15 = arg2 * var11 - arg4 * var13 >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class139) class83.field1530[arg3]).method382(arg1.field4037 / 2 + arg0 + var18 - 10, arg5 - -(arg1.field3948 / 2) - var19 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLpk;Lpk;I)V")
    public static final void method695(boolean arg0, class99 arg1, class99 arg2, int arg3) {
        class173.field3116 = arg2;
        class170.field3022 = arg1;
        class22.field416 = arg0;
        field1723++;
        if (arg3 <= 61) {
            field1738 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method696(int arg0) {
        field1738 = null;
        if (arg0 != -8897776) {
            field1730 = null;
        }
        field1725 = null;
        field1740 = null;
        field1739 = null;
        field1729 = null;
        field1730 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Z")
    public static final boolean method697(int arg0, int arg1) {
        field1734++;
        if (class165.field2923[arg0]) {
            return true;
        } else if (class154.field2670.method718(arg0, (byte) -65)) {
            int var2 = class154.field2670.method698(7, arg0);
            if (var2 == 0) {
                class165.field2923[arg0] = true;
                return true;
            }
            if (class227.field4162[arg0] == null) {
                class227.field4162[arg0] = new class220[var2];
            }
            if (arg1 != 4401) {
                field1729 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class227.field4162[arg0][var3] == null) {
                    byte[] var4 = class154.field2670.method705(arg0, var3, arg1 - 4402);
                    if (var4 != null) {
                        class220 var5 = class227.field4162[arg0][var3] = new class220();
                        var5.field3933 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1557(new class149(var4), arg1 ^ 0xFFFFEE95);
                        } else {
                            var5.method1569(new class149(var4), (byte) -105);
                        }
                    }
                }
            }
            class165.field2923[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
