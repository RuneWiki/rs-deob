import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class516 extends class128 implements class332 {

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    private int field7282;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Lrg;")
    public static class548 field7278 = new class548(60, 11);

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field7280;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Ldj;")
    public static class287 field7284;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ldn;")
    public static class438 field7285;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public static final void method2956(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field7279;
        if (arg3 >= 48) {
            int var5 = 0;
            int var6 = arg4;
            int var7 = -arg4;
            int var8 = -1;
            int var9 = class536.method3056(class592.field8588, 121, arg0 + arg4, class470.field6589);
            int var10 = class536.method3056(class592.field8588, 126, arg0 - arg4, class470.field6589);
            class62.method363(var9, -128, arg2, class328.field4287[arg1], var10);
            while (~var6 < ~var5) {
                var8 += 2;
                var7 += var8;
                if (~var7 < -1) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = -var6 + arg1;
                    int var12 = arg1 - -var6;
                    if (class563.field8282 <= var12 && class271.field3513 >= var11) {
                        int var13 = class536.method3056(class592.field8588, 118, arg0 + var5, class470.field6589);
                        int var14 = class536.method3056(class592.field8588, 116, -var5 + arg0, class470.field6589);
                        if (var12 <= class271.field3513) {
                            class62.method363(var13, -128, arg2, class328.field4287[var12], var14);
                        }
                        if (~class563.field8282 >= ~var11) {
                            class62.method363(var13, -127, arg2, class328.field4287[var11], var14);
                        }
                    }
                }
                ++var5;
                int var15 = -var5 + arg1;
                int var16 = arg1 + var5;
                if (~var16 <= ~class563.field8282 && class271.field3513 >= var15) {
                    int var17 = class536.method3056(class592.field8588, 119, arg0 - -var6, class470.field6589);
                    int var18 = class536.method3056(class592.field8588, 119, -var6 + arg0, class470.field6589);
                    if (~class271.field3513 <= ~var16) {
                        class62.method363(var17, -128, arg2, class328.field4287[var16], var18);
                    }
                    if (~class563.field8282 >= ~var15) {
                        class62.method363(var17, -127, arg2, class328.field4287[var15], var18);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII[B)V")
    public static final void method2957(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field7277;
        if (~arg0 > ~arg4) {
            int var6 = arg0 + arg1;
            int var7 = arg4 - arg0 >> 2;
            while (true) {
                --var7;
                if (var7 < 0) {
                    int var8 = 3 & -arg0 + arg4;
                    while (true) {
                        --var8;
                        if (~var8 > -1) {
                            if (arg2 >= -68) {
                                method2958(27);
                                return;
                            } else {
                                return;
                            }
                        }
                        arg5[var6++] = 1;
                    }
                }
                arg5[var6++] = 1;
                arg5[var6++] = 1;
                arg5[var6++] = 1;
                arg5[var6++] = 1;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public static void method2958(int arg0) {
        if (arg0 != -5979) {
            method2956(75, -45, -35, 50, -35);
        }
        field7285 = null;
        field7278 = null;
        field7284 = null;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (arg0 != 1) {
            this.method1862(-44, 57, (byte[]) null, -17);
        }
        ++field7287;
        super.field1580.method3125((byte) 89, this);
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)J")
    public final long method1864(int arg0) {
        if (arg0 != -12077) {
            method2957(-44, -84, -106, 8, -16, (byte[]) null);
        }
        ++field7280;
        return 0L;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(JZIII)Ljava/lang/String;")
    public static final String method2959(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field7288;
        char var6 = (char) arg3;
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (~arg2 == -3) {
            var7 = 160;
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; ~arg4 < ~var10; ++var10) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (48 - ((int) arg0 * 10 + -var11)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (-((int) arg0 * 10) + 48 + var13));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                ++var12;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
    public final int method1861(int arg0) {
        ++field7283;
        if (arg0 != 23554) {
            this.method1861(-49);
        }
        return super.field1579;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lmh;I[BIZ)V")
    public class516(class537 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7282 = arg1;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)I")
    public final int method1863(int arg0) {
        ++field7286;
        if (arg0 != -22966) {
            method2957(108, 65, 75, 60, 47, (byte[]) null);
        }
        return this.field7282;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II[BI)V")
    public final void method1862(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method727(arg1, arg2, 35040);
        ++field7281;
        if (arg0 == -32036) {
            this.field7282 = arg3;
        }
    }

    static {
        new class180("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }
}
