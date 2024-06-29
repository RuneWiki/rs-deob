import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class123 {

    @OriginalMember(owner = "client!wf", name = "Z", descriptor = "I")
    public static int field3 = 0;

    @OriginalMember(owner = "client!wf", name = "X", descriptor = "Lv;")
    public static class147 field1 = new class147(5);

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "Leb;")
    public static class230 field11 = class68.method589(0, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "Leb;")
    public static class230 field12 = class68.method589(0, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wf", name = "Y", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!wf", name = "ab", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "Lkk;")
    public static class223 field10;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lkk;I)V")
    public static final void method1(class223 arg0, int arg1) {
        ++field7;
        if (arg1 != 1) {
            method3(45L, true);
        }
        class85.field1509 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        ++field5;
        int[][] var3 = super.field2152.method1106(arg0, -7034);
        if (arg1 != 26080) {
            method1((class223) null, -127);
        }
        if (super.field2152.field2616) {
            int[][] var4 = this.method960(0, arg0, (byte) -84);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class140.field2505 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JZ)V")
    public static final void method3(long arg0, boolean arg1) {
        ++field4;
        if (~arg0 != -1L) {
            int var3 = 0;
            if (arg1) {
                while (~var3 > ~class45.field796) {
                    if (~class145.field2607[var3] == ~arg0) {
                        --class45.field796;
                        for (int var4 = var3; ~class45.field796 < ~var4; ++var4) {
                            class145.field2607[var4] = class145.field2607[var4 + 1];
                            class146.field2627[var4] = class146.field2627[var4 + 1];
                        }
                        class67.field1265 = class54.field935;
                        ++class229.field3944;
                        class153.field2747.method978(80, 104);
                        class153.field2747.method148(arg0, (byte) 107);
                        return;
                    }
                    ++var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field6;
        int[] var3 = super.field2160.method1323((byte) 56, arg0);
        int var4 = -70 % ((-24 - arg1) / 57);
        if (super.field2160.field3243) {
            int[] var5 = this.method965(0, arg0, (byte) 63);
            for (int var6 = 0; var6 < class140.field2505; ++var6) {
                var3[var6] = -var5[var6] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class1() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
    public static void method5(int arg0) {
        if (arg0 != -17060) {
            field12 = null;
        }
        field1 = null;
        field12 = null;
        field11 = null;
        field10 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field2147 = ~arg1.method200(arg2 ^ 1876195635) == -2;
        }
        ++field2;
        if (arg2 != 1876195788) {
            this.method2(-67, -116);
        }
    }
}
