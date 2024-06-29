import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class257 extends class300 {

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    private int field4193 = 4096;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "I")
    public static int field4190 = 0;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field4188 = 0;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4192 = "Loaded update list";

    @OriginalMember(owner = "client!r", name = "G", descriptor = "[I")
    public static int[] field4189 = new int[32];

    @OriginalMember(owner = "client!r", name = "L", descriptor = "[C")
    public static char[] field4194 = new char[128];

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            this.field4193 = -13;
        }
        int[] var3 = super.field4797.method217(arg0, true);
        ++field4191;
        if (super.field4797.field470) {
            int[] var4 = this.method2018(0, -1, arg0 - 1 & class285.field4611);
            int[] var5 = this.method2018(0, -1, arg0);
            int[] var6 = this.method2018(0, -1, arg0 + 1 & class285.field4611);
            for (int var7 = 0; ~class180.field2826 < ~var7; ++var7) {
                int var8 = (var5[var7 + 1 & class277.field4503] + -var5[var7 + -1 & class277.field4503]) * this.field4193;
                int var9 = (var6[var7] + -var4[var7]) * this.field4193;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)));
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class257() {
        super(1, true);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    public static void method1821(byte arg0) {
        field4189 = null;
        field4194 = null;
        if (arg0 > 37) {
            field4192 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Lre;")
    public static final class263 method1822(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class263 var4 = var3.field1640;
            var3.field1640 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field4193 = arg0.method1186((byte) -78);
        }
        ++field4195;
        if (arg1 > -43) {
            method1822(108, -93, -112);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V")
    public static final void method1823(int arg0, boolean arg1) {
        class68.field1023 = -1;
        class105.field1535 = -1;
        ++field4196;
        class93.field1400 = 0;
        class92.field1369 = arg0;
        class138.field1992 = null;
        class294.field4712 = 1;
        class261.field4244 = arg1;
    }
}
