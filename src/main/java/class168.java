import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class168 extends class337 {

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "Llt;")
    public static class475 field2494;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field2490;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "Lvg;")
    public class38 field2488;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lvg;")
    public class38 field2491;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Ljava/lang/String;")
    public String field2479;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "Z")
    public boolean field2482;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field2484;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "[[[I")
    public static int[][][] field2493;

    static {
        new class475("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        new class475("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        field2494 = new class475("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZLme;B)V", line = 12)
    public static final void method1166(boolean arg0, class129 arg1, byte arg2) {
        field2480++;
        class82 var3 = arg1.method845(0);
        if (arg1.field2000 == 0) {
            class308.field4439 = -1;
            class348.field5014 = 0;
            arg1.field1998 = 0;
            return;
        }
        if (arg1.field1950 != -1 && arg1.field1936 == 0) {
            class329 var4 = class84.field1295.method1182(arg1.field1950, 8);
            if (arg1.field1999 > 0 && var4.field4677 == 0) {
                class308.field4439 = -1;
                arg1.field1998++;
                class348.field5014 = 0;
                return;
            }
            if (arg1.field1999 <= 0 && var4.field4676 == 0) {
                class348.field5014 = 0;
                arg1.field1998++;
                class308.field4439 = -1;
                return;
            }
        }
        if (arg1.field1906 != -1 && arg1.field1908 <= class317.field4559) {
            class104 var5 = class512.field7494.method2732(44, arg1.field1906);
            if (var5.field1499 && var5.field1505 != -1) {
                class329 var6 = class84.field1295.method1182(var5.field1505, 8);
                if (arg1.field1999 > 0 && var6.field4677 == 0) {
                    class348.field5014 = 0;
                    class308.field4439 = -1;
                    arg1.field1998++;
                    return;
                }
                if (arg1.field1999 <= 0 && var6.field4676 == 0) {
                    arg1.field1998++;
                    class308.field4439 = -1;
                    class348.field5014 = 0;
                    return;
                }
            }
        }
        if (arg1.field1906 != -1 && class317.field4559 >= arg1.field1908) {
            class104 var7 = class512.field7494.method2732(42, arg1.field1906);
            if (var7.field1499 && var7.field1505 != -1) {
                class329 var8 = class84.field1295.method1182(var7.field1505, 8);
                if (arg1.field1999 > 0 && var8.field4677 == 0) {
                    arg1.field1998++;
                    class348.field5014 = 0;
                    class308.field4439 = -1;
                    return;
                }
                if (arg1.field1999 <= 0 && var8.field4676 == 0) {
                    arg1.field1998++;
                    class348.field5014 = 0;
                    class308.field4439 = -1;
                    return;
                }
            }
        }
        int var9 = arg1.field1763;
        int var10 = arg1.field1769;
        int var11 = arg1.field1997[arg1.field2000 - 1] * 128 + arg1.method847(-1) * 64;
        int var12 = arg1.field1996[arg1.field2000 - 1] * 128 + (arg1.method847(-1) * 64);
        if (arg2 < 76) {
            field2493 = null;
        }
        if (var9 < var11) {
            if (var12 > var10) {
                arg1.method854(10240, 0);
            } else if (var12 < var10) {
                arg1.method854(14336, 0);
            } else {
                arg1.method854(12288, 0);
            }
        } else if (var11 < var9) {
            if (var10 < var12) {
                arg1.method854(6144, 0);
            } else if (var12 >= var10) {
                arg1.method854(4096, 0);
            } else {
                arg1.method854(2048, 0);
            }
        } else if (var10 < var12) {
            arg1.method854(8192, 0);
        } else if (var10 > var12) {
            arg1.method854(0, 0);
        }
        byte var13 = arg1.field2003[arg1.field2000 - 1];
        if (!arg0 && (var11 - var9 > 256 || var11 - var9 < -256 || (var12 - var10) > 256 || var12 - var10 < -256)) {
            arg1.field1769 = var12;
            arg1.field1763 = var11;
            arg1.method855(arg1.field1902, 2);
            arg1.field2000--;
            class308.field4439 = -1;
            class348.field5014 = 0;
            if (arg1.field1999 > 0) {
                arg1.field1999--;
            }
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg1 instanceof class167) {
            var15 = ((class167) arg1).field2472.field4871;
        }
        if (var15) {
            int var16 = arg1.field1902 - arg1.field1945.field1724;
            if (var16 != 0 && arg1.field1904 == -1 && arg1.field1986 != 0) {
                var14 = 2;
            }
            if (!arg0 && arg1.field2000 > 2) {
                var14 = 6;
            }
            if (!arg0 && arg1.field2000 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg0 && arg1.field2000 > 1) {
                var14 = 6;
            }
            if (!arg0 && arg1.field2000 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field1998 > 0 && arg1.field2000 > 1) {
            var14 = 8;
            arg1.field1998--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field1251 != -1) {
            int var17 = var14 << 7;
            if (arg1.field2000 == 1) {
                int var18 = arg1.field1995 * arg1.field1995;
                int var19 = (arg1.field1763 <= var11 ? var11 - arg1.field1763 : -var11 + arg1.field1763) << 7;
                int var20 = (arg1.field1769 <= var12 ? var12 - arg1.field1769 : arg1.field1769 - var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field1251 * 2 * var21;
                if (var18 > var22) {
                    arg1.field1995 /= 2;
                } else if (var18 / 2 > var21) {
                    arg1.field1995 -= var3.field1251;
                    if (arg1.field1995 < 0) {
                        arg1.field1995 = 0;
                    }
                } else if (var17 > arg1.field1995) {
                    arg1.field1995 += var3.field1251;
                    if (var17 < arg1.field1995) {
                        arg1.field1995 = var17;
                    }
                }
            } else if (arg1.field1995 < var17) {
                arg1.field1995 += var3.field1251;
                if (var17 < arg1.field1995) {
                    arg1.field1995 = var17;
                }
            } else if (arg1.field1995 > 0) {
                arg1.field1995 -= var3.field1251;
                if (arg1.field1995 < 0) {
                    arg1.field1995 = 0;
                }
            }
            var14 = arg1.field1995 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class348.field5014 = 0;
        if (var11 > var9) {
            class348.field5014 |= 0x4;
            arg1.field1763 += var14;
            if (arg1.field1763 > var11) {
                arg1.field1763 = var11;
            }
        } else if (var9 > var11) {
            class348.field5014 |= 0x8;
            arg1.field1763 -= var14;
            if (arg1.field1763 < var11) {
                arg1.field1763 = var11;
            }
        }
        if (var10 < var12) {
            arg1.field1769 += var14;
            class348.field5014 |= 0x1;
            if (var12 < arg1.field1769) {
                arg1.field1769 = var12;
            }
        } else if (var10 > var12) {
            arg1.field1769 -= var14;
            class348.field5014 |= 0x2;
            if (var12 > arg1.field1769) {
                arg1.field1769 = var12;
            }
        }
        if (arg1.field1763 == var11 && arg1.field1769 == var12) {
            if (arg1.field1999 > 0) {
                arg1.field1999--;
            }
            arg1.field2000--;
        }
        if (var14 < 8) {
            class308.field4439 = var13;
        } else {
            class308.field4439 = 2;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 363)
    public static final void method1167(int arg0) {
        field2483++;
        if (class263.field3858 != null) {
            return;
        }
        class263.field3858 = new int[65536];
        int var1 = 27 % ((arg0 - 39) / 63);
        double var2 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        int var4 = 0;
        for (int var5 = 0; var5 < 512; var5++) {
            float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var7 = (float) (var5 & 0x7) / 8.0F + 0.0625F;
            for (int var8 = 0; var8 < 128; var8++) {
                float var9 = (float) var8 / 128.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = 0.0F;
                float var13 = var6 / 60.0F;
                int var14 = (int) var13;
                int var15 = var14 % 6;
                float var16 = var13 - (float) var14;
                float var17 = (1.0F - var7) * var9;
                float var18 = (1.0F - (var7 * var16)) * var9;
                float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                if (var15 == 0) {
                    var12 = var17;
                    var11 = var19;
                    var10 = var9;
                } else if (var15 == 1) {
                    var12 = var17;
                    var11 = var9;
                    var10 = var18;
                } else if (var15 == 2) {
                    var12 = var19;
                    var11 = var9;
                    var10 = var17;
                } else if (var15 == 3) {
                    var12 = var9;
                    var11 = var18;
                    var10 = var17;
                } else if (var15 == 4) {
                    var10 = var19;
                    var12 = var9;
                    var11 = var17;
                } else if (var15 == 5) {
                    var10 = var9;
                    var11 = var17;
                    var12 = var18;
                }
                float var20 = (float) Math.pow((double) var10, var2);
                float var21 = (float) Math.pow((double) var11, var2);
                float var22 = (float) Math.pow((double) var12, var2);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (int) (var22 * 256.0F);
                int var26 = (var23 << 16) + ((var24 << 8) - 16777216) + var25;
                class263.field3858[var4++] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)V", line = 491)
    public static void method1168(int arg0) {
        field2494 = null;
        field2493 = null;
        if (arg0 != -3078) {
            method1166(true, null, (byte) 28);
        }
    }
}
