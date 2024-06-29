import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class276 extends class260 {

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    private int field4826 = 4096;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "[I")
    public static int[] field4829 = new int[25];

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "Loh;")
    public static class263 field4827 = class253.method1681(-127, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field4831 = 100;

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static volatile int field4837 = 0;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "[I")
    public static int[] field4836 = new int[32];

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "Loh;")
    public static class263 field4835 = null;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)V")
    public static final void method1874(int arg0, int arg1) {
        ++field4832;
        class64 var2 = class84.method563(arg0, arg1, arg0 + -124);
        var2.method393(-77);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            method1876(-26, (byte) -96);
        }
        ++field4833;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0 + -1 & class277.field4846, 0, false);
            int[] var5 = this.method1711(arg0, 0, false);
            int[] var6 = this.method1711(class277.field4846 & arg0 - -1, 0, false);
            for (int var7 = 0; var7 < class49.field1052; ++var7) {
                int var8 = (var5[var7 + 1 & class166.field3024] + -var5[var7 + -1 & class166.field3024]) * this.field4826;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] + -var4[var7]) * this.field4826;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -4096 + var13) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static void method1875(int arg0) {
        field4829 = null;
        field4835 = null;
        if (arg0 >= -105) {
            method1876(15, (byte) -28);
        }
        field4836 = null;
        field4827 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field4834;
        if (arg0 == 0) {
            this.field4826 = arg2.method1294((byte) 3);
        }
        if (arg1 != 5701) {
            this.method17(-68, -30);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
    public static final void method1876(int arg0, byte arg1) {
        ++field4828;
        if (arg1 <= 91) {
            field4836 = null;
        }
        class64 var2 = class84.method563(7, arg0, -105);
        var2.method393(-120);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
    public class276() {
        super(1, true);
    }
}
