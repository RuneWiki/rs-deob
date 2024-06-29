import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class166 extends class148 {

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    private int field2445 = 4096;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    private int field2440 = 16;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    private int field2443 = 2000;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    private int field2452 = 0;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    private int field2448 = 0;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "Lri;")
    public static class73 field2447 = new class73(5, 14);

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "Lki;")
    public static class498 field2454 = new class498(8, 7);

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "Lrm;")
    public static class281 field2450;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "Lvg;")
    public static class38 field2455;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method25(int arg0, int arg1) {
        ++field2444;
        int[] var3 = super.field2193.method497(arg1, false);
        if (arg0 >= -65) {
            return null;
        } else {
            if (super.field2193.field1312) {
                int var4 = this.field2445 >> 1;
                int[][] var5 = super.field2193.method500(87);
                Random var6 = new Random((long) this.field2448);
                for (int var7 = 0; ~var7 > ~this.field2443; ++var7) {
                    int var8 = this.field2445 > 0 ? this.field2452 - (-class317.method1984(-31, var6, this.field2445) - -var4) : this.field2452;
                    int var9 = 255 & var8 >> 4;
                    int var10 = class317.method1984(-96, var6, class320.field4579);
                    int var11 = class317.method1984(84, var6, class238.field3506);
                    int var12 = var10 - -(class318.field4564[var9] * this.field2440 >> 12);
                    int var13 = (class76.field1130[var9] * this.field2440 >> 12) + var11;
                    int var14 = -var11 + var13;
                    int var15 = -var10 + var12;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            int var18 = var12;
                            var11 = var17;
                            var12 = var13;
                            var13 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            int var20 = var11;
                            var10 = var12;
                            var12 = var19;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = var12 - var10;
                        int var23 = var13 - var11;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        int var26 = 1024 + -(class317.method1984(-10, var6, 4096) >> 2);
                        int var27 = var13 > var11 ? 1 : -1;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        for (int var28 = var10; var12 > var28; ++var28) {
                            int var29 = var26 - -1024 - -((var28 - var10) * var25);
                            int var30 = var28 & class304.field4339;
                            int var31 = class39.field569 & var21;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            var24 += var23;
                            if (var24 > 0) {
                                var24 += -var22;
                                var21 -= -var27;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Z", line = 138)
    public static final boolean method1153(int arg0, int arg1, int arg2) {
        if (arg1 > -13) {
            method1157((byte) -18);
        }
        ++field2453;
        return (2048 & arg0) != 0 && ~(55 & arg2) != -1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lmt;Lmt;B)V", line = 150)
    public static final void method1154(class271 arg0, class271 arg1, byte arg2) {
        if (arg0.field3935 != null) {
            arg0.method1783((byte) -72);
        }
        ++field2446;
        arg0.field3935 = arg1;
        arg0.field3939 = arg1.field3939;
        arg0.field3935.field3939 = arg0;
        arg0.field3939.field3935 = arg0;
        if (arg2 != 87) {
            method1155(108);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 169)
    public final void method175(int arg0) {
        if (arg0 != -1285532468) {
            this.field2448 = 93;
        }
        class419.method2520(-112);
        ++field2441;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILdh;I)V", line = 185)
    public final void method23(int arg0, class209 arg1, int arg2) {
        ++field2449;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            this.field2445 = arg1.method1450((byte) 33);
                        }
                    } else {
                        this.field2452 = arg1.method1450((byte) 119);
                    }
                } else {
                    this.field2440 = arg1.method1428(32122);
                }
            } else {
                this.field2443 = arg1.method1450((byte) 26);
            }
        } else {
            this.field2448 = arg1.method1428(32122);
        }
        int var5 = 65 % ((arg2 - -88) / 33);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V", line = 244)
    public static void method1155(int arg0) {
        field2447 = null;
        if (arg0 < -63) {
            field2450 = null;
            field2455 = null;
            field2454 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 268)
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIILqa;IILm;)V", line = 273)
    public static final void method1156(byte arg0, int arg1, int arg2, class162 arg3, int arg4, int arg5, class126 arg6) {
        if (~class482.field7062 > -101) {
            class51.method315((byte) -75, arg6, arg3);
        }
        ++field2442;
        if (arg0 != -93) {
            method1154((class271) null, (class271) null, (byte) -41);
        }
        arg3.method1098(arg5, arg4, arg5 - -arg1, arg4 - -arg2);
        if (class482.field7062 < 100) {
            byte var7 = 20;
            int var8 = arg1 / 2 + arg5;
            int var9 = arg2 / 2 + arg4 + -var7 + -18;
            arg3.method1036(arg5, arg4, arg1, arg2, -16777216, 0);
            arg3.method1104(var8 + -152, var9, 304, 34, class255.field3784[class412.field6196].getRGB(), 0);
            arg3.method1036(var8 + -150, var9 + 2, class482.field7062 * 3, 30, class3.field45[class412.field6196].getRGB(), 0);
            class294.field4202.method2915(class210.field3056[class412.field6196].getRGB(), -1, var8, var7 + var9, class46.field730.method2838(false, class143.field2137), true);
        } else {
            int var10 = class271.field3940 - (int) ((float) arg1 / class460.field6808);
            int var11 = (int) ((float) arg2 / class460.field6808) + class335.field4715;
            int var12 = (int) ((float) arg1 / class460.field6808) + class271.field3940;
            class31.field339 = -((int) ((float) arg1 / class460.field6808)) + class271.field3940;
            class39.field574 = (int) ((float) (arg1 * 2) / class460.field6808);
            class219.field3205 = (int) ((float) (arg2 * 2) / class460.field6808);
            int var13 = class335.field4715 - (int) ((float) arg2 / class460.field6808);
            class382.field5789 = class335.field4715 - (int) ((float) arg2 / class460.field6808);
            class460.method2758(class460.field6818 + var10, var11 - -class460.field6825, var12 - -class460.field6818, class460.field6825 + var13, arg5, arg4, arg1 + arg5, arg2 + arg4 + 1);
            class460.method2760(arg3);
            class123 var14 = class460.method2755(arg3);
            class473.method2828(0, (byte) -84, var14, arg3, 0);
            if (~class259.field3816 < -1) {
                --class116.field1759;
                if (~class116.field1759 == -1) {
                    --class259.field3816;
                    class116.field1759 = 20;
                }
            }
            if (class390.field5883) {
                int var15 = arg1 + -5 + arg5;
                int var16 = arg2 + arg4 - 8;
                class147.field2181.method2912("Fps:" + class33.field348, 16776960, (byte) 124, var15, -1, var16);
                int var20 = var16 - 15;
                Runtime var17 = Runtime.getRuntime();
                int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                int var19 = 16776960;
                if (var18 > 65536) {
                    var19 = 16711680;
                }
                class147.field2181.method2912("Mem:" + var18 + "k", var19, (byte) 124, var15, -1, var20);
                var16 = var20 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(B)V", line = 359)
    public static final void method1157(byte arg0) {
        ++field2451;
        int var1 = (int) ((double) class30.field323 * 34.46D);
        int var2 = var1 << 0;
        if (arg0 != -116) {
            method1157((byte) 72);
        }
        if (class348.field5015.method1075()) {
            var2 += 128;
        }
        class348.field5015.method1102(50, var2);
    }
}
