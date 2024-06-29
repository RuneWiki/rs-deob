import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class387 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Lbg;")
    public static class310 field5610 = new class310(9, 7);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lgf;B)Z")
    public static final boolean method2304(class173 arg0, byte arg1) {
        if (arg1 != 125) {
            method2306(-8, -103L);
        }
        field5609++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field2663) {
            return false;
        } else if (!arg0.method1082(class492.field7466, 18358)) {
            return false;
        } else if (class74.field1321.method2409(false, (long) arg0.field2703) == null) {
            return class265.field4019.method2409(false, (long) arg0.field2684) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method2305(byte arg0) {
        field5610 = null;
        if (arg0 != -76) {
            method2304(null, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IJ)V")
    public static final void method2306(int arg0, long arg1) {
        field5611++;
        int var3 = class158.field2488;
        int var4 = class493.field7515;
        if (class394.field5754 != var3) {
            int var5 = var3 - class394.field5754;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class394.field5754 += var6;
        }
        if (arg0 != 0) {
            field5610 = null;
        }
        if (!class463.field7116.field2961) {
            class23.field289 += (float) arg1 * class407.field5917 / 40.0F * 8.0F;
            class376.field5483 += (float) arg1 * class219.field3373 / 40.0F * 8.0F;
        }
        if (class10.field132 != var4) {
            int var7 = var4 - class10.field132;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class10.field132 += var8;
        }
        class56.method400(118);
    }
}
