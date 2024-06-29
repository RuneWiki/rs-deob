import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "[I")
    public static int[] field1022 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Lp;")
    public static class280 field1024 = class18.method140((byte) -128, "p12_full");

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Lp;")
    public static class280 field1023 = class18.method140((byte) -117, "<col=ffb000>");

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lkh;")
    public class45 field1003;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "[B")
    public static byte[] field1017;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public int[] field1005;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
    public int[] field1009;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "[I")
    public int[] field1010;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "[I")
    public int[] field1013;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
    public int[] field1014;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
    public int[] field1018;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lkh;")
    public class45[] field1007;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[Lti;")
    public static class5[] field1004;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "[[I")
    public int[][] field1000;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[[I")
    public int[][] field1016;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BZ)V")
    private final void method437(byte[] arg0, boolean arg1) {
        field1008++;
        class25 var3 = new class25(class132.method914(arg0, -2081));
        int var4 = var3.method189((byte) -103);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field1011 = 0;
        } else {
            this.field1011 = var3.method199((byte) -85);
        }
        int var5 = 0;
        int var6 = var3.method189((byte) -103);
        this.field1021 = var3.method193((byte) 77);
        int var7 = -1;
        this.field1005 = new int[this.field1021];
        for (int var8 = 0; var8 < this.field1021; var8++) {
            this.field1005[var8] = var5 += var3.method193((byte) 77);
            if (var7 < this.field1005[var8]) {
                var7 = this.field1005[var8];
            }
        }
        if (arg1) {
            method438((byte) -75);
        }
        this.field1020 = var7 + 1;
        this.field1014 = new int[this.field1020];
        this.field1018 = new int[this.field1020];
        this.field1010 = new int[this.field1020];
        this.field1000 = new int[this.field1020][];
        this.field1013 = new int[this.field1020];
        if (var6 != 0) {
            this.field1009 = new int[this.field1020];
            for (int var9 = 0; var9 < this.field1020; var9++) {
                this.field1009[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field1021; var10++) {
                this.field1009[this.field1005[var10]] = var3.method199((byte) -85);
            }
            this.field1003 = new class45(this.field1009);
        }
        for (int var11 = 0; var11 < this.field1021; var11++) {
            this.field1013[this.field1005[var11]] = var3.method199((byte) -85);
        }
        for (int var12 = 0; var12 < this.field1021; var12++) {
            this.field1018[this.field1005[var12]] = var3.method199((byte) -85);
        }
        for (int var13 = 0; var13 < this.field1021; var13++) {
            this.field1010[this.field1005[var13]] = var3.method193((byte) 77);
        }
        for (int var14 = 0; var14 < this.field1021; var14++) {
            int var21 = 0;
            int var22 = this.field1005[var14];
            int var23 = this.field1010[var22];
            this.field1000[var22] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field1000[var22][var25] = var21 += var3.method193((byte) 77);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field1014[var22] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field1000[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field1016 = new int[var7 + 1][];
        this.field1007 = new class45[var7 + 1];
        for (int var15 = 0; var15 < this.field1021; var15++) {
            int var16 = this.field1005[var15];
            int var17 = this.field1010[var16];
            this.field1016[var16] = new int[this.field1014[var16]];
            for (int var18 = 0; var18 < this.field1014[var16]; var18++) {
                this.field1016[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field1000[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field1000[var16][var19];
                }
                this.field1016[var16][var20] = var3.method199((byte) -85);
            }
            this.field1007[var16] = new class45(this.field1016[var16]);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final void method438(byte arg0) {
        if (arg0 != 70) {
            field1024 = null;
        }
        field1019++;
        class204.field3546.method1481(false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method439(int arg0) {
        field1023 = null;
        if (arg0 == 64) {
            field1004 = null;
            field1017 = null;
            field1024 = null;
            field1022 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lua;II)Lp;")
    public static final class280 method440(class113 arg0, int arg1, int arg2) {
        if (arg2 < 52) {
            return null;
        }
        field999++;
        if (!class254.method1710(client.method1099(arg0), (byte) 100, arg1) && arg0.field1861 == null) {
            return null;
        } else if (arg0.field1945 == null || arg0.field1945.length <= arg1 || arg0.field1945[arg1] == null || arg0.field1945[arg1].method1877(255).method1889(-1) == 0) {
            return class250.field4377 ? class30.method266(new class280[] { class237.field4116, class249.method1685((byte) -80, arg1) }, (byte) -87) : null;
        } else {
            return arg0.field1945[arg1];
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "([BI)V")
    public class62(byte[] arg0, int arg1) {
        this.field1002 = class173.method1196(0, arg0.length, arg0);
        if (this.field1002 != arg1) {
            throw new RuntimeException();
        }
        this.method437(arg0, false);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II[BI[Lpk;IZI)V")
    public static final void method441(int arg0, int arg1, byte[] arg2, int arg3, class99[] arg4, int arg5, boolean arg6, int arg7) {
        if (arg7 != -19739) {
            field1017 = null;
        }
        field1001++;
        if (!arg6) {
            for (int var8 = 0; var8 < 4; var8++) {
                for (int var9 = 0; var9 < 64; var9++) {
                    for (int var10 = 0; var10 < 64; var10++) {
                        if (arg5 + var9 > 0 && (arg5 + var9) < 103 && arg0 + var10 > 0 && (arg0 + var10) < 103) {
                            arg4[var8].field1604[arg5 + var9][arg0 + var10] = class214.method1432(arg4[var8].field1604[arg5 + var9][arg0 + var10], -16777217);
                        }
                    }
                }
            }
        }
        byte var11;
        if (arg6) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        class25 var12 = new class25(arg2);
        for (int var13 = 0; var13 < var11; var13++) {
            for (int var36 = 0; var36 < 64; var36++) {
                for (int var37 = 0; var37 < 64; var37++) {
                    class283.method1919(arg0 + var37, arg6, arg3, var12, 0, arg1, var13, arg5 + var36, arg7 + 19739);
                }
            }
        }
        boolean var14 = false;
        while (var12.field481 < var12.field475.length) {
            int var15 = var12.method189((byte) -103);
            if (var15 != 129) {
                var12.field481--;
                break;
            }
            for (int var16 = 0; var16 < 4; var16++) {
                byte var17 = var12.method200(32768);
                if (var17 == 0) {
                    int var27 = arg5 + 64;
                    if (var27 < 0) {
                        var27 = 0;
                    } else if (var27 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg5;
                    if (arg5 < 0) {
                        var28 = 0;
                    } else if (arg5 >= 104) {
                        var28 = 104;
                    }
                    int var29 = arg0;
                    if (arg0 < 0) {
                        var29 = 0;
                    } else if (arg0 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg0 + 64;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    while (var28 < var27) {
                        while (var29 < var30) {
                            class249.field4353[var16][var28][var29] = 0;
                            var29++;
                        }
                        var28++;
                    }
                } else if (var17 == 1) {
                    for (int var22 = 0; var22 < 64; var22 += 4) {
                        for (int var23 = 0; var23 < 64; var23 += 4) {
                            byte var24 = var12.method200(32768);
                            for (int var25 = var22 + arg5; var25 < (arg5 + var22 + 4); var25++) {
                                for (int var26 = arg0 + var23; var26 < arg0 + var23 + 4; var26++) {
                                    if (var25 >= 0 && var25 < 104 && var26 >= 0 && var26 < 104) {
                                        class249.field4353[var16][var25][var26] = var24;
                                    }
                                }
                            }
                        }
                    }
                } else if (var17 == 2 && var16 > 0) {
                    int var18 = arg5;
                    int var19 = arg5 + 64;
                    if (arg5 < 0) {
                        var18 = 0;
                    } else if (arg5 >= 104) {
                        var18 = 104;
                    }
                    int var20 = arg0;
                    if (arg0 < 0) {
                        var20 = 0;
                    } else if (arg0 >= 104) {
                        var20 = 104;
                    }
                    int var21 = arg0 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    if (var19 < 0) {
                        var19 = 0;
                    } else if (var19 >= 104) {
                        var19 = 104;
                    }
                    while (var19 > var18) {
                        while (var21 > var20) {
                            class249.field4353[var16][var18][var20] = class249.field4353[var16 - 1][var18][var20];
                            var20++;
                        }
                        var18++;
                    }
                }
            }
            var14 = true;
        }
        if (var14) {
            return;
        }
        for (int var31 = 0; var31 < 4; var31++) {
            for (int var32 = 0; var32 < 16; var32++) {
                for (int var33 = 0; var33 < 16; var33++) {
                    int var34 = (arg0 >> 2) + var33;
                    int var35 = (arg5 >> 2) + var32;
                    if (var35 >= 0 && var35 < 26 && var34 >= 0 && var34 < 26) {
                        class249.field4353[var31][var35][var34] = 0;
                    }
                }
            }
        }
    }
}
