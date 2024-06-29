import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class91 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Z")
    public static boolean field1718 = false;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field1719 = -2;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static volatile int field1723 = 0;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Lij;")
    public static class50[] field1722;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
    public static final int method706(int arg0, int arg1, int arg2) {
        int var3 = arg0 >>> 31;
        field1725++;
        if (arg2 > -13) {
            method708(false);
        }
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLbf;[B)V")
    public static final void method707(int arg0, byte arg1, class47 arg2, byte[] arg3) {
        field1720++;
        if (arg1 <= 60) {
            return;
        }
        class124 var4 = new class124();
        var4.field2182 = arg3;
        var4.field635 = (long) arg0;
        var4.field2178 = 0;
        var4.field2179 = arg2;
        class86 var5 = class129.field2259;
        synchronized (class129.field2259) {
            class129.field2259.method684(var4, (byte) 109);
        }
        class74.method557(-1);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
    public static void method708(boolean arg0) {
        field1722 = null;
        if (arg0) {
            method707(78, (byte) -55, (class47) null, (byte[]) null);
        }
    }
}
