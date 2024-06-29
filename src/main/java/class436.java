import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class436 {

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Lmq;")
    private class104 field5985 = new class104(16);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lfc;")
    private class343 field5978;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field5977 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field5986 = 0;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[[I")
    public static int[][] field5987 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "[I")
    public static int[] field5989;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 6)
    public final void method2532(int arg0) {
        field5983++;
        if (arg0 < 38) {
            this.field5978 = null;
        }
        class104 var2 = this.field5985;
        synchronized (this.field5985) {
            this.field5985.method654(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BIIIII)V", line = 19)
    public static final void method2533(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5980++;
        int var6 = arg5 - arg1;
        int var7 = arg4 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class417.method2435(arg3, arg4, arg1, arg2, (byte) 113);
            }
        } else if (var7 == 0) {
            class235.method1477(true, arg3, arg2, arg1, arg5);
        } else if (arg0 == 126) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (class299.field4121 > arg1) {
                var10 = var9 + (class299.field4121 * var8 >> 12);
                var11 = class299.field4121;
            } else if (class248.field3487 >= arg1) {
                var11 = arg1;
                var10 = arg2;
            } else {
                var10 = (class248.field3487 * var8 >> 12) + var9;
                var11 = class248.field3487;
            }
            int var12;
            int var13;
            if (arg5 < class299.field4121) {
                var13 = class299.field4121;
                var12 = (class299.field4121 * var8 >> 12) + var9;
            } else if (class248.field3487 < arg5) {
                var12 = (class248.field3487 * var8 >> 12) + var9;
                var13 = class248.field3487;
            } else {
                var12 = arg4;
                var13 = arg5;
            }
            if (var12 < class53.field874) {
                var12 = class53.field874;
                var13 = (class53.field874 - var9 << 12) / var8;
            } else if (var12 > class8.field174) {
                var13 = (class8.field174 - var9 << 12) / var8;
                var12 = class8.field174;
            }
            if (class53.field874 > var10) {
                var10 = class53.field874;
                var11 = (class53.field874 - var9 << 12) / var8;
            } else if (var10 > class8.field174) {
                var11 = (class8.field174 - var9 << 12) / var8;
                var10 = class8.field174;
            }
            class41.method338(var10, (byte) -126, var11, var13, arg3, var12);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 122)
    public final void method2534(int arg0) {
        field5984++;
        class104 var2 = this.field5985;
        synchronized (this.field5985) {
            this.field5985.method656(arg0 ^ 0x6C);
        }
        if (arg0 != 29) {
            field5977 = -126;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lom;IIIBI)Lwl;", line = 139)
    public final class139 method2535(class110 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5988++;
        class62[] var7 = null;
        if (arg4 != 9) {
            this.method2538(-25, -39);
        }
        class224 var8 = this.method2538(16, arg1);
        if (var8.field3178 != null) {
            var7 = new class62[var8.field3178.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class302 var10 = arg0.method684(false, var8.field3178[var9]);
                var7[var9] = new class62(var10.field4141, var10.field4138, var10.field4137, var10.field4140, var10.field4144, var10.field4136, var10.field4132, var10.field4134);
            }
        }
        return new class139(var8.field3179, var7, var8.field3174, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 175)
    public static void method2536(int arg0) {
        if (arg0 != 21750) {
            method2533((byte) -99, 112, -78, -89, -59, -80);
        }
        field5989 = null;
        field5987 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V", line = 186)
    public final void method2537(int arg0, byte arg1) {
        field5981++;
        class104 var3 = this.field5985;
        synchronized (this.field5985) {
            this.field5985.method666(arg0, false);
        }
        if (arg1 < 113) {
            field5987 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lmp;", line = 211)
    private final class224 method2538(int arg0, int arg1) {
        field5979++;
        class104 var3 = this.field5985;
        class224 var4;
        synchronized (this.field5985) {
            var4 = (class224) this.field5985.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5978.method2029(29, arg1, 0);
        class224 var6 = new class224();
        if (var5 != null) {
            var6.method1413((byte) 114, new class425(var5));
        }
        class104 var7 = this.field5985;
        synchronized (this.field5985) {
            if (arg0 != 16) {
                method2533((byte) -104, -40, 126, -44, 27, 5);
            }
            this.field5985.method653(95, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 243)
    public class436(class328 arg0, int arg1, class343 arg2) {
        this.field5978 = arg2;
        this.field5978.method2054(0, 29);
    }
}
