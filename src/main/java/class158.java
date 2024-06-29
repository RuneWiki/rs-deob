import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class158 extends class259 {

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "[I")
    public static int[] field2460 = new int[4096];

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "[I")
    public static int[] field2463 = new int[50];

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[[I")
    public static int[][] field2454;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIILff;Lff;IIIIJ)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, class4 arg4, class4 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class272 var12 = new class272();
        var12.field4393 = arg10;
        var12.field4397 = arg1 * 128 + 64;
        var12.field4396 = arg2 * 128 + 64;
        var12.field4403 = arg3;
        var12.field4402 = arg4;
        var12.field4401 = arg5;
        var12.field4405 = arg6;
        var12.field4407 = arg7;
        var12.field4398 = arg8;
        var12.field4406 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class223.field3286[var13][arg1][arg2] == null) {
                class223.field3286[var13][arg1][arg2] = new class313(var13, arg1, arg2);
            }
        }
        class223.field3286[arg0][arg1][arg2].field5023 = var12;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)I")
    public static final int method1154(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class244.field3592[arg2 * 1024 / arg0] >> 1;
        field2455++;
        return arg3 == -1737658303 ? ((65536 - var5) * arg4 >> 16) + (arg1 * var5 >> 16) : -7;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BILjava/lang/String;II[B)I")
    public static final int method1155(byte arg0, int arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        field2459++;
        int var6 = arg4 - arg1;
        int var7 = 0;
        if (arg0 != -111) {
            method1156(71);
        }
        while (var7 < var6) {
            char var8 = arg2.charAt(arg1 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg3 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg3 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg3 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg3 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg3 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg3 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg3 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg3 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg3 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg3 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg3 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg3 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg3 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg3 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg3 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg3 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg3 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg3 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg3 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg3 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg3 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg3 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg3 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg3 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg3 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg3 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg3 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg3 + var7] = -97;
            } else {
                arg5[arg3 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public static final void method1156(int arg0) {
        class258.field4001 = false;
        class255.field3855 = 0;
        class252.field3799 = 0;
        class113.field1883 = 0;
        field2461++;
        class201.field2963 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public static void method1157(boolean arg0) {
        field2454 = null;
        if (!arg0) {
            field2463 = null;
            field2460 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
    public class158(int arg0, int arg1) {
        this.field2458 = arg0;
        this.field2457 = arg1;
    }
}
