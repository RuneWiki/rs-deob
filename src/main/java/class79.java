import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class79 {

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    private int field1298 = 0;

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "[Lte;")
    public class320[] field1285;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public int field1293;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "I")
    public static int field1280 = 127;

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1291 = "Loaded fonts";

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[[B")
    public static byte[][] field1290 = new byte[1000][];

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "I")
    public static int field1289;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "J")
    private long field1283;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "Lte;")
    private class320 field1273;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "Lte;")
    private class320 field1297;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1276;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[B)Lti;", line = 4)
    public static final class244 method722(boolean arg0, byte[] arg1) {
        field1296++;
        if (arg1 == null) {
            return null;
        } else if (arg0) {
            class244 var2 = new class244(arg1, class352.field5575, class104.field1743, class39.field585, class123.field2138, class191.field3205);
            class15.method151(0);
            return var2;
        } else {
            return (class244) null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I", line = 21)
    public final int method723(int arg0) {
        field1282++;
        int var2 = 0;
        if (arg0 != 5500) {
            this.field1285 = (class320[]) null;
        }
        for (int var3 = 0; var3 < this.field1293; var3++) {
            class320 var4 = this.field1285[var3];
            class320 var5 = var4.field5068;
            while (var4 != var5) {
                var5 = var5.field5068;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(BJ)Ljava/lang/String;", line = 59)
    public static final String method724(byte arg0, long arg1) {
        if (arg0 <= 67) {
            method730(-10);
        }
        field1286++;
        class170.field2949.setTime(new Date(arg1));
        int var3 = class170.field2949.get(7);
        int var4 = class170.field2949.get(5);
        int var5 = class170.field2949.get(2);
        int var6 = class170.field2949.get(1);
        int var7 = class170.field2949.get(11);
        int var8 = class170.field2949.get(12);
        int var9 = class170.field2949.get(13);
        return class351.field5559[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class102.field1644[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(JLte;I)V", line = 85)
    public final void method725(long arg0, class320 arg1, int arg2) {
        if (arg2 != 1) {
            this.method723(118);
        }
        if (arg1.field5065 != null) {
            arg1.method2195(-1);
        }
        class320 var5 = this.field1285[(int) (arg0 & (long) (this.field1293 - 1))];
        arg1.field5065 = var5.field5065;
        arg1.field5062 = arg0;
        field1278++;
        arg1.field5068 = var5;
        arg1.field5065.field5068 = arg1;
        arg1.field5068.field5065 = arg1;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Lte;", line = 107)
    public final class320 method726(boolean arg0) {
        field1294++;
        if (arg0) {
            field1276 = (String) null;
        }
        if (this.field1273 == null) {
            return null;
        }
        class320 var2 = this.field1285[(int) (this.field1283 & (long) (this.field1293 - 1))];
        while (this.field1273 != var2) {
            if (this.field1273.field5062 == this.field1283) {
                class320 var3 = this.field1273;
                this.field1273 = this.field1273.field5068;
                return var3;
            }
            this.field1273 = this.field1273.field5068;
        }
        this.field1273 = null;
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lte;", line = 137)
    public final class320 method727(byte arg0) {
        if (arg0 != -110) {
            field1276 = (String) null;
        }
        field1295++;
        if (this.field1298 > 0 && this.field1285[this.field1298 - 1] != this.field1297) {
            class320 var2 = this.field1297;
            this.field1297 = var2.field5068;
            return var2;
        }
        class320 var3;
        do {
            if (this.field1298 >= this.field1293) {
                return null;
            }
            var3 = this.field1285[this.field1298++].field5068;
        } while (this.field1285[this.field1298 - 1] == var3);
        this.field1297 = var3.field5068;
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 171)
    public static final void method728(int arg0) {
        if (class17.field267 == 2) {
            if (class70.field1151 == class172.field2980 && class67.field1087 == class127.field2198) {
                class17.field267 = 0;
                if (class295.field4715 && class97.field1572[81] && class293.field4708 > 2) {
                    class18.method181(class293.field4708 - 2, (byte) -120);
                } else {
                    class18.method181(class293.field4708 - 1, (byte) 36);
                }
            }
        } else if (class218.field3635 == class172.field2980 && class67.field1087 == class226.field3812) {
            class17.field267 = 0;
            if (class295.field4715 && class97.field1572[81] && class293.field4708 > 2) {
                class18.method181(class293.field4708 - 2, (byte) 75);
            } else {
                class18.method181(class293.field4708 - 1, (byte) 96);
            }
        } else {
            class70.field1151 = class218.field3635;
            class17.field267 = 2;
            class127.field2198 = class226.field3812;
        }
        field1281++;
        if (arg0 != 1) {
            method730(-23);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILlg;)I", line = 233)
    public static final int method729(int arg0, int arg1, class137 arg2) {
        field1289++;
        if (!client.method1894(arg2).method509(2966, arg1) && arg2.field2413 == null) {
            return -1;
        } else {
            if (arg0 >= -21) {
                method728(-20);
            }
            return arg2.field2480 == null || arg2.field2480.length <= arg1 ? -1 : arg2.field2480[arg1];
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 250)
    public static void method730(int arg0) {
        field1290 = (byte[][]) null;
        field1276 = null;
        field1291 = null;
        if (arg0 != 10) {
            method729(9, -102, (class137) null);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lte;)I", line = 272)
    public final int method731(int arg0, class320[] arg1) {
        field1274++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1293; var4++) {
            class320 var5 = this.field1285[var4];
            for (class320 var6 = var5.field5068; var6 != var5; var6 = var6.field5068) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 < 47) {
            this.field1293 = 39;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(JZ)Lte;", line = 302)
    public final class320 method732(long arg0, boolean arg1) {
        this.field1283 = arg0;
        field1275++;
        class320 var4 = this.field1285[(int) ((long) (this.field1293 - 1) & arg0)];
        for (this.field1273 = var4.field5068; this.field1273 != var4; this.field1273 = this.field1273.field5068) {
            if (this.field1273.field5062 == arg0) {
                class320 var5 = this.field1273;
                this.field1273 = this.field1273.field5068;
                return var5;
            }
        }
        this.field1273 = null;
        if (!arg1) {
            method724((byte) 13, -120L);
        }
        return null;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I", line = 336)
    public final int method733(byte arg0) {
        if (arg0 < 120) {
            return 121;
        } else {
            field1277++;
            return this.field1293;
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V", line = 348)
    public final void method734(int arg0) {
        field1279++;
        for (int var2 = 0; var2 < this.field1293; var2++) {
            class320 var3 = this.field1285[var2];
            while (true) {
                class320 var4 = var3.field5068;
                if (var3 == var4) {
                    break;
                }
                var4.method2195(arg0 - 2);
            }
        }
        this.field1297 = null;
        this.field1273 = null;
        if (arg0 != 1) {
            field1280 = 5;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIBI)I", line = 387)
    public static final int method735(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field1288++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else {
            int var5 = 64 / ((arg2 - 12) / 59);
            return var4 == 2 ? 1023 - arg3 : arg1;
        }
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Lte;", line = 410)
    public final class320 method736(int arg0) {
        if (arg0 != 2) {
            this.method726(true);
        }
        this.field1298 = 0;
        field1287++;
        return this.method727((byte) -110);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "([[FI[[FIIZIII[[II[[FIII[[ILbl;F)I", line = 422)
    public static final int method737(float[][] arg0, int arg1, float[][] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int[][] arg9, int arg10, float[][] arg11, int arg12, int arg13, int arg14, int[][] arg15, class337 arg16, float arg17) {
        field1292++;
        if (arg14 == 1) {
            int var18 = arg4;
            arg4 = arg10;
            arg10 = 128 - var18;
        } else if (arg14 == 2) {
            arg10 = 128 - arg10;
            arg4 = 128 - arg4;
        } else if (arg14 == 3) {
            int var19 = arg4;
            arg4 = 128 - arg10;
            arg10 = var19;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg4 == 0 && arg10 == 0) {
            var20 = arg11[arg13][arg8];
            var21 = arg2[arg13][arg8];
            var22 = arg0[arg13][arg8];
            var23 = arg3;
        } else if (arg4 == 128 && arg10 == 0) {
            var20 = arg11[arg13 + 1][arg8];
            var21 = arg2[arg13 + 1][arg8];
            var23 = arg7;
            var22 = arg0[arg13 + 1][arg8];
        } else if (arg4 == 128 && arg10 == 128) {
            var20 = arg11[arg13 + 1][arg8 + 1];
            var21 = arg2[arg13 + 1][arg8 + 1];
            var23 = arg1;
            var22 = arg0[arg13 + 1][arg8 + 1];
        } else if (arg4 == 0 && arg10 == 128) {
            var20 = arg11[arg13][arg8 + 1];
            var22 = arg0[arg13][arg8 + 1];
            var21 = arg2[arg13][arg8 + 1];
            var23 = arg12;
        } else {
            float var24 = arg0[arg13][arg8];
            float var25 = arg2[arg13][arg8];
            float var26 = (float) arg4 / 128.0F;
            float var27 = arg11[arg13][arg8 + 1];
            float var28 = (arg0[arg13 + 1][arg8] - var24) * var26 + var24;
            float var29 = (float) arg10 / 128.0F;
            float var30 = arg0[arg13][arg8 + 1];
            float var31 = arg11[arg13][arg8];
            float var32 = arg2[arg13][arg8 + 1];
            float var33 = (arg11[arg13 + 1][arg8 + 1] - var27) * var26 + var27;
            float var34 = (arg11[arg13 + 1][arg8] - var31) * var26 + var31;
            float var35 = (arg0[arg13 + 1][arg8 + 1] - var30) * var26 + var30;
            var20 = (var33 - var34) * var29 + var34;
            float var36 = (arg2[arg13 + 1][arg8 + 1] - var32) * var26 + var32;
            var22 = (var35 - var28) * var29 + var28;
            float var37 = (arg2[arg13 + 1][arg8] - var25) * var26 + var25;
            int var38 = class31.method290(-15791, arg7, arg3, arg4);
            int var39 = class31.method290(-15791, arg1, arg12, arg4);
            var23 = class31.method290(-15791, var39, var38, arg10);
            var21 = (var36 - var37) * var29 + var37;
        }
        int var40 = (arg13 << 7) + arg4;
        int var41 = (arg8 << 7) + arg10;
        if (arg6 > -30) {
            method730(-16);
        }
        int var42 = class258.method1795(arg10, arg8, arg4, 128, arg15, arg13);
        return arg16.method2379(var40, var42, var41, var20, var22, var21, arg5 ? var23 & 0xFFFFFF00 : var23, arg9 == null ? 0.0F : (float) (var42 - class258.method1795(arg10, arg8, arg4, 128, arg9, arg13)) / arg17);
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(I)V", line = 535)
    public class79(int arg0) {
        this.field1285 = new class320[arg0];
        this.field1293 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class320 var3 = this.field1285[var2] = new class320();
            var3.field5068 = var3;
            var3.field5065 = var3;
        }
    }
}
