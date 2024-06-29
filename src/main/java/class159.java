import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class159 {

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "Lnaa;")
    private class413 field2013 = null;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "Z")
    private boolean field2007;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "Lfd;")
    private class557 field1992;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public int field1989;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2006;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Z")
    public static boolean field1987;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "[Ljava/lang/Object;")
    private Object[] field2015;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field1991;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z")
    private final boolean method1056(int arg0, int arg1, int arg2) {
        field2001++;
        if (!this.method1089((byte) -107)) {
            return false;
        } else if (arg1 != 11074) {
            return true;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field2013.field5796.length > arg2 && arg0 < this.field2013.field5796[arg2]) {
            return true;
        } else if (class626.field8518) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1057(String arg0, byte arg1) {
        field2018++;
        if (!this.method1089((byte) -100)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -6) {
            this.field2007 = false;
        }
        int var4 = this.field2013.field5799.method390(class128.method770((byte) -119, var3), arg1 ^ 0x7F);
        this.method1078(arg1 ^ 0xFFFFFFFA, var4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public final void method1058(boolean arg0) {
        if (!arg0) {
            this.field2013 = null;
        }
        if (this.field2015 != null) {
            for (int var2 = 0; var2 < this.field2015.length; var2++) {
                this.field2015[var2] = null;
            }
        }
        field1996++;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I")
    public final int method1059(boolean arg0) {
        field1990++;
        if (!arg0) {
            this.field1989 = 16;
        }
        if (!this.method1089((byte) -103)) {
            throw new IllegalStateException("");
        }
        return this.field2013.field5792;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public final void method1060(int arg0) {
        field2020++;
        if (arg0 > -106) {
            this.method1056(27, 124, 124);
        }
        if (this.field1991 != null) {
            for (int var2 = 0; var2 < this.field1991.length; var2++) {
                this.field1991[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public static void method1061(int arg0) {
        if (arg0 != 100) {
            method1079((byte) 114, null);
        }
        field2006 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1062(int arg0, String arg1) {
        field2012++;
        if (!this.method1089((byte) -72)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2013.field5799.method390(class128.method770((byte) -122, var3), 102);
        if (arg0 <= 90) {
            method1061(-91);
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method1063(String arg0, String arg1, int arg2) {
        field2022++;
        if (!this.method1089((byte) -39)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = -89 % (-arg2 / 62);
        int var7 = this.field2013.field5799.method390(class128.method770((byte) -118, var4), -113);
        if (this.method1065(var7, -20100)) {
            int var8 = this.field2013.field5801[var7].method390(class128.method770((byte) -116, var5), -123);
            return this.method1087(var7, var8, 1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method1064(String arg0, String arg1, byte arg2) {
        field2002++;
        if (arg2 > -2) {
            this.method1057(null, (byte) -44);
        }
        if (!this.method1089((byte) -57)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2013.field5799.method390(class128.method770((byte) -127, var4), 40);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field2013.field5801[var6].method390(class128.method770((byte) -125, var5), 18);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)Z")
    private final boolean method1065(int arg0, int arg1) {
        field1985++;
        if (!this.method1089((byte) -117)) {
            return false;
        } else if (arg0 >= 0 && this.field2013.field5796.length > arg0 && this.field2013.field5796[arg0] != 0) {
            if (arg1 != -20100) {
                field2006 = null;
            }
            return true;
        } else if (class626.field8518) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method1066(String arg0, int arg1, String arg2) {
        if (arg1 != -1) {
            this.method1083(-77, null);
        }
        field2016++;
        if (!this.method1089((byte) -19)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field2013.field5799.method390(class128.method770((byte) -116, var4), arg1 ^ 0xFFFFFFD7);
        if (this.method1065(var6, -20100)) {
            int var7 = this.field2013.field5801[var6].method390(class128.method770((byte) -126, var5), arg1 ^ 0x7C);
            return this.method1081((byte) 45, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ[II)Z")
    private final boolean method1067(int arg0, boolean arg1, int[] arg2, int arg3) {
        field1997++;
        if (!this.method1065(arg0, -20100)) {
            return false;
        } else if (this.field2015[arg0] == null) {
            return false;
        } else {
            int var5 = this.field2013.field5788[arg0];
            int[] var6 = this.field2013.field5794[arg0];
            if (this.field1991[arg0] == null) {
                this.field1991[arg0] = new Object[this.field2013.field5796[arg0]];
            }
            if (arg1) {
                this.method1064(null, null, (byte) -50);
            }
            Object[] var7 = this.field1991[arg0];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class648.method3605(true, this.field2015[arg0], false);
            } else {
                var11 = class648.method3605(true, this.field2015[arg0], true);
                class138 var12 = new class138(var11);
                var12.method909(5, var12.field1712.length, arg2, false);
            }
            byte[] var13;
            try {
                var13 = class541.method3048((byte) 39, var11);
            } catch (RuntimeException var49) {
                throw class1.method3(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class185.method1191(var11, (byte) 124, var11.length) + "," + class185.method1191(var11, (byte) 125, var11.length - 2) + "," + this.field2013.field5795[arg0] + "," + this.field2013.field5792);
            }
            if (this.field2007) {
                this.field2015[arg0] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field1989 == 0) {
                    var7[var15] = class34.method207(false, 136, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field1989 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class138 var35 = new class138(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field1745 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method943(-96);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg3 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field1745 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method943(-122);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg3 == var48) {
                            class657.method3639(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class138 var19 = new class138(var13);
                int[] var20 = new int[var5];
                var19.field1745 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method943(-94);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field1745 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method943(-124);
                        class657.method3639(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field1989 == 0) {
                        var7[var31] = class34.method207(false, 136, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([[[Laf;I)V")
    public static final void method1068(class651[][][] arg0, int arg1) {
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class651[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class651 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field9227 instanceof class289) {
                            ((class289) var6.field9227).method132(true);
                        }
                        if (var6.field9238 instanceof class289) {
                            ((class289) var6.field9238).method132(true);
                        }
                        if (var6.field9234 instanceof class289) {
                            ((class289) var6.field9234).method132(true);
                        }
                        if (var6.field9220 instanceof class289) {
                            ((class289) var6.field9220).method132(true);
                        }
                        if (var6.field9224 instanceof class289) {
                            ((class289) var6.field9224).method132(true);
                        }
                        for (class82 var7 = var6.field9228; var7 != null; var7 = var7.field1024) {
                            class293 var8 = var7.field1027;
                            if (var8 instanceof class289) {
                                ((class289) var8).method132(true);
                            }
                        }
                    }
                }
            }
        }
        field2008++;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)Z")
    public final boolean method1069(int arg0, int arg1) {
        field1993++;
        if (!this.method1065(arg1, arg0 ^ 0xFFFFCB5B)) {
            return false;
        } else if (this.field2015[arg1] == null) {
            this.method1075(arg0 ^ arg0, arg1);
            return this.field2015[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
    public final int method1070(int arg0) {
        field2026++;
        if (!this.method1089((byte) -64)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2015.length; var4++) {
            if (this.field2013.field5788[var4] > 0) {
                var3 += this.method1077((byte) -128, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else if (arg0 < 103) {
            return -26;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)V")
    public final void method1071(int arg0, byte arg1) {
        field2010++;
        if (!this.method1065(arg0, -20100)) {
            return;
        }
        if (this.field1991 != null) {
            this.field1991[arg0] = null;
        }
        if (arg1 != 79) {
            this.method1076(6, -106);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZBZ)V")
    public final void method1072(boolean arg0, byte arg1, boolean arg2) {
        field2014++;
        if (!this.method1089((byte) -62)) {
            return;
        }
        int var4 = -86 / ((arg1 - 80) / 41);
        if (arg0) {
            this.field2013.field5783 = null;
            this.field2013.field5799 = null;
        }
        if (arg2) {
            this.field2013.field5793 = null;
            this.field2013.field5801 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1073(int arg0, String arg1) {
        field1994++;
        if (!this.method1089((byte) -10)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2013.field5799.method390(class128.method770((byte) -121, var3), arg0 - 109);
        if (arg0 != 0) {
            method1079((byte) 53, null);
        }
        return this.method1077((byte) -113, var4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)I")
    public final int method1074(byte arg0) {
        field2019++;
        if (arg0 <= 76) {
            method1079((byte) -76, null);
        }
        return this.method1089((byte) -24) ? this.field2013.field5796.length : -1;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)V")
    private final void method1075(int arg0, int arg1) {
        field2004++;
        if (arg0 != 0) {
            return;
        }
        if (this.field2007) {
            this.field2015[arg1] = this.field1992.method1610(arg1, 0);
        } else {
            this.field2015[arg1] = class34.method207(false, arg0 + 136, this.field1992.method1610(arg1, 0));
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)I")
    public final int method1076(int arg0, int arg1) {
        field2025++;
        if (arg1 != 0) {
            this.method1066(null, 3, null);
        }
        return this.method1065(arg0, arg1 - 20100) ? this.field2013.field5796[arg0] : 0;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)I")
    private final int method1077(byte arg0, int arg1) {
        field2000++;
        if (arg0 >= -103) {
            this.method1063(null, null, -110);
        }
        if (this.method1065(arg1, -20100)) {
            return this.field2015[arg1] == null ? this.field1992.method1609(arg1, true) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(II)V")
    private final void method1078(int arg0, int arg1) {
        this.field1992.method1611(true, arg1);
        if (arg0 == 0) {
            field1995++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLdga;)Lca;")
    public static final class630 method1079(byte arg0, class138 arg1) {
        field1986++;
        return arg0 <= 113 ? null : new class630(arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method924(2), arg1.method904(126), arg1.method957((byte) -69));
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIB[I)[B")
    public final byte[] method1080(int arg0, int arg1, byte arg2, int[] arg3) {
        field1999++;
        if (!this.method1056(arg0, 11074, arg1)) {
            return null;
        }
        if (this.field1991[arg1] == null || this.field1991[arg1][arg0] == null) {
            boolean var5 = this.method1067(arg1, false, arg3, arg0);
            if (!var5) {
                this.method1075(0, arg1);
                boolean var6 = this.method1067(arg1, false, arg3, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        int var7 = -80 / ((57 - arg2) / 58);
        byte[] var8 = class648.method3605(true, this.field1991[arg1][arg0], false);
        if (this.field1989 == 1) {
            this.field1991[arg1][arg0] = null;
            if (this.field2013.field5796[arg1] == 1) {
                this.field1991[arg1] = null;
            }
        } else if (this.field1989 == 2) {
            this.field1991[arg1] = null;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BII)Z")
    public final boolean method1081(byte arg0, int arg1, int arg2) {
        field2005++;
        if (!this.method1056(arg2, 11074, arg1)) {
            return false;
        } else if (this.field1991[arg1] != null && this.field1991[arg1][arg2] != null) {
            return true;
        } else if (this.field2015[arg1] == null) {
            this.method1075(0, arg1);
            if (arg0 < 2) {
                return false;
            } else {
                return this.field2015[arg1] != null;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(BI)[B")
    public final byte[] method1082(byte arg0, int arg1) {
        field2017++;
        if (!this.method1089((byte) -46)) {
            return null;
        } else if (this.field2013.field5796.length == 1) {
            return this.method1087(0, arg1, arg0 ^ 0x20);
        } else if (!this.method1065(arg1, -20100)) {
            return null;
        } else if (this.field2013.field5796[arg1] == 1) {
            return this.method1087(arg1, 0, arg0 - 32);
        } else {
            if (arg0 != 33) {
                this.method1082((byte) 26, 2);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1083(int arg0, String arg1) {
        if (arg0 > -54) {
            this.method1089((byte) -42);
        }
        field2003++;
        if (this.method1089((byte) -116)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2013.field5799.method390(class128.method770((byte) -127, var3), -99);
            return this.method1069(31271, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(BI)[I")
    public final int[] method1084(byte arg0, int arg1) {
        field2023++;
        int var3 = 90 / ((arg0 - 11) / 41);
        if (!this.method1065(arg1, -20100)) {
            return null;
        }
        int[] var4 = this.field2013.field5794[arg1];
        if (var4 == null) {
            var4 = new int[this.field2013.field5788[arg1]];
            int var5 = 0;
            while (var5 < var4.length) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZI)I")
    public final int method1085(boolean arg0, int arg1) {
        field2009++;
        if (!this.method1089((byte) -57)) {
            return -1;
        } else if (arg0) {
            return -52;
        } else {
            int var3 = this.field2013.field5799.method390(arg1, -119);
            return this.method1065(var3, -20100) ? var3 : -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(BI)Z")
    public final boolean method1086(byte arg0, int arg1) {
        field2011++;
        if (!this.method1089((byte) -42)) {
            return false;
        } else if (this.field2013.field5796.length == 1) {
            return this.method1081((byte) 18, 0, arg1);
        } else if (!this.method1065(arg1, -20100)) {
            return false;
        } else if (arg0 < 112) {
            return true;
        } else if (this.field2013.field5796[arg1] == 1) {
            return this.method1081((byte) 90, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)[B")
    public final byte[] method1087(int arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            field2021++;
            return this.method1080(arg1, arg0, (byte) 118, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)Z")
    public final boolean method1088(int arg0) {
        field2024++;
        if (!this.method1089((byte) -66)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2013.field5784.length; var3++) {
            int var4 = this.field2013.field5784[var3];
            if (this.field2015[var4] == null) {
                this.method1075(0, var4);
                if (this.field2015[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 >= -60) {
            this.field1992 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
    private final boolean method1089(byte arg0) {
        field1998++;
        if (arg0 >= -4) {
            this.field1991 = null;
        }
        if (this.field2013 == null) {
            this.field2013 = this.field1992.method1608((byte) 84);
            if (this.field2013 == null) {
                return false;
            }
            this.field1991 = new Object[this.field2013.field5790][];
            this.field2015 = new Object[this.field2013.field5790];
        }
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Ljava/lang/String;B)I")
    public final int method1090(String arg0, byte arg1) {
        field1988++;
        if (!this.method1089((byte) -68)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2013.field5799.method390(class128.method770((byte) -116, var3), -114);
        if (this.method1065(var4, -20100)) {
            int var5 = -46 % ((arg1 + 54) / 49);
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lfd;ZI)V")
    public class159(class557 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field2007 = arg1;
        this.field1992 = arg0;
        this.field1989 = arg2;
    }
}
