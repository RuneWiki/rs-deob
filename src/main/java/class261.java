import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class261 {

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field4166 = 0;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "[I")
    public static int[] field4165 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "Luc;")
    public static class39 field4170 = new class39(16);

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)I")
    public static final int method1766(boolean arg0) {
        field4169++;
        if (arg0) {
            method1770((byte[]) null, (byte) -118);
        }
        if (class93.field1596 == null) {
            return -1;
        }
        while (class93.field1596.field3233 > class58.field956) {
            if (class93.field1596.method1395(class58.field956, 69)) {
                return class58.field956++;
            }
            class58.field956++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static void method1767(byte arg0) {
        field4170 = null;
        field4165 = null;
        int var1 = 53 % ((arg0 - 61) / 54);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIILji;IJ)Z")
    public static final boolean method1768(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class60.method454(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Lqd;")
    public static final class3 method1769(int arg0, byte arg1) {
        int var2 = 98 % ((arg1 + 4) / 43);
        class3 var3 = (class3) class171.field2676.method1887(0, (long) arg0);
        field4164++;
        if (var3 != null) {
            return var3;
        }
        class3 var4 = method1771(arg0, false, class86.field1453, -11088, class110.field1807);
        if (var4 != null) {
            class171.field2676.method1886(-94, (long) arg0, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1770(byte[] arg0, byte arg1) {
        field4168++;
        class88 var2 = new class88(arg0);
        int var3 = var2.method633(108);
        if (arg1 < 5) {
            field4165 = null;
        }
        int var4 = var2.method641(-1);
        if (var4 < 0 || !(class22.field310 == 0 || class22.field310 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method662(var7, var4, 0, (byte) 125);
            return var7;
        } else {
            int var5 = var2.method641(-1);
            if (var5 < 0 || !(class22.field310 == 0 || class22.field310 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class107.method768(var6, var5, arg0, var4, 9);
            } else {
                class27.field364.method1473(31445, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZLhc;ILhc;)Lqd;")
    private static final class3 method1771(int arg0, boolean arg1, class235 arg2, int arg3, class235 arg4) {
        int[] var5 = arg4.method1611(arg0, 0);
        if (arg3 != -11088) {
            method1770((byte[]) null, (byte) -63);
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg4.method1593(107, arg0, var5[var7]);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method1593(106, 0, var9);
                } else {
                    var10 = arg2.method1593(127, var9, 0);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        field4167++;
        if (!var6) {
            return null;
        }
        try {
            return new class3(arg4, arg2, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }
}
