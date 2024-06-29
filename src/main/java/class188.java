import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class188 {

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lqe;")
    private class149 field3646 = new class149();

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lsg;")
    private static class169 field3645 = class165.method1060("You can(Wt add yourself to your own ignore list)3", 1536);

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3649 = 0;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lsg;")
    public static class169 field3648 = class165.method1060("nicht hergestellt werden)3", 1536);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lsg;")
    public static class169 field3654 = field3645;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lsg;")
    public static class169 field3650 = class165.method1060("Benutzen Sie die (WPasswort -=ndern(W Option", 1536);

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "Lsg;")
    public static class169 field3651 = class165.method1060("::rect_debug", 1536);

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lsg;")
    private static class169 field3644 = class165.method1060("RuneScape has been updated(Q", 1536);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lsg;")
    public static class169 field3656 = field3644;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Lsg;")
    public static class169 field3661 = class165.method1060("::clientdrop", 1536);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIZIIII)I")
    public static final int method1235(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3652++;
        if ((arg6 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg5;
            arg5 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg1;
        } else if (var8 == 1) {
            return 7 + 1 - arg3 - arg0;
        } else {
            if (arg2) {
                field3651 = null;
            }
            return var8 == 2 ? 7 + 1 - arg1 - arg5 : arg3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lqe;")
    public final class149 method1236(byte arg0) {
        class149 var2 = this.field3646.field2757;
        field3660++;
        if (this.field3646 == var2) {
            return null;
        }
        if (arg0 != 80) {
            this.method1240(-75, null);
        }
        var2.method973(11076);
        return var2;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqe;I)V")
    public final void method1237(class149 arg0, int arg1) {
        field3655++;
        if (arg1 < 35) {
            this.method1242(-63);
        }
        if (arg0.field2763 != null) {
            arg0.method973(11076);
        }
        arg0.field2757 = this.field3646;
        arg0.field2763 = this.field3646.field2763;
        arg0.field2763.field2757 = arg0;
        arg0.field2757.field2763 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1238(int arg0) {
        field3644 = null;
        field3650 = null;
        field3654 = null;
        field3656 = null;
        field3661 = null;
        field3648 = null;
        field3651 = null;
        field3645 = null;
        if (arg0 >= -90) {
            method1239((byte) 78);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class188() {
        this.field3646.field2763 = this.field3646;
        this.field3646.field2757 = this.field3646;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static final void method1239(byte arg0) {
        field3659++;
        if (!class17.field380) {
            return;
        }
        class150 var1 = class121.method755(class134.field2517, -5207, class6.field114);
        if (arg0 != 27) {
            method1238(-117);
        }
        if (var1 != null && var1.field2834 != null) {
            class200 var2 = new class200();
            var2.field3911 = var1.field2834;
            var2.field3907 = var1;
            class172.method1147(-19955, var2);
        }
        class17.field380 = false;
        class64.method404(119, var1);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILqe;)V")
    public final void method1240(int arg0, class149 arg1) {
        if (arg0 != 16) {
            return;
        }
        field3657++;
        if (arg1.field2763 != null) {
            arg1.method973(arg0 + 11060);
        }
        arg1.field2757 = this.field3646.field2757;
        arg1.field2763 = this.field3646;
        arg1.field2763.field2757 = arg1;
        arg1.field2757.field2763 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIIII)V")
    public static final void method1241(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -1;
        if (class141.field2630 == 0 && !class17.field380) {
            class167.method1092(class45.field838, arg2 - arg1, -arg3 + arg4, class115.field2104, -1, 40, 0);
            class4.field81++;
        }
        if (arg0 <= 124) {
            return;
        }
        field3647++;
        for (int var6 = 0; var6 < class24.field498; var6++) {
            int var7 = class24.field506[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && class196.field3840.method878(class61.field1132, var8, var9, var7) >= 0) {
                    class17 var12 = class138.method925(6, var11);
                    if (var12.field355 != null) {
                        var12 = var12.method99(-73);
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (class141.field2630 == 1) {
                        class167.method1092(class165.method1058(0, new class169[] { class16.field341, class179.field3488, var12.field376 }), var9, var8, class73.field1368, -1, 35, var7);
                        class128.field2390++;
                    } else if (!class17.field380) {
                        class2.field38++;
                        class169[] var13 = var12.field373;
                        if (class89.field1623) {
                            var13 = class136.method921(-7884, var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    class105.field1922++;
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 14;
                                    }
                                    if (var14 == 1) {
                                        var15 = 15;
                                    }
                                    if (var14 == 2) {
                                        var15 = 32;
                                    }
                                    if (var14 == 3) {
                                        var15 = 25;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1003;
                                    }
                                    class167.method1092(class165.method1058(0, new class169[] { class202.field3964, var12.field376 }), var9, var8, var13[var14], -1, var15, var7);
                                }
                            }
                        }
                        class167.method1092(class165.method1058(0, new class169[] { class202.field3964, var12.field376 }), var9, var8, class151.field2920, -1, 1001, var12.field362 << 14);
                    } else if ((class11.field269 & 0x4) == 4) {
                        client.field592++;
                        class167.method1092(class165.method1058(0, new class169[] { class21.field455, class179.field3488, var12.field376 }), var9, var8, class137.field2551, -1, 10, var7);
                    }
                }
                if (var10 == 1) {
                    class197 var16 = class54.field992[var11];
                    if (var16.field3872.field3392 == 1 && (var16.field3698 & 0x7F) == 64 && (var16.field3679 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < class164.field3149; var17++) {
                            class197 var20 = class54.field992[class182.field3547[var17]];
                            if (var20 != null && var16 != var20 && var20.field3872.field3392 == 1 && var16.field3698 == var20.field3698 && var16.field3679 == var20.field3679) {
                                class82.method498((byte) -52, var8, var9, var20.field3872, class182.field3547[var17]);
                            }
                        }
                        for (int var18 = 0; var18 < class141.field2631; var18++) {
                            class196 var19 = class65.field1213[class202.field3932[var18]];
                            if (var19 != null && var16.field3698 == var19.field3698 && var16.field3679 == var19.field3679) {
                                class154.method1007(var9, 3, var19, var8, class202.field3932[var18]);
                            }
                        }
                    }
                    class82.method498((byte) -52, var8, var9, var16.field3872, var11);
                }
                if (var10 == 0) {
                    class196 var21 = class65.field1213[var11];
                    if ((var21.field3698 & 0x7F) == 64 && (var21.field3679 & 0x7F) == 64) {
                        for (int var22 = 0; var22 < class164.field3149; var22++) {
                            class197 var25 = class54.field992[class182.field3547[var22]];
                            if (var25 != null && var25.field3872.field3392 == 1 && var21.field3698 == var25.field3698 && var21.field3679 == var25.field3679) {
                                class82.method498((byte) -52, var8, var9, var25.field3872, class182.field3547[var22]);
                            }
                        }
                        for (int var23 = 0; var23 < class141.field2631; var23++) {
                            class196 var24 = class65.field1213[class202.field3932[var23]];
                            if (var24 != null && var21 != var24 && var21.field3698 == var24.field3698 && var21.field3679 == var24.field3679) {
                                class154.method1007(var9, 3, var24, var8, class202.field3932[var23]);
                            }
                        }
                    }
                    class154.method1007(var9, 3, var21, var8, var11);
                }
                if (var10 == 3) {
                    class22 var26 = class60.field1112[class61.field1132][var8][var9];
                    if (var26 != null) {
                        for (class145 var27 = (class145) var26.method147(5633); var27 != null; var27 = (class145) var26.method153(-1120)) {
                            class73 var28 = class180.method1196(var27.field2691, 0);
                            if (class141.field2630 == 1) {
                                class101.field1865++;
                                class167.method1092(class165.method1058(0, new class169[] { class16.field341, class73.field1362, var28.field1383 }), var9, var8, class73.field1368, -1, 51, var27.field2691);
                            } else if (!class17.field380) {
                                class27.field557++;
                                class169[] var29 = var28.field1333;
                                if (class89.field1623) {
                                    var29 = class136.method921(-7884, var29);
                                }
                                for (int var30 = 4; var30 >= 0; var30--) {
                                    if (var29 != null && var29[var30] != null) {
                                        class26.field545++;
                                        byte var31 = 0;
                                        if (var30 == 0) {
                                            var31 = 6;
                                        }
                                        if (var30 == 1) {
                                            var31 = 21;
                                        }
                                        if (var30 == 2) {
                                            var31 = 16;
                                        }
                                        if (var30 == 3) {
                                            var31 = 47;
                                        }
                                        if (var30 == 4) {
                                            var31 = 3;
                                        }
                                        class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var28.field1383 }), var9, var8, var29[var30], -1, var31, var27.field2691);
                                    } else if (var30 == 2) {
                                        class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var28.field1383 }), var9, var8, class61.field1125, -1, 16, var27.field2691);
                                        class125.field2285++;
                                    }
                                }
                                class167.method1092(class165.method1058(0, new class169[] { class112.field2047, var28.field1383 }), var9, var8, class151.field2920, -1, 1005, var27.field2691);
                            } else if ((class11.field269 & 0x1) == 1) {
                                class167.method1092(class165.method1058(0, new class169[] { class21.field455, class73.field1362, var28.field1383 }), var9, var8, class137.field2551, -1, 1, var27.field2691);
                                class48.field862++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Lqe;")
    public final class149 method1242(int arg0) {
        if (arg0 != -1) {
            this.method1236((byte) -102);
        }
        class149 var2 = this.field3646.field2757;
        field3658++;
        return this.field3646 == var2 ? null : var2;
    }
}
