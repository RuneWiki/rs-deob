import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class190 extends class667 {

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "Lqaa;")
    public static class27 field2735 = new class27(21, 4);

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "Z")
    public static boolean field2741 = false;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "[[B")
    public static byte[][] field2739;

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "[[B")
    public static byte[][] field2743;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLjava/io/File;)[B", line = 3)
    public static final byte[] method1334(boolean arg0, File arg1) {
        if (arg0) {
            field2739 = null;
        }
        ++field2742;
        return class312.method2020((int) arg1.length(), arg1, 22711);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 18)
    public class190() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(Z)V", line = 22)
    public static void method1335(boolean arg0) {
        field2735 = null;
        field2743 = null;
        if (!arg0) {
            field2739 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)I", line = 37)
    public static final int method1336(byte arg0) {
        ++field2731;
        if (class330.field4654 != null) {
            return 3;
        } else if (arg0 != -106) {
            return 117;
        } else {
            return !class619.field8937 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(II)I", line = 52)
    public static final int method1337(int arg0, int arg1) {
        ++field2737;
        if (arg1 != -6935) {
            return -46;
        } else {
            int var2 = arg0 & 63;
            int var3 = (arg0 & 250) >> 6;
            if (~var2 == -19) {
                if (~var3 == -1) {
                    return 1;
                }
                if (var3 == 1) {
                    return 2;
                }
                if (var3 == 2) {
                    return 4;
                }
                if (var3 == 3) {
                    return 8;
                }
            } else if (var2 == 19 || var2 == 21) {
                if (~var3 == -1) {
                    return 16;
                }
                if (var3 == 1) {
                    return 32;
                }
                if (var3 == 2) {
                    return 64;
                }
                if (var3 == 3) {
                    return 128;
                }
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([BIIB)[B", line = 104)
    public static final byte[] method1338(byte[] arg0, int arg1, int arg2, byte arg3) {
        ++field2732;
        byte[] var4 = new byte[arg1];
        if (arg3 != 54) {
            method1339(125, 117);
        }
        class622.method3597(arg0, arg2, var4, 0, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(II)I", line = 119)
    public static final int method1339(int arg0, int arg1) {
        return class494.field7042 != null ? class494.field7042[arg0][arg1] & 65535 : 0;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)[[I", line = 126)
    public final int[][] method777(boolean arg0, int arg1) {
        ++field2733;
        int[][] var3 = super.field9357.method2314((byte) 41, arg1);
        if (arg0) {
            return null;
        } else {
            if (super.field9357.field5178) {
                int[][] var4 = this.method3748(arg1, 0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class77.field1455 > var11; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = 4096 - var6[var11];
                    var10[var11] = 4096 - var7[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BLjava/lang/String;)V", line = 173)
    public static final void method1340(byte arg0, String arg1) {
        ++field2734;
        if (arg1 != null) {
            if (arg0 <= 57) {
                method1334(false, (File) null);
            }
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class726.method4041(-1, arg1);
            if (var2 != null) {
                for (int var3 = 0; ~var3 > ~class222.field3169; ++var3) {
                    String var4 = class162.field2404[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class726.method4041(-1, var4);
                    if (var5 != null && var5.equals(var2)) {
                        --class222.field3169;
                        for (int var6 = var3; var6 < class222.field3169; ++var6) {
                            class162.field2404[var6] = class162.field2404[var6 + 1];
                            class349.field4928[var6] = class349.field4928[var6 + 1];
                            class628.field9029[var6] = class628.field9029[var6 - -1];
                            class186.field2673[var6] = class186.field2673[var6 - -1];
                            class259.field3808[var6] = class259.field3808[var6 + 1];
                        }
                        class688.field9702 = class374.field5247;
                        ++class746.field10440;
                        class135 var7 = class273.method1801(class459.field6629, class673.field9446, 2);
                        var7.field2109.method263((byte) -118, class552.method3233((byte) 118, arg1));
                        var7.field2109.method287((byte) 0, arg1);
                        class539.method3178(var7, -18925);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)V", line = 237)
    public static final void method1341(byte arg0) {
        ++field2740;
        if (arg0 != -85) {
            method1341((byte) 69);
        }
        ++class64.field1154;
        class135 var1 = class273.method1801(class459.field6629, class607.field8817, 2);
        var1.field2109.method263((byte) -81, method1336((byte) -106));
        var1.field2109.method223(1493807496, class206.field2956);
        var1.field2109.method223(1493807496, class363.field5105);
        var1.field2109.method263((byte) -119, class471.field6781.field6697.method2961(27669));
        class539.method3178(var1, -18925);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)[I", line = 258)
    public final int[] method117(byte arg0, int arg1) {
        ++field2736;
        int[] var3 = super.field9355.method1744(arg1, -2);
        if (arg0 >= -87) {
            return null;
        } else {
            if (super.field9355.field3728) {
                int[] var4 = this.method3744(arg1, (byte) -40, 0);
                for (int var5 = 0; ~class77.field1455 < ~var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lud;II)V", line = 291)
    public final void method116(class35 arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            field2741 = false;
        }
        ++field2738;
        if (~arg2 == -1) {
            super.field9344 = ~arg0.method273(255) == -2;
        }
    }
}
