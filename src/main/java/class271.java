import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class271 extends class176 {

    @OriginalMember(owner = "client!h", name = "U", descriptor = "Lkd;")
    public static class204 field4274 = new class204(512);

    @OriginalMember(owner = "client!h", name = "N", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "Lab;")
    public class146 field4270;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "[B")
    public byte[] field4278;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "[I")
    public static int[] field4275;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)V")
    public static void method1833(byte arg0) {
        field4274 = null;
        field4275 = null;
        if (arg0 >= -22) {
            field4276 = 44;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(B)I")
    public final int method1203(byte arg0) {
        if (arg0 >= -55) {
            this.field4278 = null;
        }
        ++field4269;
        return super.field2781 ? 0 : 100;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Log;I)Lsc;")
    public static final class250 method1834(class221 arg0, int arg1) {
        ++field4271;
        if (arg1 < 115) {
            method1836(true, -84);
        }
        class250 var2 = new class250();
        var2.field3976 = arg0.method1521((byte) 113);
        var2.field3978 = class223.method1572((byte) 118, var2.field3976);
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(B)I")
    public static final int method1835(byte arg0) {
        ++field4268;
        if ((double) class28.field445 == 3.0D) {
            return 37;
        } else if ((double) class28.field445 == 4.0D) {
            return 50;
        } else if (arg0 >= -16) {
            return 52;
        } else if ((double) class28.field445 == 6.0D) {
            return 75;
        } else {
            return (double) class28.field445 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)V")
    public static final void method1836(boolean arg0, int arg1) {
        if (arg1 < -73) {
            ++field4273;
            class190.method1299(class279.field4423, class84.field1326, 0, class157.field2548, arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1837(int arg0, int arg1) {
        ++field4272;
        if (arg1 >= -42) {
            return null;
        } else {
            return ~arg0 > -1000000000 ? Integer.toString(arg0) : "*";
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)[B")
    public final byte[] method1201(byte arg0) {
        if (arg0 != 8) {
            return null;
        } else {
            ++field4267;
            if (super.field2781) {
                throw new RuntimeException();
            } else {
                return this.field4278;
            }
        }
    }
}
