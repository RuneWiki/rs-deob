import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class269 extends class240 {

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    private int field4632 = 0;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    private int field4637 = 0;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    private int field4630 = 1024;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "I")
    private int field4651 = 819;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    private int field4635 = 2048;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "I")
    private int field4646 = 1024;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    private int field4650 = 1024;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    private int field4652 = 409;

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "I")
    private int field4653 = 1024;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Z")
    public static boolean field4641 = false;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "I")
    public static int field4649 = 0;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Ljava/util/Random;")
    public static Random field4631 = new Random();

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "I")
    public static int field4654 = 0;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILjava/util/Random;Z[[I)V", line = 5)
    private final void method1881(int arg0, int arg1, int arg2, int arg3, Random arg4, boolean arg5, int[][] arg6) {
        field4647++;
        if (arg5) {
            field4649 = 41;
        }
        int var8 = this.field4630 > 0 ? 4096 - class206.method1439(arg4, (byte) 125, this.field4630) : 4096;
        int var9 = this.field4650 * this.field4648 >> 12;
        int var10 = this.field4648 - (var9 <= 0 ? 0 : class206.method1439(arg4, (byte) 123, var9));
        if (arg1 >= class169.field2936) {
            arg1 -= class169.field2936;
        }
        if (var10 > 0) {
            if (arg0 <= 0 || arg2 <= 0) {
                return;
            }
            int var11 = arg2 / 2;
            int var12 = arg0 / 2;
            int var13 = var12 >= var10 ? var10 : var12;
            int var14 = var10 > var11 ? var11 : var10;
            int var15 = arg1 + var14;
            int var16 = arg2 - (var14 * 2);
            for (int var17 = 0; var17 < arg0; var17++) {
                int[] var18 = arg6[var17 + arg3];
                if (var13 <= var17) {
                    int var19 = arg0 - var17 - 1;
                    if (var13 <= var19) {
                        for (int var20 = 0; var20 < var14; var20++) {
                            var18[class224.method1614(arg1 + var20, class132.field2356)] = var18[class224.method1614(arg1 + arg2 - var20 - 1, class132.field2356)] = var8 * var20 / var14;
                        }
                        if (class169.field2936 >= (var15 + var16)) {
                            class95.method718(var18, var15, var16, var8);
                        } else {
                            int var21 = class169.field2936 - var15;
                            class95.method718(var18, var15, var21, var8);
                            class95.method718(var18, 0, var16 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var13;
                        if (this.field4632 == 0) {
                            for (int var23 = 0; var23 < var14; var23++) {
                                int var24 = var8 * var23 / var14;
                                var18[class224.method1614(class132.field2356, arg1 + var23)] = var18[class224.method1614(arg1 + arg2 - var23 - 1, class132.field2356)] = var22 * var24 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var14; var25++) {
                                int var26 = var8 * var25 / var14;
                                var18[class224.method1614(arg1 + var25, class132.field2356)] = var18[class224.method1614(arg1 - (var25 - arg2) - 1, class132.field2356)] = var22 <= var26 ? var22 : var26;
                            }
                        }
                        if (var15 + var16 <= class169.field2936) {
                            class95.method718(var18, var15, var16, var22);
                        } else {
                            int var27 = class169.field2936 - var15;
                            class95.method718(var18, var15, var27, var22);
                            class95.method718(var18, 0, var16 - var27, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var13;
                    if (this.field4632 == 0) {
                        for (int var29 = 0; var29 < var14; var29++) {
                            int var30 = var8 * var29 / var14;
                            var18[class224.method1614(arg1 + var29, class132.field2356)] = var18[class224.method1614(class132.field2356, arg1 + arg2 - var29 - 1)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var14; var31++) {
                            int var32 = var8 * var31 / var14;
                            var18[class224.method1614(class132.field2356, arg1 + var31)] = var18[class224.method1614(arg1 + arg2 - var31 - 1, class132.field2356)] = var32 >= var28 ? var28 : var32;
                        }
                    }
                    if (class169.field2936 >= var15 + var16) {
                        class95.method718(var18, var15, var16, var28);
                    } else {
                        int var33 = class169.field2936 - var15;
                        class95.method718(var18, var15, var33, var28);
                        class95.method718(var18, 0, var16 - var33, var28);
                    }
                }
            }
        } else if (class169.field2936 >= arg1 + arg2) {
            for (int var34 = 0; var34 < arg0; var34++) {
                class95.method718(arg6[arg3 + var34], arg1, arg2, var8);
            }
        } else {
            int var35 = class169.field2936 - arg1;
            for (int var36 = 0; var36 < arg0; var36++) {
                int[] var37 = arg6[arg3 + var36];
                class95.method718(var37, arg1, var35, var8);
                class95.method718(var37, 0, arg2 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILqm;I)[Ldb;", line = 201)
    public static final class175[] method1882(int arg0, int arg1, class222 arg2, int arg3) {
        field4638++;
        if (class135.method966(arg0 ^ 0xFFFFB231, arg1, arg3, arg2)) {
            return arg0 == -19903 ? class251.method1802(0) : (class175[]) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 224)
    public final void method288(int arg0) {
        field4636++;
        if (arg0 != 17772) {
            method1887(-90, true, 62, -21, 0, 77);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 569)
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V", line = 246)
    public static void method1883(byte arg0) {
        field4631 = null;
        if (arg0 != -88) {
            field4649 = 116;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I", line = 260)
    public final int[] method12(int arg0, int arg1) {
        field4655++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[][] var4 = this.field4094.method175(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class169.field2936 * this.field4646 >> 12;
            int var15 = class169.field2936 * this.field4635 >> 12;
            int var16 = class131.field2320 * this.field4652 >> 12;
            int var17 = class131.field2320 * this.field4651 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            }
            this.field4648 = class169.field2936 / 8 * this.field4653 >> 12;
            int var18 = class169.field2936 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field4637);
            int[][] var21 = new int[var18][3];
            while (true) {
                while (true) {
                    int var22 = class206.method1439(var20, (byte) 127, var15 - var14) + var14;
                    int var23 = var8 + var22;
                    int var24 = var16 + class206.method1439(var20, (byte) 124, var17 - var16);
                    if (class169.field2936 < var23) {
                        var23 = class169.field2936;
                        var22 = class169.field2936 - var8;
                    }
                    int var25;
                    if (var10) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var19[var9];
                        int var28 = 0;
                        var25 = var27[2];
                        int var29 = var5 + var23;
                        if (var29 < 0) {
                            var29 += class169.field2936;
                        }
                        if (class169.field2936 < var29) {
                            var29 -= class169.field2936;
                        }
                        while (true) {
                            int[] var30 = var19[var26];
                            if (var30[0] <= var29 && var29 <= var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var8 + var5;
                                    if (var31 < 0) {
                                        var31 += class169.field2936;
                                    }
                                    if (class169.field2936 < var31) {
                                        var31 -= class169.field2936;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var19[(var9 + var32) % var11];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var19[(var9 + var34) % var11];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var31 < var29) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var29, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class169.field2936;
                                            }
                                            this.method1881(var25 - var36, var7 + var39, var40 - var39, var36, var20, false, var4);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            int var10000 = ~var11;
                            var26++;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                            var28++;
                        }
                    }
                    if (class131.field2320 >= var24 + var25) {
                        var12 = false;
                    } else {
                        var24 = class131.field2320 - var25;
                    }
                    if (class169.field2936 == var23) {
                        this.method1881(var24, var6 + var8, var22, var25, var20, false, var4);
                        if (var12) {
                            return arg0 == 64 ? var3 : (int[]) null;
                        }
                        var12 = true;
                        var10 = false;
                        int[][] var41 = var19;
                        var7 = var6;
                        int[] var42 = var21[var13++];
                        var42[0] = var8;
                        var19 = var21;
                        var21 = var41;
                        var42[1] = var23;
                        var8 = 0;
                        var11 = var13;
                        var42[2] = var25 + var24;
                        var6 = class206.method1439(var20, (byte) 122, class169.field2936);
                        var9 = 0;
                        var5 = var6 - var7;
                        var13 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class169.field2936 + var5;
                        }
                        if (class169.field2936 < var43) {
                            var43 -= class169.field2936;
                        }
                        while (true) {
                            int[] var44 = var19[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            var9++;
                            if (var11 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var21[var13++];
                        var45[1] = var23;
                        var45[2] = var24 + var25;
                        var45[0] = var8;
                        this.method1881(var24, var6 + var8, var22, var25, var20, false, var4);
                        var8 = var23;
                    }
                }
            }
        } else if (arg0 == 64) {
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 509)
    public static final void method1884(boolean arg0) {
        field4644++;
        if (!arg0) {
            field4641 = false;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class315.field5332[var1] = false;
        }
        class113.field2082 = -1;
        class218.field3703 = -1;
        class238.field4054 = 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B[Lcd;)[Lcd;", line = 531)
    public static final class64[] method1885(byte arg0, class64[] arg1) {
        field4639++;
        class64[] var2 = new class64[5];
        if (arg0 != 26) {
            return (class64[]) null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class104.method768(new class64[] { class310.method2149(var3, (byte) 125), class183.field3132 }, false);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class104.method768(new class64[] { var2[var3], arg1[var3] }, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIB)V", line = 557)
    public static final void method1886(int arg0, int arg1, byte arg2) {
        field4633++;
        class299 var3 = class158.method1135(arg1, -115, 1);
        var3.method2091(76);
        var3.field5153 = arg0;
        int var4 = -119 / ((-arg2 - 16) / 56);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZIIII)V", line = 579)
    public static final void method1887(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg0;
        int var7 = arg2 - arg4;
        field4642++;
        if (var7 == 0) {
            if (var6 != 0) {
                class142.method1007((byte) -92, arg5, arg3, arg0, arg4);
            }
        } else if (var6 == 0) {
            class24.method226(arg0, arg3, (byte) 104, arg4, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg4;
                arg4 = arg0;
                arg0 = var9;
                int var10 = arg2;
                arg2 = arg5;
                arg5 = var10;
            }
            if (arg2 < arg4) {
                int var11 = arg0;
                arg0 = arg5;
                int var12 = arg4;
                arg4 = arg2;
                arg5 = var11;
                arg2 = var12;
            }
            if (!arg1) {
                method1887(-104, false, 103, -19, -42, 38);
            }
            int var13 = arg2 - arg4;
            int var14 = arg5 - arg0;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = -(var13 >> 1);
            int var16 = arg0;
            int var17 = arg5 <= arg0 ? -1 : 1;
            if (var8) {
                for (int var18 = arg4; var18 <= arg2; var18++) {
                    class124.field2241[var18][var16] = arg3;
                    var15 += var14;
                    if (var15 > 0) {
                        var15 -= var13;
                        var16 += var17;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg2; var19++) {
                    class124.field2241[var16][var19] = arg3;
                    var15 += var14;
                    if (var15 > 0) {
                        var15 -= var13;
                        var16 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILqm;)V", line = 718)
    public static final void method1888(int arg0, class222 arg1) {
        client.field4166 = arg1;
        field4640++;
        if (arg0 != 20430) {
            method1884(false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V", line = 730)
    public static final void method1889(boolean arg0, int arg1) {
        field4645++;
        class220.field3736--;
        if (class220.field3736 == arg1) {
            return;
        }
        class95.method717(class153.field2715, arg1 + 1, class153.field2715, arg1, class220.field3736 - arg1);
        class95.method717(class69.field1334, arg1 + 1, class69.field1334, arg1, class220.field3736 - arg1);
        class95.method714(class289.field4934, arg1 + 1, class289.field4934, arg1, class220.field3736 - arg1);
        class95.method720(class64.field1237, arg1 + 1, class64.field1237, arg1, class220.field3736 - arg1);
        class95.method719(class223.field3806, arg1 + 1, class223.field3806, arg1, class220.field3736 - arg1);
        class95.method719(class235.field3964, arg1 + 1, class235.field3964, arg1, class220.field3736 - arg1);
        if (!arg0) {
            method1886(-86, 8, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V", line = 761)
    public static final void method1890(int arg0, int arg1) {
        field4643++;
        class299 var2 = class158.method1135(arg1, -125, arg0);
        var2.method2093((byte) -20);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILkh;)V", line = 780)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field4634++;
        if (arg0 != 2) {
            this.field4651 = -37;
        }
        if (arg1 == 0) {
            this.field4637 = arg2.method152((byte) -110);
        } else if (arg1 == 1) {
            this.field4646 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field4635 = arg2.method112((byte) 92);
        } else if (arg1 == 3) {
            this.field4652 = arg2.method112((byte) 92);
        } else if (arg1 == 4) {
            this.field4651 = arg2.method112((byte) 92);
        } else if (arg1 == 5) {
            this.field4653 = arg2.method112((byte) 92);
        } else if (arg1 == 6) {
            this.field4632 = arg2.method152((byte) -71);
        } else if (arg1 == 7) {
            this.field4650 = arg2.method112((byte) 92);
        } else if (arg1 == 8) {
            this.field4630 = arg2.method112((byte) 92);
        }
    }
}
