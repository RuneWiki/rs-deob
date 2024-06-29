import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class264 extends class228 {

    @OriginalMember(owner = "client!nd", name = "Y", descriptor = "I")
    private int field4675 = 16;

    @OriginalMember(owner = "client!nd", name = "bb", descriptor = "I")
    private int field4678 = 2000;

    @OriginalMember(owner = "client!nd", name = "cb", descriptor = "I")
    private int field4679 = 0;

    @OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
    private int field4670 = 4096;

    @OriginalMember(owner = "client!nd", name = "db", descriptor = "I")
    private int field4680 = 0;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "I")
    public static int field4669 = 3;

    @OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
    public static int field4674 = (int) (33.0D * Math.random()) - 16;

    @OriginalMember(owner = "client!nd", name = "gb", descriptor = "Loa;")
    public static class99 field4683 = class221.method1463(2844, "headicons_prayer");

    @OriginalMember(owner = "client!nd", name = "U", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!nd", name = "V", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!nd", name = "fb", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!nd", name = "eb", descriptor = "Lcf;")
    public static class93 field4681;

    @OriginalMember(owner = "client!nd", name = "Z", descriptor = "[S")
    public static short[] field4676;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field4677;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int var4 = this.field4670 >> 1;
            int[][] var5 = super.field3952.method1261(-98);
            Random var6 = new Random((long) this.field4680);
            for (int var7 = 0; ~this.field4678 < ~var7; ++var7) {
                int var8 = ~this.field4670 < -1 ? this.field4679 - (var4 + -class88.method606(var6, this.field4670, false)) : this.field4679;
                int var9 = class88.method606(var6, class234.field4046, false);
                int var10 = var8 >> 4 & 255;
                int var11 = class88.method606(var6, class179.field3122, false);
                int var12 = var11 - -(class217.field3766[var10] * this.field4675 >> 12);
                int var13 = (class123.field2164[var10] * this.field4675 >> 12) + var9;
                int var14 = -var9 + var13;
                int var15 = -var11 + var12;
                if (var14 != 0 || ~var15 != -1) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 < ~var14;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var13;
                        var9 = var11;
                        var13 = var12;
                        var11 = var17;
                        var12 = var18;
                    }
                    if (~var13 > ~var9) {
                        int var19 = var9;
                        var9 = var13;
                        var13 = var19;
                        int var20 = var11;
                        var11 = var12;
                        var12 = var20;
                    }
                    int var21 = -var11 + var12;
                    int var22 = -var9 + var13;
                    if (var21 < 0) {
                        var21 = -var21;
                    }
                    int var23 = var11;
                    int var24 = 2048 / var22;
                    int var25 = -var22 / 2;
                    int var26 = 1024 + -(class88.method606(var6, 4096, false) >> 2);
                    int var27 = var11 < var12 ? 1 : -1;
                    for (int var28 = var9; var13 > var28; ++var28) {
                        var25 += var21;
                        int var29 = var26 + 1024 - -((-var9 + var28) * var24);
                        int var30 = class190.field3345 & var28;
                        int var31 = var23 & class250.field4309;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (~var25 < -1) {
                            var25 += -var22;
                            var23 += var27;
                        }
                    }
                }
            }
        }
        if (arg1 != -3) {
            this.method278(42);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            this.method18(-64, (class261) null, 104);
        }
        ++field4682;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field4670 = arg1.method1740((byte) 95);
                        }
                    } else {
                        this.field4679 = arg1.method1740((byte) 76);
                    }
                } else {
                    this.field4675 = arg1.method1693((byte) 119);
                }
            } else {
                this.field4678 = arg1.method1740((byte) 51);
            }
        } else {
            this.field4680 = arg1.method1693((byte) 46);
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field4673;
        if (arg0 != -8) {
            this.field4675 = 76;
        }
        class129.method854((byte) -99);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field4681 = null;
        field4676 = null;
        if (arg0 == -1) {
            field4683 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lpg;I)V")
    public static final void method1763(class75 arg0, int arg1) {
        ++field4671;
        if (~arg0.field1330 != -1) {
            if (arg0.field1265 != -1 && ~arg0.field1265 > -32769) {
                class156 var2 = class248.field4287[arg0.field1265];
                if (var2 != null) {
                    int var3 = -var2.field1325 + arg0.field1325;
                    int var4 = -var2.field1301 + arg0.field1301;
                    if (~var3 != -1 || ~var4 != -1) {
                        arg0.field1275 = 2047 & (int) (Math.atan2((double) var3, (double) var4) * 325.949D);
                    }
                }
            }
            if (~arg0.field1265 <= -32769) {
                int var5 = arg0.field1265 - 32768;
                if (~class167.field2980 == ~var5) {
                    var5 = 2047;
                }
                class183 var6 = class259.field4515[var5];
                if (var6 != null) {
                    int var7 = -var6.field1325 + arg0.field1325;
                    int var8 = -var6.field1301 + arg0.field1301;
                    if (~var7 != -1 || ~var8 != -1) {
                        arg0.field1275 = (int) (325.949D * Math.atan2((double) var7, (double) var8)) & 2047;
                    }
                }
            }
            if ((~arg0.field1306 != -1 || ~arg0.field1331 != -1) && (arg0.field1323 == 0 || arg0.field1311 > 0)) {
                int var9 = arg0.field1325 - 64 - (-(64 * arg0.method516((byte) -65)) - -((arg0.field1306 - class280.field4910 - class280.field4910) * 64));
                int var10 = arg0.field1301 - (-(64 * arg0.method516((byte) -65)) + 64) - (arg0.field1331 - (class215.field3731 - -class215.field3731)) * 64;
                if (~var9 != -1 || ~var10 != -1) {
                    arg0.field1275 = 2047 & (int) (Math.atan2((double) var9, (double) var10) * 325.949D);
                }
                arg0.field1306 = 0;
                arg0.field1331 = 0;
            }
            int var11 = -arg0.field1296 + arg0.field1275 & 2047;
            if (arg1 != 32768) {
                method1763((class75) null, 76);
            }
            if (var11 == 0) {
                arg0.field1278 = 0;
            } else {
                ++arg0.field1278;
                if (~var11 >= -1025) {
                    arg0.field1296 += arg0.field1330;
                    boolean var12 = true;
                    if (~var11 > ~arg0.field1330 || -arg0.field1330 + 2048 < var11) {
                        arg0.field1296 = arg0.field1275;
                        var12 = false;
                    }
                    if (arg0.field1308 == arg0.field1282 && (~arg0.field1278 < -26 || var12)) {
                        if (~arg0.field1316 != 0) {
                            arg0.field1282 = arg0.field1316;
                        } else {
                            arg0.field1282 = arg0.field1328;
                        }
                    }
                } else {
                    arg0.field1296 -= arg0.field1330;
                    boolean var13 = true;
                    if (~var11 > ~arg0.field1330 || var11 > 2048 - arg0.field1330) {
                        var13 = false;
                        arg0.field1296 = arg0.field1275;
                    }
                    if (arg0.field1308 == arg0.field1282 && (arg0.field1278 > 25 || var13)) {
                        if (arg0.field1292 != -1) {
                            arg0.field1282 = arg0.field1292;
                        } else {
                            arg0.field1282 = arg0.field1328;
                        }
                    }
                }
                arg0.field1296 &= 2047;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class264() {
        super(0, true);
    }
}
