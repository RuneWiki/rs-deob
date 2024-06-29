import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class211 extends class23 {

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    private int field4003 = 1;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    private int field4010 = 204;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    private int field3998 = 1;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lid;")
    public static class92 field4000 = new class92(64);

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "[Z")
    public static boolean[] field4007 = new boolean[100];

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field4006 = 0;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "Li;")
    private static class88 field4008 = class208.method1425(105, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "Li;")
    public static class88 field4009 = field4008;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)[I")
    public final int[] method54(int arg0, byte arg1) {
        ++field3997;
        int[] var3 = super.field379.method1080(false, arg0);
        if (arg1 < 19) {
            return null;
        } else {
            if (super.field379.field3100) {
                for (int var4 = 0; ~var4 > ~class70.field1276; ++var4) {
                    int var5 = class22.field351[var4];
                    int var6 = class111.field2023[arg0];
                    int var7 = this.field3998 * var5 >> 12;
                    int var8 = this.field4003 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3998) * this.field3998;
                    int var10 = var6 % (4096 / this.field4003) * this.field4003;
                    if (~var10 > ~this.field4010) {
                        for (var7 -= var8; var7 < 0; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var9 < this.field4010) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (this.field4010 > var9) {
                        int var11;
                        for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lea;II)V")
    public final void method11(class46 arg0, int arg1, int arg2) {
        ++field3996;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4010 = arg0.method301(67);
                }
            } else {
                this.field4003 = arg0.method347(arg1 ^ -26118);
            }
        } else {
            this.field3998 = arg0.method347(26119);
        }
        if (arg1 != -3) {
            this.method54(103, (byte) 83);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)I")
    public static final int method1441(int arg0, int arg1, byte arg2) {
        if (arg2 != -65) {
            return 52;
        } else {
            ++field4001;
            if (~arg1 > ~arg0) {
                int var3 = arg1;
                arg1 = arg0;
                arg0 = var3;
            }
            while (~arg0 != -1) {
                int var4 = arg1 % arg0;
                arg1 = arg0;
                arg0 = var4;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method1442(byte arg0) {
        field4009 = null;
        field4000 = null;
        int var1 = -97 % ((-17 - arg0) / 36);
        field4008 = null;
        field4007 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IZ)I")
    public static final int method1443(int arg0, boolean arg1) {
        ++field4004;
        if (!arg1) {
            field4009 = null;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(II)Li;")
    public static final class88 method1444(int arg0, int arg1) {
        ++field3999;
        if (arg0 > -36) {
            return null;
        } else {
            return ~arg1 > -1000000000 ? class170.method1214(arg1, -124) : class3.field40;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILnb;Lnb;)V")
    public static final void method1445(int arg0, class144 arg1, class144 arg2) {
        int var3 = 68 % ((arg0 - 26) / 61);
        class141.field2609 = arg1;
        class59.field1114 = arg2;
        ++field4002;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lu;I)V")
    public static final void method1446(class218 arg0, int arg1) {
        if (~class117.field2115 == ~arg0.field4132 || ~arg0.field4079 == 0 || ~arg0.field4142 != -1 || ~(arg0.field4100 + 1) < ~class15.method75(arg0.field4079, (byte) -123).field1992[arg0.field4103]) {
            int var2 = -arg0.field4135 + class117.field2115;
            int var3 = arg0.field4115 * 128 + arg0.field4105 * 64;
            int var4 = arg0.field4132 - arg0.field4135;
            int var5 = arg0.field4096 * 128 - -(arg0.field4105 * 64);
            int var6 = arg0.field4102 * 128 - -(arg0.field4105 * 64);
            int var7 = arg0.field4105 * 64 + arg0.field4074 * 128;
            arg0.field4123 = ((var4 - var2) * var5 - -(var2 * var7)) / var4;
            arg0.field4138 = ((-var2 + var4) * var3 - -(var2 * var6)) / var4;
        }
        arg0.field4110 = 0;
        if (arg1 != -1) {
            method1442((byte) 0);
        }
        ++field3995;
        if (arg0.field4141 == 0) {
            arg0.field4121 = 1024;
        }
        if (arg0.field4141 == 1) {
            arg0.field4121 = 1536;
        }
        if (~arg0.field4141 == -3) {
            arg0.field4121 = 0;
        }
        if (~arg0.field4141 == -4) {
            arg0.field4121 = 512;
        }
        arg0.field4087 = arg0.field4121;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(II)Z")
    public static final boolean method1447(int arg0, int arg1) {
        ++field4005;
        if (class167.field3213[arg1]) {
            return true;
        } else if (!class85.field1545.method972(arg1, (byte) -68)) {
            return false;
        } else {
            int var2 = class85.field1545.method944(128, arg1);
            if (arg0 == var2) {
                class167.field3213[arg1] = true;
                return true;
            } else {
                if (class78.field1418[arg1] == null) {
                    class78.field1418[arg1] = new class174[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class78.field1418[arg1][var3] == null) {
                        byte[] var4 = class85.field1545.method941((byte) 56, var3, arg1);
                        if (var4 != null) {
                            class78.field1418[arg1][var3] = new class174();
                            class78.field1418[arg1][var3].field3425 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                class78.field1418[arg1][var3].method1252((byte) 55, new class46(var4));
                            } else {
                                class78.field1418[arg1][var3].method1257(-119, new class46(var4));
                            }
                        }
                    }
                }
                class167.field3213[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class211() {
        super(0, true);
    }
}
