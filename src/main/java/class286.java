import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class286 extends class328 {

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    private int field4162 = 0;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    private int field4164 = 2048;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field4171 = 10;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Lpj;")
    public static class218 field4170 = null;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lbv;")
    public static class567 field4165 = new class567("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "[I")
    private int[] field4168;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[I")
    private int[] field4169;

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class286() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
    private final void method1816(byte arg0) {
        ++field4163;
        int var2 = 0;
        this.field4169 = new int[this.field4171 + 1];
        this.field4168 = new int[this.field4171 + 1];
        if (arg0 == -28) {
            int var3 = 4096 / this.field4171;
            int var4 = this.field4164 * var3 >> 12;
            for (int var5 = 0; this.field4171 > var5; ++var5) {
                this.field4169[var5] = var2;
                this.field4168[var5] = var2 + var4;
                var2 += var3;
            }
            this.field4169[this.field4171] = 4096;
            this.field4168[this.field4171] = this.field4168[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V")
    public static final void method1817(int arg0) {
        ++field4173;
        int var1 = class168.field2453 * 128 + 64;
        int var2 = class322.field4665 * 128 + 64;
        int var3 = class355.method2160(var1, var2, class545.field7583, (byte) 103) + -class129.field2100;
        if (class130.field2114 >= 100) {
            class216.field3274 = class322.field4665 * 128 + 64;
            class545.field7584 = class168.field2453 * 128 + 64;
            class448.field6535 = class355.method2160(class545.field7584, class216.field3274, class545.field7583, (byte) 103) + -class129.field2100;
        } else {
            if (~class545.field7584 > ~var1) {
                class545.field7584 += (-class545.field7584 + var1) * class130.field2114 / 1000 + class598.field8508;
                if (~var1 > ~class545.field7584) {
                    class545.field7584 = var1;
                }
            }
            if (~var1 > ~class545.field7584) {
                class545.field7584 -= class598.field8508 - -((-var1 + class545.field7584) * class130.field2114 / 1000);
                if (class545.field7584 < var1) {
                    class545.field7584 = var1;
                }
            }
            if (var3 > class448.field6535) {
                class448.field6535 += (-class448.field6535 + var3) * class130.field2114 / 1000 + class598.field8508;
                if (~var3 > ~class448.field6535) {
                    class448.field6535 = var3;
                }
            }
            if (class216.field3274 < var2) {
                class216.field3274 += (-class216.field3274 + var2) * class130.field2114 / 1000 + class598.field8508;
                if (~class216.field3274 < ~var2) {
                    class216.field3274 = var2;
                }
            }
            if (class448.field6535 > var3) {
                class448.field6535 -= class598.field8508 - -((-var3 + class448.field6535) * class130.field2114 / 1000);
                if (var3 > class448.field6535) {
                    class448.field6535 = var3;
                }
            }
            if (class216.field3274 > var2) {
                class216.field3274 -= (-var2 + class216.field3274) * class130.field2114 / 1000 + class598.field8508;
                if (~var2 < ~class216.field3274) {
                    class216.field3274 = var2;
                }
            }
        }
        if (arg0 >= 5) {
            int var4 = class424.field6204 * 128 + 64;
            int var5 = class127.field2089 * 128 + 64;
            int var6 = class355.method2160(var5, var4, class545.field7583, (byte) 103) - class270.field3979;
            int var7 = -class545.field7584 + var5;
            int var8 = -class448.field6535 + var6;
            int var9 = -class216.field3274 + var4;
            int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
            int var11 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) var8, (double) var10));
            if (var11 < 1024) {
                var11 = 1024;
            }
            int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 16383;
            if (~var11 < -3073) {
                var11 = 3072;
            }
            if (~var11 < ~class217.field3284) {
                class217.field3284 += (-class217.field3284 + var11 >> 3) * class106.field1777 / 1000 + class378.field5560 << 3;
                if (var11 < class217.field3284) {
                    class217.field3284 = var11;
                }
            }
            if (~class217.field3284 < ~var11) {
                class217.field3284 -= (-var11 + class217.field3284 >> 3) * class106.field1777 / 1000 + class378.field5560 << 3;
                if (~class217.field3284 > ~var11) {
                    class217.field3284 = var11;
                }
            }
            int var13 = -class265.field3862 + var12;
            if (var13 > 8192) {
                var13 -= 16384;
            }
            if (~var13 > 8191) {
                var13 += 16384;
            }
            int var14 = var13 >> 3;
            if (var14 > 0) {
                class265.field3862 += class106.field1777 * var14 / 1000 + class378.field5560 << 3;
                class265.field3862 &= 16383;
            }
            if (~var14 > -1) {
                class265.field3862 -= -var14 * class106.field1777 / 1000 + class378.field5560 << 3;
                class265.field3862 &= 16383;
            }
            int var15 = -class265.field3862 + var12;
            if (var15 > 8192) {
                var15 -= 16384;
            }
            if (var15 < -8192) {
                var15 += 16384;
            }
            if (~var15 > -1 && var14 > 0 || var15 > 0 && var14 < 0) {
                class265.field3862 = var12;
            }
            class394.field5910 = 0;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field4172;
        int[] var3 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int var4 = class638.field9258[arg0];
            if (~this.field4162 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field4171; ++var6) {
                    if (~var4 <= ~this.field4169[var6] && ~var4 > ~this.field4169[var6 + 1]) {
                        if (~this.field4168[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class164.method1149(var3, 0, class449.field6539, var5);
            } else {
                for (int var7 = 0; class449.field6539 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class206.field2924[var7];
                    int var11 = this.field4162;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = 2048 - -(var10 - (4096 - var4) >> 1);
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field4171 > var12; ++var12) {
                        if (this.field4169[var12] <= var8 && ~this.field4169[var12 + 1] < ~var8) {
                            if (~var8 > ~this.field4168[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        int var13 = 79 % ((arg1 - 48) / 56);
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
    public static void method1818(byte arg0) {
        field4170 = null;
        field4165 = null;
        if (arg0 <= 36) {
            field4165 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field4166;
        if (arg0 < 75) {
            method1818((byte) -57);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field4162 = arg2.method1738(255);
                }
            } else {
                this.field4164 = arg2.method1745(32132);
            }
        } else {
            this.field4171 = arg2.method1738(255);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 >= -97) {
            field4165 = null;
        }
        ++field4161;
        this.method1816((byte) -28);
    }
}
