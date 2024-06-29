import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 implements Runnable {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "[Lmf;")
    public volatile class114[] field480 = new class114[2];

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "Z")
    public volatile boolean field481 = false;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
    public volatile boolean field476 = false;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Leh;")
    private static class47 field484 = class195.method1282((byte) -4, "Free world");

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Leh;")
    public static class47 field489 = class195.method1282((byte) -4, "<col=ffff00>");

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Leh;")
    public static class47 field482 = class195.method1282((byte) -4, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Leh;")
    public static class47 field477 = field484;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field488 = 0;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[J")
    public static long[] field487 = new long[100];

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "[S")
    public static short[] field478 = new short[500];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lqf;")
    public class150 field486;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lfd;")
    public static class52 field491;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[BI[Ldg;IIIIII)V")
    public static final void method234(int arg0, byte[] arg1, int arg2, class37[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class68 var10 = new class68(arg1);
        field490++;
        int var11 = -1;
        while (true) {
            int var12 = var10.method603((byte) -111);
            if (var12 == 0) {
                int var26 = 72 / ((arg0 - 38) / 47);
                return;
            }
            var11 += var12;
            int var13 = 0;
            while (true) {
                int var14 = var10.method603((byte) -127);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method604((byte) -127);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                if (arg5 == var17 && arg6 <= var16 && arg6 + 8 > var16 && arg4 <= var15 && arg4 + 8 > var15) {
                    class202 var21 = class99.method806(0, var11);
                    int var22 = class105.method849(var15 & 0x7, arg2, var21.field3980, var21.field3949, var16 & 0x7, -128, var20) + arg8;
                    int var23 = arg7 + class83.method696(75, var21.field3980, arg2, var20, var21.field3949, var16 & 0x7, var15 & 0x7);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg9;
                        if ((class182.field3490[1][var22][var23] & 0x2) == 2) {
                            var24 = arg9 - 1;
                        }
                        class37 var25 = null;
                        if (var24 >= 0) {
                            var25 = arg3[var24];
                        }
                        class14.method123(var23, var22, var20 + arg2 & 0x3, var11, var25, var19, (byte) 81, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIB)I")
    public static final int method235(int arg0, int arg1, int arg2, byte arg3) {
        field479++;
        if ((class182.field3490[arg1][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class182.field3490[1][arg2][arg0] & 0x2) == 0) {
            return arg3 == 101 ? arg1 : -72;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
    public final void run() {
        this.field476 = true;
        try {
            while (!this.field481) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class114 var2 = this.field480[var1];
                    if (var2 != null) {
                        var2.method903((byte) 45);
                    }
                }
                class76.method666(10L, 1);
                class90.method727(null, (byte) 94, this.field486);
            }
        } catch (Exception var9) {
            class167.method1131((byte) -122, var9, null);
        } finally {
            Object var6 = null;
            this.field476 = false;
        }
        field475++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)Lca;")
    public static final class22 method236(boolean arg0, int arg1) {
        field483++;
        class22 var2 = (class22) class74.field1626.method986((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method234(-101, null, -65, null, 79, -106, 78, -91, -118, 65);
        }
        byte[] var3 = class109.field2260.method67(12, -1, arg1);
        class22 var4 = new class22();
        if (var3 != null) {
            var4.method220(new class68(var3), false);
        }
        var4.method223(0);
        class74.field1626.method987((long) arg1, var4, 28842);
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static void method237(int arg0) {
        field484 = null;
        if (arg0 < 2) {
            return;
        }
        field487 = null;
        field489 = null;
        field491 = null;
        field482 = null;
        field478 = null;
        field477 = null;
    }
}
