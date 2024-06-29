import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class264 {

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field3805 = 0;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public int field3810 = 0;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Llh;")
    private class364 field3807 = new class364(64);

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Lrj;")
    private class419 field3817 = null;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "Lhh;")
    private class84 field3808;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "Lhh;")
    private class84 field3809;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lvp;")
    public static class123 field3811 = new class123(71, -1);

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "[I")
    public static int[] field3818 = new int[16];

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Ltt;")
    public static class60 field3804;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3819;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1694(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1688(int arg0) {
        field3818 = null;
        field3811 = null;
        field3804 = null;
        if (arg0 != -3) {
            field3811 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)Lcm;", line = 17)
    public final class509 method1689(int arg0, byte arg1) {
        field3816++;
        class509 var3 = (class509) this.field3807.method2339(-127, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field3809.method683(1, arg0 & 0x7FFF, 5);
        } else {
            var4 = this.field3808.method683(1, arg0, 5);
        }
        class509 var5 = new class509();
        var5.field7443 = this;
        if (arg1 > -33) {
            return null;
        }
        if (var4 != null) {
            var5.method3006((byte) -100, new class303(var4));
        }
        if (arg0 >= 32768) {
            var5.method3007(true);
        }
        this.field3807.method2342((long) arg0, var5, 66);
        return var5;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(J[ILsv;B)Ljava/lang/String;", line = 51)
    public final String method1690(long arg0, int[] arg1, class467 arg2, byte arg3) {
        field3814++;
        if (this.field3817 != null) {
            String var6 = this.field3817.method1124((byte) 33, arg0, arg1, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return arg3 == 51 ? Long.toString(arg0) : null;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILhh;Lhh;Lrj;)V", line = 273)
    public class264(int arg0, class84 arg1, class84 arg2, class419 arg3) {
        this.field3817 = arg3;
        this.field3808 = arg1;
        this.field3809 = arg2;
        if (this.field3808 != null) {
            this.field3805 = this.field3808.method656((byte) 122, 1);
        }
        if (this.field3809 != null) {
            this.field3810 = this.field3809.method656((byte) 122, 1);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIII)V", line = 78)
    public static final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3812++;
        if (~class397.field5830.field116 != arg5 && arg4 != 0 && class420.field6182 < 50 && arg1 != -1) {
            class375.field5603[class420.field6182++] = new class310((byte) 1, arg1, arg4, arg2, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIIILqa;III)V", line = 96)
    public static final void method1692(int arg0, int arg1, int arg2, int arg3, int arg4, class162 arg5, int arg6, int arg7, int arg8) {
        field3813++;
        class232 var9 = (class232) class396.method2468(arg7, arg2, arg6);
        if (var9 != null) {
            class510 var10 = class246.field3567.method609(117, var9.method379((byte) -96));
            int var11 = var9.method375(-13015) & 0x3;
            int var12 = var9.method380(true);
            if (var10.field7465 == -1) {
                int var13 = arg0;
                if (var10.field7491 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1169(-29109, var13, 4, arg3, arg4);
                    } else if (var11 == 1) {
                        arg5.method1173(-127, arg3, var13, 4, arg4);
                    } else if (var11 == 2) {
                        arg5.method1169(-29109, var13, 4, arg3 + 3, arg4);
                    } else if (var11 == 3) {
                        arg5.method1173(-119, arg3, var13, 4, arg4 + 3);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg5.method1175(1, 8, arg3, var13, 1, arg4);
                    } else if (var11 == 1) {
                        arg5.method1175(1, arg1 - 31511, arg3 - -3, var13, 1, arg4);
                    } else if (var11 == 2) {
                        arg5.method1175(1, 8, arg3 + 3, var13, 1, arg4 + 3);
                    } else if (var11 == 3) {
                        arg5.method1175(1, arg1 - 31511, arg3, var13, 1, arg4 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1173(-121, arg3, var13, 4, arg4);
                    } else if (var11 == 1) {
                        arg5.method1169(arg1 - 60628, var13, 4, arg3 + 3, arg4);
                    } else if (var11 == 2) {
                        arg5.method1173(-128, arg3, var13, 4, arg4 + 3);
                    } else if (var11 == 3) {
                        arg5.method1169(-29109, var13, 4, arg3, arg4);
                    }
                }
            } else {
                class331.method2189(var11, var10, (byte) -86, arg4, arg3, arg5);
            }
        }
        class232 var14 = (class232) class51.method372(arg7, arg2, arg6, field3819 == null ? (field3819 = method1694("rq")) : field3819);
        if (var14 != null) {
            class510 var15 = class246.field3567.method609(115, var14.method379((byte) -96));
            int var16 = var14.method375(-13015) & 0x3;
            int var17 = var14.method380(true);
            if (var15.field7465 != -1) {
                class331.method2189(var16, var15, (byte) -86, arg4, arg3, arg5);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field7491 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg5.method1178(arg3, arg4 + 3, arg3 + 3, arg4, false, var18);
                } else {
                    arg5.method1178(arg3, arg4, arg3 + 3, arg4 + 3, false, var18);
                }
            }
        }
        if (arg1 != 31519) {
            method1688(98);
        }
        class232 var19 = (class232) class358.method2310(arg7, arg2, arg6);
        if (var19 == null) {
            return;
        }
        class510 var20 = class246.field3567.method609(115, var19.method379((byte) -96));
        int var21 = var19.method375(-13015) & 0x3;
        if (var20.field7465 != -1) {
            class331.method2189(var21, var20, (byte) -86, arg4, arg3, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BII)V", line = 235)
    public static final void method1693(byte arg0, int arg1, int arg2) {
        field3806++;
        class434 var3 = class483.method2888(arg2, -119, 16);
        var3.method2632((byte) 81);
        var3.field6310 = arg1;
        int var4 = -59 / ((arg0 + 15) / 55);
    }
}
