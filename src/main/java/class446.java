import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class446 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "[[I")
    private int[][] field6243;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    private int field6245;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    private int field6244;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lka;")
    public static class408 field6251 = new class408(4);

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lmp;")
    public static class21 field6255;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "[[B")
    public static byte[][] field6256;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method2753(boolean arg0) {
        field6255 = null;
        if (arg0) {
            method2753(true);
        }
        field6256 = null;
        field6251 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)I")
    public final int method2754(int arg0, byte arg1) {
        if (arg1 > -53) {
            method2753(false);
        }
        if (this.field6243 != null) {
            arg0 = ((int) ((long) this.field6245 * (long) arg0 / (long) this.field6244)) + 6;
        }
        field6249++;
        return arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
    public final int method2755(int arg0, int arg1) {
        if (arg0 != 0) {
            return -92;
        }
        if (this.field6243 != null) {
            arg1 = (int) ((long) this.field6245 * (long) arg1 / (long) this.field6244);
        }
        field6252++;
        return arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([BB)[B")
    public final byte[] method2756(byte[] arg0, byte arg1) {
        int var3 = 92 % ((arg1 + 23) / 59);
        if (this.field6243 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field6245 / (long) this.field6244) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                byte var11 = arg0[var8];
                int[] var12 = this.field6243[var7];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var6 + var13] += var12[var13] * var11;
                }
                int var14 = this.field6245 + var7;
                int var15 = var14 / this.field6244;
                var7 = var14 - this.field6244 * var15;
                var6 += var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 > 127) {
                    arg0[var9] = 127;
                } else {
                    arg0[var9] = (byte) var10;
                }
            }
        }
        field6250++;
        return arg0;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
    public static final void method2757(int arg0, int arg1) {
        class210 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class323 var4 = class82.field1130[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class354.field4768; var5++) {
                    for (int var6 = 0; var6 < class284.field3862; var6++) {
                        var2 = var4.method341(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class323 var10 = class82.field1130[var9];
                                if (var10 != null) {
                                    int var11 = var4.method329(var6, var5) - var10.method329(var6, var5);
                                    int var12 = var4.method329(var6 + 1, var5) - var10.method329(var6 + 1, var5);
                                    int var13 = var4.method329(var6 + 1, var5 + 1) - var10.method329(var6 + 1, var5 + 1);
                                    int var14 = var4.method329(var6, var5 + 1) - var10.method329(var6, var5 + 1);
                                    var10.method324(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(II)V")
    public class446(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class125.method955(0, arg1, arg0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field6243 = new int[var5][14];
            this.field6245 = var4;
            this.field6244 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field6243[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method2758(int arg0, Object arg1, boolean arg2) {
        field6242++;
        if (arg0 != -1) {
            method2758(-123, (Object) null, true);
        }
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class447.method2778(true, var3) : var3;
        } else if (arg1 instanceof class253) {
            class253 var4 = (class253) arg1;
            return var4.method1319(64);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[Lbm;ZIIIIILea;[B)[I")
    public static final int[] method2759(int arg0, class325[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class58 arg8, byte[] arg9) {
        if (!arg2) {
            for (int var10 = 0; var10 < 4; var10++) {
                class325 var11 = arg1[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg7 + var12;
                        int var15 = arg4 + var13;
                        if (var14 >= 0 && class11.field107 > var14 && var15 >= 0 && var15 < class264.field3620) {
                            var11.method1973(var14, var15, 0);
                        }
                    }
                }
            }
        }
        field6248++;
        class366 var16 = new class366(arg9);
        if (arg0 != 127) {
            field6251 = null;
        }
        int var17 = arg5 + arg7;
        int var18 = arg6 + arg4;
        for (int var19 = 0; var19 < arg3; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class255.method1654(var16, false, var18 + var56, arg2, 0, 121, var19, 0, arg4 + var56, var17 + var55, arg7 + var55, 0);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field5048 < var16.field5076.length) {
            int var22 = var16.method2306((byte) 58);
            if (var22 == 128) {
                class80.field1104[0] = var16.method2297(class267.method1701(arg0, 13399));
                class80.field1104[1] = var16.method2257((byte) 110);
                class80.field1104[2] = var16.method2257((byte) 110);
                class80.field1104[3] = var16.method2257((byte) 110);
                class80.field1104[4] = var16.method2297(13352);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field5048--;
                    break;
                }
                if (class91.field1276 == null) {
                    class91.field1276 = new byte[4][][];
                }
                var21 = true;
                for (int var23 = 0; var23 < 4; var23++) {
                    byte var24 = var16.method2289((byte) -77);
                    if (var24 == 0 && class91.field1276[var23] != null) {
                        int var25 = arg7;
                        int var26 = arg7 + 64;
                        int var27 = arg4;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (class11.field107 <= var26) {
                            var26 = class11.field107;
                        }
                        if (arg7 < 0) {
                            var25 = 0;
                        } else if (arg7 >= class11.field107) {
                            var25 = class11.field107;
                        }
                        if (arg4 < 0) {
                            var27 = 0;
                        } else if (arg4 >= class264.field3620) {
                            var27 = class264.field3620;
                        }
                        int var28 = arg4 + 64;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (class264.field3620 <= var28) {
                            var28 = class264.field3620;
                        }
                        while (var25 < var26) {
                            while (var27 < var28) {
                                class91.field1276[var23][var25][var27] = 0;
                                var27++;
                            }
                            var25++;
                        }
                    } else if (var24 == 1) {
                        if (class91.field1276[var23] == null) {
                            class91.field1276[var23] = new byte[class11.field107 + 1][class264.field3620 + 1];
                        }
                        for (int var33 = 0; var33 < 64; var33 += 4) {
                            for (int var34 = 0; var34 < 64; var34 += 4) {
                                byte var35 = var16.method2289((byte) -77);
                                for (int var36 = var33 + arg7; var36 < (arg7 + var33 + 4); var36++) {
                                    for (int var37 = arg4 + var34; var37 < var34 - (-arg4 - 4); var37++) {
                                        if (var36 >= 0 && class11.field107 > var36 && var37 >= 0 && var37 < class264.field3620) {
                                            class91.field1276[var23][var36][var37] = var35;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var24 == 2) {
                        if (class91.field1276[var23] == null) {
                            class91.field1276[var23] = new byte[class11.field107 + 1][class264.field3620 + 1];
                        }
                        if (var23 > 0) {
                            int var29 = arg7;
                            int var30 = arg7 + 64;
                            int var31 = arg4;
                            if (arg7 < 0) {
                                var29 = 0;
                            } else if (arg7 >= class11.field107) {
                                var29 = class11.field107;
                            }
                            if (var30 < 0) {
                                var30 = 0;
                            } else if (var30 >= class11.field107) {
                                var30 = class11.field107;
                            }
                            int var32 = arg4 + 64;
                            if (arg4 < 0) {
                                var31 = 0;
                            } else if (class264.field3620 <= arg4) {
                                var31 = class264.field3620;
                            }
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (class264.field3620 <= var32) {
                                var32 = class264.field3620;
                            }
                            while (var29 < var30) {
                                while (var32 > var31) {
                                    class91.field1276[var23][var29][var31] = class91.field1276[var23 - 1][var29][var31];
                                    var31++;
                                }
                                var29++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg2) {
            class141 var38 = null;
            label287: while (true) {
                while (true) {
                    while (var16.field5048 < var16.field5076.length) {
                        int var43 = var16.method2306((byte) 27);
                        if (var43 == 0) {
                            var38 = new class141(var16);
                        } else if (var43 == 1) {
                            int var44 = var16.method2306((byte) 104);
                            if (var44 > 0) {
                                for (int var45 = 0; var45 < var44; var45++) {
                                    class271 var46 = new class271(var16);
                                    if (var46.field3704 == 31) {
                                        class244 var47 = class323.method1967((byte) 126, var16.method2297(13352));
                                        var46.method1724(var47.field3454, var47.field3445, var47.field3448, var47.field3452, arg0 ^ 0x4);
                                    }
                                    var46.field2204 += arg7 << 7;
                                    var46.field2212 += arg4 << 7;
                                    int var48 = var46.field2204 >> 7;
                                    int var49 = var46.field2212 >> 7;
                                    if (var48 >= 0 && var49 >= 0 && var48 < class11.field107 && class264.field3620 > var49) {
                                        var46.field2205 = class278.field3794[var46.field3708][var48][var49] - var46.field2205;
                                        if (arg8.method264() > 0) {
                                            class136.method1016(var46);
                                        }
                                    }
                                }
                            }
                        } else if (var43 == 2) {
                            if (var38 == null) {
                                var38 = new class141();
                            }
                            var38.method1032(20537, var16);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (var38 != null) {
                        for (int var39 = 0; var39 < 8; var39++) {
                            for (int var40 = 0; var40 < 8; var40++) {
                                int var41 = (arg7 >> 3) + var39;
                                int var42 = (arg4 >> 3) + var40;
                                if (var41 >= 0 && var41 < class11.field107 >> 3 && var42 >= 0 && var42 < (class264.field3620 >> 3)) {
                                    class354.method2127(var42, var38, var41, false);
                                }
                            }
                        }
                    }
                    break label287;
                }
            }
        }
        if (!var21 && class91.field1276 != null) {
            for (int var50 = 0; var50 < 4; var50++) {
                if (class91.field1276[var50] != null) {
                    for (int var51 = 0; var51 < 16; var51++) {
                        for (int var52 = 0; var52 < 16; var52++) {
                            int var53 = (arg7 >> 2) + var51;
                            int var54 = (arg4 >> 2) + var52;
                            if (var53 >= 0 && var53 < 26 && var54 >= 0 && var54 < 26) {
                                class91.field1276[var50][var53][var54] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class80.field1104;
        } else {
            return null;
        }
    }

    static {
        new class368(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field6257 = -1;
        field6254 = 0;
        field6258 = 0;
        field6259 = -1;
    }
}
