import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class718 extends class24 {

    @OriginalMember(owner = "client!bw", name = "A", descriptor = "J")
    private long field10017 = -1L;

    @OriginalMember(owner = "client!bw", name = "F", descriptor = "Ljava/lang/String;")
    private String field10021 = null;

    @OriginalMember(owner = "client!bw", name = "z", descriptor = "Z")
    public static boolean field10016 = false;

    @OriginalMember(owner = "client!bw", name = "y", descriptor = "I")
    public static int field10015 = 0;

    @OriginalMember(owner = "client!bw", name = "x", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!bw", name = "B", descriptor = "I")
    public static int field10018;

    @OriginalMember(owner = "client!bw", name = "C", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!bw", name = "E", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!bw", name = "G", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Lvr;")
    public static class147 field10013;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
    public static void method4010(int arg0) {
        field10013 = null;
        if (arg0 != 4) {
            field10013 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        if (arg1.method2398(-1372747256) != 255) {
            arg1.field5459--;
            this.field10017 = arg1.method2366(true);
        }
        field10018++;
        if (arg0 > -56) {
            this.method190(null, 79);
        }
        this.field10021 = arg1.method2383((byte) 89);
        if (class705.field9878) {
            System.out.println("memberhash:" + this.field10017 + " membername:" + this.field10021);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10022++;
        class139 var8 = null;
        if (arg3 != 2899) {
            return;
        }
        for (class139 var9 = (class139) class496.field6853.method2551((byte) -108); var9 != null; var9 = (class139) class496.field6853.method2542(-119)) {
            if (var9.field2018 == arg1 && var9.field2034 == arg6 && var9.field2033 == arg5 && var9.field2029 == arg7) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class139();
            var8.field2018 = arg1;
            var8.field2033 = arg5;
            var8.field2034 = arg6;
            var8.field2029 = arg7;
            if (arg6 >= 0 && arg5 >= 0 && arg6 < class597.field8132 && class628.field8800 > arg5) {
                class719.method4016(var8, arg3 ^ 0xFFFFF98C);
            }
            class496.field6853.method2545(-127, var8);
        }
        var8.field2023 = true;
        var8.field2035 = arg0;
        var8.field2021 = arg4;
        var8.field2024 = arg2;
        var8.field2020 = false;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        if (arg1 != 5) {
            field10015 = 106;
        }
        field10020++;
        arg0.method3426((byte) 116, this.field10017, this.field10021);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZII[[[Ljd;I)Z")
    public static final boolean method4012(int arg0, boolean arg1, int arg2, int arg3, class243[][][] arg4, int arg5) {
        field10014++;
        byte var6 = arg1 ? 1 : (byte) (class320.field4604 & 0xFF);
        if (class625.field8439[class610.field8296][arg5][arg2] == var6) {
            return false;
        } else if ((class66.field931[class610.field8296][arg5][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class206.field2698[var7] = arg5;
            int var35 = var7 + 1;
            class324.field4725[var7] = arg2;
            class625.field8439[class610.field8296][arg5][arg2] = var6;
            if (arg3 < 100) {
                return false;
            }
            while (var35 != var8) {
                int var9 = class206.field2698[var8] & 0xFFFF;
                int var10 = (class206.field2698[var8] & 0xFF5EF4) >> 16;
                int var11 = class206.field2698[var8] >> 24 & 0xFF;
                int var12 = class324.field4725[var8] & 0xFFFF;
                int var13 = (class324.field4725[var8] & 0xFF9514) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class66.field931[class610.field8296][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg4 != null) {
                    label242: for (int var16 = class610.field8296 + 1; var16 <= 3; var16++) {
                        if (arg4[var16] != null && (class66.field931[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg4[var16][var9][var12] != null) {
                                if (arg4[var16][var9][var12].field3270 != null) {
                                    int var17 = class224.method1484(var10, -127);
                                    if (arg4[var16][var9][var12].field3270.field7055 == var17 || arg4[var16][var9][var12].field3269 != null && arg4[var16][var9][var12].field3269.field7055 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class224.method1484(var11, -124);
                                        if (arg4[var16][var9][var12].field3270.field7055 == var18 || arg4[var16][var9][var12].field3269 != null && arg4[var16][var9][var12].field3269.field7055 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class224.method1484(var13, -125);
                                        if (arg4[var16][var9][var12].field3270.field7055 == var19 || arg4[var16][var9][var12].field3269 != null && arg4[var16][var9][var12].field3269.field7055 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class243 var20 = arg4[var16][var9][var12];
                                if (var20.field3272 != null) {
                                    for (class48 var21 = var20.field3272; var21 != null; var21 = var21.field726) {
                                        class319 var22 = var21.field725;
                                        if (var22 instanceof class392) {
                                            class392 var23 = (class392) var22;
                                            int var24 = var23.method18(-10908);
                                            int var25 = var23.method17(-2132);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label242;
                                            }
                                        }
                                    }
                                }
                            }
                            class243 var27 = arg4[var16][var9][var12];
                            if (var27 != null && var27.field3272 != null) {
                                for (class48 var28 = var27.field3272; var28 != null; var28 = var28.field726) {
                                    class319 var29 = var28.field725;
                                    if (var29.field4600 != var29.field4595 || var29.field4590 != var29.field4585) {
                                        for (int var30 = var29.field4600; var30 <= var29.field4595; var30++) {
                                            for (int var31 = var29.field4590; var31 <= var29.field4585; var31++) {
                                                class625.field8439[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class625.field8439[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class528.field7227[class610.field8296 + 1].method1880(var9, false, var12);
                    if (var32 > class778.field10683[arg0]) {
                        class778.field10683[arg0] = var32;
                    }
                    int var33 = var9 << 9;
                    if (class121.field1768[arg0] > var33) {
                        class121.field1768[arg0] = var33;
                    } else if (class364.field5305[arg0] < var33) {
                        class364.field5305[arg0] = var33;
                    }
                    int var34 = var12 << 9;
                    if (class597.field8135[arg0] > var34) {
                        class597.field8135[arg0] = var34;
                    } else if (class5.field53[arg0] < var34) {
                        class5.field53[arg0] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class625.field8439[class610.field8296][var9 - 1][var12] != var6) {
                        class206.field2698[var35] = class213.method1409(class213.method1409(1179648, var9 - 1), -754974720);
                        class324.field4725[var35] = class213.method1409(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class625.field8439[class610.field8296][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class628.field8800;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class625.field8439[class610.field8296][var9 - 1][var12] != var6 && (class66.field931[class610.field8296][var9][var12] & 0x4) == 0 && (class66.field931[class610.field8296][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class206.field2698[var35] = class213.method1409(1375731712, class213.method1409(1179648, var9 - 1));
                            class324.field4725[var35] = class213.method1409(1245184, var12);
                            class625.field8439[class610.field8296][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class625.field8439[class610.field8296][var9][var12] != var6) {
                            class206.field2698[var35] = class213.method1409(318767104, class213.method1409(5373952, var9));
                            class324.field4725[var35] = class213.method1409(var12, 5439488);
                            class625.field8439[class610.field8296][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class597.field8132 > var9 + 1 && class625.field8439[class610.field8296][var9 + 1][var12] != var6 && (class66.field931[class610.field8296][var9][var12] & 0x4) == 0 && (class66.field931[class610.field8296][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class206.field2698[var35] = class213.method1409(class213.method1409(var9 + 1, 5373952), -1845493760);
                            class324.field4725[var35] = class213.method1409(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class625.field8439[class610.field8296][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var9 + 1 < class597.field8132 && class625.field8439[class610.field8296][var9 + 1][var12] != var6) {
                        class206.field2698[var35] = class213.method1409(class213.method1409(var9 + 1, 9568256), 1392508928);
                        class324.field4725[var35] = class213.method1409(9633792, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class625.field8439[class610.field8296][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class625.field8439[class610.field8296][var9 - 1][var12] != var6 && (class66.field931[class610.field8296][var9][var12] & 0x4) == 0 && (class66.field931[class610.field8296][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class206.field2698[var35] = class213.method1409(class213.method1409(var9 - 1, 13762560), 301989888);
                            class324.field4725[var35] = class213.method1409(var12, 13828096);
                            class625.field8439[class610.field8296][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class625.field8439[class610.field8296][var9][var12] != var6) {
                            class206.field2698[var35] = class213.method1409(class213.method1409(13762560, var9), -1828716544);
                            class324.field4725[var35] = class213.method1409(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class625.field8439[class610.field8296][var9][var12] = var6;
                        }
                        if (var9 + 1 < class597.field8132 && class625.field8439[class610.field8296][var9 + 1][var12] != var6 && (class66.field931[class610.field8296][var9][var12] & 0x4) == 0 && (class66.field931[class610.field8296][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class206.field2698[var35] = class213.method1409(-771751936, class213.method1409(var9 + 1, 9568256));
                            class324.field4725[var35] = class213.method1409(var12, 9633792);
                            class625.field8439[class610.field8296][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class778.field10683[arg0] != -1000000) {
                class778.field10683[arg0] += 40;
                class121.field1768[arg0] -= 512;
                class364.field5305[arg0] += 512;
                class5.field53[arg0] += 512;
                class597.field8135[arg0] -= 512;
            }
            return true;
        }
    }
}
