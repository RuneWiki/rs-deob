import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class134 extends class45 {

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "Ljava/lang/String;")
    public String field1871;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field1867 = 64;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field1868 = 0;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field1870 = 0;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "[I")
    public static int[] field1872 = new int[14];

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "[I")
    public static int[] field1873 = new int[6];

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public static final void method842(int arg0, int arg1) {
        if (arg1 == -25113) {
            field1869++;
            class263 var2 = class47.method337(14, 0, arg0);
            var2.method1806(false);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V")
    public static void method843(int arg0) {
        field1873 = null;
        if (arg0 == 6) {
            field1872 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V")
    public static final void method844(byte arg0, int arg1) {
        if (arg0 < 26) {
            method844((byte) 105, -78);
        }
        field1866++;
        class135.field1874 = -1;
        if (arg1 == 37) {
            class293.field4179 = 3.0F;
        } else if (arg1 == 50) {
            class293.field4179 = 4.0F;
        } else if (arg1 == 75) {
            class293.field4179 = 6.0F;
        } else if (arg1 == 100) {
            class293.field4179 = 8.0F;
        } else if (arg1 == 200) {
            class293.field4179 = 16.0F;
        }
        class135.field1874 = -1;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
    public class134() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class134(String arg0) {
        this.field1871 = arg0;
    }
}
