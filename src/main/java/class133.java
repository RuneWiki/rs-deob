import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public abstract class class133 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lph;")
    public static class229 field2157 = class266.method1858("<col=ffff00>", 0);

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2163 = 0;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lph;")
    public static class229 field2159 = class266.method1858(":duelstake:", 0);

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lph;")
    public static class229 field2168 = class266.method1858("", 0);

    @OriginalMember(owner = "client!th", name = "r", descriptor = "[Lph;")
    public static class229[] field2170 = new class229[200];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public int field2156;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public int field2161;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "Lsi;")
    public static class66 field2154;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[Z")
    public static boolean[] field2164;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method942(byte arg0) {
        if (arg0 != 51) {
            this.field2161 = 71;
        }
        field2160++;
        return (this.field2161 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIZIIII)V", line = 24)
    public static final void method943(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field2165++;
        class40.field640 = arg1;
        if (arg6 != 4478) {
            field2168 = (class229) null;
        }
        class209.field3453 = arg4;
        class306.field5174 = arg0;
        class313.field5281 = arg3;
        class48.field698 = arg5;
        if (arg2 && class313.field5281 >= 100) {
            class167.field2725 = class48.field698 * 128 + 64;
            class192.field3177 = class306.field5174 * 128 + 64;
            class205.field3387 = class259.method1801(class167.field2725, arg6 - 24906, class298.field4849, class192.field3177) - class40.field640;
        }
        class217.field3565 = 2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z", line = 51)
    public final boolean method944(boolean arg0) {
        field2162++;
        if (!arg0) {
            method946((byte) -89);
        }
        return (this.field2161 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Z", line = 75)
    public final boolean method945(int arg0) {
        field2166++;
        if (arg0 >= -78) {
            return true;
        } else {
            return (this.field2161 & 0x4) != 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V", line = 101)
    public static final void method946(byte arg0) {
        field2158++;
        class12.field169.method1415(-18218);
        class234.field3856.method1415(-18218);
        class312.field5238.method1415(-18218);
        if (arg0 != -53) {
            method943(49, -64, true, -5, 79, 117, -19);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)Z", line = 121)
    public final boolean method947(byte arg0) {
        field2153++;
        if (arg0 >= -104) {
            return true;
        } else {
            return (this.field2161 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V", line = 135)
    public static void method948(byte arg0) {
        field2157 = null;
        field2168 = null;
        field2159 = null;
        field2170 = null;
        field2154 = null;
        if (arg0 <= 10) {
            field2163 = -128;
        }
        field2164 = null;
    }
}
