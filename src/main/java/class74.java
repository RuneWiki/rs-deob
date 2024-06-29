import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class74 extends class224 {

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    private int field1048 = 10;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field1042 = 0;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    private int field1055 = 2048;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "[I")
    private int[] field1043;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "[I")
    private int[] field1057;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "[[[I")
    public static int[][][] field1044;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)[B")
    public static final byte[] method502(int arg0, int arg1) {
        ++field1049;
        class280 var2 = (class280) class64.field896.method765((long) arg0, 0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class80.method557(var7, var4, true);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class280(var3);
            class64.field896.method763(96, var2, (long) arg0);
        }
        int var10 = -73 / ((arg1 - 82) / 44);
        return var2.field4434;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field1053;
        if (arg2 > -46) {
            field1044 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field1042 = arg0.method201(255);
                }
            } else {
                this.field1055 = arg0.method190(-3);
            }
        } else {
            this.field1048 = arg0.method201(255);
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method503(int arg0) {
        field1044 = null;
        if (arg0 != 0) {
            method509(38, -103);
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
    private final void method504(int arg0) {
        int var2 = 0;
        this.field1057 = new int[this.field1048 + 1];
        this.field1043 = new int[this.field1048 + 1];
        ++field1054;
        int var3 = 4096 / this.field1048;
        int var4 = this.field1055 * var3 >> 12;
        for (int var5 = 0; ~this.field1048 < ~var5; ++var5) {
            this.field1057[var5] = var2;
            this.field1043[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1057[this.field1048] = 4096;
        this.field1043[this.field1048] = this.field1043[arg0] + 4096;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)I")
    public static final int method505(int arg0, int arg1, int arg2) {
        ++field1046;
        int var3 = class18.method127(arg0 + 45365, 0, arg1 + 91923, 4) + -128 - (-(-128 + class18.method127(arg0 + 10294, 0, arg1 - -37821, 2) >> 1) + -(class18.method127(arg0, 0, arg1, 1) - 128 >> 2));
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg2 != -21087) {
            field1058 = -68;
        }
        if (~var4 > -11) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method506(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != 6) {
            return null;
        } else {
            ++field1045;
            if (arg0.equals("B")) {
                return Byte.TYPE;
            } else if (arg0.equals("I")) {
                return Integer.TYPE;
            } else if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else {
                return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 > -4) {
            method502(-83, -37);
        }
        this.method504(0);
        ++field1056;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIII)V")
    public static final void method507(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field1047;
        if (method509(arg2, 0)) {
            class176.method1229(arg0, arg3, arg1, (byte) -14, arg4, class104.field1608[arg2]);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            this.method14(42, true);
        }
        ++field1050;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class251.field4018[arg0];
            if (~this.field1042 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1048; ++var6) {
                    if (~var4 <= ~this.field1057[var6] && ~this.field1057[var6 - -1] < ~var4) {
                        if (var4 < this.field1043[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class196.method1356(var3, 0, class78.field1108, var5);
            } else {
                for (int var7 = 0; ~class78.field1108 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class243.field3893[var7];
                    int var11 = this.field1042;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 - 4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field1048 > var12; ++var12) {
                        if (~var8 <= ~this.field1057[var12] && ~var8 > ~this.field1057[var12 + 1]) {
                            if (var8 < this.field1043[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
    public static final void method508(boolean arg0, boolean arg1) {
        if (!arg0) {
            method507(-111, true, 39, -49, 61);
        }
        ++field1052;
        byte var2 = 4;
        byte[][] var3 = class207.field3240;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class10.method63(13371);
            for (int var5 = 0; var5 < 13; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    int var7 = class75.field1061[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = 3 & var7 >> 24;
                        if (!arg1 || var8 == 0) {
                            int var9 = (6 & var7) >> 1;
                            int var10 = (var7 & 16772235) >> 14;
                            int var11 = (16383 & var7) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; class154.field2295.length > var13; ++var13) {
                                if (~class154.field2295[var13] == ~var12 && var3[var13] != null) {
                                    class237.method1608((var10 & 7) * 8, class290.field4574, (var11 & 7) * 8, var4, arg1, var6 * 8, var3[var13], var8, var5 * 8, 98, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(II)Z")
    public static final boolean method509(int arg0, int arg1) {
        ++field1051;
        if (class3.field33[arg0]) {
            return true;
        } else if (!class143.field2099.method823(arg0, arg1 ^ -8069)) {
            return false;
        } else {
            int var2 = class143.field2099.method820(arg0, 112);
            if (arg1 == var2) {
                class3.field33[arg0] = true;
                return true;
            } else {
                if (class104.field1608[arg0] == null) {
                    class104.field1608[arg0] = new class214[var2];
                }
                for (int var3 = 0; ~var2 < ~var3; ++var3) {
                    if (class104.field1608[arg0][var3] == null) {
                        byte[] var4 = class143.field2099.method807((byte) 96, var3, arg0);
                        if (var4 != null) {
                            class214 var5 = class104.field1608[arg0][var3] = new class214();
                            var5.field3474 = (arg0 << 16) - -var3;
                            if (var4[0] == -1) {
                                var5.method1446((byte) -113, new class25(var4));
                            } else {
                                var5.method1442(arg1 + -21714, new class25(var4));
                            }
                        }
                    }
                }
                class3.field33[arg0] = true;
                return true;
            }
        }
    }
}
