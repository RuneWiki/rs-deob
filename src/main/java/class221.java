import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class221 {

    @OriginalMember(owner = "client!al", name = "u", descriptor = "Leb;")
    public static class230 field3799 = class68.method589(0, "Fallen lassen");

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
    public static int[] field3785 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public int field3780;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public int field3781;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field3784;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public int field3787;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field3789;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public int field3790;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field3791;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public int field3792;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field3793;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public int field3794;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field3795;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public int field3796;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public int field3800;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Z")
    public static final boolean method1509(int arg0, byte arg1) {
        field3786++;
        if (arg1 != -111) {
            return true;
        } else if (class146.field2621 == arg0) {
            class146.field2621++;
            if (class146.field2621 > 65535) {
                class146.field2621 = 0;
            }
            class75.field1372 = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field3785 = null;
        if (arg0 != 0) {
            method1512(-74, -99);
        }
        field3799 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZLeb;)I")
    public static final int method1511(boolean arg0, class230 arg1) {
        field3779++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class273.field4805; var2++) {
            if (arg1.method1612((byte) 15, class12.field239[var2])) {
                return var2;
            }
        }
        if (!arg0) {
            method1509(-115, (byte) -85);
        }
        return -1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
    public static final void method1512(int arg0, int arg1) {
        class233 var2 = class53.field916[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class233 var4 = class53.field916[var3][arg0][arg1] = class53.field916[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4049--;
                for (int var5 = 0; var5 < var4.field4058; var5++) {
                    class111 var6 = var4.field4050[var5];
                    if ((var6.field2001 >> 29 & 0x3L) == 2L && var6.field1988 == arg0 && var6.field1994 == arg1) {
                        var6.field1998--;
                    }
                }
            }
        }
        if (class53.field916[0][arg0][arg1] == null) {
            class53.field916[0][arg0][arg1] = new class233(0, arg0, arg1);
        }
        class53.field916[0][arg0][arg1].field4060 = var2;
        class53.field916[3][arg0][arg1] = null;
    }
}
