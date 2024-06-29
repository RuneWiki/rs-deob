import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class632 {

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public int field8878;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "[I")
    public int[] field8880;

    @OriginalMember(owner = "client!raa", name = "h", descriptor = "[I")
    public int[] field8883;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
    public static int field8877 = 0;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!raa", name = "f", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!raa", name = "g", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BF)F")
    public static final float method3619(byte arg0, float arg1) {
        field8881++;
        int var2 = -26 % ((-arg0 - 80) / 36);
        return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
    public static final boolean method3620(int arg0, int arg1, int arg2) {
        field8882++;
        if (arg1 != 0) {
            method3621(false, 124, 118);
        }
        return (arg0 & 0x40000) != 0 | class306.method1985((byte) 117, arg0, arg2) || class346.method2194(arg2, arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
    public class632(int arg0) {
        this.field8878 = arg0;
        this.field8880 = new int[this.field8878];
        this.field8883 = new int[this.field8878];
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZII)I")
    public static final int method3621(boolean arg0, int arg1, int arg2) {
        field8879++;
        if (arg0) {
            return 0;
        }
        class787 var3 = class447.method2666(arg1, arg2 ^ Integer.MIN_VALUE, arg0);
        if (var3 == null) {
            return class648.field9065.method1975((byte) 6, arg1).field4516;
        }
        int var4 = arg2;
        for (int var5 = 0; var5 < var3.field10809.length; var5++) {
            if (var3.field10809[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class648.field9065.method1975((byte) 6, arg1).field4516 - var3.field10809.length);
    }
}
