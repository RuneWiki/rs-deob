import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class44 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field617 = 0;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field621 = 0;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field622 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    public static int[] field618;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field619;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[I")
    public static int[] field624;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "()V", line = 5)
    public static void method313() {
        field624 = null;
        field619 = null;
        field618 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII)V", line = 10)
    public static final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        method329(arg0, arg1, arg2, arg4, arg5);
        method329(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        if (arg3 >= 3) {
            method333(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
            method333(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIIII)V", line = 28)
    public static final void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < field622) {
            arg2 -= field622 - arg0;
            arg0 = field622;
        }
        if (arg1 < field616) {
            arg3 -= field616 - arg1;
            arg1 = field616;
        }
        if (arg0 + arg2 > field617) {
            arg2 = field617 - arg0;
        }
        if (arg1 + arg3 > field621) {
            arg3 = field621 - arg1;
        }
        int var6 = ((arg4 & 0xFF00FF) * arg5 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * arg5 >> 8 & 0xFF00);
        int var7 = 256 - arg5;
        int var8 = field623 - arg2;
        int var9 = field623 * arg1 + arg0;
        for (int var10 = 0; var10 < arg3; var10++) {
            for (int var11 = -arg2; var11 < 0; var11++) {
                int var12 = field624[var9];
                int var13 = ((var12 & 0xFF00FF) * var7 >> 8 & 0xFF00FF) + ((var12 & 0xFF00) * var7 >> 8 & 0xFF00);
                field624[var9++] = var6 + var13;
            }
            var9 += var8;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        method339(arg0, arg1, arg2, arg4);
        method339(arg0, arg1 + arg3 - 1, arg2, arg4);
        method328(arg0, arg1, arg3, arg4);
        method328(arg0 + arg2 - 1, arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII)V", line = 82)
    public static final void method317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field622) {
            arg2 -= field622 - arg0;
            arg0 = field622;
        }
        if (arg1 < field616) {
            arg3 -= field616 - arg1;
            arg1 = field616;
        }
        if (arg0 + arg2 > field617) {
            arg2 = field617 - arg0;
        }
        if (arg1 + arg3 > field621) {
            arg3 = field621 - arg1;
        }
        int var5 = field623 - arg2;
        int var6 = field623 * arg1 + arg0;
        for (int var7 = -arg3; var7 < 0; var7++) {
            for (int var8 = -arg2; var8 < 0; var8++) {
                field624[var6++] = arg4;
            }
            var6 += var5;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "()V", line = 125)
    public static final void method318() {
        field622 = 0;
        field616 = 0;
        field617 = field623;
        field621 = field620;
        method330();
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII)V", line = 133)
    public static final void method319(int arg0, int arg1, int arg2, int arg3) {
        if (field622 < arg0) {
            field622 = arg0;
        }
        if (field616 < arg1) {
            field616 = arg1;
        }
        if (field617 > arg2) {
            field617 = arg2;
        }
        if (field621 > arg3) {
            field621 = arg3;
        }
        method330();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIII)V", line = 148)
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg2 - arg0;
        int var6 = arg3 - arg1;
        if (var6 == 0) {
            if (var5 >= 0) {
                method339(arg0, arg1, var5 + 1, arg4);
            } else {
                method339(arg0 + var5, arg1, 1 - var5, arg4);
            }
        } else if (var5 != 0) {
            if (var5 + var6 < 0) {
                arg0 += var5;
                var5 = -var5;
                arg1 += var6;
                var6 = -var6;
            }
            if (var5 > var6) {
                int var7 = arg1 << 16;
                int var8 = var7 + 32768;
                int var9 = var6 << 16;
                int var10 = (int) Math.floor((double) var9 / (double) var5 + 0.5D);
                int var11 = arg0 + var5;
                if (arg0 < field622) {
                    var8 += (field622 - arg0) * var10;
                    arg0 = field622;
                }
                if (var11 >= field617) {
                    var11 = field617 - 1;
                }
                while (arg0 <= var11) {
                    int var12 = var8 >> 16;
                    if (var12 >= field616 && var12 < field621) {
                        field624[field623 * var12 + arg0] = arg4;
                    }
                    var8 += var10;
                    arg0++;
                }
            } else {
                int var13 = arg0 << 16;
                int var14 = var13 + 32768;
                int var15 = var5 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg1 + var6;
                if (arg1 < field616) {
                    var14 += (field616 - arg1) * var16;
                    arg1 = field616;
                }
                if (var17 >= field621) {
                    var17 = field621 - 1;
                }
                while (arg1 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field622 && var18 < field617) {
                        field624[field623 * arg1 + var18] = arg4;
                    }
                    var14 += var16;
                    arg1++;
                }
            }
        } else if (var6 >= 0) {
            method328(arg0, arg1, var6 + 1, arg4);
        } else {
            method328(arg0, arg1 + var6, -var6 + 1, arg4);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII[I[I)V", line = 241)
    private static final void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field621 - field616 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg1 >= field616 && arg1 < field621) {
            int var7 = arg5[arg1 - field616] + field622;
            if (arg0 < var7) {
                arg2 -= var7 - arg0;
                arg0 = var7;
            }
            int var8 = arg5[arg1 - field616] + field622 + arg6[arg1 - field616];
            if (arg0 + arg2 > var8) {
                arg2 = var8 - arg0;
            }
            int var9 = 256 - arg4;
            int var10 = (arg3 >> 16 & 0xFF) * arg4;
            int var11 = (arg3 >> 8 & 0xFF) * arg4;
            int var12 = (arg3 & 0xFF) * arg4;
            int var13 = field623 * arg1 + arg0;
            for (int var14 = 0; var14 < arg2; var14++) {
                int var15 = (field624[var13] >> 16 & 0xFF) * var9;
                int var16 = (field624[var13] >> 8 & 0xFF) * var9;
                int var17 = (field624[var13] & 0xFF) * var9;
                int var18 = (var12 + var17 >> 8) + (var10 + var15 >> 8 << 16) + (var11 + var16 >> 8 << 8);
                field624[var13++] = var18;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIII)V", line = 289)
    private static final void method322(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            method334(arg0, arg1, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var4 = arg1 - arg2;
        if (var4 < field616) {
            var4 = field616;
        }
        int var5 = arg1 + arg2 + 1;
        if (var5 > field621) {
            var5 = field621;
        }
        int var6 = var4;
        int var7 = arg2 * arg2;
        int var8 = 0;
        int var9 = arg1 - var4;
        int var10 = var9 * var9;
        int var11 = var10 - var9;
        if (arg1 > var5) {
            arg1 = var5;
        }
        while (var6 < arg1) {
            while (var11 <= var7 || var10 <= var7) {
                var10 += var8 + var8;
                var11 += var8++ + var8;
            }
            int var12 = arg0 + 1 - var8;
            if (var12 < field622) {
                var12 = field622;
            }
            int var13 = arg0 + var8;
            if (var13 > field617) {
                var13 = field617;
            }
            int var14 = field623 * var6 + var12;
            for (int var15 = var12; var15 < var13; var15++) {
                field624[var14++] = arg3;
            }
            var6++;
            var10 -= var9-- + var9;
            var11 -= var9 + var9;
        }
        int var16 = arg2;
        int var17 = var6 - arg1;
        int var18 = var17 * var17 + var7;
        int var19 = var18 - arg2;
        int var20 = var18 - var17;
        while (var6 < var5) {
            while (var20 > var7 && var19 > var7) {
                var20 -= var16-- + var16;
                var19 -= var16 + var16;
            }
            int var21 = arg0 - var16;
            if (var21 < field622) {
                var21 = field622;
            }
            int var22 = arg0 + var16;
            if (var22 > field617 - 1) {
                var22 = field617 - 1;
            }
            int var23 = field623 * var6 + var21;
            for (int var24 = var21; var24 <= var22; var24++) {
                field624[var23++] = arg3;
            }
            var6++;
            var20 += var17 + var17;
            var19 += var17++ + var17;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I[I)V", line = 396)
    public static final void method323(int[] arg0, int[] arg1) {
        if (field621 - field616 != arg0.length || field621 - field616 != arg1.length) {
            throw new IllegalArgumentException();
        }
        field619 = arg0;
        field618 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[I[I)V", line = 408)
    public static final void method324(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = field623 * arg1 + arg0;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            int var7 = arg3[var6] + var5;
            for (int var8 = -arg4[var6]; var8 < 0; var8++) {
                field624[var7++] = arg2;
            }
            var5 += field623;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([III)V", line = 427)
    public static final void method325(int[] arg0, int arg1, int arg2) {
        field624 = arg0;
        field623 = arg1;
        field620 = arg2;
        method326(0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIII)V", line = 433)
    public static final void method326(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > field623) {
            arg2 = field623;
        }
        if (arg3 > field620) {
            arg3 = field620;
        }
        field622 = arg0;
        field616 = arg1;
        field617 = arg2;
        field621 = arg3;
        method330();
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(IIIII[I[I)V", line = 458)
    private static final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
        if (field621 - field616 != arg5.length) {
            throw new IllegalStateException();
        } else if (arg0 >= field622 && arg0 < field617) {
            if (arg1 < field616) {
                arg2 -= field616 - arg1;
                arg1 = field616;
            }
            if (arg1 + arg2 > field621) {
                arg2 = field621 - arg1;
            }
            int var7 = 256 - arg4;
            int var8 = (arg3 >> 16 & 0xFF) * arg4;
            int var9 = (arg3 >> 8 & 0xFF) * arg4;
            int var10 = (arg3 & 0xFF) * arg4;
            int var11 = field623 * arg1 + arg0;
            for (int var12 = 0; var12 < arg2; var12++) {
                int var13 = arg1 + var12 - field616;
                if (arg0 - field622 >= arg5[var13] && arg0 - field622 < arg5[var13] + arg6[var13]) {
                    int var14 = (field624[var11] >> 16 & 0xFF) * var7;
                    int var15 = (field624[var11] >> 8 & 0xFF) * var7;
                    int var16 = (field624[var11] & 0xFF) * var7;
                    int var17 = (var10 + var16 >> 8) + (var8 + var14 >> 8 << 16) + (var9 + var15 >> 8 << 8);
                    field624[var11] = var17;
                }
                var11 += field623;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(IIII)V", line = 514)
    public static final void method328(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < field622 || arg0 >= field617) {
            return;
        }
        if (arg1 < field616) {
            arg2 -= field616 - arg1;
            arg1 = field616;
        }
        if (arg1 + arg2 > field621) {
            arg2 = field621 - arg1;
        }
        int var4 = field623 * arg1 + arg0;
        int var5 = 0;
        while (var5 < arg2) {
            field624[var4] = arg3;
            var5++;
            var4 += field623;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(IIIII)V", line = 540)
    public static final void method329(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < field616 || arg1 >= field621) {
            return;
        }
        if (arg0 < field622) {
            arg2 -= field622 - arg0;
            arg0 = field622;
        }
        if (arg0 + arg2 > field617) {
            arg2 = field617 - arg0;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field623 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field624[var9] >> 16 & 0xFF) * var5;
            int var12 = (field624[var9] >> 8 & 0xFF) * var5;
            int var13 = (field624[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field624[var9++] = var14;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "()V", line = 581)
    public static final void method330() {
        field619 = null;
        field618 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([I)V", line = 585)
    public static final void method331(int[] arg0) {
        field622 = arg0[0];
        field616 = arg0[1];
        field617 = arg0[2];
        field621 = arg0[3];
        method330();
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(IIIIII)V", line = 596)
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class345.method2429();
        int var18 = arg1 - class345.method2427();
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class345.method2431(var19, var20, var21);
        class345.method2434(var23, var24, var25, var19, var20, var21, arg4);
        class345.method2431(var19, var21, var22);
        class345.method2434(var23, var25, var26, var19, var21, var22, arg4);
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(IIIII)V", line = 655)
    private static final void method333(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 < field622 || arg0 >= field617) {
            return;
        }
        if (arg1 < field616) {
            arg2 -= field616 - arg1;
            arg1 = field616;
        }
        if (arg1 + arg2 > field621) {
            arg2 = field621 - arg1;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = field623 * arg1 + arg0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int var11 = (field624[var9] >> 16 & 0xFF) * var5;
            int var12 = (field624[var9] >> 8 & 0xFF) * var5;
            int var13 = (field624[var9] & 0xFF) * var5;
            int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
            field624[var9] = var14;
            var9 += field623;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V", line = 697)
    private static final void method334(int arg0, int arg1, int arg2) {
        if (arg0 >= field622 && arg1 >= field616 && arg0 < field617 && arg1 < field621) {
            field624[field623 * arg1 + arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "([I)V", line = 710)
    public static final void method335(int[] arg0) {
        arg0[0] = field622;
        arg0[1] = field616;
        arg0[2] = field617;
        arg0[3] = field621;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(IIIII)V", line = 717)
    public static final void method336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return;
        }
        if (arg4 == 256) {
            method322(arg0, arg1, arg2, arg3);
            return;
        }
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var5 = 256 - arg4;
        int var6 = (arg3 >> 16 & 0xFF) * arg4;
        int var7 = (arg3 >> 8 & 0xFF) * arg4;
        int var8 = (arg3 & 0xFF) * arg4;
        int var9 = arg1 - arg2;
        if (var9 < field616) {
            var9 = field616;
        }
        int var10 = arg1 + arg2 + 1;
        if (var10 > field621) {
            var10 = field621;
        }
        int var11 = var9;
        int var12 = arg2 * arg2;
        int var13 = 0;
        int var14 = arg1 - var9;
        int var15 = var14 * var14;
        int var16 = var15 - var14;
        if (arg1 > var10) {
            arg1 = var10;
        }
        while (var11 < arg1) {
            while (var16 <= var12 || var15 <= var12) {
                var15 += var13 + var13;
                var16 += var13++ + var13;
            }
            int var17 = arg0 + 1 - var13;
            if (var17 < field622) {
                var17 = field622;
            }
            int var18 = arg0 + var13;
            if (var18 > field617) {
                var18 = field617;
            }
            int var19 = field623 * var11 + var17;
            for (int var20 = var17; var20 < var18; var20++) {
                int var21 = (field624[var19] >> 16 & 0xFF) * var5;
                int var22 = (field624[var19] >> 8 & 0xFF) * var5;
                int var23 = (field624[var19] & 0xFF) * var5;
                int var24 = (var8 + var23 >> 8) + (var6 + var21 >> 8 << 16) + (var7 + var22 >> 8 << 8);
                field624[var19++] = var24;
            }
            var11++;
            var15 -= var14-- + var14;
            var16 -= var14 + var14;
        }
        int var25 = arg2;
        int var26 = -var14;
        int var27 = var26 * var26 + var12;
        int var28 = var27 - arg2;
        int var29 = var27 - var26;
        while (var11 < var10) {
            while (var29 > var12 && var28 > var12) {
                var29 -= var25-- + var25;
                var28 -= var25 + var25;
            }
            int var30 = arg0 - var25;
            if (var30 < field622) {
                var30 = field622;
            }
            int var31 = arg0 + var25;
            if (var31 > field617 - 1) {
                var31 = field617 - 1;
            }
            int var32 = field623 * var11 + var30;
            for (int var33 = var30; var33 <= var31; var33++) {
                int var34 = (field624[var32] >> 16 & 0xFF) * var5;
                int var35 = (field624[var32] >> 8 & 0xFF) * var5;
                int var36 = (field624[var32] & 0xFF) * var5;
                int var37 = (var8 + var36 >> 8) + (var6 + var34 >> 8 << 16) + (var7 + var35 >> 8 << 8);
                field624[var32++] = var37;
            }
            var11++;
            var29 += var26 + var26;
            var28 += var26++ + var26;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIII[I[I)V", line = 861)
    public static final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        if (field621 - field616 != arg6.length) {
            throw new IllegalStateException();
        }
        int var8 = arg2 - arg0;
        int var9 = arg3 - arg1;
        if (var9 == 0) {
            if (var8 >= 0) {
                method321(arg0, arg1, var8, arg4, arg5, arg6, arg7);
            } else {
                method321(arg0 + var8 + 1, arg1, -var8, arg4, arg5, arg6, arg7);
            }
        } else if (var8 != 0) {
            boolean var10 = false;
            if (var8 + var9 < 0) {
                arg0 += var8;
                var8 = -var8;
                arg1 += var9;
                var9 = -var9;
                var10 = true;
            }
            int var11 = 256 - arg5;
            int var12 = (arg4 >> 16 & 0xFF) * arg5;
            int var13 = (arg4 >> 8 & 0xFF) * arg5;
            int var14 = (arg4 & 0xFF) * arg5;
            if (var8 > var9) {
                int var15 = arg1 << 16;
                int var16 = var15 + 32768;
                int var17 = var9 << 16;
                int var18 = (int) Math.floor((double) var17 / (double) var8 + 0.5D);
                int var19 = arg0 + var8;
                if (var10) {
                    var16 += var18;
                    arg0++;
                }
                if (arg0 < field622) {
                    var16 += (field622 - arg0) * var18;
                    arg0 = field622;
                }
                if (var19 >= field617) {
                    var19 = field617 - 1;
                }
                if (!var10) {
                    var19--;
                }
                while (arg0 <= var19) {
                    int var20 = var16 >> 16;
                    int var21 = var20 - field616;
                    if (var20 >= field616 && var20 < field621 && arg0 - field622 >= arg6[var21] && arg0 - field622 < arg6[var21] + arg7[var21]) {
                        int var22 = field623 * var20 + arg0;
                        int var23 = (field624[var22] >> 16 & 0xFF) * var11;
                        int var24 = (field624[var22] >> 8 & 0xFF) * var11;
                        int var25 = (field624[var22] & 0xFF) * var11;
                        int var26 = (var14 + var25 >> 8) + (var12 + var23 >> 8 << 16) + (var13 + var24 >> 8 << 8);
                        field624[var22] = var26;
                    }
                    var16 += var18;
                    arg0++;
                }
            } else {
                int var27 = arg0 << 16;
                int var28 = var27 + 32768;
                int var29 = var8 << 16;
                int var30 = (int) Math.floor((double) var29 / (double) var9 + 0.5D);
                int var31 = arg1 + var9;
                if (var10) {
                    var28 += var30;
                    arg1++;
                }
                if (arg1 < field616) {
                    var28 += (field616 - arg1) * var30;
                    arg1 = field616;
                }
                if (var31 >= field621) {
                    var31 = field621 - 1;
                }
                if (!var10) {
                    var31--;
                }
                while (arg1 <= var31) {
                    int var32 = var28 >> 16;
                    int var33 = arg1 - field616;
                    if (var32 >= field622 && var32 < field617 && var32 - field622 >= arg6[var33] && var32 - field622 < arg6[var33] + arg7[var33]) {
                        int var34 = field623 * arg1 + var32;
                        int var35 = (field624[var34] >> 16 & 0xFF) * var11;
                        int var36 = (field624[var34] >> 8 & 0xFF) * var11;
                        int var37 = (field624[var34] & 0xFF) * var11;
                        int var38 = (var14 + var37 >> 8) + (var12 + var35 >> 8 << 16) + (var13 + var36 >> 8 << 8);
                        field624[var34] = var38;
                    }
                    var28 += var30;
                    arg1++;
                }
            }
        } else if (var9 >= 0) {
            method327(arg0, arg1, var9, arg4, arg5, arg6, arg7);
        } else {
            method327(arg0, arg1 + var9 + 1, -var9, arg4, arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "()V", line = 1013)
    public static final void method338() {
        int var0 = 0;
        int var1 = field623 * field620 - 7;
        while (var0 < var1) {
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
            field624[var0++] = 0;
        }
        var1 += 7;
        while (var0 < var1) {
            field624[var0++] = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(IIII)V", line = 1034)
    public static final void method339(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < field616 || arg1 >= field621) {
            return;
        }
        if (arg0 < field622) {
            arg2 -= field622 - arg0;
            arg0 = field622;
        }
        if (arg0 + arg2 > field617) {
            arg2 = field617 - arg0;
        }
        int var4 = field623 * arg1 + arg0;
        for (int var5 = 0; var5 < arg2; var5++) {
            field624[var4 + var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(IIIIII)V", line = 1060)
    public static final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        if (var7 == 0) {
            if (var6 >= 0) {
                method329(arg0, arg1, var6, arg4, arg5);
            } else {
                method329(arg0 + var6 + 1, arg1, -var6, arg4, arg5);
            }
        } else if (var6 != 0) {
            boolean var8 = false;
            if (var6 + var7 < 0) {
                arg0 += var6;
                var6 = -var6;
                arg1 += var7;
                var7 = -var7;
                var8 = true;
            }
            int var9 = 256 - arg5;
            int var10 = (arg4 >> 16 & 0xFF) * arg5;
            int var11 = (arg4 >> 8 & 0xFF) * arg5;
            int var12 = (arg4 & 0xFF) * arg5;
            if (var6 > var7) {
                int var13 = arg1 << 16;
                int var14 = var13 + 32768;
                int var15 = var7 << 16;
                int var16 = (int) Math.floor((double) var15 / (double) var6 + 0.5D);
                int var17 = arg0 + var6;
                if (var8) {
                    var14 += var16;
                    arg0++;
                }
                if (arg0 < field622) {
                    var14 += (field622 - arg0) * var16;
                    arg0 = field622;
                }
                if (var17 >= field617) {
                    var17 = field617 - 1;
                }
                if (!var8) {
                    var17--;
                }
                while (arg0 <= var17) {
                    int var18 = var14 >> 16;
                    if (var18 >= field616 && var18 < field621) {
                        int var19 = field623 * var18 + arg0;
                        int var20 = (field624[var19] >> 16 & 0xFF) * var9;
                        int var21 = (field624[var19] >> 8 & 0xFF) * var9;
                        int var22 = (field624[var19] & 0xFF) * var9;
                        int var23 = (var12 + var22 >> 8) + (var10 + var20 >> 8 << 16) + (var11 + var21 >> 8 << 8);
                        field624[var19] = var23;
                    }
                    var14 += var16;
                    arg0++;
                }
            } else {
                int var24 = arg0 << 16;
                int var25 = var24 + 32768;
                int var26 = var6 << 16;
                int var27 = (int) Math.floor((double) var26 / (double) var7 + 0.5D);
                int var28 = arg1 + var7;
                if (var8) {
                    var25 += var27;
                    arg1++;
                }
                if (arg1 < field616) {
                    var25 += (field616 - arg1) * var27;
                    arg1 = field616;
                }
                if (var28 >= field621) {
                    var28 = field621 - 1;
                }
                if (!var8) {
                    var28--;
                }
                while (arg1 <= var28) {
                    int var29 = var25 >> 16;
                    if (var29 >= field622 && var29 < field617) {
                        int var30 = field623 * arg1 + var29;
                        int var31 = (field624[var30] >> 16 & 0xFF) * var9;
                        int var32 = (field624[var30] >> 8 & 0xFF) * var9;
                        int var33 = (field624[var30] & 0xFF) * var9;
                        int var34 = (var12 + var33 >> 8) + (var10 + var31 >> 8 << 16) + (var11 + var32 >> 8 << 8);
                        field624[var30] = var34;
                    }
                    var25 += var27;
                    arg1++;
                }
            }
        } else if (var7 >= 0) {
            method333(arg0, arg1, var7, arg4, arg5);
        } else {
            method333(arg0, arg1 + var7 + 1, -var7, arg4, arg5);
        }
    }
}
