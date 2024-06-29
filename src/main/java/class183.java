import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class183 extends class278 {

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    private int field2562 = 2048;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    private int field2560 = 0;

    @OriginalMember(owner = "client!s", name = "Y", descriptor = "I")
    private int field2569 = 10;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "Lff;")
    public static class9 field2559 = new class9(8);

    @OriginalMember(owner = "client!s", name = "S", descriptor = "Ljm;")
    public static class485 field2563 = new class485(10, 8);

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "[I")
    private int[] field2558;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "[I")
    private int[] field2564;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V", line = 7)
    public final void method207(int arg0) {
        this.method1108(arg0 + -89);
        ++field2568;
        if (arg0 != 2) {
            field2559 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 18)
    private final void method1108(int arg0) {
        ++field2566;
        this.field2564 = new int[this.field2569 + 1];
        int var2 = 0;
        this.field2558 = new int[this.field2569 + 1];
        int var3 = 4096 / this.field2569;
        int var4 = this.field2562 * var3 >> 12;
        for (int var5 = 0; ~this.field2569 < ~var5; ++var5) {
            this.field2558[var5] = var2;
            this.field2564[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field2558[this.field2569] = 4096;
        this.field2564[this.field2569] = this.field2564[0] + 4096;
        if (arg0 > -77) {
            this.method1108(-40);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V", line = 52)
    public static void method1109(boolean arg0) {
        field2559 = null;
        field2563 = null;
        if (!arg0) {
            method1110((class240) null, 119, -12, 78);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Llh;II)V", line = 64)
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2560 = arg0.method2099(255);
                }
            } else {
                this.field2562 = arg0.method2062((byte) 14);
            }
        } else {
            this.field2569 = arg0.method2099(255);
        }
        ++field2561;
        if (arg1 != -30446) {
            method1113((byte) 118, 100);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)[I", line = 109)
    public final int[] method208(int arg0, int arg1) {
        if (arg0 != -9) {
            this.method207(52);
        }
        ++field2556;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            int var4 = class454.field6637[arg1];
            if (~this.field2560 == -1) {
                short var5 = 0;
                for (int var6 = 0; ~var6 > ~this.field2569; ++var6) {
                    if (~this.field2558[var6] >= ~var4 && var4 < this.field2558[var6 - -1]) {
                        if (this.field2564[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class416.method2486(var3, 0, class507.field7456, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class507.field7456; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class192.field2736[var7];
                    int var11 = this.field2560;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 - (4096 - var10) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field2569 > var12; ++var12) {
                        if (~var8 <= ~this.field2558[var12] && var8 < this.field2558[var12 + 1]) {
                            if (~var8 > ~this.field2564[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 354)
    public class183() {
        super(0, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lvh;III)Lwk;", line = 231)
    public static final class94 method1110(class240 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -5960) {
            method1110((class240) null, -126, 45, 77);
        }
        ++field2554;
        byte[] var4 = arg0.method1411(true, arg3, arg2);
        return var4 == null ? null : new class94(var4);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V", line = 250)
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2565;
        int var6 = -arg1 + arg3;
        int var7 = -arg0 + arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class322.method1815(arg1, arg0, arg4, false, arg2);
            }
        } else if (~var7 == -1) {
            class133.method876(0, arg0, arg1, arg4, arg3);
        } else if (arg5 == -549645428) {
            int var8 = (var7 << 12) / var6;
            int var9 = -(arg1 * var8 >> 12) + arg0;
            int var10;
            int var11;
            if (arg1 >= class382.field5379) {
                if (~arg1 >= ~class175.field2497) {
                    var10 = arg0;
                    var11 = arg1;
                } else {
                    var10 = (class175.field2497 * var8 >> 12) + var9;
                    var11 = class175.field2497;
                }
            } else {
                var11 = class382.field5379;
                var10 = var9 - -(class382.field5379 * var8 >> 12);
            }
            int var12;
            int var13;
            if (~class382.field5379 < ~arg3) {
                var12 = var9 - -(class382.field5379 * var8 >> 12);
                var13 = class382.field5379;
            } else if (class175.field2497 >= arg3) {
                var12 = arg2;
                var13 = arg3;
            } else {
                var12 = (class175.field2497 * var8 >> 12) + var9;
                var13 = class175.field2497;
            }
            if (class343.field4727 <= var12) {
                if (~var12 < ~class54.field753) {
                    var12 = class54.field753;
                    var13 = (class54.field753 - var9 << 12) / var8;
                }
            } else {
                var13 = (-var9 + class343.field4727 << 12) / var8;
                var12 = class343.field4727;
            }
            if (class343.field4727 > var10) {
                var10 = class343.field4727;
                var11 = (-var9 + class343.field4727 << 12) / var8;
            } else if (~class54.field753 > ~var10) {
                var11 = (-var9 + class54.field753 << 12) / var8;
                var10 = class54.field753;
            }
            class485.method2860(var12, var10, 0, arg4, var11, var13);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;BI)V", line = 357)
    public static final void method1112(String arg0, byte arg1, int arg2) {
        class356.method1978((byte) 31, class76.field1100);
        ++field2567;
        ++class174.field2492;
        class244.field3395.method2084(1 - -class121.method780(arg0, (byte) 99), false);
        class244.field3395.method2067(arg2, 32479);
        class244.field3395.method2073(109, arg0);
        int var3 = -84 / ((arg1 - -67) / 52);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V", line = 373)
    public static final void method1113(byte arg0, int arg1) {
        class528.method3103((byte) -44);
        ++field2557;
        int var2 = class468.field6847.method1306(61, arg1).field4311;
        if (arg0 == -122) {
            if (~var2 != -1) {
                int var3 = class453.field6623.field4675[arg1];
                if (var2 == 5) {
                    class17.field186 = var3;
                }
                if (~var2 == -7) {
                    class349.field4789 = var3;
                }
            }
        }
    }
}
