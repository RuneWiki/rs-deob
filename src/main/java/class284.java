import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class284 extends class185 {

    @OriginalMember(owner = "client!g", name = "M", descriptor = "[B")
    private byte[] field4247 = new byte[512];

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "[S")
    private short[] field4251 = new short[512];

    @OriginalMember(owner = "client!g", name = "K", descriptor = "I")
    private int field4245 = 2;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    private int field4255 = 1;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    private int field4256 = 2048;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    private int field4253 = 5;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    private int field4252 = 5;

    @OriginalMember(owner = "client!g", name = "T", descriptor = "I")
    private int field4254 = 0;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field4248 = 255;

    @OriginalMember(owner = "client!g", name = "J", descriptor = "Lij;")
    public static class200 field4244 = new class200();

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
    public class284() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "i", descriptor = "(I)V")
    public static void method1867(int arg0) {
        if (arg0 == 2) {
            field4244 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIILsk;IJIIII)Z")
    public static final boolean method1868(int arg0, int arg1, int arg2, int arg3, class114 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : method1869(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIILsk;IZJ)Z")
    public static final boolean method1869(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class114 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class67.field1072 == class246.field3685;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class197.field2997 || var24 >= class92.field1448) {
                    return false;
                }
                class270 var25 = class33.field487[arg0][var15][var24];
                if (var25 != null && var25.field4071 >= 5) {
                    return false;
                }
            }
        }
        class2 var16 = new class2();
        var16.field28 = arg11;
        var16.field35 = arg0;
        var16.field27 = arg5;
        var16.field17 = arg6;
        var16.field36 = arg7;
        var16.field31 = arg8;
        var16.field21 = arg9;
        var16.field26 = arg1;
        var16.field23 = arg2;
        var16.field25 = arg1 + arg3 - 1;
        var16.field34 = arg2 + arg4 - 1;
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
                    if (class33.field487[var22][var17][var20] == null) {
                        class33.field487[var22][var17][var20] = new class270(var22, var17, var20);
                    }
                }
                class270 var23 = class33.field487[arg0][var17][var20];
                var23.field4069[var23.field4071] = var16;
                var23.field4076[var23.field4071] = var21;
                var23.field4065 |= var21;
                ++var23.field4071;
                if (var13 && class76.field1222[var17][var20] != 0) {
                    var14 = class76.field1222[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class76.field1222[var18][var19] == 0) {
                        class76.field1222[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class173.field2627[class97.field1525++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V")
    public final void method30(int arg0) {
        if (arg0 != -9) {
            this.method1870(106);
        }
        this.field4247 = class129.method807(0, this.field4254);
        ++field4249;
        this.method1870(arg0 + -504);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field4250;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (arg1 < 70) {
            return null;
        } else {
            if (super.field2804.field1384) {
                int var4 = class85.field1356[arg0] * this.field4252 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 - -1;
                for (int var7 = 0; var7 < class174.field2648; ++var7) {
                    class282.field4215 = Integer.MAX_VALUE;
                    class223.field3341 = Integer.MAX_VALUE;
                    class22.field260 = Integer.MAX_VALUE;
                    class244.field3655 = Integer.MAX_VALUE;
                    int var8 = class153.field2304[var7] * this.field4253 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                        int var13 = 255 & this.field4247[255 & (var11 >= this.field4252 ? -this.field4252 + var11 : var11)];
                        for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                            int var15 = 2 * (this.field4247[255 & var13 + (this.field4253 <= var14 ? -this.field4253 + var14 : var14)] & 255);
                            int var10000 = -(var14 << 12);
                            int var27 = var15 + 1;
                            int var16 = var10000 + -this.field4251[var15] + var8;
                            int var17 = -(var11 << 12) + var4 + -this.field4251[var27];
                            int var18 = this.field4255;
                            int var19;
                            if (var18 != 1) {
                                if (var18 != 3) {
                                    if (var18 != 4) {
                                        if (~var18 != -6) {
                                            if (~var18 == -3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                            } else {
                                                var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                            }
                                        } else {
                                            int var20 = var17 * var17;
                                            int var21 = var16 * var16;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = ~var16 <= -1 ? var16 : -var16;
                                    int var26 = var17 >= 0 ? var17 : -var17;
                                    var19 = var26 < var25 ? var25 : var26;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (class244.field3655 > var19) {
                                class282.field4215 = class223.field3341;
                                class223.field3341 = class22.field260;
                                class22.field260 = class244.field3655;
                                class244.field3655 = var19;
                            } else if (~class22.field260 >= ~var19) {
                                if (var19 >= class223.field3341) {
                                    if (~var19 > ~class282.field4215) {
                                        class282.field4215 = var19;
                                    }
                                } else {
                                    class282.field4215 = class223.field3341;
                                    class223.field3341 = var19;
                                }
                            } else {
                                class282.field4215 = class223.field3341;
                                class223.field3341 = class22.field260;
                                class22.field260 = var19;
                            }
                        }
                    }
                    int var12 = this.field4245;
                    if (~var12 != -1) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (~var12 == -3) {
                                        var3[var7] = -class244.field3655 + class22.field260;
                                    }
                                } else {
                                    var3[var7] = class282.field4215;
                                }
                            } else {
                                var3[var7] = class223.field3341;
                            }
                        } else {
                            var3[var7] = class22.field260;
                        }
                    } else {
                        var3[var7] = class244.field3655;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!g", name = "j", descriptor = "(I)V")
    private final void method1870(int arg0) {
        ++field4258;
        Random var2 = new Random((long) this.field4254);
        this.field4251 = new short[512];
        if (~this.field4256 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field4251[var3] = (short) class112.method726(this.field4256, (byte) 98, var2);
            }
        }
        if (arg0 != -513) {
            this.field4254 = -35;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILfl;I)V")
    public final void method27(int arg0, class248 arg1, int arg2) {
        if (arg2 != -6357) {
            field4244 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field4252 = arg1.method1593((byte) 27);
                                }
                            } else {
                                this.field4253 = arg1.method1593((byte) 27);
                            }
                        } else {
                            this.field4255 = arg1.method1593((byte) 27);
                        }
                    } else {
                        this.field4245 = arg1.method1593((byte) 27);
                    }
                } else {
                    this.field4256 = arg1.method1575(false);
                }
            } else {
                this.field4254 = arg1.method1593((byte) 27);
            }
        } else {
            this.field4253 = this.field4252 = arg1.method1593((byte) 27);
        }
        ++field4246;
    }
}
