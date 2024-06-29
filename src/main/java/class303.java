import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class303 {

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Z")
    private boolean field4095 = true;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    private int field4098 = -1;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[Lje;")
    private class300[] field4102;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    private int field4104;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    private int field4093;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    private int field4100;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[Lje;")
    private class300[] field4105;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Lje;")
    private class300 field4094;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "[J")
    public static long[] field4101 = new long[100];

    @OriginalMember(owner = "client!da", name = "s", descriptor = "Lik;")
    public static class410 field4106 = new class410(64);

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    private int field4089;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lkb;")
    private class80 field4092;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1935(int arg0) {
        if (arg0 != -9020) {
            field4107 = 8;
        }
        field4106 = null;
        field4101 = null;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public final void method1936(int arg0) {
        if (this.field4102 != null) {
            for (int var2 = 0; var2 < this.field4102.length; var2++) {
                this.field4102[var2].method1918();
            }
        }
        field4091++;
        if (arg0 >= -24) {
            method1935(104);
        }
        this.field4092 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lpe;II)Z")
    public final boolean method1937(class391 arg0, int arg1, int arg2) {
        if (this.field4098 != arg1) {
            this.field4098 = arg1;
            int var4 = class443.method2751(true, arg1);
            if (var4 > arg1) {
                var4 = class177.method1321(arg1, 0);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field4090 != var4) {
                this.field4092 = null;
                this.field4090 = var4;
            }
            if (this.field4102 != null) {
                this.field4089 = 0;
                int[] var5 = new int[this.field4102.length];
                for (int var6 = 0; var6 < this.field4102.length; var6++) {
                    class300 var7 = this.field4102[var6];
                    if (var7.method1917(this.field4093, this.field4100, this.field4104, this.field4098)) {
                        var5[this.field4089] = var7.field4037;
                        this.field4105[this.field4089++] = var7;
                    }
                }
                class180.method1329(var5, this.field4089 - 1, this.field4105, (byte) -52, 0);
            }
            this.field4095 = true;
        }
        field4097++;
        if (arg2 != -1) {
            this.method1937((class391) null, -123, 89);
        }
        boolean var8 = false;
        if (this.field4095) {
            this.field4095 = false;
            for (int var9 = this.field4089 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field4105[var9].method1919(arg0, this.field4094);
                this.field4095 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIILpe;)V")
    public final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class391 arg9) {
        int var11 = arg3 + arg8 & 0x3FFF;
        field4103++;
        if (~this.field4096 == arg7) {
            arg9.method95(arg6, arg1, arg5, arg2, arg4, 0);
        } else {
            class122 var12 = class370.field5129.method917((byte) 121, this.field4096);
            if (this.field4092 == null && class370.field5129.method918(this.field4096, arg7 ^ 0xFFFFFDC9)) {
                int[] var13 = var12.field1701 ? class370.field5129.method919(-127, this.field4090, this.field4090, this.field4096, false, 0.7F) : class370.field5129.method916(0.7F, arg7 + 109, this.field4096, false, this.field4090, this.field4090);
                this.field4092 = arg9.method188(var13, 0, this.field4090, this.field4090, this.field4090);
            }
            if (!var12.field1701) {
                arg9.method95(arg6, arg1, arg5, arg2, arg4, 0);
            }
            if (this.field4092 != null) {
                int var14 = var12.field1701 ? 0 : 1;
                int var15 = arg0 * arg2 / -4096;
                int var16;
                for (var16 = (arg5 - arg2) / 2 + (arg2 * var11 / 4096); var16 > arg2; var16 -= arg2) {
                }
                while (arg2 < var15) {
                    var15 -= arg2;
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg5; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field4092.method726(arg6 + var17, var18 - -arg1, arg2, arg2, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field4089 - 1; var19 >= 0; var19--) {
            this.field4105[var19].method1924(arg9, arg6, arg1, arg5, arg2, arg0, var11);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I[Lje;IIII)V")
    public class303(int arg0, class300[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4102 = arg1;
        this.field4104 = arg5;
        this.field4093 = arg3;
        this.field4096 = arg0;
        this.field4100 = arg4;
        if (arg1 == null) {
            this.field4094 = null;
            this.field4105 = null;
        } else {
            this.field4105 = new class300[arg1.length];
            this.field4094 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
