import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class297 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "Lo;")
    public static class332 field4448 = new class332("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "Lsh;")
    public static class472 field4449 = new class472(49, -2);

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "[I")
    public static int[] field4452 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "Lnk;")
    public static class286 field4454;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static final void method1859(byte arg0) {
        field4446++;
        int var1 = class299.field4466;
        int[] var2 = class161.field2218;
        for (int var3 = 0; var3 < var1; var3++) {
            class257 var7 = class40.field565[var2[var3]];
            if (var7 != null && var7.field4605 > 0) {
                var7.field4605--;
                if (var7.field4605 == 0) {
                    var7.field4641 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class256.field3797; var4++) {
            int var5 = class236.field3441[var4];
            class349 var6 = class18.field241[var5];
            if (var6 != null && var6.field4605 > 0) {
                var6.field4605--;
                if (var6.field4605 == 0) {
                    var6.field4641 = null;
                }
            }
        }
        if (arg0 != 121) {
            method1859((byte) -122);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method1860(int arg0) {
        field4448 = null;
        if (arg0 != -1) {
            method1860(-121);
        }
        field4449 = null;
        field4452 = null;
        field4454 = null;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public static final void method1861(int arg0) {
        class367.field5546.method2299((byte) -38);
        field4447++;
        class431.field6125.method1071(27536);
        class361.field5466.method1071(27536);
        if (arg0 != 0) {
            method1860(78);
        }
    }
}
