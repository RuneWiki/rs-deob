import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class546 {

    @OriginalMember(owner = "client!lba", name = "b", descriptor = "B")
    public byte field7694;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "B")
    public byte field7696;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "B")
    public byte field7707;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "B")
    public byte field7709;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "B")
    public byte field7711;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "B")
    public byte field7712;

    @OriginalMember(owner = "client!lba", name = "v", descriptor = "B")
    public byte field7714;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "I")
    public int field7695;

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public int field7697;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
    public int field7708;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "Leq;")
    public static class209 field7698;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "S")
    public short field7703;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Z")
    public boolean field7699;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "Z")
    public boolean field7702;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "Z")
    public boolean field7704;

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Z")
    public boolean field7705;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "Z")
    public boolean field7706;

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "Z")
    public boolean field7710;

    @OriginalMember(owner = "client!lba", name = "u", descriptor = "Z")
    public boolean field7713;

    @OriginalMember(owner = "client!lba", name = "w", descriptor = "Z")
    public boolean field7715;

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(B)V")
    public static void method3224(byte arg0) {
        field7698 = null;
        if (arg0 <= 69) {
            field7701 = -118;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)Z")
    public static final boolean method3225(int arg0, int arg1, int arg2) {
        field7693++;
        if (arg0 != 0) {
            field7700 = -20;
        }
        return (arg1 & 0x8000) != 0;
    }
}
