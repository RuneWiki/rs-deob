import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class371 extends class86 {

    @OriginalMember(owner = "client!td", name = "A", descriptor = "[B")
    public byte[] field5697;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "Lpg;")
    public static class492 field5696 = new class492(6, 7);

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Lui;")
    public static class375 field5698 = new class375("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lpg;")
    public static class492 field5699 = new class492(97, 8);

    @OriginalMember(owner = "client!td", name = "E", descriptor = "[Lku;")
    public static class143[] field5700 = new class143[6];

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public static void method2323(byte arg0) {
        int var1 = 110 / ((-arg0 - 21) / 39);
        field5700 = null;
        field5696 = null;
        field5698 = null;
        field5699 = null;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    public class371(byte[] arg0) {
        this.field5697 = arg0;
    }
}
