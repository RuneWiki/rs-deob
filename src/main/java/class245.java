import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class245 extends class276 {

    @OriginalMember(owner = "client!df", name = "eb", descriptor = "I")
    private int field4036 = -1;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[I")
    public static int[] field4018 = new int[50];

    @OriginalMember(owner = "client!df", name = "X", descriptor = "Ljava/lang/String;")
    public static String field4029 = "Opened title screen";

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    private int field4031;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    private int field4034;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Lvh;")
    public static class108 field4028;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[I")
    public static int[] field4021;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[I")
    private int[] field4024;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ZJ)V")
    public static final void method1636(boolean arg0, long arg1) {
        ++field4023;
        if (!arg0) {
            if (arg1 > 0L) {
                if (arg1 % 10L != 0L) {
                    class247.method1653(arg1, -1);
                } else {
                    class247.method1653(arg1 - 1L, -1);
                    class247.method1653(1L, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static final void method1637(int arg0) {
        ++field4032;
        class81.field1430.method58(0);
        class274.field4392.method58(0);
        int var1 = 16 % ((arg0 - -46) / 59);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BZIILdl;)V")
    public static final void method1638(byte arg0, boolean arg1, int arg2, int arg3, class46 arg4) {
        int var5 = arg4.field701;
        ++field4019;
        if (~arg4.field674 != -1) {
            if (arg4.field674 != 1) {
                if (~arg4.field674 == -3) {
                    arg4.field701 = arg4.field688 * arg3 >> 14;
                } else if (~arg4.field674 == -4) {
                    if (arg4.field812 == 2) {
                        arg4.field701 = (arg4.field688 - 1) * arg4.field805 + arg4.field688 * 32;
                    } else if (arg4.field812 == 7) {
                        arg4.field701 = (arg4.field688 + -1) * arg4.field805 + arg4.field688 * 115;
                    }
                }
            } else {
                arg4.field701 = arg3 - arg4.field688;
            }
        } else {
            arg4.field701 = arg4.field688;
        }
        int var6 = arg4.field715;
        if (arg4.field718 == 0) {
            arg4.field715 = arg4.field696;
        } else if (arg4.field718 == 1) {
            arg4.field715 = arg2 - arg4.field696;
        } else if (arg4.field718 != 2) {
            if (~arg4.field718 == -4) {
                if (~arg4.field812 != -3) {
                    if (~arg4.field812 == -8) {
                        arg4.field715 = (arg4.field696 + -1) * arg4.field810 + arg4.field696 * 12;
                    }
                } else {
                    arg4.field715 = (arg4.field696 - 1) * arg4.field810 + arg4.field696 * 32;
                }
            }
        } else {
            arg4.field715 = arg4.field696 * arg2 >> 14;
        }
        if (~arg4.field674 == -5) {
            arg4.field701 = arg4.field728 * arg4.field715 / arg4.field736;
        }
        if (arg4.field718 == 4) {
            arg4.field715 = arg4.field736 * arg4.field701 / arg4.field728;
        }
        if (arg0 == -34) {
            if (class285.field4510 && (~client.method1922(arg4).field3096 != -1 || arg4.field812 == 0)) {
                if (~arg4.field715 > -6 && ~arg4.field701 > -6) {
                    arg4.field715 = 5;
                    arg4.field701 = 5;
                } else {
                    if (~arg4.field715 >= -1) {
                        arg4.field715 = 5;
                    }
                    if (arg4.field701 <= 0) {
                        arg4.field701 = 5;
                    }
                }
            }
            if (arg4.field777 == 1337) {
                class215.field3624 = arg4;
            }
            if (arg1 && arg4.field747 != null) {
                if (~arg4.field701 != ~var5 || arg4.field715 != var6) {
                    class198 var7 = new class198();
                    var7.field3204 = arg4.field747;
                    var7.field3205 = arg4;
                    class28.field426.method374(-1, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (arg0 == 0) {
            this.field4036 = arg1.method677(false);
        }
        ++field4027;
        if (arg2 != -1) {
            method1638((byte) 85, false, 49, 37, (class46) null);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public final void method1065(byte arg0) {
        super.method1065(arg0);
        this.field4024 = null;
        ++field4025;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1639(byte arg0, int arg1) {
        int var2 = 88 / ((-42 - arg0) / 53);
        ++field4033;
        return ~class93.field1636[arg1].length() < -1 ? class93.field1632[arg1] + class42.field618 + class93.field1636[arg1] : class93.field1632[arg1];
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)V")
    public static void method1640(int arg0) {
        field4021 = null;
        if (arg0 == 4) {
            field4028 = null;
            field4018 = null;
            field4029 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)[[I")
    public final int[][] method300(int arg0, int arg1) {
        ++field4022;
        if (arg1 != -1) {
            method1637(61);
        }
        int[][] var3 = super.field4418.method835((byte) 106, arg0);
        if (super.field4418.field2164 && this.method1642(true)) {
            int[] var4 = var3[0];
            int var5 = (~class209.field3540 != ~this.field4031 ? this.field4031 * arg0 / class209.field3540 : arg0) * this.field4034;
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class53.field929 == ~this.field4034) {
                for (int var8 = 0; ~var8 > ~class53.field929; ++var8) {
                    int var9 = this.field4024[var5++];
                    var7[var8] = class113.method791(4080, var9 << 4);
                    var6[var8] = class113.method791(4080, var9 >> 4);
                    var4[var8] = class113.method791(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; class53.field929 > var10; ++var10) {
                    int var11 = this.field4034 * var10 / class53.field929;
                    int var12 = this.field4024[var5 - -var11];
                    var7[var10] = class113.method791(255, var12) << 4;
                    var6[var10] = class113.method791(65280, var12) >> 4;
                    var4[var10] = class113.method791(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, false);
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(II)Ldh;")
    public static final class147 method1641(int arg0, int arg1) {
        ++field4035;
        class147 var2 = (class147) class60.field1032.method3(32, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class10.field147.method746(arg0, (byte) -128, 26);
            class147 var4 = new class147();
            if (arg1 != -3) {
                field4018 = null;
            }
            if (var3 != null) {
                var4.method1017((byte) -9, new class101(var3));
            }
            class60.field1032.method4(0, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)Z")
    private final boolean method1642(boolean arg0) {
        if (!arg0) {
            field4018 = null;
        }
        ++field4020;
        if (this.field4024 != null) {
            return true;
        } else if (~this.field4036 <= -1) {
            int var2 = class53.field929;
            int var3 = class209.field3540;
            int var4 = !class133.field2310.method1104((byte) -89, this.field4036).field2034 ? 128 : 64;
            this.field4024 = class133.field2310.method1105(var4, false, this.field4036, var4, -75, 1.0F);
            this.field4031 = var4;
            this.field4034 = var4;
            class29.method192(var3, (byte) -117, var2);
            return this.field4024 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
    public final int method1643(byte arg0) {
        ++field4030;
        if (arg0 < 86) {
            this.field4036 = -71;
        }
        return this.field4036;
    }
}
