import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class261 extends class24 {

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "[S")
    public short[] field4417;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[B")
    public byte[] field4414;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "[B")
    public byte[] field4419;

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[B")
    public byte[] field4421;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[Llg;")
    public class11[] field4430;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "[Lwl;")
    public class293[] field4418;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[I")
    private int[] field4416;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "I")
    public int field4426;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "Luf;")
    public static class168 field4424 = class148.method1019(-1720, "mapdots");

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "[I")
    public static int[] field4423 = new int[2000];

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "Lej;")
    public static class204 field4427 = new class204(64);

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "[Lke;")
    public static class208[] field4434 = new class208[4];

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "I")
    public static int field4433 = -1;

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "[[S")
    public static short[][] field4435 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field4436 = -1;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "[I")
    public static int[] field4425;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lfj;Lfh;BI)V", line = 16)
    public static final void method1820(class283 arg0, class110 arg1, byte arg2, int arg3) {
        byte[] var4 = null;
        class76 var5 = class40.field500;
        synchronized (class40.field500) {
            if (arg2 >= -55) {
                method1824((byte) -75);
            }
            for (class138 var6 = (class138) class40.field500.method442(65293); var6 != null; var6 = (class138) class40.field500.method440(3)) {
                if ((long) arg3 == var6.field292 && var6.field2129 == arg1 && var6.field2126 == 0) {
                    var4 = var6.field2128;
                    break;
                }
            }
        }
        field4422++;
        if (var4 == null) {
            byte[] var8 = arg1.method817(arg3, false);
            arg0.method1952(-123, arg1, var8, true, arg3);
        } else {
            arg0.method1952(-123, arg1, var4, true, arg3);
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V", line = 64)
    public final void method1821(int arg0) {
        this.field4416 = null;
        if (arg0 != 15386) {
            method1824((byte) -111);
        }
        field4431++;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)Z", line = 78)
    public static final boolean method1822(int arg0, byte arg1) {
        field4415++;
        if (arg1 == 84) {
            return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Loe;B)V", line = 91)
    public static final void method1823(class54 arg0, byte arg1) {
        if (arg1 < 5) {
            method1822(-62, (byte) -80);
        }
        class113 var2 = (class113) class244.field4152.method493(arg0.field658.method1208((byte) 71), 82);
        field4428++;
        if (var2 == null) {
            return;
        }
        if (var2.field1770 != null) {
            client.field4933.method1533(var2.field1770);
            var2.field1770 = null;
        }
        var2.method124((byte) 27);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 122)
    public static void method1824(byte arg0) {
        field4427 = null;
        field4423 = null;
        field4425 = null;
        if (arg0 > -47) {
            method1822(14, (byte) -42);
        }
        field4424 = null;
        field4435 = (short[][]) null;
        field4434 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "([IILig;[B)Z", line = 138)
    public final boolean method1825(int[] arg0, int arg1, class139 arg2, byte[] arg3) {
        field4429++;
        boolean var5 = true;
        if (arg1 != -129) {
            field4424 = (class168) null;
        }
        int var6 = 0;
        class11 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4416[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method962(arg0, var9 >> 2, (byte) -46);
                        } else {
                            var7 = arg2.method960(var9 >> 2, arg1 + 130, arg0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4430[var8] = var7;
                        this.field4416[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 198)
    public static final void method1826(int arg0) {
        class119.field1856++;
        class249.field4262.method726(123, 2138389379);
        class249.field4262.method1095(class267.method1855(true), -70);
        class249.field4262.method1047(-103, class14.field142);
        class249.field4262.method1047(-4, class299.field5069);
        field4432++;
        if (arg0 != 200) {
            method1824((byte) 26);
        }
        class205.field3373 = 0L;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 225)
    public class261() {
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "([B)V", line = 227)
    public class261(byte[] arg0) {
        this.field4417 = new short[128];
        this.field4414 = new byte[128];
        this.field4419 = new byte[128];
        this.field4421 = new byte[128];
        this.field4430 = new class11[128];
        this.field4418 = new class293[128];
        this.field4416 = new int[128];
        class153 var2 = new class153(arg0);
        int var3;
        for (var3 = 0; var2.field2359[var2.field2367 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1078(-6338);
        }
        var2.field2367++;
        var3++;
        int var6 = 0;
        int var7 = var2.field2367;
        var2.field2367 += var3;
        while (var2.field2359[var2.field2367 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1078(-6338);
        }
        var6++;
        var2.field2367++;
        int var10 = 0;
        int var11 = var2.field2367;
        var2.field2367 += var6;
        while (var2.field2359[var2.field2367 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var2.method1078(-6338);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var2.field2367++;
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var2.method1042((byte) 119);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var10;
        }
        class293[] var19 = new class293[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class293 var21 = var19[var20] = new class293();
            int var22 = var2.method1042((byte) 116);
            if (var22 > 0) {
                var21.field4955 = new byte[var22 * 2];
            }
            int var23 = var2.method1042((byte) 112);
            if (var23 > 0) {
                var21.field4954 = new byte[var23 * 2 + 2];
                var21.field4954[1] = 64;
            }
        }
        int var24 = var2.method1042((byte) -73);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method1042((byte) 104);
        int var27;
        for (var27 = 0; var2.field2359[var2.field2367 + var27] != 0; var27++) {
        }
        byte[] var28 = new byte[var27];
        byte[] var29 = var26 > 0 ? new byte[var26 * 2] : null;
        for (int var30 = 0; var30 < var27; var30++) {
            var28[var30] = var2.method1078(-6338);
        }
        var27++;
        int var31 = 0;
        var2.field2367++;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method1042((byte) -72);
            this.field4417[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method1042((byte) -116);
            this.field4417[var34] = (short) (this.field4417[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var28.length) {
                    var35 = -1;
                } else {
                    var35 = var28[var36++];
                }
                var37 = var2.method1082(-72);
            }
            this.field4417[var38] = (short) (this.field4417[var38] + (class159.method1119(2, var37 - 1) << 14));
            this.field4416[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4416[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field2359[var7++] - 1;
                    if (var39 < var4.length) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field4421[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4416[var46] != 0) {
                if (var44 == 0) {
                    var45 = var2.field2359[var11++] + 16 << 2;
                    if (var8.length > var43) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field4414[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class293 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4416[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 >= var12.length) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                this.field4418[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var28.length <= var51) {
                    var52 = -1;
                } else {
                    var52 = var28[var51++];
                }
                if (this.field4416[var54] > 0) {
                    var53 = var2.method1042((byte) -18) + 1;
                }
            }
            this.field4419[var54] = (byte) var53;
            var52--;
        }
        this.field4426 = var2.method1042((byte) 119) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class293 var56 = var19[var55];
            if (var56.field4955 != null) {
                for (int var57 = 1; var57 < var56.field4955.length; var57 += 2) {
                    var56.field4955[var57] = var2.method1078(-6338);
                }
            }
            if (var56.field4954 != null) {
                for (int var58 = 3; var58 < (var56.field4954.length - 2); var58 += 2) {
                    var56.field4954[var58] = var2.method1078(-6338);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method1078(-6338);
            }
        }
        if (var29 != null) {
            for (int var60 = 1; var60 < var29.length; var60 += 2) {
                var29[var60] = var2.method1078(-6338);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class293 var62 = var19[var61];
            if (var62.field4954 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4954.length; var64 += 2) {
                    var63 = var63 + var2.method1042((byte) 106) + 1;
                    var62.field4954[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class293 var66 = var19[var65];
            if (var66.field4955 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4955.length; var68 += 2) {
                    var67 = var67 + var2.method1042((byte) -56) + 1;
                    var66.field4955[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method1042((byte) -69);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 -= -var2.method1042((byte) -51) - 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4419[var73] = (byte) (this.field4419[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class142.method977(var77, false, var75 - var71);
                    this.field4419[var78] = (byte) (this.field4419[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var72 = var76;
                var71 = var75;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field4419[var81] = (byte) (this.field4419[var81] * var72 + 32 >> 6);
            }
        }
        if (var29 != null) {
            int var82 = var2.method1042((byte) -100);
            var29[0] = (byte) var82;
            for (int var83 = 2; var83 < var29.length; var83 += 2) {
                var82 = var2.method1042((byte) 106) + var82 + 1;
                var29[var83] = (byte) var82;
            }
            int var84 = var29[1] << 1;
            byte var85 = var29[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field4414[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4414[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var29.length > var88) {
                byte var89 = var29[var88];
                int var90 = (var89 - var85) / 2 + (var89 - var85) * var84;
                int var91 = var29[var88 + 1] << 1;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class142.method977(var90, false, var89 - var85);
                    var90 += var91 - var84;
                    int var94 = (this.field4414[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4414[var92] = (byte) var94;
                }
                var88 += 2;
                var85 = var89;
                var84 = var91;
            }
            for (int var95 = var85; var95 < 128; var95++) {
                int var96 = (this.field4414[var95] & 0xFF) + var84;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field4414[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field4961 = var2.method1042((byte) 86);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class293 var100 = var19[var99];
            if (var100.field4955 != null) {
                var100.field4970 = var2.method1042((byte) 107);
            }
            if (var100.field4954 != null) {
                var100.field4953 = var2.method1042((byte) 101);
            }
            if (var100.field4961 > 0) {
                var100.field4971 = var2.method1042((byte) 86);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field4976 = var2.method1042((byte) -41);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class293 var103 = var19[var102];
            if (var103.field4976 > 0) {
                var103.field4975 = var2.method1042((byte) -89);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class293 var105 = var19[var104];
            if (var105.field4975 > 0) {
                var105.field4952 = var2.method1042((byte) -97);
            }
        }
    }
}
