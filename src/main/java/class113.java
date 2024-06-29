import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class113 extends class10 {

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    private final int field2015;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    private final int field2009;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    private final int field2006;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    private final int field2003;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field2002 = 128;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lsb;")
    private static class98 field2011 = class47.method368(" from your ignore list first)3", 0);

    @OriginalMember(owner = "client!b", name = "l", descriptor = "Lsb;")
    public static class98 field2001 = field2011;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lgj;")
    public static class226 field2010 = new class226(64);

    @OriginalMember(owner = "client!b", name = "A", descriptor = "I")
    public static int field2016 = 0;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "Lac;")
    public static class188 field1999;

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
    public class113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2015 = arg0;
        this.field2009 = arg1;
        this.field2006 = arg3;
        this.field2003 = arg2;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method846(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class142.method1063((byte) -124, arg6);
        ++field2004;
        int var7 = 0;
        int var8 = -arg2 + arg6;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = -arg6;
        int var10 = arg6;
        int var11 = -var8;
        if (arg5) {
            int var12 = -1;
            int var13 = var8;
            int var14 = -1;
            if (~arg1 <= ~class116.field2077 && ~class215.field3666 <= ~arg1) {
                int[] var15 = class43.field721[arg1];
                int var16 = class47.method369(2, arg3 - arg6, class229.field3933, class106.field1899);
                int var17 = class47.method369(2, arg3 - -arg6, class229.field3933, class106.field1899);
                int var18 = class47.method369(2, -var8 + arg3, class229.field3933, class106.field1899);
                int var19 = class47.method369(2, arg3 + var8, class229.field3933, class106.field1899);
                class37.method305(-7, var15, var18, arg4, var16);
                class37.method305(-7, var15, var19, arg0, var18);
                class37.method305(-7, var15, var17, arg4, var19);
            }
            while (var10 > var7) {
                var12 += 2;
                var9 += var12;
                var14 += 2;
                var11 += var14;
                if (var11 >= 0 && ~var13 <= -2) {
                    --var13;
                    class256.field4534[var13] = var7;
                    var11 -= var13 << 1;
                }
                ++var7;
                if (~var9 <= -1) {
                    --var10;
                    int var20 = arg1 + var10;
                    var9 -= var10 << 1;
                    int var21 = -var10 + arg1;
                    if (class116.field2077 <= var20 && ~class215.field3666 <= ~var21) {
                        if (~var10 <= ~var8) {
                            int var22 = class47.method369(2, arg3 + var7, class229.field3933, class106.field1899);
                            int var23 = class47.method369(2, -var7 + arg3, class229.field3933, class106.field1899);
                            if (class215.field3666 >= var20) {
                                class37.method305(-7, class43.field721[var20], var22, arg4, var23);
                            }
                            if (~class116.field2077 >= ~var21) {
                                class37.method305(-7, class43.field721[var21], var22, arg4, var23);
                            }
                        } else {
                            int var24 = class256.field4534[var10];
                            int var25 = class47.method369(2, arg3 + var7, class229.field3933, class106.field1899);
                            int var26 = class47.method369(2, -var7 + arg3, class229.field3933, class106.field1899);
                            int var27 = class47.method369(2, arg3 + var24, class229.field3933, class106.field1899);
                            int var28 = class47.method369(2, -var24 + arg3, class229.field3933, class106.field1899);
                            if (~var20 >= ~class215.field3666) {
                                int[] var29 = class43.field721[var20];
                                class37.method305(-7, var29, var28, arg4, var26);
                                class37.method305(-7, var29, var27, arg0, var28);
                                class37.method305(-7, var29, var25, arg4, var27);
                            }
                            if (class116.field2077 <= var21) {
                                int[] var30 = class43.field721[var21];
                                class37.method305(-7, var30, var28, arg4, var26);
                                class37.method305(-7, var30, var27, arg0, var28);
                                class37.method305(-7, var30, var25, arg4, var27);
                            }
                        }
                    }
                }
                int var31 = arg1 - -var7;
                int var32 = arg1 - var7;
                if (~var31 <= ~class116.field2077 && ~var32 >= ~class215.field3666) {
                    int var33 = arg3 + var10;
                    int var34 = -var10 + arg3;
                    if (class229.field3933 <= var33 && class106.field1899 >= var34) {
                        int var35 = class47.method369(2, var33, class229.field3933, class106.field1899);
                        int var36 = class47.method369(2, var34, class229.field3933, class106.field1899);
                        if (var7 < var8) {
                            int var37 = var13 < var7 ? class256.field4534[var7] : var13;
                            int var38 = class47.method369(2, arg3 + var37, class229.field3933, class106.field1899);
                            int var39 = class47.method369(2, -var37 + arg3, class229.field3933, class106.field1899);
                            if (~var31 >= ~class215.field3666) {
                                int[] var40 = class43.field721[var31];
                                class37.method305(-7, var40, var39, arg4, var36);
                                class37.method305(-7, var40, var38, arg0, var39);
                                class37.method305(-7, var40, var35, arg4, var38);
                            }
                            if (var32 >= class116.field2077) {
                                int[] var41 = class43.field721[var32];
                                class37.method305(-7, var41, var39, arg4, var36);
                                class37.method305(-7, var41, var38, arg0, var39);
                                class37.method305(-7, var41, var35, arg4, var38);
                            }
                        } else {
                            if (var31 <= class215.field3666) {
                                class37.method305(-7, class43.field721[var31], var35, arg4, var36);
                            }
                            if (~var32 <= ~class116.field2077) {
                                class37.method305(-7, class43.field721[var32], var35, arg4, var36);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(II)V")
    public static final void method847(int arg0, int arg1) {
        if (arg1 == -1075092692) {
            class211.field3606.method1561(-66, arg0);
            ++field2014;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(IZI)V")
    public final void method102(int arg0, boolean arg1, int arg2) {
        ++field2005;
        int var4 = this.field2003 * arg0 >> 12;
        if (arg1) {
            this.method101(11, false, 27);
        }
        int var5 = this.field2015 * arg0 >> 12;
        int var6 = this.field2009 * arg2 >> 12;
        int var7 = this.field2006 * arg2 >> 12;
        class183.method1263(var5, var4, var6, var7, (byte) 36, super.field216, super.field211, super.field213);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IZI)V")
    public final void method101(int arg0, boolean arg1, int arg2) {
        int var4 = this.field2003 * arg0 >> 12;
        ++field2013;
        int var5 = this.field2009 * arg2 >> 12;
        int var6 = this.field2015 * arg0 >> 12;
        int var7 = this.field2006 * arg2 >> 12;
        if (arg1) {
            class191.method1323(var7, super.field213, super.field211, var6, var5, 14, var4);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static void method848(boolean arg0) {
        if (arg0) {
            field2016 = 60;
        }
        field2011 = null;
        field1999 = null;
        field2001 = null;
        field2010 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method849(int arg0) {
        if (arg0 == 4) {
            ++field2008;
            class45.method360();
            for (int var1 = 0; var1 < 4; ++var1) {
                class110.field1961[var1].method518((byte) 78);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
    public final void method94(int arg0, int arg1, int arg2) {
        int var4 = this.field2015 * arg0 >> 12;
        ++field2007;
        if (arg2 == -1) {
            int var5 = this.field2006 * arg1 >> 12;
            int var6 = this.field2003 * arg0 >> 12;
            int var7 = this.field2009 * arg1 >> 12;
            class8.method59(var5, var6, super.field216, var7, 0, var4);
        }
    }
}
