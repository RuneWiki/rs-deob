import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class255 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
    public static int[] field3698 = new int[16384];

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "[I")
    public static int[] field3695 = new int[16384];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static void method1734(int arg0) {
        field3698 = null;
        field3695 = null;
        if (arg0 != 16384) {
            field3698 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
    public static final void method1735(int arg0) {
        if (arg0 <= 88) {
            field3695 = null;
        }
        field3697++;
        if (class594.field8134 != null) {
            class99.field1732 = new class253();
            class99.field1732.method1709(class594.field8134, class594.field8134.field2024.method2936(class607.field8336, 544), class594.field8134.field2037, class361.field5194, false);
            class77.field1391 = new Thread(class99.field1732, "");
            class77.field1391.start();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BIII)V")
    public static final void method1736(byte arg0, int arg1, int arg2, int arg3) {
        field3696++;
        class594 var4 = class692.method3869(arg3, (byte) 105, 9);
        var4.method3378(arg0 - 25427);
        var4.field8126 = arg2;
        var4.field8125 = arg1;
        if (arg0 != -63) {
            field3698 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3694++;
        throw new IllegalStateException();
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3698[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3695[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }
}
