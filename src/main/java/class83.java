import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public abstract class class83 {

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "Lifa;")
    public static class450 field1126 = new class450();

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "[I")
    public static int[] field1130 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public int field1122;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
    public int field1123;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "Lnj;")
    public static class260 field1129;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "Z")
    public static boolean field1124;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V", line = 9)
    public static final void method778(int arg0) {
        class408.field5349.method1690(0);
        if (arg0 != 99) {
            field1130 = null;
        }
        field1128++;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Z", line = 22)
    public final boolean method779(int arg0) {
        field1127++;
        if (arg0 != 3791) {
            this.method780(-83);
        }
        return (this.field1125 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "(I)Z", line = 40)
    public final boolean method780(int arg0) {
        if (arg0 == -25551) {
            field1120++;
            return (this.field1125 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V", line = 52)
    public static void method781(byte arg0) {
        if (arg0 <= 55) {
            field1126 = null;
        }
        field1129 = null;
        field1126 = null;
        field1130 = null;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)Z", line = 65)
    public final boolean method782(int arg0) {
        field1119++;
        if (arg0 == 99) {
            return (this.field1125 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)Z", line = 82)
    public final boolean method783(int arg0) {
        field1121++;
        if (arg0 <= 10) {
            method778(117);
        }
        return (this.field1125 & 0x1) != 0;
    }
}
