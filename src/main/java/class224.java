import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class224 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Lve;")
    public class347 field3238 = new class347();

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "Lck;")
    public static class451 field3248 = new class451(14, 1);

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lck;")
    public static class451 field3249 = new class451(15, 4);

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "Lck;")
    public static class451 field3250 = new class451(16, -2);

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lck;")
    public static class451 field3251 = new class451(17, 0);

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "Lck;")
    public static class451 field3252 = new class451(18, -2);

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lck;")
    public static class451 field3253 = new class451(20, 6);

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lck;")
    public static class451 field3254 = new class451(21, 8);

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lck;")
    public static class451 field3255 = new class451(22, -2);

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lck;")
    public static class451 field3256 = new class451(23, 4);

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "Lck;")
    public static class451 field3257 = new class451(24, -1);

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "[Lck;")
    private static class451[] field3258 = new class451[32];

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
    public static int[] field3260;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lve;")
    private class347 field3247;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lgs;")
    public static class34 field3259;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field3248 = null;
        field3256 = null;
        field3257 = null;
        field3254 = null;
        field3253 = null;
        field3251 = null;
        field3252 = null;
        field3255 = null;
        field3258 = null;
        int var1 = -32 / ((43 - arg0) / 49);
        field3259 = null;
        field3250 = null;
        field3249 = null;
        field3260 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILve;)V")
    public final void method1481(int arg0, class347 arg1) {
        if (arg1.field5259 != null) {
            arg1.method2252((byte) 122);
        }
        field3239++;
        arg1.field5262 = this.field3238;
        arg1.field5259 = this.field3238.field5259;
        arg1.field5259.field5262 = arg1;
        if (arg0 != 18448) {
            field3252 = null;
        }
        arg1.field5262.field5259 = arg1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lhh;ILhh;Lhh;Lhh;)V")
    public static final void method1482(class84 arg0, int arg1, class84 arg2, class84 arg3, class84 arg4) {
        class346.field5257 = arg4;
        class289.field4155 = arg3;
        field3246++;
        class49.field735 = arg0;
        class335.field5139 = arg2;
        class416.field6157 = new class58[class335.field5139.method658((byte) -89)][];
        class210.field3022 = new boolean[class335.field5139.method658((byte) -121)];
        if (arg1 != -9850) {
            field3256 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)Lve;")
    public final class347 method1483(int arg0) {
        field3237++;
        class347 var2 = this.field3238.field5262;
        if (this.field3238 == var2) {
            this.field3247 = null;
            return null;
        }
        if (arg0 != -1145) {
            this.method1481(51, null);
        }
        this.field3247 = var2.field5262;
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)Lve;")
    public final class347 method1484(int arg0) {
        if (arg0 > -17) {
            field3252 = null;
        }
        field3240++;
        class347 var2 = this.field3247;
        if (this.field3238 == var2) {
            this.field3247 = null;
            return null;
        } else {
            this.field3247 = var2.field5262;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(CB)C")
    public static final char method1485(char arg0, byte arg1) {
        field3244++;
        if (arg1 > -61) {
            return (char) 65466;
        } else if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lps;I)V")
    public static final void method1486(class62 arg0, int arg1) {
        if (arg1 < 92) {
            field3257 = null;
        }
        field3242++;
        class81 var2 = (class81) class351.field5333.method2485(33, (long) arg0.field331);
        if (var2 == null) {
            return;
        }
        if (var2.field1337 != null) {
            class124.field1920.method232(var2.field1337);
            var2.field1337 = null;
        }
        var2.method2663(-126);
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public final int method1487(int arg0) {
        if (arg0 != 28876) {
            method1480(40);
        }
        field3241++;
        int var2 = 0;
        for (class347 var3 = this.field3238.field5262; var3 != this.field3238; var3 = var3.field5262) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class224() {
        this.field3238.field5259 = this.field3238;
        this.field3238.field5262 = this.field3238;
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public final void method1488(int arg0) {
        field3243++;
        while (true) {
            class347 var2 = this.field3238.field5262;
            if (this.field3238 == var2) {
                this.field3247 = null;
                int var3 = -83 % ((-arg0 - 33) / 47);
                return;
            }
            var2.method2252((byte) 122);
        }
    }

    static {
        class451[] var0 = class511.method3036(109);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3258[var0[var1].field6584] = var0[var1];
        }
        field3260 = new int[8];
    }
}
