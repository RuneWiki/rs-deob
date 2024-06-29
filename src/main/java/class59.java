import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class59 {

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Lra;")
    public static class361 field802 = new class361(55, 2);

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "B")
    public byte field798;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "B")
    public byte field801;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "B")
    public byte field805;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "B")
    public byte field806;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "B")
    public byte field807;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "B")
    public byte field811;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "B")
    public byte field813;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public int field792;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public int field797;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "S")
    public short field804;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Z")
    public boolean field793;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "Z")
    public boolean field794;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Z")
    public boolean field795;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
    public boolean field799;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
    public boolean field800;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Z")
    public boolean field803;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Z")
    public boolean field808;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
    public boolean field809;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Z")
    public boolean field810;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "Z")
    public boolean field812;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZI)Z")
    public static final boolean method505(int arg0, boolean arg1, int arg2) {
        field796++;
        if (arg1) {
            field802 = null;
        }
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method506(int arg0) {
        int var1 = -70 / ((-arg0 - 71) / 48);
        field802 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)Z")
    public static final boolean method507(byte arg0, int arg1, int arg2) {
        field814++;
        if (arg0 == -44) {
            return class50.method447(arg2, 5978, arg1) | (arg1 & 0x60000) != 0 || class337.method1932(-1, arg1, arg2) || class596.method3231(arg1, -32310, arg2);
        } else {
            return true;
        }
    }
}
