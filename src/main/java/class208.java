import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class208 {

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field3139 = -1;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Z")
    public static boolean field3142 = false;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Lsh;")
    public static class472 field3143 = new class472(78, 10);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public int field3129;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lui;")
    public static class451 field3145;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3145 = null;
        if (arg0 != 78) {
            method1405(65);
        }
        field3143 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)I")
    public static final int method1406(int arg0, int arg1, int arg2) {
        field3133++;
        int var3 = arg0 + (arg1 * 57);
        int var4 = var3 ^ var3 << 13;
        if (arg2 > -34) {
            field3142 = false;
        }
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZC)Z")
    public static final boolean method1407(boolean arg0, char arg1) {
        field3137++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }
}
