import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class558 {

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Ljda;")
    private class206 field8079;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "Lifa;")
    private class393 field8067;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public int field8078;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    private int field8075;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    private int field8077;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "[B")
    public byte[] field8084;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    private int field8072;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
    private int field8070;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field8071 = 1339;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    public static int field8080;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field8083;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "[Lau;")
    public static class684[] field8082;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "[[Lrt;")
    private class207[][] field8081;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
    public static final void method3259(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -66) {
            field8071 = -78;
        }
        for (class58 var5 = (class58) class148.field1822.method1132((byte) -103); var5 != null; var5 = (class58) class148.field1822.method1134(8446)) {
            class506.method3003(arg1, arg0, var5, arg2, arg3, false);
        }
        field8074++;
        for (class58 var6 = (class58) class188.field2301.method1132((byte) 85); var6 != null; var6 = (class58) class188.field2301.method1134(8446)) {
            byte var12 = 1;
            class573 var13 = var6.field916.method1280(-1);
            if (var6.field916.field2634 == -1 || var6.field916.field2594) {
                var12 = 0;
            } else if (var6.field916.field2634 == var13.field8386 || var6.field916.field2634 == var13.field8382 || var6.field916.field2634 == var13.field8398 || var6.field916.field2634 == var13.field8358) {
                var12 = 2;
            } else if (var6.field916.field2634 == var13.field8389 || var6.field916.field2634 == var13.field8391 || var6.field916.field2634 == var13.field8405 || var6.field916.field2634 == var13.field8377) {
                var12 = 3;
            }
            if (var6.field896 != var12) {
                int var14 = class520.method3085((byte) -104, var6.field916);
                class323 var15 = var6.field916.field8052;
                if (var15.field4315 != null) {
                    var15 = var15.method1881(class410.field5804, (byte) 110);
                }
                if (var15 == null || var14 == -1) {
                    var6.field924 = -1;
                    var6.field912 = false;
                    var6.field896 = var12;
                } else if (var6.field924 == var14 && var15.field4277 == var6.field912) {
                    var6.field900 = var15.field4270;
                    var6.field896 = var12;
                } else {
                    boolean var16 = false;
                    if (var6.field906 == null) {
                        var16 = true;
                    } else {
                        var6.field900 -= 512;
                        if (var6.field900 <= 0) {
                            class399.field5624.method1805(var6.field906);
                            var16 = true;
                            var6.field906 = null;
                        }
                    }
                    if (var16) {
                        var6.field900 = var15.field4270;
                        var6.field918 = null;
                        var6.field896 = var12;
                        var6.field902 = null;
                        var6.field924 = var14;
                        var6.field912 = var15.field4277;
                    }
                }
            }
            var6.field920 = var6.field916.field530;
            var6.field897 = var6.field916.field530 + (var6.field916.method1284((byte) -124) << 8);
            var6.field923 = var6.field916.field531;
            var6.field905 = var6.field916.field531 + (var6.field916.method1284((byte) -124) << 8);
            class506.method3003(arg1, arg0, var6, arg2, arg3, false);
        }
        for (class58 var7 = (class58) class362.field4820.method3669((byte) 28); var7 != null; var7 = (class58) class362.field4820.method3676((byte) -12)) {
            byte var8 = 1;
            class573 var9 = var7.field921.method1280(-1);
            if (var7.field921.field2634 == -1 || var7.field921.field2594) {
                var8 = 0;
            } else if (var7.field921.field2634 == var9.field8386 || var7.field921.field2634 == var9.field8382 || var7.field921.field2634 == var9.field8398 || var7.field921.field2634 == var9.field8358) {
                var8 = 2;
            } else if (var7.field921.field2634 == var9.field8389 || var7.field921.field2634 == var9.field8391 || var7.field921.field2634 == var9.field8405 || var7.field921.field2634 == var9.field8377) {
                var8 = 3;
            }
            if (var7.field896 != var8) {
                int var10 = class608.method3488(70, var7.field921);
                if (var7.field924 == var10 && var7.field912 == var7.field921.field8797) {
                    var7.field896 = var8;
                    var7.field900 = var7.field921.field8825;
                } else {
                    boolean var11 = false;
                    if (var7.field906 == null) {
                        var11 = true;
                    } else {
                        var7.field900 -= 512;
                        if (var7.field900 <= 0) {
                            class399.field5624.method1805(var7.field906);
                            var11 = true;
                            var7.field906 = null;
                        }
                    }
                    if (var11) {
                        var7.field912 = var7.field921.field8797;
                        var7.field924 = var10;
                        var7.field902 = null;
                        var7.field900 = var7.field921.field8825;
                        var7.field918 = null;
                        var7.field896 = var8;
                    }
                }
            }
            var7.field920 = var7.field921.field530;
            var7.field897 = var7.field921.field530 + (var7.field921.method1284((byte) -124) << 8);
            var7.field923 = var7.field921.field531;
            var7.field905 = var7.field921.field531 + (var7.field921.method1284((byte) -124) << 8);
            class506.method3003(arg1, arg0, var7, arg2, arg3, false);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method3260(int arg0) {
        field8080++;
        this.field8081 = new class207[this.field8072][this.field8070];
        if (arg0 != 1) {
            this.method3265(-70, null, -81, 5);
        }
        for (int var2 = 0; var2 < this.field8070; var2++) {
            for (int var3 = 0; var3 < this.field8072; var3++) {
                this.field8081[var3][var2] = new class207(this.field8067, this, this.field8079, var3, var2, this.field8077, var3 * 128 + 1, var2 * 128 - -1);
                if (this.field8081[var3][var2].field2519 == 0) {
                    this.field8081[var3][var2] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lub;[Lul;)V")
    public static final void method3261(class20 arg0, class530[] arg1) {
        if (class532.field7782) {
            int var2 = arg0.method340(arg1, -1);
            class298.field4017.method284(var2, arg1);
        }
        if (class340.field4500 == class155.field1899) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class43) {
                var5 = ((class43) arg0).field769;
                var6 = ((class43) arg0).field768;
            } else {
                var5 = arg0.field530 >> class295.field3981;
                var6 = arg0.field531 >> class295.field3981;
            }
            class298.field4017.method261(class399.field5631[0].method428(true, arg0.field530, arg0.field531), class438.method2617(var5, var6), class311.method1829(var5, var6), class45.method534(var5, var6));
        }
        class626 var7 = arg0.method170(class298.field4017, (byte) -2);
        if (var7 == null) {
            return;
        }
        var7.field8984 = arg0;
        if (class72.field1090) {
            class363 var8 = class196.field2369;
            synchronized (class196.field2369) {
                boolean var9 = false;
                for (class626 var10 = (class626) class196.field2369.method2070((byte) -119); var10 != null; var10 = (class626) class196.field2369.method2068(-2001)) {
                    if (arg0.field536 >= var10.field8984.field536) {
                        class97.method738(var10, var7, 125);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class196.field2369.method2071((byte) 93, var7);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class626 var12 = (class626) class196.field2369.method2070((byte) 85); var12 != null; var12 = (class626) class196.field2369.method2068(-2001)) {
            if (arg0.field536 >= var12.field8984.field536) {
                class97.method738(var12, var7, -117);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class196.field2369.method2071((byte) 80, var7);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II[[ZIZI)V")
    public final void method3262(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5) {
        this.field8067.method2304((byte) -30, false);
        field8068++;
        this.field8067.method2306(4345, false);
        this.field8067.method2353(1, (byte) -128);
        int var7 = -98 % ((-arg5 - 26) / 48);
        this.field8067.method2362(1, false);
        this.field8067.method2322(-110, -2, false, false);
        float var8 = 1.0F / (float) (this.field8067.field5505 * 128);
        if (arg4) {
            for (int var27 = 0; var27 < this.field8070; var27++) {
                int var28 = var27 << this.field8077;
                int var29 = var27 + 1 << this.field8077;
                label91: for (int var30 = 0; var30 < this.field8072; var30++) {
                    if (this.field8081[var30][var27] != null) {
                        int var31 = var30 << this.field8077;
                        int var32 = var30 + 1 << this.field8077;
                        for (int var33 = var31; var33 < var32; var33++) {
                            if ((-arg3) <= (var33 - arg0) && arg3 >= (var33 - arg0)) {
                                for (int var34 = var28; var34 < var29; var34++) {
                                    if (var34 - arg1 >= -arg3 && var34 - arg1 <= arg3 && arg2[arg3 + var33 - arg0][arg3 + var34 - arg1]) {
                                        class653 var35 = this.field8067.method2373((byte) -88);
                                        var35.method3683((byte) -70, var8, 1.0F, var8);
                                        var35.method723(-var30, -var27, 0);
                                        this.field8067.method2319((byte) 112, class148.field1809);
                                        this.field8081[var30][var27].method1247((byte) -123);
                                        continue label91;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field8070; var9++) {
                int var10 = var9 << this.field8077;
                int var11 = var9 + 1 << this.field8077;
                for (int var12 = 0; var12 < this.field8072; var12++) {
                    class207 var13 = this.field8081[var12][var9];
                    if (var13 != null) {
                        class154 var14 = this.field8067.method2357(var13.field2519 * 3, 2);
                        Buffer var15 = var14.method14(true, (byte) -60);
                        if (var15 != null) {
                            Stream var16 = this.field8067.method2350(var15, true);
                            int var17 = 0;
                            int var18 = var12 << this.field8077;
                            int var19 = var12 + 1 << this.field8077;
                            for (int var20 = var10; var20 < var11; var20++) {
                                if (var20 - arg1 >= -arg3 && arg3 >= var20 - arg1) {
                                    int var22 = this.field8079.field702 * var20 + var18;
                                    for (int var23 = var18; var23 < var19; var23++) {
                                        if (-arg3 <= var23 - arg0 && arg3 >= var23 - arg0 && arg2[arg3 + var23 - arg0][arg3 + var20 - arg1]) {
                                            short[] var24 = this.field8079.field2494[var22];
                                            if (var24 != null) {
                                                if (Stream.method3579()) {
                                                    for (int var26 = 0; var26 < var24.length; var26++) {
                                                        var17++;
                                                        var16.method3581(var24[var26] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var25 = 0; var25 < var24.length; var25++) {
                                                        var16.method3586(var24[var25] & 0xFFFF);
                                                        var17++;
                                                    }
                                                }
                                            }
                                        }
                                        var22++;
                                    }
                                }
                            }
                            var16.method3578();
                            if (var14.method15(-1969) && var17 > 0) {
                                class653 var21 = this.field8067.method2373((byte) -111);
                                var21.method3683((byte) -110, var8, 1.0F, var8);
                                var21.method723(-var12, -var9, 0);
                                this.field8067.method2319((byte) 121, class148.field1809);
                                var13.method1243(var17 / 3, 122, var14);
                            }
                        }
                    }
                }
            }
        }
        this.field8067.method2305(20921);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lha;ZII)V")
    public final void method3263(class54 arg0, boolean arg1, int arg2, int arg3) {
        field8083++;
        class332 var5 = (class332) arg0;
        if (arg1) {
            field8082 = null;
        }
        int var6 = var5.field4414 + arg3 + 1;
        int var7 = var5.field4409 + arg2 + 1;
        int var8 = this.field8078 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field4421;
        int var11 = var5.field4411;
        int var12 = this.field8078 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var8 += this.field8078 * var13;
            var9 += var11 * var13;
            var10 -= var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field8075 <= var6 + var10) {
            int var15 = var10 + var6 + 1 - this.field8075;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var9 += var16;
            var8 += var16;
            var11 -= var16;
            var12 += var16;
            var14 += var16;
            var7 = 1;
        }
        if (this.field8078 <= (var7 + var11)) {
            int var17 = var7 + var11 + 1 - this.field8078;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class324.method1889(var9, var5.field4419, true, var10, var8, var12, var11, var14, this.field8084);
            this.method3266(var11, var7, var6, var10, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method3264(int arg0) {
        field8082 = null;
        if (arg0 != -1) {
            method3259(8, 74, -52, -113, 72);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILha;II)V")
    public final void method3265(int arg0, class54 arg1, int arg2, int arg3) {
        field8069++;
        class332 var5 = (class332) arg1;
        int var6 = var5.field4409 + arg2 + 1;
        int var7 = var5.field4414 + arg0 + 1;
        int var8 = var6 + (this.field8078 * var7);
        int var9 = 0;
        int var10 = var5.field4421;
        int var11 = var5.field4411;
        int var12 = this.field8078 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field8078 * var14;
        }
        if (this.field8075 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8075;
            var10 -= var15;
        }
        if (arg3 != -4276) {
            this.field8081 = null;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var6 = 1;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
        }
        if ((var6 + var11) >= this.field8078) {
            int var17 = var6 + var11 + 1 - this.field8078;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class265.method1607(var5.field4419, var8, arg3 ^ 0xFFFFEF28, this.field8084, var10, var11, var9, var12, var13);
            this.method3266(var11, var6, var7, var10, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIB)V")
    private final void method3266(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field8073++;
        if (this.field8081 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        if (arg4 != -115) {
            field8071 = 69;
        }
        int var7 = arg1 + arg0 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class207[] var11 = this.field8081[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field2523 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lifa;Ljda;)V")
    public class558(class393 arg0, class206 arg1) {
        this.field8079 = arg1;
        this.field8067 = arg0;
        this.field8078 = (this.field8079.field702 * this.field8079.field695 >> this.field8067.field5441) + 2;
        this.field8075 = (this.field8079.field706 * this.field8079.field695 >> this.field8067.field5441) + 2;
        this.field8077 = this.field8067.field5441 + 7 - this.field8079.field696;
        this.field8084 = new byte[this.field8078 * this.field8075];
        this.field8072 = this.field8079.field702 >> this.field8077;
        this.field8070 = this.field8079.field706 >> this.field8077;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method3267(int arg0, int arg1, class54 arg2, int arg3) {
        field8076++;
        class332 var5 = (class332) arg2;
        int var6 = var5.field4414 + arg1 + 1;
        int var7 = var5.field4409 + arg0 + arg3;
        int var8 = this.field8078 * var6 + var7;
        int var9 = var5.field4421;
        int var10 = var5.field4411;
        int var11 = this.field8078 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var9 -= var12;
            var8 += this.field8078 * var12;
            var6 = 1;
        }
        if (this.field8075 <= (var6 + var9)) {
            int var13 = var6 + var9 + 1 - this.field8075;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
            var11 += var14;
        }
        if (this.field8078 <= (var7 + var10)) {
            int var15 = var7 + var10 + 1 - this.field8078;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field8078 + var11;
            return class679.method3853(this.field8084, var10, var16, var17, (byte) 99, var8, var9);
        } else {
            return false;
        }
    }
}
