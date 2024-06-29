import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field614 = -1;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lja;")
    private static class62 field622 = class30.method243(43, "World");

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lja;")
    public static class62 field627 = class30.method243(43, "Lade Eingabe)2Steuerungsprogramm)3)3)3");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field620 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field611 = new int[5];

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lja;")
    private static class62 field628 = class30.method243(43, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lja;")
    public static class62 field613 = field628;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lja;")
    private static class62 field609 = class30.method243(43, "Attack");

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field625 = 0;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lja;")
    public static class62 field626 = field622;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Lja;")
    public static class62 field612 = class30.method243(43, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lja;")
    public static class62 field619 = field609;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lja;")
    public static class62 field615 = field622;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lja;")
    public static class62 field631 = class30.method243(43, "welle:");

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lja;")
    private static class62 field635 = class30.method243(43, "Login server offline)3");

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "Lja;")
    public static class62 field636 = class30.method243(43, " x ");

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lja;")
    public static class62 field629 = field635;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lc;")
    public static class18 field616 = new class18(64);

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Lpd;")
    public static class108 field610;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "[I")
    public static int[] field633;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLae;)V")
    public static final void method204(int arg0, byte arg1, class6 arg2) {
        field630++;
        if (arg2.field150 > class86.field2060) {
            class22.method172(arg2, 100);
        } else if (class86.field2060 > arg2.field187) {
            class93.method713((byte) 13, arg2);
        } else {
            class135.method1076(arg2, -122);
        }
        if (arg2.field136 < 128 || arg2.field134 < 128 || arg2.field136 >= 13184 || arg2.field134 >= 13184) {
            arg2.field187 = 0;
            arg2.field195 = -1;
            arg2.field150 = 0;
            arg2.field136 = arg2.field193[0] * 128 + arg2.field149 * 64;
            arg2.field177 = -1;
            arg2.field134 = arg2.field144[0] * 128 + arg2.field149 * 64;
            arg2.method61(1);
        }
        if (class40.field936 == arg2 && (arg2.field136 < 1536 || arg2.field134 < 1536 || arg2.field136 >= 11776 || arg2.field134 >= 11776)) {
            arg2.field195 = -1;
            arg2.field177 = -1;
            arg2.field150 = 0;
            arg2.field134 = arg2.field144[0] * 128 + arg2.field149 * 64;
            arg2.field136 = arg2.field193[0] * 128 + arg2.field149 * 64;
            arg2.field187 = 0;
            arg2.method61(1);
        }
        class28.method225(arg2, 2047);
        if (arg1 >= 74) {
            class98.method760(22445, arg2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method205(boolean arg0) {
        field628 = null;
        field626 = null;
        field633 = null;
        field615 = null;
        field635 = null;
        field619 = null;
        field629 = null;
        field610 = null;
        field636 = null;
        if (!arg0) {
            field635 = null;
        }
        field611 = null;
        field631 = null;
        field622 = null;
        field627 = null;
        field613 = null;
        field616 = null;
        field609 = null;
        field612 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBZI)V")
    public static final void method206(int arg0, byte arg1, boolean arg2, int arg3) {
        field632++;
        if (arg1 != 73) {
            field611 = null;
        }
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class144.field3371 = arg3;
        class8.field231 = arg2;
        class118.field2686 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/awt/Component;III)Lma;")
    public static final class83 method207(Component arg0, int arg1, int arg2, int arg3) {
        field617++;
        try {
            if (arg3 != -17983) {
                method206(-40, (byte) 96, false, -28);
            }
            Class var4 = Class.forName("b");
            class83 var5 = (class83) var4.getDeclaredConstructor().newInstance();
            var5.method82(arg3 + 17981, arg2, arg0, arg1);
            return var5;
        } catch (Throwable var7) {
            class35 var6 = new class35();
            var6.method82(arg3 ^ 0x463F, arg2, arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILwe;IIIILka;I)V")
    public static final void method208(int arg0, int arg1, class155 arg2, int arg3, int arg4, int arg5, int arg6, class69 arg7, int arg8) {
        field623++;
        if (class144.field3361 && (class155.field3581[0][arg4][arg3] & 0x2) == 0) {
            if ((class155.field3581[arg0][arg4][arg3] & 0x10) != 0) {
                return;
            }
            if (class16.method112(arg4, arg3, arg0, (byte) 62) != class53.field1221) {
                return;
            }
        }
        if (arg0 < class84.field2016) {
            class84.field2016 = arg0;
        }
        int var9 = class7.field214[arg0][arg4 + 1][arg3];
        if (arg1 < 61) {
            field611 = null;
        }
        int var10 = class7.field214[arg0][arg4][arg3];
        int var11 = class7.field214[arg0][arg4][arg3 + 1];
        int var12 = class7.field214[arg0][arg4 + 1][arg3 + 1];
        class65 var13 = class84.method653(6, arg6);
        int var14 = var10 + var12 + var11 + var9 >> 2;
        int var15 = (arg3 << 7) + (arg6 << 14) + arg4 + 1073741824;
        if (var13.field1600 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg5 << 6) + arg8;
        if (var13.field1590 == 1) {
            var16 += 256;
        }
        if (var13.method502(31974)) {
            class52.method358(var13, arg5, arg0, (byte) -94, arg4, arg3);
        }
        if (arg8 == 22) {
            if (!class144.field3361 || var13.field1600 != 0 || var13.field1603 == 1 || var13.field1584) {
                class140 var17;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var17 = var13.method509(var9, arg5, 22, var12, var10, (byte) 20, var11);
                } else {
                    var17 = new class43(arg6, 22, arg5, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method573(arg0, arg4, arg3, var14, var17, var15, var16);
                if (var13.field1603 == 1 && arg2 != null) {
                    arg2.method1206(-127, arg4, arg3);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class140 var37;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var37 = var13.method509(var9, arg5, 10, var12, var10, (byte) -128, var11);
            } else {
                var37 = new class43(arg6, 10, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            if (var37 != null) {
                int var38 = 0;
                if (arg8 == 11) {
                    var38 += 256;
                }
                int var39;
                int var40;
                if (arg5 == 1 || arg5 == 3) {
                    var39 = var13.field1612;
                    var40 = var13.field1615;
                } else {
                    var39 = var13.field1615;
                    var40 = var13.field1612;
                }
                if (arg7.method563(arg0, arg4, arg3, var14, var40, var39, var37, var38, var15, var16) && var13.field1583) {
                    int var41 = 15;
                    if (var37 instanceof class145) {
                        var41 = ((class145) var37).method1154() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var40; var42++) {
                        for (int var43 = 0; var43 <= var39; var43++) {
                            if (var41 > class15.field369[arg0][arg4 + var42][arg3 + var43]) {
                                class15.field369[arg0][arg4 + var42][arg3 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1207(var13.field1615, arg5, var13.field1612, var13.field1592, arg4, true, arg3);
            }
        } else if (arg8 >= 12) {
            class140 var18;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var18 = var13.method509(var9, arg5, arg8, var12, var10, (byte) 93, var11);
            } else {
                var18 = new class43(arg6, arg8, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method563(arg0, arg4, arg3, var14, 1, 1, var18, 0, var15, var16);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0) {
                class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 2340);
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1207(var13.field1615, arg5, var13.field1612, var13.field1592, arg4, true, arg3);
            }
        } else if (arg8 == 0) {
            class140 var19;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var19 = var13.method509(var9, arg5, 0, var12, var10, (byte) 46, var11);
            } else {
                var19 = new class43(arg6, 0, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method585(arg0, arg4, arg3, var14, var19, null, class121.field2765[arg5], 0, var15, var16);
            if (arg5 == 0) {
                if (var13.field1583) {
                    class15.field369[arg0][arg4][arg3] = 50;
                    class15.field369[arg0][arg4][arg3 + 1] = 50;
                }
                if (var13.field1626) {
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 585);
                }
            } else if (arg5 == 1) {
                if (var13.field1583) {
                    class15.field369[arg0][arg4][arg3 + 1] = 50;
                    class15.field369[arg0][arg4 + 1][arg3 + 1] = 50;
                }
                if (var13.field1626) {
                    class83.field1989[arg0][arg4][arg3 + 1] = class85.method660(class83.field1989[arg0][arg4][arg3 + 1], 1170);
                }
            } else if (arg5 == 2) {
                if (var13.field1583) {
                    class15.field369[arg0][arg4 + 1][arg3] = 50;
                    class15.field369[arg0][arg4 + 1][arg3 + 1] = 50;
                }
                if (var13.field1626) {
                    class83.field1989[arg0][arg4 + 1][arg3] = class85.method660(class83.field1989[arg0][arg4 + 1][arg3], 585);
                }
            } else if (arg5 == 3) {
                if (var13.field1583) {
                    class15.field369[arg0][arg4][arg3] = 50;
                    class15.field369[arg0][arg4 + 1][arg3] = 50;
                }
                if (var13.field1626) {
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 1170);
                }
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1205(arg5, arg3, arg8, var13.field1592, (byte) -20, arg4);
            }
            if (var13.field1614 != 16) {
                arg7.method557(arg0, arg4, arg3, var13.field1614);
            }
        } else if (arg8 == 1) {
            class140 var20;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var20 = var13.method509(var9, arg5, 1, var12, var10, (byte) -122, var11);
            } else {
                var20 = new class43(arg6, 1, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method585(arg0, arg4, arg3, var14, var20, null, class155.field3605[arg5], 0, var15, var16);
            if (var13.field1583) {
                if (arg5 == 0) {
                    class15.field369[arg0][arg4][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    class15.field369[arg0][arg4 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    class15.field369[arg0][arg4 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    class15.field369[arg0][arg4][arg3] = 50;
                }
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1205(arg5, arg3, arg8, var13.field1592, (byte) -20, arg4);
            }
        } else if (arg8 == 2) {
            int var21 = arg5 + 1 & 0x3;
            class140 var22;
            class140 var23;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var22 = var13.method509(var9, arg5 + 4, 2, var12, var10, (byte) 79, var11);
                var23 = var13.method509(var9, var21, 2, var12, var10, (byte) 24, var11);
            } else {
                var22 = new class43(arg6, 2, arg5 + 4, var10, var9, var12, var11, var13.field1640, true, null);
                var23 = new class43(arg6, 2, var21, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method585(arg0, arg4, arg3, var14, var22, var23, class121.field2765[arg5], class121.field2765[var21], var15, var16);
            if (var13.field1626) {
                if (arg5 == 0) {
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 585);
                    class83.field1989[arg0][arg4][arg3 + 1] = class85.method660(class83.field1989[arg0][arg4][arg3 + 1], 1170);
                } else if (arg5 == 1) {
                    class83.field1989[arg0][arg4][arg3 + 1] = class85.method660(class83.field1989[arg0][arg4][arg3 + 1], 1170);
                    class83.field1989[arg0][arg4 + 1][arg3] = class85.method660(class83.field1989[arg0][arg4 + 1][arg3], 585);
                } else if (arg5 == 2) {
                    class83.field1989[arg0][arg4 + 1][arg3] = class85.method660(class83.field1989[arg0][arg4 + 1][arg3], 585);
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 1170);
                } else if (arg5 == 3) {
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 1170);
                    class83.field1989[arg0][arg4][arg3] = class85.method660(class83.field1989[arg0][arg4][arg3], 585);
                }
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1205(arg5, arg3, arg8, var13.field1592, (byte) -20, arg4);
            }
            if (var13.field1614 != 16) {
                arg7.method557(arg0, arg4, arg3, var13.field1614);
            }
        } else if (arg8 == 3) {
            class140 var24;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var24 = var13.method509(var9, arg5, 3, var12, var10, (byte) -116, var11);
            } else {
                var24 = new class43(arg6, 3, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method585(arg0, arg4, arg3, var14, var24, null, class155.field3605[arg5], 0, var15, var16);
            if (var13.field1583) {
                if (arg5 == 0) {
                    class15.field369[arg0][arg4][arg3 + 1] = 50;
                } else if (arg5 == 1) {
                    class15.field369[arg0][arg4 + 1][arg3 + 1] = 50;
                } else if (arg5 == 2) {
                    class15.field369[arg0][arg4 + 1][arg3] = 50;
                } else if (arg5 == 3) {
                    class15.field369[arg0][arg4][arg3] = 50;
                }
            }
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1205(arg5, arg3, arg8, var13.field1592, (byte) -20, arg4);
            }
        } else if (arg8 == 9) {
            class140 var25;
            if (var13.field1640 == -1 && var13.field1594 == null) {
                var25 = var13.method509(var9, arg5, arg8, var12, var10, (byte) 32, var11);
            } else {
                var25 = new class43(arg6, arg8, arg5, var10, var9, var12, var11, var13.field1640, true, null);
            }
            arg7.method563(arg0, arg4, arg3, var14, 1, 1, var25, 0, var15, var16);
            if (var13.field1603 != 0 && arg2 != null) {
                arg2.method1207(var13.field1615, arg5, var13.field1612, var13.field1592, arg4, true, arg3);
            }
        } else {
            if (var13.field1582) {
                if (arg5 == 1) {
                    int var29 = var11;
                    var11 = var12;
                    var12 = var9;
                    var9 = var10;
                    var10 = var29;
                } else if (arg5 == 2) {
                    int var26 = var11;
                    var11 = var9;
                    var9 = var26;
                    int var27 = var12;
                    var12 = var10;
                    var10 = var27;
                } else if (arg5 == 3) {
                    int var28 = var11;
                    var11 = var10;
                    var10 = var9;
                    var9 = var12;
                    var12 = var28;
                }
            }
            if (arg8 == 4) {
                class140 var30;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var30 = var13.method509(var9, 0, 4, var12, var10, (byte) 126, var11);
                } else {
                    var30 = new class43(arg6, 4, 0, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method589(arg0, arg4, arg3, var14, var30, class121.field2765[arg5], arg5 * 512, 0, 0, var15, var16);
            } else if (arg8 == 5) {
                int var31 = 16;
                int var32 = arg7.method570(arg0, arg4, arg3);
                if (var32 != 0) {
                    var31 = class84.method653(6, var32 >> 14 & 0x7FFF).field1614;
                }
                class140 var33;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var33 = var13.method509(var9, 0, 4, var12, var10, (byte) -127, var11);
                } else {
                    var33 = new class43(arg6, 4, 0, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method589(arg0, arg4, arg3, var14, var33, class121.field2765[arg5], arg5 * 512, class151.field3546[arg5] * var31, class28.field688[arg5] * var31, var15, var16);
            } else if (arg8 == 6) {
                class140 var34;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var34 = var13.method509(var9, 0, 4, var12, var10, (byte) -124, var11);
                } else {
                    var34 = new class43(arg6, 4, 0, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method589(arg0, arg4, arg3, var14, var34, 256, arg5, 0, 0, var15, var16);
            } else if (arg8 == 7) {
                class140 var35;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var35 = var13.method509(var9, 0, 4, var12, var10, (byte) 46, var11);
                } else {
                    var35 = new class43(arg6, 4, 0, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method589(arg0, arg4, arg3, var14, var35, 512, arg5, 0, 0, var15, var16);
            } else if (arg8 == 8) {
                class140 var36;
                if (var13.field1640 == -1 && var13.field1594 == null) {
                    var36 = var13.method509(var9, 0, 4, var12, var10, (byte) 91, var11);
                } else {
                    var36 = new class43(arg6, 4, 0, var10, var9, var12, var11, var13.field1640, true, null);
                }
                arg7.method589(arg0, arg4, arg3, var14, var36, 768, arg5, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)J")
    public static final synchronized long method209(byte arg0) {
        field621++;
        long var1 = System.currentTimeMillis();
        int var3 = -43 / ((50 - arg0) / 58);
        if (var1 < class148.field3498) {
            class139.field3226 += class148.field3498 - var1;
        }
        class148.field3498 = var1;
        return class139.field3226 + var1;
    }
}
