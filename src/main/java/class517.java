import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class517 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Ltja;")
    private class288 field7273 = new class288(64);

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lbt;")
    public class48 field7280;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lbt;")
    private class48 field7282;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "Llja;")
    public static class744 field7276 = new class744(88, -1);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 3)
    public final void method3090(int arg0) {
        class288 var2 = this.field7273;
        synchronized (this.field7273) {
            if (arg0 != -9493) {
                method3097((byte) 99);
            }
            this.field7273.method1687((byte) 61);
        }
        field7277++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 17)
    public static final void method3091(int arg0, int arg1) {
        field7284++;
        if (arg1 != 18412) {
            method3094((byte) 58);
        }
        class714 var2 = class350.method2072((long) arg0, 9, (byte) 117);
        var2.method4044((byte) -128);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 33)
    public final void method3092(int arg0) {
        class288 var2 = this.field7273;
        synchronized (this.field7273) {
            this.field7273.method1690(arg0 ^ arg0);
        }
        field7278++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V", line = 48)
    public final void method3093(byte arg0, int arg1) {
        class288 var3 = this.field7273;
        synchronized (this.field7273) {
            this.field7273.method1694(arg1, -37);
            int var4 = -41 / ((arg0 + 17) / 56);
        }
        field7281++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 63)
    public static final void method3094(byte arg0) {
        if (arg0 <= 101) {
            field7276 = null;
        }
        class619.field8334 = 0;
        field7275++;
        int var1 = (class300.field3596.field823 >> 9) + class632.field8626;
        int var2 = (class300.field3596.field813 >> 9) + class620.field8435;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class619.field8334 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class619.field8334 = 1;
        }
        if (class619.field8334 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class619.field8334 = 0;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)Lsu;", line = 93)
    public final class224 method3095(byte arg0, int arg1) {
        field7274++;
        if (arg0 > -60) {
            this.field7273 = null;
        }
        class288 var3 = this.field7273;
        class224 var4;
        synchronized (this.field7273) {
            var4 = (class224) this.field7273.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field7282;
        byte[] var6;
        synchronized (this.field7282) {
            var6 = this.field7282.method437(3, (byte) -120, arg1);
        }
        class224 var7 = new class224();
        var7.field2618 = this;
        if (var6 != null) {
            var7.method1379(52, new class403(var6));
        }
        class288 var8 = this.field7273;
        synchronized (this.field7273) {
            this.field7273.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V", line = 124)
    public static final void method3096(int arg0) {
        field7279++;
        if (arg0 != 3) {
            field7276 = null;
        }
        class330.method1958(false);
        class580.method3339((byte) -58);
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lmja;ILbt;Lbt;)V", line = 149)
    public class517(class441 arg0, int arg1, class48 arg2, class48 arg3) {
        this.field7280 = arg3;
        this.field7282 = arg2;
        this.field7282.method431(4, 3);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V", line = 140)
    public static void method3097(byte arg0) {
        if (arg0 != 55) {
            field7276 = null;
        }
        field7276 = null;
    }
}
