import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class134 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "Ljava/lang/String;")
    public String field1907;

    @OriginalMember(owner = "client!ho", name = "f", descriptor = "J")
    public long field1909;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!ho", name = "g", descriptor = "Ljava/lang/String;")
    public String field1910;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "I")
    public int field1906;

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "Lgo;")
    public static class581 field1905 = new class581(15, 0, 1, 0);

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "Llh;")
    public static class487 field1908 = new class487(64, 8);

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 16)
    public class134(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field1907 = arg1;
        this.field1909 = arg4;
        this.field1904 = arg2;
        this.field1910 = arg3;
        this.field1906 = arg0;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V", line = 29)
    public static void method942(int arg0) {
        field1908 = null;
        if (arg0 == 0) {
            field1905 = null;
        }
    }
}
