import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class24 {

    @OriginalMember(owner = "client!vo", name = "W", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!vo", name = "X", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!vo", name = "Y", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!vo", name = "Z", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!vo", name = "ab", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!vo", name = "bb", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)[[I", line = 5)
    public final int[][] method207(byte arg0, int arg1) {
        ++field508;
        if (arg0 > -40) {
            method258(true, -62);
        }
        int[][] var3 = super.field5351.method2819((byte) -81, arg1);
        if (super.field5351.field6959 && this.method205(124)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field432 * super.field432;
            for (int var8 = 0; ~var8 > ~class404.field5952; ++var8) {
                int var9 = super.field426[var7 - -(var8 % super.field425)];
                var6[var8] = class388.method2441(var9 << 4, 4080);
                var5[var8] = class388.method2441(65280, var9) >> 4;
                var4[var8] = class388.method2441(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(ZI)V", line = 53)
    public static final void method258(boolean arg0, int arg1) {
        while (true) {
            if (class387.field5738.method2856(class133.field2060, arg1 + -12314) >= 15) {
                int var2 = class387.field5738.method2847(-10, 15);
                if (~var2 != -32768) {
                    boolean var3 = false;
                    if (class132.field2030[var2] == null) {
                        class132.field2030[var2] = new class13();
                        class132.field2030[var2].field331 = var2;
                        var3 = true;
                    }
                    class13 var4 = class132.field2030[var2];
                    class101.field1623[class322.field4943++] = var2;
                    var4.field313 = class180.field2734;
                    if (var4.field210 != null && var4.field210.method1053((byte) -25)) {
                        class62.method554(var4, (byte) -115);
                    }
                    int var5 = class387.field5738.method2847(125, 1);
                    var4.method119(class500.field7358.method1605((byte) -117, class387.field5738.method2847(-102, 14)), 0);
                    int var6 = class387.field5738.method2847(arg1 ^ 12393, 1);
                    if (var6 == 1) {
                        class305.field4371[class109.field1692++] = var2;
                    }
                    int var7 = 15859 & 4 + class387.field5738.method2847(113, 3) << 11;
                    int var8;
                    if (arg0) {
                        var8 = class387.field5738.method2847(110, 8);
                        if (~var8 < -128) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = class387.field5738.method2847(arg1 + -12208, 5);
                        if (~var8 < -16) {
                            var8 -= 32;
                        }
                    }
                    int var9 = class387.field5738.method2847(-107, 2);
                    int var10;
                    if (arg0) {
                        var10 = class387.field5738.method2847(116, 8);
                        if (~var10 < -128) {
                            var10 -= 256;
                        }
                    } else {
                        var10 = class387.field5738.method2847(-89, 5);
                        if (var10 > 15) {
                            var10 -= 32;
                        }
                    }
                    var4.method195(var4.field210.field2214, (byte) 2);
                    var4.field385 = var4.field210.field2210 << 3;
                    if (var4.field385 == 0) {
                        var4.method186(15505, 0);
                    } else if (var3) {
                        var4.method186(15505, var7);
                    }
                    var4.method120((byte) -117, var5 == 1, var4.method184(1), class95.field1558.field416[0] + var10, class95.field1558.field409[0] - -var8, var9);
                    if (var4.field210.method1053((byte) -25)) {
                        class428.method2610(var4.field5538, var4, var4.field409[0], (byte) 121, (class510) null, 0, (class62) null, var4.field416[0]);
                    }
                    continue;
                }
            }
            if (arg1 != 12315) {
                return;
            }
            ++field511;
            class387.field5738.method2849(45);
            return;
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IB)Z", line = 155)
    public static final boolean method259(int arg0, byte arg1) {
        ++field507;
        if (arg1 != -42) {
            return false;
        } else if (~arg0 != -7 && ~arg0 != -3 && ~arg0 != -52 && ~arg0 != -61 && arg0 != 57) {
            return ~arg0 == -18 || ~arg0 == -1009;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIII)I", line = 177)
    public static final int method260(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            return -34;
        } else {
            ++field506;
            int var4 = arg1 & 3;
            if (var4 == 0) {
                return arg2;
            } else if (var4 == 1) {
                return arg3;
            } else {
                return ~var4 == -3 ? 1023 - arg2 : -arg3 + 1023;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)Z", line = 199)
    public static final boolean method261(int arg0) {
        ++field509;
        if (arg0 != 1) {
            return true;
        } else {
            if (class176.field2677) {
                try {
                    if ((Boolean) class426.method2606("showingVideoAd", class112.field1785.field4458, 21615)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }
}
