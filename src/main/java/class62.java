import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class62 extends class184 {

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    private int field809 = 1365;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    private int field807 = 0;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    private int field814 = 0;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    private int field816 = 20;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "[I")
    public static int[] field811 = new int[2048];

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[Lmv;")
    public static class254[] field808 = new class254[0];

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "[I")
    public static int[] field815 = new int[14];

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static void method569(int arg0) {
        field808 = null;
        field815 = null;
        if (arg0 < -117) {
            field811 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field813;
        if (arg1 != 578) {
            field815 = null;
        }
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            for (int var4 = 0; ~var4 > ~class245.field3167; ++var4) {
                int var5 = (class347.field4461[var4] << 12) / this.field809 + this.field814;
                int var6 = (class334.field4218[arg0] << 12) / this.field809 + this.field807;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; ~(var11 + var12) > -16385 && var13 < this.field816; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 - -var8;
                    var9 = -var12 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field816 + -1 > var13 ? (var13 << 12) / this.field816 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field817;
        int var4 = -62 / ((arg0 - -13) / 51);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 == -4) {
                        this.field807 = arg2.method2758((byte) 118);
                    }
                } else {
                    this.field814 = arg2.method2758((byte) 76);
                }
            } else {
                this.field816 = arg2.method2758((byte) 98);
            }
        } else {
            this.field809 = arg2.method2758((byte) 112);
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class62() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BZ)V")
    public static final void method570(byte arg0, boolean arg1) {
        ++field812;
        class534.field7851 = 0;
        class284.field3612 = 0;
        class85.method684(-106);
        int var2 = 10 % ((17 - arg0) / 44);
        class203.method1276(arg1, 123);
        class250.method1517(115);
        for (int var3 = 0; ~var3 > ~class534.field7851; ++var3) {
            int var5 = class426.field6044[var3];
            if (class163.field2065 != class187.field2446[var5].field4848) {
                if (class187.field2446[var5].field3773.method2908(true)) {
                    class492.method2988(class187.field2446[var5], 0);
                }
                class187.field2446[var5].method1731(-16385, (class477) null);
                class187.field2446[var5] = null;
            }
        }
        if (class312.field3986 != class513.field7443.field6631) {
            throw new RuntimeException("gnp1 pos:" + class513.field7443.field6631 + " psize:" + class312.field3986);
        } else {
            for (int var4 = 0; ~class489.field7114 < ~var4; ++var4) {
                if (class187.field2446[class403.field5735[var4]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class489.field7114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static final void method571(int arg0) {
        class280.method1663(false, 1475);
        if (arg0 == 2811) {
            ++field810;
            if (class386.field5067 >= 0 && ~class386.field5067 != -1) {
                class53.method525(114, class386.field5067);
                class386.field5067 = -1;
            }
        }
    }
}
