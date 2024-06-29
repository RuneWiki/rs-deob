import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class267 extends class436 implements class265 {

    @OriginalMember(owner = "client!nq", name = "bb", descriptor = "S")
    private short field3762;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "Z")
    private boolean field3742;

    @OriginalMember(owner = "client!nq", name = "V", descriptor = "Z")
    private boolean field3756;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "B")
    private byte field3733;

    @OriginalMember(owner = "client!nq", name = "S", descriptor = "Z")
    private boolean field3753;

    @OriginalMember(owner = "client!nq", name = "T", descriptor = "B")
    private byte field3754;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "B")
    private byte field3744;

    @OriginalMember(owner = "client!nq", name = "R", descriptor = "Z")
    private boolean field3752;

    @OriginalMember(owner = "client!nq", name = "Q", descriptor = "Lmj;")
    public class393 field3751;

    @OriginalMember(owner = "client!nq", name = "Z", descriptor = "Llg;")
    private class238 field3760;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field3743 = 0;

    @OriginalMember(owner = "client!nq", name = "U", descriptor = "Z")
    public static boolean field3755 = false;

    @OriginalMember(owner = "client!nq", name = "db", descriptor = "Z")
    public static boolean field3764 = false;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!nq", name = "K", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!nq", name = "L", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!nq", name = "M", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!nq", name = "N", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!nq", name = "O", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!nq", name = "P", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!nq", name = "X", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!nq", name = "Y", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!nq", name = "ab", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!nq", name = "cb", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!nq", name = "eb", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!nq", name = "fb", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!nq", name = "W", descriptor = "Lam;")
    public static class378 field3757;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field3736;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "(I)V")
    public final void method224(int arg0) {
        int var2 = 106 % ((52 - arg0) / 46);
        ++field3746;
        this.field3753 = false;
        if (this.field3751 != null) {
            this.field3751.method774(-32769 & this.field3751.method720());
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Len;I)V")
    public final void method211(class174 arg0, int arg1) {
        if (arg1 != 0) {
            this.field3754 = 39;
        }
        ++field3739;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Len;B)V")
    public final void method226(class174 arg0, byte arg1) {
        if (arg1 <= 88) {
            this.method208(-15, 54, false, (class174) null);
        }
        ++field3741;
        Object var3 = null;
        class238 var5;
        if (this.field3760 == null && this.field3752) {
            class403 var4 = this.method1703(arg0, 131072, true, (byte) 127);
            var5 = var4 == null ? null : var4.field5879;
        } else {
            var5 = this.field3760;
            this.field3760 = null;
        }
        if (var5 != null) {
            class148.method880(var5, this.field3744, super.field6390, super.field6391, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILen;IBLfs;IZ)V")
    public final void method206(int arg0, class174 arg1, int arg2, byte arg3, class330 arg4, int arg5, boolean arg6) {
        ++field3750;
        if (arg3 != -42) {
            field3737 = 67;
        }
        if (arg4 instanceof class267) {
            class267 var8 = (class267) arg4;
            if (this.field3751 != null && var8.field3751 != null) {
                this.field3751.method726(var8.field3751, arg2, arg0, arg5, arg6);
            }
        } else {
            if (arg4 instanceof class402) {
                class402 var9 = (class402) arg4;
                if (this.field3751 != null && var9.field5860 != null) {
                    this.field3751.method726(var9.field5860, arg2, arg0, arg5, arg6);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IBLen;)Lmj;")
    private final class393 method1700(int arg0, byte arg1, class174 arg2) {
        ++field3732;
        if (this.field3751 != null && ~arg2.method1016(this.field3751.method720(), arg0) == -1) {
            return this.field3751;
        } else {
            if (arg1 != 27) {
                method1701((byte) 57);
            }
            class403 var4 = this.method1703(arg2, arg0, false, (byte) -114);
            return var4 != null ? var4.field5880 : null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public final void method207(byte arg0) {
        if (arg0 == 111) {
            ++field3766;
            if (this.field3751 != null) {
                this.field3751.method752();
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILen;)Lir;")
    public final class19 method213(int arg0, class174 arg1) {
        ++field3759;
        if (this.field3751 == null) {
            return null;
        } else if (arg0 >= -5) {
            return null;
        } else {
            class71 var3 = arg1.method1015();
            var3.method123(super.field6390, super.field6386, super.field6391);
            class19 var4 = null;
            if (this.field3756) {
                var4 = class358.method2286(true, 1);
            }
            this.field3751.method775(var3, var4 != null ? var4.field197[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)I")
    public final int method214(int arg0) {
        if (arg0 > -95) {
            field3737 = -66;
        }
        ++field3758;
        return this.field3733;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I")
    public final int method225(int arg0) {
        ++field3740;
        return arg0 < 66 ? 120 : 65535 & this.field3762;
    }

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)I")
    public final int method210(int arg0) {
        ++field3738;
        if (arg0 != -23890) {
            this.method206(67, (class174) null, 91, (byte) 18, (class330) null, 125, true);
        }
        return this.field3754;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Len;Lnl;IIIIZIIZ)V")
    public class267(class174 arg0, class327 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class192.method1229(-4, arg7, arg8));
        this.field3762 = (short) arg1.field4592;
        this.field3742 = arg6;
        this.field3756 = ~arg1.field4677 != -1;
        super.field6390 = (short) arg3;
        super.field6391 = (short) arg5;
        this.field3733 = (byte) arg8;
        this.field3753 = arg9;
        this.field3754 = (byte) arg7;
        this.field3744 = (byte) arg2;
        this.field3752 = arg0.method963() && arg1.field4625 && !this.field3742 && ~class341.field5022 != -1;
        int var11 = 1024;
        if (this.field3753) {
            var11 |= 32768;
        }
        class403 var12 = this.method1703(arg0, var11, this.field3752, (byte) -32);
        if (var12 != null) {
            this.field3751 = var12.field5880;
            this.field3760 = var12.field5879;
            if (this.field3753) {
                this.field3751 = this.field3751.method717((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BILen;)Lmj;")
    public final class393 method209(byte arg0, int arg1, class174 arg2) {
        if (arg0 != 58) {
            field3743 = 26;
        }
        ++field3748;
        return this.method1700(arg1, (byte) 27, arg2);
    }

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)V")
    public static void method1701(byte arg0) {
        field3757 = null;
        if (arg0 == 2) {
            field3736 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Len;I)V")
    public static final void method1702(class174 arg0, int arg1) {
        ++field3763;
        if (~class433.field6324 <= -3 || class423.field6070 != 0 || class271.field3842) {
            String var2;
            if (class423.field6070 == 1 && ~class433.field6324 > -3) {
                var2 = class179.field2467 + class21.field225 + class318.field4526 + " ->";
            } else if (class271.field3842 && class433.field6324 < 2) {
                var2 = class110.field1275 + class21.field225 + class75.field825 + " ->";
            } else if (class406.field5900 && class256.field3447[81] && ~class433.field6324 < -3) {
                var2 = class237.method1514(arg1 + -13918, (class159) class32.field301.field2358.field5247.field5247);
            } else {
                class159 var3 = (class159) class32.field301.field2358.field5247;
                var2 = class237.method1514(arg1 + -13918, var3);
                int[] var4 = null;
                if (class172.method1139(arg1 ^ 940, var3.field2257)) {
                    var4 = class392.method2498((int) var3.field2259, -119).field3569;
                } else if (class111.method613(-13, var3.field2257)) {
                    class358 var5 = class81.field917[(int) var3.field2259];
                    if (var5 != null) {
                        var4 = var5.field5229.field4969;
                    }
                } else if (class77.method438(-8, var3.field2257)) {
                    if (~var3.field2257 == -1003) {
                        var4 = class157.method1036(0, (int) var3.field2259).field4671;
                    } else {
                        var4 = class157.method1036(0, (int) (2147483647L & var3.field2259 >>> 32)).field4671;
                    }
                }
                if (var4 != null) {
                    var2 = var2 + class245.method1551(var4, -1);
                }
            }
            if (~class433.field6324 < -3) {
                var2 = var2 + "<col=ffffff> / " + (class433.field6324 + -2) + class12.field132;
            }
            if (arg1 == -1003) {
                if (class133.field1840 != null) {
                    class196 var6 = class133.field1840.method670((byte) -89, arg0);
                    if (var6 == null) {
                        var6 = class287.field4059;
                    }
                    var6.method1244(192, class314.field4468, class133.field1840.field1557, class133.field1840.field1498, class133.field1840.field1486, class133.field1840.field1552, class133.field1840.field1516, class382.field5611, var2, class37.field375, class367.field5366, class75.field833, class291.field4181, class133.field1840.field1489, class386.field5650);
                    class334.method2144(class291.field4181[1], (byte) -64, class291.field4181[0], class291.field4181[3], class291.field4181[2]);
                } else if (class200.field2736 != null && ~class136.field1912 == -1) {
                    int var7 = class287.field4059.method1247(-77, class386.field5650, class37.field375, var2, class30.field273 + 16, 16777215, 0, class314.field4468, class367.field5366, class223.field3051 - -4);
                    class334.method2144(class30.field273, (byte) -64, class223.field3051 + 4, 16, class268.field3775.method1748(var2, -75) + var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIZLen;)Z")
    public final boolean method208(int arg0, int arg1, boolean arg2, class174 arg3) {
        ++field3735;
        if (!arg2) {
            return true;
        } else {
            class393 var5 = this.method1700(65536, (byte) 27, arg3);
            if (var5 != null) {
                class71 var6 = arg3.method1015();
                var6.method123(super.field6390, super.field6386, super.field6391);
                return var5.method724(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Len;IZB)Lgi;")
    private final class403 method1703(class174 arg0, int arg1, boolean arg2, byte arg3) {
        ++field3745;
        class327 var5 = class157.method1036(0, 65535 & this.field3762);
        int var6 = -44 % ((32 - arg3) / 46);
        class319 var7;
        class319 var8;
        if (!this.field3742) {
            var7 = class78.field887[this.field3744];
            if (this.field3744 >= 3) {
                var8 = null;
            } else {
                var8 = class78.field887[this.field3744 + 1];
            }
        } else {
            var8 = class78.field887[0];
            var7 = class111.field1285[this.field3744];
        }
        return var5.method2015(super.field6386, var8, this.field3733, this.field3754, arg2, super.field6390, arg1, arg0, -91, var7, super.field6391);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        if (arg0 >= -92) {
            this.field3752 = true;
        }
        ++field3765;
        return this.field3752;
    }

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "(I)Z")
    public final boolean method217(int arg0) {
        ++field3734;
        int var2 = -49 / ((-60 - arg0) / 37);
        return this.field3753;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BLen;)V")
    public final void method212(byte arg0, class174 arg1) {
        if (arg0 >= -29) {
            this.method1703((class174) null, 52, true, (byte) -63);
        }
        ++field3747;
        Object var3 = null;
        class238 var5;
        if (this.field3760 == null && this.field3752) {
            class403 var4 = this.method1703(arg1, 131072, true, (byte) -113);
            var5 = var4 != null ? var4.field5879 : null;
        } else {
            var5 = this.field3760;
            this.field3760 = null;
        }
        if (var5 != null) {
            class190.method1219(var5, this.field3744, super.field6390, super.field6391, (boolean[]) null);
        }
    }
}
