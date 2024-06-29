import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class227 extends class71 {

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "[I")
    public int[] field3604 = new int[] { 0 };

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "[I")
    public int[] field3606 = new int[] { -1 };

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "Z")
    public static boolean field3600;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "[I")
    public static int[] field3603;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIIIIII)V", line = 14)
    public static final void method1652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3607++;
        int var8 = class235.method1685(arg6, class235.field3735, class233.field3721, 122);
        int var9 = class235.method1685(arg3, class235.field3735, class233.field3721, 124);
        int var10 = class235.method1685(arg2, class231.field3697, class224.field3575, 117);
        int var11 = class235.method1685(arg7, class231.field3697, class224.field3575, 108);
        int var12 = class235.method1685(arg5 + arg6, class235.field3735, class233.field3721, 117);
        int var13 = class235.method1685(arg3 - arg5, class235.field3735, class233.field3721, 115);
        if (arg1 > -42) {
            return;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class245.method1738(48, class310.field4841[var14], var11, var10, arg4);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class245.method1738(48, class310.field4841[var15], var11, var10, arg4);
        }
        int var16 = class235.method1685(arg2 + arg5, class231.field3697, class224.field3575, 113);
        int var17 = class235.method1685(arg7 - arg5, class231.field3697, class224.field3575, 126);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class310.field4841[var18];
            class245.method1738(48, var19, var16, var10, arg4);
            class245.method1738(48, var19, var17, var16, arg0);
            class245.method1738(48, var19, var11, var17, arg4);
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIII)I", line = 66)
    public static final int method1653(int arg0, int arg1, int arg2, int arg3) {
        field3605++;
        if (class84.field1282 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        int var7 = arg0 & 0x7F;
        if (arg3 < 3 && (class81.field1229[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var8 = (128 - var7) * class84.field1282[var6][var4][var5 + 1] + (class84.field1282[var6][var4 + 1][var5 + 1] * var7) >> 7;
        int var9 = (128 - var7) * class84.field1282[var6][var4][var5] + class84.field1282[var6][var4 + 1][var5] * var7 >> 7;
        if (arg2 != -12282) {
            field3600 = false;
        }
        int var10 = arg1 & 0x7F;
        return (128 - var10) * var9 + (var8 * var10) >> 7;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V", line = 103)
    public static void method1654(int arg0) {
        int var1 = -53 % ((arg0 + 33) / 56);
        field3603 = null;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Ljava/lang/String;B)[B", line = 118)
    public static final byte[] method1655(String arg0, byte arg1) {
        field3602++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        int var4 = 0;
        if (arg1 != -23) {
            return (byte[]) null;
        }
        while (var2 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V", line = 259)
    public static final void method1656(int arg0) {
        class105.field1585 = 1;
        if (arg0 < 43) {
            field3603 = (int[]) null;
        }
        class113.field1694 = 0;
        class21.field311 = 0;
        class50.field687 = -1;
        class80.field1205 = -3;
        field3601++;
        class208.field3403 = false;
        class170.field2730 = 0;
    }
}
