import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class311 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2057(int arg0, int arg1, int arg2) {
        field4571++;
        if (!class600.field8764) {
            return false;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class297.field4403[var3] == null || class297.field4403[var3][var4] == null) {
            return false;
        }
        class593 var5 = class297.field4403[var3][var4];
        if (arg0 == arg1 && var5.field8507 == 0) {
            for (class631 var6 = (class631) class436.field6487.method719(false); var6 != null; var6 = (class631) class436.field6487.method716(14)) {
                if (var6.field9100 == 13 || var6.field9100 == 1003 || var6.field9100 == 20 || var6.field9100 == 50 || var6.field9100 == 58) {
                    for (class593 var7 = class259.method1728(40, var6.field9096); var7 != null; var7 = class443.method2769((byte) 63, var7)) {
                        if (var5.field8579 == var7.field8579) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class631 var8 = (class631) class436.field6487.method719(false); var8 != null; var8 = (class631) class436.field6487.method716(arg1 ^ 0xFFFFFFF1)) {
                if (var8.field9103 == arg0 && var5.field8579 == var8.field9096 && (var8.field9100 == 13 || var8.field9100 == 1003 || var8.field9100 == 20 || var8.field9100 == 50 || var8.field9100 == 58)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILkea;)I", line = 71)
    public static final int method2058(int arg0, class203 arg1) {
        field4570++;
        int var2 = 0;
        if (arg1.method1311(class197.field2669, (byte) -93)) {
            var2++;
        }
        if (arg1.method1311(class331.field4767, (byte) -93)) {
            var2++;
        }
        if (arg0 != -1737) {
            field4567 = 100;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(III)V", line = 91)
    public static final void method2059(int arg0, int arg1, int arg2) {
        field4568++;
        class467 var3 = class541.method3144(arg0, (byte) -120, arg2);
        var3.method2851(true);
        var3.field6926 = arg1;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(III)V", line = 103)
    public static final void method2060(int arg0, int arg1, int arg2) {
        field4569++;
        int var3 = class281.field3921.method2554(class489.field7132.method2902(class35.field396, -20139), (byte) 0);
        for (class631 var4 = (class631) class436.field6487.method719(false); var4 != null; var4 = (class631) class436.field6487.method716(14)) {
            int var9 = class151.method891(var4, 18203);
            if (var9 > var3) {
                var3 = var9;
            }
        }
        int var5 = 32 / ((-arg0 - 41) / 47);
        var3 += 8;
        int var6 = class111.field1359 * 16 + 21;
        int var7 = arg1 - (var3 / 2);
        if (class581.field8366 < var7 + var3) {
            var7 = class581.field8366 - var3;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg2;
        if (class298.field4407 < (var6 + arg2)) {
            var8 = class298.field4407 - var6;
        }
        class291.field4026 = var7;
        if (var8 < 0) {
            var8 = 0;
        }
        class614.field8924 = var8;
        class508.field7392 = (class438.field6510 ? 26 : 22) + class111.field1359 * 16;
        class421.field6308 = var3;
        class600.field8764 = true;
    }
}
