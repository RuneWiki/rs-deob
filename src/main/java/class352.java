import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class352 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lnj;")
    private class162 field5168 = new class162(256);

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Lga;")
    private class277 field5175;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lef;")
    private class338 field5169;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public static int[] field5166 = new int[5];

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field5170 = 0;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Lmg;")
    public static class101 field5173;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 4)
    public final void method2111(int arg0) {
        this.field5168.method1068(0);
        field5171++;
        if (arg0 >= -99) {
            method2114((byte) -127);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Lml;", line = 20)
    public final class264 method2112(int arg0, int arg1) {
        field5172++;
        Object var3 = this.field5168.method1073((long) arg1, false);
        if (var3 != null) {
            return (class264) var3;
        } else if (this.field5175.method1652(arg1, arg0 + 33017)) {
            class166 var4 = this.field5175.method1654(125, arg1);
            int var5 = var4.field2480 ? 64 : this.field5169.field4730;
            class264 var7;
            if (var4.field2489 && this.field5169.method261()) {
                float[] var6 = this.field5175.method1653(0.7F, var5, 71, false, arg1, var5);
                var7 = new class264(this.field5169, 3553, 34842, var5, var5, var4.field2496 != 0, var6, 6408);
            } else {
                int[] var8;
                short var9;
                if (var4.field2494 && class74.method596(var4.field2492, -1)) {
                    var8 = this.field5175.method1650(var5, arg1, true, 0.7F, false, var5);
                    var9 = 6407;
                } else {
                    var9 = 6408;
                    var8 = this.field5175.method1651(var5, (byte) -87, arg1, false, 0.7F, var5);
                }
                var7 = new class264(this.field5169, 3553, var9, var5, var5, var4.field2496 != 0, var8, false);
            }
            var7.method1579(-6746, var4.field2503, var4.field2497);
            this.field5168.method1072((long) arg1, var7, false);
            return arg0 == -3594 ? var7 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V", line = 78)
    public final void method2113(int arg0) {
        field5174++;
        this.field5168.method1065((byte) -95, 5);
        if (arg0 != 6408) {
            field5166 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V", line = 90)
    public static void method2114(byte arg0) {
        field5166 = null;
        if (arg0 > -36) {
            field5167 = 80;
        }
        field5173 = null;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lef;Lga;)V", line = 107)
    public class352(class338 arg0, class277 arg1) {
        this.field5175 = arg1;
        this.field5169 = arg0;
    }
}
