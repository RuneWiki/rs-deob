import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class28 {

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "[I")
    public static int[] field484 = new int[2];

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lok;")
    private static class146 field487 = class235.method1724(-12908, "Opened title screen");

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lok;")
    public static class146 field492 = field487;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "F")
    public static float field491;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public int field482;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public int field488;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 34)
    public static void method181(int arg0) {
        field487 = null;
        field492 = null;
        field484 = null;
        if (arg0 != 3000) {
            field491 = -0.7071886F;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V", line = 56)
    public static final void method182(boolean arg0, int arg1) {
        if (arg1 != 12252) {
            field492 = (class146) null;
        }
        field481++;
        if (arg0) {
            if (class236.field3943 != -1) {
                class195.method1506(class236.field3943, 117);
            }
            for (class142 var2 = (class142) class135.field2266.method807(-92); var2 != null; var2 = (class142) class135.field2266.method806(72)) {
                class73.method535(true, arg1 ^ 0xFFFFCE30, var2);
            }
            class236.field3943 = -1;
            class135.field2266 = new class118(8);
            class167.method1296(arg1 - 12253);
            class236.field3943 = class166.field2806;
            class76.method555(false, 0);
            class89.method616(-1212);
            class168.method1297((byte) 108, class236.field3943);
        }
        client.field4085 = -1;
        class196.method1516(class60.field1027, false);
        class102.field1639 = new class234();
        class102.field1639.field5409 = 3000;
        class102.field1639.field5380 = 3000;
        if (!class271.field4640) {
            class191.method1472(arg1 - 1598083764, class196.field3273);
            class1.method4(-41, 10);
            return;
        }
        if (class302.field5172 == 2) {
            class107.field1742 = class227.field3787 << 7;
            class161.field2719 = class145.field2423 << 7;
        } else {
            class122.method846((byte) 80);
        }
        class1.method1(29659);
        class14.method85(16277770);
        class1.method4(arg1 - 12293, 28);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V", line = 123)
    public static final void method183(int arg0, int arg1) {
        class158 var2 = class206.method1564(arg0, 8, -104);
        if (arg1 != -24235) {
            method182(true, 23);
        }
        field489++;
        var2.method1238(arg1 + 24132);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(III)V")
    public abstract void method179(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public abstract void method180(int arg0, int arg1);
}
