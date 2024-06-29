import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class203 {

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "[[I")
    public static int[][] field2789;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lnp;")
    public static class286 field2790;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)V")
    public static void method1317(int arg0) {
        field2790 = null;
        if (arg0 > -110) {
            field2787 = 40;
        }
        field2789 = null;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Luo;I)V")
    public abstract void method678(class345 arg0, int arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILg;)Ljava/lang/String;")
    public static final String method1318(int arg0, class87 arg1) {
        field2788++;
        if (arg0 != 0) {
            method1317(-89);
        }
        return arg1.field1220 == null || arg1.field1220.length() <= 0 ? arg1.field1218 : arg1.field1218 + class21.field387.method2763(121, class210.field2935) + arg1.field1220;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Luq;")
    public static final class91 method1319(boolean arg0) {
        field2782++;
        class91 var1 = (class91) class217.field3007.method1013((byte) -112);
        if (arg0) {
            return null;
        } else if (var1 == null) {
            return new class91();
        } else {
            class218.field3015--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IBIILrr;Luo;Z)V")
    public abstract void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6);

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)Z")
    public abstract boolean method683(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILuo;I)Z")
    public abstract boolean method675(int arg0, int arg1, class345 arg2, int arg3);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLuo;)Laj;")
    public abstract class170 method681(boolean arg0, class345 arg1);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLoo;Z)V")
    public static final void method1320(boolean arg0, class374 arg1, boolean arg2) {
        field2781++;
        class428 var3 = arg1.method2388(5);
        if (arg1.field5344 == 0) {
            class442.field6207 = -1;
            arg1.field5339 = 0;
            class240.field3415 = 0;
            return;
        }
        if (arg1.field5264 != -1 && arg1.field5251 == 0) {
            class411 var4 = class108.method761((byte) -82, arg1.field5264);
            if (arg1.field5328 > 0 && var4.field5820 == 0) {
                class442.field6207 = -1;
                class240.field3415 = 0;
                arg1.field5339++;
                return;
            }
            if (arg1.field5328 <= 0 && var4.field5817 == 0) {
                class240.field3415 = 0;
                arg1.field5339++;
                class442.field6207 = -1;
                return;
            }
        }
        if (arg1.field5300 != -1 && arg1.field5320 <= class276.field3837) {
            class80 var5 = class393.method2484(arg1.field5300, 85);
            if (var5.field1144 && var5.field1125 != -1) {
                class411 var6 = class108.method761((byte) -82, var5.field1125);
                if (arg1.field5328 > 0 && var6.field5820 == 0) {
                    class442.field6207 = -1;
                    class240.field3415 = 0;
                    arg1.field5339++;
                    return;
                }
                if (arg1.field5328 <= 0 && var6.field5817 == 0) {
                    arg1.field5339++;
                    class442.field6207 = -1;
                    class240.field3415 = 0;
                    return;
                }
            }
        }
        int var7 = arg1.field6262;
        int var8 = arg1.field6266;
        int var9 = arg1.field5326[arg1.field5344 - 1] * 128 + arg1.method942(false) * 64;
        int var10 = arg1.field5332[arg1.field5344 - 1] * 128 + arg1.method942(false) * 64;
        if (!arg0 && (var9 - var7) > 256 || var9 - var7 < -256 || (var10 - var8) > 256 || (var10 - var8) < -256) {
            arg1.field6266 = var10;
            class240.field3415 = 0;
            class442.field6207 = -1;
            arg1.field6262 = var9;
            return;
        }
        if (var7 >= var9) {
            if (var7 <= var9) {
                if (var10 > var8) {
                    arg1.method2385(15141, 8192);
                } else if (var10 < var8) {
                    arg1.method2385(15141, 0);
                }
            } else if (var8 < var10) {
                arg1.method2385(15141, 6144);
            } else if (var10 >= var8) {
                arg1.method2385(15141, 4096);
            } else {
                arg1.method2385(15141, 2048);
            }
        } else if (var10 > var8) {
            arg1.method2385(15141, 10240);
        } else if (var10 >= var8) {
            arg1.method2385(15141, 12288);
        } else {
            arg1.method2385(15141, 14336);
        }
        int var11 = 4;
        boolean var12 = arg2;
        if (arg1 instanceof class198) {
            var12 = ((class198) arg1).field2737.field4480;
        }
        if (var12) {
            int var13 = arg1.field5301 - arg1.field5269.field1207;
            if (var13 != 0 && arg1.field5275 == -1 && arg1.field5313 != 0) {
                var11 = 2;
            }
            if (!arg0 && arg1.field5344 > 2) {
                var11 = 6;
            }
            if (!arg0 && arg1.field5344 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg0 && arg1.field5344 > 1) {
                var11 = 6;
            }
            if (!arg0 && arg1.field5344 > 2) {
                var11 = 8;
            }
        }
        if (arg1.field5339 > 0 && arg1.field5344 > 1) {
            arg1.field5339--;
            var11 = 8;
        }
        byte var14 = arg1.field5337[arg1.field5344 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        class240.field3415 = 0;
        if (var3.field6034 != -1) {
            int var15 = var11 << 7;
            if (arg1.field5344 == 1) {
                int var16 = arg1.field5338 * arg1.field5338;
                int var17 = (var9 < arg1.field6262 ? arg1.field6262 - var9 : -arg1.field6262 + var9) << 7;
                int var18 = (var10 < arg1.field6266 ? arg1.field6266 - var10 : -arg1.field6266 + var10) << 7;
                int var19 = var17 > var18 ? var17 : var18;
                int var20 = var3.field6034 * var19 * 2;
                if (var16 > var20) {
                    arg1.field5338 /= 2;
                } else if (var19 < var16 / 2) {
                    arg1.field5338 -= var3.field6034;
                    if (arg1.field5338 < 0) {
                        arg1.field5338 = 0;
                    }
                } else if (var15 > arg1.field5338) {
                    arg1.field5338 += var3.field6034;
                    if (arg1.field5338 > var15) {
                        arg1.field5338 = var15;
                    }
                }
            } else if (arg1.field5338 < var15) {
                arg1.field5338 += var3.field6034;
                if (var15 < arg1.field5338) {
                    arg1.field5338 = var15;
                }
            } else if (arg1.field5338 > 0) {
                arg1.field5338 -= var3.field6034;
                if (arg1.field5338 < 0) {
                    arg1.field5338 = 0;
                }
            }
            var11 = arg1.field5338 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var9 > var7) {
            class240.field3415 |= 0x4;
            arg1.field6262 += var11;
            if (var9 < arg1.field6262) {
                arg1.field6262 = var9;
            }
        } else if (var7 > var9) {
            class240.field3415 |= 0x8;
            arg1.field6262 -= var11;
            if (var9 > arg1.field6262) {
                arg1.field6262 = var9;
            }
        }
        if (var8 < var10) {
            class240.field3415 |= 0x1;
            arg1.field6266 += var11;
            if (arg1.field6266 > var10) {
                arg1.field6266 = var10;
            }
        } else if (var10 < var8) {
            class240.field3415 |= 0x2;
            arg1.field6266 -= var11;
            if (arg1.field6266 < var10) {
                arg1.field6266 = var10;
            }
        }
        if (arg1.field6262 == var9 && arg1.field6266 == var10) {
            if (arg1.field5328 > 0) {
                arg1.field5328--;
            }
            arg1.field5344--;
        }
        if (var11 >= 8) {
            class442.field6207 = 2;
        } else {
            class442.field6207 = var14;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
    public abstract void method674(byte arg0);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[[[BIBII)V")
    public static final void method1321(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class328.field4548++;
        class30.field490 = 0;
        for (int var6 = class405.field5769; var6 < class392.field5617; var6++) {
            class125[][] var17 = class328.field4549[var6];
            for (int var18 = class237.field3368; var18 < class77.field1107; var18++) {
                for (int var19 = class255.field3586; var19 < class375.field5351; var19++) {
                    class125 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class194.field2654[var18 + class305.field4213 - class357.field4890][var19 + class305.field4213 - class405.field5768] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field1759 = true;
                            var20.field1754 = true;
                            if (var20.field1749 == null) {
                                var20.field1732 = false;
                            } else {
                                var20.field1732 = true;
                            }
                            class30.field490++;
                        } else {
                            var20.field1759 = false;
                            var20.field1754 = false;
                            var20.field1733 = 0;
                            if (var18 >= class357.field4890 - 16 && var18 <= class357.field4890 + 16 && var19 >= class405.field5768 - 16 && var19 <= class405.field5768 + 16 && (var20.field1756 != null || var20.field1761 != null || var20.field1740 != null || var20.field1750 != null || var20.field1739 != null || var20.field1749 != null)) {
                                class326.field4453.method2007((byte) -125, var20);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class375.field5354 == class214.field2979;
        for (int var8 = class405.field5769; var8 < class392.field5617; var8++) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class387.field5557.method51() && var8 >= arg2 && arg1 != null) {
                int var10 = class194.field2654.length;
                if (class194.field2654.length + class237.field3368 > class200.field2772) {
                    var10 -= class194.field2654.length + class237.field3368 - class200.field2772;
                }
                int var11 = class194.field2654[0].length;
                if (class194.field2654[0].length + class255.field3586 > class264.field3687) {
                    var11 -= class194.field2654[0].length + class255.field3586 - class264.field3687;
                }
                int var12 = class40.field587;
                while (true) {
                    if (var12 >= var10) {
                        class326.field4453.method2008(var9, var8, class375.field5354[var8], true, 5000);
                        break;
                    }
                    int var13 = class237.field3368 + var12 - class40.field587;
                    for (int var14 = class77.field1104; var14 < var11; var14++) {
                        class34.field528[var12][var14] = false;
                        if (class194.field2654[var12][var14]) {
                            int var15 = class255.field3586 + var14 - class77.field1104;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class328.field4549[var16][var13][var15] != null && class328.field4549[var16][var13][var15].field1737 == var8) {
                                    class34.field528[var12][var14] = class328.field4549[var16][var13][var15].field1759;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class326.field4453.method2008(var9, var8, class375.field5354[var8], false, 5000);
            }
            class326.field4453.method2013(-80);
        }
        if (!class299.method1941(true)) {
            class299.method1941(false);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLnq;)V")
    public static final void method1322(byte arg0, class268 arg1) {
        int var2 = 43 % ((arg0 + 5) / 61);
        field2783++;
        class159.field2229 = arg1;
        class83.field1188 = class159.field2229.method1739(110, 15);
    }

    static {
        new class442("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field2789 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
    }
}
