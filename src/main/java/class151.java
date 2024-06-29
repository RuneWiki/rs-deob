import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 {

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Leb;")
    private class31 field3388 = new class31();

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lid;")
    private static class60 field3386 = class11.method72("skill)2", (byte) -86);

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[Lpa;")
    public static class105[] field3381 = new class105[256];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3389 = -1;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lid;")
    public static class60 field3391 = field3386;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "[I")
    public static int[] field3385 = new int[500];

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3394 = 0;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "B")
    public static byte field3395;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[[I")
    public static int[][] field3379;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lbf;BLie;Lie;Lie;)Z")
    public static final boolean method1146(class14 arg0, byte arg1, class61 arg2, class61 arg3, class61 arg4) {
        class23.field567 = arg0;
        class155.field3529 = arg2;
        class140.field3186 = arg3;
        field3382++;
        class75.field1816 = arg4;
        int var5 = 76 % ((28 - arg1) / 58);
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILeb;)V")
    public final void method1147(int arg0, class31 arg1) {
        if (arg1.field735 != null) {
            arg1.method234(70);
        }
        arg1.field720 = this.field3388;
        field3390++;
        if (arg0 != -26819) {
            field3395 = 98;
        }
        arg1.field735 = this.field3388.field735;
        arg1.field735.field720 = arg1;
        arg1.field720.field735 = arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public static final int method1148(int arg0) {
        if (arg0 != -5934) {
            return 80;
        }
        field3383++;
        int var1 = 3;
        if (class63.field1567 < 310) {
            int var2 = class140.field3198 >> 7;
            int var3 = class107.field2640.field854 >> 7;
            int var4 = class128.field2931 >> 7;
            if ((class124.field2869[class46.field1222][var2][var4] & 0x4) != 0) {
                var1 = class46.field1222;
            }
            int var5 = class107.field2640.field828 >> 7;
            int var6;
            if (var2 >= var3) {
                var6 = var2 - var3;
            } else {
                var6 = var3 - var2;
            }
            int var7;
            if (var5 > var4) {
                var7 = var5 - var4;
            } else {
                var7 = var4 - var5;
            }
            if (var7 < var6) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var3) {
                    if (var2 < var3) {
                        var2++;
                    } else if (var3 < var2) {
                        var2--;
                    }
                    if ((class124.field2869[class46.field1222][var2][var4] & 0x4) != 0) {
                        var1 = class46.field1222;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        var9 -= 65536;
                        if (var5 > var4) {
                            var4++;
                        } else if (var4 > var5) {
                            var4--;
                        }
                        if ((class124.field2869[class46.field1222][var2][var4] & 0x4) != 0) {
                            var1 = class46.field1222;
                        }
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var4 != var5) {
                    var11 += var10;
                    if (var4 < var5) {
                        var4++;
                    } else if (var5 < var4) {
                        var4--;
                    }
                    if ((class124.field2869[class46.field1222][var2][var4] & 0x4) != 0) {
                        var1 = class46.field1222;
                    }
                    if (var11 >= 65536) {
                        if (var2 < var3) {
                            var2++;
                        } else if (var2 > var3) {
                            var2--;
                        }
                        if ((class124.field2869[class46.field1222][var2][var4] & 0x4) != 0) {
                            var1 = class46.field1222;
                        }
                        var11 -= 65536;
                    }
                }
            }
        }
        if ((class124.field2869[class46.field1222][class107.field2640.field854 >> 7][class107.field2640.field828 >> 7] & 0x4) != 0) {
            var1 = class46.field1222;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Leb;I)V")
    public final void method1149(class31 arg0, int arg1) {
        if (arg0.field735 != null) {
            arg0.method234(58);
        }
        if (arg1 != 1) {
            field3385 = null;
        }
        arg0.field720 = this.field3388.field720;
        arg0.field735 = this.field3388;
        field3378++;
        arg0.field735.field720 = arg0;
        arg0.field720.field735 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Leb;")
    public final class31 method1150(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3384++;
        class31 var2 = this.field3388.field720;
        if (this.field3388 == var2) {
            return null;
        } else {
            var2.method234(120);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method1151(byte arg0) {
        int var1 = -110 % ((16 - arg0) / 40);
        field3393++;
        for (class12 var2 = (class12) class53.field1340.method496(10153); var2 != null; var2 = (class12) class53.field1340.method500(-1)) {
            if (var2.field220 == -1) {
                var2.field203 = 0;
                class35.method268(var2, 32767);
            } else {
                var2.method1009((byte) 95);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(La;III)V")
    public static final void method1152(class1 arg0, int arg1, int arg2, int arg3) {
        field3380++;
        if ((arg1 & 0x200) != 0) {
            arg0.field839 = class56.field1393.method808(-20054);
            int var4 = class56.field1393.method809(arg2 + 254);
            arg0.field860 = 0;
            arg0.field846 = (var4 & 0xFFFF) + class82.field2065;
            arg0.field830 = var4 >> 16;
            arg0.field850 = 0;
            if (arg0.field846 > class82.field2065) {
                arg0.field850 = -1;
            }
            if (arg0.field839 == 65535) {
                arg0.field839 = -1;
            }
        }
        if ((arg2 & arg1) != 0) {
            arg0.field861 = class56.field1393.method841(arg2 ^ 0x6AC3);
            if (arg0.field861.method418(0, (byte) -98) == 126) {
                arg0.field861 = arg0.field861.method421(1, 0);
                class43.method342(arg0.field21, 2, arg0.field861, 2001);
            } else if (class107.field2640 == arg0) {
                class43.method342(arg0.field21, 2, arg0.field861, arg2 + 2000);
            }
            arg0.field829 = 0;
            arg0.field831 = 150;
            arg0.field833 = 0;
        }
        if ((arg1 & 0x4) != 0) {
            arg0.field887 = class56.field1393.method833((byte) 27);
            arg0.field848 = class56.field1393.method850((byte) -117);
        }
        if ((arg1 & 0x400) != 0) {
            int var5 = class56.field1393.method849(1);
            int var6 = class56.field1393.method823((byte) 118);
            arg0.method269(var6, -5, var5, class82.field2065);
            arg0.field815 = class82.field2065 + 300;
            arg0.field837 = class56.field1393.method849(1);
            arg0.field880 = class56.field1393.method829((byte) 20);
        }
        if ((arg1 & 0x8) != 0) {
            int var7 = class56.field1393.method808(-20054);
            int var8 = class56.field1393.method849(1);
            int var9 = class56.field1393.method849(arg2);
            int var10 = class56.field1393.field2501;
            if (arg0.field21 != null && arg0.field2 != null) {
                long var11 = arg0.field21.method430(arg2 + 109);
                boolean var13 = false;
                if (var8 <= 1) {
                    for (int var14 = 0; var14 < class133.field3044; var14++) {
                        if (class44.field1169[var14] == var11) {
                            var13 = true;
                            break;
                        }
                    }
                }
                if (!var13 && class112.field2696 == 0) {
                    class135.field3062.field2501 = 0;
                    class56.field1393.method813(var9, class135.field3062.field2498, (byte) -115, 0);
                    class135.field3062.field2501 = 0;
                    class60 var15 = class122.method962(class77.method626(class135.field3062, (byte) 124).method444(true));
                    arg0.field861 = var15.method422(0);
                    arg0.field833 = var7 >> 8;
                    arg0.field829 = var7 & 0xFF;
                    arg0.field831 = 150;
                    if (var8 == 2 || var8 == 3) {
                        class43.method342(class104.method853(-114, new class60[] { class4.field75, arg0.field21 }), 1, var15, arg2 ^ 0x7D0);
                    } else if (var8 == 1) {
                        class43.method342(class104.method853(arg2 - 104, new class60[] { class133.field3038, arg0.field21 }), 1, var15, 2001);
                    } else {
                        class43.method342(arg0.field21, 2, var15, 2001);
                    }
                }
            }
            class56.field1393.field2501 = var9 + var10;
        }
        if ((arg1 & 0x2) != 0) {
            int var16 = class56.field1393.method829((byte) 98);
            int var17 = class56.field1393.method823((byte) -35);
            arg0.method269(var17, -5, var16, class82.field2065);
            arg0.field815 = class82.field2065 + 300;
            arg0.field837 = class56.field1393.method831(false);
            arg0.field880 = class56.field1393.method831(false);
        }
        if ((arg1 & 0x20) != 0) {
            int var18 = class56.field1393.method810(-1384376976);
            int var19 = class56.field1393.method849(1);
            if (var18 == 65535) {
                var18 = -1;
            }
            class140.method1088(var18, var19, true, arg0);
        }
        if ((arg1 & 0x100) != 0) {
            arg0.field818 = class56.field1393.method831(false);
            arg0.field835 = class56.field1393.method823((byte) 9);
            arg0.field882 = class56.field1393.method831(false);
            arg0.field819 = class56.field1393.method849(1);
            arg0.field851 = class56.field1393.method850((byte) 122) + class82.field2065;
            arg0.field845 = class56.field1393.method833((byte) 27) + class82.field2065;
            arg0.field862 = class56.field1393.method849(1);
            arg0.field844 = 0;
            arg0.field843 = 1;
        }
        if ((arg1 & 0x40) != 0) {
            arg0.field807 = class56.field1393.method850((byte) 127);
            if (arg0.field807 == 65535) {
                arg0.field807 = -1;
            }
        }
        if ((arg1 & 0x80) == 0) {
            return;
        }
        int var20 = class56.field1393.method823((byte) -49);
        byte[] var21 = new byte[var20];
        class103 var22 = new class103(var21);
        class56.field1393.method822(0, var20, (byte) 121, var21);
        class106.field2618[arg3] = var22;
        arg0.method4(arg2 ^ 0x3, var22);
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V")
    public static final void method1153(boolean arg0) {
        if (!arg0) {
            field3396 = 120;
        }
        field3387++;
        if (class48.field1261 != null) {
            class48.field1261.method729(false);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field3385 = null;
        field3381 = null;
        field3379 = null;
        if (arg0 >= -104) {
            field3396 = 18;
        }
        field3386 = null;
        field3391 = null;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Leb;")
    public final class31 method1155(int arg0) {
        field3377++;
        class31 var2 = this.field3388.field720;
        if (this.field3388 == var2) {
            return null;
        } else {
            int var3 = -107 % ((-arg0 - 67) / 53);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class151() {
        this.field3388.field720 = this.field3388;
        this.field3388.field735 = this.field3388;
    }
}
