import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class236 {

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    private int field4040 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[Llf;")
    private class190[] field4026;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    private int field4038;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "Lqe;")
    public static class168 field4024 = class66.method448(")4", 43);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field4021 = 0;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Lqe;")
    public static class168 field4028 = class66.method448("Cabbage", -125);

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Lqe;")
    public static class168 field4035 = class66.method448(" zuerst von Ihrer Freunde)2Liste(Q", 91);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lqe;")
    public static class168 field4037 = class66.method448("settings=", 22);

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "J")
    private long field4039;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Llf;")
    private class190 field4030;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "Llf;")
    private class190 field4041;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILoe;)V")
    public static final void method1526(int arg0, class256 arg1) {
        field4033++;
        if (class18.field186) {
            return;
        }
        class216.method1414();
        if (arg0 < 40) {
            method1528(null, (byte) 108);
        }
        class46.field610 = class114.method786(class33.field416, (byte) -2, arg1);
        class46.field610.method76(-95, 0);
        class194.field3387 = class151.method1002(class93.field1466, arg1, (byte) 107);
        class194.field3387.method1038(382 - class194.field3387.field2737 / 2, 18);
        class18.field186 = true;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JB)Llf;")
    public final class190 method1527(long arg0, byte arg1) {
        this.field4039 = arg0;
        class190 var4 = this.field4026[(int) (arg0 & (long) (this.field4038 - 1))];
        this.field4030 = var4.field3307;
        field4029++;
        while (this.field4030 != var4) {
            if (this.field4030.field3308 == arg0) {
                class190 var5 = this.field4030;
                this.field4030 = this.field4030.field3307;
                return var5;
            }
            this.field4030 = this.field4030.field3307;
        }
        this.field4030 = null;
        return arg1 >= -46 ? null : null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Loe;B)V")
    public static final void method1528(class256 arg0, byte arg1) {
        if (arg1 == -18) {
            class173.field3008 = arg0;
            field4036++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public static void method1529(boolean arg0) {
        if (arg0) {
            field4035 = null;
        }
        field4035 = null;
        field4037 = null;
        field4024 = null;
        field4028 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public final void method1530(int arg0) {
        if (arg0 != -1) {
            this.field4040 = 71;
        }
        for (int var2 = 0; var2 < this.field4038; var2++) {
            class190 var3 = this.field4026[var2];
            while (true) {
                class190 var4 = var3.field3307;
                if (var3 == var4) {
                    break;
                }
                var4.method1234(arg0 ^ 0xFFFFBCBF);
            }
        }
        field4023++;
        this.field4041 = null;
        this.field4030 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
    public static final int method1531(int arg0, int arg1) {
        if (arg1 != 32385) {
            method1531(-60, -76);
        }
        field4032++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Llf;")
    public final class190 method1532(byte arg0) {
        field4031++;
        if (this.field4030 == null) {
            return null;
        }
        if (arg0 != -103) {
            this.method1532((byte) -67);
        }
        class190 var2 = this.field4026[(int) (this.field4039 & (long) (this.field4038 - 1))];
        while (this.field4030 != var2) {
            if (this.field4030.field3308 == this.field4039) {
                class190 var3 = this.field4030;
                this.field4030 = this.field4030.field3307;
                return var3;
            }
            this.field4030 = this.field4030.field3307;
        }
        this.field4030 = null;
        return null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JILlf;)V")
    public final void method1533(long arg0, int arg1, class190 arg2) {
        int var5 = 123 % ((-arg1 - 52) / 44);
        if (arg2.field3313 != null) {
            arg2.method1234(17216);
        }
        field4034++;
        class190 var6 = this.field4026[(int) ((long) (this.field4038 - 1) & arg0)];
        arg2.field3308 = arg0;
        arg2.field3313 = var6.field3313;
        arg2.field3307 = var6;
        arg2.field3313.field3307 = arg2;
        arg2.field3307.field3313 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Llf;")
    public final class190 method1534(int arg0) {
        field4027++;
        if (this.field4040 > 0 && this.field4026[this.field4040 - 1] != this.field4041) {
            class190 var2 = this.field4041;
            this.field4041 = var2.field3307;
            return var2;
        } else if (arg0 == -21389) {
            while (this.field4038 > this.field4040) {
                class190 var3 = this.field4026[this.field4040++].field3307;
                if (this.field4026[this.field4040 - 1] != var3) {
                    this.field4041 = var3.field3307;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)I")
    public static final int method1535(int arg0, int arg1, int arg2, int arg3) {
        field4022++;
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (arg3 > var5 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1;
        int var7 = arg0 & 0x7F;
        int var8 = arg2 & 0x7F;
        if (arg1 < 3 && (class205.field3561[1][var5][var4] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var9 = (128 - var7) * class23.field275[var6][var5][var4 + 1] + class23.field275[var6][var5 + 1][var4 + 1] * var7 >> 7;
        int var10 = (128 - var7) * class23.field275[var6][var5][var4] + class23.field275[var6][var5 + 1][var4] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var9 >> 7;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Llf;")
    public final class190 method1536(int arg0) {
        field4025++;
        this.field4040 = 0;
        if (arg0 <= 44) {
            this.field4038 = -49;
        }
        return this.method1534(-21389);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V")
    public class236(int arg0) {
        this.field4026 = new class190[arg0];
        this.field4038 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field4026[var2] = new class190();
            var3.field3307 = var3;
            var3.field3313 = var3;
        }
    }
}
