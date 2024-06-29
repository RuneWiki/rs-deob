import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class109 {

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1777 = "purple:";

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field1776;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Ldp;")
    public static class174 field1780;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tn", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field1790;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static final void method954(byte arg0) {
        field1775++;
        if (arg0 != -94) {
            field1777 = null;
        }
        if (class230.field3365 < 0) {
            return;
        }
        long var1 = class10.method63(-21149);
        class230.field3365 = (int) ((long) class230.field3365 - (var1 - class281.field4213));
        if (class230.field3365 > 0) {
            int var3 = (class230.field3365 << 8) / class190.field2823;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class52.field852 = ((class50.field802 & 0xFF00FF) * var3 + (class409.field5972.field4246 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class50.field802 & 0xFF00) * var3 + (class409.field5972.field4246 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class157.field2383 = ((class158.field2404 & 0xFF00FF) * var3 + ((class409.field5972.field4234 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class158.field2404 & 0xFF00) * var3 + (class409.field5972.field4234 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class376.field5328 = (class409.field5972.field4236 - class66.field1054) * var6 + class66.field1054;
            class37.field545 = (class409.field5972.field4239 - class441.field6413) * var6 + class441.field6413;
            class435.field6343 = (class409.field5972.field4242 - class128.field2089) * var6 + class128.field2089;
            class185.field2721 = (class409.field5972.field4241 - class162.field2454) * var6 + class162.field2454;
            class257.field3711 = class30.field443 * var3 + class409.field5972.field4244 * var4 >> 8;
            class152.field2321 = (class409.field5972.field4232 - class88.field1409) * var6 + class88.field1409;
            class113.field1822 = (class409.field5972.field4238 - class158.field2417) * var6 + class158.field2417;
            if (class428.field6202 != class409.field5972.field4240) {
                class84.field1369 = class122.field1928.method710(class428.field6202, class409.field5972.field4240, var6, class84.field1369);
            }
        } else {
            class185.field2721 = class409.field5972.field4241;
            class376.field5328 = class409.field5972.field4236;
            class257.field3711 = class409.field5972.field4244;
            class230.field3365 = -1;
            class52.field852 = class409.field5972.field4246;
            class37.field545 = class409.field5972.field4239;
            class113.field1822 = class409.field5972.field4238;
            class84.field1369 = class409.field5972.field4240;
            class152.field2321 = class409.field5972.field4232;
            class157.field2383 = class409.field5972.field4234;
            class435.field6343 = class409.field5972.field4242;
        }
        class281.field4213 = var1;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method955(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1786++;
        if (arg0) {
            return;
        }
        int var7 = arg3 - arg5;
        int var8 = arg2 + arg5;
        for (int var9 = arg2; var9 < var8; var9++) {
            class47.method379(arg1, (byte) 67, arg4, class286.field4283[var9], arg6);
        }
        int var10 = arg1 - arg5;
        int var11 = arg5 + arg6;
        for (int var12 = arg3; var12 > var7; var12--) {
            class47.method379(arg1, (byte) 97, arg4, class286.field4283[var12], arg6);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class286.field4283[var13];
            class47.method379(var11, (byte) 103, arg4, var14, arg6);
            class47.method379(arg1, (byte) 69, arg4, var14, var10);
        }
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V")
    public static final void method956(byte arg0) {
        if (arg0 != 67) {
            field1785 = 15;
        }
        class305.field4460 = null;
        class390.field5645 = null;
        field1778++;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIII)I")
    public static final int method957(int arg0, int arg1, int arg2, int arg3) {
        field1779++;
        if (class50.field816 == null) {
            return 0;
        }
        if (arg3 != 20663) {
            method957(-124, 65, 97, 54);
        }
        int var4 = arg1 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class183.field2703 - 1) || var5 > (class66.field1056 - 1)) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class278.field4176[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class50.field816[var6].method809(arg1, arg0);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        field1780 = null;
        field1777 = null;
        if (arg0 != 21186) {
            field1777 = null;
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILja;I)Z")
    public static final boolean method959(int arg0, class90 arg1, int arg2) {
        field1787++;
        int var3 = (class183.field2703 - 104) / 2;
        int var4 = (class66.field1056 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class202.method1538(var6, var51, arg0, 582, var52)) {
                        int var53 = var52;
                        if (class93.method783(var6, false, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class435.method2727(var6, var53, -87, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else if (arg2 == 20826) {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = -16777216;
            }
            class135.field2165 = arg1.method715(var7, 0, 512, 512, 512);
            class19.method119(arg2 ^ 0x515F);
            int var9 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((((int) (Math.random() * 20.0D)) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
            int var10 = ((int) (Math.random() * 20.0D)) + 228 | 0xFF00 << 16;
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class415.field6011][class415.field6011];
            for (int var13 = var3; var13 < var3 + 104; var13 += class415.field6011) {
                for (int var36 = var4; var36 < var4 + 104; var36 += class415.field6011) {
                    arg1.method752(0, 0, class415.field6011 * 4, class415.field6011 * 4);
                    arg1.method706(-16777216);
                    for (int var37 = arg0; var37 <= 3; var37++) {
                        for (int var44 = 0; var44 < class415.field6011; var44++) {
                            for (int var50 = 0; var50 < class415.field6011; var50++) {
                                var12[var44][var50] = class202.method1538(var13 + var44, var36 + var50, arg0, 582, var37);
                            }
                        }
                        class311.field4527[var37].method795(0, 0, 1024, var13, var36, class415.field6011 + var13, class415.field6011 + var36, var12);
                        if (!class388.field5557) {
                            for (int var45 = -4; var45 < class415.field6011; var45++) {
                                for (int var46 = -4; var46 < class415.field6011; var46++) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    if (var3 <= var47 && var4 <= var48 && class202.method1538(var47, var48, arg0, 582, var37)) {
                                        int var49 = var37;
                                        if (class93.method783(var47, false, var48)) {
                                            var49 = var37 - 1;
                                        }
                                        if (var49 >= 0) {
                                            class42.method345(var47, arg1, arg2 ^ 0x5125, (class415.field6011 - var46) * 4 - 4, var9, var45 * 4, var48, var10, var49);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class388.field5557) {
                        class158 var38 = class322.field4646[arg0];
                        for (int var39 = 0; var39 < class415.field6011; var39++) {
                            for (int var40 = 0; var40 < class415.field6011; var40++) {
                                int var41 = var13 + var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field2405[var41 - var38.field2424][var42 - var38.field2411];
                                if ((var43 & 0x40240000) != 0) {
                                    arg1.method736(4, (byte) -40, -1713569622, 4, var39 * 4, (class415.field6011 - var40) * 4 - 4);
                                } else if ((var43 & 0x800000) != 0) {
                                    arg1.method718(4, 6, (class415.field6011 - var40) * 4 - 4, var39 * 4, -1713569622);
                                } else if ((var43 & 0x2000000) != 0) {
                                    arg1.method692((class415.field6011 - var40) * 4 - 4, var39 * 4 + 3, 1, 4, -1713569622);
                                } else if ((var43 & 0x8000000) != 0) {
                                    arg1.method718(4, arg2 - 20820, (-var40 + class415.field6011) * 4 + -1, var39 * 4, -1713569622);
                                } else if ((var43 & 0x20000000) != 0) {
                                    arg1.method692((class415.field6011 - var40) * 4 - 4, var39 * 4, 1, 4, -1713569622);
                                }
                            }
                        }
                    }
                    arg1.method681(0, 0, class415.field6011 * 4, class415.field6011 * 4, var11, 2);
                    class135.field2165.method497((var13 - var3) * 4 + 48, 464 - class415.field6011 * 4 + -((-var4 + var36) * 4), class415.field6011 * 4, class415.field6011 * 4, 0, 0);
                }
            }
            arg1.method751();
            arg1.method706(-16777215);
            class126.method1061(false);
            class117.field1842 = 0;
            class244.field3550.method147(arg2 - 20791);
            if (!class388.field5557) {
                for (int var14 = var3; var14 < (var3 + 104); var14++) {
                    for (int var20 = var4; var20 < (var4 + 104); var20++) {
                        for (int var21 = arg0; var21 <= (arg0 + 1) && var21 <= 3; var21++) {
                            if (class202.method1538(var14, var20, arg0, arg2 ^ 0x531C, var21)) {
                                class395 var22 = (class395) class37.method311(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class395) class371.method2358(var21, var14, var20, field1790 == null ? (field1790 = method960("sc")) : field1790);
                                }
                                if (var22 == null) {
                                    var22 = (class395) class219.method1656(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class395) class336.method2189(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class45 var23 = class451.method2812(53, var22.method1013(false));
                                    if (!var23.field700 || class121.field1908) {
                                        int var24 = var23.field668;
                                        if (var23.field681 != null) {
                                            for (int var25 = 0; var25 < var23.field681.length; var25++) {
                                                if (var23.field681[var25] != -1) {
                                                    class45 var26 = class451.method2812(120, var23.field681[var25]);
                                                    if (var26.field668 >= 0) {
                                                        var24 = var26.field668;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class242 var28 = class1.method3(var24, 36);
                                                if (var28 != null && var28.field3500) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class322.field4646[var21].field2405;
                                                int var32 = class322.field4646[var21].field2424;
                                                int var33 = class322.field4646[var21].field2411;
                                                for (int var34 = 0; var34 < 10; var34++) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && var3 < var29 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                        var29--;
                                                    }
                                                    if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                        var29++;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                        var30--;
                                                    }
                                                    if (var35 == 3 && var4 + 104 - 1 > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                        var30++;
                                                    }
                                                }
                                            }
                                            class329.field4741[class117.field1842] = var23.field733;
                                            class361.field5140[class117.field1842] = var29;
                                            class239.field3458[class117.field1842] = var30;
                                            class117.field1842++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class141.field2233 != null) {
                    class217.field3222.field2564 = 1;
                    class199.method1515(1024, 64, -80);
                    for (int var15 = 0; var15 < class141.field2233.field5374; var15++) {
                        int var16 = class141.field2233.field5373[var15];
                        if (var16 >> 28 == class367.field5213) {
                            int var17 = ((var16 & 0xFFFDC70) >> 14) - class379.field5384;
                            int var18 = (var16 & 0x3FFF) - class294.field4362;
                            if (var17 >= 0 && class183.field2703 > var17 && var18 >= 0 && class66.field1056 > var18) {
                                class244.field3550.method148((byte) 126, new class9(var15));
                            } else {
                                class242 var19 = class1.method3(class141.field2233.field5372[var15], arg2 - 20790);
                                if (var19.field3488 != null && (var19.field3492 + var17) >= 0 && var19.field3516 + var17 < class183.field2703 && (var18 + var19.field3487) >= 0 && (var19.field3501 + var18) < class66.field1056) {
                                    class244.field3550.method148((byte) 99, new class9(var15));
                                }
                            }
                        }
                    }
                    class199.method1515(128, 64, -74);
                    class217.field3222.field2564 = 2;
                    class217.field3222.method1343(arg2 ^ 0xFFFFAECA);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method960(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
