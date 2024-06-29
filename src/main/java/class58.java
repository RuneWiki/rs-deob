import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class58 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Lmt;")
    private class249 field763 = new class249();

    @OriginalMember(owner = "client!al", name = "p", descriptor = "Lmt;")
    private class249 field768 = new class249();

    @OriginalMember(owner = "client!al", name = "A", descriptor = "Lmt;")
    private class249 field779 = new class249();

    @OriginalMember(owner = "client!al", name = "B", descriptor = "Lmt;")
    private class249 field780 = new class249();

    @OriginalMember(owner = "client!al", name = "F", descriptor = "Lrp;")
    private class276 field784 = new class276(4);

    @OriginalMember(owner = "client!al", name = "J", descriptor = "B")
    private byte field788 = 0;

    @OriginalMember(owner = "client!al", name = "L", descriptor = "I")
    public volatile int field790 = 0;

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public volatile int field789 = 0;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "Lrp;")
    private class276 field791 = new class276(8);

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field758 = 104;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "[I")
    public static int[] field774 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
    public static int[] field765 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field776 = 2;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lus;")
    public static class1 field759 = new class1(104, 6);

    @OriginalMember(owner = "client!al", name = "C", descriptor = "Lwf;")
    public static class79 field781 = new class79(50, 0);

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Lkr;")
    public static class486 field785 = new class486();

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!al", name = "H", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "J")
    private long field787;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "Lld;")
    public static class105 field783;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Lwp;")
    public static class109 field766;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Lus;")
    public static class1 field757;

    @OriginalMember(owner = "client!al", name = "N", descriptor = "Lqj;")
    private class325 field792;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Llh;")
    public static class337 field761;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "Llh;")
    private class337 field782;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
    public final void method349(byte arg0) {
        field771++;
        try {
            if (arg0 != 78) {
                this.method360(-122);
            }
            this.field782.method2118(arg0 - 77);
        } catch (Exception var2) {
        }
        this.field782 = null;
        this.field790++;
        this.field789 = -1;
        this.field788 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZIIIB)Lqj;")
    public final class325 method350(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field772++;
        if (arg2 != -1) {
            this.method351(-78);
        }
        long var6 = (long) ((arg3 << 16) + arg1);
        class325 var8 = new class325();
        var8.field4689 = arg4;
        var8.field3397 = arg0;
        var8.field3960 = var6;
        if (arg0) {
            if (this.method358(1) >= 20) {
                throw new RuntimeException();
            }
            this.field763.method1553(-104, var8);
        } else if (this.method359((byte) -108) < 20) {
            this.field779.method1553(-125, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Z")
    public final boolean method351(int arg0) {
        if (arg0 != 15740) {
            this.method363(123);
        }
        field764++;
        return this.method358(1) >= 20;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Llh;ZB)V")
    public final void method352(class337 arg0, boolean arg1, byte arg2) {
        if (this.field782 != null) {
            try {
                this.field782.method2118(1);
            } catch (Exception var9) {
            }
            this.field782 = null;
        }
        field775++;
        this.field782 = arg0;
        this.method361(115);
        this.method353(arg1, (byte) 63);
        this.field791.field4021 = 0;
        this.field792 = null;
        while (true) {
            class325 var4 = (class325) this.field768.method1559(false);
            if (var4 == null) {
                int var5 = -75 % ((15 - arg2) / 45);
                while (true) {
                    class325 var6 = (class325) this.field780.method1559(false);
                    if (var6 == null) {
                        if (this.field788 != 0) {
                            try {
                                this.field784.field4021 = 0;
                                this.field784.method1753(true, 4);
                                this.field784.method1753(true, this.field788);
                                this.field784.method1711(false, 0);
                                this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
                            } catch (IOException var8) {
                                try {
                                    this.field782.method2118(1);
                                } catch (Exception var7) {
                                }
                                this.field790++;
                                this.field782 = null;
                                this.field789 = -2;
                            }
                        }
                        this.field786 = 0;
                        this.field787 = class433.method2562(-2039);
                        return;
                    }
                    this.field779.method1553(-98, var6);
                }
            }
            this.field763.method1553(-123, var4);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
    public final void method353(boolean arg0, byte arg1) {
        field754++;
        if (this.field782 == null) {
            return;
        }
        try {
            this.field784.field4021 = 0;
            this.field784.method1753(true, arg0 ? 2 : 3);
            this.field784.method1734(0, -29401);
            int var3 = -1 / ((arg1 + 32) / 57);
            this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
        } catch (IOException var5) {
            try {
                this.field782.method2118(1);
            } catch (Exception var4) {
            }
            this.field782 = null;
            this.field789 = -2;
            this.field790++;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIII)V")
    public static final void method354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field778++;
        if (class314.field4438.field5798 != 0 && arg1 != 0 && class442.field6125 < 50 && arg0 != -1) {
            class40.field532[class442.field6125] = arg0;
            class339.field4952[class442.field6125] = arg1;
            class242.field3621[class442.field6125] = arg3;
            class318.field4614[class442.field6125] = null;
            class235.field3545[class442.field6125] = 0;
            class306.field4360[class442.field6125] = arg4;
            class442.field6125++;
        }
        if (arg2 != 8) {
            field757 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method355(boolean arg0) {
        field774 = null;
        if (!arg0) {
            field765 = null;
        }
        field757 = null;
        field761 = null;
        field785 = null;
        field759 = null;
        field781 = null;
        field765 = null;
        field766 = null;
        field783 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(Z)Z")
    public final boolean method356(boolean arg0) {
        field767++;
        if (this.field782 != null) {
            long var2 = class433.method2562(-2039);
            int var4 = (int) (var2 - this.field787);
            this.field787 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field786 += var4;
            if (this.field786 > 30000) {
                try {
                    this.field782.method2118(1);
                } catch (Exception var27) {
                }
                this.field782 = null;
            }
        }
        if (arg0) {
            return true;
        } else if (this.field782 == null) {
            return this.method358(1) == 0 && this.method359((byte) -120) == 0;
        } else {
            try {
                this.field782.method2126(true);
                for (class325 var5 = (class325) this.field763.method1558(true); var5 != null; var5 = (class325) this.field763.method1554(-11541)) {
                    this.field784.field4021 = 0;
                    this.field784.method1753(true, 1);
                    this.field784.method1734((int) var5.field3960, -29401);
                    this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
                    this.field768.method1553(-93, var5);
                }
                for (class325 var6 = (class325) this.field779.method1558(true); var6 != null; var6 = (class325) this.field779.method1554(-11541)) {
                    this.field784.field4021 = 0;
                    this.field784.method1753(true, 0);
                    this.field784.method1734((int) var6.field3960, -29401);
                    this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
                    this.field780.method1553(-121, var6);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field782.method2121(true);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field786 = 0;
                    byte var9 = 0;
                    if (this.field792 == null) {
                        var9 = 8;
                    } else if (this.field792.field4691 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - this.field791.field4021;
                        if (var8 < var10) {
                            var10 = var8;
                        }
                        this.field782.method2123(108, this.field791.field4021, this.field791.field4064, var10);
                        if (this.field788 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field791.field4064[this.field791.field4021 + var11] = (byte) class125.method786(this.field791.field4064[this.field791.field4021 + var11], this.field788);
                            }
                        }
                        this.field791.field4021 += var10;
                        if (this.field791.field4021 >= var9) {
                            if (this.field792 == null) {
                                this.field791.field4021 = 0;
                                int var12 = this.field791.method1701(-23121);
                                int var13 = this.field791.method1729(65280);
                                int var14 = this.field791.method1701(-23121);
                                int var15 = this.field791.method1688(20402);
                                int var16 = var14 & 0x7F;
                                boolean var17 = (var14 & 0x80) != 0;
                                long var18 = (long) ((var12 << 16) + var13);
                                Object var20 = null;
                                class325 var21;
                                if (var17) {
                                    for (var21 = (class325) this.field780.method1558(!arg0); var21 != null && var21.field3960 != var18; var21 = (class325) this.field780.method1554(-11541)) {
                                    }
                                } else {
                                    for (var21 = (class325) this.field768.method1558(true); var21 != null && var21.field3960 != var18; var21 = (class325) this.field768.method1554(-11541)) {
                                    }
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                this.field792 = var21;
                                int var22 = var16 == 0 ? 5 : 9;
                                this.field792.field4684 = new class276(var15 + this.field792.field4689 + var22);
                                this.field792.field4684.method1753(true, var16);
                                this.field792.field4684.method1744(var15, true);
                                this.field791.field4021 = 0;
                                this.field792.field4691 = 8;
                            } else if (this.field792.field4691 != 0) {
                                throw new IOException();
                            } else if (this.field791.field4064[0] == -1) {
                                this.field791.field4021 = 0;
                                this.field792.field4691 = 1;
                            } else {
                                this.field792 = null;
                            }
                        }
                    } else {
                        int var23 = this.field792.field4684.field4064.length - this.field792.field4689;
                        int var24 = 512 - this.field792.field4691;
                        if (var23 - this.field792.field4684.field4021 < var24) {
                            var24 = var23 - this.field792.field4684.field4021;
                        }
                        if (var24 > var8) {
                            var24 = var8;
                        }
                        this.field782.method2123(48, this.field792.field4684.field4021, this.field792.field4684.field4064, var24);
                        if (this.field788 != 0) {
                            for (int var25 = 0; var25 < var24; var25++) {
                                this.field792.field4684.field4064[this.field792.field4684.field4021 + var25] = (byte) class125.method786(this.field792.field4684.field4064[this.field792.field4684.field4021 + var25], this.field788);
                            }
                        }
                        this.field792.field4684.field4021 += var24;
                        this.field792.field4691 += var24;
                        if (this.field792.field4684.field4021 == var23) {
                            this.field792.method1673((byte) 27);
                            this.field792.field3393 = false;
                            this.field792 = null;
                        } else if (this.field792.field4691 == 512) {
                            this.field792.field4691 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var28) {
                try {
                    this.field782.method2118(1);
                } catch (Exception var26) {
                }
                this.field782 = null;
                this.field790++;
                this.field789 = -2;
                return this.method358(1) == 0 && this.method359((byte) -127) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public final void method357(byte arg0) {
        field777++;
        if (arg0 > -6) {
            this.method363(-22);
        }
        if (this.field782 == null) {
            return;
        }
        try {
            this.field784.field4021 = 0;
            this.field784.method1753(true, 7);
            this.field784.method1734(0, -29401);
            this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
        } catch (IOException var3) {
            try {
                this.field782.method2118(1);
            } catch (Exception var2) {
            }
            this.field790++;
            this.field782 = null;
            this.field789 = -2;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)I")
    public final int method358(int arg0) {
        field769++;
        return arg0 == 1 ? this.field763.method1556((byte) -113) + this.field768.method1556((byte) -82) : -77;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(B)I")
    private final int method359(byte arg0) {
        field760++;
        if (arg0 > -87) {
            method355(false);
        }
        return this.field779.method1556((byte) 119) + this.field780.method1556((byte) 110);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public final void method360(int arg0) {
        if (arg0 < 76) {
            this.method358(-73);
        }
        if (this.field782 != null) {
            this.field782.method2122((byte) 121);
        }
        field753++;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V")
    private final void method361(int arg0) {
        field756++;
        if (this.field782 == null) {
            return;
        }
        try {
            int var2 = 18 % ((arg0 - 49) / 55);
            this.field784.field4021 = 0;
            this.field784.method1753(true, 6);
            this.field784.method1734(3, -29401);
            this.field782.method2125(4, this.field784.field4064, (byte) -36, 0);
        } catch (IOException var4) {
            try {
                this.field782.method2118(1);
            } catch (Exception var3) {
            }
            this.field789 = -2;
            this.field782 = null;
            this.field790++;
        }
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Z")
    public final boolean method362(int arg0) {
        int var2 = 43 / ((arg0 - 75) / 34);
        field762++;
        return this.method359((byte) -101) >= 20;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V")
    public final void method363(int arg0) {
        if (this.field782 != null) {
            this.field782.method2118(arg0 + 1);
        }
        field773++;
        if (arg0 != 0) {
            this.method358(-107);
        }
    }
}
