import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class191 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lsc;")
    private class56 field3266 = new class56(256);

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "Lsc;")
    private class56 field3279 = new class56(256);

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "Lmb;")
    private class178 field3271;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lmb;")
    private class178 field3274;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lme;")
    public static class44 field3264 = null;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "Lia;")
    private static class257 field3269 = class28.method234(107, " has logged in)3");

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lia;")
    public static class257 field3270 = field3269;

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "Lia;")
    private static class257 field3278 = class28.method234(117, "M");

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "Lia;")
    public static class257 field3280 = class28.method234(-52, "http:)4)4");

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "Lia;")
    public static class257 field3277 = field3278;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lia;")
    public static class257 field3273 = field3278;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "([IIZ)Loh;")
    public final class261 method1291(int[] arg0, int arg1, boolean arg2) {
        field3275++;
        if (arg2) {
            return null;
        } else if (this.field3274.method1202(-104) == 1) {
            return this.method1292(arg1, 1610616831, arg0, 0);
        } else if (this.field3274.method1220((byte) -63, arg1) == 1) {
            return this.method1292(0, 1610616831, arg0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[II)Loh;")
    private final class261 method1292(int arg0, int arg1, int[] arg2, int arg3) {
        field3272++;
        int var5 = ((arg3 & arg1) << 4 | arg3 >>> 12) ^ arg0;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class261 var9 = (class261) this.field3279.method434((byte) -93, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class47 var10 = (class47) this.field3266.method434((byte) -93, var7);
            if (var10 == null) {
                var10 = class47.method362(this.field3274, arg3, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field3266.method424(var10, (byte) -40, var7);
            }
            class261 var11 = var10.method370(arg2);
            if (var11 == null) {
                return null;
            } else {
                var10.method254(1);
                this.field3279.method424(var11, (byte) -40, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
    public static final void method1293(int arg0, boolean arg1) {
        if (arg0 != 8) {
            field3277 = null;
        }
        byte var2 = 4;
        byte[][] var3 = class253.field4353;
        field3281++;
        for (int var4 = 0; var4 < var2; var4++) {
            class39.method319((byte) 122);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class154.field2708[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFCA1D) >> 14;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class197.field3328.length; var13++) {
                                if (class197.field3328[var13] == var12 && var3[var13] != null) {
                                    class19.method172(var6 * 8, arg1, var5 * 8, (var10 & 0x7) * 8, var4, class173.field2961, (var11 & 0x7) * 8, var8, var9, arg0 + 17, var3[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method1294(byte arg0) {
        field3273 = null;
        if (arg0 <= 5) {
            return;
        }
        field3269 = null;
        field3264 = null;
        field3280 = null;
        field3278 = null;
        field3277 = null;
        field3270 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILme;)V")
    public static final void method1295(int arg0, class44 arg1) {
        field3276++;
        class44 var2 = class79.method599(arg1, 0);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class166.field2897;
            var3 = class12.field241;
        } else {
            var3 = var2.field926;
            var4 = var2.field981;
        }
        class230.method1501((byte) -90, var4, false, arg1, var3);
        class206.method1392(26483, var3, arg1, var4);
        if (arg0 != 250) {
            field3270 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lme;I)Z")
    public static final boolean method1296(class44 arg0, int arg1) {
        if (arg1 <= 78) {
            field3280 = null;
        }
        field3268++;
        if (arg0.field949 == 205) {
            class90.field1721 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I)Loh;")
    public final class261 method1297(int arg0, int arg1, int[] arg2) {
        field3265++;
        if (arg1 == this.field3271.method1202(-114)) {
            return this.method1298(arg0, 0, arg2, 16763421);
        } else if (this.field3271.method1220((byte) -63, arg0) == 1) {
            return this.method1298(0, arg0, arg2, arg1 + 16763420);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II[II)Loh;")
    private final class261 method1298(int arg0, int arg1, int[] arg2, int arg3) {
        field3267++;
        int var5 = arg0 ^ (arg1 << 4 & 0xFFF1 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class261 var9 = (class261) this.field3279.method434((byte) -93, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 != null && arg2[0] <= 0) {
            return null;
        } else if (arg3 == 16763421) {
            class88 var10 = class88.method659(this.field3271, arg1, arg0);
            if (var10 == null) {
                return null;
            }
            class261 var11 = var10.method658();
            this.field3279.method424(var11, (byte) -40, var7);
            if (arg2 != null) {
                arg2[0] -= var11.field4523.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lmb;Lmb;)V")
    public class191(class178 arg0, class178 arg1) {
        this.field3271 = arg0;
        this.field3274 = arg1;
    }
}
