import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 extends class264 {

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field704 = 32768;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Lcf;")
    public static class93 field699 = class147.method1066("mapflag", -48);

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Lcf;")
    public static class93 field700 = class147.method1066("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -48);

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "Lcf;")
    public static class93 field702 = class147.method1066("(U5", -48);

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Lcf;")
    public static class93 field703 = class147.method1066("ondulation2:", -48);

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "[Lwg;")
    public static class174[] field707 = new class174[4];

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field705 = -2;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class44() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        if (arg0 != -3) {
            field702 = null;
        }
        ++field706;
        class55.method310(4096);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)I")
    public static final int method244(int arg0, int arg1) {
        ++field708;
        return arg0 == arg1 ? -1 : class180.method1322(arg1, (byte) 125);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field698;
        if (arg1) {
            field697 = -97;
        }
        int[][] var3 = super.field4705.method1089(arg0, 67);
        if (super.field4705.field2670) {
            int[] var4 = this.method1767(1, arg0, 21654);
            int[] var5 = this.method1767(2, arg0, 21654);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class176.field3060 > var9; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field704 >> 12;
                int var12 = class124.field2200[var10] * var11 >> 12;
                int var13 = class232.field4148[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class55.field910;
                int var15 = class53.field881 & arg0 - -(var13 >> 12);
                int[][] var16 = this.method1773(-126, 0, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 > 11) {
            if (arg1 != 0) {
                if (~arg1 == -2) {
                    super.field4698 = ~arg2.method1907(16832) == -2;
                }
            } else {
                this.field704 = arg2.method1891(-122) << 4;
            }
            ++field701;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        int[] var3 = super.field4716.method532((byte) 67, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(1, arg0, 21654);
            int[] var5 = this.method1767(2, arg0, 21654);
            for (int var6 = 0; class176.field3060 > var6; ++var6) {
                int var7 = (4080 & var4[var6]) >> 4;
                int var8 = var5[var6] * this.field704 >> 12;
                int var9 = class124.field2200[var7] * var8 >> 12;
                int var10 = class232.field4148[var7] * var8 >> 12;
                int var11 = class55.field910 & var6 - -(var9 >> 12);
                int var12 = class53.field881 & (var10 >> 12) + arg0;
                int[] var13 = this.method1767(0, var12, 21654);
                var3[var6] = var13[var11];
            }
        }
        ++field709;
        if (arg1 > -83) {
            field697 = 57;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(B)V")
    public static void method245(byte arg0) {
        field699 = null;
        field702 = null;
        field703 = null;
        field700 = null;
        if (arg0 != -73) {
            field702 = null;
        }
        field707 = null;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)Z")
    public static final boolean method246(int arg0, byte arg1) {
        byte var2 = 0;
        ++field710;
        byte var3 = 0;
        if (class267.field4761 == null) {
            if (class242.field4374 != null) {
                class267.field4761 = (class158) class242.field4374;
            } else {
                class267.field4761 = new class158(512, 512);
            }
            int[] var4 = class267.field4761.field2795;
            int var5 = var4.length;
            for (int var6 = 0; ~var5 < ~var6; ++var6) {
                var4[var6] = 1;
            }
            for (int var7 = var3 - -1; -var3 + 103 > var7; ++var7) {
                int var21 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var22 = var2 + 1; ~(-var2 + 104 + -1) < ~var22; ++var22) {
                    if ((class4.field53[arg0][var22][var7] & 24) == 0) {
                        class102.method743(var4, var21, 512, arg0, var22, var7);
                    }
                    if (arg0 < 3 && ~(8 & class4.field53[arg0 + 1][var22][var7]) != -1) {
                        class102.method743(var4, var21, 512, arg0 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class78.field1467 = 0;
            for (int var8 = 0; ~var8 > -105; ++var8) {
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    long var10 = class269.method1795(class138.field2405, var2 + var8, var3 + var9);
                    if (var10 != 0L) {
                        class240 var12 = class34.method197(-111, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field4272;
                        if (var12.field4275 != null) {
                            for (int var14 = 0; ~var12.field4275.length < ~var14; ++var14) {
                                if (~var12.field4275[var14] != 0) {
                                    class240 var15 = class34.method197(-115, var12.field4275[var14]);
                                    if (~var15.field4272 <= -1) {
                                        var13 = var15.field4272;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var2 + var8;
                            int var17 = var3 + var9;
                            if (var13 != 22 && ~var13 != -30 && ~var13 != -35 && ~var13 != -37 && var13 != 46 && ~var13 != -48 && ~var13 != -49) {
                                int[][] var18 = class148.field2605[class138.field2405].field1769;
                                for (int var19 = 0; ~var19 > -11; ++var19) {
                                    int var20 = (int) (Math.random() * 4.0D);
                                    if (var20 == 0 && ~var16 < -1 && ~var16 < ~(var8 + -3) && (19661064 & var18[var16 - 1][var17]) == 0) {
                                        --var16;
                                    }
                                    if (var20 == 1 && ~var16 > -104 && var8 - -3 > var16 && ~(19661184 & var18[var16 - -1][var17]) == -1) {
                                        ++var16;
                                    }
                                    if (~var20 == -3 && var17 > 0 && var17 > var9 + -3 && ~(19661058 & var18[var16][var17 + -1]) == -1) {
                                        --var17;
                                    }
                                    if (~var20 == -4 && ~var17 > -104 && var9 - -3 > var17 && (var18[var16][var17 + 1] & 19661088) == 0) {
                                        ++var17;
                                    }
                                }
                            }
                            class25.field316[class78.field1467] = var12.field4318;
                            class191.field3484[class78.field1467] = var16 - var2;
                            class178.field3142[class78.field1467] = -var3 + var17;
                            ++class78.field1467;
                        }
                    }
                }
            }
        }
        int var23 = -10 + 238 + (int) (Math.random() * 20.0D) << 16;
        class267.field4761.method1139();
        int var24 = (-10 + (int) (Math.random() * 20.0D) + 238 << 8) + (238 + (int) (Math.random() * 20.0D) - 10 << 16) - -((int) (Math.random() * 20.0D)) - -228;
        int var25 = 1;
        if (arg1 != 102) {
            field702 = null;
        }
        while (~var25 > -104) {
            for (int var26 = 1; var26 < 103; ++var26) {
                if ((class4.field53[arg0][var2 + var26][var3 + var25] & 24) == 0 && !class94.method694(var23, var25, (byte) 126, arg0, var26, var24, var2, var3)) {
                    class159.field2799.method1623(97);
                    return false;
                }
                if (~arg0 > -4 && ~(class4.field53[arg0 + 1][var2 + var26][var25 - -var3] & 8) != -1 && !class94.method694(var23, var25, (byte) 126, arg0 - -1, var26, var24, var2, var3)) {
                    class159.field2799.method1623(111);
                    return false;
                }
            }
            ++var25;
        }
        class242.field4374 = class267.field4761;
        class159.field2799.method1623(70);
        class267.field4761 = null;
        return true;
    }
}
