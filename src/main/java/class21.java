import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class21 {

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "Luf;")
    public class474 field304;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public int field309;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Z")
    public boolean field303;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "Luf;")
    public class474 field312;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "Z")
    public boolean field307;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lbu;")
    public static class21 field308 = new class21(0, class474.field6555, class474.field6555, 0, 1);

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Lbu;")
    public static class21 field311 = new class21(1, class474.field6555, 2);

    @OriginalMember(owner = "client!bu", name = "o", descriptor = "Lbu;")
    public static class21 field313 = new class21(2, class474.field6555, class474.field6555, 2, 3);

    @OriginalMember(owner = "client!bu", name = "p", descriptor = "Lbu;")
    public static class21 field314 = new class21(3, class474.field6555, 3);

    @OriginalMember(owner = "client!bu", name = "q", descriptor = "Lbu;")
    public static class21 field315 = new class21(4, class474.field6555, class474.field6555, 3, 4);

    @OriginalMember(owner = "client!bu", name = "r", descriptor = "Lbu;")
    public static class21 field316 = new class21(5, class474.field6555, 4);

    @OriginalMember(owner = "client!bu", name = "s", descriptor = "Lbu;")
    public static class21 field317 = new class21(6, class474.field6555, 4);

    @OriginalMember(owner = "client!bu", name = "t", descriptor = "Lbu;")
    public static class21 field318 = new class21(7, class474.field6555, class474.field6555, 4, 5);

    @OriginalMember(owner = "client!bu", name = "u", descriptor = "Lbu;")
    public static class21 field319 = new class21(8, class474.field6555, class474.field6555, 5, 98, true, true);

    @OriginalMember(owner = "client!bu", name = "v", descriptor = "Lbu;")
    public static class21 field320 = new class21(9, class474.field6555, 99);

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "Lbu;")
    public static class21 field321 = new class21(10, class474.field6555, 100);

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "Lbu;")
    public static class21 field322 = new class21(11, class474.field6556, class474.field6556, 0, 92, true, true);

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "Lbu;")
    public static class21 field323 = new class21(12, class474.field6556, class474.field6556, 92, 92);

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "Lbu;")
    private static class21 field324 = new class21(13, class474.field6556, class474.field6556, 92, 93);

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "Lbu;")
    public static class21 field325 = new class21(14, class474.field6556, class474.field6556, 94, 95);

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Lbu;")
    public static class21 field326 = new class21(15, class474.field6556, class474.field6556, 96, 97);

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "Lbu;")
    public static class21 field327 = new class21(16, class474.field6556, 97);

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "Lbu;")
    public static class21 field328 = new class21(17, class474.field6556, 97);

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "Lbu;")
    public static class21 field329 = new class21(18, class474.field6556, 100);

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "Lbu;")
    public static class21 field330 = new class21(19, class474.field6556, 100);

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "Lbu;")
    public static class21 field331 = new class21(20, class474.field6556, 100);

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "Lgia;")
    public static class285 field332 = null;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 6)
    public static final void method165(int arg0) {
        field302++;
        int var1 = class76.field1101 * 512 + 256;
        int var2 = class563.field7552 * 512 + 256;
        int var3 = class783.method4338(class610.field8296, var1, -12040, var2) - class680.field9517;
        if (class20.field287 < 100) {
            if (var1 > class634.field8856) {
                class634.field8856 += (var1 - class634.field8856) * class20.field287 / 1000 + class658.field9111;
                if (var1 < class634.field8856) {
                    class634.field8856 = var1;
                }
            }
            if (class634.field8856 > var1) {
                class634.field8856 -= (class634.field8856 - var1) * class20.field287 / 1000 + class658.field9111;
                if (var1 > class634.field8856) {
                    class634.field8856 = var1;
                }
            }
            if (var3 > class405.field5867) {
                class405.field5867 += (var3 - class405.field5867) * class20.field287 / 1000 + class658.field9111;
                if (var3 < class405.field5867) {
                    class405.field5867 = var3;
                }
            }
            if (class350.field5138 < var2) {
                class350.field5138 += (var2 - class350.field5138) * class20.field287 / 1000 + class658.field9111;
                if (class350.field5138 > var2) {
                    class350.field5138 = var2;
                }
            }
            if (var3 < class405.field5867) {
                class405.field5867 -= class658.field9111 + ((class405.field5867 - var3) * class20.field287 / 1000);
                if (class405.field5867 < var3) {
                    class405.field5867 = var3;
                }
            }
            if (var2 < class350.field5138) {
                class350.field5138 -= (class350.field5138 - var2) * class20.field287 / 1000 + class658.field9111;
                if (class350.field5138 < var2) {
                    class350.field5138 = var2;
                }
            }
        } else {
            class634.field8856 = class76.field1101 * 512 + 256;
            class350.field5138 = class563.field7552 * 512 + 256;
            class405.field5867 = class783.method4338(class610.field8296, class634.field8856, -12040, class350.field5138) - class680.field9517;
        }
        int var4 = class596.field8129 * 512 + 256;
        int var5 = class383.field5608 * 512 + 256;
        int var6 = class783.method4338(class610.field8296, var4, -12040, var5) - class777.field10681;
        int var7 = var4 - class634.field8856;
        int var8 = var6 - class405.field5867;
        int var9 = var5 - class350.field5138;
        if (arg0 <= 90) {
            return;
        }
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class253.field3733 < var11) {
            class253.field3733 += class394.field5811 + ((var11 - class253.field3733 >> 3) * class230.field3142 / 1000) << 3;
            if (class253.field3733 > var11) {
                class253.field3733 = var11;
            }
        }
        if (class253.field3733 > var11) {
            class253.field3733 -= (class253.field3733 - var11 >> 3) * class230.field3142 / 1000 + class394.field5811 << 3;
            if (var11 > class253.field3733) {
                class253.field3733 = var11;
            }
        }
        int var13 = var12 - class718.field10019;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class718.field10019 += class230.field3142 * var14 / 1000 + class394.field5811 << 3;
            class718.field10019 &= 0x3FFF;
        }
        if (var14 < 0) {
            class718.field10019 -= -var14 * class230.field3142 / 1000 + class394.field5811 << 3;
            class718.field10019 &= 0x3FFF;
        }
        int var15 = var12 - class718.field10019;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class162.field2209 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class718.field10019 = var12;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 163)
    public static final String method166(byte[] arg0, int arg1, int arg2, int arg3) {
        field305++;
        if (arg3 != 7956) {
            field311 = null;
        }
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg2;
        int var7 = arg1 + arg2;
        while (var6 < var7) {
            int var8 = arg0[var6++] & 0xFF;
            int var9;
            if (var8 < 128) {
                if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
            } else if (var8 < 192) {
                var9 = 65533;
            } else if (var8 < 224) {
                if (var6 < var7 && (arg0[var6] & 0xC0) == 128) {
                    var9 = (var8 & 0x1F) << 6 | arg0[var6++] & 0x3F;
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 < 240) {
                if (var7 > var6 + 1 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128) {
                    var9 = arg0[var6++] & 0x3F << 6 | (var8 & 0xF) << 12 | arg0[var6++] & 0x3F;
                    if (var9 < 2048) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (var8 >= 248) {
                var9 = 65533;
            } else if (var6 + 2 < var7 && (arg0[var6] & 0xC0) == 128 && (arg0[var6 + 1] & 0xC0) == 128 && (arg0[var6 + 2] & 0xC0) == 128) {
                int var10 = arg0[var6++] & 0x3F << 12 | var8 << 18 & 0x1C0000 | (arg0[var6++] & 0x3F) << 6 | arg0[var6++] & 0x3F;
                if (var10 >= 65536 && var10 <= 1114111) {
                    var9 = 65533;
                } else {
                    var9 = 65533;
                }
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)I", line = 252)
    public final int method167(int arg0) {
        if (arg0 != -10247) {
            method165(85);
        }
        field301++;
        return this.field306;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILuf;I)V", line = 264)
    private class21(int arg0, class474 arg1, int arg2) {
        this(arg0, arg1, arg1, arg2, arg2, true, false);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 269)
    public static void method168(boolean arg0) {
        field327 = null;
        field308 = null;
        field325 = null;
        field319 = null;
        if (arg0) {
            return;
        }
        field323 = null;
        field328 = null;
        field320 = null;
        field332 = null;
        field330 = null;
        field329 = null;
        field317 = null;
        field331 = null;
        field326 = null;
        field316 = null;
        field314 = null;
        field318 = null;
        field315 = null;
        field311 = null;
        field321 = null;
        field324 = null;
        field313 = null;
        field322 = null;
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILuf;Luf;II)V", line = 305)
    private class21(int arg0, class474 arg1, class474 arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, true, false);
    }

    @OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;", line = 310)
    public final String toString() {
        field310++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)[Lbu;", line = 318)
    public static final class21[] method169(int arg0) {
        field300++;
        if (arg0 != 6) {
            field330 = null;
        }
        return new class21[] { field308, field311, field313, field314, field315, field316, field317, field318, field319, field320, field321, field322, field323, field324, field325, field326, field327, field328, field329, field330, field331 };
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(ILuf;Luf;IIZZ)V", line = 336)
    private class21(int arg0, class474 arg1, class474 arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        this.field304 = arg1;
        this.field309 = arg3;
        this.field299 = arg4;
        this.field303 = arg5;
        this.field306 = arg0;
        this.field312 = arg2;
        this.field307 = arg6;
    }
}
