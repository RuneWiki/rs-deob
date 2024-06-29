import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class133 {

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "[I")
    private int[] field3225;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field3224 = 78;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lrc;")
    public static class105 field3226 = class43.method374("runes", 0);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lrc;")
    public static class105 field3222 = class43.method374("Musik)2Engine vorbereitet)3", 0);

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field3229 = 0;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "Lrc;")
    public static class105 field3227 = class43.method374("null", 0);

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "Lrc;")
    private static class105 field3233 = class43.method374("Service unavailable)3", 0);

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lrc;")
    public static class105 field3219 = field3233;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field3228 = 0;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lrc;")
    public static class105 field3236 = class43.method374("overlay_multiway", 0);

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "Lbd;")
    public static class11 field3232;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lfc;")
    public static class34 field3234;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "[Lrc;")
    public static class105[] field3223;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZLpb;Lpb;I)Lka;", line = 7)
    public static final class61 method1050(int arg0, boolean arg1, class92 arg2, class92 arg3, int arg4) {
        boolean var5 = true;
        field3235++;
        int[] var6 = arg2.method763((byte) -32, arg0);
        for (int var7 = arg4; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method752(arg4 - 124, var6[var7], arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method752(-127, var9, 0);
                } else {
                    var10 = arg3.method752(-117, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class61(arg2, arg3, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 59)
    public static void method1051(byte arg0) {
        field3223 = null;
        field3226 = null;
        field3222 = null;
        field3219 = null;
        field3236 = null;
        field3227 = null;
        field3234 = null;
        if (arg0 != 111) {
            field3227 = null;
        }
        field3233 = null;
        field3232 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 78)
    public final int method1052(int arg0, int arg1) {
        if (arg0 != -1) {
            return -74;
        }
        field3221++;
        int var3 = this.field3225.length - 2;
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field3225[var4];
            if (arg1 == var5) {
                return this.field3225[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V", line = 141)
    public static final void method1053(byte arg0) {
        field3231++;
        int var1 = -1;
        if (arg0 < 83) {
            method1054(null, true);
        }
        while (var1 < class97.field2250) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class121.field2956[var1];
            }
            class15 var3 = class58.field1303[var2];
            if (var3 != null) {
                class128.method1029(1, var3, (byte) 49);
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljd;Z)V", line = 172)
    public static final void method1054(class58 arg0, boolean arg1) {
        arg0.field1284 = arg1;
        field3230++;
        if (arg0.field1271 != -1) {
            class116 var2 = class6.method49(103, arg0.field1271);
            if (var2 == null || var2.field2713 == null) {
                arg0.field1271 = -1;
            } else {
                arg0.field1236++;
                if (arg0.field1267 < var2.field2713.length && arg0.field1236 > var2.field2683[arg0.field1267]) {
                    arg0.field1267++;
                    arg0.field1236 = 1;
                }
                if (arg0.field1267 >= var2.field2713.length) {
                    arg0.field1267 = 0;
                    arg0.field1236 = 0;
                }
            }
        }
        if (arg0.field1245 != -1 && arg0.field1283 <= class104.field2351) {
            if (arg0.field1215 < 0) {
                arg0.field1215 = 0;
            }
            int var3 = class118.method956(arg0.field1245, 19452).field1994;
            if (var3 == -1) {
                arg0.field1245 = -1;
            } else {
                class116 var4 = class6.method49(103, var3);
                if (var4 == null || var4.field2713 == null) {
                    arg0.field1245 = -1;
                } else {
                    arg0.field1235++;
                    if (var4.field2713.length > arg0.field1215 && var4.field2683[arg0.field1215] < arg0.field1235) {
                        arg0.field1215++;
                        arg0.field1235 = 1;
                    }
                    if (var4.field2713.length <= arg0.field1215 && (arg0.field1215 < 0 || arg0.field1215 >= var4.field2713.length)) {
                        arg0.field1245 = -1;
                    }
                }
            }
        }
        if (arg0.field1238 != -1 && arg0.field1230 <= 1) {
            class116 var5 = class6.method49(103, arg0.field1238);
            if (var5.field2691 == 1 && arg0.field1270 > 0 && class104.field2351 >= arg0.field1272 && class104.field2351 > arg0.field1288) {
                arg0.field1230 = 1;
                return;
            }
        }
        if (arg0.field1238 != -1 && arg0.field1230 == 0) {
            class116 var6 = class6.method49(103, arg0.field1238);
            if (var6 == null || var6.field2713 == null) {
                arg0.field1238 = -1;
            } else {
                arg0.field1244++;
                if (arg0.field1262 < var6.field2713.length && arg0.field1244 > var6.field2683[arg0.field1262]) {
                    arg0.field1262++;
                    arg0.field1244 = 1;
                }
                if (var6.field2713.length <= arg0.field1262) {
                    arg0.field1257++;
                    arg0.field1262 -= var6.field2692;
                    if (arg0.field1257 >= var6.field2708) {
                        arg0.field1238 = -1;
                    }
                    if (arg0.field1262 < 0 || var6.field2713.length <= arg0.field1262) {
                        arg0.field1238 = -1;
                    }
                }
                arg0.field1284 = var6.field2709;
            }
        }
        if (arg0.field1230 > 0) {
            arg0.field1230--;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([I)V", line = 309)
    public class133(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field3225 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3225[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3225[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3225[var5 + var5] = arg0[var4];
            this.field3225[var5 + var5 + 1] = var4++;
        }
    }
}
