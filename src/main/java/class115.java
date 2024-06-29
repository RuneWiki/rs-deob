import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class115 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "Lel;")
    public class202 field1902 = new class202();

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Laf;")
    public static class68 field1903 = new class68(4);

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field1912 = 0;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field1915 = 2301979;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Ljava/lang/String;")
    public static String field1922 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "Lqh;")
    public static class201 field1919;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "Lqh;")
    public static class201 field1921;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "Lel;")
    private class202 field1917;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "[Ld;")
    public static class238[] field1916;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lel;")
    public final class202 method843(int arg0) {
        int var2 = 97 % ((14 - arg0) / 43);
        class202 var3 = this.field1902.field3245;
        field1913++;
        if (this.field1902 == var3) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var3.field3245;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
    public static void method844(boolean arg0) {
        if (!arg0) {
            method844(false);
        }
        field1903 = null;
        field1921 = null;
        field1919 = null;
        field1916 = null;
        field1922 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Lel;")
    public final class202 method845(byte arg0) {
        field1901++;
        class202 var2 = this.field1902.field3245;
        if (this.field1902 == var2) {
            return null;
        } else {
            int var3 = -47 % ((arg0 - 39) / 47);
            var2.method1388(-96);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLel;)V")
    public final void method846(byte arg0, class202 arg1) {
        if (arg0 <= 78) {
            return;
        }
        field1911++;
        if (arg1.field3248 != null) {
            arg1.method1388(90);
        }
        arg1.field3248 = this.field1902;
        arg1.field3245 = this.field1902.field3245;
        arg1.field3248.field3245 = arg1;
        arg1.field3245.field3248 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Lel;")
    public final class202 method847(int arg0) {
        field1907++;
        if (arg0 != 1) {
            this.method854(true);
        }
        class202 var2 = this.field1902.field3248;
        if (this.field1902 == var2) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var2.field3248;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Lel;")
    public final class202 method848(int arg0) {
        class202 var2 = this.field1917;
        int var3 = -84 / ((arg0 + 36) / 54);
        field1918++;
        if (this.field1902 == var2) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var2.field3248;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)[Ld;")
    public static final class238[] method849(int arg0) {
        class238[] var1 = new class238[class278.field4385];
        if (arg0 != 15179) {
            field1919 = null;
        }
        for (int var2 = 0; var2 < class278.field4385; var2++) {
            int var3 = class236.field3847[var2] * class148.field2385[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class145.field2332[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class194.field3113[class202.method1393(255, var5[var6])];
            }
            var1[var2] = new class37(class27.field432, class155.field2513, class152.field2464[var2], class74.field1202[var2], class148.field2385[var2], class236.field3847[var2], var4);
        }
        field1906++;
        class287.method1923(0);
        return var1;
    }

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)V")
    public static final void method850(int arg0) {
        class199.field3182.method481(false);
        field1908++;
        if (arg0 != -19000) {
            field1919 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method851(int arg0, String arg1) {
        field1905++;
        if (class144.field2313 >= 2) {
            if (arg1.equalsIgnoreCase("::gc")) {
                class106.method767(20594);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class226.method1588((String) null, 0, (byte) -34, "mem=" + var4 + "k");
            }
            if (arg1.equalsIgnoreCase("::mm")) {
                class106.method767(20594);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class226.method1588((String) null, 0, (byte) -22, "Memory before cleanup=" + var7 + "k");
                class121.method878(-105);
                class106.method767(20594);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class226.method1588((String) null, 0, (byte) -99, "Memory after cleanup=" + var9 + "k");
            }
            if (arg1.equalsIgnoreCase("::pcachesize")) {
                class226.method1588((String) null, 0, (byte) -19, "Number of player models in cache:" + class103.method752(8));
            }
            if (arg1.equalsIgnoreCase("::clientdrop")) {
                class14.method112(40);
            }
            if (arg1.equalsIgnoreCase("::clientjs5drop")) {
                class284.field4486.method1741(-101);
            }
            if (arg1.equalsIgnoreCase("::serverjs5drop")) {
                class284.field4486.method1748(false);
            }
            if (arg1.equalsIgnoreCase("::breakcon")) {
                class105.field1684.method1144(5000);
                class5.field69.method8(-6);
                class284.field4486.method1744((byte) -113);
            }
            if (arg1.equalsIgnoreCase("::replacecanvas")) {
                class36.field715 = true;
            }
            if (arg1.equalsIgnoreCase("::rebuild")) {
                class1.method5(25, -12);
            }
            if (arg1.equalsIgnoreCase("::fpson")) {
                class282.field4473 = true;
            }
            if (arg1.equalsIgnoreCase("::fpsoff")) {
                class282.field4473 = false;
            }
            if (arg1.equalsIgnoreCase("::noclip")) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class167.field2657[var10].field371[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.startsWith("::setparticles")) {
                class130.method922(class184.method1245(arg1.substring(15), 10));
                class257.method1755(class105.field1684, false);
                class221.field3679 = false;
            }
            if (arg1.startsWith("::fps ") && class205.field3287 != 0) {
                class198.method1341(0, class184.method1245(arg1.substring(6), 10));
            }
            if (arg1.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg1.startsWith("::rect_debug")) {
                class173.field2727 = class184.method1245(arg1.substring(12).trim(), 10);
                class226.method1588((String) null, 0, (byte) -100, "rect_debug=" + class173.field2727);
            }
            if (arg1.equalsIgnoreCase("::qa_op_test")) {
                class103.field1675 = true;
            }
            if (arg1.equalsIgnoreCase("::tween")) {
                if (class106.field1690) {
                    class106.field1690 = false;
                    class226.method1588((String) null, 0, (byte) -128, "Forced tweening disabled.");
                } else {
                    class106.field1690 = true;
                    class226.method1588((String) null, 0, (byte) -91, "Forced tweening ENABLED!");
                }
            }
            if (arg1.equalsIgnoreCase("::shiftclick")) {
                if (class183.field2869) {
                    System.out.println("Shift-click disabled.");
                    class183.field2869 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class183.field2869 = true;
                }
            }
        }
        class8.field104++;
        class68.field1113.method534((byte) 32, 132);
        if (arg0 <= 125) {
            field1919 = null;
        }
        class68.field1113.method1548(-494964184, arg1.length() - 1);
        class68.field1113.method1563(arg1.substring(2), 95);
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)Lel;")
    public final class202 method852(byte arg0) {
        field1923++;
        if (arg0 != 123) {
            field1916 = null;
        }
        class202 var2 = this.field1917;
        if (this.field1902 == var2) {
            this.field1917 = null;
            return null;
        } else {
            this.field1917 = var2.field3245;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILqh;)Lkg;")
    public static final class136 method853(int arg0, int arg1, class201 arg2) {
        byte[] var3 = arg2.method1367(arg0 - 67, arg1);
        if (arg0 == 0) {
            field1909++;
            return var3 == null ? null : new class136(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)V")
    public final void method854(boolean arg0) {
        while (true) {
            class202 var2 = this.field1902.field3245;
            if (this.field1902 == var2) {
                this.field1917 = null;
                field1914++;
                if (!arg0) {
                    this.method852((byte) -103);
                    return;
                }
                return;
            }
            var2.method1388(-98);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLel;)V")
    public final void method855(boolean arg0, class202 arg1) {
        if (arg1.field3248 != null) {
            arg1.method1388(-128);
        }
        if (arg0) {
            return;
        }
        arg1.field3248 = this.field1902.field3248;
        field1904++;
        arg1.field3245 = this.field1902;
        arg1.field3248.field3245 = arg1;
        arg1.field3245.field3248 = arg1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZII[IIIIIII)V")
    public static final void method856(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg2;
        field1910++;
        if (arg2 >= class2.field33) {
            return;
        }
        int var12 = arg2 + arg10;
        if (class2.field32 > arg2) {
            var11 = class2.field32;
        }
        if (class2.field32 >= var12) {
            return;
        }
        if (var12 > class2.field33) {
            var12 = class2.field33;
        }
        int var13 = arg0;
        if (arg0 >= class2.field37) {
            return;
        }
        if (arg0 < class2.field39) {
            var13 = class2.field39;
        }
        int var14 = arg0 + arg9;
        if (class2.field39 >= var14) {
            return;
        }
        if (arg5 == 9) {
            arg5 = 1;
            arg3 = arg3 + 1 & 0x3;
        }
        if (class2.field37 < var14) {
            var14 = class2.field37;
        }
        if (arg5 == 10) {
            arg3 = arg3 + 3 & 0x3;
            arg5 = 1;
        }
        int var15 = class2.field36 * var13 + var11;
        if (arg5 == 11) {
            arg5 = 8;
            arg3 = arg3 + 3 & 0x3;
        }
        int var16 = var13 - arg0;
        int var17 = var14 - arg0;
        int var18 = var11 + class2.field36 - var12;
        int var19 = arg9 - var17;
        int var20 = var11 - arg2;
        int var21 = arg10 - var20;
        int var22 = var12 - arg2;
        int var23 = arg10 - var22;
        int var24 = arg9 - var16;
        if (arg5 == 1) {
            if (arg3 == 0) {
                for (int var25 = var16; var25 < var17; var25++) {
                    for (int var26 = var20; var26 < var22; var26++) {
                        if (var25 >= var26) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var27 = var24 - 1; var27 >= var19; var27--) {
                    for (int var28 = var20; var28 < var22; var28++) {
                        if (var28 <= var27) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var29 = var16; var29 < var17; var29++) {
                    for (int var30 = var20; var30 < var22; var30++) {
                        if (var29 <= var30) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var31 = var24 - 1; var31 >= var19; var31--) {
                    for (int var32 = var20; var32 < var22; var32++) {
                        if (var32 >= var31) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg5 == arg8) {
            if (arg3 == 0) {
                for (int var33 = var24 - 1; var33 >= var19; var33--) {
                    for (int var34 = var20; var34 < var22; var34++) {
                        if ((var33 >> 1) >= var34) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var35 = var16; var35 < var17; var35++) {
                    for (int var36 = var20; var36 < var22; var36++) {
                        if (var15 >= 0 && var15 < arg4.length) {
                            if (var36 >= var35 << 1) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var37 = var16; var37 < var17; var37++) {
                    for (int var38 = var21 - 1; var38 >= var23; var38--) {
                        if (var38 <= (var37 >> 1)) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var39 = var24 - 1; var39 >= var19; var39--) {
                    for (int var40 = var21 - 1; var40 >= var23; var40--) {
                        if (var40 >= var39 << 1) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg5 == 3) {
            if (arg3 == 0) {
                for (int var41 = var24 - 1; var41 >= var19; var41--) {
                    for (int var42 = var21 - 1; var42 >= var23; var42--) {
                        if (var42 <= (var41 >> 1)) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var43 = var24 - 1; var43 >= var19; var43--) {
                    for (int var44 = var20; var44 < var22; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var45 = var16; var45 < var17; var45++) {
                    for (int var46 = var20; var46 < var22; var46++) {
                        if (var46 <= (var45 >> 1)) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var47 = var16; var47 < var17; var47++) {
                    for (int var48 = var21 - 1; var48 >= var23; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg5 == 4) {
            if (arg3 == 0) {
                for (int var49 = var24 - 1; var49 >= var19; var49--) {
                    for (int var50 = var20; var50 < var22; var50++) {
                        if ((var49 >> 1) <= var50) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 1) {
                for (int var51 = var16; var51 < var17; var51++) {
                    for (int var52 = var20; var52 < var22; var52++) {
                        if ((var51 << 1) >= var52) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 2) {
                for (int var53 = var16; var53 < var17; var53++) {
                    for (int var54 = var21 - 1; var54 >= var23; var54--) {
                        if (var54 >= var53 >> 1) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            } else if (arg3 == 3) {
                for (int var55 = var24 - 1; var55 >= var19; var55--) {
                    for (int var56 = var21 - 1; var56 >= var23; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg4[var15] = arg6;
                        } else if (arg1) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var18;
                }
            }
        } else if (arg5 != 5) {
            if (arg5 == 6) {
                if (arg3 == 0) {
                    for (int var65 = var16; var65 < var17; var65++) {
                        for (int var66 = var20; var66 < var22; var66++) {
                            if (var66 <= arg10 / 2) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var67 = var16; var67 < var17; var67++) {
                        for (int var68 = var20; var68 < var22; var68++) {
                            if (var67 <= (arg9 / 2)) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var69 = var16; var69 < var17; var69++) {
                        for (int var70 = var20; var70 < var22; var70++) {
                            if (arg10 / 2 <= var70) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var71 = var16; var71 < var17; var71++) {
                        for (int var72 = var20; var72 < var22; var72++) {
                            if (var71 >= arg9 / 2) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg5 == 7) {
                if (arg3 == 0) {
                    for (int var73 = var16; var73 < var17; var73++) {
                        for (int var74 = var20; var74 < var22; var74++) {
                            if (var73 - arg9 / 2 >= var74) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var75 = var24 - 1; var75 >= var19; var75--) {
                        for (int var76 = var20; var76 < var22; var76++) {
                            if ((var75 - (arg9 / 2)) >= var76) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var77 = var24 - 1; var77 >= var19; var77--) {
                        for (int var78 = var21 - 1; var78 >= var23; var78--) {
                            if (var77 - (arg9 / 2) >= var78) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var79 = var16; var79 < var17; var79++) {
                        for (int var80 = var21 - 1; var80 >= var23; var80--) {
                            if (var79 - (arg9 / 2) >= var80) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
            if (arg5 == 8) {
                if (arg3 == 0) {
                    for (int var81 = var16; var81 < var17; var81++) {
                        for (int var82 = var20; var82 < var22; var82++) {
                            if (var81 - (arg9 / 2) <= var82) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 1) {
                    for (int var83 = var24 - 1; var83 >= var19; var83--) {
                        for (int var84 = var20; var84 < var22; var84++) {
                            if ((var83 - arg9 / 2) <= var84) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 2) {
                    for (int var85 = var24 - 1; var85 >= var19; var85--) {
                        for (int var86 = var21 - 1; var86 >= var23; var86--) {
                            if (var86 >= (var85 - (arg9 / 2))) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
                if (arg3 == 3) {
                    for (int var87 = var16; var87 < var17; var87++) {
                        for (int var88 = var21 - 1; var88 >= var23; var88--) {
                            if (var87 - (arg9 / 2) <= var88) {
                                arg4[var15] = arg6;
                            } else if (arg1) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var18;
                    }
                    return;
                }
            }
        } else if (arg3 == 0) {
            for (int var57 = var24 - 1; var57 >= var19; var57--) {
                for (int var58 = var21 - 1; var58 >= var23; var58--) {
                    if ((var57 >> 1) <= var58) {
                        arg4[var15] = arg6;
                    } else if (arg1) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 1) {
            for (int var59 = var24 - 1; var59 >= var19; var59--) {
                for (int var60 = var20; var60 < var22; var60++) {
                    if ((var59 << 1) >= var60) {
                        arg4[var15] = arg6;
                    } else if (arg1) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 2) {
            for (int var61 = var16; var61 < var17; var61++) {
                for (int var62 = var20; var62 < var22; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg4[var15] = arg6;
                    } else if (arg1) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var18;
            }
        } else if (arg3 == 3) {
            for (int var63 = var16; var63 < var17; var63++) {
                for (int var64 = var21 - 1; var64 >= var23; var64--) {
                    if (var64 <= var63 << 1) {
                        arg4[var15] = arg6;
                    } else if (arg1) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var18;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class115() {
        this.field1902.field3245 = this.field1902;
        this.field1902.field3248 = this.field1902;
    }
}
