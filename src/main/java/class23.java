import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class23 extends class67 {

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Z")
    public boolean field369;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "[Lc;")
    public class23[] field376;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Li;")
    public static class88 field360 = class208.method1425(105, "Benutzen");

    @OriginalMember(owner = "client!c", name = "B", descriptor = "Li;")
    public static class88 field367 = class208.method1425(105, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!c", name = "E", descriptor = "[Li;")
    public static class88[] field370 = new class88[200];

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!c", name = "A", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!c", name = "F", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Loh;")
    public class160 field379;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Lva;")
    public class230 field364;

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[Llj;")
    public static class130[] field372;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)[I")
    public int[] method54(int arg0, byte arg1) {
        if (arg1 < 19) {
            return null;
        } else {
            field381++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([BI)[B")
    public static final byte[] method119(byte[] arg0, int arg1) {
        class46 var2 = new class46(arg0);
        int var3 = var2.method347(26119);
        int var4 = var2.method323((byte) -68);
        field371++;
        if (var4 < 0 || class159.field3075 != 0 && var4 > class159.field3075) {
            throw new RuntimeException();
        } else if (~var3 == arg1) {
            byte[] var5 = new byte[var4];
            var2.method307(false, var4, var5, 0);
            return var5;
        } else {
            int var6 = var2.method323((byte) -99);
            if (var6 < 0 || class159.field3075 != 0 && class159.field3075 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class215.method1460(var7, var6, arg0, var4, 9);
            } else {
                class153.field2960.method424(var2, false, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZI)[I")
    public final int[] method120(int arg0, boolean arg1, int arg2) {
        field375++;
        if (arg1) {
            method126(17, -28, -50, 109, -57, 60, -70, 54);
        }
        return this.field376[arg2].field369 ? this.field376[arg2].method54(arg0, (byte) 113) : this.field376[arg2].method7(arg0, (byte) 13)[0];
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lea;II)V")
    public void method11(class46 arg0, int arg1, int arg2) {
        if (arg1 != -3) {
            this.field379 = null;
        }
        field366++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBI)[[I")
    public final int[][] method121(int arg0, byte arg1, int arg2) {
        field365++;
        int var4 = 74 % ((arg1 + 57) / 48);
        if (this.field376[arg0].field369) {
            int[] var5 = this.field376[arg0].method54(arg2, (byte) 71);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field376[arg0].method7(arg2, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
    public void method123(byte arg0) {
        field359++;
        if (arg0 != -69) {
            this.field369 = false;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)I")
    public int method124(int arg0) {
        field373++;
        return arg0 == -1 ? -1 : -113;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)V")
    public static void method125(boolean arg0) {
        if (arg0) {
            method122(-71, -2, 115, -73, -24, 92, -43, -94);
        }
        field372 = null;
        field370 = null;
        field367 = null;
        field360 = null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field361++;
        int var8 = arg2;
        int var9 = 0;
        int var10 = arg7 - arg1;
        int var11 = 0;
        int var12 = arg7 * arg7;
        int var13 = arg2 * arg2;
        int var14 = var10 * var10;
        int var15 = arg2 - arg1;
        int var16 = var15 * var15;
        int var17 = var12 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var14 << 1;
        int var21 = arg2 << 1;
        int var22 = var15 << 1;
        int var23 = var13 - (var21 - 1) * var17;
        int var24 = (1 - var21) * var12 + var18;
        int var25 = -128 % ((arg5 + 40) / 35);
        int var26 = var13 << 2;
        int var27 = var12 << 2;
        int var28 = (1 - var22) * var14 + var19;
        int var29 = var16 << 2;
        int var30 = (var21 - 3) * var17;
        int var31 = var14 << 2;
        int var32 = var16 - (var22 - 1) * var20;
        int var33 = var18 * 3;
        int var34 = var19 * 3;
        int var35 = (arg2 - 1) * var27;
        int var36 = (var22 - 3) * var20;
        int var37 = (var15 - 1) * var31;
        int[] var38 = class3.field42[arg6];
        int var39 = var26;
        int var40 = var29;
        class230.method1536(arg0 - arg7, arg4, -7, arg0 - var10, var38);
        class230.method1536(arg0 - var10, arg3, -7, arg0 + var10, var38);
        class230.method1536(arg0 + var10, arg4, -7, arg0 + arg7, var38);
        while (var8 > 0) {
            if (var24 < 0) {
                while (var24 < 0) {
                    var24 += var33;
                    var33 += var26;
                    var11++;
                    var23 += var39;
                    var39 += var26;
                }
            }
            boolean var41 = var8 <= var15;
            if (var41) {
                if (var28 < 0) {
                    while (var28 < 0) {
                        var9++;
                        var32 += var40;
                        var40 += var29;
                        var28 += var34;
                        var34 += var29;
                    }
                }
                if (var32 < 0) {
                    var9++;
                    var28 += var34;
                    var34 += var29;
                    var32 += var40;
                    var40 += var29;
                }
                var28 += -var37;
                var32 += -var36;
                var36 -= var31;
                var37 -= var31;
            }
            if (var23 < 0) {
                var24 += var33;
                var33 += var26;
                var11++;
                var23 += var39;
                var39 += var26;
            }
            var24 += -var35;
            var35 -= var27;
            var23 += -var30;
            var8--;
            int var42 = arg0 + var11;
            int var43 = arg6 - var8;
            var30 -= var27;
            int var44 = arg6 + var8;
            int var45 = arg0 - var11;
            if (var41) {
                int var46 = arg0 + var9;
                int var47 = arg0 - var9;
                class230.method1536(var45, arg4, -7, var47, class3.field42[var43]);
                class230.method1536(var47, arg3, -7, var46, class3.field42[var43]);
                class230.method1536(var46, arg4, -7, var42, class3.field42[var43]);
                class230.method1536(var45, arg4, -7, var47, class3.field42[var44]);
                class230.method1536(var47, arg3, -7, var46, class3.field42[var44]);
                class230.method1536(var46, arg4, -7, var42, class3.field42[var44]);
            } else {
                class230.method1536(var45, arg4, -7, var42, class3.field42[var43]);
                class230.method1536(var45, arg4, -7, var42, class3.field42[var44]);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)[[I")
    public int[][] method7(int arg0, byte arg1) {
        field380++;
        if (arg1 == 13) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public void method127(int arg0) {
        if (arg0 != -25611) {
            this.method120(-28, true, 2);
        }
        field378++;
        if (this.field369) {
            this.field379.method1083((byte) 11);
            this.field379 = null;
        } else {
            this.field364.method1533(0);
            this.field364 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)V")
    public final void method128(byte arg0, int arg1, int arg2) {
        if (arg0 != -126) {
            return;
        }
        field377++;
        int var4 = this.field363 == 255 ? arg2 : this.field363;
        if (this.field369) {
            this.field379 = new class160(var4, arg2, arg1);
        } else {
            this.field364 = new class230(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IZ)V")
    public class23(int arg0, boolean arg1) {
        this.field369 = arg1;
        this.field376 = new class23[arg0];
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)I")
    public int method129(int arg0) {
        if (arg0 != -285853214) {
            this.method127(110);
        }
        field362++;
        return -1;
    }
}
