import java.awt.Canvas;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class224 extends class112 {

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field3637 = 127;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "Lwm;")
    public static class152 field3638 = class157.method1048("::errortest", 99);

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "Lwm;")
    public static class152 field3640 = class157.method1048("Lade Liste der Welten", 108);

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "[I")
    public static int[] field3642 = new int[2];

    @OriginalMember(owner = "client!fl", name = "T", descriptor = "Lwm;")
    public static class152 field3644 = class157.method1048("Texturen geladen)3", 111);

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lwm;")
    public static class152 field3641 = class157.method1048("Cabbage", 111);

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fl", name = "S", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fl", name = "U", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!fl", name = "W", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!fl", name = "Y", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!fl", name = "Z", descriptor = "Lah;")
    public static class205 field3650;

    @OriginalMember(owner = "client!fl", name = "V", descriptor = "Lle;")
    public static class244 field3646;

    @OriginalMember(owner = "client!fl", name = "X", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3648;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(III)Z", line = 9)
    public static final boolean method1544(int arg0, int arg1, int arg2) {
        int var3 = class227.field3700[arg0][arg1][arg2];
        if (-class244.field4064 == var3) {
            return false;
        } else if (class244.field4064 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class150.method943(var4 + 1, class65.field984[arg0][arg1][arg2], var5 + 1) && class150.method943(var4 + 128 - 1, class65.field984[arg0][arg1 + 1][arg2], var5 + 1) && class150.method943(var4 + 128 - 1, class65.field984[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class150.method943(var4 + 1, class65.field984[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class227.field3700[arg0][arg1][arg2] = class244.field4064;
                return true;
            } else {
                class227.field3700[arg0][arg1][arg2] = -class244.field4064;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILhi;)V", line = 37)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 == 31164) {
            field3649++;
            if (arg1 == 0) {
                this.field1591 = arg2.method2011(-77) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 51)
    public class224() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III[[[BIBII)V", line = 56)
    public static final void method1545(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class244.field4064++;
        class282.field4801 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class167.field2626; var12 < class17.field248; var12++) {
            class34[][] var13 = class287.field4857[var12];
            for (int var14 = class195.field3130; var14 < class134.field2068; var14++) {
                for (int var15 = class237.field3878; var15 < class314.field5445; var15++) {
                    class34 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class142.field2188[var14 + class245.field4087 - class84.field1162][var15 + class245.field4087 - class202.field3259] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field559 = true;
                            var16.field557 = true;
                            if (var16.field579 > 0) {
                                var16.field577 = true;
                            } else {
                                var16.field577 = false;
                            }
                            class282.field4801++;
                        } else {
                            var16.field559 = false;
                            var16.field557 = false;
                            var16.field569 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field573 != null) {
                                    class294 var17 = var16.field573;
                                    var17.field5026.method20(0, var12, var17.field5020, var17.field5024, var17.field5027);
                                    if (var17.field5028 != null) {
                                        var17.field5028.method20(0, var12, var17.field5020, var17.field5024, var17.field5027);
                                    }
                                }
                                if (var16.field554 != null) {
                                    class275 var18 = var16.field554;
                                    var18.field4707.method20(var18.field4719, var12, var18.field4713, var18.field4718, var18.field4706);
                                    if (var18.field4700 != null) {
                                        var18.field4700.method20(var18.field4719, var12, var18.field4713, var18.field4718, var18.field4706);
                                    }
                                }
                                if (var16.field558 != null) {
                                    class120 var19 = var16.field558;
                                    var19.field1684.method20(0, var12, var19.field1696, var19.field1688, var19.field1690);
                                }
                                if (var16.field580 != null) {
                                    for (int var20 = 0; var20 < var16.field579; var20++) {
                                        class248 var21 = var16.field580[var20];
                                        var21.field4144.method20(var21.field4147, var12, var21.field4152, var21.field4155, var21.field4159);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class65.field984 == class231.field3779;
        if (class217.field3516) {
            GL var23 = class217.field3551;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class249.method1710();
                class89.method587(3, -1, -81);
                class28.field481 = true;
                class168.method1105();
                class64.field954 = -1;
                class44.field705 = -1;
                for (int var24 = 0; var24 < class65.field983[0].length; var24++) {
                    class1 var25 = class65.field983[0][var24];
                    float var26 = 251.5F - (var25.field21 ? 1.0F : 0.5F);
                    if (class64.field954 != var25.field32) {
                        class64.field954 = var25.field32;
                        class106.method707(124, var25.field32);
                        class14.method92(class267.method1828(65));
                    }
                    var25.method5(class287.field4857, var26, false);
                }
                class168.method1106();
            } else {
                int var27 = class167.field2626;
                while (true) {
                    if (var27 >= class17.field248) {
                        class24.method212(class84.field1162, class202.field3259, class287.field4857);
                        break;
                    }
                    for (int var28 = 0; var28 < class65.field983[var27].length; var28++) {
                        class1 var29 = class65.field983[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field21 ? 1.0F : 0.5F);
                        if (var29.field15 != -1 && class181.field2878.method1777(var29.field15, 127) == 4 && class100.field1454) {
                            class106.method707(116, var29.field32);
                        }
                        var29.method5(class287.field4857, var30, false);
                    }
                    if (var27 == 0 && class239.field3919 > 0) {
                        class217.method1488(101.5F);
                        class102.method689(class84.field1162, class202.field3259, class245.field4087, arg1, class142.field2188, class65.field984[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class167.field2626; var31 < class17.field248; var31++) {
            class34[][] var32 = class287.field4857[var31];
            for (int var33 = -class245.field4087; var33 <= 0; var33++) {
                int var34 = class84.field1162 + var33;
                int var35 = class84.field1162 - var33;
                if (var34 >= class195.field3130 || var35 < class134.field2068) {
                    for (int var36 = -class245.field4087; var36 <= 0; var36++) {
                        int var37 = class202.field3259 + var36;
                        int var38 = class202.field3259 - var36;
                        if (var34 >= class195.field3130) {
                            if (var37 >= class237.field3878) {
                                class34 var39 = var32[var34][var37];
                                if (var39 != null && var39.field559) {
                                    class198.method1318(var39, true);
                                }
                            }
                            if (var38 < class314.field5445) {
                                class34 var40 = var32[var34][var38];
                                if (var40 != null && var40.field559) {
                                    class198.method1318(var40, true);
                                }
                            }
                        }
                        if (var35 < class134.field2068) {
                            if (var37 >= class237.field3878) {
                                class34 var41 = var32[var35][var37];
                                if (var41 != null && var41.field559) {
                                    class198.method1318(var41, true);
                                }
                            }
                            if (var38 < class314.field5445) {
                                class34 var42 = var32[var35][var38];
                                if (var42 != null && var42.field559) {
                                    class198.method1318(var42, true);
                                }
                            }
                        }
                        if (class282.field4801 == 0) {
                            if (!var22) {
                                class240.field3937 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class167.field2626; var43 < class17.field248; var43++) {
            class34[][] var44 = class287.field4857[var43];
            for (int var45 = -class245.field4087; var45 <= 0; var45++) {
                int var46 = class84.field1162 + var45;
                int var47 = class84.field1162 - var45;
                if (var46 >= class195.field3130 || var47 < class134.field2068) {
                    for (int var48 = -class245.field4087; var48 <= 0; var48++) {
                        int var49 = class202.field3259 + var48;
                        int var50 = class202.field3259 - var48;
                        if (var46 >= class195.field3130) {
                            if (var49 >= class237.field3878) {
                                class34 var51 = var44[var46][var49];
                                if (var51 != null && var51.field559) {
                                    class198.method1318(var51, false);
                                }
                            }
                            if (var50 < class314.field5445) {
                                class34 var52 = var44[var46][var50];
                                if (var52 != null && var52.field559) {
                                    class198.method1318(var52, false);
                                }
                            }
                        }
                        if (var47 < class134.field2068) {
                            if (var49 >= class237.field3878) {
                                class34 var53 = var44[var47][var49];
                                if (var53 != null && var53.field559) {
                                    class198.method1318(var53, false);
                                }
                            }
                            if (var50 < class314.field5445) {
                                class34 var54 = var44[var47][var50];
                                if (var54 != null && var54.field559) {
                                    class198.method1318(var54, false);
                                }
                            }
                        }
                        if (class282.field4801 == 0) {
                            if (!var22) {
                                class240.field3937 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class240.field3937 = false;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(B)V", line = 429)
    public static final void method1546(byte arg0) {
        field3645++;
        for (int var1 = -1; var1 < class194.field3114; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class325.field5670[var1];
            }
            class12 var3 = class22.field380[var2];
            if (var3 != null) {
                class248.method1700(var3, 10698, var3.method67(-4391));
            }
        }
        if (arg0 != -31) {
            field3639 = -72;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)[I", line = 463)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            method1545(-82, -115, 98, (byte[][][]) ((byte[][][]) null), -61, (byte) -34, 13, 27);
        }
        field3643++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 64);
        if (this.field1585.field4935) {
            int[] var4 = this.method751(arg1, (byte) 116, 0);
            for (int var5 = 0; var5 < class58.field889; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)[[I", line = 498)
    public final int[][] method55(int arg0, boolean arg1) {
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        field3647++;
        int[][] var3 = this.field1594.method656((byte) 125, arg0);
        if (this.field1594.field1402) {
            int[][] var4 = this.method750(0, (byte) -17, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class58.field889; var11++) {
                var7[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var8[var11];
                var9[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)V", line = 552)
    public static final void method1547(int arg0) {
        if (class232.field3814 == 10 && class217.field3516) {
            class232.method1597((byte) 127, 28);
        }
        if (class232.field3814 == 30) {
            class232.method1597((byte) 127, 25);
        }
        field3636++;
        if (arg0 != 25) {
            field3650 = (class205) null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "(I)V", line = 580)
    public static void method1548(int arg0) {
        field3640 = null;
        if (arg0 < 65) {
            field3644 = (class152) null;
        }
        field3642 = null;
        field3648 = null;
        field3641 = null;
        field3638 = null;
        field3644 = null;
        field3646 = null;
        field3650 = null;
    }
}
