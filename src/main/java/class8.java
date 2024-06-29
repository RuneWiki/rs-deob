import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class8 extends class396 {

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Ljava/lang/String;")
    public static String field103 = " has logged in.";

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "[Z")
    public static boolean[] field105 = new boolean[5];

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Z")
    public static boolean field97 = true;

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "F")
    public static float field107 = 0.0F;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Lcs;")
    private class189 field102;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Lra;")
    public static class57 field98;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
    public static void method72(int arg0) {
        field105 = null;
        field103 = null;
        field98 = null;
        int var1 = -82 % ((-arg0 - 31) / 51);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILbk;)V")
    private final void method73(int arg0, int arg1, class211 arg2) {
        field101++;
        if (arg0 != arg1) {
            return;
        }
        int var4 = arg2.method1342((byte) -127);
        if (this.field102 == null) {
            int var5 = class279.method1761(false, var4);
            this.field102 = new class189(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1342((byte) -127) == 1;
            int var8 = arg2.method1353(arg0 - 136);
            class359 var9;
            if (var7) {
                var9 = new class206(arg2.method1350(83));
            } else {
                var9 = new class193(arg2.method1336((byte) -32));
            }
            this.field102.method1202(-1, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lbk;B)V")
    public final void method74(class211 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1342((byte) -128);
            if (var3 == 0) {
                field96++;
                if (arg1 != -32) {
                    field105 = null;
                    return;
                }
                return;
            }
            this.method73(249, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)I")
    public final int method75(int arg0, int arg1, int arg2) {
        if (arg1 != -711) {
            method80(-102, true, (class57) null, 30, -119, -127);
        }
        field99++;
        if (this.field102 == null) {
            return arg0;
        } else {
            class193 var4 = (class193) this.field102.method1204((byte) -78, (long) arg2);
            return var4 == null ? arg0 : var4.field2631;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method76(String arg0, byte arg1) {
        if (arg1 != -25) {
            return null;
        }
        field108++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
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
        }
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjf;Z)I")
    public static final int method77(int arg0, class119 arg1, boolean arg2) {
        field100++;
        if (!arg2) {
            method80(-123, true, (class57) null, -72, -118, 86);
        }
        if (!client.method1076(arg1).method31((byte) -39, arg0) && arg1.field1526 == null) {
            return -1;
        } else if (arg1.field1585 == null || arg0 >= arg1.field1585.length) {
            return -1;
        } else {
            return arg1.field1585[arg0];
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method78(String arg0, int arg1, int arg2) {
        if (arg2 != 16083) {
            field98 = null;
        }
        field109++;
        if (this.field102 == null) {
            return arg0;
        } else {
            class206 var4 = (class206) this.field102.method1204((byte) -114, (long) arg1);
            return var4 == null ? arg0 : var4.field2813;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZII)I")
    public static final int method79(int arg0, boolean arg1, int arg2, int arg3) {
        field106++;
        class417 var4 = (class417) class201.field2774.method1204((byte) -118, (long) arg3);
        if (var4 == null) {
            return 0;
        }
        int var5 = arg0;
        for (int var6 = 0; var6 < var4.field5987.length; var6++) {
            if (var4.field5987[var6] >= 0 && var4.field5987[var6] < class350.field5116) {
                class260 var7 = class392.method2498(var4.field5987[var6], arg0 ^ 0xFFFFFF83);
                int var8 = var7.method1620(arg2, arg0 + 16, class349.method2223(false, arg2).field2451);
                if (arg1) {
                    var5 += var4.field5984[var6] * var8;
                } else {
                    var5 += var8;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZLra;III)V")
    public static final void method80(int arg0, boolean arg1, class57 arg2, int arg3, int arg4, int arg5) {
        class397.field5794 = arg2;
        class419.field6026 = arg3;
        field104++;
        class246.field3349 = arg5;
        class30.field272 = 1;
        class379.field5570 = arg1;
        class337.field5001 = 10000;
        class433.field6248 = arg0;
        if (arg4 >= -57) {
            field103 = null;
        }
    }
}
