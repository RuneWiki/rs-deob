import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class47 {

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    private int field1047;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    private int field1059;

    @OriginalMember(owner = "client!h", name = "H", descriptor = "I")
    private int field1075;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "[[I")
    public int[][] field1051;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "Lae;")
    private static class6 field1052 = class64.method474(103, " seconds)3");

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Z")
    public static boolean field1042 = false;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "I")
    public static int field1069 = 99;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    public static int[] field1050 = new int[128];

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lae;")
    public static class6 field1053 = class64.method474(124, "Hidden)2use");

    @OriginalMember(owner = "client!h", name = "E", descriptor = "Lae;")
    public static class6 field1072 = field1052;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lae;")
    public static class6 field1054 = class64.method474(109, " )2> @cya@");

    @OriginalMember(owner = "client!h", name = "s", descriptor = "Lae;")
    public static class6 field1060 = class64.method474(107, "Ignorieren");

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!h", name = "D", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!h", name = "F", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "Lsd;")
    public static class114 field1063;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Lsd;")
    public static class114 field1066;

    @OriginalMember(owner = "client!h", name = "G", descriptor = "Lvb;")
    public static class129 field1074;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[[B")
    public static byte[][] field1068;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIBZI)V", line = 3)
    public final void method372(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        field1070++;
        if (arg4 != -27) {
            return;
        }
        int var8 = 256;
        if (arg0 == 1 || arg0 == 3) {
            int var9 = arg6;
            arg6 = arg1;
            arg1 = var9;
        }
        int var10 = arg2 - this.field1061;
        if (arg5) {
            var8 += 131072;
        }
        int var11 = arg3 - this.field1075;
        for (int var12 = var11; var12 < arg6 + var11; var12++) {
            if (var12 >= 0 && this.field1047 > var12) {
                for (int var13 = var10; var13 < var10 + arg1; var13++) {
                    if (var13 >= 0 && this.field1059 > var13) {
                        this.method378(var13, var12, (byte) 25, var8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZI)V", line = 53)
    public static final void method373(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            method373(32, 73, true, 93);
        }
        field1058++;
        if (class64.field1406 == 0 || arg1 == 0 || class41.field916 >= 50) {
            return;
        }
        class138.field3356[class41.field916] = arg3;
        class129.field3129[class41.field916] = arg1;
        class64.field1407[class41.field916] = arg0;
        class24.field618[class41.field916] = null;
        class111.field2667[class41.field916] = 0;
        class41.field916++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IBIIIIII)Z", line = 89)
    public final boolean method374(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1049++;
        int var9 = arg3 + arg5 - 1;
        int var10 = arg7 + arg6 - 1;
        int var11 = 106 % ((-arg1 - 45) / 57);
        if (arg4 >= arg6 && arg4 <= var10 && arg3 <= arg2 && var9 >= arg2) {
            return true;
        } else if (arg6 - 1 == arg4 && arg2 >= arg3 && arg2 <= var9 && (this.field1051[arg4 - this.field1075][arg2 - this.field1061] & 0x8) == 0 && (arg0 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg4 && arg2 >= arg3 && var9 >= arg2 && (this.field1051[arg4 - this.field1075][arg2 - this.field1061] & 0x80) == 0 && (arg0 & 0x2) == 0) {
            return true;
        } else if (arg3 - 1 == arg2 && arg6 <= arg4 && var10 >= arg4 && (this.field1051[arg4 - this.field1075][arg2 - this.field1061] & 0x2) == 0 && (arg0 & 0x4) == 0) {
            return true;
        } else {
            return var9 + 1 == arg2 && arg4 >= arg6 && var10 >= arg4 && (this.field1051[arg4 - this.field1075][arg2 - this.field1061] & 0x20) == 0 && (arg0 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 122)
    public static final void method375(byte arg0) {
        field1062++;
        if (!class125.field3058) {
            return;
        }
        class30.field738 = null;
        class37.field837 = null;
        class20.field428 = null;
        class104.field2476 = null;
        class138.field3357 = null;
        class26.field640 = null;
        class117.field2779 = null;
        class49.field1105 = null;
        class56.field1227 = null;
        class12.field234 = null;
        class59.field1281 = null;
        class126.field3085 = null;
        class121.field2996 = null;
        class49.field1102 = null;
        if (arg0 != 82) {
            return;
        }
        class135.field3294 = null;
        client.field462 = null;
        class66.field1462 = null;
        class133.field3249 = null;
        class108.field2600 = null;
        class114.field2698 = null;
        class95.field2256 = null;
        class43.field980 = null;
        class70.method519((byte) -93, 10);
        class123.method1014(-113, true);
        class125.field3058 = false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BIIIIZ)V", line = 176)
    public final void method376(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg2 - this.field1075;
        int var8 = arg3 - this.field1061;
        field1046++;
        if (arg4 == 0) {
            if (arg1 == 0) {
                this.method378(var8, var7, (byte) 25, 128);
                this.method378(var8, var7 - 1, (byte) 25, 8);
            }
            if (arg1 == 1) {
                this.method378(var8, var7, (byte) 25, 2);
                this.method378(var8 + 1, var7, (byte) 25, 32);
            }
            if (arg1 == 2) {
                this.method378(var8, var7, (byte) 25, 8);
                this.method378(var8, var7 + 1, (byte) 25, 128);
            }
            if (arg1 == 3) {
                this.method378(var8, var7, (byte) 25, 32);
                this.method378(var8 - 1, var7, (byte) 25, 2);
            }
        }
        if (arg4 == 1 || arg4 == 3) {
            if (arg1 == 0) {
                this.method378(var8, var7, (byte) 25, 1);
                this.method378(var8 + 1, var7 - 1, (byte) 25, 16);
            }
            if (arg1 == 1) {
                this.method378(var8, var7, (byte) 25, 4);
                this.method378(var8 + 1, var7 + 1, (byte) 25, 64);
            }
            if (arg1 == 2) {
                this.method378(var8, var7, (byte) 25, 16);
                this.method378(var8 - 1, var7 + 1, (byte) 25, 1);
            }
            if (arg1 == 3) {
                this.method378(var8, var7, (byte) 25, 64);
                this.method378(var8 - 1, var7 + -1, (byte) 25, 4);
            }
        }
        if (arg4 == 2) {
            if (arg1 == 0) {
                this.method378(var8, var7, (byte) 25, 130);
                this.method378(var8, var7 - 1, (byte) 25, 8);
                this.method378(var8 + 1, var7, (byte) 25, 32);
            }
            if (arg1 == 1) {
                this.method378(var8, var7, (byte) 25, 10);
                this.method378(var8 + 1, var7, (byte) 25, 32);
                this.method378(var8, var7 + 1, (byte) 25, 128);
            }
            if (arg1 == 2) {
                this.method378(var8, var7, (byte) 25, 40);
                this.method378(var8, var7 + 1, (byte) 25, 128);
                this.method378(var8 - 1, var7, (byte) 25, 2);
            }
            if (arg1 == 3) {
                this.method378(var8, var7, (byte) 25, 160);
                this.method378(var8 - 1, var7, (byte) 25, 2);
                this.method378(var8, var7 - 1, (byte) 25, 8);
            }
        }
        if (arg5) {
            if (arg4 == 0) {
                if (arg1 == 0) {
                    this.method378(var8, var7, (byte) 25, 65536);
                    this.method378(var8, var7 - 1, (byte) 25, 4096);
                }
                if (arg1 == 1) {
                    this.method378(var8, var7, (byte) 25, 1024);
                    this.method378(var8 + 1, var7, (byte) 25, 16384);
                }
                if (arg1 == 2) {
                    this.method378(var8, var7, (byte) 25, 4096);
                    this.method378(var8, var7 + 1, (byte) 25, 65536);
                }
                if (arg1 == 3) {
                    this.method378(var8, var7, (byte) 25, 16384);
                    this.method378(var8 - 1, var7, (byte) 25, 1024);
                }
            }
            if (arg4 == 1 || arg4 == 3) {
                if (arg1 == 0) {
                    this.method378(var8, var7, (byte) 25, 512);
                    this.method378(var8 + 1, var7 + -1, (byte) 25, 8192);
                }
                if (arg1 == 1) {
                    this.method378(var8, var7, (byte) 25, 2048);
                    this.method378(var8 + 1, var7 - -1, (byte) 25, 32768);
                }
                if (arg1 == 2) {
                    this.method378(var8, var7, (byte) 25, 8192);
                    this.method378(var8 - 1, var7 + 1, (byte) 25, 512);
                }
                if (arg1 == 3) {
                    this.method378(var8, var7, (byte) 25, 32768);
                    this.method378(var8 - 1, var7 - 1, (byte) 25, 2048);
                }
            }
            if (arg4 == 2) {
                if (arg1 == 0) {
                    this.method378(var8, var7, (byte) 25, 66560);
                    this.method378(var8, var7 - 1, (byte) 25, 4096);
                    this.method378(var8 + 1, var7, (byte) 25, 16384);
                }
                if (arg1 == 1) {
                    this.method378(var8, var7, (byte) 25, 5120);
                    this.method378(var8 + 1, var7, (byte) 25, 16384);
                    this.method378(var8, var7 + 1, (byte) 25, 65536);
                }
                if (arg1 == 2) {
                    this.method378(var8, var7, (byte) 25, 20480);
                    this.method378(var8, var7 + 1, (byte) 25, 65536);
                    this.method378(var8 - 1, var7, (byte) 25, 1024);
                }
                if (arg1 == 3) {
                    this.method378(var8, var7, (byte) 25, 81920);
                    this.method378(var8 - 1, var7, (byte) 25, 1024);
                    this.method378(var8, var7 - 1, (byte) 25, 4096);
                }
            }
        }
        if (arg0 != 40) {
            field1050 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)V", line = 402)
    public final void method377(int arg0, int arg1, byte arg2) {
        field1067++;
        int var4 = arg0 - this.field1075;
        int var5 = arg1 - this.field1061;
        int var6 = -96 % ((arg2 + 50) / 41);
        this.field1051[var4][var5] = class60.method451(this.field1051[var4][var5], 14680063);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBI)V", line = 415)
    private final void method378(int arg0, int arg1, byte arg2, int arg3) {
        field1064++;
        this.field1051[arg1][arg0] = class60.method451(this.field1051[arg1][arg0], 16777215 - arg3);
        if (arg2 != 25) {
            this.method383((byte) -64, -53, -76);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIZIII)V", line = 426)
    public final void method379(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 16384) {
            return;
        }
        field1043++;
        int var7 = arg3 - this.field1061;
        int var8 = arg0 - this.field1075;
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method385(var8, 128, var7, (byte) -69);
                this.method385(var8 - 1, 8, var7, (byte) -69);
            }
            if (arg4 == 1) {
                this.method385(var8, 2, var7, (byte) -69);
                this.method385(var8, 32, var7 + 1, (byte) -69);
            }
            if (arg4 == 2) {
                this.method385(var8, 8, var7, (byte) -69);
                this.method385(var8 + 1, 128, var7, (byte) -69);
            }
            if (arg4 == 3) {
                this.method385(var8, 32, var7, (byte) -69);
                this.method385(var8, 2, var7 - 1, (byte) -69);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method385(var8, 1, var7, (byte) -69);
                this.method385(var8 - 1, 16, var7 + 1, (byte) -69);
            }
            if (arg4 == 1) {
                this.method385(var8, 4, var7, (byte) -69);
                this.method385(var8 + 1, 64, var7 + 1, (byte) -69);
            }
            if (arg4 == 2) {
                this.method385(var8, 16, var7, (byte) -69);
                this.method385(var8 + 1, 1, var7 - 1, (byte) -69);
            }
            if (arg4 == 3) {
                this.method385(var8, 64, var7, (byte) -69);
                this.method385(var8 - 1, 4, var7 - 1, (byte) -69);
            }
        }
        if (arg5 == 2) {
            if (arg4 == 0) {
                this.method385(var8, 130, var7, (byte) -69);
                this.method385(var8 - 1, 8, var7, (byte) -69);
                this.method385(var8, 32, var7 + 1, (byte) -69);
            }
            if (arg4 == 1) {
                this.method385(var8, 10, var7, (byte) -69);
                this.method385(var8, 32, var7 + 1, (byte) -69);
                this.method385(var8 + 1, 128, var7, (byte) -69);
            }
            if (arg4 == 2) {
                this.method385(var8, 40, var7, (byte) -69);
                this.method385(var8 + 1, 128, var7, (byte) -69);
                this.method385(var8, 2, var7 - 1, (byte) -69);
            }
            if (arg4 == 3) {
                this.method385(var8, 160, var7, (byte) -69);
                this.method385(var8, 2, var7 - 1, (byte) -69);
                this.method385(var8 - 1, 8, var7, (byte) -69);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg5 == 0) {
            if (arg4 == 0) {
                this.method385(var8, 65536, var7, (byte) -69);
                this.method385(var8 - 1, 4096, var7, (byte) -69);
            }
            if (arg4 == 1) {
                this.method385(var8, 1024, var7, (byte) -69);
                this.method385(var8, 16384, var7 + 1, (byte) -69);
            }
            if (arg4 == 2) {
                this.method385(var8, 4096, var7, (byte) -69);
                this.method385(var8 + 1, 65536, var7, (byte) -69);
            }
            if (arg4 == 3) {
                this.method385(var8, 16384, var7, (byte) -69);
                this.method385(var8, 1024, var7 - 1, (byte) -69);
            }
        }
        if (arg5 == 1 || arg5 == 3) {
            if (arg4 == 0) {
                this.method385(var8, 512, var7, (byte) -69);
                this.method385(var8 - 1, 8192, var7 + 1, (byte) -69);
            }
            if (arg4 == 1) {
                this.method385(var8, 2048, var7, (byte) -69);
                this.method385(var8 + 1, 32768, var7 + 1, (byte) -69);
            }
            if (arg4 == 2) {
                this.method385(var8, 8192, var7, (byte) -69);
                this.method385(var8 + 1, 512, var7 - 1, (byte) -69);
            }
            if (arg4 == 3) {
                this.method385(var8, 32768, var7, (byte) -69);
                this.method385(var8 - 1, 2048, var7 - 1, (byte) -69);
            }
        }
        if (arg5 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method385(var8, 66560, var7, (byte) -69);
            this.method385(var8 - 1, 4096, var7, (byte) -69);
            this.method385(var8, 16384, var7 + 1, (byte) -69);
        }
        if (arg4 == 1) {
            this.method385(var8, 5120, var7, (byte) -69);
            this.method385(var8, 16384, var7 + 1, (byte) -69);
            this.method385(var8 + 1, 65536, var7, (byte) -69);
        }
        if (arg4 == 2) {
            this.method385(var8, 20480, var7, (byte) -69);
            this.method385(var8 + 1, 65536, var7, (byte) -69);
            this.method385(var8, 1024, var7 - 1, (byte) -69);
        }
        if (arg4 == 3) {
            this.method385(var8, 81920, var7, (byte) -69);
            this.method385(var8, 1024, var7 - 1, (byte) -69);
            this.method385(var8 - 1, 4096, var7, (byte) -69);
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 640)
    public static void method380(int arg0) {
        field1072 = null;
        field1068 = null;
        field1063 = null;
        field1060 = null;
        field1054 = null;
        field1052 = null;
        field1074 = null;
        field1066 = null;
        field1050 = null;
        if (arg0 == 17448960) {
            field1053 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIBIII)V", line = 660)
    public final void method381(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        int var8 = arg1 - this.field1075;
        if (arg3 != -54) {
            return;
        }
        int var9 = arg4 - this.field1061;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg2;
            arg2 = arg5;
            arg5 = var10;
        }
        int var11 = 256;
        field1057++;
        if (arg0) {
            var11 += 131072;
        }
        for (int var12 = var8; var12 < arg2 + var8; var12++) {
            if (var12 >= 0 && this.field1047 > var12) {
                for (int var13 = var9; var13 < arg5 + var9; var13++) {
                    if (var13 >= 0 && var13 < this.field1059) {
                        this.method385(var12, var11, var13, (byte) -69);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 710)
    public final void method382(byte arg0) {
        field1071++;
        if (arg0 > -87) {
            return;
        }
        for (int var2 = 0; var2 < this.field1047; var2++) {
            for (int var3 = 0; var3 < this.field1059; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1047 - 1 == var2 || this.field1059 - 1 == var3) {
                    this.field1051[var2][var3] = 16777215;
                } else {
                    this.field1051[var2][var3] = 16777216;
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BII)V", line = 741)
    public final void method383(byte arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field1061;
        if (arg0 != -85) {
            this.method386(-74, 103, 65, -48, -84, -47, 32);
        }
        field1048++;
        int var5 = arg2 - this.field1075;
        this.field1051[var5][var4] = class105.method885(this.field1051[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIBIIII)Z", line = 757)
    public final boolean method384(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1056++;
        if (arg1 == arg6 && arg0 == arg5) {
            return true;
        }
        int var8 = arg1 - this.field1075;
        int var9 = arg6 - this.field1075;
        int var10 = arg5 - this.field1061;
        int var11 = arg0 - this.field1061;
        if (arg3 == 6 || arg3 == 7) {
            if (arg3 == 7) {
                arg4 = arg4 + 2 & 0x3;
            }
            if (arg4 == 0) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field1051[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 - 1 == var10 && (this.field1051[var9][var10] & 0x2) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var8 - 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field1051[var9][var10] & 0x20) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var8 + 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var9 && var11 + 1 == var10 && (this.field1051[var9][var10] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 != -119) {
            return true;
        }
        if (arg3 == 8) {
            if (var8 == var9 && var11 + 1 == var10 && (this.field1051[var9][var10] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var11 - 1 == var10 && (this.field1051[var9][var10] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var9 && var10 == var11 && (this.field1051[var9][var10] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)V", line = 871)
    private final void method385(int arg0, int arg1, int arg2, byte arg3) {
        field1045++;
        if (arg3 == -69) {
            this.field1051[arg0][arg2] = class105.method885(this.field1051[arg0][arg2], arg1);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)Z", line = 888)
    public final boolean method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1055++;
        if (arg2 == arg5 && arg0 == arg1) {
            return true;
        }
        int var8 = arg5 - this.field1075;
        int var9 = arg2 - this.field1075;
        int var10 = arg0 - this.field1061;
        if (arg4 != 28543) {
            this.method376((byte) -119, -119, 64, -3, -74, true);
        }
        int var11 = arg1 - this.field1061;
        if (arg6 == 0) {
            if (arg3 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1051[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1051[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1051[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1051[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
                if (var9 - 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 2) {
            if (arg3 == 0) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1051[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 1) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11 && (this.field1051[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg3 == 2) {
                if (var9 - 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1051[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            } else if (arg3 == 3) {
                if (var9 - 1 == var8 && var10 == var11) {
                    return true;
                }
                if (var8 == var9 && var10 + 1 == var11 && (this.field1051[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var9 + 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var9 && var10 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg6 == 9) {
            if (var8 == var9 && var10 + 1 == var11 && (this.field1051[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var9 && var10 - 1 == var11 && (this.field1051[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var8 && var10 == var11 && (this.field1051[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lbf;II)Z", line = 1070)
    public static final boolean method387(class14 arg0, int arg1, int arg2) {
        field1044++;
        byte[] var3 = arg0.method146(arg1, (byte) -17);
        if (arg2 <= 18) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            class78.method671(-123, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(II)V", line = 1090)
    public class47(int arg0, int arg1) {
        this.field1047 = arg0;
        this.field1059 = arg1;
        this.field1075 = 0;
        this.field1061 = 0;
        this.field1051 = new int[this.field1047][this.field1059];
        this.method382((byte) -108);
    }
}
