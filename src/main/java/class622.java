import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class622 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "Lem;")
    public static class206 field8635 = new class206(99, 10);

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "[I")
    public static int[] field8639 = new int[5];

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Llh;")
    public static class487 field8637 = new class487(26, 3);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Lem;")
    public static class206 field8640 = new class206(45, -1);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field8632;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field8633;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field8634;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)Z", line = 9)
    public static final boolean method3455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8633++;
        if (!class539.field7280) {
            return false;
        } else if (class676.field9648 < 100) {
            return false;
        } else if (arg2 != arg5 || arg3 != arg4) {
            for (int var9 = arg2; var9 <= arg5; var9++) {
                for (int var12 = arg3; var12 <= arg4; var12++) {
                    if (class91.field1307[arg1][var9][var12] == -class207.field2908) {
                        return false;
                    }
                }
            }
            int var10 = (arg2 << class588.field8259) + 1;
            int var11 = (arg3 << class588.field8259) + 2;
            if (class566.method3242((arg5 + 1 - arg2) * class631.field8750, (byte) -53, class409.field5812[arg1].method332(arg3, arg6, arg2), var10, (arg4 + 1 - arg3) * class631.field8750, arg0, var11)) {
                class77.field1010++;
                return true;
            } else {
                return false;
            }
        } else if (class469.method2648((byte) -109, arg3, arg1, arg2)) {
            int var7 = arg2 << class588.field8259;
            int var8 = arg3 << class588.field8259;
            if (class566.method3242(class631.field8750, (byte) -52, class409.field5812[arg1].method332(arg3, arg6, arg2), var7, class631.field8750, arg0, var8)) {
                class77.field1010++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 74)
    public static void method3456(int arg0) {
        if (arg0 == 99) {
            field8637 = null;
            field8639 = null;
            field8640 = null;
            field8635 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)I", line = 95)
    public static final int method3457(boolean arg0, int arg1) {
        field8632++;
        double var2 = (double) ((arg1 & 0xFFE153) >> 16) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF20) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (arg0) {
            method3458((byte) -122);
        }
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var22 >> 1) + (((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 199)
    public static final void method3458(byte arg0) {
        field8634++;
        class256.method1575();
        int var1 = -29 % ((arg0 + 62) / 61);
        for (int var2 = 0; var2 < 4; var2++) {
            class151.field2218[var2].method2183(1);
        }
        class273.method1694((byte) 110);
        class63.method526(false);
        System.gc();
        class334.field4506.method89();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V", line = 220)
    public static final void method3459(int arg0, int arg1, int arg2) {
        field8638++;
        class51 var3 = class703.method3938(-1989279584, arg0, arg2);
        var3.method402((byte) 59);
        var3.field603 = arg1;
    }
}
