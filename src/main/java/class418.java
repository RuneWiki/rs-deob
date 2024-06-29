import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class418 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "[F")
    private float[] field6604 = new float[16];

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "Lmka;")
    private class647 field6611 = new class647(786336);

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    private int field6618 = class349.method2911(-69, 1600);

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    private int field6621 = 0;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "[I")
    private int[] field6620 = new int[8191];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "[[Lvia;")
    private class590[][] field6623 = new class590[64][768];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "[I")
    private int[] field6624 = new int[64];

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
    private int[] field6619 = new int[1600];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[[Lvia;")
    private class590[][] field6622 = new class590[1600][64];

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6625 = new String[] { method3339(method3338("!k~{`")), method3339(method3338("2#~\u00105")), method3339(method3338("40<9")), method3339(method3338("2#~\u00135")), method3339(method3338("2#~\u001f5")), method3339(method3338("2#~\u00145")), method3339(method3338("2#~\u00175")), method3339(method3338("2#~\u001c5")), method3339(method3338("2#~\u00125")), method3339(method3338("2#~\u00165")), method3339(method3338("2#~\u00115")), method3339(method3338("2#~\u001d5")) };

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
    public static float field6612 = 1024.0F;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field6603;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field6605;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Ld;")
    public static class158 field6601;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "Lika;")
    private class450 field6616;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Lkn;")
    private class774 field6613;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lkn;")
    private class774 field6614;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lkn;")
    private class774 field6617;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLvf;I)V", line = 9)
    private final void method3328(byte arg0, class159 arg1, int arg2) {
        try {
            class404.field6399 = arg1.field2461;
            field6610++;
            arg1.method1457((float) arg2, false);
            arg1.method1487(-17);
            OpenGL.glDisable(16384);
            if (arg0 >= -41) {
                this.field6624 = null;
            }
            OpenGL.glDisable(16385);
            arg1.method1489(-19225, false);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6625[1] + arg0 + ',' + (arg1 == null ? field6625[2] : field6625[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 28)
    public static void method3329(int arg0) {
        try {
            field6601 = null;
            int var1 = -29 / ((arg0 - 32) / 60);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6625[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 38)
    public static final void method3330(boolean arg0, String arg1) {
        try {
            class54.field683 = arg1;
            field6615++;
            if (arg0) {
                method3330(true, null);
            }
            class635.field9120 = class54.field683.length();
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6625[10] + arg0 + ',' + (arg1 == null ? field6625[2] : field6625[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lvf;I)V", line = 50)
    private final void method3331(class159 arg0, int arg1) {
        try {
            field6606++;
            arg0.method1489(-19225, true);
            OpenGL.glEnable(arg1);
            OpenGL.glEnable(16385);
            if (class404.field6399 != arg0.field2461) {
                arg0.method166(class404.field6399);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6625[7] + (arg0 == null ? field6625[2] : field6625[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lmj;IIILha;)V", line = 64)
    public static final void method3332(class683 arg0, int arg1, int arg2, int arg3, class63 arg4) {
        try {
            field6603++;
            class514 var5 = arg0.method4984(arg4, arg3 ^ 0x3D);
            if (var5 != null) {
                arg4.method221(arg1, arg2, arg1 + arg0.field9797, arg0.field9777 + arg2);
                if (arg3 == 5) {
                    if (class137.field1930 == 2 || class137.field1930 == 5 || class30.field320 == null) {
                        arg4.method170(-16777216, var5, arg1, arg2);
                    } else {
                        int var6;
                        int var7;
                        int var8;
                        int var9;
                        if (class401.field6334 == 4) {
                            var7 = (int) (-class29.field293) & 0x3FFF;
                            var9 = 4096;
                            var8 = class537.field7887;
                            var6 = class505.field7560;
                        } else {
                            var6 = class438.field6846.field9983;
                            var7 = (int) (-class29.field293) + class126.field1819 & 0x3FFF;
                            var8 = class438.field6846.field9985;
                            var9 = 4096 - (class85.field1275 * 16);
                        }
                        int var10 = var8 / 128 + 208 + 48 - class126.field1823 * 2;
                        int var11 = 48 - ((class169.field2725 - 104) * 2) - (-(class169.field2725 * 4) - -(var6 / 128));
                        class30.field320.method995((float) arg0.field9797 / 2.0F + (float) arg1, (float) arg0.field9777 / 2.0F + (float) arg2, (float) var10, (float) var11, var9, var7 << 2, var5, arg1, arg2);
                        for (class272 var12 = (class272) class20.field203.method3228(arg3 ^ 0xE); var12 != null; var12 = (class272) class20.field203.method3216(true)) {
                            int var13 = var12.field4377;
                            int var14 = ((class620.field8960.field8570[var13] & 0xFFFF063) >> 14) - class397.field6289;
                            int var15 = (class620.field8960.field8570[var13] & 0x3FFF) - class141.field2011;
                            int var16 = var14 * 4 + (2 - var8 / 128);
                            int var17 = var15 * 4 + 2 - (var6 / 128);
                            class94.method913(arg0, arg1, var16, arg2, arg4, var17, class620.field8960.field8568[var13], -3877, var5);
                        }
                        for (int var18 = 0; var18 < class54.field693; var18++) {
                            int var19 = class433.field6807[var18] * 4 + 2 - (var8 / 128);
                            int var20 = class98.field1447[var18] * 4 + 2 - (var6 / 128);
                            class362 var21 = class370.field5999.method4002(arg3 ^ 0x68, class523.field7729[var18]);
                            if (var21.field5873 != null) {
                                var21 = var21.method2997(-20, class398.field6315);
                                if (var21 == null || var21.field5864 == -1) {
                                    continue;
                                }
                            }
                            class94.method913(arg0, arg1, var19, arg2, arg4, var20, var21.field5864, -3877, var5);
                        }
                        for (class430 var22 = (class430) class96.field1407.method735(0); var22 != null; var22 = (class430) class96.field1407.method734((byte) -50)) {
                            int var23 = (int) (var22.field8252 >> 28 & 0x3L);
                            if (class478.field7266 == var23) {
                                int var24 = (int) (var22.field8252 & 0x3FFFL) - class397.field6289;
                                int var25 = (int) (var22.field8252 >> 14 & 0x3FFFL) - class141.field2011;
                                int var26 = var24 * 4 - (var8 / 128 - 2);
                                int var27 = var25 * 4 + 2 - var6 / 128;
                                class610.method4449(class324.field5254[0], var27, arg1, arg2, 4, var5, arg0, var26);
                            }
                        }
                        for (int var28 = 0; var28 < class632.field9088; var28++) {
                            class19 var29 = (class19) class176.field2797.method737((byte) -39, (long) class263.field4278[var28]);
                            if (var29 != null) {
                                class426 var30 = var29.field194;
                                if (var30.method3377((byte) -95) && class438.field6846.field9975 == var30.field9975) {
                                    class162 var31 = var30.field6716;
                                    if (var31 != null && var31.field2620 != null) {
                                        var31 = var31.method1530(arg3 - 60, class398.field6315);
                                    }
                                    if (var31 != null && var31.field2616 && var31.field2556) {
                                        int var32 = var30.field9985 / 128 - var8 / 128;
                                        int var33 = var30.field9983 / 128 - (var6 / 128);
                                        if (var31.field2584 == -1) {
                                            class610.method4449(class324.field5254[1], var33, arg1, arg2, 4, var5, arg0, var32);
                                        } else {
                                            class94.method913(arg0, arg1, var32, arg2, arg4, var33, var31.field2584, arg3 ^ 0xFFFFF0DE, var5);
                                        }
                                    }
                                }
                            }
                        }
                        int var34 = class691.field9962;
                        int[] var35 = class239.field3685;
                        for (int var36 = 0; var36 < var34; var36++) {
                            class738 var37 = class33.field395[var35[var36]];
                            if (var37 != null && var37.method5365((byte) -95) && !var37.field10799 && class438.field6846 != var37 && class438.field6846.field9975 == var37.field9975) {
                                int var38 = var37.field9985 / 128 - (var8 / 128);
                                int var39 = var37.field9983 / 128 - (var6 / 128);
                                boolean var40 = false;
                                for (int var41 = 0; var41 < class198.field3145; var41++) {
                                    if (var37.field10821.equals(class129.field1846[var41]) && class129.field1847[var41] != 0) {
                                        var40 = true;
                                        break;
                                    }
                                }
                                boolean var42 = false;
                                for (int var43 = 0; var43 < class712.field10299; var43++) {
                                    if (var37.field10821.equals(class566.field8232[var43].field6676)) {
                                        var42 = true;
                                        break;
                                    }
                                }
                                boolean var44 = false;
                                if (class438.field6846.field10824 != 0 && var37.field10824 != 0 && class438.field6846.field10824 == var37.field10824) {
                                    var44 = true;
                                }
                                if (var37.field10849) {
                                    class610.method4449(class324.field5254[6], var39, arg1, arg2, 4, var5, arg0, var38);
                                } else if (var44) {
                                    class610.method4449(class324.field5254[4], var39, arg1, arg2, 4, var5, arg0, var38);
                                } else if (var37.field10853) {
                                    class610.method4449(class324.field5254[7], var39, arg1, arg2, arg3 ^ 0x1, var5, arg0, var38);
                                } else if (var40) {
                                    class610.method4449(class324.field5254[3], var39, arg1, arg2, 4, var5, arg0, var38);
                                } else if (var42) {
                                    class610.method4449(class324.field5254[5], var39, arg1, arg2, 4, var5, arg0, var38);
                                } else {
                                    class610.method4449(class324.field5254[2], var39, arg1, arg2, 4, var5, arg0, var38);
                                }
                            }
                        }
                        class165[] var45 = class262.field4273;
                        for (int var46 = 0; var46 < var45.length; var46++) {
                            class165 var47 = var45[var46];
                            if (var47 != null && var47.field2676 != 0 && class431.field6776 % 20 < 10) {
                                if (var47.field2676 == 1) {
                                    class19 var48 = (class19) class176.field2797.method737((byte) -39, (long) var47.field2687);
                                    if (var48 != null) {
                                        class426 var49 = var48.field194;
                                        int var50 = var49.field9985 / 128 - var8 / 128;
                                        int var51 = var49.field9983 / 128 - (var6 / 128);
                                        class157.method1411(arg1, 256, var47.field2679, var50, 360000L, arg0, arg2, var51, var5);
                                    }
                                }
                                if (var47.field2676 == 2) {
                                    int var52 = var47.field2675 / 128 - var8 / 128;
                                    int var53 = var47.field2683 / 128 - (var6 / 128);
                                    long var54 = (long) (var47.field2684 << 7);
                                    long var56 = var54 * var54;
                                    class157.method1411(arg1, arg3 + 251, var47.field2679, var52, var56, arg0, arg2, var53, var5);
                                }
                                if (var47.field2676 == 10 && var47.field2687 >= 0 && class33.field395.length > var47.field2687) {
                                    class738 var58 = class33.field395[var47.field2687];
                                    if (var58 != null) {
                                        int var59 = var58.field9985 / 128 - var8 / 128;
                                        int var60 = var58.field9983 / 128 - (var6 / 128);
                                        class157.method1411(arg1, 256, var47.field2679, var59, 360000L, arg0, arg2, var60, var5);
                                    }
                                }
                            }
                        }
                        if (class401.field6334 != 4) {
                            if (class83.field1262 != 0) {
                                int var61 = (class83.field1262 * 4 - (var8 / 128 - (class438.field6846.method804(true) - 1) * 2)) + 2;
                                int var62 = class232.field3598 * 4 + 2 - var6 / 128 - (-(class438.field6846.method804(true) * 2) + 2);
                                class610.method4449(class425.field6689[class499.field7490 ? 1 : 0], var62, arg1, arg2, 4, var5, arg0, var61);
                            }
                            if (!class438.field6846.field10799) {
                                arg4.method664(arg0.field9777 / 2 + arg2 - 1, -1, 3, arg0.field9797 / 2 + (arg1 - 1), 3, true);
                                return;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var64) {
            throw class590.method4333(var64, field6625[6] + (arg0 == null ? field6625[2] : field6625[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field6625[2] : field6625[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLvf;)V", line = 383)
    private final void method3333(boolean arg0, class159 arg1) {
        try {
            field6602++;
            class404.field6399 = arg1.field2461;
            arg1.method1499(116);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            if (!arg0) {
                method3332(null, 52, 109, -12, null);
            }
            arg1.method1489(-19225, false);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6625[11] + arg0 + ',' + (arg1 == null ? field6625[2] : field6625[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I", line = 399)
    public static final int method3334(int arg0, int arg1) {
        try {
            field6607++;
            return arg1 == -31075 ? arg0 & 0xFF : -78;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6625[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILvf;ZLsn;)V", line = 412)
    public final void method3335(int arg0, class159 arg1, boolean arg2, class659 arg3) {
        try {
            field6600++;
            if (arg1.field2423 != null) {
                if (arg0 >= 0) {
                    this.method3328((byte) -48, arg1, arg0);
                } else {
                    this.method3333(!arg2, arg1);
                }
                float var5 = arg1.field2423.field9678;
                float var6 = arg1.field2423.field9705;
                float var7 = arg1.field2423.field9685;
                float var8 = arg1.field2423.field9689;
                try {
                    int var9 = 0;
                    int var10 = Integer.MAX_VALUE;
                    int var11 = 0;
                    class688 var12 = arg3.field9415.field7702;
                    if (arg2) {
                        this.field6614 = null;
                    }
                    for (class688 var13 = var12.field9939; var13 != var12; var13 = var13.field9939) {
                        class590 var14 = (class590) var13;
                        int var15 = (int) ((float) (var14.field8560 >> 12) * var7 + (float) (var14.field8564 >> 12) * var6 + (float) (var14.field8554 >> 12) * var5 + var8);
                        if (var11 < var15) {
                            var11 = var15;
                        }
                        if (var15 < var10) {
                            var10 = var15;
                        }
                        this.field6620[var9++] = var15;
                    }
                    int var16 = var11 - var10;
                    int var17;
                    if (var16 + 2 > 1600) {
                        var17 = class349.method2911(-123, var16) + 1 - this.field6618;
                        var16 = (var16 >> var17) + 2;
                    } else {
                        var16 += 2;
                        var17 = 0;
                    }
                    int var18 = 0;
                    class688 var19 = var12.field9939;
                    int var20 = -2;
                    boolean var21 = true;
                    boolean var22 = true;
                    while (var12 != var19) {
                        this.field6621 = 0;
                        for (int var23 = 0; var23 < var16; var23++) {
                            this.field6619[var23] = 0;
                        }
                        for (int var24 = 0; var24 < 64; var24++) {
                            this.field6624[var24] = 0;
                        }
                        while (var12 != var19) {
                            class590 var25 = (class590) var19;
                            if (var22) {
                                var22 = false;
                                var21 = var25.field8565;
                                var20 = var25.field8566;
                            }
                            if (var18 > 0 && (var25.field8566 != var20 || var21 != var25.field8565)) {
                                var22 = true;
                                break;
                            }
                            int var26 = this.field6620[var18++] - var10 >> var17;
                            if (var26 < 1600) {
                                if (this.field6619[var26] >= 64) {
                                    label146: {
                                        if (this.field6619[var26] == 64) {
                                            if (this.field6621 == 64) {
                                                break label146;
                                            }
                                            this.field6619[var26] += this.field6621++ + 1;
                                        }
                                        this.field6623[this.field6619[var26] - 1 - 64][this.field6624[this.field6619[var26] - 64 - 1]++] = var25;
                                    }
                                } else {
                                    this.field6622[var26][this.field6619[var26]++] = var25;
                                }
                            }
                            var19 = var19.field9939;
                        }
                        if (var20 < 0) {
                            arg1.method1447(-1, 20014);
                        } else {
                            arg1.method1447(var20, 20014);
                        }
                        if (var21 && class404.field6399 != arg1.field2461) {
                            arg1.method166(class404.field6399);
                        } else if (arg1.field2461 != 1.0F) {
                            arg1.method166(1.0F);
                        }
                        this.method3336(arg1, var16, true);
                    }
                } catch (Exception var28) {
                }
                this.method3331(arg1, 16384);
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field6625[5] + arg0 + ',' + (arg1 == null ? field6625[2] : field6625[0]) + ',' + arg2 + ',' + (arg3 == null ? field6625[2] : field6625[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lvf;IZ)V", line = 580)
    private final void method3336(class159 arg0, int arg1, boolean arg2) {
        try {
            if (!arg2) {
                field6601 = null;
            }
            OpenGL.glGetFloatv(2982, this.field6604, 0);
            field6605++;
            float var4 = this.field6604[0];
            float var5 = this.field6604[4];
            float var6 = this.field6604[8];
            float var7 = this.field6604[1];
            float var8 = this.field6604[5];
            float var9 = this.field6604[9];
            float var10 = var4 + var7;
            float var11 = var5 + var8;
            float var12 = var6 + var9;
            float var13 = var4 - var7;
            float var14 = var5 - var8;
            float var15 = var6 - var9;
            float var16 = var7 - var4;
            float var17 = var8 - var5;
            float var18 = var9 - var6;
            this.field6611.field2799 = 0;
            if (arg0.field2500) {
                for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                    int var20 = this.field6619[var19] <= 64 ? this.field6619[var19] : 64;
                    if (var20 > 0) {
                        for (int var21 = var20 - 1; var21 >= 0; var21--) {
                            class590 var22 = this.field6622[var19][var21];
                            int var23 = var22.field8556;
                            byte var24 = (byte) (var23 >> 16);
                            byte var25 = (byte) (var23 >> 8);
                            byte var26 = (byte) var23;
                            byte var27 = (byte) (var23 >>> 24);
                            float var28 = (float) (var22.field8554 >> 12);
                            float var29 = (float) (var22.field8564 >> 12);
                            float var30 = (float) (var22.field8560 >> 12);
                            int var31 = var22.field8559 >> 12;
                            this.field6611.method4708(0.0F, true);
                            this.field6611.method4708(0.0F, true);
                            this.field6611.method4708((float) (-var31) * var10 + var28, true);
                            this.field6611.method4708((float) (-var31) * var11 + var29, arg2);
                            this.field6611.method4708((float) (-var31) * var12 + var30, true);
                            this.field6611.method1678(var24, 65280);
                            this.field6611.method1678(var25, 65280);
                            this.field6611.method1678(var26, 65280);
                            this.field6611.method1678(var27, 65280);
                            this.field6611.method4708(1.0F, true);
                            this.field6611.method4708(0.0F, true);
                            this.field6611.method4708((float) var31 * var13 + var28, true);
                            this.field6611.method4708((float) var31 * var14 + var29, true);
                            this.field6611.method4708((float) var31 * var15 + var30, true);
                            this.field6611.method1678(var24, 65280);
                            this.field6611.method1678(var25, 65280);
                            this.field6611.method1678(var26, 65280);
                            this.field6611.method1678(var27, 65280);
                            this.field6611.method4708(1.0F, true);
                            this.field6611.method4708(1.0F, true);
                            this.field6611.method4708((float) var31 * var10 + var28, true);
                            this.field6611.method4708((float) var31 * var11 + var29, arg2);
                            this.field6611.method4708((float) var31 * var12 + var30, true);
                            this.field6611.method1678(var24, 65280);
                            this.field6611.method1678(var25, 65280);
                            this.field6611.method1678(var26, 65280);
                            this.field6611.method1678(var27, 65280);
                            this.field6611.method4708(0.0F, arg2);
                            this.field6611.method4708(1.0F, true);
                            this.field6611.method4708((float) var31 * var16 + var28, arg2);
                            this.field6611.method4708((float) var31 * var17 + var29, arg2);
                            this.field6611.method4708((float) var31 * var18 + var30, true);
                            this.field6611.method1678(var24, 65280);
                            this.field6611.method1678(var25, 65280);
                            this.field6611.method1678(var26, 65280);
                            this.field6611.method1678(var27, 65280);
                        }
                        if (this.field6619[var19] > 64) {
                            int var32 = this.field6619[var19] - 64 - 1;
                            for (int var33 = this.field6624[var32] - 1; var33 >= 0; var33--) {
                                class590 var34 = this.field6623[var32][var33];
                                int var35 = var34.field8556;
                                byte var36 = (byte) (var35 >> 16);
                                byte var37 = (byte) (var35 >> 8);
                                byte var38 = (byte) var35;
                                byte var39 = (byte) (var35 >>> 24);
                                float var40 = (float) (var34.field8554 >> 12);
                                float var41 = (float) (var34.field8564 >> 12);
                                float var42 = (float) (var34.field8560 >> 12);
                                int var43 = var34.field8559 >> 12;
                                this.field6611.method4708(0.0F, arg2);
                                this.field6611.method4708(0.0F, arg2);
                                this.field6611.method4708((float) (-var43) * var10 + var40, arg2);
                                this.field6611.method4708((float) (-var43) * var11 + var41, true);
                                this.field6611.method4708((float) (-var43) * var12 + var42, true);
                                this.field6611.method1678(var36, 65280);
                                this.field6611.method1678(var37, 65280);
                                this.field6611.method1678(var38, 65280);
                                this.field6611.method1678(var39, 65280);
                                this.field6611.method4708(1.0F, arg2);
                                this.field6611.method4708(0.0F, true);
                                this.field6611.method4708((float) var43 * var13 + var40, true);
                                this.field6611.method4708((float) var43 * var14 + var41, true);
                                this.field6611.method4708((float) var43 * var15 + var42, true);
                                this.field6611.method1678(var36, 65280);
                                this.field6611.method1678(var37, 65280);
                                this.field6611.method1678(var38, 65280);
                                this.field6611.method1678(var39, 65280);
                                this.field6611.method4708(1.0F, arg2);
                                this.field6611.method4708(1.0F, arg2);
                                this.field6611.method4708((float) var43 * var10 + var40, true);
                                this.field6611.method4708((float) var43 * var11 + var41, true);
                                this.field6611.method4708((float) var43 * var12 + var42, true);
                                this.field6611.method1678(var36, 65280);
                                this.field6611.method1678(var37, 65280);
                                this.field6611.method1678(var38, 65280);
                                this.field6611.method1678(var39, 65280);
                                this.field6611.method4708(0.0F, arg2);
                                this.field6611.method4708(1.0F, true);
                                this.field6611.method4708((float) var43 * var16 + var40, true);
                                this.field6611.method4708((float) var43 * var17 + var41, arg2);
                                this.field6611.method4708((float) var43 * var18 + var42, true);
                                this.field6611.method1678(var36, 65280);
                                this.field6611.method1678(var37, 65280);
                                this.field6611.method1678(var38, 65280);
                                this.field6611.method1678(var39, 65280);
                            }
                        }
                    }
                }
            } else {
                for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                    int var45 = this.field6619[var44] > 64 ? 64 : this.field6619[var44];
                    if (var45 > 0) {
                        for (int var46 = var45 - 1; var46 >= 0; var46--) {
                            class590 var47 = this.field6622[var44][var46];
                            int var48 = var47.field8556;
                            byte var49 = (byte) (var48 >> 16);
                            byte var50 = (byte) (var48 >> 8);
                            byte var51 = (byte) var48;
                            byte var52 = (byte) (var48 >>> 24);
                            float var53 = (float) (var47.field8554 >> 12);
                            float var54 = (float) (var47.field8564 >> 12);
                            float var55 = (float) (var47.field8560 >> 12);
                            int var56 = var47.field8559 >> 12;
                            this.field6611.method4710(-1597413832, 0.0F);
                            this.field6611.method4710(-1597413832, 0.0F);
                            this.field6611.method4710(-1597413832, (float) (-var56) * var10 + var53);
                            this.field6611.method4710(-1597413832, (float) (-var56) * var11 + var54);
                            this.field6611.method4710(-1597413832, (float) (-var56) * var12 + var55);
                            this.field6611.method1678(var49, 65280);
                            this.field6611.method1678(var50, 65280);
                            this.field6611.method1678(var51, 65280);
                            this.field6611.method1678(var52, 65280);
                            this.field6611.method4710(-1597413832, 1.0F);
                            this.field6611.method4710(-1597413832, 0.0F);
                            this.field6611.method4710(-1597413832, (float) var56 * var13 + var53);
                            this.field6611.method4710(-1597413832, (float) var56 * var14 + var54);
                            this.field6611.method4710(-1597413832, (float) var56 * var15 + var55);
                            this.field6611.method1678(var49, 65280);
                            this.field6611.method1678(var50, 65280);
                            this.field6611.method1678(var51, 65280);
                            this.field6611.method1678(var52, 65280);
                            this.field6611.method4710(-1597413832, 1.0F);
                            this.field6611.method4710(-1597413832, 1.0F);
                            this.field6611.method4710(-1597413832, (float) var56 * var10 + var53);
                            this.field6611.method4710(-1597413832, (float) var56 * var11 + var54);
                            this.field6611.method4710(-1597413832, (float) var56 * var12 + var55);
                            this.field6611.method1678(var49, 65280);
                            this.field6611.method1678(var50, 65280);
                            this.field6611.method1678(var51, 65280);
                            this.field6611.method1678(var52, 65280);
                            this.field6611.method4710(-1597413832, 0.0F);
                            this.field6611.method4710(-1597413832, 1.0F);
                            this.field6611.method4710(-1597413832, (float) var56 * var16 + var53);
                            this.field6611.method4710(-1597413832, (float) var56 * var17 + var54);
                            this.field6611.method4710(-1597413832, (float) var56 * var18 + var55);
                            this.field6611.method1678(var49, 65280);
                            this.field6611.method1678(var50, 65280);
                            this.field6611.method1678(var51, 65280);
                            this.field6611.method1678(var52, 65280);
                        }
                        if (this.field6619[var44] > 64) {
                            int var57 = this.field6619[var44] - 65;
                            for (int var58 = this.field6624[var57] - 1; var58 >= 0; var58--) {
                                class590 var59 = this.field6623[var57][var58];
                                int var60 = var59.field8556;
                                byte var61 = (byte) (var60 >> 16);
                                byte var62 = (byte) (var60 >> 8);
                                byte var63 = (byte) var60;
                                byte var64 = (byte) (var60 >>> 24);
                                float var65 = (float) (var59.field8554 >> 12);
                                float var66 = (float) (var59.field8564 >> 12);
                                float var67 = (float) (var59.field8560 >> 12);
                                int var68 = var59.field8559 >> 12;
                                this.field6611.method4710(-1597413832, 0.0F);
                                this.field6611.method4710(-1597413832, 0.0F);
                                this.field6611.method4710(-1597413832, (float) (-var68) * var10 + var65);
                                this.field6611.method4710(-1597413832, (float) (-var68) * var11 + var66);
                                this.field6611.method4710(-1597413832, (float) (-var68) * var12 + var67);
                                this.field6611.method1678(var61, 65280);
                                this.field6611.method1678(var62, 65280);
                                this.field6611.method1678(var63, 65280);
                                this.field6611.method1678(var64, 65280);
                                this.field6611.method4710(-1597413832, 1.0F);
                                this.field6611.method4710(-1597413832, 0.0F);
                                this.field6611.method4710(-1597413832, (float) var68 * var13 + var65);
                                this.field6611.method4710(-1597413832, (float) var68 * var14 + var66);
                                this.field6611.method4710(-1597413832, (float) var68 * var15 + var67);
                                this.field6611.method1678(var61, 65280);
                                this.field6611.method1678(var62, 65280);
                                this.field6611.method1678(var63, 65280);
                                this.field6611.method1678(var64, 65280);
                                this.field6611.method4710(-1597413832, 1.0F);
                                this.field6611.method4710(-1597413832, 1.0F);
                                this.field6611.method4710(-1597413832, (float) var68 * var10 + var65);
                                this.field6611.method4710(-1597413832, (float) var68 * var11 + var66);
                                this.field6611.method4710(-1597413832, (float) var68 * var12 + var67);
                                this.field6611.method1678(var61, 65280);
                                this.field6611.method1678(var62, 65280);
                                this.field6611.method1678(var63, 65280);
                                this.field6611.method1678(var64, 65280);
                                this.field6611.method4710(-1597413832, 0.0F);
                                this.field6611.method4710(-1597413832, 1.0F);
                                this.field6611.method4710(-1597413832, (float) var68 * var16 + var65);
                                this.field6611.method4710(-1597413832, (float) var68 * var17 + var66);
                                this.field6611.method4710(-1597413832, (float) var68 * var18 + var67);
                                this.field6611.method1678(var61, 65280);
                                this.field6611.method1678(var62, 65280);
                                this.field6611.method1678(var63, 65280);
                                this.field6611.method1678(var64, 65280);
                            }
                        }
                    }
                }
            }
            if (this.field6611.field2799 != 0) {
                this.field6616.method3028(this.field6611.field2799, this.field6611.field2805, 24, -101);
                arg0.method1481(this.field6617, this.field6613, (byte) -73, this.field6614, null);
                arg0.method1450(0, 7, 34200, this.field6611.field2799 / 24);
            }
        } catch (RuntimeException var70) {
            throw class590.method4333(var70, field6625[4] + (arg0 == null ? field6625[2] : field6625[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lvf;I)V", line = 955)
    public final void method3337(class159 arg0, int arg1) {
        try {
            field6609++;
            this.field6616 = arg0.method1488((byte) 31, 196584, null, 24, true);
            if (arg1 >= -100) {
                method3332(null, -82, 108, 96, null);
            }
            this.field6613 = new class774(this.field6616, 5126, 2, 0);
            this.field6614 = new class774(this.field6616, 5126, 3, 8);
            this.field6617 = new class774(this.field6616, 5121, 4, 20);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6625[3] + (arg0 == null ? field6625[2] : field6625[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3338(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3339(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 85;
                    break;
                default:
                    var10005 = 29;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
