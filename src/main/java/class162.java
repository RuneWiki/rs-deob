import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class162 extends class424 {

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "I")
    public int field2018;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "Lra;")
    public static class361 field2014 = new class361(72, -2);

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "Z")
    public static boolean field2019 = false;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
    public final int method1142(byte arg0) {
        if (arg0 != -124) {
            field2014 = null;
        }
        field2013++;
        return class318.method1853(this.field2020, false);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)Z")
    public final boolean method1143(int arg0, int arg1) {
        int var3 = -122 % ((arg0 + 6) / 39);
        field2015++;
        return (this.field2020 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
    public static void method1144(boolean arg0) {
        field2014 = null;
        if (arg0) {
            method1144(true);
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)Z")
    public final boolean method1145(byte arg0) {
        field2012++;
        if (arg0 != 126) {
            method1144(true);
        }
        return (this.field2020 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
    public final int method1146(int arg0) {
        field2016++;
        if (arg0 >= -121) {
            this.method1142((byte) 86);
        }
        return this.field2020 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)Z")
    public final boolean method1147(int arg0) {
        if (arg0 > -27) {
            return true;
        } else {
            field2017++;
            return (this.field2020 & 0x2FA609) >> 21 != 0;
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)Z")
    public final boolean method1148(int arg0) {
        field2011++;
        if (arg0 != 6207) {
            this.method1142((byte) -104);
        }
        return (this.field2020 & 0x5E9A44) >> 22 != 0;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II)V")
    public class162(int arg0, int arg1) {
        this.field2020 = arg0;
        this.field2018 = arg1;
    }
}
