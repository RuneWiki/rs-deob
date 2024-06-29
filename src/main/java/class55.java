import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class55 {

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public int field792 = 2;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Z")
    public boolean field798 = false;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field784 = 5;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public int field811 = 99;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
    public int field807 = -1;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
    public boolean field794 = false;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public int field789 = -1;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public int field810 = -1;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public int field814 = -1;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "Z")
    public boolean field815 = false;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public int field808 = -1;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public int field813 = 0;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field797 = 50;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field786 = new String[field797];

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
    public static int[] field787 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "[I")
    public static int[] field803 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "[I")
    public static int[] field804 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
    public static int[] field793 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "[I")
    public static int[] field800 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "[I")
    public static int[] field806 = new int[field797];

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "Lec;")
    public class109 field790;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jp", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field817;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
    public int[] field788;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "[I")
    public int[] field796;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "[I")
    private int[] field802;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[Z")
    public boolean[] field791;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "[[I")
    public int[][] field812;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILza;)Z")
    public static final boolean method355(int arg0, int arg1, class295 arg2) {
        field785++;
        int var3 = (class9.field111 - 104) / 2;
        int var4 = (class192.field2809 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg0; var52 <= 3; var52++) {
                    if (class104.method811(91, var52, arg0, var51, var6)) {
                        int var53 = var52;
                        if (class363.method2175(10174, var6, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class504.method2990(var53, 261910288, var6, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class527.field7694 = arg2.method510(var7, 0, 512, 512, 512);
        class154.method1110(arg1 ^ 0x6F);
        int var9 = ((int) (Math.random() * 20.0D)) - (-(((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) - 238) - 10 | 0xFF000000;
        int var10 = (((int) (Math.random() * 20.0D)) + 238 - 10 | 0x5BFFFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        if (arg1 != -3) {
            return true;
        }
        boolean[][] var12 = new boolean[class297.field4047][class297.field4047];
        for (int var13 = var3; var13 < var3 + 104; var13 += class297.field4047) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class297.field4047) {
                arg2.method511(0, 0, class297.field4047 * 4, class297.field4047 * 4);
                arg2.method467(-16777216);
                for (int var37 = arg0; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class297.field4047; var44++) {
                        for (int var50 = 0; var50 < class297.field4047; var50++) {
                            var12[var44][var50] = class104.method811(118, var37, arg0, var36 + var50, var13 + var44);
                        }
                    }
                    class348.field5000[var37].method83(0, 0, 1024, var13, var36, var13 + class297.field4047, class297.field4047 + var36, var12);
                    if (!class157.field2398) {
                        for (int var45 = -4; var45 < class297.field4047; var45++) {
                            for (int var46 = -4; var46 < class297.field4047; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class104.method811(73, var37, arg0, var48, var47)) {
                                    int var49 = var37;
                                    if (class363.method2175(10174, var47, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class199.method1300(var45 * 4, var9, var47, var10, arg2, (class297.field4047 - var46) * 4 - 4, var49, 0, var48);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class157.field2398) {
                    class466 var38 = class264.field3553[arg0];
                    for (int var39 = 0; var39 < class297.field4047; var39++) {
                        for (int var40 = 0; var40 < class297.field4047; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6737[var41 - var38.field6745][var42 - var38.field6739];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method1712(4, 0, -1713569622, 4, (class297.field4047 - var40) * 4 - 4, var39 * 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method1711((byte) 125, 4, -1713569622, (class297.field4047 - var40) * 4 - 4, var39 * 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method1714(var39 * 4 + 3, (class297.field4047 - var40) * 4 - 4, -1713569622, 4, (byte) -24);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method1711((byte) 99, 4, -1713569622, (class297.field4047 - var40) * 4 + 3 - 4, var39 * 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method1714(var39 * 4, (class297.field4047 - var40) * 4 - 4, -1713569622, 4, (byte) -24);
                            }
                        }
                    }
                }
                arg2.method508(0, 0, class297.field4047 * 4, class297.field4047 * 4, var11, 2);
                class527.field7694.method202((var13 - var3) * 4 + 48, -(class297.field4047 * 4) + 464 + -((-var4 + var36) * 4), class297.field4047 * 4, class297.field4047 * 4, 0, 0);
            }
        }
        arg2.method477();
        arg2.method467(-16777215);
        class157.method1127(1508614222);
        class137.field2069 = 0;
        class265.field3570.method3143(true);
        if (!class157.field2398) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; arg0 + 1 >= var21 && var21 <= 3; var21++) {
                        if (class104.method811(arg1 + 77, var21, arg0, var20, var14)) {
                            class303 var22 = (class303) class126.method913(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class303) class377.method2254(var21, var14, var20, field817 == null ? (field817 = method366("bn")) : field817);
                            }
                            if (var22 == null) {
                                var22 = (class303) class191.method1267(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class303) class506.method3004(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class103 var23 = class452.field6629.method603((byte) 98, var22.method170((byte) -59));
                                if (!var23.field1700 || class65.field938) {
                                    int var24 = var23.field1636;
                                    if (var23.field1613 != null) {
                                        for (int var25 = 0; var25 < var23.field1613.length; var25++) {
                                            if (var23.field1613[var25] != -1) {
                                                class103 var26 = class452.field6629.method603((byte) 115, var23.field1613[var25]);
                                                if (var26.field1636 >= 0) {
                                                    var24 = var26.field1636;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class92 var28 = class98.field1563.method1655(var24, (byte) -122);
                                            if (var28 != null && var28.field1474) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class264.field3553[var21].field6737;
                                            int var32 = class264.field3553[var21].field6745;
                                            int var33 = class264.field3553[var21].field6739;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class75.field1060[class137.field2069] = var23.field1646;
                                        class50.field713[class137.field2069] = var29;
                                        class373.field5357[class137.field2069] = var30;
                                        class137.field2069++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class533.field7851 != null) {
                class503.field7358.field6093 = 1;
                class98.field1563.method1654(64, true, 1024);
                for (int var15 = 0; var15 < class533.field7851.field6245; var15++) {
                    int var16 = class533.field7851.field6243[var15];
                    if (var16 >> 28 == class81.field1158.field6279) {
                        int var17 = ((var16 & 0xFFFFF36) >> 14) - class110.field1775;
                        int var18 = (var16 & 0x3FFF) - class399.field5727;
                        if (var17 >= 0 && class9.field111 > var17 && var18 >= 0 && class192.field2809 > var18) {
                            class265.field3570.method3139(0, new class437(var15));
                        } else {
                            class92 var19 = class98.field1563.method1655(class533.field7851.field6240[var15], (byte) -122);
                            if (var19.field1507 != null && (var19.field1465 + var17) >= 0 && (var19.field1509 + var17) < class9.field111 && var18 + var19.field1480 >= 0 && class192.field2809 > var19.field1483 + var18) {
                                class265.field3570.method3139(0, new class437(var15));
                            }
                        }
                    }
                }
                class98.field1563.method1654(64, true, 128);
                class503.field7358.field6093 = 2;
                class503.field7358.method2503(-3);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lsv;B)V")
    public final void method356(class319 arg0, byte arg1) {
        if (arg1 > -101) {
            this.method365(47, (byte) -38, false, 125);
        }
        while (true) {
            int var3 = arg0.method1869(-118);
            if (var3 == 0) {
                field816++;
                return;
            }
            this.method363(arg0, var3, 4);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
    public static final void method357(boolean arg0, String arg1, boolean arg2) {
        field805++;
        if (arg1 == null) {
            return;
        }
        if (class296.field3993 >= 100) {
            class35.method256((byte) 120, class529.field7749.method1126(class486.field6998, (byte) -19));
            return;
        }
        String var3 = class75.method585(arg1, -1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class296.field3993; var4++) {
            String var8 = class75.method585(class169.field2579[var4], -1);
            if (var8 != null && var8.equals(var3)) {
                class35.method256((byte) 113, arg1 + class504.field7374.method1126(class486.field6998, (byte) -19));
                return;
            }
            if (class148.field2266[var4] != null) {
                String var9 = class75.method585(class148.field2266[var4], -1);
                if (var9 != null && var9.equals(var3)) {
                    class35.method256((byte) 97, arg1 + class504.field7374.method1126(class486.field6998, (byte) -19));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class399.field5724; var5++) {
            String var6 = class75.method585(class494.field7148[var5], -1);
            if (var6 != null && var6.equals(var3)) {
                class35.method256((byte) 122, class108.field1750.method1126(class486.field6998, (byte) -19) + arg1 + class452.field6625.method1126(class486.field6998, (byte) -19));
                return;
            }
            if (class384.field5510[var5] != null) {
                String var7 = class75.method585(class384.field5510[var5], -1);
                if (var7 != null && var7.equals(var3)) {
                    class35.method256((byte) 121, class108.field1750.method1126(class486.field6998, (byte) -19) + arg1 + class452.field6625.method1126(class486.field6998, (byte) -19));
                    return;
                }
            }
        }
        if (class75.method585(class81.field1158.field7036, -1).equals(var3)) {
            class35.method256((byte) 114, class308.field4186.method1126(class486.field6998, (byte) -19));
            return;
        }
        class274.method1602(14, class466.field6729);
        class527.field7692++;
        class17.field275.method1891(arg0, class515.method3047((byte) -58, arg1) + 1);
        class17.field275.method1879(32767, arg1);
        class17.field275.method1891(false, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB)V")
    public static final void method358(int arg0, int arg1, int arg2, byte arg3) {
        field795++;
        int var4 = arg0 << 3;
        int var5 = arg1 << 3;
        int var6 = arg2 << 3;
        class191.field2797 = var6;
        if (class247.field3363 == 2) {
            class153.field2357 = var4;
            class455.field6641 = var5;
            class49.field706 = var6;
        }
        if (arg3 > -88) {
            field806 = null;
        }
        class496.field7236 = var4;
        class259.method1538((byte) -84);
        class163.field2483 = true;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILe;IIIIBB)Le;")
    public final class285 method359(int arg0, class285 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, byte arg7) {
        field781++;
        int var9 = this.field788[arg2];
        int var10 = this.field796[arg2];
        class420 var11 = this.field790.method827(var10 >> 16, (byte) -122);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method697(arg7, arg4, true);
        }
        class420 var13 = null;
        if ((this.field798 || class434.field6286) && arg0 != -1 && this.field796.length > arg0) {
            int var14 = this.field796[arg0];
            var13 = this.field790.method827(var14 >> 16, (byte) 126);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field794) {
            arg4 |= 0x200;
        }
        if (var11.method2484(var12, -525275000)) {
            arg4 |= 0x80;
        }
        if (var11.method2481(var12, -126)) {
            arg4 |= 0x100;
        }
        if (var11.method2485((byte) -121, var12)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2484(arg0, -525275000)) {
                arg4 |= 0x80;
            }
            if (var13.method2481(arg0, -127)) {
                arg4 |= 0x100;
            }
            if (var13.method2485((byte) -66, arg0)) {
                arg4 |= 0x400;
            }
        }
        int var15 = arg4 | 0x20;
        if (arg6 >= -106) {
            this.field802 = null;
        }
        class285 var16 = arg1.method697(arg7, var15, true);
        var16.method1641(var13, arg3 - 1, arg0, arg5, var11, (byte) 74, var9, var12, this.field794);
        return var16;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public final void method360(int arg0) {
        field783++;
        if (this.field814 == -1) {
            if (this.field791 == null) {
                this.field814 = 0;
            } else {
                this.field814 = 2;
            }
        }
        if (this.field789 == -1) {
            if (this.field791 == null) {
                this.field789 = 0;
            } else {
                this.field789 = 2;
            }
        }
        if (arg0 <= 38) {
            this.method364(107, -15, 58, -119, 34, null);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)I")
    public static final int method361(int arg0, int arg1) {
        return class436.field6304 == null ? 0 : class436.field6304[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    public static void method362(byte arg0) {
        field804 = null;
        field803 = null;
        if (arg0 != 95) {
            return;
        }
        field800 = null;
        field787 = null;
        field786 = null;
        field793 = null;
        field806 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lsv;II)V")
    private final void method363(class319 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            int var4 = arg0.method1844(-111);
            this.field788 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field788[var5] = arg0.method1844(-108);
            }
            this.field796 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field796[var6] = arg0.method1844(-105);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field796[var7] += arg0.method1844(-116) << 16;
            }
        } else if (arg1 == 2) {
            this.field807 = arg0.method1844(arg2 ^ 0xFFFFFF91);
        } else if (arg1 == 3) {
            this.field791 = new boolean[256];
            int var8 = arg0.method1869(arg2 ^ 0xFFFFFF9B);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field791[arg0.method1869(-76)] = true;
            }
        } else if (arg1 == 5) {
            this.field784 = arg0.method1869(-83);
        } else if (arg1 == 6) {
            this.field808 = arg0.method1844(-117);
        } else if (arg1 == 7) {
            this.field810 = arg0.method1844(arg2 - 112);
        } else if (arg1 == 8) {
            this.field811 = arg0.method1869(-103);
        } else if (arg1 == 9) {
            this.field789 = arg0.method1869(-92);
        } else if (arg1 == 10) {
            this.field814 = arg0.method1869(-110);
        } else if (arg1 == 11) {
            this.field792 = arg0.method1869(-112);
        } else if (arg1 == 12) {
            int var14 = arg0.method1869(-67);
            this.field802 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field802[var15] = arg0.method1844(-113);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field802[var16] += arg0.method1844(-128) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg0.method1844(-115);
            this.field812 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method1869(-101);
                if (var12 > 0) {
                    this.field812[var11] = new int[var12];
                    this.field812[var11][0] = arg0.method1852(1086280488);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field812[var11][var13] = arg0.method1844(-117);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field794 = true;
        } else if (arg1 == 15) {
            this.field798 = true;
        } else if (arg1 == 16) {
            this.field815 = true;
        } else if (arg1 == 17) {
            this.field813 = arg0.method1869(-126);
        }
        field809++;
        if (arg2 != 4) {
            this.method364(-61, -110, -59, -128, 17, null);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIILe;)Le;")
    public final class285 method364(int arg0, int arg1, int arg2, int arg3, int arg4, class285 arg5) {
        field799++;
        int var7 = this.field788[arg0];
        int var8 = this.field796[arg0];
        class420 var9 = this.field790.method827(var8 >> 16, (byte) -17);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method697((byte) 1, arg1, true);
        }
        class420 var11 = null;
        if ((this.field798 || class434.field6286) && arg4 != -1 && arg4 < this.field796.length) {
            int var12 = this.field796[arg4];
            var11 = this.field790.method827(var12 >> 16, (byte) -126);
            arg4 = var12 & 0xFFFF;
        }
        class420 var13 = null;
        class420 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field802 != null) {
            if (this.field802.length > arg0) {
                var15 = this.field802[arg0];
                if (var15 != 65535) {
                    var13 = this.field790.method827(var15 >> 16, (byte) -119);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field798 || class434.field6286) && arg4 != -1 && arg4 < this.field802.length) {
                var16 = this.field802[arg4];
                if (var16 != 65535) {
                    var14 = this.field790.method827(var16 >> 16, (byte) -124);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field794) {
            arg1 |= 0x200;
        }
        if (var9.method2484(var10, -525275000)) {
            arg1 |= 0x80;
        }
        if (var9.method2481(var10, arg3 ^ 0x6179)) {
            arg1 |= 0x100;
        }
        if (var9.method2485((byte) 124, var10)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2484(var15, arg3 - 525299949)) {
                arg1 |= 0x80;
            }
            if (var13.method2481(var15, -126)) {
                arg1 |= 0x100;
            }
            if (var13.method2485((byte) 115, var15)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2484(arg4, -525275000)) {
                arg1 |= 0x80;
            }
            if (var11.method2481(arg4, arg3 - 25077)) {
                arg1 |= 0x100;
            }
            if (var11.method2485((byte) -92, arg4)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2484(var16, -525275000)) {
                arg1 |= 0x80;
            }
            if (var14.method2481(var16, 7)) {
                arg1 |= 0x100;
            }
            if (var14.method2485((byte) 125, var16)) {
                arg1 |= 0x400;
            }
        }
        if (arg3 != 24949) {
            this.field815 = false;
        }
        int var17 = arg1 | 0x20;
        class285 var18 = arg5.method697((byte) 1, var17, true);
        var18.method1641(var11, arg2 - 1, arg4, 0, var9, (byte) 85, var7, var10, this.field794);
        if (var13 != null) {
            var18.method1641(var14, arg2 - 1, var16, 0, var13, (byte) 83, var7, var15, this.field794);
        }
        return var18;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBZI)I")
    public final int method365(int arg0, byte arg1, boolean arg2, int arg3) {
        field782++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field796[arg3];
        class420 var8 = null;
        class420 var9 = this.field790.method827(var7 >> 16, (byte) 116);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field798 || class434.field6286) && arg0 != -1 && arg0 < this.field796.length) {
            int var11 = this.field796[arg0];
            var8 = this.field790.method827(var11 >> 16, (byte) 58);
            var6 = var11 & 0xFFFF;
        }
        if (this.field794) {
            var5 |= 0x200;
        }
        if (var9.method2484(var10, arg1 - 525274897)) {
            var5 |= 0x80;
        }
        if (arg1 != -103) {
            this.field791 = null;
        }
        if (var9.method2481(var10, arg1 + 141)) {
            var5 |= 0x100;
        }
        if (var9.method2485((byte) 114, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2484(var6, arg1 - 525274897)) {
                var5 |= 0x80;
            }
            if (var8.method2481(var6, 1)) {
                var5 |= 0x100;
            }
            if (var8.method2485((byte) 122, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field802 != null && arg2) {
            if (arg3 < this.field802.length) {
                int var12 = this.field802[arg3];
                if (var12 != 65535) {
                    class420 var13 = this.field790.method827(var12 >> 16, (byte) -123);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2484(var14, -525275000)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2481(var14, 46)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2485((byte) -103, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field798 || class434.field6286) && arg0 != -1 && arg0 < this.field802.length) {
                int var15 = this.field802[arg0];
                if (var15 != 65535) {
                    class420 var16 = this.field790.method827(var15 >> 16, (byte) -10);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2484(var17, arg1 ^ 0x1F4F0F11)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2481(var17, 9)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2485((byte) -22, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method366(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
