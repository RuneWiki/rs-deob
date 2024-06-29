import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class404 {

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Z")
    private boolean field5391 = true;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    private int field5393 = -1;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    private int field5382;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    private int field5389;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    private int field5385;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "[Loc;")
    private class187[] field5383;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    private int field5381;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "[Loc;")
    private class187[] field5400;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Loc;")
    private class187 field5392;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "J")
    public static long field5390 = 0L;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public static int field5398 = 1339;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field5378 = 0;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lkfa;")
    public static class549 field5380 = new class549(31, -1);

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "F")
    public static float field5401;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    private int field5379;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    private int field5394;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Lta;")
    public static class195 field5386;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "Lxa;")
    private class458 field5399;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILoa;)Z", line = 3)
    public final boolean method2195(int arg0, int arg1, class635 arg2) {
        if (this.field5393 != arg0) {
            this.field5393 = arg0;
            int var4 = class687.method3819(arg0, (byte) -59);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field5379 != var4) {
                this.field5379 = var4;
                this.field5399 = null;
            }
            if (this.field5383 != null) {
                this.field5394 = 0;
                int[] var5 = new int[this.field5383.length];
                for (int var6 = 0; var6 < this.field5383.length; var6++) {
                    class187 var7 = this.field5383[var6];
                    if (var7.method1089(this.field5389, this.field5381, this.field5385, this.field5393)) {
                        var5[this.field5394] = var7.field2275;
                        this.field5400[this.field5394++] = var7;
                    }
                }
                class372.method2037(var5, this.field5400, true, this.field5394 - 1, 0);
            }
            this.field5391 = true;
        }
        if (arg1 != 512) {
            return false;
        }
        field5384++;
        boolean var8 = false;
        if (this.field5391) {
            this.field5391 = false;
            for (int var9 = this.field5394 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field5400[var9].method1095(arg2, this.field5392);
                this.field5391 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V", line = 87)
    public static void method2196(byte arg0) {
        if (arg0 == 48) {
            field5386 = null;
            field5380 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)V", line = 100)
    public final void method2197(byte arg0) {
        if (this.field5383 != null) {
            for (int var2 = 0; var2 < this.field5383.length; var2++) {
                this.field5383[var2].method1087();
            }
        }
        if (arg0 != 66) {
            this.method2198(-116, -79, 7, 85, 75, 11, 101, null, -38, 45);
        }
        field5387++;
        this.field5399 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIILoa;II)V", line = 125)
    public final void method2198(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class635 arg7, int arg8, int arg9) {
        int var11 = arg2 + arg9 & 0x3FFF;
        field5395++;
        if (this.field5382 == -1) {
            arg7.method286(arg1, arg0, arg5, arg8, arg6, 0);
        } else {
            class414 var12 = class525.field7510.method846((byte) -111, this.field5382);
            if (this.field5399 == null && class525.field7510.method843(this.field5382, 31340)) {
                int[] var13 = var12.field5496 ? class525.field7510.method845(this.field5382, 0.7F, this.field5379, true, this.field5379, false) : class525.field7510.method854(0.7F, -4476, false, this.field5379, this.field5382, this.field5379);
                this.field5399 = arg7.method326(var13, 0, this.field5379, this.field5379, this.field5379);
            }
            if (var12.field5496) {
                arg7.method286(arg1, arg0, arg5, arg8, arg6, 0);
            }
            if (this.field5399 != null) {
                int var14 = var12.field5496 ? 1 : 0;
                int var15 = arg3 * arg8 / -4096;
                int var16;
                for (var16 = arg8 * var11 / 4096 + (arg5 - arg8) / 2; var16 > arg8; var16 -= arg8) {
                }
                while (arg8 < var15) {
                    var15 -= arg8;
                }
                while (var16 < 0) {
                    var16 += arg8;
                }
                while (var15 < 0) {
                    var15 += arg8;
                }
                for (int var17 = var16 - arg8; var17 < arg5; var17 += arg8) {
                    for (int var18 = var15 - arg8; var18 < arg8; var18 += arg8) {
                        this.field5399.method413(arg1 + var17, var18 - -arg0, arg8, arg8, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field5394 - 1;
        int var20 = -106 / ((-arg4 - 71) / 37);
        while (var19 >= 0) {
            this.field5400[var19].method1093(arg7, arg1, arg0, arg5, arg8, arg3, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZIIIZ)V", line = 203)
    public static final void method2199(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field5397++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg4);
        class472 var8 = (class472) class153.field1732.method3234((byte) -63, var6);
        if (var8 == null) {
            var8 = new class472();
            class153.field1732.method3235(var6, -1, var8);
        }
        if (arg2 >= var8.field6581.length) {
            int[] var9 = new int[arg2 + 1];
            int[] var10 = new int[arg2 + 1];
            for (int var11 = 0; var11 < var8.field6581.length; var11++) {
                var9[var11] = var8.field6581[var11];
                var10[var11] = var8.field6587[var11];
            }
            for (int var12 = var8.field6581.length; var12 < arg2; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6581 = var9;
            var8.field6587 = var10;
        }
        if (!arg1) {
            var8.field6581[arg2] = arg0;
            var8.field6587[arg2] = arg3;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljo;B)V", line = 259)
    public static final void method2200(class303 arg0, byte arg1) {
        field5388++;
        class579.field8245 = arg0.method1716(true, "hitmarks");
        class191.field2304 = arg0.method1716(true, "hitbar_default");
        class587.field8339 = arg0.method1716(true, "timerbar_default");
        class518.field7400 = arg0.method1716(true, "headicons_pk");
        class480.field7043 = arg0.method1716(true, "headicons_prayer");
        class683.field9692 = arg0.method1716(true, "hint_headicons");
        class117.field1350 = arg0.method1716(true, "hint_mapmarkers");
        class256.field3280 = arg0.method1716(true, "mapflag");
        class620.field8716 = arg0.method1716(true, "cross");
        class555.field7900 = arg0.method1716(true, "mapdots");
        class140.field1600 = arg0.method1716(true, "scrollbar");
        if (arg1 < 112) {
            return;
        }
        class687.field9712 = arg0.method1716(true, "name_icons");
        class608.field8594 = arg0.method1716(true, "floorshadows");
        class678.field9611 = arg0.method1716(true, "compass");
        class525.field7505 = arg0.method1716(true, "otherlevel");
        class552.field7870 = arg0.method1716(true, "hint_mapedge");
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 285)
    public static final String method2201(String arg0, String arg1, int arg2, String arg3) {
        field5396++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, arg0.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg1.length() + var4);
        }
        if (arg2 <= 0) {
            method2201(null, null, 6, null);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(I[Loc;IIII)V", line = 329)
    public class404(int arg0, class187[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5382 = arg0;
        this.field5389 = arg3;
        this.field5385 = arg5;
        this.field5383 = arg1;
        this.field5381 = arg4;
        if (arg1 == null) {
            this.field5400 = null;
            this.field5392 = null;
        } else {
            this.field5400 = new class187[arg1.length];
            this.field5392 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
