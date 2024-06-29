import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class266 extends class279 {

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    private int field4591 = 4096;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "Z")
    public static boolean field4584 = true;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field4587 = 0;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Z")
    public static boolean field4588 = false;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field4592 = -1;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "Ltl;")
    public static class59 field4595 = class85.method639("Lade Sprites )2 ", 9588);

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "[I")
    public static int[] field4586 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "Ltl;")
    public static class59 field4596 = class85.method639("<col=00ff80>", 9588);

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "I")
    public static int field4597 = 1;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIII)V", line = 4)
    public static final void method1839(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= arg3) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class163.field2662[var5][arg2] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class163.field2662[var6][arg2] = arg0;
            }
        }
        field4594++;
        if (!arg1) {
            method1840(true);
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V", line = 49)
    public static void method1840(boolean arg0) {
        field4586 = null;
        if (!arg0) {
            method1841(45);
        }
        field4595 = null;
        field4596 = null;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)V", line = 70)
    public static final void method1841(int arg0) {
        class39.field585.method1482((byte) 30);
        field4590++;
        if (arg0 != 4) {
            method1840(true);
        }
        class305.field5179.method1482((byte) 30);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 93)
    public class266() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IILs;)V", line = 103)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 < -125) {
            if (arg1 == 0) {
                this.field4591 = arg2.method1214(-18254);
            }
            field4598++;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZI)[I", line = 127)
    public final int[] method44(boolean arg0, int arg1) {
        field4589++;
        if (arg0) {
            field4586 = (int[]) null;
        }
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-124, class132.field2197 & arg1 - 1, 0);
            int[] var5 = this.method1960(-125, arg1, 0);
            int[] var6 = this.method1960(-121, arg1 + 1 & class132.field2197, 0);
            for (int var7 = 0; var7 < class56.field835; var7++) {
                int var8 = (var5[var7 + 1 & class310.field5270] - var5[class310.field5270 & var7 - 1]) * this.field4591;
                int var9 = (var6[var7] - var4[var7]) * this.field4591;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }
}
