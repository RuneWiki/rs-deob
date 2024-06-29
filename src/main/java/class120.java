import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class120 extends class147 {

    @OriginalMember(owner = "client!ma", name = "vc", descriptor = "Lrd;")
    public static class173 field2206 = class133.method843("::fpsoff", -126);

    @OriginalMember(owner = "client!ma", name = "xc", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!ma", name = "wc", descriptor = "Lrd;")
    public static class173 field2207 = class133.method843("scrollen:", -95);

    @OriginalMember(owner = "client!ma", name = "Bc", descriptor = "Lrd;")
    public static class173 field2212 = class133.method843("scrollbar", -66);

    @OriginalMember(owner = "client!ma", name = "Gc", descriptor = "Lrd;")
    public static class173 field2217 = class133.method843("(Y<)4col>", -69);

    @OriginalMember(owner = "client!ma", name = "tc", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!ma", name = "uc", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ma", name = "yc", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!ma", name = "Ac", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!ma", name = "Fc", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ma", name = "zc", descriptor = "Lbc;")
    public static class14 field2210;

    @OriginalMember(owner = "client!ma", name = "Dc", descriptor = "Lwg;")
    public static class222 field2214;

    @OriginalMember(owner = "client!ma", name = "Ec", descriptor = "Led;")
    public class45 field2215;

    @OriginalMember(owner = "client!ma", name = "Cc", descriptor = "[[Z")
    public static boolean[][] field2213;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        ++field2209;
        if (this.field2215 != null) {
            class178 var11 = ~super.field2809 != 0 && ~super.field2763 == -1 ? class167.method1080(11098, super.field2809) : null;
            class178 var12 = super.field2762 == -1 || super.field2815 == super.field2762 && var11 != null ? null : class167.method1080(11098, super.field2762);
            class213 var13 = this.field2215.method315(var12, super.field2789, var11, super.field2752, -1);
            if (var13 != null) {
                var13.method1404();
                super.field758 = var13.field758;
                if (this.field2215.field932 != 0 && ~this.field2215.field950 != -1) {
                    int var14 = class72.field1396[arg0];
                    int var15 = class72.field1404[arg0];
                    short var16 = this.field2215.field932;
                    short var17 = this.field2215.field950;
                    int var18 = -var16 / 2;
                    int var19 = -var17 / 2;
                    int var20 = var14 * var19 - -(var15 * var18) >> 16;
                    int var21 = var15 * var19 + -(var14 * var18) >> 16;
                    int var22 = class56.method361(class172.field3347, super.field2801 + var21, (byte) -124, super.field2820 + var20);
                    int var23 = var16 / 2;
                    int var24 = -var17 / 2;
                    int var25 = var14 * var24 - -(var15 * var23) >> 16;
                    int var26 = var15 * var24 + -(var14 * var23) >> 16;
                    int var27 = class56.method361(class172.field3347, super.field2801 + var26, (byte) -53, super.field2820 + var25);
                    int var28 = -var16 / 2;
                    int var29 = var17 / 2;
                    int var30 = var14 * var29 - -(var15 * var28) >> 16;
                    int var31 = var16 / 2;
                    int var32 = var15 * var29 + -(var14 * var28) >> 16;
                    int var33 = class56.method361(class172.field3347, super.field2801 - -var32, (byte) -83, super.field2820 - -var30);
                    int var34 = ~var22 > ~var27 ? var22 : var27;
                    int var35 = ~var33 < ~var22 ? var22 : var33;
                    int var36 = var17 / 2;
                    int var37 = var15 * var36 - var14 * var31 >> 16;
                    int var38 = var14 * var36 + var15 * var31 >> 16;
                    int var39 = class56.method361(class172.field3347, super.field2801 + var37, (byte) 126, super.field2820 - -var38);
                    int var40 = var39 <= var33 ? var39 : var33;
                    int var41 = (int) (Math.atan2((double) (-var40 + var34), (double) var17) * 320.0D) & 2047;
                    var13.method1399(var41);
                    int var42 = var39 > var27 ? var27 : var39;
                    int var43 = (var34 + var40 + var42 + var35) / 4;
                    int var44 = (int) (Math.atan2((double) (var35 - var42), (double) var16) * 320.0D) & 2047;
                    var13.method1403(var44);
                    var13.method1402(0, var43 - super.field2757, 0);
                }
                class213 var45 = null;
                if (~super.field2778 != 0 && super.field2799 != -1) {
                    var45 = class219.method1427(super.field2778, -116).method790(super.field2799, 63);
                    if (var45 != null) {
                        var45.method1402(0, -super.field2803, 0);
                    }
                }
                if (var45 != null) {
                    var13 = ((class102) var13).method627(var45);
                }
                if (this.field2215.field929 == 1) {
                    var13.field4138 = true;
                }
                var13.method272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Z")
    public final boolean method727(boolean arg0) {
        if (!arg0) {
            return false;
        } else {
            ++field2216;
            return this.field2215 != null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lrd;II)Lrd;")
    public static final class173 method728(int arg0, class173[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; ++var5) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class124.field2340;
            }
            var4 += arg1[arg0 + var5].field3379;
        }
        ++field2211;
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; ++var8) {
            class173 var10 = arg1[arg0 - -var8];
            class85.method553(var10.field3415, 0, var6, var7, var10.field3379);
            var7 += var10.field3379;
        }
        if (arg3 != 124) {
            field2207 = null;
        }
        class173 var9 = new class173();
        var9.field3379 = var4;
        var9.field3415 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method729(KeyEvent arg0, int arg1) {
        ++field2205;
        int var2 = arg0.getKeyChar();
        if (arg1 != -51) {
            return -42;
        } else if (~var2 == -8365) {
            return 128;
        } else {
            if (~var2 >= -1 || ~var2 <= -257) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)V")
    public static void method730(int arg0) {
        field2212 = null;
        field2207 = null;
        if (arg0 != 2) {
            method728(21, (class173[]) null, -26, -101);
        }
        field2217 = null;
        field2210 = null;
        field2213 = null;
        field2214 = null;
        field2206 = null;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
    public static final void method731(int arg0, int arg1) {
        short var2 = 256;
        ++field2204;
        class5.field124 += arg1 * 128;
        if (class5.field124 > class207.field4036.length) {
            class5.field124 -= class207.field4036.length;
            int var3 = (int) (Math.random() * 12.0D);
            class135.method854(class140.field2621[var3], (byte) -102);
        }
        int var4 = arg1 * 128;
        int var5 = (-arg1 + var2) * 128;
        int var6 = 0;
        for (int var7 = 0; var7 < var5; ++var7) {
            int var28 = class66.field1290[var4 + var6] - class207.field4036[var6 - -class5.field124 & class207.field4036.length + -1] * arg1 / 6;
            if (~var28 > -1) {
                var28 = 0;
            }
            class66.field1290[var6++] = var28;
        }
        for (int var8 = -arg1 + var2; var2 > var8; ++var8) {
            int var25 = var8 * 128;
            for (int var26 = 0; ~var26 > -129; ++var26) {
                int var27 = (int) (Math.random() * 100.0D);
                if (~var27 > -51 && ~var26 < -11 && var26 < 118) {
                    class66.field1290[var26 - -var25] = 255;
                } else {
                    class66.field1290[var26 - -var25] = 0;
                }
            }
        }
        if (class208.field4045 > 0) {
            class208.field4045 -= arg1 * 4;
        }
        if (~class11.field181 < -1) {
            class11.field181 -= arg1 * 4;
        }
        if (~class11.field181 == -1 && ~class208.field4045 == -1) {
            int var9 = (int) (Math.random() * (double) (2000 / arg1));
            if (var9 == 1) {
                class208.field4045 = 1024;
            }
            if (~var9 == -1) {
                class11.field181 = 1024;
            }
        }
        int var10 = -93 / ((-5 - arg0) / 46);
        for (int var11 = 0; -arg1 + var2 > var11; ++var11) {
            class12.field196[var11] = class12.field196[var11 - -arg1];
        }
        for (int var12 = var2 - arg1; var2 > var12; ++var12) {
            class12.field196[var12] = (int) (Math.sin((double) class221.field4250 / 14.0D) * 16.0D + 14.0D * Math.sin((double) class221.field4250 / 15.0D) + Math.sin((double) class221.field4250 / 16.0D) * 12.0D);
            ++class221.field4250;
        }
        class153.field2888 += arg1;
        int var13 = ((class217.field4203 & 1) + arg1) / 2;
        if (var13 > 0) {
            for (int var14 = 0; ~(class153.field2888 * 100) < ~var14; ++var14) {
                int var23 = 2 + (int) (124.0D * Math.random());
                int var24 = (int) (128.0D * Math.random()) - -128;
                class66.field1290[(var24 << 7) + var23] = 192;
            }
            class153.field2888 = 0;
            for (int var15 = 0; var2 > var15; ++var15) {
                int var20 = 0;
                int var21 = var15 * 128;
                for (int var22 = -var13; ~var22 > -129; ++var22) {
                    if (~(var13 + var22) > -129) {
                        var20 += class66.field1290[var22 - -var21 + var13];
                    }
                    if (~(var22 + -1 + -var13) <= -1) {
                        var20 -= class66.field1290[var21 + var22 + -var13 + -1];
                    }
                    if (var22 >= 0) {
                        class191.field3738[var21 + var22] = var20 / (var13 * 2 + 1);
                    }
                }
            }
            for (int var16 = 0; var16 < 128; ++var16) {
                int var17 = 0;
                for (int var18 = -var13; ~var2 < ~var18; ++var18) {
                    int var19 = var18 * 128;
                    if (~(var18 - -var13) > ~var2) {
                        var17 += class191.field3738[var13 * 128 + var16 + var19];
                    }
                    if (~(-var13 + var18 - 1) <= -1) {
                        var17 -= class191.field3738[var16 - (var13 - -1) * 128 + var19];
                    }
                    if (var18 >= 0) {
                        class66.field1290[var16 + var19] = var17 / (var13 * 2 + 1);
                    }
                }
            }
        }
    }
}
