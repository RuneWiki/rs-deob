import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class662 extends class573 {

    @OriginalMember(owner = "client!mga", name = "K", descriptor = "Ljv;")
    public static class71 field9533 = new class71();

    @OriginalMember(owner = "client!mga", name = "M", descriptor = "[I")
    public static int[] field9535 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!mga", name = "N", descriptor = "I")
    public static int field9536 = 0;

    @OriginalMember(owner = "client!mga", name = "I", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!mga", name = "J", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!mga", name = "L", descriptor = "Lom;")
    public static class344 field9534;

    @OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
    public class662() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(JJ)J")
    public static long method3767(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        if (arg1 != 1) {
            method3768((byte) -127);
        }
        field9531++;
        return class51.field1194;
    }

    @OriginalMember(owner = "client!mga", name = "c", descriptor = "(B)V")
    public static void method3768(byte arg0) {
        int var1 = -106 / ((arg0 - 37) / 39);
        field9533 = null;
        field9534 = null;
        field9535 = null;
    }

    @OriginalMember(owner = "client!mga", name = "d", descriptor = "(B)Z")
    public static final boolean method3769(byte arg0) {
        field9532++;
        class425 var1 = class126.field2292.field2700.field6139;
        if (var1 == null || class126.field2292.field2700 == var1) {
            return false;
        }
        if (arg0 < 69) {
            field9536 = -25;
        }
        class300 var2 = (class300) var1;
        if (var2.field4465 >= 2000) {
            var2.field4465 -= 2000;
        }
        return var2.field4465 == 1006;
    }
}
