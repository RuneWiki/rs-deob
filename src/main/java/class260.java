import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class260 extends class270 {

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    private int field4375 = 0;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field4373 = 4096;

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "[I")
    public static int[] field4372 = new int[25];

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field4377 = 0;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lmh;")
    public static class62 field4374 = class201.method1405(true, " (X");

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lhi;")
    public static class26 field4370;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "[Lmh;")
    public static class62[] field4378;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lmi;II)V", line = 7)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field4379++;
        int var4 = 124 % ((-arg2 - 8) / 53);
        if (arg1 == 0) {
            this.field4375 = arg0.method721(84);
        } else if (arg1 == 1) {
            this.field4373 = arg0.method721(45);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            field4370 = (class26) null;
        }
        field4371++;
        int[] var3 = this.field4573.method919(arg1, 26072);
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, arg0 ^ 0x4905, arg1);
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field4375 <= var6 && this.field4373 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 125)
    public class260() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 113)
    public static void method1804(int arg0) {
        if (arg0 == 6703) {
            field4378 = null;
            field4374 = null;
            field4372 = null;
            field4370 = null;
        }
    }
}
