import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class472 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lfk;")
    public class606 field6493 = new class606();

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Llh;")
    public static class487 field6494 = new class487(37, 7);

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIB)I", line = 3)
    public static final int method2661(int arg0, int arg1, int arg2, byte arg3) {
        field6496++;
        if (class606.field8432 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class510.field7003;
        int var7 = arg1 - class510.field7012;
        if (arg3 >= -45) {
            method2662((byte) 32);
        }
        for (class163 var8 = (class163) class510.field6985.method1436(28964); var8 != null; var8 = (class163) class510.field6985.method1443((byte) 6)) {
            if (var8.field2338 == arg2) {
                int var9 = var8.field2344;
                int var10 = var8.field2343;
                int var11 = class510.field7012 + var10 | class510.field7003 + var9 << 14;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 54)
    public static void method2662(byte arg0) {
        if (arg0 >= -16) {
            field6494 = null;
        }
        field6494 = null;
    }
}
