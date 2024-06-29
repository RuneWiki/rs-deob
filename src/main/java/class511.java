import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class511 extends class463 implements class55 {

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Leo;")
    public class193 field7508;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "Z")
    private boolean field7499;

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "I")
    public static int field7503 = -60;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "Ljm;")
    public static class485 field7516 = new class485(40, -1);

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "Luf;")
    public static class310 field7517 = new class310(68, 16);

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field7520 = -1;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "Luf;")
    public static class310 field7518 = new class310(18, 5);

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!cm", name = "E", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "Lvh;")
    public static class240 field7519;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 4)
    public final void method361(int arg0) {
        int var2 = -52 % ((-36 - arg0) / 36);
        ++field7507;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BILjava/lang/String;)V", line = 13)
    public static final void method2999(byte arg0, int arg1, String arg2) {
        ++field7501;
        class163 var3 = class271.method1546(arg1, 3, true);
        if (arg0 < 8) {
            method3000((byte) 70);
        }
        var3.method1017(0);
        var3.field2326 = arg2;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V", line = 27)
    public static final void method3000(byte arg0) {
        if (arg0 >= 117) {
            ++field7510;
            class386 var1 = (class386) class192.field2700.method3072((byte) 15);
            boolean var2 = class292.field3914 != null || ~class78.field1127 < -1;
            if (var2) {
                class13.field147 = 1;
            }
            if (class483.field7095 && class488.field7125.method1212(-1, 81) && ~class370.field5198 < -3) {
                if (!var2) {
                    class299.method1711(false, (class149) class260.field3585.field7697.field7339.field7339, var1.method2220(-1243743073), var1.method2221(-3));
                } else {
                    class173.field2480 = (class149) class260.field3585.field7697.field7339.field7339;
                }
            } else if (!var2) {
                class299.method1711(false, (class149) class260.field3585.field7697.field7339, var1.method2220(-1243743073), var1.method2221(-3));
            } else {
                class173.field2480 = (class149) class260.field3585.field7697.field7339;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lqa;I)Lip;", line = 62)
    public final class498 method402(class162 arg0, int arg1) {
        ++field7505;
        class121 var3 = this.field7508.method1175(43, true, super.field6735, 2048, super.field6725, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class415 var4 = arg0.method539();
            if (arg1 != 16562) {
                this.method357(-22, (class162) null);
            }
            var4.method340(super.field6735 + super.field6719, super.field6723, super.field6731 + super.field6725);
            class498 var5 = null;
            if (this.field7499) {
                var5 = class227.method1338(0, 1);
            }
            if (this.field7508.field2779 != null) {
                class148 var6 = this.field7508.field2779.method1260();
                arg0.method512(var3, var6, var4, var5 != null ? var5.field7332[0] : null, 0);
            } else {
                var3.method781(var4, var5 != null ? var5.field7332[0] : null, 0);
            }
            int var7 = super.field6735 >> 7;
            int var8 = super.field6725 >> 7;
            this.field7508.method1173(22869, var7, arg0, var3, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)I", line = 104)
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            this.method356(25, (class162) null);
        }
        ++field7506;
        return this.field7508.field2764;
    }

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)I", line = 117)
    public final int method1837(int arg0) {
        ++field7500;
        if (arg0 > -53) {
            this.method400(-2, (class162) null);
        }
        return this.field7508.method1172(0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)I", line = 129)
    public final int method355(int arg0) {
        if (arg0 != 13599) {
            method3000((byte) -86);
        }
        ++field7513;
        return this.field7508.field2759;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILqa;)Lc;", line = 141)
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            field7503 = -106;
        }
        ++field7515;
        return this.field7508.method1175(86, false, 0, arg1, 0, arg2, false);
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)Z", line = 156)
    public final boolean method360(int arg0) {
        if (arg0 < 34) {
            field7503 = -16;
        }
        ++field7502;
        return this.field7508.method1180(true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)I", line = 168)
    public final int method354(byte arg0) {
        ++field7504;
        int var2 = -128 % ((arg0 - 61) / 53);
        return this.field7508.field2780;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lqa;Lpk;IIIIIZIIIIII)V", line = 179)
    public class511(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class4.method29(arg12, false, arg11));
        this.field7508 = new class193(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field7499 = ~arg1.field1850 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(ILqa;)V", line = 192)
    public final void method400(int arg0, class162 arg1) {
        ++field7511;
        class121 var3 = this.field7508.method1175(91, true, super.field6735, 262144, super.field6725, arg1, false);
        int var4 = 9 % ((-29 - arg0) / 33);
        if (var3 != null) {
            int var5 = super.field6735 >> 7;
            int var6 = super.field6725 >> 7;
            this.field7508.method1173(22869, var5, arg1, var3, false, var5, var6, var6);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILqa;)V", line = 213)
    public final void method356(int arg0, class162 arg1) {
        if (arg0 < 100) {
            method3000((byte) 25);
        }
        this.field7508.method1177(arg1, -29962);
        ++field7514;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILqa;)V", line = 226)
    public final void method357(int arg0, class162 arg1) {
        this.field7508.method1176(262144, arg1);
        if (arg0 < 41) {
            field7519 = null;
        }
        ++field7512;
    }

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "(B)V", line = 237)
    public static void method3001(byte arg0) {
        field7516 = null;
        field7518 = null;
        field7517 = null;
        field7519 = null;
        if (arg0 != -80) {
            method3000((byte) -19);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lqa;III)Z", line = 254)
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field7509;
        if (arg2 != 24130) {
            this.method360(71);
        }
        class121 var5 = this.field7508.method1175(108, false, super.field6735, 131072, super.field6725, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            class415 var6 = arg0.method539();
            var6.method340(super.field6735 + super.field6719, super.field6723, super.field6731 + super.field6725);
            return var5.method777(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZB)V", line = 275)
    public static final void method3002(int arg0, boolean arg1, byte arg2) {
        if (arg2 == -119) {
            ++field7498;
            class113 var3 = class223.method1313(arg1, arg2 + -2147483529, arg0);
            if (var3 != null) {
                var3.method2946(-108);
            }
        }
    }
}
