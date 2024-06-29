import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class268 extends class793 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
    public static int[] field3550 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public int field3546;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public int field3549;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "J")
    public long field3541;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public final int method1591(int arg0) {
        int var2 = 113 % ((arg0 - 41) / 41);
        field3547++;
        return this.field3549;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)I")
    public final int method1590(byte arg0) {
        if (arg0 == -3) {
            field3544++;
            return this.field3548;
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
    public final int method1592(int arg0) {
        field3542++;
        return arg0 == -19898 ? this.field3540 : 56;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)J")
    public final long method1589(int arg0) {
        if (arg0 != 14972) {
            this.field3548 = -80;
        }
        field3543++;
        return this.field3541;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
    public final int method1593(int arg0) {
        field3545++;
        return arg0 == 20259 ? this.field3546 : 51;
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V")
    public static void method1683(int arg0) {
        field3550 = null;
        if (arg0 > -91) {
            field3550 = null;
        }
    }
}
