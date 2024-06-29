import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class221 {

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3078 = -1;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
    public static int[] field3080 = new int[100];

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field3084 = 0;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILub;)I")
    public static final int method1487(int arg0, class17 arg1) {
        field3086++;
        class258 var2 = arg1.field274;
        if (var2.field3627 != null) {
            var2 = var2.method1660(class288.field4208, (byte) 74);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -1) {
            return -80;
        }
        int var3 = var2.field3564;
        class485 var4 = arg1.method1759(57);
        if (arg1.field3829) {
            var3 = var2.field3585;
        } else if (arg1.field3839 == var4.field7140 || arg1.field3839 == var4.field7172 || arg1.field3839 == var4.field7144 || arg1.field3839 == var4.field7182) {
            var3 = var2.field3620;
        } else if (arg1.field3839 == var4.field7164 || arg1.field3839 == var4.field7166 || arg1.field3839 == var4.field7171 || arg1.field3839 == var4.field7186) {
            var3 = var2.field3611;
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)I")
    public static final int method1488(int arg0, int arg1, int arg2) {
        field3082++;
        int var3 = class14.method143(arg0 - 1, 1376312589, arg2 - 1) + class14.method143(arg0 - 1, 1376312589, arg2 + 1) + (class14.method143(arg0 + 1, 1376312589, arg2 + -1) - -class14.method143(arg0 - -1, 1376312589, arg2 + 1));
        int var4 = class14.method143(arg0, 1376312589, arg2 - 1) + class14.method143(arg0, 1376312589, arg2 + 1) + class14.method143(arg0 - 1, 1376312589, arg2) + class14.method143(arg0 + 1, 1376312589, arg2);
        int var5 = class14.method143(arg0, 1376312589, arg2);
        if (arg1 < 73) {
            method1488(97, 34, 76);
        }
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IIIBI)V")
    public static final void method1489(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        arg1--;
        field3076++;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        if (arg3 != -30) {
            field3078 = 127;
        }
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg4;
            int var7 = var6 + 1;
            arg0[var7] = arg4;
            int var9 = var7 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg1 = var13 + 1;
            arg0[arg1] = arg4;
        }
        while (var8 > arg1) {
            arg1++;
            arg0[arg1] = arg4;
        }
    }

    @OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3077++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V")
    public static void method1490(boolean arg0) {
        if (arg0) {
            field3080 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(I)V")
    public class221(int arg0) {
        this.field3081 = arg0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1491(int arg0, int arg1, byte arg2) {
        field3083++;
        if (arg2 <= 114) {
            method1487(104, null);
        }
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1492(int arg0, byte[] arg1) {
        field3085++;
        class164 var2 = new class164(arg1);
        int var3 = var2.method1087(false);
        int var4 = -45 / ((arg0 + 40) / 45);
        int var5 = var2.method1099(60);
        if (var5 < 0 || !(class135.field1805 == 0 || var5 <= class135.field1805)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var8 = new byte[var5];
            var2.method1109(var8, (byte) 23, 0, var5);
            return var8;
        } else {
            int var6 = var2.method1099(-128);
            if (var6 < 0 || class135.field1805 != 0 && var6 > class135.field1805) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class495.method2958(var7, var6, arg1, var5, 9);
            } else {
                class133.field1790.method2438(var2, true, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BD)V")
    public static final void method1493(byte arg0, double arg1) {
        field3079++;
        if (class372.field5668 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class187.field2510[var3] = var4 <= 255 ? var4 : 255;
            }
            class372.field5668 = arg1;
        }
        int var5 = 32 % ((-arg0 - 47) / 56);
    }
}
