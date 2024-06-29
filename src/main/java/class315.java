import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class315 extends class34 {

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "[B")
    private byte[] field4265 = new byte[512];

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public int field4266 = 4;

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "I")
    public int field4270 = 4;

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public int field4268 = 1638;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "Z")
    public boolean field4269 = true;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public int field4279 = 0;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public int field4278 = 4;

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "F")
    public static float field4275;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "Ldk;")
    public static class421 field4271;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[S")
    private short[] field4261;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "[S")
    private short[] field4273;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lza;B)V")
    public static final void method1813(class295 arg0, byte arg1) {
        ++field4276;
        if ((class527.field7690 >= 2 || class375.field5390) && class294.field3967 == null) {
            if (arg1 != 7) {
                method1813((class295) null, (byte) -83);
            }
            String var2;
            if (class375.field5390 && ~class527.field7690 > -3) {
                var2 = class87.field1409 + class269.field3627.method1126(class486.field6998, (byte) -19) + class476.field6886 + " ->";
            } else if (class211.field3011 && class78.field1106.method2585(81, (byte) 88) && ~class527.field7690 < -3) {
                var2 = class219.method1368((class440) class391.field5638.field7789.field6879.field6879, (byte) 106);
            } else {
                class440 var3 = (class440) class391.field5638.field7789.field6879;
                var2 = class219.method1368(var3, (byte) 81);
                int[] var4 = null;
                if (!class302.method1752(109, var3.field6337)) {
                    if (~var3.field6336 != 0) {
                        var4 = class534.field7872.method3089(var3.field6336, -125).field4072;
                    } else if (class339.method2062((byte) -38, var3.field6337)) {
                        class326 var5 = (class326) class281.field3826.method1592((byte) -25, (long) ((int) var3.field6334));
                        if (var5 != null) {
                            class209 var6 = var5.field4455;
                            class83 var7 = var6.field2976;
                            if (var7.field1272 != null) {
                                var7 = var7.method655(class309.field4200, (byte) 117);
                            }
                            if (var7 != null) {
                                var4 = var7.field1278;
                            }
                        }
                    } else if (class288.method1653(var3.field6337, (byte) -61)) {
                        Object var8 = null;
                        class103 var9;
                        if (~var3.field6337 != -1010) {
                            var9 = class452.field6629.method603((byte) 106, (int) (2147483647L & var3.field6334 >>> 32));
                        } else {
                            var9 = class452.field6629.method603((byte) 97, (int) var3.field6334);
                        }
                        if (var9.field1613 != null) {
                            var9 = var9.method795(-31036, class309.field4200);
                        }
                        if (var9 != null) {
                            var4 = var9.field1650;
                        }
                    }
                } else {
                    var4 = class534.field7872.method3089((int) var3.field6334, -97).field4072;
                }
                if (var4 != null) {
                    var2 = var2 + class413.method2430(0, var4);
                }
            }
            if (~class527.field7690 < -3) {
                var2 = var2 + "<col=ffffff> / " + (class527.field7690 + -2) + class220.field3117.method1126(class486.field6998, (byte) -19);
            }
            if (class496.field7268 == null) {
                if (class518.field7597 != null && class98.field1564 == class152.field2343) {
                    int var10 = class108.field1751.method1763(class271.field3684, 0, class288.field3907, class246.field3359 + 16, var2, 16777215, class154.field2369, class122.field1900, (byte) -59, class414.field5910 + 4);
                    class94.method767(class414.field5910 - -4, var10 + class80.field1127.method416(8364, var2), 16, class246.field3359, (byte) 39);
                    return;
                }
            } else {
                class306 var11 = class496.field7268.method2629(arg1 + -1951184439, arg0);
                if (var11 == null) {
                    var11 = class108.field1751;
                }
                var11.method1764(class496.field7268.field6400, class496.field7268.field6470, var2, class496.field7268.field6431, class496.field7268.field6480, class273.field3691, class496.field7268.field6453, class271.field3684, class191.field2801, class496.field7268.field6419, class154.field2369, arg1 + 63, class288.field3907, class122.field1900, class219.field3098);
                class94.method767(class219.field3098[0], class219.field3098[2], class219.field3098[3], class219.field3098[1], (byte) 39);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field4274;
        int[] var3 = super.field537.method1780(arg0, (byte) 126);
        int var4 = 17 / (-arg1 / 50);
        if (super.field537.field4191) {
            this.method1815(-76, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        ++field4280;
        this.field4265 = class462.method2685((byte) -86, this.field4279);
        this.method1814(0);
        int var2 = this.field4270 + -1;
        if (arg0 > -84) {
            this.field4270 = 117;
        }
        while (~var2 <= -2) {
            short var3 = this.field4273[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field4270;
            --var2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    private final void method1814(int arg0) {
        if (this.field4268 > arg0) {
            this.field4261 = new short[this.field4270];
            this.field4273 = new short[this.field4270];
            for (int var2 = 0; ~this.field4270 < ~var2; ++var2) {
                this.field4273[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field4268 / 4096.0F), (double) var2)));
                this.field4261[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4273 != null && ~this.field4273.length == ~this.field4270) {
            this.field4261 = new short[this.field4270];
            for (int var3 = 0; ~var3 > ~this.field4270; ++var3) {
                this.field4261[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        ++field4263;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[II)V")
    public final void method1815(int arg0, int[] arg1, int arg2) {
        ++field4277;
        int var4 = class284.field3856[arg2] * this.field4266;
        int var5 = -105 / ((36 - arg0) / 44);
        if (~this.field4270 != -2) {
            short var6 = this.field4273[0];
            if (~var6 < -9 || var6 < -8) {
                int var7 = this.field4261[0] << 12;
                int var8 = var4 * var7 >> 12;
                int var9 = this.field4266 * var7 >> 12;
                int var10 = this.field4278 * var7 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 - -1;
                if (~var12 <= ~var9) {
                    var12 = 0;
                }
                int var13 = var8 & 4095;
                int var14 = this.field4265[var12 & 255] & 255;
                int var15 = class369.field5278[var13];
                int var16 = this.field4265[255 & var11] & 255;
                for (int var17 = 0; ~class383.field5502 < ~var17; ++var17) {
                    int var37 = class91.field1463[var17] * this.field4278;
                    int var38 = this.method1817(var16, var13, -15513, var14, var10, var7 * var37 >> 12, var15);
                    arg1[var17] = var6 * var38 >> 12;
                }
            }
            for (int var18 = 1; var18 < this.field4270; ++var18) {
                short var19 = this.field4273[var18];
                if (var19 > 8 || ~var19 > 7) {
                    int var20 = this.field4261[var18] << 12;
                    int var21 = this.field4278 * var20 >> 12;
                    int var22 = this.field4266 * var20 >> 12;
                    int var23 = var4 * var20 >> 12;
                    int var24 = var23 >> 12;
                    int var25 = var24 + 1;
                    int var26 = var23 & 4095;
                    if (~var22 >= ~var25) {
                        var25 = 0;
                    }
                    int var27 = this.field4265[255 & var25] & 255;
                    int var28 = 255 & this.field4265[var24 & 255];
                    int var29 = class369.field5278[var26];
                    if (this.field4269 && ~(this.field4270 + -1) == ~var18) {
                        for (int var30 = 0; ~var30 > ~class383.field5502; ++var30) {
                            int var31 = class91.field1463[var30] * this.field4278;
                            int var32 = this.method1817(var28, var26, -15513, var27, var21, var20 * var31 >> 12, var29);
                            int var33 = (var19 * var32 >> 12) + arg1[var30];
                            arg1[var30] = (var33 >> 1) + 2048;
                        }
                    } else {
                        for (int var34 = 0; ~var34 > ~class383.field5502; ++var34) {
                            int var35 = class91.field1463[var34] * this.field4278;
                            int var36 = this.method1817(var28, var26, -15513, var27, var21, var20 * var35 >> 12, var29);
                            arg1[var34] += var19 * var36 >> 12;
                        }
                    }
                }
            }
        } else {
            short var39 = this.field4273[0];
            int var40 = this.field4261[0] << 12;
            int var41 = var4 * var40 >> 12;
            int var42 = this.field4266 * var40 >> 12;
            int var43 = this.field4278 * var40 >> 12;
            int var44 = var41 >> 12;
            int var45 = var44 + 1;
            int var46 = var41 & 4095;
            if (~var42 >= ~var45) {
                var45 = 0;
            }
            int var47 = class369.field5278[var46];
            int var48 = this.field4265[255 & var45] & 255;
            int var49 = 255 & this.field4265[var44 & 255];
            if (this.field4269) {
                for (int var50 = 0; var50 < class383.field5502; ++var50) {
                    int var51 = class91.field1463[var50] * this.field4278;
                    int var52 = this.method1817(var49, var46, -15513, var48, var43, var40 * var51 >> 12, var47);
                    int var53 = var39 * var52 >> 12;
                    arg1[var50] = 2048 - -(var53 >> 1);
                }
            } else {
                for (int var54 = 0; ~var54 > ~class383.field5502; ++var54) {
                    int var55 = class91.field1463[var54] * this.field4278;
                    int var56 = this.method1817(var49, var46, -15513, var48, var43, var40 * var55 >> 12, var47);
                    arg1[var54] = var39 * var56 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            this.field4270 = 89;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field4266 = arg0.method1869(-101);
                                }
                            } else {
                                this.field4278 = arg0.method1869(-110);
                            }
                        } else {
                            this.field4279 = arg0.method1869(-74);
                        }
                    } else {
                        this.field4278 = this.field4266 = arg0.method1869(-100);
                    }
                } else {
                    this.field4268 = arg0.method1847(123);
                    if (this.field4268 < 0) {
                        this.field4273 = new short[this.field4270];
                        for (int var5 = 0; ~var5 > ~this.field4270; ++var5) {
                            this.field4273[var5] = (short) arg0.method1847(90);
                        }
                    }
                }
            } else {
                this.field4270 = arg0.method1869(-71);
            }
        } else {
            this.field4269 = ~arg0.method1869(-67) == -2;
        }
        ++field4264;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BZ)V")
    public static final void method1816(byte arg0, boolean arg1) {
        ++field4272;
        class287.method1649(841283500);
        if (class32.method239(class494.field7155, 0)) {
            ++class291.field3948;
            int var2 = -102 % ((arg0 - 26) / 45);
            if (class291.field3948 >= 50 || arg1) {
                class291.field3948 = 0;
                if (!class66.field954 && class104.field1702 != null) {
                    ++class346.field4981;
                    class274.method1602(14, class332.field4516);
                    try {
                        class104.field1702.method180(0, class17.field275.field4360, 18170, class17.field275.field4336);
                        class17.field275.field4360 = 0;
                    } catch (IOException var3) {
                        class66.field954 = true;
                    }
                }
                class287.method1649(841283500);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I")
    private final int method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4262;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = arg5 & 4095;
        int var11 = var8 & 255;
        if (~var9 <= ~arg4) {
            var9 = 0;
        }
        int var12 = arg1 + -4096;
        int var13 = var9 & 255;
        int var14 = var10 - 4096;
        int var15 = this.field4265[arg0 + var11] & 3;
        int var16 = class369.field5278[var10];
        int var17;
        if (var15 <= 1) {
            var17 = var15 == 0 ? var10 - -arg1 : -var10 + arg1;
        } else {
            var17 = ~var15 == -3 ? -arg1 + var10 : -arg1 + -var10;
        }
        int var18 = this.field4265[arg0 + var13] & 3;
        int var19;
        if (~var18 >= -2) {
            var19 = ~var18 != -1 ? arg1 - var14 : arg1 + var14;
        } else {
            var19 = ~var18 != -3 ? -arg1 + -var14 : var14 - arg1;
        }
        int var20 = ((var19 - var17) * var16 >> 12) + var17;
        int var21 = 3 & this.field4265[arg3 + var11];
        int var22;
        if (var21 > 1) {
            var22 = var21 != 2 ? -var10 + -var12 : -var12 + var10;
        } else {
            var22 = ~var21 == -1 ? var10 - -var12 : -var10 + var12;
        }
        int var23 = this.field4265[var13 - -arg3] & 3;
        int var24;
        if (~var23 < -2) {
            var24 = ~var23 == -3 ? -var12 + var14 : -var12 + -var14;
        } else {
            var24 = ~var23 != -1 ? -var14 + var12 : var12 + var14;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return arg2 != -15513 ? -56 : ((var25 - var20) * arg6 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class315() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V")
    public static void method1818(boolean arg0) {
        field4271 = null;
        if (arg0) {
            method1813((class295) null, (byte) 122);
        }
    }
}
