import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class214 extends class436 {

    @OriginalMember(owner = "client!es", name = "J", descriptor = "I")
    public static int field2848 = 0;

    @OriginalMember(owner = "client!es", name = "M", descriptor = "[I")
    public static int[] field2851 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!es", name = "Q", descriptor = "[S")
    public static short[] field2855 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!es", name = "G", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!es", name = "I", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!es", name = "K", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!es", name = "L", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!es", name = "N", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!es", name = "O", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!es", name = "P", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "Lb;")
    public static class183 field2846;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "(I)V", line = 5)
    public static final void method1373(int arg0) {
        class395.field5779 = arg0;
        class143.field2072 = arg0;
        class105.field1580 = arg0;
        class357.field5033 = arg0;
        ++field2852;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method14(int arg0, int arg1) {
        ++field2853;
        int[] var3 = super.field6258.method2688((byte) -113, arg0);
        if (arg1 != 18338) {
            field2855 = null;
        }
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, 0, arg0);
            for (int var5 = 0; class43.field653 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IILeb;)V", line = 61)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 == 34) {
            if (arg1 == 0) {
                super.field6256 = ~arg2.method2429(arg0 + -34) == -2;
            }
            ++field2849;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)[[I", line = 76)
    public final int[][] method85(int arg0, int arg1) {
        ++field2847;
        if (arg0 != -13348) {
            method1373(28);
        }
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (super.field6259.field3950) {
            int[][] var4 = this.method2731(arg1, false, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class43.field653 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = 4096 - var7[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V", line = 125)
    public static final void method1374(byte arg0, int arg1) {
        if (arg0 != -39) {
            field2855 = null;
        }
        ++field2850;
        class190 var2 = class412.field5982;
        synchronized (class412.field5982) {
            class412.field5982.method1254(arg1, 118);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V", line = 141)
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!es", name = "e", descriptor = "(B)V", line = 148)
    public static void method1375(byte arg0) {
        field2851 = null;
        if (arg0 == -32) {
            field2855 = null;
            field2846 = null;
        }
    }
}
