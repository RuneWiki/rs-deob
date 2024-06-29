import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class266 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4057 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[Lvl;")
    public static class165[] field4058 = new class165[29];

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[[I")
    public static int[][] field4066 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field4059;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public int field4061;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field4063;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lph;")
    public static class361 field4060;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method1967(int arg0) {
        field4062++;
        if (arg0 != 32) {
            this.field4061 = 43;
        }
        return (this.field4061 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)Z", line = 31)
    public final boolean method1968(int arg0) {
        field4063++;
        if (arg0 == 0) {
            return (this.field4061 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z", line = 45)
    public final boolean method1969(byte arg0) {
        field4056++;
        int var2 = 44 % ((-arg0 - 36) / 60);
        return (this.field4061 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 58)
    public static void method1970(int arg0) {
        field4066 = (int[][]) null;
        field4058 = null;
        field4060 = null;
        if (arg0 != 0) {
            method1970(62);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Z", line = 70)
    public final boolean method1971(boolean arg0) {
        if (arg0) {
            this.method1967(-49);
        }
        field4065++;
        return (this.field4061 & 0x1) != 0;
    }
}
