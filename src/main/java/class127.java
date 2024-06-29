import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class127 {

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field1543;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lgj;")
    public static class381 field1545;

    static {
        new class362("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
        field1543 = new int[32];
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1543[var1] = var0 - 1;
            var0 += var0;
        }
        field1544 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 6)
    public static void method789(boolean arg0) {
        field1545 = null;
        if (arg0) {
            field1543 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V", line = 23)
    public static final void method790(int arg0) {
        field1538++;
        class216.field3049 = new class99(8);
        class82.field952 = arg0;
        for (class209 var1 = (class209) class257.field3687.method2509((byte) 51); var1 != null; var1 = (class209) class257.field3687.method2515(0)) {
            var1.method1361();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZLfj;Z)V", line = 44)
    public static final void method791(boolean arg0, class396 arg1, boolean arg2) {
        field1540++;
        class306 var3 = arg1.method2526(4);
        if (arg1.field5674 == 0) {
            class295.field4114 = -1;
            arg1.field5666 = 0;
            class39.field445 = 0;
            return;
        }
        if (arg1.field5612 != -1 && arg1.field5638 == 0) {
            class412 var4 = class189.method1288(-8192, arg1.field5612);
            if (arg1.field5667 > 0 && var4.field5934 == 0) {
                class295.field4114 = -1;
                class39.field445 = 0;
                arg1.field5666++;
                return;
            }
            if (arg1.field5667 <= 0 && var4.field5920 == 0) {
                class39.field445 = 0;
                class295.field4114 = -1;
                arg1.field5666++;
                return;
            }
        }
        if (arg1.field5611 != -1 && arg1.field5650 <= class189.field2726) {
            class97 var5 = class434.method2721(arg1.field5611, 4096);
            if (var5.field1158 && var5.field1166 != -1) {
                class412 var6 = class189.method1288(-8192, var5.field1166);
                if (arg1.field5667 > 0 && var6.field5934 == 0) {
                    class295.field4114 = -1;
                    class39.field445 = 0;
                    arg1.field5666++;
                    return;
                }
                if (arg1.field5667 <= 0 && var6.field5920 == 0) {
                    class295.field4114 = -1;
                    arg1.field5666++;
                    class39.field445 = 0;
                    return;
                }
            }
        }
        int var7 = arg1.field3284;
        int var8 = arg1.field3269;
        int var9 = arg1.field5677[arg1.field5674 - 1] * 128 + arg1.method242(-30129) * 64;
        int var10 = arg1.field5664[arg1.field5674 - 1] * 128 + arg1.method242(-30129) * 64;
        if (!arg2 && var9 - var7 > 256 || (var9 - var7) < -256 || var10 - var8 > 256 || (var10 - var8) < -256) {
            class295.field4114 = -1;
            arg1.field3284 = var9;
            class39.field445 = 0;
            arg1.field3269 = var10;
            return;
        }
        if (var9 <= var7) {
            if (var9 < var7) {
                if (var10 > var8) {
                    arg1.method2527(6144, -92);
                } else if (var8 <= var10) {
                    arg1.method2527(4096, -44);
                } else {
                    arg1.method2527(2048, -65);
                }
            } else if (var10 > var8) {
                arg1.method2527(8192, -108);
            } else if (var8 > var10) {
                arg1.method2527(0, -100);
            }
        } else if (var8 < var10) {
            arg1.method2527(10240, -51);
        } else if (var8 > var10) {
            arg1.method2527(14336, -101);
        } else {
            arg1.method2527(12288, -98);
        }
        int var11 = 4;
        boolean var12 = arg0;
        if (arg1 instanceof class77) {
            var12 = ((class77) arg1).field912.field1681;
        }
        if (var12) {
            int var13 = arg1.field5646 - arg1.field5602.field4806;
            if (var13 != 0 && arg1.field5574 == -1 && arg1.field5577 != 0) {
                var11 = 2;
            }
            if (!arg2 && arg1.field5674 > 2) {
                var11 = 6;
            }
            if (!arg2 && arg1.field5674 > 3) {
                var11 = 8;
            }
        } else {
            if (!arg2 && arg1.field5674 > 1) {
                var11 = 6;
            }
            if (!arg2 && arg1.field5674 > 2) {
                var11 = 8;
            }
        }
        if (arg1.field5666 > 0 && arg1.field5674 > 1) {
            var11 = 8;
            arg1.field5666--;
        }
        byte var14 = arg1.field5668[arg1.field5674 - 1];
        if (var14 == 2) {
            var11 <<= 0x1;
        } else if (var14 == 0) {
            var11 >>= 0x1;
        }
        class39.field445 = 0;
        if (var3.field4296 != -1) {
            int var15 = var11 << 7;
            if (arg1.field5674 == 1) {
                int var16 = arg1.field5670 * arg1.field5670;
                int var17 = (arg1.field3284 <= var9 ? var9 - arg1.field3284 : -var9 + arg1.field3284) << 7;
                int var18 = (arg1.field3269 <= var10 ? var10 - arg1.field3269 : -var10 + arg1.field3269) << 7;
                int var19 = var18 >= var17 ? var18 : var17;
                int var20 = var3.field4296 * 2 * var19;
                if (var20 < var16) {
                    arg1.field5670 /= 2;
                } else if (var19 < (var16 / 2)) {
                    arg1.field5670 -= var3.field4296;
                    if (arg1.field5670 < 0) {
                        arg1.field5670 = 0;
                    }
                } else if (arg1.field5670 < var15) {
                    arg1.field5670 += var3.field4296;
                    if (arg1.field5670 > var15) {
                        arg1.field5670 = var15;
                    }
                }
            } else if (arg1.field5670 < var15) {
                arg1.field5670 += var3.field4296;
                if (var15 < arg1.field5670) {
                    arg1.field5670 = var15;
                }
            } else if (arg1.field5670 > 0) {
                arg1.field5670 -= var3.field4296;
                if (arg1.field5670 < 0) {
                    arg1.field5670 = 0;
                }
            }
            var11 = arg1.field5670 >> 7;
            if (var11 < 1) {
                var11 = 1;
            }
        }
        if (var9 > var7) {
            class39.field445 |= 0x4;
            arg1.field3284 += var11;
            if (arg1.field3284 > var9) {
                arg1.field3284 = var9;
            }
        } else if (var7 > var9) {
            arg1.field3284 -= var11;
            class39.field445 |= 0x8;
            if (arg1.field3284 < var9) {
                arg1.field3284 = var9;
            }
        }
        if (var8 < var10) {
            arg1.field3269 += var11;
            class39.field445 |= 0x1;
            if (arg1.field3269 > var10) {
                arg1.field3269 = var10;
            }
        } else if (var10 < var8) {
            arg1.field3269 -= var11;
            class39.field445 |= 0x2;
            if (var10 > arg1.field3269) {
                arg1.field3269 = var10;
            }
        }
        if (arg1.field3284 == var9 && arg1.field3269 == var10) {
            if (arg1.field5667 > 0) {
                arg1.field5667--;
            }
            arg1.field5674--;
        }
        if (var11 < 8) {
            class295.field4114 = var14;
        } else {
            class295.field4114 = 2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V", line = 346)
    public static final void method792(int arg0, boolean arg1) {
        if (arg1) {
            method792(-51, true);
        }
        field1542++;
        for (class406 var2 = class322.field4588.method1884(0); var2 != null; var2 = class322.field4588.method1890(-1)) {
            if ((long) arg0 == (var2.field5855 >> 48 & 0xFFFFL)) {
                var2.method2594((byte) -22);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z", line = 369)
    public final boolean method793(int arg0) {
        field1539++;
        int var2 = -102 / ((arg0 - 52) / 33);
        return this.method32(false) || this.method23(-30204) || this.method24(0);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V")
    public abstract void method33(int arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Z")
    public abstract boolean method23(int arg0);

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z")
    public abstract boolean method24(int arg0);

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
    public abstract int method17(int arg0);

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)I")
    public abstract int method18(int arg0);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)Z")
    public abstract boolean method32(boolean arg0);

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)Lka;")
    public abstract class276 method28(int arg0);

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
    public abstract void method19(int arg0);
}
