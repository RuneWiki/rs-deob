import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class158 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "B")
    public byte field1979;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "S")
    public short field1983;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lav;")
    public class437 field1981;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "B")
    public byte field1982;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1055(int arg0, int arg1, byte arg2) {
        field1984++;
        if (arg2 > -3) {
            field1980 = 121;
        }
        return (arg0 & 0x60000) != 0 | class524.method2990(arg0, arg1, (byte) 90) || class4.method25(-1, arg1, arg0) || class68.method408(arg1, (byte) 41, arg0);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lav;III)V")
    public class158(class437 arg0, int arg1, int arg2, int arg3) {
        this.field1979 = (byte) arg3;
        this.field1983 = (short) arg1;
        this.field1981 = arg0;
        this.field1982 = (byte) arg2;
    }
}
