import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class40 extends class73 {

    @OriginalMember(owner = "client!we", name = "z", descriptor = "Lli;")
    public class185 field635;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Lli;")
    public static class185 field624 = class245.method1649("Eingabeprozedur geladen)3", 122);

    @OriginalMember(owner = "client!we", name = "p", descriptor = "Lli;")
    public static class185 field625 = class245.method1649(" x ", 122);

    @OriginalMember(owner = "client!we", name = "q", descriptor = "Lli;")
    private static class185 field626 = class245.method1649("Select", -57);

    @OriginalMember(owner = "client!we", name = "w", descriptor = "Lli;")
    public static class185 field632 = field626;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field623 = 0;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "Lli;")
    public static class185 field627 = class245.method1649("V-Brification des mises -9 jour )2 ", 124);

    @OriginalMember(owner = "client!we", name = "s", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[I")
    public static int[] field637;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Lfk;")
    public static final class36 method247(int arg0) {
        if (arg0 != -256) {
            method252(57);
        }
        field639++;
        try {
            return (class36) Class.forName("ff").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(IB)I")
    public static final int method248(int arg0, byte arg1) {
        if (arg1 <= 74) {
            method250((byte) -55);
        }
        field634++;
        return (arg0 & 0x3FDB5) >> 11;
    }

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method249(int arg0) {
        if (arg0 < 119) {
            method248(114, (byte) -83);
        }
        for (int var1 = 0; var1 < class108.field1943; var1++) {
            int var2 = class97.field1811[var1];
            class71 var3 = class87.field1712[var2];
            if (var3 != null) {
                class19.method132(var3.field1236.field1452, var3, -57);
            }
        }
        field638++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
    public static final void method250(byte arg0) {
        field629++;
        if (arg0 < 112) {
            return;
        }
        for (int var1 = 0; var1 < class148.field2789; var1++) {
            int var2 = class80.field1404[var1];
            class188 var3 = class93.field1774[var2];
            int var4 = class142.field2669.method867(false);
            if ((var4 & 0x80) != 0) {
                var4 += class142.field2669.method867(false) << 8;
            }
            class24.method166(23154, var4, var2, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(B)V")
    public static void method251(byte arg0) {
        if (arg0 > -7) {
            method252(-69);
        }
        field625 = null;
        field632 = null;
        field637 = null;
        field627 = null;
        field626 = null;
        field624 = null;
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)Z")
    public static final boolean method252(int arg0) {
        field631++;
        try {
            if (arg0 != -1) {
                method253(121, 9, -29);
            }
            if (class32.field527 == 2) {
                if (class163.field3054 == null) {
                    class163.field3054 = class89.method589(class241.field4303, class248.field4400, class248.field4408);
                    if (class163.field3054 == null) {
                        return false;
                    }
                }
                if (class276.field4894 == null) {
                    class276.field4894 = new class54(class197.field3612, class215.field3949);
                }
                if (class113.field2052.method362(22050, class46.field731, (byte) 35, class163.field3054, class276.field4894)) {
                    class113.field2052.method349(125);
                    class113.field2052.method346((byte) -78, class23.field381);
                    class113.field2052.method351(255, class133.field2381, class163.field3054);
                    class276.field4894 = null;
                    class32.field527 = 0;
                    class241.field4303 = null;
                    class163.field3054 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class113.field2052.method317(21629);
            class241.field4303 = null;
            class163.field3054 = null;
            class276.field4894 = null;
            class32.field527 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public static final void method253(int arg0, int arg1, int arg2) {
        field633++;
        class149.field2824 = class264.field4679 + class125.field2246 - arg2 - 1;
        int var3 = class149.field2824 - ((int) ((float) class234.field4204.field1498 / class274.field4859));
        if (arg0 != -13103) {
            field637 = null;
        }
        int var4 = class149.field2824 + ((int) ((float) class234.field4204.field1498 / class274.field4859));
        class251.field4472 = arg1 - class252.field4481;
        int var5 = class251.field4472 - (int) ((float) class234.field4204.field1505 / class274.field4859);
        if (var3 < 0) {
            class149.field2824 = (int) ((float) class234.field4204.field1498 / class274.field4859);
        }
        if (class125.field2246 < var4) {
            class149.field2824 = class125.field2246 - ((int) ((float) class234.field4204.field1498 / class274.field4859));
        }
        int var6 = (int) ((float) class234.field4204.field1505 / class274.field4859) + class251.field4472;
        if (var5 < 0) {
            class251.field4472 = (int) ((float) class234.field4204.field1505 / class274.field4859);
        }
        if (class56.field971 < var6) {
            class251.field4472 = class56.field971 - ((int) ((float) class234.field4204.field1505 / class274.field4859));
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Lte;")
    public static final class251 method254(int arg0, int arg1, int arg2) {
        class198 var3 = class153.field2896[arg0][arg1][arg2];
        return var3 == null || var3.field3631 == null ? null : var3.field3631;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lgb;I)V")
    public static final void method255(class142 arg0, int arg1) {
        arg0.field2654 = arg0.field2693;
        field628++;
        if (arg0.field2686 == 0) {
            arg0.field2677 = 0;
            return;
        }
        if (arg0.field2655 != -1 && arg0.field2691 == 0) {
            class2 var2 = class253.method1712(arg0.field2655, -120);
            if (arg0.field2661 > 0 && var2.field43 == 0) {
                arg0.field2677++;
                return;
            }
            if (arg0.field2661 <= 0 && var2.field41 == 0) {
                arg0.field2677++;
                return;
            }
        }
        int var3 = arg0.field2687;
        int var4 = arg0.field2694;
        int var5 = arg0.field2651[arg0.field2686 - 1] * 128 + arg0.method1014(-1) * 64;
        int var6 = arg0.field2720[arg0.field2686 - 1] * 128 + (arg0.method1014(-1) * 64);
        if (var5 - var4 > 256 || var5 - var4 < -256 || (var6 - var3) > 256 || (var6 - var3) < -256) {
            arg0.field2687 = var6;
            arg0.field2694 = var5;
            return;
        }
        if (var5 <= var4) {
            if (var5 < var4) {
                if (var3 < var6) {
                    arg0.field2683 = 768;
                } else if (var6 >= var3) {
                    arg0.field2683 = 512;
                } else {
                    arg0.field2683 = 256;
                }
            } else if (var3 < var6) {
                arg0.field2683 = 1024;
            } else if (var6 < var3) {
                arg0.field2683 = 0;
            }
        } else if (var3 < var6) {
            arg0.field2683 = 1280;
        } else if (var6 >= var3) {
            arg0.field2683 = 1536;
        } else {
            arg0.field2683 = 1792;
        }
        int var7 = arg0.field2716;
        int var8 = 4;
        int var9 = arg0.field2683 - arg0.field2695 & 0x7FF;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 >= -256 && var9 <= 256) {
            var7 = arg0.field2700;
        } else if (var9 >= 256 && var9 < 768) {
            var7 = arg0.field2699;
        } else if (var9 >= -768 && var9 <= -256) {
            var7 = arg0.field2719;
        }
        if (var7 == -1) {
            var7 = arg0.field2700;
        }
        arg0.field2654 = var7;
        boolean var10 = true;
        if (arg0 instanceof class71) {
            var10 = ((class71) arg0).field1236.field1415;
        }
        if (var10) {
            if (arg0.field2695 != arg0.field2683 && arg0.field2665 == -1 && arg0.field2705 != 0) {
                var8 = 2;
            }
            if (arg0.field2686 > 2) {
                var8 = 6;
            }
            if (arg0.field2686 > 3) {
                var8 = 8;
            }
            if (arg0.field2677 > 0 && arg0.field2686 > 1) {
                var8 = 8;
                arg0.field2677--;
            }
        } else {
            if (arg0.field2686 > 1) {
                var8 = 6;
            }
            if (arg0.field2686 > 2) {
                var8 = 8;
            }
            if (arg0.field2677 > 0 && arg0.field2686 > 1) {
                arg0.field2677--;
                var8 = 8;
            }
        }
        if (arg1 <= 62) {
            method255((class142) null, -59);
        }
        if (arg0.field2662[arg0.field2686 - 1]) {
            var8 <<= 0x1;
        }
        if (var6 > var3) {
            arg0.field2687 += var8;
            if (var6 < arg0.field2687) {
                arg0.field2687 = var6;
            }
        } else if (var6 < var3) {
            arg0.field2687 -= var8;
            if (arg0.field2687 < var6) {
                arg0.field2687 = var6;
            }
        }
        if (var8 >= 8 && arg0.field2700 == arg0.field2654 && arg0.field2667 != -1) {
            arg0.field2654 = arg0.field2667;
        }
        if (var4 < var5) {
            arg0.field2694 += var8;
            if (var5 < arg0.field2694) {
                arg0.field2694 = var5;
            }
        } else if (var5 < var4) {
            arg0.field2694 -= var8;
            if (arg0.field2694 < var5) {
                arg0.field2694 = var5;
            }
        }
        if (arg0.field2694 != var5 || arg0.field2687 != var6) {
            return;
        }
        arg0.field2686--;
        if (arg0.field2661 > 0) {
            arg0.field2661--;
            return;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class40() {
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)I")
    public static final int method256(int arg0, boolean arg1) {
        field630++;
        long var2 = class244.method1644((byte) -66);
        if (arg0 <= 61) {
            field623 = -75;
        }
        for (class92 var4 = arg1 ? (class92) class155.field2930.method192(107) : (class92) class155.field2930.method189(0); var4 != null; var4 = (class92) class155.field2930.method189(0)) {
            if ((var4.field1764 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field1764 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1278;
                    class59.field1059[var5] = class269.field4752[var5];
                    var4.method476(89);
                    return var5;
                }
                var4.method476(100);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lli;I)V")
    public class40(class185 arg0, int arg1) {
        this.field635 = arg0;
    }
}
