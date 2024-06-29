import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class420 extends class145 {

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field6068 = -1;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "[F")
    public static float[] field6071 = new float[4];

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Ljava/lang/String;")
    public String field6067;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Ljava/lang/String;")
    public String field6074;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)Lvh;")
    public final class361 method2579(boolean arg0) {
        if (arg0) {
            method2581(-125);
        }
        ++field6069;
        return class61.field1216[super.field2405];
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
    public static final String method2580(String arg0, boolean arg1) {
        ++field6073;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        if (!arg1) {
            field6071 = null;
        }
        for (int var4 = 0; var3 > var4; ++var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 == -38 && ~(var4 + 2) > ~var3) {
                char var6 = arg0.charAt(var4 + 1);
                boolean var7 = false;
                int var8;
                if (var6 >= '0' && var6 <= '9') {
                    var8 = var6 - '0';
                } else if (var6 >= 'a' && ~var6 >= -103) {
                    var8 = var6 + '\n' + -97;
                } else {
                    if (var6 < 'A' || ~var6 < -71) {
                        var2.append('%');
                        continue;
                    }
                    var8 = var6 + -55;
                }
                char var9 = arg0.charAt(var4 + 2);
                int var10 = var8 * 16;
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0' + var10;
                } else if (~var9 <= -98 && var9 <= 'f') {
                    var11 = var9 - 'a' + 10 + var10;
                } else {
                    if (var9 < 'A' || ~var9 < -71) {
                        var2.append('%');
                        continue;
                    }
                    var11 = var9 + '\n' + -65 + var10;
                }
                if (~var11 != -1 && class615.method3489((byte) var11, -129)) {
                    var2.append(class216.method1548((byte) var11, -128));
                }
                var4 += 2;
            } else if (var5 != '+') {
                var2.append(var5);
            } else {
                var2.append(' ');
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static void method2581(int arg0) {
        if (arg0 == 512) {
            field6071 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILkda;)V")
    public static final void method2582(int arg0, class390 arg1) {
        ++field6070;
        boolean var2 = false;
        if (class641.field8810 != arg1.field5726 && ~arg1.field5712 != 0 && ~arg1.field5644 == -1) {
            class691 var3 = class456.field6436.method1021(arg1.field5712, arg0 + 8);
            if (var3.field9331 || ~(arg1.field5658 + 1) < ~var3.field9357[arg1.field5693]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg1.field5665 + arg1.field5726;
            int var5 = -arg1.field5665 + class641.field8810;
            int var6 = arg1.field5719 * 512 + 256 * arg1.method2457((byte) 90);
            int var7 = arg1.field5740 * 512 - -(arg1.method2457((byte) 44) * 256);
            int var8 = arg1.field5667 * 512 + 256 * arg1.method2457((byte) 98);
            int var9 = arg1.field5714 * 512 - -(arg1.method2457((byte) 76) * 256);
            arg1.field5922 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field5933 = ((-var5 + var4) * var7 - -(var5 * var9)) / var4;
        }
        arg1.field5752 = 0;
        if (~arg1.field5657 == arg0) {
            arg1.method2456((byte) -108, 8192, false);
        }
        if (~arg1.field5657 == -2) {
            arg1.method2456((byte) -108, 12288, false);
        }
        if (~arg1.field5657 == -3) {
            arg1.method2456((byte) -108, 0, false);
        }
        if (arg1.field5657 == 3) {
            arg1.method2456((byte) -108, 4096, false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method2583(byte arg0) {
        ++field6072;
        class599.field8219 = 0;
        class70.field1290 = 0;
        class612.field8372 = 0;
        class562.field7757 = 0;
        int var1 = 58 % ((arg0 - -66) / 39);
    }
}
