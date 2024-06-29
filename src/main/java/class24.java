import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class24 {

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Loa;")
    public static class98 field581 = class38.method349(255, "sl_flags");

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Loa;")
    public static class98 field588 = class38.method349(255, "backleft2");

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lja;")
    public static class63 field583 = new class63();

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Loa;")
    public static class98 field591 = class38.method349(255, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field594 = -1;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "Loa;")
    public static class98 field593 = class38.method349(255, "(X100(U(Y");

    @OriginalMember(owner = "client!db", name = "q", descriptor = "Loa;")
    public static class98 field592 = class38.method349(255, "backleft1");

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Loa;")
    public static class98 field595 = class38.method349(255, "Von:");

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Loa;")
    private static class98 field596 = class38.method349(255, "Cancel");

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Loa;")
    public static class98 field597 = class38.method349(255, "_");

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Loa;")
    public static class98 field590 = field596;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "Lkd;")
    public static class73 field589;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)Loa;")
    public static final class98 method265(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = arg0 / arg2;
        if (arg1 != 922465136) {
            return null;
        }
        field580++;
        int var5 = 1;
        while (var4 != 0) {
            var4 /= arg2;
            var5++;
        }
        int var6 = var5;
        if (arg0 < 0 || arg3) {
            var6 = var5 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = arg0 % arg2;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg0 /= arg2;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class98 var9 = new class98();
        var9.field2255 = var7;
        var9.field2277 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLtb;)V")
    public static final void method266(boolean arg0, class130 arg1) {
        if (arg0) {
            field581 = null;
        }
        field582++;
        class20.field448 = arg1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method267(int arg0) {
        field576++;
        if (arg0 < 0) {
            return;
        }
        class78 var1 = class53.field1166;
        synchronized (class53.field1166) {
            class36.field899 = class97.field2235;
            class42.field990 = class98.field2302;
            class123.field2749 = class149.field3681;
            class42.field976 = class35.field872;
            class150.field3717 = class74.field1589;
            class86.field1980 = class123.field2746;
            class52.field1160 = class125.field2785;
            class35.field872 = 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
    public static final boolean method268(int arg0, int arg1) {
        field579++;
        if (!client.method202(arg0, -642990672)) {
            return false;
        }
        boolean var2 = false;
        class132[] var3 = class36.field901[arg0];
        if (arg1 != 2047) {
            return false;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            class132 var5 = var3[var4];
            if (var5 != null && var5.field3219 == 6) {
                if (var5.field3177 != -1 || var5.field3175 != -1) {
                    boolean var6 = class54.method438(36, var5);
                    int var7;
                    if (var6) {
                        var7 = var5.field3175;
                    } else {
                        var7 = var5.field3177;
                    }
                    if (var7 != -1) {
                        class33 var8 = class48.method413(-82, var7);
                        var5.field3110 += class52.field1161;
                        label57: while (true) {
                            do {
                                do {
                                    if (var8.field794[var5.field3132] >= var5.field3110) {
                                        break label57;
                                    }
                                    var2 = true;
                                    var5.field3110 -= var8.field794[var5.field3132];
                                    var5.field3132++;
                                } while (var5.field3132 < var8.field807.length);
                                var5.field3132 -= var8.field834;
                            } while (var5.field3132 >= 0 && var8.field807.length > var5.field3132);
                            var5.field3132 = 0;
                        }
                    }
                }
                if (var5.field3223 != 0 && !var5.field3152) {
                    var2 = true;
                    int var9 = var5.field3223 >> 16;
                    int var10 = class52.field1161 * var9;
                    var5.field3218 = var5.field3218 + var10 & 0x7FF;
                    int var11 = var5.field3223 << 16 >> 16;
                    int var12 = class52.field1161 * var11;
                    var5.field3220 = var5.field3220 + var12 & 0x7FF;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
    public static final boolean method269(int arg0) {
        field587++;
        try {
            if (class71.field1483 == 2) {
                if (class127.field2858 == null) {
                    class127.field2858 = class50.method421(class55.field1213, client.field513, class139.field3400);
                    if (class127.field2858 == null) {
                        return false;
                    }
                }
                if (class31.field716 == null) {
                    class31.field716 = new class141(class52.field1155, class94.field2139);
                }
                if (class56.field1252.method689(class127.field2858, -121, 22050, class83.field1916, class31.field716)) {
                    class56.field1252.method670(-1819595320);
                    class56.field1252.method658((byte) 83, class71.field1481);
                    class56.field1252.method690(class127.field2858, 125, class3.field36);
                    class55.field1213 = null;
                    class71.field1483 = 0;
                    class127.field2858 = null;
                    class31.field716 = null;
                    return true;
                }
            }
            if (arg0 != -16403) {
                field594 = 42;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class56.field1252.method660(arg0 ^ 0x405F);
            class31.field716 = null;
            class55.field1213 = null;
            class127.field2858 = null;
            class71.field1483 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lwb;B)V")
    public static final void method270(class148 arg0, byte arg1) {
        field584++;
        if (arg1 < 41) {
            return;
        }
        arg0.field3639 = false;
        if (arg0.field3655 != -1) {
            class33 var2 = class48.method413(-79, arg0.field3655);
            if (var2 == null || var2.field807 == null) {
                arg0.field3655 = -1;
            } else {
                arg0.field3615++;
                if (var2.field807.length > arg0.field3631 && arg0.field3615 > var2.field794[arg0.field3631]) {
                    arg0.field3615 = 1;
                    arg0.field3631++;
                    class76.method621(arg0.field3657, (byte) 120, arg0.field3631, var2, arg0.field3667);
                }
                if (arg0.field3631 >= var2.field807.length) {
                    arg0.field3615 = 0;
                    arg0.field3631 = 0;
                    class76.method621(arg0.field3657, (byte) 120, arg0.field3631, var2, arg0.field3667);
                }
            }
        }
        if (arg0.field3669 != -1 && class119.field2680 >= arg0.field3614) {
            if (arg0.field3627 < 0) {
                arg0.field3627 = 0;
            }
            int var3 = class51.method425(arg0.field3669, 4).field428;
            if (var3 == -1) {
                arg0.field3669 = -1;
            } else {
                class33 var4 = class48.method413(-99, var3);
                if (var4 == null || var4.field807 == null) {
                    arg0.field3669 = -1;
                } else {
                    arg0.field3659++;
                    if (arg0.field3627 < var4.field807.length && arg0.field3659 > var4.field794[arg0.field3627]) {
                        arg0.field3627++;
                        arg0.field3659 = 1;
                        class76.method621(arg0.field3657, (byte) 120, arg0.field3627, var4, arg0.field3667);
                    }
                    if (var4.field807.length <= arg0.field3627 && (arg0.field3627 < 0 || var4.field807.length <= arg0.field3627)) {
                        arg0.field3669 = -1;
                    }
                }
            }
        }
        if (arg0.field3612 != -1 && arg0.field3605 <= 1) {
            class33 var5 = class48.method413(-125, arg0.field3612);
            if (var5.field785 == 1 && arg0.field3661 > 0 && class119.field2680 >= arg0.field3602 && arg0.field3666 < class119.field2680) {
                arg0.field3605 = 1;
                return;
            }
        }
        if (arg0.field3612 != -1 && arg0.field3605 == 0) {
            class33 var6 = class48.method413(-89, arg0.field3612);
            if (var6 == null || var6.field807 == null) {
                arg0.field3612 = -1;
            } else {
                arg0.field3604++;
                if (var6.field807.length > arg0.field3641 && var6.field794[arg0.field3641] < arg0.field3604) {
                    arg0.field3604 = 1;
                    arg0.field3641++;
                    class76.method621(arg0.field3657, (byte) 120, arg0.field3641, var6, arg0.field3667);
                }
                if (var6.field807.length <= arg0.field3641) {
                    arg0.field3641 -= var6.field834;
                    arg0.field3633++;
                    if (arg0.field3633 >= var6.field830) {
                        arg0.field3612 = -1;
                    } else if (arg0.field3641 >= 0 && arg0.field3641 < var6.field807.length) {
                        class76.method621(arg0.field3657, (byte) 120, arg0.field3641, var6, arg0.field3667);
                    } else {
                        arg0.field3612 = -1;
                    }
                }
                arg0.field3639 = var6.field824;
            }
        }
        if (arg0.field3605 > 0) {
            arg0.field3605--;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method271(int arg0) {
        if (arg0 != 1) {
            method268(57, 57);
        }
        field581 = null;
        field589 = null;
        field592 = null;
        field595 = null;
        field590 = null;
        field596 = null;
        field583 = null;
        field588 = null;
        field597 = null;
        field593 = null;
        field591 = null;
    }
}
