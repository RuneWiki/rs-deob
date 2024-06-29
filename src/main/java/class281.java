import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class281 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    private int field4485;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    private int field4482;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[[I")
    public int[][] field4497;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    private int field4488;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "[I")
    public static int[] field4492 = new int[25];

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Z")
    public static boolean field4483 = false;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4489 = new String[1000];

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[S")
    public static short[] field4502;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "[[[B")
    public static byte[][][] field4501;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZZIBII)V")
    public final void method1875(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6) {
        int var8 = arg5 - this.field4482;
        field4490++;
        int var9 = 256;
        int var10 = arg0 - this.field4488;
        if (arg1) {
            var9 |= 0x20000;
        }
        if (arg2) {
            var9 |= 0x40000000;
        }
        for (int var11 = var10; var11 < var10 + arg3; var11++) {
            if (var11 >= 0 && var11 < this.field4503) {
                for (int var12 = var8; var12 < arg6 + var8; var12++) {
                    if (var12 >= 0 && var12 < this.field4485) {
                        this.method1880(var9, var11, var12, arg4 ^ 0xFFFFFFD1);
                    }
                }
            }
        }
        if (arg4 != 83) {
            field4502 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
    public final void method1876(boolean arg0) {
        field4496++;
        for (int var2 = 0; var2 < this.field4503; var2++) {
            for (int var3 = 0; var3 < this.field4485; var3++) {
                if (var2 == 0 || var3 == 0 || (this.field4503 - 5) <= var2 || this.field4485 - 5 <= var3) {
                    this.field4497[var2][var3] = 16777215;
                } else {
                    this.field4497[var2][var3] = 2097152;
                }
            }
        }
        if (arg0) {
            this.field4503 = -47;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)V")
    private final void method1877(int arg0, int arg1, int arg2, int arg3) {
        this.field4497[arg0][arg3] = class204.method1369(this.field4497[arg0][arg3], ~arg2);
        field4493++;
        if (arg1 != -27388) {
            this.method1876(false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIBZZII)V")
    public final void method1878(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field4498++;
        int var8 = arg0 - this.field4482;
        int var9 = arg1 - this.field4488;
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method1880(128, var9, var8, -78);
                this.method1880(8, var9 - 1, var8, -104);
            }
            if (arg5 == 1) {
                this.method1880(2, var9, var8, -114);
                this.method1880(32, var9, var8 + 1, -126);
            }
            if (arg5 == 2) {
                this.method1880(8, var9, var8, -122);
                this.method1880(128, var9 + 1, var8, -106);
            }
            if (arg5 == 3) {
                this.method1880(32, var9, var8, -78);
                this.method1880(2, var9, var8 - 1, -80);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method1880(1, var9, var8, -91);
                this.method1880(16, var9 - 1, var8 + 1, -80);
            }
            if (arg5 == 1) {
                this.method1880(4, var9, var8, -109);
                this.method1880(64, var9 + 1, var8 + 1, -71);
            }
            if (arg5 == 2) {
                this.method1880(16, var9, var8, -77);
                this.method1880(1, var9 + 1, var8 + -1, -77);
            }
            if (arg5 == 3) {
                this.method1880(64, var9, var8, -87);
                this.method1880(4, var9 - 1, var8 + -1, -66);
            }
        }
        if (arg2 <= 57) {
            this.method1875(62, false, true, 2, (byte) 9, 27, 4);
        }
        if (arg6 == 2) {
            if (arg5 == 0) {
                this.method1880(130, var9, var8, -74);
                this.method1880(8, var9 - 1, var8, -89);
                this.method1880(32, var9, var8 + 1, -101);
            }
            if (arg5 == 1) {
                this.method1880(10, var9, var8, -100);
                this.method1880(32, var9, var8 + 1, -82);
                this.method1880(128, var9 + 1, var8, -84);
            }
            if (arg5 == 2) {
                this.method1880(40, var9, var8, -102);
                this.method1880(128, var9 + 1, var8, -104);
                this.method1880(2, var9, var8 - 1, -116);
            }
            if (arg5 == 3) {
                this.method1880(160, var9, var8, -82);
                this.method1880(2, var9, var8 - 1, -79);
                this.method1880(8, var9 - 1, var8, -117);
            }
        }
        if (arg4) {
            if (arg6 == 0) {
                if (arg5 == 0) {
                    this.method1880(65536, var9, var8, -91);
                    this.method1880(4096, var9 - 1, var8, -111);
                }
                if (arg5 == 1) {
                    this.method1880(1024, var9, var8, -97);
                    this.method1880(16384, var9, var8 + 1, -100);
                }
                if (arg5 == 2) {
                    this.method1880(4096, var9, var8, -74);
                    this.method1880(65536, var9 + 1, var8, -88);
                }
                if (arg5 == 3) {
                    this.method1880(16384, var9, var8, -122);
                    this.method1880(1024, var9, var8 - 1, -102);
                }
            }
            if (arg6 == 1 || arg6 == 3) {
                if (arg5 == 0) {
                    this.method1880(512, var9, var8, -105);
                    this.method1880(8192, var9 - 1, var8 + 1, -116);
                }
                if (arg5 == 1) {
                    this.method1880(2048, var9, var8, -72);
                    this.method1880(32768, var9 + 1, var8 + 1, -114);
                }
                if (arg5 == 2) {
                    this.method1880(8192, var9, var8, -92);
                    this.method1880(512, var9 + 1, var8 + -1, -80);
                }
                if (arg5 == 3) {
                    this.method1880(32768, var9, var8, -89);
                    this.method1880(2048, var9 - 1, var8 + -1, -88);
                }
            }
            if (arg6 == 2) {
                if (arg5 == 0) {
                    this.method1880(66560, var9, var8, -68);
                    this.method1880(4096, var9 - 1, var8, -125);
                    this.method1880(16384, var9, var8 + 1, -95);
                }
                if (arg5 == 1) {
                    this.method1880(5120, var9, var8, -103);
                    this.method1880(16384, var9, var8 + 1, -92);
                    this.method1880(65536, var9 + 1, var8, -89);
                }
                if (arg5 == 2) {
                    this.method1880(20480, var9, var8, -89);
                    this.method1880(65536, var9 + 1, var8, -121);
                    this.method1880(1024, var9, var8 - 1, -128);
                }
                if (arg5 == 3) {
                    this.method1880(81920, var9, var8, -73);
                    this.method1880(1024, var9, var8 - 1, -120);
                    this.method1880(4096, var9 - 1, var8, -66);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg6 == 0) {
            if (arg5 == 0) {
                this.method1880(536870912, var9, var8, -103);
                this.method1880(33554432, var9 - 1, var8, -103);
            }
            if (arg5 == 1) {
                this.method1880(8388608, var9, var8, -72);
                this.method1880(134217728, var9, var8 + 1, -106);
            }
            if (arg5 == 2) {
                this.method1880(33554432, var9, var8, -124);
                this.method1880(536870912, var9 + 1, var8, -90);
            }
            if (arg5 == 3) {
                this.method1880(134217728, var9, var8, -64);
                this.method1880(8388608, var9, var8 - 1, -82);
            }
        }
        if (arg6 == 1 || arg6 == 3) {
            if (arg5 == 0) {
                this.method1880(4194304, var9, var8, -81);
                this.method1880(67108864, var9 - 1, var8 + 1, -99);
            }
            if (arg5 == 1) {
                this.method1880(16777216, var9, var8, -98);
                this.method1880(268435456, var9 + 1, var8 + 1, -86);
            }
            if (arg5 == 2) {
                this.method1880(67108864, var9, var8, -66);
                this.method1880(4194304, var9 + 1, var8 - 1, -72);
            }
            if (arg5 == 3) {
                this.method1880(268435456, var9, var8, -64);
                this.method1880(16777216, var9 - 1, var8 - 1, -122);
            }
        }
        if (arg6 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method1880(545259520, var9, var8, -93);
            this.method1880(33554432, var9 - 1, var8, -69);
            this.method1880(134217728, var9, var8 + 1, -77);
        }
        if (arg5 == 1) {
            this.method1880(41943040, var9, var8, -107);
            this.method1880(134217728, var9, var8 + 1, -126);
            this.method1880(536870912, var9 + 1, var8, -91);
        }
        if (arg5 == 2) {
            this.method1880(167772160, var9, var8, -80);
            this.method1880(536870912, var9 + 1, var8, -110);
            this.method1880(8388608, var9, var8 - 1, -113);
        }
        if (arg5 == 3) {
            this.method1880(671088640, var9, var8, -113);
            this.method1880(8388608, var9, var8 - 1, -81);
            this.method1880(33554432, var9 - 1, var8, -70);
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class240 var7 = new class240();
        var7.field3836 = arg1 / 128;
        var7.field3851 = arg2 / 128;
        var7.field3840 = arg3 / 128;
        var7.field3834 = arg4 / 128;
        var7.field3856 = arg0;
        var7.field3838 = arg1;
        var7.field3835 = arg2;
        var7.field3837 = arg3;
        var7.field3832 = arg4;
        var7.field3853 = arg5;
        var7.field3841 = arg6;
        class218.field3493[class297.field4693++] = var7;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIII)V")
    private final void method1880(int arg0, int arg1, int arg2, int arg3) {
        this.field4497[arg1][arg2] = class45.method348(this.field4497[arg1][arg2], arg0);
        if (arg3 > -63) {
            this.field4497 = null;
        }
        field4494++;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIIIIZ)V")
    public final void method1881(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var9 = arg3 - this.field4482;
        field4491++;
        int var10 = arg2 - this.field4488;
        if (arg6 == 1 || arg6 == 3) {
            int var11 = arg5;
            arg5 = arg4;
            arg4 = var11;
        }
        int var12 = 256;
        if (arg0) {
            var12 |= 0x20000;
        }
        if (arg7) {
            var12 |= 0x40000000;
        }
        int var13 = var10;
        if (arg1 != -18488) {
            field4492 = null;
        }
        while (arg5 + var10 > var13) {
            if (var13 >= 0 && var13 < this.field4503) {
                for (int var14 = var9; var14 < (var9 + arg4); var14++) {
                    if (var14 >= 0 && var14 < this.field4485) {
                        this.method1877(var13, -27388, var12, var14);
                    }
                }
            }
            var13++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
    public final void method1882(int arg0, byte arg1, int arg2) {
        field4481++;
        if (arg1 != 124) {
            this.field4503 = -50;
        }
        int var4 = arg2 - this.field4482;
        int var5 = arg0 - this.field4488;
        this.field4497[var5][var4] = class204.method1369(this.field4497[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        field4484++;
        int var10 = arg5 - arg2;
        int var11 = arg7 - arg3;
        int var12 = (arg6 - arg4 << 16) / var10;
        int var13 = (arg8 - arg0 << 16) / var11;
        class225.method1487(arg7, var13, arg3, 124, arg4, 0, arg9, var12, arg2, arg5, arg1, arg0);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZZIZZILsf;)Ljg;")
    public static final class271 method1884(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, boolean arg5, boolean arg6, int arg7, class95 arg8) {
        field4504++;
        class208 var9 = class64.method514(arg7, 0);
        if (arg1 > 1 && var9.field3361 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3425[var11] && var9.field3425[var11] != 0) {
                    var10 = var9.field3361[var11];
                }
            }
            if (var10 != -1) {
                var9 = class64.method514(var10, 0);
            }
        }
        class90 var12 = var9.method1418(768, arg8);
        if (var12 == null) {
            return null;
        }
        class43 var13 = null;
        if (var9.field3370 != -1) {
            var13 = (class43) method1884(0, 10, true, true, 1, false, false, var9.field3367, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3399 != -1) {
            var13 = (class43) method1884(arg0, arg1, false, true, arg4, false, false, var9.field3392, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class63.field894;
        int var15 = class63.field897;
        int var16 = class63.field895;
        int[] var17 = new int[4];
        class63.method497(var17);
        class43 var18 = new class43(36, 32);
        class63.method508(var18.field510, 36, 32);
        class145.method997();
        class145.method991(16, 16);
        int var19 = var9.field3397;
        class145.field2351 = arg5;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg4 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class145.field2348[var9.field3389] * var19 >> 16;
        int var21 = class145.field2338[var9.field3389] * var19 >> 16;
        var12.method84(0, var9.field3380, var9.field3429, var9.field3389, var9.field3403, var21 + var9.field3408 - (var12.method88() / 2), var20 - -var9.field3408, -1L);
        if (arg4 >= 1) {
            var18.method328(1);
            if (arg4 >= 2) {
                var18.method328(16777215);
            }
            class63.method508(var18.field510, 36, 32);
        }
        if (arg0 != 0) {
            var18.method327(arg0);
        }
        if (var9.field3370 != -1) {
            var13.method174(0, 0);
        } else if (var9.field3399 != -1) {
            class63.method508(var13.field510, 36, 32);
            var18.method174(0, 0);
            var18 = var13;
        }
        if (arg6 && (var9.field3360 == 1 || arg1 != 1) && arg1 != -1) {
            class295.field4667.method1121(class148.method1010(-28720, arg1), 0, 9, 16776960, 1);
        }
        class63.method508(var14, var15, var16);
        class63.method502(var17);
        class145.method997();
        class145.field2351 = true;
        return var18;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4502 = null;
        field4492 = null;
        if (arg0 != -1) {
            field4502 = null;
        }
        field4501 = null;
        field4489 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)V")
    public final void method1886(int arg0, int arg1, byte arg2) {
        field4487++;
        if (arg2 >= -36) {
            this.method1875(85, true, true, -56, (byte) -101, 84, -70);
        }
        int var4 = arg1 - this.field4488;
        int var5 = arg0 - this.field4482;
        this.field4497[var4][var5] = class45.method348(this.field4497[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIIZI)V")
    public final void method1887(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var8 = arg4 - this.field4482;
        int var9 = arg6 - this.field4488;
        field4480++;
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1877(var9, -27388, 128, var8);
                this.method1877(var9 - 1, -27388, 8, var8);
            }
            if (arg0 == 1) {
                this.method1877(var9, -27388, 2, var8);
                this.method1877(var9, -27388, 32, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1877(var9, -27388, 8, var8);
                this.method1877(var9 + 1, -27388, 128, var8);
            }
            if (arg0 == 3) {
                this.method1877(var9, -27388, 32, var8);
                this.method1877(var9, -27388, 2, var8 - 1);
            }
        }
        if (arg3 >= -117) {
            this.field4488 = -100;
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1877(var9, -27388, 1, var8);
                this.method1877(var9 - 1, -27388, 16, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1877(var9, -27388, 4, var8);
                this.method1877(var9 + 1, -27388, 64, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1877(var9, -27388, 16, var8);
                this.method1877(var9 + 1, -27388, 1, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1877(var9, -27388, 64, var8);
                this.method1877(var9 - 1, -27388, 4, var8 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                this.method1877(var9, -27388, 130, var8);
                this.method1877(var9 - 1, -27388, 8, var8);
                this.method1877(var9, -27388, 32, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1877(var9, -27388, 10, var8);
                this.method1877(var9, -27388, 32, var8 + 1);
                this.method1877(var9 + 1, -27388, 128, var8);
            }
            if (arg0 == 2) {
                this.method1877(var9, -27388, 40, var8);
                this.method1877(var9 + 1, -27388, 128, var8);
                this.method1877(var9, -27388, 2, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1877(var9, -27388, 160, var8);
                this.method1877(var9, -27388, 2, var8 - 1);
                this.method1877(var9 - 1, -27388, 8, var8);
            }
        }
        if (arg5) {
            if (arg2 == 0) {
                if (arg0 == 0) {
                    this.method1877(var9, -27388, 65536, var8);
                    this.method1877(var9 - 1, -27388, 4096, var8);
                }
                if (arg0 == 1) {
                    this.method1877(var9, -27388, 1024, var8);
                    this.method1877(var9, -27388, 16384, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1877(var9, -27388, 4096, var8);
                    this.method1877(var9 + 1, -27388, 65536, var8);
                }
                if (arg0 == 3) {
                    this.method1877(var9, -27388, 16384, var8);
                    this.method1877(var9, -27388, 1024, var8 - 1);
                }
            }
            if (arg2 == 1 || arg2 == 3) {
                if (arg0 == 0) {
                    this.method1877(var9, -27388, 512, var8);
                    this.method1877(var9 - 1, -27388, 8192, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1877(var9, -27388, 2048, var8);
                    this.method1877(var9 + 1, -27388, 32768, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method1877(var9, -27388, 8192, var8);
                    this.method1877(var9 + 1, -27388, 512, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1877(var9, -27388, 32768, var8);
                    this.method1877(var9 - 1, -27388, 2048, var8 - 1);
                }
            }
            if (arg2 == 2) {
                if (arg0 == 0) {
                    this.method1877(var9, -27388, 66560, var8);
                    this.method1877(var9 - 1, -27388, 4096, var8);
                    this.method1877(var9, -27388, 16384, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method1877(var9, -27388, 5120, var8);
                    this.method1877(var9, -27388, 16384, var8 + 1);
                    this.method1877(var9 + 1, -27388, 65536, var8);
                }
                if (arg0 == 2) {
                    this.method1877(var9, -27388, 20480, var8);
                    this.method1877(var9 + 1, -27388, 65536, var8);
                    this.method1877(var9, -27388, 1024, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method1877(var9, -27388, 81920, var8);
                    this.method1877(var9, -27388, 1024, var8 - 1);
                    this.method1877(var9 - 1, -27388, 4096, var8);
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (arg2 == 0) {
            if (arg0 == 0) {
                this.method1877(var9, -27388, 536870912, var8);
                this.method1877(var9 - 1, -27388, 33554432, var8);
            }
            if (arg0 == 1) {
                this.method1877(var9, -27388, 8388608, var8);
                this.method1877(var9, -27388, 134217728, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1877(var9, -27388, 33554432, var8);
                this.method1877(var9 + 1, -27388, 536870912, var8);
            }
            if (arg0 == 3) {
                this.method1877(var9, -27388, 134217728, var8);
                this.method1877(var9, -27388, 8388608, var8 - 1);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg0 == 0) {
                this.method1877(var9, -27388, 4194304, var8);
                this.method1877(var9 - 1, -27388, 67108864, var8 + 1);
            }
            if (arg0 == 1) {
                this.method1877(var9, -27388, 16777216, var8);
                this.method1877(var9 + 1, -27388, 268435456, var8 + 1);
            }
            if (arg0 == 2) {
                this.method1877(var9, -27388, 67108864, var8);
                this.method1877(var9 + 1, -27388, 4194304, var8 - 1);
            }
            if (arg0 == 3) {
                this.method1877(var9, -27388, 268435456, var8);
                this.method1877(var9 - 1, -27388, 16777216, var8 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg0 == 0) {
            this.method1877(var9, -27388, 545259520, var8);
            this.method1877(var9 - 1, -27388, 33554432, var8);
            this.method1877(var9, -27388, 134217728, var8 + 1);
        }
        if (arg0 == 1) {
            this.method1877(var9, -27388, 41943040, var8);
            this.method1877(var9, -27388, 134217728, var8 + 1);
            this.method1877(var9 + 1, -27388, 536870912, var8);
        }
        if (arg0 == 2) {
            this.method1877(var9, -27388, 167772160, var8);
            this.method1877(var9 + 1, -27388, 536870912, var8);
            this.method1877(var9, -27388, 8388608, var8 - 1);
        }
        if (arg0 == 3) {
            this.method1877(var9, -27388, 671088640, var8);
            this.method1877(var9, -27388, 8388608, var8 - 1);
            this.method1877(var9 - 1, -27388, 33554432, var8);
            return;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
    public final void method1888(int arg0, int arg1, int arg2) {
        field4486++;
        int var4 = arg0 - this.field4482;
        if (arg1 > -34) {
            field4492 = null;
        }
        int var5 = arg2 - this.field4488;
        this.field4497[var5][var4] = class45.method348(this.field4497[var5][var4], 262144);
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V")
    public class281(int arg0, int arg1) {
        this.field4485 = arg1;
        this.field4503 = arg0;
        this.field4482 = 0;
        this.field4497 = new int[this.field4503][this.field4485];
        this.field4488 = 0;
        this.method1876(false);
    }
}
