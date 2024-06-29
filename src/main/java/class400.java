import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class400 extends class626 implements class180 {

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "Lnb;")
    private class271 field5340;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "I")
    public static int field5342;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "[Lxa;")
    public static class458[] field5343;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V", line = 5)
    public static void method2187(int arg0) {
        int var1 = -18 % ((arg0 - 29) / 34);
        field5343 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Z", line = 14)
    public final boolean method170(int arg0) {
        if (arg0 != 9406) {
            this.field5340 = null;
        }
        field5342++;
        return super.method170(9406);
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lnfa;Lnb;Z)V", line = 26)
    public class400(class621 arg0, class271 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field5340 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V", line = 43)
    public final void method166(byte arg0) {
        int var2 = 118 / ((arg0 - 3) / 39);
        field5341++;
        super.method166((byte) 126);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)I", line = 53)
    public final int method737(byte arg0) {
        int var2 = -56 % ((arg0 + 24) / 50);
        field5339++;
        return super.method737((byte) -84);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V", line = 69)
    public final void method1024(int arg0, int arg1) {
        super.method1024(113, this.field5340.field3426 * arg1);
        field5347++;
        int var3 = 70 / ((arg0 - 63) / 40);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 81)
    public final Buffer method167(int arg0, boolean arg1) {
        field5344++;
        if (arg0 != 18829) {
            field5343 = null;
        }
        return super.method167(18829, arg1);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZIIBI)V", line = 95)
    public static final void method2188(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (arg4 > -126) {
            method2187(116);
        }
        field5346++;
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class7.field59 - class508.field7313) * var6 / 100 + class508.field7313;
        if (class300.field3930 > var7) {
            var7 = class300.field3930;
        } else if (var7 > class46.field508) {
            var7 = class46.field508;
        }
        int var8 = var7 * 512 * arg0 / (arg3 * 334);
        if (var8 < class548.field7836) {
            short var12 = class548.field7836;
            var7 = arg3 * var12 * 334 / (arg0 * 512);
            if (class46.field508 < var7) {
                var7 = class46.field508;
                int var13 = arg0 * 512 * var7 / (var12 * 334);
                int var14 = (arg3 - var13) / 2;
                if (arg1) {
                    class453.field6284.method378();
                    class453.field6284.method3552(arg0, var14, 7, -16777216, arg2, arg5);
                    class453.field6284.method3552(arg0, var14, 7, -16777216, arg2, arg3 + arg5 - var14);
                }
                arg5 += var14;
                arg3 -= var14 * 2;
            }
        } else if (var8 > class662.field9413) {
            short var9 = class662.field9413;
            var7 = arg3 * var9 * 334 / (arg0 * 512);
            if (class300.field3930 > var7) {
                var7 = class300.field3930;
                int var10 = arg3 * var9 * 334 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg1) {
                    class453.field6284.method378();
                    class453.field6284.method3552(var11, arg3, 7, -16777216, arg2, arg5);
                    class453.field6284.method3552(var11, arg3, 7, -16777216, arg2 - (var11 - arg0), arg5);
                }
                arg0 -= var11 * 2;
                arg2 += var11;
            }
        }
        class549.field7839 = (short) arg3;
        class613.field8657 = arg2;
        class304.field3978 = arg0 * var7 / 334;
        class285.field3658 = arg5;
        class435.field5887 = (short) arg0;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)Lnb;", line = 189)
    public final class271 method1023(int arg0) {
        int var2 = 24 % ((47 - arg0) / 57);
        field5345++;
        return this.field5340;
    }
}
