import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class524 extends class28 {

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
    public static int[] field7254 = new int[16];

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field7251;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field7255;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public int field7256;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z")
    public static final boolean method2988(int arg0, int arg1, int arg2) {
        int var3 = -109 % ((64 - arg2) / 61);
        field7253++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZII)V")
    public static final void method2989(int arg0, boolean arg1, int arg2, int arg3) {
        field7250++;
        if (arg2 == 1003) {
            class317.method2043(class291.field3895, arg0, arg3);
        } else if (arg2 == 1011) {
            class317.method2043(class523.field7248, arg0, arg3);
        } else if (arg2 == 1001) {
            class317.method2043(class640.field8725, arg0, arg3);
        } else if (arg2 == 1008) {
            class317.method2043(class95.field1171, arg0, arg3);
        } else if (arg2 == 1007) {
            class317.method2043(class305.field4103, arg0, arg3);
        }
        if (arg1) {
            field7254 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2990(int arg0, int arg1, byte arg2) {
        field7252++;
        if (arg2 < 76) {
            field7254 = null;
        }
        return (arg0 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static void method2991(int arg0) {
        field7254 = null;
        if (arg0 < 64) {
            method2991(-1);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    public static final int method2992(int arg0, int arg1) {
        if (arg1 == 127) {
            field7251++;
            return arg0 & 0x7F;
        } else {
            return -24;
        }
    }
}
