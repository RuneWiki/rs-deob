import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class367 extends class5 {

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "Ljava/lang/String;")
    public static String field4661;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4664;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "Lqfa;")
    public static class372 field4669;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field4663;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "[[B")
    public static byte[][] field4670;

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
        field4661 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field4664 = var3.toLowerCase();
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
        field4669 = new class372("", 15);
        field4671 = 0;
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)V", line = 6)
    public static void method2009(int arg0) {
        if (arg0 <= -77) {
            field4670 = null;
            field4663 = null;
            field4669 = null;
            field4661 = null;
            field4664 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 21)
    public class367() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 26)
    public static final void method2010(String arg0, int arg1) {
        ++field4662;
        if (arg1 != 1) {
            method2009(-108);
        }
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class158.method900(arg0, true);
            if (var2 != null) {
                for (int var3 = 0; var3 < class66.field904; ++var3) {
                    String var4 = class50.field708[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class158.method900(var4, true);
                    if (var5 != null && var5.equals(var2)) {
                        --class66.field904;
                        for (int var6 = var3; var6 < class66.field904; ++var6) {
                            class50.field708[var6] = class50.field708[var6 + 1];
                            class531.field7172[var6] = class531.field7172[var6 + 1];
                            class223.field2796[var6] = class223.field2796[var6 - -1];
                            class241.field3010[var6] = class241.field3010[var6 + 1];
                            class441.field5568[var6] = class441.field5568[var6 + 1];
                            class599.field8411[var6] = class599.field8411[var6 + 1];
                        }
                        class95.field1312 = class450.field5767;
                        ++class204.field2595;
                        class704 var7 = class314.method1820(class598.field8404, class400.field5014, (byte) -71);
                        var7.field9929.method3509(class109.method611(arg0, (byte) 2), (byte) -118);
                        var7.field9929.method3489(arg0, arg1 ^ -44);
                        class122.method654(var7, (byte) -36);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)[I", line = 90)
    public final int[] method39(int arg0, int arg1) {
        ++field4666;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -86 / ((arg0 - 81) / 36);
        if (super.field126.field8392) {
            int[][] var5 = this.method45(0, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; class657.field9287 > var9; ++var9) {
                var3[var9] = (var6[var9] - (-var7[var9] + -var8[var9])) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBI)Z", line = 132)
    public static final boolean method2011(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 108) {
            return false;
        } else {
            ++field4665;
            if (~(class10.field190[0][arg2][arg4] & 2) != -1) {
                return true;
            } else if (~(class10.field190[arg0][arg2][arg4] & 16) != -1) {
                return false;
            } else {
                return ~arg1 == ~class557.method3064(arg0, arg4, 0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 155)
    public static final void method2012(byte arg0) {
        ++field4667;
        class122 var1 = (class122) class310.field3952.method237(arg0 ^ 42);
        if (arg0 == 64) {
            while (var1 != null) {
                class622 var2 = var1.field1544;
                if (var2.field8708) {
                    var1.method1871(-90);
                    var2.method3408(true);
                } else if (~class133.field1735 <= ~var2.field8699) {
                    var2.method3407(arg0 + -64, class653.field9220);
                    if (var2.field8708) {
                        var1.method1871(-84);
                    } else {
                        class231.method1391(var2, true);
                    }
                }
                var1 = (class122) class310.field3952.method245((byte) 62);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "(I)Z", line = 191)
    public static final boolean method2013(int arg0) {
        ++field4668;
        class113 var1 = (class113) class115.field1487.method237(100);
        if (var1 == null) {
            return false;
        } else if (arg0 != -25236) {
            return true;
        } else {
            for (int var2 = 0; ~var2 > ~var1.field1478; ++var2) {
                if (var1.field1470[var2] != null && ~var1.field1470[var2].field3358 == -1) {
                    return false;
                }
                if (var1.field1477[var2] != null && var1.field1477[var2].field3358 == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
