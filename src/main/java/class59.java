import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public abstract class class59 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Ljd;")
    private static class85 field1075 = class221.method1499("Type", (byte) -86);

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Ljd;")
    public static class85 field1074 = field1075;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
    public static int[] field1071 = new int[50];

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "Ljd;")
    public static class85 field1072 = class221.method1499("0(U", (byte) 115);

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        field1072 = null;
        field1075 = null;
        field1071 = null;
        field1074 = null;
        int var1 = 107 % ((49 - arg0) / 46);
    }
}
