import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class262 extends class232 {

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "I")
    public static int field3870 = 16777215;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field3869 = -1;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "Lub;")
    public static class15 field3867 = new class15(64);

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "(B)V", line = 3)
    public static void method1806(byte arg0) {
        field3867 = null;
        if (arg0 != 69) {
            field3867 = null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)[[I", line = 18)
    public final int[][] method112(int arg0, int arg1) {
        ++field3868;
        int[][] var3 = super.field555.method2070(0, arg1);
        if (arg0 != 1) {
            method1806((byte) 39);
        }
        if (super.field555.field4489 && this.method1607(-99)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3423 * super.field3423;
            for (int var8 = 0; var8 < class410.field5886; ++var8) {
                int var9 = super.field3427[var8 % super.field3430 + var7];
                var6[var8] = class209.method1483(var9, 255) << 4;
                var5[var8] = class209.method1483(var9, 65280) >> 4;
                var4[var8] = class209.method1483(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)V", line = 79)
    public static final void method1807(boolean arg0) {
        for (class13 var1 = (class13) class266.field3900.method2752(-116); var1 != null; var1 = (class13) class266.field3900.method2754(-1)) {
            if (var1.field201) {
                var1.method71(true);
            }
        }
        if (!arg0) {
            method1807(false);
        }
        ++field3871;
        for (class13 var2 = (class13) class433.field6188.method2752(-106); var2 != null; var2 = (class13) class433.field6188.method2754(-1)) {
            if (var2.field201) {
                var2.method71(arg0);
            }
        }
    }
}
