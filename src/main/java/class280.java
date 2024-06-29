import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class280 extends class333 {

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field3476 = 0;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lbh;")
    private class547 field3470;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public int field3487;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
    private int[] field3479;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Lmj;")
    private class344 field3486;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "F")
    public float field3478;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[I")
    public static int[] field3482 = new int[5];

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "[I")
    public static int[] field3481 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Lsu;")
    private class155 field3473;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "Ltf;")
    public static class701 field3475;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Ljaclib/memory/Stream;")
    private Stream field3471;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field3469;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B[II)V")
    public final void method1630(byte arg0, int[] arg1, int arg2) {
        field3484++;
        class17 var4 = this.field3486.method1989(this.field3476 * 3, 104);
        Buffer var5 = var4.method75(true, 21281);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field3486.method1980((byte) -74, var5);
        int var7 = 0;
        int var8 = 32767;
        if (arg0 != -39) {
            this.field3476 = 98;
        }
        int var9 = -32768;
        if (Stream.method3480()) {
            label126: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg1[var10];
                short[] var12 = this.field3470.field7809[var11];
                int var13 = this.field3479[var11];
                if (var13 != 0 && var12 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var12.length) {
                                continue label126;
                            }
                            if ((0x1 << var14++ & var13) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var12[var15++] & 0xFFFF;
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                    var6.method3468(var17);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg1[var18];
                short[] var21 = this.field3470.field7809[var20];
                int var22 = this.field3479[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label100;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    var6.method3478(var26);
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3472();
        if (!var4.method71(-26305) || var7 <= 0) {
            return;
        }
        this.field3486.method2008((this.field3470.field7816 & 0x8) != 0, 123, this.field3483, (this.field3470.field7816 & 0x7) != 0);
        if (this.field3486.field4558) {
            this.field3486.method1031(Integer.MAX_VALUE, this.field3489, this.field3488, this.field3487);
        }
        class537 var19 = this.field3486.method2044(arg0 ^ 0xFFFFFF8E);
        var19.method3030(1.0F / this.field3478, (byte) -51, 1.0F / this.field3478, 1.0F);
        this.field3486.method1999(class103.field1120, false);
        this.field3486.method1281(this.field3473, 1, arg0 ^ 0xFFFFFFB5);
        this.field3486.method1285(true, this.field3470.field7840);
        this.field3486.method1276(0, var7, var9 + 1 - var8, false, class538.field7582, var4, var8);
        this.field3486.method2010(125);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)V")
    public final void method1631(byte arg0, int arg1) {
        this.field3471.method3472();
        field3474++;
        this.field3473 = this.field3486.method1283(false, -1);
        if (arg0 != 110) {
            this.method1632(-115, 34);
        }
        this.field3473.method355(arg0 ^ 0xFFFF977F, 4, this.field3469, arg1 * 4);
        this.field3469 = null;
        this.field3471 = null;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
    public final void method1632(int arg0, int arg1) {
        this.field3471.method3479(arg0 * 4 + 3);
        field3477++;
        if (arg1 <= -95) {
            this.field3471.method3471(-1);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method1633(int arg0) {
        field3481 = null;
        field3482 = null;
        if (arg0 >= 73) {
            field3475 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IFIII)V")
    public final void method1634(int arg0, float arg1, int arg2, int arg3, int arg4) {
        if (this.field3483 != -1) {
            class295 var6 = this.field3486.field8050.method140(this.field3483, arg2 ^ 0x4722);
            int var7 = var6.field3671 & 0xFF;
            if (var7 != 0 && var6.field3669 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) + ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) >> 8;
                }
            }
            int var11 = var6.field3667 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var12 << 8 & 0xFF00F6) + (var14 >> 8) + (var13 & 0xFF00);
            }
        }
        field3485++;
        this.field3471.method3479(arg3 * 4);
        if (arg2 != 17532) {
            this.field3471 = null;
        }
        if (arg1 != 1.0F) {
            int var15 = arg4 >> 16 & 0xFF;
            int var16 = (arg4 & 0xFFDB) >> 8;
            int var17 = (int) ((float) var15 * arg1);
            int var18 = arg4 & 0xFF;
            int var19 = (int) ((float) var16 * arg1);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var20 = (int) ((float) var18 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var17 << 16 | var19 << 8 | var20;
        }
        if (this.field3486.field4519 == 0) {
            this.field3471.method3471((byte) arg4);
            this.field3471.method3471((byte) (arg4 >> 8));
            this.field3471.method3471((byte) (arg4 >> 16));
        } else {
            this.field3471.method3471((byte) (arg4 >> 16));
            this.field3471.method3471((byte) (arg4 >> 8));
            this.field3471.method3471((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IBII)V")
    public final void method1635(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 73) {
            this.field3479[this.field3470.field3428 * arg3 + arg2] = class422.method2436(this.field3479[this.field3470.field3428 * arg3 + arg2], 0x1 << arg0);
            field3480++;
            this.field3476++;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V")
    public final void method1636(boolean arg0, int arg1) {
        this.field3469 = this.field3486.method1993(true, 86, arg1 * 4);
        field3472++;
        this.field3471 = new Stream(this.field3469, 0, arg1 * 4);
        if (arg0) {
            field3481 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lbh;IIIII)V")
    public class280(class547 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3470 = arg0;
        this.field3487 = arg5;
        this.field3488 = arg4;
        this.field3479 = new int[this.field3470.field3428 * this.field3470.field3426];
        this.field3486 = this.field3470.field7833;
        this.field3483 = arg1;
        this.field3478 = arg2;
        this.field3489 = arg3;
    }
}
