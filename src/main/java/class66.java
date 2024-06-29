import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class66 extends class227 {

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "I")
    private int field756 = 1;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
    private int field758 = 1;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!iv", name = "P", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZZI)V", line = 3)
    public static final void method388(boolean arg0, boolean arg1, int arg2) {
        if (arg0) {
            ++class260.field3487;
            class31.method178(arg2 + -7154);
        }
        ++field760;
        if (arg1) {
            ++class445.field6482;
            class310.method1852((byte) 115);
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "(I)V", line = 27)
    public static final void method389(int arg0) {
        ++field759;
        if (arg0 != -1025) {
            method388(true, true, 99);
        }
        if (class119.field1559 == null) {
            Container var1;
            if (class173.field2224 == null) {
                var1 = class381.field5518.field1828;
            } else {
                var1 = class173.field2224;
            }
            class155.field2037 = var1.getSize().width;
            class461.field6876 = var1.getSize().height;
            if (class173.field2224 == var1) {
                Insets var2 = class173.field2224.getInsets();
                class461.field6876 -= var2.top + var2.bottom;
                class155.field2037 -= var2.right + var2.left;
            }
            if (~class423.method2612(2) != -2) {
                if (class164.field2144 < 96 && ~class20.field183 == -1) {
                    int var3 = ~class155.field2037 >= -1025 ? class155.field2037 : 1024;
                    int var4 = class461.field6876 > 768 ? 768 : class461.field6876;
                    class470.field6965 = (-var3 + class155.field2037) / 2;
                    class372.field5051 = var3;
                    class325.field4330 = 0;
                    class430.field6244 = var4;
                } else {
                    class430.field6244 = class461.field6876;
                    class325.field4330 = 0;
                    class470.field6965 = 0;
                    class372.field5051 = class155.field2037;
                }
            } else {
                class430.field6244 = class249.field3322;
                class372.field5051 = class393.field5678;
                class470.field6965 = (-class393.field5678 + class155.field2037) / 2;
                class325.field4330 = 0;
            }
            if (class401.field5807 != class287.field3779) {
                boolean var10000;
                if (~class372.field5051 > -1025 && ~class430.field6244 > -769) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class60.field701.setSize(class372.field5051, class430.field6244);
            if (class343.field4596 != null) {
                class343.field4596.method1195(class60.field701);
            }
            if (class173.field2224 != var1) {
                class60.field701.setLocation(class470.field6965, class325.field4330);
            } else {
                Insets var5 = class173.field2224.getInsets();
                class60.field701.setLocation(class470.field6965 + var5.left, class325.field4330 + var5.top);
            }
            if (class168.field2174 != -1) {
                class334.method1949(true, -28025);
            }
            class21.method120((byte) -103);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLfo;)V", line = 122)
    public static final void method390(byte arg0, class361 arg1) {
        ++field755;
        class462.field6898 = 0;
        class237.field3157 = 0;
        class508.field7360 = new class49();
        class60.field693 = new class311[1024];
        class155.method929(arg1, -247);
        int var2 = -38 % ((74 - arg0) / 40);
        class415.method2548(-4, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lug;II)V", line = 137)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3066 = ~arg0.method2388((byte) -117) == -2;
                }
            } else {
                this.field756 = arg0.method2388((byte) -123);
            }
        } else {
            this.field758 = arg0.method2388((byte) -118);
        }
        if (arg1 != 487215116) {
            this.field756 = 86;
        }
        ++field761;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V", line = 618)
    public class66() {
        super(1, false);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 190)
    public static final void method391(byte arg0) {
        ++field762;
        if (~class319.field4256.method1736(class20.field183, -27) == -3) {
            byte var1 = (byte) (255 & class431.field6268 + -4);
            int var2 = class431.field6268 % class308.field4128;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var17 = 0; ~class426.field6200 < ~var17; ++var17) {
                    class33.field339[var3][var2][var17] = var1;
                }
            }
            int var4 = -106 % ((arg0 - -44) / 56);
            if (class210.field2808 != 3) {
                for (int var5 = 0; ~var5 > -3; ++var5) {
                    class113.field1486[var5] = -1000000;
                    class371.field5043[var5] = 1000000;
                    class430.field6256[var5] = 0;
                    class96.field1184[var5] = 1000000;
                    class225.field3027[var5] = 0;
                }
                if (class47.field491 == 1) {
                    if (~(class252.field3358[class210.field2808][class96.field1170.field3704 >> 7][class96.field1170.field3694 >> 7] & 4) != -1) {
                        class89.method491(class186.field2421, -1, 0, class96.field1170.field3704 >> 7, false, class96.field1170.field3694 >> 7);
                    }
                    if (class65.field739 < 2560) {
                        int var6 = class238.field3171 >> 7;
                        int var7 = class139.field1857 >> 7;
                        int var8 = class96.field1170.field3704 >> 7;
                        int var9 = class96.field1170.field3694 >> 7;
                        int var10;
                        if (~var6 <= ~var8) {
                            var10 = -var8 + var6;
                        } else {
                            var10 = var8 - var6;
                        }
                        int var11;
                        if (var7 < var9) {
                            var11 = -var7 + var9;
                        } else {
                            var11 = -var9 + var7;
                        }
                        if ((~var10 != -1 || var11 != 0) && ~(-class308.field4128) > ~var10 && class308.field4128 > var10 && var11 > -class426.field6200 && ~var11 > ~class426.field6200) {
                            if (~var11 <= ~var10) {
                                int var12 = var10 * 65536 / var11;
                                int var13 = 32768;
                                while (var7 != var9) {
                                    if (~var9 >= ~var7) {
                                        if (var9 < var7) {
                                            --var7;
                                        }
                                    } else {
                                        ++var7;
                                    }
                                    if ((class252.field3358[class210.field2808][var6][var7] & 4) != 0) {
                                        class89.method491(class186.field2421, -1, 1, var6, false, var7);
                                        return;
                                    }
                                    var13 += var12;
                                    if (var13 >= 65536) {
                                        if (~var6 <= ~var8) {
                                            if (~var6 < ~var8) {
                                                --var6;
                                            }
                                        } else {
                                            ++var6;
                                        }
                                        var13 -= 65536;
                                        if (~(4 & class252.field3358[class210.field2808][var6][var7]) != -1) {
                                            class89.method491(class186.field2421, -1, 1, var6, false, var7);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var14 = var11 * 65536 / var10;
                            int var15 = 32768;
                            while (~var6 != ~var8) {
                                if (~var6 > ~var8) {
                                    ++var6;
                                } else if (~var8 > ~var6) {
                                    --var6;
                                }
                                if (~(class252.field3358[class210.field2808][var6][var7] & 4) != -1) {
                                    class89.method491(class186.field2421, -1, 1, var6, false, var7);
                                    return;
                                }
                                var15 += var14;
                                if (var15 >= 65536) {
                                    var15 -= 65536;
                                    if (var9 <= var7) {
                                        if (~var7 < ~var9) {
                                            --var7;
                                        }
                                    } else {
                                        ++var7;
                                    }
                                    if (~(4 & class252.field3358[class210.field2808][var6][var7]) != -1) {
                                        class89.method491(class186.field2421, -1, 1, var6, false, var7);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        client.method1256((Throwable) null, -2020, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class357.field4867 + "," + class418.field6074);
                        return;
                    }
                } else {
                    int var16 = class470.method2868(-20, class210.field2808, class238.field3171, class139.field1857);
                    if (-class267.field3572 + var16 >= 800 || ~(4 & class252.field3358[class210.field2808][class238.field3171 >> 7][class139.field1857 >> 7]) == -1) {
                        return;
                    }
                    class89.method491(class186.field2421, -1, 1, class238.field3171 >> 7, false, class139.field1857 >> 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)[[I", line = 393)
    public final int[][] method112(int arg0, boolean arg1) {
        if (!arg1) {
            method391((byte) 81);
        }
        ++field763;
        int[][] var3 = super.field3059.method28((byte) 112, arg0);
        if (super.field3059.field57) {
            int var4 = this.field756 + this.field756 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field758 + this.field758 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field756 + arg0; this.field756 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1460(class115.field1508 & var9, 0, 0);
                int[][] var20 = new int[3][class446.field6486];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field758; var27 <= this.field758; ++var27) {
                    int var37 = class102.field1388 & var27;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class446.field6486 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class102.field1388 & -this.field758 + var31;
                    int var33 = var22 - var25[var32];
                    int var34 = var23 - var26[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = this.field758 + var31 & class102.field1388;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[this.field756 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class446.field6486; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)[I", line = 530)
    public final int[] method62(int arg0, int arg1) {
        ++field757;
        int[] var3 = super.field3068.method1970(arg1, (byte) 36);
        if (arg0 != 15811) {
            this.field756 = -21;
        }
        if (super.field3068.field4480) {
            int var4 = this.field756 - -1 + this.field756;
            int var5 = 65536 / var4;
            int var6 = this.field758 - -1 + this.field758;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field756; var9 <= this.field756 + arg1; ++var9) {
                int[] var13 = this.method1459(class115.field1508 & var9, -86, 0);
                int[] var14 = new int[class446.field6486];
                int var15 = 0;
                for (int var16 = -this.field758; ~var16 >= ~this.field758; ++var16) {
                    var15 += var13[var16 & class102.field1388];
                }
                int var17 = 0;
                while (~var17 > ~class446.field6486) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field758 + var17 & class102.field1388];
                    ++var17;
                    var15 = var13[this.field758 + var17 & class102.field1388] + var18;
                }
                var8[-arg1 + var9 + this.field756] = var14;
            }
            for (int var10 = 0; ~var10 > ~class446.field6486; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }
}
