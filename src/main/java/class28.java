import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class28 extends class16 {

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    private int field399 = 1024;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    private int field400 = 1024;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    private int field412 = 819;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    private int field413 = 1024;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    private int field410 = 0;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    private int field406 = 2048;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    private int field402 = 409;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    private int field409 = 1024;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Ljava/lang/String;")
    public static String field401 = "Loading defaults - ";

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field398 = 0;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "Lkb;")
    public static class39 field415;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ZI)[I", line = 5)
    public final int[] method8(boolean arg0, int arg1) {
        field411++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            return (int[]) null;
        } else if (this.field207.field4024) {
            int var4 = 0;
            int[][] var5 = this.field207.method1785(-51);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = class276.field4376 * this.field399 >> 12;
            boolean var13 = true;
            int var14 = 0;
            int var15 = class294.field4619 * this.field402 >> 12;
            int var16 = class276.field4376 * this.field406 >> 12;
            int var17 = class294.field4619 * this.field412 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            }
            this.field408 = class276.field4376 / 8 * this.field413 >> 12;
            int var18 = class276.field4376 / var12 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field407);
            int[][] var21 = new int[var18][3];
            while (true) {
                while (true) {
                    int var22 = var12 + class66.method434(var16 - var12, var20, -27852);
                    int var23 = var15 + class66.method434(var17 - var15, var20, -27852);
                    int var24 = var9 + var22;
                    if (class276.field4376 < var24) {
                        var24 = class276.field4376;
                        var22 = class276.field4376 - var9;
                    }
                    int var26;
                    if (var10) {
                        var26 = 0;
                    } else {
                        int[] var25 = var21[var8];
                        var26 = var25[2];
                        int var27 = var8;
                        int var28 = var4 + var24;
                        if (var28 < 0) {
                            var28 += class276.field4376;
                        }
                        int var29 = 0;
                        if (class276.field4376 < var28) {
                            var28 -= class276.field4376;
                        }
                        while (true) {
                            int[] var30 = var21[var27];
                            if (var30[0] <= var28 && var28 <= var30[1]) {
                                if (var8 != var27) {
                                    int var31 = var4 + var9;
                                    if (var31 < 0) {
                                        var31 += class276.field4376;
                                    }
                                    if (var31 > class276.field4376) {
                                        var31 -= class276.field4376;
                                    }
                                    for (int var32 = 1; var32 <= var29; var32++) {
                                        int[] var33 = var21[(var8 + var32) % var14];
                                        var26 = Math.max(var26, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var29; var34++) {
                                        int[] var35 = var21[(var8 + var34) % var14];
                                        int var36 = var35[2];
                                        if (var26 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var31 < var28) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var28, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var28, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class276.field4376;
                                            }
                                            this.method187(var36, var26 - var36, (byte) 125, var5, var6 + var39, var20, var40 - var39);
                                        }
                                    }
                                }
                                var8 = var27;
                                break;
                            }
                            var29++;
                            int var10000 = ~var14;
                            var27++;
                            if (var10000 >= ~var27) {
                                var27 = 0;
                            }
                        }
                    }
                    if (var26 + var23 > class294.field4619) {
                        var23 = class294.field4619 - var26;
                    } else {
                        var13 = false;
                    }
                    if (class276.field4376 == var24) {
                        this.method187(var26, var23, (byte) 120, var5, var7 + var9, var20, var22);
                        if (var13) {
                            return var3;
                        }
                        var8 = 0;
                        var13 = true;
                        var6 = var7;
                        int[][] var41 = var21;
                        var10 = false;
                        int[] var42 = var19[var11++];
                        var42[2] = var23 + var26;
                        var42[1] = var24;
                        var21 = var19;
                        var19 = var41;
                        var14 = var11;
                        var42[0] = var9;
                        var11 = 0;
                        var7 = class66.method434(class276.field4376, var20, -27852);
                        var4 = var7 - var6;
                        var9 = 0;
                        int var43 = var4;
                        if (var4 < 0) {
                            var43 = class276.field4376 + var4;
                        }
                        if (class276.field4376 < var43) {
                            var43 -= class276.field4376;
                        }
                        while (true) {
                            int[] var44 = var21[var8];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            var8++;
                            if (var14 <= var8) {
                                var8 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var11++];
                        var45[2] = var23 + var26;
                        var45[1] = var24;
                        var45[0] = var9;
                        this.method187(var26, var23, (byte) 125, var5, var9 + var7, var20, var22);
                        var9 = var24;
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 256)
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 260)
    public static void method186(int arg0) {
        field415 = null;
        if (arg0 < 79) {
            method186(10);
        }
        field401 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLim;I)V", line = 272)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            return;
        }
        if (arg2 == 0) {
            this.field407 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field399 = arg1.method1396(-43);
        } else if (arg2 == 2) {
            this.field406 = arg1.method1396(arg0 - 93);
        } else if (arg2 == 3) {
            this.field402 = arg1.method1396(arg0 ^ 0x7E);
        } else if (arg2 == 4) {
            this.field412 = arg1.method1396(-18);
        } else if (arg2 == 5) {
            this.field413 = arg1.method1396(-106);
        } else if (arg2 == 6) {
            this.field410 = arg1.method1399(arg0 ^ 0x45E13F91);
        } else if (arg2 == 7) {
            this.field409 = arg1.method1396(-96);
        } else if (arg2 == 8) {
            this.field400 = arg1.method1396(-80);
        }
        field405++;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V", line = 385)
    public final void method55(byte arg0) {
        if (arg0 != 0) {
            this.field413 = 120;
        }
        field403++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB[[IILjava/util/Random;I)V", line = 405)
    private final void method187(int arg0, int arg1, byte arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        int var8 = this.field400 <= 0 ? 4096 : 4096 - class66.method434(this.field400, arg5, -27852);
        field414++;
        int var9 = this.field409 * this.field408 >> 12;
        int var10 = this.field408 - (var9 > 0 ? class66.method434(var9, arg5, -27852) : 0);
        if (class276.field4376 <= arg4) {
            arg4 -= class276.field4376;
        }
        if (arg2 <= 118) {
            this.method8(false, 87);
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg1 / 2;
            int var12 = arg6 / 2;
            int var13 = var12 < var10 ? var12 : var10;
            int var14 = arg4 + var13;
            int var15 = var11 < var10 ? var11 : var10;
            int var16 = arg6 - (var13 * 2);
            for (int var17 = 0; var17 < arg1; var17++) {
                int[] var18 = arg3[arg0 + var17];
                if (var15 <= var17) {
                    int var19 = arg1 - var17 - 1;
                    if (var19 < var15) {
                        int var20 = var8 * var19 / var15;
                        if (this.field410 == 0) {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class200.method1465(class148.field2215, arg4 + var23)] = var18[class200.method1465(class148.field2215, arg4 + arg6 - var23 - 1)] = var20 * var24 >> 12;
                            }
                        } else {
                            for (int var21 = 0; var21 < var13; var21++) {
                                int var22 = var8 * var21 / var13;
                                var18[class200.method1465(class148.field2215, arg4 + var21)] = var18[class200.method1465(arg4 + arg6 - var21 - 1, class148.field2215)] = var20 <= var22 ? var20 : var22;
                            }
                        }
                        if (class276.field4376 < var14 + var16) {
                            int var25 = class276.field4376 - var14;
                            class213.method1551(var18, var14, var25, var20);
                            class213.method1551(var18, 0, var16 - var25, var20);
                        } else {
                            class213.method1551(var18, var14, var16, var20);
                        }
                    } else {
                        for (int var26 = 0; var26 < var13; var26++) {
                            var18[class200.method1465(class148.field2215, arg4 + var26)] = var18[class200.method1465(class148.field2215, arg6 + arg4 - var26 - 1)] = var8 * var26 / var13;
                        }
                        if (class276.field4376 < (var14 + var16)) {
                            int var27 = class276.field4376 - var14;
                            class213.method1551(var18, var14, var27, var8);
                            class213.method1551(var18, 0, var16 - var27, var8);
                        } else {
                            class213.method1551(var18, var14, var16, var8);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var15;
                    if (this.field410 == 0) {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class200.method1465(arg4 + var31, class148.field2215)] = var18[class200.method1465(class148.field2215, arg4 - (-arg6 - -var31) - 1)] = var28 * var32 >> 12;
                        }
                    } else {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class200.method1465(class148.field2215, arg4 + var29)] = var18[class200.method1465(arg4 - var29 - (-arg6 - -1), class148.field2215)] = var30 < var28 ? var30 : var28;
                        }
                    }
                    if (var14 + var16 > class276.field4376) {
                        int var33 = class276.field4376 - var14;
                        class213.method1551(var18, var14, var33, var28);
                        class213.method1551(var18, 0, var16 - var33, var28);
                    } else {
                        class213.method1551(var18, var14, var16, var28);
                    }
                }
            }
        } else if (arg4 + arg6 > class276.field4376) {
            int var34 = class276.field4376 - arg4;
            for (int var35 = 0; var35 < arg1; var35++) {
                int[] var36 = arg3[arg0 + var35];
                class213.method1551(var36, arg4, var34, var8);
                class213.method1551(var36, 0, arg6 - var34, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg1; var37++) {
                class213.method1551(arg3[arg0 + var37], arg4, arg6, var8);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lkb;II)Ln;", line = 601)
    public static final class298 method188(class39 arg0, int arg1, int arg2) {
        field404++;
        if (arg1 != 31478) {
            method188((class39) null, 68, -107);
        }
        return class221.method1609(arg0, 5282, arg2) ? class162.method1127((byte) -124) : null;
    }
}
