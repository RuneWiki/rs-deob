import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class28 extends class251 {

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[J")
    private long[] field665 = new long[10];

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    private int field662 = 256;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    private int field666 = 0;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    private int field669 = 1;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "J")
    private long field668 = class127.method1015(21504);

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "Lud;")
    public static class279 field661 = class96.method802(160, (byte) 25);

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lud;")
    public static class279 field667 = class130.method1024("Liste der Welten geladen", 255);

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field673 = 0;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "Lud;")
    public static class279 field677 = class130.method1024("Memory before cleanup=", 255);

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "[F")
    public static float[] field678 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
    public static int[] field676;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIBIII)V", line = 9)
    public static final void method255(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field663++;
        if (arg2 < 76) {
            method259(false, false);
        }
        int var6 = arg1 - arg3;
        int var7 = arg0 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class7.method44(91, arg4, arg5, arg0, arg3);
            }
        } else if (var7 == 0) {
            class18.method157(122, arg3, arg4, arg5, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 < var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg0;
                int var10 = arg3;
                arg3 = arg5;
                arg5 = var10;
                arg0 = var9;
            }
            if (arg3 > arg1) {
                int var11 = arg3;
                int var12 = arg5;
                arg5 = arg0;
                arg0 = var12;
                arg3 = arg1;
                arg1 = var11;
            }
            int var13 = arg5;
            int var14 = arg1 - arg3;
            int var15 = -(var14 >> 1);
            int var16 = arg0 - arg5;
            int var17 = arg5 < arg0 ? 1 : -1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var8) {
                for (int var19 = arg3; var19 <= arg1; var19++) {
                    class182.field3348[var19][var13] = arg4;
                    var15 += var16;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            } else {
                for (int var18 = arg3; var18 <= arg1; var18++) {
                    class182.field3348[var13][var18] = arg4;
                    var15 += var16;
                    if (var15 > 0) {
                        var13 += var17;
                        var15 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZI)I", line = 128)
    public final int method256(int arg0, boolean arg1, int arg2) {
        field675++;
        int var4 = this.field669;
        int var5 = this.field662;
        if (!arg1) {
            this.field669 = -1;
        }
        this.field669 = 1;
        this.field662 = 300;
        this.field668 = class127.method1015(21504);
        if (this.field665[this.field659] == 0L) {
            this.field662 = var5;
            this.field669 = var4;
        } else if (this.field668 > this.field665[this.field659]) {
            this.field662 = (int) ((long) (arg0 * 2560) / (this.field668 - this.field665[this.field659]));
        }
        if (this.field662 < 25) {
            this.field662 = 25;
        }
        if (this.field662 > 256) {
            this.field662 = 256;
            this.field669 = (int) ((long) arg0 - (this.field668 - this.field665[this.field659]) / 10L);
        }
        if (arg0 < this.field669) {
            this.field669 = arg0;
        }
        this.field665[this.field659] = this.field668;
        this.field659 = (this.field659 + 1) % 10;
        if (this.field669 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field665[var6] != 0L) {
                    this.field665[var6] += (long) this.field669;
                }
            }
        }
        int var7 = 0;
        if (arg2 > this.field669) {
            this.field669 = arg2;
        }
        class204.method1510((long) this.field669, 1);
        while (this.field666 < 256) {
            this.field666 += this.field662;
            var7++;
        }
        this.field666 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 200)
    public static void method257(int arg0) {
        field667 = null;
        field661 = null;
        field678 = null;
        if (arg0 <= 44) {
            field676 = (int[]) null;
        }
        field677 = null;
        field676 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)I", line = 222)
    public static final int method258(byte arg0, int arg1) {
        field674++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 == 14) {
            return class169.method1318((byte) 113, arg1);
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZZ)V", line = 241)
    public static final void method259(boolean arg0, boolean arg1) {
        if (arg1) {
            field667 = (class279) null;
        }
        field664++;
        if (class266.field4788 != arg0) {
            class266.field4788 = arg0;
            class321.method2262(-17958);
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 258)
    public final void method260(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field665[var2] = 0L;
        }
        field672++;
        if (arg0 != -22746) {
            method261(false);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V", line = 276)
    public static final void method261(boolean arg0) {
        field670++;
        class140.field2546.method1334((byte) -25);
        if (arg0) {
            field678 = (float[]) null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIII)V", line = 299)
    public static final void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        field671++;
        int var9 = arg5;
        int var10 = arg4 - arg2;
        int var11 = arg5 - arg2;
        int var12 = arg4 * arg4;
        int var13 = var10 * var10;
        int var14 = var12 << 1;
        int var15 = 0;
        int var16 = var11 * var11;
        int var17 = arg5 * arg5;
        int var18 = var16 << 1;
        int var19 = var17 << 1;
        int var20 = var13 << 1;
        int var21 = arg5 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var12 + var19;
        int var24 = var17 - (var21 - 1) * var14;
        int var25 = var16 - ((var22 - 1) * var20);
        int var26 = (1 - var22) * var13 + var18;
        int var27 = var12 << 2;
        int var28 = var17 << 2;
        int var29 = var16 << 2;
        int var30 = (var21 - 3) * var14;
        int var31 = var13 << 2;
        int var32 = var19 * 3;
        int var33 = (arg5 - 1) * var27;
        if (arg7 != 1244828417) {
            return;
        }
        int var34 = var18 * 3;
        int var35 = var29;
        int var36 = (var22 - 3) * var20;
        int var37 = (var11 - 1) * var31;
        int var38 = var28;
        int[] var39 = class182.field3348[arg1];
        class152.method1208(arg0 - arg4, arg3, arg0 - var10, var39, -7);
        class152.method1208(arg0 - var10, arg6, arg0 + var10, var39, -7);
        class152.method1208(arg0 + var10, arg3, arg0 + arg4, var39, -7);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var38;
                    var38 += var28;
                    var23 += var32;
                    var32 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var38;
                var23 += var32;
                var8++;
                var32 += var28;
                var38 += var28;
            }
            var23 += -var33;
            var24 += -var30;
            boolean var40 = var11 >= var9;
            var30 -= var27;
            var9--;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var15++;
                        var25 += var35;
                        var35 += var29;
                        var26 += var34;
                        var34 += var29;
                    }
                }
                if (var25 < 0) {
                    var26 += var34;
                    var15++;
                    var34 += var29;
                    var25 += var35;
                    var35 += var29;
                }
                var26 += -var37;
                var25 += -var36;
                var37 -= var31;
                var36 -= var31;
            }
            int var41 = arg1 - var9;
            int var42 = arg0 + var8;
            int var43 = arg0 - var8;
            int var44 = arg1 + var9;
            if (var40) {
                int var45 = arg0 + var15;
                int var46 = arg0 - var15;
                class152.method1208(var43, arg3, var46, class182.field3348[var41], -7);
                class152.method1208(var46, arg6, var45, class182.field3348[var41], -7);
                class152.method1208(var45, arg3, var42, class182.field3348[var41], -7);
                class152.method1208(var43, arg3, var46, class182.field3348[var44], -7);
                class152.method1208(var46, arg6, var45, class182.field3348[var44], -7);
                class152.method1208(var45, arg3, var42, class182.field3348[var44], arg7 - 1244828424);
            } else {
                class152.method1208(var43, arg3, var42, class182.field3348[var41], arg7 - 1244828424);
                class152.method1208(var43, arg3, var42, class182.field3348[var44], -7);
            }
            var33 -= var27;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 481)
    public class28() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field665[var1] = this.field668;
        }
    }
}
