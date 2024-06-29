import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class456 {

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
    public static int[] field6189 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lmc;")
    public static class78 field6185 = new class78(54, 8);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIZ)Lgn;")
    public abstract class456 method1893(byte arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "()Z")
    public abstract boolean method1894();

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "()I")
    public abstract int method1871();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lgn;IIIZ)V")
    public abstract void method1869(class456 arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "()Z")
    public abstract boolean method1877();

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "()I")
    public abstract int method1856();

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "()I")
    public abstract int method1900();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public abstract void method1896(int arg0);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "()[Ljf;")
    public abstract class130[] method1839();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIII)V")
    public static final void method2676(int arg0, int arg1, int arg2, int arg3) {
        field6184++;
        if (arg1 == 1008) {
            class382.method2345(class335.field4531, arg0, arg2);
        } else if (arg1 == 1002) {
            class382.method2345(class16.field225, arg0, arg2);
        } else if (arg1 == 1012) {
            class382.method2345(class424.field5739, arg0, arg2);
        } else if (arg1 == 1003) {
            class382.method2345(class171.field2344, arg0, arg2);
        } else if (arg1 == 1007) {
            class382.method2345(class92.field1354, arg0, arg2);
        }
        if (arg3 != 3) {
            method2682((String) null, -72);
        }
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "()V")
    public abstract void method1843();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[ZIZIIILnt;Lnt;ILnt;Lnt;II)V")
    public final void method2677(int arg0, int arg1, boolean[] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, class134 arg8, class134 arg9, int arg10, class134 arg11, class134 arg12, int arg13, int arg14) {
        field6183++;
        if (arg14 == -1) {
            return;
        }
        if (arg2 == null || arg5 == -1) {
            this.method2680(arg0, arg9, arg7, (byte) 94, arg4, arg1, arg14, arg12, 0);
        } else if (this.method1877()) {
            class352 var16 = arg12.field1960[arg14];
            class96 var17 = var16.field4890;
            class352 var18 = null;
            if (arg13 >= -87) {
                method2685(-18, (class464[]) null, -28);
            }
            if (arg9 != null) {
                var18 = arg9.field1960[arg7];
                if (var18.field4890 != var17) {
                    var18 = null;
                }
            }
            class352 var19 = arg8.field1960[arg5];
            class352 var20 = null;
            if (arg11 != null) {
                var20 = arg11.field1960[arg6];
                if (var20.field4890 != var17) {
                    var20 = null;
                }
            }
            this.method2687(false, (int[]) null, var17, arg2, var16, 65535, 0, arg1, arg4, (byte) 125, var18, arg0);
            this.method1849(0, new int[0], 0, 0, 0, 0, arg4);
            this.method2687(true, (int[]) null, var17, arg2, var19, 65535, 0, arg3, arg4, (byte) 125, var20, arg10);
            this.method1897();
        }
    }

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "()I")
    public abstract int method1853();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
    public abstract void method1866(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public abstract void method1841(int arg0);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
    public abstract void method1846(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(SS)V")
    public abstract void method1884(short arg0, short arg1);

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "()I")
    public abstract int method1851();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lnt;BI)V")
    public final void method2678(class134 arg0, byte arg1, int arg2) {
        field6186++;
        if (arg2 == -1 || !this.method1877()) {
            return;
        }
        class352 var4 = arg0.field1960[arg2];
        class96 var5 = var4.field4890;
        if (arg1 != 106) {
            return;
        }
        for (int var6 = 0; var6 < var4.field4889; var6++) {
            short var7 = var4.field4880[var6];
            if (var5.field1406[var7]) {
                if (var4.field4893[var6] != -1) {
                    this.method1867(0, 0, 0, 0);
                }
                this.method1867(var5.field1407[var7], var4.field4879[var6], var4.field4888[var6], var4.field4891[var6]);
            }
        }
        this.method1897();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILtf;Ltf;III)V")
    public abstract void method1878(int arg0, int arg1, class177 arg2, class177 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILon;Z)Z")
    public abstract boolean method1882(int arg0, int arg1, class203 arg2, boolean arg3);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIIZ)V")
    public abstract void method1849(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "()I")
    public abstract int method1858();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILnt;IIIILnt;ZZ[I)V")
    public final void method2679(int arg0, int arg1, class134 arg2, int arg3, int arg4, int arg5, int arg6, class134 arg7, boolean arg8, boolean arg9, int[] arg10) {
        field6177++;
        if (arg5 == -1 || !this.method1877()) {
            return;
        }
        class352 var12 = arg7.field1960[arg5];
        class96 var13 = var12.field4890;
        class352 var14 = null;
        if (arg2 != null) {
            var14 = arg2.field1960[arg6];
            if (var14.field4890 != var13) {
                var14 = null;
            }
        }
        this.method2687(arg9, arg10, var13, (boolean[]) null, var12, arg4, arg3, arg1, arg8, (byte) 125, var14, arg0);
        this.method1897();
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V")
    public abstract void method1885(int arg0);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIII)V")
    public abstract void method1867(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "()I")
    public abstract int method1862();

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "()I")
    public abstract int method1863();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILnt;IBZIILnt;I)V")
    public final void method2680(int arg0, class134 arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6, class134 arg7, int arg8) {
        field6181++;
        if (arg6 == -1 || !this.method1877()) {
            return;
        }
        if (arg3 <= 62) {
            this.method1863();
        }
        class352 var10 = arg7.field1960[arg6];
        class96 var11 = var10.field4890;
        class352 var12 = null;
        if (arg1 != null) {
            var12 = arg1.field1960[arg2];
            if (var12.field4890 != var11) {
                var12 = null;
            }
        }
        this.method2687(false, (int[]) null, var11, (boolean[]) null, var10, 65535, arg8, arg5, arg4, (byte) 125, var12, arg0);
        this.method1897();
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Ljg;")
    public static final class205 method2681(int arg0) {
        field6180++;
        if (class55.field736 == null || class409.field5603 == null) {
            return null;
        }
        for (class205 var1 = (class205) class409.field5603.method1463(11); var1 != null; var1 = (class205) class409.field5603.method1463(45)) {
            class313 var2 = class55.field735.method2710(26, var1.field2775);
            if (var2 != null && var2.field4117 && var2.method1714(class55.field728, (byte) 127)) {
                return var1;
            }
        }
        if (arg0 == 2) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
    public abstract void method1852(int arg0);

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "()I")
    public abstract int method1868();

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "()I")
    public abstract int method1873();

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)V")
    public abstract void method1865(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[IIIIZI[I)V")
    public abstract void method1854(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lon;Lau;I)V")
    public abstract void method1880(class203 arg0, class478 arg1, int arg2);

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "()V")
    public abstract void method1897();

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "()V")
    public abstract void method1899();

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(SS)V")
    public abstract void method1872(short arg0, short arg1);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lkb;)Lkb;")
    public abstract class449 method1879(class449 arg0);

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "()[Lnm;")
    public abstract class304[] method1845();

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2682(String arg0, int arg1) {
        field6179++;
        if (arg1 == 65535 && !arg0.equals("")) {
            class491.method2861(class173.field2374, 1);
            class123.field1805++;
            class203.field2751.method228(class231.method1292((byte) 3, arg0), arg1 ^ 0xFFDF);
            class203.field2751.method208(arg0, arg1 - 65651);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(III)V")
    public abstract void method1876(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "(I)V")
    public static void method2683(int arg0) {
        if (arg0 == 0) {
            field6185 = null;
            field6189 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lon;Lau;II)V")
    public abstract void method1888(class203 arg0, class478 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "(I)V")
    public abstract void method1847(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[III[IZIII)V")
    private final void method2684(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 16383) {
            field6185 = null;
        }
        if (arg8 == 1) {
            if (arg1 == 0 || arg1 == 1) {
                int var16 = -arg9;
                arg9 = arg4;
                arg4 = var16;
            } else if (arg1 == 3) {
                int var14 = arg9;
                arg9 = arg4;
                arg4 = var14;
            } else if (arg1 == 2) {
                int var15 = arg9;
                arg9 = -arg4 & 0x3FFF;
                arg4 = var15 & 0x3FFF;
            }
        } else if (arg8 == 2) {
            if (arg1 == 0 || arg1 == 1) {
                arg9 = -arg9;
                arg4 = -arg4;
            } else if (arg1 == 2) {
                arg9 = -arg9 & 0x3FFF;
                arg4 = -arg4 & 0x3FFF;
            }
        } else if (arg8 == 3) {
            if (arg1 == 0 || arg1 == 1) {
                int var13 = arg9;
                arg9 = -arg4;
                arg4 = var13;
            } else if (arg1 == 3) {
                int var12 = arg9;
                arg9 = arg4;
                arg4 = var12;
            } else if (arg1 == 2) {
                int var11 = arg9;
                arg9 = arg4 & 0x3FFF;
                arg4 = -var11 & 0x3FFF;
            }
        }
        field6178++;
        if (arg3 == 65535) {
            this.method1849(arg1, arg5, arg9, arg0, arg4, arg8, arg6);
        } else {
            this.method1854(arg1, arg5, arg9, arg0, arg4, arg6, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[Lnk;I)V")
    public static final void method2685(int arg0, class464[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class464 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field6358 == 0) {
                    if (var4.field6360 != null) {
                        method2685(arg0, var4.field6360, arg2);
                    }
                    class132 var5 = (class132) class214.field2883.method1528((long) var4.field6440, 100);
                    if (var5 != null) {
                        class291.method1636(var5.field1939, arg0, (byte) 78);
                    }
                }
                if (arg0 == 0 && var4.field6444 != null) {
                    class82 var6 = new class82();
                    var6.field1086 = var4;
                    var6.field1085 = var4.field6444;
                    class382.method2340(var6);
                }
                if (arg0 == 1 && var4.field6318 != null) {
                    if (var4.field6397 >= 0) {
                        class464 var7 = class150.method888((byte) -115, var4.field6440);
                        if (var7 == null || var7.field6360 == null || var7.field6360.length <= var4.field6397 || var7.field6360[var4.field6397] != var4) {
                            continue;
                        }
                    }
                    class82 var8 = new class82();
                    var8.field1085 = var4.field6318;
                    var8.field1086 = var4;
                    class382.method2340(var8);
                }
            }
        }
        if (arg2 != -15343) {
            method2685(109, (class464[]) null, -124);
        }
        field6188++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBIIILtf;I)V")
    public final void method2686(int arg0, byte arg1, int arg2, int arg3, int arg4, class177 arg5, int arg6) {
        field6182++;
        boolean var8 = false;
        boolean var9 = false;
        boolean var10 = false;
        int var11 = -arg0 / 2;
        int var12 = -arg3 / 2;
        int var13 = arg5.method368(arg6 + var11, arg2 + var12);
        int var14 = arg0 / 2;
        int var15 = -arg3 / 2;
        int var16 = arg5.method368(arg6 + var14, arg2 + var15);
        int var17 = -arg0 / 2;
        int var18 = arg3 / 2;
        int var19 = arg5.method368(arg6 + var17, arg2 + var18);
        int var20 = arg0 / 2;
        int var21 = arg3 / 2;
        int var22 = arg5.method368(arg6 + var20, arg2 + var21);
        int var23 = var13 < var16 ? var13 : var16;
        int var24 = var22 > var19 ? var19 : var22;
        int var25 = var16 >= var22 ? var22 : var16;
        if (arg3 != 0) {
            int var26 = (int) (Math.atan2((double) (var23 - var24), (double) arg3) * 2607.5945876176133D) & 0x3FFF;
            if (var26 != 0) {
                this.method1885(var26);
            }
        }
        int var27 = var19 > var13 ? var13 : var19;
        int var28 = var13 + var22;
        if (arg0 != 0) {
            int var29 = (int) (Math.atan2((double) (var27 - var25), (double) arg0) * 2607.5945876176133D) & 0x3FFF;
            if (var29 != 0) {
                this.method1846(var29);
            }
        }
        if (var28 > var16 + var19) {
            var28 = var16 + var19;
        }
        int var30 = (var28 >> 1) - arg4;
        if (var30 != 0) {
            this.method1866(0, var30, 0);
        }
        int var31 = 91 / ((arg1 + 64) / 43);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z[ILib;[ZLnd;IIIZBLnd;I)V")
    private final void method2687(boolean arg0, int[] arg1, class96 arg2, boolean[] arg3, class352 arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9, class352 arg10, int arg11) {
        if (arg9 != 125) {
            return;
        }
        field6176++;
        if (arg10 == null || arg7 == 0) {
            for (int var37 = 0; var37 < arg4.field4889; var37++) {
                short var38 = arg4.field4880[var37];
                if (arg3 == null || arg0 == arg3[var38] || arg2.field1407[var38] == 0) {
                    short var39 = arg4.field4893[var37];
                    if (var39 != -1) {
                        this.method2684(0, 0, arg1, arg5 & arg2.field1411[var39], 0, arg2.field1410[var39], arg8, arg9 ^ 0x3F82, arg6, 0);
                    }
                    this.method2684(arg4.field4888[var37], arg2.field1407[var38], arg1, arg5 & arg2.field1411[var38], arg4.field4891[var37], arg2.field1410[var38], arg8, arg9 ^ 0x3F82, arg6, arg4.field4879[var37]);
                }
            }
            return;
        }
        int var13 = 0;
        int var14 = 0;
        for (int var15 = 0; var15 < arg2.field1414; var15++) {
            boolean var16 = false;
            if (var13 < arg4.field4889 && arg4.field4880[var13] == var15) {
                var16 = true;
            }
            boolean var17 = false;
            if (arg10.field4889 > var14 && arg10.field4880[var14] == var15) {
                var17 = true;
            }
            if (var16 || var17) {
                if (arg3 == null || arg0 == arg3[var15] || arg2.field1407[var15] == 0) {
                    short var18 = 0;
                    int var19 = arg2.field1407[var15];
                    if (var19 == 3) {
                        var18 = 128;
                    }
                    short var20;
                    byte var21;
                    short var22;
                    short var23;
                    short var24;
                    if (var16) {
                        var24 = arg4.field4891[var13];
                        var22 = arg4.field4888[var13];
                        var20 = arg4.field4879[var13];
                        var23 = arg4.field4893[var13];
                        var21 = arg4.field4886[var13];
                        var13++;
                    } else {
                        var20 = var18;
                        var21 = 0;
                        var22 = var18;
                        var23 = -1;
                        var24 = var18;
                    }
                    short var25;
                    short var26;
                    byte var27;
                    short var28;
                    short var29;
                    if (var17) {
                        var25 = arg10.field4888[var14];
                        var26 = arg10.field4893[var14];
                        var27 = arg10.field4886[var14];
                        var28 = arg10.field4891[var14];
                        var29 = arg10.field4879[var14];
                        var14++;
                    } else {
                        var29 = var18;
                        var27 = 0;
                        var28 = var18;
                        var25 = var18;
                        var26 = -1;
                    }
                    if (var23 != -1) {
                        this.method2684(0, 0, arg1, arg2.field1411[var23] & arg5, 0, arg2.field1410[var23], arg8, arg9 + 16258, arg6, 0);
                    } else if (var26 != -1) {
                        this.method2684(0, 0, arg1, arg5 & arg2.field1411[var26], 0, arg2.field1410[var26], arg8, arg9 ^ 0x3F82, arg6, 0);
                    }
                    int var33;
                    int var34;
                    int var35;
                    if ((var21 & 0x2) != 0 || (var27 & 0x1) != 0) {
                        var33 = var20;
                        var34 = var22;
                        var35 = var24;
                    } else if (var19 == 2) {
                        int var30 = var29 - var20 & 0x3FFF;
                        int var31 = var25 - var22 & 0x3FFF;
                        if (var31 >= 8192) {
                            var31 -= 16384;
                        }
                        int var32 = var28 - var24 & 0x3FFF;
                        if (var30 >= 8192) {
                            var30 -= 16384;
                        }
                        var33 = var20 + (arg7 * var30 / arg11) & 0x3FFF;
                        var34 = arg7 * var31 / arg11 + var22 & 0x3FFF;
                        if (var32 >= 8192) {
                            var32 -= 16384;
                        }
                        var35 = arg7 * var32 / arg11 + var24 & 0x3FFF;
                    } else if (var19 == 7) {
                        int var36 = var29 - var20 & 0x3F;
                        if (var36 >= 32) {
                            var36 -= 64;
                        }
                        var35 = (var28 - var24) * arg7 / arg11 + var24;
                        var33 = arg7 * var36 / arg11 + var20 & 0x3F;
                        var34 = (var25 - var22) * arg7 / arg11 + var22;
                    } else {
                        var34 = (var25 - var22) * arg7 / arg11 + var22;
                        var35 = var24 + ((var28 - var24) * arg7 / arg11);
                        var33 = (var29 - var20) * arg7 / arg11 + var20;
                    }
                    this.method2684(var34, var19, arg1, arg5 & arg2.field1411[var15], var35, arg2.field1410[var15], arg8, 16383, arg6, var33);
                } else {
                    if (var17) {
                        var14++;
                    }
                    if (var16) {
                        var13++;
                    }
                }
            }
        }
    }
}
