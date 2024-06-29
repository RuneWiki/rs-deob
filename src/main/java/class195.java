import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class195 {

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "F")
    public static float field2770 = 0.0F;

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "Lbt;")
    public static class519 field2765 = new class519();

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public int field2768;

    @OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!hga", name = "i", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!hga", name = "j", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Lpk;")
    public class647 field2764;

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "[I")
    public int[] field2769;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V", line = 3)
    public static void method1276(int arg0) {
        field2765 = null;
        if (arg0 != -5) {
            field2765 = null;
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1277(int arg0, int arg1, int arg2) {
        if (arg0 == -24149) {
            field2767++;
            return (arg1 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)I", line = 27)
    public static final int method1278(int arg0) {
        field2773++;
        if (class166.field2118 == 1) {
            return class544.field7574;
        } else {
            int var1 = -93 % ((arg0 + 4) / 48);
            return class93.field1086;
        }
    }

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "(I)V", line = 42)
    public static final void method1279(int arg0) {
        field2771++;
        if (class785.field10773 == 0) {
            return;
        }
        try {
            if (++class218.field2995 > 2000) {
                if (class679.field9490 != null) {
                    class679.field9490.method3634(22654);
                    class679.field9490 = null;
                }
                if (class482.field6670 >= 2) {
                    class383.field5492 = -5;
                    class785.field10773 = 0;
                    return;
                }
                class367.field5275.method3452(-124);
                class785.field10773 = 1;
                class482.field6670++;
                class218.field2995 = 0;
            }
            if (class785.field10773 == 1) {
                class66.field726 = class367.field5275.method3450(class129.field1674, (byte) -89);
                class785.field10773 = 2;
            }
            if (class785.field10773 == 2) {
                if (class66.field726.field4970 == 2) {
                    throw new IOException();
                }
                if (class66.field726.field4970 != 1) {
                    return;
                }
                class679.field9490 = class705.method3981(15000, 115, (Socket) class66.field726.field4975);
                class66.field726 = null;
                class581.method3420(0);
                class785.field10773 = 4;
            }
            if (class785.field10773 == 4) {
                if (class679.field9490.method3633(1, 10)) {
                    class679.field9490.method3640(0, class315.field4517.field6979, 1, -49);
                    int var1 = class315.field4517.field6979[0] & 0xFF;
                    class383.field5492 = var1;
                    class785.field10773 = 0;
                    class679.field9490.method3634(22654);
                    class679.field9490 = null;
                }
            } else if (arg0 < 105) {
                method1278(-95);
            }
        } catch (IOException var2) {
            if (class679.field9490 != null) {
                class679.field9490.method3634(22654);
                class679.field9490 = null;
            }
            if (class482.field6670 < 2) {
                class367.field5275.method3452(-117);
                class218.field2995 = 0;
                class482.field6670++;
                class785.field10773 = 1;
            } else {
                class383.field5492 = -4;
                class785.field10773 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "(III)V", line = 148)
    public static final void method1280(int arg0, int arg1, int arg2) {
        field2772++;
        class17 var3 = class245.method1634(1, 0L, arg2);
        var3.method66((byte) 102);
        var3.field104 = arg1;
        var3.field107 = arg0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(Lha;III)V", line = 167)
    public static final void method1281(class473 arg0, int arg1, int arg2, int arg3) {
        field2766++;
        class405.field5707 = new class783[arg2][arg1];
        client.field1307 = arg0;
        if (arg3 != -1313) {
            return;
        }
        if (class551.field7656 != null) {
            class194.field2513 = class459.method2762(class551.field7656[3], class551.field7656[1], class551.field7656[4], class551.field7656[5], class551.field7656[2], class551.field7656[0], -90);
        }
        class461.field6453 = new class783();
        class497.method2920((byte) 87);
    }
}
