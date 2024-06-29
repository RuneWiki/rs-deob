import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class664 {

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field9315 = -1;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "[C")
    public static char[] field9319 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "[I")
    public static int[] field9318 = new int[14];

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field9317;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "[Lf;")
    public static class702[] field9316;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)I")
    public static final int method3756(int arg0, int arg1, int arg2, int arg3) {
        field9314++;
        if (arg3 != 4) {
            field9316 = null;
        }
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method3757(int arg0, String arg1) {
        field9317++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 >= -15) {
            method3757(-21, null);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILr;Ljs;)V")
    public static final void method3758(int arg0, int arg1, int arg2, int arg3, class166 arg4, class301 arg5) {
        field9320++;
        class122 var6 = class643.field8871.method358((byte) -26, arg5.field4117);
        if (var6.field1676 == -1) {
            return;
        }
        int var7;
        if (arg5.field4135) {
            int var8 = arg5.field4137 + arg3;
            var7 = var8 & 0x3;
        } else {
            var7 = 0;
        }
        class702 var9 = var6.method878(var7, arg4, (byte) -105, arg5.field4100);
        if (var9 == null) {
            return;
        }
        if (arg0 != -433139193) {
            field9318 = null;
        }
        int var10 = arg5.field4109;
        int var11 = arg5.field4119;
        if ((var7 & 0x1) == 1) {
            var10 = arg5.field4119;
            var11 = arg5.field4109;
        }
        int var12 = var9.method1660();
        int var13 = var9.method1661();
        if (var6.field1679) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field1677 == 0) {
            var9.method3932(arg2, arg1 - (var11 - 1) * 4, var12, var13);
        } else {
            var9.method3934(arg2, arg1 - ((var11 - 1) * 4), var12, var13, 0, var6.field1677 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static void method3759(byte arg0) {
        field9318 = null;
        if (arg0 < 94) {
            method3756(65, -21, -6, -50);
        }
        field9319 = null;
        field9316 = null;
    }
}
