import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class263 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4578 = 0;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lak;")
    public static class152 field4580 = new class152(128);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4583 = 0;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field4581 = new int[32768];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[Lka;")
    public static class134[] field4579;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method1786(int arg0) {
        field4579 = null;
        field4581 = null;
        if (arg0 == 32768) {
            field4580 = null;
        }
    }
}
