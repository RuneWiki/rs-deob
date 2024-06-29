import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class365 extends class508 {

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "J")
    public long field4698;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field4702 = 0;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Ljd;")
    public static class408 field4700 = new class408(1, 2, 2, 0);

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)V")
    public static final void method2140(byte arg0) {
        field4701++;
        if (class246.field3154 != null) {
            if (class246.field3154.field3542 == 1) {
                class246.field3154 = null;
                return;
            }
            if (class246.field3154.field3542 == 2) {
                class395.method2351(2, class126.field1727, 0, class482.field7021);
                class246.field3154 = null;
                return;
            }
        }
        if (arg0 != -63) {
            method2144((byte) -61, -17, -110);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static final void method2141(int arg0) {
        field4699++;
        int var1 = 0;
        for (int var2 = arg0; var2 < class200.field2594; var2++) {
            for (int var3 = 0; var3 < class118.field1647; var3++) {
                if (class95.method646(false, var2, class470.field6877, var3, true, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(I)V")
    public static final void method2142(int arg0) {
        field4697++;
        if (class65.field821 == 10) {
            class294.method1767(28, (byte) -73);
        }
        int var1 = -29 % ((arg0 - 65) / 55);
        if (class65.field821 == 30) {
            class294.method1767(25, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)V")
    public static void method2143(int arg0) {
        field4700 = null;
        if (arg0 != 31585) {
            field4700 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class365() {
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(J)V")
    public class365(long arg0) {
        this.field4698 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
    public static final boolean method2144(byte arg0, int arg1, int arg2) {
        int var3 = -127 % ((-arg0 - 34) / 35);
        field4696++;
        return false;
    }
}
