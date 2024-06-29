import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    private int field150;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    private int field143;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "[[I")
    public int[][] field121;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field126 = -1;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "Z")
    public static volatile boolean field140 = true;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "Lmc;")
    public static class75 field151 = class30.method234(true, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "Lmc;")
    public static class75 field124 = class30.method234(true, "Texturen geladen)3");

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lpb;")
    public static class92 field131;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[[[B")
    public static byte[][][] field123;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZI)V", line = 12)
    private final void method37(int arg0, int arg1, boolean arg2, int arg3) {
        this.field121[arg0][arg3] = class34.method263(this.field121[arg0][arg3], arg1);
        if (arg2) {
            field122 = 73;
        }
        field141++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIZIII)V", line = 23)
    public final void method38(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field136;
        int var9 = arg1 - this.field133;
        field125++;
        if (arg4 == 1 || arg4 == 3) {
            int var10 = arg2;
            arg2 = arg6;
            arg6 = var10;
        }
        int var11 = arg5;
        if (arg3) {
            var11 = arg5 + 131072;
        }
        for (int var12 = var9; var12 < arg2 + var9; var12++) {
            if (var12 >= 0 && this.field150 > var12) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && this.field143 > var13) {
                        this.method37(var12, var11, false, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 89)
    public static final void method39(boolean arg0) {
        field148++;
        if (arg0) {
            field142 = -119;
        }
        for (class94 var1 = (class94) class31.field689.method248(32); var1 != null; var1 = (class94) class31.field689.method252(75)) {
            if (class99.field2510 != var1.field2365 || var1.field2360) {
                var1.method589(true);
            } else if (class34.field781 >= var1.field2381) {
                var1.method801(4, class71.field1802);
                if (var1.field2360) {
                    var1.method589(true);
                } else {
                    class107.field2679.method189(var1.field2365, var1.field2366, var1.field2376, var1.field2359, 60, var1, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 120)
    public final void method40(int arg0) {
        if (arg0 > -95) {
            this.method37(-79, 105, false, 93);
        }
        for (int var2 = 0; var2 < this.field150; var2++) {
            for (int var3 = 0; var3 < this.field143; var3++) {
                if (var2 == 0 || var3 == 0 || this.field150 - 1 == var2 || this.field143 - 1 == var3) {
                    this.field121[var2][var3] = 16777215;
                } else {
                    this.field121[var2][var3] = 16777216;
                }
            }
        }
        field130++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBIIIII)Z", line = 164)
    public final boolean method41(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field129++;
        if (arg3 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = arg4 - this.field133;
        int var9 = arg5 - this.field136;
        int var10 = arg3 - this.field133;
        int var11 = arg6 - this.field136;
        if (arg2 == 0) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field121[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field121[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field121[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field121[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
                if (var10 - 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 2) {
            if (arg0 == 0) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field121[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11 && (this.field121[var8][var11] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var10 - 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280108) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field121[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var10 - 1 == var8 && var9 == var11) {
                    return true;
                }
                if (var8 == var10 && var9 + 1 == var11 && (this.field121[var8][var11] & 0x1280120) == 0) {
                    return true;
                }
                if (var10 + 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x1280180) == 0) {
                    return true;
                }
                if (var8 == var10 && var9 - 1 == var11) {
                    return true;
                }
            }
        }
        if (arg1 > -117) {
            this.method40(-34);
        }
        if (arg2 == 9) {
            if (var8 == var10 && var9 + 1 == var11 && (this.field121[var8][var11] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var9 - 1 == var11 && (this.field121[var8][var11] & 0x2) == 0) {
                return true;
            }
            if (var10 - 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x8) == 0) {
                return true;
            }
            if (var10 + 1 == var8 && var9 == var11 && (this.field121[var8][var11] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZIIIIII)V", line = 354)
    public final void method42(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field135++;
        int var8 = arg3 - this.field136;
        int var9 = arg5 - this.field133;
        if (arg6 == 1 || arg6 == 3) {
            int var10 = arg2;
            arg2 = arg4;
            arg4 = var10;
        }
        int var11 = 256;
        if (arg0) {
            var11 += 131072;
        }
        if (arg1 != 131072) {
            return;
        }
        for (int var12 = var9; var12 < var9 + arg2; var12++) {
            if (var12 >= 0 && var12 < this.field150) {
                for (int var13 = var8; var13 < arg4 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field143) {
                        this.method48(var13, false, var11, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)V", line = 403)
    public final void method43(int arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field133;
        field138++;
        int var5 = arg1 - this.field136;
        this.field121[var4][var5] = class34.method263(this.field121[var4][var5], arg0);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V", line = 414)
    public static final void method44(boolean arg0) {
        class58.method468(-8, class52.field1320);
        field132++;
        if (class69.field1766 != -1) {
            class58.method468(-124, class69.field1766);
        }
        class71.field1802 = 0;
        client.field374.method767(arg0);
        class117.field2904 = class49.method379(class117.field2904);
        class66.method575();
        class128.method1008(-1, class52.field1320, 0, (byte) -99, 0, 0, 0, 503, 765);
        if (class69.field1766 != -1) {
            class128.method1008(-1, class69.field1766, 0, (byte) -88, 0, 0, 0, 503, 765);
        }
        if (class15.field283) {
            class117.method930(8580);
        } else {
            class50.method396(-1);
            class76.method663(488);
        }
        try {
            Graphics var1 = class108.field2738.getGraphics();
            client.field374.method403(0, (byte) 88, var1, 0);
        } catch (Exception var2) {
            class108.field2738.repaint();
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIZII)V", line = 449)
    public final void method45(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field152++;
        int var7 = arg5 - this.field136;
        int var8 = arg1 - this.field133;
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method48(var7, false, 128, var8);
                this.method48(var7, false, 8, var8 - 1);
            }
            if (arg2 == 1) {
                this.method48(var7, false, 2, var8);
                this.method48(var7 + 1, false, 32, var8);
            }
            if (arg2 == 2) {
                this.method48(var7, false, 8, var8);
                this.method48(var7, false, 128, var8 + 1);
            }
            if (arg2 == 3) {
                this.method48(var7, false, 32, var8);
                this.method48(var7 - 1, false, 2, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method48(var7, false, 1, var8);
                this.method48(var7 + 1, false, 16, var8 - 1);
            }
            if (arg2 == 1) {
                this.method48(var7, false, 4, var8);
                this.method48(var7 + 1, false, 64, var8 + 1);
            }
            if (arg2 == 2) {
                this.method48(var7, false, 16, var8);
                this.method48(var7 - 1, false, 1, var8 + 1);
            }
            if (arg2 == 3) {
                this.method48(var7, false, 64, var8);
                this.method48(var7 - 1, false, 4, var8 - 1);
            }
        }
        if (arg4 != 32768) {
            method46(-115);
        }
        if (arg0 == 2) {
            if (arg2 == 0) {
                this.method48(var7, false, 130, var8);
                this.method48(var7, false, 8, var8 - 1);
                this.method48(var7 + 1, false, 32, var8);
            }
            if (arg2 == 1) {
                this.method48(var7, false, 10, var8);
                this.method48(var7 + 1, false, 32, var8);
                this.method48(var7, false, 128, var8 + 1);
            }
            if (arg2 == 2) {
                this.method48(var7, false, 40, var8);
                this.method48(var7, false, 128, var8 + 1);
                this.method48(var7 - 1, false, 2, var8);
            }
            if (arg2 == 3) {
                this.method48(var7, false, 160, var8);
                this.method48(var7 - 1, false, 2, var8);
                this.method48(var7, false, 8, var8 - 1);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg2 == 0) {
                this.method48(var7, false, 65536, var8);
                this.method48(var7, false, 4096, var8 - 1);
            }
            if (arg2 == 1) {
                this.method48(var7, false, 1024, var8);
                this.method48(var7 + 1, false, 16384, var8);
            }
            if (arg2 == 2) {
                this.method48(var7, false, 4096, var8);
                this.method48(var7, false, 65536, var8 + 1);
            }
            if (arg2 == 3) {
                this.method48(var7, false, 16384, var8);
                this.method48(var7 - 1, false, 1024, var8);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg2 == 0) {
                this.method48(var7, false, 512, var8);
                this.method48(var7 + 1, false, 8192, var8 - 1);
            }
            if (arg2 == 1) {
                this.method48(var7, false, 2048, var8);
                this.method48(var7 + 1, false, 32768, var8 + 1);
            }
            if (arg2 == 2) {
                this.method48(var7, false, 8192, var8);
                this.method48(var7 - 1, false, 512, var8 + 1);
            }
            if (arg2 == 3) {
                this.method48(var7, false, 32768, var8);
                this.method48(var7 - 1, false, 2048, var8 - 1);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg2 == 0) {
            this.method48(var7, false, 66560, var8);
            this.method48(var7, false, 4096, var8 - 1);
            this.method48(var7 + 1, false, 16384, var8);
        }
        if (arg2 == 1) {
            this.method48(var7, false, 5120, var8);
            this.method48(var7 + 1, false, 16384, var8);
            this.method48(var7, false, 65536, var8 + 1);
        }
        if (arg2 == 2) {
            this.method48(var7, false, 20480, var8);
            this.method48(var7, false, 65536, var8 + 1);
            this.method48(var7 - 1, false, 1024, var8);
        }
        if (arg2 == 3) {
            this.method48(var7, false, 81920, var8);
            this.method48(var7 - 1, false, 1024, var8);
            this.method48(var7, false, 4096, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 655)
    public static final void method46(int arg0) {
        field128++;
        if (arg0 != -1) {
            field122 = -118;
        }
        class104.field2638.method767(false);
        class131.field3179 = class49.method379(class131.field3179);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIBI)Z", line = 680)
    public final boolean method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field137++;
        int var9 = arg1 + arg7 - 1;
        if (arg6 >= -57) {
            return false;
        }
        int var10 = arg2 + arg3 - 1;
        if (arg7 <= arg5 && arg5 <= var9 && arg0 >= arg2 && arg0 <= var10) {
            return true;
        } else if (arg7 - 1 == arg5 && arg2 <= arg0 && var10 >= arg0 && (this.field121[arg5 - this.field133][arg0 - this.field136] & 0x8) == 0 && (arg4 & 0x8) == 0) {
            return true;
        } else if (var9 + 1 == arg5 && arg2 <= arg0 && arg0 <= var10 && (this.field121[arg5 - this.field133][arg0 - this.field136] & 0x80) == 0 && (arg4 & 0x2) == 0) {
            return true;
        } else if (arg2 - 1 == arg0 && arg7 <= arg5 && arg5 <= var9 && (this.field121[arg5 - this.field133][arg0 - this.field136] & 0x2) == 0 && (arg4 & 0x4) == 0) {
            return true;
        } else {
            return var10 + 1 == arg0 && arg5 >= arg7 && var9 >= arg5 && (this.field121[arg5 - this.field133][arg0 - this.field136] & 0x20) == 0 && (arg4 & 0x1) == 0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZII)V", line = 719)
    private final void method48(int arg0, boolean arg1, int arg2, int arg3) {
        field144++;
        if (arg1) {
            this.method41(20, (byte) -69, 23, 35, -108, 31, -52);
        }
        this.field121[arg3][arg0] = class56.method456(this.field121[arg3][arg0], 16777215 - arg2);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V", line = 730)
    public static final void method49(int arg0) {
        field122 = 0;
        class74.field1853 = 0;
        class100.field2585 = 0;
        class107.field2692 = -1;
        class42.field1008 = -1;
        class96.field2417 = 0;
        class27.field547 = 0;
        class118.field2923.field1556 = 0;
        class15.field283 = false;
        field127++;
        if (arg0 < 49) {
            method44(true);
        }
        class32.field727 = 0;
        class117.field2896 = -1;
        class97.field2448.field1556 = 0;
        class62.field1648 = -1;
        class17.method121(30, -9411);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(IIIZII)V", line = 754)
    public final void method50(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var7 = arg2 - this.field133;
        int var8 = arg4 - this.field136;
        if (arg1 == 0) {
            if (arg0 == 0) {
                this.method37(var7, 128, false, var8);
                this.method37(var7 - 1, 8, false, var8);
            }
            if (arg0 == 1) {
                this.method37(var7, 2, false, var8);
                this.method37(var7, 32, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method37(var7, 8, false, var8);
                this.method37(var7 + 1, 128, false, var8);
            }
            if (arg0 == 3) {
                this.method37(var7, 32, false, var8);
                this.method37(var7, 2, false, var8 - 1);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg0 == 0) {
                this.method37(var7, 1, false, var8);
                this.method37(var7 - 1, 16, false, var8 + 1);
            }
            if (arg0 == 1) {
                this.method37(var7, 4, false, var8);
                this.method37(var7 + 1, 64, false, var8 + 1);
            }
            if (arg0 == 2) {
                this.method37(var7, 16, false, var8);
                this.method37(var7 + 1, 1, false, var8 - 1);
            }
            if (arg0 == 3) {
                this.method37(var7, 64, false, var8);
                this.method37(var7 - 1, 4, false, var8 - 1);
            }
        }
        field134++;
        if (arg1 == 2) {
            if (arg0 == 0) {
                this.method37(var7, 130, false, var8);
                this.method37(var7 - 1, 8, false, var8);
                this.method37(var7, 32, false, var8 + 1);
            }
            if (arg0 == 1) {
                this.method37(var7, 10, false, var8);
                this.method37(var7, 32, false, var8 + 1);
                this.method37(var7 + 1, 128, false, var8);
            }
            if (arg0 == 2) {
                this.method37(var7, 40, false, var8);
                this.method37(var7 + 1, 128, false, var8);
                this.method37(var7, 2, false, var8 - 1);
            }
            if (arg0 == 3) {
                this.method37(var7, 160, false, var8);
                this.method37(var7, 2, false, var8 - 1);
                this.method37(var7 - 1, 8, false, var8);
            }
        }
        if (arg3) {
            if (arg1 == 0) {
                if (arg0 == 0) {
                    this.method37(var7, 65536, false, var8);
                    this.method37(var7 - 1, 4096, false, var8);
                }
                if (arg0 == 1) {
                    this.method37(var7, 1024, false, var8);
                    this.method37(var7, 16384, false, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method37(var7, 4096, false, var8);
                    this.method37(var7 + 1, 65536, false, var8);
                }
                if (arg0 == 3) {
                    this.method37(var7, 16384, false, var8);
                    this.method37(var7, 1024, false, var8 - 1);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg0 == 0) {
                    this.method37(var7, 512, false, var8);
                    this.method37(var7 - 1, 8192, false, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method37(var7, 2048, false, var8);
                    this.method37(var7 + 1, 32768, false, var8 + 1);
                }
                if (arg0 == 2) {
                    this.method37(var7, 8192, false, var8);
                    this.method37(var7 + 1, 512, false, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method37(var7, 32768, false, var8);
                    this.method37(var7 - 1, 2048, false, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg0 == 0) {
                    this.method37(var7, 66560, false, var8);
                    this.method37(var7 - 1, 4096, false, var8);
                    this.method37(var7, 16384, false, var8 + 1);
                }
                if (arg0 == 1) {
                    this.method37(var7, 5120, false, var8);
                    this.method37(var7, 16384, false, var8 + 1);
                    this.method37(var7 + 1, 65536, false, var8);
                }
                if (arg0 == 2) {
                    this.method37(var7, 20480, false, var8);
                    this.method37(var7 + 1, 65536, false, var8);
                    this.method37(var7, 1024, false, var8 - 1);
                }
                if (arg0 == 3) {
                    this.method37(var7, 81920, false, var8);
                    this.method37(var7, 1024, false, var8 - 1);
                    this.method37(var7 - 1, 4096, false, var8);
                }
            }
        }
        if (arg5 != 1) {
            this.method43(-113, -73, -57);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI)V", line = 966)
    public final void method51(int arg0, boolean arg1, int arg2) {
        int var4 = arg0 - this.field133;
        field139++;
        int var5 = arg2 - this.field136;
        this.field121[var4][var5] = class56.method456(this.field121[var4][var5], 14680063);
        if (arg1) {
            field131 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIBI)Z", line = 994)
    public final boolean method52(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field145++;
        if (arg2 == arg3 && arg0 == arg4) {
            return true;
        }
        int var8 = arg2 - this.field133;
        int var9 = arg4 - this.field136;
        int var10 = arg3 - this.field133;
        int var11 = arg0 - this.field136;
        if (arg5 != -76) {
            return true;
        }
        if (arg6 == 6 || arg6 == 7) {
            if (arg6 == 7) {
                arg1 = arg1 + 2 & 0x3;
            }
            if (arg1 == 0) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field121[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 1) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 - 1 == var9 && (this.field121[var10][var9] & 0x2) == 0) {
                    return true;
                }
            } else if (arg1 == 2) {
                if (var8 - 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x8) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field121[var10][var9] & 0x20) == 0) {
                    return true;
                }
            } else if (arg1 == 3) {
                if (var8 + 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x80) == 0) {
                    return true;
                }
                if (var8 == var10 && var11 + 1 == var9 && (this.field121[var10][var9] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg6 == 8) {
            if (var8 == var10 && var11 + 1 == var9 && (this.field121[var10][var9] & 0x20) == 0) {
                return true;
            }
            if (var8 == var10 && var11 - 1 == var9 && (this.field121[var10][var9] & 0x2) == 0) {
                return true;
            }
            if (var8 - 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x8) == 0) {
                return true;
            }
            if (var8 + 1 == var10 && var9 == var11 && (this.field121[var10][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V", line = 1089)
    public class8(int arg0, int arg1) {
        this.field150 = arg0;
        this.field133 = 0;
        this.field136 = 0;
        this.field143 = arg1;
        this.field121 = new int[this.field150][this.field143];
        this.method40(-117);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 1102)
    public static void method53(byte arg0) {
        field124 = null;
        field123 = null;
        if (arg0 == 63) {
            field151 = null;
            field131 = null;
        }
    }
}
