import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class147 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[I")
    public static int[] field2016 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "[I")
    public static int[] field2018 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field2015 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "Z")
    public static boolean field2020;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2018 = null;
        field2015 = null;
        if (arg0 <= -57) {
            field2016 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)V")
    public static final void method922(boolean arg0) {
        field2014++;
        if (!field2020) {
            return;
        }
        field2020 = false;
        class179.field2711 = null;
        class207.field3083 = null;
        if (!arg0) {
            field2020 = false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lnh;B)V")
    public static final void method923(class305 arg0, byte arg1) {
        field2019++;
        if (arg1 > -107) {
            field2020 = true;
        }
        class51.field723 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method924(int arg0, boolean arg1) {
        field2017++;
        if (!arg1) {
            return true;
        } else if (arg0 < 0) {
            return false;
        } else {
            int var2 = class151.field2101[arg0];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1009;
        }
    }
}
