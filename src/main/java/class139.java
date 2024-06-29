import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class139 {

    @OriginalMember(owner = "client!ho", name = "h", descriptor = "Lkea;")
    public class223 field1681;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public static int field1674 = -1;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Ldr;")
    public static class675 field1675 = new class675(43, -2);

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V", line = 9)
    public void method879(boolean arg0) {
        field1677++;
        if (arg0) {
            this.method149(-22);
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V", line = 24)
    public static void method880(byte arg0) {
        field1675 = null;
        if (arg0 <= 12) {
            method880((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)V", line = 35)
    public void method881(boolean arg0) {
        field1680++;
        if (!arg0) {
            this.method149(-53);
        }
    }

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)V", line = 46)
    public void method882(byte arg0) {
        if (arg0 != -91) {
            this.method879(false);
        }
        field1676++;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V", line = 56)
    public void method883(byte arg0) {
        int var2 = -2 % ((5 - arg0) / 46);
        field1682++;
    }

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V", line = 68)
    public void method884(int arg0) {
        int var2 = 12 / ((arg0 + 72) / 54);
        field1679++;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V", line = 81)
    public void method885(int arg0) {
        if (arg0 == -2) {
            field1678++;
        }
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lkea;)V", line = 93)
    public class139(class223 arg0) {
        this.field1681 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
    public abstract void method151(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
    public abstract void method149(int arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(BILgl;)V")
    public abstract void method150(byte arg0, int arg1, class562 arg2);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
    public abstract void method153(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Z")
    public abstract boolean method152(int arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)V")
    public abstract void method148(int arg0, int arg1, int arg2);
}
