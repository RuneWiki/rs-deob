import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class60 {

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Lwg;")
    private class58 field824 = new class58(64);

    @OriginalMember(owner = "client!mn", name = "q", descriptor = "Lwg;")
    public class58 field839 = new class58(30);

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Lkr;")
    private class329 field830;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "Lkr;")
    public class329 field823;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "[I")
    public static int[] field832 = new int[1000];

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "Z")
    public static boolean field829 = false;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "Lwg;")
    public static class58 field834 = new class58(260);

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!mn", name = "r", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Z")
    public static boolean field835;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BI)V")
    public final void method344(byte arg0, int arg1) {
        class58 var3 = this.field824;
        synchronized (this.field824) {
            this.field824.method320(arg1, -306674912);
        }
        field826++;
        class58 var4 = this.field839;
        synchronized (this.field839) {
            this.field839.method320(arg1, -306674912);
        }
        if (arg0 <= 72) {
            this.method345(2, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)V")
    public final void method345(int arg0, byte arg1) {
        this.field840 = arg0;
        field827++;
        class58 var3 = this.field839;
        synchronized (this.field839) {
            int var4 = 118 / ((arg1 - 4) / 36);
            this.field839.method315(1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method346(byte arg0, String arg1) {
        field833++;
        int var2 = arg1.length();
        if (arg0 != 123) {
            method352(-1);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILpa;Lpe;ILjava/lang/String;IIIZLjq;Lra;)V")
    public static final void method347(int arg0, int arg1, class594 arg2, class157 arg3, int arg4, String arg5, int arg6, int arg7, int arg8, boolean arg9, class447 arg10, class262 arg11) {
        if (arg9) {
            field834 = null;
        }
        field828++;
        int var12;
        if (class621.field8952 == 4) {
            var12 = (int) class521.field7250 & 0x3FFF;
        } else {
            var12 = (int) class521.field7250 + class374.field5212 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field6330 / 2, arg10.field6218 / 2) + 10;
        int var14 = arg0 * arg0 + (arg4 * arg4);
        if (var13 * var13 < var14) {
            return;
        }
        int var15 = class310.field3966[var12];
        int var16 = class310.field3965[var12];
        if (class621.field8952 != 4) {
            var16 = var16 * 256 / (class54.field728 + 256);
            var15 = var15 * 256 / (class54.field728 + 256);
        }
        int var17 = arg0 * var16 + arg4 * var15 >> 14;
        int var18 = arg4 * var16 - (arg0 * var15) >> 14;
        int var19 = arg3.method862(null, 100, -27128, arg5);
        int var20 = var17 - var19 / 2;
        int var21 = arg3.method861((byte) -69, 100, arg5, 0, null);
        if (var20 >= (-arg10.field6330) && var20 <= arg10.field6330 && -arg10.field6218 <= var18 && var18 <= arg10.field6218) {
            arg11.method1617(arg10.field6218 / 2 + arg6 - var18 - arg8 - var21, arg5, 0, 0, arg1, arg7, null, 1, 50, arg2, 0, arg10.field6330 / 2 + arg7 + var20, null, arg6, 0, var19);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)Lcp;")
    public final class628 method348(int arg0, int arg1) {
        field837++;
        class58 var3 = this.field824;
        class628 var4;
        synchronized (this.field824) {
            var4 = (class628) this.field824.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field830;
        byte[] var6;
        synchronized (this.field830) {
            var6 = this.field830.method2054(true, class89.method491(arg1, 116), class540.method2999(arg1, 255));
        }
        if (arg0 != 6410) {
            this.field839 = null;
        }
        class628 var7 = new class628();
        var7.field9156 = this;
        var7.field9159 = arg1;
        if (var6 != null) {
            var7.method3634((byte) 86, new class551(var6));
        }
        class58 var8 = this.field824;
        synchronized (this.field824) {
            this.field824.method316((long) arg1, (byte) -125, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
    public final void method349(int arg0) {
        if (arg0 != 0) {
            method347(-116, 113, null, null, 51, null, 71, 119, -49, false, null, null);
        }
        field836++;
        class58 var2 = this.field824;
        synchronized (this.field824) {
            this.field824.method315(1);
        }
        class58 var3 = this.field839;
        synchronized (this.field839) {
            this.field839.method315(arg0 + 1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIII)V")
    public static final void method350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg0 + 1;
        class373.method2275((byte) -9, arg2, arg3, arg4, class256.field3173[arg0]);
        field831++;
        int var10 = arg1 - 1;
        class373.method2275((byte) -9, arg2, arg3, arg4, class256.field3173[arg1]);
        if (arg5 > 72) {
            for (int var6 = var9; var6 <= var10; var6++) {
                int[] var7 = class256.field3173[var6];
                var7[arg4] = var7[arg2] = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
    public final void method351(byte arg0) {
        if (arg0 >= -119) {
            field834 = null;
        }
        field825++;
        class58 var2 = this.field824;
        synchronized (this.field824) {
            this.field824.method317((byte) 21);
        }
        class58 var3 = this.field839;
        synchronized (this.field839) {
            this.field839.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V")
    public static void method352(int arg0) {
        if (arg0 == 50) {
            field834 = null;
            field832 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lg;ILkr;Lkr;)V")
    public class60(class513 arg0, int arg1, class329 arg2, class329 arg3) {
        this.field830 = arg2;
        this.field823 = arg3;
        int var5 = this.field830.method2046((byte) 64) - 1;
        this.field830.method2064(0, var5);
    }
}
