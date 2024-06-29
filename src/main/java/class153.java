import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class153 {

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
    public static boolean field2116 = false;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2117 = "Drop";

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field2125 = new Random();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "J")
    public static long field2128 = 0L;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lqc;")
    public static class99 field2126 = new class99(32);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "J")
    public static long field2131 = 0L;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field2130 = -1;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public int field2118;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Ldc;")
    public static class75 field2113;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Ljava/awt/Image;")
    public Image field2119;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "[I")
    public int[] field2120;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[Lpn;")
    public static class170[] field2127;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZILfj;)V", line = 4)
    public static final void method1103(int arg0, boolean arg1, int arg2, class241 arg3) {
        if ((arg2 & 0x100) != 0) {
            int var4 = class157.field2165.method2193(49152);
            int var5 = class157.field2165.method2183(-86);
            arg3.method1751(-105, var5, class329.field4966, var4);
        }
        field2114++;
        if ((arg2 & 0x200) != 0) {
            int var6 = class157.field2165.method2183(-120);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = class157.field2165.method2160(125);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var8[var10] = var11;
                var7[var10] = class157.field2165.method2219(16448);
                var9[var10] = class157.field2165.method2168((byte) -114);
            }
            class47.method301(var8, var7, (byte) 87, arg3, var9);
        }
        if ((arg2 & 0x20) != 0) {
            arg3.field3757 = class157.field2165.method2168((byte) -119);
            arg3.field3690 = class157.field2165.method2190((byte) 121);
        }
        if ((arg2 & 0x10) != 0) {
            int var12 = class157.field2165.method2183(43);
            byte[] var13 = new byte[var12];
            class316 var14 = new class316(var13);
            class157.field2165.method2181((byte) 120, var12, var13, 0);
            class74.field1023[arg0] = var14;
            arg3.method1644(var14, -29162);
        }
        if ((arg2 & 0x1) != 0) {
            int var15 = class157.field2165.method2193(49152);
            int var16 = class157.field2165.method2204(85);
            arg3.method1751(-111, var16, class329.field4966, var15);
            arg3.field3707 = class329.field4966 + 300;
            arg3.field3661 = class157.field2165.method2204(96);
        }
        if ((arg2 & 0x400) != 0) {
            int var17 = class157.field2165.method2220((byte) 108);
            if (var17 == 65535) {
                var17 = -1;
            }
            int var18 = class157.field2165.method2215((byte) -111);
            boolean var19 = true;
            if (var17 != -1 && arg3.field3715 != -1 && class52.method361(true, class336.method2329(-49, var17).field4662).field1684 < class52.method361(true, class336.method2329(-79, arg3.field3715).field4662).field1684) {
                var19 = false;
            }
            if (var19) {
                arg3.field3713 = 1;
                arg3.field3692 = var18 >> 16;
                arg3.field3737 = 0;
                arg3.field3710 = (var18 & 0xFFFF) + class329.field4966;
                arg3.field3718 = 0;
                if (arg3.field3710 > class329.field4966) {
                    arg3.field3737 = -1;
                }
                arg3.field3715 = var17;
                if (arg3.field3715 != -1 && class329.field4966 == arg3.field3710) {
                    int var20 = class336.method2329(-91, arg3.field3715).field4662;
                    if (var20 != -1) {
                        class125 var21 = class52.method361(true, var20);
                        if (var21 != null && var21.field1707 != null) {
                            class241.method1651(0, class173.field2356 == arg3, arg3.field3745, var21, arg3.field3679, 113);
                        }
                    }
                }
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field3676 = class157.field2165.method2220((byte) 54);
            if (arg3.field3676 == 65535) {
                arg3.field3676 = -1;
            }
        }
        if ((arg2 & 0x4) != 0) {
            int var22 = class157.field2165.method2220((byte) 60);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = class157.field2165.method2219(16448);
            class6.method33(arg3, -3478, var23, var22);
        }
        if ((arg2 & 0x800) != 0) {
            arg3.field3694 = class157.field2165.method2219(16448);
            arg3.field3685 = class157.field2165.method2183(-62);
            arg3.field3735 = class157.field2165.method2204(101);
            arg3.field3671 = class157.field2165.method2183(-120);
            arg3.field3758 = class157.field2165.method2160(88) + class329.field4966;
            arg3.field3701 = class157.field2165.method2160(126) + class329.field4966;
            arg3.field3705 = class157.field2165.method2204(124);
            arg3.field3727 = 0;
            arg3.field3743 = 1;
        }
        if (arg1) {
            return;
        }
        if ((arg2 & 0x8) != 0) {
            arg3.field3739 = class157.field2165.method2158(-872702056);
            if (arg3.field3739.charAt(0) == '~') {
                arg3.field3739 = arg3.field3739.substring(1);
                class93.method695((byte) -109, 2, arg3.field3739, arg3.method1656(-1));
            } else if (class173.field2356 == arg3) {
                class93.method695((byte) 105, 2, arg3.field3739, arg3.method1656(-1));
            }
            arg3.field3763 = 0;
            arg3.field3765 = 0;
            arg3.field3677 = 150;
        }
        if ((arg2 & 0x80) == 0) {
            return;
        }
        int var24 = class157.field2165.method2168((byte) -125);
        int var25 = class157.field2165.method2183(88);
        boolean var26 = (var24 & 0x8000) != 0;
        int var27 = class157.field2165.method2219(16448);
        int var28 = class157.field2165.field4777;
        if (arg3.field3439 != null && arg3.field3422 != null) {
            boolean var29 = false;
            long var30 = class77.method584(arg3.field3439, 78);
            if (var25 <= 1) {
                if (!var26 && (class45.field555 && !class162.field2228 || class72.field998)) {
                    var29 = true;
                } else {
                    for (int var32 = 0; var32 < class64.field826; var32++) {
                        if (class143.field1966[var32] == var30) {
                            var29 = true;
                            break;
                        }
                    }
                }
            }
            if (!var29 && class88.field1250 == 0) {
                class272.field4076.field4777 = 0;
                int var33 = -1;
                class157.field2165.method2181((byte) 111, var27, class272.field4076.field4798, 0);
                class272.field4076.field4777 = 0;
                String var35;
                if (var26) {
                    var24 &= 0x7FFF;
                    class83 var34 = class230.method1596(class272.field4076, -665979312);
                    var33 = var34.field1204;
                    var35 = var34.field1200.method1967((byte) 113, class272.field4076);
                } else {
                    var35 = class277.method1903(class293.method2001((byte) -97, class175.method1216(class272.field4076, -73)));
                }
                arg3.field3739 = var35.trim();
                arg3.field3677 = 150;
                arg3.field3763 = var24 >> 8;
                arg3.field3765 = var24 & 0xFF;
                if (var25 == 2) {
                    class141.method1021(var35, "<img=1>" + arg3.method1656(-1), var33, -117, (String) null, var26 ? 17 : 1);
                } else if (var25 == 1) {
                    class141.method1021(var35, "<img=0>" + arg3.method1656(-1), var33, -99, (String) null, var26 ? 17 : 1);
                } else {
                    class141.method1021(var35, arg3.method1656(-1), var33, -37, (String) null, var26 ? 17 : 2);
                }
            }
        }
        class157.field2165.field4777 = var27 + var28;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)V", line = 285)
    public static final void method1104(int arg0, int arg1, int arg2) {
        class192 var3 = class246.field3544[class251.field3603][arg0][arg2];
        field2123++;
        if (var3 == null) {
            class297.method2020(class251.field3603, arg0, arg2);
            return;
        }
        int var4 = arg1;
        class168 var5 = null;
        for (class168 var6 = (class168) var3.method1335(1); var6 != null; var6 = (class168) var3.method1336(3)) {
            class198 var7 = class115.method854((byte) 100, var6.field2288.field3227);
            int var8 = var7.field2806;
            if (var7.field2818 == 1) {
                var8 = (var6.field2288.field3226 + 1) * var8;
            }
            if (var4 < var8) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class297.method2020(class251.field3603, arg0, arg2);
            return;
        }
        class224 var9 = null;
        class224 var10 = null;
        var3.method1343(var5, -109);
        for (class168 var11 = (class168) var3.method1335(1); var11 != null; var11 = (class168) var3.method1336(3)) {
            class224 var12 = var11.field2288;
            if (var5.field2288.field3227 != var12.field3227) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field3227 != var12.field3227 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        long var13 = (long) ((arg2 << 7) + arg0 + 1610612736);
        class85.method659(class251.field3603, arg0, arg2, class135.method985(arg2 * 128 + 64, class251.field3603, arg0 * 128 + 64, (byte) -95), var5.field2288, var13, var9, var10);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)Lwj;", line = 360)
    public static final class302 method1106(int arg0, byte arg1) {
        field2122++;
        class302 var2 = (class302) class23.field295.method716((long) arg0, false);
        if (arg1 > -58) {
            field2128 = 10L;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class45.field556.method955(class17.method116(arg0, 1), class294.method2008((byte) 76, arg0), -21853);
        class302 var4 = new class302();
        var4.field4549 = arg0;
        if (var3 != null) {
            var4.method2065(new class316(var3), -124);
        }
        var4.method2063((byte) -117);
        if (var4.field4546) {
            var4.field4506 = false;
            var4.field4530 = 0;
        }
        if (!class271.field4048 && var4.field4551) {
            var4.field4514 = null;
        }
        class23.field295.method721((long) arg0, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIZIII)V", line = 404)
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field2121++;
        int var12 = arg2 - arg5;
        int var13 = arg11 - arg3;
        if (arg9 > -35) {
            return;
        }
        int var14 = -1;
        int var15 = 983040 / arg1;
        int var16 = 983040 / arg6;
        if (class129.field1776 > 0) {
            if (class162.field2229 <= 10) {
                var14 = class162.field2229 * 5;
            } else {
                var14 = 50 + 50 - (class162.field2229 * 5);
            }
        }
        for (int var17 = -var15; var17 < (var12 + var15); var17++) {
            int var18 = arg1 * var17 + arg10 >> 16;
            int var19 = (var17 + 1) * arg1 + arg10 >> 16;
            int var20 = var19 - var18;
            if (var20 > 0) {
                int var21 = arg0 + var18;
                int var10000 = arg0 + var19;
                int var23 = var17 + arg5 >> 6;
                if (var23 >= 0 && class21.field266.length - 1 >= var23) {
                    int[][] var24 = class21.field266[var23];
                    for (int var25 = -var16; var25 < var13 + var16; var25++) {
                        int var26 = (var25 + 1) * arg6 + arg7 >> 16;
                        int var27 = arg6 * var25 + arg7 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            var10000 = arg4 + var26;
                            int var30 = arg3 + var25 >> 6;
                            int var31 = arg4 + var27;
                            if (var30 >= 0 && var30 <= (var24.length - 1) && var24[var30] != null) {
                                int var32 = ((arg3 + var25 & 0x3F) << 6) + (var17 + arg5 & 0x3F);
                                int var33 = var24[var30][var32];
                                if (var33 != 0) {
                                    class302 var34 = method1106(var33 - 1, (byte) -93);
                                    if (!class36.field418[var34.field4529]) {
                                        if (var14 != -1 && class61.field813 == var34.field4529) {
                                            class30 var35 = new class30();
                                            var35.field367 = var21;
                                            var35.field365 = var34.field4529;
                                            var35.field369 = var31;
                                            class334.field5036.method1339((byte) -108, var35);
                                        } else {
                                            class78.field1125[var34.field4529].method840(var21 - 7, var31 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class30 var36 = (class30) class334.field5036.method1335(1); var36 != null; var36 = (class30) class334.field5036.method1336(3)) {
            class38.method219(var36.field367, var36.field369, 15, 16776960, var14);
            class38.method219(var36.field367, var36.field369, 13, 16776960, var14);
            class38.method219(var36.field367, var36.field369, 11, 16776960, var14);
            class38.method219(var36.field367, var36.field369, 9, 16776960, var14);
            class78.field1125[var36.field365].method840(var36.field367 - 7, var36.field369 - 7);
        }
        class334.field5036.method1345(-69);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 530)
    public static void method1108(byte arg0) {
        field2127 = null;
        int var1 = 28 / ((arg0 + 7) / 46);
        field2117 = null;
        field2113 = null;
        field2126 = null;
        field2125 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V", line = 552)
    public final void method1111(byte arg0) {
        class38.method228(this.field2120, this.field2118, this.field2124);
        field2112++;
        if (arg0 <= 117) {
            this.field2119 = (Image) null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 564)
    protected class153() {
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public abstract void method1105(int arg0, int arg1, byte arg2, Component arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method1109(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Graphics;IBIII)V")
    public abstract void method1110(Graphics arg0, int arg1, byte arg2, int arg3, int arg4, int arg5);
}
