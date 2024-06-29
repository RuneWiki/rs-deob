import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class195 extends class53 {

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field3286 = 4096;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lwa;")
    public static class75 field3276 = class66.method560("<br>", false);

    @OriginalMember(owner = "client!o", name = "R", descriptor = "Z")
    public static boolean field3281 = false;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    public static int field3283 = -1;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!o", name = "X", descriptor = "[I")
    public static int[] field3287 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "Loh;")
    public static class15 field3289;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lkf;")
    public static class211 field3277;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "[Lwa;")
    public static class75[] field3284;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V", line = 4)
    public static void method1458(int arg0) {
        field3284 = null;
        field3289 = null;
        if (arg0 != 4646) {
            field3287 = (int[]) null;
        }
        field3277 = null;
        field3287 = null;
        field3276 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILja;Z)V", line = 20)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field3285++;
        if (arg0 == 0) {
            this.field3286 = arg1.method485((byte) -2);
        }
        if (!arg2) {
            field3284 = (class75[]) null;
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(II)Lwa;", line = 36)
    public static final class75 method1459(int arg0, int arg1) {
        if (arg0 != 0) {
            method1458(-87);
        }
        field3280++;
        if (arg1 >= 100000) {
            return arg1 >= 10000000 ? class66.method562((byte) 121, new class75[] { class185.field3067, class67.method565(95, arg1 / 1000000), class166.field2805, class210.field3587 }) : class66.method562((byte) -114, new class75[] { class152.field2618, class67.method565(arg0 ^ 0x4C, arg1 / 1000), class8.field113, class210.field3587 });
        } else {
            return class66.method562((byte) 117, new class75[] { class163.field2770, class67.method565(43, arg1), class210.field3587 });
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lma;Lma;I)V", line = 60)
    public static final void method1460(class271 arg0, class271 arg1, int arg2) {
        field3278++;
        if (arg1.field4689 != null) {
            arg1.method1937(arg2 ^ 0xE65D001F);
        }
        arg1.field4683 = arg0.field4683;
        arg1.field4689 = arg0;
        arg1.field4689.field4683 = arg1;
        if (arg2 != -430112692) {
            method1459(34, -13);
        }
        arg1.field4683.field4689 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 93)
    public class195() {
        super(1, true);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[I", line = 107)
    public final int[] method59(int arg0, int arg1) {
        int[] var3 = this.field878.method1603(arg1, (byte) 123);
        if (arg0 != -15196) {
            field3276 = (class75) null;
        }
        field3288++;
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, class3.field31 & arg1 - 1);
            int[] var5 = this.method391(0, arg0 + 15196, arg1);
            int[] var6 = this.method391(0, arg0 ^ 0xFFFFC4A4, class3.field31 & arg1 + 1);
            for (int var7 = 0; var7 < class269.field4644; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3286;
                int var9 = (var5[class157.field2697 & var7 + 1] - var5[class157.field2697 & var7 - 1]) * this.field3286;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
