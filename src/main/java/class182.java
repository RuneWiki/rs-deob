import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class182 extends class52 {

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "Z")
    public boolean field3498 = false;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    private int field3493 = 0;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    private int field3507 = 0;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!te", name = "V", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
    public int field3508;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    private int field3496;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    public int field3501;

    @OriginalMember(owner = "client!te", name = "W", descriptor = "Lub;")
    private class188 field3495;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "Ltg;")
    public static class184 field3486 = class135.method812("mapfunction", 3);

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field3491 = 0;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "Ltg;")
    public static class184 field3502 = class135.method812("Bitte wenden Sie sich an den Kundendienst)3", 3);

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Ltg;")
    public static class184 field3488 = class135.method812(")4slr)3ws?order=LPWM", 3);

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field3505 = -1;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
    public static int field3500 = 0;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public static int field3514 = 0;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "Ltg;")
    public static class184 field3510 = class135.method812("Der Server wird gerade aktualisiert)3", 3);

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "Ltg;")
    public static class184 field3516 = class135.method812(" weitere Optionen", 3);

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field3509 = -1;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "Lna;")
    public static class124 field3517;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "Lj;")
    public static class87 field3503;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "Lk;")
    public static class96 field3504;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method1125(boolean arg0) {
        field3488 = null;
        if (!arg0) {
            return;
        }
        field3486 = null;
        field3502 = null;
        field3504 = null;
        field3510 = null;
        field3516 = null;
        field3517 = null;
        field3503 = null;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Loh;")
    public final class140 method15(int arg0) {
        if (arg0 != 7) {
            method1130((byte) 112, 126, -94, 19, 11);
        }
        class57 var2 = class74.method438((byte) 89, this.field3496);
        class140 var3;
        if (this.field3498) {
            var3 = var2.method304(-1, 217);
        } else {
            var3 = var2.method304(this.field3507, 217);
        }
        field3518++;
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IJ)V")
    public static final void method1126(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 0) {
                method1126(109, -20L);
            }
        } catch (InterruptedException var3) {
        }
        field3499++;
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
    public static final void method1127(byte arg0) {
        field3513++;
        class58.field1081.method770(false);
        if (arg0 == 93) {
            class51.field938.method770(false);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public final void method1128(boolean arg0, int arg1) {
        field3489++;
        if (this.field3498) {
            return;
        }
        this.field3493 += arg1;
        if (!arg0) {
            this.field3506 = 18;
        }
        while (this.field3495.field3638[this.field3507] < this.field3493) {
            this.field3493 -= this.field3495.field3638[this.field3507];
            this.field3507++;
            if (this.field3507 >= this.field3495.field3645.length) {
                this.field3498 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lgh;IZI)V")
    public static final void method1129(class67 arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method1129(null, -73, true, -107);
        }
        field3497++;
        if (arg0.field612 == arg3 && arg3 != -1) {
            int var4 = class83.method465(arg3, -1).field3640;
            if (var4 == 1) {
                arg0.field600 = 0;
                arg0.field662 = 0;
                arg0.field630 = arg1;
                arg0.field595 = 0;
            }
            if (var4 == 2) {
                arg0.field662 = 0;
            }
        } else if (arg3 == -1 || arg0.field612 == -1 || class83.method465(arg3, -1).field3619 >= class83.method465(arg0.field612, -1).field3619) {
            arg0.field662 = 0;
            arg0.field642 = arg0.field598;
            arg0.field612 = arg3;
            arg0.field600 = 0;
            arg0.field630 = arg1;
            arg0.field595 = 0;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIII)V")
    public class182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3512 = arg4;
        this.field3494 = arg2;
        this.field3508 = arg6 + arg5;
        this.field3506 = arg1;
        this.field3496 = arg0;
        this.field3501 = arg3;
        int var8 = class74.method438((byte) 120, this.field3496).field1017;
        if (var8 == -1) {
            this.field3498 = true;
        } else {
            this.field3498 = false;
            this.field3495 = class83.method465(var8, -1);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIII)V")
    public static final void method1130(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -66 % ((arg0 - 38) / 39);
        for (int var6 = arg2; var6 <= arg2 + arg4; var6++) {
            for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class191.field3724[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        class179.field3418[0][var7][var6] = class179.field3418[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < 103) {
                        class179.field3418[0][var7][var6] = class179.field3418[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        class179.field3418[0][var7][var6] = class179.field3418[0][var7][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < 103) {
                        class179.field3418[0][var7][var6] = class179.field3418[0][var7][var6 + 1];
                    }
                }
            }
        }
        field3492++;
    }
}
