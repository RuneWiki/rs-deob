import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class291 extends class252 {

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field4765 = 0;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
    public static int[] field4766 = new int[1000];

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4769 = "M";

    @OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
    public static int field4776 = 0;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public int field4763;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "Ljava/lang/String;")
    public String field4774;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)J")
    public final long method2003(int arg0) {
        ++field4772;
        return arg0 != 0 ? -16L : super.field4135 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lfj;Z)Lib;")
    public static final class162 method2004(class274 arg0, boolean arg1) {
        if (!arg1) {
            method2004((class274) null, false);
        }
        ++field4760;
        return new class162(arg0.method1847(-404), arg0.method1847(-404), arg0.method1847(-404), arg0.method1847(-404), arg0.method1812(arg1), arg0.method1812(true), arg0.method1849(255));
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)V")
    public static void method2005(int arg0) {
        field4769 = null;
        if (arg0 > -5) {
            method2012(65);
        }
        field4766 = null;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)I")
    public final int method2006(byte arg0) {
        ++field4771;
        int var2 = -125 % ((7 - arg0) / 44);
        return (int) super.field2209;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)I")
    public final int method2007(byte arg0) {
        if (arg0 != -88) {
            this.field4768 = 52;
        }
        ++field4770;
        return (int) (super.field2209 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZ)I")
    public static final int method2008(int arg0, boolean arg1) {
        if (!arg1) {
            field4766 = null;
        }
        ++field4775;
        return (arg0 & 261198) >> 11;
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V")
    public final void method2009(int arg0) {
        ++field4761;
        super.field4135 |= Long.MIN_VALUE;
        if (~this.method2003(0) == -1L) {
            class95.field1503.method388(this, false);
        }
        if (arg0 >= -33) {
            this.field4774 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V")
    public final void method2010(int arg0) {
        super.field4135 = Long.MIN_VALUE & super.field4135 | 500L + class264.method1778(6573);
        ++field4767;
        if (arg0 != 0) {
            this.method2003(-17);
        }
        class71.field1143.method388(this, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZI)V")
    public static final void method2011(boolean arg0, int arg1) {
        if (arg1 != -30310) {
            field4765 = 10;
        }
        ++field4764;
        class71.method493(arg0, class68.field1089, class154.field2463, arg1 + 30225, class195.field3161);
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
    public static final void method2012(int arg0) {
        for (int var1 = 0; ~class57.field830 < ~var1; ++var1) {
            int var2 = class189.field3100[var1];
            class104 var3 = class131.field2113[var2];
            int var4 = class229.field3584.method1849(255);
            if (~(var4 & 1) != -1) {
                var4 += class229.field3584.method1849(255) << 8;
            }
            if ((var4 & 128) != 0) {
                int var5 = class229.field3584.method1871((byte) -33);
                int var6 = class229.field3584.method1871((byte) -33);
                var3.method398(var5, var6, 0, class274.field4472);
                var3.field937 = class274.field4472 - -300;
                var3.field949 = class229.field3584.method1854(false);
            }
            if ((var4 & 64) != 0) {
                var3.field974 = class229.field3584.method1855(-40);
                var3.field914 = 100;
            }
            if (~(256 & var4) != -1) {
                var3.field898 = class229.field3584.method1867((byte) -106);
                var3.field895 = class229.field3584.method1867((byte) -115);
            }
            if ((512 & var4) != 0) {
                int var7 = class229.field3584.method1849(255);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; ++var11) {
                    int var12 = class229.field3584.method1867((byte) -122);
                    if (~var12 == -65536) {
                        var12 = -1;
                    }
                    var10[var11] = var12;
                    var8[var11] = class229.field3584.method1871((byte) -33);
                    var9[var11] = class229.field3584.method1815(arg0 + -447);
                }
                class159.method1090(var3, var9, var10, var8, (byte) -95);
            }
            if ((var4 & 16) != 0) {
                var3.field998 = class229.field3584.method1829(71);
                if (~var3.field998 == -65536) {
                    var3.field998 = -1;
                }
            }
            if ((8 & var4) != 0) {
                int var13 = class229.field3584.method1849(arg0 + -95);
                int var14 = class229.field3584.method1849(255);
                var3.method398(var13, var14, arg0 + -350, class274.field4472);
            }
            if ((var4 & 32) != 0) {
                int var15 = class229.field3584.method1837(252);
                if (~var15 == -65536) {
                    var15 = -1;
                }
                int var16 = class229.field3584.method1871((byte) -33);
                class52.method329(var3, var15, 4, var16);
            }
            if (~(var4 & 4) != -1) {
                if (var3.field1645.method1647((byte) -102)) {
                    class123.method848(var3, (byte) -95);
                }
                var3.method743(class206.method1422(class229.field3584.method1829(-119), (byte) 34), (byte) -118);
                var3.method408(arg0 ^ 345, var3.field1645.field3789);
                var3.field897 = var3.field1645.field3822;
                var3.field933 = var3.field1645.field3804;
                if (var3.field1645.method1647((byte) -102)) {
                    class29.method231(-19232, var3, var3.field965[0], (class12) null, var3.field956[0], class214.field3389, (class172) null, 0);
                }
            }
            if ((2 & var4) != 0) {
                int var17 = class229.field3584.method1837(arg0 + -98);
                int var18 = class229.field3584.method1848((byte) -124);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                boolean var19 = true;
                if (var17 != -1 && var3.field995 != -1 && ~class159.method1085((byte) -63, class166.method1182(arg0 + -349, var17).field2486).field1447 > ~class159.method1085((byte) -63, class166.method1182(1, var3.field995).field2486).field1447) {
                    var19 = false;
                }
                if (var19) {
                    var3.field979 = 0;
                    var3.field901 = var18 >> 16;
                    var3.field911 = 0;
                    var3.field995 = var17;
                    var3.field919 = 1;
                    var3.field896 = (65535 & var18) + class274.field4472;
                    if (class274.field4472 < var3.field896) {
                        var3.field911 = -1;
                    }
                    if (~var3.field995 != 0 && class274.field4472 == var3.field896) {
                        int var20 = class166.method1182(1, var3.field995).field2486;
                        if (var20 != -1) {
                            class91 var21 = class159.method1085((byte) -63, var20);
                            if (var21 != null && var21.field1434 != null) {
                                class252.method1710(0, var3.field929, var21, var3.field994, false, 59);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 350) {
            field4765 = 55;
        }
        ++field4762;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
    public class291(int arg0, int arg1) {
        super.field2209 = (long) arg1 | (long) arg0 << 32;
    }
}
