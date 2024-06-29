import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class421 extends class203 {

    @OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!mha", name = "i", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!mha", name = "j", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!mha", name = "k", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIZ)V", line = 7)
    public final void method682(int arg0, int arg1, boolean arg2) {
        ++field5856;
        if (!arg2) {
            this.method681(true, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method687(int arg0) {
        if (arg0 != -12) {
            return true;
        } else {
            ++field5860;
            return true;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)V", line = 29)
    public static final void method2540(byte arg0) {
        if (arg0 != -67) {
            method2541(110, -46, 63, -20, 108);
        }
        ++field5857;
        int var1 = class688.field9602.field8532.method4280((byte) -98);
        if (var1 != 0) {
            if (~var1 == -2) {
                class473.method2823(-24022, (byte) 0);
                class361.method2273(false, 512);
                if (class533.field7338 != null) {
                    class254.method1702(16);
                }
            } else {
                class473.method2823(-24022, (byte) (255 & class137.field1758 + -4));
                class361.method2273(false, 2);
            }
        } else {
            class244.field3608 = null;
            class361.method2273(false, 0);
        }
        class597.field8365 = class435.field6040;
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IZLwha;)V", line = 65)
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        if (arg1) {
            this.method683(23, false, (class539) null);
        }
        super.field2843.method1219((byte) 100, arg2);
        ++field5854;
        super.field2843.method1263(arg0, 115);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(IIIII)Z", line = 77)
    public static final boolean method2541(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5855;
        if ((class533.field7338[0][arg4][arg3] & 2) != 0) {
            return true;
        } else if (~(class533.field7338[arg0][arg4][arg3] & 16) != arg2) {
            return false;
        } else {
            return class109.method800(arg2, arg0, arg3, arg4) == arg1;
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lpq;)V", line = 97)
    public class421(class194 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BZ)V", line = 100)
    public final void method688(byte arg0, boolean arg1) {
        super.field2843.method1236(2, true);
        ++field5859;
        if (arg0 > -25) {
            this.method687(-82);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZB)V", line = 111)
    public final void method681(boolean arg0, byte arg1) {
        ++field5858;
        if (arg1 < 0) {
            method2541(101, 75, -7, 62, 26);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V", line = 123)
    public final void method686(int arg0) {
        if (arg0 <= 64) {
            method2540((byte) -96);
        }
        super.field2843.method1236(2, false);
        ++field5853;
    }
}
