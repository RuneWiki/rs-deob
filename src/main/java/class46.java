import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class46 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lhp;")
    private class277 field492 = new class277(64);

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "Lkea;")
    private class203 field496;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Lkea;")
    private class203 field495;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Lkr;")
    public static class645 field498 = new class645(5000);

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field499 = 0;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "Lea;")
    public static class474 field500 = new class474("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "[J")
    public static long[] field493;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method244(int arg0) {
        field500 = null;
        if (arg0 == -7831) {
            field493 = null;
            field498 = null;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ltt;I)I")
    public static final int method245(class78 arg0, int arg1) {
        field497++;
        class566 var2 = arg0.field864;
        int var3 = 12 / ((arg1 + 46) / 63);
        if (var2.field8121 != null) {
            var2 = var2.method3287(114, class23.field243);
            if (var2 == null) {
                return -1;
            }
        }
        int var4 = var2.field8112;
        class154 var5 = arg0.method1158((byte) 62);
        if (arg0.field2432) {
            var4 = var2.field8090;
        } else if (arg0.field2434 == var5.field1905 || arg0.field2434 == var5.field1881 || arg0.field2434 == var5.field1896 || arg0.field2434 == var5.field1910) {
            var4 = var2.field8119;
        } else if (arg0.field2434 == var5.field1886 || arg0.field2434 == var5.field1876 || arg0.field2434 == var5.field1872 || arg0.field2434 == var5.field1888) {
            var4 = var2.field8133;
        }
        return var4;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lca;")
    public final class258 method246(int arg0, int arg1) {
        field491++;
        class258 var3 = (class258) this.field492.method1801(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field496.method1286(arg0 & 0x7FFF, 0, (byte) -49);
        } else {
            var4 = this.field495.method1286(arg0, 0, (byte) -49);
        }
        class258 var5 = new class258();
        if (arg1 != -27016) {
            this.method246(-4, -27);
        }
        if (var4 != null) {
            var5.method1719(new class194(var4), arg1 + 27016);
        }
        if (arg0 >= 32768) {
            var5.method1720(114);
        }
        this.field492.method1808((long) arg0, var5, (byte) -9);
        return var5;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(ILkea;Lkea;)V")
    public class46(int arg0, class203 arg1, class203 arg2) {
        this.field496 = arg2;
        this.field495 = arg1;
        if (this.field495 != null) {
            this.field495.method1309(1675886592, 0);
        }
        if (this.field496 != null) {
            this.field496.method1309(1675886592, 0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLqb;)V")
    public static final void method247(int arg0, boolean arg1, class191 arg2) {
        field494++;
        class154 var3 = arg2.method1158((byte) 8);
        if (arg2.field2517 == 0) {
            class248.field3528 = 0;
            arg2.field2516 = 0;
            class119.field1501 = -1;
            return;
        }
        if (arg2.field2502 != -1 && arg2.field2482 == 0) {
            class177 var4 = class259.field3686.method2961(arg2.field2502, 8);
            if (arg2.field2519 > 0 && var4.field2169 == 0) {
                arg2.field2516++;
                class119.field1501 = -1;
                class248.field3528 = 0;
                return;
            }
            if (arg2.field2519 <= 0 && var4.field2155 == 0) {
                class119.field1501 = -1;
                arg2.field2516++;
                class248.field3528 = 0;
                return;
            }
        }
        if (arg2.field2472 != -1 && class287.field3982 >= arg2.field2437) {
            class576 var5 = class141.field1735.method3667(false, arg2.field2472);
            if (var5.field8328 && var5.field8318 != -1) {
                class177 var6 = class259.field3686.method2961(var5.field8318, 8);
                if (arg2.field2519 > 0 && var6.field2169 == 0) {
                    arg2.field2516++;
                    class119.field1501 = -1;
                    class248.field3528 = 0;
                    return;
                }
                if (arg2.field2519 <= 0 && var6.field2155 == 0) {
                    arg2.field2516++;
                    class119.field1501 = -1;
                    class248.field3528 = 0;
                    return;
                }
            }
        }
        if (arg2.field2472 != -1 && class287.field3982 >= arg2.field2437) {
            class576 var7 = class141.field1735.method3667(false, arg2.field2472);
            if (var7.field8328 && var7.field8318 != -1) {
                class177 var8 = class259.field3686.method2961(var7.field8318, 8);
                if (arg2.field2519 > 0 && var8.field2169 == 0) {
                    class248.field3528 = 0;
                    arg2.field2516++;
                    class119.field1501 = -1;
                    return;
                }
                if (arg2.field2519 <= 0 && var8.field2155 == 0) {
                    arg2.field2516++;
                    class248.field3528 = 0;
                    class119.field1501 = -1;
                    return;
                }
            }
        }
        int var9 = arg2.field1764;
        int var10 = arg2.field1768;
        int var11 = arg2.field2515[arg2.field2517 - 1] * 512 + arg2.method1153(true) * 256;
        int var12 = arg2.field2524[arg2.field2517 - 1] * 512 + arg2.method1153(true) * 256;
        if (var9 < var11) {
            if (var12 > var10) {
                arg2.method1155(10240, (byte) 79);
            } else if (var10 <= var12) {
                arg2.method1155(12288, (byte) 79);
            } else {
                arg2.method1155(14336, (byte) 79);
            }
        } else if (var9 > var11) {
            if (var12 > var10) {
                arg2.method1155(6144, (byte) 79);
            } else if (var10 <= var12) {
                arg2.method1155(4096, (byte) 79);
            } else {
                arg2.method1155(2048, (byte) 79);
            }
        } else if (var10 < var12) {
            arg2.method1155(8192, (byte) 79);
        } else if (var10 > var12) {
            arg2.method1155(0, (byte) 79);
        }
        byte var13 = arg2.field2525[arg2.field2517 - 1];
        if (!arg1 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || var12 - var10 < -1024) {
            arg2.field1768 = var12;
            arg2.field1764 = var11;
            arg2.method1149(arg2.field2444, 100, false);
            class119.field1501 = -1;
            arg2.field2517--;
            if (arg2.field2519 > 0) {
                arg2.field2519--;
            }
            class248.field3528 = 0;
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class78) {
            var15 = ((class78) arg2).field864.field8095;
        }
        if (var15) {
            int var16 = arg2.field2444 - arg2.field2501.field1811;
            if (var16 != 0 && arg2.field2469 == -1 && arg2.field2505 != 0) {
                var14 = 8;
            }
            if (!arg1 && arg2.field2517 > 2) {
                var14 = 24;
            }
            if (!arg1 && arg2.field2517 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg1 && arg2.field2517 > 1) {
                var14 = 24;
            }
            if (!arg1 && arg2.field2517 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field2516 > 0 && arg2.field2517 > 1) {
            arg2.field2516--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field1900 != -1) {
            int var17 = var14 << 9;
            if (arg2.field2517 == 1) {
                int var18 = arg2.field2520 * arg2.field2520;
                int var19 = (var11 >= arg2.field1764 ? var11 - arg2.field1764 : -var11 + arg2.field1764) << 9;
                int var20 = (var12 < arg2.field1768 ? arg2.field1768 - var12 : -arg2.field1768 + var12) << 9;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field1900 * 2 * var21;
                if (var22 < var18) {
                    arg2.field2520 /= 2;
                } else if (var18 / 2 > var21) {
                    arg2.field2520 -= var3.field1900;
                    if (arg2.field2520 < 0) {
                        arg2.field2520 = 0;
                    }
                } else if (arg2.field2520 < var17) {
                    arg2.field2520 += var3.field1900;
                    if (var17 < arg2.field2520) {
                        arg2.field2520 = var17;
                    }
                }
            } else if (var17 > arg2.field2520) {
                arg2.field2520 += var3.field1900;
                if (var17 < arg2.field2520) {
                    arg2.field2520 = var17;
                }
            } else if (arg2.field2520 > 0) {
                arg2.field2520 -= var3.field1900;
                if (arg2.field2520 < 0) {
                    arg2.field2520 = 0;
                }
            }
            var14 = arg2.field2520 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class248.field3528 = arg0;
        if (var9 == var11 && var10 == var12) {
            class119.field1501 = -1;
        } else {
            if (var11 > var9) {
                class248.field3528 |= 0x4;
                arg2.field1764 += var14;
                if (arg2.field1764 > var11) {
                    arg2.field1764 = var11;
                }
            } else if (var9 > var11) {
                arg2.field1764 -= var14;
                class248.field3528 |= 0x8;
                if (arg2.field1764 < var11) {
                    arg2.field1764 = var11;
                }
            }
            if (var10 < var12) {
                class248.field3528 |= 0x1;
                arg2.field1768 += var14;
                if (var12 < arg2.field1768) {
                    arg2.field1768 = var12;
                }
            } else if (var10 > var12) {
                arg2.field1768 -= var14;
                class248.field3528 |= 0x2;
                if (var12 > arg2.field1768) {
                    arg2.field1768 = var12;
                }
            }
            if (var14 < 32) {
                class119.field1501 = var13;
            } else {
                class119.field1501 = 2;
            }
        }
        if (arg2.field1764 == var11 && arg2.field1768 == var12) {
            if (arg2.field2519 > 0) {
                arg2.field2519--;
            }
            arg2.field2517--;
        }
    }

    static {
        new class474("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }
}
