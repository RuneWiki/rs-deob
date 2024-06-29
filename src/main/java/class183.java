import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class183 {

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
    public boolean field2595 = false;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public int field2587 = -1;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field2591 = -1;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Z")
    public boolean field2590 = false;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Z")
    public boolean field2596 = false;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public int field2592 = 2;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public int field2604 = -1;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public int field2605 = 99;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public int field2597 = -1;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public int field2583 = 5;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
    public boolean field2602 = false;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public int field2610 = -1;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Z")
    public static boolean field2588 = false;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "[I")
    private int[] field2594;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
    public int[] field2600;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "[I")
    public int[] field2609;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "[Z")
    public boolean[] field2603;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[[I")
    public int[][] field2593;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public final void method1312(byte arg0) {
        field2585++;
        if (this.field2610 == -1) {
            if (this.field2603 == null) {
                this.field2610 = 0;
            } else {
                this.field2610 = 2;
            }
        }
        if (arg0 != -8 || this.field2597 != -1) {
            return;
        }
        if (this.field2603 == null) {
            this.field2597 = 0;
        } else {
            this.field2597 = 2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lvq;Lkm;IIIII)V")
    public static final void method1313(class269 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class243.field3603 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class394.field5548) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class407.field5751 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class74 var15 = class385.field5449[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class439.field6280[var12].method359(var13, var14) + class439.field6280[var12].method359(var13 + 1, var14) + class439.field6280[var12].method359(var13, var14 + 1) + class439.field6280[var12].method359(var13 + 1, var14 + 1)) / 4 - (class439.field6280[arg2].method359(arg3, arg4) + class439.field6280[arg2].method359(arg3 + 1, arg4) + class439.field6280[arg2].method359(arg3, arg4 + 1) + class439.field6280[arg2].method359(arg3 + 1, arg4 + 1)) / 4;
                                    class120 var17 = var15.field975;
                                    class120 var18 = var15.field977;
                                    if (var17 != null && var17.method610(-439)) {
                                        arg1.method611(arg0, var7, var17, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, (byte) -28, var16);
                                    }
                                    if (var18 != null && var18.method610(-439)) {
                                        arg1.method611(arg0, var7, var18, (var14 - arg4) * 128 + (1 - arg6) * 64, (var13 - arg3) * 128 + (1 - arg5) * 64, (byte) 107, var16);
                                    }
                                    for (class353 var19 = var15.field970; var19 != null; var19 = var19.field5127) {
                                        class306 var20 = var19.field5125;
                                        if (var20 != null && var20.method610(-439) && (var20.field4465 == var13 || var8 == var13) && (var20.field4462 == var14 || var10 == var14)) {
                                            int var21 = var20.field4460 + 1 - var20.field4465;
                                            int var22 = var20.field4471 + 1 - var20.field4462;
                                            arg1.method611(arg0, var7, var20, (var20.field4462 - arg4) * 128 + (var22 - arg6) * 64, (var20.field4465 - arg3) * 128 + (var21 - arg5) * 64, (byte) 127, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method1314(int arg0) {
        class15 var1 = class297.field4320;
        synchronized (class297.field4320) {
            class297.field4320.method98(0);
        }
        field2601++;
        class15 var2 = class245.field3656;
        synchronized (class245.field3656) {
            class245.field3656.method98(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lni;IBIIBII)Lni;")
    public final class305 method1315(class305 arg0, int arg1, byte arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2599++;
        int var9 = this.field2600[arg6];
        int var10 = this.field2609[arg6];
        class385 var11 = class226.method1583((byte) 13, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        int var13 = -78 % ((arg2 - 39) / 60);
        if (var11 == null) {
            return arg0.method200((byte) 1, arg4, true);
        }
        class385 var14 = null;
        if ((this.field2595 || class333.field4837) && arg7 != -1 && arg7 < this.field2609.length) {
            int var15 = this.field2609[arg7];
            var14 = class226.method1583((byte) 13, var15 >> 16);
            arg7 = var15 & 0xFFFF;
        }
        if (this.field2590) {
            arg4 |= 0x200;
        }
        if (var11.method2444(var12, -693)) {
            arg4 |= 0x80;
        }
        if (var11.method2447(var12, 0)) {
            arg4 |= 0x100;
        }
        if (var14 != null) {
            if (var14.method2444(arg7, -693)) {
                arg4 |= 0x80;
            }
            if (var14.method2447(arg7, 0)) {
                arg4 |= 0x100;
            }
        }
        int var16 = arg4 | 0x20;
        class305 var17 = arg0.method200(arg5, var16, true);
        var17.method2056(arg3, arg7, var11, var14, (byte) -82, var9, arg1 - 1, this.field2590, var12);
        return var17;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILlf;)V")
    public final void method1316(int arg0, class130 arg1) {
        while (true) {
            int var3 = arg1.method837(true);
            if (var3 == 0) {
                field2584++;
                if (arg0 >= -126) {
                    this.method1319(13, true, true, 12);
                    return;
                }
                return;
            }
            this.method1320(arg1, -117, var3);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
    public static final boolean method1317(int arg0, int arg1, int arg2) {
        field2607++;
        if (arg0 == -28499) {
            return (class320.field4692[1][arg2][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lni;IIIZI)Lni;")
    public final class305 method1318(class305 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2606++;
        if (arg4) {
            method1317(53, -99, -68);
        }
        int var7 = this.field2600[arg2];
        int var8 = this.field2609[arg2];
        class385 var9 = class226.method1583((byte) 13, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method200((byte) 1, arg3, true);
        }
        class385 var11 = null;
        if ((this.field2595 || class333.field4837) && arg1 != -1 && arg1 < this.field2609.length) {
            int var12 = this.field2609[arg1];
            var11 = class226.method1583((byte) 13, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        class385 var13 = null;
        class385 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2594 != null) {
            if (arg2 < this.field2594.length) {
                var15 = this.field2594[arg2];
                if (var15 != 65535) {
                    var13 = class226.method1583((byte) 13, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2595 || class333.field4837) && arg1 != -1 && this.field2594.length > arg1) {
                var16 = this.field2594[arg1];
                if (var16 != 65535) {
                    var14 = class226.method1583((byte) 13, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2590) {
            arg3 |= 0x200;
        }
        if (var9.method2444(var10, -693)) {
            arg3 |= 0x80;
        }
        if (var9.method2447(var10, 0)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method2444(var15, -693)) {
                arg3 |= 0x80;
            }
            if (var13.method2447(var15, 0)) {
                arg3 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method2444(arg1, -693)) {
                arg3 |= 0x80;
            }
            if (var11.method2447(arg1, 0)) {
                arg3 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method2444(var16, -693)) {
                arg3 |= 0x80;
            }
            if (var14.method2447(var16, 0)) {
                arg3 |= 0x100;
            }
        }
        int var17 = arg3 | 0x20;
        class305 var18 = arg0.method200((byte) 1, var17, true);
        var18.method2056(0, arg1, var9, var11, (byte) -82, var7, arg5 - 1, this.field2590, var10);
        if (var13 != null) {
            var18.method2056(0, var16, var13, var14, (byte) -82, var7, arg5 - 1, this.field2590, var15);
        }
        return var18;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZZI)I")
    public final int method1319(int arg0, boolean arg1, boolean arg2, int arg3) {
        field2586++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2609[arg0];
        class385 var8 = null;
        if (arg1) {
            this.field2605 = 31;
        }
        class385 var9 = class226.method1583((byte) 13, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2595 || class333.field4837) && arg3 != -1 && this.field2609.length > arg3) {
            int var11 = this.field2609[arg3];
            var8 = class226.method1583((byte) 13, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2590) {
            var5 |= 0x200;
        }
        if (var9.method2444(var10, -693)) {
            var5 |= 0x80;
        }
        if (var9.method2447(var10, 0)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method2444(var6, -693)) {
                var5 |= 0x80;
            }
            if (var8.method2447(var6, 0)) {
                var5 |= 0x100;
            }
        }
        if (this.field2594 != null && arg2) {
            if (this.field2594.length > arg0) {
                int var12 = this.field2594[arg0];
                if (var12 != 65535) {
                    class385 var13 = class226.method1583((byte) 13, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2444(var14, -693)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2447(var14, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2595 || class333.field4837) && arg3 != -1 && this.field2594.length > arg3) {
                int var15 = this.field2594[arg3];
                if (var15 != 65535) {
                    class385 var16 = class226.method1583((byte) 13, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2444(var17, -693)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2447(var17, 0)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Llf;II)V")
    private final void method1320(class130 arg0, int arg1, int arg2) {
        if (arg1 >= -86) {
            this.method1312((byte) -57);
        }
        field2608++;
        if (arg2 == 1) {
            int var4 = arg0.method798(false);
            this.field2600 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2600[var5] = arg0.method798(false);
            }
            this.field2609 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2609[var6] = arg0.method798(false);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2609[var7] = (arg0.method798(false) << 16) + this.field2609[var7];
            }
        } else if (arg2 == 2) {
            this.field2587 = arg0.method798(false);
        } else if (arg2 == 3) {
            this.field2603 = new boolean[256];
            int var15 = arg0.method837(true);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2603[arg0.method837(true)] = true;
            }
        } else if (arg2 == 4) {
            this.field2602 = true;
        } else if (arg2 == 5) {
            this.field2583 = arg0.method837(true);
        } else if (arg2 == 6) {
            this.field2604 = arg0.method798(false);
        } else if (arg2 == 7) {
            this.field2591 = arg0.method798(false);
        } else if (arg2 == 8) {
            this.field2605 = arg0.method837(true);
        } else if (arg2 == 9) {
            this.field2610 = arg0.method837(true);
        } else if (arg2 == 10) {
            this.field2597 = arg0.method837(true);
        } else if (arg2 == 11) {
            this.field2592 = arg0.method837(true);
        } else if (arg2 == 12) {
            int var12 = arg0.method837(true);
            this.field2594 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2594[var13] = arg0.method798(false);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field2594[var14] = (arg0.method798(false) << 16) + this.field2594[var14];
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method798(false);
            this.field2593 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method837(true);
                if (var10 > 0) {
                    this.field2593[var9] = new int[var10];
                    this.field2593[var9][0] = arg0.method839((byte) -92);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field2593[var9][var11] = arg0.method798(false);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2590 = true;
        } else if (arg2 == 15) {
            this.field2595 = true;
            return;
        } else if (arg2 == 16) {
            this.field2596 = true;
            return;
        }
    }
}
