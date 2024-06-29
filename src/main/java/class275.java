import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class275 extends class93 {

    @OriginalMember(owner = "client!eb", name = "Qb", descriptor = "I")
    public static int field4631 = 1;

    @OriginalMember(owner = "client!eb", name = "Rb", descriptor = "Lhi;")
    private static class82 field4632 = class95.method664((byte) -109, "Close");

    @OriginalMember(owner = "client!eb", name = "Ob", descriptor = "Lhi;")
    public static class82 field4629 = field4632;

    @OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!eb", name = "Gb", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!eb", name = "Hb", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!eb", name = "Ib", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!eb", name = "Kb", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!eb", name = "Lb", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!eb", name = "Mb", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!eb", name = "Pb", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!eb", name = "Sb", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!eb", name = "Tb", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!eb", name = "Ub", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!eb", name = "Vb", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!eb", name = "Wb", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!eb", name = "Nb", descriptor = "Llb;")
    public class233 field4628;

    @OriginalMember(owner = "client!eb", name = "Jb", descriptor = "Lei;")
    public static class70 field4624;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V", line = 4)
    public static final void method1914(int arg0, int arg1) {
        field4620++;
        class85.method592(class85.field1528, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
        class85.method588(-50.0F, -60.0F, -50.0F);
        if (arg1 <= 61) {
            method1915((byte) -128);
        }
        class85.method594(class85.field1524, 0);
        class85.method591();
    }

    @OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() {
        field4623++;
        if (this.field1701 != null) {
            this.field1701.method2025();
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z", line = 34)
    public final boolean method516(int arg0) {
        field4622++;
        if (this.field4628 == null) {
            return false;
        } else {
            return arg0 == 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V", line = 48)
    public static final void method1915(byte arg0) {
        class314.field5412.method2168(arg0 ^ 0xFFFFFFF0);
        class19.field255.method2168(arg0 ^ 0xFFFFFFF0);
        field4625++;
        if (arg0 != -16) {
            field4629 = (class82) null;
        }
        class196.field3326.method2168(0);
        class51.field825.method2168(0);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V", line = 62)
    public static final void method1916(int arg0) {
        field4621++;
        class260.field4458.method2172(false);
        if (arg0 != 1842216080) {
            method1922(-12);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[[[BIBII)V", line = 79)
    public static final void method1917(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class14.field109++;
        class290.field4874 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class230.field3973; var12 < class62.field974; var12++) {
            class16[][] var13 = class15.field120[var12];
            for (int var14 = class87.field1546; var14 < class247.field4275; var14++) {
                for (int var15 = class126.field2218; var15 < class203.field3520; var15++) {
                    class16 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class42.field743[var14 + class71.field1095 - class137.field2363][var15 + class71.field1095 - class325.field5585] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field169 = true;
                            var16.field160 = true;
                            if (var16.field165 > 0) {
                                var16.field162 = true;
                            } else {
                                var16.field162 = false;
                            }
                            class290.field4874++;
                        } else {
                            var16.field169 = false;
                            var16.field160 = false;
                            var16.field151 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field171 != null) {
                                    class90 var17 = var16.field171;
                                    var17.field1626.method301(0, var12, var17.field1619, var17.field1620, var17.field1621);
                                    if (var17.field1617 != null) {
                                        var17.field1617.method301(0, var12, var17.field1619, var17.field1620, var17.field1621);
                                    }
                                }
                                if (var16.field172 != null) {
                                    class182 var18 = var16.field172;
                                    var18.field3103.method301(var18.field3105, var12, var18.field3102, var18.field3119, var18.field3109);
                                    if (var18.field3107 != null) {
                                        var18.field3107.method301(var18.field3105, var12, var18.field3102, var18.field3119, var18.field3109);
                                    }
                                }
                                if (var16.field161 != null) {
                                    class123 var19 = var16.field161;
                                    var19.field2150.method301(0, var12, var19.field2151, var19.field2158, var19.field2148);
                                }
                                if (var16.field158 != null) {
                                    for (int var20 = 0; var20 < var16.field165; var20++) {
                                        class69 var21 = var16.field158[var20];
                                        var21.field1075.method301(var21.field1074, var12, var21.field1078, var21.field1067, var21.field1072);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class245.field4255 == class150.field2560;
        if (class147.field2485) {
            GL var23 = class147.field2479;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class242.method1738();
                class171.method1211(3, -1, false);
                class193.field3276 = true;
                class319.method2194();
                class130.field2255 = -1;
                class230.field3975 = -1;
                for (int var24 = 0; var24 < class171.field2949[0].length; var24++) {
                    class108 var25 = class171.field2949[0][var24];
                    float var26 = 251.5F - (var25.field1915 ? 1.0F : 0.5F);
                    if (class130.field2255 != var25.field1921) {
                        class130.field2255 = var25.field1921;
                        client.method859(var25.field1921, (byte) 91);
                        class85.method595(class51.method361(-120));
                    }
                    var25.method736(class15.field120, var26, false);
                }
                class319.method2195();
            } else {
                int var27 = class230.field3973;
                while (true) {
                    if (var27 >= class62.field974) {
                        class2.method7(class137.field2363, class325.field5585, class15.field120);
                        break;
                    }
                    for (int var28 = 0; var28 < class171.field2949[var27].length; var28++) {
                        class108 var29 = class171.field2949[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field1915 ? 1.0F : 0.5F);
                        if (var29.field1906 != -1 && class102.field1821.method628(126, var29.field1906) == 4 && class126.field2220) {
                            client.method859(var29.field1921, (byte) 75);
                        }
                        var29.method736(class15.field120, var30, false);
                    }
                    if (var27 == 0 && class33.field504 > 0) {
                        class147.method1020(101.5F);
                        class248.method1787(class137.field2363, class325.field5585, class71.field1095, arg1, class42.field743, class245.field4255[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class230.field3973; var31 < class62.field974; var31++) {
            class16[][] var32 = class15.field120[var31];
            for (int var33 = -class71.field1095; var33 <= 0; var33++) {
                int var34 = class137.field2363 + var33;
                int var35 = class137.field2363 - var33;
                if (var34 >= class87.field1546 || var35 < class247.field4275) {
                    for (int var36 = -class71.field1095; var36 <= 0; var36++) {
                        int var37 = class325.field5585 + var36;
                        int var38 = class325.field5585 - var36;
                        if (var34 >= class87.field1546) {
                            if (var37 >= class126.field2218) {
                                class16 var39 = var32[var34][var37];
                                if (var39 != null && var39.field169) {
                                    class39.method303(var39, true);
                                }
                            }
                            if (var38 < class203.field3520) {
                                class16 var40 = var32[var34][var38];
                                if (var40 != null && var40.field169) {
                                    class39.method303(var40, true);
                                }
                            }
                        }
                        if (var35 < class247.field4275) {
                            if (var37 >= class126.field2218) {
                                class16 var41 = var32[var35][var37];
                                if (var41 != null && var41.field169) {
                                    class39.method303(var41, true);
                                }
                            }
                            if (var38 < class203.field3520) {
                                class16 var42 = var32[var35][var38];
                                if (var42 != null && var42.field169) {
                                    class39.method303(var42, true);
                                }
                            }
                        }
                        if (class290.field4874 == 0) {
                            if (!var22) {
                                class257.field4414 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class230.field3973; var43 < class62.field974; var43++) {
            class16[][] var44 = class15.field120[var43];
            for (int var45 = -class71.field1095; var45 <= 0; var45++) {
                int var46 = class137.field2363 + var45;
                int var47 = class137.field2363 - var45;
                if (var46 >= class87.field1546 || var47 < class247.field4275) {
                    for (int var48 = -class71.field1095; var48 <= 0; var48++) {
                        int var49 = class325.field5585 + var48;
                        int var50 = class325.field5585 - var48;
                        if (var46 >= class87.field1546) {
                            if (var49 >= class126.field2218) {
                                class16 var51 = var44[var46][var49];
                                if (var51 != null && var51.field169) {
                                    class39.method303(var51, false);
                                }
                            }
                            if (var50 < class203.field3520) {
                                class16 var52 = var44[var46][var50];
                                if (var52 != null && var52.field169) {
                                    class39.method303(var52, false);
                                }
                            }
                        }
                        if (var47 < class247.field4275) {
                            if (var49 >= class126.field2218) {
                                class16 var53 = var44[var47][var49];
                                if (var53 != null && var53.field169) {
                                    class39.method303(var53, false);
                                }
                            }
                            if (var50 < class203.field3520) {
                                class16 var54 = var44[var47][var50];
                                if (var54 != null && var54.field169) {
                                    class39.method303(var54, false);
                                }
                            }
                        }
                        if (class290.field4874 == 0) {
                            if (!var22) {
                                class257.field4414 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class257.field4414 = false;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILlb;)V", line = 451)
    public final void method1918(int arg0, class233 arg1) {
        field4626++;
        this.field4628 = arg1;
        if (arg0 <= 52) {
            this.method301(-75, -70, -27, 44, -41);
        }
        if (this.field1701 != null) {
            this.field1701.method2038();
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lhi;Z)I", line = 471)
    public static final int method1919(class82 arg0, boolean arg1) {
        field4635++;
        if (class297.field5057 == null || arg0.method535(!arg1) == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class297.field5057.field4312; var2++) {
            if (class297.field5057.field4308[var2].method547(arg1, class78.field1332, class29.field400).method533(57, arg0)) {
                return var2;
            }
        }
        if (arg1) {
            field4631 = 44;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Z)V", line = 498)
    public static final void method1920(boolean arg0) {
        class260.field4458.method2168(0);
        if (arg0) {
            field4624 = (class70) null;
        }
        field4636++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V", line = 509)
    public final void method301(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4627++;
        if (this.field4628 == null) {
            return;
        }
        if (!this.field1696) {
            class35 var6 = this.field1709 != -1 && this.field1671 == 0 ? class284.method1973(this.field1709, false) : null;
            class35 var7 = this.field1668 == -1 || this.field1703 == this.field1668 && var6 != null ? null : class284.method1973(this.field1668, false);
            class155 var8 = this.field4628.method1662(var7, (byte) -14, this.field1659, var6, this.field1692);
            if (var8 == null) {
                return;
            }
            this.method658(false, var8);
        }
        if (this.field1701 != null) {
            this.field1701.method2034(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILkk;)V", line = 547)
    public static final void method1921(int arg0, class73 arg1) {
        if (arg0 != -1) {
            field4632 = (class82) null;
        }
        class315.field5424 = arg1;
        field4633++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()I", line = 558)
    public final int method238() {
        field4630++;
        return this.field1687;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIJILab;)V", line = 569)
    public final void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10) {
        field4634++;
        if (this.field4628 == null) {
            return;
        }
        class35 var13 = this.field1709 != -1 && this.field1671 == 0 ? class284.method1973(this.field1709, false) : null;
        class35 var14 = this.field1668 == -1 || this.field1703 == this.field1668 && var13 != null ? null : class284.method1973(this.field1668, false);
        class155 var15 = this.field4628.method1662(var14, (byte) -14, this.field1659, var13, this.field1692);
        if (var15 == null) {
            return;
        }
        this.field1687 = var15.method238();
        class233 var16 = this.field4628;
        if (var16.field4063 != null) {
            var16 = var16.method1652(false);
        }
        if (class208.field3641 && var16.field4082) {
            class155 var17 = class73.method460(var14 == null ? this.field1659 : this.field1692, this.field4628.field4052, var15, this.field1657, this.field1685, this.field4628.field4041, this.field4628.field4056, 115, this.field4628.field4039, arg0, this.field4628.field4075, var14 == null ? var13 : var14, this.field1689, this.field1705);
            if (class147.field2485) {
                float var18 = class147.method1009();
                float var19 = class147.method1011();
                class147.method1001();
                class147.method1010(var18, var19 - 150.0F);
                var17.method209(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1701);
                class147.method1006();
                class147.method1010(var18, var19);
            } else {
                var17.method209(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field1701);
            }
        }
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (this.field4628.field4074 != 0 || this.field4628.field4051 != 0) {
            int var23 = class102.field1813[arg0];
            int var24 = class102.field1819[arg0];
            short var25 = this.field4628.field4074;
            short var26 = this.field4628.field4051;
            int var27 = -var25 / 2;
            int var28 = -var26 / 2;
            int var29 = var23 * var28 + var24 * var27 >> 16;
            int var30 = var25 / 2;
            int var31 = var24 * var28 - (var23 * var27) >> 16;
            int var32 = class21.method145(this.field1685 + var29, this.field1689 + var31, class297.field5058, (byte) -117);
            int var33 = -var26 / 2;
            int var34 = var23 * var33 + var24 * var30 >> 16;
            int var35 = var24 * var33 - (var23 * var30) >> 16;
            int var36 = -var25 / 2;
            int var37 = class21.method145(this.field1685 + var34, this.field1689 + var35, class297.field5058, (byte) 82);
            int var38 = var26 / 2;
            int var39 = var23 * var38 + var24 * var36 >> 16;
            int var40 = var24 * var38 - (var23 * var36) >> 16;
            int var41 = class21.method145(this.field1685 + var39, this.field1689 + var40, class297.field5058, (byte) 101);
            int var42 = var25 / 2;
            int var43 = var26 / 2;
            int var44 = var24 * var43 - var23 * var42 >> 16;
            int var45 = var23 * var43 + var24 * var42 >> 16;
            int var46 = class21.method145(this.field1685 + var45, this.field1689 + var44, class297.field5058, (byte) 68);
            int var47 = var32 + var46;
            if ((var37 + var41) < var47) {
                var47 = var37 + var41;
            }
            int var48 = var37 > var32 ? var32 : var37;
            int var49 = var46 <= var41 ? var46 : var41;
            int var50 = var41 > var32 ? var32 : var41;
            int var51 = var46 > var37 ? var37 : var46;
            if (var26 != 0) {
                var20 = (int) (Math.atan2((double) (var48 - var49), (double) var26) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var15.method217(var20);
                }
            }
            if (var25 != 0) {
                var22 = (int) (Math.atan2((double) (var50 - var51), (double) var25) * 325.95D) & 0x7FF;
                if (var22 != 0) {
                    var15.method241(var22);
                }
            }
            var21 = (var47 >> 1) - this.field1657;
            if (var21 != 0) {
                var15.method224(0, var21, 0);
            }
        }
        class155 var52 = null;
        if (this.field1715 != -1 && this.field1678 != -1) {
            class64 var53 = class187.method1289(this.field1715, (byte) 120);
            var52 = var53.method412((byte) 63, this.field1678);
            if (var52 != null) {
                var52.method224(0, -this.field1721, 0);
                if (var53.field1008) {
                    if (var20 != 0) {
                        var52.method217(var20);
                    }
                    if (var22 != 0) {
                        var52.method241(var22);
                    }
                    if (var21 != 0) {
                        var52.method224(0, var21, 0);
                    }
                }
            }
        }
        if (!class147.field2485) {
            if (var52 != null) {
                var15 = ((class318) var15).method2189(var52);
            }
            this.method658(false, var15);
            if (this.field4628.field4052 == 1) {
                var15.field2652 = true;
            }
            var15.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1701);
            return;
        }
        this.method658(false, var15);
        if (this.field4628.field4052 == 1) {
            var15.field2652 = true;
        }
        var15.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1701);
        if (var52 == null) {
            return;
        }
        if (this.field4628.field4052 == 1) {
            var52.field2652 = true;
        }
        if (this.field1701 != null) {
            class30 var54 = (class30) var52;
            this.field1701.method2029(var54.field408, var54.field436, true, var54.field427, var54.field422, var54.field418);
        }
        var52.method209(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1701);
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V", line = 788)
    public static void method1922(int arg0) {
        if (arg0 == 0) {
            field4629 = null;
            field4632 = null;
            field4624 = null;
        }
    }
}
