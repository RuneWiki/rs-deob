import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class81 {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[[I")
    private int[][] field1218;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "[Lgr;")
    public static class85[] field1219 = new class85[4];

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field1220 = 0;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field1224 = 0;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Ltm;")
    public static class112 field1215 = new class112("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Lbc;")
    public static class187 field1222;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "Z")
    public static boolean field1226;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([BI)[B")
    public static final byte[] method555(byte[] arg0, int arg1) {
        field1223++;
        int var2 = arg0.length;
        if (arg1 <= 77) {
            field1226 = false;
        }
        byte[] var3 = new byte[var2];
        class415.method2423(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIII)V")
    public static final void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class479.method2824(arg4, (byte) -59);
        field1227++;
        int var7 = 0;
        int var8 = arg4 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        if (arg1 != 29711) {
            method561(79);
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (class53.field874 <= arg2 && arg2 <= class8.field174) {
            int[] var15 = class2.field16[arg2];
            int var16 = class229.method1443(class299.field4121, arg5 - arg4, class248.field3487, (byte) -68);
            int var17 = class229.method1443(class299.field4121, arg4 + arg5, class248.field3487, (byte) -68);
            int var18 = class229.method1443(class299.field4121, arg5 - var8, class248.field3487, (byte) -68);
            int var19 = class229.method1443(class299.field4121, arg5 + var8, class248.field3487, (byte) -68);
            class80.method554(var15, 104, arg6, var18, var16);
            class80.method554(var15, 96, arg3, var19, var18);
            class80.method554(var15, 118, arg6, var17, var19);
        }
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                client.field5498[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (class53.field874 <= var21 && class8.field174 >= var20) {
                    if (var8 > var9) {
                        int var22 = client.field5498[var9];
                        int var23 = class229.method1443(class299.field4121, arg5 + var7, class248.field3487, (byte) -68);
                        int var24 = class229.method1443(class299.field4121, arg5 - var7, class248.field3487, (byte) -68);
                        int var25 = class229.method1443(class299.field4121, arg5 + var22, class248.field3487, (byte) -68);
                        int var26 = class229.method1443(class299.field4121, arg5 - var22, class248.field3487, (byte) -68);
                        if (var21 <= class8.field174) {
                            int[] var27 = class2.field16[var21];
                            class80.method554(var27, 121, arg6, var26, var24);
                            class80.method554(var27, 116, arg3, var25, var26);
                            class80.method554(var27, arg1 ^ 0x7463, arg6, var23, var25);
                        }
                        if (var20 >= class53.field874) {
                            int[] var28 = class2.field16[var20];
                            class80.method554(var28, 118, arg6, var26, var24);
                            class80.method554(var28, 110, arg3, var25, var26);
                            class80.method554(var28, arg1 - 29617, arg6, var23, var25);
                        }
                    } else {
                        int var29 = class229.method1443(class299.field4121, arg5 + var7, class248.field3487, (byte) -68);
                        int var30 = class229.method1443(class299.field4121, arg5 - var7, class248.field3487, (byte) -68);
                        if (class8.field174 >= var21) {
                            class80.method554(class2.field16[var21], arg1 - 29598, arg6, var29, var30);
                        }
                        if (var20 >= class53.field874) {
                            class80.method554(class2.field16[var20], 127, arg6, var29, var30);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (class53.field874 <= var32 && class8.field174 >= var31) {
                int var33 = arg5 + var9;
                int var34 = arg5 - var9;
                if (var33 >= class299.field4121 && class248.field3487 >= var34) {
                    int var35 = class229.method1443(class299.field4121, var33, class248.field3487, (byte) -68);
                    int var36 = class229.method1443(class299.field4121, var34, class248.field3487, (byte) -68);
                    if (var7 >= var8) {
                        if (var32 <= class8.field174) {
                            class80.method554(class2.field16[var32], 104, arg6, var35, var36);
                        }
                        if (var31 >= class53.field874) {
                            class80.method554(class2.field16[var31], arg1 - 29598, arg6, var35, var36);
                        }
                    } else {
                        int var37 = var7 <= var11 ? var11 : client.field5498[var7];
                        int var38 = class229.method1443(class299.field4121, arg5 + var37, class248.field3487, (byte) -68);
                        int var39 = class229.method1443(class299.field4121, arg5 - var37, class248.field3487, (byte) -68);
                        if (class8.field174 >= var32) {
                            int[] var40 = class2.field16[var32];
                            class80.method554(var40, 92, arg6, var39, var36);
                            class80.method554(var40, 117, arg3, var38, var39);
                            class80.method554(var40, arg1 - 29602, arg6, var35, var38);
                        }
                        if (var31 >= class53.field874) {
                            int[] var41 = class2.field16[var31];
                            class80.method554(var41, arg1 - 29599, arg6, var39, var36);
                            class80.method554(var41, arg1 - 29619, arg3, var38, var39);
                            class80.method554(var41, 123, arg6, var35, var38);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I")
    public final int method557(int arg0, int arg1) {
        if (this.field1218 != null) {
            arg1 = (int) ((long) this.field1214 * (long) arg1 / (long) this.field1217) + 6;
        }
        field1212++;
        return arg0 == 31183 ? arg1 : 104;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)I")
    public final int method558(int arg0, int arg1) {
        field1221++;
        if (this.field1218 != null) {
            arg1 = (int) ((long) this.field1214 * (long) arg1 / (long) this.field1217);
        }
        return arg0 == 320 ? arg1 : -85;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(II)V")
    public class81(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class133.method802(arg0, arg1, -29);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field1218 = new int[var5][14];
            this.field1217 = var5;
            this.field1214 = var4;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1218[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)J")
    public static final long method559(byte arg0) {
        if (arg0 > -101) {
            field1220 = -59;
        }
        field1216++;
        return class292.field4007.method1568(114);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "([BI)[B")
    public final byte[] method560(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            method562(8, 64L);
        }
        if (this.field1218 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1214 / (long) this.field1217) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1218[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1214 + var6;
                int var14 = var13 / this.field1217;
                var5 += var14;
                var6 = var13 - this.field1217 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field1225++;
        return arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method561(int arg0) {
        if (arg0 != 0) {
            field1219 = null;
        }
        field1222 = null;
        field1219 = null;
        field1215 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)V")
    public static final void method562(int arg0, long arg1) {
        field1213++;
        if (arg0 != -10372) {
            method559((byte) 76);
        }
        int var3 = class73.field1055 + class2.field21.field6765;
        int var4 = class307.field4205 + class2.field21.field6746;
        if ((class146.field2068 - var3) < -500 || class146.field2068 - var3 > 500 || (class222.field3133 - var4) < -500 || (class222.field3133 - var4) > 500) {
            class222.field3133 = var4;
            class146.field2068 = var3;
        }
        if (class146.field2068 != var3) {
            int var5 = var3 - class146.field2068;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class146.field2068 += var6;
        }
        if (!class104.field1498) {
            class356.field4959 += (float) arg1 * class388.field5465 / 6.0F;
            class418.field5750 += (float) arg1 * class244.field3452 / 6.0F;
        }
        if (class222.field3133 != var4) {
            int var7 = var4 - class222.field3133;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class222.field3133 += var8;
        }
        class84.method580((byte) 123);
    }
}
