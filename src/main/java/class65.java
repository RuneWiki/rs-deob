import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class65 {

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Ldr;")
    private class721 field790;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
    private int field805;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Ldu;")
    private class360 field796;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)Z")
    public static boolean method550(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method551(int arg0) {
        if (arg0 != 4) {
            this.method560(81L, -29);
        }
        field806++;
        class32 var2 = (class32) this.field796.method2146(false);
        while (var2 != null) {
            Object var3 = var2.method273(arg0 + 71);
            if (var3 != null) {
                return var3;
            }
            class32 var4 = var2;
            var2 = (class32) this.field796.method2146(false);
            var4.method3564(true);
            var4.method2414((byte) -26);
            this.field805 += var4.field493;
        }
        return null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method552(int arg0, long arg1) {
        if (arg0 != 4) {
            return null;
        }
        field802++;
        class32 var4 = (class32) this.field796.method2135(arg1, (byte) 31);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method273(75);
        if (var5 == null) {
            var4.method3564(true);
            var4.method2414((byte) -26);
            this.field805 += var4.field493;
            return null;
        }
        if (var4.method274((byte) 87)) {
            class243 var6 = new class243(var5, var4.field493);
            this.field796.method2143(-1, var6, var4.field8680);
            this.field790.method4050(var6, arg0 ^ 0xFFFFFF8A);
            var6.field5747 = 0L;
            var4.method3564(true);
            var4.method2414((byte) -26);
        } else {
            this.field790.method4050(var4, -106);
            var4.field5747 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)V")
    public final void method553(int arg0, int arg1) {
        field789++;
        if (arg1 != -15782) {
            field803 = -93;
        }
        if (class403.field5621 == null) {
            return;
        }
        for (class32 var3 = (class32) this.field790.method4051(arg1 ^ 0xFFFFC1DA); var3 != null; var3 = (class32) this.field790.method4049(true)) {
            if (var3.method274((byte) 84)) {
                if (var3.method273(75) == null) {
                    var3.method3564(true);
                    var3.method2414((byte) -26);
                    this.field805 += var3.field493;
                }
            } else if ((long) arg0 < ++var3.field5747) {
                class32 var4 = class403.field5621.method2121(var3, 2);
                this.field796.method2143(-1, var4, var3.field8680);
                class548.method3064(var3, var4, (byte) -101);
                var3.method3564(true);
                var3.method2414((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method554(int arg0) {
        field793++;
        if (arg0 != 3) {
            this.method556((byte) 98, -32L, null);
        }
        class32 var2 = (class32) this.field796.method2144(true);
        while (var2 != null) {
            Object var3 = var2.method273(75);
            if (var3 != null) {
                return var3;
            }
            class32 var4 = var2;
            var2 = (class32) this.field796.method2146(false);
            var4.method3564(true);
            var4.method2414((byte) -26);
            this.field805 += var4.field493;
        }
        return null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lha;IIIILqfa;)V")
    public static final void method555(class59 arg0, int arg1, int arg2, int arg3, int arg4, class100 arg5) {
        field788++;
        class513 var6 = class468.field6426.method1623(arg5.field1294, 126);
        if (var6.field6802 == -1) {
            return;
        }
        int var8;
        if (arg5.field1313) {
            int var7 = arg5.field1314 + arg4;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class133 var9 = var6.method2862(arg5.field1319, arg1 ^ 0x28A50657, arg0, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg5.field1355;
        int var11 = arg5.field1323;
        if ((var8 & 0x1) == 1) {
            var11 = arg5.field1355;
            var10 = arg5.field1323;
        }
        int var12 = var9.method1036();
        int var13 = var9.method1048();
        if (var6.field6804) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field6807 == 0) {
            var9.method1052(arg2, arg3 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method1033(arg2, 4 - (var11 * 4 - arg3), var12, var13, 0, var6.field6807 | 0xFF000000, 1);
        }
        if (arg1 != 4) {
            field803 = 12;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BJLjava/lang/Object;)V")
    public final void method556(byte arg0, long arg1, Object arg2) {
        if (arg0 != 0) {
            this.method553(43, -24);
        }
        field800++;
        this.method562((byte) -71, 1, arg1, arg2);
    }

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)I")
    public final int method557(int arg0) {
        field791++;
        int var2 = 122 % ((48 - arg0) / 50);
        return this.field805;
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(I)V")
    public final void method558(int arg0) {
        field792++;
        if (arg0 != 0) {
            this.field790 = null;
        }
        for (class32 var2 = (class32) this.field790.method4051(896); var2 != null; var2 = (class32) this.field790.method4049(true)) {
            if (var2.method274((byte) 80)) {
                var2.method3564(true);
                var2.method2414((byte) -26);
                this.field805 += var2.field493;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)I")
    public final int method559(boolean arg0) {
        if (arg0) {
            this.method562((byte) 1, -50, 102L, null);
        }
        field794++;
        return this.field807;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(JI)V")
    private final void method560(long arg0, int arg1) {
        field795++;
        class32 var4 = (class32) this.field796.method2135(arg0, (byte) 31);
        this.method563((byte) -43, var4);
        if (arg1 < 37) {
            this.method557(-89);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public final void method561(byte arg0) {
        field799++;
        this.field790.method4055((byte) -74);
        this.field796.method2138(-1);
        this.field805 = this.field807;
        if (arg0 != -78) {
            this.field790 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(I)V")
    public class65(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIJLjava/lang/Object;)V")
    public final void method562(byte arg0, int arg1, long arg2, Object arg3) {
        field804++;
        if (arg1 > this.field807) {
            throw new IllegalStateException("s>cs");
        }
        this.method560(arg2, 107);
        this.field805 -= arg1;
        while (this.field805 < 0) {
            class32 var7 = (class32) this.field790.method4056(896);
            this.method563((byte) -93, var7);
        }
        class243 var6 = new class243(arg3, arg1);
        this.field796.method2143(-1, var6, arg2);
        this.field790.method4050(var6, arg0 - 44);
        var6.field5747 = 0L;
        if (arg0 != -71) {
            this.field790 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BLrk;)V")
    private final void method563(byte arg0, class32 arg1) {
        if (arg1 != null) {
            arg1.method3564(true);
            arg1.method2414((byte) -26);
            this.field805 += arg1.field493;
        }
        field797++;
        if (arg0 > -12) {
            this.method560(-34L, -70);
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(Z)I")
    public final int method564(boolean arg0) {
        if (arg0) {
            this.field790 = null;
        }
        field798++;
        int var2 = 0;
        for (class32 var3 = (class32) this.field790.method4051(896); var3 != null; var3 = (class32) this.field790.method4049(true)) {
            if (!var3.method274((byte) 46)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        this.field790 = new class721();
        this.field805 = arg0;
        this.field807 = arg0;
        int var3;
        for (var3 = 1; arg0 > var3 + var3 && var3 < arg1; var3 += var3) {
        }
        this.field796 = new class360(var3);
    }
}
