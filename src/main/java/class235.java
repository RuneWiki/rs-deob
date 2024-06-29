import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class class235 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3735 = 100;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z", line = 5)
    public static final boolean method1681(byte arg0) {
        field3739++;
        class84 var1 = class289.field4555;
        synchronized (class289.field4555) {
            if (class99.field1518 == class30.field423) {
                return false;
            }
            class289.field4561 = class170.field2715[class99.field1518];
            int var2 = 53 % ((arg0 - 42) / 55);
            class21.field323 = class305.field4761[class99.field1518];
            class99.field1518 = class99.field1518 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)I", line = 26)
    public static final int method1682(int arg0, byte arg1) {
        int var2 = arg0 & 0x3F;
        if (arg1 < 32) {
            field3735 = -31;
        }
        field3736++;
        int var3 = (arg0 & 0xE9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)C", line = 79)
    public static final char method1683(char arg0, byte arg1) {
        field3738++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else if (arg1 < 44) {
            return 'a';
        } else {
            return Character.toTitleCase(arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V", line = 98)
    public static final void method1684(int arg0, int arg1) {
        if (arg0 == 18389) {
            class23.field335.method1625(arg1, (byte) 15);
            field3734++;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)I", line = 124)
    public static final int method1685(int arg0, int arg1, int arg2, int arg3) {
        field3737++;
        if (arg3 <= 99) {
            return 34;
        } else if (arg0 >= arg2) {
            return (arg0 > arg1 ? arg1 : arg0);
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method817(int arg0);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)V")
    public abstract void method816(int arg0, byte[] arg1);
}
