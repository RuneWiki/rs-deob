import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class270 extends class424 {

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "J")
    public static long field3589 = 20000000L;

    @OriginalMember(owner = "client!hw", name = "n", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!hw", name = "v", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!hw", name = "o", descriptor = "Lpe;")
    public static class615 field3586;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 3)
    public static void method1651(byte arg0) {
        if (arg0 != 84) {
            method1651((byte) 57);
        }
        field3586 = null;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIFIZ[FIII)V", line = 17)
    public static final void method1652(int arg0, int arg1, int arg2, float arg3, int arg4, boolean arg5, float[] arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg4;
        field3592++;
        int var11 = arg1 - arg9;
        int var12 = arg7 - arg2;
        if (!arg5) {
            method1652(-64, 75, -30, -1.589787F, 93, true, null, 10, 76, 70);
        }
        float var13 = arg6[2] * (float) var11 + arg6[1] * (float) var10 + arg6[0] * (float) var12;
        float var14 = arg6[5] * (float) var11 + arg6[3] * (float) var12 + arg6[4] * (float) var10;
        float var15 = arg6[8] * (float) var11 + arg6[7] * (float) var10 + arg6[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg3 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg8 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg8 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class201.field2623 = var18;
        class166.field2088 = var17;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIII)I", line = 74)
    public static final int method1653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3590++;
        if (class392.field4997 == null) {
            return 0;
        }
        if (~arg3 > arg2) {
            int var6 = arg1 >> 9;
            int var7 = arg5 >> 9;
            if (arg0 < 0 || arg4 < 0 || arg0 > class611.field8258 - 1 || (class656.field9155 - 1) < arg4) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class611.field8258 - 1 < var6 || var7 > (class656.field9155 - 1)) {
                return 0;
            }
            boolean var8 = (class159.field1994[1][arg1 >> 9][arg5 >> 9] & 0x2) != 0;
            if ((arg1 & 0x1FF) == 0) {
                boolean var9 = (class159.field1994[1][var6 - 1][arg5 >> 9] & 0x2) != 0;
                boolean var10 = (class159.field1994[1][var6][arg5 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class159.field1994[1][arg0][arg4] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x1FF) == 0) {
                boolean var11 = (class159.field1994[1][arg1 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class159.field1994[1][arg1 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class159.field1994[1][arg0][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg3++;
            }
        }
        return class392.field4997[arg3].method669(arg1, arg5);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBII)I", line = 135)
    public static final int method1654(int arg0, byte arg1, int arg2, int arg3) {
        field3593++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg3;
        int var5 = (arg0 & 0x7F) * arg3 + (arg2 & 0x7F) * var4 >> 7;
        int var6 = 47 / ((arg1 - 58) / 41);
        int var7 = (arg0 & 0x380) * arg3 + (arg2 & 0x380) * var4 >> 7;
        int var8 = (arg0 & 0xFC00) * arg3 + (arg2 & 0xFC00) * var4 >> 7;
        return var8 & 0xFC00 | var7 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLut;)Z", line = 160)
    public static final boolean method1655(boolean arg0, class620 arg1) {
        field3587++;
        class698 var2 = class348.field4436.method1900(-120, arg1.method76((byte) -108));
        if (var2.field9621 == -1) {
            return true;
        }
        class631 var3 = class414.field5331.method2890((byte) -127, var2.field9621);
        if (var3.field8803 == -1) {
            return true;
        } else {
            if (!arg0) {
                method1654(86, (byte) -21, 124, -97);
            }
            return var3.method3504((byte) 114);
        }
    }
}
