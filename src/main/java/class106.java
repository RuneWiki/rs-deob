import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class106 extends class23 {

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
    private int field1860 = 6;

    @OriginalMember(owner = "client!pk", name = "fb", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "F")
    public static float field1857;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!pk", name = "eb", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!pk", name = "gb", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!pk", name = "hb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!pk", name = "ib", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!pk", name = "jb", descriptor = "Ljava/awt/Frame;")
    public static Frame field1867;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V", line = 6)
    public static void method792(byte arg0) {
        field1867 = null;
        if (arg0 > -46) {
            method796(112, 22, (class239) null, -120);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILsd;)V", line = 17)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field1860 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field415 = arg2.method226(255) == 1;
        }
        field1861++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[I", line = 54)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            field1863 = 10;
        }
        int[] var3 = this.field403.method724((byte) 103, arg1);
        field1866++;
        if (this.field403.field1760) {
            int[] var4 = this.method174(0, 0, arg1);
            int[] var5 = this.method174(1, 0, arg1);
            int var6 = this.field1860;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class52.field1007; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class52.field1007; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var7 = 0; var7 < class52.field1007; var7++) {
                    var3[var7] = var4[var7] * var5[var7] >> 12;
                }
            } else if (var6 == 4) {
                for (int var8 = 0; var8 < class52.field1007; var8++) {
                    int var9 = var5[var8];
                    var3[var8] = var9 == 0 ? 4096 : (var4[var8] << 12) / var9;
                }
            } else if (var6 == 5) {
                for (int var10 = 0; var10 < class52.field1007; var10++) {
                    var3[var10] = 4096 - ((4096 - var4[var10]) * (4096 - var5[var10]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var27 = 0; var27 < class52.field1007; var27++) {
                    int var28 = var5[var27];
                    var3[var27] = var28 >= 2048 ? 4096 - ((4096 - var4[var27]) * (4096 - var28) >> 11) : var4[var27] * var28 >> 11;
                }
            } else if (var6 == 7) {
                for (int var25 = 0; var25 < class52.field1007; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 4096 ? 4096 : (var5[var25] << 12) / (4096 - var26);
                }
            } else if (var6 == 8) {
                for (int var23 = 0; var23 < class52.field1007; var23++) {
                    int var24 = var4[var23];
                    var3[var23] = var24 == 0 ? 0 : 4096 - (4096 - var5[var23] << 12) / var24;
                }
            } else if (var6 == 9) {
                for (int var20 = 0; var20 < class52.field1007; var20++) {
                    int var21 = var5[var20];
                    int var22 = var4[var20];
                    var3[var20] = var22 >= var21 ? var21 : var22;
                }
            } else if (var6 == 10) {
                for (int var17 = 0; var17 < class52.field1007; var17++) {
                    int var18 = var4[var17];
                    int var19 = var5[var17];
                    var3[var17] = var19 < var18 ? var18 : var19;
                }
            } else if (var6 == 11) {
                for (int var11 = 0; var11 < class52.field1007; var11++) {
                    int var12 = var5[var11];
                    int var13 = var4[var11];
                    var3[var11] = var12 >= var13 ? var12 - var13 : -var12 + var13;
                }
            } else if (var6 == 12) {
                for (int var14 = 0; var14 < class52.field1007; var14++) {
                    int var15 = var5[var14];
                    int var16 = var4[var14];
                    var3[var14] = var15 + var16 - (var15 * var16 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V", line = 297)
    public static final void method793(int arg0) {
        field1856++;
        class312.method2157();
        class172.field2806 = -1;
        class252.field4189 = null;
        class78.method582(-122);
        class82.field1434.method985(-55);
        class104.field1839 = new class294();
        ((class212) class203.field3217).method1496((byte) -30);
        class84.field1452 = new class90[255];
        class84.field1462 = 0;
        class152.method1185();
        class241.method1688();
        if (arg0 >= -56) {
            method794(29, -17, -62, 13, -3, 34, -38, -72);
        }
        class119.method899(99);
        class257.method1805(false, 0);
        class239.method1679((byte) 85);
        for (int var1 = 0; var1 < 2048; var1++) {
            class258 var2 = class298.field4979[var1];
            if (var2 != null) {
                var2.field4305 = null;
            }
        }
        if (class21.field350) {
            class241.method1687(104, 104);
        }
        class148.method1116(class120.field2030, -9875, class41.field791);
        class307.method2100((byte) -33, class120.field2030);
        if (class6.field87 == 5) {
            class268.method1865(class120.field2030, false);
        }
        if (class6.field87 == 10) {
            class251.method1777(-1, false);
        }
        if (class6.field87 == 30) {
            class271.method1879(25, 17646);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 354)
    public class106() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[[I", line = 363)
    public final int[][] method17(int arg0, int arg1) {
        if (arg0 <= 30) {
            return (int[][]) ((int[][]) null);
        }
        field1859++;
        int[][] var3 = this.field417.method1251(arg1, 123);
        if (this.field417.field2751) {
            int[][] var4 = this.method173(0, arg1, (byte) 6);
            int[][] var5 = this.method173(1, arg1, (byte) 83);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var4[1];
            int[] var11 = var5[1];
            int[] var12 = var5[0];
            int[] var13 = var5[2];
            int[] var14 = var4[0];
            int var15 = this.field1860;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class52.field1007; var16++) {
                    var6[var16] = var14[var16] + var12[var16];
                    var7[var16] = var10[var16] + var11[var16];
                    var8[var16] = var9[var16] + var13[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class52.field1007; var17++) {
                    var6[var17] = var14[var17] - var12[var17];
                    var7[var17] = var10[var17] - var11[var17];
                    var8[var17] = var9[var17] - var13[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class52.field1007; var18++) {
                    var6[var18] = var12[var18] * var14[var18] >> 12;
                    var7[var18] = var10[var18] * var11[var18] >> 12;
                    var8[var18] = var9[var18] * var13[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var19 = 0; var19 < class52.field1007; var19++) {
                    int var20 = var12[var19];
                    int var21 = var11[var19];
                    int var22 = var13[var19];
                    var6[var19] = var20 == 0 ? 4096 : (var14[var19] << 12) / var20;
                    var7[var19] = var21 == 0 ? 4096 : (var10[var19] << 12) / var21;
                    var8[var19] = var22 == 0 ? 4096 : (var9[var19] << 12) / var22;
                }
            } else if (var15 == 5) {
                for (int var63 = 0; var63 < class52.field1007; var63++) {
                    var6[var63] = 4096 - ((4096 - var12[var63]) * (4096 - var14[var63]) >> 12);
                    var7[var63] = 4096 - ((4096 - var10[var63]) * (4096 - var11[var63]) >> 12);
                    var8[var63] = 4096 - ((4096 - var9[var63]) * (4096 - var13[var63]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var23 = 0; var23 < class52.field1007; var23++) {
                    int var24 = var11[var23];
                    int var25 = var13[var23];
                    int var26 = var12[var23];
                    var6[var23] = var26 < 2048 ? var14[var23] * var26 >> 11 : 4096 - ((4096 - var14[var23]) * (4096 - var26) >> 11);
                    var7[var23] = var24 < 2048 ? var10[var23] * var24 >> 11 : 4096 - ((4096 - var10[var23]) * (4096 - var24) >> 11);
                    var8[var23] = var25 < 2048 ? var9[var23] * var25 >> 11 : 4096 - ((4096 - var25) * (4096 - var9[var23]) >> 11);
                }
            } else if (var15 == 7) {
                for (int var59 = 0; var59 < class52.field1007; var59++) {
                    int var60 = var9[var59];
                    int var61 = var14[var59];
                    int var62 = var10[var59];
                    var6[var59] = var61 == 4096 ? 4096 : (var12[var59] << 12) / (4096 - var61);
                    var7[var59] = var62 == 4096 ? 4096 : (var11[var59] << 12) / (4096 - var62);
                    var8[var59] = var60 == 4096 ? 4096 : (var13[var59] << 12) / (4096 - var60);
                }
            } else if (var15 == 8) {
                for (int var27 = 0; var27 < class52.field1007; var27++) {
                    int var28 = var10[var27];
                    int var29 = var14[var27];
                    int var30 = var9[var27];
                    var6[var27] = var29 == 0 ? 0 : 4096 - ((4096 - var12[var27] << 12) / var29);
                    var7[var27] = var28 == 0 ? 0 : 4096 - ((4096 - var11[var27] << 12) / var28);
                    var8[var27] = var30 == 0 ? 0 : 4096 - ((4096 - var13[var27] << 12) / var30);
                }
            } else if (var15 == 9) {
                for (int var31 = 0; var31 < class52.field1007; var31++) {
                    int var32 = var9[var31];
                    int var33 = var11[var31];
                    int var34 = var10[var31];
                    int var35 = var13[var31];
                    int var36 = var12[var31];
                    int var37 = var14[var31];
                    var6[var31] = var36 <= var37 ? var36 : var37;
                    var7[var31] = var33 <= var34 ? var33 : var34;
                    var8[var31] = var32 < var35 ? var32 : var35;
                }
            } else if (var15 == 10) {
                for (int var38 = 0; var38 < class52.field1007; var38++) {
                    int var39 = var10[var38];
                    int var40 = var14[var38];
                    int var41 = var13[var38];
                    int var42 = var11[var38];
                    int var43 = var12[var38];
                    int var44 = var9[var38];
                    var6[var38] = var43 < var40 ? var40 : var43;
                    var7[var38] = var42 < var39 ? var39 : var42;
                    var8[var38] = var44 > var41 ? var44 : var41;
                }
            } else if (var15 == 11) {
                for (int var52 = 0; var52 < class52.field1007; var52++) {
                    int var53 = var9[var52];
                    int var54 = var14[var52];
                    int var55 = var13[var52];
                    int var56 = var12[var52];
                    int var57 = var11[var52];
                    int var58 = var10[var52];
                    var6[var52] = var54 > var56 ? var54 - var56 : -var54 + var56;
                    var7[var52] = var57 >= var58 ? var57 - var58 : -var57 + var58;
                    var8[var52] = var53 <= var55 ? var55 - var53 : -var55 + var53;
                }
            } else if (var15 == 12) {
                for (int var45 = 0; var45 < class52.field1007; var45++) {
                    int var46 = var10[var45];
                    int var47 = var12[var45];
                    int var48 = var13[var45];
                    int var49 = var11[var45];
                    int var50 = var14[var45];
                    int var51 = var9[var45];
                    var6[var45] = var47 + var50 - (var47 * var50 >> 11);
                    var7[var45] = var46 + var49 - (var46 * var49 >> 11);
                    var8[var45] = var48 + var51 - (var48 * var51 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIII)Z", line = 676)
    public static final boolean method794(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V", line = 704)
    public static final void method795(int arg0) {
        class220.method1541(2000, 5);
        class300.method2048(-4251, 5);
        class25.method185(5, 0);
        class126.method942((byte) 64, 5);
        class86.method659((byte) -123, 5);
        class3.method11(5, 110);
        field1864++;
        class133.method979(5, -121);
        class19.method119(-256, 5);
        class129.method961(true, 5);
        class226.method1585(5, -95);
        class178.method1315(-50, 5);
        if (arg0 > -46) {
            method797(-120, -127);
        }
        class118.method887(50, (byte) 65);
        class17.method97(8, 5);
        class313.method2165(5, true);
        class293.field4905.method1348(0, 5);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILce;I)Lda;", line = 734)
    public static final class114 method796(int arg0, int arg1, class239 arg2, int arg3) {
        field1858++;
        if (arg0 == -29252) {
            return class272.method1881(arg2, arg3, arg1, arg0 + 30181) ? class12.method80(-32768) : null;
        } else {
            return (class114) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)Lqd;", line = 753)
    public static final class40 method797(int arg0, int arg1) {
        field1862++;
        if (arg0 >= 999999999) {
            if (arg1 != -101) {
                field1863 = 127;
            }
            return class302.field5068;
        } else {
            return class276.method1927((byte) -104, arg0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBII)V", line = 782)
    public static final void method798(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class165.field2733 = arg5;
        field1865++;
        class317.field5367 = arg1;
        class118.field2002 = arg4;
        int var6 = -49 / ((-arg3 - 19) / 35);
        class228.field3775 = arg2;
        class186.field3007 = arg0;
        if (class165.field2733 >= 100) {
            int var7 = class228.field3775 * 128 + 64;
            int var8 = class186.field3007 * 128 + 64;
            int var9 = class293.method2012(class160.field2671, var7, 0, var8) - class118.field2002;
            int var10 = var9 - class116.field1988;
            int var11 = var8 - class238.field3922;
            int var12 = var7 - class289.field4841;
            int var13 = (int) Math.sqrt((double) (var11 * var11 + var12 * var12));
            class58.field1107 = (int) (Math.atan2((double) var10, (double) var13) * 325.949D) & 0x7FF;
            class181.field2949 = (int) (Math.atan2((double) var11, (double) var12) * -325.949D) & 0x7FF;
            if (class58.field1107 < 128) {
                class58.field1107 = 128;
            }
            if (class58.field1107 > 383) {
                class58.field1107 = 383;
            }
        }
        class103.field1814 = 2;
    }
}
