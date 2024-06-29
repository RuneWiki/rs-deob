import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class182 {

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "Lin;")
    public static class380 field2766 = new class380(111, 6);

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "[B")
    public byte[] field2769;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "[S")
    public short[] field2765;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "[S")
    public short[] field2771;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "[S")
    public short[] field2772;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIILmg;Lka;B)V", line = 3)
    public static final void method1319(int arg0, int arg1, int arg2, class248 arg3, class233 arg4, byte arg5) {
        field2773++;
        if (arg5 < 41) {
            method1320(-43);
        }
        if (arg4 != null) {
            arg3.method1647((byte) 121, arg4.method566(), arg4.method547(), arg4.method527(), arg2, arg0, arg4.method572(), arg1, arg4.method525(), arg4.method534(), arg4.method541());
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1320(int arg0) {
        field2767++;
        if (arg0 != 2) {
            method1322(null, (byte) 19);
        }
        if (class40.field466 == null) {
            return;
        }
        if (class40.field466.field10365 == 1) {
            class40.field466 = null;
            return;
        }
        if (class40.field466.field10365 == 2) {
            class324.method1955(class93.field1333, class157.field2462, 2, arg0 - 92);
            class40.field466 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V", line = 65)
    public static void method1321(byte arg0) {
        field2766 = null;
        int var1 = -92 % ((56 - arg0) / 36);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lha;B)V", line = 74)
    public static final void method1322(class475 arg0, byte arg1) {
        field2768++;
        int var2 = -38 % ((arg1 - 40) / 48);
        if (class233.field3393) {
            class272.method1736((byte) -113, arg0);
        } else {
            class791.method4324(arg0, -256);
        }
    }
}
