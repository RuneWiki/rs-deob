import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class16 extends class51 {

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private final int field205;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private final int field204;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    private final int field209;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    private final int field211;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lok;")
    public static class41 field212 = class137.method956("Titelbild ge-Offnet)3", 45);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lfl;")
    public static class86 field206 = new class86(16);

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "Lok;")
    public static class41 field214 = class137.method956(")2", 45);

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[Lok;")
    public static class41[] field215 = new class41[100];

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "Lmh;")
    public static class65 field213;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
    public static int[] field216;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V", line = 4)
    public final void method71(int arg0, int arg1, int arg2) {
        field208++;
        int var4 = this.field205 * arg0 >> 12;
        int var5 = this.field209 * arg0 >> 12;
        if (arg1 != 0) {
            method74(-124, -32, 107, (byte[][][]) ((byte[][][]) null), -123, (byte) -95, -73, 118);
        }
        int var6 = this.field211 * arg2 >> 12;
        int var7 = this.field204 * arg2 >> 12;
        class5.method16(this.field767, var5, var7, 93, var6, var4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V", line = 24)
    public final void method72(int arg0, int arg1, int arg2) {
        if (arg0 != -15071) {
            field213 = (class65) null;
        }
        field210++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIII)V", line = 34)
    public class16(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field205 = arg0;
        this.field204 = arg3;
        this.field209 = arg2;
        this.field211 = arg1;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(III)V", line = 50)
    public final void method73(int arg0, int arg1, int arg2) {
        field203++;
        if (arg0 != 0) {
            this.method73(97, -13, 12);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[[[BIBII)V", line = 63)
    public static final void method74(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class259.field4133++;
        class132.field1971 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class311.field5251; var12 < class308.field5184; var12++) {
            class308[][] var13 = class205.field3312[var12];
            for (int var14 = class236.field3798; var14 < class169.field2691; var14++) {
                for (int var15 = class238.field3816; var15 < class171.field2728; var15++) {
                    class308 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class113.field1668[var14 + class122.field1816 - class86.field1259][var15 + class122.field1816 - class30.field429] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field5200 = true;
                            var16.field5203 = true;
                            if (var16.field5193 > 0) {
                                var16.field5194 = true;
                            } else {
                                var16.field5194 = false;
                            }
                            class132.field1971++;
                        } else {
                            var16.field5200 = false;
                            var16.field5203 = false;
                            var16.field5196 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field5210 != null) {
                                    class241 var17 = var16.field5210;
                                    var17.field3864.method886((byte) 104, var17.field3847, var17.field3851, var17.field3847, var17.field3851);
                                    if (var17.field3854 != null) {
                                        var17.field3854.method886((byte) 100, var17.field3847, var17.field3851, var17.field3847, var17.field3851);
                                    }
                                }
                                if (var16.field5208 != null) {
                                    class198 var18 = var16.field5208;
                                    var18.field3177.method886((byte) 95, var18.field3186, var18.field3174, var18.field3186, var18.field3174);
                                    if (var18.field3176 != null) {
                                        var18.field3176.method886((byte) 84, var18.field3186, var18.field3174, var18.field3186, var18.field3174);
                                    }
                                }
                                if (var16.field5207 != null) {
                                    class107 var19 = var16.field5207;
                                    var19.field1499.method886((byte) 64, var19.field1500, var19.field1510, var19.field1500, var19.field1510);
                                }
                                if (var16.field5201 != null) {
                                    for (int var20 = 0; var20 < var16.field5193; var20++) {
                                        class232 var21 = var16.field5201[var20];
                                        var21.field3674.method886((byte) 92, var21.field3676, var21.field3668, var21.field3665, var21.field3673);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class278.field4548 == class184.field3008;
        if (class166.field2625) {
            GL var23 = class166.field2648;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class214.method1512();
                class274.method1934(3, -1, (byte) 16);
                class226.field3610 = true;
                class56.method395();
                class23.field349 = -1;
                class278.field4559 = -1;
                for (int var24 = 0; var24 < class134.field2010[0].length; var24++) {
                    class6 var25 = class134.field2010[0][var24];
                    float var26 = 251.5F - (var25.field95 ? 1.0F : 0.5F);
                    if (class23.field349 != var25.field79) {
                        class23.field349 = var25.field79;
                        class180.method1287(var25.field79, (byte) 91);
                        class58.method407(class52.method359(-61));
                    }
                    var25.method20(class205.field3312, var26, false);
                }
                class56.method392();
            } else {
                int var27 = class311.field5251;
                while (true) {
                    if (var27 >= class308.field5184) {
                        class179.method1280(class86.field1259, class30.field429, class205.field3312);
                        break;
                    }
                    for (int var28 = 0; var28 < class134.field2010[var27].length; var28++) {
                        class6 var29 = class134.field2010[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field95 ? 1.0F : 0.5F);
                        if (var29.field92 != -1 && class31.field461.method690(var29.field92, (byte) -29) == 4 && class27.field393) {
                            class180.method1287(var29.field79, (byte) 91);
                        }
                        var29.method20(class205.field3312, var30, false);
                    }
                    if (var27 == 0 && class152.field2419 > 0) {
                        class166.method1164(101.5F);
                        class263.method1867(class86.field1259, class30.field429, class122.field1816, arg1, class113.field1668, class278.field4548[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class311.field5251; var31 < class308.field5184; var31++) {
            class308[][] var32 = class205.field3312[var31];
            for (int var33 = -class122.field1816; var33 <= 0; var33++) {
                int var34 = class86.field1259 + var33;
                int var35 = class86.field1259 - var33;
                if (var34 >= class236.field3798 || var35 < class169.field2691) {
                    for (int var36 = -class122.field1816; var36 <= 0; var36++) {
                        int var37 = class30.field429 + var36;
                        int var38 = class30.field429 - var36;
                        if (var34 >= class236.field3798) {
                            if (var37 >= class238.field3816) {
                                class308 var39 = var32[var34][var37];
                                if (var39 != null && var39.field5200) {
                                    class249.method1766(var39, true);
                                }
                            }
                            if (var38 < class171.field2728) {
                                class308 var40 = var32[var34][var38];
                                if (var40 != null && var40.field5200) {
                                    class249.method1766(var40, true);
                                }
                            }
                        }
                        if (var35 < class169.field2691) {
                            if (var37 >= class238.field3816) {
                                class308 var41 = var32[var35][var37];
                                if (var41 != null && var41.field5200) {
                                    class249.method1766(var41, true);
                                }
                            }
                            if (var38 < class171.field2728) {
                                class308 var42 = var32[var35][var38];
                                if (var42 != null && var42.field5200) {
                                    class249.method1766(var42, true);
                                }
                            }
                        }
                        if (class132.field1971 == 0) {
                            if (!var22) {
                                class272.field4429 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class311.field5251; var43 < class308.field5184; var43++) {
            class308[][] var44 = class205.field3312[var43];
            for (int var45 = -class122.field1816; var45 <= 0; var45++) {
                int var46 = class86.field1259 + var45;
                int var47 = class86.field1259 - var45;
                if (var46 >= class236.field3798 || var47 < class169.field2691) {
                    for (int var48 = -class122.field1816; var48 <= 0; var48++) {
                        int var49 = class30.field429 + var48;
                        int var50 = class30.field429 - var48;
                        if (var46 >= class236.field3798) {
                            if (var49 >= class238.field3816) {
                                class308 var51 = var44[var46][var49];
                                if (var51 != null && var51.field5200) {
                                    class249.method1766(var51, false);
                                }
                            }
                            if (var50 < class171.field2728) {
                                class308 var52 = var44[var46][var50];
                                if (var52 != null && var52.field5200) {
                                    class249.method1766(var52, false);
                                }
                            }
                        }
                        if (var47 < class169.field2691) {
                            if (var49 >= class238.field3816) {
                                class308 var53 = var44[var47][var49];
                                if (var53 != null && var53.field5200) {
                                    class249.method1766(var53, false);
                                }
                            }
                            if (var50 < class171.field2728) {
                                class308 var54 = var44[var47][var50];
                                if (var54 != null && var54.field5200) {
                                    class249.method1766(var54, false);
                                }
                            }
                        }
                        if (class132.field1971 == 0) {
                            if (!var22) {
                                class272.field4429 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class272.field4429 = false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZ)V", line = 434)
    public static final void method75(boolean arg0, boolean arg1) {
        field207++;
        if (!arg0) {
            class158.method1118(class188.field3055, arg1, class14.field182, class136.field2015, true);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 445)
    public static void method76(int arg0) {
        field206 = null;
        if (arg0 != 4) {
            field215 = (class41[]) null;
        }
        field214 = null;
        field213 = null;
        field216 = null;
        field212 = null;
        field215 = null;
    }
}
