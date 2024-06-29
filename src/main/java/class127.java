import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class127 extends class222 {

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    private int field1616;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    private int field1620;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    private int field1612;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "Lsv;")
    private class312 field1623;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[I")
    public static int[] field1611 = new int[500];

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
    public static int[] field1625 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lvea;")
    private class64 field1621;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Lvea;")
    public final class64 method765(int arg0) {
        int var2 = -65 / ((26 - arg0) / 54);
        field1614++;
        if (this.field1621 == null) {
            class479 var3 = this.field1623.field9731;
            class494.field6683[3] = this.field1620;
            class494.field6683[2] = this.field1616;
            class494.field6683[1] = this.field1615;
            class494.field6683[5] = this.field1624;
            class494.field6683[0] = this.field1612;
            class494.field6683[4] = this.field1618;
            byte var4 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < 6; var6++) {
                if (!var3.method1732(class494.field6683[var6], 81)) {
                    return null;
                }
                class568 var8 = var3.method1728(-111, class494.field6683[var6]);
                int var9 = var8.field7853 ? 64 : 128;
                if (var8.field7852 > 0) {
                    var4 = 1;
                }
                if (var5 < var9) {
                    var5 = var9;
                }
            }
            for (int var7 = 0; var7 < 6; var7++) {
                class85.field1043[var7] = var3.method1731(false, 1.0F, 26409, var5, var5, class494.field6683[var7]);
            }
            this.field1621 = this.field1623.method845((byte) 115, var4 != 0, var5, class85.field1043);
        }
        return this.field1621;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method766(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1610++;
        class238.method1476(arg4, -16236);
        int var7 = 0;
        int var8 = arg4 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg5 != 23539) {
            return;
        }
        int var14 = -1;
        int[] var15 = class319.field4673[arg3];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class653.method3620(var16, arg1 - arg4, false, arg2, var15);
        class653.method3620(var17, var16, false, arg0, var15);
        class653.method3620(arg1 + arg4, var17, false, arg2, var15);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class500.field6745[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var8 <= var9) {
                    int[] var18 = class319.field4673[arg3 + var9];
                    int[] var19 = class319.field4673[arg3 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class653.method3620(var20, var21, false, arg2, var18);
                    class653.method3620(var20, var21, false, arg2, var19);
                } else {
                    int[] var22 = class319.field4673[arg3 + var9];
                    int[] var23 = class319.field4673[arg3 - var9];
                    int var24 = class500.field6745[var9];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class653.method3620(var28, var26, false, arg2, var22);
                    class653.method3620(var27, var28, false, arg0, var22);
                    class653.method3620(var25, var27, false, arg2, var22);
                    class653.method3620(var28, var26, false, arg2, var23);
                    class653.method3620(var27, var28, false, arg0, var23);
                    class653.method3620(var25, var27, false, arg2, var23);
                }
            }
            int[] var29 = class319.field4673[arg3 + var7];
            int[] var30 = class319.field4673[arg3 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 >= var8) {
                class653.method3620(var31, var32, false, arg2, var29);
                class653.method3620(var31, var32, false, arg2, var30);
            } else {
                int var33 = var11 >= var7 ? var11 : class500.field6745[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class653.method3620(var35, var32, false, arg2, var29);
                class653.method3620(var34, var35, false, arg0, var29);
                class653.method3620(var31, var34, false, arg2, var29);
                class653.method3620(var35, var32, false, arg2, var30);
                class653.method3620(var34, var35, false, arg0, var30);
                class653.method3620(var31, var34, false, arg2, var30);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)[Lnd;")
    public static final class409[] method767(int arg0) {
        field1617++;
        return arg0 == 22141 ? new class409[] { class322.field4720, class664.field9401, class149.field1880 } : null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIILjava/lang/String;BI)I")
    public static final int method768(byte[] arg0, int arg1, int arg2, String arg3, byte arg4, int arg5) {
        field1622++;
        int var6 = arg1 - arg2;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg2 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg0[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg0[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg0[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg0[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg0[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg0[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg0[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg0[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg0[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg0[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg0[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg0[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg0[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg0[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg0[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg0[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg0[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg0[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg0[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg0[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg0[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg0[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg0[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg0[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg0[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg0[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg0[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg0[arg5 + var7] = -97;
            } else {
                arg0[arg5 + var7] = 63;
            }
        }
        if (arg4 == -22) {
            return var6;
        } else {
            return 18;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public static void method769(int arg0) {
        field1625 = null;
        if (arg0 != 17429) {
            method768(null, -95, -96, null, (byte) 64, -42);
        }
        field1611 = null;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lsv;IIIIII)V")
    public class127(class312 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1615 = arg2;
        this.field1624 = arg6;
        this.field1618 = arg5;
        this.field1616 = arg3;
        this.field1620 = arg4;
        this.field1612 = arg1;
        this.field1623 = arg0;
    }
}
