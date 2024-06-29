import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class189 extends class478 {

    @OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
    private int field2169 = 3216;

    @OriginalMember(owner = "client!tp", name = "K", descriptor = "I")
    private int field2172 = 4096;

    @OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
    private int field2175 = 3216;

    @OriginalMember(owner = "client!tp", name = "L", descriptor = "[I")
    private int[] field2173 = new int[3];

    @OriginalMember(owner = "client!tp", name = "O", descriptor = "Lsb;")
    public static class305 field2176 = new class305(33, 7);

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!tp", name = "F", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!tp", name = "H", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!tp", name = "J", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V")
    public static void method1147(int arg0) {
        int var1 = -57 / ((46 - arg0) / 57);
        field2176 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
    public final void method34(byte arg0) {
        this.method1149(-91);
        ++field2174;
        if (arg0 != 23) {
            field2171 = 114;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
    public class189() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLnp;)V")
    public static final void method1148(byte arg0, class115 arg1) {
        ++field2168;
        byte[] var2 = new byte[24];
        if (arg0 == 60) {
            if (class551.field7878 != null) {
                try {
                    class551.field7878.method3776((byte) 106, 0L);
                    class551.field7878.method3777(var2, false);
                    int var3;
                    for (var3 = 0; ~var3 > -25 && ~var2[var3] == -1; ++var3) {
                    }
                    if (~var3 <= -25) {
                        throw new IOException();
                    }
                } catch (Exception var5) {
                    for (int var4 = 0; ~var4 > -25; ++var4) {
                        var2[var4] = -1;
                    }
                }
            }
            arg1.method629(95, var2, 24, 0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "(I)V")
    private final void method1149(int arg0) {
        ++field2170;
        double var2 = Math.cos((double) ((float) this.field2169 / 4096.0F));
        this.field2173[0] = (int) (Math.sin((double) ((float) this.field2175 / 4096.0F)) * var2 * 4096.0D);
        this.field2173[1] = (int) (var2 * Math.cos((double) ((float) this.field2175 / 4096.0F)) * 4096.0D);
        int var4 = 2 % ((arg0 - -44) / 45);
        this.field2173[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2169 / 4096.0F)));
        int var5 = this.field2173[0] * this.field2173[0] >> 12;
        int var6 = this.field2173[1] * this.field2173[1] >> 12;
        int var7 = this.field2173[2] * this.field2173[2] >> 12;
        int var8 = (int) (Math.sqrt((double) (var5 + var6 + var7 >> 12)) * 4096.0D);
        if (~var8 != -1) {
            this.field2173[2] = (this.field2173[2] << 12) / var8;
            this.field2173[0] = (this.field2173[0] << 12) / var8;
            this.field2173[1] = (this.field2173[1] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1150(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2166;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = -arg5 + arg4;
        int var12 = -arg5 + arg2;
        if (arg1 < -3) {
            int var13 = arg4 * arg4;
            int var14 = arg2 * arg2;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg2 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = var14 - (var21 + -1) * var18;
            int var25 = (-var22 + 1) * var15 - -var19;
            int var26 = -((var22 - 1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg2 + -1) * var27;
            int var37 = var30;
            int var38 = (var12 + -1) * var29;
            int[] var39 = class557.field7954[arg6];
            class315.method1809(var39, arg3, -128, -arg4 + arg7, -var11 + arg7);
            class315.method1809(var39, arg0, -128, arg7 - var11, arg7 + var11);
            class315.method1809(var39, arg3, -128, arg7 + var11, arg4 + arg7);
            while (~var9 < -1) {
                boolean var40 = ~var12 <= ~var9;
                if (var23 < 0) {
                    while (~var23 > -1) {
                        var23 += var31;
                        var24 += var35;
                        var35 += var28;
                        ++var8;
                        var31 += var28;
                    }
                }
                if (var40) {
                    if (~var25 > -1) {
                        while (var25 < 0) {
                            var26 += var37;
                            var25 += var33;
                            var33 += var30;
                            ++var10;
                            var37 += var30;
                        }
                    }
                    if (~var26 > -1) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        ++var10;
                        var33 += var30;
                    }
                    var26 += -var34;
                    var25 += -var38;
                    var34 -= var29;
                    var38 -= var29;
                }
                if (var24 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var35 += var28;
                    var31 += var28;
                    ++var8;
                }
                var24 += -var32;
                var23 += -var36;
                var36 -= var27;
                --var9;
                var32 -= var27;
                int var41 = -var9 + arg6;
                int var42 = arg6 + var9;
                int var43 = arg7 - -var8;
                int var44 = -var8 + arg7;
                if (!var40) {
                    class315.method1809(class557.field7954[var41], arg3, -128, var44, var43);
                    class315.method1809(class557.field7954[var42], arg3, -128, var44, var43);
                } else {
                    int var45 = arg7 + var10;
                    int var46 = -var10 + arg7;
                    class315.method1809(class557.field7954[var41], arg3, -128, var44, var46);
                    class315.method1809(class557.field7954[var41], arg0, -128, var46, var45);
                    class315.method1809(class557.field7954[var41], arg3, -128, var45, var43);
                    class315.method1809(class557.field7954[var42], arg3, -128, var44, var46);
                    class315.method1809(class557.field7954[var42], arg0, -128, var46, var45);
                    class315.method1809(class557.field7954[var42], arg3, -128, var45, var43);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field2164;
        int[] var3 = super.field6886.method789(arg0, (byte) -49);
        if (super.field6886.field1592) {
            int var4 = class674.field9391 * this.field2172 >> 12;
            int[] var5 = this.method2752(class156.field1746 & arg0 + -1, 115, 0);
            int[] var6 = this.method2752(arg0, 123, 0);
            int[] var7 = this.method2752(arg0 - -1 & class156.field1746, 93, 0);
            for (int var8 = 0; var8 < class436.field6154; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class204.field2414 & var8 + -1] + -var6[var8 + 1 & class204.field2414]) * var4 >> 12;
                int var11 = var10 >> 4;
                int var12 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class378.field5120[var11 - -((var12 - -1) * var12 >> 1)];
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var10 * var13 >> 8;
                int var17 = this.field2173[2] * var14 >> 12;
                int var18 = this.field2173[1] * var15 >> 12;
                int var19 = this.field2173[0] * var16 >> 12;
                var3[var8] = var17 + var19 - -var18;
            }
        }
        return arg1 != -11323 ? null : var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILnp;I)V")
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (arg0 != 255) {
            this.field2173 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2169 = arg1.method643((byte) -77);
                }
            } else {
                this.field2175 = arg1.method643((byte) -77);
            }
        } else {
            this.field2172 = arg1.method643((byte) -77);
        }
        ++field2165;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILvj;BII)Lbr;")
    public static final class196 method1151(int arg0, class422 arg1, byte arg2, int arg3, int arg4) {
        ++field2167;
        int var5 = -74 / ((arg2 - -83) / 39);
        if (!arg1.field5966 && (!class483.method2792(arg4, -3) || !class483.method2792(arg0, -3))) {
            return arg1.field5919 ? new class196(arg1, 34037, arg3, arg4, arg0) : new class196(arg1, arg3, arg4, arg0, class553.method3138(1781323777, arg4), class553.method3138(1781323777, arg0));
        } else {
            return new class196(arg1, 3553, arg3, arg4, arg0);
        }
    }
}
