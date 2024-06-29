import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class245 extends class279 {

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[J")
    public static long[] field3823 = new long[256];

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Z")
    public static boolean field3828;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field3820;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field3821;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Ljava/lang/String;")
    public String field3822;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "[C")
    public char[] field3818;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "[C")
    public char[] field3827;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "[I")
    public int[] field3815;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "[I")
    public int[] field3829;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1753(boolean arg0) {
        if (class6.field114 < 128.0F) {
            class6.field114 = 128.0F;
        }
        int var1 = class225.field3561 >> 7;
        int var2 = class2.field19 >> 7;
        while (class45.field604 >= 2048.0F) {
            class45.field604 -= 2048.0F;
        }
        while (class45.field604 < 0.0F) {
            class45.field604 += 2048.0F;
        }
        if (class6.field114 > 383.0F) {
            class6.field114 = 383.0F;
        }
        if (!arg0) {
            field3828 = false;
        }
        field3824++;
        int var3 = 0;
        int var4 = class320.method2245((byte) -84, class2.field19, class154.field2392, class225.field3561);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class154.field2392;
                    if (var7 < 3 && (class134.field1969[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class248.field3903[var7][var5][var6] & 0xFF) * 8 + var4 - class172.field2843[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class121.field1704 < var9) {
            class121.field1704 += (var9 - class121.field1704) / 24;
        } else if (class121.field1704 > var9) {
            class121.field1704 += (var9 - class121.field1704) / 80;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lvl;II)V", line = 85)
    private final void method1754(class6 arg0, int arg1, int arg2) {
        field3821++;
        if (arg2 == 1) {
            this.field3822 = arg0.method40(false);
        } else if (arg2 == 2) {
            int var7 = arg0.method58(-288140008);
            this.field3827 = new char[var7];
            this.field3829 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3829[var8] = arg0.method39((byte) 86);
                byte var9 = arg0.method83((byte) -79);
                this.field3827[var8] = var9 == 0 ? 0 : class319.method2242(var9, (byte) -17);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method58(-288140008);
            this.field3818 = new char[var4];
            this.field3815 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3815[var5] = arg0.method39((byte) 62);
                byte var6 = arg0.method83((byte) -99);
                this.field3818[var5] = var6 == 0 ? 0 : class319.method2242(var6, (byte) -17);
            }
        } else if (arg2 != 4) {
        }
        if (arg1 != -1019) {
            this.field3827 = (char[]) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 153)
    public static final void method1755(byte arg0) {
        int var1 = -103 % ((47 - arg0) / 60);
        class62.field913.method1355(false);
        field3816++;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 164)
    public final void method1756(byte arg0) {
        if (this.field3815 != null) {
            for (int var2 = 0; var2 < this.field3815.length; var2++) {
                this.field3815[var2] = class214.method1562(this.field3815[var2], 32768);
            }
        }
        int var3 = 7 % ((arg0 + 14) / 51);
        field3814++;
        if (this.field3829 != null) {
            for (int var4 = 0; var4 < this.field3829.length; var4++) {
                this.field3829[var4] = class214.method1562(this.field3829[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;[BIII)I", line = 193)
    public static final int method1757(int arg0, String arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 42) {
            return -90;
        }
        field3825++;
        int var6 = arg0 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg1.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg2[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg2[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg2[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg2[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg2[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg2[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg2[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg2[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg2[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg2[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg2[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg2[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg2[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg2[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg2[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg2[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg2[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg2[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg2[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg2[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg2[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg2[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg2[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg2[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg2[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg2[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg2[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg2[arg4 + var7] = -97;
            } else {
                arg2[arg4 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V", line = 329)
    public static void method1758(byte arg0) {
        field3823 = null;
        if (arg0 < 109) {
            field3828 = false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 348)
    public static final void method1759(int arg0) {
        if (arg0 <= 96) {
            method1757(-48, (String) null, (byte[]) null, -78, -53, 18);
        }
        field3813++;
        if (class281.field4344) {
            return;
        }
        if (class82.field1124) {
            class45.field604 = (float) ((int) class45.field604 - 65 & 0xFFFFFF80);
        } else {
            class135.field1975 += (-24.0F - class135.field1975) / 2.0F;
        }
        class281.field4344 = true;
        class281.field4320 = true;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3823[var0] = var1;
        }
        field3828 = true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILvl;)V", line = 381)
    public final void method1760(int arg0, class6 arg1) {
        field3826++;
        if (arg0 != -20255) {
            this.method1754((class6) null, 80, 8);
        }
        while (true) {
            int var3 = arg1.method58(-288140008);
            if (var3 == 0) {
                return;
            }
            this.method1754(arg1, arg0 ^ 0x4CE4, var3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)V", line = 403)
    public static final void method1761(byte arg0) {
        int var1 = class295.field4575;
        int var2 = class281.field4343;
        field3817++;
        int var3 = class138.field2197;
        int var4 = 6116423;
        int var5 = class95.field1264;
        int var6 = 5 % ((-arg0 - 54) / 56);
        if (class109.field1458) {
            class122.method897(var1, var2, var3, var5, var4);
            class122.method897(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class122.method888(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        } else {
            class280.method1971(var1, var2, var3, var5, var4);
            class280.method1971(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class280.method1979(var1 + 1, var2 + 18, var3 - 2, var5 - 19, 0);
        }
        class270.field4197.method2252(class232.field3623, var1 + 3, var2 - -14, var4, -1);
        int var7 = class82.field1129;
        int var8 = class25.field381;
        for (int var9 = 0; var9 < class78.field1046; var9++) {
            int var10 = (class78.field1046 - var9 - 1) * 15 + var2 + 31;
            int var11 = 16777215;
            if (var1 < var8 && var8 < var1 + var3 && var7 > (var10 - 13) && var7 < var10 + 3) {
                var11 = 16776960;
            }
            class270.field4197.method2252(class207.method1525(8, var9), var1 + 3, var10, var11, 0);
        }
        class96.method683(class281.field4343, class138.field2197, class95.field1264, class295.field4575, -22156);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BC)I", line = 458)
    public final int method1762(byte arg0, char arg1) {
        field3819++;
        if (this.field3815 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != -104) {
            this.field3827 = (char[]) null;
        }
        while (this.field3815.length > var3) {
            if (this.field3818[var3] == arg1) {
                return this.field3815[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IC)I", line = 482)
    public final int method1763(int arg0, char arg1) {
        field3820++;
        int var3 = -96 / ((49 - arg0) / 38);
        if (this.field3829 == null) {
            return -1;
        }
        for (int var4 = 0; var4 < this.field3829.length; var4++) {
            if (this.field3827[var4] == arg1) {
                return this.field3829[var4];
            }
        }
        return -1;
    }
}
