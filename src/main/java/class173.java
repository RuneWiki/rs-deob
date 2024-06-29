import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class173 extends class148 {

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "Lri;")
    public static class73 field2555 = new class73(69, 12);

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    private int field2548;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "I")
    private int field2551;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "Lic;")
    public static class491 field2556;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILdh;I)V", line = 4)
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 126 % ((-88 - arg2) / 33);
        if (~arg0 == -1) {
            this.method1188(53, arg1.method1458((byte) -10));
        }
        ++field2549;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 32)
    public class173() {
        this(0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V", line = 35)
    public static void method1186(boolean arg0) {
        field2555 = null;
        if (!arg0) {
            method1186(false);
        }
        field2556 = null;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(I)V", line = 46)
    private class173(int arg0) {
        super(0, false);
        this.method1188(-123, arg0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLwp;)V", line = 58)
    public static final void method1187(byte arg0, class118 arg1) {
        ++field2553;
        if (arg0 != -58) {
            method1186(true);
        }
        if (!class207.field2963) {
            arg1.method2049(arg0 ^ 8);
            --class450.field6706;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)[[I", line = 74)
    public final int[][] method27(boolean arg0, int arg1) {
        ++field2552;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (!arg0) {
            this.field2550 = -117;
        }
        if (super.field2189.field6033) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class320.field4579; ++var7) {
                var4[var7] = this.field2550;
                var5[var7] = this.field2551;
                var6[var7] = this.field2548;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V", line = 113)
    private final void method1188(int arg0, int arg1) {
        this.field2550 = (arg1 & 16711680) >> 12;
        this.field2548 = (255 & arg1) << 4;
        ++field2554;
        int var3 = -4 / ((-81 - arg0) / 40);
        this.field2551 = arg1 >> 4 & 4080;
    }
}
