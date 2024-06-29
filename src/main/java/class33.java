import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public abstract class class33 extends class129 {

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[Ldb;")
    public class33[] field727;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Z")
    public boolean field729;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field717 = 0;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field733 = -1;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!db", name = "y", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    public int field725;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!db", name = "G", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "Lud;")
    public class202 field731;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lib;")
    public class82 field718;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)I")
    public int method258(int arg0) {
        if (arg0 > -8) {
            this.field718 = null;
        }
        field720++;
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)[[I")
    public final int[][] method259(int arg0, int arg1, int arg2) {
        field726++;
        if (arg1 != -9) {
            method265(1, 38, (byte) 106);
        }
        if (!this.field727[arg0].field729) {
            return this.field727[arg0].method178(122, arg2);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field727[arg0].method175(arg2, (byte) 32);
        var4[2] = var5;
        var4[1] = var5;
        var4[0] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
    public void method179(int arg0) {
        if (arg0 == -1) {
            field737++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIB)V")
    public final void method260(int arg0, int arg1, byte arg2) {
        field736++;
        int var4 = this.field725 == 255 ? arg0 : this.field725;
        if (this.field729) {
            this.field718 = new class82(var4, arg0, arg1);
        } else {
            this.field731 = new class202(var4, arg0, arg1);
        }
        int var5 = -14 % ((arg2 + 12) / 46);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V")
    public void method261(byte arg0) {
        if (arg0 <= 16) {
            this.method258(-98);
        }
        if (this.field729) {
            this.field718.method511(true);
            this.field718 = null;
        } else {
            this.field731.method1341(-47);
            this.field731 = null;
        }
        field732++;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)[I")
    public final int[] method262(int arg0, int arg1, int arg2) {
        field721++;
        int var4 = -106 % ((-arg1 - 50) / 44);
        return this.field727[arg2].field729 ? this.field727[arg2].method175(arg0, (byte) 113) : this.field727[arg2].method178(115, arg0)[0];
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIILrh;I)V")
    public static final void method263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class177 arg7, int arg8) {
        field728++;
        class4 var9 = class182.method1237(true, arg1);
        int var10;
        int var11;
        if (arg0 == 1 || arg0 == 3) {
            var10 = var9.field67;
            var11 = var9.field61;
        } else {
            var10 = var9.field61;
            var11 = var9.field67;
        }
        int[][] var12 = class46.field975[arg2];
        int var13;
        int var14;
        if (arg5 + var10 > 104) {
            var13 = arg5;
            var14 = arg5 + 1;
        } else {
            var14 = (var10 + 1 >> 1) + arg5;
            var13 = (var10 >> 1) + arg5;
        }
        int var15;
        int var16;
        if (arg6 + var11 <= 104) {
            var15 = (var11 >> 1) + arg6;
            var16 = (var11 + 1 >> 1) + arg6;
        } else {
            var15 = arg6;
            var16 = arg6 + 1;
        }
        int var17 = (arg5 << 7) + (var10 << 6);
        int var18 = var12[var13][var15] + var12[var14][var15] + var12[var13][var16] + var12[var14][var16] >> 2;
        int var19 = (arg6 << 7) + (var11 << 6);
        if (arg4 >= -11) {
            method263(14, 29, 90, -63, -11, -15, -19, null, -29);
        }
        long var20 = (long) ((arg8 | 0x10000) << 14 | arg6 << 7 | arg5 | arg0 << 20);
        if (var9.field80 == 0) {
            var20 |= Long.MIN_VALUE;
        }
        if (var9.field38 == 1) {
            var20 |= 0x400000L;
        }
        long var22 = var20 | (long) arg1 << 32;
        if (arg8 == 22) {
            class35 var24;
            if (var9.field57 == -1 && var9.field84 == null) {
                var24 = var9.method29(arg0, var18, true, 22, var19, var17, var12);
            } else {
                var24 = new class166(arg1, 22, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class153.method1014(arg3, arg5, arg6, var18, var24, var22, var9.field49);
            if (var9.field45 == 1) {
                arg7.method1185(arg5, arg6, (byte) -113);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class35 var50;
            if (var9.field57 == -1 && var9.field84 == null) {
                var50 = var9.method29(arg0, var18, true, 10, var19, var17, var12);
            } else {
                var50 = new class166(arg1, 10, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            if (var50 != null) {
                class104.method644(arg3, arg5, arg6, var18, var10, var11, var50, arg8 == 11 ? 256 : 0, var22);
            }
            if (var9.field45 != 0) {
                arg7.method1180(arg6, var11, var10, (byte) 40, var9.field77, arg5);
            }
        } else if (arg8 >= 12) {
            class35 var25;
            if (var9.field57 == -1 && var9.field84 == null) {
                var25 = var9.method29(arg0, var18, true, arg8, var19, var17, var12);
            } else {
                var25 = new class166(arg1, arg8, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class104.method644(arg3, arg5, arg6, var18, 1, 1, var25, 0, var22);
            if (var9.field45 != 0) {
                arg7.method1180(arg6, var11, var10, (byte) 64, var9.field77, arg5);
            }
        } else if (arg8 == 0) {
            class35 var26;
            if (var9.field57 == -1 && var9.field84 == null) {
                var26 = var9.method29(arg0, var18, true, 0, var19, var17, var12);
            } else {
                var26 = new class166(arg1, 0, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class82.method510(arg3, arg5, arg6, var18, var26, null, client.field645[arg0], 0, var22);
            if (var9.field45 != 0) {
                arg7.method1175((byte) -114, arg6, arg8, var9.field77, arg0, arg5);
            }
        } else if (arg8 == 1) {
            class35 var27;
            if (var9.field57 == -1 && var9.field84 == null) {
                var27 = var9.method29(arg0, var18, true, 1, var19, var17, var12);
            } else {
                var27 = new class166(arg1, 1, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class82.method510(arg3, arg5, arg6, var18, var27, null, class71.field1385[arg0], 0, var22);
            if (var9.field45 != 0) {
                arg7.method1175((byte) 33, arg6, arg8, var9.field77, arg0, arg5);
            }
        } else if (arg8 == 2) {
            int var28 = arg0 + 1 & 0x3;
            class35 var29;
            class35 var30;
            if (var9.field57 == -1 && var9.field84 == null) {
                var29 = var9.method29(arg0 + 4, var18, true, 2, var19, var17, var12);
                var30 = var9.method29(var28, var18, true, 2, var19, var17, var12);
            } else {
                var29 = new class166(arg1, 2, arg0 + 4, arg2, arg5, arg6, var9.field57, var9.field42, null);
                var30 = new class166(arg1, 2, var28, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class82.method510(arg3, arg5, arg6, var18, var29, var30, client.field645[arg0], client.field645[var28], var22);
            if (var9.field45 != 0) {
                arg7.method1175((byte) 65, arg6, arg8, var9.field77, arg0, arg5);
            }
        } else if (arg8 == 3) {
            class35 var31;
            if (var9.field57 == -1 && var9.field84 == null) {
                var31 = var9.method29(arg0, var18, true, 3, var19, var17, var12);
            } else {
                var31 = new class166(arg1, 3, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class82.method510(arg3, arg5, arg6, var18, var31, null, class71.field1385[arg0], 0, var22);
            if (var9.field45 != 0) {
                arg7.method1175((byte) 100, arg6, arg8, var9.field77, arg0, arg5);
            }
        } else if (arg8 == 9) {
            class35 var32;
            if (var9.field57 == -1 && var9.field84 == null) {
                var32 = var9.method29(arg0, var18, true, arg8, var19, var17, var12);
            } else {
                var32 = new class166(arg1, arg8, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class104.method644(arg3, arg5, arg6, var18, 1, 1, var32, 0, var22);
            if (var9.field45 != 0) {
                arg7.method1180(arg6, var11, var10, (byte) -125, var9.field77, arg5);
            }
        } else if (arg8 == 4) {
            class35 var33;
            if (var9.field57 == -1 && var9.field84 == null) {
                var33 = var9.method29(arg0, var18, true, 4, var19, var17, var12);
            } else {
                var33 = new class166(arg1, 4, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class35.method271(arg3, arg5, arg6, var18, var33, null, client.field645[arg0], 0, 0, 0, var22);
        } else if (arg8 == 5) {
            int var34 = 16;
            long var35 = class13.method97(arg3, arg5, arg6);
            if (var35 != 0L) {
                var34 = class182.method1237(true, (int) (var35 >>> 32) & Integer.MAX_VALUE).field85;
            }
            class35 var37;
            if (var9.field57 == -1 && var9.field84 == null) {
                var37 = var9.method29(arg0, var18, true, 4, var19, var17, var12);
            } else {
                var37 = new class166(arg1, 4, arg0, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class35.method271(arg3, arg5, arg6, var18, var37, null, client.field645[arg0], 0, class106.field1986[arg0] * var34, class99.field1817[arg0] * var34, var22);
        } else if (arg8 == 6) {
            int var38 = 8;
            long var39 = class13.method97(arg3, arg5, arg6);
            if (var39 != 0L) {
                var38 = class182.method1237(true, (int) (var39 >>> 32) & Integer.MAX_VALUE).field85 / 2;
            }
            class35 var41;
            if (var9.field57 == -1 && var9.field84 == null) {
                var41 = var9.method29(arg0 + 4, var18, true, 4, var19, var17, var12);
            } else {
                var41 = new class166(arg1, 4, arg0 + 4, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class35.method271(arg3, arg5, arg6, var18, var41, null, 256, arg0, class116.field2135[arg0] * var38, class59.field1158[arg0] * var38, var22);
        } else if (arg8 == 7) {
            int var42 = arg0 + 2 & 0x3;
            class35 var43;
            if (var9.field57 == -1 && var9.field84 == null) {
                var43 = var9.method29(var42 + 4, var18, true, 4, var19, var17, var12);
            } else {
                var43 = new class166(arg1, 4, var42 + 4, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class35.method271(arg3, arg5, arg6, var18, var43, null, 256, var42, 0, 0, var22);
        } else if (arg8 == 8) {
            int var44 = 8;
            long var45 = class13.method97(arg3, arg5, arg6);
            if (var45 != 0L) {
                var44 = class182.method1237(true, (int) (var45 >>> 32) & Integer.MAX_VALUE).field85 / 2;
            }
            int var47 = arg0 + 2 & 0x3;
            class35 var48;
            class35 var49;
            if (var9.field57 == -1 && var9.field84 == null) {
                var48 = var9.method29(arg0 + 4, var18, true, 4, var19, var17, var12);
                var49 = var9.method29(var47 + 4, var18, true, 4, var19, var17, var12);
            } else {
                var48 = new class166(arg1, 4, arg0 + 4, arg2, arg5, arg6, var9.field57, var9.field42, null);
                var49 = new class166(arg1, 4, var47 + 4, arg2, arg5, arg6, var9.field57, var9.field42, null);
            }
            class35.method271(arg3, arg5, arg6, var18, var48, var49, 256, arg0, class116.field2135[arg0] * var44, class59.field1158[arg0] * var44, var22);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILmb;)V")
    public void method177(int arg0, int arg1, class121 arg2) {
        field719++;
        if (arg1 > -99) {
            this.field725 = 6;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
    public int method264(int arg0) {
        field730++;
        if (arg0 >= -116) {
            this.method175(76, (byte) -33);
        }
        return -1;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIB)I")
    public static final int method265(int arg0, int arg1, byte arg2) {
        if (arg2 > -24) {
            return -104;
        }
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        field724++;
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IZ)V")
    public class33(int arg0, boolean arg1) {
        this.field727 = new class33[arg0];
        this.field729 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(II)[[I")
    public int[][] method178(int arg0, int arg1) {
        if (arg0 <= 112) {
            return null;
        } else {
            field735++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)[I")
    public int[] method175(int arg0, byte arg1) {
        int var3 = -85 / ((-arg1 - 65) / 60);
        field723++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }
}
