import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class480 extends class613 {

    @OriginalMember(owner = "client!si", name = "q", descriptor = "B")
    public byte field6817 = 5;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "[I")
    public static int[] field6816 = new int[14];

    @OriginalMember(owner = "client!si", name = "u", descriptor = "[I")
    public static int[] field6821 = new int[1];

    @OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
    public static int[] field6819 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!si", name = "v", descriptor = "Llu;")
    public static class610 field6822 = new class610(4, 0);

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public int field6815;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public int field6824;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public int field6825;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public int field6826;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public int field6828;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public int field6829;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
    public boolean field6827;

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field6820;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method2889(int arg0, boolean arg1) {
        field6818++;
        if (arg0 != 19298) {
            method2890(100);
        }
        if (arg1) {
            if (class340.field4708 != -1) {
                class417.method2455(arg0 - 19299, class340.field4708);
            }
            for (class243 var2 = (class243) class385.field5297.method2798((byte) -52); var2 != null; var2 = (class243) class385.field5297.method2806(true)) {
                if (!var2.method2453(arg0 - 19234)) {
                    var2 = (class243) class385.field5297.method2798((byte) -100);
                    if (var2 == null) {
                        break;
                    }
                }
                class321.method1935(false, var2, (byte) 57, true);
            }
            class340.field4708 = -1;
            class385.field5297 = new class465(8);
            class538.method3263(false);
            class340.field4708 = class47.field564;
            class600.method3545(false, false);
            class504.method2996((byte) 122);
            class98.method746(class340.field4708);
        }
        class210.field3101 = true;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 54)
    public static final void method2890(int arg0) {
        for (int var1 = arg0; var1 < 5; var1++) {
            class345.field4750[var1] = false;
        }
        field6830++;
        class531.field7929 = 5;
        class448.field6279 = class617.field9123;
        class100.field1461 = -1;
        class613.field9074 = 0;
        class494.field7037 = class125.field1760;
        class625.field9211 = -1;
        class341.field4718 = class118.field1665;
        class527.field7600 = class214.field3161;
        class607.field9011 = class222.field3222;
        class204.field3009 = class517.field7371;
        class354.field4818 = 0;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 94)
    public static void method2891(int arg0) {
        if (arg0 < 74) {
            field6820 = null;
        }
        field6821 = null;
        field6819 = null;
        field6820 = null;
        field6822 = null;
        field6816 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 109)
    public static final void method2892(int arg0, int arg1) {
        field6823++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class647.field9400 = arg0;
        class6.field57 = new class206[class330.field4548[class647.field9400] + 1];
        class65.field803 = arg1;
        class450.field6324 = 0;
    }
}
