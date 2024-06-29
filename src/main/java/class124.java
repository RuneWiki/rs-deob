import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class124 {

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public int field1987;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public int field1978;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "F")
    public float field1984;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public int field1979;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "F")
    public float field1983;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "F")
    public float field1981;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public int field1982;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1985 = "Take";

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static volatile int field1988 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIII)V", line = 7)
    public static final void method933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1986++;
        class86.method614(arg4, -24891, arg1 + arg3, -arg1 + arg3, class102.field1729[arg2]);
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = var8 << 1;
        int var10 = arg5 * arg5;
        int var11 = arg5 << 1;
        int var12 = var10 << 1;
        int var13 = var10 - (var11 - arg0) * var9;
        int var14 = (1 - var11) * var8 + var12;
        int var15 = var8 << 2;
        int var16 = var10 << 2;
        int var17 = ((arg5 << 1) - 3) * var9;
        int var18 = ((var6 << 1) + 3) * var12;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        while (var7 > 0) {
            var7--;
            int var21 = arg2 - var7;
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var14 += var18;
                    var13 += var19;
                    var19 += var16;
                    var18 += var16;
                }
            }
            if (var13 < 0) {
                var6++;
                var13 += var19;
                var19 += var16;
                var14 += var18;
                var18 += var16;
            }
            int var22 = arg2 + var7;
            var14 += -var20;
            int var23 = arg3 + var6;
            int var24 = arg3 - var6;
            var13 += -var17;
            var20 -= var15;
            var17 -= var15;
            class86.method614(arg4, -24891, var23, var24, class102.field1729[var21]);
            class86.method614(arg4, arg0 - 24892, var23, var24, class102.field1729[var22]);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "([S[Ljava/lang/String;Z)V", line = 90)
    public static final void method934(short[] arg0, String[] arg1, boolean arg2) {
        field1973++;
        if (arg2) {
            class189.method1405(arg1.length - 1, 0, arg0, 1, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III[[[BIBII)V", line = 100)
    public static final void method935(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class94.field1531++;
        class226.field3618 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class180.field2881; var12 < class203.field3189; var12++) {
            class272[][] var13 = class60.field946[var12];
            for (int var14 = class276.field4277; var14 < class219.field3513; var14++) {
                for (int var15 = class90.field1464; var15 < class110.field1821; var15++) {
                    class272 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class87.field1329[var14 + class258.field4008 - class151.field2419][var15 + class258.field4008 - class301.field4744] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field4232 = true;
                            var16.field4216 = true;
                            if (var16.field4220 > 0) {
                                var16.field4234 = true;
                            } else {
                                var16.field4234 = false;
                            }
                            class226.field3618++;
                        } else {
                            var16.field4232 = false;
                            var16.field4216 = false;
                            var16.field4233 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field4236 != null) {
                                    class189 var17 = var16.field4236;
                                    var17.field2996.method205(0, var12, var17.field3007, var17.field3005, var17.field3002);
                                    if (var17.field2998 != null) {
                                        var17.field2998.method205(0, var12, var17.field3007, var17.field3005, var17.field3002);
                                    }
                                }
                                if (var16.field4219 != null) {
                                    class114 var18 = var16.field4219;
                                    var18.field1863.method205(var18.field1859, var12, var18.field1858, var18.field1867, var18.field1868);
                                    if (var18.field1860 != null) {
                                        var18.field1860.method205(var18.field1859, var12, var18.field1858, var18.field1867, var18.field1868);
                                    }
                                }
                                if (var16.field4213 != null) {
                                    class87 var19 = var16.field4213;
                                    var19.field1325.method205(0, var12, var19.field1326, var19.field1334, var19.field1336);
                                }
                                if (var16.field4217 != null) {
                                    for (int var20 = 0; var20 < var16.field4220; var20++) {
                                        class45 var21 = var16.field4217[var20];
                                        var21.field782.method205(var21.field783, var12, var21.field773, var21.field775, var21.field771);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class29.field475 == class150.field2404;
        if (class265.field4126) {
            GL var23 = class265.field4099;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class4.method13();
                class308.method2132(3, (byte) -28, -1);
                class54.field843 = true;
                class113.method860();
                class242.field3752 = -1;
                class180.field2883 = -1;
                for (int var24 = 0; var24 < class300.field4723[0].length; var24++) {
                    class186 var25 = class300.field4723[0][var24];
                    float var26 = 251.5F - (var25.field2961 ? 1.0F : 0.5F);
                    if (class242.field3752 != var25.field2966) {
                        class242.field3752 = var25.field2966;
                        class139.method1064(20699, var25.field2966);
                        class97.method702(class64.method494(-36));
                    }
                    var25.method1399(class60.field946, var26, false);
                }
                class113.method861();
            } else {
                int var27 = class180.field2881;
                while (true) {
                    if (var27 >= class203.field3189) {
                        class38.method314(class151.field2419, class301.field4744, class60.field946);
                        break;
                    }
                    for (int var28 = 0; var28 < class300.field4723[var27].length; var28++) {
                        class186 var29 = class300.field4723[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2961 ? 1.0F : 0.5F);
                        if (var29.field2979 != -1 && class174.field2734.method1478(255, var29.field2979) == 4 && class6.field61) {
                            class139.method1064(20699, var29.field2966);
                        }
                        var29.method1399(class60.field946, var30, false);
                    }
                    if (var27 == 0 && class245.field3780 > 0) {
                        class265.method1907(101.5F);
                        class69.method529(class151.field2419, class301.field4744, class258.field4008, arg1, class87.field1329, class29.field475[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class180.field2881; var31 < class203.field3189; var31++) {
            class272[][] var32 = class60.field946[var31];
            for (int var33 = -class258.field4008; var33 <= 0; var33++) {
                int var34 = class151.field2419 + var33;
                int var35 = class151.field2419 - var33;
                if (var34 >= class276.field4277 || var35 < class219.field3513) {
                    for (int var36 = -class258.field4008; var36 <= 0; var36++) {
                        int var37 = class301.field4744 + var36;
                        int var38 = class301.field4744 - var36;
                        if (var34 >= class276.field4277) {
                            if (var37 >= class90.field1464) {
                                class272 var39 = var32[var34][var37];
                                if (var39 != null && var39.field4232) {
                                    class178.method1318(var39, true);
                                }
                            }
                            if (var38 < class110.field1821) {
                                class272 var40 = var32[var34][var38];
                                if (var40 != null && var40.field4232) {
                                    class178.method1318(var40, true);
                                }
                            }
                        }
                        if (var35 < class219.field3513) {
                            if (var37 >= class90.field1464) {
                                class272 var41 = var32[var35][var37];
                                if (var41 != null && var41.field4232) {
                                    class178.method1318(var41, true);
                                }
                            }
                            if (var38 < class110.field1821) {
                                class272 var42 = var32[var35][var38];
                                if (var42 != null && var42.field4232) {
                                    class178.method1318(var42, true);
                                }
                            }
                        }
                        if (class226.field3618 == 0) {
                            if (!var22) {
                                class168.field2603 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class180.field2881; var43 < class203.field3189; var43++) {
            class272[][] var44 = class60.field946[var43];
            for (int var45 = -class258.field4008; var45 <= 0; var45++) {
                int var46 = class151.field2419 + var45;
                int var47 = class151.field2419 - var45;
                if (var46 >= class276.field4277 || var47 < class219.field3513) {
                    for (int var48 = -class258.field4008; var48 <= 0; var48++) {
                        int var49 = class301.field4744 + var48;
                        int var50 = class301.field4744 - var48;
                        if (var46 >= class276.field4277) {
                            if (var49 >= class90.field1464) {
                                class272 var51 = var44[var46][var49];
                                if (var51 != null && var51.field4232) {
                                    class178.method1318(var51, false);
                                }
                            }
                            if (var50 < class110.field1821) {
                                class272 var52 = var44[var46][var50];
                                if (var52 != null && var52.field4232) {
                                    class178.method1318(var52, false);
                                }
                            }
                        }
                        if (var47 < class219.field3513) {
                            if (var49 >= class90.field1464) {
                                class272 var53 = var44[var47][var49];
                                if (var53 != null && var53.field4232) {
                                    class178.method1318(var53, false);
                                }
                            }
                            if (var50 < class110.field1821) {
                                class272 var54 = var44[var47][var50];
                                if (var54 != null && var54.field4232) {
                                    class178.method1318(var54, false);
                                }
                            }
                        }
                        if (class226.field3618 == 0) {
                            if (!var22) {
                                class168.field2603 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class168.field2603 = false;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 475)
    public static void method936(int arg0) {
        field1985 = null;
        if (arg0 != 0) {
            field1988 = -42;
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V", line = 497)
    public class124() {
        this.field1987 = -50;
        this.field1978 = class97.field1616;
        this.field1976 = -60;
        this.field1984 = 0.69921875F;
        this.field1979 = class97.field1609;
        this.field1983 = 1.1523438F;
        this.field1975 = -50;
        this.field1981 = 1.2F;
        this.field1982 = 0;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lpe;)V", line = 512)
    public class124(class101 arg0) {
        int var2 = arg0.method741(92);
        if ((var2 & 0x1) == 0) {
            this.field1978 = class97.field1616;
        } else {
            this.field1978 = arg0.method775(87);
        }
        if ((var2 & 0x2) == 0) {
            this.field1983 = 1.1523438F;
        } else {
            this.field1983 = (float) arg0.method731(false) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1984 = 0.69921875F;
        } else {
            this.field1984 = (float) arg0.method731(false) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1981 = 1.2F;
        } else {
            this.field1981 = (float) arg0.method731(false) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1987 = -50;
            this.field1975 = -50;
            this.field1976 = -60;
        } else {
            this.field1975 = arg0.method780(-17432);
            this.field1976 = arg0.method780(-17432);
            this.field1987 = arg0.method780(-17432);
        }
        if ((var2 & 0x20) == 0) {
            this.field1979 = class97.field1609;
        } else {
            this.field1979 = arg0.method775(109);
        }
        if ((var2 & 0x40) == 0) {
            this.field1982 = 0;
        } else {
            this.field1982 = arg0.method731(false);
        }
    }
}
