import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class224 extends class47 {

    @OriginalMember(owner = "client!gj", name = "Vb", descriptor = "Lok;")
    public static class146 field3734 = class235.method1724(-12908, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!gj", name = "cc", descriptor = "Lok;")
    private static class146 field3741 = class235.method1724(-12908, "Please wait)3)3)3");

    @OriginalMember(owner = "client!gj", name = "Yb", descriptor = "Lok;")
    public static class146 field3737 = class235.method1724(-12908, ")2");

    @OriginalMember(owner = "client!gj", name = "Zb", descriptor = "Lok;")
    public static class146 field3738 = field3741;

    @OriginalMember(owner = "client!gj", name = "ac", descriptor = "[S")
    public static short[] field3739 = new short[500];

    @OriginalMember(owner = "client!gj", name = "dc", descriptor = "Lok;")
    public static class146 field3742 = class235.method1724(-12908, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!gj", name = "fc", descriptor = "Lok;")
    private static class146 field3744 = class235.method1724(-12908, "Use");

    @OriginalMember(owner = "client!gj", name = "Wb", descriptor = "Lok;")
    public static class146 field3735 = field3744;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!gj", name = "Mb", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!gj", name = "Nb", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!gj", name = "Ob", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!gj", name = "Pb", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!gj", name = "Qb", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!gj", name = "Rb", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!gj", name = "Sb", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!gj", name = "Ub", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!gj", name = "Xb", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!gj", name = "bc", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!gj", name = "ec", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!gj", name = "gc", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!gj", name = "Tb", descriptor = "Lch;")
    private class135 field3732;

    @OriginalMember(owner = "client!gj", name = "Lb", descriptor = "[I")
    public static int[] field3724;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[B)V", line = 7)
    public final void method1648(int arg0, int arg1, int arg2, byte[] arg3) {
        field3733++;
        for (int var5 = 0; var5 < arg1; var5++) {
            arg3[arg0 + var5] = (byte) (this.field860[this.field857++] - this.field3732.method1000(false));
        }
        if (arg2 > -59) {
            method1657((class315) null, (byte) 38);
        }
    }

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(B)I", line = 26)
    public final int method1649(byte arg0) {
        int var2 = -13 / ((90 - arg0) / 36);
        field3731++;
        return this.field860[this.field857++] - this.field3732.method1000(false) & 0xFF;
    }

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "(II)I", line = 35)
    public final int method1650(int arg0, int arg1) {
        if (arg0 != 4) {
            field3734 = (class146) null;
        }
        field3740++;
        return arg1 * 8 - this.field3730;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I)V", line = 57)
    public class224(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V", line = 61)
    public static final void method1651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3728++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg4;
        int var11 = arg7 - arg6;
        int var12 = arg7 * arg7;
        int var13 = arg4 - arg6;
        int var14 = arg4 * arg4;
        int var15 = var13 * var13;
        int var16 = var14 << 1;
        int var17 = var12 << 1;
        int var18 = var15 << 1;
        int var19 = var11 * var11;
        int var20 = arg4 << 1;
        int var21 = var13 << 1;
        int var22 = (1 - var20) * var12 + var16;
        int var23 = var19 << 1;
        int var24 = (1 - var21) * var19 + var18;
        int var25 = var14 << 2;
        int var26 = var12 << 2;
        int var27 = var14 - ((var20 - 1) * var17);
        int var28 = var19 << 2;
        int var29 = var15 << 2;
        int var30 = var15 - ((var21 - 1) * var23);
        int var31 = var16 * 3;
        int var32 = (var20 - 3) * var17;
        int var33 = var18 * 3;
        int var34 = var25;
        int var35 = (var21 - 3) * var23;
        int var36 = (arg4 - 1) * var26;
        if (arg1 != 256) {
            field3734 = (class146) null;
        }
        int var37 = (var13 - 1) * var28;
        if (class123.field2008 <= arg0 && class318.field5394 >= arg0) {
            int[] var38 = class81.field1297[arg0];
            int var39 = class21.method153(arg1 ^ 0xFFFFFE81, arg3 - arg7, class151.field2564, class126.field2058);
            int var40 = class21.method153(-118, arg3 + arg7, class151.field2564, class126.field2058);
            int var41 = class21.method153(-123, arg3 - var11, class151.field2564, class126.field2058);
            int var42 = class21.method153(-117, arg3 + var11, class151.field2564, class126.field2058);
            class40.method281(arg5, var39, var38, var41, 7);
            class40.method281(arg2, var41, var38, var42, arg1 ^ 0x107);
            class40.method281(arg5, var42, var38, var40, 7);
        }
        int var43 = var29;
        while (var10 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var8++;
                    var22 += var31;
                    var27 += var34;
                    var31 += var25;
                    var34 += var25;
                }
            }
            if (var27 < 0) {
                var8++;
                var27 += var34;
                var22 += var31;
                var31 += var25;
                var34 += var25;
            }
            var22 += -var36;
            var27 += -var32;
            var32 -= var26;
            var36 -= var26;
            boolean var44 = var10 <= var13;
            var10--;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var9++;
                        var30 += var43;
                        var24 += var33;
                        var43 += var29;
                        var33 += var29;
                    }
                }
                if (var30 < 0) {
                    var30 += var43;
                    var9++;
                    var24 += var33;
                    var43 += var29;
                    var33 += var29;
                }
                var30 += -var35;
                var24 += -var37;
                var35 -= var28;
                var37 -= var28;
            }
            int var45 = arg0 + var10;
            int var46 = arg0 - var10;
            if (var45 >= class123.field2008 && class318.field5394 >= var46) {
                int var47 = class21.method153(-124, arg3 + var8, class151.field2564, class126.field2058);
                int var48 = class21.method153(arg1 - 376, -var8 + arg3, class151.field2564, class126.field2058);
                if (var44) {
                    int var49 = class21.method153(-123, arg3 + var9, class151.field2564, class126.field2058);
                    int var50 = class21.method153(-120, arg3 - var9, class151.field2564, class126.field2058);
                    if (class123.field2008 <= var46) {
                        int[] var51 = class81.field1297[var46];
                        class40.method281(arg5, var48, var51, var50, 7);
                        class40.method281(arg2, var50, var51, var49, 7);
                        class40.method281(arg5, var49, var51, var47, arg1 ^ 0x107);
                    }
                    if (var45 <= class318.field5394) {
                        int[] var52 = class81.field1297[var45];
                        class40.method281(arg5, var48, var52, var50, arg1 ^ 0x107);
                        class40.method281(arg2, var50, var52, var49, 7);
                        class40.method281(arg5, var49, var52, var47, 7);
                    }
                } else {
                    if (class123.field2008 <= var46) {
                        class40.method281(arg5, var48, class81.field1297[var46], var47, 7);
                    }
                    if (class318.field5394 >= var45) {
                        class40.method281(arg5, var48, class81.field1297[var45], var47, 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([IZ)V", line = 265)
    public final void method1652(int[] arg0, boolean arg1) {
        if (!arg1) {
            field3738 = (class146) null;
        }
        field3743++;
        this.field3732 = new class135(arg0);
    }

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "(I)V", line = 282)
    public final void method1653(int arg0) {
        this.field3730 = this.field857 * 8;
        field3725++;
        if (arg0 != 14051) {
            this.field3730 = -117;
        }
    }

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "(I)V", line = 309)
    public static void method1654(int arg0) {
        if (arg0 >= -57) {
            field3738 = (class146) null;
        }
        field3737 = null;
        field3738 = null;
        field3724 = null;
        field3744 = null;
        field3739 = null;
        field3741 = null;
        field3734 = null;
        field3735 = null;
        field3742 = null;
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(Z)V", line = 338)
    public final void method1655(boolean arg0) {
        field3727++;
        this.field857 = (this.field3730 + 7) / 8;
        if (arg0) {
            method1651(92, 122, 65, -22, -2, -67, -56, -20);
        }
    }

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "(II)V", line = 349)
    public final void method1656(int arg0, int arg1) {
        if (arg1 == 16) {
            this.field860[this.field857++] = (byte) (this.field3732.method1000(false) + arg0);
            field3729++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lan;B)V", line = 364)
    public static final void method1657(class315 arg0, byte arg1) {
        field3736++;
        short var2 = 256;
        for (int var3 = 0; var3 < class234.field3918.length; var3++) {
            class234.field3918[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * Math.random() * 128.0D);
            class234.field3918[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg1 < 107) {
            method1654(9);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < (var2 - 1); var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    field3724[var9] = (class234.field3918[var9 - 1] + class234.field3918[var9 + 128] + class234.field3918[var9 + 1] + class234.field3918[var9 + -128]) / 4;
                }
            }
            int[] var10 = class234.field3918;
            class234.field3918 = field3724;
            field3724 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field485; var12++) {
            for (int var13 = 0; var13 < arg0.field480; var13++) {
                if (arg0.field5355[var11++] != 0) {
                    int var14 = var12 + arg0.field490 + 16;
                    int var15 = arg0.field486 + var13 + 16;
                    int var16 = (var14 << 7) + var15;
                    class234.field3918[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I[BI)I", line = 459)
    public static final int method1658(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 22760) {
            field3739 = (short[]) null;
        }
        field3726++;
        return class7.method42(arg2, arg1, 0, 111);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(IZ)I", line = 487)
    public final int method1659(int arg0, boolean arg1) {
        int var3 = this.field3730 >> 3;
        int var4 = 0;
        int var5 = 8 - (this.field3730 & 0x7);
        field3723++;
        this.field3730 += arg0;
        while (arg0 > var5) {
            var4 += (this.field860[var3++] & class117.field1881[var5]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (class117.field1881[var5] & this.field860[var3]) + var4;
        } else {
            var6 = (this.field860[var3] >> var5 - arg0 & class117.field1881[arg0]) + var4;
        }
        if (arg1) {
            this.method1652((int[]) null, true);
        }
        return var6;
    }
}
