import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class203 extends class50 {

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
    private final int field3880;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    private final int field3871;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    private final int field3875;

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    private final int field3876;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3860 = 0;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public static int field3863 = 0;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field3864 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3861 = 0;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "Li;")
    public static class88 field3862 = class208.method1425(105, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    public static boolean field3869 = false;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "[Z")
    public static boolean[] field3877 = new boolean[8];

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3878 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Lq;")
    public static class174 field3873;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lbj;")
    public static class22 field3872;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1391(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class168.field3244 * arg3 + class159.field3068 * arg0 >> 16;
        int var6 = class159.field3068 * arg3 - class168.field3244 * arg0 >> 16;
        int var7 = class99.field1805 * arg1 + class201.field3840 * var6 >> 16;
        int var8 = class201.field3840 * arg1 - class99.field1805 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class99.field1805 * arg2 + class201.field3840 * var6 >> 16;
        int var12 = class201.field3840 * arg2 - class99.field1805 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class147.field2768 && var13 < class147.field2768) {
            return false;
        } else if (var9 > class151.field2933 && var13 > class151.field2933) {
            return false;
        } else if (var10 < class58.field1102 && var14 < class58.field1102) {
            return false;
        } else {
            return var10 <= class217.field4057 || var14 <= class217.field4057;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIZ)V")
    public final void method373(int arg0, int arg1, boolean arg2) {
        ++field3868;
        if (arg2) {
            field3862 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILi;III)V")
    public static final void method1392(int arg0, class88 arg1, int arg2, int arg3, int arg4) {
        ++field3874;
        class174 var5 = class36.method238(arg2, arg4, true);
        if (var5 != null) {
            if (var5.field3403 != null) {
                class39 var6 = new class39();
                var6.field679 = arg0;
                var6.field678 = var5;
                var6.field681 = var5.field3403;
                var6.field677 = arg1;
                class200.method1375(var6, -876775538);
            }
            boolean var7 = true;
            if (~var5.field3441 < -1) {
                var7 = class53.method389(arg3 ^ -3626, var5);
            }
            if (var7) {
                if (class105.method728(100, arg0 - 1, class80.method530(-881710560, var5))) {
                    if (~arg0 == -2) {
                        ++class119.field2157;
                        class146.field2749.method30((byte) -32, 44);
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(arg3 ^ -3617, arg2);
                    }
                    if (~arg0 == -3) {
                        ++class170.field3286;
                        class146.field2749.method30((byte) -75, 50);
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(90, arg2);
                    }
                    if (arg0 == 3) {
                        ++class236.field4403;
                        class146.field2749.method30((byte) -103, 103);
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(83, arg2);
                    }
                    if (~arg0 == -5) {
                        class146.field2749.method30((byte) -114, 64);
                        class146.field2749.method338(2112555600, arg4);
                        ++class127.field2379;
                        class146.field2749.method305(95, arg2);
                    }
                    if (arg0 == 5) {
                        class146.field2749.method30((byte) -119, 178);
                        class146.field2749.method338(arg3 + 2112559255, arg4);
                        ++class37.field671;
                        class146.field2749.method305(arg3 + 3757, arg2);
                    }
                    if (~arg0 == -7) {
                        class146.field2749.method30((byte) -30, 81);
                        ++class128.field2411;
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(arg3 ^ -3637, arg2);
                    }
                    if (arg0 == 7) {
                        ++class147.field2765;
                        class146.field2749.method30((byte) -128, 236);
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(101, arg2);
                    }
                    if (~arg0 == -9) {
                        ++class4.field48;
                        class146.field2749.method30((byte) -81, 188);
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(81, arg2);
                    }
                    if (arg0 == 9) {
                        class146.field2749.method30((byte) -117, 128);
                        ++class157.field3020;
                        class146.field2749.method338(2112555600, arg4);
                        class146.field2749.method305(arg3 ^ -3625, arg2);
                    }
                    if (~arg0 == -11) {
                        class146.field2749.method30((byte) -50, 254);
                        class146.field2749.method338(arg3 ^ -2112554007, arg4);
                        ++class15.field235;
                        class146.field2749.method305(arg3 + 3769, arg2);
                    }
                    if (arg3 != -3655) {
                        method1396(66, (class44) null, 57, -117);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZI)V")
    public static final void method1393(int arg0, boolean arg1, int arg2) {
        class146.field2749.method30((byte) -30, 95);
        ++class112.field2034;
        if (arg1) {
            field3872 = null;
        }
        class146.field2749.method316(arg2, 15728);
        class146.field2749.method314(arg0, (byte) -14);
        ++field3870;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
    public final void method371(int arg0, int arg1, int arg2) {
        ++field3859;
        if (arg2 != 75) {
            this.method377(-18, -53, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1394(int arg0) {
        field3877 = null;
        field3872 = null;
        field3873 = null;
        field3862 = null;
        if (arg0 != 236) {
            field3860 = 30;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Lrc;")
    public static final class188 method1395(byte arg0) {
        ++field3867;
        byte[] var1 = class116.field2106[0];
        int var2 = class67.field1218[0] * class102.field1853[0];
        int[] var3 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3[var4] = class27.field456[class70.method470(var1[var4], 255)];
        }
        class169 var5 = new class169(class15.field229, class129.field2426, class247.field4530[0], class135.field2512[0], class102.field1853[0], class67.field1218[0], var3);
        if (arg0 != 77) {
            field3869 = false;
        }
        class239.method1580(72);
        return var5;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(IIIIII)V")
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3880 = arg0;
        this.field3871 = arg3;
        this.field3875 = arg2;
        this.field3876 = arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILdj;II)V")
    public static final void method1396(int arg0, class44 arg1, int arg2, int arg3) {
        ++field3865;
        if ((arg0 & 4) != 0) {
            arg1.field4073 = class230.field4314.method298(arg2 ^ -110);
            if (~arg1.field4073.method599(255, 0) == -127) {
                arg1.field4073 = arg1.field4073.method635(1, -383902332);
                class223.method1501(arg1.field4073, 12, 2, arg1.field766);
            } else if (class240.field4458 == arg1) {
                class223.method1501(arg1.field4073, 12, 2, arg1.field766);
            }
            arg1.field4140 = 0;
            arg1.field4085 = 0;
            arg1.field4114 = 150;
        }
        if ((1024 & arg0) != 0) {
            arg1.field4115 = class230.field4314.method352(24758);
            arg1.field4096 = class230.field4314.method295((byte) -72);
            arg1.field4102 = class230.field4314.method295((byte) -52);
            arg1.field4074 = class230.field4314.method319(4633);
            arg1.field4135 = class230.field4314.method343(arg2 ^ 103) - -class117.field2115;
            arg1.field4132 = class230.field4314.method343(arg2 ^ 78) + class117.field2115;
            arg1.field4141 = class230.field4314.method319(4633);
            arg1.field4139 = 0;
            arg1.field4137 = 1;
        }
        if ((arg2 & arg0) != 0) {
            arg1.field4098 = class230.field4314.method349(true);
            arg1.field4101 = class230.field4314.method302(255);
        }
        if ((512 & arg0) != 0) {
            arg1.field4082 = class230.field4314.method301(68);
            int var4 = class230.field4314.method313(121);
            if (arg1.field4082 == 65535) {
                arg1.field4082 = -1;
            }
            arg1.field4127 = var4 >> 16;
            arg1.field4084 = (65535 & var4) + class117.field2115;
            arg1.field4077 = 0;
            arg1.field4122 = 0;
            if (~class117.field2115 > ~arg1.field4084) {
                arg1.field4077 = -1;
            }
        }
        if ((8 & arg0) != 0) {
            int var5 = class230.field4314.method301(arg2 ^ 126);
            if (var5 == 65535) {
                var5 = -1;
            }
            int var6 = class230.field4314.method347(26119);
            class226.method1517((byte) -31, var5, var6, arg1);
        }
        if ((64 & arg0) != 0) {
            int var7 = class230.field4314.method347(26119);
            byte[] var8 = new byte[var7];
            class46 var9 = new class46(var8);
            class230.field4314.method307(false, var7, var8, 0);
            class77.field1397[arg3] = var9;
            arg1.method285(var9, true);
        }
        if (~(128 & arg0) != -1) {
            int var10 = class230.field4314.method352(24758);
            int var11 = class230.field4314.method347(26119);
            arg1.method1479(class117.field2115, 31632, var11, var10);
            arg1.field4120 = class117.field2115 + 300;
            arg1.field4111 = class230.field4314.method295((byte) -100);
        }
        if (~(256 & arg0) != -1) {
            int var12 = class230.field4314.method352(24758);
            int var13 = class230.field4314.method352(24758);
            arg1.method1479(class117.field2115, arg2 ^ 31616, var13, var12);
        }
        if (~(1 & arg0) != -1) {
            int var14 = class230.field4314.method349(true);
            boolean var15 = ~(32768 & var14) != -1;
            int var16 = class230.field4314.method352(24758);
            int var17 = class230.field4314.method347(26119);
            int var18 = class230.field4314.field831;
            if (arg1.field766 != null && arg1.field768 != null) {
                long var19 = arg1.field766.method630(false);
                boolean var21 = false;
                if (~var16 >= -2) {
                    if (var15 || ~class238.field4430 != -2 && class176.field3537 != 1) {
                        for (int var22 = 0; class67.field1221 > var22; ++var22) {
                            if (~class95.field1765[var22] == ~var19) {
                                var21 = true;
                                break;
                            }
                        }
                    } else {
                        var21 = true;
                    }
                }
                if (!var21 && ~client.field563 == -1) {
                    class54.field1006.field831 = 0;
                    int var23 = -1;
                    class230.field4314.method315(class54.field1006.field842, 0, var17, 109);
                    class54.field1006.field831 = 0;
                    class88 var24;
                    if (!var15) {
                        var24 = class26.method162(class21.method103(class54.field1006, 106).method622(-29988));
                    } else {
                        class217 var25 = class92.method668((byte) -15, class54.field1006);
                        var23 = var25.field4060;
                        var14 &= 32767;
                        var24 = var25.field4067.method1411(class54.field1006, 80);
                    }
                    arg1.field4073 = var24.method602(-32);
                    arg1.field4114 = 150;
                    arg1.field4085 = var14 >> 8;
                    arg1.field4140 = var14 & 255;
                    if (~var16 == -3) {
                        class118.method803(var24, (byte) 28, var23, class166.method1142(new class88[] { class28.field472, arg1.field766 }, -3), !var15 ? 1 : 17, (class88) null);
                    } else if (var16 != 1) {
                        class118.method803(var24, (byte) 28, var23, arg1.field766, var15 ? 17 : 2, (class88) null);
                    } else {
                        class118.method803(var24, (byte) 28, var23, class166.method1142(new class88[] { class166.field3203, arg1.field766 }, -3), var15 ? 17 : 1, (class88) null);
                    }
                }
            }
            class230.field4314.field831 = var17 + var18;
        }
        if ((arg0 & 32) != 0) {
            arg1.field4116 = class230.field4314.method301(112);
            if (arg1.field4116 == 65535) {
                arg1.field4116 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIB)V")
    public final void method377(int arg0, int arg1, byte arg2) {
        int var4 = this.field3880 * arg0 >> 12;
        int var5 = -24 / ((arg2 - -11) / 55);
        int var6 = this.field3875 * arg0 >> 12;
        int var7 = this.field3876 * arg1 >> 12;
        int var8 = this.field3871 * arg1 >> 12;
        class229.method1531(var4, (byte) 111, var8, var6, var7, super.field927);
        ++field3879;
    }
}
