import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class121 {

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    private int field2123 = 128;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    private int field2127 = 0;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    private int field2134 = 0;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    private int field2137 = 128;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Z")
    public boolean field2139 = false;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public int field2138 = -1;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
    public boolean field2140 = false;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Z")
    public static boolean field2132 = false;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2141 = " is already on your friend list.";

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field2124;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lbl;")
    public static class137 field2122;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[S")
    private short[] field2119;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "[S")
    private short[] field2129;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "[S")
    private short[] field2133;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[S")
    private short[] field2136;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Leh;BI)V")
    private final void method822(class101 arg0, byte arg1, int arg2) {
        field2135++;
        if (arg2 == 1) {
            this.field2124 = arg0.method677(false);
        } else if (arg2 == 2) {
            this.field2138 = arg0.method677(false);
        } else if (arg2 == 4) {
            this.field2123 = arg0.method677(false);
        } else if (arg2 == 5) {
            this.field2137 = arg0.method677(false);
        } else if (arg2 == 6) {
            this.field2128 = arg0.method677(false);
        } else if (arg2 == 7) {
            this.field2127 = arg0.method669((byte) 36);
        } else if (arg2 == 8) {
            this.field2134 = arg0.method669((byte) 36);
        } else if (arg2 == 9) {
            this.field2140 = true;
        } else if (arg2 == 10) {
            this.field2139 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method669((byte) 36);
            this.field2136 = new short[var4];
            this.field2129 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2136[var5] = (short) arg0.method677(false);
                this.field2129[var5] = (short) arg0.method677(false);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method669((byte) 36);
            this.field2133 = new short[var6];
            this.field2119 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2133[var7] = (short) arg0.method677(false);
                this.field2119[var7] = (short) arg0.method677(false);
            }
        }
        int var8 = -20 / ((arg1 + 35) / 61);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIILtb;IJZ)Z")
    public static final boolean method823(int arg0, int arg1, int arg2, int arg3, int arg4, class184 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class274.method1800(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static void method824(boolean arg0) {
        field2122 = null;
        field2141 = null;
        if (!arg0) {
            method825(-56, 92);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method825(int arg0, int arg1) {
        field2131++;
        if (arg0 <= 39) {
            field2122 = null;
        }
        class55 var2 = class62.method395(11, arg1, (byte) -66);
        var2.method341((byte) 62);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Leh;I)V")
    public final void method826(class101 arg0, int arg1) {
        field2120++;
        while (true) {
            int var3 = arg0.method669((byte) 36);
            if (var3 == 0) {
                if (arg1 == 1) {
                    return;
                } else {
                    this.field2127 = 78;
                    return;
                }
            }
            this.method822(arg0, (byte) 71, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIII)I")
    public static final int method827(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2443) {
            return 37;
        }
        int var4 = arg1 & 0x3;
        field2126++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(CZ)Z")
    public static final boolean method828(char arg0, boolean arg1) {
        field2130++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg1) {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method829(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class178.field2936[arg0][var8][var14] == -class142.field2447) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class95.field1642[arg0][arg1][arg3] + arg5;
            if (!class23.method165(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class23.method165(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class23.method165(var9, var11, var13)) {
                return false;
            } else if (class23.method165(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class152.method1041(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class23.method165(var6 + 1, class95.field1642[arg0][arg1][arg3] + arg5, var7 + 1) && class23.method165(var6 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class23.method165(var6 + 128 - 1, class95.field1642[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class23.method165(var6 + 1, class95.field1642[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(IIII)Lba;")
    public final class279 method830(int arg0, int arg1, int arg2, int arg3) {
        field2125++;
        class279 var5 = (class279) class274.field4392.method57((long) this.field2121, -98);
        if (var5 == null) {
            class221 var6 = class221.method1487(class199.field3236, this.field2124, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field2136 != null) {
                for (int var7 = 0; var7 < this.field2136.length; var7++) {
                    var6.method1465(this.field2136[var7], this.field2129[var7]);
                }
            }
            if (this.field2133 != null) {
                for (int var8 = 0; var8 < this.field2133.length; var8++) {
                    var6.method1484(this.field2133[var8], this.field2119[var8]);
                }
            }
            var5 = var6.method1474(this.field2127 + 64, this.field2134 + 850, -30, -50, -30);
            class274.field4392.method62(0, var5, (long) this.field2121);
        }
        class279 var9;
        if (this.field2138 == -1 || arg2 == -1) {
            var9 = var5.method99(true, true, true);
        } else {
            var9 = class105.method714(this.field2138, (byte) 106).method1120(arg1, arg3, -1800487568, arg2, var5);
        }
        if (this.field2123 != 128 || this.field2137 != 128) {
            var9.method106(this.field2123, this.field2137, this.field2123);
        }
        if (this.field2128 != 0) {
            if (this.field2128 == 90) {
                var9.method133();
            }
            if (this.field2128 == 180) {
                var9.method117();
            }
            if (this.field2128 == 270) {
                var9.method130();
            }
        }
        return arg0 == 1 ? var9 : null;
    }
}
