import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class71 extends class130 {

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "[J")
    public static long[] field1362 = new long[100];

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "[[I")
    public static int[][] field1375 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field1364 = 0;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "Lcd;")
    public static class64 field1382 = class44.method335((byte) 71, "blinken3:");

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "F")
    public static float field1374;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[I")
    private int[] field1361;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "[I")
    public int[] field1371;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "[Lcd;")
    private class64[] field1380;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "[[B")
    public static byte[][] field1360;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "[[I")
    private int[][] field1379;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[[[B")
    public static byte[][][] field1365;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lkh;Z)Lcd;", line = 5)
    public final class64 method576(class13 arg0, boolean arg1) {
        class64 var3 = class156.method1128(1, 80);
        field1363++;
        if (this.field1361 != null) {
            for (int var4 = 0; var4 < this.field1361.length; var4++) {
                var3.method502((byte) -121, this.field1380[var4]);
                var3.method502((byte) -128, class35.method291(this.field1361[var4], true, arg0.method113((byte) -79, class135.field2401[this.field1361[var4]]), this.field1379[var4]));
            }
        }
        if (arg1) {
            field1364 = 31;
        }
        var3.method502((byte) -116, this.field1380[this.field1380.length - 1]);
        return var3.method497(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B[ILkh;)V", line = 35)
    public final void method577(byte arg0, int[] arg1, class13 arg2) {
        field1367++;
        if (this.field1361 == null) {
            return;
        }
        for (int var4 = 0; this.field1361.length > var4 && arg1.length > var4; var4++) {
            int var5 = class151.field2699[this.method578((byte) 77, var4)];
            if (var5 > 0) {
                arg2.method135(26638184, var5, (long) arg1[var4]);
            }
        }
        if (arg0 != 83) {
            field1377 = -92;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)I", line = 67)
    public final int method578(byte arg0, int arg1) {
        field1373++;
        if (arg0 < 74) {
            field1362 = (long[]) null;
        }
        return this.field1361 == null || arg1 < 0 || arg1 > this.field1361.length ? -1 : this.field1361[arg1];
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)I", line = 83)
    public static final int method579(int arg0, int arg1, int arg2) {
        field1381++;
        class115 var3 = (class115) class17.field351.method1151((long) arg2, arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2112.length > arg1) {
            return var3.field2112[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Lcd;", line = 107)
    public final class64 method580(int arg0) {
        field1366++;
        class64 var2 = class156.method1128(1, 80);
        int var3 = 97 / ((arg0 - 53) / 52);
        if (this.field1380 == null) {
            return class62.field1204;
        }
        var2.method502((byte) -120, this.field1380[0]);
        for (int var4 = 1; var4 < this.field1380.length; var4++) {
            var2.method502((byte) -113, class76.field1427);
            var2.method502((byte) -113, this.field1380[var4]);
        }
        return var2.method497(0);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIII)V", line = 135)
    public static final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1383++;
        class55 var10 = (class55) class313.field5312.method778(0);
        if (arg4 != 26032) {
            method586((byte) -13);
        }
        class55 var11 = null;
        while (var10 != null) {
            if (var10.field925 == arg1 && var10.field929 == arg7 && var10.field921 == arg2 && var10.field930 == arg9) {
                var11 = var10;
                break;
            }
            var10 = (class55) class313.field5312.method775(26517);
        }
        if (var11 == null) {
            var11 = new class55();
            var11.field929 = arg7;
            var11.field925 = arg1;
            var11.field921 = arg2;
            var11.field930 = arg9;
            class140.method997(var11, -117);
            class313.field5312.method781(var11, 10751);
        }
        var11.field916 = arg0;
        var11.field927 = arg5;
        var11.field931 = arg3;
        var11.field922 = arg6;
        var11.field923 = arg8;
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)I", line = 198)
    public final int method582(int arg0) {
        if (arg0 == -5416) {
            field1368++;
            return this.field1361 == null ? 0 : this.field1361.length;
        } else {
            return -117;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)I", line = 219)
    public final int method583(int arg0, int arg1, boolean arg2) {
        field1372++;
        if (arg2) {
            field1375 = (int[][]) ((int[][]) null);
        }
        if (this.field1361 == null || arg1 < 0 || this.field1361.length < arg1) {
            return -1;
        } else if (this.field1379[arg1] == null || arg0 < 0 || this.field1379[arg1].length < arg0) {
            return -1;
        } else {
            return this.field1379[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V", line = 248)
    public final void method584(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1378++;
        if (this.field1371 != null) {
            for (int var2 = 0; var2 < this.field1371.length; var2++) {
                this.field1371[var2] = class11.method91(this.field1371[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILkh;)V", line = 270)
    public final void method585(int arg0, class13 arg1) {
        while (true) {
            int var3 = arg1.method152((byte) -100);
            if (var3 == 0) {
                if (arg0 != -8482) {
                    this.field1379 = (int[][]) ((int[][]) null);
                }
                field1376++;
                return;
            }
            this.method587(arg1, arg0 + 8542, var3);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 297)
    public static void method586(byte arg0) {
        if (arg0 != 30) {
            return;
        }
        field1362 = null;
        field1375 = (int[][]) null;
        field1365 = (byte[][][]) null;
        field1382 = null;
        field1360 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lkh;II)V", line = 312)
    private final void method587(class13 arg0, int arg1, int arg2) {
        field1369++;
        if (arg2 == 1) {
            this.field1380 = arg0.method104((byte) 127).method504(60, 0);
        } else if (arg2 == 2) {
            int var8 = arg0.method152((byte) -84);
            this.field1371 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1371[var9] = arg0.method112((byte) 92);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method152((byte) -118);
            this.field1379 = new int[var4][];
            this.field1361 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method112((byte) 92);
                this.field1361[var5] = var6;
                this.field1379[var5] = new int[class175.field3005[var6]];
                for (int var7 = 0; var7 < class175.field3005[var6]; var7++) {
                    this.field1379[var5][var7] = arg0.method112((byte) 92);
                }
            }
        }
        if (arg1 != 60) {
            this.method587((class13) null, -111, -37);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[I)[I", line = 374)
    public static final int[] method588(int arg0, int[] arg1) {
        field1370++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class95.method719(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }
}
