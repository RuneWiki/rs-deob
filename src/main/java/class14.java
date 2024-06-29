import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 {

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    private int field348 = 32;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "J")
    private long field346 = class80.method504(-1);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "[Ldh;")
    private class41[] field357 = new class41[8];

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "[Ldh;")
    private class41[] field359 = new class41[8];

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    private int field356 = 0;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "J")
    private long field360 = 0L;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "J")
    private long field361 = 0L;

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "Z")
    private boolean field364 = true;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field365 = 0;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    private int field366 = 0;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    private int field362 = 0;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[S")
    public static short[] field337 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Lqe;")
    public static class179 field349 = class206.method1380("M", (byte) -126);

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[I")
    public static int[] field355 = new int[2000];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lqe;")
    private static class179 field345 = class206.method1380("Enter your username (V password)3", (byte) -127);

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lqe;")
    public static class179 field343 = field345;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Ldh;")
    private class41 field330;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
    public int[] field338;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "[[I")
    public static int[][] field331;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[[[B")
    public static byte[][][] field342;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldh;IZ)V")
    private final void method91(class41 arg0, int arg1, boolean arg2) {
        field333++;
        int var4 = arg1 >> 5;
        if (arg2) {
            this.method101(null, 113);
        }
        class41 var5 = this.field357[var4];
        if (var5 == null) {
            this.field359[var4] = arg0;
        } else {
            var5.field874 = arg0;
        }
        this.field357[var4] = arg0;
        arg0.field875 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public final synchronized void method92(byte arg0) {
        this.field364 = true;
        field363++;
        try {
            this.method94();
            if (arg0 != -28) {
                this.method99();
            }
        } catch (Exception var2) {
            this.method99();
            this.field361 = class80.method504(arg0 + 27) + 2000L;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
    public void method93() throws Exception {
        field335++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
    public void method94() throws Exception {
        field352++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method95(Component arg0) throws Exception {
        field350++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
    public final void method96(byte arg0) {
        field339++;
        if (arg0 < 81) {
            this.method91(null, 15, false);
        }
        this.field364 = true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method97(int arg0) {
        field345 = null;
        field331 = null;
        field337 = null;
        field342 = null;
        field349 = null;
        field343 = null;
        field355 = null;
        if (arg0 != -5) {
            method97(-89);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BB)V")
    public static final void method98(byte[] arg0, byte arg1) {
        field351++;
        int var2 = class19.field501 >> 2 << 10;
        byte[][] var3 = new byte[class146.field2655][class202.field3736];
        if (arg1 >= -39) {
            field343 = null;
        }
        int var4 = class3.field40 >> 1;
        int var5 = 0;
        while (true) {
            while (var5 < arg0.length) {
                int var34 = (arg0[var5++] & 0xFF) * 64 - class176.field3209;
                int var35 = (arg0[var5++] & 0xFF) * 64 - class66.field1350;
                if (var34 > 0 && var35 > 0 && class146.field2655 > var34 + 64 && class202.field3736 > var35 + 64) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        int var37 = class202.field3736 - var35 - 1;
                        byte[] var38 = var3[var34 + var36];
                        for (int var39 = -64; var39 < 0; var39++) {
                            var38[var37--] = arg0[var5++];
                        }
                    }
                } else {
                    var5 += 4096;
                }
            }
            int var6 = class146.field2655;
            int var7 = class202.field3736;
            int[] var8 = new int[var7];
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var6 > var28) {
                        int var29 = var3[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class64 var30 = class77.method494((byte) 16, var29 - 1);
                            var8[var14] += var30.field1323;
                            var10[var14] += var30.field1335;
                            var9[var14] += var30.field1334;
                            var11[var14] += var30.field1324;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var3[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class64 var33 = class77.method494((byte) 16, var32 - 1);
                            var8[var14] -= var33.field1323;
                            var10[var14] -= var33.field1335;
                            var9[var14] -= var33.field1334;
                            var11[var14] -= var33.field1324;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class237.field4371[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        if (var7 > var22) {
                            var18 += var9[var22];
                            var17 += var8[var22];
                            var16 += var10[var22];
                            var20 += var12[var22];
                            var19 += var11[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var16 -= var10[var23];
                            var19 -= var11[var23];
                            var18 -= var9[var23];
                            var17 -= var8[var23];
                            var20 -= var12[var23];
                        }
                        if (var21 >= 0 && var20 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var19 == 0 ? 0 : class67.method436(var18 / var20, var17 * 256 / var19, 217, var16 / var20);
                            if (var3[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class237.field4371[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var4;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var2 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class107.method696(var13, 63) + class107.method696(var21 << 6, 4032)] = class27.field602[class3.method20(var27, 96, -14053)];
                            } else if (var15[var24] != null) {
                                var15[var24][class107.method696(63, var13) + class107.method696(4032, var21 << 6)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "()V")
    public void method99() {
        field344++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
    public static final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field334++;
        class164.field2972 = class146.field2655 * arg3 / arg0;
        class131.field2386 = -1;
        if (arg2 > 123) {
            class71.field1421 = class202.field3736 * arg4 / arg1;
            class139.field2570 = -1;
            class161.method1037(22704);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([II)V")
    private final void method101(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class121.field2268) {
            var3 = arg1 << 1;
        }
        class154.method987(arg0, 0, var3);
        this.field366 -= arg1;
        if (this.field330 != null && this.field366 <= 0) {
            this.field366 += class80.field1542 >> 4;
            class43.method285(-10000, this.field330);
            this.method91(this.field330, this.field330.method273(), false);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class41 var10 = null;
                        class41 var11 = this.field359[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class63 var12 = var11.field872;
                                if (var12 == null || var12.field1318 <= var8) {
                                    var11.field873 = true;
                                    int var13 = var11.method276();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1318 += var13;
                                    }
                                    if (var4 >= this.field348) {
                                        break label107;
                                    }
                                    class41 var14 = var11.method272();
                                    if (var14 != null) {
                                        int var15 = var11.field875;
                                        while (var14 != null) {
                                            this.method91(var14, var15 * var14.method273() >> 8, false);
                                            var14 = var11.method274();
                                        }
                                    }
                                    class41 var16 = var11.field874;
                                    var11.field874 = null;
                                    if (var10 == null) {
                                        this.field359[var7] = var16;
                                    } else {
                                        var10.field874 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field357[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field874;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class41 var18 = this.field359[var17];
                this.field359[var17] = this.field357[var17] = null;
                while (var18 != null) {
                    class41 var19 = var18.field874;
                    var18.field874 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field366 < 0) {
            this.field366 = 0;
        }
        if (this.field330 != null) {
            this.field330.method275(arg0, 0, arg1);
        }
        this.field346 = class80.method504(-1);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final synchronized void method102(int arg0) {
        if (arg0 != 0) {
            this.field330 = null;
        }
        field332++;
        if (class77.field1484 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class77.field1484.field1417[var3] == this) {
                    class77.field1484.field1417[var3] = null;
                }
                if (class77.field1484.field1417[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class77.field1484.field1425 = true;
                while (class77.field1484.field1423) {
                    class137.method873(50L, -967787128);
                }
                class77.field1484 = null;
            }
        }
        this.method99();
        this.field338 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
    private final void method103(boolean arg0, int arg1) {
        if (arg0) {
            this.method106(122, null);
        }
        this.field366 -= arg1;
        if (this.field366 < 0) {
            this.field366 = 0;
        }
        if (this.field330 != null) {
            this.field330.method277(arg1);
        }
        field341++;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
    public int method104() throws Exception {
        field354++;
        return this.field353;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public void method105(int arg0) throws Exception {
        field340++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILdh;)V")
    public final synchronized void method106(int arg0, class41 arg1) {
        if (arg0 != 0) {
            this.field348 = -14;
        }
        this.field330 = arg1;
        field336++;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    public final synchronized void method107(int arg0) {
        field347++;
        if (this.field338 == null) {
            return;
        }
        long var2 = class80.method504(-1);
        try {
            if (this.field361 != 0L) {
                if (var2 < this.field361) {
                    return;
                }
                this.method105(this.field353);
                this.field364 = true;
                this.field361 = 0L;
            }
            int var4 = this.method104();
            int var5 = this.field367 + this.field358;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field356 < this.field365 - var4) {
                this.field356 = this.field365 - var4;
            }
            if (var5 + 256 > this.field353) {
                var4 = 0;
                this.field353 += 1024;
                if (this.field353 > 16384) {
                    this.field353 = 16384;
                }
                this.method99();
                this.method105(this.field353);
                this.field364 = true;
                if (this.field353 < var5 + 256) {
                    var5 = this.field353 - 256;
                    this.field358 = var5 - this.field367;
                }
            }
            if (arg0 < 120) {
                return;
            }
            while (var5 > var4) {
                this.method101(this.field338, 256);
                var4 += 256;
                this.method93();
            }
            if (var2 > this.field360) {
                if (this.field364) {
                    this.field364 = false;
                } else if (this.field356 == 0 && this.field362 == 0) {
                    this.method99();
                    this.field361 = var2 + 2000L;
                    return;
                } else {
                    this.field358 = Math.min(this.field362, this.field356);
                    this.field362 = this.field356;
                }
                this.field356 = 0;
                this.field360 = var2 + 2000L;
            }
            this.field365 = var4;
        } catch (Exception var7) {
            this.method99();
            this.field361 = var2 + 2000L;
        }
        try {
            if (this.field346 + 500000L < var2) {
                var2 = this.field346;
            }
            while (this.field346 + 5000L < var2) {
                this.method103(false, 256);
                this.field346 += 256000 / class80.field1542;
            }
        } catch (Exception var6) {
            this.field346 = var2;
        }
    }
}
