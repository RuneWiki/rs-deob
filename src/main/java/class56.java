import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class56 {

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field825 = 0;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lrc;")
    public static class108 field823 = new class108(51, -1);

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lap;")
    public static class310 field830 = new class310(77, 4);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "B")
    public byte field820;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lir;")
    public static class226 field828;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ljava/lang/String;")
    public String field819;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Ljava/lang/String;")
    public String field822;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Ljava/lang/String;")
    public String field826;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljava/lang/String;")
    public String field827;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 4)
    public static void method518(int arg0) {
        field828 = null;
        field830 = null;
        int var1 = 60 / ((arg0 - 54) / 49);
        field823 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z", line = 23)
    public static final boolean method519(byte arg0) {
        if (arg0 < 3) {
            method518(-117);
        }
        field821++;
        return class347.field4785 == 0 ? class264.field3811.method2610(-62466233) : true;
    }
}
