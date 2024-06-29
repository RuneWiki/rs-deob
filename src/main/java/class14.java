import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class14 {

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
    public static int[] field227 = new int[2500];

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field231 = 0;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "[Ljl;")
    public static class404[] field228 = new class404[6];

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
    public static int[] field229 = new int[5];

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lvq;")
    public static class24 field232 = new class24(19, 1);

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
    public static int[] field233;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZBLva;)V")
    public static final void method207(boolean arg0, byte arg1, class58 arg2) {
        field226++;
        class446 var3 = arg2.method450(0);
        if (arg2.field790 == 0) {
            class411.field5911 = -1;
            class191.field2671 = 0;
            arg2.field789 = 0;
            return;
        }
        if (arg2.field751 != -1 && arg2.field737 == 0) {
            class196 var4 = class83.method556(arg2.field751, 67);
            if (arg2.field785 > 0 && var4.field2771 == 0) {
                arg2.field789++;
                class191.field2671 = 0;
                class411.field5911 = -1;
                return;
            }
            if (arg2.field785 <= 0 && var4.field2770 == 0) {
                arg2.field789++;
                class411.field5911 = -1;
                class191.field2671 = 0;
                return;
            }
        }
        if (arg2.field781 != -1 && arg2.field753 <= class388.field5665) {
            class302 var5 = class332.method2169(256, arg2.field781);
            if (var5.field4424 && var5.field4422 != -1) {
                class196 var6 = class83.method556(var5.field4422, 67);
                if (arg2.field785 > 0 && var6.field2771 == 0) {
                    arg2.field789++;
                    class191.field2671 = 0;
                    class411.field5911 = -1;
                    return;
                }
                if (arg2.field785 <= 0 && var6.field2770 == 0) {
                    arg2.field789++;
                    class191.field2671 = 0;
                    class411.field5911 = -1;
                    return;
                }
            }
        }
        int var7 = arg2.field4954;
        int var8 = arg2.field4951;
        int var9 = arg2.field793[arg2.field790 - 1] * 128 + arg2.method446(10) * 64;
        int var10 = arg2.field784[arg2.field790 - 1] * 128 + (arg2.method446(10) * 64);
        if (var7 >= var9) {
            if (var7 > var9) {
                if (var8 < var10) {
                    arg2.method442(6144, true);
                } else if (var8 > var10) {
                    arg2.method442(2048, true);
                } else {
                    arg2.method442(4096, true);
                }
            } else if (var10 > var8) {
                arg2.method442(8192, true);
            } else if (var10 < var8) {
                arg2.method442(0, true);
            }
        } else if (var8 < var10) {
            arg2.method442(10240, true);
        } else if (var8 > var10) {
            arg2.method442(14336, true);
        } else {
            arg2.method442(12288, true);
        }
        if (arg1 != 28) {
            field232 = null;
        }
        byte var11 = arg2.field786[arg2.field790 - 1];
        if (!arg0 && (var9 - var7 > 256 || (var9 - var7) < -256 || (var10 - var8) > 256 || var10 - var8 < -256)) {
            arg2.field4954 = var9;
            arg2.field4951 = var10;
            arg2.method437(arg2.field752, 10);
            if (arg2.field785 > 0) {
                arg2.field785--;
            }
            class191.field2671 = 0;
            class411.field5911 = -1;
            arg2.field790--;
            return;
        }
        int var12 = 4;
        boolean var13 = true;
        if (arg2 instanceof class26) {
            var13 = ((class26) arg2).field369.field4849;
        }
        if (var13) {
            int var14 = arg2.field752 - arg2.field705.field3724;
            if (var14 != 0 && arg2.field709 == -1 && arg2.field769 != 0) {
                var12 = 2;
            }
            if (!arg0 && arg2.field790 > 2) {
                var12 = 6;
            }
            if (!arg0 && arg2.field790 > 3) {
                var12 = 8;
            }
        } else {
            if (!arg0 && arg2.field790 > 1) {
                var12 = 6;
            }
            if (!arg0 && arg2.field790 > 2) {
                var12 = 8;
            }
        }
        if (arg2.field789 > 0 && arg2.field790 > 1) {
            var12 = 8;
            arg2.field789--;
        }
        if (var11 == 2) {
            var12 <<= 0x1;
        } else if (var11 == 0) {
            var12 >>= 0x1;
        }
        if (var3.field6488 != -1) {
            int var15 = var12 << 7;
            if (arg2.field790 == 1) {
                int var16 = arg2.field794 * arg2.field794;
                int var17 = (arg2.field4954 <= var9 ? var9 - arg2.field4954 : arg2.field4954 - var9) << 7;
                int var18 = (arg2.field4951 <= var10 ? var10 - arg2.field4951 : -var10 + arg2.field4951) << 7;
                int var19 = var18 < var17 ? var17 : var18;
                int var20 = var19 * 2 * var3.field6488;
                if (var16 > var20) {
                    arg2.field794 /= 2;
                } else if (var19 < var16 / 2) {
                    arg2.field794 -= var3.field6488;
                    if (arg2.field794 < 0) {
                        arg2.field794 = 0;
                    }
                } else if (arg2.field794 < var15) {
                    arg2.field794 += var3.field6488;
                    if (var15 < arg2.field794) {
                        arg2.field794 = var15;
                    }
                }
            } else if (arg2.field794 < var15) {
                arg2.field794 += var3.field6488;
                if (arg2.field794 > var15) {
                    arg2.field794 = var15;
                }
            } else if (arg2.field794 > 0) {
                arg2.field794 -= var3.field6488;
                if (arg2.field794 < 0) {
                    arg2.field794 = 0;
                }
            }
            var12 = arg2.field794 >> 7;
            if (var12 < 1) {
                var12 = 1;
            }
        }
        class191.field2671 = 0;
        if (var7 < var9) {
            arg2.field4954 += var12;
            class191.field2671 |= 0x4;
            if (var9 < arg2.field4954) {
                arg2.field4954 = var9;
            }
        } else if (var7 > var9) {
            arg2.field4954 -= var12;
            class191.field2671 |= 0x8;
            if (var9 > arg2.field4954) {
                arg2.field4954 = var9;
            }
        }
        if (var10 > var8) {
            class191.field2671 |= 0x1;
            arg2.field4951 += var12;
            if (arg2.field4951 > var10) {
                arg2.field4951 = var10;
            }
        } else if (var10 < var8) {
            class191.field2671 |= 0x2;
            arg2.field4951 -= var12;
            if (arg2.field4951 < var10) {
                arg2.field4951 = var10;
            }
        }
        if (var12 < 8) {
            class411.field5911 = var11;
        } else {
            class411.field5911 = 2;
        }
        if (arg2.field4954 != var9 || arg2.field4951 != var10) {
            return;
        }
        arg2.field790--;
        if (arg2.field785 > 0) {
            arg2.field785--;
            return;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
    public static void method208(int arg0) {
        if (arg0 != 4096) {
            return;
        }
        field233 = null;
        field229 = null;
        field227 = null;
        field228 = null;
        field232 = null;
    }
}
