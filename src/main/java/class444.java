import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class444 {

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field6508 = 0;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "[B")
    public static byte[] field6498 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "B")
    public byte field6493;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "B")
    public byte field6495;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "B")
    public byte field6497;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "B")
    public byte field6499;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "B")
    public byte field6506;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "B")
    public byte field6510;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "B")
    public byte field6512;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "S")
    public short field6504;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Z")
    public boolean field6492;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public boolean field6494;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
    public boolean field6500;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Z")
    public boolean field6501;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Z")
    public boolean field6502;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Z")
    public boolean field6503;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Z")
    public boolean field6507;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Z")
    public boolean field6509;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "Z")
    public boolean field6511;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)Z")
    public static final boolean method2792(int arg0, int arg1, int arg2) {
        field6496++;
        if ((class103.field1430[1][arg1][arg2] & 0x2) == 0) {
            if (arg0 > -72) {
                field6498 = null;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method2793(int arg0) {
        field6498 = null;
        if (arg0 != 11910) {
            method2793(-8);
        }
    }
}
