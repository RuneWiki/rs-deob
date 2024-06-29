import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class187 extends class12 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "[I")
    public static int[] field3608 = new int[128];

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Ltg;")
    public static class184 field3615 = class135.method812("60 Sekunden noch einmal)3)3)3", 3);

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field3616 = 1;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lka;I)Ltg;")
    public static final class184 method1181(class97 arg0, int arg1) {
        ++field3611;
        if (arg1 != -32769) {
            method1181((class97) null, -17);
        }
        return class90.method528(arg1 ^ -46575, 32767, arg0);
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class187() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public static final void method1182(int arg0) {
        if (!class120.field2163[98]) {
            if (class120.field2163[99]) {
                class31.field532 += (-class31.field532 + -12) / 2;
            } else {
                class31.field532 /= 2;
            }
        } else {
            class31.field532 += (-class31.field532 + 12) / 2;
        }
        if (!class120.field2163[96]) {
            if (class120.field2163[97]) {
                class47.field893 += (-class47.field893 + 24) / 2;
            } else {
                class47.field893 /= 2;
            }
        } else {
            class47.field893 += (-24 - class47.field893) / 2;
        }
        class38.field716 = 2047 & class47.field893 / arg0 + class38.field716;
        ++field3612;
        int var1 = class50.field929 + class46.field872.field635;
        class24.field439 += class31.field532 / 2;
        if (class24.field439 < 128) {
            class24.field439 = 128;
        }
        if (~class24.field439 < -384) {
            class24.field439 = 383;
        }
        int var2 = class97.field1804 + class46.field872.field614;
        if (-var1 + class131.field2378 < -500 || -var1 + class131.field2378 > 500 || ~(-var2 + class3.field66) > 499 || ~(-var2 + class3.field66) < -501) {
            class131.field2378 = var1;
            class3.field66 = var2;
        }
        if (~class131.field2378 != ~var1) {
            class131.field2378 += (-class131.field2378 + var1) / 16;
        }
        int var3 = class131.field2378 >> 7;
        if (~class3.field66 != ~var2) {
            class3.field66 += (-class3.field66 + var2) / 16;
        }
        int var4 = class3.field66 >> 7;
        int var5 = 0;
        int var6 = class115.method706(class131.field2378, class47.field892, 127, class3.field66);
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 + -4; var7 <= var3 + 4; ++var7) {
                for (int var8 = var4 + -4; ~var8 >= ~(var4 + 4); ++var8) {
                    int var9 = class47.field892;
                    if (var9 < 3 && (class46.field878[1][var7][var8] & 2) == 2) {
                        ++var9;
                    }
                    int var10 = -class179.field3418[var9][var7][var8] + var6;
                    if (~var10 < ~var5) {
                        var5 = var10;
                    }
                }
            }
        }
        int var11 = var5 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (var11 <= class176.field3356) {
            if (class176.field3356 > var11) {
                class176.field3356 += (-class176.field3356 + var11) / 80;
                return;
            }
        } else {
            class176.field3356 += (-class176.field3356 + var11) / 24;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
    public static void method1183(boolean arg0) {
        field3615 = null;
        if (arg0) {
            method1183(true);
        }
        field3608 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field3609;
        if (arg1 != 17) {
            return null;
        } else {
            int[] var3 = super.field224.method7((byte) -56, arg0);
            if (super.field224.field53) {
                for (int var4 = 0; ~class201.field3889 < ~var4; ++var4) {
                    var3[var4] = class131.field2381[var4];
                }
            }
            return var3;
        }
    }
}
