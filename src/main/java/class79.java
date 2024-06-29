import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class79 extends class86 {

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    private int field1150 = 2048;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    private int field1140 = 1024;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    private int field1152 = 1024;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    private int field1157 = 409;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    private int field1160 = 819;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    private int field1149 = 1024;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    private int field1158 = 0;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field1148 = 0;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    private int field1163 = 1024;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1142 = "flash1:";

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1146 = "Face here";

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "[I")
    public static int[] field1153 = new int[5];

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1144 = "red:";

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 8)
    public class79() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I", line = 25)
    public final int[] method158(int arg0, int arg1) {
        field1155++;
        if (arg1 < 7) {
            field1153 = (int[]) null;
        }
        int[] var3 = this.field1225.method1914(arg0, 82);
        if (!this.field1225.field3995) {
            return var3;
        }
        int[][] var4 = this.field1225.method1909((byte) 99);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class181.field2836 * this.field1157 >> 12;
        int var15 = class93.field1424 * this.field1152 >> 12;
        int var16 = class93.field1424 * this.field1150 >> 12;
        int var17 = class181.field2836 * this.field1160 >> 12;
        if (var17 <= 1) {
            return var4[arg0];
        }
        int var18 = class93.field1424 / var15 + 1;
        int[][] var19 = new int[var18][3];
        this.field1145 = class93.field1424 / 8 * this.field1149 >> 12;
        Random var20 = new Random((long) this.field1148);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = var15 + class67.method659(var16 - var15, var20, true);
                int var23 = var14 + class67.method659(var17 - var14, var20, true);
                int var24 = var8 + var22;
                if (class93.field1424 < var24) {
                    var22 = class93.field1424 - var8;
                    var24 = class93.field1424;
                }
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int var26 = var6;
                    int var27 = 0;
                    int[] var28 = var21[var6];
                    var25 = var28[2];
                    int var29 = var7 + var24;
                    if (var29 < 0) {
                        var29 += class93.field1424;
                    }
                    if (var29 > class93.field1424) {
                        var29 -= class93.field1424;
                    }
                    while (true) {
                        int[] var30 = var21[var26];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var6 != var26) {
                                int var31 = var7 + var8;
                                if (var31 < 0) {
                                    var31 += class93.field1424;
                                }
                                if (var31 > class93.field1424) {
                                    var31 -= class93.field1424;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var21[(var6 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var21[(var6 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
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
                                            var40 = class93.field1424;
                                        }
                                        this.method728(var39 + var5, var36, var40 - var39, var4, var25 - var36, -1, var20);
                                    }
                                }
                            }
                            var6 = var26;
                            break;
                        }
                        var27++;
                        var26++;
                        if (var12 <= var26) {
                            var26 = 0;
                        }
                    }
                }
                if (var25 + var23 > class181.field2836) {
                    var23 = class181.field2836 - var25;
                } else {
                    var10 = false;
                }
                if (class93.field1424 == var24) {
                    this.method728(var8 + var9, var25, var22, var4, var23, -1, var20);
                    if (var10) {
                        return var3;
                    }
                    var5 = var9;
                    var6 = 0;
                    var10 = true;
                    var11 = false;
                    int[] var42 = var19[var13++];
                    var12 = var13;
                    var42[0] = var8;
                    var8 = 0;
                    var13 = 0;
                    var42[1] = var24;
                    var42[2] = var23 + var25;
                    int[][] var43 = var21;
                    var9 = class67.method659(class93.field1424, var20, true);
                    var7 = var9 - var5;
                    var21 = var19;
                    int var44 = var7;
                    if (var7 < 0) {
                        var44 = class93.field1424 + var7;
                    }
                    if (var44 > class93.field1424) {
                        var44 -= class93.field1424;
                    }
                    while (true) {
                        int[] var45 = var21[var6];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            var19 = var43;
                            break;
                        }
                        var6++;
                        if (var12 <= var6) {
                            var6 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var13++];
                    var41[0] = var8;
                    var41[1] = var24;
                    var41[2] = var25 + var23;
                    this.method728(var8 + var9, var25, var22, var4, var23, -1, var20);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLug;)V", line = 273)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            method725(40);
        }
        if (arg0 == 0) {
            this.field1148 = arg2.method281(-126);
        } else if (arg0 == 1) {
            this.field1152 = arg2.method314((byte) 121);
        } else if (arg0 == 2) {
            this.field1150 = arg2.method314((byte) 28);
        } else if (arg0 == 3) {
            this.field1157 = arg2.method314((byte) 64);
        } else if (arg0 == 4) {
            this.field1160 = arg2.method314((byte) 78);
        } else if (arg0 == 5) {
            this.field1149 = arg2.method314((byte) 89);
        } else if (arg0 == 6) {
            this.field1158 = arg2.method281(-125);
        } else if (arg0 == 7) {
            this.field1140 = arg2.method314((byte) 93);
        } else if (arg0 == 8) {
            this.field1163 = arg2.method314((byte) 93);
        }
        field1151++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lug;B)Ls;", line = 367)
    public static final class352 method723(class25 arg0, byte arg1) {
        field1161++;
        int var2 = 32 / ((arg1 + 68) / 47);
        return new class352(arg0.method296(-91), arg0.method296(-101), arg0.method296(-94), arg0.method296(-93), arg0.method265(true), arg0.method265(true), arg0.method281(114));
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 381)
    public final void method476(int arg0) {
        if (arg0 == 0) {
            field1156++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)Lqn;", line = 396)
    public static final class361 method724(int arg0) {
        field1154++;
        int var1 = class62.field957[0] * class358.field5694[0];
        byte[] var2 = class172.field2732[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class38.field582[class301.method2169(255, var2[var4])];
        }
        class361 var5 = new class361(class280.field4332, class49.field776, class150.field2449[0], class89.field1262[0], class358.field5694[0], class62.field957[0], var3);
        if (arg0 > -71) {
            field1146 = (String) null;
        }
        class29.method330(-1);
        return var5;
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V", line = 425)
    public static void method725(int arg0) {
        field1146 = null;
        field1144 = null;
        field1142 = null;
        field1153 = null;
        if (arg0 != 2) {
            field1146 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLjava/lang/String;)J", line = 449)
    public static final long method726(byte arg0, String arg1) {
        field1143++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 > -72) {
            return 62L;
        } else {
            for (int var5 = 0; var5 < var2; var5++) {
                var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(II)Lv;", line = 485)
    public static final class122 method727(int arg0, int arg1) {
        field1141++;
        if (arg0 > -7) {
            field1146 = (String) null;
        }
        class122 var2 = (class122) class104.field1570.method654(97, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field471.method187(1, arg1, -1);
        class122 var4 = new class122();
        var4.field1965 = arg1;
        if (var3 != null) {
            var4.method1056(new class25(var3), false);
        }
        var4.method1061(-1);
        if (var4.field1962 == 2 && class90.field1275.method370((byte) -120, (long) arg1) == null) {
            class90.field1275.method375(new class164(class329.field5073), (long) arg1, -79);
            class159.field2536[class329.field5073++] = var4;
        }
        class104.field1570.method652(-50, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III[[IIILjava/util/Random;)V", line = 526)
    private final void method728(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        field1159++;
        int var8 = this.field1163 > 0 ? 4096 - class67.method659(this.field1163, arg6, true) : 4096;
        int var9 = this.field1145 * this.field1140 >> 12;
        int var10 = this.field1145 - (var9 <= 0 ? 0 : class67.method659(var9, arg6, true));
        if (arg0 >= class93.field1424) {
            arg0 -= class93.field1424;
        }
        if (arg5 > ~var10) {
            if (arg4 <= 0 || arg2 <= 0) {
                return;
            }
            int var15 = arg2 / 2;
            int var16 = arg4 / 2;
            int var17 = var10 > var16 ? var16 : var10;
            int var18 = var15 >= var10 ? var10 : var15;
            int var19 = arg0 + var18;
            int var20 = arg2 - (var18 * 2);
            for (int var21 = 0; var21 < arg4; var21++) {
                int[] var22 = arg3[var21 + arg1];
                if (var17 <= var21) {
                    int var23 = arg4 - var21 - 1;
                    if (var23 >= var17) {
                        for (int var24 = 0; var24 < var18; var24++) {
                            var22[class301.method2169(class313.field4848, arg0 + var24)] = var22[class301.method2169(class313.field4848, arg0 + arg2 - var24 - 1)] = var8 * var24 / var18;
                        }
                        if ((var19 + var20) > class93.field1424) {
                            int var25 = class93.field1424 - var19;
                            class65.method639(var22, var19, var25, var8);
                            class65.method639(var22, 0, var20 - var25, var8);
                        } else {
                            class65.method639(var22, var19, var20, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var17;
                        if (this.field1158 == 0) {
                            for (int var27 = 0; var27 < var18; var27++) {
                                int var28 = var8 * var27 / var18;
                                var22[class301.method2169(class313.field4848, arg0 + var27)] = var22[class301.method2169(class313.field4848, arg0 + arg2 - var27 - 1)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var18; var29++) {
                                int var30 = var8 * var29 / var18;
                                var22[class301.method2169(arg0 + var29, class313.field4848)] = var22[class301.method2169(arg0 + arg2 - var29 - 1, class313.field4848)] = var26 > var30 ? var30 : var26;
                            }
                        }
                        if ((var19 + var20) > class93.field1424) {
                            int var31 = class93.field1424 - var19;
                            class65.method639(var22, var19, var31, var26);
                            class65.method639(var22, 0, var20 - var31, var26);
                        } else {
                            class65.method639(var22, var19, var20, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var17;
                    if (this.field1158 == 0) {
                        for (int var33 = 0; var33 < var18; var33++) {
                            int var34 = var8 * var33 / var18;
                            var22[class301.method2169(class313.field4848, arg0 + var33)] = var22[class301.method2169(class313.field4848, arg0 + arg2 - var33 - 1)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var18; var35++) {
                            int var36 = var8 * var35 / var18;
                            var22[class301.method2169(class313.field4848, arg0 + var35)] = var22[class301.method2169(arg0 + arg2 - var35 - 1, class313.field4848)] = var36 >= var32 ? var32 : var36;
                        }
                    }
                    if (var19 + var20 > class93.field1424) {
                        int var37 = class93.field1424 - var19;
                        class65.method639(var22, var19, var37, var32);
                        class65.method639(var22, 0, var20 - var37, var32);
                    } else {
                        class65.method639(var22, var19, var20, var32);
                    }
                }
            }
        } else if (class93.field1424 < arg0 + arg2) {
            int var11 = class93.field1424 - arg0;
            for (int var12 = 0; var12 < arg4; var12++) {
                int[] var13 = arg3[arg1 + var12];
                class65.method639(var13, arg0, var11, var8);
                class65.method639(var13, 0, arg2 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg4; var14++) {
                class65.method639(arg3[arg1 + var14], arg0, arg2, var8);
            }
        }
    }
}
