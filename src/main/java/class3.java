import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ab")
public class class3 extends class71 {

    @OriginalMember(owner = "ab", name = "x", descriptor = "I")
    public int field21 = 0;

    @OriginalMember(owner = "ab", name = "t", descriptor = "[Led;")
    public class45[] field17 = new class45[5];

    @OriginalMember(owner = "ab", name = "E", descriptor = "[I")
    public int[] field28 = new int[5];

    @OriginalMember(owner = "ab", name = "w", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "ab", name = "v", descriptor = "I")
    public int field19;

    @OriginalMember(owner = "ab", name = "F", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "ab", name = "n", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "ab", name = "G", descriptor = "Llf;")
    public static class109 field30 = class35.method275(": ", 2);

    @OriginalMember(owner = "ab", name = "s", descriptor = "Llf;")
    public static class109 field16 = class35.method275(":duelstake:", 2);

    @OriginalMember(owner = "ab", name = "o", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "ab", name = "p", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "ab", name = "q", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "ab", name = "r", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "ab", name = "y", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "ab", name = "z", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "ab", name = "C", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "ab", name = "I", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "ab", name = "N", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "ab", name = "P", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "ab", name = "K", descriptor = "Lla;")
    public class104 field34;

    @OriginalMember(owner = "ab", name = "L", descriptor = "Lnf;")
    public class127 field35;

    @OriginalMember(owner = "ab", name = "H", descriptor = "Lba;")
    public class12 field31;

    @OriginalMember(owner = "ab", name = "O", descriptor = "Ldg;")
    public class38 field38;

    @OriginalMember(owner = "ab", name = "A", descriptor = "Lab;")
    public class3 field24;

    @OriginalMember(owner = "ab", name = "M", descriptor = "Leb;")
    public class43 field36;

    @OriginalMember(owner = "ab", name = "D", descriptor = "Lei;")
    public class50 field27;

    @OriginalMember(owner = "ab", name = "u", descriptor = "Z")
    public boolean field18;

    @OriginalMember(owner = "ab", name = "B", descriptor = "Z")
    public boolean field25;

    @OriginalMember(owner = "ab", name = "J", descriptor = "Z")
    public boolean field33;

    @OriginalMember(owner = "ab", name = "<init>", descriptor = "(III)V")
    public class3(int arg0, int arg1, int arg2) {
        this.field20 = arg1;
        this.field29 = this.field19 = arg0;
        this.field11 = arg2;
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(I)V")
    public static final void method10(int arg0) {
        class193.field3691.method1088(-51);
        field37++;
        int var1 = 81 % ((53 - arg0) / 60);
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(II)I")
    public static final int method11(int arg0, int arg1) {
        field12++;
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        if (arg0 != 1834) {
            field30 = null;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "ab", name = "c", descriptor = "(B)V")
    public static final void method12(byte arg0) {
        field32++;
        int var1 = 96 / ((49 - arg0) / 62);
        for (class81 var2 = (class81) class47.field976.method1230(72); var2 != null; var2 = (class81) class47.field976.method1234(-1)) {
            if (var2.field1600 == -1) {
                var2.field1605 = 0;
                class168.method1127(0, var2);
            } else {
                var2.method452(true);
            }
        }
    }

    @OriginalMember(owner = "ab", name = "a", descriptor = "(Luc;B)V")
    public static final void method13(class187 arg0, byte arg1) {
        arg0.field3579 = arg0.field3544;
        field14++;
        if (arg0.field3563 == 0) {
            arg0.field3550 = 0;
            return;
        }
        if (arg0.field3597 != -1 && arg0.field3570 == 0) {
            class20 var2 = client.method246(arg1 + 37, arg0.field3597);
            if (arg0.field3560 > 0 && var2.field444 == 0) {
                arg0.field3550++;
                return;
            }
            if (arg0.field3560 <= 0 && var2.field467 == 0) {
                arg0.field3550++;
                return;
            }
        }
        int var3 = arg0.field3549;
        int var4 = arg0.field3609;
        int var5 = arg0.field3547[arg0.field3563 - 1] * 128 + arg0.field3612 * 64;
        int var6 = arg0.field3567[arg0.field3563 - 1] * 128 + arg0.field3612 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field3609 = var6;
            arg0.field3549 = var5;
            return;
        }
        int var7 = arg0.field3559;
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field3600 = 1280;
            } else if (var6 >= var4) {
                arg0.field3600 = 1536;
            } else {
                arg0.field3600 = 1792;
            }
        } else if (var5 >= var3) {
            if (var4 < var6) {
                arg0.field3600 = 1024;
            } else if (var4 > var6) {
                arg0.field3600 = 0;
            }
        } else if (var6 > var4) {
            arg0.field3600 = 768;
        } else if (var4 <= var6) {
            arg0.field3600 = 512;
        } else {
            arg0.field3600 = 256;
        }
        int var8 = arg0.field3600 - arg0.field3556 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field3616;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field3603;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field3569;
        }
        if (arg1 != -25) {
            method13(null, (byte) -9);
        }
        if (var7 == -1) {
            var7 = arg0.field3616;
        }
        arg0.field3579 = var7;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class139) {
            var10 = ((class139) arg0).field2691.field3173;
        }
        if (var10) {
            if (arg0.field3600 != arg0.field3556 && arg0.field3582 == -1 && arg0.field3566 != 0) {
                var9 = 2;
            }
            if (arg0.field3563 > 2) {
                var9 = 6;
            }
            if (arg0.field3563 > 3) {
                var9 = 8;
            }
            if (arg0.field3550 > 0 && arg0.field3563 > 1) {
                arg0.field3550--;
                var9 = 8;
            }
        } else {
            if (arg0.field3563 > 1) {
                var9 = 6;
            }
            if (arg0.field3563 > 2) {
                var9 = 8;
            }
            if (arg0.field3550 > 0 && arg0.field3563 > 1) {
                arg0.field3550--;
                var9 = 8;
            }
        }
        if (arg0.field3593[arg0.field3563 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field3616 == arg0.field3579 && arg0.field3587 != -1) {
            arg0.field3579 = arg0.field3587;
        }
        if (var6 > var4) {
            arg0.field3609 += var9;
            if (arg0.field3609 > var6) {
                arg0.field3609 = var6;
            }
        } else if (var4 > var6) {
            arg0.field3609 -= var9;
            if (var6 > arg0.field3609) {
                arg0.field3609 = var6;
            }
        }
        if (var3 < var5) {
            arg0.field3549 += var9;
            if (var5 < arg0.field3549) {
                arg0.field3549 = var5;
            }
        } else if (var5 < var3) {
            arg0.field3549 -= var9;
            if (var5 > arg0.field3549) {
                arg0.field3549 = var5;
            }
        }
        if (arg0.field3549 != var5 || arg0.field3609 != var6) {
            return;
        }
        arg0.field3563--;
        if (arg0.field3560 > 0) {
            arg0.field3560--;
            return;
        }
    }

    @OriginalMember(owner = "ab", name = "d", descriptor = "(B)V")
    public static void method14(byte arg0) {
        if (arg0 < 124) {
            field16 = null;
        }
        field16 = null;
        field30 = null;
    }
}
