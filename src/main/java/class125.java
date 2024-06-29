import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class125 extends class15 {

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
    public static int[] field1535;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V", line = 6)
    public static void method596(byte arg0) {
        field1535 = null;
        if (arg0 < 49) {
            method598((byte) 25, 1.1918416603738935D);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lws;I)Ljava/lang/String;", line = 16)
    public static final String method597(class158 arg0, int arg1) {
        field1536++;
        if (arg1 >= -67) {
            method598((byte) -12, 0.13709246740372263D);
        }
        return arg0.field1874 == null || arg0.field1874.length() <= 0 ? arg0.field1885 : arg0.field1885 + class417.field6012.method205((byte) 100, class68.field849) + arg0.field1874;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BD)V", line = 31)
    public static final void method598(byte arg0, double arg1) {
        field1537++;
        if (arg0 != 4) {
            field1535 = null;
        }
        if (class162.field1956 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class22.field300[var3] = var4 > 255 ? 255 : var4;
        }
        class162.field1956 = arg1;
    }
}
