import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class224 {

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    private int field261 = 5;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "[B")
    private byte[] field267 = new byte[512];

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    private int field268 = 5;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "[S")
    private short[] field271 = new short[512];

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field274 = 0;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    private int field272 = 2;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    private int field265 = 1;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    private int field273 = 2048;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field263 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
    public static int[] field266 = new int[100];

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Z")
    public static boolean field270 = false;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "Lfg;")
    public static class12 field264;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZIZ)V")
    public static final void method152(int arg0, boolean arg1, int arg2, boolean arg3) {
        if (arg2 >= 91) {
            ++field262;
            int var10002;
            for (int var4 = 0; ~var4 > ~class236.field3774; ++var4) {
                class56 var21 = class100.field1566[class248.field3967[var4]];
                if (var21 != null && var21.method409(0) && var21.field793.method929(false)) {
                    int var22 = var21.method565((byte) 0);
                    if (arg1) {
                        if (!var21.field793.field2002) {
                            continue;
                        }
                    } else if (!var21.field793.field2007 != !arg3 || ~arg0 != -1 && arg0 != var22) {
                        continue;
                    }
                    if (~var22 == -2) {
                        if (~(var21.field1226 & 127) == -65 && ~(127 & var21.field1273) == -65) {
                            int var29 = var21.field1226 >> 7;
                            int var30 = var21.field1273 >> 7;
                            if (~var29 <= -1 && ~var29 > -105 && var30 >= 0 && var30 < 104) {
                                var10002 = class262.field4232[var29][var30]++;
                            }
                        }
                    } else if (((1 & var22) != 0 || ~(127 & var21.field1226) == -1 && (127 & var21.field1273) == 0) && ((1 & var22) != 1 || ~(127 & var21.field1226) == -65 && (127 & var21.field1273) == 64)) {
                        int var23 = -(var22 * 64) + var21.field1226 >> 7;
                        int var24 = -(var22 * 64) + var21.field1273 >> 7;
                        int var25 = var23 - -var21.method565((byte) 0);
                        int var26 = var24 + var21.method565((byte) 0);
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (~var23 > -1) {
                            var23 = 0;
                        }
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (~var24 > -1) {
                            var24 = 0;
                        }
                        for (int var27 = var23; var25 > var27; ++var27) {
                            for (int var28 = var24; ~var26 < ~var28; ++var28) {
                                var10002 = class262.field4232[var27][var28]++;
                            }
                        }
                    }
                }
            }
            label215: for (int var5 = 0; ~class236.field3774 < ~var5; ++var5) {
                class56 var6 = class100.field1566[class248.field3967[var5]];
                long var7 = 536870912L | (long) class248.field3967[var5] << 32;
                if (var6 != null && var6.method409(0) && var6.field793.method929(false)) {
                    int var9 = var6.method565((byte) 0);
                    if (arg1) {
                        if (!var6.field793.field2002) {
                            continue;
                        }
                    } else if (!var6.field793.field2007 == arg3 || ~arg0 != -1 && ~arg0 != ~var9) {
                        continue;
                    }
                    var6.field1248 = true;
                    if (~var9 == -2) {
                        if (~(127 & var6.field1226) == -65 && (127 & var6.field1273) == 64) {
                            int var10 = var6.field1226 >> 7;
                            int var11 = var6.field1273 >> 7;
                            if (~var10 > -1 || ~var10 <= -105 || var11 < 0 || var11 >= 104) {
                                continue;
                            }
                            if (~class262.field4232[var10][var11] < -2) {
                                var10002 = class262.field4232[var10][var11]--;
                                continue;
                            }
                        }
                    } else if (~(var9 & 1) == -1 && ~(127 & var6.field1226) == -1 && (var6.field1273 & 127) == 0 || (1 & var9) == 1 && ~(var6.field1226 & 127) == -65 && ~(127 & var6.field1273) == -65) {
                        int var12 = -(var9 * 64) + var6.field1273 >> 7;
                        int var13 = -(var9 * 64) + var6.field1226 >> 7;
                        int var14 = var9 + var12;
                        if (~var14 < -105) {
                            var14 = 104;
                        }
                        boolean var15 = true;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        int var16 = var9 + var13;
                        if (var16 > 104) {
                            var16 = 104;
                        }
                        if (var13 < 0) {
                            var13 = 0;
                        }
                        for (int var17 = var13; var16 > var17; ++var17) {
                            for (int var20 = var12; var14 > var20; ++var20) {
                                if (class262.field4232[var17][var20] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var18 = var13;
                            while (true) {
                                if (~var18 <= ~var16) {
                                    continue label215;
                                }
                                for (int var19 = var12; ~var19 > ~var14; ++var19) {
                                    var10002 = class262.field4232[var18][var19]--;
                                }
                                ++var18;
                            }
                        }
                    }
                    if (!var6.field793.field2010) {
                        var7 |= Long.MIN_VALUE;
                    }
                    var6.field1248 = false;
                    var6.field1198 = class99.method658(var6.field1273, class276.field4398, var6.field1226, -7185);
                    class143.method952(class276.field4398, var6.field1226, var6.field1273, var6.field1198, var9 * 64 + -64 + 60, var6, var6.field1222, var7, var6.field1207);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method153(byte arg0) {
        int var1 = -85 / ((arg0 - -70) / 49);
        field263 = null;
        field266 = null;
        field264 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class22() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        ++field276;
        this.field267 = class74.method502(this.field274, -15);
        this.method155(512);
        if (arg0 > -4) {
            method154(-102, -51, -33, 41, false, false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZZ)Lhc;")
    public static final class229 method154(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        ++field260;
        int var7 = (arg3 << 19) + (arg0 << 17) + (arg5 ? 65536 : 0) + arg1;
        long var8 = (long) arg2 * 3147483667L - -((long) var7 * 3849834839L);
        class229 var10 = (class229) class209.field3255.method1428(var8, (byte) -99);
        if (var10 != null) {
            return var10;
        } else {
            class171.field2690 = false;
            class229 var11 = class85.method587(arg3, arg1, arg2, false, false, arg0, arg5, arg4);
            if (var11 != null && !class171.field2690) {
                class209.field3255.method1424(var8, var11, -2003648287);
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 < -46) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 == -7) {
                                        this.field261 = arg0.method201(255);
                                    }
                                } else {
                                    this.field268 = arg0.method201(255);
                                }
                            } else {
                                this.field265 = arg0.method201(255);
                            }
                        } else {
                            this.field272 = arg0.method201(255);
                        }
                    } else {
                        this.field273 = arg0.method190(-3);
                    }
                } else {
                    this.field274 = arg0.method201(255);
                }
            } else {
                this.field268 = this.field261 = arg0.method201(255);
            }
            ++field275;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field269;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (!arg1) {
            method154(-93, -7, -118, 92, true, true);
        }
        if (super.field3625.field4425) {
            int var4 = 2048 - -(class251.field4018[arg0] * this.field261);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class78.field1108; ++var7) {
                class170.field2665 = Integer.MAX_VALUE;
                class212.field3322 = Integer.MAX_VALUE;
                class226.field3650 = Integer.MAX_VALUE;
                class141.field2071 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class243.field3893[var7] * this.field268);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var11 >= ~var6; ++var11) {
                    int var13 = 255 & this.field267[255 & (~var11 <= ~this.field261 ? -this.field261 + var11 : var11)];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field267[var13 - -(var14 >= this.field268 ? -this.field268 + var14 : var14) & 255] & 255);
                        int var27 = var15 + 1;
                        int var16 = var8 - (this.field271[var15] + (var14 << 12));
                        int var17 = -this.field271[var27] - (var11 << 12) + var4;
                        int var18 = this.field265;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (~var18 != -5) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (var16 < 0 ? -var16 : var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var16 < 0 ? -var16 : var16;
                                int var26 = var17 >= 0 ? var17 : -var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class141.field2071) {
                            if (~var19 > ~class226.field3650) {
                                class170.field2665 = class212.field3322;
                                class212.field3322 = class226.field3650;
                                class226.field3650 = var19;
                            } else if (~class212.field3322 < ~var19) {
                                class170.field2665 = class212.field3322;
                                class212.field3322 = var19;
                            } else if (class170.field2665 > var19) {
                                class170.field2665 = var19;
                            }
                        } else {
                            class170.field2665 = class212.field3322;
                            class212.field3322 = class226.field3650;
                            class226.field3650 = class141.field2071;
                            class141.field2071 = var19;
                        }
                    }
                }
                int var12 = this.field272;
                if (var12 != 0) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (~var12 != -5) {
                                if (~var12 == -3) {
                                    var3[var7] = -class141.field2071 + class226.field3650;
                                }
                            } else {
                                var3[var7] = class170.field2665;
                            }
                        } else {
                            var3[var7] = class212.field3322;
                        }
                    } else {
                        var3[var7] = class226.field3650;
                    }
                } else {
                    var3[var7] = class141.field2071;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
    private final void method155(int arg0) {
        Random var2 = new Random((long) this.field274);
        this.field271 = new short[arg0];
        if (~this.field273 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field271[var3] = (short) class80.method557(this.field273, var2, true);
            }
        }
        ++field277;
    }
}
