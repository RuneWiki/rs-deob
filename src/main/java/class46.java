import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class46 extends class457 {

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "F")
    public static float field749 = 0.25F;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "Llo;")
    public static class306 field752 = new class306("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "[I")
    public static int[] field757 = new int[16384];

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
    public static int[] field755 = new int[16384];

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public static boolean field746;

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[Lo;")
    public static class138[] field741;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field757[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field755[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IIIIIII)V", line = 3)
    public class46(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field750 = arg2;
        this.field742 = arg1;
        this.field745 = arg0;
        this.field748 = arg3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 14)
    public static void method327(int arg0) {
        field752 = null;
        int var1 = -36 / ((-34 - arg0) / 52);
        field755 = null;
        field741 = null;
        field757 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZII)V", line = 28)
    public final void method328(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field742 = -101;
        }
        ++field744;
        int var4 = this.field745 * arg1 >> 12;
        int var5 = this.field750 * arg1 >> 12;
        int var6 = this.field742 * arg2 >> 12;
        int var7 = this.field748 * arg2 >> 12;
        class402.method2493(var6, var7, var4, var5, (byte) 39, super.field6806);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILou;IIB)V", line = 51)
    public static final void method329(int arg0, class197 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -122) {
            method333(-29, (class284) null, -57);
        }
        ++field751;
        class49 var5 = arg1.method1308(-13076);
        int var6 = 16383 & -arg1.field3087.field5264 + arg1.field3104;
        if (arg3 == -1) {
            if (var6 == 0 && arg1.field3133 <= 25) {
                if (!arg1.field3111 || !var5.method355(arg1.field3078, (byte) -96)) {
                    arg1.field3078 = var5.method354((byte) -30);
                    arg1.field3111 = ~arg1.field3078 != 0;
                }
            } else {
                arg1.field3111 = false;
                if (~arg0 > -1 && ~var5.field786 != 0) {
                    arg1.field3078 = var5.field786;
                } else if (arg0 > 0 && ~var5.field821 != 0) {
                    arg1.field3078 = var5.field821;
                } else {
                    arg1.field3078 = var5.field813;
                }
            }
        } else if (~arg1.field3065 == 0 || var6 < 10240 && ~var6 < -2049) {
            if (~var6 == -1 && arg1.field3133 <= 25) {
                if (~arg3 == -3 && var5.field781 != -1) {
                    arg1.field3078 = var5.field781;
                } else if (~arg3 == -1 && ~var5.field805 != 0) {
                    arg1.field3078 = var5.field805;
                } else {
                    arg1.field3078 = var5.field813;
                }
                arg1.field3111 = false;
            } else {
                if (arg3 == 2 && ~var5.field781 != 0) {
                    if (~arg0 > -1 && var5.field779 != -1) {
                        arg1.field3078 = var5.field779;
                    } else if (arg0 > 0 && var5.field826 != -1) {
                        arg1.field3078 = var5.field826;
                    } else {
                        arg1.field3078 = var5.field781;
                    }
                } else if (arg3 == 0 && ~var5.field805 != 0) {
                    if (arg0 < 0 && var5.field807 != -1) {
                        arg1.field3078 = var5.field807;
                    } else if (~arg0 < -1 && var5.field783 != -1) {
                        arg1.field3078 = var5.field783;
                    } else {
                        arg1.field3078 = var5.field805;
                    }
                } else if (arg0 < 0 && ~var5.field777 != 0) {
                    arg1.field3078 = var5.field777;
                } else if (arg0 > 0 && ~var5.field800 != 0) {
                    arg1.field3078 = var5.field800;
                } else {
                    arg1.field3078 = var5.field813;
                }
                arg1.field3111 = false;
            }
        } else {
            int var7 = 16383 & client.field1180[arg2] + -arg1.field3087.field5264;
            arg1.field3111 = false;
            if (~arg3 == -3 && ~var5.field781 != 0) {
                if (var7 > 2048 && ~var7 >= -6145 && var5.field824 != -1) {
                    arg1.field3078 = var5.field824;
                } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field809 != 0) {
                    arg1.field3078 = var5.field809;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field797 != -1) {
                    arg1.field3078 = var5.field797;
                } else {
                    arg1.field3078 = var5.field781;
                }
            } else if (arg3 == 0 && var5.field805 != -1) {
                if (~var7 < -2049 && ~var7 >= -6145 && var5.field811 != -1) {
                    arg1.field3078 = var5.field811;
                } else if (var7 >= 10240 && ~var7 > -14337 && var5.field772 != -1) {
                    arg1.field3078 = var5.field772;
                } else if (~var7 < -6145 && ~var7 > -10241 && ~var5.field788 != 0) {
                    arg1.field3078 = var5.field788;
                } else {
                    arg1.field3078 = var5.field805;
                }
            } else if (var7 > 2048 && ~var7 >= -6145 && ~var5.field820 != 0) {
                arg1.field3078 = var5.field820;
            } else if (var7 >= 10240 && var7 < 14336 && ~var5.field789 != 0) {
                arg1.field3078 = var5.field789;
            } else if (var7 > 6144 && ~var7 > -10241 && var5.field775 != -1) {
                arg1.field3078 = var5.field775;
            } else {
                arg1.field3078 = var5.field813;
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Lec;I)V", line = 211)
    public static final void method330(byte arg0, class68[] arg1, int arg2) {
        if (arg0 != -68) {
            field741 = null;
        }
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class68 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field1086 == -1) {
                    if (var4.field997 != null) {
                        method330((byte) -68, var4.field997, arg2);
                    }
                    class52 var5 = (class52) class259.field4346.method2516((long) var4.field1059, -1);
                    if (var5 != null) {
                        class462.method2758(98, var5.field841, arg2);
                    }
                }
                if (~arg2 == -1 && var4.field1005 != null) {
                    class483 var6 = new class483();
                    var6.field7101 = var4.field1005;
                    var6.field7100 = var4;
                    class521.method3073(var6);
                }
                if (arg2 == 1 && var4.field1101 != null) {
                    if (~var4.field1152 <= -1) {
                        class68 var7 = class22.method115(7521, var4.field1059);
                        if (var7 == null || var7.field997 == null || ~var4.field1152 <= ~var7.field997.length || var7.field997[var4.field1152] != var4) {
                            continue;
                        }
                    }
                    class483 var8 = new class483();
                    var8.field7101 = var4.field1101;
                    var8.field7100 = var4;
                    class521.method3073(var8);
                }
            }
        }
        ++field747;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZ)V", line = 281)
    public final void method331(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method327(-51);
        }
        ++field754;
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V", line = 291)
    public static final void method332(int arg0) {
        class253.field4307 = new class124(8);
        ++field756;
        class129.field2214 = 0;
        if (arg0 < -38) {
            for (class122 var1 = (class122) class305.field4876.method573(24037); var1 != null; var1 = (class122) class305.field4876.method576(14)) {
                var1.method968();
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILhn;I)V", line = 317)
    public static final void method333(int arg0, class284 arg1, int arg2) {
        ++field743;
        if (class508.field7387) {
            arg2 = 0;
            class508.field7387 = false;
        }
        if (class467.field6940 == null || !class467.field6940.method1851((byte) 124, arg1)) {
            class467.field6940 = arg1;
            class467.field6941 = class19.method91((byte) 116);
            class412.field6262 = arg2;
            class279.field4581 = arg2;
            if (class279.field4581 != 0) {
                class362.field5633 = class135.field2292;
                class495.field7232 = class165.field2614;
                class323.field5062 = class148.field2401;
                class104.field1768 = class507.field7383;
                class41.field683 = class91.field1517;
                class154.field2505 = class59.field913;
                class421.field6363 = class463.field6884;
                class338.field5301 = class295.field4752;
                class468.field6954 = class424.field6387;
                class72.field1244 = class375.field5849;
            } else {
                class289.method1875(arg0 ^ 85);
            }
        }
        if (arg0 != -1) {
            method330((byte) 60, (class68[]) null, -54);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V", line = 367)
    public final void method334(int arg0, int arg1, int arg2) {
        ++field753;
        int var4 = this.field745 * arg1 >> 12;
        int var5 = this.field750 * arg1 >> 12;
        if (arg2 <= 1) {
            this.method334(24, 23, 83);
        }
        int var6 = this.field742 * arg0 >> 12;
        int var7 = this.field748 * arg0 >> 12;
        class391.method2442(var7, var5, var4, super.field6806, -1, var6, super.field6804, super.field6801);
    }
}
