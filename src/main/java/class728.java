import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class728 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "[S")
    public static short[] field10190 = new short[256];

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field10191 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "[[[I")
    public static int[][][] field10187;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
    public static void method4085(boolean arg0) {
        field10190 = null;
        field10187 = null;
        if (!arg0) {
            method4087(-122, 116, -59);
        }
        field10191 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lkn;Z)I")
    public static final int method4086(class770 arg0, boolean arg1) {
        field10188++;
        if (!arg1) {
            field10190 = null;
        }
        if (class770.field10610 == arg0) {
            return 5120;
        } else if (class770.field10612 == arg0) {
            return 5122;
        } else if (class770.field10613 == arg0) {
            return 5124;
        } else if (class770.field10614 == arg0) {
            return 5121;
        } else if (class770.field10615 == arg0) {
            return 5123;
        } else if (class770.field10616 == arg0) {
            return 5125;
        } else if (class770.field10617 == arg0) {
            return 5131;
        } else if (class770.field10618 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Lge;")
    public static final class736 method4087(int arg0, int arg1, int arg2) {
        class379 var3 = class378.field5427[arg0][arg1][arg2];
        return var3 == null || var3.field5446 == null ? null : var3.field5446;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Laa;ILwq;IIIIILkf;Ljava/lang/String;Lda;I)V")
    public static final void method4088(class510 arg0, int arg1, class176 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class263 arg8, String arg9, class67 arg10, int arg11) {
        field10189++;
        int var12;
        if (class763.field10510 == 4) {
            var12 = (int) class562.field8001 & 0x3FFF;
        } else {
            var12 = (int) class562.field8001 + class77.field1042 & 0x3FFF;
        }
        int var13 = Math.max(arg2.field2673 / 2, arg2.field2664 / 2) + 10;
        int var14 = arg1 * arg1 + arg7 * arg7;
        if (var14 > (var13 * var13)) {
            return;
        }
        if (arg5 != -30850) {
            method4086(null, false);
        }
        int var15 = class601.field8476[var12];
        int var16 = class601.field8473[var12];
        if (class763.field10510 != 4) {
            var16 = var16 * 256 / (class611.field8630 + 256);
            var15 = var15 * 256 / (class611.field8630 + 256);
        }
        int var17 = arg1 * var16 + arg7 * var15 >> 14;
        int var18 = arg7 * var16 - arg1 * var15 >> 14;
        int var19 = arg8.method1736(100, null, arg9, arg5 + 30850);
        int var20 = var17 - var19 / 2;
        int var21 = arg8.method1734(100, 0, 0, arg9, null);
        if (var20 >= (-arg2.field2673) && arg2.field2673 >= var20 && var18 >= (-arg2.field2664) && var18 <= arg2.field2664) {
            arg10.method516(arg11 + (arg2.field2664 / 2) + (-var18 - var21) - arg4, 50, arg9, arg11, arg3, 0, var19, 0, arg6, arg3 + (arg2.field2673 / 2) + var20, (byte) 89, 1, arg0, null, null, 0);
        }
    }
}
