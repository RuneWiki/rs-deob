import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class202 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lwg;")
    private class58 field2642 = new class58(64);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lkr;")
    private class329 field2646;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[Z")
    public static boolean[] field2644 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lbe;")
    public static class189 field2645 = new class189();

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBIII)V")
    public static final void method1287(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field2641++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg1 * arg1;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (arg3 >= class535.field7467 && class113.field1453 >= arg3) {
            int var21 = class69.method398((byte) -116, arg1 + arg5, class355.field4972, class594.field8575);
            int var22 = class69.method398((byte) -115, arg5 - arg1, class355.field4972, class594.field8575);
            class373.method2275((byte) -9, var21, arg4, var22, class256.field3173[arg3]);
        }
        int var23 = -121 % ((arg2 - 28) / 54);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var24 = arg3 - var7;
            int var25 = arg3 + var7;
            if (var25 >= class535.field7467 && class113.field1453 >= var24) {
                int var26 = class69.method398((byte) -120, arg5 + var6, class355.field4972, class594.field8575);
                int var27 = class69.method398((byte) -104, arg5 - var6, class355.field4972, class594.field8575);
                if (var24 >= class535.field7467) {
                    class373.method2275((byte) -9, var26, arg4, var27, class256.field3173[var24]);
                }
                if (var25 <= class113.field1453) {
                    class373.method2275((byte) -9, var26, arg4, var27, class256.field3173[var25]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Lng;")
    public final class208 method1288(boolean arg0, int arg1) {
        field2649++;
        class58 var3 = this.field2642;
        class208 var4;
        synchronized (this.field2642) {
            var4 = (class208) this.field2642.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2646;
        byte[] var6;
        synchronized (this.field2646) {
            var6 = this.field2646.method2054(arg0, class195.method1247(arg1, (byte) -18), class483.method2734(true, arg1));
        }
        class208 var7 = new class208();
        if (var6 != null) {
            var7.method1330(new class551(var6), true);
        }
        class58 var8 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method316((long) arg1, (byte) -121, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public final void method1289(int arg0) {
        class58 var2 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method315(1);
        }
        if (arg0 == 3) {
            field2652++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public final void method1290(int arg0) {
        field2651++;
        class58 var2 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method317((byte) 21);
        }
        if (arg0 != -25282) {
            this.method1290(-18);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public final void method1291(int arg0, int arg1) {
        class58 var3 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method315(arg1 ^ 0x5025E800);
            this.field2642 = new class58(arg0);
        }
        field2640++;
        if (arg1 != 1344661505) {
            method1293(-55, -84, -57, -23, -98, 47);
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method1292(int arg0) {
        if (arg0 != 24955) {
            field2648 = 19;
        }
        field2644 = null;
        field2645 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2650++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg1 <= 105) {
            return;
        }
        int var20 = (arg3 - 1) * var15;
        class373.method2275((byte) -9, arg2 + arg4, arg0, arg4 - arg2, class256.field3173[arg5]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var21 = arg5 - var7;
            int var22 = arg5 + var7;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class373.method2275((byte) -9, var23, arg0, var24, class256.field3173[var21]);
            class373.method2275((byte) -9, var23, arg0, var24, class256.field3173[var22]);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Z")
    public static final boolean method1294(int arg0, int arg1, int arg2) {
        field2643++;
        int var3 = -93 % ((35 - arg0) / 61);
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(ZI)V")
    public final void method1295(boolean arg0, int arg1) {
        field2647++;
        class58 var3 = this.field2642;
        synchronized (this.field2642) {
            if (arg0) {
                this.field2646 = null;
            }
            this.field2642.method320(arg1, -306674912);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class202(class513 arg0, int arg1, class329 arg2) {
        this.field2646 = arg2;
        if (this.field2646 != null) {
            int var4 = this.field2646.method2046((byte) 64) - 1;
            this.field2646.method2064(0, var4);
        }
    }
}
