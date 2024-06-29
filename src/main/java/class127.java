import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 extends class51 {

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Lic;")
    public static class59 field2875 = class59.method433(0, "Standort");

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "[Lic;")
    public static class59[] field2883 = new class59[100];

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "Z")
    public static boolean field2882 = false;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field2884 = 0;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lic;")
    private static class59 field2887 = class59.method433(0, "Loading config )2 ");

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "Lic;")
    public static class59 field2876 = class59.method433(0, "compass");

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "Lic;")
    public static class59 field2879 = class59.method433(0, ")1j");

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lic;")
    public static class59 field2878 = field2887;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public int field2885;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "I")
    public int field2888;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "Z")
    public static boolean field2890;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lic;Lic;BLdd;)Lt;")
    public static final class132 method968(class59 arg0, class59 arg1, byte arg2, class26 arg3) {
        field2886++;
        int var4 = arg3.method201(arg0, -1);
        if (arg2 != 38) {
            field2877 = -121;
        }
        int var5 = arg3.method196(6, var4, arg1);
        return class96.method790(arg3, var4, 0, var5);
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public static final void method969(byte arg0) {
        Object var1 = class63.field1614;
        synchronized (class63.field1614) {
            if (class80.field1995 != 0) {
                class80.field1995 = 1;
                try {
                    class63.field1614.wait();
                } catch (InterruptedException var2) {
                }
            }
            if (arg0 != -39) {
                method972(null, null, -61, 35);
            }
        }
        field2892++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method970(boolean arg0) {
        field2878 = null;
        if (!arg0) {
            method969((byte) 21);
        }
        field2887 = null;
        field2879 = null;
        field2883 = null;
        field2876 = null;
        field2875 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILwd;)V")
    public final void method971(int arg0, class157 arg1) {
        field2872++;
        if (arg0 != 12846) {
            method970(true);
        }
        while (true) {
            int var3 = arg1.method1194(false);
            if (var3 == 0) {
                return;
            }
            this.method974(arg1, 1474548494, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lic;Lic;II)V")
    public static final void method972(class59 arg0, class59 arg1, int arg2, int arg3) {
        field2880++;
        if (arg3 != 26018) {
            method970(false);
        }
        class55.method408(null, arg2, arg1, 96, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIBII)V")
    public static final void method973(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2873++;
        if (arg3 != 98) {
            method972(null, null, -35, -55);
        }
        int var6 = class3.field58.method876(arg4, arg5, arg2);
        if (var6 != 0) {
            int var7 = class3.field58.method868(arg4, arg5, arg2, var6);
            int var8 = var7 & 0x1F;
            int var9 = var7 >> 6 & 0x3;
            int var10 = arg1;
            int[] var11 = class43.field1090.field2953;
            if (var6 > 0) {
                var10 = arg0;
            }
            int var12 = (52736 - arg2 * 512) * 4 + arg5 * 4 + 24624;
            int var13 = var6 >> 14 & 0x7FFF;
            class19 var14 = class53.method397(var13, 13415);
            if (var14.field417 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 1) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 1024 + 3] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1536 + 1] = var10;
                        var11[var12 + 2 + 1536] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
                if (var8 == 3) {
                    if (var9 == 0) {
                        var11[var12] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1539] = var10;
                    } else if (var9 == 3) {
                        var11[var12 + 1536] = var10;
                    }
                }
                if (var8 == 2) {
                    if (var9 == 3) {
                        var11[var12] = var10;
                        var11[var12 + 512] = var10;
                        var11[var12 + 1024] = var10;
                        var11[var12 + 1536] = var10;
                    } else if (var9 == 0) {
                        var11[var12] = var10;
                        var11[var12 + 1] = var10;
                        var11[var12 + 2] = var10;
                        var11[var12 + 3] = var10;
                    } else if (var9 == 1) {
                        var11[var12 + 3] = var10;
                        var11[var12 + 515] = var10;
                        var11[var12 + 3 + 1024] = var10;
                        var11[var12 + 1539] = var10;
                    } else if (var9 == 2) {
                        var11[var12 + 1536] = var10;
                        var11[var12 + 1537] = var10;
                        var11[var12 + 1538] = var10;
                        var11[var12 + 1536 + 3] = var10;
                    }
                }
            } else {
                class20 var15 = class36.field947[var14.field417];
                if (var15 != null) {
                    int var16 = (var14.field418 * 4 - var15.field440) / 2;
                    int var17 = (var14.field434 * 4 - var15.field442) / 2;
                    var15.method111(arg5 * 4 + var16 + 48, (-var14.field434 + -arg2 + 104) * 4 + var17 + 48);
                }
            }
        }
        int var18 = class3.field58.method914(arg4, arg5, arg2);
        if (var18 != 0) {
            int var19 = class3.field58.method868(arg4, arg5, arg2, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class19 var23 = class53.method397(var22, 13415);
            if (var23.field417 != -1) {
                class20 var27 = class36.field947[var23.field417];
                if (var27 != null) {
                    int var28 = (var23.field434 * 4 - var27.field442) / 2;
                    int var29 = (var23.field418 * 4 - var27.field440) / 2;
                    var27.method111(arg5 * 4 + var29 + 48, (104 - (arg2 - -var23.field434)) * 4 + 48 + var28);
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var25 = class43.field1090.field2953;
                int var26 = (103 - arg2) * 4 * 512 + arg5 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1024 + 1] = var24;
                    var25[var26 + 512 + 2] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 1 + 512] = var24;
                    var25[var26 + 2 + 1024] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        int var30 = class3.field58.method906(arg4, arg5, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class19 var32 = class53.method397(var31, arg3 + 13317);
        if (var32.field417 == -1) {
            return;
        }
        class20 var33 = class36.field947[var32.field417];
        if (var33 != null) {
            int var34 = (var32.field418 * 4 - var33.field440) / 2;
            int var35 = (var32.field434 * 4 - var33.field442) / 2;
            var33.method111(arg5 * 4 + var34 + 48, (104 - arg2 - var32.field434) * 4 + var35 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lwd;II)V")
    private final void method974(class157 arg0, int arg1, int arg2) {
        field2891++;
        if (arg2 == 1) {
            this.field2889 = arg0.method1161((byte) 60);
            this.field2885 = arg0.method1194(false);
            this.field2888 = arg0.method1194(false);
        }
        if (arg1 != 1474548494) {
            field2879 = null;
        }
    }
}
