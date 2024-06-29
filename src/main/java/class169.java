import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class169 extends class97 {

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Lea;")
    public static class38 field3477 = class9.method46((byte) 117, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3472 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lea;")
    private static class38 field3481 = class9.method46((byte) 126, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "Lea;")
    public static class38 field3480 = field3481;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Z")
    public static boolean field3482 = false;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Z")
    public static boolean field3479 = true;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "Lob;")
    public static class127 field3478;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
    public int[] field3466;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[I")
    public int[] field3474;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "[I")
    public int[] field3476;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "[Lgg;")
    public class61[] field3468;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "[Lgg;")
    public class61[] field3471;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "[[[B")
    public byte[][][] field3475;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([II[III[Lpc;)V")
    public static final void method1196(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, class137[] arg5) {
        field3470++;
        if (arg3 < arg4) {
            int var6 = arg3 - 1;
            int var7 = arg4 + 1;
            int var8 = (arg3 + arg4) / 2;
            class137 var9 = arg5[var8];
            arg5[var8] = arg5[arg3];
            arg5[arg3] = var9;
            while (var7 > var6) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg2[var11] == 2) {
                            var12 = var9.field2871;
                            var13 = arg5[var7].field2871;
                        } else if (arg2[var11] == 1) {
                            var13 = arg5[var7].field2878;
                            var12 = var9.field2878;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg2[var11] == 3) {
                            var13 = arg5[var7].field2867 ? 1 : 0;
                            var12 = var9.field2867 ? 1 : 0;
                        } else {
                            var13 = arg5[var7].field2874;
                            var12 = var9.field2874;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var12 >= var13) && (arg0[var11] != 0 || var12 <= var13)) {
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
                        if (arg2[var15] == 2) {
                            var16 = arg5[var6].field2871;
                            var17 = var9.field2871;
                        } else if (arg2[var15] == 1) {
                            var16 = arg5[var6].field2878;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = var9.field2878;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg2[var15] == 3) {
                            var16 = arg5[var6].field2867 ? 1 : 0;
                            var17 = var9.field2867 ? 1 : 0;
                        } else {
                            var16 = arg5[var6].field2874;
                            var17 = var9.field2874;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var16 >= var17) && (arg0[var15] != 0 || var16 <= var17)) {
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
                    class137 var18 = arg5[var6];
                    arg5[var6] = arg5[var7];
                    arg5[var7] = var18;
                }
            }
            method1196(arg0, 0, arg2, arg3, var7, arg5);
            method1196(arg0, 0, arg2, var7 + 1, arg4, arg5);
        }
        if (arg1 != 0) {
            method1196(null, 114, null, 72, 37, null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V")
    public static final void method1197(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 3319) {
            field3478 = null;
        }
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var7 = 0; var7 < 8; var7++) {
                class154.field3209[arg3][arg0 + var4][arg2 + var7] = 0;
            }
        }
        field3473++;
        if (arg0 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class154.field3209[arg3][arg0][arg2 + var5] = class154.field3209[arg3][arg0 - 1][arg2 + var5];
            }
        }
        if (arg2 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class154.field3209[arg3][arg0 + var6][arg2] = class154.field3209[arg3][arg0 + var6][arg2 - 1];
            }
        }
        if (arg0 > 0 && class154.field3209[arg3][arg0 - 1][arg2] != 0) {
            class154.field3209[arg3][arg0][arg2] = class154.field3209[arg3][arg0 - 1][arg2];
        } else if (arg2 > 0 && class154.field3209[arg3][arg0][arg2 - 1] != 0) {
            class154.field3209[arg3][arg0][arg2] = class154.field3209[arg3][arg0][arg2 - 1];
        } else if (arg0 > 0 && arg2 > 0 && class154.field3209[arg3][arg0 - 1][arg2 - 1] != 0) {
            class154.field3209[arg3][arg0][arg2] = class154.field3209[arg3][arg0 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field3480 = null;
        field3478 = null;
        if (arg0 != -14813) {
            field3477 = null;
        }
        field3481 = null;
        field3477 = null;
        field3472 = null;
    }
}
