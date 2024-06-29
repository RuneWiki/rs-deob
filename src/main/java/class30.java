import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class30 extends class26 {

    @OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
    private int field627;

    @OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
    private int field623;

    @OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!ee", name = "Cb", descriptor = "I")
    private int field634;

    @OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client!ee", name = "zb", descriptor = "Lmb;")
    private class74 field631;

    @OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!ee", name = "nb", descriptor = "[I")
    public static int[] field619 = new int[5];

    @OriginalMember(owner = "client!ee", name = "qb", descriptor = "Llc;")
    public static class69 field622 = class69.method470((byte) -118, "@gre@1 unread message");

    @OriginalMember(owner = "client!ee", name = "wb", descriptor = "Llc;")
    public static class69 field628 = class69.method470((byte) -116, "Login attempts exceeded)3");

    @OriginalMember(owner = "client!ee", name = "ub", descriptor = "[I")
    public static int[] field626 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client!ee", name = "hb", descriptor = "Llc;")
    public static class69 field613 = class69.method470((byte) -117, "Loaded textures");

    @OriginalMember(owner = "client!ee", name = "Ab", descriptor = "J")
    public static long field632 = 0L;

    @OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
    public static int field624 = 1;

    @OriginalMember(owner = "client!ee", name = "Db", descriptor = "Llc;")
    public static class69 field635 = class69.method470((byte) -119, "backleft1");

    @OriginalMember(owner = "client!ee", name = "Bb", descriptor = "Llc;")
    public static class69 field633 = class69.method470((byte) -109, "Loading title screen )2 ");

    @OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!ee", name = "kb", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ee", name = "xb", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ee", name = "gb", descriptor = "Loa;")
    public static class85 field612;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)Lhb;")
    public final class44 method144(boolean arg0) {
        if (this.field631 != null) {
            int var2 = class62.field1282 - this.field617;
            if (var2 > 100 && this.field631.field1656 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field631.field1658[this.field625] >= var2) {
                            break label42;
                        }
                        var2 -= this.field631.field1658[this.field625];
                        this.field625++;
                    } while (this.field625 < this.field631.field1646.length);
                    this.field625 -= this.field631.field1656;
                } while (this.field625 >= 0 && this.field631.field1646.length > this.field625);
                this.field631 = null;
            }
            this.field617 = class62.field1282 - var2;
        }
        field615++;
        class121 var3 = class110.method821(this.field634, 724);
        if (var3.field2628 != null) {
            var3 = var3.method891(0);
        }
        if (var3 == null) {
            return null;
        } else {
            if (!arg0) {
                method192(null, 3, 109, -118, -123, (byte) -34, null, -69, 75, -21, null);
            }
            return var3.method889(arg0, this.field614, this.field623, this.field627, this.field630, this.field620, this.field631, this.field618, this.field625);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BBZ)V")
    public static final void method190(int arg0, int arg1, byte[] arg2, byte arg3, boolean arg4) {
        if (arg3 != -26) {
            return;
        }
        if (class98.field2158 >= 0) {
            class102.field2218 = arg1;
            if (class98.field2158 == 0) {
                class70.field1565 = 1;
            } else {
                int var5 = class121.method890(class98.field2158, (byte) 57);
                int var6 = var5 - class3.field61;
                class70.field1565 = (var6 + 3600) / arg1;
                if (class70.field1565 < 1) {
                    class70.field1565 = 1;
                }
            }
            class98.field2141 = arg2;
            class125.field2701 = arg4;
            class56.field1178 = arg0;
        } else if (class70.field1565 == 0) {
            class40.method241(arg4, arg2, 12416, arg0);
        } else {
            class56.field1178 = arg0;
            class125.field2701 = arg4;
            class98.field2141 = arg2;
        }
        field616++;
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static void method191(int arg0) {
        field613 = null;
        field633 = null;
        field612 = null;
        field628 = null;
        field626 = null;
        field622 = null;
        field635 = null;
        field619 = null;
        if (arg0 != 8526) {
            method192(null, 17, 72, 8, -56, (byte) -11, null, -39, -21, -85, null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIIB[Lvb;IIILwd;)V")
    public static final void method192(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, class122[] arg6, int arg7, int arg8, int arg9, class129 arg10) {
        field629++;
        int var11 = -1;
        int var12 = 15 % ((arg5 + 6) / 46);
        class94 var13 = new class94(arg0);
        while (true) {
            int var14 = var13.method684(false);
            if (var14 == 0) {
                return;
            }
            var11 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var13.method684(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var13.method703((byte) -100);
                int var21 = var20 & 0x3;
                int var22 = var20 >> 2;
                if (arg2 == var19 && arg9 <= var18 && var18 < arg9 + 8 && var17 >= arg7 && arg7 + 8 > var17) {
                    class121 var23 = class110.method821(var11, 724);
                    int var24 = class36.method225(var18 & 0x7, 16691, var23.field2575, var23.field2574, var21, arg4, var17 & 0x7) + arg1;
                    int var25 = arg3 + class89.method629(var18 & 0x7, -26976, var23.field2574, var23.field2575, var21, arg4, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class122 var26 = null;
                        int var27 = arg8;
                        if ((class43.field856[1][var24][var25] & 0x2) == 2) {
                            var27 = arg8 - 1;
                        }
                        if (var27 >= 0) {
                            var26 = arg6[var27];
                        }
                        class108.method810(arg10, arg4 + var21 & 0x3, var26, 768, var11, var25, var24, arg8, var22);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
    public static final void method193(int arg0, boolean arg1) {
        field621++;
        int var2 = 0;
        if (arg0 != -1) {
            field626 = null;
        }
        while (var2 < class62.field1284) {
            class72 var3 = class112.field2434[class70.field1569[var2]];
            int var4 = (class70.field1569[var2] << 14) + 536870912;
            if (var3 != null && var3.method327(true) && arg1 == var3.field1616.field1470 && var3.field1616.method456(true)) {
                int var5 = var3.field1058 >> 7;
                int var6 = var3.field1065 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    label72: {
                        if (var3.field1042 == 1 && (var3.field1058 & 0x7F) == 64 && (var3.field1065 & 0x7F) == 64) {
                            if (class57.field1200[var5][var6] == class92.field2000) {
                                break label72;
                            }
                            class57.field1200[var5][var6] = class92.field2000;
                        }
                        if (!var3.field1616.field1460) {
                            var4 += Integer.MIN_VALUE;
                        }
                        class120.field2562.method979(class71.field1588, var3.field1058, var3.field1065, class53.method341(0, var3.field1058, var3.field1065, class71.field1588), var3.field1042 * 64 + 60 - 64, var3, var3.field1037, var4, var3.field1059);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIIIZ)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field627 = arg2;
        this.field623 = arg6;
        this.field630 = arg5;
        this.field614 = arg1;
        this.field634 = arg0;
        this.field620 = arg4;
        this.field618 = arg3;
        if (arg7 != -1) {
            this.field631 = class67.method435(80, arg7);
            this.field625 = 0;
            this.field617 = class62.field1282 - 1;
            if (arg8 && this.field631.field1656 != -1) {
                this.field625 = (int) (Math.random() * (double) this.field631.field1646.length);
                this.field617 -= (int) ((double) this.field631.field1658[this.field625] * Math.random());
                return;
            }
        }
    }
}
