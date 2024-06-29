import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class175 extends class88 {

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public int field3202 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lhj;")
    public static class69 field3183 = class181.method1318("zap", (byte) -115);

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lhj;")
    public static class69 field3184 = class181.method1318("_labels", (byte) -114);

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "Lhj;")
    public static class69 field3192 = class181.method1318("::errortest", (byte) -114);

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "Z")
    public static boolean field3199 = true;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Lhj;")
    public static class69 field3190 = class181.method1318("Clientscript error )2 check log for details", (byte) -120);

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "[Z")
    public static boolean[] field3201 = new boolean[100];

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field3208 = 0;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "[Lhj;")
    public static class69[] field3204 = new class69[1000];

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lth;")
    public class108 field3181;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "Lfg;")
    public class12 field3193;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "Lic;")
    public class137 field3197;

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Lic;")
    public class137 field3203;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Lok;")
    public class38 field3191;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "Z")
    public boolean field3187;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "[I")
    public int[] field3196;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lah;BIIIII)V")
    public static final void method1272(class263 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3194++;
        boolean var7 = true;
        boolean var8 = false;
        long var9 = 0L;
        if (arg1 != -79) {
            field3190 = null;
        }
        if (arg3 == 0) {
            var9 = class188.method1367(arg2, arg6, arg4);
        } else if (arg3 == 1) {
            var9 = class252.method1756(arg2, arg6, arg4);
        } else if (arg3 == 2) {
            var9 = class119.method865(arg2, arg6, arg4);
        } else if (arg3 == 3) {
            var9 = class73.method509(arg2, arg6, arg4);
        }
        int var11 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        int var12 = ((int) var9 & 0x3DDC3B) >> 20;
        class12 var13 = class145.method1102(var11, 0);
        if (var13.method60(-111)) {
            class89.method635(var13, arg4, arg2, arg6, 20271);
        }
        boolean var14 = false;
        int var15 = ((int) var9 & 0x7F231) >> 14;
        if (var9 == 0L) {
            return;
        }
        if (arg3 != 0) {
            if (arg3 == 1) {
                class132.method978(arg2, arg6, arg4);
                return;
            }
            if (arg3 != 2) {
                if (arg3 == 3) {
                    class32.method176(arg2, arg6, arg4);
                    if (var13.field177 == 1) {
                        arg0.method1813(arg4, (byte) -28, arg6);
                        return;
                    }
                }
                return;
            }
            class201.method1464(arg2, arg6, arg4);
            if (var13.field177 != 0 && (var13.field153 + arg6) < 104 && arg4 + var13.field153 < 104 && (var13.field127 + arg6) < 104 && var13.field127 + arg4 < 104) {
                arg0.method1807(var13.field127, var13.field153, arg4, (byte) -121, var12, arg6, var13.field178);
                return;
            }
            return;
        }
        class253.method1763(arg2, arg6, arg4);
        if (var13.field177 != 0) {
            arg0.method1814(var13.field178, arg6, var12, 125, arg4, var15);
            return;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)V")
    public static final void method1273(int arg0) {
        for (int var1 = -1; var1 < class98.field1856; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class38.field525[var1];
            }
            class108 var6 = class35.field491[var5];
            if (var6 != null && var6.field4036 > 0) {
                var6.field4036--;
                if (var6.field4036 == 0) {
                    var6.field3989 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class46.field659; var2++) {
            int var3 = class245.field4490[var2];
            class38 var4 = class131.field2428[var3];
            if (var4 != null && var4.field4036 > 0) {
                var4.field4036--;
                if (var4.field4036 == 0) {
                    var4.field3989 = null;
                }
            }
        }
        if (arg0 >= -19) {
            field3184 = null;
        }
        field3198++;
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)V")
    public final void method1274(int arg0) {
        field3188++;
        int var2 = this.field3207;
        if (arg0 != -5226) {
            this.method1274(-5);
        }
        if (this.field3193 != null) {
            class12 var5 = this.field3193.method63(107);
            if (var5 == null) {
                this.field3189 = 0;
                this.field3207 = -1;
                this.field3185 = 0;
                this.field3196 = null;
                this.field3200 = 0;
            } else {
                this.field3185 = var5.field137;
                this.field3196 = var5.field128;
                this.field3207 = var5.field132;
                this.field3189 = var5.field169;
                this.field3200 = var5.field158 * 128;
            }
        } else if (this.field3191 != null) {
            int var3 = class227.method1623(-128, this.field3191);
            if (var2 != var3) {
                this.field3207 = var3;
                class186 var4 = this.field3191.field517;
                if (var4.field3375 != null) {
                    var4 = var4.method1358((byte) -36);
                }
                if (var4 == null) {
                    this.field3200 = 0;
                } else {
                    this.field3200 = var4.field3397 * 128;
                }
            }
        } else if (this.field3181 != null) {
            this.field3207 = class189.method1375(false, this.field3181);
            this.field3200 = this.field3181.field2041 * 128;
        }
        if (this.field3207 != var2 && this.field3197 != null) {
            class54.field959.method1788(this.field3197);
            this.field3197 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
    public static void method1275(boolean arg0) {
        field3192 = null;
        if (!arg0) {
            method1272((class263) null, (byte) -112, -7, -11, 0, 42, 18);
        }
        field3204 = null;
        field3184 = null;
        field3201 = null;
        field3183 = null;
        field3190 = null;
    }
}
