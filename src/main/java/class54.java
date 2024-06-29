import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class54 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Z")
    public static boolean field553 = false;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "[Z")
    public static boolean[] field558 = new boolean[100];

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lkfa;")
    public static class549 field557 = new class549(47, 3);

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public int field563;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public int field564;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "[B")
    public byte[] field560;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "[B")
    public byte[] field561;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
    public static void method270(int arg0) {
        field557 = null;
        int var1 = -65 % ((arg0 + 84) / 37);
        field558 = null;
    }
}
