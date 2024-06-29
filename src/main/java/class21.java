import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class21 extends class208 {

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    private int field367 = 0;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Z")
    public boolean field364 = false;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    private int field368 = -32768;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field365 = 0;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public int field370;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    private int field377;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public int field369;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "Lqa;")
    private class254 field376;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "Lsc;")
    public static class181 field378 = class149.method967(255, "k");

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Lsc;")
    public static class181 field374 = class149.method967(255, "(R");

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field384 = 1;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "Ldg;")
    public static class90 field382;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "[[[I")
    public static int[][][] field379;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public final int method190() {
        field366++;
        return this.field368;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
    public static final void method191(int arg0) {
        field383++;
        class247.field4317.method1272(511);
        class218.field3765 = null;
        if (arg0 != 5495) {
            field384 = 10;
        }
        class97.field1575 = 1;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)Lnb;")
    private final class249 method192(int arg0) {
        field372++;
        int var2 = -125 / ((arg0 - 4) / 56);
        class97 var3 = class259.method1760(this.field377, -18270);
        class249 var4;
        if (this.field364) {
            var4 = var3.method642(128, -1);
        } else {
            var4 = var3.method642(128, this.field367);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BIIIII)V")
    public static final void method193(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field381++;
        long var6 = class230.method1528(arg2, arg4, arg1);
        if (var6 != 0L) {
            int var8 = arg5;
            if (var6 > 0L) {
                var8 = arg3;
            }
            int[] var9 = class17.field307;
            int var10 = (int) var6 >> 14 & 0x1F;
            int var11 = 24624 - (-(arg4 * 4) - (103 - arg1) * 512 * 4);
            int var12 = ((int) var6 & 0x34C91B) >> 20;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class148 var14 = class62.method442((byte) 79, var13);
            if (var14.field2451 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var12 == 0) {
                        var9[var11] = var8;
                        var9[var11 + 512] = var8;
                        var9[var11 + 1024] = var8;
                        var9[var11 + 1536] = var8;
                    } else if (var12 == 1) {
                        var9[var11] = var8;
                        var9[var11 + 1] = var8;
                        var9[var11 + 2] = var8;
                        var9[var11 + 3] = var8;
                    } else if (var12 == 2) {
                        var9[var11 + 3] = var8;
                        var9[var11 + 512 + 3] = var8;
                        var9[var11 + 3 + 1024] = var8;
                        var9[var11 + 3 + 1536] = var8;
                    } else if (var12 == 3) {
                        var9[var11 + 1536] = var8;
                        var9[var11 + 1537] = var8;
                        var9[var11 + 1536 + 2] = var8;
                        var9[var11 + 3 + 1536] = var8;
                    }
                }
                if (var10 == 3) {
                    if (var12 == 0) {
                        var9[var11] = var8;
                    } else if (var12 == 1) {
                        var9[var11 + 3] = var8;
                    } else if (var12 == 2) {
                        var9[var11 + 1539] = var8;
                    } else if (var12 == 3) {
                        var9[var11 + 1536] = var8;
                    }
                }
                if (var10 == 2) {
                    if (var12 == 3) {
                        var9[var11] = var8;
                        var9[var11 + 512] = var8;
                        var9[var11 + 1024] = var8;
                        var9[var11 + 1536] = var8;
                    } else if (var12 == 0) {
                        var9[var11] = var8;
                        var9[var11 + 1] = var8;
                        var9[var11 + 2] = var8;
                        var9[var11 + 3] = var8;
                    } else if (var12 == 1) {
                        var9[var11 + 3] = var8;
                        var9[var11 + 3 + 512] = var8;
                        var9[var11 + 3 + 1024] = var8;
                        var9[var11 + 1536 + 3] = var8;
                    } else if (var12 == 2) {
                        var9[var11 + 1536] = var8;
                        var9[var11 + 1 + 1536] = var8;
                        var9[var11 + 2 + 1536] = var8;
                        var9[var11 + 1536 + 3] = var8;
                    }
                }
            } else {
                class134 var15 = null;
                if (!var14.field2453) {
                    var15 = class2.field64[var14.field2451];
                } else if (var12 == 0) {
                    var15 = class2.field64[var14.field2451];
                } else if (var12 == 1) {
                    var15 = class241.field4194[var14.field2451];
                } else if (var12 == 2) {
                    var15 = class256.field4475[var14.field2451];
                } else if (var12 == 3) {
                    var15 = class263.field4579[var14.field2451];
                }
                if (var15 != null) {
                    int var16 = (var14.field2466 * 4 - var15.field1096) / 2;
                    int var17 = (var14.field2433 * 4 - var15.field1102) / 2;
                    var15.method482(var16 + (arg4 * 4) + 48, 48 - -((-var14.field2433 + 104 + -arg1) * 4) - -var17);
                }
            }
        }
        long var18 = class189.method1312(arg2, arg4, arg1);
        int var20 = -86 % ((arg0 - 8) / 43);
        if (var18 != 0L) {
            int var21 = (int) var18 >> 20 & 0x3;
            int var22 = ((int) var18 & 0x7EF7D) >> 14;
            int var23 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class148 var24 = class62.method442((byte) 79, var23);
            if (var24.field2451 != -1) {
                class134 var25 = null;
                if (!var24.field2453) {
                    var25 = class2.field64[var24.field2451];
                } else if (var21 == 0) {
                    var25 = class2.field64[var24.field2451];
                } else if (var21 == 1) {
                    var25 = class241.field4194[var24.field2451];
                } else if (var21 == 2) {
                    var25 = class256.field4475[var24.field2451];
                } else if (var21 == 3) {
                    var25 = class263.field4579[var24.field2451];
                }
                if (var25 != null) {
                    int var26 = (var24.field2466 * 4 - var25.field1096) / 2;
                    int var27 = (var24.field2433 * 4 - var25.field1102) / 2;
                    var25.method482((arg4 * 4) + var26 + 48, (-var24.field2433 + 104 + -arg1) * 4 + var27 + 48);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                int[] var29 = class17.field307;
                if (var18 > 0L) {
                    var28 = 15597568;
                }
                int var30 = (52736 - (arg1 * 512)) * 4 + arg4 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 514] = var28;
                    var29[var30 + 3] = var28;
                } else {
                    var29[var30] = var28;
                    var29[var30 + 513] = var28;
                    var29[var30 + 1024 + 2] = var28;
                    var29[var30 + 1536 + 3] = var28;
                }
            }
        }
        long var31 = class123.method800(arg2, arg4, arg1);
        if (var31 == 0L) {
            return;
        }
        int var33 = (int) (var31 >>> 32) & Integer.MAX_VALUE;
        int var34 = (int) var31 >> 20 & 0x3;
        class148 var35 = class62.method442((byte) 79, var33);
        if (var35.field2451 == -1) {
            return;
        }
        class134 var36 = null;
        if (!var35.field2453) {
            var36 = class2.field64[var35.field2451];
        } else if (var34 == 0) {
            var36 = class2.field64[var35.field2451];
        } else if (var34 == 1) {
            var36 = class241.field4194[var35.field2451];
        } else if (var34 == 2) {
            var36 = class256.field4475[var35.field2451];
        } else if (var34 == 3) {
            var36 = class263.field4579[var35.field2451];
        }
        if (var36 != null) {
            int var37 = (var35.field2433 * 4 - var36.field1102) / 2;
            int var38 = (var35.field2466 * 4 - var36.field1096) / 2;
            var36.method482(arg4 * 4 + var38 + 48, (-arg1 + 104 + -var35.field2433) * 4 + 48 - -var37);
            return;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field373++;
        class249 var11 = this.method192(-61);
        if (var11 != null) {
            var11.method194(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field368 = var11.method190();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method195(boolean arg0) {
        if (arg0) {
            field378 = null;
            field382 = null;
            field374 = null;
            field379 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
    public final void method196(int arg0, int arg1) {
        field380++;
        if (arg1 != -2) {
            method193((byte) -52, 35, -72, 2, 4, -41);
        }
        if (this.field364) {
            return;
        }
        this.field365 += arg0;
        while (this.field365 > this.field376.field4456[this.field367]) {
            this.field365 -= this.field376.field4456[this.field367];
            this.field367++;
            if (this.field376.field4431.length <= this.field367) {
                this.field364 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
    public class21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field385 = arg6 + arg5;
        this.field371 = arg2;
        this.field370 = arg3;
        this.field375 = arg4;
        this.field377 = arg0;
        this.field369 = arg1;
        int var8 = class259.method1760(this.field377, -18270).field1563;
        if (var8 == -1) {
            this.field364 = true;
        } else {
            this.field364 = false;
            this.field376 = class128.method827(var8, 93);
        }
    }
}
