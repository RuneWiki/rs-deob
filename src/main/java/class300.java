import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class300 extends class110 {

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    private int field4579 = 1024;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    private int field4580 = 409;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    private int field4581 = 2048;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field4587 = 1024;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    private int field4582 = 1024;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field4590 = 1024;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    private int field4597 = 0;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    private int field4585 = 0;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field4595 = 819;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
    public static int[] field4588 = new int[4];

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static volatile int field4593 = 0;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "Lba;")
    public static class161 field4577;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZILf;IB)V", line = 6)
    public static final void method2084(boolean arg0, int arg1, class329 arg2, int arg3, byte arg4) {
        field4594++;
        int var5 = arg2.field5018;
        int var6 = arg2.field4994;
        if (arg2.field4944 == 0) {
            arg2.field5018 = arg2.field4971;
        } else if (arg2.field4944 == 1) {
            arg2.field5018 = arg3 - arg2.field4971;
        } else if (arg2.field4944 == 2) {
            arg2.field5018 = arg2.field4971 * arg3 >> 14;
        } else if (arg2.field4944 == 3) {
            if (arg2.field5066 == 2) {
                arg2.field5018 = arg2.field4971 * 32 + ((arg2.field4971 - 1) * arg2.field5082);
            } else if (arg2.field5066 == 7) {
                arg2.field5018 = (arg2.field4971 - 1) * arg2.field5082 + arg2.field4971 * 115;
            }
        }
        if (arg4 != -5) {
            return;
        }
        if (arg2.field4930 == 0) {
            arg2.field4994 = arg2.field4946;
        } else if (arg2.field4930 == 1) {
            arg2.field4994 = arg1 - arg2.field4946;
        } else if (arg2.field4930 == 2) {
            arg2.field4994 = arg2.field4946 * arg1 >> 14;
        } else if (arg2.field4930 == 3) {
            if (arg2.field5066 == 2) {
                arg2.field4994 = (arg2.field4946 - 1) * arg2.field5083 + arg2.field4946 * 32;
            } else if (arg2.field5066 == 7) {
                arg2.field4994 = (arg2.field4946 - 1) * arg2.field5083 + arg2.field4946 * 12;
            }
        }
        if (arg2.field4944 == 4) {
            arg2.field5018 = arg2.field5025 * arg2.field4994 / arg2.field5031;
        }
        if (arg2.field4930 == 4) {
            arg2.field4994 = arg2.field5031 * arg2.field5018 / arg2.field5025;
        }
        if (class250.field3733 && (client.method902(arg2).field242 != 0 || arg2.field5066 == 0)) {
            if (arg2.field4994 < 5 && arg2.field5018 < 5) {
                arg2.field5018 = 5;
                arg2.field4994 = 5;
            } else {
                if (arg2.field4994 <= 0) {
                    arg2.field4994 = 5;
                }
                if (arg2.field5018 <= 0) {
                    arg2.field5018 = 5;
                }
            }
        }
        if (arg2.field5032 == 1337) {
            class164.field2480 = arg2;
        }
        if (arg0 && arg2.field4987 != null && (arg2.field5018 != var5 || arg2.field4994 != var6)) {
            class286 var7 = new class286();
            var7.field4330 = arg2;
            var7.field4310 = arg2.field4987;
            class211.field3202.method1108(var7, arg4 + 65285);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIBIIII)V", line = 112)
    public static final void method2085(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= class157.field2357 && arg0 <= class184.field2761 && class185.field2769 <= arg2 && arg4 <= class166.field2494) {
            class263.method1800((byte) 60, arg7, arg1, arg6, arg2, arg0, arg5, arg4);
        } else {
            class222.method1557(arg0, arg5, arg4, arg2, true, arg7, arg1, arg6);
        }
        if (arg3 != -102) {
            field4577 = (class161) null;
        }
        field4586++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([[IILjava/util/Random;IIII)V", line = 130)
    private final void method2086(int[][] arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        field4596++;
        int var8 = this.field4590 <= 0 ? 4096 : 4096 - class216.method1488(this.field4590, true, arg2);
        int var9 = this.field4589 * this.field4582 >> 12;
        int var10 = this.field4589 - (var9 > 0 ? class216.method1488(var9, true, arg2) : 0);
        if (arg5 != -18866) {
            this.field4579 = 22;
        }
        if (class124.field1936 <= arg3) {
            arg3 -= class124.field1936;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg4 <= 0) {
                return;
            }
            int var15 = arg4 / 2;
            int var16 = var10 > var15 ? var15 : var10;
            int var17 = arg1 / 2;
            int var18 = var10 <= var17 ? var10 : var17;
            int var19 = arg4 - (var16 * 2);
            int var20 = arg3 + var16;
            for (int var21 = 0; var21 < arg1; var21++) {
                int[] var22 = arg0[arg6 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field4585 == 0) {
                        for (int var26 = 0; var26 < var16; var26++) {
                            int var27 = var8 * var26 / var16;
                            var22[class124.method893(arg3 + var26, class196.field2949)] = var22[class124.method893(class196.field2949, arg3 + arg4 - var26 - 1)] = var23 * var27 >> 12;
                        }
                    } else {
                        for (int var24 = 0; var24 < var16; var24++) {
                            int var25 = var8 * var24 / var16;
                            var22[class124.method893(class196.field2949, arg3 + var24)] = var22[class124.method893(arg3 + arg4 - var24 - 1, class196.field2949)] = var23 > var25 ? var25 : var23;
                        }
                    }
                    if (var20 + var19 <= class124.field1936) {
                        class85.method592(var22, var20, var19, var23);
                    } else {
                        int var28 = class124.field1936 - var20;
                        class85.method592(var22, var20, var28, var23);
                        class85.method592(var22, 0, var19 - var28, var23);
                    }
                } else {
                    int var29 = arg1 - var21 - 1;
                    if (var29 >= var18) {
                        for (int var30 = 0; var30 < var16; var30++) {
                            var22[class124.method893(class196.field2949, arg3 + var30)] = var22[class124.method893(arg3 + arg4 - (var30 + 1), class196.field2949)] = var8 * var30 / var16;
                        }
                        if (class124.field1936 < (var19 + var20)) {
                            int var31 = class124.field1936 - var20;
                            class85.method592(var22, var20, var31, var8);
                            class85.method592(var22, 0, var19 - var31, var8);
                        } else {
                            class85.method592(var22, var20, var19, var8);
                        }
                    } else {
                        int var32 = var8 * var29 / var18;
                        if (this.field4585 == 0) {
                            for (int var35 = 0; var35 < var16; var35++) {
                                int var36 = var8 * var35 / var16;
                                var22[class124.method893(arg3 + var35, class196.field2949)] = var22[class124.method893(class196.field2949, arg3 + arg4 - var35 - 1)] = var32 * var36 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var16; var33++) {
                                int var34 = var8 * var33 / var16;
                                var22[class124.method893(class196.field2949, arg3 + var33)] = var22[class124.method893(class196.field2949, arg3 + arg4 - var33 - 1)] = var32 <= var34 ? var32 : var34;
                            }
                        }
                        if (class124.field1936 < var20 + var19) {
                            int var37 = class124.field1936 - var20;
                            class85.method592(var22, var20, var37, var32);
                            class85.method592(var22, 0, var19 - var37, var32);
                        } else {
                            class85.method592(var22, var20, var19, var32);
                        }
                    }
                }
            }
        } else if ((arg3 + arg4) > class124.field1936) {
            int var11 = class124.field1936 - arg3;
            for (int var12 = 0; var12 < arg1; var12++) {
                int[] var13 = arg0[arg6 + var12];
                class85.method592(var13, arg3, var11, var8);
                class85.method592(var13, 0, arg4 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg1; var14++) {
                class85.method592(arg0[arg6 + var14], arg3, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 324)
    public class300() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILre;I)V", line = 333)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg2 >= -37) {
            return;
        }
        field4599++;
        if (arg0 == 0) {
            this.field4597 = arg1.method1787(false);
        } else if (arg0 == 1) {
            this.field4587 = arg1.method1830((byte) -77);
        } else if (arg0 == 2) {
            this.field4581 = arg1.method1830((byte) -77);
        } else if (arg0 == 3) {
            this.field4580 = arg1.method1830((byte) -77);
        } else if (arg0 == 4) {
            this.field4595 = arg1.method1830((byte) -77);
        } else if (arg0 == 5) {
            this.field4579 = arg1.method1830((byte) -77);
        } else if (arg0 == 6) {
            this.field4585 = arg1.method1787(false);
        } else if (arg0 == 7) {
            this.field4582 = arg1.method1830((byte) -77);
        } else if (arg0 == 8) {
            this.field4590 = arg1.method1830((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILre;)Lak;", line = 425)
    public static final class145 method2087(int arg0, class263 arg1) {
        field4578++;
        if (arg0 <= 84) {
            method2088(125);
        }
        return new class145(arg1.method1845((byte) -125), arg1.method1845((byte) -125), arg1.method1845((byte) -120), arg1.method1845((byte) -127), arg1.method1824(false), arg1.method1824(false), arg1.method1787(false));
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V", line = 436)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            this.method2086((int[][]) ((int[][]) null), 101, (Random) null, -128, 50, -61, 39);
        }
        field4598++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I", line = 463)
    public final int[] method46(int arg0, int arg1) {
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (arg0 != 1) {
            method2089(-84, -119, -59, 19, 33);
        }
        field4584++;
        if (!this.field1695.field875) {
            return var3;
        }
        int[][] var4 = this.field1695.method439(-111);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class124.field1936 * this.field4587 >> 12;
        int var15 = class295.field4523 * this.field4595 >> 12;
        int var16 = class295.field4523 * this.field4580 >> 12;
        int var17 = class124.field1936 * this.field4581 >> 12;
        if (var15 <= 1) {
            return var4[arg1];
        }
        this.field4589 = class124.field1936 / 8 * this.field4579 >> 12;
        int var18 = class124.field1936 / var14 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field4597);
        while (true) {
            while (true) {
                int var22 = class216.method1488(var17 - var14, true, var21) + var14;
                int var23 = var16 + class216.method1488(var15 - var16, true, var21);
                int var24 = var8 + var22;
                if (class124.field1936 < var24) {
                    var24 = class124.field1936;
                    var22 = class124.field1936 - var8;
                }
                int var28;
                if (var11) {
                    var28 = 0;
                } else {
                    int var25 = var9;
                    int[] var26 = var19[var9];
                    int var27 = 0;
                    var28 = var26[2];
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class124.field1936;
                    }
                    if (var29 > class124.field1936) {
                        var29 -= class124.field1936;
                    }
                    while (true) {
                        int[] var30 = var19[var25];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var9 != var25) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class124.field1936;
                                }
                                if (class124.field1936 < var31) {
                                    var31 -= class124.field1936;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var19[(var9 + var32) % var12];
                                    var28 = Math.max(var28, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var19[(var9 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var28 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var40 = Math.min(var29, var38);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class124.field1936;
                                        }
                                        this.method2086(var4, var28 - var36, var21, var39 + var7, -var39 + var40, -18866, var36);
                                    }
                                }
                            }
                            var9 = var25;
                            break;
                        }
                        var27++;
                        var25++;
                        if (var25 >= var12) {
                            var25 = 0;
                        }
                    }
                }
                if (class295.field4523 < (var23 + var28)) {
                    var23 = class295.field4523 - var28;
                } else {
                    var10 = false;
                }
                if (class124.field1936 == var24) {
                    this.method2086(var4, var23, var21, var6 + var8, var22, arg0 ^ 0xFFFFB64F, var28);
                    if (var10) {
                        return var3;
                    }
                    var7 = var6;
                    var11 = false;
                    int[] var41 = var20[var13++];
                    var9 = 0;
                    var10 = true;
                    var41[2] = var23 + var28;
                    var41[1] = var24;
                    var12 = var13;
                    var41[0] = var8;
                    int[][] var42 = var19;
                    var13 = 0;
                    var6 = class216.method1488(class124.field1936, true, var21);
                    var5 = var6 - var7;
                    var19 = var20;
                    int var43 = var5;
                    var20 = var42;
                    if (var5 < 0) {
                        var43 = class124.field1936 + var5;
                    }
                    var8 = 0;
                    if (class124.field1936 < var43) {
                        var43 -= class124.field1936;
                    }
                    while (true) {
                        int[] var44 = var19[var9];
                        if (var43 >= var44[0] && var43 <= var44[1]) {
                            break;
                        }
                        var9++;
                        if (var9 >= var12) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var45 = var20[var13++];
                    var45[1] = var24;
                    var45[2] = var28 + var23;
                    var45[0] = var8;
                    this.method2086(var4, var23, var21, var6 + var8, var22, -18866, var28);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V", line = 716)
    public static void method2088(int arg0) {
        field4588 = null;
        if (arg0 < -30) {
            field4577 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIII)I", line = 727)
    public static final int method2089(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1335253409) {
            method2089(-23, 57, 3, -1, -32);
        }
        field4592++;
        int var5 = 65536 - class148.field2229[arg3 * 1024 / arg4] >> 1;
        return ((65536 - var5) * arg0 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V", line = 761)
    public static final void method2090(int arg0) {
        if (arg0 != -1535736372) {
            method2089(-84, -21, 93, 85, -18);
        }
        for (class252 var1 = (class252) class162.field2444.method1109(-101); var1 != null; var1 = (class252) class162.field2444.method1115((byte) 94)) {
            if (var1.field3768) {
                var1.method1701((byte) -49);
            }
        }
        for (class252 var2 = (class252) class316.field4775.method1109(-99); var2 != null; var2 = (class252) class316.field4775.method1115((byte) 72)) {
            if (var2.field3768) {
                var2.method1701((byte) -100);
            }
        }
        field4583++;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Ltm;", line = 796)
    public static final class163 method2091(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3370;
    }
}
