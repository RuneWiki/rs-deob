import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public abstract class class157 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "Lgda;")
    public static class53 field2187 = new class53(78, -1);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field2182;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public int field2183;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field2186;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method1047(int arg0) {
        int var2 = 100 / ((arg0 - 52) / 40);
        field2184++;
        return (this.field2182 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)Z", line = 21)
    public final boolean method1048(byte arg0) {
        field2180++;
        if (arg0 < 121) {
            return true;
        } else {
            return (this.field2182 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 33)
    public static void method1049(int arg0) {
        field2187 = null;
        if (arg0 > -122) {
            field2187 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)Z", line = 46)
    public final boolean method1050(int arg0) {
        if (arg0 != -1) {
            method1049(-41);
        }
        field2185++;
        return (this.field2182 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)Z", line = 66)
    public final boolean method1051(int arg0) {
        field2181++;
        if (arg0 != -1) {
            this.field2182 = 48;
        }
        return (this.field2182 & 0x1) != 0;
    }
}
