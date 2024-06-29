import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class519 extends class17 {

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "Leh;")
    public static class246 field7645 = new class246(54, 17);

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "[I")
    public static int[] field7648 = new int[14];

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "Lle;")
    public static class205 field7646 = new class205("runescape", 0);

    @OriginalMember(owner = "client!cp", name = "F", descriptor = "I")
    public static int field7640;

    @OriginalMember(owner = "client!cp", name = "G", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!cp", name = "H", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!cp", name = "I", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IB)[[I", line = 3)
    public final int[][] method89(int arg0, byte arg1) {
        ++field7641;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (arg1 != -25) {
            field7648 = null;
        }
        if (super.field201.field4431) {
            int[][] var4 = this.method91(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class530.field7763; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 51)
    public static final void method3072(byte arg0) {
        if (arg0 != 70) {
            method3074((byte) 41);
        }
        ++field7643;
        if (class85.field1065 != null) {
            class85.field1065.method1326(0);
        }
        if (class518.field7619 != null) {
            class518.field7619.method1326(0);
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 69)
    public class519() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)[I", line = 73)
    public final int[] method27(int arg0, int arg1) {
        ++field7644;
        if (arg1 <= 53) {
            method3073(112, 104, (byte) -73);
        }
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int[] var4 = this.method88(arg0, -4526, 0);
            for (int var5 = 0; class530.field7763 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lwm;II)V", line = 109)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            field7647 = -110;
        }
        if (~arg1 == -1) {
            super.field205 = ~arg0.method2357((byte) 109) == -2;
        }
        ++field7642;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)Z", line = 122)
    public static final boolean method3073(int arg0, int arg1, byte arg2) {
        int var3 = -29 / ((56 - arg2) / 61);
        ++field7640;
        return ~(arg1 & 32768) != -1;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V", line = 133)
    public static void method3074(byte arg0) {
        field7646 = null;
        field7648 = null;
        field7645 = null;
        if (arg0 >= -14) {
            method3073(-79, 8, (byte) -112);
        }
    }
}
