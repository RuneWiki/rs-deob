import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class42 extends class51 {

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "Ltb;")
    public class168 field731;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "Lhi;")
    public static class82 field733 = class95.method664((byte) -115, "::errortest");

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lhn;")
    public static class317 field736 = new class317(64);

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "Lhn;")
    public static class317 field738 = new class317(50);

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lhi;")
    public static class82 field740 = class95.method664((byte) -51, "hint_mapmarkers");

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Lam;")
    public static class277 field741 = new class277();

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "Lhi;")
    public static class82 field744 = class95.method664((byte) -32, ")2");

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "[Lbc;")
    public static class153[] field748 = new class153[2048];

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[I")
    public static int[] field747;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "[Ljf;")
    public static class86[] field745;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "[[S")
    public static short[][] field742;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "[[Z")
    public static boolean[][] field743;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V", line = 9)
    public static final void method317(int arg0) {
        class159.field2751.method2172(false);
        field734++;
        if (arg0 != 0) {
            method322(-14, 60);
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ltb;)V", line = 18)
    public class42(class168 arg0) {
        this.field731 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([Luf;[BIIIZII)V", line = 28)
    public static final void method318(class189[] arg0, byte[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        byte var8;
        if (arg5) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg5) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg3 + var10) > 0 && (arg3 + var10) < 103 && (arg7 + var11) > 0 && (arg7 + var11) < 103) {
                            arg0[var9].field3159[arg3 + var10][arg7 + var11] = class277.method1935(arg0[var9].field3159[arg3 + var10][arg7 + var11], -16777217);
                        }
                    }
                }
            }
        }
        field737++;
        class153 var12 = new class153(arg1);
        if (arg2 != -17) {
            method319(-85, -80);
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class149.method1032(arg2 - 26266, arg7 + var15, arg5, var13, var14 + arg3, 0, arg6, arg4, var12);
                }
            }
        }
        boolean var16 = false;
        while (var12.field2611 < var12.field2598.length) {
            int var17 = var12.method1082(-98);
            if (var17 != 129) {
                var12.field2611--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method1104(-1);
                if (var19 == 0) {
                    int var20 = arg3;
                    int var21 = arg3 + 64;
                    if (var21 < 0) {
                        var21 = 0;
                    } else if (var21 >= 104) {
                        var21 = 104;
                    }
                    int var22 = arg7;
                    if (arg3 < 0) {
                        var20 = 0;
                    } else if (arg3 >= 104) {
                        var20 = 104;
                    }
                    if (arg7 < 0) {
                        var22 = 0;
                    } else if (arg7 >= 104) {
                        var22 = 104;
                    }
                    int var23 = arg7 + 64;
                    if (var23 < 0) {
                        var23 = 0;
                    } else if (var23 >= 104) {
                        var23 = 104;
                    }
                    while (var21 > var20) {
                        while (var22 < var23) {
                            class153.field2608[var18][var20][var22] = 0;
                            var22++;
                        }
                        var20++;
                    }
                } else if (var19 == 1) {
                    for (int var24 = 0; var24 < 64; var24 += 4) {
                        for (int var25 = 0; var25 < 64; var25 += 4) {
                            byte var26 = var12.method1104(-1);
                            for (int var27 = arg3 + var24; var27 < (arg3 + var24 + 4); var27++) {
                                for (int var28 = arg7 + var25; var28 < (var25 + arg7 + 4); var28++) {
                                    if (var27 >= 0 && var27 < 104 && var28 >= 0 && var28 < 104) {
                                        class153.field2608[var18][var27][var28] = var26;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var29 = arg3;
                    if (arg3 < 0) {
                        var29 = 0;
                    } else if (arg3 >= 104) {
                        var29 = 104;
                    }
                    int var30 = arg3 + 64;
                    int var31 = arg7;
                    if (var30 < 0) {
                        var30 = 0;
                    } else if (var30 >= 104) {
                        var30 = 104;
                    }
                    if (arg7 < 0) {
                        var31 = 0;
                    } else if (arg7 >= 104) {
                        var31 = 104;
                    }
                    int var32 = arg7 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    while (var29 < var30) {
                        while (var31 < var32) {
                            class153.field2608[var18][var29][var31] = class153.field2608[var18 - 1][var29][var31];
                            var31++;
                        }
                        var29++;
                    }
                }
            }
            var16 = true;
        }
        if (class147.field2485 && !arg5) {
            class309 var33 = null;
            while (true) {
                while (var12.field2598.length > var12.field2611) {
                    int var34 = var12.method1082(-34);
                    if (var34 == 0) {
                        var33 = new class309(var12);
                    } else if (var34 == 1) {
                        int var35 = var12.method1082(arg2 - 70);
                        if (var35 > 0) {
                            for (int var36 = 0; var36 < var35; var36++) {
                                class300 var37 = new class300(var12);
                                var37.field5101 += arg3 << 7;
                                var37.field5105 += arg7 << 7;
                                int var38 = var37.field5105 >> 7;
                                int var39 = var37.field5101 >> 7;
                                if (var39 >= 0 && var38 >= 0 && var39 < 104 && var38 < 104) {
                                    var37.field5118 = class245.field4255[var37.field5114][var39][var38] - var37.field5118;
                                    class2.method11(var37);
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var33 == null) {
                    var33 = new class309();
                }
                for (int var40 = 0; var40 < 8; var40++) {
                    for (int var41 = 0; var41 < 8; var41++) {
                        int var42 = (arg3 >> 3) + var40;
                        int var43 = (arg7 >> 3) + var41;
                        if (var42 >= 0 && var42 < 13 && var43 >= 0 && var43 < 13) {
                            class276.field4646[var42][var43] = var33;
                        }
                    }
                }
                break;
            }
        }
        if (var16) {
            return;
        }
        for (int var44 = 0; var44 < 4; var44++) {
            for (int var45 = 0; var45 < 16; var45++) {
                for (int var46 = 0; var46 < 16; var46++) {
                    int var47 = (arg7 >> 2) + var46;
                    int var48 = (arg3 >> 2) + var45;
                    if (var48 >= 0 && var48 < 26 && var47 >= 0 && var47 < 26) {
                        class153.field2608[var44][var48][var47] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V", line = 427)
    public static final void method319(int arg0, int arg1) {
        class74.field1127.method2177(arg0, arg1);
        field739++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 435)
    public static final void method320(Component arg0, int arg1) {
        arg0.removeMouseListener(class254.field4368);
        field735++;
        arg0.removeMouseMotionListener(class254.field4368);
        arg0.removeFocusListener(class254.field4368);
        int var2 = 95 / ((39 - arg1) / 62);
        class80.field1367 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 448)
    public static void method321(byte arg0) {
        field743 = (boolean[][]) null;
        field745 = null;
        if (arg0 <= 117) {
            return;
        }
        field733 = null;
        field748 = null;
        field741 = null;
        field747 = null;
        field744 = null;
        field742 = (short[][]) null;
        field736 = null;
        field740 = null;
        field738 = null;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)Z", line = 479)
    public static final boolean method322(int arg0, int arg1) {
        field732++;
        if (arg1 == 1602616419) {
            return (arg0 & 0x62A3A0) >> 22 != 0;
        } else {
            return true;
        }
    }
}
