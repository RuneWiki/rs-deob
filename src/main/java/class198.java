import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class198 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public int field3184 = -1;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Leg;")
    public static class272 field3191 = new class272(50);

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "[Lhk;")
    public static class275[] field3193 = new class275[32768];

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[I")
    public static int[] field3195 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Ljj;")
    public static class134 field3188;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lbf;")
    public class297 field3185;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "[I")
    public int[] field3192;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[Ljava/lang/String;")
    public String[] field3190;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lfi;Z)V")
    public static final void method1333(class235 arg0, boolean arg1) {
        if (arg1) {
            method1333((class235) null, false);
        }
        field3189++;
        class54 var2 = (class54) class189.field3018.method457(class238.method1570(arg0.field3735, (byte) 87), (byte) -115);
        if (var2 == null) {
            return;
        }
        if (var2.field749 != null) {
            class215.field3464.method454(var2.field749);
            var2.field749 = null;
        }
        var2.method544(-115);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V")
    public static final void method1334(int arg0, int arg1) {
        field3187++;
        if (arg1 >= 0 && class99.field1499.length > arg1 && arg0 == 32768) {
            class99.field1499[arg1] = !class99.field1499[arg1];
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIILpi;)V")
    public static final void method1335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class281 arg6) {
        field3186++;
        long var7 = 0L;
        if (arg2 == 0) {
            var7 = class177.method1222(arg0, arg1, arg5);
        } else if (arg2 == 1) {
            var7 = class294.method1968(arg0, arg1, arg5);
        } else if (arg2 == 2) {
            var7 = class289.method1940(arg0, arg1, arg5);
        } else if (arg2 == 3) {
            var7 = class125.method866(arg0, arg1, arg5);
        }
        boolean var9 = false;
        boolean var10 = true;
        if (arg3 >= -28) {
            field3193 = null;
        }
        int var11 = (int) var7 >> 14 & 0x1F;
        boolean var12 = false;
        int var13 = ((int) var7 & 0x3D82B1) >> 20;
        int var14 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        class94 var15 = class119.method842(121, var14);
        if (var15.method668((byte) -69)) {
            class28.method186(var15, -8177, arg5, arg0, arg1);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg2 == 0) {
            class177.method1229(arg0, arg1, arg5);
            if (var15.field1355 != 0) {
                arg6.method1887(var13, !var15.field1375, var11, -120, arg5, var15.field1390, arg1);
            }
        } else if (arg2 == 1) {
            class197.method1332(arg0, arg1, arg5);
        } else if (arg2 == 2) {
            class71.method553(arg0, arg1, arg5);
            if (var15.field1355 != 0 && var15.field1334 + arg1 < 104 && (var15.field1334 + arg5) < 104 && arg1 + var15.field1340 < 104 && (arg5 + var15.field1340) < 104) {
                arg6.method1881(var15.field1390, -18488, arg1, arg5, var15.field1340, var15.field1334, var13, !var15.field1375);
            }
        } else if (arg2 == 3) {
            class220.method1462(arg0, arg1, arg5);
            if (var15.field1355 == 1) {
                arg6.method1882(arg1, (byte) 124, arg5);
            }
        }
        if (var15.field1345 != null) {
            class94 var20 = var15.method658(3834);
            return;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1336(byte arg0) {
        field3188 = null;
        field3195 = null;
        field3193 = null;
        field3191 = null;
        if (arg0 != -63) {
            method1338(113, 37, 127);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg0;
            arg0 = var7;
        }
        field3183++;
        if (arg4 != -23259) {
            field3191 = null;
        }
        int var8 = arg2 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return -arg1 - (-(7 - arg3) - 1);
        } else {
            return 8 - arg0 - arg6;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I")
    public static final int method1338(int arg0, int arg1, int arg2) {
        field3194++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 < ~var3) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
