import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class301 extends class194 {

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
    private int field4013 = 0;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    private int field4009 = 0;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "I")
    private int field4026 = 0;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "F")
    public static float field4020 = 1024.0F;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lhq;")
    public static class365 field4028 = new class365(64);

    @OriginalMember(owner = "client!cc", name = "fb", descriptor = "[Lqg;")
    public static class140[] field4032 = new class140[14];

    @OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
    public static int[] field4030 = new int[99];

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
    private int field4017;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "I")
    private int field4023;

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    private int field4027;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!cc", name = "eb", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
    public static int[] field4015;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZILjava/lang/String;Lwo;)Lv;")
    public static final class392 method1909(boolean arg0, int arg1, String arg2, class285 arg3) {
        ++field4021;
        int var4 = arg3.method1806((byte) -100, arg2);
        if (arg1 < 85) {
            field4032 = null;
        }
        if (~var4 == 0) {
            return new class392(0);
        } else {
            int[] var5 = arg3.method1810(114, var4);
            class392 var6 = new class392(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (~var6.field5337 < ~var7) {
                    class242 var9 = new class242(arg3.method1794(5860, var4, var5[var8++]));
                    int var10 = var9.method1576((byte) 127);
                    int var11 = var9.method1587((byte) -102);
                    int var12 = var9.method1563(-128);
                    if (!arg0 && var12 == 1) {
                        --var6.field5337;
                    } else {
                        var6.field5342[var7] = var10;
                        var6.field5338[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method1910(byte arg0) {
        field4015 = null;
        field4032 = null;
        field4028 = null;
        int var1 = -63 / ((arg0 - 32) / 42);
        field4030 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBI)V")
    private final void method1911(int arg0, int arg1, byte arg2, int arg3) {
        ++field4011;
        int var5 = ~arg0 < -2049 ? -(arg0 * arg3 >> 12) + arg3 + arg0 : (arg3 + 4096) * arg0 >> 12;
        if (var5 <= 0) {
            this.field4010 = this.field4023 = this.field4017 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (var9 != 3) {
                            if (~var9 != -5) {
                                if (~var9 == -6) {
                                    this.field4017 = var15;
                                    this.field4023 = var7;
                                    this.field4010 = var5;
                                }
                            } else {
                                this.field4023 = var7;
                                this.field4010 = var14;
                                this.field4017 = var5;
                            }
                        } else {
                            this.field4023 = var15;
                            this.field4010 = var7;
                            this.field4017 = var5;
                        }
                    } else {
                        this.field4017 = var14;
                        this.field4023 = var5;
                        this.field4010 = var7;
                    }
                } else {
                    this.field4017 = var7;
                    this.field4010 = var15;
                    this.field4023 = var5;
                }
            } else {
                this.field4023 = var14;
                this.field4017 = var7;
                this.field4010 = var5;
            }
        }
        if (arg2 != -104) {
            this.method59(78, 14);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field4022;
        int[][] var3 = super.field2283.method1667(arg1, -119);
        if (arg0 != -730) {
            this.field4012 = -67;
        }
        if (super.field2283.field3451) {
            int[][] var4 = this.method1200(60, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class138.field1579; ++var11) {
                this.method1914(var6[var11], var5[var11], var7[var11], -128);
                this.field4016 += this.field4009;
                this.field4012 += this.field4026;
                for (this.field4027 += this.field4013; this.field4027 < 0; this.field4027 += 4096) {
                }
                while (this.field4027 > 4096) {
                    this.field4027 -= 4096;
                }
                if (~this.field4012 > -1) {
                    this.field4012 = 0;
                }
                if (~this.field4016 > -1) {
                    this.field4016 = 0;
                }
                if (this.field4012 > 4096) {
                    this.field4012 = 4096;
                }
                if (this.field4016 > 4096) {
                    this.field4016 = 4096;
                }
                this.method1911(this.field4016, this.field4027, (byte) -104, this.field4012);
                var8[var11] = this.field4010;
                var9[var11] = this.field4023;
                var10[var11] = this.field4017;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIBIII)V")
    public static final void method1912(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field4024;
        if (arg0) {
            class28.method177(-27506);
        }
        if (class53.field620 != null && (arg1 != 3 || ~class428.field5851 != ~arg5 || class244.field3249 != arg4)) {
            class53.method303(true, class401.field5525, class53.field620);
            class53.field620 = null;
        }
        if (arg1 == 3 && class53.field620 == null) {
            class53.field620 = class440.method2705((byte) -63, 0, class401.field5525, arg5, 0, arg4);
            if (class53.field620 != null) {
                class428.field5851 = arg5;
                class244.field3249 = arg4;
                class362.method2273(class401.field5525, (byte) 106);
            }
        }
        if (~arg1 == -4 && class53.field620 == null) {
            method1912(true, class444.field6135, (byte) -38, arg3, -1, -1);
        } else {
            Container var6;
            if (class53.field620 != null) {
                class450.field6290 = arg4;
                var6 = class53.field620;
                class283.field3693 = arg5;
            } else if (class167.field1942 == null) {
                var6 = class401.field5525.field6077;
                class283.field3693 = var6.getSize().width;
                class450.field6290 = var6.getSize().height;
            } else {
                Insets var7 = class167.field1942.getInsets();
                class283.field3693 = class167.field1942.getSize().width - var7.right - var7.left;
                int var10001 = var7.top + var7.bottom;
                class450.field6290 = class167.field1942.getSize().height - var10001;
                var6 = class167.field1942;
            }
            if (arg1 == 1) {
                class398.field5402 = (class283.field3693 + -765) / 2;
                class28.field315 = 503;
                class39.field457 = 765;
                class236.field3104 = 0;
            } else if (~class105.field1254 > -97 && class20.field220 == 0) {
                int var8 = ~class283.field3693 >= -1025 ? class283.field3693 : 1024;
                int var9 = ~class450.field6290 < -769 ? 768 : class450.field6290;
                class39.field457 = var8;
                class398.field5402 = (class283.field3693 - var8) / 2;
                class236.field3104 = 0;
                class28.field315 = var9;
            } else {
                class28.field315 = class450.field6290;
                class236.field3104 = 0;
                class39.field457 = class283.field3693;
                class398.field5402 = 0;
            }
            if (~class94.field1105 != -1) {
                boolean var10000;
                if (class39.field457 < 1024 && ~class28.field315 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            if (arg2 != -38) {
                method1912(false, -69, (byte) 111, -103, 11, -43);
            }
            if (arg0) {
                class373.method2338(arg2 ^ -94, class20.field220);
            } else {
                class357.field4845.setSize(class39.field457, class28.field315);
                if (class267.field3454 != null) {
                    class267.field3454.method776();
                }
                if (class167.field1942 != var6) {
                    class357.field4845.setLocation(class398.field5402, class236.field3104);
                } else {
                    Insets var10 = class167.field1942.getInsets();
                    class357.field4845.setLocation(class398.field5402 + var10.left, var10.top - -class236.field3104);
                }
            }
            if (arg1 < 2) {
                class158.field1840 = false;
            } else {
                class158.field1840 = true;
            }
            if (~class366.field4983 != 0) {
                class18.method106(true, (byte) 67);
            }
            if (class181.field2107 != null && (class174.field2017 == 30 || class174.field2017 == 25)) {
                class80.method504(32);
            }
            for (int var11 = 0; var11 < 100; ++var11) {
                class65.field786[var11] = true;
            }
            class422.field5790 = true;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
    public class301() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
    public static final void method1913(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 << 3;
        int var5 = arg1 << 3;
        ++field4031;
        int var6 = arg0 << 3;
        class434.field5929 = (float) var5;
        if (~class320.field4294 == -3) {
            class433.field5912 = var5;
            class127.field1417 = var6;
            class178.field2081 = var4;
        }
        field4020 = (float) var4;
        class355.method2248(-21491);
        if (arg3 > -59) {
            method1910((byte) -47);
        }
        class392.field5340 = true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field4009 = (arg2.method1589(false) << 12) / 100;
                }
            } else {
                this.field4026 = (arg2.method1589(false) << 12) / 100;
            }
        } else {
            this.field4013 = arg2.method1582(false);
        }
        ++field4029;
        int var5 = -23 / ((arg1 - 52) / 61);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIII)V")
    private final void method1914(int arg0, int arg1, int arg2, int arg3) {
        ++field4018;
        int var5 = arg1 <= arg0 ? arg0 : arg1;
        int var6 = var5 >= arg2 ? var5 : arg2;
        int var7 = ~arg1 > ~arg0 ? arg1 : arg0;
        int var8 = arg2 >= var7 ? var7 : arg2;
        int var9 = -var8 + var6;
        this.field4016 = (var8 - -var6) / 2;
        if (var9 > 0) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (-arg0 + var6 << 12) / var9;
            int var12 = (-arg2 + var6 << 12) / var9;
            if (~arg1 != ~var6) {
                if (~arg0 == ~var6) {
                    this.field4027 = ~arg2 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field4027 = ~arg1 == ~var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field4027 = arg0 == var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field4027 /= 6;
        } else {
            this.field4027 = 0;
        }
        if (~this.field4016 < -1 && ~this.field4016 > -4097) {
            this.field4012 = (var9 << 12) / (~this.field4016 >= -2049 ? this.field4016 * 2 : 8192 - this.field4016 * 2);
        } else {
            this.field4012 = 0;
        }
        if (arg3 >= -115) {
            method1909(false, -62, (String) null, (class285) null);
        }
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)I")
    public static final int method1915(int arg0) {
        ++field4025;
        class365 var1 = class263.field3379;
        synchronized (class263.field3379) {
            if (arg0 != 17052) {
                field4014 = 17;
            }
            return class263.field3379.method2293((byte) 123);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; ~var1 > -100; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4030[var1] = var0 / 4;
        }
    }
}
