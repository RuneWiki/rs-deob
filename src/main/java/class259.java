import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class259 {

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lti;")
    private class222 field4017 = new class222();

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private int field4012;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    private int field4030;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lsa;")
    private class110 field4023;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    public static int[] field4019 = new int[2];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[[I")
    public static int[][] field4014 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "[[Ljn;")
    public static class124[][] field4026 = new class124[13][13];

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)V", line = 5)
    public final void method1828(int arg0, byte arg1) {
        int var3 = 70 / ((45 - arg1) / 50);
        field4028++;
        if (class12.field221 == null) {
            return;
        }
        for (class81 var4 = (class81) this.field4017.method1612(false); var4 != null; var4 = (class81) this.field4017.method1615(false)) {
            if (var4.method585((byte) 78)) {
                if (var4.method589(-116) == null) {
                    var4.method1701(-110);
                    var4.method571(7);
                    this.field4030++;
                }
            } else if ((++var4.field1191) > ((long) arg0)) {
                class81 var5 = class12.field221.method868(var4, 15942);
                this.field4023.method845(var5, (byte) 125, var4.field3734);
                class242.method1721(var5, var4, (byte) -91);
                var4.method1701(-106);
                var4.method571(7);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII[IIIIIBZ)V", line = 59)
    public static final void method1829(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, boolean arg10) {
        int var11 = arg1;
        field4016++;
        if (arg1 >= class182.field2912) {
            return;
        }
        if (arg1 < class182.field2905) {
            var11 = class182.field2905;
        }
        if (arg9 != 24) {
            field4026 = (class124[][]) ((class124[][]) null);
        }
        int var12 = arg1 + arg5;
        if (class182.field2905 >= var12) {
            return;
        }
        if (class182.field2912 < var12) {
            var12 = class182.field2912;
        }
        int var13 = arg7;
        if (arg7 >= class182.field2906) {
            return;
        }
        int var14 = arg6 + arg7;
        if (class182.field2911 > arg7) {
            var13 = class182.field2911;
        }
        if (var14 <= class182.field2911) {
            return;
        }
        if (class182.field2906 < var14) {
            var14 = class182.field2906;
        }
        if (arg0 == 9) {
            arg3 = arg3 + 1 & 0x3;
            arg0 = 1;
        }
        int var15 = class182.field2910 * var13 + var11;
        int var16 = var14 - arg7;
        int var17 = var13 - arg7;
        int var18 = class182.field2910 + var11 - var12;
        int var19 = var11 - arg1;
        if (arg0 == 10) {
            arg0 = 1;
            arg3 = arg3 + 3 & 0x3;
        }
        int var20 = var12 - arg1;
        if (arg0 == 11) {
            arg0 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var21 = arg5 - var20;
        int var22 = arg5 - var19;
        int var23 = arg6 - var16;
        int var24 = arg6 - var17;
        if (arg0 == 1) {
            if (arg3 == 0) {
                for (int var25 = var17; var25 < var16; var25++) {
                    for (int var26 = var19; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var27 = var24 - 1; var27 >= var23; var27--) {
                    for (int var28 = var19; var28 < var20; var28++) {
                        if (var27 >= var28) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var29 = var17; var29 < var16; var29++) {
                    for (int var30 = var19; var30 < var20; var30++) {
                        if (var30 >= var29) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var31 = var24 - 1; var31 >= var23; var31--) {
                    for (int var32 = var19; var32 < var20; var32++) {
                        if (var31 <= var32) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg0 == 2) {
            if (arg3 == 0) {
                for (int var87 = var24 - 1; var87 >= var23; var87--) {
                    for (int var88 = var19; var88 < var20; var88++) {
                        if (var88 <= var87 >> 1) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var85 = var17; var85 < var16; var85++) {
                    for (int var86 = var19; var86 < var20; var86++) {
                        if (var15 >= 0 && var15 < arg4.length) {
                            if ((var85 << 1) <= var86) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var83 = var17; var83 < var16; var83++) {
                    for (int var84 = var22 - 1; var84 >= var21; var84--) {
                        if (var84 <= var83 >> 1) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var81 = var24 - 1; var81 >= var23; var81--) {
                    for (int var82 = var22 - 1; var82 >= var21; var82--) {
                        if (var81 << 1 <= var82) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg0 == 3) {
            if (arg3 == 0) {
                for (int var79 = var24 - 1; var79 >= var23; var79--) {
                    for (int var80 = var22 - 1; var80 >= var21; var80--) {
                        if ((var79 >> 1) >= var80) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var77 = var24 - 1; var77 >= var23; var77--) {
                    for (int var78 = var19; var78 < var20; var78++) {
                        if (var78 >= var77 << 1) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var75 = var17; var75 < var16; var75++) {
                    for (int var76 = var19; var76 < var20; var76++) {
                        if (var75 >> 1 >= var76) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var73 = var17; var73 < var16; var73++) {
                    for (int var74 = var22 - 1; var74 >= var21; var74--) {
                        if (var74 >= var73 << 1) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg0 == 4) {
            if (arg3 == 0) {
                for (int var65 = var24 - 1; var65 >= var23; var65--) {
                    for (int var66 = var19; var66 < var20; var66++) {
                        if (var66 >= (var65 >> 1)) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var71 = var17; var71 < var16; var71++) {
                    for (int var72 = var19; var72 < var20; var72++) {
                        if ((var71 << 1) >= var72) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var69 = var17; var69 < var16; var69++) {
                    for (int var70 = var22 - 1; var70 >= var21; var70--) {
                        if (var70 >= (var69 >> 1)) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var67 = var24 - 1; var67 >= var23; var67--) {
                    for (int var68 = var22 - 1; var68 >= var21; var68--) {
                        if ((var67 << 1) >= var68) {
                            arg4[var15] = arg2;
                        } else if (arg10) {
                            arg4[var15] = arg8;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg3 == 0) {
                    for (int var41 = var17; var41 < var16; var41++) {
                        for (int var42 = var19; var42 < var20; var42++) {
                            if ((arg5 / 2) >= var42) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var47 = var17; var47 < var16; var47++) {
                        for (int var48 = var19; var48 < var20; var48++) {
                            if (var47 <= arg6 / 2) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var45 = var17; var45 < var16; var45++) {
                        for (int var46 = var19; var46 < var20; var46++) {
                            if ((arg5 / 2) <= var46) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var43 = var17; var43 < var16; var43++) {
                        for (int var44 = var19; var44 < var20; var44++) {
                            if (var43 >= arg6 / 2) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg3 == 0) {
                    for (int var49 = var17; var49 < var16; var49++) {
                        for (int var50 = var19; var50 < var20; var50++) {
                            if (var50 <= (var49 - arg6 / 2)) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var51 = var24 - 1; var51 >= var23; var51--) {
                        for (int var52 = var19; var52 < var20; var52++) {
                            if (var52 <= var51 - (arg6 / 2)) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var55 = var24 - 1; var55 >= var23; var55--) {
                        for (int var56 = var22 - 1; var56 >= var21; var56--) {
                            if (var56 <= var55 - arg6 / 2) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var53 = var17; var53 < var16; var53++) {
                        for (int var54 = var22 - 1; var54 >= var21; var54--) {
                            if ((var53 - (arg6 / 2)) >= var54) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg3 == 0) {
                    for (int var63 = var17; var63 < var16; var63++) {
                        for (int var64 = var19; var64 < var20; var64++) {
                            if (var63 - (arg6 / 2) <= var64) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var57 = var24 - 1; var57 >= var23; var57--) {
                        for (int var58 = var19; var58 < var20; var58++) {
                            if (var58 >= var57 - (arg6 / 2)) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var59 = var24 - 1; var59 >= var23; var59--) {
                        for (int var60 = var22 - 1; var60 >= var21; var60--) {
                            if (var59 - (arg6 / 2) <= var60) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var61 = var17; var61 < var16; var61++) {
                        for (int var62 = var22 - 1; var62 >= var21; var62--) {
                            if (var62 >= (var61 - (arg6 / 2))) {
                                arg4[var15] = arg2;
                            } else if (arg10) {
                                arg4[var15] = arg8;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var33 = var24 - 1; var33 >= var23; var33--) {
                for (int var34 = var22 - 1; var34 >= var21; var34--) {
                    if ((var33 >> 1) <= var34) {
                        arg4[var15] = arg2;
                    } else if (arg10) {
                        arg4[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 1) {
            for (int var35 = var24 - 1; var35 >= var23; var35--) {
                for (int var36 = var19; var36 < var20; var36++) {
                    if (var36 <= var35 << 1) {
                        arg4[var15] = arg2;
                    } else if (arg10) {
                        arg4[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 2) {
            for (int var37 = var17; var37 < var16; var37++) {
                for (int var38 = var19; var38 < var20; var38++) {
                    if (var37 >> 1 <= var38) {
                        arg4[var15] = arg2;
                    } else if (arg10) {
                        arg4[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 3) {
            for (int var39 = var17; var39 < var16; var39++) {
                for (int var40 = var22 - 1; var40 >= var21; var40--) {
                    if (var39 << 1 >= var40) {
                        arg4[var15] = arg2;
                    } else if (arg10) {
                        arg4[var15] = arg8;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 1244)
    public final Object method1830(long arg0, byte arg1) {
        field4021++;
        class81 var4 = (class81) this.field4023.method833(false, arg0);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method589(-112);
        if (var5 == null) {
            var4.method1701(arg1 - 172);
            var4.method571(arg1 - 45);
            this.field4030++;
            return null;
        } else if (arg1 == 52) {
            if (var4.method585((byte) 78)) {
                class226 var6 = new class226(var5);
                this.field4023.method845(var6, (byte) 84, var4.field3734);
                this.field4017.method1616(1, var6);
                var6.field1191 = 0L;
                var4.method1701(-120);
                var4.method571(7);
            } else {
                this.field4017.method1616(1, var4);
                var4.field1191 = 0L;
            }
            return var5;
        } else {
            return (Object) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(JLjava/lang/Object;I)V", line = 1286)
    public final void method1831(long arg0, Object arg1, int arg2) {
        this.method1834((byte) 54, arg0);
        field4031++;
        if (this.field4030 == 0) {
            class81 var5 = (class81) this.field4017.method1609(-1709);
            var5.method1701(-116);
            var5.method571(7);
        } else {
            this.field4030--;
        }
        class226 var6 = new class226(arg1);
        this.field4023.method845(var6, (byte) 82, arg0);
        if (arg2 == -13897) {
            this.field4017.method1616(1, var6);
            var6.field1191 = 0L;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 1316)
    public final void method1832(byte arg0) {
        for (class81 var2 = (class81) this.field4017.method1612(false); var2 != null; var2 = (class81) this.field4017.method1615(false)) {
            if (var2.method585((byte) 78)) {
                var2.method1701(-112);
                var2.method571(7);
                this.field4030++;
            }
        }
        field4018++;
        int var3 = -128 / ((-arg0 - 36) / 38);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 1338)
    public static final boolean method1833(boolean arg0, String arg1) {
        field4029++;
        if (arg1 == null) {
            return false;
        } else if (arg0) {
            for (int var2 = 0; var2 < class169.field2631; var2++) {
                if (arg1.equalsIgnoreCase(class71.field1121[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BJ)V", line = 1371)
    public final void method1834(byte arg0, long arg1) {
        field4025++;
        if (arg0 != 54) {
            return;
        }
        class81 var4 = (class81) this.field4023.method833(false, arg1);
        if (var4 != null) {
            var4.method1701(arg0 ^ 0xFFFFFF9A);
            var4.method571(7);
            this.field4030++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(BJ)Ljava/lang/String;", line = 1394)
    public static final String method1835(byte arg0, long arg1) {
        field4024++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0 <= 125) {
                method1835((byte) 30, 3L);
            }
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class203.field3197[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 1447)
    public static void method1836(int arg0) {
        field4019 = null;
        field4026 = (class124[][]) null;
        int var1 = 118 % ((arg0 - 62) / 48);
        field4014 = (int[][]) null;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 1458)
    public final void method1837(int arg0) {
        field4020++;
        this.field4017.method1613(-14142);
        this.field4023.method837(true);
        this.field4030 = this.field4012;
        int var2 = -12 / ((-arg0 - 73) / 41);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lvl;I)V", line = 1470)
    public static final void method1838(class80 arg0, int arg1) {
        if (arg0.field1214 != null) {
            arg0.field1214.field1777 = 0;
        }
        if (arg1 != 1479418273) {
            field4019 = (int[]) null;
        }
        arg0.field1215 = false;
        field4015++;
        for (class80 var2 = arg0.method295(); var2 != null; var2 = arg0.method294()) {
            method1838(var2, 1479418273);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I", line = 1491)
    public final int method1839(int arg0) {
        if (arg0 != 5459) {
            this.method1837(-84);
        }
        field4022++;
        int var2 = 0;
        for (class81 var3 = (class81) this.field4017.method1612(false); var3 != null; var3 = (class81) this.field4017.method1615(false)) {
            if (!var3.method585((byte) 78)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lfc;ZI)V", line = 1519)
    public static final void method1840(class224 arg0, boolean arg1, int arg2) {
        field4027++;
        int var3 = arg0.field3596;
        int var4 = (int) arg0.field3734;
        arg0.method1701(-108);
        int var5 = -105 % ((-arg2 - 27) / 40);
        if (arg1) {
            class185.method1386((byte) -128, var3);
        }
        class42.method339(412, var3);
        class292 var6 = class215.method1555((byte) -48, var4);
        if (var6 != null) {
            class143.method1091(var6, (byte) 103);
        }
        int var7 = class65.field1062;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class170.method1242(class12.field233[var8], -128)) {
                class36.method274((byte) -123, var8);
            }
        }
        if (class65.field1062 == 1) {
            class243.field3754 = false;
            class77.method567(class169.field2626, class76.field1168, class217.field3485, 0, class316.field4931);
        } else {
            class77.method567(class169.field2626, class76.field1168, class217.field3485, 0, class316.field4931);
            int var9 = class95.field1558.method1035(class77.field1175);
            for (int var10 = 0; var10 < class65.field1062; var10++) {
                int var11 = class95.field1558.method1035(class215.method1559(false, var10));
                if (var9 < var11) {
                    var9 = var11;
                }
            }
            class169.field2626 = class65.field1062 * 15 + (class77.field1176 ? 26 : 22);
            class217.field3485 = var9 + 8;
        }
        if (class122.field1950 != -1) {
            class108.method824(1, (byte) -35, class122.field1950);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(I)V", line = 1600)
    public class259(int arg0) {
        this.field4012 = arg0;
        this.field4030 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4023 = new class110(var2);
    }
}
