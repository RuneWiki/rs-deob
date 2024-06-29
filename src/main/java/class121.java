import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class121 {

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
    public String field1661;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Lvfa;")
    public static class92 field1658 = new class92();

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field1665;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Lwu;")
    public static class557 field1664;

    @OriginalMember(owner = "client!wj", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field1659++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 13)
    public static void method784(int arg0) {
        field1658 = null;
        if (arg0 == 2048) {
            field1664 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)Z", line = 26)
    public static final boolean method785(int arg0, int arg1, int arg2) {
        field1665++;
        if (arg0 != 2048) {
            method786((byte) -118);
        }
        return class304.method1783(arg2, (byte) 97, arg1) | (arg2 & 0x800) != 0 || class620.method3631(arg1, 55, arg2);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V", line = 42)
    public static final void method786(byte arg0) {
        class49.field724 = null;
        class400.field5545 = false;
        class330.field4241 = null;
        class604.field8630 = null;
        field1663++;
        class524.field7351 = null;
        class270.field3638 = null;
        if (arg0 > -92) {
            field1660 = 75;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 61)
    public class121(String arg0, int arg1) {
        this.field1662 = arg1;
        this.field1661 = arg0;
    }
}
