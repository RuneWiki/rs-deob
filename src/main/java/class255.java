import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class255 extends class254 {

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "[I")
    public int[] field3871 = new int[1];

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "[I")
    public int[] field3867 = new int[] { -1 };

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lag;")
    public static class97 field3873 = new class97();

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "[[B")
    public static byte[][] field3870;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIII)V")
    public static final void method1708(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class286.field4544 = class63.field1009 * arg1 / arg4;
        class140.field2028 = -1;
        class136.field1967 = class99.field1482 * arg3 / arg2;
        if (arg0 == 27) {
            field3865++;
            class12.field191 = -1;
            class81.method544(98);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static final void method1709(byte arg0) {
        if (class193.field2774 != -1) {
            class31.method226(class193.field2774, 86);
        }
        for (int var1 = 0; var1 < class220.field3252; var1++) {
            if (class21.field278[var1]) {
                class119.field1753[var1] = true;
            }
            class86.field1334[var1] = class21.field278[var1];
            class21.field278[var1] = false;
        }
        class213.field3060 = -1;
        class141.field2034 = null;
        if (arg0 > -67) {
            return;
        }
        field3872++;
        class51.field748 = -1;
        class94.field1432 = class82.field1267;
        if (class193.field2774 != -1) {
            class220.field3252 = 0;
            class13.method107((byte) 119);
        }
        class144.method962();
        class38.field566 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)I")
    public static final int method1710(int arg0) {
        int var1 = -26 / ((8 - arg0) / 54);
        field3875++;
        return class268.field4204 && class19.field267[81] && class283.field4508 > 2 ? class187.field2665[class283.field4508 - 2] : class187.field2665[class283.field4508 - 1];
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lve;ZI)Z")
    public static final boolean method1711(class233 arg0, boolean arg1, int arg2) {
        field3874++;
        if (!arg1) {
            field3873 = null;
        }
        byte[] var3 = arg0.method1514(arg2, -21664);
        if (var3 == null) {
            return false;
        } else {
            class120.method822(var3, -19262);
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)V")
    public static final void method1712(byte arg0, String arg1, int arg2, String arg3) {
        class178.method1155((String) null, arg1, arg3, arg0 ^ 0x1048, -1, arg2);
        if (arg0 == 72) {
            field3869++;
        }
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
    public static void method1713(int arg0) {
        field3870 = null;
        field3873 = null;
        int var1 = -41 / ((-arg0 - 3) / 58);
    }
}
