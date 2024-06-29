import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class287 extends class71 {

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field5104 = 81;

    @OriginalMember(owner = "client!wg", name = "R", descriptor = "I")
    private int field5109 = 1024;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    private int field5108 = 204;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
    private int field5113 = 8;

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "I")
    private int field5118 = 0;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    private int field5111 = 1024;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    private int field5122 = 4;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "I")
    private int field5121 = 409;

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "[J")
    public static long[] field5123 = new long[200];

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "Lfl;")
    public static class222 field5106 = new class222(5000);

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "[Lud;")
    public static class279[] field5124 = new class279[1000];

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "Lud;")
    public static class279 field5125 = class130.method1024("blinken2:", 255);

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "Lud;")
    public static class279 field5130 = class130.method1024("clignotant1:", 255);

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "I")
    public static int field5131 = 0;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "I")
    private int field5102;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "I")
    private int field5114;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    private int field5116;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "Ljl;")
    public static class262 field5126;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "Llj;")
    public static class50 field5129;

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "Z")
    public static boolean field5132;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "[I")
    private int[] field5105;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "[Lom;")
    public static class70[] field5128;

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "[[I")
    private int[][] field5110;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "[[I")
    private int[][] field5115;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIIIIB)V", line = 6)
    public static final void method2049(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field5120++;
        int var8 = arg3;
        int var9 = arg5 - arg1;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg3 - arg1;
        int var13 = arg5 * arg5;
        int var14 = var9 * var9;
        int var15 = arg3 * arg3;
        int var16 = var12 * var12;
        int var17 = var15 << 1;
        int var18 = var14 << 1;
        int var19 = arg3 << 1;
        int var20 = var13 << 1;
        int var21 = var16 << 1;
        int var22 = var12 << 1;
        int var23 = var15 - (var19 - 1) * var20;
        int var24 = (1 - var19) * var13 + var17;
        int var25 = (1 - var22) * var14 + var21;
        int var26 = var13 << 2;
        int var27 = var16 - (var22 - 1) * var18;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        if (arg7 != -105) {
            field5106 = (class222) null;
        }
        int var30 = var17 * 3;
        int var31 = var16 << 2;
        int var32 = (var19 - 3) * var20;
        int var33 = var21 * 3;
        int var34 = var28;
        int var35 = (arg3 - 1) * var26;
        int var36 = (var12 - 1) * var29;
        if (arg0 >= class135.field2463 && class108.field2002 >= arg0) {
            int[] var37 = class182.field3348[arg0];
            int var38 = class125.method1001(arg6 - arg5, class44.field929, false, class249.field4449);
            int var39 = class125.method1001(arg5 + arg6, class44.field929, false, class249.field4449);
            int var40 = class125.method1001(arg6 - var9, class44.field929, false, class249.field4449);
            int var41 = class125.method1001(arg6 + var9, class44.field929, false, class249.field4449);
            class152.method1208(var38, arg2, var40, var37, -7);
            class152.method1208(var40, arg4, var41, var37, arg7 ^ 0x6E);
            class152.method1208(var41, arg2, var39, var37, -7);
        }
        int var42 = var31;
        int var43 = (var22 - 3) * var18;
        while (var8 > 0) {
            boolean var44 = var8 <= var12;
            if (var24 < 0) {
                while (var24 < 0) {
                    var11++;
                    var23 += var34;
                    var24 += var30;
                    var34 += var28;
                    var30 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var27 += var42;
                        var42 += var31;
                        var10++;
                        var33 += var31;
                    }
                }
                if (var27 < 0) {
                    var10++;
                    var25 += var33;
                    var27 += var42;
                    var42 += var31;
                    var33 += var31;
                }
                var27 += -var43;
                var25 += -var36;
                var43 -= var29;
                var36 -= var29;
            }
            if (var23 < 0) {
                var11++;
                var23 += var34;
                var34 += var28;
                var24 += var30;
                var30 += var28;
            }
            var23 += -var32;
            var8--;
            var32 -= var26;
            int var45 = arg0 - var8;
            var24 += -var35;
            int var46 = arg0 + var8;
            if (class135.field2463 <= var46 && var45 <= class108.field2002) {
                int var47 = class125.method1001(arg6 + var11, class44.field929, false, class249.field4449);
                int var48 = class125.method1001(arg6 - var11, class44.field929, false, class249.field4449);
                if (var44) {
                    int var49 = class125.method1001(arg6 + var10, class44.field929, false, class249.field4449);
                    int var50 = class125.method1001(arg6 - var10, class44.field929, false, class249.field4449);
                    if (class135.field2463 <= var45) {
                        int[] var51 = class182.field3348[var45];
                        class152.method1208(var48, arg2, var50, var51, arg7 + 98);
                        class152.method1208(var50, arg4, var49, var51, -7);
                        class152.method1208(var49, arg2, var47, var51, -7);
                    }
                    if (class108.field2002 >= var46) {
                        int[] var52 = class182.field3348[var46];
                        class152.method1208(var48, arg2, var50, var52, -7);
                        class152.method1208(var50, arg4, var49, var52, -7);
                        class152.method1208(var49, arg2, var47, var52, -7);
                    }
                } else {
                    if (var45 >= class135.field2463) {
                        class152.method1208(var48, arg2, var47, class182.field3348[var45], arg7 ^ 0x6E);
                    }
                    if (var46 <= class108.field2002) {
                        class152.method1208(var48, arg2, var47, class182.field3348[var46], arg7 + 98);
                    }
                }
            }
            var35 -= var26;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZLvh;)V", line = 214)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field5101++;
        if (arg0 == 0) {
            this.field5122 = arg2.method483(-109);
        } else if (arg0 == 1) {
            this.field5113 = arg2.method483(-108);
        } else if (arg0 == 2) {
            this.field5121 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field5108 = arg2.method468(28214);
        } else if (arg0 == 4) {
            this.field5111 = arg2.method468(28214);
        } else if (arg0 == 5) {
            this.field5118 = arg2.method468(28214);
        } else if (arg0 == 6) {
            this.field5104 = arg2.method468(28214);
        } else if (arg0 == 7) {
            this.field5109 = arg2.method468(28214);
        }
        if (!arg1) {
            this.method77(-115, true, (class53) null);
        }
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V", line = 305)
    public static void method2050(int arg0) {
        field5123 = null;
        field5125 = null;
        field5106 = null;
        field5126 = null;
        field5130 = null;
        field5128 = null;
        field5124 = null;
        if (arg0 > 49) {
            field5129 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 604)
    public class287() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 328)
    private final void method2051(byte arg0) {
        Random var2 = new Random((long) this.field5113);
        field5103++;
        this.field5105 = new int[this.field5113 + 1];
        this.field5110 = new int[this.field5113][this.field5122 + 1];
        this.field5102 = this.field5104 / 2;
        this.field5114 = 4096 / this.field5122;
        this.field5105[0] = 0;
        this.field5116 = 4096 / this.field5113;
        this.field5115 = new int[this.field5113][this.field5122];
        int var3 = this.field5116 / 2;
        if (arg0 > -29) {
            return;
        }
        int var4 = this.field5114 / 2;
        for (int var5 = 0; var5 < this.field5113; var5++) {
            if (var5 > 0) {
                int var6 = this.field5116;
                int var7 = (class133.method1041(var2, 4096, 10061) - 2048) * this.field5108 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field5105[var5] = this.field5105[var5 - 1] + var8;
            }
            this.field5110[var5][0] = 0;
            for (int var9 = 0; var9 < this.field5122; var9++) {
                if (var9 > 0) {
                    int var10 = this.field5114;
                    int var11 = (class133.method1041(var2, 4096, 10061) - 2048) * this.field5121 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field5110[var5][var9] = this.field5110[var5][var9 - 1] + var12;
                }
                this.field5115[var5][var9] = this.field5109 > 0 ? 4096 - class133.method1041(var2, this.field5109, 10061) : 4096;
            }
            this.field5110[var5][this.field5122] = 4096;
        }
        this.field5105[this.field5113] = 4096;
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V", line = 392)
    public static final void method2052(int arg0) {
        field5119++;
        class52.method435();
        class155.field2805 = null;
        class123.field2230 = -1;
        class152.method1203(false);
        class136.field2468.method1770(-30351);
        class92.field1725 = new class192();
        ((class237) class27.field656).method1709(true);
        class30.field706 = new class37[255];
        class30.field712 = 0;
        class299.method2109();
        class160.method1265();
        class212.method1555((byte) -56);
        class85.method733(false, -1);
        class155.method1221((byte) -121);
        for (int var1 = 0; var1 < 2048; var1++) {
            class239 var2 = class96.field1780[var1];
            if (var2 != null) {
                var2.field24 = null;
            }
        }
        if (class97.field1824) {
            class160.method1266(104, 104);
            class208.method1532();
        }
        class108.method892(class266.field4799, 0, class257.field4572);
        class102.method865((byte) -116, class266.field4799);
        class179.field3241 = null;
        if (arg0 < 11) {
            method2052(-41);
        }
        class306.field5436 = null;
        class51.field1051 = null;
        class52.field1087 = null;
        class306.field5434 = null;
        if (class53.field1111 == 5) {
            class104.method883((byte) -105, class266.field4799);
        }
        if (class53.field1111 == 10) {
            class133.method1043(false, false);
        }
        if (class53.field1111 == 30) {
            class172.method1343(25, -29401);
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V", line = 464)
    public final void method627(int arg0) {
        field5107++;
        if (arg0 != 7) {
            field5123 = (long[]) null;
        }
        this.method2051((byte) -61);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIZ)I", line = 479)
    public static final int method2053(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            method2049(-90, 63, -126, -11, 46, -51, 99, (byte) -59);
        }
        field5112++;
        int var5 = 65536 - class27.field642[arg0 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(IB)[I", line = 493)
    public final int[] method199(int arg0, byte arg1) {
        field5117++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int var4 = 0;
            int var5;
            for (var5 = class200.field3574[arg0] + this.field5118; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field5113 && var5 >= this.field5105[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field5105[var4];
            int var9 = this.field5105[var4 - 1];
            if ((this.field5102 + var9) < var5 && var5 < (var8 - this.field5102)) {
                for (int var10 = 0; var10 < class215.field3787; var10++) {
                    int var11 = var7 ? this.field5111 : -this.field5111;
                    int var12;
                    for (var12 = (this.field5114 * var11 >> 12) + class133.field2424[var10]; var12 < 0; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; this.field5122 > var13 && var12 >= this.field5110[var6][var13]; var13++) {
                    }
                    int var14 = var13 - 1;
                    int var15 = this.field5110[var6][var14];
                    int var16 = this.field5110[var6][var13];
                    if (var12 > var15 + this.field5102 && var16 - this.field5102 > var12) {
                        var3[var10] = this.field5115[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class25.method221(var3, 0, class215.field3787, 0);
            }
        }
        if (arg1 >= -69) {
            field5124 = (class279[]) null;
        }
        return var3;
    }
}
