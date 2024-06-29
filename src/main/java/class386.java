import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class386 extends class446 {

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    private int field5543;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
    public static int[] field5537 = new int[32];

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Ljava/lang/String;")
    public static String field5539 = null;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "Z")
    public static boolean field5545 = false;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lms;")
    public static class453 field5538;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "[Lbm;")
    public class60[] field5547;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "[[B")
    private byte[][] field5546;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Z", line = 5)
    public final boolean method2443(int arg0, byte arg1) {
        if (arg1 == -109) {
            field5549++;
            return this.field5547[arg0].field822;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Z", line = 22)
    public final boolean method2444(int arg0, int arg1) {
        int var3 = -89 / ((16 - arg1) / 51);
        field5544++;
        return this.field5547[arg0].field827;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(BI)I", line = 34)
    public static final int method2445(byte arg0, int arg1) {
        field5548++;
        if (arg0 != -97) {
            return -33;
        }
        class269 var2 = class325.method2089(arg1, (byte) 58);
        int var3 = var2.field3744;
        int var4 = var2.field3746;
        int var5 = var2.field3750;
        int var6 = class48.field681[var5 - var4];
        return var6 & class297.field4156[var3] >> var4;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I", line = 55)
    public static final int method2446(int arg0, int arg1) {
        if (arg1 != -6819) {
            return -83;
        }
        field5540++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Z", line = 91)
    public final boolean method2447(int arg0) {
        field5550++;
        if (this.field5547 != null) {
            return true;
        }
        if (this.field5546 == null) {
            if (!class99.field1377.method1764(this.field5543, false)) {
                return false;
            }
            int[] var2 = class99.field1377.method1750((byte) -107, this.field5543);
            this.field5546 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field5546[var3] = class99.field1377.method1745(var2[var3], (byte) -103, this.field5543);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field5546.length; var5++) {
            byte[] var14 = this.field5546[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= client.field2281.method1759(-65, var15);
        }
        if (!var4) {
            return false;
        }
        class90 var6 = new class90();
        int var7 = class99.field1377.method1739(arg0 ^ 0x56, this.field5543);
        this.field5547 = new class60[var7];
        int[] var8 = class99.field1377.method1750((byte) -110, this.field5543);
        for (int var9 = arg0; var9 < var8.length; var9++) {
            byte[] var10 = this.field5546[var9];
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            class180 var12 = null;
            for (class180 var13 = (class180) var6.method646(arg0 + 48); var13 != null; var13 = (class180) var6.method641(false)) {
                if (var13.field2471 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class180(var11, client.field2281.method1757(-3, var11));
                var6.method643(var12, -60);
            }
            this.field5547[var8[var9]] = new class60(var10, var12);
        }
        this.field5546 = null;
        return true;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 185)
    public static void method2448(byte arg0) {
        field5537 = null;
        field5539 = null;
        int var1 = 68 % ((-arg0 - 25) / 52);
        field5538 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/awt/Canvas;IILja;)Luo;", line = 199)
    public static final class345 method2449(Canvas arg0, int arg1, int arg2, class152 arg3) {
        if (arg2 != 0) {
            field5538 = null;
        }
        field5541++;
        return new class8(arg0, arg3, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V", line = 209)
    public class386(int arg0) {
        this.field5543 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V", line = 217)
    public static final void method2450(byte arg0) {
        field5542++;
        if (arg0 >= -3) {
            field5545 = true;
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class377.field5395[var1] = true;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIIILjava/lang/String;)I", line = 234)
    public static final int method2451(int arg0, byte[] arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg3 != -403) {
            method2451(36, (byte[]) null, 117, -59, -15, (String) null);
        }
        field5551++;
        int var6 = arg2 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg4 + var7] = -97;
            } else {
                arg1[arg4 + var7] = 63;
            }
        }
        return var6;
    }
}
