import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class180 extends class53 {

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Lwa;")
    public static class75 field3017 = class66.method560(")1", false);

    @OriginalMember(owner = "client!gl", name = "X", descriptor = "[I")
    public static int[] field3028 = new int[5];

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!gl", name = "U", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!gl", name = "V", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!gl", name = "W", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "Lre;")
    public static class262 field3019;

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "[I")
    public static int[] field3020;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)V", line = 13)
    public static void method1321(int arg0) {
        field3028 = null;
        field3020 = null;
        field3019 = null;
        if (arg0 == -20857) {
            field3017 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 25)
    public class180() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V", line = 35)
    public static final void method1322(int arg0, byte arg1) {
        class268.field4638[2] = (float) class235.method1710(255, arg0) / 255.0F;
        class268.field4638[1] = (float) class235.method1710(arg0 >> 8, 255) / 255.0F;
        class268.field4638[0] = (float) class235.method1710(arg0 >> 16, 255) / 255.0F;
        class294.method2041((byte) -68, 3);
        field3022++;
        if (arg1 > -88) {
            method1323(-66, (class194) null);
        }
        class294.method2041((byte) -68, 4);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILah;)V", line = 50)
    public static final void method1323(int arg0, class194 arg1) {
        arg1.field3215 = arg1.field3228;
        field3025++;
        if (arg0 != 6987) {
            return;
        }
        if (arg1.field3246 == 0) {
            arg1.field3231 = 0;
            return;
        }
        if (arg1.field3204 != -1 && arg1.field3268 == 0) {
            class28 var2 = class302.method2082(arg1.field3204, 72);
            if (arg1.field3222 > 0 && var2.field354 == 0) {
                arg1.field3231++;
                return;
            }
            if (arg1.field3222 <= 0 && var2.field357 == 0) {
                arg1.field3231++;
                return;
            }
        }
        int var3 = arg1.field3259;
        int var4 = arg1.field3218;
        int var5 = arg1.field3236[arg1.field3246 - 1] * 128 + arg1.method739(arg0 - 6987) * 64;
        int var6 = arg1.field3205[arg1.field3246 - 1] * 128 + (arg1.method739(0) * 64);
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || var6 - var4 > 256 || (var6 - var4) < -256) {
            arg1.field3218 = var6;
            arg1.field3259 = var5;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg1.field3206 = 1280;
            } else if (var4 > var6) {
                arg1.field3206 = 1792;
            } else {
                arg1.field3206 = 1536;
            }
        } else if (var5 >= var3) {
            if (var6 > var4) {
                arg1.field3206 = 1024;
            } else if (var6 < var4) {
                arg1.field3206 = 0;
            }
        } else if (var4 < var6) {
            arg1.field3206 = 768;
        } else if (var4 <= var6) {
            arg1.field3206 = 512;
        } else {
            arg1.field3206 = 256;
        }
        int var7 = arg1.field3209;
        int var8 = arg1.field3206 - arg1.field3274 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field3269;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field3232;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field3257;
        }
        if (var7 == -1) {
            var7 = arg1.field3269;
        }
        int var9 = 4;
        arg1.field3215 = var7;
        boolean var10 = true;
        if (arg1 instanceof class295) {
            var10 = ((class295) arg1).field5070.field3892;
        }
        if (var10) {
            if (arg1.field3274 != arg1.field3206 && arg1.field3237 == -1 && arg1.field3219 != 0) {
                var9 = 2;
            }
            if (arg1.field3246 > 2) {
                var9 = 6;
            }
            if (arg1.field3246 > 3) {
                var9 = 8;
            }
            if (arg1.field3231 > 0 && arg1.field3246 > 1) {
                var9 = 8;
                arg1.field3231--;
            }
        } else {
            if (arg1.field3246 > 1) {
                var9 = 6;
            }
            if (arg1.field3246 > 2) {
                var9 = 8;
            }
            if (arg1.field3231 > 0 && arg1.field3246 > 1) {
                arg1.field3231--;
                var9 = 8;
            }
        }
        if (arg1.field3252[arg1.field3246 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field3218 += var9;
            if (arg1.field3218 > var6) {
                arg1.field3218 = var6;
            }
        } else if (var6 < var4) {
            arg1.field3218 -= var9;
            if (arg1.field3218 < var6) {
                arg1.field3218 = var6;
            }
        }
        if (var9 >= 8 && arg1.field3269 == arg1.field3215 && arg1.field3244 != -1) {
            arg1.field3215 = arg1.field3244;
        }
        if (var5 > var3) {
            arg1.field3259 += var9;
            if (arg1.field3259 > var5) {
                arg1.field3259 = var5;
            }
        } else if (var5 < var3) {
            arg1.field3259 -= var9;
            if (var5 > arg1.field3259) {
                arg1.field3259 = var5;
            }
        }
        if (arg1.field3259 == var5 && arg1.field3218 == var6) {
            if (arg1.field3222 > 0) {
                arg1.field3222--;
            }
            arg1.field3246--;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(II)[I", line = 265)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            method1324(true, (class262) null, true);
        }
        field3024++;
        return class67.field1178;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLre;Z)V", line = 279)
    public static final void method1324(boolean arg0, class262 arg1, boolean arg2) {
        field3018++;
        if (!arg2) {
            return;
        }
        int var3 = arg1.field4384 == 0 ? arg1.field4517 : arg1.field4384;
        int var4 = arg1.field4503 == 0 ? arg1.field4531 : arg1.field4503;
        class171.method1266(arg1.field4418, arg0, var3, 0, class249.field4198[arg1.field4418 >> 16], var4);
        if (arg1.field4532 != null) {
            class171.method1266(arg1.field4418, arg0, var3, 0, arg1.field4532, var4);
        }
        class93 var5 = (class93) class73.field1224.method1007((long) arg1.field4418, -17004);
        if (var5 != null) {
            class76.method665(var4, var3, arg0, 37, var5.field1518);
        }
    }
}
