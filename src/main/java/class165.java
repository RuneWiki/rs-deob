import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class165 {

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "Z")
    public boolean field2338 = true;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public int field2339 = -1;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    private int field2341 = 0;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "I")
    public int field2349 = 128;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "Lgk;")
    public static class331 field2345 = new class331(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Lfs;")
    public static class387 field2348;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BI)V", line = 3)
    private final void method1165(byte arg0, int arg1) {
        field2337++;
        double var3 = (double) ((arg1 & 0xFF0E1B) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF0F) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (arg0 > -124) {
            return;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field2334 = (int) (var15 * 256.0D);
        this.field2336 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field2336 < 0) {
            this.field2336 = 0;
        } else if (this.field2336 > 255) {
            this.field2336 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2335 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2335 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2334 < 0) {
            this.field2334 = 0;
        } else if (this.field2334 > 255) {
            this.field2334 = 255;
        }
        if (this.field2335 < 1) {
            this.field2335 = 1;
        }
        this.field2342 = (int) ((double) this.field2335 * var19);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 96)
    public static void method1166(int arg0) {
        int var1 = 26 % ((arg0 - 11) / 40);
        field2345 = null;
        field2348 = null;
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)I", line = 106)
    public static final int method1167(int arg0) {
        field2340++;
        class38 var1 = class225.field3300;
        boolean var2 = false;
        if (class65.field802 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class38.method296(null, 0, var3, 0, (byte) 59, null);
            var2 = true;
        }
        long var4 = class437.method2644(-77);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method344(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = 102 % ((arg0 - 36) / 55);
        int var8 = (int) (class437.method2644(-110) - var4);
        var1.method367(0, 100, 0, (byte) 58, -16777216, 100);
        if (var2) {
            var1.method333(true);
        }
        return var8;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lr;I)V", line = 149)
    public static final void method1168(class121 arg0, int arg1) {
        arg0.field1689 = false;
        field2346++;
        if (arg0.field1763 != -1) {
            class267 var2 = class153.field2169.method1585(3, arg0.field1763);
            if (var2 == null || var2.field3919 == null) {
                arg0.field1763 = -1;
                arg0.field1743 = false;
            } else {
                label401: {
                    arg0.field1750++;
                    if (arg0.field1690 < var2.field3919.length && var2.field3940[arg0.field1690] < arg0.field1750) {
                        arg0.field1750 = 1;
                        arg0.field1715++;
                        arg0.field1690++;
                        class20.method183(arg0.field6335, arg0.field1690, arg0.field6328, arg0.field6334, true, var2, class435.field6375 == arg0);
                    }
                    if (arg0.field1690 >= var2.field3919.length) {
                        arg0.field1690 = 0;
                        arg0.field1750 = 0;
                        if (arg0.field1743) {
                            arg0.field1763 = arg0.method969(-1).method3133(true);
                            if (arg0.field1763 == -1) {
                                arg0.field1743 = false;
                                break label401;
                            }
                            var2 = class153.field2169.method1585(3, arg0.field1763);
                        }
                        class20.method183(arg0.field6335, arg0.field1690, arg0.field6328, arg0.field6334, true, var2, class435.field6375 == arg0);
                    }
                    arg0.field1715 = arg0.field1690 + 1;
                    if (var2.field3919.length <= arg0.field1715) {
                        arg0.field1715 = 0;
                    }
                }
            }
        }
        if (arg0.field1707 != -1 && arg0.field1741 <= class263.field3867) {
            class330 var3 = class151.field2145.method2115(-137, arg0.field1707);
            int var4 = var3.field4611;
            if (var4 == -1) {
                arg0.field1707 = -1;
            } else {
                label403: {
                    class267 var5 = class153.field2169.method1585(3, var4);
                    if (var3.field4606) {
                        if (var5.field3922 == 3) {
                            if (arg0.field1783 > 0 && class263.field3867 >= arg0.field1692 && class263.field3867 > arg0.field1698) {
                                arg0.field1707 = -1;
                                break label403;
                            }
                        } else if (var5.field3922 == 1 && arg0.field1783 > 0 && class263.field3867 >= arg0.field1692 && class263.field3867 > arg0.field1698) {
                            arg0.field1741 = class263.field3867 + 1;
                            break label403;
                        }
                    }
                    if (var5 == null || var5.field3919 == null) {
                        arg0.field1707 = -1;
                    } else {
                        if (arg0.field1703 < 0) {
                            arg0.field1703 = 0;
                            class20.method183(arg0.field6335, 0, arg0.field6328, arg0.field6334, true, var5, class435.field6375 == arg0);
                        }
                        arg0.field1712++;
                        if (var5.field3919.length > arg0.field1703 && arg0.field1712 > var5.field3940[arg0.field1703]) {
                            arg0.field1703++;
                            arg0.field1712 = 1;
                            class20.method183(arg0.field6335, arg0.field1703, arg0.field6328, arg0.field6334, true, var5, class435.field6375 == arg0);
                        }
                        if (arg0.field1703 >= var5.field3919.length) {
                            if (var3.field4606) {
                                arg0.field1703 -= var5.field3926;
                                arg0.field1733++;
                                if (var5.field3941 <= arg0.field1733) {
                                    arg0.field1707 = -1;
                                } else if (arg0.field1703 >= 0 && arg0.field1703 < var5.field3919.length) {
                                    class20.method183(arg0.field6335, arg0.field1703, arg0.field6328, arg0.field6334, true, var5, class435.field6375 == arg0);
                                } else {
                                    arg0.field1707 = -1;
                                }
                            } else {
                                arg0.field1707 = -1;
                            }
                        }
                        arg0.field1770 = arg0.field1703 + 1;
                        if (arg0.field1770 >= var5.field3919.length) {
                            if (var3.field4606) {
                                arg0.field1770 -= var5.field3926;
                                if (var5.field3941 <= arg0.field1733 + 1) {
                                    arg0.field1770 = -1;
                                } else if (arg0.field1770 < 0 || var5.field3919.length <= arg0.field1770) {
                                    arg0.field1770 = -1;
                                }
                            } else {
                                arg0.field1770 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1728 != -1 && arg0.field1751 <= class263.field3867) {
            class330 var6 = class151.field2145.method2115(-137, arg0.field1728);
            int var7 = var6.field4611;
            if (var7 == -1) {
                arg0.field1728 = -1;
            } else {
                label406: {
                    class267 var8 = class153.field2169.method1585(3, var7);
                    if (var6.field4606) {
                        if (var8.field3922 == 3) {
                            if (arg0.field1783 > 0 && class263.field3867 >= arg0.field1692 && class263.field3867 > arg0.field1698) {
                                arg0.field1728 = -1;
                                break label406;
                            }
                        } else if (var8.field3922 == 1 && arg0.field1783 > 0 && class263.field3867 >= arg0.field1692 && arg0.field1698 < class263.field3867) {
                            arg0.field1751 = class263.field3867 + 1;
                            break label406;
                        }
                    }
                    if (var8 == null || var8.field3919 == null) {
                        arg0.field1728 = -1;
                    } else {
                        if (arg0.field1697 < 0) {
                            arg0.field1697 = 0;
                            class20.method183(arg0.field6335, 0, arg0.field6328, arg0.field6334, true, var8, class435.field6375 == arg0);
                        }
                        arg0.field1747++;
                        if (arg0.field1697 < var8.field3919.length && arg0.field1747 > var8.field3940[arg0.field1697]) {
                            arg0.field1697++;
                            arg0.field1747 = 1;
                            class20.method183(arg0.field6335, arg0.field1697, arg0.field6328, arg0.field6334, true, var8, class435.field6375 == arg0);
                        }
                        if (arg0.field1697 >= var8.field3919.length) {
                            if (var6.field4606) {
                                arg0.field1697 -= var8.field3926;
                                arg0.field1709++;
                                if (arg0.field1709 >= var8.field3941) {
                                    arg0.field1728 = -1;
                                } else if (arg0.field1697 >= 0 && var8.field3919.length > arg0.field1697) {
                                    class20.method183(arg0.field6335, arg0.field1697, arg0.field6328, arg0.field6334, true, var8, class435.field6375 == arg0);
                                } else {
                                    arg0.field1728 = -1;
                                }
                            } else {
                                arg0.field1728 = -1;
                            }
                        }
                        arg0.field1754 = arg0.field1697 + 1;
                        if (var8.field3919.length <= arg0.field1754) {
                            if (var6.field4606) {
                                arg0.field1754 -= var8.field3926;
                                if ((arg0.field1709 + 1) >= var8.field3941) {
                                    arg0.field1754 = -1;
                                } else if (arg0.field1754 < 0 || var8.field3919.length <= arg0.field1754) {
                                    arg0.field1754 = -1;
                                }
                            } else {
                                arg0.field1754 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1696 != -1 && arg0.field1729 <= 1) {
            class267 var9 = class153.field2169.method1585(3, arg0.field1696);
            if (var9.field3922 == 3) {
                if (arg0.field1783 > 0 && arg0.field1692 <= class263.field3867 && class263.field3867 > arg0.field1698) {
                    arg0.field1696 = -1;
                }
            } else if (var9.field3922 == 1 && arg0.field1783 > 0 && arg0.field1692 <= class263.field3867 && class263.field3867 > arg0.field1698) {
                arg0.field1729 = 2;
            }
        }
        if (arg0.field1696 != -1 && arg0.field1729 == 0) {
            class267 var10 = class153.field2169.method1585(3, arg0.field1696);
            if (var10 == null || var10.field3919 == null) {
                arg0.field1696 = -1;
            } else {
                arg0.field1758++;
                if (arg0.field1745 < var10.field3919.length && arg0.field1758 > var10.field3940[arg0.field1745]) {
                    arg0.field1758 = 1;
                    arg0.field1745++;
                    class20.method183(arg0.field6335, arg0.field1745, arg0.field6328, arg0.field6334, true, var10, class435.field6375 == arg0);
                }
                if (arg0.field1745 >= var10.field3919.length) {
                    arg0.field1745 -= var10.field3926;
                    arg0.field1685++;
                    if (var10.field3941 <= arg0.field1685) {
                        arg0.field1696 = -1;
                    } else if (arg0.field1745 >= 0 && arg0.field1745 < var10.field3919.length) {
                        class20.method183(arg0.field6335, arg0.field1745, arg0.field6328, arg0.field6334, true, var10, class435.field6375 == arg0);
                    } else {
                        arg0.field1696 = -1;
                    }
                }
                arg0.field1742 = arg0.field1745 + 1;
                if (arg0.field1742 >= var10.field3919.length) {
                    arg0.field1742 -= var10.field3926;
                    if ((arg0.field1685 + 1) >= var10.field3941) {
                        arg0.field1742 = -1;
                    } else if (arg0.field1742 < 0 || arg0.field1742 >= var10.field3919.length) {
                        arg0.field1742 = -1;
                    }
                }
                arg0.field1689 = var10.field3939;
            }
        }
        if (arg0.field1729 > 0) {
            arg0.field1729--;
        }
        for (int var11 = 0; var11 < arg0.field1760.length; var11++) {
            class287 var12 = arg0.field1760[var11];
            if (var12 != null) {
                if (var12.field4142 > 0) {
                    var12.field4142--;
                } else {
                    class267 var13 = class153.field2169.method1585(3, var12.field4140);
                    if (var13 == null || var13.field3919 == null) {
                        arg0.field1760[var11] = null;
                    } else {
                        var12.field4143++;
                        if (var13.field3919.length > var12.field4138 && var13.field3940[var12.field4138] < var12.field4143) {
                            var12.field4138++;
                            var12.field4143 = 1;
                            class20.method183(arg0.field6335, var12.field4138, arg0.field6328, arg0.field6334, true, var13, class435.field6375 == arg0);
                        }
                        if (var12.field4138 >= var13.field3919.length) {
                            var12.field4138 -= var13.field3926;
                            var12.field4144++;
                            if (var12.field4144 >= var13.field3941) {
                                arg0.field1760[var11] = null;
                            } else if (var12.field4138 >= 0 && var13.field3919.length > var12.field4138) {
                                class20.method183(arg0.field6335, var12.field4138, arg0.field6328, arg0.field6334, true, var13, class435.field6375 == arg0);
                            } else {
                                arg0.field1760[var11] = null;
                            }
                        }
                        var12.field4141 = var12.field4138 + 1;
                        if (var13.field3919.length <= var12.field4141) {
                            var12.field4141 -= var13.field3926;
                            if (var12.field4144 + 1 >= var13.field3941) {
                                var12.field4141 = -1;
                            } else if (var12.field4141 < 0 || var13.field3919.length <= var12.field4141) {
                                var12.field4141 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -36) {
            field2345 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILiv;)V", line = 575)
    public final void method1169(int arg0, class65 arg1) {
        field2344++;
        if (arg0 != -1) {
            this.method1170(null, -126, -77);
        }
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                return;
            }
            this.method1170(arg1, var3, arg0 + 129);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Liv;II)V", line = 600)
    private final void method1170(class65 arg0, int arg1, int arg2) {
        field2343++;
        if (arg1 == 1) {
            this.field2341 = arg0.method580((byte) 29);
            this.method1165((byte) -127, this.field2341);
        } else if (arg1 == 2) {
            this.field2339 = arg0.method623((byte) -109);
            if (this.field2339 == 65535) {
                this.field2339 = -1;
            }
        } else if (arg1 == 3) {
            this.field2349 = arg0.method623((byte) -59) << 0;
        } else if (arg1 == 4) {
            this.field2338 = false;
        }
        if (arg2 != 128) {
            this.method1170(null, 126, -96);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IILjava/lang/String;)I", line = 642)
    public static final int method1171(int arg0, int arg1, String arg2) {
        if (arg1 > -13) {
            return 18;
        } else {
            field2347++;
            return class433.method2627(false, arg0, true, arg2);
        }
    }
}
