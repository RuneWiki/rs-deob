import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class452 extends class431 {

    @OriginalMember(owner = "client!lh", name = "gb", descriptor = "Lhc;")
    public static class368 field6499 = new class368("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!lh", name = "eb", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!lh", name = "fb", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!lh", name = "hb", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!lh", name = "ib", descriptor = "Lij;")
    public static class316 field6501;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lvg;B)Lvg;")
    public static final class108 method2820(class108 arg0, byte arg1) {
        ++field6500;
        if (~arg0.field1540 != 0) {
            return class157.method1139(arg0.field1540, false);
        } else {
            if (arg1 >= -45) {
                method2822(-107);
            }
            int var2 = arg0.field1631 >>> 16;
            class15 var3 = new class15(class171.field2415);
            for (class435 var4 = (class435) var3.method89((byte) 119); var4 != null; var4 = (class435) var3.method93(false)) {
                if (~var4.field6146 == ~var2) {
                    return class157.method1139((int) var4.field4226, false);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(II)Lgd;")
    public static final class111 method2821(int arg0, int arg1) {
        ++field6497;
        class408 var2 = class155.field2210;
        class111 var3;
        synchronized (class155.field2210) {
            var3 = (class111) class155.field2210.method2529(arg0 + -3, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class344.field4657.method1926(arg0 + -3, arg1, arg0);
            class111 var5 = new class111();
            if (var4 != null) {
                var5.method855(new class366(var4), -73);
            }
            class408 var6 = class155.field2210;
            synchronized (class155.field2210) {
                class155.field2210.method2527(-89, (long) arg1, var5);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field6498;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228 && this.method2660(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field6046 * super.field6046;
            for (int var8 = 0; ~class303.field4135 < ~var8; ++var8) {
                int var9 = super.field6037[var8 % super.field6033 + var7];
                var6[var8] = class187.method1301(255, var9) << 4;
                var5[var8] = class187.method1301(var9, 65280) >> 4;
                var4[var8] = class187.method1301(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "(I)V")
    public static void method2822(int arg0) {
        if (arg0 == 1324667844) {
            field6501 = null;
            field6499 = null;
        }
    }
}
