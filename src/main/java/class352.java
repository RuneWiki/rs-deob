import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class352 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field4780 = -1;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field4778 = 8;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Z")
    public boolean field4782 = false;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Z")
    public boolean field4783 = true;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field4787 = 0;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public int field4793 = 1190717;

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public int field4794 = -1;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Z")
    public boolean field4790 = true;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field4792 = 128;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public int field4779 = 16;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public int field4791 = -1;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4786 = "";

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Z")
    public static boolean field4788 = false;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Z")
    public static volatile boolean field4798 = true;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Lta;")
    public static class292 field4781;

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "[I")
    public static int[] field4796;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLbg;I)V", line = 3)
    public final void method2235(byte arg0, class242 arg1, int arg2) {
        if (arg0 >= -43) {
            field4798 = true;
        }
        field4785++;
        while (true) {
            int var4 = arg1.method1563(-128);
            if (var4 == 0) {
                return;
            }
            this.method2239(var4, arg1, 23414, arg2);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 32)
    public static void method2236(byte arg0) {
        field4786 = null;
        if (arg0 <= -45) {
            field4796 = null;
            field4781 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILoo;ZZILoo;)I", line = 44)
    public static final int method2237(byte arg0, int arg1, class27 arg2, boolean arg3, boolean arg4, int arg5, class27 arg6) {
        field4784++;
        int var7 = class113.method658(arg4, arg1, arg6, -17541, arg2);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class113.method658(arg3, arg5, arg6, -17541, arg2);
            if (arg0 > -36) {
                method2237((byte) 101, -6, (class27) null, true, false, 52, (class27) null);
            }
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lbo;IIIIIZLuo;IIIIILge;I)Lge;", line = 79)
    public static final class386 method2238(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class118 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class386 arg13, int arg14) {
        if (arg5 != 896) {
            method2237((byte) 34, -101, (class27) null, false, true, -3, (class27) null);
        }
        field4795++;
        if (arg13 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg0 != null) {
            int var16 = var15 | arg0.method1001(arg10, false, -1, true);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg9 << 48) + ((long) arg2 << 32) + (long) ((arg14 << 24) + (arg3 << 16) + arg1);
        class365 var19 = class57.field654;
        class386 var20;
        synchronized (class57.field654) {
            var20 = (class386) class57.field654.method2295(var17, (byte) 74);
        }
        if (var20 == null || arg7.method721(var20.method1465(), var15) != 0) {
            if (var20 != null) {
                var15 = arg7.method707(var15, var20.method1465());
            }
            byte var21;
            if (arg1 == 1) {
                var21 = 9;
            } else if (arg1 == 2) {
                var21 = 12;
            } else if (arg1 == 3) {
                var21 = 15;
            } else if (arg1 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class402 var24 = new class402((var21 * var22) + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method2515(0, 0, 122, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class363.field4927[var31] * var28 >> 15;
                    int var33 = class363.field4917[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method2515(var33, var32, -107, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg3 * var36 + arg14 * var35 >> 8);
                short var38 = (short) (((arg2 & 0x7F) * var36 + (arg9 & 0x7F) * var35 & 0x7F00) + ((arg2 & 0x380) * var36 + (arg9 & 0x380) * var35 & 0x38000) + ((arg2 & 0xFC00) * var36 + (arg9 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method2513(var37, (byte) 1, arg5 - 826, var25, (byte) -1, (short) -1, var26[0][var39], var38, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method2513(var37, (byte) 1, 67, var26[var34 - 1][var39], (byte) -1, (short) -1, var26[var34][(var39 + 1) % var21], var38, var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method2513(var37, (byte) 1, 60, var26[var34 - 1][var39], (byte) -1, (short) -1, var26[var34][var39], var38, var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg7.method701(var24, var15, class90.field1051, 64, 768);
            class365 var40 = class57.field654;
            synchronized (class57.field654) {
                class57.field654.method2294(var20, (byte) 84, var17);
            }
        }
        int var41 = arg1 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg6) {
            if (arg8 > 9216 && arg8 < 15360) {
                var44 = var41 + 128;
            }
            if (arg8 > 5120 && arg8 < 11264) {
                var45 = var41 + 128;
            }
            if (arg8 > 1024 && arg8 < 7168) {
                var42 -= 128;
            }
            if (arg8 > 13312 || arg8 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg13.method1473();
        int var47 = arg13.method1489();
        int var48 = arg13.method1453();
        if (var42 > var46) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        int var49 = arg13.method1442();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class140 var50 = null;
        if (arg0 != null) {
            int var51 = arg0.field1821[arg10];
            var50 = class57.method320(-16, var51 >> 16);
            arg10 = var51 & 0xFFFF;
        }
        class386 var52;
        if (var50 == null) {
            var52 = var20.method1459((byte) 3, var15, true);
            var52.method1467((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1492((var46 + var47) / 2, 0, (var48 + var49) / 2);
        } else {
            var52 = var20.method1459((byte) 3, var15, true);
            var52.method1467((var47 - var46) / 2, 128, (var49 - var48) / 2);
            var52.method1492((var46 + var47) / 2, 0, (var48 + var49) / 2);
            var52.method2407(var50, arg5 - 983, arg10);
        }
        if (arg12 != 0) {
            var52.method1485(arg12);
        }
        if (arg4 != 0) {
            var52.method1445(arg4);
        }
        if (arg11 != 0) {
            var52.method1492(0, arg11, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILbg;II)V", line = 292)
    private final void method2239(int arg0, class242 arg1, int arg2, int arg3) {
        field4797++;
        if (arg0 == 1) {
            this.field4787 = class54.method306(arg1.method1545(8), -16711936);
        } else if (arg0 == 2) {
            this.field4780 = arg1.method1563(-128);
        } else if (arg0 == 3) {
            this.field4780 = arg1.method1587((byte) -102);
            if (this.field4780 == 65535) {
                this.field4780 = -1;
            }
        } else if (arg0 == 5) {
            this.field4783 = false;
        } else if (arg0 == 7) {
            this.field4791 = class54.method306(arg1.method1545(8), arg2 - 16735350);
        } else if (arg0 == 8) {
            class153.field1794 = arg3;
        } else if (arg0 == 9) {
            this.field4792 = arg1.method1587((byte) -102);
        } else if (arg0 == 10) {
            this.field4790 = false;
        } else if (arg0 == 11) {
            this.field4778 = arg1.method1563(-128);
        } else if (arg0 == 12) {
            this.field4782 = true;
        } else if (arg0 == 13) {
            this.field4793 = arg1.method1545(8);
        } else if (arg0 == 14) {
            this.field4779 = arg1.method1563(-128);
        } else if (arg0 == 15) {
            this.field4794 = arg1.method1587((byte) -102);
            if (this.field4794 == 65535) {
                this.field4794 = -1;
            }
        }
        if (arg2 != 23414) {
            method2237((byte) -35, -49, (class27) null, true, false, 29, (class27) null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V", line = 376)
    public final void method2240(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        if (this.field4794 == -1) {
            this.field4794 = this.field4780;
        }
        field4789++;
        this.field4778 = this.field4778 << 8 | arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLaq;)Z", line = 419)
    public static final boolean method2241(byte arg0, class453 arg1) {
        field4799++;
        if (arg1.field6415 == 205) {
            class40.field484 = 250;
            return true;
        } else {
            if (arg0 != -34) {
                field4798 = true;
            }
            return false;
        }
    }
}
