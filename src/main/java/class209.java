import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class209 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lmo;")
    private class336 field3061 = new class336(64);

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lnl;")
    private class435 field3066;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lch;")
    public static class151 field3063 = new class151(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "Lnl;")
    public static class435 field3068;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "[Lrn;")
    public static class417[] field3067;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "[[I")
    public static int[][] field3060;

    static {
        new class151("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I", line = 4)
    public static final int method1424(int arg0, int arg1, int arg2) {
        field3059++;
        if (arg1 != 256) {
            field3060 = null;
        }
        return arg2 == 4 || arg2 == 5 ? class255.field3659[arg0 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lnh;", line = 22)
    public final class344 method1425(int arg0, int arg1) {
        field3056++;
        class336 var3 = this.field3061;
        class344 var4;
        synchronized (this.field3061) {
            var4 = (class344) this.field3061.method2113(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3066.method2633(arg0, arg1, 116);
        class344 var6 = new class344();
        if (var5 != null) {
            var6.method2138(new class161(var5), 98);
        }
        class336 var7 = this.field3061;
        synchronized (this.field3061) {
            this.field3061.method2116((long) arg1, (byte) -108, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([[BI[[B[B[IIB[I)I", line = 47)
    public static final int method1426(byte[][] arg0, int arg1, byte[][] arg2, byte[] arg3, int[] arg4, int arg5, byte arg6, int[] arg7) {
        field3057++;
        int var8 = arg7[arg1];
        int var9 = arg4[arg1] + var8;
        int var10 = arg7[arg5];
        int var11 = -26 % ((arg6 - 30) / 35);
        int var12 = var10 + arg4[arg5];
        int var13 = var8;
        if (var8 < var10) {
            var13 = var10;
        }
        int var14 = var9;
        if (var12 < var9) {
            var14 = var12;
        }
        int var15 = arg3[arg1] & 0xFF;
        if ((arg3[arg5] & 0xFF) < var15) {
            var15 = arg3[arg5] & 0xFF;
        }
        byte[] var16 = arg2[arg1];
        byte[] var17 = arg0[arg5];
        int var18 = var13 - var8;
        int var19 = var13 - var10;
        for (int var20 = var13; var20 < var14; var20++) {
            int var21 = var17[var19++] + var16[var18++];
            if (var15 > var21) {
                var15 = var21;
            }
        }
        return -var15;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIII)Z", line = 107)
    public static final boolean method1427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3058++;
        int var6 = arg4;
        if (arg2 != 3) {
            field3060 = null;
        }
        while (var6 <= arg1) {
            for (int var7 = arg0; var7 <= arg5; var7++) {
                if (class154.field2133[var6][var7] == arg3 && class314.field4435[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V", line = 137)
    public static final void method1428(int arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        field3065++;
        if (arg0 == 37) {
            class330.field4574 = 3.0F;
        } else if (arg0 == 50) {
            class330.field4574 = 4.0F;
        } else if (arg0 == 75) {
            class330.field4574 = 6.0F;
        } else if (arg0 == 100) {
            class330.field4574 = 8.0F;
        } else if (arg0 == 200) {
            class330.field4574 = 16.0F;
        }
        class466.field6571 = -1;
        class466.field6571 = -1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V", line = 169)
    public static void method1429(int arg0) {
        field3063 = null;
        field3068 = null;
        field3067 = null;
        field3060 = null;
        if (arg0 >= -11) {
            field3063 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILnm;III)V", line = 182)
    public static final void method1430(int arg0, class267 arg1, int arg2, int arg3, int arg4) {
        field3062++;
        if (arg4 != -25457) {
            method1426((byte[][]) null, 46, (byte[][]) null, (byte[]) null, (int[]) null, 51, (byte) 70, (int[]) null);
        }
        for (class31 var5 = (class31) class428.field5975.method775(1); var5 != null; var5 = (class31) class428.field5975.method763(0)) {
            if (var5.field314 == arg2 && arg3 * 128 == var5.field322 && (arg0 * 128) == var5.field323 && var5.field337.field3887 == arg1.field3887) {
                if (var5.field335 != null) {
                    class332.field4613.method2406(var5.field335);
                    var5.field335 = null;
                }
                if (var5.field318 != null) {
                    class332.field4613.method2406(var5.field318);
                    var5.field318 = null;
                }
                var5.method2714(-100);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 233)
    public class209(class280 arg0, int arg1, class435 arg2) {
        this.field3066 = arg2;
        this.field3064 = this.field3066.method2638(1, 19);
    }
}
