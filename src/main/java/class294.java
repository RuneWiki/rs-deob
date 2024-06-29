import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class294 extends class212 {

    @OriginalMember(owner = "client!gga", name = "o", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!gga", name = "p", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!gga", name = "r", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!gga", name = "s", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!gga", name = "t", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!gga", name = "u", descriptor = "[Lmi;")
    public static class496[] field4119;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)I", line = 3)
    public final int method417(int arg0, int arg1) {
        ++field4113;
        return arg0 != 3 ? -26 : 3;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)V", line = 16)
    public final void method418(boolean arg0) {
        ++field4116;
        super.field3006 = this.method422(20014);
        if (arg0) {
            field4119 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I", line = 27)
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            this.method418(true);
        }
        ++field4115;
        return !super.field3004.method2061(-76) ? 0 : 1;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Ldh;)V", line = 42)
    public class294(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)V", line = 50)
    public static void method1923(int arg0) {
        field4119 = null;
        if (arg0 != -4) {
            field4119 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "(I)V", line = 63)
    public static final void method1924(int arg0) {
        ++field4117;
        short var1 = 1024;
        short var2 = 3072;
        if (class458.field6459) {
            var2 = 4096;
            if (class548.field7548) {
                var1 = 2048;
            }
        }
        if (class440.field6267 < (float) var1) {
            class440.field6267 = (float) var1;
        }
        if (class440.field6267 > (float) var2) {
            class440.field6267 = (float) var2;
        }
        while (class451.field6366 >= 16384.0F) {
            class451.field6366 -= 16384.0F;
        }
        while (class451.field6366 < 0.0F) {
            class451.field6366 += 16384.0F;
        }
        int var3 = class162.field2584 >> 9;
        int var4 = class476.field6650 >> 9;
        int var5 = class197.method1403(class162.field2584, class382.field5551, 11219, class476.field6650);
        int var6 = 0;
        if (var3 > 3 && ~var4 < -4 && class376.field5325 + -4 > var3 && class175.field2711 - 4 > var4) {
            for (int var7 = var3 - 4; var3 - -4 >= var7; ++var7) {
                for (int var8 = var4 + -4; var8 <= var4 + 4; ++var8) {
                    int var9 = class382.field5551;
                    if (~var9 > -4 && class334.method2118(var8, var7, true)) {
                        ++var9;
                    }
                    int var10 = 0;
                    if (class546.field7534.field3666 != null && class546.field7534.field3666[var9] != null) {
                        var10 = (class546.field7534.field3666[var9][var7][var8] & 255) * 8 << 2;
                    }
                    if (class683.field9250 != null && class683.field9250[var9] != null) {
                        int var11 = var5 + var10 + -class683.field9250[var9].method1851((byte) -86, var8, var7);
                        if (var6 < var11) {
                            var6 = var11;
                        }
                    }
                }
            }
        }
        int var12 = (var6 >> 2) * 1536;
        if (~var12 < -786433) {
            var12 = 786432;
        }
        if (var12 < arg0) {
            var12 = 262144;
        }
        if (~var12 < ~class113.field1948) {
            class113.field1948 += (var12 - class113.field1948) / 24;
        } else if (class113.field1948 > var12) {
            class113.field1948 += (-class113.field1948 + var12) / 80;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V", line = 163)
    public final void method419(int arg0, int arg1) {
        int var3 = 87 / ((82 - arg0) / 35);
        super.field3006 = arg1;
        ++field4114;
    }

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "(I)I", line = 175)
    public final int method1925(int arg0) {
        ++field4118;
        if (arg0 != -32350) {
            field4119 = null;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILdh;)V", line = 187)
    public class294(int arg0, class322 arg1) {
        super(arg0, arg1);
    }
}
