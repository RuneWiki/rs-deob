import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class221 extends class209 {

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
    public static int[] field3585 = new int[256];

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "[I")
    public static int[] field3588 = new int[50];

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lej;")
    public static class204 field3591;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "Luf;")
    public static class168 field3593;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "B")
    public byte field3590;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public int field3584;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lfj;")
    public class283 field3587;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(B)V", line = 15)
    public static void method1524(byte arg0) {
        if (arg0 == 22) {
            field3593 = null;
            field3591 = null;
            field3588 = null;
            field3585 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILtb;)V", line = 30)
    public static final void method1525(int arg0, class189 arg1) {
        field3586++;
        if (arg1.field3052 == 0) {
            return;
        }
        if (arg1.field3029 != -1 && arg1.field3029 < 32768) {
            class22 var2 = class190.field3065[arg1.field3029];
            if (var2 != null) {
                int var3 = arg1.field3027 - var2.field3027;
                int var4 = arg1.field3021 - var2.field3021;
                if (var3 != 0 || var4 != 0) {
                    arg1.field3037 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field3029 >= 32768) {
            int var5 = arg1.field3029 - 32768;
            if (class65.field873 == var5) {
                var5 = 2047;
            }
            class54 var6 = class9.field117[var5];
            if (var6 != null) {
                int var7 = arg1.field3027 - var6.field3027;
                int var8 = arg1.field3021 - var6.field3021;
                if (var7 != 0 || var8 != 0) {
                    arg1.field3037 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((~arg1.field3017 != arg0 || arg1.field3050 != 0) && (arg1.field2997 == 0 || arg1.field3016 > 0)) {
            int var9 = arg1.field3012 * 64 + arg1.field3027 - ((-class182.field2916 + arg1.field3017 + -class182.field2916) * 64) - 64;
            int var10 = arg1.field3021 + (-64 - -(arg1.field3012 * 64)) - (arg1.field3050 - class276.field4641 - class276.field4641) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field3037 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field3050 = 0;
            arg1.field3017 = 0;
        }
        int var11 = arg1.field3037 - arg1.field3008 & 0x7FF;
        if (var11 == 0) {
            arg1.field3048 = 0;
            return;
        }
        arg1.field3048++;
        if (var11 <= 1024) {
            arg1.field3008 += arg1.field3052;
            boolean var12 = true;
            if (var11 < arg1.field3052 || (2048 - arg1.field3052) < var11) {
                var12 = false;
                arg1.field3008 = arg1.field3037;
            }
            if (arg1.field3045 == arg1.field3002 && (arg1.field3048 > 25 || var12)) {
                if (arg1.field2996 == -1) {
                    arg1.field3045 = arg1.field3056;
                } else {
                    arg1.field3045 = arg1.field2996;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field3008 -= arg1.field3052;
            if (var11 < arg1.field3052 || (2048 - arg1.field3052) < var11) {
                arg1.field3008 = arg1.field3037;
                var13 = false;
            }
            if (arg1.field3045 == arg1.field3002 && (arg1.field3048 > 25 || var13)) {
                if (arg1.field3046 == -1) {
                    arg1.field3045 = arg1.field3056;
                } else {
                    arg1.field3045 = arg1.field3046;
                }
            }
        }
        arg1.field3008 &= 0x7FF;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([[II)V", line = 148)
    public static final void method1526(int[][] arg0, int arg1) {
        field3589++;
        class284.field4810 = arg0;
        if (arg1 != 2047) {
            method1524((byte) 4);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3585[var0] = var1;
        }
        field3591 = new class204(32);
        field3593 = class148.method1019(-1720, "<br>(X100(U(Y");
        field3592 = -1;
    }
}
