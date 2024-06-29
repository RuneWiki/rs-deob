import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class151 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Lvd;")
    public static class222 field2915 = class212.method1357(" (X", 10731);

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lvd;")
    public static class222 field2925 = null;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lvd;")
    public static class222 field2929 = class212.method1357("underlay)3dat", 10731);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2916;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lba;")
    public static class13 field2917;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lvd;")
    public class222 field2920;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Z")
    public boolean field2926;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lbg;")
    public static class19[] field2914;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "[Lbg;")
    public static class19[] field2921;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[Lva;")
    public static class219[] field2928;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 != 10) {
            return;
        }
        field2918++;
        int var9 = arg6 - arg7;
        int var10 = (arg3 - arg2 << 16) / var9;
        boolean var11;
        if (class31.field653 > 0 && class31.field653 % 10 < 5) {
            var11 = true;
        } else {
            var11 = false;
        }
        int var12 = arg4 - arg5;
        int var13 = (arg0 - arg1 << 16) / var12;
        for (int var14 = 0; var14 < var9; var14++) {
            int var31 = (var14 + 1) * var10 >> 16;
            int var32 = var10 * var14 >> 16;
            int var33 = var31 - var32;
            if (var33 > 0) {
                int var10000 = arg2 + var31;
                int var35 = arg2 + var32;
                int[][] var36 = class114.field2182[var14 + arg7 >> 6];
                for (int var37 = 0; var37 < var12; var37++) {
                    int var38 = var13 * var37 >> 16;
                    int var39 = (var37 + 1) * var13 >> 16;
                    int var40 = var39 - var38;
                    if (var40 > 0) {
                        int var41 = arg1 + var38;
                        var10000 = arg1 + var39;
                        int var43 = arg5 + var37 >> 6;
                        if (var36[var43] != null) {
                            int var44 = ((arg5 + var37 & 0x3F) << 6) + (arg7 + var14 & 0x3F);
                            int var45 = var36[var43][var44];
                            if (var45 != 0) {
                                class65 var46 = class174.method1102(var45 - 1, 0);
                                if (var11 && class193.field3553 == var46.field1214) {
                                    class113 var47 = new class113();
                                    var47.field2122 = var41;
                                    var47.field2125 = var35;
                                    var47.field2126 = var46.field1214;
                                    class145.field2781.method235(var47, true);
                                }
                                class25.field573[var46.field1214].method163(var35 - 7, var41 - 7);
                            }
                        }
                    }
                }
            }
        }
        if (class229.field4313 == class104.field1929) {
            for (class40 var15 = (class40) class128.field2479.method236(0); var15 != null; var15 = (class40) class128.field2479.method237(true)) {
                int var16 = var15.field883;
                int var17 = var16 - class167.field3184;
                int var18 = (arg3 - arg2) * (-arg7 + var17) / (arg6 - arg7) + arg2;
                int var19 = var15.field885;
                int var20 = var15.field880;
                int var21 = 16777215;
                class133 var22 = null;
                if (var20 == 0) {
                    if (class229.field4313 == 3.0D) {
                        var22 = class209.field3884;
                    }
                    if (class229.field4313 == 4.0D) {
                        var22 = class135.field2608;
                    }
                    if (class229.field4313 == 6.0D) {
                        var22 = class188.field3480;
                    }
                    if (class229.field4313 == 8.0D) {
                        var22 = class103.field1907;
                    }
                }
                if (var20 == 1) {
                    if (class229.field4313 == 3.0D) {
                        var22 = class188.field3480;
                    }
                    if (class229.field4313 == 4.0D) {
                        var22 = class103.field1907;
                    }
                    if (class229.field4313 == 6.0D) {
                        var22 = class20.field466;
                    }
                    if (class229.field4313 == 8.0D) {
                        var22 = class197.field3593;
                    }
                }
                int var23 = class38.field852 + class59.field1107 - var19;
                int var24 = (var23 - arg5) * (-arg1 + arg0) / (arg4 - arg5) + arg1;
                if (var20 == 2) {
                    var21 = 16755200;
                    if (class229.field4313 == 3.0D) {
                        var22 = class20.field466;
                    }
                    if (class229.field4313 == 4.0D) {
                        var22 = class197.field3593;
                    }
                    if (class229.field4313 == 6.0D) {
                        var22 = class93.field1738;
                    }
                    if (class229.field4313 == 8.0D) {
                        var22 = class134.field2593;
                    }
                }
                if (var22 != null) {
                    class222[] var25 = var15.field879;
                    int var26 = var25.length;
                    int var27 = var24 - (var26 - 1) * var22.method837() / 2;
                    int var28 = var27 + var22.method830() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var22.method834(var25[var29], var18, var28, var21, true);
                        var28 += var22.method837();
                    }
                }
            }
        }
        for (class113 var30 = (class113) class145.field2781.method236(0); var30 != null; var30 = (class113) class145.field2781.method237(true)) {
            class25.field573[var30.field2126].method163(var30.field2125 - 7, var30.field2122 - 7);
            class53.method391(var30.field2125, var30.field2122, 15, 16776960, 128);
            class53.method391(var30.field2125, var30.field2122, 7, 16777215, 256);
        }
        class145.field2781.method238(1);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method973(int arg0) {
        field2921 = null;
        field2915 = null;
        field2925 = null;
        if (arg0 != 128) {
            field2932 = -74;
        }
        field2929 = null;
        field2914 = null;
        field2928 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z")
    public static final boolean method974(int arg0, byte arg1) {
        if (arg1 != 95) {
            method975();
        }
        field2924++;
        return (arg0 & -arg0) == arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public static final void method975() {
        for (int var0 = 0; var0 < class184.field3411; var0++) {
            for (int var5 = 0; var5 < class126.field2409; var5++) {
                for (int var6 = 0; var6 < class181.field3357; var6++) {
                    class204.field3800[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class221.field4099; var1++) {
            for (int var4 = 0; var4 < class221.field4105[var1]; var4++) {
                class221.field4107[var1][var4] = null;
            }
            class221.field4105[var1] = 0;
        }
        for (int var2 = 0; var2 < class67.field1262; var2++) {
            class29.field632[var2] = null;
        }
        class67.field1262 = 0;
        for (int var3 = 0; var3 < class46.field950.length; var3++) {
            class46.field950[var3] = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZB)V")
    public static final void method976(boolean arg0, byte arg1) {
        field2922++;
        if (class54.field1023 == null) {
            return;
        }
        try {
            class109 var2 = new class109(4);
            if (arg1 == 110) {
                var2.method676(arg0 ? 2 : 3, (byte) -3);
                var2.method677((byte) -109, 0);
                class54.field1023.method785(0, 0, var2.field2006, 4);
            }
        } catch (IOException var4) {
            try {
                class54.field1023.method784(5000);
            } catch (Exception var3) {
            }
            class54.field1023 = null;
            class177.field3310++;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)[Lbg;")
    public static final class19[] method977(int arg0) {
        if (arg0 != 12502) {
            return null;
        }
        class19[] var1 = new class19[class84.field1612];
        field2919++;
        for (int var2 = 0; var2 < class84.field1612; var2++) {
            class19 var3 = new class19();
            var3.field447 = class102.field1892;
            var3.field444 = class223.field4182;
            var3.field449 = class174.field3279[var2];
            var3.field450 = class218.field4050[var2];
            var3.field448 = class185.field3429[var2];
            var3.field446 = class83.field1584[var2];
            int var4 = var3.field448 * var3.field446;
            byte[] var5 = class157.field3020[var2];
            var3.field445 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var3.field445[var6] = class235.field4398[class139.method876(255, var5[var6])];
            }
            var1[var2] = var3;
        }
        class160.method1009(true);
        return var1;
    }
}
