import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class72 extends class330 {

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "Lqk;")
    public static class1 field782 = new class1(38, 7);

    @OriginalMember(owner = "client!nn", name = "M", descriptor = "F")
    public static float field791;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    private int field783;

    @OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    private int field787;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!nn", name = "N", descriptor = "I")
    private int field792;

    @OriginalMember(owner = "client!nn", name = "O", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "Lkia;")
    public static class93 field790;

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 3)
    public class72() {
        this(0);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V", line = 6)
    public static void method533(boolean arg0) {
        if (arg0) {
            method536((class555) null);
        }
        field790 = null;
        field782 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lgga;IB)V", line = 18)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.method535(arg0.method2983(true), 104);
        }
        ++field786;
        int var5 = -39 % ((-41 - arg2) / 42);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)Ljava/lang/String;", line = 46)
    public static final String method534(int arg0) {
        ++field785;
        String var1 = "www";
        if (arg0 != 0) {
            return null;
        } else {
            if (class425.field5937 != class126.field1636) {
                if (class425.field5937 != class273.field3939) {
                    if (class645.field9029 == class425.field5937) {
                        var1 = "www-wtwip";
                    }
                } else {
                    var1 = "www-wtqa";
                }
            } else {
                var1 = "www-wtrc";
            }
            String var2 = "";
            if (class704.field9801 != null) {
                var2 = "/p=" + class704.field9801;
            }
            return "http://" + var1 + "." + class327.field4603.field10820 + ".com/l=" + class553.field7667 + "/a=" + class718.field9946 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)V", line = 75)
    private final void method535(int arg0, int arg1) {
        this.field792 = (255 & arg0) << 4;
        ++field793;
        this.field787 = 4080 & arg0 >> 12;
        int var3 = -83 % (-arg1 / 58);
        this.field783 = arg0 >> 4 & 4080;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lws;)V", line = 90)
    public static final void method536(class555 arg0) {
        if (class392.field5587 < 65535) {
            class251 var1 = arg0.field7687;
            class205.field2880[class392.field5587] = arg0;
            class419.field5837[class392.field5587] = false;
            ++class392.field5587;
            int var2 = arg0.field7696;
            if (arg0.field7688) {
                var2 = 0;
            }
            int var3 = arg0.field7696;
            if (arg0.field7684) {
                var3 = class266.field3869 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method1686(false) - var1.method1685(-25) + class760.field10442 >> class732.field10110;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method1686(false) + var1.method1685(80) - class760.field10442 >> class732.field10110;
                if (var7 >= class704.field9799) {
                    var7 = class704.field9799 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field7695[var5++];
                    int var10 = (var1.method1683(10918) - var1.method1685(111) + class760.field10442 >> class732.field10110) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class414.field5796) {
                        var11 = class414.field5796 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class182.field2291[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class182.field2291[var4][var12][var8] = var13 | (long) class392.field5587;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class182.field2291[var4][var12][var8] = var13 | (long) class392.field5587 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class182.field2291[var4][var12][var8] = var13 | (long) class392.field5587 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class182.field2291[var4][var12][var8] = var13 | (long) class392.field5587 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[[I", line = 182)
    public final int[][] method537(int arg0, int arg1) {
        if (arg0 != 0) {
            field790 = null;
        }
        ++field784;
        int[][] var3 = super.field4621.method1597(arg1, true);
        if (super.field4621.field3510) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class80.field901 < ~var7; ++var7) {
                var4[var7] = this.field787;
                var5[var7] = this.field783;
                var6[var7] = this.field792;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)I", line = 221)
    public static final int method538(byte arg0) {
        int var1 = -50 / ((arg0 - -82) / 33);
        ++field789;
        byte var3;
        if (~class771.field10608 <= -97) {
            int var2 = class595.method3470(false);
            if (~var2 < -101) {
                if (~var2 >= -501) {
                    var3 = 3;
                    class50.method418((byte) -28);
                } else if (~var2 >= -1001) {
                    class637.method3660(112);
                    var3 = 2;
                } else {
                    class81.method582(true, (byte) 88);
                    var3 = 1;
                }
            } else {
                var3 = 4;
                class464.method2786(127);
            }
        } else {
            class81.method582(true, (byte) 118);
            var3 = 1;
        }
        if (class688.field9602.field8517.method2604((byte) -98) != 0) {
            class688.field9602.method3503(class688.field9602.field8510, -128, 0);
            class532.method3154(0, false, 1);
        }
        class266.method1738(-76);
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)[Ljn;", line = 283)
    public static final class134[] method539(int arg0) {
        ++field788;
        return arg0 != 11516 ? null : new class134[] { class655.field9254, client.field1291, class270.field3903, class777.field10682, class629.field8802, class744.field10260, class723.field10000, class452.field6303, class778.field10712, class378.field5429, class467.field6493, class752.field10375, class497.field6821, class409.field5746, class263.field3841, class761.field10448, class131.field1687, class387.field5516, class32.field303, class180.field2282, class745.field10278, class463.field6466, class564.field7979, class773.field10650, class57.field669, class354.field5128, class661.field9297, class414.field5795, class751.field10367, class409.field5751, class630.field8822, class535.field7397, class665.field9340, class660.field9292, class648.field9061, class494.field6797, class476.field6600, class249.field3703, class237.field3566, class221.field3005, class1.field7, class67.field741, class705.field9806, class297.field4328, class18.field115, class341.field4948, class134.field1717, class448.field6280, class432.field6001, class461.field6452, class395.field5605, class534.field7345, class683.field9566, class562.field7914, class397.field5628, class102.field1183, class97.field1137, class385.field5504, class730.field10089, class281.field4037, class131.field1689, class313.field4495, class113.field1370, class217.field2985, class724.field10028, class747.field10313, class677.field9480, class469.field6503, class543.field7566, class603.field8474, class349.field5081, class609.field8583, class231.field3474, class429.field5985, class554.field7674, class324.field4572, class676.field9478, class568.field8012, class396.field5617, class635.field8858, class589.field8311, class781.field10737, class39.field389, class345.field4982, class205.field2874, class156.field2031, class85.field1028, class412.field5768, class591.field8329, class22.field203, class218.field2993, class399.field5644, class609.field8595, class289.field4261, class532.field7328, class119.field1588, class444.field6152, class153.field2005, class141.field1794, class593.field8342, class397.field5624, class483.field6690, class393.field5592, class69.field764, class706.field9815, class148.field1923, class402.field5673, class230.field3466, class151.field1981, class302.field4401, class325.field4581, class290.field4279, class438.field6069, class384.field5498, class226.field3427, class498.field6829, class115.field1401, class611.field8604, class33.field332, class262.field3835, class510.field6906, class92.field1074, class401.field5663, class382.field5482, class484.field6694, class695.field9699, class262.field3836, class653.field9114, class615.field8637, class263.field3849, class671.field9411, class516.field7083, class589.field8305 };
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(I)V", line = 301)
    private class72(int arg0) {
        super(0, false);
        this.method535(arg0, -87);
    }
}
