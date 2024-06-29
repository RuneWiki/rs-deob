import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class47 {

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    private int field1107 = 0;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    private int field1110;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[[I")
    public int[][] field1118;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lod;")
    private static class101 field1111 = class46.method335(97, "Unable to find ");

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lod;")
    public static class101 field1120 = class46.method335(99, "null");

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lod;")
    public static class101 field1125 = class46.method335(76, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1101 = 0;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lod;")
    public static class101 field1129 = class46.method335(127, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
    public static int[] field1105 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lod;")
    public static class101 field1126 = field1111;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "Lod;")
    private static class101 field1135 = class46.method335(116, "green:");

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lod;")
    public static class101 field1127 = class46.method335(-108, "titlebutton");

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lod;")
    public static class101 field1121 = field1135;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public static int field1130 = 1;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lod;")
    public static class101 field1102 = field1135;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lt;")
    public static class132 field1113;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z")
    public static final boolean method336(int arg0, int arg1, int arg2) {
        field1122++;
        if (arg2 > -95) {
            field1119 = -100;
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        class24 var3 = class94.method652(arg0, 0);
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method191(true, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIZ)V")
    public final void method337(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field1107;
        if (!arg2) {
            method345((byte) 24, 112);
        }
        int var5 = arg1 - this.field1108;
        field1117++;
        this.field1118[var5][var4] = class13.method96(this.field1118[var5][var4], 2097152);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1131++;
        int var9 = arg4 + arg6 - 1;
        int var10 = arg3 + arg5 - 1;
        if (arg3 <= arg2 && var10 >= arg2 && arg7 >= arg4 && var9 >= arg7) {
            return true;
        } else if (arg3 - 1 == arg2 && arg4 <= arg7 && arg7 <= var9 && (this.field1118[arg2 - this.field1108][arg7 - this.field1107] & 0x8) == 0 && (arg1 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg7 >= arg4 && var9 >= arg7 && (this.field1118[arg2 - this.field1108][arg7 - this.field1107] & 0x80) == 0 && (arg1 & 0x2) == 0) {
            return true;
        } else if (arg4 - 1 == arg7 && arg2 >= arg3 && arg2 <= var10 && (this.field1118[arg2 - this.field1108][arg7 - this.field1107] & 0x2) == 0 && (arg1 & 0x4) == 0) {
            return true;
        } else if (var9 + 1 == arg7 && arg2 >= arg3 && arg2 <= var10 && (this.field1118[arg2 - this.field1108][arg7 - this.field1107] & 0x20) == 0 && (arg1 & 0x1) == 0) {
            return true;
        } else {
            if (arg0 >= -123) {
                method342(3, (byte) 47, null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(III)V")
    public final void method339(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1108;
        field1114++;
        int var5 = arg1 - this.field1107;
        if (arg0 == 10778) {
            this.field1118[var4][var5] = class41.method307(this.field1118[var4][var5], -262145);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIBII)Z")
    public final boolean method340(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field1115++;
        if (arg5 == arg6 && arg0 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field1107;
        if (arg4 <= 81) {
            this.method346(-58, 29, -10, 16);
        }
        int var9 = arg0 - this.field1107;
        int var10 = arg6 - this.field1108;
        int var11 = arg5 - this.field1108;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1118[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 - 1 == var9 && (this.field1118[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var11 - 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1118[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var11 + 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var10 == var11 && var8 + 1 == var9 && (this.field1118[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var10 == var11 && var8 + 1 == var9 && (this.field1118[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var10 == var11 && var8 - 1 == var9 && (this.field1118[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var10 && var8 == var9 && (this.field1118[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIIZ)V")
    public final void method341(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4 - this.field1108;
        field1133++;
        int var8 = arg1 - this.field1107;
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method352(var8, (byte) -112, 128, var7);
                this.method352(var8, (byte) -112, 8, var7 - 1);
            }
            if (arg2 == 1) {
                this.method352(var8, (byte) -112, 2, var7);
                this.method352(var8 + 1, (byte) -112, 32, var7);
            }
            if (arg2 == 2) {
                this.method352(var8, (byte) -112, 8, var7);
                this.method352(var8, (byte) -112, 128, var7 + 1);
            }
            if (arg2 == 3) {
                this.method352(var8, (byte) -112, 32, var7);
                this.method352(var8 - 1, (byte) -112, 2, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method352(var8, (byte) -112, 1, var7);
                this.method352(var8 + 1, (byte) -112, 16, var7 - 1);
            }
            if (arg2 == 1) {
                this.method352(var8, (byte) -112, 4, var7);
                this.method352(var8 + 1, (byte) -112, 64, var7 + 1);
            }
            if (arg2 == 2) {
                this.method352(var8, (byte) -112, 16, var7);
                this.method352(var8 - 1, (byte) -112, 1, var7 + 1);
            }
            if (arg2 == 3) {
                this.method352(var8, (byte) -112, 64, var7);
                this.method352(var8 - 1, (byte) -112, 4, var7 - 1);
            }
        }
        if (arg3 == 2) {
            if (arg2 == 0) {
                this.method352(var8, (byte) -112, 130, var7);
                this.method352(var8, (byte) -112, 8, var7 - 1);
                this.method352(var8 + 1, (byte) -112, 32, var7);
            }
            if (arg2 == 1) {
                this.method352(var8, (byte) -112, 10, var7);
                this.method352(var8 + 1, (byte) -112, 32, var7);
                this.method352(var8, (byte) -112, 128, var7 + 1);
            }
            if (arg2 == 2) {
                this.method352(var8, (byte) -112, 40, var7);
                this.method352(var8, (byte) -112, 128, var7 + 1);
                this.method352(var8 - 1, (byte) -112, 2, var7);
            }
            if (arg2 == 3) {
                this.method352(var8, (byte) -112, 160, var7);
                this.method352(var8 - 1, (byte) -112, 2, var7);
                this.method352(var8, (byte) -112, 8, var7 - 1);
            }
        }
        if (arg0 || !arg5) {
            return;
        }
        if (arg3 == 0) {
            if (arg2 == 0) {
                this.method352(var8, (byte) -112, 65536, var7);
                this.method352(var8, (byte) -112, 4096, var7 - 1);
            }
            if (arg2 == 1) {
                this.method352(var8, (byte) -112, 1024, var7);
                this.method352(var8 + 1, (byte) -112, 16384, var7);
            }
            if (arg2 == 2) {
                this.method352(var8, (byte) -112, 4096, var7);
                this.method352(var8, (byte) -112, 65536, var7 + 1);
            }
            if (arg2 == 3) {
                this.method352(var8, (byte) -112, 16384, var7);
                this.method352(var8 - 1, (byte) -112, 1024, var7);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg2 == 0) {
                this.method352(var8, (byte) -112, 512, var7);
                this.method352(var8 + 1, (byte) -112, 8192, var7 - 1);
            }
            if (arg2 == 1) {
                this.method352(var8, (byte) -112, 2048, var7);
                this.method352(var8 + 1, (byte) -112, 32768, var7 + 1);
            }
            if (arg2 == 2) {
                this.method352(var8, (byte) -112, 8192, var7);
                this.method352(var8 - 1, (byte) -112, 512, var7 + 1);
            }
            if (arg2 == 3) {
                this.method352(var8, (byte) -112, 32768, var7);
                this.method352(var8 - 1, (byte) -112, 2048, var7 - 1);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method352(var8, (byte) -112, 66560, var7);
            this.method352(var8, (byte) -112, 4096, var7 - 1);
            this.method352(var8 + 1, (byte) -112, 16384, var7);
        }
        if (arg2 == 1) {
            this.method352(var8, (byte) -112, 5120, var7);
            this.method352(var8 + 1, (byte) -112, 16384, var7);
            this.method352(var8, (byte) -112, 65536, var7 + 1);
        }
        if (arg2 == 2) {
            this.method352(var8, (byte) -112, 20480, var7);
            this.method352(var8, (byte) -112, 65536, var7 + 1);
            this.method352(var8 - 1, (byte) -112, 1024, var7);
        }
        if (arg2 == 3) {
            this.method352(var8, (byte) -112, 81920, var7);
            this.method352(var8 - 1, (byte) -112, 1024, var7);
            this.method352(var8, (byte) -112, 4096, var7 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBLc;)Lsb;")
    public static final class127 method342(int arg0, byte arg1, class15 arg2) {
        field1136++;
        byte[] var3 = arg2.method108(arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 124) {
                field1101 = -111;
            }
            return new class127(var3);
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(III)V")
    public final void method343(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1108;
        int var5 = arg1 - this.field1107;
        this.field1118[var4][var5] = class13.method96(this.field1118[var4][var5], 262144);
        field1109++;
        if (arg0 >= -2) {
            field1102 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIZZI)V")
    public final void method344(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        int var8 = 256;
        int var9 = arg0 - this.field1107;
        field1123++;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg2;
            arg2 = arg1;
            arg1 = var10;
        }
        int var11 = arg3 - this.field1108;
        if (arg4) {
            var8 += 131072;
        }
        if (arg5) {
            this.field1110 = -38;
        }
        for (int var12 = var11; var12 < arg2 + var11; var12++) {
            if (var12 >= 0 && this.field1110 > var12) {
                for (int var13 = var9; var13 < arg1 + var9; var13++) {
                    if (var13 >= 0 && this.field1128 > var13) {
                        this.method352(var13, (byte) -112, var8, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)Lod;")
    public static final class101 method345(byte arg0, int arg1) {
        field1132++;
        class101 var2 = class82.method592(false, arg1);
        int var3 = var2.method737(0) - 3;
        int var4 = -57 / ((80 - arg0) / 45);
        while (var3 > 0) {
            var2 = class15.method101(81, new class101[] { var2.method725(0, -124, var3), class54.field1239, var2.method707((byte) 101, var3) });
            var3 -= 3;
        }
        if (var2.method737(0) > 9) {
            return class15.method101(-21, new class101[] { class61.field1357, var2.method725(0, -104, var2.method737(0) - 8), class129.field2949, class119.field2628, var2, class142.field3273 });
        } else if (var2.method737(0) > 6) {
            return class15.method101(90, new class101[] { class26.field687, var2.method725(0, -107, var2.method737(0) - 4), class112.field2402, class119.field2628, var2, class142.field3273 });
        } else {
            return class15.method101(-79, new class101[] { class56.field1267, var2, class79.field1666 });
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
    private final void method346(int arg0, int arg1, int arg2, int arg3) {
        this.field1118[arg0][arg1] = class13.method96(this.field1118[arg0][arg1], arg3);
        field1104++;
        int var5 = -31 / ((71 - arg2) / 50);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIZ)V")
    public final void method347(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg3 - this.field1108;
        field1116++;
        if (arg0 != 16) {
            return;
        }
        int var8 = arg1 - this.field1107;
        int var9 = 256;
        if (arg5) {
            var9 += 131072;
        }
        for (int var10 = var7; var10 < arg4 + var7; var10++) {
            if (var10 >= 0 && this.field1110 > var10) {
                for (int var11 = var8; var11 < arg2 + var8; var11++) {
                    if (var11 >= 0 && var11 < this.field1128) {
                        this.method346(var10, var11, 125, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public final void method348(int arg0) {
        if (arg0 <= 40) {
            return;
        }
        for (int var2 = 0; var2 < this.field1110; var2++) {
            for (int var3 = 0; var3 < this.field1128; var3++) {
                if (var2 == 0 || var3 == 0 || var2 >= this.field1110 - 5 || var3 >= this.field1128 - 5) {
                    this.field1118[var2][var3] = 16777215;
                } else {
                    this.field1118[var2][var3] = 16777216;
                }
            }
        }
        field1134++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIBI)Z")
    public final boolean method349(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1112++;
        if (arg2 == arg3 && arg0 == arg6) {
            return true;
        }
        int var8 = arg0 - this.field1107;
        int var9 = arg3 - this.field1108;
        int var10 = arg2 - this.field1108;
        int var11 = arg6 - this.field1107;
        if (arg1 == 0) {
            if (arg4 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1118[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1118[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1118[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1118[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
                if (var10 - 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1118[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 1) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1118[var9][var8] & 0x12C0102) == 0) {
                    return true;
                }
            } else if (arg4 == 2) {
                if (var10 - 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0108) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1118[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            } else if (arg4 == 3) {
                if (var10 - 1 == var9 && var8 == var11) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1118[var9][var8] & 0x12C0120) == 0) {
                    return true;
                }
                if (var10 + 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x12C0180) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8) {
                    return true;
                }
            }
        }
        if (arg1 == 9) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field1118[var9][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field1118[var9][var8] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var9 && var8 == var11 && (this.field1118[var9][var8] & 0x80) == 0) {
                return true;
            }
        }
        if (arg5 != 58) {
            field1135 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method350(byte arg0) {
        int var1 = 23 % ((arg0 - 42) / 48);
        field1135 = null;
        field1126 = null;
        field1111 = null;
        field1105 = null;
        field1113 = null;
        field1121 = null;
        field1125 = null;
        field1127 = null;
        field1129 = null;
        field1120 = null;
        field1102 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIIIB)V")
    public final void method351(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = arg4 - this.field1107;
        field1106++;
        int var8 = arg3 - this.field1108;
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method346(var8, var7, -79, 128);
                this.method346(var8 - 1, var7, 122, 8);
            }
            if (arg1 == 1) {
                this.method346(var8, var7, -2, 2);
                this.method346(var8, var7 + 1, -81, 32);
            }
            if (arg1 == 2) {
                this.method346(var8, var7, -5, 8);
                this.method346(var8 + 1, var7, -60, 128);
            }
            if (arg1 == 3) {
                this.method346(var8, var7, -14, 32);
                this.method346(var8, var7 - 1, -47, 2);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method346(var8, var7, 123, 1);
                this.method346(var8 - 1, var7 + 1, -112, 16);
            }
            if (arg1 == 1) {
                this.method346(var8, var7, -94, 4);
                this.method346(var8 + 1, var7 + 1, -11, 64);
            }
            if (arg1 == 2) {
                this.method346(var8, var7, 124, 16);
                this.method346(var8 + 1, var7 + -1, 121, 1);
            }
            if (arg1 == 3) {
                this.method346(var8, var7, 19, 64);
                this.method346(var8 - 1, var7 + -1, -115, 4);
            }
        }
        if (arg5 < 114) {
            this.field1110 = -97;
        }
        if (arg2 == 2) {
            if (arg1 == 0) {
                this.method346(var8, var7, 122, 130);
                this.method346(var8 - 1, var7, 121, 8);
                this.method346(var8, var7 + 1, -13, 32);
            }
            if (arg1 == 1) {
                this.method346(var8, var7, -113, 10);
                this.method346(var8, var7 + 1, 124, 32);
                this.method346(var8 + 1, var7, 126, 128);
            }
            if (arg1 == 2) {
                this.method346(var8, var7, 4, 40);
                this.method346(var8 + 1, var7, -53, 128);
                this.method346(var8, var7 - 1, -50, 2);
            }
            if (arg1 == 3) {
                this.method346(var8, var7, 127, 160);
                this.method346(var8, var7 - 1, 124, 2);
                this.method346(var8 - 1, var7, -87, 8);
            }
        }
        if (!arg0) {
            return;
        }
        if (arg2 == 0) {
            if (arg1 == 0) {
                this.method346(var8, var7, 122, 65536);
                this.method346(var8 - 1, var7, -18, 4096);
            }
            if (arg1 == 1) {
                this.method346(var8, var7, 123, 1024);
                this.method346(var8, var7 + 1, -44, 16384);
            }
            if (arg1 == 2) {
                this.method346(var8, var7, -40, 4096);
                this.method346(var8 + 1, var7, -29, 65536);
            }
            if (arg1 == 3) {
                this.method346(var8, var7, -83, 16384);
                this.method346(var8, var7 - 1, 127, 1024);
            }
        }
        if (arg2 == 1 || arg2 == 3) {
            if (arg1 == 0) {
                this.method346(var8, var7, -22, 512);
                this.method346(var8 - 1, var7 + 1, -85, 8192);
            }
            if (arg1 == 1) {
                this.method346(var8, var7, -43, 2048);
                this.method346(var8 + 1, var7 + 1, 122, 32768);
            }
            if (arg1 == 2) {
                this.method346(var8, var7, 125, 8192);
                this.method346(var8 + 1, var7 + -1, 125, 512);
            }
            if (arg1 == 3) {
                this.method346(var8, var7, 124, 32768);
                this.method346(var8 - 1, var7 + -1, -16, 2048);
            }
        }
        if (arg2 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method346(var8, var7, -39, 66560);
            this.method346(var8 - 1, var7, -94, 4096);
            this.method346(var8, var7 + 1, 124, 16384);
        }
        if (arg1 == 1) {
            this.method346(var8, var7, 126, 5120);
            this.method346(var8, var7 + 1, 6, 16384);
            this.method346(var8 + 1, var7, 127, 65536);
        }
        if (arg1 == 2) {
            this.method346(var8, var7, -126, 20480);
            this.method346(var8 + 1, var7, -32, 65536);
            this.method346(var8, var7 - 1, -64, 1024);
        }
        if (arg1 == 3) {
            this.method346(var8, var7, -33, 81920);
            this.method346(var8, var7 - 1, 121, 1024);
            this.method346(var8 - 1, var7, -86, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBII)V")
    private final void method352(int arg0, byte arg1, int arg2, int arg3) {
        this.field1118[arg3][arg0] = class41.method307(this.field1118[arg3][arg0], ~arg2);
        if (arg1 == -112) {
            field1103++;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(II)V")
    public class47(int arg0, int arg1) {
        this.field1128 = arg1;
        this.field1110 = arg0;
        this.field1118 = new int[this.field1110][this.field1128];
        this.field1108 = 0;
        this.method348(42);
    }
}
