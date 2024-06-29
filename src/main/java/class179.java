import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class179 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "F")
    public float field2865 = 0.25F;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "F")
    public float field2864 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "F")
    public float field2873 = 1.0F;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "F")
    public float field2866;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "F")
    public float field2862;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public int field2863;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public int field2872;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    public int field2876;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "F")
    public float field2860;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public int field2867;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lwc;")
    public class185 field2871;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1405(int arg0) {
        class308.field4917 = null;
        class150.method1161();
        field2877++;
        if (arg0 > 59) {
            ;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method1406(int arg0, boolean arg1) {
        field2861++;
        if (arg1 && class174.field2777 != null) {
            class264.field4432 = class174.field2777.field1684;
        } else {
            class264.field4432 = -1;
        }
        class206.field3260 = null;
        class35.field509 = 0;
        class174.field2786 = (int[][][]) null;
        class174.field2798 = (byte[][][]) null;
        class174.field2791 = (byte[][][]) null;
        class174.field2787 = null;
        class174.field2784 = (byte[][][]) null;
        if (arg0 != 16) {
            method1406(17, false);
        }
        class174.field2789 = (int[][][]) null;
        class308.field4909 = null;
        class174.field2795 = (byte[][][]) null;
        class174.field2777 = null;
        class174.field2792 = (byte[][][]) null;
        class174.field2782.method915((byte) 83);
        class11.field91 = null;
        class353.field5608 = null;
        class109.field1796 = null;
        class330.field5242 = null;
        class198.field3162 = -1;
        class311.field4963 = null;
        class138.field2280 = null;
        class2.field7 = -1;
        class172.field2744 = null;
        class174.field2775 = null;
        class222.field3651 = null;
        class109.field1801 = null;
        class213.field3409 = null;
        class307.method2183(-20851);
        class353.field5601 = null;
        class327.field5194 = null;
        class193.field3074 = null;
        class160.method1248(-108, 64, 128);
        class93.method729(64, -111, 64);
        class342.method2416((byte) 56, 64);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljh;BI)V", line = 69)
    public static final void method1407(class258 arg0, byte arg1, int arg2) {
        field2868++;
        class170 var3 = (class170) class243.field3995.method1268(7, (long) arg2);
        if (arg1 < 112 || var3 == null) {
            return;
        }
        if (var3.field2713 != null) {
            class245.field4030.method2163(var3.field2713);
            var3.field2713 = null;
        }
        var3.method330(15);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V", line = 377)
    public class179() {
        this.field2870 = -50;
        this.field2866 = 0.69921875F;
        this.field2862 = 1.1523438F;
        this.field2863 = -50;
        this.field2872 = class167.field2661;
        this.field2876 = -60;
        this.field2859 = class167.field2657;
        this.field2860 = 1.2F;
        this.field2867 = 0;
        if (class112.field1833 != null) {
            this.field2871 = class185.method1455(class112.field1833[0], class112.field1833[1], class112.field1833[2], class112.field1833[3], class112.field1833[4], class112.field1833[5]);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lqm;)V", line = 396)
    public class179(class227 arg0) {
        int var2 = arg0.method1720((byte) -106);
        if ((var2 & 0x1) == 0) {
            this.field2872 = class167.field2661;
        } else {
            this.field2872 = arg0.method1715((byte) 47);
        }
        if ((var2 & 0x2) == 0) {
            this.field2862 = 1.1523438F;
        } else {
            this.field2862 = (float) arg0.method1765(true) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field2866 = 0.69921875F;
        } else {
            this.field2866 = (float) arg0.method1765(true) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field2860 = 1.2F;
        } else {
            this.field2860 = (float) arg0.method1765(true) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field2870 = -50;
            this.field2876 = -60;
            this.field2863 = -50;
        } else {
            this.field2870 = arg0.method1769(-30726);
            this.field2876 = arg0.method1769(-30726);
            this.field2863 = arg0.method1769(-30726);
        }
        if ((var2 & 0x20) == 0) {
            this.field2859 = class167.field2657;
        } else {
            this.field2859 = arg0.method1715((byte) -117);
        }
        if ((var2 & 0x40) == 0) {
            this.field2867 = 0;
        } else {
            this.field2867 = arg0.method1765(true);
        }
        if ((var2 & 0x80) != 0) {
            this.field2871 = class185.method1455(arg0.method1765(true), arg0.method1765(true), arg0.method1765(true), arg0.method1765(true), arg0.method1765(true), arg0.method1765(true));
        } else if (class112.field1833 != null) {
            this.field2871 = class185.method1455(class112.field1833[0], class112.field1833[1], class112.field1833[2], class112.field1833[3], class112.field1833[4], class112.field1833[5]);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIBIIIII)V", line = 114)
    public static final void method1408(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2869++;
        if (arg2 != 116) {
            return;
        }
        int var8 = arg1 - 334;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 2048 - arg7 & 0x7FF;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var11 = (class347.field5526 - class125.field2137) * var8 / 100 + class125.field2137;
        int var12 = 0;
        int var13 = arg5 * var11 >> 8;
        int var14 = var13;
        int var15 = 0;
        if (var9 != 0) {
            int var16 = class153.field2445[var9];
            int var17 = class153.field2438[var9];
            var15 = -var13 * var17 >> 16;
            var14 = var13 * var16 >> 16;
        }
        if (var10 != 0) {
            int var18 = class153.field2438[var10];
            var12 = var14 * var18 >> 16;
            int var19 = class153.field2445[var10];
            var14 = var14 * var19 >> 16;
        }
        class194.field3095 = arg0;
        class229.field3807 = arg6 - var14;
        class176.field2818 = arg7;
        class206.field3250 = arg4 - var15;
        class281.field4617 = arg3 - var12;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ltb;IIIIIIIZ)V", line = 176)
    public static final void method1409(class232 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class291.field4713;
        int var11;
        int var12 = var11 = (arg7 << 7) - class36.field550;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class101.field1656[arg1][arg6][arg7] - class66.field1175;
        int var18 = class101.field1656[arg1][arg6 + 1][arg7] - class66.field1175;
        int var19 = class101.field1656[arg1][arg6 + 1][arg7 + 1] - class66.field1175;
        int var20 = class101.field1656[arg1][arg6][arg7 + 1] - class66.field1175;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class153.field2436;
        int var46 = (var24 << 9) / var25 + class153.field2441;
        int var47 = (var27 << 9) / var31 + class153.field2436;
        int var48 = (var30 << 9) / var31 + class153.field2441;
        int var49 = (var33 << 9) / var37 + class153.field2436;
        int var50 = (var36 << 9) / var37 + class153.field2441;
        int var51 = (var39 << 9) / var43 + class153.field2436;
        int var52 = (var42 << 9) / var43 + class153.field2441;
        class153.field2434 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class253.field4274 && class20.method121(class296.field4759 + class153.field2436, class235.field3908 + class153.field2441, var50, var52, var48, var49, var51, var47)) {
                class295.field4754 = arg6;
                class74.field1266 = arg7;
            }
            if (!class42.field607 && !arg8) {
                class153.field2433 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class153.field2442 || var51 > class153.field2442 || var47 > class153.field2442) {
                    class153.field2433 = true;
                }
                if (arg0.field3842 == -1) {
                    if (arg0.field3852 != 12345678) {
                        class153.method1194(var50, var52, var48, var49, var51, var47, arg0.field3852, arg0.field3851, arg0.field3845);
                    }
                } else if (!class75.field1272) {
                    int var53 = class153.field2439.method770(arg0.field3842, 106);
                    class153.method1194(var50, var52, var48, var49, var51, var47, class286.method2084(var53, arg0.field3852), class286.method2084(var53, arg0.field3851), class286.method2084(var53, arg0.field3845));
                } else if (arg0.field3848) {
                    class153.method1182(var50, var52, var48, var49, var51, var47, arg0.field3852, arg0.field3851, arg0.field3845, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3842);
                } else {
                    class153.method1182(var50, var52, var48, var49, var51, var47, arg0.field3852, arg0.field3851, arg0.field3845, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3842);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class253.field4274 && class20.method121(class296.field4759 + class153.field2436, class235.field3908 + class153.field2441, var46, var48, var52, var45, var47, var51)) {
            class295.field4754 = arg6;
            class74.field1266 = arg7;
        }
        if (class42.field607 || arg8) {
            return;
        }
        class153.field2433 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class153.field2442 || var47 > class153.field2442 || var51 > class153.field2442) {
            class153.field2433 = true;
        }
        if (arg0.field3842 == -1) {
            if (arg0.field3844 != 12345678) {
                class153.method1194(var46, var48, var52, var45, var47, var51, arg0.field3844, arg0.field3845, arg0.field3851);
            }
        } else if (class75.field1272) {
            class153.method1182(var46, var48, var52, var45, var47, var51, arg0.field3844, arg0.field3845, arg0.field3851, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3842);
        } else {
            int var54 = class153.field2439.method770(arg0.field3842, 110);
            class153.method1194(var46, var48, var52, var45, var47, var51, class286.method2084(var54, arg0.field3844), class286.method2084(var54, arg0.field3845), class286.method2084(var54, arg0.field3851));
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLth;I)[Lml;", line = 335)
    public static final class17[] method1410(int arg0, boolean arg1, class57 arg2, int arg3) {
        field2875++;
        if (arg1) {
            return class315.method2233(arg3, (byte) 111, arg2, arg0) ? class205.method1566((byte) -128) : null;
        } else {
            return (class17[]) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLqm;)V", line = 366)
    public final void method1411(boolean arg0, class227 arg1) {
        if (arg0) {
            field2874++;
            this.field2873 = (float) (arg1.method1720((byte) -92) * 8) / 255.0F;
            this.field2865 = (float) (arg1.method1720((byte) -114) * 8) / 255.0F;
            this.field2864 = (float) (arg1.method1720((byte) -110) * 8) / 255.0F;
        }
    }
}
