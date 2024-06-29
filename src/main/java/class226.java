import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class226 implements class145 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "[F")
    private float[] field3610 = new float[4];

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field3605 = 0;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "J")
    public static long field3612 = 0L;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field3615 = new String[100];

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field3613 = -1;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public static int[] field3621 = new int[128];

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[Lu;")
    public static class253[] field3617 = new class253[29];

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()I", line = 5)
    public final int method320() {
        field3614++;
        return 0;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "()V", line = 15)
    public final void method315() {
        GL var1 = class333.field5160;
        var1.glCallList(this.field3620);
        field3608++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I", line = 29)
    public static final int method1539(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & arg2;
        field3611++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V", line = 49)
    public static final void method1540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3622++;
        class220.field3500 = 0;
        if (arg6 != 5) {
            field3617 = (class253[]) null;
        }
        for (int var7 = -1; var7 < class175.field2678 + class155.field2439; var7++) {
            class38 var8;
            if (var7 == -1) {
                var8 = class79.field1173;
            } else if (var7 < class175.field2678) {
                var8 = class64.field966[class174.field2645[var7]];
            } else {
                var8 = class208.field3313[class144.field2286[var7 - class175.field2678]];
            }
            if (var8 != null && var8.method281(arg6 - 5)) {
                if (var8 instanceof class80) {
                    class298 var9 = ((class80) var8).field1178;
                    if (var9.field4588 != null) {
                        var9 = var9.method1956(125);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class175.field2678 <= var7) {
                    class298 var15 = ((class80) var8).field1178;
                    if (var15.field4588 != null) {
                        var15 = var15.method1956(arg6 ^ 0x7F);
                    }
                    if (var15.field4626 >= 0 && var15.field4626 < class69.field1030.length) {
                        int var16;
                        if (var15.field4582 == -1) {
                            var16 = var8.method278((byte) -68) + 15;
                        } else {
                            var16 = var15.field4582 + 15;
                        }
                        class58.method396((byte) -98, arg0 >> 1, var8, var16, arg2 >> 1, arg3, arg1);
                        if (class307.field4844 > -1) {
                            class69.field1030[var15.field4626].method921(arg5 - (12 - class307.field4844), arg4 + -30 + class315.field4971);
                        }
                    }
                    class68[] var17 = class81.field1204;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class68 var19 = var17[var18];
                        if (var19 != null && var19.field1013 == 1 && class144.field2286[var7 - class175.field2678] == var19.field1022 && (class343.field5341 % 20) < 10) {
                            int var20;
                            if (var15.field4582 == -1) {
                                var20 = var8.method278((byte) 93) + 15;
                            } else {
                                var20 = var15.field4582 + 15;
                            }
                            class58.method396((byte) -89, arg0 >> 1, var8, var20, arg2 >> 1, arg3, arg1);
                            if (class307.field4844 > -1) {
                                class221.field3509[var19.field1021].method921(arg5 + class307.field4844 - 12, class315.field4971 + arg4 + -28);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class82 var11 = (class82) var8;
                    if (var11.field1228 != -1 || var11.field1243 != -1) {
                        class58.method396((byte) -86, arg0 >> 1, var8, var8.method278((byte) -76) + 15, arg2 >> 1, arg3, arg1);
                        if (class307.field4844 > -1) {
                            if (var11.field1228 != -1) {
                                class234.field3765[var11.field1228].method921(arg5 + class307.field4844 - 12, class315.field4971 + arg4 + -var10);
                                var10 += 25;
                            }
                            if (var11.field1243 != -1) {
                                class69.field1030[var11.field1243].method921(class307.field4844 + arg5 - 12, -var10 + class315.field4971 + arg4);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class68[] var13 = class81.field1204;
                        while (var13.length > var12) {
                            class68 var14 = var13[var12];
                            if (var14 != null && var14.field1013 == 10 && class174.field2645[var7] == var14.field1022) {
                                class58.method396((byte) -105, arg0 >> 1, var8, var8.method278((byte) 90) + 15, arg2 >> 1, arg3, arg1);
                                if (class307.field4844 > -1) {
                                    class221.field3509[var14.field1021].method921(arg5 + class307.field4844 - 12, arg4 - (-class315.field4971 - -var10));
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field548 != null && (class175.field2678 <= var7 || class314.field4954 == 0 || class314.field4954 == 3 || class314.field4954 == 1 && class240.method1639(((class82) var8).field1218, 0))) {
                    class58.method396((byte) -103, arg0 >> 1, var8, var8.method278((byte) 65), arg2 >> 1, arg3, arg1);
                    if (class307.field4844 > -1 && class205.field3102 > class220.field3500) {
                        class205.field3099[class220.field3500] = class286.field4380.method1247(var8.field548) / 2;
                        class205.field3105[class220.field3500] = class286.field4380.field2757;
                        class205.field3111[class220.field3500] = class307.field4844;
                        class205.field3097[class220.field3500] = class315.field4971;
                        class205.field3103[class220.field3500] = var8.field473;
                        class205.field3101[class220.field3500] = var8.field513;
                        class205.field3091[class220.field3500] = var8.field539;
                        class205.field3096[class220.field3500] = var8.field548;
                        class220.field3500++;
                    }
                }
                if (var8.field533 > class343.field5341) {
                    class245 var21 = class339.field5246[0];
                    class245 var22 = class339.field5246[1];
                    int var26;
                    if (var8 instanceof class80) {
                        class80 var23 = (class80) var8;
                        class245[] var24 = (class245[]) ((class245[]) class166.field2555.method1294((long) var23.field1178.field4607, 121));
                        if (var24 == null) {
                            var24 = class248.method1685(var23.field1178.field4607, class121.field1859, (byte) -108, 0);
                            if (var24 != null) {
                                class166.field2555.method1292((long) var23.field1178.field4607, arg6 ^ 0x6A, var24);
                            }
                        }
                        class298 var25 = var23.field1178;
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        if (var25.field4582 == -1) {
                            var26 = var8.method278((byte) 70);
                        } else {
                            var26 = var25.field4582;
                        }
                    } else {
                        var26 = var8.method278((byte) -116);
                    }
                    class58.method396((byte) -105, arg0 >> 1, var8, var26 + var21.field3844 + 10, arg2 >> 1, arg3, arg1);
                    if (class307.field4844 > -1) {
                        int var27 = arg5 + class307.field4844 - (var21.field3847 >> 1);
                        int var28 = class315.field4971 + arg4 - 3;
                        var21.method921(var27, var28);
                        int var29 = var21.field3844;
                        int var30 = var8.field554 * var21.field3847 / 255;
                        if (class333.field5166) {
                            class238.method1632(var27, var28, var27 + var30, var28 + var29);
                        } else {
                            class57.method383(var27, var28, var27 + var30, var28 - -var29);
                        }
                        var22.method921(var27, var28);
                        if (class333.field5166) {
                            class238.method1633(arg5, arg4, arg2 + arg5, arg0 + arg4);
                        } else {
                            class57.method395(arg5, arg4, arg5 + arg2, arg0 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field491[var31] > class343.field5341) {
                        int var34;
                        if (var8 instanceof class80) {
                            class80 var32 = (class80) var8;
                            class298 var33 = var32.field1178;
                            if (var33.field4582 == -1) {
                                var34 = var8.method278((byte) -83) / 2;
                            } else {
                                var34 = var33.field4582 / 2;
                            }
                        } else {
                            var34 = var8.method278((byte) -71) / 2;
                        }
                        class58.method396((byte) -105, arg0 >> 1, var8, var34, arg2 >> 1, arg3, arg1);
                        if (class307.field4844 > -1) {
                            if (var31 == 1) {
                                class315.field4971 -= 20;
                            }
                            if (var31 == 2) {
                                class307.field4844 -= 15;
                                class315.field4971 -= 10;
                            }
                            if (var31 == 3) {
                                class307.field4844 += 15;
                                class315.field4971 -= 10;
                            }
                            class117.field1803[var8.field509[var31]].method921(class307.field4844 + arg5 - 12, class315.field4971 - 12 + arg4);
                            class342.field5329.method1245(Integer.toString(var8.field549[var31]), class307.field4844 + arg5 - 1, class315.field4971 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var35 = 0; var35 < class220.field3500; var35++) {
            int var36 = class205.field3097[var35];
            int var37 = class205.field3111[var35];
            int var38 = class205.field3099[var35];
            int var39 = class205.field3105[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((var36 + 2) > (class205.field3097[var41] - class205.field3105[var41]) && class205.field3097[var41] + 2 > -var39 + var36 && (class205.field3111[var41] + class205.field3099[var41]) > (var37 - var38) && (var37 + var38) > (class205.field3111[var41] - class205.field3099[var41]) && (class205.field3097[var41] - class205.field3105[var41]) < var36) {
                        var36 = class205.field3097[var41] - class205.field3105[var41];
                        var40 = true;
                    }
                }
            }
            class307.field4844 = class205.field3111[var35];
            class315.field4971 = class205.field3097[var35] = var36;
            String var42 = class205.field3096[var35];
            if (class242.field3832 == 0) {
                int var43 = 16776960;
                if (class205.field3103[var35] < 6) {
                    var43 = class206.field3113[class205.field3103[var35]];
                }
                if (class205.field3103[var35] == 6) {
                    var43 = class19.field260 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class205.field3103[var35] == 7) {
                    var43 = (class19.field260 % 20) < 10 ? 255 : 65535;
                }
                if (class205.field3103[var35] == 8) {
                    var43 = (class19.field260 % 20) < 10 ? 45056 : 8454016;
                }
                if (class205.field3103[var35] == 9) {
                    int var44 = 150 - class205.field3091[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 * 327680 - 16384000);
                    } else if (var44 < 150) {
                        var43 = (var44 * 5) + 65280 - 500;
                    }
                }
                if (class205.field3103[var35] == 10) {
                    int var45 = 150 - class205.field3091[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 + 500 - (var45 * 5) - 32768000;
                    }
                }
                if (class205.field3103[var35] == 11) {
                    int var46 = 150 - class205.field3091[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 + 65280 - 16384250;
                    } else if (var46 < 150) {
                        var43 = 49545215 - var46 * 327680;
                    }
                }
                if (class205.field3101[var35] == 0) {
                    class286.field4380.method1245(var42, arg5 + class307.field4844, arg4 - -class315.field4971, var43, 0);
                }
                if (class205.field3101[var35] == 1) {
                    class286.field4380.method1248(var42, class307.field4844 + arg5, class315.field4971 + arg4, var43, 0, class19.field260);
                }
                if (class205.field3101[var35] == 2) {
                    class286.field4380.method1241(var42, class307.field4844 + arg5, class315.field4971 + arg4, var43, 0, class19.field260);
                }
                if (class205.field3101[var35] == 3) {
                    class286.field4380.method1252(var42, arg5 + class307.field4844, arg4 - -class315.field4971, var43, 0, class19.field260, 150 - class205.field3091[var35]);
                }
                if (class205.field3101[var35] == 4) {
                    int var47 = (150 - class205.field3091[var35]) * (class286.field4380.method1247(var42) + 100) / 150;
                    if (class333.field5166) {
                        class238.method1632(arg5 + class307.field4844 - 50, arg4, class307.field4844 + arg5 + 50, arg4 - -arg0);
                    } else {
                        class57.method383(arg5 + class307.field4844 - 50, arg4, class307.field4844 + arg5 + 50, arg0 + arg4);
                    }
                    class286.field4380.method1237(var42, class307.field4844 + arg5 + 50 - var47, class315.field4971 + arg4, var43, 0);
                    if (class333.field5166) {
                        class238.method1633(arg5, arg4, arg5 + arg2, arg4 - -arg0);
                    } else {
                        class57.method395(arg5, arg4, arg2 + arg5, arg4 - -arg0);
                    }
                }
                if (class205.field3101[var35] == 5) {
                    int var48 = 150 - class205.field3091[var35];
                    if (class333.field5166) {
                        class238.method1632(arg5, arg4 + class315.field4971 - class286.field4380.field2757 - 1, arg2 + arg5, arg4 + class315.field4971 + 5);
                    } else {
                        class57.method383(arg5, arg4 + class315.field4971 - class286.field4380.field2757 - 1, arg2 + arg5, arg4 + class315.field4971 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class286.field4380.method1245(var42, class307.field4844 + arg5, arg4 - (-class315.field4971 - var49), var43, 0);
                    if (class333.field5166) {
                        class238.method1633(arg5, arg4, arg2 + arg5, arg4 - -arg0);
                    } else {
                        class57.method395(arg5, arg4, arg2 + arg5, arg0 + arg4);
                    }
                }
            } else {
                class286.field4380.method1245(var42, class307.field4844 + arg5, class315.field4971 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 534)
    public final void method321(int arg0) {
        field3619++;
        GL var2 = class333.field5160;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field3610[0] = var6;
            this.field3610[2] = 0.0F;
            this.field3610[1] = 0.0F;
            this.field3610[3] = 0.0F;
        } else {
            this.field3610[1] = 0.0F;
            this.field3610[0] = 0.0F;
            this.field3610[3] = 0.0F;
            this.field3610[2] = var6;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class143.field2261 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class225.field3597 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class160.field2494), (float) (-class45.field635), (float) (-class277.field4276));
        var2.glTexGenfv(8192, 9474, this.field3610, 0);
        this.field3610[3] = (float) class333.field5180 * var3;
        this.field3610[1] = var6;
        this.field3610[2] = 0.0F;
        this.field3610[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field3610, 0);
        var2.glPopMatrix();
        if (class49.field699) {
            this.field3610[1] = 0.0F;
            this.field3610[0] = 0.0F;
            this.field3610[3] = (float) class333.field5180 * var4;
            this.field3610[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field3610, 0);
        } else {
            int var7 = (int) ((float) class333.field5180 * var4 * 64.0F);
            var2.glBindTexture(3553, class49.field704[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 596)
    private final void method1541(byte arg0) {
        field3618++;
        GL var2 = class333.field5160;
        this.field3620 = var2.glGenLists(2);
        var2.glNewList(this.field3620, 4864);
        var2.glActiveTexture(33985);
        if (class49.field699) {
            var2.glBindTexture(32879, class49.field700);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3620 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class49.field699) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        int var3 = 74 / ((21 - arg0) / 45);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 640)
    public static void method1542(int arg0) {
        field3617 = null;
        if (arg0 != 0) {
            field3613 = -80;
        }
        field3621 = null;
        field3615 = null;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 653)
    public final void method318() {
        GL var1 = class333.field5160;
        field3606++;
        var1.glCallList(this.field3620 + 1);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIILfe;IJZ)Z", line = 669)
    public static final boolean method1543(int arg0, int arg1, int arg2, int arg3, int arg4, class94 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class229.method1570(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Z", line = 706)
    public static final boolean method1544(int arg0, int arg1) {
        field3607++;
        byte var2 = 0;
        byte var3 = 0;
        if (class74.field1108 == null) {
            if (class333.field5166 || class230.field3714 == null) {
                class74.field1108 = new class178(512, 512);
            } else {
                class74.field1108 = (class178) class230.field3714;
            }
            int[] var4 = class74.field1108.field2734;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < (104 - var3 - 1); var7++) {
                int var8 = (var3 + 103 - var7) * 4 * 512 + 24628;
                for (int var9 = var2 + 1; var9 < (104 - var2 - 1); var9++) {
                    if ((class305.field4784[arg0][var9][var7] & 0x18) == 0) {
                        class142.method994(var4, var8, 512, arg0, var9, var7);
                    }
                    if (arg0 < 3 && (class305.field4784[arg0 + 1][var9][var7] & 0x8) != 0) {
                        class142.method994(var4, var8, 512, arg0 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class136.field2114 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class338.method2341(class77.field1154, var2 + var10, var11 - -var3);
                    if (var12 != 0L) {
                        class17 var14 = class277.method1819((byte) -58, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        int var15 = var14.field205;
                        if (var14.field195 != null) {
                            for (int var16 = 0; var16 < var14.field195.length; var16++) {
                                if (var14.field195[var16] != -1) {
                                    class17 var17 = class277.method1819((byte) 127, var14.field195[var16]);
                                    if (var17.field205 >= 0) {
                                        var15 = var17.field205;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var2 + var10;
                            int var19 = var3 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class33.field425[class77.field1154].field4544;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var10 - 3 < var18 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < var10 + 3 && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var11 - 3 < var19 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && (var11 + 3) > var19 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class99.field1545[class136.field2114] = var14.field196;
                            class306.field4812[class136.field2114] = var18 - var2;
                            class17.field171[class136.field2114] = var19 - var3;
                            class136.field2114++;
                        }
                    }
                }
            }
        }
        class74.field1108.method1211();
        int var23 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var24 = -(-((int) (Math.random() * 20.0D)) + (-(((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8)) - 238)) - 10;
        for (int var25 = 1; var25 < 103; var25++) {
            for (int var26 = 1; var26 < 103; var26++) {
                if ((class305.field4784[arg0][var2 + var26][var3 + var25] & 0x18) == 0 && !class187.method1281(var2, var26, var24, -105, arg0, var3, var23, var25)) {
                    if (class333.field5166) {
                        class57.field797 = null;
                    } else {
                        class42.field594.method27(arg1 ^ 0x5C11);
                    }
                    return false;
                }
                if (arg0 < 3 && (class305.field4784[arg0 + 1][var2 + var26][var25 + var3] & 0x8) != 0 && !class187.method1281(var2, var26, var24, 91, arg0 + 1, var3, var23, var25)) {
                    if (class333.field5166) {
                        class57.field797 = null;
                    } else {
                        class42.field594.method27(-10702);
                    }
                    return false;
                }
            }
        }
        if (arg1 != -30173) {
            method1544(68, 7);
        }
        if (class333.field5166) {
            int[] var27 = class74.field1108.field2734;
            int var28 = var27.length;
            for (int var29 = 0; var29 < var28; var29++) {
                if (var27[var29] == 0) {
                    var27[var29] = 1;
                }
            }
            class230.field3714 = new class186(class74.field1108);
        } else {
            class230.field3714 = class74.field1108;
        }
        if (class333.field5166) {
            class57.field797 = null;
        } else {
            class42.field594.method27(-10702);
        }
        class74.field1108 = null;
        return true;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 951)
    public static final void method1545(int arg0) {
        if (arg0 != 26) {
            field3612 = 62L;
        }
        if (class224.field3571.toLowerCase().indexOf("microsoft") == -1) {
            if (class224.field3584 == null) {
                class96.field1481[222] = 59;
                class96.field1481[192] = 58;
            } else {
                class96.field1481[520] = 59;
                class96.field1481[192] = 28;
                class96.field1481[222] = 58;
            }
            class96.field1481[93] = 43;
            class96.field1481[61] = 27;
            class96.field1481[45] = 26;
            class96.field1481[47] = 73;
            class96.field1481[46] = 72;
            class96.field1481[59] = 57;
            class96.field1481[92] = 74;
            class96.field1481[44] = 71;
            class96.field1481[91] = 42;
        } else {
            class96.field1481[220] = 74;
            class96.field1481[221] = 43;
            class96.field1481[219] = 42;
            class96.field1481[187] = 27;
            class96.field1481[222] = 59;
            class96.field1481[191] = 73;
            class96.field1481[186] = 57;
            class96.field1481[192] = 58;
            class96.field1481[190] = 72;
            class96.field1481[223] = 28;
            class96.field1481[189] = 26;
            class96.field1481[188] = 71;
        }
        field3609++;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 1006)
    public class226() {
        this.method1541((byte) 101);
    }
}
