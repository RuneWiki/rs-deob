import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class194 {

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field647 = 99;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
    public static boolean field648 = false;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lqk;")
    public static class207 field650 = class24.method212(255, "niveau ");

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Z")
    public static boolean field654 = false;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lqk;")
    public static class207 field642 = class24.method212(255, "floorshadows");

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "Lqk;")
    public static class207 field652 = class24.method212(255, "leuchten1:");

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field653 = 127;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static volatile int field646 = 0;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "Lqk;")
    public static class207 field657 = class24.method212(255, "gleiten:");

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "J")
    public long field643;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "Lie;")
    public class32 field651;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Lie;")
    public class32 field656;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "Lpk;")
    public static class99 field649;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public static void method243(int arg0) {
        field650 = null;
        field652 = null;
        field642 = null;
        field649 = null;
        field657 = null;
        int var1 = 42 % ((21 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public final void method244(int arg0) {
        field655++;
        if (arg0 != -10368) {
            method245((class286) null, 82);
        }
        if (this.field651 != null) {
            this.field651.field656 = this.field656;
            this.field656.field651 = this.field651;
            this.field651 = null;
            this.field656 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Llh;I)V")
    public static final void method245(class286 arg0, int arg1) {
        field644++;
        if (arg1 != 290) {
            method246(-37, 104);
        }
        class200 var2 = arg0.method1947(9);
        arg0.field5039 = var2.field3539;
        if (arg0.field5061 == 0) {
            arg0.field5015 = 0;
            return;
        }
        if (arg0.field5052 != -1 && arg0.field5103 == 0) {
            class65 var3 = class16.method101((byte) -121, arg0.field5052);
            if (arg0.field5011 > 0 && var3.field1170 == 0) {
                arg0.field5015++;
                return;
            }
            if (arg0.field5011 <= 0 && var3.field1178 == 0) {
                arg0.field5015++;
                return;
            }
        }
        int var4 = arg0.field5104;
        int var5 = arg0.field5072;
        int var6 = arg0.field5022[arg0.field5061 - 1] * 128 + (arg0.method83(true) * 64);
        int var7 = arg0.field5074[arg0.field5061 - 1] * 128 + (arg0.method83(true) * 64);
        if ((var6 - var4) > 256 || (var6 - var4) < -256 || var7 - var5 > 256 || var7 - var5 < -256) {
            arg0.field5072 = var7;
            arg0.field5104 = var6;
            return;
        }
        if (var6 > var4) {
            if (var7 > var5) {
                arg0.field5098 = 1280;
            } else if (var5 <= var7) {
                arg0.field5098 = 1536;
            } else {
                arg0.field5098 = 1792;
            }
        } else if (var4 > var6) {
            if (var7 > var5) {
                arg0.field5098 = 768;
            } else if (var5 > var7) {
                arg0.field5098 = 256;
            } else {
                arg0.field5098 = 512;
            }
        } else if (var5 < var7) {
            arg0.field5098 = 1024;
        } else if (var7 < var5) {
            arg0.field5098 = 0;
        }
        int var8 = arg0.field5098 - arg0.field5062 & 0x7FF;
        int var9 = var2.field3534;
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var9 = var2.field3522;
        } else if (var8 >= 256 && var8 < 768) {
            var9 = var2.field3507;
        } else if (var8 >= -768 && var8 <= -256) {
            var9 = var2.field3546;
        }
        if (var9 == -1) {
            var9 = var2.field3522;
        }
        arg0.field5039 = var9;
        if (arg0 instanceof class256) {
            var10 = ((class256) arg0).field4581.field1302;
        }
        byte var11 = 1;
        int var12 = 4;
        if (var10) {
            if (arg0.field5098 != arg0.field5062 && arg0.field5079 == -1 && arg0.field5097 != 0) {
                var12 = 2;
            }
            if (arg0.field5061 > 2) {
                var12 = 6;
            }
            if (arg0.field5061 > 3) {
                var12 = 8;
            }
            if (arg0.field5015 > 0 && arg0.field5061 > 1) {
                var12 = 8;
                arg0.field5015--;
            }
        } else {
            if (arg0.field5061 > 1) {
                var12 = 6;
            }
            if (arg0.field5061 > 2) {
                var12 = 8;
            }
            if (arg0.field5015 > 0 && arg0.field5061 > 1) {
                var12 = 8;
                arg0.field5015--;
            }
        }
        if (arg0.field5073[arg0.field5061 - 1] == 2) {
            var11 = 2;
            var12 <<= 0x1;
        } else if (arg0.field5073[arg0.field5061 - 1] == 0) {
            var12 >>= 0x1;
            var11 = 0;
        }
        if (var12 < 8 || var2.field3528 == -1) {
            if (var2.field3531 != -1 && var11 == 0) {
                if (arg0.field5039 == var2.field3534 && var2.field3545 != -1) {
                    arg0.field5039 = var2.field3545;
                } else if (arg0.field5039 == var2.field3546 && var2.field3540 != -1) {
                    arg0.field5039 = var2.field3540;
                } else if (arg0.field5039 == var2.field3507 && var2.field3536 != -1) {
                    arg0.field5039 = var2.field3536;
                } else {
                    arg0.field5039 = var2.field3531;
                }
            }
        } else if (arg0.field5039 == var2.field3534 && var2.field3541 != -1) {
            arg0.field5039 = var2.field3541;
        } else if (arg0.field5039 == var2.field3546 && var2.field3527 != -1) {
            arg0.field5039 = var2.field3527;
        } else if (arg0.field5039 == var2.field3507 && var2.field3519 != -1) {
            arg0.field5039 = var2.field3519;
        } else {
            arg0.field5039 = var2.field3528;
        }
        if (var2.field3544 != -1) {
            int var13 = var12 << 7;
            if (arg0.field5061 == 1) {
                int var14 = arg0.field5100 * arg0.field5100;
                int var15 = (arg0.field5104 > var6 ? arg0.field5104 - var6 : -arg0.field5104 + var6) << 7;
                int var16 = (arg0.field5072 > var7 ? arg0.field5072 - var7 : -arg0.field5072 + var7) << 7;
                int var17 = var16 >= var15 ? var16 : var15;
                int var18 = var2.field3544 * var17 * 2;
                if (var18 < var14) {
                    arg0.field5100 /= 2;
                } else if (var17 < (var14 / 2)) {
                    arg0.field5100 -= var2.field3544;
                    if (arg0.field5100 < 0) {
                        arg0.field5100 = 0;
                    }
                } else if (arg0.field5100 < var13) {
                    arg0.field5100 += var2.field3544;
                    if (arg0.field5100 > var13) {
                        arg0.field5100 = var13;
                    }
                }
            } else if (arg0.field5100 < var13) {
                arg0.field5100 += var2.field3544;
                if (var13 < arg0.field5100) {
                    arg0.field5100 = var13;
                }
            } else if (arg0.field5100 > 0) {
                arg0.field5100 -= var2.field3544;
                if (arg0.field5100 < 0) {
                    arg0.field5100 = 0;
                }
            }
            var12 = arg0.field5100 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        if (var6 > var4) {
            arg0.field5104 += var12;
            if (arg0.field5104 > var6) {
                arg0.field5104 = var6;
            }
        } else if (var6 < var4) {
            arg0.field5104 -= var12;
            if (var6 > arg0.field5104) {
                arg0.field5104 = var6;
            }
        }
        if (var5 < var7) {
            arg0.field5072 += var12;
            if (arg0.field5072 > var7) {
                arg0.field5072 = var7;
            }
        } else if (var7 < var5) {
            arg0.field5072 -= var12;
            if (arg0.field5072 < var7) {
                arg0.field5072 = var7;
            }
        }
        if (arg0.field5104 != var6 || arg0.field5072 != var7) {
            return;
        }
        arg0.field5061--;
        if (arg0.field5011 > 0) {
            arg0.field5011--;
            return;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
    public static final int method246(int arg0, int arg1) {
        field645++;
        if (!(arg1 < 65 || arg1 > 90) || !(arg1 < 192 || arg1 > 222 || arg1 == 215)) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else {
            if (arg0 != -1) {
                method246(112, -39);
            }
            return arg1 == 140 ? 156 : arg1;
        }
    }
}
