import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class117 {

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[Lbn;")
    public static class241[] field1655 = new class241[8];

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "Lth;")
    public static class57 field1661 = new class57(64);

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1662 = 0;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "[J")
    public static long[] field1664 = new long[500];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "J")
    public long field1656;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lmg;")
    public class117 field1657;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Lmg;")
    public class117 field1659;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 4)
    public static final void method873(byte arg0) {
        field1660++;
        if (arg0 <= -118 && class261.field3941) {
            class50.field756 = null;
            class261.field3941 = false;
            class160.field2314 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Z", line = 21)
    public final boolean method874(int arg0) {
        field1658++;
        if (this.field1657 == null) {
            return false;
        } else if (arg0 == 8) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V", line = 41)
    public static void method875(int arg0) {
        field1655 = null;
        field1661 = null;
        field1664 = null;
        if (arg0 <= 117) {
            field1661 = (class57) null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 65)
    public final void method876(int arg0) {
        field1654++;
        if (arg0 == 8 && this.field1657 != null) {
            this.field1657.field1659 = this.field1659;
            this.field1659.field1657 = this.field1657;
            this.field1659 = null;
            this.field1657 = null;
        }
    }
}
