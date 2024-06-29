import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class74 extends class285 {

    @OriginalMember(owner = "client!fi", name = "S", descriptor = "I")
    private int field1033 = 2048;

    @OriginalMember(owner = "client!fi", name = "db", descriptor = "I")
    private int field1043 = 409;

    @OriginalMember(owner = "client!fi", name = "hb", descriptor = "I")
    private int field1047 = 1024;

    @OriginalMember(owner = "client!fi", name = "R", descriptor = "I")
    private int field1032 = 0;

    @OriginalMember(owner = "client!fi", name = "gb", descriptor = "I")
    private int field1046 = 1024;

    @OriginalMember(owner = "client!fi", name = "fb", descriptor = "I")
    private int field1045 = 819;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    private int field1029 = 1024;

    @OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
    private int field1044 = 0;

    @OriginalMember(owner = "client!fi", name = "T", descriptor = "I")
    private int field1034 = 1024;

    @OriginalMember(owner = "client!fi", name = "Z", descriptor = "Ldb;")
    public static class102 field1039 = new class102(64);

    @OriginalMember(owner = "client!fi", name = "jb", descriptor = "[Lqm;")
    public static class334[] field1049 = new class334[2048];

    @OriginalMember(owner = "client!fi", name = "lb", descriptor = "Z")
    public static boolean field1051 = false;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fi", name = "Q", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!fi", name = "W", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!fi", name = "X", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!fi", name = "ab", descriptor = "I")
    private int field1040;

    @OriginalMember(owner = "client!fi", name = "bb", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fi", name = "cb", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!fi", name = "ib", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!fi", name = "kb", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V", line = 6)
    public static final void method490(int arg0, int arg1, int arg2, int arg3) {
        class204 var4 = class324.field5032[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class38 var5 = var4.field3342;
        if (var5 != null) {
            var5.field487 = var5.field487 * arg3 / 16;
            var5.field493 = var5.field493 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "(I)V", line = 24)
    public static void method491(int arg0) {
        field1049 = null;
        field1039 = null;
        if (arg0 != 0) {
            field1051 = false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BLjava/util/Random;II[[III)V", line = 36)
    private final void method492(byte arg0, Random arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        field1031++;
        int var8 = this.field1029 > 0 ? 4096 - class158.method1138(this.field1029, true, arg1) : 4096;
        int var9 = this.field1047 * this.field1040 >> 12;
        int var10 = this.field1040 - (var9 > 0 ? class158.method1138(var9, true, arg1) : 0);
        if (arg0 != -66) {
            method491(39);
        }
        if (arg3 >= class287.field4599) {
            arg3 -= class287.field4599;
        }
        if (var10 > 0) {
            if (arg6 <= 0 || arg2 <= 0) {
                return;
            }
            int var15 = arg2 / 2;
            int var16 = arg6 / 2;
            int var17 = var10 <= var16 ? var10 : var16;
            int var18 = var15 >= var10 ? var10 : var15;
            int var19 = arg3 + var18;
            int var20 = arg2 - var18 * 2;
            for (int var21 = 0; var21 < arg6; var21++) {
                int[] var22 = arg4[arg5 + var21];
                if (var17 <= var21) {
                    int var23 = arg6 - var21 - 1;
                    if (var23 < var17) {
                        int var24 = var8 * var23 / var17;
                        if (this.field1044 == 0) {
                            for (int var25 = 0; var25 < var18; var25++) {
                                int var26 = var8 * var25 / var18;
                                var22[client.method767(class112.field1717, arg3 + var25)] = var22[client.method767(class112.field1717, arg2 + arg3 - (var25 - -1))] = var24 * var26 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var18; var27++) {
                                int var28 = var8 * var27 / var18;
                                var22[client.method767(arg3 + var27, class112.field1717)] = var22[client.method767(class112.field1717, arg2 + arg3 - var27 - 1)] = var24 <= var28 ? var24 : var28;
                            }
                        }
                        if (var19 + var20 > class287.field4599) {
                            int var29 = class287.field4599 - var19;
                            class9.method49(var22, var19, var29, var24);
                            class9.method49(var22, 0, var20 - var29, var24);
                        } else {
                            class9.method49(var22, var19, var20, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var18; var30++) {
                            var22[client.method767(arg3 + var30, class112.field1717)] = var22[client.method767(class112.field1717, arg2 + arg3 - var30 - 1)] = var8 * var30 / var18;
                        }
                        if ((var19 + var20) <= class287.field4599) {
                            class9.method49(var22, var19, var20, var8);
                        } else {
                            int var31 = class287.field4599 - var19;
                            class9.method49(var22, var19, var31, var8);
                            class9.method49(var22, 0, var20 - var31, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var17;
                    if (this.field1044 == 0) {
                        for (int var35 = 0; var35 < var18; var35++) {
                            int var36 = var8 * var35 / var18;
                            var22[client.method767(arg3 + var35, class112.field1717)] = var22[client.method767(arg2 + arg3 - var35 - 1, class112.field1717)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var18; var33++) {
                            int var34 = var8 * var33 / var18;
                            var22[client.method767(class112.field1717, arg3 + var33)] = var22[client.method767(arg3 + arg2 - var33 - 1, class112.field1717)] = var34 >= var32 ? var32 : var34;
                        }
                    }
                    if (class287.field4599 >= var19 + var20) {
                        class9.method49(var22, var19, var20, var32);
                    } else {
                        int var37 = class287.field4599 - var19;
                        class9.method49(var22, var19, var37, var32);
                        class9.method49(var22, 0, var20 - var37, var32);
                    }
                }
            }
        } else if (class287.field4599 < (arg3 + arg2)) {
            int var11 = class287.field4599 - arg3;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var13 = arg4[arg5 + var12];
                class9.method49(var13, arg3, var11, var8);
                class9.method49(var13, 0, arg2 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg6; var14++) {
                class9.method49(arg4[arg5 + var14], arg3, arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V", line = 230)
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)[I", line = 245)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(127, arg1);
        if (!arg0) {
            this.method492((byte) 105, (Random) null, -29, -125, (int[][]) ((int[][]) null), -31, 113);
        }
        field1030++;
        if (!this.field4573.field2420) {
            return var3;
        }
        int[][] var4 = this.field4573.method1117((byte) 56);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class287.field4599 * this.field1046 >> 12;
        int var15 = class287.field4599 * this.field1033 >> 12;
        int var16 = class27.field372 * this.field1043 >> 12;
        int var17 = class27.field372 * this.field1045 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field1040 = class287.field4599 / 8 * this.field1034 >> 12;
        int var18 = class287.field4599 / var14 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field1032);
        while (true) {
            while (true) {
                int var22 = var14 + class158.method1138(var15 - var14, true, var21);
                int var23 = var16 + class158.method1138(var17 - var16, true, var21);
                int var24 = var8 + var22;
                if (var24 > class287.field4599) {
                    var24 = class287.field4599;
                    var22 = class287.field4599 - var8;
                }
                int var27;
                if (var10) {
                    var27 = 0;
                } else {
                    int var25 = var9;
                    int[] var26 = var20[var9];
                    var27 = var26[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class287.field4599;
                    }
                    if (class287.field4599 < var29) {
                        var29 -= class287.field4599;
                    }
                    while (true) {
                        int[] var30 = var20[var25];
                        if (var30[0] <= var29 && var30[1] >= var29) {
                            if (var9 != var25) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class287.field4599;
                                }
                                if (class287.field4599 < var31) {
                                    var31 -= class287.field4599;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var9 + var32) % var13];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var9 + var34) % var13];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
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
                                            var40 = class287.field4599;
                                        }
                                        this.method492((byte) -66, var21, var40 - var39, var7 + var39, var4, var36, var27 - var36);
                                    }
                                }
                            }
                            var9 = var25;
                            break;
                        }
                        var28++;
                        var25++;
                        if (var25 >= var13) {
                            var25 = 0;
                        }
                    }
                }
                if (class27.field372 >= (var27 + var23)) {
                    var11 = false;
                } else {
                    var23 = class27.field372 - var27;
                }
                if (class287.field4599 == var24) {
                    this.method492((byte) -66, var21, var22, var6 + var8, var4, var27, var23);
                    if (var11) {
                        return var3;
                    }
                    var7 = var6;
                    var10 = false;
                    var11 = true;
                    var9 = 0;
                    int[] var41 = var19[var12++];
                    var41[1] = var24;
                    var41[2] = var23 + var27;
                    int[][] var42 = var20;
                    var13 = var12;
                    var20 = var19;
                    var41[0] = var8;
                    var19 = var42;
                    var12 = 0;
                    var8 = 0;
                    var6 = class158.method1138(class287.field4599, true, var21);
                    var5 = var6 - var7;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class287.field4599 + var5;
                    }
                    if (class287.field4599 < var43) {
                        var43 -= class287.field4599;
                    }
                    while (true) {
                        int[] var44 = var20[var9];
                        if (var44[0] <= var43 && var43 <= var44[1]) {
                            break;
                        }
                        var9++;
                        if (var13 <= var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var12++];
                    var45[1] = var24;
                    var45[0] = var8;
                    var45[2] = var23 + var27;
                    this.method492((byte) -66, var21, var22, var6 + var8, var4, var27, var23);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZLjj;I)V", line = 501)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field1037++;
        if (arg2 == 0) {
            this.field1032 = arg1.method286((byte) -64);
        } else if (arg2 == 1) {
            this.field1046 = arg1.method271(21081);
        } else if (arg2 == 2) {
            this.field1033 = arg1.method271(21081);
        } else if (arg2 == 3) {
            this.field1043 = arg1.method271(21081);
        } else if (arg2 == 4) {
            this.field1045 = arg1.method271(21081);
        } else if (arg2 == 5) {
            this.field1034 = arg1.method271(21081);
        } else if (arg2 == 6) {
            this.field1044 = arg1.method286((byte) -107);
        } else if (arg2 == 7) {
            this.field1047 = arg1.method271(21081);
        } else if (arg2 == 8) {
            this.field1029 = arg1.method271(21081);
        }
        if (!arg0) {
            method491(81);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lak;ILak;)V", line = 599)
    public static final void method493(class172 arg0, int arg1, class172 arg2) {
        class2.field30 = class160.method1142(arg2, arg1, -10596, class39.field504, arg0);
        field1038++;
        if (class232.field3690) {
            class121.field1846 = class26.method151(true, arg2, class39.field504, arg0, 0);
        } else {
            class121.field1846 = (class345) class2.field30;
        }
        class296.field4688 = class160.method1142(arg2, 0, -10596, class36.field482, arg0);
        class282.field4538 = class160.method1142(arg2, 0, arg1 ^ 0xFFFFD69C, class97.field1339, arg0);
    }

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "(I)V", line = 614)
    public final void method361(int arg0) {
        field1041++;
        int var2 = -128 / ((42 - arg0) / 36);
    }

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "(I)V", line = 634)
    public static final void method494(int arg0) {
        field1035++;
        if (class145.field2254 == 0) {
            return;
        }
        try {
            int var1 = -32 % ((76 - arg0) / 46);
            if ((++class10.field128) > 1500) {
                if (class320.field4966 != null) {
                    class320.field4966.method91(-67);
                    class320.field4966 = null;
                }
                if (class246.field3889 >= 1) {
                    class39.field514 = -5;
                    class145.field2254 = 0;
                    return;
                }
                class145.field2254 = 1;
                class246.field3889++;
                class10.field128 = 0;
                if (class178.field2965 == class147.field2281) {
                    class147.field2281 = class210.field3451;
                } else {
                    class147.field2281 = class178.field2965;
                }
            }
            if (class145.field2254 == 1) {
                class108.field1608 = class14.field159.method904(class245.field3877, 57, class147.field2281);
                class145.field2254 = 2;
            }
            if (class145.field2254 == 2) {
                if (class108.field1608.field2661 == 2) {
                    throw new IOException();
                }
                if (class108.field1608.field2661 != 1) {
                    return;
                }
                class320.field4966 = new class15((Socket) class108.field1608.field2664, class14.field159);
                class108.field1608 = null;
                class320.field4966.method85((byte) -121, class194.field3175.field586, class194.field3175.field573, 0);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(100);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(90);
                }
                int var2 = class320.field4966.method86((byte) 118);
                if (class198.field3225 != null) {
                    class198.field3225.method2219(78);
                }
                if (class49.field693 != null) {
                    class49.field693.method2219(122);
                }
                if (var2 != 101) {
                    class145.field2254 = 0;
                    class39.field514 = var2;
                    class320.field4966.method91(-74);
                    class320.field4966 = null;
                    return;
                }
                class145.field2254 = 3;
            }
            if (class145.field2254 == 3) {
                if (class320.field4966.method87(5000) >= 2) {
                    int var3 = class320.field4966.method86((byte) 118) << 8 | class320.field4966.method86((byte) 118);
                    class164.method1209(1768, var3);
                    if (class21.field306 != -1) {
                        class145.field2254 = 0;
                        class320.field4966.method91(-67);
                        class320.field4966 = null;
                        class62.method420(1);
                        return;
                    }
                    class145.field2254 = 0;
                    class39.field514 = 6;
                    class320.field4966.method91(-44);
                    class320.field4966 = null;
                    return;
                }
                return;
            }
        } catch (IOException var5) {
            if (class320.field4966 != null) {
                class320.field4966.method91(-112);
                class320.field4966 = null;
            }
            if (class246.field3889 < 1) {
                class145.field2254 = 1;
                class10.field128 = 0;
                class246.field3889++;
                if (class178.field2965 == class147.field2281) {
                    class147.field2281 = class210.field3451;
                } else {
                    class147.field2281 = class178.field2965;
                }
            } else {
                class39.field514 = -4;
                class145.field2254 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V", line = 785)
    public static final void method495(byte arg0) {
        class110.field1637.method707(0);
        if (arg0 != -97) {
            field1049 = (class334[]) null;
        }
        class157.field2529.method707(0);
        field1042++;
        class193.field3141.method707(0);
    }
}
