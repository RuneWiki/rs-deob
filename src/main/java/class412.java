import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class412 extends class385 {

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field5834;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "[[I")
    public static int[][] field5828 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "Lbd;")
    public static class44 field5831 = new class44("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "Lbd;")
    public static class44 field5835 = new class44("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "[I")
    public static int[] field5838 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "I")
    public static int field5837 = 0;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2464(String[] arg0, byte arg1) {
        int var2 = 99 % ((arg1 + 32) / 39);
        field5830++;
        String[] var3 = new String[5];
        for (int var4 = 0; var4 < 5; var4++) {
            var3[var4] = var4 + ": ";
            if (arg0 != null && arg0[var4] != null) {
                var3[var4] = var3[var4] + arg0[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(B)V")
    public static void method2465(byte arg0) {
        field5838 = null;
        field5828 = null;
        field5835 = null;
        if (arg0 == 38) {
            field5831 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)Z")
    public final boolean method2098(int arg0) {
        if (arg0 > -83) {
            return true;
        } else {
            field5839++;
            return false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)I")
    public static final int method2466(int arg0, int arg1, int arg2, int arg3) {
        field5832++;
        if ((class234.field3497[arg0][arg2][arg3] & 0x8) != 0) {
            return 0;
        } else if (arg0 <= 0 || (class234.field3497[1][arg2][arg3] & 0x2) == 0) {
            if (arg1 != 2) {
                method2464(null, (byte) -69);
            }
            return arg0;
        } else {
            return arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2097(byte arg0) {
        field5833++;
        if (arg0 <= 62) {
            this.field5834 = null;
        }
        return this.field5834;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Ltp;Ljava/lang/Object;I)V")
    public class412(class379 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5834 = arg1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Luc;ZI)V")
    public static final void method2467(class23 arg0, boolean arg1, int arg2) {
        field5829++;
        class236 var3 = arg0.method139((byte) 80);
        if (arg0.field333 == 0) {
            arg0.field336 = 0;
            class544.field7980 = -1;
            class249.field3720 = 0;
            return;
        }
        if (arg0.field274 != -1 && arg0.field261 == 0) {
            class183 var4 = class96.field1526.method2717(-100, arg0.field274);
            if (arg0.field335 > 0 && var4.field2704 == 0) {
                arg0.field336++;
                class249.field3720 = 0;
                class544.field7980 = -1;
                return;
            }
            if (arg0.field335 <= 0 && var4.field2706 == 0) {
                class249.field3720 = 0;
                arg0.field336++;
                class544.field7980 = -1;
                return;
            }
        }
        if (arg0.field286 != -1 && class24.field349 >= arg0.field289) {
            class394 var5 = class69.field1133.method1312(arg0.field286, (byte) -39);
            if (var5.field5607 && var5.field5596 != -1) {
                class183 var6 = class96.field1526.method2717(-110, var5.field5596);
                if (arg0.field335 > 0 && var6.field2704 == 0) {
                    class249.field3720 = 0;
                    class544.field7980 = -1;
                    arg0.field336++;
                    return;
                }
                if (arg0.field335 <= 0 && var6.field2706 == 0) {
                    class544.field7980 = -1;
                    class249.field3720 = 0;
                    arg0.field336++;
                    return;
                }
            }
        }
        if (arg0.field286 != -1 && arg0.field289 <= class24.field349) {
            class394 var7 = class69.field1133.method1312(arg0.field286, (byte) -39);
            if (var7.field5607 && var7.field5596 != -1) {
                class183 var8 = class96.field1526.method2717(-122, var7.field5596);
                if (arg0.field335 > 0 && var8.field2704 == 0) {
                    arg0.field336++;
                    class249.field3720 = 0;
                    class544.field7980 = -1;
                    return;
                }
                if (arg0.field335 <= 0 && var8.field2706 == 0) {
                    arg0.field336++;
                    class249.field3720 = 0;
                    class544.field7980 = -1;
                    return;
                }
            }
        }
        if (arg2 != 11906) {
            field5828 = null;
        }
        int var9 = arg0.field6961;
        int var10 = arg0.field6965;
        int var11 = arg0.field343[arg0.field333 - 1] * 128 + arg0.method135((byte) 72) * 64;
        int var12 = arg0.field344[arg0.field333 - 1] * 128 + (arg0.method135((byte) 72) * 64);
        if (var11 > var9) {
            if (var10 < var12) {
                arg0.method134((byte) -109, 10240);
            } else if (var10 > var12) {
                arg0.method134((byte) -111, 14336);
            } else {
                arg0.method134((byte) -94, 12288);
            }
        } else if (var9 > var11) {
            if (var10 < var12) {
                arg0.method134((byte) -126, 6144);
            } else if (var12 < var10) {
                arg0.method134((byte) -115, 2048);
            } else {
                arg0.method134((byte) -115, 4096);
            }
        } else if (var12 > var10) {
            arg0.method134((byte) -119, 8192);
        } else if (var12 < var10) {
            arg0.method134((byte) -101, 0);
        }
        byte var13 = arg0.field342[arg0.field333 - 1];
        if (!arg1 && (var11 - var9) > 256 || (var11 - var9) < -256 || var12 - var10 > 256 || var12 - var10 < -256) {
            arg0.field6965 = var12;
            arg0.field6961 = var11;
            arg0.method130((byte) 31, arg0.field281, false);
            class249.field3720 = 0;
            if (arg0.field335 > 0) {
                arg0.field335--;
            }
            arg0.field333--;
            class544.field7980 = -1;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg0 instanceof class279) {
            var15 = ((class279) arg0).field4157.field4610;
        }
        if (var15) {
            int var16 = arg0.field281 - arg0.field318.field1402;
            if (var16 != 0 && arg0.field260 == -1 && arg0.field305 != 0) {
                var14 = 2;
            }
            if (!arg1 && arg0.field333 > 2) {
                var14 = 6;
            }
            if (!arg1 && arg0.field333 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg1 && arg0.field333 > 1) {
                var14 = 6;
            }
            if (!arg1 && arg0.field333 > 2) {
                var14 = 8;
            }
        }
        if (arg0.field336 > 0 && arg0.field333 > 1) {
            arg0.field336--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        class249.field3720 = 0;
        if (var3.field3536 != -1) {
            int var17 = var14 << 7;
            if (arg0.field333 == 1) {
                int var18 = arg0.field340 * arg0.field340;
                int var19 = (var11 < arg0.field6961 ? arg0.field6961 - var11 : -arg0.field6961 + var11) << 7;
                int var20 = (var12 < arg0.field6965 ? arg0.field6965 - var12 : -arg0.field6965 + var12) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field3536 * 2 * var21;
                if (var18 > var22) {
                    arg0.field340 /= 2;
                } else if (var18 / 2 > var21) {
                    arg0.field340 -= var3.field3536;
                    if (arg0.field340 < 0) {
                        arg0.field340 = 0;
                    }
                } else if (arg0.field340 < var17) {
                    arg0.field340 += var3.field3536;
                    if (arg0.field340 > var17) {
                        arg0.field340 = var17;
                    }
                }
            } else if (var17 > arg0.field340) {
                arg0.field340 += var3.field3536;
                if (arg0.field340 > var17) {
                    arg0.field340 = var17;
                }
            } else if (arg0.field340 > 0) {
                arg0.field340 -= var3.field3536;
                if (arg0.field340 < 0) {
                    arg0.field340 = 0;
                }
            }
            var14 = arg0.field340 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        if (var9 == var11 && var10 == var12) {
            class544.field7980 = -1;
        } else {
            if (var11 > var9) {
                class249.field3720 |= 0x4;
                arg0.field6961 += var14;
                if (arg0.field6961 > var11) {
                    arg0.field6961 = var11;
                }
            } else if (var11 < var9) {
                class249.field3720 |= 0x8;
                arg0.field6961 -= var14;
                if (var11 > arg0.field6961) {
                    arg0.field6961 = var11;
                }
            }
            if (var12 > var10) {
                class249.field3720 |= 0x1;
                arg0.field6965 += var14;
                if (var12 < arg0.field6965) {
                    arg0.field6965 = var12;
                }
            } else if (var10 > var12) {
                arg0.field6965 -= var14;
                class249.field3720 |= 0x2;
                if (var12 > arg0.field6965) {
                    arg0.field6965 = var12;
                }
            }
            if (var14 < 8) {
                class544.field7980 = var13;
            } else {
                class544.field7980 = 2;
            }
        }
        if (arg0.field6961 == var11 && arg0.field6965 == var12) {
            if (arg0.field335 > 0) {
                arg0.field335--;
            }
            arg0.field333--;
        }
    }
}
