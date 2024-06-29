import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class198 extends class61 {

    @OriginalMember(owner = "client!fh", name = "W", descriptor = "Z")
    public boolean field3192 = false;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "I")
    private int field3178 = -1;

    @OriginalMember(owner = "client!fh", name = "db", descriptor = "I")
    private int field3199 = 0;

    @OriginalMember(owner = "client!fh", name = "eb", descriptor = "Log;")
    private class204 field3200;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "Z")
    private boolean field3184;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "Z")
    private boolean field3190;

    @OriginalMember(owner = "client!fh", name = "ib", descriptor = "Z")
    private boolean field3204;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "Z")
    private boolean field3187;

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    private int field3186;

    @OriginalMember(owner = "client!fh", name = "R", descriptor = "I")
    private int field3188;

    @OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
    private int field3194;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    private int field3183;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "Lwm;")
    public static class152 field3182 = class157.method1048("<br>", 99);

    @OriginalMember(owner = "client!fh", name = "cb", descriptor = "Lwm;")
    public static class152 field3198 = class157.method1048("Annuler", 104);

    @OriginalMember(owner = "client!fh", name = "X", descriptor = "Lwm;")
    private static class152 field3193 = class157.method1048("Loaded update list", 111);

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Lwm;")
    public static class152 field3180 = field3193;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "F")
    private float field3176;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!fh", name = "V", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!fh", name = "Z", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!fh", name = "bb", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!fh", name = "fb", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!fh", name = "gb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!fh", name = "hb", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "[I")
    private int[] field3185;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)I", line = 7)
    public static final int method1316(int arg0) {
        field3177++;
        return arg0 == 2 ? 2 : -124;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLu;Lah;I)[I", line = 18)
    public final int[] method1317(boolean arg0, class255 arg1, class205 arg2, int arg3) {
        if (arg3 != 64) {
            this.method1324((class205) null, true, -1.342694F, -94, (class255) null);
        }
        field3195++;
        if (this.field3200.method1350(arg1, arg2, (byte) 78)) {
            int var5 = arg0 ? 64 : 128;
            return this.field3200.method1352(arg2, var5, (byte) -11, arg1, this.field3190, var5, 1.0D, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lkb;Z)V", line = 34)
    public static final void method1318(class34 arg0, boolean arg1) {
        class183.field2919.method1214(false, arg0);
        while (true) {
            class34 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class34[][] var7;
            class34 var78;
            do {
                class34 var77;
                do {
                    class34 var76;
                    do {
                        class34 var75;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class34) class183.field2919.method1215((byte) -92);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field557);
                                            var3 = var2.field555;
                                            var4 = var2.field553;
                                            var5 = var2.field565;
                                            var6 = var2.field566;
                                            var7 = class287.field4857[var5];
                                            float var8 = 0.0F;
                                            if (class217.field3516) {
                                                if (class65.field984 == class231.field3779) {
                                                    int var9 = class290.field4926[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class64.field954 != var10) {
                                                        class64.field954 = var10;
                                                        class106.method707(119, var10);
                                                        class14.method92(class267.method1828(98));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class44.field705 != var11) {
                                                        class44.field705 = var11;
                                                        class146.method921(var11, (byte) -122);
                                                    }
                                                    int var12 = class123.field1728[0][var3 + 1][var4] + class123.field1728[0][var3][var4] + class123.field1728[0][var3][var4 + 1] + class123.field1728[0][var3 + 1][var4 + 1] >> 2;
                                                    class89.method587(3, -var12, -10);
                                                    var8 = 201.5F;
                                                    class217.method1488(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class217.method1488(var8);
                                                }
                                            }
                                            if (!var2.field559) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class34 var13 = class287.field4857[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field557) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class84.field1162 && var3 > class195.field3130) {
                                                    class34 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field557 && (var14.field559 || (var2.field556 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class84.field1162 && var3 < class134.field2068 - 1) {
                                                    class34 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field557 && (var15.field559 || (var2.field556 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class202.field3259 && var4 > class237.field3878) {
                                                    class34 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field557 && (var16.field559 || (var2.field556 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class202.field3259 && var4 < class314.field5445 - 1) {
                                                    class34 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field557 && (var17.field559 || (var2.field556 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field559 = false;
                                            if (var2.field582 != null) {
                                                class34 var18 = var2.field582;
                                                if (class217.field3516) {
                                                    class217.method1488(201.5F - (float) (var18.field566 + 1) * 50.0F);
                                                }
                                                if (var18.field578 == null) {
                                                    if (var18.field561 != null) {
                                                        if (class224.method1544(0, var3, var4)) {
                                                            class111.method740(var18.field561, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, true);
                                                        } else {
                                                            class111.method740(var18.field561, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class224.method1544(0, var3, var4)) {
                                                    class157.method1052(var18.field578, 0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, true);
                                                } else {
                                                    class157.method1052(var18.field578, 0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, false);
                                                }
                                                class294 var19 = var18.field573;
                                                if (var19 != null) {
                                                    if (class217.field3516) {
                                                        if ((var19.field5029 & var2.field571) == 0) {
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                        } else {
                                                            class24.method209(var19.field5029, class27.field460, class3.field54, class239.field3916, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field5026.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var19.field5024 - class27.field460, var19.field5020 - class3.field54, var19.field5027 - class239.field3916, var19.field5019, var5, (class47) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field579; var20++) {
                                                    class248 var21 = var18.field580[var20];
                                                    if (var21 != null) {
                                                        if (class217.field3516) {
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                        }
                                                        var21.field4144.method21(var21.field4147, class74.field1075, class25.field430, class184.field2924, class219.field3559, var21.field4155 - class27.field460, var21.field4152 - class3.field54, var21.field4159 - class239.field3916, var21.field4156, var5, (class47) null);
                                                    }
                                                }
                                                if (class217.field3516) {
                                                    class217.method1488(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field578 == null) {
                                                if (var2.field561 != null) {
                                                    if (class224.method1544(var6, var3, var4)) {
                                                        class111.method740(var2.field561, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class111.method740(var2.field561, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, false);
                                                    }
                                                }
                                            } else if (class224.method1544(var6, var3, var4)) {
                                                class157.method1052(var2.field578, var6, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field578.field3500 != 12345678 || class240.field3937 && var5 <= class135.field2080) {
                                                    class157.method1052(var2.field578, var6, class74.field1075, class25.field430, class184.field2924, class219.field3559, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class120 var23 = var2.field558;
                                                if (var23 != null && (var23.field1685 & 0x80000000L) != 0L) {
                                                    if (class217.field3516 && var23.field1689) {
                                                        class217.method1488(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    var23.field1684.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var23.field1688 - class27.field460, var23.field1696 - class3.field54, var23.field1690 - class239.field3916, var23.field1685, var5, (class47) null);
                                                    if (class217.field3516 && var23.field1689) {
                                                        class217.method1488(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class294 var26 = var2.field573;
                                            class275 var27 = var2.field554;
                                            if (var26 != null || var27 != null) {
                                                if (class84.field1162 == var3) {
                                                    var24++;
                                                } else if (class84.field1162 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class202.field3259 == var4) {
                                                    var24 += 3;
                                                } else if (class202.field3259 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class41.field661[var24];
                                                var2.field571 = class270.field4567[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field5029 & class228.field3734[var24]) == 0) {
                                                    var2.field569 = 0;
                                                } else if (var26.field5029 == 16) {
                                                    var2.field569 = 3;
                                                    var2.field567 = class51.field792[var24];
                                                    var2.field575 = 3 - var2.field567;
                                                } else if (var26.field5029 == 32) {
                                                    var2.field569 = 6;
                                                    var2.field567 = class147.field2252[var24];
                                                    var2.field575 = 6 - var2.field567;
                                                } else if (var26.field5029 == 64) {
                                                    var2.field569 = 12;
                                                    var2.field567 = class118.field1679[var24];
                                                    var2.field575 = 12 - var2.field567;
                                                } else {
                                                    var2.field569 = 9;
                                                    var2.field567 = class135.field2082[var24];
                                                    var2.field575 = 9 - var2.field567;
                                                }
                                                if ((var26.field5029 & var25) != 0 && !class227.method1557(var6, var3, var4, var26.field5029)) {
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    var26.field5026.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var26.field5024 - class27.field460, var26.field5020 - class3.field54, var26.field5027 - class239.field3916, var26.field5019, var5, (class47) null);
                                                }
                                                if ((var26.field5025 & var25) != 0 && !class227.method1557(var6, var3, var4, var26.field5025)) {
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    var26.field5028.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var26.field5024 - class27.field460, var26.field5020 - class3.field54, var26.field5027 - class239.field3916, var26.field5019, var5, (class47) null);
                                                }
                                            }
                                            if (var27 != null && !class196.method1309(var6, var3, var4, var27.field4707.method22())) {
                                                if (class217.field3516) {
                                                    class217.method1488(var8 - 0.5F);
                                                }
                                                if ((var27.field4711 & var25) != 0) {
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    var27.field4707.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var27.field4718 + var27.field4708 - class27.field460, var27.field4713 - class3.field54, var27.field4706 + var27.field4703 - class239.field3916, var27.field4717, var5, (class47) null);
                                                } else if (var27.field4711 == 256) {
                                                    int var28 = var27.field4718 - class27.field460;
                                                    int var29 = var27.field4713 - class3.field54;
                                                    int var30 = var27.field4706 - class239.field3916;
                                                    int var31 = var27.field4719;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class217.field3516) {
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                        }
                                                        var27.field4707.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var27.field4708 + var28, var29, var27.field4703 + var30, var27.field4717, var5, (class47) null);
                                                    } else if (var27.field4700 != null) {
                                                        if (class217.field3516) {
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                        }
                                                        var27.field4700.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var28, var29, var30, var27.field4717, var5, (class47) null);
                                                    }
                                                }
                                                if (class217.field3516) {
                                                    class217.method1488(var8);
                                                }
                                            }
                                            if (var22) {
                                                class120 var34 = var2.field558;
                                                if (var34 != null && (var34.field1685 & 0x80000000L) == 0L) {
                                                    if (class217.field3516 && var34.field1689) {
                                                        class217.method1488(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    var34.field1684.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var34.field1688 - class27.field460, var34.field1696 - class3.field54, var34.field1690 - class239.field3916, var34.field1685, var5, (class47) null);
                                                    if (class217.field3516 && var34.field1689) {
                                                        class217.method1488(var8);
                                                    }
                                                }
                                                class51 var35 = var2.field574;
                                                if (var35 != null && var35.field790 == 0) {
                                                    if (class217.field3516) {
                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                    }
                                                    if (var35.field794 != null) {
                                                        var35.field794.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var35.field804 - class27.field460, var35.field789 - class3.field54, var35.field787 - class239.field3916, var35.field786, var5, (class47) null);
                                                    }
                                                    if (var35.field788 != null) {
                                                        var35.field788.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var35.field804 - class27.field460, var35.field789 - class3.field54, var35.field787 - class239.field3916, var35.field786, var5, (class47) null);
                                                    }
                                                    if (var35.field799 != null) {
                                                        var35.field799.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var35.field804 - class27.field460, var35.field789 - class3.field54, var35.field787 - class239.field3916, var35.field786, var5, (class47) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field556;
                                            if (var36 != 0) {
                                                if (var3 < class84.field1162 && (var36 & 0x4) != 0) {
                                                    class34 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field557) {
                                                        class183.field2919.method1214(false, var37);
                                                    }
                                                }
                                                if (var4 < class202.field3259 && (var36 & 0x2) != 0) {
                                                    class34 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field557) {
                                                        class183.field2919.method1214(false, var38);
                                                    }
                                                }
                                                if (var3 > class84.field1162 && (var36 & 0x1) != 0) {
                                                    class34 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field557) {
                                                        class183.field2919.method1214(false, var39);
                                                    }
                                                }
                                                if (var4 > class202.field3259 && (var36 & 0x8) != 0) {
                                                    class34 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field557) {
                                                        class183.field2919.method1214(false, var40);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field569 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field579; var42++) {
                                                if (class244.field4064 != var2.field580[var42].field4154 && (var2.field568[var42] & var2.field569) == var2.field567) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class294 var43 = var2.field573;
                                                if (!class227.method1557(var6, var3, var4, var43.field5029)) {
                                                    if (class217.field3516) {
                                                        label882: {
                                                            if ((var43.field5019 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field5024 - class27.field460;
                                                                int var45 = var43.field5027 - class239.field3916;
                                                                int var46 = (int) (var43.field5019 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class97.field1394 - 1) {
                                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3 - 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class112.field1595 - 1 && var4 < class97.field1394 - 1) {
                                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3 + 1, var4 + 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class112.field1595 - 1 && var4 > 0) {
                                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3 + 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3 - 1, var4 - 1);
                                                                        break label882;
                                                                    }
                                                                }
                                                            }
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field5026.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var43.field5024 - class27.field460, var43.field5020 - class3.field54, var43.field5027 - class239.field3916, var43.field5019, var5, (class47) null);
                                                }
                                                var2.field569 = 0;
                                            }
                                        }
                                        if (!var2.field577) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field579;
                                            var2.field577 = false;
                                            int var48 = 0;
                                            label767: for (int var49 = 0; var49 < var47; var49++) {
                                                class248 var50 = var2.field580[var49];
                                                if (class244.field4064 != var50.field4154) {
                                                    for (int var51 = var50.field4157; var51 <= var50.field4153; var51++) {
                                                        for (int var52 = var50.field4151; var52 <= var50.field4150; var52++) {
                                                            class34 var53 = var7[var51][var52];
                                                            if (var53.field559) {
                                                                var2.field577 = true;
                                                                continue label767;
                                                            }
                                                            if (var53.field569 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field4157) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field4153) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field4151) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field4150) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field569) == var2.field575) {
                                                                    var2.field577 = true;
                                                                    continue label767;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class163.field2579[var48++] = var50;
                                                    int var55 = class84.field1162 - var50.field4157;
                                                    int var56 = var50.field4153 - class84.field1162;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class202.field3259 - var50.field4151;
                                                    int var58 = var50.field4150 - class202.field3259;
                                                    if (var58 > var57) {
                                                        var50.field4141 = var55 + var58;
                                                    } else {
                                                        var50.field4141 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class248 var62 = class163.field2579[var61];
                                                    if (class244.field4064 != var62.field4154) {
                                                        if (var62.field4141 > var59) {
                                                            var59 = var62.field4141;
                                                            var60 = var61;
                                                        } else if (var62.field4141 == var59) {
                                                            int var63 = var62.field4155 - class27.field460;
                                                            int var64 = var62.field4159 - class239.field3916;
                                                            int var65 = class163.field2579[var60].field4155 - class27.field460;
                                                            int var66 = class163.field2579[var60].field4159 - class239.field3916;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class248 var67 = class163.field2579[var60];
                                                var67.field4154 = class244.field4064;
                                                if (!class183.method1216(var6, var67.field4157, var67.field4153, var67.field4151, var67.field4150, var67.field4144.method22())) {
                                                    if (class217.field3516) {
                                                        if ((var67.field4156 & 0xFC000L) == 147456L) {
                                                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                                                            int var68 = var67.field4155 - class27.field460;
                                                            int var69 = var67.field4159 - class239.field3916;
                                                            int var70 = (int) (var67.field4156 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class24.method201(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class24.method201(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class24.method201(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class24.method201(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class24.method206(class27.field460, class3.field54, class239.field3916, var5, var67.field4157, var67.field4151, var67.field4153, var67.field4150);
                                                        }
                                                    }
                                                    var67.field4144.method21(var67.field4147, class74.field1075, class25.field430, class184.field2924, class219.field3559, var67.field4155 - class27.field460, var67.field4152 - class3.field54, var67.field4159 - class239.field3916, var67.field4156, var5, (class47) null);
                                                }
                                                for (int var71 = var67.field4157; var71 <= var67.field4153; var71++) {
                                                    for (int var72 = var67.field4151; var72 <= var67.field4150; var72++) {
                                                        class34 var73 = var7[var71][var72];
                                                        if (var73.field569 != 0) {
                                                            class183.field2919.method1214(false, var73);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field557) {
                                                            class183.field2919.method1214(false, var73);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field577) {
                                                break;
                                            }
                                        } catch (Exception var93) {
                                            var2.field577 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field557);
                            } while (var2.field569 != 0);
                            if (var3 > class84.field1162 || var3 <= class195.field3130) {
                                break;
                            }
                            var75 = var7[var3 - 1][var4];
                        } while (var75 != null && var75.field557);
                        if (var3 < class84.field1162 || var3 >= class134.field2068 - 1) {
                            break;
                        }
                        var76 = var7[var3 + 1][var4];
                    } while (var76 != null && var76.field557);
                    if (var4 > class202.field3259 || var4 <= class237.field3878) {
                        break;
                    }
                    var77 = var7[var3][var4 - 1];
                } while (var77 != null && var77.field557);
                if (var4 < class202.field3259 || var4 >= class314.field5445 - 1) {
                    break;
                }
                var78 = var7[var3][var4 + 1];
            } while (var78 != null && var78.field557);
            var2.field557 = false;
            class282.field4801--;
            class51 var79 = var2.field574;
            if (var79 != null && var79.field790 != 0) {
                if (class217.field3516) {
                    class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                }
                if (var79.field794 != null) {
                    var79.field794.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var79.field804 - class27.field460, var79.field789 - class3.field54 - var79.field790, var79.field787 - class239.field3916, var79.field786, var5, (class47) null);
                }
                if (var79.field788 != null) {
                    var79.field788.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var79.field804 - class27.field460, var79.field789 - class3.field54 - var79.field790, var79.field787 - class239.field3916, var79.field786, var5, (class47) null);
                }
                if (var79.field799 != null) {
                    var79.field799.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var79.field804 - class27.field460, var79.field789 - class3.field54 - var79.field790, var79.field787 - class239.field3916, var79.field786, var5, (class47) null);
                }
            }
            if (var2.field571 != 0) {
                class275 var80 = var2.field554;
                if (var80 != null && !class196.method1309(var6, var3, var4, var80.field4707.method22())) {
                    if ((var80.field4711 & var2.field571) != 0) {
                        if (class217.field3516) {
                            class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                        }
                        var80.field4707.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var80.field4718 + var80.field4708 - class27.field460, var80.field4713 - class3.field54, var80.field4706 + var80.field4703 - class239.field3916, var80.field4717, var5, (class47) null);
                    } else if (var80.field4711 == 256) {
                        int var81 = var80.field4718 - class27.field460;
                        int var82 = var80.field4713 - class3.field54;
                        int var83 = var80.field4706 - class239.field3916;
                        int var84 = var80.field4719;
                        int var85;
                        if (var84 == 1 || var84 == 2) {
                            var85 = -var81;
                        } else {
                            var85 = var81;
                        }
                        int var86;
                        if (var84 == 2 || var84 == 3) {
                            var86 = -var83;
                        } else {
                            var86 = var83;
                        }
                        if (var86 >= var85) {
                            if (class217.field3516) {
                                class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                            }
                            var80.field4707.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var80.field4708 + var81, var82, var80.field4703 + var83, var80.field4717, var5, (class47) null);
                        } else if (var80.field4700 != null) {
                            if (class217.field3516) {
                                class24.method198(class27.field460, class3.field54, class239.field3916, var5, var3, var4);
                            }
                            var80.field4700.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var81, var82, var83, var80.field4717, var5, (class47) null);
                        }
                    }
                }
                class294 var87 = var2.field573;
                if (var87 != null) {
                    if ((var87.field5025 & var2.field571) != 0 && !class227.method1557(var6, var3, var4, var87.field5025)) {
                        if (class217.field3516) {
                            class24.method209(var87.field5025, class27.field460, class3.field54, class239.field3916, var6, var3, var4);
                        }
                        var87.field5028.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var87.field5024 - class27.field460, var87.field5020 - class3.field54, var87.field5027 - class239.field3916, var87.field5019, var5, (class47) null);
                    }
                    if ((var87.field5029 & var2.field571) != 0 && !class227.method1557(var6, var3, var4, var87.field5029)) {
                        if (class217.field3516) {
                            class24.method209(var87.field5029, class27.field460, class3.field54, class239.field3916, var6, var3, var4);
                        }
                        var87.field5026.method21(0, class74.field1075, class25.field430, class184.field2924, class219.field3559, var87.field5024 - class27.field460, var87.field5020 - class3.field54, var87.field5027 - class239.field3916, var87.field5019, var5, (class47) null);
                    }
                }
            }
            if (var5 < class17.field248 - 1) {
                class34 var88 = class287.field4857[var5 + 1][var3][var4];
                if (var88 != null && var88.field557) {
                    class183.field2919.method1214(false, var88);
                }
            }
            if (var3 < class84.field1162) {
                class34 var89 = var7[var3 + 1][var4];
                if (var89 != null && var89.field557) {
                    class183.field2919.method1214(false, var89);
                }
            }
            if (var4 < class202.field3259) {
                class34 var90 = var7[var3][var4 + 1];
                if (var90 != null && var90.field557) {
                    class183.field2919.method1214(false, var90);
                }
            }
            if (var3 > class84.field1162) {
                class34 var91 = var7[var3 - 1][var4];
                if (var91 != null && var91.field557) {
                    class183.field2919.method1214(false, var91);
                }
            }
            if (var4 > class202.field3259) {
                class34 var92 = var7[var3][var4 - 1];
                if (var92 != null && var92.field557) {
                    class183.field2919.method1214(false, var92);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)V", line = 1034)
    public static final void method1319(int arg0) {
        field3191++;
        if (class312.method2173((byte) 109) != 2) {
            return;
        }
        int var1 = class252.field4338 % 104;
        byte var2 = (byte) (class252.field4338 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class122.field1720[var3][var1][var4] = var2;
            }
        }
        if (class23.field400 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class295.field5042[var5] = -1000000;
            class23.field405[var5] = 1000000;
            class307.field5275[var5] = 0;
            class224.field3642[var5] = 1000000;
            class127.field1919[var5] = 0;
        }
        if (class28.field485 != arg0) {
            int var16 = class154.method1031(arg0 ^ 0x69, class224.field3639, class23.field400, class80.field1129);
            if (var16 - class27.field470 < 800 && (class70.field1026[class23.field400][class224.field3639 >> 7][class80.field1129 >> 7] & 0x4) != 0) {
                class17.method112(class287.field4857, 1, false, (byte) -122, class224.field3639 >> 7, class80.field1129 >> 7);
            }
            return;
        }
        if ((class70.field1026[class23.field400][class85.field1176.field4162 >> 7][class85.field1176.field4231 >> 7] & 0x4) != 0) {
            class17.method112(class287.field4857, 0, false, (byte) -100, class85.field1176.field4162 >> 7, class85.field1176.field4231 >> 7);
        }
        if (class223.field3634 >= 310) {
            return;
        }
        int var6 = class80.field1129 >> 7;
        int var7 = class85.field1176.field4162 >> 7;
        int var8 = class85.field1176.field4231 >> 7;
        int var9;
        if (var8 > var6) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10 = class224.field3639 >> 7;
        int var11;
        if (var10 < var7) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var9 >= var11) {
            int var14 = var11 * 65536 / var9;
            int var15 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var8 < var6) {
                    var6--;
                }
                if ((class70.field1026[class23.field400][var10][var6] & 0x4) != 0) {
                    class17.method112(class287.field4857, 1, false, (byte) -116, var10, var6);
                    break;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var7 > var10) {
                        var10++;
                    } else if (var7 < var10) {
                        var10--;
                    }
                    var15 -= 65536;
                    if ((class70.field1026[class23.field400][var10][var6] & 0x4) != 0) {
                        class17.method112(class287.field4857, 1, false, (byte) -117, var10, var6);
                        break;
                    }
                }
            }
            return;
        }
        int var12 = var9 * 65536 / var11;
        int var13 = 32768;
        while (var7 != var10) {
            if (var7 > var10) {
                var10++;
            } else if (var7 < var10) {
                var10--;
            }
            if ((class70.field1026[class23.field400][var10][var6] & 0x4) != 0) {
                class17.method112(class287.field4857, 1, false, (byte) -117, var10, var6);
                break;
            }
            var13 += var12;
            if (var13 >= 65536) {
                var13 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class70.field1026[class23.field400][var10][var6] & 0x4) != 0) {
                    class17.method112(class287.field4857, 1, false, (byte) -128, var10, var6);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZILah;Lu;)Z", line = 1218)
    public final boolean method1320(boolean arg0, int arg1, class205 arg2, class255 arg3) {
        field3197++;
        if (!this.field3200.method1350(arg3, arg2, (byte) 48)) {
            return false;
        }
        int var5 = arg0 ? 64 : 128;
        GL var6 = class217.field3551;
        int var7 = class252.method1739(22566);
        if ((var7 & 0x1) == 0) {
            if (this.field3178 == -1) {
                int[] var8 = new int[1];
                var6.glGenTextures(1, var8, 0);
                this.field3178 = var8[0];
                this.field3196 = class207.field3383;
                class217.method1457(this.field3178);
                ByteBuffer var9 = ByteBuffer.wrap(this.field3200.method1351(var5, arg2, arg3, (byte) -104, 0.7D, this.field3190, var5));
                if (this.field3194 == 2) {
                    GLU var11 = new GLU();
                    var11.gluBuild2DMipmaps(3553, 6408, var5, var5, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9987);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class207.field3385 += var9.limit() * 4 / 3 - this.field3199;
                    this.field3199 = var9.limit() * 4 / 3;
                } else if (this.field3194 == 1) {
                    int var10 = 0;
                    while (true) {
                        var6.glTexImage2D(3553, var10++, 6408, var5, var5, 0, 6408, 5121, var9);
                        var5 >>= 0x1;
                        if (var5 == 0) {
                            var6.glTexParameteri(3553, 10241, 9987);
                            var6.glTexParameteri(3553, 10240, 9729);
                            class207.field3385 += var9.limit() * 4 / 3 - this.field3199;
                            this.field3199 = var9.limit() * 4 / 3;
                            break;
                        }
                        var9 = ByteBuffer.wrap(this.field3200.method1351(var5, arg2, arg3, (byte) -85, 0.7D, this.field3190, var5));
                    }
                } else {
                    var6.glTexImage2D(3553, 0, 6408, var5, var5, 0, 6408, 5121, var9);
                    var6.glTexParameteri(3553, 10241, 9729);
                    var6.glTexParameteri(3553, 10240, 9729);
                    class207.field3385 += var9.limit() - this.field3199;
                    this.field3199 = var9.limit();
                }
                var6.glTexParameteri(3553, 10242, this.field3204 ? 10497 : 33071);
                var6.glTexParameteri(3553, 10243, this.field3187 ? 10497 : 33071);
            } else {
                class217.method1457(this.field3178);
            }
        }
        if ((var7 & 0x2) == 0) {
            class217.method1454(this.field3183);
        }
        if ((var7 & 0x4) == 0) {
            class217.method1475(0);
        }
        if ((var7 & 0x8) == 0) {
            if (this.field3188 == 0 && this.field3186 == 0) {
                class217.method1458();
            } else {
                float var12 = (float) (class217.field3521 * this.field3186) / (float) var5;
                float var13 = (float) (class217.field3521 * this.field3188) / (float) var5;
                class217.method1467(var12, var13, 0.0F);
            }
        }
        if (arg1 != 12657) {
            method1316(-32);
        }
        return true;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZZ)V", line = 1327)
    public static final void method1321(boolean arg0, boolean arg1) {
        class248.method1699(class253.field4387, -1, arg1, class172.field2757, class227.field3709);
        field3189++;
        if (arg0) {
            field3193 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V", line = 1343)
    public static void method1322(int arg0) {
        field3180 = null;
        field3198 = null;
        field3193 = null;
        int var1 = 29 / ((-arg0 - 79) / 38);
        field3182 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 1361)
    public final void method1323(int arg0, int arg1) {
        field3202++;
        if (this.field3185 == null) {
            return;
        }
        if (this.field3188 != 0 || this.field3186 != 0) {
            if (class236.field3865 == null || this.field3185.length > class236.field3865.length) {
                class236.field3865 = new int[this.field3185.length];
            }
            int var3 = this.field3185.length;
            int var4 = this.field3185.length == 4096 ? 64 : 128;
            int var5 = this.field3186 * arg0;
            int var6 = var4 - 1;
            int var7 = this.field3188 * var4 * arg0;
            int var8 = var3 - 1;
            for (int var9 = 0; var9 < var3; var9 += var4) {
                int var10 = var8 & var7 + var9;
                for (int var11 = 0; var11 < var4; var11++) {
                    int var12 = var9 + var11;
                    int var13 = (var5 + var11 & var6) + var10;
                    class236.field3865[var12] = this.field3185[var13];
                }
            }
            int[] var14 = this.field3185;
            this.field3185 = class236.field3865;
            class236.field3865 = var14;
        }
        if (arg1 != 104) {
            this.field3188 = -73;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lah;ZFILu;)[I", line = 1424)
    public final int[] method1324(class205 arg0, boolean arg1, float arg2, int arg3, class255 arg4) {
        field3179++;
        if (arg3 >= -75) {
            method1316(3);
        }
        if (this.field3185 == null || this.field3176 != arg2) {
            if (!this.field3200.method1350(arg4, arg0, (byte) 113)) {
                return null;
            }
            int var6 = arg1 ? 64 : 128;
            this.field3185 = this.field3200.method1352(arg0, var6, (byte) -11, arg4, this.field3190, var6, (double) arg2, true);
            this.field3176 = arg2;
            if (this.field3184) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var12 = var6;
                int var13 = var6 - 1;
                int var14;
                int var15 = var14 = var6;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var19 = var13; var19 >= 0; var19--) {
                        var14--;
                        int var20 = this.field3185[var14];
                        var7[var19] += class34.method251(16763859, var20) >> 16;
                        var8[var19] += class34.method251(255, var20 >> 8);
                        var9[var19] += class34.method251(var20, 255);
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                int var21 = var17;
                for (int var22 = var16; var22 >= 0; var22--) {
                    int var23 = 1;
                    int var24 = 1;
                    int var25 = 0;
                    int var26 = 0;
                    int var27 = 0;
                    for (int var28 = 2; var28 >= 0; var28--) {
                        var24--;
                        var26 += var9[var24];
                        var27 += var7[var24];
                        var25 += var8[var24];
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var29 = var13; var29 >= 0; var29--) {
                        var24--;
                        int var30 = var26 / 9;
                        int var31 = var27 / 9;
                        int var32 = var25 / 9;
                        var21--;
                        var10[var21] = class72.method493(class72.method493(var32 << 8, var31 << 16), var30);
                        var23--;
                        var27 += var7[var24] - var7[var23];
                        var26 += var9[var24] - var9[var23];
                        var25 += var8[var24] - var8[var23];
                        if (var23 == 0) {
                            var23 = var12;
                        }
                        if (var24 == 0) {
                            var24 = var12;
                        }
                    }
                    for (int var33 = var13; var33 >= 0; var33--) {
                        var14--;
                        int var34 = this.field3185[var14];
                        var15--;
                        int var35 = this.field3185[var15];
                        var7[var33] += -(class34.method251(var35, 16711968) >> 16) + class34.method251(var34 >> 16, 255);
                        var8[var33] += -class34.method251(255, var35 >> 8) + class34.method251(var34 >> 8, 255);
                        var9[var33] += -class34.method251(var35, 255) + class34.method251(255, var34);
                    }
                    if (var15 == 0) {
                        var15 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field3185 = var10;
            }
        }
        return this.field3185;
    }

    @OriginalMember(owner = "client!fh", name = "finalize", descriptor = "()V", line = 1589)
    protected final void finalize() throws Throwable {
        field3201++;
        if (this.field3178 != -1) {
            class207.method1399(this.field3178, this.field3199, this.field3196);
            this.field3199 = 0;
            this.field3178 = -1;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BLu;Lah;)Z", line = 1609)
    public final boolean method1325(byte arg0, class255 arg1, class205 arg2) {
        field3181++;
        if (arg0 != -119) {
            this.field3204 = false;
        }
        return this.field3200.method1350(arg1, arg2, (byte) 62);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lhi;)V", line = 1662)
    public class198(class291 arg0) {
        this.field3200 = new class204(arg0);
        this.field3184 = arg0.method2011(-52) == 1;
        this.field3190 = arg0.method2011(-102) == 1;
        this.field3204 = arg0.method2011(-27) == 1;
        this.field3187 = arg0.method2011(-124) == 1;
        int var2 = arg0.method2011(-125) & 0x3;
        this.field3186 = arg0.method1962(false);
        this.field3188 = arg0.method1962(false);
        int var3 = arg0.method2011(-115);
        arg0.method2011(-100);
        this.field3194 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field3183 = 2;
        } else if (var2 == 2) {
            this.field3183 = 3;
        } else if (var2 == 3) {
            this.field3183 = 4;
        } else {
            this.field3183 = 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BB)I", line = 1635)
    public static final int method1326(byte arg0, byte arg1) {
        if (arg1 > -30) {
            field3198 = (class152) null;
        }
        field3203++;
        return arg0 & 0xFF;
    }
}
