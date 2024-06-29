import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class157 extends class129 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Z")
    public boolean field2951 = false;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[Z")
    public static boolean[] field2944 = new boolean[8];

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lrd;")
    private static class173 field2942 = class133.method843("Please use a different world)3", 117);

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lrd;")
    public static class173 field2946 = class133.method843("cross", 111);

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Lrd;")
    public static class173 field2948 = class133.method843(" GMT", -94);

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Lrd;")
    public static class173 field2939 = field2942;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "Lrd;")
    private static class173 field2952 = class133.method843("This world is full)3", 101);

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Lrd;")
    public static class173 field2953 = class133.method843("null", -105);

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lrd;")
    public static class173 field2941 = field2952;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Lrd;")
    public static class173 field2954 = field2942;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IB[Ldi;I[I)V")
    public static final void method1032(int arg0, int[] arg1, byte arg2, class40[] arg3, int arg4, int[] arg5) {
        if (arg0 > arg4) {
            int var6 = arg4 - 1;
            int var7 = arg0 + 1;
            int var8 = (arg0 + arg4) / 2;
            class40 var9 = arg3[var8];
            arg3[var8] = arg3[arg4];
            arg3[arg4] = var9;
            while (var6 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg5[var11] == 2) {
                            var13 = arg3[var7].field826;
                            var12 = var9.field826;
                        } else if (arg5[var11] == 1) {
                            var12 = var9.field832;
                            if (var12 == -1 && arg1[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = arg3[var7].field832;
                            if (var13 == -1 && arg1[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg5[var11] == 3) {
                            var12 = var9.field834 ? 1 : 0;
                            var13 = arg3[var7].field834 ? 1 : 0;
                        } else {
                            var13 = arg3[var7].field822;
                            var12 = var9.field822;
                        }
                        if (var12 != var13) {
                            if ((arg1[var11] != 1 || var12 >= var13) && (arg1[var11] != 0 || var12 <= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg5[var15] == 2) {
                            var16 = var9.field826;
                            var17 = arg3[var6].field826;
                        } else if (arg5[var15] == 1) {
                            var17 = arg3[var6].field832;
                            var16 = var9.field832;
                            if (var17 == -1 && arg1[var15] == 1) {
                                var17 = 2001;
                            }
                            if (var16 == -1 && arg1[var15] == 1) {
                                var16 = 2001;
                            }
                        } else if (arg5[var15] == 3) {
                            var16 = var9.field834 ? 1 : 0;
                            var17 = arg3[var6].field834 ? 1 : 0;
                        } else {
                            var16 = var9.field822;
                            var17 = arg3[var6].field822;
                        }
                        if (var16 != var17) {
                            if ((arg1[var15] != 1 || var16 <= var17) && (arg1[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var7) {
                    class40 var18 = arg3[var6];
                    arg3[var6] = arg3[var7];
                    arg3[var7] = var18;
                }
            }
            method1032(var7, arg1, (byte) 97, arg3, arg4, arg5);
            method1032(arg0, arg1, (byte) 42, arg3, var7 + 1, arg5);
        }
        field2938++;
        if (arg2 <= 26) {
            field2946 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLoh;)V")
    public static final void method1033(boolean arg0, class147 arg1) {
        if (class217.field4203 == arg1.field2759 || arg1.field2809 == -1 || arg1.field2763 != 0 || arg1.field2790 + 1 > class167.method1080(11098, arg1.field2809).field3498[arg1.field2752]) {
            int var2 = arg1.field2759 - arg1.field2812;
            int var3 = arg1.field2805 * 128 + arg1.field2754 * 64;
            int var4 = class217.field4203 - arg1.field2812;
            int var5 = arg1.field2802 * 128 + arg1.field2754 * 64;
            int var6 = arg1.field2776 * 128 + arg1.field2754 * 64;
            int var7 = arg1.field2761 * 128 + arg1.field2754 * 64;
            arg1.field2820 = ((var2 - var4) * var3 + var4 * var6) / var2;
            arg1.field2801 = ((var2 - var4) * var5 + var4 * var7) / var2;
        }
        arg1.field2775 = 0;
        if (!arg0) {
            return;
        }
        field2949++;
        if (arg1.field2751 == 0) {
            arg1.field2794 = 1024;
        }
        if (arg1.field2751 == 1) {
            arg1.field2794 = 1536;
        }
        if (arg1.field2751 == 2) {
            arg1.field2794 = 0;
        }
        if (arg1.field2751 == 3) {
            arg1.field2794 = 512;
        }
        arg1.field2786 = arg1.field2794;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JB)V")
    public static final void method1034(long arg0, byte arg1) {
        field2943++;
        if (arg0 == 0L) {
            return;
        }
        class165.field3175.method1023(71, -21822);
        if (arg1 >= -33) {
            field2953 = null;
        }
        class111.field2050++;
        class165.field3175.method756(arg0, 109);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)I")
    public static final int method1035(int arg0, int arg1, int arg2, byte[] arg3) {
        field2950++;
        int var4 = -1;
        int var5 = arg1;
        if (arg0 >= -16) {
            field2954 = null;
        }
        while (var5 < arg2) {
            var4 = class139.field2599[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method1036(int arg0) {
        field2941 = null;
        field2954 = null;
        field2946 = null;
        field2944 = null;
        field2952 = null;
        if (arg0 > 29) {
            field2948 = null;
            field2942 = null;
            field2939 = null;
            field2953 = null;
        }
    }
}
