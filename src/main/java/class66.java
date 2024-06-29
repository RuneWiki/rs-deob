import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class74 {

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[B")
    private byte[] field1051 = new byte[512];

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    private int field1052 = 2048;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "I")
    private int field1058 = 5;

    @OriginalMember(owner = "client!ri", name = "eb", descriptor = "I")
    private int field1062 = 5;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "[S")
    private short[] field1056 = new short[512];

    @OriginalMember(owner = "client!ri", name = "fb", descriptor = "I")
    private int field1063 = 2;

    @OriginalMember(owner = "client!ri", name = "gb", descriptor = "I")
    private int field1064 = 0;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    private int field1054 = 1;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "Z")
    public static boolean field1048 = false;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Z")
    public static boolean field1047 = false;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ri", name = "ib", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ri", name = "hb", descriptor = "Luf;")
    public static class176 field1065;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[Lra;")
    public static class238[] field1044;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1058 = arg1.method333((byte) -59);
                                }
                            } else {
                                this.field1062 = arg1.method333((byte) -59);
                            }
                        } else {
                            this.field1054 = arg1.method333((byte) -59);
                        }
                    } else {
                        this.field1063 = arg1.method333((byte) -59);
                    }
                } else {
                    this.field1052 = arg1.method293(arg0 + 14);
                }
            } else {
                this.field1064 = arg1.method333((byte) -59);
            }
        } else {
            this.field1062 = this.field1058 = arg1.method333((byte) -59);
        }
        ++field1050;
        if (arg0 != -79) {
            field1044 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V")
    public final void method493(boolean arg0) {
        this.field1051 = class10.method114((byte) -64, this.field1064);
        ++field1046;
        this.method523(0);
        if (arg0) {
            method521(10, 39, -45, -21, 56, 72, -100, -47, (class205) null, 99, false, 86L);
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static final void method518(int arg0) {
        if (arg0 != 0) {
            method518(-66);
        }
        ++field1061;
        for (class46 var1 = (class46) class208.field3232.method1010(118); var1 != null; var1 = (class46) class208.field3232.method1008((byte) 88)) {
            if (~var1.field738 != 0) {
                var1.method693(73);
            } else {
                var1.field730 = 0;
                class156.method1050(-117, var1);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Luf;III)Lqd;")
    public static final class3 method519(class176 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 23) {
            return null;
        } else {
            ++field1053;
            return !class261.method1750(arg0, arg3, arg1, (byte) 60) ? null : class242.method1638(1104494287);
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)V")
    public static final void method520(int arg0) {
        if (arg0 >= -49) {
            field1048 = false;
        }
        ++field1059;
        if (class28.field438 == null) {
            if (class292.field4606 == null) {
                int var1 = class71.field1137;
                if (class64.field1025) {
                    if (var1 != 1) {
                        int var2 = class108.field1719;
                        int var3 = class188.field3012;
                        if (class139.field2139 + -10 > var3 || ~var3 < ~(class273.field4313 + class139.field2139 - -10) || ~var2 > ~(class154.field2353 + -10) || ~(class154.field2353 + 10 - -class92.field1478) > ~var2) {
                            class64.field1025 = false;
                            class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
                        }
                    }
                    if (var1 == 1) {
                        int var4 = class139.field2139;
                        int var5 = class154.field2353;
                        int var6 = class273.field4313;
                        int var7 = class78.field1317;
                        int var8 = class126.field1985;
                        int var9 = -1;
                        for (int var10 = 0; ~class220.field3450 < ~var10; ++var10) {
                            if (!class23.field336) {
                                int var11 = var5 + 31 - -((-var10 + class220.field3450 + -1) * 15);
                                if (var4 < var7 && var7 < var4 - -var6 && var8 > var11 + -13 && ~var8 > ~(var11 + 3)) {
                                    var9 = var10;
                                }
                            } else {
                                int var12 = (class220.field3450 + -1 + -var10) * 15 + var5 + 33;
                                if (~var4 > ~var7 && var7 < var4 + var6 && ~(var12 + -13) > ~var8 && ~var8 > ~(var12 - -3)) {
                                    var9 = var10;
                                }
                            }
                        }
                        if (var9 != -1) {
                            class188.method1269((byte) -78, var9);
                        }
                        class64.field1025 = false;
                        class178.method1187(0, class154.field2353, class139.field2139, class273.field4313, class92.field1478);
                        return;
                    }
                } else {
                    if (~var1 == -2 && class220.field3450 > 0) {
                        short var13 = class80.field1341[class220.field3450 - 1];
                        if (var13 == 32 || var13 == 50 || var13 == 11 || var13 == 45 || ~var13 == -39 || var13 == 34 || ~var13 == -58 || ~var13 == -30 || var13 == 1 || var13 == 8 || ~var13 == -13 || var13 == 1003) {
                            int var14 = class290.field4570[class220.field3450 - 1];
                            int var15 = class211.field3279[class220.field3450 + -1];
                            class188 var16 = class5.method57((byte) -118, var14);
                            class219 var17 = client.method1063(var16);
                            if (var17.method1469(true) || var17.method1463((byte) -17)) {
                                class68.field1087 = 0;
                                class28.field442 = false;
                                if (class28.field438 != null) {
                                    class246.method1663(255, class28.field438);
                                }
                                class28.field438 = class5.method57((byte) -127, var14);
                                class272.field4290 = var15;
                                class171.field2546 = class126.field1985;
                                class227.field3559 = class78.field1317;
                                class246.method1663(255, class28.field438);
                                return;
                            }
                        }
                    }
                    if (var1 == 1 && (~class189.field3020 == -2 && ~class220.field3450 < -3 || class34.method270(class220.field3450 + -1, (byte) 124))) {
                        var1 = 2;
                    }
                    if (var1 == 2 && ~class220.field3450 < -1 || class227.field3554 == 1) {
                        class88.method711(6588);
                    }
                    if ((var1 != 1 || class220.field3450 <= 0) && class227.field3554 != 2) {
                        return;
                    }
                    class100.method775(2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            return null;
        } else {
            ++field1049;
            int[] var3 = super.field1254.method1328((byte) -108, arg1);
            if (super.field1254.field3118) {
                int var4 = 2048 - -(class207.field3212[arg1] * this.field1058);
                int var5 = var4 >> 12;
                int var6 = var5 - -1;
                for (int var7 = 0; class178.field2662 > var7; ++var7) {
                    class223.field3510 = Integer.MAX_VALUE;
                    class289.field4553 = Integer.MAX_VALUE;
                    class231.field3599 = Integer.MAX_VALUE;
                    class263.field4120 = Integer.MAX_VALUE;
                    int var8 = class224.field3522[var7] * this.field1062 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; var6 >= var11; ++var11) {
                        int var13 = this.field1051[255 & (~var11 <= ~this.field1058 ? -this.field1058 + var11 : var11)] & 255;
                        for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                            int var15 = 2 * (255 & this.field1051[var13 + (var14 < this.field1062 ? var14 : var14 - this.field1062) & 255]);
                            int var10000 = -(var14 << 12) + var8;
                            int var27 = var15 + 1;
                            int var16 = var10000 + -this.field1056[var15];
                            int var17 = -(var11 << 12) + -this.field1056[var27] + var4;
                            int var18 = this.field1054;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (var18 != 5) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) + (~var17 > -1 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                        }
                                    } else {
                                        int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var17 <= -1 ? var17 : -var17;
                                    int var26 = var16 >= 0 ? var16 : -var16;
                                    var19 = ~var26 < ~var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (var19 >= class263.field4120) {
                                if (~class231.field3599 < ~var19) {
                                    class223.field3510 = class289.field4553;
                                    class289.field4553 = class231.field3599;
                                    class231.field3599 = var19;
                                } else if (~var19 <= ~class289.field4553) {
                                    if (var19 < class223.field3510) {
                                        class223.field3510 = var19;
                                    }
                                } else {
                                    class223.field3510 = class289.field4553;
                                    class289.field4553 = var19;
                                }
                            } else {
                                class223.field3510 = class289.field4553;
                                class289.field4553 = class231.field3599;
                                class231.field3599 = class263.field4120;
                                class263.field4120 = var19;
                            }
                        }
                    }
                    int var12 = this.field1063;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (~var12 != -5) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class263.field4120 + class231.field3599;
                                    }
                                } else {
                                    var3[var7] = class223.field3510;
                                }
                            } else {
                                var3[var7] = class289.field4553;
                            }
                        } else {
                            var3[var7] = class231.field3599;
                        }
                    } else {
                        var3[var7] = class263.field4120;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIILbf;IZJ)Z")
    public static final boolean method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class205 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class68.field1079 == class118.field1825;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class113.field1777 || var24 >= class191.field3032) {
                    return false;
                }
                class23 var25 = class255.field3907[arg0][var15][var24];
                if (var25 != null && var25.field360 >= 5) {
                    return false;
                }
            }
        }
        class172 var16 = new class172();
        var16.field2569 = arg11;
        var16.field2553 = arg0;
        var16.field2568 = arg5;
        var16.field2570 = arg6;
        var16.field2559 = arg7;
        var16.field2566 = arg8;
        var16.field2552 = arg9;
        var16.field2558 = arg1;
        var16.field2560 = arg2;
        var16.field2565 = arg1 + arg3 - 1;
        var16.field2563 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class255.field3907[var22][var17][var20] == null) {
                        class255.field3907[var22][var17][var20] = new class23(var22, var17, var20);
                    }
                }
                class23 var23 = class255.field3907[arg0][var17][var20];
                var23.field358[var23.field360] = var16;
                var23.field346[var23.field360] = var21;
                var23.field340 |= var21;
                ++var23.field360;
                if (var13 && class272.field4297[var17][var20] != 0) {
                    var14 = class272.field4297[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class272.field4297[var18][var19] == 0) {
                        class272.field4297[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class75.field1264[class273.field4306++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(Z)V")
    public static void method522(boolean arg0) {
        field1065 = null;
        if (!arg0) {
            method524(58);
        }
        field1044 = null;
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
    private final void method523(int arg0) {
        Random var2 = new Random((long) this.field1064);
        this.field1056 = new short[512];
        ++field1060;
        if (arg0 < this.field1052) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field1056[var3] = (short) class167.method1104(this.field1052, (byte) -116, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "(I)Ljava/lang/String;")
    public static final String method524(int arg0) {
        ++field1066;
        String var1;
        if (~class90.field1458 == -2 && ~class220.field3450 > -3) {
            var1 = class256.field3920 + class111.field1745 + class56.field870 + " ->";
        } else if (class179.field2678 && ~class220.field3450 > -3) {
            var1 = class78.field1316 + class111.field1745 + class126.field1982 + " ->";
        } else if (class181.field2697 && class145.field2256[81] && ~class220.field3450 < -3) {
            var1 = class57.method454(15827, class220.field3450 + -2);
        } else {
            var1 = class57.method454(15827, class220.field3450 + -1);
        }
        if (~class220.field3450 < arg0) {
            var1 = var1 + "<col=ffffff> / " + (class220.field3450 + -2) + class23.field348;
        }
        return var1;
    }
}
