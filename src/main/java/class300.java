import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public abstract class class300 extends class247 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Z")
    public boolean field4784;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "[Lnb;")
    public class300[] field4792;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static volatile int field4794 = 0;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public int field4785;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "Lcg;")
    public class38 field4797;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lth;")
    public class79 field4786;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public void method144(int arg0) {
        field4787++;
        if (arg0 < 126) {
            this.method35((class170) null, (byte) 7, 63);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I")
    public int[] method99(int arg0, int arg1) {
        field4788++;
        if (arg1 == -957953300) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public void method405(byte arg0) {
        if (arg0 != 67) {
            field4794 = -13;
        }
        if (this.field4784) {
            this.field4797.method220((byte) 57);
            this.field4797 = null;
        } else {
            this.field4786.method539((byte) -95);
            this.field4786 = null;
        }
        field4796++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lim;BI)V")
    public void method35(class170 arg0, byte arg1, int arg2) {
        if (arg1 > -43) {
            this.method2021(12, true, -79);
        }
        field4793++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
    public static final void method2017(int arg0) {
        int var1 = class306.field4885.method1491(class177.field2783);
        field4782++;
        for (int var2 = 0; var2 < class173.field2721; var2++) {
            int var6 = class306.field4885.method1491(class211.method1463(-81, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        if (arg0 < 30) {
            method2017(96);
        }
        int var3 = class173.field2721 * 15 + 21;
        int var4 = class24.field305 - (var1 / 2);
        if (var4 + var1 > class112.field1626) {
            var4 = class112.field1626 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class46.field566;
        if (var3 + var5 > class126.field1814) {
            var5 = class126.field1814 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class150.field2210 == 1) {
            if (class24.field305 == class190.field2957 && class46.field566 == class270.field4397) {
                class89.field1332 = var1;
                class311.field4995 = true;
                class150.field2210 = 0;
                class45.field548 = var4;
                class206.field3229 = var5;
                class249.field4040 = (class298.field4758 ? 26 : 22) + class173.field2721 * 15;
            }
        } else if (class24.field305 == class171.field2686 && class46.field566 == class223.field3493) {
            class249.field4040 = (class298.field4758 ? 26 : 22) + class173.field2721 * 15;
            class89.field1332 = var1;
            class311.field4995 = true;
            class150.field2210 = 0;
            class206.field3229 = var5;
            class45.field548 = var4;
        } else {
            class190.field2957 = class171.field2686;
            class150.field2210 = 1;
            class270.field4397 = class223.field3493;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)[I")
    public final int[] method2018(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method406((byte) 5);
        }
        field4780++;
        return this.field4792[arg0].field4784 ? this.field4792[arg0].method99(arg2, -957953300) : this.field4792[arg0].method36(-59, arg2)[0];
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([Lji;IIZII[BI)[I")
    public static final int[] method2019(class99[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        field4783++;
        byte var8;
        if (arg3) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg3) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg2 + var10) > 0 && (arg2 + var10) < 103 && arg1 + var11 > 0 && (arg1 + var11) < 103) {
                            arg0[var9].field1493[arg2 + var10][arg1 + var11] = class205.method1411(arg0[var9].field1493[arg2 + var10][arg1 + var11], -2097153);
                        }
                    }
                }
            }
        }
        class170 var12 = new class170(arg6);
        int var13 = arg1 + arg5;
        int var14 = arg2 + arg7;
        for (int var15 = arg4; var15 < var8; var15++) {
            for (int var39 = 0; var39 < 64; var39++) {
                for (int var40 = 0; var40 < 64; var40++) {
                    class111.method737(0, var13 + var40, var12, arg4 + 95, var14 + var39, arg1 + var40, arg3, 0, false, arg2 + var39, var15, 0);
                }
            }
        }
        boolean var16 = false;
        boolean var17 = false;
        while (var12.field2650.length > var12.field2676) {
            int var18 = var12.method1218(63);
            if (var18 == 128) {
                var16 = true;
                class268.field4351[0] = var12.method1186((byte) -94);
                class268.field4351[1] = var12.method1193(-1);
                class268.field4351[2] = var12.method1193(-1);
                class268.field4351[3] = var12.method1193(-1);
                class268.field4351[4] = var12.method1186((byte) -104);
            } else {
                if (var18 != 129) {
                    var12.field2676--;
                    break;
                }
                var17 = true;
                for (int var24 = 0; var24 < 4; var24++) {
                    byte var25 = var12.method1215(128);
                    if (var25 == 0) {
                        int var35 = arg1;
                        if (arg1 < 0) {
                            var35 = 0;
                        } else if (arg1 >= 104) {
                            var35 = 104;
                        }
                        int var36 = arg2 + 64;
                        if (var36 < 0) {
                            var36 = 0;
                        } else if (var36 >= 104) {
                            var36 = 104;
                        }
                        int var37 = arg2;
                        if (arg2 < 0) {
                            var37 = 0;
                        } else if (arg2 >= 104) {
                            var37 = 104;
                        }
                        int var38 = arg1 + 64;
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 >= 104) {
                            var38 = 104;
                        }
                        while (var36 > var37) {
                            while (var35 < var38) {
                                class15.field218[var24][var37][var35] = 0;
                                var35++;
                            }
                            var37++;
                        }
                    } else if (var25 == 1) {
                        for (int var26 = 0; var26 < 64; var26 += 4) {
                            for (int var27 = 0; var27 < 64; var27 += 4) {
                                byte var28 = var12.method1215(128);
                                for (int var29 = arg2 + var26; var29 < (arg2 + var26 + 4); var29++) {
                                    for (int var30 = arg1 + var27; var30 < (var27 + arg1 + 4); var30++) {
                                        if (var29 >= 0 && var29 < 104 && var30 >= 0 && var30 < 104) {
                                            class15.field218[var24][var29][var30] = var28;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var25 == 2 && var24 > 0) {
                        int var31 = arg2 + 64;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 >= 104) {
                            var31 = 104;
                        }
                        int var32 = arg1;
                        int var33 = arg1 + 64;
                        if (var33 < 0) {
                            var33 = 0;
                        } else if (var33 >= 104) {
                            var33 = 104;
                        }
                        int var34 = arg2;
                        if (arg2 < 0) {
                            var34 = 0;
                        } else if (arg2 >= 104) {
                            var34 = 104;
                        }
                        if (arg1 < 0) {
                            var32 = 0;
                        } else if (arg1 >= 104) {
                            var32 = 104;
                        }
                        while (var34 < var31) {
                            while (var33 > var32) {
                                class15.field218[var24][var34][var32] = class15.field218[var24 - 1][var34][var32];
                                var32++;
                            }
                            var34++;
                        }
                    }
                }
            }
        }
        if (!var17) {
            for (int var19 = 0; var19 < 4; var19++) {
                for (int var20 = 0; var20 < 16; var20++) {
                    for (int var21 = 0; var21 < 16; var21++) {
                        int var22 = (arg2 >> 2) + var20;
                        int var23 = (arg1 >> 2) + var21;
                        if (var22 >= 0 && var22 < 26 && var23 >= 0 && var23 < 26) {
                            class15.field218[var19][var22][var23] = 0;
                        }
                    }
                }
            }
        }
        if (var16) {
            return class268.field4351;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)I")
    public static final int method2020(int arg0, byte arg1, int arg2) {
        field4778++;
        class182 var3 = (class182) class38.field464.method1064(-1, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            int var4 = -16 / ((38 - arg1) / 43);
            return arg2 >= 0 && arg2 < var3.field2864.length ? var3.field2864[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZI)[[I")
    public final int[][] method2021(int arg0, boolean arg1, int arg2) {
        field4791++;
        if (arg1) {
            this.method2022(-85, (byte) -97, -41);
        }
        if (this.field4792[arg2].field4784) {
            int[] var4 = this.field4792[arg2].method99(arg0, -957953300);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4792[arg2].method36(49, arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[[I")
    public int[][] method36(int arg0, int arg1) {
        int var3 = -57 / (-arg0 / 47);
        field4790++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)I")
    public int method406(byte arg0) {
        field4789++;
        if (arg0 >= -40) {
            method2023(102, -108, -109, 49, true, (byte) -106, false);
        }
        return -1;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IBI)V")
    public final void method2022(int arg0, byte arg1, int arg2) {
        field4781++;
        int var4 = -37 / ((-arg1 - 37) / 55);
        int var5 = this.field4785 == 255 ? arg2 : this.field4785;
        if (this.field4784) {
            this.field4797 = new class38(var5, arg2, arg0);
        } else {
            this.field4786 = new class79(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)I")
    public int method1864(int arg0) {
        field4795++;
        int var2 = -50 % ((-arg0 - 68) / 39);
        return -1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZBZ)V")
    public static final void method2023(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, boolean arg6) {
        field4779++;
        if (arg1 == 3) {
            method2023(-1, class173.field2723, -1, arg3, true, (byte) 62, true);
            return;
        }
        Container var7;
        if (class123.field1771 != null) {
            var7 = class123.field1771;
        } else if (class73.field1086 == null) {
            var7 = class95.field1425.field3832;
        } else {
            var7 = class73.field1086;
        }
        class14.field210 = var7.getSize().width;
        class278.field4556 = var7.getSize().height;
        if (class73.field1086 == var7) {
            Insets var8 = class73.field1086.getInsets();
            class278.field4556 -= var8.top + var8.bottom;
            class14.field210 -= var8.left + var8.right;
        }
        if (arg1 < 2) {
            class152.field2272 = (class14.field210 - 765) / 2;
            class152.field2274 = 0;
            class112.field1626 = 765;
            class126.field1814 = 503;
        } else {
            class112.field1626 = class14.field210;
            class126.field1814 = class278.field4556;
            class152.field2272 = 0;
            class152.field2274 = 0;
        }
        if (arg4) {
            class229.method1612(class304.field4831, (byte) -95);
            class55.method358(class304.field4831, (byte) 68);
            if (class80.field1224 != null) {
                class80.field1224.method16(2, class304.field4831);
            }
            class197.field3117.method1785((byte) -94);
            class296.method1995((byte) -66, class304.field4831);
            class187.method1315(class304.field4831, -28500);
            if (class80.field1224 != null) {
                class80.field1224.method14(-92, class304.field4831);
            }
        } else {
            class304.field4831.setSize(class112.field1626, class126.field1814);
            if (class73.field1086 == var7) {
                Insets var9 = class73.field1086.getInsets();
                class304.field4831.setLocation(class152.field2272 + var9.left, class152.field2274 + var9.top);
            } else {
                class304.field4831.setLocation(class152.field2272, class152.field2274);
            }
        }
        if (arg1 > 0) {
            method2023(-1, 0, -1, arg3, true, (byte) 122, true);
            return;
        }
        if (arg5 < 30) {
            method2020(66, (byte) 82, 89);
        }
        class15.field216 = !class60.method384(-4);
        class65.method424(class112.field1626, class126.field1814);
        if (class238.field3824 != -1) {
            class287.method1960(true, (byte) 45);
        }
        if (class270.field4405 != null && (class40.field480 == 30 || class40.field480 == 25)) {
            class38.method218(120);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class302.field4808[var10] = true;
        }
        class192.field3052 = true;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IZ)V")
    public class300(int arg0, boolean arg1) {
        this.field4784 = arg1;
        this.field4792 = new class300[arg0];
    }
}
