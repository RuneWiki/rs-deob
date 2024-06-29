import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lde;")
    private class26 field165 = null;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lde;")
    private class26 field166 = null;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    private int field177 = 65000;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lae;")
    public static class6 field172 = class64.method474(122, "Empf-=nger:");

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Le;")
    public static class30 field171 = new class30(32);

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "Lae;")
    public static class6 field181 = class64.method474(122, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Led;IZ)Z", line = 5)
    public static final boolean method76(class31 arg0, int arg1, boolean arg2) {
        class87.field2102 = 20;
        field176++;
        try {
            class108.field2590 = (class122) Class.forName("ha").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            class84 var3 = arg0.method279(arg1 ^ arg1);
            if (var3 != null) {
                class108.field2590 = new class48(arg0, var3);
                return true;
            } else if (arg2) {
                class108.field2590 = new class75(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lte;I)V", line = 42)
    public static final void method77(class121 arg0, int arg1) {
        int var2 = arg0.field2953;
        field169++;
        if (var2 >= 1 && var2 <= 100 || !(var2 < 701 || var2 > 800)) {
            if (class20.field414 == 0) {
                if (var2 == 1) {
                    arg0.field2889 = class24.field619;
                    arg0.field2965 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2889 = class46.field1039;
                    arg0.field2965 = 0;
                    return;
                }
            }
            if (class20.field414 == 1) {
                if (var2 == 1) {
                    arg0.field2889 = class72.field1647;
                    arg0.field2965 = 0;
                    return;
                }
                if (var2 == 2) {
                    arg0.field2889 = class46.field1030;
                    arg0.field2965 = 0;
                    return;
                }
                if (var2 == 3) {
                    arg0.field2889 = class20.field438;
                    arg0.field2965 = 0;
                    return;
                }
            }
            if (var2 > 700) {
                var2 -= 601;
            } else {
                var2--;
            }
            int var3 = class7.field139;
            if (class20.field414 != 2) {
                var3 = 0;
            }
            if (var3 <= var2) {
                arg0.field2965 = 0;
                arg0.field2889 = class133.field3262;
            } else {
                arg0.field2889 = class41.field924[var2];
                arg0.field2965 = 1;
            }
        } else if (var2 >= 101 && var2 <= 200 || var2 >= 801 && var2 <= 900) {
            if (var2 > 800) {
                var2 -= 701;
            } else {
                var2 -= 101;
            }
            int var4 = class7.field139;
            if (class20.field414 != 2) {
                var4 = 0;
            }
            if (var2 >= var4) {
                arg0.field2889 = class133.field3262;
                arg0.field2965 = 0;
            } else {
                if (class66.field1470[var2] == 0) {
                    arg0.field2889 = class85.method731(new class6[] { class96.field2274, class82.field2014 }, 14569);
                } else if (class66.field1470[var2] >= 5000) {
                    if (class66.field1470[var2] == class26.field654) {
                        arg0.field2889 = class85.method731(new class6[] { class70.field1575, class81.field1981, class114.method942((byte) 71, class66.field1470[var2] - 5000) }, 14569);
                    } else {
                        arg0.field2889 = class85.method731(new class6[] { class30.field728, class81.field1981, class114.method942((byte) 71, class66.field1470[var2] - 5000) }, 14569);
                    }
                } else if (class66.field1470[var2] == class26.field654) {
                    arg0.field2889 = class85.method731(new class6[] { class70.field1575, class103.field2434, class114.method942((byte) 71, class66.field1470[var2]) }, 14569);
                } else {
                    arg0.field2889 = class85.method731(new class6[] { class30.field728, class103.field2434, class114.method942((byte) 71, class66.field1470[var2]) }, 14569);
                }
                arg0.field2965 = 1;
            }
        } else if (var2 == 203) {
            int var5 = class7.field139;
            if (class20.field414 != 2) {
                var5 = 0;
            }
            arg0.field2972 = var5 * 15 + 20;
            if (arg0.field2872 >= arg0.field2972) {
                arg0.field2972 = arg0.field2872 + 1;
            }
        } else if (var2 >= 401 && var2 <= 500) {
            var2 -= 401;
            if (var2 == 0 && class20.field414 == 0) {
                arg0.field2965 = 0;
                arg0.field2889 = class126.field3101;
            } else if (var2 == 1 && class20.field414 == 0) {
                arg0.field2889 = class46.field1039;
                arg0.field2965 = 0;
            } else {
                int var6 = class24.field613;
                if (class20.field414 == 0) {
                    var6 = 0;
                }
                if (var6 <= var2) {
                    arg0.field2889 = class133.field3262;
                    arg0.field2965 = 0;
                } else {
                    arg0.field2889 = class95.method783(class64.field1402[var2], (byte) 83).method44((byte) -85);
                    arg0.field2965 = 1;
                }
            }
        } else if (var2 == 503) {
            arg0.field2972 = class24.field613 * 15 + 20;
            if (arg0.field2872 >= arg0.field2972) {
                arg0.field2972 = arg0.field2872 + 1;
            }
        } else if (var2 == 324) {
            if (class129.field3117 == -1) {
                class37.field853 = arg0.field2897;
                class129.field3117 = arg0.field2970;
            }
            if (class32.field793.field1999) {
                arg0.field2970 = class129.field3117;
            } else {
                arg0.field2970 = class37.field853;
            }
        } else if (var2 == 325) {
            if (class129.field3117 == -1) {
                class37.field853 = arg0.field2897;
                class129.field3117 = arg0.field2970;
            }
            if (class32.field793.field1999) {
                arg0.field2970 = class37.field853;
            } else {
                arg0.field2970 = class129.field3117;
            }
        } else if (var2 == 327) {
            arg0.field2975 = 150;
            arg0.field2868 = (int) (Math.sin((double) class5.field61 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2864 = 5;
            arg0.field2886 = 0;
        } else if (var2 == 328) {
            arg0.field2975 = 150;
            arg0.field2868 = (int) (Math.sin((double) class5.field61 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2864 = 5;
            arg0.field2886 = 1;
        } else {
            int var7 = -5 % ((arg1 - 52) / 55);
            if (var2 == 600) {
                arg0.field2889 = class85.method731(new class6[] { class133.field3260, class7.field154 }, 14569);
            } else if (var2 == 620) {
                if (field175 < 1) {
                    arg0.field2889 = class133.field3262;
                } else if (class125.field3046) {
                    arg0.field2889 = class69.field1525;
                    arg0.field2952 = 16711680;
                } else {
                    arg0.field2889 = class18.field361;
                    arg0.field2952 = 16777215;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)Z", line = 332)
    public final boolean method78(int arg0, byte[] arg1, int arg2, int arg3) {
        field173++;
        class26 var5 = this.field166;
        synchronized (this.field166) {
            if (~arg3 > arg0 || this.field177 < arg3) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method79((byte) -122, arg2, true, arg3, arg1);
            if (!var6) {
                var6 = this.method79((byte) -70, arg2, false, arg3, arg1);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIZI[B)Z", line = 362)
    private final boolean method79(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4) {
        field174++;
        class26 var6 = this.field166;
        synchronized (this.field166) {
            try {
                if (arg0 >= -37) {
                    field181 = null;
                }
                int var7;
                if (arg2) {
                    if (this.field165.method236(-85) < (long) (arg1 * 6 + 6)) {
                        return false;
                    }
                    this.field165.method232(0, (long) (arg1 * 6));
                    this.field165.method235(class30.field709, 6, -13443, 0);
                    var7 = (class30.field709[5] & 0xFF) + ((class30.field709[4] & 0xFF) << 8) + ((class30.field709[3] & 0xFF) << 16);
                    if (var7 <= 0 || (long) var7 > this.field166.method236(92) / 520L) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field166.method236(-122) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class30.field709[5] = (byte) var7;
                class30.field709[4] = (byte) (var7 >> 8);
                class30.field709[0] = (byte) (arg3 >> 16);
                int var10 = 0;
                class30.field709[1] = (byte) (arg3 >> 8);
                class30.field709[2] = (byte) arg3;
                class30.field709[3] = (byte) (var7 >> 16);
                this.field165.method232(0, (long) (arg1 * 6));
                this.field165.method242(6, 0, -23910, class30.field709);
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label109: {
                            this.field166.method232(0, (long) (var7 * 520));
                            try {
                                this.field166.method235(class30.field709, 8, -13443, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class30.field709[6] & 0xFF) + ((class30.field709[5] & 0xFF) << 8) + ((class30.field709[4] & 0xFF) << 16);
                            int var13 = ((class30.field709[0] & 0xFF) << 8) + (class30.field709[1] & 0xFF);
                            int var14 = class30.field709[7] & 0xFF;
                            int var15 = ((class30.field709[2] & 0xFF) << 8) + (class30.field709[3] & 0xFF);
                            if (arg1 == var13 && var11 == var15 && this.field168 == var14) {
                                if (var12 >= 0 && (long) var12 <= this.field166.method236(109) / 520L) {
                                    break label109;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field166.method236(122) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class30.field709[3] = (byte) var11;
                    int var18 = arg3 - var10;
                    class30.field709[2] = (byte) (var11 >> 8);
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class30.field709[6] = (byte) var12;
                    class30.field709[4] = (byte) (var12 >> 16);
                    var11++;
                    class30.field709[5] = (byte) (var12 >> 8);
                    class30.field709[7] = (byte) this.field168;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class30.field709[0] = (byte) (arg1 >> 8);
                    class30.field709[1] = (byte) arg1;
                    this.field166.method232(0, (long) (var7 * 520));
                    var7 = var12;
                    this.field166.method242(8, 0, -23910, class30.field709);
                    this.field166.method242(var18, var10, -23910, arg4);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[B", line = 484)
    public final byte[] method80(int arg0, int arg1) {
        field170++;
        class26 var3 = this.field166;
        synchronized (this.field166) {
            try {
                if (this.field165.method236(115) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field165.method232(0, (long) (arg1 * 6));
                this.field165.method235(class30.field709, 6, -13443, 0);
                int var5 = (class30.field709[2] & 0xFF) + ((class30.field709[1] & 0xFF) << 8) + ((class30.field709[0] & 0xFF) << 16);
                int var6 = (class30.field709[5] & 0xFF) + ((class30.field709[3] & 0xFF) << 16) + ((class30.field709[4] & 0xFF) << 8);
                if (var5 < 0 || var5 > this.field177) {
                    return null;
                }
                if (arg0 >= -51) {
                    this.field168 = 81;
                }
                if (var6 <= 0 || (long) var6 > this.field166.method236(-125) / 520L) {
                    return null;
                }
                int var9 = 0;
                int var10 = 0;
                byte[] var11 = new byte[var5];
                while (var10 < var5) {
                    if (var6 == 0) {
                        return null;
                    }
                    int var13 = var5 - var10;
                    this.field166.method232(0, (long) (var6 * 520));
                    if (var13 > 512) {
                        var13 = 512;
                    }
                    this.field166.method235(class30.field709, var13 + 8, -13443, 0);
                    int var14 = ((class30.field709[4] & 0xFF) << 16) + (class30.field709[6] & 0xFF) + ((class30.field709[5] & 0xFF) << 8);
                    int var15 = class30.field709[7] & 0xFF;
                    int var16 = ((class30.field709[2] & 0xFF) << 8) + (class30.field709[3] & 0xFF);
                    int var17 = ((class30.field709[0] & 0xFF) << 8) + (class30.field709[1] & 0xFF);
                    if (arg1 == var17 && var9 == var16 && this.field168 == var15) {
                        if (var14 >= 0 && this.field166.method236(-100) / 520L >= (long) var14) {
                            for (int var20 = 0; var20 < var13; var20++) {
                                var11[var10++] = class30.field709[var20 + 8];
                            }
                            var9++;
                            var6 = var14;
                            continue;
                        }
                        return null;
                    }
                    return null;
                }
                return var11;
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;", line = 568)
    public final String toString() {
        field180++;
        return "Cache:" + this.field168;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 585)
    public static final void method81(int arg0) {
        try {
            Graphics var1 = class70.field1564.getGraphics();
            class47.field1063.method1(-51, var1, arg0, 357);
        } catch (Exception var2) {
            class70.field1564.repaint();
        }
        field167++;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(ILde;Lde;I)V", line = 807)
    public class8(int arg0, class26 arg1, class26 arg2, int arg3) {
        this.field165 = arg2;
        this.field177 = arg3;
        this.field168 = arg0;
        this.field166 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 606)
    public static final void method82(byte arg0) {
        field178++;
        if (class27.field683 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class27.field683 > 768) {
                    class49.field1102[var1] = class92.method764(class26.field640[var1], 1024 - class27.field683, class37.field837[var1], (byte) -27);
                } else if (class27.field683 > 256) {
                    class49.field1102[var1] = class37.field837[var1];
                } else {
                    class49.field1102[var1] = class92.method764(class37.field837[var1], 256 - class27.field683, class26.field640[var1], (byte) 122);
                }
            }
        } else if (class80.field1960 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class49.field1102[var2] = class26.field640[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class80.field1960 > 768) {
                    class49.field1102[var3] = class92.method764(class26.field640[var3], 1024 - class80.field1960, class49.field1105[var3], (byte) -64);
                } else if (class80.field1960 > 256) {
                    class49.field1102[var3] = class49.field1105[var3];
                } else {
                    class49.field1102[var3] = class92.method764(class49.field1105[var3], 256 - class80.field1960, class26.field640[var3], (byte) -100);
                }
            }
        }
        short var4 = 256;
        for (int var5 = 0; var5 < 33920; var5++) {
            class59.field1281.field2690[var5] = class95.field2256.field2378[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var23 = (var4 - var8) * class69.field1541[var8] / var4;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var6 += var24;
            for (int var25 = var24; var25 < 128; var25++) {
                int var26 = class138.field3357[var6++];
                if (var26 == 0) {
                    var7++;
                } else {
                    int var28 = class59.field1281.field2690[var7];
                    int var29 = 256 - var26;
                    int var30 = class49.field1102[var26];
                    class59.field1281.field2690[var7++] = class60.method451(var26 * class60.method451(var30, 65280) + var29 * class60.method451(65280, var28), 16711680) + class60.method451(-16711936, var26 * class60.method451(16711935, var30) + var29 * class60.method451(var28, 16711935)) >> 8;
                }
            }
            var7 += var24;
        }
        int var9 = -58 % ((-arg0 - 21) / 52);
        int var10 = 0;
        for (int var11 = 0; var11 < 33920; var11++) {
            class135.field3294.field2690[var11] = class117.field2779.field2378[var11];
        }
        int var12 = 1176;
        for (int var13 = 1; var13 < var4 - 1; var13++) {
            int var14 = (var4 - var13) * class69.field1541[var13] / var4;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; var17++) {
                int var18 = class138.field3357[var10++];
                if (var18 == 0) {
                    var16++;
                } else {
                    int var20 = 256 - var18;
                    int var21 = class49.field1102[var18];
                    int var22 = class135.field3294.field2690[var16];
                    class135.field3294.field2690[var16++] = class60.method451(-16711936, class60.method451(var21, 16711935) * var18 + var20 * class60.method451(16711935, var22)) + class60.method451(16711680, var20 * class60.method451(var22, 65280) + var18 * class60.method451(65280, var21)) >> 8;
                }
            }
            var12 = var16 + 128 - var15 - var14;
            var10 += 128 - var15;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V", line = 795)
    public static void method83(boolean arg0) {
        field181 = null;
        field171 = null;
        if (!arg0) {
            method82((byte) -56);
        }
        field172 = null;
    }
}
