import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class176 implements class318 {

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lpa;")
    public class648 field1962;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field1970;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ldba;")
    public class240 field1965;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public int field1973;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "S")
    public static short field1963 = 320;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field1966 = -1;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lcq;")
    public static class110 field1974 = new class110(100, -1);

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Lib;", line = 6)
    public class14 method203(byte arg0) {
        if (arg0 != -92) {
            this.field1971 = -71;
        }
        field1964++;
        return null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V", line = 39)
    public static void method1069(byte arg0) {
        field1974 = null;
        if (arg0 < 5) {
            method1069((byte) 22);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Ldba;Lpa;IIIIIII)V", line = 48)
    public class176(class240 arg0, class648 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1972 = arg4;
        this.field1962 = arg1;
        this.field1970 = arg3;
        this.field1968 = arg8;
        this.field1967 = arg2;
        this.field1971 = arg5;
        this.field1965 = arg0;
        this.field1973 = arg6;
        this.field1969 = arg7;
    }
}
