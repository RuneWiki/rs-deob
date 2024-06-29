import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class80 extends class203 {

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Lhe;")
    public class47 field1214 = new class47();

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Lsc;")
    public class75 field1215 = new class75();

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "Lpc;")
    private class202 field1196;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lug;")
    public static class57 field1194 = new class57();

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field1206 = 0;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field1208 = 0;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[Lrd;")
    public static class207[] field1210 = new class207[256];

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "Lqe;")
    public static class168 field1213 = class66.method448("", 23);

    @OriginalMember(owner = "client!jg", name = "N", descriptor = "Lqe;")
    public static class168 field1205 = class66.method448("hitbar_default", 33);

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "[I")
    public static int[] field1212 = new int[5];

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "J")
    public static long field1209;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZILoe;)Lfe;")
    public static final class15 method528(int arg0, boolean arg1, int arg2, class256 arg3) {
        if (!arg1) {
            field1206 = 109;
        }
        field1200++;
        return class9.method34(arg2, arg3, (byte) -16, arg0) ? class197.method1267(0) : null;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "([III)V")
    public final void method120(int[] arg0, int arg1, int arg2) {
        field1207++;
        this.field1215.method120(arg0, arg1, arg2);
        for (class107 var4 = (class107) this.field1214.method315(-31594); var4 != null; var4 = (class107) this.field1214.method312(1012)) {
            if (!this.field1196.method1310(127, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1717) {
                        this.method533(var6, -1, var5 + var6, var4, arg0, var5);
                        var4.field1717 -= var6;
                        break;
                    }
                    this.method533(var4.field1717, -1, var5 + var6, var4, arg0, var5);
                    var6 -= var4.field1717;
                    var5 += var4.field1717;
                } while (!this.field1196.method1290(arg0, var5, var6, var4, 2));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1205 = null;
        field1212 = null;
        field1213 = null;
        field1210 = null;
        field1194 = null;
        if (arg0 >= -84) {
            field1210 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZI)V")
    public static final void method530(boolean arg0, int arg1) {
        class204.field3538 = arg0;
        if (arg1 != 17703) {
            return;
        }
        field1201++;
        if (!class204.field3538) {
            int var25 = class112.field1815.method766(arg1 + 4399);
            int var26 = class112.field1815.method766(22102);
            int var27 = (class31.field377 - class112.field1815.field1821) / 16;
            class171.field2978 = new int[var27][4];
            for (int var28 = 0; var28 < var27; var28++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class171.field2978[var28][var37] = class112.field1815.method767(126);
                }
            }
            int var29 = class112.field1815.method778(arg1 ^ 0x45A7);
            int var30 = class112.field1815.method728((byte) 69);
            boolean var31 = false;
            int var32 = class112.field1815.method731(false);
            class118.field1914 = new byte[var27][];
            class19.field234 = null;
            if ((var26 / 8 == 48 || var26 / 8 == 49) && (var32 / 8) == 48) {
                var31 = true;
            }
            class131.field2316 = new int[var27];
            class71.field1076 = new int[var27];
            class178.field3139 = new byte[var27][];
            class95.field1494 = null;
            if (var26 / 8 == 48 && var32 / 8 == 148) {
                var31 = true;
            }
            class179.field3152 = new int[var27];
            int var33 = 0;
            for (int var34 = (var26 - 6) / 8; var34 <= (var26 + 6) / 8; var34++) {
                for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var31 && (var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || var34 == 49 && var35 == 47)) {
                        class131.field2316[var33] = var36;
                        class71.field1076[var33] = -1;
                        class179.field3152[var33] = -1;
                    } else {
                        class131.field2316[var33] = var36;
                        class71.field1076[var33] = class229.field3884.method1705(class50.method347(2, new class168[] { class64.field893, class128.method867((byte) 89, var34), class174.field3051, class128.method867((byte) 78, var35) }), -1);
                        class179.field3152[var33] = class229.field3884.method1705(class50.method347(2, new class168[] { class68.field966, class128.method867((byte) 92, var34), class174.field3051, class128.method867((byte) 107, var35) }), -1);
                    }
                    var33++;
                }
            }
            class18.method94(arg1 + 9875, var30, var26, var25, false, var29, var32);
            return;
        }
        int var2 = class112.field1815.method762(false);
        int var3 = class112.field1815.method766(22102);
        int var4 = class112.field1815.method731(false);
        int var5 = class112.field1815.method731(false);
        class112.field1815.method661(-126);
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = class112.field1815.method671(1, arg1 - 17696);
                    if (var24 == 1) {
                        class76.field1141[var6][var22][var23] = class112.field1815.method671(26, 7);
                    } else {
                        class76.field1141[var6][var22][var23] = -1;
                    }
                }
            }
        }
        class112.field1815.method666((byte) 106);
        int var7 = (class31.field377 - class112.field1815.field1821) / 16;
        class171.field2978 = new int[var7][4];
        for (int var8 = 0; var8 < var7; var8++) {
            for (int var21 = 0; var21 < 4; var21++) {
                class171.field2978[var8][var21] = class112.field1815.method767(13);
            }
        }
        int var9 = class112.field1815.method766(22102);
        class19.field234 = null;
        class71.field1076 = new int[var7];
        class95.field1494 = null;
        class118.field1914 = new byte[var7][];
        class179.field3152 = new int[var7];
        class178.field3139 = new byte[var7][];
        class131.field2316 = new int[var7];
        int var10 = 0;
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 13; var12++) {
                for (int var13 = 0; var13 < 13; var13++) {
                    int var14 = class76.field1141[var11][var12][var13];
                    if (var14 != -1) {
                        int var15 = var14 >> 14 & 0x3FF;
                        int var16 = var14 >> 3 & 0x7FF;
                        int var17 = (var15 / 8 << 8) + var16 / 8;
                        for (int var18 = 0; var18 < var10; var18++) {
                            if (class131.field2316[var18] == var17) {
                                var17 = -1;
                                break;
                            }
                        }
                        if (var17 != -1) {
                            class131.field2316[var10] = var17;
                            int var19 = var17 >> 8 & 0xFF;
                            int var20 = var17 & 0xFF;
                            class71.field1076[var10] = class229.field3884.method1705(class50.method347(arg1 - 17701, new class168[] { class64.field893, class128.method867((byte) 101, var19), class174.field3051, class128.method867((byte) 114, var20) }), -1);
                            class179.field3152[var10] = class229.field3884.method1705(class50.method347(2, new class168[] { class68.field966, class128.method867((byte) 124, var19), class174.field3051, class128.method867((byte) 123, var20) }), -1);
                            var10++;
                        }
                    }
                }
            }
        }
        class18.method94(27578, var4, var5, var9, false, var2, var3);
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)I")
    public static final int method531(int arg0, int arg1) {
        int var2 = -106 % ((12 - arg0) / 45);
        field1199++;
        class110 var3 = class117.method802(0, arg1);
        int var4 = var3.field1764;
        int var5 = var3.field1757;
        int var6 = var3.field1759;
        int var7 = class179.field3151[var6 - var5];
        return var7 & class92.field1441[var4] >> var5;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(JB)Lqe;")
    public static final class168 method532(long arg0, byte arg1) {
        field1197++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = -69 / ((arg1 + 17) / 54);
            int var4 = 0;
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var4++;
            }
            byte[] var7 = new byte[var4];
            while (arg0 != 0L) {
                long var9 = arg0;
                arg0 /= 37L;
                var4--;
                var7[var4] = class194.field3388[(int) (var9 - arg0 * 37L)];
            }
            class168 var8 = new class168();
            var8.field2904 = var7;
            var8.field2870 = var7.length;
            return var8;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILj;[II)V")
    private final void method533(int arg0, int arg1, int arg2, class107 arg3, int[] arg4, int arg5) {
        field1202++;
        if ((this.field1196.field3488[arg3.field1724] & 0x4) != 0 && arg3.field1718 < 0) {
            int var7 = this.field1196.field3465[arg3.field1724] / class87.field1357;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field1712) / var7;
                if (var8 > arg0) {
                    arg3.field1712 += arg0 * var7;
                    break;
                }
                int var9 = 262144 / var7;
                arg0 -= var8;
                arg3.field1720.method120(arg4, arg5, var8);
                arg3.field1712 += var7 * var8 - 1048576;
                int var10 = class87.field1357 / 100;
                arg5 += var8;
                if (var9 < var10) {
                    var10 = var9;
                }
                class24 var11 = arg3.field1720;
                if (this.field1196.field3502[arg3.field1724] == 0) {
                    arg3.field1720 = class24.method164(arg3.field1714, var11.method138(), var11.method141(), var11.method130());
                } else {
                    arg3.field1720 = class24.method164(arg3.field1714, var11.method138(), 0, var11.method130());
                    this.field1196.method1313(arg3, arg3.field1704.field4236[arg3.field1730] < 0, arg1 + 48);
                    arg3.field1720.method162(var10, var11.method141());
                }
                if (arg3.field1704.field4236[arg3.field1730] < 0) {
                    arg3.field1720.method124(-1);
                }
                var11.method165(var10);
                var11.method120(arg4, arg5, arg2 - arg5);
                if (var11.method163()) {
                    this.field1215.method507(var11);
                }
            }
        }
        if (arg1 == -1) {
            arg3.field1720.method120(arg4, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIB)Lih;")
    public static final class50 method534(int arg0, int arg1, byte arg2) {
        field1193++;
        class50 var3 = (class50) class147.field2567.method1527((long) arg0 << 32 | (long) arg1, (byte) -90);
        int var4 = -119 % ((arg2 - 7) / 42);
        if (var3 == null) {
            var3 = new class50(arg0, arg1);
            class147.field2567.method1533(var3.field3308, 48, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "()Llc;")
    public final class203 method150() {
        field1198++;
        class107 var1;
        do {
            var1 = (class107) this.field1214.method312(1012);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1720 == null);
        return var1.field1720;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lj;II)V")
    private final void method535(class107 arg0, int arg1, int arg2) {
        field1211++;
        if ((this.field1196.field3488[arg0.field1724] & 0x4) != 0 && arg0.field1718 < 0) {
            int var4 = this.field1196.field3465[arg0.field1724] / class87.field1357;
            int var5 = (var4 + 1048575 - arg0.field1712) / var4;
            arg0.field1712 = arg2 * var4 + arg0.field1712 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1196.field3502[arg0.field1724] == 0) {
                    arg0.field1720 = class24.method164(arg0.field1714, arg0.field1720.method138(), arg0.field1720.method141(), arg0.field1720.method130());
                } else {
                    arg0.field1720 = class24.method164(arg0.field1714, arg0.field1720.method138(), 0, arg0.field1720.method130());
                    this.field1196.method1313(arg0, arg0.field1704.field4236[arg0.field1730] < 0, 113);
                }
                if (arg0.field1704.field4236[arg0.field1730] < 0) {
                    arg0.field1720.method124(-1);
                }
                arg2 = arg0.field1712 / var4;
            }
        }
        arg0.field1720.method153(arg2);
        int var6 = 92 % ((19 - arg1) / 61);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
    public final void method153(int arg0) {
        field1195++;
        this.field1215.method153(arg0);
        for (class107 var2 = (class107) this.field1214.method315(-31594); var2 != null; var2 = (class107) this.field1214.method312(1012)) {
            if (!this.field1196.method1310(127, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1717 >= var3) {
                        this.method535(var2, 126, var3);
                        var2.field1717 -= var3;
                        break;
                    }
                    this.method535(var2, 100, var2.field1717);
                    var3 -= var2.field1717;
                } while (!this.field1196.method1290(null, 0, var3, var2, 2));
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()Llc;")
    public final class203 method135() {
        field1204++;
        class107 var1 = (class107) this.field1214.method315(-31594);
        if (var1 == null) {
            return null;
        } else if (var1.field1720 == null) {
            return this.method150();
        } else {
            return var1.field1720;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII[B)Z")
    public static final boolean method536(byte arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -72) {
            method536((byte) 21, -70, -114, null);
        }
        field1203++;
        boolean var4 = true;
        class112 var5 = new class112(arg3);
        int var6 = -1;
        label74: while (true) {
            int var7 = var5.method742((byte) -48);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var14;
                class70 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var5.method747((byte) -125);
                                        if (var17 == 0) {
                                            continue label74;
                                        }
                                        var5.method758(true);
                                    }
                                    int var10 = var5.method747((byte) -125);
                                    if (var10 == 0) {
                                        continue label74;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 >> 6 & 0x3F;
                                    int var12 = var8 & 0x3F;
                                    var13 = var12 + arg1;
                                    var14 = var5.method758(true) >> 2;
                                    var15 = arg2 + var11;
                                } while (var15 <= 0);
                            } while (var13 <= 0);
                        } while (var15 >= 103);
                    } while (var13 >= 103);
                    var16 = class190.method1232(var6, 13090);
                } while (var14 == 22 && !class227.field3866 && var16.field1037 == 0 && var16.field1022 != 1 && !var16.field1010);
                if (!var16.method474(-88)) {
                    var4 = false;
                    class23.field263++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "()I")
    public final int method133() {
        field1216++;
        return 0;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lpc;)V")
    public class80(class202 arg0) {
        this.field1196 = arg0;
    }
}
