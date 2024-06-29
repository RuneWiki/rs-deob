import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class309 {

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lvh;")
    private class328 field4612 = new class328(16);

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lpj;")
    private class132 field4608;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lcga;")
    public static class442 field4604;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
    public static int[] field4611;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([III[IILgj;)Lgn;")
    public static final class644 method1900(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, class580 arg5) {
        if (arg2 > -26) {
            return null;
        }
        field4606++;
        if (!arg5.method345(class381.field5355, (byte) 40, class82.field1147)) {
            int[] var10 = new int[arg1 * arg4];
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg4 * var11 + arg0[var11];
                for (int var13 = 0; var13 < arg3[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class644(arg5, arg4, arg1, var10);
        }
        byte[] var6 = new byte[arg1 * arg4];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg4 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class644(arg5, arg4, arg1, var6);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public final void method1901(int arg0, int arg1) {
        class328 var3 = this.field4612;
        synchronized (this.field4612) {
            if (arg1 != 8192) {
                this.field4608 = null;
            }
            this.field4612.method1989(arg0, (byte) 87);
        }
        field4607++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)Llfa;")
    public final class100 method1902(int arg0, int arg1) {
        field4605++;
        class328 var3 = this.field4612;
        class100 var4;
        synchronized (this.field4612) {
            var4 = (class100) this.field4612.method1986((byte) -102, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field4608;
        byte[] var6;
        synchronized (this.field4608) {
            var6 = this.field4608.method940(arg0, arg1, 0);
        }
        class100 var7 = new class100();
        if (var6 != null) {
            var7.method773(new class96(var6), arg0 + 40);
        }
        class328 var8 = this.field4612;
        synchronized (this.field4612) {
            this.field4612.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1903(int arg0) {
        field4611 = null;
        field4604 = null;
        if (arg0 != -31612) {
            field4604 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method1904(boolean arg0) {
        class328 var2 = this.field4612;
        synchronized (this.field4612) {
            this.field4612.method1997(1);
        }
        if (!arg0) {
            field4613++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method1905(int arg0) {
        class328 var2 = this.field4612;
        synchronized (this.field4612) {
            int var3 = -15 / ((-arg0 - 29) / 60);
            this.field4612.method1987(-31085);
        }
        field4610++;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public static final void method1906(boolean arg0) {
        field4609++;
        int var1 = class663.field9356 * 512 + 256;
        int var2 = class576.field7741 * 512 + 256;
        int var3 = class203.method1355(var2, var1, 4, class233.field3305) - class130.field1785;
        if (class678.field9554 < 100) {
            if (var1 > class172.field2572) {
                class172.field2572 += class30.field365 + ((var1 - class172.field2572) * class678.field9554 / 1000);
                if (class172.field2572 > var1) {
                    class172.field2572 = var1;
                }
            }
            if (class628.field8762 < var3) {
                class628.field8762 += (var3 - class628.field8762) * class678.field9554 / 1000 + class30.field365;
                if (var3 < class628.field8762) {
                    class628.field8762 = var3;
                }
            }
            if (var1 < class172.field2572) {
                class172.field2572 -= (class172.field2572 - var1) * class678.field9554 / 1000 + class30.field365;
                if (var1 > class172.field2572) {
                    class172.field2572 = var1;
                }
            }
            if (class628.field8762 > var3) {
                class628.field8762 -= (class628.field8762 - var3) * class678.field9554 / 1000 + class30.field365;
                if (class628.field8762 < var3) {
                    class628.field8762 = var3;
                }
            }
            if (var2 > class117.field1563) {
                class117.field1563 += (var2 - class117.field1563) * class678.field9554 / 1000 + class30.field365;
                if (var2 < class117.field1563) {
                    class117.field1563 = var2;
                }
            }
            if (var2 < class117.field1563) {
                class117.field1563 -= (class117.field1563 - var2) * class678.field9554 / 1000 + class30.field365;
                if (var2 > class117.field1563) {
                    class117.field1563 = var2;
                }
            }
        } else {
            class117.field1563 = class576.field7741 * 512 + 256;
            class172.field2572 = class663.field9356 * 512 + 256;
            class628.field8762 = class203.method1355(class117.field1563, class172.field2572, 4, class233.field3305) - class130.field1785;
        }
        int var4 = class528.field7231 * 512 + 256;
        int var5 = class407.field5738 * 512 + 256;
        int var6 = class203.method1355(var4, var5, 4, class233.field3305) - class527.field7223;
        int var7 = var5 - class172.field2572;
        int var8 = var6 - class628.field8762;
        int var9 = var4 - class117.field1563;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class492.field6794) {
            class492.field6794 += (var11 - class492.field6794 >> 3) * class576.field7745 / 1000 + class648.field9190 << 3;
            if (var11 < class492.field6794) {
                class492.field6794 = var11;
            }
        }
        if (class492.field6794 > var11) {
            class492.field6794 -= class648.field9190 + ((class492.field6794 - var11 >> 3) * class576.field7745 / 1000) << 3;
            if (class492.field6794 < var11) {
                class492.field6794 = var11;
            }
        }
        int var13 = var12 - class591.field8245;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class591.field8245 += class576.field7745 * var14 / 1000 + class648.field9190 << 3;
            class591.field8245 &= 0x3FFF;
        }
        if (var14 < 0) {
            class591.field8245 -= -var14 * class576.field7745 / 1000 + class648.field9190 << 3;
            class591.field8245 &= 0x3FFF;
        }
        if (!arg0) {
            field4611 = null;
        }
        int var15 = var12 - class591.field8245;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class591.field8245 = var12;
        }
        class263.field3732 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class309(class647 arg0, int arg1, class132 arg2) {
        this.field4608 = arg2;
        this.field4608.method936(30, -125);
    }
}
