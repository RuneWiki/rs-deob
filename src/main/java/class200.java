import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class200 extends class263 {

    @OriginalMember(owner = "client!so", name = "R", descriptor = "I")
    private int field2916 = 2048;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "I")
    private int field2914 = 12288;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "I")
    private int field2907 = 0;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "I")
    private int field2911 = 8192;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    private int field2906 = 4096;

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    private int field2912 = 2048;

    @OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
    private int field2915 = 0;

    @OriginalMember(owner = "client!so", name = "U", descriptor = "S")
    public static short field2919 = 1;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!so", name = "S", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!so", name = "T", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!so", name = "W", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!so", name = "X", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!so", name = "V", descriptor = "J")
    public static long field2920;

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V", line = 3)
    public class200() {
        super(0, true);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BII)Z", line = 6)
    private final boolean method1322(byte arg0, int arg1, int arg2) {
        ++field2921;
        int var4 = (-arg2 + arg1) * this.field2914 >> 12;
        int var5 = class14.field188[(var4 * 255 & 1046221) >> 12];
        int var6 = (var5 << 12) / this.field2914;
        if (arg0 <= 45) {
            return false;
        } else {
            int var7 = (var6 << 12) / this.field2911;
            int var8 = this.field2906 * var7 >> 12;
            return var8 > arg2 - -arg1 && -var8 < arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lsc;", line = 24)
    public static final class267 method1323(Throwable arg0, String arg1) {
        ++field2909;
        class267 var2;
        if (arg0 instanceof class267) {
            var2 = (class267) arg0;
            var2.field3973 = var2.field3973 + ' ' + arg1;
        } else {
            var2 = new class267(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(B)V", line = 42)
    public final void method748(byte arg0) {
        method1326(arg0 ^ 36);
        ++field2910;
        if (arg0 != 110) {
            this.field2916 = 102;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZLgk;)V", line = 53)
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        ++field2922;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field2911 = arg2.method2727((byte) 43);
                                }
                            } else {
                                this.field2906 = arg2.method2727((byte) 43);
                            }
                        } else {
                            this.field2914 = arg2.method2727((byte) 43);
                        }
                    } else {
                        this.field2916 = arg2.method2727((byte) 43);
                    }
                } else {
                    this.field2915 = arg2.method2727((byte) 43);
                }
            } else {
                this.field2907 = arg2.method2727((byte) 43);
            }
        } else {
            this.field2912 = arg2.method2727((byte) 43);
        }
        if (!arg1) {
            this.method1322((byte) -65, 19, 20);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)[I", line = 128)
    public final int[] method33(int arg0, byte arg1) {
        if (arg1 <= 40) {
            return null;
        } else {
            ++field2917;
            int[] var3 = super.field3917.method41(arg0, 1);
            if (super.field3917.field91) {
                int var4 = class170.field2509[arg0] + -2048;
                for (int var5 = 0; var5 < class367.field5597; ++var5) {
                    int var6 = class379.field5711[var5] + -2048;
                    int var7 = this.field2912 + var6;
                    int var8 = ~var7 > 2047 ? var7 - -4096 : var7;
                    int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                    int var10 = this.field2907 + var4;
                    int var11 = var10 < -2048 ? var10 - -4096 : var10;
                    int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                    int var13 = var6 - -this.field2915;
                    int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                    int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                    int var16 = this.field2916 + var4;
                    int var17 = var16 < -2048 ? var16 - -4096 : var16;
                    int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                    var3[var5] = !this.method1322((byte) 59, var12, var9) && !this.method1325(var18, 1132106316, var15) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(B)V", line = 187)
    public static final void method1324(byte arg0) {
        if (arg0 <= 12) {
            field2919 = 46;
        }
        ++field2913;
        if (class431.field6399 != -1) {
            class257.method1530(0, class431.field6399, -1, -1, false);
            class431.field6399 = -1;
        }
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(III)Z", line = 223)
    private final boolean method1325(int arg0, int arg1, int arg2) {
        ++field2918;
        int var4 = (arg0 - -arg2) * this.field2914 >> 12;
        if (arg1 != 1132106316) {
            this.field2915 = 100;
        }
        int var5 = class14.field188[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field2914;
        int var7 = (var6 << 12) / this.field2911;
        int var8 = this.field2906 * var7 >> 12;
        return ~(-arg2 + arg0) > ~var8 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V", line = 254)
    public static final void method1326(int arg0) {
        if (class498.field7386 == null || class14.field188 == null) {
            class14.field188 = new int[256];
            class498.field7386 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class498.field7386[var1] = (int) (Math.sin(var2) * 4096.0D);
                class14.field188[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
        if (arg0 < 22) {
            method1324((byte) 92);
        }
        ++field2908;
    }
}
