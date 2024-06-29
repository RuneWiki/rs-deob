import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 extends class149 {

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "Z")
    public boolean field3350 = false;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public int field3364 = 5;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "I")
    public int field3365 = -1;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "I")
    public int field3359 = -1;

    @OriginalMember(owner = "client!tc", name = "kb", descriptor = "I")
    public int field3371 = -1;

    @OriginalMember(owner = "client!tc", name = "wb", descriptor = "I")
    public int field3383 = -1;

    @OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
    public int field3381 = -1;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "I")
    public int field3366 = 99;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public int field3355 = 2;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field3356 = -1;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "J")
    public static volatile long field3363 = 0L;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "[Z")
    public static boolean[] field3358 = new boolean[100];

    @OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
    public static int field3376 = 0;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Lsg;")
    public static class169 field3361 = class165.method1060("Lade)3)3)3", 1536);

    @OriginalMember(owner = "client!tc", name = "rb", descriptor = "Lsg;")
    private static class169 field3378 = class165.method1060("You are standing in a members)2only area)3", 1536);

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "Lsg;")
    public static class169 field3367 = field3378;

    @OriginalMember(owner = "client!tc", name = "vb", descriptor = "Lsg;")
    public static class169 field3382 = class165.method1060("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 1536);

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!tc", name = "ib", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!tc", name = "jb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!tc", name = "mb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!tc", name = "ob", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!tc", name = "tb", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!tc", name = "nb", descriptor = "Lph;")
    public static class143 field3374;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "Lsc;")
    public static class165 field3354;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "[I")
    private int[] field3352;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "[I")
    private int[] field3353;

    @OriginalMember(owner = "client!tc", name = "lb", descriptor = "[I")
    public int[] field3372;

    @OriginalMember(owner = "client!tc", name = "sb", descriptor = "[I")
    public int[] field3379;

    @OriginalMember(owner = "client!tc", name = "xb", descriptor = "[I")
    public int[] field3384;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field3382 = null;
        if (arg0 >= -69) {
            method1157(27, 20, 85);
        }
        field3354 = null;
        field3374 = null;
        field3361 = null;
        field3358 = null;
        field3367 = null;
        field3378 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method1157(int arg0, int arg1, int arg2) {
        field3373++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & arg2) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILcd;I)Lcd;")
    public final class24 method1158(int arg0, class24 arg1, int arg2) {
        field3351++;
        int var4 = this.field3379[arg0];
        class96 var5 = class17.method95((byte) 88, var4 >> 16);
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg1.method161(true);
        }
        class96 var7 = null;
        int var8 = 0;
        if (this.field3353 != null && this.field3353.length > arg0) {
            int var9 = this.field3353[arg0];
            var7 = class17.method95((byte) -125, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class24 var11 = arg1.method161(!var5.method577(-95, var6));
            var11.method169(var5, var6);
            return var11;
        } else {
            class24 var10 = arg1.method161(!var5.method577(arg2 - 65633, var6) & !var7.method577(-120, var8));
            var10.method169(var5, var6);
            var10.method169(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(ILcd;I)Lcd;")
    public final class24 method1159(int arg0, class24 arg1, int arg2) {
        int var4 = this.field3379[arg2];
        field3368++;
        class96 var5 = class17.method95((byte) -123, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method166(true);
        } else {
            int var7 = 104 / ((27 - arg0) / 46);
            class24 var8 = arg1.method166(!var5.method577(-122, var6));
            var8.method169(var5, var6);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lcd;IILtc;I)Lcd;")
    public final class24 method1160(class24 arg0, int arg1, int arg2, class174 arg3, int arg4) {
        int var6 = this.field3379[arg4];
        class96 var7 = class17.method95((byte) 94, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        field3385++;
        if (var7 == null) {
            return arg3.method1167(-122, arg1, arg0);
        }
        int var9 = arg3.field3379[arg1];
        class96 var10 = class17.method95((byte) 1, var9 >> 16);
        if (arg2 != 29426) {
            this.method1167(81, -20, null);
        }
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class24 var12 = arg0.method161(!var7.method577(arg2 ^ 0xFFFF8D52, var8));
            var12.method169(var7, var8);
            return var12;
        } else {
            class24 var13 = arg0.method161(!var7.method577(-85, var8) & !var10.method577(-72, var11));
            var13.method175(var7, var8, var10, var11, this.field3352);
            return var13;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lcd;BII)Lcd;")
    public final class24 method1161(class24 arg0, byte arg1, int arg2, int arg3) {
        field3360++;
        int var5 = this.field3379[arg3];
        class96 var6 = class17.method95((byte) -127, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method161(true);
        }
        int var8 = arg2 & 0x3;
        class24 var9 = arg0.method161(!var6.method577(-115, var7));
        if (var8 == 1) {
            var9.method168();
        } else if (var8 == 2) {
            var9.method173();
        } else if (var8 == 3) {
            var9.method165();
        }
        var9.method169(var6, var7);
        if (var8 == 1) {
            var9.method165();
        } else if (var8 == 2) {
            var9.method173();
        } else if (var8 == 3) {
            var9.method168();
        }
        int var10 = 12 % ((-arg1 - 3) / 53);
        return var9;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BILoa;)V")
    private final void method1162(byte arg0, int arg1, class127 arg2) {
        field3369++;
        if (arg0 != 120) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg2.method785(true);
            this.field3384 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3384[var5] = arg2.method785(true);
            }
            this.field3379 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3379[var6] = arg2.method785(true);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3379[var7] = (arg2.method785(true) << 16) + this.field3379[var7];
            }
        } else if (arg1 == 2) {
            this.field3371 = arg2.method785(true);
        } else if (arg1 == 3) {
            int var8 = arg2.method819((byte) 22);
            this.field3352 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3352[var9] = arg2.method819((byte) 22);
            }
            this.field3352[var8] = 9999999;
        } else if (arg1 == 4) {
            this.field3350 = true;
        } else if (arg1 == 5) {
            this.field3364 = arg2.method819((byte) 22);
        } else if (arg1 == 6) {
            this.field3381 = arg2.method785(true);
        } else if (arg1 == 7) {
            this.field3383 = arg2.method785(true);
        } else if (arg1 == 8) {
            this.field3366 = arg2.method819((byte) 22);
        } else if (arg1 == 9) {
            this.field3359 = arg2.method819((byte) 22);
        } else if (arg1 == 10) {
            this.field3365 = arg2.method819((byte) 22);
        } else if (arg1 == 11) {
            this.field3355 = arg2.method819((byte) 22);
        } else if (arg1 == 12) {
            int var12 = arg2.method819((byte) 22);
            this.field3353 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3353[var13] = arg2.method785(true);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field3353[var14] += arg2.method785(true) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg2.method819((byte) 22);
            this.field3372 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3372[var11] = arg2.method773((byte) -124);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public final void method1163(int arg0) {
        if (this.field3365 == -1) {
            if (this.field3352 == null) {
                this.field3365 = 0;
            } else {
                this.field3365 = 2;
            }
        }
        int var2 = 2 / ((arg0 + 69) / 53);
        if (this.field3359 == -1) {
            if (this.field3352 == null) {
                this.field3359 = 0;
            } else {
                this.field3359 = 2;
            }
        }
        field3377++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILoa;)V")
    public final void method1164(int arg0, class127 arg1) {
        field3375++;
        while (true) {
            int var3 = arg1.method819((byte) 22);
            if (var3 == 0) {
                if (arg0 == 14025) {
                    return;
                } else {
                    this.method1158(-59, null, 107);
                    return;
                }
            }
            this.method1162((byte) 120, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BIBI)Z")
    public static final boolean method1165(byte[] arg0, int arg1, byte arg2, int arg3) {
        field3362++;
        int var4 = -33 / ((6 - arg2) / 33);
        class127 var5 = new class127(arg0);
        int var6 = -1;
        boolean var7 = true;
        label54: while (true) {
            int var8 = var5.method812(true);
            if (var8 == 0) {
                return var7;
            }
            var6 += var8;
            boolean var9 = false;
            int var10 = 0;
            while (true) {
                while (!var9) {
                    int var12 = var5.method812(true);
                    if (var12 == 0) {
                        continue label54;
                    }
                    var10 += var12 - 1;
                    int var13 = var10 >> 6 & 0x3F;
                    int var14 = var10 & 0x3F;
                    int var15 = var5.method819((byte) 22) >> 2;
                    int var16 = var13 + arg1;
                    int var17 = arg3 + var14;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class17 var18 = class138.method925(6, var6);
                        if (var15 != 22 || !class105.field1925 || var18.field402 != 0 || var18.field360 == 1 || var18.field382) {
                            var9 = true;
                            if (!var18.method94(0)) {
                                var7 = false;
                                class141.field2632++;
                            }
                        }
                    }
                }
                int var11 = var5.method812(true);
                if (var11 == 0) {
                    break;
                }
                var5.method819((byte) 22);
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIZLke;)Z")
    public static final boolean method1166(int arg0, int arg1, boolean arg2, class95 arg3) {
        if (arg2) {
            field3382 = null;
        }
        field3370++;
        byte[] var4 = arg3.method552(arg1, arg0, 0);
        if (var4 == null) {
            return false;
        } else {
            class22.method154(0, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILcd;)Lcd;")
    public final class24 method1167(int arg0, int arg1, class24 arg2) {
        field3380++;
        int var4 = this.field3379[arg1];
        class96 var5 = class17.method95((byte) 75, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method161(true);
        }
        if (arg0 >= -97) {
            method1156((byte) 101);
        }
        class24 var7 = arg2.method161(!var5.method577(-104, var6));
        var7.method169(var5, var6);
        return var7;
    }
}
