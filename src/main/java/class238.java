import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class238 {

    @OriginalMember(owner = "client!so", name = "g", descriptor = "F")
    public float field3329 = 1.0F;

    @OriginalMember(owner = "client!so", name = "r", descriptor = "F")
    public float field3340 = 1.0F;

    @OriginalMember(owner = "client!so", name = "v", descriptor = "F")
    public float field3344 = 0.25F;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "I")
    public int field3347;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "F")
    public float field3337;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "F")
    public float field3335;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!so", name = "w", descriptor = "I")
    public int field3345;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "F")
    public float field3327;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lke;")
    public class295 field3331;

    @OriginalMember(owner = "client!so", name = "u", descriptor = "I")
    public int field3343;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[I")
    public static int[] field3325 = new int[32];

    @OriginalMember(owner = "client!so", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3334 = new String[5];

    @OriginalMember(owner = "client!so", name = "s", descriptor = "I")
    public static int field3341 = 16777215;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field3326 = 0;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Luc;")
    public static class51 field3332 = new class51(20);

    @OriginalMember(owner = "client!so", name = "x", descriptor = "Luc;")
    public static class51 field3346 = new class51(64);

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!so", name = "q", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!so", name = "t", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "[I")
    public static int[] field3323;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "[[B")
    public static byte[][] field3324;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)Lgo;")
    public static final class60 method1546(int arg0, byte arg1) {
        field3328++;
        class60 var2 = (class60) class195.field2699.method378((byte) 28, (long) arg0);
        if (arg1 != -20) {
            field3323 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4050.method1235(26, false, arg0);
        class60 var4 = new class60();
        if (var3 != null) {
            var4.method529(58, new class341(var3));
        }
        class195.field2699.method367((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lso;B)Z")
    public final boolean method1547(class238 arg0, byte arg1) {
        field3342++;
        if (arg1 == -58) {
            return this.field3347 == arg0.field3347 && this.field3337 == arg0.field3337 && this.field3335 == arg0.field3335 && this.field3327 == arg0.field3327 && this.field3344 == arg0.field3344 && this.field3329 == arg0.field3329 && this.field3340 == arg0.field3340 && this.field3338 == arg0.field3338 && this.field3330 == arg0.field3330 && this.field3331 == arg0.field3331;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method1548(int arg0) {
        field3332 = null;
        field3346 = null;
        if (arg0 != -6373) {
            field3323 = null;
        }
        field3325 = null;
        field3324 = null;
        field3323 = null;
        field3334 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lfb;I)V")
    public final void method1549(class341 arg0, int arg1) {
        field3339++;
        this.field3329 = (float) (arg0.method2233((byte) 104) * 8) / 255.0F;
        if (arg1 <= -18) {
            this.field3344 = (float) (arg0.method2233((byte) 104) * 8) / 255.0F;
            this.field3340 = (float) (arg0.method2233((byte) 104) * 8) / 255.0F;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
    public class238() {
        this.field3347 = field3341;
        this.field3337 = 1.1523438F;
        this.field3335 = 0.69921875F;
        this.field3336 = -50;
        this.field3330 = 0;
        this.field3345 = -50;
        this.field3327 = 1.2F;
        this.field3338 = class123.field1592;
        this.field3331 = class232.field3224;
        this.field3343 = -60;
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lfb;)V")
    public class238(class341 arg0) {
        int var2 = arg0.method2233((byte) 104);
        if (class273.field4015 && class117.field1529.method495() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field3347 = field3341;
            } else {
                this.field3347 = arg0.method2232(-75);
            }
            if ((var2 & 0x2) == 0) {
                this.field3337 = 1.1523438F;
            } else {
                this.field3337 = (float) arg0.method2239(-1076227960) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field3335 = 0.69921875F;
            } else {
                this.field3335 = (float) arg0.method2239(-1076227960) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field3327 = 1.2F;
            } else {
                this.field3327 = (float) arg0.method2239(-1076227960) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2232(-7);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2239(-1076227960);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2239(-1076227960);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2239(-1076227960);
            }
            this.field3347 = field3341;
            this.field3335 = 0.69921875F;
            this.field3327 = 1.2F;
            this.field3337 = 1.1523438F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3336 = -50;
            this.field3345 = -50;
            this.field3343 = -60;
        } else {
            this.field3336 = arg0.method2212(-2);
            this.field3343 = arg0.method2212(-2);
            this.field3345 = arg0.method2212(-2);
        }
        if ((var2 & 0x20) == 0) {
            this.field3338 = class123.field1592;
        } else {
            this.field3338 = arg0.method2232(-117);
        }
        if ((var2 & 0x40) == 0) {
            this.field3330 = 0;
        } else {
            this.field3330 = arg0.method2239(-1076227960);
        }
        if ((var2 & 0x80) == 0) {
            this.field3331 = class232.field3224;
        } else {
            this.field3331 = class365.method2413(arg0.method2239(-1076227960), 0, arg0.method2239(-1076227960), arg0.method2239(-1076227960), arg0.method2239(-1076227960), arg0.method2239(-1076227960), arg0.method2239(-1076227960));
        }
    }
}
