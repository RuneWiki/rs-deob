import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class136 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field2652 = -1;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field2664 = 0;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Z")
    public boolean field2653 = true;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field2667 = -1;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lsg;")
    public static class30 field2660 = class167.method1221((byte) 33, "::fpson");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "Lsg;")
    public static class30 field2651 = class167.method1221((byte) 33, "(U1");

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lsg;")
    private static class30 field2666 = class167.method1221((byte) 33, "scroll:");

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lsg;")
    public static class30 field2654 = field2666;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lsg;")
    public static class30 field2663 = field2666;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lmc;")
    public static class151 field2662;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIB)V")
    public static final void method1021(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 < 117) {
            field2656 = -87;
        }
        field2661++;
        class109 var5 = (class109) class208.field3730.method1168(-3, (long) arg0);
        if (var5 == null) {
            var5 = new class109();
            class208.field3730.method1164((byte) -76, (long) arg0, var5);
        }
        if (arg1 >= var5.field2195.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2195.length; var8++) {
                var6[var8] = var5.field2195[var8];
                var7[var8] = var5.field2199[var8];
            }
            for (int var9 = var5.field2195.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2199 = var7;
            var5.field2195 = var6;
        }
        var5.field2195[arg1] = arg2;
        var5.field2199[arg1] = arg3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method1022(int arg0) {
        if (arg0 > -35) {
            return;
        }
        field2651 = null;
        field2666 = null;
        field2663 = null;
        field2662 = null;
        field2654 = null;
        field2660 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lsg;")
    public static final class30 method1023(int arg0, int arg1) {
        if (arg0 != 6534) {
            return null;
        }
        field2655++;
        class30 var2 = new class30();
        var2.field576 = 0;
        var2.field618 = new byte[arg1];
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([SI[Lsg;)V")
    public static final void method1024(short[] arg0, int arg1, class30[] arg2) {
        field2665++;
        class112.method883(arg2.length - 1, 0, arg1 + 23035, arg0, arg2);
        if (arg1 != -23033) {
            method1021(24, -26, -15, 32, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method1025(int arg0) {
        field2659++;
        if (class201.method1428(arg0 ^ 0xFFFFE8C0) != 2) {
            return;
        }
        byte var1 = (byte) (class116.field2290 - 4 & 0xFF);
        if (arg0 != 28446) {
            method1022(-86);
        }
        int var2 = class116.field2290 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class81.field1747[var3][var2][var16] = var1;
            }
        }
        if (class159.field2998 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class60.field1290[var4] = -1000000;
            class50.field1160[var4] = 1000000;
            class235.field4193[var4] = 0;
            class276.field4813[var4] = 1000000;
            class116.field2282[var4] = 0;
        }
        if (class215.field3931 != 1) {
            int var5 = class31.method303(class207.field3725, class150.field2849, class159.field2998, -4);
            if (var5 - class64.field1419 < 800 && (class272.field4771[class159.field2998][class207.field3725 >> 7][class150.field2849 >> 7] & 0x4) != 0) {
                class186.method1339(true, class207.field3725 >> 7, class150.field2849 >> 7, class71.field1613, false, 1);
                return;
            }
            return;
        }
        if ((class272.field4771[class159.field2998][class247.field4394.field1360 >> 7][class247.field4394.field1336 >> 7] & 0x4) != 0) {
            class186.method1339(true, class247.field4394.field1360 >> 7, class247.field4394.field1336 >> 7, class71.field1613, false, 0);
        }
        if (class276.field4820 >= 310) {
            return;
        }
        int var6 = class150.field2849 >> 7;
        int var7 = class207.field3725 >> 7;
        int var8 = class247.field4394.field1360 >> 7;
        int var9 = class247.field4394.field1336 >> 7;
        int var10;
        if (var7 >= var8) {
            var10 = var7 - var8;
        } else {
            var10 = var8 - var7;
        }
        int var11;
        if (var6 >= var9) {
            var11 = var6 - var9;
        } else {
            var11 = var9 - var6;
        }
        if (var11 < var10) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var7 != var8) {
                if (var8 > var7) {
                    var7++;
                } else if (var7 > var8) {
                    var7--;
                }
                if ((class272.field4771[class159.field2998][var7][var6] & 0x4) != 0) {
                    class186.method1339(true, var7, var6, class71.field1613, false, 1);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    if (var6 < var9) {
                        var6++;
                    } else if (var9 < var6) {
                        var6--;
                    }
                    var13 -= 65536;
                    if ((class272.field4771[class159.field2998][var7][var6] & 0x4) != 0) {
                        class186.method1339(true, var7, var6, class71.field1613, false, 1);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var10 * 65536 / var11;
        int var15 = 32768;
        while (var6 != var9) {
            if (var9 > var6) {
                var6++;
            } else if (var9 < var6) {
                var6--;
            }
            if ((class272.field4771[class159.field2998][var7][var6] & 0x4) != 0) {
                class186.method1339(true, var7, var6, class71.field1613, false, 1);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var7 < var8) {
                    var7++;
                } else if (var7 > var8) {
                    var7--;
                }
                if ((class272.field4771[class159.field2998][var7][var6] & 0x4) != 0) {
                    class186.method1339(true, var7, var6, class71.field1613, false, 1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILaa;Z)V")
    public final void method1026(int arg0, class8 arg1, boolean arg2) {
        while (true) {
            int var4 = arg1.method63((byte) 44);
            if (var4 == 0) {
                if (!arg2) {
                    field2660 = null;
                }
                field2657++;
                return;
            }
            this.method1029(arg0, var4, arg1, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)Lqd;")
    public static final class35 method1027(int arg0, int arg1, int arg2) {
        class195 var3 = class71.field1613[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3522; var4++) {
            class35 var5 = var3.field3540[var4];
            if ((var5.field863 >> 29 & 0x3L) == 2L && var5.field854 == arg1 && var5.field856 == arg2) {
                class104.method838(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1028(int arg0, int arg1, int arg2, long arg3) {
        class195 var5 = class71.field1613[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3532 != null && var5.field3532.field4039 == arg3) {
            return true;
        } else if (var5.field3537 != null && var5.field3537.field2803 == arg3) {
            return true;
        } else if (var5.field3541 != null && var5.field3541.field2087 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3522; var6++) {
                if (var5.field3540[var6].field863 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILaa;B)V")
    private final void method1029(int arg0, int arg1, class8 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field2664 = class193.method1399(arg2.method60(23888), -50);
        } else if (arg1 == 2) {
            this.field2667 = arg2.method63((byte) 55);
        } else if (arg1 == 3) {
            this.field2667 = arg2.method65((byte) 126);
            if (this.field2667 == 65535) {
                this.field2667 = -1;
            }
        } else if (arg1 == 5) {
            this.field2653 = false;
        } else if (arg1 == 7) {
            this.field2652 = class193.method1399(arg2.method60(23888), -50);
        } else if (arg1 == 8) {
            class125.field2444 = arg0;
        } else if (arg1 == 9) {
            arg2.method65((byte) 120);
        } else if (arg1 != 10) {
            if (arg1 == 11) {
                arg2.method63((byte) 70);
            } else if (arg1 != 12) {
                if (arg1 == 13) {
                    arg2.method60(23888);
                } else if (arg1 == 14) {
                    arg2.method63((byte) 90);
                }
            }
        }
        field2658++;
        int var5 = 115 / ((57 - arg3) / 36);
    }
}
