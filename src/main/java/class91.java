import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class91 extends class253 {

    @OriginalMember(owner = "client!li", name = "u", descriptor = "I")
    private int field1457 = -32768;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Ljava/lang/String;")
    public static String field1452 = "Loaded world list data";

    @OriginalMember(owner = "client!li", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1453 = "Walk here";

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public int field1456;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Ll;")
    public static class133 field1446;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lrl;")
    public static class309 field1459;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V", line = 4)
    public static void method652(boolean arg0) {
        field1452 = null;
        field1446 = null;
        field1453 = null;
        field1459 = null;
        if (!arg0) {
            field1453 = (String) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IJ)V", line = 17)
    public static final void method653(int arg0, long arg1) {
        field1458++;
        if (class178.field2692 == 1 || class178.field2692 == 5) {
            class19.method146(arg1, false);
        } else if (class178.field2692 == 2) {
            class290.method1988(107);
        } else {
            class116.method857(-88);
        }
        if (!class339.field5305) {
            class137.field2167[0] = class207.field3175;
            class233.field3689[0] = 1004;
            if (class84.field1305 != 0) {
                class22.field348 = class52.field870;
                class227.field3616 = class90.field1434;
            } else if (class171.field2604 == 0) {
                class22.field348 = class253.field3984;
                class227.field3616 = class119.field1815;
            } else {
                class227.field3616 = class205.field3084;
                class22.field348 = class47.field776;
            }
            class32.field468[0] = class332.field5163;
            class301.field4706 = 1;
            class275.field4252[0] = "";
        }
        if (class331.field5160 != -1) {
            class12.method93(class331.field5160, true);
        }
        for (int var3 = 0; var3 < class169.field2560; var3++) {
            if (class34.field510[var3]) {
                class240.field3831[var3] = true;
            }
            class345.field5352[var3] = class34.field510[var3];
            class34.field510[var3] = false;
        }
        class202.field3037 = null;
        if (class94.field1516) {
            class230.field3650 = true;
        }
        class276.field4263 = -1;
        class282.field4348 = class227.field3618;
        class141.field2182 = -1;
        class235.field3760 = null;
        if (class331.field5160 != -1) {
            class169.field2560 = 0;
            class258.method1771(20371);
        }
        if (class94.field1516) {
            class167.method1191();
        } else {
            class109.method804();
        }
        class308.method2106(104);
        if (class339.field5305) {
            if (class238.field3786) {
                class242.method1676(126);
            } else {
                class218.method1538(42);
            }
        } else if (class235.field3760 != null) {
            class273.method1879(class87.field1414, class235.field3760, class71.field1170, (byte) 50);
        } else if (class141.field2182 != -1) {
            class273.method1879(class276.field4263, (class220) null, class141.field2182, (byte) 50);
        }
        int var4 = class339.field5305 ? -1 : class53.method441((byte) 96);
        if (var4 == -1) {
            var4 = class270.field4194;
        }
        class5.method36(false, var4);
        if (~class251.field3964 == arg0) {
            class251.field3964 = 2;
        }
        if (class81.field1274 == 1) {
            class81.field1274 = 2;
        }
        if (class190.field2854 == 3) {
            for (int var5 = 0; var5 < class169.field2560; var5++) {
                if (class345.field5352[var5]) {
                    if (class94.field1516) {
                        class167.method1193(class342.field5326[var5], class43.field693[var5], class80.field1270[var5], class116.field1780[var5], 16711935, 128);
                    } else {
                        class109.method799(class342.field5326[var5], class43.field693[var5], class80.field1270[var5], class116.field1780[var5], 16711935, 128);
                    }
                } else if (class240.field3831[var5]) {
                    if (class94.field1516) {
                        class167.method1193(class342.field5326[var5], class43.field693[var5], class80.field1270[var5], class116.field1780[var5], 16711680, 128);
                    } else {
                        class109.method799(class342.field5326[var5], class43.field693[var5], class80.field1270[var5], class116.field1780[var5], 16711680, 128);
                    }
                }
            }
        }
        class84.method594(class34.field518, class205.field3101, class98.field1566.field1905, arg0 ^ 0xFFFFFF85, class98.field1566.field1868);
        class34.field518 = 0;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIBIIII)Z", line = 173)
    public static final boolean method654(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 <= 57) {
            method653(-32, 74L);
        }
        field1451++;
        long var8 = class10.method78(arg5, arg1 + arg7, arg0 + arg4);
        if (var8 != 0L) {
            int var10 = (int) var8 >> 14 & 0x1F;
            int var11 = Integer.MAX_VALUE & (int) (var8 >>> 32);
            class85 var12 = class201.method1431(-121, var11);
            int var13 = (int) var8 >> 20 & 0x3;
            if (var12.field1365 == -1) {
                int var14 = arg6;
                int[] var15 = class109.field1704;
                if (var8 > 0L) {
                    var14 = arg2;
                }
                int var16 = 24624 - (-(arg1 * 4) - (52736 - (arg0 * 512)) * 4);
                if (var10 == 0 || var10 == 2) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 1) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 515] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 2 + 1536] = var14;
                        var15[var16 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var13 == 0) {
                        var15[var16] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 3 + 1536] = var14;
                    } else if (var13 == 3) {
                        var15[var16 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var13 == 3) {
                        var15[var16] = var14;
                        var15[var16 + 512] = var14;
                        var15[var16 + 1024] = var14;
                        var15[var16 + 1536] = var14;
                    } else if (var13 == 0) {
                        var15[var16] = var14;
                        var15[var16 + 1] = var14;
                        var15[var16 + 2] = var14;
                        var15[var16 + 3] = var14;
                    } else if (var13 == 1) {
                        var15[var16 + 3] = var14;
                        var15[var16 + 512 + 3] = var14;
                        var15[var16 + 1027] = var14;
                        var15[var16 + 1539] = var14;
                    } else if (var13 == 2) {
                        var15[var16 + 1536] = var14;
                        var15[var16 + 1 + 1536] = var14;
                        var15[var16 + 1538] = var14;
                        var15[var16 + 3 + 1536] = var14;
                    }
                }
            } else if (!class188.method1344(arg4, var13, arg0, arg1, var12, false, arg7)) {
                return false;
            }
        }
        long var17 = class176.method1259(arg5, arg1 + arg7, arg0 + arg4);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x3AB2D3) >> 20;
            int var20 = ((int) var17 & 0x7FBD4) >> 14;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            class85 var22 = class201.method1431(-94, var21);
            if (var22.field1365 == -1) {
                if (var20 == 9) {
                    int var23 = 15658734;
                    if (var17 > 0L) {
                        var23 = 15597568;
                    }
                    int[] var24 = class109.field1704;
                    int var25 = (52736 - (arg0 * 512)) * 4 + ((arg1 * 4) + 24624);
                    if (var19 == 0 || var19 == 2) {
                        var24[var25 + 1536] = var23;
                        var24[var25 + 1025] = var23;
                        var24[var25 + 512 + 2] = var23;
                        var24[var25 + 3] = var23;
                    } else {
                        var24[var25] = var23;
                        var24[var25 + 513] = var23;
                        var24[var25 + 1024 + 2] = var23;
                        var24[var25 + 3 + 1536] = var23;
                    }
                }
            } else if (!class188.method1344(arg4, var19, arg0, arg1, var22, false, arg7)) {
                return false;
            }
        }
        long var26 = class263.method1796(arg5, arg1 + arg7, arg0 + arg4);
        if (var26 != 0L) {
            int var28 = Integer.MAX_VALUE & (int) (var26 >>> 32);
            class85 var29 = class201.method1431(-85, var28);
            int var30 = ((int) var26 & 0x38B151) >> 20;
            if (var29.field1365 != -1 && !class188.method1344(arg4, var30, arg0, arg1, var29, false, arg7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()I", line = 384)
    public final int method76() {
        field1448++;
        return this.field1457;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lkh;I)V", line = 393)
    public static final void method655(class166 arg0, int arg1) {
        field1449++;
        byte[] var2 = new byte[24];
        if (class78.field1253 != null) {
            try {
                int var3 = 0;
                class78.field1253.method2212((byte) -58, 0L);
                class78.field1253.method2207((byte) 54, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var7) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1170(false, 24, 0, var2);
        int var6 = 63 / ((-arg1 - 54) / 57);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIII)V", line = 444)
    public final void method71(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1455++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIIIIJILvh;)V", line = 456)
    public final void method75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class64 arg10) {
        class221 var13 = class237.method1657(2, this.field1456).method2032(true, (class281) null, 0, 0, (class189) null, this.field1454, -1);
        field1447++;
        if (var13 != null) {
            var13.method75(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1457 = var13.method76();
        }
    }
}
