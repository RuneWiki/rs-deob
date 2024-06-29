import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class6 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Llj;")
    public static class6 field41 = new class6(1);

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Llj;")
    public static class6 field46 = new class6(2);

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Llj;")
    public static class6 field47 = new class6(4);

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Llj;")
    public static class6 field48 = new class6(1);

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Llj;")
    public static class6 field49 = new class6(2);

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Llj;")
    public static class6 field50 = new class6(4);

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Llj;")
    public static class6 field51 = new class6(2);

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Llj;")
    public static class6 field52 = new class6(4);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lpe;")
    public static class615 field53;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V", line = 5)
    public static void method20(byte arg0) {
        field51 = null;
        field52 = null;
        field41 = null;
        if (arg0 >= -22) {
            method22(27L, -124);
        }
        field49 = null;
        field50 = null;
        field48 = null;
        field46 = null;
        field47 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lpe;I)V", line = 24)
    public static final void method21(class615 arg0, int arg1) {
        field42++;
        class61.field828 = 0;
        class112.field1473 = 0;
        class666.field9241 = new class365();
        class277.field3627 = new class209[1024];
        class679.field9367 = new class231[class590.field8008[class446.field5735] + 1];
        class580.field7906 = 0;
        class336.field4351 = 0;
        class645.method3545(arg0, -2054420766);
        if (arg1 >= -58) {
            method22(14L, -103);
        }
        class517.method2783(arg0, 29577);
    }

    @OriginalMember(owner = "client!lj", name = "toString", descriptor = "()Ljava/lang/String;", line = 47)
    public final String toString() {
        field45++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V", line = 55)
    public static final void method22(long arg0, int arg1) {
        field44++;
        int var3 = class233.field3130.field506 + class595.field8047;
        int var4 = class595.field8042 + class233.field3130.field503;
        int var5 = 3 / ((arg1 - 14) / 49);
        if ((class473.field6168 - var3) < -2000 || class473.field6168 - var3 > 2000 || class219.field2880 - var4 < -2000 || (class219.field2880 - var4) > 2000) {
            class219.field2880 = var4;
            class473.field6168 = var3;
        }
        if (class473.field6168 != var3) {
            int var6 = var3 - class473.field6168;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (var6 <= 0) {
                if (var7 == 0) {
                    var7 = -1;
                } else if (var6 > var7) {
                    var7 = var6;
                }
            } else if (var7 == 0) {
                var7 = 1;
            } else if (var7 > var6) {
                var7 = var6;
            }
            class473.field6168 += var7;
        }
        if (class219.field2880 != var4) {
            int var8 = var4 - class219.field2880;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var9 < var8) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class219.field2880 += var9;
        }
        if (!class260.field3509.field1283) {
            class141.field1859 += (float) arg0 * class507.field6661 / 6.0F;
            class710.field9918 += (float) arg0 * class66.field907 / 6.0F;
        }
        class560.method2999(16384);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(I)V", line = 147)
    private class6(int arg0) {
        this.field43 = arg0;
    }
}
