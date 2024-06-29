import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class115 extends class96 {

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "I")
    public int field2860 = 0;

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "[[B")
    private byte[][] field2876 = new byte[256][];

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "Ljava/util/Random;")
    private Random field2866 = new Random();

    @OriginalMember(owner = "client!ra", name = "tb", descriptor = "[I")
    private int[] field2880;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "[I")
    private int[] field2871;

    @OriginalMember(owner = "client!ra", name = "ub", descriptor = "[I")
    private int[] field2881;

    @OriginalMember(owner = "client!ra", name = "zb", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!ra", name = "Ab", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "Loc;")
    private static class99 field2862 = class48.method402((byte) -104, "blu");

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "Loc;")
    private static class99 field2864 = class48.method402((byte) -104, "yel");

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "Loc;")
    private static class99 field2859 = class48.method402((byte) -104, "dre");

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "Loc;")
    private static class99 field2861 = class48.method402((byte) -104, "red");

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "Loc;")
    private static class99 field2872 = class48.method402((byte) -104, "gr1");

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "Loc;")
    private static class99 field2863 = class48.method402((byte) -104, "or2");

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "Loc;")
    private static class99 field2868 = class48.method402((byte) -104, "or1");

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Loc;")
    private static class99 field2869 = class48.method402((byte) -104, "@str@");

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "[Loc;")
    private static class99[] field2875 = new class99[100];

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "Loc;")
    private static class99 field2865 = class48.method402((byte) -104, "str");

    @OriginalMember(owner = "client!ra", name = "rb", descriptor = "Loc;")
    private static class99 field2878 = class48.method402((byte) -104, "or3");

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "Loc;")
    private static class99 field2867 = class48.method402((byte) -104, "mag");

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "Loc;")
    private static class99 field2870 = class48.method402((byte) -104, "lre");

    @OriginalMember(owner = "client!ra", name = "xb", descriptor = "Loc;")
    private static class99 field2884 = class48.method402((byte) -104, "bla");

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "Loc;")
    private static class99 field2873 = class48.method402((byte) -104, "dbl");

    @OriginalMember(owner = "client!ra", name = "wb", descriptor = "Loc;")
    private static class99 field2883 = class48.method402((byte) -104, "gr2");

    @OriginalMember(owner = "client!ra", name = "sb", descriptor = "Loc;")
    private static class99 field2879 = class48.method402((byte) -104, "whi");

    @OriginalMember(owner = "client!ra", name = "qb", descriptor = "Loc;")
    private static class99 field2877 = class48.method402((byte) -104, "gr3");

    @OriginalMember(owner = "client!ra", name = "yb", descriptor = "Loc;")
    private static class99 field2885 = class48.method402((byte) -104, "gre");

    @OriginalMember(owner = "client!ra", name = "vb", descriptor = "Z")
    private static boolean field2882 = false;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "Loc;")
    private static class99 field2874 = class48.method402((byte) -104, "cya");

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IIIZ)V")
    public final void method966(class99 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method983(arg0, arg1 - this.method970(arg0), arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;)I")
    private final int method967(class99 arg0) {
        if (arg0.method829(field2861, 4)) {
            return 16711680;
        } else if (arg0.method829(field2885, 4)) {
            return 65280;
        } else if (arg0.method829(field2862, 4)) {
            return 255;
        } else if (arg0.method829(field2864, 4)) {
            return 16776960;
        } else if (arg0.method829(field2874, 4)) {
            return 65535;
        } else if (arg0.method829(field2867, 4)) {
            return 16711935;
        } else if (arg0.method829(field2879, 4)) {
            return 16777215;
        } else if (arg0.method829(field2884, 4)) {
            return 0;
        } else if (arg0.method829(field2870, 4)) {
            return 16748608;
        } else if (arg0.method829(field2859, 4)) {
            return 8388608;
        } else if (arg0.method829(field2873, 4)) {
            return 128;
        } else if (arg0.method829(field2868, 4)) {
            return 16756736;
        } else if (arg0.method829(field2863, 4)) {
            return 16740352;
        } else if (arg0.method829(field2878, 4)) {
            return 16723968;
        } else if (arg0.method829(field2872, 4)) {
            return 12648192;
        } else if (arg0.method829(field2883, 4)) {
            return 8453888;
        } else if (arg0.method829(field2877, 4)) {
            return 4259584;
        } else {
            if (arg0.method829(field2865, 4)) {
                field2882 = true;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;III)V")
    public final void method968(class99 arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            return;
        }
        int var5 = arg2 - this.field2860;
        for (int var6 = 0; var6 < arg0.field2391; var6++) {
            int var7 = arg0.field2394[var6] & 0xFF;
            if (var7 != 32) {
                method980(this.field2876[var7], arg1, this.field2880[var7] + var5, this.field2871[var7], this.field2881[var7], arg3);
            }
            arg1 += this.field2871[var7];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IIII)V")
    public final void method969(class99 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method974(arg0) / 2;
        int var7 = arg2 - this.field2860;
        for (int var8 = 0; var8 < arg0.field2391; var8++) {
            int var9 = arg0.field2394[var8] & 0xFF;
            if (var9 != 32) {
                method980(this.field2876[var9], var6, this.field2880[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 2.0D) * 5.0D), this.field2871[var9], this.field2881[var9], arg3);
            }
            var6 += this.field2871[var9];
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;)I")
    public final int method970(class99 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2391; var3++) {
            if (arg0.field2394[var3] == 64 && var3 + 4 < arg0.field2391 && arg0.field2394[var3 + 4] == 64) {
                var3 += 4;
            } else {
                var2 += this.field2871[arg0.field2394[var3] & 0xFF];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;I)I")
    public final int method971(class99 arg0, int arg1) {
        return this.method982(arg0, arg1, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IIIZI)V")
    public final void method972(class99 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.field2866.setSeed((long) arg5);
        int var7 = (this.field2866.nextInt() & 0x1F) + 192;
        int var8 = arg2 - this.field2860;
        for (int var9 = 0; var9 < arg0.field2391; var9++) {
            if (arg0.field2394[var9] == 64 && var9 + 4 < arg0.field2391 && arg0.field2394[var9 + 4] == 64) {
                int var10 = this.method967(arg0.method840(var9 + 1, 73, var9 + 4));
                if (var10 != -1) {
                    arg3 = var10;
                }
                var9 += 4;
            } else {
                int var11 = arg0.field2394[var9] & 0xFF;
                if (var11 != 32) {
                    if (arg4) {
                        method984(this.field2876[var11], arg1 + 1, this.field2880[var11] + var8 + 1, this.field2871[var11], this.field2881[var11], 0, 192);
                    }
                    method984(this.field2876[var11], arg1, this.field2880[var11] + var8, this.field2871[var11], this.field2881[var11], arg3, var7);
                }
                arg1 += this.field2871[var11];
                if ((this.field2866.nextInt() & 0x3) == 0) {
                    arg1++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method973(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Loc;)I")
    public final int method974(class99 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < arg0.field2391; var3++) {
            var2 += this.field2871[arg0.field2394[var3] & 0xFF];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IIIII)V")
    public final void method975(class99 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        double var7 = 7.0D - (double) arg5 / 8.0D;
        if (var7 < 0.0D) {
            var7 = 0.0D;
        }
        int var9 = arg1 - this.method974(arg0) / 2;
        int var10 = arg2 - this.field2860;
        for (int var11 = 0; var11 < arg0.method810(-58); var11++) {
            int var12 = arg0.field2394[var11] & 0xFF;
            if (var12 != 32) {
                method980(this.field2876[var12], var9, this.field2880[var12] + var10 + (int) (Math.sin((double) var11 / 1.5D + (double) arg4) * var7), this.field2871[var12], this.field2881[var12], arg3);
            }
            var9 += this.field2871[var12];
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;I)I")
    public final int method976(class99 arg0, int arg1) {
        int var3 = this.method982(arg0, arg1, true);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method974(field2875[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V")
    public static void method977() {
        field2865 = null;
        field2869 = null;
        field2861 = null;
        field2885 = null;
        field2862 = null;
        field2864 = null;
        field2874 = null;
        field2867 = null;
        field2879 = null;
        field2884 = null;
        field2870 = null;
        field2859 = null;
        field2873 = null;
        field2868 = null;
        field2863 = null;
        field2878 = null;
        field2872 = null;
        field2883 = null;
        field2877 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;IIIZI)V")
    private final void method978(class99 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        class99 var7 = arg0.method846(-1);
        int var8 = 0;
        for (int var9 = 0; var9 < var7.method810(-58); var9++) {
            if (var7.method825(var9, (byte) -97) == 32) {
                var8++;
            }
        }
        int var10 = 0;
        int var11 = 0;
        if (var8 > 0) {
            var10 = (arg5 - this.method970(var7)) * 256 / var8;
        }
        field2882 = false;
        int var12 = arg1;
        if (var7 == null) {
            return;
        }
        int var13 = arg2 - this.field2860;
        for (int var14 = 0; var14 < var7.field2391; var14++) {
            if (var7.field2394[var14] == 64 && var14 + 4 < var7.field2391 && var7.field2394[var14 + 4] == 64) {
                int var15 = this.method967(var7.method840(var14 + 1, 74, var14 + 4));
                if (var15 != -1) {
                    arg3 = var15;
                }
                var14 += 4;
            } else {
                int var16 = var7.field2394[var14] & 0xFF;
                if (var16 != 32) {
                    if (arg4) {
                        method980(this.field2876[var16], arg1 + 1, this.field2880[var16] + var13 + 1, this.field2871[var16], this.field2881[var16], 0);
                    }
                    method980(this.field2876[var16], arg1, this.field2880[var16] + var13, this.field2871[var16], this.field2881[var16], arg3);
                }
                arg1 += this.field2871[var16];
                if (var16 == 32) {
                    int var17 = var10 + var11;
                    arg1 += var17 / 256;
                    var11 = var17 & 0xFF;
                }
            }
        }
        if (field2882) {
            class96.method793(var12, (int) ((double) this.field2860 * 0.7D) + var13, arg1 - var12, 8388608);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;III)V")
    public final void method979(class99 arg0, int arg1, int arg2, int arg3) {
        this.method968(arg0, arg1 - this.method974(arg0), arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BIIIII)V")
    private static final void method980(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class96.field2329 * arg2 + arg1;
        int var7 = class96.field2329 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class96.field2325) {
            int var10 = class96.field2325 - arg2;
            arg4 -= var10;
            arg2 = class96.field2325;
            var9 += arg3 * var10;
            var6 += class96.field2329 * var10;
        }
        if (arg2 + arg4 > class96.field2328) {
            arg4 -= arg2 + arg4 - class96.field2328;
        }
        if (arg1 < class96.field2327) {
            int var11 = class96.field2327 - arg1;
            arg3 -= var11;
            arg1 = class96.field2327;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class96.field2331) {
            int var12 = arg1 + arg3 - class96.field2331;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method973(class96.field2330, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)I")
    public final int method981(int arg0) {
        return this.field2871[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IZ)I")
    private final int method982(class99 arg0, int arg1, boolean arg2) {
        int var4 = 0;
        int var5 = 0;
        class99 var6 = class93.method769(100, 0);
        int var7 = -1;
        int var8 = 0;
        class99 var9 = null;
        int var10 = 0;
        boolean var11 = false;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg0.method810(-58);
        for (int var15 = 0; var15 < var14; var15++) {
            int var16 = arg0.method825(var15, (byte) -63);
            if (var16 == 64 && var15 + 4 < var14 && arg0.method825(var15 + 4, (byte) -94) == 64) {
                class99 var17 = arg0.method840(var15, -83, var15 + 5);
                if (var17.method829(field2865, 4)) {
                    var11 = true;
                    var12 = var6.method810(-58);
                } else {
                    var9 = var17;
                    var10 = var6.method810(-58);
                }
                var6.method835(var17, (byte) 38);
                var15 += 4;
            } else if (var16 == 92 && var15 + 1 < var14 && arg0.method825(var15 + 1, (byte) -79) == 110) {
                field2875[var13++] = var6.method840(var5, -116, var6.method810(-58)).method846(-1);
                var5 = var6.method810(-58);
                var4 = 0;
                var7 = -1;
                var15++;
                var9 = null;
                var11 = false;
            } else {
                var6.method811(0, var16);
                var4 += this.method981(var16);
                if (var16 == 32 || var16 == 45) {
                    var7 = var6.method810(-58);
                    var8 = var4;
                }
                if (arg2 && var4 > arg1 && var7 >= 0) {
                    field2875[var13++] = var6.method840(var5, 47, var7).method846(-1);
                    var5 = var7;
                    var7 = -1;
                    var4 -= var8;
                    if (var9 != null && var10 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method833(var5, -116, var9);
                    }
                    if (var11 && var12 < var5 && var5 > 4) {
                        var5 -= 5;
                        var6.method833(var5, 122, field2869);
                    }
                }
            }
        }
        if (var6.method810(-58) > var5) {
            field2875[var13++] = var6.method840(var5, 67, var6.method810(-58)).method846(-1);
        }
        return var13;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;IIIZ)V")
    public final void method983(class99 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2882 = false;
        int var6 = arg1;
        if (arg0 == null) {
            return;
        }
        int var7 = arg2 - this.field2860;
        for (int var8 = 0; var8 < arg0.field2391; var8++) {
            if (arg0.field2394[var8] == 64 && var8 + 4 < arg0.field2391 && arg0.field2394[var8 + 4] == 64) {
                int var9 = this.method967(arg0.method840(var8 + 1, 126, var8 + 4));
                if (var9 != -1) {
                    arg3 = var9;
                }
                var8 += 4;
            } else {
                int var10 = arg0.field2394[var8] & 0xFF;
                if (var10 != 32) {
                    if (arg4) {
                        method980(this.field2876[var10], arg1 + 1, this.field2880[var10] + var7 + 1, this.field2871[var10], this.field2881[var10], 0);
                    }
                    method980(this.field2876[var10], arg1, this.field2880[var10] + var7, this.field2871[var10], this.field2881[var10], arg3);
                }
                arg1 += this.field2871[var10];
            }
        }
        if (field2882) {
            class96.method793(var6, (int) ((double) this.field2860 * 0.7D) + var7, arg1 - var6, 8388608);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BIIIIII)V")
    private static final void method984(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class96.field2329 * arg2 + arg1;
        int var8 = class96.field2329 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class96.field2325) {
            int var11 = class96.field2325 - arg2;
            arg4 -= var11;
            arg2 = class96.field2325;
            var10 += arg3 * var11;
            var7 += class96.field2329 * var11;
        }
        if (arg2 + arg4 > class96.field2328) {
            arg4 -= arg2 + arg4 - class96.field2328;
        }
        if (arg1 < class96.field2327) {
            int var12 = class96.field2327 - arg1;
            arg3 -= var12;
            arg1 = class96.field2327;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class96.field2331) {
            int var13 = arg1 + arg3 - class96.field2331;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method986(class96.field2330, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(Loc;IIII)V")
    public final void method985(class99 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            return;
        }
        int var6 = arg1 - this.method974(arg0) / 2;
        int var7 = arg2 - this.field2860;
        for (int var8 = 0; var8 < arg0.method810(-58); var8++) {
            int var9 = arg0.field2394[var8] & 0xFF;
            if (var9 != 32) {
                method980(this.field2876[var9], var6 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 5.0D) * 5.0D), this.field2880[var9] + var7 + (int) (Math.sin((double) arg4 / 5.0D + (double) var8 / 3.0D) * 5.0D), this.field2871[var9], this.field2881[var9], arg3);
            }
            var6 += this.field2871[var9];
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method986(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Loc;IIIIIZIII)V")
    public final void method987(class99 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        if (arg9 == 0) {
            arg9 = this.field2860;
        }
        boolean var11 = true;
        if (arg4 < this.field2887 + this.field2886 + arg9 && arg4 < arg9 + arg9) {
            var11 = false;
        }
        int var12 = this.method982(arg0, arg3, var11);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field2886 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field2886 - this.field2887 - (var12 - 1) * arg9) / 2 + this.field2886 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field2887 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field2886 - this.field2887 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field2886 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method983(field2875[var15], arg1, var13, arg5, arg6);
            } else if (arg7 == 1) {
                this.method989(field2875[var15], arg3 / 2 + arg1, var13, arg5, arg6);
            } else if (arg7 == 2) {
                this.method966(field2875[var15], arg1 + arg3, var13, arg5, arg6);
            } else if (var12 - 1 == var15) {
                this.method983(field2875[var15], arg1, var13, arg5, arg6);
            } else {
                this.method978(field2875[var15], arg1, var13, arg5, arg6, arg3);
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Loc;III)V")
    public final void method988(class99 arg0, int arg1, int arg2, int arg3) {
        this.method968(arg0, arg1 - this.method974(arg0) / 2, arg2, arg3);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(Loc;IIIZ)V")
    public final void method989(class99 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.method983(arg0, arg1 - this.method970(arg0) / 2, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class115(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field2880 = arg0;
        this.field2871 = arg1;
        this.field2881 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field2876 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field2880[var10] < var8 && this.field2881[var10] != 0) {
                var8 = this.field2880[var10];
            }
            if (this.field2881[var10] + this.field2880[var10] > var9) {
                var9 = this.field2881[var10] + this.field2880[var10];
            }
            byte[] var11 = this.field2876[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field2860 = this.field2881[32] + this.field2880[32];
        this.field2886 = this.field2860 - var8;
        this.field2887 = var9 - this.field2860;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V")
    public class115(byte[] arg0) {
        this.field2871 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field2871.length; var2++) {
            this.field2871[var2] = arg0[var2] & 0xFF;
        }
    }
}
