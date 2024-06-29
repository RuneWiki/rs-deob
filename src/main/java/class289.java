import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class289 extends class748 {

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field3794 = 0;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lmha;")
    public static class701 field3791 = new class701(13, 0, 1, 0);

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BB)V", line = 7)
    public static final void method1708(byte[] arg0, byte arg1) {
        ++field3795;
        if (arg1 < 107) {
            method1708((byte[]) null, (byte) 31);
        }
        class26 var2 = new class26(arg0);
        while (true) {
            int var3 = var2.method194((byte) 119);
            if (var3 == 0) {
                return;
            }
            if (~var3 == -3) {
                class504.field7045 = var2.method193(2);
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V", line = 34)
    public static final void method1709(int arg0) {
        ++field3792;
        class33.field488 = -1;
        class93.field1268 = 1;
        long var1 = 0L;
        if (class617.field8784 == null) {
            class22.method125(1, 35);
        } else {
            class26 var3 = new class26(class724.method4058(class438.method2626(arg0 ^ -58, class617.field8784), 1));
            long var4 = var3.method153(-87);
            class202.field2915 = var3.method153(42);
            class308.method1810(true, class423.method2579(var4, true), "", arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 63)
    public class289() {
        super(1, true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)[I", line = 66)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            field3791 = null;
        }
        ++field3793;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[][] var4 = this.method4159(0, arg1 + -255, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class424.field5889 > var8; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 104)
    public static void method1710(boolean arg0) {
        if (arg0) {
            method1710(true);
        }
        field3791 = null;
    }
}
