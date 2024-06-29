import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class180 {

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2521 = 0;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "[I")
    public static int[] field2519 = new int[5];

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2518 = 99;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public int field2516;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public int field2522;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method1193(int arg0) {
        field2523++;
        if (arg0 != -1) {
            method1196(-85);
        }
        return (this.field2516 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method1194(byte arg0) {
        field2513++;
        if (arg0 == -15) {
            return (this.field2516 & 0x8) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)Z", line = 40)
    public final boolean method1195(byte arg0) {
        field2517++;
        if (arg0 == 42) {
            return (this.field2516 & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 56)
    public static void method1196(int arg0) {
        if (arg0 != 8) {
            field2521 = -2;
        }
        field2519 = null;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Z", line = 79)
    public final boolean method1197(int arg0) {
        field2520++;
        if (arg0 != 16) {
            field2519 = null;
        }
        return (this.field2516 & 0x1) != 0;
    }
}
