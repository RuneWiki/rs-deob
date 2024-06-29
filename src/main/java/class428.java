import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class428 extends class194 {

    @OriginalMember(owner = "client!uu", name = "Kb", descriptor = "I")
    public static int field6355 = 10;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "Ljp;")
    public static class55 field6349 = new class55(70, -2);

    @OriginalMember(owner = "client!uu", name = "Sb", descriptor = "Lpu;")
    public static class179 field6363 = new class179("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!uu", name = "Tb", descriptor = "[Z")
    public static boolean[] field6364 = new boolean[8];

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!uu", name = "Fb", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!uu", name = "Gb", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!uu", name = "Hb", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!uu", name = "Ib", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!uu", name = "Jb", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!uu", name = "Lb", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!uu", name = "Mb", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!uu", name = "Nb", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!uu", name = "Ob", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!uu", name = "Pb", descriptor = "I")
    private int field6360;

    @OriginalMember(owner = "client!uu", name = "Qb", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!uu", name = "Rb", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!uu", name = "Ub", descriptor = "Lot;")
    private class168 field6365;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIII)V", line = 3)
    public final void method2665(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field6356;
        for (int var5 = arg2; arg3 > var5; ++var5) {
            arg0[arg1 + var5] = (byte) (super.field2973[super.field2982++] + -this.field6365.method1196(62));
        }
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(I)V", line = 25)
    public class428(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "(I)V", line = 29)
    public final void method2666(int arg0) {
        ++field6357;
        this.field6360 = super.field2982 * 8;
        int var2 = 0 / ((53 - arg0) / 38);
    }

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "(B)V", line = 42)
    public static void method2667(byte arg0) {
        field6364 = null;
        field6363 = null;
        if (arg0 < 112) {
            method2667((byte) 84);
        }
        field6349 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lew;B)V", line = 54)
    public static final void method2668(class274 arg0, byte arg1) {
        ++field6352;
        int var2 = -4 / ((arg1 - 1) / 62);
        class179.field2761 = arg0;
    }

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "(IZ)I", line = 65)
    public final int method2669(int arg0, boolean arg1) {
        if (!arg1) {
            field6349 = null;
        }
        ++field6358;
        return arg0 * 8 + -this.field6360;
    }

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "(Z)V", line = 77)
    public static final void method2670(boolean arg0) {
        ++field6359;
        class286.method1919(0);
        class327.field4947 = null;
        class172.field2666 = null;
        class166.field2508 = null;
        class73.field1248 = null;
        if (arg0) {
            class489.field7140 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "(II)I", line = 95)
    public final int method2671(int arg0, int arg1) {
        if (arg0 > -111) {
            field6349 = null;
        }
        ++field6362;
        int var3 = this.field6360 >> 3;
        int var4 = -(7 & this.field6360) + 8;
        this.field6360 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (class412.field6079[var4] & super.field2973[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field2973[var3] & class412.field6079[var4]) + var5;
        } else {
            var6 = (super.field2973[var3] >> var4 - arg1 & class412.field6079[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "(I)I", line = 126)
    public final int method2672(int arg0) {
        ++field6348;
        if (arg0 != -687978552) {
            this.method2671(76, -76);
        }
        int var2 = super.field2973[super.field2982++] - this.field6365.method1196(18) & 255;
        return var2 < 128 ? var2 : (var2 + -128 << 8) - -(super.field2973[super.field2982++] + -this.field6365.method1196(90) & 255);
    }

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "(B)V", line = 145)
    public final void method2673(byte arg0) {
        ++field6351;
        if (arg0 == 112) {
            super.field2982 = (this.field6360 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[I)V", line = 160)
    public final void method2674(int arg0, int[] arg1) {
        ++field6361;
        if (arg0 == -851256347) {
            this.field6365 = new class168(arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "(II)V", line = 175)
    public final void method2675(int arg0, int arg1) {
        super.field2973[super.field2982++] = (byte) (this.field6365.method1196(54) + arg0);
        ++field6350;
        if (arg1 != -4) {
            this.method2674(-75, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "(I)Z", line = 186)
    public final boolean method2676(int arg0) {
        ++field6353;
        int var2 = super.field2973[super.field2982] + -this.field6365.method1199((byte) -122) & 255;
        if (var2 < 128) {
            return false;
        } else {
            return arg0 >= 115;
        }
    }

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "(I)V", line = 214)
    public static final void method2677(int arg0) {
        ++field6354;
        if (class337.field5072 == null) {
            Container var1;
            if (class237.field3564 == null) {
                var1 = class122.field1844.field1062;
            } else {
                var1 = class237.field3564;
            }
            class100.field1538 = var1.getSize().width;
            class228.field3453 = var1.getSize().height;
            if (class237.field3564 == var1) {
                Insets var2 = class237.field3564.getInsets();
                class100.field1538 -= var2.right + var2.left;
                class228.field3453 -= var2.top + var2.bottom;
            }
            if (class159.method1145((byte) 121) == 1) {
                class338.field5079 = (class100.field1538 - class182.field2785) / 2;
                class169.field2570 = class182.field2785;
                class360.field5313 = class155.field2387;
                class525.field7700 = 0;
            } else if (~class360.field5314 > -97 && ~class108.field1631 == -1) {
                int var3 = class100.field1538 <= 1024 ? class100.field1538 : 1024;
                class338.field5079 = (-var3 + class100.field1538) / 2;
                class169.field2570 = var3;
                int var4 = class228.field3453 > 768 ? 768 : class228.field3453;
                class360.field5313 = var4;
                class525.field7700 = 0;
            } else {
                class338.field5079 = 0;
                class169.field2570 = class100.field1538;
                class360.field5313 = class228.field3453;
                class525.field7700 = 0;
            }
            if (class62.field991 != class287.field4471) {
                boolean var10000;
                if (class169.field2570 < 1024 && class360.field5313 < 768) {
                    var10000 = true;
                } else {
                    var10000 = false;
                }
            }
            class342.field5114.setSize(class169.field2570, class360.field5313);
            if (class376.field5542 != null) {
                class376.field5542.method518(class342.field5114);
            }
            if (class237.field3564 == var1) {
                Insets var5 = class237.field3564.getInsets();
                class342.field5114.setLocation(class338.field5079 + var5.left, var5.top - -class525.field7700);
            } else {
                class342.field5114.setLocation(class338.field5079, class525.field7700);
            }
            if (class134.field2010 != -1) {
                class179.method1264(arg0 + 514686259, true);
            }
            if (arg0 == -514686137) {
                class27.method163((byte) -88);
            }
        }
    }
}
