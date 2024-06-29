import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class39 {

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lqv;")
    public static class316 field815;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Lqv;")
    public static class316 field833;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "B")
    public byte field816;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "B")
    public byte field817;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "B")
    public byte field819;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "B")
    public byte field821;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "B")
    public byte field822;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "B")
    public byte field824;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "B")
    public byte field832;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "S")
    public short field828;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Z")
    public boolean field814;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Z")
    public boolean field818;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Z")
    public boolean field820;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    public boolean field823;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Z")
    public boolean field825;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "Z")
    public boolean field826;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "Z")
    public boolean field827;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
    public boolean field829;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
    public boolean field830;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "Z")
    public boolean field831;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static void method401(byte arg0) {
        field833 = null;
        field815 = null;
        if (arg0 < 15) {
            field835 = 32;
        }
    }

    static {
        new class44("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field815 = new class316(5, 8);
        field833 = new class316(38, 2);
    }
}
