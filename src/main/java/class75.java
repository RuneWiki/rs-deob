import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class75 extends class139 {

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    private int field1558 = 1024;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    private int field1564 = 1024;

    @OriginalMember(owner = "client!hf", name = "hb", descriptor = "I")
    private int field1569 = 1024;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    private int field1566 = 2048;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
    private int field1560 = 409;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    private int field1562 = 1024;

    @OriginalMember(owner = "client!hf", name = "nb", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!hf", name = "fb", descriptor = "I")
    private int field1567 = 0;

    @OriginalMember(owner = "client!hf", name = "pb", descriptor = "I")
    private int field1577 = 819;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!hf", name = "gb", descriptor = "Lrf;")
    public static class163 field1568 = class53.method392(-77, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!hf", name = "kb", descriptor = "Lrf;")
    private static class163 field1572 = class53.method392(-83, "Your account is already logged in)3");

    @OriginalMember(owner = "client!hf", name = "mb", descriptor = "Lrf;")
    private static class163 field1574 = class53.method392(86, "Cancel");

    @OriginalMember(owner = "client!hf", name = "lb", descriptor = "I")
    public static int field1573 = 0;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "Lrf;")
    public static class163 field1559 = field1574;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Lrf;")
    public static class163 field1557 = field1572;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!hf", name = "ib", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!hf", name = "jb", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!hf", name = "ob", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!hf", name = "qb", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjava/util/Random;II[[I)V")
    private final void method526(int arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int[][] arg6) {
        ++field1578;
        int var8 = ~this.field1558 >= -1 ? 4096 : 4096 + -class170.method1149(true, this.field1558, arg3);
        int var9 = this.field1564 * this.field1556 >> 12;
        int var10 = this.field1556 - (~var9 < -1 ? class170.method1149(true, var9, arg3) : 0);
        if (~class23.field402 >= ~arg1) {
            arg1 -= class23.field402;
        }
        if (arg2 >= -2) {
            method528((byte) 107, -28L);
        }
        if (var10 <= 0) {
            if (class23.field402 < arg1 + arg4) {
                int var11 = -arg1 + class23.field402;
                for (int var12 = 0; ~arg0 < ~var12; ++var12) {
                    int[] var13 = arg6[arg5 - -var12];
                    class123.method827(var13, arg1, var11, var8);
                    class123.method827(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; arg0 > var14; ++var14) {
                    class123.method827(arg6[arg5 + var14], arg1, arg4, var8);
                }
            }
        } else if (~arg0 < -1 && ~arg4 < -1) {
            int var15 = arg4 / 2;
            int var16 = arg0 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg1 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg0; ++var21) {
                int[] var22 = arg6[arg5 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field1567 == 0) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class133.method887(arg1 - -var24, class29.field542)] = var22[class133.method887(class29.field542, arg1 + arg4 + -1 + -var24)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class133.method887(class29.field542, arg1 + var26)] = var22[class133.method887(arg1 - -arg4 - (var26 + 1), class29.field542)] = ~var23 < ~var28 ? var28 : var23;
                        }
                    }
                    if (class23.field402 >= var19 - -var20) {
                        class123.method827(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class23.field402;
                        class123.method827(var22, var19, var27, var23);
                        class123.method827(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg0 - var21 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field1567 != -1) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class133.method887(arg1 - -var31, class29.field542)] = var22[class133.method887(class29.field542, arg1 - -arg4 + -var31 + -1)] = var32 >= var30 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class133.method887(arg1 + var33, class29.field542)] = var22[class133.method887(class29.field542, arg1 - -arg4 + -1 + -var33)] = var30 * var35 >> 12;
                            }
                        }
                        if (class23.field402 >= var19 + var20) {
                            class123.method827(var22, var19, var20, var30);
                        } else {
                            int var34 = class23.field402 - var19;
                            class123.method827(var22, var19, var34, var30);
                            class123.method827(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class133.method887(arg1 - -var36, class29.field542)] = var22[class133.method887(arg1 + -1 + arg4 - var36, class29.field542)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 > class23.field402) {
                            int var37 = -var19 + class23.field402;
                            class123.method827(var22, var19, var37, var8);
                            class123.method827(var22, 0, -var37 + var20, var8);
                        } else {
                            class123.method827(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        ++field1571;
        int[] var3 = super.field2859.method1319(-116, arg0);
        if (super.field2859.field3966) {
            int[][] var4 = super.field2859.method1317(-115);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class23.field402 * this.field1562 >> 12;
            int var15 = class23.field402 * this.field1566 >> 12;
            int var16 = class205.field4008 * this.field1560 >> 12;
            int var17 = class205.field4008 * this.field1577 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            int var18 = class23.field402 / var14 + 1;
            int[][] var19 = new int[var18][3];
            this.field1556 = class23.field402 / 8 * this.field1569 >> 12;
            Random var20 = new Random((long) this.field1575);
            int[][] var21 = new int[var18][3];
            label127: while (true) {
                while (true) {
                    int var22 = class170.method1149(true, -var14 + var15, var20) + var14;
                    int var23 = var16 + class170.method1149(true, var17 - var16, var20);
                    int var24 = var7 + var22;
                    if (~class23.field402 > ~var24) {
                        var22 = -var7 + class23.field402;
                        var24 = class23.field402;
                    }
                    int var29;
                    if (var10) {
                        var29 = 0;
                    } else {
                        int var25 = var8;
                        int var26 = 0;
                        int[] var27 = var21[var8];
                        int var28 = var6 + var24;
                        if (~var28 > -1) {
                            var28 += class23.field402;
                        }
                        var29 = var27[2];
                        if (~class23.field402 > ~var28) {
                            var28 -= class23.field402;
                        }
                        while (true) {
                            int[] var30 = var21[var25];
                            if (var28 >= var30[0] && ~var30[1] <= ~var28) {
                                if (var8 != var25) {
                                    int var31 = var6 + var7;
                                    if (~var31 > -1) {
                                        var31 += class23.field402;
                                    }
                                    if (~var31 < ~class23.field402) {
                                        var31 -= class23.field402;
                                    }
                                    for (int var32 = 1; var26 >= var32; ++var32) {
                                        int[] var40 = var21[(var8 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; ~var26 <= ~var33; ++var33) {
                                        int[] var34 = var21[(var8 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var28 >= ~var31) {
                                                if (~var36 == -1) {
                                                    var38 = Math.min(var28, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class23.field402;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var28, var37);
                                            }
                                            this.method526(-var35 + var29, var9 + var39, -76, var20, -var39 + var38, var35, var4);
                                        }
                                    }
                                }
                                var8 = var25;
                                break;
                            }
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                            ++var26;
                        }
                    }
                    if (~(var29 - -var23) >= ~class205.field4008) {
                        var11 = false;
                    } else {
                        var23 = class205.field4008 - var29;
                    }
                    if (class23.field402 == var24) {
                        this.method526(var23, var5 + var7, -15, var20, var22, var29, var4);
                        if (var11) {
                            break label127;
                        }
                        var10 = false;
                        var8 = 0;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var7;
                        var12 = var13;
                        var9 = var5;
                        var41[2] = var23 + var29;
                        var7 = 0;
                        var5 = class170.method1149(true, class23.field402, var20);
                        var13 = 0;
                        var11 = true;
                        var6 = -var9 + var5;
                        int[][] var42 = var21;
                        var21 = var19;
                        int var43 = var6;
                        if (~var6 > -1) {
                            var43 = class23.field402 + var6;
                        }
                        var19 = var42;
                        if (~var43 < ~class23.field402) {
                            var43 -= class23.field402;
                        }
                        while (true) {
                            int[] var44 = var21[var8];
                            if (var43 >= var44[0] && ~var44[1] <= ~var43) {
                                break;
                            }
                            ++var8;
                            if (~var8 <= ~var12) {
                                var8 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var29 - -var23;
                        var45[0] = var7;
                        this.method526(var23, var7 - -var5, -35, var20, var22, var29, var4);
                        var7 = var24;
                    }
                }
            }
        }
        if (arg1 != 7451) {
            method527((byte) -20);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)V")
    public static void method527(byte arg0) {
        field1568 = null;
        if (arg0 == -38) {
            field1572 = null;
            field1574 = null;
            field1557 = null;
            field1559 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method127(int arg0) {
        if (arg0 != 0) {
            method527((byte) 21);
        }
        ++field1576;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BJ)V")
    public static final void method528(byte arg0, long arg1) {
        if (arg0 != 68) {
            field1568 = null;
        }
        ++field1561;
        if (~arg1 != -1L) {
            for (int var3 = 0; ~var3 > ~class186.field3717; ++var3) {
                if (~class86.field1887[var3] == ~arg1) {
                    --class186.field3717;
                    ++class92.field1982;
                    for (int var4 = var3; class186.field3717 > var4; ++var4) {
                        class87.field1891[var4] = class87.field1891[var4 + 1];
                        class115.field2449[var4] = class115.field2449[var4 - -1];
                        class86.field1887[var4] = class86.field1887[var4 + 1];
                        class52.field1091[var4] = class52.field1091[var4 - -1];
                    }
                    class109.field2286 = class62.field1325;
                    class141.field2896.method326(104, 62);
                    class141.field2896.method373((byte) -52, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIBI)V")
    public static final void method529(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field1570;
        if (arg3 < 48) {
            field1563 = -9;
        }
        for (class62 var5 = (class62) class140.field2888.method46(117); var5 != null; var5 = (class62) class140.field2888.method53(7759444)) {
            if (var5.field1312 != -1 || var5.field1303 != null) {
                int var6 = 0;
                if (~arg4 >= ~var5.field1304) {
                    if (var5.field1307 > arg4) {
                        var6 += -arg4 + var5.field1307;
                    }
                } else {
                    var6 += -var5.field1304 + arg4;
                }
                if (~arg2 < ~var5.field1321) {
                    var6 += -var5.field1321 + arg2;
                } else if (~var5.field1301 < ~arg2) {
                    var6 += -arg2 + var5.field1301;
                }
                if (var5.field1316 >= var6 + -64 && class151.field3113 != 0 && var5.field1322 == arg1) {
                    var6 -= 64;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var7 = (var5.field1316 - var6) * class151.field3113 / var5.field1316;
                    if (var5.field1305 == null) {
                        if (var5.field1312 >= 0) {
                            class110 var8 = class110.method767(class121.field2552, var5.field1312, 0);
                            if (var8 != null) {
                                class153 var9 = var8.method769().method982(class27.field510);
                                class164 var10 = class164.method1099(var9, 100, var7);
                                var10.method1086(-1);
                                class113.field2378.method285(var10);
                                var5.field1305 = var10;
                            }
                        }
                    } else {
                        var5.field1305.method1078(var7);
                    }
                    if (var5.field1311 == null) {
                        if (var5.field1303 != null && ~(var5.field1317 -= arg0) >= -1) {
                            int var11 = (int) ((double) var5.field1303.length * Math.random());
                            class110 var12 = class110.method767(class121.field2552, var5.field1303[var11], 0);
                            if (var12 != null) {
                                class153 var13 = var12.method769().method982(class27.field510);
                                class164 var14 = class164.method1099(var13, 100, var7);
                                var14.method1086(0);
                                class113.field2378.method285(var14);
                                var5.field1311 = var14;
                                var5.field1317 = (int) ((double) (-var5.field1310 + var5.field1309) * Math.random()) + var5.field1310;
                            }
                        }
                    } else {
                        var5.field1311.method1078(var7);
                        if (!var5.field1311.method623(106)) {
                            var5.field1311 = null;
                        }
                    }
                } else {
                    if (var5.field1305 != null) {
                        class113.field2378.method281(var5.field1305);
                        var5.field1305 = null;
                    }
                    if (var5.field1311 != null) {
                        class113.field2378.method281(var5.field1311);
                        var5.field1311 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 == 21) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (arg0 != 6) {
                                        if (arg0 != 7) {
                                            if (arg0 == 8) {
                                                this.field1558 = arg2.method390((byte) 100);
                                            }
                                        } else {
                                            this.field1564 = arg2.method390((byte) 112);
                                        }
                                    } else {
                                        this.field1567 = arg2.method344(255);
                                    }
                                } else {
                                    this.field1569 = arg2.method390((byte) 101);
                                }
                            } else {
                                this.field1577 = arg2.method390((byte) 102);
                            }
                        } else {
                            this.field1560 = arg2.method390((byte) 124);
                        }
                    } else {
                        this.field1566 = arg2.method390((byte) 112);
                    }
                } else {
                    this.field1562 = arg2.method390((byte) 120);
                }
            } else {
                this.field1575 = arg2.method344(255);
            }
            ++field1565;
        }
    }
}
