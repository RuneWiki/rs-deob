import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class401 {

    @OriginalMember(owner = "client!im", name = "c", descriptor = "F")
    public static float field5376 = 1.0F;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Lcu;")
    public static class145 field5375 = new class145(67, 2);

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Ljp;")
    public static class236 field5380 = new class236(8);

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public int field5377;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public int field5378;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public int field5379;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "Ljk;")
    public static class446 field5381;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method2330(int arg0, int arg1, int arg2) {
        field5374++;
        return (class117.field1677[1][arg1][arg0] & arg2) != 0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 29)
    public static void method2331(int arg0) {
        field5380 = null;
        field5375 = null;
        field5381 = null;
        if (arg0 != 0) {
            method2331(-2);
        }
    }
}
