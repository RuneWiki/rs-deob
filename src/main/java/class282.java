import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class282 extends class43 {

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ltm;")
    public static class349 field3678 = new class349(8);

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public static int field3687 = -1;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field3684 = 0;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "[I")
    public static int[] field3681 = new int[32];

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Ljk;")
    public static class117 field3685;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "Lwo;")
    public static class285 field3682;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
    public static final int method1775(int arg0, int arg1, int arg2) {
        field3679++;
        if (arg0 == 4 || arg0 == 5) {
            return class94.field1110[arg2 & 0x3];
        } else if (arg1 == 20441) {
            return 256;
        } else {
            return -17;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILnh;)V")
    public static final void method1776(int arg0, class441 arg1) {
        class2.field18 = 3;
        field3683++;
        class181.method1134(true, (byte) -122);
        class162.field1895 = 255;
        class403.field5601 = 1;
        class192.field2254 = 0;
        class373.field5049 = true;
        class275.field3557 = true;
        class40.field482 = true;
        class20.field211 = true;
        class428.field5851 = 0;
        class330.field4500 = 127;
        class96.field1136 = 127;
        class333.field4548 = 2;
        class167.field1948 = true;
        class414.field5684 = arg0;
        class183.field2125 = true;
        class252.field3298 = true;
        class147.field1727 = true;
        class341.field4646 = true;
        class194.field2296 = true;
        class244.field3249 = 0;
        if (class105.field1254 < 96) {
            class198.method1224((byte) -125, 0);
        } else {
            class198.method1224((byte) -108, 2);
        }
        class121.field1382 = 2;
        class362.field4906 = true;
        class11.field132 = false;
        class265.field3408 = false;
        class244.field3246 = false;
        class276.field3580 = 0;
        class201.field2374 = 0;
        class168.field1968 = true;
        class355.field4825 = class427.field5845 == 1 ? 2 : 4;
        class444.field6135 = 2;
        class7 var2 = null;
        try {
            class315 var3 = arg1.method2724(0);
            while (var3.field4244 == 0) {
                class219.method1330(1L, true);
            }
            if (var3.field4244 == 1) {
                var2 = (class7) var3.field4243;
                byte[] var4 = new byte[(int) var2.method34(arg0)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method33(var5, 11150, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class447.method2776(new class242(var4), (byte) 103);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method32((byte) -97);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(II)V")
    public class282(int arg0, int arg1) {
        this.field3677 = arg0;
        this.field3680 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1777(int arg0) {
        field3681 = null;
        field3682 = null;
        field3678 = null;
        if (arg0 == -26000) {
            field3685 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILjava/lang/String;)V")
    public static final void method1778(byte arg0, int arg1, String arg2) {
        field3688++;
        if (arg0 >= -87) {
            field3684 = 37;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < class450.field6291; var4++) {
            class131 var5 = class212.field2584[class304.field4083[var4]];
            if (var5 != null && var5.field1480 != null && var5.field1480.equalsIgnoreCase(arg2)) {
                var3 = true;
                if (arg1 == 1) {
                    class138.field1574++;
                    class427.field5837.method2162(false, 237);
                    class427.field5837.method1573(-6266, class304.field4083[var4]);
                    class427.field5837.method1593(0, -108);
                } else if (arg1 == 4) {
                    class427.field5837.method2162(false, 50);
                    class382.field5237++;
                    class427.field5837.method1555(true, 0);
                    class427.field5837.method1592(class304.field4083[var4], (byte) 114);
                } else if (arg1 == 5) {
                    class180.field2096++;
                    class427.field5837.method2162(false, 4);
                    class427.field5837.method1593(0, -104);
                    class427.field5837.method1573(-6266, class304.field4083[var4]);
                } else if (arg1 == 6) {
                    class427.field5837.method2162(false, 215);
                    class362.field4902++;
                    class427.field5837.method1555(true, 0);
                    class427.field5837.method1592(class304.field4083[var4], (byte) -124);
                } else if (arg1 == 7) {
                    class414.field5685++;
                    class427.field5837.method2162(false, 58);
                    class427.field5837.method1593(0, -93);
                    class427.field5837.method1592(class304.field4083[var4], (byte) 123);
                }
                break;
            }
        }
        if (!var3) {
            class134.method876((byte) -111, class56.field648.method434(class373.field5057, -8192) + arg2);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BC)Z")
    public static final boolean method1779(byte arg0, char arg1) {
        field3689++;
        if (arg0 == 59) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return false;
        }
    }
}
