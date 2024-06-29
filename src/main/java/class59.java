import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 extends class84 {

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
    public static int[] field834 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "Z")
    public static boolean field844 = true;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Ljava/lang/String;")
    public String field838;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[C")
    public char[] field832;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "[C")
    public char[] field842;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "[I")
    public int[] field835;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method365(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class127.field1802 * 128) {
            arg0 = class127.field1802 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class234.field3531 * 128) {
            arg2 = class234.field3531 * 128 - 1;
        }
        class228.field3464 = class90.field1259[arg3];
        class158.field2201 = class90.field1255[arg3];
        class30.field414 = class90.field1259[arg4];
        class177.field2483 = class90.field1255[arg4];
        class124.field1745 = arg0;
        class21.field309 = arg1;
        class65.field889 = arg2;
        class213.field3206 = arg0 / 128;
        class266.field4044 = arg2 / 128;
        class142.field1969 = class213.field3206 - class153.field2123;
        if (class142.field1969 < 0) {
            class142.field1969 = 0;
        }
        class250.field3829 = class266.field4044 - class153.field2123;
        if (class250.field3829 < 0) {
            class250.field3829 = 0;
        }
        class132.field1883 = class213.field3206 + class153.field2123;
        if (class132.field1883 > class127.field1802) {
            class132.field1883 = class127.field1802;
        }
        class93.field1286 = class266.field4044 + class153.field2123;
        if (class93.field1286 > class234.field3531) {
            class93.field1286 = class234.field3531;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class153.field2123 + class153.field2123 + 2; var16++) {
            for (int var19 = 0; var19 < class153.field2123 + class153.field2123 + 2; var19++) {
                int var20 = (var16 - class153.field2123 << 7) - (class124.field1745 & 0x7F);
                int var21 = (var19 - class153.field2123 << 7) - (class65.field889 & 0x7F);
                int var22 = class213.field3206 + var16 - class153.field2123;
                int var23 = class266.field4044 + var19 - class153.field2123;
                if (var22 >= 0 && var23 >= 0 && var22 < class127.field1802 && var23 < class234.field3531) {
                    int var24;
                    if (class95.field1341 == null) {
                        var24 = class137.field1924[0][var22][var23] + 128 - class21.field309;
                    } else {
                        var24 = class95.field1341[0][var22][var23] + 128 - class21.field309;
                    }
                    int var25 = class137.field1924[3][var22][var23] - class21.field309 - 1000;
                    class245.field3747[var16][var19] = class41.method270(var20, var25, var24, var21, var15);
                } else {
                    class245.field3747[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class153.field2123 + class153.field2123 + 1; var17++) {
            for (int var18 = 0; var18 < class153.field2123 + class153.field2123 + 1; var18++) {
                class76.field1059[var17][var18] = class245.field3747[var17][var18] || class245.field3747[var17 + 1][var18] || class245.field3747[var17][var18 + 1] || class245.field3747[var17 + 1][var18 + 1];
            }
        }
        class57.field825 = arg6;
        class194.field2686 = arg7;
        class77.field1085 = arg8;
        class279.field4325 = arg9;
        class71.field995 = arg10;
        class43.method286();
        if (class296.field4674 != null) {
            class46.method301(true);
            class71.method444(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class46.method301(false);
        }
        class71.method444(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([IZ)[I")
    public static final int[] method366(int[] arg0, boolean arg1) {
        field839++;
        if (arg1) {
            field844 = false;
        }
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class115.method780(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBLmi;II)V")
    public static final void method367(int arg0, int arg1, int arg2, byte arg3, class266 arg4, int arg5, int arg6) {
        field841++;
        class16.method98(arg4.field4019, arg0, arg4.field4085, arg6, -29, arg2, arg5, arg1);
        int var7 = -92 % ((53 - arg3) / 44);
    }

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "(I)V")
    public final void method368(int arg0) {
        if (this.field840 != null) {
            for (int var2 = 0; var2 < this.field840.length; var2++) {
                this.field840[var2] = class54.method339(this.field840[var2], 32768);
            }
        }
        field836++;
        if (this.field835 != null) {
            for (int var3 = 0; var3 < this.field835.length; var3++) {
                this.field835[var3] = class54.method339(this.field835[var3], 32768);
            }
        }
        if (arg0 >= -117) {
            field834 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILql;Z)V")
    private final void method369(int arg0, class224 arg1, boolean arg2) {
        field831++;
        if (arg0 == 1) {
            this.field838 = arg1.method1455(117);
        } else if (arg0 == 2) {
            int var4 = arg1.method1453((byte) -127);
            this.field835 = new int[var4];
            this.field832 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field835[var5] = arg1.method1445(false);
                byte var6 = arg1.method1437((byte) -120);
                this.field832[var5] = var6 == 0 ? 0 : class84.method525(var6, 30582);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1453((byte) -127);
            this.field840 = new int[var7];
            this.field842 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field840[var8] = arg1.method1445(!arg2);
                byte var9 = arg1.method1437((byte) -125);
                this.field842[var8] = var9 == 0 ? 0 : class84.method525(var9, 30582);
            }
        }
        if (!arg2) {
            this.method372('1', false);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static void method370(byte arg0) {
        if (arg0 != -55) {
            method370((byte) -114);
        }
        field834 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IC)I")
    public final int method371(int arg0, char arg1) {
        field837++;
        if (this.field835 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field835.length; var3++) {
            if (this.field832[var3] == arg1) {
                return this.field835[var3];
            }
        }
        if (arg0 != -22458) {
            this.field842 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(CZ)I")
    public final int method372(char arg0, boolean arg1) {
        field843++;
        if (arg1) {
            return 20;
        } else if (this.field840 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < this.field840.length; var3++) {
                if (this.field842[var3] == arg0) {
                    return this.field840[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lql;I)V")
    public final void method373(class224 arg0, int arg1) {
        field833++;
        while (true) {
            int var3 = arg0.method1453((byte) -127);
            if (var3 == 0) {
                int var4 = -55 / ((8 - arg1) / 35);
                return;
            }
            this.method369(var3, arg0, true);
        }
    }
}
