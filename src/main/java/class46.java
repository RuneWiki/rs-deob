import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class46 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field651;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public int field654;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z")
    public final boolean method331(int arg0) {
        field658++;
        if (arg0 != -1) {
            field656 = -85;
        }
        return (this.field652 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z")
    public final boolean method332(int arg0) {
        if (arg0 != 7129) {
            this.method334((byte) 29);
        }
        field659++;
        return (this.field652 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)Z")
    public final boolean method333(int arg0) {
        if (arg0 == -7149) {
            field650++;
            return (this.field652 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Z")
    public final boolean method334(byte arg0) {
        field653++;
        if (arg0 >= -123) {
            return false;
        } else {
            return (this.field652 & 0x4) != 0;
        }
    }
}
