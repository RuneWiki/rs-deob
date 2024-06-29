import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class653 {

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "Lhv;")
    private class474 field9341;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    private int field9325;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    private int field9333;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "Ltq;")
    private class572 field9335;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "[I")
    public static int[] field9332 = new int[1000];

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field9329 = 0;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "Lws;")
    public static class325 field9339;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "Lqq;")
    public static class434 field9330;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "Liaa;")
    public static class452 field9328;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "Led;")
    public static class645 field9338;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLfw;)V", line = 3)
    private final void method3682(byte arg0, class53 arg1) {
        field9324++;
        if (arg0 != -73) {
            field9328 = null;
        }
        if (arg1 != null) {
            arg1.method1519((byte) 121);
            arg1.method1968((byte) -89);
            this.field9325 += arg1.field552;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/Object;BJ)V", line = 21)
    public final void method3683(Object arg0, byte arg1, long arg2) {
        int var5 = -72 % ((arg1 - 49) / 41);
        this.method3694(arg0, arg2, (byte) -80, 1);
        field9331++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 31)
    public final void method3684(int arg0) {
        field9336++;
        if (arg0 != -17200) {
            field9338 = null;
        }
        for (class53 var2 = (class53) this.field9341.method2769(0); var2 != null; var2 = (class53) this.field9341.method2763(arg0 ^ 0x1F7A)) {
            if (var2.method267((byte) -127)) {
                var2.method1519((byte) 121);
                var2.method1968((byte) -120);
                this.field9325 += var2.field552;
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 60)
    public final Object method3685(byte arg0) {
        field9334++;
        if (arg0 != 14) {
            field9332 = null;
        }
        class53 var2 = (class53) this.field9335.method3232(-1);
        while (var2 != null) {
            Object var3 = var2.method266((byte) 13);
            if (var3 != null) {
                return var3;
            }
            class53 var4 = var2;
            var2 = (class53) this.field9335.method3236(-27646);
            var4.method1519((byte) 121);
            var4.method1968((byte) -119);
            this.field9325 += var4.field552;
        }
        return null;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I", line = 91)
    public final int method3686(int arg0) {
        field9321++;
        if (arg0 > -97) {
            field9339 = null;
        }
        return this.field9325;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V", line = 105)
    public final void method3687(byte arg0) {
        this.field9341.method2767(16993);
        field9327++;
        this.field9335.method3227((byte) 105);
        this.field9325 = this.field9333;
        if (arg0 != -10) {
            this.method3682((byte) 123, null);
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 123)
    public final Object method3688(int arg0) {
        if (arg0 != 1) {
            return null;
        }
        field9322++;
        class53 var2 = (class53) this.field9335.method3236(arg0 - 27647);
        while (var2 != null) {
            Object var3 = var2.method266((byte) 13);
            if (var3 != null) {
                return var3;
            }
            class53 var4 = var2;
            var2 = (class53) this.field9335.method3236(-27646);
            var4.method1519((byte) 121);
            var4.method1968((byte) -110);
            this.field9325 += var4.field552;
        }
        return null;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I)V", line = 154)
    public class653(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(JI)V", line = 159)
    private final void method3689(long arg0, int arg1) {
        if (arg1 != 26811) {
            field9330 = null;
        }
        field9323++;
        class53 var4 = (class53) this.field9335.method3234((byte) -118, arg0);
        this.method3682((byte) -73, var4);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 172)
    public final Object method3690(byte arg0, long arg1) {
        field9337++;
        int var4 = 77 / ((arg0 - 63) / 50);
        class53 var5 = (class53) this.field9335.method3234((byte) -69, arg1);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method266((byte) 13);
        if (var6 == null) {
            var5.method1519((byte) 121);
            var5.method1968((byte) -91);
            this.field9325 += var5.field552;
            return null;
        }
        if (var5.method267((byte) -125)) {
            class64 var7 = new class64(var6, var5.field552);
            this.field9335.method3235(var5.field3405, -1, var7);
            this.field9341.method2765(0, var7);
            var7.field4676 = 0L;
            var5.method1519((byte) 121);
            var5.method1968((byte) -85);
        } else {
            this.field9341.method2765(0, var5);
            var5.field4676 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ZI)V", line = 222)
    public final void method3691(boolean arg0, int arg1) {
        field9326++;
        if (class98.field1082 != null) {
            for (class53 var3 = (class53) this.field9341.method2769(0); var3 != null; var3 = (class53) this.field9341.method2763(-23638)) {
                if (var3.method267((byte) -117)) {
                    if (var3.method266((byte) 13) == null) {
                        var3.method1519((byte) 121);
                        var3.method1968((byte) -111);
                        this.field9325++;
                    }
                } else if (++var3.field4676 > (long) arg1) {
                    class53 var4 = class98.field1082.method1360(var3, 9179409);
                    this.field9335.method3235(var3.field3405, -1, var4);
                    class25.method128(var4, var3, arg0);
                    var3.method1519((byte) 121);
                    var3.method1968((byte) -108);
                }
            }
        }
        if (arg0) {
            this.method3690((byte) 49, -9L);
        }
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I", line = 275)
    public final int method3692(int arg0) {
        field9319++;
        if (arg0 != 0) {
            field9328 = null;
        }
        return this.field9333;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I", line = 290)
    public final int method3693(boolean arg0) {
        if (!arg0) {
            this.method3690((byte) 60, -49L);
        }
        field9340++;
        int var2 = 0;
        for (class53 var3 = (class53) this.field9341.method2769(0); var3 != null; var3 = (class53) this.field9341.method2763(-23638)) {
            if (!var3.method267((byte) -120)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/Object;JBI)V", line = 315)
    public final void method3694(Object arg0, long arg1, byte arg2, int arg3) {
        field9320++;
        if (this.field9333 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method3689(arg1, 26811);
        this.field9325 -= arg3;
        while (this.field9325 < 0) {
            class53 var8 = (class53) this.field9341.method2766((byte) 82);
            this.method3682((byte) -73, var8);
        }
        int var6 = 36 % ((-arg2 - 38) / 41);
        class64 var7 = new class64(arg0, arg3);
        this.field9335.method3235(arg1, -1, var7);
        this.field9341.method2765(0, var7);
        var7.field4676 = 0L;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(Z)V", line = 345)
    public static void method3695(boolean arg0) {
        field9339 = null;
        field9328 = null;
        field9330 = null;
        field9332 = null;
        if (!arg0) {
            field9338 = null;
        }
        field9338 = null;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(II)V", line = 362)
    private class653(int arg0, int arg1) {
        this.field9341 = new class474();
        this.field9325 = arg0;
        this.field9333 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && arg1 > var3; var3 += var3) {
        }
        this.field9335 = new class572(var3);
    }
}
