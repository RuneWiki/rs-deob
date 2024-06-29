import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class466 extends class234 implements class526 {

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "Leea;")
    private class680 field6351;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[I")
    public static int[] field6348 = new int[4];

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[Lcfa;")
    public static class33[] field6352 = new class33[6];

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)Leea;")
    public final class680 method2310(byte arg0) {
        field6349++;
        if (arg0 > -33) {
            this.method1446(-61, 102);
        }
        return this.field6351;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;")
    public final Buffer method1025(boolean arg0, byte arg1) {
        if (arg1 != 67) {
            method2640((byte) -68, null);
        }
        field6356++;
        return super.method1025(arg0, (byte) 67);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public final void method1446(int arg0, int arg1) {
        field6355++;
        super.method1446(this.field6351.field9661 * arg0, arg1);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(Z)V")
    public static final void method2637(boolean arg0) {
        for (int var1 = 0; var1 < class485.field6555; var1++) {
            class578 var2 = class658.field9278[var1];
            if (var2.field7979 == 3) {
                if (var2.field7978 == null) {
                    var2.field7981 = Integer.MIN_VALUE;
                } else {
                    class285.field3866.method3203(var2.field7978);
                }
            }
        }
        if (!arg0) {
            method2640((byte) 58, null);
        }
        field6350++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BILjava/lang/String;)Lot;")
    public static final class240 method2638(byte arg0, int arg1, String arg2) {
        field6353++;
        class240 var3;
        try {
            var3 = (class240) Class.forName("dl").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class81();
        }
        if (arg0 != 108) {
            field6348 = null;
        }
        var3.field3152 = arg2;
        var3.field3148 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Z")
    public final boolean method1021(boolean arg0) {
        if (arg0) {
            field6358++;
            return super.method1021(true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(B)V")
    public static void method2639(byte arg0) {
        if (arg0 == -52) {
            field6348 = null;
            field6352 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)I")
    public final int method1024(byte arg0) {
        if (arg0 == 54) {
            field6354++;
            return super.method1024((byte) 54);
        } else {
            return 84;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lmc;Leea;Z)V")
    public class466(class381 arg0, class680 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field6351 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLcr;)[Lmh;")
    public static final class556[] method2640(byte arg0, class112 arg1) {
        field6357++;
        if (!arg1.method611(0)) {
            return new class556[0];
        }
        class280 var2 = arg1.method629(arg0 + 25);
        if (arg0 != -21) {
            field6352 = null;
        }
        while (var2.field3773 == 0) {
            class660.method3668(arg0 + 20, 10L);
        }
        if (var2.field3773 == 2) {
            return new class556[0];
        }
        int[] var3 = (int[]) var2.field3772;
        class556[] var4 = new class556[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class556 var6 = new class556();
            var4[var5] = var6;
            var6.field7596 = var3[var5 << 2];
            var6.field7592 = var3[(var5 << 2) + 1];
            var6.field7599 = var3[(var5 << 2) + 2];
            var6.field7598 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
    public final void method1022(byte arg0) {
        super.method1022(arg0);
        field6359++;
    }
}
