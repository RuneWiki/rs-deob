import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class257 {

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field3832 = -1;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "[I")
    public static int[] field3835 = new int[99];

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[[Z")
    public static boolean[][] field3836 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIII)I", line = 6)
    public static final int method1784(byte arg0, int arg1, int arg2, int arg3) {
        field3828++;
        if (arg0 != 91) {
            method1789(16, (class211) null);
        }
        return arg1 < arg2 ? arg2 : (arg3 >= arg1 ? arg1 : arg3);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Loi;Lhj;I)Ljn;", line = 25)
    public static final class123 method1785(class319 arg0, class29 arg1, int arg2) {
        field3830++;
        if (arg2 >= -108) {
            field3834 = -7;
        }
        long var3 = ((long) arg0.field4973 << 56) + ((long) arg0.field4968 << 32) - (long) (-(arg0.field4966 + 1 << 16) + -arg0.field4976);
        class123 var5 = (class123) arg1.method203(1710, var3);
        if (var5 == null) {
            var5 = new class123(arg0.field4966, (float) arg0.field4976, true, false, arg0.field4968);
            arg1.method208(var5, var3, 0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)[F", line = 50)
    public static final float[] method1786(byte arg0) {
        field3831++;
        int var1 = -84 % ((-arg0 - 62) / 42);
        float var2 = class264.method1829() + class264.method1827();
        int var3 = class264.method1820();
        class329.field5087[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFF9E87) >> 16) / 255.0F;
        float var5 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var6 = (float) (var3 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class329.field5087[2] = class35.field503[2] * var6 * var7 * var2;
        class329.field5087[1] = class35.field503[1] * var5 * var7 * var2;
        class329.field5087[0] = class35.field503[0] * var4 * var7 * var2;
        return class329.field5087;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 76)
    public static final Class method1787(int arg0, String arg1) throws ClassNotFoundException {
        field3833++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else {
            if (arg0 != 3) {
                field3832 = -20;
            }
            if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3835[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 119)
    public static void method1788(int arg0) {
        field3835 = null;
        if (arg0 > 84) {
            field3836 = (boolean[][]) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILlb;)V", line = 133)
    public static final void method1789(int arg0, class211 arg1) {
        field3827++;
        if (class274.field4146) {
            return;
        }
        if (class36.field534) {
            class194.method1403();
        } else {
            class168.method1231();
        }
        if (arg0 < 68) {
            field3832 = 120;
        }
        class235.field3609 = class149.method1104(class150.field2274, arg1, (byte) -70);
        int var2 = class210.field3314;
        int var3 = var2 * 956 / 503;
        class235.field3609.method187((class125.field1972 - var3) / 2, 0, var3, var2);
        class87.field1283 = class21.method145(arg1, 64, class250.field3748);
        class87.field1283.method589(class125.field1972 / 2 - (class87.field1283.field4579 / 2), 18);
        class274.field4146 = true;
    }
}
