import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 {

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field333;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    public static int[] field327 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Leh;")
    private static class47 field326 = class195.method1282((byte) -4, "Members only world");

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Leh;")
    public static class47 field329 = field326;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Leh;")
    public static class47 field325 = class195.method1282((byte) -4, "null");

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Leh;")
    public static class47 field332 = class195.method1282((byte) -4, "gleiten:");

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Leh;")
    public static class47 field334 = class195.method1282((byte) -4, "k");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Leb;")
    public static class41 field324;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method173(boolean arg0, Object arg1, int arg2) {
        field322++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class177.method1180(var3, (byte) -127) : var3;
        } else if (arg1 instanceof class19) {
            class19 var4 = (class19) arg1;
            return var4.method201((byte) -22);
        } else {
            if (arg2 != 67108863) {
                method174(117);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method174(int arg0) {
        field334 = null;
        field324 = null;
        field332 = null;
        field325 = null;
        field327 = null;
        field329 = null;
        if (arg0 >= -45) {
            method174(-59);
        }
        field326 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BLwa;)V")
    public static final void method175(byte arg0, class199 arg1) {
        field323++;
        long var2 = 0L;
        if (arg1.field3878 == 0) {
            var2 = class92.method743(arg1.field3889, arg1.field3885, arg1.field3873);
        }
        if (arg1.field3878 == 1) {
            var2 = class53.method471(arg1.field3889, arg1.field3885, arg1.field3873);
        }
        if (arg1.field3878 == 2) {
            var2 = class197.method1296(arg1.field3889, arg1.field3885, arg1.field3873);
        }
        if (arg1.field3878 == 3) {
            var2 = class85.method703(arg1.field3889, arg1.field3885, arg1.field3873);
        }
        int var4 = 0;
        int var5 = -1;
        if (arg0 != -74) {
            return;
        }
        int var6 = 0;
        if (var2 != 0L) {
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var4 = (int) var2 >> 14 & 0x1F;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field3883 = var5;
        arg1.field3879 = var6;
        arg1.field3874 = var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
    public static final void method176(int arg0, int arg1) {
        class152 var2 = class173.field3351[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class152 var4 = class173.field3351[var3][arg0][arg1] = class173.field3351[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2983--;
                for (int var5 = 0; var5 < var4.field2975; var5++) {
                    class60 var6 = var4.field2979[var5];
                    if ((var6.field1157 >> 29 & 0x3L) == 2L && var6.field1172 == arg0 && var6.field1170 == arg1) {
                        var6.field1155--;
                    }
                }
            }
        }
        if (class173.field3351[0][arg0][arg1] == null) {
            class173.field3351[0][arg0][arg1] = new class152(0, arg0, arg1);
        }
        class173.field3351[0][arg0][arg1].field2982 = var2;
        class173.field3351[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class16() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lbe;)V")
    public class16(class16 arg0) {
        this.field331 = arg0.field331;
        this.field328 = arg0.field328;
        this.field330 = arg0.field330;
        this.field333 = arg0.field333;
    }
}
