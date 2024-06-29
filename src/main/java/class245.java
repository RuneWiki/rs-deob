import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class245 {

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field3473 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)V")
    public static final void method1662(boolean arg0, int arg1) {
        field3475++;
        class399.field5701 = arg1;
        class237 var2 = class420.field6007;
        synchronized (class420.field6007) {
            class420.field6007.method1618(0);
        }
        class237 var3 = class337.field4789;
        synchronized (class337.field4789) {
            class337.field4789.method1618(0);
        }
        if (arg0) {
            field3473 = -106;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[I[J)V")
    public static final void method1663(int arg0, int[] arg1, long[] arg2) {
        class444.method2766(true, arg1, arg2, arg2.length - 1, arg0);
        field3469++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static final void method1664(int arg0) {
        field3472++;
        class208.field2958 = 0;
        if (arg0 != -22116) {
            field3473 = -9;
        }
        class393.field5547.method505((byte) 44);
        class435.field6270 = false;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(CI)Z")
    public static final boolean method1665(char arg0, int arg1) {
        field3467++;
        if (arg1 == 127) {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method1666(byte arg0) {
        int var1 = -114 % ((33 - arg0) / 62);
        class345.field4887.method1618(0);
        field3470++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V")
    public static final void method1667(int arg0, int arg1) {
        field3474++;
        if (arg0 <= 101) {
            field3473 = 38;
        }
        class152.field1877 = 100;
        class327.field4643 = 3;
        class204.field2928 = arg1;
        class3.field27 = -1;
    }
}
