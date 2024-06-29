import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class319 extends class183 {

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    private int field5382 = 1024;

    @OriginalMember(owner = "client!si", name = "W", descriptor = "I")
    private int field5384 = 409;

    @OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
    private int field5389 = 0;

    @OriginalMember(owner = "client!si", name = "Y", descriptor = "I")
    private int field5386 = 819;

    @OriginalMember(owner = "client!si", name = "lb", descriptor = "I")
    private int field5399 = 1024;

    @OriginalMember(owner = "client!si", name = "mb", descriptor = "I")
    private int field5400 = 1024;

    @OriginalMember(owner = "client!si", name = "kb", descriptor = "I")
    private int field5398 = 1024;

    @OriginalMember(owner = "client!si", name = "ob", descriptor = "I")
    private int field5402 = 2048;

    @OriginalMember(owner = "client!si", name = "qb", descriptor = "I")
    private int field5404 = 0;

    @OriginalMember(owner = "client!si", name = "gb", descriptor = "Ljf;")
    public static class229 field5394 = class212.method1457((byte) 111, "mapdots");

    @OriginalMember(owner = "client!si", name = "db", descriptor = "Ljf;")
    private static class229 field5391 = class212.method1457((byte) 66, " has logged in)3");

    @OriginalMember(owner = "client!si", name = "fb", descriptor = "Ljf;")
    public static class229 field5393 = field5391;

    @OriginalMember(owner = "client!si", name = "ib", descriptor = "[I")
    public static int[] field5396 = new int[100];

    @OriginalMember(owner = "client!si", name = "Z", descriptor = "Ljg;")
    public static class303 field5387 = new class303();

    @OriginalMember(owner = "client!si", name = "pb", descriptor = "[I")
    public static int[] field5403 = new int[4096];

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!si", name = "X", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!si", name = "ab", descriptor = "I")
    private int field5388;

    @OriginalMember(owner = "client!si", name = "cb", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!si", name = "eb", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!si", name = "hb", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!si", name = "jb", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!si", name = "nb", descriptor = "Lbj;")
    public static class55 field5401;

    @OriginalMember(owner = "client!si", name = "rb", descriptor = "[Lkb;")
    public static class35[] field5405;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BZLjf;)V", line = 11)
    public static final void method2150(byte arg0, boolean arg1, class229 arg2) {
        int var3 = 0;
        field5390++;
        class229 var4 = arg2.method1608(arg0 ^ 0xC2);
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < client.field4467; var6++) {
            class313 var7 = class113.method799(var6, (byte) 50);
            if ((!arg1 || var7.field5262) && var7.field5303 == -1 && var7.field5321 == -1 && var7.field5318 == 0 && var7.field5281.method1608(-199).method1649(var4, (byte) -104) != -1) {
                if (var3 >= 250) {
                    class327.field5492 = null;
                    class111.field1950 = -1;
                    return;
                }
                if (var3 >= var5.length) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var3; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var3++] = (short) var6;
            }
        }
        if (arg0 != -5) {
            field5405 = (class35[]) null;
        }
        class228.field3923 = 0;
        class327.field5492 = var5;
        class111.field1950 = var3;
        class229[] var10 = new class229[class111.field1950];
        for (int var11 = 0; var11 < class111.field1950; var11++) {
            var10[var11] = class113.method799(var5[var11], (byte) 50).field5281;
        }
        class329.method2242(false, var10, class327.field5492);
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V", line = 80)
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILkh;I)V", line = 89)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            this.method14(120, (class14) null, 110);
        }
        if (arg2 == 0) {
            this.field5404 = arg1.method93(false);
        } else if (arg2 == 1) {
            this.field5400 = arg1.method116(-1);
        } else if (arg2 == 2) {
            this.field5402 = arg1.method116(-1);
        } else if (arg2 == 3) {
            this.field5384 = arg1.method116(-1);
        } else if (arg2 == 4) {
            this.field5386 = arg1.method116(-1);
        } else if (arg2 == 5) {
            this.field5382 = arg1.method116(-1);
        } else if (arg2 == 6) {
            this.field5389 = arg1.method93(false);
        } else if (arg2 == 7) {
            this.field5399 = arg1.method116(-1);
        } else if (arg2 == 8) {
            this.field5398 = arg1.method116(-1);
        }
        field5385++;
    }

    @OriginalMember(owner = "client!si", name = "e", descriptor = "(B)V", line = 183)
    public static void method2151(byte arg0) {
        field5393 = null;
        field5391 = null;
        field5387 = null;
        field5396 = null;
        if (arg0 < 40) {
            field5394 = (class229) null;
        }
        field5403 = null;
        field5401 = null;
        field5405 = null;
        field5394 = null;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(II)[I", line = 200)
    public final int[] method10(int arg0, int arg1) {
        field5397++;
        if (arg1 != -1) {
            return (int[]) null;
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (!this.field3161.field1736) {
            return var3;
        }
        int[][] var4 = this.field3161.method666(23123);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = 0;
        int var12 = class22.field393 * this.field5400 >> 12;
        boolean var13 = true;
        int var14 = class22.field393 * this.field5402 >> 12;
        int var15 = 0;
        int var16 = class144.field2508 * this.field5384 >> 12;
        int var17 = class144.field2508 * this.field5386 >> 12;
        if (var17 <= 1) {
            return var4[arg0];
        }
        int var18 = class22.field393 / var12 + 1;
        this.field5388 = class22.field393 / 8 * this.field5382 >> 12;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field5404);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = var12 + class50.method413(var14 - var12, false, var20);
                int var23 = var16 + class50.method413(var17 - var16, false, var20);
                int var24 = var8 + var22;
                if (var24 > class22.field393) {
                    var24 = class22.field393;
                    var22 = class22.field393 - var8;
                }
                int var25;
                if (var13) {
                    var25 = 0;
                } else {
                    int var26 = var9;
                    int[] var27 = var19[var9];
                    var25 = var27[2];
                    int var28 = var24 + var6;
                    int var29 = 0;
                    if (var28 < 0) {
                        var28 += class22.field393;
                    }
                    if (var28 > class22.field393) {
                        var28 -= class22.field393;
                    }
                    while (true) {
                        int[] var30 = var19[var26];
                        if (var28 >= var30[0] && var28 <= var30[1]) {
                            if (var9 != var26) {
                                int var31 = var6 + var8;
                                if (var31 < 0) {
                                    var31 += class22.field393;
                                }
                                if (var31 > class22.field393) {
                                    var31 -= class22.field393;
                                }
                                for (int var32 = 1; var32 <= var29; var32++) {
                                    int[] var33 = var19[(var9 + var32) % var11];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var29; var34++) {
                                    int[] var35 = var19[(var9 + var34) % var11];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var28 > var31) {
                                            var40 = Math.max(var31, var37);
                                            var39 = Math.min(var28, var38);
                                        } else if (var37 == 0) {
                                            var39 = Math.min(var28, var38);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var31, var37);
                                            var39 = class22.field393;
                                        }
                                        this.method2152(var25 - var36, var36, var40 + var7, -var40 + var39, var20, 113, var4);
                                    }
                                }
                            }
                            var9 = var26;
                            break;
                        }
                        var26++;
                        if (var26 >= var11) {
                            var26 = 0;
                        }
                        var29++;
                    }
                }
                if (class144.field2508 < (var23 + var25)) {
                    var23 = class144.field2508 - var25;
                } else {
                    var10 = false;
                }
                if (class22.field393 == var24) {
                    this.method2152(var23, var25, var5 + var8, var22, var20, arg1 ^ 0xFFFFFFE0, var4);
                    if (var10) {
                        return var3;
                    }
                    var7 = var5;
                    var10 = true;
                    var13 = false;
                    int[][] var41 = var19;
                    var9 = 0;
                    int[] var42 = var21[var15++];
                    var42[2] = var23 + var25;
                    var42[0] = var8;
                    var8 = 0;
                    var11 = var15;
                    var15 = 0;
                    var19 = var21;
                    var42[1] = var24;
                    var21 = var41;
                    var5 = class50.method413(class22.field393, false, var20);
                    var6 = var5 - var7;
                    int var43 = var6;
                    if (var6 < 0) {
                        var43 = class22.field393 + var6;
                    }
                    if (class22.field393 < var43) {
                        var43 -= class22.field393;
                    }
                    while (true) {
                        int[] var44 = var19[var9];
                        if (var43 >= var44[0] && var43 <= var44[1]) {
                            break;
                        }
                        var9++;
                        if (var11 <= var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var45 = var21[var15++];
                    var45[2] = var23 + var25;
                    var45[1] = var24;
                    var45[0] = var8;
                    this.method2152(var23, var25, var8 + var5, var22, var20, 73, var4);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 448)
    public final void method25(int arg0) {
        field5381++;
        if (arg0 != -8) {
            this.method14(-127, (class14) null, 120);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIILjava/util/Random;I[[I)V", line = 477)
    private final void method2152(int arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int[][] arg6) {
        int var8 = this.field5398 <= 0 ? 4096 : 4096 - class50.method413(this.field5398, false, arg4);
        field5392++;
        if (arg5 < 18) {
            this.method2152(14, 94, -106, -5, (Random) null, -112, (int[][]) ((int[][]) null));
        }
        int var9 = this.field5399 * this.field5388 >> 12;
        int var10 = this.field5388 - (var9 <= 0 ? 0 : class50.method413(var9, false, arg4));
        if (arg2 >= class22.field393) {
            arg2 -= class22.field393;
        }
        if (var10 > 0) {
            if (arg0 <= 0 || arg3 <= 0) {
                return;
            }
            int var11 = arg0 / 2;
            int var12 = arg3 / 2;
            int var13 = var10 > var11 ? var11 : var10;
            int var14 = var12 < var10 ? var12 : var10;
            int var15 = arg3 - (var14 * 2);
            int var16 = arg2 + var14;
            for (int var17 = 0; var17 < arg0; var17++) {
                int[] var18 = arg6[arg1 + var17];
                if (var13 > var17) {
                    int var19 = var8 * var17 / var13;
                    if (this.field5389 == 0) {
                        for (int var22 = 0; var22 < var14; var22++) {
                            int var23 = var8 * var22 / var14;
                            var18[class305.method2086(arg2 + var22, class52.field913)] = var18[class305.method2086(arg2 + arg3 - var22 - 1, class52.field913)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var14; var20++) {
                            int var21 = var8 * var20 / var14;
                            var18[class305.method2086(class52.field913, arg2 + var20)] = var18[class305.method2086(class52.field913, arg2 + arg3 - var20 - 1)] = var19 > var21 ? var21 : var19;
                        }
                    }
                    if ((var15 + var16) <= class22.field393) {
                        class36.method319(var18, var16, var15, var19);
                    } else {
                        int var24 = class22.field393 - var16;
                        class36.method319(var18, var16, var24, var19);
                        class36.method319(var18, 0, var15 - var24, var19);
                    }
                } else {
                    int var25 = arg0 - var17 - 1;
                    if (var13 > var25) {
                        int var26 = var8 * var25 / var13;
                        if (this.field5389 == 0) {
                            for (int var29 = 0; var29 < var14; var29++) {
                                int var30 = var8 * var29 / var14;
                                var18[class305.method2086(class52.field913, arg2 + var29)] = var18[class305.method2086(arg2 + arg3 - var29 - 1, class52.field913)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var14; var27++) {
                                int var28 = var8 * var27 / var14;
                                var18[class305.method2086(class52.field913, arg2 + var27)] = var18[class305.method2086(arg3 + arg2 - var27 - 1, class52.field913)] = var28 >= var26 ? var26 : var28;
                            }
                        }
                        if (class22.field393 < (var15 + var16)) {
                            int var31 = class22.field393 - var16;
                            class36.method319(var18, var16, var31, var26);
                            class36.method319(var18, 0, var15 - var31, var26);
                        } else {
                            class36.method319(var18, var16, var15, var26);
                        }
                    } else {
                        for (int var32 = 0; var32 < var14; var32++) {
                            var18[class305.method2086(arg2 + var32, class52.field913)] = var18[class305.method2086(class52.field913, arg2 + arg3 - var32 - 1)] = var8 * var32 / var14;
                        }
                        if (class22.field393 < var15 + var16) {
                            int var33 = class22.field393 - var16;
                            class36.method319(var18, var16, var33, var8);
                            class36.method319(var18, 0, var15 - var33, var8);
                        } else {
                            class36.method319(var18, var16, var15, var8);
                        }
                    }
                }
            }
        } else if (arg2 + arg3 > class22.field393) {
            int var34 = class22.field393 - arg2;
            for (int var35 = 0; var35 < arg0; var35++) {
                int[] var36 = arg6[arg1 + var35];
                class36.method319(var36, arg2, var34, var8);
                class36.method319(var36, 0, arg3 - var34, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg0; var37++) {
                class36.method319(arg6[arg1 + var37], arg2, arg3, var8);
            }
        }
    }
}
