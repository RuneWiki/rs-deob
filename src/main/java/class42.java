import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class42 extends class273 {

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Ljava/lang/String;")
    public static String field780 = "scroll:";

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "[I")
    public static int[] field775;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "[S")
    public static short[] field779;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZBLkj;)V")
    public static final void method370(boolean arg0, byte arg1, class114 arg2) {
        int var3 = ~arg2.field1915 != -1 ? arg2.field1915 : arg2.field1790;
        ++field778;
        int var4 = arg2.field1807 == 0 ? arg2.field1919 : arg2.field1807;
        class36.method308(var3, var4, 0, arg0, arg2.field1789, class128.field2119[arg2.field1789 >> 16]);
        if (arg2.field1820 != null) {
            class36.method308(var3, var4, 0, arg0, arg2.field1789, arg2.field1820);
        }
        class167 var5 = (class167) class91.field1434.method1063((byte) -29, (long) arg2.field1789);
        if (var5 != null) {
            class45.method395(var3, true, var5.field2756, var4, arg0);
        }
        if (arg1 > -51) {
            method371(true);
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
    public static void method371(boolean arg0) {
        field780 = null;
        field775 = null;
        field779 = null;
        if (!arg0) {
            field776 = 70;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBI)I")
    private final int method372(int arg0, byte arg1, int arg2) {
        ++field777;
        int var4 = arg2 * 57 + arg0;
        int var5 = -93 / ((arg1 - 13) / 51);
        int var6 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field774;
        if (arg0) {
            field776 = -77;
        }
        int[] var3 = super.field4359.method387((byte) 126, arg1);
        if (super.field4359.field833) {
            int var4 = class255.field4068[arg1];
            for (int var5 = 0; class26.field458 > var5; ++var5) {
                var3[var5] = this.method372(class265.field4234[var5], (byte) 85, var4) % 4096;
            }
        }
        return var3;
    }
}
