import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class124 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Lnj;")
    public static class144 field1806 = new class144(8);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[J")
    public static long[] field1816 = new long[1000];

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public int field1807;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public int field1808;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Llc;")
    public static class86 field1813;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1821;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLlc;)I")
    public static final int method897(byte arg0, class86 arg1) {
        int var2 = 31 % ((30 - arg0) / 55);
        int var3 = 0;
        if (arg1.method634(class19.field212, 0)) {
            var3++;
        }
        field1815++;
        if (arg1.method634(class6.field46, 0)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method898(byte arg0) {
        field1812++;
        try {
            Method var1 = (field1821 == null ? (field1821 = method902("java.lang.Runtime")) : field1821).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class73.field1056 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != 119) {
                method897((byte) 17, (class86) null);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBIIIIZI[I)V")
    public static final void method899(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int[] arg10) {
        field1820++;
        int var11 = arg1;
        if (arg1 >= class70.field1032) {
            return;
        }
        int var12 = arg1 + arg9;
        if (class70.field1029 > arg1) {
            var11 = class70.field1029;
        }
        if (var12 <= class70.field1029) {
            return;
        }
        if (var12 > class70.field1032) {
            var12 = class70.field1032;
        }
        int var13 = arg2;
        if (arg2 >= class70.field1035) {
            return;
        }
        if (arg2 < class70.field1027) {
            var13 = class70.field1027;
        }
        int var14 = arg2 + arg6;
        if (class70.field1027 >= var14) {
            return;
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg7 = arg7 + 1 & 0x3;
        }
        if (arg5 == 10) {
            arg5 = 1;
            arg7 = arg7 + 3 & 0x3;
        }
        if (arg5 == 11) {
            arg5 = 8;
            arg7 = arg7 + 3 & 0x3;
        }
        if (class70.field1035 < var14) {
            var14 = class70.field1035;
        }
        int var15 = var14 - arg2;
        int var16 = class70.field1030 * var13 + var11;
        int var17 = var13 - arg2;
        int var18 = var11 + class70.field1030 - var12;
        int var19 = var11 - arg1;
        int var20 = arg6 - var17;
        int var21 = arg6 - var15;
        int var22 = arg9 - var19;
        int var23 = var12 - arg1;
        int var24 = arg9 - var23;
        if (arg5 == 1) {
            if (arg7 == 0) {
                for (int var25 = var17; var25 < var15; var25++) {
                    for (int var26 = var19; var26 < var23; var26++) {
                        if (var25 >= var26) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var27 = var20 - 1; var27 >= var21; var27--) {
                    for (int var28 = var19; var28 < var23; var28++) {
                        if (var27 >= var28) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var29 = var17; var29 < var15; var29++) {
                    for (int var30 = var19; var30 < var23; var30++) {
                        if (var30 >= var29) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var31 = var20 - 1; var31 >= var21; var31--) {
                    for (int var32 = var19; var32 < var23; var32++) {
                        if (var32 >= var31) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg5 == 2) {
            if (arg7 == 0) {
                for (int var33 = var20 - 1; var33 >= var21; var33--) {
                    for (int var34 = var19; var34 < var23; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var35 = var17; var35 < var15; var35++) {
                    for (int var36 = var19; var36 < var23; var36++) {
                        if (var16 >= 0 && var16 < arg10.length) {
                            if (var36 >= var35 << 1) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        } else {
                            var16++;
                        }
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var37 = var17; var37 < var15; var37++) {
                    for (int var38 = var22 - 1; var38 >= var24; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var39 = var20 - 1; var39 >= var21; var39--) {
                    for (int var40 = var22 - 1; var40 >= var24; var40--) {
                        if ((var39 << 1) <= var40) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg5 == 3) {
            if (arg7 == 0) {
                for (int var41 = var20 - 1; var41 >= var21; var41--) {
                    for (int var42 = var22 - 1; var42 >= var24; var42--) {
                        if ((var41 >> 1) >= var42) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var43 = var20 - 1; var43 >= var21; var43--) {
                    for (int var44 = var19; var44 < var23; var44++) {
                        if (var43 << 1 <= var44) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var45 = var17; var45 < var15; var45++) {
                    for (int var46 = var19; var46 < var23; var46++) {
                        if (var46 <= (var45 >> 1)) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var47 = var17; var47 < var15; var47++) {
                    for (int var48 = var22 - 1; var48 >= var24; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg5 == 4) {
            if (arg7 == 0) {
                for (int var49 = var20 - 1; var49 >= var21; var49--) {
                    for (int var50 = var19; var50 < var23; var50++) {
                        if (var49 >> 1 <= var50) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 1) {
                for (int var51 = var17; var51 < var15; var51++) {
                    for (int var52 = var19; var52 < var23; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 2) {
                for (int var53 = var17; var53 < var15; var53++) {
                    for (int var54 = var22 - 1; var54 >= var24; var54--) {
                        if (var54 >= var53 >> 1) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            } else if (arg7 == 3) {
                for (int var55 = var20 - 1; var55 >= var21; var55--) {
                    for (int var56 = var22 - 1; var56 >= var24; var56--) {
                        if (var55 << 1 >= var56) {
                            arg10[var16] = arg0;
                        } else if (arg8) {
                            arg10[var16] = arg4;
                        }
                        var16++;
                    }
                    var16 += var18;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg7 == 0) {
                    for (int var65 = var17; var65 < var15; var65++) {
                        for (int var66 = var19; var66 < var23; var66++) {
                            if (var66 <= arg9 / 2) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var67 = var17; var67 < var15; var67++) {
                        for (int var68 = var19; var68 < var23; var68++) {
                            if ((arg6 / 2) >= var67) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var69 = var17; var69 < var15; var69++) {
                        for (int var70 = var19; var70 < var23; var70++) {
                            if ((arg9 / 2) <= var70) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var71 = var17; var71 < var15; var71++) {
                        for (int var72 = var19; var72 < var23; var72++) {
                            if (var71 >= (arg6 / 2)) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg7 == 0) {
                    for (int var73 = var17; var73 < var15; var73++) {
                        for (int var74 = var19; var74 < var23; var74++) {
                            if (var74 <= var73 - (arg6 / 2)) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var75 = var20 - 1; var75 >= var21; var75--) {
                        for (int var76 = var19; var76 < var23; var76++) {
                            if ((var75 - (arg6 / 2)) >= var76) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var77 = var20 - 1; var77 >= var21; var77--) {
                        for (int var78 = var22 - 1; var78 >= var24; var78--) {
                            if ((var77 - arg6 / 2) >= var78) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var79 = var17; var79 < var15; var79++) {
                        for (int var80 = var22 - 1; var80 >= var24; var80--) {
                            if (var80 <= (var79 - (arg6 / 2))) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
            if (arg3 < 30) {
                field1810 = -71;
            }
            if (arg5 == 8) {
                if (arg7 == 0) {
                    for (int var81 = var17; var81 < var15; var81++) {
                        for (int var82 = var19; var82 < var23; var82++) {
                            if (var81 - (arg6 / 2) <= var82) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 1) {
                    for (int var83 = var20 - 1; var83 >= var21; var83--) {
                        for (int var84 = var19; var84 < var23; var84++) {
                            if (var84 >= var83 - (arg6 / 2)) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 2) {
                    for (int var85 = var20 - 1; var85 >= var21; var85--) {
                        for (int var86 = var22 - 1; var86 >= var24; var86--) {
                            if (var86 >= (var85 - (arg6 / 2))) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
                if (arg7 == 3) {
                    for (int var87 = var17; var87 < var15; var87++) {
                        for (int var88 = var22 - 1; var88 >= var24; var88--) {
                            if (var87 - (arg6 / 2) <= var88) {
                                arg10[var16] = arg0;
                            } else if (arg8) {
                                arg10[var16] = arg4;
                            }
                            var16++;
                        }
                        var16 += var18;
                    }
                    return;
                }
            }
        } else if (arg7 == 0) {
            for (int var57 = var20 - 1; var57 >= var21; var57--) {
                for (int var58 = var22 - 1; var58 >= var24; var58--) {
                    if (var58 >= (var57 >> 1)) {
                        arg10[var16] = arg0;
                    } else if (arg8) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 1) {
            for (int var59 = var20 - 1; var59 >= var21; var59--) {
                for (int var60 = var19; var60 < var23; var60++) {
                    if (var60 <= var59 << 1) {
                        arg10[var16] = arg0;
                    } else if (arg8) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 2) {
            for (int var61 = var17; var61 < var15; var61++) {
                for (int var62 = var19; var62 < var23; var62++) {
                    if (var61 >> 1 <= var62) {
                        arg10[var16] = arg0;
                    } else if (arg8) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        } else if (arg7 == 3) {
            for (int var63 = var17; var63 < var15; var63++) {
                for (int var64 = var22 - 1; var64 >= var24; var64--) {
                    if (var63 << 1 >= var64) {
                        arg10[var16] = arg0;
                    } else if (arg8) {
                        arg10[var16] = arg4;
                    }
                    var16++;
                }
                var16 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method900(int arg0) {
        field1806 = null;
        if (arg0 != 2000) {
            field1816 = null;
        }
        field1816 = null;
        field1813 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILbe;II)V")
    public static final void method901(int arg0, int arg1, class29 arg2, int arg3, int arg4) {
        field1817++;
        if (class186.field2993 == arg2 || class243.field3890 >= 400) {
            return;
        }
        String var5;
        if (arg2.field333 == 0) {
            boolean var6 = true;
            if (class186.field2993.field364 != -1 && arg2.field364 != -1) {
                int var7 = arg2.field355 < class186.field2993.field355 ? class186.field2993.field355 : arg2.field355;
                int var8 = arg2.field364 > class186.field2993.field364 ? class186.field2993.field364 : arg2.field364;
                int var9 = var7 * 10 / 100 + (var8 + 5);
                int var10 = class186.field2993.field355 - arg2.field355;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            String var11 = class175.field2850 == 1 ? class109.field1574 : class171.field2764;
            if (arg2.field355 < arg2.field363) {
                var5 = arg2.method208(30657) + (var6 ? class239.method1673(-23253, arg2.field355, class186.field2993.field355) : "<col=ffffff>") + " (" + var11 + arg2.field355 + "+" + (arg2.field363 - arg2.field355) + ")";
            } else {
                var5 = arg2.method208(30657) + (var6 ? class239.method1673(-23253, arg2.field355, class186.field2993.field355) : "<col=ffffff>") + " (" + var11 + arg2.field355 + ")";
            }
        } else {
            var5 = arg2.method208(30657) + " (" + class121.field1769 + arg2.field333 + ")";
        }
        if (class63.field941 == 1) {
            class240.field3833++;
            class42.method321(class146.field2391, (byte) 72, class239.field3818, arg0, (short) 26, (long) arg4, class297.field4709 + " -> <col=ffffff>" + var5, arg3);
        } else if (!class131.field2131) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class96.field1424[var12] != null) {
                    class196.field3182++;
                    boolean var13 = false;
                    short var14 = 0;
                    if (class175.field2850 == 0 && class96.field1424[var12].equalsIgnoreCase(class191.field3079)) {
                        if (arg2.field355 > class186.field2993.field355) {
                            var14 = 2000;
                        }
                        if (class186.field2993.field341 != 0 && arg2.field341 != 0) {
                            if (class186.field2993.field341 == arg2.field341) {
                                var14 = 2000;
                            } else {
                                var14 = 0;
                            }
                        }
                    } else if (class17.field187[var12]) {
                        var14 = 2000;
                    }
                    short var15 = class180.field2899[var12];
                    short var16 = (short) (var14 + var15);
                    class42.method321(class96.field1424[var12], (byte) 72, class98.field1444[var12], arg0, var16, (long) arg4, "<col=ffffff>" + var5, arg3);
                }
            }
        } else if ((class111.field1599 & 0x8) != 0) {
            class149.field2432++;
            class42.method321(class293.field4659, (byte) 72, class161.field2636, arg0, (short) 41, (long) arg4, class77.field1117 + " -> <col=ffffff>" + var5, arg3);
        }
        for (int var17 = 0; var17 < class243.field3890; var17++) {
            if (class207.field3318[var17] == 49) {
                class243.field3927[var17] = "<col=ffffff>" + var5;
                break;
            }
        }
        int var18 = -33 / ((arg1 + 18) / 53);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method902(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
