import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class184 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public int field3241;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "[S")
    public short[] field3247;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "[B")
    public byte[] field3231;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[Lp;")
    public class280[] field3238;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[S")
    public short[] field3237;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[I")
    public int[] field3249;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lp;")
    public static class280 field3234 = class18.method140((byte) -125, "(U2");

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field3236 = 0;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[S")
    public static short[] field3244 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Ltg;")
    public static class180 field3246;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
    public final int method1275(int arg0, int arg1) {
        if (arg0 <= 117) {
            return 104;
        } else {
            field3240++;
            return this.field3231[arg1] & 0x3;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILp;ISIJLp;I)V")
    public static final void method1276(int arg0, class280 arg1, int arg2, short arg3, int arg4, long arg5, class280 arg6, int arg7) {
        field3235++;
        if (class31.field582) {
            return;
        }
        if (class157.field2745 < 500) {
            class197.field3441[class157.field2745] = arg1;
            class258.field4566[class157.field2745] = arg6;
            class123.field2161[class157.field2745] = arg4 == -1 ? class277.field4808 : arg4;
            class275.field4765[class157.field2745] = arg3;
            class219.field3753[class157.field2745] = arg5;
            class242.field4235[class157.field2745] = arg0;
            class227.field3917[class157.field2745] = arg7;
            class157.field2745++;
        }
        if (arg2 != 6479) {
            method1279((byte) 107);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZJ)V")
    public static final void method1277(boolean arg0, long arg1) {
        field3245++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0) {
            field3234 = null;
        }
        for (int var3 = 0; var3 < class208.field3590; var3++) {
            if (class49.field794[var3] == arg1) {
                class208.field3590--;
                for (int var4 = var3; var4 < class208.field3590; var4++) {
                    class129.field2236[var4] = class129.field2236[var4 + 1];
                    class50.field826[var4] = class50.field826[var4 + 1];
                    class30.field571[var4] = class30.field571[var4 + 1];
                    class49.field794[var4] = class49.field794[var4 + 1];
                    class200.field3497[var4] = class200.field3497[var4 + 1];
                    class158.field2757[var4] = class158.field2757[var4 + 1];
                }
                class259.field4597 = class237.field4118;
                class144.field2518++;
                class34.field627.method551(12, true);
                class34.field627.method219(arg1, 94);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLp;)V")
    public static final void method1278(byte arg0, class280 arg1) {
        field3242++;
        if (arg0 != -57) {
            method1283((class280) null, -62, true);
        }
        int var2 = class102.method717((byte) 74, arg1);
        if (var2 != -1) {
            class126.method874(class14.field280.field3247[var2], true, class14.field280.field3237[var2]);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Lta;")
    public static final class251 method1279(byte arg0) {
        field3248++;
        try {
            if (arg0 < 22) {
                field3234 = null;
            }
            return (class251) Class.forName("fj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z")
    public final boolean method1280(byte arg0, int arg1) {
        if (arg0 != -85) {
            method1276(41, (class280) null, 98, (short) 29, 105, 61L, (class280) null, 106);
        }
        field3230++;
        return (this.field3231[arg1] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)Z")
    public final boolean method1281(int arg0, int arg1) {
        field3232++;
        if (arg1 == 0) {
            return (this.field3231[arg0] & 0x10) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILrk;JZ)V")
    public static final void method1282(int arg0, int arg1, int arg2, int arg3, class265 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class245 var8 = new class245();
        var8.field4301 = arg4;
        var8.field4306 = arg1 * 128 + 64;
        var8.field4300 = arg2 * 128 + 64;
        var8.field4308 = arg3;
        var8.field4303 = arg5;
        if (class220.field3787[arg0][arg1][arg2] == null) {
            class220.field3787[arg0][arg1][arg2] = new class162(arg0, arg1, arg2);
        }
        class220.field3787[arg0][arg1][arg2].field2839 = var8;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lp;IZ)V")
    public static final void method1283(class280 arg0, int arg1, boolean arg2) {
        field3243++;
        class280 var3 = arg0.method1854(-66);
        int var4 = 0;
        int var5 = arg2 ? 32768 : 0;
        int var6 = var5 + (arg2 ? class22.field402 : class49.field811);
        short[] var7 = new short[16];
        for (int var8 = var5; var8 < var6; var8++) {
            class150 var11 = class180.method1238((byte) -111, var8);
            if (var11.field2600 && var11.method1046((byte) -108).method1854(arg1 ^ 0xFFFF9700).method1866(var3, (byte) -128) != -1) {
                if (var4 >= 50) {
                    class59.field956 = null;
                    class83.field1364 = -1;
                    return;
                }
                if (var7.length <= var4) {
                    short[] var12 = new short[var7.length * 2];
                    for (int var13 = 0; var13 < var4; var13++) {
                        var12[var13] = var7[var13];
                    }
                    var7 = var12;
                }
                var7[var4++] = (short) var8;
            }
        }
        class175.field3033 = 0;
        class83.field1364 = var4;
        class280[] var9 = new class280[class83.field1364];
        class59.field956 = var7;
        for (int var10 = 0; var10 < class83.field1364; var10++) {
            var9[var10] = class180.method1238((byte) -111, var7[var10]).method1046((byte) -71);
        }
        if (arg1 != 26814) {
            field3244 = null;
        }
        class106.method742(var9, class59.field956, 14073);
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Z")
    public final boolean method1284(int arg0, int arg1) {
        if (arg1 <= 7) {
            return false;
        } else {
            field3233++;
            return (this.field3231[arg0] & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        if (arg0 != 128) {
            method1282(108, 125, 24, 19, (class265) null, 0L, true);
        }
        field3234 = null;
        field3244 = null;
        field3246 = null;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
    public class184(int arg0) {
        this.field3241 = arg0;
        this.field3247 = new short[this.field3241];
        this.field3231 = new byte[this.field3241];
        this.field3238 = new class280[this.field3241];
        this.field3237 = new short[this.field3241];
        this.field3249 = new int[this.field3241];
    }
}
