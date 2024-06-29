import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class137 extends class114 {

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    private int field1871 = 204;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    private int field1872 = 1;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    private int field1879 = 1;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field1873 = 99;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "Z")
    public static boolean field1876 = false;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field1877 = new String[500];

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "[I")
    public static int[] field1869;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field1880;
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field1630.method302(arg0, -121);
            if (super.field1630.field710) {
                for (int var4 = 0; class145.field2009 > var4; ++var4) {
                    int var5 = class99.field1434[var4];
                    int var6 = this.field1879 * var5 >> 12;
                    int var7 = class159.field2209[arg0];
                    int var8 = var5 % (4096 / this.field1879) * this.field1879;
                    int var9 = this.field1872 * var7 >> 12;
                    int var10 = var7 % (4096 / this.field1872) * this.field1872;
                    if (~var10 > ~this.field1871) {
                        for (var6 -= var9; var6 < 0; var6 += 4) {
                        }
                        while (var6 > 3) {
                            var6 -= 4;
                        }
                        if (~var6 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field1871 < ~var8) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~this.field1871 < ~var8) {
                        int var11;
                        for (var11 = var6 - var9; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
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

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIBI)V")
    public static final void method860(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (int var5 = 0; ~class261.field4206 < ~var5; ++var5) {
            if (class78.field1092[var5] - -class112.field1611[var5] > arg4 && ~(arg1 + arg4) < ~class78.field1092[var5] && ~arg2 > ~(class82.field1135[var5] + class282.field4496[var5]) && ~class82.field1135[var5] > ~(arg2 - -arg0)) {
                class30.field459[var5] = true;
            }
        }
        if (arg3 <= 73) {
            field1869 = null;
        }
        ++field1875;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method861(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field1868;
        class178 var7 = class14.method96(-1, arg0, arg6);
        if (var7 != null && var7.field2690 != null) {
            class272 var8 = new class272();
            var8.field4340 = var7.field2690;
            var8.field4337 = var7;
            class160.method994((byte) -112, var8);
        }
        class202.field3052 = arg4;
        class121.field1729 = arg3;
        class193.field2950 = true;
        class8.field94 = arg2;
        class142.field1952 = arg0;
        class195.field2994 = arg6;
        class43.field645 = arg1;
        if (arg5 > -61) {
            method863((Random) null, (byte) -9, 51);
        }
        class312.method2108(false, var7);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lvd;)V")
    public static final void method862(class160 arg0) {
        for (int var1 = arg0.field2234; var1 <= arg0.field2224; ++var1) {
            for (int var2 = arg0.field2229; var2 <= arg0.field2228; ++var2) {
                class91 var3 = class246.field3856[arg0.field2221][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1343; ++var4) {
                        if (var3.field1339[var4] == arg0) {
                            --var3.field1343;
                            for (int var5 = var4; var5 < var3.field1343; ++var5) {
                                var3.field1339[var5] = var3.field1339[var5 + 1];
                                var3.field1342[var5] = var3.field1342[var5 + 1];
                            }
                            var3.field1339[var3.field1343] = null;
                            break;
                        }
                    }
                    var3.field1336 = 0;
                    for (int var6 = 0; var6 < var3.field1343; ++var6) {
                        var3.field1336 |= var3.field1342[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/util/Random;BI)I")
    public static final int method863(Random arg0, byte arg1, int arg2) {
        ++field1874;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class49.method303(67, arg2)) {
            return (int) ((4294967295L & (long) arg0.nextInt()) * (long) arg2 >> 32);
        } else {
            int var3 = -((int) (4294967296L % (long) arg2)) + Integer.MIN_VALUE;
            if (arg1 < 55) {
                return 107;
            } else {
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (var3 <= var4);
                return class149.method930(var4, arg2, (byte) -110);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.field1871 = 50;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field1871 = arg0.method1379(-78);
                }
            } else {
                this.field1872 = arg0.method1374((byte) -60);
            }
        } else {
            this.field1879 = arg0.method1374((byte) -60);
        }
        ++field1878;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
    public class137() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
    public static void method864(int arg0) {
        if (arg0 == 4) {
            field1877 = null;
            field1869 = null;
        }
    }
}
