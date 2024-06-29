import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class210 {

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lpf;")
    private class485 field2899 = new class485();

    @OriginalMember(owner = "client!co", name = "t", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!co", name = "s", descriptor = "I")
    private int field2914;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "Lwb;")
    private class45 field2896;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "[I")
    public static int[] field2904 = new int[2048];

    @OriginalMember(owner = "client!co", name = "x", descriptor = "Lec;")
    public static class40 field2919;

    @OriginalMember(owner = "client!co", name = "y", descriptor = "Lss;")
    public static class140 field2920;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!co", name = "u", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!co", name = "v", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!co", name = "w", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Lws;")
    public static class158 field2906;

    @OriginalMember(owner = "client!co", name = "f", descriptor = "Lg;")
    public static class470 field2901;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "[S")
    public static short[] field2903;

    static {
        new class40("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field2919 = new class40("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field2920 = new class140(8, 6);
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 7)
    public final Object method1163(byte arg0, long arg1) {
        field2917++;
        int var4 = 94 / ((arg0 - 40) / 62);
        class412 var5 = (class412) this.field2896.method233(57, arg1);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method342(-123);
        if (var6 == null) {
            var5.method702((byte) -114);
            var5.method104((byte) -98);
            this.field2915 += var5.field5865;
            return null;
        }
        if (var5.method338((byte) 90)) {
            class66 var7 = new class66(var6, var5.field5865);
            this.field2896.method234(-54, var5.field1776, var7);
            this.field2899.method2866(var7, 674847596);
            var7.field199 = 0L;
            var5.method702((byte) -114);
            var5.method104((byte) -111);
        } else {
            this.field2899.method2866(var5, 674847596);
            var5.field199 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)I", line = 53)
    public final int method1164(boolean arg0) {
        field2900++;
        if (!arg0) {
            this.method1175(-122L, 35, (Object) null, 68);
        }
        return this.field2914;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V", line = 64)
    public final void method1165(byte arg0) {
        field2908++;
        if (arg0 != 118) {
            this.method1176(-14);
        }
        this.field2899.method2864(551432450);
        this.field2896.method236(3);
        this.field2915 = this.field2914;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V", line = 78)
    public final void method1166(int arg0, byte arg1) {
        field2916++;
        if (arg1 != -52) {
            field2904 = null;
        }
        if (class278.field3964 == null) {
            return;
        }
        for (class412 var3 = (class412) this.field2899.method2862(2); var3 != null; var3 = (class412) this.field2899.method2869(true)) {
            if (var3.method338((byte) 49)) {
                if (var3.method342(arg1 ^ 0x40) == null) {
                    var3.method702((byte) -114);
                    var3.method104((byte) -85);
                    this.field2915++;
                }
            } else if ((long) arg0 < ++var3.field199) {
                class412 var4 = class278.field3964.method1570(var3, 4910);
                this.field2896.method234(arg1 ^ 0x6, var3.field1776, var4);
                class31.method156((byte) -126, var3, var4);
                var3.method702((byte) -114);
                var3.method104((byte) -72);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)I", line = 130)
    public final int method1167(int arg0) {
        field2898++;
        if (arg0 > -107) {
            method1177((byte) -94);
        }
        int var2 = 0;
        for (class412 var3 = (class412) this.field2899.method2862(2); var3 != null; var3 = (class412) this.field2899.method2869(true)) {
            if (!var3.method338((byte) 96)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILcm;)V", line = 154)
    private final void method1168(int arg0, class412 arg1) {
        if (arg1 != null) {
            arg1.method702((byte) -114);
            arg1.method104((byte) -113);
            this.field2915 += arg1.field5865;
        }
        if (arg0 < 86) {
            field2903 = null;
        }
        field2910++;
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)V", line = 176)
    public final void method1169(int arg0) {
        field2897++;
        if (arg0 != 1076) {
            field2901 = null;
        }
        for (class412 var2 = (class412) this.field2899.method2862(2); var2 != null; var2 = (class412) this.field2899.method2869(true)) {
            if (var2.method338((byte) 77)) {
                var2.method702((byte) -114);
                var2.method104((byte) -112);
                this.field2915 += var2.field5865;
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(B)V", line = 205)
    public static final void method1170(byte arg0) {
        field2918++;
        if (class400.field5697) {
            return;
        }
        class400.field5697 = true;
        if (class92.field1146) {
            class349.field5021 = (float) ((int) class349.field5021 - 65 & 0xFFFFFF80);
        } else {
            class184.field2404 += (-24.0F - class184.field2404) / 2.0F;
        }
        if (arg0 != 116) {
            method1170((byte) 73);
        }
        class83.field1010 = true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lkt;I[[B)V", line = 230)
    public static final void method1171(class51 arg0, int arg1, byte[][] arg2) {
        if (arg1 != 64) {
            return;
        }
        field2909++;
        int var3 = class247.field3482.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg2[var4];
            if (var5 != null) {
                int var6 = (class217.field3034[var4] >> 8) * 64 - class93.field1163;
                int var7 = (class217.field3034[var4] & 0xFF) * 64 - class349.field5023;
                class199.method1094((byte) -47);
                arg0.method275(var6, class231.field3205, 1, var7, var5, class174.field2093);
            }
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(JILjava/lang/Object;)V", line = 263)
    public final void method1172(long arg0, int arg1, Object arg2) {
        this.method1175(arg0, arg1, arg2, 8);
        field2907++;
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 271)
    public final Object method1173(byte arg0) {
        field2905++;
        if (arg0 >= -58) {
            this.method1164(true);
        }
        class412 var2 = (class412) this.field2896.method239(0);
        while (var2 != null) {
            Object var3 = var2.method342(-110);
            if (var3 != null) {
                return var3;
            }
            class412 var4 = var2;
            var2 = (class412) this.field2896.method239(0);
            var4.method702((byte) -114);
            var4.method104((byte) -108);
            this.field2915 += var2.field5865;
        }
        return null;
    }

    @OriginalMember(owner = "client!co", name = "d", descriptor = "(B)I", line = 303)
    public final int method1174(byte arg0) {
        field2912++;
        if (arg0 > -18) {
            field2904 = null;
        }
        return this.field2915;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(JILjava/lang/Object;I)V", line = 317)
    private final void method1175(long arg0, int arg1, Object arg2, int arg3) {
        field2913++;
        if (arg1 > this.field2914) {
            throw new IllegalStateException("s>cs");
        }
        this.method1178(arg0, (byte) -123);
        this.field2915 -= arg1;
        while (this.field2915 < 0) {
            class412 var7 = (class412) this.field2899.method2865(2);
            this.method1168(115, var7);
        }
        if (arg3 == 8) {
            class66 var6 = new class66(arg2, arg1);
            this.field2896.method234(arg3 ^ 0xFFFFFFAF, arg0, var6);
            this.field2899.method2866(var6, 674847596);
            var6.field199 = 0L;
        }
    }

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 347)
    public final Object method1176(int arg0) {
        field2902++;
        class412 var2 = (class412) this.field2896.method241(arg0);
        while (var2 != null) {
            Object var3 = var2.method342(-115);
            if (var3 != null) {
                return var3;
            }
            class412 var4 = var2;
            var2 = (class412) this.field2896.method239(0);
            var4.method702((byte) -114);
            var4.method104((byte) -75);
            this.field2915 += var2.field5865;
        }
        return null;
    }

    @OriginalMember(owner = "client!co", name = "e", descriptor = "(B)V", line = 375)
    public static void method1177(byte arg0) {
        field2920 = null;
        field2904 = null;
        int var1 = -81 % ((arg0 + 39) / 36);
        field2901 = null;
        field2906 = null;
        field2919 = null;
        field2903 = null;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(JB)V", line = 399)
    private final void method1178(long arg0, byte arg1) {
        field2911++;
        class412 var4 = (class412) this.field2896.method233(-87, arg0);
        if (arg1 > -14) {
            this.method1164(false);
        }
        this.method1168(87, var4);
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V", line = 414)
    public class210(int arg0) {
        this.field2915 = arg0;
        this.field2914 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2896 = new class45(var2);
    }
}
