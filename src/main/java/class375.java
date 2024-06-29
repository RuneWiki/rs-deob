import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class375 extends class136 {

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    private int field5549 = 4096;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "Lbg;")
    public static class324 field5554 = new class324(17, 0);

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "Z")
    public static boolean field5556 = false;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "Lbg;")
    public static class324 field5555 = new class324(15, 8);

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "[F")
    public static float[] field5557 = new float[4];

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class375() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(I)V")
    public static void method2304(int arg0) {
        if (arg0 != -969029332) {
            field5554 = null;
        }
        field5557 = null;
        field5554 = null;
        field5555 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILiv;)V")
    public final void method268(int arg0, int arg1, class65 arg2) {
        ++field5553;
        if (~arg1 == -1) {
            this.field5549 = arg2.method623((byte) -76);
        }
        if (arg0 != 4) {
            this.field5549 = 34;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
    public final int[] method82(int arg0, int arg1) {
        ++field5551;
        int[] var3 = super.field1957.method2887((byte) -112, arg1);
        int var4 = 79 % ((arg0 - 67) / 50);
        if (super.field1957.field7031) {
            int[] var5 = this.method1033(arg1 + -1 & class519.field7637, 0, 0);
            int[] var6 = this.method1033(arg1, 0, 0);
            int[] var7 = this.method1033(class519.field7637 & arg1 - -1, 0, 0);
            for (int var8 = 0; class467.field6889 > var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field5549;
                int var10 = (var6[class166.field2356 & var8 - -1] + -var6[var8 + -1 & class166.field2356]) * this.field5549;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 - -var14 + 4096) / 4096.0F)) * 4096.0D);
                int var16 = var15 != 0 ? 16777216 / var15 : 0;
                var3[var8] = 4096 - var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "(I)V")
    public static final void method2305(int arg0) {
        ++field5552;
        class307.field4351.method874(0);
        if (arg0 != -1846215604) {
            method2304(-33);
        }
        class526.field7730.method535((byte) 100);
        class334.field4636.method535((byte) -101);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Z")
    public static final boolean method2306(boolean arg0) {
        ++field5550;
        if (!arg0) {
            field5554 = null;
        }
        return class365.field5281 != class297.field4260 || ~class365.field5273 <= -3;
    }
}
