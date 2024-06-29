import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class70 extends class140 {

    @OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
    public int field1411 = 0;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "[[B")
    private byte[][] field1390 = new byte[256][];

    @OriginalMember(owner = "client!ka", name = "pb", descriptor = "[I")
    private int[] field1414;

    @OriginalMember(owner = "client!ka", name = "xb", descriptor = "[I")
    private int[] field1422;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    private int[] field1392;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "client!ka", name = "nb", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lpe;")
    private static class109 field1391 = class141.method1120(")4col", 0);

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    private static int field1399 = 0;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "Lpe;")
    private static class109 field1398 = class141.method1120("str=", 0);

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "Lpe;")
    private static class109 field1406 = class141.method1120("shad", 0);

    @OriginalMember(owner = "client!ka", name = "lb", descriptor = "Lpe;")
    private static class109 field1410 = class141.method1120("br", 0);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Lpe;")
    private static class109 field1394 = class141.method1120(")4u", 0);

    @OriginalMember(owner = "client!ka", name = "kb", descriptor = "Lpe;")
    private static class109 field1409 = class141.method1120("gt", 0);

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    private static int field1401 = 0;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lpe;")
    private static class109 field1400 = class141.method1120("img=", 0);

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "Lpe;")
    private static class109 field1408 = class141.method1120("u=", 0);

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    private static int field1396 = -1;

    @OriginalMember(owner = "client!ka", name = "wb", descriptor = "I")
    private static int field1421 = 0;

    @OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
    private static int field1417 = -1;

    @OriginalMember(owner = "client!ka", name = "ub", descriptor = "Lpe;")
    private static class109 field1419 = class141.method1120(")4shad", 0);

    @OriginalMember(owner = "client!ka", name = "yb", descriptor = "I")
    private static int field1423 = 0;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    private static int field1403 = 256;

    @OriginalMember(owner = "client!ka", name = "vb", descriptor = "I")
    private static int field1420 = -1;

    @OriginalMember(owner = "client!ka", name = "tb", descriptor = "Lpe;")
    private static class109 field1418 = class141.method1120("u", 0);

    @OriginalMember(owner = "client!ka", name = "ob", descriptor = "Lpe;")
    private static class109 field1413 = class141.method1120(")4str", 0);

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "Lpe;")
    private static class109 field1395 = class141.method1120("shad=", 0);

    @OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
    private static int field1415 = -1;

    @OriginalMember(owner = "client!ka", name = "zb", descriptor = "Lpe;")
    private static class109 field1424 = class141.method1120("str", 0);

    @OriginalMember(owner = "client!ka", name = "rb", descriptor = "Lpe;")
    private static class109 field1416 = class141.method1120("lt", 0);

    @OriginalMember(owner = "client!ka", name = "Ab", descriptor = "Lpe;")
    private static class109 field1425 = class141.method1120("col=", 0);

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "Ljava/util/Random;")
    private static Random field1397 = new Random();

    @OriginalMember(owner = "client!ka", name = "Bb", descriptor = "[Lpe;")
    private static class109[] field1426 = new class109[100];

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "[B")
    private byte[] field1407;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "[I")
    private int[] field1404;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[Lk;")
    public static class69[] field1393;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;I)I")
    public final int method541(class109 arg0, int arg1) {
        int var3 = this.method559(arg0, new int[] { arg1 }, field1426);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method546(field1426[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;IIIIII)V")
    public final void method542(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method566(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field2295];
        for (int var11 = 0; var11 < arg0.field2295; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method560(arg0, arg1 - this.method546(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lpe;I)V")
    private final void method543(class109 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method898((byte) 124); var5++) {
            int var6 = arg0.method906(var5, false);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1421 = (arg1 - this.method546(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;IIIII)V")
    public final void method544(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method566(arg3, arg4);
        int[] var7 = new int[arg0.field2295];
        int[] var8 = new int[arg0.field2295];
        for (int var9 = 0; var9 < arg0.field2295; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method560(arg0, arg1 - this.method546(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;IIII)V")
    public final void method545(class109 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method566(arg3, arg4);
            this.method553(arg0, arg1 - this.method546(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;)I")
    public final int method546(class109 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = -1;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0.field2295; var5++) {
            int var6 = arg0.field2279[var5] & 0xFF;
            if (var6 == 60) {
                var2 = var5;
            } else {
                if (var6 == 62 && var2 != -1) {
                    class109 var7 = arg0.method872(var5, 55, var2 + 1);
                    var2 = -1;
                    if (var7.method908(field1416, (byte) 101)) {
                        var6 = 60;
                    } else {
                        if (!var7.method908(field1409, (byte) 80)) {
                            if (var7.method886(field1400, 127)) {
                                try {
                                    int var8 = var7.method897(false, 4).method893(48);
                                    var4 += field1393[var8].field1385;
                                    var3 = -1;
                                } catch (Exception var9) {
                                }
                            }
                            continue;
                        }
                        var6 = 62;
                    }
                }
                if (var2 == -1) {
                    var4 += this.field1404[var6];
                    if (this.field1407 != null && var3 != -1) {
                        var4 += this.field1407[(var3 << 8) + var6];
                    }
                    var3 = var6;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
    public static void method547() {
        field1416 = null;
        field1409 = null;
        field1400 = null;
        field1410 = null;
        field1425 = null;
        field1391 = null;
        field1408 = null;
        field1418 = null;
        field1394 = null;
        field1395 = null;
        field1406 = null;
        field1419 = null;
        field1398 = null;
        field1424 = null;
        field1413 = null;
        field1393 = null;
        field1397 = null;
        field1426 = null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
    private final int method548(int arg0) {
        return this.field1404[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[BIIIIIII)V")
    public static final void method549(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lpe;)Lpe;")
    public static final class109 method550(class109 arg0) {
        int var1 = arg0.method898((byte) 123);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field2279[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class109 var4 = new class109();
        var4.field2295 = var1 + var2;
        var4.field2279 = new byte[var4.field2295];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field2279[var6];
            if (var7 == 60) {
                var4.field2279[var5++] = 60;
                var4.field2279[var5++] = 108;
                var4.field2279[var5++] = 116;
                var4.field2279[var5++] = 62;
            } else if (var7 == 62) {
                var4.field2279[var5++] = 60;
                var4.field2279[var5++] = 103;
                var4.field2279[var5++] = 116;
                var4.field2279[var5++] = 62;
            } else {
                var4.field2279[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIIII)V")
    private static final void method551(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class140.field3046 * arg2 + arg1;
        int var7 = class140.field3046 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class140.field3047) {
            int var10 = class140.field3047 - arg2;
            arg4 -= var10;
            arg2 = class140.field3047;
            var9 += arg3 * var10;
            var6 += class140.field3046 * var10;
        }
        if (arg2 + arg4 > class140.field3052) {
            arg4 -= arg2 + arg4 - class140.field3052;
        }
        if (arg1 < class140.field3049) {
            int var11 = class140.field3049 - arg1;
            arg3 -= var11;
            arg1 = class140.field3049;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class140.field3050) {
            int var12 = arg1 + arg3 - class140.field3050;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method549(class140.field3051, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([BIIIII)V")
    public abstract void method552(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;II)V")
    private final void method553(class109 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1411;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < arg0.field2295; var7++) {
            int var8 = arg0.field2279[var7] & 0xFF;
            if (var8 == 60) {
                var5 = var7;
            } else {
                if (var8 == 62 && var5 != -1) {
                    class109 var9 = arg0.method872(var7, -34, var5 + 1);
                    var5 = -1;
                    if (var9.method908(field1416, (byte) 62)) {
                        var8 = 60;
                    } else {
                        if (!var9.method908(field1409, (byte) 113)) {
                            if (var9.method886(field1400, 125)) {
                                try {
                                    int var10 = var9.method897(false, 4).method893(48);
                                    class69 var11 = field1393[var10];
                                    var11.method539(arg1, this.field1411 + var4 - var11.field1383);
                                    arg1 += var11.field1385;
                                    var6 = -1;
                                } catch (Exception var15) {
                                }
                            } else {
                                this.method568(var9);
                            }
                            continue;
                        }
                        var8 = 62;
                    }
                }
                if (var5 == -1) {
                    if (this.field1407 != null && var6 != -1) {
                        arg1 += this.field1407[(var6 << 8) + var8];
                    }
                    int var12 = this.field1392[var8];
                    int var13 = this.field1402[var8];
                    if (var8 == 32) {
                        if (field1421 > 0) {
                            field1423 += field1421;
                            arg1 += field1423 >> 8;
                            field1423 &= 0xFF;
                        }
                    } else if (field1403 == 256) {
                        if (field1396 != -1) {
                            method551(this.field1390[var8], this.field1414[var8] + arg1 + 1, this.field1422[var8] + var4 + 1, var12, var13, field1396);
                        }
                        this.method552(this.field1390[var8], this.field1414[var8] + arg1, this.field1422[var8] + var4, var12, var13, field1399);
                    } else {
                        if (field1396 != -1) {
                            method561(this.field1390[var8], this.field1414[var8] + arg1 + 1, this.field1422[var8] + var4 + 1, var12, var13, field1396, field1403);
                        }
                        this.method565(this.field1390[var8], this.field1414[var8] + arg1, this.field1422[var8] + var4, var12, var13, field1399, field1403);
                    }
                    int var14 = this.field1404[var8];
                    if (field1415 != -1) {
                        class140.method1104(arg1, (int) ((double) this.field1411 * 0.7D) + var4, var14, field1415);
                    }
                    if (field1417 != -1) {
                        class140.method1104(arg1, this.field1411 + var4 + 1, var14, field1417);
                    }
                    arg1 += var14;
                    var6 = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lpe;IIII)V")
    public final void method554(class109 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method566(arg3, arg4);
            this.method553(arg0, arg1 - this.method546(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lpe;I)I")
    public final int method555(class109 arg0, int arg1) {
        return this.method559(arg0, new int[] { arg1 }, field1426);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([B)V")
    private final void method556(byte[] arg0) {
        this.field1404 = new int[256];
        if (arg0.length == 257) {
            for (int var2 = 0; var2 < this.field1404.length; var2++) {
                this.field1404[var2] = arg0[var2] & 0xFF;
            }
            this.field1411 = arg0[256] & 0xFF;
            return;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 256; var4++) {
            this.field1404[var4] = arg0[var3++] & 0xFF;
        }
        int[] var5 = new int[256];
        int[] var6 = new int[256];
        for (int var7 = 0; var7 < 256; var7++) {
            var5[var7] = arg0[var3++] & 0xFF;
        }
        for (int var8 = 0; var8 < 256; var8++) {
            var6[var8] = arg0[var3++] & 0xFF;
        }
        byte[][] var9 = new byte[256][];
        for (int var10 = 0; var10 < 256; var10++) {
            var9[var10] = new byte[var5[var10]];
            byte var17 = 0;
            for (int var18 = 0; var18 < var9[var10].length; var18++) {
                var17 += arg0[var3++];
                var9[var10][var18] = var17;
            }
        }
        byte[][] var11 = new byte[256][];
        for (int var12 = 0; var12 < 256; var12++) {
            var11[var12] = new byte[var5[var12]];
            byte var15 = 0;
            for (int var16 = 0; var16 < var11[var12].length; var16++) {
                var15 += arg0[var3++];
                var11[var12][var16] = var15;
            }
        }
        this.field1407 = new byte[65536];
        for (int var13 = 0; var13 < 256; var13++) {
            if (var13 != 32 && var13 != 160) {
                for (int var14 = 0; var14 < 256; var14++) {
                    if (var14 != 32 && var14 != 160) {
                        this.field1407[(var13 << 8) + var14] = (byte) method567(var9, var11, var6, this.field1404, var5, var13, var14);
                    }
                }
            }
        }
        this.field1411 = var5[32] + var6[32];
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lpe;IIIII)V")
    public final void method557(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method566(arg3, arg4);
        field1397.setSeed((long) arg5);
        field1403 = (field1397.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field2295];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field2295; var9++) {
            var7[var9] = var8;
            if ((field1397.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method560(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lpe;IIII)V")
    public final void method558(class109 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method566(arg3, arg4);
            this.method553(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;[I[Lpe;)I")
    private final int method559(class109 arg0, int[] arg1, class109[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class109 var6 = class157.method1228(73, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = -1;
        int var12 = 0;
        int var13 = arg0.method898((byte) 126);
        for (int var14 = 0; var14 < var13; var14++) {
            int var15 = arg0.method906(var14, false);
            if (var15 == 60) {
                var10 = var14;
            } else {
                if (var15 == 62 && var10 != -1) {
                    class109 var16 = arg0.method872(var14, -1, var10 + 1);
                    var10 = -1;
                    var6.method888(60, (byte) -37);
                    var6.method900((byte) -98, var16);
                    var6.method888(62, (byte) -124);
                    if (var16.method908(field1410, (byte) 70)) {
                        arg2[var12++] = var6.method872(var6.method898((byte) 124), -124, var5);
                        var5 = var6.method898((byte) 122);
                        var4 = 0;
                        var7 = -1;
                        var11 = -1;
                    } else if (var16.method908(field1416, (byte) 122)) {
                        var4 += this.method548(60);
                        if (this.field1407 != null && var11 != -1) {
                            var4 += this.field1407[(var11 << 8) + 60];
                        }
                        var11 = 60;
                    } else if (var16.method908(field1409, (byte) 120)) {
                        var4 += this.method548(62);
                        if (this.field1407 != null && var11 != -1) {
                            var4 += this.field1407[(var11 << 8) + 62];
                        }
                        var11 = 62;
                    } else if (var16.method886(field1400, 126)) {
                        try {
                            int var17 = var16.method897(false, 4).method893(48);
                            var4 += field1393[var17].field1385;
                            var11 = -1;
                        } catch (Exception var18) {
                        }
                    }
                    var15 = -1;
                }
                if (var10 == -1) {
                    if (var15 != -1) {
                        var6.method888(var15, (byte) -105);
                        var4 += this.method548(var15);
                        if (this.field1407 != null && var11 != -1) {
                            var4 += this.field1407[(var11 << 8) + var15];
                        }
                        var11 = var15;
                    }
                    if (var15 == 32) {
                        var7 = var6.method898((byte) 124);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var12 < arg1.length ? var12 : arg1.length - 1] && var7 >= 0) {
                        arg2[var12++] = var6.method872(var7 - var9, -122, var5);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                        var11 = -1;
                    }
                    if (var15 == 45) {
                        var7 = var6.method898((byte) 126);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method898((byte) 123) > var5) {
            arg2[var12++] = var6.method872(var6.method898((byte) 122), -25, var5);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;II[I[I)V")
    private final void method560(class109 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1411;
        int var7 = -1;
        int var8 = -1;
        int var9 = 0;
        for (int var10 = 0; var10 < arg0.field2295; var10++) {
            int var11 = arg0.field2279[var10] & 0xFF;
            if (var11 == 60) {
                var7 = var10;
            } else {
                if (var11 == 62 && var7 != -1) {
                    class109 var12 = arg0.method872(var10, 113, var7 + 1);
                    var7 = -1;
                    if (var12.method908(field1416, (byte) 105)) {
                        var11 = 60;
                    } else {
                        if (!var12.method908(field1409, (byte) 119)) {
                            if (var12.method886(field1400, 117)) {
                                try {
                                    int var13;
                                    if (arg3 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg3[var9];
                                    }
                                    int var14;
                                    if (arg4 == null) {
                                        var14 = 0;
                                    } else {
                                        var14 = arg4[var9];
                                    }
                                    var9++;
                                    int var15 = var12.method897(false, 4).method893(48);
                                    class69 var16 = field1393[var15];
                                    var16.method539(arg1 + var13, this.field1411 + var6 - var16.field1383 + var14);
                                    arg1 += var16.field1385;
                                    var8 = -1;
                                } catch (Exception var22) {
                                }
                            } else {
                                this.method568(var12);
                            }
                            continue;
                        }
                        var11 = 62;
                    }
                }
                if (var7 == -1) {
                    if (this.field1407 != null && var8 != -1) {
                        arg1 += this.field1407[(var8 << 8) + var11];
                    }
                    int var17 = this.field1392[var11];
                    int var18 = this.field1402[var11];
                    int var19;
                    if (arg3 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg3[var9];
                    }
                    int var20;
                    if (arg4 == null) {
                        var20 = 0;
                    } else {
                        var20 = arg4[var9];
                    }
                    var9++;
                    if (var11 == 32) {
                        if (field1421 > 0) {
                            field1423 += field1421;
                            arg1 += field1423 >> 8;
                            field1423 &= 0xFF;
                        }
                    } else if (field1403 == 256) {
                        if (field1396 != -1) {
                            method551(this.field1390[var11], this.field1414[var11] + arg1 + var19 + 1, this.field1422[var11] + var6 + 1 + var20, var17, var18, field1396);
                        }
                        this.method552(this.field1390[var11], this.field1414[var11] + arg1 + var19, this.field1422[var11] + var6 + var20, var17, var18, field1399);
                    } else {
                        if (field1396 != -1) {
                            method561(this.field1390[var11], this.field1414[var11] + arg1 + var19 + 1, this.field1422[var11] + var6 + 1 + var20, var17, var18, field1396, field1403);
                        }
                        this.method565(this.field1390[var11], this.field1414[var11] + arg1 + var19, this.field1422[var11] + var6 + var20, var17, var18, field1399, field1403);
                    }
                    int var21 = this.field1404[var11];
                    if (field1415 != -1) {
                        class140.method1104(arg1, (int) ((double) this.field1411 * 0.7D) + var6, var21, field1415);
                    }
                    if (field1417 != -1) {
                        class140.method1104(arg1, this.field1411 + var6, var21, field1417);
                    }
                    arg1 += var21;
                    var8 = var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BIIIIII)V")
    private static final void method561(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class140.field3046 * arg2 + arg1;
        int var8 = class140.field3046 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class140.field3047) {
            int var11 = class140.field3047 - arg2;
            arg4 -= var11;
            arg2 = class140.field3047;
            var10 += arg3 * var11;
            var7 += class140.field3046 * var11;
        }
        if (arg2 + arg4 > class140.field3052) {
            arg4 -= arg2 + arg4 - class140.field3052;
        }
        if (arg1 < class140.field3049) {
            int var12 = class140.field3049 - arg1;
            arg3 -= var12;
            arg1 = class140.field3049;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class140.field3050) {
            int var13 = arg1 + arg3 - class140.field3050;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method563(class140.field3051, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lpe;IIIII)V")
    public final void method562(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method566(arg3, arg4);
        int[] var7 = new int[arg0.field2295];
        for (int var8 = 0; var8 < arg0.field2295; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method560(arg0, arg1 - this.method546(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([I[BIIIIIIII)V")
    public static final void method563(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lpe;IIIIIIIII)I")
    public final int method564(class109 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return 0;
        }
        this.method566(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field1411;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field1412 + this.field1405 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method559(arg0, var11, field1426);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field1412 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field1412 - this.field1405 - (var12 - 1) * arg9) / 2 + this.field1412 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field1405 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field1412 - this.field1405 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field1412 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method553(field1426[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method553(field1426[var15], arg1 + (arg3 - this.method546(field1426[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method553(field1426[var15], arg1 + arg3 - this.method546(field1426[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method553(field1426[var15], arg1, var13);
            } else {
                this.method543(field1426[var15], arg3);
                this.method553(field1426[var15], arg1, var13);
                field1421 = 0;
            }
            var13 += arg9;
        }
        return var12;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "([BIIIIII)V")
    public abstract void method565(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
    private final void method566(int arg0, int arg1) {
        field1415 = -1;
        field1417 = -1;
        field1420 = arg1;
        field1396 = arg1;
        field1401 = arg0;
        field1399 = arg0;
        field1403 = 256;
        field1421 = 0;
        field1423 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([[B[[B[I[I[III)I")
    private static final int method567(byte[][] arg0, byte[][] arg1, int[] arg2, int[] arg3, int[] arg4, int arg5, int arg6) {
        int var7 = arg2[arg5];
        int var8 = arg4[arg5] + var7;
        int var9 = arg2[arg6];
        int var10 = arg4[arg6] + var9;
        int var11 = var7;
        if (var9 > var7) {
            var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
            var12 = var10;
        }
        int var13 = arg3[arg5];
        if (arg3[arg6] < var13) {
            var13 = arg3[arg6];
        }
        byte[] var14 = arg1[arg5];
        byte[] var15 = arg0[arg6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
            int var19 = var14[var16++] + var15[var17++];
            if (var19 < var13) {
                var13 = var19;
            }
        }
        return -var13;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
    public class70(byte[] arg0, int[] arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, byte[][] arg6) {
        this.field1414 = arg1;
        this.field1422 = arg2;
        this.field1392 = arg3;
        this.field1402 = arg4;
        this.method556(arg0);
        this.field1390 = arg6;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1422[var10] < var8 && this.field1402[var10] != 0) {
                var8 = this.field1422[var10];
            }
            if (this.field1422[var10] + this.field1402[var10] > var9) {
                var9 = this.field1422[var10] + this.field1402[var10];
            }
        }
        this.field1412 = this.field1411 - var8;
        this.field1405 = var9 - this.field1411;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Lpe;)V")
    private final void method568(class109 arg0) {
        try {
            if (arg0.method886(field1425, 122)) {
                field1399 = arg0.method897(false, 4).method878(57, 16);
                return;
            }
            if (arg0.method908(field1391, (byte) 104)) {
                field1399 = field1401;
                return;
            }
            if (arg0.method886(field1398, 99)) {
                field1415 = arg0.method897(false, 4).method878(57, 16);
                return;
            }
            if (arg0.method908(field1424, (byte) 93)) {
                field1415 = 8388608;
                return;
            }
            if (arg0.method908(field1413, (byte) 70)) {
                field1415 = -1;
                return;
            }
            if (arg0.method886(field1408, 77)) {
                field1417 = arg0.method897(false, 2).method878(57, 16);
                return;
            }
            if (arg0.method908(field1418, (byte) 59)) {
                field1417 = 0;
                return;
            }
            if (arg0.method908(field1394, (byte) 110)) {
                field1417 = -1;
                return;
            }
            if (arg0.method886(field1395, 109)) {
                field1396 = arg0.method897(false, 5).method878(57, 16);
                return;
            }
            if (arg0.method908(field1406, (byte) 63)) {
                field1396 = 0;
                return;
            }
            if (arg0.method908(field1419, (byte) 105)) {
                field1396 = field1420;
                return;
            }
            if (arg0.method908(field1410, (byte) 56)) {
                this.method566(field1401, field1420);
                return;
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "([B)V")
    public class70(byte[] arg0) {
        this.method556(arg0);
    }
}
