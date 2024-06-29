import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class549 {

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lvh;")
    private class328 field7433 = new class328(64);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Lpj;")
    private class132 field7430;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field7431;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(BI)I")
    public static final int method3016(byte arg0, int arg1) {
        field7434++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        if (arg0 < 26) {
            return -26;
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method3017(boolean arg0) {
        class328 var2 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method1997(1);
        }
        if (arg0) {
            method3016((byte) -52, -63);
        }
        field7429++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Ljg;")
    public final class308 method3018(int arg0, int arg1) {
        field7431++;
        class328 var3 = this.field7433;
        class308 var4;
        synchronized (this.field7433) {
            var4 = (class308) this.field7433.method1986((byte) -103, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field7430;
        byte[] var6;
        synchronized (this.field7430) {
            var6 = this.field7430.method940(arg1, arg0, 0);
        }
        class308 var7 = new class308();
        if (var6 != null) {
            var7.method1896(new class96(var6), (byte) 15);
        }
        class328 var8 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method3019(byte arg0) {
        if (arg0 != -43) {
            this.field7430 = null;
        }
        field7432++;
        class328 var2 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method1987(arg0 ^ 0x7946);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(II)V")
    public final void method3020(int arg0, int arg1) {
        field7435++;
        class328 var3 = this.field7433;
        synchronized (this.field7433) {
            this.field7433.method1989(arg1, (byte) 102);
        }
        if (arg0 > -28) {
            this.method3020(-19, -1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([II[J)V")
    public static final void method3021(int[] arg0, int arg1, long[] arg2) {
        field7436++;
        class375.method2186(arg2.length - 1, 0, 1, arg0, arg2);
        if (arg1 > 46) {
            ;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class549(class647 arg0, int arg1, class132 arg2) {
        this.field7430 = arg2;
        this.field7430.method936(32, -110);
    }
}
