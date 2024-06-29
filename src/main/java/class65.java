import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class65 extends class476 {

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public int field937 = 0;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field940 = -1;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
    public static boolean field938 = false;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Z")
    public static boolean field936 = false;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lkb;")
    public static class139 field930 = new class139(2);

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field944 = -1;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "F")
    public static float field945;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[BLpu;I)V", line = 8)
    public static final void method426(byte[][] arg0, class177 arg1, int arg2) {
        field941++;
        int var3 = -86 / ((-arg2 - 6) / 45);
        int var4 = class397.field5706.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg0[var5];
            if (var6 != null) {
                int var7 = (class463.field6689[var5] >> 8) * 64 - class110.field1775;
                int var8 = (class463.field6689[var5] & 0xFF) * 64 - class399.field5727;
                class287.method1649(841283500);
                arg1.method1214(var8, (byte) -128, var6, var7, class275.field3737, class264.field3553);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIILat;)V", line = 54)
    public static final void method427(int arg0, int arg1, int arg2, class444 arg3) {
        field934++;
        class336 var4 = arg3.method2619(17042, class275.field3737);
        if (arg2 != 422) {
            field938 = true;
        }
        if (var4 == null) {
            return;
        }
        class275.field3737.method511(arg0, arg1, arg3.field6470 + arg0, arg3.field6453 + arg1);
        if (class195.field2827 < 3) {
            class151.field2330.method2145((float) arg3.field6470 / 2.0F + (float) arg0, (float) arg3.field6453 / 2.0F + (float) arg1, 4096, ((int) (-class191.field2797) & 0x3FFF) << 2, var4, arg0, arg1);
        } else {
            class275.field3737.method523(-16777216, var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 91)
    public static void method428(int arg0) {
        if (arg0 != 64) {
            method427(-80, -20, 86, null);
        }
        field930 = null;
    }
}
