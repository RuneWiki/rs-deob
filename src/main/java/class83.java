import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class83 {

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "Liv;")
    public static class64 field1444 = new class64(84, -2);

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "Z")
    public static boolean field1448 = false;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Lpi;")
    public static class342 field1450 = new class342("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "B")
    public byte field1428;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "B")
    public byte field1430;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "B")
    public byte field1433;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "B")
    public byte field1438;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "B")
    public byte field1446;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "B")
    public byte field1449;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "B")
    public byte field1451;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
    public int field1440;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field1442;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "S")
    public short field1432;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Z")
    public boolean field1427;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Z")
    public boolean field1429;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
    public boolean field1431;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Z")
    public boolean field1434;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Z")
    public boolean field1437;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "Z")
    public boolean field1441;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
    public boolean field1443;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "Z")
    public boolean field1445;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "Z")
    public boolean field1453;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "[[S")
    public static short[][] field1436;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static final void method647(byte arg0) {
        class6.field130.method488(-3);
        field1435++;
        if (arg0 != 1) {
            method648(null, -124);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lob;I)V")
    public static final void method648(class517 arg0, int arg1) {
        field1452++;
        int var2 = 9 % ((14 - arg1) / 63);
        arg0.field7623 = false;
        if (arg0.field7666 != -1) {
            class165 var3 = class431.field6419.method1137(41, arg0.field7666);
            if (var3 == null || var3.field2539 == null) {
                arg0.field7682 = false;
                arg0.field7666 = -1;
            } else {
                label400: {
                    arg0.field7597++;
                    if (var3.field2539.length > arg0.field7624 && arg0.field7597 > var3.field2564[arg0.field7624]) {
                        arg0.field7629++;
                        arg0.field7624++;
                        arg0.field7597 = 1;
                        class441.method2642((byte) 35, arg0.field7624, var3, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                    }
                    if (var3.field2539.length <= arg0.field7624) {
                        arg0.field7624 = 0;
                        arg0.field7597 = 0;
                        if (arg0.field7682) {
                            arg0.field7666 = arg0.method3094(-58).method2591(-1);
                            if (arg0.field7666 == -1) {
                                arg0.field7682 = false;
                                break label400;
                            }
                            var3 = class431.field6419.method1137(-111, arg0.field7666);
                        }
                        class441.method2642((byte) 22, arg0.field7624, var3, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                    }
                    arg0.field7629 = arg0.field7624 + 1;
                    if (var3.field2539.length <= arg0.field7629) {
                        arg0.field7629 = 0;
                    }
                }
            }
        }
        if (arg0.field7617 != -1 && class531.field7821 >= arg0.field7679) {
            class110 var4 = class140.field2233.method2249(arg0.field7617, -12502);
            int var5 = var4.field1853;
            if (var5 == -1) {
                arg0.field7617 = -1;
            } else {
                label402: {
                    class165 var6 = class431.field6419.method1137(-114, var5);
                    if (var4.field1852) {
                        if (var6.field2566 == 3) {
                            if (arg0.field7687 > 0 && class531.field7821 >= arg0.field7611 && class531.field7821 > arg0.field7677) {
                                arg0.field7617 = -1;
                                break label402;
                            }
                        } else if (var6.field2566 == 1 && arg0.field7687 > 0 && class531.field7821 >= arg0.field7611 && class531.field7821 > arg0.field7677) {
                            arg0.field7679 = class531.field7821 + 1;
                            break label402;
                        }
                    }
                    if (var6 == null || var6.field2539 == null) {
                        arg0.field7617 = -1;
                    } else {
                        if (arg0.field7656 < 0) {
                            arg0.field7656 = 0;
                            class441.method2642((byte) 80, 0, var6, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                        }
                        arg0.field7614++;
                        if (var6.field2539.length > arg0.field7656 && var6.field2564[arg0.field7656] < arg0.field7614) {
                            arg0.field7656++;
                            arg0.field7614 = 1;
                            class441.method2642((byte) 20, arg0.field7656, var6, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                        }
                        if (var6.field2539.length <= arg0.field7656) {
                            if (var4.field1852) {
                                arg0.field7634++;
                                arg0.field7656 -= var6.field2549;
                                if (var6.field2547 <= arg0.field7634) {
                                    arg0.field7617 = -1;
                                } else if (arg0.field7656 >= 0 && var6.field2539.length > arg0.field7656) {
                                    class441.method2642((byte) 10, arg0.field7656, var6, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                                } else {
                                    arg0.field7617 = -1;
                                }
                            } else {
                                arg0.field7617 = -1;
                            }
                        }
                        arg0.field7667 = arg0.field7656 + 1;
                        if (arg0.field7667 >= var6.field2539.length) {
                            if (var4.field1852) {
                                arg0.field7667 -= var6.field2549;
                                if ((arg0.field7634 + 1) >= var6.field2547) {
                                    arg0.field7667 = -1;
                                } else if (arg0.field7667 < 0 || var6.field2539.length <= arg0.field7667) {
                                    arg0.field7667 = -1;
                                }
                            } else {
                                arg0.field7667 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7621 != -1 && arg0.field7678 <= class531.field7821) {
            class110 var7 = class140.field2233.method2249(arg0.field7621, -12502);
            int var8 = var7.field1853;
            if (var8 == -1) {
                arg0.field7621 = -1;
            } else {
                label406: {
                    class165 var9 = class431.field6419.method1137(104, var8);
                    if (var7.field1852) {
                        if (var9.field2566 == 3) {
                            if (arg0.field7687 > 0 && arg0.field7611 <= class531.field7821 && arg0.field7677 < class531.field7821) {
                                arg0.field7621 = -1;
                                break label406;
                            }
                        } else if (var9.field2566 == 1 && arg0.field7687 > 0 && class531.field7821 >= arg0.field7611 && arg0.field7677 < class531.field7821) {
                            arg0.field7678 = class531.field7821 + 1;
                            break label406;
                        }
                    }
                    if (var9 == null || var9.field2539 == null) {
                        arg0.field7621 = -1;
                    } else {
                        if (arg0.field7618 < 0) {
                            arg0.field7618 = 0;
                            class441.method2642((byte) 99, 0, var9, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                        }
                        arg0.field7644++;
                        if (var9.field2539.length > arg0.field7618 && var9.field2564[arg0.field7618] < arg0.field7644) {
                            arg0.field7618++;
                            arg0.field7644 = 1;
                            class441.method2642((byte) 106, arg0.field7618, var9, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                        }
                        if (var9.field2539.length <= arg0.field7618) {
                            if (var7.field1852) {
                                arg0.field7618 -= var9.field2549;
                                arg0.field7631++;
                                if (var9.field2547 <= arg0.field7631) {
                                    arg0.field7621 = -1;
                                } else if (arg0.field7618 >= 0 && var9.field2539.length > arg0.field7618) {
                                    class441.method2642((byte) 98, arg0.field7618, var9, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                                } else {
                                    arg0.field7621 = -1;
                                }
                            } else {
                                arg0.field7621 = -1;
                            }
                        }
                        arg0.field7598 = arg0.field7618 + 1;
                        if (var9.field2539.length <= arg0.field7598) {
                            if (var7.field1852) {
                                arg0.field7598 -= var9.field2549;
                                if ((arg0.field7631 + 1) >= var9.field2547) {
                                    arg0.field7598 = -1;
                                } else if (arg0.field7598 < 0 || var9.field2539.length <= arg0.field7598) {
                                    arg0.field7598 = -1;
                                }
                            } else {
                                arg0.field7598 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field7642 != -1 && arg0.field7664 <= 1) {
            class165 var10 = class431.field6419.method1137(92, arg0.field7642);
            if (var10.field2566 == 3) {
                if (arg0.field7687 > 0 && arg0.field7611 <= class531.field7821 && arg0.field7677 < class531.field7821) {
                    arg0.field7642 = -1;
                }
            } else if (var10.field2566 == 1 && arg0.field7687 > 0 && arg0.field7611 <= class531.field7821 && class531.field7821 > arg0.field7677) {
                arg0.field7664 = 2;
            }
        }
        if (arg0.field7642 != -1 && arg0.field7664 == 0) {
            class165 var11 = class431.field6419.method1137(117, arg0.field7642);
            if (var11 == null || var11.field2539 == null) {
                arg0.field7642 = -1;
            } else {
                arg0.field7675++;
                if (var11.field2539.length > arg0.field7594 && var11.field2564[arg0.field7594] < arg0.field7675) {
                    arg0.field7594++;
                    arg0.field7675 = 1;
                    class441.method2642((byte) 89, arg0.field7594, var11, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                }
                if (arg0.field7594 >= var11.field2539.length) {
                    arg0.field7604++;
                    arg0.field7594 -= var11.field2549;
                    if (var11.field2547 <= arg0.field7604) {
                        arg0.field7642 = -1;
                    } else if (arg0.field7594 >= 0 && arg0.field7594 < var11.field2539.length) {
                        class441.method2642((byte) 23, arg0.field7594, var11, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                    } else {
                        arg0.field7642 = -1;
                    }
                }
                arg0.field7607 = arg0.field7594 + 1;
                if (var11.field2539.length <= arg0.field7607) {
                    arg0.field7607 -= var11.field2549;
                    if (var11.field2547 <= arg0.field7604 + 1) {
                        arg0.field7607 = -1;
                    } else if (arg0.field7607 < 0 || var11.field2539.length <= arg0.field7607) {
                        arg0.field7607 = -1;
                    }
                }
                arg0.field7623 = var11.field2562;
            }
        }
        if (arg0.field7664 > 0) {
            arg0.field7664--;
        }
        for (int var12 = 0; var12 < arg0.field7592.length; var12++) {
            class53 var13 = arg0.field7592[var12];
            if (var13 != null) {
                if (var13.field922 > 0) {
                    var13.field922--;
                } else {
                    class165 var14 = class431.field6419.method1137(-118, var13.field926);
                    if (var14 == null || var14.field2539 == null) {
                        arg0.field7592[var12] = null;
                    } else {
                        var13.field927++;
                        if (var13.field923 < var14.field2539.length && var13.field927 > var14.field2564[var13.field923]) {
                            var13.field923++;
                            var13.field927 = 1;
                            class441.method2642((byte) 87, var13.field923, var14, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                        }
                        if (var14.field2539.length <= var13.field923) {
                            var13.field921++;
                            var13.field923 -= var14.field2549;
                            if (var13.field921 >= var14.field2547) {
                                arg0.field7592[var12] = null;
                            } else if (var13.field923 >= 0 && var14.field2539.length > var13.field923) {
                                class441.method2642((byte) 114, var13.field923, var14, arg0.field6233, class139.field2224 == arg0, arg0.field6228, arg0.field6232);
                            } else {
                                arg0.field7592[var12] = null;
                            }
                        }
                        var13.field925 = var13.field923 + 1;
                        if (var14.field2539.length <= var13.field925) {
                            var13.field925 -= var14.field2549;
                            if (var14.field2547 <= var13.field921 + 1) {
                                var13.field925 = -1;
                            } else if (var13.field925 < 0 || var13.field925 >= var14.field2539.length) {
                                var13.field925 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BII)Lmq;")
    public static final class350 method649(byte arg0, int arg1, int arg2) {
        field1439++;
        class350 var3 = class319.method2075(true, arg1);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field5291 == null || var3.field5291.length <= arg2) {
            return null;
        } else {
            if (arg0 < 59) {
                method648(null, 5);
            }
            return var3.field5291[arg2];
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method650(int arg0) {
        field1444 = null;
        field1450 = null;
        if (arg0 != 0) {
            method647((byte) 78);
        }
        field1436 = null;
    }
}
