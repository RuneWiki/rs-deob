import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class540 extends class354 {

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "I")
    public static volatile int field7482 = -1;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Ljava/lang/String;")
    public static String field7475;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7485;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "Lkg;")
    public static class275 field7487;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)V")
    public static final void method3095(byte arg0) {
        class742.field10360 = new class268[50];
        ++field7483;
        if (arg0 == -30) {
            class3.field26 = 0;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILwo;)V")
    public class540(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)I")
    public static final int method3096(int arg0) {
        ++field7481;
        if (~class528.field7363 == -1) {
            class649.field8986.method3641(new class633("jaclib"), -16421);
            if (class649.field8986.method3637(true).method1248(27076) != 100) {
                return 1;
            }
            if (!((class633) class649.field8986.method3637(true)).method3548(97)) {
                class654.field9104.method2728(-119);
            }
            class528.field7363 = 1;
        }
        if (class528.field7363 == 1) {
            class651.field9063 = class649.method3643((byte) -65);
            class649.field8975.method3641(new class281(class234.field3059), -16421);
            class649.field8987.method3641(new class633("jaggl"), -16421);
            class649.field8988.method3641(new class633("jagdx"), arg0 ^ -4957);
            class649.field8989.method3641(new class633("jagmisc"), -16421);
            class649.field8990.method3641(new class633("sw3d"), -16421);
            class649.field8991.method3641(new class633("hw3d"), -16421);
            class649.field8992.method3641(new class633("jagtheora"), -16421);
            class649.field8993.method3641(new class281(class168.field2329), -16421);
            class649.field8994.method3641(new class281(class571.field8044), -16421);
            class649.field8995.method3641(new class281(class531.field7380), -16421);
            class649.field8996.method3641(new class281(class625.field8599), arg0 + -37789);
            class649.field8997.method3641(new class281(class627.field8636), arg0 + -37789);
            class649.field8998.method3641(new class281(class155.field2129), -16421);
            class649.field8999.method3641(new class281(class560.field7904), arg0 + -37789);
            class649.field9000.method3641(new class281(class88.field1224), -16421);
            class649.field9001.method3641(new class281(class229.field3018), arg0 ^ -4957);
            class649.field9002.method3641(new class281(class761.field10615), -16421);
            class649.field9003.method3641(new class281(class395.field5031), arg0 ^ -4957);
            class649.field9004.method3641(new class281(class475.field6389), -16421);
            class649.field9005.method3641(new class281(class748.field10463), -16421);
            class649.field9006.method3641(new class281(class94.field1324), -16421);
            class649.field9007.method3641(new class458(class482.field6563, "huffman"), -16421);
            class649.field9008.method3641(new class281(class210.field2782), -16421);
            class649.field9009.method3641(new class281(class329.field4206), -16421);
            class649.field9010.method3641(new class281(class445.field5928), arg0 + -37789);
            class649.field9011.method3641(new class560(class55.field758, "details"), arg0 ^ -4957);
            for (int var1 = 0; ~class651.field9063.length < ~var1; ++var1) {
                if (class651.field9063[var1].method3637(true) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class649[] var3 = class651.field9063;
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                class649 var5 = var3[var4];
                int var6 = var5.method3635(arg0 + -45104);
                int var7 = var5.method3637(true).method1248(27076);
                var2 += var6 * var7 / 100;
            }
            class528.field7363 = 2;
            class711.field9868 = var2;
        }
        if (class651.field9063 == null) {
            return 100;
        } else {
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            class649[] var11 = class651.field9063;
            for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
                class649 var16 = var11[var12];
                int var17 = var16.method3635(-23736);
                int var18 = var16.method3637(true).method1248(27076);
                if (var18 < 100) {
                    var10 = false;
                }
                var9 += var17 * var18 / 100;
                var8 += var17;
            }
            if (var10) {
                if (!((class633) class649.field8989.method3637(true)).method3548(97)) {
                    class654.field9104.method2723(arg0 + -21368);
                }
                if (!((class633) class649.field8992.method3637(true)).method3548(97)) {
                    class525.field7340 = class654.field9104.method2727(-127);
                }
                class651.field9063 = null;
            }
            int var13 = var8 - class711.field9868;
            int var14 = var9 - class711.field9868;
            if (arg0 != 21368) {
                return 127;
            } else {
                int var15 = ~var13 < -1 ? var14 * 100 / var13 : 100;
                if (!var10 && ~var15 < -100) {
                    var15 = 99;
                }
                return var15;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field7476;
        if (super.field4544.field10399.method1922(false) && !class320.method1881(super.field4544.field10399.method1924((byte) 95), (byte) 100)) {
            super.field4545 = 0;
        }
        if (arg0 != 6384) {
            method3098(86, -16, 27);
        }
        if (super.field4545 < 0 || ~super.field4545 < -2) {
            super.field4545 = this.method393((byte) -86);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field7478;
        super.field4545 = arg1;
        if (arg0 != -1) {
            field7487 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lwo;)V")
    public class540(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)Z")
    public final boolean method3097(int arg0) {
        int var2 = 98 % ((-34 - arg0) / 41);
        ++field7479;
        return class320.method1881(super.field4544.field10399.method1924((byte) -64), (byte) 120);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)I")
    public static final int method3098(int arg0, int arg1, int arg2) {
        if (arg0 != -11) {
            field7475 = null;
        }
        ++field7486;
        int var3 = -128 + class680.method3833(arg0 + 12, arg1 - -45365, arg2 + 91923, 4) - -(class680.method3833(1, arg1 + 10294, arg2 + 37821, 2) - 128 >> 1) + (-128 + class680.method3833(1, arg1, arg2, 1) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) - -35;
        if (var4 < 10) {
            var4 = 10;
        } else if (~var4 < -61) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
    public static final void method3099(int arg0) {
        ++field7480;
        if (class27.field484 != arg0) {
            if (~class27.field484 != -8) {
                if (~class27.field484 == -11) {
                    class571.method3275(27461, 11);
                    return;
                }
            } else {
                class571.method3275(27461, 8);
            }
        } else {
            class571.method3275(arg0 + 27458, 4);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
    public final int method3100(byte arg0) {
        ++field7477;
        int var2 = 122 / ((arg0 - 7) / 45);
        return super.field4545;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field7484;
        int var2 = 96 / ((arg0 - 37) / 63);
        return 0;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field7474;
        if (arg0 != 3) {
            field7475 = null;
        }
        return !class320.method1881(super.field4544.field10399.method1924((byte) -48), (byte) 124) ? 3 : 1;
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)V")
    public static void method3101(int arg0) {
        if (arg0 != -35) {
            method3101(-60);
        }
        field7487 = null;
        field7475 = null;
        field7485 = null;
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field7475 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field7485 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
        field7487 = new class275(81, 6);
    }
}
