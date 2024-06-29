import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class538 {

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "Lhh;")
    public static class608 field7955 = new class608(14, 1);

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "Lhh;")
    public static class608 field7959 = new class608(15, 4);

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "Lhh;")
    public static class608 field7960 = new class608(16, -2);

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "Lhh;")
    public static class608 field7961 = new class608(17, 0);

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "Lhh;")
    public static class608 field7962 = new class608(18, -2);

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "Lhh;")
    public static class608 field7963 = new class608(19, -2);

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "Lhh;")
    public static class608 field7964 = new class608(20, 6);

    @OriginalMember(owner = "client!nda", name = "n", descriptor = "Lhh;")
    public static class608 field7965 = new class608(21, 9);

    @OriginalMember(owner = "client!nda", name = "o", descriptor = "Lhh;")
    public static class608 field7966 = new class608(22, -2);

    @OriginalMember(owner = "client!nda", name = "p", descriptor = "Lhh;")
    public static class608 field7967 = new class608(23, 4);

    @OriginalMember(owner = "client!nda", name = "q", descriptor = "Lhh;")
    public static class608 field7968 = new class608(24, -1);

    @OriginalMember(owner = "client!nda", name = "r", descriptor = "Lhh;")
    public static class608 field7969 = new class608(25, -2);

    @OriginalMember(owner = "client!nda", name = "s", descriptor = "Lhh;")
    public static class608 field7970 = new class608(26, 0);

    @OriginalMember(owner = "client!nda", name = "t", descriptor = "Lhh;")
    public static class608 field7971 = new class608(27, 0);

    @OriginalMember(owner = "client!nda", name = "u", descriptor = "[Lhh;")
    private static class608[] field7972 = new class608[32];

    @OriginalMember(owner = "client!nda", name = "v", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "F")
    public static float field7952;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!nda", name = "w", descriptor = "I")
    public static int field7974;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILqa;)V")
    public static final void method3158(int arg0, class167 arg1) {
        field7957++;
        if (class139.field1826) {
            class297.method1838(2, arg1);
        } else {
            class161.method944(-7509, arg1);
        }
        if (arg0 != -98) {
            method3162(-3, 118);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ID)V")
    public static final void method3159(int arg0, double arg1) {
        if (arg0 != 95) {
            return;
        }
        if (class372.field5396 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class516.field7674[var3] = var4 <= 255 ? var4 : 255;
            }
            class372.field5396 = arg1;
        }
        field7953++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method3160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class67[] var7 = class255.field3737;
        if (arg6 != -70) {
            method3159(45, -1.137405044349829D);
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class67 var9 = var7[var8];
            if (var9 != null && var9.field769 == 2) {
                class435.method2653(3, arg5, arg2 >> 1, arg1 >> 1, var9.field764, var9.field768, arg3, var9.field765 * 2, var9.field766);
                if (class543.field8117[0] > -1 && class576.field8505 % 20 < 10) {
                    class445.field6486[var9.field767].method723(class543.field8117[0] + arg4 - 12, arg0 + -28 + class543.field8117[1]);
                }
            }
        }
        field7954++;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
    public static void method3161(boolean arg0) {
        if (!arg0) {
            return;
        }
        field7965 = null;
        field7964 = null;
        field7963 = null;
        field7971 = null;
        field7972 = null;
        field7968 = null;
        field7959 = null;
        field7955 = null;
        field7961 = null;
        field7970 = null;
        field7962 = null;
        field7966 = null;
        field7969 = null;
        field7960 = null;
        field7967 = null;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)I")
    public static final int method3162(int arg0, int arg1) {
        field7958++;
        return arg0 == -11412 ? arg1 >>> 8 : 28;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(ZIZZI)I")
    public static final int method3163(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field7956++;
        class580 var5 = class585.method3419(-14473, arg3, arg1);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        int var7 = 0;
        if (arg2) {
            return -43;
        }
        while (var5.field8538.length > var7) {
            if (var5.field8538[var7] >= 0 && var5.field8538[var7] < class216.field3204.field8460) {
                class414 var8 = class216.field3204.method3357(var5.field8538[var7], (byte) -124);
                int var9 = var8.method2459(36, arg4, class8.field74.method3290(arg4, 30883).field2339);
                if (arg0) {
                    var6 += var5.field8543[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
            var7++;
        }
        return var6;
    }

    static {
        class608[] var0 = class350.method2141(3);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field7972[var0[var1].field8954] = var0[var1];
        }
        field7973 = 0;
    }
}
