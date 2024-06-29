import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class112 extends class167 {

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[B")
    public byte[] field1876;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field1877 = 0;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Le;")
    private static class191 field1879 = class54.method368("Checking for updates )2 ", 2047);

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "[Z")
    public static boolean[] field1878 = new boolean[8];

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Le;")
    public static class191 field1881 = class54.method368("Weiter", 2047);

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Le;")
    public static class191 field1880 = field1879;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
    public static void method716(int arg0) {
        field1881 = null;
        field1880 = null;
        field1878 = null;
        field1879 = null;
        int var1 = 12 / (-arg0 / 35);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    public class112(byte[] arg0) {
        this.field1876 = arg0;
    }
}
