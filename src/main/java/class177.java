import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class177 extends class371 {

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "Z")
    public static boolean field2689 = false;

    @OriginalMember(owner = "client!fl", name = "P", descriptor = "Lwu;")
    public static class500 field2694 = new class500("WTWIP", 3);

    @OriginalMember(owner = "client!fl", name = "Q", descriptor = "Lqu;")
    public static class364 field2695 = new class364(74, -1);

    @OriginalMember(owner = "client!fl", name = "R", descriptor = "Z")
    public static boolean field2696 = false;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V", line = 3)
    public class177() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)Lls;", line = 8)
    public static final class418 method1184(int arg0) {
        class49.field572 = 0;
        ++field2691;
        if (arg0 != 1) {
            field2689 = false;
        }
        return class568.method3316(Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)[I", line = 25)
    public final int[] method79(byte arg0, int arg1) {
        ++field2688;
        int[] var3 = super.field5378.method1451(100, arg1);
        if (super.field5378.field3254) {
            int[][] var4 = this.method2263((byte) -46, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class41.field455; ++var8) {
                var3[var8] = (var5[var8] + var7[var8] - -var6[var8]) / 3;
            }
        }
        if (arg0 > -80) {
            field2693 = 25;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "(I)V", line = 74)
    public static void method1185(int arg0) {
        field2695 = null;
        if (arg0 <= 2) {
            method1184(94);
        }
        field2694 = null;
    }
}
