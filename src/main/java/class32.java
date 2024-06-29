import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class32 {

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "[[I")
    public int[][] field460;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field441 = -1;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "Lce;")
    private static class126 field466 = class206.method1445(-7923, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "Lce;")
    public static class126 field462 = field466;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Lml;")
    public static class160 field457 = new class160(32);

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "Z")
    public static boolean field472 = true;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "I")
    public static int field471 = -1;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "Lce;")
    public static class126 field474 = class206.method1445(-7923, "b12_full");

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Laf;")
    public static class181 field473 = new class181();

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "Lce;")
    private static class126 field476 = class206.method1445(-7923, "Loaded world list data");

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "Lce;")
    public static class126 field475 = field476;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Ld;")
    public static class60 field470;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "[I")
    public static int[] field464;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method153(boolean arg0, int arg1) {
        field467++;
        if (arg1 <= 94) {
            method153(false, 103);
        }
        byte[][] var2;
        if (class56.field846 && arg0) {
            var2 = class69.field1132;
        } else {
            var2 = class322.field5502;
        }
        int var3 = class128.field2200.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class148.field2732[var4] >> 8) * 64 - class58.field914;
                int var7 = (class148.field2732[var4] & 0xFF) * 64 - class138.field2473;
                class181.method1294(true);
                class219.method1499(var7, arg0, class94.field1475, var6, var5, 2);
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZIIIIIIII)Z", line = 43)
    private final boolean method154(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field442++;
        int var11 = arg8 + arg9;
        int var12 = arg0 + arg6;
        int var13 = arg2 + arg4;
        int var14 = arg7 + arg3;
        if (arg0 <= arg8 && arg8 < var12) {
            if (arg4 == var14 && (arg5 & 0x4) == 0) {
                int var15 = arg8;
                int var16 = var11 <= var12 ? var11 : var12;
                while (var16 > var15) {
                    if ((this.field460[var15 - this.field445][var14 - this.field452 - 1] & 0x2) == 0) {
                        return true;
                    }
                    var15++;
                }
            } else if (arg7 == var13 && (arg5 & 0x1) == 0) {
                int var17 = var11 <= var12 ? var11 : var12;
                for (int var18 = arg8; var18 < var17; var18++) {
                    if ((this.field460[var18 - this.field445][arg7 - this.field452] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg0 < var11 && var12 >= var11) {
            if (arg4 == var14 && (arg5 & 0x4) == 0) {
                for (int var19 = arg0; var19 < var11; var19++) {
                    if ((this.field460[var19 - this.field445][var14 - this.field452 - 1] & 0x2) == 0) {
                        return true;
                    }
                }
            } else if (arg7 == var13 && (arg5 & 0x1) == 0) {
                for (int var20 = arg0; var20 < var11; var20++) {
                    if ((this.field460[var20 - this.field445][arg7 - this.field452] & 0x20) == 0) {
                        return true;
                    }
                }
            }
        } else if (arg4 <= arg7 && arg7 < var13) {
            if (arg0 == var11 && (arg5 & 0x8) == 0) {
                int var21 = var13 >= var14 ? var14 : var13;
                for (int var22 = arg7; var22 < var21; var22++) {
                    if ((this.field460[var11 - this.field445 - 1][var22 - this.field452] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg5 & 0x2) == 0) {
                int var23 = arg7;
                int var24 = var14 > var13 ? var13 : var14;
                while (var24 > var23) {
                    if ((this.field460[arg8 - this.field445][var23 - this.field452] & 0x80) == 0) {
                        return true;
                    }
                    var23++;
                }
            }
        } else if (arg4 < var14 && var13 >= var14) {
            if (arg0 == var11 && (arg5 & 0x8) == 0) {
                for (int var25 = arg4; var25 < var14; var25++) {
                    if ((this.field460[var11 - this.field445 - 1][var25 - this.field452] & 0x8) == 0) {
                        return true;
                    }
                }
            } else if (arg8 == var12 && (arg5 & 0x2) == 0) {
                for (int var26 = arg4; var26 < var14; var26++) {
                    if ((this.field460[arg8 - this.field445][var26 - this.field452] & 0x80) == 0) {
                        return true;
                    }
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIII)Z", line = 205)
    public final boolean method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field461++;
        if (arg4 == 1) {
            if (arg2 == arg6 && arg3 == arg7) {
                return true;
            }
        } else if (arg6 <= arg2 && (arg6 - (1 - arg4)) >= arg2 && arg3 <= arg3 && (arg4 + arg3 - 1) >= arg3) {
            return true;
        }
        int var9 = arg3 - this.field452;
        if (arg0 >= -114) {
            method162(127);
        }
        int var10 = arg2 - this.field445;
        int var11 = arg6 - this.field445;
        int var12 = arg7 - this.field452;
        if (arg4 == 1) {
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field460[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field460[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field460[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field460[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field460[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field460[var11][var12] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field460[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field460[var11][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field460[var11][var12] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var10 == var11 && (var9 + 1) == var12 && (this.field460[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field460[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field460[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field460[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var11 + arg4 - 1;
            int var14 = arg4 + var12 - 1;
            if (arg5 == 0) {
                if (arg1 == 0) {
                    if ((var10 - arg4) == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field460[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg4 == var12 && (this.field460[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if ((var10 - arg4) == var11 && var9 >= var12 && var9 <= var14 && (this.field460[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field460[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field460[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 - arg4) == var12 && (this.field460[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg4) == var12) {
                        return true;
                    }
                    if ((var10 - arg4) == var11 && var12 <= var9 && var14 >= var9 && (this.field460[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field460[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 2) {
                if (arg1 == 0) {
                    if ((var10 - arg4) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var12 <= var9 && var9 <= var14 && (this.field460[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 - arg4 == var12 && (this.field460[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 1) {
                    if ((var10 - arg4) == var11 && var12 <= var9 && var14 >= var9 && (this.field460[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg4) == var12 && (this.field460[var10][var14] & 0x12C0102) == 0) {
                        return true;
                    }
                } else if (arg1 == 2) {
                    if (var10 - arg4 == var11 && var9 >= var12 && var14 >= var9 && (this.field460[var13][var9] & 0x12C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 + 1 == var12 && (this.field460[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg4) == var12) {
                        return true;
                    }
                } else if (arg1 == 3) {
                    if ((var10 - arg4) == var11 && var12 <= var9 && var14 >= var9) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12 && (this.field460[var10][var12] & 0x12C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var12 <= var9 && var14 >= var9 && (this.field460[var11][var9] & 0x12C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && var9 - arg4 == var12) {
                        return true;
                    }
                }
            }
            if (arg5 == 9) {
                if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12 && (this.field460[var10][var12] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && var9 - arg4 == var12 && (this.field460[var10][var14] & 0x12C0102) == 0) {
                    return true;
                }
                if (var10 - arg4 == var11 && var9 >= var12 && var9 <= var14 && (this.field460[var13][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field460[var11][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIIIII)V", line = 570)
    public final void method156(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 - this.field445;
        int var8 = arg1 - this.field452;
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method157(1024, var8, 128, var7);
                this.method157(arg3 ^ 0x428, var8, 8, var7 - 1);
            }
            if (arg5 == 1) {
                this.method157(1024, var8, 2, var7);
                this.method157(1024, var8 + 1, 32, var7);
            }
            if (arg5 == 2) {
                this.method157(1024, var8, 8, var7);
                this.method157(arg3 ^ 0x428, var8, 128, var7 + 1);
            }
            if (arg5 == 3) {
                this.method157(1024, var8, 32, var7);
                this.method157(1024, var8 - 1, 2, var7);
            }
        }
        field458++;
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method157(1024, var8, 1, var7);
                this.method157(1024, var8 + 1, 16, var7 - 1);
            }
            if (arg5 == 1) {
                this.method157(arg3 + 984, var8, 4, var7);
                this.method157(1024, var8 + 1, 64, var7 + 1);
            }
            if (arg5 == 2) {
                this.method157(1024, var8, 16, var7);
                this.method157(1024, var8 - 1, 1, var7 + 1);
            }
            if (arg5 == 3) {
                this.method157(1024, var8, 64, var7);
                this.method157(1024, var8 - 1, 4, var7 - 1);
            }
        }
        if (arg2 == 2) {
            if (arg5 == 0) {
                this.method157(1024, var8, 130, var7);
                this.method157(1024, var8, 8, var7 - 1);
                this.method157(arg3 + 984, var8 + 1, 32, var7);
            }
            if (arg5 == 1) {
                this.method157(1024, var8, 10, var7);
                this.method157(1024, var8 + 1, 32, var7);
                this.method157(1024, var8, 128, var7 + 1);
            }
            if (arg5 == 2) {
                this.method157(1024, var8, 40, var7);
                this.method157(1024, var8, 128, var7 + 1);
                this.method157(1024, var8 - 1, 2, var7);
            }
            if (arg5 == 3) {
                this.method157(arg3 + 984, var8, 160, var7);
                this.method157(arg3 ^ 0x428, var8 - 1, 2, var7);
                this.method157(1024, var8, 8, var7 - 1);
            }
        }
        if (arg3 != 40) {
            this.method154(9, true, -44, 37, 82, -56, 97, 48, 11, -54);
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg5 == 0) {
                this.method157(1024, var8, 65536, var7);
                this.method157(arg3 + 984, var8, 4096, var7 - 1);
            }
            if (arg5 == 1) {
                this.method157(1024, var8, 1024, var7);
                this.method157(1024, var8 + 1, 16384, var7);
            }
            if (arg5 == 2) {
                this.method157(1024, var8, 4096, var7);
                this.method157(arg3 + 984, var8, 65536, var7 + 1);
            }
            if (arg5 == 3) {
                this.method157(1024, var8, 16384, var7);
                this.method157(1024, var8 - 1, 1024, var7);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg5 == 0) {
                this.method157(1024, var8, 512, var7);
                this.method157(1024, var8 + 1, 8192, var7 - 1);
            }
            if (arg5 == 1) {
                this.method157(arg3 + 984, var8, 2048, var7);
                this.method157(1024, var8 + 1, 32768, var7 + 1);
            }
            if (arg5 == 2) {
                this.method157(1024, var8, 8192, var7);
                this.method157(1024, var8 - 1, 512, var7 + 1);
            }
            if (arg5 == 3) {
                this.method157(1024, var8, 32768, var7);
                this.method157(arg3 + 984, var8 - 1, 2048, var7 - 1);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method157(1024, var8, 66560, var7);
            this.method157(arg3 ^ 0x428, var8, 4096, var7 - 1);
            this.method157(1024, var8 + 1, 16384, var7);
        }
        if (arg5 == 1) {
            this.method157(1024, var8, 5120, var7);
            this.method157(1024, var8 + 1, 16384, var7);
            this.method157(arg3 + 984, var8, 65536, var7 + 1);
        }
        if (arg5 == 2) {
            this.method157(arg3 ^ 0x428, var8, 20480, var7);
            this.method157(arg3 ^ 0x428, var8, 65536, var7 + 1);
            this.method157(1024, var8 - 1, 1024, var7);
        }
        if (arg5 == 3) {
            this.method157(arg3 ^ 0x428, var8, 81920, var7);
            this.method157(1024, var8 - 1, 1024, var7);
            this.method157(1024, var8, 4096, var7 - 1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)V", line = 780)
    private final void method157(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1024) {
            this.method165(61, -88, false, -124, 67, -83);
        }
        this.field460[arg3][arg1] = class221.method1516(this.field460[arg3][arg1], arg2);
        field446++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 791)
    public final void method158(int arg0, int arg1, int arg2) {
        field463++;
        int var4 = arg1 - this.field452;
        int var5 = arg0 - this.field445;
        this.field460[var5][var4] = class221.method1516(this.field460[var5][var4], arg2);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIII)V", line = 812)
    public static final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field469++;
        int var7 = class94.method645(class197.field3372, arg0 ^ 0x82, arg4, class194.field3302);
        int var8 = class94.method645(class197.field3372, arg0 ^ arg0, arg3, class194.field3302);
        int var9 = class94.method645(class321.field5489, 0, arg2, class52.field795);
        int var10 = class94.method645(class321.field5489, 0, arg6, class52.field795);
        int var11 = class94.method645(class197.field3372, 0, arg1 + arg4, class194.field3302);
        int var12 = class94.method645(class197.field3372, 0, arg3 - arg1, class194.field3302);
        for (int var13 = var7; var13 < var11; var13++) {
            class94.method647(class314.field5393[var13], var9, -7, var10, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class94.method647(class314.field5393[var14], var9, -7, var10, arg5);
        }
        int var15 = class94.method645(class321.field5489, 0, arg1 + arg2, class52.field795);
        int var16 = class94.method645(class321.field5489, arg0 ^ 0x82, arg6 - arg1, class52.field795);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class314.field5393[var17];
            class94.method647(var18, var9, -7, var15, arg5);
            class94.method647(var18, var16, -7, var10, arg5);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZIIIIII)V", line = 863)
    public final void method160(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 256;
        field455++;
        int var9 = arg4 - this.field452;
        if (arg0) {
            var8 += 131072;
        }
        int var10 = arg2 - this.field445;
        if (arg1 <= 100) {
            return;
        }
        if (arg3 == 1 || arg3 == 3) {
            int var11 = arg6;
            arg6 = arg5;
            arg5 = var11;
        }
        for (int var12 = var10; var12 < arg6 + var10; var12++) {
            if (var12 >= 0 && this.field444 > var12) {
                for (int var13 = var9; var13 < arg5 + var9; var13++) {
                    if (var13 >= 0 && this.field450 > var13) {
                        this.method168(var12, 118, var8, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 918)
    public static void method161(int arg0) {
        field462 = null;
        field473 = null;
        field457 = null;
        field475 = null;
        if (arg0 != -14408) {
            field476 = (class126) null;
        }
        field474 = null;
        field470 = null;
        field476 = null;
        field464 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V", line = 936)
    public static final void method162(int arg0) {
        field443++;
        class227.field3834.method1233((byte) -84);
        int var1 = class227.field3834.method1241(8, -123);
        if (var1 < class30.field425) {
            for (int var2 = var1; var2 < class30.field425; var2++) {
                class286.field4740[class134.field2326++] = class279.field4639[var2];
            }
        }
        if (arg0 > -67) {
            return;
        }
        if (class30.field425 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class30.field425 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class279.field4639[var3];
            class89 var5 = class199.field3391[var4];
            int var6 = class227.field3834.method1241(1, 46);
            if (var6 == 0) {
                class279.field4639[class30.field425++] = var4;
                var5.field2447 = class249.field4174;
            } else {
                int var7 = class227.field3834.method1241(2, 86);
                if (var7 == 0) {
                    class279.field4639[class30.field425++] = var4;
                    var5.field2447 = class249.field4174;
                    class139.field2526[class206.field3528++] = var4;
                } else if (var7 == 1) {
                    class279.field4639[class30.field425++] = var4;
                    var5.field2447 = class249.field4174;
                    int var8 = class227.field3834.method1241(3, -126);
                    var5.method1006(false, var8, 2);
                    int var9 = class227.field3834.method1241(1, 26);
                    if (var9 == 1) {
                        class139.field2526[class206.field3528++] = var4;
                    }
                } else if (var7 == 2) {
                    class279.field4639[class30.field425++] = var4;
                    var5.field2447 = class249.field4174;
                    int var10 = class227.field3834.method1241(3, 76);
                    var5.method1006(true, var10, 2);
                    int var11 = class227.field3834.method1241(3, 46);
                    var5.method1006(true, var11, 2);
                    int var12 = class227.field3834.method1241(1, -120);
                    if (var12 == 1) {
                        class139.field2526[class206.field3528++] = var4;
                    }
                } else if (var7 == 3) {
                    class286.field4740[class134.field2326++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)Z", line = 1041)
    public final boolean method163(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field465++;
        if (arg3 == arg4 && arg1 == arg2) {
            return true;
        }
        int var6 = arg3 - this.field445;
        int var7 = arg1 - this.field452;
        if (var6 < 0 || var6 >= this.field444 || var7 < 0 || this.field450 <= var7) {
            return false;
        }
        int var8 = arg4 - this.field445;
        if (arg0 < 53) {
            method159(-7, 50, 26, 0, 127, 5, -126);
        }
        int var9 = arg2 - this.field452;
        int var10;
        if (var9 < var7) {
            var10 = var7 - var9;
        } else {
            var10 = var9 - var7;
        }
        int var11;
        if (var6 > var8) {
            var11 = var6 - var8;
        } else {
            var11 = var8 - var6;
        }
        if (var10 >= var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var7 != var9) {
                if (var7 > var9) {
                    if ((this.field460[var8][var9] & 0x12C0102) != 0) {
                        return false;
                    }
                    var9++;
                } else if (var7 < var9) {
                    if ((this.field460[var8][var9] & 0x12C0120) != 0) {
                        return false;
                    }
                    var9--;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var8 < var6) {
                        if ((this.field460[var8][var9] & 0x12C0108) != 0) {
                            return false;
                        }
                        var8++;
                    } else if (var8 > var6) {
                        if ((this.field460[var8][var9] & 0x12C0180) != 0) {
                            return false;
                        }
                        var8--;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var6 != var8) {
                if (var8 < var6) {
                    if ((this.field460[var8][var9] & 0x12C0108) != 0) {
                        return false;
                    }
                    var8++;
                } else if (var6 < var8) {
                    if ((this.field460[var8][var9] & 0x12C0180) != 0) {
                        return false;
                    }
                    var8--;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var9 < var7) {
                        if ((this.field460[var8][var9] & 0x12C0102) != 0) {
                            return false;
                        }
                        var9++;
                    } else if (var9 > var7) {
                        if ((this.field460[var8][var9] & 0x12C0120) != 0) {
                            return false;
                        }
                        var9--;
                    }
                }
            }
        }
        return (this.field460[var6][var7] & 0x1240100) == 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ)V", line = 1190)
    public final void method164(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method171(111);
        }
        int var4 = arg1 - this.field452;
        int var5 = arg0 - this.field445;
        this.field460[var5][var4] = class47.method289(this.field460[var5][var4], -262145);
        field439++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZIII)V", line = 1203)
    public final void method165(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -1) {
            field462 = (class126) null;
        }
        field451++;
        int var7 = arg4 - this.field445;
        int var8 = arg1 - this.field452;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method168(var7, arg0 ^ 0x7D, 128, var8);
                this.method168(var7 - 1, arg0 + -122, 8, var8);
            }
            if (arg5 == 1) {
                this.method168(var7, -105, 2, var8);
                this.method168(var7, -123, 32, var8 + 1);
            }
            if (arg5 == 2) {
                this.method168(var7, -113, 8, var8);
                this.method168(var7 + 1, 124, 128, var8);
            }
            if (arg5 == 3) {
                this.method168(var7, 111, 32, var8);
                this.method168(var7, 34, 2, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method168(var7, arg0 - 88, 1, var8);
                this.method168(var7 - 1, 46, 16, var8 + 1);
            }
            if (arg5 == 1) {
                this.method168(var7, 124, 4, var8);
                this.method168(var7 + 1, 125, 64, var8 + 1);
            }
            if (arg5 == 2) {
                this.method168(var7, 24, 16, var8);
                this.method168(var7 + 1, 20, 1, var8 - 1);
            }
            if (arg5 == 3) {
                this.method168(var7, 35, 64, var8);
                this.method168(var7 - 1, -108, 4, var8 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method168(var7, -99, 130, var8);
                this.method168(var7 - 1, 46, 8, var8);
                this.method168(var7, 30, 32, var8 + 1);
            }
            if (arg5 == 1) {
                this.method168(var7, arg0 ^ 0xFFFFFFE5, 10, var8);
                this.method168(var7, arg0 - 103, 32, var8 + 1);
                this.method168(var7 + 1, arg0 ^ 0x65, 128, var8);
            }
            if (arg5 == 2) {
                this.method168(var7, arg0 - 91, 40, var8);
                this.method168(var7 + 1, -126, 128, var8);
                this.method168(var7, -94, 2, var8 - 1);
            }
            if (arg5 == 3) {
                this.method168(var7, 69, 160, var8);
                this.method168(var7, 109, 2, var8 - 1);
                this.method168(var7 - 1, -115, 8, var8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method168(var7, 34, 65536, var8);
                this.method168(var7 - 1, 95, 4096, var8);
            }
            if (arg5 == 1) {
                this.method168(var7, arg0 ^ 0x7A, 1024, var8);
                this.method168(var7, arg0 ^ 0xFFFFFF86, 16384, var8 + 1);
            }
            if (arg5 == 2) {
                this.method168(var7, 32, 4096, var8);
                this.method168(var7 + 1, 81, 65536, var8);
            }
            if (arg5 == 3) {
                this.method168(var7, -106, 16384, var8);
                this.method168(var7, -100, 1024, var8 - 1);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method168(var7, arg0 + 107, 512, var8);
                this.method168(var7 - 1, 99, 8192, var8 + 1);
            }
            if (arg5 == 1) {
                this.method168(var7, -116, 2048, var8);
                this.method168(var7 + 1, -115, 32768, var8 + 1);
            }
            if (arg5 == 2) {
                this.method168(var7, -93, 8192, var8);
                this.method168(var7 + 1, -119, 512, var8 - 1);
            }
            if (arg5 == 3) {
                this.method168(var7, -94, 32768, var8);
                this.method168(var7 - 1, 71, 2048, var8 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method168(var7, -115, 66560, var8);
            this.method168(var7 - 1, arg0 ^ 0xFFFFFF8C, 4096, var8);
            this.method168(var7, -98, 16384, var8 + 1);
        }
        if (arg5 == 1) {
            this.method168(var7, arg0 ^ 0x7E, 5120, var8);
            this.method168(var7, arg0 ^ 0x67, 16384, var8 + 1);
            this.method168(var7 + 1, arg0 + -95, 65536, var8);
        }
        if (arg5 == 2) {
            this.method168(var7, arg0 ^ 0xFFFFFF8F, 20480, var8);
            this.method168(var7 + 1, arg0 + 54, 65536, var8);
            this.method168(var7, 43, 1024, var8 - 1);
        }
        if (arg5 == 3) {
            this.method168(var7, arg0 - 106, 81920, var8);
            this.method168(var7, 116, 1024, var8 - 1);
            this.method168(var7 - 1, -94, 4096, var8);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIIIIIII)Z", line = 1415)
    public final boolean method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            this.method171(-104);
        }
        field453++;
        if (arg0 == 1) {
            if (arg6 == arg7 && arg3 == arg4) {
                return true;
            }
        } else if (arg6 <= arg7 && arg0 + arg6 - 1 >= arg7 && arg4 >= arg4 && arg4 <= arg0 + arg4 - 1) {
            return true;
        }
        int var9 = arg7 - this.field445;
        int var10 = arg4 - this.field452;
        int var11 = arg6 - this.field445;
        int var12 = arg3 - this.field452;
        if (arg0 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if ((var9 + 1) == var11 && var10 == var12 && (this.field460[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 - 1 == var12 && (this.field460[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field460[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 - 1) == var12 && (this.field460[var11][var12] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - 1) == var11 && var10 == var12 && (this.field460[var11][var12] & 0x8) == 0) {
                        return true;
                    }
                    if (var9 == var11 && var10 + 1 == var12 && (this.field460[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if (var9 + 1 == var11 && var10 == var12 && (this.field460[var11][var12] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 == var11 && (var10 + 1) == var12 && (this.field460[var11][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 == var11 && var10 + 1 == var12 && (this.field460[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 == var11 && var10 - 1 == var12 && (this.field460[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - 1) == var11 && var10 == var12 && (this.field460[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var10 == var12 && (this.field460[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var12 + arg0 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg2 = arg2 + 2 & 0x3;
                }
                if (arg2 == 0) {
                    if (var9 + 1 == var11 && var12 <= var10 && var10 <= var14 && (this.field460[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var13 >= var9 && var10 - arg0 == var12 && (this.field460[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 1) {
                    if (var9 - arg0 == var11 && var10 >= var12 && var14 >= var10 && (this.field460[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && var10 - arg0 == var12 && (this.field460[var9][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg2 == 2) {
                    if ((var9 - arg0) == var11 && var12 <= var10 && var14 >= var10 && (this.field460[var13][var10] & 0x8) == 0) {
                        return true;
                    }
                    if (var11 <= var9 && var9 <= var13 && (var10 + 1) == var12 && (this.field460[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg2 == 3) {
                    if ((var9 + 1) == var11 && var12 <= var10 && var10 <= var14 && (this.field460[var11][var10] & 0x80) == 0) {
                        return true;
                    }
                    if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field460[var9][var12] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var9 >= var11 && var9 <= var13 && var10 + 1 == var12 && (this.field460[var9][var12] & 0x20) == 0) {
                    return true;
                }
                if (var9 >= var11 && var9 <= var13 && var10 - arg0 == var12 && (this.field460[var9][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var9 - arg0) == var11 && var10 >= var12 && var10 <= var14 && (this.field460[var13][var10] & 0x8) == 0) {
                    return true;
                }
                if ((var9 + 1) == var11 && var12 <= var10 && var14 >= var10 && (this.field460[var11][var10] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 1605)
    public static final void method167(byte arg0) {
        if (class293.field4869 > 1) {
            class293.field4869--;
            class45.field700 = class50.field777;
        }
        if (class110.field1723 > 0) {
            class110.field1723--;
        }
        field459++;
        if (class260.field4370) {
            class260.field4370 = false;
            class33.method187(-24696);
            return;
        }
        for (int var1 = 0; var1 < 100 && class151.method1122(1); var1++) {
        }
        if (class280.field4662 != 30) {
            return;
        }
        class64.method471(class103.field1645, 144, (byte) 25);
        Object var2 = class125.field2106.field1615;
        synchronized (class125.field2106.field1615) {
            if (!class34.field510) {
                class125.field2106.field1618 = 0;
            } else if (class232.field3889 != 0 || class125.field2106.field1618 >= 40) {
                class209.field3589++;
                class103.field1645.method1238(217, 104);
                class103.field1645.method933(-3, 0);
                int var3 = class103.field1645.field2299;
                int var4 = 0;
                for (int var5 = 0; var5 < class125.field2106.field1618 && class103.field1645.field2299 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class125.field2106.field1619[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class125.field2106.field1620[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class125.field2106.field1619[var5] == -1 && class125.field2106.field1620[var5] == -1) {
                        var7 = -1;
                        var6 = -1;
                        var8 = true;
                    }
                    if (class306.field5130 != var7 || class84.field1335 != var6) {
                        int var9 = var6 - class84.field1335;
                        int var10 = var7 - class306.field5130;
                        class84.field1335 = var6;
                        class306.field5130 = var7;
                        if (class186.field3213 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class103.field1645.method959(-64, (var10 << 6) + (class186.field3213 << 12) + var9);
                            class186.field3213 = 0;
                        } else if (class186.field3213 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class103.field1645.method933(-3, class186.field3213 + 128);
                            class103.field1645.method959(118, (var10 << 8) + var9);
                            class186.field3213 = 0;
                        } else if (class186.field3213 < 32) {
                            class103.field1645.method933(-3, class186.field3213 + 192);
                            if (var8) {
                                class103.field1645.method947(Integer.MIN_VALUE, (byte) 124);
                            } else {
                                class103.field1645.method947(var6 << 16 | var7, (byte) 95);
                            }
                            class186.field3213 = 0;
                        } else {
                            class103.field1645.method959(-102, class186.field3213 + 57344);
                            if (var8) {
                                class103.field1645.method947(Integer.MIN_VALUE, (byte) 94);
                            } else {
                                class103.field1645.method947(var6 << 16 | var7, (byte) 125);
                            }
                            class186.field3213 = 0;
                        }
                    } else if (class186.field3213 < 2047) {
                        class186.field3213++;
                    }
                }
                class103.field1645.method952(class103.field1645.field2299 - var3, 120);
                if (class125.field2106.field1618 <= var4) {
                    class125.field2106.field1618 = 0;
                } else {
                    class125.field2106.field1618 -= var4;
                    for (int var11 = 0; var11 < class125.field2106.field1618; var11++) {
                        class125.field2106.field1620[var11] = class125.field2106.field1620[var4 + var11];
                        class125.field2106.field1619[var11] = class125.field2106.field1619[var4 + var11];
                    }
                }
            }
        }
        if (class232.field3889 != 0) {
            class69.field1134++;
            long var13 = (class241.field4082 - class39.field621) / 50L;
            class39.field621 = class241.field4082;
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            int var15 = class152.field2782;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            int var16 = class53.field804;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = (int) var13;
            byte var18 = 0;
            if (class232.field3889 == 2) {
                var18 = 1;
            }
            class103.field1645.method1238(196, 126);
            class103.field1645.method972(var18 << 15 | var17, 909483592);
            class103.field1645.method938(-80, var16 | var15 << 16);
        }
        if (class259.field4341 > 0) {
            class259.field4341--;
        }
        if (class68.field1121) {
            for (int var19 = 0; var19 < class105.field1660; var19++) {
                int var20 = class241.field4083[var19];
                if (var20 == 98 || var20 == 99 || var20 == 96 || var20 == 97) {
                    class243.field4114 = true;
                    break;
                }
            }
        } else if (class217.field3655[96] || class217.field3655[97] || class217.field3655[98] || class217.field3655[99]) {
            class243.field4114 = true;
        }
        if (class243.field4114 && class259.field4341 <= 0) {
            class259.field4341 = 20;
            class243.field4114 = false;
            class297.field4936++;
            class103.field1645.method1238(187, 79);
            class103.field1645.method935(class144.field2618, 1668921832);
            class103.field1645.method972(class292.field4832, 909483592);
        }
        if (class317.field5443 && !class170.field3029) {
            class229.field3872++;
            class170.field3029 = true;
            class103.field1645.method1238(146, 83);
            class103.field1645.method933(-3, 1);
        }
        if (!class317.field5443 && class170.field3029) {
            class170.field3029 = false;
            class103.field1645.method1238(146, 84);
            class103.field1645.method933(-3, 0);
            class229.field3872++;
        }
        if (!class253.field4255) {
            class103.field1645.method1238(63, 72);
            class142.field2595++;
            class103.field1645.method929(class68.method495((byte) -21), (byte) 126);
            class253.field4255 = true;
        }
        class303.method2034((byte) 107);
        if (class280.field4662 != 30) {
            return;
        }
        class99.method672((byte) 27);
        class33.method176((byte) 113);
        class218.field3663++;
        if (class218.field3663 > 750) {
            class33.method187(-24696);
            return;
        }
        class41.method257(true);
        class221.method1519((byte) -128);
        class309.method2114(1024);
        if (class307.field5192 != null) {
            class286.method1904(1611673100);
        }
        for (int var21 = class36.method200(-1, true); var21 != -1; var21 = class36.method200(-1, false)) {
            class100.method674((byte) -94, var21);
            class254.field4268[class47.method289(31, class124.field2100++)] = var21;
        }
        int var22 = -86 % ((arg0 - 11) / 54);
        for (class245 var23 = class37.method204((byte) 115); var23 != null; var23 = class37.method204((byte) 110)) {
            int var24 = var23.method1687((byte) 81);
            int var25 = var23.method1689(-105);
            if (var24 == 1) {
                class116.field1959[var25] = var23.field4154;
                class19.field254[class47.method289(class64.field1087++, 31)] = var25;
            } else if (var24 == 2) {
                class35.field512[var25] = var23.field4148;
                class269.field4537[class47.method289(class100.field1617++, 31)] = var25;
            } else if (var24 == 3) {
                class112 var45 = class252.method1706(5157, var25);
                if (!var23.field4148.method872(var45.field1802, 0)) {
                    var45.field1802 = var23.field4148;
                    class23.method114(var45, (byte) 94);
                }
            } else if (var24 == 4) {
                class112 var42 = class252.method1706(5157, var25);
                int var43 = var23.field4154;
                int var44 = var23.field4153;
                if (var42.field1800 != var43 || var42.field1774 != var44) {
                    var42.field1774 = var44;
                    var42.field1800 = var43;
                    class23.method114(var42, (byte) 94);
                }
            } else if (var24 == 5) {
                class112 var41 = class252.method1706(5157, var25);
                if (var23.field4154 != var41.field1824 || var23.field4154 == -1) {
                    var41.field1764 = 0;
                    var41.field1793 = 0;
                    var41.field1824 = var23.field4154;
                    class23.method114(var41, (byte) 94);
                }
            } else if (var24 == 6) {
                int var35 = var23.field4154;
                int var36 = var35 & 0x1F;
                int var37 = var35 >> 10 & 0x1F;
                int var38 = (var35 & 0x3E7) >> 5;
                class112 var39 = class252.method1706(5157, var25);
                int var40 = (var36 << 3) + (var37 << 19) + (var38 << 11);
                if (var39.field1877 != var40) {
                    var39.field1877 = var40;
                    class23.method114(var39, (byte) 94);
                }
            } else if (var24 == 7) {
                class112 var26 = class252.method1706(5157, var25);
                boolean var27 = var23.field4154 == 1;
                if (var27 != var26.field1776) {
                    var26.field1776 = var27;
                    class23.method114(var26, (byte) 94);
                }
            } else if (var24 == 8) {
                class112 var28 = class252.method1706(5157, var25);
                if (var23.field4154 != var28.field1843 || var23.field4153 != var28.field1891 || var23.field4157 != var28.field1770) {
                    var28.field1891 = var23.field4153;
                    var28.field1843 = var23.field4154;
                    var28.field1770 = var23.field4157;
                    if (var28.field1803 != -1) {
                        if (var28.field1806 > 0) {
                            var28.field1770 = var28.field1770 * 32 / var28.field1806;
                        } else if (var28.field1831 > 0) {
                            var28.field1770 = var28.field1770 * 32 / var28.field1831;
                        }
                    }
                    class23.method114(var28, (byte) 94);
                }
            } else if (var24 == 9) {
                class112 var29 = class252.method1706(5157, var25);
                if (var23.field4154 != var29.field1803 || var23.field4153 != var29.field1775) {
                    var29.field1803 = var23.field4154;
                    var29.field1775 = var23.field4153;
                    class23.method114(var29, (byte) 94);
                }
            } else if (var24 == 10) {
                class112 var34 = class252.method1706(5157, var25);
                if (var23.field4154 != var34.field1902 || var23.field4153 != var34.field1878 || var23.field4157 != var34.field1794) {
                    var34.field1794 = var23.field4157;
                    var34.field1902 = var23.field4154;
                    var34.field1878 = var23.field4153;
                    class23.method114(var34, (byte) 94);
                }
            } else if (var24 == 11) {
                class112 var30 = class252.method1706(5157, var25);
                var30.field1811 = 0;
                var30.field1919 = var30.field1769 = var23.field4154;
                var30.field1784 = var30.field1830 = var23.field4153;
                var30.field1834 = 0;
                class23.method114(var30, (byte) 94);
            } else if (var24 == 12) {
                class112 var32 = class252.method1706(5157, var25);
                int var33 = var23.field4154;
                if (var32 != null && var32.field1780 == 0) {
                    if (var32.field1791 - var32.field1753 < var33) {
                        var33 = var32.field1791 - var32.field1753;
                    }
                    if (var33 < 0) {
                        var33 = 0;
                    }
                    if (var32.field1827 != var33) {
                        var32.field1827 = var33;
                        class23.method114(var32, (byte) 94);
                    }
                }
            } else if (var24 == 13) {
                class112 var31 = class252.method1706(5157, var25);
                var31.field1797 = var23.field4154;
            }
        }
        class303.field5038++;
        if (class29.field412 != 0) {
            class296.field4933 += 20;
            if (class296.field4933 >= 400) {
                class29.field412 = 0;
            }
        }
        if (class180.field3138 != null) {
            class36.field525++;
            if (class36.field525 >= 15) {
                class23.method114(class180.field3138, (byte) 94);
                class180.field3138 = null;
            }
        }
        if (class122.field2052 != null) {
            class23.method114(class122.field2052, (byte) 94);
            if (class138.field2493 > class249.field4177 + 5 || class249.field4177 - 5 > class138.field2493 || class174.field3074 + 5 < class260.field4366 || class260.field4366 < (class174.field3074 - 5)) {
                class197.field3376 = true;
            }
            class51.field787++;
            if (class317.field5442 == 0) {
                if (class197.field3376 && class51.field787 >= 5) {
                    if (class58.field898 == class122.field2052 && class317.field5431 != class212.field3616) {
                        class102.field1639++;
                        byte var46 = 0;
                        class112 var47 = class122.field2052;
                        if (class251.field4202 == 1 && var47.field1885 == 206) {
                            var46 = 1;
                        }
                        if (var47.field1849[class317.field5431] <= 0) {
                            var46 = 0;
                        }
                        if (class34.method191(123, client.method804(var47))) {
                            int var50 = class212.field3616;
                            int var51 = class317.field5431;
                            var47.field1849[var51] = var47.field1849[var50];
                            var47.field1899[var51] = var47.field1899[var50];
                            var47.field1849[var50] = -1;
                            var47.field1899[var50] = 0;
                        } else if (var46 == 1) {
                            int var48 = class317.field5431;
                            int var49 = class212.field3616;
                            while (var48 != var49) {
                                if (var49 > var48) {
                                    var47.method743(var49 - 1, (byte) 13, var49);
                                    var49--;
                                } else if (var48 > var49) {
                                    var47.method743(var49 + 1, (byte) 118, var49);
                                    var49++;
                                }
                            }
                        } else {
                            var47.method743(class317.field5431, (byte) -117, class212.field3616);
                        }
                        class103.field1645.method1238(85, 107);
                        class103.field1645.method974(class317.field5431, (byte) 26);
                        class103.field1645.method976(var46, -13817);
                        class103.field1645.method935(class212.field3616, 1668921832);
                        class103.field1645.method929(class122.field2052.field1833, (byte) 118);
                    }
                } else if ((class36.field527 == 1 || class129.method896(class173.field3067 - 1, false)) && class173.field3067 > 2) {
                    class111.method736(15);
                } else if (class173.field3067 > 0) {
                    class117.method766(8);
                }
                class232.field3889 = 0;
                class36.field525 = 10;
                class122.field2052 = null;
            }
        }
        class75.field1220 = false;
        class122.field2043 = null;
        class105.field1660 = 0;
        class286.field4760 = false;
        class112 var52 = class74.field1197;
        class112 var53 = class150.field2742;
        class150.field2742 = null;
        class74.field1197 = null;
        while (class296.method2001((byte) -120) && class105.field1660 < 128) {
            class241.field4083[class105.field1660] = class65.field1095;
            class122.field2033[class105.field1660] = class190.field3261;
            class105.field1660++;
        }
        class307.field5192 = null;
        if (class182.field3162 != -1) {
            class187.method1352(0, 0, class7.field87, class182.field3162, -1, class1.field6, 0, 0);
        }
        class50.field777++;
        while (true) {
            class282 var54;
            class112 var55;
            class112 var56;
            do {
                var54 = (class282) class192.field3280.method895(14189);
                if (var54 == null) {
                    while (true) {
                        class282 var57;
                        class112 var58;
                        class112 var59;
                        do {
                            var57 = (class282) class227.field3832.method895(14189);
                            if (var57 == null) {
                                while (true) {
                                    class282 var60;
                                    class112 var61;
                                    class112 var62;
                                    do {
                                        var60 = (class282) class305.field5124.method895(14189);
                                        if (var60 == null) {
                                            if (class52.field798 && class307.field5192 == null) {
                                                class52.field798 = false;
                                            }
                                            if (class82.field1324 != null) {
                                                class110.method720(-3);
                                            }
                                            if (class73.field1172 > 0 && class217.field3655[82] && class217.field3655[81] && class75.field1212 != 0) {
                                                int var63 = class131.field2250 - class75.field1212;
                                                if (var63 < 0) {
                                                    var63 = 0;
                                                } else if (var63 > 3) {
                                                    var63 = 3;
                                                }
                                                class76.method549(class286.field4744.field2460[0] + class58.field914, class138.field2473 - -class286.field4744.field2471[0], var63, true);
                                            }
                                            if (class73.field1172 > 0 && class217.field3655[82] && class217.field3655[81]) {
                                                if (class152.field2786 != -1) {
                                                    class76.method549(class58.field914 + class152.field2786, class138.field2473 - -class40.field637, class131.field2250, true);
                                                }
                                                class213.field3626 = 0;
                                                class264.field4412 = 0;
                                            } else if (class264.field4412 == 2) {
                                                if (class152.field2786 != -1) {
                                                    class103.field1645.method1238(27, 107);
                                                    class159.field2871++;
                                                    class103.field1645.method974(class52.field797, (byte) 26);
                                                    class103.field1645.method947(class189.field3250, (byte) 95);
                                                    class103.field1645.method974(class58.field914 + class152.field2786, (byte) 26);
                                                    class103.field1645.method974(class40.field637 + class138.field2473, (byte) 26);
                                                    class17.field239 = class53.field804;
                                                    class296.field4933 = 0;
                                                    class238.field4015 = class152.field2782;
                                                    class29.field412 = 1;
                                                }
                                                class264.field4412 = 0;
                                            } else if (class213.field3626 == 2) {
                                                if (class152.field2786 != -1) {
                                                    class103.field1645.method1238(250, 77);
                                                    class103.field1645.method974(class58.field914 + class152.field2786, (byte) 26);
                                                    class103.field1645.method974(class40.field637 + class138.field2473, (byte) 26);
                                                    class46.field710++;
                                                    class17.field239 = class53.field804;
                                                    class29.field412 = 1;
                                                    class238.field4015 = class152.field2782;
                                                    class296.field4933 = 0;
                                                }
                                                class213.field3626 = 0;
                                            } else if (class152.field2786 != -1 && class264.field4412 == 0 && class213.field3626 == 0) {
                                                boolean var64 = class151.method1123(0, 0, -9, 0, 0, true, 0, 0, class286.field4744.field2460[0], class286.field4744.field2471[0], class152.field2786, class40.field637);
                                                if (var64) {
                                                    class296.field4933 = 0;
                                                    class17.field239 = class53.field804;
                                                    class29.field412 = 1;
                                                    class238.field4015 = class152.field2782;
                                                }
                                            }
                                            class152.field2786 = -1;
                                            class241.method1661(-18321);
                                            if (class74.field1197 != var52) {
                                                if (var52 != null) {
                                                    class23.method114(var52, (byte) 94);
                                                }
                                                if (class74.field1197 != null) {
                                                    class23.method114(class74.field1197, (byte) 94);
                                                }
                                            }
                                            if (class150.field2742 != var53 && class197.field3367 == class144.field2620) {
                                                if (var53 != null) {
                                                    class23.method114(var53, (byte) 94);
                                                }
                                                if (class150.field2742 != null) {
                                                    class23.method114(class150.field2742, (byte) 94);
                                                }
                                            }
                                            if (class150.field2742 == null) {
                                                if (class197.field3367 > 0) {
                                                    class197.field3367--;
                                                }
                                            } else if (class144.field2620 > class197.field3367) {
                                                class197.field3367++;
                                                if (class197.field3367 == class144.field2620) {
                                                    class23.method114(class150.field2742, (byte) 94);
                                                }
                                            }
                                            if (class254.field4261 == 1) {
                                                client.method806(0);
                                            } else if (class254.field4261 == 2) {
                                                class78.method561((byte) 29);
                                            } else {
                                                class73.method527(2);
                                            }
                                            for (int var65 = 0; var65 < 5; var65++) {
                                                int var10002 = class106.field1670[var65]++;
                                            }
                                            int var66 = class170.method1244(true);
                                            int var67 = class267.method1806((byte) -55);
                                            if (var66 > 15000 && var67 > 15000) {
                                                class110.field1723 = 250;
                                                class232.method1584(14500, 0);
                                                class302.field5037++;
                                                class103.field1645.method1238(210, 97);
                                            }
                                            if (class257.field4317 != null && class257.field4317.field965 == 1) {
                                                if (class257.field4317.field967 != null) {
                                                    class315.method2196((byte) 126, class5.field63, class207.field3549);
                                                }
                                                class5.field63 = false;
                                                class257.field4317 = null;
                                                class207.field3549 = null;
                                            }
                                            class317.field5441++;
                                            if (class317.field5441 > 500) {
                                                class317.field5441 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x4) == 4) {
                                                    class189.field3247 += client.field2058;
                                                }
                                                if ((var68 & 0x1) == 1) {
                                                    class183.field3192 += class265.field4494;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class71.field1160 += class52.field800;
                                                }
                                            }
                                            if (class71.field1160 < -55) {
                                                class52.field800 = 2;
                                            }
                                            class58.field899++;
                                            if (class183.field3192 < -50) {
                                                class265.field4494 = 2;
                                            }
                                            if (class183.field3192 > 50) {
                                                class265.field4494 = -2;
                                            }
                                            class255.field4292++;
                                            if (class189.field3247 < -40) {
                                                client.field2058 = 1;
                                            }
                                            if (class189.field3247 > 40) {
                                                client.field2058 = -1;
                                            }
                                            if (class255.field4292 > 500) {
                                                class255.field4292 = 0;
                                                int var69 = (int) (Math.random() * 8.0D);
                                                if ((var69 & 0x1) == 1) {
                                                    class180.field3134 += class24.field345;
                                                }
                                                if ((var69 & 0x2) == 2) {
                                                    class234.field3951 += class9.field106;
                                                }
                                            }
                                            if (class71.field1160 > 55) {
                                                class52.field800 = -2;
                                            }
                                            if (class234.field3951 < -20) {
                                                class9.field106 = 1;
                                            }
                                            if (class234.field3951 > 10) {
                                                class9.field106 = -1;
                                            }
                                            if (class180.field3134 < -60) {
                                                class24.field345 = 2;
                                            }
                                            if (class180.field3134 > 60) {
                                                class24.field345 = -2;
                                            }
                                            if (class58.field899 > 50) {
                                                class103.field1645.method1238(19, 74);
                                                class245.field4146++;
                                            }
                                            if (class23.field327) {
                                                class206.method1447(false);
                                                class23.field327 = false;
                                            }
                                            try {
                                                if (class59.field953 != null && class103.field1645.field2299 > 0) {
                                                    class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                                                    class58.field899 = 0;
                                                    class103.field1645.field2299 = 0;
                                                }
                                            } catch (IOException var71) {
                                                class33.method187(-24696);
                                            }
                                            return;
                                        }
                                        var61 = var60.field4697;
                                        if (var61.field1875 < 0) {
                                            break;
                                        }
                                        var62 = class252.method1706(5157, var61.field1865);
                                    } while (var62 == null || var62.field1810 == null || var62.field1810.length <= var61.field1875 || var62.field1810[var61.field1875] != var61);
                                    class309.method2111(var60, 200000);
                                }
                            }
                            var58 = var57.field4697;
                            if (var58.field1875 < 0) {
                                break;
                            }
                            var59 = class252.method1706(5157, var58.field1865);
                        } while (var59 == null || var59.field1810 == null || var59.field1810.length <= var58.field1875 || var59.field1810[var58.field1875] != var58);
                        class309.method2111(var57, 200000);
                    }
                }
                var55 = var54.field4697;
                if (var55.field1875 < 0) {
                    break;
                }
                var56 = class252.method1706(5157, var55.field1865);
            } while (var56 == null || var56.field1810 == null || var56.field1810.length <= var55.field1875 || var56.field1810[var55.field1875] != var55);
            class309.method2111(var54, 200000);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(IIII)V", line = 2632)
    private final void method168(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -16 % ((-arg1 - 34) / 53);
        field468++;
        this.field460[arg0][arg3] = class47.method289(this.field460[arg0][arg3], ~arg2);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIIII)Z", line = 2647)
    private final boolean method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field440++;
        if (arg3 + arg4 <= arg8 || arg3 >= arg0 + arg8) {
            return false;
        } else if (arg2 + arg6 > arg5 && arg1 + arg5 > arg2) {
            if (arg7 != 210) {
                field475 = (class126) null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V", line = 2667)
    public class32(int arg0, int arg1) {
        this.field444 = arg0;
        this.field450 = arg1;
        this.field460 = new int[this.field444][this.field450];
        this.field445 = 0;
        this.method171(60);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIIIIIII)Z", line = 2682)
    public final boolean method170(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field447++;
        if (arg2 <= 1) {
            int var10 = arg0 + arg5 - 1;
            int var11 = arg6 + arg7 - 1;
            if (arg7 <= arg8 && arg8 <= var11 && arg5 <= arg4 && arg4 <= var10) {
                return true;
            } else if (arg7 - 1 == arg8 && arg4 >= arg5 && var10 >= arg4 && (this.field460[arg8 - this.field445][arg4 - this.field452] & 0x8) == 0 && (arg3 & 0x8) == 0) {
                return true;
            } else if ((var11 + 1) == arg8 && arg5 <= arg4 && arg4 <= var10 && (this.field460[arg8 - this.field445][arg4 - this.field452] & 0x80) == 0 && (arg3 & 0x2) == 0) {
                return true;
            } else if (arg5 - 1 == arg4 && arg7 <= arg8 && var11 >= arg8 && (this.field460[arg8 - this.field445][arg4 - this.field452] & 0x2) == 0 && (arg3 & 0x4) == 0) {
                return true;
            } else {
                if (arg1 >= -23) {
                    method162(41);
                }
                return var10 + 1 == arg4 && arg8 >= arg7 && arg8 <= var11 && (this.field460[arg8 - this.field445][arg4 - this.field452] & 0x20) == 0 && (arg3 & 0x1) == 0;
            }
        } else if (this.method169(arg2, arg2, arg5, arg7, arg6, arg4, arg0, 210, arg8)) {
            return true;
        } else {
            return this.method154(arg7, false, arg0, arg2, arg5, arg3, arg6, arg4, arg8, arg2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V", line = 2725)
    public final void method171(int arg0) {
        field448++;
        int var2 = -98 % ((arg0 + 13) / 50);
        for (int var3 = 0; var3 < this.field444; var3++) {
            for (int var4 = 0; var4 < this.field450; var4++) {
                if (var3 == 0 || var4 == 0 || this.field444 - 5 <= var3 || this.field450 - 5 <= var4) {
                    this.field460[var3][var4] = 16777215;
                } else {
                    this.field460[var3][var4] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BII)V", line = 2759)
    public final void method172(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field445;
        int var5 = arg2 - this.field452;
        if (arg0 == 90) {
            field456++;
            this.field460[var4][var5] = class221.method1516(this.field460[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)V", line = 2777)
    public static final void method173(byte arg0, int arg1) {
        class245 var2 = class139.method1022(11, (byte) -127, arg1);
        var2.method1682(88);
        int var3 = 27 / ((arg0 - 18) / 35);
        field454++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIZ)V", line = 2800)
    public final void method174(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field445;
        if (arg1 != 1) {
            field476 = (class126) null;
        }
        int var8 = 256;
        field449++;
        if (arg5) {
            var8 += 131072;
        }
        int var9 = arg0 - this.field452;
        for (int var10 = var7; var10 < (arg2 + var7); var10++) {
            if (var10 >= 0 && var10 < this.field444) {
                for (int var11 = var9; var11 < (arg4 + var9); var11++) {
                    if (var11 >= 0 && var11 < this.field450) {
                        this.method157(arg1 ^ 0x401, var11, var8, var10);
                    }
                }
            }
        }
    }
}
