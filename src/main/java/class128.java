import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class128 extends class160 {

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
    public static volatile boolean field1917 = false;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "[I")
    public static int[] field1916 = new int[4];

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1915 = null;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "Lnf;")
    public static class162 field1913 = new class162(30);

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method953(byte arg0) {
        field1913 = null;
        field1915 = null;
        field1916 = null;
        if (arg0 > -40) {
            method954(true, 37);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V")
    public static final void method954(boolean arg0, int arg1) {
        class49.field806.method1166((byte) 23, arg1);
        if (!arg0) {
            field1914++;
        }
    }
}
