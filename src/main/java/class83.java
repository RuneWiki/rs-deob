import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class83 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lcc;")
    private static class209 field1656 = class95.method669(123, "Prepared sound engine");

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lcc;")
    public static class209 field1663 = class95.method669(89, " ");

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lcc;")
    public static class209 field1660 = field1656;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field1655;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public int field1658;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field1662;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    public int[] field1659;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method601(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1666++;
        if (class25.field445 == 0) {
            class5.field66++;
            int var7 = class154.field2806;
            int var8 = class47.field909;
            int var9 = class134.field2547;
            int var10 = (arg1 - arg2) * (var8 - var7) / arg4 + var7;
            int var11 = class138.field2592;
            int var12 = (var11 - var9) * (arg6 - arg0) / arg3 + var9;
            if (class260.field4689 && (class49.field948 & 0x40) == 64) {
                class42 var13 = class116.method827(class172.field3147, (byte) 96, class222.field4053);
                if (var13 == null) {
                    class70.method514((byte) 110);
                } else {
                    class252.method1740(0L, (byte) 90, class184.field3318, var12, (short) 16, class40.field684, var10);
                }
            } else {
                if (class218.field3936 == 1) {
                    class252.method1740(0L, (byte) 90, class126.field2449, var12, (short) 23, class246.field4451, var10);
                }
                class252.method1740(0L, (byte) 90, class74.field1394, var12, (short) 31, class246.field4451, var10);
            }
        }
        long var14 = -1L;
        if (arg5 >= -27) {
            field1663 = null;
        }
        for (int var16 = 0; var16 < class274.field4859; var16++) {
            long var17 = class20.field392[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FCD) >> 7;
            int var21 = ((int) var17 & 0x6B4BD427) >> 29;
            int var22 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class262.method1805(class99.field1937, var19, var20, var17)) {
                    class218 var23 = class245.method1711(27093, var22);
                    if (var23.field3917 != null) {
                        var23 = var23.method1535((byte) -106);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class25.field445 == 1) {
                        class252.method1740(var17, (byte) 90, class124.field2417, var20, (short) 34, class229.method1604(new class209[] { class114.field2289, class33.field588, var23.field3956 }, (byte) 112), var19);
                        class275.field4865++;
                    } else if (!class260.field4689) {
                        class209[] var24 = var23.field3928;
                        class184.field3317++;
                        if (class252.field4533) {
                            var24 = class40.method302((byte) -66, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class154.field2804++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 9;
                                    }
                                    if (var25 == 1) {
                                        var26 = 14;
                                    }
                                    if (var25 == 2) {
                                        var26 = 11;
                                    }
                                    if (var25 == 3) {
                                        var26 = 1;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class252.method1740(var17, (byte) 90, var24[var25], var20, var26, class229.method1604(new class209[] { class97.field1903, var23.field3956 }, (byte) 106), var19);
                                }
                            }
                        }
                        class252.method1740((long) var23.field3952, (byte) 90, class33.field582, var20, (short) 1005, class229.method1604(new class209[] { class97.field1903, var23.field3956 }, (byte) 99), var19);
                    } else if ((class49.field948 & 0x4) == 4) {
                        class252.method1740(var17, (byte) 90, class184.field3318, var20, (short) 2, class229.method1604(new class209[] { class44.field879, class33.field588, var23.field3956 }, (byte) 57), var19);
                        class146.field2683++;
                    }
                }
                if (var21 == 1) {
                    class163 var27 = class60.field1207[var22];
                    if (var27.field2969.field4277 == 1 && (var27.field1571 & 0x7F) == 64 && (var27.field1534 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class219.field3996; var28++) {
                            class163 var31 = class60.field1207[class249.field4492[var28]];
                            if (var31 != null && var27 != var31 && var31.field2969.field4277 == 1 && var27.field1571 == var31.field1571 && var27.field1534 == var31.field1534) {
                                class244.method1704(var20, -105, class249.field4492[var28], var19, var31.field2969);
                            }
                        }
                        for (int var29 = 0; var29 < class250.field4502; var29++) {
                            class108 var30 = class103.field1993[class82.field1653[var29]];
                            if (var30 != null && var27.field1571 == var30.field1571 && var27.field1534 == var30.field1534) {
                                class213.method1498(var20, var30, class82.field1653[var29], var19, 28542);
                            }
                        }
                    }
                    class244.method1704(var20, -45, var22, var19, var27.field2969);
                }
                if (var21 == 0) {
                    class108 var32 = class103.field1993[var22];
                    if ((var32.field1571 & 0x7F) == 64 && (var32.field1534 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class219.field3996; var33++) {
                            class163 var36 = class60.field1207[class249.field4492[var33]];
                            if (var36 != null && var36.field2969.field4277 == 1 && var32.field1571 == var36.field1571 && var32.field1534 == var36.field1534) {
                                class244.method1704(var20, -100, class249.field4492[var33], var19, var36.field2969);
                            }
                        }
                        for (int var34 = 0; var34 < class250.field4502; var34++) {
                            class108 var35 = class103.field1993[class82.field1653[var34]];
                            if (var35 != null && var32 != var35 && var32.field1571 == var35.field1571 && var32.field1534 == var35.field1534) {
                                class213.method1498(var20, var35, class82.field1653[var34], var19, 28542);
                            }
                        }
                    }
                    class213.method1498(var20, var32, var22, var19, 28542);
                }
                if (var21 == 3) {
                    class162 var37 = class280.field4931[class99.field1937][var19][var20];
                    if (var37 != null) {
                        for (class164 var38 = (class164) var37.method1115((byte) -80); var38 != null; var38 = (class164) var37.method1122(true)) {
                            int var39 = var38.field2977.field3174;
                            class82 var40 = class249.method1728(var39, true);
                            if (class25.field445 == 1) {
                                class167.field3014++;
                                class252.method1740((long) var39, (byte) 90, class124.field2417, var20, (short) 7, class229.method1604(new class209[] { class114.field2289, class132.field2530, var40.field1629 }, (byte) 26), var19);
                            } else if (!class260.field4689) {
                                class209[] var41 = var40.field1615;
                                class260.field4683++;
                                if (class252.field4533) {
                                    var41 = class40.method302((byte) -66, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class193.field3487++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 12;
                                        }
                                        if (var42 == 1) {
                                            var43 = 5;
                                        }
                                        if (var42 == 2) {
                                            var43 = 49;
                                        }
                                        if (var42 == 3) {
                                            var43 = 45;
                                        }
                                        if (var42 == 4) {
                                            var43 = 33;
                                        }
                                        class252.method1740((long) var39, (byte) 90, var41[var42], var20, var43, class229.method1604(new class209[] { class35.field608, var40.field1629 }, (byte) 35), var19);
                                    } else if (var42 == 2) {
                                        class76.field1432++;
                                        class252.method1740((long) var39, (byte) 90, class167.field3007, var20, (short) 49, class229.method1604(new class209[] { class35.field608, var40.field1629 }, (byte) 28), var19);
                                    }
                                }
                                class252.method1740((long) var39, (byte) 90, class33.field582, var20, (short) 1004, class229.method1604(new class209[] { class35.field608, var40.field1629 }, (byte) 120), var19);
                            } else if ((class49.field948 & 0x1) == 1) {
                                class19.field376++;
                                class252.method1740((long) var39, (byte) 90, class184.field3318, var20, (short) 25, class229.method1604(new class209[] { class44.field879, class132.field2530, var40.field1629 }, (byte) 89), var19);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method602(int arg0, int arg1) {
        field1664++;
        class75 var2 = (class75) class31.field554.method1755((long) arg1, (byte) -82);
        if (var2 != null) {
            var2.method269(-214950896);
            if (arg0 != -2) {
                field1657 = 34;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        if (!arg0) {
            field1661++;
            class4.method28(this.field1659, this.field1658, this.field1655);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public abstract void method70(Component arg0, int arg1, byte arg2, int arg3);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBIILjava/awt/Graphics;)V")
    public abstract void method76(int arg0, int arg1, byte arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
    public static void method604(boolean arg0) {
        field1660 = null;
        field1663 = null;
        field1656 = null;
        if (!arg0) {
            method602(-18, -93);
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    protected class83() {
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public abstract void method67(int arg0, byte arg1, Graphics arg2, int arg3);
}
