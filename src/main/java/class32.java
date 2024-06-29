import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class32 extends class145 {

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    private int field358 = 1024;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    private int field357 = 1024;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    private int field365 = 409;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    private int field370 = 819;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    private int field371 = 2048;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    private int field377 = 1024;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    private int field373 = 0;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    private int field376 = 1024;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field374 = 0;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field361 = new String[200];

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field372 = 0;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Lxa;")
    public static class433 field375;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Ltq;")
    public static class545 field356;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "Lmo;")
    public static class647 field369;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        field356 = null;
        field369 = null;
        if (arg0 == 59) {
            field361 = null;
            field375 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lpt;IIIII)V")
    public static final void method184(class460 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6869 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class207.field2784[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class49 var13 = class48.field512[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field6869; ++var14) {
                            if (arg0.field6871[var14] == var13.field522) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field6871[arg0.field6869++] = var13.field522;
                        if (arg0.field6869 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field6869; var15 < 4; ++var15) {
            arg0.field6871[var15] = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field360;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int[][] var4 = super.field1779.method2077((byte) 99);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class647.field9368 * this.field357 >> 12;
            int var15 = class647.field9368 * this.field371 >> 12;
            int var16 = class441.field6574 * this.field365 >> 12;
            int var17 = class441.field6574 * this.field370 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field367 = class647.field9368 / 8 * this.field376 >> 12;
            int var18 = class647.field9368 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field374);
            label126: while (true) {
                while (true) {
                    int var22 = var14 + class107.method659(var21, false, var15 - var14);
                    int var23 = var16 + class107.method659(var21, arg0, -var16 + var17);
                    int var24 = var8 - -var22;
                    if (var24 > class647.field9368) {
                        var22 = -var8 + class647.field9368;
                        var24 = class647.field9368;
                    }
                    int var30;
                    if (var11) {
                        var30 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class647.field9368;
                        }
                        if (class647.field9368 < var28) {
                            var28 -= class647.field9368;
                        }
                        while (true) {
                            int[] var29 = var20[var25];
                            if (var28 >= var29[0] && var28 <= var29[1]) {
                                var30 = var26[2];
                                if (~var9 != ~var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class647.field9368;
                                    }
                                    if (~class647.field9368 > ~var31) {
                                        var31 -= class647.field9368;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var30 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var28 <= var31) {
                                                if (~var36 == -1) {
                                                    var38 = Math.min(var28, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class647.field9368;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var28, var37);
                                            }
                                            this.method186(111, var4, -var35 + var30, var21, var38 - var39, var7 + var39, var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            ++var25;
                            if (~var25 <= ~var12) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~class441.field6574 <= ~(var23 + var30)) {
                        var10 = false;
                    } else {
                        var23 = -var30 + class441.field6574;
                    }
                    if (~class647.field9368 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var30;
                        var41[1] = var24;
                        this.method186(125, var4, var23, var21, var22, var6 + var8, var30);
                        var8 = var24;
                    } else {
                        this.method186(126, var4, var23, var21, var22, var8 - -var6, var30);
                        if (var10) {
                            break label126;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[2] = var30 - -var23;
                        var42[0] = var8;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var13 = 0;
                        var7 = var6;
                        var6 = class107.method659(var21, false, class647.field9368);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class647.field9368 + var5;
                        }
                        var9 = 0;
                        if (~class647.field9368 > ~var44) {
                            var44 -= class647.field9368;
                        }
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var44 <= ~var45[0] && var45[1] >= var44) {
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.field370 = 88;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILta;ZZLoa;)V")
    public static final void method185(int arg0, int arg1, int arg2, class181 arg3, boolean arg4, boolean arg5, class605 arg6) {
        if (arg5) {
            class367.field5549.method2706((class581.field8366 - class367.field5549.method1577()) / 2, (class298.field4407 - class367.field5549.method1568()) / 2);
            class176.field2149.method2706((class581.field8366 - class176.field2149.method1577()) / 2, 18);
        }
        ++field364;
        String var7 = "";
        if (class325.field4688 != class184.field2291) {
            if (class408.field6151 == class184.field2291) {
                var7 = class24.field267.method2902(class35.field396, -20139);
            }
        } else {
            var7 = class51.field541.method2902(class35.field396, -20139);
        }
        arg3.method1031(arg0, class298.field4407 / 2 + -26, var7, -1, 26404, class581.field8366 / 2);
        int var8 = class298.field4407 / 2 + -18;
        arg6.method299(class581.field8366 / 2 - 152, var8, 304, 34, arg1, 0);
        arg6.method299(class581.field8366 / 2 + -151, var8 + 1, 302, 32, 0, 0);
        arg6.method394(class581.field8366 / 2 + -150, var8 + 2, class599.field8754 * 3, 30, arg2, 0);
        if (arg4) {
            field356 = null;
        }
        arg6.method394(class599.field8754 * 3 + class581.field8366 / 2 + -150, var8 + 2, 300 - class599.field8754 * 3, 30, 0, 0);
        arg3.method1031(arg0, class298.field4407 / 2 + 4, class595.field8696, -1, 26404, class581.field8366 / 2);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public final void method145(int arg0) {
        ++field359;
        int var2 = -50 % ((-46 - arg0) / 45);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field368;
        if (arg1 >= -67) {
            this.method186(-67, (int[][]) null, -87, (Random) null, 75, -35, -28);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field358 = arg2.method1220(122);
                                        }
                                    } else {
                                        this.field377 = arg2.method1220(-80);
                                    }
                                } else {
                                    this.field373 = arg2.method1177(255);
                                }
                            } else {
                                this.field376 = arg2.method1220(-35);
                            }
                        } else {
                            this.field370 = arg2.method1220(120);
                        }
                    } else {
                        this.field365 = arg2.method1220(-18);
                    }
                } else {
                    this.field371 = arg2.method1220(119);
                }
            } else {
                this.field357 = arg2.method1220(-126);
            }
        } else {
            this.field374 = arg2.method1177(255);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[IILjava/util/Random;III)V")
    private final void method186(int arg0, int[][] arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field366;
        int var8 = this.field358 <= 0 ? 4096 : 4096 - class107.method659(arg3, false, this.field358);
        if (arg0 < 108) {
            this.method145(89);
        }
        int var9 = this.field377 * this.field367 >> 12;
        int var10 = this.field367 - (~var9 < -1 ? class107.method659(arg3, false, var9) : 0);
        if (~class647.field9368 >= ~arg5) {
            arg5 -= class647.field9368;
        }
        if (var10 <= 0) {
            if (~(arg5 - -arg4) < ~class647.field9368) {
                int var11 = -arg5 + class647.field9368;
                for (int var12 = 0; var12 < arg2; ++var12) {
                    int[] var13 = arg1[arg6 + var12];
                    class210.method1331(var13, arg5, var11, var8);
                    class210.method1331(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; var14 < arg2; ++var14) {
                    class210.method1331(arg1[arg6 + var14], arg5, arg4, var8);
                }
            }
        } else if (arg2 > 0 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg2 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg5 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg2; ++var21) {
                int[] var22 = arg1[arg6 + var21];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field373 == 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class643.method3659(arg5 + var24, class619.field8980)] = var22[class643.method3659(class619.field8980, arg4 + arg5 + -var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class643.method3659(arg5 - -var26, class619.field8980)] = var22[class643.method3659(class619.field8980, arg5 - (-arg4 - -1) + -var26)] = var28 >= var23 ? var23 : var28;
                        }
                    }
                    if (~(var19 + var20) >= ~class647.field9368) {
                        class210.method1331(var22, var19, var20, var23);
                    } else {
                        int var27 = class647.field9368 - var19;
                        class210.method1331(var22, var19, var27, var23);
                        class210.method1331(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + arg2 + -1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field373 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class643.method3659(arg5 - -var31, class619.field8980)] = var22[class643.method3659(class619.field8980, -var31 + arg4 + arg5 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class643.method3659(class619.field8980, arg5 - -var33)] = var22[class643.method3659(class619.field8980, arg5 - var33 + arg4 + -1)] = ~var35 <= ~var30 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) >= ~class647.field9368) {
                            class210.method1331(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class647.field9368;
                            class210.method1331(var22, var19, var34, var30);
                            class210.method1331(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class643.method3659(class619.field8980, arg5 + var36)] = var22[class643.method3659(class619.field8980, -var36 + arg4 + -1 + arg5)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class647.field9368) {
                            class210.method1331(var22, var19, var20, var8);
                        } else {
                            int var37 = class647.field9368 - var19;
                            class210.method1331(var22, var19, var37, var8);
                            class210.method1331(var22, 0, var20 - var37, var8);
                        }
                    }
                }
            }
        }
    }
}
