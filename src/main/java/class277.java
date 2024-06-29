import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class277 extends class225 {

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "Ljava/lang/String;")
    private String field4008 = "null";

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "[I")
    public static int[] field4004 = new int[50];

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4014 = "Loading interfaces - ";

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4019 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "C")
    public char field4005;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "C")
    public char field4021;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lvk;")
    public class56 field4013;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "Lvk;")
    private class56 field4015;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILnj;I)V")
    private final void method1904(int arg0, class228 arg1, int arg2) {
        if (arg2 != 48) {
            return;
        }
        if (arg0 == 1) {
            this.field4005 = class27.method189(-24769, arg1.method1349(arg2 ^ 0x33));
        } else if (arg0 == 2) {
            this.field4021 = class27.method189(-24769, arg1.method1349(3));
        } else if (arg0 == 3) {
            this.field4008 = arg1.method1329(991328496);
        } else if (arg0 == 4) {
            this.field4010 = arg1.method1344((byte) 64);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1343(255);
            this.field4013 = new class56(class139.method896(var4, -104));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1344((byte) 91);
                class45 var7;
                if (arg0 == 5) {
                    var7 = new class134(arg1.method1329(arg2 + 991328448));
                } else {
                    var7 = new class279(arg1.method1344((byte) 58));
                }
                this.field4013.method381(true, var7, (long) var6);
            }
        }
        field4006++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
    public static final void method1905(int arg0, boolean arg1) {
        class394.field5702 = arg1;
        field4009++;
        int var2 = 112 % ((74 - arg0) / 44);
        if (!class394.field5702) {
            int var3 = class156.field2120.method1355(29550);
            int var4 = class156.field2120.method1343(255);
            int var5 = class156.field2120.method1356((byte) -119);
            int var6 = class156.field2120.method1356((byte) -112);
            int var7 = (class300.field4398 - class156.field2120.field3029) / 16;
            class73.field1051 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var17 = 0; var17 < 4; var17++) {
                    class73.field1051[var8][var17] = class156.field2120.method1363(255);
                }
            }
            int var9 = class156.field2120.method1348(-123);
            boolean var10 = class156.field2120.method1348(-110) == 1;
            int var11 = class156.field2120.method1343(255);
            class388.method2497(true, var9);
            class379.field5503 = new byte[var7][];
            class146.field2006 = new byte[var7][];
            class177.field2340 = null;
            class94.field1346 = new byte[var7][];
            class35.field497 = new int[var7];
            class117.field1641 = new int[var7];
            class395.field5833 = null;
            class147.field2015 = new int[var7];
            class88.field1238 = new int[var7];
            class12.field198 = new byte[var7][];
            class27.field384 = new int[var7];
            boolean var12 = false;
            if ((var5 / 8 == 48 || (var5 / 8) == 49) && var6 / 8 == 48) {
                var12 = true;
            }
            int var13 = 0;
            if ((var5 / 8) == 48 && var6 / 8 == 148) {
                var12 = true;
            }
            for (int var14 = (var5 - (class192.field2574 >> 4)) / 8; var14 <= (var5 + (class192.field2574 >> 4)) / 8; var14++) {
                for (int var15 = (var6 - (class364.field5262 >> 4)) / 8; var15 <= (((class364.field5262 >> 4) + var6) / 8); var15++) {
                    int var16 = (var14 << 8) + var15;
                    if (var12 && var15 == 49 || var15 == 149 || var15 == 147 || var14 == 50 || !(var14 != 49 || var15 != 47)) {
                        class147.field2015[var13] = var16;
                        class117.field1641[var13] = -1;
                        class35.field497[var13] = -1;
                        class27.field384[var13] = -1;
                        class88.field1238[var13] = -1;
                    } else {
                        class147.field2015[var13] = var16;
                        class117.field1641[var13] = class153.field2066.method2270("m" + var14 + "_" + var15, (byte) 115);
                        class35.field497[var13] = class153.field2066.method2270("l" + var14 + "_" + var15, (byte) 115);
                        class27.field384[var13] = class153.field2066.method2270("um" + var14 + "_" + var15, (byte) 115);
                        class88.field1238[var13] = class153.field2066.method2270("ul" + var14 + "_" + var15, (byte) 115);
                    }
                    var13++;
                }
            }
            class419.method2683(var10, var5, var3, var6, false, var4, var11, 128);
            return;
        }
        int var18 = class156.field2120.method1343(255);
        int var19 = class156.field2120.method1361(-9711);
        int var20 = class156.field2120.method1348(-100);
        int var21 = class156.field2120.method1355(29550);
        boolean var22 = class156.field2120.method1371(-114) == 1;
        int var23 = class156.field2120.method1361(-9711);
        int var24 = class156.field2120.method1340(-128);
        class388.method2497(true, var20);
        class156.field2120.method11((byte) 101);
        for (int var25 = 0; var25 < 4; var25++) {
            for (int var40 = 0; var40 < (class192.field2574 >> 3); var40++) {
                for (int var41 = 0; var41 < (class364.field5262 >> 3); var41++) {
                    int var42 = class156.field2120.method4(1, (byte) 25);
                    if (var42 == 1) {
                        class233.field3116[var25][var40][var41] = class156.field2120.method4(26, (byte) 25);
                    } else {
                        class233.field3116[var25][var40][var41] = -1;
                    }
                }
            }
        }
        class156.field2120.method7(100);
        int var26 = (class300.field4398 - class156.field2120.field3029) / 16;
        class73.field1051 = new int[var26][4];
        for (int var27 = 0; var27 < var26; var27++) {
            for (int var39 = 0; var39 < 4; var39++) {
                class73.field1051[var27][var39] = class156.field2120.method1344((byte) 98);
            }
        }
        class27.field384 = new int[var26];
        class94.field1346 = new byte[var26][];
        class35.field497 = new int[var26];
        class395.field5833 = null;
        class177.field2340 = null;
        class147.field2015 = new int[var26];
        class12.field198 = new byte[var26][];
        class379.field5503 = new byte[var26][];
        class88.field1238 = new int[var26];
        class117.field1641 = new int[var26];
        class146.field2006 = new byte[var26][];
        int var28 = 0;
        for (int var29 = 0; var29 < 4; var29++) {
            for (int var30 = 0; var30 < (class192.field2574 >> 3); var30++) {
                for (int var31 = 0; var31 < (class364.field5262 >> 3); var31++) {
                    int var32 = class233.field3116[var29][var30][var31];
                    if (var32 != -1) {
                        int var33 = (var32 & 0xFFE4B8) >> 14;
                        int var34 = (var32 & 0x3FFB) >> 3;
                        int var35 = (var33 / 8 << 8) + (var34 / 8);
                        for (int var36 = 0; var36 < var28; var36++) {
                            if (class147.field2015[var36] == var35) {
                                var35 = -1;
                                break;
                            }
                        }
                        if (var35 != -1) {
                            class147.field2015[var28] = var35;
                            int var37 = (var35 & 0xFF6B) >> 8;
                            int var38 = var35 & 0xFF;
                            class117.field1641[var28] = class153.field2066.method2270("m" + var37 + "_" + var38, (byte) 115);
                            class35.field497[var28] = class153.field2066.method2270("l" + var37 + "_" + var38, (byte) 115);
                            class27.field384[var28] = class153.field2066.method2270("um" + var37 + "_" + var38, (byte) 115);
                            class88.field1238[var28] = class153.field2066.method2270("ul" + var37 + "_" + var38, (byte) 115);
                            var28++;
                        }
                    }
                }
            }
        }
        class419.method2683(var22, var24, var21, var19, false, var23, var18, 128);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
    public final int method1906(int arg0, int arg1) {
        field4017++;
        if (this.field4013 == null) {
            return this.field4010;
        }
        if (arg1 != 4) {
            field4004 = null;
        }
        class279 var3 = (class279) this.field4013.method384((long) arg0, true);
        return var3 == null ? this.field4010 : var3.field4054;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1907(byte arg0, String arg1) {
        if (arg0 <= 34) {
            this.field4013 = null;
        }
        field4011++;
        if (this.field4013 == null) {
            return false;
        }
        if (this.field4015 == null) {
            this.method1913(100);
        }
        for (class369 var3 = (class369) this.field4015.method384(class384.method2475(-20964, arg1), true); var3 != null; var3 = (class369) this.field4015.method392(false)) {
            if (var3.field5334.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    public static final void method1908(int arg0, int arg1) {
        field4003++;
        class189 var2 = class439.field6453;
        synchronized (class439.field6453) {
            class439.field6453.method1142((byte) -105, arg0);
            if (arg1 != 0) {
                field4014 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
    public static final int method1909(int arg0) {
        if (arg0 != 15149) {
            method1910(-109, -106, -77, -36, -55, 25);
        }
        field4016++;
        if ((double) class293.field4179 == 3.0D) {
            return 37;
        } else if ((double) class293.field4179 == 4.0D) {
            return 50;
        } else if ((double) class293.field4179 == 6.0D) {
            return 75;
        } else if ((double) class293.field4179 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1910(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -2) {
            method1911((byte) -111);
        }
        field4002++;
        for (int var6 = arg0; var6 <= arg3; var6++) {
            for (int var7 = arg1; var7 <= arg4; var7++) {
                if (class181.field2391[var6][var7] == arg2 && class56.field769[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(B)V")
    public static void method1911(byte arg0) {
        field4004 = null;
        field4014 = null;
        if (arg0 > 58) {
            field4019 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method1912(int arg0, int arg1) {
        field4022++;
        if (this.field4013 == null) {
            return this.field4008;
        }
        class134 var3 = (class134) this.field4013.method384((long) arg1, true);
        if (var3 == null) {
            return this.field4008;
        } else {
            int var4 = 125 / ((-arg0 - 73) / 32);
            return var3.field1871;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    private final void method1913(int arg0) {
        if (arg0 != 100) {
            this.field4005 = '_';
        }
        this.field4015 = new class56(this.field4013.method390(0));
        field4007++;
        for (class134 var2 = (class134) this.field4013.method389(arg0 - 100); var2 != null; var2 = (class134) this.field4013.method388(0)) {
            class369 var3 = new class369(var2.field1871, (int) var2.field640);
            this.field4015.method381(true, var3, class384.method2475(arg0 - 21064, var2.field1871));
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)V")
    private final void method1914(int arg0) {
        field4018++;
        this.field4015 = new class56(this.field4013.method390(0));
        class279 var2 = (class279) this.field4013.method389(0);
        if (arg0 != -148) {
            field4019 = null;
        }
        while (var2 != null) {
            class279 var3 = new class279((int) var2.field640);
            this.field4015.method381(true, var3, (long) var2.field4054);
            var2 = (class279) this.field4013.method388(0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILnj;)V")
    public final void method1915(int arg0, class228 arg1) {
        if (arg0 != -29998) {
            field4004 = null;
        }
        field4020++;
        while (true) {
            int var3 = arg1.method1348(-110);
            if (var3 == 0) {
                return;
            }
            this.method1904(var3, arg1, 48);
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)Z")
    public final boolean method1916(int arg0, int arg1) {
        field4012++;
        if (this.field4013 == null) {
            return false;
        } else if (arg0 > -100) {
            return false;
        } else {
            if (this.field4015 == null) {
                this.method1914(-148);
            }
            class279 var3 = (class279) this.field4015.method384((long) arg1, true);
            return var3 != null;
        }
    }
}
