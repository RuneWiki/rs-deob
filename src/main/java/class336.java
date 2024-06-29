import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class336 extends class80 {

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "Los;")
    public static class309 field5068 = new class309("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(II)I", line = 3)
    public static final int method2111(int arg0, int arg1) {
        if (arg1 != -1555686937) {
            method2112(-88, false, -122, true);
        }
        ++field5073;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IILnn;)V", line = 14)
    public final void method26(int arg0, int arg1, class289 arg2) {
        int var4 = 26 % ((arg1 - 28) / 53);
        ++field5070;
        if (arg0 == 0) {
            super.field1591 = ~arg2.method1858(-3256) == -2;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZIZ)V", line = 29)
    public static final void method2112(int arg0, boolean arg1, int arg2, boolean arg3) {
        ++field5067;
        if (arg0 >= 8000 && arg0 <= 48000) {
            class200.field3254 = arg0;
            class395.field6022 = arg2;
            if (!arg1) {
                method2113(true);
            }
            class315.field4754 = arg3;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(II)[[I", line = 48)
    public final int[][] method29(int arg0, int arg1) {
        ++field5069;
        if (arg0 != 255) {
            field5071 = 39;
        }
        int[][] var3 = super.field1589.method859(arg1, 127);
        if (super.field1589.field1884) {
            int[][] var4 = this.method713(0, arg0 ^ -233, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class137.field2308; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 95)
    public class336() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(Z)V", line = 98)
    public static void method2113(boolean arg0) {
        field5068 = null;
        if (arg0) {
            method2111(-42, 25);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(II)[I", line = 113)
    public final int[] method25(int arg0, int arg1) {
        ++field5072;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0, 0, (byte) 70);
            for (int var5 = 0; ~class137.field2308 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return arg1 != -16828 ? null : var3;
    }
}
