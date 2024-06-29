import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class100 extends class128 {

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "[Lma;")
    public class312[] field1623;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "[I")
    public static int[] field1626 = new int[2];

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "Lnb;")
    public static class341 field1619 = new class341(16);

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "[[B")
    public static byte[][] field1618;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIBI)V", line = 8)
    public static final void method861(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1622++;
        if (arg1 >= class170.field2944 && arg1 <= class310.field4916) {
            int var5 = class105.method899(false, class135.field2358, class90.field1428, arg0);
            int var6 = class105.method899(false, class135.field2358, class90.field1428, arg2);
            class248.method1743(var6, arg4, 124, arg1, var5);
        }
        if (arg3 >= -95) {
            method862(-4, 74);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)I", line = 25)
    public static final int method862(int arg0, int arg1) {
        if (arg0 != 4096) {
            method868(false, -36);
        }
        field1616++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(II)Z", line = 36)
    public final boolean method863(int arg0, int arg1) {
        if (arg1 == 2) {
            field1624++;
            return this.field1623[arg0].field4944;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIZBIIFI)[I", line = 59)
    public static final int[] method864(int arg0, int arg1, boolean arg2, byte arg3, int arg4, int arg5, float arg6, int arg7) {
        field1625++;
        class284 var8 = new class284();
        var8.field4510 = arg0;
        int[] var9 = new int[arg5];
        var8.field4514 = arg7;
        var8.field4499 = arg1;
        var8.field4504 = (int) (arg6 * 4096.0F);
        var8.field4501 = arg2;
        if (arg3 != -3) {
            field1626 = (int[]) null;
        }
        var8.field4497 = arg4;
        var8.method182(25833);
        class74.method694(-64, arg5, 1);
        var8.method1935(-85, var9, 0);
        return var9;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)J", line = 83)
    public static final long method865(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null || var3.field4152 == null ? 0L : var3.field4152.field701;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/lang/String;ZC)[Ljava/lang/String;", line = 92)
    public static final String[] method866(String arg0, boolean arg1, char arg2) {
        field1620++;
        int var3 = class126.method1054(arg2, 22129, arg0);
        String[] var4 = new String[var3 + 1];
        if (!arg1) {
            return (String[]) null;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 127)
    public static void method867(byte arg0) {
        if (arg0 < 114) {
            field1626 = (int[]) null;
        }
        field1619 = null;
        field1618 = (byte[][]) null;
        field1626 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)V", line = 143)
    public static final void method868(boolean arg0, int arg1) {
        field1627++;
        if (arg1 >= -47) {
            return;
        }
        byte[][] var2;
        if (class43.field680 && arg0) {
            var2 = class144.field2624;
        } else {
            var2 = class310.field4910;
        }
        int var3 = class180.field3039.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class56.field866[var4] >> 8) * 64 - class24.field345;
                int var7 = (class56.field866[var4] & 0xFF) * 64 - class34.field484;
                class215.method1587(false);
                class266.method1833(class163.field2882, var5, var7, arg0, -7922, var6);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I[I[J)V", line = 182)
    public static final void method869(int arg0, int[] arg1, long[] arg2) {
        field1617++;
        if (arg0 > -15) {
            field1618 = (byte[][]) ((byte[][]) null);
        }
        class353.method2456(-28, arg1, arg2.length - 1, 0, arg2);
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(III)Ldl;", line = 195)
    public static final class44 method870(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4152;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lcg;Lcg;IZ)V", line = 204)
    public class100(class49 arg0, class49 arg1, int arg2, boolean arg3) {
        class331 var5 = new class331();
        int var6 = arg0.method455(arg2, true);
        this.field1623 = new class312[var6];
        int[] var7 = arg0.method430(arg2, (byte) -44);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method441(false, arg2, var7[var8]);
            class222 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class222 var12 = (class222) var5.method2297(14204); var12 != null; var12 = (class222) var5.method2291(75)) {
                if (var12.field3704 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method442(var11, 0, true);
                } else {
                    var13 = arg1.method442(0, var11, true);
                }
                var10 = new class222(var11, var13);
                var5.method2303((byte) -124, var10);
            }
            this.field1623[var7[var8]] = new class312(var9, var10);
        }
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(II)Z", line = 266)
    public final boolean method871(int arg0, int arg1) {
        field1621++;
        int var3 = 20 % ((arg1 + 39) / 54);
        return this.field1623[arg0].field4936;
    }
}
