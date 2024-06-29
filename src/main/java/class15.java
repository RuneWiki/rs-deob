import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class15 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field307 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field306 = 500;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private int field305 = 100;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    private int[] field312 = new int[5];

    @OriginalMember(owner = "client!be", name = "q", descriptor = "[I")
    private int[] field320 = new int[5];

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    private int[] field315 = new int[5];

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[I")
    private static int[] field322 = new int[32768];

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[I")
    private static int[] field318;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
    private static int[] field323;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
    private static int[] field324;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    private static int[] field325;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[I")
    private static int[] field326;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[I")
    private static int[] field328;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "[I")
    private static int[] field327;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lch;")
    private class27 field304;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lch;")
    private class27 field308;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lch;")
    private class27 field310;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lch;")
    private class27 field311;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lch;")
    private class27 field313;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lch;")
    private class27 field316;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lch;")
    private class27 field317;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lch;")
    private class27 field319;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Lch;")
    private class27 field321;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lkb;")
    private class91 field309;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
    public static void method88() {
        field323 = null;
        field322 = null;
        field318 = null;
        field326 = null;
        field325 = null;
        field324 = null;
        field327 = null;
        field328 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
    private final int method89(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
        } else if (arg2 == 2) {
            return field318[arg0 & 0x7FFF] * arg1 >> 14;
        } else if (arg2 == 3) {
            return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
        } else if (arg2 == 4) {
            return field322[arg0 / 2607 & 0x7FFF] * arg1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        class131.method965(field323, 0, arg0);
        if (arg1 < 10) {
            return field323;
        }
        double var3 = (double) arg0 / ((double) arg1 + 0.0D);
        this.field313.method155();
        this.field321.method155();
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field316 != null) {
            this.field316.method155();
            this.field311.method155();
            var5 = (int) ((double) (this.field316.field525 - this.field316.field521) * 32.768D / var3);
            var6 = (int) ((double) this.field316.field521 * 32.768D / var3);
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        if (this.field317 != null) {
            this.field317.method155();
            this.field308.method155();
            var8 = (int) ((double) (this.field317.field525 - this.field317.field521) * 32.768D / var3);
            var9 = (int) ((double) this.field317.field521 * 32.768D / var3);
        }
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field320[var11] != 0) {
                field326[var11] = 0;
                field325[var11] = (int) ((double) this.field315[var11] * var3);
                field324[var11] = (this.field320[var11] << 14) / 100;
                field327[var11] = (int) ((double) (this.field313.field525 - this.field313.field521) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field312[var11]) / var3);
                field328[var11] = (int) ((double) this.field313.field521 * 32.768D / var3);
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int var39 = this.field313.method153(arg0);
            int var40 = this.field321.method153(arg0);
            if (this.field316 != null) {
                int var41 = this.field316.method153(arg0);
                int var42 = this.field311.method153(arg0);
                var39 += this.method89(var7, var42, this.field316.field524) >> 1;
                var7 += (var5 * var41 >> 16) + var6;
            }
            if (this.field317 != null) {
                int var43 = this.field317.method153(arg0);
                int var44 = this.field308.method153(arg0);
                var40 = var40 * ((this.method89(var10, var44, this.field317.field524) >> 1) + 32768) >> 15;
                var10 += (var8 * var43 >> 16) + var9;
            }
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field320[var45] != 0) {
                    int var46 = field325[var45] + var12;
                    if (var46 < arg0) {
                        field323[var46] += this.method89(field326[var45], field324[var45] * var40 >> 15, this.field313.field524);
                        field326[var45] += (field327[var45] * var39 >> 16) + field328[var45];
                    }
                }
            }
        }
        if (this.field310 != null) {
            this.field310.method155();
            this.field319.method155();
            int var13 = 0;
            boolean var14 = false;
            boolean var15 = true;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = this.field310.method153(arg0);
                int var18 = this.field319.method153(arg0);
                int var19;
                if (var15) {
                    var19 = ((this.field310.field525 - this.field310.field521) * var17 >> 8) + this.field310.field521;
                } else {
                    var19 = ((this.field310.field525 - this.field310.field521) * var18 >> 8) + this.field310.field521;
                }
                var13 += 256;
                if (var13 >= var19) {
                    var13 = 0;
                    var15 = !var15;
                }
                if (var15) {
                    field323[var16] = 0;
                }
            }
        }
        if (this.field314 > 0 && this.field305 > 0) {
            int var20 = (int) ((double) this.field314 * var3);
            for (int var21 = var20; var21 < arg0; var21++) {
                field323[var21] += field323[var21 - var20] * this.field305 / 100;
            }
        }
        if (this.field309.field2074[0] > 0 || this.field309.field2074[1] > 0) {
            this.field304.method155();
            int var22 = this.field304.method153(arg0 + 1);
            int var23 = this.field309.method765(0, (float) var22 / 65536.0F);
            int var24 = this.field309.method765(1, (float) var22 / 65536.0F);
            if (arg0 >= var23 + var24) {
                int var25 = 0;
                int var26 = var24;
                if (var24 > arg0 - var23) {
                    var26 = arg0 - var23;
                }
                while (var25 < var26) {
                    int var35 = (int) ((long) field323[var23 + var25] * (long) class91.field2073 >> 16);
                    for (int var36 = 0; var36 < var23; var36++) {
                        var35 += (int) ((long) field323[var23 + var25 - var36 - 1] * (long) class91.field2069[0][var36] >> 16);
                    }
                    for (int var37 = 0; var37 < var25; var37++) {
                        var35 -= (int) ((long) field323[var25 - var37 - 1] * (long) class91.field2069[1][var37] >> 16);
                    }
                    field323[var25] = var35;
                    var22 = this.field304.method153(arg0 + 1);
                    var25++;
                }
                int var27 = 128;
                while (true) {
                    if (var27 > arg0 - var23) {
                        var27 = arg0 - var23;
                    }
                    while (var25 < var27) {
                        int var32 = (int) ((long) field323[var23 + var25] * (long) class91.field2073 >> 16);
                        for (int var33 = 0; var33 < var23; var33++) {
                            var32 += (int) ((long) field323[var23 + var25 - var33 - 1] * (long) class91.field2069[0][var33] >> 16);
                        }
                        for (int var34 = 0; var34 < var24; var34++) {
                            var32 -= (int) ((long) field323[var25 - var34 - 1] * (long) class91.field2069[1][var34] >> 16);
                        }
                        field323[var25] = var32;
                        var22 = this.field304.method153(arg0 + 1);
                        var25++;
                    }
                    if (var25 >= arg0 - var23) {
                        while (var25 < arg0) {
                            int var28 = 0;
                            for (int var29 = var23 + var25 - arg0; var29 < var23; var29++) {
                                var28 += (int) ((long) field323[var23 + var25 - var29 - 1] * (long) class91.field2069[0][var29] >> 16);
                            }
                            for (int var30 = 0; var30 < var24; var30++) {
                                var28 -= (int) ((long) field323[var25 - var30 - 1] * (long) class91.field2069[1][var30] >> 16);
                            }
                            field323[var25] = var28;
                            this.field304.method153(arg0 + 1);
                            var25++;
                        }
                        break;
                    }
                    var23 = this.field309.method765(0, (float) var22 / 65536.0F);
                    var24 = this.field309.method765(1, (float) var22 / 65536.0F);
                    var27 += 128;
                }
            }
        }
        for (int var38 = 0; var38 < arg0; var38++) {
            if (field323[var38] < -32768) {
                field323[var38] = -32768;
            }
            if (field323[var38] > 32767) {
                field323[var38] = 32767;
            }
        }
        return field323;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lhc;)V")
    public final void method91(class66 arg0) {
        this.field313 = new class27();
        this.field313.method154(arg0);
        this.field321 = new class27();
        this.field321.method154(arg0);
        int var2 = arg0.method509(127);
        if (var2 != 0) {
            arg0.field1620--;
            this.field316 = new class27();
            this.field316.method154(arg0);
            this.field311 = new class27();
            this.field311.method154(arg0);
        }
        int var3 = arg0.method509(121);
        if (var3 != 0) {
            arg0.field1620--;
            this.field317 = new class27();
            this.field317.method154(arg0);
            this.field308 = new class27();
            this.field308.method154(arg0);
        }
        int var4 = arg0.method509(116);
        if (var4 != 0) {
            arg0.field1620--;
            this.field310 = new class27();
            this.field310.method154(arg0);
            this.field319 = new class27();
            this.field319.method154(arg0);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            int var6 = arg0.method492(255);
            if (var6 == 0) {
                break;
            }
            this.field320[var5] = var6;
            this.field312[var5] = arg0.method490(39);
            this.field315[var5] = arg0.method492(255);
        }
        this.field314 = arg0.method492(255);
        this.field305 = arg0.method492(255);
        this.field306 = arg0.method511(-122);
        this.field307 = arg0.method511(104);
        this.field309 = new class91();
        this.field304 = new class27();
        this.field309.method767(arg0, this.field304);
    }

    static {
        Random var0 = new Random(0L);
        for (int var1 = 0; var1 < 32768; var1++) {
            field322[var1] = (var0.nextInt() & 0x2) - 1;
        }
        field318 = new int[32768];
        for (int var2 = 0; var2 < 32768; var2++) {
            field318[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
        }
        field323 = new int[220500];
        field324 = new int[5];
        field325 = new int[5];
        field326 = new int[5];
        field328 = new int[5];
        field327 = new int[5];
    }
}
