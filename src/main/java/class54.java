import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class54 {

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    private int field1388;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    private int field1380;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    private int field1391;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[[I")
    public int[][] field1389;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "Lea;")
    private static class38 field1370 = class9.method46((byte) 115, "white:");

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Lea;")
    public static class38 field1374 = field1370;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lea;")
    public static class38 field1386 = class9.method46((byte) 118, "<col=ff0000>");

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field1377 = 0;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "Lea;")
    private static class38 field1383 = class9.method46((byte) 102, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Lea;")
    public static class38 field1392 = field1370;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lea;")
    public static class38 field1378 = field1383;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "[Lfa;")
    public static class47[] field1364;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZII)V")
    private final void method388(int arg0, boolean arg1, int arg2, int arg3) {
        this.field1389[arg3][arg0] = class94.method794(this.field1389[arg3][arg0], arg2);
        if (!arg1) {
            field1372++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
    public static final int method389(int arg0) {
        if (arg0 >= -60) {
            field1378 = null;
        }
        field1369++;
        return class105.field2352++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lef;IB)Lea;")
    public static final class38 method390(class43 arg0, int arg1, byte arg2) {
        if (arg2 != 9) {
            method397(56);
        }
        field1381++;
        if (!class94.method790(arg1, class40.method299(arg0, 25), (byte) -122) && arg0.field974 == null) {
            return null;
        } else if (arg0.field1064 == null || arg0.field1064.length <= arg1 || arg0.field1064[arg1] == null || arg0.field1064[arg1].method255((byte) -69).method276((byte) 38) == 0) {
            return class37.field783 ? class163.method1168(arg2 ^ 0xFFFFFFB4, new class38[] { class162.field3367, class151.method1059(arg1, (byte) -114) }) : null;
        } else {
            return arg0.field1064[arg1];
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
    public final void method391(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1391;
        int var5 = arg0 - this.field1380;
        field1367++;
        int var6 = 47 % ((arg2 - 32) / 50);
        this.field1389[var5][var4] = class52.method380(this.field1389[var5][var4], -262145);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
    public final void method392(boolean arg0) {
        field1385++;
        for (int var2 = 0; var2 < this.field1390; var2++) {
            for (int var3 = 0; var3 < this.field1388; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1390 - 5 <= var2 || var3 >= this.field1388 - 5) {
                    this.field1389[var2][var3] = 16777215;
                } else {
                    this.field1389[var2][var3] = 16777216;
                }
            }
        }
        if (arg0) {
            this.method391(77, -91, 65);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/util/Random;B)I")
    public static final int method393(int arg0, Random arg1, byte arg2) {
        field1371++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg2 >= -39) {
            method389(61);
        }
        if (class5.method25(arg0, (byte) -10)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        }
        int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
        int var4;
        do {
            var4 = arg1.nextInt();
        } while (var3 <= var4);
        return class116.method900(var4, arg0, (byte) -74);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBZIII)V")
    public final void method394(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1373++;
        int var7 = -10 % ((arg1 + 53) / 48);
        int var8 = arg0 - this.field1391;
        int var9 = arg4 - this.field1380;
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method388(var8, false, 128, var9);
                this.method388(var8, false, 8, var9 - 1);
            }
            if (arg5 == 1) {
                this.method388(var8, false, 2, var9);
                this.method388(var8 + 1, false, 32, var9);
            }
            if (arg5 == 2) {
                this.method388(var8, false, 8, var9);
                this.method388(var8, false, 128, var9 + 1);
            }
            if (arg5 == 3) {
                this.method388(var8, false, 32, var9);
                this.method388(var8 - 1, false, 2, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method388(var8, false, 1, var9);
                this.method388(var8 + 1, false, 16, var9 - 1);
            }
            if (arg5 == 1) {
                this.method388(var8, false, 4, var9);
                this.method388(var8 + 1, false, 64, var9 + 1);
            }
            if (arg5 == 2) {
                this.method388(var8, false, 16, var9);
                this.method388(var8 - 1, false, 1, var9 + 1);
            }
            if (arg5 == 3) {
                this.method388(var8, false, 64, var9);
                this.method388(var8 - 1, false, 4, var9 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg5 == 0) {
                this.method388(var8, false, 130, var9);
                this.method388(var8, false, 8, var9 - 1);
                this.method388(var8 + 1, false, 32, var9);
            }
            if (arg5 == 1) {
                this.method388(var8, false, 10, var9);
                this.method388(var8 + 1, false, 32, var9);
                this.method388(var8, false, 128, var9 + 1);
            }
            if (arg5 == 2) {
                this.method388(var8, false, 40, var9);
                this.method388(var8, false, 128, var9 + 1);
                this.method388(var8 - 1, false, 2, var9);
            }
            if (arg5 == 3) {
                this.method388(var8, false, 160, var9);
                this.method388(var8 - 1, false, 2, var9);
                this.method388(var8, false, 8, var9 - 1);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg5 == 0) {
                this.method388(var8, false, 65536, var9);
                this.method388(var8, false, 4096, var9 - 1);
            }
            if (arg5 == 1) {
                this.method388(var8, false, 1024, var9);
                this.method388(var8 + 1, false, 16384, var9);
            }
            if (arg5 == 2) {
                this.method388(var8, false, 4096, var9);
                this.method388(var8, false, 65536, var9 + 1);
            }
            if (arg5 == 3) {
                this.method388(var8, false, 16384, var9);
                this.method388(var8 - 1, false, 1024, var9);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg5 == 0) {
                this.method388(var8, false, 512, var9);
                this.method388(var8 + 1, false, 8192, var9 - 1);
            }
            if (arg5 == 1) {
                this.method388(var8, false, 2048, var9);
                this.method388(var8 + 1, false, 32768, var9 + 1);
            }
            if (arg5 == 2) {
                this.method388(var8, false, 8192, var9);
                this.method388(var8 - 1, false, 512, var9 + 1);
            }
            if (arg5 == 3) {
                this.method388(var8, false, 32768, var9);
                this.method388(var8 - 1, false, 2048, var9 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg5 == 0) {
            this.method388(var8, false, 66560, var9);
            this.method388(var8, false, 4096, var9 - 1);
            this.method388(var8 + 1, false, 16384, var9);
        }
        if (arg5 == 1) {
            this.method388(var8, false, 5120, var9);
            this.method388(var8 + 1, false, 16384, var9);
            this.method388(var8, false, 65536, var9 + 1);
        }
        if (arg5 == 2) {
            this.method388(var8, false, 20480, var9);
            this.method388(var8, false, 65536, var9 + 1);
            this.method388(var8 - 1, false, 1024, var9);
        }
        if (arg5 == 3) {
            this.method388(var8, false, 81920, var9);
            this.method388(var8 - 1, false, 1024, var9);
            this.method388(var8, false, 4096, var9 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V")
    public final void method395(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1391;
        int var5 = arg2 - this.field1380;
        field1366++;
        this.field1389[var5][var4] = class94.method794(this.field1389[var5][var4], 2097152);
        if (arg1 != -4) {
            field1392 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZIIII)Z")
    public final boolean method396(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3) {
            field1386 = null;
        }
        int var9 = arg0 + arg6 - 1;
        int var10 = arg2 + arg7 - 1;
        field1368++;
        if (arg4 >= arg7 && var10 >= arg4 && arg5 >= arg6 && arg5 <= var9) {
            return true;
        } else if (arg7 - 1 == arg4 && arg6 <= arg5 && arg5 <= var9 && (this.field1389[arg4 - this.field1380][arg5 - this.field1391] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg5 >= arg6 && arg5 <= var9 && (this.field1389[arg4 - this.field1380][arg5 - this.field1391] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg6 - 1 == arg5 && arg4 >= arg7 && arg4 <= var10 && (this.field1389[arg4 - this.field1380][arg5 - this.field1391] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg5 && arg4 >= arg7 && arg4 <= var10 && (this.field1389[arg4 - this.field1380][arg5 - this.field1391] & 0x20) == 0 && (arg1 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V")
    public static void method397(int arg0) {
        field1386 = null;
        field1392 = null;
        if (arg0 != 1) {
            field1370 = null;
        }
        field1370 = null;
        field1364 = null;
        field1374 = null;
        field1378 = null;
        field1383 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIZI)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var7 = arg3 - this.field1380;
        int var8 = arg1 - this.field1391;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method401(var7, var8, 1, 128);
                this.method401(var7 - 1, var8, 1, 8);
            }
            if (arg2 == 1) {
                this.method401(var7, var8, 1, 2);
                this.method401(var7, var8 + 1, 1, 32);
            }
            if (arg2 == 2) {
                this.method401(var7, var8, 1, 8);
                this.method401(var7 + 1, var8, 1, 128);
            }
            if (arg2 == 3) {
                this.method401(var7, var8, 1, 32);
                this.method401(var7, var8 - 1, 1, 2);
            }
        }
        field1384++;
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method401(var7, var8, 1, 1);
                this.method401(var7 - 1, var8 - -1, 1, 16);
            }
            if (arg2 == 1) {
                this.method401(var7, var8, 1, 4);
                this.method401(var7 + 1, var8 - -1, 1, 64);
            }
            if (arg2 == 2) {
                this.method401(var7, var8, 1, 16);
                this.method401(var7 + 1, var8 + -1, 1, 1);
            }
            if (arg2 == 3) {
                this.method401(var7, var8, 1, 64);
                this.method401(var7 - 1, var8 + -1, 1, 4);
            }
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method401(var7, var8, 1, 130);
                this.method401(var7 - 1, var8, 1, 8);
                this.method401(var7, var8 + 1, 1, 32);
            }
            if (arg2 == 1) {
                this.method401(var7, var8, 1, 10);
                this.method401(var7, var8 + 1, 1, 32);
                this.method401(var7 + 1, var8, 1, 128);
            }
            if (arg2 == 2) {
                this.method401(var7, var8, 1, 40);
                this.method401(var7 + 1, var8, 1, 128);
                this.method401(var7, var8 - 1, 1, 2);
            }
            if (arg2 == 3) {
                this.method401(var7, var8, 1, 160);
                this.method401(var7, var8 - 1, 1, 2);
                this.method401(var7 - 1, var8, 1, 8);
            }
        }
        if (arg4) {
            if (arg0 == 0) {
                if (arg2 == 0) {
                    this.method401(var7, var8, 1, 65536);
                    this.method401(var7 - 1, var8, 1, 4096);
                }
                if (arg2 == 1) {
                    this.method401(var7, var8, 1, 1024);
                    this.method401(var7, var8 + 1, 1, 16384);
                }
                if (arg2 == 2) {
                    this.method401(var7, var8, 1, 4096);
                    this.method401(var7 + 1, var8, 1, 65536);
                }
                if (arg2 == 3) {
                    this.method401(var7, var8, 1, 16384);
                    this.method401(var7, var8 - 1, 1, 1024);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg2 == 0) {
                    this.method401(var7, var8, 1, 512);
                    this.method401(var7 - 1, var8 + 1, 1, 8192);
                }
                if (arg2 == 1) {
                    this.method401(var7, var8, 1, 2048);
                    this.method401(var7 + 1, var8 - -1, 1, 32768);
                }
                if (arg2 == 2) {
                    this.method401(var7, var8, 1, 8192);
                    this.method401(var7 + 1, var8 - 1, 1, 512);
                }
                if (arg2 == 3) {
                    this.method401(var7, var8, 1, 32768);
                    this.method401(var7 - 1, var8 + -1, 1, 2048);
                }
            }
            if (arg0 == 2) {
                if (arg2 == 0) {
                    this.method401(var7, var8, 1, 66560);
                    this.method401(var7 - 1, var8, 1, 4096);
                    this.method401(var7, var8 + 1, 1, 16384);
                }
                if (arg2 == 1) {
                    this.method401(var7, var8, 1, 5120);
                    this.method401(var7, var8 + 1, 1, 16384);
                    this.method401(var7 + 1, var8, 1, 65536);
                }
                if (arg2 == 2) {
                    this.method401(var7, var8, 1, 20480);
                    this.method401(var7 + 1, var8, 1, 65536);
                    this.method401(var7, var8 - 1, 1, 1024);
                }
                if (arg2 == 3) {
                    this.method401(var7, var8, 1, 81920);
                    this.method401(var7, var8 - 1, 1, 1024);
                    this.method401(var7 - 1, var8, 1, 4096);
                }
            }
        }
        if (arg5 < 50) {
            this.field1390 = 18;
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(III)V")
    public final void method399(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1380;
        if (arg0 == 26108) {
            field1365++;
            int var5 = arg1 - this.field1391;
            this.field1389[var4][var5] = class94.method794(this.field1389[var4][var5], 262144);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIZ)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1379++;
        if (arg2 != -1) {
            field1364 = null;
        }
        int var7 = arg4 - this.field1380;
        int var8 = arg0 - this.field1391;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg3 + var7; var10++) {
            if (var10 >= 0 && this.field1390 > var10) {
                for (int var11 = var8; var11 < var8 + arg1; var11++) {
                    if (var11 >= 0 && this.field1388 > var11) {
                        this.method388(var11, false, var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIII)V")
    private final void method401(int arg0, int arg1, int arg2, int arg3) {
        this.field1389[arg0][arg1] = class52.method380(this.field1389[arg0][arg1], ~arg3);
        field1376++;
        if (arg2 != 1) {
            method389(120);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBIIII)Z")
    public final boolean method402(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1375++;
        if (arg3 == arg6 && arg1 == arg4) {
            return true;
        }
        int var8 = arg6 - this.field1380;
        int var9 = arg3 - this.field1380;
        int var10 = arg4 - this.field1391;
        int var11 = arg1 - this.field1391;
        if (arg5 == 6 || arg5 == 7) {
            if (arg5 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1389[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1389[var8][var11] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1389[var8][var11] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1389[var8][var11] & 0x20) == 0) {
                    return true;
                }
            }
        }
        int var12 = -103 % ((arg2 - 19) / 60);
        if (arg5 == 8) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field1389[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field1389[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field1389[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IZIIIBI)V")
    public final void method403(int arg0, boolean arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = arg0 - this.field1380;
        if (arg5 != -73) {
            field1378 = null;
        }
        field1382++;
        int var9 = arg6 - this.field1391;
        int var10 = 256;
        if (arg1) {
            var10 += 131072;
        }
        if (arg2 == 1 || arg2 == 3) {
            int var11 = arg3;
            arg3 = arg4;
            arg4 = var11;
        }
        for (int var12 = var8; var12 < arg3 + var8; var12++) {
            if (var12 >= 0 && this.field1390 > var12) {
                for (int var13 = var9; var13 < var9 + arg4; var13++) {
                    if (var13 >= 0 && this.field1388 > var13) {
                        this.method401(var12, var13, 1, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(II)V")
    public class54(int arg0, int arg1) {
        this.field1388 = arg1;
        this.field1390 = arg0;
        this.field1380 = 0;
        this.field1391 = 0;
        this.field1389 = new int[this.field1390][this.field1388];
        this.method392(false);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1387++;
        if (arg1 == arg2 && arg0 == arg3) {
            return true;
        }
        int var8 = arg2 - this.field1380;
        int var9 = arg3 - this.field1391;
        int var10 = arg1 - this.field1380;
        int var11 = arg0 - this.field1391;
        if (arg5 == 0) {
            if (arg6 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1389[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1389[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1389[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1389[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
                if (var8 - 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (~arg5 == arg4) {
            if (arg6 == 0) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1389[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field1389[var10][var9] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg6 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0108) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1389[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            } else if (arg6 == 3) {
                if (var8 - 1 == var10 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field1389[var10][var9] & 0x12C0120) == 0) {
                    return true;
                }
                if (var8 + 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x12C0180) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg5 == 9) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field1389[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field1389[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field1389[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }
}
