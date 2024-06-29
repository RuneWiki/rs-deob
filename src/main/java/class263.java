import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class263 extends class113 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Z")
    public static boolean field3731 = false;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "J")
    public long field3727;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)I")
    public final int method844(int arg0) {
        field3722++;
        int var2 = 125 % ((24 - arg0) / 52);
        return this.field3726;
    }

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "(I)I")
    public final int method847(int arg0) {
        field3728++;
        if (arg0 != -1) {
            this.field3724 = 1;
        }
        return this.field3724;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)J")
    public final long method843(byte arg0) {
        field3723++;
        if (arg0 >= -110) {
            this.method843((byte) -3);
        }
        return this.field3727;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
    public final int method840(int arg0) {
        field3730++;
        if (arg0 <= 103) {
            this.method842(13);
        }
        return this.field3725;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
    public final int method842(int arg0) {
        field3729++;
        if (arg0 != 15) {
            this.method844(-101);
        }
        return 0;
    }
}
