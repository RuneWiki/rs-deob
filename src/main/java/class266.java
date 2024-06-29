import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class266 extends class499 {

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "[B")
    public byte[] field3509;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "[F")
    public static float[] field3512 = new float[4];

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "Lcu;")
    public static class145 field3511 = new class145(10, 3);

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3513 = "";

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIB)I")
    public static final int method1598(int arg0, int arg1, byte arg2) {
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        int var4 = 48 / ((arg2 + 35) / 59);
        field3508++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method1599(int arg0) {
        field3512 = null;
        field3513 = null;
        if (arg0 == -28274) {
            field3511 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "([B)V")
    public class266(byte[] arg0) {
        this.field3509 = arg0;
    }
}
