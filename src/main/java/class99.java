import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class99 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ldp;")
    public static class347 field1519 = new class347("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ldp;")
    public static class347 field1520 = new class347("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V", line = 3)
    public static void method761(boolean arg0) {
        field1520 = null;
        if (!arg0) {
            field1519 = null;
        }
        field1519 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZI)V", line = 14)
    public static final void method762(boolean arg0, int arg1) {
        class436.method2565(-84);
        field1521++;
        if (!class250.method1497(class411.field6213, 122)) {
            return;
        }
        if (arg1 != 841940584) {
            method763(118, null, null);
        }
        class163.field2427++;
        if (class163.field2427 < 50 && !arg0) {
            return;
        }
        class163.field2427 = 0;
        if (!class420.field6295 && class232.field3269 != null) {
            class97.method758(class406.field6109, false);
            class421.field6297++;
            try {
                class232.field3269.method658(14812, 0, class43.field559.field6830, class43.field559.field6868);
                class43.field559.field6830 = 0;
            } catch (IOException var2) {
                class420.field6295 = true;
            }
        }
        class436.method2565(-61);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[[BLcr;)V", line = 60)
    public static final void method763(int arg0, byte[][] arg1, class367 arg2) {
        field1517++;
        int var3 = class229.field3226.length;
        int var4 = 0;
        if (arg0 != 64) {
            return;
        }
        while (var3 > var4) {
            byte[] var5 = arg1[var4];
            if (var5 != null) {
                int var6 = (class495.field7349[var4] >> 8) * 64 - class267.field3979;
                int var7 = (class495.field7349[var4] & 0xFF) * 64 - class241.field3358;
                class436.method2565(-78);
                arg2.method2187(-121, var7, class151.field2300, var5, var6, class407.field6147);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILpf;II)V", line = 99)
    public static final void method764(int arg0, int arg1, class486 arg2, int arg3, int arg4) {
        if (arg3 != -30411) {
            method763(104, null, null);
        }
        field1516++;
        for (class203 var5 = (class203) class184.field2723.method2957(88); var5 != null; var5 = (class203) class184.field2723.method2947(arg3 + 30296)) {
            if (var5.field2952 == arg1 && arg0 << 7 == var5.field2963 && arg4 << 7 == var5.field2954 && var5.field2949.field7207 == arg2.field7207) {
                if (var5.field2959 != null) {
                    class176.field2598.method2372(var5.field2959);
                    var5.field2959 = null;
                }
                if (var5.field2951 != null) {
                    class176.field2598.method2372(var5.field2951);
                    var5.field2951 = null;
                }
                var5.method876((byte) -96);
                return;
            }
        }
    }
}
