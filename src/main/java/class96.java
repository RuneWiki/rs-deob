import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class96 extends class317 {

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    private final int field1756;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    private final int field1747;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private final int field1748;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "I")
    private final int field1754;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Lli;")
    public static class18 field1750 = new class18();

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lbd;")
    public static class162 field1755 = class17.method142(0, "T");

    @OriginalMember(owner = "client!db", name = "D", descriptor = "[[Lpd;")
    public static class160[][] field1758 = new class160[13][13];

    @OriginalMember(owner = "client!db", name = "E", descriptor = "Lbd;")
    public static class162 field1759 = class17.method142(0, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lqb;")
    public static class209 field1753 = new class209(260);

    @OriginalMember(owner = "client!db", name = "u", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V", line = 9)
    public final void method421(int arg0, int arg1, int arg2) {
        int var4 = this.field1747 * arg1 >> 12;
        if (arg0 != 0) {
            this.method424(-51, 68, -29);
        }
        field1751++;
        int var5 = this.field1756 * arg1 >> 12;
        int var6 = this.field1748 * arg2 >> 12;
        int var7 = this.field1754 * arg2 >> 12;
        class275.method1869(var6, this.field5347, var5, var4, var7, arg0 ^ 0x64, this.field5345, this.field5343);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)V", line = 31)
    public final void method424(int arg0, int arg1, int arg2) {
        field1749++;
        int var4 = this.field1747 * arg1 >> 12;
        int var5 = this.field1756 * arg1 >> 12;
        int var6 = this.field1748 * arg0 >> 12;
        if (arg2 == 50) {
            int var7 = this.field1754 * arg0 >> 12;
            class46.method333(var7, (byte) 111, this.field5347, var5, var6, var4);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(III)V", line = 51)
    public final void method422(int arg0, int arg1, int arg2) {
        field1752++;
        if (arg2 != 4) {
            field1758 = (class160[][]) ((class160[][]) null);
        }
        int var4 = this.field1756 * arg0 >> 12;
        int var5 = this.field1747 * arg0 >> 12;
        int var6 = this.field1754 * arg1 >> 12;
        int var7 = this.field1748 * arg1 >> 12;
        class30.method250(this.field5343, (byte) 70, var6, this.field5345, var5, var7, var4);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V", line = 68)
    public class96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1756 = arg0;
        this.field1747 = arg2;
        this.field1748 = arg1;
        this.field1754 = arg3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 80)
    public static void method774(int arg0) {
        field1750 = null;
        field1753 = null;
        field1759 = null;
        field1755 = null;
        field1758 = (class160[][]) null;
        int var1 = 68 % ((-arg0 - 10) / 47);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 98)
    public static final void method775(boolean arg0) {
        field1760++;
        if ((class149.field2689 < class267.field4447)) {
            class149.field2689 = (float) ((double) class149.field2689 / 30.0D + (double) class149.field2689);
            if (class149.field2689 > class267.field4447) {
                class149.field2689 = class267.field4447;
            }
            class273.method1853(86);
        } else if (class267.field4447 < class149.field2689) {
            class149.field2689 = (float) ((double) class149.field2689 - (double) class149.field2689 / 30.0D);
            if (class149.field2689 < class267.field4447) {
                class149.field2689 = class267.field4447;
            }
            class273.method1853(115);
        }
        if (class86.field1527 != -1 && class59.field922 != -1) {
            int var1 = class86.field1527 - class136.field2420;
            int var2 = class59.field922 - class278.field4682;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class278.field4682 += var2;
            if (var1 == 0 && var2 == 0) {
                class86.field1527 = -1;
                class59.field922 = -1;
            }
            class136.field2420 += var1;
            class273.method1853(71);
        }
        if (!arg0) {
            field1755 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[[[BIBII)V", line = 154)
    public static final void method776(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class142.field2519++;
        class119.field2165 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class258.field4303; var12 < class53.field850; var12++) {
            class225[][] var13 = class288.field4856[var12];
            for (int var14 = class177.field3037; var14 < class157.field2770; var14++) {
                for (int var15 = class196.field3348; var15 < class135.field2405; var15++) {
                    class225 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class89.field1582[var14 + class138.field2456 - field1757][var15 + class138.field2456 - class29.field496] && (arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5)) {
                            var16.field3760 = true;
                            var16.field3772 = true;
                            if (var16.field3756 > 0) {
                                var16.field3762 = true;
                            } else {
                                var16.field3762 = false;
                            }
                            class119.field2165++;
                        } else {
                            var16.field3760 = false;
                            var16.field3772 = false;
                            var16.field3752 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field3753 != null) {
                                    class273 var17 = var16.field3753;
                                    var17.field4527.method1763(var17.field4533, var17.field4535, var17.field4535, (byte) -5, var17.field4533);
                                    if (var17.field4534 != null) {
                                        var17.field4534.method1763(var17.field4533, var17.field4535, var17.field4535, (byte) -5, var17.field4533);
                                    }
                                }
                                if (var16.field3775 != null) {
                                    class138 var18 = var16.field3775;
                                    var18.field2459.method1763(var18.field2464, var18.field2469, var18.field2469, (byte) -5, var18.field2464);
                                    if (var18.field2468 != null) {
                                        var18.field2468.method1763(var18.field2464, var18.field2469, var18.field2469, (byte) -5, var18.field2464);
                                    }
                                }
                                if (var16.field3763 != null) {
                                    class147 var19 = var16.field3763;
                                    var19.field2659.method1763(var19.field2661, var19.field2665, var19.field2665, (byte) -5, var19.field2661);
                                }
                                if (var16.field3765 != null) {
                                    for (int var20 = 0; var20 < var16.field3756; var20++) {
                                        class43 var21 = var16.field3765[var20];
                                        var21.field712.method1763(var21.field699, var21.field711, var21.field707, (byte) -5, var21.field701);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class31.field517 == class206.field3473;
        if (class117.field2159) {
            GL var23 = class117.field2143;
            var23.glPushMatrix();
            var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
            if (var22) {
                class70.method506();
                class116.method913(true, -1, 3);
                class43.field720 = true;
                class152.method1188();
                class134.field2393 = -1;
                class258.field4298 = -1;
                for (int var24 = 0; var24 < class123.field2219[0].length; var24++) {
                    class26 var25 = class123.field2219[0][var24];
                    float var26 = 251.5F - (var25.field421 ? 1.0F : 0.5F);
                    if (class134.field2393 != var25.field435) {
                        class134.field2393 = var25.field435;
                        class200.method1500(-23479, var25.field435);
                        class108.method873(class186.method1403((byte) -37));
                    }
                    var25.method207(class288.field4856, var26, false);
                }
                class152.method1189();
            } else {
                int var27 = class258.field4303;
                while (true) {
                    if (var27 >= class53.field850) {
                        class221.method1597(field1757, class29.field496, class288.field4856);
                        break;
                    }
                    for (int var28 = 0; var28 < class123.field2219[var27].length; var28++) {
                        class26 var29 = class123.field2219[var27][var28];
                        float var30 = 201.5F - (float) var27 * 50.0F - (var29.field421 ? 1.0F : 0.5F);
                        if (var29.field433 != -1 && class312.field5271.method158(255, var29.field433) == 4 && class27.field458) {
                            class200.method1500(-23479, var29.field435);
                        }
                        var29.method207(class288.field4856, var30, false);
                    }
                    if (var27 == 0 && class291.field4906 > 0) {
                        class117.method969(101.5F);
                        class287.method1978(field1757, class29.field496, class138.field2456, arg1, class89.field1582, class206.field3473[0]);
                    }
                    var27++;
                }
            }
            var23.glPopMatrix();
        }
        for (int var31 = class258.field4303; var31 < class53.field850; var31++) {
            class225[][] var32 = class288.field4856[var31];
            for (int var33 = -class138.field2456; var33 <= 0; var33++) {
                int var34 = field1757 + var33;
                int var35 = field1757 - var33;
                if (var34 >= class177.field3037 || var35 < class157.field2770) {
                    for (int var36 = -class138.field2456; var36 <= 0; var36++) {
                        int var37 = class29.field496 + var36;
                        int var38 = class29.field496 - var36;
                        if (var34 >= class177.field3037) {
                            if (var37 >= class196.field3348) {
                                class225 var39 = var32[var34][var37];
                                if (var39 != null && var39.field3760) {
                                    class167.method1308(var39, true);
                                }
                            }
                            if (var38 < class135.field2405) {
                                class225 var40 = var32[var34][var38];
                                if (var40 != null && var40.field3760) {
                                    class167.method1308(var40, true);
                                }
                            }
                        }
                        if (var35 < class157.field2770) {
                            if (var37 >= class196.field3348) {
                                class225 var41 = var32[var35][var37];
                                if (var41 != null && var41.field3760) {
                                    class167.method1308(var41, true);
                                }
                            }
                            if (var38 < class135.field2405) {
                                class225 var42 = var32[var35][var38];
                                if (var42 != null && var42.field3760) {
                                    class167.method1308(var42, true);
                                }
                            }
                        }
                        if (class119.field2165 == 0) {
                            if (!var22) {
                                class302.field5073 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class258.field4303; var43 < class53.field850; var43++) {
            class225[][] var44 = class288.field4856[var43];
            for (int var45 = -class138.field2456; var45 <= 0; var45++) {
                int var46 = field1757 + var45;
                int var47 = field1757 - var45;
                if (var46 >= class177.field3037 || var47 < class157.field2770) {
                    for (int var48 = -class138.field2456; var48 <= 0; var48++) {
                        int var49 = class29.field496 + var48;
                        int var50 = class29.field496 - var48;
                        if (var46 >= class177.field3037) {
                            if (var49 >= class196.field3348) {
                                class225 var51 = var44[var46][var49];
                                if (var51 != null && var51.field3760) {
                                    class167.method1308(var51, false);
                                }
                            }
                            if (var50 < class135.field2405) {
                                class225 var52 = var44[var46][var50];
                                if (var52 != null && var52.field3760) {
                                    class167.method1308(var52, false);
                                }
                            }
                        }
                        if (var47 < class157.field2770) {
                            if (var49 >= class196.field3348) {
                                class225 var53 = var44[var47][var49];
                                if (var53 != null && var53.field3760) {
                                    class167.method1308(var53, false);
                                }
                            }
                            if (var50 < class135.field2405) {
                                class225 var54 = var44[var47][var50];
                                if (var54 != null && var54.field3760) {
                                    class167.method1308(var54, false);
                                }
                            }
                        }
                        if (class119.field2165 == 0) {
                            if (!var22) {
                                class302.field5073 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class302.field5073 = false;
    }
}
