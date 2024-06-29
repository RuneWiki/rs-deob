import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class568 extends class334 {

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    private int field7898 = 4096;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "Lhl;")
    public static class353 field7901 = new class353(7, 2);

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "Z")
    public static boolean field7904 = false;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "F")
    public static float field7903;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field7905;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    public static int field7906;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "[[[Z")
    public static boolean[][][] field7902;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V", line = 100)
    public class568() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V", line = 9)
    public static void method3296(int arg0) {
        field7901 = null;
        if (arg0 != 3) {
            field7902 = null;
        }
        field7902 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[I", line = 25)
    public final int[] method28(int arg0, int arg1) {
        ++field7899;
        int[] var3 = super.field4743.method1027((byte) -79, arg0);
        if (super.field4743.field1993) {
            int[] var4 = this.method2052(0, 0, class147.field2360 & arg0 - 1);
            int[] var5 = this.method2052(0, 0, arg0);
            int[] var6 = this.method2052(0, 0, arg0 + 1 & class147.field2360);
            for (int var7 = 0; class439.field6099 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field7898;
                int var9 = (var5[class478.field6578 & var7 + 1] + -var5[class478.field6578 & var7 - 1]) * this.field7898;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (arg1 != -22563988) {
            field7904 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZLol;)V", line = 78)
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        if (~arg0 == -1) {
            this.field7898 = arg2.method2565((byte) -85);
        }
        ++field7900;
        if (arg1) {
            field7906 = -11;
        }
    }
}
