import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class299 {

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Lpca;")
    private class653 field3923 = new class653(64);

    @OriginalMember(owner = "client!js", name = "f", descriptor = "Ljo;")
    private class303 field3919;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ljo;")
    public static class303 field3914;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V")
    public static void method1692(byte arg0) {
        field3914 = null;
        int var1 = -118 / ((-arg0 - 51) / 54);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)V")
    public final void method1693(int arg0, int arg1) {
        class653 var3 = this.field3923;
        synchronized (this.field3923) {
            if (arg1 >= -59) {
                this.method1693(-105, 23);
            }
            this.field3923.method3687((byte) -10);
            this.field3923 = new class653(arg0);
        }
        field3922++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZIIIZII)V")
    public static final void method1694(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3917++;
        if ((arg4 ? class601.field8530.field2875 : class601.field8530.field2841) != 0 && arg2 != 0 && class479.field7037 < 50 && arg1 != -1) {
            class259.field3301[class479.field7037++] = new class561((byte) (arg4 ? 3 : 2), arg1, arg2, arg6, arg3, arg5);
        }
        if (!arg0) {
            method1694(true, -13, -95, -108, true, 6, 111);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
    public static final void method1695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3916++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg1 * arg1;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        if (arg0 != -1958332894) {
            return;
        }
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 - 1) * var15;
        class445.method2463(arg3 - arg1, arg0 + 1958333001, arg1 + arg3, arg5, class156.field1755[arg4]);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var6++;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            class445.method2463(var24, 120, var23, arg5, class156.field1755[var21]);
            class445.method2463(var24, arg0 ^ 0x8B463657, var23, arg5, class156.field1755[var22]);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public final void method1696(int arg0) {
        field3915++;
        class653 var2 = this.field3923;
        synchronized (this.field3923) {
            this.field3923.method3687((byte) -10);
        }
        int var3 = -16 % ((54 - arg0) / 63);
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
    public final void method1697(int arg0, int arg1) {
        class653 var3 = this.field3923;
        synchronized (this.field3923) {
            this.field3923.method3691(false, arg0);
            if (arg1 != -1305) {
                this.method1698((byte) -79);
            }
        }
        field3920++;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public final void method1698(byte arg0) {
        field3921++;
        if (arg0 <= -59) {
            class653 var2 = this.field3923;
            synchronized (this.field3923) {
                this.field3923.method3684(-17200);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)Lh;")
    public final class607 method1699(byte arg0, int arg1) {
        field3918++;
        class653 var3 = this.field3923;
        class607 var4;
        synchronized (this.field3923) {
            var4 = (class607) this.field3923.method3690((byte) 113, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field3919;
        byte[] var6;
        synchronized (this.field3919) {
            var6 = this.field3919.method1719(class234.method1358(arg1, -25998), class214.method1279(arg1, (byte) 125), 4);
        }
        class607 var7 = new class607();
        if (var6 != null) {
            var7.method3386(new class452(var6), (byte) 20);
        }
        if (arg0 != -54) {
            this.field3919 = null;
        }
        class653 var8 = this.field3923;
        synchronized (this.field3923) {
            this.field3923.method3683(var7, (byte) -3, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Ljda;ILjo;)V")
    public class299(class207 arg0, int arg1, class303 arg2) {
        this.field3919 = arg2;
        if (this.field3919 != null) {
            int var4 = this.field3919.method1740((byte) 99) - 1;
            this.field3919.method1727(-77, var4);
        }
    }
}
