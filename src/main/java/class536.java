import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class536 {

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Lfi;")
    public static class38 field7862 = null;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Lpu;")
    public static class179 field7861 = new class179("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "[I")
    public static int[] field7864 = new int[1000];

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Ldd;ILdd;)V")
    public static final void method3153(class130 arg0, int arg1, class130 arg2) {
        if (arg0.field1936 != null) {
            arg0.method947((byte) 127);
        }
        field7860++;
        arg0.field1934 = arg2;
        if (arg1 >= -20) {
            method3153(null, -94, null);
        }
        arg0.field1936 = arg2.field1936;
        arg0.field1936.field1934 = arg0;
        arg0.field1934.field1936 = arg0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "()V")
    public static final void method3154() {
        class18.field199 = 0;
        label212: for (int var0 = 0; var0 < class259.field4155; var0++) {
            class231 var1 = class155.field2378[var0];
            if (class54.field834 != null) {
                for (int var2 = 0; var2 < class54.field834.length; var2++) {
                    if (class54.field834[var2] != -1000000 && (var1.field3476 <= class54.field834[var2] || var1.field3469 <= class54.field834[var2]) && (var1.field3468 <= class276.field4342[var2] || var1.field3474 <= class276.field4342[var2]) && (var1.field3468 >= class483.field7077[var2] || var1.field3474 >= class483.field7077[var2]) && (var1.field3464 <= class412.field6085[var2] || var1.field3480 <= class412.field6085[var2]) && (var1.field3464 >= class286.field4465[var2] || var1.field3480 >= class286.field4465[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3472 == 1) {
                int var3 = var1.field3467 + class16.field166 - class144.field2126;
                if (var3 >= 0 && var3 <= class16.field166 + class16.field166) {
                    int var4 = var1.field3463 + class16.field166 - class29.field323;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class16.field166 + class16.field166) {
                        continue;
                    }
                    int var5 = var1.field3481 + class16.field166 - class29.field323;
                    if (var5 > class16.field166 + class16.field166) {
                        var5 = class16.field166 + class16.field166;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class390.field5715[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class523.field7679 - var1.field3468;
                        if (var7 > class57.field866) {
                            var1.field3471 = 1;
                        } else {
                            if (var7 >= -class57.field866) {
                                continue;
                            }
                            var1.field3471 = 2;
                            var7 = -var7;
                        }
                        var1.field3465 = (var1.field3464 - class452.field6726 << 8) / var7;
                        var1.field3477 = (var1.field3480 - class452.field6726 << 8) / var7;
                        var1.field3466 = (var1.field3476 - class202.field3117 << 8) / var7;
                        var1.field3479 = (var1.field3469 - class202.field3117 << 8) / var7;
                        class49.field758[class18.field199++] = var1;
                    }
                }
            } else if (var1.field3472 == 2) {
                int var8 = var1.field3463 + class16.field166 - class29.field323;
                if (var8 >= 0 && var8 <= class16.field166 + class16.field166) {
                    int var9 = var1.field3467 + class16.field166 - class144.field2126;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class16.field166 + class16.field166) {
                        continue;
                    }
                    int var10 = var1.field3462 + class16.field166 - class144.field2126;
                    if (var10 > class16.field166 + class16.field166) {
                        var10 = class16.field166 + class16.field166;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class390.field5715[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class452.field6726 - var1.field3464;
                        if (var12 > class57.field866) {
                            var1.field3471 = 3;
                        } else {
                            if (var12 >= -class57.field866) {
                                continue;
                            }
                            var1.field3471 = 4;
                            var12 = -var12;
                        }
                        var1.field3470 = (var1.field3468 - class523.field7679 << 8) / var12;
                        var1.field3473 = (var1.field3474 - class523.field7679 << 8) / var12;
                        var1.field3466 = (var1.field3476 - class202.field3117 << 8) / var12;
                        var1.field3479 = (var1.field3469 - class202.field3117 << 8) / var12;
                        class49.field758[class18.field199++] = var1;
                    }
                }
            } else if (var1.field3472 == 4) {
                int var13 = var1.field3476 - class202.field3117;
                if (var13 > class15.field162) {
                    int var14 = var1.field3463 + class16.field166 - class29.field323;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class16.field166 + class16.field166) {
                        continue;
                    }
                    int var15 = var1.field3481 + class16.field166 - class29.field323;
                    if (var15 > class16.field166 + class16.field166) {
                        var15 = class16.field166 + class16.field166;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3467 + class16.field166 - class144.field2126;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class16.field166 + class16.field166) {
                        continue;
                    }
                    int var17 = var1.field3462 + class16.field166 - class144.field2126;
                    if (var17 > class16.field166 + class16.field166) {
                        var17 = class16.field166 + class16.field166;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class390.field5715[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3471 = 5;
                        var1.field3470 = (var1.field3468 - class523.field7679 << 8) / var13;
                        var1.field3473 = (var1.field3474 - class523.field7679 << 8) / var13;
                        var1.field3465 = (var1.field3464 - class452.field6726 << 8) / var13;
                        var1.field3477 = (var1.field3480 - class452.field6726 << 8) / var13;
                        class49.field758[class18.field199++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static void method3155(byte arg0) {
        field7864 = null;
        if (arg0 == -16) {
            field7862 = null;
            field7861 = null;
        }
    }
}
