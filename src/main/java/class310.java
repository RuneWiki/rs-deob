import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class310 {

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Let;")
    private class428 field4517 = new class428();

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    private int field4522;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Llp;")
    private class272 field4507;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "[[I")
    public static int[][] field4516 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)I")
    public final int method1941(int arg0) {
        if (arg0 == -25163) {
            field4515++;
            return this.field4522;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILsv;Ljava/lang/Object;I)V")
    private final void method1942(int arg0, class477 arg1, Object arg2, int arg3) {
        field4518++;
        if (arg3 > this.field4522) {
            throw new IllegalStateException("s>cs");
        }
        this.method1951(64, arg1);
        this.field4510 -= arg3;
        while (this.field4510 < 0) {
            class366 var6 = (class366) this.field4517.method2612(-6261);
            this.method1949((byte) -125, var6);
        }
        class100 var5 = new class100(arg1, arg2, arg3);
        this.field4507.method1751(arg1.method2841((byte) -41), arg0 + 19414, var5);
        this.field4517.method2613(arg0 ^ 0xFFFFB3AC, var5);
        if (arg0 == -19537) {
            var5.field1579 = 0L;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        if (arg0 <= -52) {
            field4516 = null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public final void method1944(int arg0) {
        int var2 = 73 % ((69 - arg0) / 41);
        for (class366 var3 = (class366) this.field4517.method2611((byte) 64); var3 != null; var3 = (class366) this.field4517.method2615(-13153)) {
            if (var3.method657(16)) {
                var3.method25(-13489);
                var3.method705(6511);
                this.field4510 += var3.field5607;
            }
        }
        field4519++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class26.field383 = arg3;
        field4511++;
        int var5 = class325.method2014((byte) 104);
        if (arg1 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class400.field6090.method803()) {
            arg4 = true;
        }
        class502.method3008(arg4, arg0, arg2, arg1, var5, (byte) -59);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/Object;BLsv;)V")
    public final void method1946(Object arg0, byte arg1, class477 arg2) {
        int var4 = -90 / ((arg1 - 70) / 36);
        this.method1942(-19537, arg2, arg0, 1);
        field4514++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)V")
    public final void method1947(int arg0, int arg1) {
        field4509++;
        if (class468.field7004 != null) {
            for (class366 var3 = (class366) this.field4517.method2611((byte) 83); var3 != null; var3 = (class366) this.field4517.method2615(arg0 ^ 0xFFFFCC9F)) {
                if (var3.method657(16)) {
                    if (var3.method656(-72) == null) {
                        var3.method25(-13489);
                        var3.method705(6511);
                        this.field4510 += var3.field5607;
                    }
                } else if ((long) arg1 < ++var3.field1579) {
                    class366 var4 = class468.field7004.method979((byte) 24, var3);
                    this.field4507.method1751(var3.field35, arg0 - 85, var4);
                    class74.method520((byte) 126, var4, var3);
                    var3.method25(-13489);
                    var3.method705(6511);
                }
            }
        }
        if (arg0 != 0) {
            this.method1947(24, 79);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZII)Lcf;")
    public static final class436 method1948(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4520++;
        class436 var5 = new class436();
        var5.field6598 = arg1;
        var5.field6603 = arg0;
        class312.field4570.method1751((long) arg4, -110, var5);
        class321.method2000((byte) 36, arg1);
        class282 var6 = class21.method194(-111, arg4);
        if (var6 != null) {
            class206.method1385(arg3 + 28124, var6);
        }
        if (class201.field2705 != null) {
            class206.method1385(arg3 ^ 0xFFFF9224, class201.field2705);
            class201.field2705 = null;
        }
        class184.method1246((byte) 105);
        if (var6 != null) {
            class131.method893(var6, !arg2, 1413331184);
        }
        if (!arg2) {
            class343.method2219(arg1);
        }
        if (!arg2 && class337.field5232 != -1) {
            class480.method2853(false, class337.field5232, 1);
        }
        if (arg3 != -28122) {
            field4516 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLcb;)V")
    private final void method1949(byte arg0, class366 arg1) {
        if (arg1 != null) {
            arg1.method25(-13489);
            arg1.method705(6511);
            this.field4510 += arg1.field5607;
        }
        if (arg0 != -125) {
            this.field4522 = -37;
        }
        field4523++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BLsv;)Ljava/lang/Object;")
    public final Object method1950(byte arg0, class477 arg1) {
        field4513++;
        long var3 = arg1.method2841((byte) -71);
        if (arg0 != 49) {
            this.field4510 = 32;
        }
        for (class366 var5 = (class366) this.field4507.method1747(var3, false); var5 != null; var5 = (class366) this.field4507.method1748(0)) {
            if (var5.field5606.method2842(arg1, 19524)) {
                Object var6 = var5.method656(-113);
                if (var6 != null) {
                    if (var5.method657(16)) {
                        class100 var7 = new class100(arg1, var6, var5.field5607);
                        this.field4507.method1751(var5.field35, -93, var7);
                        this.field4517.method2613(3, var7);
                        var7.field1579 = 0L;
                        var5.method25(-13489);
                        var5.method705(6511);
                    } else {
                        this.field4517.method2613(3, var5);
                        var5.field1579 = 0L;
                    }
                    return var6;
                }
                var5.method25(arg0 ^ 0xFFFFCB7E);
                var5.method705(6511);
                this.field4510 += var5.field5607;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILsv;)V")
    private final void method1951(int arg0, class477 arg1) {
        field4524++;
        long var3 = arg1.method2841((byte) -100);
        if (arg0 < 50) {
            this.method1947(-3, -13);
        }
        for (class366 var5 = (class366) this.field4507.method1747(var3, false); var5 != null; var5 = (class366) this.field4507.method1748(0)) {
            if (var5.field5606.method2842(arg1, 19524)) {
                this.method1949((byte) -125, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public final void method1952(byte arg0) {
        if (arg0 > -68) {
            this.method1946(null, (byte) -33, null);
        }
        this.field4517.method2614(false);
        field4521++;
        this.field4507.method1745(-101);
        this.field4510 = this.field4522;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)I")
    public final int method1953(int arg0) {
        field4508++;
        return arg0 == 2 ? this.field4510 : 92;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(I)V")
    public class310(int arg0) {
        this.field4522 = arg0;
        this.field4510 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4507 = new class272(var2);
    }

    static {
        new class446("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
    }
}
