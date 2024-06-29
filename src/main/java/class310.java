import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class310 extends class311 {

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!vc", name = "t", descriptor = "Lhc;")
    public static class368 field4202 = new class368(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
    public static int field4205 = -2;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field4210 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "J")
    public static long field4211;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "[Lwn;")
    public static class77[] field4208;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Z")
    public final boolean method1873(int arg0) {
        field4212++;
        if (arg0 != -1) {
            method1880((byte) 125, 34);
        }
        return (this.field4209 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)Z")
    public final boolean method1874(int arg0) {
        field4207++;
        if (arg0 == 1) {
            return (this.field4209 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)I")
    public final int method1875(int arg0) {
        field4203++;
        return arg0 == 2644133 ? class58.method453(this.field4209, 1) : 81;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static void method1876(byte arg0) {
        field4208 = null;
        field4202 = null;
        field4210 = null;
        if (arg0 != 35) {
            method1876((byte) 41);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Z")
    public final boolean method1877(int arg0, int arg1) {
        field4213++;
        if (arg0 == 1) {
            return (this.field4209 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Z")
    public final boolean method1878(int arg0) {
        field4200++;
        if (arg0 > -98) {
            method1880((byte) 50, 64);
        }
        return ((this.field4209 & 0x2858A5) >> 21) != 0;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)I")
    public final int method1879(int arg0) {
        if (arg0 <= 13) {
            this.method1875(77);
        }
        field4201++;
        return this.field4209 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BI)V")
    public static final void method1880(byte arg0, int arg1) {
        if (arg0 != -128) {
            method1880((byte) 11, -25);
        }
        field4199++;
        class26 var2 = class217.method1445(true, arg1, 3);
        var2.method164(12);
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
    public class310(int arg0, int arg1) {
        this.field4209 = arg0;
        this.field4204 = arg1;
    }
}
