import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class253 extends class146 {

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public int field4037;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public int field4028;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4033 = "Cancel";

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "Lsb;")
    public static class124 field4031;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[Lfc;")
    public static class149[] field4024;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Z")
    public final boolean method1680(int arg0, boolean arg1) {
        field4029++;
        if (arg1) {
            return (this.field4028 >> arg0 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)Z")
    public final boolean method1681(boolean arg0) {
        field4027++;
        if (arg0) {
            this.method1682(56);
        }
        return (this.field4028 & 0x680438) >> 22 != 0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)Z")
    public final boolean method1682(int arg0) {
        if (arg0 == 2001259446) {
            field4034++;
            return (this.field4028 & 0x7748CBB6) >> 30 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(Z)I")
    public final int method1683(boolean arg0) {
        field4022++;
        return arg0 ? 37 : (this.field4028 & 0x1DC889) >> 18;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)Z")
    public final boolean method1684(int arg0) {
        if (arg0 == 1) {
            field4026++;
            return (this.field4028 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)Z")
    public final boolean method1685(byte arg0) {
        field4032++;
        if (arg0 <= 93) {
            return true;
        } else {
            return (this.field4028 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
    public final int method1686(int arg0) {
        field4023++;
        if (arg0 < 68) {
            this.method1686(118);
        }
        return class144.method1061((byte) 121, this.field4028);
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(Z)Z")
    public final boolean method1687(boolean arg0) {
        field4035++;
        if (!arg0) {
            this.method1683(true);
        }
        return (this.field4028 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
    public static void method1688(int arg0) {
        field4031 = null;
        field4033 = null;
        if (arg0 != 0) {
            field4024 = null;
        }
        field4024 = null;
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)Z")
    public final boolean method1689(byte arg0) {
        int var2 = 69 / ((arg0 + 62) / 46);
        field4036++;
        return (this.field4028 & 0x2B01C7) >> 21 != 0;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(II)V")
    public class253(int arg0, int arg1) {
        this.field4037 = arg1;
        this.field4028 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "(Z)Z")
    public final boolean method1690(boolean arg0) {
        if (!arg0) {
            this.field4037 = 38;
        }
        field4025++;
        return (this.field4028 >> 28 & 0x1) != 0;
    }
}
