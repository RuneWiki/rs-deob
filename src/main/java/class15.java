import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class15 {

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lhj;")
    private class202 field281 = new class202();

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lsb;")
    public static class98 field280 = class47.method368("Verbindung mit Update)2Server)3)3)3", 0);

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Lsb;")
    public static class98 field291 = class47.method368(" )2> <col=ff9040>", 0);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lhj;")
    private class202 field284;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[[[B")
    public static byte[][][] field293;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field293 = null;
        int var1 = 119 / ((-arg0 - 39) / 37);
        field291 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
    public final void method119(byte arg0) {
        while (true) {
            class202 var2 = this.field281.field3455;
            if (this.field281 == var2) {
                if (arg0 != 107) {
                    return;
                }
                field282++;
                this.field284 = null;
                return;
            }
            var2.method1368((byte) 3);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLtg;)V")
    public static final void method120(boolean arg0, class75 arg1) {
        class235.field4062 = arg1;
        if (!arg0) {
            method124((class42) null, 119, -73, 72, 47, -31, 89, true);
        }
        field287++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lhj;I)V")
    public final void method121(class202 arg0, int arg1) {
        if (arg0.field3449 != null) {
            arg0.method1368((byte) 3);
        }
        arg0.field3455 = this.field281.field3455;
        arg0.field3449 = this.field281;
        if (arg1 != -1677) {
            field293 = null;
        }
        field283++;
        arg0.field3449.field3455 = arg0;
        arg0.field3455.field3449 = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLtg;)Lnj;")
    public static final class82 method122(int arg0, boolean arg1, class75 arg2) {
        if (arg1) {
            method126(-60, 98, 80, -9, 67);
        }
        field290++;
        return class164.method1184(arg0, arg2, (byte) -120) ? class64.method458(!arg1) : null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Lhj;")
    public final class202 method123(boolean arg0) {
        class202 var2 = this.field284;
        field292++;
        if (!arg0) {
            this.field284 = null;
        }
        if (this.field281 == var2) {
            this.field284 = null;
            return null;
        } else {
            this.field284 = var2.field3455;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lcg;IIIIIIZ)V")
    public static final void method124(class42 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field703.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field703[var9] - class120.field2196;
            int var23 = arg0.field685[var9] - class239.field4112;
            int var24 = arg0.field695[var9] - class154.field2810;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field689 != null) {
                class42.field692[var9] = var25;
                class42.field686[var9] = var28;
                class42.field687[var9] = var29;
            }
            class42.field702[var9] = (var25 << 9) / var29 + class160.field2894;
            class42.field683[var9] = (var28 << 9) / var29 + class160.field2889;
        }
        class160.field2892 = 0;
        int var10 = arg0.field688.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field688[var11];
            int var13 = arg0.field690[var11];
            int var14 = arg0.field699[var11];
            int var15 = class42.field702[var12];
            int var16 = class42.field702[var13];
            int var17 = class42.field702[var14];
            int var18 = class42.field683[var12];
            int var19 = class42.field683[var13];
            int var20 = class42.field683[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class235.field4053 && class217.method1498(class160.field2894 + class157.field2856, class71.field1130 + class160.field2889, var18, var19, var20, var15, var16, var17)) {
                    class200.field3435 = arg5;
                    class4.field47 = arg6;
                }
                if (!arg7) {
                    class160.field2900 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class160.field2898 || var16 > class160.field2898 || var17 > class160.field2898) {
                        class160.field2900 = true;
                    }
                    if (arg0.field689 == null || arg0.field689[var11] == -1) {
                        if (arg0.field698[var11] != 12345678) {
                            class160.method1167(var18, var19, var20, var15, var16, var17, arg0.field698[var11], arg0.field691[var11], arg0.field693[var11]);
                        }
                    } else if (!class45.field749) {
                        int var21 = class160.field2897.method139(arg0.field689[var11], false);
                        class160.method1167(var18, var19, var20, var15, var16, var17, class100.method759(var21, arg0.field698[var11]), class100.method759(var21, arg0.field691[var11]), class100.method759(var21, arg0.field693[var11]));
                    } else if (arg0.field697) {
                        class160.method1150(var18, var19, var20, var15, var16, var17, arg0.field698[var11], arg0.field691[var11], arg0.field693[var11], class42.field692[0], class42.field692[1], class42.field692[3], class42.field686[0], class42.field686[1], class42.field686[3], class42.field687[0], class42.field687[1], class42.field687[3], arg0.field689[var11]);
                    } else {
                        class160.method1150(var18, var19, var20, var15, var16, var17, arg0.field698[var11], arg0.field691[var11], arg0.field693[var11], class42.field692[var12], class42.field692[var13], class42.field692[var14], class42.field686[var12], class42.field686[var13], class42.field686[var14], class42.field687[var12], class42.field687[var13], class42.field687[var14], arg0.field689[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBIII)V")
    public static final void method125(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field294++;
        if (class226.field3903 < 100) {
            class114.method852((byte) -125);
        }
        class128.method964(arg0, arg3, arg0 + arg4, arg2 + arg3);
        if (class226.field3903 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg0;
            int var7 = arg3 + (arg2 / 2) + (-18 - var5);
            class128.method967(arg0, arg3, arg4, arg2, 0);
            class128.method963(var6 - 152, var7, 304, 34, 9179409);
            class128.method963(var6 - 151, var7 + 1, 302, 32, 0);
            class128.method967(var6 - 150, var7 + 2, class226.field3903 * 3, 30, 9179409);
            class128.method967(class226.field3903 * 3 + var6 - 150, var7 + 2, 300 - (class226.field3903 * 3), 30, 0);
            class90.field1581.method543(class16.field330, var6, var5 + var7, 16777215, -1);
            return;
        }
        class161.field2915 = class211.field3612 - ((int) ((float) arg4 / class4.field42));
        class252.field4418 = class211.field3613 - ((int) ((float) arg2 / class4.field42));
        class41.field680 = (int) ((float) (arg2 * 2) / class4.field42);
        class194.field3369 = (int) ((float) (arg4 * 2) / class4.field42);
        if (arg1 < 35) {
            field280 = null;
        }
        int var8 = class211.field3612 - (int) ((float) arg4 / class4.field42);
        int var9 = class211.field3613 - ((int) ((float) arg2 / class4.field42));
        int var10 = class211.field3612 + ((int) ((float) arg4 / class4.field42));
        int var11 = class211.field3613 + ((int) ((float) arg2 / class4.field42));
        class115.method866(arg0, var9, arg2 + arg3, var8, var11, arg0 + arg4, var10, (byte) 126, arg3);
        class220.method1522(arg3, var8, arg2 + arg3, var10, var11, (byte) -78, arg0 + arg4, var9, arg0);
        class118.method879(arg0 + arg4, var9, arg3, arg0, 105, var8, arg3 + arg2, var11, var10);
        if (class62.field1036 > 0) {
            class62.field1036--;
        }
        if (!class82.field1447) {
            return;
        }
        int var12 = arg0 + arg4 - 5;
        int var13 = arg2 + arg3 - 8;
        class23.field471.method532(class186.method1288(new class98[] { class99.field1753, class125.method930(25904, class14.field271) }, 31618), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class23.field471.method532(class186.method1288(new class98[] { class230.field3978, class125.method930(25904, var16), class217.field3748 }, 31618), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class120.field2215; var5++) {
            if ((class150.field2762[var5] + class119.field2132[var5]) > arg0 && (arg0 + arg2) > class150.field2762[var5] && class235.field4063[var5] + class11.field222[var5] > arg4 && (arg1 + arg4) > class235.field4063[var5]) {
                class69.field1105[var5] = true;
            }
        }
        field286++;
        if (arg3 >= -84) {
            method127(-5, 62, (class98) null, 95, (class98) null, (class98) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILsb;ILsb;Lsb;)V")
    public static final void method127(int arg0, int arg1, class98 arg2, int arg3, class98 arg4, class98 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class221.field3816[var6] = class221.field3816[var6 - 1];
            class145.field2546[var6] = class145.field2546[var6 - 1];
            class93.field1636[var6] = class93.field1636[var6 - 1];
            class203.field3480[var6] = class203.field3480[var6 - 1];
            class2.field31[var6] = class2.field31[var6 - 1];
        }
        field289++;
        class141.field2494++;
        class54.field866 = class186.field3214;
        class145.field2546[0] = arg5;
        class93.field1636[0] = arg2;
        class203.field3480[arg1] = arg4;
        class221.field3816[0] = arg3;
        class2.field31[0] = arg0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILhj;)V")
    public final void method128(int arg0, class202 arg1) {
        if (arg0 != 16) {
            return;
        }
        if (arg1.field3449 != null) {
            arg1.method1368((byte) 3);
        }
        arg1.field3449 = this.field281.field3449;
        field279++;
        arg1.field3455 = this.field281;
        arg1.field3449.field3455 = arg1;
        arg1.field3455.field3449 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class15() {
        this.field281.field3449 = this.field281;
        this.field281.field3455 = this.field281;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lhj;")
    public final class202 method129(int arg0) {
        field295++;
        if (arg0 != 0) {
            field280 = null;
        }
        class202 var2 = this.field281.field3455;
        if (this.field281 == var2) {
            this.field284 = null;
            return null;
        } else {
            this.field284 = var2.field3455;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lhj;")
    public final class202 method130(int arg0) {
        field288++;
        if (arg0 != 7918) {
            method126(115, 8, 62, -27, 21);
        }
        class202 var2 = this.field281.field3455;
        if (this.field281 == var2) {
            return null;
        } else {
            var2.method1368((byte) 3);
            return var2;
        }
    }
}
