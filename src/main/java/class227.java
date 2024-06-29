import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class227 extends class253 {

    @OriginalMember(owner = "client!md", name = "ib", descriptor = "Lta;")
    public static class262 field3460 = null;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!md", name = "hb", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!md", name = "lb", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!md", name = "jb", descriptor = "Lhc;")
    public static class235 field3461;

    @OriginalMember(owner = "client!md", name = "kb", descriptor = "Lph;")
    public static class80 field3462;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V")
    public static final void method1507(int arg0, int arg1) {
        ++field3459;
        class275 var2 = class62.field1062;
        synchronized (class62.field1062) {
            if (arg1 != 612510212) {
                method1508(57);
            }
            class189.field2925 = arg0;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public static void method1508(int arg0) {
        field3462 = null;
        if (arg0 != 2) {
            method1508(-7);
        }
        field3461 = null;
        field3460 = null;
    }

    @OriginalMember(owner = "client!md", name = "j", descriptor = "(B)V")
    public static final void method1509(byte arg0) {
        if (arg0 != 90) {
            field3460 = null;
        }
        class75.field1251.method1898((byte) 59);
        ++field3458;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        ++field3463;
        if (!arg1) {
            field3461 = null;
        }
        int[][] var3 = super.field2476.method839(false, arg0);
        if (super.field2476.field1950 && this.method1729(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4060 * super.field4060;
            for (int var8 = 0; var8 < class240.field3896; ++var8) {
                int var9 = super.field4059[var8 % super.field4049 + var7];
                var6[var8] = class55.method420(4080, var9 << 4);
                var4[var8] = class55.method420(4080, var9 >> 4);
                var5[var8] = class55.method420(4080, var9 >> 12);
            }
        }
        return var3;
    }
}
